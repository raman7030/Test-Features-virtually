.class public Ll/᩸᩹ۖ;
.super Ljava/lang/Object;
.source "44TK"


# virtual methods
.method public ֫(Ll/֫ۙۖ;)V
    .locals 2

    .line 15
    sget-object v0, Ll/ܶ᩹ۖ;->֫:[I

    iget-object v1, p1, Ll/֫ۙۖ;->ۧ:Ll/֡᩹ۖ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 p1, 0x4

    if-eq v0, p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 27
    throw p1

    .line 22
    :cond_1
    invoke-virtual {p1}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/᩸᩹ۖ;->֫(Ll/۠᩶ۖ;)V

    .line 23
    invoke-virtual {p1}, Ll/֫ۙۖ;->ܿ()Ll/۠᩶ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩸᩹ۖ;->֫(Ll/۠᩶ۖ;)V

    return-void

    .line 19
    :cond_2
    invoke-virtual {p1}, Ll/֫ۙۖ;->ܽ()Ll/۠᩶ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩸᩹ۖ;->֫(Ll/۠᩶ۖ;)V

    return-void
.end method

.method public ֫(Ll/۠᩶ۖ;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method
