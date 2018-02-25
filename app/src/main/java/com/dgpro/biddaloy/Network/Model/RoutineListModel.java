package com.dgpro.biddaloy.Network.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Babu on 1/25/2018.
 */

public class RoutineListModel {

    @SerializedName("error")
    private String error;

    @SerializedName("error_report")
    private String error_report;

    @SerializedName("student_id")
    private String student_id;

    @SerializedName("student_name")
    private String student_name;

    @SerializedName("routine_name")
    private List<RoutineDataModel> routine_name = null;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getError_report() {
        return error_report;
    }

    public void setError_report(String error_report) {
        this.error_report = error_report;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public List<RoutineDataModel> getRoutine_name() {
        return routine_name;
    }

    public void setRoutine_name(List<RoutineDataModel> routine_name) {
        this.routine_name = routine_name;
    }
}