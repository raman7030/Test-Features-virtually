.class public final Ll/ۘۡᩳ;
.super Ll/ᩳۡᩳ;
.source "R9RC"


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "ParameterIII"

    return-object v0
.end method

.method public final ֫(Ll/֡᩷ۚ;)Z
    .locals 3

    .line 23
    invoke-virtual {p1}, Ll/֡᩷ۚ;->ۨ֫()Ljava/util/SortedSet;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܺۢۚ;

    .line 116
    sget-object v1, Ll/ܺۗ֡;->ܽ֫:Ll/ܺۗ֡;

    invoke-virtual {v0}, Ll/ܺۢۚ;->ܽ()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ܺۗ֡;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 108
    sget-object v1, Ll/ܺۗ֡;->ܳ֫:Ll/ܺۗ֡;

    invoke-virtual {v0}, Ll/ܺۢۚ;->ܽ()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ܺۗ֡;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 24
    invoke-virtual {v0}, Ll/ܺۢۚ;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "[S"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/֨ۢۚ;)Z
    .locals 1

    .line 104
    sget-object v0, Ll/ܺۗ֡;->ܳ֫:Ll/ܺۗ֡;

    invoke-virtual {p1}, Ll/֨ۢۚ;->ܽ()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ܺۗ֡;->֫(I)Z

    move-result p1

    return p1
.end method
