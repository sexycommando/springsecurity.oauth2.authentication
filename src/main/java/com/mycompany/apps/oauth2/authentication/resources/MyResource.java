package com.mycompany.apps.oauth2.authentication.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/MyResource")
public class MyResource {

    @GET
    @Path("/createInfo")
    public String createInfo() {
        return "\n\tProtected Resource(createInfo) Accessed !!!! Returning from Myresource createInfo";
    }

    @GET
    @Path("/getMyInfo")
    public String getMyInfo() {
        return "\n\tProtected Resource(getMyInfo) Accessed !!!! Returning from Myresource getMyInfo";
    }

    @GET
    @Path("/updateInfo")
    public String updateMyInfo() {
        return "\n\tProtected Resource(updateInfo) Accessed !!!! Returning from Myresource updateInfo";
    }

}
