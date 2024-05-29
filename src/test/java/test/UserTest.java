package test;
import com.github.javafaker.Faker;
import endpoints.UserEndpoints;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import payload.User;

// This class to specific to the user modules tests

public class UserTest {

    Faker faker ;
    User userPayload ;


    @BeforeClass
    public void setupData(){
        faker = new Faker();
        userPayload = new User();

        userPayload.setId(faker.idNumber().hashCode());
        userPayload.setUsername(faker.name().username());
        userPayload.setFirstname(faker.name().firstName());
        userPayload.setLastname(faker.name().lastName());
        userPayload.setEmail(faker.internet().safeEmailAddress());
        userPayload.setPassword(faker.internet().password(5,10));
        userPayload.setPhone(faker.phoneNumber().cellPhone());
    }

    @Test (priority = 1)
    public void testPostUser(){
      Response response = UserEndpoints.createUser(userPayload);
      response.then().log().all();
        Assert.assertEquals(response.statusCode(),200);
    }


}
