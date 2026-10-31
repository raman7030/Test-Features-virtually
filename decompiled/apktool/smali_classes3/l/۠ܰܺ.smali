.class public final Ll/۠ܰܺ;
.super Ll/᩸ܰܺ;
.source "43Q0"


# direct methods
.method public static ֫(Ljava/lang/Object;)Ll/ۗܰܺ;
    .locals 1

    if-nez p0, :cond_0

    .line 138
    sget-object p0, Ll/᩶ܰܺ;->᩹:Ll/ۗܰܺ;

    return-object p0

    .line 141
    :cond_0
    new-instance v0, Ll/᩶ܰܺ;

    invoke-direct {v0, p0}, Ll/᩶ܰܺ;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/Throwable;)Ll/ۗܰܺ;
    .locals 1

    .line 165
    new-instance v0, Ll/᩹ܰܺ;

    .line 90
    invoke-direct {v0}, Ll/ܿܰܺ;-><init>()V

    .line 99
    invoke-virtual {v0, p0}, Ll/ܿܰܺ;->֫(Ljava/lang/Throwable;)Z

    return-object v0
.end method

.method public static ֫(Ll/ۗܰܺ;Ll/ܳ᩹ܺ;Ljava/util/concurrent/Executor;)Ll/ۗܰܺ;
    .locals 1

    .line 491
    sget v0, Ll/ᩴܰܺ;->ۨ:I

    .line 50
    new-instance v0, Ll/ۘܰܺ;

    .line 28
    invoke-direct {v0}, Ll/ܿܰܺ;-><init>()V

    .line 63
    iput-object p0, v0, Ll/ᩴܰܺ;->ۛ:Ll/ۗܰܺ;

    .line 64
    iput-object p1, v0, Ll/ᩴܰܺ;->ۤ:Ll/ܳ᩹ܺ;

    .line 902
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    sget-object p1, Ll/᩵ܰܺ;->᩹:Ll/᩵ܰܺ;

    if-ne p2, p1, :cond_0

    goto :goto_0

    .line 1066
    :cond_0
    new-instance p1, Ll/۬ܰܺ;

    invoke-direct {p1, p2, v0}, Ll/۬ܰܺ;-><init>(Ljava/util/concurrent/Executor;Ll/ܿܰܺ;)V

    move-object p2, p1

    .line 51
    :goto_0
    check-cast p0, Ll/᩶ܰܺ;

    invoke-virtual {p0, v0, p2}, Ll/᩶ܰܺ;->֫(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
