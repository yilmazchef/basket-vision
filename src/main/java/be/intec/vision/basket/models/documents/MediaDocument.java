package be.intec.vision.basket.models.documents;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.Objects;

@Data
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
@Document ( value = "medias" )
public class MediaDocument {

	public enum Type {
		PNG, JPG, BMP, GIF, JPEG, JFIF, EXIF, TIFF, WEBP, HDR, HEIF, BAT, // IMAGES
		MP4, AVI, MKV, MOV, WMV, AVCHD, FLV, F4V, SWF, WEBM, MPEG,MPG, MP2, MPE, MPV, OGG, QT,   // VIDEOS
		STL, OBJ, MF, DS, MAX, COLLADA, VRML, X3D, STEP, FBX   // 3D OBJECTS
	}


	@MongoId
	String id;

	Type type=Type.PNG;

	String title;

	String altText;

	String width;

	String height;

	String url;

	Boolean isExternal=Boolean.FALSE;

	Boolean active = Boolean.TRUE;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof MediaDocument)) return false;
		MediaDocument that = (MediaDocument) o;
		return Objects.equals(getId(), that.getId()) && getUrl().equals(that.getUrl());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getUrl());
	}

	@Override
	public String toString() {
		return this.getTitle() + this.getUrl() ;
	}
}
