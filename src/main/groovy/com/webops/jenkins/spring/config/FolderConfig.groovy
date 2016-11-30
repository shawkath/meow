package com.webops.jenkins.spring.config

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
//import javaposse.jobdsl.dsl.DslFactory.*

@Configuration
@ConditionalOnProperty('project.enabled')
@EnableConfigurationProperties(FolderProperties)
class FolderConfig {

  @Bean
  void createFolder(FolderProperties folderProperties) {
    println "meow"
    folder("${folderProperties.name}") {
      //primaryView(folderProperties.primaryView)
    }
  }
}
