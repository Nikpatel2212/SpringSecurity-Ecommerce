package com.example.MainResources;

import javax.ws.rs.HttpMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;




@SuppressWarnings("deprecation")
@Configuration
@EnableWebMvcSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter  {
	
	@Autowired
    private UserDetailsService userDetailsService;

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/", "/welcome/**").permitAll()
                .antMatchers("/", "/ADMNwelcome99").hasAuthority("ADMIN")
                .antMatchers("/", "/EcommSign").permitAll()
                .antMatchers("/", "/EcommAdminLoginHere").permitAll()
                .antMatchers("/", "/help1").permitAll()
                .antMatchers("/", "/contact1").hasAuthority("USER")
                .antMatchers(HttpMethod.POST, "/newUser").permitAll()
                .anyRequest().authenticated()
                .and()
           .authorizeRequests()
                .antMatchers("/", "/**/css/**").permitAll()
                .antMatchers("/", "/js/**").permitAll()
                .antMatchers("/", "/images/**").permitAll()
                .antMatchers("/", "/fonts/**").permitAll()
                .antMatchers("/", "/**/AdminCSS/**").permitAll()
                .antMatchers("/", "/AdminJS/**").permitAll()
                .antMatchers("/", "/**/AdminImages/**").permitAll()
                .antMatchers("/", "/AdminFonts/**").permitAll()
                .antMatchers("/", "/WorkingJS/**").permitAll()
                .anyRequest().permitAll()
                .and()
            .formLogin()
                .loginPage("/login1")
                .defaultSuccessUrl("/welcome")
                .permitAll()
                .and()
            .logout()
            	.logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login1")
                .and()
            .csrf().disable()
            .exceptionHandling()
            	.accessDeniedPage("/Error403");
	}
	
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
    }
	
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//            .inMemoryAuthentication()
//                .withUser("user").password("password").roles("USER");
//        auth
//        	.inMemoryAuthentication()  
//        		.withUser("user").password("password123").roles("Admin");
//    }

}
