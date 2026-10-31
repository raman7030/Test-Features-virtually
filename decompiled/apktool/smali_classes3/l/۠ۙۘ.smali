.class public final Ll/۠ۙۘ;
.super Ljava/lang/Object;
.source "T91K"

# interfaces
.implements Ll/ۙ᩶ۘ;


# virtual methods
.method public final ֫(Ll/ۗ᩶ۘ;Ll/֡ۚ֡;)V
    .locals 6

    .line 390
    check-cast p2, Ll/᩵ۚ֡;

    .line 394
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->length()I

    move-result v0

    .line 399
    invoke-interface {p1, p2}, Ll/ۗ᩶ۘ;->ۧ(Ll/֡ۚ֡;)V

    .line 401
    invoke-virtual {p2}, Ll/ۨ֡֡;->ᩳ()Ll/ۨ֡֡;

    move-result-object v1

    .line 402
    instance-of v2, v1, Ll/ܶۚ֡;

    if-eqz v2, :cond_0

    check-cast v1, Ll/ܶۚ֡;

    .line 403
    sget-object v2, Ll/ۙۙۘ;->ܿ:Ll/ۨ᩶ۘ;

    invoke-interface {p1}, Ll/ۗ᩶ۘ;->֫()Ll/ܰ᩶ۘ;

    move-result-object v3

    sget-object v4, Ll/᩹ۙۘ;->᩶:Ll/᩹ۙۘ;

    invoke-virtual {v2, v3, v4}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    .line 404
    sget-object v2, Ll/ۙۙۘ;->ܳ:Ll/ۨ᩶ۘ;

    invoke-interface {p1}, Ll/ۗ᩶ۘ;->֫()Ll/ܰ᩶ۘ;

    move-result-object v3

    invoke-virtual {v1}, Ll/ܶۚ֡;->ܺ()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    .line 405
    sget-object v2, Ll/ۙۙۘ;->᩻:Ll/ۨ᩶ۘ;

    invoke-interface {p1}, Ll/ۗ᩶ۘ;->֫()Ll/ܰ᩶ۘ;

    move-result-object v3

    new-instance v4, Ll/֨ۙۘ;

    invoke-direct {v4, v1}, Ll/֨ۙۘ;-><init>(Ll/ܶۚ֡;)V

    invoke-virtual {v2, v3, v4}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    .line 406
    invoke-virtual {v1}, Ll/ܶۚ֡;->ܺ()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ll/ܶۚ֡;->֫(I)V

    goto :goto_1

    .line 408
    :cond_0
    sget-object v1, Ll/ۙۙۘ;->ܿ:Ll/ۨ᩶ۘ;

    invoke-interface {p1}, Ll/ۗ᩶ۘ;->֫()Ll/ܰ᩶ۘ;

    move-result-object v2

    sget-object v3, Ll/᩹ۙۘ;->᩹:Ll/᩹ۙۘ;

    invoke-virtual {v1, v2, v3}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    .line 409
    sget-object v1, Ll/ۙۙۘ;->֫:Ll/ۨ᩶ۘ;

    invoke-interface {p1}, Ll/ۗ᩶ۘ;->֫()Ll/ܰ᩶ۘ;

    move-result-object v2

    .line 423
    invoke-virtual {p2}, Ll/ۨ֡֡;->ᩳ()Ll/֡ۚ֡;

    move-result-object v3

    const/4 v4, 0x0

    :goto_0
    if-eqz v3, :cond_2

    .line 425
    instance-of v5, v3, Ll/᩵ۚ֡;

    if-eqz v5, :cond_1

    add-int/lit8 v4, v4, 0x1

    .line 428
    :cond_1
    invoke-virtual {v3}, Ll/֡ۚ֡;->ᩳ()Ll/֡ۚ֡;

    move-result-object v3

    goto :goto_0

    .line 409
    :cond_2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    .line 412
    :goto_1
    invoke-interface {p1, p2, v0}, Ll/ۗ᩶ۘ;->֫(Ll/֡ۚ֡;I)V

    .line 414
    invoke-interface {p1, p2}, Ll/ۗ᩶ۘ;->ܽ(Ll/֡ۚ֡;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 415
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->ܿ()V

    :cond_3
    return-void
.end method
