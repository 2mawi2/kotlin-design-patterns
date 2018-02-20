package alt;

import kotlin.NotImplementedError;

interface ICar {

}

class Mercedes implements ICar {
}

class Bmw implements ICar {
}

class Renault implements ICar {
}

enum CarType {
    MERCEDES,
    BMW,
    RENAULT
}

class CarFactory {
    public static ICar create(CarType type) {
        switch (type) {
            case MERCEDES:
                return new Mercedes();
            case BMW:
                return new Bmw();
            case RENAULT:
                return new Renault();
            default:
                throw new NotImplementedError();
        }
    }
}
