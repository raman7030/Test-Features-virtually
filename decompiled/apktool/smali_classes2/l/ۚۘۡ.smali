.class public final Ll/ۚۘۡ;
.super Ljava/lang/Object;
.source "F1FO"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final ܿܰۘ:[S


# instance fields
.field public ۙ:Z

.field public ᩶:Ljava/util/Random;

.field public ᩸:Landroid/animation/ObjectAnimator;

.field public ᩹:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۚۘۡ;->ܿܰۘ:[S

    return-void

    :array_0
    .array-data 2
        0x2198s
        0x24bbs
        0x24bfs
        0x24a2s
        0x24b9s
        0x24acs
        0x24b9s
        0x24a4s
        0x24a2s
        0x24a3s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x23c504e

    sget v2, Ll/֡۬;->۠֡᩶:I

    sget v3, Ll/ۖ;->᩹۟ۘ:I

    .line 667
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u05a8\u06e7"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x533

    const v6, -0x2898e7c0

    xor-int/2addr v5, v6

    const v6, 0x524ed3ef

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x18db

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 44
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :sswitch_0
    sget-boolean v4, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v4, :cond_b

    goto/16 :goto_1

    .line 198
    :sswitch_1
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v4

    if-ltz v4, :cond_5

    goto/16 :goto_4

    .line 222
    :sswitch_2
    sget-boolean v4, Ll/ۖۘ;->ۚܶۖ:Z

    if-nez v4, :cond_9

    goto/16 :goto_2

    .line 173
    :sswitch_3
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    goto/16 :goto_2

    .line 669
    :sswitch_4
    iput-object v0, p0, Ll/ۚۘۡ;->᩶:Ljava/util/Random;

    return-void

    .line 373
    :sswitch_5
    sget-boolean v4, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v4, "\u06df\u06e1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x43

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2513

    const v6, -0x9c06d3

    xor-int/2addr v5, v6

    const v6, 0x176cebff

    goto :goto_0

    .line 78
    :sswitch_6
    sget v4, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v4, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v4, "\u073d\u06eb"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x61ab

    const v6, 0x4b2b4d66    # 1.122647E7f

    xor-int/2addr v5, v6

    const v6, 0x44e1ef7

    goto :goto_0

    .line 527
    :sswitch_7
    sget v4, Ll/֨۟;->᩹֫᩷:I

    if-eqz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u06da\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x502f

    const v6, -0x22b976cf

    xor-int/2addr v5, v6

    const v6, -0x32cdcfa5

    goto :goto_0

    .line 334
    :sswitch_8
    sget v4, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v4, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v4, "\u1a74\u073f"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6cfd

    const v6, 0xf453cd7

    xor-int/2addr v5, v6

    const v6, 0x6b26e27c

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/᩺;->ۙۛܶ:I

    if-gtz v4, :cond_4

    goto :goto_1

    :cond_4
    const-string v4, "\u1a74\u0733"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4f29

    const v6, 0x1adbb5c0

    xor-int/2addr v5, v6

    const v6, 0x59b02206

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v4

    if-gtz v4, :cond_6

    :cond_5
    :goto_1
    const-string v4, "\u06d6\u1a75"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x405d

    const v6, -0x5a0cb8e2

    xor-int/2addr v5, v6

    const v6, -0x758d7cd7

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06d9\u06e8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xcb5

    const v6, 0x5bd9131f

    xor-int/2addr v5, v6

    const v6, -0x27b7b155

    goto/16 :goto_0

    .line 161
    :sswitch_b
    sget v4, Ll/֨۟;->᩹֫᩷:I

    if-eqz v4, :cond_7

    :goto_2
    const-string v4, "\u06e8\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2d8b

    const v6, 0x5c92a4ab

    xor-int/2addr v5, v6

    const v6, -0x603b4937

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06e8\u073a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x1d4b

    const v6, -0x5ba55291

    xor-int/2addr v5, v6

    const v6, -0x1b83cd8c

    goto/16 :goto_0

    .line 404
    :sswitch_c
    sget-boolean v4, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v4, :cond_8

    :goto_3
    const-string v4, "\u1a76\u06e4"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x5f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x217f

    const v6, 0x2f9817b2

    xor-int/2addr v5, v6

    const v6, 0x10cea9af

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u0730\u1a74"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x6f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6fa3

    const v6, -0xffb90b9

    xor-int/2addr v5, v6

    const v6, 0x7ae21caa

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v4, :cond_a

    :cond_9
    :goto_4
    const-string v4, "\u06d7\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xce5

    const v6, 0x22bd3cee

    xor-int/2addr v5, v6

    const v6, -0x32ef834

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u0736\u073a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x7

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x290b

    const v6, 0x27ecf200

    xor-int/2addr v5, v6

    const v6, -0x5b1bc0ed

    goto/16 :goto_0

    .line 669
    :sswitch_e
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 417
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v4

    if-gtz v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u06dc\u05ab"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x53

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2b4d

    const v6, 0x12e081d6

    xor-int/2addr v5, v6

    const v6, -0x7b50d65b

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06dc\u1a79"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5ca3

    const v6, -0x6ff6d78c

    xor-int/2addr v5, v6

    const v6, -0x5bb1b3bb

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fac94c1 -> :sswitch_d
        -0x7f1a6ae1 -> :sswitch_8
        -0x6d66d189 -> :sswitch_2
        -0x6453dcc2 -> :sswitch_7
        -0x6286be0f -> :sswitch_2
        -0x5f79aebe -> :sswitch_6
        -0x435a1fa7 -> :sswitch_d
        -0x3f5c297b -> :sswitch_9
        -0x361dde1e -> :sswitch_1
        -0x343f5709 -> :sswitch_4
        -0x2a2657ee -> :sswitch_6
        -0x1bc561d8 -> :sswitch_3
        -0x18fade81 -> :sswitch_b
        -0xd987ef0 -> :sswitch_1
        0x5043137 -> :sswitch_7
        0x7a72f38 -> :sswitch_c
        0x90bec4b -> :sswitch_4
        0x1251d3b0 -> :sswitch_3
        0x1ca5bab8 -> :sswitch_5
        0x2e2156a9 -> :sswitch_e
        0x3d2a6300 -> :sswitch_a
        0x422730fd -> :sswitch_5
        0x4911039c -> :sswitch_0
        0x49ffbda7 -> :sswitch_0
        0x4aa526d1 -> :sswitch_e
        0x4b73c2bf -> :sswitch_b
        0x4bf498d6 -> :sswitch_a
        0x4ce54c32 -> :sswitch_9
        0x55b8d33d -> :sswitch_c
        0x6ed65f07 -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 39

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

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const v29, 0x3f91c035

    sget v30, Ll/ۘۨ;->۫᩸۠:I

    sget v31, Ll/֫ܿ;->ۨ۫ᩳ:I

    const-string v32, "\u06eb\u0736"

    invoke-static/range {v32 .. v32}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v32

    xor-int v32, v32, v30

    xor-int v2, v32, v31

    mul-int/lit16 v2, v2, 0x20af

    const v34, -0x6d7a054b

    xor-int v2, v2, v34

    const v34, 0x6f77399d

    xor-int v32, v32, v34

    move-object v9, v8

    move-object v15, v14

    move-object/from16 v4, v18

    move-object/from16 v7, v19

    move-object/from16 v21, v20

    move-object/from16 v36, v27

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    move-object/from16 v19, v3

    move-object v14, v13

    const/4 v3, 0x0

    const/4 v13, 0x0

    :goto_0
    xor-int v11, v29, v31

    mul-int/lit16 v11, v11, 0x32d

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v2, v11

    xor-int v29, v32, v2

    sparse-switch v29, :sswitch_data_0

    move/from16 v28, v12

    .line 692
    invoke-static {v1, v9, v14}, Ll/ۛ;->ܳۤۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object v2

    const-wide/16 v11, 0x320

    invoke-static {v2, v11, v12}, Ll/֫ۡ;->ۢܰܶ(Ljava/lang/Object;J)Landroid/animation/ObjectAnimator;

    move-result-object v15

    .line 442
    sget-boolean v2, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v2, :cond_8

    goto/16 :goto_9

    .line 598
    :sswitch_0
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    :goto_1
    move/from16 v32, v3

    move/from16 v28, v12

    :goto_2
    move-object/from16 v2, v16

    move/from16 v11, v35

    goto/16 :goto_17

    :cond_1
    const-string v2, "\u073a\u05a1"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v30

    mul-int/lit8 v2, v2, -0x4b

    xor-int v11, v2, v31

    mul-int/lit16 v11, v11, 0x459d

    const v28, 0x3df66421

    xor-int v11, v11, v28

    const v28, 0x3f2035ef

    goto/16 :goto_b

    .line 321
    :sswitch_1
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    sget v2, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    move/from16 v32, v3

    move/from16 v28, v12

    move-object/from16 v2, v16

    move/from16 v11, v35

    move-object/from16 v12, v36

    goto/16 :goto_18

    .line 292
    :sswitch_2
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_5

    :sswitch_3
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    sget v2, Ll/۠;->ܺܺܶ:I

    if-gez v2, :cond_3

    goto :goto_5

    :cond_3
    move/from16 v32, v3

    move/from16 v28, v12

    :goto_3
    move/from16 v11, v35

    move-object/from16 v12, v36

    goto/16 :goto_13

    :sswitch_4
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    sget v2, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v2, :cond_4

    :goto_4
    move v2, v12

    goto/16 :goto_7

    :cond_4
    :goto_5
    const-string v2, "\u0730\u06eb"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v30

    xor-int v11, v2, v31

    mul-int/lit16 v11, v11, 0x7bc5

    const v28, -0x70d30d38

    xor-int v11, v11, v28

    const v28, 0x6c422097

    goto/16 :goto_b

    :sswitch_5
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    goto :goto_4

    :sswitch_6
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    return-void

    .line 696
    :sswitch_7
    iget-object v1, v0, Ll/ۚۘۡ;->᩸:Landroid/animation/ObjectAnimator;

    invoke-static {v1}, Ll/ۖ;->ۚۖܽ(Ljava/lang/Object;)V

    invoke-static {v1}, Ll/᩺;->֨ܿ᩹(Ljava/lang/Object;)V

    return-void

    :sswitch_8
    neg-int v2, v12

    move v3, v2

    goto/16 :goto_a

    .line 688
    :sswitch_9
    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v7, v2}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 689
    iput-boolean v6, v0, Ll/ۚۘۡ;->᩹:Z

    move/from16 v28, v12

    goto/16 :goto_8

    :sswitch_a
    move v2, v12

    const-wide/16 v11, 0x1f4

    .line 687
    invoke-static {v4, v11, v12}, Ll/֨֫;->ܶ֨ۜ(Ljava/lang/Object;J)Landroid/animation/ObjectAnimator;

    move-result-object v7

    .line 686
    iput-object v7, v0, Ll/ۚۘۡ;->᩸:Landroid/animation/ObjectAnimator;

    .line 688
    invoke-static {v7}, Ll/ۖ;->ۚۖܽ(Ljava/lang/Object;)V

    .line 593
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v11

    if-eqz v11, :cond_5

    move/from16 v28, v2

    move/from16 v32, v3

    goto :goto_3

    :cond_5
    const-string v11, "\u1a74\u06eb"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    add-int v11, v11, v31

    mul-int/lit8 v11, v11, -0x3

    xor-int v12, v11, v30

    mul-int/lit16 v12, v12, -0x7e3

    const v28, 0x7d843c47

    xor-int v12, v12, v28

    const v28, 0x145a511

    goto :goto_6

    :sswitch_b
    move v2, v12

    .line 686
    new-array v4, v8, [F

    aput v17, v4, v6

    aput v18, v4, v5

    invoke-static {v1, v9, v4}, Ll/ۖ۫;->֫۬ܶ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object v4

    .line 585
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v11

    if-ltz v11, :cond_6

    move/from16 v28, v2

    goto/16 :goto_9

    :cond_6
    const-string v11, "\u0733\u06e2"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v30

    xor-int v12, v11, v31

    mul-int/lit16 v12, v12, -0x4ead

    const v28, -0x7d847719

    xor-int v12, v12, v28

    const v28, 0xdb9c23d

    :goto_6
    xor-int v32, v11, v28

    move/from16 v38, v12

    move v12, v2

    move/from16 v2, v38

    goto/16 :goto_0

    :sswitch_c
    move v2, v12

    xor-int v11, v13, v5

    .line 684
    iput-boolean v11, v0, Ll/ۚۘۡ;->ۙ:Z

    neg-int v11, v3

    .line 686
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getRotation()F

    move-result v17

    int-to-float v11, v11

    .line 336
    sget v12, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v12, :cond_7

    move/from16 v18, v11

    :goto_7
    const-string v11, "\u1a7a\u06d7"

    invoke-static {v11}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v31

    xor-int v12, v11, v30

    mul-int/lit16 v12, v12, -0x1b45

    const v28, 0x5785a188

    xor-int v12, v12, v28

    const v28, -0x7415df5d

    goto :goto_6

    :cond_7
    const-string v12, "\u1a74\u1a79"

    invoke-static {v12}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v12

    xor-int v12, v12, v30

    move/from16 v28, v2

    xor-int v2, v12, v31

    mul-int/lit16 v2, v2, 0x22d3

    const v18, -0x1d7fb9c6

    xor-int v2, v2, v18

    const v18, -0x6de05a0b

    xor-int v32, v12, v18

    move/from16 v18, v11

    goto/16 :goto_e

    :sswitch_d
    move/from16 v28, v12

    .line 691
    iput-object v15, v0, Ll/ۚۘۡ;->᩸:Landroid/animation/ObjectAnimator;

    .line 693
    invoke-static {v15}, Ll/֡᩺;->ۛۜܺ(Ljava/lang/Object;)V

    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v15, v2}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 694
    iput-boolean v5, v0, Ll/ۚۘۡ;->᩹:Z

    :goto_8
    const-string v2, "\u1a73\u06e1"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v31

    xor-int v11, v2, v30

    mul-int/lit16 v11, v11, -0x5fbd

    const v12, -0x17046a0d

    xor-int/2addr v11, v12

    const v12, -0x43ed92ab    # -0.0089372f

    goto/16 :goto_c

    :goto_9
    const-string v2, "\u0733\u05a8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v31

    mul-int/lit8 v2, v2, 0x3

    xor-int v11, v2, v30

    mul-int/lit16 v11, v11, -0x24df

    const v12, -0x6cfea83c

    xor-int/2addr v11, v12

    const v12, 0x443d5391

    goto/16 :goto_c

    :cond_8
    const-string v2, "\u1a7a\u1a7a"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v30

    mul-int/lit8 v2, v2, -0x43

    xor-int v11, v2, v31

    mul-int/lit16 v11, v11, 0x2a93

    const v12, -0x6fc62cca

    xor-int/2addr v11, v12

    const v12, 0x62a64f1b

    goto/16 :goto_c

    :sswitch_e
    move/from16 v28, v12

    .line 692
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getRotation()F

    move-result v2

    new-array v14, v8, [F

    aput v2, v14, v6

    aput v10, v14, v5

    .line 253
    sget v2, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v2, :cond_9

    move/from16 v32, v3

    goto/16 :goto_2

    :cond_9
    const-string v2, "\u1a7a\u0736"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v31

    mul-int/lit8 v2, v2, 0x61

    xor-int v11, v2, v30

    mul-int/lit16 v11, v11, 0x6fe9

    const v12, 0x2493b617

    xor-int/2addr v11, v12

    const v12, 0x7b928113

    goto/16 :goto_c

    .line 680
    :sswitch_f
    iget-object v2, v0, Ll/ۚۘۡ;->᩶:Ljava/util/Random;

    const/16 v11, 0x154

    invoke-virtual {v2, v11}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    add-int/lit16 v12, v2, 0x172

    .line 681
    iget-boolean v13, v0, Ll/ۚۘۡ;->ۙ:Z

    if-eqz v13, :cond_a

    const-string v2, "\u06dc\u0733"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v30

    mul-int/lit8 v2, v2, -0x27

    xor-int v11, v2, v31

    mul-int/lit16 v11, v11, -0x6e0f

    const v28, -0x3ca5f213

    xor-int v11, v11, v28

    const v28, 0x68d75fab

    goto :goto_b

    :cond_a
    move v3, v12

    :goto_a
    const-string v2, "\u073a\u073d"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v31

    xor-int v11, v2, v30

    mul-int/lit16 v11, v11, 0x5205

    const v28, 0x4ce372e4

    xor-int v11, v11, v28

    const v28, 0x2f2d8e03

    :goto_b
    xor-int v32, v2, v28

    move v2, v11

    goto/16 :goto_0

    :sswitch_10
    move/from16 v28, v12

    const/4 v2, 0x1

    move/from16 v32, v3

    move/from16 v11, v35

    move-object/from16 v12, v36

    const/16 v27, 0x1

    goto/16 :goto_f

    :sswitch_11
    move/from16 v28, v12

    if-eqz v27, :cond_b

    move-object v2, v9

    move/from16 v11, v35

    move-object/from16 v12, v36

    move/from16 v9, v37

    goto :goto_d

    :cond_b
    const-string v2, "\u05a8\u06e1"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v30

    xor-int v11, v2, v31

    mul-int/lit16 v11, v11, 0x5fd7

    const v12, -0x77efdbca

    xor-int/2addr v11, v12

    const v12, -0x7f71fa8f

    goto :goto_c

    :sswitch_12
    move/from16 v28, v12

    .line 676
    iget-object v2, v0, Ll/ۚۘۡ;->᩸:Landroid/animation/ObjectAnimator;

    invoke-static {v2}, Ll/ۖ;->ۚۖܽ(Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroid/animation/Animator;->cancel()V

    .line 677
    iget-boolean v2, v0, Ll/ۚۘۡ;->᩹:Z

    if-eqz v2, :cond_c

    const-string v2, "\u06e0\u073f"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v30, v2

    mul-int/lit8 v2, v2, 0x49

    xor-int v11, v2, v31

    mul-int/lit16 v11, v11, 0xe45

    const v12, -0x3a8ff5a2

    xor-int/2addr v11, v12

    const v12, 0x3e8d717a

    :goto_c
    xor-int v32, v2, v12

    move v2, v11

    goto/16 :goto_e

    :cond_c
    move/from16 v32, v3

    move-object/from16 v2, v16

    move/from16 v11, v35

    move-object/from16 v12, v36

    goto/16 :goto_11

    :sswitch_13
    move/from16 v28, v12

    const/16 v2, 0x8

    move/from16 v11, v35

    move-object/from16 v12, v36

    move/from16 v9, v37

    .line 679
    invoke-static {v12, v9, v2, v11}, Ll/ۖ;->ܽ֡ܶ([SIII)Ljava/lang/String;

    move-result-object v2

    const/4 v10, 0x0

    cmpg-float v32, v20, v10

    if-nez v32, :cond_d

    :goto_d
    const-string v32, "\u06db\u1a77"

    invoke-static/range {v32 .. v32}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v32

    xor-int v32, v32, v31

    xor-int v33, v32, v30

    mul-int/lit8 v33, v33, -0x21

    const v34, 0x1fc0c996

    xor-int v33, v33, v34

    const v34, 0x37e6cde7

    xor-int v32, v32, v34

    move/from16 v37, v9

    move/from16 v35, v11

    move-object/from16 v36, v12

    move/from16 v12, v28

    move-object v9, v2

    move/from16 v2, v33

    goto/16 :goto_0

    :cond_d
    const-string v32, "\u06e8\u05a8"

    invoke-static/range {v32 .. v32}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v32

    sub-int v32, v31, v32

    mul-int/lit8 v32, v32, 0x25

    xor-int v10, v32, v30

    mul-int/lit16 v10, v10, 0x4387

    const v34, 0x34c000e5

    xor-int v10, v10, v34

    const v34, -0xe5d8e92

    xor-int v32, v32, v34

    move/from16 v37, v9

    move/from16 v35, v11

    move-object/from16 v36, v12

    move/from16 v12, v28

    move-object v9, v2

    move v2, v10

    const/4 v10, 0x0

    goto/16 :goto_0

    :sswitch_14
    move/from16 v28, v12

    move/from16 v11, v35

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getRotation()F

    move-result v20

    const/4 v8, 0x2

    sget-object v36, Ll/ۚۘۡ;->ܿܰۘ:[S

    const/16 v37, 0x2

    sget v2, Ll/֨۟;->᩹֫᩷:I

    if-eqz v2, :cond_e

    move/from16 v32, v3

    move-object/from16 v2, v16

    goto/16 :goto_17

    :cond_e
    const-string v2, "\u05ab\u05a8"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v31

    xor-int v12, v2, v30

    mul-int/lit16 v12, v12, -0x22af

    const v32, 0x39d13b7b

    xor-int v12, v12, v32

    const v32, 0x7d32e921

    xor-int v32, v2, v32

    move/from16 v35, v11

    move v2, v12

    :goto_e
    move/from16 v12, v28

    goto/16 :goto_0

    :sswitch_15
    move/from16 v28, v12

    move/from16 v11, v35

    move-object/from16 v12, v36

    .line 675
    invoke-virtual/range {v19 .. v19}, Landroid/animation/Animator;->isRunning()Z

    move-result v2

    if-eqz v2, :cond_f

    const-string v2, "\u06e1\u05a8"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v30

    move/from16 v32, v3

    xor-int v3, v2, v31

    mul-int/lit16 v3, v3, 0x1eeb

    const v33, -0x534474c4

    xor-int v3, v3, v33

    const v33, 0x9efc314

    goto :goto_10

    :cond_f
    move/from16 v32, v3

    move-object/from16 v2, v16

    goto/16 :goto_11

    :sswitch_16
    move/from16 v32, v3

    move/from16 v28, v12

    move/from16 v11, v35

    move-object/from16 v12, v36

    const/4 v2, 0x0

    const/16 v27, 0x0

    :goto_f
    const-string v2, "\u1a74\u1a75"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v30

    xor-int v3, v2, v31

    mul-int/lit16 v3, v3, -0x7ddb

    const v33, 0x6cb63c37

    xor-int v3, v3, v33

    const v33, -0x3c46f258

    :goto_10
    xor-int v2, v2, v33

    move/from16 v35, v11

    move-object/from16 v36, v12

    move/from16 v12, v28

    move/from16 v38, v32

    move/from16 v32, v2

    move v2, v3

    goto/16 :goto_12

    :sswitch_17
    move/from16 v32, v3

    move/from16 v28, v12

    move-object/from16 v2, v16

    move/from16 v11, v35

    move-object/from16 v12, v36

    .line 6
    invoke-static {v1, v2}, Ll/ۘۘ;->ۖ۬ۘ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 675
    iget-object v3, v0, Ll/ۚۘۡ;->᩸:Landroid/animation/ObjectAnimator;

    const/4 v6, 0x0

    if-eqz v3, :cond_10

    const-string v16, "\u05a8\u06da"

    invoke-static/range {v16 .. v16}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v16

    add-int v16, v16, v31

    mul-int/lit8 v16, v16, -0x67

    xor-int v5, v16, v30

    mul-int/lit16 v5, v5, -0x1a8b

    const v33, -0x2d0d0809

    xor-int v5, v5, v33

    const v33, -0x7ea9b8f7

    xor-int v16, v16, v33

    move-object/from16 v19, v3

    move/from16 v35, v11

    move-object/from16 v36, v12

    move/from16 v12, v28

    move/from16 v3, v32

    move/from16 v32, v16

    move-object/from16 v16, v2

    move v2, v5

    const/4 v5, 0x1

    goto/16 :goto_0

    :cond_10
    move-object/from16 v19, v3

    const/4 v5, 0x1

    :goto_11
    const-string v3, "\u1a78\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v30

    mul-int/lit8 v3, v3, 0x69

    xor-int v0, v3, v31

    mul-int/lit16 v0, v0, -0x4671

    const v16, 0x9a72722

    xor-int v0, v0, v16

    const v16, 0x3fc6b3cf

    xor-int v3, v3, v16

    move-object/from16 v16, v2

    move/from16 v35, v11

    move-object/from16 v36, v12

    move/from16 v12, v28

    move v2, v0

    move-object/from16 v0, p0

    move/from16 v38, v32

    move/from16 v32, v3

    :goto_12
    move/from16 v3, v38

    goto/16 :goto_0

    :sswitch_18
    move/from16 v32, v3

    move/from16 v28, v12

    move/from16 v11, v35

    move-object/from16 v12, v36

    .line 0
    sget-object v0, Ll/ۚۘۡ;->ܿܰۘ:[S

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v11}, Ll/֡֡;->᩻ۛ۠([SIII)Ljava/lang/String;

    move-result-object v16

    .line 58
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v0

    if-gtz v0, :cond_11

    :goto_13
    const-string v0, "\u06e0\u06e2"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v31

    mul-int/lit8 v0, v0, 0x3

    xor-int v2, v0, v30

    mul-int/lit16 v2, v2, 0x3fe9

    const v3, 0x1121c3c5

    xor-int/2addr v2, v3

    const v3, 0x21d960de

    goto :goto_14

    :cond_11
    const-string v0, "\u06e0\u0733"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v31, v0

    mul-int/lit8 v0, v0, -0xf

    xor-int v2, v0, v30

    mul-int/lit16 v2, v2, -0x5813

    const v3, -0x46fdd21e

    xor-int/2addr v2, v3

    const v3, -0x3693299a

    :goto_14
    xor-int/2addr v0, v3

    goto/16 :goto_1a

    :sswitch_19
    move/from16 v32, v3

    move/from16 v28, v12

    move-object/from16 v2, v16

    move-object/from16 v12, v36

    const v0, 0xb923

    const v35, 0xb923

    goto :goto_15

    :sswitch_1a
    move/from16 v32, v3

    move/from16 v28, v12

    move-object/from16 v2, v16

    move-object/from16 v12, v36

    const/16 v0, 0x24cd

    const/16 v35, 0x24cd

    :goto_15
    const-string v0, "\u05a8\u05a1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v31

    mul-int/lit8 v0, v0, -0x15

    xor-int v3, v0, v30

    mul-int/lit16 v3, v3, 0x50c5

    const v11, -0x1572c91e

    xor-int/2addr v3, v11

    const v11, 0x49f6847a    # 2019471.2f

    xor-int/2addr v0, v11

    move-object/from16 v16, v2

    move v2, v3

    goto/16 :goto_1b

    :sswitch_1b
    move/from16 v32, v3

    move/from16 v28, v12

    move-object/from16 v2, v16

    move/from16 v11, v35

    move-object/from16 v12, v36

    add-int v0, v23, v26

    mul-int v0, v0, v0

    sub-int v0, v25, v0

    if-gtz v0, :cond_12

    const-string v0, "\u06e8\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v30

    xor-int v3, v0, v31

    mul-int/lit16 v3, v3, -0x4c2f

    const v16, -0x675b16b3

    xor-int v3, v3, v16

    const v16, 0x382a404e

    goto/16 :goto_19

    :cond_12
    const-string v0, "\u1a73\u06db"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v30

    mul-int/lit8 v0, v0, -0x67

    xor-int v3, v0, v31

    mul-int/lit16 v3, v3, 0x51ab

    const v16, 0x31e4d6cb

    xor-int v3, v3, v16

    const v16, -0x13f71a5

    goto/16 :goto_19

    :sswitch_1c
    move/from16 v32, v3

    move/from16 v28, v12

    move-object/from16 v2, v16

    move/from16 v11, v35

    move-object/from16 v12, v36

    add-int/lit8 v25, v24, 0x1

    const/16 v26, 0x1

    sget v0, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v0, :cond_13

    goto :goto_16

    :cond_13
    const-string v0, "\u06e1\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v31

    xor-int v3, v0, v30

    mul-int/lit16 v3, v3, 0x35ed

    const v16, -0x2a66f66

    xor-int v3, v3, v16

    const v16, 0x1936ee8d

    goto/16 :goto_19

    :sswitch_1d
    move/from16 v32, v3

    move/from16 v28, v12

    move-object/from16 v2, v16

    move/from16 v11, v35

    move-object/from16 v12, v36

    aget-short v23, v21, v22

    mul-int/lit8 v24, v23, 0x2

    .line 472
    sget v0, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v0, :cond_14

    :goto_16
    move-object/from16 v36, v12

    :goto_17
    const-string v0, "\u06e0\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v30

    xor-int v3, v0, v31

    mul-int/lit16 v3, v3, -0x3543

    const v12, 0x1186954b

    xor-int/2addr v3, v12

    const v12, -0x3a56737d

    xor-int/2addr v0, v12

    move-object/from16 v16, v2

    move v2, v3

    move/from16 v35, v11

    goto :goto_1c

    :cond_14
    const-string v0, "\u06eb\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v31

    xor-int v3, v0, v30

    mul-int/lit16 v3, v3, -0x6f45

    const v16, 0x20404176

    xor-int v3, v3, v16

    const v16, 0x2a02ab5b

    goto :goto_19

    :sswitch_1e
    move/from16 v32, v3

    move/from16 v28, v12

    move-object/from16 v2, v16

    move/from16 v11, v35

    move-object/from16 v12, v36

    sget-object v21, Ll/ۚۘۡ;->ܿܰۘ:[S

    const/16 v22, 0x0

    .line 473
    sget v0, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v0, :cond_15

    :goto_18
    const-string v0, "\u06e1\u06dc"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v31

    xor-int v3, v0, v30

    mul-int/lit16 v3, v3, 0x31fd

    const v16, 0x6369490d

    xor-int v3, v3, v16

    const v16, -0x35aab317

    goto :goto_19

    :cond_15
    const-string v0, "\u05a8\u06eb"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v30

    mul-int/lit8 v0, v0, 0x19

    xor-int v3, v0, v31

    mul-int/lit16 v3, v3, 0x4f17

    const v16, -0x4f52035d

    xor-int v3, v3, v16

    const v16, -0x2be299ff

    :goto_19
    xor-int v0, v0, v16

    move-object/from16 v16, v2

    move v2, v3

    :goto_1a
    move/from16 v35, v11

    :goto_1b
    move-object/from16 v36, v12

    :goto_1c
    move/from16 v12, v28

    move/from16 v3, v32

    move/from16 v32, v0

    move-object/from16 v0, p0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x78c68563 -> :sswitch_2
        -0x76cb4628 -> :sswitch_f
        -0x766b3ddd -> :sswitch_1e
        -0x75b458a2 -> :sswitch_4
        -0x755e1cc7 -> :sswitch_5
        -0x71d55f6a -> :sswitch_16
        -0x6343893a -> :sswitch_e
        -0x6189cb3b -> :sswitch_2
        -0x5bf62738 -> :sswitch_15
        -0x5b172bfc -> :sswitch_6
        -0x4ec6bb3f -> :sswitch_8
        -0x47af374b -> :sswitch_0
        -0x446b1559 -> :sswitch_8
        -0x3a19a3e9 -> :sswitch_9
        -0x310faf06 -> :sswitch_b
        -0x2765603e -> :sswitch_17
        -0x275b77a3 -> :sswitch_11
        -0x224b1f8b -> :sswitch_4
        -0x2136692c -> :sswitch_1a
        -0x203540f7 -> :sswitch_6
        -0x1fa02ee0 -> :sswitch_0
        -0x1cb0d9f3 -> :sswitch_12
        -0x1aeb12b2 -> :sswitch_19
        -0x19c1ea52 -> :sswitch_d
        -0x17f58a64 -> :sswitch_10
        -0x17cd0c54 -> :sswitch_7
        -0x14a5fdd9 -> :sswitch_a
        -0x10f3c01a -> :sswitch_12
        -0x10f2117d -> :sswitch_1d
        -0xe1dde26 -> :sswitch_d
        -0x5a4d5b4 -> :sswitch_5
        -0x4a34125 -> :sswitch_15
        -0x3a8e2a9 -> :sswitch_a
        -0x3e244e -> :sswitch_1b
        0x2cec767 -> :sswitch_9
        0x473fe33 -> :sswitch_19
        0x1a50b997 -> :sswitch_10
        0x234a7691 -> :sswitch_3
        0x2559653c -> :sswitch_14
        0x26635631 -> :sswitch_1e
        0x27fb17b2 -> :sswitch_11
        0x2911f84b -> :sswitch_13
        0x29d6b376 -> :sswitch_c
        0x2a9b6ffd -> :sswitch_17
        0x3075326d -> :sswitch_1
        0x3e38028c -> :sswitch_1c
        0x3e7b0084 -> :sswitch_14
        0x44aa73c6 -> :sswitch_16
        0x4af2e9a4 -> :sswitch_1a
        0x4d15969c -> :sswitch_1b
        0x4d2b3509 -> :sswitch_18
        0x50e91b60 -> :sswitch_18
        0x56e5508b -> :sswitch_3
        0x57fbf11f -> :sswitch_13
        0x585de299 -> :sswitch_1d
        0x6329839b -> :sswitch_7
        0x63c5872c -> :sswitch_f
        0x6410ba03 -> :sswitch_1
        0x666d955d -> :sswitch_e
        0x74ffcd65 -> :sswitch_b
        0x7b0ecd77 -> :sswitch_c
        0x7e21ff80 -> :sswitch_1c
    .end sparse-switch
.end method
