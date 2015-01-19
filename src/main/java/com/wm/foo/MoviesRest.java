/**
 * Created by Tomitribe WadlToJava code generator
**/
package com.wm.foo;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.persistence.EntityNotFoundException;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import com.tomitribe.tribestream.governance.api.Concurrent;
import com.tomitribe.tribestream.governance.api.GovernanceUnit;
import com.tomitribe.tribestream.governance.api.Rate;
import com.tomitribe.tribestream.governance.api.UserLimit;
import com.tomitribe.wadlx.api.ApiVersion;
import com.tomitribe.wadlx.api.Category;
import com.tomitribe.wadlx.api.Description;
import com.tomitribe.wadlx.api.Descriptions;
import com.tomitribe.wadlx.api.ErrorMapping;
import com.tomitribe.wadlx.api.ErrorMappings;
import com.tomitribe.wadlx.api.See;
import com.tomitribe.wadlx.api.Tag;

@Singleton
@Lock(LockType.READ)
@Path("/movies")
public class MoviesRest {

    @GET
    @Produces("application/json")
    @Path("/")
    @Category({"CRUD"})
    @ApiVersion({"1.0"})
    @Tag({"Read","Search","Movies"})
    @See(href = "endpoint/Movie/GET/movies/count", format = "html", value = "GET /movies/count")
    @UserLimit(rate = @Rate(window = 1, unit = GovernanceUnit.HOURS, limit = 10),concurrent = @Concurrent(limit = 5))
    @Description("Searches for movies in the database by field and search term. Results can be paginated using the <tt>first</tt> and <tt>max</tt> parameters. Use the the /movies/count resources to get the total number of matches for the search")
    public Movie getMovies(@QueryParam("first") final Integer first, @QueryParam("max") final Integer max, @QueryParam("field") final String field, @QueryParam("searchTerm") final String searchTerm) {
        Movie movieOutput = new Movie();
        movieOutput.setDirector("value");
        movieOutput.setGenre("value");
        movieOutput.setId(123);
        movieOutput.setRating(123);
        movieOutput.setTitle("value");
        movieOutput.setYear(123);

        return movieOutput;
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/")
    @Category({"CRUD"})
    @ApiVersion({"1.0"})
    @Tag({"Create","Add","Movies"})
    @UserLimit(rate = @Rate(window = 1, unit = GovernanceUnit.HOURS, limit = 10),concurrent = @Concurrent(limit = 5))
    @RolesAllowed({ "movies-admin" })
    @Description("Adds a new movie to the database. Returns the movie object passed in, with the ID assigned during the insert populated.")
    public Movie addMovie(Movie movie) {
        Movie movieOutput = new Movie();
        movieOutput.setDirector("value");
        movieOutput.setGenre("value");
        movieOutput.setId(123);
        movieOutput.setRating(123);
        movieOutput.setTitle("value");
        movieOutput.setYear(123);

        return movieOutput;
    }

    @GET
    @Produces("application/json")
    @Path("/count")
    @Category({"CRUD"})
    @ApiVersion({"1.0"})
    @Tag({"Read","Search","Count","Movies"})
    @See(href = "endpoint/Movie/GET/movies/", format = "html", value = "GET /movies")
    @UserLimit(rate = @Rate(window = 1, unit = GovernanceUnit.HOURS, limit = 100),concurrent = @Concurrent(limit = 5))
    @Description("Returns the number of movies in the database that match the search criteria. Can be used to provide count information for paginating search results provided by <tt>GET /movies</tt>")
    public int count(@QueryParam("field") final String field, @QueryParam("searchTerm") final String searchTerm) {
        return 123;
    }

    @DELETE
    @Path("/{id}")
    @Category({"CRUD"})
    @ApiVersion({"1.0"})
    @Tag({"Delete","Remove","Movies"})
    @UserLimit(rate = @Rate(window = 1, unit = GovernanceUnit.HOURS, limit = 10),concurrent = @Concurrent(limit = 5))
    @RolesAllowed({ "movies-admin" })
    @Description("Deletes the movie with the specified ID from the database")
    public void deleteMovie(@PathParam("id") final long id) {
        // TODO
    }

    @GET
    @Produces("application/json")
    @Path("/{id}")
    @ErrorMappings({
        @ErrorMapping(statusCode = 404, type = EntityNotFoundException.class, bodyResolver = "exceptionMessage", description = @Descriptions({
            @Description("When the movie entity can not be found in database.")
        }))
    })
    @Category({"CRUD"})
    @ApiVersion({"1.0"})
    @Tag({"Read","Search","Movies"})
    @UserLimit(rate = @Rate(window = 1, unit = GovernanceUnit.HOURS, limit = 100),concurrent = @Concurrent(limit = 5))
    @Description("Retrieves an individual movie from the database by ID, or returns a 404 response code if there is no movie found.")
    public Movie find(@PathParam("id") final long id) {
        Movie movieOutput = new Movie();
        movieOutput.setDirector("value");
        movieOutput.setGenre("value");
        movieOutput.setId(123);
        movieOutput.setRating(123);
        movieOutput.setTitle("value");
        movieOutput.setYear(123);

        return movieOutput;
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/{id}")
    @Category({"CRUD"})
    @ApiVersion({"1.0"})
    @Tag({"Edit","Update","Movies"})
    @UserLimit(rate = @Rate(window = 1, unit = GovernanceUnit.HOURS, limit = 10),concurrent = @Concurrent(limit = 5))
    @RolesAllowed({ "movies-admin" })
    @Description("Changes a movie in the database. Returns the altered movie object from the database")
    public Movie editMovie(Movie movie) {
        Movie movieOutput = new Movie();
        movieOutput.setDirector("value");
        movieOutput.setGenre("value");
        movieOutput.setId(123);
        movieOutput.setRating(123);
        movieOutput.setTitle("value");
        movieOutput.setYear(123);

        return movieOutput;
    }

}