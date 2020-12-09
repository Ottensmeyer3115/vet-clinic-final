<%@ include file= "header.jsp" %>

	<div class= "container">
		<h1>Product Form</h1>
		
		<div class= "card-body">
			<%-- Conditionally display information based on the form's purpose --%>
			
			<c:if test= "${ clinic != null }">
				<form action= "update" method= "post">
			</c:if>
			
			<c:if test= "${ clinic == null }">
				<form action= "insert" method= "post">
			</c:if>
			
			<%-- Hidden input we can use to pass in a value we want --%>
			<c:if test= "${ clinic != null }">
				<input type="hidden" name= "id" value= "<c:out value= '${ clinic.clinic_id }'/>" />
			</c:if>
			
			<%-- Item fields that are Visible --%>
			<fieldset class= "form-group">		
				<label>Animal</label>
				<input type= "text" value= "<c:out value= '${ animal.animal_name }'/>"
					class= "form-control" name= "item" required />					
			</fieldset>
			
			<fieldset class= "form-group">		
				<label>Quantity</label>
				<input type= "number" value= "<c:out value= '${ animal.animal_type }'/>"
					class= "form-control" name= "qty" required />					
			</fieldset>
			
			<fieldset class= "form-group">		
				<label>Breed</label>
				<input type= "text" value= "<c:out value= '${ animal.animal_breed }'/>"
					class= "form-control" name= "description" required />					
			</fieldset>
			
			<button type= "submit" class= "btn btn-success">Save</button>
			
			</form>		
			
		</div>
	</div>

<%@ include file= "footer.jsp" %>