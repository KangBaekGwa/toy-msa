package BaekGwa.userservice.vo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Greeting {
    @Value("${gretting.message}")
    private String message;
}
