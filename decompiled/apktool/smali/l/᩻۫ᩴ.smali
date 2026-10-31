.class public final synthetic Ll/᩻۫ᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static bridge synthetic $default$forEachRemaining(Ll/ۜ۫ᩴ;Ljava/lang/Object;)V
    .locals 0

    .line 160
    check-cast p1, Ljava/util/function/LongConsumer;

    invoke-interface {p0, p1}, Ll/ۜ۫ᩴ;->forEachRemaining(Ljava/util/function/LongConsumer;)V

    return-void
.end method

.method public static $default$forEachRemaining(Ll/ۜ۫ᩴ;Ljava/util/function/LongConsumer;)V
    .locals 2

    .line 187
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 188
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 189
    invoke-interface {p0}, Ll/ۜ۫ᩴ;->nextLong()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Ljava/util/function/LongConsumer;->accept(J)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static $default$next(Ll/ۜ۫ᩴ;)Ljava/lang/Long;
    .locals 2

    .line 200
    sget-boolean v0, Ll/ܺۨᩴ;->a:Z

    if-nez v0, :cond_0

    .line 202
    invoke-interface {p0}, Ll/ۜ۫ᩴ;->nextLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    .line 201
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string v0, "{0} calling PrimitiveIterator.OfLong.nextLong()"

    invoke-static {p0, v0}, Ll/ܺۨᩴ;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static bridge synthetic $default$next(Ll/ۜ۫ᩴ;)Ljava/lang/Object;
    .locals 0

    .line 160
    invoke-interface {p0}, Ll/ۜ۫ᩴ;->next()Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method
