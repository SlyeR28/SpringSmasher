package org.example.SetterInjections.Vechile;

public class Vechile {
    IEngine engine;
    Tyres tyres;

    @Override
    public String toString() {
        return "Vechile{" +
                "engine=" + engine +
                ", tyres=" + tyres +
                '}';
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
