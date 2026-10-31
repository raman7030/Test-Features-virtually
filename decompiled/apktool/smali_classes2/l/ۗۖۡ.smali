.class public final Ll/ۗۖۡ;
.super Ljava/lang/Object;
.source "S3XU"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 6

    const v0, -0x2b8f20ea

    sget v1, Ll/ۙۨ;->ۡۗۙ:I

    sget v2, Ll/֨۬;->۫ۙ᩺:I

    .line 1135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e4\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x182b

    const v5, 0x19194e76

    xor-int/2addr v4, v5

    const v5, 0x1a0e9c45

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x7cd7

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 983
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v3

    if-ltz v3, :cond_4

    goto/16 :goto_1

    .line 329
    :sswitch_0
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    move-result v3

    if-lez v3, :cond_1

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v3

    if-gtz v3, :cond_6

    goto/16 :goto_3

    .line 52
    :sswitch_2
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    sget v3, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v3, :cond_b

    goto/16 :goto_3

    .line 226
    :sswitch_3
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 1135
    :sswitch_5
    iput p2, p0, Ll/ۗۖۡ;->ۧ:I

    return-void

    .line 348
    :sswitch_6
    sget v3, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06e7\u06d7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4173

    const v5, 0x416eeb03

    xor-int/2addr v4, v5

    const v5, 0x2ff7ad2a

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    const-string v3, "\u1a7b\u05ab"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1fe3

    const v5, -0x2eff464

    xor-int/2addr v4, v5

    const v5, 0x5e26a4c8

    goto :goto_0

    :cond_2
    const-string v3, "\u06db\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3d3f

    const v5, -0x35e38fb

    xor-int/2addr v4, v5

    const v5, -0x444e1545

    goto/16 :goto_0

    .line 333
    :sswitch_8
    sget v3, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v3, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v3, "\u05ab\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x15eb

    const v5, -0x34fb5433    # -8694733.0f

    xor-int/2addr v4, v5

    const v5, 0x533d3cf9

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u06da\u0733"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x118f

    const v5, 0x1f246141

    xor-int/2addr v4, v5

    const v5, -0x5e15a561

    goto/16 :goto_0

    .line 529
    :sswitch_9
    sget v3, Ll/֡֡;->֫ۤܳ:I

    if-ltz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u1a74\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x6b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x793d

    const v5, -0x3512709e    # -7784369.0f

    xor-int/2addr v4, v5

    const v5, 0x61b26a1d

    goto/16 :goto_0

    .line 779
    :sswitch_a
    sget-boolean v3, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v3, :cond_7

    :cond_6
    :goto_1
    const-string v3, "\u073f\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x775

    const v5, -0x606587f2

    xor-int/2addr v4, v5

    const v5, 0xc5de45d

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06e0\u06d9"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x65

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4601

    const v5, 0x2e3d0ab

    xor-int/2addr v4, v5

    const v5, 0xf0e028

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v3

    if-ltz v3, :cond_8

    :goto_2
    const-string v3, "\u05a8\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x25

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7dd

    const v5, 0x956b010

    xor-int/2addr v4, v5

    const v5, 0x40713d15

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06e7\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5bcf

    const v5, -0x37d408f7

    xor-int/2addr v4, v5

    const v5, 0x452f5b6

    goto/16 :goto_0

    .line 1105
    :sswitch_c
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_4

    :cond_9
    const-string v3, "\u05ab\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7399

    const v5, 0x2ca9d162

    xor-int/2addr v4, v5

    const v5, 0x1423d945

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v3

    if-gtz v3, :cond_a

    :goto_3
    const-string v3, "\u073f\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x5f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3af

    const v5, -0x4b455e00

    xor-int/2addr v4, v5

    const v5, -0x6b779be1

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a76\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5e01

    const v5, 0x269100fa

    xor-int/2addr v4, v5

    const v5, -0x1eb6bd2d

    goto/16 :goto_0

    .line 1135
    :sswitch_e
    iput-object p1, p0, Ll/ۗۖۡ;->֫:Ljava/lang/String;

    .line 1027
    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u1a7b\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x4f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4ffd

    const v5, -0x2a6f9295

    xor-int/2addr v4, v5

    const v5, -0x12dc3a38

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a73\u1a73"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6f8d

    const v5, -0x7065d002

    xor-int/2addr v4, v5

    const v5, -0x4c4eab00

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7064c76a -> :sswitch_a
        -0x6af63a60 -> :sswitch_d
        -0x69b5c8af -> :sswitch_2
        -0x668d34cf -> :sswitch_5
        -0x59bf8b7e -> :sswitch_8
        -0x4739ef55 -> :sswitch_9
        -0x43deeb5b -> :sswitch_4
        -0x42eed2c9 -> :sswitch_6
        -0x3378f093 -> :sswitch_7
        -0x1a02bf82 -> :sswitch_6
        -0x19dae807 -> :sswitch_3
        -0x1631f422 -> :sswitch_c
        -0x119541ab -> :sswitch_0
        -0xbc35a3c -> :sswitch_1
        0x819c72c -> :sswitch_7
        0x128a47f9 -> :sswitch_e
        0x130df5cf -> :sswitch_b
        0x13602db0 -> :sswitch_8
        0x141fcb79 -> :sswitch_3
        0x1a74b94b -> :sswitch_9
        0x1ca76802 -> :sswitch_b
        0x21b4fa3f -> :sswitch_4
        0x26cf448f -> :sswitch_0
        0x2ae6c18a -> :sswitch_2
        0x3d7768fa -> :sswitch_5
        0x56a19990 -> :sswitch_1
        0x586969e6 -> :sswitch_d
        0x59757da3 -> :sswitch_e
        0x5d592917 -> :sswitch_c
        0x6b48b9f7 -> :sswitch_a
    .end sparse-switch
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 1135
    iget-object v0, p0, Ll/ۗۖۡ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 1135
    iget v0, p0, Ll/ۗۖۡ;->ۧ:I

    return v0
.end method
