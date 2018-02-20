interface IComponent {
    public void operate();
}

class ConcreteComponent implements IComponent {
    @Override
    public void operate() {
        System.out.println("operate");
    }
}

abstract class Decorator implements IComponent {
    private Decorator decorator;

    Decorator(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public void operate() {
        decorator.operate();
    }
}

class ComponentDecorator extends Decorator {
    public ComponentDecorator(Decorator decorator) {
        super(decorator);
    }

    public void decoratedOperation() {
        System.out.println("signature of Component has been extended");
    }
}


