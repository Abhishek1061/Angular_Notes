package com.litimindtree.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.litimindtree.librarymanagement.entity.Author;



@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

select s from student s where s.name LIKE :'name%'
 
    @Query("select s from Author s where s.department.name = :name order by s.name desc")
    p

select s from student s where s.age between :startAge and :endAge
 

select s from student s where s.age < :age
 

select s from student s where s.name LIKE ':%name'
    
}
