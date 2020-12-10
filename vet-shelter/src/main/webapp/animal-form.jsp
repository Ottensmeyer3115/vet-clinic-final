<%@ include file ="header.jsp" %>

	<div class="container">
		
		<h1>Animal Form</h1>
		
		<div class="card-body">
			<%-- Conditionally display information based on the forms purpose --%>
			<c:if test="${ animals != null} ">
				<form action="update" method="post">
				
			</c:if>
			
			<c:if test="${ animals == null} ">
				<form action="insert" method="post">
				
			</c:if>
		<%-- hidden input we can use to pass in a value we want --%>
		<c:if test="${animals != null} ">
				<input type="hidden" name="id" value="<c:out value='${animals.animal_id}'/>" />
				</c:if>
				<%-- Item fields that are Visible --%>
				
				<fieldset class="form-group">
				<label>Name</label>
				<input type="text value="<c:out value='${animals.animal_name}'/>"
				class="form-control" name ="item" required/>
				</fieldset>
				
				<fieldset class="form-group">
				<label>Type</label>
				<input type="text value="<c:out value='${animals.animal_type}'/>"
				class="form-control" name ="qty" required/>
				</fieldset>
				
				<fieldset class="form-group">
				<label>Description</label>
				<input type="text value="<c:out value='${animal.animal_breed}'/>"
				class="form-control" name ="description" required/>
				</fieldset>
				
			<fieldset class="form-group">
				<label>Description</label>
				<input type="text value="<c:out value='${animals.animal_gender}'/>"
				class="form-control" name ="description" required/>
				</fieldset>
				
				<fieldset class="form-group">
				<label>Description</label>
				<input type="text value="<c:out value='${animal.customer_id}'/>"
				class="form-control" name ="description" required/>
				</fieldset>
				
				<fieldset class="form-group">
				<label>Description</label>
				<input type="text value="<c:out value='${animals.shelter_id}'/>"
				class="form-control" name ="description" required/>
				</fieldset>
			<button type="submit " class="btn btn-success">Save</button>
		</form>
			
		</div>

	</div>
	
<%@ include file ="footer.jsp" %>
