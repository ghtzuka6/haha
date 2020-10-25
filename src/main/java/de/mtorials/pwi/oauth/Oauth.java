package de.mtorials.pwi.oauth;

import com.jagrosh.jdautilities.oauth2.OAuth2Client;
import com.jagrosh.jdautilities.oauth2.Scope;

import de.progen_bot.core.Main;
import io.javalin.Javalin;
import io.javalin.http.Context;

import static io.javalin.apibuilder.ApiBuilder.*;


public class Oauth {

    /**
     * Scopes needed for the web interface.
     * IDENTIFY: Allows /users/@me without email
     * GUILDS: Allows /users/@me/guilds to return basic information about all of a user's guilds
     */
    private static final Scope[] SCOPES = {Scope.IDENTIFY, Scope.GUILDS};
    private static final OAuth2Client CLIENT = new OAuth2Client.Builder()
        .setClientId(51632730770374657L)
        .setClientSecret("_9RG51caaVHWp0hPpLKG0OK3eqpdDV6h")
        .setOkHttpClient(Main.geHttpClient())
        .build();

    public Oauth(){
        Javalin.create(settings -> 
        settings.enableCorsForOrigin("https://pwi-canary.progen-bot.de")).routes(() -> {
		    get("/login", this::loginWithDiscord);
        });
    }

    private void checkLogin(Context ctx) {
    }

    private void loginWithDiscord(Context ctx){
        var key = ctx.header("User_Authorization");
        ctx.redirect(CLIENT.generateAuthorizationURL("https://pwi.canary.progen-bot.de", SCOPES));
        return;
    }

    private void getGuilds(Context ctx){
    }

}