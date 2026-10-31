.class public Ll/ܺ᩹᩷;
.super Ll/۟᩸᩷;
.source "71RQ"

# interfaces
.implements Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;


# static fields
.field private static final ᩷۫ܽ:[S

.field public static ᩹:Ljava/lang/ref/WeakReference;


# instance fields
.field public ᩸:Lcom/tencent/mm/opensdk/openapi/IWXAPI;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2b

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܺ᩹᩷;->᩷۫ܽ:[S

    return-void

    :array_0
    .array-data 2
        0xc27s
        0x21bs
        0x219s
        0x216s
        0x219s
        0x20as
        0x201s
        0x20fs
        0x200s
        0x21ds
        0x24ds
        0x24ds
        0x249s
        0x24as
        0x24bs
        0x241s
        0x24as
        0x21bs
        0x24es
        0x21cs
        0x240s
        0x248s
        0x24as
        0x24ds
        0x241s
        0x20fs
        0x200s
        0x21ds
        0x21as
        0x21bs
        0x24bs
        0x21es
        0x21as
        0x21as
        0x24fs
        0x24fs
        0x24cs
        0x249s
        0x21bs
        0x249s
        0x24es
        0x21bs
        0x21ds
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ll/۟᩸᩷;-><init>()V

    return-void
.end method

.method public static ֫(Ll/ۡ᩹᩷;)V
    .locals 1

    .line 53
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Ll/ܺ᩹᩷;->᩹:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 20

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

    const v14, 0x32a78f71

    sget v15, Ll/ۛ;->᩺᩻֫:I

    sget v16, Ll/ۖ۫;->ۖ֫ܿ:I

    const-string v17, "\u06e4\u05a8"

    invoke-static/range {v17 .. v17}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v15

    xor-int v1, v17, v16

    mul-int/lit16 v1, v1, 0x48f3

    const v19, -0x5f78ce5b

    xor-int v1, v1, v19

    const v19, 0x38bb83b9

    xor-int v17, v17, v19

    move-object/from16 v19, v3

    move-object v13, v12

    move/from16 v18, v17

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const v17, 0x32a78f71

    move-object v3, v2

    const/4 v2, 0x0

    :goto_0
    xor-int v4, v17, v16

    mul-int/lit16 v4, v4, -0x48f

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v1, v4

    xor-int v17, v18, v1

    sparse-switch v17, :sswitch_data_0

    .line 25
    invoke-super/range {p0 .. p1}, Ll/۟᩸᩷;->onCreate(Landroid/os/Bundle;)V

    .line 26
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 10
    sget v1, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v1, :cond_3

    goto/16 :goto_4

    .line 17
    :sswitch_0
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v1

    if-gez v1, :cond_7

    goto/16 :goto_3

    .line 12
    :sswitch_1
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    sget-boolean v1, Ll/ۖۘ;->ۚܶۖ:Z

    if-nez v1, :cond_5

    goto/16 :goto_7

    .line 14
    :sswitch_2
    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-gez v1, :cond_d

    goto/16 :goto_6

    .line 16
    :sswitch_3
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    goto/16 :goto_6

    :sswitch_4
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    return-void

    .line 26
    :sswitch_5
    invoke-static {v0, v3}, Lcom/tencent/mm/opensdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    move-result-object v1

    iput-object v1, v0, Ll/ܺ᩹᩷;->᩸:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 27
    invoke-static/range {p0 .. p0}, Ll/֫᩺;->ۙܽܰ(Ljava/lang/Object;)Landroid/content/Intent;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->handleIntent(Landroid/content/Intent;Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;)Z

    return-void

    .line 26
    :sswitch_6
    sget-object v1, Ll/ܺ᩹᩷;->᩷۫ܽ:[S

    const/16 v3, 0x19

    const/16 v4, 0x12

    invoke-static {v1, v3, v4, v12}, Ll/֡ܶ;->ܽ᩻᩵([SIII)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :sswitch_7
    sget-object v1, Ll/ܺ᩹᩷;->᩷۫ܽ:[S

    const/4 v3, 0x7

    const/16 v4, 0x12

    invoke-static {v1, v3, v4, v12}, Ll/ۗۚ;->ۙ۟ܺ([SIII)Ljava/lang/String;

    move-result-object v1

    :goto_1
    move-object v3, v1

    const-string v1, "\u1a76\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x6379

    const v18, -0x3ca0a427

    xor-int v4, v4, v18

    const v18, 0x399ffc36

    goto/16 :goto_8

    :sswitch_8
    const/4 v1, 0x6

    invoke-static {v13, v14, v1, v12}, Ll/֨۬;->֨ۧ۟([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Ll/֡֡;->۫ۢᩳ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "\u06eb\u1a7a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x4229

    const v18, 0x3fe9ce2

    xor-int v4, v4, v18

    const v18, 0x4433867e

    goto/16 :goto_8

    :cond_0
    const-string v1, "\u06db\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x2d

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x618d

    const v18, -0x787dd18f

    xor-int v4, v4, v18

    const v18, 0x60276760

    goto/16 :goto_8

    :sswitch_9
    const/4 v14, 0x1

    .line 12
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v1

    if-nez v1, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v1, "\u1a7b\u1a76"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x4cc7

    const v18, 0x1d431f3d

    xor-int v4, v4, v18

    const v18, 0x3d7899b9

    goto/16 :goto_8

    .line 26
    :sswitch_a
    sget-object v13, Ll/ܺ᩹᩷;->᩷۫ܽ:[S

    .line 9
    sget-boolean v1, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v1, :cond_2

    goto/16 :goto_6

    :cond_2
    const-string v1, "\u1a78\u1a75"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x55

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x1379

    const v18, 0x2a43b530

    xor-int v4, v4, v18

    const v18, -0x1e8b94ce

    goto/16 :goto_8

    :cond_3
    const-string v1, "\u06d9\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x6bb9

    const v18, 0x76c31c10

    xor-int v4, v4, v18

    const v18, 0x70955aa

    goto/16 :goto_8

    :sswitch_b
    const/16 v1, 0x66bb

    const/16 v12, 0x66bb

    goto :goto_2

    :sswitch_c
    const/16 v1, 0x278

    const/16 v12, 0x278

    :goto_2
    const-string v1, "\u06e2\u073d"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x3

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x73a5

    const v18, -0x75b8cc6c

    xor-int v4, v4, v18

    const v18, 0x3577a41d

    goto/16 :goto_8

    :sswitch_d
    add-int v1, v10, v11

    add-int/2addr v1, v1

    sub-int v1, v9, v1

    if-gtz v1, :cond_4

    const-string v1, "\u06dc\u1a73"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x43

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x4b45

    const v18, -0x2e736d3e

    xor-int v4, v4, v18

    const v18, 0x186d84b7

    goto/16 :goto_8

    :cond_4
    const-string v1, "\u1a7a\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x2885

    const v18, 0x3b82575f

    xor-int v4, v4, v18

    const v18, -0x405f6336

    goto/16 :goto_8

    :sswitch_e
    const/16 v11, 0x3a24

    .line 14
    sget v1, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v1, :cond_6

    :cond_5
    :goto_3
    const-string v1, "\u06eb\u06df"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0xae7

    const v18, 0x71607852

    xor-int v4, v4, v18

    const v18, 0x558e6365

    goto/16 :goto_8

    :cond_6
    const-string v1, "\u06d6\u06db"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x33

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x1203

    const v18, 0x4d3eff84    # 2.00276032E8f

    xor-int v4, v4, v18

    const v18, 0x42053419

    goto/16 :goto_8

    :sswitch_f
    mul-int v9, v8, v8

    mul-int v10, v6, v6

    .line 22
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v1

    if-eqz v1, :cond_8

    :cond_7
    :goto_4
    const-string v1, "\u1a7b\u1a7a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x67

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x1dfd

    const v18, -0x35b44887

    xor-int v4, v4, v18

    const v18, 0x99b7105

    goto/16 :goto_8

    :cond_8
    const-string v1, "\u1a74\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x7f

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x3c83

    const v18, -0x15c1d657

    xor-int v4, v4, v18

    const v18, 0x6bb2491c

    goto/16 :goto_8

    :sswitch_10
    add-int v8, v6, v7

    .line 20
    sget-boolean v1, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v1, :cond_9

    goto :goto_5

    :cond_9
    const-string v1, "\u06e0\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x49c1

    const v18, 0x7176ee6f

    xor-int v4, v4, v18

    const v18, -0x66f7c37f

    goto/16 :goto_8

    :sswitch_11
    aget-short v6, v19, v5

    const/16 v7, 0x7a

    .line 26
    sget v1, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v1, :cond_a

    :goto_5
    const-string v1, "\u06db\u06d7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0xf

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x1537

    const v18, 0x1f7bf09f

    xor-int v4, v4, v18

    const v18, 0x14ffde6e

    goto/16 :goto_8

    :cond_a
    const-string v1, "\u0736\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x75

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x6831

    const v18, -0x335df8db    # -8.4949288E7f

    xor-int v4, v4, v18

    const v18, 0x1b76e8ba

    goto/16 :goto_8

    :sswitch_12
    const/4 v5, 0x0

    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v1

    if-eqz v1, :cond_b

    :goto_6
    const-string v1, "\u0730\u06e1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, 0x4f

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, -0x20ff

    const v18, 0x7404bb01

    xor-int v4, v4, v18

    const v18, 0x10eeffea

    goto :goto_8

    :cond_b
    const-string v1, "\u06db\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x2e2b

    const v18, 0x2da1f480

    xor-int v4, v4, v18

    const v18, 0x4df601bc    # 5.159136E8f

    goto :goto_8

    :sswitch_13
    sget-object v19, Ll/ܺ᩹᩷;->᩷۫ܽ:[S

    .line 11
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v1

    if-gtz v1, :cond_c

    goto :goto_7

    :cond_c
    const-string v1, "\u1a77\u06df"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x7b

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x61ad

    const v18, 0x6d3ade9

    xor-int v4, v4, v18

    const v18, 0x41fc11af

    goto :goto_8

    .line 13
    :sswitch_14
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v1

    if-eqz v1, :cond_e

    :cond_d
    :goto_7
    const-string v1, "\u06e7\u1a76"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x7f

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x6377

    const v18, 0x2efb33ab

    xor-int v4, v4, v18

    const v18, -0x5d41ae54

    goto :goto_8

    :cond_e
    const-string v1, "\u06e4\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v15

    mul-int/lit16 v4, v4, 0x1551

    const v18, -0x7db47361

    xor-int v4, v4, v18

    const v18, 0x147ff5f4

    :goto_8
    xor-int v18, v1, v18

    move v1, v4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6c52989c -> :sswitch_d
        -0x67eb3c94 -> :sswitch_13
        -0x6024324c -> :sswitch_13
        -0x5f80bea2 -> :sswitch_7
        -0x5f3e05ac -> :sswitch_11
        -0x5d869ce1 -> :sswitch_3
        -0x56fba93a -> :sswitch_6
        -0x4ed11296 -> :sswitch_14
        -0x4dc7f0ac -> :sswitch_5
        -0x4746619a -> :sswitch_2
        -0x4509eb36 -> :sswitch_12
        -0x393af802 -> :sswitch_1
        -0x3564d59e -> :sswitch_d
        -0x2fb3094b -> :sswitch_8
        -0x2a738756 -> :sswitch_14
        -0x1d547518 -> :sswitch_10
        -0x16553d44 -> :sswitch_4
        -0x15c15184 -> :sswitch_a
        -0x13c54d0b -> :sswitch_7
        -0xd479eed -> :sswitch_0
        -0xd460782 -> :sswitch_5
        -0xd436709 -> :sswitch_c
        -0x8ceeee7 -> :sswitch_9
        -0x39d6c85 -> :sswitch_1
        0x77c0fa7 -> :sswitch_4
        0xc6e0396 -> :sswitch_3
        0xcfee010 -> :sswitch_6
        0x12ac1b41 -> :sswitch_f
        0x152bf0a9 -> :sswitch_c
        0x21d832f9 -> :sswitch_f
        0x223a7dc0 -> :sswitch_12
        0x23657640 -> :sswitch_11
        0x35545cab -> :sswitch_10
        0x37d0074b -> :sswitch_e
        0x38f37cc3 -> :sswitch_e
        0x3a1a3c9e -> :sswitch_a
        0x4216dd2f -> :sswitch_9
        0x5294f3a3 -> :sswitch_b
        0x569898bd -> :sswitch_0
        0x612fdce0 -> :sswitch_8
        0x75a131b3 -> :sswitch_b
        0x78cc9e4b -> :sswitch_2
    .end sparse-switch
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 6

    const v0, 0x277ada83

    sget v1, Ll/֫ܽ;->ۚ᩷᩹:I

    sget v2, Ll/ۗ᩺;->ۡ᩺֡:I

    const-string v3, "\u1a79\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7ac7

    const v5, 0x6dea9589

    xor-int/2addr v4, v5

    const v5, -0x2954a36f

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x2b29

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 22
    sget v3, Ll/۠;->ܺܺܶ:I

    if-ltz v3, :cond_8

    goto/16 :goto_1

    .line 14
    :sswitch_0
    sget v3, Ll/ۗۗ;->ۨ۬ۖ:I

    if-gez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u06da\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x33

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x459b

    const v5, -0xd3d8da8

    xor-int/2addr v4, v5

    const v5, -0x795890af

    goto :goto_0

    .line 27
    :sswitch_1
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    sget v3, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-nez v3, :cond_7

    goto/16 :goto_4

    .line 1
    :sswitch_2
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    sget-boolean v3, Ll/֫ۡ;->۠ۤۜ:Z

    if-nez v3, :cond_b

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    goto/16 :goto_3

    .line 11
    :sswitch_4
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    return-void

    .line 33
    :sswitch_5
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 34
    iget-object v0, p0, Ll/ܺ᩹᩷;->᩸:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    invoke-interface {v0, p1, p0}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->handleIntent(Landroid/content/Intent;Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;)Z

    return-void

    .line 32
    :sswitch_6
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 4
    sget v3, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u06db\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6951

    const v5, 0x623e6987

    xor-int/2addr v4, v5

    const v5, 0x590e0fba

    goto :goto_0

    .line 8
    :sswitch_7
    sget v3, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u1a7a\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x579f

    const v5, 0x5701fe4b

    xor-int/2addr v4, v5

    const v5, 0x2b6c55e5

    goto/16 :goto_0

    .line 29
    :sswitch_8
    sget v3, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u05a8\u073a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x41ab

    const v5, 0x6a743fe2

    xor-int/2addr v4, v5

    const v5, -0x780bbf8c

    goto/16 :goto_0

    .line 33
    :sswitch_9
    sget v3, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u06ec\u1a73"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3a57

    const v5, -0x5b9ae921

    xor-int/2addr v4, v5

    const v5, -0x3d3800dc    # -99.99832f

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u06e1\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x580d

    const v5, -0x6f58dc9b

    xor-int/2addr v4, v5

    const v5, 0x234a1a9e

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u1a7a\u1a7b"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x671f

    const v5, 0x3c5a0d9c

    xor-int/2addr v4, v5

    const v5, 0x6e0b0b99

    goto/16 :goto_0

    :cond_7
    :goto_1
    const-string v3, "\u06d6\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2fd

    const v5, 0x56205194

    xor-int/2addr v4, v5

    const v5, 0x51b4647f

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e4\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x7d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4421

    const v5, 0x48361581

    xor-int/2addr v4, v5

    const v5, -0x2c1627d4

    goto/16 :goto_0

    .line 0
    :sswitch_c
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v3

    if-eqz v3, :cond_9

    :goto_2
    const-string v3, "\u06db\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2e1f

    const v5, -0x217d35b1

    xor-int/2addr v4, v5

    const v5, -0x53bea29b

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06d7\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x63e1

    const v5, 0x23b1b324

    xor-int/2addr v4, v5

    const v5, 0x88d084c

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_a

    :goto_3
    const-string v3, "\u1a76\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x6f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3a97

    const v5, 0x7669a189

    xor-int/2addr v4, v5

    const v5, 0x6ff59418

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06d7\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x71

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x671d

    const v5, 0x783a400e

    xor-int/2addr v4, v5

    const v5, 0x6f8671fb

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06ec\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6f65

    const v5, -0x1313b9fd

    xor-int/2addr v4, v5

    const v5, 0x6b037a1d

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d7\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x35

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x12af

    const v5, -0x29429397

    xor-int/2addr v4, v5

    const v5, 0x2f2bb825

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7748277f -> :sswitch_5
        -0x5e676882 -> :sswitch_0
        -0x5bbce759 -> :sswitch_b
        -0x595d0b5a -> :sswitch_0
        -0x4d56e656 -> :sswitch_9
        -0x45733a0d -> :sswitch_6
        -0x454578a1 -> :sswitch_3
        -0x415c75dd -> :sswitch_c
        -0x404eb76e -> :sswitch_a
        -0x3fa8aacb -> :sswitch_2
        -0x2e2c6a5c -> :sswitch_3
        -0x2cc1f20e -> :sswitch_4
        -0x1fd3990f -> :sswitch_1
        -0x1be823ab -> :sswitch_9
        -0xc921f2c -> :sswitch_e
        -0x37e39c2 -> :sswitch_c
        -0x289ec49 -> :sswitch_8
        0x137e0269 -> :sswitch_8
        0x161729cc -> :sswitch_7
        0x17d89b10 -> :sswitch_b
        0x1cd45a6c -> :sswitch_d
        0x212b2d1b -> :sswitch_4
        0x2420b3a1 -> :sswitch_2
        0x41156c08 -> :sswitch_1
        0x5b406bf1 -> :sswitch_a
        0x5cbdc899 -> :sswitch_5
        0x6151dc08 -> :sswitch_d
        0x73d86374 -> :sswitch_7
        0x76df5720 -> :sswitch_e
        0x79b9a564 -> :sswitch_6
    .end sparse-switch
.end method

.method public final onReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)V
    .locals 0

    return-void
.end method

.method public final onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x17fd6168

    sget v3, Ll/ۘۨ;->۫᩸۠:I

    sget v4, Ll/֨۬;->۫ۙ᩺:I

    const-string v5, "\u073f\u06db"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3893

    const v7, -0x44b220ad

    xor-int/2addr v6, v7

    const v7, 0x7750b46a

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x6e6f

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 46
    invoke-interface {v1, p1}, Ll/ۡ᩹᩷;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    goto :goto_1

    .line 14
    :sswitch_0
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v5

    if-gtz v5, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v5, "\u1a79\u06d7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x41

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x12ad

    const v7, 0x87fb8e2

    xor-int/2addr v6, v7

    const v7, -0x71e1582e

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    sget-boolean v5, Ll/֡ۨ;->ܽܶۖ:Z

    if-eqz v5, :cond_d

    goto/16 :goto_5

    .line 43
    :sswitch_2
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    sget v5, Ll/ۖ۫;->ۖ֫ܿ:I

    if-gez v5, :cond_b

    goto/16 :goto_3

    .line 38
    :sswitch_3
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    goto/16 :goto_3

    .line 19
    :sswitch_4
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    return-void

    :sswitch_5
    const/4 v5, 0x0

    .line 47
    sput-object v5, Ll/ܺ᩹᩷;->᩹:Ljava/lang/ref/WeakReference;

    goto :goto_2

    .line 44
    :sswitch_6
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۡ᩹᩷;

    if-eqz v1, :cond_1

    const-string v5, "\u0736\u06da"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4301

    const v7, -0x795bbf84

    xor-int/2addr v6, v7

    const v7, 0x296c1eb9

    goto :goto_0

    :cond_1
    :goto_1
    const-string v5, "\u05ab\u06d9"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5499

    const v7, -0x207cbdc7

    xor-int/2addr v6, v7

    const v7, -0x3450c44e    # -2.2968164E7f

    goto :goto_0

    .line 49
    :sswitch_7
    invoke-static {p0}, Ll/ۖۘ;->ۜۨۧ(Ljava/lang/Object;)V

    return-void

    .line 43
    :sswitch_8
    sget-object v0, Ll/ܺ᩹᩷;->᩹:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_2

    const-string v5, "\u1a7b\u06db"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x362f

    const v7, -0x3702c2dc

    xor-int/2addr v6, v7

    const v7, -0x6139ffcc

    goto/16 :goto_0

    :cond_2
    :goto_2
    const-string v5, "\u06d7\u06e8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7da5

    const v7, -0x428fc61f

    xor-int/2addr v6, v7

    const v7, 0x4849e51

    goto/16 :goto_0

    .line 0
    :sswitch_9
    sget v5, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v5, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v5, "\u1a77\u06d7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x57

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5297

    const v7, 0x4c2d4e4d    # 4.5431092E7f

    xor-int/2addr v6, v7

    const v7, -0x68711a5f

    goto/16 :goto_0

    .line 43
    :sswitch_a
    sget v5, Ll/᩺;->ۙۛܶ:I

    if-gtz v5, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v5, "\u1a73\u073d"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xa53

    const v7, -0xb65b97a

    xor-int/2addr v6, v7

    const v7, 0x6f31bf1e

    goto/16 :goto_0

    .line 16
    :sswitch_b
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v5

    if-gtz v5, :cond_5

    goto/16 :goto_6

    :cond_5
    const-string v5, "\u1a79\u1a75"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1d8f

    const v7, -0x21228e7e

    xor-int/2addr v6, v7

    const v7, -0x4b661428

    goto/16 :goto_0

    .line 25
    :sswitch_c
    sget v5, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v5, :cond_6

    goto :goto_3

    :cond_6
    const-string v5, "\u06da\u05a8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x13

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6993

    const v7, 0x25d0cb4a    # 3.6220002E-16f

    xor-int/2addr v6, v7

    const v7, -0x6debd47f

    goto/16 :goto_0

    .line 7
    :sswitch_d
    sget v5, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v5, :cond_7

    :goto_3
    const-string v5, "\u073f\u1a79"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x44c7

    const v7, 0x68ca6f7d

    xor-int/2addr v6, v7

    const v7, 0xb08cffb

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u06d9\u0730"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x53

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xe19

    const v7, -0x4eb199a0

    xor-int/2addr v6, v7

    const v7, 0x60629367

    goto/16 :goto_0

    :sswitch_e
    sget v5, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v5, :cond_8

    goto :goto_5

    :cond_8
    const-string v5, "\u05a8\u05a1"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x7f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6639

    const v7, -0x44d02fef

    xor-int/2addr v6, v7

    const v7, -0x2174a12f

    goto/16 :goto_0

    .line 12
    :sswitch_f
    sget v5, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v5, :cond_9

    goto/16 :goto_6

    :cond_9
    const-string v5, "\u06e0\u06d9"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x660b

    const v7, -0x785e807e

    xor-int/2addr v6, v7

    const v7, 0x38d39773

    goto/16 :goto_0

    .line 29
    :sswitch_10
    sget-boolean v5, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v5, :cond_a

    :goto_4
    const-string v5, "\u1a7a\u06e1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x3f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x26a9

    const v7, 0x63aa8843

    xor-int/2addr v6, v7

    const v7, -0x20e85ffb

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06dc\u06d6"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5a59

    const v7, 0x3ad7c465

    xor-int/2addr v6, v7

    const v7, 0x3be387af

    goto/16 :goto_0

    .line 33
    :sswitch_11
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v5

    if-eqz v5, :cond_c

    :cond_b
    :goto_5
    const-string v5, "\u06dc\u05a1"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x32d7

    const v7, -0x30fb28a9

    xor-int/2addr v6, v7

    const v7, 0x29fc9d29

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u073d\u1a78"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x5

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x728b

    const v7, -0x63eb3204

    xor-int/2addr v6, v7

    const v7, -0x467a5ad6

    goto/16 :goto_0

    .line 17
    :sswitch_12
    sget v5, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v5, :cond_e

    :cond_d
    :goto_6
    const-string v5, "\u06dc\u1a77"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x253d

    const v7, 0x657855b4

    xor-int/2addr v6, v7

    const v7, -0x42d1d6d

    goto/16 :goto_0

    :cond_e
    const-string v5, "\u06e8\u1a7b"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x50a9

    const v7, -0x6ff33ae6

    xor-int/2addr v6, v7

    const v7, 0xca85cc7

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x762e5ddf -> :sswitch_9
        -0x686c9b56 -> :sswitch_f
        -0x5207695f -> :sswitch_8
        -0x5139c998 -> :sswitch_6
        -0x47d1e2fc -> :sswitch_11
        -0x3cd4750c -> :sswitch_5
        -0x30e09e87 -> :sswitch_3
        -0x22ff8540 -> :sswitch_f
        -0xe30eec9 -> :sswitch_0
        -0xca9f5c0 -> :sswitch_2
        -0x601499e -> :sswitch_a
        0x38c3329 -> :sswitch_4
        0x42cab9c -> :sswitch_11
        0xb4bed62 -> :sswitch_b
        0xc004368 -> :sswitch_7
        0x10f9dff9 -> :sswitch_1
        0x1bd4234c -> :sswitch_e
        0x2026da2d -> :sswitch_7
        0x228d1282 -> :sswitch_c
        0x30574b42 -> :sswitch_e
        0x33c85e33 -> :sswitch_b
        0x386906e8 -> :sswitch_d
        0x3bf1019a -> :sswitch_10
        0x3e91fe4e -> :sswitch_10
        0x4742fa82 -> :sswitch_1
        0x4ec980b2 -> :sswitch_9
        0x527982d1 -> :sswitch_a
        0x54dd4235 -> :sswitch_d
        0x59b0bcda -> :sswitch_2
        0x5c88c1f4 -> :sswitch_c
        0x5d93cdfe -> :sswitch_12
        0x65386456 -> :sswitch_5
        0x744b6799 -> :sswitch_8
        0x7793b576 -> :sswitch_3
        0x78261de1 -> :sswitch_6
        0x7bc78182 -> :sswitch_0
        0x7c6e4f1b -> :sswitch_4
        0x7fd454de -> :sswitch_12
    .end sparse-switch
.end method
