package app;

import abstract_factory.Button;
import abstract_factory.Checkbox;
import abstract_factory.GUIfactory;
import factory_method.Logistics;

public class DeliveryApplication {
    private final Button button;
    private final Checkbox checkbox;
    private final Logistics logistics;

    public DeliveryApplication(GUIfactory factory, Logistics logistics) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
        this.logistics = logistics;
    }

    public void run() {
        button.paint();
        checkbox.paint();
        logistics.planDelivery("furniture ", "Aktau");
    }
}
