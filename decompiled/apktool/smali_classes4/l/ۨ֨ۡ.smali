.class public final synthetic Ll/ۨ֨ۡ;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ll/ۨ֨ۡ;->᩸:J

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 13

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, -0x7ac55f1a

    sget v8, Ll/ۘۨ;->۫᩸۠:I

    sget v9, Ll/֫᩵;->ܶ᩻᩷:I

    const-string v10, "\u06dc\u06da"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x51

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x65df

    const v12, -0x531fba7a

    xor-int/2addr v11, v12

    const v12, 0x3f5fb6b2

    :goto_0
    xor-int/2addr v10, v12

    xor-int/2addr v7, v9

    mul-int/lit16 v7, v7, -0x4e05

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    .line 49
    sget v10, Ll/֡֡;->֫ۤܳ:I

    if-ltz v10, :cond_b

    goto/16 :goto_4

    .line 114
    :sswitch_0
    sget v10, Ll/ۘۨ;->۫᩸۠:I

    if-gez v10, :cond_a

    goto/16 :goto_3

    .line 112
    :sswitch_1
    sget v10, Ll/ۗۗ;->ۨ۬ۖ:I

    if-gez v10, :cond_8

    goto :goto_1

    :sswitch_2
    sget v10, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v10, :cond_6

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    :goto_1
    const-string v10, "\u1a76\u073d"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x31

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x504b

    const v12, 0x10beeeaf

    xor-int/2addr v11, v12

    const v12, -0x7c9548c4

    goto :goto_0

    .line 94
    :sswitch_4
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    return-void

    :sswitch_5
    xor-int p1, v5, v6

    .line 124
    iput p1, v0, Ll/ܺ۠ۡ;->ܿ:I

    return-void

    :sswitch_6
    const v6, 0x7266748

    .line 116
    sget v10, Ll/֨۟;->᩹֫᩷:I

    if-eqz v10, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v10, "\u073d\u06e2"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x2bb

    const v12, 0x571bcfbf

    xor-int/2addr v11, v12

    const v12, 0x3bb5bfc3

    goto :goto_0

    .line 124
    :sswitch_7
    div-long v10, v1, v3

    long-to-int v5, v10

    .line 83
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v10

    if-gtz v10, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v10, "\u073a\u1a75"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x33

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x47fb

    const v12, 0x4f659d98

    xor-int/2addr v11, v12

    const v12, -0x1f1523ce

    goto/16 :goto_0

    .line 123
    :sswitch_8
    iput-wide v1, v0, Ll/ܺ۠ۡ;->ᩴ:J

    const-wide/16 v3, 0x3e8

    .line 55
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v10

    if-nez v10, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v10, "\u06e4\u0733"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x35

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x3457

    const v12, 0x17358ea

    xor-int/2addr v11, v12

    const v12, -0x1419b3f6

    goto/16 :goto_0

    .line 123
    :sswitch_9
    iget-wide v1, p0, Ll/ۨ֨ۡ;->᩸:J

    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v10

    if-eqz v10, :cond_3

    goto :goto_2

    :cond_3
    const-string v10, "\u06d7\u1a73"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x5d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6d07

    const v12, -0x7002365b

    xor-int/2addr v11, v12

    const v12, 0x48b586b0    # 371765.5f

    goto/16 :goto_0

    .line 2
    :sswitch_a
    move-object v0, p1

    check-cast v0, Ll/ܺ۠ۡ;

    .line 117
    sget v10, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v10, :cond_4

    goto :goto_3

    :cond_4
    const-string v10, "\u06e2\u06df"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x3

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x6d55

    const v12, 0x5ad69876

    xor-int/2addr v11, v12

    const v12, -0x1e8caef7

    goto/16 :goto_0

    .line 53
    :sswitch_b
    sget v10, Ll/᩹;->ۤܿܳ:I

    if-eqz v10, :cond_5

    goto :goto_3

    :cond_5
    const-string v10, "\u06d6\u1a79"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x3f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x5e7b

    const v12, 0x7c55ed08

    xor-int/2addr v11, v12

    const v12, -0x67b73016

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v10, Ll/֨۫;->۬᩷᩶:Z

    if-nez v10, :cond_7

    :cond_6
    :goto_2
    const-string v10, "\u06e2\u06d8"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x25b1

    const v12, 0x564abdd5

    xor-int/2addr v11, v12

    const v12, 0x1c87c6b8

    goto/16 :goto_0

    :cond_7
    const-string v10, "\u06eb\u0736"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x79

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x14a3

    const v12, -0x1bc29123

    xor-int/2addr v11, v12

    const v12, 0x7cdf8def

    goto/16 :goto_0

    .line 39
    :sswitch_d
    sget v10, Ll/᩹;->ۤܿܳ:I

    if-eqz v10, :cond_9

    :cond_8
    :goto_3
    const-string v10, "\u06db\u06e7"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x5a79

    const v12, -0x2031892f

    xor-int/2addr v11, v12

    const v12, 0x4493e4fe

    goto/16 :goto_0

    :cond_9
    const-string v10, "\u06e8\u06e1"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x636f

    const v12, 0x111593b7

    xor-int/2addr v11, v12

    const v12, 0x887fd5c

    goto/16 :goto_0

    :cond_a
    :goto_4
    const-string v10, "\u05a8\u1a74"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x74f3

    const v12, 0x308e033a

    xor-int/2addr v11, v12

    const v12, 0x1f4639c6

    goto/16 :goto_0

    :cond_b
    const-string v10, "\u06db\u05a1"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x28f

    const v12, 0x6bf02ff

    xor-int/2addr v11, v12

    const v12, 0xc2d1589

    goto/16 :goto_0

    :sswitch_e
    sget v10, Ll/֨۟;->᩹֫᩷:I

    if-eqz v10, :cond_c

    :goto_5
    const-string v10, "\u1a76\u0736"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x29

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x1e01

    const v12, 0x604d284d

    xor-int/2addr v11, v12

    const v12, -0x1e31df62

    goto/16 :goto_0

    :cond_c
    const-string v10, "\u06e0\u06e4"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x799b

    const v12, -0x56fc7a75

    xor-int/2addr v11, v12

    const v12, 0x6cd3a31a

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x77a616e5 -> :sswitch_6
        -0x75a0a6f9 -> :sswitch_b
        -0x724c41e0 -> :sswitch_9
        -0x622e229b -> :sswitch_5
        -0x5d8fe679 -> :sswitch_2
        -0x589d5380 -> :sswitch_2
        -0x4a69c66e -> :sswitch_a
        -0x32c62f75 -> :sswitch_e
        -0x2ce4f2d2 -> :sswitch_3
        -0x2896ceda -> :sswitch_0
        -0x27324c28 -> :sswitch_c
        -0x23fceefd -> :sswitch_a
        -0x207ed2aa -> :sswitch_8
        -0x1d7255cd -> :sswitch_9
        -0x1aa572b2 -> :sswitch_7
        -0x1511c400 -> :sswitch_4
        -0x119bf850 -> :sswitch_c
        -0x59bc365 -> :sswitch_3
        -0xe3f4e5 -> :sswitch_0
        0x76c6e0b -> :sswitch_e
        0x13d2be21 -> :sswitch_1
        0x1fe4739c -> :sswitch_6
        0x49ec7f89 -> :sswitch_1
        0x50fd4ccd -> :sswitch_b
        0x57d6bd83 -> :sswitch_d
        0x57f5b76b -> :sswitch_8
        0x5a87402c -> :sswitch_d
        0x68423add -> :sswitch_7
        0x6cd3a652 -> :sswitch_4
        0x6d1fd705 -> :sswitch_5
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
