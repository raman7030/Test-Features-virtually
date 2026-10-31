.class public final Ll/ۚ۠֨;
.super Ll/۫᩸֨;
.source "X43L"


# virtual methods
.method public final bridge synthetic ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 0

    .line 2024
    check-cast p1, Ljava/lang/Void;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public final ֫(Ll/ۚۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2024
    check-cast p2, Ljava/lang/Void;

    .line 2048
    iget-object p1, p1, Ll/ۚۚ֨;->ۤ:Ll/ۙ֨֨;

    const/4 p2, 0x0

    .line 4980
    invoke-virtual {p1, p0, p2}, Ll/ۙ֨֨;->֫(Ll/᩸֨֨;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 2048
    check-cast p1, Ljava/lang/Boolean;

    return-object p1
.end method

.method public final bridge synthetic ֫(Ll/ۡ֨֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2024
    check-cast p2, Ljava/lang/Void;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public final ֫(Ll/᩶ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2024
    check-cast p2, Ljava/lang/Void;

    .line 2032
    invoke-virtual {p1}, Ll/ۙ֨֨;->ܳ֫()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 2033
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 2035
    :cond_0
    invoke-virtual {p1}, Ll/᩶ۚ֨;->ۘ֫()Z

    move-result p2

    if-nez p2, :cond_1

    .line 2036
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    .line 2038
    :cond_1
    invoke-virtual {p1}, Ll/᩶ۚ֨;->ܶ()Ll/ۖܶ۠;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۙ֨֨;

    .line 2039
    invoke-virtual {p2}, Ll/ۙ֨֨;->᩸֫()Z

    move-result p2

    if-nez p2, :cond_2

    .line 2040
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 2042
    :cond_3
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method
