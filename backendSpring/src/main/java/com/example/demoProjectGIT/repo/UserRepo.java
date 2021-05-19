package com.example.demoProjectGIT.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoProjectGIT.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
 
}
