.class public final Ll/ۤ᩻᩷;
.super Ljava/lang/Object;
.source "R3YJ"

# interfaces
.implements Lbin/mt/plugin/api/PluginContext;


# static fields
.field private static final ۡ᩵ۧ:[S


# instance fields
.field public final ֫:Ll/ۗ᩵;

.field public final ۖ:I

.field public volatile ۘ:Landroid/content/SharedPreferences;

.field public final ۜ:Ljava/lang/String;

.field public ۡ:Ll/֨᩻᩷;

.field public final ۢ:Ll/ۨۚ᩷;

.field public ۧ:Landroid/content/ClipboardManager;

.field public final ܳ:Ll/ۨۚ᩷;

.field public final ܺ:Ll/ܰܿ᩷;

.field public ܽ:Ll/᩶᩻᩷;

.field public final ܿ:Ll/ۗ᩵;

.field public final ᩳ:Ll/ܶ᩵ܿ;

.field public final ᩴ:I

.field public final ᩵:Ljava/lang/String;

.field public ᩷:Ll/۫᩻᩷;

.field public final ᩻:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x76

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    return-void

    :array_0
    .array-data 2
        0x2507s
        0x42d1s
        0x42des
        0x42dbs
        0x42c2s
        0x42d0s
        0x42dds
        0x42d3s
        0x42c0s
        0x42d6s
        0x1883s
        0x1a9es
        0x1a82s
        0x1a9bs
        0x1a89s
        0x1a87s
        0x1a80s
        0x1aa7s
        0x1a8as
        0x1a9es
        0x1a82s
        0x1a9bs
        0x1a89s
        0x1a87s
        0x1a80s
        0x1abes
        0x1a9cs
        0x1a8bs
        0x1a88s
        0x1a8bs
        0x1a9cs
        0x1a8bs
        0x1a80s
        0x1a8ds
        0x1a8bs
        0x18fs
        0x4162s
        0x417es
        0x417es
        0x417as
        0x4130s
        0x4125s
        0x4125s
        0x4162s
        0x417es
        0x417es
        0x417as
        0x4179s
        0x4130s
        0x4125s
        0x4125s
        0x963s
        0x3489s
        0x22b3s
        0x2411s
        0x240ds
        0x2411s
        0x2415s
        0x240ds
        0x2412s
        0x2413s
        0x2397s
        0x56d9s
        0x56fes
        0x56f8s
        0x56e3s
        0x56e4s
        0x56eds
        0x2420s
        -0x3e58s
        -0x3e71s
        -0x3e77s
        -0x3e6es
        -0x3e6bs
        -0x3e64s
        -0x3e25s
        -0x3e6bs
        -0x3e6cs
        -0x3e71s
        -0x3e25s
        -0x3e63s
        -0x3e6cs
        -0x3e72s
        -0x3e6bs
        -0x3e61s
        -0x3e3fs
        -0x3e25s
        0x94cs
        -0x43bas
        -0x43b5s
        -0x43bcs
        -0x43b3s
        -0x43a7s
        -0x43a2s
        -0x43a8s
        -0x43bds
        -0x43bcs
        -0x43b3s
        -0x43a7s
        0x703s
        0x81es
        -0x3fb8s
        0xb9s
        0x35f2s
        0x2026s
        0xd97s
        0x2042s
        0x1f03s
        -0x32c0s
        -0x1920s
        0xd68s
        0x3eaas
        0x3eb8s
        0x3eb8s
        0x3eaes
        0x3ebfs
        0x3eb8s
        0x3ee4s
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ll/ܶ᩵ܿ;Ll/ܰܿ᩷;Ll/ۨۚ᩷;Ll/ۨۚ᩷;)V
    .locals 18

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x3d344fa6

    sget v4, Ll/֡᩺;->ᩴ᩹ۛ:I

    sget v5, Ll/ۗۗ;->ۨ۬ۖ:I

    .line 61
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const-string v6, "\u06d9\u1a77"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0xc5d

    const v8, -0x48a0d6f2

    xor-int/2addr v7, v8

    const v8, 0x72b07eef

    xor-int/2addr v6, v8

    :goto_0
    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x6609

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 28
    sget v6, Ll/ۘۨ;->۫᩸۠:I

    if-gez v6, :cond_0

    goto :goto_2

    .line 27
    :sswitch_0
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    sget v6, Ll/֫᩹;->᩶ۘۘ:I

    if-nez v6, :cond_1

    :cond_0
    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    :goto_1
    move-object/from16 v16, v2

    goto/16 :goto_9

    :cond_1
    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    goto/16 :goto_4

    .line 5
    :sswitch_1
    sget v6, Ll/ۘܿ;->ۘܰ۫:I

    if-gez v6, :cond_2

    :goto_2
    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v16, v2

    goto/16 :goto_a

    :cond_2
    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    goto/16 :goto_8

    .line 64
    :sswitch_2
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    goto :goto_2

    .line 33
    :sswitch_3
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :sswitch_4
    move-object/from16 v6, p7

    .line 68
    iput-object v6, v0, Ll/ۤ᩻᩷;->ܺ:Ll/ܰܿ᩷;

    move-object/from16 v7, p8

    .line 69
    iput-object v7, v0, Ll/ۤ᩻᩷;->ۢ:Ll/ۨۚ᩷;

    move-object/from16 v8, p9

    .line 70
    iput-object v8, v0, Ll/ۤ᩻᩷;->ܳ:Ll/ۨۚ᩷;

    return-void

    :sswitch_5
    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    .line 67
    iput-object v9, v0, Ll/ۤ᩻᩷;->ᩳ:Ll/ܶ᩵ܿ;

    .line 66
    sget v10, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v10, :cond_3

    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    goto/16 :goto_4

    :cond_3
    const-string v10, "\u0736\u0736"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v5, v10

    mul-int/lit8 v10, v10, 0x61

    xor-int v11, v10, v4

    mul-int/lit16 v11, v11, 0x357

    const v12, -0x1116b788

    xor-int/2addr v11, v12

    const v12, -0x52d11ad6

    xor-int/2addr v10, v12

    move v6, v10

    move v7, v11

    goto/16 :goto_0

    :sswitch_6
    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    iput-object v10, v0, Ll/ۤ᩻᩷;->᩵:Ljava/lang/String;

    sget v11, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v11, :cond_4

    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    goto/16 :goto_1

    :cond_4
    const-string v11, "\u06d8\u05a8"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v4

    mul-int/lit8 v11, v11, 0xb

    xor-int v12, v11, v5

    mul-int/lit16 v12, v12, 0x2867

    const v13, -0x2c769951

    xor-int/2addr v12, v13

    const v13, -0x46306869

    xor-int/2addr v11, v13

    move v6, v11

    move v7, v12

    goto/16 :goto_0

    :sswitch_7
    move/from16 v11, p3

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    .line 64
    iput v11, v0, Ll/ۤ᩻᩷;->ۖ:I

    move/from16 v12, p4

    .line 65
    iput v12, v0, Ll/ۤ᩻᩷;->ᩴ:I

    sget v13, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v13, :cond_5

    move-object/from16 v14, p1

    move-object/from16 v13, p2

    goto/16 :goto_4

    :cond_5
    const-string v13, "\u06e4\u1a73"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v4, v13

    mul-int/lit8 v13, v13, 0x75

    xor-int v14, v13, v5

    mul-int/lit16 v14, v14, -0x5603

    const v15, 0x4ae2ed77    # 7435963.5f

    xor-int/2addr v14, v15

    const v15, 0x26ac2245

    xor-int/2addr v13, v15

    move v6, v13

    move v7, v14

    goto/16 :goto_0

    :sswitch_8
    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    .line 63
    iput-object v13, v0, Ll/ۤ᩻᩷;->ۜ:Ljava/lang/String;

    .line 55
    sget v14, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v14, :cond_6

    const-string v14, "\u0730\u06e0"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v4

    mul-int/lit8 v14, v14, 0x63

    xor-int v15, v14, v5

    mul-int/lit16 v15, v15, 0x1035

    const v16, 0x1bc33f45

    xor-int v15, v15, v16

    const v16, -0x26a8b78

    goto :goto_3

    :cond_6
    const-string v14, "\u073d\u05a1"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v5

    mul-int/lit8 v14, v14, -0x2b

    xor-int v15, v14, v4

    mul-int/lit16 v15, v15, -0x2f19

    const v16, -0x1e5db6e1

    xor-int v15, v15, v16

    const v16, 0x124fd01d

    :goto_3
    xor-int v14, v14, v16

    move v6, v14

    move v7, v15

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    .line 49
    iput-object v2, v0, Ll/ۤ᩻᩷;->ܿ:Ll/ۗ᩵;

    move-object/from16 v14, p1

    .line 62
    iput-object v14, v0, Ll/ۤ᩻᩷;->᩻:Ljava/lang/String;

    .line 36
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v15

    if-gtz v15, :cond_7

    :goto_4
    const-string v15, "\u05a8\u05ab"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v5

    mul-int/lit8 v15, v15, 0x45

    move-object/from16 v16, v2

    xor-int v2, v15, v4

    mul-int/lit16 v2, v2, 0x4cc9

    const v17, 0x5c2d1dd

    xor-int v2, v2, v17

    const v17, 0x7ca743a9

    goto :goto_5

    :cond_7
    move-object/from16 v16, v2

    const-string v2, "\u05a8\u05a8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v5

    mul-int/lit8 v2, v2, 0x73

    xor-int v15, v2, v4

    mul-int/lit16 v15, v15, 0xab9

    const v17, -0x39c79c8e

    xor-int v15, v15, v17

    const v17, 0x556d451a

    goto/16 :goto_6

    :sswitch_a
    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    .line 49
    new-instance v2, Ll/ۗ᩵;

    invoke-direct {v2}, Ll/ۗ᩵;-><init>()V

    sget v15, Ll/᩺;->ۙۛܶ:I

    if-gtz v15, :cond_8

    goto/16 :goto_8

    :cond_8
    const-string v15, "\u0736\u1a7a"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v4

    move-object/from16 v16, v2

    xor-int v2, v15, v5

    mul-int/lit16 v2, v2, -0x6923

    const v17, 0x60500fdb

    xor-int v2, v2, v17

    const v17, -0x159d72d2

    :goto_5
    xor-int v15, v15, v17

    move v7, v2

    move v6, v15

    goto :goto_7

    :sswitch_b
    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v16, v2

    .line 48
    iput-object v1, v0, Ll/ۤ᩻᩷;->֫:Ll/ۗ᩵;

    sget-boolean v2, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v2, :cond_9

    goto/16 :goto_a

    :cond_9
    const-string v2, "\u06e2\u05a8"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v5

    xor-int v15, v2, v4

    mul-int/lit16 v15, v15, -0x7027

    const v17, -0xabd18e0

    xor-int v15, v15, v17

    const v17, -0x7da19e5d

    :goto_6
    xor-int v2, v2, v17

    move v6, v2

    move v7, v15

    :goto_7
    move-object/from16 v2, v16

    goto/16 :goto_0

    :sswitch_c
    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v16, v2

    .line 62
    sget v2, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v2, :cond_a

    move-object/from16 v2, v16

    :goto_8
    const-string v15, "\u1a79\u1a74"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    sub-int v15, v4, v15

    mul-int/lit8 v15, v15, -0x61

    xor-int v0, v15, v5

    mul-int/lit16 v0, v0, -0x32f1

    const v16, 0x4953a874    # 866951.25f

    xor-int v0, v0, v16

    const v16, 0x74eec900

    xor-int v15, v15, v16

    move v7, v0

    move v6, v15

    goto/16 :goto_c

    :cond_a
    const-string v0, "\u06e4\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v4

    xor-int v2, v0, v5

    mul-int/lit16 v2, v2, -0x50df

    const v15, -0x90465e6

    xor-int/2addr v2, v15

    const v15, -0x400d728e

    goto/16 :goto_b

    :sswitch_d
    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v16, v2

    .line 54
    sget-boolean v0, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v0, :cond_b

    :goto_9
    const-string v0, "\u05a1\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v5

    mul-int/lit8 v0, v0, -0x4f

    xor-int v2, v0, v4

    mul-int/lit16 v2, v2, -0x4521

    const v15, -0x2008bf8b

    xor-int/2addr v2, v15

    const v15, -0x2aa7cc18

    goto :goto_b

    :cond_b
    const-string v0, "\u1a74\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v4, v0

    mul-int/lit8 v0, v0, 0x2b

    xor-int v2, v0, v5

    mul-int/lit16 v2, v2, 0x118f

    const v15, -0x39fa004

    xor-int/2addr v2, v15

    const v15, 0x7c2a2ac6

    goto :goto_b

    :sswitch_e
    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v11, p3

    move/from16 v12, p4

    move-object/from16 v10, p5

    move-object/from16 v9, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v16, v2

    .line 48
    new-instance v1, Ll/ۗ᩵;

    invoke-direct {v1}, Ll/ۗ᩵;-><init>()V

    .line 65
    sget v0, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v0, :cond_c

    :goto_a
    const-string v0, "\u06e4\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, -0x6f

    xor-int v2, v0, v5

    mul-int/lit16 v2, v2, 0x69d

    const v15, 0x582f58fc

    xor-int/2addr v2, v15

    const v15, -0x70831715

    goto :goto_b

    :cond_c
    const-string v0, "\u06d9\u1a75"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v5

    xor-int v2, v0, v4

    mul-int/lit16 v2, v2, 0x6c67

    const v15, -0x33440a3e    # -9.8545168E7f

    xor-int/2addr v2, v15

    const v15, -0x35d57c4e    # -2793708.5f

    :goto_b
    xor-int/2addr v0, v15

    move v6, v0

    move v7, v2

    move-object/from16 v2, v16

    :goto_c
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x75afc2a2 -> :sswitch_2
        -0x70a1b49c -> :sswitch_2
        -0x656bbb25 -> :sswitch_c
        -0x64c28f61 -> :sswitch_5
        -0x5b5d01a8 -> :sswitch_5
        -0x5a5fba21 -> :sswitch_b
        -0x4faf0166 -> :sswitch_0
        -0x3f4e8a16 -> :sswitch_7
        -0x3bd704be -> :sswitch_3
        -0x31e76987 -> :sswitch_6
        -0x12e7b3cb -> :sswitch_8
        -0xb92f542 -> :sswitch_a
        -0xa856731 -> :sswitch_0
        -0x30075b4 -> :sswitch_e
        0x5efd23 -> :sswitch_4
        0xb977cb8 -> :sswitch_3
        0x2f151a23 -> :sswitch_6
        0x31bd4b12 -> :sswitch_b
        0x3a721831 -> :sswitch_c
        0x3f08b799 -> :sswitch_d
        0x408b645e -> :sswitch_e
        0x4b1565cf -> :sswitch_8
        0x4bdf1de1 -> :sswitch_d
        0x4cf3815d -> :sswitch_4
        0x5771a27a -> :sswitch_9
        0x642d6d37 -> :sswitch_9
        0x6e32f72b -> :sswitch_1
        0x717b70d3 -> :sswitch_7
        0x777c6032 -> :sswitch_a
        0x787a6821 -> :sswitch_1
    .end sparse-switch
.end method

