.class public final Ll/ܿ۟ܽ;
.super Ljava/lang/Object;
.source "U7HQ"

# interfaces
.implements Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;


# static fields
.field private static final ֨ۘܺ:[S


# instance fields
.field public ֫:I

.field public ۜ:I

.field public ۢ:J

.field public ۧ:I

.field public final ܳ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I

.field public final ᩷:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;

.field public ᩻:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܿ۟ܽ;->֨ۘܺ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x252fs
        -0xd33s
    .end array-data
.end method

.method public constructor <init>(Ll/ܳ۟ܽ;ILbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;)V
    .locals 6

    const/4 p1, 0x0

    const v0, 0x5e8322ec

    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    sget v2, Ll/֫ܿ;->ۨ۫ᩳ:I

    .line 175
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06d8\u06e2"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7bb9

    const v5, 0x14570bdc

    xor-int/2addr v4, v5

    const v5, -0x4f376266

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x1649

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 142
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_2

    .line 47
    :sswitch_0
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v3, :cond_6

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    sget v3, Ll/᩹;->ۤܿܳ:I

    if-eqz v3, :cond_b

    goto :goto_1

    .line 91
    :sswitch_2
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    sget v3, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v3, :cond_9

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 177
    :sswitch_5
    iput p2, p0, Ll/ܿ۟ܽ;->ܳ:I

    .line 178
    iput-object p3, p0, Ll/ܿ۟ܽ;->᩷:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;

    return-void

    .line 172
    :sswitch_6
    iput p1, p0, Ll/ܿ۟ܽ;->֫:I

    .line 20
    sget v3, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06eb\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x41

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x418b

    const v5, -0x11bd9065

    xor-int/2addr v4, v5

    const v5, 0x7923b01b

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v3

    if-ltz v3, :cond_1

    :goto_1
    const-string v3, "\u06d8\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x33

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2cdf

    const v5, 0x5802483b

    xor-int/2addr v4, v5

    const v5, 0x4a53e712    # 3471812.5f

    goto :goto_0

    :cond_1
    const-string v3, "\u1a74\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7c0f

    const v5, 0x16821e11

    xor-int/2addr v4, v5

    const v5, -0x66fae71f

    goto/16 :goto_0

    .line 146
    :sswitch_8
    sget-boolean v3, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u1a76\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7ac9

    const v5, 0xfa4f9f

    xor-int/2addr v4, v5

    const v5, 0x25532ff8

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06eb\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3b1f

    const v5, -0x4f37f0ab

    xor-int/2addr v4, v5

    const v5, -0x5b3aba58

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u1a7a\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x198b

    const v5, -0x26c7ac57

    xor-int/2addr v4, v5

    const v5, 0x38dc0626

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v3, :cond_5

    :goto_2
    const-string v3, "\u0736\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x1f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7967

    const v5, -0x2be118cf

    xor-int/2addr v4, v5

    const v5, 0x5366cf9c

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u0736\u06df"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1c77

    const v5, -0x6f3820ef

    xor-int/2addr v4, v5

    const v5, 0x5946f10f

    goto/16 :goto_0

    .line 157
    :sswitch_b
    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-nez v3, :cond_7

    :cond_6
    const-string v3, "\u1a77\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1313

    const v5, 0x560cddc

    xor-int/2addr v4, v5

    const v5, 0x5b27fd14

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06dc\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1c75

    const v5, 0x561fd71d

    xor-int/2addr v4, v5

    const v5, 0x3569e55

    goto/16 :goto_0

    .line 77
    :sswitch_c
    sget v3, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u073a\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5283

    const v5, -0xa2be20a

    xor-int/2addr v4, v5

    const v5, 0x4fd94397    # 7.2901709E9f

    goto/16 :goto_0

    .line 102
    :sswitch_d
    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u06d8\u06da"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x22d1

    const v5, -0x6f5ce16b

    xor-int/2addr v4, v5

    const v5, -0x5ed11529

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u06db\u06d9"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x61

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3d27

    const v5, -0x147fde61

    xor-int/2addr v4, v5

    const v5, 0x75fff36c

    goto/16 :goto_0

    :sswitch_e
    const/4 p1, -0x1

    .line 170
    iput p1, p0, Ll/ܿ۟ܽ;->ܽ:I

    .line 105
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v3

    if-ltz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u05a8\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x45af

    const v5, 0x1b3e7da

    xor-int/2addr v4, v5

    const v5, -0x72e2b1c4

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e7\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x59

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7a2b

    const v5, -0x2f4e598b

    xor-int/2addr v4, v5

    const v5, -0x1d3c7eb7

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f65bdc5 -> :sswitch_4
        -0x7e902b22 -> :sswitch_4
        -0x7e7d52e6 -> :sswitch_1
        -0x7a4c8724 -> :sswitch_3
        -0x632e94cb -> :sswitch_0
        -0x520e331c -> :sswitch_5
        -0x4a4e1dea -> :sswitch_9
        -0x46d84cc0 -> :sswitch_a
        -0x43a0ec42 -> :sswitch_c
        -0x36581e43 -> :sswitch_7
        -0x32da79cf -> :sswitch_6
        -0x28e8dfe9 -> :sswitch_5
        -0x258b3973 -> :sswitch_1
        -0x22a00cb5 -> :sswitch_0
        -0x1b66fcdb -> :sswitch_b
        -0xf19c331 -> :sswitch_8
        -0xb9c1367 -> :sswitch_9
        -0xaf26a1e -> :sswitch_3
        -0x8149a4 -> :sswitch_7
        0x898a980 -> :sswitch_6
        0x11b53dc2 -> :sswitch_c
        0x1e287053 -> :sswitch_8
        0x39d25b91 -> :sswitch_2
        0x41e26b22 -> :sswitch_b
        0x56f8e85e -> :sswitch_d
        0x5775e183 -> :sswitch_a
        0x59de3670 -> :sswitch_e
        0x5d2b356c -> :sswitch_d
        0x61ea729f -> :sswitch_2
        0x747e9819 -> :sswitch_e
    .end sparse-switch
.end method

.method private ֫(CI)I
    .locals 20

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

    const v12, 0x76343b70

    sget v13, Ll/ۖ۫;->ۖ֫ܿ:I

    sget v14, Ll/֫ܿ;->ۨ۫ᩳ:I

    const-string v15, "\u073a\u1a77"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v14

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, 0x5e89

    const v16, 0x16df9337

    xor-int v0, v0, v16

    const v16, -0x20d62543

    xor-int v15, v15, v16

    move-object/from16 v16, v4

    :goto_0
    const/4 v4, 0x0

    :goto_1
    xor-int/2addr v12, v13

    mul-int/lit16 v12, v12, 0x1cb1

    shr-int/lit8 v12, v12, 0x1f

    and-int/2addr v0, v12

    xor-int v12, v15, v0

    sparse-switch v12, :sswitch_data_0

    move/from16 v15, p1

    move-object/from16 v17, v1

    .line 129
    sget-boolean v0, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v0, :cond_c

    goto/16 :goto_8

    :sswitch_0
    sget-boolean v0, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_2
    move/from16 v15, p1

    move-object/from16 v17, v1

    goto/16 :goto_7

    :cond_1
    move/from16 v15, p1

    goto/16 :goto_5

    .line 47
    :sswitch_1
    sget v0, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v0, :cond_2

    goto :goto_2

    :cond_2
    move/from16 v15, p1

    move-object/from16 v17, v1

    goto/16 :goto_9

    .line 143
    :sswitch_2
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    sget v0, Ll/֡᩶;->ܳܶ۠:I

    if-lez v0, :cond_0

    goto :goto_3

    .line 5
    :sswitch_3
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    :goto_3
    const-string v0, "\u0733\u06db"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x1f

    xor-int v15, v0, v14

    mul-int/lit16 v15, v15, 0x4bdd

    const v17, -0x77e288e7

    xor-int v15, v15, v17

    const v17, 0x38bc33d1

    goto :goto_4

    .line 171
    :sswitch_4
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    const/4 v0, 0x0

    return v0

    .line 189
    :sswitch_5
    invoke-interface {v3, v2}, Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;->calculate(Ljava/lang/String;)I

    move-result v0

    return v0

    .line 191
    :sswitch_6
    invoke-static {v2}, Ll/֨֫;->ۡۚܽ(Ljava/lang/Object;)I

    move-result v0

    return v0

    .line 0
    :sswitch_7
    invoke-static {v1, v4, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    .line 188
    iget-object v3, v0, Ll/ܿ۟ܽ;->᩷:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;

    if-eqz v3, :cond_3

    const-string v15, "\u1a7a\u06e4"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    xor-int v0, v15, v14

    mul-int/lit16 v0, v0, -0x6891

    const v17, -0x8ad904

    xor-int v0, v0, v17

    const v17, -0x51d95ee3

    xor-int v15, v15, v17

    goto/16 :goto_1

    :cond_3
    const-string v0, "\u06db\u06eb"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x377f

    const v17, 0x32ae23ab

    xor-int v15, v15, v17

    const v17, 0x5cbe0431

    goto :goto_4

    :sswitch_8
    const/4 v0, 0x1

    const/4 v1, 0x1

    .line 204
    invoke-static {v11, v0, v1, v10}, Ll/ۙۨ;->֡ᩳ᩵([SIII)Ljava/lang/String;

    move-result-object v1

    .line 200
    sget v0, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v0, :cond_4

    move/from16 v15, p1

    goto/16 :goto_a

    :cond_4
    const-string v0, "\u06e7\u06d9"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, -0x3845

    const v17, 0x62de7857

    xor-int v15, v15, v17

    const v17, -0x815faea

    :goto_4
    xor-int v0, v0, v17

    move/from16 v19, v15

    move v15, v0

    move/from16 v0, v19

    goto/16 :goto_1

    :sswitch_9
    move/from16 v0, p2

    .line 202
    new-array v4, v0, [C

    move/from16 v15, p1

    .line 203
    invoke-static {v4, v15}, Ljava/util/Arrays;->fill([CC)V

    .line 204
    new-instance v0, Ljava/lang/String;

    .line 54
    sget-boolean v17, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v17, :cond_5

    :goto_5
    const-string v0, "\u06dc\u06e4"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v4, v0, v14

    mul-int/lit16 v4, v4, 0x5ce3

    const v17, -0x4a72eac6

    xor-int v4, v4, v17

    const v17, -0x109b8ce3

    xor-int v0, v0, v17

    move v15, v0

    move v0, v4

    goto/16 :goto_0

    .line 204
    :cond_5
    invoke-direct {v0, v4}, Ljava/lang/String;-><init>([C)V

    sget-object v11, Ll/ܿ۟ܽ;->֨ۘܺ:[S

    .line 71
    sget v4, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v4, :cond_6

    move-object v4, v0

    goto/16 :goto_a

    :cond_6
    const-string v4, "\u073f\u06e0"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v13

    mul-int/lit8 v4, v4, 0x2f

    move-object/from16 v17, v0

    xor-int v0, v4, v14

    mul-int/lit16 v0, v0, 0x186d

    const v18, -0x222baf00

    xor-int v0, v0, v18

    const v18, 0x19cb66c3

    xor-int v4, v4, v18

    move v15, v4

    move-object/from16 v4, v17

    goto/16 :goto_1

    :sswitch_a
    move/from16 v15, p1

    const v0, 0xde47

    const v10, 0xde47

    goto :goto_6

    :sswitch_b
    move/from16 v15, p1

    const v0, 0xf2c7

    const v10, 0xf2c7

    :goto_6
    const-string v0, "\u06df\u1a75"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x19

    move-object/from16 v17, v1

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x4acb

    const v18, -0x7ca10abb

    xor-int v1, v1, v18

    const v18, 0x9c3fdae

    goto/16 :goto_b

    :sswitch_c
    move/from16 v15, p1

    move-object/from16 v17, v1

    add-int v0, v8, v9

    add-int/2addr v0, v0

    sub-int/2addr v0, v7

    if-ltz v0, :cond_7

    const-string v0, "\u06e1\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x3639

    const v18, 0xd63d4eb

    xor-int v1, v1, v18

    const v18, -0x65fe42c9

    goto/16 :goto_b

    :cond_7
    const-string v0, "\u06df\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x65

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x4453

    const v18, -0x69accb17

    xor-int v1, v1, v18

    const v18, 0x573dd06f

    goto/16 :goto_b

    :sswitch_d
    move/from16 v15, p1

    move-object/from16 v17, v1

    const v9, 0x6066724

    .line 94
    sget-boolean v0, Ll/֨۫;->۬᩷᩶:Z

    if-nez v0, :cond_8

    :goto_7
    const-string v0, "\u1a79\u05a1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x5d

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0xe55

    const v18, 0x3f81a586

    xor-int v1, v1, v18

    const v18, -0xef0e5a0

    goto/16 :goto_b

    :cond_8
    const-string v0, "\u0730\u06eb"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x57

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0xa37

    const v18, -0x6d6cdc9c

    xor-int v1, v1, v18

    const v18, 0x7872d304

    goto/16 :goto_b

    :sswitch_e
    move/from16 v15, p1

    move-object/from16 v17, v1

    add-int v0, v5, v6

    mul-int v7, v0, v0

    mul-int v8, v5, v5

    .line 25
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_8

    :cond_9
    const-string v0, "\u06e1\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x59

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x8e7

    const v18, 0x7f2eda5b

    xor-int v1, v1, v18

    const v18, 0x62427ba7

    goto/16 :goto_b

    :sswitch_f
    move/from16 v15, p1

    move-object/from16 v17, v1

    const/4 v0, 0x0

    aget-short v5, v16, v0

    const/16 v6, 0x2746

    sget v0, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v0, :cond_a

    :goto_8
    move-object/from16 v1, v17

    goto/16 :goto_a

    :cond_a
    const-string v0, "\u05a8\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x6d

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x4a71

    const v18, -0x14795828

    xor-int v1, v1, v18

    const v18, -0x1dff7657

    goto/16 :goto_b

    :sswitch_10
    move/from16 v15, p1

    move-object/from16 v17, v1

    sget-object v16, Ll/ܿ۟ܽ;->֨ۘܺ:[S

    .line 200
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v0

    if-ltz v0, :cond_b

    goto :goto_9

    :cond_b
    const-string v0, "\u05a1\u1a76"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x79

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x4413

    const v18, 0x3cae6909

    xor-int v1, v1, v18

    const v18, -0x3291b454    # -2.4987104E8f

    goto/16 :goto_b

    :cond_c
    const-string v0, "\u1a74\u06df"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x31

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x585d

    const v18, -0x3abcc9db

    xor-int v1, v1, v18

    const v18, 0xd22256

    goto :goto_b

    :sswitch_11
    move/from16 v15, p1

    move-object/from16 v17, v1

    sget-boolean v0, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v0, :cond_d

    :goto_9
    const-string v0, "\u06da\u06db"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, 0x1f

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0xcc5

    const v18, -0x42d7df01

    xor-int v1, v1, v18

    const v18, -0x782a573a

    goto :goto_b

    :cond_d
    const-string v0, "\u073d\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x2b

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0xcf

    const v18, -0x7fafe29b

    xor-int v1, v1, v18

    const v18, 0x3583c74

    goto :goto_b

    :sswitch_12
    move/from16 v15, p1

    move-object/from16 v17, v1

    sget v0, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v0, :cond_e

    goto/16 :goto_8

    :goto_a
    const-string v0, "\u0736\u073f"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x1d

    move-object/from16 v17, v1

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x699b

    const v18, -0x62731fd2

    xor-int v1, v1, v18

    const v18, 0x48d56bcc    # 437086.38f

    goto :goto_b

    :cond_e
    const-string v0, "\u073d\u06d7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x2b

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x3a33

    const v18, -0x77087828

    xor-int v1, v1, v18

    const v18, -0x11590c

    :goto_b
    xor-int v0, v0, v18

    move v15, v0

    move v0, v1

    move-object/from16 v1, v17

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7ddcf075 -> :sswitch_4
        -0x78892e9c -> :sswitch_8
        -0x74f57b09 -> :sswitch_12
        -0x74c525d2 -> :sswitch_11
        -0x655b5777 -> :sswitch_a
        -0x5c36820d -> :sswitch_7
        -0x52468cea -> :sswitch_9
        -0x481c02f4 -> :sswitch_2
        -0x463d0653 -> :sswitch_b
        -0x45105128 -> :sswitch_8
        -0x3f092b34 -> :sswitch_0
        -0x3e44f98c -> :sswitch_c
        -0x32360094 -> :sswitch_10
        -0x30ee258a -> :sswitch_e
        -0x2fa2510b -> :sswitch_4
        -0x2f2e5211 -> :sswitch_7
        -0x19f91e48 -> :sswitch_3
        -0x107378c2 -> :sswitch_0
        -0xa84b232 -> :sswitch_12
        -0x917e99e -> :sswitch_f
        0x89d7b76 -> :sswitch_6
        0x104390d8 -> :sswitch_c
        0x11a59ad5 -> :sswitch_b
        0x11b68f12 -> :sswitch_d
        0x24180dd6 -> :sswitch_a
        0x258152e3 -> :sswitch_5
        0x2a3dfc9a -> :sswitch_1
        0x3188abf5 -> :sswitch_e
        0x369bbfb0 -> :sswitch_6
        0x3caa1ffb -> :sswitch_d
        0x3dfd6f65 -> :sswitch_2
        0x440542a7 -> :sswitch_10
        0x44b74b3f -> :sswitch_11
        0x553bd000 -> :sswitch_9
        0x64c060c1 -> :sswitch_1
        0x77f782f9 -> :sswitch_f
        0x7894eb38 -> :sswitch_5
        0x7ed68e43 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final reset()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x5dfff378

    sget v3, Ll/ۘۨ;->۫᩸۠:I

    sget v4, Ll/ۨ;->᩺᩷ۚ:I

    const-string v5, "\u1a7b\u06ec"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4cbd

    const v7, -0x3b243b86

    xor-int/2addr v6, v7

    const v7, 0x2c10141b

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x329b

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 214
    iput v1, p0, Ll/ܿ۟ܽ;->ܽ:I

    .line 215
    iput v1, p0, Ll/ܿ۟ܽ;->֫:I

    return-void

    :sswitch_0
    sget v5, Ll/۠;->ܺܺܶ:I

    if-gez v5, :cond_0

    goto :goto_1

    :cond_0
    const-string v5, "\u06d6\u06e4"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x55

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x649f

    const v7, -0x6733e649

    xor-int/2addr v6, v7

    const v7, -0x5327b2b

    goto :goto_0

    .line 202
    :sswitch_1
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v5

    if-nez v5, :cond_b

    goto/16 :goto_2

    .line 198
    :sswitch_2
    sget v5, Ll/֡ܶ;->ᩴܿ᩸:I

    if-gez v5, :cond_6

    goto :goto_1

    .line 115
    :sswitch_3
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    :goto_1
    const-string v5, "\u06d7\u05ab"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x2f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5971

    const v7, -0x5e64e52b

    xor-int/2addr v6, v7

    const v7, -0x62338eb0

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    return-void

    :sswitch_5
    const/4 v1, -0x1

    .line 68
    sget v5, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v5, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v5, "\u06dc\u073a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x1f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5275

    const v7, -0x2616f5c8

    xor-int/2addr v6, v7

    const v7, 0x3cb45c91

    goto :goto_0

    .line 212
    :sswitch_6
    iput v0, p0, Ll/ܿ۟ܽ;->ۜ:I

    .line 213
    iput v0, p0, Ll/ܿ۟ܽ;->᩻:I

    .line 172
    sget-boolean v5, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v5, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v5, "\u1a7a\u06d9"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x3d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x11c5

    const v7, 0x8e027a2

    xor-int/2addr v6, v7

    const v7, 0x62c095b5

    goto/16 :goto_0

    :sswitch_7
    const-wide/16 v5, 0x0

    .line 211
    iput-wide v5, p0, Ll/ܿ۟ܽ;->ۢ:J

    .line 124
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v5

    if-eqz v5, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v5, "\u06d9\u05ab"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x79

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x96d

    const v7, -0x785be741

    xor-int/2addr v6, v7

    const v7, -0x55cfb0d8

    goto/16 :goto_0

    .line 210
    :sswitch_8
    iput v0, p0, Ll/ܿ۟ܽ;->ܿ:I

    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v5

    if-nez v5, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v5, "\u06d8\u06e1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x137

    const v7, -0x87db82e

    xor-int/2addr v6, v7

    const v7, 0x4f735ed8

    goto/16 :goto_0

    .line 60
    :sswitch_9
    sget v5, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v5, :cond_5

    goto :goto_2

    :cond_5
    const-string v5, "\u05a1\u073f"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5505

    const v7, 0x6278c0bd

    xor-int/2addr v6, v7

    const v7, -0x54dbb186

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v5

    if-eqz v5, :cond_7

    :cond_6
    :goto_2
    const-string v5, "\u06e2\u06da"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x5b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x25c3

    const v7, -0x65d6f543

    xor-int/2addr v6, v7

    const v7, -0x12657897

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u1a73\u073a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x61d1

    const v7, 0x5ba961e6

    xor-int/2addr v6, v7

    const v7, 0x2f436af9

    goto/16 :goto_0

    .line 31
    :sswitch_b
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v5

    if-gtz v5, :cond_8

    goto :goto_3

    :cond_8
    const-string v5, "\u06e1\u06ec"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x29

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2fa7

    const v7, -0x796f377d

    xor-int/2addr v6, v7

    const v7, 0xcbf6dd2

    goto/16 :goto_0

    .line 18
    :sswitch_c
    sget-boolean v5, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v5, :cond_9

    :goto_3
    const-string v5, "\u1a76\u073f"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x761b

    const v7, -0x267eef3a

    xor-int/2addr v6, v7

    const v7, -0x7df0d71d

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u06e2\u1a79"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7391

    const v7, -0x2fc0a736

    xor-int/2addr v6, v7

    const v7, 0x2b637482

    goto/16 :goto_0

    .line 106
    :sswitch_d
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v5

    if-nez v5, :cond_a

    goto :goto_4

    :cond_a
    const-string v5, "\u1a79\u06d9"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xa3b

    const v7, -0x626725d0

    xor-int/2addr v6, v7

    const v7, -0x11d43544

    goto/16 :goto_0

    :sswitch_e
    const/4 v0, 0x0

    .line 134
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v5

    if-nez v5, :cond_c

    :cond_b
    :goto_4
    const-string v5, "\u06d6\u1a76"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5d39

    const v7, 0x2f987eb0

    xor-int/2addr v6, v7

    const v7, 0x242ad1db

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06ec\u1a74"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x11

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x24ab

    const v7, -0x4600aecb

    xor-int/2addr v6, v7

    const v7, 0xcf79ccf

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7aed5abd -> :sswitch_9
        -0x791c729a -> :sswitch_5
        -0x791b1b43 -> :sswitch_e
        -0x7720bc17 -> :sswitch_1
        -0x566f5c3c -> :sswitch_7
        -0x55ca937f -> :sswitch_b
        -0x47b2ab5f -> :sswitch_2
        -0x3e759688 -> :sswitch_6
        -0x3d7c12c3 -> :sswitch_c
        -0x3d36e652 -> :sswitch_2
        -0x365c8835 -> :sswitch_9
        -0x350ff621 -> :sswitch_e
        -0x2f37cb67 -> :sswitch_0
        -0x146f4a4a -> :sswitch_8
        -0x13efe466 -> :sswitch_5
        -0x9c381c4 -> :sswitch_a
        -0x1e87b49 -> :sswitch_4
        -0xb64397 -> :sswitch_b
        0xe474bbd -> :sswitch_a
        0x124a372e -> :sswitch_6
        0x12dae736 -> :sswitch_7
        0x1b80abc9 -> :sswitch_4
        0x1db4386c -> :sswitch_d
        0x273d7803 -> :sswitch_3
        0x3a02d600 -> :sswitch_c
        0x59f21912 -> :sswitch_d
        0x64ef357f -> :sswitch_0
        0x7775d67b -> :sswitch_1
        0x78c8d2fd -> :sswitch_3
        0x7f0edcf8 -> :sswitch_8
    .end sparse-switch
.end method

.method public final tryAdd(Ljava/lang/String;)Z
    .locals 48

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

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const-wide/16 v30, 0x0

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const v40, -0x3647afb1

    sget v41, Ll/ۘۘ;->᩷ۙ᩸:I

    sget v42, Ll/ۨ;->᩺᩷ۚ:I

    const-string v43, "\u06d6\u1a76"

    invoke-static/range {v43 .. v43}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v43

    add-int v43, v43, v41

    mul-int/lit8 v43, v43, -0x2d

    xor-int v2, v43, v42

    mul-int/lit16 v2, v2, -0x516b

    const v45, -0x2309cfea

    xor-int v2, v2, v45

    const v45, -0x557fc2b6

    xor-int v43, v43, v45

    move-object/from16 v21, v4

    move-wide/from16 v26, v25

    move-wide/from16 v33, v32

    move/from16 v44, v43

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

    const/16 v22, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const v43, -0x3647afb1

    move-wide/from16 v24, v23

    move-wide/from16 v31, v30

    const/16 v23, 0x0

    move-wide/from16 v29, v28

    const/16 v28, 0x0

    :goto_0
    xor-int v1, v43, v42

    mul-int/lit16 v1, v1, -0x6dd7

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v2

    xor-int v43, v44, v1

    sparse-switch v43, :sswitch_data_0

    move-object/from16 v1, p1

    move/from16 v45, v15

    move/from16 v15, v36

    move/from16 v36, v3

    .line 249
    iget v2, v0, Ll/ܿ۟ܽ;->ۜ:I

    invoke-static {v2, v13}, Ll/֡ۜ;->۟᩻۠(II)I

    move-result v14

    .line 250
    iget v2, v0, Ll/ܿ۟ܽ;->᩻:I

    move/from16 v3, v45

    invoke-static {v2, v3}, Ll/ۘۨ;->᩺۬֨(II)I

    move-result v6

    .line 14
    sget-boolean v2, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v2, :cond_17

    goto/16 :goto_14

    .line 54
    :sswitch_0
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    move-object/from16 v1, p1

    move/from16 v45, v15

    move v15, v3

    move/from16 v3, v23

    goto/16 :goto_12

    .line 193
    :sswitch_1
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    sget v1, Ll/᩹;->ۤܿܳ:I

    if-eqz v1, :cond_2

    :cond_1
    :goto_1
    move-object/from16 v1, p1

    move/from16 v45, v15

    move/from16 v15, v36

    :goto_2
    move/from16 v36, v3

    goto/16 :goto_16

    :cond_2
    move-object/from16 v1, p1

    move/from16 v47, v36

    move/from16 v36, v3

    move v3, v15

    move/from16 v15, v47

    goto/16 :goto_14

    .line 233
    :sswitch_2
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v1, :cond_3

    goto :goto_1

    :cond_3
    move/from16 v45, v15

    goto/16 :goto_e

    .line 126
    :sswitch_3
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v1

    if-eqz v1, :cond_1

    :cond_4
    move/from16 v44, v14

    move/from16 v45, v15

    goto/16 :goto_8

    .line 94
    :sswitch_4
    sget v1, Ll/֨۟;->᩹֫᩷:I

    if-nez v1, :cond_6

    :cond_5
    :goto_3
    move-object/from16 v1, p1

    move/from16 v45, v15

    move/from16 v15, v36

    move/from16 v36, v3

    goto/16 :goto_13

    :cond_6
    move/from16 v45, v15

    move/from16 v1, v19

    move-object/from16 v19, v21

    move/from16 v15, v36

    move/from16 v36, v3

    goto/16 :goto_1e

    .line 156
    :sswitch_5
    sget-boolean v1, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v1, :cond_7

    goto :goto_3

    :cond_7
    :goto_4
    const-string v1, "\u06da\u05a8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, 0x797b

    const v44, 0x1e6b4063

    xor-int v2, v2, v44

    const v44, -0x3312b562

    goto :goto_7

    :sswitch_6
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v1

    if-gez v1, :cond_4

    goto :goto_3

    .line 246
    :sswitch_7
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    sget v1, Ll/ۛ;->᩺᩻֫:I

    if-gez v1, :cond_5

    :goto_5
    move/from16 v45, v15

    goto/16 :goto_d

    .line 169
    :sswitch_8
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    goto :goto_5

    .line 65
    :sswitch_9
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    const/4 v1, 0x0

    return v1

    :sswitch_a
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v1, p1

    move/from16 v15, v36

    move/from16 v2, v37

    move/from16 v35, v38

    move/from16 v13, v39

    move/from16 v28, v40

    move/from16 v36, v3

    goto/16 :goto_15

    :sswitch_b
    add-int v1, v35, v11

    if-le v1, v15, :cond_8

    move/from16 v37, v1

    move/from16 v38, v37

    goto :goto_6

    :cond_8
    move/from16 v38, v1

    move/from16 v37, v15

    goto :goto_6

    :sswitch_c
    const/4 v1, 0x0

    move/from16 v37, v15

    const/16 v38, 0x0

    :goto_6
    const-string v1, "\u06ec\u05a1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, 0x3381

    const v44, 0x2196c7b9

    xor-int v2, v2, v44

    const v44, 0x25bf5948

    :goto_7
    xor-int v44, v1, v44

    goto/16 :goto_0

    .line 260
    :sswitch_d
    invoke-direct {v0, v9, v5}, Ll/ܿ۟ܽ;->֫(CI)I

    move-result v1

    iput v1, v0, Ll/ܿ۟ܽ;->ۧ:I

    .line 261
    iput v5, v0, Ll/ܿ۟ܽ;->֫:I

    move/from16 v44, v14

    move/from16 v45, v15

    goto/16 :goto_9

    :sswitch_e
    add-long v1, v33, v31

    move/from16 v44, v14

    move/from16 v45, v15

    int-to-long v14, v4

    cmp-long v46, v1, v14

    if-lez v46, :cond_9

    move-object/from16 v2, v21

    move/from16 v15, v36

    move/from16 v14, v44

    move/from16 v36, v3

    move/from16 v3, v19

    goto/16 :goto_1b

    :cond_9
    move-object/from16 v1, p1

    move/from16 v15, v36

    move/from16 v14, v44

    goto/16 :goto_11

    :sswitch_f
    move/from16 v44, v14

    move/from16 v45, v15

    .line 264
    iget v1, v0, Ll/ܿ۟ܽ;->ܿ:I

    int-to-long v1, v1

    mul-long v33, v1, v29

    .line 129
    sget v1, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v1, :cond_a

    :goto_8
    const-string v1, "\u05ab\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, 0x2961

    const v14, 0x7815825f

    xor-int/2addr v2, v14

    const v14, 0x14d7d7fe

    goto/16 :goto_c

    :cond_a
    const-string v1, "\u073f\u06d8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, -0x64c7

    const v14, 0x1f0b0d14

    xor-int/2addr v2, v14

    const v14, -0x683c7ac9

    goto/16 :goto_c

    :sswitch_10
    move/from16 v44, v14

    move/from16 v45, v15

    .line 264
    iget-wide v1, v0, Ll/ܿ۟ܽ;->ۢ:J

    int-to-long v14, v8

    add-long v31, v1, v14

    .line 213
    sget v1, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v1, :cond_b

    const-string v1, "\u0730\u1a7b"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    mul-int/lit8 v1, v1, -0x77

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, 0x66f3

    const v14, -0x269f89d9

    xor-int/2addr v2, v14

    const v14, -0x46472497

    goto/16 :goto_c

    :cond_b
    const-string v1, "\u1a76\u06e7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, 0x76f3

    const v14, -0x30eed5e1

    xor-int/2addr v2, v14

    const v14, -0x240bf643

    goto/16 :goto_c

    :sswitch_11
    move/from16 v44, v14

    move/from16 v45, v15

    .line 263
    iget v1, v0, Ll/ܿ۟ܽ;->ᩳ:I

    iget v2, v0, Ll/ܿ۟ܽ;->ۧ:I

    invoke-static {v1, v2}, Ll/֡ۜ;->۟᩻۠(II)I

    move-result v1

    int-to-long v1, v1

    .line 115
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v14

    if-nez v14, :cond_c

    move-wide/from16 v29, v1

    move/from16 v15, v36

    move/from16 v14, v44

    move-object/from16 v1, p1

    goto/16 :goto_2

    :cond_c
    const-string v14, "\u0736\u1a75"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int v14, v14, v42

    xor-int v15, v14, v41

    mul-int/lit16 v15, v15, 0x6a4f

    const v29, 0x7ce63133

    xor-int v15, v15, v29

    const v29, -0x45edfab3

    xor-int v14, v14, v29

    move-wide/from16 v29, v1

    move v2, v15

    move/from16 v15, v45

    move/from16 v47, v44

    move/from16 v44, v14

    move/from16 v14, v47

    goto/16 :goto_0

    :sswitch_12
    move/from16 v44, v14

    move/from16 v45, v15

    if-ne v7, v9, :cond_d

    const-string v1, "\u1a77\u06db"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    mul-int/lit8 v1, v1, -0x79

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, 0x600f

    const v14, 0x2a749dbf

    xor-int/2addr v2, v14

    const v14, 0x10a4376d

    goto/16 :goto_c

    :cond_d
    const-string v1, "\u1a7a\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    mul-int/lit8 v1, v1, 0x45

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, 0x7a2b

    const v14, -0x15612fb4

    xor-int/2addr v2, v14

    const v14, 0x40ee0cda

    goto/16 :goto_c

    :sswitch_13
    move/from16 v44, v14

    move/from16 v45, v15

    .line 256
    invoke-direct {v0, v10, v3}, Ll/ܿ۟ܽ;->֫(CI)I

    move-result v1

    iput v1, v0, Ll/ܿ۟ܽ;->ᩳ:I

    .line 257
    iput v3, v0, Ll/ܿ۟ܽ;->ܽ:I

    goto/16 :goto_b

    :sswitch_14
    move/from16 v44, v14

    move/from16 v45, v15

    .line 259
    iget v1, v0, Ll/ܿ۟ܽ;->֫:I

    if-eq v5, v1, :cond_e

    const-string v1, "\u06e1\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    mul-int/lit8 v1, v1, 0x1b

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x8d9

    const v14, 0x6ae44ad6

    xor-int/2addr v2, v14

    const v14, -0x4fe595e1

    goto/16 :goto_c

    :cond_e
    :goto_9
    const-string v1, "\u06e8\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, 0x3db9

    const v14, 0x2425f3c

    xor-int/2addr v2, v14

    const v14, 0x37ef5098

    goto :goto_c

    :sswitch_15
    move/from16 v44, v14

    move/from16 v45, v15

    add-int v1, v28, v11

    if-le v1, v13, :cond_f

    move/from16 v39, v1

    move/from16 v40, v39

    goto :goto_a

    :cond_f
    move/from16 v40, v1

    move/from16 v39, v13

    goto :goto_a

    :sswitch_16
    move/from16 v44, v14

    move/from16 v45, v15

    const/4 v1, 0x0

    move/from16 v39, v13

    const/16 v40, 0x0

    :goto_a
    const-string v1, "\u1a78\u0736"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v41

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, 0xe73

    const v14, -0x9d6f880

    xor-int/2addr v2, v14

    const v14, 0x2d5f7cf4

    goto :goto_c

    :sswitch_17
    move/from16 v44, v14

    move/from16 v45, v15

    .line 255
    iget v1, v0, Ll/ܿ۟ܽ;->ܽ:I

    if-eq v3, v1, :cond_10

    const-string v1, "\u06d6\u06d8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    mul-int/lit8 v1, v1, 0x2f

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x83f

    const v14, -0x158757db

    xor-int/2addr v2, v14

    const v14, -0x6af3d8c6

    goto :goto_c

    :cond_10
    :goto_b
    const-string v1, "\u1a7b\u1a76"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, 0x6b95

    const v14, 0x3ffda7

    xor-int/2addr v2, v14

    const v14, -0x461f467c

    :goto_c
    xor-int/2addr v1, v14

    move/from16 v14, v44

    move/from16 v15, v45

    move/from16 v44, v1

    goto/16 :goto_0

    :sswitch_18
    move/from16 v44, v14

    add-long v1, v24, v26

    .line 271
    iput-wide v1, v0, Ll/ܿ۟ܽ;->ۢ:J

    .line 272
    iput v14, v0, Ll/ܿ۟ܽ;->ۜ:I

    .line 273
    iput v6, v0, Ll/ܿ۟ܽ;->᩻:I

    return v11

    :sswitch_19
    move/from16 v45, v15

    .line 271
    iget-wide v1, v0, Ll/ܿ۟ܽ;->ۢ:J

    move-wide/from16 v24, v1

    int-to-long v1, v8

    .line 2
    sget v15, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v15, :cond_11

    move-wide/from16 v26, v1

    :goto_d
    const-string v1, "\u1a74\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v41, v1

    mul-int/lit8 v1, v1, 0x75

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, -0x1f49

    const v15, -0x7ec8c7b

    xor-int/2addr v2, v15

    const v15, -0x255cfd2f

    goto :goto_f

    :cond_11
    const-string v15, "\u0733\u06d8"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    add-int v15, v15, v41

    mul-int/lit8 v15, v15, 0x7f

    move-wide/from16 v26, v1

    xor-int v1, v15, v42

    mul-int/lit16 v1, v1, 0x1629

    const v2, 0xfc23a70

    xor-int/2addr v2, v1

    const v1, 0x2ed72b7

    xor-int v44, v15, v1

    goto/16 :goto_21

    :sswitch_1a
    move/from16 v45, v15

    .line 270
    iget v1, v0, Ll/ܿ۟ܽ;->ܿ:I

    add-int/2addr v1, v11

    iput v1, v0, Ll/ܿ۟ܽ;->ܿ:I

    .line 207
    sget v1, Ll/۠;->ܺܺܶ:I

    if-ltz v1, :cond_12

    :goto_e
    const-string v1, "\u06e0\u06df"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v41, v1

    mul-int/lit8 v1, v1, -0x3d

    xor-int v2, v1, v42

    mul-int/lit16 v2, v2, 0x73b1

    const v15, -0x2e1b7993

    xor-int/2addr v2, v15

    const v15, 0x4221cde2

    goto :goto_f

    :cond_12
    const-string v1, "\u06e0\u1a79"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, 0x783f

    const v15, 0x41ce9e34

    xor-int/2addr v2, v15

    const v15, 0x68e33700

    :goto_f
    xor-int v44, v1, v15

    goto/16 :goto_21

    :sswitch_1b
    move-object/from16 v1, p1

    move/from16 v45, v15

    .line 230
    invoke-static {v1, v12}, Ll/֫ۡ;->ܰ᩷ܺ(Ljava/lang/Object;I)C

    move-result v7

    if-ne v7, v10, :cond_13

    const-string v2, "\u0730\u06d7"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v41

    mul-int/lit8 v2, v2, 0x65

    xor-int v15, v2, v42

    mul-int/lit16 v15, v15, 0x77ff

    const v44, -0x57326ae2

    xor-int v15, v15, v44

    const v44, -0x2b1e207e

    goto :goto_10

    :cond_13
    const-string v2, "\u06e8\u06e4"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v41

    xor-int v15, v2, v42

    mul-int/lit16 v15, v15, -0x8dd

    const v44, -0x2792e287

    xor-int v15, v15, v44

    const v44, -0x469e94a8

    :goto_10
    xor-int v44, v2, v44

    move v2, v15

    goto/16 :goto_21

    :sswitch_1c
    move-object/from16 v1, p1

    move/from16 v45, v15

    add-int v2, v6, v20

    move/from16 v15, v36

    .line 252
    invoke-static {v15, v2}, Ll/ۘۨ;->᩺۬֨(II)I

    move-result v5

    .line 254
    iget v4, v0, Ll/ܿ۟ܽ;->ܳ:I

    if-lez v4, :cond_14

    const-string v2, "\u0733\u06e4"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v42, v2

    mul-int/lit8 v2, v2, -0x39

    move/from16 v36, v3

    xor-int v3, v2, v41

    mul-int/lit16 v3, v3, -0x610b

    const v44, 0x22f9a37e

    xor-int v3, v3, v44

    const v44, -0x42f776dd

    goto/16 :goto_17

    :cond_14
    :goto_11
    move/from16 v36, v3

    const-string v2, "\u1a75\u0733"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v42

    mul-int/lit8 v2, v2, -0x37

    xor-int v3, v2, v41

    mul-int/lit16 v3, v3, 0x2cd3

    const v44, -0x516653d5

    xor-int v3, v3, v44

    const v44, 0x44849157

    goto/16 :goto_17

    :sswitch_1d
    move-object/from16 v1, p1

    move/from16 v45, v15

    const/16 v2, 0x8

    move/from16 v3, v23

    .line 251
    invoke-static {v2, v3}, Ll/֡ۜ;->۟᩻۠(II)I

    move-result v15

    const/16 v20, 0x1

    .line 271
    sget v23, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v23, :cond_15

    const/16 v36, 0x8

    :goto_12
    const-string v2, "\u06e2\u06d8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v41, v2

    mul-int/lit8 v2, v2, 0x21

    move/from16 v23, v3

    xor-int v3, v2, v42

    mul-int/lit16 v3, v3, 0x591b

    const v44, -0x1e2f197d

    xor-int v3, v3, v44

    const v44, 0x3b6c0c23

    xor-int v44, v2, v44

    move v2, v3

    move v3, v15

    goto/16 :goto_21

    :cond_15
    move/from16 v23, v3

    const-string v3, "\u073f\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v42

    xor-int v2, v3, v41

    mul-int/lit16 v2, v2, 0x3ecf

    const v44, 0x35129538

    xor-int v2, v2, v44

    const v44, -0x478dfc78

    xor-int v44, v3, v44

    move v3, v15

    move/from16 v15, v45

    const/16 v36, 0x8

    goto/16 :goto_0

    :sswitch_1e
    move-object/from16 v1, p1

    move/from16 v45, v15

    move/from16 v15, v36

    move/from16 v36, v3

    add-int/lit8 v23, v14, 0x1

    sget-boolean v2, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v2, :cond_16

    :goto_13
    const-string v2, "\u06eb\u05a8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v42

    xor-int v3, v2, v41

    mul-int/lit16 v3, v3, 0x77fd

    const v44, -0x7b1a0cef

    xor-int v3, v3, v44

    const v44, 0x1bd35ee1

    goto/16 :goto_17

    :cond_16
    const-string v2, "\u06e2\u1a77"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v41

    xor-int v3, v2, v42

    mul-int/lit16 v3, v3, 0x5493

    const v44, 0x5f4baefb

    xor-int v3, v3, v44

    const v44, -0x717135b6    # -3.52005E-30f

    goto/16 :goto_17

    :goto_14
    const-string v2, "\u1a7b\u06d7"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v42, v2

    mul-int/lit8 v2, v2, 0x3b

    move/from16 v45, v3

    xor-int v3, v2, v41

    mul-int/lit16 v3, v3, -0x5f59

    const v44, -0x272731aa

    xor-int v3, v3, v44

    const v44, 0x2d12a304

    goto/16 :goto_17

    :cond_17
    move/from16 v45, v3

    const-string v2, "\u073f\u06df"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v41

    xor-int v3, v2, v42

    mul-int/lit16 v3, v3, 0xf3d

    const v44, 0x2aa407ad

    xor-int v3, v3, v44

    const v44, -0x6b215d08

    goto/16 :goto_17

    :sswitch_1f
    move-object/from16 v1, p1

    move/from16 v45, v15

    move/from16 v15, v36

    move/from16 v36, v3

    .line 229
    invoke-static/range {p1 .. p1}, Ll/֫ۡ;->᩻ܳܽ(Ljava/lang/Object;)I

    move-result v2

    const/16 v9, 0x2d

    const/16 v10, 0x3d

    const/4 v11, 0x1

    if-ge v12, v2, :cond_18

    const-string v2, "\u1a75\u06eb"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v41

    xor-int v3, v2, v42

    mul-int/lit16 v3, v3, 0x23e7

    const v44, 0x3bc5e729

    xor-int v3, v3, v44

    const v44, 0x11c3f7ec

    goto/16 :goto_17

    :cond_18
    const-string v2, "\u06e8\u1a74"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v42, v2

    mul-int/lit8 v2, v2, 0x57

    xor-int v3, v2, v41

    mul-int/lit16 v3, v3, 0x1279

    const v44, 0x348a7fd0

    xor-int v3, v3, v44

    const v44, 0x6d3a4cfc

    goto/16 :goto_17

    :sswitch_20
    move-object/from16 v1, p1

    move/from16 v15, v36

    move/from16 v36, v3

    const/4 v2, 0x0

    const/4 v3, 0x0

    move/from16 v12, v16

    move/from16 v13, v17

    move/from16 v2, v18

    const/16 v28, 0x0

    const/16 v35, 0x0

    :goto_15
    const-string v3, "\u06d6\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v41, v3

    mul-int/lit8 v3, v3, 0x1f

    move/from16 v44, v2

    xor-int v2, v3, v42

    mul-int/lit16 v2, v2, 0x59b5

    const v45, -0x56aa306e

    xor-int v2, v2, v45

    const v45, -0x71078b8b

    xor-int v3, v3, v45

    move/from16 v47, v44

    move/from16 v44, v3

    move/from16 v3, v36

    move/from16 v36, v15

    move/from16 v15, v47

    goto/16 :goto_0

    :sswitch_21
    move-object/from16 v1, p1

    move/from16 v45, v15

    move/from16 v15, v36

    move/from16 v36, v3

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    .line 53
    sget v2, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v2, :cond_19

    :goto_16
    const-string v2, "\u1a78\u073a"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v42

    xor-int v3, v2, v41

    mul-int/lit16 v3, v3, -0x4def

    const v44, 0x52272e4d

    xor-int v3, v3, v44

    const v44, -0x48d65191

    goto :goto_17

    :cond_19
    const-string v2, "\u05a8\u073d"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v42

    xor-int v3, v2, v41

    mul-int/lit16 v3, v3, -0x5c57

    const v44, 0x736ae399

    xor-int v3, v3, v44

    const v44, 0x13ec5956

    :goto_17
    xor-int v44, v2, v44

    goto/16 :goto_1a

    :sswitch_22
    return v22

    :sswitch_23
    move-object/from16 v1, p1

    move/from16 v45, v15

    move-object/from16 v2, v21

    move/from16 v15, v36

    move/from16 v36, v3

    .line 189
    invoke-interface {v2, v1}, Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;->calculate(Ljava/lang/String;)I

    move-result v3

    goto :goto_18

    :sswitch_24
    move-object/from16 v1, p1

    move/from16 v45, v15

    move-object/from16 v2, v21

    move/from16 v15, v36

    move/from16 v36, v3

    .line 191
    invoke-static/range {p1 .. p1}, Ll/֫ۡ;->᩻ܳܽ(Ljava/lang/Object;)I

    move-result v3

    :goto_18
    move v8, v3

    const-string v3, "\u073d\u0733"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v41

    xor-int v1, v3, v42

    mul-int/lit16 v1, v1, -0x6dcd

    const v21, 0x7298756d

    xor-int v1, v1, v21

    const v21, -0x1578ad71

    xor-int v44, v3, v21

    move-object/from16 v21, v2

    move/from16 v3, v36

    move v2, v1

    goto/16 :goto_20

    :sswitch_25
    move/from16 v45, v15

    move/from16 v15, v36

    move/from16 v36, v3

    .line 188
    iget-object v1, v0, Ll/ܿ۟ܽ;->᩷:Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;

    if-eqz v1, :cond_1a

    const-string v2, "\u1a77\u06d9"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v41

    xor-int v3, v2, v42

    mul-int/lit16 v3, v3, -0x3a59

    const v21, -0x1cdccefc

    xor-int v3, v3, v21

    const v21, -0x322fc71a

    goto :goto_19

    :cond_1a
    const-string v2, "\u06d8\u073d"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v42

    xor-int v3, v2, v41

    mul-int/lit16 v3, v3, -0x2b19

    const v21, -0x2a10da04

    xor-int v3, v3, v21

    const v21, -0x6448d0fe

    :goto_19
    xor-int v44, v2, v21

    move-object/from16 v21, v1

    :goto_1a
    move v2, v3

    goto :goto_1d

    :sswitch_26
    move/from16 v45, v15

    move-object/from16 v2, v21

    move/from16 v15, v36

    move/from16 v36, v3

    const/16 v1, 0x64

    const/16 v22, 0x0

    move/from16 v3, v19

    if-lt v3, v1, :cond_1b

    :goto_1b
    const-string v1, "\u06e4\u0733"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    move-object/from16 v19, v2

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, 0x7759

    const v21, 0x60b1df3e

    xor-int v2, v2, v21

    const v21, 0x521c5c42

    goto :goto_1c

    :cond_1b
    move-object/from16 v19, v2

    const-string v1, "\u06db\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v42

    xor-int v2, v1, v41

    mul-int/lit16 v2, v2, -0x64e9

    const v21, -0x91ba761

    xor-int v2, v2, v21

    const v21, -0x56cabfdc

    :goto_1c
    xor-int v44, v1, v21

    move-object/from16 v21, v19

    move/from16 v19, v3

    :goto_1d
    move/from16 v3, v36

    goto :goto_20

    :sswitch_27
    move/from16 v45, v15

    move-object/from16 v19, v21

    move/from16 v15, v36

    move/from16 v36, v3

    .line 220
    iget v1, v0, Ll/ܿ۟ܽ;->ܿ:I

    .line 45
    sget-boolean v2, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v2, :cond_1c

    :goto_1e
    const-string v2, "\u06db\u06e8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v41

    xor-int v3, v2, v42

    mul-int/lit16 v3, v3, -0x4943

    const v21, -0x171d30f4

    xor-int v3, v3, v21

    const v21, -0x75d1d8cd

    goto :goto_1f

    :cond_1c
    const-string v2, "\u05a1\u06e2"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v41, v2

    mul-int/lit8 v2, v2, 0x29

    xor-int v3, v2, v42

    mul-int/lit16 v3, v3, 0xda1

    const v21, 0xc3028bf

    xor-int v3, v3, v21

    const v21, -0x7ba0ccfb

    :goto_1f
    xor-int v44, v2, v21

    move v2, v3

    move-object/from16 v21, v19

    move/from16 v3, v36

    move/from16 v19, v1

    :goto_20
    move/from16 v36, v15

    :goto_21
    move/from16 v15, v45

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7a6b6063 -> :sswitch_7
        -0x79c9584f -> :sswitch_22
        -0x75b3dbb9 -> :sswitch_0
        -0x71825e74 -> :sswitch_27
        -0x6c52ae16 -> :sswitch_6
        -0x676496ad -> :sswitch_3
        -0x65ba368d -> :sswitch_5
        -0x656446b3 -> :sswitch_8
        -0x60e705ce -> :sswitch_13
        -0x594f738b -> :sswitch_1e
        -0x58ab8cd7 -> :sswitch_c
        -0x57ca43db -> :sswitch_b
        -0x5686c0c3 -> :sswitch_27
        -0x524f7150 -> :sswitch_15
        -0x5201ce97 -> :sswitch_26
        -0x50ecc83b -> :sswitch_1d
        -0x47614651 -> :sswitch_1b
        -0x4336005b -> :sswitch_19
        -0x42a822fe -> :sswitch_d
        -0x41f06f4c -> :sswitch_1
        -0x41a51ea2 -> :sswitch_9
        -0x3c97b54a -> :sswitch_11
        -0x38393701 -> :sswitch_20
        -0x36151a7c -> :sswitch_2
        -0x30065a40 -> :sswitch_8
        -0x2f6d5073 -> :sswitch_d
        -0x2ec7bb70 -> :sswitch_a
        -0x2a988761 -> :sswitch_4
        -0x2974be71 -> :sswitch_10
        -0x2655b23a -> :sswitch_0
        -0x26247959 -> :sswitch_12
        -0x241796d7 -> :sswitch_19
        -0x20b8b6fd -> :sswitch_1a
        -0x2089a558 -> :sswitch_23
        -0x1faf23c6 -> :sswitch_7
        -0x1ea5ac37 -> :sswitch_2
        -0x1ab8f2e9 -> :sswitch_1b
        -0xad7cbe9 -> :sswitch_16
        -0x6050458 -> :sswitch_3
        0x7b8913 -> :sswitch_1c
        0x4ba5ee1 -> :sswitch_22
        0xaa89bcd -> :sswitch_a
        0xf095e4f -> :sswitch_1f
        0xfdd15b0 -> :sswitch_f
        0x115b0bfa -> :sswitch_12
        0x12ad8a06 -> :sswitch_1f
        0x15a023cb -> :sswitch_18
        0x18c7b7ac -> :sswitch_6
        0x1a328882 -> :sswitch_9
        0x1daffada -> :sswitch_25
        0x1e0074f4 -> :sswitch_21
        0x24a99e86 -> :sswitch_26
        0x25947988 -> :sswitch_11
        0x28ed6382 -> :sswitch_20
        0x2fae77a5 -> :sswitch_1a
        0x2fc54bcb -> :sswitch_24
        0x34a6025c -> :sswitch_15
        0x36ef31b0 -> :sswitch_17
        0x3954c249 -> :sswitch_23
        0x3e5b33a0 -> :sswitch_c
        0x4772bebc -> :sswitch_21
        0x4d2623b9 -> :sswitch_18
        0x4de67649 -> :sswitch_16
        0x4f9dd35b -> :sswitch_24
        0x530d1e31 -> :sswitch_b
        0x60598495 -> :sswitch_1e
        0x608de40f -> :sswitch_f
        0x6300b291 -> :sswitch_4
        0x6344a3a3 -> :sswitch_e
        0x66e88698 -> :sswitch_13
        0x6ada483e -> :sswitch_1
        0x6b737716 -> :sswitch_14
        0x6c58dfac -> :sswitch_1c
        0x6dc9d1e3 -> :sswitch_14
        0x6e38db8e -> :sswitch_10
        0x7891b8df -> :sswitch_e
        0x7a09e472 -> :sswitch_1d
        0x7d1fbca7 -> :sswitch_25
        0x7ea93db3 -> :sswitch_5
        0x7fd8f44e -> :sswitch_17
    .end sparse-switch
.end method
