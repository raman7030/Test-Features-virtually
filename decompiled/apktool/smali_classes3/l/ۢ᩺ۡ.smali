.class public final Ll/ۢ᩺ۡ;
.super Ljava/lang/Object;
.source "D66F"


# direct methods
.method public static ֫(C)I
    .locals 0

    packed-switch p0, :pswitch_data_0

    packed-switch p0, :pswitch_data_1

    packed-switch p0, :pswitch_data_2

    const/4 p0, 0x0

    return p0

    :pswitch_0
    const/16 p0, 0x9

    return p0

    :pswitch_1
    const/16 p0, 0x8

    return p0

    :pswitch_2
    const/4 p0, 0x7

    return p0

    :pswitch_3
    const/4 p0, 0x6

    return p0

    :pswitch_4
    const/4 p0, 0x5

    return p0

    :pswitch_5
    const/4 p0, 0x4

    return p0

    :pswitch_6
    const/4 p0, 0x3

    return p0

    :pswitch_7
    const/4 p0, 0x2

    return p0

    :pswitch_8
    const/4 p0, 0x1

    return p0

    :pswitch_9
    const/16 p0, 0xf

    return p0

    :pswitch_a
    const/16 p0, 0xe

    return p0

    :pswitch_b
    const/16 p0, 0xd

    return p0

    :pswitch_c
    const/16 p0, 0xc

    return p0

    :pswitch_d
    const/16 p0, 0xb

    return p0

    :pswitch_e
    const/16 p0, 0xa

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x31
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

    :pswitch_data_1
    .packed-switch 0x41
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x61
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 5

    .line 318
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lt v0, v2, :cond_7

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v3, 0x8

    if-le v0, v3, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    .line 320
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v0, v3, :cond_6

    .line 321
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x30

    if-lt v3, v4, :cond_1

    const/16 v4, 0x39

    if-le v3, v4, :cond_3

    :cond_1
    const/16 v4, 0x41

    if-lt v3, v4, :cond_2

    const/16 v4, 0x46

    if-le v3, v4, :cond_3

    :cond_2
    const/16 v4, 0x61

    if-lt v3, v4, :cond_5

    :cond_3
    const/16 v4, 0x66

    if-le v3, v4, :cond_4

    goto :goto_1

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    return v1

    :cond_6
    return v2

    :cond_7
    :goto_2
    return v1
.end method

