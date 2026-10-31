.class public final Ll/۟ܺ᩷;
.super Landroid/webkit/WebViewClient;
.source "N15Q"


# instance fields
.field public final synthetic ֫:Ll/ۧۖ᩷;


# direct methods
.method public constructor <init>(Ll/ۧۖ᩷;)V
    .locals 0

    .line 54
    iput-object p1, p0, Ll/۟ܺ᩷;->֫:Ll/ۧۖ᩷;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 4

    const/4 p1, 0x0

    const p2, -0x33ddc008    # -4.2532832E7f

    sget p3, Ll/ۗ۬;->ۘܳ᩻:I

    sget v0, Ll/ۗ᩶;->ۛ֨ۘ:I

    const-string v1, "\u06e1\u1a79"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p3

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x3045

    const v3, 0x6bf9178b

    xor-int/2addr v2, v3

    const v3, 0x5f8a0608

    :goto_0
    xor-int/2addr v1, v3

    xor-int/2addr p2, v0

    mul-int/lit16 p2, p2, -0x19f9

    shr-int/lit8 p2, p2, 0x1f

    and-int/2addr p2, v2

    xor-int/2addr p2, v1

    sparse-switch p2, :sswitch_data_0

    .line 38
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v1, :cond_c

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    sget-boolean v1, Ll/֡ۨ;->ܽܶۖ:Z

    if-eqz v1, :cond_8

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v1

    if-eqz v1, :cond_3

    goto/16 :goto_2

    .line 36
    :sswitch_2
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    goto/16 :goto_2

    .line 46
    :sswitch_3
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    return-void

    .line 64
    :sswitch_4
    invoke-static {p1}, Ll/ۧۖ᩷;->ۧ(Ll/ۧۖ᩷;)Ll/۬۬ܿ;

    move-result-object v1

    invoke-static {v1}, Ll/ۘۨ;->ۙ᩻۠(Ljava/lang/Object;)V

    .line 65
    invoke-static {p1}, Ll/ۧۖ᩷;->ܽ(Ll/ۧۖ᩷;)V

    goto :goto_1

    :sswitch_5
    return-void

    .line 63
    :sswitch_6
    iget-object p1, p0, Ll/۟ܺ᩷;->֫:Ll/ۧۖ᩷;

    invoke-static {p1}, Ll/ۧۖ᩷;->ۧ(Ll/ۧۖ᩷;)Ll/۬۬ܿ;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v1, "\u0733\u05a1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, p3

    mul-int/lit8 v1, v1, 0x1d

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x6bd7

    const v3, 0x20652f9c

    xor-int/2addr v2, v3

    const v3, -0x56e4b6d2

    goto :goto_0

    :cond_0
    :goto_1
    const-string v1, "\u06d8\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, -0x3

    xor-int v2, v1, p3

    mul-int/lit16 v2, v2, -0x49f5

    const v3, -0x246e618c

    xor-int/2addr v2, v3

    const v3, 0x2414fb58

    goto :goto_0

    .line 24
    :sswitch_7
    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v1, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v1, "\u1a74\u1a7b"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v0, v1

    mul-int/lit8 v1, v1, -0x7f

    xor-int v2, v1, p3

    mul-int/lit16 v2, v2, -0x23bb

    const v3, 0x3267f816

    xor-int/2addr v2, v3

    const v3, 0x24ffaf4f

    goto/16 :goto_0

    .line 27
    :sswitch_8
    sget v1, Ll/֡۬;->۠֡᩶:I

    if-gtz v1, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v1, "\u1a77\u1a7a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p3

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0xf2d

    const v3, 0x3f3dd8cf

    xor-int/2addr v2, v3

    const v3, 0x4cb77dd7    # 9.6202424E7f

    goto/16 :goto_0

    .line 13
    :sswitch_9
    sget v1, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v1, :cond_4

    :cond_3
    const-string v1, "\u1a7b\u06db"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, -0x61

    xor-int v2, v1, p3

    mul-int/lit16 v2, v2, 0x724d

    const v3, 0x4b18d671    # 1.0016369E7f

    xor-int/2addr v2, v3

    const v3, -0x7f82952d

    goto/16 :goto_0

    :cond_4
    const-string v1, "\u1a76\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p3

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x304d

    const v3, -0x43488f08

    xor-int/2addr v2, v3

    const v3, 0x535bf81f

    goto/16 :goto_0

    :sswitch_a
    sget v1, Ll/֨۟;->᩹֫᩷:I

    if-eqz v1, :cond_5

    :goto_2
    const-string v1, "\u05a1\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p3

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x1c7

    const v3, -0x7adb7c72

    xor-int/2addr v2, v3

    const v3, 0x72c6a36c

    goto/16 :goto_0

    :cond_5
    const-string v1, "\u06dc\u06e7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p3

    mul-int/lit16 v2, v2, 0x691d

    const v3, 0x3f305588

    xor-int/2addr v2, v3

    const v3, 0x1a26ab5b

    goto/16 :goto_0

    :sswitch_b
    sget v1, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v1, :cond_6

    goto :goto_3

    :cond_6
    const-string v1, "\u1a73\u06dc"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p3

    mul-int/lit16 v2, v2, 0x3dd9

    const v3, -0x1570fddf

    xor-int/2addr v2, v3

    const v3, -0x7ea3d702

    goto/16 :goto_0

    .line 51
    :sswitch_c
    sget v1, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v1, :cond_7

    goto :goto_4

    :cond_7
    const-string v1, "\u1a77\u06dc"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p3

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x1d77

    const v3, -0x502721d6

    xor-int/2addr v2, v3

    const v3, 0x539fc919

    goto/16 :goto_0

    .line 6
    :sswitch_d
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v1

    if-eqz v1, :cond_9

    :cond_8
    :goto_3
    const-string v1, "\u06e2\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p3

    mul-int/lit8 v1, v1, 0x7d

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x2af3

    const v3, 0x4e846189

    xor-int/2addr v2, v3

    const v3, 0x5c6c1384

    goto/16 :goto_0

    :cond_9
    const-string v1, "\u06e2\u06e1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p3

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, 0x2679

    const v3, -0x2569206c

    xor-int/2addr v2, v3

    const v3, 0x52acb351

    goto/16 :goto_0

    .line 48
    :sswitch_e
    sget v1, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v1, :cond_a

    goto :goto_5

    :cond_a
    const-string v1, "\u073f\u05a1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x6b

    xor-int v2, v1, p3

    mul-int/lit16 v2, v2, 0x443d

    const v3, 0x4b7d1ec6    # 1.6588486E7f

    xor-int/2addr v2, v3

    const v3, 0x389c726d

    goto/16 :goto_0

    :sswitch_f
    sget v1, Ll/۠;->ܺܺܶ:I

    if-ltz v1, :cond_b

    :goto_4
    const-string v1, "\u0733\u06ec"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p3

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x3e3b

    const v3, -0x28e165a1

    xor-int/2addr v2, v3

    const v3, -0x2c4a40b9

    goto/16 :goto_0

    :cond_b
    const-string v1, "\u06db\u05a1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v0

    xor-int v2, v1, p3

    mul-int/lit16 v2, v2, 0x7b5d

    const v3, -0x50912ead

    xor-int/2addr v2, v3

    const v3, 0x3ed7c219

    goto/16 :goto_0

    .line 64
    :sswitch_10
    sget v1, Ll/ۛ;->᩺᩻֫:I

    if-ltz v1, :cond_d

    :cond_c
    :goto_5
    const-string v1, "\u1a7a\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x3

    xor-int v2, v1, p3

    mul-int/lit16 v2, v2, -0x293

    const v3, -0x73720135

    xor-int/2addr v2, v3

    const v3, 0x621024e8

    goto/16 :goto_0

    :cond_d
    const-string v1, "\u1a77\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, p3

    xor-int v2, v1, v0

    mul-int/lit16 v2, v2, -0x5497

    const v3, 0x36fb536c

    xor-int/2addr v2, v3

    const v3, 0x2ee9b342

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x76fd59aa -> :sswitch_1
        -0x70bc687a -> :sswitch_f
        -0x644eb47d -> :sswitch_0
        -0x6228f98a -> :sswitch_5
        -0x6114d233 -> :sswitch_8
        -0x5b1e4856 -> :sswitch_0
        -0x4b50c9fd -> :sswitch_2
        -0x34e9f4ec -> :sswitch_3
        -0x31438474 -> :sswitch_7
        -0x2ddf12b1 -> :sswitch_e
        -0x2c1be5db -> :sswitch_b
        -0x203f9a65 -> :sswitch_d
        -0x16942a1b -> :sswitch_1
        -0x92e7a60 -> :sswitch_9
        0x42279a -> :sswitch_e
        0x63dbb2a -> :sswitch_2
        0xc93d07f -> :sswitch_f
        0x1d0e10d5 -> :sswitch_5
        0x1d24698f -> :sswitch_9
        0x349fa10b -> :sswitch_d
        0x3f550b75 -> :sswitch_6
        0x4ec3a630 -> :sswitch_4
        0x4edf5373 -> :sswitch_10
        0x50bf4ebd -> :sswitch_3
        0x5415984f -> :sswitch_a
        0x565e9d26 -> :sswitch_6
        0x6c5cadfd -> :sswitch_c
        0x6da8e747 -> :sswitch_a
        0x6ecd6b5c -> :sswitch_7
        0x70d53706 -> :sswitch_c
        0x71219982 -> :sswitch_8
        0x71e5aa34 -> :sswitch_b
        0x7a3da5ce -> :sswitch_4
        0x7df3b1d8 -> :sswitch_10
    .end sparse-switch
