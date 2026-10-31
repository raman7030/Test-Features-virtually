.class public final Ll/᩷ܿ᩻;
.super Ll/֫ۜܳ;
.source "H7FZ"


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 6

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 40
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v1, "local"

    .line 43
    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 45
    :try_start_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۢ()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Ll/ܽ֨ۢ;->ۗ:Ll/ܽ֨ۢ;

    invoke-static {v1, v3}, Ll/ᩳ֨ۢ;->֫(Ljava/lang/String;Ll/ܽ֨ۢ;)V
    :try_end_0
    .catch Ll/֫ۛۡ; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    .line 55
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳۜܳ;

    invoke-interface {v2}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v2

    const/4 v3, 0x1

    .line 56
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۜܳ;

    invoke-interface {v0}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v0

    const-string v4, ".tmp"

    .line 899
    invoke-virtual {v2, v4}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v4

    .line 58
    invoke-virtual {v2, v4}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 59
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    invoke-virtual {v0, v2}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 61
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    invoke-virtual {v4, v0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 63
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 85
    sget v4, Ll/ܳۤܳ;->֫:I

    .line 213
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v2

    .line 217
    invoke-static {v2, v3}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Z)V

    .line 213
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    .line 217
    invoke-static {v0, v3}, Ll/ܳۤܳ;->֫(Ljava/lang/String;Z)V

    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {v2, v0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 73
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 74
    invoke-virtual {v4, v2}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 75
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 79
    :cond_2
    invoke-virtual {v4, v2}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 81
    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_3
    :goto_0
    const v0, 0x7f120881

    .line 88
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 90
    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 91
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->ܳ()V

    .line 92
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->֫(Ljava/util/Collection;)V

    .line 93
    invoke-virtual {p1}, Ll/ۖۢܳ;->֨()V

    .line 95
    :cond_4
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void

    :catch_0
    move-exception v0

    .line 47
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object p1

    const/4 v1, 0x0

    .line 546
    invoke-virtual {p1, v0, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void

    :cond_5
    const-string v1, "net"

    .line 96
    invoke-virtual {p1, v1}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 103
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽ᩷ܳ;->᩶()Ll/ܰܺܳ;

    move-result-object v1

    check-cast v1, Ll/ۗۢ᩻;

    .line 104
    new-instance v2, Ll/ۜܿ᩻;

    invoke-direct {v2, p0, p1, v1, v0}, Ll/ۜܿ᩻;-><init>(Ll/᩷ܿ᩻;Ll/ۖۢܳ;Ll/ۗۢ᩻;Ljava/util/ArrayList;)V

    .line 137
    invoke-virtual {v2}, Ll/۟ܶۡ;->᩻()V

    :cond_6
    :goto_2
    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 2

    const-string v0, "local"

    .line 27
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "net"

    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܺ()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Ll/ۖۢܳ;->ۚ()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ll/ۖۢܳ;->֡()Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
