.class public final synthetic Ll/֨ۛܿ;
.super Ljava/lang/Object;
.source "C4QU"

# interfaces
.implements Ljava/util/function/LongSupplier;


# virtual methods
.method public final getAsLong()J
    .locals 2

    .line 0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    return-wide v0
.end method
