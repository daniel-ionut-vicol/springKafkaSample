package ro.develbox.sampleSpringkafka.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        .headers()
        .frameOptions()
        .sameOrigin()
        .and()
        .cors()
            .and()
              .authorizeRequests()
              .antMatchers("/auth").permitAll()
              .antMatchers("/auth/**").permitAll()
              .antMatchers(HttpMethod.GET, "/user/info", "/api/foos/**")
              .hasAuthority("SCOPE_read")
                .antMatchers(HttpMethod.GET, "/user/info", "/api/foos/**")
                  .hasAuthority("SCOPE_read")
                .antMatchers(HttpMethod.POST, "/api/foos")
                  .hasAuthority("SCOPE_write")
                .anyRequest()
                  .authenticated()
            .and()
              .oauth2ResourceServer()
                .jwt();
    }
}
