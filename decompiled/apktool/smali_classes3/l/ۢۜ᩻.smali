.class public final synthetic Ll/ۢۜ᩻;
.super Ljava/lang/Object;
.source "5AHS"

# interfaces
.implements Ljava/util/function/BiFunction;


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/BiFunction;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܿۛᩴ;->$default$andThen(Ljava/util/function/BiFunction;Ljava/util/function/Function;)Ljava/util/function/BiFunction;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 2
    check-cast p1, Ljava/lang/String;

    .line 4
    check-cast p2, Ll/ۖۜ᩻;

    if-eqz p2, :cond_1

    .line 49
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p2, Ll/ۖۜ᩻;->֫:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x2710

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    goto :goto_0

    .line 45
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p2, Ll/ۖۜ᩻;->֫:J

    return-object p2

    .line 65
    :cond_1
    :goto_0
    new-instance p1, Ll/ۖۜ᩻;

    invoke-direct {p1}, Ll/ۖۜ᩻;-><init>()V

    return-object p1
.end method
