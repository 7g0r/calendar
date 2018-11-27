package calendar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@XmlType(name = "event")
@XmlAccessorType(XmlAccessType.FIELD)
public class Event {
    //    @XmlAttribute(name = "date")
//    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
//    private LocalDateTime date;
    @XmlValue
    private String name;
    @XmlAttribute(name = "date")
    private String date;
    @XmlElement (name = "guest")
    private List<Guest> guests = new ArrayList<>();

    public Event(String date, String name) {
        this.date = date;
        this.name = name;
    }

}
