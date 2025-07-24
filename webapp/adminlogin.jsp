<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Admin Login</title>
  <style>
    * {
      box-sizing: border-box;
    }

    body {
      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
      background: linear-gradient(to right, #56ab2f, #a8e063);
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      margin: 0;
      padding: 20px;
    }

    .login-container {
      background-color: #fff;
      padding: 40px 30px;
      border-radius: 12px;
      box-shadow: 0 8px 24px rgba(0, 0, 0, 0.2);
      width: 100%;
      max-width: 400px;
      text-align: center;
    }

    .login-container h2 {
      margin-bottom: 16px;
      color: #333;
    }

    .login-container hr {
      margin: 15px 0;
      border: none;
      height: 1px;
      background-color: #ddd;
    }

    .login-container label {
      display: block;
      text-align: left;
      margin: 12px 0 6px;
      font-weight: 500;
      color: #333;
    }

    .login-container input[type="text"],
    .login-container input[type="password"] {
      width: 100%;
      padding: 12px;
      border: 1px solid #ccc;
      border-radius: 8px;
      font-size: 14px;
      transition: border-color 0.3s ease;
    }

    .login-container input:focus {
      border-color: #56ab2f;
      outline: none;
    }

    .login-container button {
      margin-top: 20px;
      width: 100%;
      padding: 12px;
      background-color: #56ab2f;
      border: none;
      color: white;
      font-size: 16px;
      font-weight: bold;
      border-radius: 8px;
      cursor: pointer;
      transition: background-color 0.3s ease;
    }

    .login-container button:hover {
      background-color: #4e9f2d;
    }

    @media (max-width: 500px) {
      .login-container {
        padding: 30px 20px;
      }

      .login-container h2 {
        font-size: 20px;
      }
    }
  </style>
</head>
<body>

  <div class="login-container">
    <h2>Welcome to Admin Login</h2>
    <hr />

    <%@ include file="messageBox/printMessage.jsp" %>

    <hr />

    <form action="AdminLogin" method="post">
      <label for="username">Username:</label>
      <input type="text" id="username" name="username" placeholder="Enter your Username" required />

      <label for="password">Password:</label>
      <input type="password" id="password" name="password" placeholder="Enter your Password" required />

      <button type="submit">LOGIN</button>
    </form>
  </div>

</body>
</html>
