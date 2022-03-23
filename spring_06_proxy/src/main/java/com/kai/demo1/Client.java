package com.kai.demo1;

public class Client {
    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();
        //中介帮房东租房子，但是中介有一些附属操作
        Proxy proxy = new Proxy(host);

        //客户不用面对房东，直接找中介租房
        proxy.rent();

    }
}
