package es.deusto.sd.ecoembes.dto;

import java.util.Date;

public class RecyclingPlantDTO {
    private String id;
    private String name;
    private double capacity;
    private Date availableDate;

    public RecyclingPlantDTO() {}

    public RecyclingPlantDTO(String id, String name, double capacity, Date availableDate) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.availableDate = availableDate;
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

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public Date getAvailableDate() {
		return availableDate;
	}

	public void setAvailableDate(Date availableDate) {
		this.availableDate = availableDate;
	}

}

