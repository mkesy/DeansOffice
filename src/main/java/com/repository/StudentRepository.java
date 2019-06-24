package com.repository;

/**
 * Created by Mikolaj on 26.02.2017.
 */
import com.model.Student;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface StudentRepository extends CrudRepository<Student, Long> {

}