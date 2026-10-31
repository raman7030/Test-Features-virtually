.class public final synthetic Ll/۠۬ܽ;
.super Ljava/lang/Object;
.source "H508"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final ᩸ۡۚ:[S


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xb

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۠۬ܽ;->᩸ۡۚ:[S

    return-void

    :array_0
    .array-data 2
        0x24eas
        -0x5dbds
        -0x5da9s
        -0x5db6s
        -0x5db8s
        -0x5d9fs
        -0x5db4s
        -0x5dbcs
        -0x5db7s
        -0x5db6s
        -0x5dbes
    .end array-data
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 4

    const v0, -0x3fc2b05b

    sget v1, Ll/ۗ᩵;->֫۠۟:I

    sget v2, Ll/֡۬;->۠֡᩶:I

    .line 0
    iput p1, p0, Ll/۠۬ܽ;->᩸:I

    iput-object p2, p0, Ll/۠۬ܽ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p1, "\u1a75\u06e7"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x7

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x33bf

    const v3, -0x4db03507

    xor-int/2addr p2, v3

    const v3, -0x6dc6706f

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x991

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    sget p1, Ll/ۘۘ;->᩷ۙ᩸:I

    if-gez p1, :cond_2

    goto :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    sget-boolean p1, Ll/֫᩺;->֫ܰۨ:Z

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06e7\u1a79"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x5b

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x2f3f

    const v3, 0x1e34ef41

    xor-int/2addr p2, v3

    const v3, -0x3adf0542

    goto :goto_0

    .line 2
    :sswitch_1
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    sget p1, Ll/ۘܿ;->ۘܰ۫:I

    if-gez p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u06d9\u06d7"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x1f

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x1f0d

    const v3, -0x52aa02b8

    xor-int/2addr p2, v3

    const v3, 0x1e37809f

    goto :goto_0

    :cond_2
    :goto_1
    const-string p1, "\u1a7a\u073d"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x2cbd

    const v3, 0x2b25d2c1

    xor-int/2addr p2, v3

    const v3, -0x5d01fb58

    goto :goto_0

    .line 4
    :sswitch_2
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    :goto_2
    const-string p1, "\u06dc\u06da"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x3513

    const v3, -0x470b0a38

    xor-int/2addr p2, v3

    const v3, 0x7161ce24

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    :sswitch_5
    sget p1, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz p1, :cond_3

    const-string p1, "\u06e0\u1a78"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x2b

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x13ef

    const v3, 0x417c0ec3

    xor-int/2addr p2, v3

    const v3, -0x276c93f3

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u073f\u06d7"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x11

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x660b

    const v3, 0x5538c718

    xor-int/2addr p2, v3

    const v3, 0x3eaae143

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x66f0f2b6 -> :sswitch_4
        -0x586e426b -> :sswitch_2
        -0x50adce39 -> :sswitch_4
        -0x4d16ca63 -> :sswitch_0
        -0x45e98456 -> :sswitch_2
        -0x3b8ab18e -> :sswitch_3
        -0x1ee8335f -> :sswitch_1
        0x38182597 -> :sswitch_1
        0x3c62c714 -> :sswitch_5
        0x49e5ab01 -> :sswitch_0
        0x5139d700 -> :sswitch_5
        0x5e12c631 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 19

    move-object/from16 v0, p0

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

    const v13, 0x928911f    # 2.02905E-33f

    sget v14, Ll/ۗ۬;->ۘܳ᩻:I

    sget v15, Ll/֡ܶ;->ᩴܿ᩸:I

    const-string v16, "\u1a74\u06e1"

    invoke-static/range {v16 .. v16}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v14

    xor-int v1, v16, v15

    mul-int/lit16 v1, v1, 0x154b

    const v17, 0x7f1e2204

    xor-int v1, v1, v17

    const v17, -0x28eedcb9

    xor-int v16, v16, v17

    move-object/from16 v18, v4

    move-object v13, v12

    move/from16 v17, v16

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const v16, 0x928911f    # 2.02905E-33f

    move-object v4, v3

    const/4 v3, 0x0

    :goto_0
    xor-int v5, v16, v15

    mul-int/lit16 v5, v5, -0x790d

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v1, v5

    xor-int v16, v17, v1

    sparse-switch v16, :sswitch_data_0

    .line 62
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    invoke-static {}, Ll/۠;->ܿ۠۠()I

    goto/16 :goto_3

    :sswitch_0
    sget-boolean v1, Ll/֫֫;->ۢ᩸᩶:Z

    if-nez v1, :cond_c

    goto :goto_1

    .line 82
    :sswitch_1
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-lez v1, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v1, "\u1a75\u06e2"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x1e51

    const v17, -0xb95d6cc

    xor-int v5, v5, v17

    const v17, 0x71010b1d

    goto/16 :goto_7

    .line 62
    :sswitch_2
    sget v1, Ll/۠;->ܺܺܶ:I

    if-gez v1, :cond_a

    goto/16 :goto_3

    .line 40
    :sswitch_3
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    return-void

    .line 7
    :sswitch_4
    iget-object v1, v0, Ll/۠۬ܽ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v1, Ll/ۤۤܽ;

    .line 12
    invoke-static {v1}, Ll/ۤۤܽ;->ܽ(Ll/ۤۤܽ;)V

    return-void

    :sswitch_5
    const/4 v1, 0x1

    .line 113
    invoke-virtual {v2, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 114
    invoke-static {v3, v2}, Ll/ۘܿ;->ᩳ᩸֫(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :sswitch_6
    const/4 v1, 0x1

    const/16 v4, 0xa

    .line 112
    invoke-static {v13, v1, v4, v12}, Ll/֫ܿ;->ܰ᩷ۤ([SIII)Ljava/lang/String;

    move-result-object v4

    .line 74
    sget v1, Ll/֨۟;->᩹֫᩷:I

    if-eqz v1, :cond_1

    goto/16 :goto_6

    :cond_1
    const-string v1, "\u06d8\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, -0x23

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, -0x6ff7

    const v17, -0x3eed8db4

    xor-int v5, v5, v17

    const v17, 0x67abc955

    goto/16 :goto_7

    .line 15
    :sswitch_7
    iget-object v1, v0, Ll/۠۬ܽ;->᩹:Ljava/lang/Object;

    .line 17
    move-object v3, v1

    check-cast v3, Lbin/mt/plus/Main;

    .line 112
    new-instance v2, Landroid/content/Intent;

    .line 98
    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v1, :cond_2

    goto/16 :goto_4

    .line 112
    :cond_2
    const-class v1, Ll/᩹ۙܽ;

    .line 94
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v5

    if-gtz v5, :cond_3

    goto/16 :goto_6

    .line 112
    :cond_3
    invoke-direct {v2, v3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget-object v13, Ll/۠۬ܽ;->᩸ۡۚ:[S

    .line 44
    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v1, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v1, "\u073f\u06ec"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0x41

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x3377

    const v17, -0x74b9c4cd

    xor-int v5, v5, v17

    const v17, 0x6b7eb22e

    goto/16 :goto_7

    .line 2
    :sswitch_8
    iget v1, v0, Ll/۠۬ܽ;->᩸:I

    packed-switch v1, :pswitch_data_0

    const-string v1, "\u06e0\u06d7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    mul-int/lit8 v1, v1, -0x7

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, -0x325f

    const v17, -0x40fa880f

    xor-int v5, v5, v17

    const v17, -0x4db62bc5

    goto/16 :goto_7

    :pswitch_0
    const-string v1, "\u06e0\u05a8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v15

    mul-int/lit8 v1, v1, 0x53

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, 0x1a7

    const v17, -0x1ae0e46c

    xor-int v5, v5, v17

    const v17, -0x3701cbf4

    goto/16 :goto_7

    :sswitch_9
    const v1, 0xe53c

    const v12, 0xe53c

    goto :goto_2

    :sswitch_a
    const v1, 0xa225

    const v12, 0xa225

    :goto_2
    const-string v1, "\u06e0\u1a7a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x4a47

    const v17, -0x3c15f853

    xor-int v5, v5, v17

    const v17, 0x2b3efbaf

    goto/16 :goto_7

    :sswitch_b
    add-int v1, v7, v11

    mul-int v1, v1, v1

    sub-int/2addr v1, v10

    if-lez v1, :cond_5

    const-string v1, "\u1a75\u05a1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x79a9

    const v17, -0x4b24e6af

    xor-int v5, v5, v17

    const v17, 0xadbe72d

    goto/16 :goto_7

    :cond_5
    const-string v1, "\u06e1\u06e7"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0x59

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, -0x255b

    const v17, 0x5607cac6

    xor-int v5, v5, v17

    const v17, -0x1d3328b6

    goto/16 :goto_7

    :sswitch_c
    add-int v1, v8, v9

    add-int v10, v1, v1

    const/16 v11, 0x1bc3

    .line 30
    sget v1, Ll/֡۬;->۠֡᩶:I

    if-gtz v1, :cond_6

    goto :goto_3

    :cond_6
    const-string v1, "\u1a77\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x36f9

    const v17, 0xde9d4e1

    xor-int v5, v5, v17

    const v17, -0x9c69c87

    goto/16 :goto_7

    :sswitch_d
    const v9, 0x302b689

    .line 20
    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v1, :cond_7

    const-string v1, "\u0733\u06da"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x77

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x6203

    const v17, 0x91f0879

    xor-int v5, v5, v17

    const v17, 0x412ae107

    goto/16 :goto_7

    :cond_7
    const-string v1, "\u06dc\u06e1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0x6b

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, -0x2f87

    const v17, -0x648669d6

    xor-int v5, v5, v17

    const v17, 0x34dda2f4

    goto/16 :goto_7

    :sswitch_e
    aget-short v7, v18, v6

    mul-int v8, v7, v7

    .line 46
    sget v1, Ll/۟;->ۗۤۛ:I

    if-eqz v1, :cond_8

    :goto_3
    const-string v1, "\u05a1\u06e8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v14

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x149b

    const v17, 0xe0e28a

    xor-int v5, v5, v17

    const v17, -0x2120af79

    goto/16 :goto_7

    :cond_8
    const-string v1, "\u0733\u1a7b"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, 0x1003

    const v17, -0x348e3258    # -1.5846824E7f

    xor-int v5, v5, v17

    const v17, 0x4b15b70

    goto/16 :goto_7

    :sswitch_f
    const/4 v6, 0x0

    .line 45
    sget-boolean v1, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v1, :cond_9

    goto :goto_6

    :cond_9
    const-string v1, "\u06eb\u06e2"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, -0x7d

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, 0x6c7

    const v17, 0x2ceae30e

    xor-int v5, v5, v17

    const v17, 0x5ab5bbb

    goto :goto_7

    :sswitch_10
    sget-object v18, Ll/۠۬ܽ;->᩸ۡۚ:[S

    .line 103
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v1

    if-eqz v1, :cond_b

    :cond_a
    :goto_4
    const-string v1, "\u06e0\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x5599

    const v5, 0x621e22ca

    xor-int/2addr v2, v5

    const v5, 0x2b47d3c7

    :goto_5
    xor-int v17, v1, v5

    move v1, v2

    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_b
    const-string v1, "\u05ab\u06e0"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v5, v1, v14

    mul-int/lit16 v5, v5, 0x1c5f

    const v17, -0x22e654ef

    xor-int v5, v5, v17

    const v17, 0x1fbb5b0b

    goto :goto_7

    .line 48
    :sswitch_11
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v1

    if-nez v1, :cond_d

    :cond_c
    :goto_6
    const-string v1, "\u1a74\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v15, v1

    mul-int/lit8 v1, v1, 0x79

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, 0x6a4d

    const v5, 0x56c6dae8

    xor-int/2addr v2, v5

    const v5, -0x1fb4cec7

    goto :goto_5

    :cond_d
    const-string v1, "\u0736\u1a75"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v14

    mul-int/lit8 v1, v1, 0x57

    xor-int v5, v1, v15

    mul-int/lit16 v5, v5, -0x1f39

    const v17, -0x57790ca4

    xor-int v5, v5, v17

    const v17, -0x6176c9dc

    :goto_7
    xor-int v17, v1, v17

    move v1, v5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fd875de -> :sswitch_4
        -0x7742fdd7 -> :sswitch_0
        -0x6fba1a23 -> :sswitch_7
        -0x699866ca -> :sswitch_1
        -0x5dd4911a -> :sswitch_7
        -0x48985909 -> :sswitch_10
        -0x4891d1c6 -> :sswitch_d
        -0x3f674463 -> :sswitch_f
        -0x3a6a980a -> :sswitch_2
        -0x33f7844f -> :sswitch_5
        -0x2bbc8a10 -> :sswitch_b
        -0x246d0b25 -> :sswitch_d
        -0x12988132 -> :sswitch_f
        -0xa94be3e -> :sswitch_11
        -0x3594278 -> :sswitch_3
        0x40284 -> :sswitch_11
        0x8b6cc19 -> :sswitch_9
        0x9474c5d -> :sswitch_8
        0x142b13ae -> :sswitch_6
        0x1939bcd7 -> :sswitch_b
        0x19e2cc25 -> :sswitch_5
        0x207313c6 -> :sswitch_c
        0x20d5e488 -> :sswitch_a
        0x28a18689 -> :sswitch_9
        0x291b3725 -> :sswitch_10
        0x2ff89a06 -> :sswitch_e
        0x33c2b725 -> :sswitch_1
        0x43291827 -> :sswitch_8
        0x47bd649e -> :sswitch_0
        0x537b6878 -> :sswitch_2
        0x544eca6f -> :sswitch_4
        0x5468f4f5 -> :sswitch_6
        0x6d0611ba -> :sswitch_e
        0x70308a9f -> :sswitch_a
        0x77b4905e -> :sswitch_c
        0x7f3590be -> :sswitch_3
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
