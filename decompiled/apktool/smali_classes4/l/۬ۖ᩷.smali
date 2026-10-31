.class public Ll/۬ۖ᩷;
.super Ll/۟᩸᩷;
.source "05NO"


# static fields
.field private static final ܶᩳ֨:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x27

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۬ۖ᩷;->ܶᩳ֨:[S

    return-void

    :array_0
    .array-data 2
        0x226fs
        -0x981s
        -0x733s
        -0x8d5s
        -0x72f7s
        -0x72bes
        -0x72b9s
        -0x72aes
        -0x72b9s
        -0x72f7s
        -0x72bes
        -0x72b9s
        -0x72aes
        -0x72b9s
        -0x72f7s
        -0x72bcs
        -0x72b1s
        -0x72b8s
        -0x72f8s
        -0x72b5s
        -0x72aes
        -0x72f8s
        -0x72aas
        -0x72b6s
        -0x72ads
        -0x72abs
        -0x72f7s
        -0x729es
        -0x729ds
        -0x729cs
        -0x728ds
        -0x729fs
        -0x72f8s
        -0x72b6s
        -0x72b7s
        -0x72bfs
        -0x1c83s
        -0x17a9s
        -0xcb3s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ll/۟᩸᩷;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 23

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

    const v16, 0x374d05bf

    sget v17, Ll/֨ۤ;->ܿۖ᩵:I

    sget v18, Ll/ۘۨ;->۫᩸۠:I

    const-string v19, "\u06e1\u1a73"

    invoke-static/range {v19 .. v19}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v17

    xor-int v1, v19, v18

    mul-int/lit16 v1, v1, 0x5b3

    const v20, 0x47c904b3

    xor-int v1, v1, v20

    const v20, 0x9b47e55

    xor-int v19, v19, v20

    move-object/from16 v21, v6

    const/16 v20, 0x0

    :goto_0
    xor-int v6, v16, v18

    mul-int/lit16 v6, v6, 0x2da1

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v1, v6

    xor-int v16, v19, v1

    sparse-switch v16, :sswitch_data_0

    move/from16 v19, v7

    move/from16 v22, v8

    xor-int v1, v4, v5

    .line 19
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setContentView(I)V

    goto/16 :goto_6

    .line 1
    :sswitch_0
    sget v1, Ll/᩹;->ۤܿܳ:I

    if-eqz v1, :cond_1

    :cond_0
    move/from16 v19, v7

    move/from16 v22, v8

    goto/16 :goto_f

    :cond_1
    const-string v1, "\u05a8\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x2541

    const v19, -0x6a06c005

    xor-int v6, v6, v19

    const v19, -0x2d055bf3

    goto/16 :goto_4

    .line 13
    :sswitch_1
    sget v1, Ll/֨ۤ;->ܿۖ᩵:I

    if-gez v1, :cond_2

    :goto_1
    move/from16 v19, v7

    move/from16 v22, v8

    goto/16 :goto_9

    :cond_2
    move/from16 v19, v7

    move/from16 v22, v8

    goto/16 :goto_7

    .line 8
    :sswitch_2
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    const-string v1, "\u06e0\u06e7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x17

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x1d33

    const v19, -0x3b587da

    xor-int v6, v6, v19

    const v19, 0x35e6d347

    goto :goto_4

    :sswitch_3
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    sget v1, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v1, :cond_4

    goto :goto_3

    :cond_4
    move/from16 v19, v7

    move/from16 v22, v8

    goto/16 :goto_e

    .line 6
    :sswitch_4
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v1, :cond_5

    goto :goto_1

    :cond_5
    :goto_2
    const-string v1, "\u06ec\u05a8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, 0x325d

    const v19, 0x19203350

    xor-int v6, v6, v19

    const v19, 0x97453ae

    goto :goto_4

    .line 8
    :sswitch_5
    sget v1, Ll/᩺;->ۙۛܶ:I

    if-gtz v1, :cond_6

    goto :goto_3

    :cond_6
    move/from16 v22, v8

    goto/16 :goto_c

    .line 21
    :sswitch_6
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 14
    :sswitch_7
    sget v1, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v1, :cond_7

    goto :goto_1

    :cond_7
    :goto_3
    const-string v1, "\u073f\u1a75"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x77

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x29cb

    const v19, 0x3a7e12b3

    xor-int v6, v6, v19

    const v19, -0x7db03da7

    :goto_4
    xor-int v19, v1, v19

    goto/16 :goto_12

    :sswitch_8
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    goto/16 :goto_1

    :sswitch_9
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    :sswitch_a
    return-void

    .line 24
    :sswitch_b
    :try_start_0
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static/range {v20 .. v20}, Ll/ܺۢ֡;->ܳ(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    sget-object v6, Ll/۬ۖ᩷;->ܶᩳ֨:[S
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move/from16 v19, v7

    const/16 v7, 0x24

    move/from16 v22, v8

    const/4 v8, 0x3

    :try_start_1
    invoke-static {v6, v7, v8, v13}, Ll/ۗ᩺;->۫ᩳ᩵([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    const v7, 0x7ea10f51

    xor-int/2addr v6, v7

    .line 25
    invoke-virtual {v0, v6}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    .line 26
    invoke-static {v6, v1}, Ll/֨ۤ;->᩹᩶ᩳ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    const-string v1, "\u073a\u1a73"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x5b

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, -0x173f

    const v7, -0x4ed3d2d6

    xor-int/2addr v6, v7

    const v7, -0x16e3420c

    goto/16 :goto_10

    :catch_0
    move/from16 v19, v7

    move/from16 v22, v8

    goto :goto_5

    :sswitch_c
    move/from16 v19, v7

    move/from16 v22, v8

    if-eqz v2, :cond_8

    const-string v1, "\u1a7b\u06db"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x33

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x12f9

    const v7, -0x1a5cf0d1

    xor-int/2addr v6, v7

    const v7, -0x587dadb0

    goto/16 :goto_10

    :sswitch_d
    const/4 v1, 0x0

    .line 31
    invoke-static {v1}, Ljava/lang/System;->exit(I)V

    return-void

    :sswitch_e
    move/from16 v19, v7

    move/from16 v22, v8

    .line 22
    :try_start_2
    new-instance v1, Ljava/io/File;

    sget-object v6, Ll/۬ۖ᩷;->ܶᩳ֨:[S

    const/4 v7, 0x4

    const/16 v8, 0x20

    invoke-static {v6, v7, v8, v13}, Ll/֨۫;->ۢܽ֨([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v1, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 23
    :try_start_3
    invoke-static {v1}, Ll/֫ۡ;->۬᩺֡(Ljava/lang/Object;)Z

    move-result v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    const-string v6, "\u06e4\u06e4"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int v6, v6, v17

    mul-int/lit8 v6, v6, -0x39

    xor-int v7, v6, v18

    mul-int/lit16 v7, v7, -0x5099

    const v8, -0x3b76e066

    xor-int/2addr v7, v8

    const v8, -0x1a1118a2

    xor-int/2addr v6, v8

    move-object/from16 v20, v1

    move v1, v7

    move/from16 v7, v19

    move/from16 v8, v22

    move/from16 v19, v6

    goto/16 :goto_0

    :catch_1
    move-object/from16 v20, v1

    goto :goto_5

    :catch_2
    const/16 v20, 0x0

    :catch_3
    :cond_8
    :goto_5
    const-string v1, "\u1a7a\u05a8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, 0x3b

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, -0x1835

    const v7, 0xb3e69de

    xor-int/2addr v6, v7

    const v7, -0x91766ef

    goto/16 :goto_10

    :goto_6
    const-string v1, "\u06d7\u06e2"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x61

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, -0x5fb3

    const v7, -0xbcbbe2

    xor-int/2addr v6, v7

    const v7, -0xe139dab

    goto/16 :goto_10

    :sswitch_f
    move/from16 v19, v7

    move/from16 v22, v8

    .line 18
    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    const v5, 0x7ed0cab9

    sget v1, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v1, :cond_9

    goto/16 :goto_9

    :cond_9
    const-string v1, "\u06e0\u06ec"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, 0x7511

    const v7, -0x5c91ed77

    xor-int/2addr v6, v7

    const v7, -0x2e7ce9bc

    goto/16 :goto_10

    :sswitch_10
    move/from16 v19, v7

    move/from16 v22, v8

    const/4 v1, 0x3

    invoke-static {v14, v15, v1, v13}, Ll/ۘ᩻;->ۙܺܶ([SIII)Ljava/lang/String;

    move-result-object v3

    sget v1, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v1, :cond_a

    goto/16 :goto_f

    :cond_a
    const-string v1, "\u1a78\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v6, v1, v18

    mul-int/lit8 v6, v6, -0x27

    const v7, -0x7c708f49

    xor-int/2addr v6, v7

    const v7, 0x19d55fdc

    goto/16 :goto_10

    :sswitch_11
    move/from16 v19, v7

    move/from16 v22, v8

    const/4 v15, 0x1

    .line 1
    sget v1, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v1, :cond_b

    :goto_7
    const-string v1, "\u0730\u06db"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x2d

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, 0x1069

    const v7, 0x2be4a46f

    xor-int/2addr v6, v7

    const v7, -0x2e6315bb

    goto/16 :goto_10

    :cond_b
    const-string v1, "\u06d9\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x55

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, -0x641

    const v7, -0x7412de3e

    xor-int/2addr v6, v7

    const v7, 0x9d3973d

    goto/16 :goto_10

    :sswitch_12
    move/from16 v19, v7

    move/from16 v22, v8

    .line 18
    invoke-super/range {p0 .. p1}, Ll/۟᩸᩷;->onCreate(Landroid/os/Bundle;)V

    sget-object v14, Ll/۬ۖ᩷;->ܶᩳ֨:[S

    sget v1, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v1, :cond_c

    goto/16 :goto_e

    :cond_c
    const-string v1, "\u1a76\u06eb"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x79

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x324d

    const v7, 0x3379af78

    xor-int/2addr v6, v7

    const v7, -0x3b934221

    goto/16 :goto_10

    :sswitch_13
    move/from16 v19, v7

    move/from16 v22, v8

    const/16 v1, 0x4e64

    const/16 v13, 0x4e64

    goto :goto_8

    :sswitch_14
    move/from16 v19, v7

    move/from16 v22, v8

    const v1, 0x8d26

    const v13, 0x8d26

    :goto_8
    const-string v1, "\u05ab\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x45

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, -0x1419

    const v7, 0x21852503

    xor-int/2addr v6, v7

    const v7, -0x2435a123

    goto/16 :goto_10

    :sswitch_15
    move/from16 v19, v7

    move/from16 v22, v8

    add-int v1, v11, v12

    sub-int v1, v10, v1

    if-gtz v1, :cond_d

    const-string v1, "\u06db\u06db"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x57

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, -0x943

    const v7, -0x4cf07fb9

    xor-int/2addr v6, v7

    const v7, 0x61002006

    goto/16 :goto_10

    :cond_d
    const-string v1, "\u06e8\u0736"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x27

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, 0x55fb

    const v7, -0x1a8a5d66

    xor-int/2addr v6, v7

    const v7, -0x2bc13349

    goto/16 :goto_10

    :sswitch_16
    move/from16 v19, v7

    move/from16 v22, v8

    const v12, 0xce22b44

    sget v1, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v1, :cond_e

    :goto_9
    const-string v1, "\u06e7\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x1b

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, 0x751d

    const v7, -0x3e0f3eee

    xor-int/2addr v6, v7

    const v7, 0x3036386d

    goto/16 :goto_10

    :cond_e
    const-string v1, "\u06e7\u06e1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, 0x6ee1

    const v7, -0x624ff832

    xor-int/2addr v6, v7

    const v7, 0x3be97716

    goto/16 :goto_10

    :sswitch_17
    move/from16 v19, v7

    move/from16 v22, v8

    mul-int v10, v22, v9

    mul-int v11, v22, v22

    sget v1, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v1, :cond_f

    move/from16 v8, v22

    goto :goto_a

    :cond_f
    const-string v1, "\u06da\u05a8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x5f

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x4ff1

    const v7, -0x7f0271bd

    xor-int/2addr v6, v7

    const v7, -0x77a3d402

    goto/16 :goto_10

    :sswitch_18
    move/from16 v19, v7

    aget-short v8, v21, v19

    const/16 v9, 0x72dc

    .line 1
    sget v1, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v1, :cond_10

    :goto_a
    const-string v1, "\u06e0\u0733"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x55

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, -0x5383

    const v7, 0xce4404d

    xor-int/2addr v6, v7

    const v7, -0x7c7a0c61

    goto :goto_b

    :cond_10
    const-string v1, "\u06e0\u06e1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0xb

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x23e1

    const v7, 0x3795935d

    xor-int/2addr v6, v7

    const v7, -0x4e4244e

    :goto_b
    xor-int/2addr v1, v7

    move/from16 v7, v19

    goto/16 :goto_11

    :sswitch_19
    move/from16 v22, v8

    const/4 v7, 0x0

    .line 30
    sget v1, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v1, :cond_11

    :goto_c
    const-string v1, "\u06e0\u1a79"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x59

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, -0x4429

    const v8, 0x419de0c9

    xor-int/2addr v6, v8

    const v8, -0x7e63542d

    goto :goto_d

    :cond_11
    const-string v1, "\u073a\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x13

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, 0x2bab

    const v8, 0x7433e3cb

    xor-int/2addr v6, v8

    const v8, 0x18b52b9d

    :goto_d
    xor-int v19, v1, v8

    move v1, v6

    move/from16 v8, v22

    goto/16 :goto_0

    :sswitch_1a
    move/from16 v19, v7

    move/from16 v22, v8

    sget-object v21, Ll/۬ۖ᩷;->ܶᩳ֨:[S

    .line 23
    sget v1, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v1, :cond_12

    :goto_e
    const-string v1, "\u06e1\u06e8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, 0x1b97

    const v7, 0x3bcf82ab

    xor-int/2addr v6, v7

    const v7, 0x4f0456f1

    goto :goto_10

    :cond_12
    const-string v1, "\u0736\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v6, v1, v17

    mul-int/lit16 v6, v6, 0x628d

    const v7, -0x6c6aff5d

    xor-int/2addr v6, v7

    const v7, 0x62590326    # 1.0007926E21f

    goto :goto_10

    :sswitch_1b
    move/from16 v19, v7

    move/from16 v22, v8

    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v1

    if-eqz v1, :cond_13

    :goto_f
    const-string v1, "\u06e4\u1a73"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x23

    xor-int v6, v1, v18

    mul-int/lit16 v6, v6, -0x7cab

    const v7, 0x4d4d9beb    # 2.1559672E8f

    xor-int/2addr v6, v7

    const v7, -0x6e69797f

    goto :goto_10

    :cond_13
    const-string v1, "\u0733\u1a76"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v6, v1, v18

    mul-int/lit8 v6, v6, 0x79

    const v7, -0x3a83d82e

    xor-int/2addr v6, v7

    const v7, 0x2e00ff32

    :goto_10
    xor-int/2addr v1, v7

    move/from16 v7, v19

    move/from16 v8, v22

    :goto_11
    move/from16 v19, v1

    :goto_12
    move v1, v6

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fc2a45b -> :sswitch_3
        -0x7c4fa491 -> :sswitch_0
        -0x7b452333 -> :sswitch_19
        -0x7b336b72 -> :sswitch_1b
        -0x740a55c9 -> :sswitch_1b
        -0x730aba62 -> :sswitch_f
        -0x6b519e23 -> :sswitch_f
        -0x6a3a6174 -> :sswitch_9
        -0x5c87fc08 -> :sswitch_1a
        -0x478afafb -> :sswitch_2
        -0x4551a8b3 -> :sswitch_1a
        -0x4170f952 -> :sswitch_8
        -0x3fd63f43 -> :sswitch_18
        -0x3d837041 -> :sswitch_4
        -0x3cb1f6b8 -> :sswitch_d
        -0x3ca37696 -> :sswitch_b
        -0x3ac7a531 -> :sswitch_6
        -0x3a5b4149 -> :sswitch_18
        -0x39e0f58d -> :sswitch_7
        -0x38a1d950 -> :sswitch_13
        -0x36807923 -> :sswitch_c
        -0x2a37eaa3 -> :sswitch_0
        -0x24b0710f -> :sswitch_15
        -0x22f57227 -> :sswitch_15
        -0x21154589 -> :sswitch_a
        -0x1b2cc4a5 -> :sswitch_11
        -0x149b3aa6 -> :sswitch_17
        -0x10d58bc4 -> :sswitch_17
        -0x10685679 -> :sswitch_5
        -0x8793929 -> :sswitch_16
        -0x6ad3e0c -> :sswitch_19
        -0x41c1870 -> :sswitch_a
        -0x320396e -> :sswitch_e
        0x56ad3e3 -> :sswitch_1
        0x77db75c -> :sswitch_13
        0x139efd86 -> :sswitch_d
        0x15413ab9 -> :sswitch_4
        0x169209be -> :sswitch_11
        0x1f63102c -> :sswitch_12
        0x336350a8 -> :sswitch_10
        0x3d3a0f2b -> :sswitch_8
        0x3dbbf1f6 -> :sswitch_9
        0x4dea3bbb -> :sswitch_2
        0x4e418b07 -> :sswitch_12
        0x59a5622b -> :sswitch_7
        0x5f821720 -> :sswitch_1
        0x5f9682a1 -> :sswitch_10
        0x62649fe8 -> :sswitch_16
        0x65fb5441 -> :sswitch_c
        0x6b209d81 -> :sswitch_e
        0x71efbc7c -> :sswitch_14
        0x75144449 -> :sswitch_14
        0x77f0d605 -> :sswitch_b
        0x7931a097 -> :sswitch_5
        0x7c6bf5b6 -> :sswitch_3
        0x7e087f45 -> :sswitch_6
    .end sparse-switch
.end method
