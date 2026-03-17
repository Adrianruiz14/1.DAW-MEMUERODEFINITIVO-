package herencias_final;

public abstract class Figura {

    private int id;
    private String color;

    public Figura(int id, String color) {
        this.id = id;
        this.color = color;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    

@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Figura other = (Figura) obj;
        return id == other.id;
    }

    
@Override
    public String toString() {
        return "Figura [id=" + id + ", color=" + color + "]";
    }
public abstract double area();




    

}
