.class public final Ll/᩷۟ܽ;
.super Ljava/lang/Object;
.source "J7HQ"


# direct methods
.method public static ֫(IILjava/lang/String;)I
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x24219692

    sget v4, Ll/֡֡;->֫ۤܳ:I

    sget v5, Ll/֨ᩴ;->ۢ֨ۖ:I

    const-string v6, "\u06da\u06df"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x5d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x72fb

    const v8, 0x2f7af9c8

    xor-int/2addr v7, v8

    const v8, 0x304297a8

    :goto_0
    xor-int/2addr v6, v8

    :goto_1
    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, -0x1a7d

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 126
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v6

    if-gtz v6, :cond_6

    goto/16 :goto_5

    :sswitch_0
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget-boolean v6, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v6, :cond_f

    goto :goto_2

    :sswitch_1
    sget v6, Ll/ۗۚ;->ܶۛᩴ:I

    if-gez v6, :cond_a

    goto :goto_2

    .line 164
    :sswitch_2
    sget v6, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v6, :cond_d

    goto :goto_2

    .line 57
    :sswitch_3
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    :goto_2
    const-string v6, "\u06e1\u06e1"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3509

    const v8, 0x272fe479

    xor-int/2addr v7, v8

    const v8, 0x573cee24

    goto :goto_0

    .line 215
    :sswitch_4
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    const/4 p0, 0x0

    return p0

    :sswitch_5
    add-int/lit8 v2, v2, 0x1

    return v2

    :sswitch_6
    return v0

    .line 236
    :sswitch_7
    sget-object v2, Ll/ۜ۟ܽ;->ۗ:Ll/ۜ۟ܽ;

    invoke-static {p2, p0, p1, v2}, Ll/᩷۟ܽ;->֫(Ljava/lang/String;IILl/ۜ۟ܽ;)I

    move-result v2

    if-eq v2, v0, :cond_0

    const-string v6, "\u06eb\u1a7b"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0xd

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0xe43

    const v8, -0x6761082b

    xor-int/2addr v7, v8

    const v8, 0x41e980ff

    goto :goto_0

    :cond_0
    const-string v6, "\u05a1\u06d6"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5b39

    const v8, -0x5ff761e0

    xor-int/2addr v7, v8

    const v8, 0x75ee3c4a

    goto :goto_0

    .line 231
    :sswitch_8
    sget-object v6, Ll/ۜ۟ܽ;->᩶:Ll/ۜ۟ܽ;

    invoke-static {p2, p0, p1, v6}, Ll/᩷۟ܽ;->֫(Ljava/lang/String;IILl/ۜ۟ܽ;)I

    move-result v6

    if-eq v6, v0, :cond_1

    goto :goto_3

    :cond_1
    const-string v6, "\u05ab\u1a79"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x2d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0xb6b

    const v8, -0x46f7a44d

    xor-int/2addr v7, v8

    const v8, -0x7b55bd16

    goto/16 :goto_0

    .line 226
    :sswitch_9
    sget-object v6, Ll/ۜ۟ܽ;->ۙ:Ll/ۜ۟ܽ;

    invoke-static {p2, p0, p1, v6}, Ll/᩷۟ܽ;->֫(Ljava/lang/String;IILl/ۜ۟ܽ;)I

    move-result v6

    if-eq v6, v0, :cond_2

    :goto_3
    move v1, v6

    goto :goto_4

    :cond_2
    const-string v6, "\u1a78\u06e0"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5379

    const v8, -0x1ac9ef49

    xor-int/2addr v7, v8

    const v8, -0x8cc7e61

    goto/16 :goto_0

    :sswitch_a
    add-int/lit8 v1, v1, 0x1

    return v1

    .line 221
    :sswitch_b
    sget-object v0, Ll/ۜ۟ܽ;->᩹:Ll/ۜ۟ܽ;

    invoke-static {p2, p0, p1, v0}, Ll/᩷۟ܽ;->֫(Ljava/lang/String;IILl/ۜ۟ܽ;)I

    move-result v0

    const/4 v6, -0x1

    if-eq v0, v6, :cond_3

    move v1, v0

    const/4 v0, -0x1

    :goto_4
    const-string v6, "\u06d6\u06e1"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x61cd

    const v8, -0x4cfcac1a

    xor-int/2addr v7, v8

    const v8, -0x1e6690d6

    goto/16 :goto_0

    :cond_3
    const-string v0, "\u05a1\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v4, v0

    mul-int/lit8 v0, v0, 0x1f

    xor-int v7, v0, v5

    mul-int/lit16 v7, v7, -0x785d

    const v8, -0x21b4ffdb

    xor-int/2addr v7, v8

    const v8, -0x9f0699f

    xor-int/2addr v0, v8

    move v6, v0

    const/4 v0, -0x1

    goto/16 :goto_1

    .line 190
    :sswitch_c
    sget v6, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v6, :cond_4

    goto/16 :goto_6

    :cond_4
    const-string v6, "\u1a77\u073d"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x4acf

    const v8, 0x792694dd

    xor-int/2addr v7, v8

    const v8, -0x7ff910f5

    goto/16 :goto_0

    .line 219
    :sswitch_d
    sget v6, Ll/֨۟;->᩹֫᩷:I

    if-eqz v6, :cond_5

    goto/16 :goto_5

    :cond_5
    const-string v6, "\u06d9\u073f"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x77

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x36b7

    const v8, -0x23c1bb4a

    xor-int/2addr v7, v8

    const v8, -0x595ad9f1

    goto/16 :goto_0

    :cond_6
    const-string v6, "\u06d7\u1a76"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7c1b

    const v8, 0x2f5d565b

    xor-int/2addr v7, v8

    const v8, -0x53a47aa6

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v6, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v6, :cond_7

    goto/16 :goto_6

    :cond_7
    const-string v6, "\u1a76\u06d9"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x45

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x64bd

    const v8, 0x313582e2

    xor-int/2addr v7, v8

    const v8, 0x670b1745

    goto/16 :goto_0

    :sswitch_f
    sget v6, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v6, :cond_8

    goto :goto_6

    :cond_8
    const-string v6, "\u073a\u05ab"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3f19

    const v8, -0x3e44db6b

    xor-int/2addr v7, v8

    const v8, -0x31797166

    goto/16 :goto_0

    .line 16
    :sswitch_10
    sget v6, Ll/᩺;->ۙۛܶ:I

    if-gtz v6, :cond_9

    goto/16 :goto_7

    :cond_9
    const-string v6, "\u1a78\u1a7b"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2d6b

    const v8, -0x7ef5bfa2

    xor-int/2addr v7, v8

    const v8, -0x2d550108

    goto/16 :goto_0

    .line 109
    :sswitch_11
    sget v6, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v6, :cond_b

    :cond_a
    :goto_5
    const-string v6, "\u1a76\u073a"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x31

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x72b5

    const v8, 0x6ed83f15

    xor-int/2addr v7, v8

    const v8, 0x150f399e

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u073f\u06e8"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1dbd

    const v8, -0x996445b

    xor-int/2addr v7, v8

    const v8, -0x2e129636

    goto/16 :goto_0

    :sswitch_12
    sget v6, Ll/֡֡;->֫ۤܳ:I

    if-ltz v6, :cond_c

    :goto_6
    const-string v6, "\u1a74\u1a78"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x6e27

    const v8, -0xd61e5e8

    xor-int/2addr v7, v8

    const v8, 0x56767da1

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06eb\u06dc"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x559

    const v8, -0x7c1776a1

    xor-int/2addr v7, v8

    const v8, 0x1edae9de

    goto/16 :goto_0

    .line 132
    :sswitch_13
    sget-boolean v6, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v6, :cond_e

    :cond_d
    const-string v6, "\u1a79\u1a73"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x51

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5d9d

    const v8, 0x2e960448

    xor-int/2addr v7, v8

    const v8, -0x2a205c46

    goto/16 :goto_0

    :cond_e
    const-string v6, "\u06e7\u06dc"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2b2f

    const v8, -0x7b8992ed

    xor-int/2addr v7, v8

    const v8, -0x7176a36e

    goto/16 :goto_0

    :sswitch_14
    sget v6, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v6, :cond_10

    :cond_f
    :goto_7
    const-string v6, "\u06d9\u1a73"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x789f

    const v8, -0xcff2ac2    # -1.02072E31f

    xor-int/2addr v7, v8

    const v8, 0x31ec58d0

    goto/16 :goto_0

    :cond_10
    const-string v6, "\u06e4\u06e1"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x61

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4921

    const v8, -0x116296c7

    xor-int/2addr v7, v8

    const v8, 0x5a82a4b2

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x76b46bac -> :sswitch_6
        -0x762bba43 -> :sswitch_b
        -0x6e62e080 -> :sswitch_13
        -0x611bffbf -> :sswitch_1
        -0x5d7de620 -> :sswitch_5
        -0x5a67edda -> :sswitch_14
        -0x4ff30e89 -> :sswitch_2
        -0x4e2d7d5c -> :sswitch_11
        -0x4c76fa58 -> :sswitch_10
        -0x287c70d8 -> :sswitch_c
        -0x257fa81b -> :sswitch_3
        -0x21ca739e -> :sswitch_e
        -0x19b832b8 -> :sswitch_2
        -0x1581da4a -> :sswitch_7
        -0x13303af0 -> :sswitch_d
        -0x7cb7bd1 -> :sswitch_4
        -0x6827af2 -> :sswitch_0
        -0x60c0cb1 -> :sswitch_9
        0x20b9ab9 -> :sswitch_6
        0x34e4971 -> :sswitch_3
        0x353dd0e -> :sswitch_d
        0x5d21116 -> :sswitch_4
        0xb95a7bc -> :sswitch_8
        0x12709d52 -> :sswitch_0
        0x1f41d540 -> :sswitch_13
        0x2181366c -> :sswitch_12
        0x25fcc5ba -> :sswitch_12
        0x2d489308 -> :sswitch_10
        0x2f0d6286 -> :sswitch_b
        0x32237660 -> :sswitch_e
        0x373f9737 -> :sswitch_14
        0x3768e333 -> :sswitch_8
        0x40d78e0b -> :sswitch_7
        0x446780c3 -> :sswitch_a
        0x44959bef -> :sswitch_f
        0x48a707f2 -> :sswitch_11
        0x4e9103ca -> :sswitch_a
        0x5baa2831 -> :sswitch_5
        0x5cb84719 -> :sswitch_1
        0x61e702da -> :sswitch_9
        0x79c68df2 -> :sswitch_c
        0x7da107d0 -> :sswitch_f
    .end sparse-switch
