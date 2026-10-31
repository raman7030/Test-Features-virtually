.class public final synthetic Ll/ܽ᩹᩷;
.super Ljava/lang/Object;
.source "650G"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ֡ۤۚ:[S


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܽ᩹᩷;->֡ۤۚ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0xebs
        -0x2b30s
        0x5e0s
        -0x32e8s
    .end array-data
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 4

    const v0, -0x20f395fa

    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    sget v2, Ll/ۘᩴ;->ܿ۬ܿ:I

    .line 0
    iput p1, p0, Ll/ܽ᩹᩷;->᩸:I

    iput-object p2, p0, Ll/ܽ᩹᩷;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u06e7\u0733"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, 0x79

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x2d5

    const v3, -0x28a6ec18

    xor-int/2addr p2, v3

    const v3, 0x7cfb45a3

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x5611

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 3
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result p1

    if-gez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u1a74\u1a73"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x63c5

    const v3, 0x71ee840b    # 2.362146E30f

    xor-int/2addr p2, v3

    const v3, -0x44602bce

    goto :goto_0

    .line 1
    :sswitch_0
    sget p1, Ll/ۗ۬;->ۘܳ᩻:I

    if-lez p1, :cond_1

    goto :goto_2

    :cond_1
    const-string p1, "\u0733\u1a7a"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x1f5b

    const v3, 0x476c76e9

    xor-int/2addr p2, v3

    const v3, 0x1c9e0134

    goto :goto_0

    :sswitch_1
    sget p1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u06e0\u073d"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x1e4f

    const v3, -0x1d40b502

    xor-int/2addr p2, v3

    const v3, 0x286b76bf

    goto :goto_0

    .line 3
    :sswitch_2
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    :goto_2
    const-string p1, "\u06e4\u1a7b"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x5021

    const v3, -0x316b7094

    xor-int/2addr p2, v3

    const v3, -0x5e2f5716

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 1
    :sswitch_5
    sget-boolean p1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez p1, :cond_3

    const-string p1, "\u0730\u1a77"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x5b95

    const v3, 0x4f514fd1

    xor-int/2addr p2, v3

    const v3, 0x6bae6142

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06dc\u1a77"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x25

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x37ab

    const v3, 0x2f2e927e

    xor-int/2addr p2, v3

    const v3, -0x40bb04fb

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x789ce337 -> :sswitch_2
        -0x39b12adc -> :sswitch_5
        -0x12aaff16 -> :sswitch_0
        -0x1e22e6 -> :sswitch_4
        0x6a1be41 -> :sswitch_3
        0xed8eed6 -> :sswitch_3
        0x34443039 -> :sswitch_4
        0x3d9e66e0 -> :sswitch_0
        0x4a576234 -> :sswitch_1
        0x4d8def94 -> :sswitch_1
        0x55a095ac -> :sswitch_5
        0x573267b6 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 21

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

    const v15, 0x6f8ba2f8

    sget v16, Ll/֡ᩴ;->ܳۤ֫:I

    sget v17, Ll/ۗ۬;->ۘܳ᩻:I

    const-string v18, "\u1a74\u06e4"

    invoke-static/range {v18 .. v18}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v16

    xor-int v1, v18, v17

    mul-int/lit16 v1, v1, -0x2e15

    const v20, -0x5aaeca2d

    xor-int v1, v1, v20

    const v20, 0x6231eb84

    xor-int v18, v18, v20

    move-object/from16 v20, v4

    move-object v13, v12

    move/from16 v19, v18

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v18, 0x6f8ba2f8

    :goto_0
    xor-int v5, v18, v17

    mul-int/lit16 v5, v5, 0x740f

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v1, v5

    xor-int v18, v19, v1

    sparse-switch v18, :sswitch_data_0

    .line 7
    iget-object v1, v0, Ll/ܽ᩹᩷;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v1, Ll/᩵ۖ᩷;

    .line 231
    iget-object v2, v1, Ll/᩵ۖ᩷;->ܳ:Ll/᩹ۖ᩷;

    sget-boolean v1, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v1, :cond_4

    goto/16 :goto_4

    .line 43
    :sswitch_0
    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v1, :cond_6

    goto/16 :goto_1

    :sswitch_1
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    sget-boolean v1, Ll/ۖۘ;->ۚܶۖ:Z

    if-nez v1, :cond_a

    goto :goto_1

    .line 201
    :sswitch_2
    sget v1, Ll/ۘۨ;->۫᩸۠:I

    if-gez v1, :cond_2

    goto/16 :goto_5

    :sswitch_3
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    goto/16 :goto_5

    :sswitch_4
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    return-void

    :sswitch_5
    xor-int v1, v3, v4

    .line 231
    invoke-static {v2, v1}, Ll/֨۟;->ܺ᩶۫(Ljava/lang/Object;I)Landroid/view/View;

    .line 232
    invoke-virtual {v2}, Ll/֨ܿ;->invalidateOptionsMenu()V

    return-void

    .line 231
    :sswitch_6
    invoke-static {v13, v14, v15, v12}, Ll/ۗ۬;->᩹ۨ᩹([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    const v4, 0x7d195b77

    .line 154
    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v1, "\u06d7\u06ec"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x2c2d

    const v19, 0x4d353b03    # 1.90033968E8f

    xor-int v5, v5, v19

    const v19, 0x35db200f

    goto/16 :goto_6

    :sswitch_7
    const/4 v14, 0x1

    const/4 v15, 0x3

    .line 146
    sget v1, Ll/֡֡;->֫ۤܳ:I

    if-ltz v1, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v1, "\u1a74\u06e0"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x23

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x2b3b

    const v19, 0x170b1a05

    xor-int v5, v5, v19

    const v19, 0x1104491e

    goto/16 :goto_6

    .line 231
    :sswitch_8
    sget-object v13, Ll/ܽ᩹᩷;->֡ۤۚ:[S

    .line 70
    sget v1, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v1, :cond_3

    :cond_2
    :goto_1
    const-string v1, "\u0730\u06df"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x5d

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x17b

    const v19, -0x2453f5ca

    xor-int v5, v5, v19

    const v19, -0x7627a3c2

    goto/16 :goto_6

    :cond_3
    const-string v1, "\u0733\u06e7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x35

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x366b

    const v19, 0xad1d77

    xor-int v5, v5, v19

    const v19, 0xc1e9907

    goto/16 :goto_6

    :cond_4
    const-string v1, "\u1a77\u06d8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x42c9

    const v19, 0x58341549

    xor-int v5, v5, v19

    const v19, 0x14a1a23d

    goto/16 :goto_6

    .line 0
    :sswitch_9
    iget-object v1, v0, Ll/ܽ᩹᩷;->᩹:Ljava/lang/Object;

    check-cast v1, Ll/᩷᩹᩷;

    invoke-static {v1}, Ll/᩷᩹᩷;->ۧ(Ll/᩷᩹᩷;)V

    return-void

    .line 2
    :sswitch_a
    iget v1, v0, Ll/ܽ᩹᩷;->᩸:I

    packed-switch v1, :pswitch_data_0

    const-string v1, "\u05ab\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x7573

    const v19, 0x451c0f87

    xor-int v5, v5, v19

    const v19, -0x6fbc0452

    goto/16 :goto_6

    :pswitch_0
    const-string v1, "\u06d9\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0xd

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x463f

    const v19, 0x3589d2d4

    xor-int v5, v5, v19

    const v19, -0x455424e1

    goto/16 :goto_6

    :sswitch_b
    const v1, 0xe3b9

    const v12, 0xe3b9

    goto :goto_2

    :sswitch_c
    const/16 v1, 0x5cb2

    const/16 v12, 0x5cb2

    :goto_2
    const-string v1, "\u1a78\u06d9"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x3f27

    const v19, -0x65ec20d7

    xor-int v5, v5, v19

    const v19, 0xb41edef

    goto/16 :goto_6

    :sswitch_d
    add-int/lit8 v1, v11, 0x1

    sub-int/2addr v1, v9

    if-lez v1, :cond_5

    const-string v1, "\u073a\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x7f

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x1ca7

    const v19, 0x5501efb

    xor-int v5, v5, v19

    const v19, -0xac5dc3f

    goto/16 :goto_6

    :cond_5
    const-string v1, "\u1a7a\u06db"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x71c5

    const v19, 0x209968a9

    xor-int v5, v5, v19

    const v19, 0x22940ada

    goto/16 :goto_6

    :sswitch_e
    mul-int v11, v7, v10

    sget v1, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v1, :cond_7

    :cond_6
    const-string v1, "\u1a77\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x3979

    const v19, 0x6a2e5496

    xor-int v5, v5, v19

    const v19, 0x105a19cc

    goto/16 :goto_6

    :cond_7
    const-string v1, "\u06e2\u0736"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x552f

    const v19, 0x4501f53

    xor-int v5, v5, v19

    const v19, 0x1c0a7846

    goto/16 :goto_6

    :sswitch_f
    mul-int v9, v8, v8

    const/4 v10, 0x2

    .line 109
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v1

    if-gtz v1, :cond_8

    goto :goto_4

    :cond_8
    const-string v1, "\u1a76\u06d9"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x1b

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, 0x456d

    const v19, -0x1a049b73

    xor-int v5, v5, v19

    const v19, 0x3f2a175f

    goto/16 :goto_6

    :sswitch_10
    add-int/lit8 v8, v7, 0x1

    .line 118
    sget v1, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v1, :cond_9

    goto :goto_4

    :cond_9
    const-string v1, "\u06d6\u1a79"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x3

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x33dd

    const v19, -0x6e4ed95

    xor-int v5, v5, v19

    const v19, -0x540e2eb5

    goto/16 :goto_6

    :sswitch_11
    aget-short v7, v20, v6

    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v1

    if-eqz v1, :cond_b

    :cond_a
    :goto_3
    const-string v1, "\u0733\u06dc"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x163

    const v19, 0x7321549e

    xor-int v5, v5, v19

    const v19, 0x10c4dbe0

    goto/16 :goto_6

    :cond_b
    const-string v1, "\u1a77\u1a79"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, 0x2f81

    const v19, -0x4d43edd4

    xor-int v5, v5, v19

    const v19, 0x19a5387

    goto :goto_6

    :sswitch_12
    const/4 v6, 0x0

    sget v1, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v1, :cond_c

    :goto_4
    const-string v1, "\u06ec\u06eb"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x7b

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x748b

    const v19, 0x43c46cc9

    xor-int v5, v5, v19

    const v19, -0xcb22f40

    goto :goto_6

    :cond_c
    const-string v1, "\u1a77\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x5c75

    const v19, -0x73f9bcec

    xor-int v5, v5, v19

    const v19, 0x4b9d70ec    # 2.063612E7f

    goto :goto_6

    :sswitch_13
    sget-object v20, Ll/ܽ᩹᩷;->֡ۤۚ:[S

    .line 223
    sget v1, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v1, :cond_d

    :goto_5
    const-string v1, "\u073a\u1a73"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, 0x21

    xor-int v5, v1, v16

    mul-int/lit16 v5, v5, -0x6df7

    const v19, -0x3fe538e

    xor-int v5, v5, v19

    const v19, -0x21f3018e

    goto :goto_6

    :cond_d
    const-string v1, "\u073d\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x43

    xor-int v5, v1, v17

    mul-int/lit16 v5, v5, -0x41e3

    const v19, 0x17a84559

    xor-int v5, v5, v19

    const v19, -0x8095a2

    :goto_6
    xor-int v19, v1, v19

    move v1, v5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7a0ea483 -> :sswitch_d
        -0x76c03dba -> :sswitch_2
        -0x6b73c07f -> :sswitch_9
        -0x679d1d36 -> :sswitch_10
        -0x623d904a -> :sswitch_e
        -0x53dffaab -> :sswitch_5
        -0x50771a43 -> :sswitch_4
        -0x4e7d2b37 -> :sswitch_6
        -0x4493312c -> :sswitch_c
        -0x3e467713 -> :sswitch_d
        -0x34c793f5 -> :sswitch_f
        -0x320e5a95 -> :sswitch_8
        -0x2ffe5331 -> :sswitch_3
        -0x1c06afb7 -> :sswitch_6
        -0x135724bd -> :sswitch_b
        -0x10604867 -> :sswitch_b
        -0x8e46930 -> :sswitch_0
        -0x436d125 -> :sswitch_13
        -0x40298e -> :sswitch_2
        0xa862375 -> :sswitch_13
        0xfe1ad75 -> :sswitch_3
        0x12ff7df5 -> :sswitch_e
        0x1b33c603 -> :sswitch_c
        0x2411ad65 -> :sswitch_1
        0x293b8ee6 -> :sswitch_a
        0x2ef13263 -> :sswitch_7
        0x32207af1 -> :sswitch_1
        0x336710ba -> :sswitch_f
        0x35f1e677 -> :sswitch_12
        0x36dbc114 -> :sswitch_8
        0x3a9c1979 -> :sswitch_a
        0x4db013e4 -> :sswitch_12
        0x53fe29df -> :sswitch_9
        0x553e6dcd -> :sswitch_7
        0x5e43eec1 -> :sswitch_0
        0x69e76664 -> :sswitch_11
        0x6bd48eaf -> :sswitch_4
        0x7837485d -> :sswitch_11
        0x7c9ab643 -> :sswitch_10
        0x7d9e5860 -> :sswitch_5
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
