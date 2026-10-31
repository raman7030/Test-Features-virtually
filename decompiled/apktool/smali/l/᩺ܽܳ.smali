.class public final Ll/᩺ܽܳ;
.super Ljava/lang/Object;
.source "970R"

# interfaces
.implements Ll/᩹ܽܳ;


# static fields
.field private static final ۧܰۚ:[S


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:Ll/۫ܽܳ;

.field public final ᩳ:Ll/ۧᩳܳ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3f

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩺ܽܳ;->ۧܰۚ:[S

    return-void

    :array_0
    .array-data 2
        0x7dds
        -0x385bs
        -0x387es
        -0x3866s
        -0x3873s
        -0x3880s
        -0x387bs
        -0x3878s
        -0x3834s
        -0x3864s
        -0x3873s
        -0x3868s
        -0x3868s
        -0x3877s
        -0x3862s
        -0x387es
        -0x3834s
        -0x3864s
        -0x3873s
        -0x3868s
        -0x3871s
        -0x387cs
        -0x3834s
        -0x3880s
        -0x3873s
        -0x386bs
        -0x3877s
        -0x3862s
        0x20e6s
        0x6c30s
        0x6c18s
        0x6c05s
        0x6c01s
        0x6c0cs
        0x6c55s
        0x6c13s
        0x6c1cs
        0x6c19s
        0x6c01s
        0x6c10s
        0x6c07s
        0x6c10s
        0x6c11s
        0x6c55s
        0x6c05s
        0x6c14s
        0x6c01s
        0x6c01s
        0x6c10s
        0x6c07s
        0x6c1bs
        0x6c55s
        0x6c05s
        0x6c14s
        0x6c01s
        0x6c16s
        0x6c1ds
        0x6c55s
        0x6c19s
        0x6c14s
        0x6c0cs
        0x6c10s
        0x6c07s
    .end array-data
.end method

.method public constructor <init>(Ll/۫ܽܳ;Ll/ۧᩳܳ;II)V
    .locals 8

    const v0, 0x530f687c

    sget v1, Ll/֡֡;->֫ۤܳ:I

    sget v2, Ll/֡᩺;->ᩴ᩹ۛ:I

    sget-object v3, Ll/᩺ܽܳ;->ۧܰۚ:[S

    const/4 v4, 0x0

    aget-short v3, v3, v4

    const v4, 0xcb24

    mul-int v4, v4, v3

    add-int/lit16 v3, v3, 0x32c9

    mul-int v3, v3, v3

    sub-int/2addr v3, v4

    if-gez v3, :cond_0

    const/16 v3, 0x6daf

    goto :goto_0

    :cond_0
    const v3, 0xc7ec

    .line 843
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u06ec\u06ec"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x3b

    xor-int v5, v4, v1

    mul-int/lit16 v5, v5, 0x4203

    const v6, 0x1e1395f1

    xor-int/2addr v5, v6

    const v6, -0x56850bf2

    :goto_1
    xor-int/2addr v4, v6

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0xddb

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v5

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_0

    .line 847
    sget-boolean v4, Ll/֫ۡ;->۠ۤۜ:Z

    if-nez v4, :cond_8

    goto :goto_2

    :sswitch_0
    sget v4, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-lez v4, :cond_2

    goto/16 :goto_4

    .line 17
    :sswitch_1
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    sget v4, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v4, :cond_a

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    :goto_2
    const-string v4, "\u06e7\u0733"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v1

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x55df

    const v6, -0x22570e51

    xor-int/2addr v5, v6

    const v6, 0x42110c5

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 849
    :sswitch_4
    iput p3, p0, Ll/᩺ܽܳ;->ۧ:I

    .line 850
    iput p4, p0, Ll/᩺ܽܳ;->֫:I

    return-void

    .line 847
    :sswitch_5
    iput-object p1, p0, Ll/᩺ܽܳ;->ܽ:Ll/۫ܽܳ;

    .line 848
    iput-object p2, p0, Ll/᩺ܽܳ;->ᩳ:Ll/ۧᩳܳ;

    sget-boolean v4, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v4, "\u05a8\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v1

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5145

    const v6, -0x3fe683fa

    xor-int/2addr v5, v6

    const v6, 0x64fbcd60

    goto :goto_1

    :sswitch_6
    if-ge p3, p4, :cond_e

    const-string v4, "\u06d8\u05a1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v1

    mul-int/lit16 v5, v5, 0x6abd

    const v6, 0x44647e95

    xor-int/2addr v5, v6

    const v6, 0x6dad4f5f

    goto :goto_1

    .line 845
    :sswitch_7
    new-instance v4, Ljava/lang/IllegalArgumentException;

    sget-object v5, Ll/᩺ܽܳ;->ۧܰۚ:[S

    .line 636
    sget v6, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v6, :cond_3

    :cond_2
    const-string v4, "\u1a76\u06db"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v1, v4

    mul-int/lit8 v4, v4, -0x55

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x78f9

    const v6, 0x61855776

    xor-int/2addr v5, v6

    const v6, -0x76cb3cec

    goto/16 :goto_1

    .line 199
    :cond_3
    sget v6, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v6, :cond_4

    goto :goto_3

    .line 423
    :cond_4
    sget v6, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v6, :cond_5

    goto :goto_5

    .line 313
    :cond_5
    sget v6, Ll/֡֡;->֫ۤܳ:I

    if-ltz v6, :cond_6

    goto :goto_5

    :cond_6
    sget v6, Ll/۟;->ۗۤۛ:I

    if-eqz v6, :cond_7

    goto :goto_4

    .line 102
    :cond_7
    sget v6, Ll/֡֡;->֫ۤܳ:I

    if-ltz v6, :cond_9

    :cond_8
    :goto_3
    const-string v4, "\u06e0\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v1

    mul-int/lit16 v5, v5, 0x5917

    const v6, 0x5f113d88

    xor-int/2addr v5, v6

    const v6, 0x4f47bd26

    goto/16 :goto_1

    .line 786
    :cond_9
    sget v6, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v6, :cond_b

    :cond_a
    :goto_4
    const-string v4, "\u0730\u0733"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x65

    xor-int v5, v4, v1

    mul-int/lit16 v5, v5, -0x7077

    const v6, 0x78ec706b

    xor-int/2addr v5, v6

    const v6, 0x63fdf4e3

    goto/16 :goto_1

    .line 208
    :cond_b
    sget-boolean v6, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v6, :cond_c

    goto :goto_5

    :cond_c
    const/4 v6, 0x1

    .line 307
    sget-boolean v7, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v7, :cond_d

    :goto_5
    const-string v4, "\u06df\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v1

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x312b

    const v6, 0x79c3b51b

    xor-int/2addr v5, v6

    const v6, -0x2b8060b

    goto/16 :goto_1

    :cond_d
    const/16 p1, 0x1b

    .line 845
    invoke-static {v5, v6, p1, v3}, Ll/ۖ;->ܽ֡ܶ([SIII)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v4, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 844
    :sswitch_8
    invoke-virtual {p2}, Ll/ۧᩳܳ;->ܽ()I

    move-result v4

    if-eqz v4, :cond_e

    const-string v4, "\u06df\u0730"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v1

    mul-int/lit16 v5, v5, -0x18c5

    const v6, -0xe5ac12a

    xor-int/2addr v5, v6

    const v6, -0xe2147e7

    goto/16 :goto_1

    :cond_e
    const-string v4, "\u0736\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v1

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2de5

    const v6, -0x26ee74c4

    xor-int/2addr v5, v6

    const v6, -0x325f1701

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x6f6a6204 -> :sswitch_8
        -0x68f4d58a -> :sswitch_1
        -0x67a1e61b -> :sswitch_4
        -0x4fed3c83 -> :sswitch_5
        -0x3ef7b760 -> :sswitch_2
        -0x1ce0a315 -> :sswitch_4
        -0x1c1d7375 -> :sswitch_5
        -0x77b2f5e -> :sswitch_3
        -0x25bb8e2 -> :sswitch_7
        0x1e20bc6 -> :sswitch_0
        0x287c15e -> :sswitch_6
        0x3032f34b -> :sswitch_3
        0x310513d2 -> :sswitch_7
        0x3bc47367 -> :sswitch_0
        0x60135a43 -> :sswitch_2
        0x6514e521 -> :sswitch_8
        0x7971dc79 -> :sswitch_1
        0x7f917e35 -> :sswitch_6
    .end sparse-switch
.end method

.method public static bridge synthetic ֫(Ll/᩺ܽܳ;)Ll/۫ܽܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺ܽܳ;->ܽ:Ll/۫ܽܳ;

    return-object p0
.end method

.method public static synthetic ֫(Ll/᩺ܽܳ;II[BIII)V
    .locals 15

    move/from16 v0, p6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0x1513c30d

    sget v5, Ll/ۘᩴ;->ܿ۬ܿ:I

    sget v6, Ll/ۗۗ;->ۨ۬ۖ:I

    const-string v7, "\u0736\u06da"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3ad3

    const v9, 0x6f9d5dc2

    xor-int/2addr v8, v9

    const v9, -0x310111f

    xor-int/2addr v7, v9

    :goto_0
    xor-int/2addr v4, v5

    mul-int/lit16 v4, v4, -0x19bf

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    .line 396
    sget v9, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v9, :cond_7

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    sget-boolean v7, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v7, :cond_1

    :cond_0
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    goto/16 :goto_6

    :cond_1
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    goto/16 :goto_5

    :sswitch_1
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v7

    if-eqz v7, :cond_0

    :goto_1
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    goto/16 :goto_7

    .line 298
    :sswitch_2
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    sget-boolean v7, Ll/֫ۡ;->۠ۤۜ:Z

    if-nez v7, :cond_2

    goto :goto_1

    :cond_2
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    goto/16 :goto_3

    .line 183
    :sswitch_3
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    goto :goto_1

    .line 851
    :sswitch_4
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    return-void

    .line 882
    :sswitch_5
    invoke-static {v2}, Ll/۫ܽܳ;->֫(Ll/۫ܽܳ;)[B

    move-result-object v7

    sub-int v8, v1, v0

    add-int v9, p4, v1

    sub-int v9, v9, p5

    sub-int v10, v3, v1

    move-object/from16 v11, p3

    invoke-static {v7, v8, v11, v9, v10}, Ll/֫᩵;->ܳ۟ۖ(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v10, p0

    move/from16 v7, p2

    goto :goto_2

    :sswitch_6
    return-void

    :sswitch_7
    move/from16 v7, p2

    move-object/from16 v11, p3

    int-to-long v2, v7

    int-to-long v8, v0

    move-object v10, p0

    .line 879
    iget-object v12, v10, Ll/᩺ܽܳ;->ܽ:Ll/۫ܽܳ;

    .line 880
    invoke-virtual {v12}, Ll/۫ܽܳ;->ۧ()I

    move-result v13

    int-to-long v13, v13

    add-long/2addr v8, v13

    .line 879
    invoke-static {v2, v3, v8, v9}, Ll/ۗ᩵;->ۢܰܰ(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    if-ge v1, v3, :cond_3

    const-string v2, "\u1a74\u06da"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v5

    xor-int v8, v2, v6

    mul-int/lit16 v8, v8, -0x677d

    const v9, 0x7a9aca10

    xor-int/2addr v8, v9

    const v9, -0x5e7a3a32

    xor-int/2addr v2, v9

    move v7, v2

    move-object v2, v12

    goto/16 :goto_0

    :cond_3
    move-object v2, v12

    :goto_2
    const-string v8, "\u1a75\u06eb"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v5

    mul-int/lit16 v9, v9, -0x77f3

    const v12, 0x46162d51

    xor-int/2addr v9, v12

    const v12, -0x346eb5cf    # -1.9043426E7f

    xor-int/2addr v8, v12

    move v7, v8

    move v8, v9

    goto/16 :goto_0

    :sswitch_8
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    .line 878
    invoke-static {v8, v0}, Ll/ۘۨ;->᩺۬֨(II)I

    move-result v1

    .line 767
    sget v9, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v9, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v9, "\u06db\u06df"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v5, v9

    mul-int/lit8 v9, v9, 0x53

    xor-int v12, v9, v6

    mul-int/lit16 v12, v12, -0x5b93

    const v13, 0x30c77f1a

    xor-int/2addr v12, v13

    const v13, 0x7022dc15

    goto/16 :goto_8

    :sswitch_9
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v9

    if-ltz v9, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v9, "\u06df\u1a73"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v6

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, -0x18cb

    const v13, 0x2612d4aa

    xor-int/2addr v12, v13

    const v13, -0x2feb99bc

    goto/16 :goto_8

    :sswitch_a
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    .line 773
    sget v9, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v9, :cond_6

    goto/16 :goto_7

    :cond_6
    const-string v9, "\u1a7a\u06db"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v5, v9

    mul-int/lit8 v9, v9, -0xf

    xor-int v12, v9, v6

    mul-int/lit16 v12, v12, 0x2f8d

    const v13, -0xf00cfb0

    xor-int/2addr v12, v13

    const v13, 0x6954adbf

    goto/16 :goto_8

    :goto_3
    const-string v9, "\u0736\u06db"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v6

    mul-int/lit8 v9, v9, 0x71

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, 0x4a57

    const v13, -0x6ca50974

    xor-int/2addr v12, v13

    const v13, -0xfbdf1e5

    goto/16 :goto_8

    :cond_7
    const-string v9, "\u06eb\u1a75"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v6, v9

    mul-int/lit8 v9, v9, -0x53

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, -0x63d1

    const v13, -0x4107b070

    xor-int/2addr v12, v13

    const v13, 0x78bd358a

    goto/16 :goto_8

    :sswitch_b
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    .line 295
    sget v9, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v9, :cond_8

    :goto_4
    const-string v9, "\u1a73\u06d9"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v5

    mul-int/lit8 v9, v9, 0x45

    xor-int v12, v9, v6

    mul-int/lit16 v12, v12, -0x2ad1

    const v13, -0x235ab848

    xor-int/2addr v12, v13

    const v13, -0x33da83f

    goto/16 :goto_8

    :cond_8
    const-string v9, "\u05a8\u1a78"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v6

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, -0x7d83

    const v13, 0x5ff6dc40

    xor-int/2addr v12, v13

    const v13, 0x7a98feeb

    goto/16 :goto_8

    :sswitch_c
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    sget v9, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v9, :cond_9

    :goto_5
    const-string v9, "\u05a8\u05a8"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v6

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, -0x7553

    const v13, -0x54635c64

    xor-int/2addr v12, v13

    const v13, -0x5c5d165b

    goto/16 :goto_8

    :cond_9
    const-string v9, "\u1a79\u1a73"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v5

    mul-int/lit8 v9, v9, -0x4d

    xor-int v12, v9, v6

    mul-int/lit16 v12, v12, -0x7045

    const v13, 0x4b2cdac8    # 1.13282E7f

    xor-int/2addr v12, v13

    const v13, 0x6682a4e3

    goto/16 :goto_8

    :sswitch_d
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    sget v9, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v9, :cond_a

    goto/16 :goto_7

    :cond_a
    const-string v9, "\u06e7\u06dc"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v5

    mul-int/lit8 v9, v9, -0x7f

    xor-int v12, v9, v6

    mul-int/lit16 v12, v12, -0x27bd

    const v13, 0x11efffd8

    xor-int/2addr v12, v13

    const v13, 0x1aec226a

    goto/16 :goto_8

    :sswitch_e
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    .line 359
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v9

    if-gtz v9, :cond_b

    goto :goto_7

    :cond_b
    const-string v9, "\u06e8\u05a1"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v6

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, 0x47bb

    const v13, 0x7785c619

    xor-int/2addr v12, v13

    const v13, 0x49f10ac

    goto :goto_8

    :sswitch_f
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    .line 374
    sget v9, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v9, :cond_c

    :goto_6
    const-string v9, "\u05a8\u06e7"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v5

    mul-int/lit8 v9, v9, -0x73

    xor-int v12, v9, v6

    mul-int/lit16 v12, v12, -0x241d

    const v13, -0x30da2367

    xor-int/2addr v12, v13

    const v13, -0x46d39792

    goto :goto_8

    :cond_c
    const-string v9, "\u1a78\u0733"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v5

    xor-int v12, v9, v6

    mul-int/lit16 v12, v12, 0x8cb

    const v13, -0x16b5d061

    xor-int/2addr v12, v13

    const v13, 0xfbe76c5

    goto :goto_8

    :sswitch_10
    move-object v10, p0

    move/from16 v8, p1

    move/from16 v7, p2

    move-object/from16 v11, p3

    sget v9, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v9, :cond_d

    :goto_7
    const-string v9, "\u06dc\u073d"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v5

    xor-int v12, v9, v6

    mul-int/lit16 v12, v12, 0x6149

    const v13, 0x2f4e02b3

    xor-int/2addr v12, v13

    const v13, 0x20d486cb

    goto :goto_8

    :cond_d
    const-string v9, "\u1a7a\u073f"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v6

    xor-int v12, v9, v5

    mul-int/lit16 v12, v12, 0x4b29

    const v13, 0xd56d3af

    xor-int/2addr v12, v13

    const v13, 0x40f377ba

    :goto_8
    xor-int/2addr v9, v13

    move v7, v9

    move v8, v12

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d80ed3c -> :sswitch_b
        -0x7ccb3ce7 -> :sswitch_9
        -0x72f74881 -> :sswitch_e
        -0x6cfab478 -> :sswitch_d
        -0x66082e60 -> :sswitch_0
        -0x653cadfa -> :sswitch_3
        -0x59968364 -> :sswitch_b
        -0x4eb0f91e -> :sswitch_2
        -0x4cf3f5b1 -> :sswitch_c
        -0x4c5ba95f -> :sswitch_a
        -0x4a2d6ed8 -> :sswitch_f
        -0x4573602a -> :sswitch_2
        -0x3d01d6ce -> :sswitch_0
        -0x3b75ded9 -> :sswitch_3
        -0x1c25bbe3 -> :sswitch_5
        -0x1be4d606 -> :sswitch_f
        -0x18b990ec -> :sswitch_10
        -0x1776dde7 -> :sswitch_8
        -0x149d64ea -> :sswitch_c
        -0xe42ee7e -> :sswitch_d
        -0x8b09a71 -> :sswitch_5
        -0x1934b22 -> :sswitch_1
        -0x143f69d -> :sswitch_a
        0x519ceb4 -> :sswitch_9
        0x9cdd212 -> :sswitch_10
        0x21b2f60f -> :sswitch_6
        0x253653a7 -> :sswitch_8
        0x3eb0abb0 -> :sswitch_6
        0x5334deac -> :sswitch_7
        0x553c2220 -> :sswitch_7
        0x56808632 -> :sswitch_1
        0x5974d7d9 -> :sswitch_e
        0x5d6a5aa7 -> :sswitch_4
        0x761dc78d -> :sswitch_4
    .end sparse-switch
.end method

.method public static synthetic ֫(Ll/᩺ܽܳ;II[BI[JI)V
    .locals 21

    move/from16 v0, p6

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const v11, 0x6c75bc29

    sget v12, Ll/᩺;->ۙۛܶ:I

    sget v13, Ll/֨ᩴ;->ۢ֨ۖ:I

    const-string v14, "\u06dc\u06d6"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x3321

    const v16, -0x1bc75107

    xor-int v15, v15, v16

    const v16, 0x52af3bc6

    :goto_0
    xor-int v14, v14, v16

    :goto_1
    xor-int/2addr v11, v13

    mul-int/lit16 v11, v11, 0x23c9

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    .line 523
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v0

    if-eqz v0, :cond_8

    goto/16 :goto_5

    .line 684
    :sswitch_0
    sget v14, Ll/֡֡;->֫ۤܳ:I

    if-ltz v14, :cond_1

    :cond_0
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    goto/16 :goto_4

    :cond_1
    const-string v14, "\u1a78\u1a74"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x7a71

    const v16, 0x186be4cc

    xor-int v15, v15, v16

    const v16, 0x55b07c72

    goto :goto_0

    .line 3
    :sswitch_1
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v14

    if-eqz v14, :cond_0

    :cond_2
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    goto/16 :goto_5

    .line 286
    :sswitch_2
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    sget-boolean v14, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v14, :cond_2

    :goto_2
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    :goto_3
    move/from16 v17, v1

    goto/16 :goto_8

    .line 626
    :sswitch_3
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    goto :goto_2

    :sswitch_4
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    return-void

    :sswitch_5
    sub-int v0, v1, p4

    sub-int v1, v8, v1

    move-object/from16 v14, p3

    .line 912
    invoke-static {v9, v10, v14, v0, v1}, Ll/ۗ᩷;->ۢۚܺ(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int v8, v8, p4

    move-object/from16 v15, p5

    .line 914
    invoke-static {v0, v8, v15}, Ll/ܿᩳܳ;->֫(II[J)V

    return-void

    :sswitch_6
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    int-to-long v8, v7

    add-long/2addr v8, v4

    .line 910
    invoke-static {v2, v3, v8, v9}, Ll/ۗ᩵;->ۢܰܰ(JJ)J

    move-result-wide v8

    long-to-int v8, v8

    .line 912
    invoke-static {v6}, Ll/۫ܽܳ;->֫(Ll/۫ܽܳ;)[B

    move-result-object v9

    sub-int v10, v1, v0

    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v16

    if-ltz v16, :cond_3

    goto :goto_3

    :cond_3
    const-string v16, "\u06da\u1a7b"

    invoke-static/range {v16 .. v16}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v13

    move/from16 v17, v1

    xor-int v1, v16, v12

    mul-int/lit16 v1, v1, 0x7f85

    const v18, 0x285a211f

    xor-int v1, v1, v18

    const v18, 0x9057bcd

    xor-int v16, v16, v18

    move v15, v1

    move/from16 v14, v16

    move/from16 v1, v17

    goto/16 :goto_1

    :sswitch_7
    move/from16 v1, p1

    move-object/from16 v14, p3

    move-object/from16 v15, p5

    .line 909
    invoke-static {v1, v0}, Ll/֡ۜ;->۟᩻۠(II)I

    move-result v2

    move/from16 v3, p2

    int-to-long v4, v3

    int-to-long v6, v0

    move-object/from16 v0, p0

    .line 910
    iget-object v1, v0, Ll/᩺ܽܳ;->ܽ:Ll/۫ܽܳ;

    .line 911
    invoke-virtual {v1}, Ll/۫ܽܳ;->ۧ()I

    move-result v16

    .line 708
    sget v17, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v17, :cond_4

    move-wide/from16 v19, v6

    move-object v6, v1

    move v1, v2

    move-wide v2, v4

    move-wide/from16 v4, v19

    move/from16 v7, v16

    goto/16 :goto_7

    :cond_4
    const-string v17, "\u1a75\u06ec"

    invoke-static/range {v17 .. v17}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v12

    xor-int v0, v17, v13

    mul-int/lit16 v0, v0, 0xad9

    const v18, -0xb437ea2

    xor-int v0, v0, v18

    const v18, 0x45b04a99

    xor-int v17, v17, v18

    move v15, v0

    move/from16 v14, v17

    move/from16 v0, p6

    move-wide/from16 v19, v6

    move-object v6, v1

    move v1, v2

    move-wide v2, v4

    move-wide/from16 v4, v19

    move/from16 v7, v16

    goto/16 :goto_1

    :sswitch_8
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    .line 439
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v0

    if-eqz v0, :cond_5

    goto/16 :goto_8

    :cond_5
    const-string v0, "\u1a7b\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x43

    xor-int v1, v0, v12

    mul-int/lit16 v1, v1, 0x72b1

    const v16, -0x1702a9bd

    xor-int v1, v1, v16

    const v16, 0x685a8d12

    goto/16 :goto_9

    :sswitch_9
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    .line 480
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v0

    if-eqz v0, :cond_6

    :goto_4
    const-string v0, "\u06d7\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    mul-int/lit8 v0, v0, -0x39

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x1587

    const v16, -0x4be1647c

    xor-int v1, v1, v16

    const v16, 0x1ea7a674

    goto/16 :goto_9

    :cond_6
    const-string v0, "\u06d7\u1a77"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v12

    mul-int/lit8 v0, v0, 0x37

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x79e1

    const v16, 0x1085eca

    xor-int v1, v1, v16

    const v16, 0x25ef5950

    goto/16 :goto_9

    :sswitch_a
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    sget-boolean v0, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v0, :cond_7

    goto :goto_5

    :cond_7
    const-string v0, "\u0730\u06d6"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x41

    xor-int v1, v0, v12

    mul-int/lit16 v1, v1, 0x491d

    const v16, 0x3d2f244c

    xor-int v1, v1, v16

    const v16, -0x222ea007

    goto/16 :goto_9

    :goto_5
    const-string v0, "\u06db\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v12

    mul-int/lit16 v1, v1, 0x7145

    const v16, -0x829830e

    xor-int v1, v1, v16

    const v16, 0x4e0ce1d9    # 5.9090285E8f

    goto/16 :goto_9

    :cond_8
    const-string v0, "\u05a1\u06d6"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    mul-int/lit8 v0, v0, 0x6b

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x79d

    const v16, 0x55eb8641

    xor-int v1, v1, v16

    const v16, 0x150490b7

    goto/16 :goto_9

    :sswitch_b
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    .line 593
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v0

    if-eqz v0, :cond_9

    goto/16 :goto_8

    :cond_9
    const-string v0, "\u1a73\u06e1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x29c3

    const v16, 0x53eaa061

    xor-int v1, v1, v16

    const v16, 0x74f54e8e

    goto/16 :goto_9

    :sswitch_c
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    .line 463
    sget-boolean v0, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v0, :cond_a

    :goto_6
    move/from16 v1, v17

    goto :goto_7

    :cond_a
    const-string v0, "\u06d8\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x63

    xor-int v1, v0, v12

    mul-int/lit16 v1, v1, 0x6901

    const v16, -0x63a35251

    xor-int v1, v1, v16

    const v16, -0x56af0abe

    goto/16 :goto_9

    :sswitch_d
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    .line 911
    sget v0, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v0, :cond_b

    goto :goto_6

    :goto_7
    const-string v0, "\u05ab\u073d"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    move/from16 v16, v1

    xor-int v1, v0, v12

    mul-int/lit16 v1, v1, -0x4401

    const v17, -0x5182c3b9

    xor-int v1, v1, v17

    const v17, 0x34335d72

    xor-int v0, v0, v17

    move v14, v0

    move v15, v1

    move/from16 v1, v16

    goto :goto_a

    :cond_b
    const-string v0, "\u06ec\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x3f7f

    const v16, 0x3951b2f5    # 1.999846E-4f

    xor-int v1, v1, v16

    const v16, -0x248d922c

    goto :goto_9

    :sswitch_e
    move-object/from16 v14, p3

    move-object/from16 v15, p5

    move/from16 v17, v1

    .line 320
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v0

    if-ltz v0, :cond_c

    :goto_8
    const-string v0, "\u06eb\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v12

    mul-int/lit8 v0, v0, -0x25

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x65b1

    const v16, -0x7437f58

    xor-int v1, v1, v16

    const v16, 0x3539b287

    goto :goto_9

    :cond_c
    const-string v0, "\u073a\u05ab"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v12

    mul-int/lit16 v1, v1, 0xaf5

    const v16, 0x3d53cc53

    xor-int v1, v1, v16

    const v16, -0x7b3d1e59

    :goto_9
    xor-int v0, v0, v16

    move v14, v0

    move v15, v1

    move/from16 v1, v17

    :goto_a
    move/from16 v0, p6

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x74d36363 -> :sswitch_1
        -0x6cd7725b -> :sswitch_a
        -0x64c4a255 -> :sswitch_0
        -0x5db91f58 -> :sswitch_e
        -0x59f2dcf9 -> :sswitch_5
        -0x59ca7a83 -> :sswitch_7
        -0x533396cc -> :sswitch_9
        -0x511e6a76 -> :sswitch_4
        -0x4e56bfab -> :sswitch_5
        -0x49e91eeb -> :sswitch_8
        -0x452dbe54 -> :sswitch_3
        -0x3dd40fd6 -> :sswitch_0
        -0x374e5f3d -> :sswitch_2
        -0x229421b2 -> :sswitch_9
        -0x1f864fcc -> :sswitch_6
        -0x1efb737d -> :sswitch_3
        -0x19e3de1f -> :sswitch_b
        -0x125361f2 -> :sswitch_b
        -0x116e4903 -> :sswitch_c
        -0x5447b5b -> :sswitch_1
        -0x51764ef -> :sswitch_a
        0x3364461 -> :sswitch_4
        0x498b5f2 -> :sswitch_7
        0x1d5e95f6 -> :sswitch_c
        0x1ee4596e -> :sswitch_2
        0x2bcab23d -> :sswitch_d
        0x374eec8d -> :sswitch_8
        0x6216f8a3 -> :sswitch_d
        0x674ce65f -> :sswitch_e
        0x7050776d -> :sswitch_6
    .end sparse-switch
.end method

.method public static synthetic ֫(Ll/᩺ܽܳ;II[JII)V
    .locals 17

    move/from16 v0, p5

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const v8, -0x11a9d620

    sget v9, Ll/ۗ᩺;->ۡ᩺֡:I

    sget v10, Ll/ۘۨ;->۫᩸۠:I

    const-string v11, "\u1a75\u06e4"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x4dad

    const v13, -0x35fcffe1

    xor-int/2addr v12, v13

    const v13, -0x2cfaee30

    xor-int/2addr v11, v13

    :goto_0
    xor-int/2addr v8, v10

    mul-int/lit16 v8, v8, 0x7ba3

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v8, v12

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_0

    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    return-void

    .line 154
    :sswitch_0
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v11

    if-gtz v11, :cond_0

    :goto_1
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    goto/16 :goto_3

    :cond_0
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    goto/16 :goto_5

    :sswitch_1
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v11

    if-eqz v11, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    goto/16 :goto_2

    .line 619
    :sswitch_2
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    sget v11, Ll/ۘۘ;->᩷ۙ᩸:I

    if-gez v11, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    goto :goto_1

    :sswitch_4
    long-to-int v0, v6

    sub-int v1, v1, p4

    sub-int v0, v0, p4

    move-object/from16 v11, p3

    .line 944
    invoke-static {v1, v0, v11}, Ll/ܿᩳܳ;->֫(II[J)V

    return-void

    :sswitch_5
    move-object/from16 v12, p0

    move-object/from16 v11, p3

    .line 942
    iget-object v6, v12, Ll/᩺ܽܳ;->ܽ:Ll/۫ܽܳ;

    .line 943
    invoke-virtual {v6}, Ll/۫ܽܳ;->ۧ()I

    move-result v6

    int-to-long v6, v6

    add-long/2addr v6, v4

    .line 942
    invoke-static {v2, v3, v6, v7}, Ll/ۗ᩵;->ۢܰܰ(JJ)J

    move-result-wide v6

    .line 596
    sget v13, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v13, :cond_3

    move/from16 v13, p1

    move/from16 v14, p2

    goto/16 :goto_3

    :cond_3
    const-string v13, "\u05ab\u1a74"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v9

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, 0x1011

    const v15, 0x5afb5246

    xor-int/2addr v14, v15

    const v15, 0x26166ddc

    xor-int/2addr v13, v15

    move v11, v13

    move v12, v14

    goto/16 :goto_0

    :sswitch_6
    move-object/from16 v12, p0

    move/from16 v13, p1

    move-object/from16 v11, p3

    .line 941
    invoke-static {v13, v0}, Ll/֡ۜ;->۟᩻۠(II)I

    move-result v1

    move/from16 v14, p2

    int-to-long v2, v14

    int-to-long v4, v0

    sget v15, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v15, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v15, "\u1a73\u1a73"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v10

    mul-int/lit8 v15, v15, -0x25

    xor-int v0, v15, v9

    mul-int/lit16 v0, v0, -0x14cb

    const v16, 0x2668cc19

    xor-int v0, v0, v16

    const v16, -0xae74322

    xor-int v15, v15, v16

    move v12, v0

    move v11, v15

    goto/16 :goto_8

    :sswitch_7
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    .line 752
    sget v0, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v0, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v0, "\u06e1\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v10

    mul-int/lit8 v0, v0, -0x3f

    xor-int v15, v0, v9

    mul-int/lit16 v15, v15, -0x67af

    const v16, 0x15d08b4c

    xor-int v15, v15, v16

    const v16, 0x102b672f

    goto/16 :goto_7

    :sswitch_8
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    .line 201
    sget v0, Ll/֡֡;->֫ۤܳ:I

    if-ltz v0, :cond_6

    goto :goto_2

    :cond_6
    const-string v0, "\u05ab\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v9

    xor-int v15, v0, v10

    mul-int/lit16 v15, v15, 0x24f7

    const v16, -0x465007b6

    xor-int v15, v15, v16

    const v16, -0x591f9a58

    goto/16 :goto_7

    :sswitch_9
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v0

    if-eqz v0, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v0, "\u06d8\u06eb"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v10

    mul-int/lit8 v0, v0, -0x4f

    xor-int v15, v0, v9

    mul-int/lit16 v15, v15, -0x1237

    const v16, 0x2589e9ec

    xor-int v15, v15, v16

    const v16, -0x558b4240

    goto/16 :goto_7

    :sswitch_a
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    .line 876
    sget v0, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v0, :cond_8

    :goto_2
    const-string v0, "\u05a8\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v9

    xor-int v15, v0, v10

    mul-int/lit16 v15, v15, -0x4d5d

    const v16, 0x2357d302

    xor-int v15, v15, v16

    const v16, 0x5f9225c9

    goto/16 :goto_7

    :cond_8
    const-string v0, "\u06d7\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v9

    mul-int/lit8 v0, v0, -0x51

    xor-int v15, v0, v10

    mul-int/lit16 v15, v15, 0x22ab

    const v16, -0x511a46d9

    xor-int v15, v15, v16

    const v16, -0x7d15c8e4

    goto/16 :goto_7

    :sswitch_b
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    .line 123
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v0

    if-gtz v0, :cond_9

    :goto_3
    const-string v0, "\u05ab\u06dc"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v9

    mul-int/lit8 v0, v0, 0x7d

    xor-int v15, v0, v10

    mul-int/lit16 v15, v15, -0x400d

    const v16, -0x7f4d35cc

    xor-int v15, v15, v16

    const v16, 0x76b1aa26

    goto/16 :goto_7

    :cond_9
    const-string v0, "\u1a79\u06e2"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v10

    xor-int v15, v0, v9

    mul-int/lit16 v15, v15, -0x297f

    const v16, -0x5253d77d

    xor-int v15, v15, v16

    const v16, -0x5eca67f3

    goto/16 :goto_7

    :sswitch_c
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    .line 744
    sget v0, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v0, :cond_a

    :goto_4
    const-string v0, "\u06d8\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v10, v0

    mul-int/lit8 v0, v0, -0x9

    xor-int v15, v0, v9

    mul-int/lit16 v15, v15, -0x1369

    const v16, -0x4be0054d

    xor-int v15, v15, v16

    const v16, 0x470cf4d8

    goto/16 :goto_7

    :cond_a
    const-string v0, "\u06e8\u06df"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v9

    xor-int v15, v0, v10

    mul-int/lit16 v15, v15, -0x5eb5

    const v16, 0x21823e1b

    xor-int v15, v15, v16

    const v16, 0x1087b55

    goto :goto_7

    :sswitch_d
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    .line 699
    sget v0, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v0, :cond_b

    :goto_5
    const-string v0, "\u073a\u06e4"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v10

    xor-int v15, v0, v9

    mul-int/lit16 v15, v15, 0x78b3

    const v16, -0x7bd2783a

    xor-int v15, v15, v16

    const v16, -0x1b1466fb

    goto :goto_7

    :cond_b
    const-string v0, "\u06df\u06d7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v9

    mul-int/lit8 v0, v0, -0x39

    xor-int v15, v0, v10

    mul-int/lit16 v15, v15, 0x5c63

    const v16, -0x69550013

    xor-int v15, v15, v16

    const v16, 0x3335c807

    goto :goto_7

    :sswitch_e
    move-object/from16 v12, p0

    move/from16 v13, p1

    move/from16 v14, p2

    move-object/from16 v11, p3

    .line 577
    sget v0, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v0, :cond_c

    :goto_6
    const-string v0, "\u06e4\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v9

    xor-int v15, v0, v10

    mul-int/lit16 v15, v15, -0x5be1

    const v16, 0x4e984b6d

    xor-int v15, v15, v16

    const v16, 0x533a4dad

    goto :goto_7

    :cond_c
    const-string v0, "\u1a77\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v10

    mul-int/lit8 v0, v0, -0x5

    xor-int v15, v0, v9

    mul-int/lit16 v15, v15, 0x5e9

    const v16, 0x584efcd

    xor-int v15, v15, v16

    const v16, -0x3bc03978

    :goto_7
    xor-int v0, v0, v16

    move v11, v0

    move v12, v15

    :goto_8
    move/from16 v0, p5

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d7c6299 -> :sswitch_0
        -0x78d18135 -> :sswitch_b
        -0x71d46039 -> :sswitch_2
        -0x6a46bb07 -> :sswitch_6
        -0x610b2c99 -> :sswitch_3
        -0x5af85765 -> :sswitch_3
        -0x5372b23c -> :sswitch_a
        -0x46402053 -> :sswitch_d
        -0x3dabdb4d -> :sswitch_1
        -0x374b216f -> :sswitch_5
        -0x30afe8f5 -> :sswitch_0
        -0x3061f584 -> :sswitch_9
        -0x2f4e5418 -> :sswitch_b
        -0x17700b1f -> :sswitch_7
        -0x9bb41d1 -> :sswitch_4
        -0x8505441 -> :sswitch_4
        -0x6261a66 -> :sswitch_e
        0x20859fa -> :sswitch_1
        0x2bf2695 -> :sswitch_e
        0x6d178f5 -> :sswitch_c
        0xd1410c6 -> :sswitch_8
        0xe5d67f4 -> :sswitch_2
        0x15d056e6 -> :sswitch_8
        0x26d9207c -> :sswitch_9
        0x3df5c424 -> :sswitch_6
        0x47d58591 -> :sswitch_a
        0x55a997c9 -> :sswitch_5
        0x61649d67 -> :sswitch_d
        0x7759df76 -> :sswitch_7
        0x7eaac879 -> :sswitch_c
    .end sparse-switch
.end method

.method private ܽ(II)J
    .locals 48

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const v33, 0x1293a6e3

    sget v34, Ll/֫᩵;->ܶ᩻᩷:I

    sget v35, Ll/ۘۨ;->۫᩸۠:I

    const-string v36, "\u1a7a\u1a74"

    invoke-static/range {v36 .. v36}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v36

    sub-int v36, v35, v36

    mul-int/lit8 v36, v36, 0x9

    xor-int v3, v36, v34

    mul-int/lit16 v3, v3, 0x2753

    const v38, -0x5f4f089c

    xor-int v3, v3, v38

    const v38, 0x7cf23146

    xor-int v36, v36, v38

    move-wide/from16 v38, v12

    const/4 v0, 0x0

    const/16 v37, 0x0

    move-wide/from16 v42, v8

    const/4 v8, 0x0

    move-wide/from16 v44, v10

    const/4 v11, 0x0

    move-wide/from16 v9, v26

    move-wide/from16 v27, v44

    move-wide/from16 v25, v24

    move-wide/from16 v23, v22

    move-wide/from16 v21, v42

    move-wide/from16 v46, v6

    move-wide/from16 v6, v18

    move-wide/from16 v17, v46

    :goto_0
    xor-int v12, v33, v34

    mul-int/lit16 v12, v12, 0x45a5

    shr-int/lit8 v12, v12, 0x1f

    and-int/2addr v3, v12

    xor-int v33, v36, v3

    sparse-switch v33, :sswitch_data_0

    .line 381
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v3

    if-lez v3, :cond_1

    goto :goto_1

    :sswitch_0
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-gez v3, :cond_8

    :cond_0
    move/from16 v19, v0

    move-wide/from16 v40, v6

    move-wide/from16 v12, v38

    goto/16 :goto_b

    :sswitch_1
    sget-boolean v3, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v3, :cond_0

    :goto_1
    move/from16 v19, v0

    move-wide/from16 v40, v6

    goto/16 :goto_5

    :cond_1
    :goto_2
    move-object/from16 v1, p0

    move/from16 v19, v0

    move-wide/from16 v40, v6

    move-wide/from16 v12, v38

    goto/16 :goto_d

    .line 279
    :sswitch_2
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    goto :goto_1

    .line 346
    :sswitch_3
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    const-wide/16 v0, 0x0

    return-wide v0

    :sswitch_4
    int-to-long v0, v11

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    or-long v0, v0, v31

    return-wide v0

    :sswitch_5
    const/16 v3, 0x20

    shl-long v31, v29, v3

    .line 387
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v3

    if-ltz v3, :cond_2

    goto :goto_2

    :cond_2
    const-string v3, "\u1a78\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v34

    mul-int/lit8 v3, v3, 0x11

    xor-int v12, v3, v35

    mul-int/lit16 v12, v12, 0x3a6f

    const v13, -0x3457d2c9    # -2.2043246E7f

    xor-int/2addr v12, v13

    const v13, 0x771fa39a

    goto/16 :goto_7

    .line 1002
    :sswitch_6
    invoke-static {v6, v7, v9, v10}, Ll/ۗ᩵;->ۢܰܰ(JJ)J

    move-result-wide v11

    long-to-int v11, v11

    int-to-long v12, v0

    sget-boolean v3, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v3, :cond_3

    move/from16 v19, v0

    move-wide/from16 v40, v6

    move-wide/from16 v29, v12

    goto/16 :goto_5

    :cond_3
    const-string v3, "\u1a76\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v34

    move/from16 v19, v0

    xor-int v0, v3, v35

    mul-int/lit16 v0, v0, -0x1aef

    const v29, 0x7570b989

    xor-int v0, v0, v29

    const v29, -0x562979db

    xor-int v36, v3, v29

    move v3, v0

    move-wide/from16 v29, v12

    goto :goto_3

    :sswitch_7
    move/from16 v19, v0

    add-long v9, v23, v25

    .line 894
    sget v0, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v0, :cond_4

    move-wide/from16 v40, v6

    goto :goto_4

    :cond_4
    const-string v0, "\u06e0\u06e2"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v35, v0

    mul-int/lit8 v0, v0, -0x61

    xor-int v3, v0, v34

    mul-int/lit16 v3, v3, 0x604d

    const v12, 0x3b835dfb

    xor-int/2addr v3, v12

    const v12, 0x67d68c77

    xor-int v36, v0, v12

    :goto_3
    move/from16 v0, v19

    goto/16 :goto_0

    :sswitch_8
    move/from16 v19, v0

    int-to-long v12, v8

    .line 1003
    invoke-virtual {v5}, Ll/۫ܽܳ;->ۧ()I

    move-result v0

    move-wide/from16 v40, v6

    int-to-long v6, v0

    sget v0, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v0, :cond_5

    move-wide/from16 v25, v6

    move-wide/from16 v23, v12

    :goto_4
    const-string v0, "\u1a75\u0730"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v3, v0, v34

    mul-int/lit16 v3, v3, -0x3759

    const v6, 0x1517c3f2

    xor-int/2addr v3, v6

    const v6, 0x422738e0

    goto/16 :goto_9

    :cond_5
    const-string v0, "\u1a77\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v34, v0

    mul-int/lit8 v0, v0, 0x41

    xor-int v3, v0, v35

    mul-int/lit16 v3, v3, -0x66f3

    const v23, 0x67ab79fd

    xor-int v3, v3, v23

    const v23, 0x3a7620d2

    xor-int v36, v0, v23

    move-wide/from16 v25, v6

    move-wide/from16 v23, v12

    goto/16 :goto_11

    :sswitch_9
    move/from16 v19, v0

    move-wide/from16 v40, v6

    add-int v0, v16, v20

    invoke-virtual {v4, v0}, Ll/ܽᩳܳ;->ܽ(I)I

    move-result v8

    .line 852
    sget v0, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v0, :cond_6

    move/from16 v0, v19

    move-wide/from16 v6, v40

    goto :goto_6

    :cond_6
    const-string v0, "\u1a74\u1a79"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v35, v0

    mul-int/lit8 v0, v0, 0x2f

    xor-int v3, v0, v34

    mul-int/lit16 v3, v3, 0x43f9

    const v6, -0x165ae18f

    xor-int/2addr v3, v6

    const v6, 0x1f13d60e

    goto/16 :goto_9

    :sswitch_a
    move/from16 v19, v0

    move-wide/from16 v40, v6

    const/16 v20, -0x1

    sget-boolean v0, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v0, :cond_7

    :goto_5
    const-string v0, "\u1a76\u06d6"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v3, v0, v34

    mul-int/lit16 v3, v3, 0x5f79

    const v6, -0x709770e6

    xor-int/2addr v3, v6

    const v6, -0x17bbb6b2

    goto/16 :goto_9

    :cond_7
    const-string v0, "\u06d8\u06d6"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    mul-int/lit8 v0, v0, 0x5b

    xor-int v3, v0, v34

    mul-int/lit16 v3, v3, 0x1215

    const v6, -0x36b3e494    # -836022.75f

    xor-int/2addr v3, v6

    const v6, 0x43f9aa25

    goto/16 :goto_9

    .line 1001
    :sswitch_b
    invoke-virtual {v4, v15}, Ll/ܽᩳܳ;->ܽ(I)I

    move-result v0

    invoke-static {v1, v0}, Ll/ۘۨ;->᩺۬֨(II)I

    move-result v0

    int-to-long v6, v2

    .line 229
    sget v3, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v3, :cond_9

    :cond_8
    :goto_6
    const-string v3, "\u06d6\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v34

    mul-int/lit8 v3, v3, 0x4b

    xor-int v12, v3, v35

    mul-int/lit16 v12, v12, 0x687f

    const v13, 0x1d8d3ce8

    xor-int/2addr v12, v13

    const v13, 0x2662bae4

    goto :goto_7

    :cond_9
    const-string v3, "\u1a7a\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v34

    mul-int/lit8 v3, v3, 0x5b

    xor-int v12, v3, v35

    mul-int/lit16 v12, v12, 0x65f9

    const v13, 0x48091633

    xor-int/2addr v12, v13

    const v13, 0xe169cab

    :goto_7
    xor-int v36, v3, v13

    move v3, v12

    goto/16 :goto_0

    :sswitch_c
    move/from16 v19, v0

    move-wide/from16 v40, v6

    .line 996
    invoke-static {v4, v14}, Ll/ܽᩳܳ;->֫(Ll/ܽᩳܳ;I)I

    move-result v15

    .line 997
    invoke-static {v4, v2}, Ll/ܽᩳܳ;->֫(Ll/ܽᩳܳ;I)I

    move-result v0

    if-lt v15, v0, :cond_a

    move-object/from16 v1, p0

    move/from16 v16, v0

    move-wide/from16 v12, v38

    goto/16 :goto_c

    :cond_a
    const-string v3, "\u0730\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v34, v3

    mul-int/lit8 v3, v3, -0x17

    xor-int v6, v3, v35

    mul-int/lit16 v6, v6, 0x42e5

    const v7, 0x63605878

    xor-int/2addr v6, v7

    const v7, -0x6863db2d

    xor-int v36, v3, v7

    move/from16 v16, v0

    move v3, v6

    goto/16 :goto_11

    :sswitch_d
    move/from16 v19, v0

    move-wide/from16 v40, v6

    const/high16 v0, -0x80000000

    move-wide/from16 v12, v38

    const/high16 v14, -0x80000000

    goto :goto_8

    :sswitch_e
    move/from16 v19, v0

    move-wide/from16 v40, v6

    move-wide/from16 v12, v38

    long-to-int v0, v12

    move v14, v0

    :goto_8
    const-string v0, "\u06e2\u06e0"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v3, v0, v34

    mul-int/lit16 v3, v3, -0x586f

    const v6, -0x22b583da

    xor-int/2addr v3, v6

    const v6, 0x52f3e52e

    goto :goto_a

    :sswitch_f
    move/from16 v19, v0

    move-wide/from16 v40, v6

    const-wide/16 v6, 0x1

    add-long v38, v27, v6

    const-wide/32 v6, -0x80000000

    cmp-long v0, v38, v6

    if-gez v0, :cond_b

    const-string v0, "\u06d7\u06d9"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v3, v0, v34

    mul-int/lit16 v3, v3, 0x458b

    const v6, 0x3902f804

    xor-int/2addr v3, v6

    const v6, 0x53cfb5e8

    goto :goto_9

    :cond_b
    const-string v0, "\u06e8\u06d7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v34

    xor-int v3, v0, v35

    mul-int/lit16 v3, v3, 0x5475

    const v6, -0x1555f5f9

    xor-int/2addr v3, v6

    const v6, -0x60a454fe

    :goto_9
    xor-int v36, v0, v6

    goto/16 :goto_11

    :sswitch_10
    move/from16 v19, v0

    move-wide/from16 v40, v6

    move-wide/from16 v12, v38

    sub-long v27, v17, v21

    .line 38
    sget v0, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v0, :cond_c

    goto :goto_b

    :cond_c
    const-string v0, "\u06e1\u06db"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v35

    mul-int/lit8 v0, v0, -0x4b

    xor-int v3, v0, v34

    mul-int/lit16 v3, v3, -0x4709

    const v6, 0x5d8d9ed5

    xor-int/2addr v3, v6

    const v6, 0x46aa389f

    :goto_a
    xor-int v36, v0, v6

    goto/16 :goto_10

    :sswitch_11
    move/from16 v19, v0

    move-wide/from16 v40, v6

    move-wide/from16 v12, v38

    int-to-long v6, v1

    .line 994
    invoke-virtual {v5}, Ll/۫ܽܳ;->ۧ()I

    move-result v0

    int-to-long v0, v0

    .line 493
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v3, :cond_d

    move-wide/from16 v21, v0

    move-wide/from16 v17, v6

    :goto_b
    const-string v0, "\u06d6\u1a7b"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v35

    mul-int/lit8 v0, v0, -0x3

    xor-int v1, v0, v34

    mul-int/lit16 v1, v1, 0x3f5d

    const v3, -0x16f53a3d

    xor-int/2addr v3, v1

    const v1, 0x148656b

    xor-int v36, v0, v1

    goto/16 :goto_f

    :cond_d
    const-string v3, "\u05a1\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v34, v3

    mul-int/lit8 v3, v3, -0x45

    move-wide/from16 v17, v0

    xor-int v0, v3, v35

    mul-int/lit16 v0, v0, 0x13eb

    const v1, -0x40133412

    xor-int/2addr v0, v1

    const v1, 0x489a31a0    # 315789.0f

    xor-int v36, v3, v1

    move/from16 v1, p1

    move v3, v0

    move-wide/from16 v38, v12

    move-wide/from16 v21, v17

    move/from16 v0, v19

    move-wide/from16 v17, v6

    goto/16 :goto_12

    :sswitch_12
    move/from16 v19, v0

    move-wide/from16 v40, v6

    move-wide/from16 v12, v38

    .line 990
    move-object/from16 v4, v37

    check-cast v4, Ll/ܽᩳܳ;

    invoke-static {v4}, Ll/ܽᩳܳ;->ۧ(Ll/ܽᩳܳ;)I

    move-result v0

    move-object/from16 v1, p0

    .line 991
    iget-object v5, v1, Ll/᩺ܽܳ;->ܽ:Ll/۫ܽܳ;

    invoke-virtual {v5}, Ll/۫ܽܳ;->ۧ()I

    move-result v3

    if-eq v0, v3, :cond_e

    goto :goto_c

    :cond_e
    const-string v0, "\u06e8\u06db"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v34

    mul-int/lit8 v0, v0, 0x2f

    xor-int v3, v0, v35

    mul-int/lit16 v3, v3, -0x79f1

    const v6, 0x6ebb9472

    xor-int/2addr v3, v6

    const v6, -0x7cb3b697

    goto/16 :goto_e

    :sswitch_13
    move-object/from16 v1, p0

    const-wide/16 v2, -0x1

    return-wide v2

    :sswitch_14
    move-object/from16 v1, p0

    move/from16 v19, v0

    move-wide/from16 v40, v6

    move-wide/from16 v12, v38

    .line 990
    iget-object v0, v1, Ll/᩺ܽܳ;->ᩳ:Ll/ۧᩳܳ;

    instance-of v3, v0, Ll/ܽᩳܳ;

    if-eqz v3, :cond_f

    const-string v3, "\u1a76\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v35, v3

    mul-int/lit8 v3, v3, -0x3b

    xor-int v6, v3, v34

    mul-int/lit16 v6, v6, -0x46bf

    const v7, -0x4550e60c

    xor-int/2addr v6, v7

    const v7, 0xa219068

    xor-int v36, v3, v7

    move/from16 v1, p1

    move-object/from16 v37, v0

    move v3, v6

    goto :goto_10

    :cond_f
    move-object/from16 v37, v0

    :goto_c
    const-string v0, "\u06ec\u05a8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v3, v0, v34

    mul-int/lit16 v3, v3, -0x617f

    const v6, -0x699a180f

    xor-int/2addr v3, v6

    const v6, 0x67c227dc

    goto :goto_e

    :sswitch_15
    move-object/from16 v1, p0

    move/from16 v19, v0

    move-wide/from16 v40, v6

    move-wide/from16 v12, v38

    sget v0, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v0, :cond_10

    :goto_d
    const-string v0, "\u1a7b\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v34

    xor-int v3, v0, v35

    mul-int/lit16 v3, v3, -0x7859

    const v6, -0x26d01703

    xor-int/2addr v3, v6

    const v6, -0x667218ba

    goto :goto_e

    :cond_10
    const-string v0, "\u1a7b\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v34

    xor-int v3, v0, v35

    mul-int/lit16 v3, v3, -0x4467

    const v6, -0x3fcc6aab

    xor-int/2addr v3, v6

    const v6, -0x47bb3aa4

    :goto_e
    xor-int v36, v0, v6

    :goto_f
    move/from16 v1, p1

    :goto_10
    move-wide/from16 v38, v12

    :goto_11
    move/from16 v0, v19

    :goto_12
    move-wide/from16 v6, v40

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ede220b -> :sswitch_13
        -0x70ba69dc -> :sswitch_e
        -0x7033235e -> :sswitch_2
        -0x64348307 -> :sswitch_f
        -0x6317a79b -> :sswitch_a
        -0x5ea05b43 -> :sswitch_b
        -0x5d42f352 -> :sswitch_13
        -0x5bb320ea -> :sswitch_4
        -0x5b38da52 -> :sswitch_0
        -0x5250ed80 -> :sswitch_11
        -0x4befe0fb -> :sswitch_c
        -0x4ad3b6e1 -> :sswitch_d
        -0x496b9a84 -> :sswitch_4
        -0x44f7ff1b -> :sswitch_1
        -0x3fbab528 -> :sswitch_12
        -0x3fba6e93 -> :sswitch_a
        -0x360e0792 -> :sswitch_e
        -0x30dbd867 -> :sswitch_2
        -0x304f9d0a -> :sswitch_7
        -0x1c91b1ff -> :sswitch_15
        -0x1c689d46 -> :sswitch_6
        -0x13d7d021 -> :sswitch_12
        -0x135dfcad -> :sswitch_10
        -0x11128940 -> :sswitch_14
        -0xd187661 -> :sswitch_10
        -0x80cd80 -> :sswitch_5
        0x1580de7 -> :sswitch_0
        0xea4547b -> :sswitch_3
        0xfd142e7 -> :sswitch_d
        0x1d9964a4 -> :sswitch_f
        0x26ee5f0b -> :sswitch_c
        0x3a0a6c36 -> :sswitch_7
        0x425a9987 -> :sswitch_1
        0x427f9a54 -> :sswitch_8
        0x50f34dac -> :sswitch_9
        0x5a1f5ec2 -> :sswitch_b
        0x5d74a6b9 -> :sswitch_5
        0x612cbcf5 -> :sswitch_15
        0x64c66a12 -> :sswitch_9
        0x6a34a0c3 -> :sswitch_11
        0x6c9b9274 -> :sswitch_14
        0x6d5dbb37 -> :sswitch_6
        0x7c0b457e -> :sswitch_8
        0x7e7c3967 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 966
    iget-object v0, p0, Ll/᩺ܽܳ;->ᩳ:Ll/ۧᩳܳ;

    invoke-virtual {v0}, Ll/ۧᩳܳ;->֫()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫(II[J)V
    .locals 16

    move-object/from16 v6, p0

    move/from16 v5, p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const v8, -0x5b2ebd7a

    sget v9, Ll/֡֡;->֫ۤܳ:I

    sget v10, Ll/֡᩺;->ᩴ᩹ۛ:I

    const-string v11, "\u05ab\u1a79"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x7729

    const v13, -0x4c34b9ba

    xor-int/2addr v12, v13

    const v13, 0x7a9a1c7d    # 4.0009576E35f

    xor-int/2addr v11, v13

    const/4 v0, 0x0

    const v1, -0x5b2ebd7a

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    xor-int/2addr v1, v10

    mul-int/lit16 v1, v1, 0x32d3

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v12

    xor-int/2addr v1, v11

    sparse-switch v1, :sswitch_data_0

    sub-int/2addr v4, v5

    sub-int/2addr v0, v5

    move-object/from16 v11, p3

    .line 936
    invoke-static {v4, v0, v11}, Ll/ܿᩳܳ;->֫(II[J)V

    return-void

    :sswitch_0
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v11

    if-gez v11, :cond_0

    goto :goto_1

    :cond_0
    move/from16 v12, p2

    move-object/from16 v11, p3

    goto/16 :goto_4

    :sswitch_1
    sget v11, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v11, :cond_1

    goto :goto_1

    :cond_1
    move/from16 v12, p2

    move-object/from16 v11, p3

    goto/16 :goto_3

    .line 521
    :sswitch_2
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    sget-boolean v11, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v11, :cond_2

    goto :goto_1

    :cond_2
    move/from16 v12, p2

    move-object/from16 v11, p3

    goto/16 :goto_6

    .line 442
    :sswitch_3
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    :goto_1
    const-string v11, "\u1a7b\u06e8"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x12fb

    const v13, -0x636ee7e4

    xor-int/2addr v12, v13

    const v13, 0x68b8481f

    xor-int/2addr v11, v13

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    return-void

    :sswitch_5
    move-object/from16 v11, p3

    const/16 v0, 0x20

    ushr-long v12, v2, v0

    long-to-int v4, v12

    long-to-int v0, v2

    .line 825
    sget v12, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v12, :cond_3

    move/from16 v12, p2

    goto/16 :goto_6

    :cond_3
    const-string v12, "\u06dc\u1a74"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v9

    mul-int/lit8 v12, v12, 0x67

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, -0x6977

    const v14, -0x34174f11    # -3.0499294E7f

    xor-int/2addr v13, v14

    const v14, -0x38b6312e

    goto :goto_2

    :sswitch_6
    move-object/from16 v11, p3

    .line 939
    iget-object v12, v6, Ll/᩺ܽܳ;->ܽ:Ll/۫ܽܳ;

    invoke-virtual {v12}, Ll/۫ܽܳ;->ۧ()I

    move-result v12

    new-instance v13, Ll/ۨܽܳ;

    .line 841
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v14

    if-eqz v14, :cond_4

    move/from16 v12, p2

    goto/16 :goto_5

    :cond_4
    move-object v0, v13

    move-object/from16 v1, p0

    move v2, v7

    move v3, v8

    move-object/from16 v4, p3

    move/from16 v5, p1

    .line 939
    invoke-direct/range {v0 .. v5}, Ll/ۨܽܳ;-><init>(Ll/᩺ܽܳ;II[JI)V

    iget-object v0, v6, Ll/᩺ܽܳ;->ᩳ:Ll/ۧᩳܳ;

    invoke-virtual {v0, v7, v8, v12, v13}, Ll/ۧᩳܳ;->֫(IIILl/᩸ܽܳ;)V

    :sswitch_7
    return-void

    :sswitch_8
    move-object/from16 v11, p3

    .line 932
    invoke-direct {v6, v7, v8}, Ll/᩺ܽܳ;->ܽ(II)J

    move-result-wide v2

    const-wide/16 v12, -0x1

    cmp-long v14, v2, v12

    if-eqz v14, :cond_5

    const-string v12, "\u06e4\u1a75"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v10

    xor-int v13, v12, v9

    mul-int/lit16 v13, v13, 0x264d

    const v14, -0x7f0686c5

    xor-int/2addr v13, v14

    const v14, 0x5acae0e3

    goto :goto_2

    :cond_5
    const-string v12, "\u06d9\u06da"

    invoke-static {v12}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v12

    xor-int/2addr v12, v9

    mul-int/lit8 v12, v12, 0x49

    xor-int v13, v12, v10

    mul-int/lit16 v13, v13, 0x653b

    const v14, 0x669734f1

    xor-int/2addr v13, v14

    const v14, 0x77d55b6f

    :goto_2
    xor-int/2addr v12, v14

    move v11, v12

    move v12, v13

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v11, p3

    .line 927
    iget v7, v6, Ll/᩺ܽܳ;->ۧ:I

    invoke-static {v5, v7}, Ll/֡ۜ;->۟᩻۠(II)I

    move-result v7

    .line 928
    iget v8, v6, Ll/᩺ܽܳ;->֫:I

    move/from16 v12, p2

    invoke-static {v12, v8}, Ll/֨۫;->ۗܺܶ(II)I

    move-result v8

    if-lt v7, v8, :cond_6

    const-string v13, "\u073a\u1a76"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v10

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, 0x786f

    const v15, 0x7e36a380

    xor-int/2addr v14, v15

    const v15, -0x73227b53

    goto/16 :goto_7

    :cond_6
    const-string v13, "\u1a74\u073f"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v9

    mul-int/lit8 v13, v13, -0x23

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, 0x617b

    const v15, 0x56c723bc

    xor-int/2addr v14, v15

    const v15, -0x21a27b67

    goto/16 :goto_7

    :sswitch_a
    move/from16 v12, p2

    move-object/from16 v11, p3

    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v13

    if-eqz v13, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v13, "\u06eb\u073a"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v10, v13

    mul-int/lit8 v13, v13, 0x31

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, 0x77d5

    const v15, 0x4dfc4302    # 5.29031232E8f

    xor-int/2addr v14, v15

    const v15, 0x3ac09fee

    goto/16 :goto_7

    :sswitch_b
    move/from16 v12, p2

    move-object/from16 v11, p3

    .line 917
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v13

    if-ltz v13, :cond_8

    goto/16 :goto_6

    :cond_8
    const-string v13, "\u06d8\u06e1"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v9

    mul-int/lit8 v13, v13, 0x5b

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, 0x74a3

    const v15, 0x65d540f6

    xor-int/2addr v14, v15

    const v15, -0x32079046    # -5.2100896E8f

    goto/16 :goto_7

    :sswitch_c
    move/from16 v12, p2

    move-object/from16 v11, p3

    .line 12
    sget v13, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v13, :cond_9

    goto/16 :goto_6

    :cond_9
    const-string v13, "\u0733\u0736"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v9

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, 0x5f15

    const v15, -0x66f03a53

    xor-int/2addr v14, v15

    const v15, -0x2f5d3b9d

    goto/16 :goto_7

    :sswitch_d
    move/from16 v12, p2

    move-object/from16 v11, p3

    .line 402
    sget v13, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v13, :cond_a

    goto/16 :goto_6

    :cond_a
    const-string v13, "\u06eb\u0736"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v10

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, -0x66f1

    const v15, 0x59cd59f3

    xor-int/2addr v14, v15

    const v15, 0x66532776

    goto/16 :goto_7

    :sswitch_e
    move/from16 v12, p2

    move-object/from16 v11, p3

    .line 833
    sget v13, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v13, :cond_b

    :goto_3
    const-string v13, "\u06e1\u06e8"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v9

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, -0x73e7

    const v15, 0x1cb0a0a2

    xor-int/2addr v14, v15

    const v15, 0x5c9d4557

    goto/16 :goto_7

    :cond_b
    const-string v13, "\u1a75\u073d"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v9

    mul-int/lit8 v13, v13, 0x2d

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, -0x1049

    const v15, 0x3bd3ce36

    xor-int/2addr v14, v15

    const v15, 0x108fb95f

    goto/16 :goto_7

    :sswitch_f
    move/from16 v12, p2

    move-object/from16 v11, p3

    .line 24
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v13

    if-eqz v13, :cond_c

    :goto_4
    const-string v13, "\u06ec\u06eb"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v9, v13

    mul-int/lit8 v13, v13, -0x6b

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, -0x2c91

    const v15, 0x4931647a    # 726599.6f

    xor-int/2addr v14, v15

    const v15, 0x550fa962

    goto/16 :goto_7

    :cond_c
    const-string v13, "\u06e0\u06eb"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v10, v13

    mul-int/lit8 v13, v13, -0x4d

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, -0x4e31

    const v15, -0x775f2cfc

    xor-int/2addr v14, v15

    const v15, -0xfa0c31d

    goto :goto_7

    :sswitch_10
    move/from16 v12, p2

    move-object/from16 v11, p3

    .line 304
    sget v13, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v13, :cond_d

    :goto_5
    const-string v13, "\u1a78\u1a73"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v10

    mul-int/lit8 v13, v13, -0x31

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, 0x3147

    const v15, -0x52afefbd

    xor-int/2addr v14, v15

    const v15, -0x7022002f

    goto :goto_7

    :cond_d
    const-string v13, "\u0730\u1a7b"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v10

    mul-int/lit8 v13, v13, 0x2f

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, 0x55c3

    const v15, -0x34ba40ef    # -1.2959505E7f

    xor-int/2addr v14, v15

    const v15, 0x72b3604c

    goto :goto_7

    :sswitch_11
    move/from16 v12, p2

    move-object/from16 v11, p3

    .line 912
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v13

    if-ltz v13, :cond_e

    :goto_6
    const-string v13, "\u073f\u06d9"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v10

    mul-int/lit8 v13, v13, 0x6d

    xor-int v14, v13, v9

    mul-int/lit16 v14, v14, -0xf29

    const v15, 0x4d60a062    # 2.35537952E8f

    xor-int/2addr v14, v15

    const v15, -0x6e7b86c2

    goto :goto_7

    :cond_e
    const-string v13, "\u06df\u06e1"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v9, v13

    mul-int/lit8 v13, v13, 0x23

    xor-int v14, v13, v10

    mul-int/lit16 v14, v14, 0x62ef

    const v15, -0x1dcd0eeb

    xor-int/2addr v14, v15

    const v15, -0x6abd158d

    :goto_7
    xor-int/2addr v13, v15

    move v11, v13

    move v12, v14

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79d44d86 -> :sswitch_7
        -0x79c034e8 -> :sswitch_11
        -0x752b87b1 -> :sswitch_0
        -0x73894f20 -> :sswitch_c
        -0x5fc77bc5 -> :sswitch_2
        -0x54eab567 -> :sswitch_8
        -0x4716c29a -> :sswitch_11
        -0x44a08584 -> :sswitch_f
        -0x3dd7978b -> :sswitch_e
        -0x367c21a7 -> :sswitch_6
        -0x2b7af511 -> :sswitch_5
        -0x254e60e5 -> :sswitch_a
        -0x190b9631 -> :sswitch_4
        -0x17e31f40 -> :sswitch_c
        0xbf7238 -> :sswitch_d
        0x29264cc -> :sswitch_7
        0x31516cc -> :sswitch_a
        0x6390ee0 -> :sswitch_9
        0x994d475 -> :sswitch_3
        0x19059867 -> :sswitch_10
        0x1db63dc2 -> :sswitch_e
        0x1f361b28 -> :sswitch_10
        0x23dfdebf -> :sswitch_b
        0x251c998f -> :sswitch_5
        0x2c073f4b -> :sswitch_b
        0x3256fcde -> :sswitch_1
        0x4de41db9 -> :sswitch_0
        0x5200f054 -> :sswitch_f
        0x59f1858b -> :sswitch_9
        0x5fcaa16b -> :sswitch_1
        0x69f38fca -> :sswitch_8
        0x6a94202a -> :sswitch_4
        0x71081e90 -> :sswitch_2
        0x79bb0d78 -> :sswitch_d
        0x7c90cf55 -> :sswitch_6
        0x7d62a417 -> :sswitch_3
    .end sparse-switch
.end method

.method public final ֫(I[BII)V
    .locals 25

    move-object/from16 v7, p0

    move/from16 v6, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v8, 0x0

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const v17, -0x5135bb99

    sget v18, Ll/֡ᩴ;->ܳۤ֫:I

    sget v19, Ll/ۨ;->᩺᩷ۚ:I

    const-string v20, "\u06e8\u06da"

    invoke-static/range {v20 .. v20}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v20

    xor-int v20, v20, v19

    xor-int v0, v20, v18

    mul-int/lit16 v0, v0, 0x4753

    const v22, -0x2f302edf

    xor-int v0, v0, v22

    const v22, -0x5d145f49

    xor-int v20, v20, v22

    move-object v10, v5

    move-object v13, v12

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v21, 0x0

    move-wide v11, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_0
    xor-int v3, v17, v18

    mul-int/lit16 v3, v3, 0x419b

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v0, v3

    xor-int v17, v20, v0

    sparse-switch v17, :sswitch_data_0

    move/from16 v3, p3

    move/from16 v20, v1

    .line 350
    sget v0, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v0, :cond_d

    goto/16 :goto_8

    .line 640
    :sswitch_0
    sget-boolean v0, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    move/from16 v3, p3

    goto/16 :goto_a

    .line 529
    :sswitch_1
    sget v0, Ll/ۗۚ;->ܶۛᩴ:I

    if-gez v0, :cond_2

    :cond_1
    move/from16 v3, p3

    move/from16 v20, v1

    goto/16 :goto_8

    :cond_2
    :goto_2
    const-string v0, "\u06e2\u06dc"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x45

    xor-int v3, v0, v19

    mul-int/lit16 v3, v3, -0x66c7

    const v20, 0x70a05988

    xor-int v3, v3, v20

    const v20, -0x6da7b298

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v0

    if-nez v0, :cond_1

    :goto_3
    move/from16 v3, p3

    move/from16 v20, v1

    goto/16 :goto_c

    :sswitch_3
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    goto :goto_3

    .line 129
    :sswitch_4
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    return-void

    .line 872
    :sswitch_5
    invoke-static {v2}, Ll/۫ܽܳ;->֫(Ll/۫ܽܳ;)[B

    move-result-object v0

    add-int v2, p4, v1

    sub-int/2addr v2, v6

    sub-int/2addr v5, v1

    move-object/from16 v3, p2

    invoke-static {v7, v0, v2, v3, v5}, Ll/ܿᩳܳ;->֫(I[BI[BI)V

    return-void

    :sswitch_6
    move-object/from16 v3, p2

    add-int v0, v16, v15

    move v7, v0

    goto :goto_4

    :sswitch_7
    move-object/from16 v3, p2

    xor-int v0, v14, v15

    shr-int/lit8 v0, v0, 0x1f

    or-int/2addr v0, v4

    if-lez v0, :cond_3

    move/from16 v7, v16

    goto :goto_4

    :cond_3
    const-string v0, "\u0730\u06e8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    mul-int/lit8 v0, v0, -0x49

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x10f1

    const v20, -0x7a1337c9

    xor-int v3, v3, v20

    const v20, 0x63843f28

    goto :goto_5

    .line 870
    :sswitch_8
    invoke-static {v13}, Ll/ܽᩳܳ;->֫(Ll/ܽᩳܳ;)I

    move-result v0

    sub-int v14, v1, v0

    .line 871
    invoke-virtual {v2}, Ll/۫ܽܳ;->ۧ()I

    move-result v15

    .line 0
    rem-int v16, v14, v15

    if-nez v16, :cond_4

    move/from16 v7, v21

    :goto_4
    const-string v0, "\u05a8\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    mul-int/lit8 v0, v0, 0x4d

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x5b39

    const v20, 0x11e2470

    xor-int v3, v3, v20

    const v20, 0x21a3d70b

    goto :goto_5

    :cond_4
    const-string v0, "\u06dc\u0733"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x77

    xor-int v3, v0, v19

    mul-int/lit16 v3, v3, -0x72cf

    const v20, -0x500ac36

    xor-int v3, v3, v20

    const v20, 0x48994226

    goto :goto_5

    :sswitch_9
    const/16 v0, 0x20

    ushr-long v0, v11, v0

    long-to-int v1, v0

    long-to-int v5, v11

    .line 870
    move-object v13, v10

    check-cast v13, Ll/ܽᩳܳ;

    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v0

    if-eqz v0, :cond_5

    goto/16 :goto_1

    :cond_5
    const-string v0, "\u06e8\u1a79"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x15

    xor-int v3, v0, v19

    mul-int/lit16 v3, v3, -0x3b1

    const v20, 0x3174bc83

    xor-int v3, v3, v20

    const v20, -0x7ddef630

    :goto_5
    xor-int v20, v0, v20

    move v0, v3

    goto/16 :goto_0

    .line 876
    :sswitch_a
    invoke-virtual {v2}, Ll/۫ܽܳ;->ۧ()I

    move-result v7

    new-instance v11, Ll/ۛܽܳ;

    move-object v0, v11

    move-object/from16 v1, p0

    move v2, v8

    move v3, v9

    move-object/from16 v4, p2

    move/from16 v5, p4

    move/from16 v6, p1

    invoke-direct/range {v0 .. v6}, Ll/ۛܽܳ;-><init>(Ll/᩺ܽܳ;II[BII)V

    invoke-virtual {v10, v8, v9, v7, v11}, Ll/ۧᩳܳ;->֫(IIILl/᩸ܽܳ;)V

    return-void

    :sswitch_b
    add-int v0, p4, v8

    sub-int v6, v0, v6

    .line 862
    invoke-static {v2}, Ll/۫ܽܳ;->֫(Ll/۫ܽܳ;)[B

    move-result-object v0

    aget-byte v5, v0, v21

    move-object/from16 v0, p0

    iget-object v1, v0, Ll/᩺ܽܳ;->ᩳ:Ll/ۧᩳܳ;

    move-object/from16 v2, p2

    move v3, v8

    move v4, v9

    invoke-virtual/range {v1 .. v6}, Ll/ۧᩳܳ;->֫([BIIBI)V

    return-void

    :sswitch_c
    move-object/from16 v0, p0

    .line 866
    invoke-direct {v0, v8, v9}, Ll/᩺ܽܳ;->ܽ(II)J

    move-result-wide v11

    const-wide/16 v22, -0x1

    .line 867
    iget-object v10, v0, Ll/᩺ܽܳ;->ᩳ:Ll/ۧᩳܳ;

    cmp-long v3, v11, v22

    if-eqz v3, :cond_6

    const-string v3, "\u06e8\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v19

    move/from16 v20, v1

    xor-int v1, v3, v18

    mul-int/lit16 v1, v1, 0xd95

    const v22, -0x7a0463e2

    xor-int v1, v1, v22

    const v22, -0x5498aeb

    xor-int v3, v3, v22

    move v0, v1

    move/from16 v1, v20

    move/from16 v20, v3

    goto/16 :goto_0

    :cond_6
    move/from16 v20, v1

    const-string v1, "\u06e0\u1a7b"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v19

    mul-int/lit16 v3, v3, -0x2127

    const v22, 0x25c69689

    xor-int v3, v3, v22

    const v22, -0x435ccc1a

    goto :goto_6

    :sswitch_d
    move-object/from16 v0, p0

    return-void

    :sswitch_e
    move-object/from16 v0, p0

    move/from16 v20, v1

    .line 861
    iget-object v2, v0, Ll/᩺ܽܳ;->ܽ:Ll/۫ܽܳ;

    invoke-virtual {v2}, Ll/۫ܽܳ;->ۧ()I

    move-result v1

    const/16 v21, 0x0

    const/4 v4, 0x1

    if-ne v1, v4, :cond_7

    const-string v1, "\u1a76\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0x57

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0xa37

    const v22, -0x737307a6

    xor-int v3, v3, v22

    const v22, 0x1a58e696

    goto :goto_6

    :cond_7
    const-string v1, "\u0736\u05a1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x43

    xor-int v3, v1, v19

    mul-int/lit16 v3, v3, -0x45bd

    const v22, 0x1faa4684

    xor-int v3, v3, v22

    const v22, 0x5046632c

    :goto_6
    xor-int v1, v1, v22

    move v0, v3

    goto :goto_7

    :sswitch_f
    move-object/from16 v0, p0

    move/from16 v20, v1

    .line 856
    iget v1, v0, Ll/᩺ܽܳ;->ۧ:I

    invoke-static {v6, v1}, Ll/֡ۜ;->۟᩻۠(II)I

    move-result v8

    .line 857
    iget v1, v0, Ll/᩺ܽܳ;->֫:I

    move/from16 v3, p3

    invoke-static {v3, v1}, Ll/ۖۘ;->ۖۙ᩵(II)I

    move-result v9

    if-lt v8, v9, :cond_8

    const-string v1, "\u06df\u1a79"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0x43

    xor-int v0, v1, v18

    mul-int/lit16 v0, v0, -0x7411

    const v22, 0x7d83372b

    xor-int v0, v0, v22

    const v22, -0x66a8c901

    xor-int v1, v1, v22

    :goto_7
    move/from16 v24, v20

    move/from16 v20, v1

    goto/16 :goto_e

    :cond_8
    const-string v0, "\u06ec\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x4e63

    const v22, 0x4b91844c    # 1.9073176E7f

    xor-int v1, v1, v22

    const v22, -0x34512eef    # -2.291357E7f

    goto/16 :goto_d

    :sswitch_10
    move/from16 v3, p3

    move/from16 v20, v1

    .line 778
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_b

    :cond_9
    const-string v0, "\u06e8\u06d6"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x9

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x58d3

    const v22, -0x5c70b59e

    xor-int v1, v1, v22

    const v22, -0x6e904336

    goto/16 :goto_d

    :sswitch_11
    move/from16 v3, p3

    move/from16 v20, v1

    .line 606
    sget v0, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v0, :cond_a

    goto/16 :goto_c

    :cond_a
    const-string v0, "\u0733\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x7d7d

    const v22, 0x2524c2f8

    xor-int v1, v1, v22

    const v22, -0x2707646f

    goto/16 :goto_d

    :sswitch_12
    move/from16 v3, p3

    move/from16 v20, v1

    .line 479
    sget v0, Ll/ۛ;->᩺᩻֫:I

    if-ltz v0, :cond_b

    goto/16 :goto_b

    :cond_b
    const-string v0, "\u06e0\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0xfa9

    const v22, 0x73554473

    xor-int v1, v1, v22

    const v22, 0x5e07a98

    goto/16 :goto_d

    :sswitch_13
    move/from16 v3, p3

    move/from16 v20, v1

    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_8

    :cond_c
    const-string v0, "\u073d\u073f"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v19, v0

    mul-int/lit8 v0, v0, 0x65

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x3215

    const v22, 0x5470d559

    xor-int v1, v1, v22

    const v22, 0x4f7b8157

    goto/16 :goto_d

    :goto_8
    const-string v0, "\u1a77\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x2b3d

    const v22, -0x55215fd5

    xor-int v1, v1, v22

    const v22, -0x775dbfa

    goto/16 :goto_d

    :cond_d
    const-string v0, "\u06d6\u06df"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x5d

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0x4745

    const v22, 0x493b0d04    # 766160.25f

    xor-int v1, v1, v22

    const v22, -0x296749bd

    goto/16 :goto_d

    :sswitch_14
    move/from16 v3, p3

    move/from16 v20, v1

    .line 63
    sget v0, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v0, :cond_e

    :goto_9
    move/from16 v1, v20

    goto :goto_a

    :cond_e
    const-string v0, "\u06d9\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x63

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0xb47

    const v22, 0x5cd2e528

    xor-int v1, v1, v22

    const v22, -0x66fa6a74

    goto/16 :goto_d

    :sswitch_15
    move/from16 v3, p3

    move/from16 v20, v1

    .line 385
    sget v0, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v0, :cond_f

    goto :goto_9

    :goto_a
    const-string v0, "\u05ab\u1a75"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    move/from16 v20, v1

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0xab1

    const v22, -0x5b2bef5c

    xor-int v1, v1, v22

    const v22, -0x11747d8e

    goto/16 :goto_d

    :cond_f
    const-string v0, "\u06da\u1a76"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x5461

    const v22, 0x7f58d5a

    xor-int v1, v1, v22

    const v22, -0x2a88b6e3

    goto :goto_d

    :sswitch_16
    move/from16 v3, p3

    move/from16 v20, v1

    .line 202
    sget-boolean v0, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v0, :cond_10

    :goto_b
    const-string v0, "\u06eb\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x5b

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, -0x4ce9

    const v22, -0x74ec6624

    xor-int v1, v1, v22

    const v22, 0x17a6e13c

    goto :goto_d

    :cond_10
    const-string v0, "\u05ab\u05a8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, 0xaf1

    const v22, 0x33e2554e

    xor-int v1, v1, v22

    const v22, -0x2420e5b6

    goto :goto_d

    :sswitch_17
    move/from16 v3, p3

    move/from16 v20, v1

    .line 362
    sget v0, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v0, :cond_11

    :goto_c
    const-string v0, "\u1a79\u0733"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v19

    mul-int/lit16 v1, v1, -0x536f

    const v22, 0x1eec2417

    xor-int v1, v1, v22

    const v22, -0x3eb49027

    goto :goto_d

    :cond_11
    const-string v0, "\u1a7b\u06e2"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v19

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x681

    const v22, -0x4bc37c9f

    xor-int v1, v1, v22

    const v22, 0x3f5dab52

    :goto_d
    xor-int v0, v0, v22

    move/from16 v24, v20

    move/from16 v20, v0

    move v0, v1

    :goto_e
    move/from16 v1, v24

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e9cdd75 -> :sswitch_13
        -0x797a9128 -> :sswitch_e
        -0x70440aaa -> :sswitch_f
        -0x6c0f12da -> :sswitch_3
        -0x6b0a27d5 -> :sswitch_17
        -0x698c9b80 -> :sswitch_6
        -0x663c5429 -> :sswitch_1
        -0x652f31de -> :sswitch_5
        -0x64be830d -> :sswitch_8
        -0x63e4a131 -> :sswitch_11
        -0x587eb81e -> :sswitch_4
        -0x4136c570 -> :sswitch_7
        -0x34f179cc -> :sswitch_c
        -0x2643ebd5 -> :sswitch_13
        -0x24db14b2 -> :sswitch_7
        -0x148b4857 -> :sswitch_16
        -0xe91e9ed -> :sswitch_5
        -0x77382b1 -> :sswitch_f
        -0x4c2696b -> :sswitch_12
        -0x42fbd9c -> :sswitch_2
        0x15d80fd -> :sswitch_14
        0x1b46f18 -> :sswitch_15
        0x31dccaa -> :sswitch_10
        0x362fb7f -> :sswitch_b
        0xcd25ac7 -> :sswitch_10
        0x12e8da41 -> :sswitch_2
        0x1c4ab774 -> :sswitch_6
        0x1cf193a0 -> :sswitch_c
        0x1f840723 -> :sswitch_e
        0x1f9ea139 -> :sswitch_d
        0x23b934a6 -> :sswitch_8
        0x24bf7248 -> :sswitch_14
        0x255823d2 -> :sswitch_a
        0x2c4665da -> :sswitch_0
        0x2ca34ddb -> :sswitch_3
        0x2d962093 -> :sswitch_a
        0x2e9c8eda -> :sswitch_9
        0x3aa16f64 -> :sswitch_1
        0x422450b8 -> :sswitch_15
        0x4c6fa5d3 -> :sswitch_b
        0x4c877924 -> :sswitch_9
        0x54bb8a97 -> :sswitch_0
        0x58b3abac -> :sswitch_4
        0x71609c1f -> :sswitch_11
        0x744aeb15 -> :sswitch_d
        0x76c15b79 -> :sswitch_17
        0x77d0b19c -> :sswitch_16
        0x78b4193d -> :sswitch_12
    .end sparse-switch
.end method

.method public final ֫(Ljava/io/DataOutputStream;III)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v21, -0x4ad468e3

    sget v22, Ll/ۗ᩶;->ۛ֨ۘ:I

    sget v23, Ll/ۘᩴ;->ܿ۬ܿ:I

    const-string v24, "\u06da\u1a74"

    invoke-static/range {v24 .. v24}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v24

    sub-int v24, v22, v24

    mul-int/lit8 v24, v24, -0x71

    xor-int v3, v24, v23

    mul-int/lit16 v3, v3, -0x1bfd

    const v26, -0x7924b0c1

    xor-int v3, v3, v26

    const v26, -0x10327624

    xor-int v24, v24, v26

    move-wide/from16 v25, v8

    move-wide v13, v12

    move-object/from16 v6, v16

    const/4 v0, 0x0

    const/4 v4, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v27, 0x0

    move-object/from16 v16, v5

    move-object v8, v7

    move-wide v11, v10

    const/4 v5, 0x0

    const/4 v7, 0x0

    :goto_0
    xor-int v9, v21, v23

    mul-int/lit16 v9, v9, 0x62d5

    shr-int/lit8 v9, v9, 0x1f

    and-int/2addr v3, v9

    xor-int v21, v24, v3

    sparse-switch v21, :sswitch_data_0

    move/from16 v3, p4

    if-nez v0, :cond_5

    const-string v1, "\u06d6\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v9, v1, v22

    mul-int/lit16 v9, v9, 0x3217

    const v10, -0x482cef83

    xor-int/2addr v9, v10

    const v10, 0x7a9ffb17

    goto/16 :goto_5

    .line 713
    :sswitch_0
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-gez v3, :cond_0

    :goto_1
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v20, v17

    move/from16 v24, v27

    move/from16 v17, v0

    goto/16 :goto_f

    :cond_0
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v20, v17

    move/from16 v24, v27

    move/from16 v17, v0

    goto/16 :goto_d

    .line 992
    :sswitch_1
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v3

    if-lez v3, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v9, p0

    move/from16 v3, p4

    goto/16 :goto_6

    :sswitch_2
    sget v3, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v3, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v20, v17

    move/from16 v24, v27

    move/from16 v17, v0

    goto/16 :goto_e

    .line 680
    :sswitch_3
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    goto :goto_1

    .line 951
    :sswitch_4
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    return-void

    :sswitch_5
    move/from16 v3, p4

    .line 1017
    invoke-static {v1, v3}, Ll/֨᩺;->᩷ۛۖ(Ljava/lang/Object;I)V

    sub-int v0, v4, v2

    .line 1018
    invoke-static {v1, v0}, Ll/ۗ۬;->ۛ۠۬(Ljava/lang/Object;I)V

    sub-int/2addr v5, v4

    .line 1019
    invoke-static {v1, v5}, Ll/ۗ۬;->ۛ۠۬(Ljava/lang/Object;I)V

    .line 1020
    invoke-virtual {v6, v1, v2}, Ll/ۧᩳܳ;->֫(Ljava/io/DataOutputStream;I)V

    return-void

    .line 1015
    :sswitch_6
    new-instance v0, Ljava/io/IOException;

    sget-object v1, Ll/᩺ܽܳ;->ۧܰۚ:[S

    const/16 v2, 0x1d

    const/16 v3, 0x22

    invoke-static {v1, v2, v3, v7}, Ll/֫᩵;->᩻ۚܺ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_7
    move/from16 v3, p4

    .line 1014
    invoke-virtual {v6}, Ll/ۧᩳܳ;->ܽ()I

    move-result v9

    if-eqz v9, :cond_3

    const-string v9, "\u0736\u06d7"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v23

    xor-int v10, v9, v22

    mul-int/lit16 v10, v10, 0x73ad

    const v20, 0x16aae491

    xor-int v10, v10, v20

    const v20, -0x433a11eb

    goto :goto_2

    :cond_3
    const-string v9, "\u06d9\u0736"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v22

    mul-int/lit8 v9, v9, -0x17

    xor-int v10, v9, v23

    mul-int/lit16 v10, v10, -0x3c71

    const v20, 0x6c06538a

    xor-int v10, v10, v20

    const v20, 0x2404abae

    :goto_2
    xor-int v24, v9, v20

    goto/16 :goto_8

    :sswitch_8
    move/from16 v3, p4

    .line 1159
    invoke-static {}, Ll/ܶܽܳ;->ᩳ()Ll/ܶܽܳ;

    move-result-object v6

    goto :goto_3

    :sswitch_9
    move/from16 v3, p4

    .line 1161
    new-array v9, v0, [I

    const/4 v10, 0x0

    .line 1162
    filled-new-array {v10}, [I

    move-result-object v10

    .line 1163
    new-instance v1, Ll/۟ܽܳ;

    .line 213
    sget v20, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v20, :cond_4

    move-object/from16 v9, p0

    goto/16 :goto_6

    .line 1163
    :cond_4
    invoke-direct {v1, v9, v10}, Ll/۟ܽܳ;-><init>([I[I)V

    invoke-virtual {v8, v15, v5, v1}, Ll/ۧᩳܳ;->֫(IILl/᩸ܽܳ;)V

    .line 1164
    invoke-static {v0, v9}, Ll/ۧᩳܳ;->֫(I[I)Ll/ۧᩳܳ;

    move-result-object v1

    move-object v6, v1

    goto :goto_3

    :cond_5
    const-string v1, "\u06d8\u06e0"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    mul-int/lit8 v1, v1, -0x43

    xor-int v9, v1, v23

    mul-int/lit16 v9, v9, 0x2df7

    const v10, 0x6c4ed373    # 1.00014904E27f

    xor-int/2addr v9, v10

    const v10, -0x78e36a21

    goto/16 :goto_5

    :sswitch_a
    move/from16 v3, p4

    .line 1154
    invoke-virtual {v8, v15, v5}, Ll/ۧᩳܳ;->֫(II)I

    move-result v0

    .line 1155
    invoke-virtual {v8}, Ll/ۧᩳܳ;->ܽ()I

    move-result v1

    if-ne v0, v1, :cond_6

    move-object v6, v8

    :goto_3
    const-string v1, "\u1a76\u1a76"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v9, v1, v22

    mul-int/lit16 v9, v9, 0x5f85

    const v10, 0x7173bdb6

    xor-int/2addr v9, v10

    const v10, 0x172c8b1b

    goto :goto_5

    :cond_6
    const-string v1, "\u1a7a\u06ec"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v23, v1

    mul-int/lit8 v1, v1, 0x23

    xor-int v9, v1, v22

    mul-int/lit16 v9, v9, 0x770b

    const v10, -0x453cacd

    xor-int/2addr v9, v10

    const v10, 0x10a50880

    goto :goto_5

    :sswitch_b
    move/from16 v3, p4

    const/high16 v1, -0x80000000

    const/high16 v15, -0x80000000

    goto :goto_4

    :sswitch_c
    move/from16 v3, p4

    long-to-int v1, v13

    move v15, v1

    :goto_4
    const-string v1, "\u1a7a\u06eb"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v9, v1, v23

    mul-int/lit16 v9, v9, -0x44b1

    const v10, -0x342d0837    # -2.7651986E7f

    xor-int/2addr v9, v10

    const v10, -0x7f1a9c50

    goto :goto_5

    :sswitch_d
    move/from16 v3, p4

    add-long v13, v25, v11

    const-wide/32 v9, -0x80000000

    cmp-long v1, v13, v9

    if-gtz v1, :cond_7

    const-string v1, "\u06d6\u1a7a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v9, v1, v23

    mul-int/lit16 v9, v9, -0xa05

    const v10, -0x63f0a31

    xor-int/2addr v9, v10

    const v10, -0x42c44e68

    goto :goto_5

    :cond_7
    const-string v1, "\u1a7b\u06dc"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    mul-int/lit8 v1, v1, 0x7

    xor-int v9, v1, v22

    mul-int/lit16 v9, v9, 0x7a85

    const v10, -0x6ae0d3f7

    xor-int/2addr v9, v10

    const v10, 0x25b618c3

    :goto_5
    xor-int v24, v1, v10

    move-object/from16 v1, p1

    move v3, v9

    goto/16 :goto_0

    :sswitch_e
    move/from16 v3, p4

    int-to-long v9, v4

    move/from16 v1, v17

    int-to-long v11, v1

    sub-long v25, v9, v11

    const-wide/16 v11, 0x1

    .line 1042
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v9

    if-gtz v9, :cond_8

    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v17, v0

    move/from16 v20, v1

    move/from16 v24, v27

    goto/16 :goto_f

    :cond_8
    const-string v9, "\u06e4\u06eb"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int v9, v9, v23

    xor-int v10, v9, v22

    mul-int/lit16 v10, v10, 0x7217

    const v17, 0x7d66da88

    xor-int v10, v10, v17

    const v17, 0x9895fd2

    xor-int v24, v9, v17

    move/from16 v17, v1

    move v3, v10

    goto/16 :goto_b

    :sswitch_f
    move/from16 v3, p4

    .line 1013
    invoke-virtual/range {v16 .. v16}, Ll/۫ܽܳ;->ۧ()I

    move-result v17

    move-object/from16 v9, p0

    .line 1012
    iget-object v8, v9, Ll/᩺ܽܳ;->ᩳ:Ll/ۧᩳܳ;

    invoke-static {v8}, Ll/ۗ᩷;->ۖۧۙ(Ljava/lang/Object;)Ljava/lang/Class;

    .line 351
    sget v1, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v1, :cond_9

    :goto_6
    const-string v1, "\u1a74\u0733"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v23

    xor-int v10, v1, v22

    mul-int/lit16 v10, v10, -0x34d

    const v20, -0x982afee

    xor-int v10, v10, v20

    const v20, -0x13843cbc

    goto :goto_7

    :cond_9
    const-string v1, "\u06d9\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v10, v1, v23

    mul-int/lit16 v10, v10, 0x6599

    const v20, 0x432b29e6

    xor-int v10, v10, v20

    const v20, 0x70663b9a

    :goto_7
    xor-int v24, v1, v20

    move-object/from16 v1, p1

    :goto_8
    move v3, v10

    goto/16 :goto_0

    :sswitch_10
    move-object/from16 v9, p0

    move/from16 v3, p4

    move/from16 v1, v17

    .line 1010
    iget v4, v9, Ll/᩺ܽܳ;->ۧ:I

    invoke-static {v2, v4}, Ll/ۘۨ;->᩺۬֨(II)I

    move-result v4

    .line 1011
    iget v5, v9, Ll/᩺ܽܳ;->֫:I

    move/from16 v10, p3

    invoke-static {v10, v5}, Ll/ۖۘ;->ۖۙ᩵(II)I

    move-result v5

    move/from16 v17, v0

    .line 1012
    iget-object v0, v9, Ll/᩺ܽܳ;->ܽ:Ll/۫ܽܳ;

    sget v16, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v16, :cond_a

    move-object/from16 v16, v0

    move/from16 v20, v1

    goto/16 :goto_c

    :cond_a
    const-string v16, "\u1a73\u1a74"

    invoke-static/range {v16 .. v16}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v23

    move-object/from16 v20, v0

    xor-int v0, v16, v22

    mul-int/lit16 v0, v0, -0x2b71

    const v24, 0x6983b9a8

    xor-int v0, v0, v24

    const v24, -0x76688735

    xor-int v24, v16, v24

    move v3, v0

    move/from16 v0, v17

    move-object/from16 v16, v20

    move/from16 v17, v1

    goto/16 :goto_b

    :sswitch_11
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v1, v17

    move/from16 v17, v0

    const/16 v0, 0x52c0

    const/16 v7, 0x52c0

    goto :goto_9

    :sswitch_12
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v1, v17

    move/from16 v17, v0

    const/16 v0, 0x6c75

    const/16 v7, 0x6c75

    :goto_9
    const-string v0, "\u0736\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, 0x55

    move/from16 v20, v1

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0x5a83

    const v24, 0x20b016bc

    xor-int v1, v1, v24

    const v24, 0x641c4925

    goto/16 :goto_a

    :sswitch_13
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v20, v17

    move/from16 v17, v0

    const v0, 0xb9371

    add-int v0, v19, v0

    add-int/2addr v0, v0

    sub-int v0, v0, v18

    if-gez v0, :cond_b

    const-string v0, "\u06dc\u06db"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x13

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0x2ef7

    const v24, 0x30e16616    # 1.6399919E-9f

    xor-int v1, v1, v24

    const v24, 0x6f7aca77

    goto/16 :goto_a

    :cond_b
    const-string v0, "\u06dc\u073f"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x4ed7

    const v24, -0x30872852

    xor-int v1, v1, v24

    const v24, 0x1bf7f9ac

    goto/16 :goto_a

    :sswitch_14
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v20, v17

    move/from16 v17, v0

    move/from16 v0, v27

    add-int/lit16 v1, v0, 0x367

    mul-int v18, v1, v1

    mul-int v19, v0, v0

    .line 243
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v1

    if-nez v1, :cond_c

    move/from16 v24, v0

    goto/16 :goto_e

    :cond_c
    const-string v1, "\u0733\u06d6"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v23

    mul-int/lit8 v1, v1, 0x5f

    move/from16 v24, v0

    xor-int v0, v1, v22

    mul-int/lit16 v0, v0, 0x3c9

    const v27, 0x1ef47446

    xor-int v0, v0, v27

    const v27, 0x640c1e54

    xor-int v1, v1, v27

    move v3, v0

    move/from16 v0, v17

    move/from16 v17, v20

    move/from16 v27, v24

    move/from16 v24, v1

    goto :goto_b

    :sswitch_15
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v20, v17

    move/from16 v17, v0

    sget-object v0, Ll/᩺ܽܳ;->ۧܰۚ:[S

    const/16 v1, 0x1c

    aget-short v27, v0, v1

    .line 556
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v0

    if-gtz v0, :cond_d

    goto :goto_c

    :cond_d
    const-string v0, "\u0736\u06d6"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, 0x43

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, -0x7cb1

    const v24, -0x7fd976c3

    xor-int v1, v1, v24

    const v24, -0x26daee23

    :goto_a
    xor-int v24, v0, v24

    move v3, v1

    move/from16 v0, v17

    move/from16 v17, v20

    :goto_b
    move-object/from16 v1, p1

    goto/16 :goto_0

    :sswitch_16
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v20, v17

    move/from16 v24, v27

    move/from16 v17, v0

    .line 128
    sget v0, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v0, :cond_e

    move/from16 v27, v24

    :goto_c
    const-string v0, "\u073d\u1a77"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v23

    mul-int/lit8 v0, v0, -0x1d

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x5a3b

    const v24, 0x6770c234

    xor-int v1, v1, v24

    const v24, 0x466ff624

    goto :goto_a

    :cond_e
    const-string v0, "\u1a78\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0x356b

    const v27, -0x1aac9454

    xor-int v1, v1, v27

    const v27, -0x45b03cb4

    goto/16 :goto_10

    :sswitch_17
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v20, v17

    move/from16 v24, v27

    move/from16 v17, v0

    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v0

    if-eqz v0, :cond_f

    :goto_d
    const-string v0, "\u06e7\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, -0x79c9

    const v27, -0x1dd52d14

    xor-int v1, v1, v27

    const v27, 0x5a316ded

    goto/16 :goto_10

    :cond_f
    const-string v0, "\u0733\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0x7ba9

    const v27, -0x11a74d70

    xor-int v1, v1, v27

    const v27, -0x2fb18425

    goto/16 :goto_10

    :sswitch_18
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v20, v17

    move/from16 v24, v27

    move/from16 v17, v0

    sget v0, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v0, :cond_10

    :goto_e
    const-string v0, "\u06d9\u1a73"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0x28ed

    const v27, 0x7fcb90ff

    xor-int v1, v1, v27

    const v27, -0x40dd3f8

    goto :goto_10

    :cond_10
    const-string v0, "\u073a\u073f"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v23, v0

    mul-int/lit8 v0, v0, 0x3d

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x385d

    const v27, 0x770f958d

    xor-int v1, v1, v27

    const v27, -0x66d163f8

    goto :goto_10

    :sswitch_19
    move-object/from16 v9, p0

    move/from16 v10, p3

    move/from16 v3, p4

    move/from16 v20, v17

    move/from16 v24, v27

    move/from16 v17, v0

    sget v0, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v0, :cond_11

    :goto_f
    const-string v0, "\u0733\u06dc"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0x7c9b

    const v27, 0x72d312e6

    xor-int v1, v1, v27

    const v27, 0x2a8de6c1

    goto :goto_10

    :cond_11
    const-string v0, "\u06e8\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x45

    xor-int v1, v0, v23

    mul-int/lit16 v1, v1, 0x5931

    const v27, 0x3e09fd51

    xor-int v1, v1, v27

    const v27, 0x32fd07fd

    :goto_10
    xor-int v0, v0, v27

    move v3, v1

    move/from16 v27, v24

    move-object/from16 v1, p1

    move/from16 v24, v0

    move/from16 v0, v17

    move/from16 v17, v20

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7aa280b6 -> :sswitch_d
        -0x78d3eeb7 -> :sswitch_14
        -0x76c461ea -> :sswitch_19
        -0x768eaf44 -> :sswitch_15
        -0x6ef13663 -> :sswitch_17
        -0x6e318885 -> :sswitch_6
        -0x6d599292 -> :sswitch_19
        -0x636ee8fe -> :sswitch_e
        -0x4939bb83 -> :sswitch_1
        -0x45f319cc -> :sswitch_4
        -0x454e9d24 -> :sswitch_2
        -0x39850a48 -> :sswitch_4
        -0x35e44f8e -> :sswitch_10
        -0x307c3ce2 -> :sswitch_11
        -0x2d2407bd -> :sswitch_e
        -0x22721f13 -> :sswitch_14
        -0x20a253f3 -> :sswitch_f
        -0x15f36d2d -> :sswitch_5
        -0x137ae917 -> :sswitch_15
        -0xc2fb25e -> :sswitch_c
        -0x53cf4a1 -> :sswitch_6
        0x6dd5e94 -> :sswitch_11
        0x7d740ea -> :sswitch_12
        0x8b9a7bc -> :sswitch_5
        0xa14251e -> :sswitch_10
        0xf428cf6 -> :sswitch_2
        0x12123537 -> :sswitch_18
        0x170537c2 -> :sswitch_3
        0x21efe9bb -> :sswitch_18
        0x25ed33fd -> :sswitch_9
        0x2c56bb74 -> :sswitch_8
        0x2d93b98c -> :sswitch_16
        0x3084990f -> :sswitch_f
        0x33264912 -> :sswitch_13
        0x34fc2252 -> :sswitch_17
        0x3cb968c8 -> :sswitch_16
        0x41495d12 -> :sswitch_0
        0x419c5b39 -> :sswitch_7
        0x41e65f7c -> :sswitch_7
        0x43ba26c2 -> :sswitch_b
        0x4d3eb8e8 -> :sswitch_12
        0x5129a142 -> :sswitch_13
        0x51ccaa8c -> :sswitch_b
        0x56eed7c2 -> :sswitch_a
        0x58d87ed4 -> :sswitch_3
        0x5f4019f2 -> :sswitch_d
        0x617a51bc -> :sswitch_8
        0x6c11ad71 -> :sswitch_a
        0x6d62e647 -> :sswitch_0
        0x76fcdc40 -> :sswitch_1
        0x7a3c7109 -> :sswitch_c
        0x7c524347 -> :sswitch_9
    .end sparse-switch
.end method

.method public final ֫([BII[J)V
    .locals 23

    move-object/from16 v7, p0

    move/from16 v5, p2

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v15, 0x45201a30

    sget v16, Ll/֨۬;->۫ۙ᩺:I

    sget v17, Ll/֫ۧ;->ۙ۟ۧ:I

    const-string v18, "\u05ab\u1a77"

    invoke-static/range {v18 .. v18}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v17

    xor-int v0, v18, v16

    mul-int/lit16 v0, v0, 0x41a5

    const v20, 0x23e5f3e5

    xor-int v0, v0, v20

    const v20, 0x269ab8e0

    xor-int v18, v18, v20

    move-object v11, v10

    move/from16 v19, v18

    const/4 v1, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v18, 0x45201a30

    move-object v10, v4

    const/4 v4, 0x0

    :goto_0
    xor-int v7, v18, v16

    mul-int/lit16 v7, v7, 0x3c3f

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v0, v7

    xor-int v18, v19, v0

    sparse-switch v18, :sswitch_data_0

    move-object/from16 v7, p1

    const/16 v0, 0x20

    ushr-long v0, v2, v0

    long-to-int v1, v0

    long-to-int v4, v2

    .line 900
    move-object v11, v10

    check-cast v11, Ll/ܽᩳܳ;

    .line 462
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v0

    if-eqz v0, :cond_5

    goto/16 :goto_4

    .line 695
    :sswitch_0
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    goto/16 :goto_9

    :cond_1
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    goto/16 :goto_8

    .line 810
    :sswitch_1
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v0

    if-gez v0, :cond_2

    :goto_1
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    goto/16 :goto_a

    :cond_2
    move-object/from16 v7, p1

    goto/16 :goto_4

    .line 847
    :sswitch_2
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    sget v0, Ll/ۗۚ;->ܶۛᩴ:I

    if-gez v0, :cond_0

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    goto :goto_1

    .line 761
    :sswitch_4
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    return-void

    .line 902
    :sswitch_5
    invoke-static {v6}, Ll/۫ܽܳ;->֫(Ll/۫ܽܳ;)[B

    move-result-object v0

    sub-int v2, v1, v5

    sub-int v1, v4, v1

    move-object/from16 v7, p1

    invoke-static {v15, v0, v2, v7, v1}, Ll/ܿᩳܳ;->֫(I[BI[BI)V

    sub-int/2addr v4, v5

    move-object/from16 v0, p4

    .line 904
    invoke-static {v2, v4, v0}, Ll/ܿᩳܳ;->֫(II[J)V

    return-void

    :sswitch_6
    move-object/from16 v7, p1

    move-object/from16 v0, p4

    add-int v15, v14, v13

    goto :goto_2

    :sswitch_7
    move-object/from16 v7, p1

    move-object/from16 v0, p4

    const/4 v15, 0x0

    goto :goto_2

    :sswitch_8
    move-object/from16 v7, p1

    move-object/from16 v0, p4

    xor-int v19, v12, v13

    shr-int/lit8 v19, v19, 0x1f

    or-int/lit8 v19, v19, 0x1

    if-lez v19, :cond_3

    move v15, v14

    :goto_2
    const-string v19, "\u1a74\u073a"

    invoke-static/range {v19 .. v19}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v19

    add-int v19, v19, v16

    mul-int/lit8 v19, v19, -0x29

    xor-int v0, v19, v17

    mul-int/lit16 v0, v0, -0x3f51

    const v20, -0x356c0d5b    # -4847954.5f

    xor-int v0, v0, v20

    const v20, -0x4bbe32a5

    xor-int v19, v19, v20

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u1a74\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    move/from16 v19, v4

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, -0x65c1

    const v20, 0x1ba820a8

    xor-int v4, v4, v20

    const v20, -0x6c48b822

    goto :goto_3

    :sswitch_9
    move-object/from16 v7, p1

    move/from16 v19, v4

    .line 900
    invoke-static {v11}, Ll/ܽᩳܳ;->֫(Ll/ܽᩳܳ;)I

    move-result v0

    sub-int v12, v1, v0

    .line 901
    invoke-virtual {v6}, Ll/۫ܽܳ;->ۧ()I

    move-result v13

    .line 0
    rem-int v14, v12, v13

    if-nez v14, :cond_4

    const-string v0, "\u06ec\u06e1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, 0xf87

    const v20, 0x51eb1df

    xor-int v4, v4, v20

    const v20, -0x6352f822

    goto :goto_3

    :cond_4
    const-string v0, "\u1a76\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x1b

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, 0x3e27

    const v20, -0x5b950562

    xor-int v4, v4, v20

    const v20, 0x7f1a978f

    :goto_3
    xor-int v0, v0, v20

    move/from16 v22, v19

    move/from16 v19, v0

    move v0, v4

    goto/16 :goto_6

    :goto_4
    const-string v0, "\u06da\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x2b

    move/from16 v19, v1

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x2985

    const v20, -0x56d760ed

    xor-int v1, v1, v20

    const v20, -0x2590fb6a

    goto :goto_5

    :cond_5
    const-string v0, "\u06d8\u06db"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x7b

    move/from16 v19, v1

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x280b

    const v20, 0x4cb8b5f3    # 9.6841624E7f

    xor-int v1, v1, v20

    const v20, 0x2dc94216

    :goto_5
    xor-int v0, v0, v20

    move/from16 v22, v19

    move/from16 v19, v0

    move v0, v1

    move/from16 v1, v22

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v7, p1

    .line 907
    invoke-virtual {v6}, Ll/۫ܽܳ;->ۧ()I

    move-result v11

    new-instance v12, Ll/ۤܽܳ;

    move-object v0, v12

    move-object/from16 v1, p0

    move v2, v8

    move v3, v9

    move-object/from16 v4, p1

    move/from16 v5, p2

    move-object/from16 v6, p4

    invoke-direct/range {v0 .. v6}, Ll/ۤܽܳ;-><init>(Ll/᩺ܽܳ;II[BI[J)V

    invoke-virtual {v10, v8, v9, v11, v12}, Ll/ۧᩳܳ;->֫(IIILl/᩸ܽܳ;)V

    :sswitch_b
    return-void

    :sswitch_c
    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move/from16 v19, v4

    .line 896
    invoke-direct {v0, v8, v9}, Ll/᩺ܽܳ;->ܽ(II)J

    move-result-wide v2

    const-wide/16 v20, -0x1

    .line 897
    iget-object v10, v0, Ll/᩺ܽܳ;->ᩳ:Ll/ۧᩳܳ;

    iget-object v6, v0, Ll/᩺ܽܳ;->ܽ:Ll/۫ܽܳ;

    cmp-long v4, v2, v20

    if-eqz v4, :cond_6

    const-string v4, "\u05a8\u1a7b"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v16

    move/from16 v20, v1

    xor-int v1, v4, v17

    mul-int/lit16 v1, v1, 0x172d

    const v21, 0x2d81f2d0

    xor-int v1, v1, v21

    const v21, -0x6664ef8

    xor-int v4, v4, v21

    move v0, v1

    move/from16 v1, v20

    move/from16 v22, v19

    move/from16 v19, v4

    :goto_6
    move/from16 v4, v22

    goto/16 :goto_0

    :cond_6
    move/from16 v20, v1

    const-string v1, "\u0733\u1a7a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x7b45

    const v21, 0x61368a08

    xor-int v4, v4, v21

    const v21, 0x1c3e1b11

    xor-int v1, v1, v21

    move v0, v4

    goto :goto_7

    :sswitch_d
    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    .line 891
    iget v1, v0, Ll/᩺ܽܳ;->ۧ:I

    invoke-static {v5, v1}, Ll/֡ۜ;->۟᩻۠(II)I

    move-result v8

    .line 892
    iget v1, v0, Ll/᩺ܽܳ;->֫:I

    move/from16 v4, p3

    invoke-static {v4, v1}, Ll/ۖۘ;->ۖۙ᩵(II)I

    move-result v9

    if-lt v8, v9, :cond_7

    const-string v1, "\u06eb\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0xf

    xor-int v0, v1, v17

    mul-int/lit16 v0, v0, -0x52f9

    const v21, 0x5a18dc89

    xor-int v0, v0, v21

    const v21, 0x6bf043c5

    xor-int v1, v1, v21

    :goto_7
    move/from16 v4, v19

    move/from16 v19, v1

    goto/16 :goto_c

    :cond_7
    const-string v0, "\u06e7\u06e7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0xb

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x1fe7

    const v21, 0x3fb7540d

    xor-int v1, v1, v21

    const v21, 0x357ca4d7

    goto/16 :goto_b

    :sswitch_e
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    .line 413
    sget-boolean v0, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v0, :cond_8

    const-string v0, "\u1a79\u1a73"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x5b

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x434f

    const v21, 0x5aa90fb1

    xor-int v1, v1, v21

    const v21, -0x4218572a

    goto/16 :goto_b

    :cond_8
    const-string v0, "\u05ab\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x51

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x18d

    const v21, 0x3100de50

    xor-int v1, v1, v21

    const v21, -0x6b1fc207

    goto/16 :goto_b

    :sswitch_f
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    .line 274
    sget v0, Ll/۠;->ܺܺܶ:I

    if-ltz v0, :cond_9

    goto/16 :goto_a

    :cond_9
    const-string v0, "\u1a78\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x415

    const v21, -0x1b684a6a

    xor-int v1, v1, v21

    const v21, 0x644a2c7c

    goto/16 :goto_b

    :sswitch_10
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    sget v0, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v0, :cond_a

    goto/16 :goto_a

    :cond_a
    const-string v0, "\u1a76\u06da"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x1db9

    const v21, 0x56591e6e

    xor-int v1, v1, v21

    const v21, -0x62f87377

    goto/16 :goto_b

    :sswitch_11
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v0

    if-gtz v0, :cond_b

    goto/16 :goto_9

    :cond_b
    const-string v0, "\u05a1\u06e1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x6f

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x1221

    const v21, 0x5d27b6a0

    xor-int v1, v1, v21

    const v21, 0x23bc44fa

    goto/16 :goto_b

    :sswitch_12
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    .line 731
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_8

    :cond_c
    const-string v0, "\u06ec\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x65

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x3e7b

    const v21, -0x79ce0930

    xor-int v1, v1, v21

    const v21, -0x1e8ea933

    goto/16 :goto_b

    :sswitch_13
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    .line 713
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v0

    if-nez v0, :cond_d

    :goto_8
    const-string v0, "\u06d8\u06d9"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x6d

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x480d

    const v21, -0x3083ffb

    xor-int v1, v1, v21

    const v21, 0x6adc42bc

    goto/16 :goto_b

    :cond_d
    const-string v0, "\u1a74\u1a75"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x285

    const v21, -0x55addf7a

    xor-int v1, v1, v21

    const v21, 0x6d4544d2

    goto/16 :goto_b

    :sswitch_14
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    .line 208
    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v0, :cond_e

    :goto_9
    const-string v0, "\u06e2\u05a8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x4c43

    const v21, 0x53fd398f

    xor-int v1, v1, v21

    const v21, -0x2e5ab02a

    goto/16 :goto_b

    :cond_e
    const-string v0, "\u05a1\u1a75"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x43

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x7791

    const v21, -0xcd4013d

    xor-int v1, v1, v21

    const v21, 0x7fe04bd

    goto :goto_b

    :sswitch_15
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    .line 250
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v0

    if-ltz v0, :cond_f

    goto :goto_a

    :cond_f
    const-string v0, "\u1a74\u06db"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x6dbb

    const v21, 0x5de9b30a

    xor-int v1, v1, v21

    const v21, -0x3c9c4097

    goto :goto_b

    :sswitch_16
    move-object/from16 v7, p1

    move/from16 v20, v1

    move/from16 v19, v4

    move/from16 v4, p3

    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v0

    if-eqz v0, :cond_10

    :goto_a
    const-string v0, "\u06d7\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x3fb9

    const v21, -0x28088d98

    xor-int v1, v1, v21

    const v21, -0x494a45ca

    goto :goto_b

    :cond_10
    const-string v0, "\u1a76\u0730"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x7f

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x79dd

    const v21, 0x536cd60

    xor-int v1, v1, v21

    const v21, 0x45b488be

    :goto_b
    xor-int v0, v0, v21

    move/from16 v4, v19

    move/from16 v19, v0

    move v0, v1

    :goto_c
    move/from16 v1, v20

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e3dec00 -> :sswitch_6
        -0x75da63ce -> :sswitch_15
        -0x6eee8afb -> :sswitch_11
        -0x6bd6229d -> :sswitch_7
        -0x6a7f4f9b -> :sswitch_f
        -0x67f7fecb -> :sswitch_4
        -0x652fef12 -> :sswitch_4
        -0x5c5f94e2 -> :sswitch_15
        -0x5b8cb282 -> :sswitch_c
        -0x58ae09b5 -> :sswitch_9
        -0x517c718b -> :sswitch_a
        -0x47d9f2f4 -> :sswitch_0
        -0x46de1de8 -> :sswitch_12
        -0x42f6e325 -> :sswitch_6
        -0x4175c82b -> :sswitch_11
        -0x341b7dba -> :sswitch_14
        -0x2d5ac5ca -> :sswitch_b
        -0x26de6ce8 -> :sswitch_3
        -0x251c2a90 -> :sswitch_d
        -0x1fba2414 -> :sswitch_10
        -0x1c19e8d1 -> :sswitch_8
        -0x1367cd2d -> :sswitch_d
        -0xfa8f0d7 -> :sswitch_0
        0x9f683d -> :sswitch_f
        0x39b5310 -> :sswitch_2
        0x75c4321 -> :sswitch_9
        0x827133a -> :sswitch_16
        0x143a38d9 -> :sswitch_b
        0x16178f99 -> :sswitch_5
        0x1b5c4531 -> :sswitch_7
        0x30e100a8 -> :sswitch_13
        0x32838340 -> :sswitch_a
        0x3593fe2b -> :sswitch_1
        0x35b732d7 -> :sswitch_1
        0x37651325 -> :sswitch_c
        0x3d3ca589 -> :sswitch_13
        0x43fb6ba5 -> :sswitch_12
        0x4af47634 -> :sswitch_e
        0x502706cf -> :sswitch_14
        0x506a70cf -> :sswitch_3
        0x57746db0 -> :sswitch_5
        0x5da39722 -> :sswitch_e
        0x6685fa85 -> :sswitch_2
        0x6c1e9945 -> :sswitch_16
        0x6dcacdd2 -> :sswitch_10
        0x6ef6fdf4 -> :sswitch_8
    .end sparse-switch
.end method

.method public final ֫(II)Z
    .locals 19

    move-object/from16 v0, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const v13, 0x84be441

    sget v14, Ll/ۘۛ;->ۖۚ֡:I

    sget v15, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v16, "\u06e4\u1a76"

    invoke-static/range {v16 .. v16}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v15

    xor-int v1, v16, v14

    mul-int/lit16 v1, v1, -0x29bb

    const v18, 0x2c82f556

    xor-int v1, v1, v18

    const v18, 0x7c11a1a

    xor-int v16, v16, v18

    move-wide v11, v10

    move/from16 v17, v16

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v13, 0x0

    const v16, 0x84be441

    const/16 v18, 0x0

    move-wide v9, v8

    move-wide v7, v6

    move-object v6, v5

    const/4 v5, 0x0

    :goto_0
    xor-int v2, v16, v14

    mul-int/lit16 v2, v2, -0x4fbf

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v1, v2

    xor-int v16, v17, v1

    sparse-switch v16, :sswitch_data_0

    .line 951
    iget v1, v0, Ll/᩺ܽܳ;->ۧ:I

    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v2

    if-eqz v2, :cond_9

    move/from16 v18, v1

    goto/16 :goto_8

    .line 105
    :sswitch_0
    sget v1, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v1, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    move/from16 v17, v18

    goto/16 :goto_a

    .line 251
    :sswitch_1
    sget v1, Ll/᩺;->ۙۛܶ:I

    if-gtz v1, :cond_1

    goto :goto_2

    :cond_1
    const-string v1, "\u06ec\u1a76"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x1a95

    const v17, 0x1d4de259

    xor-int v2, v2, v17

    const v17, 0x54d93d06

    goto/16 :goto_5

    .line 345
    :sswitch_2
    sget v1, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v1, :cond_b

    goto :goto_2

    .line 508
    :sswitch_3
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    :goto_2
    const-string v1, "\u1a75\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x677

    const v17, -0x27ceddbb

    xor-int v2, v2, v17

    const v17, -0x350b127e    # -8025793.0f

    goto/16 :goto_5

    .line 788
    :sswitch_4
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    const/4 v1, 0x0

    return v1

    :sswitch_5
    const/4 v1, 0x1

    return v1

    .line 1147
    :sswitch_6
    invoke-virtual {v6, v13, v4}, Ll/ۧᩳܳ;->֫(II)I

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "\u06df\u06ec"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v15

    mul-int/lit16 v2, v2, -0xa2d

    const v17, -0x4a423849

    xor-int v2, v2, v17

    const v17, -0x68814725

    goto/16 :goto_5

    :cond_2
    move/from16 v2, v18

    goto/16 :goto_6

    :sswitch_7
    const/high16 v1, -0x80000000

    const/high16 v13, -0x80000000

    goto :goto_3

    :sswitch_8
    long-to-int v1, v11

    move v13, v1

    :goto_3
    const-string v1, "\u06ec\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0x3865

    const v17, 0x369b832d

    xor-int v2, v2, v17

    const v17, 0x55460a1f

    goto/16 :goto_5

    :sswitch_9
    const-wide/32 v1, -0x80000000

    cmp-long v17, v11, v1

    if-gtz v17, :cond_3

    const-string v1, "\u06d9\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0xf

    xor-int v2, v1, v15

    mul-int/lit16 v2, v2, 0x2df3

    const v17, -0x2c32eea5

    xor-int v2, v2, v17

    const v17, -0x4fb8992e

    goto/16 :goto_5

    :cond_3
    const-string v1, "\u06e7\u06d8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0x4d

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0x1267

    const v17, 0x38fde33a

    xor-int v2, v2, v17

    const v17, 0x6506a516

    goto/16 :goto_5

    :sswitch_a
    sub-long v1, v7, v9

    const-wide/16 v11, 0x1

    add-long/2addr v11, v1

    .line 153
    sget-boolean v1, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v1, :cond_4

    goto/16 :goto_1

    :cond_4
    const-string v1, "\u06e0\u06d9"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0x3b

    xor-int v2, v1, v15

    mul-int/lit16 v2, v2, 0x437

    const v17, -0x40a2e983

    xor-int v2, v2, v17

    const v17, -0x34dd0093    # -1.0682221E7f

    goto :goto_5

    :sswitch_b
    int-to-long v7, v3

    int-to-long v9, v5

    .line 39
    sget-boolean v1, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v1, :cond_5

    :goto_4
    move/from16 v17, v18

    goto/16 :goto_9

    :cond_5
    const-string v1, "\u0736\u06d9"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x53f9

    const v17, -0x79b7dfb7

    xor-int v2, v2, v17

    const v17, 0x718911e2

    goto :goto_5

    .line 954
    :sswitch_c
    invoke-static {v6}, Ll/֫᩵;->ۡ۬ܳ(Ljava/lang/Object;)Ljava/lang/Class;

    sget v1, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v1, :cond_6

    goto/16 :goto_8

    :cond_6
    const-string v1, "\u0733\u06e0"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0x49

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x7721

    const v17, -0x3651986f

    xor-int v2, v2, v17

    const v17, 0x5064db6b

    goto :goto_5

    .line 953
    :sswitch_d
    iget-object v1, v0, Ll/᩺ܽܳ;->ܽ:Ll/۫ܽܳ;

    .line 954
    invoke-virtual {v1}, Ll/۫ܽܳ;->ۧ()I

    move-result v5

    iget-object v6, v0, Ll/᩺ܽܳ;->ᩳ:Ll/ۧᩳܳ;

    .line 238
    sget-boolean v1, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v1, :cond_7

    goto :goto_4

    :cond_7
    const-string v1, "\u06e0\u06e0"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v2, v1, v15

    mul-int/lit16 v2, v2, 0xb5d

    const v17, 0x5e6288d2

    xor-int v2, v2, v17

    const v17, -0x1fb21fae

    :goto_5
    xor-int v17, v1, v17

    goto :goto_7

    :sswitch_e
    const/4 v1, 0x0

    return v1

    :sswitch_f
    move/from16 v1, p1

    move/from16 v2, v18

    .line 951
    invoke-static {v1, v2}, Ll/֡ۜ;->۟᩻۠(II)I

    move-result v3

    .line 952
    iget v4, v0, Ll/᩺ܽܳ;->֫:I

    move/from16 v1, p2

    invoke-static {v1, v4}, Ll/֨۫;->ۗܺܶ(II)I

    move-result v4

    if-ge v3, v4, :cond_8

    const-string v17, "\u1a76\u06d9"

    invoke-static/range {v17 .. v17}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v15

    xor-int v1, v17, v14

    mul-int/lit16 v1, v1, -0x19f3

    const v18, 0x12756492

    xor-int v1, v1, v18

    const v18, 0x51847d15

    xor-int v17, v17, v18

    move/from16 v18, v2

    goto/16 :goto_0

    :cond_8
    :goto_6
    const-string v1, "\u05a1\u1a76"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    move/from16 v17, v2

    xor-int v2, v1, v15

    mul-int/lit16 v2, v2, -0x7e71

    const v18, -0x4f5866e3

    xor-int v2, v2, v18

    const v18, -0x2997d63d

    xor-int v1, v1, v18

    move/from16 v18, v17

    move/from16 v17, v1

    :goto_7
    move v1, v2

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u06df\u073d"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v0, v2, v15

    mul-int/lit16 v0, v0, -0x34f9

    const v17, -0x1bf3d9b3

    xor-int v0, v0, v17

    const v17, 0x5d4d4ce1

    xor-int v17, v2, v17

    move/from16 v18, v1

    move v1, v0

    goto/16 :goto_c

    :sswitch_10
    move/from16 v17, v18

    .line 47
    sget v0, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v0, :cond_a

    goto :goto_9

    :cond_a
    const-string v0, "\u06d8\u1a76"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x6507

    const v2, 0x4fee390d

    xor-int/2addr v1, v2

    const v2, 0x2fdb9ecb

    goto/16 :goto_b

    :sswitch_11
    move/from16 v17, v18

    .line 372
    sget v0, Ll/֡֡;->֫ۤܳ:I

    if-ltz v0, :cond_c

    move/from16 v18, v17

    :cond_b
    :goto_8
    const-string v0, "\u06e0\u1a79"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x67

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x1865

    const v2, 0x748d119c

    xor-int/2addr v1, v2

    const v2, 0x6bd40f27

    xor-int v17, v0, v2

    goto/16 :goto_c

    :cond_c
    const-string v0, "\u06e8\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x13fd

    const v2, 0x721b875e

    xor-int/2addr v1, v2

    const v2, 0x46c4f06a

    goto/16 :goto_b

    :sswitch_12
    move/from16 v17, v18

    sget-boolean v0, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v0, :cond_d

    goto :goto_9

    :cond_d
    const-string v0, "\u06e1\u06dc"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x323f

    const v2, 0x40110af1

    xor-int/2addr v1, v2

    const v2, -0x6c20144c

    goto :goto_b

    :sswitch_13
    move/from16 v17, v18

    sget v0, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v0, :cond_e

    :goto_9
    const-string v0, "\u06e1\u06e7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x395b

    const v2, 0x5a803793

    xor-int/2addr v1, v2

    const v2, -0x621efa8c

    goto :goto_b

    :cond_e
    const-string v0, "\u073f\u06dc"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x77b9

    const v2, -0x5b816cf2

    xor-int/2addr v1, v2

    const v2, -0x70243da0

    goto :goto_b

    :sswitch_14
    move/from16 v17, v18

    .line 774
    sget v0, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v0, :cond_f

    :goto_a
    const-string v0, "\u1a7b\u1a73"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x47

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x4fdb

    const v2, -0x77c6fa72

    xor-int/2addr v1, v2

    const v2, -0x328f27a8

    goto :goto_b

    :cond_f
    const-string v0, "\u073f\u06e4"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x6357

    const v2, -0xe0a9d21

    xor-int/2addr v1, v2

    const v2, -0x7ad64e89

    :goto_b
    xor-int/2addr v0, v2

    move/from16 v18, v17

    move/from16 v17, v0

    :goto_c
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f648045 -> :sswitch_9
        -0x7bbeee2d -> :sswitch_8
        -0x796b8b49 -> :sswitch_c
        -0x7805f360 -> :sswitch_11
        -0x76666caa -> :sswitch_c
        -0x74253c19 -> :sswitch_7
        -0x73b24412 -> :sswitch_13
        -0x69ddcade -> :sswitch_14
        -0x69d84799 -> :sswitch_12
        -0x4f4e562d -> :sswitch_e
        -0x48ec831b -> :sswitch_14
        -0x47f0ea75 -> :sswitch_6
        -0x3f9b66e4 -> :sswitch_d
        -0x3b5af70f -> :sswitch_6
        -0x3ac5ecda -> :sswitch_2
        -0x36222dd2 -> :sswitch_b
        -0x3131cbda -> :sswitch_1
        -0x1f95d755 -> :sswitch_a
        -0x1c0fe1e9 -> :sswitch_13
        -0xe58d42d -> :sswitch_5
        -0xc915caa -> :sswitch_a
        -0xb1a23d8 -> :sswitch_2
        -0xadfe2b5 -> :sswitch_3
        -0x5c9c2a2 -> :sswitch_10
        0x20d4209 -> :sswitch_8
        0x23ce885 -> :sswitch_11
        0x7dda662 -> :sswitch_5
        0xc020678 -> :sswitch_0
        0x1e38fa37 -> :sswitch_12
        0x201d6470 -> :sswitch_10
        0x244b5ba8 -> :sswitch_e
        0x3a2145a2 -> :sswitch_4
        0x3b94d83a -> :sswitch_f
        0x49073bf6 -> :sswitch_7
        0x4a5ee0b3 -> :sswitch_1
        0x51f07fb5 -> :sswitch_3
        0x56659fdf -> :sswitch_b
        0x5b147c37 -> :sswitch_4
        0x604c3272 -> :sswitch_d
        0x6d2ce6e2 -> :sswitch_9
        0x6f47d0e0 -> :sswitch_f
        0x75e212c6 -> :sswitch_0
    .end sparse-switch
.end method

.method public final ֫(Ll/᩹ܽܳ;)Z
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x468f03da

    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    const-string v5, "\u1a7b\u1a7b"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x43

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4f9

    const v7, 0x56641432

    xor-int/2addr v6, v7

    const v7, 0x2151f182

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x1ba9

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 683
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    goto/16 :goto_3

    :sswitch_0
    sget v5, Ll/֡ᩴ;->ܳۤ֫:I

    if-gez v5, :cond_c

    goto/16 :goto_1

    .line 184
    :sswitch_1
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    sget v5, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v5, :cond_3

    goto/16 :goto_3

    .line 700
    :sswitch_2
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    sget-boolean v5, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v5, :cond_7

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    const/4 p1, 0x0

    return p1

    :sswitch_4
    const/4 p1, 0x1

    return p1

    .line 984
    :sswitch_5
    iget-object v5, p0, Ll/᩺ܽܳ;->ᩳ:Ll/ۧᩳܳ;

    iget-object v6, v0, Ll/᩺ܽܳ;->ᩳ:Ll/ۧᩳܳ;

    .line 985
    invoke-virtual {v5, v6}, Ll/ۧᩳܳ;->֫(Ll/ۧᩳܳ;)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string v5, "\u06e0\u0733"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4ad3

    const v7, -0x24b5841b

    xor-int/2addr v6, v7

    const v7, -0x21ebb066

    goto :goto_0

    .line 984
    :sswitch_6
    iget-object v5, v0, Ll/᩺ܽܳ;->ܽ:Ll/۫ܽܳ;

    invoke-virtual {v5}, Ll/۫ܽܳ;->ۧ()I

    move-result v5

    if-ne v1, v5, :cond_1

    const-string v5, "\u1a78\u06ec"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6501

    const v7, -0x30097656

    xor-int/2addr v6, v7

    const v7, -0x78c2042d

    goto :goto_0

    .line 981
    :sswitch_7
    iget-object v1, p0, Ll/᩺ܽܳ;->ܽ:Ll/۫ܽܳ;

    .line 984
    invoke-virtual {v1}, Ll/۫ܽܳ;->ۧ()I

    move-result v1

    .line 22
    sget-boolean v5, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v5, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v5, "\u06dc\u073a"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2eab

    const v7, -0x610268ff

    xor-int/2addr v6, v7

    const v7, -0x7eeec04

    goto/16 :goto_0

    .line 981
    :sswitch_8
    iget v5, p0, Ll/᩺ܽܳ;->֫:I

    iget v6, v0, Ll/᩺ܽܳ;->֫:I

    if-ne v5, v6, :cond_1

    const-string v5, "\u06d9\u073d"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x7

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x706f

    const v7, -0x5b73b2e8

    xor-int/2addr v6, v7

    const v7, -0x2780f4d1

    goto/16 :goto_0

    :sswitch_9
    move-object v0, p1

    check-cast v0, Ll/᩺ܽܳ;

    iget v5, p0, Ll/᩺ܽܳ;->ۧ:I

    iget v6, v0, Ll/᩺ܽܳ;->ۧ:I

    if-ne v5, v6, :cond_1

    const-string v5, "\u05a8\u0733"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x5f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6c43

    const v7, -0x24145d29

    xor-int/2addr v6, v7

    const v7, -0x1eadfd11

    goto/16 :goto_0

    :sswitch_a
    const/4 p1, 0x0

    return p1

    .line 985
    :sswitch_b
    instance-of v5, p1, Ll/᩺ܽܳ;

    if-eqz v5, :cond_1

    const-string v5, "\u0733\u0730"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x43

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4003

    const v7, -0x3c4ba2a1

    xor-int/2addr v6, v7

    const v7, -0x52f69edb

    goto/16 :goto_0

    :cond_1
    const-string v5, "\u05a8\u05a1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4b7d

    const v7, -0x6d1f4896

    xor-int/2addr v6, v7

    const v7, 0x1c7cdc9e

    goto/16 :goto_0

    .line 379
    :sswitch_c
    sget v5, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v5, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v5, "\u073a\u1a78"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x45d5

    const v7, -0x1ba85c02

    xor-int/2addr v6, v7

    const v7, 0x27ccc8ab

    goto/16 :goto_0

    .line 775
    :sswitch_d
    sget v5, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v5, :cond_4

    :cond_3
    :goto_1
    const-string v5, "\u06e2\u073f"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7b21

    const v7, 0x32a3e8fe

    xor-int/2addr v6, v7

    const v7, -0x56813b10

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u1a78\u06df"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x5b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x257

    const v7, 0x1b9fe26f

    xor-int/2addr v6, v7

    const v7, 0x37f916dc

    goto/16 :goto_0

    .line 760
    :sswitch_e
    sget v5, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v5, :cond_5

    goto :goto_2

    :cond_5
    const-string v5, "\u0733\u05a1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x14af

    const v7, -0x73d2b3f0

    xor-int/2addr v6, v7

    const v7, -0x594c7ca4

    goto/16 :goto_0

    .line 440
    :sswitch_f
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_3

    :cond_6
    const-string v5, "\u073a\u0736"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x71

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x66b3

    const v7, 0x39d0278f

    xor-int/2addr v6, v7

    const v7, -0x584abd11

    goto/16 :goto_0

    .line 618
    :sswitch_10
    sget v5, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v5, :cond_8

    :cond_7
    :goto_2
    const-string v5, "\u05a1\u073f"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x4d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x73f7

    const v7, 0x44765378

    xor-int/2addr v6, v7

    const v7, 0x5b340d42

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06d9\u05a1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x1f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x15c7

    const v7, -0x182edf54

    xor-int/2addr v6, v7

    const v7, -0x4c78cc0a

    goto/16 :goto_0

    .line 313
    :sswitch_11
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v5

    if-eqz v5, :cond_9

    :goto_3
    const-string v5, "\u06dc\u06d6"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1521

    const v7, -0x659dd546

    xor-int/2addr v6, v7

    const v7, -0x9bdda98

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06db\u06e8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5ae7

    const v7, -0x1a0039fe

    xor-int/2addr v6, v7

    const v7, 0x7e5b302c

    goto/16 :goto_0

    :sswitch_12
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v5

    if-eqz v5, :cond_a

    :goto_4
    const-string v5, "\u1a79\u1a7a"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1b33

    const v7, 0x2ee430dc

    xor-int/2addr v6, v7

    const v7, -0x7285180c

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06e7\u06e0"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x6d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x76ed

    const v7, 0x5fde0c54    # 3.2000512E19f

    xor-int/2addr v6, v7

    const v7, -0x5daa850b

    goto/16 :goto_0

    :sswitch_13
    sget v5, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v5, :cond_b

    goto :goto_5

    :cond_b
    const-string v5, "\u1a73\u0730"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x31b3

    const v7, -0x348bd617    # -1.6001513E7f

    xor-int/2addr v6, v7

    const v7, -0x1ecbca5b

    goto/16 :goto_0

    .line 970
    :sswitch_14
    sget v5, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v5, :cond_d

    :cond_c
    :goto_5
    const-string v5, "\u1a75\u0730"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6edd

    const v7, 0x2b9acfb0    # 1.1000003E-12f

    xor-int/2addr v6, v7

    const v7, 0x4075a7d4

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u1a7b\u06db"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x57

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5c41

    const v7, 0x34ddabb9

    xor-int/2addr v6, v7

    const v7, -0x2c838fab

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ef97a51 -> :sswitch_b
        -0x7c91837e -> :sswitch_9
        -0x7af47fd9 -> :sswitch_7
        -0x726048b3 -> :sswitch_a
        -0x6f88b502 -> :sswitch_e
        -0x6d53e1cf -> :sswitch_10
        -0x65decc7c -> :sswitch_d
        -0x57ad94c8 -> :sswitch_3
        -0x4de12694 -> :sswitch_10
        -0x456f6946 -> :sswitch_2
        -0x43ce884e -> :sswitch_11
        -0x34c4385b -> :sswitch_b
        -0x32e18b51 -> :sswitch_5
        -0x2f6cfb3a -> :sswitch_f
        -0x2e6abc5b -> :sswitch_1
        -0x254a12a7 -> :sswitch_7
        -0x2492f3ee -> :sswitch_14
        -0x1c3797ca -> :sswitch_1
        -0x1a654936 -> :sswitch_14
        -0xab34ab1 -> :sswitch_c
        -0x98fccf2 -> :sswitch_8
        -0x2f436b2 -> :sswitch_a
        0xdc0fbc8 -> :sswitch_12
        0x1115d0ca -> :sswitch_8
        0x118e83ff -> :sswitch_c
        0x14e63d52 -> :sswitch_6
        0x19fa9108 -> :sswitch_f
        0x1ab50b62 -> :sswitch_3
        0x24895f0d -> :sswitch_11
        0x25875e87 -> :sswitch_6
        0x27db7984 -> :sswitch_12
        0x2c375df8 -> :sswitch_0
        0x3750b8b8 -> :sswitch_d
        0x3eba5163 -> :sswitch_e
        0x3ecda4a6 -> :sswitch_9
        0x4011bbd3 -> :sswitch_13
        0x4589ed1d -> :sswitch_2
        0x4c27ab93 -> :sswitch_4
        0x4ff74ce3 -> :sswitch_4
        0x5ff98be0 -> :sswitch_13
        0x618e5da5 -> :sswitch_0
        0x6bc935d7 -> :sswitch_5
    .end sparse-switch
.end method

.method public final ۧ(II)J
    .locals 39

    move-object/from16 v0, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const v31, 0x252d675c

    sget v32, Ll/֨ᩴ;->ۢ֨ۖ:I

    sget v33, Ll/ۘܿ;->ۘܰ۫:I

    const-string v34, "\u1a76\u06e0"

    invoke-static/range {v34 .. v34}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v34

    xor-int v34, v34, v32

    xor-int v1, v34, v33

    mul-int/lit16 v1, v1, 0x78e5

    const v36, 0x60cdaf70

    xor-int v1, v1, v36

    const v36, -0x5674489b

    xor-int v34, v34, v36

    move-wide v13, v12

    move-wide/from16 v19, v18

    move-wide/from16 v30, v29

    move/from16 v35, v34

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v15, 0x0

    const v34, 0x252d675c

    move-wide v11, v10

    move-wide/from16 v17, v16

    move-wide/from16 v28, v27

    move-object/from16 v16, v3

    move-wide v9, v8

    move-wide/from16 v26, v25

    const/4 v3, 0x0

    move-wide/from16 v37, v6

    move-object v6, v5

    move-wide/from16 v7, v23

    const/4 v5, 0x0

    move-wide/from16 v24, v37

    move-wide/from16 v22, v21

    const/16 v21, 0x0

    :goto_0
    xor-int v0, v34, v33

    mul-int/lit16 v0, v0, -0x385d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v1

    xor-int v34, v35, v0

    sparse-switch v34, :sswitch_data_0

    sub-long v0, v22, v11

    const-wide/16 v26, 0x8

    .line 1196
    div-long v28, v0, v26

    sget-boolean v0, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v0, :cond_5

    goto/16 :goto_3

    .line 567
    :sswitch_0
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v0

    if-nez v0, :cond_0

    :goto_1
    move-object/from16 v0, p0

    move/from16 v36, v21

    move/from16 v21, v2

    move/from16 v2, p2

    goto/16 :goto_8

    :cond_0
    const-string v0, "\u06d8\u073a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    mul-int/lit8 v0, v0, -0x2d

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0xaf3

    const v35, 0x69d489cb

    xor-int v1, v1, v35

    const v35, 0x5234c33f

    goto/16 :goto_6

    .line 405
    :sswitch_1
    sget v0, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v0, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "\u1a77\u1a7b"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0x5b93

    const v35, 0xc652a2c

    xor-int v1, v1, v35

    const v35, -0x35a6675a    # -3565097.5f

    goto/16 :goto_6

    .line 1128
    :sswitch_2
    sget v0, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v0, :cond_3

    :cond_2
    move/from16 v35, v3

    move/from16 v36, v21

    move/from16 v21, v2

    move/from16 v2, p1

    goto/16 :goto_c

    :cond_3
    :goto_2
    move/from16 v35, v3

    move/from16 v36, v21

    move/from16 v21, v2

    move/from16 v2, p1

    goto/16 :goto_b

    .line 1092
    :sswitch_3
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    sget-boolean v0, Ll/֡ۨ;->ܽܶۖ:Z

    if-eqz v0, :cond_2

    goto :goto_1

    .line 299
    :sswitch_4
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    goto :goto_1

    .line 235
    :sswitch_5
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    const-wide/16 v0, 0x0

    return-wide v0

    :sswitch_6
    int-to-long v0, v4

    mul-long v0, v0, v17

    add-long v0, v0, v19

    return-wide v0

    .line 1189
    :sswitch_7
    invoke-virtual {v6}, Ll/ۧᩳܳ;->֫()J

    move-result-wide v0

    return-wide v0

    :sswitch_8
    return-wide v7

    :sswitch_9
    const-wide/16 v0, 0x40

    add-long v0, v30, v0

    .line 1197
    invoke-static {v7, v8, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    return-wide v0

    :sswitch_a
    mul-long v30, v28, v26

    sget v0, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v0, :cond_4

    :goto_3
    move-object/from16 v0, p0

    move/from16 v35, v3

    move/from16 v1, v21

    move/from16 v21, v2

    :goto_4
    move/from16 v2, p1

    goto/16 :goto_a

    :cond_4
    const-string v0, "\u06d7\u073f"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0x581

    const v35, 0x84fc206

    xor-int v1, v1, v35

    const v35, 0x115188c8

    goto/16 :goto_6

    :cond_5
    const-string v0, "\u06d7\u06d6"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, 0x159d

    const v35, 0x3191fd6d

    xor-int v1, v1, v35

    const v35, -0x838d872

    goto/16 :goto_6

    :sswitch_b
    return-wide v19

    :sswitch_c
    int-to-long v0, v4

    mul-long v0, v0, v17

    add-long v0, v0, v19

    return-wide v0

    :sswitch_d
    if-gt v4, v2, :cond_6

    const-string v0, "\u06d8\u1a7b"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    mul-int/lit8 v0, v0, -0x67

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, 0x1b59

    const v35, -0x787455ed

    xor-int v1, v1, v35

    const v35, -0x3db76916

    goto/16 :goto_6

    :cond_6
    const-string v0, "\u06df\u0730"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, -0x2a45

    const v35, -0x5651eccc

    xor-int v1, v1, v35

    const v35, -0x94c058d

    goto/16 :goto_6

    :sswitch_e
    int-to-long v0, v4

    mul-long v22, v0, v17

    add-long v7, v22, v19

    if-gt v4, v2, :cond_7

    const-string v0, "\u06db\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v32

    mul-int/lit8 v0, v0, 0x2b

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, 0x51b

    const v35, 0xa928390

    xor-int v1, v1, v35

    const v35, 0xb7edc9a

    goto/16 :goto_6

    :cond_7
    const-string v0, "\u06df\u06d9"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, 0xb1

    const v35, -0x259a9d24

    xor-int v1, v1, v35

    const v35, 0x5054c486

    goto/16 :goto_6

    :sswitch_f
    const/4 v0, 0x3

    if-lt v4, v0, :cond_8

    const-string v0, "\u1a74\u05a1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0x52f7

    const v35, 0x1c8036d2

    xor-int v1, v1, v35

    const v35, 0x3b9aae38

    goto/16 :goto_6

    :cond_8
    const-string v0, "\u06d9\u06db"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0x7ac5

    const v35, -0x769e16b4

    xor-int v1, v1, v35

    const v35, 0x18de6222

    goto/16 :goto_6

    .line 1185
    :sswitch_10
    instance-of v0, v6, Ll/۠ܽܳ;

    const/16 v2, 0x40

    if-eqz v0, :cond_9

    const-string v0, "\u06db\u05a8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, 0x3b47

    const v35, 0x4b5a31a9    # 1.4299561E7f

    xor-int v1, v1, v35

    const v35, 0xbd6be7d

    goto/16 :goto_6

    :cond_9
    const-string v0, "\u073d\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, -0x547d

    const v35, 0x1c6fbe9

    xor-int v1, v1, v35

    const v35, 0x6c86aec4

    goto/16 :goto_6

    .line 1178
    :sswitch_11
    invoke-virtual {v6}, Ll/ۧᩳܳ;->֫()J

    move-result-wide v0

    return-wide v0

    .line 1180
    :sswitch_12
    instance-of v0, v6, Ll/ܽᩳܳ;

    const-wide/16 v17, 0x4

    const-wide/16 v19, 0x30

    if-eqz v0, :cond_a

    const-string v0, "\u0736\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v32

    mul-int/lit8 v0, v0, -0x11

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, 0x7d87

    const v35, 0xa2f30bd

    xor-int v1, v1, v35

    const v35, 0x6e6595ba

    goto/16 :goto_6

    :cond_a
    const-string v0, "\u1a74\u1a73"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, 0x4ccd

    const v35, -0x5759f7a2

    xor-int v1, v1, v35

    const v35, -0x39ff15a8

    goto/16 :goto_6

    :sswitch_13
    const-wide/16 v0, 0x0

    return-wide v0

    .line 1177
    :sswitch_14
    invoke-virtual {v6}, Ll/ۧᩳܳ;->ܽ()I

    move-result v0

    if-ne v4, v0, :cond_b

    const-string v0, "\u0736\u1a75"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0x6a2d

    const v35, 0xa7653f2

    xor-int v1, v1, v35

    const v35, 0x740b182d

    goto/16 :goto_6

    :cond_b
    const-string v0, "\u05a1\u073a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0x5fd7

    const v35, 0x68afd87f

    xor-int v1, v1, v35

    const v35, 0x68a6662c

    goto/16 :goto_6

    .line 1173
    :sswitch_15
    invoke-virtual {v6, v15, v3}, Ll/ۧᩳܳ;->֫(II)I

    move-result v4

    if-nez v4, :cond_c

    const-string v0, "\u06e2\u0730"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, 0x1f83

    const v35, -0x6f77535f

    xor-int v1, v1, v35

    const v35, -0x16b25d82

    goto/16 :goto_6

    :cond_c
    const-string v0, "\u05a8\u05a8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x22d5

    const v35, 0x2efe937f

    xor-int v1, v1, v35

    const v35, -0x5b66c8f3

    goto/16 :goto_6

    :sswitch_16
    const/high16 v0, -0x80000000

    const/high16 v15, -0x80000000

    goto :goto_5

    :sswitch_17
    long-to-int v0, v13

    move v15, v0

    :goto_5
    const-string v0, "\u06e8\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, -0x3ec7

    const v35, -0x5b95dd10

    xor-int v1, v1, v35

    const v35, 0x5b58d512

    goto :goto_6

    :sswitch_18
    const-wide/16 v11, 0x1

    add-long v13, v9, v11

    const-wide/32 v0, -0x80000000

    cmp-long v35, v13, v0

    if-gtz v35, :cond_d

    const-string v0, "\u06df\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    mul-int/lit8 v0, v0, -0x69

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0xff9

    const v35, -0x5c35b9bf

    xor-int v1, v1, v35

    const v35, 0x4f4bf6c6

    goto :goto_6

    :cond_d
    const-string v0, "\u06e7\u1a74"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    mul-int/lit8 v0, v0, 0x45

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, 0x242f

    const v35, -0x2200ba85

    xor-int v1, v1, v35

    const v35, -0x7005af49

    goto :goto_6

    :sswitch_19
    int-to-long v0, v5

    sub-long v9, v24, v0

    sget v0, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v0, :cond_e

    goto/16 :goto_2

    :cond_e
    const-string v0, "\u0736\u06e0"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0x13bf

    const v35, 0x6accd229

    xor-int v1, v1, v35

    const v35, 0x6d2d8e65

    :goto_6
    xor-int v35, v0, v35

    goto/16 :goto_0

    :sswitch_1a
    move-object/from16 v0, p0

    .line 974
    iget-object v6, v0, Ll/᩺ܽܳ;->ᩳ:Ll/ۧᩳܳ;

    invoke-static {v6}, Ll/ۗ᩷;->ۖۧۙ(Ljava/lang/Object;)Ljava/lang/Class;

    move/from16 v35, v3

    move/from16 v1, v21

    move/from16 v21, v2

    int-to-long v2, v1

    .line 91
    sget v24, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v24, :cond_f

    move-wide/from16 v24, v2

    goto/16 :goto_4

    :cond_f
    const-string v24, "\u073a\u06eb"

    invoke-static/range {v24 .. v24}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v24

    xor-int v24, v24, v32

    move/from16 v36, v1

    xor-int v1, v24, v33

    mul-int/lit16 v1, v1, -0x46b7

    const v25, 0x13ea225f

    xor-int v1, v1, v25

    const v25, -0x23bff86d

    xor-int v24, v24, v25

    move-wide/from16 v37, v2

    move/from16 v2, v21

    move/from16 v3, v35

    move/from16 v21, v36

    move/from16 v35, v24

    move-wide/from16 v24, v37

    goto/16 :goto_0

    :sswitch_1b
    move-object/from16 v0, p0

    move/from16 v35, v3

    move/from16 v36, v21

    move/from16 v21, v2

    .line 975
    invoke-virtual/range {v16 .. v16}, Ll/۫ܽܳ;->ۧ()I

    move-result v5

    .line 774
    sget v1, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v1, :cond_10

    move/from16 v2, p1

    move/from16 v1, v36

    goto/16 :goto_a

    :cond_10
    const-string v1, "\u06e0\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v32

    xor-int v2, v1, v33

    mul-int/lit16 v2, v2, -0x53ef

    const v3, -0x401c314a

    xor-int/2addr v2, v3

    const v3, -0x1ac49b7

    xor-int/2addr v1, v3

    move/from16 v3, v35

    move/from16 v35, v1

    :goto_7
    move v1, v2

    goto :goto_9

    :sswitch_1c
    move-object/from16 v0, p0

    move/from16 v36, v21

    move/from16 v21, v2

    .line 973
    iget v1, v0, Ll/᩺ܽܳ;->֫:I

    move/from16 v2, p2

    invoke-static {v2, v1}, Ll/ۖۘ;->ۖۙ᩵(II)I

    move-result v3

    .line 974
    iget-object v1, v0, Ll/᩺ܽܳ;->ܽ:Ll/۫ܽܳ;

    .line 870
    sget v16, Ll/᩹;->ۤܿܳ:I

    if-eqz v16, :cond_11

    move-object/from16 v16, v1

    :goto_8
    const-string v1, "\u05ab\u06d8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v33

    mul-int/lit8 v1, v1, -0xd

    xor-int v2, v1, v32

    mul-int/lit16 v2, v2, 0x2cf

    const v35, 0x4767ee6b

    xor-int v2, v2, v35

    const v35, -0x4086d64e

    xor-int v35, v1, v35

    goto :goto_7

    :cond_11
    const-string v2, "\u06db\u1a78"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v33

    move-object/from16 v16, v1

    xor-int v1, v2, v32

    mul-int/lit16 v1, v1, 0x57ef

    const v35, 0x3eda49f

    xor-int v1, v1, v35

    const v35, -0x7f23de29

    xor-int v35, v2, v35

    :goto_9
    move/from16 v2, v21

    move/from16 v21, v36

    goto/16 :goto_0

    :sswitch_1d
    move-object/from16 v0, p0

    move/from16 v21, v2

    move/from16 v35, v3

    .line 972
    iget v1, v0, Ll/᩺ܽܳ;->ۧ:I

    move/from16 v2, p1

    invoke-static {v2, v1}, Ll/ۘۨ;->᩺۬֨(II)I

    move-result v1

    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v3, :cond_12

    :goto_a
    const-string v3, "\u06e8\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v33

    mul-int/lit8 v3, v3, -0x11

    xor-int v0, v3, v32

    mul-int/lit16 v0, v0, -0x5385

    const v36, -0x609308ba

    xor-int v0, v0, v36

    const v36, -0x2002790a

    xor-int v3, v3, v36

    move/from16 v2, v21

    move/from16 v21, v1

    move v1, v0

    move/from16 v37, v35

    move/from16 v35, v3

    move/from16 v3, v37

    goto/16 :goto_0

    :cond_12
    const-string v0, "\u05a1\u073d"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v32, v0

    mul-int/lit8 v0, v0, -0x5f

    xor-int v3, v0, v33

    mul-int/lit16 v3, v3, -0x12f1

    const v36, 0xac1304c

    xor-int v3, v3, v36

    const v36, -0x3cb22c7b

    xor-int v0, v0, v36

    move/from16 v2, v21

    move/from16 v21, v1

    move v1, v3

    move/from16 v3, v35

    goto/16 :goto_e

    :sswitch_1e
    move/from16 v35, v3

    move/from16 v36, v21

    move/from16 v21, v2

    move/from16 v2, p1

    .line 1037
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v0

    if-eqz v0, :cond_13

    :goto_b
    const-string v0, "\u06e0\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, 0x6de3

    const v3, 0x4ea6dc93

    xor-int/2addr v1, v3

    const v3, 0x1ed32ad4

    goto/16 :goto_d

    :cond_13
    const-string v0, "\u1a7b\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0x7645

    const v3, -0x51785f4b

    xor-int/2addr v1, v3

    const v3, -0x7a5f9022

    goto :goto_d

    :sswitch_1f
    move/from16 v35, v3

    move/from16 v36, v21

    move/from16 v21, v2

    move/from16 v2, p1

    .line 143
    sget-boolean v0, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v0, :cond_14

    goto :goto_c

    :cond_14
    const-string v0, "\u1a7a\u06dc"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v32

    mul-int/lit8 v0, v0, -0x79

    xor-int v1, v0, v33

    mul-int/lit16 v1, v1, -0x70d7

    const v3, -0x4e8954c9

    xor-int/2addr v1, v3

    const v3, -0x1bd7e822

    goto :goto_d

    :sswitch_20
    move/from16 v35, v3

    move/from16 v36, v21

    move/from16 v21, v2

    move/from16 v2, p1

    .line 785
    sget-boolean v0, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v0, :cond_15

    :goto_c
    const-string v0, "\u06e7\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v33

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0x2b7

    const v3, 0x79b915ca

    xor-int/2addr v1, v3

    const v3, -0x572382ff

    goto :goto_d

    :cond_15
    const-string v0, "\u1a7a\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v33, v0

    mul-int/lit8 v0, v0, -0x73

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, -0x103d

    const v3, 0x2bd232ba

    xor-int/2addr v1, v3

    const v3, 0x19cbad1c

    :goto_d
    xor-int/2addr v0, v3

    move/from16 v2, v21

    move/from16 v3, v35

    move/from16 v21, v36

    :goto_e
    move/from16 v35, v0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c71c578 -> :sswitch_1
        -0x6f7a5728 -> :sswitch_c
        -0x6d106cf7 -> :sswitch_20
        -0x6a4e9205 -> :sswitch_3
        -0x68bcb946 -> :sswitch_8
        -0x6741dc1c -> :sswitch_11
        -0x66f5bda8 -> :sswitch_9
        -0x656233d4 -> :sswitch_4
        -0x61f3e26a -> :sswitch_e
        -0x61d91615 -> :sswitch_a
        -0x5d3f5f97 -> :sswitch_17
        -0x5b212d85 -> :sswitch_d
        -0x588d5e3b -> :sswitch_1e
        -0x53d00493 -> :sswitch_5
        -0x4e24bf02 -> :sswitch_3
        -0x4c3d79b3 -> :sswitch_b
        -0x4be0f8e1 -> :sswitch_1f
        -0x36510ec0 -> :sswitch_d
        -0x30b5fab6 -> :sswitch_1c
        -0x2cfce67c -> :sswitch_15
        -0x26be9112 -> :sswitch_1f
        -0x26331b59 -> :sswitch_1a
        -0x21cd3e37 -> :sswitch_1e
        -0x1f023db3 -> :sswitch_12
        -0x1c3bfe9b -> :sswitch_9
        -0x1b22a7d9 -> :sswitch_e
        -0x1a898629 -> :sswitch_18
        -0x19aa63b6 -> :sswitch_5
        -0x129ec873 -> :sswitch_13
        -0x11b8196d -> :sswitch_0
        -0x3af0ff6 -> :sswitch_11
        0x6803a64 -> :sswitch_20
        0x887def2 -> :sswitch_1b
        0xb46e7d9 -> :sswitch_18
        0xb913426 -> :sswitch_14
        0xdf8315b -> :sswitch_1d
        0xe390f19 -> :sswitch_f
        0xf03a379 -> :sswitch_f
        0xffe8c7f -> :sswitch_1b
        0x155ee741 -> :sswitch_c
        0x1835e883 -> :sswitch_2
        0x1a335288 -> :sswitch_14
        0x1b23c05f -> :sswitch_1c
        0x2087b004 -> :sswitch_4
        0x28af4a54 -> :sswitch_16
        0x2e1e51f1 -> :sswitch_0
        0x408d8f4e -> :sswitch_10
        0x4108ea61 -> :sswitch_15
        0x4201c79a -> :sswitch_2
        0x4645c8db -> :sswitch_13
        0x47717b08 -> :sswitch_1d
        0x515bdaa9 -> :sswitch_1a
        0x51ecf7a2 -> :sswitch_6
        0x52dfc814 -> :sswitch_12
        0x58cf4b7a -> :sswitch_a
        0x5d137a6c -> :sswitch_16
        0x5fa2cd08 -> :sswitch_17
        0x6377f418 -> :sswitch_7
        0x690b120c -> :sswitch_10
        0x69b00914 -> :sswitch_1
        0x6de5af46 -> :sswitch_8
        0x6ec0582d -> :sswitch_b
        0x73485749 -> :sswitch_19
        0x7aca0fa1 -> :sswitch_6
        0x7ee8379a -> :sswitch_7
        0x7f178e84 -> :sswitch_19
    .end sparse-switch
.end method

.method public final ܿ()J
    .locals 9

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const v3, -0x2a1b76e9

    sget v4, Ll/֡ܶ;->ᩴܿ᩸:I

    sget v5, Ll/ۖ;->᩹۟ۘ:I

    const-string v6, "\u06e2\u06d6"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x53

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6711

    const v8, 0x2afd8013

    xor-int/2addr v7, v8

    const v8, -0x18f59ffc

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x622f

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 323
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    sget v6, Ll/֫ۧ;->ۙ۟ۧ:I

    if-lez v6, :cond_b

    goto :goto_1

    .line 464
    :sswitch_0
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    sget v6, Ll/ۘۨ;->۫᩸۠:I

    if-gez v6, :cond_6

    goto/16 :goto_5

    :sswitch_1
    sget v6, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-gez v6, :cond_8

    goto :goto_1

    .line 855
    :sswitch_2
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    goto :goto_1

    .line 825
    :sswitch_3
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    const-wide/16 v0, 0x0

    return-wide v0

    :sswitch_4
    const-wide/16 v3, 0x10

    add-long/2addr v1, v3

    return-wide v1

    .line 960
    :sswitch_5
    invoke-virtual {v0}, Ll/ۧᩳܳ;->ۧ()J

    move-result-wide v1

    sget-boolean v6, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v6, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v6, "\u1a7a\u06e1"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x69

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x7781

    const v8, 0x1a24e2e8

    xor-int/2addr v7, v8

    const v8, -0x29036937

    goto :goto_0

    .line 217
    :sswitch_6
    sget-boolean v6, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v6, :cond_1

    :goto_1
    const-string v6, "\u06e1\u073f"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x61

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x18db

    const v8, -0x5e952b9d

    xor-int/2addr v7, v8

    const v8, -0x6f87b6e0

    goto :goto_0

    :cond_1
    const-string v6, "\u05ab\u06e2"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x7b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x40b5

    const v8, -0x4b301a25

    xor-int/2addr v7, v8

    const v8, 0x2a7e9030

    goto :goto_0

    .line 16
    :sswitch_7
    sget v6, Ll/֨۟;->᩹֫᩷:I

    if-eqz v6, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v6, "\u06db\u1a74"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x21

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x5335

    const v8, -0x709faa81

    xor-int/2addr v7, v8

    const v8, -0x6fd52296

    goto/16 :goto_0

    .line 710
    :sswitch_8
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v6

    if-nez v6, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v6, "\u05a1\u1a7b"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x2dad

    const v8, 0x2363831c

    xor-int/2addr v7, v8

    const v8, 0x26206aeb

    goto/16 :goto_0

    .line 450
    :sswitch_9
    sget v6, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v6, :cond_4

    goto :goto_2

    :cond_4
    const-string v6, "\u1a79\u06eb"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x65

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2085

    const v8, -0x47e3d79f

    xor-int/2addr v7, v8

    const v8, -0x6054051e

    goto/16 :goto_0

    .line 272
    :sswitch_a
    sget v6, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v6, :cond_5

    goto :goto_3

    :cond_5
    const-string v6, "\u06e4\u06d8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x4f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x67e3

    const v8, -0x536fcb81

    xor-int/2addr v7, v8

    const v8, 0x62805cb1

    goto/16 :goto_0

    .line 634
    :sswitch_b
    sget v6, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v6, :cond_7

    :cond_6
    :goto_2
    const-string v6, "\u06e1\u1a76"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1955

    const v8, -0x18af9459

    xor-int/2addr v7, v8

    const v8, -0x308cb4b

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u05ab\u06e7"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x19

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1b13

    const v8, -0x766cade8

    xor-int/2addr v7, v8

    const v8, 0x28c6cc84

    goto/16 :goto_0

    .line 734
    :sswitch_c
    sget v6, Ll/᩺;->ۙۛܶ:I

    if-gtz v6, :cond_9

    :cond_8
    :goto_3
    const-string v6, "\u06e7\u05a8"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1a1

    const v8, -0x2ce7480d

    xor-int/2addr v7, v8

    const v8, -0x1ce0bb5c

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u06db\u1a76"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x6b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x55b5

    const v8, 0x1a1d2e54

    xor-int/2addr v7, v8

    const v8, -0x4ef0b2c6

    goto/16 :goto_0

    :sswitch_d
    sget v6, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v6, :cond_a

    :goto_4
    const-string v6, "\u06df\u06df"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x6261

    const v8, 0x276fd676

    xor-int/2addr v7, v8

    const v8, -0x30fb1489

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u06d7\u1a7b"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4097

    const v8, -0x57a26947

    xor-int/2addr v7, v8

    const v8, 0x268a544c

    goto/16 :goto_0

    .line 960
    :sswitch_e
    iget-object v0, p0, Ll/᩺ܽܳ;->ᩳ:Ll/ۧᩳܳ;

    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v6

    if-gtz v6, :cond_c

    :cond_b
    :goto_5
    const-string v6, "\u0733\u1a79"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x6dd5

    const v8, 0x43eab3d9

    xor-int/2addr v7, v8

    const v8, -0xc82a331

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06d7\u06e2"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7d81

    const v8, 0x79b77787

    xor-int/2addr v7, v8

    const v8, 0x2a9bcf19

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6fa34ad6 -> :sswitch_e
        -0x6807e2f9 -> :sswitch_4
        -0x5654c869 -> :sswitch_2
        -0x556c45a4 -> :sswitch_b
        -0x4ec8e8dc -> :sswitch_8
        -0x4c63e07e -> :sswitch_6
        -0x4610a33b -> :sswitch_5
        -0x418a93d9 -> :sswitch_3
        -0x415431f8 -> :sswitch_9
        -0x32ca1a3c -> :sswitch_e
        -0x2e71088d -> :sswitch_a
        -0x2b0e84bd -> :sswitch_7
        -0x277fe58c -> :sswitch_9
        -0x1c0f307d -> :sswitch_3
        -0x13da4910 -> :sswitch_5
        -0xd1efd6e -> :sswitch_b
        -0xc3e7f64 -> :sswitch_0
        -0xa47bc0f -> :sswitch_d
        -0x6fc0bee -> :sswitch_7
        -0x23c912 -> :sswitch_c
        0x11434876 -> :sswitch_a
        0x11a93644 -> :sswitch_d
        0x1652bcb1 -> :sswitch_0
        0x217a80e6 -> :sswitch_8
        0x25a15726 -> :sswitch_1
        0x2a2b294f -> :sswitch_2
        0x4bcbeaa0 -> :sswitch_c
        0x52d65975 -> :sswitch_4
        0x55d4e451 -> :sswitch_1
        0x6b93fc6b -> :sswitch_6
    .end sparse-switch
.end method
