package main;

/**
 * Created by Mikolaj on 26.02.2017.
 */
import org.springframework.data.repository.CrudRepository;

import main.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

}