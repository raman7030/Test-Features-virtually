.class public final synthetic Ll/۫ۚۡ;
.super Ljava/lang/Object;
.source "H1R6"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:Ll/ۛۚۡ;


# direct methods
.method public synthetic constructor <init>(Ll/ۛۚۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۚۡ;->᩸:Ll/ۛۚۡ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x1890d3cc

    sget v2, Ll/ۖ۫;->ۖ֫ܿ:I

    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    const-string v4, "\u06d8\u1a77"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x4d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x203b

    const v6, -0x5ea36a51

    xor-int/2addr v5, v6

    const v6, 0x3aa93fc4

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x2dbf

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    return-void

    .line 665
    :sswitch_0
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v4

    if-nez v4, :cond_8

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    sget v4, Ll/۟;->ۗۤۛ:I

    if-eqz v4, :cond_c

    goto/16 :goto_2

    .line 431
    :sswitch_2
    sget v4, Ll/֫ܽ;->ۚ᩷᩹:I

    if-gez v4, :cond_a

    goto/16 :goto_1

    .line 391
    :sswitch_3
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    return-void

    .line 934
    :sswitch_5
    new-instance v4, Ll/᩶ۚۡ;

    iget-object v5, p0, Ll/۫ۚۡ;->᩸:Ll/ۛۚۡ;

    .line 868
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v6

    if-nez v6, :cond_0

    goto/16 :goto_2

    .line 934
    :cond_0
    invoke-direct {v4, v5, v0}, Ll/᩶ۚۡ;-><init>(Ll/ۛۚۡ;Ll/᩷᩵ۡ;)V

    .line 965
    invoke-static {v4}, Ll/֨۟;->ۤۘܺ(Ljava/lang/Object;)V

    return-void

    .line 914
    :sswitch_6
    invoke-static {v0}, Ll/֡᩺;->ۛۜܺ(Ljava/lang/Object;)V

    sget v4, Ll/ۛۚۡ;->ۢۧ:I

    .line 933
    iget-boolean v4, v0, Ll/᩷᩵ۡ;->֫:Z

    if-eqz v4, :cond_1

    const-string v4, "\u073f\u073a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x41

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5ac9

    const v6, 0x1e4d76bb

    xor-int/2addr v5, v6

    const v6, -0x4faab508

    goto :goto_0

    :cond_1
    const-string v4, "\u06e2\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x57

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xe39

    const v6, -0xcb9054d

    xor-int/2addr v5, v6

    const v6, -0x57698d64

    goto :goto_0

    .line 2
    :sswitch_7
    move-object v0, p1

    check-cast v0, Ll/᩷᩵ۡ;

    .line 22
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v4

    if-eqz v4, :cond_2

    const-string v4, "\u06e2\u06eb"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6383

    const v6, 0x7eeeff5d

    xor-int/2addr v5, v6

    const v6, 0x3745e145

    goto/16 :goto_0

    :cond_2
    const-string v4, "\u073d\u073f"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x11

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4a4b

    const v6, -0x4b2b2772

    xor-int/2addr v5, v6

    const v6, 0x6d472482

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v4, "\u1a73\u06da"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x423f

    const v6, 0x22d5ed9b

    xor-int/2addr v5, v6

    const v6, -0x4c118a5b

    goto/16 :goto_0

    .line 692
    :sswitch_9
    sget v4, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v4, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v4, "\u1a76\u1a7a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x49

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4523

    const v6, 0x753a0e99

    xor-int/2addr v5, v6

    const v6, -0x29fb0fb6

    goto/16 :goto_0

    .line 551
    :sswitch_a
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v4

    if-nez v4, :cond_5

    :goto_1
    const-string v4, "\u06d7\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x53

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x272b

    const v6, -0x25d5c546

    xor-int/2addr v5, v6

    const v6, 0x4b559600    # 1.3997568E7f

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06ec\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1c69

    const v6, 0x614e2919

    xor-int/2addr v5, v6

    const v6, -0x3142fde9

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v4, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v4, :cond_6

    goto :goto_2

    :cond_6
    const-string v4, "\u1a7b\u05a8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x45b5

    const v6, -0x27452ad8

    xor-int/2addr v5, v6

    const v6, 0x19e9dc57

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v4, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v4, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v4, "\u06d9\u06e1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x67

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x63ad

    const v6, 0x1f97cddb

    xor-int/2addr v5, v6

    const v6, 0x6cc23ba8

    goto/16 :goto_0

    :sswitch_d
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-eqz v4, :cond_9

    :cond_8
    const-string v4, "\u1a78\u0730"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x69

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x686f

    const v6, -0x19492a1

    xor-int/2addr v5, v6

    const v6, 0x2d4642a7

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a7a\u06e0"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x21

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x24af

    const v6, -0x563f3800

    xor-int/2addr v5, v6

    const v6, -0x4503370f

    goto/16 :goto_0

    .line 278
    :sswitch_e
    sget v4, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v4, :cond_b

    :cond_a
    :goto_2
    const-string v4, "\u06ec\u06eb"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x1f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x14c9

    const v6, 0x5b0c30e7

    xor-int/2addr v5, v6

    const v6, 0x33aad815

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06df\u1a76"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x33

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x17e7

    const v6, -0x6626d195

    xor-int/2addr v5, v6

    const v6, 0x11f15215

    goto/16 :goto_0

    .line 94
    :sswitch_f
    sget v4, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v4, :cond_d

    :cond_c
    :goto_3
    const-string v4, "\u06ec\u0733"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x25

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5d69

    const v6, -0x5159adfb

    xor-int/2addr v5, v6

    const v6, -0x69276667

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u06eb\u0736"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x61a1

    const v6, 0x4a6eb82c    # 3911179.0f

    xor-int/2addr v5, v6

    const v6, -0xb1c6851

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7feee68b -> :sswitch_a
        -0x74379fb6 -> :sswitch_d
        -0x72b117bc -> :sswitch_4
        -0x6de261cd -> :sswitch_a
        -0x6aafea4d -> :sswitch_1
        -0x51413d5d -> :sswitch_0
        -0x43c1ed4c -> :sswitch_b
        -0x430a96c3 -> :sswitch_d
        -0x3a7138d3 -> :sswitch_f
        -0x3a308688 -> :sswitch_2
        -0x28ab6469 -> :sswitch_2
        -0x27d3f655 -> :sswitch_c
        -0x4c1af46 -> :sswitch_8
        0x714df2d -> :sswitch_3
        0xa2d7380 -> :sswitch_5
        0x22a9a1f9 -> :sswitch_9
        0x23dcb6b3 -> :sswitch_5
        0x248c4820 -> :sswitch_3
        0x29a359f9 -> :sswitch_1
        0x2a16b0cd -> :sswitch_7
        0x2ccc69cc -> :sswitch_e
        0x3e056f66 -> :sswitch_b
        0x45191735 -> :sswitch_9
        0x48d3e492 -> :sswitch_7
        0x5094b014 -> :sswitch_0
        0x514c3fa0 -> :sswitch_f
        0x54ebbc5f -> :sswitch_6
        0x58c69e75 -> :sswitch_4
        0x5b20fade -> :sswitch_8
        0x63ed8dd8 -> :sswitch_c
        0x6f8856f2 -> :sswitch_6
        0x7f478250 -> :sswitch_e
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
