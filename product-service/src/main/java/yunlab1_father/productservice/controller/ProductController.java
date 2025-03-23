package yunlab1_father.productservice.controller;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import yunlab1_father.productservice.mapper.ProductMapper;
import yunlab1_father.productservice.po.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
/**
 * 商品的服务控制层
 */
@AllArgsConstructor
@RestController
@Slf4j
public class ProductController {
    private final ProductMapper productMapper;
    /**
     * 根据商品id 查询商品
     */
    @GetMapping("/findByProductId/{productId}")
    public Product findByProductId(@PathVariable Long productId)  {
        Product product = productMapper.findByProductId(productId);
        // 测试熔断机制.在product-service 中的服务中加上延时，
        // 使服务响应时间超过设置的熔断阀值，这样就会激活熔断机制，进行熔断。
        // Thread.sleep(2000);
        log.info("-------------OK /findByProductId/{productId}--------------------");
        return product;
    }
    /**
     * 查询所有商品
     */
    @GetMapping("/queryAllProduct")
    public List<Product> findByProductId() {
        List<Product> productList = productMapper.queryAllProduct();
        log.info("-------------OK queryAllProduct--------------------");
        return productList;
    }
}