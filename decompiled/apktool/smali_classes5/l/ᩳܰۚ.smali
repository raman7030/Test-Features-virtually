.class public final synthetic Ll/ᩳܰۚ;
.super Ljava/lang/Object;
.source "T7ET"

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
    .locals 2

    .line 2
    new-instance v0, Ll/ۖۛۚ;

    .line 4
    check-cast p1, Ll/ۢ۫ۚ;

    .line 6
    check-cast p2, Ll/ܺۤۚ;

    .line 1068
    sget-object v1, Ll/ۧۤۚ;->᩵֫:Ll/ۧۤۚ;

    invoke-direct {v0, v1, p1, p2}, Ll/ᩳۛۚ;-><init>(Ll/ۧۤۚ;Ll/ۢ۫ۚ;Ll/ܺۤۚ;)V

    return-object v0
.end method