.method private ֫()Landroid/content/ClipboardManager;
    .locals 19

    move-object/from16 v0, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const v12, 0x741e5bd5

    sget v13, Ll/ۘۨ;->۫᩸۠:I

    sget v14, Ll/֫᩵;->ܶ᩻᩷:I

    const-string v15, "\u05ab\u1a76"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    xor-int v1, v15, v14

    mul-int/lit16 v1, v1, -0x59e7

    const v17, -0x2451aea5

    xor-int v1, v1, v17

    const v17, 0xb04dc7e

    xor-int v15, v15, v17

    const/16 v16, 0x0

    :goto_0
    xor-int/2addr v12, v14

    mul-int/lit16 v12, v12, 0x5b7f

    shr-int/lit8 v12, v12, 0x1f

    and-int/2addr v1, v12

    xor-int v12, v15, v1

    sparse-switch v12, :sswitch_data_0

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    sget-boolean v1, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v1, :cond_d

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    sget v1, Ll/ۗۚ;->ܶۛᩴ:I

    if-gez v1, :cond_b

    goto/16 :goto_5

    .line 353
    :sswitch_1
    sget v1, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v1, :cond_9

    goto/16 :goto_6

    :sswitch_2
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    goto/16 :goto_4

    .line 173
    :sswitch_3
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    const/4 v1, 0x0

    return-object v1

    .line 384
    :sswitch_4
    invoke-static/range {v16 .. v16}, Ll/ۙ᩸᩷;->ۧ(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ClipboardManager;

    iput-object v1, v0, Ll/ۤ᩻᩷;->ۧ:Landroid/content/ClipboardManager;

    goto/16 :goto_1

    .line 383
    :sswitch_5
    invoke-static {v9, v10, v11, v8}, Ll/۠;->ۢۤ۠([SIII)Ljava/lang/String;

    move-result-object v16

    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v1, "\u1a7b\u073f"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, -0x49

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, 0x3bd5

    const v17, -0xa6cb9af

    xor-int v15, v15, v17

    const v17, 0x6d26921c

    goto/16 :goto_7

    :sswitch_6
    const/16 v11, 0x9

    sget v1, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v1, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v1, "\u1a77\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, -0x5685

    const v17, 0x648c1b81

    xor-int v15, v15, v17

    const v17, -0x157fc9dd

    goto/16 :goto_7

    :sswitch_7
    sget-object v9, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    const/4 v10, 0x1

    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v1, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v1, "\u06d9\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x6eb5

    const v17, -0x5b49c015

    xor-int v15, v15, v17

    const v17, -0x14261eb

    goto/16 :goto_7

    .line 386
    :sswitch_8
    iget-object v1, v0, Ll/ۤ᩻᩷;->ۧ:Landroid/content/ClipboardManager;

    return-object v1

    .line 383
    :sswitch_9
    iget-object v1, v0, Ll/ۤ᩻᩷;->ۧ:Landroid/content/ClipboardManager;

    if-nez v1, :cond_3

    const-string v1, "\u06d7\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x7d1b

    const v17, -0x5956db2c

    xor-int v15, v15, v17

    const v17, -0x25e2dee6

    goto/16 :goto_7

    :cond_3
    :goto_1
    const-string v1, "\u1a78\u1a73"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v13

    mul-int/lit8 v1, v1, 0x13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, -0x11dd

    const v17, -0x76caea1d

    xor-int v15, v15, v17

    const v17, 0x52222ed9

    goto/16 :goto_7

    :sswitch_a
    const v1, 0xca33

    const v8, 0xca33

    goto :goto_2

    :sswitch_b
    const/16 v1, 0x42b2

    const/16 v8, 0x42b2

    :goto_2
    const-string v1, "\u1a75\u1a78"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, -0x79a7

    const v17, 0x3f2ced37

    xor-int v15, v15, v17

    const v17, -0x6f72b286

    goto/16 :goto_7

    :sswitch_c
    mul-int v1, v4, v7

    sub-int v1, v6, v1

    if-gez v1, :cond_4

    const-string v1, "\u06ec\u06e2"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v14, v1

    mul-int/lit8 v1, v1, -0x4f

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x1ba9

    const v17, 0x4ab44bb1    # 5907928.5f

    xor-int v15, v15, v17

    const v17, -0x5dda708e

    goto/16 :goto_7

    :cond_4
    const-string v1, "\u073f\u06e4"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, -0x6d2d

    const v17, -0xb3477d8

    xor-int v15, v15, v17

    const v17, 0x15421154

    goto/16 :goto_7

    :sswitch_d
    const/16 v7, 0x3086

    .line 48
    sget-boolean v1, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v1, :cond_5

    goto :goto_3

    :cond_5
    const-string v1, "\u1a7a\u06d6"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x67

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x3f5f

    const v17, -0x6e9b27f9

    xor-int v15, v15, v17

    const v17, -0x267576f3

    goto/16 :goto_7

    :sswitch_e
    const v1, 0x24ca189

    add-int v6, v5, v1

    .line 228
    sget v1, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v1, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v1, "\u06d8\u06e7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    mul-int/lit8 v1, v1, 0x2f

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, -0x1247

    const v17, -0x52c5be41

    xor-int v15, v15, v17

    const v17, -0x4465b983

    goto/16 :goto_7

    :sswitch_f
    aget-short v4, v2, v3

    mul-int v5, v4, v4

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v1

    if-gtz v1, :cond_7

    :goto_3
    const-string v1, "\u073d\u06e8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x137f

    const v17, -0x7a79d009

    xor-int v15, v15, v17

    const v17, -0x77712462

    goto/16 :goto_7

    :cond_7
    const-string v1, "\u06db\u06eb"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0x43

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, 0x46e1

    const v17, 0x41056c9f

    xor-int v15, v15, v17

    const v17, -0x3e6cc8a4

    goto/16 :goto_7

    :sswitch_10
    const/4 v3, 0x0

    .line 252
    sget v1, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v1, :cond_8

    :goto_4
    const-string v1, "\u06eb\u0733"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    mul-int/lit8 v1, v1, -0x5

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x506f

    const v17, -0x2330fd2a

    xor-int v15, v15, v17

    const v17, 0x88b7f40

    goto/16 :goto_7

    :cond_8
    const-string v1, "\u06d9\u06e2"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    mul-int/lit8 v1, v1, 0x2d

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x6d7

    const v17, -0x19cebe8a

    xor-int v15, v15, v17

    const v17, 0x5bcd2e6c

    goto/16 :goto_7

    .line 291
    :sswitch_11
    sget-boolean v1, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v1, :cond_a

    :cond_9
    :goto_5
    const-string v1, "\u06db\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    mul-int/lit8 v1, v1, -0x15

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, -0x7c5

    const v17, -0x479dc65f

    xor-int v15, v15, v17

    const v17, 0x4aac5d69    # 5648052.5f

    goto/16 :goto_7

    :cond_a
    const-string v1, "\u1a78\u06d6"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x6b

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x5113

    const v17, -0x57ab6270

    xor-int v15, v15, v17

    const v17, 0x1e305235

    goto :goto_7

    .line 190
    :sswitch_12
    sget v1, Ll/֨۟;->᩹֫᩷:I

    if-eqz v1, :cond_c

    :cond_b
    const-string v1, "\u1a76\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v13

    mul-int/lit8 v1, v1, 0x77

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, -0x2fcb

    const v17, -0x17cd052e

    xor-int v15, v15, v17

    const v17, -0x5f280997

    goto :goto_7

    :cond_c
    const-string v1, "\u06d9\u06dc"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x2b

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x4073

    const v17, 0x394284f

    xor-int v15, v15, v17

    const v17, -0x4b90f40d

    goto :goto_7

    :sswitch_13
    sget-object v2, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    .line 137
    sget v1, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v1, :cond_e

    :cond_d
    :goto_6
    const-string v1, "\u1a74\u06e7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v15, v1, v13

    mul-int/lit16 v15, v15, -0x887

    const v17, 0x250e145b

    xor-int v15, v15, v17

    const v17, 0x4ccef84b    # 1.08511832E8f

    goto :goto_7

    :cond_e
    const-string v1, "\u06d9\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v13

    xor-int v15, v1, v14

    mul-int/lit16 v15, v15, 0x6cb1

    const v17, -0x198ebe8f

    xor-int v15, v15, v17

    const v17, 0x38023024

    :goto_7
    xor-int v1, v1, v17

    move/from16 v18, v15

    move v15, v1

    move/from16 v1, v18

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7487bb23 -> :sswitch_2
        -0x73488a60 -> :sswitch_7
        -0x6f4fcac5 -> :sswitch_e
        -0x5ea0da01 -> :sswitch_7
        -0x5ab0de88 -> :sswitch_10
        -0x57e83549 -> :sswitch_6
        -0x3f99483f -> :sswitch_6
        -0x344a88bb -> :sswitch_b
        -0x32215220 -> :sswitch_f
        -0x27bece45 -> :sswitch_d
        -0x279d926a -> :sswitch_e
        -0x21db4caa -> :sswitch_0
        -0x2165286a -> :sswitch_9
        -0x211e32ba -> :sswitch_12
        -0x1c787d71 -> :sswitch_a
        -0x18502a5a -> :sswitch_12
        -0x1218cfc0 -> :sswitch_13
        -0xc5e2f3c -> :sswitch_b
        -0xa3f69e5 -> :sswitch_1
        0x7cdf174 -> :sswitch_c
        0xc175d08 -> :sswitch_4
        0xc602b62 -> :sswitch_5
        0x116d489f -> :sswitch_c
        0x1a5e960f -> :sswitch_f
        0x1a674d3b -> :sswitch_2
        0x1f6b42e6 -> :sswitch_a
        0x26deca6a -> :sswitch_10
        0x276fabf5 -> :sswitch_4
        0x3318a5d5 -> :sswitch_5
        0x34a7102c -> :sswitch_1
        0x3af33d13 -> :sswitch_11
        0x4165e5fc -> :sswitch_0
        0x4a939473 -> :sswitch_8
        0x5c532a6e -> :sswitch_13
        0x5c943ad9 -> :sswitch_d
        0x6fd4b6ad -> :sswitch_3
        0x71389ee9 -> :sswitch_8
        0x73c934ad -> :sswitch_11
        0x75076a0f -> :sswitch_3
        0x766d25cc -> :sswitch_9
    .end sparse-switch
.end method

.method public static varargs ֫(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0xae9d70e

    sget v4, Ll/ۗۗ;->ۨ۬ۖ:I

    sget v5, Ll/֫ܿ;->ۨ۫ᩳ:I

    const-string v6, "\u1a7b\u06df"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3959

    const v8, 0x5930e752

    xor-int/2addr v7, v8

    const v8, 0x3626c6ff

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x2c75

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 6
    sget v6, Ll/᩹;->ۤܿܳ:I

    if-eqz v6, :cond_3

    goto/16 :goto_3

    :sswitch_0
    sget v6, Ll/֫ܽ;->ۚ᩷᩹:I

    if-gez v6, :cond_4

    goto :goto_1

    .line 18
    :sswitch_1
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v6

    if-ltz v6, :cond_a

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    sget v6, Ll/֫ܽ;->ۚ᩷᩹:I

    if-gez v6, :cond_c

    goto :goto_1

    .line 82
    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    :goto_1
    const-string v6, "\u06e8\u1a77"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x6b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0xa2d

    const v8, 0x5299b4b9

    xor-int/2addr v7, v8

    const v8, 0x1182182

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    const/4 p0, 0x0

    return-object p0

    .line 259
    :sswitch_5
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    goto :goto_2

    .line 261
    :sswitch_6
    invoke-static {v2, p0, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 257
    :sswitch_7
    invoke-static {v1}, Ll/᩷۫;->֫(Landroid/content/res/Configuration;)Ll/ۘ۫;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Ll/ۘ۫;->֫(I)Ljava/util/Locale;

    move-result-object v6

    if-nez v6, :cond_0

    const-string v6, "\u06e7\u0730"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x3b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x2575

    const v8, 0x2d93c0d3

    xor-int/2addr v7, v8

    const v8, 0x3bf125d6

    goto :goto_0

    :cond_0
    move-object v2, v6

    :goto_2
    const-string v6, "\u05ab\u06df"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2341

    const v8, -0x346bac74    # -1.9441432E7f

    xor-int/2addr v7, v8

    const v8, -0x5afd148b

    goto/16 :goto_0

    :sswitch_8
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    sget v6, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v6, :cond_1

    goto :goto_3

    :cond_1
    const-string v6, "\u073d\u1a73"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4ff5

    const v8, -0x1ecc72c1

    xor-int/2addr v7, v8

    const v8, -0x2b228678

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v0

    .line 139
    sget-boolean v6, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v6, :cond_2

    goto :goto_4

    :cond_2
    const-string v6, "\u05ab\u06da"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x21

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7c47

    const v8, -0xacc14c0

    xor-int/2addr v7, v8

    const v8, -0x1590c30b

    goto/16 :goto_0

    :goto_3
    const-string v6, "\u06d9\u06da"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x7f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7711

    const v8, 0x2e5d8eab

    xor-int/2addr v7, v8

    const v8, -0x2d3826c7

    goto/16 :goto_0

    :cond_3
    const-string v6, "\u06e4\u05a8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x755d

    const v8, 0x2d241559

    xor-int/2addr v7, v8

    const v8, -0x43303a78

    goto/16 :goto_0

    .line 77
    :sswitch_a
    sget-boolean v6, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v6, :cond_5

    :cond_4
    :goto_4
    const-string v6, "\u073a\u073a"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x545

    const v8, -0x7f7871a6

    xor-int/2addr v7, v8

    const v8, -0x3e60ef93

    goto/16 :goto_0

    :cond_5
    const-string v6, "\u06e8\u1a7a"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x35

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1c15

    const v8, 0xc3e8ae4

    xor-int/2addr v7, v8

    const v8, 0x35e73051

    goto/16 :goto_0

    .line 2
    :sswitch_b
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v6

    if-gtz v6, :cond_6

    goto :goto_5

    :cond_6
    const-string v6, "\u06da\u06e1"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x47

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x56c3

    const v8, 0x7e0e8676

    xor-int/2addr v7, v8

    const v8, 0x2a478538

    goto/16 :goto_0

    .line 240
    :sswitch_c
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v6

    if-eqz v6, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v6, "\u1a73\u1a7b"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x29

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x151b

    const v8, 0x648f22dc

    xor-int/2addr v7, v8

    const v8, 0x4441796b

    goto/16 :goto_0

    .line 214
    :sswitch_d
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v6

    if-gtz v6, :cond_8

    goto :goto_5

    :cond_8
    const-string v6, "\u06dc\u1a77"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x25

    xor-int v7, v6, v4

    mul-int/lit8 v7, v7, 0x5f

    const v8, 0x14a1bd94

    xor-int/2addr v7, v8

    const v8, -0x4b1c5efd

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v6, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v6, :cond_9

    goto :goto_6

    :cond_9
    const-string v6, "\u06eb\u05ab"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x39fd

    const v8, -0x5d6d6379

    xor-int/2addr v7, v8

    const v8, 0x473208b5

    goto/16 :goto_0

    :sswitch_f
    sget v6, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v6, :cond_b

    :cond_a
    :goto_5
    const-string v6, "\u06db\u05a1"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x71

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4583

    const v8, 0x2f3c31a2

    xor-int/2addr v7, v8

    const v8, 0xd7cc777

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u06e0\u06e2"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x68e7

    const v8, -0x676d9438

    xor-int/2addr v7, v8

    const v8, 0x1ef65e6c

    goto/16 :goto_0

    .line 63
    :sswitch_10
    sget v6, Ll/֡֡;->֫ۤܳ:I

    if-ltz v6, :cond_d

    :cond_c
    :goto_6
    const-string v6, "\u06e0\u0730"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x61

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6c93

    const v8, 0x407f232b

    xor-int/2addr v7, v8

    const v8, -0x4ae38eda

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u05ab\u05a8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x6d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x61a7

    const v8, -0x62d75d2c

    xor-int/2addr v7, v8

    const v8, -0x5dd37762

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x78540420 -> :sswitch_1
        -0x6b4e8afb -> :sswitch_d
        -0x6a43ace6 -> :sswitch_1
        -0x62551427 -> :sswitch_c
        -0x4e70ff7f -> :sswitch_0
        -0x4deff1fe -> :sswitch_d
        -0x4ad63a95 -> :sswitch_a
        -0x3d04f05e -> :sswitch_b
        -0x3a524155 -> :sswitch_0
        -0x397ef698 -> :sswitch_2
        -0x2a520f44 -> :sswitch_4
        -0x25675b6a -> :sswitch_6
        -0x142ba707 -> :sswitch_e
        -0x1149ce98 -> :sswitch_b
        -0xede062a -> :sswitch_6
        0x1910c47a -> :sswitch_8
        0x21ff59c9 -> :sswitch_7
        0x26e0a38e -> :sswitch_5
        0x28d022b2 -> :sswitch_2
        0x29d6fa68 -> :sswitch_a
        0x32c08f73 -> :sswitch_8
        0x400bdd9a -> :sswitch_10
        0x42e1dade -> :sswitch_c
        0x45244d8c -> :sswitch_5
        0x4935e2b0 -> :sswitch_4
        0x49edc45b -> :sswitch_9
        0x4e98fa18 -> :sswitch_7
        0x50fdcaab -> :sswitch_f
        0x54f8e041 -> :sswitch_3
        0x5aa3a6d6 -> :sswitch_9
        0x6206590c -> :sswitch_10
        0x7156ac9a -> :sswitch_f
        0x7e325ce3 -> :sswitch_e
        0x7f669f9a -> :sswitch_3
    .end sparse-switch
.end method

.method public static bridge synthetic ֫(Ll/ۤ᩻᩷;)Ll/۫᩻᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤ᩻᩷;->᩷:Ll/۫᩻᩷;

    return-object p0
.end method

.method public static ֫(Ll/ۤ᩻᩷;Ljava/lang/Class;)V
    .locals 20

    move-object/from16 v1, p0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const v12, 0x7c5c94a0

    sget v13, Ll/ۗ᩷;->᩸᩺ᩳ:I

    sget v14, Ll/ۙۨ;->ۡۗۙ:I

    const-string v15, "\u06eb\u1a77"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v14

    mul-int/lit8 v15, v15, 0x6b

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, -0xbaf

    const v17, -0x47421a12

    xor-int v0, v0, v17

    const v17, -0x2495360c

    xor-int v15, v15, v17

    move-object v5, v4

    move/from16 v16, v15

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const v15, 0x7c5c94a0

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int/2addr v15, v13

    mul-int/lit16 v15, v15, 0x2f19

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v0, v15

    xor-int v15, v16, v0

    sparse-switch v15, :sswitch_data_0

    move-object/from16 v18, v5

    move/from16 v16, v15

    const/16 v0, 0x2b25

    const/16 v12, 0x2b25

    goto/16 :goto_6

    .line 249
    :sswitch_0
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v0

    if-lez v0, :cond_0

    move-object/from16 v18, v5

    move/from16 v16, v15

    goto/16 :goto_d

    :cond_0
    const-string v0, "\u06e0\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    move/from16 v16, v15

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x5fbd

    const v18, 0x19172ebd

    xor-int v15, v15, v18

    const v18, 0x5e3b2dc2

    goto/16 :goto_a

    :sswitch_1
    move/from16 v16, v15

    .line 165
    sget v0, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez v0, :cond_1

    goto/16 :goto_b

    :cond_1
    move-object/from16 v18, v5

    goto/16 :goto_d

    :sswitch_2
    move/from16 v16, v15

    .line 323
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    sget v0, Ll/֫ܽ;->ۚ᩷᩹:I

    if-gez v0, :cond_3

    :cond_2
    move-object/from16 v18, v5

    goto/16 :goto_9

    :cond_3
    move-object/from16 v18, v5

    goto/16 :goto_7

    :sswitch_3
    move/from16 v16, v15

    .line 192
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget v0, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v0, :cond_4

    goto/16 :goto_b

    :cond_4
    move-object/from16 v18, v5

    goto/16 :goto_8

    :sswitch_4
    move/from16 v16, v15

    sget v0, Ll/ۗ᩵;->֫۠۟:I

    if-gez v0, :cond_2

    goto/16 :goto_b

    :sswitch_5
    move/from16 v16, v15

    .line 174
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v0

    if-ltz v0, :cond_f

    goto :goto_1

    :sswitch_6
    move/from16 v16, v15

    sget v0, Ll/֫᩹;->᩶ۘۘ:I

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    const-string v0, "\u06dc\u1a73"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x37

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x738f

    const v18, -0x360ed5f

    xor-int v15, v15, v18

    const v18, -0x186d8e92

    goto/16 :goto_a

    :sswitch_7
    move/from16 v16, v15

    .line 310
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    sget v0, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-lez v0, :cond_6

    goto :goto_2

    :cond_6
    move-object/from16 v18, v5

    goto/16 :goto_c

    :sswitch_8
    move/from16 v16, v15

    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    :goto_2
    const-string v0, "\u06df\u05a1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x55

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x6a6b

    const v18, -0x22774856

    xor-int v15, v15, v18

    const v18, 0xfe8a920

    goto/16 :goto_a

    .line 281
    :sswitch_9
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    :sswitch_a
    return-void

    :sswitch_b
    move/from16 v16, v15

    .line 329
    :try_start_0
    sget-object v0, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v15, 0x13

    move-object/from16 v18, v5

    const/16 v5, 0x10

    :try_start_1
    invoke-static {v0, v15, v5, v12}, Ll/ۗ᩶;->᩶ܶۡ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 331
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v0, v5}, Ll/֫֫;->ۚ֡ܽ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Intent;

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object/from16 v18, v5

    goto/16 :goto_4

    :sswitch_c
    move-object/from16 v18, v5

    move/from16 v16, v15

    const/high16 v0, 0x10000000

    .line 333
    invoke-static {v2, v0}, Ll/֫ۡ;->᩹ۘۨ(Ljava/lang/Object;I)Landroid/content/Intent;

    .line 334
    invoke-static {v3, v2}, Ll/᩺;->᩶᩹᩵(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const-string v0, "\u06e7\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x6859

    const v15, 0x42ed4343

    xor-int/2addr v5, v15

    const v15, 0x50936835

    goto/16 :goto_e

    :sswitch_d
    move-object/from16 v18, v5

    move/from16 v16, v15

    if-eqz p1, :cond_7

    const-string v0, "\u06e8\u06d6"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, 0x829

    const v15, 0x27f105dd

    xor-int/2addr v5, v15

    const v15, 0x113db95a

    goto/16 :goto_e

    :cond_7
    :goto_3
    const-string v0, "\u06dc\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x3

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x2195

    const v15, 0x6ab6e80c

    xor-int/2addr v5, v15

    const v15, 0x4d5c3709    # 2.30912144E8f

    goto/16 :goto_e

    .line 336
    :sswitch_e
    invoke-virtual {v1, v4}, Ll/ۤ᩻᩷;->log(Ljava/lang/Throwable;)V

    .line 337
    invoke-static {v4}, Ll/֡۬;->ܺܽۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۘۘ;->ܿ᩵᩵(Ljava/lang/Object;)Ll/᩸ۚۢ;

    return-void

    :sswitch_f
    move-object/from16 v18, v5

    move/from16 v16, v15

    .line 327
    :try_start_2
    invoke-static {}, Ll/֡ۨ;->۫۠ܿ()Landroid/app/Application;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 328
    :try_start_3
    new-instance v2, Landroid/content/Intent;

    sget-object v0, Ll/ۛ᩻᩷;->ۜ:Ljava/lang/Class;

    invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    sget-object v0, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    const/16 v5, 0xb

    const/16 v15, 0x8

    invoke-static {v0, v5, v15, v12}, Ll/֫֫;->ܿ᩶ۤ([SIII)Ljava/lang/String;

    move-result-object v0

    .line 87
    iget-object v5, v1, Ll/ۤ᩻᩷;->᩻:Ljava/lang/String;

    .line 329
    invoke-static {v2, v0, v5}, Ll/֫֫;->ۚ֡ܽ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/content/Intent;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    const-string v0, "\u06e8\u06e2"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x3d

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x37cb

    const v15, 0x79e8b151

    xor-int/2addr v5, v15

    const v15, -0x10194d71

    goto/16 :goto_e

    :catchall_1
    move-exception v0

    move-object v4, v0

    const/4 v2, 0x0

    goto :goto_5

    :catchall_2
    move-exception v0

    :goto_4
    move-object v4, v0

    :goto_5
    const-string v0, "\u05a1\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x25

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x67e5

    const v15, 0x19f05995

    xor-int/2addr v5, v15

    const v15, 0x333b21e4

    goto/16 :goto_e

    :sswitch_10
    move-object/from16 v18, v5

    move/from16 v16, v15

    const/16 v0, 0x1aee

    const/16 v12, 0x1aee

    :goto_6
    const-string v0, "\u1a74\u05a1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v13

    mul-int/lit8 v5, v5, 0x29

    const v15, -0x2a5afc95

    xor-int/2addr v5, v15

    const v15, 0x4dbd7128    # 3.97288704E8f

    goto/16 :goto_e

    :sswitch_11
    move-object/from16 v18, v5

    move/from16 v16, v15

    add-int v0, v7, v11

    mul-int v0, v0, v0

    sub-int/2addr v0, v10

    if-lez v0, :cond_8

    const-string v0, "\u0730\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x608f

    const v15, 0x2faf7040

    xor-int/2addr v5, v15

    const v15, 0x26d4b39c

    goto/16 :goto_e

    :cond_8
    const-string v0, "\u06e4\u0730"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x27

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x3843

    const v15, 0x62ff74f3

    xor-int/2addr v5, v15

    const v15, -0x71d17548

    goto/16 :goto_e

    :sswitch_12
    move-object/from16 v18, v5

    move/from16 v16, v15

    const/16 v11, 0x149f

    .line 77
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v0

    if-nez v0, :cond_9

    :goto_7
    const-string v0, "\u1a77\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x5b1b

    const v15, 0xfcda929

    xor-int/2addr v5, v15

    const v15, 0x63de841c

    goto/16 :goto_e

    :cond_9
    const-string v0, "\u06e4\u1a7b"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, 0x2d6f

    const v15, 0xc81352e

    xor-int/2addr v5, v15

    const v15, 0x28a1b939

    goto/16 :goto_e

    :sswitch_13
    move-object/from16 v18, v5

    move/from16 v16, v15

    add-int v0, v8, v9

    add-int v10, v0, v0

    .line 169
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v0

    if-gtz v0, :cond_a

    :goto_8
    const-string v0, "\u1a7a\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x3d

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x5b3d

    const v15, -0x4457e9bc

    xor-int/2addr v5, v15

    const v15, 0x3af8124c

    goto/16 :goto_e

    :cond_a
    const-string v0, "\u06eb\u0733"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x71

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x6df7

    const v15, 0x610f1819

    xor-int/2addr v5, v15

    const v15, -0x58926394

    goto/16 :goto_e

    :sswitch_14
    move-object/from16 v18, v5

    move/from16 v16, v15

    const v9, 0x1a93ac1

    sget v0, Ll/۠;->ܺܺܶ:I

    if-ltz v0, :cond_b

    const-string v0, "\u073d\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x32d1

    const v15, -0x5ab2a8cb

    xor-int/2addr v5, v15

    const v15, -0x3f2be90b

    goto/16 :goto_e

    :cond_b
    const-string v0, "\u1a76\u06dc"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x537f

    const v15, -0x150cc2fe

    xor-int/2addr v5, v15

    const v15, -0x6efb471a

    goto/16 :goto_e

    :sswitch_15
    move-object/from16 v18, v5

    move/from16 v16, v15

    aget-short v7, v18, v6

    mul-int v8, v7, v7

    .line 57
    sget v0, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v0, :cond_c

    :goto_9
    const-string v0, "\u1a76\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x3d

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x784d

    const v15, -0x17d0bb38

    xor-int/2addr v5, v15

    const v15, -0x234b6934

    goto/16 :goto_e

    :cond_c
    const-string v0, "\u06eb\u1a79"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x43

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x103

    const v15, -0x74c89d5a

    xor-int/2addr v5, v15

    const v15, 0x6b927ad8

    goto/16 :goto_e

    :sswitch_16
    move-object/from16 v18, v5

    move/from16 v16, v15

    const/16 v6, 0xa

    .line 42
    sget v0, Ll/ۛ;->᩺᩻֫:I

    if-ltz v0, :cond_d

    goto/16 :goto_c

    :cond_d
    const-string v0, "\u06dc\u06e2"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, 0x60d

    const v15, -0x5b8fc290

    xor-int/2addr v5, v15

    const v15, -0x661028ed

    goto/16 :goto_e

    :sswitch_17
    move/from16 v16, v15

    sget-object v5, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    sget v0, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v0, :cond_e

    goto :goto_b

    :cond_e
    const-string v0, "\u06d9\u06e2"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0xb

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x1403

    const v18, 0x631fa258

    xor-int v15, v15, v18

    const v18, -0x4f20afee

    :goto_a
    xor-int v0, v0, v18

    move/from16 v19, v16

    move/from16 v16, v0

    move v0, v15

    move/from16 v15, v19

    goto/16 :goto_0

    :sswitch_18
    move-object/from16 v18, v5

    move/from16 v16, v15

    .line 22
    sget-boolean v0, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v0, :cond_10

    move-object/from16 v5, v18

    :cond_f
    :goto_b
    const-string v0, "\u06e4\u1a74"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x7797

    const v18, -0x22f7b886

    xor-int v15, v15, v18

    const v18, 0x1fc3364f

    goto :goto_a

    :cond_10
    const-string v0, "\u06e7\u06e7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x3

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, -0x66f

    const v15, -0x496fb215

    xor-int/2addr v5, v15

    const v15, 0x54bf0a52

    goto/16 :goto_e

    :sswitch_19
    move-object/from16 v18, v5

    move/from16 v16, v15

    .line 314
    sget v0, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v0, :cond_11

    :goto_c
    const-string v0, "\u1a77\u06ec"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x6d

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x7331

    const v15, -0x4bb536f4

    xor-int/2addr v5, v15

    const v15, -0x68dee609

    goto :goto_e

    :cond_11
    const-string v0, "\u1a73\u05a8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x3

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x1477

    const v15, 0x4d64fd7a    # 2.40113568E8f

    xor-int/2addr v5, v15

    const v15, -0x20a7543b

    goto :goto_e

    :sswitch_1a
    move-object/from16 v18, v5

    move/from16 v16, v15

    sget v0, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v0, :cond_12

    goto :goto_d

    :cond_12
    const-string v0, "\u06dc\u1a75"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v5, v0, v13

    mul-int/lit16 v5, v5, -0x5a7b

    const v15, 0x5e9a4515

    xor-int/2addr v5, v15

    const v15, 0x5d8898df

    goto :goto_e

    :sswitch_1b
    move-object/from16 v18, v5

    move/from16 v16, v15

    .line 228
    sget v0, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v0, :cond_13

    :goto_d
    const-string v0, "\u06e2\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0xf

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x163

    const v15, 0x1453040d

    xor-int/2addr v5, v15

    const v15, 0x37c16d13

    goto :goto_e

    :cond_13
    const-string v0, "\u06d6\u06df"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x61

    xor-int v5, v0, v14

    mul-int/lit16 v5, v5, 0x4ac3

    const v15, 0x69738b23

    xor-int/2addr v5, v15

    const v15, 0x4f6b27c2

    :goto_e
    xor-int/2addr v0, v15

    move/from16 v15, v16

    move/from16 v16, v0

    move v0, v5

    move-object/from16 v5, v18

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x78833e0f -> :sswitch_0
        -0x74466f92 -> :sswitch_a
        -0x717df5f5 -> :sswitch_17
        -0x6d07a536 -> :sswitch_15
        -0x648d3725 -> :sswitch_8
        -0x60d091a7 -> :sswitch_12
        -0x5edcbdbe -> :sswitch_c
        -0x599d2e37 -> :sswitch_13
        -0x5521f378 -> :sswitch_1a
        -0x549a1cc6 -> :sswitch_18
        -0x4843a300 -> :sswitch_13
        -0x42153c51 -> :sswitch_7
        -0x40ab2dab -> :sswitch_15
        -0x3983e9a2 -> :sswitch_6
        -0x396d3845 -> :sswitch_c
        -0x345940db -> :sswitch_14
        -0x328cffa9 -> :sswitch_19
        -0x2d77b212 -> :sswitch_f
        -0x258af10b -> :sswitch_1
        -0x1f9966b6 -> :sswitch_4
        -0x1b987f5e -> :sswitch_18
        -0x1990d0f2 -> :sswitch_0
        -0x151e12ae -> :sswitch_b
        -0x147ffaf0 -> :sswitch_1b
        -0x11535cac -> :sswitch_7
        -0xc32e319 -> :sswitch_1b
        -0x4aec723 -> :sswitch_12
        -0x29d4d8b -> :sswitch_9
        0x3f95f1d -> :sswitch_5
        0xb055985 -> :sswitch_e
        0xcbb3088 -> :sswitch_3
        0xe1a97ee -> :sswitch_11
        0x15d85dc6 -> :sswitch_e
        0x1ab58da7 -> :sswitch_5
        0x24f36bb5 -> :sswitch_1a
        0x2578cc2d -> :sswitch_8
        0x2cbedb56 -> :sswitch_9
        0x31797941 -> :sswitch_a
        0x3786bb74 -> :sswitch_b
        0x3978189f -> :sswitch_6
        0x3de12cec -> :sswitch_2
        0x3fd13c39 -> :sswitch_1
        0x453ee4ba -> :sswitch_d
        0x45666195 -> :sswitch_3
        0x53e5b126 -> :sswitch_11
        0x55a8515a -> :sswitch_10
        0x605fa249 -> :sswitch_17
        0x62595334 -> :sswitch_14
        0x6853c694 -> :sswitch_10
        0x6b059645 -> :sswitch_f
        0x6f402493 -> :sswitch_4
        0x748bb714 -> :sswitch_2
        0x76739752 -> :sswitch_d
        0x7a2e5846 -> :sswitch_16
        0x7b33a906 -> :sswitch_19
        0x7b6a165a -> :sswitch_16
    .end sparse-switch
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 21

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

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v15, -0x13d9a161

    sget v16, Ll/֨ᩴ;->ۢ֨ۖ:I

    sget v17, Ll/֡᩺;->ᩴ᩹ۛ:I

    const-string v18, "\u073d\u06d6"

    invoke-static/range {v18 .. v18}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v16

    xor-int v0, v18, v17

    mul-int/lit16 v0, v0, -0x3f65

    const v20, 0x32bf3c45

    xor-int v0, v0, v20

    const v20, -0x6bad67f8

    xor-int v18, v18, v20

    move-object/from16 v20, v3

    move-object v11, v10

    move-object v13, v12

    move/from16 v19, v18

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v18, -0x13d9a161

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v4, v18, v17

    mul-int/lit16 v4, v4, 0x6c1b

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v0, v4

    xor-int v18, v19, v0

    sparse-switch v18, :sswitch_data_0

    const/16 v5, 0x23

    .line 215
    sget v0, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v0, :cond_b

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget v0, Ll/ۨ;->᩺᩷ۚ:I

    if-gez v0, :cond_a

    goto/16 :goto_5

    :sswitch_1
    sget-boolean v0, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v0, :cond_d

    goto/16 :goto_5

    :sswitch_2
    sget v0, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v0, :cond_4

    goto/16 :goto_5

    .line 298
    :sswitch_3
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    goto/16 :goto_5

    :sswitch_4
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    move-object/from16 v0, p0

    .line 376
    invoke-static {v2, v0}, Ll/ۘᩴ;->۟ܳ᩻(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_1

    :sswitch_6
    move-object/from16 v0, p0

    .line 375
    invoke-static {v13, v14, v15, v10}, Ll/ۗۚ;->ۙ۟ܺ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Ll/۠;->ۧ֨ܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "\u1a76\u06eb"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v16

    mul-int/lit8 v4, v4, -0x1b

    xor-int v0, v4, v17

    mul-int/lit16 v0, v0, -0x6a75

    const v19, -0x4f05d052

    xor-int v0, v0, v19

    const v19, 0x8b3f909

    xor-int v19, v4, v19

    goto :goto_0

    :sswitch_7
    const/16 v15, 0x8

    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v0, "\u06dc\u06e2"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x67

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, -0xaaf

    const v19, 0x7a27b3cd

    xor-int v4, v4, v19

    const v19, -0x80c6510

    goto/16 :goto_7

    :sswitch_8
    sget-object v13, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    const/16 v14, 0x2b

    .line 63
    sget v0, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v0, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v0, "\u073d\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x5f

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, -0x732f

    const v19, 0x75f3dda

    xor-int v4, v4, v19

    const v19, -0x1f749f45

    goto/16 :goto_7

    :sswitch_9
    return-object v3

    :sswitch_a
    const/4 v0, 0x7

    .line 374
    invoke-static {v11, v12, v0, v10}, Ll/᩺;->֨ܶ۟([SIII)Ljava/lang/String;

    move-result-object v2

    .line 375
    invoke-static {v1, v2}, Ll/۠;->ۧ֨ܶ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "\u06df\u1a79"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x53

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, -0x1961

    const v19, 0x7fb25914

    xor-int v4, v4, v19

    const v19, 0x4b2f3ef6    # 1.1484918E7f

    goto/16 :goto_7

    :cond_2
    move-object/from16 v3, p0

    :goto_1
    const-string v0, "\u0730\u05ab"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x47

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, -0x4c03

    const v19, 0xda559ad

    xor-int v4, v4, v19

    const v19, -0x6cfe17ad

    goto/16 :goto_7

    :sswitch_b
    const/16 v12, 0x24

    .line 85
    sget-boolean v0, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    const-string v0, "\u06db\u05a8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, -0x1cc7

    const v19, -0x782a26b

    xor-int v4, v4, v19

    const v19, -0x6ade10c3

    goto/16 :goto_7

    .line 374
    :sswitch_c
    invoke-static/range {p0 .. p0}, Ll/֫ܽ;->ۛ֫ۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget-object v11, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    sget v0, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v0, :cond_5

    :cond_4
    :goto_2
    const-string v0, "\u1a79\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x27

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, -0x3d4d

    const v19, -0xa377c3d

    xor-int v4, v4, v19

    const v19, 0x7e8c7be0

    goto/16 :goto_7

    :cond_5
    const-string v0, "\u1a77\u06e2"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, -0x41a7

    const v19, -0x5f665391

    xor-int v4, v4, v19

    const v19, 0x319730e9

    goto/16 :goto_7

    :sswitch_d
    const v0, 0xac2d

    const v10, 0xac2d

    goto :goto_3

    :sswitch_e
    const/16 v0, 0x410a

    const/16 v10, 0x410a

    :goto_3
    const-string v0, "\u05a8\u06db"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, 0x5119

    const v19, -0x6ad89ef2

    xor-int v4, v4, v19

    const v19, -0x61335716

    goto/16 :goto_7

    :sswitch_f
    mul-int v0, v6, v9

    sub-int/2addr v0, v8

    if-lez v0, :cond_6

    const-string v0, "\u073f\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x27

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, 0x6cdd

    const v19, -0x3f197b15

    xor-int v4, v4, v19

    const v19, 0x50771528

    goto/16 :goto_7

    :cond_6
    const-string v0, "\u1a7b\u06e8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x13

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, -0x1491

    const v19, -0x3759d0f3

    xor-int v4, v4, v19

    const v19, 0x2673a74a

    goto/16 :goto_7

    :sswitch_10
    const/16 v9, 0x2e70

    .line 170
    sget v0, Ll/ۛ;->᩺᩻֫:I

    if-ltz v0, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v0, "\u0736\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, 0x57b3

    const v19, -0x53042674

    xor-int v4, v4, v19

    const v19, -0x4566f079

    goto/16 :goto_7

    :sswitch_11
    add-int v0, v6, v7

    mul-int v8, v0, v0

    .line 263
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_6

    :cond_8
    const-string v0, "\u1a75\u073f"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x4f

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, -0x4143

    const v19, 0x67196

    xor-int v4, v4, v19

    const v19, 0x75c3f8aa

    goto/16 :goto_7

    :sswitch_12
    aget-short v6, v20, v5

    const/16 v7, 0xb9c

    sget v0, Ll/۠;->ܺܺܶ:I

    if-ltz v0, :cond_9

    const-string v0, "\u05a1\u06e8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, -0x26a1

    const v19, -0x2f30966a

    xor-int v4, v4, v19

    const v19, 0xf9fc1b

    goto/16 :goto_7

    :cond_9
    const-string v0, "\u1a7a\u1a7a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, 0x21d1

    const v19, 0x3e0f3383

    xor-int v4, v4, v19

    const v19, -0x53a348b0

    goto/16 :goto_7

    :cond_a
    :goto_4
    const-string v0, "\u06e2\u1a74"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x3b

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, 0x4293

    const v19, 0x2f74e777

    xor-int v4, v4, v19

    const v19, -0xb068b5b

    goto/16 :goto_7

    :cond_b
    const-string v0, "\u1a74\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x61

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, 0x447f

    const v19, -0x3cbce28

    xor-int v4, v4, v19

    const v19, 0x1264bed6

    goto :goto_7

    :sswitch_13
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v0

    if-nez v0, :cond_c

    :goto_5
    const-string v0, "\u06dc\u0733"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x3b

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, -0x5763

    const v19, -0x3aa7629

    xor-int v4, v4, v19

    const v19, 0x469739a5

    goto :goto_7

    :cond_c
    const-string v0, "\u1a76\u06dc"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, 0x7bdb

    const v19, 0x5e0f7437

    xor-int v4, v4, v19

    const v19, -0x2d992a5b

    goto :goto_7

    :sswitch_14
    sget-object v20, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    sget-boolean v0, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v0, :cond_e

    :cond_d
    :goto_6
    const-string v0, "\u05ab\u06e2"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, -0x5

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, 0x35a9

    const v19, 0x23500253

    xor-int v4, v4, v19

    const v19, -0x3a333af

    goto :goto_7

    :cond_e
    const-string v0, "\u1a7a\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x61

    xor-int v4, v0, v16

    mul-int/lit16 v4, v4, 0x2fd9

    const v19, 0x159c940    # 4.0000995E-38f

    xor-int v4, v4, v19

    const v19, 0x72debe0

    :goto_7
    xor-int v19, v0, v19

    move v0, v4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e841b21 -> :sswitch_5
        -0x7149ac9f -> :sswitch_0
        -0x6c593e82 -> :sswitch_d
        -0x68dc2503 -> :sswitch_8
        -0x687156b8 -> :sswitch_5
        -0x6355be69 -> :sswitch_10
        -0x619c3e49 -> :sswitch_2
        -0x5d14c186 -> :sswitch_3
        -0x562d2746 -> :sswitch_e
        -0x4c64b065 -> :sswitch_a
        -0x4851c6aa -> :sswitch_6
        -0x4024ee41 -> :sswitch_b
        -0x3ca77e87 -> :sswitch_1
        -0x398efd02 -> :sswitch_f
        -0x388b3eb2 -> :sswitch_1
        -0x2cea99c6 -> :sswitch_3
        -0x2501cb08 -> :sswitch_0
        -0x23b39323 -> :sswitch_12
        -0x18a80c5b -> :sswitch_9
        -0x149fedb5 -> :sswitch_7
        -0x126d33c6 -> :sswitch_13
        -0x5f2ebe3 -> :sswitch_d
        -0x177325b -> :sswitch_b
        -0xa2e517 -> :sswitch_12
        0x3574e3b -> :sswitch_11
        0x105868f9 -> :sswitch_4
        0x15915fce -> :sswitch_f
        0x17c64209 -> :sswitch_8
        0x1b6e2f0d -> :sswitch_a
        0x1bced681 -> :sswitch_c
        0x20aef133 -> :sswitch_13
        0x31c4a8f2 -> :sswitch_c
        0x37d794ee -> :sswitch_11
        0x3b5ac91a -> :sswitch_14
        0x40c22ff3 -> :sswitch_4
        0x49774bcf -> :sswitch_6
        0x4fd19c37 -> :sswitch_9
        0x5a83474a -> :sswitch_14
        0x5d7b7942 -> :sswitch_e
        0x6884ce4d -> :sswitch_2
        0x7368473f -> :sswitch_10
        0x77916aec -> :sswitch_7
    .end sparse-switch
.end method


# virtual methods
.method public final cancelToast()V
    .locals 6

    const v0, -0xfc873c

    sget v1, Ll/ۗۚ;->ܶۛᩴ:I

    sget v2, Ll/ۖ۫;->ۖ֫ܿ:I

    const-string v3, "\u1a78\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4011

    const v5, -0x29537e1a

    xor-int/2addr v4, v5

    const v5, -0x6580e707

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x69df

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 349
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v3

    if-ltz v3, :cond_9

    goto/16 :goto_2

    .line 138
    :sswitch_0
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-lez v3, :cond_1

    goto :goto_1

    .line 171
    :sswitch_1
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v3

    if-nez v3, :cond_6

    goto/16 :goto_3

    .line 223
    :sswitch_2
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v3

    if-ltz v3, :cond_b

    goto :goto_1

    .line 219
    :sswitch_3
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    :goto_1
    const-string v3, "\u06e0\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4ef9

    const v5, 0x505da4c2

    xor-int/2addr v4, v5

    const v5, 0x1f6d8ab1

    goto :goto_0

    .line 345
    :sswitch_4
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    return-void

    .line 94
    :sswitch_5
    new-instance v3, Ll/ᩴۡ᩷;

    .line 456
    sget v4, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const/4 v0, 0x1

    .line 94
    invoke-direct {v3, v0}, Ll/ᩴۡ᩷;-><init>(I)V

    invoke-static {v3}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 191
    :sswitch_6
    sget v3, Ll/۟;->ۗۤۛ:I

    if-eqz v3, :cond_2

    :cond_1
    const-string v3, "\u1a77\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2f91

    const v5, -0x57c65bcb

    xor-int/2addr v4, v5

    const v5, -0x4bbcc3ee

    goto :goto_0

    :cond_2
    const-string v3, "\u06d6\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x523d

    const v5, 0x79acb512

    xor-int/2addr v4, v5

    const v5, 0x669ce164

    goto/16 :goto_0

    .line 131
    :sswitch_7
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v3

    if-ltz v3, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v3, "\u05a1\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4a35

    const v5, 0x328b603c

    xor-int/2addr v4, v5

    const v5, -0x77eb86f0

    goto/16 :goto_0

    .line 244
    :sswitch_8
    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u1a78\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4f1d

    const v5, 0x415d1ec5

    xor-int/2addr v4, v5

    const v5, -0x2406c6ab

    goto/16 :goto_0

    .line 468
    :sswitch_9
    sget v3, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u06ec\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x630f

    const v5, -0x443d169f

    xor-int/2addr v4, v5

    const v5, -0x7349e2ee

    goto/16 :goto_0

    .line 300
    :sswitch_a
    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-nez v3, :cond_7

    :cond_6
    const-string v3, "\u05ab\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5b8b

    const v5, 0x54746929

    xor-int/2addr v4, v5

    const v5, 0xca77828

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e4\u06da"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1ded

    const v5, -0x3e35362

    xor-int/2addr v4, v5

    const v5, -0x6fbe6b65

    goto/16 :goto_0

    .line 180
    :sswitch_b
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v3

    if-gtz v3, :cond_8

    goto :goto_2

    :cond_8
    const-string v3, "\u06dc\u06e4"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x583

    const v5, -0x7420eb98

    xor-int/2addr v4, v5

    const v5, -0x8257522

    goto/16 :goto_0

    :goto_2
    const-string v3, "\u06df\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x31

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2b59

    const v5, 0x5e8d336b

    xor-int/2addr v4, v5

    const v5, 0x7497b12c

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06ec\u06e4"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x31bf

    const v5, -0x1b245230

    xor-int/2addr v4, v5

    const v5, -0x59811440

    goto/16 :goto_0

    .line 45
    :sswitch_c
    sget v3, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v3, :cond_a

    goto :goto_3

    :cond_a
    const-string v3, "\u06eb\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7a07

    const v5, 0x355c630e

    xor-int/2addr v4, v5

    const v5, -0x85a3adf

    goto/16 :goto_0

    .line 484
    :sswitch_d
    sget-object v3, Ll/ܶܳ᩷;->ܳ:Ll/᩶᩻᩷;

    .line 115
    sget-boolean v3, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v3, :cond_c

    :cond_b
    :goto_3
    const-string v3, "\u1a76\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3577

    const v5, -0x64c70c9c

    xor-int/2addr v4, v5

    const v5, 0x58302f4f

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a7b\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2537

    const v5, -0x26c51bc2

    xor-int/2addr v4, v5

    const v5, -0x627753b

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7507571f -> :sswitch_2
        -0x61cdc944 -> :sswitch_b
        -0x50fccf6e -> :sswitch_5
        -0x4a535c8d -> :sswitch_0
        -0x2780f652 -> :sswitch_8
        -0x24620494 -> :sswitch_d
        -0xb57a2a5 -> :sswitch_d
        -0x8cdd6f1 -> :sswitch_3
        -0x8823e04 -> :sswitch_0
        -0x63746c1 -> :sswitch_c
        0x3b079b0 -> :sswitch_6
        0x659e70e -> :sswitch_7
        0xf9fb6a7 -> :sswitch_8
        0x12140767 -> :sswitch_5
        0x13cdfdd7 -> :sswitch_1
        0x147a4c6f -> :sswitch_c
        0x1a2e71b0 -> :sswitch_2
        0x32b17ac5 -> :sswitch_9
        0x365b8bca -> :sswitch_7
        0x3d3ebe22 -> :sswitch_1
        0x4b2873a1 -> :sswitch_4
        0x4bdfbf48 -> :sswitch_b
        0x4fd049e9 -> :sswitch_3
        0x58beb216 -> :sswitch_a
        0x68f6410e -> :sswitch_4
        0x69b6644d -> :sswitch_9
        0x76126bfc -> :sswitch_6
        0x7c7e9902 -> :sswitch_a
    .end sparse-switch
.end method

.method public final getAssetLocalString(Ljava/lang/String;)Lbin/mt/plugin/api/LocalString;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 290
    invoke-virtual {p0, p1}, Ll/ۤ᩻᩷;->֫(Ljava/lang/String;)Ll/᩶᩻᩷;

    move-result-object p1

    return-object p1
.end method

.method public final getAssetsAsStream(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x745b6591

    sget v4, Ll/ۗۚ;->ܶۛᩴ:I

    sget v5, Ll/ۘۨ;->۫᩸۠:I

    const-string v6, "\u06d9\u073d"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x41

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x36ad

    const v8, -0x166cf631

    xor-int/2addr v7, v8

    const v8, -0x45259d7

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, -0x2e75

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    const/4 p1, 0x0

    return-object p1

    .line 21
    :sswitch_0
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget v6, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v6, :cond_a

    goto :goto_2

    :sswitch_1
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v6

    if-lez v6, :cond_6

    goto :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    sget v6, Ll/ۖ۫;->ۖ֫ܿ:I

    if-gez v6, :cond_0

    goto :goto_1

    .line 49
    :sswitch_3
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    invoke-static {}, Ll/۠;->ܿ۠۠()I

    :goto_1
    const-string v6, "\u06dc\u05a1"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1bfd

    const v8, -0x590427f8

    xor-int/2addr v7, v8

    const v8, 0x40ee93ea

    goto :goto_0

    .line 155
    :sswitch_4
    iget-object v0, p0, Ll/ۤ᩻᩷;->᩷:Ll/۫᩻᩷;

    invoke-interface {v0, p1}, Ll/۫᩻᩷;->getAssetsAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1

    .line 76
    :sswitch_5
    iput-object v2, p0, Ll/ۤ᩻᩷;->᩷:Ll/۫᩻᩷;

    .line 77
    new-instance v6, Ll/۬᩻᩷;

    .line 127
    sget v7, Ll/֡۬;->۠֡᩶:I

    if-gtz v7, :cond_1

    :cond_0
    :goto_2
    const-string v6, "\u073d\u1a73"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x74cb

    const v8, 0x5ee68c15

    xor-int/2addr v7, v8

    const v8, 0x4ae0f60e    # 7371527.0f

    goto :goto_0

    .line 77
    :cond_1
    invoke-direct {v6, p0}, Ll/۬᩻᩷;-><init>(Ll/ۤ᩻᩷;)V

    iput-object v6, p0, Ll/ۤ᩻᩷;->ۡ:Ll/֨᩻᩷;

    goto :goto_3

    .line 76
    :sswitch_6
    invoke-static {v1}, Ll/ܽܳ᩷;->֫(Ll/ܽܳ᩷;)Ll/۟ܿ᩷;

    move-result-object v2

    sget v6, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v6, :cond_2

    goto/16 :goto_6

    :cond_2
    const-string v6, "\u06db\u06d9"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x6deb

    const v8, -0x4bcefd5

    xor-int/2addr v7, v8

    const v8, 0x5669990e

    goto/16 :goto_0

    :sswitch_7
    move-object v1, v0

    check-cast v1, Ll/ܽܳ᩷;

    sget v6, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v6, :cond_3

    goto :goto_4

    :cond_3
    const-string v6, "\u073f\u073a"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4477

    const v8, 0x5f7b3524

    xor-int/2addr v7, v8

    const v8, -0x241bf47a

    goto/16 :goto_0

    :sswitch_8
    iget-object v0, p0, Ll/ۤ᩻᩷;->ۢ:Ll/ۨۚ᩷;

    iget-object v0, v0, Ll/ۨۚ᩷;->᩸:Ljava/lang/Object;

    sget v6, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v6, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v6, "\u1a7a\u0730"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x31

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5f4d

    const v8, 0x78f34e90

    xor-int/2addr v7, v8

    const v8, -0x145454c

    goto/16 :goto_0

    .line 74
    :sswitch_9
    iget-object v6, p0, Ll/ۤ᩻᩷;->᩷:Ll/۫᩻᩷;

    if-eqz v6, :cond_5

    :goto_3
    const-string v6, "\u06d7\u06e8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x73

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x19c7

    const v8, -0x55fb5b2f

    xor-int/2addr v7, v8

    const v8, 0x32eea062

    goto/16 :goto_0

    :cond_5
    const-string v6, "\u1a75\u1a76"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x75

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x437

    const v8, -0x849da86

    xor-int/2addr v7, v8

    const v8, -0x4182b8ec

    goto/16 :goto_0

    :sswitch_a
    sget v6, Ll/ۛ;->᩺᩻֫:I

    if-ltz v6, :cond_7

    :cond_6
    :goto_4
    const-string v6, "\u06df\u0730"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x316b

    const v8, -0x5c1a407b

    xor-int/2addr v7, v8

    const v8, -0x4a15b385

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u05a1\u073a"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5bed

    const v8, -0x78bbfe52

    xor-int/2addr v7, v8

    const v8, 0x3d289874

    goto/16 :goto_0

    :sswitch_b
    sget v6, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v6, :cond_8

    goto/16 :goto_6

    :cond_8
    const-string v6, "\u06eb\u06e8"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x55

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7a89

    const v8, 0x13fbf358

    xor-int/2addr v7, v8

    const v8, 0x63afa6ae

    goto/16 :goto_0

    :sswitch_c
    sget v6, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v6, :cond_9

    goto :goto_6

    :cond_9
    const-string v6, "\u06d8\u06da"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0xd57

    const v8, -0x668f08c0

    xor-int/2addr v7, v8

    const v8, -0x51a52d81

    goto/16 :goto_0

    .line 153
    :sswitch_d
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v6

    if-eqz v6, :cond_b

    :cond_a
    :goto_5
    const-string v6, "\u1a79\u06d6"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6d31

    const v8, 0x75b93129

    xor-int/2addr v7, v8

    const v8, -0x4b247831

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u1a73\u06e7"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0xb

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x73af

    const v8, 0x163223ce

    xor-int/2addr v7, v8

    const v8, 0x2ba67d0d

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v6

    if-eqz v6, :cond_c

    goto :goto_6

    :cond_c
    const-string v6, "\u0730\u06d6"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x39

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2e71

    const v8, 0x2366a11f

    xor-int/2addr v7, v8

    const v8, 0x11cec914

    goto/16 :goto_0

    :sswitch_f
    sget v6, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v6, :cond_d

    :goto_6
    const-string v6, "\u073a\u1a73"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x654f

    const v8, 0x4a5f75c5    # 3661169.2f

    xor-int/2addr v7, v8

    const v8, -0x37905486

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u06e4\u1a79"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x4f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7c4d

    const v8, -0x401a03f1

    xor-int/2addr v7, v8

    const v8, 0x12d458d3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x757bc5f2 -> :sswitch_4
        -0x63e20bba -> :sswitch_2
        -0x58be7ad8 -> :sswitch_3
        -0x4f759bbb -> :sswitch_5
        -0x48e1eea6 -> :sswitch_9
        -0x465b2248 -> :sswitch_e
        -0x260fe586 -> :sswitch_f
        -0x2434f428 -> :sswitch_9
        -0x1ee1f2e5 -> :sswitch_8
        -0x593a24e -> :sswitch_3
        0x15824d39 -> :sswitch_5
        0x16f1fdb2 -> :sswitch_b
        0x2127eaad -> :sswitch_e
        0x222bbd51 -> :sswitch_8
        0x25ced8f3 -> :sswitch_0
        0x319e8aa5 -> :sswitch_7
        0x34508296 -> :sswitch_1
        0x3550a5ea -> :sswitch_0
        0x364565ad -> :sswitch_6
        0x3fbfa8f0 -> :sswitch_c
        0x41c1a3a7 -> :sswitch_6
        0x43f5b2d5 -> :sswitch_d
        0x43fb808d -> :sswitch_b
        0x4b5ea398 -> :sswitch_7
        0x5012b723 -> :sswitch_c
        0x523b9aa7 -> :sswitch_1
        0x5309b65f -> :sswitch_2
        0x5342e17b -> :sswitch_a
        0x5ab91b63 -> :sswitch_4
        0x644ec7f8 -> :sswitch_f
        0x79785bcf -> :sswitch_d
        0x7a09159f -> :sswitch_a
    .end sparse-switch
.end method

.method public final getClipboardText()Ljava/lang/CharSequence;
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x5d2438a7

    sget v4, Ll/֫ܿ;->ۨ۫ᩳ:I

    sget v5, Ll/֨ۤ;->ܿۖ᩵:I

    const-string v6, "\u06db\u0730"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x60e3

    const v8, 0x3ff5431

    xor-int/2addr v7, v8

    const v8, 0x12b3fd79

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x42f7

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v6

    if-gtz v6, :cond_2

    goto/16 :goto_3

    .line 343
    :sswitch_0
    sget v6, Ll/֨ۤ;->ܿۖ᩵:I

    if-gez v6, :cond_8

    goto/16 :goto_4

    .line 326
    :sswitch_1
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget-boolean v6, Ll/֨۫;->۬᩷᩶:Z

    if-nez v6, :cond_c

    goto :goto_1

    .line 24
    :sswitch_2
    sget v6, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v6, :cond_a

    goto :goto_1

    .line 101
    :sswitch_3
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    :goto_1
    const-string v6, "\u05a8\u0730"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x7

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7cf3

    const v8, 0x7fd86959

    xor-int/2addr v7, v8

    const v8, 0x2a57ac3c

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    :try_start_0
    const-string v2, ""
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :sswitch_6
    return-object v2

    :sswitch_7
    if-nez v0, :cond_0

    const-string v6, "\u06e1\u1a75"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3087

    const v8, -0x14ca9d64

    xor-int/2addr v7, v8

    const v8, 0xf3177d4

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_2
    const-string v6, "\u1a74\u06da"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0xb25

    const v8, -0x5d5258e6

    xor-int/2addr v7, v8

    const v8, 0x51dc1ced

    goto :goto_0

    .line 407
    :sswitch_8
    invoke-static {v1}, Ll/֡۬;->ܺܽۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 404
    :sswitch_9
    :try_start_1
    invoke-direct {p0}, Ll/ۤ᩻᩷;->֫()Landroid/content/ClipboardManager;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/ClipboardManager;->getText()Ljava/lang/CharSequence;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v6, "\u0730\u1a75"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x243d

    const v8, -0x2176618f

    xor-int/2addr v7, v8

    const v8, 0x16b05c0f

    goto/16 :goto_0

    :catchall_0
    move-exception v1

    const-string v6, "\u1a76\u1a73"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0xe09

    const v8, -0x50119d7e

    xor-int/2addr v7, v8

    const v8, 0x31d26099

    goto/16 :goto_0

    .line 301
    :sswitch_a
    sget v6, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v6, :cond_1

    const-string v6, "\u1a75\u06e4"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x71af

    const v8, -0x2ebcd637

    xor-int/2addr v7, v8

    const v8, 0x2258fc

    goto/16 :goto_0

    :cond_1
    const-string v6, "\u073a\u06e4"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3db3

    const v8, -0x40e810af

    xor-int/2addr v7, v8

    const v8, -0x35291484    # -7042494.0f

    goto/16 :goto_0

    :cond_2
    const-string v6, "\u06e8\u0730"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x63c7

    const v8, 0x366f54f5

    xor-int/2addr v7, v8

    const v8, 0x69950cbd

    goto/16 :goto_0

    .line 309
    :sswitch_b
    sget v6, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v6, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v6, "\u073f\u05ab"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x5b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x67a7

    const v8, -0x1b7e3238

    xor-int/2addr v7, v8

    const v8, -0x12971383

    goto/16 :goto_0

    :sswitch_c
    sget v6, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v6, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v6, "\u06e0\u06df"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x843

    const v8, -0x2dcae701

    xor-int/2addr v7, v8

    const v8, 0x161e0c02

    goto/16 :goto_0

    .line 75
    :sswitch_d
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v6

    if-gtz v6, :cond_5

    goto :goto_3

    :cond_5
    const-string v6, "\u1a79\u1a74"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x35

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x72b7

    const v8, -0x525cf584

    xor-int/2addr v7, v8

    const v8, -0x63d7b958

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_4

    :cond_6
    const-string v6, "\u06e1\u06e7"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5767

    const v8, 0x50938c88

    xor-int/2addr v7, v8

    const v8, -0x771d01de

    goto/16 :goto_0

    .line 38
    :sswitch_f
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v6

    if-ltz v6, :cond_7

    goto :goto_3

    :cond_7
    const-string v6, "\u1a77\u1a76"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x4f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x44e9

    const v8, 0x6a700591

    xor-int/2addr v7, v8

    const v8, 0x2514a75

    goto/16 :goto_0

    .line 373
    :sswitch_10
    sget v6, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v6, :cond_9

    :cond_8
    :goto_3
    const-string v6, "\u06eb\u1a74"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0xd

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3925

    const v8, 0x33c36529

    xor-int/2addr v7, v8

    const v8, 0x60805f11

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u1a76\u06d9"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x27

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x21b1

    const v8, -0x100b7690

    xor-int/2addr v7, v8

    const v8, 0x1e99675b

    goto/16 :goto_0

    .line 185
    :sswitch_11
    sget-boolean v6, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v6, :cond_b

    :cond_a
    :goto_4
    const-string v6, "\u06db\u1a77"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5649

    const v8, 0x63914beb

    xor-int/2addr v7, v8

    const v8, -0x36965cf4

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u06e0\u1a78"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4d7f

    const v8, 0x2b00ed3c

    xor-int/2addr v7, v8

    const v8, 0x41d3942d

    goto/16 :goto_0

    .line 7
    :sswitch_12
    sget v6, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v6, :cond_d

    :cond_c
    const-string v6, "\u06e7\u073a"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x7f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x78f7

    const v8, 0x7cddabc4

    xor-int/2addr v7, v8

    const v8, 0x7348c3df

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u1a73\u06eb"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x55a7

    const v8, -0x169081e9

    xor-int/2addr v7, v8

    const v8, -0x83eb435

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7db662f7 -> :sswitch_5
        -0x7ae25d15 -> :sswitch_1
        -0x740d9088 -> :sswitch_10
        -0x64992d6c -> :sswitch_b
        -0x64375fdd -> :sswitch_7
        -0x62b51639 -> :sswitch_3
        -0x610a565f -> :sswitch_9
        -0x585a07f9 -> :sswitch_11
        -0x54a2e8a1 -> :sswitch_e
        -0x513a2f5c -> :sswitch_2
        -0x25c817aa -> :sswitch_4
        -0x255bcd8f -> :sswitch_1
        -0x21851753 -> :sswitch_d
        -0x1b122b64 -> :sswitch_a
        -0x86a15b8 -> :sswitch_b
        0x59a276d -> :sswitch_d
        0x5fc823c -> :sswitch_6
        0x966279c -> :sswitch_c
        0xbe4b8e5 -> :sswitch_4
        0xc98a252 -> :sswitch_f
        0x10078255 -> :sswitch_e
        0x15f0df82 -> :sswitch_10
        0x19990bc3 -> :sswitch_7
        0x2356059b -> :sswitch_c
        0x2aeed052 -> :sswitch_0
        0x2b717d0f -> :sswitch_5
        0x319ea4af -> :sswitch_f
        0x469082fb -> :sswitch_12
        0x4b22306a -> :sswitch_8
        0x4f59c8ab -> :sswitch_12
        0x5402c7c4 -> :sswitch_0
        0x5911831e -> :sswitch_3
        0x5dbb9779 -> :sswitch_2
        0x60d1b34e -> :sswitch_6
        0x64f4bfd4 -> :sswitch_9
        0x65f28a13 -> :sswitch_8
        0x7a64888f -> :sswitch_a
        0x7aba747a -> :sswitch_11
    .end sparse-switch
.end method

.method public final getCountry()Ljava/lang/String;
    .locals 1

    .line 144
    invoke-static {}, Ll/ܶܳ᩷;->ۧ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getFileLocalString(Ljava/io/File;Ljava/lang/String;)Lbin/mt/plugin/api/LocalString;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const v12, -0x32eeae19

    sget v13, Ll/ۛ;->᩺᩻֫:I

    sget v14, Ll/ۘۛ;->ۖۚ֡:I

    const-string v15, "\u1a78\u073a"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    xor-int v2, v15, v14

    mul-int/lit16 v2, v2, 0x23f1

    const v17, 0x3ae4bf8c

    xor-int v2, v2, v17

    const v17, 0x19d07a24

    xor-int v15, v15, v17

    move-object v7, v6

    move/from16 v16, v15

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const v15, -0x32eeae19

    move-object v6, v5

    move-object v5, v4

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int/2addr v15, v14

    mul-int/lit16 v15, v15, -0x434b

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v2, v15

    xor-int v15, v16, v2

    sparse-switch v15, :sswitch_data_0

    move-object/from16 v17, v7

    move/from16 v18, v9

    move/from16 v19, v10

    move/from16 v16, v15

    move-object/from16 v10, p1

    const v2, 0xc8e9

    const v12, 0xc8e9

    goto/16 :goto_7

    .line 36
    :sswitch_0
    sget-boolean v2, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v2, :cond_0

    :goto_1
    move-object/from16 v17, v7

    move/from16 v18, v9

    move/from16 v19, v10

    move/from16 v16, v15

    move-object/from16 v10, p1

    goto/16 :goto_4

    :cond_0
    move-object/from16 v17, v7

    move/from16 v18, v9

    move/from16 v19, v10

    move/from16 v16, v15

    move-object/from16 v10, p1

    goto/16 :goto_e

    .line 152
    :sswitch_1
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    sget v2, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v17, v7

    move/from16 v18, v9

    move v2, v10

    move/from16 v16, v15

    :goto_2
    move-object/from16 v10, p1

    goto/16 :goto_8

    .line 54
    :sswitch_2
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget v2, Ll/֨᩺;->ۨ֨۬:I

    if-lez v2, :cond_2

    goto :goto_1

    :cond_2
    move/from16 v18, v9

    move/from16 v19, v10

    move/from16 v16, v15

    move-object/from16 v10, p1

    goto/16 :goto_c

    :sswitch_3
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    const/4 v1, 0x0

    return-object v1

    .line 302
    :sswitch_5
    new-instance v2, Ll/᩶᩻᩷;

    move/from16 v16, v15

    .line 47
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 320
    sget v17, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v17, :cond_3

    move-object/from16 v17, v7

    move/from16 v19, v10

    move-object/from16 v10, p1

    goto/16 :goto_a

    :cond_3
    move-object/from16 v17, v7

    .line 47
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v7

    invoke-static {v15, v7}, Ll/ۗ۬;->ۢۗܽ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    sget v7, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v7, :cond_4

    move/from16 v18, v9

    move v2, v10

    goto :goto_2

    .line 47
    :cond_4
    sget-object v7, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    move/from16 v18, v9

    const/16 v9, 0x34

    move/from16 v19, v10

    const/4 v10, 0x1

    invoke-static {v7, v9, v10, v12}, Ll/ۘ᩻;->ۙܺܶ([SIII)Ljava/lang/String;

    move-result-object v7

    sget-boolean v9, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v9, :cond_5

    :goto_3
    move-object/from16 v10, p1

    move/from16 v9, v18

    goto/16 :goto_a

    :cond_5
    invoke-static {v15, v7}, Ll/֨᩺;->ۡ۟ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v15, v1}, Ll/֨᩺;->ۡ۟ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v15}, Ll/֡۬;->ܺܽۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 172
    sget v9, Ll/᩺;->ۙۛܶ:I

    if-gtz v9, :cond_6

    goto :goto_3

    .line 47
    :cond_6
    new-instance v9, Ll/۠᩻᩷;

    move-object/from16 v10, p1

    invoke-direct {v9, v10}, Ll/۠᩻᩷;-><init>(Ljava/io/File;)V

    sget v15, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v15, :cond_7

    :goto_4
    const-string v2, "\u06e2\u06eb"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v14

    mul-int/lit8 v2, v2, 0x19

    xor-int v7, v2, v13

    mul-int/lit16 v7, v7, 0x5211

    const v9, -0xc2c6717

    xor-int/2addr v7, v9

    const v9, -0xb33acbf

    goto/16 :goto_f

    :cond_7
    invoke-direct {v2, v0, v1, v7, v9}, Ll/᩶᩻᩷;-><init>(Ll/ۤ᩻᩷;Ljava/lang/String;Ljava/lang/String;Ll/֨᩻᩷;)V

    .line 303
    new-instance v6, Ljava/lang/ref/SoftReference;

    invoke-direct {v6, v2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 304
    invoke-virtual {v3, v1, v6}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v6, v2

    goto :goto_5

    :sswitch_6
    return-object v6

    :sswitch_7
    move-object/from16 v17, v7

    move/from16 v18, v9

    move/from16 v19, v10

    move/from16 v16, v15

    move-object/from16 v10, p1

    .line 299
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶᩻᩷;

    goto :goto_6

    :sswitch_8
    move-object/from16 v17, v7

    move/from16 v18, v9

    move/from16 v19, v10

    move/from16 v16, v15

    move-object/from16 v10, p1

    if-nez v5, :cond_8

    const-string v2, "\u06df\u1a77"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v13

    mul-int/lit8 v2, v2, -0x29

    xor-int v7, v2, v14

    mul-int/lit16 v7, v7, -0x5813

    const v9, 0x47efd8f2

    xor-int/2addr v7, v9

    const v9, -0x4dfdb176

    goto/16 :goto_f

    :cond_8
    move-object v6, v5

    :goto_5
    const-string v2, "\u0736\u06df"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v7, v2, v13

    mul-int/lit16 v7, v7, 0x2fb1

    const v9, 0x50de2da0

    xor-int/2addr v7, v9

    const v9, 0x7e30c6b3

    goto/16 :goto_f

    :sswitch_9
    move-object/from16 v17, v7

    move/from16 v18, v9

    move/from16 v19, v10

    move/from16 v16, v15

    move-object/from16 v10, p1

    .line 369
    iget-object v3, v0, Ll/ۤ᩻᩷;->ܿ:Ll/ۗ᩵;

    const/4 v2, 0x0

    invoke-virtual {v3, v1, v2}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 296
    check-cast v4, Ljava/lang/ref/Reference;

    if-eqz v4, :cond_9

    const-string v2, "\u06d9\u06d9"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v14

    mul-int/lit8 v2, v2, -0x6f

    xor-int v7, v2, v13

    mul-int/lit16 v7, v7, -0x2cdd

    const v9, 0x5667f637

    xor-int/2addr v7, v9

    const v9, 0x2b063387

    goto/16 :goto_f

    :cond_9
    :goto_6
    move-object v5, v2

    const-string v2, "\u05ab\u06e4"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v13

    mul-int/lit8 v2, v2, 0x7f

    xor-int v7, v2, v14

    mul-int/lit16 v7, v7, -0x59e7

    const v9, -0x2a8330c8

    xor-int/2addr v7, v9

    const v9, -0x7167bbc2

    goto/16 :goto_f

    :sswitch_a
    move-object/from16 v17, v7

    move/from16 v18, v9

    move/from16 v19, v10

    move/from16 v16, v15

    move-object/from16 v10, p1

    const/16 v2, 0x34a6

    const/16 v12, 0x34a6

    :goto_7
    const-string v2, "\u06ec\u06db"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v13

    mul-int/lit8 v2, v2, -0x43

    xor-int v7, v2, v14

    mul-int/lit16 v7, v7, -0x47cb

    const v9, 0x7f95e672

    xor-int/2addr v7, v9

    const v9, -0x2ee40625

    goto/16 :goto_f

    :sswitch_b
    move-object/from16 v17, v7

    move/from16 v18, v9

    move/from16 v19, v10

    move/from16 v16, v15

    move-object/from16 v10, p1

    add-int v2, v8, v11

    mul-int v2, v2, v2

    sub-int v2, v2, v19

    if-gtz v2, :cond_a

    const-string v2, "\u06dc\u073a"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v7, v2, v14

    mul-int/lit16 v7, v7, 0x2d6d

    const v9, -0x5d53924a

    xor-int/2addr v7, v9

    const v9, -0x2a4d08eb

    goto/16 :goto_f

    :cond_a
    const-string v2, "\u1a78\u06e0"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v7, v2, v13

    mul-int/lit16 v7, v7, 0x493d

    const v9, -0x6427e3ec

    xor-int/2addr v7, v9

    const v9, -0x63837ea0

    goto/16 :goto_f

    :sswitch_c
    move-object/from16 v17, v7

    move/from16 v18, v9

    move/from16 v19, v10

    move/from16 v16, v15

    move-object/from16 v10, p1

    const/16 v11, 0x2669

    .line 185
    sget v2, Ll/۟;->ۗۤۛ:I

    if-eqz v2, :cond_b

    move-object/from16 v7, v17

    goto/16 :goto_c

    :cond_b
    const-string v2, "\u1a73\u06e1"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    mul-int/lit8 v2, v2, 0x77

    xor-int v7, v2, v13

    mul-int/lit16 v7, v7, 0x72c3

    const v9, -0x61efb5fd

    xor-int/2addr v7, v9

    const v9, -0x1502b890

    goto/16 :goto_f

    :sswitch_d
    move-object/from16 v10, p1

    move-object/from16 v17, v7

    move/from16 v18, v9

    move/from16 v16, v15

    const v2, 0x5c35711

    add-int v9, v18, v2

    add-int v2, v9, v9

    sget-boolean v7, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v7, :cond_c

    :goto_8
    const-string v7, "\u06eb\u1a77"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v13

    xor-int v9, v7, v14

    mul-int/lit16 v9, v9, -0x7ad7

    const v15, -0x6c9a9e24

    xor-int/2addr v9, v15

    const v15, -0x753e2a00

    goto :goto_9

    :cond_c
    const-string v7, "\u073a\u06db"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v13

    xor-int v9, v7, v14

    mul-int/lit16 v9, v9, 0x63bb

    const v15, 0x555de1c9

    xor-int/2addr v9, v15

    const v15, 0x30f3f639

    :goto_9
    xor-int/2addr v7, v15

    move v10, v2

    move v2, v9

    move/from16 v15, v16

    move/from16 v9, v18

    move/from16 v16, v7

    goto/16 :goto_11

    :sswitch_e
    move-object/from16 v17, v7

    move/from16 v19, v10

    move/from16 v16, v15

    move-object/from16 v10, p1

    const/16 v2, 0x33

    aget-short v8, v17, v2

    mul-int v9, v8, v8

    .line 188
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v2

    if-eqz v2, :cond_d

    :goto_a
    const-string v2, "\u0733\u1a76"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v7, v2, v14

    mul-int/lit16 v7, v7, -0x929

    const v15, 0x3a0cd0a9

    xor-int/2addr v7, v15

    const v15, 0x1a6b42b0

    goto :goto_b

    :cond_d
    const-string v2, "\u06eb\u0733"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v7, v2, v13

    mul-int/lit16 v7, v7, 0x61b

    const v15, -0x3ce68998

    xor-int/2addr v7, v15

    const v15, 0x5c047ca8

    :goto_b
    xor-int/2addr v2, v15

    move/from16 v15, v16

    goto/16 :goto_10

    :sswitch_f
    move/from16 v18, v9

    move/from16 v19, v10

    move/from16 v16, v15

    move-object/from16 v10, p1

    sget-object v7, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    sget v2, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v2, :cond_e

    :goto_c
    const-string v2, "\u06ec\u06e2"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v9, v2, v14

    mul-int/lit16 v9, v9, 0x782f

    const v15, 0xa123e2

    xor-int/2addr v9, v15

    const v15, -0x2599eeb

    goto :goto_d

    :cond_e
    const-string v2, "\u06e7\u06e1"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v13

    mul-int/lit8 v2, v2, 0x17

    xor-int v9, v2, v14

    mul-int/lit16 v9, v9, 0x7c11

    const v15, -0x24254aea

    xor-int/2addr v9, v15

    const v15, 0x3a5cbfa5

    :goto_d
    xor-int/2addr v2, v15

    move/from16 v15, v16

    move/from16 v10, v19

    move/from16 v16, v2

    move v2, v9

    move/from16 v9, v18

    goto/16 :goto_0

    :sswitch_10
    move-object/from16 v17, v7

    move/from16 v18, v9

    move/from16 v19, v10

    move/from16 v16, v15

    move-object/from16 v10, p1

    .line 335
    sget-boolean v2, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v2, :cond_f

    :goto_e
    const-string v2, "\u0733\u0736"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    mul-int/lit8 v2, v2, 0x39

    xor-int v7, v2, v13

    mul-int/lit16 v7, v7, -0x7abb

    const v9, 0x43444c0e

    xor-int/2addr v7, v9

    const v9, 0x4b965af0    # 1.970736E7f

    goto :goto_f

    :cond_f
    const-string v2, "\u06e1\u1a7a"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v7, v2, v13

    mul-int/lit16 v7, v7, -0x70d5

    const v9, 0x51a902b7

    xor-int/2addr v7, v9

    const v9, -0x7ef45db7

    :goto_f
    xor-int/2addr v2, v9

    move/from16 v15, v16

    move/from16 v9, v18

    :goto_10
    move/from16 v10, v19

    move/from16 v16, v2

    move v2, v7

    :goto_11
    move-object/from16 v7, v17

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ef02b85 -> :sswitch_f
        -0x79c87ed6 -> :sswitch_3
        -0x782c2091 -> :sswitch_4
        -0x63c8415d -> :sswitch_7
        -0x5c50d5cd -> :sswitch_d
        -0x521e7eda -> :sswitch_1
        -0x4ff8c6ad -> :sswitch_5
        -0x3be2400c -> :sswitch_6
        -0x2ba8a680 -> :sswitch_9
        -0x223bcf71 -> :sswitch_c
        -0x1d2cfdb3 -> :sswitch_10
        -0x182dfaeb -> :sswitch_f
        -0xf2a2119 -> :sswitch_c
        -0xb1b9e4f -> :sswitch_10
        -0x8a364bc -> :sswitch_0
        -0x7ee6b10 -> :sswitch_b
        -0x11e9f56 -> :sswitch_0
        -0x7e0dc1 -> :sswitch_4
        0x9679cfb -> :sswitch_8
        0x100501d6 -> :sswitch_a
        0x10919c34 -> :sswitch_3
        0x1530d276 -> :sswitch_e
        0x18e9683f -> :sswitch_6
        0x202be52e -> :sswitch_8
        0x210903ed -> :sswitch_1
        0x2576568d -> :sswitch_b
        0x32925a69 -> :sswitch_2
        0x38850c9c -> :sswitch_a
        0x3a024f2d -> :sswitch_5
        0x3adde9e5 -> :sswitch_d
        0x3b436cf5 -> :sswitch_9
        0x4c6c5252 -> :sswitch_7
        0x67f606bb -> :sswitch_2
        0x6a5b00c2 -> :sswitch_e
    .end sparse-switch
.end method

.method public final getFilesDir()Ljava/io/File;
    .locals 7

    const/4 v0, 0x0

    const v1, -0x112ee184

    sget v2, Ll/֡ᩴ;->ܳۤ֫:I

    sget v3, Ll/ۗ۬;->ۘܳ᩻:I

    const-string v4, "\u05ab\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2a1f

    const v6, 0x730dce8e

    xor-int/2addr v5, v6

    const v6, -0x3e824752

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x7cd7

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 72
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    sget v4, Ll/ۛ;->᩺᩻֫:I

    if-ltz v4, :cond_9

    goto/16 :goto_2

    .line 80
    :sswitch_0
    sget v4, Ll/ۗ᩵;->֫۠۟:I

    if-gez v4, :cond_c

    goto/16 :goto_5

    :sswitch_1
    sget-boolean v4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v4, :cond_3

    goto/16 :goto_5

    .line 278
    :sswitch_2
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    goto/16 :goto_5

    :sswitch_3
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    const/4 v0, 0x0

    return-object v0

    .line 319
    :sswitch_4
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۙ()Z

    goto :goto_1

    .line 320
    :sswitch_5
    new-instance v1, Ljava/io/File;

    invoke-static {v0}, Ll/ۗۗ;->ۡۜᩳ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    return-object v1

    .line 318
    :sswitch_6
    invoke-static {v0}, Ll/֨᩺;->᩸ᩴۡ(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "\u1a76\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7cbf

    const v6, 0x789b16cf

    xor-int/2addr v5, v6

    const v6, 0x3e743bab

    goto :goto_0

    :cond_0
    :goto_1
    const-string v4, "\u05ab\u1a73"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x4f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4df3

    const v6, -0x3003e96c

    xor-int/2addr v5, v6

    const v6, -0x25a9832b

    goto :goto_0

    .line 77
    :sswitch_7
    sget v4, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v4, :cond_1

    goto :goto_3

    :cond_1
    const-string v4, "\u1a77\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x40c7

    const v6, -0x510aa973

    xor-int/2addr v5, v6

    const v6, 0x6e3a7d38

    goto :goto_0

    :sswitch_8
    sget v4, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v4, :cond_2

    goto/16 :goto_6

    :cond_2
    const-string v4, "\u06e8\u06ec"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x69

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3a83

    const v6, -0x64b41429

    xor-int/2addr v5, v6

    const v6, -0x44915fe

    goto/16 :goto_0

    .line 233
    :sswitch_9
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v4

    if-gtz v4, :cond_4

    :cond_3
    :goto_2
    const-string v4, "\u06dc\u0730"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1aef

    const v6, -0x3841a5cb

    xor-int/2addr v5, v6

    const v6, -0xaf8633a

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u073d\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1191

    const v6, 0x308d4a65

    xor-int/2addr v5, v6

    const v6, 0x192bfa12

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v4, :cond_5

    :goto_3
    const-string v4, "\u1a76\u06e0"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x54af

    const v6, -0x20616ae2

    xor-int/2addr v5, v6

    const v6, -0xb19d6e5

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06e4\u0730"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x44e5

    const v6, 0x3aef7a83

    xor-int/2addr v5, v6

    const v6, 0x3ba1923f

    goto/16 :goto_0

    .line 78
    :sswitch_b
    sget v4, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v4, :cond_6

    goto :goto_4

    :cond_6
    const-string v4, "\u05a1\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x63

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x67f1

    const v6, 0xb2c7a53

    xor-int/2addr v5, v6

    const v6, 0xa7697d8

    goto/16 :goto_0

    .line 194
    :sswitch_c
    sget-boolean v4, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v4, :cond_7

    goto :goto_5

    :cond_7
    const-string v4, "\u06e0\u05ab"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x579d

    const v6, 0x3f1333cb

    xor-int/2addr v5, v6

    const v6, 0x3b1feaba

    goto/16 :goto_0

    .line 239
    :sswitch_d
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v4

    if-eqz v4, :cond_8

    goto :goto_5

    :cond_8
    const-string v4, "\u06ec\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x957

    const v6, -0x2ded224f

    xor-int/2addr v5, v6

    const v6, -0x49e852aa

    goto/16 :goto_0

    .line 76
    :sswitch_e
    sget v4, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u1a74\u05ab"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3093

    const v6, 0x479a9648    # 79148.56f

    xor-int/2addr v5, v6

    const v6, -0x452398b3    # -0.0016815454f

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06d9\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x67

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1d1f

    const v6, -0x3f47a6cf

    xor-int/2addr v5, v6

    const v6, 0x1c805c5c

    goto/16 :goto_0

    .line 152
    :sswitch_f
    sget-boolean v4, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v4, :cond_b

    :goto_5
    const-string v4, "\u073a\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1c5

    const v6, 0x5dbccfd2

    xor-int/2addr v5, v6

    const v6, 0x79cbc421

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u1a75\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4f21

    const v6, 0x3b4ec8d5

    xor-int/2addr v5, v6

    const v6, -0x4707b944

    goto/16 :goto_0

    .line 318
    :sswitch_10
    iget-object v0, p0, Ll/ۤ᩻᩷;->ᩳ:Ll/ܶ᩵ܿ;

    .line 232
    sget v4, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v4, :cond_d

    :cond_c
    :goto_6
    const-string v4, "\u06e0\u06e1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit8 v5, v5, -0x6d

    const v6, -0x30909027

    xor-int/2addr v5, v6

    const v6, 0x4c2697b7    # 4.367126E7f

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u0733\u1a79"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1643

    const v6, -0x2ed41e9f

    xor-int/2addr v5, v6

    const v6, -0x3bb0e86b

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x71f09f8a -> :sswitch_b
        -0x71d39c7b -> :sswitch_6
        -0x626332b3 -> :sswitch_1
        -0x5ed3f87e -> :sswitch_5
        -0x5da54ea4 -> :sswitch_9
        -0x59ef8ced -> :sswitch_a
        -0x4c593517 -> :sswitch_c
        -0x49a10749 -> :sswitch_4
        -0x3c551cf5 -> :sswitch_d
        -0x2f2f2be8 -> :sswitch_8
        -0x2b6d2352 -> :sswitch_7
        -0x272389fa -> :sswitch_7
        -0x201c8818 -> :sswitch_10
        -0x19c949a5 -> :sswitch_f
        -0x83d4621 -> :sswitch_6
        -0x7987283 -> :sswitch_0
        -0x32cc8f8 -> :sswitch_9
        0x14476db -> :sswitch_5
        0x19666819 -> :sswitch_b
        0x1bd6decb -> :sswitch_2
        0x1c0e2d02 -> :sswitch_4
        0x2324a155 -> :sswitch_1
        0x2548345c -> :sswitch_e
        0x2cf770f1 -> :sswitch_e
        0x2feca3f3 -> :sswitch_c
        0x345e5846 -> :sswitch_3
        0x3b524531 -> :sswitch_8
        0x44a04c32 -> :sswitch_d
        0x5886f195 -> :sswitch_10
        0x5bb266c9 -> :sswitch_3
        0x6cfcb8bd -> :sswitch_2
        0x6d1eed9e -> :sswitch_0
        0x70265e59 -> :sswitch_f
        0x79a49315 -> :sswitch_a
    .end sparse-switch
.end method

.method public final getHostPackageName()Ljava/lang/String;
    .locals 1

    .line 112
    invoke-static {}, Ll/ۙ᩸᩷;->ᩴ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getHostVersionCode()I
    .locals 1

    const v0, 0x18e4545

    return v0
.end method

.method public final getHostVersionName()Ljava/lang/String;
    .locals 16

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0x6c84a94c

    sget v11, Ll/֡ܶ;->ᩴܿ᩸:I

    sget v12, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v13, "\u1a77\u0730"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x1b0b

    const v15, -0x211b196f

    xor-int/2addr v14, v15

    const v15, -0x3fd9ab5b

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v11

    mul-int/lit16 v10, v10, -0x2a8d

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    .line 0
    sget v13, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v13, :cond_8

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    sget v13, Ll/ۗ۬;->ۘܳ᩻:I

    if-lez v13, :cond_3

    goto/16 :goto_5

    :sswitch_1
    sget v13, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-nez v13, :cond_a

    goto/16 :goto_3

    :sswitch_2
    sget v13, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v13, :cond_c

    goto/16 :goto_3

    .line 3
    :sswitch_3
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    goto/16 :goto_3

    .line 0
    :sswitch_4
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/4 v0, 0x7

    .line 0
    invoke-static {v8, v9, v0, v7}, Ll/ۗۚ;->ۙ۟ܺ([SIII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_6
    sget-object v8, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    const/16 v9, 0x36

    .line 1
    sget v13, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v13, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v13, "\u06ec\u073f"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0xbed

    const v15, -0x55200ac9

    xor-int/2addr v14, v15

    const v15, 0x3c3692df

    goto :goto_0

    :sswitch_7
    const/16 v7, 0x78e0

    goto :goto_1

    :sswitch_8
    const/16 v7, 0x2423

    :goto_1
    const-string v13, "\u073f\u06d9"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x1f

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x11c3

    const v15, -0x662f726

    xor-int/2addr v14, v15

    const v15, 0x5bb70e3b

    goto :goto_0

    :sswitch_9
    add-int v13, v5, v6

    add-int/2addr v13, v13

    sub-int v13, v4, v13

    if-lez v13, :cond_1

    const-string v13, "\u06df\u1a74"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x17

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x6fbb

    const v15, 0x297991b3

    xor-int/2addr v14, v15

    const v15, 0x23255fa

    goto/16 :goto_0

    :cond_1
    const-string v13, "\u1a75\u1a73"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x72cb

    const v15, -0x61d0fb53

    xor-int/2addr v14, v15

    const v15, 0x618a78a0

    goto/16 :goto_0

    :sswitch_a
    const v6, 0xcbc96a4

    .line 3
    sget v13, Ll/۠;->ܺܺܶ:I

    if-ltz v13, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v13, "\u1a78\u06e8"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x179

    const v15, 0x1b2484b0

    xor-int/2addr v14, v15

    const v15, 0x601a2c2

    goto/16 :goto_0

    :sswitch_b
    mul-int v4, v3, v3

    mul-int v5, v2, v2

    .line 0
    sget v13, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v13, :cond_4

    :cond_3
    const-string v13, "\u1a73\u06d9"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x1557

    const v15, 0x4329537b

    xor-int/2addr v14, v15

    const v15, -0x140ea9b7

    goto/16 :goto_0

    :cond_4
    const-string v13, "\u06db\u1a79"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x64b

    const v15, 0x4cabd105    # 9.008132E7f

    xor-int/2addr v14, v15

    const v15, -0x1516a352

    goto/16 :goto_0

    :sswitch_c
    add-int/lit16 v3, v2, 0x391a

    .line 4
    sget v13, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v13, :cond_5

    goto :goto_2

    :cond_5
    const-string v13, "\u06da\u0733"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x67

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x925

    const v15, -0x75dafa6d

    xor-int/2addr v14, v15

    const v15, -0x29ed2b22

    goto/16 :goto_0

    :sswitch_d
    aget-short v2, v0, v1

    sget-boolean v13, Ll/֨۫;->۬᩷᩶:Z

    if-nez v13, :cond_6

    goto :goto_2

    :cond_6
    const-string v13, "\u1a75\u06e8"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x1f

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x467

    const v15, -0x1071aca3

    xor-int/2addr v14, v15

    const v15, 0x5fc0553d

    goto/16 :goto_0

    :sswitch_e
    const/16 v1, 0x35

    .line 3
    sget v13, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v13, :cond_7

    :goto_2
    const-string v13, "\u073f\u06ec"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x20f

    const v15, 0x2dc5f7d

    xor-int/2addr v14, v15

    const v15, -0x5e1aeb08

    goto/16 :goto_0

    :cond_7
    const-string v13, "\u073d\u073f"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x49

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x5809

    const v15, -0x4e2d8a5d

    xor-int/2addr v14, v15

    const v15, -0x3e4b173

    goto/16 :goto_0

    :cond_8
    const-string v13, "\u06e2\u073f"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x28e9

    const v15, -0x3f19ea70

    xor-int/2addr v14, v15

    const v15, 0x7bc087c8    # 1.99935E36f

    goto/16 :goto_0

    .line 2
    :sswitch_f
    sget v13, Ll/֡۬;->۠֡᩶:I

    if-gtz v13, :cond_9

    :goto_3
    const-string v13, "\u06e1\u0730"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x71

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x324d

    const v15, -0x79f6274c

    xor-int/2addr v14, v15

    const v15, 0x24295f30

    goto/16 :goto_0

    :cond_9
    const-string v13, "\u06e8\u1a78"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x1eb9

    const v15, 0x6d89d8bc

    xor-int/2addr v14, v15

    const v15, 0x7e11d5e0

    goto/16 :goto_0

    :sswitch_10
    sget v13, Ll/֡֡;->֫ۤܳ:I

    if-ltz v13, :cond_b

    :cond_a
    :goto_4
    const-string v13, "\u1a78\u0733"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x25

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x5735

    const v15, -0x407bf64a

    xor-int/2addr v14, v15

    const v15, 0x28606002

    goto/16 :goto_0

    :cond_b
    const-string v13, "\u1a7a\u1a7a"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x59

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x61fb

    const v15, 0x2f3929f9

    xor-int/2addr v14, v15

    const v15, -0x6379c8a7

    goto/16 :goto_0

    :sswitch_11
    sget-object v0, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    .line 1
    sget-boolean v13, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v13, :cond_d

    :cond_c
    :goto_5
    const-string v13, "\u1a73\u06e8"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0xbdf

    const v15, 0x1e5de44b

    xor-int/2addr v14, v15

    const v15, 0x729290a4

    goto/16 :goto_0

    :cond_d
    const-string v13, "\u0733\u06d6"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x3b

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x5d93

    const v15, -0x2a636620

    xor-int/2addr v14, v15

    const v15, -0x5a2a22f1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b544773 -> :sswitch_8
        -0x6e616f5d -> :sswitch_7
        -0x681eb968 -> :sswitch_9
        -0x65d0504b -> :sswitch_d
        -0x5c93367e -> :sswitch_a
        -0x5b231633 -> :sswitch_c
        -0x567f612b -> :sswitch_10
        -0x524d038e -> :sswitch_3
        -0x4de4b70a -> :sswitch_6
        -0x41559fc3 -> :sswitch_8
        -0x3773f793 -> :sswitch_10
        -0x2f63b6a1 -> :sswitch_b
        -0x2b943f01 -> :sswitch_f
        -0x2675173f -> :sswitch_f
        -0x25872131 -> :sswitch_2
        -0x1ceae6f1 -> :sswitch_5
        -0x15dc7b81 -> :sswitch_e
        -0x1483de19 -> :sswitch_1
        -0x119d211e -> :sswitch_b
        0xe07fc60 -> :sswitch_7
        0xe330f8b -> :sswitch_6
        0x3e06831b -> :sswitch_2
        0x41022e26 -> :sswitch_c
        0x411d2e45 -> :sswitch_4
        0x4640e373 -> :sswitch_4
        0x49257b45 -> :sswitch_3
        0x51c6b016 -> :sswitch_11
        0x62393997 -> :sswitch_0
        0x627f854a -> :sswitch_5
        0x6f484ec3 -> :sswitch_e
        0x72f46739 -> :sswitch_9
        0x769c94f7 -> :sswitch_11
        0x7a11b3a5 -> :sswitch_1
        0x7b0a6d7a -> :sswitch_a
        0x7cd39cfb -> :sswitch_d
        0x7ec6a576 -> :sswitch_0
    .end sparse-switch
.end method

.method public final getLanguage()Ljava/lang/String;
    .locals 1

    .line 139
    invoke-static {}, Ll/ܶܳ᩷;->ܽ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getLanguageCountry()Ljava/lang/String;
    .locals 1

    .line 149
    invoke-static {}, Ll/ܶܳ᩷;->ᩳ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getLanguageNameLocalString()Lbin/mt/plugin/api/LocalString;
    .locals 1

    .line 312
    invoke-static {}, Ll/ܶܳ᩷;->ܿ()Lbin/mt/plugin/api/LocalString;

    move-result-object v0

    return-object v0
.end method

.method public final getLocalString()Lbin/mt/plugin/api/LocalString;
    .locals 18
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

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

    const v11, -0x6194c8dd

    sget v12, Ll/ۘܿ;->ۘܰ۫:I

    sget v13, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v14, "\u06e0\u06d9"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x4365

    const v16, 0xf2fcf60

    xor-int v15, v15, v16

    const v16, 0x30abda70

    xor-int v14, v14, v16

    :goto_0
    xor-int/2addr v11, v13

    mul-int/lit16 v11, v11, 0x7103

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    move-object/from16 v14, p0

    add-int v15, v5, v6

    add-int/2addr v15, v15

    sub-int v15, v4, v15

    if-lez v15, :cond_5

    const-string v15, "\u06d9\u073d"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    mul-int/lit8 v15, v15, -0x6d

    move/from16 v16, v4

    xor-int v4, v15, v12

    mul-int/lit16 v4, v4, -0x4e35

    const v17, -0x1dc922d2

    xor-int v4, v4, v17

    const v17, 0x55de3246

    xor-int v15, v15, v17

    move v14, v15

    move v15, v4

    goto/16 :goto_6

    .line 232
    :sswitch_0
    sget v14, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v14, :cond_1

    :cond_0
    move-object/from16 v14, p0

    move/from16 v17, v3

    move/from16 v16, v4

    goto/16 :goto_8

    :cond_1
    move-object/from16 v14, p0

    move/from16 v17, v3

    move/from16 v16, v4

    goto/16 :goto_9

    :sswitch_1
    sget v14, Ll/֫᩹;->᩶ۘۘ:I

    if-nez v14, :cond_0

    :cond_2
    move-object/from16 v14, p0

    goto/16 :goto_4

    .line 277
    :sswitch_2
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v14

    if-nez v14, :cond_2

    :goto_1
    move-object/from16 v14, p0

    move/from16 v16, v4

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    goto :goto_1

    .line 237
    :sswitch_4
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    const/4 v0, 0x0

    return-object v0

    .line 0
    :sswitch_5
    invoke-static {v8, v9, v10, v7}, Ll/ۖۘ;->۠ܶܿ([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v14, p0

    .line 283
    invoke-virtual {v14, v0}, Ll/ۤ᩻᩷;->֫(Ljava/lang/String;)Ll/᩶᩻᩷;

    move-result-object v0

    return-object v0

    :sswitch_6
    move-object/from16 v14, p0

    .line 18
    sget v15, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v15, :cond_3

    move/from16 v16, v4

    const/4 v10, 0x6

    goto/16 :goto_7

    :cond_3
    const-string v15, "\u1a75\u06e1"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    mul-int/lit8 v15, v15, -0x31

    xor-int v10, v15, v13

    mul-int/lit16 v10, v10, -0x6a1

    const v17, -0xa65db7e

    xor-int v10, v10, v17

    const v17, -0x7aa40240

    xor-int v15, v15, v17

    move v14, v15

    move v15, v10

    const/4 v10, 0x6

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v14, p0

    .line 0
    sget-object v8, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    sget v15, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v15, :cond_4

    move/from16 v17, v3

    move/from16 v16, v4

    const/16 v9, 0x3e

    goto/16 :goto_8

    :cond_4
    const-string v15, "\u073f\u06d6"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    xor-int v9, v15, v12

    mul-int/lit16 v9, v9, 0x1395

    const v17, 0x7293828a

    xor-int v9, v9, v17

    const v17, 0x7041352f

    xor-int v15, v15, v17

    move v14, v15

    move v15, v9

    const/16 v9, 0x3e

    goto/16 :goto_0

    :sswitch_8
    move-object/from16 v14, p0

    const v7, 0xd38a

    goto :goto_2

    :sswitch_9
    move-object/from16 v14, p0

    const/16 v7, 0x568a

    :goto_2
    const-string v15, "\u0733\u06e7"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    move/from16 v16, v7

    xor-int v7, v15, v13

    mul-int/lit16 v7, v7, -0x68c3

    const v17, -0x6697df3a    # -1.20007374E-23f

    xor-int v7, v7, v17

    const v17, 0x177b6d9c

    xor-int v15, v15, v17

    move v14, v15

    move v15, v7

    move/from16 v7, v16

    goto/16 :goto_0

    :cond_5
    move/from16 v16, v4

    const-string v4, "\u06ec\u0730"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v12

    mul-int/lit8 v4, v4, 0x6f

    xor-int v15, v4, v13

    mul-int/lit16 v15, v15, 0x6a65

    const v17, 0x1344d5f4

    xor-int v15, v15, v17

    const v17, 0x9f45e3d

    goto/16 :goto_5

    :sswitch_a
    move-object/from16 v14, p0

    move/from16 v16, v4

    const v6, 0x467c0b9

    .line 131
    sget-boolean v4, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v4, :cond_6

    :goto_3
    const-string v4, "\u0736\u06ec"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v13

    xor-int v15, v4, v12

    mul-int/lit16 v15, v15, 0x7cf1

    const v17, 0x5fd36e3d

    xor-int v15, v15, v17

    const v17, -0x178816b5

    goto/16 :goto_5

    :cond_6
    const-string v4, "\u05ab\u06eb"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v13

    xor-int v15, v4, v12

    mul-int/lit16 v15, v15, -0x2fe5

    const v17, -0x42bdad1d

    xor-int v15, v15, v17

    const v17, 0xec6457d

    goto :goto_5

    :sswitch_b
    move-object/from16 v14, p0

    mul-int v4, v3, v3

    mul-int v5, v2, v2

    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v15

    if-gtz v15, :cond_7

    :goto_4
    const-string v15, "\u06d6\u1a7a"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    move/from16 v17, v3

    xor-int v3, v15, v12

    mul-int/lit16 v3, v3, 0x5f19

    const v16, -0x7aeb297b

    xor-int v3, v3, v16

    const v16, -0x629666c9

    xor-int v15, v15, v16

    move v14, v15

    move v15, v3

    goto/16 :goto_b

    :cond_7
    move/from16 v17, v3

    const-string v3, "\u06e8\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v12

    mul-int/lit8 v3, v3, -0x61

    xor-int v15, v3, v13

    mul-int/lit16 v15, v15, 0x4faf

    const v16, 0x7b61d64

    xor-int v15, v15, v16

    const v16, 0x2857eec0

    xor-int v3, v3, v16

    move v14, v3

    goto/16 :goto_b

    :sswitch_c
    move-object/from16 v14, p0

    move/from16 v16, v4

    add-int/lit16 v3, v2, 0x2195

    sget-boolean v4, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v4, :cond_8

    goto :goto_7

    :cond_8
    const-string v4, "\u073d\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v12

    mul-int/lit8 v4, v4, 0x6d

    xor-int v15, v4, v13

    mul-int/lit16 v15, v15, -0x1e87

    const v17, -0x79473810

    xor-int v15, v15, v17

    const v17, 0x4298ce66

    :goto_5
    xor-int v4, v4, v17

    move v14, v4

    :goto_6
    move/from16 v4, v16

    goto/16 :goto_0

    :sswitch_d
    move-object/from16 v14, p0

    move/from16 v17, v3

    move/from16 v16, v4

    aget-short v2, v0, v1

    .line 271
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v3

    if-eqz v3, :cond_9

    goto/16 :goto_9

    :cond_9
    const-string v3, "\u0733\u06da"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v13, v3

    mul-int/lit8 v3, v3, 0x67

    xor-int v4, v3, v12

    mul-int/lit16 v4, v4, -0x518b

    const v15, -0x18a1899b

    xor-int/2addr v15, v4

    const v4, 0x76ba5311

    goto/16 :goto_a

    :sswitch_e
    move-object/from16 v14, p0

    move/from16 v17, v3

    move/from16 v16, v4

    const/16 v1, 0x3d

    .line 152
    sget v3, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v3, :cond_a

    move/from16 v3, v17

    :goto_7
    const-string v4, "\u06d6\u1a79"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v13

    xor-int v15, v4, v12

    mul-int/lit16 v15, v15, 0xf49

    const v17, -0xff7eb31

    xor-int v15, v15, v17

    const v17, 0x162c1989

    goto :goto_5

    :cond_a
    const-string v3, "\u05a1\u05ab"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v13

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v12

    mul-int/lit16 v4, v4, -0x833

    const v15, -0x40d2e89

    xor-int/2addr v15, v4

    const v4, -0x61fccedd

    goto/16 :goto_a

    :sswitch_f
    move-object/from16 v14, p0

    move/from16 v17, v3

    move/from16 v16, v4

    .line 196
    sget v3, Ll/۠;->ܺܺܶ:I

    if-ltz v3, :cond_b

    goto :goto_8

    :cond_b
    const-string v3, "\u0730\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v12, v3

    mul-int/lit8 v3, v3, -0x43

    xor-int v4, v3, v13

    mul-int/lit16 v4, v4, 0x6069

    const v15, -0x2b3420c7

    xor-int/2addr v15, v4

    const v4, 0x2d2fa41    # 3.1000365E-37f

    goto :goto_a

    :sswitch_10
    move-object/from16 v14, p0

    move/from16 v17, v3

    move/from16 v16, v4

    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v3

    if-eqz v3, :cond_c

    :goto_8
    const-string v3, "\u1a74\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v12

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v13

    mul-int/lit16 v4, v4, -0x4ac9

    const v15, -0x15ce3b6

    xor-int/2addr v15, v4

    const v4, -0x31335442

    goto :goto_a

    :cond_c
    const-string v3, "\u06e0\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v13

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v12

    mul-int/lit16 v4, v4, 0x2c45

    const v15, -0x70fa769c

    xor-int/2addr v15, v4

    const v4, 0x7cbc0d15

    goto :goto_a

    :sswitch_11
    move-object/from16 v14, p0

    move/from16 v17, v3

    move/from16 v16, v4

    sget-object v0, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    sget v3, Ll/۠;->ܺܺܶ:I

    if-ltz v3, :cond_d

    :goto_9
    const-string v3, "\u06da\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v12

    xor-int v4, v3, v13

    mul-int/lit16 v4, v4, 0x1acf

    const v15, -0x4d3ae6e8

    xor-int/2addr v15, v4

    const v4, 0x2a4e7d48

    goto :goto_a

    :cond_d
    const-string v3, "\u06eb\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v12

    xor-int v4, v3, v13

    mul-int/lit16 v4, v4, 0x13f3

    const v15, 0x41672a57

    xor-int/2addr v15, v4

    const v4, 0x25e0cdc3

    :goto_a
    xor-int/2addr v3, v4

    move v14, v3

    move/from16 v4, v16

    :goto_b
    move/from16 v3, v17

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7830d740 -> :sswitch_0
        -0x7031065b -> :sswitch_f
        -0x61ac2da8 -> :sswitch_7
        -0x60df65b0 -> :sswitch_7
        -0x5dea4830 -> :sswitch_1
        -0x5244fe85 -> :sswitch_10
        -0x50c143f9 -> :sswitch_2
        -0x499e2830 -> :sswitch_c
        -0x4876cc54 -> :sswitch_8
        -0x470fefaf -> :sswitch_11
        -0x3b1791fc -> :sswitch_c
        -0x2b2b362c -> :sswitch_5
        -0x1e5df28e -> :sswitch_6
        -0x1b020e9a -> :sswitch_11
        -0xdbd46 -> :sswitch_10
        0x16a9823 -> :sswitch_d
        0x402ac52 -> :sswitch_e
        0xb2e8724 -> :sswitch_8
        0xc8aa879 -> :sswitch_3
        0xf92a6d8 -> :sswitch_2
        0x1639de19 -> :sswitch_9
        0x30748691 -> :sswitch_6
        0x318625ac -> :sswitch_d
        0x4dbbdfe8 -> :sswitch_b
        0x4eda476b -> :sswitch_9
        0x4fb9aa6e -> :sswitch_4
        0x52b494ab -> :sswitch_e
        0x53134712 -> :sswitch_a
        0x5e8ca65a -> :sswitch_3
        0x624430ac -> :sswitch_5
        0x67d9441e -> :sswitch_f
        0x68aef456 -> :sswitch_0
        0x6edd3026 -> :sswitch_1
        0x7994d017 -> :sswitch_4
        0x7b18d79c -> :sswitch_b
        0x7d60ad18 -> :sswitch_a
    .end sparse-switch
.end method

.method public final getPluginId()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ۤ᩻᩷;->᩻:Ljava/lang/String;

    return-object v0
.end method

.method public final getPluginName()Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x7ad27ac7

    sget v3, Ll/ۘۘ;->᩷ۙ᩸:I

    sget v4, Ll/֫ܿ;->ۨ۫ᩳ:I

    const-string v5, "\u06d6\u06d6"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x6d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6e07

    const v7, 0x5cb9d5a9

    xor-int/2addr v6, v7

    const v7, -0x4a96b3ef

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x166b

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    sget v5, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v5, :cond_4

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    sget v5, Ll/֨۟;->᩹֫᩷:I

    if-eqz v5, :cond_c

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    sget v5, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v5, :cond_5

    goto :goto_1

    :sswitch_2
    sget v5, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v5, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v5, "\u06e7\u05ab"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4309

    const v7, -0x17dc950

    xor-int/2addr v6, v7

    const v7, -0x1c007f0f

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    goto/16 :goto_3

    .line 37
    :sswitch_4
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    return-object v1

    .line 183
    :sswitch_6
    invoke-static {p0, v0}, Ll/֫ۡ;->᩻ۢۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v5, "\u0730\u06d6"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x65a3

    const v7, -0x1d335ed9

    xor-int/2addr v6, v7

    const v7, -0x34f21eb1    # -9298255.0f

    goto :goto_0

    :sswitch_7
    const/4 v5, 0x1

    .line 0
    invoke-static {v5, v0}, Ll/֨ۡ;->ۤ۠᩷(ILjava/lang/Object;)C

    move-result v5

    const/16 v6, 0x7d

    if-ne v5, v6, :cond_1

    const-string v5, "\u1a79\u073f"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x412d

    const v7, 0x69c78fdc

    xor-int/2addr v6, v7

    const v7, 0x6228bb91

    goto :goto_0

    :sswitch_8
    const/4 v5, 0x0

    .line 182
    invoke-static {v0, v5}, Ll/֫ۡ;->ܰ᩷ܺ(Ljava/lang/Object;I)C

    move-result v5

    const/16 v6, 0x7b

    if-ne v5, v6, :cond_1

    const-string v5, "\u1a7b\u06dc"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x2d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4f67

    const v7, 0x16bba3b6

    xor-int/2addr v6, v7

    const v7, 0x4e3b8f48    # 7.8668237E8f

    goto/16 :goto_0

    :sswitch_9
    return-object v0

    :sswitch_a
    invoke-static {v0}, Ll/֨֫;->ۡۚܽ(Ljava/lang/Object;)I

    move-result v5

    const/4 v6, 0x3

    if-lt v5, v6, :cond_1

    const-string v5, "\u1a79\u06e7"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xed7

    const v7, 0x4a4fde77    # 3405725.8f

    xor-int/2addr v6, v7

    const v7, -0x71a002ce

    goto/16 :goto_0

    :cond_1
    const-string v5, "\u1a73\u06e0"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x5f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x33b9

    const v7, 0x70c2630a

    xor-int/2addr v6, v7

    const v7, -0x29f4a4ac

    goto/16 :goto_0

    .line 28
    :sswitch_b
    sget v5, Ll/֡۬;->۠֡᩶:I

    if-gtz v5, :cond_2

    const-string v5, "\u1a73\u06e4"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6075

    const v7, -0x52723b74

    xor-int/2addr v6, v7

    const v7, 0x612bb2ae

    goto/16 :goto_0

    :cond_2
    const-string v5, "\u0736\u06df"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x63

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x580f

    const v7, 0x2aa95d0a

    xor-int/2addr v6, v7

    const v7, -0x4cf0f95c

    goto/16 :goto_0

    .line 32
    :sswitch_c
    sget-boolean v5, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v5, :cond_3

    goto :goto_2

    :cond_3
    const-string v5, "\u06db\u0730"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x3b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xdb

    const v7, -0xb63b4db

    xor-int/2addr v6, v7

    const v7, 0xe8cfb4c

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u06da\u05a1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x66e7

    const v7, -0x154f315

    xor-int/2addr v6, v7

    const v7, -0x30e1314c

    goto/16 :goto_0

    .line 96
    :sswitch_d
    sget v5, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v5, :cond_6

    :cond_5
    :goto_2
    const-string v5, "\u06e4\u06eb"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x13

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x73eb

    const v7, 0x7c9da9b7

    xor-int/2addr v6, v7

    const v7, -0xbe9d7fc

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u06d7\u0733"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5b6b

    const v7, -0x78ac88ea

    xor-int/2addr v6, v7

    const v7, -0x3471f8c9    # -1.8615918E7f

    goto/16 :goto_0

    .line 57
    :sswitch_e
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v5

    if-nez v5, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v5, "\u073f\u06d7"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7cb9

    const v7, 0x7efd5c25

    xor-int/2addr v6, v7

    const v7, 0x421348cc

    goto/16 :goto_0

    :sswitch_f
    sget v5, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v5, :cond_8

    goto :goto_3

    :cond_8
    const-string v5, "\u05a1\u06e7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1f83

    const v7, 0x428ff5b2

    xor-int/2addr v6, v7

    const v7, -0x30212e09

    goto/16 :goto_0

    .line 140
    :sswitch_10
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v5

    if-eqz v5, :cond_9

    goto :goto_3

    :cond_9
    const-string v5, "\u06e8\u1a77"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x73

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x45d1

    const v7, -0x280f8a22

    xor-int/2addr v6, v7

    const v7, 0x5ba6272

    goto/16 :goto_0

    .line 79
    :sswitch_11
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v5

    if-ltz v5, :cond_a

    :goto_3
    const-string v5, "\u05ab\u05a8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xccf

    const v7, 0x3271f381

    xor-int/2addr v6, v7

    const v7, 0x5a9436da

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06ec\u1a76"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x1d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x30f3

    const v7, 0x7d0db103

    xor-int/2addr v6, v7

    const v7, -0x27470734

    goto/16 :goto_0

    .line 67
    :sswitch_12
    sget v5, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v5, :cond_b

    goto :goto_4

    :cond_b
    const-string v5, "\u06e2\u06dc"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3c7d

    const v7, -0x293a92ce

    xor-int/2addr v6, v7

    const v7, 0x6018faea

    goto/16 :goto_0

    .line 182
    :sswitch_13
    iget-object v0, p0, Ll/ۤ᩻᩷;->ۜ:Ljava/lang/String;

    sget v5, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v5, :cond_d

    :cond_c
    :goto_4
    const-string v5, "\u06d9\u1a76"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x71ab

    const v7, -0x70c61047

    xor-int/2addr v6, v7

    const v7, -0xe1d24c7

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06d6\u1a7a"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4993

    const v7, 0x79170f3c

    xor-int/2addr v6, v7

    const v7, -0xe28f984

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c779390 -> :sswitch_8
        -0x75947b4e -> :sswitch_10
        -0x74afb086 -> :sswitch_b
        -0x6b6018c3 -> :sswitch_11
        -0x6b257f8c -> :sswitch_9
        -0x6a50b66e -> :sswitch_0
        -0x66e3433c -> :sswitch_13
        -0x64023f5a -> :sswitch_e
        -0x60d15f22 -> :sswitch_5
        -0x5c29f7e0 -> :sswitch_c
        -0x5a3e6e4d -> :sswitch_1
        -0x5a0bb3d1 -> :sswitch_12
        -0x55afe90c -> :sswitch_b
        -0x51ecbd96 -> :sswitch_4
        -0x4a9b890c -> :sswitch_7
        -0x496b91a7 -> :sswitch_d
        -0x3a761539 -> :sswitch_1
        -0x3a6001eb -> :sswitch_13
        -0x354822ec -> :sswitch_2
        -0x25809d75 -> :sswitch_8
        -0x22feb28c -> :sswitch_f
        -0x223cc64d -> :sswitch_a
        -0x1c6898f0 -> :sswitch_6
        -0xf105ee0 -> :sswitch_e
        -0xcca3f9e -> :sswitch_2
        -0x949d0f7 -> :sswitch_12
        -0x8001d19 -> :sswitch_0
        -0x978fe1 -> :sswitch_9
        0x36840c2 -> :sswitch_4
        0xe41ed6e -> :sswitch_d
        0x13031f55 -> :sswitch_f
        0x17789ab8 -> :sswitch_3
        0x2a5f0066 -> :sswitch_3
        0x36082440 -> :sswitch_6
        0x3aadacfe -> :sswitch_a
        0x3b99d55e -> :sswitch_c
        0x49a5c86f -> :sswitch_11
        0x528cbb0d -> :sswitch_5
        0x583852af -> :sswitch_7
        0x5f56b4d5 -> :sswitch_10
    .end sparse-switch
.end method

.method public final getPluginSdkVersion()I
    .locals 1

    .line 97
    iget v0, p0, Ll/ۤ᩻᩷;->ۖ:I

    return v0
.end method

.method public final getPluginVersionCode()I
    .locals 1

    .line 102
    iget v0, p0, Ll/ۤ᩻᩷;->ᩴ:I

    return v0
.end method

.method public final getPluginVersionName()Ljava/lang/String;
    .locals 1

    .line 107
    iget-object v0, p0, Ll/ۤ᩻᩷;->᩵:Ljava/lang/String;

    return-object v0
.end method

.method public final getPreferences()Landroid/content/SharedPreferences;
    .locals 2

    .line 127
    iget-object v0, p0, Ll/ۤ᩻᩷;->ۘ:Landroid/content/SharedPreferences;

    if-nez v0, :cond_1

    move-object v0, p0

    .line 128
    monitor-enter v0

    .line 129
    :try_start_0
    iget-object v1, p0, Ll/ۤ᩻᩷;->ۘ:Landroid/content/SharedPreferences;

    if-nez v1, :cond_0

    .line 130
    iget-object v1, p0, Ll/ۤ᩻᩷;->ܺ:Ll/ܰܿ᩷;

    iget-object v1, v1, Ll/ܰܿ᩷;->᩸:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    .line 168
    invoke-static {v1}, Ll/۬ܿ᩷;->ܿ(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 130
    iput-object v1, p0, Ll/ۤ᩻᩷;->ۘ:Landroid/content/SharedPreferences;

    .line 132
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 134
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/ۤ᩻᩷;->ۘ:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public final getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 18

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, 0x4a3cadf3    # 3091324.8f

    sget v11, Ll/ۗ᩶;->ۛ֨ۘ:I

    sget v12, Ll/֫᩵;->ܶ᩻᩷:I

    const-string v13, "\u1a79\u0733"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x3d

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x155b

    const v15, -0x7b8f0f2

    xor-int/2addr v14, v15

    const v15, -0x281c71b5

    :goto_0
    xor-int/2addr v13, v15

    :goto_1
    xor-int/2addr v10, v11

    mul-int/lit16 v10, v10, -0x33a3

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    move-object/from16 v14, p1

    const/16 v2, 0x44

    .line 183
    sget-boolean v13, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v13, :cond_c

    goto/16 :goto_5

    .line 1
    :sswitch_0
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v13

    if-nez v13, :cond_0

    :goto_2
    move-object/from16 v14, p1

    goto/16 :goto_6

    :cond_0
    move-object/from16 v14, p1

    goto/16 :goto_7

    .line 102
    :sswitch_1
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v13

    if-gtz v13, :cond_1

    goto :goto_3

    :cond_1
    move-object/from16 v14, p1

    goto/16 :goto_5

    .line 18
    :sswitch_2
    sget-boolean v13, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v13, :cond_4

    goto :goto_2

    .line 172
    :sswitch_3
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    goto :goto_2

    :sswitch_4
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    const/4 v0, 0x0

    :sswitch_5
    return-object v0

    .line 230
    :sswitch_6
    new-instance v13, Ljava/lang/IllegalArgumentException;

    sget-object v14, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    .line 225
    sget-boolean v15, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v15, :cond_2

    goto :goto_3

    :cond_2
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v16

    if-nez v16, :cond_3

    goto :goto_3

    :cond_3
    const/16 v15, 0x12

    sget-boolean v17, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v17, :cond_5

    :cond_4
    :goto_3
    const-string v13, "\u073d\u0730"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x7d77

    const v15, 0x2df84941

    xor-int/2addr v14, v15

    const v15, 0x7b20bf14

    goto :goto_0

    :cond_5
    const/16 v0, 0x45

    .line 230
    invoke-static {v14, v0, v15, v9}, Ll/ۙۨ;->֡ᩳ᩵([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v14, p1

    invoke-static {v0, v14}, Ll/ۗۗ;->᩵᩷ܳ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v13, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v13

    :sswitch_7
    move-object/from16 v14, p1

    .line 228
    invoke-static/range {p0 .. p1}, Ll/֨֫;->֡ۢ֨(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    const-string v13, "\u06d8\u0730"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x3f

    xor-int v15, v13, v12

    mul-int/lit16 v15, v15, 0x2f91

    const v16, 0x38a420d1

    xor-int v15, v15, v16

    const v16, 0x3d8ea8e9

    goto/16 :goto_8

    :cond_6
    const-string v13, "\u0733\u1a74"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x11

    xor-int v15, v13, v11

    mul-int/lit16 v15, v15, -0x7a57

    const v16, -0x7bd247a0

    xor-int v15, v15, v16

    const v16, 0x5d1fd3e2

    goto/16 :goto_8

    :sswitch_8
    move-object/from16 v14, p1

    const v9, 0x96a8

    goto :goto_4

    :sswitch_9
    move-object/from16 v14, p1

    const v9, 0xc1fb

    :goto_4
    const-string v13, "\u05ab\u05a8"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v15, v13, v11

    mul-int/lit16 v15, v15, 0x69f

    const v16, 0x1f038865

    xor-int v15, v15, v16

    const v16, -0x2cbab6c5

    goto/16 :goto_8

    :sswitch_a
    move-object/from16 v14, p1

    add-int v13, v7, v8

    add-int/2addr v13, v13

    sub-int v13, v6, v13

    if-lez v13, :cond_7

    const-string v13, "\u05ab\u06eb"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0xb

    xor-int v15, v13, v12

    mul-int/lit16 v15, v15, 0x4e7b

    const v16, 0x38874335

    xor-int v15, v15, v16

    const v16, -0x66e28a57

    goto/16 :goto_8

    :cond_7
    const-string v13, "\u0733\u06ec"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v15, v13, v12

    mul-int/lit16 v15, v15, -0x52bb

    const v16, -0x5230fc7

    xor-int v15, v15, v16

    const v16, 0x412723b9

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v14, p1

    const v8, 0x5aad611

    sget v13, Ll/۠;->ܺܺܶ:I

    if-ltz v13, :cond_8

    goto/16 :goto_6

    :cond_8
    const-string v13, "\u1a7a\u06db"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v15, v13, v11

    mul-int/lit16 v15, v15, -0x5a13

    const v16, 0x6198d83e

    xor-int v15, v15, v16

    const v16, 0x2f1666e7

    goto/16 :goto_8

    :sswitch_c
    move-object/from16 v14, p1

    mul-int v6, v5, v5

    mul-int v7, v3, v3

    .line 49
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v13

    if-gtz v13, :cond_9

    goto/16 :goto_6

    :cond_9
    const-string v13, "\u06d8\u073a"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v15, v13, v12

    mul-int/lit16 v15, v15, 0x64a5

    const v16, 0x48785f2b

    xor-int v15, v15, v16

    const v16, -0x43e9556a

    goto/16 :goto_8

    :sswitch_d
    move-object/from16 v14, p1

    add-int v5, v3, v4

    .line 76
    sget v13, Ll/᩹;->ۤܿܳ:I

    if-eqz v13, :cond_a

    const-string v13, "\u06df\u1a74"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v15, v13, v11

    mul-int/lit16 v15, v15, -0x13d7

    const v16, 0x5d9ab3e6

    xor-int v15, v15, v16

    const v16, -0x39223975

    goto/16 :goto_8

    :cond_a
    const-string v13, "\u06eb\u1a78"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x27

    xor-int v15, v13, v11

    mul-int/lit16 v15, v15, -0x492b

    const v16, 0x2b1c146f

    xor-int v15, v15, v16

    const v16, 0x33487396

    goto/16 :goto_8

    :sswitch_e
    move-object/from16 v14, p1

    aget-short v3, v1, v2

    const/16 v4, 0x2617

    sget v13, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v13, :cond_b

    goto/16 :goto_7

    :cond_b
    const-string v13, "\u05a1\u1a75"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v15, v13, v11

    mul-int/lit16 v15, v15, 0x6bb3

    const v16, 0x1c5dd4bc

    xor-int v15, v15, v16

    const v16, 0x102ddb35

    goto/16 :goto_8

    :goto_5
    const-string v13, "\u06da\u06e8"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v15, v13, v12

    mul-int/lit16 v15, v15, -0x31db

    const v16, -0x5442a4eb

    xor-int v15, v15, v16

    const v16, 0x659ca058

    goto/16 :goto_8

    :cond_c
    const-string v13, "\u06e1\u06e7"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, 0x7d

    xor-int v15, v13, v12

    mul-int/lit16 v15, v15, -0x1207

    const v16, 0x2c362960

    xor-int v15, v15, v16

    const v16, -0x18b10b2b

    goto :goto_8

    :sswitch_f
    move-object/from16 v14, p1

    sget-object v1, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    .line 117
    sget v13, Ll/᩺;->ۙۛܶ:I

    if-gtz v13, :cond_d

    :goto_6
    const-string v13, "\u06e0\u1a77"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x49

    xor-int v15, v13, v12

    mul-int/lit16 v15, v15, 0xf97

    const v16, 0x75d67933

    xor-int v15, v15, v16

    const v16, -0x15b5a41f

    goto :goto_8

    :cond_d
    const-string v13, "\u06d6\u06e2"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v15, v13, v12

    mul-int/lit16 v15, v15, -0x47cb

    const v16, -0x5c909b45

    xor-int v15, v15, v16

    const v16, 0x3fa40771

    goto :goto_8

    :sswitch_10
    move-object/from16 v14, p1

    .line 161
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v13

    if-gtz v13, :cond_e

    :goto_7
    const-string v13, "\u1a77\u05a1"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v15, v13, v11

    mul-int/lit16 v15, v15, 0x3163

    const v16, -0x36ad22c9

    xor-int v15, v15, v16

    const v16, -0x4df4dd92

    goto :goto_8

    :cond_e
    const-string v13, "\u0736\u1a75"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v15, v13, v11

    mul-int/lit16 v15, v15, -0x16d5

    const v16, 0x19a53517

    xor-int v15, v15, v16

    const v16, -0x7371f073

    :goto_8
    xor-int v13, v13, v16

    move v14, v15

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7a108c1b -> :sswitch_7
        -0x78d85cde -> :sswitch_2
        -0x7694719a -> :sswitch_2
        -0x76274cd3 -> :sswitch_8
        -0x708afb64 -> :sswitch_10
        -0x6f885983 -> :sswitch_0
        -0x63b1f460 -> :sswitch_6
        -0x58a7b4f2 -> :sswitch_e
        -0x5613e226 -> :sswitch_b
        -0x522fcf30 -> :sswitch_9
        -0x49a85205 -> :sswitch_9
        -0x25db860f -> :sswitch_f
        -0x1b5d6819 -> :sswitch_1
        0xb11a54 -> :sswitch_c
        0x143e64b -> :sswitch_5
        0xe105f49 -> :sswitch_4
        0x102d5811 -> :sswitch_a
        0x22362f1b -> :sswitch_d
        0x256fa3e2 -> :sswitch_f
        0x2d8ad704 -> :sswitch_3
        0x3112839b -> :sswitch_1
        0x44a36fed -> :sswitch_0
        0x46879c42 -> :sswitch_d
        0x487d63b9 -> :sswitch_8
        0x50e18484 -> :sswitch_b
        0x529f63c2 -> :sswitch_6
        0x53e9adf7 -> :sswitch_e
        0x572e99e5 -> :sswitch_3
        0x691318cf -> :sswitch_10
        0x69ceea92 -> :sswitch_7
        0x6d41c301 -> :sswitch_5
        0x7671e221 -> :sswitch_c
        0x783cf03e -> :sswitch_4
        0x79bfd2c5 -> :sswitch_a
    .end sparse-switch
.end method

.method public final varargs getString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    const v0, 0x3cf97b43

    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    sget v2, Ll/ۘۨ;->۫᩸۠:I

    const-string v3, "\u0736\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0xd

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5c67

    const v5, -0x65f9b254

    xor-int/2addr v4, v5

    const v5, -0x155aac37

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x1fe7

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 238
    invoke-virtual {p0, p1}, Ll/ۤ᩻᩷;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Ll/ۤ᩻᩷;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 134
    :sswitch_0
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    sget-boolean v3, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v3, :cond_2

    goto/16 :goto_1

    .line 191
    :sswitch_1
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v3

    if-lez v3, :cond_a

    goto/16 :goto_3

    .line 225
    :sswitch_2
    sget v3, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v3, :cond_6

    goto/16 :goto_3

    .line 139
    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    const/4 p1, 0x0

    return-object p1

    .line 220
    :sswitch_5
    sget v3, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v3, :cond_0

    const-string v3, "\u0736\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3977

    const v5, -0xbe4a691

    xor-int/2addr v4, v5

    const v5, 0x6f65fcca

    goto :goto_0

    :cond_0
    const-string v3, "\u073a\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2e5b

    const v5, -0x4b9462aa

    xor-int/2addr v4, v5

    const v5, -0x2d01e2fd

    goto :goto_0

    :sswitch_6
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u06d8\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x481

    const v5, 0x3f02fe49

    xor-int/2addr v4, v5

    const v5, 0x2de2e3be

    goto :goto_0

    .line 158
    :sswitch_7
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_2
    const-string v3, "\u1a78\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x56bd

    const v5, 0x3a093026

    xor-int/2addr v4, v5

    const v5, -0xda3cf0b

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u1a73\u06e2"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xe97

    const v5, -0x433619df

    xor-int/2addr v4, v5

    const v5, 0x350ecfb

    goto/16 :goto_0

    .line 195
    :sswitch_8
    sget v3, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    const-string v3, "\u1a74\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x17a9

    const v5, -0x1d5be9e

    xor-int/2addr v4, v5

    const v5, -0x2a406a15

    goto/16 :goto_0

    .line 99
    :sswitch_9
    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u1a74\u1a76"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5e8f

    const v5, -0xce63baf

    xor-int/2addr v4, v5

    const v5, 0x2bf5ea91

    goto/16 :goto_0

    .line 152
    :sswitch_a
    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v3, :cond_7

    :cond_6
    :goto_1
    const-string v3, "\u1a7b\u06df"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xa23

    const v5, 0x41996f86

    xor-int/2addr v4, v5

    const v5, -0x33fec907    # -3.3872868E7f

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u0733\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2cdb

    const v5, 0x1e71f1ae

    xor-int/2addr v4, v5

    const v5, 0x309aab53

    goto/16 :goto_0

    .line 178
    :sswitch_b
    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u06e1\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x489

    const v5, 0xd9b339    # 1.9992596E-38f

    xor-int/2addr v4, v5

    const v5, 0x2c097d81

    goto/16 :goto_0

    .line 162
    :sswitch_c
    sget v3, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v3, :cond_9

    goto :goto_2

    :cond_9
    const-string v3, "\u06ec\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1e3d

    const v5, -0x5264d7a7

    xor-int/2addr v4, v5

    const v5, 0x3bddb566

    goto/16 :goto_0

    .line 96
    :sswitch_d
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v3

    if-nez v3, :cond_b

    :cond_a
    :goto_2
    const-string v3, "\u1a73\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5e2f

    const v5, -0x4948ec64

    xor-int/2addr v4, v5

    const v5, -0x32b4e40a

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u073a\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xc33

    const v5, 0xd44ad7

    xor-int/2addr v4, v5

    const v5, 0x1f653e0d

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v3, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v3, :cond_c

    :goto_3
    const-string v3, "\u1a75\u06e7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x57db

    const v5, 0x31a72f05

    xor-int/2addr v4, v5

    const v5, -0x5bc4a08c

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u0730\u06da"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5521

    const v5, 0x61bb5a1c

    xor-int/2addr v4, v5

    const v5, -0x4036cd35

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c0e1856 -> :sswitch_9
        -0x7acd655d -> :sswitch_2
        -0x6d0eab63 -> :sswitch_4
        -0x63aea70a -> :sswitch_0
        -0x5cbca2c7 -> :sswitch_2
        -0x5a6af314 -> :sswitch_d
        -0x5331f1bc -> :sswitch_e
        -0x4d737ef4 -> :sswitch_4
        -0x35157818 -> :sswitch_a
        -0x32ea7dfa -> :sswitch_8
        -0xfa85179 -> :sswitch_8
        0x3d02f4b -> :sswitch_b
        0x7d97a0e -> :sswitch_e
        0x207f9a70 -> :sswitch_3
        0x2ae12b28 -> :sswitch_3
        0x37a4610c -> :sswitch_7
        0x39ac8018 -> :sswitch_0
        0x3a0232ef -> :sswitch_a
        0x3b757cf7 -> :sswitch_6
        0x494591ba -> :sswitch_b
        0x49ac425b -> :sswitch_c
        0x4ac6e270 -> :sswitch_d
        0x52efd7ad -> :sswitch_1
        0x559a4c93 -> :sswitch_6
        0x5cebc21a -> :sswitch_5
        0x5dd317d5 -> :sswitch_c
        0x6653d7fd -> :sswitch_9
        0x70a357ae -> :sswitch_7
        0x762448c8 -> :sswitch_1
        0x7c5fa8b7 -> :sswitch_5
    .end sparse-switch
.end method

.method public final varargs getStringArray([Ljava/lang/String;)[Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x68799207

    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    sget v4, Ll/ۗ᩷;->᩸᩺ᩳ:I

    const-string v5, "\u06e1\u073d"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x49

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5b9b

    const v7, 0x4697b92c

    xor-int/2addr v6, v7

    const v7, 0x67968b1e

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x4e63

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 251
    aget-object v1, p1, v0

    invoke-virtual {p0, v1}, Ll/ۤ᩻᩷;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 139
    sget v5, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v5, :cond_2

    goto/16 :goto_2

    .line 143
    :sswitch_0
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v5

    if-ltz v5, :cond_7

    goto/16 :goto_2

    .line 72
    :sswitch_1
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v5, "\u05a8\u1a73"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3bef

    const v7, 0x5eaa8e4b

    xor-int/2addr v6, v7

    const v7, 0x3795f07c

    goto :goto_0

    .line 62
    :sswitch_2
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    sget v5, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v5, :cond_b

    goto/16 :goto_2

    .line 114
    :sswitch_3
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    goto/16 :goto_2

    .line 85
    :sswitch_4
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    const/4 p1, 0x0

    return-object p1

    :sswitch_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 251
    :sswitch_6
    aput-object v1, p1, v0

    sget v5, Ll/۠;->ܺܺܶ:I

    if-ltz v5, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v5, "\u1a7b\u06d6"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1979

    const v7, -0xe498d2f

    xor-int/2addr v6, v7

    const v7, -0x6d9b01b0

    goto :goto_0

    :cond_2
    const-string v5, "\u1a7a\u1a7a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0xd

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3f37

    const v7, -0x29171d0a

    xor-int/2addr v6, v7

    const v7, 0x13e5d648

    goto/16 :goto_0

    :sswitch_7
    return-object p1

    .line 250
    :sswitch_8
    array-length v5, p1

    if-ge v0, v5, :cond_3

    const-string v5, "\u06e0\u0733"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1f19

    const v7, -0x729b3221

    xor-int/2addr v6, v7

    const v7, -0x3e454763

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u0733\u06e1"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x587

    const v7, 0x7f301d53

    xor-int/2addr v6, v7

    const v7, 0x59ccea6a

    goto/16 :goto_0

    :sswitch_9
    const/4 v0, 0x0

    :goto_1
    const-string v5, "\u1a75\u05a8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x45

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4b05

    const v7, 0x622d11ec

    xor-int/2addr v6, v7

    const v7, 0x76c4f6ca

    goto/16 :goto_0

    .line 113
    :sswitch_a
    sget-boolean v5, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v5, :cond_4

    goto :goto_2

    :cond_4
    const-string v5, "\u1a7a\u06d7"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x2d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xbb

    const v7, 0x43f92af1

    xor-int/2addr v6, v7

    const v7, -0x69024346

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v5, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v5, "\u06d8\u1a7b"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5a93

    const v7, 0x59ff8006

    xor-int/2addr v6, v7

    const v7, 0x3cfbb19a

    goto/16 :goto_0

    .line 57
    :sswitch_c
    sget v5, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v5, :cond_6

    :goto_2
    const-string v5, "\u06ec\u06d7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x354d

    const v7, 0x12fbd66d

    xor-int/2addr v6, v7

    const v7, -0x4be2a6b4

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u06df\u1a74"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x45

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5a43

    const v7, 0x20ea88e3

    xor-int/2addr v6, v7

    const v7, -0x55854fd5

    goto/16 :goto_0

    .line 36
    :sswitch_d
    sget v5, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v5, :cond_8

    :cond_7
    const-string v5, "\u1a77\u1a79"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5c6d

    const v7, -0x3ee657ae

    xor-int/2addr v6, v7

    const v7, -0x140a8a0e

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u1a78\u073f"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xbb7

    const v7, -0x4420ae67

    xor-int/2addr v6, v7

    const v7, -0x704bfd82

    goto/16 :goto_0

    .line 15
    :sswitch_e
    sget v5, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v5, :cond_9

    goto :goto_3

    :cond_9
    const-string v5, "\u06e8\u1a7a"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x3b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7253

    const v7, -0x5720777f

    xor-int/2addr v6, v7

    const v7, 0x62663a0e

    goto/16 :goto_0

    :sswitch_f
    sget v5, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v5, :cond_a

    goto :goto_3

    :cond_a
    const-string v5, "\u073a\u1a73"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x545f

    const v7, 0x28d02e2c

    xor-int/2addr v6, v7

    const v7, -0xe73c412

    goto/16 :goto_0

    .line 135
    :sswitch_10
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v5

    if-ltz v5, :cond_c

    :cond_b
    :goto_3
    const-string v5, "\u1a76\u06ec"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x7f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4263

    const v7, 0xff890fc

    xor-int/2addr v6, v7

    const v7, 0x3fa5534

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06d6\u06ec"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x65

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4f8d

    const v7, -0x1195c621

    xor-int/2addr v6, v7

    const v7, 0x1ea02e6d

    goto/16 :goto_0

    .line 141
    :sswitch_11
    sget v5, Ll/᩹;->ۤܿܳ:I

    if-eqz v5, :cond_d

    :goto_4
    const-string v5, "\u073a\u06e2"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7241

    const v7, -0xda3e15b

    xor-int/2addr v6, v7

    const v7, -0x2c099814

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06d9\u06da"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x58df

    const v7, 0x42c2489f

    xor-int/2addr v6, v7

    const v7, -0x10782f9d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x781cebf5 -> :sswitch_b
        -0x76e49885 -> :sswitch_3
        -0x75e30943 -> :sswitch_1
        -0x6f99f3c6 -> :sswitch_e
        -0x6f14fc2f -> :sswitch_3
        -0x6c0c16ee -> :sswitch_a
        -0x67627064 -> :sswitch_2
        -0x6361a91f -> :sswitch_f
        -0x5f220536 -> :sswitch_9
        -0x5d74cacc -> :sswitch_2
        -0x3abae306 -> :sswitch_c
        -0x34acb04d -> :sswitch_d
        -0x3259ad0f -> :sswitch_b
        -0x28bb5857 -> :sswitch_11
        -0x1ceeac8f -> :sswitch_10
        -0x12ca1340 -> :sswitch_8
        -0x11a20bec -> :sswitch_c
        -0xf601dac -> :sswitch_7
        -0xc72f7ba -> :sswitch_5
        -0x93b45b1 -> :sswitch_7
        0xf92298 -> :sswitch_0
        0x3c34242 -> :sswitch_9
        0x150d51bf -> :sswitch_6
        0x1b15320c -> :sswitch_4
        0x2f55a228 -> :sswitch_4
        0x3a79d4bc -> :sswitch_5
        0x40049214 -> :sswitch_f
        0x408fbd69 -> :sswitch_10
        0x417930d5 -> :sswitch_a
        0x4e16f57b -> :sswitch_1
        0x5c0cf5e2 -> :sswitch_d
        0x5ea90577 -> :sswitch_8
        0x5ffc3449 -> :sswitch_e
        0x688a690d -> :sswitch_6
        0x73d66079 -> :sswitch_11
        0x7cfe372f -> :sswitch_0
    .end sparse-switch
.end method

.method public final varargs getStringList([Ljava/lang/String;)Ljava/util/List;
    .locals 0

    .line 244
    invoke-virtual {p0, p1}, Ll/ۤ᩻᩷;->getStringArray([Ljava/lang/String;)[Ljava/lang/String;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final getStringNullable(Ljava/lang/String;)Ljava/lang/String;
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const v23, 0x5157e073

    sget v24, Ll/ۗ᩷;->᩸᩺ᩳ:I

    sget v25, Ll/֡ܶ;->ᩴܿ᩸:I

    const-string v26, "\u1a7a\u1a73"

    invoke-static/range {v26 .. v26}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v26

    xor-int v26, v26, v25

    mul-int/lit8 v26, v26, -0x9

    xor-int v2, v26, v24

    mul-int/lit16 v2, v2, -0x3ecf

    const v28, 0x4349ee5e

    xor-int v2, v2, v28

    const v28, -0x3f169d53

    xor-int v26, v26, v28

    move-object v5, v4

    move-object/from16 v28, v9

    move-object/from16 v15, v20

    move/from16 v27, v26

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const v26, 0x5157e073

    move-object v9, v8

    move-object/from16 v20, v13

    move-object v8, v7

    move-object v13, v12

    move-object v7, v6

    move-object v12, v11

    const/4 v6, 0x0

    move-object v11, v10

    :goto_0
    xor-int v10, v26, v24

    mul-int/lit16 v10, v10, -0x796f

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v2, v10

    xor-int v26, v27, v2

    sparse-switch v26, :sswitch_data_0

    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    .line 204
    invoke-static {v1, v2}, Ll/֫ۡ;->ܰ᩷ܺ(Ljava/lang/Object;I)C

    move-result v0

    const/16 v3, 0x7b

    if-ne v0, v3, :cond_11

    const-string v0, "\u06db\u0730"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v25

    xor-int v3, v0, v24

    mul-int/lit16 v3, v3, -0x1f7d

    const v22, -0x6741a293

    xor-int v3, v3, v22

    const v22, 0x6a1eeafa

    goto/16 :goto_13

    .line 116
    :sswitch_0
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    move-object/from16 v27, v8

    goto/16 :goto_2

    :cond_1
    move/from16 v2, v22

    move/from16 v10, v23

    goto/16 :goto_9

    .line 229
    :sswitch_1
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    const-string v2, "\u1a79\u073f"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v25

    mul-int/lit8 v2, v2, 0x71

    xor-int v10, v2, v24

    mul-int/lit16 v10, v10, -0x7489

    const v27, -0x3929e0f

    xor-int v10, v10, v27

    const v27, -0x6ff2bf3e

    goto/16 :goto_8

    :sswitch_2
    sget v2, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v2, :cond_0

    :cond_3
    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    goto/16 :goto_10

    .line 175
    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    sget v2, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-lez v2, :cond_3

    goto :goto_1

    .line 147
    :sswitch_4
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v2

    if-lez v2, :cond_5

    :cond_4
    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    goto/16 :goto_11

    :cond_5
    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    goto/16 :goto_12

    .line 217
    :sswitch_5
    sget v2, Ll/֨۟;->᩹֫᩷:I

    if-eqz v2, :cond_b

    goto :goto_1

    .line 68
    :sswitch_6
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    sget v2, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v2, :cond_4

    goto :goto_1

    .line 185
    :sswitch_7
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    :goto_1
    const-string v2, "\u06dc\u06d7"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v25

    xor-int v10, v2, v24

    mul-int/lit16 v10, v10, -0x295b

    const v27, -0x33519079    # -9.145452E7f

    xor-int v10, v10, v27

    const v27, 0x484cbd94

    goto/16 :goto_8

    .line 193
    :sswitch_8
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    const/4 v1, 0x0

    return-object v1

    .line 46
    :sswitch_9
    new-instance v2, Ll/᩶᩻᩷;

    sget-object v10, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    move-object/from16 v27, v8

    .line 94
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v29

    if-ltz v29, :cond_6

    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    move-object/from16 v8, v27

    goto/16 :goto_10

    :cond_6
    const/4 v8, 0x7

    sget-boolean v30, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v30, :cond_7

    :goto_2
    const-string v2, "\u06dc\u06db"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v24, v2

    mul-int/lit8 v2, v2, 0x7f

    xor-int v8, v2, v25

    mul-int/lit16 v8, v8, 0x36f1

    const v10, 0x565b7da2

    xor-int/2addr v8, v10

    const v10, 0x60c65945

    xor-int/2addr v2, v10

    move-object/from16 v31, v27

    move/from16 v27, v2

    move v2, v8

    move-object/from16 v8, v31

    goto/16 :goto_0

    :cond_7
    move/from16 v29, v3

    const/16 v3, 0x5c

    .line 46
    invoke-static {v10, v3, v8, v14}, Ll/ۘ᩻;->ۙܺܶ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ll/᩶᩻᩷;-><init>(Ljava/lang/String;)V

    sput-object v2, Ll/ܶܳ᩷;->ۧ:Ll/᩶᩻᩷;

    goto :goto_3

    .line 48
    :sswitch_a
    sget-object v1, Ll/ܶܳ᩷;->ۧ:Ll/᩶᩻᩷;

    .line 212
    invoke-virtual {v1, v5, v7}, Ll/᩶᩻᩷;->getOrDefault(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :sswitch_b
    move/from16 v29, v3

    move-object/from16 v27, v8

    .line 45
    sget-object v2, Ll/ܶܳ᩷;->ۧ:Ll/᩶᩻᩷;

    if-nez v2, :cond_8

    const-string v2, "\u06d8\u05a1"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v25, v2

    mul-int/lit8 v2, v2, 0x45

    xor-int v3, v2, v24

    mul-int/lit16 v3, v3, -0x42e1

    const v8, 0x5b9f3cb1

    xor-int/2addr v3, v8

    const v8, 0x18387c14

    goto/16 :goto_5

    :cond_8
    :goto_3
    const-string v2, "\u073d\u06e4"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v24

    mul-int/lit8 v2, v2, 0x5b

    xor-int v3, v2, v25

    mul-int/lit16 v3, v3, 0x5c59

    const v8, 0x65112e8c

    xor-int/2addr v3, v8

    const v8, 0x56732dae

    goto/16 :goto_5

    :sswitch_c
    return-object v13

    :sswitch_d
    move/from16 v29, v3

    move-object/from16 v27, v8

    .line 210
    invoke-virtual {v12, v5, v7}, Ll/᩶᩻᩷;->getOrDefault(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_9

    const-string v2, "\u0733\u06ec"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v25

    xor-int v3, v2, v24

    mul-int/lit16 v3, v3, -0x5d9d

    const v8, 0x59b1fd0f

    xor-int/2addr v3, v8

    const v8, -0x5ed27a3a

    goto :goto_5

    :cond_9
    const-string v2, "\u06d8\u06e2"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v24

    xor-int v3, v2, v25

    mul-int/lit16 v3, v3, -0x3f91

    const v8, 0x52c5a8a2

    xor-int/2addr v3, v8

    const v8, 0x51b7b5d5

    goto :goto_5

    .line 312
    :sswitch_e
    invoke-static {}, Ll/ܶܳ᩷;->ܿ()Lbin/mt/plugin/api/LocalString;

    move-result-object v1

    .line 219
    check-cast v1, Ll/᩶᩻᩷;

    invoke-virtual {v1, v9, v7}, Ll/᩶᩻᩷;->getOrDefault(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :sswitch_f
    move/from16 v29, v3

    move-object/from16 v27, v8

    .line 0
    invoke-static {v4, v4, v1}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object v5, v2

    move/from16 v10, v23

    goto/16 :goto_d

    :sswitch_10
    move/from16 v29, v3

    move-object/from16 v27, v8

    .line 196
    invoke-virtual {v11}, Ll/ܽܳ᩷;->ܽ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/ۤ᩻᩷;->֫(Ljava/lang/String;)Ll/᩶᩻᩷;

    move-result-object v2

    .line 197
    iput-object v2, v0, Ll/ۤ᩻᩷;->ܽ:Ll/᩶᩻᩷;

    :goto_4
    move-object v12, v2

    goto/16 :goto_7

    :sswitch_11
    move/from16 v29, v3

    move-object/from16 v27, v8

    .line 196
    iget-object v2, v0, Ll/ۤ᩻᩷;->ܳ:Ll/ۨۚ᩷;

    iget-object v2, v2, Ll/ۨۚ᩷;->᩸:Ljava/lang/Object;

    move-object v11, v2

    check-cast v11, Ll/ܽܳ᩷;

    sget v2, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v2, :cond_a

    move-object/from16 v8, v27

    move/from16 v3, v29

    goto :goto_6

    :cond_a
    const-string v2, "\u06eb\u05a8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v25

    mul-int/lit8 v2, v2, -0x17

    xor-int v3, v2, v24

    mul-int/lit16 v3, v3, 0x3875

    const v8, -0x35b6c7be    # -3296784.5f

    xor-int/2addr v3, v8

    const v8, 0x511e3c5f

    :goto_5
    xor-int/2addr v2, v8

    move-object/from16 v8, v27

    move/from16 v27, v2

    move v2, v3

    goto/16 :goto_15

    :sswitch_12
    move-object/from16 v27, v8

    .line 217
    invoke-static {v15, v3, v6, v14}, Ll/᩺;->֨ܶ۟([SIII)Ljava/lang/String;

    move-result-object v2

    .line 218
    invoke-static {v8, v2}, Ll/֨ᩴ;->֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    const-string v2, "\u06e1\u05a1"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v24

    mul-int/lit8 v2, v2, 0x23

    xor-int v10, v2, v25

    mul-int/lit16 v10, v10, 0x6845

    const v27, -0x5ebbe7ef

    xor-int v10, v10, v27

    const v27, -0x79c02f33

    goto/16 :goto_8

    .line 217
    :sswitch_13
    sget-object v15, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    const/16 v3, 0x58

    const/4 v6, 0x4

    .line 288
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v2

    if-ltz v2, :cond_c

    :cond_b
    :goto_6
    const-string v2, "\u1a75\u073d"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v24

    mul-int/lit8 v2, v2, 0x75

    xor-int v10, v2, v25

    mul-int/lit16 v10, v10, 0x5a61

    const v27, -0x221cca50

    xor-int v10, v10, v27

    const v27, 0x310c4493

    goto/16 :goto_8

    :cond_c
    const-string v2, "\u06dc\u1a7b"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v24

    mul-int/lit8 v2, v2, 0x51

    xor-int v10, v2, v25

    mul-int/lit16 v10, v10, -0x7b7b

    const v27, 0x277fdae5

    xor-int v10, v10, v27

    const v27, -0x2d762289

    goto/16 :goto_8

    :sswitch_14
    return-object v28

    .line 0
    :sswitch_15
    invoke-static {v4, v1}, Ll/ۨ;->ۘۜᩴ(ILjava/lang/Object;)C

    move-result v2

    const/16 v10, 0x7d

    if-ne v2, v10, :cond_d

    const-string v2, "\u06d9\u0733"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v24

    xor-int v10, v2, v25

    mul-int/lit16 v10, v10, -0x1dc5

    const v27, 0x4551c5f3

    xor-int v10, v10, v27

    const v27, 0x3977e96d

    goto/16 :goto_8

    :cond_d
    move/from16 v29, v3

    move/from16 v3, v22

    move/from16 v10, v23

    goto/16 :goto_c

    .line 192
    :sswitch_16
    iget-object v2, v0, Ll/ۤ᩻᩷;->ܽ:Ll/᩶᩻᩷;

    if-eqz v2, :cond_e

    goto/16 :goto_4

    :goto_7
    const-string v2, "\u06e8\u1a74"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v25

    xor-int v10, v2, v24

    mul-int/lit16 v10, v10, -0x3af7

    const v27, -0x47b03a62

    xor-int v10, v10, v27

    const v27, -0x6c07c4b3

    goto :goto_8

    :cond_e
    const-string v2, "\u06d7\u06eb"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v25, v2

    mul-int/lit8 v2, v2, -0x45

    xor-int v10, v2, v24

    mul-int/lit16 v10, v10, -0x4c67

    const v27, -0x519a85b

    xor-int v10, v10, v27

    const v27, 0x60680899

    goto :goto_8

    .line 217
    :sswitch_17
    invoke-virtual {v0, v8}, Ll/ۤ᩻᩷;->֫(Ljava/lang/String;)Ll/᩶᩻᩷;

    move-result-object v2

    invoke-virtual {v2, v9, v7}, Ll/᩶᩻᩷;->getOrDefault(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v28

    if-nez v28, :cond_f

    const-string v2, "\u0733\u073a"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v25, v2

    mul-int/lit8 v2, v2, 0x7b

    xor-int v10, v2, v24

    mul-int/lit16 v10, v10, -0x3899

    const v27, -0x149d673b

    xor-int v10, v10, v27

    const v27, -0x3619cc86

    goto :goto_8

    :cond_f
    const-string v2, "\u06e7\u06dc"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v24

    mul-int/lit8 v2, v2, -0x27

    xor-int v10, v2, v25

    mul-int/lit16 v10, v10, 0x6797

    const v27, -0x289c9654

    xor-int v10, v10, v27

    const v27, -0x7f43d750

    :goto_8
    xor-int v27, v2, v27

    move v2, v10

    goto/16 :goto_0

    :sswitch_18
    move/from16 v2, v22

    move/from16 v10, v23

    .line 215
    invoke-static {v5, v2, v10}, Ll/ۨ;->֨ۡ᩶(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v8

    add-int v9, v10, v4

    .line 216
    invoke-static {v5, v9}, Ll/֡ۨ;->ܳܽ᩶(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v9

    sget v22, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v22, :cond_10

    :goto_9
    const-string v22, "\u0730\u06db"

    invoke-static/range {v22 .. v22}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v22

    xor-int v22, v22, v24

    xor-int v0, v22, v25

    mul-int/lit16 v0, v0, -0x135d

    const v23, 0x28a1e36d

    xor-int v0, v0, v23

    const v23, -0x3337be52

    xor-int v27, v22, v23

    move/from16 v22, v2

    move/from16 v23, v10

    move v2, v0

    goto :goto_b

    :cond_10
    const-string v0, "\u1a75\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v24, v0

    mul-int/lit8 v0, v0, 0x27

    move/from16 v29, v3

    xor-int v3, v0, v25

    mul-int/lit16 v3, v3, -0x441f

    const v22, -0x4d9f54c8

    xor-int v3, v3, v22

    const v22, 0x13fe858b

    goto/16 :goto_13

    :cond_11
    move v3, v2

    goto :goto_c

    :sswitch_19
    move/from16 v29, v3

    move/from16 v2, v22

    const/16 v0, 0x3a

    .line 207
    invoke-static {v5, v0}, Ll/ۘᩴ;->᩹ۙᩴ(Ljava/lang/Object;I)I

    move-result v0

    const/4 v3, -0x1

    const/4 v7, 0x0

    if-ne v0, v3, :cond_12

    const-string v3, "\u06e4\u06e4"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v24

    xor-int v10, v3, v25

    mul-int/lit16 v10, v10, 0x4f91

    const v22, -0x5bf7c790

    xor-int v10, v10, v22

    const v22, -0x1e99ee35

    goto :goto_a

    :cond_12
    const-string v3, "\u06d7\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v25

    xor-int v10, v3, v24

    mul-int/lit16 v10, v10, 0xddf

    const v22, 0x6281cbd6

    xor-int v10, v10, v22

    const v22, 0x1e6bd29a

    :goto_a
    xor-int v27, v3, v22

    move/from16 v23, v0

    move/from16 v22, v2

    move v2, v10

    move/from16 v3, v29

    :goto_b
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_1a
    move/from16 v29, v3

    move/from16 v10, v23

    .line 204
    invoke-static/range {p1 .. p1}, Ll/֨֫;->ۡۚܽ(Ljava/lang/Object;)I

    move-result v0

    const/4 v2, 0x3

    const/16 v22, 0x0

    const/4 v4, 0x1

    if-lt v0, v2, :cond_13

    const-string v0, "\u06e1\u06e0"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    xor-int v2, v0, v25

    mul-int/lit16 v2, v2, -0x2ead

    const v3, -0x218075c6

    xor-int/2addr v2, v3

    const v3, 0x6ca8fa3c

    goto :goto_e

    :cond_13
    const/4 v3, 0x0

    :goto_c
    move-object v5, v1

    move/from16 v22, v3

    :goto_d
    const-string v0, "\u06d7\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v25

    mul-int/lit8 v0, v0, 0x1f

    xor-int v2, v0, v24

    mul-int/lit16 v2, v2, -0x2da5

    const v3, -0x59e54485

    xor-int/2addr v2, v3

    const v3, -0x3ac8140

    :goto_e
    xor-int v27, v0, v3

    move-object/from16 v0, p0

    goto/16 :goto_14

    :sswitch_1b
    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    const/16 v0, 0x6c41

    const/16 v14, 0x6c41

    goto :goto_f

    :sswitch_1c
    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    const v0, 0xbc2a

    const v14, 0xbc2a

    :goto_f
    const-string v0, "\u0733\u1a7a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v25

    xor-int v3, v0, v24

    mul-int/lit16 v3, v3, -0x6693

    const v22, 0x308c412f

    xor-int v3, v3, v22

    const v22, 0x6bd17c1d

    goto/16 :goto_13

    :sswitch_1d
    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    mul-int v0, v16, v19

    sub-int v0, v18, v0

    if-gez v0, :cond_14

    const-string v0, "\u06db\u06d7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    xor-int v3, v0, v25

    mul-int/lit16 v3, v3, -0x19c9

    const v22, 0x1cb303f9

    xor-int v3, v3, v22

    const v22, 0x7888d5cf

    goto/16 :goto_13

    :cond_14
    const-string v0, "\u06da\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v25

    mul-int/lit8 v0, v0, 0x79

    xor-int v3, v0, v24

    mul-int/lit16 v3, v3, 0x5a0f

    const v22, 0x4241f8e6

    xor-int v3, v3, v22

    const v22, -0x542f80de

    goto/16 :goto_13

    :sswitch_1e
    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    const v0, 0x8db0649

    add-int v18, v17, v0

    const/16 v19, 0x5f3a

    .line 194
    sget v0, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v0, :cond_15

    goto/16 :goto_12

    :cond_15
    const-string v0, "\u06d8\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v24, v0

    mul-int/lit8 v0, v0, 0x13

    xor-int v3, v0, v25

    mul-int/lit16 v3, v3, 0x3da9

    const v22, -0x3486c950    # -1.6332464E7f

    xor-int v3, v3, v22

    const v22, -0x487fda49

    goto/16 :goto_13

    :sswitch_1f
    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    aget-short v16, v20, v21

    mul-int v17, v16, v16

    sget v0, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v0, :cond_16

    const-string v0, "\u05a1\u1a7b"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v24, v0

    mul-int/lit8 v0, v0, -0x6d

    xor-int v3, v0, v25

    mul-int/lit16 v3, v3, 0x3485

    const v22, 0x73c97fca

    xor-int v3, v3, v22

    const v22, 0x7df56aa9

    goto/16 :goto_13

    :cond_16
    const-string v0, "\u05a1\u1a73"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    xor-int v3, v0, v25

    mul-int/lit16 v3, v3, 0x97f

    const v22, -0x45212d35    # -0.0017000077f

    xor-int v3, v3, v22

    const v22, -0x4663ac7d

    goto/16 :goto_13

    :sswitch_20
    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    const/16 v21, 0x57

    .line 203
    sget v0, Ll/֨۟;->᩹֫᩷:I

    if-eqz v0, :cond_17

    :goto_10
    const-string v0, "\u1a76\u06e4"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v25

    xor-int v3, v0, v24

    mul-int/lit16 v3, v3, 0x1803

    const v22, 0x3cce634d

    xor-int v3, v3, v22

    const v22, -0x20e4755c

    goto/16 :goto_13

    :cond_17
    const-string v0, "\u06e1\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v25

    xor-int v3, v0, v24

    mul-int/lit16 v3, v3, 0x37df

    const v22, -0x22220866    # -1.99930274E18f

    xor-int v3, v3, v22

    const v22, 0x3062434d

    goto :goto_13

    :sswitch_21
    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    sget-object v20, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    .line 45
    sget v0, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v0, :cond_18

    :goto_11
    const-string v0, "\u06df\u06dc"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    xor-int v3, v0, v25

    mul-int/lit16 v3, v3, 0x3bd7

    const v22, -0x4b00a89e

    xor-int v3, v3, v22

    const v22, -0x5431dabb

    goto :goto_13

    :cond_18
    const-string v0, "\u1a75\u05a8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    mul-int/lit8 v0, v0, -0x5

    xor-int v3, v0, v25

    mul-int/lit16 v3, v3, -0x788d

    const v22, -0x7fa10b92

    xor-int v3, v3, v22

    const v22, -0x60c8ff24

    goto :goto_13

    :sswitch_22
    move/from16 v29, v3

    move/from16 v2, v22

    move/from16 v10, v23

    .line 122
    sget-boolean v0, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v0, :cond_19

    :goto_12
    const-string v0, "\u1a7a\u073f"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v25

    mul-int/lit8 v0, v0, 0x5

    xor-int v3, v0, v24

    mul-int/lit16 v3, v3, 0x498f

    const v22, -0x764ebb3b

    xor-int v3, v3, v22

    const v22, 0x6e351b03

    goto :goto_13

    :cond_19
    const-string v0, "\u073a\u073f"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v25

    xor-int v3, v0, v24

    mul-int/lit16 v3, v3, 0x6339

    const v22, -0x61ad94c1

    xor-int v3, v3, v22

    const v22, -0x2df9b1b0

    :goto_13
    xor-int v27, v0, v22

    move-object/from16 v0, p0

    move/from16 v22, v2

    move v2, v3

    :goto_14
    move/from16 v23, v10

    :goto_15
    move/from16 v3, v29

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f73ff1a -> :sswitch_16
        -0x76a6c6aa -> :sswitch_20
        -0x768a60c7 -> :sswitch_1b
        -0x711e7366 -> :sswitch_6
        -0x6affff31 -> :sswitch_e
        -0x6a47c292 -> :sswitch_22
        -0x6a1481f8 -> :sswitch_14
        -0x6890cf14 -> :sswitch_8
        -0x67b19380 -> :sswitch_a
        -0x5d5ebc81 -> :sswitch_10
        -0x572d77de -> :sswitch_8
        -0x52dd9658 -> :sswitch_1
        -0x4ecc73bd -> :sswitch_1a
        -0x4c9370f0 -> :sswitch_17
        -0x4c7dd30c -> :sswitch_3
        -0x4b0d2c47 -> :sswitch_1a
        -0x4ac298b4 -> :sswitch_15
        -0x44232394 -> :sswitch_11
        -0x42084992 -> :sswitch_d
        -0x3eb7a184 -> :sswitch_18
        -0x372ef6b4 -> :sswitch_10
        -0x35dbcccb -> :sswitch_7
        -0x3596c501 -> :sswitch_18
        -0x2fb528a8 -> :sswitch_0
        -0x2c34f4fb -> :sswitch_1c
        -0x2789a924 -> :sswitch_1e
        -0x2499ed4d -> :sswitch_1e
        -0x22e96b4d -> :sswitch_20
        -0x1dfb3a3e -> :sswitch_7
        -0x1af82476 -> :sswitch_e
        -0x18c981a5 -> :sswitch_22
        -0x15a74ddb -> :sswitch_5
        -0x13825cea -> :sswitch_b
        -0x10be36a7 -> :sswitch_1f
        -0xc368269 -> :sswitch_3
        -0xc2457c0 -> :sswitch_1d
        -0xaa3da86 -> :sswitch_21
        -0x6e28e62 -> :sswitch_19
        -0x6462cdb -> :sswitch_17
        -0x57adcab -> :sswitch_12
        -0x3925372 -> :sswitch_13
        0x3be789 -> :sswitch_4
        0x2dbdce0 -> :sswitch_6
        0x79e6544 -> :sswitch_4
        0x87cbb98 -> :sswitch_16
        0xb820ccc -> :sswitch_c
        0xd25ff16 -> :sswitch_21
        0x100b271b -> :sswitch_2
        0x11ee90f5 -> :sswitch_1c
        0x1962c33e -> :sswitch_1b
        0x291f61fb -> :sswitch_12
        0x305da372 -> :sswitch_c
        0x32ae9560 -> :sswitch_0
        0x3597091d -> :sswitch_5
        0x377a7106 -> :sswitch_2
        0x39f153ea -> :sswitch_1
        0x3c7307b6 -> :sswitch_9
        0x3e9578a9 -> :sswitch_a
        0x4cdb9dc2 -> :sswitch_d
        0x50dd6484 -> :sswitch_13
        0x543fbce9 -> :sswitch_14
        0x557b57f0 -> :sswitch_15
        0x55a72651 -> :sswitch_11
        0x5790c6e4 -> :sswitch_1d
        0x589dffba -> :sswitch_f
        0x5d2207e4 -> :sswitch_1f
        0x748e6884 -> :sswitch_19
        0x7c0325d6 -> :sswitch_9
        0x7e0e35dc -> :sswitch_b
        0x7f052295 -> :sswitch_f
    .end sparse-switch
.end method

.method public final hasClipboardText()Z
    .locals 7

    const/4 v0, 0x0

    const v1, 0x3904c410

    sget v2, Ll/᩺;->ۙۛܶ:I

    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v4, "\u1a73\u06da"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x6b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xab3

    const v6, 0x6ddb0f15

    xor-int/2addr v5, v6

    const v6, -0x49fb99f9

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x405

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 325
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v4

    if-eqz v4, :cond_5

    goto/16 :goto_2

    .line 183
    :sswitch_0
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v4

    if-ltz v4, :cond_a

    goto :goto_1

    .line 214
    :sswitch_1
    sget v4, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-lez v4, :cond_1

    goto/16 :goto_3

    .line 387
    :sswitch_2
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    sget-boolean v4, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v4, :cond_7

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    goto/16 :goto_2

    .line 26
    :sswitch_4
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    const/4 v0, 0x0

    :sswitch_5
    return v0

    :sswitch_6
    const/4 v0, 0x0

    return v0

    .line 393
    :sswitch_7
    :try_start_0
    invoke-direct {p0}, Ll/ۤ᩻᩷;->֫()Landroid/content/ClipboardManager;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v4, "\u06d7\u06d7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit8 v5, v5, -0x5

    const v6, -0x4e059f7c

    xor-int/2addr v5, v6

    const v6, -0x195d5d0c

    goto :goto_0

    :catchall_0
    const-string v4, "\u06e0\u1a73"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3fb

    const v6, -0x609ad55b

    xor-int/2addr v5, v6

    const v6, -0x2f803db

    goto :goto_0

    :sswitch_8
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v4, "\u06db\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4d87

    const v6, -0xe8dbec2

    xor-int/2addr v5, v6

    const v6, 0x249823b7    # 6.5979995E-17f

    goto/16 :goto_0

    .line 248
    :sswitch_9
    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v4, :cond_2

    :cond_1
    :goto_1
    const-string v4, "\u06ec\u05ab"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x73

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x199f

    const v6, 0x6537a07d

    xor-int/2addr v5, v6

    const v6, -0x5fca8f6c

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u06d7\u1a78"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7c65

    const v6, 0x33590602

    xor-int/2addr v5, v6

    const v6, -0x2467d7ab

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u1a79\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x55

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7ccf

    const v6, 0x188ec

    xor-int/2addr v5, v6

    const v6, 0x791baf33

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u06e0\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x65

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x55e1

    const v6, -0x2c4fdc6a

    xor-int/2addr v5, v6

    const v6, 0x4d9d441d    # 3.29810848E8f

    goto/16 :goto_0

    :goto_2
    const-string v4, "\u05ab\u1a79"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x51

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2853

    const v6, 0x6c75dc61

    xor-int/2addr v5, v6

    const v6, 0x5c34601

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06d8\u06d7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6b9b

    const v6, 0x6203e4d8

    xor-int/2addr v5, v6

    const v6, -0x66ed9d0f

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v4, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v4, :cond_6

    goto :goto_4

    :cond_6
    const-string v4, "\u073d\u06da"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x4b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x78a7

    const v6, -0x740d40d6

    xor-int/2addr v5, v6

    const v6, 0x572b0472

    goto/16 :goto_0

    .line 337
    :sswitch_d
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v4

    if-gtz v4, :cond_8

    :cond_7
    :goto_3
    const-string v4, "\u1a76\u05ab"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4b15

    const v6, -0x49169ac1

    xor-int/2addr v5, v6

    const v6, -0x69239f34

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u1a77\u1a76"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x25

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4c5f

    const v6, 0x1a85c7f6

    xor-int/2addr v5, v6

    const v6, 0x59926b0c

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v4

    if-eqz v4, :cond_9

    goto :goto_4

    :cond_9
    const-string v4, "\u1a77\u06dc"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x54ab

    const v6, -0x7059ba7a

    xor-int/2addr v5, v6

    const v6, 0xf044e01

    goto/16 :goto_0

    .line 263
    :sswitch_f
    sget-boolean v4, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v4, :cond_b

    :cond_a
    :goto_4
    const-string v4, "\u06d8\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x45

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6733

    const v6, 0xd6ce8bf

    xor-int/2addr v5, v6

    const v6, -0x1aba386e

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06db\u0736"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x49

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1c77

    const v6, 0x3b3409cb

    xor-int/2addr v5, v6

    const v6, -0x23804174

    goto/16 :goto_0

    .line 62
    :sswitch_10
    sget-boolean v4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v4, :cond_c

    :goto_5
    const-string v4, "\u06e8\u073a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xfd

    const v6, -0x78085822

    xor-int/2addr v5, v6

    const v6, 0x1cb1462d

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06df\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1a5f

    const v6, -0x7ec7d62d    # -3.382547E-38f

    xor-int/2addr v5, v6

    const v6, -0x321cde49

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6f380c68 -> :sswitch_c
        -0x6a1b09ae -> :sswitch_1
        -0x611b5592 -> :sswitch_d
        -0x5cc3a026 -> :sswitch_3
        -0x56bb11c0 -> :sswitch_5
        -0x4e8bd6eb -> :sswitch_9
        -0x4d93b1be -> :sswitch_10
        -0x4a84d80c -> :sswitch_7
        -0x488aaa4a -> :sswitch_1
        -0x455e4893 -> :sswitch_0
        -0x3cf2512f -> :sswitch_a
        -0x3a535394 -> :sswitch_d
        -0x38c2e496 -> :sswitch_7
        -0x320e663d -> :sswitch_2
        -0x2ef3bd0a -> :sswitch_a
        -0x2d1ae5bb -> :sswitch_4
        -0x2cbe8109 -> :sswitch_5
        -0x27ab004e -> :sswitch_b
        -0x11843fc9 -> :sswitch_8
        -0x7ff037d -> :sswitch_f
        0x8f16724 -> :sswitch_b
        0xd9c8e94 -> :sswitch_e
        0x13fe695d -> :sswitch_8
        0x1d4945ff -> :sswitch_4
        0x29529d9c -> :sswitch_0
        0x346ca4b9 -> :sswitch_10
        0x3f59be07 -> :sswitch_6
        0x45c3f3d5 -> :sswitch_e
        0x5af0ff8e -> :sswitch_f
        0x63905913 -> :sswitch_9
        0x6a95872e -> :sswitch_2
        0x6ce4cc9c -> :sswitch_6
        0x7d283df1 -> :sswitch_3
        0x7d4ccc10 -> :sswitch_c
    .end sparse-switch
.end method

.method public final log(Ljava/lang/String;)V
    .locals 2

    .line 489
    iget-object v1, p0, Ll/ۤ᩻᩷;->᩻:Ljava/lang/String;

    sget-object v0, Ll/ܶܳ᩷;->ܳ:Ll/᩶᩻᩷;

    .line 0
    const-class v0, Ll/ܶܳ᩷;

    monitor-enter v0

    .line 175
    :try_start_0
    invoke-static {v1, p1}, Ll/ܶܳ᩷;->֫(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 176
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final log(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 6

    const v0, 0x52608b3

    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    sget v2, Ll/ۘۨ;->۫᩸۠:I

    const-string v3, "\u1a79\u1a73"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xbb9

    const v5, -0x659bb3e2

    xor-int/2addr v4, v5

    const v5, -0x3f09ab35

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x6e5b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 103
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v3

    if-eqz v3, :cond_4

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    sget v3, Ll/ۗ᩺;->ۡ᩺֡:I

    if-gez v3, :cond_5

    goto :goto_1

    .line 148
    :sswitch_1
    sget-boolean v3, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v3, "\u1a74\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0xd

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x753d

    const v5, 0x7fd84bd8

    xor-int/2addr v4, v5

    const v5, -0xe0bb5a2

    goto :goto_0

    .line 245
    :sswitch_2
    sget v3, Ll/᩹;->ۤܿܳ:I

    if-nez v3, :cond_b

    goto/16 :goto_3

    .line 463
    :sswitch_3
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    goto/16 :goto_3

    .line 298
    :sswitch_4
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    return-void

    .line 494
    :sswitch_5
    iget-object v0, p0, Ll/ۤ᩻᩷;->᩻:Ljava/lang/String;

    invoke-static {v0, p1, p2}, Ll/ܶܳ᩷;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    .line 271
    :sswitch_6
    sget-boolean v3, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v3, :cond_1

    const-string v3, "\u06da\u1a75"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x295

    const v5, 0x60ddaaf2

    xor-int/2addr v4, v5

    const v5, 0x2582745e

    goto :goto_0

    :cond_1
    const-string v3, "\u0730\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5807

    const v5, 0x39e32d8

    xor-int/2addr v4, v5

    const v5, -0x4920ca36

    goto :goto_0

    :sswitch_7
    sget v3, Ll/۟;->ۗۤۛ:I

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    const-string v3, "\u05ab\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x59

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x346b

    const v5, -0x24c7353a

    xor-int/2addr v4, v5

    const v5, 0x225d6c29    # 3.0008345E-18f

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u1a7a\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4f89

    const v5, 0x23b05db8

    xor-int/2addr v4, v5

    const v5, 0x33a617cc

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06da\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x21bf

    const v5, 0x28a3dd23

    xor-int/2addr v4, v5

    const v5, -0x44a99b55

    goto/16 :goto_0

    .line 265
    :sswitch_9
    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v3, :cond_6

    :cond_5
    :goto_2
    const-string v3, "\u1a76\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3267

    const v5, -0x6b41d02

    xor-int/2addr v4, v5

    const v5, -0x2d02de31

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06e2\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2e4f

    const v5, 0x2c46ea82

    xor-int/2addr v4, v5

    const v5, 0x43084731

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֨۟;->᩹֫᩷:I

    if-eqz v3, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v3, "\u1a7a\u06da"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x59db

    const v5, -0x7a24c5f2

    xor-int/2addr v4, v5

    const v5, -0x135e6dce

    goto/16 :goto_0

    .line 308
    :sswitch_b
    sget v3, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u073f\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3a4d

    const v5, 0x74537432

    xor-int/2addr v4, v5

    const v5, 0x3cb9e2b5

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v3, :cond_9

    :goto_3
    const-string v3, "\u073d\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5471

    const v5, 0x62ebda37

    xor-int/2addr v4, v5

    const v5, 0x2916f94e

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e1\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x35

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x641

    const v5, -0x11ac0750

    xor-int/2addr v4, v5

    const v5, 0x25e17a89

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_4

    :cond_a
    const-string v3, "\u06e8\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x77d

    const v5, 0x3b595556

    xor-int/2addr v4, v5

    const v5, 0x3ccc522

    goto/16 :goto_0

    .line 389
    :sswitch_e
    sget v3, Ll/᩹;->ۤܿܳ:I

    if-eqz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06db\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x35

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x622b

    const v5, -0xe4bdee0

    xor-int/2addr v4, v5

    const v5, -0x408e754d

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a79\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x72e1

    const v5, -0x3d5079db

    xor-int/2addr v4, v5

    const v5, -0x8d646c3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7eb2b32b -> :sswitch_0
        -0x60b9d320 -> :sswitch_e
        -0x59814c77 -> :sswitch_5
        -0x493e2ec4 -> :sswitch_4
        -0x46c35c7f -> :sswitch_8
        -0x3c9e4370 -> :sswitch_0
        -0x34317cdc -> :sswitch_c
        -0x300ac7ec -> :sswitch_4
        -0x2e8dfb1a -> :sswitch_6
        -0x16c7ba29 -> :sswitch_b
        -0x126feaf1 -> :sswitch_2
        -0x114220c3 -> :sswitch_7
        -0x7e4582f -> :sswitch_6
        0x4d2cf5c -> :sswitch_a
        0x6eace91 -> :sswitch_9
        0xb4cc46d -> :sswitch_d
        0xb794516 -> :sswitch_3
        0xefba7e3 -> :sswitch_2
        0x15223bb6 -> :sswitch_1
        0x1a0434d1 -> :sswitch_9
        0x226655d3 -> :sswitch_7
        0x2688ac5d -> :sswitch_8
        0x30dd9fca -> :sswitch_1
        0x460719d2 -> :sswitch_b
        0x4edcf65a -> :sswitch_a
        0x503cf679 -> :sswitch_5
        0x58223469 -> :sswitch_d
        0x6c7f568b -> :sswitch_c
        0x6ffdadfa -> :sswitch_e
        0x7c2e3e7e -> :sswitch_3
    .end sparse-switch
.end method

.method public final log(Ljava/lang/Throwable;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x60cb95a9

    sget v2, Ll/ۙۨ;->ۡۗۙ:I

    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v4, "\u05a8\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6e1

    const v6, -0x18a791a3

    xor-int/2addr v5, v6

    const v6, -0x8af6d62

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x134d

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    const/4 v1, 0x0

    .line 163
    invoke-static {v0, v1, p1}, Ll/ܶܳ᩷;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    .line 470
    :sswitch_0
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    sget v4, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v4, :cond_7

    goto/16 :goto_4

    .line 103
    :sswitch_1
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v4

    if-nez v4, :cond_9

    goto/16 :goto_4

    .line 164
    :sswitch_2
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    sget-boolean v4, Ll/ۘ᩶;->ܶۗۡ:Z

    if-eqz v4, :cond_b

    goto :goto_1

    .line 225
    :sswitch_3
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    goto :goto_1

    .line 91
    :sswitch_4
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    return-void

    .line 499
    :sswitch_5
    iget-object v0, p0, Ll/ۤ᩻᩷;->᩻:Ljava/lang/String;

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u1a7b\u1a7b"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x4f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3b91

    const v6, 0x78dc1a17

    xor-int/2addr v5, v6

    const v6, 0x3ad1463b

    goto :goto_0

    :sswitch_6
    sget v4, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v4, "\u1a78\u1a75"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x6f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x62b3

    const v6, 0x3e48e2f3

    xor-int/2addr v5, v6

    const v6, 0xf3528d6

    goto :goto_0

    .line 216
    :sswitch_7
    sget v4, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v4, :cond_2

    goto :goto_1

    :cond_2
    const-string v4, "\u06d7\u06ec"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x35

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x450d

    const v6, -0x52c317fd

    xor-int/2addr v5, v6

    const v6, 0x330d88fb

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v4, :cond_3

    :goto_1
    const-string v4, "\u06da\u06d6"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x5f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7a07

    const v6, -0x7e28d1f1

    xor-int/2addr v5, v6

    const v6, -0x50d4e8c2

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u073f\u06e7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3c49

    const v6, 0x75d1de4d

    xor-int/2addr v5, v6

    const v6, 0x1212384f

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v4, "\u1a78\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5ac1

    const v6, -0x1ab9f85c

    xor-int/2addr v5, v6

    const v6, -0x5ad1e986

    goto/16 :goto_0

    .line 280
    :sswitch_a
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v4

    if-eqz v4, :cond_5

    :goto_2
    const-string v4, "\u073d\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xa1f

    const v6, -0x30e980e5

    xor-int/2addr v5, v6

    const v6, 0xbbd6cec

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u1a78\u06da"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x2f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x526b

    const v6, 0x5cddbe18

    xor-int/2addr v5, v6

    const v6, 0x1f847536

    goto/16 :goto_0

    .line 380
    :sswitch_b
    sget v4, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v4, :cond_6

    goto :goto_3

    :cond_6
    const-string v4, "\u06d7\u05a8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x7d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3eb5

    const v6, 0xc05ae81

    xor-int/2addr v5, v6

    const v6, 0x30a450d3

    goto/16 :goto_0

    .line 346
    :sswitch_c
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v4

    if-ltz v4, :cond_8

    :cond_7
    const-string v4, "\u06e2\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x49a5

    const v6, -0x7a35c6f4

    xor-int/2addr v5, v6

    const v6, 0x11207403

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u06db\u073a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x51

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x28eb

    const v6, 0x5528c859

    xor-int/2addr v5, v6

    const v6, -0x6dac900f

    goto/16 :goto_0

    .line 330
    :sswitch_d
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v4

    if-ltz v4, :cond_a

    :cond_9
    :goto_3
    const-string v4, "\u1a74\u1a74"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x2d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x73cd

    const v6, -0x6ce9b9c6

    xor-int/2addr v5, v6

    const v6, -0x7a3182ad

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e2\u0733"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7555

    const v6, -0x64d8c1f7

    xor-int/2addr v5, v6

    const v6, -0x3f9ae47e

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06d9\u06da"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x59

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4109

    const v6, 0x4336363e

    xor-int/2addr v5, v6

    const v6, 0x647d9bee

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a73\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x29

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x370d

    const v6, -0x73967b73

    xor-int/2addr v5, v6

    const v6, 0xf654710

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c6979bb -> :sswitch_8
        -0x65a1b6e5 -> :sswitch_0
        -0x4f14edfe -> :sswitch_b
        -0x4c082a3f -> :sswitch_5
        -0x47522a1d -> :sswitch_e
        -0x33a6603e -> :sswitch_6
        -0x283263f2 -> :sswitch_9
        -0x21b710b3 -> :sswitch_2
        -0x1921e62d -> :sswitch_c
        -0x102c9599 -> :sswitch_5
        -0xd4b6158 -> :sswitch_3
        -0x7215857 -> :sswitch_0
        -0x1c50942 -> :sswitch_9
        -0x43e70d -> :sswitch_c
        0x34a7dd1 -> :sswitch_d
        0x70dbfd0 -> :sswitch_6
        0xfb3d042 -> :sswitch_4
        0x257da000 -> :sswitch_a
        0x2c6e03c3 -> :sswitch_3
        0x31d80561 -> :sswitch_1
        0x33748134 -> :sswitch_8
        0x34a90107 -> :sswitch_7
        0x379b76fe -> :sswitch_1
        0x4245c872 -> :sswitch_a
        0x44f3b3b6 -> :sswitch_b
        0x51666ff1 -> :sswitch_d
        0x5f2076b8 -> :sswitch_7
        0x613f114d -> :sswitch_2
        0x66b3fb21 -> :sswitch_e
        0x726da7eb -> :sswitch_4
    .end sparse-switch
.end method

.method public final openBrowser(Ljava/lang/String;)V
    .locals 6

    const v0, 0x1db13feb

    sget v1, Ll/᩺;->ۙۛܶ:I

    sget v2, Ll/ۗ᩺;->ۡ᩺֡:I

    const-string v3, "\u0736\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x746d

    const v5, -0x5afa1b6e

    xor-int/2addr v4, v5

    const v5, -0x7829efad

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x214f

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 69
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v3

    if-eqz v3, :cond_4

    goto/16 :goto_3

    .line 163
    :sswitch_0
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v3, :cond_b

    goto/16 :goto_2

    .line 290
    :sswitch_1
    sget v3, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v3, :cond_9

    goto/16 :goto_2

    .line 259
    :sswitch_2
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    sget v3, Ll/ۖ۫;->ۖ֫ܿ:I

    if-gez v3, :cond_6

    goto/16 :goto_1

    .line 10
    :sswitch_3
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    return-void

    .line 344
    :sswitch_5
    new-instance v3, Ll/ۢ᩸᩷;

    .line 285
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v4

    if-ltz v4, :cond_0

    const-string v3, "\u073f\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x63d1

    const v5, 0x4ae3e7b7    # 7467995.5f

    xor-int/2addr v4, v5

    const v5, -0xcbb5a6f

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    .line 344
    invoke-direct {v3, p0, p1, v0}, Ll/ۢ᩸᩷;-><init>(Ljava/lang/Object;Ljava/io/Serializable;I)V

    invoke-static {v3}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 123
    :sswitch_6
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u1a78\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x50eb

    const v5, -0x465bad38

    xor-int/2addr v4, v5

    const v5, 0xf88ad7c

    goto :goto_0

    .line 151
    :sswitch_7
    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u1a74\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x37d7

    const v5, -0x48e4a929

    xor-int/2addr v4, v5

    const v5, 0x4b1d76cb    # 1.0319563E7f

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v3, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    const-string v3, "\u06e8\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xa5f

    const v5, 0x6da4c3f5

    xor-int/2addr v4, v5

    const v5, 0x37d0e9e6

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06e4\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x32d5

    const v5, 0x599f86af

    xor-int/2addr v4, v5

    const v5, 0x3bd0d4a6

    goto/16 :goto_0

    .line 262
    :sswitch_9
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_5

    :goto_1
    const-string v3, "\u06e1\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3539

    const v5, -0x12a18d0d

    xor-int/2addr v4, v5

    const v5, 0x47170fa3

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06e2\u1a73"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x144d

    const v5, -0x52e55ac0

    xor-int/2addr v4, v5

    const v5, 0x7ef82ad5

    goto/16 :goto_0

    .line 167
    :sswitch_a
    sget v3, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u06d6\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x75e9

    const v5, -0x3dc54bcf

    xor-int/2addr v4, v5

    const v5, 0x664c3947

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e2\u05a8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x65

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x388d

    const v5, -0x7bd5f1a1    # -1.9990003E-36f

    xor-int/2addr v4, v5

    const v5, -0x4bade7e3

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u06e2\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5ea5

    const v5, 0x3d605304

    xor-int/2addr v4, v5

    const v5, 0x1acc8713

    goto/16 :goto_0

    .line 295
    :sswitch_c
    sget v3, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u06e7\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x36d1

    const v5, 0x6e42d1b0

    xor-int/2addr v4, v5

    const v5, -0x4458f10d

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u05a8\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x765f

    const v5, -0x161aa740

    xor-int/2addr v4, v5

    const v5, 0x58ba2547

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u1a79\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x39f

    const v5, -0x636d1a45

    xor-int/2addr v4, v5

    const v5, -0x5a5810c5

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e8\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xf27

    const v5, -0x46e6dcb3

    xor-int/2addr v4, v5

    const v5, -0x3af37623

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6cffa790 -> :sswitch_2
        -0x6a6b21fb -> :sswitch_0
        -0x444d7dd7 -> :sswitch_a
        -0x3e17f0d2 -> :sswitch_7
        -0x3d24a13a -> :sswitch_6
        -0x37f15941 -> :sswitch_8
        -0x2313d8ea -> :sswitch_1
        -0x21cd1036 -> :sswitch_5
        -0x1b2508fb -> :sswitch_5
        -0x1996c702 -> :sswitch_7
        -0x14246413 -> :sswitch_b
        -0xc0ea8fa -> :sswitch_0
        -0x8d01882 -> :sswitch_d
        0xa0a5a8d -> :sswitch_9
        0xf23380c -> :sswitch_3
        0x10666c79 -> :sswitch_c
        0x1fd2781b -> :sswitch_c
        0x341d4099 -> :sswitch_d
        0x36069072 -> :sswitch_4
        0x4312e41d -> :sswitch_a
        0x4759711f -> :sswitch_8
        0x53afd1c5 -> :sswitch_3
        0x633d8f85 -> :sswitch_9
        0x6a1ede59 -> :sswitch_2
        0x6d599598 -> :sswitch_b
        0x72f4e6f4 -> :sswitch_4
        0x78940daa -> :sswitch_1
        0x7efd3e57 -> :sswitch_6
    .end sparse-switch
.end method

.method public final openBuiltinBrowser(Ljava/lang/String;Z)V
    .locals 6

    const v0, -0x1594adc5

    sget v1, Ll/ۛ;->᩺᩻֫:I

    sget v2, Ll/ۖ۫;->ۖ֫ܿ:I

    const-string v3, "\u06d6\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1403

    const v5, -0x7349ec8    # -3.3000253E34f

    xor-int/2addr v4, v5

    const v5, 0x37e2f53d

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x16d1

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 155
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget v3, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v3, :cond_b

    goto/16 :goto_1

    :sswitch_0
    sget v3, Ll/ۗۗ;->ۨ۬ۖ:I

    if-gez v3, :cond_6

    goto/16 :goto_3

    .line 13
    :sswitch_1
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    sget v3, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v3, :cond_9

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    invoke-static {}, Ll/۠;->ܿ۠۠()I

    return-void

    .line 359
    :sswitch_4
    new-instance v0, Ll/ۗ᩻᩷;

    invoke-direct {v0, p0, p1, p2}, Ll/ۗ᩻᩷;-><init>(Ll/ۤ᩻᩷;Ljava/lang/String;Z)V

    invoke-static {v0}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 162
    :sswitch_5
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "\u06e8\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2a67

    const v5, 0x45648df7

    xor-int/2addr v4, v5

    const v5, -0x68c70eff

    goto :goto_0

    :cond_0
    const-string v3, "\u06d7\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xa5f

    const v5, 0x4fb6341a    # 6.1137357E9f

    xor-int/2addr v4, v5

    const v5, 0x780a8815

    goto :goto_0

    .line 315
    :sswitch_6
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u1a78\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x69

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x397d

    const v5, -0x45f188d2

    xor-int/2addr v4, v5

    const v5, 0x28d93185

    goto/16 :goto_0

    :sswitch_7
    sget-boolean v3, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u0730\u06d9"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5a4f

    const v5, 0x38648f2a

    xor-int/2addr v4, v5

    const v5, 0x7f21c65e

    goto/16 :goto_0

    .line 130
    :sswitch_8
    sget-boolean v3, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u1a73\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6661

    const v5, -0x77373975

    xor-int/2addr v4, v5

    const v5, 0x3d6829ab

    goto/16 :goto_0

    .line 305
    :sswitch_9
    sget v3, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u1a75\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0xd

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5841

    const v5, -0x78a6f47d

    xor-int/2addr v4, v5

    const v5, 0x1458c6de

    goto/16 :goto_0

    .line 78
    :sswitch_a
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v3

    if-nez v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u06d9\u0733"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2b9f

    const v5, -0x2d8c2eb6

    xor-int/2addr v4, v5

    const v5, -0x1d5e6ba6

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v3, :cond_7

    :cond_6
    :goto_1
    const-string v3, "\u06e2\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x75d9

    const v5, 0x7ae3556b

    xor-int/2addr v4, v5

    const v5, -0x51921378

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06df\u0733"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x75

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x278f

    const v5, 0x68c040b3

    xor-int/2addr v4, v5

    const v5, -0xd466fe5

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v3

    if-gtz v3, :cond_8

    :goto_2
    const-string v3, "\u06e8\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2a2f

    const v5, -0x65ac636b

    xor-int/2addr v4, v5

    const v5, 0x339dbb48

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06d7\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6521

    const v5, 0x37c596d5

    xor-int/2addr v4, v5

    const v5, -0x531e2772

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v3, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u1a78\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x351b

    const v5, 0x18a9bb3e

    xor-int/2addr v4, v5

    const v5, 0x5060271c

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d7\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x188f

    const v5, 0x702e967c

    xor-int/2addr v4, v5

    const v5, -0xd6c53c0

    goto/16 :goto_0

    .line 28
    :sswitch_e
    sget-boolean v3, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06dc\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1663

    const v5, 0x7aaa8472

    xor-int/2addr v4, v5

    const v5, -0x14ce05e5

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06dc\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x45

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x297d

    const v5, -0x2ed90979

    xor-int/2addr v4, v5

    const v5, -0x4a11e220

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x78b1f477 -> :sswitch_8
        -0x72d11cf4 -> :sswitch_a
        -0x6ac2b9c1 -> :sswitch_4
        -0x69306001 -> :sswitch_6
        -0x68e3d452 -> :sswitch_2
        -0x67d00464 -> :sswitch_a
        -0x60d81e74 -> :sswitch_b
        -0x4b5d2242 -> :sswitch_0
        -0x48bb9f22 -> :sswitch_e
        -0x47c67c6d -> :sswitch_3
        -0x42abc372 -> :sswitch_2
        -0x2e24880a -> :sswitch_5
        -0x2a9d994e -> :sswitch_3
        -0x1fd664c3 -> :sswitch_e
        -0x16446c5a -> :sswitch_d
        -0xe7ba91b -> :sswitch_b
        -0xb7a145d -> :sswitch_6
        -0x69d3df -> :sswitch_1
        0x145b26e7 -> :sswitch_4
        0x1fa456f6 -> :sswitch_c
        0x1ff164a0 -> :sswitch_8
        0x2b9be2e7 -> :sswitch_9
        0x435a104b -> :sswitch_1
        0x4cff8f72 -> :sswitch_7
        0x5392d26c -> :sswitch_d
        0x6095e9ac -> :sswitch_0
        0x69058774 -> :sswitch_9
        0x6f309969 -> :sswitch_5
        0x7041a76a -> :sswitch_7
        0x77745cb4 -> :sswitch_c
    .end sparse-switch
.end method

.method public final openLogViewer()V
    .locals 6

    const v0, -0x58f720bc

    sget v1, Ll/ۘ᩻;->᩵ۜ֨:I

    sget v2, Ll/ۖ;->᩹۟ۘ:I

    const-string v3, "\u06e0\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x925

    const v5, -0x7508da1a

    xor-int/2addr v4, v5

    const v5, 0x1bad1603

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x2fc5

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 57
    sget-boolean v3, Ll/ۘ᩶;->ܶۗۡ:Z

    if-eqz v3, :cond_0

    goto/16 :goto_3

    .line 449
    :sswitch_0
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_2

    :sswitch_1
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_2

    .line 36
    :sswitch_2
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    goto :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    return-void

    .line 508
    :sswitch_4
    new-instance v3, Ll/ۡ᩸᩷;

    sget v4, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v4, :cond_1

    :cond_0
    const-string v3, "\u073a\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1767

    const v5, 0x635b678a

    xor-int/2addr v4, v5

    const v5, 0x426fa19

    goto :goto_0

    .line 220
    :cond_1
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    .line 116
    :cond_2
    sget v4, Ll/۠;->ܺܺܶ:I

    if-ltz v4, :cond_4

    :cond_3
    :goto_1
    const-string v3, "\u06e7\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x358b

    const v5, 0x6fa2be99

    xor-int/2addr v4, v5

    const v5, 0x4f725bd5

    goto :goto_0

    :cond_4
    sget v4, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v4, :cond_5

    goto :goto_4

    :cond_5
    sget v4, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v4, :cond_6

    goto :goto_2

    .line 491
    :cond_6
    sget v4, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v4, :cond_7

    :goto_2
    const-string v3, "\u06dc\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5271

    const v5, -0x294efea3

    xor-int/2addr v4, v5

    const v5, 0x73860868

    goto/16 :goto_0

    :cond_7
    sget-boolean v4, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v4, :cond_8

    goto :goto_4

    .line 353
    :cond_8
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v4

    if-ltz v4, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u05a8\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7c25

    const v5, -0x35cddbbd

    xor-int/2addr v4, v5

    const v5, 0x84ced76

    goto/16 :goto_0

    .line 447
    :cond_a
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v4

    if-gtz v4, :cond_b

    goto :goto_4

    :cond_b
    const/4 v4, 0x1

    .line 347
    sget-boolean v5, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v5, :cond_c

    :goto_4
    const-string v3, "\u1a75\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x2d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x673d

    const v5, 0x4cae5be2    # 9.1414288E7f

    xor-int/2addr v4, v5

    const v5, 0x7ea7fc2e

    goto/16 :goto_0

    .line 508
    :cond_c
    iget-object v0, p0, Ll/ۤ᩻᩷;->᩻:Ljava/lang/String;

    invoke-direct {v3, v0, v4}, Ll/ۡ᩸᩷;-><init>(Ljava/lang/String;I)V

    invoke-static {v3}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7db9da03 -> :sswitch_3
        -0x552fa03e -> :sswitch_3
        -0x3a1ac719 -> :sswitch_4
        -0x1c541578 -> :sswitch_0
        0x18327399 -> :sswitch_1
        0x2a2f5869 -> :sswitch_2
        0x2ff1d0bf -> :sswitch_4
        0x307a340d -> :sswitch_1
        0x3c1072c9 -> :sswitch_2
        0x4a11cdc7 -> :sswitch_0
    .end sparse-switch
.end method

.method public final openPreference(Ljava/lang/Class;)V
    .locals 6

    const v0, 0x67b679d5

    sget v1, Ll/ۙۨ;->ۡۗۙ:I

    sget v2, Ll/֨ᩴ;->ۢ֨ۖ:I

    const-string v3, "\u06dc\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1e09

    const v5, 0x7016f195

    xor-int/2addr v4, v5

    const v5, -0x6486e3ce

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0xe67

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 282
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    sget-boolean v3, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v3, :cond_3

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    if-gez v3, :cond_b

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v3

    if-lez v3, :cond_9

    goto/16 :goto_2

    .line 290
    :sswitch_2
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    goto/16 :goto_2

    .line 56
    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    return-void

    .line 325
    :sswitch_4
    new-instance v3, Ll/ۡ᩸ۡ;

    .line 163
    sget v4, Ll/᩺;->ۙۛܶ:I

    if-gtz v4, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    .line 325
    invoke-direct {v3, v0, p0, p1}, Ll/ۡ᩸ۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 274
    :sswitch_5
    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u06d7\u06e2"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4455

    const v5, 0x169af61c

    xor-int/2addr v4, v5

    const v5, 0x5b074582

    goto :goto_0

    .line 82
    :sswitch_6
    sget v3, Ll/۠;->ܺܺܶ:I

    if-ltz v3, :cond_2

    :goto_1
    const-string v3, "\u05a8\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x2d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x57c5

    const v5, 0x5f5888f8

    xor-int/2addr v4, v5

    const v5, -0x5e984693

    goto :goto_0

    :cond_2
    const-string v3, "\u06e1\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4209

    const v5, 0x7b3be2e9

    xor-int/2addr v4, v5

    const v5, -0x11d74f57

    goto/16 :goto_0

    .line 184
    :sswitch_7
    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-nez v3, :cond_4

    :cond_3
    const-string v3, "\u06dc\u1a7b"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x22fb

    const v5, -0x26b60732

    xor-int/2addr v4, v5

    const v5, 0x25cb629e

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06eb\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x25

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x536f

    const v5, 0x24f2749d

    xor-int/2addr v4, v5

    const v5, 0x49b127fd

    goto/16 :goto_0

    .line 37
    :sswitch_8
    sget-boolean v3, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u06d8\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x5d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2ed1

    const v5, 0x2b3421e4

    xor-int/2addr v4, v5

    const v5, -0x3bfe558b

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u06eb\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xd7b

    const v5, 0x29250c2

    xor-int/2addr v4, v5

    const v5, 0x161245eb

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v3

    if-eqz v3, :cond_7

    :goto_2
    const-string v3, "\u05a8\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2b21

    const v5, -0x3e29ce65

    xor-int/2addr v4, v5

    const v5, 0x287edecd

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u073f\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0xf

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2f45

    const v5, 0x119f0b92

    xor-int/2addr v4, v5

    const v5, 0x9eaf4dc

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֡۬;->۠֡᩶:I

    if-gtz v3, :cond_8

    goto :goto_3

    :cond_8
    const-string v3, "\u06d8\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x48a3

    const v5, -0x725cf2ea

    xor-int/2addr v4, v5

    const v5, 0x2efd1303

    goto/16 :goto_0

    .line 85
    :sswitch_c
    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u1a75\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x27cb

    const v5, -0x44e55b8a

    xor-int/2addr v4, v5

    const v5, -0x849e58d

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a75\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x43

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6d3d

    const v5, -0x5f8b55dd

    xor-int/2addr v4, v5

    const v5, 0x7d52b34a    # 1.75043E37f

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v3

    if-eqz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u1a73\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x29d1

    const v5, -0x2f1e7c88

    xor-int/2addr v4, v5

    const v5, -0x385b8c69

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073a\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x1d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1fe5

    const v5, -0x54d4ef0b

    xor-int/2addr v4, v5

    const v5, 0x62a03fc

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a62549b -> :sswitch_9
        -0x785d7954 -> :sswitch_2
        -0x753cc456 -> :sswitch_1
        -0x65fff5e4 -> :sswitch_a
        -0x5d9b9e8c -> :sswitch_7
        -0x573aa78b -> :sswitch_2
        -0x423de672 -> :sswitch_d
        -0x2f495b16 -> :sswitch_6
        -0x2d975eee -> :sswitch_8
        -0x2bb5186d -> :sswitch_c
        -0x2b3b7d22 -> :sswitch_b
        -0x2a378c9d -> :sswitch_c
        -0x174d8cfa -> :sswitch_0
        -0xbf0d6be -> :sswitch_4
        0xec5b683 -> :sswitch_3
        0x11e1e090 -> :sswitch_5
        0x12312fb3 -> :sswitch_8
        0x1ce4fdf7 -> :sswitch_a
        0x2a0e0935 -> :sswitch_7
        0x2b89ea54 -> :sswitch_d
        0x3999251d -> :sswitch_3
        0x4120da97 -> :sswitch_5
        0x4d19a277 -> :sswitch_9
        0x5561a68b -> :sswitch_6
        0x5951dfee -> :sswitch_b
        0x6e419730 -> :sswitch_0
        0x6e98395e -> :sswitch_4
        0x776188a0 -> :sswitch_1
    .end sparse-switch
.end method

.method public final setClipboardText(Ljava/lang/CharSequence;)Z
    .locals 19

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

    const/4 v11, 0x0

    const v12, -0x3aa54533

    sget v13, Ll/ۘܿ;->ۘܰ۫:I

    sget v14, Ll/֨ۤ;->ܿۖ᩵:I

    const-string v15, "\u1a7b\u06da"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v14

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, 0x54f5

    const v17, 0x22ec4931

    xor-int v0, v0, v17

    const v17, 0x432d2c70

    xor-int v15, v15, v17

    const/16 v16, 0x0

    :goto_0
    xor-int/2addr v12, v13

    mul-int/lit16 v12, v12, -0x3c25

    shr-int/lit8 v12, v12, 0x1f

    and-int/2addr v0, v12

    xor-int v12, v15, v0

    sparse-switch v12, :sswitch_data_0

    move-object/from16 v17, v9

    add-int v0, v3, v7

    mul-int v0, v0, v0

    sub-int v0, v6, v0

    if-gez v0, :cond_7

    const-string v0, "\u1a76\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x4f

    xor-int v9, v0, v14

    mul-int/lit16 v9, v9, 0x2f75

    const v15, 0x3f8ad5f0

    xor-int/2addr v9, v15

    const v15, -0xae2670d

    goto/16 :goto_c

    .line 388
    :sswitch_0
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v0

    if-eqz v0, :cond_9

    :cond_0
    :goto_1
    move-object/from16 v17, v9

    goto/16 :goto_9

    .line 290
    :sswitch_1
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    sget v0, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v0, :cond_1

    goto :goto_3

    :cond_1
    const-string v0, "\u06da\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x64d3

    const v17, 0x75a848cf

    xor-int v15, v15, v17

    const v17, -0x74cb8b21

    goto/16 :goto_5

    .line 371
    :sswitch_2
    sget v0, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v0, :cond_2

    :goto_2
    move-object/from16 v17, v9

    goto/16 :goto_8

    :cond_2
    :goto_3
    const-string v0, "\u06df\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x7d

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x1581

    const v17, 0x467e706a

    xor-int v15, v15, v17

    const v17, -0x6b3aba53

    goto/16 :goto_5

    :sswitch_3
    sget v0, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v0, :cond_0

    :cond_3
    move-object/from16 v17, v9

    goto/16 :goto_b

    .line 417
    :sswitch_4
    sget v0, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v0, :cond_3

    goto :goto_2

    .line 353
    :sswitch_5
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    goto :goto_2

    :sswitch_6
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    :goto_4
    const/4 v0, 0x0

    return v0

    :sswitch_7
    const/4 v0, 0x1

    return v0

    :sswitch_8
    const v0, 0x7e55c42e

    xor-int v0, v16, v0

    .line 419
    invoke-static {v0}, Ll/ۘۗ;->֨ܽ᩻(I)Ll/᩸ۚۢ;

    goto :goto_4

    .line 415
    :sswitch_9
    invoke-static {v9, v10, v11, v8}, Ll/ۗۚ;->ۙ۟ܺ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v16

    .line 303
    sget v0, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v0, :cond_4

    goto/16 :goto_7

    :cond_4
    const-string v0, "\u1a74\u06e2"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x7b

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x77b3

    const v17, -0x6fef6f6

    xor-int v15, v15, v17

    const v17, -0x6543721b

    goto :goto_5

    :sswitch_a
    const/4 v11, 0x3

    .line 93
    sget v0, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v0, :cond_5

    goto/16 :goto_1

    :cond_5
    const-string v0, "\u073d\u06da"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x19

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x7b5f

    const v17, 0x2e977187

    xor-int v15, v15, v17

    const v17, 0x6f487d98

    goto :goto_5

    .line 415
    :sswitch_b
    sget-object v9, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    const/16 v10, 0x64

    sget-boolean v0, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v0, :cond_6

    goto/16 :goto_7

    :cond_6
    const-string v0, "\u05ab\u06e7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x51

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x1cc5

    const v17, 0xcc35e4d

    xor-int v15, v15, v17

    const v17, -0x336a10f0    # -7.8608512E7f

    :goto_5
    xor-int v0, v0, v17

    move/from16 v18, v15

    move v15, v0

    move/from16 v0, v18

    goto/16 :goto_0

    .line 414
    :sswitch_c
    :try_start_0
    invoke-direct/range {p0 .. p0}, Ll/ۤ᩻᩷;->֫()Landroid/content/ClipboardManager;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v15, 0x0

    move-object/from16 v17, v9

    move-object/from16 v9, p1

    :try_start_1
    invoke-static {v15, v9}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v15

    invoke-virtual {v0, v15}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    sget-object v0, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    const/16 v15, 0x67

    const/4 v9, 0x3

    invoke-static {v0, v15, v9, v8}, Ll/֡ۜ;->ۜ᩶ܶ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    const v9, 0x7ea06a9c

    xor-int/2addr v0, v9

    .line 415
    invoke-static {v0}, Ll/ۘۗ;->֨ܽ᩻(I)Ll/᩸ۚۢ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const-string v0, "\u06d8\u1a76"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x4d

    xor-int v9, v0, v14

    mul-int/lit16 v9, v9, 0xd93

    const v15, -0x7ed7bfeb

    xor-int/2addr v9, v15

    const v15, 0xdafff58

    goto/16 :goto_c

    :catchall_0
    move-object/from16 v17, v9

    :catchall_1
    const-string v0, "\u06e2\u06db"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x47

    xor-int v9, v0, v14

    mul-int/lit16 v9, v9, 0x518f

    const v15, -0x337bc3eb    # -6.9329064E7f

    xor-int/2addr v9, v15

    const v15, -0x7d32af32

    goto/16 :goto_c

    :sswitch_d
    move-object/from16 v17, v9

    const/16 v0, 0x67e1

    const/16 v8, 0x67e1

    goto :goto_6

    :sswitch_e
    move-object/from16 v17, v9

    const/16 v0, 0x5a5e

    const/16 v8, 0x5a5e

    :goto_6
    const-string v0, "\u06eb\u1a73"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x7d

    xor-int v9, v0, v13

    mul-int/lit16 v9, v9, 0x7ef9

    const v15, -0x684eef6c

    xor-int/2addr v9, v15

    const v15, 0x4192075d

    goto/16 :goto_c

    :cond_7
    const-string v0, "\u1a75\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x39

    xor-int v9, v0, v13

    mul-int/lit16 v9, v9, 0x631

    const v15, 0x606157b9

    xor-int/2addr v9, v15

    const v15, 0x498a7770    # 1134318.0f

    goto/16 :goto_c

    :sswitch_f
    move-object/from16 v17, v9

    const/16 v7, 0x39f5

    .line 5
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v0

    if-eqz v0, :cond_8

    goto/16 :goto_9

    :cond_8
    const-string v0, "\u06e4\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v9, v0, v14

    mul-int/lit16 v9, v9, 0x767d

    const v15, 0x38e299f4

    xor-int/2addr v9, v15

    const v15, -0x2d5e4da6

    goto/16 :goto_c

    :sswitch_10
    move-object/from16 v17, v9

    add-int v0, v4, v5

    add-int v6, v0, v0

    sget-boolean v0, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v0, :cond_a

    move-object/from16 v9, v17

    :cond_9
    :goto_7
    const-string v0, "\u06d7\u06eb"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, -0x3dc3

    const v17, -0x5eb0dbe6

    xor-int v15, v15, v17

    const v17, 0x28005b32

    goto/16 :goto_5

    :cond_a
    const-string v0, "\u06d8\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x75

    xor-int v9, v0, v13

    mul-int/lit16 v9, v9, -0x32a9

    const v15, -0x38a8d2a8

    xor-int/2addr v9, v15

    const v15, 0x2969ed

    goto/16 :goto_c

    :sswitch_11
    move-object/from16 v17, v9

    const v5, 0xd1f0479

    .line 297
    sget v0, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v0, :cond_b

    goto/16 :goto_a

    :cond_b
    const-string v0, "\u06e7\u06e0"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x27

    xor-int v9, v0, v14

    mul-int/lit16 v9, v9, 0x7dbd

    const v15, -0x314ec23a

    xor-int/2addr v9, v15

    const v15, 0x14730de0

    goto/16 :goto_c

    :sswitch_12
    move-object/from16 v17, v9

    aget-short v3, v1, v2

    mul-int v4, v3, v3

    .line 263
    sget v0, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v0, :cond_c

    :goto_8
    const-string v0, "\u06df\u06df"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x4d

    xor-int v9, v0, v13

    mul-int/lit16 v9, v9, 0x20f3

    const v15, -0x6d512f14

    xor-int/2addr v9, v15

    const v15, -0x7ef15dba

    goto/16 :goto_c

    :cond_c
    const-string v0, "\u073a\u05a8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x5

    xor-int v9, v0, v14

    mul-int/lit16 v9, v9, -0x369d

    const v15, -0x29589724

    xor-int/2addr v9, v15

    const v15, 0x65761559

    goto/16 :goto_c

    :sswitch_13
    move-object/from16 v17, v9

    const/16 v2, 0x63

    .line 279
    sget v0, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v0, :cond_d

    :goto_9
    const-string v0, "\u1a74\u1a73"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x3f

    xor-int v9, v0, v14

    mul-int/lit16 v9, v9, 0x1927

    const v15, -0x6a1646dc    # -9.440005E-26f

    xor-int/2addr v9, v15

    const v15, 0x5c029c00

    goto/16 :goto_c

    :cond_d
    const-string v0, "\u1a78\u073a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x4b

    xor-int v9, v0, v13

    mul-int/lit16 v9, v9, 0x6e47

    const v15, -0x3d011d6f

    xor-int/2addr v9, v15

    const v15, -0x598e54bd

    goto :goto_c

    :sswitch_14
    move-object/from16 v17, v9

    sget-object v1, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v0

    if-eqz v0, :cond_e

    :goto_a
    const-string v0, "\u1a7b\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v9, v0, v13

    mul-int/lit16 v9, v9, 0x54b1

    const v15, -0x34bee06

    xor-int/2addr v9, v15

    const v15, -0x6c8ffa6d

    goto :goto_c

    :cond_e
    const-string v0, "\u05a1\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v9, v0, v13

    mul-int/lit16 v9, v9, 0x48fb

    const v15, -0x50c0a4c8

    xor-int/2addr v9, v15

    const v15, 0x12229953

    goto :goto_c

    :sswitch_15
    move-object/from16 v17, v9

    .line 280
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v0

    if-eqz v0, :cond_f

    :goto_b
    const-string v0, "\u1a7b\u06e2"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v9, v0, v13

    mul-int/lit16 v9, v9, 0x3c71

    const v15, -0x4e9d4928

    xor-int/2addr v9, v15

    const v15, -0x511449c3

    goto :goto_c

    :cond_f
    const-string v0, "\u1a7b\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v9, v0, v14

    mul-int/lit16 v9, v9, 0x937

    const v15, 0x6b2bec9a

    xor-int/2addr v9, v15

    const v15, 0x5e41fde2

    :goto_c
    xor-int/2addr v15, v0

    move v0, v9

    move-object/from16 v9, v17

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f3e123b -> :sswitch_3
        -0x7b1f6dff -> :sswitch_4
        -0x7959492f -> :sswitch_14
        -0x7772c07a -> :sswitch_11
        -0x73783b8b -> :sswitch_1
        -0x6478040f -> :sswitch_15
        -0x61c7f898 -> :sswitch_6
        -0x60a5d6a6 -> :sswitch_13
        -0x5fa46fe2 -> :sswitch_1
        -0x558242d2 -> :sswitch_c
        -0x34c8f56f -> :sswitch_0
        -0x31a9ed5a -> :sswitch_15
        -0x2e70c939 -> :sswitch_10
        -0x2a924326 -> :sswitch_12
        -0x29e62815 -> :sswitch_14
        -0x250a7117 -> :sswitch_c
        -0x1ff26ec5 -> :sswitch_8
        0x3301e97 -> :sswitch_10
        0x36fbe9b -> :sswitch_2
        0xc544d73 -> :sswitch_6
        0xeb3672a -> :sswitch_7
        0xfa51f95 -> :sswitch_a
        0x1e0b4fa1 -> :sswitch_0
        0x1ffbb86f -> :sswitch_d
        0x22a9c651 -> :sswitch_e
        0x22f1f44c -> :sswitch_12
        0x23908893 -> :sswitch_5
        0x2a3326b7 -> :sswitch_a
        0x2cc4d697 -> :sswitch_4
        0x33422ceb -> :sswitch_11
        0x368b6734 -> :sswitch_e
        0x3f171d89 -> :sswitch_13
        0x40789e52 -> :sswitch_9
        0x444e3e66 -> :sswitch_d
        0x4fb6a043 -> :sswitch_2
        0x505bb2be -> :sswitch_7
        0x53bb49a9 -> :sswitch_b
        0x58a0a5c1 -> :sswitch_f
        0x5a626c3a -> :sswitch_8
        0x5ca6a55d -> :sswitch_5
        0x60c79c1f -> :sswitch_3
        0x6a865975 -> :sswitch_f
        0x6f4d6a87 -> :sswitch_9
        0x7dfd6c6e -> :sswitch_b
    .end sparse-switch
.end method

.method public final setClipboardText(Ljava/lang/CharSequence;Ljava/lang/String;)Z
    .locals 26

    move-object/from16 v0, p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v20, -0x34afab21    # -1.3653215E7f

    sget v21, Ll/ۖ۫;->ۖ֫ܿ:I

    sget v22, Ll/ۛ;->᩺᩻֫:I

    const-string v23, "\u1a79\u06e2"

    invoke-static/range {v23 .. v23}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v23

    add-int v23, v23, v22

    mul-int/lit8 v23, v23, 0x7d

    xor-int v1, v23, v21

    mul-int/lit16 v1, v1, -0x6549

    const v25, -0x77e347d

    xor-int v1, v1, v25

    const v25, -0x42981aa1

    xor-int v23, v23, v25

    move-object v6, v5

    move-object/from16 v12, v17

    move/from16 v24, v23

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v23, -0x34afab21    # -1.3653215E7f

    const/16 v25, 0x0

    move-object/from16 v17, v10

    move-object v10, v9

    move-object v9, v8

    const/4 v8, 0x0

    :goto_0
    xor-int v15, v23, v21

    mul-int/lit16 v15, v15, -0x711

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v1, v15

    xor-int v23, v24, v1

    sparse-switch v23, :sswitch_data_0

    .line 430
    invoke-static {v12, v13, v14, v11}, Ll/۠;->ۢۤ۠([SIII)Ljava/lang/String;

    move-result-object v10

    .line 161
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v1

    if-ltz v1, :cond_a

    goto :goto_2

    .line 65
    :sswitch_0
    sget v1, Ll/֡ᩴ;->ܳۤ֫:I

    if-gez v1, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v0, p1

    goto/16 :goto_9

    :cond_1
    move-object/from16 v0, p1

    goto/16 :goto_b

    .line 353
    :sswitch_1
    sget v1, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v1, :cond_3

    :cond_2
    :goto_2
    move-object/from16 v0, p1

    goto/16 :goto_c

    :cond_3
    move-object/from16 v0, p1

    goto/16 :goto_d

    .line 188
    :sswitch_2
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    sget v1, Ll/᩹;->ۤܿܳ:I

    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    const-string v1, "\u073a\u1a7b"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, -0x17bb

    const v24, -0x3f0d7529

    xor-int v15, v15, v24

    const v24, -0x400453f1

    goto/16 :goto_7

    :sswitch_3
    sget-boolean v1, Ll/֫᩺;->֫ܰۨ:Z

    if-nez v1, :cond_5

    goto :goto_1

    :cond_5
    const-string v1, "\u05ab\u1a78"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v22, v1

    mul-int/lit8 v1, v1, 0x1d

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x76f9

    const v24, -0x2604d9b2

    xor-int v15, v15, v24

    const v24, 0xca084a6

    goto/16 :goto_7

    .line 8
    :sswitch_4
    sget-boolean v1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v1, :cond_0

    goto :goto_2

    .line 323
    :sswitch_5
    sget v1, Ll/ۛ;->᩺᩻֫:I

    if-ltz v1, :cond_2

    goto :goto_4

    :sswitch_6
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    sget v1, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v1, :cond_6

    goto :goto_3

    :cond_6
    move-object/from16 v0, p1

    goto/16 :goto_e

    :sswitch_7
    sget v1, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v1, :cond_7

    goto :goto_4

    :cond_7
    :goto_3
    const-string v1, "\u06df\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x45

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x1cc5

    const v24, 0x14622550

    xor-int v15, v15, v24

    const v24, -0x3d7e46a1

    goto/16 :goto_7

    .line 416
    :sswitch_8
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    :goto_4
    const-string v1, "\u06e0\u06d6"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, -0x7d

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x441

    const v24, -0x35a57e00    # -3580032.0f

    xor-int v15, v15, v24

    const v24, 0x22b26d21

    goto/16 :goto_7

    :sswitch_9
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    const/4 v0, 0x0

    return v0

    :sswitch_a
    if-eqz v9, :cond_8

    move-object v6, v9

    goto/16 :goto_5

    :sswitch_b
    move-object/from16 v1, p0

    .line 183
    :try_start_0
    invoke-static {v1, v0}, Ll/֫ۡ;->᩻ۢۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v15, "\u06dc\u0733"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    xor-int v15, v15, v21

    xor-int v1, v15, v22

    mul-int/lit16 v1, v1, 0x7a67

    const v24, -0x499fbff9

    xor-int v1, v1, v24

    const v24, 0x22ab541a

    xor-int v24, v15, v24

    goto/16 :goto_0

    :sswitch_c
    const/16 v1, 0x7d

    if-ne v8, v1, :cond_8

    const-string v1, "\u06ec\u05a8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    mul-int/lit8 v1, v1, -0x3b

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0xb19

    const v24, 0x47a408ce

    xor-int v15, v15, v24

    const v24, -0x226f17cb

    goto/16 :goto_7

    .line 182
    :sswitch_d
    :try_start_1
    invoke-static/range {p2 .. p2}, Ll/֫ۡ;->᩻ܳܽ(Ljava/lang/Object;)I

    move-result v1

    sub-int/2addr v1, v3

    invoke-static {v0, v1}, Ll/֫ۡ;->ܰ᩷ܺ(Ljava/lang/Object;I)C

    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v1, "\u06eb\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v22, v1

    mul-int/lit8 v1, v1, -0x73

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x5d5f

    const v24, -0x7b621ff4

    xor-int v15, v15, v24

    const v24, -0x7423355d

    goto/16 :goto_7

    :sswitch_e
    const/16 v1, 0x7b

    if-ne v7, v1, :cond_8

    const-string v1, "\u0736\u06d7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    mul-int/lit8 v1, v1, 0x79

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, -0x50a1

    const v24, -0x120559a2

    xor-int v15, v15, v24

    const v24, 0x54bb7c4b

    goto/16 :goto_7

    :sswitch_f
    :try_start_2
    invoke-static {v0, v2}, Ll/֫ۡ;->ܰ᩷ܺ(Ljava/lang/Object;I)C

    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v1, "\u073d\u06e0"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, -0x7913

    const v24, 0x2186e6ff

    xor-int v15, v15, v24

    const v24, 0x3c6aa47

    goto/16 :goto_7

    .line 430
    :sswitch_10
    :try_start_3
    invoke-static {v6}, Ll/֡ᩴ;->ܽۖ۫(Ljava/lang/Object;)Ll/᩸ۚۢ;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_6

    :sswitch_11
    const/4 v1, 0x3

    if-lt v5, v1, :cond_8

    const-string v1, "\u073f\u06e4"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, -0x5f

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x7d61

    const v24, -0x45e41324

    xor-int v15, v15, v24

    const v24, -0x15478891

    goto/16 :goto_7

    :cond_8
    move-object v6, v0

    :goto_5
    const-string v1, "\u06e4\u06e7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x2571

    const v24, -0x2b7957a5

    xor-int v15, v15, v24

    const v24, 0x75750498

    goto/16 :goto_7

    .line 182
    :sswitch_12
    :try_start_4
    invoke-static/range {p2 .. p2}, Ll/֫ۡ;->᩻ܳܽ(Ljava/lang/Object;)I

    move-result v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const-string v1, "\u1a79\u1a7a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x607b

    const v24, -0x75f5a457

    xor-int v15, v15, v24

    const v24, 0x654e7ce9

    goto/16 :goto_7

    :sswitch_13
    if-nez v4, :cond_9

    const-string v1, "\u06db\u05a1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, -0x61

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x5035

    const v24, -0x787c1a3c

    xor-int v15, v15, v24

    const v24, -0x17ee229b

    goto/16 :goto_7

    .line 428
    :sswitch_14
    :try_start_5
    invoke-static/range {p2 .. p2}, Ll/֫ܺ;->᩺ۜ۠(Ljava/lang/Object;)Z

    move-result v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const-string v1, "\u1a7b\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x47

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x38ff

    const v24, -0x78c38b57

    xor-int v15, v15, v24

    const v24, 0x2aa48952

    goto :goto_7

    :sswitch_15
    return v3

    :sswitch_16
    const/4 v3, 0x1

    if-eqz v0, :cond_9

    const-string v1, "\u06e2\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, -0x5bd1

    const v24, -0x331534a2

    xor-int v15, v15, v24

    const v24, -0x667f0e2e

    goto :goto_7

    :cond_9
    :goto_6
    const-string v1, "\u06e1\u1a78"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    mul-int/lit8 v1, v1, -0x65

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x7647

    const v24, 0x332b6b61

    xor-int v15, v15, v24

    const v24, 0x47a595ff    # 84779.99f

    goto :goto_7

    .line 430
    :sswitch_17
    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7d08f336

    xor-int/2addr v0, v1

    .line 435
    invoke-static {v0}, Ll/֫֫;->ۙܽ᩹(I)Ll/᩸ۚۢ;

    return v2

    :cond_a
    const-string v1, "\u1a76\u06d6"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x285f

    const v24, 0x7b1ee73c

    xor-int v15, v15, v24

    const v24, 0x46a35935

    goto :goto_7

    .line 430
    :sswitch_18
    sget-object v12, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    const/16 v13, 0x6b

    const/4 v14, 0x3

    .line 344
    sget v1, Ll/۠;->ܺܺܶ:I

    if-ltz v1, :cond_b

    move-object/from16 v0, p1

    goto/16 :goto_a

    :cond_b
    const-string v1, "\u05a8\u06e8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x1a9b

    const v24, -0x4a50cd62

    xor-int v15, v15, v24

    const v24, -0xfffad22

    :goto_7
    xor-int v24, v1, v24

    goto/16 :goto_10

    .line 427
    :sswitch_19
    :try_start_6
    invoke-direct/range {p0 .. p0}, Ll/ۤ᩻᩷;->֫()Landroid/content/ClipboardManager;

    move-result-object v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    const/4 v15, 0x0

    move-object/from16 v0, p1

    :try_start_7
    invoke-static {v15, v0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v15

    invoke-virtual {v1, v15}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    const-string v1, "\u06e2\u06e2"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x7f0f

    const v24, 0x455a50fb

    xor-int v15, v15, v24

    const v24, -0x27d538ee

    goto/16 :goto_f

    :catchall_0
    move-object/from16 v0, p1

    :catchall_1
    const-string v1, "\u05ab\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v21, v1

    mul-int/lit8 v1, v1, -0x4d

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x32b7

    const v24, -0x594c86b4

    xor-int v15, v15, v24

    const v24, -0x7ddfdcc2

    goto/16 :goto_f

    :sswitch_1a
    move-object/from16 v0, p1

    const/4 v2, 0x0

    const-string v1, "\u073d\u06d8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, -0x65

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x47cb

    const v24, -0x38d1dc19

    xor-int v15, v15, v24

    const v24, -0x11f7d785

    goto/16 :goto_f

    :sswitch_1b
    move-object/from16 v0, p1

    const v1, 0xdb9f

    const v11, 0xdb9f

    goto :goto_8

    :sswitch_1c
    move-object/from16 v0, p1

    const v1, 0x936a

    const v11, 0x936a

    :goto_8
    const-string v1, "\u06ec\u1a7a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, -0x53

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x179f

    const v24, 0x73110806

    xor-int v15, v15, v24

    const v24, -0x6be0c023

    goto/16 :goto_f

    :sswitch_1d
    move-object/from16 v0, p1

    add-int v1, v25, v16

    add-int/2addr v1, v1

    sub-int v1, v1, v20

    if-ltz v1, :cond_c

    const-string v1, "\u1a76\u1a7b"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0xcfb

    const v24, 0x718a6458

    xor-int v15, v15, v24

    const v24, -0x2631dbc0

    goto/16 :goto_f

    :cond_c
    const-string v1, "\u06df\u06d7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x3979

    const v24, 0x794f97b0

    xor-int v15, v15, v24

    const v24, -0x7f387e35

    goto/16 :goto_f

    :sswitch_1e
    move-object/from16 v0, p1

    const v16, 0xd01a690

    .line 393
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_a

    :cond_d
    const-string v1, "\u05ab\u1a7a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x8b3

    const v24, 0x6d443473

    xor-int v15, v15, v24

    const v24, -0xb51eaca

    goto/16 :goto_f

    :sswitch_1f
    move-object/from16 v0, p1

    add-int v1, v18, v19

    mul-int v20, v1, v1

    mul-int v25, v18, v18

    .line 155
    sget v1, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v1, :cond_e

    :goto_9
    const-string v1, "\u05ab\u05a8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x5579

    const v24, -0x6efefe65

    xor-int v15, v15, v24

    const v24, -0x6e79224d

    goto/16 :goto_f

    :cond_e
    const-string v1, "\u05a1\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x7ce9

    const v24, 0x3e51e6dd

    xor-int v15, v15, v24

    const v24, -0x5e41ff9

    goto/16 :goto_f

    :sswitch_20
    move-object/from16 v0, p1

    const/16 v1, 0x6a

    aget-short v18, v17, v1

    const/16 v19, 0x39b4

    sget-boolean v1, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v1, :cond_f

    :goto_a
    const-string v1, "\u1a73\u06e8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x207

    const v24, 0x6d80b6f3

    xor-int v15, v15, v24

    const v24, -0x660e33f7

    goto/16 :goto_f

    :cond_f
    const-string v1, "\u0736\u06e4"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, -0x78fb

    const v24, 0x860dbaa

    xor-int v15, v15, v24

    const v24, 0x6bf0ddff

    goto/16 :goto_f

    :sswitch_21
    move-object/from16 v0, p1

    sget-object v17, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    .line 291
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v1

    if-gtz v1, :cond_10

    goto/16 :goto_d

    :cond_10
    const-string v1, "\u06e8\u06d7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v22, v1

    mul-int/lit8 v1, v1, -0x13

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x7907

    const v24, 0x3e8d7c43

    xor-int v15, v15, v24

    const v24, 0x42ecec05

    goto/16 :goto_f

    :sswitch_22
    move-object/from16 v0, p1

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v1

    if-gtz v1, :cond_11

    :goto_b
    const-string v1, "\u06db\u06d8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, -0x4723

    const v24, -0x639279c5

    xor-int v15, v15, v24

    const v24, 0x6790efa2

    goto/16 :goto_f

    :cond_11
    const-string v1, "\u073d\u06ec"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x2f

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x31c9

    const v24, -0x5d84f22

    xor-int v15, v15, v24

    const v24, 0x675e2ca0

    goto/16 :goto_f

    :sswitch_23
    move-object/from16 v0, p1

    .line 264
    sget-boolean v1, Ll/֨۫;->۬᩷᩶:Z

    if-nez v1, :cond_12

    :goto_c
    const-string v1, "\u073a\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x665

    const v24, 0x6b2df433

    xor-int v15, v15, v24

    const v24, -0x2904feb1

    goto/16 :goto_f

    :cond_12
    const-string v1, "\u06e8\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x47a3

    const v24, 0x4407ebd3

    xor-int v15, v15, v24

    const v24, 0x6aa1a5ea

    goto :goto_f

    :sswitch_24
    move-object/from16 v0, p1

    sget v1, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v1, :cond_13

    :goto_d
    const-string v1, "\u06e4\u1a78"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    mul-int/lit8 v1, v1, 0x6d

    xor-int v15, v1, v21

    mul-int/lit8 v15, v15, 0x45

    const v24, -0x5af29c44

    xor-int v15, v15, v24

    const v24, 0x584036bc

    goto :goto_f

    :cond_13
    const-string v1, "\u06eb\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, 0x1387

    const v24, 0x72b8167a

    xor-int v15, v15, v24

    const v24, -0x45f6a482

    goto :goto_f

    :sswitch_25
    move-object/from16 v0, p1

    .line 44
    sget-boolean v1, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v1, :cond_14

    :goto_e
    const-string v1, "\u073a\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v22

    xor-int v15, v1, v21

    mul-int/lit16 v15, v15, -0x5fc1

    const v24, -0x75614f7d

    xor-int v15, v15, v24

    const v24, -0xdbb53e0

    goto :goto_f

    :cond_14
    const-string v1, "\u073f\u05a1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v21

    mul-int/lit8 v1, v1, -0x63

    xor-int v15, v1, v22

    mul-int/lit16 v15, v15, 0x3b1f

    const v24, 0x1ab8f64c

    xor-int v15, v15, v24

    const v24, 0x2a65b8ca

    :goto_f
    xor-int v24, v1, v24

    move-object/from16 v0, p2

    :goto_10
    move v1, v15

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f0a1f06 -> :sswitch_12
        -0x7dd0486f -> :sswitch_1a
        -0x7d329c64 -> :sswitch_1a
        -0x7ba2baa0 -> :sswitch_11
        -0x79e99112 -> :sswitch_22
        -0x779d7ab0 -> :sswitch_e
        -0x7785ec61 -> :sswitch_11
        -0x7677c49e -> :sswitch_b
        -0x731fb875 -> :sswitch_7
        -0x6bdae492 -> :sswitch_1e
        -0x68c614b2 -> :sswitch_1f
        -0x61b1b25b -> :sswitch_c
        -0x5838eb6c -> :sswitch_10
        -0x56f0b867 -> :sswitch_a
        -0x43e93da1 -> :sswitch_13
        -0x42d3ce9f -> :sswitch_8
        -0x32fb55bf -> :sswitch_17
        -0x2c78b99c -> :sswitch_4
        -0x2b773ccc -> :sswitch_24
        -0x23ed1809 -> :sswitch_6
        -0x1fab0c3b -> :sswitch_1f
        -0x1efa4983 -> :sswitch_22
        -0x1e6f8c42 -> :sswitch_13
        -0x1d7b09b1 -> :sswitch_5
        -0x1b905321 -> :sswitch_19
        -0x15e8b426 -> :sswitch_21
        -0x13cb0355 -> :sswitch_1
        -0x12d4e2ac -> :sswitch_1c
        -0xd535501 -> :sswitch_9
        -0x4833e40 -> :sswitch_c
        -0x12eefb1 -> :sswitch_10
        -0x10ce209 -> :sswitch_12
        -0xe95de6 -> :sswitch_21
        0x6a19c80 -> :sswitch_17
        0x921f05e -> :sswitch_0
        0x9a994ee -> :sswitch_19
        0xb639247 -> :sswitch_1b
        0x1224e517 -> :sswitch_14
        0x128d6233 -> :sswitch_f
        0x172c750f -> :sswitch_1e
        0x17b7c536 -> :sswitch_9
        0x1a22a0ba -> :sswitch_5
        0x1f7369c6 -> :sswitch_7
        0x1fcc0415 -> :sswitch_18
        0x20abf7e7 -> :sswitch_b
        0x21113006 -> :sswitch_23
        0x2614134d -> :sswitch_20
        0x2f4ad907 -> :sswitch_3
        0x2f5f695f -> :sswitch_15
        0x30334074 -> :sswitch_1b
        0x30ec0087 -> :sswitch_14
        0x329dfb94 -> :sswitch_8
        0x345f9eda -> :sswitch_3
        0x34fa4ad2 -> :sswitch_1c
        0x351d3b05 -> :sswitch_16
        0x3908d2ca -> :sswitch_20
        0x43bc67fa -> :sswitch_1d
        0x4904fdef -> :sswitch_e
        0x5422ab46 -> :sswitch_d
        0x5458d917 -> :sswitch_f
        0x56f992b6 -> :sswitch_1
        0x573ea649 -> :sswitch_23
        0x58839a3b -> :sswitch_2
        0x5d5f2e2d -> :sswitch_6
        0x67fd2592 -> :sswitch_15
        0x6819393f -> :sswitch_25
        0x6e725d7e -> :sswitch_d
        0x6f50d558 -> :sswitch_2
        0x6fd5f030 -> :sswitch_4
        0x7483e5d2 -> :sswitch_a
        0x74a1390f -> :sswitch_24
        0x74c5d68b -> :sswitch_0
        0x794f4b90 -> :sswitch_25
        0x79ca2713 -> :sswitch_16
        0x7d86e7a1 -> :sswitch_18
        0x7f0a174d -> :sswitch_1d
    .end sparse-switch
.end method

.method public final showToast(Ljava/lang/CharSequence;)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x283a9c2b

    sget v4, Ll/ۨ;->᩺᩷ۚ:I

    sget v5, Ll/ۘܿ;->ۘܰ۫:I

    const-string v6, "\u1a77\u1a79"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x2f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x27d5

    const v8, 0x7cca4b80

    xor-int/2addr v7, v8

    const v8, -0x5b2521eb

    :goto_0
    xor-int/2addr v6, v8

    :goto_1
    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, 0x598b

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    sget v6, Ll/֨۟;->᩹֫᩷:I

    if-nez v6, :cond_b

    goto/16 :goto_3

    .line 368
    :sswitch_0
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    sget v6, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez v6, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v6, "\u06d9\u073d"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x505

    const v8, -0x5a7cbf1f

    xor-int/2addr v7, v8

    const v8, -0x33998c02    # -6.0411896E7f

    goto :goto_0

    .line 190
    :sswitch_1
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    sget-boolean v6, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v6, :cond_9

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    goto/16 :goto_5

    .line 371
    :sswitch_3
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    return-void

    .line 172
    :sswitch_4
    invoke-static {p0, v2}, Ll/֨֫;->֡ۢ֨(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    goto/16 :goto_2

    :sswitch_5
    const/4 v6, 0x1

    .line 0
    invoke-static {v6, v2}, Ll/֨ۡ;->ۤ۠᩷(ILjava/lang/Object;)C

    move-result v6

    const/16 v7, 0x7d

    if-ne v6, v7, :cond_3

    const-string v6, "\u1a73\u0736"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7e97

    const v8, -0x60f7451b

    xor-int/2addr v7, v8

    const v8, 0x24c3c9b

    goto :goto_0

    .line 171
    :sswitch_6
    invoke-static {v2, v0}, Ll/֨֫;->֨ܳۗ(Ljava/lang/Object;I)C

    move-result v6

    const/16 v7, 0x7b

    if-ne v6, v7, :cond_3

    const-string v6, "\u06d6\u1a78"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x11

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x9e9

    const v8, 0x2d622ac1

    xor-int/2addr v7, v8

    const v8, 0x17cdb6af

    goto/16 :goto_0

    :sswitch_7
    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ll/֨֫;->ۡۚܽ(Ljava/lang/Object;)I

    move-result v6

    const/4 v7, 0x3

    if-lt v6, v7, :cond_3

    const-string v6, "\u06db\u05ab"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x59

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x35e5

    const v8, 0x45ee876

    xor-int/2addr v7, v8

    const v8, -0x5a200a57

    goto/16 :goto_0

    .line 443
    :sswitch_8
    sget-object v6, Ll/ܶܳ᩷;->ܳ:Ll/᩶᩻᩷;

    .line 86
    new-instance v6, Ll/֨ܳ᩷;

    .line 138
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v7

    if-nez v7, :cond_1

    goto/16 :goto_6

    .line 86
    :cond_1
    invoke-direct {v6, v0, v1}, Ll/֨ܳ᩷;-><init>(ILjava/lang/Object;)V

    invoke-static {v6}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 171
    :sswitch_9
    instance-of v0, p1, Ljava/lang/String;

    const/4 v6, 0x0

    if-eqz v0, :cond_2

    const-string v0, "\u06e2\u05a1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v5, v0

    mul-int/lit8 v0, v0, 0x43

    xor-int v7, v0, v4

    mul-int/lit16 v7, v7, 0x4ebd

    const v8, 0x1f6daabb

    xor-int/2addr v7, v8

    const v8, 0xc80b8a4

    xor-int/2addr v0, v8

    move v6, v0

    const/4 v0, 0x0

    goto/16 :goto_1

    :cond_2
    const/4 v0, 0x0

    :cond_3
    move-object v1, p1

    :goto_2
    const-string v6, "\u0730\u1a74"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x4931

    const v8, 0x5de5f2d7

    xor-int/2addr v7, v8

    const v8, 0x7bba30cb

    goto/16 :goto_0

    :sswitch_a
    sget v6, Ll/֨۟;->᩹֫᩷:I

    if-eqz v6, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v6, "\u06d9\u06d6"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x4d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x28a7

    const v8, 0x687dabac

    xor-int/2addr v7, v8

    const v8, 0x24352f25

    goto/16 :goto_0

    .line 347
    :sswitch_b
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v6

    if-gtz v6, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v6, "\u06e8\u1a7b"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7cbb

    const v8, 0x9b8536a

    xor-int/2addr v7, v8

    const v8, -0x64200188

    goto/16 :goto_0

    .line 221
    :sswitch_c
    sget v6, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v6, :cond_6

    goto :goto_3

    :cond_6
    const-string v6, "\u1a74\u06da"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x23

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x2cab

    const v8, 0x2e109692

    xor-int/2addr v7, v8

    const v8, -0x1ab0e9d9

    goto/16 :goto_0

    .line 105
    :sswitch_d
    sget-boolean v6, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v6, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v6, "\u1a74\u0736"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x35

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4401

    const v8, 0x11ce2ff6

    xor-int/2addr v7, v8

    const v8, 0x14cc6b1a

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v6, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v6, :cond_8

    goto/16 :goto_6

    :cond_8
    const-string v6, "\u06eb\u06e7"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0xf

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x7865

    const v8, 0x4e5e9681    # 9.3360134E8f

    xor-int/2addr v7, v8

    const v8, -0x38a9c368

    goto/16 :goto_0

    .line 442
    :sswitch_f
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v6

    if-ltz v6, :cond_a

    :cond_9
    :goto_3
    const-string v6, "\u06d6\u1a7a"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2a4d

    const v8, -0x3612bb05

    xor-int/2addr v7, v8

    const v8, -0x40193f75

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u06d9\u1a77"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7a33

    const v8, 0x59517867

    xor-int/2addr v7, v8

    const v8, -0x614d5779

    goto/16 :goto_0

    .line 46
    :sswitch_10
    sget v6, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v6, :cond_c

    :cond_b
    :goto_4
    const-string v6, "\u06dc\u0730"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x1d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7929

    const v8, -0x57ab6716

    xor-int/2addr v7, v8

    const v8, 0x35e17c64    # 1.6800009E-6f

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06d7\u1a73"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x464d

    const v8, 0x4b42433b    # 1.2731195E7f

    xor-int/2addr v7, v8

    const v8, 0x64b36be1

    goto/16 :goto_0

    .line 41
    :sswitch_11
    sget v6, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v6, :cond_d

    :goto_5
    const-string v6, "\u1a79\u06d8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x47

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4e1b

    const v8, -0x2b060d08

    xor-int/2addr v7, v8

    const v8, -0x6aff39f4

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u073a\u0730"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x59

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4079

    const v8, -0x158089f4

    xor-int/2addr v7, v8

    const v8, -0x3ce527

    goto/16 :goto_0

    :sswitch_12
    sget-boolean v6, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v6, :cond_e

    :goto_6
    const-string v6, "\u06d6\u06e2"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x75

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4bcb

    const v8, 0x2ba01254

    xor-int/2addr v7, v8

    const v8, 0xa92a4b6

    goto/16 :goto_0

    :cond_e
    const-string v6, "\u073a\u06e7"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x500b

    const v8, -0x647132f0

    xor-int/2addr v7, v8

    const v8, -0x7c28f4c9

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c0fb9cb -> :sswitch_b
        -0x75ebe9a0 -> :sswitch_4
        -0x67c570f9 -> :sswitch_10
        -0x66720a27 -> :sswitch_10
        -0x5ce31d91 -> :sswitch_7
        -0x5740b1d5 -> :sswitch_12
        -0x4e6c02b1 -> :sswitch_6
        -0x4d96a7d1 -> :sswitch_3
        -0x48dd62ca -> :sswitch_f
        -0x2e8cbafc -> :sswitch_c
        -0x258c318e -> :sswitch_1
        -0x1b2ffd17 -> :sswitch_b
        -0x13176bbb -> :sswitch_f
        -0x10012606 -> :sswitch_5
        -0xc1e27a9 -> :sswitch_8
        0x11ae991 -> :sswitch_5
        0x2cab6ee -> :sswitch_0
        0xb25641e -> :sswitch_9
        0x121a3fe1 -> :sswitch_d
        0x13841f33 -> :sswitch_a
        0x37bd3f37 -> :sswitch_2
        0x40ed411a -> :sswitch_4
        0x4595c795 -> :sswitch_11
        0x46fe2f4a -> :sswitch_a
        0x47d96210 -> :sswitch_1
        0x47fe1b70 -> :sswitch_e
        0x4a986105 -> :sswitch_e
        0x4c6d098f -> :sswitch_7
        0x4d00e23a -> :sswitch_0
        0x562d68f8 -> :sswitch_d
        0x57fdcae6 -> :sswitch_11
        0x59b91bf5 -> :sswitch_12
        0x672e0c85 -> :sswitch_6
        0x68bf7bd0 -> :sswitch_c
        0x740688e0 -> :sswitch_8
        0x74fcf259 -> :sswitch_9
        0x7a6c9a4c -> :sswitch_2
        0x7b5cfc50 -> :sswitch_3
    .end sparse-switch
.end method

.method public final varargs showToast(Ljava/lang/CharSequence;[Ljava/lang/Object;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v16, 0x7af5591d

    sget v17, Ll/ۗ᩷;->᩸᩺ᩳ:I

    sget v18, Ll/֨᩺;->ۨ֨۬:I

    const-string v19, "\u1a78\u06d7"

    invoke-static/range {v19 .. v19}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v19

    sub-int v19, v18, v19

    mul-int/lit8 v19, v19, 0x79

    xor-int v3, v19, v17

    mul-int/lit16 v3, v3, 0x43ed

    const v21, 0x65d5326

    xor-int v3, v3, v21

    const v21, -0x15ea21dd

    xor-int v19, v19, v21

    const/16 v20, 0x0

    :goto_0
    xor-int v1, v16, v17

    mul-int/lit16 v1, v1, 0x77b7

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v3

    xor-int v16, v19, v1

    sparse-switch v16, :sswitch_data_0

    .line 86
    new-instance v1, Ll/֨ܳ᩷;

    invoke-direct {v1, v8, v11}, Ll/֨ܳ᩷;-><init>(ILjava/lang/Object;)V

    invoke-static {v1}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 124
    :sswitch_0
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    sget-boolean v1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v1, :cond_1

    :cond_0
    move-object/from16 v1, p1

    goto/16 :goto_d

    :cond_1
    :goto_1
    move-object/from16 v1, p1

    goto/16 :goto_f

    .line 41
    :sswitch_1
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    sget-boolean v1, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v1, :cond_2

    goto :goto_3

    :cond_2
    move-object/from16 v1, p1

    goto/16 :goto_c

    .line 254
    :sswitch_2
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_3

    .line 376
    :sswitch_3
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    sget v1, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v1, :cond_4

    :cond_3
    :goto_2
    move-object/from16 v1, p1

    goto/16 :goto_e

    :cond_4
    move-object/from16 v1, p1

    goto/16 :goto_10

    .line 262
    :sswitch_4
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    sget v1, Ll/ۖ;->᩹۟ۘ:I

    if-gez v1, :cond_5

    goto :goto_2

    :cond_5
    move-object/from16 v1, p1

    goto/16 :goto_11

    :sswitch_5
    sget v1, Ll/ۘۨ;->۫᩸۠:I

    if-gez v1, :cond_6

    goto :goto_2

    :cond_6
    :goto_3
    const-string v1, "\u1a76\u0736"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0x5b

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0xe5b

    const v19, 0xd8476f5

    xor-int v3, v3, v19

    const v19, -0x2e5c258e

    goto/16 :goto_6

    :sswitch_6
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    sget v1, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v1, :cond_3

    :goto_4
    move-object/from16 v1, p1

    goto/16 :goto_b

    :sswitch_7
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    goto :goto_4

    :sswitch_8
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    return-void

    .line 453
    :sswitch_9
    aput-object v15, v2, v10

    goto/16 :goto_5

    .line 451
    :sswitch_a
    invoke-static {v0, v14}, Ll/֫ۡ;->᩻ۢۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_7

    const-string v1, "\u0733\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x37cd

    const v19, -0x295e06c9

    xor-int v3, v3, v19

    const v19, 0x4f5fb741

    goto/16 :goto_6

    .line 0
    :sswitch_b
    invoke-static {v7, v14}, Ll/ۨ;->ۘۜᩴ(ILjava/lang/Object;)C

    move-result v1

    if-ne v1, v4, :cond_7

    const-string v1, "\u06da\u06db"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x6e2f

    const v19, 0x6d11d4ef

    xor-int v3, v3, v19

    const v19, 0x475c1067

    goto/16 :goto_6

    .line 450
    :sswitch_c
    invoke-static {v14, v8}, Ll/֨֫;->֨ܳۗ(Ljava/lang/Object;I)C

    move-result v1

    if-ne v1, v5, :cond_7

    const-string v1, "\u05ab\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x1f

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x4913

    const v19, 0x57f39cf0

    xor-int v3, v3, v19

    const v19, -0x57274e4

    goto/16 :goto_6

    .line 172
    :sswitch_d
    invoke-static {v0, v9}, Ll/֫ۡ;->᩻ۢۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    move-object v13, v1

    move-object/from16 v1, p1

    goto/16 :goto_9

    .line 450
    :sswitch_e
    move-object v14, v12

    check-cast v14, Ljava/lang/String;

    invoke-static {v14}, Ll/֨֫;->ۡۚܽ(Ljava/lang/Object;)I

    move-result v1

    if-lt v1, v6, :cond_7

    const-string v1, "\u0730\u06ec"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x45

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x7d5f

    const v19, -0x2c154010

    xor-int v3, v3, v19

    const v19, -0x6c5db013

    goto/16 :goto_6

    :sswitch_f
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v1, p1

    goto/16 :goto_7

    .line 0
    :sswitch_10
    invoke-static {v7, v9}, Ll/ۨ;->ۘۜᩴ(ILjava/lang/Object;)C

    move-result v1

    if-ne v1, v4, :cond_9

    const-string v1, "\u0730\u1a7b"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x25

    xor-int v3, v1, v17

    mul-int/lit8 v3, v3, 0x5

    const v19, -0x3271985c

    xor-int v3, v3, v19

    const v19, 0x234377ff

    goto/16 :goto_6

    .line 450
    :sswitch_11
    aget-object v12, v2, v10

    instance-of v1, v12, Ljava/lang/String;

    if-eqz v1, :cond_7

    const-string v1, "\u073a\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x3d

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x5c3d

    const v19, -0x1b6d9638

    xor-int v3, v3, v19

    const v19, -0x2ebd292f

    goto/16 :goto_6

    :cond_7
    :goto_5
    const-string v1, "\u06e4\u06e8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x22cb

    const v19, 0x15f0aff6

    xor-int v3, v3, v19

    const v19, -0x853ad6a

    goto/16 :goto_6

    .line 457
    :sswitch_12
    invoke-static {v13}, Ll/֡۬;->ܺܽۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Ll/ۤ᩻᩷;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 458
    sget-object v1, Ll/ܶܳ᩷;->ܳ:Ll/᩶᩻᩷;

    .line 194
    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v1, :cond_8

    goto/16 :goto_1

    :cond_8
    const-string v1, "\u06d9\u06dc"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x5087

    const v19, 0x67e344b5

    xor-int v3, v3, v19

    const v19, -0x474ffc73

    goto :goto_6

    .line 171
    :sswitch_13
    invoke-static {v9, v8}, Ll/֫ۡ;->ܰ᩷ܺ(Ljava/lang/Object;I)C

    move-result v1

    if-ne v1, v5, :cond_9

    const-string v1, "\u05ab\u1a75"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x50af

    const v19, 0x6178b739

    xor-int v3, v3, v19

    const v19, 0x5bb7f012

    goto :goto_6

    :cond_9
    move-object/from16 v1, p1

    goto/16 :goto_8

    .line 449
    :sswitch_14
    array-length v1, v2

    if-ge v10, v1, :cond_a

    const-string v1, "\u06e4\u06d6"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x7d

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x5d79

    const v19, -0x55caddcc

    xor-int v3, v3, v19

    const v19, 0x7ff40d8e

    goto :goto_6

    :cond_a
    const-string v1, "\u06ec\u073d"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x6b

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x5e83

    const v19, -0x1194cb62

    xor-int v3, v3, v19

    const v19, -0x2de827bf

    :goto_6
    xor-int v19, v1, v19

    goto/16 :goto_0

    :sswitch_15
    move-object/from16 v1, p1

    .line 171
    move-object v9, v1

    check-cast v9, Ljava/lang/String;

    invoke-static {v9}, Ll/֨֫;->ۡۚܽ(Ljava/lang/Object;)I

    move-result v3

    if-lt v3, v6, :cond_b

    const-string v3, "\u1a76\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v18

    xor-int v0, v3, v17

    mul-int/lit16 v0, v0, 0x5cb5

    const v19, -0x26652627

    xor-int v0, v0, v19

    const v19, -0x3031dfb1

    xor-int v19, v3, v19

    move v3, v0

    goto/16 :goto_13

    :sswitch_16
    move-object/from16 v1, p1

    const/4 v0, 0x0

    const/4 v10, 0x0

    :goto_7
    const-string v0, "\u05a1\u1a73"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x1d

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x2467

    const v19, 0x21b5d9f6

    xor-int v3, v3, v19

    const v19, 0x5109e6a7

    goto/16 :goto_12

    :sswitch_17
    move-object/from16 v1, p1

    const/16 v5, 0x7b

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v20, :cond_b

    const-string v0, "\u073d\u06e0"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x31

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x415d

    const v19, -0x6f81cde2

    xor-int v3, v3, v19

    const v19, 0x694e9247

    goto/16 :goto_12

    :cond_b
    :goto_8
    move-object v13, v1

    :goto_9
    const-string v0, "\u06e4\u06db"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x4471

    const v19, -0x2f3cbcb0

    xor-int v3, v3, v19

    const v19, -0x2eb54ee9

    goto/16 :goto_12

    :sswitch_18
    move-object/from16 v1, p1

    instance-of v0, v1, Ljava/lang/String;

    .line 114
    sget-boolean v3, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v3, :cond_c

    const-string v3, "\u06da\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v18

    mul-int/lit16 v4, v4, 0x2a2d

    const v20, 0x174e022f

    xor-int v4, v4, v20

    const v20, 0x4741435b

    goto :goto_a

    :cond_c
    const-string v3, "\u073d\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v17

    mul-int/lit8 v3, v3, -0xd

    xor-int v4, v3, v18

    mul-int/lit16 v4, v4, -0x3dbf

    const v20, -0x43423af

    xor-int v4, v4, v20

    const v20, 0x27918b5a

    :goto_a
    xor-int v3, v3, v20

    move/from16 v20, v0

    move/from16 v19, v3

    move v3, v4

    const/16 v4, 0x7d

    goto/16 :goto_13

    :sswitch_19
    move-object/from16 v1, p1

    sget v0, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v0, :cond_d

    goto/16 :goto_e

    :cond_d
    const-string v0, "\u06e0\u06e8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x5b0d

    const v19, 0x2043a748

    xor-int v3, v3, v19

    const v19, 0x203bd0cf

    goto/16 :goto_12

    :sswitch_1a
    move-object/from16 v1, p1

    .line 427
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v0

    if-nez v0, :cond_e

    :goto_b
    const-string v0, "\u06d9\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x27

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0xd4b

    const v19, 0x6a59f8a6

    xor-int v3, v3, v19

    const v19, -0x14f1c4ed

    goto/16 :goto_12

    :cond_e
    const-string v0, "\u06ec\u06e0"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x5d

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0xff

    const v19, 0x16c3c916

    xor-int v3, v3, v19

    const v19, 0xd999a28

    goto/16 :goto_12

    :sswitch_1b
    move-object/from16 v1, p1

    .line 59
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v0

    if-eqz v0, :cond_f

    :goto_c
    const-string v0, "\u0736\u0733"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x5b91

    const v19, -0x78a726b2

    xor-int v3, v3, v19

    const v19, 0x7ae12a06

    goto/16 :goto_12

    :cond_f
    const-string v0, "\u06e7\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x89f

    const v19, 0x40595e81

    xor-int v3, v3, v19

    const v19, 0x103ac8e0

    goto/16 :goto_12

    :sswitch_1c
    move-object/from16 v1, p1

    .line 249
    sget v0, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v0, :cond_10

    :goto_d
    const-string v0, "\u06d8\u06d9"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x53

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x4a9d

    const v19, -0x57f7cca5

    xor-int v3, v3, v19

    const v19, -0x5f86e585

    goto/16 :goto_12

    :cond_10
    const-string v0, "\u06d8\u06eb"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x7df9

    const v19, -0x6d895adf

    xor-int v3, v3, v19

    const v19, 0x48fb60ec

    goto/16 :goto_12

    :sswitch_1d
    move-object/from16 v1, p1

    .line 281
    sget v0, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v0, :cond_11

    :goto_e
    const-string v0, "\u1a75\u1a77"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x51

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x4ef9

    const v19, 0x2ec6fd44

    xor-int v3, v3, v19

    const v19, 0x5d252892

    goto/16 :goto_12

    :cond_11
    const-string v0, "\u1a78\u06e2"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x2891

    const v19, 0x25ed95c6

    xor-int v3, v3, v19

    const v19, -0x5495eb8c

    goto/16 :goto_12

    :sswitch_1e
    move-object/from16 v1, p1

    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v0, :cond_12

    :goto_f
    const-string v0, "\u0736\u06d7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x531

    const v19, -0x45d6da16

    xor-int v3, v3, v19

    const v19, 0x3de8cc6a

    goto/16 :goto_12

    :cond_12
    const-string v0, "\u0733\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x576d

    const v19, -0x15f49ee3

    xor-int v3, v3, v19

    const v19, 0x2b2b0de

    goto :goto_12

    :sswitch_1f
    move-object/from16 v1, p1

    .line 412
    sget v0, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v0, :cond_13

    :goto_10
    const-string v0, "\u0730\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x9

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x192f

    const v19, 0xc710333

    xor-int v3, v3, v19

    const v19, 0x626c3600

    goto :goto_12

    :cond_13
    const-string v0, "\u05a8\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x31

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x1c5b

    const v19, 0x66bd80e0

    xor-int v3, v3, v19

    const v19, -0x55a587e7

    goto :goto_12

    :sswitch_20
    move-object/from16 v1, p1

    .line 289
    sget v0, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v0, :cond_14

    :goto_11
    const-string v0, "\u1a74\u1a76"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x7d1d

    const v19, 0x7bef879e

    xor-int v3, v3, v19

    const v19, -0x4700c0d9

    goto :goto_12

    :cond_14
    const-string v0, "\u1a76\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0xddf

    const v19, -0x7a810232

    xor-int v3, v3, v19

    const v19, 0x30999aba

    :goto_12
    xor-int v19, v0, v19

    :goto_13
    move-object/from16 v0, p0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e533d03 -> :sswitch_3
        -0x7caf2dfd -> :sswitch_13
        -0x7b8a0e36 -> :sswitch_16
        -0x7a06d7f8 -> :sswitch_e
        -0x73f84a9c -> :sswitch_13
        -0x728d2357 -> :sswitch_1b
        -0x6f7b4dd2 -> :sswitch_9
        -0x6d7f490c -> :sswitch_16
        -0x55b20543 -> :sswitch_15
        -0x4bab175b -> :sswitch_2
        -0x4b99aa7a -> :sswitch_f
        -0x3ec33b93 -> :sswitch_12
        -0x3a6fd378 -> :sswitch_1c
        -0x38eba04f -> :sswitch_10
        -0x357c1d4d -> :sswitch_1c
        -0x352b856c -> :sswitch_1
        -0x3484d851 -> :sswitch_f
        -0x2b1d7654 -> :sswitch_1a
        -0x29b6aa83 -> :sswitch_c
        -0x26e943f8 -> :sswitch_5
        -0x1cb098d2 -> :sswitch_20
        -0x1325678a -> :sswitch_4
        -0x10913c8e -> :sswitch_d
        -0x30c13d8 -> :sswitch_20
        -0x21bc95f -> :sswitch_18
        0x1aecdcd -> :sswitch_8
        0x1f72d3b -> :sswitch_4
        0x3120501 -> :sswitch_14
        0x49610b2 -> :sswitch_a
        0xddb3164 -> :sswitch_14
        0x12d2f1ee -> :sswitch_1d
        0x146ee55f -> :sswitch_17
        0x17940417 -> :sswitch_1e
        0x20965b1f -> :sswitch_17
        0x21088e6e -> :sswitch_b
        0x26ab6029 -> :sswitch_0
        0x28accc57 -> :sswitch_15
        0x29117652 -> :sswitch_1b
        0x2eb59e34 -> :sswitch_9
        0x2f06b000 -> :sswitch_7
        0x3127a588 -> :sswitch_11
        0x35c88d55 -> :sswitch_a
        0x392b172f -> :sswitch_2
        0x39a9c296 -> :sswitch_6
        0x41788d53 -> :sswitch_1d
        0x41d1c16a -> :sswitch_18
        0x432a10b5 -> :sswitch_1e
        0x4605f976 -> :sswitch_d
        0x4764422e -> :sswitch_c
        0x4f313bbf -> :sswitch_11
        0x53645230 -> :sswitch_19
        0x53f0cf90 -> :sswitch_1a
        0x59441e68 -> :sswitch_0
        0x5a0735d2 -> :sswitch_3
        0x5c02e7a6 -> :sswitch_1
        0x5e36ce99 -> :sswitch_e
        0x6286338c -> :sswitch_b
        0x658933db -> :sswitch_12
        0x684ea2cd -> :sswitch_10
        0x68f2aefd -> :sswitch_7
        0x6d9f33c5 -> :sswitch_8
        0x6db6cb93 -> :sswitch_19
        0x73507a00 -> :sswitch_1f
        0x73c0f5c7 -> :sswitch_1f
        0x7ab87a90 -> :sswitch_6
        0x7d529847 -> :sswitch_5
    .end sparse-switch
.end method

.method public final showToastL(Ljava/lang/CharSequence;)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x2a83d31c

    sget v4, Ll/֨᩺;->ۨ֨۬:I

    sget v5, Ll/ۙۨ;->ۡۗۙ:I

    const-string v6, "\u05a1\u0733"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x35

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x4ab5

    const v8, -0x31fc6119    # -5.5205728E8f

    xor-int/2addr v7, v8

    const v8, -0x181e24b8

    :goto_0
    xor-int/2addr v6, v8

    :goto_1
    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x4cbd

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 171
    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ll/֫ۡ;->᩻ܳܽ(Ljava/lang/Object;)I

    move-result v6

    const/4 v7, 0x3

    if-lt v6, v7, :cond_2

    const-string v6, "\u073d\u06df"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x9

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7845

    const v8, -0xd4e6c0

    xor-int/2addr v7, v8

    const v8, -0x2218a631

    goto :goto_0

    :sswitch_0
    sget v6, Ll/ۙۨ;->ۡۗۙ:I

    if-lez v6, :cond_b

    goto/16 :goto_4

    .line 402
    :sswitch_1
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    sget-boolean v6, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v6, :cond_5

    goto/16 :goto_7

    .line 437
    :sswitch_2
    sget v6, Ll/֡۬;->۠֡᩶:I

    if-gtz v6, :cond_d

    goto/16 :goto_5

    .line 320
    :sswitch_3
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    goto/16 :goto_5

    .line 208
    :sswitch_4
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    return-void

    .line 172
    :sswitch_5
    invoke-static {p0, v2}, Ll/֫ۡ;->᩻ۢۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    goto :goto_2

    :sswitch_6
    const/4 v6, 0x1

    .line 0
    invoke-static {v6, v2}, Ll/֨ۡ;->ۤ۠᩷(ILjava/lang/Object;)C

    move-result v6

    const/16 v7, 0x7d

    if-ne v6, v7, :cond_2

    const-string v6, "\u1a7b\u06e7"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x43

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0xd4d

    const v8, 0x9360a2d

    xor-int/2addr v7, v8

    const v8, 0x21e886e0

    goto :goto_0

    .line 171
    :sswitch_7
    invoke-static {v2, v0}, Ll/֨֫;->֨ܳۗ(Ljava/lang/Object;I)C

    move-result v6

    const/16 v7, 0x7b

    if-ne v6, v7, :cond_2

    const-string v6, "\u06ec\u05ab"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x2b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x373b

    const v8, 0x3fc1d87d

    xor-int/2addr v7, v8

    const v8, 0x2098f1e7

    goto/16 :goto_0

    .line 464
    :sswitch_8
    sget-object v6, Ll/ܶܳ᩷;->ܳ:Ll/᩶᩻᩷;

    .line 90
    new-instance v6, Ll/۠ܳ᩷;

    .line 139
    sget v7, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v7, :cond_0

    goto :goto_3

    .line 90
    :cond_0
    invoke-direct {v6, v0, v1}, Ll/۠ܳ᩷;-><init>(ILjava/lang/Object;)V

    invoke-static {v6}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 171
    :sswitch_9
    instance-of v0, p1, Ljava/lang/String;

    const/4 v6, 0x0

    if-eqz v0, :cond_1

    const-string v0, "\u1a7b\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v5, v0

    mul-int/lit8 v0, v0, 0x3f

    xor-int v7, v0, v4

    mul-int/lit16 v7, v7, 0xc85

    const v8, -0x1ee4abc2

    xor-int/2addr v7, v8

    const v8, -0x74301188

    xor-int/2addr v0, v8

    move v6, v0

    const/4 v0, 0x0

    goto/16 :goto_1

    :cond_1
    const/4 v0, 0x0

    :cond_2
    move-object v1, p1

    :goto_2
    const-string v6, "\u1a74\u05a8"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1841

    const v8, 0x5544a834

    xor-int/2addr v7, v8

    const v8, -0x3006c75b

    goto/16 :goto_0

    .line 416
    :sswitch_a
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v6

    if-nez v6, :cond_3

    :goto_3
    const-string v6, "\u06e7\u05a1"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x77c5

    const v8, 0x786d8af7

    xor-int/2addr v7, v8

    const v8, 0x286e2a2

    goto/16 :goto_0

    :cond_3
    const-string v6, "\u0733\u073a"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5d27

    const v8, -0x65f2b121

    xor-int/2addr v7, v8

    const v8, 0x3e6f4f47

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v6

    if-ltz v6, :cond_4

    goto :goto_4

    :cond_4
    const-string v6, "\u1a7a\u05a8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x69

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6823

    const v8, -0x631e9513

    xor-int/2addr v7, v8

    const v8, 0x7c23d4af

    goto/16 :goto_0

    .line 5
    :sswitch_c
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v6

    if-eqz v6, :cond_6

    :cond_5
    :goto_4
    const-string v6, "\u073d\u06db"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7f99

    const v8, 0x4a817ec3    # 4243297.5f

    xor-int/2addr v7, v8

    const v8, -0x343ae8e6    # -2.5833012E7f

    goto/16 :goto_0

    :cond_6
    const-string v6, "\u06d8\u0736"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x59b

    const v8, 0x5bdffcfb

    xor-int/2addr v7, v8

    const v8, 0x1abd98ca

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v6

    if-ltz v6, :cond_7

    goto/16 :goto_7

    :cond_7
    const-string v6, "\u06dc\u06d8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x49

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4c53

    const v8, -0xb78673

    xor-int/2addr v7, v8

    const v8, 0x61dae663

    goto/16 :goto_0

    :sswitch_e
    sget v6, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v6, :cond_8

    goto :goto_6

    :cond_8
    const-string v6, "\u06db\u1a77"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x6f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3543

    const v8, -0x2bc00ad0

    xor-int/2addr v7, v8

    const v8, 0x6bec541c

    goto/16 :goto_0

    .line 220
    :sswitch_f
    sget v6, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v6, :cond_9

    goto :goto_6

    :cond_9
    const-string v6, "\u073f\u06dc"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1e87

    const v8, -0x35306a2

    xor-int/2addr v7, v8

    const v8, 0xe01ae07

    goto/16 :goto_0

    .line 299
    :sswitch_10
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v6

    if-nez v6, :cond_a

    :goto_5
    const-string v6, "\u05a1\u05a8"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x52b

    const v8, -0x487bd169

    xor-int/2addr v7, v8

    const v8, 0x38823b1d

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u06e8\u06e0"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x45

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x3da5

    const v8, 0x577fec63

    xor-int/2addr v7, v8

    const v8, 0x25f3a5fd

    goto/16 :goto_0

    .line 140
    :sswitch_11
    sget-boolean v6, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v6, :cond_c

    :cond_b
    :goto_6
    const-string v6, "\u1a73\u073f"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x116b

    const v8, 0x26118a89

    xor-int/2addr v7, v8

    const v8, -0x5da4aa79

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u1a7a\u0733"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x51ad

    const v8, -0x52fce41d

    xor-int/2addr v7, v8

    const v8, -0x1b0dfbfe

    goto/16 :goto_0

    .line 438
    :sswitch_12
    sget-boolean v6, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v6, :cond_e

    :cond_d
    :goto_7
    const-string v6, "\u1a76\u1a73"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x883

    const v8, -0x57d64cb

    xor-int/2addr v7, v8

    const v8, -0x3ecd7059

    goto/16 :goto_0

    :cond_e
    const-string v6, "\u073d\u073d"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x41

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x299f

    const v8, -0x7d8bb8aa

    xor-int/2addr v7, v8

    const v8, 0x40315b92

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x766812a2 -> :sswitch_11
        -0x71a38898 -> :sswitch_4
        -0x66d4a4d6 -> :sswitch_3
        -0x5fce9f68 -> :sswitch_d
        -0x5c9da477 -> :sswitch_0
        -0x59b84312 -> :sswitch_f
        -0x54a4b022 -> :sswitch_6
        -0x43af1198 -> :sswitch_6
        -0x3db51ec5 -> :sswitch_10
        -0x3d613c5f -> :sswitch_b
        -0x3b652b92 -> :sswitch_1
        -0x392054ea -> :sswitch_a
        -0x344cfcfb -> :sswitch_8
        -0x317262f2 -> :sswitch_c
        -0x1e6d4ac1 -> :sswitch_1
        -0x1d149f2e -> :sswitch_12
        -0x19308b68 -> :sswitch_d
        -0x1875e026 -> :sswitch_3
        -0x16be202f -> :sswitch_8
        -0x1281d11c -> :sswitch_2
        -0x3bdf8e7 -> :sswitch_5
        0x38b74c4 -> :sswitch_5
        0x3997f7b -> :sswitch_e
        0x243de7f8 -> :sswitch_0
        0x24bf12cf -> :sswitch_10
        0x28ba97ba -> :sswitch_e
        0x330e217c -> :sswitch_11
        0x344b1fae -> :sswitch_9
        0x3540a44b -> :sswitch_c
        0x3c069d54 -> :sswitch_b
        0x40317fb5 -> :sswitch_7
        0x4f3d33c5 -> :sswitch_a
        0x51dea32b -> :sswitch_7
        0x608205f1 -> :sswitch_f
        0x72d0f42f -> :sswitch_12
        0x78624881 -> :sswitch_2
        0x7b4854ae -> :sswitch_4
        0x7da572b4 -> :sswitch_9
    .end sparse-switch
.end method

.method public final varargs showToastL(Ljava/lang/CharSequence;[Ljava/lang/Object;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v16, -0x1cd6bfd3

    sget v17, Ll/ۘۛ;->ۖۚ֡:I

    sget v18, Ll/᩺;->ۙۛܶ:I

    const-string v19, "\u06dc\u0733"

    invoke-static/range {v19 .. v19}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v19

    sub-int v19, v18, v19

    mul-int/lit8 v19, v19, -0x65

    xor-int v3, v19, v17

    mul-int/lit16 v3, v3, -0x17e5

    const v21, -0x48546ffa

    xor-int v3, v3, v21

    const v21, 0x78b1060e

    xor-int v19, v19, v21

    const/16 v20, 0x0

    :goto_0
    xor-int v1, v16, v17

    mul-int/lit16 v1, v1, 0x7265

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v3

    xor-int v16, v19, v1

    sparse-switch v16, :sswitch_data_0

    move-object/from16 v1, p1

    .line 72
    sget-boolean v0, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v0, :cond_10

    goto/16 :goto_a

    .line 418
    :sswitch_0
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v1, p1

    goto/16 :goto_a

    :cond_1
    :goto_2
    move-object/from16 v1, p1

    goto/16 :goto_c

    :sswitch_1
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    sget v1, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v1, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v1, p1

    goto/16 :goto_d

    .line 305
    :sswitch_2
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    sget-boolean v1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v1, :cond_4

    :cond_3
    :goto_3
    move-object/from16 v1, p1

    goto/16 :goto_e

    :cond_4
    const-string v1, "\u06e4\u06d9"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x1d

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x3f7d

    const v19, -0x3737fed0    # -409609.5f

    xor-int v3, v3, v19

    const v19, 0x1d398396

    goto/16 :goto_6

    .line 28
    :sswitch_3
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget v1, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v1, :cond_5

    goto :goto_3

    :cond_5
    const-string v1, "\u1a7b\u06d8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x67

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x19c5

    const v19, -0x7563f20d

    xor-int v3, v3, v19

    const v19, 0x7d45bf02

    goto/16 :goto_6

    .line 449
    :sswitch_4
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    sget v1, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v1, :cond_6

    goto :goto_3

    :cond_6
    const-string v1, "\u1a75\u05a8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x5537

    const v19, 0x53006ec3

    xor-int v3, v3, v19

    const v19, -0x63e8f3f4

    goto/16 :goto_6

    .line 22
    :sswitch_5
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    sget v1, Ll/ۗۗ;->ۨ۬ۖ:I

    if-gez v1, :cond_0

    goto :goto_3

    :sswitch_6
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    sget v1, Ll/ۘۘ;->᩷ۙ᩸:I

    if-gez v1, :cond_3

    goto :goto_4

    .line 93
    :sswitch_7
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    :goto_4
    const-string v1, "\u06e8\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x1c41

    const v19, -0x1525df31

    xor-int v3, v3, v19

    const v19, 0x291f3dce

    goto/16 :goto_6

    .line 389
    :sswitch_8
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    return-void

    .line 474
    :sswitch_9
    aput-object v15, v2, v10

    goto/16 :goto_5

    .line 472
    :sswitch_a
    invoke-static {v0, v14}, Ll/֫ۡ;->᩻ۢۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_7

    const-string v1, "\u0730\u06e4"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x4fbb

    const v19, -0x24956a7e

    xor-int v3, v3, v19

    const v19, -0x216985a4

    goto/16 :goto_6

    .line 0
    :sswitch_b
    invoke-static {v7, v14}, Ll/֨ۡ;->ۤ۠᩷(ILjava/lang/Object;)C

    move-result v1

    if-ne v1, v4, :cond_7

    const-string v1, "\u0733\u06d8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x7b

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x3315

    const v19, 0x27de67ea

    xor-int v3, v3, v19

    const v19, 0x578f82c9

    goto/16 :goto_6

    .line 471
    :sswitch_c
    invoke-static {v14, v8}, Ll/֫ۡ;->ܰ᩷ܺ(Ljava/lang/Object;I)C

    move-result v1

    if-ne v1, v5, :cond_7

    const-string v1, "\u1a7b\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0xb

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x595b

    const v19, -0x6e1ea6fb

    xor-int v3, v3, v19

    const v19, -0x43000f37

    goto/16 :goto_6

    .line 172
    :sswitch_d
    invoke-static {v0, v9}, Ll/֫ۡ;->᩻ۢۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_9

    move-object v13, v1

    move-object/from16 v1, p1

    goto/16 :goto_9

    .line 471
    :sswitch_e
    move-object v14, v12

    check-cast v14, Ljava/lang/String;

    invoke-static {v14}, Ll/֫ۡ;->᩻ܳܽ(Ljava/lang/Object;)I

    move-result v1

    if-lt v1, v6, :cond_7

    const-string v1, "\u06e7\u1a7b"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x51

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x3045

    const v19, -0x4041559f

    xor-int v3, v3, v19

    const v19, 0x40edc3d8

    goto/16 :goto_6

    :sswitch_f
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v1, p1

    goto/16 :goto_7

    .line 0
    :sswitch_10
    invoke-static {v7, v9}, Ll/֨ۡ;->ۤ۠᩷(ILjava/lang/Object;)C

    move-result v1

    if-ne v1, v4, :cond_9

    const-string v1, "\u1a78\u1a78"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x6225

    const v19, 0x25bcd6f7

    xor-int v3, v3, v19

    const v19, 0x62a11c56

    goto/16 :goto_6

    .line 471
    :sswitch_11
    aget-object v12, v2, v10

    instance-of v1, v12, Ljava/lang/String;

    if-eqz v1, :cond_7

    const-string v1, "\u06ec\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x2cdf

    const v19, -0x724b27a4

    xor-int v3, v3, v19

    const v19, -0x591c2488

    goto/16 :goto_6

    :cond_7
    :goto_5
    const-string v1, "\u06df\u0736"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x1075

    const v19, 0x6b3d217d

    xor-int v3, v3, v19

    const v19, 0x52bc846e

    goto/16 :goto_6

    .line 90
    :sswitch_12
    new-instance v1, Ll/۠ܳ᩷;

    invoke-direct {v1, v8, v11}, Ll/۠ܳ᩷;-><init>(ILjava/lang/Object;)V

    invoke-static {v1}, Lbin/mt/plugin/api/util/ThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    .line 478
    :sswitch_13
    invoke-static {v13}, Ll/֡۬;->ܺܽۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Ll/ۤ᩻᩷;->֫(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 479
    sget-object v1, Ll/ܶܳ᩷;->ܳ:Ll/᩶᩻᩷;

    .line 391
    sget v1, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v1, :cond_8

    goto/16 :goto_2

    :cond_8
    const-string v1, "\u1a77\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x5933

    const v19, 0x5f6da000

    xor-int v3, v3, v19

    const v19, -0x5251afac

    goto :goto_6

    .line 171
    :sswitch_14
    invoke-static {v9, v8}, Ll/֫ۡ;->ܰ᩷ܺ(Ljava/lang/Object;I)C

    move-result v1

    if-ne v1, v5, :cond_9

    const-string v1, "\u06db\u06d6"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x7d

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x6d6d

    const v19, -0x46535adb

    xor-int v3, v3, v19

    const v19, -0x4e909a07

    goto :goto_6

    :cond_9
    move-object/from16 v1, p1

    goto/16 :goto_8

    .line 470
    :sswitch_15
    array-length v1, v2

    if-ge v10, v1, :cond_a

    const-string v1, "\u06eb\u1a79"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x73

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x2041

    const v19, -0x7e23a436

    xor-int v3, v3, v19

    const v19, -0x27a68b9e

    goto :goto_6

    :cond_a
    const-string v1, "\u06eb\u1a75"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x1f27

    const v19, 0xc4120f1

    xor-int v3, v3, v19

    const v19, -0x750280ed

    :goto_6
    xor-int v19, v1, v19

    goto/16 :goto_0

    :sswitch_16
    move-object/from16 v1, p1

    .line 171
    move-object v9, v1

    check-cast v9, Ljava/lang/String;

    invoke-static {v9}, Ll/֨֫;->ۡۚܽ(Ljava/lang/Object;)I

    move-result v3

    if-lt v3, v6, :cond_b

    const-string v3, "\u06e2\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v18

    xor-int v0, v3, v17

    mul-int/lit16 v0, v0, 0x64a9

    const v19, -0x31ff33a1

    xor-int v0, v0, v19

    const v19, 0x3454b7d4

    xor-int v19, v3, v19

    move v3, v0

    goto/16 :goto_10

    :sswitch_17
    move-object/from16 v1, p1

    const/4 v0, 0x0

    const/4 v10, 0x0

    :goto_7
    const-string v0, "\u06e8\u06e8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x59e3

    const v19, 0x4fc8310f

    xor-int v3, v3, v19

    const v19, -0x556fb529

    goto/16 :goto_f

    :sswitch_18
    move-object/from16 v1, p1

    const/16 v5, 0x7b

    const/4 v6, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v20, :cond_b

    const-string v0, "\u06eb\u06dc"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x47d7

    const v19, -0x1a1ce14b

    xor-int v3, v3, v19

    const v19, -0xb3be7c2

    goto/16 :goto_f

    :cond_b
    :goto_8
    move-object v13, v1

    :goto_9
    const-string v0, "\u1a75\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x14a7

    const v19, -0x394b28c3

    xor-int v3, v3, v19

    const v19, -0x3ba0de8e

    goto/16 :goto_f

    :sswitch_19
    move-object/from16 v1, p1

    instance-of v0, v1, Ljava/lang/String;

    .line 169
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v3

    if-gtz v3, :cond_c

    move/from16 v20, v0

    const/16 v4, 0x7d

    goto/16 :goto_b

    :cond_c
    const-string v3, "\u1a79\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v18

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x5921

    const v20, -0x253ac99a

    xor-int v4, v4, v20

    const v20, -0x350e6661    # -7916751.5f

    xor-int v3, v3, v20

    move/from16 v20, v0

    move/from16 v19, v3

    move v3, v4

    const/16 v4, 0x7d

    goto/16 :goto_10

    :sswitch_1a
    move-object/from16 v1, p1

    .line 31
    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v0, :cond_d

    goto/16 :goto_c

    :cond_d
    const-string v0, "\u05a8\u06d9"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x3

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x68e1

    const v19, -0x5e92d8a4

    xor-int v3, v3, v19

    const v19, -0x70a09b4e

    goto/16 :goto_f

    :sswitch_1b
    move-object/from16 v1, p1

    sget v0, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v0, :cond_e

    goto/16 :goto_d

    :cond_e
    const-string v0, "\u073f\u0730"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x4327

    const v19, -0x4cb3c999

    xor-int v3, v3, v19

    const v19, -0x7e4a82dd

    goto/16 :goto_f

    :sswitch_1c
    move-object/from16 v1, p1

    .line 391
    sget v0, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v0, :cond_f

    goto :goto_a

    :cond_f
    const-string v0, "\u06dc\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x7c83

    const v19, 0x693695cc

    xor-int v3, v3, v19

    const v19, -0x4971e2ed

    goto/16 :goto_f

    :goto_a
    const-string v0, "\u06dc\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x57

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x4593

    const v19, 0x25431ca4

    xor-int v3, v3, v19

    const v19, 0x6336ef74

    goto/16 :goto_f

    :cond_10
    const-string v0, "\u1a79\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x63

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, 0x2621

    const v19, 0x620b5e10

    xor-int v3, v3, v19

    const v19, -0x58ccda87

    goto/16 :goto_f

    :sswitch_1d
    move-object/from16 v1, p1

    .line 463
    sget v0, Ll/۠;->ܺܺܶ:I

    if-ltz v0, :cond_11

    :goto_b
    const-string v0, "\u0733\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x210f

    const v19, 0x549ecd0d

    xor-int v3, v3, v19

    const v19, 0x47f7823e

    goto/16 :goto_f

    :cond_11
    const-string v0, "\u06d7\u073f"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x5d65

    const v19, 0xf9dd742

    xor-int v3, v3, v19

    const v19, 0x2c5fe84f

    goto/16 :goto_f

    :sswitch_1e
    move-object/from16 v1, p1

    .line 322
    sget v0, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v0, :cond_12

    :goto_c
    const-string v0, "\u073f\u05a8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x41d7

    const v19, -0x7b534a00

    xor-int v3, v3, v19

    const v19, -0x7c885453

    goto/16 :goto_f

    :cond_12
    const-string v0, "\u0733\u0733"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x45

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x722b

    const v19, 0x57c950df

    xor-int v3, v3, v19

    const v19, 0x6e7659b3

    goto :goto_f

    :sswitch_1f
    move-object/from16 v1, p1

    sget v0, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v0, :cond_13

    :goto_d
    const-string v0, "\u06e7\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x27

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x12bb

    const v19, -0x60606950

    xor-int v3, v3, v19

    const v19, -0x37332e6f

    goto :goto_f

    :cond_13
    const-string v0, "\u06d9\u06d9"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x43

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x7ca1

    const v19, 0x57a2f537

    xor-int v3, v3, v19

    const v19, -0x30cf8ab4

    goto :goto_f

    :sswitch_20
    move-object/from16 v1, p1

    sget v0, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v0, :cond_14

    :goto_e
    const-string v0, "\u1a7b\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x76f9

    const v19, 0x1d4a2abb

    xor-int v3, v3, v19

    const v19, 0x762fcc5b

    goto :goto_f

    :cond_14
    const-string v0, "\u0733\u1a77"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x50e1

    const v19, 0x1ccd07fb

    xor-int v3, v3, v19

    const v19, 0x7debe28e

    :goto_f
    xor-int v19, v0, v19

    :goto_10
    move-object/from16 v0, p0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fda8526 -> :sswitch_8
        -0x78015156 -> :sswitch_1f
        -0x72917343 -> :sswitch_10
        -0x7284e460 -> :sswitch_1c
        -0x6de27276 -> :sswitch_16
        -0x6cffd369 -> :sswitch_e
        -0x67b1935d -> :sswitch_12
        -0x66c29ff4 -> :sswitch_1c
        -0x666e5b6f -> :sswitch_3
        -0x65573cbc -> :sswitch_a
        -0x608c6ecc -> :sswitch_15
        -0x5fef643c -> :sswitch_5
        -0x5d7aad64 -> :sswitch_17
        -0x5b55f7ae -> :sswitch_c
        -0x533fd018 -> :sswitch_4
        -0x4e04623c -> :sswitch_1b
        -0x4cf2ae4f -> :sswitch_a
        -0x4aefad37 -> :sswitch_12
        -0x496bb4f9 -> :sswitch_1
        -0x47b028f3 -> :sswitch_9
        -0x41b66e3f -> :sswitch_6
        -0x3fde942f -> :sswitch_b
        -0x3a8bfdb6 -> :sswitch_20
        -0x3561c7e7 -> :sswitch_c
        -0x2fa8718e -> :sswitch_1b
        -0x2ef476c8 -> :sswitch_19
        -0x2ce0fa89 -> :sswitch_6
        -0x2b744e1f -> :sswitch_13
        -0x18932de9 -> :sswitch_1a
        -0x146b276d -> :sswitch_11
        -0x13db38e4 -> :sswitch_13
        -0xdff3b3a -> :sswitch_2
        -0xd53edc9 -> :sswitch_11
        -0x7ac3c00 -> :sswitch_0
        -0x5492b97 -> :sswitch_15
        -0x53282c6 -> :sswitch_5
        -0xee5b03 -> :sswitch_18
        0x1b75eef -> :sswitch_14
        0x47b1bb3 -> :sswitch_d
        0x6136eb7 -> :sswitch_20
        0x7386ba0 -> :sswitch_1
        0x7994366 -> :sswitch_d
        0x10f5b8a1 -> :sswitch_7
        0x12402e5a -> :sswitch_f
        0x139db6e6 -> :sswitch_b
        0x1758013e -> :sswitch_14
        0x17e22502 -> :sswitch_1d
        0x1b3253cf -> :sswitch_1f
        0x1c91b839 -> :sswitch_1d
        0x1cfce67a -> :sswitch_8
        0x1ed3d8d1 -> :sswitch_10
        0x212e337e -> :sswitch_0
        0x2a6bac7b -> :sswitch_1e
        0x2f82f02c -> :sswitch_4
        0x346510bc -> :sswitch_f
        0x44704758 -> :sswitch_3
        0x4fd5d0eb -> :sswitch_19
        0x52f04c2e -> :sswitch_16
        0x5c43c0b1 -> :sswitch_1a
        0x5c6e2524 -> :sswitch_17
        0x60c8124b -> :sswitch_7
        0x63e9427d -> :sswitch_2
        0x6e6f7802 -> :sswitch_18
        0x7189cba2 -> :sswitch_1e
        0x78492a81 -> :sswitch_e
        0x7a0de475 -> :sswitch_9
    .end sparse-switch
.end method

.method public final ֫(Ljava/lang/String;)Ll/᩶᩻᩷;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v15, -0x1b1666fc

    sget v16, Ll/֡֡;->֫ۤܳ:I

    sget v17, Ll/֨ᩴ;->ۢ֨ۖ:I

    const-string v18, "\u1a78\u073a"

    invoke-static/range {v18 .. v18}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v18

    sub-int v18, v17, v18

    mul-int/lit8 v18, v18, -0x41

    xor-int v2, v18, v16

    mul-int/lit16 v2, v2, -0x31cf

    const v20, -0x4b5db7b0

    xor-int v2, v2, v20

    const v20, 0x3d03c767

    xor-int v18, v18, v20

    const/16 v19, 0x0

    :goto_0
    xor-int v15, v15, v16

    mul-int/lit16 v15, v15, -0x4953

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v2, v15

    xor-int v15, v18, v2

    sparse-switch v15, :sswitch_data_0

    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    mul-int v2, v10, v13

    sub-int v2, v12, v2

    if-gez v2, :cond_c

    const-string v2, "\u1a75\u0730"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, -0x427d

    const v9, -0x6b57e99f

    xor-int/2addr v8, v9

    const v9, 0x3ab99d9

    goto/16 :goto_b

    .line 171
    :sswitch_0
    sget-boolean v2, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v2, :cond_1

    :cond_0
    :goto_1
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    goto/16 :goto_7

    :cond_1
    move-object/from16 v20, v8

    move/from16 v18, v15

    goto :goto_3

    .line 160
    :sswitch_1
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    sget v2, Ll/ۗۚ;->ܶۛᩴ:I

    if-gez v2, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v20, v8

    move/from16 v18, v15

    goto/16 :goto_c

    .line 85
    :sswitch_2
    sget v2, Ll/֫ܽ;->ۚ᩷᩹:I

    if-gez v2, :cond_0

    :goto_2
    move/from16 v21, v9

    move/from16 v18, v15

    goto/16 :goto_f

    :sswitch_3
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    goto :goto_2

    .line 262
    :sswitch_4
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    const/4 v1, 0x0

    return-object v1

    .line 272
    :sswitch_5
    new-instance v2, Ll/᩶᩻᩷;

    move/from16 v18, v15

    sget-object v15, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    move-object/from16 v20, v8

    .line 73
    sget v21, Ll/ۛ;->᩺᩻֫:I

    if-ltz v21, :cond_3

    :goto_3
    const-string v2, "\u06d7\u06e7"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v16, v2

    mul-int/lit8 v2, v2, 0x29

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, 0x748f

    const v15, -0x3886ef5a

    xor-int/2addr v8, v15

    const v15, -0x2316f110

    goto/16 :goto_d

    :cond_3
    const/4 v8, 0x7

    .line 152
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v22

    if-nez v22, :cond_4

    move/from16 v21, v9

    goto/16 :goto_a

    :cond_4
    move/from16 v21, v9

    const/16 v9, 0x6f

    .line 272
    invoke-static {v15, v9, v8, v14}, Ll/֫ۧ;->᩷ᩳ᩺([SIII)Ljava/lang/String;

    move-result-object v8

    .line 0
    invoke-static {v8, v1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 265
    sget v9, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v9, :cond_5

    :goto_4
    move/from16 v9, v21

    goto/16 :goto_c

    .line 272
    :cond_5
    iget-object v9, v0, Ll/ۤ᩻᩷;->ۡ:Ll/֨᩻᩷;

    invoke-direct {v2, v0, v1, v8, v9}, Ll/᩶᩻᩷;-><init>(Ll/ۤ᩻᩷;Ljava/lang/String;Ljava/lang/String;Ll/֨᩻᩷;)V

    .line 273
    new-instance v8, Ljava/lang/ref/SoftReference;

    sget-boolean v9, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v9, :cond_6

    goto/16 :goto_a

    :cond_6
    invoke-direct {v8, v2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 274
    invoke-virtual {v4, v1, v8}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v7, v2

    goto :goto_5

    :sswitch_6
    return-object v7

    :sswitch_7
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    .line 269
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶᩻᩷;

    goto :goto_6

    :sswitch_8
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    if-nez v6, :cond_7

    const-string v2, "\u06e2\u073f"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, 0x5b3b

    const v9, -0x47ffb541

    xor-int/2addr v8, v9

    const v9, -0x2ee59342

    goto/16 :goto_b

    :cond_7
    move-object v7, v6

    :goto_5
    const-string v2, "\u1a77\u06dc"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    mul-int/lit8 v2, v2, -0x69

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, -0x3faf

    const v9, -0x6640c205

    xor-int/2addr v8, v9

    const v9, 0x4673b4bc

    goto/16 :goto_b

    :sswitch_9
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    .line 369
    iget-object v4, v0, Ll/ۤ᩻᩷;->֫:Ll/ۗ᩵;

    const/4 v2, 0x0

    invoke-virtual {v4, v1, v2}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 266
    check-cast v5, Ljava/lang/ref/Reference;

    if-eqz v5, :cond_8

    const-string v2, "\u06d7\u073a"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, 0x425b

    const v9, 0x3979d00e

    xor-int/2addr v8, v9

    const v9, 0x4d8449c0    # 2.77428224E8f

    goto/16 :goto_b

    :cond_8
    :goto_6
    move-object v6, v2

    const-string v2, "\u06e7\u06d6"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    mul-int/lit8 v2, v2, -0x5f

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, -0x26d9

    const v9, -0x5cbd7efd

    xor-int/2addr v8, v9

    const v9, 0x4d12ffe4    # 1.54140224E8f

    goto/16 :goto_b

    :sswitch_a
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    .line 76
    iput-object v3, v0, Ll/ۤ᩻᩷;->᩷:Ll/۫᩻᩷;

    .line 77
    new-instance v2, Ll/۬᩻᩷;

    invoke-direct {v2, v0}, Ll/۬᩻᩷;-><init>(Ll/ۤ᩻᩷;)V

    iput-object v2, v0, Ll/ۤ᩻᩷;->ۡ:Ll/֨᩻᩷;

    goto/16 :goto_8

    :sswitch_b
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    .line 76
    invoke-static/range {v19 .. v19}, Ll/ܽܳ᩷;->֫(Ll/ܽܳ᩷;)Ll/۟ܿ᩷;

    move-result-object v3

    .line 146
    sget v2, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v2, :cond_9

    goto/16 :goto_a

    :cond_9
    const-string v2, "\u0736\u0733"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, -0x178b

    const v9, 0x6cf85ad3

    xor-int/2addr v8, v9

    const v9, -0x68183ab7

    goto/16 :goto_b

    :sswitch_c
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    .line 76
    iget-object v2, v0, Ll/ۤ᩻᩷;->ۢ:Ll/ۨۚ᩷;

    iget-object v2, v2, Ll/ۨۚ᩷;->᩸:Ljava/lang/Object;

    move-object/from16 v19, v2

    check-cast v19, Ll/ܽܳ᩷;

    .line 253
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v2

    if-ltz v2, :cond_a

    :goto_7
    const-string v2, "\u05a8\u1a76"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, 0x4131

    const v9, 0x4091a3c

    xor-int/2addr v8, v9

    const v9, 0x70478c0a

    goto/16 :goto_b

    :cond_a
    const-string v2, "\u06e2\u06db"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v16, v2

    mul-int/lit8 v2, v2, -0x1f

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, 0x75ab

    const v9, 0x4c90f410    # 7.5997312E7f

    xor-int/2addr v8, v9

    const v9, 0x669b1312

    goto/16 :goto_b

    :sswitch_d
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    .line 74
    iget-object v2, v0, Ll/ۤ᩻᩷;->᩷:Ll/۫᩻᩷;

    if-eqz v2, :cond_b

    :goto_8
    const-string v2, "\u05a1\u06dc"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, 0x3173

    const v9, -0x1ca23319

    xor-int/2addr v8, v9

    const v9, 0x227651ec

    goto/16 :goto_b

    :cond_b
    const-string v2, "\u06e0\u0733"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v17, v2

    mul-int/lit8 v2, v2, 0x2f

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, -0x14e7

    const v9, -0x509f86fb

    xor-int/2addr v8, v9

    const v9, -0x4bbf345e

    goto/16 :goto_b

    :sswitch_e
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    const/16 v2, 0x7af8

    const/16 v14, 0x7af8

    goto :goto_9

    :sswitch_f
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    const/16 v2, 0x3ecb

    const/16 v14, 0x3ecb

    :goto_9
    const-string v2, "\u06da\u073d"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v16, v2

    mul-int/lit8 v2, v2, -0x55

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, -0x218b

    const v9, 0x3411b877

    xor-int/2addr v8, v9

    const v9, -0x639872bc

    goto/16 :goto_b

    :cond_c
    const-string v2, "\u06e7\u05a1"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v16

    mul-int/lit8 v2, v2, 0x3b

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, -0x4edd

    const v9, -0x11a089ce

    xor-int/2addr v8, v9

    const v9, -0x100a5cd7

    goto :goto_b

    :sswitch_10
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    const v2, 0x660aa40

    add-int v12, v11, v2

    const/16 v13, 0x50d0

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v2

    if-gtz v2, :cond_d

    goto/16 :goto_4

    :cond_d
    const-string v2, "\u1a79\u1a76"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v17, v2

    mul-int/lit8 v2, v2, -0x7

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, -0x5b73

    const v9, -0x6ff3bea3

    xor-int/2addr v8, v9

    const v9, -0x18626764

    goto :goto_b

    :sswitch_11
    move-object/from16 v20, v8

    move/from16 v21, v9

    move/from16 v18, v15

    aget-short v10, v20, v21

    mul-int v11, v10, v10

    .line 183
    sget v2, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v2, :cond_e

    :goto_a
    const-string v2, "\u0736\u06df"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v17

    mul-int/lit8 v2, v2, 0x37

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, 0x8a7

    const v9, -0x4ffdb70c

    xor-int/2addr v8, v9

    const v9, 0x2d7be4a4

    goto :goto_b

    :cond_e
    const-string v2, "\u06db\u0730"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v16

    mul-int/lit8 v2, v2, -0x7f

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, -0x4e5

    const v9, -0x5ab0085b

    xor-int/2addr v8, v9

    const v9, 0x42a8ef5f

    :goto_b
    xor-int/2addr v2, v9

    move/from16 v15, v18

    move/from16 v9, v21

    goto :goto_e

    :sswitch_12
    move-object/from16 v20, v8

    move/from16 v18, v15

    const/16 v9, 0x6e

    sget v2, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v2, :cond_f

    :goto_c
    const-string v2, "\u06e2\u06eb"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v17, v2

    mul-int/lit8 v2, v2, -0xd

    xor-int v8, v2, v16

    mul-int/lit16 v8, v8, -0x2c8b

    const v15, 0x121678bc

    xor-int/2addr v8, v15

    const v15, 0x7dad4467

    goto :goto_d

    :cond_f
    const-string v2, "\u06da\u0733"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    xor-int v8, v2, v17

    mul-int/lit16 v8, v8, 0x56b7

    const v15, 0x2592e99f

    xor-int/2addr v8, v15

    const v15, -0x70b6acd0

    :goto_d
    xor-int/2addr v2, v15

    move/from16 v15, v18

    :goto_e
    move/from16 v18, v2

    move v2, v8

    move-object/from16 v8, v20

    goto/16 :goto_0

    :sswitch_13
    move/from16 v21, v9

    move/from16 v18, v15

    sget-object v8, Ll/ۤ᩻᩷;->ۡ᩵ۧ:[S

    .line 312
    sget v2, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v2, :cond_10

    :goto_f
    const-string v2, "\u06eb\u1a7b"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    xor-int v9, v2, v17

    mul-int/lit16 v9, v9, 0x6e09

    const v15, -0x26d6dfa9

    xor-int/2addr v9, v15

    const v15, 0x4da0cb6c    # 3.37210752E8f

    goto :goto_10

    :cond_10
    const-string v2, "\u06e0\u1a75"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v9, v2, v16

    mul-int/lit16 v9, v9, -0x6b0d

    const v15, 0x214a015f

    xor-int/2addr v9, v15

    const v15, -0x1bd38c57

    :goto_10
    xor-int/2addr v2, v15

    move/from16 v15, v18

    move/from16 v18, v2

    move v2, v9

    move/from16 v9, v21

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7eee4184 -> :sswitch_d
        -0x7d2aac03 -> :sswitch_3
        -0x7bfc1566 -> :sswitch_9
        -0x731da771 -> :sswitch_3
        -0x69cfcaf6 -> :sswitch_c
        -0x5558519d -> :sswitch_1
        -0x550feef3 -> :sswitch_a
        -0x535feb57 -> :sswitch_e
        -0x5185e929 -> :sswitch_7
        -0x4efad929 -> :sswitch_4
        -0x4d67d3d0 -> :sswitch_13
        -0x49f1c214 -> :sswitch_2
        -0x4994b898 -> :sswitch_0
        -0x3bb49c8d -> :sswitch_10
        -0x3b3e38c4 -> :sswitch_13
        -0x2c6c3c68 -> :sswitch_f
        -0x2a4a0012 -> :sswitch_f
        -0x212c0604 -> :sswitch_9
        -0x1d73db58 -> :sswitch_7
        -0x14fe69a1 -> :sswitch_10
        -0x7c10256 -> :sswitch_8
        -0x1f341c4 -> :sswitch_6
        0x65c1e90 -> :sswitch_4
        0xe61ee24 -> :sswitch_c
        0xe870dc0 -> :sswitch_b
        0x19a9d0fe -> :sswitch_6
        0x1a9c5ff9 -> :sswitch_e
        0x2e115283 -> :sswitch_b
        0x34b3daf8 -> :sswitch_5
        0x38ef95df -> :sswitch_a
        0x3e0f33c7 -> :sswitch_12
        0x42911b82 -> :sswitch_11
        0x46f2aa80 -> :sswitch_8
        0x4b242a17 -> :sswitch_12
        0x4dacae0d -> :sswitch_1
        0x53ea8d8d -> :sswitch_0
        0x6134abe1 -> :sswitch_2
        0x73264da4 -> :sswitch_d
        0x73ec95e2 -> :sswitch_11
        0x7e120608 -> :sswitch_5
    .end sparse-switch
.end method
