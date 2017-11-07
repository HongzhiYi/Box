import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class map {
	int[][] map=new int[20][20];
	int manX,manY;
	public map(int level){   
		String filepath="mapc/"+level+".txt";   
		File file = new File(filepath);   
		FileReader fr = null;//����FileReader������ȡһ���ļ��е�����   
		BufferedReader br = null;//�ַ�����������      
		try {    
			fr = new FileReader(file);    
			br = new BufferedReader(fr);    
			for (int i = 0; i < 15; i++){      
				String line = br.readLine();//����Ϊ��λ��һ�ζ�һ������BufferedReader��readLine����ȡ�����ı�   
				System.out.println(line);
				byte[] point = line.getBytes();//���ַ���ת��Ϊ�ֽ�����     
				for (int j = 0; j < 15; j++) {      
					map[i][j] = point[j] - 48;// ����ASCall���Ҫ����30H��ʮ���Ƶ�48��     
					if (map[i][j] == 5 || map[i][j] == 6 || map[i][j] == 7|| map[i][j] == 8){       
						manX = i;       
						manY = j;
						}     
					}    
				}   
			}     
		catch (FileNotFoundException e){    
			e.printStackTrace();//���ε�����쳣���õ�����  
		}     
		catch (IOException e){        
			e.printStackTrace();//���ε�����쳣���õ�����   
		}    
		catch(NullPointerException e){     
			e.printStackTrace();//���ε�����쳣���õ�����  
		}    
		finally {    
			if (br == null){     
				try{      
					br.close();     
					}      
				catch (IOException e){      
					e.printStackTrace();     
					}     br = null;    
					}    
			if (fr == null){       
				try { 
					fr.close();      
				} 
				catch (IOException e){      
					e.printStackTrace();     
				}      
				fr = null;     
			}    
		}    
	}    
	public int[][] getMap() {   
		return map;  
		}    
	public int getManX() {   
		return manX;  
		}   
	public int getManY() {   
		return manY;  
		}  
}
