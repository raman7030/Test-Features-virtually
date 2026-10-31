.class public final Ll/ܽ۠ۡ;
.super Ljava/lang/Thread;
.source "E4FN"


# static fields
.field private static final ۟ۨܰ:[S


# instance fields
.field public final synthetic ۙ:Ljava/lang/String;

.field public final synthetic ᩶:Ljava/lang/String;

.field public final synthetic ᩸:Ll/ۛۚۡ;

.field public final synthetic ᩹:Ll/ۜۚۡ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x7c

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    const/16 v0, 0xd

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ܽ۠ۡ;->۟ۨܰ:[S

    return-void

    nop

    :array_0
    .array-data 2
        0xbfcs
        0x5a50s
        0x5a7bs
        0x5a50s
        0x5a5fs
        0x5a76s
        0x5a0ds
        0x5a12s
        0x5a55s
        0x5a47s
        0x5a11s
        0x5a12s
        0x5a00s
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ll/ۛۚۡ;Ll/ۜۚۡ;)V
    .locals 3

    const v0, 0x4d3d0711    # 1.98209808E8f

    sget v1, Ll/֡۬;->۠֡᩶:I

    sget v2, Ll/ۗۚ;->ܶۛᩴ:I

    .line 666
    iput-object p1, p0, Ll/ܽ۠ۡ;->ۙ:Ljava/lang/String;

    iput-object p2, p0, Ll/ܽ۠ۡ;->᩶:Ljava/lang/String;

    iput-object p3, p0, Ll/ܽ۠ۡ;->᩸:Ll/ۛۚۡ;

    iput-object p4, p0, Ll/ܽ۠ۡ;->᩹:Ll/ۜۚۡ;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const-string p1, "\u06e1\u05a1"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x7b

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x5eb9

    const p3, 0x66f79a7b

    xor-int/2addr p2, p3

    const p3, -0x7e722c99

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v2

    mul-int/lit16 p3, p3, 0x665b

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    sget p1, Ll/֡֡;->֫ۤܳ:I

    if-gez p1, :cond_1

    goto :goto_2

    :sswitch_0
    sget p1, Ll/֡᩶;->ܳܶ۠:I

    if-gtz p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06db\u06db"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x7a93

    const p3, 0x5003342d

    xor-int/2addr p2, p3

    const p3, -0x1792484f

    goto :goto_0

    :cond_1
    :goto_1
    const-string p1, "\u06d9\u1a7a"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x33

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x47f9

    const p3, -0x6b4cd85a

    xor-int/2addr p2, p3

    const p3, 0x18cc46e

    goto :goto_0

    .line 347
    :sswitch_1
    sget p1, Ll/ۛ;->᩺᩻֫:I

    if-gez p1, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    const-string p1, "\u06df\u1a75"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x4b

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x36d1

    const p3, -0x668eb6

    xor-int/2addr p2, p3

    const p3, 0x22b3b722

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    :goto_3
    const-string p1, "\u06e7\u1a79"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, -0x21

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x1167

    const p3, 0x473fa138

    xor-int/2addr p2, p3

    const p3, 0x14e6f0f6

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 402
    :sswitch_5
    sget p1, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz p1, :cond_3

    const-string p1, "\u05a8\u1a7b"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v1, p1

    mul-int/lit8 p1, p1, -0x79

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x151d

    const p3, 0x5e04bced

    xor-int/2addr p2, p3

    const p3, -0x623f5238

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06db\u06e8"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x7f

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, -0x1d45

    const p3, 0xe8130c2

    xor-int/2addr p2, p3

    const p3, 0x447cddad

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x5b13eb76 -> :sswitch_0
        -0x5884d9b2 -> :sswitch_4
        -0x5215b64f -> :sswitch_0
        -0x43d5d840 -> :sswitch_2
        -0x403c7727 -> :sswitch_2
        -0x24e11c5a -> :sswitch_3
        -0x22d25499 -> :sswitch_3
        -0x1e457866 -> :sswitch_4
        -0x880a6d2 -> :sswitch_1
        0x1ff8f02a -> :sswitch_5
        0x355e91b8 -> :sswitch_1
        0x78bf3c7c -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public native run()V
.end method
