/*
 * Javalin - https://javalin.io
 * Copyright 2017 David Åse
 * Licensed under Apache 2.0: https://github.com/tipsy/javalin/blob/master/LICENSE
 */

package io.javalin;

@FunctionalInterface
public interface ErrorHandler {
    void handle(Context ctx);  // similar to handler, can't throw exception
}