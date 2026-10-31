.class public abstract Ll/ۤ᩵ۚ;
.super Ljava/lang/Object;
.source "R4WH"


# direct methods
.method public static ֫(I)I
    .locals 0

    and-int/lit16 p0, p0, 0xf0

    ushr-int/lit8 p0, p0, 0x4

    return p0
.end method

.method public static ֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;)I
    .locals 1

    .line 23
    instance-of v0, p1, Landroid/text/Spanned;

    if-eqz v0, :cond_1

    .line 24
    check-cast p1, Landroid/text/Spanned;

    .line 27
    invoke-static {p1}, Ll/ᩴۗۘ;->֫(Landroid/text/Spanned;)Landroid/text/Layout;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 29
    invoke-virtual {v0}, Landroid/text/Layout;->getWidth()I

    move-result p0

    return p0

    .line 33
    :cond_0
    invoke-static {p1}, Ll/᩵ۗۘ;->֫(Landroid/text/Spanned;)Landroid/widget/TextView;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 35
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p0

    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    sub-int/2addr p0, v0

    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result p1

    sub-int/2addr p0, p1

    return p0

    .line 40
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/Canvas;->getWidth()I

    move-result p0

    return p0
.end method

.method public static ֫(Ll/۬ۛ֡;Ll/ᩴۨ֡;)Ll/ۤܽۚ;
    .locals 8

    .line 55
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ۧ()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 58
    :try_start_0
    invoke-virtual {p1}, Ll/ᩴۨ֡;->ۖ()I

    move-result v3

    and-int/lit8 v4, v3, 0x1f

    ushr-int/lit8 v3, v3, 0x5

    if-eqz v4, :cond_7

    const/4 v5, 0x6

    const/4 v6, 0x7

    if-eq v4, v5, :cond_6

    const/4 v5, 0x2

    if-eq v4, v5, :cond_5

    const/4 v5, 0x3

    if-eq v4, v5, :cond_4

    const/4 v7, 0x4

    if-eq v4, v7, :cond_3

    const/16 v7, 0x10

    if-eq v4, v7, :cond_2

    const/16 v7, 0x11

    if-eq v4, v7, :cond_1

    packed-switch v4, :pswitch_data_0

    .line 120
    new-instance p0, Ll/ܶ᩵ۚ;

    goto :goto_0

    .line 111
    :pswitch_0
    invoke-static {v3, v2}, Ll/ۧᩳܽ;->֫(II)V

    if-ne v3, v2, :cond_0

    .line 48
    sget-object p0, Ll/֫ܿۚ;->᩶:Ll/֫ܿۚ;

    return-object p0

    :cond_0
    sget-object p0, Ll/֫ܿۚ;->᩹:Ll/֫ܿۚ;

    return-object p0

    .line 108
    :pswitch_1
    invoke-static {v3, v1}, Ll/ۧᩳܽ;->֫(II)V

    .line 109
    sget-object p0, Ll/᩵ܿۚ;->᩸:Ll/᩵ܿۚ;

    return-object p0

    .line 105
    :pswitch_2
    invoke-static {v3, v1}, Ll/ۧᩳܽ;->֫(II)V

    .line 106
    new-instance v3, Ll/۬۟֡;

    invoke-direct {v3, p0, p1}, Ll/۬۟֡;-><init>(Ll/۬ۛ֡;Ll/ᩴۨ֡;)V

    return-object v3

    .line 102
    :pswitch_3
    invoke-static {v3, v1}, Ll/ۧᩳܽ;->֫(II)V

    .line 103
    new-instance v3, Ll/ۤ۟֡;

    invoke-direct {v3, p0, p1}, Ll/ۤ۟֡;-><init>(Ll/۬ۛ֡;Ll/ᩴۨ֡;)V

    return-object v3

    .line 99
    :pswitch_4
    invoke-static {v3, v5}, Ll/ۧᩳܽ;->֫(II)V

    .line 100
    new-instance v4, Ll/ۛ۟֡;

    invoke-direct {v4, p0, p1, v3}, Ll/ۛ۟֡;-><init>(Ll/۬ۛ֡;Ll/ᩴۨ֡;I)V

    return-object v4

    .line 96
    :pswitch_5
    invoke-static {v3, v5}, Ll/ۧᩳܽ;->֫(II)V

    .line 97
    new-instance v4, Ll/᩺۟֡;

    invoke-direct {v4, p0, p1, v3}, Ll/᩺۟֡;-><init>(Ll/۬ۛ֡;Ll/ᩴۨ֡;I)V

    return-object v4

    .line 93
    :pswitch_6
    invoke-static {v3, v5}, Ll/ۧᩳܽ;->֫(II)V

    .line 94
    new-instance v4, Ll/ۨ۟֡;

    invoke-direct {v4, p0, p1, v3}, Ll/ۨ۟֡;-><init>(Ll/۬ۛ֡;Ll/ᩴۨ֡;I)V

    return-object v4

    .line 90
    :pswitch_7
    invoke-static {v3, v5}, Ll/ۧᩳܽ;->֫(II)V

    .line 91
    new-instance v4, Ll/ۧ֫ۚ;

    invoke-direct {v4, p0, p1, v3}, Ll/ۧ֫ۚ;-><init>(Ll/۬ۛ֡;Ll/ᩴۨ֡;I)V

    return-object v4

    .line 87
    :pswitch_8
    invoke-static {v3, v5}, Ll/ۧᩳܽ;->֫(II)V

    .line 88
    new-instance v4, Ll/֫֫ۚ;

    invoke-direct {v4, p0, p1, v3}, Ll/֫֫ۚ;-><init>(Ll/۬ۛ֡;Ll/ᩴۨ֡;I)V

    return-object v4

    .line 114
    :pswitch_9
    invoke-static {v3, v5}, Ll/ۧᩳܽ;->֫(II)V

    .line 115
    new-instance v4, Ll/ܰ۟֡;

    invoke-direct {v4, p0, p1, v3}, Ll/ܰ۟֡;-><init>(Ll/۬ۛ֡;Ll/ᩴۨ֡;I)V

    return-object v4

    .line 117
    :pswitch_a
    invoke-static {v3, v5}, Ll/ۧᩳܽ;->֫(II)V

    .line 118
    new-instance v4, Ll/۟۟֡;

    invoke-direct {v4, p0, p1, v3}, Ll/۟۟֡;-><init>(Ll/۬ۛ֡;Ll/ᩴۨ֡;I)V

    return-object v4

    :goto_0
    const-string p1, "Invalid encoded_value type: 0x%x"

    .line 120
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-array v4, v2, [Ljava/lang/Object;

    aput-object v3, v4, v1

    const/4 v3, 0x0

    .line 46
    invoke-direct {p0, v3, p1, v4}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    throw p0

    .line 83
    :cond_1
    invoke-static {v3, v6}, Ll/ۧᩳܽ;->֫(II)V

    .line 84
    new-instance p0, Ll/ᩳܿۚ;

    add-int/2addr v3, v2

    .line 85
    invoke-virtual {p1, v3}, Ll/ᩴۨ֡;->ܳ(I)J

    move-result-wide v3

    .line 84
    invoke-static {v3, v4}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v3

    invoke-direct {p0, v3, v4}, Ll/ᩳܿۚ;-><init>(D)V

    return-object p0

    .line 79
    :cond_2
    invoke-static {v3, v5}, Ll/ۧᩳܽ;->֫(II)V

    .line 80
    new-instance p0, Ll/ۢܿۚ;

    add-int/2addr v3, v2

    .line 81
    invoke-virtual {p1, v3}, Ll/ᩴۨ֡;->ܿ(I)I

    move-result p1

    .line 80
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-direct {p0, p1}, Ll/ۢܿۚ;-><init>(F)V

    return-object p0

    .line 73
    :cond_3
    invoke-static {v3, v5}, Ll/ۧᩳܽ;->֫(II)V

    .line 74
    new-instance p0, Ll/ۡܿۚ;

    add-int/2addr v3, v2

    invoke-virtual {p1, v3}, Ll/ᩴۨ֡;->ܽ(I)I

    move-result p1

    invoke-direct {p0, p1}, Ll/ۡܿۚ;-><init>(I)V

    return-object p0

    .line 70
    :cond_4
    invoke-static {v3, v2}, Ll/ۧᩳܽ;->֫(II)V

    .line 71
    new-instance p0, Ll/ܽܿۚ;

    add-int/2addr v3, v2

    invoke-virtual {p1, v3}, Ll/ᩴۨ֡;->᩻(I)I

    move-result p1

    int-to-char p1, p1

    invoke-direct {p0, p1}, Ll/ܽܿۚ;-><init>(C)V

    return-object p0

    .line 67
    :cond_5
    invoke-static {v3, v2}, Ll/ۧᩳܽ;->֫(II)V

    .line 68
    new-instance p0, Ll/֡ܿۚ;

    add-int/2addr v3, v2

    invoke-virtual {p1, v3}, Ll/ᩴۨ֡;->ܽ(I)I

    move-result p1

    int-to-short p1, p1

    invoke-direct {p0, p1}, Ll/֡ܿۚ;-><init>(S)V

    return-object p0

    .line 76
    :cond_6
    invoke-static {v3, v6}, Ll/ۧᩳܽ;->֫(II)V

    .line 77
    new-instance p0, Ll/ܺܿۚ;

    add-int/2addr v3, v2

    invoke-virtual {p1, v3}, Ll/ᩴۨ֡;->ᩳ(I)J

    move-result-wide v3

    invoke-direct {p0, v3, v4}, Ll/ܺܿۚ;-><init>(J)V

    return-object p0

    .line 64
    :cond_7
    invoke-static {v3, v1}, Ll/ۧᩳܽ;->֫(II)V

    .line 65
    new-instance p0, Ll/ۧܿۚ;

    invoke-virtual {p1}, Ll/ᩴۨ֡;->᩷()I

    move-result p1

    int-to-byte p1, p1

    invoke-direct {p0, p1}, Ll/ۧܿۚ;-><init>(B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 123
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    new-array v0, v2, [Ljava/lang/Object;

    aput-object p1, v0, v1

    const-string p1, "Error while reading encoded value at offset 0x%x"

    invoke-static {p0, p1, v0}, Ll/ܶ᩵ۚ;->֫(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܶ᩵ۚ;

    move-result-object p0

    throw p0

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/ᩴۨ֡;)V
    .locals 6

    .line 128
    invoke-virtual {p0}, Ll/ᩴۨ֡;->ۧ()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 131
    :try_start_0
    invoke-virtual {p0}, Ll/ᩴۨ֡;->ۖ()I

    move-result v3

    and-int/lit8 v4, v3, 0x1f

    if-eqz v4, :cond_2

    const/4 v5, 0x6

    if-eq v4, v5, :cond_1

    const/4 v5, 0x2

    if-eq v4, v5, :cond_1

    const/4 v5, 0x3

    if-eq v4, v5, :cond_1

    const/4 v5, 0x4

    if-eq v4, v5, :cond_1

    const/16 v5, 0x10

    if-eq v4, v5, :cond_1

    const/16 v5, 0x11

    if-eq v4, v5, :cond_1

    packed-switch v4, :pswitch_data_0

    .line 164
    new-instance p0, Ll/ܶ᩵ۚ;

    goto :goto_1

    .line 158
    :pswitch_0
    invoke-static {p0}, Ll/۬۟֡;->֫(Ll/ᩴۨ֡;)V

    return-void

    .line 59
    :pswitch_1
    invoke-virtual {p0}, Ll/ᩴۨ֡;->ܺ()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    .line 65
    invoke-static {p0}, Ll/ۤ᩵ۚ;->֫(Ll/ᩴۨ֡;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    :pswitch_2
    return-void

    :goto_1
    const-string v3, "Invalid encoded_value type: 0x%x"

    .line 164
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    new-array v5, v2, [Ljava/lang/Object;

    aput-object v4, v5, v1

    const/4 v4, 0x0

    .line 46
    invoke-direct {p0, v4, v3, v5}, Ll/ܶ᩵ۚ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    throw p0

    :cond_1
    :pswitch_3
    ushr-int/lit8 v3, v3, 0x5

    add-int/2addr v3, v2

    .line 152
    invoke-virtual {p0, v3}, Ll/ᩴۨ֡;->֫(I)V

    return-void

    .line 136
    :cond_2
    invoke-virtual {p0}, Ll/ᩴۨ֡;->᩵()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 168
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v2, v2, [Ljava/lang/Object;

    aput-object v0, v2, v1

    const-string v0, "Error while skipping encoded value at offset 0x%x"

    .line 167
    invoke-static {p0, v0, v2}, Ll/ܶ᩵ۚ;->֫(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)Ll/ܶ᩵ۚ;

    move-result-object p0

    throw p0

    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method
