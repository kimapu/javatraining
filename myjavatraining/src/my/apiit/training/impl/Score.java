package my.apiit.training.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Score {

	public static final String DB_FILE = "src/my/apiit/training/impl/scores.txt"; 
	
	private String targetFile;
	public Score( String f ) {
		targetFile = f;
	}

	public double sum() throws NumberFormatException{
		double sum = 0;
		List<String> scores = getAll( targetFile );
		if ( scores != null && scores.size() > 0 ) {
			for (String scoreLine : scores) {
				StringTokenizer tk = new StringTokenizer( scoreLine );
				while ( tk.hasMoreTokens() ) {
					sum += Double.parseDouble( tk.nextToken() );
				}
			}
		} else {
			System.out.println( "No scores!" );
		}
		return sum;
	}
	
	public double avg() {
		double sum = 0, avg = 0;
		List<String> scores = getAll( targetFile );
		if ( scores != null && scores.size() > 0 ) {
			int count = 0;
			for (String scoreLine : scores) {
				StringTokenizer tk = new StringTokenizer( scoreLine );
				while ( tk.hasMoreTokens() ) {
					count++;
					sum += Double.parseDouble( tk.nextToken() );
				}
			}
			avg = sum / count;
		} else {
			System.out.println( "No scores!" );
		}
		return avg;
	}
	
	private List<String> getAll( String fileName ) {
		List<String> content = null;
		if( new File(fileName).exists() ) {
			content = new ArrayList<>();
			try {
				BufferedReader br = new BufferedReader( new FileReader(fileName) );
				String line;
				while( (line = br.readLine()) != null ) {
					content.add( line );
				}
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				System.out.println( "Done..." );
			}
		}
		return content;
		
	}
	
}
