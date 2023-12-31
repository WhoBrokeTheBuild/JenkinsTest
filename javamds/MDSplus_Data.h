/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class MDSplus_Data */

#ifndef _Included_MDSplus_Data
#define _Included_MDSplus_Data
#ifdef __cplusplus
extern "C"
{
#endif
#undef MDSplus_Data_DTYPE_BU
#define MDSplus_Data_DTYPE_BU 2L
#undef MDSplus_Data_DTYPE_WU
#define MDSplus_Data_DTYPE_WU 3L
#undef MDSplus_Data_DTYPE_LU
#define MDSplus_Data_DTYPE_LU 4L
#undef MDSplus_Data_DTYPE_QU
#define MDSplus_Data_DTYPE_QU 5L
#undef MDSplus_Data_DTYPE_OU
#define MDSplus_Data_DTYPE_OU 25L
#undef MDSplus_Data_DTYPE_B
#define MDSplus_Data_DTYPE_B 6L
#undef MDSplus_Data_DTYPE_W
#define MDSplus_Data_DTYPE_W 7L
#undef MDSplus_Data_DTYPE_L
#define MDSplus_Data_DTYPE_L 8L
#undef MDSplus_Data_DTYPE_Q
#define MDSplus_Data_DTYPE_Q 9L
#undef MDSplus_Data_DTYPE_O
#define MDSplus_Data_DTYPE_O 26L
#undef MDSplus_Data_DTYPE_FLOAT
#define MDSplus_Data_DTYPE_FLOAT 52L
#undef MDSplus_Data_DTYPE_DOUBLE
#define MDSplus_Data_DTYPE_DOUBLE 53L
#undef MDSplus_Data_DTYPE_T
#define MDSplus_Data_DTYPE_T 14L
#undef MDSplus_Data_DTYPE_IDENT
#define MDSplus_Data_DTYPE_IDENT 191L
#undef MDSplus_Data_DTYPE_NID
#define MDSplus_Data_DTYPE_NID 192L
#undef MDSplus_Data_DTYPE_PATH
#define MDSplus_Data_DTYPE_PATH 193L
#undef MDSplus_Data_DTYPE_PARAM
#define MDSplus_Data_DTYPE_PARAM 194L
#undef MDSplus_Data_DTYPE_SIGNAL
#define MDSplus_Data_DTYPE_SIGNAL 195L
#undef MDSplus_Data_DTYPE_DIMENSION
#define MDSplus_Data_DTYPE_DIMENSION 196L
#undef MDSplus_Data_DTYPE_WINDOW
#define MDSplus_Data_DTYPE_WINDOW 197L
#undef MDSplus_Data_DTYPE_SLOPE
#define MDSplus_Data_DTYPE_SLOPE 198L
#undef MDSplus_Data_DTYPE_FUNCTION
#define MDSplus_Data_DTYPE_FUNCTION 199L
#undef MDSplus_Data_DTYPE_CONGLOM
#define MDSplus_Data_DTYPE_CONGLOM 200L
#undef MDSplus_Data_DTYPE_RANGE
#define MDSplus_Data_DTYPE_RANGE 201L
#undef MDSplus_Data_DTYPE_ACTION
#define MDSplus_Data_DTYPE_ACTION 202L
#undef MDSplus_Data_DTYPE_DISPATCH
#define MDSplus_Data_DTYPE_DISPATCH 203L
#undef MDSplus_Data_DTYPE_PROGRAM
#define MDSplus_Data_DTYPE_PROGRAM 204L
#undef MDSplus_Data_DTYPE_ROUTINE
#define MDSplus_Data_DTYPE_ROUTINE 205L
#undef MDSplus_Data_DTYPE_PROCEDURE
#define MDSplus_Data_DTYPE_PROCEDURE 206L
#undef MDSplus_Data_DTYPE_METHOD
#define MDSplus_Data_DTYPE_METHOD 207L
#undef MDSplus_Data_DTYPE_DEPENDENCY
#define MDSplus_Data_DTYPE_DEPENDENCY 208L
#undef MDSplus_Data_DTYPE_CONDITION
#define MDSplus_Data_DTYPE_CONDITION 209L
#undef MDSplus_Data_DTYPE_EVENT
#define MDSplus_Data_DTYPE_EVENT 210L
#undef MDSplus_Data_DTYPE_WITH_UNITS
#define MDSplus_Data_DTYPE_WITH_UNITS 211L
#undef MDSplus_Data_DTYPE_CALL
#define MDSplus_Data_DTYPE_CALL 212L
#undef MDSplus_Data_DTYPE_WITH_ERROR
#define MDSplus_Data_DTYPE_WITH_ERROR 213L
#undef MDSplus_Data_DTYPE_LIST
#define MDSplus_Data_DTYPE_LIST 214L
#undef MDSplus_Data_DTYPE_TUPLE
#define MDSplus_Data_DTYPE_TUPLE 215L
#undef MDSplus_Data_DTYPE_DICTIONARY
#define MDSplus_Data_DTYPE_DICTIONARY 216L
#undef MDSplus_Data_DTYPE_DSC
#define MDSplus_Data_DTYPE_DSC 24L
#undef MDSplus_Data_TreeNEGATE_CONDITION
#define MDSplus_Data_TreeNEGATE_CONDITION 7L
#undef MDSplus_Data_TreeIGNORE_UNDEFINED
#define MDSplus_Data_TreeIGNORE_UNDEFINED 8L
#undef MDSplus_Data_TreeIGNORE_STATUS
#define MDSplus_Data_TreeIGNORE_STATUS 9L
#undef MDSplus_Data_TreeDEPENDENCY_AND
#define MDSplus_Data_TreeDEPENDENCY_AND 10L
#undef MDSplus_Data_TreeDEPENDENCY_OR
#define MDSplus_Data_TreeDEPENDENCY_OR 11L
#undef MDSplus_Data_CLASS_S
#define MDSplus_Data_CLASS_S 1L
#undef MDSplus_Data_CLASS_D
#define MDSplus_Data_CLASS_D 2L
#undef MDSplus_Data_CLASS_A
#define MDSplus_Data_CLASS_A 4L
#undef MDSplus_Data_CLASS_R
#define MDSplus_Data_CLASS_R 194L
#undef MDSplus_Data_CLASS_APD
#define MDSplus_Data_CLASS_APD 196L
  /*
 * Class:     MDSplus_Data
 * Method:    compile
 * Signature: (Ljava/lang/String;[LMDSplus/Data;)LMDSplus/Data;
 */
  JNIEXPORT jobject JNICALL Java_MDSplus_Data_compile(JNIEnv *, jclass, jstring,
                                                      jobjectArray);

  /*
 * Class:     MDSplus_Data
 * Method:    execute
 * Signature: (Ljava/lang/String;[LMDSplus/Data;)LMDSplus/Data;
 */
  JNIEXPORT jobject JNICALL Java_MDSplus_Data_execute(JNIEnv *, jclass, jstring,
                                                      jobjectArray);

  /*
 * Class:     MDSplus_Data
 * Method:    decompile
 * Signature: (J)Ljava/lang/String;
 */
  JNIEXPORT jstring JNICALL Java_MDSplus_Data_decompile(JNIEnv *, jobject, jlong);

  /*
 * Class:     MDSplus_Data
 * Method:    cloneData
 * Signature: ()LMDSplus/Data;
 */
  JNIEXPORT jobject JNICALL Java_MDSplus_Data_cloneData(JNIEnv *, jobject);

  /*
 * Class:     MDSplus_Data
 * Method:    dataData
 * Signature: ()LMDSplus/Data;
 */
  JNIEXPORT jobject JNICALL Java_MDSplus_Data_dataData(JNIEnv *, jobject, jlong);

  /*
 * Class:     MDSplus_Data
 * Method:    evaluateData
 * Signature: (J)LMDSplus/String;
 */
  JNIEXPORT jobject JNICALL Java_MDSplus_Data_evaluateData(JNIEnv *, jobject,
                                                           jlong);

  /*
 * Class:     MDSplus_Data
 * Method:    serialize
 * Signature: ()[B
 */
  JNIEXPORT jbyteArray JNICALL Java_MDSplus_Data_serialize(JNIEnv *, jobject);

  /*
 * Class:     MDSplus_Data
 * Method:    deserialize
 * Signature: ([B)LMDSplus/Data;
 */
  JNIEXPORT jobject JNICALL Java_MDSplus_Data_deserialize(JNIEnv *, jclass,
                                                          jbyteArray);

  /*
 * Class:     MDSplus_Data
 * Method:    convertToDate
 * Signature: (J)Ljava/lang/String;
 */
  JNIEXPORT jstring JNICALL Java_MDSplus_Data_convertToDate(JNIEnv *, jclass,
                                                            jlong);

  /*
 * Class:     MDSplus_Data
 * Method:    getTime
 * Signature: ()J
 */
  JNIEXPORT jlong JNICALL Java_MDSplus_Data_getTime(JNIEnv *, jclass);

#ifdef __cplusplus
}
#endif
#endif
