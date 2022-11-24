package com.tutojpa.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

//extending the repository student so it is able to use  

public interface StudentRepository extends JpaRepository<Student , Long>{

}
