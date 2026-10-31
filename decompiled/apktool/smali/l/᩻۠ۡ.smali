.class public final Ll/᩻۠ۡ;
.super Ljava/lang/Thread;
.source "E4FN"


# instance fields
.field public final synthetic ۙ:Ljava/lang/String;

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/ۛۚۡ;

.field public final synthetic ᩹:Ll/ۢۚۡ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa4

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ll/ۛۚۡ;Ll/ۢۚۡ;)V
    .locals 3

    const v0, 0x6c96b030

    sget v1, Ll/֫ܽ;->ۚ᩷᩹:I

    sget v2, Ll/֡᩺;->ᩴ᩹ۛ:I

    .line 966
    iput p1, p0, Ll/᩻۠ۡ;->᩶:I

    iput-object p2, p0, Ll/᩻۠ۡ;->ۙ:Ljava/lang/String;

    iput-object p3, p0, Ll/᩻۠ۡ;->᩸:Ll/ۛۚۡ;

    iput-object p4, p0, Ll/᩻۠ۡ;->᩹:Ll/ۢۚۡ;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u06df\u1a76"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, 0x2f

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x6d7d

    const p3, -0x724e1887

    xor-int/2addr p2, p3

    const p3, -0x3a21bcf4

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v2

    mul-int/lit16 p3, p3, -0x7733

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 215
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_0
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    sget p1, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06e4\u073f"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x3ce3

    const p3, -0x1f5d513d

    xor-int/2addr p2, p3

    const p3, 0x237442c3

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    const-string p1, "\u06d7\u06da"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x63a3

    const p3, -0x10b7d6a3

    xor-int/2addr p2, p3

    const p3, -0x25a8e1b2

    goto :goto_0

    .line 4
    :sswitch_2
    sget p1, Ll/֨᩺;->ۨ֨۬:I

    if-lez p1, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    const-string p1, "\u1a76\u06d8"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x5f

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x4d2d

    const p3, 0x4dc9d72

    xor-int/2addr p2, p3

    const p3, -0x68c46233

    goto :goto_0

    .line 115
    :sswitch_3
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    :goto_3
    const-string p1, "\u0733\u1a73"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x7d

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x6a19

    const p3, 0x3559d0b6

    xor-int/2addr p2, p3

    const p3, -0x79a32022

    goto/16 :goto_0

    :sswitch_4
    return-void

    .line 716
    :sswitch_5
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result p1

    if-gtz p1, :cond_3

    const-string p1, "\u06e0\u06e1"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x264d

    const p3, -0x6e00626b

    xor-int/2addr p2, p3

    const p3, 0x6c038644

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06e8\u1a76"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, 0x53

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0xc8d

    const p3, -0x4786e52b

    xor-int/2addr p2, p3

    const p3, 0x3822b2fd

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x52c47bfb -> :sswitch_1
        -0x445625c7 -> :sswitch_3
        -0x21f7a91 -> :sswitch_0
        0xd7442d1 -> :sswitch_5
        0x1e1b0d26 -> :sswitch_2
        0x26376682 -> :sswitch_1
        0x4bb41b87 -> :sswitch_2
        0x559516e8 -> :sswitch_5
        0x591c22e8 -> :sswitch_3
        0x6a69b1c9 -> :sswitch_4
        0x74b1ee69 -> :sswitch_4
        0x7e9e81c4 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
