package com.niit.ecommerce.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.niit.ecommerce.dao.ProductDAO;
import com.niit.ecommerce.model.Product;

@Controller
public class ProductController {

	@Autowired
	private ProductDAO dao;
	
	@GetMapping("/display-products")
	public String productPage(Model model) {
		
		
		List<Product> productList = dao.findAll();
		model.addAttribute("list", productList);
		return "products";
	}
	
		@GetMapping("/product-page")
		public String addProductform(Model model) {
			
			model.addAttribute("product", new Product());
			return "addProduct";
		}
		
		@PostMapping("/add-product")
		public String addProductPage(@ModelAttribute("product") Product p,HttpServletRequest request) {
			dao.addProduct(p);
			
			MultipartFile image = p.getImage();
			String rootDirectory = request.getSession().getServletContext().getRealPath("/");
			Path path = Paths.get(rootDirectory+ "/resources/images/" + p.getId() + ".png");
			System.out.println("image path : "+path);
			if(image != null && !image.isEmpty()) {
				
				try {
					image.transferTo(new File(path.toString()));
				} catch (IllegalStateException e) {
					
					
					e.printStackTrace();
				} catch (IOException e) {
					
					
					e.printStackTrace();
				}
			}
			return "redirect:/display-products";
		}
		
		@GetMapping("/delete/{id}")
		public String deleteProduct(@PathVariable("id")int productId) {
			
			Product product = dao.getProductById(productId);
			dao.deleteProduct(product);
			
			return "redirect:/display-products";
		}
		
		@GetMapping("/update/{id}")
		public String updateProductForm(@PathVariable("id")int productId, Model model) {
			
			Product product = dao.getProductById(productId);
			model.addAttribute("product", product);
			
			return "updateProduct";
		}
		
		@PostMapping("/update-product")
		public String UpdateProduct(@ModelAttribute("product") Product p) {
			dao.updateProduct(p);
			return "redirect:/display-products";
		
		}
	
}
