package com.infoshareacademy.jjdd1.kiomi.app.model.cars;

/**
 * example data:
 * "dataname": "FORD",
 * "id": "7pz",
 * "name": "5000-Serie",
 * "end_year": "1993",
 * "end_month": "12",
 * "start_year": "1985",
 * "start_month": "01",
 * "vehicle_group": "commercial",
 * "link": "\/api\/v2\/find\/ey\/7pz"
 */
public class Model {
    private String id;
    private String name;
    private String end_year;
    private String end_month;
    private String start_year;
    private String start_month;
    private String vehicle_group;
    private String link;


    public Model(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnd_year() {
        return end_year;
    }

    public void setEnd_year(String end_year) {
        this.end_year = end_year;
    }

    public String getEnd_month() {
        return end_month;
    }

    public void setEnd_month(String end_month) {
        this.end_month = end_month;
    }

    public String getStart_year() {
        return start_year;
    }

    public void setStart_year(String start_year) {
        this.start_year = start_year;
    }

    public String getStart_month() {
        return start_month;
    }

    public void setStart_month(String start_month) {
        this.start_month = start_month;
    }

    public String getVehicle_group() {
        return vehicle_group;
    }

    public void setVehicle_group(String vehicle_group) {
        this.vehicle_group = vehicle_group;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return  "("+id + ") " + name;
    }
}