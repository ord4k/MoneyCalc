

<html>
<body>
<h1 align="center">result</h1>
<p>

<%= ((com.example.model.ListofPeople) request.getAttribute("listP")).getPeople(0).getName() %>
<%= ((com.example.model.ListofPeople) request.getAttribute("listP")).getPeople(0).getCash() %>

</body>
</html>
