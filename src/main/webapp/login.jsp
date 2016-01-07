<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
    <h1>Struts 2 Hello World Example</h1>
 
    <s:form action="Welcome">
        <s:textfield name="user.userName" label="Username" />
        <s:password name="user.password" label="Password" />
        <s:submit />
    </s:form>
 
</body>
</html>