<%@page language="java" isELIgnored="false" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" %>
<%@page import="com.company.SpringBootWebProject.model.Jobs" %>
<!DOCTYPE html>
<html>
<head>
    <title>Success Page</title>
</head>
<body>
<div class="button-container">
    <h1>Job Added</h1>
    <%--    <%Jobs myJob = (Jobs) request.getAttribute("jobPost");%>--%>
    <p>${jobPost.getTitle()}</p>
    <p>${jobPost.getDescription()}</p>
    <p>${jobPost.getLocation()}</p>
    <p>${jobPost.getStatus()}</p>
    <a href="/">
        <button class="button">
            Back to Home
        </button>
    </a>

</div>
</body>
</html>
