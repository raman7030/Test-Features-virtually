.class public final Ll/ۖ᩷᩵;
.super Ll/ᩴ᩷᩵;
.source "7A22"


# virtual methods
.method public final ֫(Ll/ۡۢ᩵;Ljava/util/HashSet;)V
    .locals 5

    .line 134
    invoke-virtual {p0}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 135
    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۙ()Ll/۟᩷᩵;

    move-result-object v1

    .line 134
    iget-object v1, v1, Ll/۟᩷᩵;->᩶:Ljava/lang/String;

    .line 135
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 137
    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۙ()Ll/۟᩷᩵;

    move-result-object p1

    invoke-virtual {p0}, Ll/ܰۜ᩵;->ܽ()Ll/ۛۢ᩵;

    move-result-object v0

    invoke-virtual {p0}, Ll/ܰۜ᩵;->᩷()Z

    move-result v1

    sget v2, Ll/۬ۢ᩵;->ۧ:I

    invoke-virtual {p1, v0, v1, v2}, Ll/۟᩷᩵;->֫(Ll/ۛۢ᩵;ZI)Ljava/util/ArrayList;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void

    .line 141
    :cond_0
    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۗ()Ll/ۧۤᩴ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ۧۤᩴ;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 142
    new-instance v0, Ll/ܺ᩷᩵;

    invoke-virtual {p0}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ll/ۨۢ᩵;->᩺֫:Ll/ۨۢ᩵;

    invoke-virtual {p0}, Ll/ܰۜ᩵;->ܽ()Ll/ۛۢ᩵;

    move-result-object v3

    invoke-virtual {p0}, Ll/ܰۜ᩵;->᩷()Z

    move-result v4

    .line 222
    invoke-direct {v0, v1, v2, v3, v4}, Ll/ܰۜ᩵;-><init>(Ljava/lang/String;Ll/ۨۢ᩵;Ll/ۛۢ᩵;Z)V

    .line 143
    invoke-virtual {v0, p1, p2}, Ll/ܺ᩷᩵;->֫(Ll/ۡۢ᩵;Ljava/util/HashSet;)V

    return-void

    .line 147
    :cond_1
    invoke-virtual {p1}, Ll/ۡۢ᩵;->۬()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v1

    check-cast v1, Ll/ۧۤᩴ;

    invoke-virtual {v1, v0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶ۢ᩵;

    invoke-virtual {p0, p1, p2, v0}, Ll/ᩴ᩷᩵;->֫(Ll/ۡۢ᩵;Ljava/util/HashSet;Ll/᩶ۢ᩵;)V

    return-void
.end method

.method public final ֫(Ll/ۡۢ᩵;)Z
    .locals 2

    .line 152
    invoke-virtual {p0}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 153
    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۙ()Ll/۟᩷᩵;

    move-result-object v1

    .line 134
    iget-object v1, v1, Ll/۟᩷᩵;->᩶:Ljava/lang/String;

    .line 153
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Ll/ۡۢ᩵;->۬()Ljava/util/concurrent/ConcurrentMap;

    move-result-object p1

    check-cast p1, Ll/ۧۤᩴ;

    invoke-virtual {p1, v0}, Ll/ۧۤᩴ;->containsKey(Ljava/lang/Object;)Z

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
