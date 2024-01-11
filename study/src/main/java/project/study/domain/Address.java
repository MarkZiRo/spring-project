package project.study.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;

    protected Address()
    {

    }

    public Address(String city, String street)
    {
        this.city = city;
        this.street = street;
    }
}
