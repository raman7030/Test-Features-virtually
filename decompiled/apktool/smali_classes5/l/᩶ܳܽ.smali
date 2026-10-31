.class public final Ll/᩶ܳܽ;
.super Ll/ܽ᩻ܽ;
.source "B1F0"


# virtual methods
.method public final ۧ(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)V
    .locals 2

    .line 15
    invoke-virtual {p3}, Ll/᩵ۘܽ;->ۡ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 16
    invoke-virtual {p3}, Ll/᩵ۘܽ;->ۢ()Ll/֨ۘܽ;

    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ll/֨ۘܽ;->᩻()Ljava/lang/String;

    move-result-object v0

    const-string v1, "#"

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 19
    invoke-static {p1, p2, p3}, Ll/ۨܳܽ;->ۜ(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)Ll/ۙܿܽ;

    return-void

    .line 22
    :cond_0
    invoke-static {p1, p2, p3}, Ll/ۨܳܽ;->ܽ(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)Ll/ۙܿܽ;

    return-void

    .line 26
    :cond_1
    invoke-static {p1, p2, p3}, Ll/ۨܳܽ;->ۜ(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)Ll/ۙܿܽ;

    return-void
.end method
