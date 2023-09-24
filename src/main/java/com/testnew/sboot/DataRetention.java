package com.testnew.sboot;

import com.beust.jcommander.JCommander;
import com.testnew.sboot.model.DataRetentionArgs;

public class DataRetention {
    // pass date

    public static void main(String[] args) {
        // get arguments and validate arguments
        DataRetentionArgs dRetentionArgs = new DataRetentionArgs();
        JCommander.newBuilder()
                .addObject(dRetentionArgs)
                .build()
                .parse(args);
    }
}
