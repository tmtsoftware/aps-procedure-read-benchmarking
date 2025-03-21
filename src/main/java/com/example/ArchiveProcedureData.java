package com.example;

import com.example.jooq.generated.tables.*;
import com.example.jooq.generated.tables.records.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

   public class ArchiveProcedureData {
        
       Integer archiveProcedureViewId;
       Long procedureId;
       String name;
       String datatype;
       Integer dim1;
       Integer dim2;
       String scalarDataString;
       String encodedArrayData;
       LocalDateTime timestamp;
       
        public ArchiveProcedureData(ArchiveprocedureviewRecord archiveRecord) {
            
            archiveProcedureViewId = archiveRecord.getArchiveprocedureviewid();
            procedureId = archiveRecord.getProcedureid();
            name = archiveRecord.getName();
            datatype = archiveRecord.getDatatype();
            dim1 = archiveRecord.getDim1();
            dim2 = archiveRecord.getDim2();
            scalarDataString = archiveRecord.getScalardatastring();
            encodedArrayData = archiveRecord.getEncodedarraydata();
            timestamp = archiveRecord.getTimestamp();
        }
       
        public void getValue() {
            if (datatype.equals("Integer")) {
                if (dim1 == null || dim1 == 0) {
                    getIntValue(scalarDataString);
                } else if (dim2 == 0) {
                    getOneDimIntArrayValue(encodedArrayData);
                } else {
                    getTwoDimIntArrayValue(encodedArrayData);
                }
            }
            if (datatype.equals("Float")) {
                if (dim1 == null || dim1 == 0) {
                    getFloatValue(scalarDataString);
                } else if (dim2 == 0) {
                    getOneDimFloatArrayValue(encodedArrayData);
                } else {
                    getTwoDimFloatArrayValue(encodedArrayData);
                }
            }
            if (datatype.equals("Timestamp")) {
                getTimestampValue(scalarDataString);
            }
        }
       
        int getIntValue(String string) {
            return Integer.parseInt(string);
        }
       
        float getFloatValue(String string) {
            return Float.parseFloat(string);
        }
       
        LocalTime getTimestampValue(String string) {
            
            // Parse the time
            return LocalTime.parse(string);
 
        }
       
        int[] getOneDimIntArrayValue(String string) {
           
            String[] stringArray = string.replaceAll("[{}\"]", "").split(",");
            int[] intArray = Arrays.stream(stringArray)
                           .mapToInt(Integer::parseInt)
                           .toArray();
            return intArray;
        }
             
        int[][] getTwoDimIntArrayValue(String string) {
          
            // Remove outer braces and split into individual row strings
            String[] rowStrings = string.replaceAll("[{}]", "").split("\\},\\{");

            // Convert to 2D int array
            int[][] intArray = Arrays.stream(rowStrings)
                             .map(row -> Arrays.stream(row.split(","))
                                               .mapToInt(Integer::parseInt)
                                               .toArray()
                             )
                             .toArray(int[][]::new);

            // return the result
            return intArray;

        }
       
        float[] getOneDimFloatArrayValue(String string) {
           
            String[] stringArray = string.replaceAll("[{}\"]", "").split(",");

            // Convert String[] to float[]
            float[] floatArray = new float[stringArray.length];
            for (int i = 0; i < stringArray.length; i++) {
                floatArray[i] = Float.parseFloat(stringArray[i]); // Convert to float
            }
            return floatArray;
        }
            
        float[][] getTwoDimFloatArrayValue(String string) {
            
            // Remove outer braces and split into individual row strings
            String[] rowStrings = string.replaceAll("[{}]", "").split("\\},\\{");


            // Convert to 2D float array
            // Convert to 2D float array
            // Convert to 2D float array
        float[][] floatArray = Arrays.stream(rowStrings)
                                     .map(row -> Arrays.stream(row.split(","))
                                                       .mapToDouble(Double::parseDouble) // Convert to double (since mapToFloat doesn't exist)
                                                       .map(d -> (float) d) // Convert double to float
                                                       .toArray()
                                     )
                                     .map(dArr -> {
                                         float[] fArr = new float[dArr.length];
                                         for (int i = 0; i < dArr.length; i++) {
                                             fArr[i] = (float) dArr[i]; // Convert each double to float
                                         }
                                         return fArr;
                                     })
                                     .toArray(float[][]::new); // Collect into 2D float array



            // return the result
            return floatArray;
            
        }
   }
     