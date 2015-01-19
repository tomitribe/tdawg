/**
 * Created by Tomitribe WadlToJava code generator
**/
package com.wm.foo;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import com.tomitribe.tribestream.governance.api.ApplicationLimit;
import com.tomitribe.tribestream.governance.api.Concurrent;
import com.tomitribe.tribestream.governance.api.GovernanceUnit;
import com.tomitribe.tribestream.governance.api.Rate;
import com.tomitribe.wadlx.api.Category;
import com.tomitribe.wadlx.api.Description;
import com.tomitribe.wadlx.api.ErrorMapping;
import com.tomitribe.wadlx.api.ErrorMappings;
import com.tomitribe.wadlx.api.See;
import com.tomitribe.wadlx.api.Tag;

@Singleton
@Lock(LockType.READ)
@Path("/load")
public class LoadRest {

    @POST
    @Path("/")
    @Category({"Sample"})
    @Tag({"Seed","Movies","Sample data"})
    @See(href = "endpoint/Movie/GET/movies/", format = "html", value = "GET /movies")
    @ApplicationLimit(rate = @Rate(window = 1, unit = GovernanceUnit.DAYS, limit = 1),concurrent = @Concurrent(limit = 1))
    @RolesAllowed({ "movies-admin" })
    @Description("Seeds the database with 7 example movies. This endpoint does not return any values. Movies can be retrieved from the database using the GET /movies resource.")
    public void load() {
        // TODO
    }

}