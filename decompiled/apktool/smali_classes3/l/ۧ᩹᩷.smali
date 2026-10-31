.class public final Ll/ۧ᩹᩷;
.super Ljava/lang/Object;
.source "K7FD"


# direct methods
.method public static ֫(Landroid/content/Context;IZ)Landroid/content/Context;
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x7b357178

    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    sget v4, Ll/ۗ᩵;->֫۠۟:I

    const-string v5, "\u06da\u06d8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x698b

    const v7, 0x428b2fb4

    xor-int/2addr v6, v7

    const v7, -0x13804c2e

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x57cd

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 39
    sget v5, Ll/᩹֡᩷;->ᩴ֫:I

    .line 144
    sget-object v5, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    if-eqz v5, :cond_3

    const-string v5, "\u05ab\u1a7a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x4b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2fbf

    const v7, 0xe9e1b35

    xor-int/2addr v6, v7

    const v7, 0x51423518

    goto :goto_0

    .line 54
    :sswitch_0
    sget-boolean v5, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v5, :cond_a

    goto/16 :goto_4

    .line 134
    :sswitch_1
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v5

    if-nez v5, :cond_7

    goto :goto_1

    .line 19
    :sswitch_2
    sget v5, Ll/ۗ۬;->ۘܳ᩻:I

    if-lez v5, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v5, "\u05ab\u1a75"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x1b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x71a1

    const v7, -0x292a9ad4

    xor-int/2addr v6, v7

    const v7, -0x7f917cb4

    goto :goto_0

    .line 25
    :sswitch_3
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    goto/16 :goto_4

    .line 17
    :sswitch_4
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    const/4 p0, 0x0

    return-object p0

    :sswitch_5
    return-object v0

    .line 45
    :sswitch_6
    new-instance v5, Landroid/content/res/Configuration;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v6

    .line 127
    sget v7, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v7, :cond_1

    goto/16 :goto_5

    .line 45
    :cond_1
    invoke-direct {v5, v6}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 46
    invoke-static {v5, p1}, Ll/᩹֡᩷;->֫(Landroid/content/res/Configuration;I)V

    .line 47
    invoke-virtual {v0, v5}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object v1

    goto :goto_2

    .line 144
    :sswitch_7
    sget-object v5, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    .line 42
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v5

    invoke-static {v5, p1}, Ll/᩹֡᩷;->ۧ(Landroid/content/res/Configuration;I)Z

    move-result v5

    if-eqz v5, :cond_2

    const-string v5, "\u1a74\u1a77"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x3f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xc6d

    const v7, 0x68a93e29

    xor-int/2addr v6, v7

    const v7, -0x70aa3b80

    goto/16 :goto_0

    :cond_2
    const-string v5, "\u0733\u06e7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit8 v6, v6, 0x13

    const v7, -0x3e3e220a

    xor-int/2addr v6, v7

    const v7, 0x43488aa0

    goto/16 :goto_0

    :sswitch_8
    return-object v1

    .line 38
    :sswitch_9
    invoke-static {p0}, Ll/ۢۤۡ;->ۧ(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    if-eqz p2, :cond_3

    const-string v5, "\u1a77\u0730"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4519

    const v7, 0x2a7a5aa6

    xor-int/2addr v6, v7

    const v7, -0x7163c483

    goto/16 :goto_0

    :cond_3
    move-object v1, v0

    :goto_2
    const-string v5, "\u1a7b\u0736"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3f55

    const v7, 0x2e37736c

    xor-int/2addr v6, v7

    const v7, -0x2d57522a

    goto/16 :goto_0

    .line 35
    :sswitch_a
    sget v5, Ll/᩹;->ۤܿܳ:I

    if-eqz v5, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v5, "\u073d\u1a73"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x53b7

    const v7, -0x3ddeb3ea

    xor-int/2addr v6, v7

    const v7, 0x342358e5

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v5

    if-eqz v5, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v5, "\u06e0\u06d9"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x49

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6eb1

    const v7, -0x3c1e337c

    xor-int/2addr v6, v7

    const v7, -0x6eb6fcd0

    goto/16 :goto_0

    .line 143
    :sswitch_c
    sget v5, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v5, :cond_6

    goto :goto_3

    :cond_6
    const-string v5, "\u06db\u06eb"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x546b

    const v7, 0x36bfaa8a

    xor-int/2addr v6, v7

    const v7, 0x7252bacc

    goto/16 :goto_0

    .line 3
    :sswitch_d
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v5

    if-ltz v5, :cond_8

    :cond_7
    const-string v5, "\u1a77\u06db"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4eab

    const v7, -0x1c4557c0

    xor-int/2addr v6, v7

    const v7, 0x382e5619

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06ec\u05a8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x591

    const v7, -0x4e769062    # -3.999914E-9f

    xor-int/2addr v6, v7

    const v7, -0x6d2755f1

    goto/16 :goto_0

    .line 82
    :sswitch_e
    sget v5, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v5, :cond_9

    goto :goto_3

    :cond_9
    const-string v5, "\u06d7\u05a1"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2415

    const v7, -0x348bcb8f    # -1.6004209E7f

    xor-int/2addr v6, v7

    const v7, 0x345bd712

    goto/16 :goto_0

    .line 70
    :sswitch_f
    sget v5, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v5, :cond_b

    :cond_a
    :goto_3
    const-string v5, "\u06e8\u0733"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x59b1

    const v7, 0x2feaf1e6

    xor-int/2addr v6, v7

    const v7, 0x350456db

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06d9\u073a"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x6b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6567

    const v7, 0x1679d399

    xor-int/2addr v6, v7

    const v7, -0x3c0105ef

    goto/16 :goto_0

    .line 117
    :sswitch_10
    sget v5, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v5, :cond_c

    :goto_4
    const-string v5, "\u06d7\u06e4"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1d43

    const v7, 0x337c5a1d

    xor-int/2addr v6, v7

    const v7, 0x3f69c146

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06db\u0730"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3297

    const v7, -0x5db1592c

    xor-int/2addr v6, v7

    const v7, -0x23e3ee48

    goto/16 :goto_0

    .line 65
    :sswitch_11
    sget v5, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v5, :cond_d

    goto :goto_5

    :cond_d
    const-string v5, "\u1a74\u06d6"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4e09

    const v7, 0x26a02751

    xor-int/2addr v6, v7

    const v7, -0x5aa5d58a

    goto/16 :goto_0

    :sswitch_12
    sget-boolean v5, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v5, :cond_e

    :goto_5
    const-string v5, "\u06d7\u1a76"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x45e7

    const v7, -0x74c72154

    xor-int/2addr v6, v7

    const v7, 0x69f99821

    goto/16 :goto_0

    :cond_e
    const-string v5, "\u06d8\u1a73"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2543

    const v7, -0x3138acf2

    xor-int/2addr v6, v7

    const v7, 0x60d37382

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fef2f48 -> :sswitch_1
        -0x7eb0aa70 -> :sswitch_d
        -0x7e4e5cfd -> :sswitch_11
        -0x7d4cb118 -> :sswitch_d
        -0x7582bf7d -> :sswitch_4
        -0x752aaf56 -> :sswitch_f
        -0x6ec2351c -> :sswitch_12
        -0x5df94deb -> :sswitch_7
        -0x45490db5 -> :sswitch_12
        -0x3bee136c -> :sswitch_c
        -0x33c64757 -> :sswitch_a
        -0x31178018 -> :sswitch_3
        -0x2a3839cf -> :sswitch_11
        -0x279e5afc -> :sswitch_b
        -0x2642a1b7 -> :sswitch_10
        -0x2312d28a -> :sswitch_0
        -0x17f95e3c -> :sswitch_4
        -0x144ad269 -> :sswitch_c
        -0xd53ee42 -> :sswitch_5
        -0xc6f75cd -> :sswitch_10
        0x67d81b -> :sswitch_5
        0x1581f613 -> :sswitch_6
        0x249bfb1b -> :sswitch_b
        0x3ae4d922 -> :sswitch_1
        0x3d29db64 -> :sswitch_6
        0x3da8331d -> :sswitch_9
        0x3f06d855 -> :sswitch_8
        0x3fdc010a -> :sswitch_7
        0x41edc5b4 -> :sswitch_f
        0x54faffdd -> :sswitch_2
        0x576f140f -> :sswitch_a
        0x58aa026d -> :sswitch_3
        0x5cc14fe3 -> :sswitch_e
        0x62ea3894 -> :sswitch_9
        0x67bfcae5 -> :sswitch_8
        0x6cd8a0dc -> :sswitch_e
        0x6d54024a -> :sswitch_0
        0x6ee4f7fa -> :sswitch_2
    .end sparse-switch
.end method

.method public static ֫(Landroid/app/Activity;IZ)V
    .locals 6

    const v0, 0x2ba7246d

    sget v1, Ll/ۗۚ;->ܶۛᩴ:I

    sget v2, Ll/ۘᩴ;->ܿ۬ܿ:I

    const-string v3, "\u06e4\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5609

    const v5, -0x54e6fa36

    xor-int/2addr v4, v5

    const v5, 0x6990d148

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x4f7d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 54
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_5

    goto/16 :goto_2

    :sswitch_0
    sget-boolean v3, Ll/֫ۡ;->۠ۤۜ:Z

    if-nez v3, :cond_4

    goto/16 :goto_6

    .line 138
    :sswitch_1
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v3

    if-eqz v3, :cond_c

    goto/16 :goto_6

    .line 125
    :sswitch_2
    sget v3, Ll/۟;->ۗۤۛ:I

    if-nez v3, :cond_e

    goto/16 :goto_4

    .line 107
    :sswitch_3
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    goto/16 :goto_4

    .line 38
    :sswitch_4
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    return-void

    .line 143
    :sswitch_5
    invoke-virtual {p0}, Landroid/app/Activity;->recreate()V

    goto/16 :goto_1

    .line 140
    :sswitch_6
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    invoke-static {v3, p1}, Ll/᩹֡᩷;->ۧ(Landroid/content/res/Configuration;I)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u06dc\u1a75"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2669

    const v5, 0x1c79922c

    xor-int/2addr v4, v5

    const v5, 0x734c6ef

    goto :goto_0

    .line 137
    :sswitch_7
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u05ab\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x671b

    const v5, -0x7e2a8805

    xor-int/2addr v4, v5

    const v5, -0x2e60e0af

    goto :goto_0

    .line 144
    :sswitch_8
    sget-object v3, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    .line 137
    invoke-static {p0}, Ll/ۗۗ;->۬ۛ֡(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "\u1a76\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xd65

    const v5, 0x223a1fba

    xor-int/2addr v4, v5

    const v5, 0x59837053

    goto/16 :goto_0

    .line 134
    :sswitch_9
    sget v3, Ll/᩹֡᩷;->ᩴ֫:I

    .line 144
    sget-object v3, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    if-eqz v3, :cond_2

    const-string v3, "\u1a73\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x425

    const v5, 0x286f2241

    xor-int/2addr v4, v5

    const v5, -0x24c11b6f

    goto/16 :goto_0

    :sswitch_a
    return-void

    :sswitch_b
    if-eqz p2, :cond_2

    const-string v3, "\u06ec\u1a73"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4b4b

    const v5, -0x17605914

    xor-int/2addr v4, v5

    const v5, -0x670294b6

    goto/16 :goto_0

    :cond_2
    :goto_1
    const-string v3, "\u06d7\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x75

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4b7d

    const v5, -0x156d6b7f

    xor-int/2addr v4, v5

    const v5, 0x712eb12

    goto/16 :goto_0

    .line 143
    :sswitch_c
    sget v3, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u06d8\u05a8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x51

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x128b

    const v5, -0x6b9163c2

    xor-int/2addr v4, v5

    const v5, 0x1d044ed2

    goto/16 :goto_0

    :cond_4
    :goto_2
    const-string v3, "\u06e1\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x68ed

    const v5, -0x5ae7a

    xor-int/2addr v4, v5

    const v5, -0x66659805

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06d7\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1a75

    const v5, -0xdb147ef

    xor-int/2addr v4, v5

    const v5, -0x5a4100a

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v3, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v3, "\u0733\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x186d

    const v5, -0x44c8d1bd

    xor-int/2addr v4, v5

    const v5, 0x80ff45e

    goto/16 :goto_0

    .line 67
    :sswitch_e
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v3, :cond_7

    goto :goto_4

    :cond_7
    const-string v3, "\u06da\u1a75"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x509d

    const v5, -0x3559b80d    # -5448697.5f

    xor-int/2addr v4, v5

    const v5, 0x43c8d5e4

    goto/16 :goto_0

    .line 84
    :sswitch_f
    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v3, :cond_8

    :goto_3
    const-string v3, "\u073f\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2125

    const v5, 0x15ab7fba

    xor-int/2addr v4, v5

    const v5, 0x58c9becf

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e1\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0xd

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4e6d

    const v5, 0xd896596

    xor-int/2addr v4, v5

    const v5, -0x60db46e

    goto/16 :goto_0

    :sswitch_10
    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v3, :cond_9

    goto :goto_5

    :cond_9
    const-string v3, "\u06eb\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x315

    const v5, -0x5839e1c2

    xor-int/2addr v4, v5

    const v5, 0x230e3719

    goto/16 :goto_0

    .line 40
    :sswitch_11
    sget v3, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v3, :cond_a

    :goto_4
    const-string v3, "\u073a\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7f0d

    const v5, 0x6ed4c48f

    xor-int/2addr v4, v5

    const v5, 0x5456373c

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a79\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x75

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3913

    const v5, 0x5ad3ee0b

    xor-int/2addr v4, v5

    const v5, 0x5fb34d99

    goto/16 :goto_0

    :sswitch_12
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v3

    if-gtz v3, :cond_b

    goto :goto_6

    :cond_b
    const-string v3, "\u1a79\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x52ed

    const v5, -0x3e821551

    xor-int/2addr v4, v5

    const v5, -0x799a5fdf

    goto/16 :goto_0

    .line 8
    :sswitch_13
    sget v3, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v3, :cond_d

    :cond_c
    :goto_5
    const-string v3, "\u06eb\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2ae3

    const v5, 0x70a7a246

    xor-int/2addr v4, v5

    const v5, -0x13eace0b

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u05a1\u06e2"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x65

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6b3

    const v5, -0x730690c9

    xor-int/2addr v4, v5

    const v5, 0x5cc549be

    goto/16 :goto_0

    .line 131
    :sswitch_14
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v3

    if-gtz v3, :cond_f

    :cond_e
    :goto_6
    const-string v3, "\u06da\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x78c1

    const v5, 0x20327403

    xor-int/2addr v4, v5

    const v5, -0x3549bc84    # -5972414.0f

    goto/16 :goto_0

    :cond_f
    const-string v3, "\u06d7\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x316d

    const v5, -0x70cdce52

    xor-int/2addr v4, v5

    const v5, 0x846934a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ff24cbf -> :sswitch_11
        -0x71668201 -> :sswitch_e
        -0x63242d0b -> :sswitch_6
        -0x6138d8b1 -> :sswitch_d
        -0x536d642f -> :sswitch_c
        -0x30aced15 -> :sswitch_1
        -0x24790b0f -> :sswitch_7
        -0x222fcfed -> :sswitch_8
        -0x2073bd99 -> :sswitch_2
        -0x1967aaf9 -> :sswitch_4
        -0x174d9904 -> :sswitch_e
        -0x16445833 -> :sswitch_1
        -0x14175efe -> :sswitch_4
        -0xe1ffa83 -> :sswitch_c
        -0x8e6b90e -> :sswitch_10
        -0x855933a -> :sswitch_13
        -0x1bda0bf -> :sswitch_0
        0x2259c78 -> :sswitch_10
        0x9b7713e -> :sswitch_12
        0x1501a198 -> :sswitch_d
        0x271711cc -> :sswitch_3
        0x2761dd4c -> :sswitch_a
        0x2c4360c2 -> :sswitch_9
        0x32d3f4f2 -> :sswitch_b
        0x369c57a7 -> :sswitch_8
        0x388b4574 -> :sswitch_9
        0x3c3e2000 -> :sswitch_6
        0x3e072e83 -> :sswitch_5
        0x3f599736 -> :sswitch_14
        0x47184f81 -> :sswitch_b
        0x480396af -> :sswitch_f
        0x4dd56420 -> :sswitch_2
        0x51fdb351 -> :sswitch_5
        0x58286d02 -> :sswitch_14
        0x5e8fd2ab -> :sswitch_13
        0x60ecc498 -> :sswitch_3
        0x62384cb5 -> :sswitch_12
        0x63d50677 -> :sswitch_a
        0x66257fed -> :sswitch_7
        0x6bc71252 -> :sswitch_11
        0x75c770ef -> :sswitch_f
        0x7f898d15 -> :sswitch_0
    .end sparse-switch
.end method

.method public static ֫(Landroid/content/Context;)V
    .locals 0

    .line 125
    invoke-static {p0}, Ll/ۧ᩹᩷;->ۧ(Landroid/content/Context;)V

    .line 126
    invoke-static {}, Ll/᩵ۛ᩻;->ۢ()V

    return-void
.end method

.method public static ֫(Ll/᩶ۡ᩷;)V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0xc4c0cbc

    sget v3, Ll/ۙۨ;->ۡۗۙ:I

    sget v4, Ll/֡᩶;->ܳܶ۠:I

    const-string v5, "\u05a1\u06d9"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x33dd

    const v7, 0x56dbbe48

    xor-int/2addr v6, v7

    const v7, -0x72d46e97

    :goto_0
    xor-int/2addr v5, v7

    move-object v7, v0

    :goto_1
    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0x107b

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    goto/16 :goto_3

    .line 25
    :sswitch_0
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v5

    if-nez v5, :cond_a

    goto/16 :goto_4

    :sswitch_1
    sget v5, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v5, :cond_8

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    sget v5, Ll/֨ۤ;->ܿۖ᩵:I

    if-gez v5, :cond_4

    goto/16 :goto_3

    .line 81
    :sswitch_3
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    return-void

    .line 93
    :sswitch_4
    invoke-static {p0, v1}, Ll/ۢۤۡ;->֫(Landroid/content/ContextWrapper;Ljava/lang/String;)V

    .line 79
    invoke-static {p0}, Ll/ۢۤۡ;->֫(Landroid/content/ContextWrapper;)V

    return-void

    :sswitch_5
    const/4 v1, 0x0

    .line 9
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v5

    if-gtz v5, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v5, "\u06ec\u1a73"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x31bf

    const v8, 0x143b640c

    xor-int/2addr v6, v8

    const v8, -0x6a4a2a1e

    goto/16 :goto_6

    .line 75
    :sswitch_6
    invoke-static {v7}, Ll/᩹֡᩷;->֫(Ll/ᩴۡ᩷;)V

    .line 77
    invoke-static {p0}, Ll/ۧ᩹᩷;->ۧ(Landroid/content/Context;)V

    sget v5, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v5, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v5, "\u0736\u06df"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x55

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5667

    const v8, -0x236e689c

    xor-int/2addr v6, v8

    const v8, 0x4a8b3ebb    # 4562781.5f

    goto/16 :goto_6

    .line 75
    :sswitch_7
    new-instance v7, Ll/ᩴۡ᩷;

    .line 59
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v5

    if-gtz v5, :cond_2

    goto/16 :goto_5

    :cond_2
    const/4 v5, 0x3

    .line 75
    invoke-direct {v7, v5}, Ll/ᩴۡ᩷;-><init>(I)V

    .line 74
    sget v5, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v5, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v5, "\u0733\u1a73"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7791

    const v8, -0x15722561

    xor-int/2addr v6, v8

    const v8, 0x76198f7e

    goto/16 :goto_6

    :sswitch_8
    invoke-static {}, Ll/᩹֡᩷;->ܽ()V

    .line 13
    sget v5, Ll/᩺;->ۙۛܶ:I

    if-gtz v5, :cond_5

    :cond_4
    :goto_2
    const-string v5, "\u06e0\u1a7b"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5e2b

    const v8, -0xf4c625c

    xor-int/2addr v6, v8

    const v8, 0x7ca16874

    goto/16 :goto_6

    :cond_5
    const-string v5, "\u06df\u06d8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5603

    const v8, 0x1e97479a

    xor-int/2addr v6, v8

    const v8, -0x2a490cc3

    goto/16 :goto_6

    :sswitch_9
    sget-boolean v5, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v5, :cond_6

    goto :goto_3

    :cond_6
    const-string v5, "\u1a77\u06d9"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x65

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x2ebd

    const v8, 0x7c5294f8

    xor-int/2addr v6, v8

    const v8, 0x1ae943a2

    goto/16 :goto_6

    :sswitch_a
    sget v5, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v5, :cond_7

    :goto_3
    const-string v5, "\u06df\u073f"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4f2b

    const v8, 0x7e7f984a

    xor-int/2addr v6, v8

    const v8, 0x7e58414a

    goto/16 :goto_6

    :cond_7
    const-string v5, "\u1a7a\u06dc"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x31ed

    const v8, 0x65e03567

    xor-int/2addr v6, v8

    const v8, -0x716b1a91

    goto/16 :goto_6

    .line 40
    :sswitch_b
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v5

    if-eqz v5, :cond_9

    :cond_8
    :goto_4
    const-string v5, "\u05a1\u0736"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4cf5

    const v8, -0x575ceee9

    xor-int/2addr v6, v8

    const v8, -0xd27ae73

    goto :goto_6

    :cond_9
    const-string v5, "\u06e1\u1a7b"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x31

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x72cf

    const v8, -0x2654a4e9

    xor-int/2addr v6, v8

    const v8, 0x1d94d82a

    goto :goto_6

    .line 70
    :sswitch_c
    sget v5, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v5, :cond_b

    :cond_a
    const-string v5, "\u05a1\u06da"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6df7

    const v8, 0xfed7781

    xor-int/2addr v6, v8

    const v8, -0x455f9e6f

    goto :goto_6

    :cond_b
    const-string v5, "\u0736\u06dc"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x51

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x180d

    const v8, -0x18f75515

    xor-int/2addr v6, v8

    const v8, -0x6ad0a203

    goto :goto_6

    .line 73
    :sswitch_d
    invoke-static {}, Ll/ۢۤۡ;->ᩳ()V

    .line 36
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v5

    if-eqz v5, :cond_c

    :goto_5
    const-string v5, "\u0733\u1a79"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x17

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3be7

    const v7, 0x300c0230

    xor-int/2addr v6, v7

    const v7, 0x5e0cca3e

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06dc\u1a77"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4f77

    const v8, 0x1ce60a8d

    xor-int/2addr v6, v8

    const v8, -0x2e30f122

    :goto_6
    xor-int/2addr v5, v8

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7480f17d -> :sswitch_c
        -0x66bae75d -> :sswitch_7
        -0x57d3fff3 -> :sswitch_9
        -0x546f050f -> :sswitch_d
        -0x43b44fbb -> :sswitch_a
        -0x328ad05f -> :sswitch_5
        -0x30fa345d -> :sswitch_4
        -0x2b9cc508 -> :sswitch_2
        -0x2b6ac305 -> :sswitch_b
        -0x24fbbb18 -> :sswitch_0
        -0x1fefc472 -> :sswitch_1
        -0x17a3fe92 -> :sswitch_4
        -0xcf209dc -> :sswitch_7
        0x2c027bfa -> :sswitch_8
        0x2ca99998 -> :sswitch_6
        0x3a869eca -> :sswitch_8
        0x3b50160b -> :sswitch_c
        0x463b31e6 -> :sswitch_a
        0x492b81c8 -> :sswitch_0
        0x58e343ca -> :sswitch_3
        0x5d022e3e -> :sswitch_3
        0x5e848320 -> :sswitch_2
        0x63dd56e3 -> :sswitch_d
        0x6960b5a6 -> :sswitch_5
        0x6f42af50 -> :sswitch_b
        0x6f518dc6 -> :sswitch_9
        0x794d6a26 -> :sswitch_1
        0x7a924481 -> :sswitch_6
    .end sparse-switch
.end method

.method public static ۧ(Landroid/app/Activity;IZ)V
    .locals 6

    const v0, -0x20cb5534

    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    sget v2, Ll/ۖ;->᩹۟ۘ:I

    const-string v3, "\u06d9\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x33

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2121

    const v5, -0x6c11a384

    xor-int/2addr v4, v5

    const v5, -0x188130b2

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0xb6b

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 66
    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v3, :cond_6

    goto/16 :goto_4

    .line 47
    :sswitch_0
    sget-boolean v3, Ll/֡ۨ;->ܽܶۖ:Z

    if-eqz v3, :cond_7

    goto/16 :goto_1

    :sswitch_1
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result v3

    if-nez v3, :cond_b

    goto/16 :goto_3

    .line 116
    :sswitch_2
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v3

    if-nez v3, :cond_9

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    return-void

    .line 117
    :sswitch_5
    invoke-static {p0}, Ll/ۢۤۡ;->֫(Landroid/content/ContextWrapper;)V

    .line 118
    invoke-static {p0, p1, p2}, Ll/ۧ᩹᩷;->֫(Landroid/app/Activity;IZ)V

    return-void

    :sswitch_6
    sget-boolean v3, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v3, :cond_0

    const-string v3, "\u073d\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x34f5

    const v5, -0x4a60738a

    xor-int/2addr v4, v5

    const v5, 0x74864b40

    goto :goto_0

    :cond_0
    const-string v3, "\u0736\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0xf

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x708b

    const v5, -0x76a25a00

    xor-int/2addr v4, v5

    const v5, 0x14cca8f8

    goto :goto_0

    .line 115
    :sswitch_7
    sget v3, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06d6\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x79

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1fcf

    const v5, 0x229b75a9

    xor-int/2addr v4, v5

    const v5, -0x5334a673

    goto/16 :goto_0

    .line 36
    :sswitch_8
    sget-boolean v3, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u05ab\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x74c1

    const v5, -0x5ad131fd

    xor-int/2addr v4, v5

    const v5, -0x321ef5c4    # -4.7194304E8f

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v3

    if-ltz v3, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v3, "\u05a1\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6685

    const v5, 0x6125c02c

    xor-int/2addr v4, v5

    const v5, 0x62f2a093

    goto/16 :goto_0

    .line 7
    :sswitch_a
    sget v3, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v3, :cond_4

    :goto_1
    const-string v3, "\u073f\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7a6b

    const v5, 0x7e9b56e1

    xor-int/2addr v4, v5

    const v5, -0x7b7df267

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06d8\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x786d

    const v5, -0x1d6e5479

    xor-int/2addr v4, v5

    const v5, -0x6ae1e265

    goto/16 :goto_0

    .line 24
    :sswitch_b
    sget v3, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u05ab\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4a01

    const v5, -0x6f95ab45

    xor-int/2addr v4, v5

    const v5, 0x329f23d2

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06e1\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x52bf

    const v5, -0x70a2414

    xor-int/2addr v4, v5

    const v5, -0x1b9f65c7

    goto/16 :goto_0

    .line 21
    :sswitch_c
    sget v3, Ll/֡۬;->۠֡᩶:I

    if-gtz v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u06e7\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x19

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x732b

    const v5, 0x27ec6a45

    xor-int/2addr v4, v5

    const v5, -0x220f1f40

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u0733\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x6f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xe11

    const v5, -0x3d12890e

    xor-int/2addr v4, v5

    const v5, 0x39697ee5

    goto/16 :goto_0

    .line 108
    :sswitch_d
    sget-boolean v3, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u1a77\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xe31

    const v5, 0x5a7f61e6

    xor-int/2addr v4, v5

    const v5, -0xdd59024

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u0730\u0730"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x57

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x644d

    const v5, 0x48e5613

    xor-int/2addr v4, v5

    const v5, -0x5a690633

    goto/16 :goto_0

    .line 23
    :sswitch_e
    sget-boolean v3, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u0733\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xf39

    const v5, -0x7ee12953

    xor-int/2addr v4, v5

    const v5, -0x10b84da2

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a79\u05ab"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1555

    const v5, -0x186e688

    xor-int/2addr v4, v5

    const v5, 0x791dd0ff

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x724ef84d -> :sswitch_9
        -0x69ccea58 -> :sswitch_e
        -0x64d7d9f5 -> :sswitch_7
        -0x5b1f3123 -> :sswitch_3
        -0x5a5d726b -> :sswitch_4
        -0x52d4b99e -> :sswitch_e
        -0x522fdfa8 -> :sswitch_0
        -0x4d56234c -> :sswitch_b
        -0x445b661d -> :sswitch_8
        -0x40d57d9c -> :sswitch_c
        -0x3dba46d6 -> :sswitch_d
        -0x2a0afbf1 -> :sswitch_4
        -0x245c62f4 -> :sswitch_c
        -0x1c496e84 -> :sswitch_8
        -0x1113d8a -> :sswitch_5
        0x63c96b2 -> :sswitch_3
        0xcea28a0 -> :sswitch_2
        0x1693b34c -> :sswitch_6
        0x169d741b -> :sswitch_0
        0x1d7efccd -> :sswitch_b
        0x2b18d68b -> :sswitch_1
        0x2dc10563 -> :sswitch_6
        0x47d4bb4f -> :sswitch_a
        0x4c487f26 -> :sswitch_9
        0x4d424b22 -> :sswitch_2
        0x5a267727 -> :sswitch_7
        0x5b959622 -> :sswitch_1
        0x62d1d94e -> :sswitch_5
        0x64560fd4 -> :sswitch_a
        0x6ead6d57 -> :sswitch_d
    .end sparse-switch
.end method

.method public static ۧ(Landroid/content/Context;)V
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, 0x1b78de79

    sget v8, Ll/֫ܿ;->ۨ۫ᩳ:I

    sget v9, Ll/ۛ;->᩺᩻֫:I

    const-string v10, "\u1a78\u06e1"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x7d9b

    const v12, -0x7ea7ce7a

    xor-int/2addr v11, v12

    const v12, 0xdb7b2be

    :goto_0
    xor-int/2addr v10, v12

    move-object v12, v3

    :goto_1
    xor-int/2addr v7, v9

    mul-int/lit16 v7, v7, 0x13c3

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    sget v10, Ll/ۘܿ;->ۘܰ۫:I

    if-gez v10, :cond_d

    goto/16 :goto_7

    .line 53
    :sswitch_0
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    sget v10, Ll/֫ۧ;->ۙ۟ۧ:I

    if-lez v10, :cond_11

    goto :goto_2

    :sswitch_1
    sget v10, Ll/᩹;->ۤܿܳ:I

    if-nez v10, :cond_0

    goto/16 :goto_a

    :cond_0
    const-string v10, "\u05ab\u06e4"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x2739

    const v13, 0x4e37e70b    # 7.7134304E8f

    xor-int/2addr v11, v13

    const v13, -0x53e307d3

    goto/16 :goto_b

    .line 118
    :sswitch_2
    sget v10, Ll/ۘ᩻;->᩵ۜ֨:I

    if-lez v10, :cond_1

    goto :goto_2

    :cond_1
    const-string v10, "\u0733\u06e1"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x77

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x5965

    const v13, 0x3099bc10

    xor-int/2addr v11, v13

    const v13, 0x69401658

    goto/16 :goto_b

    .line 33
    :sswitch_3
    sget v10, Ll/ۛ;->᩺᩻֫:I

    if-ltz v10, :cond_2

    goto/16 :goto_3

    :cond_2
    :goto_2
    const-string v10, "\u05ab\u06d6"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, -0x67

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x2f3f

    const v13, 0x66930d79

    xor-int/2addr v11, v13

    const v13, 0x61c8b62a

    goto/16 :goto_b

    :sswitch_4
    sget v10, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-nez v10, :cond_13

    goto/16 :goto_5

    .line 79
    :sswitch_5
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v10

    if-ltz v10, :cond_8

    goto/16 :goto_7

    :sswitch_6
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    sget v10, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v10, :cond_4

    goto/16 :goto_7

    :sswitch_7
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    goto/16 :goto_7

    .line 6
    :sswitch_8
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    return-void

    .line 171
    :sswitch_9
    :try_start_0
    new-instance v10, Landroid/content/res/Configuration;

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v11

    invoke-direct {v10, v11}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    .line 172
    invoke-static {v10, v2}, Ll/᩹֡᩷;->֫(Landroid/content/res/Configuration;I)V

    .line 173
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v11

    invoke-virtual {v4, v10, v11}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_6

    :sswitch_a
    if-eqz v6, :cond_3

    goto/16 :goto_6

    :cond_3
    const-string v10, "\u073d\u073a"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x5b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x75b

    const v13, 0x48f8ff74    # 509947.62f

    xor-int/2addr v11, v13

    const v13, 0x32dc2b32

    goto/16 :goto_b

    .line 168
    :sswitch_b
    :try_start_1
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v10

    invoke-static {v10, v2}, Ll/᩹֡᩷;->ۧ(Landroid/content/res/Configuration;I)Z

    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v10, "\u1a79\u06e7"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x45

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x721

    const v13, -0x3c400157

    xor-int/2addr v11, v13

    const v13, 0x1c0f84a8

    goto/16 :goto_b

    :sswitch_c
    if-eq v4, v5, :cond_b

    const-string v10, "\u06dc\u1a77"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x4d81

    const v13, -0x5e3c95cd

    xor-int/2addr v11, v13

    const v13, -0x648e5f67

    goto/16 :goto_b

    .line 156
    :sswitch_d
    :try_start_2
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v4

    .line 157
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v10, "\u1a7b\u0730"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x45

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x4a97

    const v13, 0x6a1325a5

    xor-int/2addr v11, v13

    const v13, 0xd5224e8

    goto/16 :goto_b

    .line 172
    :sswitch_e
    invoke-static {v12, v2}, Ll/᩹֡᩷;->֫(Landroid/content/res/Configuration;I)V

    .line 173
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v10

    invoke-virtual {v0, v12, v10}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    goto :goto_4

    .line 171
    :sswitch_f
    new-instance v12, Landroid/content/res/Configuration;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v10

    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v11

    if-gtz v11, :cond_5

    :cond_4
    :goto_3
    const-string v10, "\u1a7a\u06dc"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x6b

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x6cc1

    const v12, -0x3766773

    xor-int/2addr v11, v12

    const v12, -0x5a043b05

    goto/16 :goto_0

    :cond_5
    invoke-direct {v12, v10}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v10

    if-eqz v10, :cond_6

    goto/16 :goto_8

    :cond_6
    const-string v10, "\u1a79\u06da"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x6d31

    const v13, 0x439c1241

    xor-int/2addr v11, v13

    const v13, 0x76caccbe

    goto/16 :goto_b

    :sswitch_10
    const/16 v2, -0x64

    .line 168
    invoke-static {v1, v2}, Ll/᩹֡᩷;->ۧ(Landroid/content/res/Configuration;I)Z

    move-result v10

    if-eqz v10, :cond_7

    :goto_4
    const-string v10, "\u06e2\u05a8"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x35

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0xbf7

    const v13, -0x467570c6

    xor-int/2addr v11, v13

    const v13, -0x68b4b80f

    goto/16 :goto_b

    :cond_7
    const-string v10, "\u1a78\u0736"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x2a29

    const v13, -0x741eb933

    xor-int/2addr v11, v13

    const v13, 0x6bd2ec64

    goto/16 :goto_b

    :sswitch_11
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    .line 86
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v10

    if-gtz v10, :cond_9

    :cond_8
    :goto_5
    const-string v10, "\u06d6\u1a7b"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x2379

    const v13, -0x2acb7a46

    xor-int/2addr v11, v13

    const v13, -0x49c7d204

    goto/16 :goto_b

    :cond_9
    const-string v10, "\u1a75\u06e1"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x46b5

    const v13, 0x7f175805

    xor-int/2addr v11, v13

    const v13, -0x234d20de

    goto/16 :goto_b

    .line 144
    :sswitch_12
    sget-object v0, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    .line 154
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v10, Ll/ۛ;->᩺᩻֫:I

    if-ltz v10, :cond_a

    goto/16 :goto_9

    :cond_a
    const-string v10, "\u1a73\u1a7a"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x3f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x38ab

    const v13, 0x3334db95

    xor-int/2addr v11, v13

    const v13, 0x16c350ad

    goto/16 :goto_b

    :sswitch_13
    return-void

    .line 144
    :sswitch_14
    sget-object v10, Ll/ۙ᩸᩷;->ܳ:Landroid/content/SharedPreferences;

    if-eqz v10, :cond_b

    const-string v10, "\u06ec\u0730"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x1fcb

    const v13, 0x4240979c

    xor-int/2addr v11, v13

    const v13, 0x10960c1f

    goto/16 :goto_b

    :catchall_0
    :cond_b
    :goto_6
    const-string v10, "\u073d\u1a74"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x3b

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0xf95

    const v13, -0x1462d760

    xor-int/2addr v11, v13

    const v13, -0x73f5fd1c

    goto/16 :goto_b

    .line 8
    :sswitch_15
    sget v10, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v10, :cond_c

    goto/16 :goto_8

    :cond_c
    const-string v10, "\u1a76\u06ec"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x4da3

    const v13, -0x604b67c

    xor-int/2addr v11, v13

    const v13, 0x31022032

    goto/16 :goto_b

    :sswitch_16
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v10

    if-eqz v10, :cond_e

    :cond_d
    const-string v10, "\u06d6\u06d6"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x51

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6693

    const v13, 0x70bd5596

    xor-int/2addr v11, v13

    const v13, 0x17322295

    goto/16 :goto_b

    :cond_e
    const-string v10, "\u0730\u05a1"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x4b

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x1c8d

    const v13, -0x304affaa

    xor-int/2addr v11, v13

    const v13, -0x2277015a

    goto/16 :goto_b

    :sswitch_17
    sget v10, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v10, :cond_f

    :goto_7
    const-string v10, "\u06d6\u06e2"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x1f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x1a3b

    const v13, 0x5d71ea0b

    xor-int/2addr v11, v13

    const v13, -0x538280a4

    goto/16 :goto_b

    :cond_f
    const-string v10, "\u06db\u06e4"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x46bf

    const v13, 0x5eed72cc

    xor-int/2addr v11, v13

    const v13, 0x7fa9faa2

    goto/16 :goto_b

    .line 96
    :sswitch_18
    sget-boolean v10, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v10, :cond_10

    :goto_8
    const-string v10, "\u05ab\u1a74"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x63

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x686f

    const v13, -0x59173e2f

    xor-int/2addr v11, v13

    const v13, -0x66acb90a

    goto :goto_b

    :cond_10
    const-string v10, "\u1a77\u06e4"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x1c87

    const v13, -0x25a00933

    xor-int/2addr v11, v13

    const v13, -0x54b5bbd9

    goto :goto_b

    :sswitch_19
    sget v10, Ll/۟;->ۗۤۛ:I

    if-eqz v10, :cond_12

    :cond_11
    :goto_9
    const-string v10, "\u1a76\u0733"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x1f

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x7037

    const v13, -0x156c2723

    xor-int/2addr v11, v13

    const v13, -0x61ee9698

    goto :goto_b

    :cond_12
    const-string v10, "\u1a7b\u1a77"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0x13

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x3d65

    const v13, 0x13d01c8

    xor-int/2addr v11, v13

    const v13, -0x47de4d7b

    goto :goto_b

    .line 151
    :sswitch_1a
    sget v10, Ll/᩹֡᩷;->ᩴ֫:I

    .line 112
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v10

    if-gtz v10, :cond_14

    :cond_13
    :goto_a
    const-string v10, "\u05ab\u06e7"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x13bd

    const v13, -0x37320497

    xor-int/2addr v11, v13

    const v13, -0x6d5b663e

    goto :goto_b

    :cond_14
    const-string v10, "\u06df\u1a74"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x7f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x5267

    const v13, 0x59ddf89f

    xor-int/2addr v11, v13

    const v13, 0x544c0365

    :goto_b
    xor-int/2addr v10, v13

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x79190873 -> :sswitch_f
        -0x78b06832 -> :sswitch_f
        -0x77cc63ce -> :sswitch_1
        -0x776dbfe7 -> :sswitch_10
        -0x763bb4b8 -> :sswitch_7
        -0x71671315 -> :sswitch_1a
        -0x6d61fe64 -> :sswitch_16
        -0x645c2ee7 -> :sswitch_16
        -0x62724777 -> :sswitch_14
        -0x6036f88a -> :sswitch_9
        -0x5e64da3e -> :sswitch_c
        -0x4fe4dde3 -> :sswitch_b
        -0x4eade6d0 -> :sswitch_8
        -0x49244d63 -> :sswitch_11
        -0x465fc199 -> :sswitch_2
        -0x406fb185 -> :sswitch_15
        -0x39787497 -> :sswitch_5
        -0x338a9ad2 -> :sswitch_a
        -0x2eee9e86 -> :sswitch_18
        -0x2df8280c -> :sswitch_5
        -0x2377f8ce -> :sswitch_18
        -0x14b739a8 -> :sswitch_e
        -0x14476be7 -> :sswitch_13
        -0x126b6d35 -> :sswitch_19
        -0x112c273a -> :sswitch_4
        -0x25e0e74 -> :sswitch_12
        -0x170e201 -> :sswitch_3
        -0x9524a3 -> :sswitch_17
        0x1029159c -> :sswitch_0
        0x115b912b -> :sswitch_17
        0x168450a7 -> :sswitch_19
        0x17855522 -> :sswitch_13
        0x17870aa4 -> :sswitch_4
        0x22ea5308 -> :sswitch_e
        0x24fc9c9c -> :sswitch_d
        0x34e052d7 -> :sswitch_6
        0x3cd3a21d -> :sswitch_9
        0x412b6ee3 -> :sswitch_2
        0x42a46b3e -> :sswitch_0
        0x448d1921 -> :sswitch_7
        0x4f4c4edb -> :sswitch_a
        0x545b38b8 -> :sswitch_10
        0x56e41d22 -> :sswitch_c
        0x59972de0 -> :sswitch_1a
        0x5b0fe3ce -> :sswitch_6
        0x5d217678 -> :sswitch_15
        0x5fc1d594 -> :sswitch_1
        0x60f9d85b -> :sswitch_11
        0x63cee0c7 -> :sswitch_8
        0x6522bf33 -> :sswitch_14
        0x7423bfca -> :sswitch_d
        0x7523de27 -> :sswitch_3
        0x76466fd5 -> :sswitch_b
        0x79e368e4 -> :sswitch_12
    .end sparse-switch
.end method

.method public static ܽ(Landroid/app/Activity;IZ)V
    .locals 6

    const v0, 0x19ec5e24

    sget v1, Ll/֫ܽ;->ۚ᩷᩹:I

    sget v2, Ll/ۗ᩺;->ۡ᩺֡:I

    const-string v3, "\u05a8\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x35

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7df1

    const v5, -0x1bd485c6

    xor-int/2addr v4, v5

    const v5, -0x2072b992

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x6ca7

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 99
    invoke-static {p0}, Ll/ۢۤۡ;->֫(Landroid/content/ContextWrapper;)V

    .line 100
    invoke-static {p0, p1, p2}, Ll/ۧ᩹᩷;->֫(Landroid/app/Activity;IZ)V

    return-void

    .line 22
    :sswitch_0
    sget-boolean v3, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v3, :cond_2

    goto/16 :goto_2

    .line 79
    :sswitch_1
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget v3, Ll/۟;->ۗۤۛ:I

    if-nez v3, :cond_8

    goto/16 :goto_4

    .line 36
    :sswitch_2
    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_b

    goto/16 :goto_2

    .line 66
    :sswitch_3
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    goto/16 :goto_2

    .line 87
    :sswitch_4
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    return-void

    .line 79
    :sswitch_5
    sget v3, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v3, :cond_0

    const-string v3, "\u073f\u05ab"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x6f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x314d

    const v5, -0x3c6ef2dd

    xor-int/2addr v4, v5

    const v5, 0x19a9f31a

    goto :goto_0

    :cond_0
    const-string v3, "\u05a1\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4261

    const v5, 0x467b4cb4

    xor-int/2addr v4, v5

    const v5, 0x7b7618d7

    goto :goto_0

    .line 1
    :sswitch_6
    sget v3, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u0736\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x51

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x493f

    const v5, 0x7d1b7fba

    xor-int/2addr v4, v5

    const v5, -0x17c6b35c

    goto :goto_0

    .line 25
    :sswitch_7
    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_3

    :cond_2
    :goto_1
    const-string v3, "\u1a76\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2d77

    const v5, -0x420d68e

    xor-int/2addr v4, v5

    const v5, -0x5370eaf8

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06db\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x853

    const v5, -0x5ec51640

    xor-int/2addr v4, v5

    const v5, -0x1ec70540

    goto/16 :goto_0

    .line 61
    :sswitch_8
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u073a\u1a73"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x65df

    const v5, 0x5f3ef532

    xor-int/2addr v4, v5

    const v5, 0x6b9fb6f4

    goto/16 :goto_0

    .line 10
    :sswitch_9
    sget v3, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u06e8\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5bbf

    const v5, -0xba11163    # -7.0649997E31f

    xor-int/2addr v4, v5

    const v5, -0x1d801f9c

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u073a\u05a8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1163

    const v5, -0xb30aa6a

    xor-int/2addr v4, v5

    const v5, -0x74015941

    goto/16 :goto_0

    .line 88
    :sswitch_b
    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-nez v3, :cond_7

    :goto_2
    const-string v3, "\u0733\u06e7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x120b

    const v5, -0x7c20de4a

    xor-int/2addr v4, v5

    const v5, 0x712d196b

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06eb\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2e3b

    const v5, -0x6da0b074

    xor-int/2addr v4, v5

    const v5, -0x2df8517a

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/֨۟;->᩹֫᩷:I

    if-eqz v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u06eb\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x29ff

    const v5, -0x2b02bb7d

    xor-int/2addr v4, v5

    const v5, -0x69621ce3

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a7b\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x57

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x231

    const v5, 0x73a25d93

    xor-int/2addr v4, v5

    const v5, -0x4774d398

    goto/16 :goto_0

    .line 19
    :sswitch_d
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v3

    if-ltz v3, :cond_a

    goto :goto_4

    :cond_a
    const-string v3, "\u0733\u06e4"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x69b5

    const v5, 0x4d2ac676

    xor-int/2addr v4, v5

    const v5, 0x7a3f30a2

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v3, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u0736\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x36f9

    const v5, 0x298621b4

    xor-int/2addr v4, v5

    const v5, 0x299c16db

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073a\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2f3d

    const v5, -0x25f56d96

    xor-int/2addr v4, v5

    const v5, 0x2228c134

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e712a8d -> :sswitch_8
        -0x7d6d8738 -> :sswitch_1
        -0x7bb221ce -> :sswitch_7
        -0x78b37219 -> :sswitch_4
        -0x736c1f48 -> :sswitch_d
        -0x54792507 -> :sswitch_c
        -0x4e0ec565 -> :sswitch_9
        -0x4c856d29 -> :sswitch_5
        -0x4c5ca776 -> :sswitch_5
        -0x4c340707 -> :sswitch_d
        -0x43d9e2e3 -> :sswitch_3
        -0x369d68ef -> :sswitch_a
        -0x1f31dfab -> :sswitch_4
        -0x13273e33 -> :sswitch_b
        -0x8a3df87 -> :sswitch_7
        -0x88e75c8 -> :sswitch_0
        -0x13c3304 -> :sswitch_b
        0x77eccd9 -> :sswitch_2
        0x953c772 -> :sswitch_a
        0x1864d23d -> :sswitch_3
        0x1e422e7f -> :sswitch_1
        0x21451f7e -> :sswitch_e
        0x4b07fd84 -> :sswitch_e
        0x5a474f5b -> :sswitch_9
        0x5af8a028 -> :sswitch_2
        0x64a70083 -> :sswitch_0
        0x66e0c294 -> :sswitch_c
        0x70dbfe2e -> :sswitch_6
        0x739ce24e -> :sswitch_8
        0x7c94fac2 -> :sswitch_6
    .end sparse-switch
.end method
