.class public final synthetic Ll/ܰᩴܽ;
.super Ljava/lang/Object;
.source "G7I1"

# interfaces
.implements Ll/ۧۚܽ;


# virtual methods
.method public final negate()Ll/۟᩵ܽ;
    .locals 1

    .line 2395
    sget-object v0, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    .line 2374
    invoke-static {p0}, Ll/۟᩵ܽ;->ܽ(Ll/ۧۚܽ;)Ll/۟᩵ܽ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ֫(Ll/ۧۚܽ;)Ll/ۧۚܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֫ۚܽ;->֫(Ll/ۧۚܽ;Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(I)Z
    .locals 1

    .line 404
    invoke-static {p1}, Ljava/lang/Character;->isUpperCase(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 405
    invoke-static {p1}, Ljava/lang/Character;->isLowerCase(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 406
    invoke-static {p1}, Ljava/lang/Character;->isTitleCase(I)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final synthetic ۧ(Ll/ۧۚܽ;)Ll/ۧۚܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/֫ۚܽ;->ۧ(Ll/ۧۚܽ;Ll/ۧۚܽ;)Ll/ۧۚܽ;

    move-result-object p1

    return-object p1
.end method
