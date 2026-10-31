.class public final Ll/ۧ᩹ۚ;
.super Ll/᩷᩹ۚ;
.source "4BJX"


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, ":matchText"

    return-object v0
.end method

.method public final ֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z
    .locals 5

    .line 866
    instance-of p1, p2, Ll/ܰ֡ۚ;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 869
    :cond_0
    invoke-virtual {p2}, Ll/᩶֡ۚ;->ۡ֫()Ljava/util/List;

    move-result-object p1

    .line 870
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧۚۚ;

    .line 871
    new-instance v1, Ll/ܰ֡ۚ;

    .line 872
    invoke-virtual {p2}, Ll/᩶֡ۚ;->᩷֫()Ljava/lang/String;

    move-result-object v2

    .line 91
    sget-object v3, Ll/֫֨ۚ;->ᩳ:Ll/֫֨ۚ;

    invoke-static {v2, v3}, Ll/ܽ֨ۚ;->֫(Ljava/lang/String;Ll/֫֨ۚ;)Ll/ܽ֨ۚ;

    move-result-object v2

    .line 872
    invoke-virtual {p2}, Ll/᩶֡ۚ;->ܽ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Ll/᩶֡ۚ;->֫()Ll/ܺ֡ۚ;

    move-result-object v4

    .line 12
    invoke-direct {v1, v2, v3, v4}, Ll/᩶֡ۚ;-><init>(Ll/ܽ֨ۚ;Ljava/lang/String;Ll/ܺ֡ۚ;)V

    .line 873
    invoke-virtual {v0, v1}, Ll/ۨ֡ۚ;->֫(Ll/ܰ֡ۚ;)V

    .line 874
    invoke-virtual {v1, v0}, Ll/᩶֡ۚ;->ܽ(Ll/ۨ֡ۚ;)V

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
