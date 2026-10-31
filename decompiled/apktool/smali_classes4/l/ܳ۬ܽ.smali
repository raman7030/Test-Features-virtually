.class public final Ll/ܳ۬ܽ;
.super Ljava/lang/Object;
.source "760C"

# interfaces
.implements Ll/ᩳ۬ܽ;


# instance fields
.field public ֫:I

.field public ۧ:Ljava/util/HashSet;

.field public final ܳ:Ljava/lang/String;

.field public ܽ:[I

.field public final ܿ:Ljava/util/Random;

.field public ᩳ:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x728f9ccf

    sget v3, Ll/ۗ᩺;->ۡ᩺֡:I

    sget v4, Ll/ۙۨ;->ۡۗۙ:I

    .line 711
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v5, "\u06d9\u06e8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7c61

    const v7, 0x7bf369c3

    xor-int/2addr v6, v7

    const v7, 0x775da140

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x1615

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 697
    iput-object v0, p0, Ll/ܳ۬ܽ;->ܿ:Ljava/util/Random;

    .line 49
    sget v5, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v5, :cond_3

    goto/16 :goto_4

    .line 191
    :sswitch_0
    sget v5, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez v5, :cond_6

    goto/16 :goto_5

    .line 213
    :sswitch_1
    sget v5, Ll/ۘۨ;->۫᩸۠:I

    if-gez v5, :cond_b

    goto :goto_1

    .line 508
    :sswitch_2
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v5, "\u073f\u06d9"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x29

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3d21

    const v7, 0x1e5abbf4

    xor-int/2addr v6, v7

    const v7, 0x262cfaed

    goto :goto_0

    .line 111
    :sswitch_3
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    goto/16 :goto_3

    .line 281
    :sswitch_4
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    const/4 p1, 0x1

    .line 714
    invoke-direct {p0, p1}, Ll/ܳ۬ܽ;->֫(I)V

    return-void

    .line 705
    :sswitch_6
    iput-object v1, p0, Ll/ܳ۬ܽ;->ۧ:Ljava/util/HashSet;

    .line 712
    iput-object p1, p0, Ll/ܳ۬ܽ;->ܳ:Ljava/lang/String;

    .line 109
    sget v5, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v5, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v5, "\u0733\u1a7b"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x7b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3bf7

    const v7, 0x534e1abf

    xor-int/2addr v6, v7

    const v7, -0x4078bfff

    goto :goto_0

    .line 705
    :sswitch_7
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 655
    sget v5, Ll/ۛ;->᩺᩻֫:I

    if-ltz v5, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v5, "\u0733\u06e8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x37dd

    const v7, 0x7eec50d9

    xor-int/2addr v6, v7

    const v7, 0x1310ba20

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u05a8\u1a74"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4549

    const v7, -0x60370825

    xor-int/2addr v6, v7

    const v7, 0x7897bb75

    goto/16 :goto_0

    .line 339
    :sswitch_8
    sget v5, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v5, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v5, "\u073f\u06e7"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x57

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x27cd

    const v7, -0x74a7bbfa

    xor-int/2addr v6, v7

    const v7, 0x5d251365

    goto/16 :goto_0

    :sswitch_9
    sget v5, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v5, :cond_5

    goto :goto_2

    :cond_5
    const-string v5, "\u1a7a\u05a8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1d2f

    const v7, 0x20498962

    xor-int/2addr v6, v7

    const v7, -0x7ebb8ef6

    goto/16 :goto_0

    .line 699
    :sswitch_a
    sget v5, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v5, :cond_7

    :cond_6
    :goto_2
    const-string v5, "\u0730\u1a7b"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x4d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7733

    const v7, -0x29c0c2fd

    xor-int/2addr v6, v7

    const v7, 0x2a88482a

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u1a75\u06e4"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x29a7

    const v7, -0x1c15692

    xor-int/2addr v6, v7

    const v7, 0x3c9ef688

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v5, :cond_8

    goto/16 :goto_5

    :cond_8
    const-string v5, "\u1a79\u06db"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4aad

    const v7, 0x6959a9bb

    xor-int/2addr v6, v7

    const v7, -0x38f081e8

    goto/16 :goto_0

    .line 114
    :sswitch_c
    sget v5, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v5, :cond_9

    :goto_3
    const-string v5, "\u1a7a\u073f"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7367

    const v7, 0x263bad83

    xor-int/2addr v6, v7

    const v7, -0xce69966

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06d6\u1a74"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2ae5

    const v7, -0x2db2ae88

    xor-int/2addr v6, v7

    const v7, 0x324525ce

    goto/16 :goto_0

    .line 325
    :sswitch_d
    sget v5, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v5, :cond_a

    :goto_4
    const-string v5, "\u06e1\u1a7a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x9

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x19f1

    const v7, 0x2b59abd3

    xor-int/2addr v6, v7

    const v7, -0x6607cd4f

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u1a79\u05ab"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x515b

    const v7, -0x4aaf593a

    xor-int/2addr v6, v7

    const v7, 0x58557bd9

    goto/16 :goto_0

    .line 697
    :sswitch_e
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    sget v5, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v5, :cond_c

    :cond_b
    :goto_5
    const-string v5, "\u1a75\u1a7b"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6f49

    const v7, 0x6a287384

    xor-int/2addr v6, v7

    const v7, 0x7c7f8023

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u073a\u06d9"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x3f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5653

    const v7, 0xaac551

    xor-int/2addr v6, v7

    const v7, 0x720dfbb6

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x733d531b -> :sswitch_1
        -0x5c18dabb -> :sswitch_c
        -0x5381772d -> :sswitch_3
        -0x523a3d31 -> :sswitch_2
        -0x419ba117 -> :sswitch_e
        -0x3ee800ac -> :sswitch_7
        -0x3b69c3df -> :sswitch_4
        -0x398e1156 -> :sswitch_0
        -0x1e4864a6 -> :sswitch_a
        -0x1c033826 -> :sswitch_b
        -0x15d0c425 -> :sswitch_3
        0x28dbb91 -> :sswitch_6
        0x7da04fd -> :sswitch_d
        0xeb70779 -> :sswitch_a
        0x1132bee3 -> :sswitch_d
        0x11f546d2 -> :sswitch_5
        0x17745652 -> :sswitch_0
        0x1a261347 -> :sswitch_9
        0x1a3ed23f -> :sswitch_2
        0x1c50b499 -> :sswitch_1
        0x1ff3a468 -> :sswitch_8
        0x22a356d5 -> :sswitch_4
        0x35ab82f5 -> :sswitch_6
        0x50fe472e -> :sswitch_8
        0x51e6a4af -> :sswitch_e
        0x5e2cac79 -> :sswitch_7
        0x634aa706 -> :sswitch_b
        0x6b42e714 -> :sswitch_9
        0x7bde6397 -> :sswitch_5
        0x7eed9f4b -> :sswitch_c
    .end sparse-switch
.end method

.method private ֫(I)V
    .locals 22

    move-object/from16 v0, p0

    move/from16 v1, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const v12, -0x604f92da

    sget v13, Ll/ۘܿ;->ۘܰ۫:I

    sget v14, Ll/ۙۨ;->ۡۗۙ:I

    const-string v15, "\u06d6\u06d8"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    mul-int/lit8 v15, v15, 0x33

    xor-int v2, v15, v14

    mul-int/lit16 v2, v2, 0x5335

    const v17, -0x41748802

    xor-int v2, v2, v17

    const v17, 0x13922ecf

    xor-int v15, v15, v17

    move-object v4, v3

    move-wide v10, v9

    move/from16 v16, v15

    const/4 v3, 0x0

    const/4 v12, 0x0

    const v15, -0x604f92da

    move-wide v8, v7

    move-wide v6, v5

    const/4 v5, 0x0

    :goto_0
    xor-int/2addr v15, v14

    mul-int/lit16 v15, v15, 0x2685

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v2, v15

    xor-int v15, v16, v2

    sparse-switch v15, :sswitch_data_0

    move-wide/from16 v18, v6

    move-wide/from16 v16, v10

    .line 718
    iput v1, v0, Ll/ܳ۬ܽ;->֫:I

    .line 389
    sget v2, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v2, :cond_9

    goto/16 :goto_8

    .line 632
    :sswitch_0
    sget v2, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v2, :cond_0

    :goto_1
    move-wide/from16 v18, v6

    move-wide/from16 v16, v10

    goto/16 :goto_7

    :cond_0
    move-wide/from16 v18, v6

    move-wide/from16 v16, v10

    goto/16 :goto_9

    :sswitch_1
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    sget v2, Ll/֨ۤ;->ܿۖ᩵:I

    if-gez v2, :cond_1

    goto :goto_1

    :cond_1
    move-wide/from16 v18, v6

    move-wide/from16 v16, v10

    goto/16 :goto_8

    .line 79
    :sswitch_2
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    :goto_2
    move-wide/from16 v16, v10

    goto :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    return-void

    .line 720
    :sswitch_5
    iput v12, v0, Ll/ܳ۬ܽ;->ᩳ:I

    .line 721
    iget-object v1, v0, Ll/ܳ۬ܽ;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->clear()V

    return-void

    :sswitch_6
    double-to-int v12, v10

    .line 45
    sget-boolean v2, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    const-string v2, "\u0736\u06ec"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    move-wide/from16 v16, v10

    xor-int v10, v2, v13

    mul-int/lit16 v10, v10, 0x347d

    const v11, -0x2d4328d7

    xor-int/2addr v10, v11

    const v11, -0x53c67e2c

    goto :goto_5

    .line 720
    :sswitch_7
    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v10

    .line 352
    sget v2, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v2, :cond_4

    move-wide/from16 v18, v6

    goto/16 :goto_a

    :cond_4
    const-string v2, "\u06dc\u06da"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v13, v2

    mul-int/lit8 v2, v2, 0x75

    move-wide/from16 v18, v6

    xor-int v6, v2, v14

    mul-int/lit16 v6, v6, -0x18d3

    const v7, 0x1f862f37

    xor-int/2addr v6, v7

    const v7, -0x2e32805e

    :goto_3
    xor-int v16, v2, v7

    goto/16 :goto_c

    :sswitch_8
    move-wide/from16 v16, v10

    int-to-double v6, v5

    int-to-double v8, v1

    sget v2, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v2, :cond_5

    :goto_4
    const-string v2, "\u0730\u06db"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v13, v2

    mul-int/lit8 v2, v2, 0x79

    xor-int v10, v2, v14

    mul-int/lit16 v10, v10, -0x5699

    const v11, 0x626d957d

    xor-int/2addr v10, v11

    const v11, -0x520dff42

    goto :goto_5

    :cond_5
    const-string v2, "\u06df\u05a8"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v10, v2, v13

    mul-int/lit16 v10, v10, -0x36f5

    const v11, 0x8cc6dc2

    xor-int/2addr v10, v11

    const v11, -0x483a1bd9

    :goto_5
    xor-int/2addr v2, v11

    move-wide/from16 v20, v16

    move/from16 v16, v2

    move v2, v10

    move-wide/from16 v10, v20

    goto/16 :goto_0

    :sswitch_9
    move-wide/from16 v18, v6

    move-wide/from16 v16, v10

    .line 720
    invoke-static {v4}, Ll/֨֫;->ۡۚܽ(Ljava/lang/Object;)I

    move-result v5

    .line 400
    sget-boolean v2, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v2, :cond_6

    :goto_6
    move-wide/from16 v10, v16

    goto/16 :goto_a

    :cond_6
    const-string v2, "\u1a74\u06d9"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v6, v2, v14

    mul-int/lit16 v6, v6, 0x3759

    const v7, 0x384bf658

    xor-int/2addr v6, v7

    const v7, 0x7b4716fd

    goto/16 :goto_b

    :sswitch_a
    move-wide/from16 v18, v6

    move-wide/from16 v16, v10

    .line 719
    iput-object v3, v0, Ll/ܳ۬ܽ;->ܽ:[I

    .line 720
    iget-object v4, v0, Ll/ܳ۬ܽ;->ܳ:Ljava/lang/String;

    sget v2, Ll/᩹;->ۤܿܳ:I

    if-eqz v2, :cond_7

    goto :goto_8

    :cond_7
    const-string v2, "\u1a79\u06d7"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v13

    mul-int/lit8 v2, v2, 0x69

    xor-int v6, v2, v14

    mul-int/lit16 v6, v6, 0x7a7b

    const v7, -0x44e0ce3

    xor-int/2addr v6, v7

    const v7, 0x1060ddc0

    goto/16 :goto_b

    :sswitch_b
    move-wide/from16 v18, v6

    move-wide/from16 v16, v10

    .line 719
    new-array v3, v1, [I

    .line 424
    sget-boolean v2, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v2, :cond_8

    :goto_7
    const-string v2, "\u1a78\u06e1"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v14

    mul-int/lit8 v2, v2, -0x6f

    xor-int v6, v2, v13

    mul-int/lit16 v6, v6, 0x259

    const v7, 0x637ed8b

    xor-int/2addr v6, v7

    const v7, 0x714711bc

    goto/16 :goto_b

    :cond_8
    const-string v2, "\u06eb\u1a76"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v6, v2, v13

    mul-int/lit16 v6, v6, 0x4f4d

    const v7, 0x74d2cda

    xor-int/2addr v6, v7

    const v7, -0x5cfb13ee

    goto/16 :goto_b

    :goto_8
    const-string v2, "\u1a78\u06e8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v6, v2, v14

    mul-int/lit16 v6, v6, -0x714d

    const v7, 0x642cd513

    xor-int/2addr v6, v7

    const v7, 0x6b60afb2

    goto/16 :goto_b

    :cond_9
    const-string v2, "\u1a75\u05a8"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v6, v2, v14

    mul-int/lit16 v6, v6, -0x50ab

    const v7, 0x68edc530

    xor-int/2addr v6, v7

    const v7, 0x2fef1bb

    goto/16 :goto_b

    :sswitch_c
    move-wide/from16 v18, v6

    move-wide/from16 v16, v10

    .line 401
    sget-boolean v2, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v2, :cond_a

    :goto_9
    const-string v2, "\u1a77\u1a73"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    mul-int/lit8 v2, v2, 0x19

    xor-int v6, v2, v13

    mul-int/lit16 v6, v6, 0x306b

    const v7, -0x36c74c7e

    xor-int/2addr v6, v7

    const v7, 0x4608ec90

    goto :goto_b

    :cond_a
    const-string v2, "\u1a77\u1a74"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v6, v2, v13

    mul-int/lit16 v6, v6, -0x28a1

    const v7, -0x22b3833

    xor-int/2addr v6, v7

    const v7, -0x69888ad8

    goto :goto_b

    :sswitch_d
    move-wide/from16 v18, v6

    move-wide/from16 v16, v10

    sget v2, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v2, :cond_b

    goto/16 :goto_6

    :cond_b
    const-string v2, "\u073a\u06d8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v6, v2, v14

    mul-int/lit16 v6, v6, 0x6113

    const v7, -0x4512ff58

    xor-int/2addr v6, v7

    const v7, 0xa86d04

    goto :goto_b

    :sswitch_e
    move-wide/from16 v18, v6

    move-wide/from16 v16, v10

    .line 65
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v2

    if-eqz v2, :cond_c

    goto/16 :goto_6

    :goto_a
    const-string v2, "\u073d\u06e8"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v6, v2, v13

    mul-int/lit16 v6, v6, -0x7111

    const v7, 0x362f1571

    xor-int/2addr v6, v7

    const v7, -0xab4bad7

    goto/16 :goto_3

    :cond_c
    const-string v2, "\u06e7\u06e1"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v6, v2, v13

    mul-int/lit16 v6, v6, -0x4e7

    const v7, 0x68b2aed1

    xor-int/2addr v6, v7

    const v7, -0x275b4881

    :goto_b
    xor-int/2addr v2, v7

    move-wide/from16 v10, v16

    move/from16 v16, v2

    :goto_c
    move v2, v6

    move-wide/from16 v6, v18

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f085780 -> :sswitch_6
        -0x7a403dc7 -> :sswitch_a
        -0x770c65fe -> :sswitch_c
        -0x757d469e -> :sswitch_5
        -0x75592650 -> :sswitch_b
        -0x71f101d4 -> :sswitch_1
        -0x7098d0fb -> :sswitch_3
        -0x6e811fb2 -> :sswitch_7
        -0x6b703952 -> :sswitch_0
        -0x4c1f0303 -> :sswitch_5
        -0x38ba95e9 -> :sswitch_7
        -0x351c7707 -> :sswitch_9
        -0x2c0f835e -> :sswitch_0
        -0x27967ae8 -> :sswitch_c
        -0x23adf3a7 -> :sswitch_e
        -0x20931e05 -> :sswitch_3
        -0x1cc77ae6 -> :sswitch_2
        -0xce0c240 -> :sswitch_8
        -0x739d2f3 -> :sswitch_6
        -0x1e04a9b -> :sswitch_d
        -0x1329a7a -> :sswitch_9
        0xc4d146d -> :sswitch_8
        0x10b56762 -> :sswitch_1
        0x12d1aae7 -> :sswitch_b
        0x25d23846 -> :sswitch_d
        0x39db58e1 -> :sswitch_e
        0x4199c4b1 -> :sswitch_2
        0x4264b985 -> :sswitch_4
        0x4fddd7f4 -> :sswitch_a
        0x5a3f3537 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final declared-synchronized ֫()Ljava/lang/String;
    .locals 9

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 732
    :try_start_0
    iget-object v1, p0, Ll/ܳ۬ܽ;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result v1

    iget v2, p0, Ll/ܳ۬ܽ;->ᩳ:I

    if-lt v1, v2, :cond_0

    .line 733
    iget v1, p0, Ll/ܳ۬ܽ;->֫:I

    add-int/lit8 v1, v1, 0x1

    invoke-direct {p0, v1}, Ll/ܳ۬ܽ;->֫(I)V

    .line 736
    :cond_0
    iget-object v1, p0, Ll/ܳ۬ܽ;->ܳ:Ljava/lang/String;

    invoke-static {v1}, Ll/֫ۡ;->᩻ܳܽ(Ljava/lang/Object;)I

    move-result v1

    .line 737
    iget-object v2, p0, Ll/ܳ۬ܽ;->ܽ:[I

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/16 v5, 0x3e8

    const/4 v6, -0x1

    if-ge v4, v5, :cond_2

    const/4 v5, 0x0

    const/4 v7, 0x0

    .line 743
    :goto_1
    array-length v8, v2

    if-ge v5, v8, :cond_1

    .line 744
    iget-object v8, p0, Ll/ܳ۬ܽ;->ܿ:Ljava/util/Random;

    invoke-virtual {v8, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v8

    .line 745
    aput v8, v2, v5

    mul-int v7, v7, v1

    add-int/2addr v7, v8

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 748
    :cond_1
    iget-object v5, p0, Ll/ܳ۬ܽ;->ۧ:Ljava/util/HashSet;

    invoke-static {v7}, Ll/ۗ۬;->᩶᩵᩻(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Ll/ۙۨ;->ۚܽ֡(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v7, -0x1

    :cond_3
    if-ne v7, v6, :cond_6

    const/4 v4, 0x0

    .line 755
    :goto_2
    iget v5, p0, Ll/ܳ۬ܽ;->ᩳ:I

    if-ge v4, v5, :cond_6

    .line 756
    iget-object v5, p0, Ll/ܳ۬ܽ;->ۧ:Ljava/util/HashSet;

    invoke-static {v4}, Ll/֨᩺;->᩸ۗ᩹(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Ll/ۙۨ;->ۚܽ֡(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    .line 758
    array-length v5, v2

    add-int/lit8 v5, v5, -0x1

    move v7, v4

    :goto_3
    if-ltz v5, :cond_4

    .line 759
    rem-int v8, v7, v1

    aput v8, v2, v5

    .line 760
    div-int/2addr v7, v1

    add-int/lit8 v5, v5, -0x1

    goto :goto_3

    :cond_4
    move v7, v4

    goto :goto_4

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_6
    :goto_4
    if-eq v7, v6, :cond_8

    .line 768
    iget-object v1, p0, Ll/ܳ۬ܽ;->ۧ:Ljava/util/HashSet;

    invoke-static {v7}, Ll/ۗ۬;->᩶᩵᩻(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Ll/ۘܿ;->֡֡ۤ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 770
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 772
    array-length v4, v2

    :goto_5
    if-ge v3, v4, :cond_7

    aget v5, v2, v3

    .line 773
    iget-object v6, p0, Ll/ܳ۬ܽ;->ܳ:Ljava/lang/String;

    invoke-static {v6, v5}, Ll/֨֫;->֨ܳۗ(Ljava/lang/Object;I)C

    move-result v5

    invoke-static {v1, v5}, Ll/֫᩹;->ۧۛ᩵(Ljava/lang/Object;C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    .line 776
    :cond_7
    invoke-static {v1}, Ll/֡۬;->ܺܽۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    .line 767
    :cond_8
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :catchall_0
    move-exception v1

    .line 776
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
