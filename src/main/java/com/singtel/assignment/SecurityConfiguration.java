package com.singtel.assignment;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableWebSecurity
public class SecurityConfiguration {

    @Configuration
    @EnableResourceServer
    public static class SsoSecurity extends WebSecurityConfigurerAdapter {
        @Override
        public void configure(WebSecurity web) throws Exception {
            web.ignoring().antMatchers("/v2/api-docs", "/configuration/ui",
                    "/swagger-resources", "/swagger-ui.html", "/animal/api/v1/*");
        }
    }
}
