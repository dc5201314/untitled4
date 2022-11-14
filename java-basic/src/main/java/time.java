import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class time {
    public static String formatTime(Date date){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String result = df.format(date);

        return result;
    }
}
