.class public final synthetic Ll/۠ۡ᩷;
.super Ljava/lang/Object;
.source "154F"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۡ֡ۡ:[S


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x15

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۠ۡ᩷;->ۡ֡ۡ:[S

    return-void

    :array_0
    .array-data 2
        0x17e8s
        0x754ds
        0x754as
        0x755fs
        0x754cs
        0x754as
        0x757ds
        0x7552s
        0x7557s
        0x755bs
        0x7550s
        0x754as
        0x751es
        0x756cs
        0x755bs
        0x754ds
        0x754bs
        0x7552s
        0x754as
        0x7545s
        0x7543s
    .end array-data
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 4

    const v0, -0x4ad49a41

    sget v1, Ll/ۗ᩵;->֫۠۟:I

    sget v2, Ll/֡֡;->֫ۤܳ:I

    .line 0
    iput p1, p0, Ll/۠ۡ᩷;->᩸:I

    iput-object p2, p0, Ll/۠ۡ᩷;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u06ec\u1a78"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x43

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x2055

    const v3, -0x9a9a5ff

    xor-int/2addr p2, v3

    const v3, -0x21d6e97

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x1b13

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 1
    sget p1, Ll/֫ܽ;->ۚ᩷᩹:I

    if-gez p1, :cond_1

    goto :goto_1

    .line 4
    :sswitch_0
    sget-boolean p1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u05a1\u06dc"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x6edf

    const v3, 0x120c8013

    xor-int/2addr p2, v3

    const v3, -0x2f6ace9

    goto :goto_0

    :cond_1
    const-string p1, "\u06e0\u06da"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x31c7

    const v3, -0x216061d5

    xor-int/2addr p2, v3

    const v3, -0x4b69b879

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result p1

    if-lez p1, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, "\u0733\u05a1"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x23

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x5c37

    const v3, 0x5e21eb88

    xor-int/2addr p2, v3

    const v3, 0x212f41cc

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    :goto_1
    const-string p1, "\u06e0\u06e1"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x63

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x941

    const v3, -0x586c5693

    xor-int/2addr p2, v3

    const v3, -0x54fcd615

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 0
    :sswitch_5
    sget p1, Ll/᩺;->ۙۛܶ:I

    if-gtz p1, :cond_3

    const-string p1, "\u1a7b\u06df"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x73b1

    const v3, 0x28ca4f07

    xor-int/2addr p2, v3

    const v3, 0x2111a254

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u1a74\u05a1"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x6f

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x473

    const v3, -0x5725e335

    xor-int/2addr p2, v3

    const v3, -0x2e0cfd39

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6bf93d48 -> :sswitch_0
        -0x668f9f0b -> :sswitch_5
        -0x54a30725 -> :sswitch_2
        -0x2395a552 -> :sswitch_3
        -0x1f2c4189 -> :sswitch_3
        -0x18f54669 -> :sswitch_5
        -0x10445f99 -> :sswitch_4
        0x182c755 -> :sswitch_1
        0x1dd2cda -> :sswitch_2
        0x54ca8a9c -> :sswitch_4
        0x61e99736 -> :sswitch_0
        0x68d96c6f -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 25

    move-object/from16 v0, p0

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

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v15, 0x6e887afe

    sget v16, Ll/֫ܽ;->ۚ᩷᩹:I

    sget v17, Ll/ۘܿ;->ۘܰ۫:I

    const-string v18, "\u0730\u1a77"

    invoke-static/range {v18 .. v18}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v17

    xor-int v1, v18, v16

    mul-int/lit16 v1, v1, 0x3b75

    const v20, 0x2a01c2ec

    xor-int v1, v1, v20

    const v20, -0x7ec0b442

    xor-int v18, v18, v20

    const/4 v5, 0x0

    const/16 v19, 0x0

    :goto_0
    xor-int v15, v15, v16

    mul-int/lit16 v15, v15, -0x2745

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v1, v15

    xor-int v15, v18, v1

    sparse-switch v15, :sswitch_data_0

    .line 512
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    move-object/from16 v21, v3

    move-object/from16 v22, v4

    move/from16 v18, v15

    goto/16 :goto_a

    .line 529
    :sswitch_0
    sget v1, Ll/᩺;->ۙۛܶ:I

    if-lez v1, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v21, v3

    move-object/from16 v22, v4

    move/from16 v18, v15

    goto/16 :goto_9

    .line 37
    :sswitch_1
    sget v1, Ll/ۛ;->᩺᩻֫:I

    if-ltz v1, :cond_2

    goto :goto_1

    :cond_2
    move-object/from16 v21, v3

    move/from16 v18, v15

    goto/16 :goto_7

    .line 561
    :sswitch_2
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    :goto_1
    const-string v1, "\u1a76\u06e0"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0xf

    move/from16 v18, v15

    xor-int v15, v1, v17

    mul-int/lit16 v15, v15, 0x38ef

    const v21, -0x5960c1cf

    xor-int v15, v15, v21

    const v21, 0x657e011e

    goto :goto_2

    .line 33
    :sswitch_3
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    return-void

    .line 7
    :sswitch_4
    iget-object v1, v0, Ll/۠ۡ᩷;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v1, Lbin/mt/plus/Main;

    .line 12
    invoke-static {v1}, Lbin/mt/plus/Main;->᩻(Lbin/mt/plus/Main;)V

    return-void

    :sswitch_5
    const/4 v1, 0x1

    .line 583
    invoke-static {v13, v14, v1, v12}, Ll/ۗ۬;->᩹ۨ᩹([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Ll/ۗ۬;->ۢۗܽ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Ll/֡۬;->ܺܽۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩶ۘܽ;->֫(Ljava/lang/String;)V

    return-void

    :sswitch_6
    move/from16 v18, v15

    sget-object v13, Ll/۠ۡ᩷;->ۡ֡ۡ:[S

    const/16 v14, 0x14

    .line 31
    sget v1, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v1, :cond_3

    move-object/from16 v21, v3

    goto/16 :goto_7

    :cond_3
    const-string v1, "\u06e2\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v15, v1, v17

    mul-int/lit16 v15, v15, -0x273b

    const v21, -0x3e48508b

    xor-int v15, v15, v21

    const v21, -0x3c6fc43d

    :goto_2
    xor-int v1, v1, v21

    move/from16 v24, v18

    move/from16 v18, v1

    move v1, v15

    move/from16 v15, v24

    goto/16 :goto_0

    :sswitch_7
    move/from16 v18, v15

    .line 582
    invoke-static {v3, v4}, Lbin/mt/plus/Features3;->startMTIO(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 583
    new-instance v5, Ljava/lang/StringBuilder;

    sget-object v15, Ll/۠ۡ᩷;->ۡ֡ۡ:[S

    .line 87
    sget v21, Ll/᩺;->ۙۛܶ:I

    if-gtz v21, :cond_4

    move-object/from16 v21, v3

    move-object/from16 v22, v4

    goto/16 :goto_9

    :cond_4
    move-object/from16 v21, v3

    const/16 v3, 0x13

    sget v23, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v23, :cond_5

    move-object/from16 v22, v4

    :goto_3
    move-object/from16 v3, v21

    goto :goto_5

    :cond_5
    move-object/from16 v22, v4

    const/4 v4, 0x1

    .line 583
    invoke-static {v15, v4, v3, v12}, Ll/᩺;->֨ܶ۟([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v5, v1}, Ll/֡۬;->֨ۙ֨(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    .line 51
    sget-boolean v1, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    const-string v1, "\u1a79\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, -0x7a6d

    const v4, -0x3f156495

    xor-int/2addr v3, v4

    const v4, -0x3266308

    goto/16 :goto_b

    :sswitch_8
    move-object/from16 v21, v3

    move/from16 v18, v15

    const/4 v1, 0x2

    .line 582
    aget-object v4, v19, v1

    .line 494
    sget-boolean v1, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v1, :cond_7

    goto/16 :goto_7

    :cond_7
    const-string v1, "\u06eb\u073f"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x37

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x1e8d

    const v15, 0x4685978d

    xor-int/2addr v3, v15

    const v15, 0x388bbd65

    :goto_4
    xor-int/2addr v1, v15

    move/from16 v15, v18

    goto/16 :goto_c

    :sswitch_9
    move-object/from16 v22, v4

    move/from16 v18, v15

    .line 582
    aget-object v3, v19, v2

    .line 206
    sget v1, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v1, :cond_8

    :goto_5
    const-string v1, "\u06d7\u06d7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x67

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x702b

    const v5, -0x3d44c993

    xor-int/2addr v4, v5

    const v5, -0x406572d9

    xor-int/2addr v1, v5

    move/from16 v15, v18

    const/4 v5, 0x0

    goto :goto_6

    :cond_8
    const-string v1, "\u05a1\u06e1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x2515

    const v15, 0x475efab4

    xor-int/2addr v4, v15

    const v15, -0x594c7e0a

    xor-int/2addr v1, v15

    move/from16 v15, v18

    :goto_6
    move/from16 v18, v1

    move v1, v4

    move-object/from16 v4, v22

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v21, v3

    move-object/from16 v22, v4

    move/from16 v18, v15

    .line 15
    iget-object v1, v0, Ll/۠ۡ᩷;->᩹:Ljava/lang/Object;

    .line 17
    move-object/from16 v19, v1

    check-cast v19, [Ljava/lang/String;

    const/4 v2, 0x1

    .line 421
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v1

    if-eqz v1, :cond_9

    move-object/from16 v4, v22

    :goto_7
    const-string v1, "\u1a7a\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x6403

    const v15, 0x22a19205

    xor-int/2addr v3, v15

    const v15, -0x2fca2765

    goto :goto_4

    :cond_9
    const-string v1, "\u073f\u06e2"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x57

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x739b

    const v4, 0x648e4877

    xor-int/2addr v3, v4

    const v4, 0x72e42508

    goto/16 :goto_b

    :sswitch_b
    move-object/from16 v21, v3

    move-object/from16 v22, v4

    move/from16 v18, v15

    .line 2
    iget v1, v0, Ll/۠ۡ᩷;->᩸:I

    packed-switch v1, :pswitch_data_0

    const-string v1, "\u06e0\u06e8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x4401

    const v4, -0x57dccd2e

    xor-int/2addr v3, v4

    const v4, 0x615b8cbb

    goto/16 :goto_b

    :pswitch_0
    const-string v1, "\u06e7\u073f"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x55

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x62af

    const v4, 0x58b0c07

    xor-int/2addr v3, v4

    const v4, -0x462979d4

    goto/16 :goto_b

    :sswitch_c
    move-object/from16 v21, v3

    move-object/from16 v22, v4

    move/from16 v18, v15

    const v1, 0xbe06

    const v12, 0xbe06

    goto :goto_8

    :sswitch_d
    move-object/from16 v21, v3

    move-object/from16 v22, v4

    move/from16 v18, v15

    const/16 v1, 0x753e

    const/16 v12, 0x753e

    :goto_8
    const-string v1, "\u1a7b\u05a8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x5b

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x5d29

    const v4, -0x5e09be0c

    xor-int/2addr v3, v4

    const v4, -0x1f080912

    goto/16 :goto_b

    :sswitch_e
    move-object/from16 v21, v3

    move-object/from16 v22, v4

    move/from16 v18, v15

    mul-int v1, v8, v11

    sub-int v1, v10, v1

    if-ltz v1, :cond_a

    const-string v1, "\u1a74\u06e1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x45

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x47ad

    const v4, 0x6236693c

    xor-int/2addr v3, v4

    const v4, -0x2727c0a8

    goto/16 :goto_b

    :cond_a
    const-string v1, "\u073a\u06e0"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0x7293

    const v4, -0x23054ddf

    xor-int/2addr v3, v4

    const v4, -0x66722184

    goto/16 :goto_b

    :sswitch_f
    move-object/from16 v21, v3

    move-object/from16 v22, v4

    move/from16 v18, v15

    const v1, 0x2a9b31

    add-int v10, v9, v1

    const/16 v11, 0xd0e

    .line 18
    sget v1, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v1, :cond_b

    goto :goto_a

    :cond_b
    const-string v1, "\u06e1\u06dc"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x59

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x2663

    const v4, 0x1cca15ec

    xor-int/2addr v3, v4

    const v4, 0x33d21d08

    goto/16 :goto_b

    :sswitch_10
    move-object/from16 v21, v3

    move-object/from16 v22, v4

    move/from16 v18, v15

    aget-short v8, v6, v7

    mul-int v9, v8, v8

    .line 419
    sget v1, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v1, :cond_c

    :goto_9
    const-string v1, "\u06e2\u1a75"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x1d

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0xc0b

    const v4, -0x55b6aac

    xor-int/2addr v3, v4

    const v4, -0x675ee229

    xor-int/2addr v1, v4

    move/from16 v15, v18

    move-object/from16 v4, v22

    const/4 v5, 0x0

    goto :goto_c

    :cond_c
    const-string v1, "\u073f\u1a78"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v16

    mul-int/lit16 v3, v3, 0xc7f

    const v4, 0x79a12601

    xor-int/2addr v3, v4

    const v4, -0x341ad67a    # -3.0036748E7f

    goto :goto_b

    :sswitch_11
    move-object/from16 v21, v3

    move-object/from16 v22, v4

    move/from16 v18, v15

    sget-object v6, Ll/۠ۡ᩷;->ۡ֡ۡ:[S

    const/4 v7, 0x0

    .line 153
    sget v1, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v1, :cond_d

    :goto_a
    const-string v1, "\u06e8\u06d6"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0x220f

    const v4, -0x169e825a

    xor-int/2addr v3, v4

    const v4, 0x2c3ab620

    goto :goto_b

    :cond_d
    const-string v1, "\u1a78\u06e8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x55

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, -0xbe5

    const v4, -0x2546dbf3

    xor-int/2addr v3, v4

    const v4, -0x34a5d9db    # -1.4296613E7f

    :goto_b
    xor-int/2addr v1, v4

    move/from16 v15, v18

    move-object/from16 v4, v22

    :goto_c
    move/from16 v18, v1

    move v1, v3

    move-object/from16 v3, v21

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6f4e3295 -> :sswitch_7
        -0x6b02dd4e -> :sswitch_5
        -0x69fe8125 -> :sswitch_1
        -0x6774d20f -> :sswitch_d
        -0x5d80c3d1 -> :sswitch_9
        -0x56fb21c0 -> :sswitch_e
        -0x53b71d00 -> :sswitch_8
        -0x42264a1c -> :sswitch_0
        -0x401ef6bd -> :sswitch_4
        -0x3a2d7521 -> :sswitch_b
        -0x2cf60b86 -> :sswitch_b
        -0x244047eb -> :sswitch_9
        -0x16ffbe95 -> :sswitch_4
        -0x16d253c8 -> :sswitch_7
        -0x16aca2e2 -> :sswitch_3
        -0x1532d278 -> :sswitch_1
        0x964a321 -> :sswitch_11
        0xbbb701f -> :sswitch_c
        0x11d62942 -> :sswitch_c
        0x156d4d74 -> :sswitch_11
        0x1b546fd1 -> :sswitch_6
        0x24623eb6 -> :sswitch_2
        0x2ee8254e -> :sswitch_8
        0x3676d62a -> :sswitch_a
        0x41d53c47 -> :sswitch_2
        0x43bec347 -> :sswitch_f
        0x44b58f87 -> :sswitch_3
        0x47c7724a -> :sswitch_d
        0x52733fe0 -> :sswitch_5
        0x53295dd4 -> :sswitch_10
        0x5b0e083b -> :sswitch_10
        0x5ef626d3 -> :sswitch_f
        0x5f77f01e -> :sswitch_0
        0x6ffb2713 -> :sswitch_a
        0x7481c23e -> :sswitch_6
        0x7bc1f2c1 -> :sswitch_e
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
