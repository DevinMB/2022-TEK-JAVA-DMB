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
    <div>
        <div>Here are all the courses wow I like Thymleaf more</div>

        <table>
               <c:forEach items="${courses}" var="course">
                   <tr>
                       <td>${course.id}</td>
                       <td>${course.name}</td>
                   </tr>
               </c:forEach>
           </table>
    </div>
</body>

</html>