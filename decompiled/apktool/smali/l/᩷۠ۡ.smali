.class public final Ll/᩷۠ۡ;
.super Ljava/lang/Thread;
.source "E4FN"


# instance fields
.field public final synthetic ᩶:Ljava/lang/String;

.field public final synthetic ᩸:Ll/ۛۚۡ;

.field public final synthetic ᩹:Ll/᩻ۚۡ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x95

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/ۛۚۡ;Ll/᩻ۚۡ;)V
    .locals 3

    const v0, 0x12a60be5

    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    sget v2, Ll/ۘۘ;->᩷ۙ᩸:I

    .line 1013
    iput-object p1, p0, Ll/᩷۠ۡ;->᩶:Ljava/lang/String;

    iput-object p2, p0, Ll/᩷۠ۡ;->᩸:Ll/ۛۚۡ;

    iput-object p3, p0, Ll/᩷۠ۡ;->᩹:Ll/᩻ۚۡ;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u0733\u06db"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x69

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x18f7

    const p3, 0x366ace50

    xor-int/2addr p2, p3

    const p3, 0x6c5edfd4

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v2

    mul-int/lit16 p3, p3, 0x385

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    return-void

    .line 968
    :sswitch_0
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result p1

    if-lez p1, :cond_0

    goto :goto_2

    :cond_0
    const-string p1, "\u05a1\u1a73"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x4ac7

    const p3, 0xf46bcd9

    xor-int/2addr p2, p3

    const p3, 0x12884f8c

    goto :goto_0

    :sswitch_1
    sget p1, Ll/ۗ᩵;->֫۠۟:I

    if-gez p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u1a74\u06df"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x7d

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x7101

    const p3, -0x2bba24e6

    xor-int/2addr p2, p3

    const p3, -0x994916f

    goto :goto_0

    :sswitch_2
    sget-boolean p1, Ll/֫᩺;->֫ܰۨ:Z

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const-string p1, "\u0733\u1a7a"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x725d

    const p3, 0x77b094d6

    xor-int/2addr p2, p3

    const p3, 0xef65af4

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    :goto_2
    const-string p1, "\u1a7a\u1a78"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x3e0d

    const p3, 0x3076c060

    xor-int/2addr p2, p3

    const p3, 0x53849057

    goto :goto_0

    .line 523
    :sswitch_4
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    sget p1, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz p1, :cond_3

    const-string p1, "\u1a76\u06da"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x3b7

    const p3, -0x71bb0328

    xor-int/2addr p2, p3

    const p3, -0x6fafa676

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06eb\u073f"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x6b

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x6825

    const p3, 0x1d579666

    xor-int/2addr p2, p3

    const p3, 0x2153c5ad

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x58ffe17c -> :sswitch_4
        -0x3c1ceaf9 -> :sswitch_1
        -0x3895162e -> :sswitch_2
        -0x2ad0ace7 -> :sswitch_0
        -0x2a09dc70 -> :sswitch_5
        -0x19f0b96d -> :sswitch_1
        -0x58e9d42 -> :sswitch_3
        0x5c0bbcf -> :sswitch_5
        0x19962666 -> :sswitch_2
        0x1bf7aafa -> :sswitch_0
        0x2d3167c1 -> :sswitch_4
        0x42c59f72 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
