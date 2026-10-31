.class public final Ll/ᩴ۫ܽ;
.super Ljava/lang/Object;
.source "819S"

# interfaces
.implements Landroid/text/TextWatcher;


# static fields
.field private static final ۜ᩸᩵:[S


# instance fields
.field public final synthetic ۗ:Ljava/lang/String;

.field public final synthetic ۙ:Ljava/lang/String;

.field public final synthetic ۬:Landroid/widget/TextView;

.field public final synthetic ᩶:Ljava/lang/String;

.field public final synthetic ᩸:Ll/֨۫ܽ;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x47

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩴ۫ܽ;->ۜ᩸᩵:[S

    return-void

    :array_0
    .array-data 2
        0x1ec2s
        0x1b1s
        0x1b1s
        0x1cas
        0x1cds
        0x1e2s
        0x1abs
        0x1ccs
        0x1bas
        0x1dcs
        0x1d5s
        0x1a4s
        0x1b1s
        0x146s
        0x1dcs
        0x1d5s
        0x1a4s
        0x1b1s
        0x238bs
        0x1c2s
        0x1d9s
        0x1d0s
        0x1a0s
        0x1b1s
        0x146s
        0x1c2s
        0x1d9s
        0x1d0s
        0x1a0s
        0x1b1s
        0x238bs
        0x1e2s
        0x1f0s
        0x1ffs
        0x1e2s
        0x1bcs
        0x1e2s
        0x1f4s
        0x1e3s
        0x1f8s
        0x1f7s
        0x1c2s
        0x1d9s
        0x1d0s
        0x1a3s
        0x1a4s
        0x1a7s
        0x1b1s
        0x146s
        0x1c2s
        0x1d9s
        0x1d0s
        0x1a3s
        0x1a4s
        0x1a7s
        0x1b1s
        0x238bs
        0x1aes
        0x1d9s
        0x1d0s
        0x1c2s
        0x1d9s
        0x1b1s
        0x238bs
        0x1d2s
        0x1c3s
        0x1d2s
        0x1a2s
        0x1a3s
        0x1b1s
        0x238bs
    .end array-data
.end method

.method public constructor <init>(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/֨۫ܽ;)V
    .locals 6

    const v0, -0x9eb3f2d

    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    sget v2, Ll/֡۬;->۠֡᩶:I

    .line 853
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06db\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6129

    const v5, 0x5f955041

    xor-int/2addr v4, v5

    const v5, 0x15ab5a64

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x6d0b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 593
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v3

    if-ltz v3, :cond_5

    goto/16 :goto_2

    .line 266
    :sswitch_0
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v3

    if-lez v3, :cond_9

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    :goto_1
    const-string v3, "\u1a79\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x12bf

    const v5, 0x709b6e02

    xor-int/2addr v4, v5

    const v5, -0x609d7923

    goto :goto_0

    .line 161
    :sswitch_2
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-gez v3, :cond_4

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    goto/16 :goto_3

    .line 244
    :sswitch_4
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 853
    :sswitch_5
    iput-object p4, p0, Ll/ᩴ۫ܽ;->ۙ:Ljava/lang/String;

    iput-object p5, p0, Ll/ᩴ۫ܽ;->ۗ:Ljava/lang/String;

    iput-object p6, p0, Ll/ᩴ۫ܽ;->᩸:Ll/֨۫ܽ;

    return-void

    :sswitch_6
    iput-object p3, p0, Ll/ᩴ۫ܽ;->᩹:Ljava/lang/String;

    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v3

    if-gtz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u0736\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0xd

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x343f

    const v5, -0x77b6d030

    xor-int/2addr v4, v5

    const v5, 0x26785958

    goto :goto_0

    .line 147
    :sswitch_7
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v3

    if-ltz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u0736\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4493

    const v5, -0x3b212bb2

    xor-int/2addr v4, v5

    const v5, -0x4e7dde34

    goto/16 :goto_0

    .line 25
    :sswitch_8
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v3

    if-gtz v3, :cond_3

    goto :goto_2

    :cond_3
    const-string v3, "\u1a78\u06e2"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x779b

    const v5, 0x519162a6

    xor-int/2addr v4, v5

    const v5, 0x5b9f6f88

    goto/16 :goto_0

    :cond_4
    :goto_2
    const-string v3, "\u0733\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x61f7

    const v5, 0x73948f17

    xor-int/2addr v4, v5

    const v5, 0x4d53925a    # 2.21848992E8f

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u0736\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x293b

    const v5, 0x22c83950

    xor-int/2addr v4, v5

    const v5, -0x72e38e61

    goto/16 :goto_0

    .line 341
    :sswitch_9
    sget v3, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u1a7a\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x33

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4afd

    const v5, 0x3b856e96

    xor-int/2addr v4, v5

    const v5, -0x49efa855

    goto/16 :goto_0

    .line 482
    :sswitch_a
    sget-boolean v3, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u1a76\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5e71

    const v5, -0x42251eb2

    xor-int/2addr v4, v5

    const v5, 0x3d164032

    goto/16 :goto_0

    .line 742
    :sswitch_b
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v3

    if-eqz v3, :cond_8

    :goto_3
    const-string v3, "\u05ab\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1fd9

    const v5, -0x51faf7cf

    xor-int/2addr v4, v5

    const v5, -0x738f5af5

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u0730\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x199b

    const v5, -0x37c2936a

    xor-int/2addr v4, v5

    const v5, -0xb57ae9f

    goto/16 :goto_0

    .line 448
    :sswitch_c
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v3, :cond_a

    :cond_9
    const-string v3, "\u06eb\u073a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x74a7

    const v5, -0x5a43f7ed

    xor-int/2addr v4, v5

    const v5, 0x520c2119

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06e2\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x67a5

    const v5, 0x3e67ad69

    xor-int/2addr v4, v5

    const v5, -0x2001fb1a

    goto/16 :goto_0

    .line 419
    :sswitch_d
    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v3, :cond_b

    goto :goto_4

    :cond_b
    const-string v3, "\u073d\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2f39

    const v5, -0x2a41ab1e

    xor-int/2addr v4, v5

    const v5, -0x5d912c8

    goto/16 :goto_0

    .line 853
    :sswitch_e
    iput-object p1, p0, Ll/ᩴ۫ܽ;->۬:Landroid/widget/TextView;

    iput-object p2, p0, Ll/ᩴ۫ܽ;->᩶:Ljava/lang/String;

    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v3

    if-nez v3, :cond_c

    :goto_4
    const-string v3, "\u05ab\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2b61

    const v5, 0x37902073

    xor-int/2addr v4, v5

    const v5, 0x71f5e6b4

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a73\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x7f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4b15

    const v5, -0x3477bd5d    # -1.785991E7f

    xor-int/2addr v4, v5

    const v5, 0x734d9773

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x75da1f39 -> :sswitch_9
        -0x6b64af1f -> :sswitch_4
        -0x57dbd6a2 -> :sswitch_2
        -0x53106f5e -> :sswitch_c
        -0x3d6615ef -> :sswitch_5
        -0x3d325a42 -> :sswitch_0
        -0x2aeb0989 -> :sswitch_6
        -0x29b05e3d -> :sswitch_c
        -0x242af204 -> :sswitch_8
        -0x18b4a255 -> :sswitch_6
        0xfa3ad54 -> :sswitch_a
        0x17d53bfd -> :sswitch_b
        0x1b58fe84 -> :sswitch_e
        0x1b9aee91 -> :sswitch_3
        0x1c1750c1 -> :sswitch_7
        0x25fe38b3 -> :sswitch_9
        0x285333ef -> :sswitch_d
        0x2bb31baa -> :sswitch_b
        0x2dc7ed65 -> :sswitch_d
        0x33837072 -> :sswitch_2
        0x35397460 -> :sswitch_3
        0x437717e3 -> :sswitch_7
        0x4ae7bfb7 -> :sswitch_1
        0x5c34f395 -> :sswitch_4
        0x61290511 -> :sswitch_a
        0x61422459 -> :sswitch_e
        0x659ded94 -> :sswitch_5
        0x691e1350 -> :sswitch_0
        0x72a0fd85 -> :sswitch_1
        0x78e986c6 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 44

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

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const v33, -0x3367b352

    sget v34, Ll/֡᩺;->ᩴ᩹ۛ:I

    sget v35, Ll/ۖ;->᩹۟ۘ:I

    const-string v36, "\u05ab\u1a73"

    invoke-static/range {v36 .. v36}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v36

    sub-int v36, v35, v36

    mul-int/lit8 v36, v36, 0x7d

    xor-int v1, v36, v34

    mul-int/lit16 v1, v1, -0x4f2d

    const v38, -0x2b4d6894

    xor-int v1, v1, v38

    const v38, 0x201c0a90

    xor-int v36, v36, v38

    move-object/from16 v18, v5

    move-object/from16 v19, v6

    move-object/from16 v20, v8

    move-object/from16 v30, v15

    move-object/from16 v32, v17

    move-object/from16 v13, v23

    move-object/from16 v15, v25

    move-object/from16 v27, v26

    move-object/from16 v40, v31

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x0

    const/16 v28, 0x0

    const/16 v31, 0x0

    const/16 v39, 0x0

    const/16 v41, 0x0

    move-object/from16 v23, v2

    move-object/from16 v17, v3

    move-object v5, v4

    move-object v8, v7

    move-object/from16 v26, v14

    move-object/from16 v7, v21

    move-object/from16 v3, v22

    move-object/from16 v25, v24

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v14, 0x0

    const/16 v22, 0x0

    move-object/from16 v24, v12

    const/4 v12, 0x0

    :goto_0
    xor-int v6, v33, v34

    mul-int/lit16 v6, v6, -0x6313

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v1, v6

    xor-int v33, v36, v1

    sparse-switch v33, :sswitch_data_0

    move-object/from16 v1, v23

    .line 868
    invoke-static {v2, v1}, Ll/֨ۤ;->᩹᩶ᩳ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    .line 817
    :sswitch_0
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    sget-boolean v1, Ll/֫ܺ;->֡ܳ᩸:Z

    if-eqz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    move-object/from16 v36, v3

    move-object/from16 v37, v17

    move-object/from16 v6, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v17, v23

    move/from16 v23, v41

    move-object/from16 v20, v2

    goto/16 :goto_27

    :sswitch_1
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v1

    if-eqz v1, :cond_1

    goto/16 :goto_3

    :cond_1
    move-object/from16 v36, v3

    move-object/from16 v6, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v1, v23

    move-object/from16 v20, v2

    goto/16 :goto_21

    .line 479
    :sswitch_2
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    sget-boolean v1, Ll/֫ۡ;->۠ۤۜ:Z

    if-nez v1, :cond_3

    :cond_2
    move-object/from16 v36, v3

    move/from16 v3, v31

    goto/16 :goto_c

    :cond_3
    const-string v1, "\u0730\u06e8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v6, v1, v35

    mul-int/lit16 v6, v6, 0x5b2f

    const v36, -0x20b56691

    xor-int v6, v6, v36

    const v36, 0x49a6b607

    goto/16 :goto_5

    :sswitch_3
    sget-boolean v1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v1, :cond_2

    :cond_4
    :goto_1
    move-object/from16 v36, v3

    move-object v3, v5

    move-object/from16 v6, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v1, v23

    move-object/from16 v5, v40

    move/from16 v23, v41

    move-object/from16 v20, v2

    move-object/from16 v2, v17

    goto/16 :goto_1f

    :sswitch_4
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    sget v1, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v1, :cond_5

    goto :goto_1

    :cond_5
    :goto_2
    move-object/from16 v36, v3

    move-object/from16 v3, v20

    move-object/from16 v1, v23

    goto/16 :goto_1b

    .line 668
    :sswitch_5
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v1, :cond_4

    goto :goto_3

    :sswitch_6
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v1

    if-gtz v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_3
    const-string v1, "\u06d9\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v6, v1, v35

    mul-int/lit16 v6, v6, 0x2ad9

    const v36, -0x25e08ffc

    xor-int v6, v6, v36

    const v36, 0x4985e419

    goto :goto_5

    .line 636
    :sswitch_7
    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v1, :cond_7

    goto :goto_4

    :cond_7
    move-object/from16 v36, v3

    goto/16 :goto_b

    .line 322
    :sswitch_8
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    :goto_4
    const-string v1, "\u06da\u06d6"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v6, v1, v34

    mul-int/lit16 v6, v6, -0x7913

    const v36, 0xfce3e

    xor-int v6, v6, v36

    const v36, 0xd78065f

    :goto_5
    xor-int v36, v1, v36

    goto/16 :goto_15

    :sswitch_9
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    return-void

    .line 917
    :sswitch_a
    sget-object v1, Ll/ᩴ۫ܽ;->ۜ᩸᩵:[S

    const/16 v6, 0x40

    move/from16 v36, v9

    const/4 v9, 0x7

    invoke-static {v1, v6, v9, v14}, Ll/֡᩶;->᩶ۚۛ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 918
    invoke-static {v5, v1}, Ll/ۘۨ;->۟ۡۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    goto/16 :goto_8

    :sswitch_b
    move/from16 v36, v9

    .line 921
    invoke-static {v5, v13}, Ll/ۘۨ;->۟ۡۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    goto/16 :goto_6

    :sswitch_c
    move/from16 v36, v9

    .line 914
    sget-object v1, Ll/ᩴ۫ܽ;->ۜ᩸᩵:[S

    const/16 v6, 0x3a

    const/4 v9, 0x6

    invoke-static {v1, v6, v9, v14}, Ll/ۘۗ;->ۖ֫۠([SIII)Ljava/lang/String;

    move-result-object v1

    .line 915
    invoke-static {v5, v1}, Ll/֡ۜ;->ܶۢۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    goto/16 :goto_8

    :sswitch_d
    move/from16 v36, v9

    .line 917
    invoke-static/range {v25 .. v25}, Ll/֡֡;->ᩴܽܽ(Ljava/lang/Object;)I

    move-result v1

    iget v6, v15, Ll/֨۫ܽ;->֫:I

    if-ne v1, v6, :cond_8

    const-string v1, "\u06db\u06da"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    mul-int/lit8 v1, v1, -0x3d

    xor-int v6, v1, v35

    mul-int/lit16 v6, v6, -0x2527

    const v9, -0x6b279bfc

    xor-int/2addr v6, v9

    const v9, -0x37ffec27

    goto/16 :goto_a

    :cond_8
    const-string v1, "\u05a1\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    mul-int/lit8 v1, v1, 0x17

    xor-int v6, v1, v34

    mul-int/lit16 v6, v6, 0x7389

    const v9, 0x75f91269

    xor-int/2addr v6, v9

    const v9, -0x337f1603    # -6.7588072E7f

    goto/16 :goto_a

    :sswitch_e
    move/from16 v36, v9

    const v1, -0xffff01

    const v31, -0xffff01

    goto/16 :goto_9

    :sswitch_f
    move/from16 v36, v9

    .line 914
    invoke-static/range {v25 .. v25}, Ll/֡۬;->֫᩺۫(Ljava/lang/Object;)I

    move-result v1

    iget-object v15, v0, Ll/ᩴ۫ܽ;->᩸:Ll/֨۫ܽ;

    iget v6, v15, Ll/֨۫ܽ;->ۧ:I

    if-ne v1, v6, :cond_9

    const-string v1, "\u0733\u06d6"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v34

    mul-int/lit8 v1, v1, 0x5b

    xor-int v6, v1, v35

    mul-int/lit16 v6, v6, -0x5c43

    const v9, 0x1e09daa4

    xor-int/2addr v6, v9

    const v9, 0x6cac0e51

    goto/16 :goto_a

    :cond_9
    const-string v1, "\u0733\u06eb"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v6, v1, v35

    mul-int/lit16 v6, v6, -0x64f7

    const v9, -0x222f1d51

    xor-int/2addr v6, v9

    const v9, 0x5832b3dc

    goto/16 :goto_a

    :sswitch_10
    move/from16 v36, v9

    .line 925
    invoke-static {v5, v13}, Ll/֡ۜ;->ܶۢۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    :goto_6
    const-string v1, "\u06e0\u06d9"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v35

    mul-int/lit8 v1, v1, 0x53

    xor-int v6, v1, v34

    mul-int/lit16 v6, v6, -0x217f

    const v9, -0x58910993

    xor-int/2addr v6, v9

    const v9, 0x53e9ff84

    goto/16 :goto_a

    :sswitch_11
    move/from16 v36, v9

    .line 911
    invoke-static {v3, v11}, Ll/ۗ᩵;->֫ۧܺ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/ۢ᩺ۡ;->ۜ(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ll/֨᩺;->᩸ۗ᩹(I)Ljava/lang/Integer;

    move-result-object v1

    goto/16 :goto_7

    :sswitch_12
    move/from16 v36, v9

    const/4 v1, 0x0

    goto/16 :goto_7

    :sswitch_13
    move/from16 v36, v9

    sget-object v1, Ll/ᩴ۫ܽ;->ۜ᩸᩵:[S

    const/16 v6, 0x39

    const/4 v9, 0x1

    invoke-static {v1, v6, v9, v14}, Ll/֫᩵;->᩻ۚܺ([SIII)Ljava/lang/String;

    move-result-object v13

    if-eqz v25, :cond_a

    const-string v1, "\u06d6\u06e4"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v6, v1, v34

    mul-int/lit16 v6, v6, 0xf7b

    const v9, -0x1030284a

    xor-int/2addr v6, v9

    const v9, -0xc3d1927

    goto/16 :goto_a

    :cond_a
    const-string v1, "\u06e4\u06d8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v34, v1

    mul-int/lit8 v1, v1, 0x53

    xor-int v6, v1, v35

    mul-int/lit16 v6, v6, -0x228b

    const v9, 0x1aa24e1

    xor-int/2addr v6, v9

    const v9, -0x74a22567

    goto/16 :goto_a

    :sswitch_14
    move/from16 v36, v9

    .line 909
    invoke-static {v3}, Ll/ۢ᩺ۡ;->ۜ(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ll/ۗ۬;->᩶᩵᩻(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_7

    :sswitch_15
    move/from16 v36, v9

    .line 910
    invoke-static {v3}, Ll/ۢ᩺ۡ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    const-string v1, "\u1a78\u073f"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v6, v1, v35

    mul-int/lit16 v6, v6, 0x4037

    const v9, -0x70133361

    xor-int/2addr v6, v9

    const v9, 0x78b0de7f

    goto/16 :goto_a

    :cond_b
    const-string v1, "\u06e2\u06d8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v35, v1

    mul-int/lit8 v1, v1, 0x43

    xor-int v6, v1, v34

    mul-int/lit16 v6, v6, -0x5feb

    const v9, -0x2aa13db

    xor-int/2addr v6, v9

    const v9, -0x4b4b406c

    goto/16 :goto_a

    :sswitch_16
    move/from16 v36, v9

    .line 907
    invoke-static {v3}, Ll/֫᩵;->᩺᩹᩷(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ll/֨᩺;->᩸ۗ᩹(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_7
    move-object/from16 v25, v1

    const-string v1, "\u1a77\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v6, v1, v35

    mul-int/lit16 v6, v6, -0x166b

    const v9, 0x27759e99

    xor-int/2addr v6, v9

    const v9, -0x82f4220

    goto/16 :goto_a

    :sswitch_17
    move/from16 v36, v9

    .line 908
    invoke-static {v3}, Ll/ۢ᩺ۡ;->֫(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    const-string v1, "\u06e8\u06e0"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v35, v1

    mul-int/lit8 v1, v1, -0x19

    xor-int v6, v1, v34

    mul-int/lit16 v6, v6, -0x478b

    const v9, 0x1c689068

    xor-int/2addr v6, v9

    const v9, -0x1c1377b0

    goto/16 :goto_a

    :cond_c
    const-string v1, "\u06d9\u06ec"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v6, v1, v34

    mul-int/lit16 v6, v6, 0x553

    const v9, 0x581e47c6

    xor-int/2addr v6, v9

    const v9, 0xca1ef8

    goto :goto_a

    :sswitch_18
    move/from16 v36, v9

    .line 893
    sget-object v1, Ll/ᩴ۫ܽ;->ۜ᩸᩵:[S

    const/16 v6, 0x31

    const/16 v9, 0x8

    invoke-static {v1, v6, v9, v14}, Ll/֫᩵;->᩻ۚܺ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 894
    invoke-static {v5, v1}, Ll/֡ۜ;->ܶۢۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    :goto_8
    move/from16 v9, v36

    move-object/from16 v36, v3

    goto/16 :goto_e

    :sswitch_19
    move/from16 v36, v9

    sget-object v1, Ll/ᩴ۫ܽ;->ۜ᩸᩵:[S

    const/16 v6, 0x29

    const/16 v9, 0x8

    invoke-static {v1, v6, v9, v14}, Ll/ۘۘ;->᩻ۙܿ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 897
    invoke-static {v5, v1}, Ll/֡ۜ;->ܶۢۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    .line 898
    sget v1, Ll/᩹֡᩷;->ᩳ֫:I

    move/from16 v31, v1

    move/from16 v9, v36

    :goto_9
    move-object/from16 v36, v3

    goto/16 :goto_10

    :sswitch_1a
    move/from16 v36, v9

    const/4 v1, 0x0

    .line 903
    invoke-static {v8, v1, v4}, Ll/֨ۡ;->᩻ۨܳ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v1

    move/from16 v3, v31

    goto/16 :goto_d

    :sswitch_1b
    move/from16 v36, v9

    .line 906
    invoke-static {v3}, Ll/ۢ᩺ۡ;->ᩳ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    const-string v1, "\u06e4\u05a1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v6, v1, v35

    mul-int/lit16 v6, v6, -0x2fc7

    const v9, 0x24436a2e

    xor-int/2addr v6, v9

    const v9, 0x76c6f797

    goto :goto_a

    :cond_d
    const-string v1, "\u1a7b\u1a79"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v35, v1

    mul-int/lit8 v1, v1, -0x7b

    xor-int v6, v1, v34

    mul-int/lit16 v6, v6, -0x75f

    const v9, -0x364cc0bc

    xor-int/2addr v6, v9

    const v9, 0x6cec6dd1

    :goto_a
    xor-int/2addr v1, v9

    move/from16 v9, v36

    goto/16 :goto_14

    .line 930
    :sswitch_1c
    invoke-static {v5}, Ll/֫ܽ;->۫ۘ֡(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v5, v7, v12, v1, v10}, Ll/֡᩶;->᩸᩸ۛ(Ljava/lang/Object;Ljava/lang/Object;III)V

    .line 931
    invoke-static {v2, v5}, Ll/֫ܽ;->ۚۖۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :sswitch_1d
    move-object/from16 v1, v32

    .line 929
    invoke-static {v5, v1, v12, v9, v10}, Ll/֡᩶;->᩸᩸ۛ(Ljava/lang/Object;Ljava/lang/Object;III)V

    .line 930
    new-instance v7, Landroid/text/style/TypefaceSpan;

    sget-object v6, Ll/ᩴ۫ܽ;->ۜ᩸᩵:[S

    .line 114
    sget v32, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v32, :cond_e

    move-object/from16 v32, v1

    goto/16 :goto_2

    :cond_e
    move-object/from16 v32, v1

    const/16 v1, 0x1f

    move-object/from16 v36, v3

    const/16 v3, 0xa

    .line 930
    invoke-static {v6, v1, v3, v14}, Ll/֨۬;->֨ۧ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v7, v1}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    sget-boolean v1, Ll/֨۫;->۬᩷᩶:Z

    if-nez v1, :cond_f

    :goto_b
    const-string v1, "\u06d6\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v35, v1

    mul-int/lit8 v1, v1, 0x9

    xor-int v3, v1, v34

    mul-int/lit16 v3, v3, -0x3aeb

    const v6, -0x2c86eef4

    xor-int/2addr v3, v6

    const v6, -0x4723e11a

    goto/16 :goto_11

    :cond_f
    const-string v1, "\u073a\u1a74"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    mul-int/lit8 v1, v1, 0x67

    xor-int v3, v1, v34

    mul-int/lit16 v3, v3, 0x3da9

    const v6, 0x43716c4c

    xor-int/2addr v3, v6

    const v6, -0x245d20b9

    goto/16 :goto_11

    :sswitch_1e
    move-object/from16 v36, v3

    .line 929
    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    move/from16 v3, v31

    invoke-direct {v1, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-static {v5}, Ll/֫ܽ;->۫ۘ֡(Ljava/lang/Object;)I

    move-result v9

    .line 239
    sget v6, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v6, :cond_10

    move-object/from16 v32, v1

    const/16 v10, 0x21

    :goto_c
    const-string v1, "\u06e4\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v6, v1, v34

    mul-int/lit16 v6, v6, 0x7e7b

    const v31, 0x1d8d9ac4

    xor-int v6, v6, v31

    const v31, -0x5d8649f4

    goto/16 :goto_13

    :cond_10
    const-string v6, "\u073d\u1a7b"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v35

    mul-int/lit8 v6, v6, -0x63

    xor-int v10, v6, v34

    mul-int/lit16 v10, v10, -0x73f3

    const v32, 0x889e6af

    xor-int v10, v10, v32

    const v32, 0x1b234ff8

    xor-int v6, v6, v32

    move-object/from16 v32, v1

    move/from16 v31, v3

    move v1, v10

    move-object/from16 v3, v36

    const/16 v10, 0x21

    goto/16 :goto_1d

    :sswitch_1f
    move-object/from16 v36, v3

    .line 885
    sget-object v1, Ll/ᩴ۫ܽ;->ۜ᩸᩵:[S

    const/16 v3, 0x19

    const/4 v6, 0x6

    invoke-static {v1, v3, v6, v14}, Ll/ۘ᩻;->ۙܺܶ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 886
    invoke-static {v5, v1}, Ll/ۘۨ;->۟ۡۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    goto/16 :goto_e

    :sswitch_20
    move-object/from16 v36, v3

    sget-object v1, Ll/ᩴ۫ܽ;->ۜ᩸᩵:[S

    const/16 v3, 0x13

    const/4 v6, 0x6

    invoke-static {v1, v3, v6, v14}, Ll/ۗۗ;->ۧܺۧ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 889
    invoke-static {v5, v1}, Ll/ۘۨ;->۟ۡۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    .line 890
    sget v1, Ll/᩹֡᩷;->ᩳ֫:I

    goto/16 :goto_f

    :sswitch_21
    move-object/from16 v36, v3

    move-object/from16 v1, v30

    move/from16 v3, v31

    .line 893
    invoke-static {v8, v1}, Ll/֨ᩴ;->֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_11

    const-string v6, "\u06d6\u1a7b"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v34

    move-object/from16 v30, v1

    xor-int v1, v6, v35

    mul-int/lit16 v1, v1, -0x7a87

    const v31, -0x1b20bac3

    xor-int v1, v1, v31

    const v31, 0x4d49fe4c

    goto/16 :goto_12

    :cond_11
    move-object/from16 v30, v1

    const-string v1, "\u06d6\u1a79"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v6, v1, v34

    mul-int/lit16 v6, v6, -0xc2f

    const v31, 0x5ef1107f

    xor-int v6, v6, v31

    const v31, 0x6d1d923

    goto/16 :goto_13

    :sswitch_22
    move-object/from16 v36, v3

    move/from16 v3, v31

    const/16 v1, 0x28

    .line 901
    invoke-static {v8, v1}, Ll/ۘᩴ;->᩹ۙᩴ(Ljava/lang/Object;I)I

    move-result v4

    const/4 v1, -0x1

    if-eq v4, v1, :cond_12

    const-string v1, "\u06e4\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v6, v1, v35

    mul-int/lit16 v6, v6, -0x77f5

    const v31, -0x40a6e426

    xor-int v6, v6, v31

    const v31, -0x3798803d

    goto/16 :goto_13

    :cond_12
    move-object v1, v8

    :goto_d
    const-string v6, "\u073d\u06e4"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v34

    mul-int/lit8 v6, v6, -0x9

    move-object/from16 v31, v1

    xor-int v1, v6, v35

    mul-int/lit16 v1, v1, -0x360d

    const v36, -0x5cb35928

    xor-int v1, v1, v36

    const v36, -0x3505c08e    # -8200121.0f

    xor-int v36, v6, v36

    move-object/from16 v42, v31

    move/from16 v31, v3

    goto/16 :goto_23

    :sswitch_23
    move-object/from16 v36, v3

    .line 877
    sget-object v1, Ll/ᩴ۫ܽ;->ۜ᩸᩵:[S

    const/16 v3, 0xe

    const/4 v6, 0x5

    invoke-static {v1, v3, v6, v14}, Ll/֨ۡ;->ۤܿۢ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 878
    invoke-static {v5, v1}, Ll/ۘۨ;->۟ۡۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    :goto_e
    move/from16 v31, v16

    goto :goto_10

    :sswitch_24
    move-object/from16 v36, v3

    sget-object v1, Ll/ᩴ۫ܽ;->ۜ᩸᩵:[S

    const/16 v3, 0x9

    const/4 v6, 0x5

    invoke-static {v1, v3, v6, v14}, Ll/֫ܽ;->᩵۠ܽ([SIII)Ljava/lang/String;

    move-result-object v1

    .line 881
    invoke-static {v5, v1}, Ll/֡ۜ;->ܶۢۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    .line 882
    sget v1, Ll/᩹֡᩷;->ᩳ֫:I

    :goto_f
    move/from16 v31, v1

    :goto_10
    const-string v1, "\u1a73\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v34, v1

    mul-int/lit8 v1, v1, -0x49

    xor-int v3, v1, v35

    mul-int/lit16 v3, v3, 0x557d

    const v6, -0x414f1f7e

    xor-int/2addr v3, v6

    const v6, -0x142abbb2

    :goto_11
    xor-int/2addr v1, v6

    goto/16 :goto_19

    :sswitch_25
    move-object/from16 v36, v3

    move-object/from16 v1, v26

    move/from16 v3, v31

    .line 885
    invoke-static {v8, v1}, Ll/֫ܿ;->ܺۤ֨(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_13

    const-string v6, "\u06d6\u073f"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v34

    move-object/from16 v26, v1

    xor-int v1, v6, v35

    mul-int/lit16 v1, v1, -0x1bc1

    const v31, 0x56cf97bc

    xor-int v1, v1, v31

    const v31, -0x5897d3e0

    :goto_12
    xor-int v6, v6, v31

    move/from16 v31, v3

    goto/16 :goto_1c

    :cond_13
    move-object/from16 v26, v1

    const-string v1, "\u1a74\u06e4"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v35

    xor-int v6, v1, v34

    mul-int/lit16 v6, v6, -0x216f

    const v31, 0x3f7a895c

    xor-int v6, v6, v31

    const v31, 0x4a4d91dd    # 3368055.2f

    :goto_13
    xor-int v1, v1, v31

    move/from16 v31, v3

    move-object/from16 v3, v36

    :goto_14
    move/from16 v36, v1

    :goto_15
    move v1, v6

    goto/16 :goto_0

    :sswitch_26
    move-object/from16 v36, v3

    move/from16 v3, v31

    .line 892
    invoke-static {v8}, Ll/֨֫;->ۡۚܽ(Ljava/lang/Object;)I

    move-result v1

    iget-object v6, v0, Ll/ᩴ۫ܽ;->ۗ:Ljava/lang/String;

    invoke-static {v6}, Ll/֫ۡ;->᩻ܳܽ(Ljava/lang/Object;)I

    move-result v3

    if-ne v1, v3, :cond_14

    const-string v1, "\u1a75\u0733"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v35, v1

    mul-int/lit8 v1, v1, -0x45

    xor-int v3, v1, v34

    mul-int/lit16 v3, v3, 0x2303

    const v30, 0x55bdd05

    xor-int v3, v3, v30

    const v30, 0x6f0ab021

    goto :goto_16

    :cond_14
    const-string v1, "\u06e2\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    mul-int/lit8 v1, v1, -0x75

    xor-int v3, v1, v35

    mul-int/lit16 v3, v3, -0x514f

    const v30, -0x1248c9e9

    xor-int v3, v3, v30

    const v30, -0x4412f316

    :goto_16
    xor-int v1, v1, v30

    move-object/from16 v30, v6

    goto/16 :goto_19

    :sswitch_27
    move-object/from16 v36, v3

    move-object/from16 v1, v24

    .line 877
    invoke-static {v8, v1}, Ll/֨ᩴ;->֨ۙ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_15

    const-string v3, "\u06e7\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v35

    xor-int v6, v3, v34

    mul-int/lit16 v6, v6, 0x1c83

    const v24, -0x5801d47f

    xor-int v6, v6, v24

    const v24, -0x6ec763fa

    goto :goto_17

    :cond_15
    const-string v3, "\u1a7a\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v34

    mul-int/lit8 v3, v3, 0x1f

    xor-int v6, v3, v35

    mul-int/lit16 v6, v6, 0x6de3

    const v24, 0x31f93263

    xor-int v6, v6, v24

    const v24, -0x2d17e7b1

    :goto_17
    xor-int v3, v3, v24

    move-object/from16 v24, v1

    move v1, v6

    goto/16 :goto_22

    :sswitch_28
    move-object/from16 v36, v3

    move-object/from16 v1, v24

    .line 884
    invoke-static {v8}, Ll/֫ۡ;->᩻ܳܽ(Ljava/lang/Object;)I

    move-result v3

    iget-object v6, v0, Ll/ᩴ۫ܽ;->ۙ:Ljava/lang/String;

    invoke-static {v6}, Ll/֨֫;->ۡۚܽ(Ljava/lang/Object;)I

    move-result v1

    if-ne v3, v1, :cond_16

    const-string v1, "\u073a\u06e2"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v34

    xor-int v3, v1, v35

    mul-int/lit16 v3, v3, -0x6ddf

    const v26, 0x734f3739

    xor-int v3, v3, v26

    const v26, -0x11b89ad2

    goto :goto_18

    :cond_16
    const-string v1, "\u05a8\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v35

    mul-int/lit8 v1, v1, 0x3b

    xor-int v3, v1, v34

    mul-int/lit16 v3, v3, 0x1147

    const v26, -0x2af6d956

    xor-int v3, v3, v26

    const v26, -0x40585e2

    :goto_18
    xor-int v1, v1, v26

    move-object/from16 v26, v6

    :goto_19
    move-object/from16 v42, v36

    move/from16 v36, v1

    move v1, v3

    goto/16 :goto_23

    :sswitch_29
    move-object/from16 v36, v3

    move-object/from16 v1, v23

    const/4 v11, 0x2

    add-int/lit8 v12, v22, 0x2

    .line 876
    invoke-static {v8}, Ll/֨֫;->ۡۚܽ(Ljava/lang/Object;)I

    move-result v3

    iget-object v6, v0, Ll/ᩴ۫ܽ;->᩹:Ljava/lang/String;

    invoke-static {v6}, Ll/֫ۡ;->᩻ܳܽ(Ljava/lang/Object;)I

    move-result v11

    const v23, -0xff3400

    if-ne v3, v11, :cond_17

    const-string v3, "\u06e8\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v35, v3

    mul-int/lit8 v3, v3, 0x3f

    xor-int v11, v3, v34

    mul-int/lit16 v11, v11, 0x626f

    const v24, -0x492ae01e

    xor-int v11, v11, v24

    const v24, 0x347cda97

    goto :goto_1a

    :cond_17
    const-string v3, "\u06db\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v34

    xor-int v11, v3, v35

    mul-int/lit16 v11, v11, 0x5dcf

    const v24, -0x7dda4b0a

    xor-int v11, v11, v24

    const v24, -0x3be331ce

    :goto_1a
    xor-int v3, v3, v24

    move-object/from16 v23, v1

    move-object/from16 v24, v6

    move v1, v11

    const/4 v11, 0x2

    const v16, -0xff3400

    goto/16 :goto_22

    :sswitch_2a
    move-object/from16 v36, v3

    move-object/from16 v3, v20

    move-object/from16 v1, v23

    .line 873
    invoke-virtual {v3, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 874
    invoke-static {v1}, Ll/֫ۡ;->᩻ܳܽ(Ljava/lang/Object;)I

    move-result v22

    sget v6, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v6, :cond_18

    :goto_1b
    const-string v6, "\u06da\u1a75"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v35, v6

    mul-int/lit8 v6, v6, -0xb

    xor-int v7, v6, v34

    mul-int/lit16 v7, v7, 0x3c6d

    const v20, -0x8b8f16d

    xor-int v7, v7, v20

    const v20, 0x38d84eaf

    xor-int v6, v6, v20

    move-object/from16 v23, v1

    move-object/from16 v20, v3

    move v1, v7

    move-object/from16 v7, v21

    goto :goto_1c

    :cond_18
    const-string v6, "\u06ec\u06e7"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v34

    mul-int/lit8 v6, v6, -0x7d

    move-object/from16 v20, v2

    xor-int v2, v6, v35

    mul-int/lit16 v2, v2, -0x5629

    const v23, -0x5ff5dca5

    xor-int v2, v2, v23

    const v23, -0x1a2ecec3

    xor-int v6, v6, v23

    move-object/from16 v23, v1

    move v1, v2

    move-object/from16 v2, v20

    move-object/from16 v20, v3

    :goto_1c
    move-object/from16 v3, v36

    :goto_1d
    move/from16 v36, v6

    goto/16 :goto_0

    :sswitch_2b
    move-object/from16 v20, v2

    move-object/from16 v36, v3

    move-object/from16 v1, v23

    const-string v2, ""

    move-object/from16 v6, v18

    move-object/from16 v3, v19

    .line 872
    invoke-static {v6, v3, v2}, Ll/ۘ᩻;->ۗۙۙ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/֫ܽ;->ۛ֫ۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 873
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 385
    sget v18, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v18, :cond_19

    move-object/from16 v19, v2

    move-object/from16 v18, v3

    move-object/from16 v37, v17

    move/from16 v23, v41

    move-object/from16 v17, v1

    goto/16 :goto_27

    :cond_19
    const-string v18, "\u0730\u05a8"

    invoke-static/range {v18 .. v18}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v35

    move-object/from16 v19, v2

    xor-int v2, v18, v34

    mul-int/lit16 v2, v2, 0x4103

    const v23, -0x1a49a7fc

    xor-int v2, v2, v23

    const v23, -0x6f0c7cac

    xor-int v18, v18, v23

    move-object/from16 v23, v1

    move v1, v2

    move-object/from16 v2, v20

    move-object/from16 v20, v19

    move-object/from16 v19, v3

    move-object/from16 v3, v36

    move/from16 v36, v18

    goto/16 :goto_2b

    :sswitch_2c
    move-object/from16 v36, v3

    move-object/from16 v3, v20

    move-object/from16 v1, v23

    move-object/from16 v20, v2

    .line 872
    invoke-static/range {p1 .. p1}, Ll/֡۬;->ܺܽۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v18

    sget-object v2, Ll/ᩴ۫ܽ;->ۜ᩸᩵:[S

    const/4 v6, 0x3

    move-object/from16 v19, v3

    const/4 v3, 0x6

    invoke-static {v2, v6, v3, v14}, Ll/֨֫;->ۚܺ᩵([SIII)Ljava/lang/String;

    move-result-object v2

    .line 923
    sget v3, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v3, :cond_1a

    const-string v3, "\u0736\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v35

    mul-int/lit8 v3, v3, -0x6b

    xor-int v6, v3, v34

    mul-int/lit16 v6, v6, -0x7bdf

    const v23, -0x5a9cfa01

    xor-int v6, v6, v23

    const v23, -0x35e1b5f6

    goto :goto_1e

    :cond_1a
    const-string v3, "\u1a75\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v34

    mul-int/lit8 v3, v3, 0x65

    xor-int v6, v3, v35

    mul-int/lit16 v6, v6, 0x71c3

    const v23, 0x4f69d3f0

    xor-int v6, v6, v23

    const v23, -0x65234f48

    :goto_1e
    xor-int v3, v3, v23

    move-object/from16 v23, v1

    move v1, v6

    move-object/from16 v42, v19

    move-object/from16 v19, v2

    move-object/from16 v2, v20

    move-object/from16 v20, v42

    move-object/from16 v43, v36

    move/from16 v36, v3

    move-object/from16 v3, v43

    goto/16 :goto_0

    :sswitch_2d
    move-object/from16 v36, v3

    move-object/from16 v6, v18

    move-object/from16 v1, v23

    move-object/from16 v42, v20

    move-object/from16 v20, v2

    move-object/from16 v2, v19

    move-object/from16 v19, v42

    const/4 v3, 0x2

    move-object/from16 v18, v2

    move-object/from16 v5, v40

    move/from16 v2, v41

    .line 871
    invoke-static {v5, v2, v3, v14}, Ll/֡ܶ;->ܽ᩻᩵([SIII)Ljava/lang/String;

    move-result-object v3

    move/from16 v23, v2

    move-object/from16 v2, v17

    invoke-static {v2, v3}, Ll/ۘۨ;->۟ۡۤ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/text/SpannableStringBuilder;

    move-result-object v3

    .line 511
    sget v17, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v17, :cond_1b

    :goto_1f
    const-string v17, "\u073f\u073d"

    invoke-static/range {v17 .. v17}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v34

    move-object/from16 v37, v2

    xor-int v2, v17, v35

    mul-int/lit16 v2, v2, -0x6915

    const v38, 0x759efda9

    xor-int v2, v2, v38

    const v38, -0x669efa51

    xor-int v17, v17, v38

    move-object/from16 v40, v5

    move/from16 v41, v23

    move-object/from16 v23, v1

    move v1, v2

    move-object v5, v3

    move-object/from16 v2, v20

    move-object/from16 v3, v36

    move/from16 v36, v17

    move-object/from16 v20, v19

    move-object/from16 v17, v37

    goto/16 :goto_2a

    :cond_1b
    move-object/from16 v37, v2

    const-string v2, "\u073d\u05ab"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v35

    move-object/from16 v17, v3

    xor-int v3, v2, v34

    mul-int/lit16 v3, v3, 0x4ab1

    const v38, -0x1a40c8cd

    xor-int v3, v3, v38

    const v38, 0x19d9fa75

    xor-int v2, v2, v38

    move-object/from16 v40, v5

    move-object/from16 v5, v17

    move/from16 v41, v23

    move-object/from16 v17, v37

    :goto_20
    move-object/from16 v23, v1

    move v1, v3

    move-object/from16 v3, v36

    move/from16 v36, v2

    move-object/from16 v2, v20

    move-object/from16 v20, v19

    goto/16 :goto_2a

    :sswitch_2e
    move-object/from16 v36, v3

    move-object/from16 v6, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v1, v23

    move-object/from16 v20, v2

    .line 871
    new-instance v2, Landroid/text/SpannableStringBuilder;

    invoke-direct {v2, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    sget-object v40, Ll/ᩴ۫ܽ;->ۜ᩸᩵:[S

    const/16 v41, 0x1

    .line 904
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v3

    if-nez v3, :cond_1c

    move-object/from16 v17, v2

    :goto_21
    const-string v2, "\u06e8\u06e1"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v35

    mul-int/lit8 v2, v2, -0x2f

    xor-int v3, v2, v34

    mul-int/lit16 v3, v3, -0x42e9

    const v23, 0xacb5f96

    xor-int v3, v3, v23

    const v23, -0x58d9ad1f

    xor-int v2, v2, v23

    goto :goto_20

    :cond_1c
    const-string v3, "\u1a73\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v34

    move-object/from16 v17, v1

    xor-int v1, v3, v35

    mul-int/lit16 v1, v1, -0x7e7b

    const v23, 0x52596db1

    xor-int v1, v1, v23

    const v23, -0x5fe4e79b

    xor-int v3, v3, v23

    move-object/from16 v23, v17

    move-object/from16 v17, v2

    move-object/from16 v2, v20

    move-object/from16 v20, v19

    move-object/from16 v19, v18

    move-object/from16 v18, v6

    :goto_22
    move-object/from16 v42, v36

    move/from16 v36, v3

    :goto_23
    move-object/from16 v3, v42

    goto/16 :goto_0

    :sswitch_2f
    move-object/from16 v36, v3

    move-object/from16 v37, v17

    move-object/from16 v6, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move/from16 v23, v41

    .line 867
    invoke-static/range {p1 .. p1}, Ll/ۗ᩶;->֨֫ۜ(Ljava/lang/Object;)I

    move-result v1

    iget-object v2, v0, Ll/ᩴ۫ܽ;->۬:Landroid/widget/TextView;

    iget-object v3, v0, Ll/ᩴ۫ܽ;->᩶:Ljava/lang/String;

    if-nez v1, :cond_1d

    const-string v1, "\u1a7b\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v35

    mul-int/lit8 v1, v1, 0xf

    xor-int v0, v1, v34

    mul-int/lit16 v0, v0, 0x6369

    const v17, 0x59d08549

    xor-int v0, v0, v17

    const v17, -0x29feb827

    xor-int v1, v1, v17

    move-object/from16 v20, v19

    move/from16 v41, v23

    move-object/from16 v17, v37

    move-object/from16 v23, v3

    move-object/from16 v19, v18

    move-object/from16 v3, v36

    move/from16 v36, v1

    move-object/from16 v18, v6

    move v1, v0

    goto :goto_24

    :cond_1d
    const-string v0, "\u06e1\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v34

    xor-int v1, v0, v35

    mul-int/lit16 v1, v1, -0x6c15

    const v17, -0x2dfff3c

    xor-int v1, v1, v17

    const v17, 0x6863b77d

    xor-int v0, v0, v17

    move-object/from16 v20, v19

    move/from16 v41, v23

    move-object/from16 v17, v37

    move-object/from16 v23, v3

    move-object/from16 v19, v18

    move-object/from16 v3, v36

    move/from16 v36, v0

    move-object/from16 v18, v6

    :goto_24
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_30
    move-object/from16 v36, v3

    move-object/from16 v37, v17

    move-object/from16 v6, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v17, v23

    move/from16 v23, v41

    move-object/from16 v20, v2

    const/16 v0, 0x7e2e

    const/16 v14, 0x7e2e

    goto :goto_25

    :sswitch_31
    move-object/from16 v36, v3

    move-object/from16 v37, v17

    move-object/from16 v6, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v17, v23

    move/from16 v23, v41

    move-object/from16 v20, v2

    const/16 v0, 0x191

    const/16 v14, 0x191

    :goto_25
    const-string v0, "\u073d\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v1, v0, v34

    mul-int/lit16 v1, v1, 0xee1

    const v2, 0x1989cb4c

    xor-int/2addr v1, v2

    const v2, 0x101aaa7e

    goto/16 :goto_26

    :sswitch_32
    move-object/from16 v36, v3

    move-object/from16 v37, v17

    move-object/from16 v6, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v17, v23

    move/from16 v23, v41

    move-object/from16 v20, v2

    const v0, 0xabdb100

    add-int v0, v29, v0

    move/from16 v1, v39

    mul-int/lit16 v2, v1, 0x68e0

    sub-int/2addr v2, v0

    if-lez v2, :cond_1e

    const-string v0, "\u073a\u1a79"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v35

    xor-int v2, v0, v34

    mul-int/lit16 v2, v2, 0x723d

    const v3, 0x31c840db

    xor-int/2addr v2, v3

    const v3, -0x9399e19

    goto/16 :goto_28

    :cond_1e
    const-string v0, "\u1a73\u1a79"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v34

    xor-int v2, v0, v35

    mul-int/lit16 v2, v2, -0x769d

    const v3, 0x5f7f6f69

    xor-int/2addr v2, v3

    const v3, -0x3a848245

    goto/16 :goto_28

    :sswitch_33
    move-object/from16 v36, v3

    move-object/from16 v37, v17

    move-object/from16 v6, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v17, v23

    move/from16 v23, v41

    move-object/from16 v20, v2

    aget-short v39, v27, v28

    mul-int v29, v39, v39

    sget v0, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v0, :cond_1f

    goto :goto_27

    :cond_1f
    const-string v0, "\u06d9\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v34

    mul-int/lit8 v0, v0, -0x65

    xor-int v1, v0, v35

    mul-int/lit16 v1, v1, -0x2ed5

    const v2, 0x33683631

    xor-int/2addr v1, v2

    const v2, 0x50153a7a

    :goto_26
    xor-int/2addr v0, v2

    goto :goto_29

    :sswitch_34
    move-object/from16 v36, v3

    move-object/from16 v37, v17

    move-object/from16 v6, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v17, v23

    move/from16 v1, v39

    move/from16 v23, v41

    move-object/from16 v20, v2

    sget-object v27, Ll/ᩴ۫ܽ;->ۜ᩸᩵:[S

    const/16 v28, 0x0

    .line 706
    sget v0, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v0, :cond_20

    move/from16 v39, v1

    :goto_27
    const-string v0, "\u06e7\u1a77"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v34

    mul-int/lit8 v0, v0, -0x77

    xor-int v1, v0, v35

    mul-int/lit16 v1, v1, -0xff

    const v2, -0x598fbe81

    xor-int/2addr v1, v2

    const v2, -0x317104aa

    goto :goto_26

    :cond_20
    const-string v0, "\u06d6\u06e8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v35, v0

    mul-int/lit8 v0, v0, -0x75

    xor-int v2, v0, v34

    mul-int/lit16 v2, v2, -0x350b

    const v3, -0x44a5b53b

    xor-int/2addr v2, v3

    const v3, 0x51b4ab3c

    :goto_28
    xor-int/2addr v0, v3

    move/from16 v39, v1

    move v1, v2

    :goto_29
    move-object/from16 v2, v20

    move/from16 v41, v23

    move-object/from16 v3, v36

    move/from16 v36, v0

    move-object/from16 v23, v17

    move-object/from16 v20, v19

    move-object/from16 v17, v37

    move-object/from16 v0, p0

    :goto_2a
    move-object/from16 v19, v18

    :goto_2b
    move-object/from16 v18, v6

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79a30598 -> :sswitch_17
        -0x7877d6f7 -> :sswitch_1e
        -0x758644b2 -> :sswitch_32
        -0x75004c2f -> :sswitch_b
        -0x6e758c98 -> :sswitch_5
        -0x6e0eccd0 -> :sswitch_f
        -0x6ce7d8f5 -> :sswitch_20
        -0x6b7df40c -> :sswitch_e
        -0x6b6750c5 -> :sswitch_c
        -0x62f504ba -> :sswitch_2b
        -0x6043819a -> :sswitch_2
        -0x5a3b7500 -> :sswitch_24
        -0x57ffd8ae -> :sswitch_10
        -0x5594bfbd -> :sswitch_1c
        -0x49cabe35 -> :sswitch_2c
        -0x461f4aa8 -> :sswitch_23
        -0x413e180e -> :sswitch_2b
        -0x402a1e52 -> :sswitch_2
        -0x3f706fa3 -> :sswitch_2c
        -0x3d0afe31 -> :sswitch_26
        -0x3cf9f5cc -> :sswitch_18
        -0x3ada5af1 -> :sswitch_1
        -0x3835daca -> :sswitch_7
        -0x3816b65e -> :sswitch_3
        -0x36b33eee -> :sswitch_2f
        -0x36120a99 -> :sswitch_18
        -0x33ee798c -> :sswitch_27
        -0x2bd1aebb -> :sswitch_9
        -0x2adc7a3a -> :sswitch_1f
        -0x2982b027 -> :sswitch_d
        -0x28a31539 -> :sswitch_2a
        -0x2663b613 -> :sswitch_15
        -0x21011f61 -> :sswitch_a
        -0x2078449a -> :sswitch_19
        -0x1d92940c -> :sswitch_0
        -0x19d38e89 -> :sswitch_2e
        -0x193f6c6d -> :sswitch_7
        -0x17534e20 -> :sswitch_1d
        -0x16ef8426 -> :sswitch_24
        -0x13254b28 -> :sswitch_26
        -0xf6b6515 -> :sswitch_22
        -0xe9c0554 -> :sswitch_1b
        -0x903005b -> :sswitch_11
        -0x776c949 -> :sswitch_16
        -0x61259c7 -> :sswitch_17
        -0x59ea060 -> :sswitch_33
        -0x523facf -> :sswitch_c
        -0x6df368 -> :sswitch_29
        -0x6d3250 -> :sswitch_12
        0x3818a39 -> :sswitch_21
        0x7cfaa48 -> :sswitch_0
        0x982bef2 -> :sswitch_6
        0xd0a8f4d -> :sswitch_d
        0xd1d4351 -> :sswitch_30
        0xfcc1e10 -> :sswitch_33
        0x111816c0 -> :sswitch_3
        0x120763bf -> :sswitch_13
        0x1654fc03 -> :sswitch_1
        0x172ef86c -> :sswitch_6
        0x18b59117 -> :sswitch_1a
        0x1a0c7229 -> :sswitch_5
        0x1b2a521e -> :sswitch_11
        0x1b5c070e -> :sswitch_1d
        0x1cde950b -> :sswitch_8
        0x1e4cdbbb -> :sswitch_34
        0x1f0da9e2 -> :sswitch_10
        0x2086365e -> :sswitch_31
        0x2155e80f -> :sswitch_2f
        0x24b85a11 -> :sswitch_14
        0x24bf3d89 -> :sswitch_e
        0x254d6cd2 -> :sswitch_14
        0x2927ed14 -> :sswitch_1f
        0x2a94b031 -> :sswitch_f
        0x2aa5d9e7 -> :sswitch_4
        0x2e5738a1 -> :sswitch_2d
        0x2f9017be -> :sswitch_30
        0x34ae2bd7 -> :sswitch_2e
        0x35ca28a4 -> :sswitch_1b
        0x3a372fb3 -> :sswitch_15
        0x3ec3b396 -> :sswitch_34
        0x4628be99 -> :sswitch_1a
        0x47976600 -> :sswitch_9
        0x486adff8 -> :sswitch_27
        0x486ecbba -> :sswitch_23
        0x48cd3cfb -> :sswitch_a
        0x49a5eb0a -> :sswitch_2a
        0x4a3fcc29 -> :sswitch_b
        0x4a530f72 -> :sswitch_28
        0x4b3729c0 -> :sswitch_31
        0x4e67323b -> :sswitch_22
        0x51d86cc1 -> :sswitch_19
        0x549efe8e -> :sswitch_1c
        0x55d9b444 -> :sswitch_12
        0x56e518fe -> :sswitch_28
        0x581d2cb7 -> :sswitch_8
        0x588b4fd1 -> :sswitch_25
        0x5b486979 -> :sswitch_32
        0x600899db -> :sswitch_25
        0x619a88d6 -> :sswitch_1e
        0x66da920f -> :sswitch_29
        0x674a46ac -> :sswitch_20
        0x7919e67a -> :sswitch_2d
        0x799c9c5e -> :sswitch_13
        0x7afb5acf -> :sswitch_16
        0x7b2fe6fc -> :sswitch_4
        0x7e775833 -> :sswitch_21
    .end sparse-switch
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    const p1, -0x4a74cae9

    sget p2, Ll/ۗ᩵;->֫۠۟:I

    sget p3, Ll/ۗ᩺;->ۡ᩺֡:I

    const-string p4, "\u06e7\u1a77"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x17b7

    const v1, 0x7f42a341

    xor-int/2addr v0, v1

    const v1, 0x2b1af161

    :goto_0
    xor-int/2addr p4, v1

    xor-int/2addr p1, p2

    mul-int/lit16 p1, p1, 0xb79

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v0

    xor-int/2addr p1, p4

    sparse-switch p1, :sswitch_data_0

    .line 0
    sget p4, Ll/۟;->ۗۤۛ:I

    if-eqz p4, :cond_7

    goto/16 :goto_2

    .line 3
    :sswitch_0
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    sget p4, Ll/ۗۗ;->ۨ۬ۖ:I

    if-gez p4, :cond_b

    goto/16 :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    sget p4, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz p4, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string p4, "\u1a7b\u06e1"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p3, p4

    mul-int/lit8 p4, p4, -0x1d

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x957

    const v1, 0x462d7236

    xor-int/2addr v0, v1

    const v1, -0x4507f305

    goto :goto_0

    .line 2
    :sswitch_2
    sget-boolean p4, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz p4, :cond_9

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    :sswitch_5
    return-void

    :sswitch_6
    sget p4, Ll/֨۟;->᩹֫᩷:I

    if-eqz p4, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string p4, "\u06d8\u1a74"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p2, p4

    mul-int/lit8 p4, p4, -0x43

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x2503

    const v1, 0x6be82dfa

    xor-int/2addr v0, v1

    const v1, -0x7c49ecd0

    goto :goto_0

    .line 3
    :sswitch_7
    sget-boolean p4, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz p4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string p4, "\u073f\u1a7b"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x63

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x6017

    const v1, -0x77d46f3b

    xor-int/2addr v0, v1

    const v1, 0x75ff16ac

    goto :goto_0

    .line 2
    :sswitch_8
    sget p4, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz p4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string p4, "\u06da\u1a79"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p2

    mul-int/lit8 p4, p4, -0x1f

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x1b3d

    const v1, 0x210b506

    xor-int/2addr v0, v1

    const v1, -0x5f056642

    goto/16 :goto_0

    :sswitch_9
    sget-boolean p4, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz p4, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string p4, "\u06df\u1a76"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x6237

    const v1, 0x70d2de3a

    xor-int/2addr v0, v1

    const v1, 0x4f7c118a

    goto/16 :goto_0

    :sswitch_a
    sget p4, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz p4, :cond_5

    goto :goto_2

    :cond_5
    const-string p4, "\u06e0\u06e0"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x2db5

    const v1, -0x4da495b3

    xor-int/2addr v0, v1

    const v1, -0x43f56641

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget p4, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz p4, :cond_6

    :goto_1
    const-string p4, "\u05a8\u06df"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x52f5

    const v1, -0x1c2459af

    xor-int/2addr v0, v1

    const v1, 0x7bff7952

    goto/16 :goto_0

    :cond_6
    const-string p4, "\u06e8\u05a8"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p2

    mul-int/lit8 p4, p4, -0x61

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x11ed

    const v1, 0x28d6e786

    xor-int/2addr v0, v1

    const v1, -0x44f17cae

    goto/16 :goto_0

    :cond_7
    const-string p4, "\u0733\u1a7b"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p2, p4

    mul-int/lit8 p4, p4, 0x23

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x2835

    const v1, -0x357aace4

    xor-int/2addr v0, v1

    const v1, -0x639ca9df

    goto/16 :goto_0

    .line 2
    :sswitch_c
    sget p4, Ll/֨۬;->۫ۙ᩺:I

    if-gtz p4, :cond_8

    :goto_2
    const-string p4, "\u0733\u06d6"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x37

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x23ef

    const v1, -0x25390038

    xor-int/2addr v0, v1

    const v1, 0x75193ae1

    goto/16 :goto_0

    :cond_8
    const-string p4, "\u06e7\u1a78"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x4641

    const v1, 0x48e58c85

    xor-int/2addr v0, v1

    const v1, -0x7b7eb929

    goto/16 :goto_0

    .line 1
    :sswitch_d
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result p4

    if-nez p4, :cond_a

    :cond_9
    :goto_3
    const-string p4, "\u06e0\u073f"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x5d7b

    const v1, 0x393c8cd

    xor-int/2addr v0, v1

    const v1, 0x1f453f23

    goto/16 :goto_0

    :cond_a
    const-string p4, "\u06e1\u05a8"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x7

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x5f8f

    const v1, -0x497f5c63

    xor-int/2addr v0, v1

    const v1, -0x65952469

    goto/16 :goto_0

    :sswitch_e
    sget p4, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz p4, :cond_c

    :cond_b
    :goto_4
    const-string p4, "\u073f\u073a"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x5cc9

    const v1, 0xd96fcb9

    xor-int/2addr v0, v1

    const v1, 0x5c84ef13

    goto/16 :goto_0

    :cond_c
    const-string p4, "\u1a7a\u1a76"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p2

    mul-int/lit8 p4, p4, -0x17

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x27b

    const v1, 0x254e023e

    xor-int/2addr v0, v1

    const v1, 0x27d1eee8

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b609209 -> :sswitch_2
        -0x6e2d139a -> :sswitch_7
        -0x6c1b6de8 -> :sswitch_1
        -0x62f1a014 -> :sswitch_d
        -0x613a0d49 -> :sswitch_8
        -0x55b93cd1 -> :sswitch_4
        -0x55ae47ac -> :sswitch_3
        -0x54e35f91 -> :sswitch_b
        -0x4d696f67 -> :sswitch_7
        -0x3cca802a -> :sswitch_3
        -0x26074eb6 -> :sswitch_a
        -0x20683258 -> :sswitch_d
        -0x17c4a5c8 -> :sswitch_e
        -0x166fac20 -> :sswitch_1
        -0x55cf2a5 -> :sswitch_e
        0x51abb52 -> :sswitch_c
        0x185c846c -> :sswitch_5
        0x1afb958f -> :sswitch_0
        0x267f89c0 -> :sswitch_c
        0x302245f0 -> :sswitch_8
        0x45088527 -> :sswitch_4
        0x4c79e605 -> :sswitch_2
        0x4d518ada -> :sswitch_a
        0x5dc502a1 -> :sswitch_b
        0x676db30d -> :sswitch_6
        0x6db349f5 -> :sswitch_9
        0x6f0fcade -> :sswitch_6
        0x6fdbe5f2 -> :sswitch_9
        0x782fa928 -> :sswitch_5
        0x7be86f4e -> :sswitch_0
    .end sparse-switch
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 2

    const p1, -0x6bf8d47d

    sget p2, Ll/ۗ۬;->ۘܳ᩻:I

    sget p3, Ll/֨ۤ;->ܿۖ᩵:I

    const-string p4, "\u06df\u073f"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x5119

    const v1, 0x4be89193    # 3.0483238E7f

    xor-int/2addr v0, v1

    const v1, -0x3143c3e6

    :goto_0
    xor-int/2addr p4, v1

    xor-int/2addr p1, p3

    mul-int/lit16 p1, p1, 0x75df

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v0

    xor-int/2addr p1, p4

    sparse-switch p1, :sswitch_data_0

    .line 4
    sget p4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz p4, :cond_4

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result p4

    if-lez p4, :cond_b

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result p4

    if-eqz p4, :cond_2

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    :sswitch_4
    return-void

    .line 0
    :sswitch_5
    sget p4, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz p4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string p4, "\u073d\u06d8"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x5f

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x4477

    const v1, 0xb6fd86b

    xor-int/2addr v0, v1

    const v1, 0x17cbc12

    goto :goto_0

    .line 3
    :sswitch_6
    sget-boolean p4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez p4, :cond_1

    goto :goto_1

    :cond_1
    const-string p4, "\u05ab\u06e4"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p2

    mul-int/lit8 p4, p4, -0xd

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x7e2f

    const v1, -0x6746438d

    xor-int/2addr v0, v1

    const v1, 0x6844242c

    goto :goto_0

    .line 2
    :sswitch_7
    sget p4, Ll/᩺;->ۙۛܶ:I

    if-gtz p4, :cond_3

    :cond_2
    :goto_1
    const-string p4, "\u06ec\u06d9"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, 0x2d

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x66f9

    const v1, -0x3fea9689

    xor-int/2addr v0, v1

    const v1, -0x36d7ebb1

    goto :goto_0

    :cond_3
    const-string p4, "\u1a76\u1a79"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x523

    const v1, 0x6f740aaa

    xor-int/2addr v0, v1

    const v1, -0x3699dd12

    goto/16 :goto_0

    :sswitch_8
    sget p4, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz p4, :cond_5

    :cond_4
    :goto_2
    const-string p4, "\u06db\u06db"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x2a7f

    const v1, -0x36a0c25c

    xor-int/2addr v0, v1

    const v1, 0x7d242770

    goto/16 :goto_0

    :cond_5
    const-string p4, "\u1a78\u1a78"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x414f

    const v1, 0x46f64ff1

    xor-int/2addr v0, v1

    const v1, -0x3823047c

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result p4

    if-gtz p4, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string p4, "\u06e0\u073a"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x2b

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x1251

    const v1, 0x285388f2

    xor-int/2addr v0, v1

    const v1, 0x316017da

    goto/16 :goto_0

    .line 1
    :sswitch_a
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result p4

    if-gtz p4, :cond_7

    goto :goto_3

    :cond_7
    const-string p4, "\u06e7\u1a77"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p2, p4

    mul-int/lit8 p4, p4, -0x5d

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0xcb7

    const v1, 0x41e340c8

    xor-int/2addr v0, v1

    const v1, -0x745d0e59

    goto/16 :goto_0

    :sswitch_b
    sget-boolean p4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez p4, :cond_8

    :goto_3
    const-string p4, "\u1a74\u05a1"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    sub-int p4, p2, p4

    mul-int/lit8 p4, p4, 0x41

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x3637

    const v1, -0x2b3bf3d6

    xor-int/2addr v0, v1

    const v1, -0x3438bda9    # -2.6117294E7f

    goto/16 :goto_0

    :cond_8
    const-string p4, "\u1a7a\u0730"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    mul-int/lit8 p4, p4, -0x11

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0xf31

    const v1, 0x33758990

    xor-int/2addr v0, v1

    const v1, -0x37edba67

    goto/16 :goto_0

    .line 4
    :sswitch_c
    sget p4, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz p4, :cond_9

    goto :goto_5

    :cond_9
    const-string p4, "\u06db\u073f"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x570f

    const v1, -0x1abe0045

    xor-int/2addr v0, v1

    const v1, 0xe8bdee3

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result p4

    if-eqz p4, :cond_a

    :goto_4
    const-string p4, "\u073f\u06e1"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    add-int/2addr p4, p2

    mul-int/lit8 p4, p4, 0x23

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, 0x6487

    const v1, -0x3a34ca03

    xor-int/2addr v0, v1

    const v1, -0x78313948

    goto/16 :goto_0

    :cond_a
    const-string p4, "\u06eb\u1a79"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, -0x1155

    const v1, 0x17694a88

    xor-int/2addr v0, v1

    const v1, -0xe463d18

    goto/16 :goto_0

    .line 3
    :sswitch_e
    sget p4, Ll/֡֡;->֫ۤܳ:I

    if-ltz p4, :cond_c

    :cond_b
    :goto_5
    const-string p4, "\u1a7b\u06db"

    invoke-static {p4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p3

    xor-int v0, p4, p2

    mul-int/lit16 v0, v0, 0x4b8b

    const v1, -0x83f9aca

    xor-int/2addr v0, v1

    const v1, -0xa15288b

    goto/16 :goto_0

    :cond_c
    const-string p4, "\u1a75\u1a7a"

    invoke-static {p4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p4

    xor-int/2addr p4, p2

    xor-int v0, p4, p3

    mul-int/lit16 v0, v0, -0x653d

    const v1, -0x4ba51bc3

    xor-int/2addr v0, v1

    const v1, -0x103de66b

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ea74080 -> :sswitch_4
        -0x7830f23d -> :sswitch_1
        -0x53b3e2be -> :sswitch_c
        -0x41ce6ae6 -> :sswitch_3
        -0x3247f0a8 -> :sswitch_d
        -0x2c30ce92 -> :sswitch_8
        -0x2b656c54 -> :sswitch_7
        -0x233de198 -> :sswitch_6
        -0x1a591314 -> :sswitch_7
        -0x133a47ce -> :sswitch_e
        -0xe1f34b1 -> :sswitch_9
        0x3237689 -> :sswitch_d
        0xc507a7f -> :sswitch_b
        0xdd203e5 -> :sswitch_8
        0x1717cbd1 -> :sswitch_2
        0x2661c1b1 -> :sswitch_a
        0x2cf25d4f -> :sswitch_b
        0x301cb121 -> :sswitch_4
        0x31500416 -> :sswitch_5
        0x31787a46 -> :sswitch_3
        0x362619f8 -> :sswitch_e
        0x3a61054e -> :sswitch_9
        0x441d6944 -> :sswitch_6
        0x4df0bb24 -> :sswitch_0
        0x523b1f1c -> :sswitch_2
        0x52c292e8 -> :sswitch_a
        0x578918df -> :sswitch_5
        0x5f5da478 -> :sswitch_1
        0x743a8f2c -> :sswitch_0
        0x7cc1376f -> :sswitch_c
    .end sparse-switch
.end method
