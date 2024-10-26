package Builder;

import Bilesen.*;

public interface Builder {
    void setCarType(CarType type);//Araba tipi üzerindeki değişimler
    void setSeats(int seats);//Koltuk Sayısı üzerindeki değişimler
    void setEngine(Engine engine);//Motor üzerindeki değişimler
    void setTransmission(Transmission transmission);//iletim hakkındaki değişimler
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
