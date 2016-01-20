package com.github.dataloader.rdbms.dsl

import com.github.dataloader.rdbms.metadata.Schema
import com.github.dataloader.rdbms.metadata.Table

abstract class DLBaseScript extends Script {

    Schema schema;

    @Override
    Object run() {
        schema = new Schema();

        parse();

        return schema
    }


    abstract void parse();

    def table(tableName) {
        Table table = new Table(name: tableName)

        schema.tables.add(table);

        return [is: { closure ->
            closure.delegate = table
            closure()
        }]
    }

}