package top.szl.springbootconfig.entity;

import jdk.jfr.DataAmount;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Data
@Component
@Validated
//@ConfigurationProperties(prefix = "family")
public class Family {

    @Value("${family.family-name}")
    private String familyName;

    @Value("${family.father}")
    private String father;

    @Value("${family.mother}")
    private String mother;

    @Value("${family.child}")
    private String child;





}
