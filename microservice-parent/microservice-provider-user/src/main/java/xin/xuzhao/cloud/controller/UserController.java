package xin.xuzhao.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xin.xuzhao.cloud.entity.User;
import xin.xuzhao.cloud.repository.UserRepository;

/**
 * @Author: xuzhao
 * @Email: mailto:contact@xuzhao.xin
 * @Description:
 * @Time: 2018/8/21 13:38
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/simple/{id}")
    public User findById(@PathVariable("id") Long id) {
        return this.userRepository.getOne(id);
    }
}
