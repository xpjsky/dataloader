package com.github.dataloader.loader

import com.github.dataloader.rdbms.Schema

import java.sql.Connection;

/**
 * Created by pxie on 1/13/16.
 */
interface Loader {

    void load(Connection connection, Schema schema)

}
