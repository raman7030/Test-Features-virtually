.class public final Ll/᩷ۙۘ;
.super Ljava/lang/Object;
.source "T91K"

# interfaces
.implements Ll/ۙ᩶ۘ;


# virtual methods
.method public final ֫(Ll/ۗ᩶ۘ;Ll/֡ۚ֡;)V
    .locals 5

    .line 490
    check-cast p2, Ll/᩸ۚ֡;

    .line 516
    invoke-virtual {p2}, Ll/ۨ֡֡;->ᩳ()Ll/ۨ֡֡;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 518
    invoke-virtual {v0}, Ll/ۨ֡֡;->ᩳ()Ll/֡ۚ֡;

    move-result-object v0

    .line 519
    instance-of v1, v0, Ll/ᩴۚ֡;

    if-eqz v1, :cond_0

    .line 520
    check-cast v0, Ll/ᩴۚ֡;

    .line 521
    invoke-virtual {v0}, Ll/ᩴۚ֡;->᩷()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 497
    invoke-interface {p1, p2}, Ll/ۗ᩶ۘ;->ᩳ(Ll/֡ۚ֡;)V

    .line 500
    :cond_1
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->length()I

    move-result v1

    .line 501
    invoke-interface {p1, p2}, Ll/ۗ᩶ۘ;->ۧ(Ll/֡ۚ֡;)V

    .line 503
    sget-object v2, Ll/ۙۙۘ;->ۜ:Ll/ۨ᩶ۘ;

    invoke-interface {p1}, Ll/ۗ᩶ۘ;->֫()Ll/ܰ᩶ۘ;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    .line 506
    invoke-interface {p1, p2, v1}, Ll/ۗ᩶ۘ;->֫(Ll/֡ۚ֡;I)V

    if-nez v0, :cond_2

    .line 509
    invoke-interface {p1, p2}, Ll/ۗ᩶ۘ;->ܿ(Ll/֡ۚ֡;)V

    :cond_2
    return-void
.end method
