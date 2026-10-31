.class public final Ll/ᩴۙۘ;
.super Ljava/lang/Object;
.source "T91K"

# interfaces
.implements Ll/ۙ᩶ۘ;


# virtual methods
.method public final ֫(Ll/ۗ᩶ۘ;Ll/֡ۚ֡;)V
    .locals 4

    .line 271
    check-cast p2, Ll/۟֡֡;

    .line 275
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->length()I

    move-result v0

    .line 279
    invoke-interface {p1}, Ll/ۗ᩶ۘ;->builder()Ll/ᩳۙۘ;

    move-result-object v1

    const/16 v2, 0xa0

    .line 280
    invoke-virtual {v1, v2}, Ll/ᩳۙۘ;->append(C)V

    .line 281
    invoke-virtual {p2}, Ll/۟֡֡;->᩷()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/ᩳۙۘ;->ۧ(Ljava/lang/String;)V

    .line 282
    invoke-virtual {v1, v2}, Ll/ᩳۙۘ;->append(C)V

    .line 284
    invoke-interface {p1, p2, v0}, Ll/ۗ᩶ۘ;->֫(Ll/֡ۚ֡;I)V

    return-void
.end method
