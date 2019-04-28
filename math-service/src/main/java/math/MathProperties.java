package math;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.util.Map;

@RefreshScope
@Data
@ConfigurationProperties(prefix = "math")
public class MathProperties {
    private Integer maxSections;
}
