.class public final synthetic Ll/֡۫᩻;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Ljava/util/function/IntConsumer;


# virtual methods
.method public final accept(I)V
    .locals 2

    .line 329
    invoke-static {p1}, Ll/᩸ۛ᩻;->֫(I)I

    move-result p1

    .line 330
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "amfbc"

    if-nez p1, :cond_0

    .line 332
    invoke-interface {v0, v1}, Ll/۬ۤۡ;->remove(Ljava/lang/String;)Ll/۬ۤۡ;

    goto :goto_0

    .line 334
    :cond_0
    invoke-interface {v0, p1, v1}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    .line 336
    :goto_0
    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    .line 375
    invoke-static {}, Ll/᩵ۛ᩻;->ۢ()V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۢۛᩴ;->$default$andThen(Ljava/util/function/IntConsumer;Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;

    move-result-object p1

    return-object p1
.end method
