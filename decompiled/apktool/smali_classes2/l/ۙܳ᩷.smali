.class public final Ll/ۙܳ᩷;
.super Ljava/lang/Object;
.source "GA31"


# static fields
.field public static ֫:Ljava/util/List;

.field public static ۧ:Z

.field public static ܽ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0xf295f3a

    sget v3, Ll/ۗ᩺;->ۡ᩺֡:I

    sget v4, Ll/᩺;->ۙۛܶ:I

    const-string v5, "\u1a74\u05a1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x27

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x44a7

    const v7, 0x38dda00b

    xor-int/2addr v6, v7

    const v7, -0x5e0b9522

    :goto_0
    xor-int/2addr v5, v7

    move-object v7, v1

    :goto_1
    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x25e3

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 21
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 33
    :sswitch_0
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v5

    if-nez v5, :cond_b

    goto/16 :goto_2

    :sswitch_1
    sget-boolean v5, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v5, :cond_3

    goto/16 :goto_3

    .line 40
    :sswitch_2
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v5

    if-gtz v5, :cond_9

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    goto/16 :goto_2

    .line 42
    :sswitch_4
    sget-object v5, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v6, Ll/ۡۛ᩻;

    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v8

    if-eqz v8, :cond_0

    goto/16 :goto_2

    :cond_0
    const/4 v8, 0x1

    .line 36
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v9

    if-ltz v9, :cond_1

    goto/16 :goto_3

    .line 42
    :cond_1
    invoke-direct {v6, v8}, Ll/ۡۛ᩻;-><init>(I)V

    invoke-static {v5, v6}, Ll/֫᩹;->ۘ۠ۜ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_5

    .line 23
    :sswitch_5
    new-instance v0, Ll/᩶ܳ᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ll/۬ܿ᩷;->֫(Ll/᩻ܿ᩷;)V

    return-void

    .line 22
    :sswitch_6
    invoke-virtual {v0, v7}, Ll/֡ۡ֫;->֫(Ll/֨ۡ֫;)V

    sget v5, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v5, :cond_2

    const-string v5, "\u06d6\u1a76"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x15

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6e3d

    const v8, -0x27944596

    xor-int/2addr v6, v8

    const v8, 0x502c07ba

    goto/16 :goto_6

    :cond_2
    const-string v5, "\u0733\u06da"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1b27

    const v8, -0x374394e1

    xor-int/2addr v6, v8

    const v8, 0x3d5cdd1f

    goto/16 :goto_6

    :sswitch_7
    sget-object v0, Ll/۟ۚۡ;->ᩳ:Ll/ۚۡ֫;

    new-instance v7, Ll/᩸ܳ᩷;

    .line 19
    sget v5, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v5, :cond_4

    :cond_3
    const-string v5, "\u06dc\u1a78"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x763f

    const v7, 0x69437dd5

    xor-int/2addr v6, v7

    const v7, 0x635709ff

    goto/16 :goto_0

    .line 39
    :cond_4
    sget v5, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v5, :cond_5

    goto :goto_4

    :cond_5
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v5

    if-gtz v5, :cond_6

    goto :goto_3

    :cond_6
    sget v5, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v5, :cond_7

    goto :goto_3

    .line 20
    :cond_7
    sget v5, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v5, :cond_8

    :goto_2
    const-string v5, "\u1a7a\u1a79"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6579

    const v7, 0x13f8a62

    xor-int/2addr v6, v7

    const v7, 0x6bb264e8

    goto/16 :goto_0

    .line 33
    :cond_8
    sget-boolean v5, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v5, :cond_a

    :cond_9
    :goto_3
    const-string v5, "\u1a79\u1a73"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x6b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6f7b

    const v7, 0x3db29299

    xor-int/2addr v6, v7

    const v7, 0x6d931453

    goto/16 :goto_0

    .line 22
    :cond_a
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 41
    sget v5, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v5, :cond_c

    :cond_b
    :goto_4
    const-string v5, "\u06d8\u1a75"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x69

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x493f

    const v7, 0x5263a1e2

    xor-int/2addr v6, v7

    const v7, -0x19ff0c7a

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u1a75\u05a1"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x7b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5679

    const v8, 0x28e6707

    xor-int/2addr v6, v8

    const v8, 0x66c69fb3

    goto :goto_6

    .line 19
    :sswitch_8
    invoke-static {}, Ll/֫ۡ;->۠ܺ᩻()Z

    move-result v5

    if-eqz v5, :cond_d

    const-string v5, "\u1a7a\u06d7"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4519

    const v8, -0x4557b16d

    xor-int/2addr v6, v8

    const v8, -0x379182fc

    goto :goto_6

    :cond_d
    :goto_5
    const-string v5, "\u06e8\u0736"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x79

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4427

    const v8, 0xba0f81d

    xor-int/2addr v6, v8

    const v8, -0x1a5e9768

    :goto_6
    xor-int/2addr v5, v8

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7b873bda -> :sswitch_6
        -0x7601a359 -> :sswitch_0
        -0x6b13d61c -> :sswitch_8
        -0x64138acc -> :sswitch_0
        -0x55a04d3e -> :sswitch_3
        -0x52651be1 -> :sswitch_8
        -0x3a50a27c -> :sswitch_7
        -0x27c86860 -> :sswitch_2
        -0x1cb8e4c7 -> :sswitch_1
        -0x15291b14 -> :sswitch_3
        -0x131ac8ae -> :sswitch_5
        -0x130bd148 -> :sswitch_6
        -0x271bf86 -> :sswitch_4
        0x11dedcfd -> :sswitch_4
        0x448934cf -> :sswitch_5
        0x4e55a187 -> :sswitch_1
        0x56b4e000 -> :sswitch_2
        0x6902fdbe -> :sswitch_7
    .end sparse-switch
