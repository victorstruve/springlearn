package les1.company;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EntityManager<T> {
    private T[] entities;
    int size;

    @SuppressWarnings("unchecked")
    public EntityManager(int maxSize, Class<T> clazz){
        this.entities = (T[]) Array.newInstance(clazz, maxSize);
    }
    public void  addEntitiy(T entity){
        entities[size] = entity;
        size++;
    }
    public int getSize(){return size;}
    public T[] getEntities() {return  entities;}
}
