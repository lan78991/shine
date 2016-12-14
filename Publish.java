package com.shsxt.test;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Publish {

	public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
		// 注册端口
		LocateRegistry.createRegistry(8888);
		//  对外提供服务
		Naming.bind("rmi://127.0.0.1:8888/hello", new HelloServiceImpl());

	}

}
