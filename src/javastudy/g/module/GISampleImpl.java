package javastudy.g.module;

public class GISampleImpl<T> implements GISample<T> {

    private T[] array;

    public GISampleImpl() {
        array = (T[]) new Object[10];
    }

    @Override
    public void addElement(T element, int index) {
        array[index] = element;
    }

    @Override
    public T getElement(int index) {
        return array[index];
    }

}
