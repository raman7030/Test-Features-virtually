.class public final synthetic Ll/֡۠֨;
.super Ljava/lang/Object;
.source "X43L"

# interfaces
.implements Ljava/util/function/Function;


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 2
    check-cast p1, Ll/ۚܶ֨;

    .line 3763
    iget-boolean v0, p1, Ll/ۚܶ֨;->ۧ:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, Ll/ۚܶ֨;->ᩳ:Ll/ۛ᩸֨;

    iget-object p1, p1, Ll/ۚܶ֨;->֫:Ll/ۖܶ۠;

    invoke-static {v0, p1}, Ll/ۛ᩸֨;->֫(Ll/ۛ᩸֨;Ll/ۖܶ۠;)Ll/ۖܶ۠;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p1, Ll/ۚܶ֨;->֫:Ll/ۖܶ۠;

    return-object p1
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
