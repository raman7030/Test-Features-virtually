.class public abstract Ll/ܽ᩻ܽ;
.super Ljava/lang/Object;
.source "P1FC"

# interfaces
.implements Ll/ۛܳܽ;


# virtual methods
.method public ֫(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)V
    .locals 2

    const/4 v0, 0x0

    .line 14
    invoke-virtual {p1, v0}, Ll/ᩴܿܽ;->ۧ(Z)V

    .line 15
    invoke-virtual {p3}, Ll/᩵ۘܽ;->ۡ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 16
    invoke-virtual {p3}, Ll/᩵ۘܽ;->ۢ()Ll/֨ۘܽ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֨ۘܽ;->᩻()Ljava/lang/String;

    move-result-object v0

    const-string v1, "@"

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 137
    invoke-static {p1, p3, p2, v0}, Ll/ۨܳܽ;->֫(Ll/ᩴܿܽ;Ll/᩵ۘܽ;Ll/ۤܳܽ;Z)Ll/ۙܿܽ;

    return-void

    :cond_0
    const-string v1, "?"

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 21
    invoke-static {p1, p2, p3}, Ll/ۨܳܽ;->֫(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)Ll/ۙܿܽ;

    return-void

    .line 25
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Ll/ܽ᩻ܽ;->ۧ(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)V

    return-void
.end method

.method public abstract ۧ(Ll/ᩴܿܽ;Ll/ۤܳܽ;Ll/᩵ۘܽ;)V
.end method
