package Decorator;

class PaymentTransaction {

    private IPaymentStrategy paymentStrategy;

    public PaymentTransaction(IPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment() {
        paymentStrategy.pay();
    }
}

interface IPaymentStrategy {
    public void pay();
}

class PaypalPaymentStrategy implements Decorator.IPaymentStrategy {
    @Override
    public void pay() {
        System.out.println("payed with paypal");
    }
}

class DirectDebitPaymentStrategy implements Decorator.IPaymentStrategy {
    @Override
    public void pay() {
        System.out.println("payed with DirectDebit");
    }
}

class CreditCardStrategy implements Decorator.IPaymentStrategy {
    @Override
    public void pay() {
        System.out.println("payed with CreditCard");
    }
}
