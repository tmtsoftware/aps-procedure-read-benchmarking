/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.generated.tables.records;


import com.example.jooq.generated.tables.Proceduresummaryview;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProceduresummaryviewRecord extends UpdatableRecordImpl<ProceduresummaryviewRecord> implements Record7<Integer, Long, Long, String, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>public.proceduresummaryview.proceduresummaryviewid</code>.
     */
    public void setProceduresummaryviewid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>public.proceduresummaryview.proceduresummaryviewid</code>.
     */
    public Integer getProceduresummaryviewid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.proceduresummaryview.sessionid</code>.
     */
    public void setSessionid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.proceduresummaryview.sessionid</code>.
     */
    public Long getSessionid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.proceduresummaryview.procedureid</code>.
     */
    public void setProcedureid(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.proceduresummaryview.procedureid</code>.
     */
    public Long getProcedureid() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.proceduresummaryview.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.proceduresummaryview.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.proceduresummaryview.datatype</code>.
     */
    public void setDatatype(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.proceduresummaryview.datatype</code>.
     */
    public String getDatatype() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.proceduresummaryview.scalardatastring</code>.
     */
    public void setScalardatastring(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.proceduresummaryview.scalardatastring</code>.
     */
    public String getScalardatastring() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.proceduresummaryview.timestamp</code>.
     */
    public void setTimestamp(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.proceduresummaryview.timestamp</code>.
     */
    public LocalDateTime getTimestamp() {
        return (LocalDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Long, Long, String, String, String, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Integer, Long, Long, String, String, String, LocalDateTime> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Proceduresummaryview.PROCEDURESUMMARYVIEW.PROCEDURESUMMARYVIEWID;
    }

    @Override
    public Field<Long> field2() {
        return Proceduresummaryview.PROCEDURESUMMARYVIEW.SESSIONID;
    }

    @Override
    public Field<Long> field3() {
        return Proceduresummaryview.PROCEDURESUMMARYVIEW.PROCEDUREID;
    }

    @Override
    public Field<String> field4() {
        return Proceduresummaryview.PROCEDURESUMMARYVIEW.NAME;
    }

    @Override
    public Field<String> field5() {
        return Proceduresummaryview.PROCEDURESUMMARYVIEW.DATATYPE;
    }

    @Override
    public Field<String> field6() {
        return Proceduresummaryview.PROCEDURESUMMARYVIEW.SCALARDATASTRING;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return Proceduresummaryview.PROCEDURESUMMARYVIEW.TIMESTAMP;
    }

    @Override
    public Integer component1() {
        return getProceduresummaryviewid();
    }

    @Override
    public Long component2() {
        return getSessionid();
    }

    @Override
    public Long component3() {
        return getProcedureid();
    }

    @Override
    public String component4() {
        return getName();
    }

    @Override
    public String component5() {
        return getDatatype();
    }

    @Override
    public String component6() {
        return getScalardatastring();
    }

    @Override
    public LocalDateTime component7() {
        return getTimestamp();
    }

    @Override
    public Integer value1() {
        return getProceduresummaryviewid();
    }

    @Override
    public Long value2() {
        return getSessionid();
    }

    @Override
    public Long value3() {
        return getProcedureid();
    }

    @Override
    public String value4() {
        return getName();
    }

    @Override
    public String value5() {
        return getDatatype();
    }

    @Override
    public String value6() {
        return getScalardatastring();
    }

    @Override
    public LocalDateTime value7() {
        return getTimestamp();
    }

    @Override
    public ProceduresummaryviewRecord value1(Integer value) {
        setProceduresummaryviewid(value);
        return this;
    }

    @Override
    public ProceduresummaryviewRecord value2(Long value) {
        setSessionid(value);
        return this;
    }

    @Override
    public ProceduresummaryviewRecord value3(Long value) {
        setProcedureid(value);
        return this;
    }

    @Override
    public ProceduresummaryviewRecord value4(String value) {
        setName(value);
        return this;
    }

    @Override
    public ProceduresummaryviewRecord value5(String value) {
        setDatatype(value);
        return this;
    }

    @Override
    public ProceduresummaryviewRecord value6(String value) {
        setScalardatastring(value);
        return this;
    }

    @Override
    public ProceduresummaryviewRecord value7(LocalDateTime value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public ProceduresummaryviewRecord values(Integer value1, Long value2, Long value3, String value4, String value5, String value6, LocalDateTime value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProceduresummaryviewRecord
     */
    public ProceduresummaryviewRecord() {
        super(Proceduresummaryview.PROCEDURESUMMARYVIEW);
    }

    /**
     * Create a detached, initialised ProceduresummaryviewRecord
     */
    public ProceduresummaryviewRecord(Integer proceduresummaryviewid, Long sessionid, Long procedureid, String name, String datatype, String scalardatastring, LocalDateTime timestamp) {
        super(Proceduresummaryview.PROCEDURESUMMARYVIEW);

        setProceduresummaryviewid(proceduresummaryviewid);
        setSessionid(sessionid);
        setProcedureid(procedureid);
        setName(name);
        setDatatype(datatype);
        setScalardatastring(scalardatastring);
        setTimestamp(timestamp);
    }
}
