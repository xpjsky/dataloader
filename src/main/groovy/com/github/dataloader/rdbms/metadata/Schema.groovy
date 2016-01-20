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

    String name;

    List<Table> tables = [];

    List<View> views = [];

    List<Function> functions = [];

    List<Procedure> procedures = [];

    List<Trigger> triggers = [];


}