.end method

.method public static synthetic ֫()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x713e3148

    sget v3, Ll/ۗ᩵;->֫۠۟:I

    sget v4, Ll/ۗ᩺;->ۡ᩺֡:I

    const-string v5, "\u06da\u06dc"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x15

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7a17

    const v7, 0x5b88eb70

    xor-int/2addr v6, v7

    const v7, -0x5e6ebdac

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x224b

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 43
    sget-boolean v5, Ll/ۙܳ᩷;->ܽ:Z

    if-eqz v5, :cond_d

    const-string v5, "\u06d6\u0730"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x53

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xfc9

    const v7, -0x3c22a17b

    xor-int/2addr v6, v7

    const v7, 0x416812c5

    goto :goto_0

    .line 48
    :sswitch_0
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    sget v5, Ll/֡֡;->֫ۤܳ:I

    if-ltz v5, :cond_3

    goto/16 :goto_4

    .line 45
    :sswitch_1
    sget v5, Ll/۟;->ۗۤۛ:I

    if-eqz v5, :cond_8

    goto/16 :goto_4

    .line 43
    :sswitch_2
    sget v5, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-nez v5, :cond_a

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    return-void

    .line 52
    :sswitch_5
    sput-boolean v0, Ll/ۙܳ᩷;->ܽ:Z

    return-void

    :sswitch_6
    sput-boolean v0, Ll/ۙܳ᩷;->ܽ:Z

    .line 53
    throw v1

    .line 52
    :sswitch_7
    sput-boolean v0, Ll/ۙܳ᩷;->ܽ:Z

    return-void

    .line 48
    :sswitch_8
    :try_start_0
    invoke-static {}, Ll/֡᩻᩷;->ۧ()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Ll/ۙܳ᩷;->֫(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, "\u0730\u05ab"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x79

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x313

    const v7, 0x3b8b76ef

    xor-int/2addr v6, v7

    const v7, -0x7e6a7eb4

    goto :goto_0

    :catchall_0
    move-exception v1

    const-string v5, "\u073a\u06e0"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0xd

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7651

    const v7, -0x1921d3df

    xor-int/2addr v6, v7

    const v7, -0x1e4a172b

    goto/16 :goto_0

    :catch_0
    const-string v5, "\u0736\u0736"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x35

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6aff

    const v7, 0x35540371

    xor-int/2addr v6, v7

    const v7, -0x23aa43ff

    goto/16 :goto_0

    :sswitch_9
    return-void

    :sswitch_a
    const/4 v0, 0x0

    const-string v5, "\u073f\u1a7b"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x63

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3cf

    const v7, 0xdcef3b1

    xor-int/2addr v6, v7

    const v7, -0x664fbed4

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v5, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v5, :cond_0

    const-string v5, "\u1a77\u06e2"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2131

    const v7, -0x6e9f98e

    xor-int/2addr v6, v7

    const v7, 0x22e25153

    goto/16 :goto_0

    :cond_0
    const-string v5, "\u073f\u06d7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4def

    const v7, -0x624d6536

    xor-int/2addr v6, v7

    const v7, -0x23f1e9a1

    goto/16 :goto_0

    :sswitch_c
    sget v5, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v5, :cond_1

    goto :goto_1

    :cond_1
    const-string v5, "\u073d\u1a76"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x3

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x38f7

    const v7, 0x3b74ad89

    xor-int/2addr v6, v7

    const v7, -0x119ac45d

    goto/16 :goto_0

    .line 47
    :sswitch_d
    sget v5, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v5, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v5, "\u1a7b\u06e2"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3b09

    const v7, -0x838e41d

    xor-int/2addr v6, v7

    const v7, 0x3eba9bd5

    goto/16 :goto_0

    :sswitch_e
    sget v5, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v5, :cond_4

    :cond_3
    :goto_1
    const-string v5, "\u06e7\u06eb"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3d63

    const v7, 0x3186d59a

    xor-int/2addr v6, v7

    const v7, -0x1bb9a4bb

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u05a1\u06e0"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x79

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2f77

    const v7, 0x606544e9

    xor-int/2addr v6, v7

    const v7, 0x108a4364

    goto/16 :goto_0

    :sswitch_f
    sget-boolean v5, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v5, :cond_5

    goto :goto_2

    :cond_5
    const-string v5, "\u06d9\u1a73"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x27

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1d23

    const v7, 0x735ed877

    xor-int/2addr v6, v7

    const v7, 0x6b1833a9    # 1.8400068E26f

    goto/16 :goto_0

    .line 50
    :sswitch_10
    sget v5, Ll/۟;->ۗۤۛ:I

    if-eqz v5, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v5, "\u1a74\u1a78"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x53

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2983

    const v7, 0x152f15c7

    xor-int/2addr v6, v7

    const v7, -0x14bbe77b

    goto/16 :goto_0

    :sswitch_11
    sget-boolean v5, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v5, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v5, "\u1a79\u1a74"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1369

    const v7, -0x392eacbd

    xor-int/2addr v6, v7

    const v7, 0x70564e51

    goto/16 :goto_0

    :sswitch_12
    sget v5, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v5, :cond_9

    :cond_8
    :goto_2
    const-string v5, "\u06d6\u1a73"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x11

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1f19

    const v7, 0x23660ac1

    xor-int/2addr v6, v7

    const v7, -0x3800d371

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u1a7a\u073a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x17

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x43cd

    const v7, 0x1b006224

    xor-int/2addr v6, v7

    const v7, 0x3265c25d

    goto/16 :goto_0

    .line 52
    :sswitch_13
    sget-boolean v5, Ll/֨۫;->۬᩷᩶:Z

    if-nez v5, :cond_b

    :cond_a
    :goto_3
    const-string v5, "\u1a78\u05a1"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x47

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4633

    const v7, -0x4274e0b3

    xor-int/2addr v6, v7

    const v7, 0x57dfa795

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06df\u05a1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x17

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4e8d

    const v7, 0x620de995

    xor-int/2addr v6, v7

    const v7, -0x809c930

    goto/16 :goto_0

    :sswitch_14
    const/4 v5, 0x1

    .line 46
    sput-boolean v5, Ll/ۙܳ᩷;->ܽ:Z

    .line 43
    sget v5, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v5, :cond_c

    :goto_4
    const-string v5, "\u06e2\u1a73"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6cc1

    const v7, -0x10586466

    xor-int/2addr v6, v7

    const v7, -0x43d8c179

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06e8\u1a7a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x2f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4e95

    const v7, 0x25fc4f9b

    xor-int/2addr v6, v7

    const v7, -0x4df8ceb3

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06e2\u05ab"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x43e5

    const v7, 0x1d448578

    xor-int/2addr v6, v7

    const v7, -0x46929e2f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ce82e72 -> :sswitch_3
        -0x7cbf62a2 -> :sswitch_8
        -0x74b09d35 -> :sswitch_11
        -0x745204c6 -> :sswitch_c
        -0x725bc216 -> :sswitch_3
        -0x70b2bcf6 -> :sswitch_9
        -0x680aced0 -> :sswitch_0
        -0x5ecce6f7 -> :sswitch_7
        -0x504f3465 -> :sswitch_0
        -0x4d0e758c -> :sswitch_e
        -0x47c5026f -> :sswitch_6
        -0x3ebec7ec -> :sswitch_c
        -0x3e40a705 -> :sswitch_5
        -0x3abea59e -> :sswitch_10
        -0x34a90d82 -> :sswitch_10
        -0x2aa6899a -> :sswitch_2
        -0x298febc3 -> :sswitch_1
        -0x18a7f680 -> :sswitch_2
        -0x16a89fb5 -> :sswitch_f
        -0x128bd5d6 -> :sswitch_b
        -0xf6eaf5d -> :sswitch_14
        0x2c0656b -> :sswitch_e
        0x9338a7e -> :sswitch_4
        0xb327d0f -> :sswitch_9
        0xdb7fd6d -> :sswitch_a
        0x16864e3c -> :sswitch_13
        0x17a69689 -> :sswitch_5
        0x204589e4 -> :sswitch_12
        0x29882ce9 -> :sswitch_4
        0x2dad499c -> :sswitch_6
        0x30423989 -> :sswitch_d
        0x311f413e -> :sswitch_f
        0x3fb14b1d -> :sswitch_12
        0x43a1a0f3 -> :sswitch_d
        0x5152dc89 -> :sswitch_1
        0x53e5a21d -> :sswitch_a
        0x5ab9f6c6 -> :sswitch_7
        0x64b2f00e -> :sswitch_b
        0x68d4b692 -> :sswitch_14
        0x69d11129 -> :sswitch_8
        0x73102997 -> :sswitch_13
        0x777b56c5 -> :sswitch_11
    .end sparse-switch
.end method

.method public static declared-synchronized ֫(Ljava/util/List;)V
    .locals 2

    .line 2
    const-class v0, Ll/ۙܳ᩷;

    .line 3
    monitor-enter v0

    .line 58
    :try_start_0
    sput-object p0, Ll/ۙܳ᩷;->֫:Ljava/util/List;

    .line 59
    invoke-static {p0}, Ll/֡᩺;->ᩳ֫᩺(Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    .line 60
    sget-boolean v1, Ll/ۙܳ᩷;->ۧ:Z

    if-eq v1, p0, :cond_0

    .line 61
    sput-boolean p0, Ll/ۙܳ᩷;->ۧ:Z

    .line 62
    new-instance p0, Ll/ܺۛ᩻;

    const/4 v1, 0x1

    invoke-direct {p0, v1}, Ll/ܺۛ᩻;-><init>(I)V

    invoke-static {p0}, Ll/ۘۨ;->ܰۛ᩵(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ۧ()Z
    .locals 1

    .line 88
    sget-boolean v0, Ll/ۙܳ᩷;->ۧ:Z

    return v0
.end method
