package com.webops.jenkins.spring.config

import groovy.transform.CompileStatic
import org.hibernate.validator.constraints.NotEmpty
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.context.properties.ConfigurationProperties

import javax.validation.constraints.NotNull

/**
 * Helper class to map masters in properties file into a validated property map
 */
@ConditionalOnProperty('github.baseUrl')
@CompileStatic
@ConfigurationProperties(prefix = 'github')
class GitHubProperties {
  @NotEmpty
  String baseUrl

  @NotEmpty
  String accessToken

  @NotNull
  Integer commitDisplayLength
}