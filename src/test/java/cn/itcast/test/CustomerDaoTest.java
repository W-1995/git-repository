package cn.itcast.test;

import cn.itcast.dao.CustomerDao;
import cn.itcast.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class CustomerDaoTest {

    @Autowired
    private CustomerDao customerDao;

    /**
     * 根据id查询
     */
    @Test
    public void testFindOne(){
        Customer one = customerDao.findOne(2l);
        System.out.println(one);
    }

    @Test
    public void testSave(){
        Customer customer = new Customer();

        customer.setCustName("黑马程序员");
        customer.setCustIndustry("it教育");
        customer.setCustLevel("vip");
        customerDao.save(customer);
    }

    @Test
    public void testUpdate(){
        Customer customer = new Customer();
        customer.setCustId(1l);
        customer.setCustName("黑马程序员");
        customer.setCustIndustry("it教育");
        customer.setCustLevel("vip");
        customerDao.save(customer);
    }

    @Test
    public void testDelelte(){
        customerDao.delete(3l);
    }

    @Test
    public void testFindAll(){
        List<Customer> all = customerDao.findAll();
        System.out.println(all);
    }

    @Test
    public void testCount(){
        long count = customerDao.count();
        System.out.println(count);
    }

    @Test
    public void testExists(){
        boolean exists = customerDao.exists(3l);
        System.out.println(exists);
    }


}
