.class public final synthetic Ll/ܿ۫ᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static bridge synthetic $default$forEachRemaining(Ll/ܳ۫ᩴ;Ljava/lang/Object;)V
    .locals 0

    .line 86
    check-cast p1, Ljava/util/function/IntConsumer;

    invoke-interface {p0, p1}, Ll/ܳ۫ᩴ;->forEachRemaining(Ljava/util/function/IntConsumer;)V

    return-void
.end method

.method public static $default$forEachRemaining(Ll/ܳ۫ᩴ;Ljava/util/function/IntConsumer;)V
    .locals 1

    .line 113
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    invoke-interface {p0}, Ll/ܳ۫ᩴ;->nextInt()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/function/IntConsumer;->accept(I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static $default$next(Ll/ܳ۫ᩴ;)Ljava/lang/Integer;
    .locals 1

    .line 126
    sget-boolean v0, Ll/ܺۨᩴ;->a:Z

    if-nez v0, :cond_0

    .line 128
    invoke-interface {p0}, Ll/ܳ۫ᩴ;->nextInt()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    .line 127
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-string v0, "{0} calling PrimitiveIterator.OfInt.nextInt()"

    invoke-static {p0, v0}, Ll/ܺۨᩴ;->a(Ljava/lang/Class;Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static bridge synthetic $default$next(Ll/ܳ۫ᩴ;)Ljava/lang/Object;
    .locals 0

    .line 86
    invoke-interface {p0}, Ll/ܳ۫ᩴ;->next()Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method
