.class public final synthetic Ll/ۘ֡ۡ;
.super Ljava/lang/Object;
.source "44LP"

# interfaces
.implements Ll/ۢ۠ۡ;


# static fields
.field private static final ۗ᩺۠:[S


# instance fields
.field public final synthetic ᩸:Lbin/mt/plus/Main;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۘ֡ۡ;->ۗ᩺۠:[S

    return-void

    :array_0
    .array-data 2
        0x1ff9s
        -0x1462s
        -0x1477s
        -0x1461s
        -0x1467s
        -0x1480s
        -0x1468s
        -0x7a54s
        0x6dc4s
        -0x78ffs
    .end array-data
.end method

.method public synthetic constructor <init>(Lbin/mt/plus/Main;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘ֡ۡ;->᩸:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻ᩴۡ;)V
    .locals 28

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

    const/16 v19, 0x0

    const v20, 0x1627e9f1

    sget v21, Ll/֨۬;->۫ۙ᩺:I

    sget v22, Ll/֡ܶ;->ᩴܿ᩸:I

    const-string v23, "\u06db\u1a74"

    invoke-static/range {v23 .. v23}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v21

    xor-int v0, v23, v22

    mul-int/lit16 v0, v0, 0x484f

    const v25, 0x471c39dd    # 39993.863f

    xor-int v0, v0, v25

    const v25, -0x1ed954f9

    xor-int v23, v23, v25

    move-object/from16 v13, v19

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 v27, v16

    move-object/from16 v16, v9

    move-object/from16 v9, v27

    :goto_0
    xor-int v11, v20, v22

    mul-int/lit16 v11, v11, -0x621

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v0, v11

    xor-int v20, v23, v0

    sparse-switch v20, :sswitch_data_0

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v0

    if-nez v0, :cond_0

    :goto_1
    move-object/from16 v11, p1

    :goto_2
    move-object/from16 v23, v1

    goto/16 :goto_a

    :sswitch_0
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    sget-boolean v0, Ll/֨۫;->۬᩷᩶:Z

    if-nez v0, :cond_6

    :cond_0
    const-string v0, "\u073f\u05a8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, 0x59

    xor-int v11, v0, v21

    mul-int/lit16 v11, v11, -0x556b

    const v23, -0x6f6b5613

    xor-int v11, v11, v23

    const v23, -0x72f90165

    goto/16 :goto_5

    .line 34
    :sswitch_1
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v0

    if-ltz v0, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    goto/16 :goto_9

    :sswitch_2
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    return-void

    .line 281
    :sswitch_4
    invoke-static {}, Ll/ۖ۠ۡ;->ܿ()V

    .line 282
    new-instance v0, Ll/֡֡ۡ;

    invoke-direct {v0, v1, v3}, Ll/֡֡ۡ;-><init>(Ll/ۗܺ᩷;Ll/ۜۘۡ;)V

    .line 283
    invoke-static {v2}, Ll/֫֫;->ۙܽ᩹(I)Ll/᩸ۚۢ;

    goto/16 :goto_3

    :sswitch_5
    mul-int v0, v5, v6

    .line 277
    invoke-static {v0}, Ll/֡۬;->᩶ᩳᩳ(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Ll/֫֫;->ۤ۟ۗ(Ljava/lang/Object;Ljava/lang/Object;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 278
    invoke-static {v0}, Ll/ۗ۬;->ۨ᩹ۘ(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "\u06e4\u06e8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v11, v0, v22

    mul-int/lit16 v11, v11, -0x6625

    const v23, 0x28cf241d

    xor-int v11, v11, v23

    const v23, 0x210c81fa

    goto/16 :goto_5

    .line 277
    :sswitch_6
    sget-object v4, Ll/ܽ֡ܿ;->ܿ:Ll/ܶ᩵ܿ;

    invoke-static {}, Ll/ۙ᩸᩷;->֫()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v5, v0, Landroid/content/pm/ApplicationInfo;->uid:I

    const/16 v6, 0x1c8

    .line 94
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v0, "\u1a7a\u05a8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, 0x29

    xor-int v11, v0, v21

    mul-int/lit16 v11, v11, 0x3cf5

    const v23, 0x3dc36207

    xor-int v11, v11, v23

    const v23, 0x4ee9817e

    goto/16 :goto_5

    :sswitch_7
    return-void

    .line 275
    :sswitch_8
    new-instance v0, Ll/֡֡ۡ;

    invoke-direct {v0, v1, v3}, Ll/֡֡ۡ;-><init>(Ll/ۗܺ᩷;Ll/ۜۘۡ;)V

    .line 276
    invoke-static {v2}, Ll/֫֫;->ۙܽ᩹(I)Ll/᩸ۚۢ;

    return-void

    .line 277
    :sswitch_9
    invoke-static {}, Ll/֨֫;->֫ܶۚ()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "\u073f\u073d"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x61

    xor-int v11, v0, v21

    mul-int/lit16 v11, v11, 0x6219

    const v23, 0x4811d2cf

    xor-int v11, v11, v23

    const v23, -0x71e58777    # -1.9040001E-30f

    goto/16 :goto_5

    :cond_3
    :goto_3
    const-string v0, "\u06df\u06d6"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v21, v0

    mul-int/lit8 v0, v0, -0x49

    xor-int v11, v0, v22

    mul-int/lit16 v11, v11, -0x754f

    const v23, -0x203fc7fe

    xor-int v11, v11, v23

    const v23, 0x189f1188

    goto/16 :goto_5

    :sswitch_a
    const v0, 0x7ebc80f8

    xor-int v2, v8, v0

    const/4 v3, 0x0

    if-eqz v24, :cond_4

    const-string v0, "\u06e0\u0733"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x5

    xor-int v11, v0, v21

    mul-int/lit16 v11, v11, -0x1f13

    const v23, -0x2fd4df84

    xor-int v11, v11, v23

    const v23, -0x736a0ada

    goto :goto_5

    :cond_4
    const-string v0, "\u0730\u06d9"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x19

    xor-int v11, v0, v22

    mul-int/lit16 v11, v11, 0x5235

    const v23, 0x6ac79cd1

    xor-int v11, v11, v23

    const v23, 0xce7a801

    goto :goto_5

    .line 274
    :sswitch_b
    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    .line 222
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_6

    :cond_5
    const-string v0, "\u1a77\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v11, v0, v21

    mul-int/lit16 v11, v11, -0xee9

    const v23, -0x4f244f86

    xor-int v11, v11, v23

    const v23, -0x30c79020

    goto :goto_5

    :sswitch_c
    const/4 v0, 0x7

    const/4 v7, 0x3

    .line 274
    invoke-static {v13, v0, v7, v15}, Ll/ۗ۬;->᩹ۨ᩹([SIII)Ljava/lang/String;

    move-result-object v7

    .line 38
    sget-boolean v0, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v0, :cond_7

    :cond_6
    :goto_4
    const-string v0, "\u06ec\u06e1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v11, v0, v22

    mul-int/lit16 v11, v11, -0x69b9

    const v23, -0x411206f4

    xor-int v11, v11, v23

    const v23, 0x317bc2a9

    goto :goto_5

    :cond_7
    const-string v0, "\u05a8\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v11, v0, v22

    mul-int/lit16 v11, v11, -0x5721

    const v23, -0x11b2e664

    xor-int v11, v11, v23

    const v23, 0x77929c10

    :goto_5
    xor-int v23, v0, v23

    move v0, v11

    goto/16 :goto_0

    .line 274
    :sswitch_d
    invoke-virtual/range {p1 .. p1}, Ll/᩻ᩴۡ;->ᩳ()Z

    move-result v24

    move-object/from16 v0, p0

    iget-object v1, v0, Ll/ۘ֡ۡ;->᩸:Lbin/mt/plus/Main;

    sget-object v13, Ll/ۘ֡ۡ;->ۗ᩺۠:[S

    sget v11, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v11, :cond_8

    :goto_6
    move-object/from16 v11, p1

    goto :goto_7

    :cond_8
    const-string v11, "\u1a7b\u06e4"

    invoke-static {v11}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v11

    xor-int v11, v11, v22

    xor-int v0, v11, v21

    mul-int/lit16 v0, v0, -0x2e0f

    const v23, -0x5fda7b17

    xor-int v0, v0, v23

    const v23, 0x79709feb

    xor-int v23, v11, v23

    goto/16 :goto_0

    .line 0
    :sswitch_e
    invoke-static {v9, v10, v12, v15}, Ll/֫ܽ;->᩵۠ܽ([SIII)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v11, p1

    .line 0
    invoke-static {v11, v0}, Ll/֡ᩴ;->ۚ֫۟(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 160
    sget v0, Ll/۠;->ܺܺܶ:I

    if-ltz v0, :cond_9

    goto/16 :goto_2

    :cond_9
    const-string v0, "\u1a7a\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    move-object/from16 v23, v1

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x6529

    const v26, 0x6f883877

    xor-int v1, v1, v26

    const v26, 0x64bd66e4

    goto/16 :goto_b

    :sswitch_f
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    .line 0
    sget-object v9, Ll/ۘ֡ۡ;->ۗ᩺۠:[S

    const/4 v10, 0x1

    const/4 v12, 0x6

    sget v0, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v0, :cond_a

    move-object/from16 v1, v23

    :goto_7
    const-string v0, "\u06e7\u1a75"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    move-object/from16 v23, v1

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0xdcb

    const v26, 0x172c4c0e

    xor-int v1, v1, v26

    const v26, -0x5f233f8b

    goto/16 :goto_b

    :cond_a
    const-string v0, "\u1a79\u06d7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x33

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0x3ec1

    const v26, -0x569a022c

    xor-int v1, v1, v26

    const v26, -0x286cd9ca

    goto/16 :goto_b

    :sswitch_10
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    const v0, 0xb93c

    const v15, 0xb93c

    goto :goto_8

    :sswitch_11
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    const v0, 0xebec

    const v15, 0xebec

    :goto_8
    const-string v0, "\u073f\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x4b19

    const v26, 0x2dd3b927

    xor-int v1, v1, v26

    const v26, 0x5e635c97

    goto/16 :goto_b

    :sswitch_12
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    mul-int v0, v25, v14

    sub-int v0, v0, v19

    if-gtz v0, :cond_b

    const-string v0, "\u06dc\u05a8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0x77b9

    const v26, 0x7d716799

    xor-int v1, v1, v26

    const v26, 0x7693bb41

    goto/16 :goto_b

    :cond_b
    const-string v0, "\u06da\u1a7b"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, -0x77

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x3ad7

    const v26, -0x43c45d2

    xor-int v1, v1, v26

    const v26, 0x2ae29499

    goto/16 :goto_b

    :sswitch_13
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    const v0, 0x63ab121

    add-int v19, v18, v0

    const/16 v14, 0x4fde

    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_9

    :cond_c
    const-string v0, "\u0730\u1a73"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x4d

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, -0x7643

    const v26, -0x1644b3

    xor-int v1, v1, v26

    const v26, 0x644d911e

    goto/16 :goto_b

    :sswitch_14
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    aget-short v25, v16, v17

    mul-int v18, v25, v25

    .line 61
    sget v0, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v0, :cond_d

    goto :goto_9

    :cond_d
    const-string v0, "\u1a73\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x9

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x1381

    const v26, -0x59cc3c4f

    xor-int v1, v1, v26

    const v26, -0x4e9d314c

    goto :goto_b

    :sswitch_15
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    const/16 v17, 0x0

    .line 276
    sget-boolean v0, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v0, :cond_e

    :goto_9
    const-string v0, "\u06e7\u0730"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x494d

    const v26, -0x33ca03db    # -4.770626E7f

    xor-int v1, v1, v26

    const v26, -0x347c6c20    # -1.7246144E7f

    goto :goto_b

    :cond_e
    const-string v0, "\u1a76\u0733"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x61

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x37df

    const v26, -0x37e41167

    xor-int v1, v1, v26

    const v26, -0x28bd2218

    goto :goto_b

    :sswitch_16
    move-object/from16 v11, p1

    move-object/from16 v23, v1

    sget-object v16, Ll/ۘ֡ۡ;->ۗ᩺۠:[S

    sget-boolean v0, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v0, :cond_f

    :goto_a
    const-string v0, "\u06d7\u06d9"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x3e17

    const v26, -0x687b2493

    xor-int v1, v1, v26

    const v26, 0x4464dd8c

    goto :goto_b

    :cond_f
    const-string v0, "\u0736\u0733"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, -0x23

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x5709

    const v26, 0x9c3e460

    xor-int v1, v1, v26

    const v26, -0x6fcc8557

    :goto_b
    xor-int v0, v0, v26

    move-object/from16 v27, v23

    move/from16 v23, v0

    move v0, v1

    move-object/from16 v1, v27

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ebf12bd -> :sswitch_f
        -0x75f89631 -> :sswitch_7
        -0x69411c58 -> :sswitch_13
        -0x59af0ddf -> :sswitch_c
        -0x57a7c82d -> :sswitch_0
        -0x4d22e3af -> :sswitch_b
        -0x43eb12fd -> :sswitch_9
        -0x42306313 -> :sswitch_5
        -0x3a56f50c -> :sswitch_0
        -0x3762ae00 -> :sswitch_12
        -0x2bdbe4d6 -> :sswitch_c
        -0x1c393b66 -> :sswitch_8
        -0x165dbdca -> :sswitch_16
        -0x13fd5f33 -> :sswitch_14
        -0x11864c39 -> :sswitch_15
        -0xd2723f5 -> :sswitch_5
        -0xbb2e12f -> :sswitch_12
        -0x2a10aca -> :sswitch_6
        0xa12d6e -> :sswitch_1
        0x1018773e -> :sswitch_a
        0x133c673e -> :sswitch_4
        0x14346b85 -> :sswitch_16
        0x14a018ca -> :sswitch_2
        0x1e9e08f7 -> :sswitch_1
        0x22d0f4c9 -> :sswitch_7
        0x27e24c86 -> :sswitch_9
        0x28a5b564 -> :sswitch_3
        0x28def174 -> :sswitch_8
        0x29885ab6 -> :sswitch_4
        0x45766b2d -> :sswitch_11
        0x476b015f -> :sswitch_e
        0x4ce000a6 -> :sswitch_3
        0x4e46f38f -> :sswitch_10
        0x561670cd -> :sswitch_13
        0x612f47be -> :sswitch_a
        0x62d65720 -> :sswitch_f
        0x64be8e4e -> :sswitch_14
        0x64fd2aa0 -> :sswitch_d
        0x656140c4 -> :sswitch_e
        0x6c3a5a81 -> :sswitch_d
        0x6d3a058d -> :sswitch_15
        0x6de09bab -> :sswitch_10
        0x7c043515 -> :sswitch_2
        0x7e1766c5 -> :sswitch_11
        0x7f162de4 -> :sswitch_b
        0x7f803466 -> :sswitch_6
    .end sparse-switch
.end method
