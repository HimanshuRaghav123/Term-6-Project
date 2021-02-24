<%@ include file="header.jsp" %>
<h2>Product Page</h2>
<hr>
<div style="float: right;" ><a href="product-page">Add Product</a></div>
<br>
<br>
<table class="table table-striped">
	<tr>
		<th>Product id</th>
		<th>Name</th>
		<th>Price</th>
		<th>Quantity</th>
		<th>Manifacturing Date</th>
		<th>Expire Date</th>
		<th>Description</th>
		<th>Product Image</th>
		<th>Product Action</th>
	</tr>
	
	<c:forEach var ="product" items="${list }">
	<tr>
		<td>${product.id }</td>
		<td>${product.name }</td>
		<td>${product.price }</td>
		<td>${product.quantity }</td>
		<td>${product.mfg }</td>
		<td>${product.expireDate }</td>
		<td>${product.description }</td>
		<td><img src="<c:url value='/resources/images/${product.id }.png' />"class="rounded-circle" height="50px" width="50px"/></td>	
		<td>
			<a href="<c:url value='/update/${product.id }' />	" >Update</a> |
			<a href="<c:url value='/delete/${product.id }' />" >Delete</a>	
			
				
		</td>
		</tr>								
	</c:forEach>
	

</table>

</body>
</html>