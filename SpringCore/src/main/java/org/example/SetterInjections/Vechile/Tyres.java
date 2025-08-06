package org.example.SetterInjections.Vechile;

public class Tyres {
    private String name;
    private String place;
    private String message;

    @Override
    public String toString() {
        return "Tyres{" +
                "message='" + message + '\'' +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
