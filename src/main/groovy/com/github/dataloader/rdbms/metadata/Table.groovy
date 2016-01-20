package com.github.dataloader.rdbms.metadata

import com.github.dataloader.rdbms.dsl.SelectColumnType;

/**
 * Created by pxie on 1/13/16.
 */
class Table {

    Schema schema

    String name

    List<Column> columns = []

    List<Constraint> constraints = []

    def column(String name) {
        Column column = new Column(name: name)
        columns.add(column);
        return new SelectColumnType(column)
    }

    def as1(Closure c) {

    }

}

class PrimaryKey extends Constraint {
    String[] columns
}

class ForeignKey extends Constraint {
    Column[] columns
    Table target
    PrimaryKey reference
}

class Unique extends Constraint {
    Column[] columns
}
