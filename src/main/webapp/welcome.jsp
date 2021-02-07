<%--
  Created by IntelliJ IDEA.
  User: korov
  Date: 2/7/2021
  Time: 6:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello and Welcome</title>
</head>
<body>
    Welcome <bean:write name="helloForm" property="surname" /> to mobile Check-in
</body>
</html>
