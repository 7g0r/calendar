package calendar;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@Data
@NoArgsConstructor
@XmlType(name = "guest")
@XmlAccessorType(XmlAccessType.FIELD)
public class Guest {
    @XmlAttribute(name = "name")
    String name;
    @XmlAttribute(name = "email")
    String email;

    void addGuest(){

    }

}