.end method

.method public final shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 6

    const v0, 0x6e97737c

    sget v1, Ll/ۘۛ;->ۖۚ֡:I

    sget v2, Ll/ۨ;->᩺᩷ۚ:I

    const-string v3, "\u06db\u06e2"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x230b

    const v5, -0x30f4c2f1

    xor-int/2addr v4, v5

    const v5, 0x2fe80611

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x7e75

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 35
    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_0

    goto/16 :goto_3

    :sswitch_0
    sget v3, Ll/᩺;->ۙۛܶ:I

    if-lez v3, :cond_a

    goto/16 :goto_2

    .line 39
    :sswitch_1
    sget v3, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v3, :cond_2

    goto/16 :goto_1

    .line 18
    :sswitch_2
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v3, :cond_6

    goto/16 :goto_2

    .line 11
    :sswitch_3
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    goto/16 :goto_2

    .line 45
    :sswitch_4
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    const/4 p1, 0x0

    return p1

    .line 57
    :sswitch_5
    invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const-string v3, "\u0736\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3727

    const v5, 0x9c3e5c4

    xor-int/2addr v4, v5

    const v5, -0x623c200

    goto :goto_0

    :sswitch_6
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u05ab\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3c25

    const v5, 0x6e2cc440

    xor-int/2addr v4, v5

    const v5, 0x6103bf12

    goto :goto_0

    .line 26
    :sswitch_7
    sget v3, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v3, :cond_3

    :cond_2
    const-string v3, "\u06d8\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x71

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x21c9

    const v5, -0x7d06707e

    xor-int/2addr v4, v5

    const v5, -0x727306d3

    goto :goto_0

    :cond_3
    const-string v3, "\u0733\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x666b

    const v5, -0x39b47390

    xor-int/2addr v4, v5

    const v5, 0x21dbc1ad

    goto/16 :goto_0

    .line 38
    :sswitch_8
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v3

    if-ltz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u06e8\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x23c3

    const v5, -0xcd25923

    xor-int/2addr v4, v5

    const v5, 0x2a0e77c4

    goto/16 :goto_0

    .line 25
    :sswitch_9
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v3

    if-ltz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u1a7b\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x56ad

    const v5, -0x3cfdfb23

    xor-int/2addr v4, v5

    const v5, -0x2d1ba937

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v3, :cond_7

    :cond_6
    :goto_1
    const-string v3, "\u06dc\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2225

    const v5, 0x60d5cf52

    xor-int/2addr v4, v5

    const v5, 0x7ef6f026

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e4\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6ec3

    const v5, -0x57968019

    xor-int/2addr v4, v5

    const v5, -0x1cf6a160

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v3

    if-gtz v3, :cond_8

    :goto_2
    const-string v3, "\u06ec\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x525b

    const v5, -0x2d4963c7

    xor-int/2addr v4, v5

    const v5, 0x6fd52ddc

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a75\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1a07

    const v5, -0x6bb00361    # -1.050065E-26f

    xor-int/2addr v4, v5

    const v5, -0xbb92f29

    goto/16 :goto_0

    .line 42
    :sswitch_c
    sget v3, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u05ab\u1a7b"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x39c7

    const v5, -0x1fbb3e66

    xor-int/2addr v4, v5

    const v5, -0x1caa94bf

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-nez v3, :cond_b

    :cond_a
    const-string v3, "\u06df\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x61

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1b3f

    const v5, 0x4e14f1c5    # 6.2471814E8f

    xor-int/2addr v4, v5

    const v5, -0x5e4e6554

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06e4\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2d3d

    const v5, 0x55464912

    xor-int/2addr v4, v5

    const v5, 0x42ac919b

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v3, :cond_c

    :goto_3
    const-string v3, "\u06e4\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x29

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x42f

    const v5, -0x2f8b355d

    xor-int/2addr v4, v5

    const v5, -0x7d1d4f76

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e7\u05a8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x677f

    const v5, -0xa436ee3

    xor-int/2addr v4, v5

    const v5, 0x26606cf1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7a73166c -> :sswitch_b
        -0x7a2f19b0 -> :sswitch_9
        -0x7061c90b -> :sswitch_4
        -0x6a9ba707 -> :sswitch_6
        -0x6187a130 -> :sswitch_d
        -0x59fb93f7 -> :sswitch_0
        -0x59167614 -> :sswitch_1
        -0x5523f362 -> :sswitch_3
        -0x4456018e -> :sswitch_6
        -0x36e7796d -> :sswitch_e
        -0x30228f47 -> :sswitch_8
        -0x22a9a2f9 -> :sswitch_c
        -0x1edba133 -> :sswitch_7
        -0x13afc1c2 -> :sswitch_c
        -0xedb5743 -> :sswitch_3
        -0x6f38535 -> :sswitch_a
        -0x43d05b6 -> :sswitch_e
        -0x42f1c66 -> :sswitch_8
        -0x3a17953 -> :sswitch_1
        0x2dcbedc -> :sswitch_2
        0x5c58414 -> :sswitch_0
        0x90cb84d -> :sswitch_4
        0x206fcc83 -> :sswitch_a
        0x2b770473 -> :sswitch_2
        0x2c7a062b -> :sswitch_9
        0x2df6e33f -> :sswitch_5
        0x3e9ef111 -> :sswitch_b
        0x40b9ffb5 -> :sswitch_d
        0x43875331 -> :sswitch_5
        0x4cd7e3ce -> :sswitch_7
    .end sparse-switch
.end method
