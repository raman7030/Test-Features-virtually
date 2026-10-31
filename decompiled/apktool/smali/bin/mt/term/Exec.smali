.class public Lbin/mt/term/Exec;
.super Ljava/lang/Object;
.source "Exec.java"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "term"

    .line 5
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native close(I)V
.end method

.method public static native createSubprocess(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;[I)I
.end method

.method public static native killAll(I)V
.end method

.method public static native setPtyWindowSize(III)V
.end method

.method public static native waitFor(I)I
.end method
