import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    public static void main(String[] args) {

        // 1. Current Date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Default Date: " + currentDate);

        // 2. Different Date Formats
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f4 = DateTimeFormatter.ofPattern("dd MMM yyyy");

        System.out.println("dd-MM-yyyy  : " + currentDate.format(f1));
        System.out.println("dd/MM/yyyy  : " + currentDate.format(f2));
        System.out.println("yyyy-MM-dd  : " + currentDate.format(f3));
        System.out.println("dd MMM yyyy : " + currentDate.format(f4));

        // 3. Current Date & Time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("\nDefault DateTime: " + currentDateTime);

        DateTimeFormatter dt1 =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("Formatted DateTime: "
                + currentDateTime.format(dt1));

        // 4. String Date → Date Object (Parsing)
        String dateStr = "15-08-2024";
        DateTimeFormatter parseFormat =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate parsedDate =
                LocalDate.parse(dateStr, parseFormat);

        System.out.println("\nParsed Date: " + parsedDate);
    }
}

