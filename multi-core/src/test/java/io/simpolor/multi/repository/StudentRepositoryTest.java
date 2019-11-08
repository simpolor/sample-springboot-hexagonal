package io.simpolor.multi.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void testCount() {

        // when
        long result = studentRepository.count();


        // then
        Assert.assertNotNull(result);
        Assert.assertEquals(2, result);


        // print
        System.out.println("count : "+result);
    }
}
