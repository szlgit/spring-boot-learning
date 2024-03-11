package top.szl.springbootconfig.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Data
@Component
public class Dog {
    @Value("${person.dog.name}")
    private String name;

    @Value("${person.dog.age}")
    private Integer age;
}



