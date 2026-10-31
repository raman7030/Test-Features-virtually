.class public final synthetic Ll/ۢ᩻ۜ;
.super Ljava/lang/Object;
.source "J7AM"

# interfaces
.implements Ljava/util/function/LongSupplier;


# virtual methods
.method public final getAsLong()J
    .locals 2

    .line 0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method
