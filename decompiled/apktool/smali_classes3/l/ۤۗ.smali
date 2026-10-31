.class public final Ll/ۤۗ;
.super Ljava/lang/Object;
.source "C1AZ"


# direct methods
.method public static ֫(Ll/ۛۗ;)Landroid/graphics/ColorFilter;
    .locals 4

    .line 45
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-lt v0, v1, :cond_0

    .line 47
    invoke-static {p0}, Ll/᩺ۗ;->֫(Ll/ۛۗ;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_2

    .line 49
    invoke-static {v2, p0}, Ll/۫ۗ;->֫(ILjava/lang/Object;)Landroid/graphics/ColorFilter;

    move-result-object p0

    return-object p0

    :cond_0
    if-nez p0, :cond_1

    goto :goto_0

    .line 116
    :cond_1
    sget-object v0, Ll/ۨۗ;->֫:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 153
    :pswitch_0
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->LIGHTEN:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    .line 151
    :pswitch_1
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DARKEN:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    .line 149
    :pswitch_2
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->OVERLAY:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    .line 147
    :pswitch_3
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SCREEN:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    .line 145
    :pswitch_4
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    .line 142
    :pswitch_5
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->ADD:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    .line 140
    :pswitch_6
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->XOR:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    .line 138
    :pswitch_7
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DST_ATOP:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    .line 136
    :pswitch_8
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    .line 134
    :pswitch_9
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DST_OUT:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    .line 132
    :pswitch_a
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_OUT:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    .line 130
    :pswitch_b
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DST_IN:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    .line 128
    :pswitch_c
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    .line 126
    :pswitch_d
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DST_OVER:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    .line 124
    :pswitch_e
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    .line 122
    :pswitch_f
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->DST:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    .line 120
    :pswitch_10
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->SRC:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    .line 118
    :pswitch_11
    sget-object p0, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    :goto_0
    move-object p0, v3

    :goto_1
    if-eqz p0, :cond_2

    .line 54
    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    invoke-direct {v0, v2, p0}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    return-object v0

    :cond_2
    return-object v3

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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
