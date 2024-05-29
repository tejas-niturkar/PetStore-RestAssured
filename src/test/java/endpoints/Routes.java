package endpoints;

/*

   Swagger URI -> https://petstore3.swagger.io/

   Create user (Post) : https://petstore3.swagger.io/api/v3/user
   Get user (Get) : https://petstore3.swagger.io/api/v3/user/{username}
   Update user (Put) :https://petstore3.swagger.io/api/v3/user/{username}
   Delete user (Delete):https://petstore3.swagger.io/api/v3/user/{username}

 */

public class Routes {

    public static String base_url =  "https://petstore3.swagger.io/api/v3";

    //user module
    public static String user_post_url = base_url+"/user";
    public static String user_get_url = base_url+"/user/{username}";
    public static String user_update_url = base_url+"/user/{username}";
    public static String user_delete_url = base_url+"/user/{username}";

    //To do - add more modules url's here


}
