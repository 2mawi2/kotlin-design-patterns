package Decorator;


interface Factory {
    abstract ICar create();
}

class MercedesFactory implements Factory {
    @Override
    public ICar create() {
        return new Mercedes();
    }
}

class RenaultFactory implements Factory {
    @Override
    public ICar create() {
        return new Renault();
    }
}

class BmwFactory implements Factory {
    @Override
    public ICar create() {
        return new Bmw();
    }
}


