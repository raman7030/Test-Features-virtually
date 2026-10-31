.class public final Ll/֫᩸᩷;
.super Ll/۬ۗܿ;
.source "12B7"


# static fields
.field private static final ۢۘۛ:[S


# instance fields
.field public final synthetic ۟:Ll/ۜ᩸᩷;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/֫᩸᩷;->ۢۘۛ:[S

    return-void

    :array_0
    .array-data 2
        0x247es
        -0x242cs
        0x2868s
        -0x3875s
        -0x25ces
        -0x29c1s
        -0x15c6s
        0x3796s
        0x3e98s
        0x3dbbs
    .end array-data
.end method

.method public constructor <init>(Ll/ۜ᩸᩷;Ll/ۜ᩸᩷;)V
    .locals 4

    const v0, 0x103268a

    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    sget v2, Ll/֡᩺;->ᩴ᩹ۛ:I

    .line 350
    iput-object p1, p0, Ll/֫᩸᩷;->۟:Ll/ۜ᩸᩷;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    const-string p1, "\u06eb\u1a73"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x27

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x468b

    const v3, 0x43d7e96d

    xor-int/2addr p2, v3

    const v3, -0x6e9365a2

    :goto_0
    xor-int/2addr p1, v3

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x6e3f

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr p2, v0

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 92
    sget-boolean p1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez p1, :cond_3

    const-string p1, "\u073f\u06d9"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x2cf9

    const v3, -0x1fcd67c2

    xor-int/2addr p2, v3

    const v3, -0x238be1ab

    goto :goto_0

    .line 191
    :sswitch_0
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget p1, Ll/֡ᩴ;->ܳۤ֫:I

    if-gez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u05a1\u0730"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x47

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x7b5b

    const v3, -0x14b361cb

    xor-int/2addr p2, v3

    const v3, -0x7963e109

    goto :goto_0

    .line 128
    :sswitch_1
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_2

    :cond_1
    const-string p1, "\u05a1\u06db"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x13

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x1e6f

    const v3, 0x5a112d27

    xor-int/2addr p2, v3

    const v3, -0x41624341

    goto :goto_0

    .line 157
    :sswitch_2
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    sget-boolean p1, Ll/֨۫;->۬᩷᩶:Z

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u0736\u0736"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x291b

    const v3, -0x6dc0bf0c

    xor-int/2addr p2, v3

    const v3, 0x41ab9880

    goto :goto_0

    .line 84
    :sswitch_3
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    :goto_2
    const-string p1, "\u06ec\u1a78"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x1315

    const v3, 0x19506791

    xor-int/2addr p2, v3

    const v3, -0x5c696af

    goto/16 :goto_0

    .line 307
    :sswitch_4
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    return-void

    :cond_3
    const-string p1, "\u0730\u0730"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x7f31

    const v3, -0x356c4b02    # -4840063.0f

    xor-int/2addr p2, v3

    const v3, 0x59c96c8d

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x333a45b7 -> :sswitch_4
        -0x301b9ba3 -> :sswitch_3
        -0x2cf3c4b3 -> :sswitch_5
        -0x28796f70 -> :sswitch_5
        0xc5524f5 -> :sswitch_2
        0xede3b89 -> :sswitch_1
        0x16ce6d2d -> :sswitch_4
        0x28e91041 -> :sswitch_2
        0x30830c5f -> :sswitch_0
        0x3dfaf4ba -> :sswitch_1
        0x40d16168 -> :sswitch_3
        0x76d2463e -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final ᩴ()V
    .locals 27

    move-object/from16 v0, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

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

    const v18, -0x23a8f251

    sget v19, Ll/֡ᩴ;->ܳۤ֫:I

    sget v20, Ll/ۗ᩷;->᩸᩺ᩳ:I

    const-string v21, "\u1a74\u1a75"

    invoke-static/range {v21 .. v21}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v21

    xor-int v21, v21, v20

    mul-int/lit8 v21, v21, -0xd

    xor-int v1, v21, v19

    mul-int/lit16 v1, v1, -0x24b5

    const v23, -0x58580e35

    xor-int v1, v1, v23

    const v23, 0x47764c20    # 63052.125f

    xor-int v21, v21, v23

    move-object v3, v2

    move-object v7, v5

    move-object/from16 v24, v10

    move/from16 v22, v21

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const v21, -0x23a8f251

    const/16 v23, 0x0

    move-object v10, v9

    move-object v9, v8

    const/4 v8, 0x0

    :goto_0
    xor-int v11, v21, v19

    mul-int/lit16 v11, v11, 0x17dd

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v1, v11

    xor-int v21, v22, v1

    sparse-switch v21, :sswitch_data_0

    move-object/from16 v22, v3

    move-object/from16 v11, v23

    move/from16 v23, v8

    add-int v1, v16, v17

    sub-int v1, v15, v1

    if-lez v1, :cond_10

    const-string v1, "\u1a74\u06e7"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v3, v1, v20

    mul-int/lit16 v3, v3, -0x5aa3

    const v8, -0x5338ad2f

    xor-int/2addr v3, v8

    const v8, -0x6ed9a466

    goto/16 :goto_c

    .line 330
    :sswitch_0
    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v1, :cond_0

    goto :goto_3

    :cond_0
    :goto_1
    move-object/from16 v22, v3

    move-object/from16 v11, v23

    move/from16 v23, v8

    goto/16 :goto_9

    .line 294
    :sswitch_1
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    sget v1, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v1, :cond_7

    goto :goto_3

    .line 117
    :sswitch_2
    sget v1, Ll/ۗۚ;->ܶۛᩴ:I

    if-gez v1, :cond_1

    goto :goto_3

    :cond_1
    move-object/from16 v22, v3

    move-object/from16 v11, v23

    move/from16 v23, v8

    goto/16 :goto_a

    .line 300
    :sswitch_3
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v1

    if-nez v1, :cond_2

    :goto_2
    move-object/from16 v22, v3

    move-object/from16 v11, v23

    move/from16 v23, v8

    goto/16 :goto_b

    :cond_2
    :goto_3
    const-string v1, "\u06da\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, -0x29

    xor-int v11, v1, v20

    mul-int/lit16 v11, v11, -0x64e3

    const v22, 0x5bf0c35f

    xor-int v11, v11, v22

    const v22, -0x6958b928

    goto/16 :goto_6

    .line 7
    :sswitch_4
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    goto :goto_2

    .line 84
    :sswitch_5
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    return-void

    :sswitch_6
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v11, v23

    move/from16 v23, v8

    goto/16 :goto_7

    :sswitch_7
    const/16 v1, 0x39

    if-le v8, v1, :cond_4

    goto :goto_4

    .line 359
    :sswitch_8
    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    const v2, 0x7d1dca0d

    xor-int/2addr v1, v2

    .line 361
    invoke-virtual {v0, v1}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 359
    :sswitch_9
    sget-object v1, Ll/֫᩸᩷;->ۢۘۛ:[S

    const/4 v10, 0x7

    const/4 v11, 0x3

    invoke-static {v1, v10, v11, v6}, Ll/֫ܺ;->᩶֡ۤ([SIII)Ljava/lang/String;

    move-result-object v10

    .line 305
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    const-string v1, "\u0736\u06eb"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v11, v1, v20

    mul-int/lit16 v11, v11, -0x6593

    const v22, 0x2615ad6

    xor-int v11, v11, v22

    const v22, -0x176375bf

    goto/16 :goto_6

    :sswitch_a
    const/16 v1, 0x5a

    if-le v8, v1, :cond_4

    goto :goto_5

    :cond_4
    const-string v1, "\u06db\u06df"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0x33

    xor-int v11, v1, v20

    mul-int/lit16 v11, v11, -0x7da5

    const v22, -0x578e15ee

    xor-int v11, v11, v22

    const v22, -0x2622a1c6

    goto :goto_6

    :sswitch_b
    const/16 v1, 0x30

    if-lt v8, v1, :cond_5

    const-string v1, "\u06dc\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x7255

    const v22, -0xc167487

    xor-int v11, v11, v22

    const v22, 0x147d4a13

    goto :goto_6

    :cond_5
    :goto_4
    const-string v1, "\u1a75\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x1d

    xor-int v11, v1, v20

    mul-int/lit16 v11, v11, 0x50b

    const v22, -0x1fcf7848

    xor-int v11, v11, v22

    const v22, 0x6fa51ca

    goto :goto_6

    .line 359
    :sswitch_c
    aget-char v8, v3, v5

    const/16 v1, 0x41

    if-lt v8, v1, :cond_6

    const-string v1, "\u1a73\u06ec"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, 0x7c93

    const v22, 0x520e577

    xor-int v11, v11, v22

    const v22, 0x6f1d18e7

    goto :goto_6

    :cond_6
    :goto_5
    const-string v1, "\u06e0\u06e4"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, 0x55

    xor-int v11, v1, v19

    mul-int/lit16 v11, v11, -0x142b

    const v22, -0x215c7431

    xor-int v11, v11, v22

    const v22, -0x312a2bd9

    :goto_6
    xor-int v22, v1, v22

    move v1, v11

    goto/16 :goto_0

    .line 366
    :sswitch_d
    invoke-static/range {v23 .. v23}, Ll/֨۬;->ᩴ᩵᩸(Ljava/lang/Object;)V

    .line 367
    new-instance v1, Ll/۟ܶ᩷;

    move-object/from16 v11, v23

    invoke-direct {v1, v0, v11}, Ll/۟ܶ᩷;-><init>(Ll/֫᩸᩷;Ll/۬۬ܿ;)V

    invoke-static {v7, v1, v2}, Ll/ۖ۠ۡ;->֫(Landroid/app/Activity;Ll/۟ܶ᩷;Ljava/lang/String;)V

    return-void

    .line 366
    :sswitch_e
    new-instance v1, Ll/۬۬ܿ;

    sget-object v11, Ll/֫᩸᩷;->ۢۘۛ:[S

    .line 271
    sget v22, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v22, :cond_8

    :cond_7
    const-string v1, "\u0730\u1a7a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v19, v1

    mul-int/lit8 v1, v1, 0x13

    xor-int v11, v1, v20

    mul-int/lit16 v11, v11, -0xeed

    const v22, 0x5a6b12bf

    xor-int v11, v11, v22

    const v22, 0x2037b556

    xor-int v22, v1, v22

    move v1, v11

    const/16 v23, 0x0

    goto/16 :goto_0

    :cond_8
    move-object/from16 v22, v3

    const/4 v3, 0x4

    move/from16 v23, v8

    const/4 v8, 0x3

    .line 366
    invoke-static {v11, v3, v8, v6}, Ll/᩹;->ۡ᩺ᩴ([SIII)Ljava/lang/String;

    move-result-object v3

    sget v8, Ll/۠;->ܺܺܶ:I

    if-ltz v8, :cond_9

    const-string v1, "\u06dc\u06d8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v3, v1, v20

    mul-int/lit16 v3, v3, -0x111f

    const v8, 0x3b90b745

    xor-int/2addr v3, v8

    const v8, 0x47718e42

    xor-int/2addr v1, v8

    move/from16 v8, v23

    const/16 v23, 0x0

    goto/16 :goto_d

    :cond_9
    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    const v8, 0x7e8e5086

    xor-int/2addr v3, v8

    invoke-direct {v1, v7, v3}, Ll/۬۬ܿ;-><init>(Ll/ۗܺ᩷;I)V

    sget v3, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v3, :cond_a

    move-object v11, v1

    goto/16 :goto_9

    :cond_a
    const-string v3, "\u06eb\u06da"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v20

    xor-int v8, v3, v19

    mul-int/lit16 v8, v8, 0x7cb

    const v11, 0x23b68ea1

    xor-int/2addr v8, v11

    const v11, -0x54703a25

    xor-int/2addr v3, v11

    move/from16 v25, v23

    move-object/from16 v23, v1

    move v1, v8

    move/from16 v8, v25

    move-object/from16 v26, v22

    move/from16 v22, v3

    move-object/from16 v3, v26

    goto/16 :goto_0

    :sswitch_f
    move-object/from16 v22, v3

    move-object/from16 v11, v23

    move/from16 v23, v8

    .line 365
    sget-object v1, Ll/᩹ᩴۡ;->֫:Ll/ۚۡ֫;

    iget-object v7, v0, Ll/֫᩸᩷;->۟:Ll/ۜ᩸᩷;

    invoke-virtual {v1, v7}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;)V

    .line 256
    sget-boolean v1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v1, :cond_b

    goto/16 :goto_a

    :cond_b
    const-string v1, "\u06d6\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x7d

    xor-int v3, v1, v20

    mul-int/lit16 v3, v3, 0x7aa7

    const v8, 0x26cff3d0

    xor-int/2addr v3, v8

    const v8, -0x62e18cb4

    goto/16 :goto_c

    :sswitch_10
    move-object/from16 v22, v3

    move-object/from16 v11, v23

    move/from16 v23, v8

    if-ge v5, v4, :cond_c

    const-string v1, "\u06e1\u1a7a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, -0x39

    xor-int v3, v1, v20

    mul-int/lit16 v3, v3, 0x5859

    const v8, -0x6721b5f4

    xor-int/2addr v3, v8

    const v8, -0x65e14974

    goto/16 :goto_c

    :cond_c
    const-string v1, "\u1a7b\u06ec"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v3, v1, v20

    mul-int/lit16 v3, v3, -0x9d9

    const v8, 0xb6d7f1a

    xor-int/2addr v3, v8

    const v8, -0x8d636f8

    goto/16 :goto_c

    .line 355
    :sswitch_11
    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    const v2, 0x7eb4cdca

    xor-int/2addr v1, v2

    .line 356
    invoke-virtual {v0, v1}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    :sswitch_12
    move-object/from16 v22, v3

    move-object/from16 v11, v23

    move/from16 v23, v8

    .line 355
    sget-object v1, Ll/֫᩸᩷;->ۢۘۛ:[S

    const/4 v3, 0x1

    const/4 v8, 0x3

    invoke-static {v1, v3, v8, v6}, Ll/֫ۧ;->᩷ᩳ᩺([SIII)Ljava/lang/String;

    move-result-object v9

    .line 190
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v1

    if-eqz v1, :cond_d

    goto/16 :goto_a

    :cond_d
    const-string v1, "\u0730\u1a74"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x6b

    xor-int v3, v1, v20

    mul-int/lit16 v3, v3, 0x49b1

    const v8, -0x2adc67f3

    xor-int/2addr v3, v8

    const v8, 0x5d6a6182

    goto/16 :goto_c

    :sswitch_13
    move-object/from16 v11, v23

    move/from16 v23, v8

    .line 359
    invoke-virtual {v2}, Ljava/lang/String;->toCharArray()[C

    move-result-object v1

    array-length v3, v1

    const/4 v4, 0x0

    move v4, v3

    const/4 v5, 0x0

    move-object v3, v1

    :goto_7
    const-string v1, "\u1a74\u06e4"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x41

    xor-int v8, v1, v19

    mul-int/lit16 v8, v8, 0x4565

    const v22, -0xe8a85a0

    xor-int v8, v8, v22

    const v22, -0x6bfc3aef

    xor-int v22, v1, v22

    move v1, v8

    move/from16 v8, v23

    move-object/from16 v23, v11

    goto/16 :goto_0

    :sswitch_14
    move-object/from16 v22, v3

    move-object/from16 v11, v23

    move/from16 v23, v8

    .line 355
    invoke-static {v2}, Ll/֨֫;->ۡۚܽ(Ljava/lang/Object;)I

    move-result v1

    const/16 v3, 0x20

    if-eq v1, v3, :cond_e

    const-string v1, "\u06df\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v3, v1, v19

    mul-int/lit16 v3, v3, 0x7d91

    const v8, 0x6089e671

    xor-int/2addr v3, v8

    const v8, -0x1b515fa7

    goto/16 :goto_c

    :cond_e
    const-string v1, "\u06e4\u06e8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, -0x3b

    xor-int v3, v1, v19

    mul-int/lit16 v3, v3, 0x3b89

    const v8, -0x2c970791    # -1.00060044E12f

    xor-int/2addr v3, v8

    const v8, -0x481272dc

    goto/16 :goto_c

    :sswitch_15
    move-object/from16 v22, v3

    move-object/from16 v11, v23

    move/from16 v23, v8

    .line 354
    invoke-virtual/range {p0 .. p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/֫᩺;->۬ܳܶ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 348
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v1

    if-nez v1, :cond_f

    goto :goto_9

    :cond_f
    const-string v1, "\u06ec\u1a76"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    xor-int v3, v1, v20

    mul-int/lit16 v3, v3, -0x1a99

    const v8, 0x447e8ac1

    xor-int/2addr v3, v8

    const v8, -0x5ae08381

    goto/16 :goto_c

    :sswitch_16
    move-object/from16 v22, v3

    move-object/from16 v11, v23

    move/from16 v23, v8

    const/16 v1, 0x365d

    const/16 v6, 0x365d

    goto :goto_8

    :sswitch_17
    move-object/from16 v22, v3

    move-object/from16 v11, v23

    move/from16 v23, v8

    const v1, 0xb043

    const v6, 0xb043

    :goto_8
    const-string v1, "\u1a75\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, -0x31

    xor-int v3, v1, v19

    mul-int/lit16 v3, v3, -0x35f1

    const v8, -0x4780dc3

    xor-int/2addr v3, v8

    const v8, 0x4af8b4af    # 8149591.5f

    goto/16 :goto_c

    :cond_10
    const-string v1, "\u0730\u06d6"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v20, v1

    mul-int/lit8 v1, v1, -0x6d

    xor-int v3, v1, v19

    mul-int/lit16 v3, v3, -0x7483

    const v8, 0x436f2a93

    xor-int/2addr v3, v8

    const v8, 0x6e5da734

    goto/16 :goto_c

    :sswitch_18
    move-object/from16 v22, v3

    move-object/from16 v11, v23

    move/from16 v23, v8

    mul-int v15, v13, v14

    mul-int v16, v13, v13

    const v17, 0x2626ff9

    sget-boolean v1, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v1, :cond_11

    :goto_9
    const-string v1, "\u1a77\u1a79"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v3, v1, v19

    mul-int/lit16 v3, v3, -0x275f

    const v8, -0x8fdc425

    xor-int/2addr v3, v8

    const v8, -0x2e916fa1

    goto/16 :goto_c

    :cond_11
    const-string v1, "\u05a1\u06e8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x41

    xor-int v3, v1, v20

    mul-int/lit16 v3, v3, 0x2fad

    const v8, -0x56cf1416

    xor-int/2addr v3, v8

    const v8, 0x3bae3475

    goto :goto_c

    :sswitch_19
    move-object/from16 v22, v3

    move-object/from16 v11, v23

    move/from16 v23, v8

    aget-short v13, v24, v12

    const/16 v14, 0x316a

    .line 134
    sget v1, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v1, :cond_12

    :goto_a
    const-string v1, "\u1a74\u06d8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v3, v1, v19

    mul-int/lit16 v3, v3, -0x6ab7

    const v8, -0x385fac0d

    xor-int/2addr v3, v8

    const v8, -0x1fdc39c

    goto :goto_c

    :cond_12
    const-string v1, "\u06e8\u06dc"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v19

    mul-int/lit8 v1, v1, 0x15

    xor-int v3, v1, v20

    mul-int/lit16 v3, v3, 0x3877

    const v8, -0x299d4e10

    xor-int/2addr v3, v8

    const v8, -0x10fbd30b

    goto :goto_c

    :sswitch_1a
    move-object/from16 v22, v3

    move-object/from16 v11, v23

    move/from16 v23, v8

    sget-object v24, Ll/֫᩸᩷;->ۢۘۛ:[S

    const/4 v12, 0x0

    sget v1, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v1, :cond_13

    :goto_b
    const-string v1, "\u06e7\u06df"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    xor-int v3, v1, v19

    mul-int/lit16 v3, v3, -0x36d3

    const v8, 0x10694591

    xor-int/2addr v3, v8

    const v8, 0xb69773e

    goto :goto_c

    :cond_13
    const-string v1, "\u06e2\u05a8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v20

    mul-int/lit8 v1, v1, 0x21

    xor-int v3, v1, v19

    mul-int/lit16 v3, v3, 0x7e5b

    const v8, 0xa470b07

    xor-int/2addr v3, v8

    const v8, 0x1b2ddf0c

    :goto_c
    xor-int/2addr v1, v8

    move/from16 v8, v23

    move-object/from16 v23, v11

    :goto_d
    move-object/from16 v25, v22

    move/from16 v22, v1

    move v1, v3

    move-object/from16 v3, v25

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7bfeccf9 -> :sswitch_19
        -0x7abb4e40 -> :sswitch_12
        -0x7a58445a -> :sswitch_4
        -0x68f6a7dd -> :sswitch_14
        -0x63d09c5f -> :sswitch_15
        -0x601434d3 -> :sswitch_3
        -0x594ae2d9 -> :sswitch_12
        -0x4f7999e1 -> :sswitch_b
        -0x4f78ecf0 -> :sswitch_1
        -0x4d415b6d -> :sswitch_e
        -0x4973eace -> :sswitch_10
        -0x45c3fa78 -> :sswitch_5
        -0x43f5111e -> :sswitch_11
        -0x3f9f815e -> :sswitch_4
        -0x3db5d493 -> :sswitch_6
        -0x3ba774b4 -> :sswitch_19
        -0x359a2ac7 -> :sswitch_d
        -0x2ee094ef -> :sswitch_7
        -0x2c97fd0c -> :sswitch_13
        -0x2a06ce0b -> :sswitch_c
        -0x271c7957 -> :sswitch_13
        -0x25ef7969 -> :sswitch_d
        -0x2175556f -> :sswitch_0
        -0x20003f8a -> :sswitch_1a
        -0x97f3ce3 -> :sswitch_e
        -0x8093a1a -> :sswitch_8
        0x25e116e -> :sswitch_10
        0x68185bb -> :sswitch_11
        0x8540776 -> :sswitch_15
        0x8de9ec6 -> :sswitch_16
        0xef4ef93 -> :sswitch_a
        0x1146589a -> :sswitch_16
        0x2049466a -> :sswitch_0
        0x21359231 -> :sswitch_17
        0x25712325 -> :sswitch_a
        0x2cb00754 -> :sswitch_c
        0x3ce472da -> :sswitch_14
        0x40521ae4 -> :sswitch_1a
        0x4d96cc29 -> :sswitch_2
        0x4dea83e2 -> :sswitch_b
        0x4eba35aa -> :sswitch_18
        0x5793e54b -> :sswitch_9
        0x58d0fba0 -> :sswitch_17
        0x6798a02b -> :sswitch_1
        0x6a83664b -> :sswitch_5
        0x6b27ff48 -> :sswitch_3
        0x6dfbc300 -> :sswitch_2
        0x6ed10d76 -> :sswitch_f
        0x6edb6824 -> :sswitch_18
        0x7167939b -> :sswitch_8
        0x73e13349 -> :sswitch_f
        0x74d564cb -> :sswitch_6
        0x75975dfb -> :sswitch_7
        0x7713d325 -> :sswitch_9
    .end sparse-switch
.end method
