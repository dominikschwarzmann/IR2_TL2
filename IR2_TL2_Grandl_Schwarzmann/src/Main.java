
import java.io.IOException;

import org.apache.lucene.queryparser.classic.ParseException;

// https://github.com/apache/lucene-solr/blob/master/lucene/demo/src/java/org/apache/lucene/demo/IndexFiles.java
public class Main {

	public static void main(String[] args) throws IOException, ParseException {
		Lucene l = new Lucene();
		l.indexDocuments();

	}
}