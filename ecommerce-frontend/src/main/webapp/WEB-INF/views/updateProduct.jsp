<%@ include file="header.jsp" %>
<div class="container">
<h2>Product Page</h2>
<form action="<c:url value='/update-product' />" modelAttribute="product" method="post">
 <div class="form-group">
    <label for="name">Product Name:</label>
    <input type="text" name="name" class="form-control" value="${product.name }" id="name">
  </div>
  <div class="form-group">
    <label for="price">Price:</label>
    <input type="number" name="price" class="form-control" value="${product.price }" id="price">
  </div>
  <div class="form-group">
    <label for="quantity">Quantity:</label>
    <input type="number" name="quantity" class="form-control" value="${product.quantity }" id="quantity">
  </div> 
  <div class="form-group">
    <label for="mfg">MFG Date:</label>
    <input type="date" name="mfg" class="form-control" value="${product.mfg }" id="mfg">
  </div> 
  <div class="form-group">
    <label for="expireDate">ExpireDate:</label>
    <input type="date" name="expireDate" class="form-control" value="${product.expireDate }" id="expireDate">
  </div>
  <div class="form-group">
    <label for="description">Description:</label>
    <input type="text" name="description" class="form-control" value="${product.description }" id="description">
  </div>   
  <button type="submit" class="btn btn-info">Update Product</button>
</form>
</div>
</body>
</html>