.end method

.method public static ֫(ILjava/lang/String;)I
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, 0x6cd4ff1e

    sget v6, Ll/ۗۗ;->ۨ۬ۖ:I

    sget v7, Ll/ۖ۫;->ۖ֫ܿ:I

    const-string v8, "\u1a77\u05a8"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x663f

    const v10, 0x685c8b00

    xor-int/2addr v9, v10

    const v10, -0x5420e14a

    :goto_0
    xor-int/2addr v8, v10

    xor-int/2addr v5, v6

    mul-int/lit16 v5, v5, 0x596b

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    .line 144
    sget v8, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v8, :cond_d

    goto/16 :goto_4

    .line 105
    :sswitch_0
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    sget v8, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v8, :cond_e

    goto/16 :goto_4

    .line 193
    :sswitch_1
    sget-boolean v8, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v8, :cond_9

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v8

    if-nez v8, :cond_c

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    :goto_1
    const-string v8, "\u073f\u06e4"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x329b

    const v10, -0x1b06dc15

    xor-int/2addr v9, v10

    const v10, -0x5aef6e2

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    const/4 p0, 0x0

    return p0

    :sswitch_5
    add-int/lit8 v4, p0, 0x1

    goto :goto_2

    .line 214
    :sswitch_6
    invoke-static {v3}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v8

    if-eqz v8, :cond_0

    const-string v8, "\u1a74\u073d"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x5e75

    const v10, -0x74a026a8

    xor-int/2addr v9, v10

    const v10, 0x5092e4a0

    goto :goto_0

    :sswitch_7
    return v4

    :sswitch_8
    return v0

    .line 213
    :sswitch_9
    invoke-static {p1, p0}, Ll/֨֫;->֨ܳۗ(Ljava/lang/Object;I)C

    move-result v3

    .line 214
    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v8

    if-eqz v8, :cond_0

    const-string v8, "\u1a77\u06eb"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x4189

    const v10, 0x8a6e2da

    xor-int/2addr v9, v10

    const v10, 0x66771013

    goto/16 :goto_0

    :cond_0
    move v4, p0

    :goto_2
    const-string v8, "\u06df\u06e4"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x43

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x6dd9

    const v10, -0x4a703aed

    xor-int/2addr v9, v10

    const v10, 0x63d1f978

    goto/16 :goto_0

    .line 212
    :sswitch_a
    invoke-static {p1, v1}, Ll/֫ۡ;->ܰ᩷ܺ(Ljava/lang/Object;I)C

    move-result v2

    .line 104
    sget-boolean v8, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v8, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v8, "\u0730\u1a73"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, 0x35

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x8eb

    const v10, -0x449c5f51

    xor-int/2addr v9, v10

    const v10, -0x500d4dcf

    goto/16 :goto_0

    :sswitch_b
    add-int/lit8 v1, p0, -0x1

    .line 194
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v8

    if-nez v8, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v8, "\u05a1\u073a"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x6f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x60c1

    const v10, -0xd88e958

    xor-int/2addr v9, v10

    const v10, 0x86834a9

    goto/16 :goto_0

    :sswitch_c
    const/4 p0, 0x0

    return p0

    :sswitch_d
    if-lt p0, v0, :cond_3

    const-string v8, "\u1a7a\u06ec"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x17

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x3893

    const v10, 0x331fcf3f

    xor-int/2addr v9, v10

    const v10, 0x7b7a463c

    goto/16 :goto_0

    :cond_3
    const-string v8, "\u06d7\u06da"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x53d9

    const v10, 0x4926facb

    xor-int/2addr v9, v10

    const v10, -0x41b6d439

    goto/16 :goto_0

    .line 205
    :sswitch_e
    invoke-static {p1}, Ll/֫ۡ;->᩻ܳܽ(Ljava/lang/Object;)I

    move-result v0

    if-gtz p0, :cond_4

    const-string v8, "\u0730\u06e7"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x7d

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x5a37

    const v10, -0x36693316

    xor-int/2addr v9, v10

    const v10, 0x65a6132a

    goto/16 :goto_0

    :cond_4
    const-string v8, "\u073d\u1a76"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, 0x17

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x2a27

    const v10, 0x44efb4b

    xor-int/2addr v9, v10

    const v10, 0x55f98e79

    goto/16 :goto_0

    .line 129
    :sswitch_f
    sget v8, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v8, :cond_5

    goto :goto_3

    :cond_5
    const-string v8, "\u1a77\u06db"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x2b

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x51a7

    const v10, -0x31cc644e

    xor-int/2addr v9, v10

    const v10, 0x6dcaf020

    goto/16 :goto_0

    .line 44
    :sswitch_10
    sget v8, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v8, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v8, "\u06d8\u06e7"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2637

    const v10, 0x8e6c7e5

    xor-int/2addr v9, v10

    const v10, 0x76928f95

    goto/16 :goto_0

    .line 148
    :sswitch_11
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v8

    if-gtz v8, :cond_7

    :goto_3
    const-string v8, "\u073f\u06dc"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x5f

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x2591

    const v10, -0x70c8ff7c

    xor-int/2addr v9, v10

    const v10, -0x6fd4618

    goto/16 :goto_0

    :cond_7
    const-string v8, "\u06dc\u0736"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x5b

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x5029

    const v10, -0x744d4371

    xor-int/2addr v9, v10

    const v10, -0x444c9d09

    goto/16 :goto_0

    .line 44
    :sswitch_12
    sget v8, Ll/֡֡;->֫ۤܳ:I

    if-ltz v8, :cond_8

    goto :goto_4

    :cond_8
    const-string v8, "\u05a1\u06e0"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x711f

    const v10, -0x6c9d1552

    xor-int/2addr v9, v10

    const v10, 0x3da2342f

    goto/16 :goto_0

    .line 104
    :sswitch_13
    sget v8, Ll/֡֡;->֫ۤܳ:I

    if-ltz v8, :cond_a

    :cond_9
    const-string v8, "\u1a75\u06d8"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x35

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x4dcf

    const v10, -0x440a319e

    xor-int/2addr v9, v10

    const v10, -0x53cf9ab1

    goto/16 :goto_0

    :cond_a
    const-string v8, "\u05ab\u1a76"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2aa7

    const v10, -0x5b95b685

    xor-int/2addr v9, v10

    const v10, -0x470aeb95

    goto/16 :goto_0

    .line 183
    :sswitch_14
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v8

    if-eqz v8, :cond_b

    goto :goto_5

    :cond_b
    const-string v8, "\u06e2\u0730"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x71

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x6241

    const v10, -0x75878369

    xor-int/2addr v9, v10

    const v10, 0x5affe3d0

    goto/16 :goto_0

    :cond_c
    :goto_4
    const-string v8, "\u06df\u1a75"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x6281

    const v10, -0x154ea7b8

    xor-int/2addr v9, v10

    const v10, -0x45bd9a51

    goto/16 :goto_0

    :cond_d
    const-string v8, "\u06da\u06e7"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x98f

    const v10, 0x1189f258

    xor-int/2addr v9, v10

    const v10, 0xec3b2b9

    goto/16 :goto_0

    .line 151
    :sswitch_15
    sget v8, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v8, :cond_f

    :cond_e
    :goto_5
    const-string v8, "\u1a7a\u06df"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, 0x77

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x4743

    const v10, -0x4471672d

    xor-int/2addr v9, v10

    const v10, -0x4b6d7d2c

    goto/16 :goto_0

    :cond_f
    const-string v8, "\u0733\u1a78"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x66cd

    const v10, -0x619e21e8

    xor-int/2addr v9, v10

    const v10, -0x7f94c78b

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ff72a97 -> :sswitch_14
        -0x7e839d05 -> :sswitch_c
        -0x7ab112f6 -> :sswitch_9
        -0x6d685dfc -> :sswitch_10
        -0x6cd21daf -> :sswitch_2
        -0x6ca90e30 -> :sswitch_6
        -0x67fd4724 -> :sswitch_10
        -0x66ef8e14 -> :sswitch_7
        -0x4b8dc710 -> :sswitch_3
        -0x4a43e875 -> :sswitch_c
        -0x49f9b6dc -> :sswitch_11
        -0x40af5be9 -> :sswitch_e
        -0x3ac60601 -> :sswitch_f
        -0x39f4eb8a -> :sswitch_d
        -0x34e4ba2a -> :sswitch_8
        -0x24cae843 -> :sswitch_5
        -0x16962bb8 -> :sswitch_1
        -0xf061b4e -> :sswitch_8
        -0xeb6403e -> :sswitch_0
        -0x9978d1b -> :sswitch_2
        -0x8b6f6ad -> :sswitch_13
        -0x41e4c9d -> :sswitch_14
        -0x2c96332 -> :sswitch_f
        0xf73340c -> :sswitch_4
        0x1789990b -> :sswitch_5
        0x17df21d5 -> :sswitch_7
        0x18d17b96 -> :sswitch_11
        0x1c143a85 -> :sswitch_4
        0x1dd29418 -> :sswitch_0
        0x1f228bc5 -> :sswitch_6
        0x2078ecf3 -> :sswitch_15
        0x2ab7afd5 -> :sswitch_a
        0x31e6428d -> :sswitch_3
        0x33511614 -> :sswitch_12
        0x35ed3970 -> :sswitch_b
        0x3eb6d037 -> :sswitch_12
        0x4186005b -> :sswitch_a
        0x53f2946b -> :sswitch_d
        0x5c8ae78d -> :sswitch_1
        0x6e3c3485 -> :sswitch_13
        0x6ff11455 -> :sswitch_9
        0x70163f5b -> :sswitch_b
        0x76306830 -> :sswitch_e
        0x792cd05d -> :sswitch_15
    .end sparse-switch
