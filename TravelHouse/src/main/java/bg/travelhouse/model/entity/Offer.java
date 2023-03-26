package bg.travelhouse.model.entity;

import bg.travelhouse.model.enums.RoomTypeEnum;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "offers")
public class Offer extends BaseEntity {

    @Column(nullable = false)
    private RoomTypeEnum roomType;

    private LocalDate validFrom;

    private LocalDate validUntil;

    private Integer numberOfPeople;

    @ManyToOne
    public Category category;

    @Column(nullable = false)
    private String imageUrl;

    @Column(nullable = false)
    private BigDecimal pricePerNight;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String address;

    public Offer() {
    }

    public RoomTypeEnum getRoomType() {
        return roomType;
    }

    public Offer setRoomType(RoomTypeEnum roomType) {
        this.roomType = roomType;
        return this;
    }

    public Category getCategory() {
        return category;
    }

    public Offer setCategory(Category category) {
        this.category = category;
        return this;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public Offer setValidFrom(LocalDate availableFrom) {
        this.validFrom = availableFrom;
        return this;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public Offer setValidUntil(LocalDate availableUntil) {
        this.validUntil = availableUntil;
        return this;
    }

    public Integer getNumberOfPeople() {
        return numberOfPeople;
    }

    public Offer setNumberOfPeople(Integer numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Offer setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    public Offer setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
        return this;
    }

    public String getName() {
        return name;
    }

    public Offer setName(String name) {
        this.name = name;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Offer setCity(String city) {
        this.city = city;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Offer setAddress(String address) {
        this.address = address;
        return this;
    }

}
