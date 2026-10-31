.class public final Ll/᩻ܿܺ;
.super Ljava/lang/Object;
.source "FBDT"


# instance fields
.field public final ֫:Ll/ۘܿܺ;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 33
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v2, Ll/ۘܿܺ;

    .line 32
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object v2, p0, Ll/᩻ܿܺ;->֫:Ll/ۘܿܺ;

    .line 19
    new-instance v2, Ljava/io/PrintStream;

    new-instance v3, Ll/ܳܿܺ;

    .line 20
    invoke-direct {v3}, Ljava/io/OutputStream;-><init>()V

    .line 19
    invoke-direct {v2, v3}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;)V

    .line 28
    new-instance v2, Ljava/io/PrintStream;

    invoke-direct {v2, v0}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;)V

    .line 29
    new-instance v0, Ljava/io/PrintStream;

    invoke-direct {v0, v1}, Ljava/io/PrintStream;-><init>(Ljava/io/OutputStream;)V

    return-void
.end method
