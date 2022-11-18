<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Add Course</title>
</head>

<body>

    <h1>Create a new course</h1>
    <form  method="post" action="/course">
        Course Name:  <input type="text" name="courseName"">
        <br>
        Instructor Name: <input type="text" name="instructorName"">
        <br>
        <button type="submit">Submit</button>
    </form>

    <p>${insert_status}</p>

</body>

</html>