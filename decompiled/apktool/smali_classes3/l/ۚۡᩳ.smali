.class public final Ll/ۚۡᩳ;
.super Ll/ᩳۡᩳ;
.source "9183"


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "ParameterWrapBytesString"

    return-object v0
.end method

.method public final ֫(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    return-object p2

    :cond_0
    const-string p1, "Ljava/lang/String;"

    return-object p1

    :cond_1
    const-string p1, "[B"

    return-object p1
.end method

.method public final ֫(Ll/֨ۢۚ;Ll/᩵֫ۚ;)Z
    .locals 9

    .line 32
    invoke-interface {p2}, Ll/᩵֫ۚ;->᩷()Ljava/lang/Iterable;

    move-result-object v0

    .line 33
    invoke-interface {p2}, Ll/᩵֫ۚ;->᩻()I

    move-result p2

    invoke-virtual {p1}, Ll/֨ۢۚ;->getParameters()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    sub-int/2addr p2, p1

    add-int/lit8 p1, p2, 0x1

    .line 36
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩺֫ۚ;

    .line 37
    invoke-interface {v4}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v6

    .line 38
    invoke-virtual {v6}, Ll/֨ۗ֡;->֫()Z

    move-result v7

    if-nez v7, :cond_1

    goto :goto_1

    .line 41
    :cond_1
    iget-object v7, v6, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    sget-object v8, Ll/ۘۗ֡;->ۜ֫:Ll/ۘۗ֡;

    if-eq v7, v8, :cond_4

    sget-object v8, Ll/ۘۗ֡;->ܽ֫:Ll/ۘۗ֡;

    if-ne v7, v8, :cond_2

    goto :goto_1

    .line 44
    :cond_2
    sget-object v5, Ll/֨ۗ֡;->᩺֫:Ll/֨ۗ֡;

    if-ne v6, v5, :cond_0

    .line 45
    check-cast v4, Ll/֨ۧۚ;

    .line 46
    invoke-interface {v4}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v5

    check-cast v5, Ll/᩸ܽۚ;

    .line 47
    invoke-interface {v4}, Ll/֫ۧۚ;->֫()I

    move-result v6

    if-ne v6, p2, :cond_3

    .line 48
    invoke-interface {v5}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v2

    const-string v4, "[B"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, 0x1

    goto :goto_0

    .line 53
    :cond_3
    invoke-interface {v4}, Ll/֫ۧۚ;->֫()I

    move-result v4

    if-ne v4, p1, :cond_0

    .line 54
    invoke-interface {v5}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Ljava/lang/String;"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const/4 v3, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    if-eqz v2, :cond_5

    if-eqz v3, :cond_5

    return v5

    :cond_5
    return v1
.end method
