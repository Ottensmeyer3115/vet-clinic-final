<%@ include file = "header.jsp" %>

<div class="container">
	<h1>Product List</h1>
	<br/>
	<br/>
	
	<table class="table table-striped">
		
		<thead>
			<tr>
				<th>#</th>
				<th>Name</th>
				<th>Type</th>
				<th>Breed</th>
				<th>Gender</th>
				<th>Shelter</th>
				<th>Owner</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var="product" items="${allAnimals}">
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
				<a href="edit?id=<c:out value='${ animals.animal_id}'/>">
					<button class="btn btn-primary">Search</button>
			</c:forEach>
		</tbody>

	</table>
</div>
<%@ include file= "footer.jsp"%>