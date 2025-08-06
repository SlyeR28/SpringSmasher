package org.example.SetterInjections.Vechile;

public class Engine implements IEngine{
    private String company;
    private double cost;

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String importOrigin() {
        return "Japan";
    }

    @Override
    public String toString() {
        return "Vechile{" +
                "company='" + company + '\'' +
                ", cost=" + cost +
                '}';
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
