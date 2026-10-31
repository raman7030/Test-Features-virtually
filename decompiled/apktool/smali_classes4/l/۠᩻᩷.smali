.class public final Ll/۠᩻᩷;
.super Ll/ܶ᩻᩷;
.source "K3YT"


# instance fields
.field public final ֫:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 0

    .line 358
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 379
    iput-object p1, p0, Ll/۠᩻᩷;->֫:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 6

    const v0, -0x440068b5    # -0.007800018f

    sget v1, Ll/ۛ;->᩺᩻֫:I

    sget v2, Ll/֡᩶;->ܳܶ۠:I

    const-string v3, "\u1a77\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x35

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x176f

    const v5, -0x5042b90b

    xor-int/2addr v4, v5

    const v5, -0x6f4045cd

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x4df9

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 213
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    const/4 p1, 0x0

    return-object p1

    .line 203
    :sswitch_0
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v3

    if-gez v3, :cond_b

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    sget v3, Ll/֫᩹;->᩶ۘۘ:I

    if-nez v3, :cond_0

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_1

    .line 292
    :sswitch_3
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    :goto_1
    const-string v3, "\u1a77\u06e7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x6f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1279

    const v5, -0x1fbe64b4

    xor-int/2addr v4, v5

    const v5, 0xbe02780

    goto :goto_0

    .line 384
    :sswitch_4
    new-instance v3, Ljava/io/File;

    sget-boolean v4, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v4, :cond_1

    :cond_0
    const-string v3, "\u06e1\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2cd9

    const v5, -0x1d0c599d

    xor-int/2addr v4, v5

    const v5, 0x4d3ef368    # 2.00226432E8f

    goto :goto_0

    :cond_1
    iget-object v4, p0, Ll/۠᩻᩷;->֫:Ljava/io/File;

    .line 39
    sget v5, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v5, :cond_2

    goto/16 :goto_3

    .line 384
    :cond_2
    invoke-direct {v3, v4, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 385
    new-instance p1, Ljava/io/FileInputStream;

    invoke-direct {p1, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    return-object p1

    .line 289
    :sswitch_5
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u06d8\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x10cb

    const v5, 0x433c7d10

    xor-int/2addr v4, v5

    const v5, -0x523c8230

    goto/16 :goto_0

    .line 374
    :sswitch_6
    sget-boolean v3, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v3, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v3, "\u073f\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5cf1

    const v5, 0x4a888f5e    # 4474799.0f

    xor-int/2addr v4, v5

    const v5, 0x171ffed9

    goto/16 :goto_0

    .line 225
    :sswitch_7
    sget v3, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u0736\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5895

    const v5, -0x49dfd27f

    xor-int/2addr v4, v5

    const v5, -0x1d6e72bf

    goto/16 :goto_0

    .line 18
    :sswitch_8
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u0736\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x49fd

    const v5, 0x305f2db7

    xor-int/2addr v4, v5

    const v5, -0x1f203d0f

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v3

    if-gtz v3, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u06df\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1ff

    const v5, -0x4e4a812b

    xor-int/2addr v4, v5

    const v5, -0x44ec333d

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06d7\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2aa9

    const v5, 0x4bf90e9e    # 3.2644412E7f

    xor-int/2addr v4, v5

    const v5, -0x39fe7538

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u1a76\u1a76"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3285

    const v5, -0x259a43ae

    xor-int/2addr v4, v5

    const v5, -0x5bcffa75

    goto/16 :goto_0

    .line 354
    :sswitch_b
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_a

    :goto_3
    const-string v3, "\u1a78\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x43

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x745f

    const v5, -0x1a82f8ff

    xor-int/2addr v4, v5

    const v5, 0x322008df

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u05a1\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x7

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x78af

    const v5, -0x41f7de0

    xor-int/2addr v4, v5

    const v5, 0x791f2173

    goto/16 :goto_0

    .line 250
    :sswitch_c
    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06e7\u05ab"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x33db

    const v5, -0x3ffaf6d1

    xor-int/2addr v4, v5

    const v5, 0x4a836494    # 4305482.0f

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u05ab\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6f5f

    const v5, -0x9af1018

    xor-int/2addr v4, v5

    const v5, 0x32b831b7

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x788e9c03 -> :sswitch_7
        -0x749aaeb6 -> :sswitch_c
        -0x6d7b0705 -> :sswitch_a
        -0x596d27e4 -> :sswitch_8
        -0x387e6812 -> :sswitch_c
        -0x36e4db40 -> :sswitch_4
        -0x3613b0cc -> :sswitch_b
        -0x348d84f8 -> :sswitch_2
        -0x2a288459 -> :sswitch_5
        -0x1e5c0045 -> :sswitch_3
        -0xc873320 -> :sswitch_8
        -0x8b987a5 -> :sswitch_7
        -0x689cbbf -> :sswitch_3
        -0x59a35da -> :sswitch_a
        -0x17c5bf3 -> :sswitch_9
        0x1906fcc -> :sswitch_6
        0xfa64b76 -> :sswitch_6
        0x10335076 -> :sswitch_1
        0x1dd45bca -> :sswitch_9
        0x2466083a -> :sswitch_0
        0x39989c8e -> :sswitch_1
        0x4adc39b8 -> :sswitch_0
        0x5b42bc70 -> :sswitch_b
        0x65d3d5a1 -> :sswitch_2
        0x6fa53c9e -> :sswitch_5
        0x7db5501e -> :sswitch_4
    .end sparse-switch
.end method
