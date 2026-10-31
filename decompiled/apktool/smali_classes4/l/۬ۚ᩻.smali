.class public final Ll/۬ۚ᩻;
.super Ll/֫ۜܳ;
.source "19Q0"


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 9

    const-string v0, "payload"

    .line 20
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    .line 21
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v0

    .line 22
    new-instance v1, Ll/ܳ۠ܳ;

    invoke-direct {v1, v0}, Ll/ܳ۠ܳ;-><init>(Lbin/mt/plus/Main;)V

    .line 23
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->᩻()V

    .line 24
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v0

    .line 25
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    const/16 v4, 0x8

    if-ne v2, v3, :cond_0

    const/4 v2, 0x0

    .line 26
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵֨᩻;

    .line 27
    invoke-virtual {v0}, Ll/ܺۘܳ;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Ll/ܳ۠ܳ;->֫(Ljava/lang/String;Ll/ۤ֨ܳ;)V

    .line 28
    invoke-virtual {v0}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ll/ܳ۠ܳ;->ܽ(J)Ll/۟֨ܳ;

    move-result-object v2

    invoke-virtual {v2, v4}, Ll/۟֨ܳ;->֫(I)V

    .line 29
    invoke-virtual {v0}, Ll/᩵֨᩻;->ܽ()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ll/ܳ۠ܳ;->֫(J)Ll/۟֨ܳ;

    .line 30
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->ܿ()V

    .line 31
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->ۜ()V

    .line 32
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->ۧ()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object p1

    invoke-static {v1, p1, v0}, Ll/ۛ۫ܳ;->ۧ(Landroid/widget/Button;Ll/ܽۢܳ;Ll/ᩳۜܳ;)V

    return-void

    .line 34
    :cond_0
    invoke-virtual {v1, v0}, Ll/ܳ۠ܳ;->֫(Ljava/util/List;)V

    .line 36
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-wide/16 v2, 0x0

    move-wide v5, v2

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۜܳ;

    .line 37
    check-cast v0, Ll/᩵֨᩻;

    .line 38
    invoke-virtual {v0}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v7

    add-long/2addr v2, v7

    .line 39
    invoke-virtual {v0}, Ll/᩵֨᩻;->ܽ()J

    move-result-wide v7

    add-long/2addr v5, v7

    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {v1, v2, v3}, Ll/ܳ۠ܳ;->ܽ(J)Ll/۟֨ܳ;

    move-result-object p1

    invoke-virtual {p1, v4}, Ll/۟֨ܳ;->֫(I)V

    .line 42
    invoke-virtual {v1, v5, v6}, Ll/ܳ۠ܳ;->֫(J)Ll/۟֨ܳ;

    .line 43
    invoke-virtual {v1}, Ll/ܳ۠ܳ;->ۜ()V

    return-void
.end method
