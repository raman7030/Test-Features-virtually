.class public final synthetic Ll/ۙ۟ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/util/function/IntFunction;
.implements Ljava/util/function/BiConsumer;


# virtual methods
.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    check-cast p1, Ljava/lang/StringBuilder;

    check-cast p2, Ljava/lang/CharSequence;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ᩳۛᩴ;->$default$andThen(Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;

    move-result-object p1

    return-object p1
.end method

.method public apply(I)Ljava/lang/Object;
    .locals 0

    .line 568
    new-array p1, p1, [Ljava/lang/Double;

    return-object p1
.end method
