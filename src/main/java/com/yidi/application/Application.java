package com.yidi.application;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

import com.yidi.service.MainService;

public class Application {
	public static void main(String[] args) throws UnsupportedEncodingException {
		try {
			String name=new String(args[0].getBytes(),"UTF-8");
			String text=new String(args[2].getBytes(),"UTF-8");
			MainService main=new MainService(name, "",text );
			System.out.println(main.getReply());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("false!");
		}
	}
}
