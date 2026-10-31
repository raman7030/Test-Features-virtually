.class public final Ll/ۙ᩻᩷;
.super Ljava/lang/Object;
.source "A3Z1"

# interfaces
.implements Lbin/mt/plugin/api/PluginContext;


# static fields
.field private static final ۚܶۙ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x82

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۙ᩻᩷;->ۚܶۙ:[S

    return-void

    :array_0
    .array-data 2
        0x426s
        0x7181s
        0x719ds
        0x7181s
        0x7185s
        0x719ds
        0x7182s
        0x7183s
        0x1b3as
        -0x4659s
        -0x4654s
        -0x4655s
        -0x4615s
        -0x4658s
        -0x464fs
        -0x4615s
        -0x464bs
        -0x4657s
        -0x4650s
        -0x465es
        -0x4654s
        -0x4655s
        -0x4615s
        -0x464as
        -0x4644s
        -0x464as
        -0x464fs
        -0x4660s
        -0x4658s
        0x30ds
        0x784cs
        0x7866s
        0x786cs
        0x786bs
        0x787as
        0x7872s
        0x10f2s
        -0x29cfs
        -0x29eas
        -0x29f0s
        -0x29f5s
        -0x29f4s
        -0x29fbs
        -0x29bes
        -0x29f4s
        -0x29f3s
        -0x29eas
        -0x29bes
        -0x29fcs
        -0x29f3s
        -0x29e9s
        -0x29f4s
        -0x29fas
        -0x29a8s
        -0x29bes
        0x1c98s
        0x5296s
        0x529bs
        0x5294s
        0x529ds
        0x5289s
        0x528es
        0x5288s
        0x5293s
        0x5294s
        0x529ds
        0x5289s
        0x429s
        -0x4cb5s
        -0x4cc0s
        -0x4cb9s
        -0x4cf9s
        -0x4cbcs
        -0x4ca3s
        -0x4cf9s
        -0x4ca7s
        -0x4cbbs
        -0x4ca4s
        -0x4cb2s
        -0x4cc0s
        -0x4cb9s
        -0x4cf9s
        -0x4ca6s
        -0x4cb0s
        -0x4ca6s
        -0x4ca3s
        -0x4cb4s
        -0x4cbcs
        0x15c2s
        0x5be0s
        0x5bebs
        0x5becs
        0x5bacs
        0x5befs
        0x5bf6s
        0x5bacs
        0x5bf2s
        0x5bees
        0x5bf7s
        0x5be5s
        0x5bebs
        0x5becs
        0x5bacs
        0x5bf1s
        0x5bfbs
        0x5bf1s
        0x5bf6s
        0x5be7s
        0x5befs
        0x16cs
        -0x584es
        -0x5847s
        -0x5842s
        -0x5802s
        -0x5843s
        -0x585cs
        -0x5802s
        -0x5860s
        -0x5844s
        -0x585bs
        -0x5849s
        -0x5847s
        -0x5842s
        -0x5802s
        -0x585ds
        -0x5857s
        -0x585ds
        -0x585cs
        -0x584bs
        -0x5843s
    .end array-data
.end method


# virtual methods
.method public final cancelToast()V
    .locals 6

    const v0, 0x44a8130f

    sget v1, Ll/֡۬;->۠֡᩶:I

    sget v2, Ll/ۗۗ;->ۨ۬ۖ:I

    const-string v3, "\u06ec\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xc3f

    const v5, -0x489909ea

    xor-int/2addr v4, v5

    const v5, 0x352e3d97

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x5dd3

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v3, :cond_5

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v3

    if-gez v3, :cond_9

    goto/16 :goto_2

    .line 98
    :sswitch_1
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    sget v3, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v3, :cond_1

    goto/16 :goto_1

    .line 165
    :sswitch_2
    sget-boolean v3, Ll/֫ܺ;->֡ܳ᩸:Z

    if-eqz v3, :cond_6

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    goto/16 :goto_2

    .line 71
    :sswitch_4
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    return-void

    .line 94
    :sswitch_5
    new-instance v3, Ll/ᩴۡ᩷;

    .line 162
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v4

    if-gtz v4, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v0, 0x1

    .line 94
    invoke-direct {v3, v0}, Ll/ᩴۡ᩷;-><init>(I)V

    invoke-static {v3}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 204
    :sswitch_6
    sget v3, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v3, :cond_2

    :cond_1
    const-string v3, "\u1a79\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1ea9

    const v5, -0x42550390

    xor-int/2addr v4, v5

    const v5, -0x51f17493

    goto :goto_0

    :cond_2
    const-string v3, "\u05a8\u1a75"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7a49

    const v5, 0x63f9f5d3

    xor-int/2addr v4, v5

    const v5, 0x4b9172e6    # 1.9064268E7f

    goto :goto_0

    :sswitch_7
    sget v3, Ll/֨۟;->᩹֫᩷:I

    if-eqz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u1a76\u073a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x61

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x48fb

    const v5, -0x7d424ecf

    xor-int/2addr v4, v5

    const v5, 0x5049bd82    # 1.353856E10f

    goto/16 :goto_0

    .line 103
    :sswitch_8
    sget v3, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u06e8\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x30a5

    const v5, -0x6dd15722

    xor-int/2addr v4, v5

    const v5, 0x3f7b2efb

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u05a1\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x502d

    const v5, -0x316ae5ec

    xor-int/2addr v4, v5

    const v5, -0x698d122d

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v3

    if-gtz v3, :cond_7

    :cond_6
    :goto_1
    const-string v3, "\u073f\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x200d

    const v5, -0x77ad7ba9

    xor-int/2addr v4, v5

    const v5, 0x5bdbf76

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u073a\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x770b

    const v5, -0xb03cdaf

    xor-int/2addr v4, v5

    const v5, -0x17df8501

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v3, :cond_8

    :goto_2
    const-string v3, "\u06da\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x15

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5495

    const v5, -0x7a00930c

    xor-int/2addr v4, v5

    const v5, 0x2c49c0c3

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06db\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3c29

    const v5, 0x15c6b142

    xor-int/2addr v4, v5

    const v5, 0x7e098d52

    goto/16 :goto_0

    .line 227
    :sswitch_b
    sget v3, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u073d\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2817

    const v5, -0x431fde0c

    xor-int/2addr v4, v5

    const v5, 0x4bd823eb    # 2.8329942E7f

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u073d\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x1d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5f07

    const v5, -0x2963e884

    xor-int/2addr v4, v5

    const v5, 0x34088d5b

    goto/16 :goto_0

    .line 56
    :sswitch_c
    sget v3, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v3, :cond_b

    goto :goto_4

    :cond_b
    const-string v3, "\u0730\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4237

    const v5, -0x2ac88c5

    xor-int/2addr v4, v5

    const v5, 0x6dc3a961

    goto/16 :goto_0

    .line 229
    :sswitch_d
    sget-object v3, Ll/ܶܳ᩷;->ܳ:Ll/᩶᩻᩷;

    sget v3, Ll/֨۟;->᩹֫᩷:I

    if-eqz v3, :cond_c

    :goto_4
    const-string v3, "\u06d7\u06e7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x31

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x487f

    const v5, 0x31d7306d

    xor-int/2addr v4, v5

    const v5, -0x20867b95

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u05ab\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x27a1

    const v5, 0x3dada4c4

    xor-int/2addr v4, v5

    const v5, -0x2d5725c1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ded1dc2 -> :sswitch_d
        -0x7c20bc1e -> :sswitch_2
        -0x7166e44b -> :sswitch_8
        -0x671e69a6 -> :sswitch_b
        -0x63f9d39e -> :sswitch_5
        -0x4f4d044f -> :sswitch_6
        -0x43c689e0 -> :sswitch_4
        -0x414c9e44 -> :sswitch_5
        -0x3ff3e9f3 -> :sswitch_d
        -0x3f4e9454 -> :sswitch_c
        -0x3d60d442 -> :sswitch_3
        -0x3809d805 -> :sswitch_0
        -0x35bcacea -> :sswitch_c
        -0x26fd8ac6 -> :sswitch_3
        -0x159bc804 -> :sswitch_8
        -0x4907222 -> :sswitch_1
        0xd4138b1 -> :sswitch_9
        0xf2adada -> :sswitch_a
        0x22d69958 -> :sswitch_1
        0x27734294 -> :sswitch_4
        0x27909d71 -> :sswitch_7
        0x34f86a9c -> :sswitch_0
        0x3e757b2c -> :sswitch_2
        0x40adc226 -> :sswitch_a
        0x4cc7e5e0 -> :sswitch_7
        0x61bbb340 -> :sswitch_9
        0x6de24517 -> :sswitch_b
        0x74db9d7a -> :sswitch_6
    .end sparse-switch
.end method

.method public final getAssetLocalString(Ljava/lang/String;)Lbin/mt/plugin/api/LocalString;
    .locals 0

    .line 149
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final getAssetsAsStream(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 0

    .line 85
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final getClipboardText()Ljava/lang/CharSequence;
    .locals 1

    .line 192
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final getCountry()Ljava/lang/String;
    .locals 1

    .line 75
    invoke-static {}, Ll/ܶܳ᩷;->ۧ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getFileLocalString(Ljava/io/File;Ljava/lang/String;)Lbin/mt/plugin/api/LocalString;
    .locals 4

    const p1, -0x5219bfe2

    sget p2, Ll/֡۬;->۠֡᩶:I

    sget v0, Ll/֡ܶ;->ᩴܿ᩸:I

    const-string v1, "\u06e1\u06e7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x7fe3

    const v3, 0xfdc2fe0

    xor-int/2addr v2, v3

    const v3, -0x60247fe1

    :goto_0
    xor-int/2addr v1, v3

    xor-int/2addr p1, p2

    mul-int/lit16 p1, p1, 0x608f

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v2

    xor-int/2addr p1, v1

    sparse-switch p1, :sswitch_data_0

    .line 5
    sget v1, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v1, :cond_7

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v1

    if-gtz v1, :cond_4

    goto :goto_1

    .line 79
    :sswitch_1
    sget v1, Ll/۟;->ۗۤۛ:I

    if-eqz v1, :cond_b

    goto/16 :goto_3

    .line 25
    :sswitch_2
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v1

    if-ltz v1, :cond_1

    goto/16 :goto_3

    .line 38
    :sswitch_3
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    const/4 p1, 0x0

    return-object p1

    .line 155
    :sswitch_5
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    .line 145
    :sswitch_6
    sget v1, Ll/۟;->ۗۤۛ:I

    if-eqz v1, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v1, "\u06dc\u1a76"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p2, v1

    mul-int/lit8 v1, v1, 0x7

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x2357

    const v3, -0x6fc8840c

    xor-int/2addr v2, v3

    const v3, -0xaa9c0d3

    goto :goto_0

    .line 58
    :sswitch_7
    sget v1, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v1, :cond_2

    :cond_1
    :goto_1
    const-string v1, "\u06eb\u073d"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x53ad

    const v3, 0x85c088b

    xor-int/2addr v2, v3

    const v3, -0x58886abd

    goto :goto_0

    :cond_2
    const-string v1, "\u0736\u06e1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x6b

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x4dd5

    const v3, -0x7589b57f

    xor-int/2addr v2, v3

    const v3, 0x71b27f2a

    goto/16 :goto_0

    :sswitch_8
    sget v1, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v1, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v1, "\u073d\u06e1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x5655

    const v3, -0x3a1f8a9c

    xor-int/2addr v2, v3

    const v3, -0x18f05893

    goto/16 :goto_0

    .line 86
    :sswitch_9
    sget v1, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v1, :cond_5

    :cond_4
    const-string v1, "\u06e7\u06ec"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x18b

    const v3, 0x3b64dbd1

    xor-int/2addr v2, v3

    const v3, 0x25144ed0

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u0736\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, 0x65

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x54b3

    const v3, -0x76479be9

    xor-int/2addr v2, v3

    const v3, 0x675d704a

    goto/16 :goto_0

    .line 55
    :sswitch_a
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v1

    if-gtz v1, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v1, "\u06d7\u06ec"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x1f

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x1283

    const v3, 0x71716055

    xor-int/2addr v2, v3

    const v3, -0x5a04cf77

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u0733\u06eb"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x10f7

    const v3, -0x1cd0d3ea

    xor-int/2addr v2, v3

    const v3, 0x2ead00ad

    goto/16 :goto_0

    :sswitch_b
    sget v1, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v1, :cond_8

    :goto_2
    const-string v1, "\u0730\u05a8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x4c0f

    const v3, -0x49ab901a

    xor-int/2addr v2, v3

    const v3, -0x7c16f0f0

    goto/16 :goto_0

    :cond_8
    const-string v1, "\u1a76\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x5de1

    const v3, -0xccdf442

    xor-int/2addr v2, v3

    const v3, -0xce52289

    goto/16 :goto_0

    .line 142
    :sswitch_c
    sget v1, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v1, :cond_9

    :goto_3
    const-string v1, "\u0733\u0733"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    mul-int/lit8 v1, v1, 0x6f

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x3b5f

    const v3, 0xaf09592

    xor-int/2addr v2, v3

    const v3, 0x7e9d3fef

    goto/16 :goto_0

    :cond_9
    const-string v1, "\u06da\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, -0x37

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x7b73

    const v3, -0x4345f7d2

    xor-int/2addr v2, v3

    const v3, 0x20f0b9ed

    goto/16 :goto_0

    :sswitch_d
    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v1, :cond_a

    goto :goto_4

    :cond_a
    const-string v1, "\u06d6\u06e4"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x4d

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x471

    const v3, -0xa00e6f7

    xor-int/2addr v2, v3

    const v3, 0x3c4ca900

    goto/16 :goto_0

    :sswitch_e
    sget v1, Ll/᩺;->ۙۛܶ:I

    if-gtz v1, :cond_c

    :cond_b
    :goto_4
    const-string v1, "\u06e0\u1a76"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x302b

    const v3, 0x1b08b6c8

    xor-int/2addr v2, v3

    const v3, 0x68d2ac80

    goto/16 :goto_0

    :cond_c
    const-string v1, "\u06d6\u06df"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p2

    mul-int/lit8 v1, v1, -0x15

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x2929

    const v3, 0x6682c9c8

    xor-int/2addr v2, v3

    const v3, 0x5fddf556

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c636776 -> :sswitch_1
        -0x7882584c -> :sswitch_a
        -0x7208ecca -> :sswitch_e
        -0x6e53727a -> :sswitch_6
        -0x6bc8b897 -> :sswitch_3
        -0x64fd5797 -> :sswitch_0
        -0x568c6005 -> :sswitch_2
        -0x548384c8 -> :sswitch_d
        -0x4f4e7520 -> :sswitch_4
        -0x42141768 -> :sswitch_b
        -0x21fdf0a9 -> :sswitch_c
        -0x1aaf3fcf -> :sswitch_9
        -0x12e07c8e -> :sswitch_7
        -0xe802356 -> :sswitch_5
        -0x5c83bca -> :sswitch_1
        -0x1bfcd8 -> :sswitch_7
        0x113284a8 -> :sswitch_c
        0x2160ac85 -> :sswitch_d
        0x2f67e6ef -> :sswitch_b
        0x35973ed0 -> :sswitch_6
        0x3646a5b4 -> :sswitch_a
        0x40f80a3a -> :sswitch_e
        0x44781a06 -> :sswitch_4
        0x5b3e747c -> :sswitch_5
        0x5f4adebf -> :sswitch_9
        0x6fd33db3 -> :sswitch_8
        0x70390017 -> :sswitch_2
        0x712099a9 -> :sswitch_0
        0x78541ef2 -> :sswitch_3
        0x79f98ecc -> :sswitch_8
    .end sparse-switch
.end method

.method public final getFilesDir()Ljava/io/File;
    .locals 1

    .line 166
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final getHostPackageName()Ljava/lang/String;
    .locals 1

    .line 50
    invoke-static {}, Ll/ۙ᩸᩷;->ᩴ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getHostVersionCode()I
    .locals 1

    const v0, 0x18e4545

    return v0
.end method

.method public final getHostVersionName()Ljava/lang/String;
    .locals 15

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const v9, 0x4ecbae7c

    sget v10, Ll/ۖ;->᩹۟ۘ:I

    sget v11, Ll/ۘۨ;->۫᩸۠:I

    const-string v12, "\u1a7b\u06e0"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, 0x6287

    const v14, 0x263c16c5

    xor-int/2addr v13, v14

    const v14, 0x13f5ec80

    :goto_0
    xor-int/2addr v12, v14

    xor-int/2addr v9, v11

    mul-int/lit16 v9, v9, 0x773d

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v9, v13

    xor-int/2addr v9, v12

    sparse-switch v9, :sswitch_data_0

    .line 1
    sget-boolean v12, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v12, :cond_b

    goto/16 :goto_4

    .line 4
    :sswitch_0
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget v12, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v12, :cond_3

    goto/16 :goto_4

    .line 1
    :sswitch_1
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v12

    if-eqz v12, :cond_c

    goto/16 :goto_4

    .line 0
    :sswitch_2
    sget v12, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-lez v12, :cond_a

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    goto/16 :goto_3

    .line 4
    :sswitch_4
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/4 v0, 0x7

    .line 0
    invoke-static {v7, v8, v0, v6}, Ll/֨۫;->ۢܽ֨([SIII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_6
    sget-object v7, Ll/ۙ᩻᩷;->ۚܶۙ:[S

    const/4 v8, 0x1

    sget v12, Ll/᩹;->ۤܿܳ:I

    if-eqz v12, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v12, "\u1a77\u06eb"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, -0x58f9

    const v14, 0x21152056

    xor-int/2addr v13, v14

    const v14, 0x4bffed47    # 3.3544846E7f

    goto :goto_0

    :sswitch_7
    const/16 v6, 0x4d48

    goto :goto_1

    :sswitch_8
    const/16 v6, 0x71b3

    :goto_1
    const-string v12, "\u1a74\u06d7"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, 0x3473

    const v14, -0x976d232

    xor-int/2addr v13, v14

    const v14, -0x262cce5a

    goto :goto_0

    :sswitch_9
    mul-int v12, v2, v5

    sub-int/2addr v12, v4

    if-lez v12, :cond_1

    const-string v12, "\u1a76\u06df"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v10, v12

    mul-int/lit8 v12, v12, 0x43

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, 0x2cf5

    const v14, -0x6af374fe

    xor-int/2addr v13, v14

    const v14, 0x2a82978c

    goto/16 :goto_0

    :cond_1
    const-string v12, "\u1a7b\u06d6"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v11

    mul-int/lit8 v12, v12, 0x5d

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, -0x77c1

    const v14, -0x4cb79dfb

    xor-int/2addr v13, v14

    const v14, -0x1cdfcdce

    goto/16 :goto_0

    :sswitch_a
    const v5, 0x11e68

    sget v12, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v12, :cond_2

    goto :goto_2

    :cond_2
    const-string v12, "\u0736\u1a77"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, 0x3d65

    const v14, 0x7753c033

    xor-int/2addr v13, v14

    const v14, 0x1acba2c6

    goto/16 :goto_0

    :sswitch_b
    add-int v4, v2, v3

    mul-int v4, v4, v4

    .line 3
    sget v12, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v12, :cond_4

    :cond_3
    const-string v12, "\u06eb\u06df"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    mul-int/lit8 v12, v12, -0x25

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, 0x6103

    const v14, 0x28df4a0e

    xor-int/2addr v13, v14

    const v14, 0x25f37a3b

    goto/16 :goto_0

    :cond_4
    const-string v12, "\u06eb\u06da"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, -0x6bf1

    const v14, -0x776fbb7c

    xor-int/2addr v13, v14

    const v14, 0x2b37cd6c

    goto/16 :goto_0

    :sswitch_c
    aget-short v2, v0, v1

    const/16 v3, 0x479a

    sget-boolean v12, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v12, :cond_5

    :goto_2
    const-string v12, "\u06d9\u06dc"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, -0x2475

    const v14, -0x76349ca1

    xor-int/2addr v13, v14

    const v14, -0x2cb2a346

    goto/16 :goto_0

    :cond_5
    const-string v12, "\u06e0\u05a1"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v11, v12

    mul-int/lit8 v12, v12, 0x5d

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, 0x45bd

    const v14, 0x4e90667e

    xor-int/2addr v13, v14

    const v14, 0x2634cc27

    goto/16 :goto_0

    :sswitch_d
    const/4 v1, 0x0

    .line 0
    sget v12, Ll/֡֡;->֫ۤܳ:I

    if-ltz v12, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v12, "\u073d\u073f"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v10, v12

    mul-int/lit8 v12, v12, -0x5f

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, -0x3751

    const v14, -0x7616763c

    xor-int/2addr v13, v14

    const v14, 0x594da54

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v12, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v12, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v12, "\u06e7\u1a75"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, -0x7e27

    const v14, 0x27e10941

    xor-int/2addr v13, v14

    const v14, 0x7d8e843e

    goto/16 :goto_0

    .line 4
    :sswitch_f
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v12

    if-eqz v12, :cond_8

    goto :goto_3

    :cond_8
    const-string v12, "\u1a78\u06d8"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    mul-int/lit8 v12, v12, 0x75

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, 0x449b

    const v14, -0x2f353d0c

    xor-int/2addr v13, v14

    const v14, -0x2988f460

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v12

    if-eqz v12, :cond_9

    :goto_3
    const-string v12, "\u0736\u06dc"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, 0x1e35

    const v14, 0xbcfefc8

    xor-int/2addr v13, v14

    const v14, 0x73f415cb

    goto/16 :goto_0

    :cond_9
    const-string v12, "\u0730\u06eb"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v11, v12

    mul-int/lit8 v12, v12, -0x31

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, -0x2de3

    const v14, 0x3ec0c738

    xor-int/2addr v13, v14

    const v14, -0x13e4621c

    goto/16 :goto_0

    :cond_a
    :goto_4
    const-string v12, "\u06ec\u06db"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    sub-int v12, v11, v12

    mul-int/lit8 v12, v12, 0x79

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, 0x201

    const v14, -0x568e442d

    xor-int/2addr v13, v14

    const v14, -0x1a895ca4

    goto/16 :goto_0

    :cond_b
    const-string v12, "\u06e0\u06d9"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    add-int/2addr v12, v10

    mul-int/lit8 v12, v12, -0x7b

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, -0x111

    const v14, 0xd1fbea1

    xor-int/2addr v13, v14

    const v14, -0x2381eebd

    goto/16 :goto_0

    :sswitch_11
    sget-object v0, Ll/ۙ᩻᩷;->ۚܶۙ:[S

    sget v12, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v12, :cond_d

    :cond_c
    :goto_5
    const-string v12, "\u073d\u06db"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    mul-int/lit8 v12, v12, -0x6b

    xor-int v13, v12, v11

    mul-int/lit16 v13, v13, 0x61bb

    const v14, 0x5ff3b204

    xor-int/2addr v13, v14

    const v14, -0x79751ba7

    goto/16 :goto_0

    :cond_d
    const-string v12, "\u073d\u1a7b"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v11

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, 0x2179

    const v14, -0x57ab81cf

    xor-int/2addr v13, v14

    const v14, -0x5329c7b6

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7da436a2 -> :sswitch_e
        -0x7b002a60 -> :sswitch_1
        -0x6e4496e4 -> :sswitch_11
        -0x6492adbb -> :sswitch_d
        -0x555d8075 -> :sswitch_4
        -0x52e00ffa -> :sswitch_5
        -0x5194275f -> :sswitch_2
        -0x4b96d12f -> :sswitch_d
        -0x49daed46 -> :sswitch_2
        -0x3c622b1f -> :sswitch_9
        -0x3a7d0ad6 -> :sswitch_3
        -0x39fe6e5d -> :sswitch_b
        -0x3684057f -> :sswitch_5
        -0x35b35a45 -> :sswitch_7
        -0x355fa49d -> :sswitch_11
        -0x31e8ac26 -> :sswitch_4
        -0x315c66b9 -> :sswitch_b
        -0x220284b0 -> :sswitch_0
        -0x1d956698 -> :sswitch_9
        -0xd9e63fb -> :sswitch_a
        -0x825cdcd -> :sswitch_7
        0x291baa2 -> :sswitch_8
        0x59e74eb -> :sswitch_10
        0x77d006d -> :sswitch_8
        0xa1b0bbf -> :sswitch_0
        0x22aa3322 -> :sswitch_f
        0x2e3f0de3 -> :sswitch_e
        0x3080477a -> :sswitch_f
        0x3cb99799 -> :sswitch_1
        0x3f332d50 -> :sswitch_6
        0x46ab4e0b -> :sswitch_c
        0x4f7ee858 -> :sswitch_10
        0x53a434a9 -> :sswitch_3
        0x57c868c5 -> :sswitch_a
        0x5ca32950 -> :sswitch_c
        0x7dd74dee -> :sswitch_6
    .end sparse-switch
.end method

.method public final getLanguage()Ljava/lang/String;
    .locals 1

    .line 70
    invoke-static {}, Ll/ܶܳ᩷;->ܽ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getLanguageCountry()Ljava/lang/String;
    .locals 1

    .line 80
    invoke-static {}, Ll/ܶܳ᩷;->ᩳ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getLanguageNameLocalString()Lbin/mt/plugin/api/LocalString;
    .locals 1

    .line 161
    invoke-static {}, Ll/ܶܳ᩷;->ܿ()Lbin/mt/plugin/api/LocalString;

    move-result-object v0

    return-object v0
.end method

.method public final getLocalString()Lbin/mt/plugin/api/LocalString;
    .locals 1

    .line 143
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final getPluginId()Ljava/lang/String;
    .locals 16

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0x6605cfc1

    sget v11, Ll/᩺;->ۙۛܶ:I

    sget v12, Ll/֫ۧ;->ۙ۟ۧ:I

    const-string v13, "\u1a7b\u1a74"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x8e7

    const v15, 0x61c2133c

    xor-int/2addr v14, v15

    const v15, -0xba3d67c

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, -0xe73

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    const/4 v0, 0x0

    return-object v0

    .line 1
    :sswitch_0
    sget v13, Ll/֡֡;->֫ۤܳ:I

    if-gez v13, :cond_b

    goto/16 :goto_3

    .line 2
    :sswitch_1
    sget-boolean v13, Ll/ۖۘ;->ۚܶۖ:Z

    if-nez v13, :cond_8

    goto/16 :goto_2

    .line 4
    :sswitch_2
    sget v13, Ll/֨۬;->۫ۙ᩺:I

    if-lez v13, :cond_3

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    goto/16 :goto_3

    :sswitch_4
    const/16 v0, 0x14

    .line 0
    invoke-static {v8, v9, v0, v7}, Ll/֫ܽ;->᩵۠ܽ([SIII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_5
    sget-object v8, Ll/ۙ᩻᩷;->ۚܶۙ:[S

    const/16 v9, 0x9

    sget v13, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v13, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v13, "\u06df\u05a8"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x53

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x4ca1

    const v15, -0x1cb3071c

    xor-int/2addr v14, v15

    const v15, -0x4cd773dc

    goto :goto_0

    :sswitch_6
    const/16 v7, 0x58fd

    goto :goto_1

    :sswitch_7
    const v7, 0xb9c5

    :goto_1
    const-string v13, "\u0730\u1a74"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x2b

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x21d3

    const v15, -0x7506411c

    xor-int/2addr v14, v15

    const v15, -0x623be630

    goto :goto_0

    :sswitch_8
    add-int v13, v5, v6

    add-int/2addr v13, v13

    sub-int/2addr v13, v4

    if-gez v13, :cond_1

    const-string v13, "\u06e1\u05ab"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x735b

    const v15, 0x27cc05f6

    xor-int/2addr v14, v15

    const v15, -0x76eda3f5

    goto/16 :goto_0

    :cond_1
    const-string v13, "\u06e0\u06e1"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x4733

    const v15, -0x531aeab6

    xor-int/2addr v14, v15

    const v15, -0x2e54c61e

    goto/16 :goto_0

    :sswitch_9
    const v6, 0xa9d04

    .line 4
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v13

    if-nez v13, :cond_2

    goto :goto_2

    :cond_2
    const-string v13, "\u06e7\u05a8"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x79

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x5617

    const v15, -0x73f8e20f

    xor-int/2addr v14, v15

    const v15, 0x97fe927

    goto/16 :goto_0

    :sswitch_a
    mul-int v4, v3, v3

    mul-int v5, v2, v2

    sget v13, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v13, :cond_4

    :cond_3
    :goto_2
    const-string v13, "\u1a78\u06e1"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x73

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0xb3

    const v15, 0x6fd57cd3

    xor-int/2addr v14, v15

    const v15, 0x2704fc9d

    goto/16 :goto_0

    :cond_4
    const-string v13, "\u073f\u06ec"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x51

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0xaad

    const v15, -0x2f9aa459

    xor-int/2addr v14, v15

    const v15, -0x17de6bc

    goto/16 :goto_0

    :sswitch_b
    add-int/lit16 v3, v2, 0x342

    sget v13, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v13, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v13, "\u1a79\u1a7a"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x37

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x3753

    const v15, 0x4bdc2672    # 2.8855524E7f

    xor-int/2addr v14, v15

    const v15, 0x6025e818

    goto/16 :goto_0

    :sswitch_c
    aget-short v2, v0, v1

    .line 1
    sget-boolean v13, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v13, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v13, "\u1a77\u0730"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0xf

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x113f

    const v15, -0x29651b80

    xor-int/2addr v14, v15

    const v15, -0x8d3c8e6

    goto/16 :goto_0

    :sswitch_d
    const/16 v1, 0x8

    sget v13, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v13, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v13, "\u06da\u1a77"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x3aed

    const v15, 0x3d37db61

    xor-int/2addr v14, v15

    const v15, 0x671829a9

    goto/16 :goto_0

    :sswitch_e
    sget v13, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v13, :cond_9

    :cond_8
    const-string v13, "\u06e7\u06e7"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x35

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x221d

    const v15, 0x2760e870

    xor-int/2addr v14, v15

    const v15, -0x2a0fb98b

    goto/16 :goto_0

    :cond_9
    const-string v13, "\u1a78\u1a74"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x4d

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x11f3

    const v15, 0x5421a6b0

    xor-int/2addr v14, v15

    const v15, -0x590765c2

    goto/16 :goto_0

    .line 3
    :sswitch_f
    sget-boolean v13, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v13, :cond_a

    :goto_3
    const-string v13, "\u1a77\u06df"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x497b

    const v15, -0x21084324

    xor-int/2addr v14, v15

    const v15, 0x42aa4859

    goto/16 :goto_0

    :cond_a
    const-string v13, "\u06e1\u06db"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x701

    const v15, -0x3c7449ea

    xor-int/2addr v14, v15

    const v15, -0x242bfbd9

    goto/16 :goto_0

    .line 2
    :sswitch_10
    sget v13, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v13, :cond_c

    :cond_b
    const-string v13, "\u1a7b\u05a8"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1d23

    const v15, -0x3caed4d6

    xor-int/2addr v14, v15

    const v15, -0x3a27b90

    goto/16 :goto_0

    :cond_c
    const-string v13, "\u05ab\u1a78"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x1aed

    const v15, 0xeeee7d0

    xor-int/2addr v14, v15

    const v15, -0x733192eb

    goto/16 :goto_0

    :sswitch_11
    sget-object v0, Ll/ۙ᩻᩷;->ۚܶۙ:[S

    .line 3
    sget v13, Ll/᩹;->ۤܿܳ:I

    if-eqz v13, :cond_d

    :goto_4
    const-string v13, "\u06d9\u06e7"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x47

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x867

    const v15, 0x40935169

    xor-int/2addr v14, v15

    const v15, 0x7f927edf

    goto/16 :goto_0

    :cond_d
    const-string v13, "\u1a75\u0733"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x5695

    const v15, 0x391eb5f3

    xor-int/2addr v14, v15

    const v15, -0x107e1fc7

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x78b863f9 -> :sswitch_2
        -0x6ec3af9b -> :sswitch_5
        -0x6b43e3e9 -> :sswitch_a
        -0x623eb3a3 -> :sswitch_9
        -0x603fb339 -> :sswitch_e
        -0x6011bdaf -> :sswitch_d
        -0x5d8c3932 -> :sswitch_f
        -0x58a32dca -> :sswitch_f
        -0x585018e9 -> :sswitch_6
        -0x56f25d0c -> :sswitch_d
        -0x5356ebdd -> :sswitch_4
        -0x3e439fc2 -> :sswitch_11
        -0x3a7be5cd -> :sswitch_0
        -0x3a2fcf92 -> :sswitch_11
        -0x364247e2 -> :sswitch_1
        -0x259e227c -> :sswitch_10
        -0x20ae2da2 -> :sswitch_b
        -0x1bb71d00 -> :sswitch_7
        -0x148c9b51 -> :sswitch_3
        -0x11c82122 -> :sswitch_e
        0x592b319 -> :sswitch_a
        0xdf60c8e -> :sswitch_9
        0xe93d94e -> :sswitch_7
        0x174abc70 -> :sswitch_3
        0x1e94f578 -> :sswitch_8
        0x32f53cb8 -> :sswitch_5
        0x359b0bba -> :sswitch_6
        0x49a5a682 -> :sswitch_c
        0x4ad15c3b -> :sswitch_c
        0x5526666d -> :sswitch_8
        0x56d77e2e -> :sswitch_10
        0x59cf4a1a -> :sswitch_2
        0x5bb290fc -> :sswitch_1
        0x6b7ad457 -> :sswitch_4
        0x7624e057 -> :sswitch_0
        0x7bfb4f10 -> :sswitch_b
    .end sparse-switch
.end method

.method public final getPluginName()Ljava/lang/String;
    .locals 16

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0x68c548a

    sget v11, Ll/֫ܽ;->ۚ᩷᩹:I

    sget v12, Ll/֨۬;->۫ۙ᩺:I

    const-string v13, "\u06e2\u06db"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0xb

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x6871

    const v15, -0x2a0981a9

    xor-int/2addr v14, v15

    const v15, 0x6029e182

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, -0x3b3

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    sget v13, Ll/ۙۨ;->ۡۗۙ:I

    if-lez v13, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v13, "\u06e2\u06dc"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x5f

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x2895

    const v15, -0x39f03dc2

    xor-int/2addr v14, v15

    const v15, -0x18c5a27b

    goto :goto_0

    .line 2
    :sswitch_0
    sget v13, Ll/֡֡;->֫ۤܳ:I

    if-ltz v13, :cond_9

    goto/16 :goto_4

    .line 0
    :sswitch_1
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    sget v13, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v13, :cond_6

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    goto/16 :goto_4

    .line 1
    :sswitch_3
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    const/4 v0, 0x0

    return-object v0

    :sswitch_4
    const/4 v0, 0x6

    .line 0
    invoke-static {v8, v9, v0, v7}, Ll/֡᩺;->᩸ۜۢ([SIII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_5
    sget-object v8, Ll/ۙ᩻᩷;->ۚܶۙ:[S

    const/16 v9, 0x1e

    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v13

    if-eqz v13, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v13, "\u06dc\u06d7"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x7b

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1fd3

    const v15, -0x7e39583

    xor-int/2addr v14, v15

    const v15, 0x12b29eed

    goto :goto_0

    :sswitch_6
    const v7, 0x996d

    goto :goto_1

    :sswitch_7
    const/16 v7, 0x781f

    :goto_1
    const-string v13, "\u1a78\u073f"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x102d

    const v15, -0x205e9eef

    xor-int/2addr v14, v15

    const v15, -0x326e2ac2    # -3.0583392E8f

    goto :goto_0

    :sswitch_8
    add-int v13, v5, v6

    add-int/2addr v13, v13

    sub-int v13, v4, v13

    if-lez v13, :cond_2

    const-string v13, "\u06d7\u06d6"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x25

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x334b

    const v15, -0x67f00351

    xor-int/2addr v14, v15

    const v15, 0x616dfcd7

    goto/16 :goto_0

    :cond_2
    const-string v13, "\u06db\u06da"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x51

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x2d3

    const v15, 0x591d27ad

    xor-int/2addr v14, v15

    const v15, 0x5fd4f5e4

    goto/16 :goto_0

    :sswitch_9
    const v6, 0x66840

    .line 4
    sget v13, Ll/۠;->ܺܺܶ:I

    if-ltz v13, :cond_3

    goto :goto_2

    :cond_3
    const-string v13, "\u073d\u06d9"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x49

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x4ab9

    const v15, 0x4bb7f17b    # 2.4109814E7f

    xor-int/2addr v14, v15

    const v15, 0x64824b00

    goto/16 :goto_0

    :sswitch_a
    mul-int v4, v3, v3

    mul-int v5, v2, v2

    .line 3
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v13

    if-gtz v13, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v13, "\u06e0\u06ec"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x4f

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x23cf

    const v15, 0x4de666ed    # 4.83188128E8f

    xor-int/2addr v14, v15

    const v15, 0x5b1f1dcf

    goto/16 :goto_0

    :sswitch_b
    add-int/lit16 v3, v2, 0x288

    .line 1
    sget v13, Ll/۠;->ܺܺܶ:I

    if-ltz v13, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v13, "\u06d9\u0736"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x20a7

    const v15, -0x5626b636

    xor-int/2addr v14, v15

    const v15, -0x32e87fa4

    goto/16 :goto_0

    :sswitch_c
    aget-short v2, v0, v1

    .line 0
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v13

    if-gtz v13, :cond_7

    :cond_6
    :goto_2
    const-string v13, "\u05ab\u06d9"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x5d

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x123

    const v15, -0x7747501f

    xor-int/2addr v14, v15

    const v15, -0x717ffdf0

    goto/16 :goto_0

    :cond_7
    const-string v13, "\u06e1\u06df"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x75

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x2f4d

    const v15, 0x728bbd8a

    xor-int/2addr v14, v15

    const v15, 0x4a5f0c4a    # 3654418.5f

    goto/16 :goto_0

    :sswitch_d
    const/16 v1, 0x1d

    sget-boolean v13, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v13, :cond_8

    goto :goto_3

    :cond_8
    const-string v13, "\u0733\u06e4"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x27

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1e1b

    const v15, -0x4b7486b8

    xor-int/2addr v14, v15

    const v15, -0x381944c7

    goto/16 :goto_0

    .line 3
    :sswitch_e
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v13

    if-nez v13, :cond_a

    :cond_9
    :goto_3
    const-string v13, "\u06d6\u06e1"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x2625

    const v15, 0x691cae3b

    xor-int/2addr v14, v15

    const v15, 0xad6c11f

    goto/16 :goto_0

    :cond_a
    const-string v13, "\u05a1\u06e7"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x23

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x41ef

    const v15, 0x170851b4

    xor-int/2addr v14, v15

    const v15, -0x1a323ac1

    goto/16 :goto_0

    .line 0
    :sswitch_f
    sget v13, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v13, :cond_b

    :goto_4
    const-string v13, "\u073a\u05a8"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x158b

    const v15, -0x3065d1a5

    xor-int/2addr v14, v15

    const v15, -0x6cfb830e

    goto/16 :goto_0

    :cond_b
    const-string v13, "\u1a75\u06d6"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x4b

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x776f

    const v15, 0x19db515c

    xor-int/2addr v14, v15

    const v15, 0x573ab390

    goto/16 :goto_0

    :sswitch_10
    sget v13, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v13, :cond_c

    goto :goto_5

    :cond_c
    const-string v13, "\u06d8\u06db"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x439d

    const v15, -0x5d7451b8

    xor-int/2addr v14, v15

    const v15, 0x76cbb489

    goto/16 :goto_0

    :sswitch_11
    sget-object v0, Ll/ۙ᩻᩷;->ۚܶۙ:[S

    .line 3
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v13

    if-ltz v13, :cond_d

    :goto_5
    const-string v13, "\u0733\u06e8"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x2e15

    const v15, 0x29d96f4d

    xor-int/2addr v14, v15

    const v15, -0x35e55fb5

    goto/16 :goto_0

    :cond_d
    const-string v13, "\u1a78\u0730"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x49d7

    const v15, 0x72765128

    xor-int/2addr v14, v15

    const v15, -0x532a7ac2

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7700c6df -> :sswitch_7
        -0x6c986b3b -> :sswitch_7
        -0x68f0cb75 -> :sswitch_3
        -0x66cb7ffe -> :sswitch_2
        -0x64ca3b02 -> :sswitch_1
        -0x647f616c -> :sswitch_3
        -0x5bad46b2 -> :sswitch_10
        -0x5b3d26b5 -> :sswitch_2
        -0x5a5e0886 -> :sswitch_6
        -0x4f925d15 -> :sswitch_f
        -0x41f4235a -> :sswitch_6
        -0x3d682313 -> :sswitch_11
        -0x32ec6b83 -> :sswitch_8
        -0x31953ec5 -> :sswitch_0
        -0x24fdecc3 -> :sswitch_11
        -0x18d74f60 -> :sswitch_f
        -0x1415546d -> :sswitch_e
        -0x9666e94 -> :sswitch_8
        -0x3f62e36 -> :sswitch_b
        -0x184f33c -> :sswitch_c
        0x49a9d33 -> :sswitch_9
        0x78af178 -> :sswitch_a
        0xaa18c06 -> :sswitch_4
        0xaa84ea2 -> :sswitch_4
        0x24c5e061 -> :sswitch_d
        0x30165709 -> :sswitch_d
        0x38c192bd -> :sswitch_5
        0x468f2334 -> :sswitch_e
        0x4eab72f0 -> :sswitch_10
        0x51188b78 -> :sswitch_b
        0x5562c428 -> :sswitch_9
        0x5c7131d3 -> :sswitch_5
        0x5cf4840b -> :sswitch_a
        0x757f89d9 -> :sswitch_0
        0x7aabbe1b -> :sswitch_c
        0x7be3f0d6 -> :sswitch_1
    .end sparse-switch
.end method

.method public final getPluginSdkVersion()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public final getPluginVersionCode()I
    .locals 1

    .line 40
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final getPluginVersionName()Ljava/lang/String;
    .locals 1

    .line 45
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final getPreferences()Landroid/content/SharedPreferences;
    .locals 1

    .line 65
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 16

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, -0x1dfe9ba4

    sget v9, Ll/ۛ;->᩺᩻֫:I

    sget v10, Ll/ۗ۬;->ۘܳ᩻:I

    const-string v11, "\u05ab\u1a73"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x4cdf

    const v13, 0x23eedf40

    xor-int/2addr v12, v13

    const v13, 0x1fd68d5d

    xor-int/2addr v11, v13

    :goto_0
    xor-int/2addr v8, v9

    mul-int/lit16 v8, v8, 0x3a15

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v8, v12

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_0

    .line 43
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    const/4 v0, 0x0

    return-object v0

    .line 34
    :sswitch_0
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget v11, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-nez v11, :cond_0

    :goto_1
    move-object/from16 v12, p1

    goto/16 :goto_6

    :cond_0
    move-object/from16 v12, p1

    goto/16 :goto_7

    :sswitch_1
    sget v11, Ll/֨ۤ;->ܿۖ᩵:I

    if-gez v11, :cond_2

    :cond_1
    move-object/from16 v12, p1

    goto/16 :goto_4

    :cond_2
    :goto_2
    move-object/from16 v12, p1

    goto/16 :goto_8

    .line 72
    :sswitch_2
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v11

    if-nez v11, :cond_1

    goto :goto_1

    .line 52
    :sswitch_3
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    goto :goto_1

    :sswitch_4
    return-object v0

    .line 115
    :sswitch_5
    new-instance v11, Ljava/lang/IllegalArgumentException;

    sget-object v12, Ll/ۙ᩻᩷;->ۚܶۙ:[S

    sget v13, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v13, :cond_3

    move-object/from16 v12, p1

    goto/16 :goto_5

    :cond_3
    const/16 v13, 0x25

    .line 40
    sget v14, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v14, :cond_4

    goto :goto_1

    :cond_4
    const/16 v14, 0x12

    sget v15, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v15, :cond_5

    goto :goto_2

    .line 115
    :cond_5
    invoke-static {v12, v13, v14, v7}, Ll/ۘۛ;->ۚ᩻֫([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v12, p1

    invoke-static {v0, v12}, Ll/ۘᩴ;->۟ܳ᩻(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v11, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v11

    :sswitch_6
    move-object/from16 v12, p1

    .line 113
    invoke-static/range {p0 .. p1}, Ll/֫ۡ;->᩻ۢۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    const-string v11, "\u0733\u073d"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x39

    xor-int v13, v11, v10

    mul-int/lit16 v13, v13, 0x653d

    const v14, 0x2087b695

    xor-int/2addr v13, v14

    const v14, -0x74a9854a

    goto/16 :goto_9

    :cond_6
    const-string v11, "\u06d6\u06df"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x69

    xor-int v13, v11, v9

    mul-int/lit16 v13, v13, -0x512f

    const v14, 0x74d33de3

    xor-int/2addr v13, v14

    const v14, -0x51e64b0e

    goto/16 :goto_9

    :sswitch_7
    move-object/from16 v12, p1

    const v7, 0xe351

    goto :goto_3

    :sswitch_8
    move-object/from16 v12, p1

    const v7, 0xd662

    :goto_3
    const-string v11, "\u0736\u0733"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v13, v11, v10

    mul-int/lit16 v13, v13, -0x5545

    const v14, 0x689141b

    xor-int/2addr v13, v14

    const v14, 0x27d8a2b0

    goto/16 :goto_9

    :sswitch_9
    move-object/from16 v12, p1

    mul-int v11, v3, v6

    sub-int v11, v5, v11

    if-gez v11, :cond_7

    const-string v11, "\u06d7\u06df"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x71

    xor-int v13, v11, v9

    mul-int/lit16 v13, v13, 0x514f

    const v14, 0x6f86a3f5

    xor-int/2addr v13, v14

    const v14, 0x32c21a8f

    goto/16 :goto_9

    :cond_7
    const-string v11, "\u06e7\u1a7b"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, -0x4b

    xor-int v13, v11, v10

    mul-int/lit16 v13, v13, -0x1bb

    const v14, -0x2aad638d

    xor-int/2addr v13, v14

    const v14, -0x271bbcd8

    goto/16 :goto_9

    :sswitch_a
    move-object/from16 v12, p1

    const/16 v6, 0x71cc

    .line 64
    sget v11, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v11, :cond_8

    goto/16 :goto_8

    :cond_8
    const-string v11, "\u06e4\u06df"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v13, v11, v9

    mul-int/lit16 v13, v13, -0x5d5

    const v14, 0x5d6d7430

    xor-int/2addr v13, v14

    const v14, -0x5387ad7d

    goto/16 :goto_9

    :sswitch_b
    move-object/from16 v12, p1

    const v5, 0xca56ea4

    add-int/2addr v5, v4

    sget v11, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v11, :cond_9

    :goto_4
    const-string v11, "\u06d7\u06d9"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x7

    xor-int v13, v11, v10

    mul-int/lit16 v13, v13, -0x4ffb

    const v14, -0x760aef07

    xor-int/2addr v13, v14

    const v14, 0x626ed42b

    goto/16 :goto_9

    :cond_9
    const-string v11, "\u06ec\u06d6"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x3b

    xor-int v13, v11, v10

    mul-int/lit16 v13, v13, -0x6e71

    const v14, 0x278717a7

    xor-int/2addr v13, v14

    const v14, 0x2077cab

    goto/16 :goto_9

    :sswitch_c
    move-object/from16 v12, p1

    aget-short v3, v1, v2

    mul-int v4, v3, v3

    .line 5
    sget-boolean v11, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v11, :cond_a

    :goto_5
    const-string v11, "\u1a78\u06e1"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x53

    xor-int v13, v11, v9

    mul-int/lit16 v13, v13, -0x4371

    const v14, 0x5bd0e009

    xor-int/2addr v13, v14

    const v14, 0x757d0cad

    goto/16 :goto_9

    :cond_a
    const-string v11, "\u06d8\u06ec"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v13, v11, v9

    mul-int/lit16 v13, v13, 0x164b

    const v14, -0x7174c0b

    xor-int/2addr v13, v14

    const v14, -0x702d2ce0

    goto/16 :goto_9

    :sswitch_d
    move-object/from16 v12, p1

    const/16 v2, 0x24

    .line 64
    sget-boolean v11, Ll/֨۫;->۬᩷᩶:Z

    if-nez v11, :cond_b

    :goto_6
    const-string v11, "\u06ec\u06eb"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x2b

    xor-int v13, v11, v9

    mul-int/lit16 v13, v13, 0x6dd5

    const v14, 0x244d8b2a

    xor-int/2addr v13, v14

    const v14, -0x145873d2

    goto/16 :goto_9

    :cond_b
    const-string v11, "\u06e7\u06eb"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x59

    xor-int v13, v11, v10

    mul-int/lit16 v13, v13, -0x3225

    const v14, -0x6740c050

    xor-int/2addr v13, v14

    const v14, -0x3adf1aa

    goto/16 :goto_9

    :sswitch_e
    move-object/from16 v12, p1

    sget-object v1, Ll/ۙ᩻᩷;->ۚܶۙ:[S

    sget v11, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v11, :cond_c

    :goto_7
    const-string v11, "\u06e1\u06e0"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x3b

    xor-int v13, v11, v9

    mul-int/lit16 v13, v13, 0x3c07

    const v14, -0x454c3984

    xor-int/2addr v13, v14

    const v14, -0x39abf5eb

    goto :goto_9

    :cond_c
    const-string v11, "\u06eb\u05ab"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v13, v11, v9

    mul-int/lit16 v13, v13, 0x52d

    const v14, -0x7ad80ac6

    xor-int/2addr v13, v14

    const v14, 0x6e2e47c3

    goto :goto_9

    :sswitch_f
    move-object/from16 v12, p1

    .line 108
    sget-boolean v11, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v11, :cond_d

    goto :goto_8

    :cond_d
    const-string v11, "\u06df\u1a76"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v13, v11, v9

    mul-int/lit16 v13, v13, -0x72df

    const v14, -0x578b70ca

    xor-int/2addr v13, v14

    const v14, 0x5eaa0af3

    goto :goto_9

    :sswitch_10
    move-object/from16 v12, p1

    .line 102
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v11

    if-eqz v11, :cond_e

    :goto_8
    const-string v11, "\u06d7\u1a7b"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v13, v11, v10

    mul-int/lit16 v13, v13, 0x4537

    const v14, -0x1aae1be9

    xor-int/2addr v13, v14

    const v14, 0x58efbcbe

    goto :goto_9

    :cond_e
    const-string v11, "\u06db\u1a78"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v13, v11, v10

    mul-int/lit16 v13, v13, -0x2713

    const v14, -0x73a26ed7

    xor-int/2addr v13, v14

    const v14, 0x6e80e71b

    :goto_9
    xor-int/2addr v11, v14

    move v12, v13

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c48d64f -> :sswitch_f
        -0x7bdb2b93 -> :sswitch_c
        -0x7230df05 -> :sswitch_5
        -0x71fe2970 -> :sswitch_9
        -0x69379051 -> :sswitch_0
        -0x5b1ee070 -> :sswitch_0
        -0x5a2ffa4f -> :sswitch_4
        -0x542606fe -> :sswitch_f
        -0x5254afa4 -> :sswitch_b
        -0x4e3e20e9 -> :sswitch_8
        -0x4a278d93 -> :sswitch_2
        -0x4102b75d -> :sswitch_7
        -0x4074e56e -> :sswitch_e
        -0x3fb8b516 -> :sswitch_a
        -0x38339722 -> :sswitch_3
        -0x36b79349 -> :sswitch_6
        -0x35109ba6 -> :sswitch_6
        -0x1ee90aa6 -> :sswitch_3
        -0x17f4a0a9 -> :sswitch_2
        -0x1729e024 -> :sswitch_c
        -0x56080f1 -> :sswitch_7
        0x13d5c9aa -> :sswitch_10
        0x27566192 -> :sswitch_1
        0x29375dcc -> :sswitch_9
        0x2b4c9c30 -> :sswitch_b
        0x337742c2 -> :sswitch_d
        0x34558d78 -> :sswitch_1
        0x3daf1f1d -> :sswitch_10
        0x460c8357 -> :sswitch_4
        0x4c57c38b -> :sswitch_d
        0x561ff82e -> :sswitch_a
        0x59fbbb57 -> :sswitch_8
        0x636239a6 -> :sswitch_5
        0x7cd3bdec -> :sswitch_e
    .end sparse-switch
.end method

.method public final varargs getString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    const v0, 0x3d24812f

    sget v1, Ll/֫ܽ;->ۚ᩷᩹:I

    sget v2, Ll/֫ܿ;->ۨ۫ᩳ:I

    const-string v3, "\u1a75\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x35

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x17b1

    const v5, -0x1983977c

    xor-int/2addr v4, v5

    const v5, -0x386095f8

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x5c5b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 103
    sget v3, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v3, :cond_0

    goto/16 :goto_2

    :sswitch_0
    sget v3, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v3, :cond_b

    goto :goto_1

    .line 109
    :sswitch_1
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_1

    :sswitch_2
    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-eqz v3, :cond_7

    goto :goto_1

    .line 60
    :sswitch_3
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    invoke-static {}, Ll/۠;->ܿ۠۠()I

    :goto_1
    const-string v3, "\u06e8\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6eab

    const v5, -0x5182b79b

    xor-int/2addr v4, v5

    const v5, -0x25f6c172

    goto :goto_0

    .line 12
    :sswitch_4
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    const/4 p1, 0x0

    return-object p1

    .line 123
    :sswitch_5
    invoke-virtual {p0, p1}, Ll/ۙ᩻᩷;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Ll/ۤ᩻᩷;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string v3, "\u1a76\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x7d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x302b

    const v5, 0x6db46ce9

    xor-int/2addr v4, v5

    const v5, -0x213f344

    goto :goto_0

    .line 86
    :sswitch_6
    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06e8\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5eb1

    const v5, 0x14e9fccf

    xor-int/2addr v4, v5

    const v5, -0x7a36e180

    goto :goto_0

    .line 73
    :sswitch_7
    sget v3, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06eb\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x56cb

    const v5, 0x4407eac8

    xor-int/2addr v4, v5

    const v5, 0x1edf7f3

    goto/16 :goto_0

    .line 94
    :sswitch_8
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v3

    if-ltz v3, :cond_3

    :goto_2
    const-string v3, "\u073d\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5d31

    const v5, -0x38bd5063

    xor-int/2addr v4, v5

    const v5, 0x54b40965

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u1a74\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3f4d

    const v5, 0x796629ca

    xor-int/2addr v4, v5

    const v5, -0x5f76fbfd

    goto/16 :goto_0

    .line 43
    :sswitch_9
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v3

    if-eqz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u1a78\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2213

    const v5, 0x5d8a1cad

    xor-int/2addr v4, v5

    const v5, -0x53a0473b

    goto/16 :goto_0

    .line 88
    :sswitch_a
    sget v3, Ll/۠;->ܺܺܶ:I

    if-ltz v3, :cond_5

    goto :goto_3

    :cond_5
    const-string v3, "\u05a8\u05a8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x727b

    const v5, -0x124169de

    xor-int/2addr v4, v5

    const v5, -0x562673f0

    goto/16 :goto_0

    .line 120
    :sswitch_b
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v3

    if-ltz v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u0730\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5921

    const v5, 0x62cd8da9

    xor-int/2addr v4, v5

    const v5, -0x5276dea2

    goto/16 :goto_0

    .line 64
    :sswitch_c
    sget v3, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v3, :cond_8

    :cond_7
    const-string v3, "\u06e2\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x330b

    const v5, 0x66721f16

    xor-int/2addr v4, v5

    const v5, -0x5743974d

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06da\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2101

    const v5, -0x24194688

    xor-int/2addr v4, v5

    const v5, -0x315f3180

    goto/16 :goto_0

    .line 118
    :sswitch_d
    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u05a8\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7d15

    const v5, 0x7445cd4a

    xor-int/2addr v4, v5

    const v5, 0x9d5259b

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u05a8\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x523

    const v5, 0x2affd427

    xor-int/2addr v4, v5

    const v5, -0x3d66c8ff

    goto/16 :goto_0

    .line 51
    :sswitch_e
    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06da\u05a8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5c8d

    const v5, 0x46d5ae6e

    xor-int/2addr v4, v5

    const v5, 0x1effc75f

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a77\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5bf1

    const v5, -0x586c514c

    xor-int/2addr v4, v5

    const v5, 0x39ff65a1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a75545d -> :sswitch_5
        -0x766b5cdd -> :sswitch_9
        -0x71d5b9b6 -> :sswitch_4
        -0x67c9b380 -> :sswitch_2
        -0x57ed4664 -> :sswitch_8
        -0x4b27ca27 -> :sswitch_c
        -0x47e3e8f5 -> :sswitch_e
        -0x3aa8ce13 -> :sswitch_0
        -0x32d7a024 -> :sswitch_a
        -0x28f29c7f -> :sswitch_1
        -0x21d24b04 -> :sswitch_9
        -0x11c0b81b -> :sswitch_5
        -0xc89db2e -> :sswitch_b
        0x709e29 -> :sswitch_4
        0xcb8f8da -> :sswitch_e
        0x12fd33de -> :sswitch_a
        0x1d15618c -> :sswitch_3
        0x26fdbe5e -> :sswitch_b
        0x2a0979c2 -> :sswitch_3
        0x2f250201 -> :sswitch_0
        0x3169e1c5 -> :sswitch_7
        0x3f05138c -> :sswitch_7
        0x4adcb966 -> :sswitch_1
        0x4f732eae -> :sswitch_2
        0x537a5e12 -> :sswitch_c
        0x55ce8e9d -> :sswitch_6
        0x5ee6dfff -> :sswitch_d
        0x5fb6461b -> :sswitch_8
        0x69a83441 -> :sswitch_6
        0x6ddffac7 -> :sswitch_d
    .end sparse-switch
.end method

.method public final varargs getStringArray([Ljava/lang/String;)[Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x70051920

    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    sget v4, Ll/ۛ;->᩺᩻֫:I

    const-string v5, "\u1a78\u06eb"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x9

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6d45

    const v7, 0x47b26daa

    xor-int/2addr v6, v7

    const v7, 0xa167bb6

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x2b27

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 111
    sget v5, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v5, :cond_8

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    sget v5, Ll/ۗۗ;->ۨ۬ۖ:I

    if-gez v5, :cond_c

    goto :goto_1

    .line 27
    :sswitch_1
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v5

    if-ltz v5, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v5, "\u06eb\u06d7"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x1d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6f63

    const v7, -0x3405b19

    xor-int/2addr v6, v7

    const v7, 0x6776a27d

    goto :goto_0

    .line 122
    :sswitch_2
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v5

    if-nez v5, :cond_4

    goto/16 :goto_4

    .line 125
    :sswitch_3
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    goto/16 :goto_4

    .line 66
    :sswitch_4
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    const/4 p1, 0x0

    return-object p1

    :sswitch_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 135
    :sswitch_6
    aput-object v1, p1, v0

    sget v5, Ll/᩺;->ۙۛܶ:I

    if-gtz v5, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v5, "\u05a1\u1a74"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x2d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6533

    const v7, -0x635f799

    xor-int/2addr v6, v7

    const v7, 0x383a11cf

    goto :goto_0

    :sswitch_7
    aget-object v1, p1, v0

    invoke-virtual {p0, v1}, Ll/ۙ᩻᩷;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget v5, Ll/ۛ;->᩺᩻֫:I

    if-ltz v5, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v5, "\u06e7\u06d7"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x5f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6757

    const v7, 0x378c4fe2

    xor-int/2addr v6, v7

    const v7, 0x5e2aa209

    goto/16 :goto_0

    :sswitch_8
    return-object p1

    .line 134
    :sswitch_9
    array-length v5, p1

    if-ge v0, v5, :cond_3

    const-string v5, "\u1a73\u1a73"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x44bd

    const v7, 0x45bd6c0f

    xor-int/2addr v6, v7

    const v7, 0x3043a57f

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u06e7\u06df"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x6b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1b27

    const v7, -0x465d37e8

    xor-int/2addr v6, v7

    const v7, 0x6543c63f

    goto/16 :goto_0

    :sswitch_a
    const/4 v0, 0x0

    :goto_2
    const-string v5, "\u06e4\u06d6"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x46bb

    const v7, -0x34595f9d    # -2.184007E7f

    xor-int/2addr v6, v7

    const v7, 0x70906b9d

    goto/16 :goto_0

    .line 77
    :sswitch_b
    sget v5, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v5, :cond_5

    :cond_4
    const-string v5, "\u1a75\u06e7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x97

    const v7, 0x2c2bdc97

    xor-int/2addr v6, v7

    const v7, -0x6599fb6b

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u06d6\u06ec"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x65

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2b2b

    const v7, 0x552536ab

    xor-int/2addr v6, v7

    const v7, -0x76b91f66

    goto/16 :goto_0

    .line 7
    :sswitch_c
    sget v5, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v5, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v5, "\u06e0\u1a78"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2f67

    const v7, 0x2beb37b5

    xor-int/2addr v6, v7

    const v7, -0x212346a

    goto/16 :goto_0

    .line 70
    :sswitch_d
    sget-boolean v5, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v5, :cond_7

    :goto_3
    const-string v5, "\u06d8\u1a79"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6ab9

    const v7, -0x5e8961b3

    xor-int/2addr v6, v7

    const v7, -0x24a355bc

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u06da\u1a78"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1067

    const v7, 0x703bf5d5

    xor-int/2addr v6, v7

    const v7, -0x6a9bf4a0

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u0733\u1a79"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x35

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6bd9

    const v7, 0x1e4ae255

    xor-int/2addr v6, v7

    const v7, 0x7999503f

    goto/16 :goto_0

    .line 99
    :sswitch_e
    sget v5, Ll/֡۬;->۠֡᩶:I

    if-gtz v5, :cond_9

    goto :goto_4

    :cond_9
    const-string v5, "\u05ab\u06e7"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3fd3

    const v7, 0x3c2db9aa

    xor-int/2addr v6, v7

    const v7, -0x1864dcae

    goto/16 :goto_0

    :sswitch_f
    sget v5, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v5, :cond_a

    goto :goto_4

    :cond_a
    const-string v5, "\u06e4\u1a77"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x28d7

    const v7, -0x6ccaf193

    xor-int/2addr v6, v7

    const v7, 0xe7495b

    goto/16 :goto_0

    .line 97
    :sswitch_10
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v5

    if-eqz v5, :cond_b

    :goto_4
    const-string v5, "\u1a73\u06e8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x56af

    const v7, -0x795b73c6

    xor-int/2addr v6, v7

    const v7, 0x665d070e

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u0736\u073a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3597

    const v7, -0x6aad05dc

    xor-int/2addr v6, v7

    const v7, -0x246807e1

    goto/16 :goto_0

    .line 92
    :sswitch_11
    sget v5, Ll/᩹;->ۤܿܳ:I

    if-eqz v5, :cond_d

    :cond_c
    :goto_5
    const-string v5, "\u1a78\u06e1"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x4f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x774d

    const v7, 0x479e0d1f

    xor-int/2addr v6, v7

    const v7, 0x12d41c70

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06df\u1a76"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6d75

    const v7, 0x1c449963

    xor-int/2addr v6, v7

    const v7, 0x31d73c9b

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x720578a9 -> :sswitch_c
        -0x6efb999e -> :sswitch_e
        -0x68e403b6 -> :sswitch_10
        -0x5d001ced -> :sswitch_4
        -0x554842cc -> :sswitch_f
        -0x4a60d46d -> :sswitch_d
        -0x432549fc -> :sswitch_8
        -0x2efa5b65 -> :sswitch_11
        -0x231f0c45 -> :sswitch_10
        -0x228834b8 -> :sswitch_7
        -0x1ed8689c -> :sswitch_a
        -0x1e8c973b -> :sswitch_9
        -0x1e3e6ba5 -> :sswitch_2
        -0x1a5e7d53 -> :sswitch_9
        -0x135de4cf -> :sswitch_b
        -0x117c2ed2 -> :sswitch_7
        -0x10930582 -> :sswitch_0
        -0x8421d0f -> :sswitch_4
        -0x7d7bcf2 -> :sswitch_a
        0x13d9c0f -> :sswitch_2
        0x1a0f775 -> :sswitch_8
        0x54cb291 -> :sswitch_e
        0x7c2e1c0 -> :sswitch_3
        0x10da0459 -> :sswitch_b
        0x11ca29cd -> :sswitch_1
        0x27d64c30 -> :sswitch_1
        0x2af3bad9 -> :sswitch_11
        0x38f2422a -> :sswitch_6
        0x4a74c1f1 -> :sswitch_f
        0x4abf9bcf -> :sswitch_0
        0x6f9d2905 -> :sswitch_d
        0x75160ae3 -> :sswitch_5
        0x77521fd0 -> :sswitch_3
        0x7853c5e9 -> :sswitch_c
        0x796669b6 -> :sswitch_5
        0x7d177d6f -> :sswitch_6
    .end sparse-switch
.end method

.method public final varargs getStringList([Ljava/lang/String;)Ljava/util/List;
    .locals 0

    .line 129
    invoke-virtual {p0, p1}, Ll/ۙ᩻᩷;->getStringArray([Ljava/lang/String;)[Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final getStringNullable(Ljava/lang/String;)Ljava/lang/String;
    .locals 24

    move-object/from16 v0, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v16, -0x1a3c1ed0

    sget v17, Ll/᩺;->ۙۛܶ:I

    sget v18, Ll/ۖ۫;->ۖ֫ܿ:I

    const-string v19, "\u073f\u1a76"

    invoke-static/range {v19 .. v19}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v17

    mul-int/lit8 v19, v19, 0x71

    xor-int v1, v19, v18

    mul-int/lit16 v1, v1, 0x2d91

    const v21, 0x1bfd3c8b

    xor-int v1, v1, v21

    const v21, 0x17f0e444

    xor-int v19, v19, v21

    move-object v4, v3

    move-object/from16 v16, v8

    move-object v9, v15

    move/from16 v20, v19

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v19, -0x1a3c1ed0

    const/16 v21, 0x0

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    const/4 v5, 0x0

    :goto_0
    xor-int v10, v19, v18

    mul-int/lit16 v10, v10, -0x46d

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v1, v10

    xor-int v19, v20, v1

    sparse-switch v19, :sswitch_data_0

    move/from16 v20, v12

    move/from16 v22, v13

    mul-int v1, v11, v14

    sub-int v1, v1, v22

    if-gtz v1, :cond_d

    const-string v1, "\u073a\u1a79"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x1d

    xor-int v10, v1, v18

    mul-int/lit16 v10, v10, 0x7709

    const v12, 0x1946bfdb

    xor-int/2addr v10, v12

    const v12, -0x452c4b2e

    goto/16 :goto_f

    .line 42
    :sswitch_0
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    sget v1, Ll/ۗ᩺;->ۡ᩺֡:I

    if-gez v1, :cond_1

    :cond_0
    move/from16 v20, v12

    :goto_1
    move/from16 v22, v13

    goto/16 :goto_e

    :cond_1
    move/from16 v20, v12

    move/from16 v22, v13

    goto/16 :goto_d

    .line 50
    :sswitch_1
    sget v1, Ll/֫ܽ;->ۚ᩷᩹:I

    if-gez v1, :cond_0

    :goto_2
    move/from16 v20, v12

    goto/16 :goto_9

    .line 97
    :sswitch_2
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    sget v1, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v1, :cond_2

    goto :goto_2

    :cond_2
    const-string v1, "\u1a74\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v10, v1, v17

    mul-int/lit16 v10, v10, 0x6473

    const v20, -0x6fa7e364

    xor-int v10, v10, v20

    const v20, -0x7a3d54

    xor-int v20, v1, v20

    goto/16 :goto_11

    .line 108
    :sswitch_3
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    move/from16 v20, v12

    :goto_3
    move/from16 v22, v13

    goto/16 :goto_8

    :sswitch_4
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    goto :goto_2

    .line 8
    :sswitch_5
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    const/4 v0, 0x0

    return-object v0

    .line 0
    :sswitch_6
    invoke-static {v3, v3, v0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object v4, v1

    move/from16 v20, v12

    move/from16 v22, v13

    goto/16 :goto_6

    .line 46
    :sswitch_7
    new-instance v1, Ll/᩶᩻᩷;

    sget-object v10, Ll/ۙ᩻᩷;->ۚܶۙ:[S

    move/from16 v20, v12

    .line 26
    sget v22, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v22, :cond_4

    goto :goto_3

    :cond_4
    const/4 v12, 0x7

    .line 98
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v23

    if-eqz v23, :cond_5

    goto :goto_1

    :cond_5
    move/from16 v22, v13

    const/16 v13, 0x3c

    .line 46
    invoke-static {v10, v13, v12, v15}, Ll/֨۟;->֡ۚۧ([SIII)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v1, v10}, Ll/᩶᩻᩷;-><init>(Ljava/lang/String;)V

    sput-object v1, Ll/ܶܳ᩷;->ۧ:Ll/᩶᩻᩷;

    goto :goto_4

    .line 48
    :sswitch_8
    sget-object v0, Ll/ܶܳ᩷;->ۧ:Ll/᩶᩻᩷;

    .line 97
    invoke-virtual {v0, v4, v6}, Ll/᩶᩻᩷;->getOrDefault(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 161
    :sswitch_9
    invoke-static {}, Ll/ܶܳ᩷;->ܿ()Lbin/mt/plugin/api/LocalString;

    move-result-object v0

    .line 102
    check-cast v0, Ll/᩶᩻᩷;

    invoke-virtual {v0, v8, v6}, Ll/᩶᩻᩷;->getOrDefault(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_a
    return-object v6

    :sswitch_b
    move/from16 v20, v12

    move/from16 v22, v13

    .line 0
    invoke-static {v3, v0}, Ll/ۨ;->ۘۜᩴ(ILjava/lang/Object;)C

    move-result v1

    const/16 v10, 0x7d

    if-ne v1, v10, :cond_c

    const-string v1, "\u1a77\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0x2d

    xor-int v10, v1, v17

    mul-int/lit16 v10, v10, 0x63df

    const v12, -0x13d25c6a

    xor-int/2addr v10, v12

    const v12, 0x5c1a38ec

    goto/16 :goto_f

    :sswitch_c
    move/from16 v20, v12

    move/from16 v22, v13

    .line 45
    sget-object v1, Ll/ܶܳ᩷;->ۧ:Ll/᩶᩻᩷;

    if-nez v1, :cond_6

    const-string v1, "\u1a74\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v10, v1, v17

    mul-int/lit16 v10, v10, -0x33f3

    const v12, 0x377d8f7c

    xor-int/2addr v10, v12

    const v12, -0x687117f3

    goto/16 :goto_f

    :cond_6
    :goto_4
    const-string v1, "\u1a75\u1a79"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v10, v1, v18

    mul-int/lit16 v10, v10, 0x1189

    const v12, -0x61c8a2f2

    xor-int/2addr v10, v12

    const v12, -0x588b3b97

    goto/16 :goto_f

    :sswitch_d
    move/from16 v20, v12

    move/from16 v22, v13

    const/16 v1, 0x38

    const/4 v10, 0x4

    .line 100
    invoke-static {v9, v1, v10, v15}, Ll/֡ۜ;->ۜ᩶ܶ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 101
    invoke-static {v7, v1}, Ll/֨ᩴ;->֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const-string v1, "\u06df\u06d8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v10, v1, v17

    mul-int/lit16 v10, v10, -0x2c79

    const v12, 0x1e71c2e

    xor-int/2addr v10, v12

    const v12, -0x75c8c8b7

    goto/16 :goto_f

    :cond_7
    const-string v1, "\u073d\u1a7b"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x6f

    xor-int v10, v1, v18

    mul-int/lit16 v10, v10, 0x7d59

    const v12, 0x75d40eec

    xor-int/2addr v10, v12

    const v12, -0x4dcf40aa

    goto/16 :goto_f

    :sswitch_e
    move/from16 v20, v12

    move/from16 v22, v13

    .line 100
    sget-object v9, Ll/ۙ᩻᩷;->ۚܶۙ:[S

    sget v1, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v1, :cond_8

    :goto_5
    move/from16 v12, v20

    goto/16 :goto_c

    :cond_8
    const-string v1, "\u0733\u0736"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v10, v1, v17

    mul-int/lit16 v10, v10, 0x15df

    const v12, 0x83179fe

    xor-int/2addr v10, v12

    const v12, -0x23923446

    goto/16 :goto_f

    :sswitch_f
    move/from16 v20, v12

    move/from16 v22, v13

    .line 99
    invoke-static {v4, v2, v5}, Ll/֨ۡ;->᩻ۨܳ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v7

    add-int v1, v5, v3

    .line 100
    invoke-static {v4, v1}, Ll/ۗ᩵;->֫ۧܺ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v8

    .line 143
    sget-boolean v1, Ll/֨۫;->۬᩷᩶:Z

    if-nez v1, :cond_9

    move/from16 v13, v22

    goto/16 :goto_9

    :cond_9
    const-string v1, "\u073f\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v10, v1, v18

    mul-int/lit16 v10, v10, 0x208b

    const v12, -0x78dcd473

    xor-int/2addr v10, v12

    const v12, -0x1a54c543

    goto/16 :goto_f

    :sswitch_10
    move/from16 v20, v12

    move/from16 v22, v13

    .line 91
    invoke-static {v0, v2}, Ll/֫ۡ;->ܰ᩷ܺ(Ljava/lang/Object;I)C

    move-result v1

    const/16 v10, 0x7b

    if-ne v1, v10, :cond_c

    const-string v1, "\u05ab\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x23

    xor-int v10, v1, v17

    mul-int/lit16 v10, v10, 0x27d3

    const v12, -0x1df102d0

    xor-int/2addr v10, v12

    const v12, 0x11fea43f

    goto/16 :goto_f

    :sswitch_11
    move/from16 v20, v12

    move/from16 v22, v13

    const/16 v1, 0x3a

    .line 94
    invoke-static {v4, v1}, Ll/ۗۗ;->᩶۫ۡ(Ljava/lang/Object;I)I

    move-result v5

    const/4 v1, -0x1

    const/4 v6, 0x0

    if-ne v5, v1, :cond_a

    const-string v1, "\u06e0\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v10, v1, v18

    mul-int/lit16 v10, v10, -0x31dd

    const v12, 0x6db3cfcc

    xor-int/2addr v10, v12

    const v12, 0x795ac3f2

    goto/16 :goto_f

    :cond_a
    const-string v1, "\u06e8\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v10, v1, v17

    mul-int/lit16 v10, v10, -0x5e57

    const v12, -0x6268746d

    xor-int/2addr v10, v12

    const v12, -0x1db9a222

    goto/16 :goto_f

    :sswitch_12
    move/from16 v20, v12

    move/from16 v22, v13

    .line 91
    invoke-static/range {p1 .. p1}, Ll/֫ۡ;->᩻ܳܽ(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v10, 0x1

    if-lt v1, v2, :cond_b

    const-string v1, "\u06d8\u1a74"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v2, v1, v18

    mul-int/lit16 v2, v2, -0x189f

    const v12, 0x1f29aaac

    xor-int/2addr v2, v12

    const v12, 0x4723a297

    xor-int/2addr v1, v12

    move/from16 v12, v20

    move/from16 v13, v22

    const/4 v3, 0x1

    move/from16 v20, v1

    move v1, v2

    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_b
    const/4 v2, 0x0

    const/4 v3, 0x1

    :cond_c
    move-object v4, v0

    :goto_6
    const-string v1, "\u073f\u06d6"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v10, v1, v18

    mul-int/lit16 v10, v10, 0x70db

    const v12, -0x3d61e1b6

    xor-int/2addr v10, v12

    const v12, 0x5eaf090a

    goto/16 :goto_f

    :sswitch_13
    move/from16 v20, v12

    move/from16 v22, v13

    const/16 v1, 0x10b2

    const/16 v15, 0x10b2

    goto :goto_7

    :sswitch_14
    move/from16 v20, v12

    move/from16 v22, v13

    const/16 v1, 0x52fa

    const/16 v15, 0x52fa

    :goto_7
    const-string v1, "\u1a78\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x13

    xor-int v10, v1, v17

    mul-int/lit16 v10, v10, 0x16d5

    const v12, -0x686ce0c2

    xor-int/2addr v10, v12

    const v12, 0x388d46c4

    goto/16 :goto_f

    :cond_d
    const-string v1, "\u06ec\u06e1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v10, v1, v17

    mul-int/lit16 v10, v10, 0x269d

    const v12, 0x4fbe423

    xor-int/2addr v10, v12

    const v12, 0x546fc2b4

    goto/16 :goto_f

    :sswitch_15
    move/from16 v20, v12

    move/from16 v22, v13

    const/16 v14, 0x4aa4

    sget v1, Ll/᩹;->ۤܿܳ:I

    if-eqz v1, :cond_e

    :goto_8
    const-string v1, "\u1a78\u06e7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v10, v1, v18

    mul-int/lit16 v10, v10, -0x14d9

    const v12, 0x4b345db3    # 1.1820467E7f

    xor-int/2addr v10, v12

    const v12, 0xf3cb03d

    goto/16 :goto_f

    :cond_e
    const-string v1, "\u06e7\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v10, v1, v18

    mul-int/lit16 v10, v10, -0x3e81

    const v12, 0xb6cd365

    xor-int/2addr v10, v12

    const v12, -0x3c5920d0

    goto/16 :goto_f

    :sswitch_16
    move/from16 v20, v12

    add-int v12, v11, v20

    mul-int v13, v12, v12

    .line 30
    sget v1, Ll/֡۬;->۠֡᩶:I

    if-gtz v1, :cond_f

    :goto_9
    const-string v1, "\u06d9\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x7

    xor-int v10, v1, v18

    mul-int/lit16 v10, v10, -0x21cb

    const v12, 0x4fd5350e    # 7.154048E9f

    xor-int/2addr v10, v12

    const v12, -0x251fc9ff

    goto :goto_a

    :cond_f
    const-string v1, "\u073f\u06e2"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v10, v1, v17

    mul-int/lit16 v10, v10, -0x71b5

    const v12, -0x7dbf2bfe

    xor-int/2addr v10, v12

    const v12, 0x26a9de36

    :goto_a
    xor-int/2addr v1, v12

    move/from16 v12, v20

    goto/16 :goto_10

    :sswitch_17
    move/from16 v22, v13

    aget-short v11, v16, v21

    const/16 v12, 0x12a9

    .line 137
    sget v1, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v1, :cond_10

    goto :goto_c

    :cond_10
    const-string v1, "\u06ec\u0736"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x3

    xor-int v10, v1, v17

    mul-int/lit16 v10, v10, 0x5e3f

    const v13, 0x73af306c

    xor-int/2addr v10, v13

    const v13, 0x438a8fb0

    :goto_b
    xor-int v20, v1, v13

    move v1, v10

    move/from16 v13, v22

    goto/16 :goto_0

    :sswitch_18
    move/from16 v20, v12

    move/from16 v22, v13

    const/16 v21, 0x37

    .line 96
    sget v1, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v1, :cond_11

    goto/16 :goto_5

    :goto_c
    const-string v1, "\u073a\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x71

    xor-int v10, v1, v18

    mul-int/lit16 v10, v10, 0x5dd9

    const v13, -0x53544b66

    xor-int/2addr v10, v13

    const v13, 0x4de54b1

    goto :goto_b

    :cond_11
    const-string v1, "\u06d9\u06ec"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x79

    xor-int v10, v1, v18

    mul-int/lit16 v10, v10, -0x3e0b

    const v12, 0x44068119

    xor-int/2addr v10, v12

    const v12, -0x36dfd7b

    goto :goto_f

    :sswitch_19
    move/from16 v20, v12

    move/from16 v22, v13

    sget-object v16, Ll/ۙ᩻᩷;->ۚܶۙ:[S

    .line 112
    sget v1, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v1, :cond_12

    :goto_d
    const-string v1, "\u1a76\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v10, v1, v18

    mul-int/lit16 v10, v10, 0x4975

    const v12, -0x122931f8

    xor-int/2addr v10, v12

    const v12, -0x3c0ca2bf

    goto :goto_f

    :cond_12
    const-string v1, "\u06df\u1a73"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x7d

    xor-int v10, v1, v17

    mul-int/lit16 v10, v10, 0x7b3d

    const v12, -0x28bb0611

    xor-int/2addr v10, v12

    const v12, 0x66272144

    goto :goto_f

    :sswitch_1a
    move/from16 v20, v12

    move/from16 v22, v13

    sget-boolean v1, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v1, :cond_13

    :goto_e
    const-string v1, "\u073f\u073d"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x7b

    xor-int v10, v1, v17

    mul-int/lit16 v10, v10, -0x2559

    const v12, 0x5747b4f7

    xor-int/2addr v10, v12

    const v12, 0xc3d0900

    goto :goto_f

    :cond_13
    const-string v1, "\u1a79\u1a76"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v10, v1, v18

    mul-int/lit16 v10, v10, 0x2339

    const v12, 0x610bddb1

    xor-int/2addr v10, v12

    const v12, -0x611d103e

    :goto_f
    xor-int/2addr v1, v12

    move/from16 v12, v20

    move/from16 v13, v22

    :goto_10
    move/from16 v20, v1

    :goto_11
    move v1, v10

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b55ca9f -> :sswitch_1
        -0x73ec1ba9 -> :sswitch_3
        -0x7322265e -> :sswitch_7
        -0x6d6b73d2 -> :sswitch_8
        -0x5ff86338 -> :sswitch_14
        -0x59685a6e -> :sswitch_2
        -0x54fd59c4 -> :sswitch_19
        -0x52f20e1f -> :sswitch_15
        -0x49003bdc -> :sswitch_18
        -0x36529721 -> :sswitch_d
        -0x2fb7242d -> :sswitch_e
        -0x277b5b92 -> :sswitch_f
        -0x273c3018 -> :sswitch_9
        -0x21ac0310 -> :sswitch_1a
        -0x2034286b -> :sswitch_13
        -0x1e993096 -> :sswitch_16
        -0x1bdfde4e -> :sswitch_2
        -0x1a4a25b4 -> :sswitch_13
        -0x10151edb -> :sswitch_a
        -0x9ec9fda -> :sswitch_1
        -0x683f3f3 -> :sswitch_b
        -0x4922eba -> :sswitch_a
        0x19324c4 -> :sswitch_9
        0x30507d8 -> :sswitch_c
        0x38a6e9b -> :sswitch_1a
        0x42e1afc -> :sswitch_18
        0x1015cd17 -> :sswitch_5
        0x1c291b12 -> :sswitch_7
        0x2132cfdf -> :sswitch_15
        0x21f9c8cf -> :sswitch_0
        0x25be6bea -> :sswitch_4
        0x28807c0f -> :sswitch_6
        0x298ba199 -> :sswitch_6
        0x2c7d07ad -> :sswitch_14
        0x32832af3 -> :sswitch_0
        0x345fb518 -> :sswitch_17
        0x3adc8db1 -> :sswitch_4
        0x40f64194 -> :sswitch_11
        0x42561c7e -> :sswitch_b
        0x4b271d0f -> :sswitch_10
        0x4cb91911 -> :sswitch_c
        0x4fc538cd -> :sswitch_12
        0x538a1c0b -> :sswitch_8
        0x57c9e58d -> :sswitch_d
        0x5a42c901 -> :sswitch_16
        0x5c24f920 -> :sswitch_5
        0x62a15220 -> :sswitch_e
        0x65fa5c40 -> :sswitch_12
        0x69e26505 -> :sswitch_f
        0x6b4ce89e -> :sswitch_11
        0x70f26757 -> :sswitch_19
        0x72c04ae8 -> :sswitch_10
        0x7422301d -> :sswitch_3
        0x7bde2a35 -> :sswitch_17
    .end sparse-switch
.end method

.method public final hasClipboardText()Z
    .locals 1

    .line 186
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final log(Ljava/lang/String;)V
    .locals 0

    .line 234
    invoke-static {p1}, Ll/ܶܳ᩷;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final log(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 16

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, -0x3495ce66    # -1.5348122E7f

    sget v9, Ll/ۘۘ;->᩷ۙ᩸:I

    sget v10, Ll/֡᩶;->ܳܶ۠:I

    const-string v11, "\u05ab\u06e4"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x53

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x1243

    const v13, -0x74a36e1d

    xor-int/2addr v12, v13

    const v13, -0x79f4c898

    xor-int/2addr v11, v13

    :goto_0
    xor-int/2addr v8, v9

    mul-int/lit16 v8, v8, 0x73ef

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v8, v12

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_0

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    .line 123
    sget-boolean v13, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v13, :cond_c

    goto/16 :goto_6

    .line 18
    :sswitch_0
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v11

    if-lez v11, :cond_1

    :cond_0
    move-object/from16 v11, p1

    move-object/from16 v12, p2

    goto/16 :goto_4

    :cond_1
    move-object/from16 v11, p1

    move-object/from16 v12, p2

    goto/16 :goto_7

    .line 80
    :sswitch_1
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v11

    if-eqz v11, :cond_0

    :goto_1
    move-object/from16 v11, p1

    move-object/from16 v12, p2

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v11

    if-gez v11, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v11, p1

    move-object/from16 v12, p2

    goto/16 :goto_6

    .line 137
    :sswitch_3
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    goto :goto_1

    .line 47
    :sswitch_4
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    return-void

    .line 0
    :sswitch_5
    invoke-static {v5, v6, v7, v4}, Ll/ۗ᩷;->᩷ۖ۠([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    .line 155
    invoke-static {v0, v11, v12}, Ll/ܶܳ᩷;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :sswitch_6
    move-object/from16 v11, p1

    move-object/from16 v12, p2

    .line 0
    sget-object v5, Ll/ۙ᩻᩷;->ۚܶۙ:[S

    const/16 v6, 0x44

    const/16 v7, 0x14

    sget v13, Ll/֡۬;->۠֡᩶:I

    if-gtz v13, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v13, "\u05ab\u06d7"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v9

    mul-int/lit8 v13, v13, 0x21

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, 0x794b

    const v15, 0x42bef793

    xor-int/2addr v14, v15

    const v15, 0x2f31724c

    goto/16 :goto_8

    :sswitch_7
    move-object/from16 v11, p1

    move-object/from16 v12, p2

    const v4, 0xe57a

    goto :goto_2

    :sswitch_8
    move-object/from16 v11, p1

    move-object/from16 v12, p2

    const v4, 0xb329

    :goto_2
    const-string v13, "\u06df\u06d8"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v9

    mul-int/lit8 v13, v13, 0x9

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, -0x59ff

    const v15, -0x6ea7667d    # -1.70867E-28f

    xor-int/2addr v14, v15

    const v15, -0x3d77ccf2

    goto/16 :goto_8

    :sswitch_9
    move-object/from16 v11, p1

    move-object/from16 v12, p2

    const v13, 0x1c48f24

    add-int/2addr v13, v3

    sub-int v13, v2, v13

    if-gtz v13, :cond_4

    const-string v13, "\u06df\u06da"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v10

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, 0x563d

    const v15, -0x388942e9

    xor-int/2addr v14, v15

    const v15, -0x59b1f82

    goto/16 :goto_8

    :cond_4
    const-string v13, "\u06e0\u06e8"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v10, v13

    mul-int/lit8 v13, v13, 0x77

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, -0x7be3

    const v15, -0x14dc047d

    xor-int/2addr v14, v15

    const v15, 0x3aaef8d1

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v11, p1

    move-object/from16 v12, p2

    mul-int/lit16 v2, v1, 0x2a8c

    mul-int v3, v1, v1

    .line 52
    sget v13, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v13, :cond_5

    goto :goto_3

    :cond_5
    const-string v13, "\u06e7\u06df"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v9

    mul-int/lit8 v13, v13, -0x35

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, -0x1f27

    const v15, -0x30e3247c

    xor-int/2addr v14, v15

    const v15, -0x6f9e0cbc

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v11, p1

    move-object/from16 v12, p2

    const/16 v1, 0x43

    aget-short v1, v0, v1

    .line 109
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v13

    if-eqz v13, :cond_6

    :goto_3
    const-string v13, "\u1a79\u1a76"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v9

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, 0x6733

    const v15, 0x69f23892

    xor-int/2addr v14, v15

    const v15, 0x176d7e5b

    goto/16 :goto_8

    :cond_6
    const-string v13, "\u06e7\u06d8"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v9, v13

    mul-int/lit8 v13, v13, -0x65

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, -0x3c3f

    const v15, -0x22626774

    xor-int/2addr v14, v15

    const v15, -0x77b492da

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v11, p1

    move-object/from16 v12, p2

    sget-object v0, Ll/ۙ᩻᩷;->ۚܶۙ:[S

    sget v13, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v13, :cond_7

    goto/16 :goto_7

    :cond_7
    const-string v13, "\u05a8\u06d6"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v10

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, 0x1c5d

    const v15, -0x588a58a3

    xor-int/2addr v14, v15

    const v15, -0x6c8c96e0

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v11, p1

    move-object/from16 v12, p2

    sget v13, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v13, :cond_8

    :goto_4
    const-string v13, "\u06eb\u06d8"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v9

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, -0x41dd

    const v15, 0x5623b486

    xor-int/2addr v14, v15

    const v15, -0x59d0d900

    goto/16 :goto_8

    :cond_8
    const-string v13, "\u1a77\u06eb"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v9, v13

    mul-int/lit8 v13, v13, 0x55

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, -0x112d

    const v15, -0x794a7f4b

    xor-int/2addr v14, v15

    const v15, 0x6bd02cf3

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v11, p1

    move-object/from16 v12, p2

    sget v13, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v13, :cond_9

    :goto_5
    const-string v13, "\u06e4\u05ab"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v10

    mul-int/lit8 v13, v13, -0x1d

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, 0x36b5

    const v15, -0x79f6fce7

    xor-int/2addr v14, v15

    const v15, -0x4ca0c354

    goto/16 :goto_8

    :cond_9
    const-string v13, "\u1a75\u073f"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v10

    mul-int/lit8 v13, v13, -0x4f

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, -0x5867

    const v15, -0x67236715

    xor-int/2addr v14, v15

    const v15, -0x41d8acd4

    goto/16 :goto_8

    :sswitch_f
    move-object/from16 v11, p1

    move-object/from16 v12, p2

    sget v13, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v13, :cond_a

    goto :goto_7

    :cond_a
    const-string v13, "\u1a76\u1a79"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v9, v13

    mul-int/lit8 v13, v13, 0x29

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, -0x4785

    const v15, 0x59b16299

    xor-int/2addr v14, v15

    const v15, -0x3b4679ad

    goto/16 :goto_8

    :sswitch_10
    move-object/from16 v11, p1

    move-object/from16 v12, p2

    sget-boolean v13, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v13, :cond_b

    goto :goto_7

    :cond_b
    const-string v13, "\u06e8\u06e7"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v10

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, -0x68f3

    const v15, 0x243444d1

    xor-int/2addr v14, v15

    const v15, -0x343871a0    # -2.6156224E7f

    goto :goto_8

    :goto_6
    const-string v13, "\u06df\u06e2"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v10

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, 0x133

    const v15, -0xfd3999f

    xor-int/2addr v14, v15

    const v15, -0x3fe0f77e

    goto :goto_8

    :cond_c
    const-string v13, "\u06eb\u06e1"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v10, v13

    mul-int/lit8 v13, v13, -0x3b

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, 0x2ac1

    const v15, 0x4a37f78

    xor-int/2addr v14, v15

    const v15, -0x4a6703e8

    goto :goto_8

    :sswitch_11
    move-object/from16 v11, p1

    move-object/from16 v12, p2

    .line 87
    sget v13, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v13, :cond_d

    :goto_7
    const-string v13, "\u06d8\u06df"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v10

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, 0x4285

    const v15, 0x618e75ed

    xor-int/2addr v14, v15

    const v15, 0x6d4e09eb

    goto :goto_8

    :cond_d
    const-string v13, "\u1a7a\u06eb"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v9

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, 0x60cb

    const v15, 0x3e4d8329

    xor-int/2addr v14, v15

    const v15, -0xa9b7954

    :goto_8
    xor-int/2addr v13, v15

    move v11, v13

    move v12, v14

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x786780e2 -> :sswitch_3
        -0x6e884227 -> :sswitch_f
        -0x6550c3d9 -> :sswitch_3
        -0x5f2b2b1d -> :sswitch_8
        -0x59e74de5 -> :sswitch_1
        -0x55590a2b -> :sswitch_5
        -0x530cde58 -> :sswitch_10
        -0x4c070533 -> :sswitch_10
        -0x43592ac0 -> :sswitch_d
        -0x363ccfb8 -> :sswitch_b
        -0x30292d8d -> :sswitch_9
        -0x1e6c0fdb -> :sswitch_11
        -0x1c160f55 -> :sswitch_0
        -0x16fadded -> :sswitch_5
        -0x12700817 -> :sswitch_e
        -0x6e9c450 -> :sswitch_4
        -0x161514e -> :sswitch_d
        0x955274f -> :sswitch_4
        0xe8cf6d2 -> :sswitch_a
        0x10c91664 -> :sswitch_e
        0x1d760903 -> :sswitch_7
        0x203c01a3 -> :sswitch_7
        0x286b7244 -> :sswitch_8
        0x30566344 -> :sswitch_b
        0x37fe3daa -> :sswitch_1
        0x3aa565e6 -> :sswitch_11
        0x4905d43e -> :sswitch_9
        0x4da4797b -> :sswitch_0
        0x52a83ba0 -> :sswitch_2
        0x5331234c -> :sswitch_f
        0x55c3e51a -> :sswitch_c
        0x5a45b8f8 -> :sswitch_6
        0x5bd09c3e -> :sswitch_c
        0x604e8354 -> :sswitch_2
        0x660aa5cb -> :sswitch_6
        0x6c51fe6c -> :sswitch_a
    .end sparse-switch
.end method

.method public final log(Ljava/lang/Throwable;)V
    .locals 18

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const v11, 0x255d81be

    sget v12, Ll/֡᩶;->ܳܶ۠:I

    sget v13, Ll/ۘۛ;->ۖۚ֡:I

    const-string v14, "\u06e8\u06e0"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, -0x49

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x1515

    const v16, 0x6bf8703a

    xor-int v15, v15, v16

    const v16, 0x3fd9673a

    :goto_0
    xor-int v14, v14, v16

    :goto_1
    xor-int/2addr v11, v13

    mul-int/lit16 v11, v11, 0x2c5d

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    move-object/from16 v14, p1

    move/from16 v16, v7

    sget-object v0, Ll/ۙ᩻᩷;->ۚܶۙ:[S

    .line 133
    sget-boolean v7, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v7, :cond_a

    goto/16 :goto_8

    .line 7
    :sswitch_0
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v14

    if-gtz v14, :cond_0

    goto :goto_2

    :cond_0
    move-object/from16 v14, p1

    move/from16 v16, v7

    goto/16 :goto_9

    .line 85
    :sswitch_1
    sget v14, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v14, :cond_2

    :cond_1
    move-object/from16 v14, p1

    move/from16 v16, v7

    goto/16 :goto_8

    :cond_2
    :goto_2
    const-string v14, "\u06e2\u06e8"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x7879

    const v16, -0x654a5b4

    xor-int v15, v15, v16

    const v16, 0x6c33218d

    goto :goto_0

    .line 149
    :sswitch_2
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v14

    if-nez v14, :cond_1

    :goto_3
    move-object/from16 v14, p1

    goto :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    goto :goto_3

    .line 95
    :sswitch_4
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    return-void

    .line 0
    :sswitch_5
    invoke-static {v8, v9, v10, v7}, Ll/ۙۨ;->֡ᩳ᩵([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    move-object/from16 v14, p1

    .line 163
    invoke-static {v0, v1, v14}, Ll/ܶܳ᩷;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :sswitch_6
    move-object/from16 v14, p1

    sget v15, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v15, :cond_3

    move/from16 v16, v7

    const/16 v10, 0x14

    goto/16 :goto_9

    :cond_3
    const-string v15, "\u06dc\u0733"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    xor-int v10, v15, v13

    mul-int/lit16 v10, v10, 0xee5

    const v17, -0x36e7f36

    xor-int v10, v10, v17

    const v17, 0x1748e221

    xor-int v15, v15, v17

    move v14, v15

    move v15, v10

    const/16 v10, 0x14

    goto/16 :goto_1

    :sswitch_7
    move-object/from16 v14, p1

    .line 0
    sget-object v8, Ll/ۙ᩻᩷;->ۚܶۙ:[S

    const/16 v9, 0x59

    .line 5
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v15

    if-nez v15, :cond_4

    :goto_4
    const-string v15, "\u073a\u06eb"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v13

    mul-int/lit8 v15, v15, 0x1d

    move/from16 v16, v7

    xor-int v7, v15, v12

    mul-int/lit16 v7, v7, -0x2f03

    const v17, 0x857f4f5

    xor-int v7, v7, v17

    const v17, -0x1bd85664

    goto :goto_6

    :cond_4
    move/from16 v16, v7

    const-string v7, "\u05ab\u06d7"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v12

    xor-int v15, v7, v13

    mul-int/lit16 v15, v15, 0x1797

    const v17, -0x658fa19

    xor-int v15, v15, v17

    const v17, -0x4fc6d804

    goto/16 :goto_a

    :sswitch_8
    move-object/from16 v14, p1

    const/16 v7, 0x6e

    goto :goto_5

    :sswitch_9
    move-object/from16 v14, p1

    const/16 v7, 0x5b82

    :goto_5
    const-string v15, "\u06dc\u06dc"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    mul-int/lit8 v15, v15, -0x2f

    move/from16 v16, v7

    xor-int v7, v15, v12

    mul-int/lit16 v7, v7, -0x4aad

    const v17, 0x2be64408

    xor-int v7, v7, v17

    const v17, 0x700e9e6e

    :goto_6
    xor-int v15, v15, v17

    move v14, v15

    move v15, v7

    goto/16 :goto_b

    :sswitch_a
    move-object/from16 v14, p1

    move/from16 v16, v7

    mul-int v7, v6, v6

    sub-int v7, v4, v7

    if-lez v7, :cond_5

    const-string v7, "\u06da\u1a76"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v13

    xor-int v15, v7, v12

    mul-int/lit16 v15, v15, 0x2d1b

    const v17, 0x748709a

    xor-int v15, v15, v17

    const v17, -0x7c4506cf

    goto/16 :goto_a

    :cond_5
    const-string v7, "\u0733\u0733"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v12, v7

    mul-int/lit8 v7, v7, -0x2d

    xor-int v15, v7, v13

    mul-int/lit16 v15, v15, -0x33bf

    const v17, -0x93b80f9

    xor-int v15, v15, v17

    const v17, 0x4640010b

    goto/16 :goto_a

    :sswitch_b
    move-object/from16 v14, p1

    move/from16 v16, v7

    add-int v6, v2, v5

    sget v7, Ll/֡֡;->֫ۤܳ:I

    if-ltz v7, :cond_6

    goto/16 :goto_8

    :cond_6
    const-string v7, "\u0730\u0733"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v13

    xor-int v15, v7, v12

    mul-int/lit16 v15, v15, -0x4f11

    const v17, 0x44741b3d

    xor-int v15, v15, v17

    const v17, -0x303f46be

    goto/16 :goto_a

    :sswitch_c
    move-object/from16 v14, p1

    move/from16 v16, v7

    mul-int v4, v2, v3

    const/16 v5, 0x837

    .line 69
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v7

    if-ltz v7, :cond_7

    goto/16 :goto_7

    :cond_7
    const-string v7, "\u05a1\u1a77"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v12

    xor-int v15, v7, v13

    mul-int/lit16 v15, v15, -0x4605

    const v17, -0x9513e75

    xor-int v15, v15, v17

    const v17, 0x45c1d881

    goto/16 :goto_a

    :sswitch_d
    move-object/from16 v14, p1

    move/from16 v16, v7

    aget-short v2, v0, v1

    const/16 v3, 0x20dc

    .line 113
    sget v7, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v7, :cond_8

    goto :goto_7

    :cond_8
    const-string v7, "\u1a75\u073a"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v13

    xor-int v15, v7, v12

    mul-int/lit16 v15, v15, -0x7383

    const v17, 0x7bee607f

    xor-int v15, v15, v17

    const v17, -0x71eb36b6

    goto/16 :goto_a

    :sswitch_e
    move-object/from16 v14, p1

    move/from16 v16, v7

    const/16 v1, 0x58

    .line 77
    sget v7, Ll/᩺;->ۙۛܶ:I

    if-gtz v7, :cond_9

    goto :goto_7

    :cond_9
    const-string v7, "\u0733\u1a74"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v12

    xor-int v15, v7, v13

    mul-int/lit16 v15, v15, -0x2a9b

    const v17, 0xca8fe7f

    xor-int v15, v15, v17

    const v17, -0x208fe588

    goto/16 :goto_a

    :cond_a
    const-string v7, "\u1a76\u0733"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v13, v7

    mul-int/lit8 v7, v7, 0x69

    xor-int v15, v7, v12

    mul-int/lit16 v15, v15, -0x69df

    const v17, -0x1415ab8

    xor-int v15, v15, v17

    const v17, -0x7335b741

    goto/16 :goto_a

    :sswitch_f
    move-object/from16 v14, p1

    move/from16 v16, v7

    .line 22
    sget v7, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v7, :cond_b

    :goto_7
    const-string v7, "\u1a79\u1a73"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v12

    mul-int/lit8 v7, v7, -0x5b

    xor-int v15, v7, v13

    mul-int/lit16 v15, v15, 0x3d9d

    const v17, 0x5709bc75

    xor-int v15, v15, v17

    const v17, 0x1483e029

    goto/16 :goto_a

    :cond_b
    const-string v7, "\u05a1\u1a79"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v12, v7

    mul-int/lit8 v7, v7, 0x2d

    xor-int v15, v7, v13

    mul-int/lit16 v15, v15, 0x1c7f

    const v17, 0x9278a5

    xor-int v15, v15, v17

    const v17, 0x4433aba3

    goto :goto_a

    :sswitch_10
    move-object/from16 v14, p1

    move/from16 v16, v7

    .line 139
    sget v7, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v7, :cond_c

    :goto_8
    const-string v7, "\u0730\u1a79"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v13

    xor-int v15, v7, v12

    mul-int/lit16 v15, v15, -0x65f5

    const v17, 0x21b1a1be

    xor-int v15, v15, v17

    const v17, -0x10ea1057

    goto :goto_a

    :cond_c
    const-string v7, "\u073d\u06e8"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v13

    xor-int v15, v7, v12

    mul-int/lit16 v15, v15, 0x38eb

    const v17, 0x31453880

    xor-int v15, v15, v17

    const v17, 0x4fb2ae7e

    goto :goto_a

    :sswitch_11
    move-object/from16 v14, p1

    move/from16 v16, v7

    .line 21
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v7

    if-ltz v7, :cond_d

    :goto_9
    const-string v7, "\u06eb\u06e8"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v13

    xor-int v15, v7, v12

    mul-int/lit16 v15, v15, 0x12ed

    const v17, 0x255f54e

    xor-int v15, v15, v17

    const v17, 0x7c5dd29d

    goto :goto_a

    :cond_d
    const-string v7, "\u1a77\u1a76"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v12

    mul-int/lit8 v7, v7, 0x5b

    xor-int v15, v7, v13

    mul-int/lit16 v15, v15, -0x7551

    const v17, 0x31f0ef2a

    xor-int v15, v15, v17

    const v17, -0x7982ac01

    :goto_a
    xor-int v7, v7, v17

    move v14, v7

    :goto_b
    move/from16 v7, v16

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a3ff361 -> :sswitch_d
        -0x7633a1fb -> :sswitch_3
        -0x6be93757 -> :sswitch_9
        -0x5efec8e9 -> :sswitch_e
        -0x5ddbf1e5 -> :sswitch_c
        -0x5b37f966 -> :sswitch_7
        -0x56e6e85c -> :sswitch_a
        -0x5450cdd6 -> :sswitch_d
        -0x4458dd64 -> :sswitch_10
        -0x30c6affe -> :sswitch_2
        -0x2959e09b -> :sswitch_0
        -0x1fafa331 -> :sswitch_4
        -0x1a9ca0f8 -> :sswitch_8
        -0x18efbb4b -> :sswitch_0
        -0x17314536 -> :sswitch_c
        -0x157681ca -> :sswitch_6
        0x1aa2068 -> :sswitch_6
        0x32d3cf7 -> :sswitch_8
        0x14a0abed -> :sswitch_b
        0x1a844725 -> :sswitch_1
        0x1c13a0f8 -> :sswitch_11
        0x1f71ff31 -> :sswitch_b
        0x296b01d0 -> :sswitch_f
        0x30e7432c -> :sswitch_10
        0x32b321f1 -> :sswitch_11
        0x34c827b5 -> :sswitch_3
        0x3683128d -> :sswitch_2
        0x409d0b4d -> :sswitch_1
        0x4290c2a2 -> :sswitch_4
        0x494e6e99 -> :sswitch_9
        0x4df8d6b0 -> :sswitch_5
        0x62ff6da8 -> :sswitch_f
        0x6354b0f1 -> :sswitch_e
        0x6caf48f9 -> :sswitch_a
        0x6e036e1b -> :sswitch_7
        0x7e43fdbe -> :sswitch_5
    .end sparse-switch
.end method

.method public final openBrowser(Ljava/lang/String;)V
    .locals 0

    .line 176
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final openBuiltinBrowser(Ljava/lang/String;Z)V
    .locals 4

    const p1, 0x2eb742ae

    sget p2, Ll/᩺;->ۙۛܶ:I

    sget v0, Ll/ۖ;->᩹۟ۘ:I

    const-string v1, "\u06d7\u06e7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x3ed5

    const v3, -0x24773632

    xor-int/2addr v2, v3

    const v3, -0x32891a0f

    :goto_0
    xor-int/2addr v1, v3

    xor-int/2addr p1, p2

    mul-int/lit16 p1, p1, -0x56d3

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v2

    xor-int/2addr p1, v1

    sparse-switch p1, :sswitch_data_0

    .line 144
    sget-boolean v1, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v1, :cond_3

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    sget v1, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v1, :cond_b

    goto :goto_1

    .line 34
    :sswitch_1
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v1, :cond_6

    goto/16 :goto_2

    .line 70
    :sswitch_2
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    sget v1, Ll/ۘۨ;->۫᩸۠:I

    if-gez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v1, "\u06e7\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    mul-int/lit8 v1, v1, 0x15

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x7a1d

    const v3, -0xc0e5085

    xor-int/2addr v2, v3

    const v3, 0x13ca7d8c

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    goto/16 :goto_2

    .line 84
    :sswitch_4
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    return-void

    .line 181
    :sswitch_5
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    .line 62
    :sswitch_6
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v1

    if-ltz v1, :cond_1

    const-string v1, "\u06d8\u073d"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p2

    mul-int/lit8 v1, v1, 0x43

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x11c5

    const v3, -0x70c41905

    xor-int/2addr v2, v3

    const v3, 0x1c6ddc68

    goto :goto_0

    :cond_1
    const-string v1, "\u06db\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x7c7

    const v3, -0x52fd33bd    # -7.435E-12f

    xor-int/2addr v2, v3

    const v3, -0x68de1c09

    goto :goto_0

    .line 23
    :sswitch_7
    sget v1, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v1, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v1, "\u06e2\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0xd

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x4e11

    const v3, 0x46ee32de

    xor-int/2addr v2, v3

    const v3, 0x72f7731a

    goto/16 :goto_0

    :cond_3
    const-string v1, "\u073f\u06df"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x79

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x4567

    const v3, 0x1c141e35

    xor-int/2addr v2, v3

    const v3, 0x290b9c4e    # 3.0999773E-14f

    goto/16 :goto_0

    .line 104
    :sswitch_8
    sget v1, Ll/᩺;->ۙۛܶ:I

    if-gtz v1, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v1, "\u06e8\u06db"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p2

    mul-int/lit8 v1, v1, -0x4b

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x34f

    const v3, 0xa3dd692

    xor-int/2addr v2, v3

    const v3, -0x2dcb7558

    goto/16 :goto_0

    .line 118
    :sswitch_9
    sget v1, Ll/֨۟;->᩹֫᩷:I

    if-eqz v1, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v1, "\u06db\u06d6"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x143f

    const v3, -0x52679eb

    xor-int/2addr v2, v3

    const v3, -0x25a4cb9c

    goto/16 :goto_0

    .line 152
    :sswitch_a
    sget-boolean v1, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v1, :cond_7

    :cond_6
    const-string v1, "\u073d\u05a8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x43

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x591

    const v3, -0x3ec617a4

    xor-int/2addr v2, v3

    const v3, -0x4b635b10

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u06da\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, 0x4f

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x18f

    const v3, 0x532ca1b9

    xor-int/2addr v2, v3

    const v3, -0x1e0fc957

    goto/16 :goto_0

    .line 6
    :sswitch_b
    sget-boolean v1, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v1, :cond_8

    goto :goto_3

    :cond_8
    const-string v1, "\u073a\u06e4"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x4b

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x383b

    const v3, -0x6e622736

    xor-int/2addr v2, v3

    const v3, 0x1d128cc5

    goto/16 :goto_0

    :sswitch_c
    sget v1, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v1, :cond_9

    goto :goto_3

    :cond_9
    const-string v1, "\u05a8\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x4a01

    const v3, -0x2240111d

    xor-int/2addr v2, v3

    const v3, 0x3d5ee111

    goto/16 :goto_0

    .line 10
    :sswitch_d
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v1

    if-ltz v1, :cond_a

    :goto_2
    const-string v1, "\u06e7\u06d9"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x1ed5

    const v3, -0x6e63f8fd

    xor-int/2addr v2, v3

    const v3, 0x5f44bfde

    goto/16 :goto_0

    :cond_a
    const-string v1, "\u06e1\u073d"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x25

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x5263

    const v3, -0x11492c32

    xor-int/2addr v2, v3

    const v3, 0x40a16eed

    goto/16 :goto_0

    .line 108
    :sswitch_e
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v1

    if-gtz v1, :cond_c

    :cond_b
    :goto_3
    const-string v1, "\u1a74\u06e1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x5759

    const v3, -0x5ae6c510

    xor-int/2addr v2, v3

    const v3, -0x239400d4

    goto/16 :goto_0

    :cond_c
    const-string v1, "\u1a74\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x627

    const v3, -0x2ba0c786

    xor-int/2addr v2, v3

    const v3, -0x712cf8c9

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b94604d -> :sswitch_6
        -0x79ed10d6 -> :sswitch_4
        -0x5d5a867d -> :sswitch_9
        -0x5d3df413 -> :sswitch_5
        -0x4db96958 -> :sswitch_a
        -0x44ccc4dd -> :sswitch_d
        -0x389a00c5 -> :sswitch_d
        -0x3664b785 -> :sswitch_6
        -0x2df22c36 -> :sswitch_1
        -0x29d8f3ed -> :sswitch_c
        -0x2579bb0c -> :sswitch_4
        -0x1d4283d0 -> :sswitch_7
        -0x16743cde -> :sswitch_1
        -0x13e0e8f2 -> :sswitch_e
        -0x12b16cfb -> :sswitch_3
        -0x10471624 -> :sswitch_8
        -0xf7e3d2e -> :sswitch_9
        -0x681b6f6 -> :sswitch_5
        0x6c9e4b0 -> :sswitch_0
        0x8bd517a -> :sswitch_b
        0x1420b327 -> :sswitch_e
        0x41e7820f -> :sswitch_2
        0x4ebc3af9 -> :sswitch_a
        0x55016d37 -> :sswitch_2
        0x6d292114 -> :sswitch_c
        0x6e38273d -> :sswitch_0
        0x6f2c82c4 -> :sswitch_7
        0x787b759c -> :sswitch_3
        0x7ade3e2a -> :sswitch_b
        0x7f9e022b -> :sswitch_8
    .end sparse-switch
.end method

.method public final openLogViewer()V
    .locals 15

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, -0x946db92

    sget v8, Ll/ۘ᩻;->᩵ۜ֨:I

    sget v9, Ll/֫᩵;->ܶ᩻᩷:I

    const-string v10, "\u073f\u1a79"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x6b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x70b1

    const v12, 0x43d0c046

    xor-int/2addr v11, v12

    const v12, -0x63667fb7

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v8

    mul-int/lit16 v7, v7, 0x46c9

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    const v6, 0xdfdc

    goto/16 :goto_2

    .line 455
    :sswitch_0
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    sget v10, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v10, :cond_c

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    sget v10, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-gez v10, :cond_9

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    sget v10, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v10, :cond_5

    goto :goto_1

    .line 27
    :sswitch_3
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    goto :goto_1

    .line 392
    :sswitch_4
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    return-void

    .line 508
    :sswitch_5
    new-instance v10, Ll/ۡ᩸᩷;

    const/4 v11, 0x1

    .line 125
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v12

    if-gtz v12, :cond_0

    goto/16 :goto_4

    .line 508
    :cond_0
    sget-object v12, Ll/ۙ᩻᩷;->ۚܶۙ:[S

    .line 432
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v13

    if-gtz v13, :cond_1

    goto/16 :goto_3

    :cond_1
    const/16 v13, 0x6e

    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v14

    if-eqz v14, :cond_2

    goto :goto_1

    :cond_2
    const/16 v14, 0x14

    .line 508
    invoke-static {v12, v13, v14, v6}, Ll/᩹;->ۡ᩺ᩴ([SIII)Ljava/lang/String;

    move-result-object v12

    .line 151
    sget v13, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v13, :cond_3

    :goto_1
    const-string v10, "\u06db\u0730"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x6d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x7319

    const v12, 0x68a5bfc7

    xor-int/2addr v11, v12

    const v12, -0x1ab52a5e

    goto :goto_0

    .line 508
    :cond_3
    invoke-direct {v10, v12, v11}, Ll/ۡ᩸᩷;-><init>(Ljava/lang/String;I)V

    invoke-static {v10}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :sswitch_6
    const v6, 0xa7d0

    :goto_2
    const-string v10, "\u06e7\u06ec"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x6711

    const v12, -0x2a19d2f

    xor-int/2addr v11, v12

    const v12, -0x5be359da

    goto/16 :goto_0

    :sswitch_7
    mul-int v10, v2, v5

    sub-int/2addr v10, v4

    if-lez v10, :cond_4

    const-string v10, "\u06e8\u1a78"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0xa81

    const v12, -0x7596ebb3

    xor-int/2addr v11, v12

    const v12, -0x59db7d7a

    goto/16 :goto_0

    :cond_4
    const-string v10, "\u06d6\u1a77"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x23

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x741d

    const v12, 0x6f4622ff

    xor-int/2addr v11, v12

    const v12, 0x8060f11

    goto/16 :goto_0

    :sswitch_8
    const v5, 0x8512

    .line 331
    sget v10, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v10, :cond_6

    :cond_5
    :goto_3
    const-string v10, "\u06eb\u06d6"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0xd59

    const v12, -0x58f9fa91

    xor-int/2addr v11, v12

    const v12, -0x141401c7

    goto/16 :goto_0

    :cond_6
    const-string v10, "\u05a1\u1a78"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x2a65

    const v12, 0x423878f8

    xor-int/2addr v11, v12

    const v12, -0x76eee92f

    goto/16 :goto_0

    :sswitch_9
    const v4, 0x114aed51

    add-int/2addr v4, v3

    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v10

    if-eqz v10, :cond_7

    goto :goto_4

    :cond_7
    const-string v10, "\u06d8\u05a1"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x1b

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x3d09

    const v12, -0x65bd111b

    xor-int/2addr v11, v12

    const v12, 0x712f1580

    goto/16 :goto_0

    :sswitch_a
    aget-short v2, v0, v1

    mul-int v3, v2, v2

    .line 302
    sget v10, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v10, :cond_8

    goto :goto_5

    :cond_8
    const-string v10, "\u1a78\u05ab"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x6f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x3cb1

    const v12, 0x2e879050

    xor-int/2addr v11, v12

    const v12, -0x618f261b

    goto/16 :goto_0

    :sswitch_b
    const/16 v1, 0x6d

    .line 165
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v10

    if-eqz v10, :cond_a

    :cond_9
    :goto_4
    const-string v10, "\u05a1\u06db"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x65

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x2787

    const v12, -0x3485951

    xor-int/2addr v11, v12

    const v12, 0x2d3f8990

    goto/16 :goto_0

    :cond_a
    const-string v10, "\u0736\u1a77"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x5

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x5ec7

    const v12, 0x7979f941

    xor-int/2addr v11, v12

    const v12, -0x7ed2176a

    goto/16 :goto_0

    .line 197
    :sswitch_c
    sget v10, Ll/۠;->ܺܺܶ:I

    if-ltz v10, :cond_b

    :goto_5
    const-string v10, "\u0730\u073f"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x35

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x4b05

    const v12, -0x57fcfd5a

    xor-int/2addr v11, v12

    const v12, -0x37243ac0    # -450090.0f

    goto/16 :goto_0

    :cond_b
    const-string v10, "\u06df\u0730"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x3b

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x79f3

    const v12, 0x36ae6455

    xor-int/2addr v11, v12

    const v12, 0x15570cb2

    goto/16 :goto_0

    :sswitch_d
    sget-object v0, Ll/ۙ᩻᩷;->ۚܶۙ:[S

    .line 113
    sget v10, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v10, :cond_d

    :cond_c
    const-string v10, "\u1a7b\u06d8"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x49

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0xcab

    const v12, -0x7eef0b4a

    xor-int/2addr v11, v12

    const v12, -0x54fee58b

    goto/16 :goto_0

    :cond_d
    const-string v10, "\u06e0\u0733"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0xb

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0xc43

    const v12, 0x70e09bad

    xor-int/2addr v11, v12

    const v12, 0x665e5e4e

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6e1111df -> :sswitch_2
        -0x6cb5802b -> :sswitch_3
        -0x6b5bdbf3 -> :sswitch_6
        -0x5ad4902a -> :sswitch_d
        -0x53d08a55 -> :sswitch_c
        -0x2f093dc2 -> :sswitch_0
        -0x20eb12a2 -> :sswitch_c
        -0x2048f5a6 -> :sswitch_3
        -0x2044ae5b -> :sswitch_7
        -0x1fb94ec0 -> :sswitch_1
        -0xde51eab -> :sswitch_9
        -0xd490ac0 -> :sswitch_5
        -0x45db05f -> :sswitch_b
        0x324e9 -> :sswitch_d
        0xb1a4146 -> :sswitch_4
        0xb1d8dc5 -> :sswitch_8
        0x18c78034 -> :sswitch_a
        0x1b2874e9 -> :sswitch_7
        0x1cada2a1 -> :sswitch_2
        0x20bc38aa -> :sswitch_6
        0x39fbd044 -> :sswitch_0
        0x465aa9f6 -> :sswitch_1
        0x4d84e943 -> :sswitch_5
        0x51266685 -> :sswitch_4
        0x5e5c60d6 -> :sswitch_8
        0x751cbb1d -> :sswitch_9
        0x786ce8a4 -> :sswitch_b
        0x7b0208a5 -> :sswitch_a
    .end sparse-switch
.end method

.method public final openPreference(Ljava/lang/Class;)V
    .locals 0

    .line 171
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final setClipboardText(Ljava/lang/CharSequence;)Z
    .locals 0

    .line 197
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final setClipboardText(Ljava/lang/CharSequence;Ljava/lang/String;)Z
    .locals 4

    const p1, 0x587e3ec6

    sget p2, Ll/᩺;->ۙۛܶ:I

    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    const-string v1, "\u06e8\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x11

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x34cd

    const v3, 0x34725f66

    xor-int/2addr v2, v3

    const v3, 0x71c8700

    :goto_0
    xor-int/2addr v1, v3

    xor-int/2addr p1, p2

    mul-int/lit16 p1, p1, -0x18c3

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v2

    xor-int/2addr p1, v1

    sparse-switch p1, :sswitch_data_0

    .line 100
    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v1, :cond_a

    goto/16 :goto_4

    .line 155
    :sswitch_0
    sget v1, Ll/֨᩺;->ۨ֨۬:I

    if-lez v1, :cond_6

    goto :goto_1

    .line 98
    :sswitch_1
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v1

    if-nez v1, :cond_b

    goto :goto_1

    .line 176
    :sswitch_2
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    sget-boolean v1, Ll/֡ۨ;->ܽܶۖ:Z

    if-eqz v1, :cond_9

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    goto :goto_1

    .line 179
    :sswitch_4
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    const/4 p1, 0x0

    return p1

    .line 202
    :sswitch_5
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :sswitch_6
    sget v1, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v1, "\u1a79\u1a74"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x4241

    const v3, 0x1ce2c1b0

    xor-int/2addr v2, v3

    const v3, 0x1872ba24

    goto :goto_0

    .line 141
    :sswitch_7
    sget v1, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v1, :cond_1

    :goto_1
    const-string v1, "\u06ec\u0736"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p2, v1

    mul-int/lit8 v1, v1, 0x17

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x3bad

    const v3, -0x2c176618

    xor-int/2addr v2, v3

    const v3, -0x1eb01eea

    goto :goto_0

    :cond_1
    const-string v1, "\u06d9\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p2, v1

    mul-int/lit8 v1, v1, 0x39

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x30d

    const v3, 0x3ed63912

    xor-int/2addr v2, v3

    const v3, -0x21295482

    goto/16 :goto_0

    :sswitch_8
    sget v1, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v1, :cond_2

    goto :goto_2

    :cond_2
    const-string v1, "\u06d9\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x3777

    const v3, -0x1d520c9d

    xor-int/2addr v2, v3

    const v3, 0x4a84c08c    # 4350022.0f

    goto/16 :goto_0

    .line 116
    :sswitch_9
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v1

    if-gtz v1, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v1, "\u073f\u06da"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x187d

    const v3, -0xb8b6973

    xor-int/2addr v2, v3

    const v3, -0x3f52623

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v1

    if-eqz v1, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v1, "\u05a8\u06d9"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, p2, v1

    mul-int/lit8 v1, v1, -0x2f

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0xce1

    const v3, -0x78831834

    xor-int/2addr v2, v3

    const v3, -0x710e871b

    goto/16 :goto_0

    .line 173
    :sswitch_b
    sget-boolean v1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    const-string v1, "\u06d8\u06e7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x1875

    const v3, -0x753eae32

    xor-int/2addr v2, v3

    const v3, -0x2df75e2

    goto/16 :goto_0

    .line 177
    :sswitch_c
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v1

    if-ltz v1, :cond_7

    :cond_6
    :goto_2
    const-string v1, "\u06da\u1a75"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, -0x5d

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x7275

    const v3, -0x1814ba3c

    xor-int/2addr v2, v3

    const v3, 0x5f87e98d

    goto/16 :goto_0

    :cond_7
    const-string v1, "\u1a76\u1a75"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p2

    mul-int/lit8 v1, v1, 0x3f

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x10d9

    const v3, 0x3f4a61ae

    xor-int/2addr v2, v3

    const v3, 0x27b14242

    goto/16 :goto_0

    .line 70
    :sswitch_d
    sget v1, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v1, :cond_8

    :goto_3
    const-string v1, "\u06e8\u06e2"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x287

    const v3, -0x7ba2d104    # -2.6E-36f

    xor-int/2addr v2, v3

    const v3, -0x77bbb16b

    goto/16 :goto_0

    :cond_8
    const-string v1, "\u1a76\u06db"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0xd

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x6083

    const v3, 0x623aa658

    xor-int/2addr v2, v3

    const v3, -0xd1150b5

    goto/16 :goto_0

    :cond_9
    :goto_4
    const-string v1, "\u073f\u06d9"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, 0x6af9

    const v3, 0x540485b9

    xor-int/2addr v2, v3

    const v3, 0x27865180

    goto/16 :goto_0

    :cond_a
    const-string v1, "\u1a7a\u1a73"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, 0x59

    xor-int v2, v1, p2

    mul-int/lit16 v2, v2, -0x19fd

    const v3, -0x49ac2906

    xor-int/2addr v2, v3

    const v3, 0x5e8afcd4

    goto/16 :goto_0

    .line 17
    :sswitch_e
    sget v1, Ll/۟;->ۗۤۛ:I

    if-eqz v1, :cond_c

    :cond_b
    const-string v1, "\u06d9\u06ec"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x4c77

    const v3, 0x2c9d5550

    xor-int/2addr v2, v3

    const v3, 0x4d00ca5a    # 1.3504656E8f

    goto/16 :goto_0

    :cond_c
    const-string v1, "\u1a73\u1a75"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p2

    mul-int/lit8 v1, v1, 0x9

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x2863

    const v3, -0x7962b18b

    xor-int/2addr v2, v3

    const v3, -0x11d6a258

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7995c90a -> :sswitch_d
        -0x7771ff2f -> :sswitch_3
        -0x6a7da849 -> :sswitch_9
        -0x676c3498 -> :sswitch_e
        -0x4f3e129f -> :sswitch_b
        -0x4efb37d2 -> :sswitch_0
        -0x4886bcec -> :sswitch_5
        -0x42586b74 -> :sswitch_0
        -0x3d3dad43 -> :sswitch_4
        -0x24c586bf -> :sswitch_e
        -0x117886ff -> :sswitch_c
        -0x24d7ab6 -> :sswitch_3
        0x75b5f07 -> :sswitch_a
        0x97947c2 -> :sswitch_7
        0x12548467 -> :sswitch_8
        0x12d4d69b -> :sswitch_6
        0x15c807e8 -> :sswitch_1
        0x218d0072 -> :sswitch_6
        0x230a06dc -> :sswitch_c
        0x337927c9 -> :sswitch_5
        0x35ab7e7d -> :sswitch_1
        0x361e5029 -> :sswitch_4
        0x4cfc0889 -> :sswitch_2
        0x5228e73a -> :sswitch_a
        0x5302888d -> :sswitch_8
        0x54062c4f -> :sswitch_d
        0x641e509c -> :sswitch_b
        0x78e3178a -> :sswitch_2
        0x792d3f22 -> :sswitch_9
        0x7f6728d4 -> :sswitch_7
    .end sparse-switch
.end method

.method public final showToast(Ljava/lang/CharSequence;)V
    .locals 6

    const v0, 0x14663817

    sget v1, Ll/ۘ᩻;->᩵ۜ֨:I

    sget v2, Ll/ۗۗ;->ۨ۬ۖ:I

    const-string v3, "\u06e2\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1449

    const v5, 0x3ceeecf3

    xor-int/2addr v4, v5

    const v5, 0x439fe83e

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x4991

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 148
    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-nez v3, :cond_3

    goto/16 :goto_3

    .line 185
    :sswitch_0
    sget-boolean v3, Ll/ۘۗ;->֡ܽ۫:Z

    if-nez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u05ab\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x677d

    const v5, -0x61266c5c

    xor-int/2addr v4, v5

    const v5, -0x34853feb    # -1.6433173E7f

    goto :goto_0

    .line 6
    :sswitch_1
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    sget v3, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v3, :cond_b

    goto/16 :goto_1

    :sswitch_2
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    return-void

    .line 86
    :sswitch_4
    new-instance v3, Ll/֨ܳ᩷;

    sget-boolean v4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const/4 v0, 0x0

    invoke-direct {v3, v0, p1}, Ll/֨ܳ᩷;-><init>(ILjava/lang/Object;)V

    invoke-static {v3}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 207
    :sswitch_5
    sget-object v3, Ll/ܶܳ᩷;->ܳ:Ll/᩶᩻᩷;

    .line 162
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v3

    if-ltz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u06d6\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0xf

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4d55

    const v5, -0x36bb7d4a

    xor-int/2addr v4, v5

    const v5, 0x3a16b1b3

    goto :goto_0

    .line 164
    :sswitch_6
    sget v3, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v3, :cond_4

    :cond_3
    const-string v3, "\u06e1\u1a73"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x53

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x209d

    const v5, -0x575cc283

    xor-int/2addr v4, v5

    const v5, 0x32c4aa6b

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06df\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x31c9

    const v5, -0x4d83e5b0

    xor-int/2addr v4, v5

    const v5, 0x2739a7d5

    goto/16 :goto_0

    .line 142
    :sswitch_7
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v3

    if-ltz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u0730\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x11

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5cdd

    const v5, 0x6379e3ea

    xor-int/2addr v4, v5

    const v5, -0x2b609c94

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/֨۟;->᩹֫᩷:I

    if-eqz v3, :cond_6

    goto/16 :goto_2

    :cond_6
    const-string v3, "\u1a75\u1a7b"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3393

    const v5, -0x7f7d504d

    xor-int/2addr v4, v5

    const v5, -0x5f33ab42

    goto/16 :goto_0

    .line 123
    :sswitch_9
    sget v3, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u06eb\u05a8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3a15

    const v5, -0x67b57431

    xor-int/2addr v4, v5

    const v5, -0x139baa06

    goto/16 :goto_0

    .line 15
    :sswitch_a
    sget v3, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v3, :cond_8

    goto/16 :goto_3

    :cond_8
    const-string v3, "\u06dc\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x69

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6991

    const v5, 0x15b1ab77

    xor-int/2addr v4, v5

    const v5, 0x4a8a5130    # 4532376.0f

    goto/16 :goto_0

    .line 57
    :sswitch_b
    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_9

    :goto_1
    const-string v3, "\u1a7b\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x75

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4ed

    const v5, -0x2f1abc67

    xor-int/2addr v4, v5

    const v5, 0x6cd2561f

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06db\u1a7a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x73c7

    const v5, -0x29ebf045

    xor-int/2addr v4, v5

    const v5, 0x50e845b2

    goto/16 :goto_0

    .line 102
    :sswitch_c
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v3, :cond_a

    :goto_2
    const-string v3, "\u06dc\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2851

    const v5, 0x6a5a1e49

    xor-int/2addr v4, v5

    const v5, 0x5bf4f75b

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e0\u073a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4687

    const v5, -0x46fd1b48

    xor-int/2addr v4, v5

    const v5, 0x20fc4507

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v3

    if-gtz v3, :cond_c

    :cond_b
    :goto_3
    const-string v3, "\u1a7a\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6b0b

    const v5, -0x550d6e47

    xor-int/2addr v4, v5

    const v5, 0x69953db5

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e7\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1721

    const v5, -0x198fcb46

    xor-int/2addr v4, v5

    const v5, -0x433fb109

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x776344fb -> :sswitch_c
        -0x6b6cccd0 -> :sswitch_7
        -0x69b520b3 -> :sswitch_0
        -0x693cb7e6 -> :sswitch_b
        -0x65579e36 -> :sswitch_3
        -0x634b237b -> :sswitch_2
        -0x474073da -> :sswitch_4
        -0x3ed079f8 -> :sswitch_9
        -0x37145b3b -> :sswitch_0
        -0x33ce0cda -> :sswitch_7
        -0x2de45968 -> :sswitch_5
        -0x2234c27c -> :sswitch_1
        -0xe10c6af -> :sswitch_b
        -0xd9dced -> :sswitch_1
        0x296aa0ba -> :sswitch_c
        0x2ab013c4 -> :sswitch_2
        0x2b65f18b -> :sswitch_4
        0x3f912ee5 -> :sswitch_6
        0x4386fd6a -> :sswitch_d
        0x485a90b5 -> :sswitch_8
        0x5123e8d6 -> :sswitch_8
        0x514d61b0 -> :sswitch_6
        0x5d730e9e -> :sswitch_a
        0x64b48265 -> :sswitch_a
        0x6ba1ce5c -> :sswitch_3
        0x6eaca58f -> :sswitch_9
        0x71aeb085 -> :sswitch_5
        0x77c31d87 -> :sswitch_d
    .end sparse-switch
.end method

.method public final varargs showToast(Ljava/lang/CharSequence;[Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x300868cf

    sget v2, Ll/ۘᩴ;->ܿ۬ܿ:I

    sget v3, Ll/֫᩵;->ܶ᩻᩷:I

    const-string v4, "\u1a77\u06dc"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x38ed

    const v6, -0x675dea75

    xor-int/2addr v5, v6

    const v6, -0x2175ed5f

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x714f

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 204
    sget v4, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v4, :cond_8

    goto/16 :goto_2

    .line 88
    :sswitch_0
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget-boolean v4, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v4, :cond_7

    goto :goto_1

    .line 128
    :sswitch_1
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    const-string v4, "\u1a78\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x578b

    const v6, -0xf0b657

    xor-int/2addr v5, v6

    const v6, -0xaaee348

    goto :goto_0

    .line 33
    :sswitch_2
    sget v4, Ll/۟;->ۗۤۛ:I

    if-nez v4, :cond_1

    goto/16 :goto_4

    :cond_1
    :goto_1
    const-string v4, "\u0733\u05a1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x6b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3743

    const v6, -0x3d8558c4

    xor-int/2addr v5, v6

    const v6, 0x1181a93b

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    goto/16 :goto_4

    .line 69
    :sswitch_4
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    return-void

    .line 213
    :sswitch_5
    sget-object v4, Ll/ܶܳ᩷;->ܳ:Ll/᩶᩻᩷;

    .line 86
    new-instance v4, Ll/֨ܳ᩷;

    const/4 v5, 0x0

    .line 105
    sget v6, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v6, :cond_2

    goto/16 :goto_2

    .line 86
    :cond_2
    invoke-direct {v4, v5, v0}, Ll/֨ܳ᩷;-><init>(ILjava/lang/Object;)V

    invoke-static {v4}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 212
    :sswitch_6
    invoke-static {p1}, Ll/֡֡;->᩻ۗۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Ll/᩶᩻᩷;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 64
    sget-boolean v4, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u073f\u05a8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x1d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5553

    const v6, -0x55f5f283

    xor-int/2addr v5, v6

    const v6, 0x6066442d

    goto/16 :goto_0

    .line 103
    :sswitch_7
    sget v4, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u06d6\u1a78"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x7f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x484b

    const v6, -0x6d5f393b

    xor-int/2addr v5, v6

    const v6, -0x3425a755    # -2.8619094E7f

    goto/16 :goto_0

    .line 23
    :sswitch_8
    sget-boolean v4, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v4, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v4, "\u1a75\u05a8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0xf

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x85b

    const v6, -0x7e0596c4    # -9.19865E-38f

    xor-int/2addr v5, v6

    const v6, -0x3a4d6b6e

    goto/16 :goto_0

    .line 25
    :sswitch_9
    sget v4, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v4, :cond_6

    goto :goto_2

    :cond_6
    const-string v4, "\u0733\u06e0"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x39

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1fd5

    const v6, -0x328e4106

    xor-int/2addr v5, v6

    const v6, -0x31f925ac

    goto/16 :goto_0

    :cond_7
    :goto_2
    const-string v4, "\u1a77\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5a6b

    const v6, -0x6d22c547

    xor-int/2addr v5, v6

    const v6, -0x39f7f4ce

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06e2\u0736"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x7f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x641b

    const v6, 0x3a9ebefd

    xor-int/2addr v5, v6

    const v6, 0x1207d12d

    goto/16 :goto_0

    .line 109
    :sswitch_a
    sget v4, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v4, :cond_9

    goto :goto_4

    :cond_9
    const-string v4, "\u0736\u06e0"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x45d5

    const v6, 0x404cd9b6

    xor-int/2addr v5, v6

    const v6, 0x67e10a1b

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/᩺;->ۙۛܶ:I

    if-gtz v4, :cond_a

    :goto_3
    const-string v4, "\u06d6\u1a7b"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x67e1

    const v6, 0x71e643ee

    xor-int/2addr v5, v6

    const v6, 0x1937fbef

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a78\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6433

    const v6, -0x3ccdde19

    xor-int/2addr v5, v6

    const v6, -0x30640717

    goto/16 :goto_0

    .line 192
    :sswitch_c
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_4

    :cond_b
    const-string v4, "\u05a8\u06e1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xfb5

    const v6, -0x751e247

    xor-int/2addr v5, v6

    const v6, -0x7251b4df

    goto/16 :goto_0

    .line 156
    :sswitch_d
    sget v4, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v4, :cond_c

    :goto_4
    const-string v4, "\u06dc\u06d8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x691d

    const v6, 0x5dd3cc9d

    xor-int/2addr v5, v6

    const v6, 0x410e283a

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u073a\u1a7a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x42d

    const v6, -0x6cb955c8

    xor-int/2addr v5, v6

    const v6, 0x69e524ff

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x77bf4cbd -> :sswitch_d
        -0x66aed34f -> :sswitch_a
        -0x5c644285 -> :sswitch_2
        -0x53f559b7 -> :sswitch_5
        -0x4f783860 -> :sswitch_4
        -0x4b4a9d25 -> :sswitch_5
        -0x3ec87c87 -> :sswitch_b
        -0x39d54af0 -> :sswitch_6
        -0x2b2b73fe -> :sswitch_1
        -0x24989841 -> :sswitch_b
        -0x1c76f76a -> :sswitch_9
        -0xb95418d -> :sswitch_9
        -0xb239433 -> :sswitch_7
        0xd465410 -> :sswitch_c
        0x128f2a09 -> :sswitch_a
        0x17a47cc5 -> :sswitch_4
        0x28bb7014 -> :sswitch_3
        0x293bb718 -> :sswitch_1
        0x29bcc5c2 -> :sswitch_7
        0x3f4f51fc -> :sswitch_c
        0x409bd792 -> :sswitch_2
        0x4f9d9a09 -> :sswitch_0
        0x5072dd38 -> :sswitch_0
        0x5dd00f3d -> :sswitch_8
        0x73d28105 -> :sswitch_d
        0x7aed33b0 -> :sswitch_3
        0x7b90f5bd -> :sswitch_6
        0x7dd408a4 -> :sswitch_8
    .end sparse-switch
.end method

.method public final showToastL(Ljava/lang/CharSequence;)V
    .locals 6

    const v0, -0x474b6c36

    sget v1, Ll/ۘۘ;->᩷ۙ᩸:I

    sget v2, Ll/ۛ;->᩺᩻֫:I

    const-string v3, "\u06e0\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x72d5

    const v5, -0x40b6be40

    xor-int/2addr v4, v5

    const v5, 0x69c07e54

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x71c5

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 47
    sget v3, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v3, :cond_5

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-lez v3, :cond_b

    goto/16 :goto_3

    .line 166
    :sswitch_1
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_3

    goto/16 :goto_3

    .line 155
    :sswitch_2
    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-eqz v3, :cond_9

    goto/16 :goto_2

    .line 38
    :sswitch_3
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    goto/16 :goto_2

    .line 177
    :sswitch_4
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    return-void

    .line 90
    :sswitch_5
    new-instance v3, Ll/۠ܳ᩷;

    .line 195
    sget v4, Ll/֨۟;->᩹֫᩷:I

    if-eqz v4, :cond_0

    goto/16 :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 90
    invoke-direct {v3, v0, p1}, Ll/۠ܳ᩷;-><init>(ILjava/lang/Object;)V

    invoke-static {v3}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 218
    :sswitch_6
    sget-object v3, Ll/ܶܳ᩷;->ܳ:Ll/᩶᩻᩷;

    .line 89
    sget v3, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u1a7b\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6321

    const v5, -0x2ace13c

    xor-int/2addr v4, v5

    const v5, -0x7f15822f

    goto :goto_0

    :sswitch_7
    sget v3, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u06eb\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7437

    const v5, 0x3b35205a

    xor-int/2addr v4, v5

    const v5, -0x544696b2

    goto :goto_0

    :sswitch_8
    sget v3, Ll/֨۟;->᩹֫᩷:I

    if-eqz v3, :cond_4

    :cond_3
    const-string v3, "\u05a8\u06d9"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4447

    const v5, -0x4f03cbc1

    xor-int/2addr v4, v5

    const v5, 0xfc39d43

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u0730\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x11

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1b51

    const v5, -0x74738930

    xor-int/2addr v4, v5

    const v5, 0x2400b599

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a74\u1a7b"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2eff

    const v5, 0x30030418

    xor-int/2addr v4, v5

    const v5, 0x5058f4c8

    goto/16 :goto_0

    .line 193
    :sswitch_9
    sget-boolean v3, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v3, :cond_6

    :goto_1
    const-string v3, "\u06d8\u0730"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0xb

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xdb

    const v5, -0x65e33559

    xor-int/2addr v4, v5

    const v5, -0x7b226a51

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u0736\u06e2"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x5d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2a3b

    const v5, 0x6324679a

    xor-int/2addr v4, v5

    const v5, -0x6edf399f

    goto/16 :goto_0

    .line 134
    :sswitch_a
    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u06e7\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5869

    const v5, -0x459361bc

    xor-int/2addr v4, v5

    const v5, -0x602948b0

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget v3, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v3, :cond_8

    :goto_2
    const-string v3, "\u073a\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x63

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x77b9

    const v5, 0x704301b1

    xor-int/2addr v4, v5

    const v5, -0x1628a04

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06d8\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3e77

    const v5, 0x4a5bed64    # 3603289.0f

    xor-int/2addr v4, v5

    const v5, -0x6a816e2f

    goto/16 :goto_0

    .line 108
    :sswitch_c
    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u06d7\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2019

    const v5, 0x6ae0b6ba

    xor-int/2addr v4, v5

    const v5, 0x289446ce

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06ec\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x427d

    const v5, -0x72847eee

    xor-int/2addr v4, v5

    const v5, 0x37d75ba1

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06d7\u05ab"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2a69

    const v5, 0x1a97f8a4

    xor-int/2addr v4, v5

    const v5, 0x24f4f4a5

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a77\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3a87

    const v5, 0x2db760e8

    xor-int/2addr v4, v5

    const v5, 0x90030d7

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x69086c7b -> :sswitch_0
        -0x62b8afdf -> :sswitch_d
        -0x555735de -> :sswitch_5
        -0x4a45bad6 -> :sswitch_0
        -0x4762a21a -> :sswitch_1
        -0x4237b906 -> :sswitch_4
        -0x3a5c4390 -> :sswitch_3
        -0x2f8c1304 -> :sswitch_1
        -0x2bd78f9a -> :sswitch_4
        -0x29111fff -> :sswitch_9
        -0x90acbd9 -> :sswitch_5
        -0x4bb1561 -> :sswitch_2
        -0x477c56d -> :sswitch_6
        -0x27b3588 -> :sswitch_c
        -0x5a0b16 -> :sswitch_8
        0x18370857 -> :sswitch_d
        0x1b4a2168 -> :sswitch_7
        0x1e43303d -> :sswitch_8
        0x26e321d1 -> :sswitch_3
        0x2a21e8a6 -> :sswitch_b
        0x31d8fece -> :sswitch_b
        0x436e12d3 -> :sswitch_2
        0x4cc8499c -> :sswitch_7
        0x515d52f2 -> :sswitch_a
        0x5f3e75ef -> :sswitch_6
        0x62b8fda8 -> :sswitch_c
        0x72e14bde -> :sswitch_9
        0x7830ede4 -> :sswitch_a
    .end sparse-switch
.end method

.method public final varargs showToastL(Ljava/lang/CharSequence;[Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x32a5e77

    sget v2, Ll/ۘᩴ;->ܿ۬ܿ:I

    sget v3, Ll/֨۬;->۫ۙ᩺:I

    const-string v4, "\u073a\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x47

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4c55

    const v6, 0x10961600

    xor-int/2addr v5, v6

    const v6, -0x67507b46

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x376d

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 126
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    return-void

    :sswitch_0
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-eqz v4, :cond_b

    goto :goto_1

    .line 71
    :sswitch_1
    sget v4, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v4, "\u06df\u05a1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x75

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x75f5

    const v6, -0x35b3ddd8    # -3344522.0f

    xor-int/2addr v5, v6

    const v6, -0x4af078da

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v4

    if-nez v4, :cond_9

    goto/16 :goto_3

    .line 178
    :sswitch_3
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    goto/16 :goto_3

    .line 224
    :sswitch_4
    sget-object v4, Ll/ܶܳ᩷;->ܳ:Ll/᩶᩻᩷;

    .line 90
    new-instance v4, Ll/۠ܳ᩷;

    const/4 v5, 0x0

    .line 191
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v6

    if-gtz v6, :cond_1

    goto :goto_2

    .line 90
    :cond_1
    invoke-direct {v4, v5, v0}, Ll/۠ܳ᩷;-><init>(ILjava/lang/Object;)V

    invoke-static {v4}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 223
    :sswitch_5
    invoke-static {p1}, Ll/֡֡;->᩻ۗۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Ll/᩶᩻᩷;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 19
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    const-string v4, "\u0736\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x75cd

    const v6, -0x59029f55

    xor-int/2addr v5, v6

    const v6, -0x1c58eca2

    goto :goto_0

    .line 0
    :sswitch_6
    sget-boolean v4, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v4, :cond_3

    :goto_2
    const-string v4, "\u06eb\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x75

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x68cd

    const v6, -0x56f55655

    xor-int/2addr v5, v6

    const v6, -0x680ce19b

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u06db\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x711f

    const v6, 0x248346b6

    xor-int/2addr v5, v6

    const v6, 0xc35950c

    goto/16 :goto_0

    .line 57
    :sswitch_7
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v4

    if-ltz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u06e4\u06d9"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x341f

    const v6, 0x42b6caef

    xor-int/2addr v5, v6

    const v6, 0x52c54d5b

    goto/16 :goto_0

    .line 103
    :sswitch_8
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v4

    if-eqz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u06d8\u1a77"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x7

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6307

    const v6, 0x38065037

    xor-int/2addr v5, v6

    const v6, 0x37b4e472

    goto/16 :goto_0

    .line 111
    :sswitch_9
    sget v4, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v4, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v4, "\u06d7\u06eb"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x4d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3a2f

    const v6, -0x33224327

    xor-int/2addr v5, v6

    const v6, -0x634306bb

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/֨۟;->᩹֫᩷:I

    if-eqz v4, :cond_7

    goto :goto_3

    :cond_7
    const-string v4, "\u1a76\u06d7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6521

    const v6, -0x4496de43

    xor-int/2addr v5, v6

    const v6, 0xb5b972b

    goto/16 :goto_0

    .line 55
    :sswitch_b
    sget v4, Ll/᩺;->ۙۛܶ:I

    if-gtz v4, :cond_8

    :goto_3
    const-string v4, "\u0736\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x67

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7fe1

    const v6, 0x1dbda0cb

    xor-int/2addr v5, v6

    const v6, -0x7cf9744a

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06d8\u0730"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5c3d

    const v6, -0x48b76c4d

    xor-int/2addr v5, v6

    const v6, -0x1132f054

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u1a79\u1a79"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3dff

    const v6, 0x5399c0cf

    xor-int/2addr v5, v6

    const v6, -0xaa32925

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u073d\u05a8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x9

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1041

    const v6, -0x4e8ac18a

    xor-int/2addr v5, v6

    const v6, -0x6f56ee48

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u0733\u06e8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x5d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x26ff

    const v6, 0x7d526e73

    xor-int/2addr v5, v6

    const v6, 0x7f2896dc

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06e7\u06ec"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x1d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x55cd

    const v6, 0x39a43f8b

    xor-int/2addr v5, v6

    const v6, -0x31590e7f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7922ae6e -> :sswitch_8
        -0x74017967 -> :sswitch_0
        -0x5d1ef5ed -> :sswitch_0
        -0x4cfc17fa -> :sswitch_c
        -0x4a919070 -> :sswitch_4
        -0x3b08d5f5 -> :sswitch_d
        -0x36c7dee2 -> :sswitch_9
        -0x34273e06 -> :sswitch_8
        -0x1f881d7b -> :sswitch_2
        -0x19b62cc4 -> :sswitch_a
        -0x16e2114d -> :sswitch_3
        -0xc1658a3 -> :sswitch_7
        -0x6c56f7e -> :sswitch_5
        -0x63ef02a -> :sswitch_1
        -0x22461cd -> :sswitch_3
        0x129b109 -> :sswitch_4
        0x1a1b8f7b -> :sswitch_c
        0x20aac76b -> :sswitch_6
        0x23fab22d -> :sswitch_b
        0x2f098850 -> :sswitch_6
        0x49cdef45 -> :sswitch_d
        0x59de7dd2 -> :sswitch_7
        0x5afcd4cc -> :sswitch_5
        0x5d9136ad -> :sswitch_9
        0x5fad7167 -> :sswitch_1
        0x61bed7ca -> :sswitch_2
        0x6ca43f94 -> :sswitch_a
        0x7d3429e9 -> :sswitch_b
    .end sparse-switch
.end method
