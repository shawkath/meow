package com.webops.jenkins.spring

import com.webops.jenkins.spring.config.GitHubProperties
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateAutoConfiguration
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationPropertiesImportSelector
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.autoconfigure.web.*

@Configuration
@EnableAutoConfiguration(exclude = [ WebMvcAutoConfiguration.class, WebClientAutoConfiguration.class,
    HttpMessageConvertersAutoConfiguration.class, GroovyTemplateAutoConfiguration.class])
@EnableConfigurationProperties(GitHubProperties.class)
@ComponentScan(['com.webops.jenkins.spring', 'com.webops.jenkins.spring.config'])
public class Meow {
  final Map<String, String> DEFAULT_PROPS = [
    'spring.config.location' : 'resources',
    'spring.application.name': 'meow',
    'spring.config.name'     : 'default,${spring.application.name}'
  ]

  void main(String[] args) {
     new SpringApplicationBuilder(Meow.class)
        .web(false)
        .properties(DEFAULT_PROPS)
        .run(args);
    println "started: ${System.getProperty('user.home')} "
  }

  //@Override
 // SpringApplicationBuilder configure(SpringApplicationBuilder application) {
 //   application.properties(DEFAULT_PROPS).sources(Main)
 // }

}
