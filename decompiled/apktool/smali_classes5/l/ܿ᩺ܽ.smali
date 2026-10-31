.class public Ll/ܿ᩺ܽ;
.super Ll/ۗۘ;
.source "B97X"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2}, Ll/ۗۘ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    const v0, -0x33f8ecef    # -3.5408964E7f

    sget v1, Ll/֫ۧ;->ۙ۟ۧ:I

    sget v2, Ll/ۘۨ;->۫᩸۠:I

    .line 20
    invoke-direct {p0, p1, p2, p3}, Ll/ۗۘ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-string p1, "\u1a74\u1a76"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x59

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x60c1

    const p3, -0x1a8c2b31

    xor-int/2addr p2, p3

    const p3, -0x229dd7bf

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v2

    mul-int/lit16 p3, p3, 0xf63

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result p1

    if-gez p1, :cond_1

    goto :goto_2

    :sswitch_0
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    sget p1, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u073f\u06e4"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x414b

    const p3, 0x18d1f85d

    xor-int/2addr p2, p3

    const p3, 0x7dada712

    goto :goto_0

    :cond_1
    :goto_1
    const-string p1, "\u1a73\u1a78"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x5de1

    const p3, 0x62869061

    xor-int/2addr p2, p3

    const p3, 0x712ca6cf

    goto :goto_0

    .line 18
    :sswitch_1
    sget-boolean p1, Ll/ۘ᩶;->ܶۗۡ:Z

    if-eqz p1, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    const-string p1, "\u1a79\u1a7b"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x7f

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x47e3

    const p3, 0xb97f1d0

    xor-int/2addr p2, p3

    const p3, 0x6e5b3be0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    :goto_3
    const-string p1, "\u0736\u1a76"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x69

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x4b79

    const p3, -0x59bdd4f7

    xor-int/2addr p2, p3

    const p3, 0x16afb4aa

    goto :goto_0

    .line 0
    :sswitch_3
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 13
    :sswitch_5
    sget p1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz p1, :cond_3

    const-string p1, "\u1a7a\u06eb"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0xb

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x686b

    const p3, -0x59969c06

    xor-int/2addr p2, p3

    const p3, -0x309d6dd7

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06df\u05a1"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x2d

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x5209

    const p3, -0x4365bcc7

    xor-int/2addr p2, p3

    const p3, -0x18624112

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x618a92a5 -> :sswitch_5
        -0x31a784dc -> :sswitch_2
        -0x24fd8063 -> :sswitch_0
        -0x24d0ea05 -> :sswitch_1
        -0x19008c0f -> :sswitch_0
        -0x576fb62 -> :sswitch_3
        0x1df0e257 -> :sswitch_2
        0x3abc034c -> :sswitch_3
        0x5f92895c -> :sswitch_1
        0x6283a8ed -> :sswitch_5
        0x725afdd9 -> :sswitch_4
        0x78adb429 -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final toggle()V
    .locals 0

    return-void
.end method
