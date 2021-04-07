package opencart.Service.ServiceImpl;

import opencart.Model.Cart;
import opencart.Model.Product;
import opencart.Repository.CartRepository;
import opencart.Service.ServiceInt.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;

    @Autowired
    public CartServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    @Transactional
    public Collection<Cart> findCartByName(String name) {
        return cartRepository.findCartByName(name);
    }

    @Override
    @Transactional
    public Cart findCartByID(Integer ID) {
        return cartRepository.findCartByID(ID);
    }

    @Override
    @Transactional
    public Double checkOutCart() {
        return cartRepository.checkOut();
    }

    @Override
    @Transactional
    public Collection<Product> showProductByCart(Integer ID) {
        return cartRepository.findAllProduct(ID);
    }

    @Override
    @Transactional
    public void addProductToWishList(Integer productID, Integer customerID) {
        cartRepository.addProduct(productID, customerID);
    }

    @Override
    @Transactional
    public void removeProductFromCart(Product product) {
        cartRepository.removeProductInCart(product);
    }

    @Override
    @Transactional
    public Product findProductByID(Integer ID) {
        return cartRepository.findProductById(ID);
    }

    @Override
    @Transactional
    public void addToCart(Integer productID, Integer customerID) {
        cartRepository.addProduct(productID, customerID);
    }

    @Override
    @Transactional
    public void initCart(Integer ID) {
        cartRepository.initCart(ID);
    }

    @Override
    @Transactional
    public void clear(Integer ID) {
        cartRepository.clear(ID);
    }

}
