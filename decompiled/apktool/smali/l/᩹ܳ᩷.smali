.class public final synthetic Ll/᩹ܳ᩷;
.super Ljava/lang/Object;
.source "GA31"

# interfaces
.implements Ljava/lang/Runnable;


# virtual methods
.method public final run()V
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, -0x44ea49ca

    sget v6, Ll/ۗ᩵;->֫۠۟:I

    sget v7, Ll/ۖ;->᩹۟ۘ:I

    const-string v8, "\u0733\u06e1"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x621

    const v10, -0xf56d10e

    xor-int/2addr v9, v10

    const v10, -0x1fd456ff

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v7

    mul-int/lit16 v5, v5, -0x7237

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    .line 78
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    const/4 v2, 0x1

    goto/16 :goto_6

    .line 32
    :sswitch_0
    sget-boolean v8, Ll/֫ܺ;->֡ܳ᩸:Z

    if-eqz v8, :cond_5

    goto/16 :goto_4

    .line 31
    :sswitch_1
    sget-boolean v8, Ll/ۖۘ;->ۚܶۖ:Z

    if-nez v8, :cond_a

    goto/16 :goto_5

    .line 48
    :sswitch_2
    sget-boolean v8, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v8, :cond_c

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    goto/16 :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    return-void

    .line 77
    :sswitch_5
    invoke-virtual {v4}, Ll/ܽܳ᩷;->᩵()I

    move-result v8

    invoke-virtual {v3}, Ll/ᩴ᩻᩷;->᩵()I

    move-result v9

    if-lt v8, v9, :cond_f

    goto :goto_1

    .line 83
    :sswitch_6
    sget-object v8, Ll/ۙܳ᩷;->֫:Ljava/util/List;

    invoke-static {v8}, Ll/ۙܳ᩷;->֫(Ljava/util/List;)V

    goto/16 :goto_7

    .line 76
    :sswitch_7
    invoke-static {v3}, Ll/ۘ᩶;->᩷ܰۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/۬ܿ᩷;->ܽ(Ljava/lang/String;)Ll/ܽܳ᩷;

    move-result-object v4

    if-eqz v4, :cond_0

    const-string v8, "\u1a74\u06e8"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x1edb

    const v10, -0x1b8fddf

    xor-int/2addr v9, v10

    const v10, -0x600cbe04

    goto :goto_0

    :cond_0
    :goto_1
    const-string v8, "\u0730\u06eb"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x55

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x33b

    const v10, -0x7cab3972

    xor-int/2addr v9, v10

    const v10, 0x5c02236c

    goto :goto_0

    :sswitch_8
    sget v8, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v8, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v8, "\u06e0\u073a"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x3f

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x56bf

    const v10, -0x577538b1

    xor-int/2addr v9, v10

    const v10, 0x49717822

    goto/16 :goto_0

    .line 70
    :sswitch_9
    sget v8, Ll/۟;->ۗۤۛ:I

    if-eqz v8, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v8, "\u1a7a\u06e2"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x57a3

    const v10, -0x4dd998be

    xor-int/2addr v9, v10

    const v10, 0x4609b26c

    goto/16 :goto_0

    :sswitch_a
    sget v8, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v8, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v8, "\u06d8\u073f"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x1789

    const v10, 0x74674958

    xor-int/2addr v9, v10

    const v10, 0x4ff5a89f

    goto/16 :goto_0

    .line 16
    :sswitch_b
    sget v8, Ll/ۛ;->᩺᩻֫:I

    if-ltz v8, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v8, "\u06e7\u1a7b"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x75

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x293d

    const v10, 0x2f05b6b1

    xor-int/2addr v9, v10

    const v10, 0x2fb34778

    goto/16 :goto_0

    .line 34
    :sswitch_c
    sget-boolean v8, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v8, :cond_6

    :cond_5
    const-string v8, "\u06d8\u05a8"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x1087

    const v10, -0x34d8a262    # -1.0968478E7f

    xor-int/2addr v9, v10

    const v10, 0x3507098e

    goto/16 :goto_0

    :cond_6
    const-string v8, "\u06eb\u06df"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x7d5b

    const v10, -0x4c0397d2

    xor-int/2addr v9, v10

    const v10, -0x4b5eb8da

    goto/16 :goto_0

    .line 2
    :sswitch_d
    sget-boolean v8, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v8, :cond_7

    goto/16 :goto_5

    :cond_7
    const-string v8, "\u06e2\u06ec"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, 0x15

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x80f

    const v10, 0x49dde133

    xor-int/2addr v9, v10

    const v10, 0x5363d68f

    goto/16 :goto_0

    .line 25
    :sswitch_e
    sget v8, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v8, :cond_8

    :goto_2
    const-string v8, "\u06e4\u06d7"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x6b0d

    const v10, 0x2e1d701e

    xor-int/2addr v9, v10

    const v10, -0x36f83395

    goto/16 :goto_0

    :cond_8
    const-string v8, "\u1a7b\u05a8"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x372f

    const v10, -0xf0d9675

    xor-int/2addr v9, v10

    const v10, 0x27c21e4b

    goto/16 :goto_0

    :sswitch_f
    sget v8, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v8, :cond_9

    :goto_3
    const-string v8, "\u06da\u0733"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, 0x6b

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x6bb5

    const v10, 0x5c3956b1

    xor-int/2addr v9, v10

    const v10, -0x920f384

    goto/16 :goto_0

    :cond_9
    const-string v8, "\u06e4\u06ec"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x4b

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x5bb9

    const v10, -0x50151e5b

    xor-int/2addr v9, v10

    const v10, 0x1a898838

    goto/16 :goto_0

    .line 38
    :sswitch_10
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v8

    if-eqz v8, :cond_b

    :cond_a
    :goto_4
    const-string v8, "\u1a7a\u05a8"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x1d

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2f5

    const v10, -0x85996cd

    xor-int/2addr v9, v10

    const v10, -0x36fed41c    # -529086.25f

    goto/16 :goto_0

    :cond_b
    const-string v8, "\u06e8\u06df"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, 0xd

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x7d7f

    const v10, 0x661069cf

    xor-int/2addr v9, v10

    const v10, 0x38e4a256

    goto/16 :goto_0

    .line 75
    :sswitch_11
    invoke-static {v1}, Ll/ۖۘ;->ᩴۛۚ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴ᩻᩷;

    .line 5
    sget v8, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v8, :cond_d

    :cond_c
    :goto_5
    const-string v8, "\u06e1\u0733"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x4a83

    const v10, -0x10374007

    xor-int/2addr v9, v10

    const v10, -0x155ec7b6

    goto/16 :goto_0

    :cond_d
    const-string v8, "\u073a\u06ec"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x35

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x273b

    const v10, -0x622bf966

    xor-int/2addr v9, v10

    const v10, -0x4dc6867c

    goto/16 :goto_0

    :sswitch_12
    if-eqz v2, :cond_10

    const-string v8, "\u073a\u1a77"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x2bf9

    const v10, 0x14db5e0d

    xor-int/2addr v9, v10

    const v10, 0x1d17fac0

    goto/16 :goto_0

    :sswitch_13
    return-void

    .line 74
    :sswitch_14
    invoke-static {v1}, Ll/֫ۧ;->۫ܶܺ(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_e

    const-string v8, "\u05ab\u06d8"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, 0x3d

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x357

    const v10, 0x25624d5a

    xor-int/2addr v9, v10

    const v10, -0x7a17a3d3

    goto/16 :goto_0

    :cond_e
    const-string v8, "\u06d8\u05a1"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x6f5b

    const v10, 0x3b5f4727

    xor-int/2addr v9, v10

    const v10, 0x5fc6e24f

    goto/16 :goto_0

    :sswitch_15
    invoke-static {v0}, Ll/֫ܽ;->֨ۚܿ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_f
    :goto_6
    const-string v8, "\u06eb\u05a8"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, 0x4f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x7fe9

    const v10, 0x39af73eb

    xor-int/2addr v9, v10

    const v10, 0x26864302

    goto/16 :goto_0

    .line 70
    :sswitch_16
    sget-object v0, Ll/ۙܳ᩷;->֫:Ljava/util/List;

    if-nez v0, :cond_11

    :cond_10
    :goto_7
    const-string v8, "\u073a\u1a7b"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x3d4f

    const v10, -0x2cf0175f

    xor-int/2addr v9, v10

    const v10, 0x5ce6933b

    goto/16 :goto_0

    :cond_11
    const-string v8, "\u0730\u06df"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x473b

    const v10, -0x3ab1bf4d    # -3300.0437f

    xor-int/2addr v9, v10

    const v10, 0x1c23ff28

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fec748a -> :sswitch_1
        -0x7cf761fa -> :sswitch_1
        -0x796f4860 -> :sswitch_12
        -0x76054147 -> :sswitch_c
        -0x695c0022 -> :sswitch_9
        -0x5fb99b3e -> :sswitch_11
        -0x5dd386c6 -> :sswitch_12
        -0x57fca46b -> :sswitch_6
        -0x562a5528 -> :sswitch_2
        -0x4f778409 -> :sswitch_15
        -0x4d600a89 -> :sswitch_14
        -0x4829ef77 -> :sswitch_4
        -0x3a8a695f -> :sswitch_15
        -0x387d8899 -> :sswitch_14
        -0x34cf1bc1 -> :sswitch_f
        -0x314498bb -> :sswitch_7
        -0x17baf814 -> :sswitch_13
        -0x160dcd6e -> :sswitch_13
        -0xce12d14 -> :sswitch_8
        -0x4440168 -> :sswitch_d
        -0x1685720 -> :sswitch_d
        0x4c09146 -> :sswitch_10
        0x919ca2b -> :sswitch_f
        0x1020f889 -> :sswitch_0
        0x1157ea2d -> :sswitch_5
        0x123ee98c -> :sswitch_a
        0x145ea21c -> :sswitch_8
        0x24386bd5 -> :sswitch_16
        0x29277fbd -> :sswitch_6
        0x33f7681e -> :sswitch_3
        0x35673b16 -> :sswitch_7
        0x3aef1e05 -> :sswitch_e
        0x3cb2a5b7 -> :sswitch_9
        0x46a6f72e -> :sswitch_5
        0x496c048e -> :sswitch_e
        0x4c824a40 -> :sswitch_10
        0x4d371ecf -> :sswitch_2
        0x553f1427 -> :sswitch_16
        0x59f95cb9 -> :sswitch_0
        0x5edd906b -> :sswitch_3
        0x620e4ecb -> :sswitch_a
        0x648ce184 -> :sswitch_b
        0x6787e2d7 -> :sswitch_11
        0x6df71654 -> :sswitch_b
        0x7869837a -> :sswitch_c
        0x7c134b30 -> :sswitch_4
    .end sparse-switch
.end method
