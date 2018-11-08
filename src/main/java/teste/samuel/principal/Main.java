package teste.samuel.principal;

import teste.samuel.modelo.DoubleColon;
import teste.samuel.modelo.IDoubleColon;

public class Main {

    public static void main(String[] args) {

	DoubleColon obj = new DoubleColon();
	IDoubleColon dd = obj::method1;

	dd.interfaceMethod(" test string ");

	IDoubleColon second = DoubleColon::staticmethod;
	second.interfaceMethod(" test static string ");

    }

}
