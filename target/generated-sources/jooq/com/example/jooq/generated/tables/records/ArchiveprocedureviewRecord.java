/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.generated.tables.records;


import com.example.jooq.generated.tables.Archiveprocedureview;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ArchiveprocedureviewRecord extends UpdatableRecordImpl<ArchiveprocedureviewRecord> implements Record9<Integer, Long, String, String, Integer, Integer, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>public.archiveprocedureview.archiveprocedureviewid</code>.
     */
    public void setArchiveprocedureviewid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>public.archiveprocedureview.archiveprocedureviewid</code>.
     */
    public Integer getArchiveprocedureviewid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.archiveprocedureview.procedureid</code>.
     */
    public void setProcedureid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.archiveprocedureview.procedureid</code>.
     */
    public Long getProcedureid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.archiveprocedureview.name</code>.
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.archiveprocedureview.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.archiveprocedureview.datatype</code>.
     */
    public void setDatatype(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.archiveprocedureview.datatype</code>.
     */
    public String getDatatype() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.archiveprocedureview.dim1</code>.
     */
    public void setDim1(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.archiveprocedureview.dim1</code>.
     */
    public Integer getDim1() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.archiveprocedureview.dim2</code>.
     */
    public void setDim2(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.archiveprocedureview.dim2</code>.
     */
    public Integer getDim2() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.archiveprocedureview.scalardatastring</code>.
     */
    public void setScalardatastring(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.archiveprocedureview.scalardatastring</code>.
     */
    public String getScalardatastring() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.archiveprocedureview.encodedarraydata</code>.
     */
    public void setEncodedarraydata(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.archiveprocedureview.encodedarraydata</code>.
     */
    public String getEncodedarraydata() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.archiveprocedureview.timestamp</code>.
     */
    public void setTimestamp(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.archiveprocedureview.timestamp</code>.
     */
    public LocalDateTime getTimestamp() {
        return (LocalDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, Long, String, String, Integer, Integer, String, String, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, Long, String, String, Integer, Integer, String, String, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Archiveprocedureview.ARCHIVEPROCEDUREVIEW.ARCHIVEPROCEDUREVIEWID;
    }

    @Override
    public Field<Long> field2() {
        return Archiveprocedureview.ARCHIVEPROCEDUREVIEW.PROCEDUREID;
    }

    @Override
    public Field<String> field3() {
        return Archiveprocedureview.ARCHIVEPROCEDUREVIEW.NAME;
    }

    @Override
    public Field<String> field4() {
        return Archiveprocedureview.ARCHIVEPROCEDUREVIEW.DATATYPE;
    }

    @Override
    public Field<Integer> field5() {
        return Archiveprocedureview.ARCHIVEPROCEDUREVIEW.DIM1;
    }

    @Override
    public Field<Integer> field6() {
        return Archiveprocedureview.ARCHIVEPROCEDUREVIEW.DIM2;
    }

    @Override
    public Field<String> field7() {
        return Archiveprocedureview.ARCHIVEPROCEDUREVIEW.SCALARDATASTRING;
    }

    @Override
    public Field<String> field8() {
        return Archiveprocedureview.ARCHIVEPROCEDUREVIEW.ENCODEDARRAYDATA;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return Archiveprocedureview.ARCHIVEPROCEDUREVIEW.TIMESTAMP;
    }

    @Override
    public Integer component1() {
        return getArchiveprocedureviewid();
    }

    @Override
    public Long component2() {
        return getProcedureid();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getDatatype();
    }

    @Override
    public Integer component5() {
        return getDim1();
    }

    @Override
    public Integer component6() {
        return getDim2();
    }

    @Override
    public String component7() {
        return getScalardatastring();
    }

    @Override
    public String component8() {
        return getEncodedarraydata();
    }

    @Override
    public LocalDateTime component9() {
        return getTimestamp();
    }

    @Override
    public Integer value1() {
        return getArchiveprocedureviewid();
    }

    @Override
    public Long value2() {
        return getProcedureid();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getDatatype();
    }

    @Override
    public Integer value5() {
        return getDim1();
    }

    @Override
    public Integer value6() {
        return getDim2();
    }

    @Override
    public String value7() {
        return getScalardatastring();
    }

    @Override
    public String value8() {
        return getEncodedarraydata();
    }

    @Override
    public LocalDateTime value9() {
        return getTimestamp();
    }

    @Override
    public ArchiveprocedureviewRecord value1(Integer value) {
        setArchiveprocedureviewid(value);
        return this;
    }

    @Override
    public ArchiveprocedureviewRecord value2(Long value) {
        setProcedureid(value);
        return this;
    }

    @Override
    public ArchiveprocedureviewRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public ArchiveprocedureviewRecord value4(String value) {
        setDatatype(value);
        return this;
    }

    @Override
    public ArchiveprocedureviewRecord value5(Integer value) {
        setDim1(value);
        return this;
    }

    @Override
    public ArchiveprocedureviewRecord value6(Integer value) {
        setDim2(value);
        return this;
    }

    @Override
    public ArchiveprocedureviewRecord value7(String value) {
        setScalardatastring(value);
        return this;
    }

    @Override
    public ArchiveprocedureviewRecord value8(String value) {
        setEncodedarraydata(value);
        return this;
    }

    @Override
    public ArchiveprocedureviewRecord value9(LocalDateTime value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public ArchiveprocedureviewRecord values(Integer value1, Long value2, String value3, String value4, Integer value5, Integer value6, String value7, String value8, LocalDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ArchiveprocedureviewRecord
     */
    public ArchiveprocedureviewRecord() {
        super(Archiveprocedureview.ARCHIVEPROCEDUREVIEW);
    }

    /**
     * Create a detached, initialised ArchiveprocedureviewRecord
     */
    public ArchiveprocedureviewRecord(Integer archiveprocedureviewid, Long procedureid, String name, String datatype, Integer dim1, Integer dim2, String scalardatastring, String encodedarraydata, LocalDateTime timestamp) {
        super(Archiveprocedureview.ARCHIVEPROCEDUREVIEW);

        setArchiveprocedureviewid(archiveprocedureviewid);
        setProcedureid(procedureid);
        setName(name);
        setDatatype(datatype);
        setDim1(dim1);
        setDim2(dim2);
        setScalardatastring(scalardatastring);
        setEncodedarraydata(encodedarraydata);
        setTimestamp(timestamp);
    }
}
