.class public Ll/۫ۡ᩷;
.super Ll/ۗܺ᩷;
.source "N5YQ"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/content/ServiceConnection;


# static fields
.field private static final ᩸۠ۡ:[S


# instance fields
.field public ۜۧ:J

.field public ܳۧ:Ll/ۡۖᩳ;

.field public ܿۧ:Ll/ۗۡ᩷;

.field public ᩳۧ:Ll/ܺۖᩳ;

.field public ᩻ۧ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x46

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    return-void

    :array_0
    .array-data 2
        0x11e6s
        -0x18c5s
        0x1d8fs
        -0x1123s
        -0x120s
        -0x88es
        -0x160ds
        -0x3d3s
        -0x16s
        0x99fs
        0x653s
        -0x1b7s
        0x203as
        -0xbb9s
        -0x5d8s
        0x2810s
        -0x347es
        0x37d9s
        0x220ds
        -0x257cs
        -0x333bs
        -0x112s
        0x21fcs
        -0x27c0s
        -0xa03s
        -0x3c50s
        -0x2c97s
        0x316es
        0x2673s
        -0xce2s
        -0x2cb5s
        -0x2b4cs
        0x29des
        0x2466s
        -0x2b15s
        -0x340es
        0x3c7fs
        -0x25bas
        -0x2c8fs
        0x33d0s
        -0xedcs
        0x11das
        -0x2es
        -0x22d6s
        -0x2443s
        0x3e07s
        -0x3cb4s
        -0x3a27s
        0x194es
        -0x1f0as
        0x740s
        -0x337fs
        0x452s
        -0x35f2s
        -0x35c3s
        -0x35c4s
        -0x35d4s
        -0x35e2s
        -0x35c6s
        -0x35d6s
        -0x35c3s
        -0x35cas
        -0x35f2s
        -0x35d4s
        -0x35c5s
        -0x35das
        -0x35c7s
        -0x35das
        -0x35c5s
        -0x35cas
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Ll/ۗܺ᩷;-><init>()V

    const/4 v0, 0x0

    .line 18
    iput-boolean v0, p0, Ll/۫ۡ᩷;->᩻ۧ:Z

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 27

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

    const v18, -0x734acb44

    sget v19, Ll/ۘᩴ;->ܿ۬ܿ:I

    sget v20, Ll/ۗۚ;->ܶۛᩴ:I

    const-string v21, "\u06d9\u06e8"

    invoke-static/range {v21 .. v21}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v21

    add-int v21, v21, v20

    mul-int/lit8 v21, v21, 0x35

    xor-int v1, v21, v19

    mul-int/lit16 v1, v1, -0x7d7f

    const v23, -0x732415ed

    xor-int v1, v1, v23

    const v23, -0x3109a27c

    xor-int v21, v21, v23

    move-object/from16 v16, v5

    move-object v13, v12

    move-object v6, v15

    move/from16 v22, v21

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const v21, -0x734acb44

    const/16 v23, 0x0

    move-object v5, v4

    move-object v4, v3

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v10, v21, v19

    mul-int/lit16 v10, v10, 0x3c65

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v1, v10

    xor-int v21, v22, v1

    sparse-switch v21, :sswitch_data_0

    move v1, v11

    move-object/from16 v22, v13

    move/from16 v24, v14

    .line 90
    invoke-static/range {p0 .. p0}, Ll/֨۫;->֫ۗۗ(Ljava/lang/Object;)V

    .line 91
    new-instance v10, Landroid/content/Intent;

    const-class v11, Ll/ۤۡ᩷;

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v13

    if-gtz v13, :cond_6

    goto/16 :goto_3

    .line 88
    :sswitch_0
    sget-boolean v1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v1, :cond_0

    :goto_1
    move v1, v11

    move-object v10, v13

    move v13, v14

    goto/16 :goto_6

    :cond_0
    move v1, v11

    goto/16 :goto_c

    .line 58
    :sswitch_1
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-gez v1, :cond_2

    :cond_1
    move-object v10, v13

    move v13, v14

    goto/16 :goto_a

    :cond_2
    move v1, v11

    move-object/from16 v22, v13

    move/from16 v24, v14

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    sget v1, Ll/֫᩹;->᩶ۘۘ:I

    if-nez v1, :cond_1

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    goto :goto_1

    .line 55
    :sswitch_4
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    return-void

    .line 99
    :sswitch_5
    invoke-static/range {p0 .. p0}, Ll/ۖۘ;->ۜۨۧ(Ljava/lang/Object;)V

    return-void

    :sswitch_6
    move v1, v11

    .line 101
    invoke-static {}, Ll/֨ᩴ;->ۖ᩶ۜ()J

    move-result-wide v10

    iput-wide v10, v0, Ll/۫ۡ᩷;->ۜۧ:J

    move-object/from16 v22, v13

    move/from16 v24, v14

    goto :goto_2

    :sswitch_7
    move v1, v11

    .line 98
    invoke-static {}, Ll/֫ܿ;->ۤ֨ۨ()J

    move-result-wide v10

    move-object/from16 v22, v13

    move/from16 v24, v14

    iget-wide v13, v0, Ll/۫ۡ᩷;->ۜۧ:J

    sub-long/2addr v10, v13

    const-wide/16 v13, 0x12c

    cmp-long v25, v10, v13

    if-gez v25, :cond_3

    const-string v10, "\u05a1\u06d6"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v20

    xor-int v11, v10, v19

    mul-int/lit16 v11, v11, 0x2565

    const v13, -0x44909d93

    xor-int/2addr v11, v13

    const v13, -0x4feb4afc

    goto/16 :goto_5

    :cond_3
    const-string v10, "\u1a74\u1a7a"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v19

    mul-int/lit8 v10, v10, 0x23

    xor-int v11, v10, v20

    mul-int/lit16 v11, v11, -0x52f7

    const v13, 0xb66fafc

    xor-int/2addr v11, v13

    const v13, -0x6b5d0140

    goto/16 :goto_5

    :sswitch_8
    return-void

    :sswitch_9
    const/4 v1, 0x1

    .line 94
    iput-boolean v1, v0, Ll/۫ۡ᩷;->᩻ۧ:Z

    .line 95
    invoke-static/range {p0 .. p0}, Ll/ۖۘ;->ۜۨۧ(Ljava/lang/Object;)V

    return-void

    :sswitch_a
    move v1, v11

    move-object/from16 v22, v13

    move/from16 v24, v14

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    const v11, 0x7eebb2da

    xor-int/2addr v10, v11

    if-ne v2, v10, :cond_4

    const-string v10, "\u06eb\u1a7b"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v19

    xor-int v11, v10, v20

    mul-int/lit16 v11, v11, 0x5183

    const v13, -0x7273b262

    xor-int/2addr v11, v13

    const v13, -0x3233739e

    goto/16 :goto_5

    :cond_4
    :goto_2
    const-string v10, "\u1a77\u0730"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v20

    xor-int v11, v10, v19

    mul-int/lit16 v11, v11, -0x26cd

    const v13, 0x42700332    # 60.00312f

    xor-int/2addr v11, v13

    const v13, 0x55538dfd

    goto/16 :goto_5

    :sswitch_b
    move v1, v11

    move-object/from16 v22, v13

    move/from16 v24, v14

    sget-object v5, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    const/4 v10, 0x7

    const/4 v11, 0x3

    invoke-static {v5, v10, v11, v12}, Ll/֡᩺;->᩸ۜۢ([SIII)Ljava/lang/String;

    move-result-object v5

    sget v10, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v10, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v10, "\u06d8\u06e0"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    add-int v10, v10, v20

    mul-int/lit8 v10, v10, 0x2f

    xor-int v11, v10, v19

    mul-int/lit16 v11, v11, 0x79a3

    const v13, 0x4d1c4282    # 1.63850272E8f

    xor-int/2addr v11, v13

    const v13, 0xe41111d

    goto/16 :goto_5

    :goto_3
    const-string v10, "\u1a78\u06d9"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v19

    xor-int v11, v10, v20

    mul-int/lit16 v11, v11, 0x9d3

    const v13, 0x662cd95e

    xor-int/2addr v11, v13

    const v13, 0x57653527

    goto/16 :goto_5

    .line 91
    :cond_6
    invoke-direct {v10, v0, v11}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 92
    invoke-static {v0, v10}, Ll/ۘܿ;->ᩳ᩸֫(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :sswitch_c
    move v1, v11

    move-object/from16 v22, v13

    move/from16 v24, v14

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    const v11, 0x7ee0b3cf

    xor-int/2addr v10, v11

    if-ne v2, v10, :cond_7

    const-string v10, "\u0730\u06e0"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v19

    xor-int v11, v10, v20

    mul-int/lit16 v11, v11, 0x5c5d

    const v13, -0x7f837f18

    xor-int/2addr v11, v13

    const v13, 0x1a348604

    goto/16 :goto_5

    :cond_7
    const-string v10, "\u1a79\u1a74"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v19

    mul-int/lit8 v10, v10, -0x59

    xor-int v11, v10, v20

    mul-int/lit16 v11, v11, -0x5db7

    const v13, -0x1181d524

    xor-int/2addr v11, v13

    const v13, 0x6f3b4192

    goto/16 :goto_5

    :sswitch_d
    move v1, v11

    move-object/from16 v22, v13

    move/from16 v24, v14

    invoke-static {v6, v7, v9, v12}, Ll/֡᩺;->᩸ۜۢ([SIII)Ljava/lang/String;

    move-result-object v4

    .line 85
    sget v10, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v10, :cond_8

    :goto_4
    move-object/from16 v10, v22

    move/from16 v13, v24

    goto/16 :goto_6

    :cond_8
    const-string v10, "\u0730\u06e1"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int v10, v10, v19

    mul-int/lit8 v10, v10, -0x2d

    xor-int v11, v10, v20

    mul-int/lit16 v11, v11, 0x1487

    const v13, 0x5d7542d2

    xor-int/2addr v11, v13

    const v13, 0x5cbc81a3

    goto :goto_5

    :sswitch_e
    move v1, v11

    move-object/from16 v22, v13

    move/from16 v24, v14

    .line 92
    sget-object v6, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    const/4 v7, 0x4

    const/4 v9, 0x3

    sget v10, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v10, :cond_9

    goto :goto_4

    :cond_9
    const-string v10, "\u0733\u1a7a"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v20

    xor-int v11, v10, v19

    mul-int/lit16 v11, v11, 0x174b

    const v13, -0x382a37b8

    xor-int/2addr v11, v13

    const v13, -0x2b3c8e31

    goto :goto_5

    .line 88
    :sswitch_f
    iget-object v1, v0, Ll/۫ۡ᩷;->ܳۧ:Ll/ۡۖᩳ;

    invoke-virtual {v1}, Ll/ۡۖᩳ;->֫()V

    return-void

    :sswitch_10
    move v1, v11

    move-object/from16 v22, v13

    move/from16 v24, v14

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    const v11, 0x7e9c82e1

    xor-int/2addr v10, v11

    if-ne v2, v10, :cond_a

    const-string v10, "\u06e2\u0733"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v20

    mul-int/lit8 v10, v10, -0x55

    xor-int v11, v10, v19

    mul-int/lit16 v11, v11, 0x1e29

    const v13, -0x11a4f1a5

    xor-int/2addr v11, v13

    const v13, -0x4c08a440

    goto :goto_5

    :cond_a
    const-string v10, "\u05a8\u06d6"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v19

    xor-int v11, v10, v20

    mul-int/lit16 v11, v11, 0x77d1

    const v13, 0x79d07a0d

    xor-int/2addr v11, v13

    const v13, -0x6f7a7b18

    :goto_5
    xor-int/2addr v10, v13

    move-object/from16 v13, v22

    move/from16 v14, v24

    move/from16 v22, v10

    goto :goto_8

    :sswitch_11
    move v1, v11

    move-object v10, v13

    move v13, v14

    invoke-static {v10, v13, v15, v12}, Ll/֫ۧ;->᩷ᩳ᩺([SIII)Ljava/lang/String;

    move-result-object v3

    sget v11, Ll/ۛ;->᩺᩻֫:I

    if-ltz v11, :cond_b

    :goto_6
    const-string v11, "\u06df\u06e8"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v20

    xor-int v14, v11, v19

    mul-int/lit16 v14, v14, 0x5fe1

    const v22, 0x728ef8c4

    xor-int v14, v14, v22

    const v22, 0x1a2d6c1d

    goto/16 :goto_e

    :cond_b
    const-string v11, "\u05ab\u06d7"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v19

    xor-int v14, v11, v20

    mul-int/lit16 v14, v14, -0x1a05

    const v22, -0x31351fdd

    xor-int v14, v14, v22

    const v22, 0x7228b80e

    goto/16 :goto_e

    :sswitch_12
    move v1, v11

    sget-object v13, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    const/4 v14, 0x1

    const/4 v15, 0x3

    sget v10, Ll/֨۟;->᩹֫᩷:I

    if-eqz v10, :cond_c

    goto/16 :goto_c

    :cond_c
    const-string v10, "\u1a78\u06e2"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v20, v10

    mul-int/lit8 v10, v10, 0x33

    xor-int v11, v10, v19

    mul-int/lit16 v11, v11, -0x222b

    const v22, -0x68a65ce

    xor-int v11, v11, v22

    const v22, -0x30eb19d6    # -2.498112E9f

    :goto_7
    xor-int v22, v10, v22

    :goto_8
    move/from16 v26, v11

    move v11, v1

    move/from16 v1, v26

    goto/16 :goto_0

    .line 86
    :sswitch_13
    invoke-static/range {p0 .. p0}, Ll/ۖۘ;->ۜۨۧ(Ljava/lang/Object;)V

    return-void

    :sswitch_14
    move v1, v11

    move-object v10, v13

    move v13, v14

    const v11, 0x102001b

    if-ne v2, v11, :cond_d

    const-string v11, "\u05a8\u06df"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v20, v11

    mul-int/lit8 v11, v11, -0x25

    xor-int v14, v11, v19

    mul-int/lit16 v14, v14, -0x1647

    const v22, -0x4fc5aa58

    xor-int v14, v14, v22

    const v22, 0x42ff42bd

    goto/16 :goto_e

    :cond_d
    const-string v11, "\u0736\u1a74"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v20

    xor-int v14, v11, v19

    mul-int/lit16 v14, v14, -0x7bcf

    const v22, 0x366a4a3b

    xor-int v14, v14, v22

    const v22, -0x6cc4eb7b

    goto/16 :goto_e

    :sswitch_15
    move v1, v11

    move-object v10, v13

    move v13, v14

    .line 84
    invoke-static/range {p1 .. p1}, Ll/֨֫;->ۛۗ᩹(Ljava/lang/Object;)I

    move-result v2

    const v11, 0x102001a

    if-ne v2, v11, :cond_e

    const-string v11, "\u0733\u06d7"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    add-int v11, v11, v19

    mul-int/lit8 v11, v11, 0x11

    xor-int v14, v11, v20

    mul-int/lit16 v14, v14, 0x3eb3

    const v22, -0x69ae34c2

    xor-int v14, v14, v22

    const v22, -0x26e8b8ca

    goto/16 :goto_e

    :cond_e
    const-string v11, "\u1a79\u06eb"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    sub-int v11, v19, v11

    mul-int/lit8 v11, v11, 0x61

    xor-int v14, v11, v20

    mul-int/lit16 v14, v14, 0x6ff9

    const v22, 0x7c89a1ea

    xor-int v14, v14, v22

    const v22, -0x1157c45

    goto/16 :goto_e

    :sswitch_16
    move v1, v11

    move-object v10, v13

    move v13, v14

    const/16 v11, 0x1e8

    const/16 v12, 0x1e8

    goto :goto_9

    :sswitch_17
    move v1, v11

    move-object v10, v13

    move v13, v14

    const v11, 0x8023

    const v12, 0x8023

    :goto_9
    const-string v11, "\u06df\u073f"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    add-int v11, v11, v20

    mul-int/lit8 v11, v11, -0x13

    xor-int v14, v11, v19

    mul-int/lit16 v14, v14, 0x4c8f

    const v22, 0x20066cf2

    xor-int v14, v14, v22

    const v22, 0x3045101a

    goto/16 :goto_e

    :sswitch_18
    move v1, v11

    move-object v10, v13

    move v13, v14

    mul-int v11, v8, v1

    sub-int v11, v11, v23

    if-gtz v11, :cond_f

    const-string v11, "\u06e2\u1a77"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v20

    xor-int v14, v11, v19

    mul-int/lit16 v14, v14, 0x7a73

    const v22, -0x5016d6a0

    xor-int v14, v14, v22

    const v22, 0x123a050a

    goto/16 :goto_e

    :cond_f
    const-string v11, "\u06dc\u1a78"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v19

    xor-int v14, v11, v20

    mul-int/lit16 v14, v14, -0x47ab

    const v22, -0x115d4495

    xor-int v14, v14, v22

    const v22, 0x39f5f8b2

    goto/16 :goto_e

    :sswitch_19
    move-object v10, v13

    move v13, v14

    const v1, 0xcea400

    add-int v23, v18, v1

    const/16 v11, 0x1cc0

    .line 3
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v1

    if-eqz v1, :cond_10

    :goto_a
    const-string v1, "\u06e4\u0736"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v14, v1, v20

    mul-int/lit16 v14, v14, -0x20f

    const v22, -0x4d1f688e

    xor-int v14, v14, v22

    const v22, -0x2322554b

    goto :goto_b

    :cond_10
    const-string v1, "\u06e1\u06e4"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x19

    xor-int v14, v1, v19

    mul-int/lit16 v14, v14, -0x1b2b

    const v22, 0x46d5a370

    xor-int v14, v14, v22

    const v22, 0x6b716cfe

    :goto_b
    xor-int v22, v1, v22

    goto/16 :goto_f

    :sswitch_1a
    move v1, v11

    move-object v10, v13

    move v13, v14

    aget-short v8, v16, v17

    mul-int v18, v8, v8

    .line 32
    sget-boolean v11, Ll/֨۫;->۬᩷᩶:Z

    if-nez v11, :cond_11

    goto :goto_d

    :cond_11
    const-string v11, "\u06e7\u06e1"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    add-int v11, v11, v19

    mul-int/lit8 v11, v11, -0x5f

    xor-int v14, v11, v20

    mul-int/lit16 v14, v14, 0x56cb

    const v22, -0x758a0681

    xor-int v14, v14, v22

    const v22, 0x16236fbd

    goto/16 :goto_e

    :sswitch_1b
    move v1, v11

    move-object v10, v13

    move v13, v14

    const/16 v17, 0x0

    .line 83
    sget v11, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v11, :cond_12

    move v14, v13

    move-object v13, v10

    :goto_c
    const-string v10, "\u06e7\u06d8"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int v10, v10, v20

    xor-int v11, v10, v19

    mul-int/lit16 v11, v11, -0x25c1

    const v22, -0x567bf078

    xor-int v11, v11, v22

    const v22, -0x4dade14e

    goto/16 :goto_7

    :cond_12
    const-string v11, "\u1a7b\u1a77"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    add-int v11, v11, v19

    mul-int/lit8 v11, v11, -0x5b

    xor-int v14, v11, v20

    mul-int/lit16 v14, v14, -0x2441

    const v22, 0x17528973

    xor-int v14, v14, v22

    const v22, -0x1bf16d0c

    goto :goto_e

    :sswitch_1c
    move v1, v11

    move-object v10, v13

    move v13, v14

    sget-object v16, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    sget-boolean v11, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v11, :cond_13

    :goto_d
    const-string v11, "\u1a7a\u05a8"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v19

    xor-int v14, v11, v20

    mul-int/lit16 v14, v14, -0x1183

    const v22, 0x29497898

    xor-int v14, v14, v22

    const v22, -0x423663e2

    goto :goto_e

    :cond_13
    const-string v11, "\u1a7a\u1a7b"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v20

    xor-int v14, v11, v19

    mul-int/lit16 v14, v14, 0x115b

    const v22, 0x31ba4a12

    xor-int v14, v14, v22

    const v22, -0x14cbddb0

    :goto_e
    xor-int v22, v11, v22

    move v11, v1

    :goto_f
    move v1, v14

    move v14, v13

    move-object v13, v10

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x75eb1340 -> :sswitch_3
        -0x7364137f -> :sswitch_18
        -0x6662bd68 -> :sswitch_11
        -0x664a12e2 -> :sswitch_b
        -0x64fa19cb -> :sswitch_7
        -0x5fb00d65 -> :sswitch_18
        -0x55905280 -> :sswitch_d
        -0x516e676b -> :sswitch_a
        -0x470ec06c -> :sswitch_8
        -0x43bf0fca -> :sswitch_b
        -0x3ed9bde5 -> :sswitch_1a
        -0x39b3579f -> :sswitch_e
        -0x31b5b57f -> :sswitch_15
        -0x2a779d87 -> :sswitch_14
        -0x23013764 -> :sswitch_19
        -0x1d240ed5 -> :sswitch_c
        -0x1ac1db02 -> :sswitch_f
        -0x14fcc329 -> :sswitch_0
        -0xb5b54d0 -> :sswitch_1c
        -0x962dcfa -> :sswitch_5
        -0x89460df -> :sswitch_1b
        -0x873c1fc -> :sswitch_4
        -0x65f7c54 -> :sswitch_8
        -0x3974d11 -> :sswitch_1c
        -0x649cd1 -> :sswitch_17
        0x3dfede -> :sswitch_7
        0x15dcc10 -> :sswitch_9
        0x1af94e1 -> :sswitch_2
        0x696e4e1 -> :sswitch_1b
        0x6c45db1 -> :sswitch_c
        0xbc8b687 -> :sswitch_3
        0xc1e10d3 -> :sswitch_11
        0x12ecc849 -> :sswitch_1a
        0x1a65cc6d -> :sswitch_13
        0x1ac684a5 -> :sswitch_e
        0x1c94363e -> :sswitch_4
        0x1fc0854e -> :sswitch_14
        0x24e19425 -> :sswitch_10
        0x33789a85 -> :sswitch_16
        0x35c23592 -> :sswitch_f
        0x38275a9a -> :sswitch_0
        0x39620198 -> :sswitch_d
        0x459b20e9 -> :sswitch_12
        0x4919fe43 -> :sswitch_6
        0x4cfdf913 -> :sswitch_9
        0x51b86458 -> :sswitch_19
        0x540440c2 -> :sswitch_13
        0x542188b4 -> :sswitch_6
        0x5a3f473d -> :sswitch_2
        0x5c37f0bf -> :sswitch_10
        0x5db589a1 -> :sswitch_5
        0x5ff34b93 -> :sswitch_1
        0x680d2829 -> :sswitch_17
        0x6cb77a6a -> :sswitch_15
        0x6f3c8d09 -> :sswitch_16
        0x6f85b7fa -> :sswitch_a
        0x798a69e1 -> :sswitch_1
        0x7e9a648b -> :sswitch_12
    .end sparse-switch
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 42

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

    const v30, 0x4a1b1b93    # 2541284.8f

    sget v31, Ll/ۗ۬;->ۘܳ᩻:I

    sget v32, Ll/֨ۤ;->ܿۖ᩵:I

    const-string v33, "\u06e2\u1a7a"

    invoke-static/range {v33 .. v33}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v33

    xor-int v33, v33, v31

    mul-int/lit8 v33, v33, -0x33

    xor-int v1, v33, v32

    mul-int/lit16 v1, v1, 0x5e87

    const v34, 0x2b108a5f

    xor-int v1, v1, v34

    const v34, 0x74e10962

    xor-int v33, v33, v34

    move-object/from16 v23, v4

    move-object v9, v8

    move-object v15, v14

    move-object/from16 v36, v19

    move-object/from16 v39, v22

    move-object/from16 v20, v24

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v25, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v40, 0x0

    move-object/from16 v22, v3

    move-object/from16 v24, v5

    move-object v8, v7

    move-object v14, v13

    move-object/from16 v3, v26

    move-object/from16 v5, v28

    const/4 v13, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    :goto_0
    xor-int v11, v30, v32

    mul-int/lit16 v11, v11, -0x3907

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v1, v11

    xor-int v30, v33, v1

    sparse-switch v30, :sswitch_data_0

    .line 48
    iget-object v1, v0, Ll/۫ۡ᩷;->ᩳۧ:Ll/ܺۖᩳ;

    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    .line 50
    new-instance v1, Landroid/content/Intent;

    const-class v2, Ll/۬ۡ᩷;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v2, 0x0

    .line 51
    invoke-virtual {v0, v1, v0, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    return-void

    .line 1
    :sswitch_0
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v1

    if-ltz v1, :cond_3

    :cond_0
    move-object v1, v3

    move-object/from16 v11, v24

    move-object/from16 v3, v39

    move-object/from16 v41, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v41

    goto/16 :goto_6

    .line 20
    :sswitch_1
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    sget-boolean v1, Ll/֫ۡ;->۠ۤۜ:Z

    if-nez v1, :cond_0

    :goto_1
    move-object/from16 v1, v18

    move-object/from16 v11, v24

    move-object/from16 v28, v36

    move/from16 v26, v38

    move-object/from16 v24, v3

    move/from16 v3, v37

    move-object/from16 v41, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v41

    goto/16 :goto_4

    :sswitch_2
    sget v1, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v1, :cond_5

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    goto :goto_1

    .line 47
    :sswitch_4
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    return-void

    .line 44
    :sswitch_5
    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    const v11, 0x7ec0751f

    xor-int/2addr v1, v11

    .line 46
    invoke-static {v0, v1}, Ll/ۘ᩻;->ۗ᩹ܶ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ܺۖᩳ;

    iput-object v1, v0, Ll/۫ۡ᩷;->ᩳۧ:Ll/ܺۖᩳ;

    .line 47
    invoke-virtual {v1, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    const-string v1, "\u06e8\u06dc"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v31

    xor-int v11, v1, v32

    mul-int/lit16 v11, v11, 0x429b

    const v26, 0x3d47cf3d

    xor-int v11, v11, v26

    const v26, 0x30c562c7

    goto/16 :goto_3

    .line 44
    :sswitch_6
    invoke-static {v0, v10}, Ll/֨۟;->ܺ᩶۫(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v0}, Ll/֫᩺;->ܰۖܳ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    const/16 v11, 0x26

    const/4 v15, 0x3

    invoke-static {v1, v11, v15, v2}, Ll/ۗۗ;->ۧܺۧ([SIII)Ljava/lang/String;

    move-result-object v15

    .line 6
    sget v1, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v1, "\u1a74\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v32

    xor-int v11, v1, v31

    mul-int/lit16 v11, v11, 0x27bd

    const v26, 0x6eaafcd8

    xor-int v11, v11, v26

    const v26, -0xaca489a

    goto/16 :goto_3

    .line 43
    :sswitch_7
    invoke-static {v9, v0}, Ll/֫᩺;->ܰۖܳ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    const/16 v10, 0x23

    const/4 v11, 0x3

    invoke-static {v1, v10, v11, v2}, Ll/ۗ۬;->᩹ۨ᩹([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    const v10, 0x7ea4fc45

    xor-int/2addr v10, v1

    const-string v1, "\u06ec\u1a7b"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v31

    mul-int/lit8 v1, v1, 0x35

    xor-int v11, v1, v32

    mul-int/lit16 v11, v11, 0x61a9

    const v26, -0x7df1bc4a

    xor-int v11, v11, v26

    const v26, 0x44126d0

    goto/16 :goto_3

    :sswitch_8
    const/4 v1, 0x3

    .line 42
    invoke-static {v5, v6, v1, v2}, Ll/֫ۧ;->᩷ᩳ᩺([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    const v9, 0x7d21470f

    xor-int/2addr v1, v9

    .line 43
    invoke-static {v0, v1}, Ll/֨۟;->ܺ᩶۫(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v9

    .line 20
    sget v1, Ll/֡֡;->֫ۤܳ:I

    if-ltz v1, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v1, "\u06ec\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v32

    xor-int v11, v1, v31

    mul-int/lit16 v11, v11, -0x5ec9

    const v26, 0x12fe3f2d

    xor-int v11, v11, v26

    const v26, 0x12824405

    goto/16 :goto_3

    .line 41
    :sswitch_9
    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    const v5, 0x7e4507ed

    xor-int/2addr v1, v5

    .line 42
    invoke-static {v0, v1}, Ll/ۘ᩻;->ۗ᩹ܶ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v0}, Ll/ۘ᩶;->ۜ᩺᩷(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v5, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    const/16 v6, 0x20

    const-string v1, "\u06e0\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v31

    xor-int v11, v1, v32

    mul-int/lit16 v11, v11, -0x7905

    const v26, 0x4ad9a797    # 7132107.5f

    xor-int v11, v11, v26

    const v26, -0x1f9b1d02

    goto/16 :goto_3

    :sswitch_a
    const v1, 0x102001b

    .line 41
    invoke-static {v0, v1}, Ll/֨۟;->ܺ᩶۫(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v0}, Ll/ۘ᩶;->ۜ᩺᩷(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    const/16 v11, 0x1d

    const/4 v14, 0x3

    invoke-static {v1, v11, v14, v2}, Ll/֨ᩴ;->۠᩹ܺ([SIII)Ljava/lang/String;

    move-result-object v14

    sget-boolean v1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v1, :cond_4

    :cond_3
    const-string v1, "\u1a7a\u06e2"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v32

    xor-int v11, v1, v31

    mul-int/lit16 v11, v11, 0x21df

    const v26, 0x48c36e01

    xor-int v11, v11, v26

    const v26, 0x122ee66d

    goto/16 :goto_3

    :cond_4
    const-string v1, "\u05a8\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v32

    mul-int/lit8 v1, v1, -0x1f

    xor-int v11, v1, v31

    mul-int/lit16 v11, v11, 0x263f

    const v26, 0x49346099

    xor-int v11, v11, v26

    const v26, -0x2be97e94

    goto/16 :goto_3

    :sswitch_b
    const v1, 0x102001a

    .line 40
    invoke-static {v0, v1}, Ll/ۘ᩻;->ۗ᩹ܶ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v0}, Ll/֫᩺;->ܰۖܳ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    sget v1, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v1, :cond_6

    :cond_5
    const-string v1, "\u05a1\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v32

    xor-int v11, v1, v31

    mul-int/lit16 v11, v11, -0x549

    const v26, 0x2aa725be

    xor-int v11, v11, v26

    const v26, -0x3b06d8db

    goto/16 :goto_3

    :cond_6
    const-string v1, "\u1a7b\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v31

    mul-int/lit8 v1, v1, 0x39

    xor-int v11, v1, v32

    mul-int/lit16 v11, v11, -0x591d

    const v26, -0x6b7aef4e

    xor-int v11, v11, v26

    const v26, 0xdd42da2

    goto/16 :goto_3

    :sswitch_c
    const v1, 0x7ec2af52

    xor-int/2addr v1, v13

    .line 38
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v11

    invoke-static {v8, v1, v11}, Ll/᩹᩺ۧ;->֫(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Ll/᩹᩺ۧ;

    move-result-object v1

    invoke-virtual {v7, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const-string v1, "\u1a77\u1a7a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v32

    xor-int v11, v1, v31

    mul-int/lit16 v11, v11, -0x638d

    const v26, 0x79148557

    xor-int v11, v11, v26

    const v26, 0x1dc1ee66

    goto/16 :goto_3

    :sswitch_d
    invoke-virtual/range {p0 .. p0}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    sget-object v1, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    const/16 v11, 0x1a

    const/4 v13, 0x3

    invoke-static {v1, v11, v13, v2}, Ll/۠;->ۢۤ۠([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    .line 18
    sget v1, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v1, :cond_7

    :goto_2
    const-string v1, "\u06ec\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v31, v1

    mul-int/lit8 v1, v1, 0x4f

    xor-int v11, v1, v32

    mul-int/lit16 v11, v11, 0x42a3

    const v26, -0x7017b0c2

    xor-int v11, v11, v26

    const v26, 0x1d2ffa82

    goto/16 :goto_3

    :cond_7
    const-string v1, "\u06e7\u06df"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v32

    mul-int/lit8 v1, v1, 0x79

    xor-int v11, v1, v31

    mul-int/lit16 v11, v11, 0x4d47

    const v26, -0x2f2e7ff

    xor-int v11, v11, v26

    const v26, 0x54cd03a0

    goto/16 :goto_3

    :sswitch_e
    const/4 v1, 0x3

    .line 35
    invoke-static {v3, v4, v1, v2}, Ll/֫֫;->ܿ᩶ۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    const v7, 0x7ee9a3be

    xor-int/2addr v1, v7

    .line 37
    invoke-static {v0, v1}, Ll/֨۟;->ܺ᩶۫(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Landroid/widget/ImageView;

    const-string v1, "\u06e8\u1a7a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v31

    xor-int v11, v1, v32

    mul-int/lit16 v11, v11, -0x1411

    const v26, 0x7288d720

    xor-int v11, v11, v26

    const v26, 0x708b2d95

    goto/16 :goto_3

    :sswitch_f
    xor-int v1, v25, v12

    .line 35
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    move-object/from16 v11, v24

    invoke-static {v11, v1, v3}, Ll/᩹᩺ۧ;->֫(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Ll/᩹᩺ۧ;

    move-result-object v1

    move-object/from16 v3, v23

    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    sget-object v1, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    .line 50
    sget-boolean v23, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v23, :cond_8

    move-object/from16 v23, v3

    move/from16 v4, v21

    move-object/from16 v3, v39

    move-object/from16 v21, v20

    const/16 v20, 0x17

    goto/16 :goto_6

    :cond_8
    const-string v23, "\u06eb\u1a73"

    invoke-static/range {v23 .. v23}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v32

    xor-int v4, v23, v31

    mul-int/lit16 v4, v4, -0x465d

    const v26, 0x1a7efc71

    xor-int v4, v4, v26

    const v26, 0x3471c581

    xor-int v33, v23, v26

    move-object/from16 v23, v3

    move-object/from16 v24, v11

    move-object v3, v1

    move v1, v4

    const/16 v4, 0x17

    goto/16 :goto_0

    .line 34
    :sswitch_10
    move-object/from16 v23, v22

    check-cast v23, Landroid/widget/ImageView;

    .line 35
    invoke-virtual/range {p0 .. p0}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object v24

    sget-object v1, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    const/16 v11, 0x14

    const/4 v12, 0x3

    invoke-static {v1, v11, v12, v2}, Ll/֡ܶ;->ܽ᩻᩵([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v25

    const v12, 0x7e9316b8

    const-string v1, "\u1a7b\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v31, v1

    mul-int/lit8 v1, v1, -0x1d

    xor-int v11, v1, v32

    mul-int/lit16 v11, v11, 0x7cb1

    const v26, -0x6218c02f

    xor-int v11, v11, v26

    const v26, 0x6973b299

    :goto_3
    xor-int v33, v1, v26

    move v1, v11

    goto/16 :goto_0

    :sswitch_11
    move-object/from16 v11, v24

    const/4 v1, 0x3

    move-object/from16 v24, v3

    move-object/from16 v3, v20

    move/from16 v20, v4

    move/from16 v4, v21

    .line 33
    invoke-static {v3, v4, v1, v2}, Ll/ۗۗ;->ۧܺۧ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    const v21, 0x7d3921ae

    xor-int v1, v1, v21

    .line 34
    invoke-static {v0, v1}, Ll/ۘ᩻;->ۗ᩹ܶ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v22

    .line 27
    sget-boolean v1, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v1, :cond_9

    move-object/from16 v21, v3

    move-object/from16 v1, v18

    move-object/from16 v28, v36

    move/from16 v3, v37

    move/from16 v26, v38

    goto/16 :goto_4

    :cond_9
    const-string v1, "\u0733\u073d"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v32

    move-object/from16 v21, v3

    xor-int v3, v1, v31

    mul-int/lit16 v3, v3, -0x5fe3

    const v26, -0x49349167

    xor-int v3, v3, v26

    const v26, 0x7b2ddaef

    xor-int v33, v1, v26

    move v1, v3

    goto/16 :goto_8

    :sswitch_12
    move/from16 v20, v4

    move/from16 v1, v19

    move-object/from16 v11, v24

    move-object/from16 v24, v3

    .line 33
    invoke-static {v0, v1}, Ll/ۘ᩻;->ۗ᩹ܶ(Ljava/lang/Object;I)Landroid/view/View;

    sget-object v3, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    const/16 v21, 0x11

    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v4

    if-gtz v4, :cond_a

    move/from16 v19, v1

    move-object/from16 v21, v3

    move-object/from16 v1, v18

    move-object/from16 v28, v36

    move/from16 v3, v37

    move/from16 v26, v38

    const/16 v4, 0x11

    goto/16 :goto_4

    :cond_a
    const-string v4, "\u1a78\u073f"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v31

    mul-int/lit8 v4, v4, 0x33

    xor-int v0, v4, v32

    mul-int/lit16 v0, v0, 0x6e31

    const v19, 0x6c3a23a3

    xor-int v0, v0, v19

    const v19, 0x625a0615

    xor-int v33, v4, v19

    move/from16 v19, v1

    move/from16 v4, v20

    move v1, v0

    move-object/from16 v20, v3

    move-object/from16 v3, v24

    move-object/from16 v0, p0

    move-object/from16 v24, v11

    goto/16 :goto_0

    :sswitch_13
    move-object/from16 v11, v24

    move-object/from16 v24, v3

    move-object/from16 v41, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v41

    const/4 v0, 0x3

    move-object/from16 v3, v39

    move/from16 v1, v40

    .line 32
    invoke-static {v3, v1, v0, v2}, Ll/֨ᩴ;->۠᩹ܺ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    const v19, 0x7e61a6e0

    xor-int v19, v0, v19

    const-string v0, "\u06d6\u06d6"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    move/from16 v26, v1

    xor-int v1, v0, v31

    mul-int/lit16 v1, v1, 0x7ba7

    const v27, 0x1b3723e1

    xor-int v1, v1, v27

    const v27, -0x16debf67

    xor-int v33, v0, v27

    move-object/from16 v0, p0

    move-object/from16 v39, v3

    move-object/from16 v3, v24

    move/from16 v40, v26

    goto/16 :goto_f

    :sswitch_14
    move-object/from16 v11, v24

    move-object/from16 v0, v36

    move/from16 v1, v38

    move-object/from16 v24, v3

    move/from16 v3, v37

    move-object/from16 v41, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v41

    invoke-static {v0, v3, v1, v2}, Ll/֫᩵;->᩻ۚܺ([SIII)Ljava/lang/String;

    move-result-object v26

    invoke-static/range {v26 .. v26}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v26

    const v27, 0x7e482797

    move-object/from16 v28, v0

    xor-int v0, v26, v27

    move/from16 v26, v1

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Landroid/view/Window;->setWindowAnimations(I)V

    sget-object v39, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    const/16 v40, 0xe

    sget-boolean v0, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v0, :cond_b

    :goto_4
    const-string v0, "\u1a77\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v31

    mul-int/lit8 v0, v0, 0x55

    move-object/from16 v18, v1

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0x60ad

    const v27, 0x609b6de3

    xor-int v1, v1, v27

    const v27, -0x29cbfb7d

    goto :goto_5

    :cond_b
    move-object/from16 v18, v1

    const-string v0, "\u06e2\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v31

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, -0x1157

    const v27, 0x7ed58ad3

    xor-int v1, v1, v27

    const v27, 0x681f14e5

    :goto_5
    xor-int v33, v0, v27

    move-object/from16 v0, p0

    move/from16 v37, v3

    goto/16 :goto_b

    :sswitch_15
    move-object/from16 v11, v24

    move-object/from16 v24, v3

    move-object/from16 v3, v39

    move-object/from16 v41, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v41

    sget-object v36, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    const/16 v37, 0xb

    const/16 v38, 0x3

    .line 43
    sget v0, Ll/۟;->ۗۤۛ:I

    if-eqz v0, :cond_c

    move-object/from16 v1, v24

    :goto_6
    const-string v0, "\u073d\u1a7a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v31, v0

    mul-int/lit8 v0, v0, 0x5d

    move-object/from16 v24, v1

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, -0x5c0b

    const v26, -0x3fb4a9a7

    xor-int v1, v1, v26

    const v26, -0x6f87abb4

    goto :goto_7

    :cond_c
    const-string v0, "\u06e0\u06d6"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v31

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0x7b41

    const v26, -0x33641ea

    xor-int v1, v1, v26

    const v26, -0x74f9189

    :goto_7
    xor-int v33, v0, v26

    move-object/from16 v0, p0

    move-object/from16 v39, v3

    :goto_8
    move-object/from16 v3, v24

    goto/16 :goto_f

    :sswitch_16
    move-object/from16 v11, v24

    move-object/from16 v28, v36

    move/from16 v26, v38

    move-object/from16 v24, v3

    move-object/from16 v3, v39

    move-object/from16 v41, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v41

    .line 30
    invoke-super/range {p0 .. p1}, Ll/ۗܺ᩷;->onCreate(Landroid/os/Bundle;)V

    .line 31
    invoke-static/range {p0 .. p0}, Ll/۟;->ܶ᩸۬(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v0

    const v1, 0x106000d

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 32
    invoke-static/range {p0 .. p0}, Ll/۟;->ܶ᩸۬(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v18

    const-string v0, "\u06d9\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    mul-int/lit8 v0, v0, 0x3f

    xor-int v1, v0, v31

    mul-int/lit16 v1, v1, 0xd2f

    const v27, -0x5739893a

    xor-int v1, v1, v27

    const v27, 0x7dcc2d6e

    goto :goto_a

    :sswitch_17
    move-object/from16 v11, v24

    move-object/from16 v28, v36

    move/from16 v26, v38

    move-object/from16 v24, v3

    move-object/from16 v3, v39

    move-object/from16 v41, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v41

    const/16 v0, 0x7489

    const/16 v2, 0x7489

    goto :goto_9

    :sswitch_18
    move-object/from16 v11, v24

    move-object/from16 v28, v36

    move/from16 v26, v38

    move-object/from16 v24, v3

    move-object/from16 v3, v39

    move-object/from16 v41, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v41

    const v0, 0xa647

    const v2, 0xa647

    :goto_9
    const-string v0, "\u1a74\u05ab"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v32

    mul-int/lit8 v0, v0, -0x27

    xor-int v1, v0, v31

    mul-int/lit16 v1, v1, -0x14fb

    const v27, -0x5adf87c5

    xor-int v1, v1, v27

    const v27, -0x2bbb77e4

    :goto_a
    xor-int v33, v0, v27

    move-object/from16 v0, p0

    move-object/from16 v39, v3

    :goto_b
    move-object/from16 v3, v24

    move/from16 v38, v26

    goto/16 :goto_e

    :sswitch_19
    move-object/from16 v11, v24

    move-object/from16 v28, v36

    move/from16 v26, v38

    move-object/from16 v24, v3

    move-object/from16 v3, v39

    move-object/from16 v41, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v41

    add-int v0, v16, v17

    move/from16 v27, v2

    move/from16 v1, v35

    mul-int/lit16 v2, v1, 0x722c

    sub-int/2addr v2, v0

    if-gtz v2, :cond_d

    const-string v0, "\u05ab\u0733"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v32

    xor-int v2, v0, v31

    mul-int/lit16 v2, v2, -0x57d1

    const v29, -0x35a864be    # -3532496.5f

    xor-int v2, v2, v29

    const v29, 0x78d61998

    :goto_c
    xor-int v33, v0, v29

    move-object/from16 v0, p0

    move/from16 v35, v1

    move v1, v2

    goto :goto_d

    :cond_d
    const-string v0, "\u06df\u06d7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v31

    mul-int/lit8 v0, v0, -0x1d

    xor-int v2, v0, v32

    mul-int/lit16 v2, v2, -0x10cb

    const v29, 0x239da186

    xor-int v2, v2, v29

    const v29, -0x3c3aac3f

    goto :goto_c

    :sswitch_1a
    move/from16 v27, v2

    move-object/from16 v11, v24

    move-object/from16 v28, v36

    move/from16 v26, v38

    move-object/from16 v24, v3

    move-object/from16 v3, v39

    move-object/from16 v41, v20

    move/from16 v20, v4

    move/from16 v4, v21

    move-object/from16 v21, v41

    sget-object v0, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    const/16 v1, 0xa

    aget-short v35, v0, v1

    mul-int v16, v35, v35

    const v17, 0xcbacde4

    const-string v0, "\u06df\u06d6"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v31, v0

    mul-int/lit8 v0, v0, 0x61

    xor-int v1, v0, v32

    mul-int/lit16 v1, v1, 0x4a95

    const v2, -0x3922d031

    xor-int/2addr v1, v2

    const v2, 0x56771541

    xor-int v33, v0, v2

    move-object/from16 v0, p0

    :goto_d
    move-object/from16 v39, v3

    move-object/from16 v3, v24

    move/from16 v38, v26

    move/from16 v2, v27

    :goto_e
    move-object/from16 v36, v28

    :goto_f
    move-object/from16 v24, v11

    move-object/from16 v41, v21

    move/from16 v21, v4

    move/from16 v4, v20

    move-object/from16 v20, v41

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b434c1e -> :sswitch_5
        -0x78a79fd4 -> :sswitch_7
        -0x75100ce7 -> :sswitch_c
        -0x6f455a14 -> :sswitch_b
        -0x66a80aca -> :sswitch_12
        -0x62bbbcdf -> :sswitch_f
        -0x60aa2754 -> :sswitch_1
        -0x600562ad -> :sswitch_7
        -0x5f96d226 -> :sswitch_a
        -0x5aa87042 -> :sswitch_4
        -0x598215c4 -> :sswitch_16
        -0x528d61e9 -> :sswitch_15
        -0x48be379e -> :sswitch_1a
        -0x46f6d000 -> :sswitch_e
        -0x43ef1232 -> :sswitch_15
        -0x43c42238 -> :sswitch_11
        -0x41f7e3de -> :sswitch_0
        -0x3de29966 -> :sswitch_8
        -0x37cdb367 -> :sswitch_4
        -0x2a5af9e1 -> :sswitch_11
        -0x25361217 -> :sswitch_14
        -0x2412b8ff -> :sswitch_17
        -0xa5155e7 -> :sswitch_18
        -0x9aac614 -> :sswitch_10
        -0x72fba11 -> :sswitch_c
        -0x4e4c781 -> :sswitch_6
        -0x1f84685 -> :sswitch_a
        0xa74c697 -> :sswitch_9
        0xd3ba248 -> :sswitch_14
        0xe2789e7 -> :sswitch_0
        0x15c1af33 -> :sswitch_2
        0x15c5809a -> :sswitch_1
        0x1f29af72 -> :sswitch_d
        0x27713483 -> :sswitch_6
        0x2784863d -> :sswitch_b
        0x2ef04307 -> :sswitch_19
        0x3dd0d464 -> :sswitch_2
        0x47bb069c -> :sswitch_18
        0x4981eabb -> :sswitch_3
        0x4a66a359 -> :sswitch_13
        0x4f24a96f -> :sswitch_16
        0x521c3123 -> :sswitch_9
        0x52f2856f -> :sswitch_d
        0x55216e92 -> :sswitch_1a
        0x55a1d02a -> :sswitch_e
        0x563d94b2 -> :sswitch_8
        0x59d027b0 -> :sswitch_19
        0x5d3f3d17 -> :sswitch_13
        0x6017887a -> :sswitch_17
        0x64599f30 -> :sswitch_12
        0x6c744c6a -> :sswitch_10
        0x71ed7800 -> :sswitch_f
        0x73b8a1df -> :sswitch_3
        0x784e8933 -> :sswitch_5
    .end sparse-switch
.end method

.method public final onDestroy()V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x19d5307a

    sget v2, Ll/ۗ᩺;->ۡ᩺֡:I

    sget v3, Ll/ۘۘ;->᩷ۙ᩸:I

    const-string v4, "\u06e2\u06d8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x3f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7127

    const v6, -0x26363aee

    xor-int/2addr v5, v6

    const v6, 0x7126e73d

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x571d

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    sget v4, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v4, :cond_6

    goto/16 :goto_2

    .line 41
    :sswitch_0
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    sget v4, Ll/᩺;->ۙۛܶ:I

    if-lez v4, :cond_1

    goto/16 :goto_3

    .line 11
    :sswitch_1
    sget v4, Ll/᩺;->ۙۛܶ:I

    if-gtz v4, :cond_b

    goto/16 :goto_3

    .line 44
    :sswitch_2
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    sget v4, Ll/֨۟;->᩹֫᩷:I

    if-nez v4, :cond_9

    goto :goto_1

    .line 35
    :sswitch_3
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    :goto_1
    const-string v4, "\u1a78\u073a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x53

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xfd9

    const v6, 0x4ab61602    # 5966593.0f

    xor-int/2addr v5, v6

    const v6, 0x2a53c828    # 1.8810008E-13f

    goto :goto_0

    .line 22
    :sswitch_4
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    return-void

    .line 77
    :sswitch_5
    invoke-static {v0}, Ll/ۗۗ;->ۢۢۢ(Ljava/lang/Object;)Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Ll/֡֡;->᩻ۗۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/۬ۡ᩷;->۫:Ljava/lang/String;

    return-void

    :sswitch_6
    iget-object v0, p0, Ll/۫ۡ᩷;->ᩳۧ:Ll/ܺۖᩳ;

    sget v4, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u06d9\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x11

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7d41

    const v6, -0x41c1b28f

    xor-int/2addr v5, v6

    const v6, 0x5eb97e3

    goto :goto_0

    .line 76
    :sswitch_7
    invoke-virtual {p0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v4

    if-ltz v4, :cond_2

    :cond_1
    const-string v4, "\u1a7b\u073f"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x67

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5eb3

    const v6, 0x6f608eff

    xor-int/2addr v5, v6

    const v6, -0x7deb0d89

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u06e1\u06d7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0xd

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1955

    const v6, 0x3d7fed27

    xor-int/2addr v5, v6

    const v6, 0x2289281d

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u06e2\u1a7b"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x43

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1f43

    const v6, -0x3e9d582

    xor-int/2addr v5, v6

    const v6, -0x795ad504

    goto/16 :goto_0

    .line 8
    :sswitch_9
    sget v4, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u06eb\u1a7b"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x6b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x384d

    const v6, -0x997aaa

    xor-int/2addr v5, v6

    const v6, 0x41a8010e    # 21.000515f

    goto/16 :goto_0

    .line 1
    :sswitch_a
    sget v4, Ll/ۛ;->᩺᩻֫:I

    if-ltz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u06dc\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x1b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1921

    const v6, -0x3b5422d5

    xor-int/2addr v5, v6

    const v6, 0x65625948

    goto/16 :goto_0

    :goto_2
    const-string v4, "\u1a78\u1a73"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3bbf

    const v6, 0x792cb60a

    xor-int/2addr v5, v6

    const v6, -0x48a46c41

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06d7\u05a8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x7f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x14c9

    const v6, -0xeebc8fe

    xor-int/2addr v5, v6

    const v6, -0x2d3727f2

    goto/16 :goto_0

    .line 51
    :sswitch_b
    sget v4, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v4, :cond_7

    goto :goto_3

    :cond_7
    const-string v4, "\u06d7\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7a15

    const v6, 0x56c6813d

    xor-int/2addr v5, v6

    const v6, -0x1a033209

    goto/16 :goto_0

    .line 19
    :sswitch_c
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_3

    :cond_8
    const-string v4, "\u1a73\u1a73"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x7b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6c4f

    const v6, 0x55409ce2

    xor-int/2addr v5, v6

    const v6, -0x25ca3f72

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v4, :cond_a

    :cond_9
    :goto_3
    const-string v4, "\u1a75\u06e4"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x7

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7f3d

    const v6, -0x1b87aae0

    xor-int/2addr v5, v6

    const v6, 0x2ee88036

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u06e1\u05a8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x13

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4093

    const v6, -0x140f776e

    xor-int/2addr v5, v6

    const v6, 0x1382467f

    goto/16 :goto_0

    .line 75
    :sswitch_e
    invoke-super {p0}, Ll/ۗܺ᩷;->onDestroy()V

    .line 39
    sget v4, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06df\u06e1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5e43

    const v6, 0x3899f412

    xor-int/2addr v5, v6

    const v6, 0x16a38225

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06da\u06d9"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xcd5

    const v6, -0x2b5c1e67

    xor-int/2addr v5, v6

    const v6, 0x3b681349

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x74ee8b92 -> :sswitch_2
        -0x5ed7ad1c -> :sswitch_e
        -0x5e69bbcf -> :sswitch_b
        -0x539793f1 -> :sswitch_0
        -0x50a7ea6b -> :sswitch_9
        -0x3913509a -> :sswitch_5
        -0x38e5aa73 -> :sswitch_2
        -0x3876cf2f -> :sswitch_a
        -0x3581630f -> :sswitch_c
        -0x3314d3d3 -> :sswitch_0
        -0x26060075 -> :sswitch_a
        -0x23a3e0ec -> :sswitch_3
        -0x1cbade58 -> :sswitch_1
        -0x17246291 -> :sswitch_4
        -0x16eb29d0 -> :sswitch_8
        -0x152e3bc4 -> :sswitch_d
        -0x144546e9 -> :sswitch_c
        -0x128acc2f -> :sswitch_e
        0x13b0f65c -> :sswitch_7
        0x15d7550b -> :sswitch_6
        0x243a362d -> :sswitch_d
        0x25396666 -> :sswitch_5
        0x2a5893cc -> :sswitch_4
        0x36c9dac9 -> :sswitch_9
        0x4349a9ef -> :sswitch_8
        0x47375b86 -> :sswitch_1
        0x5b214748 -> :sswitch_b
        0x79edd1c0 -> :sswitch_7
        0x7b061b3d -> :sswitch_6
        0x7e88cfd8 -> :sswitch_3
    .end sparse-switch
.end method

.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 6

    const/4 p1, 0x0

    const v0, -0x3a4a4779

    sget v1, Ll/ۗ᩷;->᩸᩺ᩳ:I

    sget v2, Ll/ۘۨ;->۫᩸۠:I

    const-string v3, "\u1a73\u06e4"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5539

    const v5, 0x7c91e896

    xor-int/2addr v4, v5

    const v5, 0x3b8c3bb1

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x5d01

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 69
    sget v3, Ll/֡֡;->֫ۤܳ:I

    if-ltz v3, :cond_8

    goto/16 :goto_3

    .line 90
    :sswitch_0
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v3

    if-lez v3, :cond_d

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    if-gez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v3, "\u073f\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3a5

    const v5, 0x64b1934f

    xor-int/2addr v4, v5

    const v5, -0x1c5b08c9

    goto :goto_0

    .line 88
    :sswitch_2
    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v3, :cond_b

    goto/16 :goto_3

    .line 56
    :sswitch_3
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    goto/16 :goto_3

    .line 1
    :sswitch_4
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    const/4 p1, 0x0

    return p1

    :sswitch_5
    const/4 v3, 0x0

    .line 113
    invoke-virtual {p1, v3}, Ll/ۡۖᩳ;->onClick(Landroid/view/View;)V

    goto :goto_2

    .line 112
    :sswitch_6
    iget-object p1, p0, Ll/۫ۡ᩷;->ܳۧ:Ll/ۡۖᩳ;

    if-eqz p1, :cond_1

    const-string v3, "\u05a1\u1a73"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6aaf

    const v5, 0x50667ea8

    xor-int/2addr v4, v5

    const v5, -0x6543055c

    goto :goto_0

    :sswitch_7
    const/16 v3, 0x42

    if-ne p2, v3, :cond_1

    const-string v3, "\u0736\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7e4d

    const v5, -0x14ff1a2e

    xor-int/2addr v4, v5

    const v5, 0x6a69f278

    goto/16 :goto_0

    :sswitch_8
    const/4 p1, 0x0

    return p1

    .line 108
    :sswitch_9
    invoke-static {p0}, Ll/֨۫;->֫ۗۗ(Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    .line 110
    :sswitch_a
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "\u1a74\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x89b

    const v5, -0x330eab10    # -1.2652736E8f

    xor-int/2addr v4, v5

    const v5, 0x62734a85

    goto/16 :goto_0

    :cond_1
    :goto_2
    const-string v3, "\u06e0\u05a8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x12ed

    const v5, 0x61472e4b

    xor-int/2addr v4, v5

    const v5, 0x1a1f1e99

    goto/16 :goto_0

    :sswitch_b
    const/4 v3, 0x4

    if-ne p2, v3, :cond_2

    const-string v3, "\u06d6\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2b4d

    const v5, -0x5650f7e7

    xor-int/2addr v4, v5

    const v5, 0x1230431d

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u06e7\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4f9d

    const v5, -0x1da2d8ac

    xor-int/2addr v4, v5

    const v5, -0x20ccf57d

    goto/16 :goto_0

    .line 44
    :sswitch_c
    sget v3, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u06eb\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1907

    const v5, 0x97d05c6

    xor-int/2addr v4, v5

    const v5, -0x25bda66d

    goto/16 :goto_0

    .line 17
    :sswitch_d
    sget v3, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v3, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v3, "\u1a77\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5c79

    const v5, 0x6a43aa80

    xor-int/2addr v4, v5

    const v5, -0x503a983a

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v3, :cond_5

    goto :goto_3

    :cond_5
    const-string v3, "\u073d\u1a7a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x4f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6bd3

    const v5, -0x758a3c34

    xor-int/2addr v4, v5

    const v5, 0x3a286cf2

    goto/16 :goto_0

    .line 49
    :sswitch_f
    sget v3, Ll/֡֡;->֫ۤܳ:I

    if-ltz v3, :cond_6

    goto :goto_4

    :cond_6
    const-string v3, "\u0736\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4b87

    const v5, 0x5c593a4

    xor-int/2addr v4, v5

    const v5, 0x4952fbb2    # 864187.1f

    goto/16 :goto_0

    .line 6
    :sswitch_10
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v3

    if-ltz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u1a74\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x7b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4d6b

    const v5, -0x2b45b872

    xor-int/2addr v4, v5

    const v5, -0x6bfbb33b

    goto/16 :goto_0

    :goto_3
    const-string v3, "\u06ec\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x76d5

    const v5, -0x748646fa

    xor-int/2addr v4, v5

    const v5, 0x332e6d42

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e0\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x71

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xa69

    const v5, 0x55c0e0d2

    xor-int/2addr v4, v5

    const v5, 0x38a093e9

    goto/16 :goto_0

    .line 84
    :sswitch_11
    sget v3, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v3, :cond_9

    :goto_4
    const-string v3, "\u06d7\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2d7b

    const v5, 0x45c63f69

    xor-int/2addr v4, v5

    const v5, 0xd63dfd6

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e2\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x35

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2611

    const v5, 0x720c0146

    xor-int/2addr v4, v5

    const v5, 0x3279d4df

    goto/16 :goto_0

    .line 24
    :sswitch_12
    sget v3, Ll/֨۟;->᩹֫᩷:I

    if-eqz v3, :cond_a

    goto :goto_5

    :cond_a
    const-string v3, "\u06d8\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x143

    const v5, -0x579def66

    xor-int/2addr v4, v5

    const v5, 0x269404fe

    goto/16 :goto_0

    .line 95
    :sswitch_13
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v3

    if-eqz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u1a7a\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x76b1

    const v5, 0x132f4135

    xor-int/2addr v4, v5

    const v5, -0xef2fc0d

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u05ab\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5fbd

    const v5, -0x6eb644d6

    xor-int/2addr v4, v5

    const v5, 0x614a02d

    goto/16 :goto_0

    .line 30
    :sswitch_14
    sget-boolean v3, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v3, :cond_e

    :cond_d
    const-string v3, "\u0730\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4a2d

    const v5, -0x530bfe52

    xor-int/2addr v4, v5

    const v5, 0x58f304af

    goto/16 :goto_0

    :cond_e
    const-string v3, "\u06e8\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7ff7

    const v5, -0x228f6f4e

    xor-int/2addr v4, v5

    const v5, 0x5d673671

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b6cddec -> :sswitch_7
        -0x6977ec51 -> :sswitch_6
        -0x6852cc67 -> :sswitch_9
        -0x60927d1e -> :sswitch_f
        -0x5e8c5be3 -> :sswitch_13
        -0x5b31d38a -> :sswitch_f
        -0x57dcea42 -> :sswitch_11
        -0x572811c5 -> :sswitch_b
        -0x555aa205 -> :sswitch_4
        -0x50f99db8 -> :sswitch_7
        -0x4db17cf9 -> :sswitch_8
        -0x4caf6725 -> :sswitch_6
        -0x44c7fdfa -> :sswitch_12
        -0x3c1a798a -> :sswitch_1
        -0x353f14de -> :sswitch_9
        -0x2ebde62f -> :sswitch_10
        -0x2e8eb085 -> :sswitch_3
        -0x2196f1d3 -> :sswitch_c
        -0xe577f25 -> :sswitch_e
        -0xabbc722 -> :sswitch_c
        0x2d39ad6 -> :sswitch_b
        0x3d618b3 -> :sswitch_12
        0x5472a37 -> :sswitch_2
        0x10bc871d -> :sswitch_3
        0x2213e966 -> :sswitch_13
        0x28b8d07b -> :sswitch_e
        0x2c2e3e92 -> :sswitch_0
        0x39d0f04f -> :sswitch_a
        0x3be2a97d -> :sswitch_5
        0x45ff7ff9 -> :sswitch_2
        0x52c451e8 -> :sswitch_4
        0x56632d37 -> :sswitch_d
        0x5a65cccd -> :sswitch_14
        0x5dff2ae5 -> :sswitch_11
        0x654c28e0 -> :sswitch_10
        0x7003ad33 -> :sswitch_1
        0x70eecadb -> :sswitch_0
        0x71fba6c4 -> :sswitch_14
        0x73303266 -> :sswitch_a
        0x7a794d4a -> :sswitch_d
        0x7bf509fc -> :sswitch_8
        0x7c5f1443 -> :sswitch_5
    .end sparse-switch
.end method

.method public final onPause()V
    .locals 23

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

    const v15, -0x6e432cd4

    sget v16, Ll/֡ᩴ;->ܳۤ֫:I

    sget v17, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v18, "\u0730\u1a79"

    invoke-static/range {v18 .. v18}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v16

    mul-int/lit8 v18, v18, -0x61

    xor-int v0, v18, v17

    mul-int/lit16 v0, v0, 0x30bf

    const v20, 0x7a470221

    xor-int v0, v0, v20

    const v20, 0x131c310e

    xor-int v18, v18, v20

    move-object v3, v2

    move-object/from16 v20, v4

    move-object v12, v11

    move-object v15, v14

    move/from16 v19, v18

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v18, -0x6e432cd4

    :goto_0
    xor-int v5, v18, v17

    mul-int/lit16 v5, v5, -0x7aed

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v0, v5

    xor-int v18, v19, v0

    sparse-switch v18, :sswitch_data_0

    move-object/from16 v5, p0

    move/from16 v19, v1

    mul-int v0, v7, v10

    sub-int v0, v9, v0

    if-ltz v0, :cond_8

    const-string v0, "\u1a75\u06e8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x67

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0xbc3

    const v21, 0x2739df6d

    xor-int v1, v1, v21

    const v21, 0x4c094139    # 3.5980516E7f

    goto/16 :goto_7

    .line 16
    :sswitch_0
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    sget v0, Ll/֡֡;->֫ۤܳ:I

    if-ltz v0, :cond_1

    :cond_0
    move-object/from16 v5, p0

    move/from16 v19, v1

    goto/16 :goto_4

    :cond_1
    const-string v0, "\u073f\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x4fb5

    const v19, -0x7044b414

    xor-int v5, v5, v19

    const v19, -0x1fda7f93

    xor-int v19, v0, v19

    move v0, v5

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    sget v0, Ll/֫᩹;->᩶ۘۘ:I

    if-nez v0, :cond_0

    :goto_1
    move-object/from16 v5, p0

    move/from16 v19, v1

    goto/16 :goto_6

    .line 53
    :sswitch_2
    sget v0, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez v0, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move/from16 v19, v1

    goto/16 :goto_5

    :sswitch_3
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    goto :goto_1

    .line 2
    :sswitch_4
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    return-void

    :sswitch_5
    const v0, 0x7d528af6

    xor-int/2addr v0, v4

    move-object/from16 v5, p0

    .line 56
    invoke-virtual {v5, v1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 57
    invoke-super/range {p0 .. p0}, Ll/ۗܺ᩷;->onPause()V

    return-void

    :sswitch_6
    move-object/from16 v5, p0

    .line 0
    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sget v0, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v0, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v0, "\u06e4\u1a7b"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    move/from16 v19, v1

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x55ad

    const v21, -0x3a87966b

    xor-int v1, v1, v21

    const v21, -0x54562625

    goto/16 :goto_7

    :sswitch_7
    move-object/from16 v5, p0

    move/from16 v19, v1

    const/16 v0, 0x2d

    const/4 v1, 0x3

    invoke-static {v15, v0, v1, v11}, Ll/֡ܶ;->ܽ᩻᩵([SIII)Ljava/lang/String;

    move-result-object v3

    .line 28
    sget v0, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v0, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v0, "\u06d6\u1a74"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x6d57

    const v21, 0x1ba72a5c

    xor-int v1, v1, v21

    const v21, 0x9e45932

    goto/16 :goto_7

    :sswitch_8
    move-object/from16 v5, p0

    const v0, 0x7e6219bd

    xor-int v1, v2, v0

    .line 0
    sget-object v15, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    sget v0, Ll/ۛ;->᩺᩻֫:I

    if-ltz v0, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v0, "\u06e4\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x6f

    move/from16 v19, v1

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x3543

    const v21, 0x73696ca9

    xor-int v1, v1, v21

    const v21, -0x2bea88d6

    goto/16 :goto_7

    :sswitch_9
    move-object/from16 v5, p0

    move/from16 v19, v1

    invoke-static {v12, v13, v14, v11}, Ll/֡ᩴ;->۫ۘ᩺([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    .line 50
    sget v0, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v0, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v0, "\u05a8\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0xedd

    const v21, 0x589a16bc

    xor-int v1, v1, v21

    const v21, 0x396b471f

    goto/16 :goto_7

    :sswitch_a
    move-object/from16 v5, p0

    move/from16 v19, v1

    .line 0
    sget-object v12, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    const/16 v13, 0x2a

    const/4 v14, 0x3

    sget v0, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v0, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v0, "\u06eb\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x2f

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x255

    const v21, 0x163f4a8

    xor-int v1, v1, v21

    const v21, -0x56c7c131

    goto/16 :goto_7

    :sswitch_b
    move-object/from16 v5, p0

    move/from16 v19, v1

    const v0, 0xec19

    const v11, 0xec19

    goto :goto_2

    :sswitch_c
    move-object/from16 v5, p0

    move/from16 v19, v1

    const v0, 0xa546

    const v11, 0xa546

    :goto_2
    const-string v0, "\u06e0\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x3c5f

    const v21, -0x2c1850f2

    xor-int v1, v1, v21

    const v21, -0x3d93615d

    goto/16 :goto_7

    :cond_8
    const-string v0, "\u06db\u1a78"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x41c7

    const v21, 0x170b457c

    xor-int v1, v1, v21

    const v21, -0x69bd3a0a

    goto/16 :goto_7

    :sswitch_d
    move-object/from16 v5, p0

    move/from16 v19, v1

    const v10, 0xa870

    .line 12
    sget v0, Ll/۟;->ۗۤۛ:I

    if-eqz v0, :cond_9

    goto :goto_4

    :cond_9
    const-string v0, "\u06eb\u1a77"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x35

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x2099

    const v21, 0x7830e5be

    xor-int v1, v1, v21

    const v21, -0x401f5545

    goto/16 :goto_7

    :sswitch_e
    move-object/from16 v5, p0

    move/from16 v19, v1

    add-int v0, v7, v8

    mul-int v9, v0, v0

    sget-boolean v0, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v0, :cond_a

    move/from16 v1, v19

    :goto_3
    const-string v0, "\u1a7b\u073d"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    move/from16 v19, v1

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x5cf5

    const v21, 0x4325ea40

    xor-int v1, v1, v21

    const v21, -0x4dd7afcb    # -9.797124E-9f

    goto/16 :goto_7

    :cond_a
    const-string v0, "\u06db\u1a76"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x39

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x1b95

    const v21, -0xa8e39ab

    xor-int v1, v1, v21

    const v21, 0x3b163187

    goto/16 :goto_7

    :sswitch_f
    move-object/from16 v5, p0

    move/from16 v19, v1

    aget-short v7, v20, v6

    const/16 v8, 0x2a1c

    .line 3
    sget v0, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v0, :cond_b

    :goto_4
    const-string v0, "\u05ab\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x51

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x4c0d

    const v21, 0x2723a282

    xor-int v1, v1, v21

    const v21, -0x21fbdef6

    goto/16 :goto_7

    :cond_b
    const-string v0, "\u06df\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x65

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x6a21

    const v21, -0x1b462012

    xor-int v1, v1, v21

    const v21, -0x3c076bf4

    goto :goto_7

    :sswitch_10
    move-object/from16 v5, p0

    move/from16 v19, v1

    const/16 v6, 0x29

    .line 44
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v0

    if-gtz v0, :cond_c

    :goto_5
    const-string v0, "\u06ec\u1a78"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x6fe1

    const v21, -0x58bc8081

    xor-int v1, v1, v21

    const v21, -0xe51855b

    goto :goto_7

    :cond_c
    const-string v0, "\u06df\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x1cd3

    const v21, 0x52708a54

    xor-int v1, v1, v21

    const v21, -0x486621f6

    goto :goto_7

    :sswitch_11
    move-object/from16 v5, p0

    move/from16 v19, v1

    sget-object v20, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    .line 49
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v0

    if-eqz v0, :cond_d

    :goto_6
    const-string v0, "\u1a76\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x41

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x3939

    const v21, -0x1d55aad

    xor-int v1, v1, v21

    const v21, -0x2d6cc3ef

    goto :goto_7

    :cond_d
    const-string v0, "\u1a76\u06e8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x590b

    const v21, -0x76d9766

    xor-int v1, v1, v21

    const v21, -0x5884e444

    :goto_7
    xor-int v0, v0, v21

    move/from16 v22, v19

    move/from16 v19, v0

    move v0, v1

    move/from16 v1, v22

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7cd47ada -> :sswitch_c
        -0x78e1b9eb -> :sswitch_b
        -0x67f897ba -> :sswitch_6
        -0x5f1ee9a1 -> :sswitch_9
        -0x5777d18a -> :sswitch_8
        -0x576a1cf5 -> :sswitch_1
        -0x4b01ac2c -> :sswitch_11
        -0x4937f3db -> :sswitch_5
        -0x40e1a403 -> :sswitch_c
        -0x35482fc4 -> :sswitch_4
        -0x2b7a3fbb -> :sswitch_d
        -0x1f2cc952 -> :sswitch_0
        -0x17f1165d -> :sswitch_7
        -0xbc558e3 -> :sswitch_10
        -0x33a55b2 -> :sswitch_e
        0x7a1f421 -> :sswitch_b
        0x8a24db7 -> :sswitch_2
        0x13ab54f0 -> :sswitch_9
        0x1f17df23 -> :sswitch_2
        0x1f20b83c -> :sswitch_f
        0x23c8b33d -> :sswitch_0
        0x2cde3689 -> :sswitch_6
        0x2e62cedc -> :sswitch_f
        0x2fbc9b10 -> :sswitch_3
        0x332b9ee0 -> :sswitch_4
        0x33939438 -> :sswitch_e
        0x369bffa4 -> :sswitch_10
        0x3a4af6e6 -> :sswitch_5
        0x4080260e -> :sswitch_d
        0x5050e7e5 -> :sswitch_11
        0x5404f359 -> :sswitch_a
        0x5a953bd8 -> :sswitch_8
        0x5b97bd0c -> :sswitch_a
        0x68557406 -> :sswitch_3
        0x76e869a3 -> :sswitch_7
        0x79de984f -> :sswitch_1
    .end sparse-switch
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 10

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x292376e4

    sget v4, Ll/ۗ᩷;->᩸᩺ᩳ:I

    sget v5, Ll/֫ۧ;->ۙ۟ۧ:I

    const-string v6, "\u06e8\u1a74"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x29

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5c75

    const v8, 0x45d13d1e

    xor-int/2addr v7, v8

    const v8, -0x31dac45f    # -6.9303712E8f

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x723

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    sget v6, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-gez v6, :cond_c

    goto/16 :goto_4

    .line 116
    :sswitch_0
    sget v6, Ll/֨᩺;->ۨ֨۬:I

    if-lez v6, :cond_5

    goto/16 :goto_4

    .line 44
    :sswitch_1
    sget v6, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-gez v6, :cond_a

    goto/16 :goto_6

    .line 51
    :sswitch_2
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    goto/16 :goto_4

    .line 113
    :sswitch_3
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    return-void

    .line 123
    :sswitch_4
    new-instance v6, Ll/ۡۖᩳ;

    sget-object v7, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    sget v8, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v8, :cond_0

    goto/16 :goto_6

    :cond_0
    const/16 v8, 0x31

    const/4 v9, 0x3

    invoke-static {v7, v8, v9, v2}, Ll/֫ܺ;->᩶֡ۤ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v8

    if-ltz v8, :cond_1

    goto/16 :goto_5

    :cond_1
    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    .line 47
    sget v8, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v8, :cond_2

    goto :goto_1

    :cond_2
    const v8, 0x7edc764d

    xor-int/2addr v7, v8

    .line 123
    invoke-static {p0, v7}, Ll/ۘ᩻;->ۗ᩹ܶ(Ljava/lang/Object;I)Landroid/view/View;

    move-result-object v7

    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v8

    if-ltz v8, :cond_3

    :goto_1
    const-string v6, "\u06e2\u06eb"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x4b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1d09

    const v8, -0x389bbdf9

    xor-int/2addr v7, v8

    const v8, 0x3ec66d

    goto :goto_0

    :cond_3
    iget-object v8, p0, Ll/۫ۡ᩷;->ܿۧ:Ll/ۗۡ᩷;

    invoke-virtual {v8}, Ll/ۗۡ᩷;->ۧ()Ll/۫ܽܽ;

    move-result-object v8

    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v9

    if-nez v9, :cond_4

    goto :goto_2

    :cond_4
    invoke-direct {v6, p0, v7, v8}, Ll/ۡۖᩳ;-><init>(Ll/۫ۡ᩷;Landroid/view/View;Ll/۫ܽܽ;)V

    iput-object v6, p0, Ll/۫ۡ᩷;->ܳۧ:Ll/ۡۖᩳ;

    .line 124
    sget-object p1, Ll/۬ۡ᩷;->۫:Ljava/lang/String;

    invoke-virtual {v6, p1}, Ll/ۡۖᩳ;->֫(Ljava/lang/String;)V

    return-void

    .line 121
    :sswitch_5
    move-object v6, p2

    check-cast v6, Ll/ۗۡ᩷;

    iput-object v6, p0, Ll/۫ۡ᩷;->ܿۧ:Ll/ۗۡ᩷;

    .line 122
    invoke-virtual {v6}, Ll/ۗۡ᩷;->ܽ()V

    .line 28
    sget-boolean v6, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v6, :cond_6

    :cond_5
    :goto_2
    const-string v6, "\u06df\u06e8"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0xd45

    const v8, -0x74771fea

    xor-int/2addr v7, v8

    const v8, -0x3b4d5f75

    goto/16 :goto_0

    :cond_6
    const-string v6, "\u05a1\u06e7"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x39

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x56bb

    const v8, 0x6e6a546e

    xor-int/2addr v7, v8

    const v8, 0xdf7392c

    goto/16 :goto_0

    :sswitch_6
    const/16 v2, 0x14b2

    goto :goto_3

    :sswitch_7
    const v2, 0x98e1

    :goto_3
    const-string v6, "\u06df\u06e1"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x29

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x10f

    const v8, 0x482041a6

    xor-int/2addr v7, v8

    const v8, -0x5ec45221

    goto/16 :goto_0

    :sswitch_8
    mul-int/lit16 v6, v0, 0x6dec

    sub-int/2addr v6, v1

    if-lez v6, :cond_7

    const-string v6, "\u06db\u06db"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7329

    const v8, -0x468d9f5c

    xor-int/2addr v7, v8

    const v8, -0x7b3d46ca

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u06eb\u0730"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5487

    const v8, -0x771253ba

    xor-int/2addr v7, v8

    const v8, -0x98adaf7

    goto/16 :goto_0

    :sswitch_9
    mul-int v1, v0, v0

    const v6, 0xbccb464

    add-int/2addr v1, v6

    .line 0
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v6

    if-gtz v6, :cond_8

    goto :goto_4

    :cond_8
    const-string v6, "\u0733\u06db"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x240b

    const v8, -0x2fbd17f8

    xor-int/2addr v7, v8

    const v8, -0x1f2a2456

    goto/16 :goto_0

    :sswitch_a
    const/16 v0, 0x30

    aget-short v0, p1, v0

    .line 120
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v6

    if-ltz v6, :cond_9

    :goto_4
    const-string v6, "\u06d6\u1a7b"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x73

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x55f5

    const v8, -0x7bd6c2c9

    xor-int/2addr v7, v8

    const v8, -0x71212cab

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u06e4\u1a73"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x7f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x41bd

    const v8, 0x692d6a81

    xor-int/2addr v7, v8

    const v8, 0x816079a

    goto/16 :goto_0

    :sswitch_b
    sget-object p1, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    .line 88
    sget v6, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v6, :cond_b

    :cond_a
    :goto_5
    const-string v6, "\u06da\u06e1"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x1353

    const v8, 0x4ad90628    # 7111444.0f

    xor-int/2addr v7, v8

    const v8, -0x26c58231

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u1a73\u1a76"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x59

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7fa7

    const v8, -0x1cdba6ba

    xor-int/2addr v7, v8

    const v8, 0x704a4442

    goto/16 :goto_0

    .line 67
    :sswitch_c
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result v6

    if-nez v6, :cond_d

    :cond_c
    :goto_6
    const-string v6, "\u06e4\u06e8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1b0b

    const v8, -0x2e6de861

    xor-int/2addr v7, v8

    const v8, -0x62597b9e

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u06e7\u1a76"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x6b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4fbd

    const v8, -0x2d2501fc

    xor-int/2addr v7, v8

    const v8, -0x6266cb7f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x738823bf -> :sswitch_2
        -0x6860caff -> :sswitch_7
        -0x6809124b -> :sswitch_7
        -0x65b36d24 -> :sswitch_4
        -0x641ad822 -> :sswitch_9
        -0x5aa74931 -> :sswitch_1
        -0x5580fc60 -> :sswitch_6
        -0x51130e58 -> :sswitch_b
        -0x4efa103e -> :sswitch_0
        -0x4ee69633 -> :sswitch_8
        -0x4e003aa3 -> :sswitch_4
        -0x4da1f28d -> :sswitch_c
        -0x4d030461 -> :sswitch_3
        -0x3197a3ac -> :sswitch_8
        -0x14a2ee74 -> :sswitch_b
        -0x3b36ab5 -> :sswitch_2
        0x288e5df -> :sswitch_1
        0xb27ec61 -> :sswitch_5
        0xd96a566 -> :sswitch_c
        0xf463f78 -> :sswitch_5
        0x13630589 -> :sswitch_6
        0x44e590b2 -> :sswitch_a
        0x53bcff35 -> :sswitch_9
        0x685493d7 -> :sswitch_0
        0x71f9ac5c -> :sswitch_3
        0x7a6496dc -> :sswitch_a
    .end sparse-switch
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    return-void
.end method

.method public final onStop()V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x4de6fe9a

    sget v2, Ll/ۗۗ;->ۨ۬ۖ:I

    sget v3, Ll/ۗ᩷;->᩸᩺ᩳ:I

    const-string v4, "\u06df\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x655d

    const v6, 0x41f095ef

    xor-int/2addr v5, v6

    const v6, 0x1edd3012

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x2d0f

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 35
    sget v4, Ll/֡᩶;->ܳܶ۠:I

    if-lez v4, :cond_a

    goto/16 :goto_6

    .line 53
    :sswitch_0
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v4

    if-eqz v4, :cond_d

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    sget v4, Ll/֨۬;->۫ۙ᩺:I

    if-lez v4, :cond_5

    goto/16 :goto_4

    .line 61
    :sswitch_2
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    goto/16 :goto_6

    .line 17
    :sswitch_3
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    return-void

    .line 70
    :sswitch_4
    invoke-static {p0}, Ll/ۖۘ;->ۜۨۧ(Ljava/lang/Object;)V

    goto :goto_1

    :sswitch_5
    return-void

    .line 67
    :sswitch_6
    invoke-virtual {v0}, Ll/ۗۡ᩷;->ᩳ()V

    goto :goto_2

    .line 69
    :sswitch_7
    invoke-static {p0}, Ll/ۗۗ;->۬ۛ֡(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "\u0730\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x43

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x34d7

    const v6, -0x5ea7f2d8

    xor-int/2addr v5, v6

    const v6, 0x110ae468

    goto :goto_0

    :cond_0
    :goto_1
    const-string v4, "\u05a1\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6b37

    const v6, -0x559e0512

    xor-int/2addr v5, v6

    const v6, 0x61f20c72

    goto :goto_0

    .line 64
    :sswitch_8
    new-instance v4, Landroid/content/Intent;

    const-class v5, Ll/۬ۡ᩷;

    .line 56
    sget-boolean v6, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v6, :cond_1

    const-string v4, "\u1a7a\u06da"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6203

    const v6, 0x3af4c001

    xor-int/2addr v5, v6

    const v6, 0x2b068c0b

    goto :goto_0

    .line 64
    :cond_1
    invoke-direct {v4, p0, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 65
    invoke-virtual {p0, v4}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    goto :goto_2

    .line 66
    :sswitch_9
    iget-object v0, p0, Ll/۫ۡ᩷;->ܿۧ:Ll/ۗۡ᩷;

    if-eqz v0, :cond_2

    const-string v4, "\u06d9\u06da"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x43

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x100f

    const v6, -0x35dbcd10    # -2690236.0f

    xor-int/2addr v5, v6

    const v6, -0xd37f934

    goto/16 :goto_0

    :cond_2
    :goto_2
    const-string v4, "\u1a77\u06e8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x5b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3e29

    const v6, 0x3b60f343

    xor-int/2addr v5, v6

    const v6, 0x663a743b

    goto/16 :goto_0

    .line 63
    :sswitch_a
    iget-boolean v4, p0, Ll/۫ۡ᩷;->᩻ۧ:Z

    if-eqz v4, :cond_3

    const-string v4, "\u06d6\u06db"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2cdf

    const v6, 0xd477c00

    xor-int/2addr v5, v6

    const v6, -0x410c1b2a

    goto/16 :goto_0

    :cond_3
    const-string v4, "\u1a7a\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3867

    const v6, -0x3abbec9a

    xor-int/2addr v5, v6

    const v6, 0x7aaefe1

    goto/16 :goto_0

    .line 1
    :sswitch_b
    sget-boolean v4, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v4, :cond_4

    goto :goto_3

    :cond_4
    const-string v4, "\u06e7\u0733"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x6ccf

    const v6, -0x6fb43bb5

    xor-int/2addr v5, v6

    const v6, -0x4627968f

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v4, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v4, :cond_6

    :cond_5
    :goto_3
    const-string v4, "\u06e8\u06d7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x3d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xfcb

    const v6, 0x53404683

    xor-int/2addr v5, v6

    const v6, 0xf82f1b4

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06da\u05ab"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x11

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4b7b

    const v6, -0x6c6e9709

    xor-int/2addr v5, v6

    const v6, -0x5e57ec86

    goto/16 :goto_0

    .line 39
    :sswitch_d
    sget v4, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v4, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v4, "\u1a73\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x31

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x33af

    const v6, -0x6fce2198

    xor-int/2addr v5, v6

    const v6, -0x7202e8fc

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v4, :cond_8

    goto :goto_4

    :cond_8
    const-string v4, "\u1a74\u06e8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x455b

    const v6, 0x713036ca

    xor-int/2addr v5, v6

    const v6, -0x1acb8891

    goto/16 :goto_0

    .line 69
    :sswitch_f
    sget v4, Ll/ۛ;->᩺᩻֫:I

    if-ltz v4, :cond_9

    goto :goto_4

    :cond_9
    const-string v4, "\u06dc\u06ec"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1e75

    const v6, -0x42ed9c19

    xor-int/2addr v5, v6

    const v6, -0x7843bba2

    goto/16 :goto_0

    .line 59
    :sswitch_10
    sget-boolean v4, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v4, :cond_b

    :cond_a
    :goto_4
    const-string v4, "\u06da\u0733"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x28b1

    const v6, 0x367c739a

    xor-int/2addr v5, v6

    const v6, 0x796a6f0a

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06da\u06e2"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x49

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3983

    const v6, -0x4a83f732

    xor-int/2addr v5, v6

    const v6, -0x6bac30bb

    goto/16 :goto_0

    .line 23
    :sswitch_11
    sget v4, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v4, :cond_c

    goto :goto_5

    :cond_c
    const-string v4, "\u06d7\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3d6b

    const v6, -0x26288f6d

    xor-int/2addr v5, v6

    const v6, -0x68c9312

    goto/16 :goto_0

    :sswitch_12
    sget v4, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v4, :cond_e

    :cond_d
    :goto_5
    const-string v4, "\u1a78\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x25

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5403

    const v6, -0x641ac090

    xor-int/2addr v5, v6

    const v6, 0x579787f3

    goto/16 :goto_0

    :cond_e
    const-string v4, "\u06d9\u06d8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x7b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4fbd

    const v6, 0x571d40a5

    xor-int/2addr v5, v6

    const v6, -0x318baa01

    goto/16 :goto_0

    .line 62
    :sswitch_13
    invoke-super {p0}, Ll/ۗܺ᩷;->onStop()V

    .line 8
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-eqz v4, :cond_f

    :goto_6
    const-string v4, "\u1a7a\u0730"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x1fb3

    const v6, 0x73ccf746

    xor-int/2addr v5, v6

    const v6, -0x7bb2775d

    goto/16 :goto_0

    :cond_f
    const-string v4, "\u06dc\u06d7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x6b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7647

    const v6, -0xef9ac34

    xor-int/2addr v5, v6

    const v6, 0x3fe8501d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d8998cd -> :sswitch_7
        -0x7b227fca -> :sswitch_d
        -0x7860e29a -> :sswitch_f
        -0x6db34be8 -> :sswitch_b
        -0x4407e9db -> :sswitch_7
        -0x2d681c5b -> :sswitch_12
        -0x2ad18b92 -> :sswitch_6
        -0x20e60c42 -> :sswitch_8
        -0x20474575 -> :sswitch_a
        -0x1fe9e0e1 -> :sswitch_4
        -0x1e733243 -> :sswitch_11
        -0x195d9db4 -> :sswitch_f
        -0x13794e8a -> :sswitch_9
        -0xa903c37 -> :sswitch_0
        -0x922e9a9 -> :sswitch_11
        -0x6459881 -> :sswitch_6
        0x18748a -> :sswitch_5
        0xba8d346 -> :sswitch_a
        0xc0d999e -> :sswitch_12
        0xc516c9c -> :sswitch_10
        0x1032fe17 -> :sswitch_2
        0x1880793e -> :sswitch_2
        0x21238006 -> :sswitch_b
        0x2285ccc4 -> :sswitch_10
        0x2ffc8e79 -> :sswitch_c
        0x32ece766 -> :sswitch_1
        0x33f23561 -> :sswitch_8
        0x3a18ab7a -> :sswitch_1
        0x484d530c -> :sswitch_e
        0x4aef7a06 -> :sswitch_0
        0x4ebec2aa -> :sswitch_4
        0x527c78c6 -> :sswitch_d
        0x592267d8 -> :sswitch_3
        0x61b73ef5 -> :sswitch_c
        0x664319e9 -> :sswitch_9
        0x683f13de -> :sswitch_13
        0x716c69c2 -> :sswitch_3
        0x729e4559 -> :sswitch_e
        0x7886c4bd -> :sswitch_5
        0x7f3712c8 -> :sswitch_13
    .end sparse-switch
.end method

.method public final ֫(Ll/᩷ܺ᩷;)V
    .locals 0

    return-void
.end method

.method public final ۚ()Ljava/lang/String;
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

    const v10, 0x53853179

    sget v11, Ll/ۘܿ;->ۘܰ۫:I

    sget v12, Ll/֫᩵;->ܶ᩻᩷:I

    const-string v13, "\u06d6\u06da"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x286b

    const v15, -0x5712fd7e

    xor-int/2addr v14, v15

    const v15, 0x29862d8d

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, -0x4bd9

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    sget v13, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v13, :cond_9

    goto/16 :goto_3

    .line 0
    :sswitch_0
    sget-boolean v13, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v13, :cond_8

    goto/16 :goto_5

    .line 3
    :sswitch_1
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    sget v13, Ll/ۘܿ;->ۘܰ۫:I

    if-gez v13, :cond_5

    goto/16 :goto_5

    :sswitch_2
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    sget v13, Ll/ۘܿ;->ۘܰ۫:I

    if-gez v13, :cond_c

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    goto/16 :goto_4

    .line 1
    :sswitch_4
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_5
    const/16 v0, 0x11

    .line 0
    invoke-static {v8, v9, v0, v7}, Ll/֫ܽ;->᩵۠ܽ([SIII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_6
    sget-object v8, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    const/16 v9, 0x35

    sget v13, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v13, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v13, "\u06ec\u05a1"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x3

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x7c4d

    const v15, -0x211d6bb9

    xor-int/2addr v14, v15

    const v15, 0x1c919015

    goto :goto_0

    :sswitch_7
    const v7, 0xe2ed

    goto :goto_1

    :sswitch_8
    const v7, 0xca4f

    :goto_1
    const-string v13, "\u05a8\u073d"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x339d

    const v15, 0x6b08d94c

    xor-int/2addr v14, v15

    const v15, 0x7ca2d22d

    goto :goto_0

    :sswitch_9
    add-int v13, v2, v6

    mul-int v13, v13, v13

    sub-int v13, v5, v13

    if-gez v13, :cond_1

    const-string v13, "\u06db\u06db"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x1363

    const v15, -0x18f9aee6

    xor-int/2addr v14, v15

    const v15, -0x776b9408

    goto/16 :goto_0

    :cond_1
    const-string v13, "\u1a7b\u073d"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x4c7

    const v15, -0x3f4551c2

    xor-int/2addr v14, v15

    const v15, 0x75241c9e

    goto/16 :goto_0

    :sswitch_a
    const/16 v6, 0x2dbd

    sget v13, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v13, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v13, "\u05ab\u06e7"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x2095

    const v15, -0x5cccdce6

    xor-int/2addr v14, v15

    const v15, 0x169ebd1

    goto/16 :goto_0

    :sswitch_b
    add-int v5, v3, v4

    add-int/2addr v5, v5

    .line 1
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v13

    if-ltz v13, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v13, "\u06d7\u05a1"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x29

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x1def

    const v15, 0x71813aab

    xor-int/2addr v14, v15

    const v15, -0x62bd7cfe

    goto/16 :goto_0

    :sswitch_c
    mul-int v3, v2, v2

    const v4, 0x82bfd89

    sget v13, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v13, :cond_4

    goto :goto_2

    :cond_4
    const-string v13, "\u0730\u06e8"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x743

    const v15, 0x66b653b3

    xor-int/2addr v14, v15

    const v15, 0x30269e18

    goto/16 :goto_0

    :sswitch_d
    aget-short v2, v0, v1

    .line 4
    sget v13, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v13, :cond_6

    :cond_5
    const-string v13, "\u0733\u05a1"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x42e1

    const v15, -0x4af2e25a

    xor-int/2addr v14, v15

    const v15, -0x25ab30e0

    goto/16 :goto_0

    :cond_6
    const-string v13, "\u1a75\u1a74"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x44f

    const v15, 0x663c0972

    xor-int/2addr v14, v15

    const v15, 0x453e84da

    goto/16 :goto_0

    :sswitch_e
    const/16 v1, 0x34

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v13

    if-gtz v13, :cond_7

    :goto_2
    const-string v13, "\u06e0\u06e2"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0xd0f

    const v15, 0x5659563

    xor-int/2addr v14, v15

    const v15, -0x435f6514

    goto/16 :goto_0

    :cond_7
    const-string v13, "\u1a75\u1a77"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x39

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x3739

    const v15, 0x1be1728b

    xor-int/2addr v14, v15

    const v15, -0x7dd9cf47

    goto/16 :goto_0

    :cond_8
    :goto_3
    const-string v13, "\u06ec\u06da"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x3585

    const v15, 0x42a621fc

    xor-int/2addr v14, v15

    const v15, 0x2899ac9a

    goto/16 :goto_0

    :cond_9
    const-string v13, "\u1a77\u06e7"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x6687

    const v15, -0x5f1be67e

    xor-int/2addr v14, v15

    const v15, 0x15c76acd

    goto/16 :goto_0

    :sswitch_f
    sget v13, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v13, :cond_a

    goto :goto_5

    :cond_a
    const-string v13, "\u06db\u06e2"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x3d95

    const v15, -0x169b9b0b

    xor-int/2addr v14, v15

    const v15, 0x626c58b0

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v13

    if-eqz v13, :cond_b

    :goto_4
    const-string v13, "\u1a78\u06ec"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x22df

    const v15, 0x565dea62    # 6.0999684E13f

    xor-int/2addr v14, v15

    const v15, 0x79ea1b74

    goto/16 :goto_0

    :cond_b
    const-string v13, "\u06d6\u1a7a"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x39

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x7d79

    const v15, 0x4a5b9ed4    # 3598261.0f

    xor-int/2addr v14, v15

    const v15, -0x83c8cb2

    goto/16 :goto_0

    :sswitch_11
    sget-object v0, Ll/۫ۡ᩷;->᩸۠ۡ:[S

    sget-boolean v13, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v13, :cond_d

    :cond_c
    :goto_5
    const-string v13, "\u06eb\u06da"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x66c1

    const v15, -0x7a968808

    xor-int/2addr v14, v15

    const v15, 0x1d61accb

    goto/16 :goto_0

    :cond_d
    const-string v13, "\u05ab\u073d"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x5

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x125b

    const v15, -0x7e0612f8

    xor-int/2addr v14, v15

    const v15, -0x4b3c40b5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x5f3d9fd4 -> :sswitch_1
        -0x5e22196f -> :sswitch_11
        -0x5280b549 -> :sswitch_10
        -0x47829588 -> :sswitch_b
        -0x44f2a7c1 -> :sswitch_a
        -0x2b2afe9b -> :sswitch_2
        -0x24e0af55 -> :sswitch_8
        -0x175f9d9a -> :sswitch_11
        -0x16506412 -> :sswitch_4
        -0x15f53693 -> :sswitch_0
        -0x283ce9c -> :sswitch_8
        0xcfa140 -> :sswitch_7
        0x590a07e -> :sswitch_10
        0x5c0fc13 -> :sswitch_3
        0x7472975 -> :sswitch_7
        0x1265cf30 -> :sswitch_c
        0x13856a07 -> :sswitch_9
        0x139745c6 -> :sswitch_c
        0x22ebb965 -> :sswitch_5
        0x23c252af -> :sswitch_e
        0x2425a259 -> :sswitch_1
        0x2653b843 -> :sswitch_d
        0x2a08eb3b -> :sswitch_6
        0x2d5d98a2 -> :sswitch_b
        0x2f43af83 -> :sswitch_4
        0x3c0e9dc7 -> :sswitch_d
        0x4011cbc7 -> :sswitch_0
        0x436ede1e -> :sswitch_e
        0x4bcbfe07 -> :sswitch_3
        0x520f3a36 -> :sswitch_2
        0x542d6862 -> :sswitch_f
        0x57c3d2ce -> :sswitch_9
        0x74754f01 -> :sswitch_f
        0x7a7d062c -> :sswitch_5
        0x7bf8dddd -> :sswitch_6
        0x7c6c9cc3 -> :sswitch_a
    .end sparse-switch
.end method
