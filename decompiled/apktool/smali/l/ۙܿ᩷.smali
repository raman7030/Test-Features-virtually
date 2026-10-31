.class public final Ll/ۙܿ᩷;
.super Ljava/lang/Object;
.source "Z43S"


# static fields
.field public static final ֫:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3e

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    .line 796
    invoke-static {}, Ll/ۙܿ᩷;->֫()[B

    move-result-object v0

    sput-object v0, Ll/ۙܿ᩷;->֫:[B

    return-void
.end method

.method public static ֫([BI)V
    .locals 22
    .annotation build Ll/۬۠ܽ;
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

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

    const v16, -0x3bb14076

    sget v17, Ll/ۘܿ;->ۘܰ۫:I

    sget v18, Ll/ۖ۫;->ۖ֫ܿ:I

    const-string v19, "\u06d9\u1a74"

    invoke-static/range {v19 .. v19}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v17

    mul-int/lit8 v19, v19, -0x23

    xor-int v2, v19, v18

    mul-int/lit16 v2, v2, 0x778d

    const v21, -0x3af868cb

    xor-int v2, v2, v21

    const v21, -0x510eefc1

    xor-int v19, v19, v21

    move/from16 v20, v19

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

    const v19, -0x3bb14076

    const/16 v21, 0x0

    :goto_0
    xor-int v3, v19, v18

    mul-int/lit16 v3, v3, -0x716d

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v2, v3

    xor-int v19, v20, v2

    sparse-switch v19, :sswitch_data_0

    int-to-byte v14, v13

    .line 103
    sget v2, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v2, :cond_2

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    sget v2, Ll/ۗ۬;->ۘܳ᩻:I

    if-lez v2, :cond_d

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_4

    :cond_0
    move/from16 v2, v21

    goto/16 :goto_a

    :sswitch_2
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v2

    if-lez v2, :cond_8

    goto/16 :goto_3

    .line 604
    :sswitch_3
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    goto/16 :goto_3

    .line 225
    :sswitch_4
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    return-void

    .line 816
    :sswitch_5
    aput-byte v16, v0, v4

    add-int/lit8 v4, v4, 0x1

    move/from16 v2, v21

    goto/16 :goto_6

    :sswitch_6
    aget-byte v2, v0, v4

    xor-int/2addr v2, v15

    int-to-byte v2, v2

    .line 786
    sget-boolean v3, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v3, :cond_1

    move/from16 v16, v2

    goto/16 :goto_8

    :cond_1
    const-string v3, "\u0733\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    mul-int/lit8 v3, v3, -0x75

    move/from16 v16, v2

    xor-int v2, v3, v18

    mul-int/lit16 v2, v2, -0x68e7

    const v20, -0x4fa2ae32

    xor-int v2, v2, v20

    const v20, 0x2e8c9a8e

    xor-int v20, v3, v20

    goto :goto_0

    :sswitch_7
    const/16 v2, 0xa7

    const/16 v15, 0xa7

    goto :goto_1

    :sswitch_8
    const/16 v2, 0xa8

    const/16 v15, 0xa8

    :goto_1
    const-string v2, "\u06e8\u06da"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    mul-int/lit8 v2, v2, 0xf

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, -0xe6f

    const v20, 0x73ed49e7

    xor-int v3, v3, v20

    const v20, 0x2063ea3f

    goto/16 :goto_5

    .line 820
    :sswitch_9
    aput-byte v14, v0, v5

    add-int/lit8 v5, v5, 0x1

    move/from16 v2, v21

    goto/16 :goto_7

    :cond_2
    const-string v2, "\u1a73\u073f"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v18, v2

    mul-int/lit8 v2, v2, 0x43

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, -0x6ef7

    const v20, 0x5dd827c7

    xor-int v3, v3, v20

    const v20, 0x398d94f1

    goto/16 :goto_5

    :sswitch_a
    sget-object v2, Ll/ۙܿ᩷;->֫:[B

    aget-byte v2, v2, v12

    xor-int v13, v6, v2

    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v2

    if-eqz v2, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v2, "\u1a74\u1a7a"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    mul-int/lit8 v2, v2, -0x5

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, -0x3329

    const v20, -0x204335f0

    xor-int v3, v3, v20

    const v20, -0x2abd5ddd

    goto/16 :goto_5

    :sswitch_b
    rem-int v12, v10, v11

    .line 174
    sget v2, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v2, :cond_4

    goto :goto_2

    :cond_4
    const-string v2, "\u05ab\u1a75"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, 0x7ecf

    const v20, 0x365ee912

    xor-int v3, v3, v20

    const v20, 0x6fa50786

    goto/16 :goto_5

    .line 820
    :sswitch_c
    div-int v10, v8, v9

    const/16 v11, 0x8

    sget v2, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v2, :cond_5

    :goto_2
    const-string v2, "\u05a8\u1a7a"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, -0x4345

    const v20, -0x6e6d7ea9

    xor-int v3, v3, v20

    const v20, 0x75b3a61f

    goto/16 :goto_5

    :cond_5
    const-string v2, "\u1a76\u1a77"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, -0x5f29

    const v20, 0x49ac6dc4    # 1412536.5f

    xor-int v3, v3, v20

    const v20, 0x770d597d

    goto/16 :goto_5

    :sswitch_d
    const/16 v9, 0x9

    .line 396
    sget v2, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v2, :cond_6

    goto :goto_3

    :cond_6
    const-string v2, "\u1a76\u1a74"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    mul-int/lit8 v2, v2, -0x31

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, 0x531f

    const v20, 0x40babdfa

    xor-int v3, v3, v20

    const v20, -0x4a800794

    goto/16 :goto_5

    :sswitch_e
    mul-int v8, v5, v7

    .line 661
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v2

    if-ltz v2, :cond_7

    :goto_3
    const-string v2, "\u1a75\u06d8"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v17, v2

    mul-int/lit8 v2, v2, 0x6f

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, -0xf13

    const v20, 0x396ed40f

    xor-int v3, v3, v20

    const v20, -0x62694f92

    goto/16 :goto_5

    :cond_7
    const-string v2, "\u1a74\u1a76"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, -0xdd1

    const v20, 0x73d5f4a4

    xor-int v3, v3, v20

    const v20, 0x15911d8

    goto/16 :goto_5

    .line 820
    :sswitch_f
    aget-byte v6, v0, v5

    const/16 v7, 0x1f

    .line 41
    sget v2, Ll/۟;->ۗۤۛ:I

    if-eqz v2, :cond_9

    :cond_8
    :goto_4
    const-string v2, "\u06e2\u05ab"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, 0xc39

    const v20, -0x7651212e

    xor-int v3, v3, v20

    const v20, 0x4b1db804    # 1.033626E7f

    goto/16 :goto_5

    :cond_9
    const-string v2, "\u073a\u06eb"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, -0x71ff

    const v20, -0xe98c148

    xor-int v3, v3, v20

    const v20, -0xbfb230e

    goto/16 :goto_5

    .line 814
    :sswitch_10
    rem-int/lit8 v2, v4, 0x2

    if-nez v2, :cond_a

    const-string v2, "\u1a75\u05a1"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v18, v2

    mul-int/lit8 v2, v2, -0x9

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, -0x34f

    const v20, -0x2f810209

    xor-int v3, v3, v20

    const v20, -0x6b89be15

    goto :goto_5

    :cond_a
    const-string v2, "\u05a1\u06e7"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v17

    mul-int/lit8 v2, v2, -0x5f

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, -0x76db

    const v20, 0x4b8c346f    # 1.8376926E7f

    xor-int v3, v3, v20

    const v20, -0x51feabaf

    goto :goto_5

    :sswitch_11
    return-void

    :sswitch_12
    if-ge v5, v1, :cond_b

    const-string v2, "\u06da\u06da"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, -0x2a53

    const v20, 0x2c2cefe5

    xor-int v3, v3, v20

    const v20, 0x3e77a4f6

    goto :goto_5

    :sswitch_13
    if-ge v4, v1, :cond_b

    const-string v2, "\u073d\u06db"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v17, v2

    mul-int/lit8 v2, v2, -0x5f

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, -0x72af

    const v20, 0x263361e6

    xor-int v3, v3, v20

    const v20, 0x47922728    # 74830.31f

    goto :goto_5

    :cond_b
    const-string v2, "\u06d6\u05ab"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x5d

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, 0x11dd

    const v20, 0x46ce7bf1

    xor-int v3, v3, v20

    const v20, -0x36ba362a

    :goto_5
    xor-int v20, v2, v20

    goto/16 :goto_c

    :sswitch_14
    move/from16 v2, v21

    .line 812
    invoke-static {v2, v0}, Ll/֫ۧ;->ܰۗۘ(ILjava/lang/Object;)I

    move-result v3

    const v0, -0x5d20323d

    if-ne v3, v0, :cond_c

    move v4, v2

    :goto_6
    const-string v0, "\u1a7b\u0736"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x6b

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x1e31

    const v20, 0x4ca9b771    # 8.898036E7f

    xor-int v3, v3, v20

    const v20, -0x293fe217

    goto/16 :goto_b

    :cond_c
    move v5, v2

    :goto_7
    const-string v0, "\u05a8\u06df"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x39

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, 0x3e13

    const v20, 0x7975db11

    xor-int v3, v3, v20

    const v20, -0x7fa401fa

    goto :goto_b

    :sswitch_15
    const/16 v21, 0x0

    .line 553
    sget v0, Ll/۠;->ܺܺܶ:I

    if-ltz v0, :cond_e

    :cond_d
    :goto_8
    const-string v0, "\u0733\u05ab"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x17

    xor-int v2, v0, v18

    mul-int/lit16 v2, v2, -0x11bb

    const v3, 0x22a687cc

    xor-int/2addr v2, v3

    const v3, -0x34f6e4e3    # -8985373.0f

    goto :goto_9

    :cond_e
    const-string v0, "\u06e2\u1a79"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v2, v0, v17

    mul-int/lit16 v2, v2, 0x6585

    const v3, 0x6b472abb

    xor-int/2addr v2, v3

    const v3, 0x5e9c501d

    :goto_9
    xor-int v20, v0, v3

    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_16
    move/from16 v2, v21

    .line 618
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v0

    if-eqz v0, :cond_f

    :goto_a
    const-string v0, "\u06df\u1a7b"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v3, v0, v17

    mul-int/lit16 v3, v3, -0x27bf

    const v20, -0x46b18ccc

    xor-int v3, v3, v20

    const v20, -0xdcbfee0

    goto :goto_b

    :cond_f
    const-string v0, "\u06eb\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0xb

    xor-int v3, v0, v18

    mul-int/lit16 v3, v3, -0x18a7

    const v20, 0x5822cefc

    xor-int v3, v3, v20

    const v20, -0x3ba54609

    :goto_b
    xor-int v20, v0, v20

    move-object/from16 v0, p0

    move/from16 v21, v2

    :goto_c
    move v2, v3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7cd8432d -> :sswitch_7
        -0x7c8dda26 -> :sswitch_5
        -0x7c7f69cb -> :sswitch_4
        -0x77411d8e -> :sswitch_c
        -0x76feb17e -> :sswitch_d
        -0x75ba79c6 -> :sswitch_13
        -0x74b5e7e3 -> :sswitch_1
        -0x68d614ec -> :sswitch_5
        -0x667cf83c -> :sswitch_7
        -0x626f67d5 -> :sswitch_11
        -0x610d41ea -> :sswitch_3
        -0x58f4b420 -> :sswitch_6
        -0x4d359a77 -> :sswitch_9
        -0x49d39192 -> :sswitch_f
        -0x3f4654a7 -> :sswitch_3
        -0x340fa451 -> :sswitch_8
        -0x2ac78862 -> :sswitch_14
        -0x2881a66e -> :sswitch_e
        -0x23cc65cf -> :sswitch_12
        -0x22d4ce27 -> :sswitch_4
        -0x1fa9f33c -> :sswitch_15
        -0x1c16d834 -> :sswitch_2
        -0x1bfefa08 -> :sswitch_a
        -0x14298752 -> :sswitch_13
        -0xe6f2aa6 -> :sswitch_c
        -0xae05306 -> :sswitch_10
        -0xa62fab8 -> :sswitch_16
        -0x21781eb -> :sswitch_0
        -0xaaf99c -> :sswitch_b
        0xc17a75 -> :sswitch_1
        0xefedf85 -> :sswitch_6
        0x11c84db4 -> :sswitch_d
        0x12e9ba52 -> :sswitch_8
        0x14b37bd0 -> :sswitch_a
        0x169f5a0b -> :sswitch_b
        0x211817f2 -> :sswitch_10
        0x25204bf7 -> :sswitch_15
        0x30b68479 -> :sswitch_12
        0x468d03e8 -> :sswitch_0
        0x47dc1e57 -> :sswitch_f
        0x6df7833a -> :sswitch_16
        0x73dfbacb -> :sswitch_11
        0x798cc7ee -> :sswitch_9
        0x79902608 -> :sswitch_2
        0x7a767962 -> :sswitch_14
        0x7fa0f257 -> :sswitch_e
    .end sparse-switch
.end method

.method public static native ֫()[B
.end method

.method public static ۧ([BI)V
    .locals 18
    .annotation build Ll/۬۠ܽ;
    .end annotation

    const/4 v0, 0x0

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

    const v11, 0xd37412c

    sget v12, Ll/֫ܽ;->ۚ᩷᩹:I

    sget v13, Ll/ۗ᩷;->᩸᩺ᩳ:I

    const-string v14, "\u1a7b\u1a79"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x36e7

    const v16, 0x26fe4302

    xor-int v15, v15, v16

    const v16, -0x594b8ef4

    :goto_0
    xor-int v14, v14, v16

    :goto_1
    xor-int/2addr v11, v13

    mul-int/lit16 v11, v11, 0x4c2f

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    .line 27
    sget v14, Ll/ۗۗ;->ۨ۬ۖ:I

    if-gez v14, :cond_8

    :cond_0
    :goto_2
    move/from16 v14, p1

    move/from16 v16, v0

    goto/16 :goto_9

    .line 743
    :sswitch_0
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v14

    if-nez v14, :cond_0

    goto :goto_3

    .line 281
    :sswitch_1
    sget v14, Ll/ۘۛ;->ۖۚ֡:I

    if-lez v14, :cond_1

    goto :goto_3

    .line 135
    :sswitch_2
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    goto :goto_3

    .line 138
    :sswitch_3
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    return-void

    .line 828
    :sswitch_4
    aput-byte v10, p0, v0

    add-int/lit8 v0, v0, 0x1

    move/from16 v14, p1

    goto/16 :goto_6

    :sswitch_5
    int-to-byte v10, v9

    .line 13
    sget-boolean v14, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v14, :cond_2

    :cond_1
    const-string v14, "\u06e0\u1a76"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x13bf

    const v16, -0x7de9492

    xor-int v15, v15, v16

    const v16, 0x9515d91

    goto :goto_0

    :cond_2
    const-string v14, "\u073d\u05a8"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x31

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x6a0b

    const v16, 0x3e78efc8

    xor-int v15, v15, v16

    const v16, 0x5b5f7bec

    goto :goto_0

    :sswitch_6
    xor-int v9, v1, v8

    .line 345
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v14

    if-eqz v14, :cond_3

    :goto_3
    const-string v14, "\u0736\u06e2"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x3ef3

    const v16, 0x547b694d

    xor-int v15, v15, v16

    const v16, -0x69cd466d

    goto :goto_0

    :cond_3
    const-string v14, "\u1a75\u1a79"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x38bd

    const v16, 0x2ef0cf2

    xor-int v15, v15, v16

    const v16, -0x75c92842

    goto/16 :goto_0

    .line 828
    :sswitch_7
    sget-object v8, Ll/ۙܿ᩷;->֫:[B

    aget-byte v8, v8, v7

    .line 85
    sget v14, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v14, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v14, "\u1a74\u06e4"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, 0x2d

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x39b3

    const v16, 0xaa735c7

    xor-int v15, v15, v16

    const v16, -0x60887208

    goto/16 :goto_0

    .line 828
    :sswitch_8
    rem-int v7, v5, v6

    .line 69
    sget v14, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v14, :cond_5

    :goto_4
    move/from16 v14, p1

    move/from16 v16, v0

    goto/16 :goto_8

    :cond_5
    const-string v14, "\u073a\u06da"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    mul-int/lit8 v14, v14, -0x45

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x119d

    const v16, -0x33c2cf84    # -4.9594864E7f

    xor-int v15, v15, v16

    const v16, 0x13e91e1f

    goto/16 :goto_0

    .line 828
    :sswitch_9
    div-int v5, v3, v4

    const/16 v6, 0x8

    .line 662
    sget-boolean v14, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v14, :cond_6

    goto/16 :goto_2

    :cond_6
    const-string v14, "\u06e8\u1a75"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, -0x3d

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x7981

    const v16, -0x3ded2cd9

    xor-int v15, v15, v16

    const v16, 0xb1078a

    goto/16 :goto_0

    :sswitch_a
    const/16 v4, 0x9

    sget-boolean v14, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v14, :cond_7

    goto :goto_5

    :cond_7
    const-string v14, "\u06d9\u0730"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v13

    mul-int/lit8 v14, v14, -0x39

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x264f

    const v16, 0x402b7df2

    xor-int v15, v15, v16

    const v16, -0x57cccba9

    goto/16 :goto_0

    :sswitch_b
    mul-int v3, v0, v2

    .line 268
    sget-boolean v14, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v14, :cond_9

    :cond_8
    :goto_5
    const-string v14, "\u0733\u05a1"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v13

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, 0x1e7d

    const v16, -0x49ac5af6

    xor-int v15, v15, v16

    const v16, 0x742c53b4

    goto/16 :goto_0

    :cond_9
    const-string v14, "\u0730\u1a74"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x3f

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x6769

    const v16, -0x15de19f

    xor-int v15, v15, v16

    const v16, 0x1fffad64

    goto/16 :goto_0

    .line 828
    :sswitch_c
    aget-byte v1, p0, v0

    const/16 v2, 0x1f

    .line 500
    sget v14, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v14, :cond_a

    goto/16 :goto_4

    :cond_a
    const-string v14, "\u1a7b\u1a75"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, -0x464b

    const v16, -0x60122411

    xor-int v15, v15, v16

    const v16, 0x3a740cbd

    goto/16 :goto_0

    :sswitch_d
    return-void

    :sswitch_e
    move/from16 v14, p1

    if-ge v0, v14, :cond_b

    const-string v15, "\u1a79\u06e1"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    add-int/2addr v15, v13

    mul-int/lit8 v15, v15, -0x73

    move/from16 v16, v0

    xor-int v0, v15, v12

    mul-int/lit16 v0, v0, 0x3f57

    const v17, -0x44a6cf2d

    xor-int v0, v0, v17

    const v17, 0x38ea9dfa

    goto :goto_7

    :cond_b
    move/from16 v16, v0

    const-string v0, "\u1a77\u06d9"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x15

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x3935

    const v17, 0x38f27781

    xor-int v15, v15, v17

    const v17, 0x6036a89f

    goto/16 :goto_a

    :sswitch_f
    move/from16 v14, p1

    const/4 v0, 0x0

    :goto_6
    const-string v15, "\u1a78\u06e7"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    move/from16 v16, v0

    xor-int v0, v15, v13

    mul-int/lit16 v0, v0, 0x2e25

    const v17, 0xadabbe6

    xor-int v0, v0, v17

    const v17, -0x54877dce

    :goto_7
    xor-int v15, v15, v17

    move v14, v15

    move v15, v0

    goto :goto_b

    :sswitch_10
    move/from16 v14, p1

    move/from16 v16, v0

    .line 219
    sget v0, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v0, :cond_c

    :goto_8
    const-string v0, "\u0730\u1a7b"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v12

    mul-int/lit8 v0, v0, 0x79

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x345

    const v17, -0xe70e0ed

    xor-int v15, v15, v17

    const v17, -0x1b4baa69

    goto :goto_a

    :cond_c
    const-string v0, "\u06d6\u06d7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v13

    mul-int/lit16 v15, v15, 0x139d

    const v17, -0x2a42c13b

    xor-int v15, v15, v17

    const v17, 0x5188ce90

    goto :goto_a

    :sswitch_11
    move/from16 v14, p1

    move/from16 v16, v0

    .line 628
    sget v0, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v0, :cond_d

    :goto_9
    const-string v0, "\u05a1\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x3b

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x6971

    const v17, 0x5e3bbd3

    xor-int v15, v15, v17

    const v17, -0x116a3368

    goto :goto_a

    :cond_d
    const-string v0, "\u05a8\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x6b41

    const v17, 0x40c42e96

    xor-int v15, v15, v17

    const v17, -0x5d31d8a2

    :goto_a
    xor-int v0, v0, v17

    move v14, v0

    :goto_b
    move/from16 v0, v16

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7d1cadad -> :sswitch_9
        -0x79ac8e24 -> :sswitch_10
        -0x77f4b5e0 -> :sswitch_7
        -0x6d020a6e -> :sswitch_5
        -0x674d92d3 -> :sswitch_2
        -0x654b9d55 -> :sswitch_9
        -0x60760004 -> :sswitch_8
        -0x5c1d86e0 -> :sswitch_6
        -0x546b6333 -> :sswitch_b
        -0x4b429ce7 -> :sswitch_e
        -0x4a50eb14 -> :sswitch_2
        -0x3f943485 -> :sswitch_f
        -0x3cdba331 -> :sswitch_10
        -0x21a79538 -> :sswitch_d
        -0x20a1d79f -> :sswitch_4
        -0x1ccaaa9d -> :sswitch_b
        -0x1420ab49 -> :sswitch_5
        -0x8276dae -> :sswitch_3
        -0x5f40eb0 -> :sswitch_f
        -0x3d3ef88 -> :sswitch_0
        0x13113b1 -> :sswitch_1
        0x6e6278a -> :sswitch_a
        0x15c67ad7 -> :sswitch_0
        0x1e9861f0 -> :sswitch_3
        0x2773294b -> :sswitch_11
        0x3754e178 -> :sswitch_11
        0x3a986677 -> :sswitch_e
        0x3afb40cb -> :sswitch_c
        0x3b0b53ca -> :sswitch_6
        0x3c5c231d -> :sswitch_8
        0x48dd6b43 -> :sswitch_4
        0x54612c35 -> :sswitch_c
        0x67c9aa58 -> :sswitch_d
        0x7918cabd -> :sswitch_7
        0x7acfe96e -> :sswitch_a
        0x7f9c2c99 -> :sswitch_1
    .end sparse-switch
.end method
