package neo.springBootRest.springrestclientexamples.service;

import neo.springBootRest.api.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}
