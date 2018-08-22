import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class MyListener extends ListenerAdapter {
	
	

		
		
		
public void onMessageReceived(MessageReceivedEvent event){
{
    if (event.getAuthor().isBot()) return;
    // We don't want to respond to other bot accounts, including ourself
    Message message = event.getMessage();
    String content = message.getContentRaw();

    // getContentRaw() is an atomic getter
    // getContentDisplay() is a lazy getter which modifies the content for e.g. console view (strip discord formatting)
    
    //getting channel
    MessageChannel channel = event.getChannel();
    if (content.charAt(0) == '$') {
    	switch (content) {
    	case "$pride":
    		channel.sendMessage(":gay_pride_flag: ").queue();
    	case "$trojan":
    		channel.sendMessage("Trojans are shitty").queue();
    	default : 
    		channel.sendMessage("Sorry, I don't recognize that command!").queue();
    	}
    }
    
    
    
    
    
    
    /*if (content.equals("$pride"))
    {
        MessageChannel channel = event.getChannel();
        
        
        channel.sendMessage(":gay_pride_flag: ").queue(); // Important to call .queue() on the RestAction returned by sendMessage(...)
    }*/
}
}

}