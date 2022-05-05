package exercises.ch7;


public abstract class AbstractEntity {
    int id;
    public AbstractEntity(int id){
        this.id = id;
    }
    public int getid(){
        return this.id;
    }
}
