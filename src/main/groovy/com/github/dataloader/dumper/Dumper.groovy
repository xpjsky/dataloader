package com.github.dataloader.dumper

import com.github.dataloader.rdbms.Schema

import java.sql.Connection;

/**
 * Created by pxie on 1/13/16.
 */
interface Dumper {

    void dump(Connection connection, Schema schema)

}
