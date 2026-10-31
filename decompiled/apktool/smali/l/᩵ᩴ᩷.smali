.class public final Ll/᩵ᩴ᩷;
.super Ll/۟ܶۡ;
.source "C2R7"


# static fields
.field private static final ۧ۠֫:[S


# instance fields
.field public final ۜ:Landroid/content/pm/PackageManager;

.field public final synthetic ۡ:I

.field public final synthetic ۢ:Ll/֫᩵᩷;

.field public ܳ:Ll/᩵᩶ܿ;

.field public ᩷:Z

.field public ᩻:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8f

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    const/16 v0, 0x3e

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩵ᩴ᩷;->ۧ۠֫:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x10ecs
        -0x3d99s
        -0x3d97s
        -0x3d99s
        -0x3d91s
        -0x3d82s
        -0x3d93s
        -0x3d9fs
        -0x3d9ds
        -0x3de0s
        -0x3d91s
        -0x3da0s
        -0x3d96s
        -0x3d84s
        -0x3d9fs
        -0x3d99s
        -0x3d96s
        -0x3de0s
        -0x3d82s
        -0x3d95s
        -0x3d84s
        -0x3d9ds
        -0x3d99s
        -0x3d83s
        -0x3d83s
        -0x3d99s
        -0x3d9fs
        -0x3da0s
        -0x3de0s
        -0x3db7s
        -0x3db5s
        -0x3da6s
        -0x3dafs
        -0x3db9s
        -0x3dc0s
        -0x3da3s
        -0x3da6s
        -0x3db1s
        -0x3dbes
        -0x3dbes
        -0x3db5s
        -0x3db6s
        -0x3dafs
        -0x3db1s
        -0x3da2s
        -0x3da2s
        -0x3da3s
        -0x41c1s
        0x5209s
        0x573bs
        0x5a0cs
        0x43c6s
        -0x4806s
        -0x7290s
        0x5a29s
        -0x5c80s
        0x5052s
        -0x6429s
        -0x4b63s
        -0x57dcs
        0x4d26s
        0x5f8as
    .end array-data
.end method

.method public constructor <init>(Ll/֫᩵᩷;I)V
    .locals 5

    const v0, 0x50481c73

    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    sget v2, Ll/ۗ۬;->ۘܳ᩻:I

    .line 488
    iput-object p1, p0, Ll/᩵ᩴ᩷;->ۢ:Ll/֫᩵᩷;

    iput p2, p0, Ll/᩵ᩴ᩷;->ۡ:I

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    const-string p2, "\u05ab\u06ec"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    add-int/2addr p2, v2

    mul-int/lit8 p2, p2, -0x29

    xor-int v3, p2, v1

    mul-int/lit16 v3, v3, -0x18b7

    const v4, -0x5ba661cf

    xor-int/2addr v3, v4

    const v4, -0x33174d5e    # -1.22000656E8f

    :goto_0
    xor-int/2addr p2, v4

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x3763

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v3

    xor-int/2addr v0, p2

    sparse-switch v0, :sswitch_data_0

    .line 489
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    iput-object p2, p0, Ll/᩵ᩴ᩷;->ۜ:Landroid/content/pm/PackageManager;

    sget p2, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz p2, :cond_c

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    sget p2, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz p2, :cond_5

    goto :goto_1

    .line 252
    :sswitch_1
    sget p2, Ll/֡᩶;->ܳܶ۠:I

    if-gtz p2, :cond_0

    goto/16 :goto_5

    :cond_0
    :goto_1
    const-string p2, "\u1a7a\u06e0"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    sub-int p2, v1, p2

    mul-int/lit8 p2, p2, 0x4b

    xor-int v3, p2, v2

    mul-int/lit16 v3, v3, -0x431b

    const v4, 0x7879f9b7

    xor-int/2addr v3, v4

    const v4, -0x9033024

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    sget-boolean p2, Ll/֨֫;->᩺ܺ᩸:Z

    if-nez p2, :cond_b

    goto/16 :goto_4

    .line 211
    :sswitch_3
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    const/4 p1, 0x1

    .line 491
    iput-boolean p1, p0, Ll/᩵ᩴ᩷;->᩷:Z

    return-void

    .line 81
    :sswitch_6
    sget-boolean p2, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz p2, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string p2, "\u073d\u0730"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v2

    mul-int/lit8 p2, p2, -0x77

    xor-int v3, p2, v1

    mul-int/lit16 v3, v3, 0x7399

    const v4, -0x332f9b0d

    xor-int/2addr v3, v4

    const v4, 0x6b897ab1

    goto :goto_0

    .line 456
    :sswitch_7
    sget p2, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz p2, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string p2, "\u05a1\u06e7"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v1

    xor-int v3, p2, v2

    mul-int/lit16 v3, v3, -0x5019

    const v4, 0x488849ed

    xor-int/2addr v3, v4

    const v4, 0x5c5e14cb

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_2

    :cond_3
    const-string p2, "\u06e1\u06d9"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v1

    xor-int v3, p2, v2

    mul-int/lit16 v3, v3, 0x3d41

    const v4, 0xbab6823

    xor-int/2addr v3, v4

    const v4, 0xdfd73d1

    goto/16 :goto_0

    .line 190
    :sswitch_9
    sget p2, Ll/֡᩶;->ܳܶ۠:I

    if-gtz p2, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string p2, "\u06dc\u0733"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v2

    xor-int v3, p2, v1

    mul-int/lit16 v3, v3, 0x53c1

    const v4, 0x5f1d8f64

    xor-int/2addr v3, v4

    const v4, 0x3ee2c175

    goto/16 :goto_0

    .line 188
    :sswitch_a
    sget-boolean p2, Ll/֨۫;->۬᩷᩶:Z

    if-nez p2, :cond_6

    :cond_5
    :goto_2
    const-string p2, "\u1a78\u06d7"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v2

    xor-int v3, p2, v1

    mul-int/lit16 v3, v3, -0x344f

    const v4, 0xa947ff

    xor-int/2addr v3, v4

    const v4, -0x72013aa5

    goto/16 :goto_0

    :cond_6
    const-string p2, "\u06e4\u06eb"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v2

    mul-int/lit8 p2, p2, -0x43

    xor-int v3, p2, v1

    mul-int/lit16 v3, v3, 0x2bc9

    const v4, 0x20ae78b2

    xor-int/2addr v3, v4

    const v4, -0x41d2a32c

    goto/16 :goto_0

    .line 415
    :sswitch_b
    sget-boolean p2, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz p2, :cond_7

    :goto_3
    const-string p2, "\u1a75\u0736"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v1

    xor-int v3, p2, v2

    mul-int/lit16 v3, v3, 0x2509

    const v4, 0x654a8c5e

    xor-int/2addr v3, v4

    const v4, 0x571ecb63

    goto/16 :goto_0

    :cond_7
    const-string p2, "\u06e0\u073f"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v1

    xor-int v3, p2, v2

    mul-int/lit16 v3, v3, -0xed

    const v4, 0xdc390d7

    xor-int/2addr v3, v4

    const v4, -0x4f7fee57

    goto/16 :goto_0

    :sswitch_c
    sget p2, Ll/᩹;->ۤܿܳ:I

    if-eqz p2, :cond_8

    goto :goto_4

    :cond_8
    const-string p2, "\u06e1\u05ab"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    add-int/2addr p2, v2

    mul-int/lit8 p2, p2, -0x3f

    xor-int v3, p2, v1

    mul-int/lit16 v3, v3, 0x1661

    const v4, 0x6440adfd

    xor-int/2addr v3, v4

    const v4, -0x24d4d3d4

    goto/16 :goto_0

    .line 487
    :sswitch_d
    sget p2, Ll/֨۬;->۫ۙ᩺:I

    if-gtz p2, :cond_9

    :goto_4
    const-string p2, "\u1a7b\u1a73"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v1

    xor-int v3, p2, v2

    mul-int/lit16 v3, v3, -0x6a01

    const v4, -0x31bada29

    xor-int/2addr v3, v4

    const v4, 0x718b09bf

    goto/16 :goto_0

    :cond_9
    const-string p2, "\u1a75\u0733"

    invoke-static {p2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p2

    sub-int p2, v1, p2

    mul-int/lit8 p2, p2, -0x75

    xor-int v3, p2, v2

    mul-int/lit16 v3, v3, -0x7df

    const v4, -0x60866f04

    xor-int/2addr v3, v4

    const v4, 0x2dc42e4a

    goto/16 :goto_0

    :sswitch_e
    sget p2, Ll/֡֡;->֫ۤܳ:I

    if-ltz p2, :cond_a

    goto :goto_5

    :cond_a
    const-string p2, "\u1a7b\u0733"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v1

    xor-int v3, p2, v2

    mul-int/lit16 v3, v3, -0x792f

    const v4, -0x2292d20c

    xor-int/2addr v3, v4

    const v4, -0x723b3601

    goto/16 :goto_0

    :cond_b
    :goto_5
    const-string p2, "\u1a74\u06db"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v2

    mul-int/lit8 p2, p2, 0x5d

    xor-int v3, p2, v1

    mul-int/lit16 v3, v3, -0x2e0f

    const v4, -0x6cb63254

    xor-int/2addr v3, v4

    const v4, -0x2a566805

    goto/16 :goto_0

    :cond_c
    const-string p2, "\u06e7\u1a7b"

    invoke-static {p2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p2

    xor-int/2addr p2, v2

    xor-int v3, p2, v1

    mul-int/lit16 v3, v3, -0x6235

    const v4, 0x29faa374

    xor-int/2addr v3, v4

    const v4, 0xece1ad7

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6d11471e -> :sswitch_5
        -0x5d0ae61e -> :sswitch_7
        -0x56949231 -> :sswitch_1
        -0x507b5994 -> :sswitch_1
        -0x4f99d4d5 -> :sswitch_2
        -0x3a0e8604 -> :sswitch_3
        -0x244e06f3 -> :sswitch_9
        -0x217f0f34 -> :sswitch_4
        -0x182fa057 -> :sswitch_5
        -0x14e21a02 -> :sswitch_4
        -0xca9e87a -> :sswitch_6
        -0x7eab9d7 -> :sswitch_0
        -0x65b8ca6 -> :sswitch_b
        0x982aca7 -> :sswitch_2
        0xc88a245 -> :sswitch_0
        0x153ead3a -> :sswitch_8
        0x1c7f771e -> :sswitch_a
        0x1c9b42ca -> :sswitch_8
        0x1f887bdd -> :sswitch_a
        0x22cf43cc -> :sswitch_d
        0x2cb7b2cb -> :sswitch_e
        0x2fbace05 -> :sswitch_c
        0x3ddc3073 -> :sswitch_d
        0x441f69a7 -> :sswitch_9
        0x4be309da -> :sswitch_7
        0x53dc5a08 -> :sswitch_3
        0x53fedbfe -> :sswitch_c
        0x58c672fe -> :sswitch_b
        0x6f4ea122 -> :sswitch_e
        0x78acd708 -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final ֫()V
    .locals 30

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

    const v23, -0xcd76263

    sget v24, Ll/ۖ;->᩹۟ۘ:I

    sget v25, Ll/ۘᩴ;->ܿ۬ܿ:I

    const-string v26, "\u1a78\u1a78"

    invoke-static/range {v26 .. v26}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v26

    xor-int v26, v26, v24

    xor-int v1, v26, v25

    mul-int/lit16 v1, v1, -0x1d11

    const v28, -0x741bfe6

    xor-int v1, v1, v28

    const v28, -0x9677d10

    xor-int v26, v26, v28

    move-object/from16 v23, v2

    move-object/from16 v28, v3

    move-object v14, v13

    move-object/from16 v17, v16

    move-object/from16 v20, v19

    move/from16 v27, v26

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const v26, -0xcd76263

    move-object v13, v12

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object v12, v11

    move-object v11, v10

    move-object v10, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    const/4 v6, 0x0

    :goto_0
    xor-int v4, v26, v25

    mul-int/lit16 v4, v4, 0x6e3b

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v1, v4

    xor-int v26, v27, v1

    sparse-switch v26, :sswitch_data_0

    move-object/from16 v27, v11

    move-object/from16 v29, v12

    move-object/from16 v4, v23

    move-object/from16 v11, v28

    .line 519
    iput-boolean v6, v0, Ll/᩵ᩴ᩷;->᩷:Z

    .line 520
    invoke-static {v2}, Ll/֫᩵᩷;->֨(Ll/֫᩵᩷;)Ll/ۗᩴ᩷;

    move-result-object v1

    iget-object v1, v1, Ll/ۗᩴ᩷;->֫:Ll/᩶ᩴ᩷;

    iget-object v7, v1, Ll/᩶ᩴ᩷;->ᩳ:Ljava/lang/String;

    invoke-static {v2}, Ll/֫᩵᩷;->֡(Ll/֫᩵᩷;)Ll/ۗᩴ᩷;

    move-result-object v1

    iget-object v8, v1, Ll/ۗᩴ᩷;->֫:Ll/᩶ᩴ᩷;

    goto/16 :goto_a

    .line 1011
    :sswitch_0
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    sget v1, Ll/۠;->ܺܺܶ:I

    if-ltz v1, :cond_1

    :cond_0
    move-object/from16 v27, v11

    :goto_1
    move-object/from16 v29, v12

    move-object/from16 v4, v23

    move-object/from16 v11, v28

    goto/16 :goto_b

    :cond_1
    move-object/from16 v27, v11

    :goto_2
    move-object/from16 v29, v12

    goto/16 :goto_9

    :sswitch_1
    sget v1, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v1, :cond_0

    :goto_3
    move-object/from16 v27, v11

    :goto_4
    move-object/from16 v4, v23

    move-object/from16 v11, v28

    goto/16 :goto_12

    :sswitch_2
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    sget-boolean v1, Ll/֫ۡ;->۠ۤۜ:Z

    if-nez v1, :cond_2

    goto :goto_3

    :cond_2
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    goto/16 :goto_c

    :sswitch_3
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    goto :goto_3

    .line 1206
    :sswitch_4
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    return-void

    .line 555
    :sswitch_5
    filled-new-array {v11}, [Ljava/lang/String;

    move-result-object v1

    const/16 v3, 0x5c80

    invoke-static {v2, v1, v3}, Ll/ᩴ᩹;->֫(Landroid/app/Activity;[Ljava/lang/String;I)V

    return-void

    .line 563
    :sswitch_6
    invoke-static/range {v20 .. v20}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    const v4, 0x7eb27f63

    xor-int/2addr v1, v4

    .line 564
    invoke-static {v12, v1, v14}, Ll/ۛ;->ۚ֨ܿ(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 565
    invoke-static {v12}, Ll/ۘۘ;->ۜܳ᩸(Ljava/lang/Object;)Ll/֡ۚۢ;

    move-object/from16 v29, v12

    goto/16 :goto_7

    .line 563
    :sswitch_7
    new-instance v14, Ll/ᩴᩴ᩷;

    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    sget-object v1, Ll/᩵ᩴ᩷;->ۧ۠֫:[S

    const/16 v4, 0x3b

    move-object/from16 v27, v11

    const/4 v11, 0x3

    invoke-static {v1, v4, v11, v3}, Ll/֨ۡ;->ۤܿۢ([SIII)Ljava/lang/String;

    move-result-object v20

    const-string v1, "\u06e1\u05a8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v25, v1

    mul-int/lit8 v1, v1, 0x3f

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, -0x7f6d

    const v11, 0x11f02961

    xor-int/2addr v4, v11

    const v11, -0x1081ea61

    goto/16 :goto_6

    :sswitch_8
    move-object/from16 v27, v11

    .line 559
    invoke-static/range {v19 .. v19}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    const v4, 0x7d22c268

    xor-int/2addr v1, v4

    const/4 v4, 0x0

    .line 563
    invoke-static {v12, v1, v4}, Ll/ۖ۫;->ܺۨܰ(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 137
    sget v1, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v1, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v1, "\u073a\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v25

    mul-int/lit8 v1, v1, 0x7d

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, 0x5895

    const v11, 0x69fc1c7c

    xor-int/2addr v4, v11

    const v11, 0x143eae75

    goto/16 :goto_6

    :sswitch_9
    move-object/from16 v27, v11

    const v1, 0x7e2f314f

    xor-int v1, v18, v1

    .line 559
    invoke-static {v12, v1, v13}, Ll/֨ᩴ;->ᩳۨۘ(Ljava/lang/Object;ILjava/lang/Object;)V

    sget-object v1, Ll/᩵ᩴ᩷;->ۧ۠֫:[S

    const/16 v4, 0x38

    const/4 v11, 0x3

    invoke-static {v1, v4, v11, v3}, Ll/֡᩶;->᩶ۚۛ([SIII)Ljava/lang/String;

    move-result-object v19

    .line 163
    sget-boolean v1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v1, :cond_4

    goto/16 :goto_1

    :cond_4
    const-string v1, "\u1a78\u06d7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, 0x1dd

    const v11, -0x34a16605    # -1.4588411E7f

    xor-int/2addr v4, v11

    const v11, 0x1ba7dc26    # 2.77701E-22f

    goto/16 :goto_6

    :sswitch_a
    move-object/from16 v27, v11

    .line 558
    sget-object v1, Ll/᩵ᩴ᩷;->ۧ۠֫:[S

    const/16 v4, 0x35

    const/4 v11, 0x3

    invoke-static {v1, v4, v11, v3}, Ll/۠;->ۢۤ۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v18

    .line 1040
    sget-boolean v1, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v1, :cond_5

    const-string v1, "\u06eb\u0733"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v24, v1

    mul-int/lit8 v1, v1, -0xf

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, -0x3b57

    const v11, 0x221d74e1

    xor-int/2addr v4, v11

    const v11, 0x479b5bf8

    goto/16 :goto_6

    :cond_5
    const-string v1, "\u0733\u073d"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v24

    mul-int/lit8 v1, v1, -0x5d

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, 0xd71

    const v11, -0x52ba342e

    xor-int/2addr v4, v11

    const v11, -0x232826f5

    goto/16 :goto_6

    :sswitch_b
    move-object/from16 v27, v11

    .line 557
    invoke-static/range {v17 .. v17}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    const v4, 0x7d58c6d9

    xor-int/2addr v1, v4

    .line 558
    invoke-static {v12, v1}, Ll/۟;->ۧ۫ܺ(Ljava/lang/Object;I)V

    new-instance v13, Ll/ۘᩴ᩷;

    invoke-direct {v13, v0}, Ll/ۘᩴ᩷;-><init>(Ll/᩵ᩴ᩷;)V

    const-string v1, "\u073d\u1a7a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    mul-int/lit8 v1, v1, 0x2b

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, -0x615

    const v11, 0x2b35cc63

    xor-int/2addr v4, v11

    const v11, -0x6c380176

    goto/16 :goto_6

    :sswitch_c
    move-object/from16 v27, v11

    xor-int v1, v15, v16

    .line 557
    invoke-static {v12, v1}, Ll/ۗ᩵;->ᩴ᩵ܰ(Ljava/lang/Object;I)V

    sget-object v1, Ll/᩵ᩴ᩷;->ۧ۠֫:[S

    const/16 v4, 0x32

    const/4 v11, 0x3

    invoke-static {v1, v4, v11, v3}, Ll/֫᩵;->᩻ۚܺ([SIII)Ljava/lang/String;

    move-result-object v17

    sget v1, Ll/֡֡;->֫ۤܳ:I

    if-ltz v1, :cond_6

    :goto_5
    goto/16 :goto_2

    :cond_6
    const-string v1, "\u06df\u06d8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, -0x1cb7

    const v11, 0x3c8e3cd

    xor-int/2addr v4, v11

    const v11, -0x42eefada

    goto :goto_6

    :sswitch_d
    move-object/from16 v27, v11

    invoke-static {v2}, Ll/֫ۧ;->ܳܳۗ(Ljava/lang/Object;)Ll/᩵ۚۢ;

    move-result-object v12

    sget-object v1, Ll/᩵ᩴ᩷;->ۧ۠֫:[S

    const/16 v4, 0x2f

    const/4 v11, 0x3

    invoke-static {v1, v4, v11, v3}, Ll/֨֫;->ۚܺ᩵([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    const v16, 0x7ef63389

    sget v1, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v1, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v1, "\u06df\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v25

    mul-int/lit8 v1, v1, 0x39

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, -0x8e9

    const v11, 0x66fe9d89

    xor-int/2addr v4, v11

    const v11, 0xcc835ce

    goto :goto_6

    :sswitch_e
    move-object/from16 v27, v11

    .line 554
    invoke-static {v2}, Ll/֫᩵᩷;->ۡ(Ll/֫᩵᩷;)Z

    move-result v1

    if-eqz v1, :cond_8

    const-string v1, "\u1a76\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    mul-int/lit8 v1, v1, -0x7d

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, -0x2575

    const v11, 0x572605ea

    xor-int/2addr v4, v11

    const v11, 0x29e1bbe2

    goto :goto_6

    :cond_8
    const-string v1, "\u05ab\u073d"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v25, v1

    mul-int/lit8 v1, v1, 0x3b

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, 0x3ee3

    const v11, -0x41986fb3

    xor-int/2addr v4, v11

    const v11, -0x37878b17

    :goto_6
    xor-int/2addr v1, v11

    move-object/from16 v11, v27

    goto/16 :goto_e

    .line 553
    :sswitch_f
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sget-object v4, Ll/᩵ᩴ᩷;->ۧ۠֫:[S

    const/4 v11, 0x6

    move-object/from16 v29, v12

    const/16 v12, 0x29

    invoke-static {v4, v11, v12, v3}, Ll/ۖ;->ܽ֡ܶ([SIII)Ljava/lang/String;

    move-result-object v11

    invoke-static {v1, v11}, Ll/֨ۙ;->֫(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_a

    const-string v1, "\u05ab\u06e8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, -0x591f

    const v12, -0x24aeb8e6

    xor-int/2addr v4, v12

    const v12, 0x68467396

    goto :goto_8

    :sswitch_10
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    .line 551
    invoke-static {v2}, Ll/֫᩵᩷;->֨(Ll/֫᩵᩷;)Ll/ۗᩴ᩷;

    move-result-object v1

    .line 1224
    iget-object v1, v1, Ll/ۗᩴ᩷;->֫:Ll/᩶ᩴ᩷;

    iget-object v1, v1, Ll/᩶ᩴ᩷;->ܿ:Ll/᩵֡ᩴ;

    .line 552
    invoke-virtual {v1}, Ll/᩵֡ᩴ;->size()I

    move-result v1

    if-gt v1, v6, :cond_9

    const-string v1, "\u06da\u1a78"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v24, v1

    mul-int/lit8 v1, v1, -0x71

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, 0x2a7b

    const v11, 0x64f58904

    xor-int/2addr v4, v11

    const v11, 0x28841489

    goto/16 :goto_d

    :sswitch_11
    return-void

    :sswitch_12
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    .line 551
    sget-object v1, Ll/᩵ᩴ᩷;->ۧ۠֫:[S

    const/4 v4, 0x1

    const/4 v11, 0x5

    invoke-static {v1, v4, v11, v3}, Ll/֡ᩴ;->۫ۘ᩺([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1, v5}, Ll/ۘ᩻;->ۛ֡᩷(Ljava/lang/Object;Ljava/lang/Object;Z)Z

    move-result v1

    if-nez v1, :cond_9

    const-string v1, "\u073f\u06d6"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, -0x1281

    const v11, -0x7b52d9f6

    xor-int/2addr v4, v11

    const v11, 0x3c16502b

    goto/16 :goto_d

    :cond_9
    move-object/from16 v11, v27

    :cond_a
    :goto_7
    const-string v1, "\u1a76\u1a7a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, 0x4d23

    const v12, 0x356977ec

    xor-int/2addr v4, v12

    const v12, -0x672d993b

    :goto_8
    xor-int v27, v1, v12

    move v1, v4

    goto/16 :goto_11

    :sswitch_13
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    .line 523
    new-instance v1, Ll/ۖ۠᩷;

    const/4 v4, 0x1

    invoke-direct {v1, v4, v0}, Ll/ۖ۠᩷;-><init>(ILjava/lang/Object;)V

    invoke-static {v9, v1}, Ll/֡᩶;->֡ۚ᩹(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 535
    new-instance v1, Ljava/lang/Thread;

    new-instance v4, Ll/ܺᩴ᩷;

    iget v11, v0, Ll/᩵ᩴ᩷;->ۡ:I

    invoke-direct {v4, v0, v11}, Ll/ܺᩴ᩷;-><init>(Ll/᩵ᩴ᩷;I)V

    invoke-direct {v1, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 542
    invoke-static {v1}, Ll/֨ۡ;->ۤۘᩳ(Ljava/lang/Object;)V

    .line 543
    new-instance v1, Ljava/lang/Thread;

    .line 1002
    sget-boolean v4, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v4, :cond_b

    :goto_9
    const-string v1, "\u06dc\u06db"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    mul-int/lit8 v1, v1, 0x67

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, -0x40e7

    const v11, -0x1a8f0116

    xor-int/2addr v4, v11

    const v11, 0x43357f92

    goto/16 :goto_d

    .line 543
    :cond_b
    new-instance v4, Ll/ۖᩴ᩷;

    invoke-direct {v4, v0, v11}, Ll/ۖᩴ᩷;-><init>(Ll/᩵ᩴ᩷;I)V

    invoke-direct {v1, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 550
    invoke-static {v1}, Ll/֨ۡ;->ۤۘᩳ(Ljava/lang/Object;)V

    .line 551
    sget-object v10, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "\u06d8\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, 0x4609

    const v11, -0xdd3d9c6

    xor-int/2addr v4, v11

    const v11, 0x398e0f6d

    goto/16 :goto_d

    :sswitch_14
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    .line 520
    iget-object v1, v8, Ll/᩶ᩴ᩷;->ᩳ:Ljava/lang/String;

    move-object/from16 v4, v23

    move-object/from16 v11, v28

    invoke-static {v2, v4, v11, v7, v1}, Ll/֫᩵᩷;->֫(Ll/֫᩵᩷;Ll/᩵֡ᩴ;Ll/᩵֡ᩴ;Ljava/lang/String;Ljava/lang/String;)Ll/ۛᩴ᩷;

    move-result-object v1

    .line 522
    invoke-static {v2, v1}, Ll/֫᩵᩷;->֫(Ll/֫᩵᩷;Ll/ۛᩴ᩷;)V

    .line 523
    sget-object v9, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    .line 987
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_b

    :cond_c
    const-string v1, "\u06d7\u1a7b"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v12, v1, v24

    mul-int/lit16 v12, v12, 0x75cb

    const v23, -0x7d5cc6a1

    xor-int v12, v12, v23

    const v23, -0x4a53e94c

    goto/16 :goto_10

    :goto_a
    const-string v1, "\u1a7a\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v12, v1, v25

    mul-int/lit16 v12, v12, -0x3309

    const v23, -0x63aa30e6

    xor-int v12, v12, v23

    const v23, -0x2328ed6e

    goto/16 :goto_10

    :sswitch_15
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    move-object/from16 v4, v23

    move-object/from16 v11, v28

    const/4 v5, 0x0

    .line 517
    iput-boolean v5, v0, Ll/᩵ᩴ᩷;->᩷:Z

    .line 518
    iget-object v1, v0, Ll/᩵ᩴ᩷;->ܳ:Ll/᩵᩶ܿ;

    invoke-static {v2, v1, v4, v11}, Ll/֫᩵᩷;->֫(Ll/֫᩵᩷;Ll/᩵᩶ܿ;Ll/᩵֡ᩴ;Ll/᩵֡ᩴ;)V

    const/4 v6, 0x1

    sget v1, Ll/ۛ;->᩺᩻֫:I

    if-ltz v1, :cond_d

    :goto_b
    const-string v1, "\u06eb\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v12, v1, v25

    mul-int/lit16 v12, v12, 0xe8d

    const v23, 0x112add38

    xor-int v12, v12, v23

    const v23, -0x5294bf5a

    goto/16 :goto_10

    :cond_d
    const-string v1, "\u073d\u0733"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v12, v1, v25

    mul-int/lit16 v12, v12, 0x82b

    const v23, 0x5ce2e2ec

    xor-int v12, v12, v23

    const v23, 0x7be1e0e5

    goto/16 :goto_10

    :sswitch_16
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    .line 515
    iget-object v2, v0, Ll/᩵ᩴ᩷;->ۢ:Ll/֫᩵᩷;

    invoke-static {v2}, Ll/֫᩵᩷;->֨(Ll/֫᩵᩷;)Ll/ۗᩴ᩷;

    move-result-object v1

    iget-object v4, v0, Ll/᩵ᩴ᩷;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ll/ۗᩴ᩷;->֫(Ljava/util/ArrayList;)Ll/᩵֡ᩴ;

    move-result-object v23

    .line 516
    invoke-static {v2}, Ll/֫᩵᩷;->֡(Ll/֫᩵᩷;)Ll/ۗᩴ᩷;

    move-result-object v1

    iget-object v4, v0, Ll/᩵ᩴ᩷;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ll/ۗᩴ᩷;->֫(Ljava/util/ArrayList;)Ll/᩵֡ᩴ;

    move-result-object v28

    .line 39
    sget v1, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v1, :cond_e

    :goto_c
    const-string v1, "\u05a8\u06e4"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    xor-int v4, v1, v25

    mul-int/lit16 v4, v4, 0x2991

    const v11, -0x678345c

    xor-int/2addr v4, v11

    const v11, -0x1145529c

    goto :goto_d

    :cond_e
    const-string v1, "\u0730\u1a79"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v25

    xor-int v4, v1, v24

    mul-int/lit16 v4, v4, 0xf7b

    const v11, 0x2e0c2f28

    xor-int/2addr v4, v11

    const v11, 0x64a317f5

    :goto_d
    xor-int/2addr v1, v11

    move-object/from16 v11, v27

    move-object/from16 v12, v29

    :goto_e
    move/from16 v27, v1

    move v1, v4

    goto/16 :goto_0

    :sswitch_17
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    move-object/from16 v4, v23

    move-object/from16 v11, v28

    const/16 v1, 0x80

    const/16 v3, 0x80

    goto :goto_f

    :sswitch_18
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    move-object/from16 v4, v23

    move-object/from16 v11, v28

    const v1, 0xc20e

    const v3, 0xc20e

    :goto_f
    const-string v1, "\u1a76\u06d6"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v25, v1

    mul-int/lit8 v1, v1, 0x53

    xor-int v12, v1, v24

    mul-int/lit16 v12, v12, 0x57fb

    const v23, 0x6f916875    # 9.000321E28f

    xor-int v12, v12, v23

    const v23, -0x5c37a973

    goto :goto_10

    :sswitch_19
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    move-object/from16 v4, v23

    move-object/from16 v11, v28

    mul-int v1, v22, v22

    mul-int v12, v21, v21

    const v23, 0x122a99c4

    add-int v12, v12, v23

    add-int/2addr v12, v12

    sub-int/2addr v12, v1

    if-ltz v12, :cond_f

    const-string v1, "\u0730\u06d7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v25, v1

    mul-int/lit8 v1, v1, 0x57

    xor-int v12, v1, v24

    mul-int/lit16 v12, v12, -0x7c41

    const v23, -0xeb12200

    xor-int v12, v12, v23

    const v23, -0x1513ec37    # -1.4269996E26f

    :goto_10
    xor-int v1, v1, v23

    move-object/from16 v23, v4

    move-object/from16 v28, v11

    move-object/from16 v11, v27

    move/from16 v27, v1

    move v1, v12

    :goto_11
    move-object/from16 v12, v29

    goto/16 :goto_0

    :cond_f
    const-string v1, "\u05a1\u06e7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v24

    mul-int/lit8 v1, v1, -0x6f

    xor-int v12, v1, v25

    mul-int/lit16 v12, v12, 0x6dd1

    const v23, 0x38526292

    xor-int v12, v12, v23

    const v23, -0x7b0840c5

    goto :goto_10

    :sswitch_1a
    move-object/from16 v27, v11

    move-object/from16 v29, v12

    move-object/from16 v4, v23

    move-object/from16 v11, v28

    sget-object v1, Ll/᩵ᩴ᩷;->ۧ۠֫:[S

    const/4 v12, 0x0

    aget-short v1, v1, v12

    add-int/lit16 v12, v1, 0x4432

    .line 162
    sget v21, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v21, :cond_10

    move/from16 v21, v1

    move/from16 v22, v12

    move-object/from16 v12, v29

    :goto_12
    const-string v1, "\u06e0\u1a75"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v25

    mul-int/lit8 v1, v1, -0x31

    xor-int v0, v1, v24

    mul-int/lit16 v0, v0, 0x5e27

    const v23, -0x37c76735

    xor-int v0, v0, v23

    const v23, -0x79eaa467

    xor-int v1, v1, v23

    move-object/from16 v23, v4

    move-object/from16 v28, v11

    move-object/from16 v11, v27

    move/from16 v27, v1

    move v1, v0

    goto :goto_13

    :cond_10
    const-string v0, "\u06d9\u1a73"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v24

    move/from16 v21, v1

    xor-int v1, v0, v25

    mul-int/lit16 v1, v1, -0x1493

    const v22, 0x1b53f3fb

    xor-int v1, v1, v22

    const v22, -0x39b683a0

    xor-int v0, v0, v22

    move-object/from16 v23, v4

    move-object/from16 v28, v11

    move/from16 v22, v12

    move-object/from16 v11, v27

    move-object/from16 v12, v29

    move/from16 v27, v0

    :goto_13
    move-object/from16 v0, p0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e6751b8 -> :sswitch_16
        -0x7cb07182 -> :sswitch_17
        -0x70ee3305 -> :sswitch_10
        -0x6b266f37 -> :sswitch_18
        -0x60527bfe -> :sswitch_8
        -0x5633fd86 -> :sswitch_1
        -0x4eefb6d3 -> :sswitch_e
        -0x4d174430 -> :sswitch_f
        -0x4be6da21 -> :sswitch_6
        -0x4a578cb2 -> :sswitch_9
        -0x4343fea3 -> :sswitch_2
        -0x423ed8f4 -> :sswitch_b
        -0x40fb8654 -> :sswitch_16
        -0x3d0d94a1 -> :sswitch_8
        -0x37cbf1a2 -> :sswitch_d
        -0x373b0b91 -> :sswitch_5
        -0x2cc993da -> :sswitch_0
        -0x28134745 -> :sswitch_9
        -0x23fdfe5c -> :sswitch_11
        -0x1eea0e6d -> :sswitch_18
        -0x1c9a9d69 -> :sswitch_13
        -0x1ad12ee3 -> :sswitch_4
        -0x146b29a1 -> :sswitch_a
        0x14caf4 -> :sswitch_a
        0x3f33718 -> :sswitch_19
        0x4619d66 -> :sswitch_0
        0x582a2b4 -> :sswitch_14
        0x1375b38e -> :sswitch_1
        0x170970a3 -> :sswitch_1a
        0x1f1f1efc -> :sswitch_19
        0x2225dfc1 -> :sswitch_12
        0x24430cd7 -> :sswitch_3
        0x28e141e7 -> :sswitch_c
        0x2a11704b -> :sswitch_5
        0x2fcd41d6 -> :sswitch_1a
        0x326a741b -> :sswitch_15
        0x37ec977e -> :sswitch_3
        0x39b187b1 -> :sswitch_f
        0x4187a427 -> :sswitch_11
        0x41b5222c -> :sswitch_6
        0x421d3778 -> :sswitch_4
        0x476a927b -> :sswitch_17
        0x4edda3d9 -> :sswitch_14
        0x538c8e9b -> :sswitch_7
        0x5fdc5375 -> :sswitch_c
        0x61f5af3f -> :sswitch_13
        0x644752d9 -> :sswitch_b
        0x6adf2dfb -> :sswitch_10
        0x6f474c19 -> :sswitch_12
        0x743d3c6c -> :sswitch_2
        0x74dfc69c -> :sswitch_7
        0x7740eeab -> :sswitch_e
        0x7c82b62b -> :sswitch_15
        0x7ccc5e80 -> :sswitch_d
    .end sparse-switch
.end method

.method public native ֫(Ljava/lang/Exception;)V
.end method

.method public final ۧ()V
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, -0xb6f44a7

    sget v6, Ll/֡ܶ;->ᩴܿ᩸:I

    sget v7, Ll/ۘۨ;->۫᩸۠:I

    const-string v8, "\u06e2\u06dc"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, 0xb

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x89b

    const v10, 0x9a68c64

    xor-int/2addr v9, v10

    const v10, -0x46562f57

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v7

    mul-int/lit16 v5, v5, 0x2d0b

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    .line 497
    iget-object v0, v4, Ll/ۗᩴ᩷;->ܽ:Ll/۫ۤۧ;

    invoke-virtual {v0, v3}, Ll/۫ۤۧ;->֫(Z)V

    return-void

    .line 488
    :sswitch_0
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v8

    if-ltz v8, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v8, "\u0730\u0730"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x5aa5

    const v10, 0x7359e97e

    xor-int/2addr v9, v10

    const v10, -0x537be4cc

    goto :goto_0

    .line 311
    :sswitch_1
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    sget v8, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v8, :cond_b

    goto/16 :goto_1

    .line 75
    :sswitch_2
    sget v8, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v8, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v8, "\u06e7\u073f"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x22cf

    const v10, -0x59e2a924

    xor-int/2addr v9, v10

    const v10, -0x320122f3

    goto :goto_0

    .line 173
    :sswitch_3
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    return-void

    .line 496
    :sswitch_5
    invoke-virtual {v2, v3}, Ll/۫ۤۧ;->֫(Z)V

    .line 497
    invoke-static {v0}, Ll/֫᩵᩷;->֡(Ll/֫᩵᩷;)Ll/ۗᩴ᩷;

    move-result-object v4

    .line 320
    sget v8, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v8, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v8, "\u06e4\u06db"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, -0x35

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x5b33

    const v10, -0x4a765861

    xor-int/2addr v9, v10

    const v10, -0x46c984b5

    goto :goto_0

    .line 496
    :sswitch_6
    iget-object v2, v1, Ll/ۗᩴ᩷;->ܽ:Ll/۫ۤۧ;

    const/4 v3, 0x1

    sget v8, Ll/֡֡;->֫ۤܳ:I

    if-ltz v8, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v8, "\u06ec\u073a"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x3229

    const v10, 0x2a61c86b

    xor-int/2addr v9, v10

    const v10, -0x7a6724c4

    goto/16 :goto_0

    :sswitch_7
    invoke-static {v0}, Ll/֫᩵᩷;->֨(Ll/֫᩵᩷;)Ll/ۗᩴ᩷;

    move-result-object v1

    .line 283
    sget v8, Ll/۠;->ܺܺܶ:I

    if-ltz v8, :cond_4

    goto :goto_1

    :cond_4
    const-string v8, "\u1a79\u06da"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x41ef

    const v10, -0x66f5c0b1

    xor-int/2addr v9, v10

    const v10, -0x49593836

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v8

    if-gtz v8, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v8, "\u0730\u06db"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x51

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x2111

    const v10, 0xdd4cc09

    xor-int/2addr v9, v10

    const v10, -0x357320b3    # -4616102.5f

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v8, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v8, :cond_6

    goto/16 :goto_2

    :cond_6
    const-string v8, "\u06e2\u1a79"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0xd

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x41ad

    const v10, 0x79c39f13

    xor-int/2addr v9, v10

    const v10, -0x4cb187a4

    goto/16 :goto_0

    .line 347
    :sswitch_a
    sget v8, Ll/ۛ;->᩺᩻֫:I

    if-ltz v8, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v8, "\u1a73\u06e7"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x54c9

    const v10, -0x3e69f432

    xor-int/2addr v9, v10

    const v10, -0x3345f93d    # -9.7531416E7f

    goto/16 :goto_0

    .line 22
    :sswitch_b
    sget v8, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v8, :cond_8

    :goto_1
    const-string v8, "\u06d8\u05a8"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x75ff

    const v10, 0x65776cae

    xor-int/2addr v9, v10

    const v10, -0x30072565

    goto/16 :goto_0

    :cond_8
    const-string v8, "\u06e1\u1a79"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x7c37

    const v10, -0xbecd387

    xor-int/2addr v9, v10

    const v10, -0xf4b7063

    goto/16 :goto_0

    .line 163
    :sswitch_c
    sget v8, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v8, :cond_9

    goto :goto_2

    :cond_9
    const-string v8, "\u06da\u06dc"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x4f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x2455

    const v10, 0x7620bee9

    xor-int/2addr v9, v10

    const v10, 0x45097ada

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v8

    if-gtz v8, :cond_a

    :goto_2
    const-string v8, "\u06e8\u1a7b"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x5f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x7bfb

    const v10, -0x2b85bc21

    xor-int/2addr v9, v10

    const v10, -0x6a48c5d7

    goto/16 :goto_0

    :cond_a
    const-string v8, "\u06df\u1a75"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x31

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x64ed

    const v10, -0x189edeb7

    xor-int/2addr v9, v10

    const v10, -0x7711f94e

    goto/16 :goto_0

    .line 496
    :sswitch_e
    iget-object v0, p0, Ll/᩵ᩴ᩷;->ۢ:Ll/֫᩵᩷;

    sget v8, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v8, :cond_c

    :cond_b
    :goto_3
    const-string v8, "\u06e8\u06d6"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x7b

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x5e79

    const v10, -0x5b6dd921

    xor-int/2addr v9, v10

    const v10, 0x2649d0c5

    goto/16 :goto_0

    :cond_c
    const-string v8, "\u05a1\u06e4"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x57

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x6f5b

    const v10, 0x289d8bcb

    xor-int/2addr v9, v10

    const v10, -0x6ea91cef

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x610e122b -> :sswitch_b
        -0x573510ec -> :sswitch_5
        -0x52ed7461 -> :sswitch_7
        -0x3d1f4a9b -> :sswitch_c
        -0x3c0d074a -> :sswitch_c
        -0x3b33ab32 -> :sswitch_3
        -0x3b13527f -> :sswitch_0
        -0x3837d962 -> :sswitch_b
        -0x363b5d4c -> :sswitch_2
        -0x185d5091 -> :sswitch_d
        -0x8af6a -> :sswitch_8
        0xa32b97a -> :sswitch_8
        0x10db5548 -> :sswitch_4
        0x12e5c59b -> :sswitch_1
        0x139a6a14 -> :sswitch_9
        0x16574630 -> :sswitch_a
        0x1ed35c20 -> :sswitch_4
        0x2b1d2620 -> :sswitch_3
        0x2fd2eb0a -> :sswitch_e
        0x348c35a0 -> :sswitch_e
        0x432ec474 -> :sswitch_9
        0x4ac80de8 -> :sswitch_6
        0x5046da5e -> :sswitch_6
        0x50c70765 -> :sswitch_7
        0x57fefc2b -> :sswitch_a
        0x5a1a1a09 -> :sswitch_0
        0x61186e75 -> :sswitch_2
        0x637b20e7 -> :sswitch_5
        0x6ccdb9cb -> :sswitch_d
        0x73a7ab37 -> :sswitch_1
    .end sparse-switch
.end method

.method public final ܿ()V
    .locals 15

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v8, -0x3a917978

    sget v9, Ll/֫᩵;->ܶ᩻᩷:I

    sget v10, Ll/ۗ᩶;->ۛ֨ۘ:I

    const-string v11, "\u1a77\u06e1"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x287b

    const v13, -0x203b30af

    xor-int/2addr v12, v13

    const v13, 0x244d0b7a

    :goto_0
    xor-int/2addr v11, v13

    move-object v13, v3

    :goto_1
    xor-int/2addr v8, v9

    mul-int/lit16 v8, v8, -0x2879

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v8, v12

    xor-int/2addr v8, v11

    sparse-switch v8, :sswitch_data_0

    .line 504
    iput-object v13, p0, Ll/᩵ᩴ᩷;->᩻:Ljava/util/ArrayList;

    .line 505
    invoke-static {v2}, Ll/֫ܽ;->֨ۚܿ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v4

    goto/16 :goto_2

    :sswitch_0
    sget v11, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v11, :cond_9

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    sget v11, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v11, :cond_b

    goto/16 :goto_6

    :sswitch_2
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    sget v11, Ll/֫᩵;->ܶ᩻᩷:I

    if-lez v11, :cond_d

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    return-void

    .line 507
    :sswitch_5
    iget-object v11, p0, Ll/᩵ᩴ᩷;->᩻:Ljava/util/ArrayList;

    new-instance v12, Ll/ۙᩴ᩷;

    .line 320
    sget v14, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v14, :cond_0

    goto/16 :goto_5

    .line 507
    :cond_0
    invoke-direct {v12, v6}, Ll/ۙᩴ᩷;-><init>(Landroid/content/pm/PackageInfo;)V

    invoke-static {v11, v12}, Ll/֫ܺ;->ܽۚ᩸(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 506
    :sswitch_6
    iget-object v11, v7, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    if-eqz v11, :cond_4

    const-string v11, "\u06d9\u06d6"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v9, v11

    mul-int/lit8 v11, v11, -0x47

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x6567

    const v14, 0x4bcd2f81    # 2.6894082E7f

    xor-int/2addr v12, v14

    const v14, -0x783ebbe4

    goto/16 :goto_7

    .line 505
    :sswitch_7
    invoke-static {v4}, Ll/ۖۘ;->ᩴۛۚ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/pm/PackageInfo;

    .line 506
    iget-object v7, v6, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v7, :cond_4

    const-string v11, "\u1a74\u0736"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0x2d

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x39d7

    const v14, -0x70f8eefe

    xor-int/2addr v12, v14

    const v14, 0x5b1ee9f

    goto/16 :goto_7

    .line 546
    :sswitch_8
    invoke-static {}, Ll/ۢ֨ۢ;->ۢ()Z

    move-result v0

    .line 510
    invoke-static {v0}, Ll/ۗ᩶ܿ;->ۧ(Z)Ll/᩵᩶ܿ;

    move-result-object v0

    iput-object v0, p0, Ll/᩵ᩴ᩷;->ܳ:Ll/᩵᩶ܿ;

    return-void

    :sswitch_9
    invoke-static {v5}, Ll/ۗ᩷;->ۖۧۙ(Ljava/lang/Object;)Ljava/lang/Class;

    .line 397
    sget v11, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v11, :cond_1

    goto/16 :goto_6

    :cond_1
    const-string v11, "\u1a79\u06e8"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x5f

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x2c99

    const v14, -0x33163b42

    xor-int/2addr v12, v14

    const v14, 0x41a2d30c

    goto/16 :goto_7

    .line 510
    :sswitch_a
    invoke-static {}, Ll/᩹᩶ܿ;->ᩳ()Ll/֡᩶ܿ;

    move-result-object v5

    check-cast v5, Ll/ܶۡ᩷;

    sget v11, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v11, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v11, "\u06dc\u06eb"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, 0x47

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x5257

    const v14, 0x201289b0

    xor-int/2addr v12, v14

    const v14, 0x32ff4d49

    goto/16 :goto_7

    .line 505
    :sswitch_b
    invoke-static {v4}, Ll/֡ܶ;->ۛܿ᩻(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    const-string v11, "\u06e0\u073f"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x45

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x6d89

    const v14, 0x777ade34

    xor-int/2addr v12, v14

    const v14, -0x390a2e8

    goto/16 :goto_7

    :cond_3
    const-string v11, "\u06d9\u06d7"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, -0x31

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x6ceb

    const v14, -0x6aa91f80

    xor-int/2addr v12, v14

    const v14, 0x6f60a8bc

    goto/16 :goto_7

    :cond_4
    :goto_2
    const-string v11, "\u06eb\u06df"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x400f

    const v14, -0x2995b18a

    xor-int/2addr v12, v14

    const v14, 0x1b45583b

    goto/16 :goto_7

    .line 504
    :sswitch_c
    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v2}, Ll/֫᩺;->ۗ᩷᩻(Ljava/lang/Object;)I

    move-result v11

    .line 258
    sget-boolean v12, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v12, :cond_5

    goto :goto_3

    .line 504
    :cond_5
    invoke-direct {v13, v11}, Ljava/util/ArrayList;-><init>(I)V

    sget v11, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v11, :cond_6

    goto :goto_4

    :cond_6
    const-string v11, "\u1a74\u1a7b"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x71

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x6871

    const v14, -0x52e7ff52

    xor-int/2addr v12, v14

    const v14, 0x265f051f

    goto/16 :goto_7

    .line 502
    :sswitch_d
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object v2

    .line 503
    invoke-static {}, Ll/ۢ֨ۢ;->ۘ()V

    .line 433
    sget v11, Ll/᩹;->ۤܿܳ:I

    if-eqz v11, :cond_7

    :goto_3
    const-string v11, "\u06da\u06d6"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, 0x27eb

    const v13, -0x29d6ecea

    xor-int/2addr v12, v13

    const v13, 0x305375f0

    goto/16 :goto_0

    :cond_7
    const-string v11, "\u1a7a\u06e2"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v10

    mul-int/lit8 v11, v11, -0xf

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x498f

    const v14, 0x4cc5e2e0    # 1.03749376E8f

    xor-int/2addr v12, v14

    const v14, 0x55c756bb

    goto/16 :goto_7

    :sswitch_e
    const/4 v1, 0x0

    .line 52
    sget v11, Ll/ۛ;->᩺᩻֫:I

    if-ltz v11, :cond_8

    :goto_4
    const-string v11, "\u073f\u06d7"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x395b

    const v14, 0x4a057c2e    # 2187019.5f

    xor-int/2addr v12, v14

    const v14, -0x1314884a

    goto/16 :goto_7

    :cond_8
    const-string v11, "\u05ab\u1a73"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    add-int/2addr v11, v9

    mul-int/lit8 v11, v11, 0x6f

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x69e7

    const v14, -0x5a8167eb

    xor-int/2addr v12, v14

    const v14, -0x73033d65

    goto/16 :goto_7

    .line 313
    :sswitch_f
    sget v11, Ll/ۛ;->᩺᩻֫:I

    if-ltz v11, :cond_a

    :cond_9
    :goto_5
    const-string v11, "\u06e7\u06ec"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v10, v11

    mul-int/lit8 v11, v11, -0x49

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x3f9f

    const v14, -0x543c3723

    xor-int/2addr v12, v14

    const v14, 0x2f4ffe78

    goto :goto_7

    :cond_a
    const-string v11, "\u1a74\u1a73"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x3077

    const v14, -0x81ad679

    xor-int/2addr v12, v14

    const v14, -0x5ee1e394

    goto :goto_7

    :sswitch_10
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v11

    if-eqz v11, :cond_c

    :cond_b
    const-string v11, "\u06dc\u06df"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, 0x68ab

    const v14, -0x6e598768

    xor-int/2addr v12, v14

    const v14, -0x17886582

    goto :goto_7

    :cond_c
    const-string v11, "\u0730\u1a79"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v10

    xor-int v12, v11, v9

    mul-int/lit16 v12, v12, -0x746b

    const v14, -0xcacff0e

    xor-int/2addr v12, v14

    const v14, -0x4c5dda64

    goto :goto_7

    .line 502
    :sswitch_11
    iget-object v0, p0, Ll/᩵ᩴ᩷;->ۜ:Landroid/content/pm/PackageManager;

    sget v11, Ll/֡֡;->֫ۤܳ:I

    if-ltz v11, :cond_e

    :cond_d
    :goto_6
    const-string v11, "\u0736\u1a75"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x60f7

    const v14, -0x1e41bc06

    xor-int/2addr v12, v14

    const v14, 0x686affbf

    goto :goto_7

    :cond_e
    const-string v11, "\u06da\u06d7"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int/2addr v11, v9

    xor-int v12, v11, v10

    mul-int/lit16 v12, v12, -0x4067

    const v14, 0x45fa08f2

    xor-int/2addr v12, v14

    const v14, 0x6d058399

    :goto_7
    xor-int/2addr v11, v14

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x75889fd2 -> :sswitch_9
        -0x74beaca2 -> :sswitch_b
        -0x695b0380 -> :sswitch_8
        -0x5fa4b10e -> :sswitch_7
        -0x55a6ca1a -> :sswitch_1
        -0x3f6208a6 -> :sswitch_8
        -0x3e233aab -> :sswitch_3
        -0x37463ac0 -> :sswitch_11
        -0x2adb9554 -> :sswitch_7
        -0x1a4a4635 -> :sswitch_10
        -0x18b5dfa4 -> :sswitch_0
        -0xe54dc10 -> :sswitch_e
        -0x84d8fe1 -> :sswitch_b
        0x1c65be -> :sswitch_4
        0x480b48d -> :sswitch_2
        0x4a259a8 -> :sswitch_6
        0x5136628 -> :sswitch_c
        0x6503f93 -> :sswitch_a
        0x130699c5 -> :sswitch_2
        0x173f8015 -> :sswitch_f
        0x18b723be -> :sswitch_d
        0x3bafd727 -> :sswitch_10
        0x3ec089c3 -> :sswitch_3
        0x42c5fe25 -> :sswitch_1
        0x488f4923 -> :sswitch_c
        0x4deaa763 -> :sswitch_e
        0x5068751a -> :sswitch_9
        0x52f371f2 -> :sswitch_11
        0x543b71e6 -> :sswitch_d
        0x5d43eaf9 -> :sswitch_4
        0x5d462fa9 -> :sswitch_6
        0x5f5529a5 -> :sswitch_f
        0x64caa781 -> :sswitch_5
        0x66f9214f -> :sswitch_0
        0x712fb3aa -> :sswitch_5
        0x7881be26 -> :sswitch_a
    .end sparse-switch
.end method

.method public final ᩳ()V
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, 0x43495a7c

    sget v8, Ll/֨۬;->۫ۙ᩺:I

    sget v9, Ll/ۗ᩵;->֫۠۟:I

    const-string v10, "\u073a\u05a8"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x299

    const v12, 0x6852f8da

    xor-int/2addr v11, v12

    const v12, -0x1ecfa230

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v8

    mul-int/lit16 v7, v7, -0xc21

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    .line 124
    sget v10, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v10, :cond_7

    goto/16 :goto_3

    .line 426
    :sswitch_0
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    sget v10, Ll/֫ܽ;->ۚ᩷᩹:I

    if-gez v10, :cond_8

    goto/16 :goto_6

    :sswitch_1
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    sget v10, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v10, :cond_c

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    sget v10, Ll/ۗ᩺;->ۡ᩺֡:I

    if-gez v10, :cond_6

    goto :goto_1

    .line 0
    :sswitch_3
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    :goto_1
    const-string v10, "\u06da\u1a79"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x5ac5

    const v12, -0x604c24fe

    xor-int/2addr v11, v12

    const v12, 0x468eda4b

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    return-void

    .line 584
    :sswitch_5
    invoke-static {v6}, Ll/֨ۤ;->ۤܿ֨(Ljava/lang/Object;)V

    goto :goto_2

    .line 586
    :sswitch_6
    invoke-static {v0}, Ll/֫᩵᩷;->۠(Ll/֫᩵᩷;)V

    .line 587
    invoke-static {v0}, Ll/֫᩵᩷;->۫(Ll/֫᩵᩷;)V

    return-void

    .line 582
    :sswitch_7
    invoke-virtual {v5, v3}, Ll/۫ۤۧ;->֫(Z)V

    .line 583
    iget-object v6, p0, Ll/᩵ᩴ᩷;->ܳ:Ll/᩵᩶ܿ;

    if-eqz v6, :cond_0

    const-string v10, "\u0730\u06e4"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x17

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x25b3

    const v12, 0xb7ce00f

    xor-int/2addr v11, v12

    const v12, -0x51ac2180

    goto :goto_0

    :cond_0
    :goto_2
    const-string v10, "\u073f\u06d7"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, -0xf

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x4bf7

    const v12, 0x542d58ee

    xor-int/2addr v11, v12

    const v12, 0x6582af10

    goto/16 :goto_0

    .line 582
    :sswitch_8
    iget-object v5, v4, Ll/ۗᩴ᩷;->ܽ:Ll/۫ۤۧ;

    .line 190
    sget v10, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v10, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v10, "\u073a\u1a79"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x73

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x4bc3

    const v12, -0x5d85cfcf

    xor-int/2addr v11, v12

    const v12, -0x63edd528

    goto/16 :goto_0

    .line 581
    :sswitch_9
    invoke-virtual {v2, v3}, Ll/۫ۤۧ;->֫(Z)V

    .line 582
    invoke-static {v0}, Ll/֫᩵᩷;->֡(Ll/֫᩵᩷;)Ll/ۗᩴ᩷;

    move-result-object v4

    .line 135
    sget v10, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v10, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v10, "\u05ab\u06d7"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x23d9

    const v12, 0x24d7c9d5

    xor-int/2addr v11, v12

    const v12, 0x6ed77d4b

    goto/16 :goto_0

    .line 581
    :sswitch_a
    iget-object v2, v1, Ll/ۗᩴ᩷;->ܽ:Ll/۫ۤۧ;

    const/4 v3, 0x0

    .line 180
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v10

    if-eqz v10, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v10, "\u1a78\u06e8"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1db5

    const v12, -0x50b02c03

    xor-int/2addr v11, v12

    const v12, -0x4a022c2b

    goto/16 :goto_0

    .line 581
    :sswitch_b
    invoke-static {v0}, Ll/֫᩵᩷;->֨(Ll/֫᩵᩷;)Ll/ۗᩴ᩷;

    move-result-object v1

    sget v10, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v10, :cond_4

    goto :goto_3

    :cond_4
    const-string v10, "\u06e2\u05a8"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x73

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x1fed

    const v12, -0x339fc575    # -5.8780204E7f

    xor-int/2addr v11, v12

    const v12, 0x50b39a03

    goto/16 :goto_0

    :sswitch_c
    sget v10, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v10, :cond_5

    goto :goto_3

    :cond_5
    const-string v10, "\u073a\u1a7a"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x43

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x3e31

    const v12, 0x348d61a0

    xor-int/2addr v11, v12

    const v12, -0x4d90dbb9

    goto/16 :goto_0

    :cond_6
    :goto_3
    const-string v10, "\u06d7\u06e0"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x69fd

    const v12, 0x5e58ff78

    xor-int/2addr v11, v12

    const v12, -0x74fb0b

    goto/16 :goto_0

    :cond_7
    const-string v10, "\u06e1\u06d9"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x6c85

    const v12, 0x6f1046cf

    xor-int/2addr v11, v12

    const v12, -0x3cb9bdfa

    goto/16 :goto_0

    .line 165
    :sswitch_d
    sget-boolean v10, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v10, :cond_9

    :cond_8
    :goto_4
    const-string v10, "\u06e0\u05a1"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x326d

    const v12, -0x47f113cb

    xor-int/2addr v11, v12

    const v12, -0x5c577293

    goto/16 :goto_0

    :cond_9
    const-string v10, "\u05a8\u06d8"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x215f

    const v12, 0x35be7991

    xor-int/2addr v11, v12

    const v12, 0x3cb25d5b

    goto/16 :goto_0

    .line 520
    :sswitch_e
    sget-boolean v10, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v10, :cond_a

    goto :goto_5

    :cond_a
    const-string v10, "\u1a78\u06df"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x31

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x2c03

    const v12, 0x7a63affc

    xor-int/2addr v11, v12

    const v12, 0x2f7b65bc

    goto/16 :goto_0

    :sswitch_f
    sget v10, Ll/᩺;->ۙۛܶ:I

    if-gtz v10, :cond_b

    :goto_5
    const-string v10, "\u1a74\u1a74"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x1b

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x38b1

    const v12, 0x482f8219

    xor-int/2addr v11, v12

    const v12, -0x6888eba6

    goto/16 :goto_0

    :cond_b
    const-string v10, "\u06df\u1a78"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x3cfd

    const v12, 0x7e658e67

    xor-int/2addr v11, v12

    const v12, -0x5e51d3fe

    goto/16 :goto_0

    .line 581
    :sswitch_10
    iget-object v0, p0, Ll/᩵ᩴ᩷;->ۢ:Ll/֫᩵᩷;

    .line 320
    sget v10, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v10, :cond_d

    :cond_c
    :goto_6
    const-string v10, "\u1a74\u06dc"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x69e9

    const v12, 0x76d7e5b9

    xor-int/2addr v11, v12

    const v12, -0x257cb7db

    goto/16 :goto_0

    :cond_d
    const-string v10, "\u1a79\u06eb"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x1a33

    const v12, 0x11abc63f

    xor-int/2addr v11, v12

    const v12, 0x4f794822    # 4.18225408E9f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x75f6a257 -> :sswitch_3
        -0x7556a675 -> :sswitch_0
        -0x6da387a4 -> :sswitch_5
        -0x66225a2b -> :sswitch_7
        -0x5e096ebe -> :sswitch_1
        -0x56394bc0 -> :sswitch_9
        -0x50874012 -> :sswitch_10
        -0x42851093 -> :sswitch_9
        -0x42463c68 -> :sswitch_a
        -0x3eceab8a -> :sswitch_6
        -0x3df0673c -> :sswitch_d
        -0x343d662a -> :sswitch_c
        -0x2dfb8afb -> :sswitch_2
        -0x2956803f -> :sswitch_c
        -0x243c6f11 -> :sswitch_8
        -0x834ccab -> :sswitch_a
        -0x5bc4651 -> :sswitch_b
        0x65e97a0 -> :sswitch_6
        0x14ba9853 -> :sswitch_e
        0x1575620d -> :sswitch_f
        0x16bc0c84 -> :sswitch_1
        0x28c64c01 -> :sswitch_e
        0x2905b14f -> :sswitch_b
        0x47fe7478 -> :sswitch_f
        0x4a9f8534 -> :sswitch_3
        0x4e0a335c -> :sswitch_4
        0x4fd22f3d -> :sswitch_7
        0x5424e356 -> :sswitch_10
        0x5b2d4a04 -> :sswitch_2
        0x6ebab825 -> :sswitch_4
        0x7133aec2 -> :sswitch_0
        0x716741bd -> :sswitch_d
        0x73664dcf -> :sswitch_5
        0x7f08df4e -> :sswitch_8
    .end sparse-switch
.end method
