.class public final Ll/ۢۙۘ;
.super Ljava/lang/Object;
.source "T91K"

# interfaces
.implements Ll/ۙ᩶ۘ;


# virtual methods
.method public final ֫(Ll/ۗ᩶ۘ;Ll/֡ۚ֡;)V
    .locals 4

    .line 528
    check-cast p2, Ll/ۖۚ֡;

    .line 532
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->length()I

    move-result v0

    .line 533
    invoke-interface {p1, p2}, Ll/ۗ᩶ۘ;->ۧ(Ll/֡ۚ֡;)V

    .line 535
    invoke-virtual {p2}, Ll/ۖۚ֡;->᩷()Ljava/lang/String;

    move-result-object v1

    .line 537
    sget-object v2, Ll/ۙۙۘ;->ᩳ:Ll/ۨ᩶ۘ;

    invoke-interface {p1}, Ll/ۗ᩶ۘ;->֫()Ll/ܰ᩶ۘ;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Ll/ۨ᩶ۘ;->֫(Ll/ܰ᩶ۘ;Ljava/lang/Object;)V

    .line 539
    invoke-interface {p1, p2, v0}, Ll/ۗ᩶ۘ;->֫(Ll/֡ۚ֡;I)V

    return-void
.end method
