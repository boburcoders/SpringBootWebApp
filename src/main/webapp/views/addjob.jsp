<!DOCTYPE html>
<html>
<head>
    <title>Add Job</title>
</head>
<body>
<h1>Add Job Page</h1>
<form action="/handleForm" method="post">
    <div class="mb-3">
        <label for="title" class="form-label">Job Title</label>
        <input type="text" class="form-control" id="title" name="title">
    </div>
    <div class="mb-3">
        <label for="description" class="form-label">Description</label>
        <input type="text" class="form-control" id="description" name="description">
    </div>
    <div class="mb-3">
        <label for="location" class="form-label">Location</label>
        <input type="text" class="form-control" id="location" name="location">
    </div>
    <div class="mb-3">
        <label for="status" class="form-label">Status</label>
        <input type="text" class="form-control" id="status" name="status">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
<a href="/">
    <button class="button">
        Back to home
    </button>
</a>
</body>
</html>
