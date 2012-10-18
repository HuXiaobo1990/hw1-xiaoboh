

/* First created by JCasGen Sun Oct 14 23:38:28 EDT 2012 */
package model;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Oct 16 20:34:31 EDT 2012
 * XML source: D:/Java/hw1-xiaoboh/src/main/resources/descriptors/typeSystemDescriptor.xml
 * @generated */
public class genetag extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(genetag.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected genetag() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public genetag(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public genetag(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public genetag(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: SentenceID

  /** getter for SentenceID - gets 
   * @generated */
  public String getSentenceID() {
    if (genetag_Type.featOkTst && ((genetag_Type)jcasType).casFeat_SentenceID == null)
      jcasType.jcas.throwFeatMissing("SentenceID", "model.genetag");
    return jcasType.ll_cas.ll_getStringValue(addr, ((genetag_Type)jcasType).casFeatCode_SentenceID);}
    
  /** setter for SentenceID - sets  
   * @generated */
  public void setSentenceID(String v) {
    if (genetag_Type.featOkTst && ((genetag_Type)jcasType).casFeat_SentenceID == null)
      jcasType.jcas.throwFeatMissing("SentenceID", "model.genetag");
    jcasType.ll_cas.ll_setStringValue(addr, ((genetag_Type)jcasType).casFeatCode_SentenceID, v);}    
   
    
  //*--------------*
  //* Feature: GeneName

  /** getter for GeneName - gets 
   * @generated */
  public String getGeneName() {
    if (genetag_Type.featOkTst && ((genetag_Type)jcasType).casFeat_GeneName == null)
      jcasType.jcas.throwFeatMissing("GeneName", "model.genetag");
    return jcasType.ll_cas.ll_getStringValue(addr, ((genetag_Type)jcasType).casFeatCode_GeneName);}
    
  /** setter for GeneName - sets  
   * @generated */
  public void setGeneName(String v) {
    if (genetag_Type.featOkTst && ((genetag_Type)jcasType).casFeat_GeneName == null)
      jcasType.jcas.throwFeatMissing("GeneName", "model.genetag");
    jcasType.ll_cas.ll_setStringValue(addr, ((genetag_Type)jcasType).casFeatCode_GeneName, v);}    
   
    
  //*--------------*
  //* Feature: Begin

  /** getter for Begin - gets 
   * @generated */
  public int getBegin() {
    if (genetag_Type.featOkTst && ((genetag_Type)jcasType).casFeat_Begin == null)
      jcasType.jcas.throwFeatMissing("Begin", "model.genetag");
    return jcasType.ll_cas.ll_getIntValue(addr, ((genetag_Type)jcasType).casFeatCode_Begin);}
    
  /** setter for Begin - sets  
   * @generated */
  public void setBegin(int v) {
    if (genetag_Type.featOkTst && ((genetag_Type)jcasType).casFeat_Begin == null)
      jcasType.jcas.throwFeatMissing("Begin", "model.genetag");
    jcasType.ll_cas.ll_setIntValue(addr, ((genetag_Type)jcasType).casFeatCode_Begin, v);}    
   
    
  //*--------------*
  //* Feature: End

  /** getter for End - gets 
   * @generated */
  public int getEnd() {
    if (genetag_Type.featOkTst && ((genetag_Type)jcasType).casFeat_End == null)
      jcasType.jcas.throwFeatMissing("End", "model.genetag");
    return jcasType.ll_cas.ll_getIntValue(addr, ((genetag_Type)jcasType).casFeatCode_End);}
    
  /** setter for End - sets  
   * @generated */
  public void setEnd(int v) {
    if (genetag_Type.featOkTst && ((genetag_Type)jcasType).casFeat_End == null)
      jcasType.jcas.throwFeatMissing("End", "model.genetag");
    jcasType.ll_cas.ll_setIntValue(addr, ((genetag_Type)jcasType).casFeatCode_End, v);}    
  }

    