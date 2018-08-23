import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;



public class Main {
	public static void main(String[] arguments) throws Exception
	{
		JDA api = new JDABuilder(AccountType.BOT).setToken("Fuck").buildAsync();
		
		api.addEventListener(new MyListener());
	
	}
}
