package com.bogdan.app.DAO;

import com.bogdan.app.core.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import java.util.List;

/**
 * Created by bbaloi on 02.09.2015.
 */
public class StudentDAOimpl implements StudentDAO {
    @PersistenceUnit(unitName = "Student")
    private EntityManagerFactory entityManagerFactory;

    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public Student getStudentById(Integer id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        String Sql = "SELECT s from Student s WHERE s.studentId = :id";
        Student s = (Student) entityManager.createQuery(Sql).setParameter("id",id).getSingleResult();
        entityManager.close();
        return s;
    }

    public List<Student> getStudents() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        String Sql = "SELECT s from Student s";
        List<Student> students = entityManager.createQuery(Sql).getResultList();
        entityManager.close();
        return students;

    }
}
