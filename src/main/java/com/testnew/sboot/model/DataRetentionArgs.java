package com.testnew.sboot.model;

import lombok.Data;

@Data
public class DataRetentionArgs {
    public String date;
    public String mode; // full-day, half-day, all

}
