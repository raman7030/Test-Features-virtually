.class public final synthetic Ll/ۗ᩻᩷;
.super Ljava/lang/Object;
.source "R3YJ"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۨۜܰ:[S


# instance fields
.field public final synthetic ᩶:Z

.field public final synthetic ᩸:Ll/ۤ᩻᩷;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xd

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۗ᩻᩷;->ۨۜܰ:[S

    return-void

    :array_0
    .array-data 2
        0x2063s
        0x1b88s
        0x1b8fs
        0x1b91s
        0x1b8es
        0x1b95s
        0x1b92s
        0x1b8as
        0x1ba9s
        0x1b94s
        0x1b89s
        0x1b91s
        0x1b98s
    .end array-data
.end method

.method public synthetic constructor <init>(Ll/ۤ᩻᩷;Ljava/lang/String;Z)V
    .locals 6

    const v0, 0x41d07b5a

    sget v1, Ll/ۖ;->᩹۟ۘ:I

    sget v2, Ll/ۗۚ;->ܶۛᩴ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a74\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x75

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7015

    const v5, 0x1794b664

    xor-int/2addr v4, v5

    const v5, 0x63506406

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x195b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 3
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v3, :cond_4

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    sget-boolean v3, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u1a76\u073a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6407

    const v5, -0x123a8834

    xor-int/2addr v4, v5

    const v5, 0x4f4154c9

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v3

    if-gez v3, :cond_5

    goto/16 :goto_3

    .line 4
    :sswitch_2
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v3

    if-gez v3, :cond_9

    goto :goto_1

    .line 2
    :sswitch_3
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    goto :goto_1

    .line 1
    :sswitch_4
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-boolean p3, p0, Ll/ۗ᩻᩷;->᩶:Z

    return-void

    :sswitch_6
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v3

    if-ltz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06e8\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x80b

    const v5, -0x7dccf0ea

    xor-int/2addr v4, v5

    const v5, 0x43f3b669

    goto :goto_0

    .line 1
    :sswitch_7
    sget v3, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v3, :cond_2

    :goto_1
    const-string v3, "\u06df\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x17

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x360f

    const v5, 0x20773433

    xor-int/2addr v4, v5

    const v5, -0x6069270a

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u06e7\u05ab"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7c2f

    const v5, -0x26e08c9a

    xor-int/2addr v4, v5

    const v5, 0x59f10931

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u073d\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3d27

    const v5, 0xd09f451

    xor-int/2addr v4, v5

    const v5, 0x40e66230

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u0736\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x130f

    const v5, 0x464893fb

    xor-int/2addr v4, v5

    const v5, -0x6a8b2d6e

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v3, :cond_6

    :cond_5
    :goto_2
    const-string v3, "\u06df\u05ab"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x730d

    const v5, 0x6ea185d9

    xor-int/2addr v4, v5

    const v5, 0xb6194c7

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06d9\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x377d

    const v5, -0x45b0db2

    xor-int/2addr v4, v5

    const v5, -0x7e51d956

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v3, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v3, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v3, "\u06ec\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x232b

    const v5, 0x73056515

    xor-int/2addr v4, v5

    const v5, 0x141bba1f

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u06d6\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x736d

    const v5, -0x7fbef330

    xor-int/2addr v4, v5

    const v5, 0x3cf8aa9e

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget v3, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u1a79\u0730"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7dbd

    const v5, 0x388b1a

    xor-int/2addr v4, v5

    const v5, 0x7e49e2af

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a79\u1a73"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6bf9

    const v5, -0x52ea37bb

    xor-int/2addr v4, v5

    const v5, -0xdab6129

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v3

    if-ltz v3, :cond_b

    goto :goto_4

    :cond_b
    const-string v3, "\u06e4\u06da"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x53

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4ca5

    const v5, 0x7b8c407a

    xor-int/2addr v4, v5

    const v5, 0x445625d7

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۗ᩻᩷;->᩸:Ll/ۤ᩻᩷;

    iput-object p2, p0, Ll/ۗ᩻᩷;->᩹:Ljava/lang/String;

    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v3, :cond_c

    :goto_4
    const-string v3, "\u06e7\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x15

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5efd

    const v5, 0x77cb99e4

    xor-int/2addr v4, v5

    const v5, 0x6700e83a

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06eb\u06da"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2513

    const v5, -0x5a09af4c

    xor-int/2addr v4, v5

    const v5, 0x4c8c2033    # 7.3466264E7f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x71d21765 -> :sswitch_2
        -0x655a195f -> :sswitch_5
        -0x619bf48b -> :sswitch_7
        -0x5ed28b74 -> :sswitch_d
        -0x58e3aaa2 -> :sswitch_3
        -0x428a930c -> :sswitch_9
        -0x3b905c49 -> :sswitch_7
        -0x2e039414 -> :sswitch_b
        -0x27e96974 -> :sswitch_2
        -0x1a78304b -> :sswitch_c
        -0xdd4ba49 -> :sswitch_a
        -0x6451191 -> :sswitch_9
        -0x5f5872e -> :sswitch_e
        -0x2436207 -> :sswitch_3
        0x4c10bc5 -> :sswitch_1
        0x7c56a1d -> :sswitch_6
        0x9830c02 -> :sswitch_a
        0x15f185b3 -> :sswitch_4
        0x1828a3ad -> :sswitch_6
        0x19529db1 -> :sswitch_0
        0x1de6fcdf -> :sswitch_5
        0x1ff6583d -> :sswitch_b
        0x2b54b7db -> :sswitch_1
        0x2def0d6c -> :sswitch_e
        0x3300cf43 -> :sswitch_c
        0x3904c605 -> :sswitch_4
        0x3b97eb9d -> :sswitch_d
        0x410e08af -> :sswitch_8
        0x72febe52 -> :sswitch_0
        0x78d5bd02 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 18

    move-object/from16 v1, p0

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const v11, 0x6278e859

    sget v12, Ll/֫᩵;->ܶ᩻᩷:I

    sget v13, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v14, "\u1a7a\u1a7a"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, 0xf

    xor-int v15, v14, v12

    mul-int/lit8 v15, v15, -0x67

    const v16, 0x2de0cf3f

    xor-int v15, v15, v16

    const v16, 0x1757b49b

    xor-int v14, v14, v16

    move-object v2, v0

    move-object v0, v3

    const/4 v3, 0x0

    :goto_0
    xor-int/2addr v11, v12

    mul-int/lit16 v11, v11, -0x2dc1

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    move-object/from16 v16, v0

    move/from16 v17, v11

    .line 321
    sget v0, Ll/᩹;->ۤܿܳ:I

    if-eqz v0, :cond_e

    goto/16 :goto_a

    :sswitch_0
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    sget-boolean v14, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v14, :cond_0

    goto/16 :goto_4

    :cond_0
    move-object/from16 v16, v0

    move/from16 v17, v11

    goto/16 :goto_8

    :sswitch_1
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    sget-boolean v14, Ll/֫᩺;->֫ܰۨ:Z

    if-nez v14, :cond_2

    :cond_1
    :goto_1
    move-object/from16 v16, v0

    move/from16 v17, v11

    goto/16 :goto_b

    :cond_2
    move-object/from16 v16, v0

    move/from16 v17, v11

    goto/16 :goto_c

    :sswitch_2
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    sget v14, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v14, :cond_3

    goto/16 :goto_4

    :cond_3
    move-object/from16 v16, v0

    move/from16 v17, v11

    goto/16 :goto_e

    .line 259
    :sswitch_3
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v14

    if-nez v14, :cond_4

    goto :goto_4

    :cond_4
    move-object/from16 v16, v0

    move/from16 v17, v11

    goto/16 :goto_a

    .line 330
    :sswitch_4
    sget v14, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v14, :cond_5

    goto :goto_4

    :cond_5
    move-object/from16 v16, v0

    move/from16 v17, v11

    goto/16 :goto_d

    :sswitch_5
    sget v14, Ll/ۗ᩺;->ۡ᩺֡:I

    if-gez v14, :cond_7

    goto :goto_2

    .line 40
    :sswitch_6
    sget v14, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v14, :cond_6

    goto :goto_1

    :cond_6
    :goto_2
    const-string v14, "\u1a77\u06e8"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, 0x2d

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x738f

    const v16, 0x71f1f7e6

    xor-int v15, v15, v16

    const v16, 0x1729e081

    goto :goto_5

    .line 87
    :sswitch_7
    sget v14, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v14, :cond_1

    :goto_3
    move-object/from16 v16, v0

    move/from16 v17, v11

    goto/16 :goto_9

    .line 326
    :sswitch_8
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    goto :goto_3

    .line 57
    :sswitch_9
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    :sswitch_a
    return-void

    .line 368
    :sswitch_b
    invoke-static {v0}, Ll/֡۬;->ܺܽۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩸ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    return-void

    .line 367
    :sswitch_c
    iget-object v14, v1, Ll/ۗ᩻᩷;->᩸:Ll/ۤ᩻᩷;

    invoke-virtual {v14, v0}, Ll/ۤ᩻᩷;->log(Ljava/lang/Throwable;)V

    sget v14, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v14, :cond_8

    :cond_7
    :goto_4
    const-string v14, "\u06e4\u1a79"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v13, v14

    mul-int/lit8 v14, v14, 0x3b

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x713f

    const v16, -0x52426f88

    xor-int v15, v15, v16

    const v16, 0x57d09888

    goto :goto_5

    :cond_8
    const-string v14, "\u06e2\u05a8"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x6c43

    const v16, 0xbcd891c

    xor-int v15, v15, v16

    const v16, 0x758e6edc

    :goto_5
    xor-int v14, v14, v16

    goto/16 :goto_0

    .line 361
    :sswitch_d
    :try_start_0
    new-instance v14, Landroid/content/Intent;

    invoke-static {}, Ll/֡ۨ;->۫۠ܿ()Landroid/app/Application;

    move-result-object v15

    move-object/from16 v16, v0

    const-class v0, Ll/ۧۖ᩷;

    sget v17, Ll/ۧۖ᩷;->ܳۧ:I

    invoke-direct {v14, v15, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget-object v0, Ll/ۗ᩻᩷;->ۨۜܰ:[S
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v15, 0x1

    move/from16 v17, v11

    const/4 v11, 0x3

    :try_start_1
    invoke-static {v0, v15, v11, v10}, Ll/֡֡;->᩻ۛ۠([SIII)Ljava/lang/String;

    move-result-object v0

    .line 362
    invoke-static {v2}, Ll/ۤ᩻᩷;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v14, v0, v11}, Ll/֫֫;->ۚ֡ܽ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Intent;

    sget-object v0, Ll/ۗ᩻᩷;->ۨۜܰ:[S

    const/4 v11, 0x4

    const/16 v15, 0x9

    invoke-static {v0, v11, v15, v10}, Ll/֨۟;->֡ۚۧ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 363
    invoke-virtual {v14, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const/high16 v0, 0x10000000

    .line 364
    invoke-static {v14, v0}, Ll/֫ۡ;->᩹ۘۨ(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 365
    invoke-static {}, Ll/ۗ᩵;->ۙ᩶ۨ()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0, v14}, Ll/᩹;->᩶ۨۨ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v0, "\u05a8\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x4d

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, 0x1125

    const v14, 0x324ac526

    xor-int v15, v11, v14

    const v11, -0x166790dd

    goto/16 :goto_f

    :catchall_0
    move-exception v0

    goto :goto_6

    :catchall_1
    move-exception v0

    move/from16 v17, v11

    :goto_6
    const-string v11, "\u1a74\u05a1"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v12, v11

    mul-int/lit8 v11, v11, 0x7f

    xor-int v14, v11, v13

    mul-int/lit16 v14, v14, -0x56cf

    const v15, -0x45005823

    xor-int/2addr v15, v14

    const v14, 0x4435550

    xor-int/2addr v14, v11

    goto/16 :goto_10

    :sswitch_e
    move-object/from16 v16, v0

    move/from16 v17, v11

    .line 2
    iget-object v2, v1, Ll/ۗ᩻᩷;->᩹:Ljava/lang/String;

    .line 4
    iget-boolean v3, v1, Ll/ۗ᩻᩷;->᩶:Z

    const-string v0, "\u06e0\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, 0x4893

    const v14, -0x69d2acae

    xor-int v15, v11, v14

    const v11, 0x439d646

    goto/16 :goto_f

    :sswitch_f
    move-object/from16 v16, v0

    move/from16 v17, v11

    const/16 v0, 0x5249

    const/16 v10, 0x5249

    goto :goto_7

    :sswitch_10
    move-object/from16 v16, v0

    move/from16 v17, v11

    const/16 v0, 0x1bfd

    const/16 v10, 0x1bfd

    :goto_7
    const-string v0, "\u0730\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v11, v0, v13

    mul-int/lit16 v11, v11, -0x2ebb

    const v14, 0x4b62b730    # 1.4858032E7f

    xor-int v15, v11, v14

    const v11, 0x2b165d28

    goto/16 :goto_f

    :sswitch_11
    move-object/from16 v16, v0

    move/from16 v17, v11

    mul-int v0, v6, v9

    sub-int/2addr v0, v8

    if-gtz v0, :cond_9

    const-string v0, "\u1a75\u06e8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0xd

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, 0x3175

    const v14, 0x18ecce5e

    xor-int v15, v11, v14

    const v11, -0x1ab76ee9

    goto/16 :goto_f

    :cond_9
    const-string v0, "\u073d\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x73

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, -0x2c23

    const v14, 0x5f60c4ab

    xor-int v15, v11, v14

    const v11, -0x262d6dfc

    goto/16 :goto_f

    :sswitch_12
    move-object/from16 v16, v0

    move/from16 v17, v11

    const/16 v9, 0x1c96

    .line 68
    sget v0, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v0, :cond_a

    :goto_8
    const-string v0, "\u05a1\u06e0"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v12, v0

    mul-int/lit8 v0, v0, -0x3f

    xor-int v11, v0, v13

    mul-int/lit16 v11, v11, 0x410b

    const v14, -0x1d0450a0

    xor-int v15, v11, v14

    const v11, -0x3fa1bb5

    goto/16 :goto_f

    :cond_a
    const-string v0, "\u06e2\u06e2"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v12

    mul-int/lit8 v0, v0, 0x9

    xor-int v11, v0, v13

    mul-int/lit16 v11, v11, 0x3f0f

    const v14, 0x1806751f

    xor-int v15, v11, v14

    const v11, 0xd6d0329

    goto/16 :goto_f

    :sswitch_13
    move-object/from16 v16, v0

    move/from16 v17, v11

    const v0, 0xcc49f9

    add-int v8, v7, v0

    sget v0, Ll/ۛ;->᩺᩻֫:I

    if-ltz v0, :cond_b

    goto/16 :goto_a

    :cond_b
    const-string v0, "\u0736\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, -0x4035

    const v14, -0x495a6e04

    xor-int v15, v11, v14

    const v11, 0x79e51d1e

    goto/16 :goto_f

    :sswitch_14
    move-object/from16 v16, v0

    move/from16 v17, v11

    aget-short v6, v4, v5

    mul-int v7, v6, v6

    .line 109
    sget-boolean v0, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v0, :cond_c

    const-string v0, "\u06eb\u1a74"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, 0x2547

    const v14, 0x4a1c177c    # 2557407.0f

    xor-int v15, v11, v14

    const v11, -0x37b9e0c1

    goto/16 :goto_f

    :cond_c
    const-string v0, "\u06e7\u1a7b"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v12, v0

    mul-int/lit8 v0, v0, -0x65

    xor-int v11, v0, v13

    mul-int/lit16 v11, v11, -0x7661

    const v14, 0x2bdc1979

    xor-int v15, v11, v14

    const v11, -0x147293dc

    goto/16 :goto_f

    :sswitch_15
    move-object/from16 v16, v0

    move/from16 v17, v11

    const/4 v5, 0x0

    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v0

    if-gtz v0, :cond_d

    :goto_9
    const-string v0, "\u05a8\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v12

    mul-int/lit8 v0, v0, -0x59

    xor-int v11, v0, v13

    mul-int/lit16 v11, v11, -0x559f

    const v14, -0x52049311

    xor-int v15, v11, v14

    const v11, 0x6a95002

    goto/16 :goto_f

    :cond_d
    const-string v0, "\u06dc\u1a78"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, 0x3837

    const v14, 0x59ee5b55

    xor-int v15, v11, v14

    const v11, 0x3015e0c6

    goto/16 :goto_f

    :goto_a
    const-string v0, "\u06e1\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x23

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, -0x5121

    const v14, 0x28d3abc8

    xor-int v15, v11, v14

    const v11, -0x7574a683

    goto/16 :goto_f

    :cond_e
    const-string v0, "\u05a1\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v12, v0

    mul-int/lit8 v0, v0, 0x37

    xor-int v11, v0, v13

    mul-int/lit16 v11, v11, 0x101f

    const v14, -0x3cde350d

    xor-int v15, v11, v14

    const v11, -0x79688749

    goto/16 :goto_f

    :sswitch_16
    move-object/from16 v16, v0

    move/from16 v17, v11

    .line 147
    sget v0, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v0, :cond_f

    :goto_b
    const-string v0, "\u05a1\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, -0x5a37

    const v14, -0x50061489

    xor-int v15, v11, v14

    const v11, 0x531893a

    goto/16 :goto_f

    :cond_f
    const-string v0, "\u06ec\u1a75"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v11, v0, v13

    mul-int/lit16 v11, v11, -0x56c9

    const v14, -0x1c917aa8    # -4.3999335E21f

    xor-int v15, v11, v14

    const v11, -0x5179dce0

    goto/16 :goto_f

    :sswitch_17
    move-object/from16 v16, v0

    move/from16 v17, v11

    .line 66
    sget v0, Ll/᩺;->ۙۛܶ:I

    if-gtz v0, :cond_10

    :goto_c
    const-string v0, "\u05ab\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v11, v0, v13

    mul-int/lit16 v11, v11, 0x5707

    const v14, 0x47da7436

    xor-int v15, v11, v14

    const v11, -0x294cb809

    goto/16 :goto_f

    :cond_10
    const-string v0, "\u06dc\u05a1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x13

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, 0x7551

    const v14, -0x22308243

    xor-int v15, v11, v14

    const v11, 0x6b2a5e4c

    goto :goto_f

    :sswitch_18
    move-object/from16 v16, v0

    move/from16 v17, v11

    .line 162
    sget v0, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v0, :cond_11

    :goto_d
    const-string v0, "\u06d6\u0730"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v12, v0

    mul-int/lit8 v0, v0, -0x3d

    xor-int v11, v0, v13

    mul-int/lit16 v11, v11, 0x54b1

    const v14, 0x4c137cc0    # 3.8662912E7f

    xor-int v15, v11, v14

    const v11, -0x3aff5f68

    goto :goto_f

    :cond_11
    const-string v0, "\u0733\u0730"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x79

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, -0x53cf

    const v14, -0x2dd54c29

    xor-int v15, v11, v14

    const v11, -0x20347230

    goto :goto_f

    :sswitch_19
    move-object/from16 v16, v0

    move/from16 v17, v11

    sget-object v4, Ll/ۗ᩻᩷;->ۨۜܰ:[S

    .line 64
    sget v0, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v0, :cond_12

    :goto_e
    const-string v0, "\u1a74\u06d7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x15

    xor-int v11, v0, v12

    mul-int/lit16 v11, v11, -0x6065

    const v14, -0x9c3746c

    xor-int v15, v11, v14

    const v11, -0x3e5c59f3

    goto :goto_f

    :cond_12
    const-string v0, "\u1a73\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v12, v0

    mul-int/lit8 v0, v0, 0x2d

    xor-int v11, v0, v13

    mul-int/lit16 v11, v11, -0x56b9

    const v14, -0x767ad8fa

    xor-int v15, v11, v14

    const v11, -0x322f36b2

    :goto_f
    xor-int v14, v0, v11

    move-object/from16 v0, v16

    :goto_10
    move/from16 v11, v17

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fe6817a -> :sswitch_2
        -0x788232e6 -> :sswitch_4
        -0x7386fc75 -> :sswitch_6
        -0x6b2d611b -> :sswitch_8
        -0x6a252d6c -> :sswitch_d
        -0x65ea03fc -> :sswitch_17
        -0x648025d3 -> :sswitch_19
        -0x636f5d9d -> :sswitch_5
        -0x5e092f10 -> :sswitch_14
        -0x5c378941 -> :sswitch_19
        -0x5127f259 -> :sswitch_f
        -0x4783e70e -> :sswitch_11
        -0x472c628f -> :sswitch_16
        -0x441cdab2 -> :sswitch_4
        -0x3a1466d2 -> :sswitch_3
        -0x37627ea1 -> :sswitch_6
        -0x320c4b97 -> :sswitch_13
        -0x2b8c1535 -> :sswitch_17
        -0x2722122d -> :sswitch_9
        -0x2188b259 -> :sswitch_c
        -0x17f9c7cc -> :sswitch_12
        -0x946e252 -> :sswitch_18
        -0x7c4d18a -> :sswitch_b
        -0x6bf3f86 -> :sswitch_c
        -0x5d269c0 -> :sswitch_0
        0x16bcaf2 -> :sswitch_11
        0x676d53e -> :sswitch_e
        0x8cb3c11 -> :sswitch_a
        0xadf4c46 -> :sswitch_14
        0xdb6c2cb -> :sswitch_12
        0x14455fa2 -> :sswitch_a
        0x15e082ac -> :sswitch_f
        0x18eed0fc -> :sswitch_15
        0x1d7ba5ae -> :sswitch_18
        0x1d9e4645 -> :sswitch_d
        0x23243a59 -> :sswitch_b
        0x2472fed2 -> :sswitch_16
        0x24995331 -> :sswitch_13
        0x2cfd286b -> :sswitch_7
        0x2ecab295 -> :sswitch_1
        0x36d17f70 -> :sswitch_3
        0x383aae27 -> :sswitch_9
        0x4c672f22 -> :sswitch_5
        0x5036b56f -> :sswitch_1
        0x50e59eb0 -> :sswitch_15
        0x578d33cd -> :sswitch_2
        0x59a530fc -> :sswitch_0
        0x6f2473d2 -> :sswitch_10
        0x72df3bc2 -> :sswitch_10
        0x74b499ae -> :sswitch_8
        0x7682a44d -> :sswitch_7
        0x7dbc2bef -> :sswitch_e
    .end sparse-switch
.end method
