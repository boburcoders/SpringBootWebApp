<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>View All Jobs</title>
</head>
<body>
<h1>View All Jobs Page</h1>
<c:forEach var="job" items="${jobs}">
    <div>
        <p>${job.title}</p>
        <p>${job.description}</p>
    </div>
</c:forEach>

<a href="/">
    <button class="button">
        Back to home
    </button>
</a>
</body>
</html>
