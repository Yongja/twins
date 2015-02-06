package springbook.learningtest.templete;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Calculator {
	public Integer calcSumPre(String filePath) throws IOException{
		BufferedReader br = null;
		Integer sum = 0;
		
		String line = null;
		try{
			br = new BufferedReader(new FileReader(filePath));
		
			while( (line = br.readLine()) != null){
				sum += Integer.valueOf(line); 
			}
			
		}catch(IOException io){
			
			System.out.println(io.getMessage());
			throw io;
			
		}finally{
			
			if(br!=null){ try{br.close(); } catch(IOException io ){System.out.println(io.getMessage()); }}
		
		}				
		
		return sum;
	}
	
	public Integer calcSum(String filePath) throws IOException{
		
//		BufferedReaderCallBack brc = new BufferedReaderCallBack() {
//			
//			@Override
//			public Integer doSomethingWithReader(BufferedReader br) throws IOException {
//				Integer sum = 0;
//				
//				String line = null;
//				
//				// TODO Auto-generated method stub
//				while( (line = br.readLine()) != null){
//					sum += Integer.valueOf(line); 
//				}
//				return sum;
//			}
//		};
		
		LineCallback lcb = new LineCallback() {
			
			@Override
			public Integer doSomethingWithReader(String line, Integer sum) {
				// TODO Auto-generated method stub
				return sum + Integer.valueOf(line);
				 
			}
		};
		//BufferedReader	br = new BufferedReader(new FileReader(filePath));
		return lineReaderTemplate(filePath, lcb,0);
	}
	
	
	
	public Integer calcMultiply(String filePath) throws IOException{
		 	
//		BufferedReaderCallBack brc = new BufferedReaderCallBack() {
//			@Override
//			public Integer doSomethingWithReader(BufferedReader br) throws IOException {
//				Integer sum = 1;
//				String line = null;
//				// TODO Auto-generated method stub
//				
//				while((line = br.readLine()) != null ){				
//					sum *= Integer.valueOf(line);
//				}	
//				return sum;
//			}
//		};
		
		LineCallback callback	= new LineCallback() {
			
			@Override
			public Integer doSomethingWithReader(String line, Integer sum) {
				// TODO Auto-generated method stub
				
				return sum * Integer.valueOf(line);
			}
		};
		
		return this.lineReaderTemplate(filePath, callback,1);
	}
	
	public String concatenate(String filePath) throws IOException{
		LineGenericCallback<String> lgcallback = new LineGenericCallback<String>() {
			
			@Override
			public String doSomethingWithReader(String line, String value) {
				// TODO Auto-generated method stub
				return value + line;
			}
			
		};
		
		return lineReaderGenericTemplate(filePath, lgcallback, "");
	}
	
	public <T> T lineReaderGenericTemplate(String filePath,LineGenericCallback<T> callback, T intVal) throws IOException{
		BufferedReader br = null;
 		
		try{
//			Integer sum = intVal;
			T res = intVal;
			String line = null;
			
			br = new BufferedReader(new FileReader(filePath));
			
			while((line = br.readLine()) != null ){
				
				res = callback.doSomethingWithReader(line, res);
			}

			return res;
			
		}catch(IOException io){
			
			System.out.println(io.getMessage());
			throw io;
			
		}finally{
			
			if(br!=null){ try{br.close(); } catch(IOException io ){System.out.println(io.getMessage()); }}
		
		}		
	}	
	
	public Integer lineReaderTemplate(String filePath,LineCallback lcb, int intVal) throws IOException{
		BufferedReader br = null;
		//Integer sum = 0;
		//int d = 0;
		Integer sum = intVal;
		String line = null;
		try{
			br = new BufferedReader(new FileReader(filePath));
			
			while((line = br.readLine()) != null ){
				
				sum = lcb.doSomethingWithReader(line, sum);
			}
			// d = brc.doSomethingWithReader(br);			
		}catch(IOException io){
			
			System.out.println(io.getMessage());
			throw io;
			
		}finally{
			
			if(br!=null){ try{br.close(); } catch(IOException io ){System.out.println(io.getMessage()); }}
		
		}				
		
		return sum;
	}	
	
	public Integer fileReaderTemplate(String filePath,BufferedReaderCallBack brc) throws IOException{
		BufferedReader br = null;
		//Integer sum = 0;
		int d = 0;
		String line = null;
		
		try{
			br = new BufferedReader(new FileReader(filePath));
			 d = brc.doSomethingWithReader(br);
			
			 
			
		}catch(IOException io){
			
			System.out.println(io.getMessage());
			throw io;
			
		}finally{
			
			if(br!=null){ try{br.close(); } catch(IOException io ){System.out.println(io.getMessage()); }}
		
		}				
		
		return d;
	}	
}
