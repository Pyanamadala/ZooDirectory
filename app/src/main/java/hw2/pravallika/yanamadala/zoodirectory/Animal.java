package hw2.pravallika.yanamadala.zoodirectory;

/**
 * Created by pravallika on 1/25/16.
 */
public class Animal {
    private String name;
    private String filename;
    public Animal(String name,String filename){
        this.name= name;
        this.filename=filename;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getFilename(){
        return filename;
    }
    public void setFilename(String filename){
        this.filename=filename;
    }
}
