package com.webops.jenkins.spring

import groovy.transform.Canonical
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.NestedConfigurationProperty

@Canonical
@ConfigurationProperties
class SpringConfigurationProperties {
  static class SpinnakerProperties {
    @Canonical
    static class JedisProperties {
      String prefix = 'igor'
    }

    @NestedConfigurationProperty
    final JedisProperties jedis = new JedisProperties()

    @Canonical
    static class BuildProperties {
      int pollInterval = 60
    }

    @NestedConfigurationProperty
    final BuildProperties build = new BuildProperties()
  }

  @NestedConfigurationProperty
  final SpinnakerProperties spinnaker = new SpinnakerProperties()

  @Canonical
  static class RedisProperties {
    String connection = "redis://localhost:6379"
    int timeout = 2000
  }

  @NestedConfigurationProperty
  final RedisProperties redis = new RedisProperties()

  @Canonical
  static class ClientProperties {
    int timeout = 30000
  }

  @NestedConfigurationProperty
  final ClientProperties client = new ClientProperties()

  @Canonical
  static class ServicesProperties {
    @Canonical
    static class ServiceConfiguration {
      String baseUrl
    }

    @NestedConfigurationProperty
    final ServiceConfiguration clouddriver = new ServiceConfiguration()
    @NestedConfigurationProperty
    final ServiceConfiguration echo = new ServiceConfiguration()
  }

  @NestedConfigurationProperty
  final ServicesProperties services = new ServicesProperties()
}
