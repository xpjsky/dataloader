package com.github.dataloader.rdbms.metadata

/**
 * Created by pxie on 1/19/16.
 */
class Column {

    Table table

    String name
    String type

    boolean unique
    boolean nullable
    def defaultValue


    def not_null() {
        this.nullable = false
        this
    }

    def default_value(value) {
        this.defaultValue = value
        this
    }

    def unique() {
        this.unique = true;
        this
    }


}
