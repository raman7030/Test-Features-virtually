.class public Ll/᩶᩹ۖ;
.super Ljava/lang/Object;
.source "T5IF"


# virtual methods
.method public ֫(Ll/֫ۙۖ;)Ll/֫ۙۖ;
    .locals 2

    .line 25
    sget-object v0, Ll/᩹᩹ۖ;->֫:[I

    iget-object v1, p1, Ll/֫ۙۖ;->ۧ:Ll/֡᩹ۖ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    return-object p1

    :cond_0
    const/4 p1, 0x0

    .line 37
    throw p1

    .line 32
    :cond_1
    invoke-virtual {p1}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/᩶᩹ۖ;->֫(Ll/۠᩶ۖ;)Ll/۠᩶ۖ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/֫ۙۖ;->ۧ(Ll/۠᩶ۖ;)V

    .line 33
    invoke-virtual {p1}, Ll/֫ۙۖ;->ܿ()Ll/۠᩶ۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/᩶᩹ۖ;->֫(Ll/۠᩶ۖ;)Ll/۠᩶ۖ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/֫ۙۖ;->ܽ(Ll/۠᩶ۖ;)V

    return-object p1

    .line 29
    :cond_2
    invoke-virtual {p1}, Ll/֫ۙۖ;->ܽ()Ll/۠᩶ۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/᩶᩹ۖ;->֫(Ll/۠᩶ۖ;)Ll/۠᩶ۖ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/֫ۙۖ;->֫(Ll/۠᩶ۖ;)V

    return-object p1
.end method

.method public ֫(Ll/۠᩶ۖ;)Ll/۠᩶ۖ;
    .locals 3

    .line 46
    sget-object v0, Ll/᩹᩹ۖ;->֫:[I

    iget-object v1, p1, Ll/۠᩶ۖ;->᩸:Ll/֡᩹ۖ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_1

    .line 57
    :cond_0
    invoke-virtual {p1}, Ll/۠᩶ۖ;->ܿ()[Ll/۠᩶ۖ;

    move-result-object v0

    const/4 v1, 0x0

    .line 58
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_1

    .line 59
    aget-object v2, v0, v1

    invoke-virtual {p0, v2}, Ll/᩶᩹ۖ;->֫(Ll/۠᩶ۖ;)Ll/۠᩶ۖ;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-object p1

    .line 53
    :cond_2
    invoke-virtual {p1}, Ll/۠᩶ۖ;->ܽ()Ll/۠᩶ۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/᩶᩹ۖ;->֫(Ll/۠᩶ۖ;)Ll/۠᩶ۖ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/۠᩶ۖ;->ۧ(Ll/۠᩶ۖ;)V

    .line 54
    invoke-virtual {p1}, Ll/۠᩶ۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/᩶᩹ۖ;->֫(Ll/۠᩶ۖ;)Ll/۠᩶ۖ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/۠᩶ۖ;->ܽ(Ll/۠᩶ۖ;)V

    return-object p1

    .line 50
    :cond_3
    invoke-virtual {p1}, Ll/۠᩶ۖ;->֫()Ll/۠᩶ۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/᩶᩹ۖ;->֫(Ll/۠᩶ۖ;)Ll/۠᩶ۖ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/۠᩶ۖ;->֫(Ll/۠᩶ۖ;)V

    return-object p1
.end method
