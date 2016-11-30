package com.webops.jenkins.spring.config

import groovy.util.logging.Slf4j
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import com.webops.jenkins.spring.config.GitHubProperties
import javax.validation.Valid

@Slf4j
@Configuration
@EnableConfigurationProperties(GitHubProperties)
class GitHubConfig {

  static main(GitHubProperties gitHubProperties) {
    log.info "Hello: ${gitHubProperties.baseUrl}"
    log.info "Hello: ${gitHubProperties.accessToken}"
  }
}
