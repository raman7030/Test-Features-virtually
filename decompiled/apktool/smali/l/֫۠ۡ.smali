.class public final Ll/֫۠ۡ;
.super Ljava/lang/Thread;
.source "E4FN"


# instance fields
.field public final synthetic ᩶:Ljava/lang/String;

.field public final synthetic ᩸:Ll/ۛۚۡ;

.field public final synthetic ᩹:Ll/ܰ֡ۡ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x18

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ll/ۛۚۡ;Ll/ܰ֡ۡ;)V
    .locals 3

    const v0, 0x620ea0c8

    sget v1, Ll/ۨ;->᩺᩷ۚ:I

    sget v2, Ll/֡᩶;->ܳܶ۠:I

    .line 587
    iput-object p1, p0, Ll/֫۠ۡ;->᩶:Ljava/lang/String;

    iput-object p2, p0, Ll/֫۠ۡ;->᩸:Ll/ۛۚۡ;

    iput-object p3, p0, Ll/֫۠ۡ;->᩹:Ll/ܰ֡ۡ;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u06df\u06e0"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x237b

    const p3, -0x1cd04a47

    xor-int/2addr p2, p3

    const p3, 0x7d69e221

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v1

    mul-int/lit16 p3, p3, -0x5b39

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 30
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 212
    :sswitch_0
    sget p1, Ll/ۖ;->᩹۟ۘ:I

    if-ltz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u0733\u073f"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x194f

    const p3, 0x25e9c7ba

    xor-int/2addr p2, p3

    const p3, 0x516ab216    # 6.3000633E10f

    goto :goto_0

    .line 6
    :sswitch_1
    sget p1, Ll/ۘۨ;->۫᩸۠:I

    if-ltz p1, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    const-string p1, "\u1a77\u06ec"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x59

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x4b5f

    const p3, -0x7eb36551

    xor-int/2addr p2, p3

    const p3, 0x5e2315b4

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result p1

    if-gtz p1, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    const-string p1, "\u1a7a\u0730"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x7587

    const p3, 0x4638e32d

    xor-int/2addr p2, p3

    const p3, -0x64f32019

    goto :goto_0

    .line 465
    :sswitch_3
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    :goto_3
    const-string p1, "\u073d\u06e7"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x20fb

    const p3, 0x16820f88

    xor-int/2addr p2, p3

    const p3, -0x1a1c1a9c

    goto :goto_0

    :sswitch_4
    return-void

    .line 384
    :sswitch_5
    sget-boolean p1, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez p1, :cond_3

    const-string p1, "\u06d6\u05ab"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x19d7

    const p3, 0x70bdb12f

    xor-int/2addr p2, p3

    const p3, -0x4c7619e0

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u073f\u073a"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, -0x1f

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x7fbb

    const p3, 0x1006dd6d

    xor-int/2addr p2, p3

    const p3, 0x4f52111d

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7abf8cba -> :sswitch_1
        -0x63960acb -> :sswitch_2
        -0x56a10765 -> :sswitch_0
        -0x5043ff48 -> :sswitch_5
        -0x4f4215ca -> :sswitch_1
        -0x4d7b32ce -> :sswitch_4
        -0x3e40f4a9 -> :sswitch_3
        -0x16c62f0d -> :sswitch_0
        0x19b3d2a -> :sswitch_4
        0x8f982ae -> :sswitch_3
        0x1a4e4843 -> :sswitch_2
        0x27d9d686 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
