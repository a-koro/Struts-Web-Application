<%--
  Created by IntelliJ IDEA.
  User: korov
  Date: 2/7/2021
  Time: 5:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Passenger Check-in</title>
</head>
<body>
    <html:form action="/hello">
        <html:text property="surname" />
        <html:text property="PNR" />
        <html:submit />

        <hr/>
        <html:errors />
    </html:form>
</body>
</html>
