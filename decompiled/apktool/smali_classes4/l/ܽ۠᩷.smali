.class public final synthetic Ll/ܽ۠᩷;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Intent;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ۠᩷;->᩸:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x1bc797af

    sget v2, Ll/ۙۨ;->ۡۗۙ:I

    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    const-string v4, "\u06e4\u06eb"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x59

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5123

    const v6, -0xc0080dc

    xor-int/2addr v5, v6

    const v6, -0x35e59efa

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0xff

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v4, :cond_2

    goto/16 :goto_2

    .line 149
    :sswitch_0
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    sget v4, Ll/֡֡;->֫ۤܳ:I

    if-ltz v4, :cond_8

    goto/16 :goto_1

    .line 1352
    :sswitch_1
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    sget-boolean v4, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v4, :cond_b

    goto/16 :goto_3

    .line 222
    :sswitch_2
    sget v4, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v4, :cond_3

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    invoke-static {}, Ll/۠;->ܿ۠۠()I

    goto/16 :goto_3

    .line 705
    :sswitch_4
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    return-void

    .line 1906
    :sswitch_5
    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴܶܿ;->֫(Landroid/net/Uri;)V

    return-void

    :sswitch_6
    iget-object v0, p0, Ll/ܽ۠᩷;->᩸:Landroid/content/Intent;

    sget v4, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v4, :cond_0

    const-string v4, "\u073f\u0736"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x55

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5069

    const v6, -0x35cf0153

    xor-int/2addr v5, v6

    const v6, 0x5869bf99

    goto :goto_0

    :cond_0
    const-string v4, "\u06e8\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x44db

    const v6, -0x3325e9e5

    xor-int/2addr v5, v6

    const v6, 0x684a683

    goto :goto_0

    .line 1044
    :sswitch_7
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v4

    if-ltz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u05ab\u1a76"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x75

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2d7b

    const v6, 0x30ae0ce1

    xor-int/2addr v5, v6

    const v6, -0x56ca3a26

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u1a7a\u06e1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1e11

    const v6, -0x5858f21a    # -4.636688E-15f

    xor-int/2addr v5, v6

    const v6, 0x58313267

    goto/16 :goto_0

    .line 165
    :sswitch_8
    sget v4, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v4, :cond_4

    :cond_3
    :goto_1
    const-string v4, "\u05a1\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x13

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3a4b

    const v6, 0x2517cef2

    xor-int/2addr v5, v6

    const v6, -0x34fb22b

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u1a77\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xf3

    const v6, -0x28f1a76d

    xor-int/2addr v5, v6

    const v6, 0x279c1f54

    goto/16 :goto_0

    .line 1730
    :sswitch_9
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v4

    if-eqz v4, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v4, "\u06e7\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7a5d

    const v6, 0x60e15246

    xor-int/2addr v5, v6

    const v6, 0x3e46100f

    goto/16 :goto_0

    .line 1614
    :sswitch_a
    sget v4, Ll/֡֡;->֫ۤܳ:I

    if-ltz v4, :cond_6

    goto :goto_2

    :cond_6
    const-string v4, "\u06da\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x25

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x145f

    const v6, -0x112f1ab3

    xor-int/2addr v5, v6

    const v6, 0x3b35e4e8

    goto/16 :goto_0

    .line 167
    :sswitch_b
    sget-boolean v4, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v4, :cond_7

    goto :goto_2

    :cond_7
    const-string v4, "\u06e7\u06d7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1d51

    const v6, 0x211ccc00

    xor-int/2addr v5, v6

    const v6, -0x703a416c

    goto/16 :goto_0

    .line 1099
    :sswitch_c
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v4

    if-gtz v4, :cond_9

    :cond_8
    :goto_2
    const-string v4, "\u06d6\u1a75"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x432d

    const v6, 0x74bbc1bf

    xor-int/2addr v5, v6

    const v6, 0x40a6b407

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06e2\u05a1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x75

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4c3d

    const v6, 0x1cb7350c

    xor-int/2addr v5, v6

    const v6, 0xfda3eb9

    goto/16 :goto_0

    .line 987
    :sswitch_d
    sget v4, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v4, :cond_a

    :goto_3
    const-string v4, "\u1a79\u0730"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x188f

    const v6, -0x2ac08f5b

    xor-int/2addr v5, v6

    const v6, -0x70b1c560

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a79\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x47

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6981

    const v6, 0x9aad028

    xor-int/2addr v5, v6

    const v6, -0x5291334b

    goto/16 :goto_0

    .line 2
    :sswitch_e
    sget v4, Lbin/mt/plus/Main;->ܿܽ:I

    .line 1575
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v4

    if-ltz v4, :cond_c

    :cond_b
    const-string v4, "\u0736\u073f"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7517

    const v6, 0x56b0ed3f

    xor-int/2addr v5, v6

    const v6, 0x5a81f9b

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u073a\u0730"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x69f1

    const v6, -0x28c9c6f3

    xor-int/2addr v5, v6

    const v6, 0x28e58096

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7bbfb4c6 -> :sswitch_0
        -0x78122e75 -> :sswitch_d
        -0x7757e295 -> :sswitch_9
        -0x56733203 -> :sswitch_5
        -0x56092049 -> :sswitch_4
        -0x54251b98 -> :sswitch_1
        -0x49d9e523 -> :sswitch_e
        -0x2dc226ae -> :sswitch_8
        -0x2ce183a1 -> :sswitch_0
        -0x1d0cf6bd -> :sswitch_6
        -0x1a5021d5 -> :sswitch_3
        -0x1764c7dc -> :sswitch_6
        -0x1756aaee -> :sswitch_7
        -0x1051138d -> :sswitch_1
        -0xd85b192 -> :sswitch_4
        -0x102b700 -> :sswitch_3
        0x126b751b -> :sswitch_c
        0x1368523a -> :sswitch_a
        0x13abd590 -> :sswitch_5
        0x18d7fc8b -> :sswitch_d
        0x18fd1200 -> :sswitch_8
        0x1ab485a3 -> :sswitch_2
        0x20cdd46f -> :sswitch_a
        0x23132792 -> :sswitch_2
        0x324135fb -> :sswitch_9
        0x42788557 -> :sswitch_e
        0x435d7672 -> :sswitch_b
        0x58ef87de -> :sswitch_b
        0x6a33fa36 -> :sswitch_c
        0x7e89d700 -> :sswitch_7
    .end sparse-switch
.end method
