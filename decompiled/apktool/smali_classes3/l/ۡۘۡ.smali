.class public final synthetic Ll/ۡۘۡ;
.super Ljava/lang/Object;
.source "F1FO"

# interfaces
.implements Ll/ܿܶܽ;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Z


# direct methods
.method public synthetic constructor <init>(IZ)V
    .locals 6

    const v0, -0x28a990bc

    sget v1, Ll/ۘۨ;->۫᩸۠:I

    sget v2, Ll/֫ܽ;->ۚ᩷᩹:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u073f\u0730"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x77cf

    const v5, 0x40ae0c88

    xor-int/2addr v4, v5

    const v5, 0xd470123

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x3a77

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    sget-boolean v3, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v3, :cond_3

    goto/16 :goto_2

    .line 4
    :sswitch_0
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v3

    if-nez v3, :cond_b

    goto/16 :goto_4

    .line 1
    :sswitch_1
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    sget v3, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v3, :cond_4

    goto :goto_1

    .line 4
    :sswitch_2
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-gez v3, :cond_8

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    goto :goto_1

    .line 0
    :sswitch_4
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    iput-boolean p2, p0, Ll/ۡۘۡ;->᩹:Z

    return-void

    .line 2
    :sswitch_6
    sget v3, Ll/۠;->ܺܺܶ:I

    if-ltz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u06da\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7efd

    const v5, 0x79ce72b5

    xor-int/2addr v4, v5

    const v5, 0x54d461e7

    goto :goto_0

    :sswitch_7
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v3, "\u06d9\u0730"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5a13

    const v5, 0x1e6f0414

    xor-int/2addr v4, v5

    const v5, 0x15706e73

    goto :goto_0

    .line 0
    :sswitch_8
    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v3, :cond_2

    :goto_1
    const-string v3, "\u06d7\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x17

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1a79

    const v5, 0xcc12df9

    xor-int/2addr v4, v5

    const v5, 0x3eef75b2

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u06e2\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6a6d

    const v5, -0x6296c8e4

    xor-int/2addr v4, v5

    const v5, -0x7af23dd9

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u05a1\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x8a9

    const v5, 0x5c101b9c

    xor-int/2addr v4, v5

    const v5, 0x7b9be8fa

    goto/16 :goto_0

    .line 4
    :sswitch_9
    sget v3, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v3, :cond_5

    :cond_4
    :goto_2
    const-string v3, "\u06e2\u0733"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6733

    const v5, -0x58c5c39c

    xor-int/2addr v4, v5

    const v5, 0x599798c8

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06ec\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x399d

    const v5, 0x24059fb0

    xor-int/2addr v4, v5

    const v5, -0x6f6772d1

    goto/16 :goto_0

    .line 2
    :sswitch_a
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v3

    if-eqz v3, :cond_6

    :goto_3
    const-string v3, "\u06e1\u05ab"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x32d3

    const v5, -0x12a8a5ef

    xor-int/2addr v4, v5

    const v5, -0x121b4d61

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06ec\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x79

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x247

    const v5, 0xdeb1109

    xor-int/2addr v4, v5

    const v5, 0x25d0e9ba

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v3, :cond_7

    goto :goto_5

    :cond_7
    const-string v3, "\u1a77\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x71

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x597d

    const v5, -0x7e2d1046

    xor-int/2addr v4, v5

    const v5, -0x562e7ee2

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v3

    if-ltz v3, :cond_9

    :cond_8
    :goto_4
    const-string v3, "\u06d7\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7847

    const v5, 0x2190cfcd

    xor-int/2addr v4, v5

    const v5, 0xd719aa

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u0730\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5f

    xor-int v4, v3, v1

    mul-int/lit8 v4, v4, -0x2b

    const v5, -0xca24d2e

    xor-int/2addr v4, v5

    const v5, 0x36e7765e

    goto/16 :goto_0

    .line 1
    :sswitch_d
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_5

    :cond_a
    const-string v3, "\u1a73\u05ab"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x51

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3a5

    const v5, -0x2d6633ba

    xor-int/2addr v4, v5

    const v5, -0x60bc973a

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput p1, p0, Ll/ۡۘۡ;->᩸:I

    sget-boolean v3, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06e4\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x37

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x426b

    const v5, 0x7c22251b

    xor-int/2addr v4, v5

    const v5, -0x11134b07

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a74\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xdff

    const v5, -0x363f1624

    xor-int/2addr v4, v5

    const v5, 0x751eea40

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x74aa9e1d -> :sswitch_5
        -0x74752ed0 -> :sswitch_1
        -0x72b2303f -> :sswitch_0
        -0x6eb6c94e -> :sswitch_3
        -0x6c017d2e -> :sswitch_d
        -0x59bb56cc -> :sswitch_1
        -0x5668ecbf -> :sswitch_e
        -0x5481db43 -> :sswitch_2
        -0x47f98bf5 -> :sswitch_7
        -0x454344c7 -> :sswitch_9
        -0x4261770e -> :sswitch_a
        -0x378b648d -> :sswitch_2
        -0x15877d71 -> :sswitch_8
        -0x150b27d2 -> :sswitch_b
        -0xf89950f -> :sswitch_e
        -0xc6c6cef -> :sswitch_6
        -0x4696bd9 -> :sswitch_4
        0x307df5 -> :sswitch_b
        0x524c564 -> :sswitch_9
        0xcf34c5d -> :sswitch_6
        0x18c9ccb6 -> :sswitch_d
        0x27fdf273 -> :sswitch_8
        0x36e69657 -> :sswitch_c
        0x41975998 -> :sswitch_7
        0x48946968 -> :sswitch_c
        0x4d7f83c7 -> :sswitch_3
        0x52c946a0 -> :sswitch_5
        0x6043d3e6 -> :sswitch_a
        0x7c07b75f -> :sswitch_0
        0x7f427479 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final ֫(II)I
    .locals 5

    const p1, -0x4a755caf

    sget v0, Ll/ۗ᩺;->ۡ᩺֡:I

    sget v1, Ll/֫ܿ;->ۨ۫ᩳ:I

    const-string v2, "\u06e2\u05a1"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x6fe9

    const v4, -0x19eb18c5

    xor-int/2addr v3, v4

    const v4, 0x18f50cec

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p1, v0

    mul-int/lit16 p1, p1, -0x5207

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v3

    xor-int/2addr p1, v2

    sparse-switch p1, :sswitch_data_0

    .line 88
    sget v2, Ll/᩹;->ۤܿܳ:I

    if-eqz v2, :cond_e

    goto/16 :goto_4

    .line 150
    :sswitch_0
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v2

    if-nez v2, :cond_b

    goto/16 :goto_4

    .line 72
    :sswitch_1
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v2

    if-lez v2, :cond_d

    goto/16 :goto_1

    :sswitch_2
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    sget-boolean v2, Ll/֫ܺ;->֡ܳ᩸:Z

    if-eqz v2, :cond_6

    goto/16 :goto_2

    .line 53
    :sswitch_3
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    goto/16 :goto_2

    .line 287
    :sswitch_4
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    const/4 p1, 0x0

    return p1

    :sswitch_5
    return p2

    .line 655
    :sswitch_6
    sget p1, Ll/᩹֡᩷;->ۢ:I

    const v0, 0x3f4ccccd    # 0.8f

    invoke-static {p1, p2, v0}, Ll/۟ۗ;->֫(IIF)I

    move-result p1

    return p1

    .line 7
    :sswitch_7
    iget p1, p0, Ll/ۡۘۡ;->᩸:I

    return p1

    .line 651
    :sswitch_8
    iget-boolean v2, p0, Ll/ۡۘۡ;->᩹:Z

    if-eqz v2, :cond_0

    const-string v2, "\u06ec\u06d6"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x11

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x2faf

    const v4, -0xeb3dc18

    xor-int/2addr v3, v4

    const v4, -0x64ffd218

    goto :goto_0

    :cond_0
    const-string v2, "\u073a\u0733"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0x59

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x6b3d

    const v4, -0x7016347c

    xor-int/2addr v3, v4

    const v4, -0x2669ae49

    goto :goto_0

    :sswitch_9
    const v2, -0xb8b8b9

    if-ne p2, v2, :cond_1

    const-string v2, "\u06e8\u06e8"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0xf

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0xa7b

    const v4, -0x65066e67

    xor-int/2addr v3, v4

    const v4, -0x59465872

    goto/16 :goto_0

    :cond_1
    const-string v2, "\u06e7\u1a79"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x6787

    const v4, 0xdc19c62

    xor-int/2addr v3, v4

    const v4, -0x79189251

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "\u1a79\u06e4"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x35

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x40e1

    const v4, -0x227d533

    xor-int/2addr v3, v4

    const v4, -0x54acc8d5

    goto/16 :goto_0

    :cond_2
    const-string v2, "\u06dc\u06e0"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0xb

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0xdb9

    const v4, 0x7af626bb

    xor-int/2addr v3, v4

    const v4, 0x21be7bf8

    goto/16 :goto_0

    .line 253
    :sswitch_b
    sget v2, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v2, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v2, "\u06df\u073a"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x5b

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x4995

    const v4, 0x10c7c9da

    xor-int/2addr v3, v4

    const v4, 0x78e139af

    goto/16 :goto_0

    .line 206
    :sswitch_c
    sget v2, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v2, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v2, "\u1a73\u06db"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x589b

    const v4, -0x49a8c877

    xor-int/2addr v3, v4

    const v4, -0x3a9f9456

    goto/16 :goto_0

    .line 154
    :sswitch_d
    sget v2, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v2, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v2, "\u1a77\u06ec"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x45b3

    const v4, -0x342ff351    # -2.726947E7f

    xor-int/2addr v3, v4

    const v4, 0x793a8327

    goto/16 :goto_0

    :sswitch_e
    sget v2, Ll/۠;->ܺܺܶ:I

    if-ltz v2, :cond_7

    :cond_6
    :goto_1
    const-string v2, "\u073d\u06e7"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x4d

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x7dfb

    const v4, 0x25c2d5da

    xor-int/2addr v3, v4

    const v4, 0x3b580fc8

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06d8\u0736"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x6d23

    const v4, -0x1580b7f9

    xor-int/2addr v3, v4

    const v4, 0x636878e1

    goto/16 :goto_0

    :sswitch_f
    sget v2, Ll/ۛ;->᩺᩻֫:I

    if-ltz v2, :cond_8

    :goto_2
    const-string v2, "\u06d6\u06db"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x1f

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x1849

    const v4, 0x6a702c6f

    xor-int/2addr v3, v4

    const v4, 0x241e4bcc

    goto/16 :goto_0

    :cond_8
    const-string v2, "\u0730\u1a7b"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x21

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x68bd

    const v4, -0x70c46b65

    xor-int/2addr v3, v4

    const v4, 0x6f0e0fe3

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v2

    if-ltz v2, :cond_9

    goto :goto_4

    :cond_9
    const-string v2, "\u073d\u1a74"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x6ac5

    const v4, 0x7ab9c2b4

    xor-int/2addr v3, v4

    const v4, -0xc90d3f6

    goto/16 :goto_0

    :sswitch_11
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_3

    :cond_a
    const-string v2, "\u073a\u06ec"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x3691

    const v4, -0x40942dd

    xor-int/2addr v3, v4

    const v4, 0x6fbaccf8

    goto/16 :goto_0

    .line 467
    :sswitch_12
    sget-boolean v2, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v2, :cond_c

    :cond_b
    :goto_3
    const-string v2, "\u1a76\u06e7"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, 0x47

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x7857

    const v4, -0x1d1ca95a

    xor-int/2addr v3, v4

    const v4, 0xbb15e98

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u06d7\u0736"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0x15

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x5691

    const v4, -0x669c0691

    xor-int/2addr v3, v4

    const v4, 0x776b5ed4

    goto/16 :goto_0

    :cond_d
    :goto_4
    const-string v2, "\u06e2\u073d"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0xd

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x1a37

    const v4, 0xbae2b6d

    xor-int/2addr v3, v4

    const v4, 0x73df5ff1

    goto/16 :goto_0

    :cond_e
    const-string v2, "\u06e4\u073d"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x737

    const v4, 0x313ab4a

    xor-int/2addr v3, v4

    const v4, -0x27c246a7

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x768236b5 -> :sswitch_b
        -0x73e13e49 -> :sswitch_12
        -0x6fc2fc96 -> :sswitch_3
        -0x6f856a15 -> :sswitch_a
        -0x6ebf0aab -> :sswitch_b
        -0x6c0502e8 -> :sswitch_4
        -0x667a1a07 -> :sswitch_6
        -0x6252e1c7 -> :sswitch_12
        -0x609adfd4 -> :sswitch_7
        -0x5feb4826 -> :sswitch_2
        -0x5f8985e9 -> :sswitch_a
        -0x577f4bc8 -> :sswitch_c
        -0x52d7dd61 -> :sswitch_8
        -0x4354a0e9 -> :sswitch_11
        -0x3e6dd939 -> :sswitch_0
        -0x2d3bc616 -> :sswitch_8
        -0x2c78514c -> :sswitch_11
        -0x25e814ba -> :sswitch_d
        -0x1ec44747 -> :sswitch_5
        -0x84e7d14 -> :sswitch_0
        -0x768641f -> :sswitch_10
        -0x6fbaa8f -> :sswitch_6
        -0x5b5f467 -> :sswitch_1
        0x10a2f324 -> :sswitch_7
        0x126ce70d -> :sswitch_f
        0x20868d85 -> :sswitch_1
        0x22d6da97 -> :sswitch_f
        0x23423e22 -> :sswitch_9
        0x361b7d1d -> :sswitch_2
        0x374b0788 -> :sswitch_d
        0x3b998e3d -> :sswitch_10
        0x419cb11d -> :sswitch_4
        0x53a4eb9f -> :sswitch_c
        0x57655e37 -> :sswitch_e
        0x67f4b7d6 -> :sswitch_e
        0x75c34351 -> :sswitch_3
        0x7658a91c -> :sswitch_5
        0x7ff755dc -> :sswitch_9
    .end sparse-switch
.end method
