.class public final Ll/ۙ۠᩷;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public ֫:Z

.field public final synthetic ۧ:Lbin/mt/plus/Main;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;)V
    .locals 0

    .line 1312
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ۠᩷;->ۧ:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 6

    const v0, 0x12193b21

    sget v1, Ll/֫ۧ;->ۙ۟ۧ:I

    sget v2, Ll/ۗۗ;->ۨ۬ۖ:I

    const-string v3, "\u05a8\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3603

    const v5, 0x58b7d154

    xor-int/2addr v4, v5

    const v5, -0x2df8e4d8

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x487d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    return-void

    .line 1199
    :sswitch_0
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u06e8\u0730"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1bd9

    const v5, -0x5325a131

    xor-int/2addr v4, v5

    const v5, 0x2279fc5

    goto :goto_0

    .line 447
    :sswitch_1
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    sget v3, Ll/ۗ᩵;->֫۠۟:I

    if-gez v3, :cond_4

    goto/16 :goto_2

    .line 540
    :sswitch_2
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v3

    if-eqz v3, :cond_c

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    goto/16 :goto_2

    .line 27
    :sswitch_4
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    return-void

    :sswitch_5
    const/4 v3, 0x1

    .line 1321
    iput-boolean v3, p0, Ll/ۙ۠᩷;->֫:Z

    goto :goto_1

    .line 1320
    :sswitch_6
    iget-object v3, p0, Ll/ۙ۠᩷;->ۧ:Lbin/mt/plus/Main;

    invoke-static {v3}, Lbin/mt/plus/Main;->᩹(Lbin/mt/plus/Main;)V

    .line 1054
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u073d\u06df"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x18d

    const v5, -0x7e34b695

    xor-int/2addr v4, v5

    const v5, 0x57deef37

    goto :goto_0

    .line 1318
    :sswitch_7
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result v3

    const v4, 0x3f333333    # 0.7f

    cmpg-float v3, v3, v4

    if-gez v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u1a73\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6d8f

    const v5, -0x68713e17

    xor-int/2addr v4, v5

    const v5, 0x680329a1

    goto/16 :goto_0

    :sswitch_8
    iget-boolean v3, p0, Ll/ۙ۠᩷;->֫:Z

    if-nez v3, :cond_3

    const-string v3, "\u0733\u06e2"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x39a3

    const v5, 0x7c9142cf

    xor-int/2addr v4, v5

    const v5, -0x757fdcf0

    goto/16 :goto_0

    :cond_3
    :goto_1
    const-string v3, "\u1a7b\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6a69

    const v5, 0x5b9d76e8

    xor-int/2addr v4, v5

    const v5, -0x5f193ef8

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v3, :cond_5

    :cond_4
    const-string v3, "\u05ab\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6dcf

    const v5, 0x11083477

    xor-int/2addr v4, v5

    const v5, -0x6571c6c0

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a77\u06e2"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4e13

    const v5, -0xd1b2f16

    xor-int/2addr v4, v5

    const v5, 0x5d3768ee

    goto/16 :goto_0

    .line 415
    :sswitch_a
    sget v3, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u06d8\u06e2"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x31

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4e03

    const v5, -0x2da8e5aa

    xor-int/2addr v4, v5

    const v5, 0x57ab5bca

    goto/16 :goto_0

    .line 889
    :sswitch_b
    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v3, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v3, "\u06d9\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x63

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x17b

    const v5, 0x7b921cce

    xor-int/2addr v4, v5

    const v5, -0x5db13884

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v3

    if-ltz v3, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v3, "\u05a1\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4c65

    const v5, 0x6b04b06c

    xor-int/2addr v4, v5

    const v5, 0x62973fcd

    goto/16 :goto_0

    .line 733
    :sswitch_d
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v3

    if-ltz v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u0730\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x237

    const v5, -0x3fc4cef5

    xor-int/2addr v4, v5

    const v5, -0x46b3bdc9

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_3

    :cond_a
    const-string v3, "\u06d7\u06d9"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x71

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7c89

    const v5, 0x30a9544f

    xor-int/2addr v4, v5

    const v5, -0x3d200c96

    goto/16 :goto_0

    .line 1196
    :sswitch_f
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v3

    if-ltz v3, :cond_b

    :goto_2
    const-string v3, "\u06eb\u1a73"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7189

    const v5, -0x41037dca

    xor-int/2addr v4, v5

    const v5, -0x2e4b588

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06df\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2663

    const v5, -0x17e6e67a

    xor-int/2addr v4, v5

    const v5, 0x479f7fb8    # 81663.44f

    goto/16 :goto_0

    :sswitch_10
    sget v3, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v3, :cond_d

    :cond_c
    :goto_3
    const-string v3, "\u1a75\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1207

    const v5, 0x4385f08c

    xor-int/2addr v4, v5

    const v5, -0x3f1aedec

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06d6\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6c3d

    const v5, 0x6da32bfe

    xor-int/2addr v4, v5

    const v5, -0x58f0d1e5

    goto/16 :goto_0

    :sswitch_11
    sget v3, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v3, :cond_e

    :goto_4
    const-string v3, "\u06e2\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5fe9

    const v5, -0x2dc76868

    xor-int/2addr v4, v5

    const v5, 0x4c8de695    # 7.439684E7f

    goto/16 :goto_0

    :cond_e
    const-string v3, "\u06e7\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4b3f

    const v5, -0x5d37be2f

    xor-int/2addr v4, v5

    const v5, 0x477e9022

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79a39675 -> :sswitch_1
        -0x62dd37e6 -> :sswitch_6
        -0x602b1ae6 -> :sswitch_e
        -0x5ea7e93a -> :sswitch_8
        -0x5d032d1e -> :sswitch_5
        -0x5bad34e6 -> :sswitch_c
        -0x590ddb10 -> :sswitch_3
        -0x57e976ce -> :sswitch_8
        -0x52cabb63 -> :sswitch_11
        -0x4bcc11d6 -> :sswitch_2
        -0x4ae98632 -> :sswitch_5
        -0x4a3343ff -> :sswitch_4
        -0x46501fcc -> :sswitch_0
        -0x453bb035 -> :sswitch_c
        -0x2e477920 -> :sswitch_7
        -0x2c59249a -> :sswitch_4
        -0x21b2b700 -> :sswitch_11
        -0x9223f31 -> :sswitch_d
        0x18ff79e -> :sswitch_9
        0xd6084b1 -> :sswitch_7
        0x13b07102 -> :sswitch_3
        0x1419d7a9 -> :sswitch_a
        0x14552d30 -> :sswitch_2
        0x24eb7974 -> :sswitch_b
        0x2c9a237b -> :sswitch_1
        0x31e59987 -> :sswitch_f
        0x3a37d6eb -> :sswitch_d
        0x43d6eb39 -> :sswitch_9
        0x45a07df0 -> :sswitch_6
        0x4c2a96c1 -> :sswitch_b
        0x4f56c696 -> :sswitch_a
        0x58db82c7 -> :sswitch_f
        0x58f64ee3 -> :sswitch_e
        0x60f92083 -> :sswitch_0
        0x69c32cfb -> :sswitch_10
        0x74386a18 -> :sswitch_10
    .end sparse-switch
.end method
