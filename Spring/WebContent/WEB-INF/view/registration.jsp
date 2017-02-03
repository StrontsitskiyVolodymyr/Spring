<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
<link href="http://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">


</head>
<body>
	<h1>re: ${message}</h1>
	<div class="row">
		<form class="col s12">
			<div class="row">
				<div class="input-field col s6">
					<input placeholder="Placeholder" id="first_name" type="text"
						class="validate"> <label for="first_name">First
						Name</label>
				</div>
				<div class="input-field col s6">
					<input id="last_name" type="text" class="validate"> <label
						for="last_name">Last Name</label>
				</div>
			</div>
			<div class="row">
				<div class="input-field col s12">
					<input disabled value="I am not editable" id="disabled" type="text"
						class="validate"> <label for="disabled">Disabled</label>
				</div>
			</div>
			<div class="row">
				<div class="input-field col s12">
					<input id="password" type="password" class="validate"> <label
						for="password">Password</label>
				</div>
			</div>
			<div class="row">
				<div class="input-field col s12">
					<input id="email" type="email" class="validate"> <label
						for="email">Email</label>
				</div>
			</div>
			<div class="row">
				<div class="col s12">
					This is an inline input field:
					<div class="input-field inline">
						<input id="email" type="email" class="validate"> <label
							for="email" data-error="wrong" data-success="right">Email</label>
					</div>
				</div>
			</div>
		</form>
	</div>
	</body>
</html>