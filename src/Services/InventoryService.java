package Services;

import java.time.Year;
public class InventoryService {
    public static boolean isoutdated(int PublishYear, int Maxyears) {
        int currentYear = Year.now().getValue();
        return (currentYear - PublishYear) > Maxyears;
    }
}
