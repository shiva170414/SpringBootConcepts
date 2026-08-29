<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }

        .form-container {
            width: 400px;
            margin: 50px auto;
            padding: 25px;
            background-color: white;
            border-radius: 10px;
            box-shadow: 0 0 10px gray;
        }

        h2 {
            text-align: center;
            color: #333;
        }

        label {
            display: block;
            margin-top: 15px;
            margin-bottom: 5px;
            font-weight: bold;
        }

        input {
            width: 100%;
            padding: 10px;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        input:focus {
            border-color: #007bff;
            outline: none;
        }

        button {
            width: 100%;
            padding: 10px;
            margin-top: 20px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
        }

        button:hover {
            background-color: #0056b3;
        }
    </style>
    </head>
    
<body>
  <div class="form-container">

        <h2>Student Form</h2>

        <form action="submitForm" method="post">

            <label for="studentName">Student Name</label>
            <input type="text" id="studentName" name="name"
                   placeholder="Enter student name" required>

            <label for="rollNumber">Roll Number</label>
            <input type="text" id="rollNumber" name="roll"
                   placeholder="Enter roll number" required>

            <label for="email">Email</label>
            <input type="email" id="email" name="email"
                   placeholder="Enter email" required>

            <label for="phone">Phone Number</label>
            <input type="tel" id="phone" name="phone"
                   placeholder="Enter phone number" required>

            <button type="submit">Submit</button>

        </form>

    </div>
</body>
</html>