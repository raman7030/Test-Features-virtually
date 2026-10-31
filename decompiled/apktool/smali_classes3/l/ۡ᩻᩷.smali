.class public final Ll/ۡ᩻᩷;
.super Ljava/lang/Object;
.source "42TB"


# instance fields
.field public final ֫:Ll/ܶ᩵ܿ;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:J


# direct methods
.method public constructor <init>(JLl/ܶ᩵ܿ;Ljava/lang/String;)V
    .locals 6

    const v0, -0x43f2e0cf

    sget v1, Ll/ۘۛ;->ۖۚ֡:I

    sget v2, Ll/ۗ᩶;->ۛ֨ۘ:I

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06db\u06df"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x68f

    const v5, -0xed612b8

    xor-int/2addr v4, v5

    const v5, 0x2b5c8507

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0x155d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget v3, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v3, :cond_2

    goto/16 :goto_2

    .line 56
    :sswitch_0
    sget v3, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v3, :cond_6

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v3

    if-nez v3, :cond_9

    goto/16 :goto_2

    .line 44
    :sswitch_2
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 70
    :sswitch_4
    iput-object p4, p0, Ll/ۡ᩻᩷;->ۧ:Ljava/lang/String;

    return-void

    .line 47
    :sswitch_5
    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u06e1\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x9a5

    const v5, 0x5ff58af3

    xor-int/2addr v4, v5

    const v5, 0x2142f217

    goto :goto_0

    .line 66
    :sswitch_6
    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u05a1\u1a73"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x53

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1f3b

    const v5, -0x2597547e

    xor-int/2addr v4, v5

    const v5, -0x35466026    # -6082541.0f

    goto :goto_0

    .line 49
    :sswitch_7
    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_3

    :cond_2
    const-string v3, "\u06d6\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6421

    const v5, -0x46fddc5e

    xor-int/2addr v4, v5

    const v5, -0x5658a171

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u1a78\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x554b

    const v5, -0xb7a1d82

    xor-int/2addr v4, v5

    const v5, 0x5d576a33

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v3, :cond_4

    goto :goto_1

    :cond_4
    const-string v3, "\u1a76\u073a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5265

    const v5, -0x21e44b29

    xor-int/2addr v4, v5

    const v5, -0x32dcd448    # -1.7109696E8f

    goto/16 :goto_0

    .line 14
    :sswitch_9
    sget v3, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u073d\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2ae5

    const v5, -0x111d014

    xor-int/2addr v4, v5

    const v5, 0x5e0ffb7a

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_7

    :cond_6
    :goto_1
    const-string v3, "\u06d7\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xdd5

    const v5, -0x4178ff33

    xor-int/2addr v4, v5

    const v5, 0x4060e313

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06d8\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x21

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5fd3

    const v5, -0x7db42a81

    xor-int/2addr v4, v5

    const v5, 0x1036b79f

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v3, :cond_8

    :goto_2
    const-string v3, "\u1a77\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1411

    const v5, -0x579eccd1

    xor-int/2addr v4, v5

    const v5, -0x210b47c7

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a76\u1a7b"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5db9

    const v5, 0x7181f952

    xor-int/2addr v4, v5

    const v5, -0x5a1ae298

    goto/16 :goto_0

    .line 6
    :sswitch_c
    sget v3, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v3, :cond_a

    :cond_9
    const-string v3, "\u1a74\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1e33

    const v5, 0x2f137cc

    xor-int/2addr v4, v5

    const v5, 0xe02cb16

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u05a1\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x29b

    const v5, -0x645dc4b5

    xor-int/2addr v4, v5

    const v5, 0x2e1a5f0a    # 3.5099958E-11f

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-nez v3, :cond_b

    goto :goto_3

    :cond_b
    const-string v3, "\u1a75\u0736"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2651

    const v5, -0x30a7d7d2

    xor-int/2addr v4, v5

    const v5, 0x234fa19b

    goto/16 :goto_0

    .line 68
    :sswitch_e
    iput-object p3, p0, Ll/ۡ᩻᩷;->֫:Ll/ܶ᩵ܿ;

    .line 69
    iput-wide p1, p0, Ll/ۡ᩻᩷;->ܽ:J

    .line 9
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v3

    if-ltz v3, :cond_c

    :goto_3
    const-string v3, "\u06dc\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x411f

    const v5, 0x2d3e3cbb

    xor-int/2addr v4, v5

    const v5, 0x692f2acd

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u073d\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x343b

    const v5, 0x2f8b9cba

    xor-int/2addr v4, v5

    const v5, -0x4d3a11b3

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x70d760c6 -> :sswitch_e
        -0x6b0fcd86 -> :sswitch_3
        -0x6415b495 -> :sswitch_9
        -0x614aaeea -> :sswitch_1
        -0x60242717 -> :sswitch_9
        -0x56c3c708 -> :sswitch_4
        -0x5617c337 -> :sswitch_6
        -0x3e2606d6 -> :sswitch_a
        -0x3d12e02b -> :sswitch_b
        -0x3cc0e4b8 -> :sswitch_a
        -0x385454ed -> :sswitch_e
        -0x30449076 -> :sswitch_c
        -0x1e916f00 -> :sswitch_5
        -0x1d098f1b -> :sswitch_2
        -0x9a34649 -> :sswitch_2
        -0x13339eb -> :sswitch_0
        0x391fb3b -> :sswitch_3
        0x6b099e8 -> :sswitch_0
        0xadf26fc -> :sswitch_8
        0x18d4f8d0 -> :sswitch_7
        0x21d7e54c -> :sswitch_7
        0x2234ee79 -> :sswitch_1
        0x23f068ef -> :sswitch_d
        0x2e8012a1 -> :sswitch_d
        0x38d64945 -> :sswitch_8
        0x3b8d19a2 -> :sswitch_6
        0x479b66ea -> :sswitch_4
        0x47cdeb07 -> :sswitch_5
        0x5ca04b80 -> :sswitch_b
        0x7a8cac90 -> :sswitch_c
    .end sparse-switch
.end method
