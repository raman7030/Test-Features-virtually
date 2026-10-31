.class public final Ll/ܺۖ᩷;
.super Ll/֡ܽ;
.source "JAJI"


# static fields
.field private static final ܰܰۤ:[S


# instance fields
.field public final synthetic ܿ:Ll/᩹ۖ᩷;

.field public ᩳ:Ll/ۡۤۡ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܺۖ᩷;->ܰܰۤ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0xc1as
        -0x3919s
        -0x3b91s
        0x3de5s
    .end array-data
.end method

.method public constructor <init>(Ll/᩹ۖ᩷;)V
    .locals 6

    const/4 v0, 0x0

    const v1, -0x66abfe33

    sget v2, Ll/ۘۛ;->ۖۚ֡:I

    sget v3, Ll/֨۬;->۫ۙ᩺:I

    .line 86
    iput-object p1, p0, Ll/ܺۖ᩷;->ܿ:Ll/᩹ۖ᩷;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ll/֡ܽ;-><init>(Z)V

    const-string p1, "\u05a1\u06e1"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int v4, p1, v3

    mul-int/lit16 v4, v4, 0x1411

    const v5, -0x5e86689

    xor-int/2addr v4, v5

    const v5, -0x443b729f

    :goto_0
    xor-int/2addr p1, v5

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x67d5

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v4

    xor-int/2addr v1, p1

    sparse-switch v1, :sswitch_data_0

    .line 87
    iput-object v0, p0, Ll/ܺۖ᩷;->ᩳ:Ll/ۡۤۡ;

    return-void

    :sswitch_0
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result p1

    if-eqz p1, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string p1, "\u073a\u06d9"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int v4, p1, v3

    mul-int/lit16 v4, v4, -0x508f

    const v5, -0x277260b5

    xor-int/2addr v4, v5

    const v5, 0x37e83e07

    goto :goto_0

    .line 71
    :sswitch_1
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    sget p1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz p1, :cond_8

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result p1

    if-eqz p1, :cond_b

    goto/16 :goto_3

    .line 2
    :sswitch_3
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    goto/16 :goto_3

    .line 52
    :sswitch_4
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    sget p1, Ll/ۛ;->᩺᩻֫:I

    if-ltz p1, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string p1, "\u06d7\u06e7"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int v4, p1, v2

    mul-int/lit16 v4, v4, -0x66f7

    const v5, -0x63438d6d

    xor-int/2addr v4, v5

    const v5, -0x3b6d99fa

    goto :goto_0

    .line 33
    :sswitch_6
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result p1

    if-gtz p1, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string p1, "\u1a78\u1a78"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x7b

    xor-int v4, p1, v3

    mul-int/lit16 v4, v4, 0x31fb

    const v5, 0x4818aae0    # 156331.5f

    xor-int/2addr v4, v5

    const v5, 0x4f287d8c

    goto/16 :goto_0

    :sswitch_7
    sget p1, Ll/۠;->ܺܺܶ:I

    if-ltz p1, :cond_3

    goto :goto_1

    :cond_3
    const-string p1, "\u06d9\u06db"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int v4, p1, v3

    mul-int/lit16 v4, v4, 0x2b81

    const v5, -0x256291f

    xor-int/2addr v4, v5

    const v5, 0x3d3fe0e3

    goto/16 :goto_0

    .line 82
    :sswitch_8
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result p1

    if-eqz p1, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string p1, "\u1a75\u1a79"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int v4, p1, v2

    mul-int/lit16 v4, v4, 0xedf

    const v5, 0x4cf79e0d    # 1.29822824E8f

    xor-int/2addr v4, v5

    const v5, 0x37b25993

    goto/16 :goto_0

    .line 52
    :sswitch_9
    sget p1, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz p1, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string p1, "\u0736\u0736"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x27

    xor-int v4, p1, v3

    mul-int/lit16 v4, v4, -0x510f

    const v5, 0x56dbdd14

    xor-int/2addr v4, v5

    const v5, -0x5e7affbb

    goto/16 :goto_0

    .line 40
    :sswitch_a
    sget p1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz p1, :cond_6

    goto :goto_2

    :cond_6
    const-string p1, "\u06d8\u06dc"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    mul-int/lit8 p1, p1, -0x5

    xor-int v4, p1, v2

    mul-int/lit16 v4, v4, 0x55c5

    const v5, 0x5318b530

    xor-int/2addr v4, v5

    const v5, -0x18b3796a

    goto/16 :goto_0

    .line 19
    :sswitch_b
    sget p1, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz p1, :cond_7

    :goto_1
    const-string p1, "\u1a73\u06dc"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x7f

    xor-int v4, p1, v3

    mul-int/lit16 v4, v4, 0x44e3

    const v5, 0x3146d653

    xor-int/2addr v4, v5

    const v5, -0x3a0d1aad

    goto/16 :goto_0

    :cond_7
    const-string p1, "\u06d6\u06ec"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int v4, p1, v3

    mul-int/lit16 v4, v4, -0x3d17

    const v5, -0x76e2ab5e

    xor-int/2addr v4, v5

    const v5, -0x5d3206a1

    goto/16 :goto_0

    .line 26
    :sswitch_c
    sget p1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz p1, :cond_9

    :cond_8
    :goto_2
    const-string p1, "\u06d9\u06e7"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v3

    mul-int/lit8 p1, p1, -0x51

    xor-int v4, p1, v2

    mul-int/lit16 v4, v4, 0x78f9

    const v5, 0x5fc2026a

    xor-int/2addr v4, v5

    const v5, 0x7da2c37f

    goto/16 :goto_0

    :cond_9
    const-string p1, "\u06e8\u1a77"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int v4, p1, v2

    mul-int/lit16 v4, v4, 0x3679

    const v5, -0x7fca0b2e

    xor-int/2addr v4, v5

    const v5, 0x498d6066    # 1158156.8f

    goto/16 :goto_0

    .line 71
    :sswitch_d
    sget p1, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz p1, :cond_a

    :goto_3
    const-string p1, "\u1a74\u06d6"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int v4, p1, v3

    mul-int/lit16 v4, v4, 0x151

    const v5, 0x11809672

    xor-int/2addr v4, v5

    const v5, 0x778ca87d

    goto/16 :goto_0

    :cond_a
    const-string p1, "\u1a73\u1a77"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v3, p1

    mul-int/lit8 p1, p1, -0x25

    xor-int v4, p1, v2

    mul-int/lit16 v4, v4, -0x46e3

    const v5, 0x13cd821d

    xor-int/2addr v4, v5

    const v5, 0x425417c9

    goto/16 :goto_0

    .line 87
    :sswitch_e
    invoke-static {}, Ll/ۡۤۡ;->ܳ()Ll/ۡۤۡ;

    move-result-object v0

    .line 37
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result p1

    if-gtz p1, :cond_c

    :cond_b
    :goto_4
    const-string p1, "\u06e4\u06e1"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    mul-int/lit8 p1, p1, 0x61

    xor-int v4, p1, v2

    mul-int/lit16 v4, v4, -0x3a51

    const v5, -0x347d8527    # -1.7102258E7f

    xor-int/2addr v4, v5

    const v5, -0x1befeaa3

    goto/16 :goto_0

    :cond_c
    const-string p1, "\u05a1\u0736"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int v4, p1, v3

    mul-int/lit16 v4, v4, -0x2ba9

    const v5, -0x7371d53a

    xor-int/2addr v4, v5

    const v5, -0x5e84f278

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7a2c7743 -> :sswitch_a
        -0x78cedcbb -> :sswitch_c
        -0x733eb572 -> :sswitch_e
        -0x62d1815c -> :sswitch_1
        -0x59188c20 -> :sswitch_0
        -0x3e3de549 -> :sswitch_0
        -0x3beb9494 -> :sswitch_a
        -0x385d0f28 -> :sswitch_d
        -0x2edba643 -> :sswitch_c
        -0x24544679 -> :sswitch_9
        -0x2330ae62 -> :sswitch_5
        -0x22e28f1c -> :sswitch_e
        -0x21b8d538 -> :sswitch_3
        -0x20bb3bb7 -> :sswitch_8
        -0xcb67ab6 -> :sswitch_6
        -0xaac87e8 -> :sswitch_8
        0x1156da7a -> :sswitch_4
        0x11f2d3b6 -> :sswitch_d
        0x204f7868 -> :sswitch_2
        0x24d4868b -> :sswitch_5
        0x3056f355 -> :sswitch_2
        0x3187dc61 -> :sswitch_b
        0x322b3692 -> :sswitch_9
        0x343a5aa5 -> :sswitch_7
        0x3f3510ff -> :sswitch_7
        0x41099721 -> :sswitch_b
        0x4a8f5977 -> :sswitch_4
        0x5131903d -> :sswitch_1
        0x5be67324 -> :sswitch_6
        0x7a198581 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final ۧ()V
    .locals 22

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

    const v15, -0x7e34166b

    sget v16, Ll/֨ۤ;->ܿۖ᩵:I

    sget v17, Ll/ۗۚ;->ܶۛᩴ:I

    const-string v18, "\u1a74\u1a73"

    invoke-static/range {v18 .. v18}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v18

    add-int v18, v18, v16

    mul-int/lit8 v18, v18, 0x79

    xor-int v1, v18, v17

    mul-int/lit16 v1, v1, -0xbbf

    const v20, 0x6e1bc790

    xor-int v1, v1, v20

    const v20, -0x7a7b6984

    xor-int v18, v18, v20

    const/16 v19, 0x0

    :goto_0
    xor-int v15, v15, v17

    mul-int/lit16 v15, v15, 0x260d

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v1, v15

    xor-int v15, v18, v1

    sparse-switch v15, :sswitch_data_0

    move-object/from16 v18, v4

    aget-short v7, v5, v6

    mul-int v8, v7, v7

    sget v0, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v0, :cond_e

    goto/16 :goto_8

    :sswitch_0
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    sget v1, Ll/ۗ᩵;->֫۠۟:I

    if-gez v1, :cond_3

    goto :goto_1

    .line 103
    :sswitch_1
    sget v1, Ll/֡ܶ;->ᩴܿ᩸:I

    if-gez v1, :cond_0

    goto :goto_1

    :cond_0
    move-object/from16 v18, v4

    goto/16 :goto_3

    :sswitch_2
    sget v1, Ll/ۘ᩻;->᩵ۜ֨:I

    if-lez v1, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v18, v4

    goto/16 :goto_7

    .line 8
    :sswitch_3
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    goto :goto_1

    .line 73
    :sswitch_4
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    return-void

    .line 102
    :sswitch_5
    invoke-static/range {v19 .. v19}, Ll/᩹ۖ᩷;->ᩳ(Ll/᩹ۖ᩷;)Ll/ܶ᩵ܿ;

    move-result-object v1

    invoke-static {v1}, Ll/֫᩵;->ܳ᩺۟(Ljava/lang/Object;)Z

    move-object/from16 v18, v4

    goto/16 :goto_2

    .line 104
    :sswitch_6
    invoke-static/range {v19 .. v19}, Ll/ۖۘ;->ۜۨۧ(Ljava/lang/Object;)V

    return-void

    .line 97
    :sswitch_7
    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    const v2, 0x7efcb53d

    xor-int/2addr v1, v2

    .line 98
    invoke-static {v1}, Ll/ۘۗ;->֨ܽ᩻(I)Ll/᩸ۚۢ;

    return-void

    .line 97
    :sswitch_8
    invoke-static {v12, v13, v14, v11}, Ll/֨ᩴ;->۠᩹ܺ([SIII)Ljava/lang/String;

    move-result-object v4

    .line 25
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v1

    if-eqz v1, :cond_2

    :goto_1
    const-string v1, "\u06e1\u0730"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x41

    move-object/from16 v18, v4

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x40b9

    const v20, -0x27487651

    xor-int v4, v4, v20

    const v20, 0x33d3919c

    goto/16 :goto_4

    :cond_2
    const-string v1, "\u05ab\u073d"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, -0x5f

    move-object/from16 v18, v4

    xor-int v4, v1, v17

    mul-int/lit16 v4, v4, -0x6e55

    const v20, -0x663e73aa

    xor-int v4, v4, v20

    const v20, 0x5e7987dc

    goto/16 :goto_4

    :sswitch_9
    const/4 v14, 0x3

    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v1, :cond_4

    :cond_3
    const-string v1, "\u05a8\u06e2"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x2d

    move-object/from16 v18, v4

    xor-int v4, v1, v17

    mul-int/lit16 v4, v4, 0x4a73

    const v20, 0x4025dd16

    xor-int v4, v4, v20

    const v20, 0xace01ff

    goto/16 :goto_4

    :cond_4
    move-object/from16 v18, v4

    const-string v1, "\u1a7a\u06df"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v17

    mul-int/lit16 v4, v4, -0x7e2d

    const v20, 0x4247242a

    xor-int v4, v4, v20

    const v20, 0x122db4a7

    goto/16 :goto_4

    :sswitch_a
    move-object/from16 v18, v4

    .line 97
    sget-object v12, Ll/ܺۖ᩷;->ܰܰۤ:[S

    const/4 v13, 0x1

    sget-boolean v1, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v1, :cond_5

    goto/16 :goto_8

    :cond_5
    const-string v1, "\u06e0\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x33c7

    const v20, 0x7b02bc3c

    xor-int v4, v4, v20

    const v20, 0x1e87bbcf

    goto/16 :goto_4

    :sswitch_b
    move-object/from16 v18, v4

    .line 100
    invoke-static {}, Ll/᩸ۚۢ;->ܽ()V

    .line 101
    invoke-static/range {v19 .. v19}, Ll/᩹ۖ᩷;->ܽ(Ll/᩹ۖ᩷;)Z

    move-result v1

    if-eqz v1, :cond_6

    const-string v1, "\u1a77\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v17

    mul-int/lit16 v4, v4, 0x4ec1

    const v20, -0x75aaee08

    xor-int v4, v4, v20

    const v20, 0x3823f10d

    goto/16 :goto_4

    :cond_6
    :goto_2
    const-string v1, "\u06e7\u1a78"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x2b

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x73a3

    const v20, 0x3cceaaf

    xor-int v4, v4, v20

    const v20, 0x74466e78

    goto :goto_4

    .line 93
    :sswitch_c
    invoke-static/range {v19 .. v19}, Ll/ۗۚ;->᩹ۖ᩻(Ljava/lang/Object;)Ll/ܶۖ᩷;

    move-result-object v1

    iput-object v3, v1, Ll/ܶۖ᩷;->ۗ:Ljava/lang/String;

    .line 94
    invoke-static/range {v19 .. v19}, Ll/᩹ۖ᩷;->ܳ(Ll/᩹ۖ᩷;)V

    return-void

    :sswitch_d
    move-object/from16 v18, v4

    .line 92
    iput-object v3, v2, Ll/ܶۖ᩷;->۟:Ll/ᩳ۬ܿ;

    .line 21
    sget v1, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v1, :cond_7

    goto/16 :goto_8

    :cond_7
    const-string v1, "\u1a7a\u06e2"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v16

    mul-int/lit8 v1, v1, 0x6f

    xor-int v4, v1, v17

    mul-int/lit16 v4, v4, -0x2047

    const v20, 0x57be88d8

    xor-int v4, v4, v20

    const v20, -0x3329e30c

    goto :goto_4

    :sswitch_e
    move-object/from16 v18, v4

    .line 92
    invoke-static/range {v19 .. v19}, Ll/ۗۚ;->᩹ۖ᩻(Ljava/lang/Object;)Ll/ܶۖ᩷;

    move-result-object v2

    const/4 v3, 0x0

    sget v1, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v1, :cond_8

    :goto_3
    const-string v1, "\u05ab\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v17, v1

    mul-int/lit8 v1, v1, -0x49

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, -0x3185

    const v20, -0x3cf599

    xor-int v4, v4, v20

    const v20, -0x71d2a013

    goto :goto_4

    :cond_8
    const-string v1, "\u1a74\u1a76"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x81d

    const v20, -0x7eceb646

    xor-int v4, v4, v20

    const v20, 0x3e58dacc

    :goto_4
    xor-int v1, v1, v20

    move-object/from16 v21, v18

    move/from16 v18, v1

    move v1, v4

    goto :goto_5

    :sswitch_f
    move-object/from16 v18, v4

    .line 97
    iget-object v1, v0, Ll/ܺۖ᩷;->ᩳ:Ll/ۡۤۡ;

    invoke-virtual {v1}, Ll/ۡۤۡ;->֫()Z

    move-result v1

    if-eqz v1, :cond_9

    const-string v1, "\u1a77\u05a8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x3f

    xor-int v4, v1, v16

    mul-int/lit16 v4, v4, 0x7da3

    const v20, -0x5d16192

    xor-int v4, v4, v20

    const v20, 0x7c12c9d7

    goto :goto_4

    :cond_9
    const-string v1, "\u073f\u1a74"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v16

    xor-int v4, v1, v17

    mul-int/lit16 v4, v4, -0x1a21

    const v20, -0x5bf8d187

    xor-int v4, v4, v20

    const v20, 0x6fed49e3

    goto :goto_4

    :sswitch_10
    move-object/from16 v18, v4

    .line 91
    iget-object v1, v0, Ll/ܺۖ᩷;->ܿ:Ll/᩹ۖ᩷;

    invoke-static {v1}, Ll/ۗۚ;->᩹ۖ᩻(Ljava/lang/Object;)Ll/ܶۖ᩷;

    move-result-object v4

    iget-object v4, v4, Ll/ܶۖ᩷;->۟:Ll/ᩳ۬ܿ;

    if-eqz v4, :cond_a

    const-string v4, "\u1a79\u0730"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v17

    xor-int v0, v4, v16

    mul-int/lit16 v0, v0, 0x4e23

    const v19, -0x4f4fb52c

    xor-int v0, v0, v19

    const v19, 0x1c39c9fe

    xor-int v4, v4, v19

    move-object/from16 v19, v1

    move v1, v0

    move-object/from16 v0, p0

    move-object/from16 v21, v18

    move/from16 v18, v4

    :goto_5
    move-object/from16 v4, v21

    goto/16 :goto_0

    :cond_a
    const-string v0, "\u06e0\u06db"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x39

    xor-int v4, v0, v17

    mul-int/lit16 v4, v4, 0x1a2d

    const v19, 0x28095bd9

    xor-int v4, v4, v19

    const v19, 0x5e9864c9

    xor-int v0, v0, v19

    move-object/from16 v19, v1

    move v1, v4

    goto/16 :goto_a

    :sswitch_11
    move-object/from16 v18, v4

    const/16 v0, 0x29ff

    const/16 v11, 0x29ff

    goto :goto_6

    :sswitch_12
    move-object/from16 v18, v4

    const v0, 0xb97b

    const v11, 0xb97b

    :goto_6
    const-string v0, "\u06d6\u06e2"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x74a7

    const v4, 0xa141838

    xor-int/2addr v1, v4

    const v4, -0x6b839bef

    goto/16 :goto_9

    :sswitch_13
    move-object/from16 v18, v4

    mul-int v0, v7, v10

    sub-int v0, v9, v0

    if-gez v0, :cond_b

    const-string v0, "\u1a76\u1a7b"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x41

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0xfd1

    const v4, 0x7e43d453

    xor-int/2addr v1, v4

    const v4, 0x4646cb76

    goto/16 :goto_9

    :cond_b
    const-string v0, "\u05a1\u1a78"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x75ff

    const v4, -0x10e693f4

    xor-int/2addr v1, v4

    const v4, -0x24a73ba5

    goto/16 :goto_9

    :sswitch_14
    move-object/from16 v18, v4

    const/16 v10, 0xca6

    sget-boolean v0, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v0, :cond_c

    goto/16 :goto_8

    :cond_c
    const-string v0, "\u06d6\u06db"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x65

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x2d9d

    const v4, 0x60e371be

    xor-int/2addr v1, v4

    const v4, -0x2bfd9ecd

    goto/16 :goto_9

    :sswitch_15
    move-object/from16 v18, v4

    const v0, 0x27fee9

    add-int v9, v8, v0

    .line 16
    sget v0, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v0, :cond_d

    goto :goto_7

    :cond_d
    const-string v0, "\u06eb\u073d"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x5f13

    const v4, -0x51aca1e1

    xor-int/2addr v1, v4

    const v4, -0x3953b979

    goto/16 :goto_9

    :cond_e
    const-string v0, "\u0733\u06eb"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x29

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x3951

    const v4, 0x250047c6

    xor-int/2addr v1, v4

    const v4, 0x39a08106

    goto :goto_9

    :sswitch_16
    move-object/from16 v18, v4

    const/4 v6, 0x0

    .line 66
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v0

    if-nez v0, :cond_f

    :goto_7
    const-string v0, "\u06e4\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x7b

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x73bd

    const v4, -0x56ef90f3

    xor-int/2addr v1, v4

    const v4, -0x794513d2

    goto :goto_9

    :cond_f
    const-string v0, "\u06d8\u0733"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x29

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x78af

    const v4, 0x228025ae

    xor-int/2addr v1, v4

    const v4, -0x46550bb3

    goto :goto_9

    :sswitch_17
    move-object/from16 v18, v4

    sget-object v5, Ll/ܺۖ᩷;->ܰܰۤ:[S

    sget v0, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v0, :cond_10

    :goto_8
    const-string v0, "\u06e4\u06e1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x6921

    const v4, 0x130c832d

    xor-int/2addr v1, v4

    const v4, -0x2399d5d1

    goto :goto_9

    :cond_10
    const-string v0, "\u06e8\u073f"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0xe0d

    const v4, 0x881a368

    xor-int/2addr v1, v4

    const v4, 0x623f9e69

    :goto_9
    xor-int/2addr v0, v4

    :goto_a
    move-object/from16 v4, v18

    move/from16 v18, v0

    move-object/from16 v0, p0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fa71f21 -> :sswitch_3
        -0x71b013cb -> :sswitch_8
        -0x6e4b7d01 -> :sswitch_15
        -0x6b58d555 -> :sswitch_c
        -0x6845ef7b -> :sswitch_5
        -0x63ec7ef5 -> :sswitch_d
        -0x60a97595 -> :sswitch_8
        -0x5f141d59 -> :sswitch_e
        -0x529c2c07 -> :sswitch_2
        -0x4cf1c2e3 -> :sswitch_2
        -0x4aa73039 -> :sswitch_5
        -0x47c2abfc -> :sswitch_c
        -0x4304f215 -> :sswitch_0
        -0x2cd02b6f -> :sswitch_3
        -0x2c05e242 -> :sswitch_d
        -0x2b067b98 -> :sswitch_1
        -0x2a448e4b -> :sswitch_16
        -0x24d3059a -> :sswitch_10
        -0x230951e4 -> :sswitch_17
        -0x21b46219 -> :sswitch_7
        -0x2171ea49 -> :sswitch_f
        -0x1d6a4861 -> :sswitch_b
        -0x15aac437 -> :sswitch_11
        -0x14a7b2dc -> :sswitch_13
        -0x10b8b9a9 -> :sswitch_16
        -0xe648427 -> :sswitch_e
        -0xcd91702 -> :sswitch_9
        0x7188d88 -> :sswitch_a
        0xe125298 -> :sswitch_f
        0x1d01f2aa -> :sswitch_9
        0x1f21013b -> :sswitch_1
        0x2b0d12c5 -> :sswitch_14
        0x2b41c712 -> :sswitch_b
        0x2c543b06 -> :sswitch_6
        0x305e2196 -> :sswitch_4
        0x3167971e -> :sswitch_15
        0x31c77fa2 -> :sswitch_0
        0x347a5b20 -> :sswitch_13
        0x49a0f084 -> :sswitch_a
        0x5061b7eb -> :sswitch_14
        0x55e96b24 -> :sswitch_11
        0x562009c5 -> :sswitch_12
        0x5ace3ed4 -> :sswitch_17
        0x624059d3 -> :sswitch_6
        0x65e86f83 -> :sswitch_4
        0x73f4a228 -> :sswitch_7
        0x79dd372d -> :sswitch_10
        0x7d880a5b -> :sswitch_12
    .end sparse-switch
.end method
