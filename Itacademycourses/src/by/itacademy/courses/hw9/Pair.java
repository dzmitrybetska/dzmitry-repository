package by.itacademy.courses.hw9;

public class Pair <T, V> {
    private T obv1;
    private V obv2;

    Pair (T obv1, V obv2 ) {
        this.obv1 = obv1;
        this.obv2 = obv2;
    }

    public T getObv1() {
        return obv1;
    }

    public void setObv1(T obv1) {
        this.obv1 = obv1;
    }

    public V getObv2() {
        return obv2;
    }

    public void setObv2(V obv2) {
        this.obv2 = obv2;
    }

    public <T, V> Pair <T,V>  changeSeats (Pair<T, V> ob){
        return ob;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "obv1=" + obv1 +
                ", obv2=" + obv2 +
                '}';
    }

}
