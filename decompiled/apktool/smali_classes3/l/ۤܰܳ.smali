.class public final Ll/ۤܰܳ;
.super Ll/֫ۜܳ;
.source "C176"


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 2

    .line 23
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۡ()Ll/ᩳۜܳ;

    move-result-object v0

    .line 24
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object p1

    .line 25
    invoke-interface {v0}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/ܽۢܳ;->ᩳ(Ljava/lang/String;)V

    .line 26
    invoke-interface {v0}, Ll/ᩳۜܳ;->getParent()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;Z)V

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 1

    const-string v0, "local"

    .line 16
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 17
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 18
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܺ()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
