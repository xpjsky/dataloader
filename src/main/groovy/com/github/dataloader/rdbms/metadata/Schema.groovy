package com.github.dataloader.rdbms.metadata

import com.github.dataloader.rdbms.metadata.Function
import com.github.dataloader.rdbms.metadata.Procedure
import com.github.dataloader.rdbms.metadata.Table
import com.github.dataloader.rdbms.metadata.Trigger
import com.github.dataloader.rdbms.metadata.View

/**
 * Created by pxie on 1/13/16.
 */
class Schema {

    private String name;

    private List<Table> tables;

    private List<View> views;

    private List<Function> functions;

    private List<Procedure> procedures;

    private List<Trigger> triggers;


}
