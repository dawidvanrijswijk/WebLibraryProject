<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
</head>
<body>
<table class="table table-striped">
    <thead>
    <tr>
        <th>#</th>
        <th>Title</th>
        <th>ISBN</th>
        <th>Author</th>
        <th>Type</th>
        <th>Release</th>
        <th>Pages</th>
        <th>Borrower</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="book" items="${requestScope.books}" varStatus="loop">
        <tr>
            <th scope="row">${loop.index + 1}</th>
            <td>${book.title}</td>
            <td>${book.isbn}</td>
            <td>${book.authorName}</td>
            <td>${book.category}</td>
            <td>${book.release}</td>
            <td>${book.pages}</td>
            <td>${not empty book.borrowerName ? book.borrowerName : '-'}</td>
            <td><input>class="from-check-input" type="radio" name="bookId" value="$(book.id)" checked></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
