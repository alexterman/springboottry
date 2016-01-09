package xxx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xxx.components.JdbcExample;
import xxx.components.JpaDaoTest;
import xxx.repo.CustomerRepository;

/**
 * Created by alex on 1/8/16.
 */

@RestController
public class Hello {

    @Autowired
    private JdbcExample dao;
    @Autowired
    private JpaDaoTest jpa;

    @RequestMapping("/xxx")
    public String index() {

        try {
            dao.init();
        } catch (Exception e) {
            throw new RuntimeException("Error invoking DAO " ,e);
        }

        return "Greetings from Spring Boot!";
    }


    @RequestMapping("/yyy")
    public String jpaTest() {

        try {
            jpa.demo();
        } catch (Exception e) {
            throw new RuntimeException("Error invoking DAO " ,e);
        }

        return "Greetings from Spring Boot + JPA!";
    }
}
