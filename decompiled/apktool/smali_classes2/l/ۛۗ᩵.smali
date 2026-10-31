.class public final Ll/ۛۗ᩵;
.super Ljava/lang/Object;
.source "1AY0"


# direct methods
.method public static final ֫(Ljava/lang/Throwable;Ll/ܳ᩸᩵;)V
    .locals 3

    .line 24
    :try_start_0
    sget-object v0, Ll/۫ۗ᩵;->ۚ:Ll/۬ۗ᩵;

    sget-object v0, Ll/۬ۗ᩵;->᩸:Ll/۬ۗ᩵;

    invoke-interface {p1, v0}, Ll/ܳ᩸᩵;->֫(Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;

    move-result-object v0

    check-cast v0, Ll/۫ۗ᩵;

    if-eqz v0, :cond_0

    .line 25
    invoke-interface {v0, p0}, Ll/۫ۗ᩵;->֫(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 33
    :cond_0
    invoke-static {p0, p1}, Ll/ۤۗ᩵;->֫(Ljava/lang/Throwable;Ll/ܳ᩸᩵;)V

    return-void

    :catchall_0
    move-exception v0

    if-ne p0, v0, :cond_1

    goto :goto_0

    .line 38
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Exception while trying to handle coroutine exception"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    invoke-static {v1, p0}, Ll/ۧ۠᩵;->֫(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    move-object p0, v1

    .line 29
    :goto_0
    invoke-static {p0, p1}, Ll/ۤۗ᩵;->֫(Ljava/lang/Throwable;Ll/ܳ᩸᩵;)V

    return-void
.end method
