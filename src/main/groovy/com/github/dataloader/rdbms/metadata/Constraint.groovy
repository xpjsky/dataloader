package com.github.dataloader.rdbms.metadata

/**
 * Created by pxie on 1/19/16.
 */
class Constraint {

    enum Type {
        PK, FK, UNIQUE
    }

    String name
    Type type


}
