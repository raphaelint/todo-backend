package com.interview.project.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class ReportSchedule {
    @JsonProperty("name")
    private String name;

    @JsonProperty("file_upload")
    private String fileUpload;

    @JsonProperty("total_amount")
    private double totalAmount;

    @JsonProperty("delivery_channel")
    private String deliveryChannel;

    @JsonProperty("schedule_type")
    private String scheduleType;

    @JsonProperty("start_date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private SimpleDateFormat startDate;

    @JsonProperty("end_date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private SimpleDateFormat endDate;

    @JsonProperty("time_of_day")
    private SimpleDateFormat timeOfDay;

    @JsonProperty("day_of_month")
    private int dayOfMonth;

    @JsonProperty("specific_date")
    private SimpleDateFormat specificDate;

    @JsonProperty("day_of_week")
    private String dayOfWeek;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileUpload() {
        return fileUpload;
    }

    public void setFileUpload(String fileUpload) {
        this.fileUpload = fileUpload;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDeliveryChannel() {
        return deliveryChannel;
    }

    public void setDeliveryChannel(String deliveryChannel) {
        this.deliveryChannel = deliveryChannel;
    }

    public String getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public SimpleDateFormat getStartDate() {
        return startDate;
    }

    public void setStartDate(SimpleDateFormat startDate) {
        this.startDate = startDate;
    }

    public SimpleDateFormat getEndDate() {
        return endDate;
    }

    public void setEndDate(SimpleDateFormat endDate) {
        this.endDate = endDate;
    }

    public SimpleDateFormat getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(SimpleDateFormat timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public SimpleDateFormat getSpecificDate() {
        return specificDate;
    }

    public void setSpecificDate(SimpleDateFormat specificDate) {
        this.specificDate = specificDate;
    }
}
