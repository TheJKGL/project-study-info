package malakhov.study.abstract_and_interface.example.transport;

/**
 * Created by Администратор on 26.01.2016.
 */
public abstract class WaterTransport implements Transport {

    @Override
    public void move() {
        System.out.println("we are sailing");
    }
}
