.class public final synthetic Ll/ۘۘ᩷;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ᩳ᩶ۗ:[S


# instance fields
.field public final synthetic ᩸:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۘۘ᩷;->ᩳ᩶ۗ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x7d8s
        0x738fs
        -0x5983s
        0x516bs
    .end array-data
.end method

.method public synthetic constructor <init>(Landroid/widget/TextView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘۘ᩷;->᩸:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final run()V
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

    const v12, -0x68fad1b

    sget v13, Ll/֡ᩴ;->ܳۤ֫:I

    sget v14, Ll/֫ۧ;->ۙ۟ۧ:I

    const-string v15, "\u1a75\u06db"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    mul-int/lit8 v15, v15, 0x3d

    xor-int v0, v15, v14

    mul-int/lit16 v0, v0, 0x41af

    const v17, -0x3238ff22

    xor-int v0, v0, v17

    const v17, 0x946df4e

    xor-int v15, v15, v17

    move-object v3, v2

    move-object v11, v10

    move/from16 v16, v15

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const v15, -0x68fad1b

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int/2addr v15, v14

    mul-int/lit16 v15, v15, 0x13f7

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v0, v15

    xor-int v15, v16, v0

    sparse-switch v15, :sswitch_data_0

    .line 262
    sget v0, Ll/᩹;->ۤܿܳ:I

    if-nez v0, :cond_1

    :cond_0
    move/from16 v16, v1

    goto/16 :goto_6

    :sswitch_0
    sget-boolean v0, Ll/֨۫;->۬᩷᩶:Z

    if-eqz v0, :cond_2

    :cond_1
    move/from16 v16, v1

    goto/16 :goto_2

    :cond_2
    move/from16 v16, v1

    goto/16 :goto_7

    .line 1360
    :sswitch_1
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget v0, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v0, :cond_0

    :goto_1
    move/from16 v16, v1

    goto/16 :goto_4

    .line 1073
    :sswitch_2
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    goto :goto_1

    .line 730
    :sswitch_3
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    return-void

    :sswitch_4
    move-object/from16 v0, p0

    .line 1973
    iget-object v2, v0, Ll/ۘۘ᩷;->᩸:Landroid/widget/TextView;

    invoke-static {v2, v1}, Ll/֡᩶;->ۢ۠᩶(Ljava/lang/Object;I)V

    return-void

    :sswitch_5
    move-object/from16 v0, p0

    .line 2
    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    const v16, 0x7e2a4964

    xor-int v1, v1, v16

    sget-boolean v16, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v16, :cond_3

    goto/16 :goto_8

    :cond_3
    const-string v16, "\u05a1\u06e0"

    invoke-static/range {v16 .. v16}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v16

    sub-int v16, v13, v16

    mul-int/lit8 v16, v16, 0x11

    xor-int v0, v16, v14

    mul-int/lit16 v0, v0, -0x4c29

    const v17, -0x41c40b5b

    xor-int v0, v0, v17

    const v17, 0x525bb209

    xor-int v16, v16, v17

    goto :goto_0

    :sswitch_6
    const/4 v0, 0x3

    invoke-static {v11, v12, v0, v10}, Ll/ۘ᩻;->ۙܺܶ([SIII)Ljava/lang/String;

    move-result-object v2

    .line 50
    sget v0, Ll/᩹;->ۤܿܳ:I

    if-eqz v0, :cond_4

    goto/16 :goto_8

    :cond_4
    const-string v0, "\u06df\u06db"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    move/from16 v16, v1

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x61e1

    const v17, -0x1bb18ea8

    xor-int v1, v1, v17

    const v17, 0x56339575

    goto/16 :goto_9

    :sswitch_7
    move/from16 v16, v1

    const/4 v12, 0x1

    .line 1293
    sget v0, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v0, :cond_5

    :goto_2
    const-string v0, "\u06e7\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x1297

    const v17, 0x5ffb0a87

    xor-int v1, v1, v17

    const v17, 0x61d8a44c

    goto/16 :goto_9

    :cond_5
    const-string v0, "\u1a78\u1a73"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x58c1

    const v17, 0x603db091

    xor-int v1, v1, v17

    const v17, 0x7219e4bf

    goto/16 :goto_9

    :sswitch_8
    move/from16 v16, v1

    .line 2
    sget v0, Ll/֫᩵᩷;->ۛۧ:I

    sget-object v11, Ll/ۘۘ᩷;->ᩳ᩶ۗ:[S

    sget-boolean v0, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v0, :cond_6

    goto/16 :goto_7

    :cond_6
    const-string v0, "\u06d9\u06d6"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x5d93

    const v17, 0x5f88fb7c

    xor-int v1, v1, v17

    const v17, 0x25f8c039

    goto/16 :goto_9

    :sswitch_9
    move/from16 v16, v1

    const v0, 0xff16

    const v10, 0xff16

    goto :goto_3

    :sswitch_a
    move/from16 v16, v1

    const/16 v0, 0x3d82

    const/16 v10, 0x3d82

    :goto_3
    const-string v0, "\u06e4\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0xb

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x7841

    const v17, 0x6f6a308a

    xor-int v1, v1, v17

    const v17, 0x61a5e85a

    goto/16 :goto_9

    :sswitch_b
    move/from16 v16, v1

    add-int/lit8 v0, v9, 0x1

    sub-int v0, v7, v0

    if-ltz v0, :cond_7

    const-string v0, "\u06db\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x31

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x62df

    const v17, -0x6c17367b

    xor-int v1, v1, v17

    const v17, 0x6dc23065

    goto/16 :goto_9

    :cond_7
    const-string v0, "\u073a\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x13b7

    const v17, -0x52082979

    xor-int v1, v1, v17

    const v17, 0x12809e40

    goto/16 :goto_9

    :sswitch_c
    move/from16 v16, v1

    mul-int v9, v5, v8

    .line 1420
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_4

    :cond_8
    const-string v0, "\u1a79\u06d7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x45

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x4da9

    const v17, 0x2f9ff7c0

    xor-int v1, v1, v17

    const v17, 0x16856d72

    goto/16 :goto_9

    :sswitch_d
    move/from16 v16, v1

    mul-int v7, v6, v6

    const/4 v8, 0x2

    .line 229
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v0

    if-eqz v0, :cond_9

    :goto_4
    const-string v0, "\u1a73\u0730"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x678f

    const v17, 0x2ea6b80d    # 7.5815E-11f

    xor-int v1, v1, v17

    const v17, -0x6668e126

    goto/16 :goto_9

    :cond_9
    const-string v0, "\u06e0\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x39

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x2f85

    const v17, 0x741347aa

    xor-int v1, v1, v17

    const v17, -0x3a879f36

    goto/16 :goto_9

    :sswitch_e
    move/from16 v16, v1

    add-int/lit8 v6, v5, 0x1

    .line 1815
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v0

    if-nez v0, :cond_a

    :goto_5
    move/from16 v1, v16

    goto/16 :goto_8

    :cond_a
    const-string v0, "\u073f\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x3981

    const v17, 0x61284b83

    xor-int v1, v1, v17

    const v17, -0x1646b019

    goto/16 :goto_9

    :sswitch_f
    move/from16 v16, v1

    aget-short v5, v3, v4

    .line 1812
    sget v0, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v0, :cond_b

    :goto_6
    const-string v0, "\u05a8\u1a75"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x65

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x2b2f

    const v17, 0x46a303c7

    xor-int v1, v1, v17

    const v17, -0x57532873

    goto/16 :goto_9

    :cond_b
    const-string v0, "\u1a78\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x2fbd

    const v17, 0x2d140bdd

    xor-int v1, v1, v17

    const v17, 0x2b46a538

    goto :goto_9

    :sswitch_10
    move/from16 v16, v1

    const/4 v4, 0x0

    sget-boolean v0, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v0, :cond_c

    :goto_7
    const-string v0, "\u1a76\u1a75"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x6481

    const v17, -0x1f3cf5c6

    xor-int v1, v1, v17

    const v17, -0x1895b295

    goto :goto_9

    :cond_c
    const-string v0, "\u1a76\u06d6"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x53

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x25cf

    const v17, 0x5d95b239

    xor-int v1, v1, v17

    const v17, 0x5a498713

    goto :goto_9

    :sswitch_11
    move/from16 v16, v1

    sget-object v3, Ll/ۘۘ᩷;->ᩳ᩶ۗ:[S

    .line 1346
    sget-boolean v0, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v0, :cond_d

    goto/16 :goto_5

    :goto_8
    const-string v0, "\u06e0\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x57

    move/from16 v16, v1

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x5161

    const v17, -0x7aa70528

    xor-int v1, v1, v17

    const v17, -0x490735a5

    goto :goto_9

    :cond_d
    const-string v0, "\u06eb\u1a76"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x51fb

    const v17, 0x1986cae1

    xor-int v1, v1, v17

    const v17, 0x7df890ca    # 4.1300041E37f

    :goto_9
    xor-int v0, v0, v17

    move/from16 v18, v16

    move/from16 v16, v0

    move v0, v1

    move/from16 v1, v18

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x74846491 -> :sswitch_9
        -0x697673b9 -> :sswitch_b
        -0x63bc53ab -> :sswitch_8
        -0x61056d2b -> :sswitch_c
        -0x5317652f -> :sswitch_1
        -0x52b8d4f4 -> :sswitch_c
        -0x51f326ce -> :sswitch_f
        -0x4e11c2b2 -> :sswitch_f
        -0x48d6bbcf -> :sswitch_3
        -0x46fffcf5 -> :sswitch_11
        -0x43fc1b75 -> :sswitch_7
        -0x3f5316a2 -> :sswitch_e
        -0x3364cd11 -> :sswitch_a
        -0x30374efa -> :sswitch_5
        -0x270865fd -> :sswitch_7
        -0x1a1135ae -> :sswitch_d
        -0x1279dc78 -> :sswitch_11
        -0x7dc7934 -> :sswitch_1
        0x315af38 -> :sswitch_3
        0x5f8ffa1 -> :sswitch_e
        0xa70f310 -> :sswitch_0
        0xffedc3c -> :sswitch_b
        0x17c38101 -> :sswitch_6
        0x1a427ff7 -> :sswitch_9
        0x1e627696 -> :sswitch_4
        0x27807734 -> :sswitch_2
        0x3fa053f9 -> :sswitch_2
        0x4e28ee4c -> :sswitch_10
        0x534501d7 -> :sswitch_10
        0x54e94caa -> :sswitch_0
        0x57a9c0bf -> :sswitch_8
        0x5ca7cbb2 -> :sswitch_6
        0x60286069 -> :sswitch_a
        0x61634145 -> :sswitch_5
        0x6bf45d59 -> :sswitch_4
        0x70425731 -> :sswitch_d
    .end sparse-switch
.end method
