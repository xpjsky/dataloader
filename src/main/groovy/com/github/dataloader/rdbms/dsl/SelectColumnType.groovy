package com.github.dataloader.rdbms.dsl

import com.github.dataloader.rdbms.metadata.Column
import com.github.dataloader.rdbms.metadata.DataTypes

/**
 * Created by pxie on 1/19/16.
 */
class SelectColumnType {

    Column column;

    SelectColumnType(Column column) {
        this.column = column
    }

    def varchar(length = null) {
        column.type = DataTypes.VARCHAR
        column
    }

    def getInteger() {
        column.type = DataTypes.INTEGER
        column
    }

}
