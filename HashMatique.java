import java.util.HashMap;
import java.util.Set;
public class HashMatique {
    public static void Songs(){
    HashMap<String, String> trackList = new HashMap<String, String>();
    trackList.put("Talk", "Jump up at the show, uh, Jump up at the show");
    trackList.put("Superman", "Cause I can't be your superman");
    trackList.put("Heartless", "In the night I hear em talk");
    trackList.put("Jackie Brown", "I guess I'm doing what I want, hope you doing what you want");
    String track = trackList.get("Superman");
    System.out.println(track);

    Set<String> keys = trackList.keySet();
    for( String key : keys ){
        System.out.printf("Track: %s: Lyrics: %s \n", key, trackList.get(key));
        }
    }
}
