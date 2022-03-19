package be.intec.vision.basket.models.requests;


import be.intec.vision.basket.models.responses.MediaResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


import java.io.Serializable;

@Data
@NoArgsConstructor(force = true, access = AccessLevel.PUBLIC)
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MediaRequest implements Serializable {

    public enum Type {
        PNG, JPG, BMP, GIF, JPEG, JFIF, EXIF, TIFF, WEBP, HDR, HEIF, BAT, // IMAGES
        MP4, AVI, MKV, MOV, WMV, AVCHD, FLV, F4V, SWF, WEBM, MPEG,MPG, MP2, MPE, MPV, OGG, QT,   // VIDEOS
        STL, OBJ, MF, DS, MAX, COLLADA, VRML, X3D, STEP, FBX   // 3D OBJECTS
    }

    Type type ;

    String title;

    String url;


    public void setUrl(String url) {

        String fe = "";
        int i = url.lastIndexOf('.');
        if (i > 0) {
            fe = url.substring(i + 1);
            this.type = Type.valueOf(fe.toUpperCase());
        }
        this.url = url;
    }


}
