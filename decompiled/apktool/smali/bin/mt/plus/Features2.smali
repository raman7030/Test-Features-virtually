.class public Lbin/mt/plus/Features2;
.super Ljava/lang/Object;
.source "Features2.java"


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "mt2"

    .line 8
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native init(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public static native installSeccomp(I)I
.end method
