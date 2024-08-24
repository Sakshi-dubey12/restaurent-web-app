<!DOCTYPE html>
<html>
<head>
    <title>Create Portfolio</title>
</head>
<body>
    <h1>Create Your Portfolio</h1>
    <form action="PortfolioServlet" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>

        <label for="about">About:</label>
        <textarea id="about" name="about" required></textarea><br><br>

        <label for="skills">Skills:</label>
        <textarea id="skills" name="skills" required></textarea><br><br>

        <label for="projects">Projects:</label>
        <textarea id="projects" name="projects" required></textarea><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
