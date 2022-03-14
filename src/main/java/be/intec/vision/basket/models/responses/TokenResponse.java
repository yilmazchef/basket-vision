package be.intec.vision.basket.models.responses;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
public class TokenResponse {

	String tokenId;

	String hashValue;

	LocalDateTime createdAt;

	LocalDateTime updatedAt;

	Boolean active = Boolean.TRUE;

}
