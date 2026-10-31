.class public final Ll/᩻ܰۡ;
.super Ll/֨᩺ۡ;
.source "07T5"


# virtual methods
.method public final ֫(Ljava/lang/Object;)J
    .locals 2

    .line 6
    check-cast p1, Ll/ۗ᩺ۡ;

    .line 38
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ۨ()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫(JLjava/lang/Object;)V
    .locals 0

    .line 6
    check-cast p3, Ll/ۗ᩺ۡ;

    .line 48
    invoke-virtual {p3, p1, p2}, Ll/ۗ᩺ۡ;->֫(J)V

    return-void
.end method

.method public final ۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 6
    check-cast p1, Ll/ۗ᩺ۡ;

    .line 18
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(JLjava/lang/Object;)V
    .locals 0

    .line 6
    check-cast p3, Ll/ۗ᩺ۡ;

    .line 43
    invoke-virtual {p3, p1, p2}, Ll/ۗ᩺ۡ;->ᩳ(J)V

    return-void
.end method

.method public final ܽ(Ljava/lang/Object;)J
    .locals 2

    .line 6
    check-cast p1, Ll/ۗ᩺ۡ;

    .line 33
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܽ(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 53
    new-instance v0, Ll/ۗ᩺ۡ;

    invoke-direct {v0, p1}, Ll/ۗ᩺ۡ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ܽ(JLjava/lang/Object;)V
    .locals 0

    .line 6
    check-cast p3, Ll/ۗ᩺ۡ;

    .line 28
    invoke-virtual {p3, p1, p2}, Ll/ۗ᩺ۡ;->setTime(J)V

    return-void
.end method

.method public final ᩳ(Ljava/lang/Object;)J
    .locals 2

    .line 6
    check-cast p1, Ll/ۗ᩺ۡ;

    .line 23
    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getTime()J

    move-result-wide v0

    return-wide v0
.end method
