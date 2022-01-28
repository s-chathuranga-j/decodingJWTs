import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;

public class DecodeJWT
{
    static String encodedJWT = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";

    public static void main(String[] args) {
        DecodedJWT decodedJWT = JWT.decode(encodedJWT); //decoding encoded JWT
        String name = decodedJWT.getClaim("name").asString(); //read the JWT payload data using the key name
        System.out.println(name);
    }
}
