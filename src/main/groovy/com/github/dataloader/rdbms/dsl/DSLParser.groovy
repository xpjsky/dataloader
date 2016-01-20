package com.github.dataloader.rdbms.dsl

import org.codehaus.groovy.control.CompilerConfiguration

/**
 * Created by pxie on 1/20/16.
 */
class DSLParser {


    public static void main(String[] args) {
        def config = new CompilerConfiguration()
        config.scriptBaseClass = 'com.github.dataloader.rdbms.dsl.DLBaseScript'
        def shell = new GroovyShell(this.class.classLoader, config)

        def schema = shell.evaluate("src/main/groovy/com/github/dataloader/rdbms/dsl/Definition.groovy" as File);


    }

}
