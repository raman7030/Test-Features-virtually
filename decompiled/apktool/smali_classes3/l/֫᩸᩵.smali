.class public final synthetic Ll/֫᩸᩵;
.super Ljava/lang/Object;
.source "ZB07"

# interfaces
.implements Ll/᩵᩹᩵;


# virtual methods
.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 2
    check-cast p1, Ll/ܳ᩸᩵;

    .line 4
    check-cast p2, Ll/ᩳ᩸᩵;

    const-string v0, "acc"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-interface {p2}, Ll/ᩳ᩸᩵;->getKey()Ll/ܿ᩸᩵;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/ܳ᩸᩵;->ۧ(Ll/ܿ᩸᩵;)Ll/ܳ᩸᩵;

    move-result-object p1

    .line 34
    sget-object v0, Ll/᩻᩸᩵;->᩸:Ll/᩻᩸᩵;

    if-ne p1, v0, :cond_0

    return-object p2

    .line 36
    :cond_0
    sget-object v1, Ll/۟ܶ᩵;->֡:Ll/ܰܶ᩵;

    sget-object v1, Ll/ܰܶ᩵;->᩸:Ll/ܰܶ᩵;

    invoke-interface {p1, v1}, Ll/ܳ᩸᩵;->֫(Ll/ܿ᩸᩵;)Ll/ᩳ᩸᩵;

    move-result-object v2

    check-cast v2, Ll/۟ܶ᩵;

    if-nez v2, :cond_1

    .line 37
    new-instance v0, Ll/ۛܶ᩵;

    invoke-direct {v0, p2, p1}, Ll/ۛܶ᩵;-><init>(Ll/ᩳ᩸᩵;Ll/ܳ᩸᩵;)V

    return-object v0

    .line 38
    :cond_1
    invoke-interface {p1, v1}, Ll/ܳ᩸᩵;->ۧ(Ll/ܿ᩸᩵;)Ll/ܳ᩸᩵;

    move-result-object p1

    if-ne p1, v0, :cond_2

    .line 39
    new-instance p1, Ll/ۛܶ᩵;

    invoke-direct {p1, v2, p2}, Ll/ۛܶ᩵;-><init>(Ll/ᩳ᩸᩵;Ll/ܳ᩸᩵;)V

    return-object p1

    .line 40
    :cond_2
    new-instance v0, Ll/ۛܶ᩵;

    new-instance v1, Ll/ۛܶ᩵;

    invoke-direct {v1, p2, p1}, Ll/ۛܶ᩵;-><init>(Ll/ᩳ᩸᩵;Ll/ܳ᩸᩵;)V

    invoke-direct {v0, v2, v1}, Ll/ۛܶ᩵;-><init>(Ll/ᩳ᩸᩵;Ll/ܳ᩸᩵;)V

    return-object v0
.end method
