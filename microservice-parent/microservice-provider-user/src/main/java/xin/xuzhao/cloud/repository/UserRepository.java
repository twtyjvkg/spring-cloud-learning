package xin.xuzhao.cloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xin.xuzhao.cloud.entity.User;

/**
 * @Author: xuzhao
 * @Email: mailto:contact@xuzhao.xin
 * @Description:
 * @Time: 2018/8/21 11:21
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
