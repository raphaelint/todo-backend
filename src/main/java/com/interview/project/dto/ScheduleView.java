package com.interview.project.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ScheduleView {
    @JsonProperty("name")
    private String name;

    @JsonProperty("schedule_type")
    private String scheduleType;

    @JsonProperty("start_date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private LocalDateTime startDate;

    @JsonProperty("end_date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private LocalDateTime endDate;

    @JsonProperty("time_of_day")
    private LocalDateTime timeOfDay;

    @JsonProperty("day_of_month")
    private int dayOfMonth;

    @JsonProperty("specific_date")
    private LocalDateTime specificDate;

    @JsonProperty("day_of_week")
    private String dayOfWeek;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public LocalDateTime getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(LocalDateTime timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public LocalDateTime getSpecificDate() {
        return specificDate;
    }

    public void setSpecificDate(LocalDateTime specificDate) {
        this.specificDate = specificDate;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
