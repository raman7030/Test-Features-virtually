.class public final Ll/ᩴܰܽ;
.super Ljava/lang/Object;
.source "Y62B"


# instance fields
.field public ֫:Ljava/util/List;

.field public ۧ:Ljava/lang/String;

.field public ܽ:Z

.field public ᩳ:Ll/ܶۨۡ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ܶۨۡ;Ljava/util/List;)V
    .locals 6

    const v0, 0x3d9b7411

    sget v1, Ll/֡᩺;->ᩴ᩹ۛ:I

    sget v2, Ll/۠;->ܺܺܶ:I

    .line 240
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u0736\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4bbd

    const v5, 0x67d0f7ab

    xor-int/2addr v4, v5

    const v5, -0x2214b730

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x13ed

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v3, :cond_5

    goto/16 :goto_1

    .line 107
    :sswitch_0
    sget v3, Ll/ۗ۬;->ۘܳ᩻:I

    if-lez v3, :cond_b

    goto/16 :goto_1

    .line 197
    :sswitch_1
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v3

    if-ltz v3, :cond_4

    goto/16 :goto_3

    .line 45
    :sswitch_2
    sget v3, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u06db\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0xb

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1367

    const v5, 0x723a4599

    xor-int/2addr v4, v5

    const v5, 0x78033ef8

    goto :goto_0

    .line 39
    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    goto/16 :goto_3

    .line 121
    :sswitch_4
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 243
    :sswitch_5
    iput-object p3, p0, Ll/ᩴܰܽ;->֫:Ljava/util/List;

    return-void

    .line 105
    :sswitch_6
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u06e7\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x57

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2749

    const v5, -0x57c93edc

    xor-int/2addr v4, v5

    const v5, -0x1622d02b

    goto :goto_0

    :sswitch_7
    sget-boolean v3, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u05ab\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x15dd

    const v5, -0x708072b8

    xor-int/2addr v4, v5

    const v5, 0x7ed320d9

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u1a73\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x75bb

    const v5, -0xdfeb83

    xor-int/2addr v4, v5

    const v5, -0x352c1ed7    # -6942868.5f

    goto/16 :goto_0

    :cond_4
    :goto_1
    const-string v3, "\u0736\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x6b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3d75

    const v5, -0x1bc7030a

    xor-int/2addr v4, v5

    const v5, 0x3275179b

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06df\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x53a3

    const v5, -0x3bf65828

    xor-int/2addr v4, v5

    const v5, 0x185adf2b

    goto/16 :goto_0

    .line 233
    :sswitch_9
    sget v3, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v3, :cond_6

    :goto_2
    const-string v3, "\u06d8\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x35

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2993

    const v5, -0x540d0a1b

    xor-int/2addr v4, v5

    const v5, -0x7990e980

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06dc\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x19

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4ab7

    const v5, 0x1120c6cf

    xor-int/2addr v4, v5

    const v5, 0x305c95f7

    goto/16 :goto_0

    .line 235
    :sswitch_a
    sget-boolean v3, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u1a77\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2585

    const v5, 0x1cf238bb

    xor-int/2addr v4, v5

    const v5, 0xae92b6e

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֨۟;->᩹֫᩷:I

    if-eqz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u06d7\u05ab"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7ed5

    const v5, 0x48b05387

    xor-int/2addr v4, v5

    const v5, 0x1dc64506

    goto/16 :goto_0

    .line 34
    :sswitch_c
    sget v3, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v3, :cond_9

    :goto_3
    const-string v3, "\u06e4\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x6f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6c5d

    const v5, -0x493d4c4c

    xor-int/2addr v4, v5

    const v5, -0x7ee9bdac

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06d9\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3d37

    const v5, 0x7a8893ee

    xor-int/2addr v4, v5

    const v5, 0x2b6872b4

    goto/16 :goto_0

    .line 80
    :sswitch_d
    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v3, :cond_a

    goto :goto_4

    :cond_a
    const-string v3, "\u06d7\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x4d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3497

    const v5, -0x308c97ae

    xor-int/2addr v4, v5

    const v5, -0x7f3c4f52

    goto/16 :goto_0

    .line 241
    :sswitch_e
    iput-object p1, p0, Ll/ᩴܰܽ;->ۧ:Ljava/lang/String;

    .line 242
    iput-object p2, p0, Ll/ᩴܰܽ;->ᩳ:Ll/ܶۨۡ;

    .line 124
    sget v3, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06db\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x29a1

    const v5, -0x51c0e395

    xor-int/2addr v4, v5

    const v5, 0x5ad5001a

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d6\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xbe3

    const v5, -0x34fd3195    # -8572523.0f

    xor-int/2addr v4, v5

    const v5, 0x3f91384

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x72491805 -> :sswitch_d
        -0x6c767951 -> :sswitch_a
        -0x69eae12c -> :sswitch_8
        -0x67e9b293 -> :sswitch_7
        -0x50d95e83 -> :sswitch_0
        -0x4ab40458 -> :sswitch_5
        -0x44e55f38 -> :sswitch_9
        -0x424a739c -> :sswitch_e
        -0x32f27bb3 -> :sswitch_4
        -0x30dcacf6 -> :sswitch_6
        -0x2b653e9d -> :sswitch_1
        -0x2af197e7 -> :sswitch_e
        -0x28c4efdc -> :sswitch_8
        -0x23c78506 -> :sswitch_5
        -0x610daac -> :sswitch_9
        -0x44f1d6c -> :sswitch_6
        -0x1851cc8 -> :sswitch_0
        0x4eddac8 -> :sswitch_d
        0x5fa3910 -> :sswitch_c
        0x12676067 -> :sswitch_c
        0x1804d6df -> :sswitch_4
        0x229d27f2 -> :sswitch_3
        0x2b95ba0a -> :sswitch_1
        0x2b9fc2d2 -> :sswitch_a
        0x3c8bc6d7 -> :sswitch_b
        0x4d17623c -> :sswitch_2
        0x54012ef7 -> :sswitch_b
        0x6d2ba27d -> :sswitch_2
        0x73f5912a -> :sswitch_3
        0x7b201ea3 -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final ֫(Ll/ۤۜܽ;)V
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, 0x6fd0b5ce

    sget v9, Ll/ۖ;->᩹۟ۘ:I

    sget v10, Ll/֡֡;->֫ۤܳ:I

    const-string v11, "\u06da\u1a73"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x3a41

    const v13, 0x64e221b5

    xor-int/2addr v12, v13

    const v13, -0x6c4f6ac0

    :goto_0
    xor-int/2addr v11, v13

    xor-int/2addr v8, v9

    mul-int/lit16 v8, v8, 0x79cd

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v8, v12

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_0

    .line 250
    invoke-static {v4}, Ll/֡ܶ;->ۛܿ᩻(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    const-string v11, "\u05a8\u05ab"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, -0x41

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x7aa9

    const v13, -0x1e87a4b1

    xor-int/2addr v12, v13

    const v13, 0x6a5e2c6e

    goto :goto_0

    :sswitch_0
    sget v11, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v11, :cond_c

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    sget-boolean v11, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v11, :cond_1

    goto/16 :goto_3

    .line 56
    :sswitch_2
    sget v11, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v11, :cond_7

    goto/16 :goto_2

    .line 150
    :sswitch_3
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    return-void

    .line 253
    :sswitch_5
    iget-boolean v11, v5, Ll/᩻ܰܽ;->ᩳ:Z

    invoke-virtual {p1, v11}, Ll/ۤۜܽ;->֫(Z)V

    goto/16 :goto_1

    .line 252
    :sswitch_6
    invoke-virtual {v7}, Ll/ۤܿᩴ;->ܶ()[I

    move-result-object v11

    invoke-virtual {p1, v11}, Ll/ۤۜܽ;->ۧ([I)V

    .line 7
    sget v11, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v11, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v11, "\u1a73\u06da"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, 0xf

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x4139

    const v13, 0x7a415138

    xor-int/2addr v12, v13

    const v13, 0x369a0965

    goto :goto_0

    .line 251
    :sswitch_7
    invoke-static {p1, v6}, Ll/᩺;->ۜ֨ܽ(Ljava/lang/Object;I)V

    .line 252
    iget-object v7, v5, Ll/᩻ܰܽ;->֫:Ll/ܺۢᩴ;

    sget-boolean v11, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v11, :cond_2

    :cond_1
    const-string v11, "\u06d8\u06da"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, -0x45

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x3c5b

    const v13, -0x2a3e6442

    xor-int/2addr v12, v13

    const v13, 0xf3ffe6c

    goto/16 :goto_0

    :cond_2
    const-string v11, "\u1a79\u06e8"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x395f

    const v13, 0x53032d67

    xor-int/2addr v12, v13

    const v13, 0x5f937d5b

    goto/16 :goto_0

    .line 251
    :sswitch_8
    iget v6, v5, Ll/᩻ܰܽ;->ۧ:I

    .line 130
    sget-boolean v11, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v11, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v11, "\u06eb\u06d8"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x7b

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x40a5

    const v13, -0x11c0b48e

    xor-int/2addr v12, v13

    const v13, 0x1a4525be

    goto/16 :goto_0

    .line 250
    :sswitch_9
    invoke-static {v4}, Ll/֨۫;->۬ۖܳ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩻ܰܽ;

    .line 134
    sget-boolean v11, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v11, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v11, "\u0730\u1a76"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x63

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x31e5

    const v13, -0xed8d04

    xor-int/2addr v12, v13

    const v13, -0x1fdefe84

    goto/16 :goto_0

    :sswitch_a
    return-void

    :cond_5
    const-string v11, "\u1a73\u1a78"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x51

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x1935

    const v13, -0x5ef1f0f9

    xor-int/2addr v12, v13

    const v13, 0x343f3e93

    goto/16 :goto_0

    .line 249
    :sswitch_b
    invoke-static {p1, v3}, Ll/᩹;->᩶֨᩷(Ljava/lang/Object;I)V

    .line 250
    invoke-static {v2}, Ll/֨ۤ;->ۨ۫֨(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    const-string v11, "\u06e7\u06e2"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x75

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x5acf

    const v13, -0x578ed391

    xor-int/2addr v12, v13

    const v13, 0x6b7ef5d0

    goto/16 :goto_0

    .line 249
    :sswitch_c
    invoke-static {v2}, Ll/֫᩺;->ۗ᩷᩻(Ljava/lang/Object;)I

    move-result v3

    sget v11, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v11, :cond_6

    :goto_2
    const-string v11, "\u06eb\u06e2"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, 0x6d

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0xfe9

    const v13, -0x3f43fa05

    xor-int/2addr v12, v13

    const v13, 0x4788348

    goto/16 :goto_0

    :cond_6
    const-string v11, "\u06e4\u06db"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x37

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x7d77

    const v13, -0x46906542

    xor-int/2addr v12, v13

    const v13, 0x1a6dd412

    goto/16 :goto_0

    .line 248
    :sswitch_d
    invoke-virtual {p1, v1}, Ll/ۤۜܽ;->ۧ([B)V

    .line 249
    iget-object v2, p0, Ll/ᩴܰܽ;->֫:Ljava/util/List;

    .line 123
    sget v11, Ll/۠;->ܺܺܶ:I

    if-ltz v11, :cond_8

    :cond_7
    :goto_3
    const-string v11, "\u0733\u06eb"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x3b13

    const v13, -0x4ad96fbd

    xor-int/2addr v12, v13

    const v13, 0x44d34daf

    goto/16 :goto_0

    :cond_8
    const-string v11, "\u06ec\u06d8"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x7d79

    const v13, 0x35a3468c

    xor-int/2addr v12, v13

    const v13, -0x560204b8

    goto/16 :goto_0

    .line 248
    :sswitch_e
    iget-object v1, p0, Ll/ᩴܰܽ;->ᩳ:Ll/ܶۨۡ;

    invoke-virtual {v1}, Ll/ܶۨۡ;->ۧ()[B

    move-result-object v1

    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v11

    if-ltz v11, :cond_9

    goto :goto_4

    :cond_9
    const-string v11, "\u06e2\u0736"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x19

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x6045

    const v13, 0x76c02095

    xor-int/2addr v12, v13

    const v13, -0x3bf1ddb2

    goto/16 :goto_0

    .line 247
    :sswitch_f
    invoke-virtual {p1, v0}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 24
    sget v11, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v11, :cond_a

    goto :goto_5

    :cond_a
    const-string v11, "\u06da\u0736"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, 0x6b

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x289f

    const v13, 0x5267547a

    xor-int/2addr v12, v13

    const v13, 0x2fb4e3b2

    goto/16 :goto_0

    .line 247
    :sswitch_10
    iget-object v0, p0, Ll/ᩴܰܽ;->ۧ:Ljava/lang/String;

    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v11

    if-gtz v11, :cond_b

    :goto_4
    const-string v11, "\u06e8\u06e0"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x1d15

    const v13, 0x59d7ec33

    xor-int/2addr v12, v13

    const v13, -0x41f125ee

    goto/16 :goto_0

    :cond_b
    const-string v11, "\u06eb\u1a74"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x3c15

    const v13, 0x3d2d6cc5

    xor-int/2addr v12, v13

    const v13, -0x63854df4

    goto/16 :goto_0

    .line 193
    :sswitch_11
    sget v11, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v11, :cond_d

    :cond_c
    :goto_5
    const-string v11, "\u05ab\u06e1"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x4d

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x70b5

    const v13, -0xf5cc425

    xor-int/2addr v12, v13

    const v13, 0x20b75d90

    goto/16 :goto_0

    :cond_d
    const-string v11, "\u073a\u06d7"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, 0x3b

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x1831

    const v13, -0x708940ae

    xor-int/2addr v12, v13

    const v13, -0x1d08e134

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7eba435f -> :sswitch_1
        -0x79e66760 -> :sswitch_7
        -0x7939350e -> :sswitch_6
        -0x7284320c -> :sswitch_5
        -0x6ef9bf55 -> :sswitch_b
        -0x6a684654 -> :sswitch_4
        -0x63f96ac6 -> :sswitch_7
        -0x5fd04dd6 -> :sswitch_f
        -0x479708c7 -> :sswitch_4
        -0x47894904 -> :sswitch_3
        -0x4495b38d -> :sswitch_9
        -0x3b6090e3 -> :sswitch_a
        -0x33256bfc -> :sswitch_8
        -0x30d4aefa -> :sswitch_9
        -0x302deab9 -> :sswitch_d
        -0x274a140c -> :sswitch_10
        -0x231feb66 -> :sswitch_c
        -0x1f360df0 -> :sswitch_3
        -0x1cce811d -> :sswitch_2
        -0x69bd5e4 -> :sswitch_e
        0x22a818c3 -> :sswitch_1
        0x3586aa18 -> :sswitch_10
        0x39ca8c2b -> :sswitch_11
        0x452ccec3 -> :sswitch_f
        0x5161b8ba -> :sswitch_5
        0x51afd422 -> :sswitch_a
        0x54196a8b -> :sswitch_b
        0x541bbb6f -> :sswitch_8
        0x55583b6f -> :sswitch_c
        0x63707c5d -> :sswitch_e
        0x64d8bf20 -> :sswitch_2
        0x67588acc -> :sswitch_0
        0x6821cc89 -> :sswitch_d
        0x6dcfa738 -> :sswitch_0
        0x6f1566d2 -> :sswitch_11
        0x7f9e5c4b -> :sswitch_6
    .end sparse-switch
.end method
