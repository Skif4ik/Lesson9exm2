package model;

// Пример композиции - когда объект входящий в
// состав другого обьекта не должен быть доступен извне
public class Phone {
    private String model;
    private Battery battery;

    public Phone() {
        // создание входящего в состав объекта происходит вместе с созданием основного объекта
        battery = new Battery(4000);
    }

    //принимаем не объект а информацию для создания объекта батарея
    public Phone(String model, int capacity) {
        this.model = model;
        this.battery = new Battery(capacity);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBatteryCapacity(){
        return battery.getCapacity();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Phone{");
        sb.append("model='").append(model).append('\'');
        sb.append(", battery=").append(battery);
        sb.append('}');
        return sb.toString();
    }
}
