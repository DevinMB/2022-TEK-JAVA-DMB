<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Login</title>
</head>

<body>
    <h1>Devins Index Page</h1>
    <form method="get" action="/">
        Search On Course Name :
        <input type="text" name="course" value="${course}">
        <br>
        Search On Instructor Name :
        <input type="text" name="instructor" value="${instructor}">


        <button type="submit">Search</button>
    </form>

    <br>
    <br>

    <div>
        <table>
               <c:forEach items="${courses}" var="course">
                   <tr>
                       <td>${course.id}</td>
                       <td>${course.name}</td>
                       <td>${course.instructorName}</td>
                   </tr>
               </c:forEach>
        </table>
    </div>
</body>

</html>