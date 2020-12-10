 <%@ include file="header.jsp" %>

<div class= "container">
	<h1>Animal List</h1>
	<br/>
	<br/>
	
	<table class= "table table-striped">
		
		<thead>
			<tr>
				<th scope="col">Name</th>
				<th scope="col">Type</th>
				<th scope="col">Breed</th>
				<th scope="col">Gender</th>
				<th scope="col">ID</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var="animal" items= "${allAnimals}">
				<tr>
				<td>
					<c:out value= "${ animal.animal_name}" />
				</td>
				
				<td>
					<c:out value= "${ animal.animal_type }" />
				</td>
				
				<td>
					<c:out value= "${ animal.breed }" />
				</td>
				
				<td>
					<c:out value= "${ animal.gender }" />
				</td>
				
				
				<td>
					<a href= "edit?id=<c:out value='${ animal.name }' />">
						<button class= "btn btn-primary">Give away for Adoption</button>
					</a>&nbsp;&nbsp;&nbsp;&nbsp;
					
					<a href= "delete?id=<c:out value='${ animal.name }' />">
						<button class= "btn btn-primary">Adopt</button>
					</a>
				</td>
				</tr>
				
			</c:forEach>
		</tbody>
		
	</table>
</div>

<%@ include file="footer.jsp" %>