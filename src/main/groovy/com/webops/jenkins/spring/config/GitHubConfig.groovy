package com.webops.jenkins.spring.config

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
@ConditionalOnProperty('github.enabled')
@EnableConfigurationProperties(GitHubProperties)
class GitHubConfig {

  @Bean
  static main(GitHubProperties gitHubProperties) {
    println "${gitHubProperties.baseUrl}"
    println "${gitHubProperties.accessToken}"
  }
}
