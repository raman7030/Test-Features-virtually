.class public final synthetic Ll/ᩴ۠֨;
.super Ljava/lang/Object;
.source "X43L"

# interfaces
.implements Ljava/util/function/BiConsumer;


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 2
    check-cast p1, Ll/ۚܶ֨;

    .line 4
    check-cast p2, Ll/ۙ֨֨;

    .line 3754
    iget-object v0, p1, Ll/ۚܶ֨;->ᩳ:Ll/ۛ᩸֨;

    iget-object v1, p1, Ll/ۚܶ֨;->֫:Ll/ۖܶ۠;

    iget-object v2, p1, Ll/ۚܶ֨;->ܽ:Ll/ۜۛ֨;

    invoke-virtual {v0, v1, p2, v2}, Ll/ۛ᩸֨;->֫(Ll/ۖܶ۠;Ll/ۙ֨֨;Ljava/util/function/BiPredicate;)Ll/ۖܶ۠;

    move-result-object p2

    iput-object p2, p1, Ll/ۚܶ֨;->֫:Ll/ۖܶ۠;

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ᩳۛᩴ;->$default$andThen(Ljava/util/function/BiConsumer;Ljava/util/function/BiConsumer;)Ljava/util/function/BiConsumer;

    move-result-object p1

    return-object p1
.end method
