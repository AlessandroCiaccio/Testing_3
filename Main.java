import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(longData(data));
    }
    public static String longData(OffsetDateTime data){
        if(data==null){
            return null;
        }
        return data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
    }
}
