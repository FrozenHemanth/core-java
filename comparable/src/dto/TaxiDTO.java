package dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class TaxiDTO implements Serializable,Comparable<TaxiDTO>  {
    private int id;
    private String name;
    private String color;
    private int speed;

    @Override
    public int compareTo(TaxiDTO o) {
        TaxiDTO left = this;
        TaxiDTO right = o;
        if (left.name==right.name)return 1;
//else if (left.id>right.id) return 1;


        else if (left.name.compareTo(right.name) < 0) return -1;
        else return 1;

    }

    @Override
    public String toString() {
        return"TaxiDTO [id=" + id + ", name=" + name + ", color=" + color + ", speed=" + speed +"]"+"\n";
    }
}


