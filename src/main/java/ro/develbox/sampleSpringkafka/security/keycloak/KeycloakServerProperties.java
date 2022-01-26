package ro.develbox.sampleSpringkafka.security.keycloak;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "keycloak.server")
public class KeycloakServerProperties {
    String contextPath = "/auth";
    String realmImportFile = "develbox-realm.json";
    AdminUser adminUser = new AdminUser();
 
    @Data
    public static class AdminUser {
        String username = "admin";
        String password = "admin";       
    }
}
