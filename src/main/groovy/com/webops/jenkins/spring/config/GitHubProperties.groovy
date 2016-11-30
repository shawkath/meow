package com.webops.jenkins.spring.config

import groovy.transform.Canonical
import groovy.transform.CompileStatic
//import org.hibernate.validator.constraints.NotEmpty
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.NestedConfigurationProperty
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

//import javax.validation.constraints.NotNull


/**
 * Helper class to map masters in properties file into a validated property map
 */
//@ConditionalOnProperty('github.baseUrl')
@Component
@ConfigurationProperties(prefix = 'github')
class GitHubProperties {

    //@Value("127.0.0.1")
    String baseUrl;

    //@NotEmpty
    String accessToken;

    //@NotNull
    Integer commitDisplayLength;

}
