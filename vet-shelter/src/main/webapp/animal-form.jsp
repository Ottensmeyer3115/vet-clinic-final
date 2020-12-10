<%@ include file ="header.jsp" %>

	<div class="container">
		
		<h1>Animal Form</h1>
		
		<div class="card-body">
			<%-- Conditionally display information based on the forms purpose --%>
			<% String formAction = "update"; %>
			
			<%-- -<c:if test="${animal != null || animal.isEmpty()} ">
				<h2>Update Animal</h2>
			</c:if>
			
			<c:if test="${animal == null || animal.isEmpty()} ">
				<h2>Add new animal</h2>
				<% formAction = "insert"; %>
			</c:if>
			--%>
	
			<c:choose>
				<c:when test="${not empty animal}">
					<h2>Update Animal</h2>
				</c:when>
				
				<c:otherwise>
					<h2>Add new animal</h2>
					<% formAction = "insert"; %>
				</c:otherwise>
			</c:choose>
	
			<form action = "<%= formAction %>" method="post">
		<%-- hidden input we can use to pass in a value we want --%>
		<c:if test="${animal != null} ">
				<input type="hidden" name="id" value="<c:out value='${animal.id}'/>" />
		</c:if>
				<%-- Item fields that are Visible --%>
			
			<input type="hidden" name="shelter_id" value="<c:out value='${animal.id}'/>" />
				
			<fieldset class="form-group">		
				<label>Name</label>
				<input type="text" value="<c:out value='${animal.name}'/>"
				class="form-control" name ="name" required/>
			</fieldset>
				
			<fieldset class="form-group">
				<label>Type</label>
				<input type="text" value="<c:out value='${animal.type}'/>"
				class="form-control" name ="type" required/>
			</fieldset>
				
			<fieldset class="form-group">
				<label>Breed</label>
				<input type="text" value="<c:out value='${animal.breed}'/>"
				class="form-control" name ="breed" required/>
			</fieldset>
				
			<fieldset class="form-group">
				<label>Gender</label>
				<input type="text" value="<c:out value='${animal.gender}'/>"
				class="form-control" name ="gender" required/>
			</fieldset>
			
			 <div class="form-group">
				  <label>Select Shelter From List:</label>
				  <select class="form-control" name="shelter">
					    <option value="1">MiVet Animal shelter</option>
					    <option value="2">Broadway Veterinary shelter</option>
					    <option value="3">Hobart Animal shelter</option>
					    <option value="4">Akron Veterinary shelter</option>
					    <option value="5">Carolina Crossing Veterinary shelter</option>
					    <option value="6">Carrboro Plaza Veterinary shelter</option>
				  </select>
			</div>
				
			<button type="submit" class="btn btn-success">Save</button>
		</form>
			
		</div>

	</div>
	
<%@ include file ="footer.jsp" %>
