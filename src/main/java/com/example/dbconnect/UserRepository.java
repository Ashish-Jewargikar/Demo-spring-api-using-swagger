package com.example.dbconnect;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Integer>{
//first part in <> : with whom to connect(Entity),what is datatype of primary key
}
