package ro.develbox.sampleSpringkafka.config.openapi;

import java.util.Arrays;

import org.springdoc.core.customizers.OpenApiCustomiser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.media.StringSchema;
import io.swagger.v3.oas.models.parameters.HeaderParameter;
import io.swagger.v3.oas.models.parameters.Parameter;
import io.swagger.v3.oas.models.security.OAuthFlow;
import io.swagger.v3.oas.models.security.OAuthFlows;
import io.swagger.v3.oas.models.security.Scopes;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class OpenApi3Config {

	private String authServer;
	private String realm;

	@Autowired
	public OpenApi3Config(@Value("${keycloak.auth-server-url}") String authServer,
			@Value("${keycloak.realm}") String realm) {
		this.authServer = authServer;
		this.realm = realm;
	}

	@Bean
	public OpenAPI openAPI() {
		String authUrl = String.format("%s/realms/%s/protocol/openid-connect", this.authServer, this.realm);
		
		return new OpenAPI()
				.components(new Components()
						.addSecuritySchemes("security_auth",
								new SecurityScheme().type(SecurityScheme.Type.OAUTH2).description("Oauth")
										.flows(new OAuthFlows().implicit(new OAuthFlow()
												.authorizationUrl(authUrl + "/auth").refreshUrl(authUrl + "/token")
												.tokenUrl(authUrl + "/token").scopes(new Scopes()))))
						
						)
				.security(Arrays.asList(new SecurityRequirement().addList("security_auth")))
				.info(new Info().title("Your API").description("Your API").version("0.1a").contact(new Contact()
						.name("Example Inc").url("https://www.example.com/").email("developer@example.com")));
	}

	//can be used to customize
//	@Bean
//	public OpenApiCustomiser openApiCustomiser() {
//		return openApi -> openApi.getPaths().values().stream().flatMap(pathItem -> pathItem.readOperations().stream())
//				.forEach(operation -> operation
//						.addParametersItem(new HeaderParameter().$ref("#/components/parameters/Version")));
//	}
}