
/* First created by JCasGen Sun Oct 14 23:38:28 EDT 2012 */
package model;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Oct 16 20:34:31 EDT 2012
 * @generated */
public class genetag_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (genetag_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = genetag_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new genetag(addr, genetag_Type.this);
  			   genetag_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new genetag(addr, genetag_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = genetag.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("model.genetag");
 
  /** @generated */
  final Feature casFeat_SentenceID;
  /** @generated */
  final int     casFeatCode_SentenceID;
  /** @generated */ 
  public String getSentenceID(int addr) {
        if (featOkTst && casFeat_SentenceID == null)
      jcas.throwFeatMissing("SentenceID", "model.genetag");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SentenceID);
  }
  /** @generated */    
  public void setSentenceID(int addr, String v) {
        if (featOkTst && casFeat_SentenceID == null)
      jcas.throwFeatMissing("SentenceID", "model.genetag");
    ll_cas.ll_setStringValue(addr, casFeatCode_SentenceID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_GeneName;
  /** @generated */
  final int     casFeatCode_GeneName;
  /** @generated */ 
  public String getGeneName(int addr) {
        if (featOkTst && casFeat_GeneName == null)
      jcas.throwFeatMissing("GeneName", "model.genetag");
    return ll_cas.ll_getStringValue(addr, casFeatCode_GeneName);
  }
  /** @generated */    
  public void setGeneName(int addr, String v) {
        if (featOkTst && casFeat_GeneName == null)
      jcas.throwFeatMissing("GeneName", "model.genetag");
    ll_cas.ll_setStringValue(addr, casFeatCode_GeneName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Begin;
  /** @generated */
  final int     casFeatCode_Begin;
  /** @generated */ 
  public int getBegin(int addr) {
        if (featOkTst && casFeat_Begin == null)
      jcas.throwFeatMissing("Begin", "model.genetag");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Begin);
  }
  /** @generated */    
  public void setBegin(int addr, int v) {
        if (featOkTst && casFeat_Begin == null)
      jcas.throwFeatMissing("Begin", "model.genetag");
    ll_cas.ll_setIntValue(addr, casFeatCode_Begin, v);}
    
  
 
  /** @generated */
  final Feature casFeat_End;
  /** @generated */
  final int     casFeatCode_End;
  /** @generated */ 
  public int getEnd(int addr) {
        if (featOkTst && casFeat_End == null)
      jcas.throwFeatMissing("End", "model.genetag");
    return ll_cas.ll_getIntValue(addr, casFeatCode_End);
  }
  /** @generated */    
  public void setEnd(int addr, int v) {
        if (featOkTst && casFeat_End == null)
      jcas.throwFeatMissing("End", "model.genetag");
    ll_cas.ll_setIntValue(addr, casFeatCode_End, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
  * @generated */
  public genetag_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_SentenceID = jcas.getRequiredFeatureDE(casType, "SentenceID", "uima.cas.String", featOkTst);
    casFeatCode_SentenceID  = (null == casFeat_SentenceID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SentenceID).getCode();

 
    casFeat_GeneName = jcas.getRequiredFeatureDE(casType, "GeneName", "uima.cas.String", featOkTst);
    casFeatCode_GeneName  = (null == casFeat_GeneName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GeneName).getCode();

 
    casFeat_Begin = jcas.getRequiredFeatureDE(casType, "Begin", "uima.cas.Integer", featOkTst);
    casFeatCode_Begin  = (null == casFeat_Begin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Begin).getCode();

 
    casFeat_End = jcas.getRequiredFeatureDE(casType, "End", "uima.cas.Integer", featOkTst);
    casFeatCode_End  = (null == casFeat_End) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_End).getCode();

  }
}



    