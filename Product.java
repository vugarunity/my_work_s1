class Product {
    public String getInfo() {
        return "Some Product";
    }
}

class HotDrink extends Product {
    private int temperature;

    public HotDrink(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Temperature: " + temperature;
    }
}

class Tea extends HotDrink {
    public Tea(int temperature) {
        super(temperature);
    }

    @Override
    public String getInfo() {
        return "Tea, " + super.getInfo();
    }
}

class Coffee extends HotDrink {
    public Coffee(int temperature) {
        super(temperature);
    }

    @Override
    public String getInfo() {
        return "Coffee, " + super.getInfo();
    }
}

class Cacao extends HotDrink {
    public Cacao(int temperature) {
        super(temperature);
    }

    @Override
    public String getInfo() {
        return "Cacao, " + super.getInfo();
    }
}

