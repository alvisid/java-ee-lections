<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 21.10.2019
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Title</title>
</head>
<body>
<form action="calc" method="GET">
    <table border="0">
        <tbody>
        <tr>
            <td>Первое число:</td>
            <td><input type="text" name="firstNum" value=""></td>
        </tr>
        <tr>
            <td>Второе число:</td>
            <td><input type="text" name="secondNum" value=""/></td>
        </tr>
        <tr>
            <td>Операция:</td>
            <td>
                <select name="oper">
                    <option value="1">Сложение</option>
                    <option value="2">Вычитание</option>
                    <option value="3">Деление</option>
                    <option value="4">Умножение</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Вперед!"></td>
        </tr>
        </tbody>
    </table>
</form>
</body>
</html>
