package cn.itcast.test;

import cn.itcast.dao.CustomerDao;
import cn.itcast.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class JpqlTest {

    @Autowired
    private CustomerDao customerDao;

    @Test
    public void testFindJpql(){
        Customer customer = customerDao.findJpql("黑马程序员");
        System.out.println(customer);

        System.out.println("修改内容");
    }

    @Test
    @Transactional
    @Rollback(value = false)
    public void udpateCustomer(){
        customerDao.updateCustomer(2l,"黑马高手");
    }
}
