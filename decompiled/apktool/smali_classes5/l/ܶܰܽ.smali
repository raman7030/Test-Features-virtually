.class public final Ll/ܶܰܽ;
.super Ll/ᩴܳۚ;
.source "D60A"


# instance fields
.field public final synthetic ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩸ܰܽ;Ll/ۘ֫ۚ;Ljava/lang/String;)V
    .locals 3

    const v0, 0x4f8b0e62

    sget v1, Ll/֡۬;->۠֡᩶:I

    sget v2, Ll/֨۬;->۫ۙ᩺:I

    .line 307
    iput-object p3, p0, Ll/ܶܰܽ;->᩶:Ljava/lang/String;

    invoke-direct {p0, p1, p2}, Ll/ᩴܳۚ;-><init>(Ll/᩵ܳۚ;Ll/ۘ֫ۚ;)V

    const-string p1, "\u0736\u1a79"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x7d9d

    const p3, 0x265c4f09

    xor-int/2addr p2, p3

    const p3, -0x5d364beb

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v2

    mul-int/lit16 p3, p3, -0x6a29

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 145
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    goto :goto_2

    .line 31
    :sswitch_0
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    sget-boolean p1, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06e1\u06dc"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x7ef7

    const p3, -0x271d7447

    xor-int/2addr p2, p3

    const p3, -0x6636489e

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget p1, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u06e1\u073d"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x217f

    const p3, -0x69993852

    xor-int/2addr p2, p3

    const p3, -0x1c56ddd2

    goto :goto_0

    .line 16
    :sswitch_2
    sget p1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u06df\u06ec"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x6a09

    const p3, 0x2df186c5

    xor-int/2addr p2, p3

    const p3, 0x4a99e87f    # 5043263.5f

    goto :goto_0

    :goto_2
    const-string p1, "\u06d9\u06da"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x269b

    const p3, 0x29ecd224

    xor-int/2addr p2, p3

    const p3, 0x3186035f

    goto :goto_0

    .line 44
    :sswitch_3
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    :sswitch_5
    sget-boolean p1, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez p1, :cond_3

    const-string p1, "\u06db\u1a79"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, -0x31

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x3617

    const p3, 0x1575b19d

    xor-int/2addr p2, p3

    const p3, -0x6fc560a5

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u05ab\u1a78"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x4a91

    const p3, -0x84431c8

    xor-int/2addr p2, p3

    const p3, -0x4d9fd870

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7eb3d66a -> :sswitch_1
        -0x751dd57a -> :sswitch_0
        -0x6eb2934f -> :sswitch_1
        -0x6a43b316 -> :sswitch_3
        -0x55745144 -> :sswitch_4
        -0x54e08bca -> :sswitch_0
        -0x45ddf2e9 -> :sswitch_5
        -0x2cb24860 -> :sswitch_4
        -0x18d793ca -> :sswitch_2
        -0x4bd42ad -> :sswitch_2
        0x38cee1fc -> :sswitch_5
        0x3902dfb6 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final ۚ֫()Ll/ۤܽۚ;
    .locals 2

    .line 310
    new-instance v0, Ll/ۚܿۚ;

    iget-object v1, p0, Ll/ܶܰܽ;->᩶:Ljava/lang/String;

    invoke-direct {v0, v1}, Ll/ۚܿۚ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
