.class public final synthetic Ll/ܽܺܳ;
.super Ljava/lang/Object;
.source "05ZQ"


# static fields
.field public static final synthetic ֫:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0xf9586ab

    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    sget v4, Ll/ۖ۫;->ۖ֫ܿ:I

    const-string v5, "\u06e7\u1a79"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5dcf

    const v7, -0x766e1b57

    xor-int/2addr v6, v7

    const v7, 0xb432db6

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x42ed

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :sswitch_0
    sget v5, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v5, :cond_b

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v5

    if-gtz v5, :cond_4

    goto :goto_1

    .line 472
    :sswitch_2
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v5

    if-eqz v5, :cond_7

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    sget-boolean v5, Ll/ۖۘ;->ۚܶۖ:Z

    if-nez v5, :cond_10

    goto :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v5, "\u1a74\u1a74"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x17

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x436f

    const v7, -0x6db91631

    xor-int/2addr v6, v7

    const v7, -0x56e19f48

    goto :goto_0

    :sswitch_5
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v5

    if-lez v5, :cond_1

    goto :goto_2

    :cond_1
    const-string v5, "\u06e4\u1a7b"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x73ab

    const v7, 0x7e1fdd7

    xor-int/2addr v6, v7

    const v7, -0x749916ce

    goto :goto_0

    :sswitch_6
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    sget v5, Ll/ۛ;->᩺᩻֫:I

    if-ltz v5, :cond_2

    goto/16 :goto_5

    :cond_2
    :goto_2
    const-string v5, "\u1a75\u0733"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4a0b

    const v7, 0x2103c99b

    xor-int/2addr v6, v7

    const v7, -0x642ea756

    goto/16 :goto_0

    .line 476
    :sswitch_7
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    sget v5, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v5, :cond_d

    goto/16 :goto_4

    .line 475
    :sswitch_8
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    goto/16 :goto_4

    :sswitch_9
    return-void

    .line 472
    :sswitch_a
    :try_start_0
    sget-object v5, Ll/ܽܺܳ;->֫:[I

    sget-object v6, Ll/ۘܺܳ;->ۗ:Ll/ۘܺܳ;

    invoke-static {v6}, Ll/֫֫;->ۨ۫ܿ(Ljava/lang/Object;)I

    move-result v6

    const/4 v7, 0x4

    aput v7, v5, v6
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v5, "\u073a\u06dc"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x5f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x34cf

    const v7, -0x308c950c

    xor-int/2addr v6, v7

    const v7, -0x4b19002d

    goto/16 :goto_0

    :sswitch_b
    :try_start_1
    sget-object v5, Ll/ܽܺܳ;->֫:[I

    sget-object v6, Ll/ۘܺܳ;->۬:Ll/ۘܺܳ;

    invoke-static {v6}, Ll/֫֫;->ۨ۫ܿ(Ljava/lang/Object;)I

    move-result v6

    const/4 v7, 0x3

    aput v7, v5, v6
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    const-string v5, "\u06d9\u06d8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x65

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1fa1

    const v7, -0xf979c7

    xor-int/2addr v6, v7

    const v7, -0x4a5518c1

    goto/16 :goto_0

    :sswitch_c
    :try_start_2
    sget-object v5, Ll/ܽܺܳ;->֫:[I

    sget-object v6, Ll/ۘܺܳ;->᩹:Ll/ۘܺܳ;

    invoke-static {v6}, Ll/ۘۗ;->۟᩻᩵(Ljava/lang/Object;)I

    move-result v6

    const/4 v7, 0x2

    aput v7, v5, v6
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    const-string v5, "\u06e0\u05a8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x37b9

    const v7, 0x29473638

    xor-int/2addr v6, v7

    const v7, -0x2105192b

    goto/16 :goto_0

    :sswitch_d
    :try_start_3
    sget-object v5, Ll/ۘܺܳ;->ۤ:Ll/ۘܺܳ;

    invoke-static {v5}, Ll/֫֫;->ۨ۫ܿ(Ljava/lang/Object;)I

    move-result v5

    const/4 v6, 0x1

    aput v6, v1, v5
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    const-string v5, "\u1a74\u06d9"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x2f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3c6d

    const v7, 0x67607392

    xor-int/2addr v6, v7

    const v7, -0x5d4857df

    goto/16 :goto_0

    :sswitch_e
    new-array v1, v0, [I

    sput-object v1, Ll/ܽܺܳ;->֫:[I

    const-string v5, "\u1a77\u06e8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xd47

    const v7, 0x166d320b

    xor-int/2addr v6, v7

    const v7, 0x517c69dc

    goto/16 :goto_0

    .line 475
    :sswitch_f
    sget v5, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v5, :cond_3

    goto/16 :goto_6

    :cond_3
    const-string v5, "\u06e4\u0736"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6a77

    const v7, -0x20474264

    xor-int/2addr v6, v7

    const v7, 0x19c0910

    goto/16 :goto_0

    .line 472
    :sswitch_10
    sget v5, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v5, :cond_5

    :cond_4
    const-string v5, "\u06d7\u06d7"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4b73

    const v7, -0x2ca64db

    xor-int/2addr v6, v7

    const v7, -0xd45ccc8

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u0733\u05a8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6807

    const v7, 0x52ddcf5e

    xor-int/2addr v6, v7

    const v7, -0x38842e0e

    goto/16 :goto_0

    .line 473
    :sswitch_11
    sget v5, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v5, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v5, "\u05ab\u06d8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xbd1

    const v7, 0x5b0b5ed6

    xor-int/2addr v6, v7

    const v7, -0x2e5911a5

    goto/16 :goto_0

    :sswitch_12
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v5

    if-eqz v5, :cond_8

    :cond_7
    :goto_3
    const-string v5, "\u0733\u1a7b"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x35

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x654f

    const v7, -0x71705d4e

    xor-int/2addr v6, v7

    const v7, -0x4f6d21c6

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06da\u06d6"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x4b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1771

    const v7, -0x61b71655

    xor-int/2addr v6, v7

    const v7, -0x3112c37a

    goto/16 :goto_0

    .line 474
    :sswitch_13
    sget-boolean v5, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v5, :cond_9

    :goto_4
    const-string v5, "\u06e0\u073f"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x4d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x201b

    const v7, 0x14d8f684

    xor-int/2addr v6, v7

    const v7, -0x1143cbc3

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u05a8\u1a78"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xfaf

    const v7, 0x239f42c2

    xor-int/2addr v6, v7

    const v7, -0x4cb49086

    goto/16 :goto_0

    .line 476
    :sswitch_14
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v5

    if-eqz v5, :cond_a

    goto/16 :goto_7

    :cond_a
    const-string v5, "\u1a7a\u1a73"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x7f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1071

    const v7, 0x150f2502

    xor-int/2addr v6, v7

    const v7, 0x76f22f3b

    goto/16 :goto_0

    :sswitch_15
    sget v5, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v5, :cond_c

    :cond_b
    const-string v5, "\u1a76\u05ab"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x143d

    const v7, 0x4799e631

    xor-int/2addr v6, v7

    const v7, 0x1f08321

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u1a73\u1a78"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x23

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x939

    const v7, 0x658a3671

    xor-int/2addr v6, v7

    const v7, 0x70e6dba4

    goto/16 :goto_0

    .line 474
    :sswitch_16
    sget v5, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v5, :cond_e

    :cond_d
    :goto_5
    const-string v5, "\u06df\u0730"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x39

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x751f

    const v7, -0x61e1f106

    xor-int/2addr v6, v7

    const v7, -0x5184cff9

    goto/16 :goto_0

    :cond_e
    const-string v5, "\u06e2\u06d7"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x38ff

    const v7, -0x131609ac

    xor-int/2addr v6, v7

    const v7, 0x5721d315

    goto/16 :goto_0

    :sswitch_17
    sget-boolean v5, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v5, :cond_f

    :goto_6
    const-string v5, "\u1a79\u06e8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x7f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1559

    const v7, 0x7ca0a755

    xor-int/2addr v6, v7

    const v7, 0x15ea8040

    goto/16 :goto_0

    :cond_f
    const-string v5, "\u06e0\u0730"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x15

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x37c7

    const v7, 0x262f3a63

    xor-int/2addr v6, v7

    const v7, -0x15886742

    goto/16 :goto_0

    .line 472
    :sswitch_18
    invoke-static {}, Ll/ۘܺܳ;->values()[Ll/ۘܺܳ;

    move-result-object v0

    array-length v0, v0

    sget v5, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v5, :cond_11

    :cond_10
    :goto_7
    const-string v5, "\u06df\u1a78"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x5b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4b7

    const v7, 0x56dd55dd

    xor-int/2addr v6, v7

    const v7, 0x56f894c5

    goto/16 :goto_0

    :cond_11
    const-string v5, "\u1a75\u1a76"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1aef

    const v7, -0x63434808

    xor-int/2addr v6, v7

    const v7, -0x79d00e6a

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7769b35c -> :sswitch_4
        -0x75c7e26a -> :sswitch_e
        -0x744cc187 -> :sswitch_0
        -0x6fef9a02 -> :sswitch_1
        -0x6d517799 -> :sswitch_11
        -0x68fc7e59 -> :sswitch_9
        -0x655ffd12 -> :sswitch_18
        -0x61fa3b16 -> :sswitch_16
        -0x5bcbbb02 -> :sswitch_e
        -0x57022de3 -> :sswitch_13
        -0x445942f4 -> :sswitch_a
        -0x3f637259 -> :sswitch_d
        -0x3e50288d -> :sswitch_9
        -0x3a9799f4 -> :sswitch_a
        -0x365d46ce -> :sswitch_12
        -0x2e68296b -> :sswitch_15
        -0x29ec793f -> :sswitch_5
        -0x289547b6 -> :sswitch_13
        -0x26ce9bf7 -> :sswitch_14
        -0x25046db4 -> :sswitch_5
        -0x237a388c -> :sswitch_15
        -0x170c00f5 -> :sswitch_b
        -0xa5e87c6 -> :sswitch_4
        0x162afe5 -> :sswitch_7
        0x16f3f56 -> :sswitch_c
        0x27ca52a -> :sswitch_17
        0x94ffb00 -> :sswitch_f
        0xa31bcde -> :sswitch_7
        0xf77b67b -> :sswitch_16
        0x17cf601d -> :sswitch_17
        0x1a85c60f -> :sswitch_6
        0x27fc93fe -> :sswitch_11
        0x2a5384c0 -> :sswitch_3
        0x2e3cd75d -> :sswitch_c
        0x38607a05 -> :sswitch_6
        0x38ef6efe -> :sswitch_12
        0x404587fc -> :sswitch_10
        0x426870d0 -> :sswitch_1
        0x46656e64 -> :sswitch_8
        0x4c22c8f3 -> :sswitch_18
        0x53551d53 -> :sswitch_2
        0x555ef449 -> :sswitch_b
        0x5698ea0d -> :sswitch_f
        0x67397a37 -> :sswitch_0
        0x69d71ba5 -> :sswitch_d
        0x6cc18eb7 -> :sswitch_10
        0x791e218c -> :sswitch_2
        0x79b26449 -> :sswitch_8
        0x7b6bd92c -> :sswitch_3
        0x7d821ed7 -> :sswitch_14
    .end sparse-switch
.end method
