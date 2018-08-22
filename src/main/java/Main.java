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
		JDA api = new JDABuilder(AccountType.BOT).setToken("NDgxMTgxNDE5MDkyMDQ5OTY3.Dl4ZfA._OEINim336-oxJO5YXSngGcaqBc").buildAsync();
		
		api.addEventListener(new MyListener());
	
	}
}
