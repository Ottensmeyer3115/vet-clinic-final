<%@ include file = "header.jsp" %>

<div class="container">
	<h1>Pet List</h1>
	<br/>
	<br/>
	
	<table class="table table-striped">
		
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Name</th>
				<th scope="col">Type</th>
				<th scope="col">Breed</th>
				<th scope="col">Gender</th>
				<th scope="col">Shelter</th>
				<th scope="col">Owner</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var="product" items="${allAnimals}">
			<tr>
				<td>
					<c:out value="${animals.animal_id} "/>
					
				</td>
				<td>
					<c:out value="${animals.animal_id} "/>
					
				</td>
				<td>
					<c:out value="${animals.animal_id} "/>
					
				</td>
				<td>
					<c:out value="${animals.animal_id} "/>
					
				</td>
				<td>
					<a href="edit?id=<c:out value='${ animals.animal_id}'/>">
					<button class="btn btn-primary">Search</button>
					</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>

	</table>
</div>
<%@ include file= "footer.jsp"%>