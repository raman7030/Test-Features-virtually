.class public final Ll/۬ۢ᩷;
.super Ll/ܳ᩶۠;
.source "P418"


# static fields
.field private static final ᩹ۗᩳ:[S


# instance fields
.field public final ܽ:Ljava/lang/CharSequence;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xb

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/۬ۢ᩷;->᩹ۗᩳ:[S

    return-void

    :array_0
    .array-data 2
        0x932s
        -0x7a4ds
        -0x7a18s
        -0x7a07s
        -0x7a11s
        -0x7a18s
        -0x7a4es
        -0x7a0as
        -0x7a03s
        -0x7a16s
        -0x7a03s
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 7

    const v0, 0x2d70b08d

    sget v1, Ll/ۘۘ;->᩷ۙ᩸:I

    sget v2, Ll/֫ۧ;->ۙ۟ۧ:I

    sget-object v3, Ll/۬ۢ᩷;->᩹ۗᩳ:[S

    const/4 v4, 0x0

    aget-short v3, v3, v4

    add-int/lit16 v4, v3, 0x2816

    mul-int v4, v4, v4

    const v5, 0xa058

    mul-int v3, v3, v5

    sub-int/2addr v3, v4

    if-gtz v3, :cond_0

    const v3, 0x859c

    goto :goto_0

    :cond_0
    const/16 v3, 0x558c

    :goto_0
    sget-object v4, Ll/۬ۢ᩷;->᩹ۗᩳ:[S

    const/4 v5, 0x1

    const/16 v6, 0xa

    invoke-static {v4, v5, v6, v3}, Ll/ۘۨ;->ۖܿۤ([SIII)Ljava/lang/String;

    move-result-object v3

    .line 224
    invoke-static {v3}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v3

    sget-object v4, Ll/ܽ᩶۠;->۬:Ll/ܽ᩶۠;

    invoke-direct {p0, v3, v4}, Ll/ܳ᩶۠;-><init>(Ljava/net/URI;Ll/ܽ᩶۠;)V

    const-string v3, "\u1a73\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5b5d

    const v5, 0x5cd84b70

    xor-int/2addr v4, v5

    const v5, 0x6e11bc52

    :goto_1
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x21b9

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 76
    sget-boolean v3, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v3, :cond_5

    goto/16 :goto_2

    .line 38
    :sswitch_0
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v3

    if-lez v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u0733\u1a75"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3e45

    const v5, 0x4718b1d4

    xor-int/2addr v4, v5

    const v5, 0x6cc5e9c6

    goto :goto_1

    .line 191
    :sswitch_1
    sget v3, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-gez v3, :cond_6

    goto/16 :goto_4

    .line 212
    :sswitch_2
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    sget v3, Ll/ۘۛ;->ۖۚ֡:I

    if-lez v3, :cond_a

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    goto/16 :goto_4

    .line 177
    :sswitch_4
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    return-void

    .line 144
    :sswitch_6
    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v3, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v3, "\u1a73\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7475

    const v5, -0x7b709256

    xor-int/2addr v4, v5

    const v5, 0x54a32dea

    goto :goto_1

    .line 34
    :sswitch_7
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v3, "\u06e1\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x393b

    const v5, -0x479df26a

    xor-int/2addr v4, v5

    const v5, 0x6f6a46c3

    goto/16 :goto_1

    .line 65
    :sswitch_8
    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u073a\u073a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x63b3

    const v5, 0x7a1a9a76

    xor-int/2addr v4, v5

    const v5, 0x7b9774f

    goto/16 :goto_1

    :cond_5
    const-string v3, "\u06d8\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x127

    const v5, -0x55abafbe

    xor-int/2addr v4, v5

    const v5, 0x80f11d0

    goto/16 :goto_1

    :sswitch_9
    sget-boolean v3, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u06eb\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x41e1

    const v5, 0xc3b50fc

    xor-int/2addr v4, v5

    const v5, 0x1a268593

    goto/16 :goto_1

    :cond_7
    const-string v3, "\u1a76\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x793f

    const v5, 0x51c65424

    xor-int/2addr v4, v5

    const v5, 0x4d83e1ca

    goto/16 :goto_1

    :sswitch_a
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_8

    goto :goto_4

    :cond_8
    const-string v3, "\u1a75\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x50d7

    const v5, 0x4ca934d8    # 8.8712896E7f

    xor-int/2addr v4, v5

    const v5, 0x4d2ad8f6    # 1.79146592E8f

    goto/16 :goto_1

    .line 127
    :sswitch_b
    sget v3, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v3, :cond_9

    goto :goto_3

    :cond_9
    const-string v3, "\u06d7\u06df"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5a47

    const v5, 0x17b1733f

    xor-int/2addr v4, v5

    const v5, 0x1b29b690

    goto/16 :goto_1

    .line 208
    :sswitch_c
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v3

    if-gtz v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u06d7\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7747

    const v5, -0x67e2878

    xor-int/2addr v4, v5

    const v5, -0x14148f71

    goto/16 :goto_1

    :cond_b
    const-string v3, "\u06d8\u06df"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x147d

    const v5, -0x64b387c

    xor-int/2addr v4, v5

    const v5, 0x58f0a520

    goto/16 :goto_1

    .line 117
    :sswitch_d
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_c

    :goto_4
    const-string v3, "\u06e1\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x1d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x34a9

    const v5, 0x4544df2d

    xor-int/2addr v4, v5

    const v5, 0x19525ac0

    goto/16 :goto_1

    :cond_c
    const-string v3, "\u06eb\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5c9d

    const v5, 0x225a1946

    xor-int/2addr v4, v5

    const v5, 0x586ac9af

    goto/16 :goto_1

    .line 225
    :sswitch_e
    iput-object p1, p0, Ll/۬ۢ᩷;->ܽ:Ljava/lang/CharSequence;

    .line 64
    sget v3, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v3, :cond_d

    :goto_5
    const-string v3, "\u06db\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x53ef

    const v5, 0x4cdcd84f    # 1.1578636E8f

    xor-int/2addr v4, v5

    const v5, -0x11c5eea7

    goto/16 :goto_1

    :cond_d
    const-string v3, "\u073a\u06d9"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x78ff

    const v5, 0x661217d3

    xor-int/2addr v4, v5

    const v5, 0x729ea31d

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7be6c5b2 -> :sswitch_7
        -0x7675d2b4 -> :sswitch_3
        -0x75ef34e6 -> :sswitch_b
        -0x74f69125 -> :sswitch_d
        -0x60b3cb0b -> :sswitch_2
        -0x53884036 -> :sswitch_b
        -0x53122a17 -> :sswitch_c
        -0x4e0d539d -> :sswitch_9
        -0x4c6b059f -> :sswitch_6
        -0x47d5ba87 -> :sswitch_2
        -0x42ea3ffc -> :sswitch_5
        -0x3aa93473 -> :sswitch_3
        -0x2fbe394c -> :sswitch_8
        -0x237c81cd -> :sswitch_e
        -0x9ebc365 -> :sswitch_1
        -0x855b520 -> :sswitch_6
        -0x377f60c -> :sswitch_8
        0x288dd97 -> :sswitch_4
        0x1abd0b76 -> :sswitch_0
        0x1b5ed650 -> :sswitch_0
        0x25504a11 -> :sswitch_7
        0x35940d8e -> :sswitch_a
        0x3754f9d4 -> :sswitch_a
        0x40afe770 -> :sswitch_e
        0x42787192 -> :sswitch_1
        0x55bd985f -> :sswitch_c
        0x55d44264 -> :sswitch_4
        0x590f2b0f -> :sswitch_5
        0x5c232434 -> :sswitch_d
        0x6394f79f -> :sswitch_9
    .end sparse-switch
.end method


# virtual methods
.method public final ֫(Z)Ljava/lang/CharSequence;
    .locals 0

    .line 230
    iget-object p1, p0, Ll/۬ۢ᩷;->ܽ:Ljava/lang/CharSequence;

    return-object p1
.end method
