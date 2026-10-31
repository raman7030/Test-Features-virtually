.class public final Ll/ᩳܶ֡;
.super Ljava/lang/Object;
.source "35UV"


# direct methods
.method public static ֫(Ll/֨ܶ֡;ILl/᩺֫ۚ;)Ll/ۧܶ֡;
    .locals 5

    .line 46
    instance-of v0, p2, Ll/۟֫ۚ;

    if-eqz v0, :cond_2

    .line 47
    new-instance v0, Ll/ܳܶ֡;

    iget-object v1, p0, Ll/֨ܶ֡;->ۜ:Ll/᩹ܶ֡;

    check-cast p2, Ll/۟֫ۚ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۧܶ֡;-><init>(Ll/֨ܶ֡;ILl/᩺֫ۚ;)V

    .line 49
    new-instance v2, Ll/᩵ܶ֡;

    invoke-interface {p2}, Ll/۟֫ۚ;->ۖ()I

    move-result p2

    add-int/2addr p2, p1

    .line 63
    iget-object p1, v0, Ll/ۧܶ֡;->᩹:Ll/᩺֫ۚ;

    check-cast p1, Ll/۟֫ۚ;

    invoke-interface {p1}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object p1

    .line 64
    sget-object v3, Ll/ܿܶ֡;->֫:[I

    iget-object v4, p1, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    packed-switch v3, :pswitch_data_0

    const/4 p1, 0x0

    goto :goto_0

    .line 73
    :pswitch_0
    sget-object v3, Ll/֨ۗ֡;->۟ۧ:Ll/֨ۗ֡;

    if-ne p1, v3, :cond_0

    const-string p1, "array_"

    goto :goto_0

    .line 76
    :cond_0
    sget-object v3, Ll/֨ۗ֡;->᩹ܳ:Ll/֨ۗ֡;

    if-ne p1, v3, :cond_1

    const-string p1, "pswitch_data_"

    goto :goto_0

    :cond_1
    const-string p1, "sswitch_data_"

    goto :goto_0

    :pswitch_1
    const-string p1, "cond_"

    goto :goto_0

    :pswitch_2
    const-string p1, "goto_"

    .line 49
    :goto_0
    invoke-direct {v2, v1, p2, p1}, Ll/᩵ܶ֡;-><init>(Ll/᩹ܶ֡;ILjava/lang/String;)V

    iput-object v2, v0, Ll/ܳܶ֡;->ۗ:Ll/᩵ܶ֡;

    .line 50
    invoke-virtual {p0}, Ll/֨ܶ֡;->֫()Ll/ۚܶ֡;

    move-result-object p0

    invoke-virtual {p0, v2}, Ll/ۚܶ֡;->֫(Ll/᩵ܶ֡;)Ll/᩵ܶ֡;

    move-result-object p0

    iput-object p0, v0, Ll/ܳܶ֡;->ۗ:Ll/᩵ܶ֡;

    return-object v0

    .line 51
    :cond_2
    instance-of v0, p2, Ll/۫ۗ֡;

    if-eqz v0, :cond_3

    .line 52
    new-instance v0, Ll/ᩴܶ֡;

    check-cast p2, Ll/۫ۗ֡;

    .line 42
    invoke-direct {v0, p0, p1, p2}, Ll/ۧܶ֡;-><init>(Ll/֨ܶ֡;ILl/᩺֫ۚ;)V

    return-object v0

    .line 56
    :cond_3
    sget-object v0, Ll/ܽܶ֡;->֫:[I

    invoke-interface {p2}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v1

    iget-object v1, v1, Ll/֨ۗ֡;->ۙ:Ll/ۘۗ֡;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_6

    const/4 v1, 0x2

    if-eq v0, v1, :cond_5

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    .line 64
    invoke-static {p0, p1, p2}, Ll/ۧܶ֡;->֫(Ll/֨ܶ֡;ILl/᩺֫ۚ;)Ll/ۧܶ֡;

    move-result-object p0

    return-object p0

    .line 62
    :cond_4
    new-instance v0, Ll/ۘܶ֡;

    check-cast p2, Ll/ܺܽۚ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۘܶ֡;-><init>(Ll/֨ܶ֡;ILl/ܺܽۚ;)V

    return-object v0

    .line 60
    :cond_5
    new-instance v0, Ll/ۢܶ֡;

    check-cast p2, Ll/ۡܽۚ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۢܶ֡;-><init>(Ll/֨ܶ֡;ILl/ۡܽۚ;)V

    return-object v0

    .line 58
    :cond_6
    new-instance v0, Ll/۟۠֡;

    check-cast p2, Ll/ۡۧۚ;

    .line 41
    invoke-direct {v0, p0, p1, p2}, Ll/ۧܶ֡;-><init>(Ll/֨ܶ֡;ILl/᩺֫ۚ;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
