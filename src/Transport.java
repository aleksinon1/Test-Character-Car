package MyProject.src;

public class Transport {
    public float speed;
    public int weight;
    public String colour;
    public byte[] coordinate;

    public void setValues(float _speed, int _weight, String _colour, byte[] _coordinate) {
        speed = _speed;
        weight = _weight;
        colour = _colour;
        coordinate = _coordinate;
    }

    public String getValues() {
        String info = "Скорость объекта: " + speed + ". Вес" + weight + ". Цвет" + colour;
        String infoCoordinates = "Координаты:\n";
        for(int i = 0; i < coordinate.length; i++)
            infoCoordinates += coordinate[i] + "\n";

        return info + infoCoordinates;

        }
    }




