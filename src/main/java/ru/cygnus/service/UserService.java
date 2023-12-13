package ru.cygnus.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.cygnus.model.User;
import ru.cygnus.repository.UserRepository;

import java.util.List;

@Service
@Transactional
public class UserService {

    private final UserRepository usersRepository;

    @Autowired
    public UserService(UserRepository peopleRepository) {
        this.usersRepository = peopleRepository;
    }

    public List<User> getAll() {
        return usersRepository.findAll();
    }

    public void save(User user) {
        usersRepository.save(user);
    }

    public void delete(int id) {
        usersRepository.deleteById(id);
    }

    public void update(Long id, User updatedUser) {
        updatedUser.setId(id);
        usersRepository.save(updatedUser);
    }
}
