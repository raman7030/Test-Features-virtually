.class public final synthetic Ll/ܿۤۚ;
.super Ljava/lang/Object;
.source "77E4"

# interfaces
.implements Ljava/util/function/Predicate;


# virtual methods
.method public synthetic and(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$and(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public synthetic negate()Ljava/util/function/Predicate;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/᩵ۛᩴ;->$default$negate(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object v0

    return-object v0
.end method

.method public synthetic or(Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩵ۛᩴ;->$default$or(Ljava/util/function/Predicate;Ljava/util/function/Predicate;)Ljava/util/function/Predicate;

    move-result-object p1

    return-object p1
.end method

.method public final test(Ljava/lang/Object;)Z
    .locals 3

    .line 2
    check-cast p1, Ll/۟ۛۚ;

    .line 173
    invoke-virtual {p1}, Ll/ۜ۫ۚ;->ᩳ()Ll/ۙ۬ۚ;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [Ll/ۙ۬ۚ;

    sget-object v1, Ll/ۙ۬ۚ;->᩶֫:Ll/ۙ۬ۚ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۙ۬ۚ;->᩹֫:Ll/ۙ۬ۚ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 174
    invoke-virtual {p1, v0}, Ll/ۙ۬ۚ;->֫([Ll/ۙ۬ۚ;)Z

    move-result p1

    return p1
.end method
