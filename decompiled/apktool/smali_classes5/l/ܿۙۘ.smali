.class public final Ll/ܿۙۘ;
.super Ljava/lang/Object;
.source "T91K"

# interfaces
.implements Ll/ۙ᩶ۘ;


# virtual methods
.method public final ֫(Ll/ۗ᩶ۘ;Ll/֡ۚ֡;)V
    .locals 3

    .line 434
    check-cast p2, Ll/۫ۚ֡;

    .line 438
    invoke-interface {p1, p2}, Ll/ۗ᩶ۘ;->ᩳ(Ll/֡ۚ֡;)V

    .line 440
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->length()I

    move-result v0

    .line 443
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->builder()Ll/ᩳۙۘ;

    move-result-object v1

    const/16 v2, 0xa0

    invoke-virtual {v1, v2}, Ll/ᩳۙۘ;->append(C)V

    .line 445
    invoke-interface {p1, p2, v0}, Ll/ۗ᩶ۘ;->֫(Ll/֡ۚ֡;I)V

    .line 447
    invoke-interface {p1, p2}, Ll/ۗ᩶ۘ;->ܿ(Ll/֡ۚ֡;)V

    return-void
.end method
