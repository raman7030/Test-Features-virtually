.class public final Ll/ᩴ֡ۡ;
.super Ljava/lang/Object;
.source "44LP"


# static fields
.field private static final ۧܶۛ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x60

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩴ֡ۡ;->ۧܶۛ:[S

    return-void

    :array_0
    .array-data 2
        0x8aes
        -0x4e38s
        0x5814s
        -0x4df7s
        -0x2d7bs
        -0x2d5as
        -0x2d77s
        -0x2d62s
        -0x2d56s
        -0x2d63s
        -0x2d64s
        -0x2d64s
        -0x2d79s
        -0x2d7as
        -0x2d42s
        -0x2d7fs
        -0x2d73s
        -0x2d61s
        -0x2d7as
        -0x2d63s
        -0x2d7cs
        -0x2d7cs
        -0x2d38s
        -0x2d75s
        -0x2d77s
        -0x2d7as
        -0x2d7as
        -0x2d79s
        -0x2d64s
        -0x2d38s
        -0x2d76s
        -0x2d73s
        -0x2d38s
        -0x2d75s
        -0x2d77s
        -0x2d65s
        -0x2d64s
        -0x2d38s
        -0x2d64s
        -0x2d79s
        -0x2d38s
        -0x2d7as
        -0x2d79s
        -0x2d7as
        -0x2d3bs
        -0x2d7as
        -0x2d63s
        -0x2d7cs
        -0x2d7cs
        -0x2d38s
        -0x2d64s
        -0x2d6fs
        -0x2d68s
        -0x2d73s
        -0x2d38s
        -0x2d77s
        -0x2d7as
        -0x2d74s
        -0x2d66s
        -0x2d79s
        -0x2d7fs
        -0x2d74s
        -0x2d3as
        -0x2d62s
        -0x2d7fs
        -0x2d73s
        -0x2d61s
        -0x2d3as
        -0x2d42s
        -0x2d7fs
        -0x2d73s
        -0x2d61s
        -0x2d66s
        -0x2d79s
        -0x2d64s
        -0x2d77s
        -0x2d64s
        -0x2d7fs
        -0x2d79s
        -0x2d7as
        -0x2d65s
        -0x2d73s
        -0x2d64s
        -0x2d54s
        -0x2d63s
        -0x2d66s
        -0x2d77s
        -0x2d64s
        -0x2d7fs
        -0x2d79s
        -0x2d7as
        -0x2d40s
        -0x2d3as
        -0x2d3as
        -0x2d3as
        -0x2d3fs
    .end array-data
.end method

.method public static final ֫(Ll/ۗܺ᩷;)V
    .locals 27

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

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const v19, 0x5d5a872d

    sget v20, Ll/ۖ;->᩹۟ۘ:I

    sget v21, Ll/֨۬;->۫ۙ᩺:I

    const-string v22, "\u05ab\u1a7a"

    invoke-static/range {v22 .. v22}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v22

    xor-int v22, v22, v20

    mul-int/lit8 v22, v22, -0x31

    xor-int v0, v22, v21

    mul-int/lit16 v0, v0, -0x1429

    const v24, 0x4a9ba1d3    # 5099753.5f

    xor-int v0, v0, v24

    const v24, -0xcae8b52

    xor-int v22, v22, v24

    move-object v5, v4

    move-object v12, v11

    move-object v14, v13

    move-object/from16 v7, v16

    move/from16 v23, v22

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v22, 0x5d5a872d

    const/16 v24, 0x0

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v10, v22, v21

    mul-int/lit16 v10, v10, 0x71cb

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v0, v10

    xor-int v22, v23, v0

    sparse-switch v22, :sswitch_data_0

    .line 245
    sget v0, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v0, :cond_4

    :cond_0
    :goto_1
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move/from16 v0, v16

    move-object/from16 v2, p0

    goto/16 :goto_d

    :sswitch_0
    sget v0, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v0, :cond_1

    goto :goto_2

    :cond_1
    const-string v0, "\u06eb\u05ab"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v10, v0, v21

    mul-int/lit16 v10, v10, -0x3eab

    const v23, -0x3f0511fb

    xor-int v10, v10, v23

    const v23, -0x529f299e

    goto/16 :goto_5

    .line 248
    :sswitch_1
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    sget v0, Ll/᩺;->ۙۛܶ:I

    if-lez v0, :cond_2

    goto :goto_3

    :cond_2
    const-string v0, "\u05a8\u06e7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v21, v0

    mul-int/lit8 v0, v0, 0x47

    xor-int v10, v0, v20

    mul-int/lit16 v10, v10, 0x7257

    const v23, -0x407e192e

    xor-int v10, v10, v23

    const v23, -0x2237a96d

    goto/16 :goto_5

    .line 29
    :sswitch_2
    sget v0, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v0, :cond_3

    goto :goto_4

    :cond_3
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v2, p0

    goto/16 :goto_b

    .line 291
    :sswitch_3
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    sget v0, Ll/֫ۧ;->ۙ۟ۧ:I

    if-lez v0, :cond_6

    goto :goto_3

    :cond_4
    :goto_2
    const-string v0, "\u06ec\u05a1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v10, v0, v21

    mul-int/lit16 v10, v10, -0x51b9

    const v23, -0x4e5756fa

    xor-int v10, v10, v23

    const v23, 0x60bcc92a

    goto/16 :goto_5

    .line 71
    :sswitch_4
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_4

    .line 29
    :sswitch_5
    sget v0, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-lez v0, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    const-string v0, "\u06e0\u0730"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v10, v0, v20

    mul-int/lit16 v10, v10, -0x4831

    const v23, 0x2486b600

    xor-int v10, v10, v23

    const v23, 0x63b4726c

    goto/16 :goto_5

    :sswitch_6
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    :goto_4
    const-string v0, "\u06eb\u1a73"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v20

    mul-int/lit8 v0, v0, -0xf

    xor-int v10, v0, v21

    mul-int/lit16 v10, v10, 0x655

    const v23, 0x7eea7749

    xor-int v10, v10, v23

    const v23, 0x641044f

    goto :goto_5

    .line 30
    :sswitch_7
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    return-void

    .line 308
    :sswitch_8
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v4, v0}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 309
    invoke-static {v4}, Ll/᩺;->֨ܿ᩹(Ljava/lang/Object;)V

    move-object v10, v2

    move-object/from16 v23, v3

    goto/16 :goto_8

    .line 307
    :sswitch_9
    invoke-static {v7, v8, v9, v11}, Ll/ۘܿ;->ۢۙۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Ll/ۘ᩶;->ᩴۗᩴ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Ll/᩹;->ۤܿܳ:I

    if-eqz v0, :cond_7

    :cond_6
    const-string v0, "\u06dc\u073f"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    mul-int/lit8 v0, v0, 0x35

    xor-int v10, v0, v21

    mul-int/lit16 v10, v10, 0x261d

    const v23, -0x272bf2fb

    xor-int v10, v10, v23

    const v23, -0x6ccc5844

    goto :goto_5

    :cond_7
    const-string v0, "\u06e1\u05ab"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x75

    xor-int v10, v0, v21

    mul-int/lit16 v10, v10, 0x74dd

    const v23, 0x481aee7f

    xor-int v10, v10, v23

    const v23, -0x27f08082

    goto :goto_5

    :sswitch_a
    sget-object v7, Ll/ᩴ֡ۡ;->ۧܶۛ:[S

    const/16 v8, 0x50

    const/16 v9, 0x10

    sget v0, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v0, :cond_8

    goto/16 :goto_1

    :cond_8
    const-string v0, "\u073f\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x13

    xor-int v10, v0, v20

    mul-int/lit16 v10, v10, 0x132f

    const v23, 0x319c7fb9

    xor-int v10, v10, v23

    const v23, -0x36d90529

    :goto_5
    xor-int v23, v0, v23

    move v0, v10

    goto/16 :goto_0

    .line 306
    :sswitch_b
    invoke-static {v14, v15, v6, v11}, Ll/ۘۨ;->ۖܿۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v3}, Ll/ۛ;->ܳۤۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/animation/ObjectAnimator;

    move-result-object v0

    move-object v10, v2

    move-object/from16 v23, v3

    const-wide/16 v2, 0x3e8

    .line 307
    invoke-static {v0, v2, v3}, Ll/֫ۡ;->ۢܰܶ(Ljava/lang/Object;J)Landroid/animation/ObjectAnimator;

    move-result-object v4

    .line 256
    sget v0, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v0, :cond_9

    move-object/from16 v2, p0

    move-object/from16 v3, v23

    goto/16 :goto_e

    :cond_9
    const-string v0, "\u06e2\u1a75"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v21, v0

    mul-int/lit8 v0, v0, -0x5f

    xor-int v2, v0, v20

    mul-int/lit16 v2, v2, -0x23e3

    const v3, -0x28a07143

    xor-int/2addr v2, v3

    const v3, 0x6fbe8784

    goto :goto_6

    :sswitch_c
    move-object v10, v2

    move-object/from16 v23, v3

    const/16 v15, 0x48

    const/16 v6, 0x8

    .line 108
    sget v0, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v0, :cond_a

    move-object/from16 v2, p0

    move-object/from16 v25, v4

    goto/16 :goto_b

    :cond_a
    const-string v0, "\u06e8\u06e2"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v2, v0, v21

    mul-int/lit16 v2, v2, -0x1901

    const v3, -0x620cb1ef

    xor-int/2addr v2, v3

    const v3, -0x16885af9

    :goto_6
    xor-int/2addr v0, v3

    move-object/from16 v3, v23

    move/from16 v23, v0

    goto :goto_7

    :sswitch_d
    move-object v10, v2

    const/16 v0, 0xd

    new-array v3, v0, [F

    .line 306
    fill-array-data v3, :array_0

    sget-object v14, Ll/ᩴ֡ۡ;->ۧܶۛ:[S

    .line 40
    sget v0, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v0, :cond_b

    move-object/from16 v2, p0

    goto/16 :goto_e

    :cond_b
    const-string v0, "\u06d6\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v21, v0

    mul-int/lit8 v0, v0, -0x5

    xor-int v2, v0, v20

    mul-int/lit16 v2, v2, -0x1a23

    const v23, -0x3d896100

    xor-int v2, v2, v23

    const v23, -0x1f677cf3

    xor-int v23, v0, v23

    :goto_7
    move v0, v2

    move-object v2, v10

    goto/16 :goto_0

    :sswitch_e
    move-object v10, v2

    move-object/from16 v23, v3

    .line 299
    :try_start_0
    const-class v0, Ll/ۢᩴ;

    sget-object v2, Ll/ᩴ֡ۡ;->ۧܶۛ:[S
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v3, 0x4

    move-object/from16 v25, v4

    const/16 v4, 0xe

    :try_start_1
    invoke-static {v2, v3, v4, v11}, Ll/ۘۨ;->ۖܿۤ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v2, 0x1

    .line 300
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 301
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Ll/ᩴ֡ۡ;->ۧܶۛ:[S

    const/16 v3, 0x12

    const/16 v4, 0x36

    invoke-static {v2, v3, v4, v11}, Ll/ۘ᩻;->ۙܺܶ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const-string v2, "\u06e2\u1a7b"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v20

    xor-int v3, v2, v21

    mul-int/lit16 v3, v3, 0x2787

    const v4, 0x597919af

    xor-int/2addr v3, v4

    const v4, -0x3a3fd085

    xor-int/2addr v2, v4

    move-object/from16 v4, v25

    move/from16 v26, v2

    move-object v2, v0

    move v0, v3

    move-object/from16 v3, v23

    move/from16 v23, v26

    goto/16 :goto_0

    :catch_0
    :goto_8
    move-object/from16 v25, v4

    :catch_1
    move-object/from16 v2, p0

    goto :goto_9

    :sswitch_f
    return-void

    :sswitch_10
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    .line 2
    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7e8f51f6

    xor-int/2addr v0, v1

    move-object/from16 v2, p0

    .line 295
    invoke-virtual {v2, v0}, Ll/֨ܿ;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/ۢᩴ;

    if-eqz v1, :cond_c

    const-string v0, "\u06d7\u06d7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v20

    mul-int/lit8 v0, v0, 0x1f

    xor-int v3, v0, v21

    mul-int/lit16 v3, v3, 0x5535

    const v4, -0x64448e13

    xor-int/2addr v3, v4

    const v4, -0x3915595

    goto/16 :goto_f

    :cond_c
    :goto_9
    const-string v0, "\u1a78\u1a73"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v21, v0

    mul-int/lit8 v0, v0, -0x4b

    xor-int v3, v0, v20

    mul-int/lit16 v3, v3, 0x23ad

    const v4, 0x4051c710

    xor-int/2addr v3, v4

    const v4, -0x17ad6dbd

    goto/16 :goto_f

    :sswitch_11
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v2, p0

    const/4 v0, 0x3

    .line 2
    invoke-static {v12, v13, v0, v11}, Ll/֨۫;->ۢܽ֨([SIII)Ljava/lang/String;

    move-result-object v5

    .line 130
    sget v0, Ll/᩹;->ۤܿܳ:I

    if-eqz v0, :cond_d

    :goto_a
    move-object/from16 v3, v23

    move-object/from16 v4, v25

    goto/16 :goto_e

    :cond_d
    const-string v0, "\u073d\u0730"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x59

    xor-int v3, v0, v20

    mul-int/lit16 v3, v3, 0x171f

    const v4, -0x3193efac

    xor-int/2addr v3, v4

    const v4, -0x3791cfee

    goto/16 :goto_f

    :sswitch_12
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v2, p0

    .line 2
    sget v0, Ll/֡֡ۡ;->۫:I

    sget-object v12, Ll/ᩴ֡ۡ;->ۧܶۛ:[S

    const/4 v13, 0x1

    .line 152
    sget-boolean v0, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v0, :cond_e

    :goto_b
    const-string v0, "\u06e4\u06e2"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v3, v0, v20

    mul-int/lit16 v3, v3, -0x40f7

    const v4, 0xba3e988

    xor-int/2addr v3, v4

    const v4, -0xd85186f

    goto/16 :goto_f

    :cond_e
    const-string v0, "\u1a73\u0733"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    mul-int/lit8 v0, v0, 0x29

    xor-int v3, v0, v21

    mul-int/lit16 v3, v3, -0x249d

    const v4, 0x7ee244fb

    xor-int/2addr v3, v4

    const v4, 0x3ded7a44

    goto/16 :goto_f

    :sswitch_13
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v2, p0

    const/16 v0, 0x67e6

    const/16 v11, 0x67e6

    goto :goto_c

    :sswitch_14
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v2, p0

    const v0, 0xd2e8

    const v11, 0xd2e8

    :goto_c
    const-string v0, "\u06d6\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x69

    xor-int v3, v0, v20

    mul-int/lit16 v3, v3, 0x63d9

    const v4, -0x1c0a8b8a

    xor-int/2addr v3, v4

    const v4, -0x73aac8c6

    goto/16 :goto_f

    :sswitch_15
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v2, p0

    add-int v0, v19, v24

    add-int/2addr v0, v0

    sub-int v0, v18, v0

    if-gtz v0, :cond_f

    const-string v0, "\u1a74\u06eb"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v21, v0

    mul-int/lit8 v0, v0, 0x4b

    xor-int v3, v0, v20

    mul-int/lit16 v3, v3, 0xaf5

    const v4, -0x2637b9c

    xor-int/2addr v3, v4

    const v4, 0x45a4a1f7

    goto/16 :goto_f

    :cond_f
    const-string v0, "\u1a73\u06e8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    mul-int/lit8 v0, v0, 0x29

    xor-int v3, v0, v21

    mul-int/lit16 v3, v3, -0x5733

    const v4, -0x1c9721c3

    xor-int/2addr v3, v4

    const v4, -0xab7ec15

    goto/16 :goto_f

    :sswitch_16
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v2, p0

    mul-int v18, v17, v17

    mul-int v19, v16, v16

    const v24, 0x4a57109

    .line 126
    sget-boolean v0, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v0, :cond_10

    move/from16 v0, v16

    goto :goto_d

    :cond_10
    const-string v0, "\u0733\u05a1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    xor-int v3, v0, v21

    mul-int/lit16 v3, v3, -0x64e9

    const v4, -0x365c5f2c

    xor-int/2addr v3, v4

    const v4, 0x2e250842

    goto/16 :goto_f

    :sswitch_17
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v2, p0

    move/from16 v0, v16

    add-int/lit16 v3, v0, 0x227d

    .line 26
    sget v4, Ll/ۛ;->᩺᩻֫:I

    if-ltz v4, :cond_11

    move/from16 v17, v3

    :goto_d
    const-string v3, "\u06dc\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v21, v3

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v20

    mul-int/lit16 v4, v4, 0x285

    const v16, -0x19965436

    xor-int v4, v4, v16

    const v16, 0xc9eb08e

    xor-int v3, v3, v16

    move/from16 v16, v0

    move v0, v4

    move-object v2, v10

    move-object/from16 v4, v25

    move-object/from16 v26, v23

    move/from16 v23, v3

    goto/16 :goto_10

    :cond_11
    const-string v4, "\u06eb\u06e1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v20

    move/from16 v16, v0

    xor-int v0, v4, v21

    mul-int/lit16 v0, v0, 0x5c35

    const v17, -0x541abc91

    xor-int v0, v0, v17

    const v17, -0x36712e24    # -1169979.5f

    xor-int v4, v4, v17

    move/from16 v17, v3

    move-object v2, v10

    move-object/from16 v3, v23

    move/from16 v23, v4

    move-object/from16 v4, v25

    goto/16 :goto_0

    :sswitch_18
    move-object v10, v2

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move-object/from16 v2, p0

    sget-object v0, Ll/ᩴ֡ۡ;->ۧܶۛ:[S

    const/4 v3, 0x0

    aget-short v16, v0, v3

    .line 14
    sget v0, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v0, :cond_12

    goto/16 :goto_a

    :goto_e
    const-string v0, "\u06e7\u06d6"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v20

    mul-int/lit8 v0, v0, -0x3

    xor-int v23, v0, v21

    mul-int/lit8 v23, v23, 0x33

    const v25, 0x59ecd038

    xor-int v23, v23, v25

    const v25, 0xda6fd38    # 1.02915E-30f

    xor-int v0, v0, v25

    move-object v2, v10

    move/from16 v26, v23

    move/from16 v23, v0

    move/from16 v0, v26

    goto/16 :goto_0

    :cond_12
    const-string v0, "\u06ec\u1a76"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v3, v0, v20

    mul-int/lit16 v3, v3, -0x6f65

    const v4, -0x39a21ca8

    xor-int/2addr v3, v4

    const v4, 0x3b02a7fc

    :goto_f
    xor-int/2addr v0, v4

    move-object v2, v10

    move-object/from16 v4, v25

    move-object/from16 v26, v23

    move/from16 v23, v0

    move v0, v3

    :goto_10
    move-object/from16 v3, v26

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e5c3594 -> :sswitch_2
        -0x716b5dc6 -> :sswitch_13
        -0x6ad21317 -> :sswitch_18
        -0x63a3e555 -> :sswitch_c
        -0x52dd062a -> :sswitch_5
        -0x52042c2f -> :sswitch_e
        -0x471b646f -> :sswitch_a
        -0x461566c7 -> :sswitch_4
        -0x43742825 -> :sswitch_16
        -0x4361c315 -> :sswitch_a
        -0x4155c5ae -> :sswitch_0
        -0x3e5fcfb1 -> :sswitch_10
        -0x2b384836 -> :sswitch_12
        -0x268ff87e -> :sswitch_4
        -0x1e4624aa -> :sswitch_6
        -0x153f6462 -> :sswitch_15
        -0x13373b96 -> :sswitch_5
        -0xd291e80 -> :sswitch_12
        -0xca8ca4e -> :sswitch_11
        -0x92790d6 -> :sswitch_d
        -0x88c9f56 -> :sswitch_15
        -0x885b017 -> :sswitch_f
        -0x72bd002 -> :sswitch_10
        -0x501c3d9 -> :sswitch_3
        0x1771a6a -> :sswitch_17
        0x97451bf -> :sswitch_3
        0x9dba5a6 -> :sswitch_e
        0xe7e0f26 -> :sswitch_b
        0x1003a876 -> :sswitch_7
        0x10d880ac -> :sswitch_16
        0x12010b23 -> :sswitch_18
        0x1c964c84 -> :sswitch_d
        0x241188b3 -> :sswitch_11
        0x3021f5db -> :sswitch_b
        0x3386513e -> :sswitch_17
        0x35e89c4b -> :sswitch_c
        0x3818a0cc -> :sswitch_14
        0x38780a69 -> :sswitch_14
        0x3b0aec06 -> :sswitch_9
        0x3bf25f00 -> :sswitch_13
        0x459ea861 -> :sswitch_7
        0x47637701 -> :sswitch_2
        0x53f71d07 -> :sswitch_1
        0x68fa5fc8 -> :sswitch_9
        0x6a1b49b2 -> :sswitch_f
        0x6b30a9f4 -> :sswitch_6
        0x73852bba -> :sswitch_8
        0x74368664 -> :sswitch_1
        0x7b60e499 -> :sswitch_8
        0x7e5bf07d -> :sswitch_0
    .end sparse-switch

    :array_0
    .array-data 4
        0x0
        -0x3da40000    # -55.0f
        0x0
        0x425c0000    # 55.0f
        0x0
        -0x3dcc0000    # -45.0f
        0x0
        0x42340000    # 45.0f
        0x0
        -0x3df40000    # -35.0f
        0x0
        0x420c0000    # 35.0f
        0x0
    .end array-data
.end method
