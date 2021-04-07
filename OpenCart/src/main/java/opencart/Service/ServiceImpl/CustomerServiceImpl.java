package opencart.Service.ServiceImpl;

import opencart.Model.Customer;
import opencart.Repository.CustomerRepository;
import opencart.Service.ServiceInt.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    @Transactional
    public Collection<Customer> findCustomerByName(String name) {
        return customerRepository.findCustomerByName(name);
    }

    @Override
    @Transactional
    public Customer findCustomerByID(Integer ID) {
        return customerRepository.findCustomerByID(ID);
    }

    @Override
    @Transactional
    public Collection<Customer> showAllCustomer() {
        return customerRepository.findAllCustomer();
    }

    @Override
    @Transactional
    public Customer findCustomerByAccountAndPassword(String account, String password) {
        return customerRepository.findByAccountNameAndPassword(account, password);
    }

    @Override
    @Transactional
    public void addCustomer(Customer customer) {
        customerRepository.addCustomer(customer);
    }

    @Override
    @Transactional
    public void saveUserInfo(Customer customer) {
        customerRepository.saveInfo(customer);
    }
}
