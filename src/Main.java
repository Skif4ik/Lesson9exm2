import model.Battery;
import model.Phone;

public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone();
        System.out.println(phone1);
        Phone phone2 = new Phone("Samsung",5000);
        System.out.println(phone2);

        //нельзя обратиться или вернуть ссылку на объект Battery
        phone2.getBatteryCapacity();
        phone1 = null;
        phone2 = null;

        Battery battery = new Battery(4500);

    }
}
