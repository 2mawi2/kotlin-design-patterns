package Decorator;

class Client {
    public void test() {
        useTarget(new Decorator.ServiceAdapter());
    }

    private void useTarget(ITarget target) {
        target.operation();
    }
}

interface ITarget {
    String operation();
}

class ServiceAdapter implements ITarget { //Wrapper
    private Service service = new Service();

    @Override
    public String operation() {
        return service.complicatedLongOperationWhichShouldBeWrapped();
    }
}

class Service {
    public String complicatedLongOperationWhichShouldBeWrapped() {
        return "this is a complicatedLongOperationWhichShouldBeWrapped";
    }
}

