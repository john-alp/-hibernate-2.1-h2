package entity;

import java.util.Objects;

public class Address {
    private Long id;
    private String country;
    private String city;
    private String street;
    private String postCode;

    public Address() {

    }

    public Long getId() {
        return getId();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return getCountry();
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return getCity();
    }

    public void setCity(String sity) {
        this.city = sity;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet() {
        this.street = street;
    }

    public String getPostCode(String postCode) {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (id != null ? !id.equals(address.id) : address.id != null) return false;
        if (country != null ? !country.equals(address.country) : address.country != null) return false;
        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        if (street != null ? !street.equals(address.street) : address.street != null) return false;
        return postCode != null ? postCode.equals(address.postCode) : address.postCode == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (postCode != null ? postCode.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
