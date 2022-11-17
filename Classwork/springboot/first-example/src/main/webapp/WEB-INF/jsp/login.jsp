<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/login-register.css" >
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,400;1,400;1,500;1,700&display=swap');
    </style>
    <title>Login</title>
</head>

<body class="gradient-custom">

    <div class="login_container">

        <div class="logo">
            <img src="images/Optimized-image.png" alt="login-logo">
        </div>
        <!-- Bootstrap Login Card -->
        <div class="login_card card-body p-5 text-center">

            <!-- login form -->
            <form onsubmit="login(event)" class="mb-md-3 mt-md-4 pb-1">
                <h2 class="fw-bold mb-2 ">Login</h2>
                <p class="text-black-50 mb-2">Please enter your login and password!</p>

                <input type="email" id="email_input" class="form-control form-control-lg" />
                <label class="form-label text-black-50">Email</label>

                <input type="password" id="password_input" class="form-control form-control-lg" />
                <label class="form-label text-black-50 mb-3">Password</label>
                <br>



                <button class="btn btn-outline-success btn-lg px-5" type="submit">Login</button>
            </form>

            <div>
                <p class="mb-0 text-black-50">Don't have an account?
                    <a href="register.html" class="text-dark-50 fw-bold" id="sign_up">Sign Up</a>
                </p>
            </div>



        </div>
    </div>

    <script>
        // document.addEventListener("submit", login(event));
        function login(event) {
            event.preventDefault();
            let username = document.getElementById("email_input");
            let password = document.getElementById("password_input");

            console.log(username.value);
            console.log(password.value);

            window.location.replace("welcome.html");

        }


    </script>

</body>

</html>