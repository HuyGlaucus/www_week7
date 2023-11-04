package vn.edu.iuh.fit.backend.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RestController;
import vn.edu.iuh.fit.backend.models.Product;
import vn.edu.iuh.fit.backend.services.ProductServices;
@RestController("/api/vi")
public class ProductResources {
    @Autowired
    private ProductResources services;
}