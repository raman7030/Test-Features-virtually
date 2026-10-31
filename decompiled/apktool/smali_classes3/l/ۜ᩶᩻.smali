.class public final Ll/ۜ᩶᩻;
.super Ll/֫ۜܳ;
.source "71XR"


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 3

    const-string v0, "zip"

    .line 17
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    .line 19
    new-instance v0, Ll/ܺۙ᩻;

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ܺۙ᩻;-><init>(Ll/ܽۢܳ;)V

    .line 20
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object p1

    .line 21
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    const/4 v1, 0x0

    .line 22
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩳۜܳ;

    .line 23
    invoke-interface {p1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 24
    check-cast p1, Ll/۫᩶᩻;

    invoke-virtual {v0, p1}, Ll/ܺۙ᩻;->ۧ(Ll/۫᩶᩻;)V

    return-void

    .line 26
    :cond_0
    check-cast p1, Ll/۫᩶᩻;

    invoke-virtual {v0, p1}, Ll/ܺۙ᩻;->֫(Ll/۫᩶᩻;)V

    return-void

    .line 29
    :cond_1
    invoke-virtual {v0, p1}, Ll/ܺۙ᩻;->֫(Ljava/util/List;)V

    return-void
.end method
