package com.kai.demo1;

public class  Proxy {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }
    public void rent(){
        seeHouse();
        host.rent();
        hetong();
        fare();
    }

    //看房
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
//收中介费
    public void fare(){
        System.out.println("收中介费");
    }
    public void hetong(){
        System.out.println("签租赁合同");
    }
}
