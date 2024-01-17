package javapractice;

public class IndiaTraffic implements CentralTraffic {

    public static void main(String[] args){
        CentralTraffic obj = new IndiaTraffic();
        obj.greengo();
        obj.redstop();
        obj.yellowwait();
    }
    @Override
    public void redstop() {
        System.out.println("Red Stop implementation");
    }

    @Override
    public void greengo() {
        System.out.println("green go implementation");

    }

    @Override
    public void yellowwait() {
        System.out.println("yellow wait implementation");

    }
}
