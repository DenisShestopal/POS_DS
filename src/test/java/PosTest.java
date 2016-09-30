import Entities.Impl.DrinkImpl;
import Entities.Impl.MachineImpl;
import org.junit.Test;

public class PosTest {

    public static void main(String... args) throws Exception {

    }

    @Test
    public void canCreateMachine () throws Exception {
        MachineImpl machine = new MachineImpl();
    }

    @Test
    public void canCreateDrink() throws Exception {
        DrinkImpl drink = new DrinkImpl();
    }

    @Test
    public void makeDrink(String drinkType) {
        DrinkImpl drink = new DrinkImpl();
        drink.make();
    }
}



