package com.webops.jenkins.spring.config
//import groovy.transform.CompileStatic
//import org.hibernate.validator.constraints.NotEmpty
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

//import javax.validation.constraints.NotNull


/**
 * Helper class to map masters in properties file into a validated property map
 */
@Component
@ConfigurationProperties(prefix = 'project')
class FolderProperties {

    //@Value("127.0.0.1")
    String name;

    //@NotEmpty
    String primaryView;

}
