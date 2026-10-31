.class public final Ll/ۛۡܳ;
.super Ljava/io/FilterInputStream;
.source "05ZQ"

# interfaces
.implements Ll/ܶ֨ᩴ;


# static fields
.field private static final ۜۨ۠:[S


# instance fields
.field public ᩸:Ll/᩵ۛۡ;

.field public final synthetic ᩹:Ll/ᩳܺܳ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x12

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۛۡܳ;->ۜۨ۠:[S

    return-void

    :array_0
    .array-data 2
        0x915s
        -0x29ffs
        -0x29dds
        -0x29d4s
        -0x29dfs
        -0x29d9s
        -0x29d2s
        -0x29d9s
        -0x29das
        0x1033s
        0x7dds
        0x7ffs
        0x7f0s
        0x7fds
        0x7fbs
        0x7f2s
        0x7fbs
        0x7fas
    .end array-data
.end method

.method public constructor <init>(Ll/ᩳܺܳ;Ljava/io/BufferedInputStream;Ll/ܶ᩵ܿ;)V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x4a3105

    sget v4, Ll/֨۬;->۫ۙ᩺:I

    sget v5, Ll/ۙۨ;->ۡۗۙ:I

    .line 548
    iput-object p1, p0, Ll/ۛۡܳ;->᩹:Ll/ᩳܺܳ;

    invoke-direct {p0, p2}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const-string p2, "\u073d\u0730"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v4

    xor-int v6, p2, v5

    mul-int/lit16 v6, v6, 0x116d

    const v7, -0x32f4745a

    xor-int/2addr v6, v7

    const v7, 0x74394606

    :goto_0
    xor-int/2addr p2, v7

    move-object v7, v0

    :goto_1
    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, -0x2bdd

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v6

    xor-int/2addr v3, p2

    sparse-switch v3, :sswitch_data_0

    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    sget p2, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez p2, :cond_4

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    sget p2, Ll/᩹;->ۤܿܳ:I

    if-nez p2, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string p2, "\u0736\u1a7b"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v4

    xor-int v6, p2, v5

    mul-int/lit16 v6, v6, -0x723d

    const v8, -0x3bd5026b

    xor-int/2addr v6, v8

    const v8, 0x3d11b420

    goto/16 :goto_6

    .line 219
    :sswitch_1
    sget p2, Ll/֡᩶;->ܳܶ۠:I

    if-lez p2, :cond_b

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 549
    :sswitch_4
    invoke-static {v7, v2}, Ll/ۘۨ;->᩵᩶᩵(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v7, p0, Ll/ۛۡܳ;->᩸:Ll/᩵ۛۡ;

    return-void

    :sswitch_5
    new-instance v2, Ll/ۤۡܳ;

    invoke-direct {v2, v1}, Ll/ۤۡܳ;-><init>(Ll/ۧۢܳ;)V

    .line 85
    sget p2, Ll/֡۬;->۠֡᩶:I

    if-gtz p2, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string p2, "\u06d6\u06df"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    add-int/2addr p2, v5

    mul-int/lit8 p2, p2, 0x3b

    xor-int v6, p2, v4

    mul-int/lit16 v6, v6, -0xa77

    const v8, -0x78a5f6a4

    xor-int/2addr v6, v8

    const v8, 0x5efde7bc

    goto/16 :goto_6

    .line 549
    :sswitch_6
    iget-object v1, p1, Ll/ᩳܺܳ;->ܳ:Ll/ۧۢܳ;

    invoke-static {v1}, Ll/ۗۚ;->ܶۚ᩻(Ljava/lang/Object;)Ljava/lang/Object;

    sget p2, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz p2, :cond_2

    goto :goto_3

    :cond_2
    const-string p2, "\u06e0\u06e2"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v5

    mul-int/lit8 p2, p2, -0x79

    xor-int v6, p2, v4

    mul-int/lit16 v6, v6, -0x3869

    const v8, -0xa2ea648

    xor-int/2addr v6, v8

    const v8, -0x373ffd88    # -393235.75f

    goto/16 :goto_6

    :sswitch_7
    new-instance v7, Ll/᩵ۛۡ;

    invoke-virtual {p3}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v8

    .line 6
    sget p2, Ll/֨۬;->۫ۙ᩺:I

    if-gtz p2, :cond_3

    goto :goto_2

    .line 389
    :cond_3
    sget p2, Ll/֡֡;->֫ۤܳ:I

    if-ltz p2, :cond_5

    :cond_4
    :goto_2
    const-string p2, "\u1a76\u06ec"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v5

    xor-int v6, p2, v4

    mul-int/lit16 v6, v6, 0x12b3

    const v7, -0x6470adc6

    xor-int/2addr v6, v7

    const v7, 0x3bd7667b

    goto/16 :goto_0

    :cond_5
    sget-boolean p2, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez p2, :cond_6

    goto :goto_5

    :cond_6
    sget p2, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz p2, :cond_7

    goto :goto_3

    :cond_7
    sget-boolean p2, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez p2, :cond_8

    goto :goto_3

    .line 23
    :cond_8
    sget p2, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz p2, :cond_9

    :goto_3
    const-string p2, "\u0736\u073a"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v5

    xor-int v6, p2, v4

    mul-int/lit16 v6, v6, -0x2caf

    const v7, 0x3034c629

    xor-int/2addr v6, v7

    const v7, -0x63c618ee

    goto/16 :goto_0

    :cond_9
    sget p2, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz p2, :cond_a

    :goto_4
    const-string p2, "\u1a74\u1a74"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v4

    xor-int v6, p2, v5

    mul-int/lit16 v6, v6, 0x1fa9

    const v7, -0x72c66931

    xor-int/2addr v6, v7

    const v7, -0x4fca3e3

    goto/16 :goto_0

    .line 549
    :cond_a
    invoke-direct {v7, v8, v9}, Ll/᩵ۛۡ;-><init>(J)V

    .line 156
    sget-boolean p2, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz p2, :cond_c

    :cond_b
    :goto_5
    const-string p2, "\u06e0\u05a1"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    sub-int p2, v4, p2

    mul-int/lit8 p2, p2, 0x73

    xor-int v6, p2, v5

    mul-int/lit16 v6, v6, 0x513d

    const v7, 0x7bceef27

    xor-int/2addr v6, v7

    const v7, 0xf81ee11

    goto/16 :goto_0

    :cond_c
    const-string p2, "\u1a74\u06df"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v4

    mul-int/lit8 p2, p2, 0x3b

    xor-int v6, p2, v5

    mul-int/lit16 v6, v6, 0x3649

    const v8, -0x5cd4374

    xor-int/2addr v6, v8

    const v8, -0x1d7cd250

    :goto_6
    xor-int/2addr p2, v8

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x5d1bfcae -> :sswitch_3
        -0x5cbedb4c -> :sswitch_6
        -0x513c2a7c -> :sswitch_5
        -0x4c7cdad1 -> :sswitch_4
        -0x457d20ea -> :sswitch_0
        -0xc7beaab -> :sswitch_3
        0x97a4ab3 -> :sswitch_0
        0x15a83aa1 -> :sswitch_6
        0x1a9a5ced -> :sswitch_2
        0x1d6f838d -> :sswitch_2
        0x2ce76f9f -> :sswitch_1
        0x359549ed -> :sswitch_1
        0x55a3df04 -> :sswitch_7
        0x786198c0 -> :sswitch_4
        0x795bb036 -> :sswitch_5
        0x7cbda65d -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final read()I
    .locals 18

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const v11, 0x52bdbea8

    sget v12, Ll/֨ۤ;->ܿۖ᩵:I

    sget v13, Ll/ۗ᩶;->ۛ֨ۘ:I

    const-string v14, "\u05a8\u06e0"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x3d83

    const v16, 0x5feaa6ff

    xor-int v15, v15, v16

    const v16, 0x48d8cdd4

    :goto_0
    xor-int v14, v14, v16

    :goto_1
    xor-int/2addr v11, v13

    mul-int/lit16 v11, v11, 0x5699

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    .line 554
    new-instance v14, Ljava/lang/RuntimeException;

    sget-object v15, Ll/ۛۡܳ;->ۜۨ۠:[S

    .line 495
    sget v16, Ll/֡֡;->֫ۤܳ:I

    if-ltz v16, :cond_3

    goto :goto_2

    .line 535
    :sswitch_0
    sget-boolean v14, Ll/ۘۗ;->֡ܽ۫:Z

    if-nez v14, :cond_1

    :cond_0
    move/from16 v16, v1

    goto/16 :goto_6

    :cond_1
    move/from16 v16, v1

    goto :goto_3

    :sswitch_1
    sget v14, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v14, :cond_0

    :goto_2
    move/from16 v16, v1

    goto/16 :goto_5

    .line 70
    :sswitch_2
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    sget v14, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v14, :cond_d

    goto :goto_2

    .line 424
    :sswitch_3
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    goto :goto_2

    .line 114
    :sswitch_4
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    const/4 v1, 0x0

    return v1

    :sswitch_5
    const/4 v3, 0x1

    .line 41
    invoke-static {v2, v3}, Ll/ۗ᩷;->ۧۧ᩻(Ljava/lang/Object;I)Z

    return v1

    .line 556
    :sswitch_6
    invoke-super/range {p0 .. p0}, Ljava/io/FilterInputStream;->read()I

    move-result v1

    .line 557
    iget-object v2, v0, Ll/ۛۡܳ;->᩸:Ll/᩵ۛۡ;

    sget v14, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v14, :cond_2

    goto/16 :goto_8

    :cond_2
    const-string v14, "\u1a74\u06eb"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x4aa1

    const v16, -0x26e104e2

    xor-int v15, v15, v16

    const v16, -0x443bc83b

    goto :goto_0

    :cond_3
    move/from16 v16, v1

    const/4 v1, 0x1

    .line 176
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v17

    if-nez v17, :cond_4

    :goto_3
    const-string v1, "\u06e8\u1a7b"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v13

    mul-int/lit8 v1, v1, 0x79

    xor-int v14, v1, v12

    mul-int/lit16 v14, v14, -0x2349

    const v15, 0x3eaf6702

    xor-int/2addr v15, v14

    const v14, -0x18ba466d

    goto/16 :goto_9

    :cond_4
    const/16 v2, 0x8

    .line 554
    invoke-static {v15, v1, v2, v10}, Ll/ۘܿ;->ۢۙۨ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v14, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v14

    :sswitch_7
    move/from16 v16, v1

    .line 553
    iget-object v1, v0, Ll/ۛۡܳ;->᩹:Ll/ᩳܺܳ;

    iget-object v1, v1, Ll/ᩳܺܳ;->ܳ:Ll/ۧۢܳ;

    invoke-virtual {v1}, Ll/ۧۢܳ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, "\u06e7\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v12

    mul-int/lit8 v1, v1, -0x57

    xor-int v14, v1, v13

    mul-int/lit16 v14, v14, -0x361b

    const v15, 0x415da47

    xor-int/2addr v15, v14

    const v14, -0x1035e293

    goto/16 :goto_9

    :cond_5
    const-string v1, "\u06eb\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    mul-int/lit8 v1, v1, 0x25

    xor-int v14, v1, v12

    mul-int/lit16 v14, v14, 0x6fd9

    const v15, -0x743415b7

    xor-int/2addr v15, v14

    const v14, 0x6f7846c1

    goto/16 :goto_9

    :sswitch_8
    move/from16 v16, v1

    const v1, 0x86ec

    const v10, 0x86ec

    goto :goto_4

    :sswitch_9
    move/from16 v16, v1

    const v1, 0xd642

    const v10, 0xd642

    :goto_4
    const-string v1, "\u1a73\u06d8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v12

    mul-int/lit8 v1, v1, -0x21

    xor-int v14, v1, v13

    mul-int/lit16 v14, v14, -0x5ced

    const v15, -0x553fa43e

    xor-int/2addr v15, v14

    const v14, -0x14f93fd4

    goto/16 :goto_9

    :sswitch_a
    move/from16 v16, v1

    mul-int v1, v9, v9

    sub-int/2addr v1, v7

    if-gez v1, :cond_6

    const-string v1, "\u0733\u06e7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v13, v1

    mul-int/lit8 v1, v1, -0x57

    xor-int v14, v1, v12

    mul-int/lit16 v14, v14, 0x7f03

    const v15, 0x37b2c542

    xor-int/2addr v15, v14

    const v14, 0x3e96e9b1

    goto/16 :goto_9

    :cond_6
    const-string v1, "\u0733\u06e4"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v12

    xor-int v14, v1, v13

    mul-int/lit16 v14, v14, 0x401f

    const v15, 0x49dfdb84    # 1833840.5f

    xor-int/2addr v15, v14

    const v14, -0x5f8a1921

    goto/16 :goto_9

    :sswitch_b
    move/from16 v16, v1

    add-int v9, v5, v8

    .line 27
    sget-boolean v1, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v1, :cond_7

    :goto_5
    const-string v1, "\u06eb\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v14, v1, v12

    mul-int/lit16 v14, v14, 0x46db

    const v15, 0x5e569458

    xor-int/2addr v15, v14

    const v14, 0x35109ee6

    goto/16 :goto_9

    :cond_7
    const-string v1, "\u06ec\u073d"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v14, v1, v12

    mul-int/lit16 v14, v14, 0x7883

    const v15, -0x6e71bb20

    xor-int/2addr v15, v14

    const v14, -0x51ad93e2

    goto/16 :goto_9

    :sswitch_c
    move/from16 v16, v1

    mul-int v7, v5, v6

    const/16 v8, 0x122

    .line 245
    sget v1, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v1, :cond_8

    goto :goto_6

    :cond_8
    const-string v1, "\u0730\u06da"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v13

    mul-int/lit8 v1, v1, -0x61

    xor-int v14, v1, v12

    mul-int/lit16 v14, v14, -0x539b

    const v15, 0x62590dd1    # 1.00098476E21f

    xor-int/2addr v15, v14

    const v14, -0x5b7481bd

    goto/16 :goto_9

    :sswitch_d
    move/from16 v16, v1

    aget-short v5, v3, v4

    const/16 v6, 0x488

    sget v1, Ll/᩹;->ۤܿܳ:I

    if-eqz v1, :cond_9

    goto :goto_7

    :cond_9
    const-string v1, "\u06d6\u073f"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v12

    mul-int/lit8 v1, v1, -0x61

    xor-int v14, v1, v13

    mul-int/lit16 v14, v14, -0x20d5

    const v15, -0x136f5a27

    xor-int/2addr v15, v14

    const v14, 0x166ad0e0

    goto/16 :goto_9

    :sswitch_e
    move/from16 v16, v1

    const/4 v4, 0x0

    .line 194
    sget v1, Ll/۠;->ܺܺܶ:I

    if-ltz v1, :cond_a

    goto :goto_7

    :cond_a
    const-string v1, "\u06ec\u1a79"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v14, v1, v12

    mul-int/lit16 v14, v14, -0x64cf

    const v15, 0x5ce9c187

    xor-int/2addr v15, v14

    const v14, 0x1a750f35

    goto/16 :goto_9

    :sswitch_f
    move/from16 v16, v1

    .line 125
    sget v1, Ll/֡۬;->۠֡᩶:I

    if-gtz v1, :cond_b

    :goto_6
    const-string v1, "\u073d\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v14, v1, v12

    mul-int/lit16 v14, v14, -0x39fd

    const v15, -0x24bf3483

    xor-int/2addr v15, v14

    const v14, 0x2708cd92

    goto/16 :goto_9

    :cond_b
    const-string v1, "\u1a74\u06db"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v12

    mul-int/lit8 v1, v1, 0x6d

    xor-int v14, v1, v13

    mul-int/lit16 v14, v14, 0x7eb3

    const v15, 0x4c82823b    # 6.8424152E7f

    xor-int/2addr v15, v14

    const v14, 0x1bd9419b

    goto :goto_9

    :sswitch_10
    move/from16 v16, v1

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v1

    if-gtz v1, :cond_c

    :goto_7
    const-string v1, "\u0733\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v12

    xor-int v14, v1, v13

    mul-int/lit16 v14, v14, 0x23d7

    const v15, 0x56892165

    xor-int/2addr v15, v14

    const v14, 0x5762f5dc

    goto :goto_9

    :cond_c
    const-string v1, "\u1a79\u06d8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v12

    xor-int v14, v1, v13

    mul-int/lit16 v14, v14, 0x2319

    const v15, 0x1e9eb183

    xor-int/2addr v15, v14

    const v14, 0x33fcdc88

    goto :goto_9

    :sswitch_11
    move/from16 v16, v1

    sget-object v3, Ll/ۛۡܳ;->ۜۨ۠:[S

    .line 80
    sget-boolean v1, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v1, :cond_e

    move/from16 v1, v16

    :cond_d
    :goto_8
    const-string v14, "\u1a7b\u073d"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x6d7

    const v16, -0x55d53d33

    xor-int v15, v15, v16

    const v16, -0x40748b2

    goto/16 :goto_0

    :cond_e
    const-string v1, "\u1a79\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    mul-int/lit8 v1, v1, -0x7f

    xor-int v14, v1, v12

    mul-int/lit16 v14, v14, -0x1af9

    const v15, -0x33bc3aab    # -5.1320148E7f

    xor-int/2addr v15, v14

    const v14, -0x835277

    :goto_9
    xor-int/2addr v14, v1

    move/from16 v1, v16

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7214d69e -> :sswitch_10
        -0x6f859446 -> :sswitch_7
        -0x6ec07a9b -> :sswitch_b
        -0x5623212e -> :sswitch_2
        -0x41781d62 -> :sswitch_f
        -0x3a5f817b -> :sswitch_11
        -0x34002053 -> :sswitch_2
        -0x261849cd -> :sswitch_4
        -0x25e5e92b -> :sswitch_0
        -0x256ed2f9 -> :sswitch_a
        -0x1c6a6715 -> :sswitch_5
        -0x191ef108 -> :sswitch_1
        -0x156665e5 -> :sswitch_d
        -0xef88b25 -> :sswitch_9
        -0xc52a2d1 -> :sswitch_0
        -0x97df4b8 -> :sswitch_d
        -0x2b4c747 -> :sswitch_10
        0x4265538 -> :sswitch_6
        0x195e54bb -> :sswitch_3
        0x1c4ca5bf -> :sswitch_4
        0x248afbdd -> :sswitch_c
        0x26a3238b -> :sswitch_e
        0x281a7a3e -> :sswitch_7
        0x2d0d05a7 -> :sswitch_9
        0x36bf085b -> :sswitch_5
        0x3ed11830 -> :sswitch_8
        0x42a544bf -> :sswitch_a
        0x469f2e0d -> :sswitch_8
        0x5608e19f -> :sswitch_b
        0x5ca3b990 -> :sswitch_e
        0x661eb066 -> :sswitch_6
        0x66979deb -> :sswitch_f
        0x70f49e94 -> :sswitch_1
        0x7358384e -> :sswitch_c
        0x75b39867 -> :sswitch_11
        0x76838e05 -> :sswitch_3
    .end sparse-switch
.end method

.method public final read([BII)I
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0x625e5253

    sget v5, Ll/ۘܿ;->ۘܰ۫:I

    sget v6, Ll/֨۬;->۫ۙ᩺:I

    const-string v7, "\u1a73\u06d8"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x579b

    const v9, -0x1de1be2a

    xor-int/2addr v8, v9

    const v9, 0x77bbe6e6

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v5

    mul-int/lit16 v4, v4, 0x686d

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    const/16 v3, 0x79e

    goto/16 :goto_2

    :sswitch_0
    sget v7, Ll/ۙۨ;->ۡۗۙ:I

    if-lez v7, :cond_b

    goto/16 :goto_4

    .line 85
    :sswitch_1
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    sget-boolean v7, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v7, :cond_9

    goto/16 :goto_6

    :sswitch_2
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    sget v7, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v7, :cond_d

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    :goto_1
    const-string v7, "\u06e7\u05a8"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x45

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x2e77

    const v9, -0x52ca9927

    xor-int/2addr v8, v9

    const v9, -0x4908317a

    goto :goto_0

    .line 211
    :sswitch_4
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    const/4 p1, 0x0

    return p1

    .line 566
    :sswitch_5
    invoke-super {p0, p1, p2, p3}, Ljava/io/FilterInputStream;->read([BII)I

    move-result p1

    .line 567
    iget-object p2, p0, Ll/ۛۡܳ;->᩸:Ll/᩵ۛۡ;

    invoke-static {p2, p1}, Ll/ۗ᩷;->ۧۧ᩻(Ljava/lang/Object;I)Z

    return p1

    .line 564
    :sswitch_6
    new-instance v7, Ljava/lang/RuntimeException;

    sget-object v8, Ll/ۛۡܳ;->ۜۨ۠:[S

    const/16 v9, 0xa

    .line 26
    sget-boolean v10, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v10, :cond_0

    goto/16 :goto_3

    :cond_0
    const/16 p1, 0x8

    .line 564
    invoke-static {v8, v9, p1, v3}, Ll/ۘۗ;->ۖ֫۠([SIII)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v7, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v7

    .line 563
    :sswitch_7
    iget-object v7, p0, Ll/ۛۡܳ;->᩹:Ll/ᩳܺܳ;

    iget-object v7, v7, Ll/ᩳܺܳ;->ܳ:Ll/ۧۢܳ;

    invoke-virtual {v7}, Ll/ۧۢܳ;->ۧ()Z

    move-result v7

    if-nez v7, :cond_1

    const-string v7, "\u1a73\u06e2"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x3837

    const v9, 0x4c93c2e4

    xor-int/2addr v8, v9

    const v9, -0x7001b419

    goto/16 :goto_0

    :cond_1
    const-string v7, "\u06d7\u073a"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x1efb

    const v9, -0x4d396242

    xor-int/2addr v8, v9

    const v9, -0x37e1466f

    goto/16 :goto_0

    :sswitch_8
    const/16 v3, 0x4ef1

    :goto_2
    const-string v7, "\u1a78\u0730"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x7243

    const v9, 0x787e62b4

    xor-int/2addr v8, v9

    const v9, -0x12ee2b6d

    goto/16 :goto_0

    :sswitch_9
    const v7, 0xa24389

    add-int/2addr v7, v2

    sub-int/2addr v7, v1

    if-gez v7, :cond_2

    const-string v7, "\u1a73\u1a79"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x7b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x2b03

    const v9, -0x6abb9441

    xor-int/2addr v8, v9

    const v9, 0x1b7e0e50

    goto/16 :goto_0

    :cond_2
    const-string v7, "\u06eb\u06e8"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x5b35

    const v9, 0x60e31c61

    xor-int/2addr v8, v9

    const v9, -0x521e1913

    goto/16 :goto_0

    :sswitch_a
    mul-int/lit16 v1, v0, 0x197a

    mul-int v2, v0, v0

    .line 408
    sget v7, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v7, :cond_3

    goto :goto_3

    :cond_3
    const-string v7, "\u06dc\u1a75"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x9f

    const v9, -0x554b4154

    xor-int/2addr v8, v9

    const v9, -0x1ee4cafe

    goto/16 :goto_0

    :sswitch_b
    sget-object v0, Ll/ۛۡܳ;->ۜۨ۠:[S

    const/16 v7, 0x9

    aget-short v0, v0, v7

    .line 429
    sget v7, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v7, :cond_4

    goto :goto_3

    :cond_4
    const-string v7, "\u06d8\u1a78"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x2e67

    const v9, 0x24730a71

    xor-int/2addr v8, v9

    const v9, 0x6a28726c

    goto/16 :goto_0

    .line 500
    :sswitch_c
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v7

    if-eqz v7, :cond_5

    :goto_3
    const-string v7, "\u1a73\u06e7"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x783b

    const v9, 0x767fe1ef

    xor-int/2addr v8, v9

    const v9, -0x76e89aba

    goto/16 :goto_0

    :cond_5
    const-string v7, "\u06d9\u073a"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7b29

    const v9, -0x57989ce2

    xor-int/2addr v8, v9

    const v9, -0x51ab190f

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v7

    if-gtz v7, :cond_6

    goto :goto_4

    :cond_6
    const-string v7, "\u05a8\u0736"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x7b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7d5

    const v9, 0x2c29de24

    xor-int/2addr v8, v9

    const v9, -0x71e7b7e6

    goto/16 :goto_0

    .line 347
    :sswitch_e
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v7

    if-eqz v7, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v7, "\u0730\u1a77"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x33

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x51fb

    const v9, 0x75f5ed4

    xor-int/2addr v8, v9

    const v9, -0xc141c84

    goto/16 :goto_0

    .line 56
    :sswitch_f
    sget v7, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v7, :cond_8

    goto :goto_5

    :cond_8
    const-string v7, "\u06e2\u05a8"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x1c0d

    const v9, -0x7dc891a

    xor-int/2addr v8, v9

    const v9, -0x44cb3169

    goto/16 :goto_0

    .line 454
    :sswitch_10
    sget v7, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v7, :cond_a

    :cond_9
    :goto_4
    const-string v7, "\u06e8\u06e8"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x35

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x52e9

    const v9, 0x2351fbfe

    xor-int/2addr v8, v9

    const v9, 0x31e18335

    goto/16 :goto_0

    :cond_a
    const-string v7, "\u05a8\u06e7"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3379

    const v9, 0x44db1558

    xor-int/2addr v8, v9

    const v9, 0x84bb626

    goto/16 :goto_0

    :sswitch_11
    sget v7, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v7, :cond_c

    :cond_b
    :goto_5
    const-string v7, "\u0730\u06e2"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x2d93

    const v9, 0x752aa863

    xor-int/2addr v8, v9

    const v9, -0x48a54d6b

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u05a1\u05a1"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x61

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x3a55

    const v9, -0x596ddef4

    xor-int/2addr v8, v9

    const v9, -0x5b0e7b8e

    goto/16 :goto_0

    .line 199
    :sswitch_12
    sget v7, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v7, :cond_e

    :cond_d
    :goto_6
    const-string v7, "\u06d7\u05a1"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x23

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6975

    const v9, 0x65f49e24

    xor-int/2addr v8, v9

    const v9, -0x14b87707

    goto/16 :goto_0

    :cond_e
    const-string v7, "\u06da\u1a7b"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x39

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x11bb

    const v9, 0x77f6a910    # 1.00057345E34f

    xor-int/2addr v8, v9

    const v9, -0x2a207e5a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e6fa7a6 -> :sswitch_0
        -0x764a5c1b -> :sswitch_4
        -0x6316436f -> :sswitch_3
        -0x592fc548 -> :sswitch_b
        -0x4f1975bf -> :sswitch_4
        -0x490c39e2 -> :sswitch_c
        -0x4830cfea -> :sswitch_9
        -0x3f659ae6 -> :sswitch_6
        -0x3e921061 -> :sswitch_3
        -0x328801c0 -> :sswitch_f
        -0x273ca141 -> :sswitch_7
        -0x26422baf -> :sswitch_d
        -0x2133d64b -> :sswitch_a
        -0x1d8c72ec -> :sswitch_a
        -0x1660222d -> :sswitch_9
        -0x1055889f -> :sswitch_0
        -0xea71c46 -> :sswitch_8
        -0xe486686 -> :sswitch_10
        0xcf07d1 -> :sswitch_f
        0x7a660f0 -> :sswitch_5
        0xd9d21ad -> :sswitch_2
        0x14478e9a -> :sswitch_1
        0x18dd0d3b -> :sswitch_6
        0x252bce9f -> :sswitch_b
        0x30ef0ac9 -> :sswitch_11
        0x31785f4d -> :sswitch_e
        0x336f0449 -> :sswitch_e
        0x34cad293 -> :sswitch_8
        0x3f0146ff -> :sswitch_1
        0x45a91dca -> :sswitch_12
        0x4ca7d9b6 -> :sswitch_10
        0x55f98974 -> :sswitch_11
        0x6549fef3 -> :sswitch_7
        0x66269b44 -> :sswitch_c
        0x6dd43603 -> :sswitch_5
        0x7b6cef02 -> :sswitch_d
        0x7ebf8093 -> :sswitch_2
        0x7f3cdbeb -> :sswitch_12
    .end sparse-switch
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
