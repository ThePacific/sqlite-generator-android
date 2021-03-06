/**
 * =============================
 * Generated by SQLiteGenerator
 * Copyright (C) 2016 UsherBaby
 * =============================
 *
 * Code for table : employee
 * Columns: (departmentId ,name ,id)
 */

package com.example.ipad.unix.model;

import android.database.Cursor;
import android.util.Log;

public class Employee extends SuperModel {

    private Integer departmentId;
    private String name;
    private int id;

    public Employee() {
        tableName = "employee";
    }

    public Integer getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public Object[] getUpdateSql() {
        Object[] objects = new Object[4];
        objects[0] = "update employee set departmentId=?, name=? where id=?;";
        objects[1] = this.departmentId;
        objects[2] = this.name;
        objects[3] = this.id;
        return objects;
    }

    @Override
    public Object[] getInsertSql() {
        Object[] objects = new Object[4];
        objects[0] = "insert into employee (departmentId, name, id) values (? ,? ,?);";
        objects[1] = this.departmentId;
        objects[2] = this.name;
        objects[3] = this.id;
        return objects;
    }

    @Override
    public Object[] getDeleteSql() {
        Object[] objects = new Object[2];
        objects[0] = "delete from employee where id=?";
        objects[1] = this.id;
        return objects;
    }

    @Override
    public void initValues(Cursor cursor) {
        try {
            if (cursor.getColumnIndex("departmentId") >= 0) {
                this.departmentId = cursor.getInt(cursor.getColumnIndex("departmentId"));
            }
            if (cursor.getColumnIndex("name") >= 0) {
                this.name = cursor.getString(cursor.getColumnIndex("name"));
            }
            if (cursor.getColumnIndex("id") >= 0) {
                this.id = cursor.getInt(cursor.getColumnIndex("id"));
            }
        } catch (Exception e) {
            Log.e("Employee.initValue()", e.toString());
        }
    }
}