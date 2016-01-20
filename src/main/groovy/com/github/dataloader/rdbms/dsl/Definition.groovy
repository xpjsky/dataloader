package com.github.dataloader.rdbms.dsl

import org.omg.PortableInterceptor.USER_EXCEPTION


table 'USER' is {
    column 'id' integer
    column 'name' varchar(40) unique() not_null() default_value 'your name'
}

view 'USER_VW' is """
    select * from USER_VW
    where name like 'xie'
"""
//
//table 'USER' : {
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
