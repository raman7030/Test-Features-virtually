.class public final synthetic Ll/ۢۚۡ;
.super Ljava/lang/Object;
.source "H1R6"

# interfaces
.implements Ll/ۢ۠ۡ;


# instance fields
.field public final synthetic ۙ:Lcom/google/android/material/textfield/TextInputLayout;

.field public final synthetic ᩶:Ll/ۛۚۡ;

.field public final synthetic ᩸:Ll/۬۬ܿ;

.field public final synthetic ᩹:Ll/֡ۚۢ;


# direct methods
.method public synthetic constructor <init>(Ll/۬۬ܿ;Ll/֡ۚۢ;Ll/ۛۚۡ;Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 6

    const v0, 0x5c180480

    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    sget v2, Ll/֨᩺;->ۨ֨۬:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u073a\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x251b

    const v5, -0x636877e

    xor-int/2addr v4, v5

    const v5, 0x267b1bfa

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x4ab5

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 4
    :sswitch_0
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    if-gez v3, :cond_2

    goto/16 :goto_2

    :sswitch_1
    sget v3, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v3, :cond_b

    goto/16 :goto_1

    .line 1
    :sswitch_2
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    sget-boolean v3, Ll/֡ۨ;->ܽܶۖ:Z

    if-eqz v3, :cond_9

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    goto/16 :goto_1

    .line 0
    :sswitch_4
    iput-object p3, p0, Ll/ۢۚۡ;->᩶:Ll/ۛۚۡ;

    iput-object p4, p0, Ll/ۢۚۡ;->ۙ:Lcom/google/android/material/textfield/TextInputLayout;

    return-void

    :sswitch_5
    sget v3, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v3, :cond_0

    const-string v3, "\u06d9\u06e7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x2d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x302f

    const v5, 0x228facfd

    xor-int/2addr v4, v5

    const v5, 0x73c90186

    goto :goto_0

    :cond_0
    const-string v3, "\u073a\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4cc9

    const v5, -0x6bc3bc74

    xor-int/2addr v4, v5

    const v5, 0x3b75e99e

    goto :goto_0

    .line 1
    :sswitch_6
    sget v3, Ll/۟;->ۗۤۛ:I

    if-eqz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u0730\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x589f

    const v5, 0x18967bcb

    xor-int/2addr v4, v5

    const v5, 0x63a3d29d

    goto :goto_0

    .line 4
    :sswitch_7
    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v3, :cond_3

    :cond_2
    const-string v3, "\u06db\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4659

    const v5, 0x77192682

    xor-int/2addr v4, v5

    const v5, 0x75fa3172

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06e4\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3ced

    const v5, 0x42bf9b06

    xor-int/2addr v4, v5

    const v5, 0x4ccaebc8    # 1.06389056E8f

    goto/16 :goto_0

    .line 0
    :sswitch_8
    sget v3, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v3, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v3, "\u06d6\u0730"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x75

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x33f

    const v5, -0x6401d325

    xor-int/2addr v4, v5

    const v5, -0x5d98159d

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u1a74\u05a8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x204f

    const v5, 0x239a30d5

    xor-int/2addr v4, v5

    const v5, -0x3e94be30

    goto/16 :goto_0

    .line 4
    :sswitch_a
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v3

    if-gtz v3, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v3, "\u1a73\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x792b

    const v5, -0x4d7d2499

    xor-int/2addr v4, v5

    const v5, -0x3e5dee5a

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u1a74\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3c0f

    const v5, -0x7899b77e

    xor-int/2addr v4, v5

    const v5, -0x4ff714c

    goto/16 :goto_0

    .line 2
    :sswitch_c
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v3

    if-ltz v3, :cond_8

    :goto_1
    const-string v3, "\u06d6\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3ec3

    const v5, 0x52186344

    xor-int/2addr v4, v5

    const v5, 0x7a14863b

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06d9\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x408d

    const v5, -0x7b68210a

    xor-int/2addr v4, v5

    const v5, -0x319058d4    # -1.0051776E9f

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_2
    const-string v3, "\u05ab\u06df"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x19

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x48dd

    const v5, 0x1ef8ca03

    xor-int/2addr v4, v5

    const v5, -0x22426314

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u05ab\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x3f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6841

    const v5, 0x12bd6032

    xor-int/2addr v4, v5

    const v5, -0x1f3b2197

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۢۚۡ;->᩸:Ll/۬۬ܿ;

    iput-object p2, p0, Ll/ۢۚۡ;->᩹:Ll/֡ۚۢ;

    .line 2
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_3
    const-string v3, "\u0733\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3443

    const v5, 0x5e31c8d

    xor-int/2addr v4, v5

    const v5, 0x5e78f28d

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a77\u0730"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4849

    const v5, -0x6d2f1bdc

    xor-int/2addr v4, v5

    const v5, 0x43873e75

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d940f1d -> :sswitch_9
        -0x768cb4c9 -> :sswitch_e
        -0x725a5870 -> :sswitch_b
        -0x702083e4 -> :sswitch_2
        -0x6f809dad -> :sswitch_7
        -0x6b824777 -> :sswitch_4
        -0x62d4f931 -> :sswitch_c
        -0x540f78f5 -> :sswitch_6
        -0x4ab831e6 -> :sswitch_d
        -0x484dd799 -> :sswitch_0
        -0x435cd90c -> :sswitch_3
        -0x41d2f310 -> :sswitch_3
        -0x2de3081f -> :sswitch_0
        -0x1e64443f -> :sswitch_8
        -0xe8f5d5b -> :sswitch_2
        -0xdccc9f7 -> :sswitch_c
        -0x1ba77d7 -> :sswitch_5
        0x325d072 -> :sswitch_a
        0xb62fc78 -> :sswitch_6
        0x10461f8e -> :sswitch_d
        0x162586fe -> :sswitch_9
        0x1dd6284d -> :sswitch_b
        0x25686d23 -> :sswitch_5
        0x2cab4595 -> :sswitch_8
        0x3364afd7 -> :sswitch_1
        0x36303187 -> :sswitch_1
        0x540b03dd -> :sswitch_a
        0x5a63a020 -> :sswitch_4
        0x5e7d97e5 -> :sswitch_7
        0x6612bcd6 -> :sswitch_e
    .end sparse-switch
.end method


# virtual methods
.method public final ֫(Ll/᩻ᩴۡ;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x13e95cea

    sget v3, Ll/֡᩶;->ܳܶ۠:I

    sget v4, Ll/֡᩺;->ᩴ᩹ۛ:I

    const-string v5, "\u06dc\u073f"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x47

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4a53

    const v7, -0x18052684

    xor-int/2addr v6, v7

    const v7, 0x16cc8dda

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x5fff

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 0
    iget-object v2, p0, Ll/ۢۚۡ;->᩸:Ll/۬۬ܿ;

    iget-object v3, p0, Ll/ۢۚۡ;->᩹:Ll/֡ۚۢ;

    invoke-static {v2, v3, p1, v0, v1}, Ll/ۛۚۡ;->֫(Ll/۬۬ܿ;Ll/֡ۚۢ;Ll/᩻ᩴۡ;Ll/ۛۚۡ;Lcom/google/android/material/textfield/TextInputLayout;)V

    return-void

    .line 4
    :sswitch_0
    sget v5, Ll/֡ᩴ;->ܳۤ֫:I

    if-gez v5, :cond_1

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    sget v5, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v5, :cond_b

    goto/16 :goto_3

    .line 1
    :sswitch_2
    sget-boolean v5, Ll/֨۫;->۬᩷᩶:Z

    if-nez v5, :cond_9

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    goto/16 :goto_2

    .line 3
    :sswitch_4
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    return-void

    .line 0
    :sswitch_5
    iget-object v1, p0, Ll/ۢۚۡ;->ۙ:Lcom/google/android/material/textfield/TextInputLayout;

    .line 4
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v5

    if-ltz v5, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v5, "\u06e2\u1a75"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x38c5

    const v7, 0x7becab6c

    xor-int/2addr v6, v7

    const v7, -0xd99de0a

    goto :goto_0

    .line 0
    :sswitch_6
    iget-object v0, p0, Ll/ۢۚۡ;->᩶:Ll/ۛۚۡ;

    .line 4
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v5

    if-ltz v5, :cond_2

    :cond_1
    const-string v5, "\u1a74\u1a73"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x43

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5537

    const v7, 0x57609cf

    xor-int/2addr v6, v7

    const v7, -0x6b95e9aa

    goto :goto_0

    :cond_2
    const-string v5, "\u06d6\u06db"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x53

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x20f1

    const v7, 0x2068e55a

    xor-int/2addr v6, v7

    const v7, 0x4a3b6b6a    # 3070682.5f

    goto/16 :goto_0

    :sswitch_7
    sget v5, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v5, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v5, "\u05a8\u06e8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6075

    const v7, -0x1d860da

    xor-int/2addr v6, v7

    const v7, -0x6b220d61

    goto/16 :goto_0

    .line 1
    :sswitch_8
    sget v5, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v5, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v5, "\u06e0\u06eb"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6bd9

    const v7, -0x45910ec9

    xor-int/2addr v6, v7

    const v7, -0x8cd2f71

    goto/16 :goto_0

    :sswitch_9
    sget v5, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v5, :cond_5

    :goto_1
    const-string v5, "\u073a\u06eb"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5e19

    const v7, 0x6a1d4585

    xor-int/2addr v6, v7

    const v7, 0x2ca9ad0

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u073f\u0733"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x2b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4923

    const v7, -0x2b1dd528

    xor-int/2addr v6, v7

    const v7, 0x5cc94360

    goto/16 :goto_0

    .line 3
    :sswitch_a
    sget v5, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v5, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v5, "\u06db\u06ec"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2587

    const v7, -0x3f828bca

    xor-int/2addr v6, v7

    const v7, -0x3eafac6f

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v5, :cond_7

    goto :goto_3

    :cond_7
    const-string v5, "\u06e1\u06d8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x41

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x358f

    const v7, 0x7c0dac69

    xor-int/2addr v6, v7

    const v7, 0x3edb7238

    goto/16 :goto_0

    .line 2
    :sswitch_c
    sget v5, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v5, :cond_8

    :goto_2
    const-string v5, "\u1a77\u06e4"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x35

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1883

    const v7, 0x221c3f78

    xor-int/2addr v6, v7

    const v7, -0x35af119f

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u1a7b\u06e4"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x68b1

    const v7, 0x5bb1e770

    xor-int/2addr v6, v7

    const v7, -0x46f4b249

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v5, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v5, :cond_a

    :cond_9
    :goto_3
    const-string v5, "\u1a77\u06e7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2ca1

    const v7, 0xa58940d

    xor-int/2addr v6, v7

    const v7, -0x61afec2b

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u1a76\u05a1"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x59

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x63e9

    const v7, 0x4feaf474

    xor-int/2addr v6, v7

    const v7, 0x79d33642

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v5

    if-gtz v5, :cond_c

    :cond_b
    :goto_4
    const-string v5, "\u0733\u06e4"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x73

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x37c5

    const v7, 0x400624de    # 2.0960002f

    xor-int/2addr v6, v7

    const v7, -0x6e65b4d3

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u073f\u06d6"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x13

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6aa5

    const v7, -0x2df992b5

    xor-int/2addr v6, v7

    const v7, 0x463d3be9

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c23de80 -> :sswitch_3
        -0x7bb4d993 -> :sswitch_5
        -0x737a99c4 -> :sswitch_0
        -0x6f468bdd -> :sswitch_0
        -0x5404897e -> :sswitch_1
        -0x527d1c3e -> :sswitch_7
        -0x4ebf5cba -> :sswitch_b
        -0x3183d585 -> :sswitch_e
        -0x2562663b -> :sswitch_7
        -0x22937989 -> :sswitch_d
        -0x1c4766c8 -> :sswitch_b
        -0xf334569 -> :sswitch_a
        -0xd6a0828 -> :sswitch_4
        -0xa99f54d -> :sswitch_6
        -0x84428f5 -> :sswitch_e
        -0x2d25fb6 -> :sswitch_d
        -0x1abb6c8 -> :sswitch_c
        0x101c3298 -> :sswitch_3
        0x1a925ec2 -> :sswitch_6
        0x1f06cdbe -> :sswitch_a
        0x2c789d38 -> :sswitch_2
        0x2d1a3213 -> :sswitch_5
        0x406a7dcf -> :sswitch_8
        0x44a07311 -> :sswitch_9
        0x4f1f92fd -> :sswitch_9
        0x65e7c7d0 -> :sswitch_c
        0x6716623e -> :sswitch_8
        0x706c2d13 -> :sswitch_1
        0x77810bb4 -> :sswitch_4
        0x77ed03ce -> :sswitch_2
    .end sparse-switch
.end method
