package be.intec.vision.basket.models.documents;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
@Document ( value = "media_document" )
public class MediaDocument {

	public enum Type {
		PNG, JPG, BMP, GIF, // IMAGES
		MP4, AVI, MKV,  // VIDEOS
		STL, OBJ // 3D OBJECTS
	}


	@Id
	String mediaId;

	Type type;

	String title;

	String altText;

	String width;

	String height;

	String url;

	Boolean isExternal;

	Boolean active = Boolean.TRUE;

}
