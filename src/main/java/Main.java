import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main {

    private static final String TOKEN = "";
    private static final String CHANNEL_ID = "";
    private static final String ACTIVITY = "";

    public static void main(String[] args) throws LoginException, InterruptedException {
        JDABuilder.createDefault(TOKEN).setActivity(Activity.playing(ACTIVITY)).build().awaitReady().getTextChannelById(CHANNEL_ID).sendMessage(args[0]).submit();
        System.exit(0);
    }
}
