package com.webops.jenkins.spring

import com.webops.jenkins.spring.config.GitHubProperties
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.groovy.template.GroovyTemplateAutoConfiguration
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.yaml.snakeyaml.Yaml

@Configuration
@EnableAutoConfiguration(exclude = [ GroovyTemplateAutoConfiguration.class])
@EnableConfigurationProperties(GitHubProperties.class)
@ComponentScan(['com.webops.jenkins.spring', 'com.webops.jenkins.spring.config'])
@SpringBootApplication
public class Meow {
  final Map<String, String> DEFAULT_PROPS = [
    'spring.config.location' : 'resources',
    'spring.application.name': 'meow',
    'spring.main.banner-mode' : 'off',
    'spring.config.name'     : 'application,${spring.application.name}'
  ]

  void main(String[] args) {
     new SpringApplication(Meow.class)
        .run(args);
  }

}
