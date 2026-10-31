.class public final synthetic Ll/֡ܰۚ;
.super Ljava/lang/Object;
.source "64JA"

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
    .locals 2

    .line 2
    check-cast p1, Ll/֨᩺ۚ;

    .line 2301
    new-instance v0, Ll/᩹ᩳ֨;

    sget-object v1, Ll/۫ۧ֨;->ۜ֫:Ll/۫ۧ֨;

    invoke-virtual {p1}, Ll/֨᩺ۚ;->֫()I

    move-result v1

    .line 43
    iget-object p1, p1, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    .line 2301
    invoke-direct {v0, v1, p1}, Ll/᩹ᩳ֨;-><init>(ILjava/lang/String;)V

    return-object v0
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
