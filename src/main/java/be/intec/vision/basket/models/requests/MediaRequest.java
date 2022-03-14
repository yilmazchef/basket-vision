package be.intec.vision.basket.models.requests;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
@JsonIgnoreProperties ( ignoreUnknown = true )
public class MediaRequest {

	String mediaId;

	public enum Type {
		PNG, JPG, BMP, GIF, // IMAGES
		MP4, AVI, MKV,  // VIDEOS
		STL, OBJ // 3D OBJECTS
	}


	String title;

	Type type;

	String altText;

	String width;

	String height;

	String url;

	Boolean isExternal;

}
