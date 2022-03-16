package be.intec.vision.basket.models.responses;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@AllArgsConstructor
@FieldDefaults ( level = AccessLevel.PRIVATE )
@JsonIgnoreProperties ( ignoreUnknown = true )
public class MediaResponse {

	public enum Type {
		PNG, JPG, BMP, GIF, // IMAGES
		MP4, AVI, MKV,  // VIDEOS
		STL, OBJ // 3D OBJECTS
	}


	String id;

	Type type;

	String title;

	String altText;

	String width;

	String height;

	String url;

	Boolean isExternal;

	Boolean active = Boolean.TRUE;

}
