package be.intec.vision.basket.mappers;


import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;

import io.jsonwebtoken.*;

import java.util.Date;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.Claims;
import org.springframework.stereotype.Service;

/*
    It is a bean that demonstrates how to create and decode JWTs.
 */
@Service
public class JWTMapper {

	// The secret key. This should be in a property file NOT under source
	// control and not hard coded in real life. We're putting it here for
	// simplicity.
	// secret for testing purposes: intec-vision
	private final String SECRET_KEY = "eyJhbGciOiJIUzI1NiJ9.eyJSb2xlIjoiQWRtaW4iLCJJc3N1ZXIiOiJJbnRlYyBWaXNpb24iLCJVc2VybmFtZSI6ImludGVjIiwiUHJvZHVjdCI6IjFxMnczZTRyIiwiQmFza2V0IjoiMTIzNCIsImV4cCI6MTY0NzU1NzUzOCwiaWF0IjoxNjQ3NTU3NTM4LCJTZXNzaW9uIjoicXdlcnR5In0.UXKtBsBj4YNIQGWnizxd0JXZzKiw5Jguf8uQPSsrEKI\n";


	//Sample method to construct a JWT
	public String encodeJWT( String id, String issuer, String subject, long ttlMillis ) {

		//The JWT signature algorithm we will be using to sign the token
		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

		long nowMillis = System.currentTimeMillis();
		Date now = new Date( nowMillis );

		//We will sign our JWT with our ApiKey secret
		byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary( SECRET_KEY );
		Key signingKey = new SecretKeySpec( apiKeySecretBytes, signatureAlgorithm.getJcaName() );

		//Let's set the JWT Claims
		JwtBuilder builder = Jwts.builder().setId( id )
				.setIssuedAt( now )
				.setSubject( subject )
				.setIssuer( issuer )
				.signWith( signatureAlgorithm, signingKey );

		//if it has been specified, let's add the expiration
		if ( ttlMillis >= 0 ) {
			long expMillis = nowMillis + ttlMillis;
			Date exp = new Date( expMillis );
			builder.setExpiration( exp );
		}

		//Builds the JWT and serializes it to a compact, URL-safe string
		return builder.compact();
	}


	public Claims decodeJWT( String jwt ) {

		//This line will throw an exception if it is not a signed JWS (as expected)
		return Jwts.parser()
				.setSigningKey( DatatypeConverter.parseBase64Binary( SECRET_KEY ) )
				.parseClaimsJws( jwt ).getBody();
	}

}