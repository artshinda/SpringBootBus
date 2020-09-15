package com.bcaf.ivan.FinalProject.Util;

import com.bcaf.ivan.FinalProject.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileDao extends JpaRepository<User, String> {
    @Query(nativeQuery = true, value = "SELECT ta.* FROM tb_user ta WHERE ta.id =:id")
    User findProfileByUserId(@Param("id") String id);
}