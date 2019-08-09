package demo.menucolumn.manage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

/**
 * Created by taesu on 2019-08-09.
 */
@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class EnableAuditConfiguration {

    @Bean
    public AuditorAware<Long> auditorAware() {
        return () -> Optional.of(1L);
    }
}