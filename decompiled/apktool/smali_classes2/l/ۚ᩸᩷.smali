.class public final synthetic Ll/ۚ᩸᩷;
.super Ljava/lang/Object;
.source "V6YT"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۠᩸᩷;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/۠᩸᩷;I)V
    .locals 6

    const v0, 0x5f875aaa

    sget v1, Ll/֫ۧ;->ۙ۟ۧ:I

    sget v2, Ll/֫ܿ;->ۨ۫ᩳ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a75\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit8 v4, v4, 0x63

    const v5, -0x23c691a8

    xor-int/2addr v4, v5

    const v5, -0xf6c5cae

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x446d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-nez v3, :cond_4

    goto/16 :goto_2

    .line 3
    :sswitch_0
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v3, :cond_6

    goto/16 :goto_2

    .line 2
    :sswitch_1
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v3

    if-eqz v3, :cond_b

    goto/16 :goto_2

    .line 0
    :sswitch_2
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    goto/16 :goto_2

    .line 3
    :sswitch_3
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_4
    iput p2, p0, Ll/ۚ᩸᩷;->᩹:I

    return-void

    :sswitch_5
    sget v3, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v3, :cond_0

    const-string v3, "\u06e8\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7269

    const v5, -0x64ce6218

    xor-int/2addr v4, v5

    const v5, 0x210a170e

    goto :goto_0

    :cond_0
    const-string v3, "\u0730\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x8af

    const v5, 0x7adfd810

    xor-int/2addr v4, v5

    const v5, 0x4becef29    # 3.1055442E7f

    goto :goto_0

    :sswitch_6
    sget-boolean v3, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u073a\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x55cb

    const v5, 0x77ef1a5b

    xor-int/2addr v4, v5

    const v5, 0x1b1baa4e

    goto :goto_0

    .line 2
    :sswitch_7
    sget v3, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u06df\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x3d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2a35

    const v5, 0x2229b8de

    xor-int/2addr v4, v5

    const v5, -0x4bdc6a5a    # -1.5235E-7f

    goto/16 :goto_0

    .line 1
    :sswitch_8
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u06d7\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7177

    const v5, 0x28b38eab

    xor-int/2addr v4, v5

    const v5, -0x26624e46

    goto/16 :goto_0

    .line 4
    :sswitch_9
    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v3, :cond_5

    :cond_4
    const-string v3, "\u06d9\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x66a5

    const v5, -0x354bdf88    # -5902396.0f

    xor-int/2addr v4, v5

    const v5, -0x1c42cefd

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u073f\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x13c7

    const v5, 0x32d3e5a9

    xor-int/2addr v4, v5

    const v5, -0xb311157

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_6
    :goto_1
    const-string v3, "\u06e4\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6a41

    const v5, -0x1a5afa1f

    xor-int/2addr v4, v5

    const v5, -0x5bd7545a

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u0736\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7e2b

    const v5, -0x92b588c

    xor-int/2addr v4, v5

    const v5, 0x3ca40097

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v3, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u06e2\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x39

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4a39

    const v5, -0x6ddb9d13

    xor-int/2addr v4, v5

    const v5, 0x295826f4

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v3, :cond_9

    goto :goto_2

    :cond_9
    const-string v3, "\u05a1\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x423f

    const v5, -0x153274f1

    xor-int/2addr v4, v5

    const v5, -0x4e56346c

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v3

    if-gtz v3, :cond_a

    :goto_2
    const-string v3, "\u06d8\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x77d1

    const v5, 0x627de532

    xor-int/2addr v4, v5

    const v5, 0x4818531a

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06da\u05ab"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x7

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5c31

    const v5, -0x7646fd78

    xor-int/2addr v4, v5

    const v5, -0x1045777

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۚ᩸᩷;->᩸:Ll/۠᩸᩷;

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v3

    if-gtz v3, :cond_c

    :cond_b
    :goto_3
    const-string v3, "\u06ec\u1a75"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x552d

    const v5, 0x358c467

    xor-int/2addr v4, v5

    const v5, -0x3ddd2fe8

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a73\u05a8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x224d

    const v5, 0x679b9392

    xor-int/2addr v4, v5

    const v5, -0x46b83afe

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x73d019d4 -> :sswitch_b
        -0x724133d9 -> :sswitch_7
        -0x6f073231 -> :sswitch_7
        -0x6906a638 -> :sswitch_9
        -0x63b541d2 -> :sswitch_0
        -0x60ebe0f7 -> :sswitch_b
        -0x5b4cb63b -> :sswitch_e
        -0x57f4c672 -> :sswitch_d
        -0x4623e036 -> :sswitch_c
        -0x32ff7418 -> :sswitch_1
        -0x325eb321 -> :sswitch_9
        -0x2aa07472 -> :sswitch_c
        -0x1ca574d0 -> :sswitch_8
        -0x1360bf19 -> :sswitch_2
        -0x1298a760 -> :sswitch_d
        -0xfc3c87c -> :sswitch_3
        -0xf81205c -> :sswitch_1
        0x56dd458 -> :sswitch_2
        0x1266c11e -> :sswitch_e
        0x1fcfaeb8 -> :sswitch_4
        0x35a63139 -> :sswitch_5
        0x3ea012fd -> :sswitch_6
        0x4466b917 -> :sswitch_a
        0x4e0277fc -> :sswitch_0
        0x59f4d73f -> :sswitch_4
        0x6937989a -> :sswitch_6
        0x6941e927 -> :sswitch_8
        0x6a87771d -> :sswitch_a
        0x79ceecae -> :sswitch_3
        0x7bcab322 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ۚ᩸᩷;->᩸:Ll/۠᩸᩷;

    iget v1, p0, Ll/ۚ᩸᩷;->᩹:I

    invoke-static {v0, v1}, Ll/۠᩸᩷;->֫(Ll/۠᩸᩷;I)V

    return-void
.end method
