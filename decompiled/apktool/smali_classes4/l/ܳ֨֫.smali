.class public final Ll/ܳ֨֫;
.super Ljava/lang/Object;
.source "C8NO"

# interfaces
.implements Ll/ܽۚ֫;


# virtual methods
.method public final ֫()J
    .locals 2

    .line 35
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫(Landroid/os/Looper;Landroid/os/Handler$Callback;)Ll/᩵ۚ֫;
    .locals 2

    .line 57
    new-instance v0, Ll/ۜ֨֫;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1, p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    invoke-direct {v0, v1}, Ll/ۜ֨֫;-><init>(Landroid/os/Handler;)V

    return-object v0
.end method

.method public final ۧ()J
    .locals 2

    .line 45
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܽ()J
    .locals 2

    .line 40
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩳ()J
    .locals 2

    .line 50
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0
.end method
