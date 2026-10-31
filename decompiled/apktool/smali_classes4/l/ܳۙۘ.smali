.class public final Ll/ܳۙۘ;
.super Ljava/lang/Object;
.source "T91K"

# interfaces
.implements Ll/ۙ᩶ۘ;


# virtual methods
.method public final ֫(Ll/ۗ᩶ۘ;Ll/֡ۚ֡;)V
    .locals 4

    .line 453
    check-cast p2, Ll/ۜۚ֡;

    .line 457
    invoke-interface {p1, p2}, Ll/ۗ᩶ۘ;->ᩳ(Ll/֡ۚ֡;)V

    .line 459
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->length()I

    move-result v0

    .line 460
    invoke-interface {p1, p2}, Ll/ۗ᩶ۘ;->ۧ(Ll/֡ۚ֡;)V

    .line 462
    sget-object v1, Ll/ۙۙۘ;->ܽ:Ll/ۨ᩶ۘ;

    invoke-interface {p1}, Ll/ۗ᩶ۘ;->֫()Ll/ܰ᩶ۘ;

    move-result-object v2

    invoke-virtual {p2}, Ll/ۜۚ֡;->᩷()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    .line 464
    invoke-interface {p1, p2, v0}, Ll/ۗ᩶ۘ;->֫(Ll/֡ۚ֡;I)V

    .line 466
    invoke-interface {p1, p2}, Ll/ۗ᩶ۘ;->ܿ(Ll/֡ۚ֡;)V

    return-void
.end method
