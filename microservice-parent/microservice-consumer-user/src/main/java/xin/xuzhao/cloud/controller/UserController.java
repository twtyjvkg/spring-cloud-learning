package xin.xuzhao.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xin.xuzhao.cloud.entity.User;

/**
 * @Author: xuzhao
 * @Email: mailto:contact@xuzhao.xin
 * @Description:
 * @Time: 2018/8/21 14:44
 */
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("user/{id}")
    public User findById(@PathVariable("id") Long id) {
        return this.restTemplate.getForObject("http://localhost:8080/simple/" + id, User.class);
    }
}
