package be.intec.vision.basket.models.documents;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
@Document ( value = "medias" )
public class MediaDocument {

	public enum Type {
		PNG, JPG, BMP, GIF, // IMAGES
		MP4, AVI, MKV,  // VIDEOS
		STL, OBJ // 3D OBJECTS
	}


	@MongoId
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
