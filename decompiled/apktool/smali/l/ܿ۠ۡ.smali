.class public final Ll/ܿ۠ۡ;
.super Ljava/lang/Thread;
.source "E4FN"


# instance fields
.field public final synthetic ᩶:Ljava/lang/String;

.field public final synthetic ᩸:Ll/ۛۚۡ;

.field public final synthetic ᩹:Ll/᩷ۚۡ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x83

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/ۛۚۡ;Ll/᩷ۚۡ;)V
    .locals 3

    const v0, 0x1dfb388e

    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    sget v2, Ll/ۗ᩷;->᩸᩺ᩳ:I

    .line 921
    iput-object p1, p0, Ll/ܿ۠ۡ;->᩶:Ljava/lang/String;

    iput-object p2, p0, Ll/ܿ۠ۡ;->᩸:Ll/ۛۚۡ;

    iput-object p3, p0, Ll/ܿ۠ۡ;->᩹:Ll/᩷ۚۡ;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u06e7\u0736"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x354b

    const p3, -0x40c23167

    xor-int/2addr p2, p3

    const p3, -0x2bcd1422

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v2

    mul-int/lit16 p3, p3, -0x2087

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 691
    sget-boolean p1, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz p1, :cond_3

    const-string p1, "\u06d8\u06dc"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x90d

    const p3, -0x150ea000

    xor-int/2addr p2, p3

    const p3, -0x6921c2a8

    goto :goto_0

    .line 511
    :sswitch_0
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    sget p1, Ll/֡۬;->۠֡᩶:I

    if-lez p1, :cond_0

    goto :goto_2

    :cond_0
    const-string p1, "\u1a7a\u06e0"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x17

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x683b

    const p3, 0x14448fbc

    xor-int/2addr p2, p3

    const p3, -0x7d2d49a5

    goto :goto_0

    .line 810
    :sswitch_1
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    sget p1, Ll/ۗ۬;->ۘܳ᩻:I

    if-lez p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u06df\u05ab"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x1f1f

    const p3, -0x10d76224

    xor-int/2addr p2, p3

    const p3, -0x68a54cea

    goto :goto_0

    .line 639
    :sswitch_2
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget-boolean p1, Ll/֫ܺ;->֡ܳ᩸:Z

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u06d8\u05ab"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x9

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x6a6b

    const p3, -0x7f2c1e6c

    xor-int/2addr p2, p3

    const p3, 0x33536427

    goto :goto_0

    .line 619
    :sswitch_3
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    :goto_2
    const-string p1, "\u0736\u1a74"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x3061

    const p3, 0x2b5c17b1

    xor-int/2addr p2, p3

    const p3, 0x7653f29c

    goto/16 :goto_0

    :sswitch_4
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    return-void

    :cond_3
    const-string p1, "\u06e0\u0730"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x1d

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x7d23

    const p3, -0x64594102

    xor-int/2addr p2, p3

    const p3, -0x14de51f1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x655b01ee -> :sswitch_4
        -0x4ed7aca8 -> :sswitch_1
        -0x426af68f -> :sswitch_3
        -0x218f1bb9 -> :sswitch_2
        -0x13dd5e65 -> :sswitch_1
        0x35e0678 -> :sswitch_5
        0x427ba81e -> :sswitch_4
        0x510344fb -> :sswitch_3
        0x5316658d -> :sswitch_5
        0x58a0bfd7 -> :sswitch_0
        0x7a29132c -> :sswitch_0
        0x7bad9cca -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
