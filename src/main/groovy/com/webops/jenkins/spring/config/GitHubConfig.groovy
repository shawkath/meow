package com.webops.jenkins.spring.config

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.validation.Valid

@Configuration
@ConditionalOnProperty('github.baseUrl')
@EnableConfigurationProperties(GitHubProperties)
class GitHubConfig {

  @Bean
  void setUp(@Valid GitHubProperties gitHubProperties) {
    println "Hello"
  }
}
