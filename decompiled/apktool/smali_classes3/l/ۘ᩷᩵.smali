.class public final Ll/ۘ᩷᩵;
.super Ll/ᩴ᩷᩵;
.source "7A22"


# virtual methods
.method public final ֫(Ll/ۡۢ᩵;Ljava/util/HashSet;)V
    .locals 2

    .line 168
    invoke-virtual {p1}, Ll/ۡۢ᩵;->۬()Ljava/util/concurrent/ConcurrentMap;

    move-result-object v0

    invoke-virtual {p0}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    check-cast v0, Ll/ۧۤᩴ;

    invoke-virtual {v0, v1}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩶ۢ᩵;

    invoke-virtual {p0, p1, p2, v0}, Ll/ᩴ᩷᩵;->֫(Ll/ۡۢ᩵;Ljava/util/HashSet;Ll/᩶ۢ᩵;)V

    return-void
.end method

.method public final ֫(Ll/ۡۢ᩵;)Z
    .locals 2

    .line 173
    invoke-virtual {p0}, Ll/ܰۜ᩵;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 174
    invoke-virtual {p1}, Ll/ۡۢ᩵;->ۙ()Ll/۟᩷᩵;

    move-result-object v1

    .line 134
    iget-object v1, v1, Ll/۟᩷᩵;->᩶:Ljava/lang/String;

    .line 174
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
