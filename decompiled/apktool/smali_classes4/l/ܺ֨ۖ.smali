.class public final Ll/ܺ֨ۖ;
.super Ll/ܿ֨ۖ;
.source "S9O2"


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 1

    .line 26
    invoke-static {}, Ll/ۡ֨ۖ;->ܿ()Ll/ۡ֨ۖ;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 67
    check-cast p1, Ll/᩸ᩴۖ;

    iget-object v0, p1, Ll/᩸ᩴۖ;->᩹:Ll/ۡ֨ۖ;

    .line 75
    invoke-static {}, Ll/ۡ֨ۖ;->ᩳ()Ll/ۡ֨ۖ;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 76
    invoke-static {}, Ll/ۡ֨ۖ;->ܿ()Ll/ۡ֨ۖ;

    move-result-object v0

    .line 62
    iput-object v0, p1, Ll/᩸ᩴۖ;->᩹:Ll/ۡ֨ۖ;

    :cond_0
    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 12
    check-cast p1, Ll/ۡ֨ۖ;

    check-cast p2, Ll/ۡ֨ۖ;

    .line 104
    invoke-static {}, Ll/ۡ֨ۖ;->ᩳ()Ll/ۡ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p2}, Ll/ۡ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    .line 107
    :cond_0
    invoke-static {}, Ll/ۡ֨ۖ;->ᩳ()Ll/ۡ֨ۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۡ֨ۖ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 108
    invoke-static {p1, p2}, Ll/ۡ֨ۖ;->֫(Ll/ۡ֨ۖ;Ll/ۡ֨ۖ;)Ll/ۡ֨ۖ;

    move-result-object p1

    return-object p1

    .line 110
    :cond_1
    invoke-virtual {p1, p2}, Ll/ۡ֨ۖ;->֫(Ll/ۡ֨ۖ;)V

    return-object p1
.end method

.method public final ֫(IILjava/lang/Object;)V
    .locals 0

    .line 12
    check-cast p3, Ll/ۡ֨ۖ;

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x5

    .line 36
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Ll/ۡ֨ۖ;->֫(ILjava/lang/Object;)V

    return-void
.end method

.method public final ֫(IJLjava/lang/Object;)V
    .locals 0

    .line 12
    check-cast p4, Ll/ۡ֨ۖ;

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x1

    .line 41
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p4, p1, p2}, Ll/ۡ֨ۖ;->֫(ILjava/lang/Object;)V

    return-void
.end method

.method public final ֫(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 12
    check-cast p2, Ll/ۡ֨ۖ;

    check-cast p3, Ll/ۡ֨ۖ;

    shl-int/lit8 p1, p1, 0x3

    or-int/lit8 p1, p1, 0x3

    .line 51
    invoke-virtual {p2, p1, p3}, Ll/ۡ֨ۖ;->֫(ILjava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;ILl/ۛۜۖ;)V
    .locals 0

    .line 12
    check-cast p1, Ll/ۡ֨ۖ;

    shl-int/lit8 p2, p2, 0x3

    or-int/lit8 p2, p2, 0x2

    .line 46
    invoke-virtual {p1, p2, p3}, Ll/ۡ֨ۖ;->֫(ILjava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;Ll/ۜ۠ۖ;)V
    .locals 0

    .line 12
    check-cast p1, Ll/ۡ֨ۖ;

    .line 99
    invoke-virtual {p1, p2}, Ll/ۡ֨ۖ;->֫(Ll/ۜ۠ۖ;)V

    return-void
.end method

.method public final ֫(Ll/ۧۚۖ;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 67
    check-cast p1, Ll/᩸ᩴۖ;

    iget-object p1, p1, Ll/᩸ᩴۖ;->᩹:Ll/ۡ֨ۖ;

    return-object p1
.end method

.method public final ۧ(IJLjava/lang/Object;)V
    .locals 0

    .line 12
    check-cast p4, Ll/ۡ֨ۖ;

    shl-int/lit8 p1, p1, 0x3

    .line 31
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p4, p1, p2}, Ll/ۡ֨ۖ;->֫(ILjava/lang/Object;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 12
    check-cast p2, Ll/ۡ֨ۖ;

    .line 62
    check-cast p1, Ll/᩸ᩴۖ;

    iput-object p2, p1, Ll/᩸ᩴۖ;->᩹:Ll/ۡ֨ۖ;

    return-void
.end method

.method public final ۧ(Ljava/lang/Object;Ll/ۜ۠ۖ;)V
    .locals 0

    .line 12
    check-cast p1, Ll/ۡ֨ۖ;

    .line 94
    invoke-virtual {p1, p2}, Ll/ۡ֨ۖ;->ۧ(Ll/ۜ۠ۖ;)V

    return-void
.end method

.method public final ܳ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 12
    check-cast p1, Ll/ۡ֨ۖ;

    .line 56
    invoke-virtual {p1}, Ll/ۡ֨ۖ;->ܽ()V

    return-object p1
.end method

.method public final ܽ(Ljava/lang/Object;)I
    .locals 0

    .line 12
    check-cast p1, Ll/ۡ֨ۖ;

    .line 115
    invoke-virtual {p1}, Ll/ۡ֨ۖ;->֫()I

    move-result p1

    return p1
.end method

.method public final ܽ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 12
    check-cast p2, Ll/ۡ֨ۖ;

    .line 62
    check-cast p1, Ll/᩸ᩴۖ;

    iput-object p2, p1, Ll/᩸ᩴۖ;->᩹:Ll/ۡ֨ۖ;

    return-void
.end method

.method public final ܿ(Ljava/lang/Object;)V
    .locals 0

    .line 67
    check-cast p1, Ll/᩸ᩴۖ;

    iget-object p1, p1, Ll/᩸ᩴۖ;->᩹:Ll/ۡ֨ۖ;

    .line 89
    invoke-virtual {p1}, Ll/ۡ֨ۖ;->ܽ()V

    return-void
.end method

.method public final ᩳ(Ljava/lang/Object;)I
    .locals 0

    .line 12
    check-cast p1, Ll/ۡ֨ۖ;

    .line 120
    invoke-virtual {p1}, Ll/ۡ֨ۖ;->ۧ()I

    move-result p1

    return p1
.end method
