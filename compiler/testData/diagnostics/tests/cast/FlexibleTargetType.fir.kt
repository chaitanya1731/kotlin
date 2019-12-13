// FILE: Foo.java

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Foo {
    static Foo create() { return null; }

    @Nullable
    static Foo createN() { return null; }

    @NotNull
    static Foo createNN() { return null; }
}

// FILE: sample.kt

fun test() {
    Foo.create() as Foo
    Foo.createN() as Foo
    Foo.createNN() as Foo

    Foo.create() as Foo?
    Foo.createN() as Foo?
    Foo.createNN() as Foo?
}