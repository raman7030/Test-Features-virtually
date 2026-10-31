.class public final Ll/۬ᩴ᩷;
.super Ljava/lang/Object;
.source "C2R7"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ll/᩵֡ᩴ;

.field public final ᩳ:Ll/᩵֡ᩴ;


# direct methods
.method public constructor <init>(Ll/᩵֡ᩴ;Ll/᩵֡ᩴ;Ljava/lang/String;I)V
    .locals 6

    const v0, 0x66342631

    sget v1, Ll/ۗ᩷;->᩸᩺ᩳ:I

    sget v2, Ll/᩺;->ۙۛܶ:I

    .line 304
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a76\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5643

    const v5, -0x2b636c6

    xor-int/2addr v4, v5

    const v5, 0x24a79ed0

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x7abd

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 302
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 45
    :sswitch_0
    sget v3, Ll/ۗۗ;->ۨ۬ۖ:I

    if-gez v3, :cond_a

    goto/16 :goto_1

    .line 195
    :sswitch_1
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-gez v3, :cond_1

    goto/16 :goto_1

    :sswitch_2
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v3

    if-nez v3, :cond_7

    goto/16 :goto_4

    .line 154
    :sswitch_3
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    goto/16 :goto_4

    .line 307
    :sswitch_4
    iput-object p3, p0, Ll/۬ᩴ᩷;->ۧ:Ljava/lang/String;

    .line 308
    iput p4, p0, Ll/۬ᩴ᩷;->֫:I

    return-void

    :sswitch_5
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v3

    if-nez v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u06e4\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x69

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x52df

    const v5, -0x1efde817

    xor-int/2addr v4, v5

    const v5, -0x7d682b83

    goto :goto_0

    .line 275
    :sswitch_6
    sget v3, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v3, :cond_2

    :cond_1
    const-string v3, "\u073d\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x42cb

    const v5, -0x5931edc2

    xor-int/2addr v4, v5

    const v5, 0x38a85bf4

    goto :goto_0

    :cond_2
    const-string v3, "\u0733\u0730"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5b1f

    const v5, -0x34223fb0

    xor-int/2addr v4, v5

    const v5, -0x56d79466

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u1a7b\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x23

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1453

    const v5, 0x138a5e27

    xor-int/2addr v4, v5

    const v5, -0x1c4d476d

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v3, :cond_4

    goto :goto_1

    :cond_4
    const-string v3, "\u06e8\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x3

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x167f

    const v5, -0x26c0a93

    xor-int/2addr v4, v5

    const v5, 0x17145ac3

    goto/16 :goto_0

    .line 111
    :sswitch_9
    sget v3, Ll/֡۬;->۠֡᩶:I

    if-gtz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u06db\u06d9"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x69ad

    const v5, 0x2c67c4c8

    xor-int/2addr v4, v5

    const v5, 0x5ebf4663

    goto/16 :goto_0

    .line 276
    :sswitch_a
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v3, :cond_6

    goto :goto_3

    :cond_6
    const-string v3, "\u06ec\u06d9"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5c55

    const v5, -0xc04d9b7

    xor-int/2addr v4, v5

    const v5, 0x310ee7ed

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_8

    :cond_7
    :goto_1
    const-string v3, "\u1a7a\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x22e7

    const v5, -0x10d31947

    xor-int/2addr v4, v5

    const v5, 0x518616d    # 7.1649E-36f

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u06d9\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x39

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7c83

    const v5, 0x4c71d3c1    # 6.339354E7f

    xor-int/2addr v4, v5

    const v5, -0x10a4f84a

    goto/16 :goto_0

    .line 32
    :sswitch_c
    sget v3, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v3, :cond_9

    :goto_2
    const-string v3, "\u073a\u05ab"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5839

    const v5, 0x2e7626ce

    xor-int/2addr v4, v5

    const v5, -0x29d052f8

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a7b\u0733"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x408d

    const v5, -0x7a68e1cd

    xor-int/2addr v4, v5

    const v5, 0x78c82e50

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u1a77\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x56db

    const v5, 0x2505b3e5

    xor-int/2addr v4, v5

    const v5, 0x20ec30d5

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a79\u05a8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x592f

    const v5, -0x27305b8

    xor-int/2addr v4, v5

    const v5, 0x44f3fe8f

    goto/16 :goto_0

    .line 305
    :sswitch_e
    iput-object p1, p0, Ll/۬ᩴ᩷;->ܽ:Ll/᩵֡ᩴ;

    .line 306
    iput-object p2, p0, Ll/۬ᩴ᩷;->ᩳ:Ll/᩵֡ᩴ;

    .line 188
    sget-boolean v3, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v3, :cond_c

    :goto_4
    const-string v3, "\u06e7\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x482b

    const v5, 0x50d0d55d

    xor-int/2addr v4, v5

    const v5, -0x3947bd44

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d8\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x19

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x443b

    const v5, -0x7e1712f0

    xor-int/2addr v4, v5

    const v5, -0x45ffb50e

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x75916e4f -> :sswitch_7
        -0x671cb91a -> :sswitch_4
        -0x5320ecfd -> :sswitch_6
        -0x48ab5fbc -> :sswitch_c
        -0x3f992aeb -> :sswitch_e
        -0x373dbf96 -> :sswitch_5
        -0x35dd253b -> :sswitch_d
        -0x32a988ea -> :sswitch_7
        -0x2223abed -> :sswitch_a
        -0x1c33b1a6 -> :sswitch_0
        -0xff7f300 -> :sswitch_a
        -0xf37773c -> :sswitch_8
        -0xaff8a08 -> :sswitch_8
        -0x7304a89 -> :sswitch_9
        -0x261b4d5 -> :sswitch_2
        0x10956d05 -> :sswitch_4
        0x13897653 -> :sswitch_0
        0x150c0d9e -> :sswitch_1
        0x309f4f3a -> :sswitch_b
        0x34642509 -> :sswitch_d
        0x4236608b -> :sswitch_6
        0x454e1dbc -> :sswitch_e
        0x4d2814ab -> :sswitch_b
        0x4f361617 -> :sswitch_3
        0x59426c84 -> :sswitch_2
        0x5dbf1945 -> :sswitch_1
        0x64f1e3fa -> :sswitch_3
        0x7113c223 -> :sswitch_c
        0x733db677 -> :sswitch_5
        0x7778cd83 -> :sswitch_9
    .end sparse-switch
.end method
