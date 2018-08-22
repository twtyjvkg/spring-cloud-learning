package xin.xuzhao.cloud.entity;

import java.math.BigDecimal;

/**
 * @Author: xuzhao
 * @Email: mailto:contact@xuzhao.xin
 * @Description:
 * @Time: 2018/8/21 14:46
 */
public class User {

    private Long id;
    private String username;
    private String name;
    private Short age;
    private BigDecimal balance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
