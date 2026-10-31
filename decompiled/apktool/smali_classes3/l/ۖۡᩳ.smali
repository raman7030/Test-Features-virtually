.class public final Ll/ۖۡᩳ;
.super Ll/ᩳۡᩳ;
.source "81WQ"


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "ParameterEmpty"

    return-object v0
.end method

.method public final ֫(Ll/֡᩷ۚ;)Z
    .locals 1

    .line 33
    iget-object v0, p0, Ll/᩻ۡᩳ;->֫:Ll/ܿۡᩳ;

    iget-object v0, v0, Ll/ܿۡᩳ;->֫:Ljava/util/HashSet;

    invoke-virtual {p1}, Ll/֡᩷ۚ;->getType()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ll/֨ۢۚ;Ll/᩵֫ۚ;)Z
    .locals 0

    .line 38
    invoke-interface {p2}, Ll/᩵֫ۚ;->᩷()Ljava/lang/Iterable;

    move-result-object p1

    .line 42
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩺֫ۚ;

    .line 43
    invoke-interface {p2}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object p2

    iget p2, p2, Ll/֨ۗ֡;->۬:I

    packed-switch p2, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 p1, 0x1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    :goto_1
    xor-int/lit8 p1, p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
