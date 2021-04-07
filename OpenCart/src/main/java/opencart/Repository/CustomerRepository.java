package opencart.Repository;

import opencart.Model.Customer;

import java.util.Collection;

public interface CustomerRepository {
    Customer findByAccountNameAndPassword(String accountName, String password);

    Collection<Customer> findCustomerByName(String customerName);

    Customer findCustomerByID(Integer ID);

    Customer findCustomerAccount(String accountName);

    Collection<Customer> findAllCustomer();

    void addCustomer(Customer customer);

    void saveInfo(Customer customer);
}
