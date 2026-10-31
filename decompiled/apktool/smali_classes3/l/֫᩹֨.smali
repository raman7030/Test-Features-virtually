.class public Ll/֫᩹֨;
.super Ll/᩶ۚ۠;
.source "T57T"


# virtual methods
.method public final ֫(Ll/ܳ֡۠;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 741
    check-cast p2, Ljava/lang/Void;

    .line 750
    invoke-super {p0, p1, p2}, Ll/᩶ۚ۠;->֫(Ll/ܳ֡۠;Ljava/lang/Object;)Ll/ܳ֡۠;

    move-result-object p2

    .line 751
    iget-object p1, p1, Ll/ܳ֡۠;->ۛ:Ll/ܿ֡۠;

    sget-object v0, Ll/ܿ֡۠;->᩶:Ll/ܿ֡۠;

    if-ne p1, v0, :cond_0

    .line 753
    iput-object v0, p2, Ll/ܳ֡۠;->ۛ:Ll/ܿ֡۠;

    .line 754
    iget-object p1, p2, Ll/ܳ֡۠;->ۨ:Ll/ۖܶ۠;

    new-instance v0, Ll/۟᩸֨;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, v0}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    :cond_0
    return-object p2
.end method

.method public final bridge synthetic ֫(Ll/᩵֡۠;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 741
    check-cast p2, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2}, Ll/֫᩹֨;->֫(Ll/᩵֡۠;Ljava/lang/Void;)Ll/᩵֡۠;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܳ֡۠;Ljava/lang/Object;)Ll/ܳ֡۠;
    .locals 1

    .line 741
    check-cast p2, Ljava/lang/Void;

    .line 750
    invoke-super {p0, p1, p2}, Ll/᩶ۚ۠;->֫(Ll/ܳ֡۠;Ljava/lang/Object;)Ll/ܳ֡۠;

    move-result-object p2

    .line 751
    iget-object p1, p1, Ll/ܳ֡۠;->ۛ:Ll/ܿ֡۠;

    sget-object v0, Ll/ܿ֡۠;->᩶:Ll/ܿ֡۠;

    if-ne p1, v0, :cond_0

    .line 753
    iput-object v0, p2, Ll/ܳ֡۠;->ۛ:Ll/ܿ֡۠;

    .line 754
    iget-object p1, p2, Ll/ܳ֡۠;->ۨ:Ll/ۖܶ۠;

    new-instance v0, Ll/۟᩸֨;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, v0}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    :cond_0
    return-object p2
.end method

.method public final bridge synthetic ֫(Ll/᩵֡۠;Ljava/lang/Object;)Ll/᩵֡۠;
    .locals 0

    .line 741
    check-cast p2, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2}, Ll/֫᩹֨;->֫(Ll/᩵֡۠;Ljava/lang/Void;)Ll/᩵֡۠;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩵֡۠;Ljava/lang/Void;)Ll/᩵֡۠;
    .locals 1

    .line 762
    invoke-super {p0, p1, p2}, Ll/᩶ۚ۠;->֫(Ll/᩵֡۠;Ljava/lang/Object;)Ll/᩵֡۠;

    move-result-object p2

    .line 763
    iget-object v0, p1, Ll/᩵֡۠;->۬:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p1, Ll/᩵֡۠;->۬:Ll/ۖܶ۠;

    iget-object p1, p1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast p1, Ll/۫᩵۠;

    sget-object v0, Ll/ᩴۚ۠;->ᩴۧ:Ll/ᩴۚ۠;

    invoke-virtual {p1, v0}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 765
    iget-object p1, p2, Ll/᩵֡۠;->۬:Ll/ۖܶ۠;

    iget-object v0, p1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ۜۚ۠;

    iget-object v0, v0, Ll/ۜۚ۠;->۫:Ll/۫᩵۠;

    iput-object v0, p2, Ll/᩵֡۠;->᩺:Ll/۫᩵۠;

    .line 766
    iget-object p1, p1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    iput-object p1, p2, Ll/᩵֡۠;->۬:Ll/ۖܶ۠;

    :cond_0
    return-object p2
.end method
