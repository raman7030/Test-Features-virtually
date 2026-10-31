.class public final synthetic Ll/᩺ۘ᩷;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/۟ۘ᩷;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/۟ۘ᩷;Ljava/lang/String;)V
    .locals 6

    const v0, -0x3a2447dd

    sget v1, Ll/֡۬;->۠֡᩶:I

    sget v2, Ll/ۗ۬;->ۘܳ᩻:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06d6\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x611f

    const v5, -0x3a5ab59a

    xor-int/2addr v4, v5

    const v5, 0x490f0aeb

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x63f5

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 2
    sget-boolean v3, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v3, :cond_8

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v3

    if-ltz v3, :cond_9

    goto/16 :goto_4

    .line 3
    :sswitch_1
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    if-gez v3, :cond_7

    goto :goto_1

    .line 1
    :sswitch_2
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget-boolean v3, Ll/֫ܺ;->֡ܳ᩸:Z

    if-eqz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v3, "\u1a75\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1c0b

    const v5, 0x7332c09d

    xor-int/2addr v4, v5

    const v5, -0x3fdb3f81

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p2, p0, Ll/᩺ۘ᩷;->᩹:Ljava/lang/String;

    return-void

    :sswitch_6
    sget-boolean v3, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v3, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v3, "\u1a76\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7db1

    const v5, -0x40d1385b

    xor-int/2addr v4, v5

    const v5, 0x6f59a9ff

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v3, "\u06e2\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x65

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5895

    const v5, -0x5df4f258

    xor-int/2addr v4, v5

    const v5, -0x7d3868ea

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    const-string v3, "\u1a74\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x65

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7b8d

    const v5, -0x6cc571c4

    xor-int/2addr v4, v5

    const v5, 0x7128afb2

    goto/16 :goto_0

    .line 4
    :sswitch_9
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v3

    if-gtz v3, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v3, "\u0736\u0733"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xdc3

    const v5, 0x2919a61f

    xor-int/2addr v4, v5

    const v5, -0x57eb5f90

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v3

    if-gtz v3, :cond_5

    goto :goto_3

    :cond_5
    const-string v3, "\u06e4\u1a75"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x461

    const v5, 0x776c4e9

    xor-int/2addr v4, v5

    const v5, -0x5b2d7e64

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget-boolean v3, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v3, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v3, "\u1a75\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x30f

    const v5, -0x5a0647d

    xor-int/2addr v4, v5

    const v5, 0x54ed89b7

    goto/16 :goto_0

    :cond_7
    :goto_2
    const-string v3, "\u05ab\u06e2"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x31

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3707

    const v5, -0x28933d4d

    xor-int/2addr v4, v5

    const v5, 0x7e402f19

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06d9\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x57

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3bd9

    const v5, 0x4d03e6a

    xor-int/2addr v4, v5

    const v5, 0x3d238eb7

    goto/16 :goto_0

    .line 4
    :sswitch_c
    sget-boolean v3, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u1a73\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6f0f

    const v5, 0x6349263

    xor-int/2addr v4, v5

    const v5, -0x4db175a2

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d7\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x29

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1933

    const v5, 0xebf92f8

    xor-int/2addr v4, v5

    const v5, -0x260e9e74

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v3, :cond_b

    :goto_4
    const-string v3, "\u1a7b\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5863

    const v5, -0x5491f169

    xor-int/2addr v4, v5

    const v5, 0x45662dc0

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06d7\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x67

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5923

    const v5, 0x140ea824

    xor-int/2addr v4, v5

    const v5, 0xd04787b

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/᩺ۘ᩷;->᩸:Ll/۟ۘ᩷;

    sget v3, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v3, :cond_c

    :goto_5
    const-string v3, "\u1a78\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x76fb

    const v5, 0x638eafa1

    xor-int/2addr v4, v5

    const v5, 0x347a291d

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a76\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x56e3

    const v5, 0x578454a9

    xor-int/2addr v4, v5

    const v5, 0x758fc6d9

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x742efc13 -> :sswitch_b
        -0x6dc3f3d5 -> :sswitch_2
        -0x55590d8b -> :sswitch_1
        -0x4f00fa34 -> :sswitch_8
        -0x452b200a -> :sswitch_4
        -0x1ecbfe69 -> :sswitch_6
        -0x18f1712b -> :sswitch_6
        -0x147f3b51 -> :sswitch_7
        -0x96fd9a6 -> :sswitch_b
        0x8106f05 -> :sswitch_1
        0xbce92c7 -> :sswitch_c
        0xf346eb0 -> :sswitch_e
        0x149fb09b -> :sswitch_7
        0x16004a06 -> :sswitch_0
        0x18e96e28 -> :sswitch_2
        0x249890d9 -> :sswitch_0
        0x26466c94 -> :sswitch_e
        0x3e296d45 -> :sswitch_d
        0x3f1b6759 -> :sswitch_5
        0x4cd3fe3e -> :sswitch_3
        0x51b29fd5 -> :sswitch_a
        0x57f5d075 -> :sswitch_d
        0x627d1c1f -> :sswitch_c
        0x671c4e69 -> :sswitch_4
        0x6c1f856e -> :sswitch_5
        0x70ef31ed -> :sswitch_9
        0x71ba32f6 -> :sswitch_3
        0x72c24057 -> :sswitch_8
        0x76979f7c -> :sswitch_a
        0x792c6e8c -> :sswitch_9
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    const/4 p1, 0x0

    const p2, 0xd4af243

    sget v0, Ll/֡᩶;->ܳܶ۠:I

    sget v1, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v2, "\u06ec\u06e8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x6b

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x46a1

    const v4, 0x37fc8ba4

    xor-int/2addr v3, v4

    const v4, 0x640bb470

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p2, v0

    mul-int/lit16 p2, p2, -0x4d35

    shr-int/lit8 p2, p2, 0x1f

    and-int/2addr p2, v3

    xor-int/2addr p2, v2

    sparse-switch p2, :sswitch_data_0

    .line 1056
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    sget v2, Ll/ۘۨ;->۫᩸۠:I

    if-gez v2, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v2, "\u06e2\u05ab"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x43

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x5811

    const v4, -0x79b39709

    xor-int/2addr v3, v4

    const v4, 0x39281457

    goto :goto_0

    .line 93
    :sswitch_1
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    sget v2, Ll/֡᩶;->ܳܶ۠:I

    if-lez v2, :cond_7

    goto/16 :goto_2

    :sswitch_2
    sget v2, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v2, :cond_b

    goto/16 :goto_2

    .line 947
    :sswitch_3
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    goto/16 :goto_2

    .line 929
    :sswitch_4
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    return-void

    .line 1735
    :sswitch_5
    iget-object p2, p0, Ll/᩺ۘ᩷;->᩸:Ll/۟ۘ᩷;

    iget-object p2, p2, Ll/۟ۘ᩷;->᩻:Ll/֫᩵᩷;

    invoke-static {p2, p1}, Ll/֫᩵᩷;->ܽ(Ll/֫᩵᩷;Ljava/lang/String;)V

    return-void

    .line 2
    :sswitch_6
    iget-object p1, p0, Ll/᩺ۘ᩷;->᩹:Ljava/lang/String;

    .line 1718
    sget-boolean v2, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    const-string v2, "\u06e2\u06eb"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0x41

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x31c7

    const v4, 0x5c2e7984

    xor-int/2addr v3, v4

    const v4, -0x3f2796c2

    goto :goto_0

    :cond_2
    const-string v2, "\u0736\u05a1"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, -0x1f

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x63f7

    const v4, 0x61ef7712

    xor-int/2addr v3, v4

    const v4, 0x68a1cd47

    goto/16 :goto_0

    .line 403
    :sswitch_7
    sget v2, Ll/᩺;->ۙۛܶ:I

    if-gtz v2, :cond_3

    goto :goto_2

    :cond_3
    const-string v2, "\u06e0\u073f"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0x73

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x6219

    const v4, -0x4626ac13

    xor-int/2addr v3, v4

    const v4, 0x65668d5e

    goto/16 :goto_0

    .line 385
    :sswitch_8
    sget v2, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v2, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v2, "\u06e7\u06ec"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x39

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x5bbf

    const v4, -0x64c6d504

    xor-int/2addr v3, v4

    const v4, -0x46cbfcfc

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v2

    if-ltz v2, :cond_5

    :goto_1
    const-string v2, "\u06ec\u1a75"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x61

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x28a1

    const v4, -0x4a48fc45

    xor-int/2addr v3, v4

    const v4, 0x62b200fa

    goto/16 :goto_0

    :cond_5
    const-string v2, "\u073a\u1a7b"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x5523

    const v4, -0x55e7e82b

    xor-int/2addr v3, v4

    const v4, 0x3993158a

    goto/16 :goto_0

    .line 457
    :sswitch_a
    sget v2, Ll/֡֡;->֫ۤܳ:I

    if-ltz v2, :cond_6

    :goto_2
    const-string v2, "\u06d9\u1a7b"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x37

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x3053

    const v4, -0x6a4056f9

    xor-int/2addr v3, v4

    const v4, 0x71e13a31

    goto/16 :goto_0

    :cond_6
    const-string v2, "\u1a7b\u06e1"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x2eb9

    const v4, 0x1618c86e

    xor-int/2addr v3, v4

    const v4, 0x73c00d5f

    goto/16 :goto_0

    .line 1463
    :sswitch_b
    sget v2, Ll/۠;->ܺܺܶ:I

    if-ltz v2, :cond_8

    :cond_7
    :goto_3
    const-string v2, "\u0736\u06d9"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x6473

    const v4, -0x2d5f339c

    xor-int/2addr v3, v4

    const v4, -0x7081910c

    goto/16 :goto_0

    :cond_8
    const-string v2, "\u06d7\u06e1"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x7281

    const v4, 0x6ea418af

    xor-int/2addr v3, v4

    const v4, -0x646d7d38

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v2

    if-ltz v2, :cond_9

    goto :goto_4

    :cond_9
    const-string v2, "\u06db\u1a77"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0x19

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x505b

    const v4, 0x25523eef

    xor-int/2addr v3, v4

    const v4, 0x6e6638a7

    goto/16 :goto_0

    .line 615
    :sswitch_d
    sget v2, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v2, :cond_a

    goto :goto_4

    :cond_a
    const-string v2, "\u0733\u1a78"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x3601

    const v4, 0x62bd7cb8

    xor-int/2addr v3, v4

    const v4, -0x7d662fa5

    goto/16 :goto_0

    .line 853
    :sswitch_e
    sget-boolean v2, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v2, :cond_c

    :cond_b
    :goto_4
    const-string v2, "\u1a77\u06ec"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, -0x4b

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x3e41

    const v4, 0x5c12974a

    xor-int/2addr v3, v4

    const v4, 0x29b183

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u0736\u06d8"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x131f

    const v4, 0x3ffa7f2

    xor-int/2addr v3, v4

    const v4, 0x4d80bc38    # 2.69977344E8f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x69521c5d -> :sswitch_3
        -0x647bf88c -> :sswitch_5
        -0x57ee78ff -> :sswitch_8
        -0x459cd00e -> :sswitch_b
        -0x35842de1 -> :sswitch_5
        -0x2a31982f -> :sswitch_2
        -0x262e82e7 -> :sswitch_4
        -0x1ddf164d -> :sswitch_9
        -0x17420180 -> :sswitch_1
        -0x13c8e66e -> :sswitch_e
        -0x1129af0a -> :sswitch_2
        -0x623a5a5 -> :sswitch_c
        0xa718708 -> :sswitch_a
        0xcda1048 -> :sswitch_4
        0x137af6d4 -> :sswitch_c
        0x1730b51c -> :sswitch_d
        0x1faa5b4b -> :sswitch_0
        0x2c593ef7 -> :sswitch_6
        0x333918a0 -> :sswitch_d
        0x3d2623ad -> :sswitch_7
        0x3fd7fd15 -> :sswitch_0
        0x453727fb -> :sswitch_9
        0x4892b9dd -> :sswitch_a
        0x4aa9ec71 -> :sswitch_b
        0x5d7c1100 -> :sswitch_7
        0x616e92ee -> :sswitch_e
        0x6323004d -> :sswitch_8
        0x66515f28 -> :sswitch_1
        0x6c0f0bfc -> :sswitch_6
        0x6f35f9e6 -> :sswitch_3
    .end sparse-switch
.end method
