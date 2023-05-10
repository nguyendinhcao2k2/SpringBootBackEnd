package com.example.backend;

import com.example.backend.entity.User;
import com.example.backend.repository.UserRepository;
import com.example.backend.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author caodinh
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUser {

    @MockBean
    UserRepository todoRepository;

    @Autowired
    private UserService service;

    @Before
    public void setUp() {
        Mockito.when(todoRepository.findAll())
                .thenReturn(IntStream.range(0, 10)
                        .mapToObj(i -> new User(null,"US" + i,"HT" +i,"em"+i,"img" + i,null))
                        .collect(Collectors.toList()));


    }

    @Test
    public void testCount() {
        Assert.assertEquals(10, service.countUser());
    }
}
