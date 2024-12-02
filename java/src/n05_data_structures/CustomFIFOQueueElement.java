package n05_data_structures;

public class CustomFIFOQueueElement<T> {
    CustomFIFOQueueElement<T> next;
    CustomFIFOQueueElement<T> prev;
    T value;

    public CustomFIFOQueueElement(CustomFIFOQueueElement<T> next, CustomFIFOQueueElement<T> prev, T value) {
        this.next = next;
        this.prev = prev;
        this.value = value;
    }
}
