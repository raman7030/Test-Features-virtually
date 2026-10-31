.class public final Ll/᩺᩹ۖ;
.super Ljava/lang/Object;
.source "W5BJ"


# direct methods
.method public static ֫(Ll/ᩳ᩶ۖ;Ll/ᩴ᩶ۖ;Ljava/lang/String;)Ll/ۤ᩹ۖ;
    .locals 2

    .line 89
    new-instance v0, Ll/ۤ᩹ۖ;

    sget-object v1, Ll/֨᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    invoke-direct {v0, v1, p0, p1, p2}, Ll/ۤ᩹ۖ;-><init>(Ll/֨᩶ۖ;Ll/۠᩶ۖ;Ll/۠᩶ۖ;Ljava/lang/String;)V

    return-object v0
.end method

.method public static ֫([Ll/۠᩶ۖ;[Ljava/lang/String;Ljava/lang/String;)Ll/ۧ᩶ۖ;
    .locals 8

    .line 189
    new-instance v7, Ll/ۧ᩶ۖ;

    sget-object v1, Ll/֨᩶ۖ;->ۖ֫:Ll/֨᩶ۖ;

    const-string v4, "<init>"

    move-object v0, v7

    move-object v2, p0

    move-object v3, p2

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Ll/ۧ᩶ۖ;-><init>(Ll/֨᩶ۖ;[Ll/۠᩶ۖ;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V

    return-object v7
.end method

.method public static ֫(I)Ll/ۨ᩹ۖ;
    .locals 1

    .line 61
    new-instance v0, Ll/ۨ᩹ۖ;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-direct {v0, p0}, Ll/ۨ᩹ۖ;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static ۧ(Ll/ᩳ᩶ۖ;Ll/ᩴ᩶ۖ;Ljava/lang/String;)Ll/ۤ᩹ۖ;
    .locals 2

    .line 125
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    :pswitch_1
    const-string v0, "J"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x3

    goto :goto_0

    :pswitch_2
    const-string v0, "I"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    goto :goto_0

    :pswitch_3
    const-string v0, "F"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    goto :goto_0

    :pswitch_4
    const-string v0, "D"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_1

    .line 135
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "type must set to one of I/J/F/D"

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 129
    :pswitch_5
    new-instance v0, Ll/ۤ᩹ۖ;

    sget-object v1, Ll/֨᩶ۖ;->֨֫:Ll/֨᩶ۖ;

    invoke-direct {v0, v1, p0, p1, p2}, Ll/ۤ᩹ۖ;-><init>(Ll/֨᩶ۖ;Ll/۠᩶ۖ;Ll/۠᩶ۖ;Ljava/lang/String;)V

    return-object v0

    .line 127
    :pswitch_6
    new-instance v0, Ll/ۤ᩹ۖ;

    sget-object v1, Ll/֨᩶ۖ;->᩷֫:Ll/֨᩶ۖ;

    invoke-direct {v0, v1, p0, p1, p2}, Ll/ۤ᩹ۖ;-><init>(Ll/֨᩶ۖ;Ll/۠᩶ۖ;Ll/۠᩶ۖ;Ljava/lang/String;)V

    return-object v0

    .line 131
    :pswitch_7
    new-instance v0, Ll/ۤ᩹ۖ;

    sget-object v1, Ll/֨᩶ۖ;->ᩳ֫:Ll/֨᩶ۖ;

    invoke-direct {v0, v1, p0, p1, p2}, Ll/ۤ᩹ۖ;-><init>(Ll/֨᩶ۖ;Ll/۠᩶ۖ;Ll/۠᩶ۖ;Ljava/lang/String;)V

    return-object v0

    .line 133
    :pswitch_8
    new-instance v0, Ll/ۤ᩹ۖ;

    sget-object v1, Ll/֨᩶ۖ;->ܰ:Ll/֨᩶ۖ;

    invoke-direct {v0, v1, p0, p1, p2}, Ll/ۤ᩹ۖ;-><init>(Ll/֨᩶ۖ;Ll/۠᩶ۖ;Ll/۠᩶ۖ;Ljava/lang/String;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x44
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch
.end method

.method public static ܽ(Ll/ᩳ᩶ۖ;Ll/ᩴ᩶ۖ;Ljava/lang/String;)Ll/ۤ᩹ۖ;
    .locals 2

    .line 244
    new-instance v0, Ll/ۤ᩹ۖ;

    sget-object v1, Ll/֨᩶ۖ;->᩶֫:Ll/֨᩶ۖ;

    invoke-direct {v0, v1, p0, p1, p2}, Ll/ۤ᩹ۖ;-><init>(Ll/֨᩶ۖ;Ll/۠᩶ۖ;Ll/۠᩶ۖ;Ljava/lang/String;)V

    return-object v0
.end method

.method public static ܿ(Ll/ᩳ᩶ۖ;Ll/ᩴ᩶ۖ;Ljava/lang/String;)Ll/ۤ᩹ۖ;
    .locals 2

    .line 308
    new-instance v0, Ll/ۤ᩹ۖ;

    sget-object v1, Ll/֨᩶ۖ;->ᩳۧ:Ll/֨᩶ۖ;

    invoke-direct {v0, v1, p1, p0, p2}, Ll/ۤ᩹ۖ;-><init>(Ll/֨᩶ۖ;Ll/۠᩶ۖ;Ll/۠᩶ۖ;Ljava/lang/String;)V

    return-object v0
.end method

.method public static ᩳ(Ll/ᩳ᩶ۖ;Ll/ᩴ᩶ۖ;Ljava/lang/String;)Ll/ۤ᩹ۖ;
    .locals 2

    .line 292
    new-instance v0, Ll/ۤ᩹ۖ;

    sget-object v1, Ll/֨᩶ۖ;->۟֫:Ll/֨᩶ۖ;

    invoke-direct {v0, v1, p0, p1, p2}, Ll/ۤ᩹ۖ;-><init>(Ll/֨᩶ۖ;Ll/۠᩶ۖ;Ll/۠᩶ۖ;Ljava/lang/String;)V

    return-object v0
.end method
