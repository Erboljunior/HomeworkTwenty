public class Parallelepiped {
    private int height;
    private int width;
    private int length;



    public Parallelepiped(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }



    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public int S(){
        return 2*((getHeight()*getLength())+(getLength()*getWidth())+(getWidth()*getHeight()));
    }
    public int V(){
        return getLength()*getWidth()*getHeight();
    }
}
