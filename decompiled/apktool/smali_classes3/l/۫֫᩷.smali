.class public final synthetic Ll/۫֫᩷;
.super Ljava/lang/Object;
.source "F2T1"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/֫ۧ᩷;

.field public final synthetic ᩹:Ll/ᩴ᩻᩷;


# direct methods
.method public synthetic constructor <init>(Ll/֫ۧ᩷;Ll/ᩴ᩻᩷;)V
    .locals 6

    const v0, -0x527dfade

    sget v1, Ll/ۘܿ;->ۘܰ۫:I

    sget v2, Ll/ۘۛ;->ۖۚ֡:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e2\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x735

    const v5, -0x63626de1

    xor-int/2addr v4, v5

    const v5, -0x7f443e9f

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x606f

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_0
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v3, :cond_6

    goto/16 :goto_2

    :sswitch_1
    sget v3, Ll/ۗ۬;->ۘܳ᩻:I

    if-lez v3, :cond_3

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_1

    .line 3
    :sswitch_3
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    :goto_1
    const-string v3, "\u06e0\u05a8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x1d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7185

    const v5, -0x50c8d536

    xor-int/2addr v4, v5

    const v5, 0x456b0b8e

    goto :goto_0

    .line 0
    :sswitch_4
    iput-object p2, p0, Ll/۫֫᩷;->᩹:Ll/ᩴ᩻᩷;

    return-void

    .line 2
    :sswitch_5
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u1a79\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x7f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x166b

    const v5, 0x17d48053

    xor-int/2addr v4, v5

    const v5, -0x34403dab    # -2.513425E7f

    goto :goto_0

    .line 3
    :sswitch_6
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v3

    if-gtz v3, :cond_1

    goto :goto_2

    :cond_1
    const-string v3, "\u1a77\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7dc5

    const v5, 0x6cbb096c

    xor-int/2addr v4, v5

    const v5, -0x544696d9

    goto :goto_0

    .line 0
    :sswitch_7
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u05ab\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x54a3

    const v5, -0x76c3f71

    xor-int/2addr v4, v5

    const v5, 0x30aa157c

    goto/16 :goto_0

    .line 4
    :sswitch_8
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v3

    if-gtz v3, :cond_4

    :cond_3
    :goto_2
    const-string v3, "\u06e0\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x63e3

    const v5, -0x3265bdcf

    xor-int/2addr v4, v5

    const v5, 0x7db090e4

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e0\u06e2"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x19cb

    const v5, 0xa4fbd3e    # 1.000228E-32f

    xor-int/2addr v4, v5

    const v5, -0x4c2314ca

    goto/16 :goto_0

    .line 1
    :sswitch_9
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_3

    :cond_5
    const-string v3, "\u1a7b\u06e2"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7761

    const v5, -0x3cc150c1

    xor-int/2addr v4, v5

    const v5, 0x2d9c2825

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v3, :cond_7

    :cond_6
    :goto_3
    const-string v3, "\u06e8\u06df"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x23eb

    const v5, -0x36f9de4b

    xor-int/2addr v4, v5

    const v5, -0xbe6f819

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e0\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x40e3

    const v5, 0x73713cb0

    xor-int/2addr v4, v5

    const v5, -0x4aa1fa32

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v3, :cond_8

    goto :goto_5

    :cond_8
    const-string v3, "\u1a7b\u05a8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x319f

    const v5, -0xd126262

    xor-int/2addr v4, v5

    const v5, -0x1ffc08f4

    goto/16 :goto_0

    .line 0
    :sswitch_c
    sget v3, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v3, :cond_9

    :goto_4
    const-string v3, "\u06d7\u06da"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x3d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x33f

    const v5, -0x77d3dd62    # -5.180006E-34f

    xor-int/2addr v4, v5

    const v5, -0x31737bab

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06da\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5b7

    const v5, -0x4317ad24

    xor-int/2addr v4, v5

    const v5, 0x1b529eec

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֡۬;->۠֡᩶:I

    if-gtz v3, :cond_a

    goto :goto_5

    :cond_a
    const-string v3, "\u06dc\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x107b

    const v5, 0xe09b4af

    xor-int/2addr v4, v5

    const v5, -0x6154a757

    goto/16 :goto_0

    :sswitch_e
    iput-object p1, p0, Ll/۫֫᩷;->᩸:Ll/֫ۧ᩷;

    sget-boolean v3, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u1a79\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x3f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6fdd

    const v5, -0x299d7343

    xor-int/2addr v4, v5

    const v5, 0x272d7463

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d6\u1a73"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0xb

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5629

    const v5, -0x77373c56

    xor-int/2addr v4, v5

    const v5, 0x5606fdf

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79267a9c -> :sswitch_a
        -0x76752c86 -> :sswitch_b
        -0x6dba7d56 -> :sswitch_a
        -0x6985031a -> :sswitch_3
        -0x68365b94 -> :sswitch_4
        -0x66e20d71 -> :sswitch_e
        -0x668390e1 -> :sswitch_c
        -0x44b4a593 -> :sswitch_b
        -0x329ce575 -> :sswitch_5
        -0x30b17c06 -> :sswitch_2
        -0x2b4417ae -> :sswitch_9
        -0x177b74a5 -> :sswitch_5
        -0x161e7253 -> :sswitch_d
        -0xa14a2cc -> :sswitch_2
        -0x9b837ee -> :sswitch_3
        -0x4ff23ae -> :sswitch_0
        0x8e00a46 -> :sswitch_e
        0xc704282 -> :sswitch_8
        0xdc7dea1 -> :sswitch_6
        0x152259cb -> :sswitch_4
        0x1844c0a2 -> :sswitch_1
        0x1e998751 -> :sswitch_c
        0x295e9e81 -> :sswitch_1
        0x2eb5abd9 -> :sswitch_7
        0x33ee2ea9 -> :sswitch_9
        0x3b8726ec -> :sswitch_7
        0x4b465b07 -> :sswitch_8
        0x4c0c63ca -> :sswitch_0
        0x4d8f31f7 -> :sswitch_6
        0x6e2b8c07 -> :sswitch_d
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    const/4 p1, 0x0

    const p2, 0x250a6eb7

    sget v0, Ll/ۗۚ;->ܶۛᩴ:I

    sget v1, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v2, "\u06d7\u1a73"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x56af

    const v4, -0x116ce596

    xor-int/2addr v3, v4

    const v4, -0x22f734fe

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p2, v0

    mul-int/lit16 p2, p2, 0x1d25

    shr-int/lit8 p2, p2, 0x1f

    and-int/2addr p2, v3

    xor-int/2addr p2, v2

    sparse-switch p2, :sswitch_data_0

    .line 46
    sget v2, Ll/᩺;->ۙۛܶ:I

    if-lez v2, :cond_1

    goto/16 :goto_2

    .line 548
    :sswitch_0
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    sget-boolean v2, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v2, :cond_8

    goto :goto_1

    .line 336
    :sswitch_1
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v2

    if-eqz v2, :cond_b

    goto/16 :goto_2

    .line 492
    :sswitch_2
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    goto/16 :goto_2

    .line 428
    :sswitch_3
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    return-void

    .line 747
    :sswitch_4
    new-instance p2, Ll/۟֫᩷;

    iget-object v0, p0, Ll/۫֫᩷;->᩸:Ll/֫ۧ᩷;

    invoke-direct {p2, v0, p1}, Ll/۟֫᩷;-><init>(Ll/֫ۧ᩷;Ljava/lang/String;)V

    .line 776
    invoke-static {p2}, Ll/֨۟;->ۤۘܺ(Ljava/lang/Object;)V

    return-void

    .line 2
    :sswitch_5
    iget-object p1, p0, Ll/۫֫᩷;->᩹:Ll/ᩴ᩻᩷;

    .line 746
    invoke-static {p1}, Ll/ۘ᩶;->᩷ܰۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v2

    if-gtz v2, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v2, "\u05a1\u073f"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, 0x45

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x2a2d

    const v4, 0x17ed2253

    xor-int/2addr v3, v4

    const v4, -0x199b0954

    goto :goto_0

    .line 340
    :sswitch_6
    sget v2, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v2, :cond_2

    :cond_1
    :goto_1
    const-string v2, "\u073a\u1a7b"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x232b

    const v4, -0x314045b1

    xor-int/2addr v3, v4

    const v4, -0x5d1f891b

    goto :goto_0

    :cond_2
    const-string v2, "\u073a\u1a74"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x3

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x75ef

    const v4, 0x40b937a6

    xor-int/2addr v3, v4

    const v4, 0xf02db56

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v2

    if-ltz v2, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v2, "\u1a79\u06db"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, -0x55

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x5041

    const v4, 0x5621d899

    xor-int/2addr v3, v4

    const v4, 0x4bf04310    # 3.1491616E7f

    goto/16 :goto_0

    :sswitch_8
    sget v2, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v2, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v2, "\u0730\u1a77"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x57

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x2359

    const v4, -0x4ac6c406

    xor-int/2addr v3, v4

    const v4, 0x16ee573f

    goto/16 :goto_0

    :sswitch_9
    sget v2, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v2, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v2, "\u1a75\u06df"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, 0x2d

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x29e5

    const v4, -0x205268f

    xor-int/2addr v3, v4

    const v4, 0x21dc8764

    goto/16 :goto_0

    .line 589
    :sswitch_a
    sget v2, Ll/᩹;->ۤܿܳ:I

    if-eqz v2, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v2, "\u073a\u06ec"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x73

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x2e43

    const v4, -0x54a0ff43

    xor-int/2addr v3, v4

    const v4, 0x620d6bdb    # 6.521907E20f

    goto/16 :goto_0

    .line 566
    :sswitch_b
    sget-boolean v2, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v2, :cond_7

    :goto_2
    const-string v2, "\u06db\u06e1"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, -0x59

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x3523

    const v4, 0x7b1907bc

    xor-int/2addr v3, v4

    const v4, -0x29f7916b

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06eb\u1a74"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x737b

    const v4, 0x64671200

    xor-int/2addr v3, v4

    const v4, 0x6c839faf

    goto/16 :goto_0

    :sswitch_c
    sget v2, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v2, :cond_9

    :cond_8
    :goto_3
    const-string v2, "\u1a7a\u1a7b"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, -0x75

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x2bd3

    const v4, -0x7a9b6c7a

    xor-int/2addr v3, v4

    const v4, -0x31ae4443    # -8.7968544E8f

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u073f\u06e2"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x50b9

    const v4, -0xe46758d

    xor-int/2addr v3, v4

    const v4, 0x5b389073

    goto/16 :goto_0

    :sswitch_d
    sget v2, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v2, :cond_a

    :goto_4
    const-string v2, "\u06d8\u06d6"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x2e93

    const v4, -0x3aa05a72

    xor-int/2addr v3, v4

    const v4, -0x3d170bfc

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u06eb\u06dc"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, 0x65

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x515d

    const v4, 0x57f15b83

    xor-int/2addr v3, v4

    const v4, 0x592df820

    goto/16 :goto_0

    .line 378
    :sswitch_e
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v2

    if-eqz v2, :cond_c

    :cond_b
    :goto_5
    const-string v2, "\u05a1\u06e4"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x49

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x32a9

    const v4, 0x40064f87

    xor-int/2addr v3, v4

    const v4, 0x7a8d037a

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u073d\u1a78"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x7f

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x4e09

    const v4, 0x482c9aa8    # 176746.62f

    xor-int/2addr v3, v4

    const v4, -0x5f6c2e69

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7edd194a -> :sswitch_a
        -0x7d3ddb94 -> :sswitch_2
        -0x683134f7 -> :sswitch_3
        -0x66b61d65 -> :sswitch_c
        -0x61e421b7 -> :sswitch_3
        -0x57016a48 -> :sswitch_1
        -0x45656a69 -> :sswitch_7
        -0x45544b5a -> :sswitch_5
        -0x3fe40614 -> :sswitch_d
        -0x35245726 -> :sswitch_b
        -0x2b2b3f72 -> :sswitch_7
        -0x2595077a -> :sswitch_9
        -0x246615d8 -> :sswitch_6
        -0x1af0a6f6 -> :sswitch_8
        -0x15c2382a -> :sswitch_4
        -0x14e0682d -> :sswitch_9
        -0x1288577d -> :sswitch_1
        0x32f7a57 -> :sswitch_8
        0x624e2b8 -> :sswitch_e
        0x8491f89 -> :sswitch_6
        0x2d9864a7 -> :sswitch_d
        0x2f49a70a -> :sswitch_0
        0x41eb3737 -> :sswitch_a
        0x4481c500 -> :sswitch_5
        0x4cebfa54 -> :sswitch_e
        0x4f410594 -> :sswitch_2
        0x5a8d0dd0 -> :sswitch_0
        0x5d6d1fb5 -> :sswitch_c
        0x66da1e75 -> :sswitch_4
        0x67002406 -> :sswitch_b
    .end sparse-switch
.end method
