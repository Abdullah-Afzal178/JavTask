package com.springboottask2.model;

public class TimeZone {
    private String name;
    private int offset;
    private String current_time;
    private long current_time_unix;
    private boolean is_dst;
    private int dst_savings;

    public TimeZone() {
    }

    public TimeZone(String name, int offset, String current_time, long current_time_unix, boolean is_dst, int dst_savings) {
        this.name = name;
        this.offset = offset;
        this.current_time = current_time;
        this.current_time_unix = current_time_unix;
        this.is_dst = is_dst;
        this.dst_savings = dst_savings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getCurrent_time() {
        return current_time;
    }

    public void setCurrent_time(String current_time) {
        this.current_time = current_time;
    }

    public long getCurrent_time_unix() {
        return current_time_unix;
    }

    public void setCurrent_time_unix(long current_time_unix) {
        this.current_time_unix = current_time_unix;
    }

    public boolean isIs_dst() {
        return is_dst;
    }

    public void setIs_dst(boolean is_dst) {
        this.is_dst = is_dst;
    }

    public int getDst_savings() {
        return dst_savings;
    }

    public void setDst_savings(int dst_savings) {
        this.dst_savings = dst_savings;
    }

    @Override
    public String toString() {
        return "{" +'\n'+
                " name:" + name + '\n' +
                " offset:" + offset +'\n' +
                " current_time:" + current_time + '\n' +
                " current_time_unix:" + current_time_unix +'\n' +
                " is_dst:" + is_dst +'\n' +
                " dst_savings:" + dst_savings +'\n' +
                '}';
    }
}
