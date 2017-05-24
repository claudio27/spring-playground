package com.cla.jsprint.ch1;

public class DataReaderClient {

	private FileReader fileReader = null;
	private String fileName = "res/myfile.txt";
	
	public DataReaderClient() {
		
		fileReader = new FileReader(fileName);
	}
	
	private String fetchData(){
		return fileReader.read();
	}
	
	public static void main(String[] args) {

		DataReaderClient dataReader = new DataReaderClient();

		System.out.println("Datos recuperados : \n" + dataReader.fetchData());

	}
	
	
}

