package be.intec.vision.basket.models.documents;


import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor ( force = true, access = AccessLevel.PUBLIC )
@FieldDefaults ( level = AccessLevel.PRIVATE )
@Entity
public class MediaDocument implements Serializable {

	public enum Type {
		PNG, JPG, BMP, GIF, JPEG, JFIF, EXIF, TIFF, WEBP, HDR, HEIF, BAT, // IMAGES
		MP4, AVI, MKV, MOV, WMV, AVCHD, FLV, F4V, SWF, WEBM, MPEG,MPG, MP2, MPE, MPV, OGG, QT,   // VIDEOS
		STL, OBJ, MF, DS, MAX, COLLADA, VRML, X3D, STEP, FBX   // 3D OBJECTS
	}


	@Id
	Long id;

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
