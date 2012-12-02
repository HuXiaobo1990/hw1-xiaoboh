package files;

import com.aliasi.chunk.Chunk;
import com.aliasi.chunk.Chunker;
import com.aliasi.chunk.Chunking;
import com.aliasi.chunk.ConfidenceChunker;
import com.aliasi.chunk.NBestChunker;
import com.aliasi.util.AbstractExternalizable;
import com.aliasi.util.ScoredObject;
import com.aliasi.util.Strings;
import java.lang.*;
import java.net.URL;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import java.io.File;
import java.util.Iterator;

import java.util.regex.Pattern;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.jcas.JCas;

import model.genetag;

/**
 * @author Xiaobo Hu<br>
 * main class GeneTag<br>
 * extends JCasAnnotator_ImplBase<br>
 */
public class GeneTag extends JCasAnnotator_ImplBase {
  
  /**
   * function process()  call a database from lingpipe<br>
   * <br>
   * main progress of tagging gene<br>
   *   split() split text into sentence by "\n"<br>
   *   nBestChunks(char[],int,int,int)
   * @param s each sentence
   * @param start calculate position of genename
   * @param end
   * @param x
   * @param y 
   */
  public void process(JCas aJCas) {
    
    int end = 0,start = 0;
    String ID = null;
    String temp = null;
    URL base = ClassLoader.getSystemClassLoader().getResource("");
    temp = base.toString().substring(6);
    File modelFile = new File(temp+"ne-en-bio-genetag.HmmChunker");
//    File modelFile = new File("src/main/resources/lingpipe/ne-en-bio-genetag.HmmChunker");
//    System.out.println("Reading chunker from file=" + modelFile);
    
    ConfidenceChunker chunker = null;
    
    try {
      chunker = (ConfidenceChunker)AbstractExternalizable.readObject(modelFile);
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
 
    /*start get document from the ajcas*/
    String docText = aJCas.getDocumentText();
    String[] s = docText.split("\n");
    int pos = 0;
    int x;
    int y;

    for (int i = 0; i < s.length; i++) 
    {
        if(s[i].length()<14)
          continue;
        ID = s[i].substring(0, 14);
        s[i] = s[i].substring(15, s[i].length());
        char[] cs = s[i].toCharArray();
        Iterator<Chunk> it= chunker.nBestChunks(cs,0,cs.length,6);
       
        for (int n = 0; it.hasNext(); ++n) 
        {
            Chunk chunk = it.next();
            double conf = Math.pow(2.0,chunk.score());
            if(conf*10 < 1)
            {
              if(6 == n)
                pos = s[i].length();
              continue;
            }
            start = chunk.start();
            end = chunk.end();
            x = calculate(cs,0,start);
            y = calculate(cs,0,end-1);
            String name = s[i].substring(start,end);
            genetag annotation = new genetag(aJCas);
            
//            System.out.println(ID+"|"+(start-x)+" "+(end-1-y)+"|"+name);
            
            annotation.setSentenceID(ID);
            annotation.setBegin(start-x);
            annotation.setEnd(end-1-y);
            annotation.setGeneName(name);            
            annotation.addToIndexes();
       }
    }
    
 }

/**
 * function calculate(), calculate letter position of gene name 
 * @param temp
 * @param start
 * @param end
 * @return counter 
 */
public int calculate(char[] temp,int start, int end)
{
  int counter = 0;
  for(int i = start;i <= end;i++)
  {
      if(' '==temp[i])
      {
          counter++;
      }
  }
          
  return counter;
}

}
