package valuables;

public interface Storable<Container> {
    public abstract void setMyContainer(Container container);

    public abstract Container getMyContainer();
    
}