.end method

.method public static ֫(Ljava/lang/String;IILl/ۜ۟ܽ;)I
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x7281e0ee

    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    sget v4, Ll/ۛ;->᩺᩻֫:I

    const-string v5, "\u06db\u06dc"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x41

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5939

    const v7, -0x7a550267

    xor-int/2addr v6, v7

    const v7, -0x36c92c02

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x71f9

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    return v1

    .line 180
    :sswitch_0
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v5

    if-nez v5, :cond_9

    goto/16 :goto_3

    .line 132
    :sswitch_1
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    sget v5, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-lez v5, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v5, "\u06e1\u073d"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3d51

    const v7, -0x1eb91a21

    xor-int/2addr v6, v7

    const v7, 0x2c853fa

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    sget v5, Ll/ۗ۬;->ۘܳ᩻:I

    if-lez v5, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v5, "\u06e7\u06df"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0xb4d

    const v7, 0x2b73ed0f

    xor-int/2addr v6, v7

    const v7, 0x4cc7a745    # 1.0467588E8f

    goto :goto_0

    .line 110
    :sswitch_3
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    goto/16 :goto_3

    .line 71
    :sswitch_4
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    const/4 p0, 0x0

    return p0

    .line 246
    :sswitch_5
    invoke-static {p0, v1}, Ll/֨֫;->֨ܳۗ(Ljava/lang/Object;I)C

    move-result v5

    .line 247
    invoke-virtual {p3, v5}, Ll/ۜ۟ܽ;->֫(C)Z

    move-result v5

    if-eqz v5, :cond_2

    const-string v5, "\u1a74\u06e7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x5

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7333

    const v7, -0x78937d84

    xor-int/2addr v6, v7

    const v7, -0x15fd6a6

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1

    :sswitch_6
    const/4 p0, -0x1

    return p0

    :sswitch_7
    add-int/lit8 v1, v0, -0x1

    if-le v1, p1, :cond_3

    const-string v5, "\u06d9\u0733"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x2d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x29f

    const v7, -0x2a1ea63c

    xor-int/2addr v6, v7

    const v7, -0x96f15b7

    goto/16 :goto_0

    :cond_3
    const-string v5, "\u06df\u06e8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x29d

    const v7, -0x12c1ad7f

    xor-int/2addr v6, v7

    const v7, -0x255dada9

    goto/16 :goto_0

    .line 135
    :sswitch_8
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v5

    if-ltz v5, :cond_4

    goto/16 :goto_4

    :cond_4
    move v0, p2

    :goto_1
    const-string v5, "\u073d\u1a78"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x3b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2b31

    const v7, -0x504434a5

    xor-int/2addr v6, v7

    const v7, -0x7d7b64d0

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v5

    if-ltz v5, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v5, "\u1a73\u0733"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7b89

    const v7, -0x218ca5b9

    xor-int/2addr v6, v7

    const v7, 0x27b51c3e

    goto/16 :goto_0

    .line 27
    :sswitch_a
    sget-boolean v5, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v5, :cond_6

    goto :goto_2

    :cond_6
    const-string v5, "\u1a75\u06e8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x71d7

    const v7, 0x1543c1ee

    xor-int/2addr v6, v7

    const v7, -0x5e539b9f

    goto/16 :goto_0

    .line 97
    :sswitch_b
    sget-boolean v5, Ll/֨۫;->۬᩷᩶:Z

    if-nez v5, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v5, "\u06d6\u05a8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x5

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x187

    const v7, 0x59babb38

    xor-int/2addr v6, v7

    const v7, -0x2aaf4eb4

    goto/16 :goto_0

    .line 29
    :sswitch_c
    sget-boolean v5, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v5, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v5, "\u06e8\u06e1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x5b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x17cf

    const v7, -0x4f489d74

    xor-int/2addr v6, v7

    const v7, 0xa8798e7

    goto/16 :goto_0

    .line 204
    :sswitch_d
    sget v5, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v5, :cond_a

    :cond_9
    :goto_2
    const-string v5, "\u06e2\u06e4"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x69c9

    const v7, -0x696d9efc

    xor-int/2addr v6, v7

    const v7, -0x2251d7b1

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u073d\u06d6"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x1f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5f39

    const v7, -0x3fbbc665

    xor-int/2addr v6, v7

    const v7, 0x19d66246

    goto/16 :goto_0

    .line 129
    :sswitch_e
    sget v5, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v5, :cond_b

    goto :goto_4

    :cond_b
    const-string v5, "\u06e0\u1a78"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x27

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x179b

    const v7, -0x67e88b3b

    xor-int/2addr v6, v7

    const v7, -0x6148e31

    goto/16 :goto_0

    .line 196
    :sswitch_f
    sget v5, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v5, :cond_c

    :goto_3
    const-string v5, "\u06e4\u06ec"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x204d

    const v7, 0x4b5ba251    # 1.4393937E7f

    xor-int/2addr v6, v7

    const v7, -0x41d31903

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u05ab\u06d6"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x53b9

    const v7, 0x34affd69

    xor-int/2addr v6, v7

    const v7, 0x151deb15

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v5

    if-ltz v5, :cond_d

    goto :goto_4

    :cond_d
    const-string v5, "\u05a1\u073f"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x21

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x747d

    const v7, 0x4bbbccdb    # 2.461535E7f

    xor-int/2addr v6, v7

    const v7, -0x7a65afa3

    goto/16 :goto_0

    .line 147
    :sswitch_11
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v5

    if-ltz v5, :cond_e

    :goto_4
    const-string v5, "\u06d7\u073a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2f4b

    const v7, 0xe27ec68

    xor-int/2addr v6, v7

    const v7, 0x4c182513    # 3.9883852E7f

    goto/16 :goto_0

    :cond_e
    const-string v5, "\u06df\u073d"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x7d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5a53

    const v7, 0x6f6bdf85    # 7.2999196E28f

    xor-int/2addr v6, v7

    const v7, -0x2c6a24cc

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7aa6d75e -> :sswitch_c
        -0x7039d5f5 -> :sswitch_4
        -0x6c1bd262 -> :sswitch_3
        -0x5fe35250 -> :sswitch_1
        -0x5ed021f9 -> :sswitch_0
        -0x58609389 -> :sswitch_b
        -0x510458da -> :sswitch_b
        -0x4ebf6206 -> :sswitch_10
        -0x35c1f463 -> :sswitch_e
        -0x357ef8b7 -> :sswitch_8
        -0x346ba8e4 -> :sswitch_11
        -0x259ee35a -> :sswitch_d
        -0x1c841444 -> :sswitch_c
        -0x151658d3 -> :sswitch_e
        -0x145d721e -> :sswitch_8
        -0x1025c7e6 -> :sswitch_7
        -0x1000502f -> :sswitch_2
        -0xd29daae -> :sswitch_7
        -0xc0eae78 -> :sswitch_11
        -0x8b58bd5 -> :sswitch_6
        -0x7c38ff5 -> :sswitch_10
        0x6c265b -> :sswitch_a
        0x28da20e -> :sswitch_1
        0x581dfbd -> :sswitch_6
        0x2722232c -> :sswitch_0
        0x3161f53e -> :sswitch_9
        0x3453eb56 -> :sswitch_2
        0x4447cca0 -> :sswitch_5
        0x463a0b00 -> :sswitch_f
        0x4b1c908d -> :sswitch_3
        0x5dea9fce -> :sswitch_5
        0x610f6c76 -> :sswitch_4
        0x6cbb174d -> :sswitch_d
        0x6e365c39 -> :sswitch_f
        0x775fd095 -> :sswitch_a
        0x7e8c0971 -> :sswitch_9
    .end sparse-switch
.end method

