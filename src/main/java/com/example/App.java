package com.example;

import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import com.example.jooq.generated.tables.*;
import com.example.jooq.generated.tables.records.*;
import java.time.LocalDateTime;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Random;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class App {
    public static void main(String[] args) throws SQLException {
        // Set up the database connection
        String url = "jdbc:postgresql://localhost:5432/peas";
        String user = "postgres";
        String password = "postgres";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // Create DSLContext (jOOQ’s main interface)
            DSLContext create = DSL.using(conn);

            // create seven nights of data
            //createSevenNightsOfProcedureData(create);
            
            // benchmark reading rows
            benchMarkTestReadProcedure(create);
             
        }
    }
    
    public static void benchMarkTestReadProcedure(DSLContext create) {
        for (int i=0; i<20; i++) {
                Long procedureId = Long.valueOf(randIntString(2));
            // Select data from ArchivedProcedureView table
            long startTime = System.nanoTime();  // Capture start time
            
            create.selectFrom(Archiveprocedureview.ARCHIVEPROCEDUREVIEW)
                  .where(Archiveprocedureview.ARCHIVEPROCEDUREVIEW.PROCEDUREID.eq(procedureId))
                  .fetch()
                  .forEach(archiveRecord -> {
                      // load onto a record with the same fields, but with conversion routines
                      ArchiveProcedureData data = new ArchiveProcedureData(archiveRecord);
                      // extract value as int, float, timestamp or 1-d or 2-d array of int or float
                      data.getValue();
                  });
            
            long endTime = System.nanoTime();  // Capture end time
            long duration = endTime - startTime; // Calculate duration

           
            System.out.println("Query on Procedure record " + procedureId + ",  Execution time: " + (duration / 1_000_000.0) + " milliseconds");
        }

    }
    
    public static void createSevenNightsOfProcedureData(DSLContext create) {
        createObservingNightOfProcedureData(create, 1);
        createObservingNightOfProcedureData(create, 21);
        createObservingNightOfProcedureData(create, 41);
        createObservingNightOfProcedureData(create, 61);
        createObservingNightOfProcedureData(create, 81);
        createObservingNightOfProcedureData(create, 101);        
        createObservingNightOfProcedureData(create, 121);
    }
        
    public static void createObservingNightOfProcedureData(DSLContext create, int procedureIdStart) {
        createCalibrationStore(create, procedureIdStart);
        createCalibrationStore(create, procedureIdStart+1);
        createCalibrationStore(create, procedureIdStart+2);
        
        createProcedureStore(create, procedureIdStart+3);
        createProcedureStore(create, procedureIdStart+4);
        createProcedureStore(create, procedureIdStart+5);
        createProcedureStore(create, procedureIdStart+6);
        createProcedureStore(create, procedureIdStart+7);
        createProcedureStore(create, procedureIdStart+8);
        createProcedureStore(create, procedureIdStart+9);
        createProcedureStore(create, procedureIdStart+10);
        createProcedureStore(create, procedureIdStart+11);
        createProcedureStore(create, procedureIdStart+12);
        createProcedureStore(create, procedureIdStart+13);
        createProcedureStore(create, procedureIdStart+14);
        createProcedureStore(create, procedureIdStart+15);
        createProcedureStore(create, procedureIdStart+16);
        createProcedureStore(create, procedureIdStart+17);
        createProcedureStore(create, procedureIdStart+18);
        createProcedureStore(create, procedureIdStart+19);
    }
    
    
    public static void createCalibrationStore(DSLContext create, int procedureId) {
        // Insert a new record into Archivedproedureview table
        
        for (int i=1; i<43; i++)
            createRecord(create, procedureId, "CalibrationData" + i, "Float", 492, 2, "", encodedFloatArrayString(6, 492, 2), LocalDateTime.now()); 
    }
    
 
    public static void createProcedureStore(DSLContext create, int procedureId) {
        // Insert a new record into Archivedproedureview table

        createRecord(create, procedureId, "Setup1", "Integer", 0, 0, randIntString(1), "", LocalDateTime.now());
        createRecord(create, procedureId, "Setup2", "Integer", 0, 0, randIntString(1), "", LocalDateTime.now());
        createRecord(create, procedureId, "Setup3", "Float", 0, 0, randFloatString(4), "", LocalDateTime.now());
        createRecord(create, procedureId, "Setup4", "Integer", 0, 0, randIntString(1), "", LocalDateTime.now());
        createRecord(create, procedureId, "Setup5", "String", 0, 0, "twentycharacters", "", LocalDateTime.now());
        createRecord(create, procedureId, "Setup6", "Integer", 0, 0, randIntString(2), "", LocalDateTime.now());
        createRecord(create, procedureId, "Setup7", "Integer", 0, 0, randIntString(3), "", LocalDateTime.now());
        createRecord(create, procedureId, "Exec1", "Integer", 0, 0, randIntString(1), "", LocalDateTime.now());
        createRecord(create, procedureId, "Exec2", "Timestamp", 0, 0, "14:34:54", "", LocalDateTime.now());
        createRecord(create, procedureId, "Exec3", "Timestamp", 0, 0, "14:34:54", "", LocalDateTime.now());
        for (int i=4; i<104; i++)
            createRecord(create, procedureId, "Exec"+i, "Timestamp", 0, 0, "14:34:54", "", LocalDateTime.now());
        for (int i=104; i<204; i++) 
            createRecord(create, procedureId, "Exec"+i, "String", 0, 0, randString(100), "", LocalDateTime.now());
        for (int i=1; i<14; i++) 
            createRecord(create, procedureId, "State"+i, "Integer", 0, 0, randIntString(4), "", LocalDateTime.now());

        for (int i=14; i<29; i++) 
            createRecord(create, procedureId, "State"+i, "Float", 0, 0, randFloatString(6), "", LocalDateTime.now());

        for (int i=1; i<73; i++) 
            createRecord(create, procedureId, "FrameLogIntData"+i, "String", 0, 0, randIntString(4), "", LocalDateTime.now());
        for (int i=1; i<113; i++) 
            createRecord(create, procedureId, "FrameLogFloatData"+i, "String", 0, 0, randFloatString(6), "", LocalDateTime.now());


        for (int i=1; i<7; i++) 
            createRecord(create, procedureId, "ProcLogIntData"+i, "String", 0, 0, randIntString(4), "", LocalDateTime.now());
        for (int i=1; i<23; i++) 
            createRecord(create, procedureId, "ProcLogFloatData"+i, "String", 0, 0, randFloatString(6), "", LocalDateTime.now());

        createRecord(create, procedureId, "ProcLogs2DIntData1", "Integer", 492, 3, "", encodedIntArrayString(4, 492, 3), LocalDateTime.now()); 
        createRecord(create, procedureId, "ProcLogs2DIntData2", "Integer", 492, 3, "", encodedIntArrayString(4, 492, 3), LocalDateTime.now());
        createRecord(create, procedureId, "ProcLogs2DIntData3", "Integer", 62484, 3, "", encodedIntArrayString(4, 62484, 0), LocalDateTime.now());
        createRecord(create, procedureId, "ProcLogs2DFloatData1", "Float", 62484, 0, "", encodedFloatArrayString(6, 62484, 0), LocalDateTime.now());
        createRecord(create, procedureId, "ProcLogs2DFloatData2", "Float", 492, 0, "", encodedFloatArrayString(6, 492, 0), LocalDateTime.now());


        // all iteration report data
        for (int j=1; j<9; j++) {
            for (int i=1; i<7; i++) 
                createRecord(create, procedureId, "Iter"+j+"LogIntData"+i, "String", 0, 0, randIntString(4), "", LocalDateTime.now());
            for (int i=1; i<23; i++) 
                createRecord(create, procedureId, "Iter"+j+"LogFloatData"+i, "String", 0, 0, randFloatString(6), "", LocalDateTime.now());
            createRecord(create, procedureId, "Iter"+j+"Logs2DIntData1", "Integer", 492, 3, "", encodedIntArrayString(4, 492, 3), LocalDateTime.now()); 
            createRecord(create, procedureId, "Iter"+j+"Logs2DIntData2", "Integer", 492, 3, "", encodedIntArrayString(4, 492, 3), LocalDateTime.now());
            createRecord(create, procedureId, "Iter"+j+"Logs2DIntData3", "Integer", 62484, 3, "", encodedIntArrayString(4, 62484, 0), LocalDateTime.now());
            createRecord(create, procedureId, "Iter"+j+"Logs2DFloatData1", "Float", 62484, 0, "", encodedFloatArrayString(6, 62484, 0), LocalDateTime.now());
            createRecord(create, procedureId, "Iter"+j+"Logs2DFloatData2", "Float", 492, 0, "", encodedFloatArrayString(6, 492, 0), LocalDateTime.now());

        }

        for (int i=1; i<9; i++) 
            createRecord(create, procedureId, "ExposureCentroids" + i, "Float", 62484, 2, "", encodedIntArrayString(6, 62484, 2), LocalDateTime.now());
        for (int i=1; i<9; i++) 
            createRecord(create, procedureId, "ExposureCentroidOffsets" + i, "Float", 62484, 2, "", encodedIntArrayString(6, 62484, 2), LocalDateTime.now());

        createRecord(create, procedureId, "GlobalTipTiltPistons", "Float", 492, 6, "", encodedFloatArrayString(6, 492, 6), LocalDateTime.now());    
        createRecord(create, procedureId, "WHDataLabels", "Int", 492, 21, "", encodedIntArrayString(2, 492, 21), LocalDateTime.now());    
        createRecord(create, procedureId, "WHData", "Int", 492, 21, "", encodedFloatArrayString(6, 492, 21), LocalDateTime.now());    
        createRecord(create, procedureId, "WHDataLimits", "Int", 492, 21, "", encodedFloatArrayString(6, 492, 21), LocalDateTime.now());    

    }
    
    
    public static void createRecord(DSLContext create, int procId, String name, String datatype, int dim1, int dim2, String scalarString,
                               String arrayString, LocalDateTime timestamp) {
        
        ArchiveprocedureviewRecord  newRecord = create.newRecord(Archiveprocedureview.ARCHIVEPROCEDUREVIEW);
            
            newRecord.setProcedureid(new Long(procId)); 
            newRecord.setName(name);
            newRecord.setDatatype(datatype); 
            newRecord.setDim1(dim1); 
            newRecord.setDim2(dim2); 
            newRecord.setScalardatastring(scalarString); 
            newRecord.setEncodedarraydata(arrayString);
            newRecord.setTimestamp(timestamp);
            newRecord.store();  // Save to the database
        
    }
     public static String randIntString(int decimals) {
        // Calculate the range of the random integer
        int min = (int) Math.pow(10, decimals - 1);
        int max = (int) Math.pow(10, decimals) - 1;
        
        // Generate a random integer within that range
        int randomInt = (int) (Math.random() * (max - min + 1)) + min;
        
        // Return the integer as a string
        return Integer.toString(randomInt);
    }
    public static String randFloatString(int decimals) {
        // Generate a random float between 0 and 100
        double random = Math.random() * 100;
        
        // Round it to the specified number of decimal places using BigDecimal
        BigDecimal bd = new BigDecimal(random).setScale(decimals, RoundingMode.HALF_UP);
        
        // Return the result as a string
        return bd.toString();
    }
    public static String randString(int length) {
        // Characters that can be used in the random string
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        
        // Create a Random object for random number generation
        Random random = new Random();
        
        // StringBuilder to build the random string
        StringBuilder randomString = new StringBuilder();
        
        // Loop to generate a string of the desired length
        for (int i = 0; i < length; i++) {
            // Randomly select a character from the allowed set
            int index = random.nextInt(characters.length());
            randomString.append(characters.charAt(index));
        }
        
        // Return the generated random string
        return randomString.toString();
    }
    
    public static String encodedIntArrayString(int length, int dim1, int dim2) {
        
        StringBuffer buf = new StringBuffer();
        
        buf.append("{");
        for (int i=0; i<dim1; i++) {
            
            if (dim2 == 0) {
                buf.append(randIntString(length));
                buf.append(",");
            } else {
                buf.append("{");
                for (int j = 0; j < dim2; j++) {
                    buf.append(randIntString(length));
                    buf.append(",");   
                }
                buf.append("}");
            }
        }
        buf.append("}");
        
        //System.out.println("buf = " + buf.toString());
        
        return buf.toString();
    }
    public static String encodedFloatArrayString(int length, int dim1, int dim2) {
        
        StringBuffer buf = new StringBuffer();
        
        buf.append("{");
        for (int i=0; i<dim1; i++) {
            
            if (dim2 == 0) {
                buf.append(randFloatString(length));
                buf.append(",");
            } else {
                buf.append("{");
                for (int j = 0; j < dim2; j++) {
                    buf.append(randFloatString(length));
                    buf.append(",");   
                }
                buf.append("}");
            }
        }
        buf.append("}");
        
        return buf.toString();
    }
    
    
}
