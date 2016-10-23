<%@ page import="java.util.*" %>

<h1 align="center">MoneyCalc page </h1>
<p>

<%
	PeopleofList listP = (PeopleofList)request.getAttribute("listP");
	out.print(listP.printPeople());
	%>
	
</body>
</html>