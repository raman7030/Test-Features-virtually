.class public final Ll/ۙۖ᩷;
.super Ljava/lang/Object;
.source "V60Y"


# instance fields
.field public final ֫:Ljava/lang/Class;

.field public final ۧ:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Object;)V
    .locals 6

    const v0, -0x4c2abf9b

    sget v1, Ll/ۘᩴ;->ܿ۬ܿ:I

    sget v2, Ll/ۘܿ;->ۘܰ۫:I

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e8\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x3d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6827

    const v5, -0x389639d5

    xor-int/2addr v4, v5

    const v5, 0x3e5000c5

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x3e8d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 146
    iput-object p1, p0, Ll/ۙۖ᩷;->֫:Ljava/lang/Class;

    .line 97
    sget v3, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v3, :cond_c

    goto/16 :goto_3

    .line 85
    :sswitch_0
    sget v3, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v3, :cond_8

    goto/16 :goto_1

    .line 69
    :sswitch_1
    sget-boolean v3, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v3, :cond_b

    goto/16 :goto_1

    :sswitch_2
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-nez v3, :cond_4

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    goto/16 :goto_1

    .line 61
    :sswitch_4
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 147
    :sswitch_5
    iput-object p2, p0, Ll/ۙۖ᩷;->ۧ:Ljava/lang/Object;

    return-void

    .line 64
    :sswitch_6
    sget v3, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v3, :cond_0

    const-string v3, "\u06e0\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x17

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x77a7

    const v5, 0x4de112c

    xor-int/2addr v4, v5

    const v5, -0x778a11d6

    goto :goto_0

    :cond_0
    const-string v3, "\u06df\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2843

    const v5, -0x87f1493

    xor-int/2addr v4, v5

    const v5, -0x2cd1fed1

    goto :goto_0

    :sswitch_7
    sget v3, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u1a7a\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xff1

    const v5, -0x6d4756d4

    xor-int/2addr v4, v5

    const v5, 0x75dbf52

    goto/16 :goto_0

    .line 109
    :sswitch_8
    sget-boolean v3, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u073a\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x59

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3cef

    const v5, -0x2103000

    xor-int/2addr v4, v5

    const v5, 0x1bde0c0

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v3, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v3, "\u06e2\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3841

    const v5, 0x5f60042

    xor-int/2addr v4, v5

    const v5, -0x20e148a4

    goto/16 :goto_0

    .line 141
    :sswitch_a
    sget-boolean v3, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v3, :cond_5

    :cond_4
    const-string v3, "\u1a7b\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3dcd

    const v5, -0x6734ba85

    xor-int/2addr v4, v5

    const v5, 0x4dc5f048    # 4.15107328E8f

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a79\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x31

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5751

    const v5, -0x37041430    # -515934.5f

    xor-int/2addr v4, v5

    const v5, -0x96ef79e

    goto/16 :goto_0

    .line 30
    :sswitch_b
    sget-boolean v3, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v3, :cond_6

    :goto_1
    const-string v3, "\u06e7\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x51cb

    const v5, 0x76c69871

    xor-int/2addr v4, v5

    const v5, -0x754fe3f8

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06d6\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x4f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3801

    const v5, 0x681bfe8c

    xor-int/2addr v4, v5

    const v5, 0x6d135916

    goto/16 :goto_0

    .line 113
    :sswitch_c
    sget v3, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u1a75\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1bf5

    const v5, 0x755d7d73

    xor-int/2addr v4, v5

    const v5, 0x26c575b4

    goto/16 :goto_0

    .line 135
    :sswitch_d
    sget v3, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u05a1\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1b4b

    const v5, 0x4b9f39ac    # 2.0869976E7f

    xor-int/2addr v4, v5

    const v5, -0x251e9b0b

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u0736\u1a73"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x47

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1c8b

    const v5, 0x597b627a

    xor-int/2addr v4, v5

    const v5, 0x10109dc6

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_a

    goto :goto_3

    :cond_a
    const-string v3, "\u05ab\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x1f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x74f3

    const v5, -0x6509e44c

    xor-int/2addr v4, v5

    const v5, 0x56c6a255

    goto/16 :goto_0

    :cond_b
    :goto_3
    const-string v3, "\u05a8\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7e19

    const v5, -0x11029fcf

    xor-int/2addr v4, v5

    const v5, 0x25f0503a

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u0736\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x39ab

    const v5, 0x169f7dae

    xor-int/2addr v4, v5

    const v5, -0x6d74e008

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x79774b23 -> :sswitch_a
        -0x73d7c95f -> :sswitch_1
        -0x7019d4fc -> :sswitch_9
        -0x6d657d9f -> :sswitch_9
        -0x664e810f -> :sswitch_1
        -0x61b9e135 -> :sswitch_d
        -0x5bb538ad -> :sswitch_b
        -0x58214c08 -> :sswitch_7
        -0x52540826 -> :sswitch_2
        -0x4d7fadfc -> :sswitch_5
        -0x4a57c5bf -> :sswitch_e
        -0x3f13ff85 -> :sswitch_c
        -0x3e6c5012 -> :sswitch_0
        -0x3a62224c -> :sswitch_3
        -0x32c234f7 -> :sswitch_4
        -0x3206d11d -> :sswitch_c
        -0x2dbf4bd8 -> :sswitch_7
        -0x29e15d3b -> :sswitch_a
        0xad985fa -> :sswitch_2
        0xd58d935 -> :sswitch_5
        0x1ad0e84b -> :sswitch_e
        0x1ba05a6b -> :sswitch_b
        0x1eb2088c -> :sswitch_4
        0x2b650972 -> :sswitch_d
        0x2b73c587 -> :sswitch_8
        0x3686de68 -> :sswitch_6
        0x3e6a1e15 -> :sswitch_6
        0x4472b05a -> :sswitch_0
        0x51c9e5ee -> :sswitch_3
        0x57457abe -> :sswitch_8
    .end sparse-switch
.end method