.method public static ֫(Ljava/lang/String;ILbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;)Ljava/util/List;
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

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

    const v15, 0x3153dea3

    sget v16, Ll/֨ۤ;->ܿۖ᩵:I

    sget v17, Ll/֡֡;->֫ۤܳ:I

    const-string v18, "\u1a76\u06dc"

    invoke-static/range {v18 .. v18}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v18

    xor-int v18, v18, v16

    xor-int v3, v18, v17

    mul-int/lit16 v3, v3, -0x1821

    const v20, 0x79d13fa4

    xor-int v3, v3, v20

    const v20, 0x36c384cd

    xor-int v18, v18, v20

    move-object v5, v4

    move/from16 v19, v18

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

    const v18, 0x3153dea3

    const/16 v20, 0x0

    :goto_0
    xor-int v4, v18, v17

    mul-int/lit16 v4, v4, 0x7611

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v3, v4

    xor-int v18, v19, v3

    sparse-switch v18, :sswitch_data_0

    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    goto :goto_1

    .line 1
    :sswitch_0
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    sget v3, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v3, :cond_1

    :cond_0
    move/from16 v19, v20

    goto/16 :goto_d

    :cond_1
    const-string v3, "\u06da\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x768b

    const v19, -0x1bac0960

    xor-int v4, v4, v19

    const v19, 0x142b6120

    goto/16 :goto_9

    .line 32
    :sswitch_1
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    move/from16 v19, v20

    goto/16 :goto_b

    :cond_3
    move/from16 v19, v20

    goto/16 :goto_c

    .line 76
    :sswitch_2
    sget-boolean v3, Ll/ۘ᩶;->ܶۗۡ:Z

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    const-string v3, "\u1a7a\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v16, v3

    mul-int/lit8 v3, v3, 0x53

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x6b9b

    const v19, 0x66366acb

    xor-int v4, v4, v19

    const v19, -0x5916cdf7

    goto/16 :goto_9

    :sswitch_3
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-gez v3, :cond_5

    goto :goto_2

    :cond_5
    move/from16 v19, v20

    goto/16 :goto_e

    :sswitch_4
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    sget v3, Ll/᩹;->ۤܿܳ:I

    if-eqz v3, :cond_0

    :goto_1
    move/from16 v19, v20

    goto/16 :goto_10

    :sswitch_5
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    sget v3, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v3, :cond_2

    goto :goto_2

    .line 47
    :sswitch_6
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v3, :cond_6

    goto :goto_1

    :cond_6
    :goto_2
    const-string v3, "\u05a8\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v17, v3

    mul-int/lit8 v3, v3, -0xd

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x1633

    const v19, -0x9947486

    xor-int v4, v4, v19

    const v19, -0xbc8aaf1

    goto/16 :goto_9

    .line 22
    :sswitch_7
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_8
    if-eq v15, v8, :cond_7

    move v11, v15

    goto/16 :goto_5

    :cond_7
    move v11, v10

    goto/16 :goto_5

    .line 61
    :sswitch_9
    invoke-static {v0, v7, v14}, Ll/֨ۡ;->᩻ۨܳ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Ll/۟;->ᩴۗᩳ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move v7, v14

    goto/16 :goto_7

    :sswitch_a
    add-int v3, v12, v13

    if-le v3, v1, :cond_8

    const-string v3, "\u073f\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x5b7

    const v19, 0x6a27830a

    xor-int v4, v4, v19

    const v19, -0xb0491d

    goto/16 :goto_9

    :cond_8
    move v12, v3

    move v9, v10

    move v15, v9

    goto/16 :goto_6

    .line 52
    :sswitch_b
    invoke-static {v0, v7, v6}, Ll/ۨ;->֨ۡ᩶(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Ll/۟;->ᩴۗᩳ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v5

    .line 56
    :sswitch_c
    invoke-static {v7, v11, v0}, Ll/᩷۟ܽ;->֫(IILjava/lang/String;)I

    move-result v3

    if-gt v3, v7, :cond_9

    move v14, v11

    goto :goto_3

    :cond_9
    move v14, v3

    :goto_3
    const-string v3, "\u06d7\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x19a3

    const v19, 0x3041e047

    xor-int v4, v4, v19

    const v19, 0x5b327f4e

    goto/16 :goto_9

    :sswitch_d
    sub-int v3, v10, v9

    goto :goto_4

    .line 76
    :sswitch_e
    invoke-static {v0, v9, v10}, Ll/ۨ;->֨ۡ᩶(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v3

    .line 81
    invoke-interface {v2, v3}, Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;->calculate(Ljava/lang/String;)I

    move-result v3

    :goto_4
    move v13, v3

    const-string v3, "\u06e0\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x6619

    const v19, 0x61ea5c9a

    xor-int v4, v4, v19

    const v19, 0x5d64922e

    goto/16 :goto_9

    :sswitch_f
    if-ne v11, v6, :cond_a

    const-string v3, "\u06d7\u06e2"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x3707

    const v19, -0x5efc2305

    xor-int v4, v4, v19

    const v19, 0x4571a3cc

    goto/16 :goto_9

    :cond_a
    const-string v3, "\u06db\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v16

    mul-int/lit8 v3, v3, -0x23

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0xadd

    const v19, -0x670463cd

    xor-int v4, v4, v19

    const v19, -0x69e30bc1

    goto/16 :goto_9

    .line 87
    :sswitch_10
    invoke-virtual {v0, v9}, Ljava/lang/String;->codePointAt(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    move-result v3

    add-int v10, v3, v9

    if-nez v2, :cond_b

    const-string v3, "\u1a73\u0733"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x6fd9

    const v19, 0x1ffbb9ab

    xor-int v4, v4, v19

    const v19, -0x270f1849

    goto/16 :goto_9

    :cond_b
    const-string v3, "\u06d9\u1a7a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v16, v3

    mul-int/lit8 v3, v3, 0x65

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x42ff

    const v19, -0x5b0a3b9b

    xor-int v4, v4, v19

    const v19, -0x13c5eb52

    goto/16 :goto_9

    :sswitch_11
    if-ge v9, v6, :cond_c

    const-string v3, "\u06ec\u05ab"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0xbfd

    const v19, 0x3af34207

    xor-int v4, v4, v19

    const v19, 0x1db8004f

    goto/16 :goto_9

    :cond_c
    move v11, v9

    :goto_5
    const-string v3, "\u05ab\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x3f05

    const v19, 0x6c332467

    xor-int v4, v4, v19

    const v19, 0x5f4612fa

    goto/16 :goto_9

    :sswitch_12
    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v8, -0x1

    move v9, v7

    const/4 v8, -0x1

    const/4 v12, 0x0

    const/4 v15, -0x1

    :goto_6
    const-string v3, "\u06d9\u06e7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x5ba1

    const v19, 0x2d6229f3

    xor-int v4, v4, v19

    const v19, -0x2a91e64

    goto/16 :goto_9

    :sswitch_13
    return-object v5

    :sswitch_14
    if-ge v7, v6, :cond_d

    const-string v3, "\u06d6\u06df"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x20f3

    const v19, 0x13bcd826

    xor-int v4, v4, v19

    const v19, 0x3caa2ddc

    goto/16 :goto_9

    :cond_d
    const-string v3, "\u1a73\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v16

    mul-int/lit8 v3, v3, 0x5f

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x2599

    const v19, 0x5afd81c

    xor-int v4, v4, v19

    const v19, 0x51bb7bec

    goto/16 :goto_9

    .line 29
    :sswitch_15
    invoke-static/range {p0 .. p0}, Ll/֨֫;->ۡۚܽ(Ljava/lang/Object;)I

    move-result v3

    const/4 v4, 0x0

    move v6, v3

    const/4 v7, 0x0

    :goto_7
    const-string v3, "\u1a73\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x1c5f

    const v19, 0x4b515c87    # 1.3720711E7f

    xor-int v4, v4, v19

    const v19, -0x3f8be50f

    goto :goto_9

    .line 27
    :sswitch_16
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v3, :cond_e

    move/from16 v19, v20

    goto/16 :goto_f

    :cond_e
    const-string v3, "\u1a74\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v17

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x503b

    const v19, -0x42ee8702

    xor-int v4, v4, v19

    const v19, -0x7c16a0b6

    goto :goto_9

    :sswitch_17
    move/from16 v3, v20

    if-gt v3, v1, :cond_f

    move/from16 v19, v3

    goto/16 :goto_a

    :cond_f
    const-string v4, "\u1a75\u073a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int v4, v4, v16

    move/from16 v19, v3

    xor-int v3, v4, v17

    mul-int/lit16 v3, v3, -0x4261

    const v20, 0x4ac76017    # 6533131.5f

    xor-int v3, v3, v20

    const v20, 0x3c7603e7

    xor-int v4, v4, v20

    move/from16 v20, v19

    move/from16 v19, v4

    goto/16 :goto_0

    .line 81
    :sswitch_18
    invoke-interface {v2, v0}, Lbin/mt/plugin/api/translation/TranslationEngine$TextLengthCalculator;->calculate(Ljava/lang/String;)I

    move-result v3

    goto :goto_8

    .line 83
    :sswitch_19
    invoke-static/range {p0 .. p0}, Ll/֨֫;->ۡۚܽ(Ljava/lang/Object;)I

    move-result v3

    :goto_8
    move/from16 v20, v3

    const-string v3, "\u06df\u06d9"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x1f55

    const v19, -0x4371a9d8

    xor-int v4, v4, v19

    const v19, -0x1fd72b7

    :goto_9
    xor-int v19, v3, v19

    goto/16 :goto_12

    :sswitch_1a
    move/from16 v19, v20

    if-eqz v2, :cond_10

    const-string v3, "\u06e4\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0xbf3

    const v20, -0x3389cad

    xor-int v4, v4, v20

    const v20, -0x2a6b31f1

    goto/16 :goto_11

    :cond_10
    const-string v3, "\u06da\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v17

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x3b1b

    const v20, -0x7bcbae4d

    xor-int v4, v4, v20

    const v20, 0x6f5a3d15

    goto/16 :goto_11

    .line 24
    :sswitch_1b
    invoke-static/range {p0 .. p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :sswitch_1c
    move/from16 v19, v20

    if-lez v1, :cond_11

    const-string v3, "\u06db\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v16

    mul-int/lit8 v3, v3, 0x3f

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0xa7

    const v20, -0x3bbc6a21

    xor-int v4, v4, v20

    const v20, -0x566185a1

    goto/16 :goto_11

    :cond_11
    :goto_a
    const-string v3, "\u06e0\u06e4"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x7687

    const v20, 0x116abbc3

    xor-int v4, v4, v20

    const v20, -0x10f8f007

    goto/16 :goto_11

    :sswitch_1d
    move/from16 v19, v20

    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v3, :cond_12

    goto/16 :goto_d

    :cond_12
    const-string v3, "\u073f\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x4e9d

    const v20, -0x1f761ff4

    xor-int v4, v4, v20

    const v20, -0x7d72635a    # -2.0808E-37f

    goto/16 :goto_11

    :sswitch_1e
    move/from16 v19, v20

    .line 43
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v3

    if-gtz v3, :cond_13

    :goto_b
    const-string v3, "\u06e0\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    mul-int/lit8 v3, v3, 0x63

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x6843

    const v20, -0x1db6f350

    xor-int v4, v4, v20

    const v20, -0x5c70664f

    goto/16 :goto_11

    :cond_13
    const-string v3, "\u06e7\u06e7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v16, v3

    mul-int/lit8 v3, v3, -0x43

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x4af9

    const v20, -0x48ff4fd7

    xor-int v4, v4, v20

    const v20, -0x53849a24

    goto/16 :goto_11

    :sswitch_1f
    move/from16 v19, v20

    .line 0
    sget v3, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v3, :cond_14

    goto/16 :goto_e

    :cond_14
    const-string v3, "\u1a74\u06da"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x52ff

    const v20, -0x7e666571

    xor-int v4, v4, v20

    const v20, 0x3822c47

    goto/16 :goto_11

    :sswitch_20
    move/from16 v19, v20

    sget v3, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v3, :cond_15

    :goto_c
    const-string v3, "\u1a74\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v17

    mul-int/lit8 v3, v3, -0x33

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x4e7f

    const v20, 0x54527502

    xor-int v4, v4, v20

    const v20, -0x692b9b3d

    goto/16 :goto_11

    :cond_15
    const-string v3, "\u06e7\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0xcad

    const v20, 0x608b7515

    xor-int v4, v4, v20

    const v20, 0x75af4e6a

    goto/16 :goto_11

    :sswitch_21
    move/from16 v19, v20

    sget-boolean v3, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v3, :cond_16

    :goto_d
    const-string v3, "\u05ab\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, -0x57ed

    const v20, -0xae1a7d1

    xor-int v4, v4, v20

    const v20, -0x5b1e5c4a

    goto/16 :goto_11

    :cond_16
    const-string v3, "\u0733\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0xf87

    const v20, 0x39a26843

    xor-int v4, v4, v20

    const v20, -0x70947d1d

    goto/16 :goto_11

    :sswitch_22
    move/from16 v19, v20

    .line 59
    sget-boolean v3, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v3, :cond_17

    :goto_e
    const-string v3, "\u1a74\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, 0x5a07

    const v20, -0x2ca82fb5

    xor-int v4, v4, v20

    const v20, 0x531e10bd

    goto/16 :goto_11

    :cond_17
    const-string v3, "\u073a\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    mul-int/lit8 v3, v3, -0x1d

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x4c23

    const v20, 0x7d15c9a9

    xor-int v4, v4, v20

    const v20, 0x5df4e28b

    goto/16 :goto_11

    :sswitch_23
    move/from16 v19, v20

    .line 61
    sget v3, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v3, :cond_18

    goto :goto_f

    :cond_18
    const-string v3, "\u0733\u1a7b"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v17

    mul-int/lit8 v3, v3, -0x43

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x6229

    const v20, 0x7f9fb0a0

    xor-int v4, v4, v20

    const v20, 0x44fb5bc4

    goto :goto_11

    :sswitch_24
    move/from16 v19, v20

    .line 73
    sget v3, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v3, :cond_19

    :goto_f
    const-string v3, "\u06d7\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v16

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x1121

    const v20, -0x39b687dc

    xor-int v4, v4, v20

    const v20, 0x1612583f

    goto :goto_11

    :cond_19
    const-string v3, "\u06e8\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v17

    xor-int v4, v3, v16

    mul-int/lit16 v4, v4, -0x2315

    const v20, -0x5e729abd

    xor-int v4, v4, v20

    const v20, -0x3dc61b26

    goto :goto_11

    :sswitch_25
    move/from16 v19, v20

    .line 62
    sget v3, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v3, :cond_1a

    :goto_10
    const-string v3, "\u1a78\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v16

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x2cb1

    const v20, 0x6f28d47b

    xor-int v4, v4, v20

    const v20, -0x4fd09461

    goto :goto_11

    :cond_1a
    const-string v3, "\u06e4\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v16

    mul-int/lit8 v3, v3, -0x6b

    xor-int v4, v3, v17

    mul-int/lit16 v4, v4, 0x3c6b

    const v20, -0x51b4b05a

    xor-int v4, v4, v20

    const v20, -0x5b8cccc1

    :goto_11
    xor-int v3, v3, v20

    move/from16 v20, v19

    move/from16 v19, v3

    :goto_12
    move v3, v4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d516127 -> :sswitch_11
        -0x7b266fb9 -> :sswitch_c
        -0x76f55cb2 -> :sswitch_1f
        -0x700246e8 -> :sswitch_24
        -0x6f3f26e7 -> :sswitch_10
        -0x605913e8 -> :sswitch_11
        -0x5e3eaa5c -> :sswitch_a
        -0x5c1c46e0 -> :sswitch_f
        -0x5b835a5d -> :sswitch_22
        -0x5b45290c -> :sswitch_21
        -0x5a546b49 -> :sswitch_10
        -0x52e38f2a -> :sswitch_2
        -0x5047bc8a -> :sswitch_4
        -0x4ef2c215 -> :sswitch_16
        -0x4e75705d -> :sswitch_1a
        -0x4c8b6593 -> :sswitch_3
        -0x47f9843f -> :sswitch_22
        -0x462b9b94 -> :sswitch_b
        -0x4447457e -> :sswitch_25
        -0x428366a6 -> :sswitch_25
        -0x3ff015a2 -> :sswitch_12
        -0x38da0f65 -> :sswitch_18
        -0x31cc322e -> :sswitch_9
        -0x3112d16e -> :sswitch_23
        -0x300abdf7 -> :sswitch_7
        -0x2ef8501a -> :sswitch_13
        -0x29b55f33 -> :sswitch_9
        -0x26c1c518 -> :sswitch_b
        -0x1e6e5769 -> :sswitch_12
        -0x1c0ff40a -> :sswitch_5
        -0x177158c6 -> :sswitch_1
        -0x169d1b95 -> :sswitch_19
        -0x122507a7 -> :sswitch_1e
        -0x882eb3a -> :sswitch_f
        -0x75d70eb -> :sswitch_1
        -0xdbf416 -> :sswitch_1e
        0x2136192 -> :sswitch_20
        0x2a74bd8 -> :sswitch_17
        0x2ff4efd -> :sswitch_15
        0x3ea50be -> :sswitch_8
        0x9cfa55f -> :sswitch_14
        0xff57eb5 -> :sswitch_1c
        0x122b0d39 -> :sswitch_d
        0x13a2ceb6 -> :sswitch_1b
        0x16318db3 -> :sswitch_6
        0x165e68e6 -> :sswitch_6
        0x177404a8 -> :sswitch_17
        0x239cfb7e -> :sswitch_e
        0x23c1e4e6 -> :sswitch_e
        0x2456c1dc -> :sswitch_d
        0x2999107f -> :sswitch_5
        0x2d3f4260 -> :sswitch_8
        0x31d7db23 -> :sswitch_13
        0x346d3990 -> :sswitch_0
        0x36477f47 -> :sswitch_20
        0x3b26a522 -> :sswitch_14
        0x3b66c153 -> :sswitch_4
        0x3ca20f65 -> :sswitch_2
        0x3e65b0f4 -> :sswitch_c
        0x3e9c091e -> :sswitch_23
        0x459a8ceb -> :sswitch_a
        0x4693817f -> :sswitch_1b
        0x46cd0d41 -> :sswitch_21
        0x4fa7b1ac -> :sswitch_1f
        0x55ab01f9 -> :sswitch_1d
        0x58ec171b -> :sswitch_18
        0x5908a9d2 -> :sswitch_1d
        0x5ccad89d -> :sswitch_19
        0x648656da -> :sswitch_0
        0x687109b1 -> :sswitch_1c
        0x68d41ebf -> :sswitch_7
        0x6ca0e7ab -> :sswitch_15
        0x6e7609e5 -> :sswitch_16
        0x795a5ec3 -> :sswitch_1a
        0x7a02553d -> :sswitch_24
        0x7a3e224d -> :sswitch_3
    .end sparse-switch
.end method

.method public static ֫(Ljava/lang/String;Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;)Ljava/util/List;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

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

    const v16, 0x629b0435

    sget v17, Ll/ۘ᩻;->᩵ۜ֨:I

    sget v18, Ll/֫ܿ;->ۨ۫ᩳ:I

    const-string v19, "\u0733\u1a79"

    invoke-static/range {v19 .. v19}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v19

    add-int v19, v19, v17

    mul-int/lit8 v19, v19, 0x59

    xor-int v2, v19, v18

    mul-int/lit16 v2, v2, 0x6923

    const v21, 0x25c4b20d

    xor-int v2, v2, v21

    const v21, -0x5ce1c727

    xor-int v19, v19, v21

    move/from16 v20, v19

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const v19, 0x629b0435

    const/16 v21, 0x0

    :goto_0
    xor-int v7, v19, v18

    mul-int/lit16 v7, v7, -0x6563

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v2, v7

    xor-int v19, v20, v2

    sparse-switch v19, :sswitch_data_0

    .line 160
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    sget-boolean v2, Ll/ۘ᩶;->ܶۗۡ:Z

    if-eqz v2, :cond_5

    goto/16 :goto_4

    .line 26
    :sswitch_0
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v2

    if-nez v2, :cond_b

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    sget v2, Ll/֫ۧ;->ۙ۟ۧ:I

    if-lez v2, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    move/from16 v20, v21

    goto/16 :goto_11

    .line 125
    :sswitch_2
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    sget-boolean v2, Ll/֫ۡ;->۠ۤۜ:Z

    if-nez v2, :cond_1

    goto/16 :goto_5

    :cond_1
    :goto_2
    const-string v2, "\u1a74\u1a73"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x4087

    const v20, 0x2dd8e37a

    xor-int v7, v7, v20

    const v20, 0x3e31396d

    goto/16 :goto_b

    :sswitch_3
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    sget v2, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-lez v2, :cond_3

    :cond_2
    move/from16 v20, v21

    goto/16 :goto_c

    :cond_3
    move/from16 v20, v21

    goto/16 :goto_14

    .line 14
    :sswitch_4
    sget v2, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v2, :cond_4

    goto :goto_3

    :cond_4
    move/from16 v20, v21

    goto/16 :goto_13

    .line 19
    :sswitch_5
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    sget v2, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v2, :cond_2

    goto :goto_5

    :cond_5
    :goto_3
    const-string v2, "\u06e2\u06eb"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x59

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0xa83

    const v20, 0x6ae098d1

    xor-int v7, v7, v20

    const v20, -0x634da981

    goto/16 :goto_b

    .line 69
    :sswitch_6
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    sget v2, Ll/᩹;->ۤܿܳ:I

    if-eqz v2, :cond_6

    goto :goto_5

    :cond_6
    :goto_4
    const-string v2, "\u06ec\u0733"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    mul-int/lit8 v2, v2, -0x55

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x7c55

    const v20, -0x1152c8b0

    xor-int v7, v7, v20

    const v20, 0x6391ae1b

    goto/16 :goto_b

    .line 108
    :sswitch_7
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    :goto_5
    const-string v2, "\u06df\u05a1"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v17

    mul-int/lit8 v2, v2, 0x57

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x4c7d

    const v20, 0x689a2170

    xor-int v7, v7, v20

    const v20, -0x4071f349

    goto/16 :goto_b

    :sswitch_8
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    const/4 v0, 0x0

    return-object v0

    :sswitch_9
    add-int/lit8 v2, v14, -0x1

    .line 167
    invoke-static {v2, v0}, Ll/᩷۟ܽ;->ۧ(ILjava/lang/String;)I

    move-result v2

    move v10, v2

    goto/16 :goto_a

    .line 87
    :sswitch_a
    invoke-virtual {v0, v5}, Ljava/lang/String;->codePointAt(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result v2

    add-int/2addr v2, v5

    goto :goto_6

    .line 129
    :sswitch_b
    invoke-static {v0, v5, v6}, Ll/ۨ;->֨ۡ᩶(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Ll/۟;->ᩴۗᩳ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move v5, v6

    move/from16 v20, v21

    goto/16 :goto_f

    .line 177
    :sswitch_c
    invoke-interface/range {p1 .. p1}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->reset()V

    .line 178
    invoke-static {v0, v5, v14}, Ll/ۨ;->֨ۡ᩶(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->tryAdd(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    move v9, v14

    goto/16 :goto_a

    :cond_7
    const-string v2, "\u05a1\u05a1"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v18, v2

    mul-int/lit8 v2, v2, -0x35

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x3a79

    const v20, -0x5945e5ce

    xor-int v7, v7, v20

    const v20, -0x54711c02

    goto/16 :goto_b

    .line 123
    :sswitch_d
    invoke-static {v15, v0}, Ll/᩷۟ܽ;->֫(ILjava/lang/String;)I

    move-result v2

    if-gt v2, v5, :cond_8

    const-string v2, "\u06e2\u06e1"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v17, v2

    mul-int/lit8 v2, v2, 0x27

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x22a9

    const v20, -0x6850b710

    xor-int v7, v7, v20

    const v20, 0x57aa9f5d

    goto/16 :goto_b

    :cond_8
    :goto_6
    move v6, v2

    const-string v2, "\u05ab\u0730"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x37

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x165f

    const v20, 0xbff90df

    xor-int v7, v7, v20

    const v20, 0xaf4da39

    goto/16 :goto_b

    :sswitch_e
    add-int/lit8 v2, v9, 0x1

    .line 157
    invoke-static {v2, v0}, Ll/᩷۟ܽ;->֫(ILjava/lang/String;)I

    move-result v2

    goto :goto_7

    :sswitch_f
    if-le v14, v10, :cond_9

    goto/16 :goto_9

    :cond_9
    const-string v2, "\u073f\u06e2"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x2323

    const v20, -0x32b60845    # -2.1177848E8f

    xor-int v7, v7, v20

    const v20, 0x1301aab4

    goto/16 :goto_b

    :sswitch_10
    ushr-int/lit8 v2, v13, 0x1

    .line 155
    invoke-static {v2, v0}, Ll/᩷۟ܽ;->ۧ(ILjava/lang/String;)I

    move-result v2

    if-gt v2, v9, :cond_a

    const-string v2, "\u0736\u1a77"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v18, v2

    mul-int/lit8 v2, v2, -0x4f

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x7dcf

    const v20, 0x3dfe2d7c

    xor-int v7, v7, v20

    const v20, -0x746b7a1a

    goto/16 :goto_b

    :cond_a
    :goto_7
    move v14, v2

    const-string v2, "\u06e1\u06d6"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x197f

    const v20, 0x4265e125

    xor-int v7, v7, v20

    const v20, -0x7641f834

    goto/16 :goto_b

    :sswitch_11
    add-int v13, v11, v12

    .line 8
    sget v2, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v2, :cond_c

    :cond_b
    const-string v2, "\u1a77\u06e2"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    mul-int/lit8 v2, v2, 0x3

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x39ab

    const v20, -0x2c1cb7e9

    xor-int v7, v7, v20

    const v20, 0x7fb15150

    goto/16 :goto_b

    :cond_c
    const-string v2, "\u06e8\u06dc"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v17, v2

    mul-int/lit8 v2, v2, 0x73

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x62b3

    const v20, -0x4d66a0b8

    xor-int v7, v7, v20

    const v20, 0x3c091048

    goto/16 :goto_b

    :sswitch_12
    add-int v11, v9, v10

    const/4 v12, 0x1

    sget v2, Ll/۠;->ܺܺܶ:I

    if-ltz v2, :cond_d

    goto/16 :goto_1

    :cond_d
    const-string v2, "\u073f\u06ec"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x6131

    const v20, -0x1cecfc0b

    xor-int v7, v7, v20

    const v20, -0x7bef1f71

    goto/16 :goto_b

    .line 113
    :sswitch_13
    invoke-static {v0, v5, v4}, Ll/ۨ;->֨ۡ᩶(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Ll/֫ܺ;->ܽۚ᩸(Ljava/lang/Object;Ljava/lang/Object;)Z

    move/from16 v20, v21

    goto/16 :goto_e

    .line 117
    :sswitch_14
    invoke-static {v5, v8, v0}, Ll/᩷۟ܽ;->֫(IILjava/lang/String;)I

    move-result v2

    if-gt v2, v5, :cond_e

    move v15, v8

    goto :goto_8

    :cond_e
    move v15, v2

    :goto_8
    const-string v2, "\u1a7b\u1a7a"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x5325

    const v20, 0x552c4628

    xor-int v7, v7, v20

    const v20, 0x58db99d2

    goto/16 :goto_b

    :sswitch_15
    if-ge v9, v10, :cond_f

    const-string v2, "\u06e1\u06e8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    mul-int/lit8 v2, v2, -0x7d

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x1f39

    const v20, 0x99cab5f

    xor-int v7, v7, v20

    const v20, -0xe2ff9a6

    goto/16 :goto_b

    :cond_f
    :goto_9
    move v8, v9

    move/from16 v20, v21

    goto/16 :goto_d

    :sswitch_16
    if-ne v8, v4, :cond_10

    const-string v2, "\u073f\u06e1"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x27

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x2c1f

    const v20, -0x2a3ce6a7

    xor-int v7, v7, v20

    const v20, -0x1dd5e5b5

    goto/16 :goto_b

    :cond_10
    const-string v2, "\u06e7\u06e0"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0xdb5

    const v20, -0x62d1fd36

    xor-int v7, v7, v20

    const v20, 0x4c687167    # 6.0933532E7f

    goto/16 :goto_b

    .line 152
    :sswitch_17
    invoke-static/range {p0 .. p0}, Ll/֫ۡ;->᩻ܳܽ(Ljava/lang/Object;)I

    move-result v2

    move v10, v2

    move/from16 v9, v21

    :goto_a
    const-string v2, "\u073a\u1a77"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v17

    mul-int/lit8 v2, v2, -0xf

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x38a5

    const v20, 0x5fe45302

    xor-int v7, v7, v20

    const v20, 0x63399aaf

    goto :goto_b

    .line 177
    :sswitch_18
    invoke-interface/range {p1 .. p1}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->reset()V

    move/from16 v2, v21

    .line 178
    invoke-static {v0, v5, v2}, Ll/֨ۡ;->᩻ۨܳ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v1, v7}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->tryAdd(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_11

    move v8, v2

    move/from16 v20, v8

    goto/16 :goto_d

    :cond_11
    const-string v7, "\u0733\u0736"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v17, v7

    mul-int/lit8 v7, v7, 0x73

    move/from16 v20, v2

    xor-int v2, v7, v18

    mul-int/lit16 v2, v2, -0x7187

    const v21, -0x6cc76e60

    xor-int v2, v2, v21

    const v21, 0x30db9068

    xor-int v7, v7, v21

    move/from16 v21, v20

    move/from16 v20, v7

    goto/16 :goto_0

    :sswitch_19
    add-int v21, v16, v5

    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v2

    if-eqz v2, :cond_12

    goto/16 :goto_12

    :cond_12
    const-string v2, "\u0733\u06e4"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x7d97

    const v20, -0x7c57fc5a

    xor-int v7, v7, v20

    const v20, 0x5774340c

    :goto_b
    xor-int v20, v2, v20

    goto/16 :goto_16

    :sswitch_1a
    move/from16 v20, v21

    .line 87
    invoke-virtual {v0, v5}, Ljava/lang/String;->codePointAt(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    move-result v16

    sget v2, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v2, :cond_13

    :goto_c
    const-string v2, "\u06da\u06d8"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x76e7

    const v21, -0x2b086602

    xor-int v7, v7, v21

    const v21, 0x503ea1b5

    goto/16 :goto_15

    :cond_13
    const-string v2, "\u1a73\u06d8"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x6dbb

    const v21, 0x54400160

    xor-int v7, v7, v21

    const v21, -0x7be21384

    goto/16 :goto_15

    :sswitch_1b
    move/from16 v20, v21

    .line 177
    invoke-interface/range {p1 .. p1}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->reset()V

    .line 178
    invoke-static {v0, v5, v4}, Ll/֨ۡ;->᩻ۨܳ(Ljava/lang/Object;II)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->tryAdd(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_14

    move v8, v4

    :goto_d
    const-string v2, "\u0730\u1a74"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x5571

    const v21, -0x6779843f

    xor-int v7, v7, v21

    const v21, -0x62a17b9f

    goto/16 :goto_15

    :cond_14
    const-string v2, "\u1a76\u073d"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v18, v2

    mul-int/lit8 v2, v2, 0x5b

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x2fa9

    const v21, -0xcbc3603

    xor-int v7, v7, v21

    const v21, -0x3e61a6a7

    goto/16 :goto_15

    .line 134
    :sswitch_1c
    invoke-interface/range {p1 .. p1}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->reset()V

    return-object v3

    :sswitch_1d
    move/from16 v20, v21

    if-ge v5, v4, :cond_15

    const-string v2, "\u073a\u073f"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x3c51

    const v21, -0x7a065f89

    xor-int v7, v7, v21

    const v21, -0x5fac6d87

    goto/16 :goto_15

    :cond_15
    :goto_e
    const-string v2, "\u05ab\u0733"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x60cd

    const v21, 0x7c51996e

    xor-int v7, v7, v21

    const v21, 0x58a30ff7

    goto/16 :goto_15

    .line 99
    :sswitch_1e
    invoke-static/range {p0 .. p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :sswitch_1f
    move/from16 v20, v21

    .line 104
    invoke-static/range {p0 .. p0}, Ll/֫ۡ;->᩻ܳܽ(Ljava/lang/Object;)I

    move-result v2

    const/4 v4, 0x0

    move v4, v2

    const/4 v5, 0x0

    :goto_f
    const-string v2, "\u06e0\u1a75"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v17, v2

    mul-int/lit8 v2, v2, 0x1d

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x47b3

    const v21, -0x84aabef

    xor-int v7, v7, v21

    const v21, -0x418f9b74

    goto/16 :goto_15

    :sswitch_20
    move/from16 v20, v21

    .line 102
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 43
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v2

    if-eqz v2, :cond_16

    :goto_10
    move/from16 v21, v20

    goto/16 :goto_12

    :cond_16
    const-string v2, "\u1a76\u06ec"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x280f

    const v21, 0x67b37e41

    xor-int v7, v7, v21

    const v21, -0x22cd9c56

    goto/16 :goto_15

    .line 93
    :sswitch_21
    invoke-static/range {p0 .. p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :sswitch_22
    move/from16 v20, v21

    .line 97
    invoke-interface/range {p1 .. p1}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->reset()V

    .line 98
    invoke-interface {v1, v0}, Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;->tryAdd(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_17

    const-string v2, "\u1a78\u05a8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x3d8f

    const v21, 0x10dbb081

    xor-int v7, v7, v21

    const v21, 0x7abfa6e3

    goto/16 :goto_15

    :cond_17
    const-string v2, "\u1a76\u05a8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    mul-int/lit8 v2, v2, -0x2b

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x2081

    const v21, -0x6c27a1d4

    xor-int v7, v7, v21

    const v21, -0x36749fe0    # -1141764.0f

    goto/16 :goto_15

    :sswitch_23
    move/from16 v20, v21

    .line 92
    invoke-static/range {p0 .. p0}, Ll/۟;->᩻֡᩵(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_18

    const-string v2, "\u1a7a\u06e7"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x7727

    const v21, 0xa7e4c3d

    xor-int v7, v7, v21

    const v21, 0x5f24cf26

    goto/16 :goto_15

    :cond_18
    const-string v2, "\u0736\u06da"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x2c7d

    const v21, 0x423d234e

    xor-int v7, v7, v21

    const v21, -0x3c834421

    goto/16 :goto_15

    :sswitch_24
    move/from16 v20, v21

    .line 20
    sget v2, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v2, :cond_19

    :goto_11
    const-string v2, "\u1a73\u073a"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x4b

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x5c21

    const v21, 0x1f4688f4

    xor-int v7, v7, v21

    const v21, 0x3a106c51

    goto/16 :goto_15

    :cond_19
    const-string v2, "\u1a7a\u06db"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    mul-int/lit8 v2, v2, -0x37

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, 0x6fd3

    const v21, -0x5605d331    # -1.1110003E-13f

    xor-int v7, v7, v21

    const v21, -0x7ed9f8ab

    goto/16 :goto_15

    :sswitch_25
    move/from16 v20, v21

    sget v2, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v2, :cond_1a

    goto/16 :goto_14

    :cond_1a
    const-string v2, "\u06dc\u1a79"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x3599

    const v21, 0x287586af

    xor-int v7, v7, v21

    const v21, -0x6b915643

    goto/16 :goto_15

    :sswitch_26
    move/from16 v20, v21

    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v2

    if-gtz v2, :cond_1b

    goto/16 :goto_10

    :goto_12
    const-string v2, "\u06d9\u073f"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    mul-int/lit8 v2, v2, 0x15

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x62fb

    const v20, -0x8a49447

    xor-int v7, v7, v20

    const v20, -0x1086baac    # -7.714558E28f

    goto/16 :goto_b

    :cond_1b
    const-string v2, "\u06db\u06e2"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x4ff9

    const v21, -0x1e0f208f

    xor-int v7, v7, v21

    const v21, -0x3386f4c5    # -6.5285356E7f

    goto :goto_15

    :sswitch_27
    move/from16 v20, v21

    .line 15
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v2

    if-ltz v2, :cond_1c

    :goto_13
    const-string v2, "\u06e4\u0730"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    mul-int/lit8 v2, v2, -0x75

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x1945

    const v21, -0x42e7344a

    xor-int v7, v7, v21

    const v21, 0x1cf69f88

    goto :goto_15

    :cond_1c
    const-string v2, "\u1a7a\u06e4"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x57

    xor-int v7, v2, v17

    mul-int/lit16 v7, v7, -0x2bb9

    const v21, 0x704beb5d

    xor-int v7, v7, v21

    const v21, -0x160e7434

    goto :goto_15

    :sswitch_28
    move/from16 v20, v21

    .line 73
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v2

    if-gtz v2, :cond_1d

    :goto_14
    const-string v2, "\u05ab\u05a8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v17

    mul-int/lit8 v2, v2, -0x6b

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, -0x5fa7

    const v21, 0x296d8135

    xor-int v7, v7, v21

    const v21, -0x7f0e5160

    goto :goto_15

    :cond_1d
    const-string v2, "\u06e4\u1a74"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v17, v2

    mul-int/lit8 v2, v2, -0x2d

    xor-int v7, v2, v18

    mul-int/lit16 v7, v7, 0x3089

    const v21, 0x2aa98abd

    xor-int v7, v7, v21

    const v21, -0x1db80ab9

    :goto_15
    xor-int v2, v2, v21

    move/from16 v21, v20

    move/from16 v20, v2

    :goto_16
    move v2, v7

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d260350 -> :sswitch_e
        -0x7b872d76 -> :sswitch_1d
        -0x76ed0355 -> :sswitch_1f
        -0x75a48f2e -> :sswitch_15
        -0x745e4cbb -> :sswitch_27
        -0x7371df73 -> :sswitch_1c
        -0x731be8ce -> :sswitch_11
        -0x724c8c06 -> :sswitch_15
        -0x6bf0a3ec -> :sswitch_1b
        -0x6ac2dd68 -> :sswitch_1
        -0x6880deb9 -> :sswitch_28
        -0x67a58b95 -> :sswitch_25
        -0x628ce325 -> :sswitch_2
        -0x6220af37 -> :sswitch_4
        -0x615ff262 -> :sswitch_0
        -0x60b3ae09 -> :sswitch_12
        -0x5fcd9078 -> :sswitch_24
        -0x5e2089ae -> :sswitch_25
        -0x5caa6ab3 -> :sswitch_d
        -0x5b1952ee -> :sswitch_0
        -0x556a37c1 -> :sswitch_3
        -0x51bdd7de -> :sswitch_a
        -0x4e6bc1de -> :sswitch_f
        -0x4bda91e9 -> :sswitch_17
        -0x46f5d4ec -> :sswitch_10
        -0x42bae673 -> :sswitch_10
        -0x421d0d0f -> :sswitch_f
        -0x3d5551cf -> :sswitch_2
        -0x3c947cc5 -> :sswitch_1e
        -0x3a13e61e -> :sswitch_12
        -0x368226ee -> :sswitch_16
        -0x2fcc5ccb -> :sswitch_11
        -0x2fc28d72 -> :sswitch_19
        -0x2d60a598 -> :sswitch_7
        -0x2965e041 -> :sswitch_26
        -0x288c04ae -> :sswitch_4
        -0x23fd0501 -> :sswitch_6
        -0x1d539987 -> :sswitch_1
        -0x18499054 -> :sswitch_8
        -0x1695f9e9 -> :sswitch_c
        -0x8df8b6d -> :sswitch_22
        -0x14cfd42 -> :sswitch_7
        0x17663bf -> :sswitch_17
        0x68a96a4 -> :sswitch_20
        0x83050e2 -> :sswitch_9
        0xb8a17f2 -> :sswitch_b
        0xc801d28 -> :sswitch_1c
        0xd750144 -> :sswitch_5
        0x111f6dd0 -> :sswitch_19
        0x170e1fc9 -> :sswitch_20
        0x184b0989 -> :sswitch_14
        0x197dd127 -> :sswitch_b
        0x261b6fc9 -> :sswitch_1a
        0x26605dab -> :sswitch_5
        0x29b1038f -> :sswitch_27
        0x329b6973 -> :sswitch_1f
        0x33bb5364 -> :sswitch_13
        0x344ed5bd -> :sswitch_14
        0x3516fd7c -> :sswitch_21
        0x39d8611a -> :sswitch_13
        0x3a51ac51 -> :sswitch_28
        0x3d12fc2d -> :sswitch_18
        0x3f4aa8c3 -> :sswitch_9
        0x4722e900 -> :sswitch_c
        0x47e0ce06 -> :sswitch_16
        0x4e52372c -> :sswitch_22
        0x4ee0b5fb -> :sswitch_1e
        0x5025e12b -> :sswitch_1d
        0x5b5d6926 -> :sswitch_6
        0x62701e4c -> :sswitch_1a
        0x6328fb35 -> :sswitch_18
        0x65ae9e76 -> :sswitch_23
        0x6a11d325 -> :sswitch_3
        0x6a6a4a2e -> :sswitch_e
        0x6b7bdda3 -> :sswitch_21
        0x6c84ffa5 -> :sswitch_d
        0x6ddbb193 -> :sswitch_23
        0x70c79ebb -> :sswitch_26
        0x74124511 -> :sswitch_8
        0x74cb4219 -> :sswitch_1b
        0x758dd5aa -> :sswitch_a
        0x7cd3ebe9 -> :sswitch_24
    .end sparse-switch
.end method

.method public static ۧ(ILjava/lang/String;)I
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, 0x31942089

    sget v5, Ll/֨۬;->۫ۙ᩺:I

    sget v6, Ll/ۗ᩷;->᩸᩺ᩳ:I

    const-string v7, "\u06e8\u1a78"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x4dc3

    const v9, -0x1d27112e    # -2.0008528E21f

    xor-int/2addr v8, v9

    const v9, -0x39d74f79

    :goto_0
    xor-int/2addr v7, v9

    xor-int/2addr v4, v5

    mul-int/lit16 v4, v4, 0x22af

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 124
    sget v7, Ll/᩺;->ۙۛܶ:I

    if-gtz v7, :cond_8

    goto/16 :goto_1

    .line 91
    :sswitch_0
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    sget v7, Ll/֨۬;->۫ۙ᩺:I

    if-lez v7, :cond_b

    goto/16 :goto_4

    :sswitch_1
    sget v7, Ll/֨۟;->᩹֫᩷:I

    if-eqz v7, :cond_5

    goto/16 :goto_1

    .line 44
    :sswitch_2
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v7

    if-nez v7, :cond_7

    goto/16 :goto_4

    .line 110
    :sswitch_3
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    const/4 p0, 0x0

    return p0

    :sswitch_5
    return v1

    .line 195
    :sswitch_6
    invoke-static {v3}, Ljava/lang/Character;->isLowSurrogate(C)Z

    move-result v7

    if-eqz v7, :cond_0

    const-string v7, "\u06d6\u0730"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x629d

    const v9, -0x737d0a16

    xor-int/2addr v8, v9

    const v9, 0x597c3bd2

    goto :goto_0

    :sswitch_7
    return p0

    :sswitch_8
    return v0

    .line 194
    :sswitch_9
    invoke-static {p1, p0}, Ll/֫ۡ;->ܰ᩷ܺ(Ljava/lang/Object;I)C

    move-result v3

    .line 195
    invoke-static {v2}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v7

    if-eqz v7, :cond_0

    const-string v7, "\u1a7a\u0730"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x4625

    const v9, 0x696cf214

    xor-int/2addr v8, v9

    const v9, 0x62db84a2

    goto :goto_0

    :cond_0
    const-string v7, "\u06d8\u06db"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, -0x7b

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x1161

    const v9, -0x44c40e5c

    xor-int/2addr v8, v9

    const v9, -0x7f3e975d

    goto/16 :goto_0

    .line 193
    :sswitch_a
    invoke-static {p1, v1}, Ll/֨֫;->֨ܳۗ(Ljava/lang/Object;I)C

    move-result v2

    sget v7, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v7, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v7, "\u06df\u06e4"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x6607

    const v9, -0x768c9463

    xor-int/2addr v8, v9

    const v9, -0x32f2994b

    goto/16 :goto_0

    :sswitch_b
    add-int/lit8 v1, p0, -0x1

    .line 89
    sget v7, Ll/ۛ;->᩺᩻֫:I

    if-ltz v7, :cond_2

    goto/16 :goto_1

    :cond_2
    const-string v7, "\u1a77\u06e2"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6e27

    const v9, -0x179fc52c

    xor-int/2addr v8, v9

    const v9, -0x19ead991

    goto/16 :goto_0

    :sswitch_c
    const/4 p0, 0x0

    return p0

    :sswitch_d
    if-lt p0, v0, :cond_3

    const-string v7, "\u1a7b\u06eb"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x7b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x2e19

    const v9, 0x7e634950

    xor-int/2addr v8, v9

    const v9, -0x42f32743

    goto/16 :goto_0

    :cond_3
    const-string v7, "\u06df\u0730"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x7185

    const v9, -0x3db37d1a

    xor-int/2addr v8, v9

    const v9, 0x3c93843

    goto/16 :goto_0

    .line 186
    :sswitch_e
    invoke-static {p1}, Ll/֫ۡ;->᩻ܳܽ(Ljava/lang/Object;)I

    move-result v0

    if-gtz p0, :cond_4

    const-string v7, "\u05ab\u06d8"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3a25

    const v9, 0x5192d861

    xor-int/2addr v8, v9

    const v9, 0x1d613689

    goto/16 :goto_0

    :cond_4
    const-string v7, "\u06da\u06d9"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x77

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x549

    const v9, 0x6faaad82

    xor-int/2addr v8, v9

    const v9, 0x6c5d371e

    goto/16 :goto_0

    .line 82
    :sswitch_f
    sget v7, Ll/֨۟;->᩹֫᩷:I

    if-eqz v7, :cond_6

    :cond_5
    const-string v7, "\u06e0\u0733"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x49db

    const v9, -0x6645f82c

    xor-int/2addr v8, v9

    const v9, -0x7c2c766d

    goto/16 :goto_0

    :cond_6
    const-string v7, "\u06eb\u0730"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x5723

    const v9, -0x3f5af49c

    xor-int/2addr v8, v9

    const v9, -0x10dd4c9d

    goto/16 :goto_0

    :cond_7
    :goto_1
    const-string v7, "\u06e2\u0733"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x13

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3231

    const v9, -0x4dc4c3ab

    xor-int/2addr v8, v9

    const v9, 0x39277c59

    goto/16 :goto_0

    :cond_8
    const-string v7, "\u1a75\u1a78"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x319f

    const v9, 0x1c11e9c4

    xor-int/2addr v8, v9

    const v9, 0x6d3a7039

    goto/16 :goto_0

    .line 154
    :sswitch_10
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v7

    if-gtz v7, :cond_9

    goto/16 :goto_4

    :cond_9
    const-string v7, "\u05a1\u0730"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x6b

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x9fd

    const v9, 0x23155

    xor-int/2addr v8, v9

    const v9, 0x778e973f

    goto/16 :goto_0

    .line 111
    :sswitch_11
    sget-boolean v7, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v7, :cond_a

    goto :goto_2

    :cond_a
    const-string v7, "\u06df\u05a8"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x71

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x4c91

    const v9, 0x6b66b548

    xor-int/2addr v8, v9

    const v9, 0x7820ef2c

    goto/16 :goto_0

    .line 127
    :sswitch_12
    sget v7, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v7, :cond_c

    :cond_b
    :goto_2
    const-string v7, "\u06d6\u05ab"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x2023

    const v9, -0x6c71eaa6

    xor-int/2addr v8, v9

    const v9, 0x716b624d

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u06dc\u05a1"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x4591

    const v9, 0x4087e776

    xor-int/2addr v8, v9

    const v9, -0x39f9ca7a

    goto/16 :goto_0

    .line 103
    :sswitch_13
    sget v7, Ll/ۛ;->᩺᩻֫:I

    if-ltz v7, :cond_d

    goto :goto_4

    :cond_d
    const-string v7, "\u06dc\u06d7"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x5b

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x2801

    const v9, 0x78100356

    xor-int/2addr v8, v9

    const v9, -0x8832bc6

    goto/16 :goto_0

    .line 68
    :sswitch_14
    sget v7, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v7, :cond_e

    :goto_3
    const-string v7, "\u1a79\u1a73"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x6405

    const v9, 0x53aff823

    xor-int/2addr v8, v9

    const v9, 0x5e74d5e6    # 4.410565E18f

    goto/16 :goto_0

    :cond_e
    const-string v7, "\u1a74\u073d"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x3

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x655b

    const v9, 0x75efc039

    xor-int/2addr v8, v9

    const v9, -0x8ced606

    goto/16 :goto_0

    .line 8
    :sswitch_15
    sget-boolean v7, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v7, :cond_f

    :goto_4
    const-string v7, "\u06e2\u0736"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x192b

    const v9, -0x43d0d92f

    xor-int/2addr v8, v9

    const v9, 0x306c7882

    goto/16 :goto_0

    :cond_f
    const-string v7, "\u05a1\u06e8"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0xf

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x5655

    const v9, -0x5298aa5c

    xor-int/2addr v8, v9

    const v9, -0x49c243af

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d5adec1 -> :sswitch_3
        -0x7b0e0ab2 -> :sswitch_13
        -0x7890cc12 -> :sswitch_2
        -0x78032f77 -> :sswitch_a
        -0x74a8adf8 -> :sswitch_2
        -0x71375c95 -> :sswitch_e
        -0x685d0850 -> :sswitch_c
        -0x67edd3ef -> :sswitch_4
        -0x658d28b1 -> :sswitch_e
        -0x583d7246 -> :sswitch_15
        -0x5813dd92 -> :sswitch_11
        -0x499a494e -> :sswitch_8
        -0x3a764568 -> :sswitch_9
        -0x33a8faf7 -> :sswitch_15
        -0x2deaad94 -> :sswitch_0
        -0x22fd685d -> :sswitch_a
        -0x1d5ab893 -> :sswitch_14
        -0x13ca5bd6 -> :sswitch_7
        -0xe23949b -> :sswitch_12
        -0xaf1127b -> :sswitch_14
        0x3e7f5d -> :sswitch_d
        0x33272f9 -> :sswitch_6
        0x8c38c6c -> :sswitch_f
        0xb4de3ba -> :sswitch_b
        0xffe5485 -> :sswitch_9
        0x10817675 -> :sswitch_1
        0x115b6387 -> :sswitch_13
        0x16494a09 -> :sswitch_5
        0x26ac9cd2 -> :sswitch_6
        0x3cc81673 -> :sswitch_8
        0x4064abe8 -> :sswitch_10
        0x4e8cb5d8 -> :sswitch_3
        0x507a251f -> :sswitch_1
        0x518669bb -> :sswitch_4
        0x51f8e700 -> :sswitch_5
        0x56f39d34 -> :sswitch_0
        0x64306894 -> :sswitch_10
        0x65bd3952 -> :sswitch_f
        0x66607e31 -> :sswitch_d
        0x683815fa -> :sswitch_7
        0x68f23300 -> :sswitch_b
        0x793bf8f8 -> :sswitch_11
        0x7c8b4da9 -> :sswitch_c
        0x7f73d53d -> :sswitch_12
    .end sparse-switch
.end method