.method public static ֫(Ljava/lang/String;Ll/ۜ᩺ۡ;)Z
    .locals 11

    const-string v0, "#"

    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_1

    .line 18
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    .line 19
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    const/high16 v2, -0x1000000

    const/16 v3, 0x8

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x4

    if-ne p0, v6, :cond_1

    const/16 p0, 0x1f

    .line 21
    iput p0, p1, Ll/ۜ᩺ۡ;->ܿ:I

    .line 23
    aget-char p0, v1, v0

    invoke-static {p0}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result p0

    shl-int/lit8 p0, p0, 0x14

    or-int/2addr p0, v2

    .line 24
    aget-char v2, v1, v0

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr p0, v2

    .line 25
    aget-char v2, v1, v5

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/lit8 v2, v2, 0xc

    or-int/2addr p0, v2

    .line 26
    aget-char v2, v1, v5

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/2addr v2, v3

    or-int/2addr p0, v2

    .line 27
    aget-char v2, v1, v4

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/2addr v2, v6

    or-int/2addr p0, v2

    .line 28
    aget-char v1, v1, v4

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    goto/16 :goto_0

    :cond_1
    const/16 v7, 0x1c

    const/4 v8, 0x5

    if-ne p0, v8, :cond_2

    const/16 p0, 0x1e

    .line 30
    iput p0, p1, Ll/ۜ᩺ۡ;->ܿ:I

    .line 31
    aget-char p0, v1, v0

    invoke-static {p0}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result p0

    shl-int/2addr p0, v7

    .line 32
    aget-char v2, v1, v0

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/lit8 v2, v2, 0x18

    or-int/2addr p0, v2

    .line 33
    aget-char v2, v1, v5

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/lit8 v2, v2, 0x14

    or-int/2addr p0, v2

    .line 34
    aget-char v2, v1, v5

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr p0, v2

    .line 35
    aget-char v2, v1, v4

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/lit8 v2, v2, 0xc

    or-int/2addr p0, v2

    .line 36
    aget-char v2, v1, v4

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/2addr v2, v3

    or-int/2addr p0, v2

    .line 37
    aget-char v2, v1, v6

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/2addr v2, v6

    or-int/2addr p0, v2

    .line 38
    aget-char v1, v1, v6

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    goto/16 :goto_0

    :cond_2
    const/4 v9, 0x6

    const/4 v10, 0x7

    if-ne p0, v10, :cond_3

    const/16 p0, 0x1d

    .line 40
    iput p0, p1, Ll/ۜ᩺ۡ;->ܿ:I

    .line 42
    aget-char p0, v1, v0

    invoke-static {p0}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result p0

    shl-int/lit8 p0, p0, 0x14

    or-int/2addr p0, v2

    .line 43
    aget-char v2, v1, v5

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr p0, v2

    .line 44
    aget-char v2, v1, v4

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/lit8 v2, v2, 0xc

    or-int/2addr p0, v2

    .line 45
    aget-char v2, v1, v6

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/2addr v2, v3

    or-int/2addr p0, v2

    .line 46
    aget-char v2, v1, v8

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/2addr v2, v6

    or-int/2addr p0, v2

    .line 47
    aget-char v1, v1, v9

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    goto :goto_0

    :cond_3
    const/16 v2, 0x9

    if-ne p0, v2, :cond_4

    .line 49
    iput v7, p1, Ll/ۜ᩺ۡ;->ܿ:I

    .line 50
    aget-char p0, v1, v0

    invoke-static {p0}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result p0

    shl-int/2addr p0, v7

    .line 51
    aget-char v2, v1, v5

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/lit8 v2, v2, 0x18

    or-int/2addr p0, v2

    .line 52
    aget-char v2, v1, v4

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/lit8 v2, v2, 0x14

    or-int/2addr p0, v2

    .line 53
    aget-char v2, v1, v6

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr p0, v2

    .line 54
    aget-char v2, v1, v8

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/lit8 v2, v2, 0xc

    or-int/2addr p0, v2

    .line 55
    aget-char v2, v1, v9

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/2addr v2, v3

    or-int/2addr p0, v2

    .line 56
    aget-char v2, v1, v10

    invoke-static {v2}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v2

    shl-int/2addr v2, v6

    or-int/2addr p0, v2

    .line 57
    aget-char v1, v1, v3

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    :goto_0
    or-int/2addr p0, v1

    .line 60
    iput p0, p1, Ll/ۜ᩺ۡ;->ܽ:I

    return v0

    :cond_4
    :goto_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ll/ۜ᩺ۡ;)Z
    .locals 1

    .line 547
    iget-object p0, p0, Ll/ۜ᩺ۡ;->ۧ:Ljava/lang/String;

    if-eqz p0, :cond_1

    .line 548
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 551
    :cond_0
    :try_start_0
    new-instance v0, Ljava/math/BigDecimal;

    invoke-direct {v0, p0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 552
    invoke-virtual {v0}, Ljava/math/BigDecimal;->precision()I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x7

    if-gt p0, v0, :cond_1

    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۜ(Ljava/lang/String;)I
    .locals 4

    .line 249
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-char v3, p0, v1

    shl-int/lit8 v2, v2, 0x4

    .line 250
    invoke-static {v3}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v3

    or-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v2
.end method

.method public static ۧ(Ljava/lang/String;)Z
    .locals 4

    .line 305
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-lt v0, v1, :cond_8

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0xa

    if-le v0, v1, :cond_0

    goto :goto_2

    :cond_0
    const-string v0, "0x"

    .line 307
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "0X"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    return v2

    :cond_1
    const/4 v0, 0x2

    .line 309
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_7

    .line 310
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x30

    if-lt v1, v3, :cond_2

    const/16 v3, 0x39

    if-le v1, v3, :cond_4

    :cond_2
    const/16 v3, 0x41

    if-lt v1, v3, :cond_3

    const/16 v3, 0x46

    if-le v1, v3, :cond_4

    :cond_3
    const/16 v3, 0x61

    if-lt v1, v3, :cond_6

    :cond_4
    const/16 v3, 0x66

    if-le v1, v3, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_6
    :goto_1
    return v2

    :cond_7
    const/4 p0, 0x1

    return p0

    :cond_8
    :goto_2
    return v2
.end method

.method public static ۧ(Ljava/lang/String;Ll/ۜ᩺ۡ;)Z
    .locals 10

    .line 103
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto/16 :goto_5

    .line 158
    :cond_0
    invoke-static {}, Ll/᩷᩺ۡ;->values()[Ll/᩷᩺ۡ;

    move-result-object v0

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x4

    const/4 v5, 0x1

    if-ge v3, v2, :cond_a

    aget-object v6, v0, v3

    .line 159
    iget-object v7, v6, Ll/᩷᩺ۡ;->᩹:Ljava/lang/String;

    invoke-virtual {p0, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_9

    .line 160
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    iget v2, v6, Ll/᩷᩺ۡ;->᩸:I

    sub-int/2addr v0, v2

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Ll/ۜ᩺ۡ;->ۧ:Ljava/lang/String;

    .line 161
    iget v2, v6, Ll/᩷᩺ۡ;->ۙ:I

    iput v2, p1, Ll/ۜ᩺ۡ;->ܿ:I

    .line 162
    iget v2, v6, Ll/᩷᩺ۡ;->ۗ:I

    iput v2, p1, Ll/ۜ᩺ۡ;->ܽ:I

    .line 163
    iget v2, v6, Ll/᩷᩺ۡ;->᩶:F

    iput v2, p1, Ll/ۜ᩺ۡ;->֫:F

    .line 536
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_4

    .line 539
    :cond_1
    :try_start_0
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    :try_start_1
    iget-object p0, p1, Ll/ۜ᩺ۡ;->ۧ:Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 113
    iget v0, p1, Ll/ۜ᩺ۡ;->֫:F

    mul-float p0, p0, v0

    const/4 v0, 0x0

    cmpg-float v0, p0, v0

    if-gez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_3

    neg-float p0, p0

    :cond_3
    const/high16 v2, 0x4b000000    # 8388608.0f

    mul-float p0, p0, v2

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr p0, v2

    float-to-long v2, p0

    const-wide/32 v6, 0x7fffff

    and-long/2addr v6, v2

    const-wide/16 v8, 0x0

    cmp-long p0, v6, v8

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    const-wide/32 v6, -0x800000

    and-long/2addr v6, v2

    cmp-long p0, v6, v8

    if-nez p0, :cond_5

    const/4 p0, 0x3

    goto :goto_3

    :cond_5
    const-wide/32 v6, -0x80000000

    and-long/2addr v6, v2

    cmp-long p0, v6, v8

    if-nez p0, :cond_6

    const/16 v1, 0x8

    const/4 p0, 0x2

    goto :goto_3

    :cond_6
    const-wide v6, -0x8000000000L

    and-long/2addr v6, v2

    cmp-long p0, v6, v8

    if-nez p0, :cond_7

    const/16 v1, 0x10

    const/4 p0, 0x1

    goto :goto_3

    :cond_7
    :goto_2
    const/16 v1, 0x17

    const/4 p0, 0x0

    :goto_3
    shr-long v1, v2, v1

    const-wide/32 v3, 0xffffff

    and-long/2addr v1, v3

    long-to-int v2, v1

    if-eqz v0, :cond_8

    neg-int v0, v2

    const v1, 0xffffff

    and-int v2, v0, v1

    .line 139
    :cond_8
    iget v0, p1, Ll/ۜ᩺ۡ;->ܽ:I

    shl-int/lit8 p0, p0, 0x4

    shl-int/lit8 v1, v2, 0x8

    or-int/2addr p0, v1

    or-int/2addr p0, v0

    iput p0, p1, Ll/ۜ᩺ۡ;->ܽ:I

    return v5

    :catch_0
    nop

    goto :goto_4

    :cond_9
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 536
    :cond_a
    :goto_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_b

    goto :goto_5

    .line 539
    :cond_b
    :try_start_2
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 144
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    .line 145
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    iput v0, p1, Ll/ۜ᩺ۡ;->ܽ:I

    .line 146
    iput v4, p1, Ll/ۜ᩺ۡ;->ܿ:I

    const/high16 v0, 0x3f800000    # 1.0f

    .line 147
    iput v0, p1, Ll/ۜ᩺ۡ;->֫:F

    .line 148
    iput-object p0, p1, Ll/ۜ᩺ۡ;->ۧ:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    return v5

    :catch_1
    :goto_5
    return v1
.end method

.method public static ܳ(Ljava/lang/String;)Z
    .locals 5

    const-string v0, " "

    const-string v1, ""

    .line 364
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "_"

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "-"

    .line 365
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 366
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 367
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    .line 369
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v0, v3, :cond_4

    .line 370
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x30

    if-lt v3, v4, :cond_3

    const/16 v4, 0x39

    if-le v3, v4, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v2

    :cond_4
    return v1
.end method

.method public static ܽ(Ljava/lang/String;)Z
    .locals 2

    .line 391
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-static {p0}, Ll/ۢ᩺ۡ;->֫(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ܽ(Ljava/lang/String;Ll/ۜ᩺ۡ;)Z
    .locals 6

    const-string v0, "-"

    .line 65
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    goto :goto_2

    .line 68
    :cond_0
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x2d

    const/4 v4, 0x1

    if-ne v1, v3, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    .line 70
    invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    .line 71
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    .line 75
    :cond_2
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v5, 0x30

    if-lt v3, v5, :cond_7

    const/16 v5, 0x39

    if-le v3, v5, :cond_3

    goto :goto_2

    .line 81
    :cond_3
    :try_start_0
    invoke-static {p0}, Ll/ۢ᩺ۡ;->ۧ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v0, 0x2

    .line 82
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۢ᩺ۡ;->ۜ(Ljava/lang/String;)I

    move-result p0

    const/16 v0, 0x11

    .line 83
    iput v0, p1, Ll/ۜ᩺ۡ;->ܿ:I

    goto :goto_1

    :cond_4
    if-eqz v1, :cond_5

    .line 87
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    .line 90
    :cond_5
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    const/16 v0, 0x10

    .line 91
    iput v0, p1, Ll/ۜ᩺ۡ;->ܿ:I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    if-eqz v1, :cond_6

    neg-int p0, p0

    .line 98
    :cond_6
    iput p0, p1, Ll/ۜ᩺ۡ;->ܽ:I

    return v4

    :catch_0
    :cond_7
    :goto_2
    return v2
.end method

.method public static ܿ(Ljava/lang/String;)Z
    .locals 5

    .line 329
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lt v0, v2, :cond_7

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v3, 0x10

    if-le v0, v3, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    .line 331
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v0, v3, :cond_6

    .line 332
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x30

    if-lt v3, v4, :cond_1

    const/16 v4, 0x39

    if-le v3, v4, :cond_3

    :cond_1
    const/16 v4, 0x41

    if-lt v3, v4, :cond_2

    const/16 v4, 0x46

    if-le v3, v4, :cond_3

    :cond_2
    const/16 v4, 0x61

    if-lt v3, v4, :cond_5

    :cond_3
    const/16 v4, 0x66

    if-le v3, v4, :cond_4

    goto :goto_1

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    return v1

    :cond_6
    return v2

    :cond_7
    :goto_2
    return v1
.end method

.method public static ᩳ(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_6

    .line 263
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_3

    :cond_0
    const/4 v1, 0x0

    .line 266
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 267
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    if-lt v2, v3, :cond_1

    const/16 v3, 0x39

    if-le v2, v3, :cond_2

    :cond_1
    if-nez v1, :cond_3

    const/16 v3, 0x2d

    if-eq v2, v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v0

    .line 273
    :cond_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0xa

    if-lt v1, v2, :cond_5

    .line 275
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    return v0

    :cond_5
    :goto_2
    const/4 p0, 0x1

    return p0

    :cond_6
    :goto_3
    return v0
.end method

.method public static ᩷(Ljava/lang/String;)I
    .locals 10

    .line 396
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    .line 397
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    const/high16 v1, -0x1000000

    const/16 v2, 0x8

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x3

    if-eq p0, v7, :cond_3

    if-eq p0, v6, :cond_2

    const/4 v8, 0x5

    const/4 v9, 0x6

    if-eq p0, v9, :cond_1

    if-ne p0, v2, :cond_0

    .line 427
    aget-char p0, v0, v5

    invoke-static {p0}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result p0

    shl-int/lit8 p0, p0, 0x1c

    .line 428
    aget-char v1, v0, v4

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr p0, v1

    .line 429
    aget-char v1, v0, v3

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/lit8 v1, v1, 0x14

    or-int/2addr p0, v1

    .line 430
    aget-char v1, v0, v7

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr p0, v1

    .line 431
    aget-char v1, v0, v6

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/lit8 v1, v1, 0xc

    or-int/2addr p0, v1

    .line 432
    aget-char v1, v0, v8

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/2addr v1, v2

    or-int/2addr p0, v1

    .line 433
    aget-char v1, v0, v9

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/2addr v1, v6

    or-int/2addr p0, v1

    const/4 v1, 0x7

    .line 434
    aget-char v0, v0, v1

    invoke-static {v0}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v0

    goto/16 :goto_0

    .line 437
    :cond_0
    new-instance p0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Hex color format error: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 419
    :cond_1
    aget-char p0, v0, v5

    invoke-static {p0}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result p0

    shl-int/lit8 p0, p0, 0x14

    or-int/2addr p0, v1

    .line 420
    aget-char v1, v0, v4

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr p0, v1

    .line 421
    aget-char v1, v0, v3

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/lit8 v1, v1, 0xc

    or-int/2addr p0, v1

    .line 422
    aget-char v1, v0, v7

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/2addr v1, v2

    or-int/2addr p0, v1

    .line 423
    aget-char v1, v0, v6

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/2addr v1, v6

    or-int/2addr p0, v1

    .line 424
    aget-char v0, v0, v8

    invoke-static {v0}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v0

    goto :goto_0

    .line 408
    :cond_2
    aget-char p0, v0, v5

    invoke-static {p0}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result p0

    shl-int/lit8 p0, p0, 0x1c

    .line 409
    aget-char v1, v0, v5

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr p0, v1

    .line 410
    aget-char v1, v0, v4

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/lit8 v1, v1, 0x14

    or-int/2addr p0, v1

    .line 411
    aget-char v1, v0, v4

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr p0, v1

    .line 412
    aget-char v1, v0, v3

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/lit8 v1, v1, 0xc

    or-int/2addr p0, v1

    .line 413
    aget-char v1, v0, v3

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/2addr v1, v2

    or-int/2addr p0, v1

    .line 414
    aget-char v1, v0, v7

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/2addr v1, v6

    or-int/2addr p0, v1

    .line 415
    aget-char v0, v0, v7

    invoke-static {v0}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v0

    goto :goto_0

    .line 400
    :cond_3
    aget-char p0, v0, v5

    invoke-static {p0}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result p0

    shl-int/lit8 p0, p0, 0x14

    or-int/2addr p0, v1

    .line 401
    aget-char v1, v0, v5

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr p0, v1

    .line 402
    aget-char v1, v0, v4

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/lit8 v1, v1, 0xc

    or-int/2addr p0, v1

    .line 403
    aget-char v1, v0, v4

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/2addr v1, v2

    or-int/2addr p0, v1

    .line 404
    aget-char v1, v0, v3

    invoke-static {v1}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v1

    shl-int/2addr v1, v6

    or-int/2addr p0, v1

    .line 405
    aget-char v0, v0, v3

    invoke-static {v0}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v0

    :goto_0
    or-int/2addr p0, v0

    return p0
.end method

.method public static ᩻(Ljava/lang/String;)Z
    .locals 4

    const-string v0, " "

    const-string v1, ""

    .line 379
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "_"

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 380
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    .line 382
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_5

    .line 383
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    if-lt v2, v3, :cond_1

    const/16 v3, 0x39

    if-le v2, v3, :cond_3

    :cond_1
    const/16 v3, 0x41

    if-lt v2, v3, :cond_2

    const/16 v3, 0x46

    if-le v2, v3, :cond_3

    :cond_2
    const/16 v3, 0x61

    if-lt v2, v3, :cond_4

    const/16 v3, 0x66

    if-le v2, v3, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    return v1

    :cond_5
    const/4 p0, 0x1

    return p0
.end method
