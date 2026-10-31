.class public final Ll/᩻ᩳۘ;
.super Ljava/lang/Object;
.source "H9F9"

# interfaces
.implements Ll/ܰܰۖ;


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 4

    .line 156
    check-cast p1, Ljava/util/List;

    .line 159
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-wide/16 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    .line 160
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    add-long/2addr v0, v2

    goto :goto_0

    .line 162
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
