package fpt.edu.sp26se041.hcmcg10admissionconsultationplatformbe.requests;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LoginRequest {
    String email;
    String name;
    String avatar;
}
