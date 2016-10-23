<%@ page import="java.util.*" %>

<h1 align="center">MoneyCalcSelect jsp</h1>
<form method="POST"
	action="AddPeople.do">
	Add People<p>
	Name:
	<select name="name" size="1">
		<option value="light"> light </option>
		<option value="amber"> amber </option>
		<option value="brown"> brown </option>
		<option value="dark"> dark </option>
	</select>
	<br><br>
	
	
	Cash:
	<select name="cash" size="1">
		<option value=1> 1 </option>
		<option value=100> 100 </option>
	
	</select>
	<br><br>

	<center>
		<input type="SUBMIT">
	</center>
</form>
 <div style="position: relative">
            <p style="position: fixed; bottom: 0; width:100%; text-align: center"> Created by ord4k
            </p>
        </div>