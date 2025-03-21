# aps-procedure-read-benchmarking
A Java based program to populate and readout rows of data from the APS PEAS ArchiveProcedureView table.

This is a MAVEN project

## Implementing the Table
Run psql 

psql -U postgres

Can log in as postgres/postgres

To work with peas database use “\c peas” at psql command line

Create the ArchiveProcedureView table

CREATE TABLE ArchiveProcedureView (

<div style="margin-left: 40px;">
  
  archiveProcedureViewId SERIAL PRIMARY KEY,
  
  procedureId BIGINT NOT NULL,
  
  name VARCHAR(32) NOT NULL,
  
  datatype VARCHAR(100) NOT NULL, 
  
  dim1 INTEGER NOT NULL,
  
  dim2 INTEGER NOT NULL,
  
  ScalarDataString VARCHAR(100),
  
  EncodedArrayData VARCHAR(125000),
  
  Timestamp TIMESTAMP NOT NULL

</div>
);

## Compile and Run

### Compiling the code

mvn clean compile

### Running the code

mvn exec:java -Dexec.mainClass="com.example.App"

