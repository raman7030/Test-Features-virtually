.class public abstract Ll/ܶ᩻᩷;
.super Ljava/lang/Object;
.source "K3YT"

# interfaces
.implements Ll/֨᩻᩷;


# virtual methods
.method public final ֫(Lbin/mt/plugin/api/PluginContext;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x2aaf4601

    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    sget v4, Ll/ۘۨ;->۫᩸۠:I

    const-string v5, "\u06e4\u06d7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x3b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5085

    const v7, -0x22b4498f

    xor-int/2addr v6, v7

    const v7, 0x2fa2a6f9

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x586d

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 302
    sget v5, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v5, :cond_8

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    sget v5, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v5, :cond_9

    goto/16 :goto_4

    :sswitch_1
    sget v5, Ll/֡᩶;->ܳܶ۠:I

    if-lez v5, :cond_b

    goto/16 :goto_2

    .line 68
    :sswitch_2
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v5

    if-nez v5, :cond_3

    goto/16 :goto_3

    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    goto/16 :goto_3

    .line 42
    :sswitch_4
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    :goto_1
    const/4 p1, 0x0

    return-object p1

    .line 368
    :sswitch_5
    invoke-interface {p1, v1}, Lbin/mt/plugin/api/PluginContext;->log(Ljava/lang/Throwable;)V

    goto :goto_1

    :sswitch_6
    return-object v0

    .line 366
    :sswitch_7
    :try_start_0
    invoke-virtual {p0, p2}, Ll/ܶ᩻᩷;->֫(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v5, "\u1a79\u1a76"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x73

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x35d9

    const v7, -0x433de8a2

    xor-int/2addr v6, v7

    const v7, -0x65f7e5bb

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v5, "\u06e8\u05a8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2b19

    const v7, -0xe42e664

    xor-int/2addr v6, v7

    const v7, -0x16759ed8

    goto :goto_0

    :sswitch_8
    sget v5, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v5, :cond_0

    const-string v5, "\u05ab\u06d9"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5697

    const v7, -0x356672e9    # -5031563.5f

    xor-int/2addr v6, v7

    const v7, -0x353dadf1    # -6367495.5f

    goto :goto_0

    :cond_0
    const-string v5, "\u06e4\u1a77"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x1f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4ff3

    const v7, -0x35de3557

    xor-int/2addr v6, v7

    const v7, 0x7e46f727

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v5

    if-nez v5, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v5, "\u1a75\u06da"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x23

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7ea1

    const v7, 0x5a5b4721

    xor-int/2addr v6, v7

    const v7, -0x4ba2d718

    goto/16 :goto_0

    .line 291
    :sswitch_a
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v5

    if-gtz v5, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v5, "\u06db\u06e8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x55

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x459f

    const v7, 0x5df4674e

    xor-int/2addr v6, v7

    const v7, 0x5e2f817f

    goto/16 :goto_0

    .line 68
    :sswitch_b
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v5

    if-nez v5, :cond_4

    :cond_3
    :goto_2
    const-string v5, "\u06e0\u1a77"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x71

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2487

    const v7, -0x5205bae5

    xor-int/2addr v6, v7

    const v7, 0x1b441f05

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u06e8\u06e8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0xd

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6061

    const v7, 0x70ebe554

    xor-int/2addr v6, v7

    const v7, -0x318162c2

    goto/16 :goto_0

    .line 118
    :sswitch_c
    sget v5, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v5, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v5, "\u06d6\u06db"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3905

    const v7, 0x52ac49dc

    xor-int/2addr v6, v7

    const v7, 0x63fbe0d8

    goto/16 :goto_0

    .line 343
    :sswitch_d
    sget v5, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v5, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v5, "\u06e4\u06d9"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3975

    const v7, -0x69f45137

    xor-int/2addr v6, v7

    const v7, -0x693db91c

    goto/16 :goto_0

    :sswitch_e
    sget v5, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v5, :cond_7

    goto :goto_4

    :cond_7
    const-string v5, "\u06ec\u06df"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x7

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x160f

    const v7, -0xb7fdfbe

    xor-int/2addr v6, v7

    const v7, -0x3ffa4d43

    goto/16 :goto_0

    :goto_3
    const-string v5, "\u1a77\u0730"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x664b

    const v7, -0xa0697dd

    xor-int/2addr v6, v7

    const v7, -0x20b16b48

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06d7\u06da"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x1d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x248f

    const v7, -0x3a735aab

    xor-int/2addr v6, v7

    const v7, 0x36775b7a

    goto/16 :goto_0

    .line 278
    :sswitch_f
    sget v5, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v5, :cond_a

    :cond_9
    const-string v5, "\u0733\u06eb"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5765

    const v7, 0x4f798555

    xor-int/2addr v6, v7

    const v7, 0xa725340

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u073a\u06d8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x1b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6f1d

    const v7, -0x1f036b9c

    xor-int/2addr v6, v7

    const v7, 0x736e9419

    goto/16 :goto_0

    .line 296
    :sswitch_10
    sget v5, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v5, :cond_c

    :cond_b
    :goto_4
    const-string v5, "\u073f\u06e0"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x1f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1cd5

    const v7, -0x2d06a6b2

    xor-int/2addr v6, v7

    const v7, -0x6844346d

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06d7\u1a74"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x19dd

    const v7, -0x5133807c

    xor-int/2addr v6, v7

    const v7, 0x28dc00e3

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7bce8349 -> :sswitch_1
        -0x7ae7e3f8 -> :sswitch_b
        -0x4f0144f6 -> :sswitch_d
        -0x4e05517b -> :sswitch_10
        -0x4269645a -> :sswitch_4
        -0x3923cd72 -> :sswitch_a
        -0x327c5d49 -> :sswitch_f
        -0x31c03775 -> :sswitch_f
        -0x265080be -> :sswitch_2
        -0x24fed1c8 -> :sswitch_8
        -0x136e6cb3 -> :sswitch_1
        -0xe167017 -> :sswitch_3
        -0x5881111 -> :sswitch_7
        -0x1444c88 -> :sswitch_c
        0x57d4f98 -> :sswitch_5
        0x864fea9 -> :sswitch_9
        0xfa96179 -> :sswitch_8
        0x11a4fca4 -> :sswitch_e
        0x20e9937b -> :sswitch_0
        0x263511f1 -> :sswitch_0
        0x2cc734dd -> :sswitch_6
        0x339ac204 -> :sswitch_7
        0x33ba5a51 -> :sswitch_4
        0x40c2fec3 -> :sswitch_e
        0x45385556 -> :sswitch_d
        0x4d050656 -> :sswitch_10
        0x5043b3db -> :sswitch_6
        0x525726e7 -> :sswitch_5
        0x53e64fb6 -> :sswitch_3
        0x5ea354e0 -> :sswitch_2
        0x6617bd01 -> :sswitch_9
        0x6c44d05f -> :sswitch_a
        0x7a356fe1 -> :sswitch_c
        0x7f3c85f4 -> :sswitch_b
    .end sparse-switch
.end method

.method public abstract ֫(Ljava/lang/String;)Ljava/io/InputStream;
.end method
