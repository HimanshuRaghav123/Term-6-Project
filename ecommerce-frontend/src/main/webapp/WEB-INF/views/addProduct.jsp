<%@ include file="header.jsp" %>
<div class="container">
<h2>Product Page</h2>
<form action="add-product" modelAttribute="product" method="post" enctype="multipart/form-data">
 <div class="form-group">
    <label for="name">Product Name:</label>
    <input type="text" name="name" class="form-control" placeholder="Enter Product Name" id="name">
  </div>
  <div class="form-group">
    <label for="price">Price:</label>
    <input type="number" name="price" class="form-control" placeholder="Enter Price Here" id="price">
  </div>
  <div class="form-group">
    <label for="quantity">Quantity:</label>
    <input type="number" name="quantity" class="form-control" placeholder="Enter Quantity Here" id="quantity">
  </div> 
  <div class="form-group">
    <label for="mfg">MFG Date:</label>
    <input type="date" name="mfg" class="form-control" placeholder="Enter MFG Here" id="mfg">
  </div> 
  <div class="form-group">
    <label for="expireDate">ExpireDate:</label>
    <input type="date" name="expireDate" class="form-control" placeholder="Enter ExpireDate Here" id="expireDate">
  </div>
  <div class="form-group">
    <label for="description">Description:</label>
    <input type="text" name="description" class="form-control" placeholder="Enter Description Here" id="description">
  </div>
  
  <div class="form-group">
    <label for="image">Product Image:</label>
    <input type="file" name="image" class="form-control" id="image">
  </div>  
     
  <button type="submit" class="btn btn-success">Add Product</button>
</form>
</div>
</body>
</html>