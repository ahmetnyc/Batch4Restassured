
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;


public class POSTBook {
    String BaseURI = RestAssured.baseURI = "https://simple-books-api.glitch.me/";

    String bookId = commonMethod.firstAvailableBook();
    @Test
    void POSTBookCRUD(){
      //  RequestSpecification request = given()
       //         .header("authorization",token)
        //        .header("content-type","application/json")
       //         .body()
    }
}
