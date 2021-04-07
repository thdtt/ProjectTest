package opencart.Repository.DataJPA;

import opencart.Model.Brand;
import opencart.Model.Product;
import opencart.Repository.BrandRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Collection;

@Repository
public class JPABrandRepositoryImpl implements BrandRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Collection<Brand> findBrandByName(String name) {
        return null;
    }

    @Override
    public Brand findBrandByID(int ID) {
        return null;
    }

    @Override
    public Collection<Product> removeProductFromBrand(int productID) {
        return null;
    }

    @Override
    public Collection<Product> addProductToBrand(Product product) {
        return null;
    }

    @Override
    public Collection<Product> showProductInBrand(Integer ID) {
        Query query = this.em.createNativeQuery("SELECT p.* FROM product p " +
                "INNER JOIN brand b ON p.brandId = b.brandId WHERE b.brandId = :ID", Product.class);
        query.setParameter("ID", ID);
        return query.getResultList();
    }

    @Override
    public Collection<Brand> showAll() {
        Query query = this.em.createNativeQuery("SELECT b.* FROM brand b", Brand.class);
//        query.executeUpdate();
        return query.getResultList();
    }
}
