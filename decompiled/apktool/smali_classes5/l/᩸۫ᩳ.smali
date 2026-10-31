.class public final synthetic Ll/᩸۫ᩳ;
.super Ljava/lang/Object;
.source "28WH"

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
    .locals 2

    .line 2
    check-cast p1, Ll/֡ܳۘ;

    .line 998
    invoke-interface {p1}, Ll/ᩴܳۘ;->ᩳ()I

    move-result v0

    invoke-interface {p1}, Ll/ᩴܳۘ;->֫()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 999
    invoke-interface {p1}, Ll/ᩴܳۘ;->ܿ()I

    move-result v0

    invoke-interface {p1}, Ll/ᩴܳۘ;->᩻()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 1000
    invoke-interface {p1}, Ll/֡ܳۘ;->ۧ()I

    move-result v0

    invoke-interface {p1}, Ll/֡ܳۘ;->ۜ()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 1001
    invoke-interface {p1}, Ll/֡ܳۘ;->ܽ()I

    move-result v0

    invoke-interface {p1}, Ll/֡ܳۘ;->᩷()I

    move-result p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
