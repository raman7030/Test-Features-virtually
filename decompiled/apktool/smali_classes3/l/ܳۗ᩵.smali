.class public final Ll/ܳۗ᩵;
.super Ljava/lang/Object;


# direct methods
.method public static ֫(Ll/֫ۛ᩵;Ll/᩵᩹᩵;)Ll/ۤ۬᩵;
    .locals 5

    .line 49
    sget-object v0, Ll/۟ۗ᩵;->᩶:Ll/۟ۗ᩵;

    .line 19
    invoke-virtual {p0}, Ll/֫ۛ᩵;->֫()Ll/ܳ᩸᩵;

    move-result-object p0

    .line 40
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v2, Ll/᩸ۗ᩵;->᩹:Ll/᩸ۗ᩵;

    invoke-interface {p0, v1, v2}, Ll/ܳ᩸᩵;->֫(Ljava/lang/Object;Ll/᩵᩹᩵;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    .line 58
    sget-object v3, Ll/᩻᩸᩵;->᩸:Ll/᩻᩸᩵;

    if-nez v2, :cond_0

    if-nez v1, :cond_0

    .line 59
    invoke-interface {p0, v3}, Ll/ܳ᩸᩵;->֫(Ll/ܳ᩸᩵;)Ll/ܳ᩸᩵;

    move-result-object p0

    goto :goto_0

    .line 62
    :cond_0
    new-instance v2, Ll/᩻᩶᩵;

    .line 13
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object v3, v2, Ll/᩻᩶᩵;->᩸:Ljava/lang/Object;

    .line 63
    new-instance v4, Ll/ܶۗ᩵;

    invoke-direct {v4, v2}, Ll/ܶۗ᩵;-><init>(Ll/᩻᩶᩵;)V

    invoke-interface {p0, v3, v4}, Ll/ܳ᩸᩵;->֫(Ljava/lang/Object;Ll/᩵᩹᩵;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ܳ᩸᩵;

    if-eqz v1, :cond_1

    .line 80
    iget-object v1, v2, Ll/᩻᩶᩵;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ܳ᩸᩵;

    sget-object v4, Ll/۠ۗ᩵;->᩹:Ll/۠ۗ᩵;

    invoke-interface {v1, v3, v4}, Ll/ܳ᩸᩵;->֫(Ljava/lang/Object;Ll/᩵᩹᩵;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v2, Ll/᩻᩶᩵;->᩸:Ljava/lang/Object;

    .line 88
    :cond_1
    iget-object v1, v2, Ll/᩻᩶᩵;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ܳ᩸᩵;

    invoke-interface {p0, v1}, Ll/ܳ᩸᩵;->֫(Ll/ܳ᩸᩵;)Ll/ܳ᩸᩵;

    move-result-object p0

    .line 21
    :goto_0
    invoke-static {}, Ll/ۢ۬᩵;->֫()Ll/ۧۨ᩵;

    move-result-object v1

    if-eq p0, v1, :cond_2

    sget-object v1, Ll/۟ܶ᩵;->֡:Ll/ܰܶ᩵;

    invoke-interface {p0, v1}, Ll/ܳ᩸᩵;->֫(Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;

    move-result-object v1

    if-nez v1, :cond_2

    .line 22
    invoke-static {}, Ll/ۢ۬᩵;->֫()Ll/ۧۨ᩵;

    move-result-object v1

    invoke-interface {p0, v1}, Ll/ܳ᩸᩵;->֫(Ll/ܳ᩸᩵;)Ll/ܳ᩸᩵;

    move-result-object p0

    .line 53
    :cond_2
    invoke-virtual {v0}, Ll/۟ۗ᩵;->֫()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 54
    new-instance v1, Ll/ܳ۫᩵;

    invoke-direct {v1, p0, p1}, Ll/ܳ۫᩵;-><init>(Ll/ܳ᩸᩵;Ll/᩵᩹᩵;)V

    goto :goto_1

    .line 55
    :cond_3
    new-instance v1, Ll/ۡ۫᩵;

    const/4 v2, 0x1

    .line 194
    invoke-direct {v1, p0, v2}, Ll/ۧۗ᩵;-><init>(Ll/ܳ᩸᩵;Z)V

    .line 126
    :goto_1
    invoke-virtual {v0, p1, v1, v1}, Ll/۟ۗ᩵;->֫(Ll/᩵᩹᩵;Ljava/lang/Object;Ll/ۨܶ᩵;)V

    return-object v1
.end method
