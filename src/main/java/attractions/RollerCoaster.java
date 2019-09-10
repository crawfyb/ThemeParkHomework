package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {

    private double minHeight;
    private double price;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.40;
        this.minHeight = 1.45;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() >= minHeight) {
            return true;
        }

        return false;
    }

    public double defaultPrice() {
        return this.price;
    }

    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() >= 2.00) {
            return this.price * 2;
        }
        return this.price;
    }
}
