package com.github.dataloader.rdbms.dsl

import com.github.dataloader.rdbms.metadata.Table

class SimpleBinding extends Binding {
    @Override
    void setProperty(String property, Object newValue) {
        super.setProperty(property, newValue)
    }
}


class DSLScript extends Script {

    def table(String tableName, Closure definition) {
        Table table = new Table(name: tableName)
        definition.delegate = table
        definition()

        return table
    }

    @Override
    Object run() {
        def table = table 'USER',{
            column 'id' integer()
            column 'name' varchar(40) unique() not_null() default_value 'your name'
        }

        println table

        table
    }

}

//
//table 'USER' {
//    column 'id' 'float'
//    column 'name' varchar(40) unique NOT NULL default_value 3;
//    column 'age' integer
//
//    constraint 'pk_user'    primary_key 'id'
//    constraint 'fk_age'     foreign_key 'name, age' reference 'Age' 'name,age'
//    constraint 'uq_age'     unique
//    constraint 'df_age'     default_value 40
//
//    index unique 'idx_uq_age' 'age'
//}
