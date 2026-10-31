.class public final Ll/ܶܺᩳ;
.super Ljava/lang/Object;
.source "MAK5"


# static fields
.field public static ֫:Ljava/lang/String; = ""

.field private static final ۘܶۗ:[S

.field public static ۧ:Ljava/lang/String; = ""

.field public static volatile ܽ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1a

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܶܺᩳ;->ۘܶۗ:[S

    return-void

    :array_0
    .array-data 2
        0xc8as
        0x55as
        0x558s
        0x549s
        0x57es
        0x551s
        0x55cs
        0x54es
        0x54es
        0x573s
        0x55cs
        0x550s
        0x558s
        0x55as
        0x558s
        0x549s
        0x570s
        0x558s
        0x549s
        0x555s
        0x552s
        0x559s
        0x573s
        0x55cs
        0x550s
        0x558s
    .end array-data
.end method

.method public static synthetic ֫()Ljava/lang/String;
    .locals 1

    .line 50
    sget-object v0, Ll/ܶܺᩳ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 62
    sget-boolean v0, Ll/ܶܺᩳ;->ܽ:Z

    if-nez v0, :cond_0

    return-void

    .line 65
    :cond_0
    sput-object p0, Ll/ܶܺᩳ;->֫:Ljava/lang/String;

    .line 66
    sput-object p1, Ll/ܶܺᩳ;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public static synthetic ۧ()Ljava/lang/String;
    .locals 1

    .line 54
    sget-object v0, Ll/ܶܺᩳ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public static ܽ()V
    .locals 24

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

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

    const v16, 0x5fb89b2c

    sget v17, Ll/᩺;->ۙۛܶ:I

    sget v18, Ll/֡᩶;->ܳܶ۠:I

    const-string v19, "\u06da\u05ab"

    invoke-static/range {v19 .. v19}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v17

    xor-int v0, v19, v18

    mul-int/lit16 v0, v0, -0x6ed3

    const v21, -0x78b9b5b1

    xor-int v0, v0, v21

    const v21, -0x553736b

    xor-int v19, v19, v21

    move-object v6, v5

    move-object v13, v12

    move-object v15, v14

    move/from16 v20, v19

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const v19, 0x5fb89b2c

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object v5, v3

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v7, v19, v18

    mul-int/lit16 v7, v7, -0x7635

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v0, v7

    xor-int v19, v20, v0

    sparse-switch v19, :sswitch_data_0

    .line 49
    const-class v1, Ljava/lang/StackTraceElement;

    sget-object v13, Ll/ܶܺᩳ;->ۘܶۗ:[S

    const/4 v14, 0x1

    sget-boolean v0, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v0, :cond_8

    goto/16 :goto_3

    .line 53
    :sswitch_0
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v0

    if-eqz v0, :cond_6

    :goto_1
    move-object/from16 v20, v1

    goto/16 :goto_b

    .line 51
    :sswitch_1
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    sget v0, Ll/֡᩶;->ܳܶ۠:I

    if-lez v0, :cond_0

    goto :goto_2

    :cond_0
    move/from16 v0, v22

    goto/16 :goto_7

    .line 52
    :sswitch_2
    sget-boolean v0, Ll/ۖۘ;->ۚܶۖ:Z

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_2
    const-string v0, "\u06e4\u06db"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v7, v0, v17

    mul-int/lit16 v7, v7, -0x789f

    const v20, 0x7f2324d5

    xor-int v7, v7, v20

    const v20, 0x5f0ed905

    goto/16 :goto_6

    .line 51
    :sswitch_3
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    goto :goto_1

    .line 50
    :sswitch_4
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    return-void

    .line 53
    :sswitch_5
    invoke-virtual {v1, v6, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 54
    new-instance v1, Ll/۠ܺᩳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Lorg/lsposed/lsplant/Hooker;->֫(Ljava/lang/reflect/Method;Ll/᩺᩹ۚ;)V

    return-void

    :sswitch_6
    const/16 v0, 0xd

    .line 50
    invoke-static {v15, v4, v0, v12}, Ll/֨۟;->֡ۚۧ([SIII)Ljava/lang/String;

    move-result-object v6

    .line 51
    sget v0, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v0, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "\u06df\u073f"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v7, v0, v18

    mul-int/lit16 v7, v7, 0x17eb

    const v20, -0x9e24c3e

    xor-int v7, v7, v20

    const v20, 0x742c74ea

    goto/16 :goto_6

    .line 50
    :sswitch_7
    invoke-static {v5, v8}, Lorg/lsposed/lsplant/Hooker;->֫(Ljava/lang/reflect/Method;Ll/᩺᩹ۚ;)V

    sget-object v15, Ll/ܶܺᩳ;->ۘܶۗ:[S

    const/16 v4, 0xd

    .line 51
    sget v0, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v0, :cond_3

    goto :goto_1

    :cond_3
    const-string v0, "\u06dc\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x33

    xor-int v7, v0, v17

    mul-int/lit16 v7, v7, 0x2c1

    const v20, 0x5cb07057

    xor-int v7, v7, v20

    const v20, 0x1a8c2b45

    goto/16 :goto_6

    :sswitch_8
    const/4 v3, 0x0

    .line 49
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    .line 50
    new-instance v8, Ll/֨ܺᩳ;

    .line 51
    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v0, :cond_4

    goto :goto_4

    .line 50
    :cond_4
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    sget v0, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v0, :cond_5

    :goto_3
    move/from16 v0, v22

    goto/16 :goto_a

    :cond_5
    const-string v0, "\u06d6\u06e8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v7, v0, v17

    mul-int/lit16 v7, v7, 0x3099

    const v20, -0x5cfe7f32

    xor-int v7, v7, v20

    const v20, -0x9a26e2d

    goto/16 :goto_6

    :sswitch_9
    const/16 v0, 0xc

    .line 49
    invoke-static {v13, v14, v0, v12}, Ll/֫ۡ;->֫ܿۨ([SIII)Ljava/lang/String;

    move-result-object v2

    .line 53
    sget-boolean v0, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v0, :cond_7

    :cond_6
    :goto_4
    const-string v0, "\u06db\u05ab"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x5f

    xor-int v7, v0, v17

    mul-int/lit16 v7, v7, -0x113

    const v8, 0x722a65cb

    xor-int/2addr v7, v8

    const v8, -0x4bfb69e5

    xor-int v20, v0, v8

    move v0, v7

    const/4 v8, 0x0

    goto/16 :goto_0

    :cond_7
    const-string v0, "\u073a\u06eb"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v7, v0, v18

    mul-int/lit16 v7, v7, 0x44d5

    const v20, -0x5139d421

    xor-int v7, v7, v20

    const v20, 0x6d92f96d

    goto :goto_6

    :cond_8
    const-string v0, "\u073f\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v7, v0, v18

    mul-int/lit16 v7, v7, 0x4e57

    const v20, 0x480c5b1a

    xor-int v7, v7, v20

    const v20, -0x7f16ef1

    goto :goto_6

    :sswitch_a
    const/16 v0, 0x62bd

    const/16 v12, 0x62bd

    goto :goto_5

    :sswitch_b
    const/16 v0, 0x53d

    const/16 v12, 0x53d

    :goto_5
    const-string v0, "\u06d8\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v7, v0, v17

    mul-int/lit16 v7, v7, -0xf87

    const v20, -0x6e82a26e

    xor-int v7, v7, v20

    const v20, -0x44ab242a

    goto :goto_6

    :sswitch_c
    mul-int v0, v11, v11

    sub-int/2addr v0, v10

    if-lez v0, :cond_9

    const-string v0, "\u06d6\u05ab"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    mul-int/lit8 v0, v0, 0xf

    xor-int v7, v0, v17

    mul-int/lit16 v7, v7, 0x7eaf

    const v20, -0x82e63f5

    xor-int v7, v7, v20

    const v20, 0x52c47520

    goto :goto_6

    :cond_9
    const-string v0, "\u1a7a\u1a74"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v7, v0, v18

    mul-int/lit16 v7, v7, 0x3695

    const v20, -0x6d2b3c42

    xor-int v7, v7, v20

    const v20, -0x6697ab17

    :goto_6
    xor-int v20, v0, v20

    move v0, v7

    goto/16 :goto_0

    :sswitch_d
    add-int v10, v9, v9

    move/from16 v0, v22

    add-int/lit16 v11, v0, 0x4bb

    sget v7, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v7, :cond_a

    :goto_7
    const-string v7, "\u073f\u06e4"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v17

    mul-int/lit8 v7, v7, -0x45

    move-object/from16 v20, v1

    xor-int v1, v7, v18

    mul-int/lit16 v1, v1, -0x7637

    const v22, 0xadbe59d

    xor-int v1, v1, v22

    const v22, -0xf91b906

    xor-int v7, v7, v22

    move/from16 v22, v0

    move v0, v1

    move-object/from16 v1, v20

    move/from16 v20, v7

    goto/16 :goto_0

    :cond_a
    move-object/from16 v20, v1

    const-string v1, "\u1a79\u05a1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v7, v1, v17

    mul-int/lit16 v7, v7, 0x7eb3

    const v22, 0x43eb1d0e

    xor-int v7, v7, v22

    const v22, -0x7282ad4e

    goto :goto_9

    :sswitch_e
    move-object/from16 v20, v1

    move/from16 v0, v22

    const v1, 0x166099

    add-int v9, v21, v1

    sget v1, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v1, :cond_b

    :goto_8
    move-object/from16 v1, v20

    goto :goto_a

    :cond_b
    const-string v1, "\u1a78\u06e1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x6d

    xor-int v7, v1, v18

    mul-int/lit16 v7, v7, 0x498b

    const v22, 0x6752b20f

    xor-int v7, v7, v22

    const v22, 0x666630d2

    :goto_9
    xor-int v1, v1, v22

    move/from16 v22, v0

    move v0, v7

    move-object/from16 v23, v20

    move/from16 v20, v1

    goto/16 :goto_d

    :sswitch_f
    move-object/from16 v20, v1

    move/from16 v0, v22

    mul-int v21, v0, v0

    sget-boolean v1, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v1, :cond_c

    goto :goto_8

    :goto_a
    const-string v7, "\u05a8\u0733"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int v7, v7, v18

    mul-int/lit8 v7, v7, -0x7

    move/from16 v22, v0

    xor-int v0, v7, v17

    mul-int/lit16 v0, v0, 0x641

    const v20, 0x2f331718

    xor-int v0, v0, v20

    const v20, 0x2cac0e3c

    xor-int v20, v7, v20

    goto/16 :goto_0

    :cond_c
    move/from16 v22, v0

    const-string v0, "\u1a75\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x1f

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x26f

    const v7, 0x249b523

    xor-int/2addr v1, v7

    const v7, -0x3a6809fd

    goto :goto_c

    :sswitch_10
    move-object/from16 v20, v1

    sget-object v0, Ll/ܶܺᩳ;->ۘܶۗ:[S

    const/4 v1, 0x0

    aget-short v22, v0, v1

    .line 49
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v0

    if-eqz v0, :cond_d

    :goto_b
    const-string v0, "\u05a1\u1a73"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x5763

    const v7, 0x74ee270e

    xor-int/2addr v1, v7

    const v7, -0x24472a45

    goto :goto_c

    :cond_d
    const-string v0, "\u1a7a\u05ab"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, 0x15

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x4e8f

    const v7, 0x59175965

    xor-int/2addr v1, v7

    const v7, 0x14b00ee8

    :goto_c
    xor-int/2addr v0, v7

    move-object/from16 v23, v20

    move/from16 v20, v0

    move v0, v1

    :goto_d
    move-object/from16 v1, v23

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x76058688 -> :sswitch_2
        -0x62f60231 -> :sswitch_d
        -0x5f75138d -> :sswitch_3
        -0x59be7061 -> :sswitch_9
        -0x567e7aa7 -> :sswitch_0
        -0x5377e2d0 -> :sswitch_b
        -0x53125bb9 -> :sswitch_7
        -0x43b0881d -> :sswitch_e
        -0x333e65cf -> :sswitch_6
        -0x32128fc5 -> :sswitch_9
        -0x31d7f56c -> :sswitch_a
        -0x30b0af99 -> :sswitch_10
        -0x28317844 -> :sswitch_c
        -0x13fd54d3 -> :sswitch_1
        -0x11a4e456 -> :sswitch_4
        -0xcb5a5fb -> :sswitch_b
        -0xbe74fe1 -> :sswitch_6
        -0x602aeff -> :sswitch_2
        0x297437d -> :sswitch_a
        0x5beea34 -> :sswitch_3
        0x9f74e05 -> :sswitch_c
        0x1ce811bc -> :sswitch_5
        0x2830b6ff -> :sswitch_4
        0x2d8c3696 -> :sswitch_7
        0x363c108c -> :sswitch_10
        0x3d718147 -> :sswitch_0
        0x41cfae49 -> :sswitch_5
        0x46992244 -> :sswitch_8
        0x5871197f -> :sswitch_8
        0x647762eb -> :sswitch_f
        0x6a93f576 -> :sswitch_d
        0x6adc78c6 -> :sswitch_e
        0x6ce874d7 -> :sswitch_1
        0x7578376e -> :sswitch_f
    .end sparse-switch
.end method

.method public static declared-synchronized ܿ()V
    .locals 6

    .line 2
    const-class v0, Ll/ܶܺᩳ;

    .line 3
    monitor-enter v0

    .line 19
    :try_start_0
    invoke-static {}, Ll/ܶܺᩳ;->ᩳ()V

    const-string v1, "aa"

    const-string v2, "bb"

    .line 20
    invoke-static {v1, v2}, Ll/ܶܺᩳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    new-instance v1, Ljava/lang/StackTraceElement;

    const-string v2, "a"

    const-string v3, "b"

    const-string v4, "c"

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    const-string v2, "aa"

    .line 22
    invoke-virtual {v1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "bb"

    invoke-virtual {v1}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 25
    monitor-exit v0

    return-void

    .line 23
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "JavaHook probe failed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static declared-synchronized ᩳ()V
    .locals 2

    .line 2
    const-class v0, Ll/ܶܺᩳ;

    .line 3
    monitor-enter v0

    .line 32
    :try_start_0
    sget-boolean v1, Ll/ܶܺᩳ;->ܽ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 33
    monitor-exit v0

    return-void

    .line 35
    :cond_0
    :try_start_1
    invoke-static {}, Ll/ܶܺᩳ;->ܽ()V

    const/4 v1, 0x1

    .line 36
    sput-boolean v1, Ll/ܶܺᩳ;->ܽ:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method
