.class public final Ll/۠ۘۡ;
.super Ljava/lang/Object;
.source "F1FO"


# static fields
.field private static final ᩷ۗܺ:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x9

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۠ۘۡ;->᩷ۗܺ:[S

    return-void

    :array_0
    .array-data 2
        0x721s
        -0x4a67s
        -0x4a65s
        -0x4a74s
        -0x4a6fs
        -0x4a72s
        -0x4a6fs
        -0x4a74s
        -0x4a7fs
    .end array-data
.end method

.method public static ֫(Ll/ۗܺ᩷;ZZLjava/lang/Runnable;)V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, 0xabde1ad

    sget v5, Ll/֡۬;->۠֡᩶:I

    sget v6, Ll/֨᩺;->ۨ֨۬:I

    const-string v7, "\u1a74\u0730"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x73

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x18ad

    const v9, -0x159492ff

    xor-int/2addr v8, v9

    const v9, 0x1a9d49b3

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v5

    mul-int/lit16 v4, v4, 0x16d

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 483
    invoke-static {p3}, Ll/֨֫;->᩷۟۬(Ljava/lang/Object;)V

    sget-object v7, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    goto/16 :goto_1

    .line 117
    :sswitch_0
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    sget v7, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v7, :cond_c

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    sget-boolean v7, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v7, :cond_a

    goto/16 :goto_5

    .line 265
    :sswitch_2
    sget v7, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-gez v7, :cond_e

    goto/16 :goto_3

    .line 378
    :sswitch_3
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    goto/16 :goto_3

    .line 223
    :sswitch_4
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    return-void

    .line 482
    :sswitch_5
    new-instance v7, Ll/֡֡ۡ;

    const/4 v8, 0x0

    .line 31
    invoke-direct {v7, p0, v8}, Ll/֡֡ۡ;-><init>(Ll/ۗܺ᩷;Ll/ۜۘۡ;)V

    if-eqz p3, :cond_0

    const-string v7, "\u06eb\u06e8"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x2401

    const v9, 0x494cdb22    # 839090.1f

    xor-int/2addr v8, v9

    const v9, 0x3e9530a

    goto :goto_0

    .line 478
    :sswitch_6
    invoke-static {p3}, Ll/֨֫;->᩷۟۬(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    .line 481
    :sswitch_8
    invoke-static {}, Ll/֨ۤ;->᩺۬ۙ()Z

    move-result v7

    if-nez v7, :cond_1

    const-string v7, "\u0736\u06e4"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x3b

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x61af

    const v9, 0x72fda7f2

    xor-int/2addr v8, v9

    const v9, -0x3dad4792

    goto :goto_0

    .line 485
    :sswitch_9
    new-instance v0, Ll/ۧᩴۡ;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ۧᩴۡ;-><init>(Ll/ۗܺ᩷;ZZLjava/lang/Runnable;)V

    return-void

    :sswitch_a
    if-eqz p3, :cond_0

    const-string v7, "\u06ec\u06dc"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x59

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x7883

    const v9, -0x757b515e

    xor-int/2addr v8, v9

    const v9, 0x79137510

    goto/16 :goto_0

    :cond_0
    :goto_1
    const-string v7, "\u06e1\u06eb"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x15

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x74df

    const v9, -0x7d01a3da

    xor-int/2addr v8, v9

    const v9, 0x54d76fd1

    goto/16 :goto_0

    :sswitch_b
    if-eqz p2, :cond_1

    const-string v7, "\u06d6\u06d7"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0x6b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x653b

    const v9, -0x66594a7d

    xor-int/2addr v8, v9

    const v9, 0x621553f3

    goto/16 :goto_0

    :cond_1
    const-string v7, "\u06e1\u0736"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x79c7

    const v9, -0x15b27d17    # -6.2112E25f

    xor-int/2addr v8, v9

    const v9, -0x61f6897b

    goto/16 :goto_0

    .line 5
    :sswitch_c
    invoke-static {p0, v0}, Ll/֡ᩴ;->ۚ֫۟(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 459
    invoke-static {}, Ll/ۧᩴۡ;->֫()Ll/ۡۤۡ;

    move-result-object v7

    .line 477
    invoke-static {v7}, Ll/ۘܿ;->ܳ۫۟(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const-string v7, "\u06e2\u1a77"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x2235

    const v9, -0x3486471d    # -1.6365795E7f

    xor-int/2addr v8, v9

    const v9, -0x12f2c0ba

    goto/16 :goto_0

    :cond_2
    const-string v7, "\u06d7\u06e1"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x4d4f

    const v9, 0x4996adf5

    xor-int/2addr v8, v9

    const v9, -0x3d06a485

    goto/16 :goto_0

    .line 0
    :sswitch_d
    sget-object v0, Ll/۠ۘۡ;->᩷ۗܺ:[S

    const/4 v7, 0x1

    const/16 v8, 0x8

    invoke-static {v0, v7, v8, v3}, Ll/֡᩶;->᩶ۚۛ([SIII)Ljava/lang/String;

    move-result-object v0

    sget-boolean v7, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v7, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v7, "\u06e2\u06e7"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x1861

    const v9, 0x6809400a

    xor-int/2addr v8, v9

    const v9, -0x5c29a12c

    goto/16 :goto_0

    :sswitch_e
    const/16 v3, 0x6084

    goto :goto_2

    :sswitch_f
    const v3, 0xb5f8

    :goto_2
    const-string v7, "\u1a7a\u06e1"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x4d

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x32d7

    const v9, 0x206374d2

    xor-int/2addr v8, v9

    const v9, -0xa7cf7e7

    goto/16 :goto_0

    :sswitch_10
    mul-int/lit16 v7, v1, 0x41d6

    sub-int v7, v2, v7

    if-gez v7, :cond_4

    const-string v7, "\u1a7b\u0730"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x21

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x2085

    const v9, -0x7899995b

    xor-int/2addr v8, v9

    const v9, 0x2dbe6c33

    goto/16 :goto_0

    :cond_4
    const-string v7, "\u06eb\u1a78"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x71

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x799b

    const v9, 0x32b844bd

    xor-int/2addr v8, v9

    const v9, -0x4ac3b503

    goto/16 :goto_0

    :sswitch_11
    mul-int v2, v1, v1

    const v7, 0x43b97b9

    add-int/2addr v2, v7

    .line 2
    sget v7, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v7, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v7, "\u1a79\u073a"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6a45

    const v9, 0x4cb57763    # 9.5140632E7f

    xor-int/2addr v8, v9

    const v9, -0x7a83a77e

    goto/16 :goto_0

    :sswitch_12
    sget-object v1, Ll/۠ۘۡ;->᩷ۗܺ:[S

    const/4 v7, 0x0

    aget-short v1, v1, v7

    sget v7, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v7, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v7, "\u06dc\u073f"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x613f

    const v9, -0x1b47d3dd

    xor-int/2addr v8, v9

    const v9, 0x265ea3be

    goto/16 :goto_0

    .line 330
    :sswitch_13
    sget v7, Ll/᩹;->ۤܿܳ:I

    if-eqz v7, :cond_7

    goto :goto_4

    :cond_7
    const-string v7, "\u06e7\u06e1"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x31

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6905

    const v9, 0x511fae54

    xor-int/2addr v8, v9

    const v9, -0x5d521b6b

    goto/16 :goto_0

    :sswitch_14
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v7

    if-nez v7, :cond_8

    goto :goto_3

    :cond_8
    const-string v7, "\u06d8\u06df"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x7f0b

    const v9, 0x1e54c0f5

    xor-int/2addr v8, v9

    const v9, -0x5fd3036

    goto/16 :goto_0

    .line 17
    :sswitch_15
    sget-boolean v7, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v7, :cond_9

    :goto_3
    const-string v7, "\u073a\u06dc"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x3d

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x1271

    const v9, -0x5b583697

    xor-int/2addr v8, v9

    const v9, 0x929a68d

    goto/16 :goto_0

    :cond_9
    const-string v7, "\u0730\u06e8"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x77d9

    const v9, 0x49aa04b

    xor-int/2addr v8, v9

    const v9, 0xa1956b0

    goto/16 :goto_0

    :sswitch_16
    sget v7, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v7, :cond_b

    :cond_a
    :goto_4
    const-string v7, "\u06da\u06e7"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x5ed3

    const v9, 0x150ddbcd

    xor-int/2addr v8, v9

    const v9, -0xb100578

    goto/16 :goto_0

    :cond_b
    const-string v7, "\u06d9\u06ec"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x4999

    const v9, -0x5705c9fc

    xor-int/2addr v8, v9

    const v9, -0x15d26354

    goto/16 :goto_0

    .line 340
    :sswitch_17
    sget v7, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v7, :cond_d

    :cond_c
    const-string v7, "\u1a79\u05ab"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3915

    const v9, -0x29e3a327

    xor-int/2addr v8, v9

    const v9, -0x3cab370b

    goto/16 :goto_0

    :cond_d
    const-string v7, "\u06d9\u1a79"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x8af

    const v9, 0x31017024

    xor-int/2addr v8, v9

    const v9, 0xe20c3f1

    goto/16 :goto_0

    .line 216
    :sswitch_18
    sget v7, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v7, :cond_f

    :cond_e
    :goto_5
    const-string v7, "\u1a75\u06da"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x6f4d

    const v9, -0x29f076b1

    xor-int/2addr v8, v9

    const v9, -0x432bc2c0

    goto/16 :goto_0

    :cond_f
    const-string v7, "\u05a8\u06e1"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x6679

    const v9, 0x3914f0fd

    xor-int/2addr v8, v9

    const v9, 0x7b7d6e76

    goto/16 :goto_0

    .line 28
    :sswitch_19
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v7

    if-gtz v7, :cond_10

    :goto_6
    const-string v7, "\u06eb\u06e2"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x7d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x14f9

    const v9, -0x6cbb7143

    xor-int/2addr v8, v9

    const v9, 0x236517f9

    goto/16 :goto_0

    :cond_10
    const-string v7, "\u06da\u06e4"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x2cfb

    const v9, -0x3321cae8

    xor-int/2addr v8, v9

    const v9, -0x23a70765

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f62d6cd -> :sswitch_1
        -0x791d160f -> :sswitch_9
        -0x69c498b2 -> :sswitch_d
        -0x6694dcb9 -> :sswitch_1
        -0x6204d9d8 -> :sswitch_10
        -0x5fed0074 -> :sswitch_7
        -0x5ea55a0c -> :sswitch_f
        -0x5c779dcb -> :sswitch_4
        -0x5bc3babc -> :sswitch_3
        -0x5138f4f9 -> :sswitch_a
        -0x4c3828ac -> :sswitch_b
        -0x4a52702f -> :sswitch_f
        -0x48da05af -> :sswitch_2
        -0x4646bbbd -> :sswitch_7
        -0x463730a7 -> :sswitch_13
        -0x3b4c9f30 -> :sswitch_18
        -0x394a4709 -> :sswitch_10
        -0x3904a999 -> :sswitch_14
        -0x377b0bc4 -> :sswitch_8
        -0x3290a516 -> :sswitch_13
        -0x3045bf3b -> :sswitch_8
        -0x2ea4f091 -> :sswitch_4
        -0x25ed3d70 -> :sswitch_b
        -0x224db88b -> :sswitch_11
        -0x1fe3a6fb -> :sswitch_c
        -0x1d93c479 -> :sswitch_6
        -0x1c656e45 -> :sswitch_3
        -0x1c51c9a8 -> :sswitch_5
        -0xe83e56c -> :sswitch_2
        -0xd39fb62 -> :sswitch_15
        -0x916b3f9 -> :sswitch_0
        -0x2616a86 -> :sswitch_12
        0x33afef8 -> :sswitch_9
        0x12f2f009 -> :sswitch_14
        0x173fd88c -> :sswitch_6
        0x1856885f -> :sswitch_e
        0x192a8a6d -> :sswitch_18
        0x2a7a83a4 -> :sswitch_a
        0x2b790a9a -> :sswitch_16
        0x2e1b8bdf -> :sswitch_c
        0x36c9125c -> :sswitch_0
        0x38b703db -> :sswitch_17
        0x38fad522 -> :sswitch_e
        0x3eb53b5c -> :sswitch_11
        0x4ae4646a -> :sswitch_17
        0x4deaf6a5 -> :sswitch_16
        0x56e80950 -> :sswitch_15
        0x5b53a99b -> :sswitch_12
        0x67db1ba6 -> :sswitch_d
        0x6932a2cb -> :sswitch_19
        0x6e68fe0f -> :sswitch_19
        0x7c1d98fb -> :sswitch_5
    .end sparse-switch
.end method
