
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>khach hang</title>
    <style>
        table{
            width: 100%;

            border-collapse: collapse;


        }
        form{
            width: 42%;
            box-shadow: 0 19px 38px rgba(0,0,0,0.30), 0 15px 12px rgba(0,0,0,0.22);
            margin: 0 auto;
            padding-bottom: 2px;
            padding-top: 20px;
        }
        caption {
            font-size: 22px;
            font-weight: bold;
        }
        table.th,td,tr{
            border-bottom: 1px solid #ececec;
            border-right: none;
            border-left: none;
        }
        th{
            text-align: left;
            padding: 10px;
        }
        td{
            padding: 10px;

        }
        img.imgkhachang{
            width: 40px;
        }
    </style>
</head>
<body>
<form action="">
    <table>
        <caption>Danh sách khách hàng</caption>
        <tr>
            <th> Tên </th>
            <th> Ngày Sinh </th>
            <th> Địa Chỉ </th>
            <th> Ảnh </th>
        </tr>
        <c:forEach items="${requestScope['listCustomer']}" var="customer" >
        <tr>
            <td> ${customer.getTen()} </td>
            <td> ${customer.getNgaysinh()}</td>
            <td> ${customer.getDiachi()}</td>
            <td> ${customer.getAnh()}</td>
        </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
