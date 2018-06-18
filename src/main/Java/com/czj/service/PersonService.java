package com.czj.service;

import com.czj.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    Person person;
    public PersonService(){
        System.out.println("PersonService Constructor...\n\n\n\n\n\n");
    }

    public void save(){
        System.out.println("save");
    }

    /**
     * 自我介绍
     */
    public void introduce(){
        System.out.println("您好，我叫"+person.getName()+"今年"+person.getAge()+"岁！");
    }
}
