<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript">
    function doAjax(id) {
        $.ajax({
            type: "GET",
            url: "/myapp/listinfo",
            data: "id="+id,
            success: function(response){
            var n = $('#student_table tr').length;
                if(  n > 1){
                    $('#student_table tr:last').remove();
                }

                response = JSON.parse(response);
                var trHTML='';
                    trHTML += '<tr><td>'+response.lastName+'</td><td>'+response.firstName+'</td><td>'+response.userName+'</td></tr>';
                $('#student_table').append(trHTML);
            },
            error: function(xhr,ajaxOptions,thrownError){
            alert(xhr.status);
            alert(thrownError);
            alert(xhr.responseText);
            }
            });
            }
</script>
</head>
<body>
    <c:set var="index" value="1"/>
    <c:forEach var="student" items="${students}">
        <c:out value="${index}"/><div id="${index}" onclick="doAjax('${student.studentId}')"><c:out value = "${student.lastName}"/> <c:out value="${student.firstName}"/></br></div>
        <c:set var="index" value="${index+1}"/>
        </br>
    </c:forEach>
     <div id="student"></div>
    <table id="student_table" border = '1'>
    <tr>
        <th>Last Name</th>
        <th>First Name</th>
        <th>UserName</th>
    </tr>
    </table>

</body>
</html>