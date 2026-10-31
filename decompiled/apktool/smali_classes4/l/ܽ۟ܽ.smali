.class public Ll/ܽ۟ܽ;
.super Landroid/widget/LinearLayout;
.source "VB81"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    const/4 v0, 0x0

    const v1, 0x4b24d86d    # 1.0803309E7f

    sget v2, Ll/֡֡;->֫ۤܳ:I

    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    const/4 v4, 0x0

    .line 17
    invoke-direct {p0, p1, p2, v4}, Ll/ܽ۟ܽ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-string p1, "\u1a79\u1a7b"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x26d

    const v4, -0x5cd04d7

    xor-int/2addr p2, v4

    const v4, -0x883bba7

    :goto_0
    xor-int/2addr p1, v4

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x36d

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr p2, v1

    xor-int v1, p1, p2

    sparse-switch v1, :sswitch_data_0

    .line 13
    sget p1, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz p1, :cond_0

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    sget p1, Ll/ۛ;->᩺᩻֫:I

    if-gez p1, :cond_3

    goto/16 :goto_3

    .line 8
    :sswitch_1
    sget p1, Ll/֨᩺;->ۨ֨۬:I

    if-lez p1, :cond_9

    goto/16 :goto_4

    .line 7
    :sswitch_2
    sget-boolean p1, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz p1, :cond_7

    goto/16 :goto_4

    .line 14
    :sswitch_3
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    goto/16 :goto_4

    .line 12
    :sswitch_4
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 18
    :sswitch_5
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    return-void

    :cond_0
    const-string p1, "\u1a73\u0736"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x2ac7

    const v4, 0x1458fde9

    xor-int/2addr p2, v4

    const v4, -0x1fc4d4f9

    goto :goto_0

    .line 1
    :sswitch_6
    sget p1, Ll/ۘۨ;->۫᩸۠:I

    if-ltz p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u05a1\u06dc"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    mul-int/lit8 p1, p1, 0xf

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x20f3

    const v4, -0x5eb14860

    xor-int/2addr p2, v4

    const v4, 0x4a5c7d5c    # 3612503.0f

    goto :goto_0

    .line 6
    :sswitch_7
    sget p1, Ll/ۗ᩵;->֫۠۟:I

    if-ltz p1, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string p1, "\u073f\u06e2"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x961

    const v4, -0x5fddfb0

    xor-int/2addr p2, v4

    const v4, 0x377af777

    goto/16 :goto_0

    .line 13
    :sswitch_8
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    :goto_1
    const-string p1, "\u06d9\u06da"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x9d5

    const v4, 0x422e3f8f

    xor-int/2addr p2, v4

    const v4, -0x1552c735

    goto/16 :goto_0

    :cond_4
    const-string p1, "\u06dc\u1a78"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v3, p1

    mul-int/lit8 p1, p1, 0x4f

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x3f29

    const v4, -0x4ad2a5d6

    xor-int/2addr p2, v4

    const v4, -0x41cc428b

    goto/16 :goto_0

    .line 6
    :sswitch_9
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result p1

    if-gtz p1, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string p1, "\u1a73\u06d7"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x3273

    const v4, 0x76952d3f

    xor-int/2addr p2, v4

    const v4, -0x1d784f5

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result p1

    if-eqz p1, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string p1, "\u06e2\u05a1"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x4613

    const v4, 0x3de60534

    xor-int/2addr p2, v4

    const v4, 0x49cfc85d

    goto/16 :goto_0

    .line 10
    :sswitch_b
    sget p1, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz p1, :cond_8

    :cond_7
    :goto_2
    const-string p1, "\u06e8\u06e8"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x378b

    const v4, -0x46fec90c

    xor-int/2addr p2, v4

    const v4, -0x37b29556

    goto/16 :goto_0

    :cond_8
    const-string p1, "\u06eb\u06e2"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x5

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x155d

    const v4, 0x707f6db0

    xor-int/2addr p2, v4

    const v4, 0xbb70c5

    goto/16 :goto_0

    .line 16
    :sswitch_c
    sget p1, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz p1, :cond_a

    :cond_9
    :goto_3
    const-string p1, "\u05a1\u1a7a"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v3, p1

    mul-int/lit8 p1, p1, -0x51

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x7671

    const v4, -0x7041a783

    xor-int/2addr p2, v4

    const v4, 0x538a526c

    goto/16 :goto_0

    :cond_a
    const-string p1, "\u1a79\u06d8"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v3

    mul-int/lit8 p1, p1, -0x53

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x2dd9

    const v4, 0x2fdf6352

    xor-int/2addr p2, v4

    const v4, -0x7fe2157c

    goto/16 :goto_0

    .line 11
    :sswitch_d
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result p1

    if-gtz p1, :cond_b

    :goto_4
    const-string p1, "\u1a78\u1a77"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x61

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x71b5

    const v4, -0x2565f3b1

    xor-int/2addr p2, v4

    const v4, -0x2fed93a1

    goto/16 :goto_0

    :cond_b
    const-string p1, "\u073a\u1a79"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x5b

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x60f1

    const v4, -0x4a479dd3

    xor-int/2addr p2, v4

    const v4, -0x26abbd57

    goto/16 :goto_0

    :sswitch_e
    const/16 v0, 0x10

    .line 14
    sget p1, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz p1, :cond_c

    :goto_5
    const-string p1, "\u06e0\u06db"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v3

    mul-int/lit8 p1, p1, -0x35

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x60c7

    const v4, -0x7a653355

    xor-int/2addr p2, v4

    const v4, 0x720d0101

    goto/16 :goto_0

    :cond_c
    const-string p1, "\u06eb\u06df"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v3, p1

    mul-int/lit8 p1, p1, -0x7d

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x75e9

    const v4, -0x5ffa22bc

    xor-int/2addr p2, v4

    const v4, 0x39005468

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b0f2cbf -> :sswitch_3
        -0x5eebe1b4 -> :sswitch_b
        -0x479301c5 -> :sswitch_e
        -0x444eb681 -> :sswitch_d
        -0x3d385712 -> :sswitch_6
        -0x3b48e835 -> :sswitch_9
        -0x380ba8b3 -> :sswitch_0
        -0x3420f241 -> :sswitch_6
        -0x2a2ec629 -> :sswitch_d
        -0x228762af -> :sswitch_1
        -0x1f719669 -> :sswitch_0
        -0xec1cb40 -> :sswitch_a
        -0x25150bf -> :sswitch_5
        0x27e1715 -> :sswitch_8
        0x28e5c84 -> :sswitch_8
        0xb34318b -> :sswitch_4
        0x10130966 -> :sswitch_9
        0x10796a13 -> :sswitch_a
        0x1608fea1 -> :sswitch_1
        0x17ad6dd5 -> :sswitch_c
        0x198c5cb6 -> :sswitch_7
        0x1c9d0d6f -> :sswitch_5
        0x3da975eb -> :sswitch_b
        0x4535b2c3 -> :sswitch_3
        0x57dcead4 -> :sswitch_2
        0x5e75723d -> :sswitch_c
        0x682910a4 -> :sswitch_7
        0x695d4693 -> :sswitch_4
        0x6ecfb2fc -> :sswitch_2
        0x7a070e12 -> :sswitch_e
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    const/4 v0, 0x0

    const v1, 0x7c0cf75a

    sget v2, Ll/֡ܶ;->ᩴܿ᩸:I

    sget v3, Ll/ۘܿ;->ۘܰ۫:I

    .line 22
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-string p1, "\u06e2\u06dc"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x5b

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x63c9

    const p3, 0x4e88e1a4    # 1.14824448E9f

    xor-int/2addr p2, p3

    const p3, -0x776a6c25

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v1, v3

    mul-int/lit16 p3, p3, 0x6f3f

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v1, p1, p2

    sparse-switch v1, :sswitch_data_0

    .line 16
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 15
    :sswitch_0
    sget p1, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz p1, :cond_1

    goto/16 :goto_2

    :sswitch_1
    sget p1, Ll/֡ᩴ;->ܳۤ֫:I

    if-gez p1, :cond_4

    goto/16 :goto_1

    :sswitch_2
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result p1

    if-ltz p1, :cond_b

    goto/16 :goto_1

    .line 20
    :sswitch_3
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    goto/16 :goto_1

    .line 23
    :sswitch_4
    invoke-super {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    return-void

    :sswitch_5
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "\u1a7a\u1a77"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x5f

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x98d

    const p3, -0x7721c0e6

    xor-int/2addr p2, p3

    const p3, 0x51c6e850

    goto :goto_0

    :cond_0
    const-string p1, "\u06e7\u06dc"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x69f5

    const p3, -0x1b1bd37e

    xor-int/2addr p2, p3

    const p3, 0x1a318cfa

    goto :goto_0

    .line 20
    :sswitch_6
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result p1

    if-gtz p1, :cond_2

    :cond_1
    const-string p1, "\u1a7b\u1a74"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x7d

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x21f9

    const p3, 0x6a91c71d

    xor-int/2addr p2, p3

    const p3, -0x1a023817

    goto :goto_0

    :cond_2
    const-string p1, "\u1a79\u06e8"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x21

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x554b

    const p3, -0xa15df1e

    xor-int/2addr p2, p3

    const p3, 0x3ddf8bf9

    goto/16 :goto_0

    .line 6
    :sswitch_7
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result p1

    if-ltz p1, :cond_3

    goto/16 :goto_1

    :cond_3
    const-string p1, "\u06e7\u0730"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v3, p1

    mul-int/lit8 p1, p1, -0xb

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x2337

    const p3, -0x233a0358

    xor-int/2addr p2, p3

    const p3, -0x75e7ad93

    goto/16 :goto_0

    .line 13
    :sswitch_8
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result p1

    if-eqz p1, :cond_5

    :cond_4
    const-string p1, "\u06e7\u05a1"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x6471

    const p3, 0x2882a40d

    xor-int/2addr p2, p3

    const p3, -0xada7604

    goto/16 :goto_0

    :cond_5
    const-string p1, "\u05a8\u06e0"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0xb

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x7f5

    const p3, 0x391b0588

    xor-int/2addr p2, p3

    const p3, 0x5ef1d9e0

    goto/16 :goto_0

    .line 11
    :sswitch_9
    sget p1, Ll/֡۬;->۠֡᩶:I

    if-gtz p1, :cond_6

    goto :goto_1

    :cond_6
    const-string p1, "\u06dc\u06ec"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x3bb1

    const p3, -0x3cb18a2

    xor-int/2addr p2, p3

    const p3, -0x5e8b2368

    goto/16 :goto_0

    .line 13
    :sswitch_a
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result p1

    if-eqz p1, :cond_7

    goto/16 :goto_2

    :cond_7
    const-string p1, "\u06df\u1a7b"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x24ab

    const p3, -0xb98427d

    xor-int/2addr p2, p3

    const p3, 0x5eb42b62

    goto/16 :goto_0

    :sswitch_b
    sget-boolean p1, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez p1, :cond_8

    goto :goto_1

    :cond_8
    const-string p1, "\u06d6\u06d8"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x4d

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x2b65

    const p3, 0x442c6f7

    xor-int/2addr p2, p3

    const p3, -0x1b6240d4

    goto/16 :goto_0

    .line 9
    :sswitch_c
    sget p1, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz p1, :cond_9

    goto :goto_1

    :cond_9
    const-string p1, "\u05ab\u06e1"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v3

    mul-int/lit8 p1, p1, -0x13

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x6169

    const p3, 0x278b3126

    xor-int/2addr p2, p3

    const p3, 0x6b88108b

    goto/16 :goto_0

    .line 22
    :sswitch_d
    sget p1, Ll/᩺;->ۙۛܶ:I

    if-gtz p1, :cond_a

    :goto_1
    const-string p1, "\u1a7a\u1a7b"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x1f

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x4125

    const p3, 0x18418c56

    xor-int/2addr p2, p3

    const p3, 0x397bcc5c

    goto/16 :goto_0

    :cond_a
    const-string p1, "\u1a7b\u06eb"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x22b5

    const p3, 0x37d318d2

    xor-int/2addr p2, p3

    const p3, 0x146f20f3

    goto/16 :goto_0

    :sswitch_e
    const/4 v0, 0x0

    .line 8
    sget p1, Ll/֨۟;->᩹֫᩷:I

    if-eqz p1, :cond_c

    :cond_b
    :goto_2
    const-string p1, "\u06d6\u05a8"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    mul-int/lit8 p1, p1, 0x45

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x3ad9

    const p3, -0x214b3ca2

    xor-int/2addr p2, p3

    const p3, 0x2d1962a9

    goto/16 :goto_0

    :cond_c
    const-string p1, "\u073f\u0733"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x7d

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x5d49

    const p3, 0x4ea7dfc8    # 1.4082304E9f

    xor-int/2addr p2, p3

    const p3, -0x531103f6

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7deece21 -> :sswitch_a
        -0x79894dd9 -> :sswitch_5
        -0x7547f0a3 -> :sswitch_b
        -0x6d95be09 -> :sswitch_4
        -0x63c8f505 -> :sswitch_c
        -0x62d049ae -> :sswitch_0
        -0x588b4f11 -> :sswitch_4
        -0x588329f1 -> :sswitch_d
        -0x51f811ea -> :sswitch_6
        -0x46fa52c4 -> :sswitch_d
        -0x3ce6d57a -> :sswitch_6
        -0x3bf51172 -> :sswitch_8
        -0x29102a3a -> :sswitch_9
        -0x1751a719 -> :sswitch_1
        -0x14d3c412 -> :sswitch_c
        -0x125a66a5 -> :sswitch_3
        -0xef52c5a -> :sswitch_0
        -0x33b3e06 -> :sswitch_7
        -0x27ce424 -> :sswitch_1
        0x1d8b7d7 -> :sswitch_5
        0x6d316df -> :sswitch_a
        0x134544fc -> :sswitch_2
        0x26b7b78a -> :sswitch_e
        0x372daeb2 -> :sswitch_3
        0x3772fba7 -> :sswitch_7
        0x47d84bc8 -> :sswitch_9
        0x69d1c326 -> :sswitch_b
        0x7ce055bf -> :sswitch_e
        0x7d7e43be -> :sswitch_2
        0x7e57510b -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final setOrientation(I)V
    .locals 0

    .line 28
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
