public class Generic<T> {
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return this.t;
    }

    public String toString(){
        return t.toString();
    }
}
