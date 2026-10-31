.class public final Ll/᩷ۘۖ;
.super Ll/ܿۘۖ;
.source "Z9PA"


# virtual methods
.method public final ֫(Ljava/util/Map$Entry;)I
    .locals 0

    .line 308
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚᩴۖ;

    .line 309
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ljava/lang/Object;Ll/ۧۚۖ;Ljava/lang/Object;Ll/ᩳۘۖ;Ll/᩵ۘۖ;Ljava/lang/Object;Ll/ܿ֨ۖ;)Ljava/lang/Object;
    .locals 0

    .line 55
    check-cast p3, Ll/֨ᩴۖ;

    const/4 p1, 0x0

    .line 1321
    throw p1
.end method

.method public final ֫(Ll/ᩳۘۖ;Ll/ۡ֡ۖ;I)Ljava/lang/Object;
    .locals 0

    .line 518
    invoke-virtual {p1, p3, p2}, Ll/ᩳۘۖ;->֫(ILl/ۡ֡ۖ;)Ll/֨ᩴۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/Object;)Ll/᩵ۘۖ;
    .locals 0

    .line 27
    check-cast p1, Ll/֡ᩴۖ;

    iget-object p1, p1, Ll/֡ᩴۖ;->ۙ:Ll/᩵ۘۖ;

    return-object p1
.end method

.method public final ֫(Ll/ۛۜۖ;Ljava/lang/Object;Ll/ᩳۘۖ;Ll/᩵ۘۖ;)V
    .locals 0

    .line 542
    check-cast p2, Ll/֨ᩴۖ;

    const/4 p1, 0x0

    .line 545
    throw p1
.end method

.method public final ֫(Ll/ۜ۠ۖ;Ljava/util/Map$Entry;)V
    .locals 0

    .line 315
    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚᩴۖ;

    .line 316
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    sget-object p1, Ll/ۜۘۖ;->֫:[I

    const/4 p1, 0x0

    throw p1
.end method

.method public final ֫(Ll/ۧۚۖ;Ljava/lang/Object;Ll/ᩳۘۖ;Ll/᩵ۘۖ;)V
    .locals 0

    .line 528
    check-cast p2, Ll/֨ᩴۖ;

    const/4 p1, 0x0

    .line 531
    throw p1
.end method

.method public final ֫(Ll/ۡ֡ۖ;)Z
    .locals 0

    .line 22
    instance-of p1, p1, Ll/֡ᩴۖ;

    return p1
.end method

.method public final ۧ(Ljava/lang/Object;)Ll/᩵ۘۖ;
    .locals 1

    .line 37
    check-cast p1, Ll/֡ᩴۖ;

    .line 881
    iget-object v0, p1, Ll/֡ᩴۖ;->ۙ:Ll/᩵ۘۖ;

    invoke-virtual {v0}, Ll/᩵ۘۖ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 882
    iget-object v0, p1, Ll/֡ᩴۖ;->ۙ:Ll/᩵ۘۖ;

    invoke-virtual {v0}, Ll/᩵ۘۖ;->clone()Ll/᩵ۘۖ;

    move-result-object v0

    iput-object v0, p1, Ll/֡ᩴۖ;->ۙ:Ll/᩵ۘۖ;

    .line 884
    :cond_0
    iget-object p1, p1, Ll/֡ᩴۖ;->ۙ:Ll/᩵ۘۖ;

    return-object p1
.end method

.method public final ܽ(Ljava/lang/Object;)V
    .locals 0

    .line 27
    check-cast p1, Ll/֡ᩴۖ;

    iget-object p1, p1, Ll/֡ᩴۖ;->ۙ:Ll/᩵ۘۖ;

    .line 42
    invoke-virtual {p1}, Ll/᩵ۘۖ;->᩷()V

    return-void
.end method
