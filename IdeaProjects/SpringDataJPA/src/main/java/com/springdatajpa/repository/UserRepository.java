package com.springdatajpa.repository;

import com.springdatajpa.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

    //custome finder methods/ derived query methods
//    we don't have to write query only prototype of function we have to write
    Iterable<User> findByName(String name);

    Iterable<User> findByNameLike(String name);

    Iterable<User> findByNameStartingWith(String prefix);
    Iterable<User> findByNameEndingWith(String suffix);
    Iterable<User> findByNameContaining(String words);

//    JPQL select query
    @Query("select u from User u")
    Iterable<User> getAllUser();

    //jpql update query
    //when you are using the jpql which change the state of db that's how it's done
    @Transactional //enable transaction
    @Modifying // tell that is an update query
    @Query("update User u set u.city=:c where u.id=:i")
    void updateCity(@Param("c") String city, @Param("i") int id);

    //jpql delete query
    @Transactional
    @Modifying
    @Query("delete User u where u.city=:c")
    void deleteByCity(@Param("c") String city);

    //executing native query
    @Query(value="select * from user", nativeQuery = true)
    List<User> nativeGetAll();
}
