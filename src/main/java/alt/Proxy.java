package alt;

class Element {
    private String name;

    Element(String name) {
        this.name = name;
    }
}

interface IApi {
    Element getElementById(int id);

    Element getElementByName(String name);
}

class Api implements IApi {
    @Override
    public Element getElementById(int id) {
        return new Element("name");
    }

    @Override
    public Element getElementByName(String name) {
        return new Element("name");
    }
}

class ApiProxy implements IApi {
    private IApi realApi = new Api();

    @Override
    public Element getElementById(int id) {
        System.out.print("getElementById called");
        return realApi.getElementById(id);
    }

    @Override
    public Element getElementByName(String name) {
        System.out.print("getElementByName called");
        return realApi.getElementByName(name);
    }
}
