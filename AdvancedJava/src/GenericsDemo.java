public class GenericsDemo<T,V>{
    //T and V are data types
    T dataToPrint;
    V dataInfo;

    public GenericsDemo(T data, V info) {
        this.dataToPrint=data;
        this.dataInfo=info;
    }

    public void showInfo(){
        System.out.println(this.dataToPrint+"---"+this.dataInfo);
        System.out.println(this.dataToPrint.getClass().getName()+" with "+ this.dataInfo.getClass().getName());
        System.out.println("**************");
    }

    public static void main(String[] args) {
        GenericsDemo<Integer,String> gd2=new GenericsDemo<>(3,"Hello");
        GenericsDemo<Float,Integer> gd3=new GenericsDemo<>(3.5f,5);
        GenericsDemo<String,Double> gd1=new GenericsDemo<>("Hooman",45.9);
        gd2.showInfo();
        gd3.showInfo();
        gd1.showInfo();
    }
}
