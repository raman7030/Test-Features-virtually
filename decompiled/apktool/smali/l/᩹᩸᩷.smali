.class public final synthetic Ll/᩹᩸᩷;
.super Ljava/lang/Object;
.source "02QQ"

# interfaces
.implements Ll/֫᩹᩵;


# static fields
.field private static final ܺ᩹ۚ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩹᩸᩷;->ܺ᩹ۚ:[S

    return-void

    :array_0
    .array-data 2
        0x11f4s
        -0x304s
        -0x322s
        -0x321s
        -0x322s
        -0x361s
        -0x33bs
        -0x33bs
        -0x329s
    .end array-data
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
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

    const v10, 0x14aa94a9

    sget v11, Ll/֡᩺;->ᩴ᩹ۛ:I

    sget v12, Ll/֡ܶ;->ᩴܿ᩸:I

    const-string v13, "\u06dc\u1a77"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x7479

    const v15, -0x25bf1d12

    xor-int/2addr v14, v15

    const v15, 0x34beb383

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, 0x33cf

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    mul-int v13, v3, v6

    sub-int v13, v5, v13

    if-gez v13, :cond_5

    const-string v13, "\u06dc\u06e8"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x53

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x760d

    const v15, 0x382b7e44

    xor-int/2addr v14, v15

    const v15, -0x64fba1a2

    goto :goto_0

    .line 38
    :sswitch_0
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v13

    if-nez v13, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v13, "\u06e7\u06d6"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x2f

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x327d

    const v15, 0xe0796f2

    xor-int/2addr v14, v15

    const v15, -0x487da7d6

    goto :goto_0

    .line 39
    :sswitch_1
    sget-boolean v13, Ll/֨֫;->᩺ܺ᩸:Z

    if-nez v13, :cond_c

    goto/16 :goto_3

    .line 16
    :sswitch_2
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    sget v13, Ll/֨۬;->۫ۙ᩺:I

    if-lez v13, :cond_3

    goto/16 :goto_3

    .line 34
    :sswitch_3
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/16 v1, 0x8

    .line 71
    invoke-static {v8, v9, v1, v7}, Ll/֨۟;->֡ۚۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0

    :sswitch_6
    const/4 v9, 0x1

    .line 28
    sget v13, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v13, :cond_1

    goto :goto_1

    :cond_1
    const-string v13, "\u06d8\u06db"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x7c3b

    const v15, -0x35a748d3

    xor-int/2addr v14, v15

    const v15, 0x17bca237

    goto/16 :goto_0

    .line 71
    :sswitch_7
    sget-object v8, Ll/᩹᩸᩷;->ܺ᩹ۚ:[S

    .line 4
    sget v13, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v13, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v13, "\u1a79\u1a78"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0xb3b

    const v15, -0x354d156d    # -5862729.5f

    xor-int/2addr v14, v15

    const v15, -0x2f1c2df

    goto/16 :goto_0

    .line 71
    :sswitch_8
    invoke-static {}, Ll/֡ۨ;->۫۠ܿ()Landroid/app/Application;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    .line 27
    sget v13, Ll/֡۬;->۠֡᩶:I

    if-gtz v13, :cond_4

    :cond_3
    :goto_1
    const-string v13, "\u06e8\u1a76"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x5

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x193d

    const v15, -0x34bfd8c

    xor-int/2addr v14, v15

    const v15, 0xbc1fc6c

    goto/16 :goto_0

    :cond_4
    const-string v13, "\u06eb\u06e1"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x5747

    const v15, 0x405f0bf0

    xor-int/2addr v14, v15

    const v15, -0x3e455bc8

    goto/16 :goto_0

    :sswitch_9
    const v7, 0xb700

    goto :goto_2

    :sswitch_a
    const v7, 0xfcb1

    :goto_2
    const-string v13, "\u0736\u06eb"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x4d21

    const v15, 0xa84cbcc

    xor-int/2addr v14, v15

    const v15, 0x5c875e1

    goto/16 :goto_0

    :cond_5
    const-string v13, "\u06d8\u0733"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x35

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x49e3

    const v15, 0x507eb255

    xor-int/2addr v14, v15

    const v15, -0x5a990a04

    goto/16 :goto_0

    :sswitch_b
    const/16 v6, 0x5106

    sget v13, Ll/۠;->ܺܺܶ:I

    if-ltz v13, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v13, "\u06d9\u06df"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x6b

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x4f2d

    const v15, 0x7060e5d4

    xor-int/2addr v14, v15

    const v15, 0xb9e73f5

    goto/16 :goto_0

    :sswitch_c
    const v5, 0x6693309

    add-int/2addr v5, v4

    sget v13, Ll/֡֡;->֫ۤܳ:I

    if-ltz v13, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v13, "\u06e4\u1a7a"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x2b

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x658d

    const v15, 0x7be2f9b8

    xor-int/2addr v14, v15

    const v15, 0x4e1a5e53    # 6.4746822E8f

    goto/16 :goto_0

    :sswitch_d
    aget-short v3, v1, v2

    mul-int v4, v3, v3

    .line 29
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v13

    if-ltz v13, :cond_8

    goto :goto_4

    :cond_8
    const-string v13, "\u06dc\u06dc"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x1d

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x11cf

    const v15, -0x34ca7bbb    # -1.1895877E7f

    xor-int/2addr v14, v15

    const v15, -0x2273345a

    goto/16 :goto_0

    :sswitch_e
    const/4 v2, 0x0

    sget-boolean v13, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v13, :cond_9

    goto :goto_3

    :cond_9
    const-string v13, "\u073d\u0733"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x6245

    const v15, 0x2147538d

    xor-int/2addr v14, v15

    const v15, -0x4b22fec2

    goto/16 :goto_0

    .line 64
    :sswitch_f
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v13

    if-gtz v13, :cond_a

    :goto_3
    const-string v13, "\u073a\u0730"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x2f

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x3ccb

    const v15, 0x4b9c035a    # 2.0448948E7f

    xor-int/2addr v14, v15

    const v15, -0x27f99f53    # -5.9099911E14f

    goto/16 :goto_0

    :cond_a
    const-string v13, "\u06db\u06d8"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x7f71

    const v15, -0x1cf43cde

    xor-int/2addr v14, v15

    const v15, -0x2fa9e3c0

    goto/16 :goto_0

    :sswitch_10
    sget v13, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v13, :cond_b

    :goto_4
    const-string v13, "\u1a75\u06df"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x3453

    const v15, 0x342f10e2

    xor-int/2addr v14, v15

    const v15, -0x3c574581    # -337.457f

    goto/16 :goto_0

    :cond_b
    const-string v13, "\u05a1\u05a1"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x4b

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x10df

    const v15, -0x17f87752

    xor-int/2addr v14, v15

    const v15, -0x16eb701d

    goto/16 :goto_0

    :sswitch_11
    sget-object v1, Ll/᩹᩸᩷;->ܺ᩹ۚ:[S

    sget v13, Ll/֨۟;->᩹֫᩷:I

    if-eqz v13, :cond_d

    :cond_c
    :goto_5
    const-string v13, "\u073f\u06d7"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x37

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x6009

    const v15, -0x54c82b87

    xor-int/2addr v14, v15

    const v15, 0x26c3325e

    goto/16 :goto_0

    :cond_d
    const-string v13, "\u06da\u06d7"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x3091

    const v15, 0x61dacc2c

    xor-int/2addr v14, v15

    const v15, 0x57a6b33c

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x777ac1fe -> :sswitch_10
        -0x6c782703 -> :sswitch_10
        -0x5de9bdb8 -> :sswitch_a
        -0x5073bcad -> :sswitch_3
        -0x4717046b -> :sswitch_9
        -0x450eb97b -> :sswitch_11
        -0x3760d0c9 -> :sswitch_5
        -0x34dd409e -> :sswitch_b
        -0x30463e8b -> :sswitch_6
        -0x302e14f7 -> :sswitch_9
        -0x29790aca -> :sswitch_11
        -0x25143a69 -> :sswitch_8
        -0x23f46cf0 -> :sswitch_0
        -0x238753af -> :sswitch_e
        -0x17f9ea3f -> :sswitch_3
        -0x17edf5e2 -> :sswitch_b
        -0x1d4d770 -> :sswitch_8
        0x738e9f1 -> :sswitch_1
        0x749a16e -> :sswitch_4
        0xf75911e -> :sswitch_e
        0x1c88d776 -> :sswitch_0
        0x1e992f6d -> :sswitch_7
        0x242b8ad4 -> :sswitch_2
        0x24bde665 -> :sswitch_7
        0x2c1a097e -> :sswitch_a
        0x3a92fcb5 -> :sswitch_d
        0x3cae2391 -> :sswitch_c
        0x431f8e36 -> :sswitch_f
        0x496e1820 -> :sswitch_c
        0x4a13bd13 -> :sswitch_2
        0x584c843c -> :sswitch_f
        0x5fff47b5 -> :sswitch_5
        0x6820e684 -> :sswitch_1
        0x6fde1b60 -> :sswitch_d
        0x73426823 -> :sswitch_6
        0x7a8708f4 -> :sswitch_4
    .end sparse-switch
.end method
