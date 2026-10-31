.class public final synthetic Ll/۠ܶ᩷;
.super Ljava/lang/Object;
.source "12B7"

# interfaces
.implements Ljava/util/function/Function;


# static fields
.field private static final ܶۢܿ:[S


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۠ܶ᩷;->ܶۢܿ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0x1e4s
        0x77bbs
    .end array-data
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۠ܶ᩷;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

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

    const v14, -0x3d73d3c3

    sget v15, Ll/ۙۨ;->ۡۗۙ:I

    sget v16, Ll/ۗۗ;->ۨ۬ۖ:I

    const-string v17, "\u1a7a\u06e4"

    invoke-static/range {v17 .. v17}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v15

    xor-int v0, v17, v16

    mul-int/lit16 v0, v0, 0x1949

    const v19, -0x42f45ef6

    xor-int v0, v0, v19

    const v19, 0x30a725b0

    xor-int v17, v17, v19

    const/16 v18, 0x0

    :goto_0
    xor-int v14, v14, v16

    mul-int/lit16 v14, v14, -0x204f

    shr-int/lit8 v14, v14, 0x1f

    and-int/2addr v0, v14

    xor-int v14, v17, v0

    sparse-switch v14, :sswitch_data_0

    move-object/from16 v19, v1

    move-object/from16 v17, v3

    .line 176
    sget v0, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v0, :cond_d

    goto/16 :goto_a

    .line 69
    :sswitch_0
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    sget-boolean v0, Ll/֡ۨ;->ܽܶۖ:Z

    if-eqz v0, :cond_1

    :cond_0
    move-object/from16 v19, v1

    move-object/from16 v17, v3

    goto/16 :goto_a

    :cond_1
    move-object/from16 v19, v1

    move-object/from16 v17, v3

    goto/16 :goto_9

    .line 15
    :sswitch_1
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v0

    if-gtz v0, :cond_9

    :goto_1
    move-object/from16 v17, v3

    goto/16 :goto_3

    .line 40
    :sswitch_2
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    sget-boolean v0, Ll/ۖۘ;->ۚܶۖ:Z

    if-nez v0, :cond_0

    goto :goto_1

    .line 9
    :sswitch_3
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    const/4 v0, 0x0

    return-object v0

    .line 206
    :sswitch_5
    check-cast v3, Ljava/lang/String;

    invoke-static {v1, v3}, Ll/֨᩺;->ۡ۟ۖ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/֡֡;->᩻ۗۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_6
    invoke-interface/range {v18 .. v18}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 175
    sget v0, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v0, :cond_2

    goto/16 :goto_8

    :cond_2
    const-string v0, "\u06d8\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x17

    move-object/from16 v17, v3

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, -0x3db9

    const v19, -0x310dae7

    xor-int v3, v3, v19

    const v19, 0x1fc8fcdf

    goto/16 :goto_5

    :sswitch_7
    const/4 v0, 0x1

    .line 206
    invoke-static {v12, v13, v0, v11}, Ll/֫ۡ;->֫ܿۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۗ۬;->ۢۗܽ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    sget v0, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v0, :cond_3

    move-object/from16 v17, v3

    goto :goto_2

    :cond_3
    const-string v0, "\u06db\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x15

    move-object/from16 v17, v3

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x4e85

    const v19, 0x2cc0988c

    xor-int v3, v3, v19

    const v19, 0x1382dd9e

    goto/16 :goto_5

    :sswitch_8
    move-object/from16 v17, v3

    .line 206
    invoke-static {v1, v2}, Ll/ۗ۬;->ۢۗܽ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object v12, Ll/۠ܶ᩷;->ܶۢܿ:[S

    const/4 v13, 0x1

    .line 103
    sget v0, Ll/֨۟;->᩹֫᩷:I

    if-eqz v0, :cond_4

    :goto_2
    const-string v0, "\u1a7a\u06db"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x27

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x165f

    const v19, -0x967d916

    xor-int v3, v3, v19

    const v19, 0x2803a6a

    goto/16 :goto_5

    :cond_4
    const-string v0, "\u1a78\u1a79"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, -0x5001

    const v19, -0x7f64030c

    xor-int v3, v3, v19

    const v19, 0x38cd229

    goto/16 :goto_5

    :sswitch_9
    move-object/from16 v17, v3

    .line 206
    invoke-interface/range {v18 .. v18}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_7

    :cond_5
    const-string v0, "\u06ec\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x101b

    const v19, 0x18a8f6d4

    xor-int v3, v3, v19

    const v19, 0x6567ce8e

    goto/16 :goto_5

    :sswitch_a
    move-object/from16 v17, v3

    .line 7
    move-object/from16 v18, p1

    check-cast v18, Ljava/util/Map$Entry;

    .line 206
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    sget v0, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v0, :cond_6

    :goto_3
    const-string v0, "\u1a74\u0733"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x9

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, 0x1083

    const v19, 0x57becf7a

    xor-int v3, v3, v19

    const v19, -0x2dbbfe7f

    goto/16 :goto_5

    :cond_6
    const-string v0, "\u1a78\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, 0x403b

    const v19, 0xffdec70

    xor-int v3, v3, v19

    const v19, -0x7c6394e

    goto/16 :goto_5

    .line 0
    :sswitch_b
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Integer;

    sget v0, Ll/ۜ֫֨;->ܺۧ:I

    const/4 v0, 0x0

    return-object v0

    :sswitch_c
    move-object/from16 v0, p1

    check-cast v0, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$MF91EOTB8qNRHvQE-KN0aMZrRQ0(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object v0

    return-object v0

    :sswitch_d
    move-object/from16 v0, p1

    check-cast v0, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$WM4QFraRCYJq6wL5AfI7fwfZE10(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object v0

    return-object v0

    :sswitch_e
    move-object/from16 v0, p1

    check-cast v0, Lcom/google/android/material/color/utilities/DynamicScheme;

    invoke-static {v0}, Lcom/google/android/material/color/utilities/MaterialDynamicColors;->$r8$lambda$uW4HBIifAUZXF-Euk1B4yNI2ZQs(Lcom/google/android/material/color/utilities/DynamicScheme;)Lcom/google/android/material/color/utilities/TonalPalette;

    move-result-object v0

    return-object v0

    :sswitch_f
    move-object/from16 v0, p1

    check-cast v0, Ll/ۧܶۡ;

    invoke-virtual {v0}, Ll/ۧܶۡ;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_10
    move-object/from16 v0, p0

    move-object/from16 v17, v3

    .line 2
    iget v3, v0, Ll/۠ܶ᩷;->᩸:I

    packed-switch v3, :pswitch_data_0

    const-string v0, "\u1a78\u06dc"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x2995

    const v19, -0x141242f5

    xor-int v3, v3, v19

    const v19, 0x31120011

    goto/16 :goto_5

    :pswitch_0
    const-string v3, "\u073d\u06e4"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v15

    xor-int v0, v3, v16

    mul-int/lit16 v0, v0, -0x76ff

    const v19, 0x579c74e6

    xor-int v0, v0, v19

    const v19, 0x41cb568a

    xor-int v3, v3, v19

    move-object/from16 v20, v17

    move/from16 v17, v3

    goto/16 :goto_6

    :pswitch_1
    const-string v0, "\u0730\u1a75"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, -0x45b7

    const v19, 0x6470c1a7

    xor-int v3, v3, v19

    const v19, -0x6cbdf459

    goto/16 :goto_5

    :pswitch_2
    const-string v0, "\u06e4\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x27

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x6f25

    const v19, 0x4b5fff14    # 1.4679828E7f

    xor-int v3, v3, v19

    const v19, 0x5ec99766

    goto/16 :goto_5

    :pswitch_3
    const-string v0, "\u06e0\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x7

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x337b

    const v19, 0x63ea3fdb

    xor-int v3, v3, v19

    const v19, 0x5efb2613

    goto/16 :goto_5

    :pswitch_4
    const-string v0, "\u1a77\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, 0x3b9d

    const v19, -0x2269337c

    xor-int v3, v3, v19

    const v19, 0x37ed0141

    goto/16 :goto_5

    :sswitch_11
    move-object/from16 v17, v3

    const/16 v0, 0x49ab

    const/16 v11, 0x49ab

    goto :goto_4

    :sswitch_12
    move-object/from16 v17, v3

    const/16 v0, 0x7786

    const/16 v11, 0x7786

    :goto_4
    const-string v0, "\u0733\u073a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, 0x40f5

    const v19, 0x34d1730b

    xor-int v3, v3, v19

    const v19, -0x61cf0766

    goto :goto_5

    :sswitch_13
    move-object/from16 v17, v3

    add-int v0, v6, v10

    mul-int v0, v0, v0

    sub-int v0, v9, v0

    if-ltz v0, :cond_7

    const-string v0, "\u06d6\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x5d

    xor-int v3, v0, v16

    mul-int/lit16 v3, v3, -0x5335

    const v19, -0x42b5e31f

    xor-int v3, v3, v19

    const v19, -0xfe8be09

    goto :goto_5

    :cond_7
    const-string v0, "\u073f\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, -0x2519

    const v19, -0x796b08bd

    xor-int v3, v3, v19

    const v19, 0x53d59868

    goto :goto_5

    :sswitch_14
    move-object/from16 v17, v3

    add-int v0, v7, v8

    add-int v9, v0, v0

    const/16 v10, 0x2934

    sget v0, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v0, :cond_8

    goto :goto_7

    :cond_8
    const-string v0, "\u06e2\u06d6"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v3, v0, v15

    mul-int/lit16 v3, v3, 0x71cf

    const v19, 0x55005bf4

    xor-int v3, v3, v19

    const v19, 0x7be93e5a

    :goto_5
    xor-int v0, v0, v19

    move-object/from16 v20, v17

    move/from16 v17, v0

    move v0, v3

    :goto_6
    move-object/from16 v3, v20

    goto/16 :goto_0

    :sswitch_15
    move-object/from16 v17, v3

    aget-short v6, v4, v5

    mul-int v7, v6, v6

    const v8, 0x6a1b290

    .line 144
    sget-boolean v0, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v0, :cond_a

    :goto_7
    move-object/from16 v3, v17

    :cond_9
    :goto_8
    const-string v0, "\u06da\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    move-object/from16 v19, v1

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x3c35

    const v17, 0x6878e0bf

    xor-int v1, v1, v17

    const v17, -0x4a779840

    xor-int v17, v0, v17

    goto/16 :goto_c

    :cond_a
    move-object/from16 v19, v1

    const-string v0, "\u073d\u06db"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x56af

    const v3, 0x57794c25

    xor-int/2addr v1, v3

    const v3, -0x641cb255

    goto/16 :goto_b

    :sswitch_16
    move-object/from16 v19, v1

    move-object/from16 v17, v3

    const/4 v5, 0x0

    .line 47
    sget v0, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v0, :cond_b

    :goto_9
    const-string v0, "\u1a74\u1a7b"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x19af

    const v3, 0x75aa034c

    xor-int/2addr v1, v3

    const v3, -0x28a074c7

    goto :goto_b

    :cond_b
    const-string v0, "\u0733\u06e7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x11e7

    const v3, 0x561d2288

    xor-int/2addr v1, v3

    const v3, 0x65722d87

    goto :goto_b

    :sswitch_17
    move-object/from16 v19, v1

    move-object/from16 v17, v3

    sget-object v4, Ll/۠ܶ᩷;->ܶۢܿ:[S

    sget v0, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v0, :cond_c

    goto :goto_a

    :cond_c
    const-string v0, "\u1a7b\u1a73"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x35

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x47a7

    const v3, 0x54fbe6a1

    xor-int/2addr v1, v3

    const v3, 0x251c3773

    goto :goto_b

    :goto_a
    const-string v0, "\u06df\u05ab"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x5605

    const v3, 0x47114499

    xor-int/2addr v1, v3

    const v3, 0x11c6e3bf

    goto :goto_b

    :cond_d
    const-string v0, "\u06dc\u1a78"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x1b39

    const v3, 0x34b36b1a

    xor-int/2addr v1, v3

    const v3, 0xf6014f4

    :goto_b
    xor-int/2addr v0, v3

    move-object/from16 v3, v17

    move/from16 v17, v0

    :goto_c
    move v0, v1

    move-object/from16 v1, v19

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79ba31f1 -> :sswitch_9
        -0x787f63a2 -> :sswitch_8
        -0x7134c707 -> :sswitch_13
        -0x6fba1ae9 -> :sswitch_8
        -0x6fafeefc -> :sswitch_15
        -0x611e15c6 -> :sswitch_f
        -0x5d7af053 -> :sswitch_3
        -0x5908461a -> :sswitch_11
        -0x58ee5d6c -> :sswitch_e
        -0x4c74ef67 -> :sswitch_4
        -0x4a06d3de -> :sswitch_c
        -0x47743fc3 -> :sswitch_10
        -0x447e0281 -> :sswitch_17
        -0x42a78bab -> :sswitch_14
        -0x3cdef480 -> :sswitch_0
        -0x3bcc1e1e -> :sswitch_a
        -0x338a6c1e -> :sswitch_1
        -0x25dd3800 -> :sswitch_13
        -0x217ea974 -> :sswitch_9
        -0x1e535107 -> :sswitch_15
        -0x1e01ed93 -> :sswitch_12
        -0x15c02c59 -> :sswitch_c
        -0xe18e482 -> :sswitch_1
        -0x875f431 -> :sswitch_2
        -0x848f8fa -> :sswitch_6
        -0x726983d -> :sswitch_12
        -0x4f7aaf9 -> :sswitch_5
        0x6e42122 -> :sswitch_d
        0xcc450b8 -> :sswitch_a
        0x1155e4c0 -> :sswitch_f
        0x12fed996 -> :sswitch_e
        0x1887946a -> :sswitch_16
        0x253443e8 -> :sswitch_7
        0x29db2528 -> :sswitch_17
        0x314a76da -> :sswitch_d
        0x346c85c7 -> :sswitch_11
        0x377de7d3 -> :sswitch_3
        0x39f6046b -> :sswitch_4
        0x40aa66f4 -> :sswitch_2
        0x4d497d49 -> :sswitch_14
        0x51756bb6 -> :sswitch_7
        0x5aa97550 -> :sswitch_0
        0x6517cb56 -> :sswitch_16
        0x653e8f9b -> :sswitch_5
        0x67706f0d -> :sswitch_b
        0x768bc4c6 -> :sswitch_10
        0x7be168fb -> :sswitch_b
        0x7d9371c2 -> :sswitch_6
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
