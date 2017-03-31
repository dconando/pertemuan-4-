public class PengAnaknya extends PenggunaanSuper {
int num = 10;
public void tampilkan(){
System.out.println("ini tampilan dari sub class");
}

public void penggunaanSuper(){
tampilkan();//asal ngga static, bisa langsung panggil tanpa obj
super.tampilkan();
System.out.println("nilai variabel num pada sub class:"+ num);
System.out.println("nilai variabel num pada super class:"+ super.num);
}

public static void main(String args[]){
PengAnaknya obj = new PengAnaknya();
obj.penggunaanSuper();
}
}