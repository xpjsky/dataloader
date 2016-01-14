package com.github.dataloader.rdbms;

/**
 * Created by pxie on 1/13/16.
 */
class Table {

    String name

    Column[] columns

    Constraint[] constraints


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

class Column {

    String name
    String type

    boolean nullable
    String defaultValue


}

class Constraint {

    enum Type {
        PK, FK, UNIQUE
    }

    String name
    Type type

}

class Index {
    boolean unique
    Column[] columns
}