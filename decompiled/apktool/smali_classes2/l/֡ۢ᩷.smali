.class public final Ll/֡ۢ᩷;
.super Ll/۟ܶۡ;
.source "517G"


# instance fields
.field public final synthetic ۜ:Ll/ܶۢ᩷;

.field public final synthetic ۡ:Ll/ܽܳ᩷;

.field public final synthetic ۢ:Ljava/util/concurrent/ExecutorService;

.field public ܳ:Ljava/util/ArrayList;

.field public final synthetic ᩷:Ll/ۗܺ᩷;

.field public volatile ᩻:Z


# direct methods
.method public constructor <init>(Ll/ܶۢ᩷;Ll/ۗܺ᩷;Ljava/util/concurrent/ExecutorService;Ll/ܽܳ᩷;)V
    .locals 4

    const/4 v0, 0x0

    const v1, -0x73fc69be

    sget v2, Ll/۠;->ܺܺܶ:I

    sget v3, Ll/֡֡;->֫ۤܳ:I

    .line 45
    iput-object p1, p0, Ll/֡ۢ᩷;->ۜ:Ll/ܶۢ᩷;

    iput-object p2, p0, Ll/֡ۢ᩷;->᩷:Ll/ۗܺ᩷;

    iput-object p3, p0, Ll/֡ۢ᩷;->ۢ:Ljava/util/concurrent/ExecutorService;

    iput-object p4, p0, Ll/֡ۢ᩷;->ۡ:Ll/ܽܳ᩷;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    const-string p1, "\u06df\u0733"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x5e43

    const p3, 0x760e72b0

    xor-int/2addr p2, p3

    const p3, -0x5c8f03b3

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v1, v3

    mul-int/lit16 p3, p3, 0x5539

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v1, p1, p2

    sparse-switch v1, :sswitch_data_0

    .line 15
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result p1

    if-eqz p1, :cond_5

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    sget-boolean p1, Ll/֫ۡ;->۠ۤۜ:Z

    if-nez p1, :cond_9

    goto/16 :goto_2

    .line 30
    :sswitch_1
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    sget p1, Ll/֫ܽ;->ۚ᩷᩹:I

    if-gez p1, :cond_b

    goto/16 :goto_2

    .line 21
    :sswitch_2
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    sget p1, Ll/ۖ۫;->ۖ֫ܿ:I

    if-gez p1, :cond_7

    goto/16 :goto_1

    .line 41
    :sswitch_3
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    const/4 p1, 0x1

    .line 47
    iput-boolean p1, p0, Ll/֡ۢ᩷;->᩻:Z

    return-void

    .line 46
    :sswitch_6
    iput-object v0, p0, Ll/֡ۢ᩷;->ܳ:Ljava/util/ArrayList;

    .line 1
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "\u06e2\u06e0"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    mul-int/lit8 p1, p1, 0x47

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x1d9f

    const p3, 0x46b0ca1c

    xor-int/2addr p2, p3

    const p3, -0x6eb21e68

    goto :goto_0

    :cond_0
    const-string p1, "\u06da\u06e1"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, 0x35

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x3401

    const p3, 0xb1bb20d

    xor-int/2addr p2, p3

    const p3, 0x48daad71

    goto :goto_0

    .line 44
    :sswitch_7
    sget-boolean p1, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz p1, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string p1, "\u06db\u06e4"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x7b29

    const p3, -0x426933f4

    xor-int/2addr p2, p3

    const p3, 0x27614660

    goto/16 :goto_0

    .line 21
    :sswitch_8
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result p1

    if-gtz p1, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string p1, "\u06e7\u06d6"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x629b

    const p3, -0x6626b320

    xor-int/2addr p2, p3

    const p3, 0x682ccd63

    goto/16 :goto_0

    :sswitch_9
    sget p1, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz p1, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string p1, "\u073a\u06df"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v3, p1

    mul-int/lit8 p1, p1, -0xf

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, 0x776b

    const p3, -0x2b6c3d3f

    xor-int/2addr p2, p3

    const p3, 0x75b2bd56

    goto/16 :goto_0

    :sswitch_a
    sget p1, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz p1, :cond_4

    goto :goto_1

    :cond_4
    const-string p1, "\u06ec\u0730"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x1347

    const p3, -0x64e2c898

    xor-int/2addr p2, p3

    const p3, -0x1c1d39d4

    goto/16 :goto_0

    :cond_5
    const-string p1, "\u1a74\u05ab"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v2

    mul-int/lit8 p1, p1, -0x55

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x15fd

    const p3, 0xe8c1fe3

    xor-int/2addr p2, p3

    const p3, -0x4a21d163

    goto/16 :goto_0

    .line 4
    :sswitch_b
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result p1

    if-eqz p1, :cond_6

    :goto_1
    const-string p1, "\u1a76\u073d"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x131

    const p3, -0x759cfdfa

    xor-int/2addr p2, p3

    const p3, -0x5b5f3a7a

    goto/16 :goto_0

    :cond_6
    const-string p1, "\u06d7\u06e1"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x52b5

    const p3, -0x18aba9c6

    xor-int/2addr p2, p3

    const p3, -0x76a8fab9

    goto/16 :goto_0

    .line 42
    :sswitch_c
    sget p1, Ll/ۖ;->᩹۟ۘ:I

    if-ltz p1, :cond_8

    :cond_7
    :goto_2
    const-string p1, "\u073a\u06da"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x7aff

    const p3, -0x5d10a7b7

    xor-int/2addr p2, p3

    const p3, 0x69132f0f

    goto/16 :goto_0

    :cond_8
    const-string p1, "\u1a77\u06ec"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x7a3d

    const p3, -0x1fd3d79b

    xor-int/2addr p2, p3

    const p3, -0x4032b7b1

    goto/16 :goto_0

    .line 12
    :sswitch_d
    sget p1, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz p1, :cond_a

    :cond_9
    :goto_3
    const-string p1, "\u06eb\u06e2"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x19

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, -0x54f7

    const p3, 0x2311e593

    xor-int/2addr p2, p3

    const p3, -0x294abca6

    goto/16 :goto_0

    :cond_a
    const-string p1, "\u1a75\u06eb"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v3, p1

    mul-int/lit8 p1, p1, -0x65

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x11ab

    const p3, 0x41e0699e

    xor-int/2addr p2, p3

    const p3, 0x3be4aeb7

    goto/16 :goto_0

    .line 46
    :sswitch_e
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 44
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result p1

    if-eqz p1, :cond_c

    :cond_b
    :goto_4
    const-string p1, "\u1a73\u073a"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v3

    mul-int/lit8 p1, p1, 0x71

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x2f6f

    const p3, -0x7293d481

    xor-int/2addr p2, p3

    const p3, 0xf9cbbdd

    goto/16 :goto_0

    :cond_c
    const-string p1, "\u1a79\u06e2"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x41

    xor-int p2, p1, v3

    mul-int/lit16 p2, p2, 0x2129

    const p3, 0x6fb20d44

    xor-int/2addr p2, p3

    const p3, 0x754f2ff3

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7f4ab915 -> :sswitch_0
        -0x754bd001 -> :sswitch_b
        -0x7535b18f -> :sswitch_2
        -0x723c39c9 -> :sswitch_5
        -0x6a492b5c -> :sswitch_3
        -0x639db416 -> :sswitch_1
        -0x618e208f -> :sswitch_5
        -0x50ac3feb -> :sswitch_2
        -0x4dc23752 -> :sswitch_c
        -0x4938e536 -> :sswitch_1
        -0x465843bd -> :sswitch_9
        -0x444ade25 -> :sswitch_4
        -0x26232b15 -> :sswitch_7
        -0x243b7fbe -> :sswitch_6
        -0x1e49101c -> :sswitch_7
        -0x1780c3cc -> :sswitch_d
        0x10423d26 -> :sswitch_e
        0x1280e53e -> :sswitch_e
        0x15533b46 -> :sswitch_4
        0x1f4706a3 -> :sswitch_9
        0x3e991f89 -> :sswitch_a
        0x436b6e51 -> :sswitch_b
        0x47d26d50 -> :sswitch_8
        0x5bbc9dbd -> :sswitch_d
        0x5c227b37 -> :sswitch_a
        0x5d6d5e63 -> :sswitch_6
        0x61ae9143 -> :sswitch_0
        0x645bb6ba -> :sswitch_8
        0x6f405601 -> :sswitch_3
        0x6fc56fa0 -> :sswitch_c
    .end sparse-switch
.end method

.method public static synthetic ֫(Ll/֡ۢ᩷;Ljava/util/concurrent/ExecutorService;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x5e846f1d

    sget v2, Ll/֫ܽ;->ۚ᩷᩹:I

    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    const-string v4, "\u06d6\u073a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x26ab

    const v6, -0x2e09981d

    xor-int/2addr v5, v6

    const v6, 0x5d3961e7

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x395

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 35
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v4

    if-gez v4, :cond_6

    goto/16 :goto_3

    .line 12
    :sswitch_0
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget v4, Ll/۟;->ۗۤۛ:I

    if-eqz v4, :cond_a

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result v4

    if-eqz v4, :cond_4

    goto/16 :goto_3

    .line 35
    :sswitch_2
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    goto/16 :goto_3

    .line 28
    :sswitch_3
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    return-void

    .line 55
    :sswitch_4
    invoke-static {v0}, Ll/ۘۨ;->ۙ᩻۠(Ljava/lang/Object;)V

    .line 56
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    return-void

    .line 55
    :sswitch_5
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    .line 10
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u06dc\u06e2"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1541

    const v6, 0x4305d785

    xor-int/2addr v5, v6

    const v6, 0x56da6003

    goto :goto_0

    .line 41
    :sswitch_6
    sget v4, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v4, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string v4, "\u1a7a\u0736"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x51

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x386d

    const v6, 0x5659b4e9

    xor-int/2addr v5, v6

    const v6, -0x180a4fa1

    goto :goto_0

    .line 55
    :sswitch_7
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v4

    if-gtz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v4, "\u06e4\u1a79"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x67

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x60b9

    const v6, -0x4a43caaf

    xor-int/2addr v5, v6

    const v6, -0x11abfa4c

    goto/16 :goto_0

    .line 36
    :sswitch_8
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v4

    if-gtz v4, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v4, "\u1a79\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0xcf3

    const v6, 0x30d8b5f7

    xor-int/2addr v5, v6

    const v6, -0x9bd4121

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v4

    if-ltz v4, :cond_5

    :cond_4
    const-string v4, "\u1a74\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x23

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6835

    const v6, 0x20e39011

    xor-int/2addr v5, v6

    const v6, 0x4a4ebbe

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06d9\u1a75"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x11

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4e95

    const v6, 0x90a7e4f

    xor-int/2addr v5, v6

    const v6, -0x2ece271a

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v4

    if-gtz v4, :cond_7

    :cond_6
    :goto_1
    const-string v4, "\u0736\u1a79"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x4d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x4a83

    const v6, -0x32e0f544

    xor-int/2addr v5, v6

    const v6, -0x1a76372b

    goto/16 :goto_0

    :cond_7
    const-string v4, "\u06e1\u0730"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x5f01

    const v6, 0x464ce552

    xor-int/2addr v5, v6

    const v6, -0x5191334e

    goto/16 :goto_0

    .line 3
    :sswitch_b
    sget v4, Ll/֡֡;->֫ۤܳ:I

    if-ltz v4, :cond_8

    goto/16 :goto_3

    :cond_8
    const-string v4, "\u05a8\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2c7f

    const v6, -0x1a78fd66

    xor-int/2addr v5, v6

    const v6, -0x7b223075

    goto/16 :goto_0

    .line 41
    :sswitch_c
    sget v4, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v4, :cond_9

    :goto_2
    const-string v4, "\u06ec\u1a78"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x48df

    const v6, -0x2e33e8dc

    xor-int/2addr v5, v6

    const v6, 0x70f42b20

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a75\u1a79"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x30d7

    const v6, 0x6de81b77

    xor-int/2addr v5, v6

    const v6, 0x77698c67

    goto/16 :goto_0

    .line 26
    :sswitch_d
    sget v4, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v4, :cond_b

    :cond_a
    const-string v4, "\u06ec\u1a77"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x71

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4467

    const v6, 0x33c65f8b

    xor-int/2addr v5, v6

    const v6, -0x1b80aead

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u0730\u06e0"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x28a1

    const v6, 0x1407eaa0

    xor-int/2addr v5, v6

    const v6, -0x141cf30f

    goto/16 :goto_0

    :sswitch_e
    sget-boolean v4, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v4, :cond_c

    :goto_3
    const-string v4, "\u1a76\u06e2"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x29

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5de9

    const v6, 0x1fdc418c

    xor-int/2addr v5, v6

    const v6, -0x793543b5

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u1a77\u1a76"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3db9

    const v6, 0x40c9f5cf

    xor-int/2addr v5, v6

    const v6, 0x3d7df6dc

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7656d2c9 -> :sswitch_3
        -0x6534b4cd -> :sswitch_b
        -0x61202fac -> :sswitch_8
        -0x50df7791 -> :sswitch_c
        -0x4484cd8b -> :sswitch_4
        -0x4170adb3 -> :sswitch_0
        -0x33259a17 -> :sswitch_e
        -0x2f20ce0d -> :sswitch_d
        -0x2838c9cc -> :sswitch_9
        -0x222ab75f -> :sswitch_d
        -0x79c2c48 -> :sswitch_1
        -0x5ff6a54 -> :sswitch_4
        -0x4b72470 -> :sswitch_0
        0x35b715c -> :sswitch_e
        0xae8d22a -> :sswitch_2
        0x153ed96e -> :sswitch_a
        0x1722a361 -> :sswitch_a
        0x21a25f32 -> :sswitch_5
        0x267df971 -> :sswitch_8
        0x30222815 -> :sswitch_5
        0x3d007094 -> :sswitch_1
        0x43cf992d -> :sswitch_9
        0x4949e6fd -> :sswitch_3
        0x5441f1d0 -> :sswitch_7
        0x63e4c0e1 -> :sswitch_c
        0x67a25a73 -> :sswitch_7
        0x6a2a9977 -> :sswitch_2
        0x720b1db7 -> :sswitch_6
        0x78606196 -> :sswitch_b
        0x7fac6447 -> :sswitch_6
    .end sparse-switch
.end method

.method public static synthetic ֫(Ll/֡ۢ᩷;Ll/ۗܺ᩷;Ljava/util/concurrent/ExecutorService;)V
    .locals 6

    const v0, -0x49761f83

    sget v1, Ll/ۗ᩷;->᩸᩺ᩳ:I

    sget v2, Ll/ۘۘ;->᩷ۙ᩸:I

    const-string v3, "\u06e1\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x69

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x39b

    const v5, 0x302e6ffc

    xor-int/2addr v4, v5

    const v5, 0x7418c7c7

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x26dd

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 10
    sget v3, Ll/᩹;->ۤܿܳ:I

    if-eqz v3, :cond_7

    goto/16 :goto_4

    .line 5
    :sswitch_0
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v3

    if-gez v3, :cond_a

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v3

    if-ltz v3, :cond_c

    goto/16 :goto_4

    :sswitch_2
    sget v3, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v3, :cond_6

    goto :goto_1

    .line 1
    :sswitch_3
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    :goto_1
    const-string v3, "\u06e4\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x61db

    const v5, -0x7d4cd47a

    xor-int/2addr v4, v5

    const v5, -0x249e8ef2

    goto :goto_0

    :sswitch_4
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    return-void

    .line 53
    :sswitch_5
    invoke-static {p0, p1}, Ll/ۗ᩺;->ۡܰ۬(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    iget-object v3, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    new-instance v4, Ll/᩵ۢ᩷;

    .line 20
    sget v5, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v5, :cond_0

    goto/16 :goto_3

    .line 54
    :cond_0
    invoke-direct {v4, p0, p2}, Ll/᩵ۢ᩷;-><init>(Ll/֡ۢ᩷;Ljava/util/concurrent/ExecutorService;)V

    invoke-virtual {v3, v4}, Ll/۬۬ܿ;->֫(Ljava/lang/Runnable;)V

    goto :goto_2

    :sswitch_6
    return-void

    .line 52
    :sswitch_7
    iget-boolean v3, p0, Ll/֡ۢ᩷;->᩻:Z

    if-eqz v3, :cond_1

    const-string v3, "\u06ec\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5663

    const v5, 0x651aee43

    xor-int/2addr v4, v5

    const v5, -0x7bab4188

    goto :goto_0

    :cond_1
    :goto_2
    const-string v3, "\u1a78\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x761b

    const v5, 0xaa06aad

    xor-int/2addr v4, v5

    const v5, 0x394644a3

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/֨۟;->᩹֫᩷:I

    if-eqz v3, :cond_2

    goto :goto_3

    :cond_2
    const-string v3, "\u06e1\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x25e1

    const v5, 0x6e193377

    xor-int/2addr v4, v5

    const v5, -0x75aece97

    goto/16 :goto_0

    .line 21
    :sswitch_9
    sget v3, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v3, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v3, "\u1a75\u0730"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x35

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6419

    const v5, 0x19bc3ed5

    xor-int/2addr v4, v5

    const v5, 0x2b6a777f

    goto/16 :goto_0

    .line 8
    :sswitch_a
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_3

    :cond_4
    const-string v3, "\u1a74\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x28ef

    const v5, -0x38a9f733

    xor-int/2addr v4, v5

    const v5, 0x50f8aa0

    goto/16 :goto_0

    .line 20
    :sswitch_b
    sget-boolean v3, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v3, :cond_5

    :goto_3
    const-string v3, "\u073d\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x43

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7c5b

    const v5, -0x56d3241b

    xor-int/2addr v4, v5

    const v5, -0x6cc4a588

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u06da\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xc93

    const v5, 0x74197b1e

    xor-int/2addr v4, v5

    const v5, -0x4873dcbc

    goto/16 :goto_0

    :cond_6
    :goto_4
    const-string v3, "\u06dc\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x5b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x493d

    const v5, 0x52358f81

    xor-int/2addr v4, v5

    const v5, 0x473cc1be

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06d6\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x51b7

    const v5, 0x2eaeea4d

    xor-int/2addr v4, v5

    const v5, -0x4453532b

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/۟;->ۗۤۛ:I

    if-eqz v3, :cond_8

    goto :goto_5

    :cond_8
    const-string v3, "\u06e2\u06da"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x23

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4d77

    const v5, -0x4e8c7d08

    xor-int/2addr v4, v5

    const v5, -0x255b5aae

    goto/16 :goto_0

    .line 12
    :sswitch_d
    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v3, :cond_9

    goto :goto_6

    :cond_9
    const-string v3, "\u0730\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1709

    const v5, -0x49ed2731

    xor-int/2addr v4, v5

    const v5, -0x2e4b9b9a

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v3, :cond_b

    :cond_a
    :goto_5
    const-string v3, "\u06da\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1c57

    const v5, 0x5db49b8b

    xor-int/2addr v4, v5

    const v5, -0x429c7ed2

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06db\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x61bd

    const v5, -0x288b9a21

    xor-int/2addr v4, v5

    const v5, 0x58259111

    goto/16 :goto_0

    :sswitch_f
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v3

    if-ltz v3, :cond_d

    :cond_c
    :goto_6
    const-string v3, "\u1a74\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x75

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x15e9

    const v5, -0x5ad7a9a8

    xor-int/2addr v4, v5

    const v5, 0x463f8c33

    goto/16 :goto_0

    :cond_d
    const-string v3, "\u06ec\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2343

    const v5, 0xe633566

    xor-int/2addr v4, v5

    const v5, -0x665de48    # -1.000372E35f

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x76e12372 -> :sswitch_3
        -0x66413053 -> :sswitch_b
        -0x4d3ff8ac -> :sswitch_c
        -0x46a45a3c -> :sswitch_f
        -0x45749f29 -> :sswitch_4
        -0x3df92147 -> :sswitch_6
        -0x3ccaea4d -> :sswitch_a
        -0x3372600d -> :sswitch_0
        -0x2ed2a5f5 -> :sswitch_7
        -0x25b9459b -> :sswitch_b
        -0x204a34b0 -> :sswitch_1
        -0xe748ffa -> :sswitch_9
        -0x44f106d -> :sswitch_7
        0x2d343a8 -> :sswitch_0
        0xb946941 -> :sswitch_8
        0xd1d115e -> :sswitch_e
        0x1e2110a3 -> :sswitch_d
        0x25335cc1 -> :sswitch_c
        0x2614af99 -> :sswitch_e
        0x39cf87dc -> :sswitch_d
        0x430b39fb -> :sswitch_a
        0x47d82e96 -> :sswitch_5
        0x48ec9b2d -> :sswitch_4
        0x49e49bff -> :sswitch_1
        0x58afb26f -> :sswitch_6
        0x5cecd4f9 -> :sswitch_f
        0x61540958 -> :sswitch_3
        0x6d2da9d7 -> :sswitch_8
        0x6dfc6ed6 -> :sswitch_2
        0x70d3a215 -> :sswitch_5
        0x735d9c70 -> :sswitch_9
        0x7906b354 -> :sswitch_2
    .end sparse-switch
.end method


# virtual methods
.method public final ֫()V
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, -0x25954654

    sget v6, Ll/ۗ᩷;->᩸᩺ᩳ:I

    sget v7, Ll/ۘܿ;->ۘܰ۫:I

    const-string v8, "\u0733\u073f"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x1c81

    const v10, -0x551f81d4

    xor-int/2addr v9, v10

    const v10, 0x4d2e692e    # 1.8288304E8f

    :goto_0
    xor-int/2addr v8, v10

    :goto_1
    xor-int/2addr v5, v7

    mul-int/lit16 v5, v5, -0x3099

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    sget v8, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v8, :cond_8

    goto/16 :goto_5

    .line 32
    :sswitch_0
    sget-boolean v8, Ll/֫᩺;->֫ܰۨ:Z

    if-nez v8, :cond_a

    goto/16 :goto_5

    :sswitch_1
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget v8, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-gez v8, :cond_4

    goto/16 :goto_5

    .line 37
    :sswitch_2
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    goto/16 :goto_5

    .line 61
    :sswitch_3
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    return-void

    .line 82
    :sswitch_4
    new-instance v8, Ll/ۜۧᩳ;

    .line 39
    sget-boolean v9, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v9, :cond_0

    const-string v8, "\u1a74\u073f"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x71

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x4a3

    const v10, 0x3363b12e    # 5.30137E-8f

    xor-int/2addr v9, v10

    const v10, -0x782596d8

    goto :goto_0

    .line 82
    :cond_0
    iget-object v9, p0, Ll/֡ۢ᩷;->᩷:Ll/ۗܺ᩷;

    iget-object v10, p0, Ll/֡ۢ᩷;->ۡ:Ll/ܽܳ᩷;

    sget v11, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v11, :cond_1

    goto/16 :goto_5

    :cond_1
    invoke-direct {v8, v9, v10, v3}, Ll/ۜۧᩳ;-><init>(Ll/ۗܺ᩷;Ll/ܽܳ᩷;Lbin/mt/plugin/api/translation/TranslationEngine;)V

    invoke-static {v4, v8}, Ll/֫ܺ;->ܽۚ᩸(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto/16 :goto_7

    :sswitch_5
    invoke-static {v2}, Ll/ܶۢ᩷;->ܽ(Ll/ܶۢ᩷;)Ljava/util/ArrayList;

    move-result-object v4

    sget-boolean v8, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v8, :cond_2

    goto :goto_2

    :cond_2
    const-string v8, "\u1a77\u1a79"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v6, v8

    mul-int/lit8 v8, v8, 0x3d

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x1b55

    const v10, 0x426aa46b

    xor-int/2addr v9, v10

    const v10, 0x4e8f699a

    goto :goto_0

    .line 50
    :sswitch_6
    sget-boolean v8, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v8, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v8, "\u05a1\u1a73"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, -0x61

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x433

    const v10, 0x7cec5a8

    xor-int/2addr v9, v10

    const v10, -0xbbfd874

    goto/16 :goto_0

    :sswitch_7
    sget v8, Ll/֨۟;->᩹֫᩷:I

    if-eqz v8, :cond_5

    :cond_4
    :goto_2
    const-string v8, "\u1a73\u073f"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x70bb

    const v10, 0x575e9bba

    xor-int/2addr v9, v10

    const v10, 0x163e297

    goto/16 :goto_0

    :cond_5
    const-string v8, "\u073a\u06ec"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x1721

    const v10, 0xa36a55e

    xor-int/2addr v9, v10

    const v10, 0x6be506f3

    goto/16 :goto_0

    :sswitch_8
    sget v8, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v8, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v8, "\u073f\u05a1"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0xa0b

    const v10, -0x609ce5e0

    xor-int/2addr v9, v10

    const v10, -0x4508887e

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v8, Ll/֨۫;->۬᩷᩶:Z

    if-nez v8, :cond_7

    goto :goto_4

    :cond_7
    const-string v8, "\u1a77\u06d8"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v6

    mul-int/lit8 v8, v8, 0x1d

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x40ed

    const v10, 0x5c7968aa

    xor-int/2addr v9, v10

    const v10, -0x52ca7409

    goto/16 :goto_0

    .line 56
    :sswitch_a
    sget v8, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v8, :cond_9

    :cond_8
    :goto_3
    const-string v8, "\u06e2\u06db"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    mul-int/lit8 v8, v8, -0x15

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x969

    const v10, -0x5acd0e20

    xor-int/2addr v9, v10

    const v10, -0x36bacd78    # -807720.5f

    goto/16 :goto_0

    :cond_9
    const-string v8, "\u06ec\u1a78"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x7279

    const v10, -0x5dcf3226

    xor-int/2addr v9, v10

    const v10, -0x503b7a41

    goto/16 :goto_0

    :sswitch_b
    sget v8, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v8, :cond_b

    :cond_a
    :goto_4
    const-string v8, "\u0733\u06db"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x6b

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0xd3

    const v10, 0x7c8e1704

    xor-int/2addr v9, v10

    const v10, -0x76773ab9

    goto/16 :goto_0

    :cond_b
    const-string v8, "\u06d8\u1a75"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x3441

    const v10, 0x4e0a61ef    # 5.804185E8f

    xor-int/2addr v9, v10

    const v10, 0x2e5dbf80

    goto/16 :goto_0

    .line 81
    :sswitch_c
    invoke-static {v1}, Ll/ۖۘ;->ᩴۛۚ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbin/mt/plugin/api/translation/TranslationEngine;

    .line 74
    sget v8, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v8, :cond_c

    :goto_5
    const-string v8, "\u05ab\u073f"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x39

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x203

    const v10, 0x1f185afe

    xor-int/2addr v9, v10

    const v10, 0x79f96b14

    goto/16 :goto_0

    :cond_c
    const-string v8, "\u073d\u073d"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x2c79

    const v10, 0x333a4ab1

    xor-int/2addr v9, v10

    const v10, 0x35ba1c8

    goto/16 :goto_0

    .line 84
    :sswitch_d
    invoke-static {v2}, Ll/ܶۢ᩷;->ᩳ(Ll/ܶۢ᩷;)V

    :sswitch_e
    return-void

    .line 81
    :sswitch_f
    invoke-static {v1}, Ll/֡ܶ;->ۛܿ᩻(Ljava/lang/Object;)Z

    move-result v2

    iget-object v8, p0, Ll/֡ۢ᩷;->ۜ:Ll/ܶۢ᩷;

    if-eqz v2, :cond_d

    const-string v2, "\u06d8\u073d"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v6, v2

    mul-int/lit8 v2, v2, 0x57

    xor-int v9, v2, v7

    mul-int/lit16 v9, v9, 0x2b45

    const v10, -0x349b844b    # -1.4973877E7f

    xor-int/2addr v9, v10

    const v10, 0x61a6dc2b

    goto :goto_6

    :cond_d
    const-string v2, "\u05a1\u0730"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v7

    mul-int/lit8 v2, v2, -0x23

    xor-int v9, v2, v6

    mul-int/lit16 v9, v9, 0x30d9

    const v10, 0x1623585d

    xor-int/2addr v9, v10

    const v10, 0x124facbf

    :goto_6
    xor-int/2addr v2, v10

    move-object v12, v8

    move v8, v2

    move-object v2, v12

    goto/16 :goto_1

    .line 79
    :sswitch_10
    invoke-virtual {v0}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v8

    if-eqz v8, :cond_e

    const-string v8, "\u1a7a\u0733"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x59

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0xddf

    const v10, 0x3b8c58f6

    xor-int/2addr v9, v10

    const v10, 0x37cc17d

    goto/16 :goto_0

    .line 81
    :sswitch_11
    iget-object v1, p0, Ll/֡ۢ᩷;->ܳ:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/ۘᩴ;->ۤ֡ۖ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    const-string v8, "\u05a8\u06e0"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x36b3

    const v10, 0x55c80bbf

    xor-int/2addr v9, v10

    const v10, 0x15fcf277

    goto/16 :goto_0

    .line 79
    :sswitch_12
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    if-eqz v0, :cond_e

    const-string v8, "\u06d6\u06e1"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x3bd3

    const v10, 0xaa26770

    xor-int/2addr v9, v10

    const v10, 0x176a78bf

    goto/16 :goto_0

    :cond_e
    const-string v8, "\u06e2\u1a77"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x38d

    const v10, -0x3295e5

    xor-int/2addr v9, v10

    const v10, -0x70f2b08e

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7961203a -> :sswitch_c
        -0x74ffa850 -> :sswitch_b
        -0x69221ca2 -> :sswitch_e
        -0x64dea77d -> :sswitch_4
        -0x5e8d6f66 -> :sswitch_5
        -0x5d72c1a6 -> :sswitch_12
        -0x4d621ff0 -> :sswitch_7
        -0x453d76ff -> :sswitch_8
        -0x327c1118 -> :sswitch_1
        -0x3046da15 -> :sswitch_0
        -0x24e2a393 -> :sswitch_7
        -0x20ae3780 -> :sswitch_9
        -0x1c410e27 -> :sswitch_6
        -0x1a6d0720 -> :sswitch_6
        -0xd58ec76 -> :sswitch_f
        0x756b17f -> :sswitch_11
        0x15545033 -> :sswitch_10
        0x1aa65fc5 -> :sswitch_4
        0x259153d8 -> :sswitch_3
        0x27278a53 -> :sswitch_c
        0x279f656b -> :sswitch_9
        0x2cc442ef -> :sswitch_12
        0x31a2a03d -> :sswitch_8
        0x32af9444 -> :sswitch_11
        0x32ce9e51 -> :sswitch_2
        0x3e89bc54 -> :sswitch_1
        0x49372f04 -> :sswitch_d
        0x49859aa5 -> :sswitch_0
        0x4bbc27ff -> :sswitch_d
        0x4fb70a73 -> :sswitch_5
        0x4fb79cb0 -> :sswitch_a
        0x5337feac -> :sswitch_b
        0x55e8f1b7 -> :sswitch_a
        0x608a1416 -> :sswitch_2
        0x6bb5ccd4 -> :sswitch_e
        0x741689e2 -> :sswitch_f
        0x76806fd9 -> :sswitch_10
        0x7b0554fb -> :sswitch_3
    .end sparse-switch
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 7

    const/4 v0, 0x0

    const v1, -0x353898b

    sget v2, Ll/ۛ;->᩺᩻֫:I

    sget v3, Ll/֨᩺;->ۨ֨۬:I

    const-string v4, "\u1a73\u06db"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x9

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x362f

    const v6, 0x3c35ca94

    xor-int/2addr v5, v6

    const v6, 0xc819ead

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, 0x1e6d

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 42
    sget v4, Ll/֡֡;->֫ۤܳ:I

    if-ltz v4, :cond_d

    goto/16 :goto_4

    .line 70
    :sswitch_0
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    sget-boolean v4, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v4, :cond_5

    goto/16 :goto_2

    :sswitch_1
    sget v4, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v4, :cond_b

    goto/16 :goto_1

    :sswitch_2
    sget v4, Ll/֨۟;->᩹֫᩷:I

    if-nez v4, :cond_8

    goto/16 :goto_1

    .line 86
    :sswitch_3
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    goto/16 :goto_1

    :sswitch_4
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    :sswitch_5
    return-void

    .line 89
    :sswitch_6
    invoke-virtual {v0}, Ll/۬۬ܿ;->ᩳ()Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "\u06db\u06da"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x2b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x693d

    const v6, 0x5a7b23d4

    xor-int/2addr v5, v6

    const v6, -0x75bc6648

    goto :goto_0

    .line 91
    :sswitch_7
    iget-object v0, p0, Ll/֡ۢ᩷;->ۡ:Ll/ܽܳ᩷;

    invoke-virtual {v0, p1}, Ll/ܽܳ᩷;->֫(Ljava/lang/Throwable;)V

    return-void

    .line 89
    :sswitch_8
    iget-object v0, p0, Ll/۟ܶۡ;->ۧ:Ll/۬۬ܿ;

    if-eqz v0, :cond_0

    const-string v4, "\u06d9\u1a77"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x313b

    const v6, 0xf7f54f5

    xor-int/2addr v5, v6

    const v6, -0x6a061b5c

    goto :goto_0

    :cond_0
    const-string v4, "\u06db\u073a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x77

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x18ab

    const v6, 0x512c03f8

    xor-int/2addr v5, v6

    const v6, -0xfdb8eeb

    goto/16 :goto_0

    :sswitch_9
    sget v4, Ll/֡֡;->֫ۤܳ:I

    if-ltz v4, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v4, "\u06df\u05ab"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x5f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x34ad

    const v6, 0x49d2a0e5

    xor-int/2addr v5, v6

    const v6, 0x7359607b

    goto/16 :goto_0

    :sswitch_a
    sget v4, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u1a7b\u1a73"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x35

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x61ad

    const v6, 0x5a1f40e2

    xor-int/2addr v5, v6

    const v6, 0x1416585

    goto/16 :goto_0

    .line 51
    :sswitch_b
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_1

    :cond_3
    const-string v4, "\u1a73\u06da"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x21

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3931

    const v6, -0x3657cd17

    xor-int/2addr v5, v6

    const v6, 0x40db1679

    goto/16 :goto_0

    :sswitch_c
    sget v4, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v4, :cond_4

    :goto_1
    const-string v4, "\u1a77\u06ec"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7b4d

    const v6, -0x72a078c

    xor-int/2addr v5, v6

    const v6, -0x45922f0

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u06e1\u073f"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x19

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x714f

    const v6, 0x6c08a569

    xor-int/2addr v5, v6

    const v6, -0xb1e5812

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v4

    if-eqz v4, :cond_6

    :cond_5
    const-string v4, "\u0730\u05a8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x13

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xb83

    const v6, 0x13524fed

    xor-int/2addr v5, v6

    const v6, -0x11358594

    goto/16 :goto_0

    :cond_6
    const-string v4, "\u06e1\u05ab"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0xd

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x729f

    const v6, -0x6058a8cf

    xor-int/2addr v5, v6

    const v6, 0x6cdcb931

    goto/16 :goto_0

    .line 25
    :sswitch_e
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v4

    if-eqz v4, :cond_7

    goto :goto_2

    :cond_7
    const-string v4, "\u06ec\u06db"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x3b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1b4f

    const v6, 0x630bcc9f

    xor-int/2addr v5, v6

    const v6, 0x6051c391

    goto/16 :goto_0

    .line 49
    :sswitch_f
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-eqz v4, :cond_9

    :cond_8
    :goto_2
    const-string v4, "\u05a8\u1a75"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0xb05

    const v6, -0x427bbfcc

    xor-int/2addr v5, v6

    const v6, -0x72101ad4

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06d7\u1a73"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x6f

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6825

    const v6, 0x6426dfab

    xor-int/2addr v5, v6

    const v6, 0x4da6949f    # 3.49344736E8f

    goto/16 :goto_0

    :sswitch_10
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v4

    if-eqz v4, :cond_a

    goto :goto_4

    :cond_a
    const-string v4, "\u0736\u1a7a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4c85

    const v6, 0x16273471

    xor-int/2addr v5, v6

    const v6, 0x4c149914    # 3.8954064E7f

    goto/16 :goto_0

    .line 78
    :sswitch_11
    sget v4, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_3
    const-string v4, "\u06e8\u073d"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x71a1

    const v6, 0x5a10d0a7

    xor-int/2addr v5, v6

    const v6, 0x8903c7b

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06da\u06d9"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x77eb

    const v6, 0x55e20582

    xor-int/2addr v5, v6

    const v6, 0x76c87ac0

    goto/16 :goto_0

    :goto_4
    const-string v4, "\u06d9\u1a74"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x43

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x79f7

    const v6, -0x52ea960d

    xor-int/2addr v5, v6

    const v6, -0x28854a25

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u05a8\u1a74"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1ad3

    const v6, -0x171b3bf5

    xor-int/2addr v5, v6

    const v6, -0x7d87a018

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x75e22131 -> :sswitch_1
        -0x5edcbcb9 -> :sswitch_f
        -0x5bc1c1c5 -> :sswitch_8
        -0x4d0288ab -> :sswitch_f
        -0x4be26c43 -> :sswitch_7
        -0x499d3ab9 -> :sswitch_4
        -0x4790c22f -> :sswitch_4
        -0x31da088b -> :sswitch_3
        -0x2c5214bb -> :sswitch_10
        -0x29cc2e72 -> :sswitch_6
        -0x1d84fd55 -> :sswitch_c
        -0x1a583e87 -> :sswitch_2
        -0x14e5031f -> :sswitch_9
        0x39f53ea -> :sswitch_a
        0x3d8c622 -> :sswitch_d
        0x61ab4a9 -> :sswitch_7
        0x864ba83 -> :sswitch_b
        0x1c3c65b4 -> :sswitch_6
        0x1c587abe -> :sswitch_9
        0x2077807f -> :sswitch_a
        0x2169f811 -> :sswitch_b
        0x28fa086f -> :sswitch_e
        0x2e3f18f9 -> :sswitch_1
        0x2fed7f55 -> :sswitch_8
        0x30eacbe7 -> :sswitch_e
        0x342f5719 -> :sswitch_d
        0x35027a6b -> :sswitch_10
        0x3fb92307 -> :sswitch_3
        0x41ee5bc9 -> :sswitch_c
        0x525e0c10 -> :sswitch_5
        0x597c888f -> :sswitch_0
        0x6a915e96 -> :sswitch_0
        0x6f4fb673 -> :sswitch_11
        0x748a6b88 -> :sswitch_2
        0x766eba25 -> :sswitch_11
        0x79416f88 -> :sswitch_5
    .end sparse-switch
.end method

.method public final ۧ()V
    .locals 7

    const v0, -0x1deb8ba

    sget v1, Ll/ۘܿ;->ۘܰ۫:I

    sget v2, Ll/ۗۚ;->ܶۛᩴ:I

    const-string v3, "\u06e1\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xa3

    const v5, -0x1a6e24af

    xor-int/2addr v4, v5

    const v5, 0x2a34b6b0

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x5fdb

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 50
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v3

    if-eqz v3, :cond_9

    goto :goto_1

    .line 13
    :sswitch_0
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-gez v3, :cond_4

    goto/16 :goto_3

    .line 32
    :sswitch_1
    sget-boolean v3, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v3, :cond_0

    goto/16 :goto_4

    .line 28
    :sswitch_2
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    goto/16 :goto_4

    .line 23
    :sswitch_3
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    return-void

    .line 51
    :sswitch_4
    new-instance v3, Ll/ᩴۢ᩷;

    sget v4, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v4, :cond_1

    :cond_0
    :goto_1
    const-string v3, "\u0733\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x31

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x14cb

    const v5, -0x39219d26

    xor-int/2addr v4, v5

    const v5, 0x84e14cd

    goto :goto_0

    .line 36
    :cond_1
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v4

    if-eqz v4, :cond_2

    goto/16 :goto_5

    .line 11
    :cond_2
    sget v4, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v4, :cond_3

    goto :goto_2

    :cond_3
    sget v4, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v4, :cond_5

    :cond_4
    :goto_2
    const-string v3, "\u06e2\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x122d

    const v5, 0x6b4210ff

    xor-int/2addr v4, v5

    const v5, -0x5c81d285

    goto :goto_0

    .line 33
    :cond_5
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v4

    if-ltz v4, :cond_6

    goto :goto_4

    .line 24
    :cond_6
    sget v4, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v4, :cond_7

    goto :goto_3

    .line 45
    :cond_7
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v4

    if-eqz v4, :cond_8

    goto :goto_3

    :cond_8
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    move-result v4

    if-eqz v4, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u06d9\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x440d

    const v5, -0x4af9187c

    xor-int/2addr v4, v5

    const v5, 0x1375fae0

    goto/16 :goto_0

    .line 51
    :cond_a
    iget-object v4, p0, Ll/֡ۢ᩷;->᩷:Ll/ۗܺ᩷;

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v5

    if-eqz v5, :cond_b

    :goto_4
    const-string v3, "\u06d8\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x251d

    const v5, 0x754ab4e8

    xor-int/2addr v4, v5

    const v5, 0x36e407e3

    goto/16 :goto_0

    :cond_b
    iget-object v5, p0, Ll/֡ۢ᩷;->ۢ:Ljava/util/concurrent/ExecutorService;

    .line 6
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v6

    if-gtz v6, :cond_c

    :goto_5
    const-string v3, "\u1a77\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x1f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5a97

    const v5, -0x76a628a8

    xor-int/2addr v4, v5

    const v5, 0x5a02a44f

    goto/16 :goto_0

    .line 51
    :cond_c
    invoke-direct {v3, p0, v4, v5}, Ll/ᩴۢ᩷;-><init>(Ll/֡ۢ᩷;Ll/ۗܺ᩷;Ljava/util/concurrent/ExecutorService;)V

    const-wide/16 v0, 0x320

    invoke-static {v3, v0, v1}, Ll/֨ᩴ;->᩷ۢ᩶(Ljava/lang/Object;J)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x64d1cfdb -> :sswitch_1
        -0x386a1cc7 -> :sswitch_4
        -0x33a2b805 -> :sswitch_4
        -0x15fd041 -> :sswitch_2
        0x1f37a4df -> :sswitch_0
        0x275fa07c -> :sswitch_0
        0x57d64577 -> :sswitch_3
        0x74553b99 -> :sswitch_2
        0x765855ee -> :sswitch_1
        0x77d81504 -> :sswitch_3
    .end sparse-switch
.end method

.method public final ܿ()V
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, 0x191c8179

    sget v6, Ll/֫ܿ;->ۨ۫ᩳ:I

    sget v7, Ll/֡۬;->۠֡᩶:I

    const-string v8, "\u1a7b\u06df"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x33e5

    const v10, -0x456a48d7

    xor-int/2addr v9, v10

    const v10, -0x2f34d96

    :goto_0
    xor-int/2addr v8, v10

    move-object v10, v0

    :goto_1
    xor-int/2addr v5, v6

    mul-int/lit16 v5, v5, 0x22b1

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v5, v9

    xor-int/2addr v5, v8

    sparse-switch v5, :sswitch_data_0

    .line 68
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    sget v8, Ll/۟;->ۗۤۛ:I

    if-eqz v8, :cond_3

    goto :goto_2

    .line 2
    :sswitch_0
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    sget v8, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v8, :cond_9

    goto :goto_3

    .line 19
    :sswitch_1
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    sget v8, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v8, :cond_0

    goto :goto_3

    :cond_0
    :goto_2
    const-string v8, "\u06eb\u05ab"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    add-int/2addr v8, v7

    mul-int/lit8 v8, v8, 0x13

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x133

    const v11, -0x3cac2e06

    xor-int/2addr v9, v11

    const v11, -0x5fd7da51

    goto/16 :goto_8

    .line 32
    :sswitch_2
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    sget v8, Ll/ۗ۬;->ۘܳ᩻:I

    if-lez v8, :cond_1

    goto/16 :goto_6

    :cond_1
    :goto_3
    const-string v8, "\u1a77\u06da"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x36dd

    const v11, 0x44ba5f0f

    xor-int/2addr v9, v11

    const v11, -0x73ab09fb

    goto/16 :goto_8

    :sswitch_3
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    goto/16 :goto_6

    .line 37
    :sswitch_4
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    return-void

    .line 72
    :sswitch_5
    invoke-virtual {v1, v4}, Ll/ܽܳ᩷;->֫(Ljava/lang/Throwable;)V

    goto/16 :goto_4

    .line 68
    :sswitch_6
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lbin/mt/plugin/api/translation/TranslationEngine;

    .line 69
    invoke-virtual {v1}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v9

    invoke-interface {v8, v9}, Lbin/mt/plugin/api/translation/TranslationEngine;->init(Lbin/mt/plugin/api/PluginContext;)V

    .line 70
    iget-object v9, p0, Ll/֡ۢ᩷;->ܳ:Ljava/util/ArrayList;

    invoke-static {v9, v8}, Ll/۟;->ᩴۗᩳ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v4

    const-string v8, "\u0730\u073f"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x693b

    const v11, -0x6f972937

    xor-int/2addr v9, v11

    const v11, -0x2247656b

    goto/16 :goto_8

    .line 66
    :sswitch_7
    invoke-static {v2}, Ll/ۖۘ;->ᩴۛۚ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    const-string v8, "\u1a78\u05a8"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x2445

    const v11, 0x6dc04de7

    xor-int/2addr v9, v11

    const v11, 0x5869751e

    goto/16 :goto_8

    :sswitch_8
    return-void

    :sswitch_9
    invoke-static {v2}, Ll/֡ܶ;->ۛܿ᩻(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const-string v8, "\u06d7\u1a7b"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x6329

    const v11, -0x740c9b1d

    xor-int/2addr v9, v11

    const v11, -0x2e409677

    goto/16 :goto_8

    :cond_2
    const-string v8, "\u06e7\u06db"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, 0x3c9

    const v11, -0x1762a8a3

    xor-int/2addr v9, v11

    const v11, 0x4a789c2b    # 4073226.8f

    goto/16 :goto_8

    .line 65
    :sswitch_a
    iget-object v1, p0, Ll/֡ۢ᩷;->ۡ:Ll/ܽܳ᩷;

    invoke-virtual {v1, v10}, Ll/ܽܳ᩷;->ᩳ(Ljava/util/ArrayList;)V

    .line 66
    invoke-static {v10}, Ll/ۘᩴ;->ۤ֡ۖ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    const-string v8, "\u1a79\u06e7"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    sub-int v8, v7, v8

    mul-int/lit8 v8, v8, -0x7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x403

    const v11, 0x24f05805

    xor-int/2addr v9, v11

    const v11, -0x61e2eebc

    goto/16 :goto_8

    .line 64
    :sswitch_b
    new-instance v10, Ljava/util/ArrayList;

    .line 58
    sget-boolean v8, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v8, :cond_4

    :cond_3
    const-string v8, "\u1a7b\u073d"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, 0x5c3d

    const v10, -0x43b842fe

    xor-int/2addr v9, v10

    const v10, 0x626d534d

    goto/16 :goto_0

    .line 57
    :cond_4
    sget-boolean v8, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v8, :cond_5

    goto :goto_5

    .line 45
    :cond_5
    sget v8, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v8, :cond_6

    goto :goto_6

    :cond_6
    sget v8, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v8, :cond_7

    goto :goto_5

    .line 24
    :cond_7
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v8

    if-eqz v8, :cond_8

    goto :goto_5

    .line 2
    :cond_8
    sget v8, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v8, :cond_a

    :cond_9
    :goto_5
    const-string v8, "\u06d7\u073a"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v7

    xor-int v9, v8, v6

    mul-int/lit16 v9, v9, -0x5cef

    const v10, 0xe8be3ef

    xor-int/2addr v9, v10

    const v10, 0x4986e02e    # 1104901.8f

    goto/16 :goto_0

    .line 3
    :cond_a
    sget v8, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v8, :cond_b

    goto :goto_7

    :cond_b
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v8

    if-eqz v8, :cond_c

    goto :goto_7

    :cond_c
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v8

    if-nez v8, :cond_d

    :goto_6
    const-string v8, "\u0736\u073d"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x18d

    const v10, 0x7070b9bd

    xor-int/2addr v9, v10

    const v10, -0x2a4d6871

    goto/16 :goto_0

    .line 64
    :cond_d
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 38
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v8

    if-ltz v8, :cond_e

    :goto_7
    const-string v8, "\u05ab\u06d7"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x5ef9

    const v10, 0xe70416d

    xor-int/2addr v9, v10

    const v10, -0x758a9472

    goto/16 :goto_0

    :cond_e
    const-string v8, "\u1a79\u1a78"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int/2addr v8, v6

    xor-int v9, v8, v7

    mul-int/lit16 v9, v9, -0x310f

    const v11, 0x49d1af82    # 1717744.2f

    xor-int/2addr v9, v11

    const v11, 0x62d26255

    :goto_8
    xor-int/2addr v8, v11

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e6e2a81 -> :sswitch_4
        -0x7a63dcc6 -> :sswitch_7
        -0x76642753 -> :sswitch_5
        -0x73462b56 -> :sswitch_6
        -0x6b4371b9 -> :sswitch_3
        -0x30452561 -> :sswitch_9
        -0x21a986cb -> :sswitch_0
        -0x1a1b3551 -> :sswitch_b
        -0x43d959a -> :sswitch_a
        0x544159e -> :sswitch_1
        0x1011a7fc -> :sswitch_b
        0x13000e4e -> :sswitch_0
        0x1be4fed1 -> :sswitch_8
        0x1c359181 -> :sswitch_4
        0x364dcb58 -> :sswitch_1
        0x36f2897d -> :sswitch_a
        0x36f982a6 -> :sswitch_9
        0x40810c2f -> :sswitch_6
        0x529303fe -> :sswitch_8
        0x5659dba7 -> :sswitch_7
        0x5c9458b9 -> :sswitch_5
        0x6384d1b7 -> :sswitch_3
        0x670499aa -> :sswitch_2
        0x79ae6adc -> :sswitch_2
    .end sparse-switch
.end method

.method public final ᩳ()V
    .locals 1

    const/4 v0, 0x0

    .line 96
    iput-boolean v0, p0, Ll/֡ۢ᩷;->᩻:Z

    .line 97
    invoke-static {p0}, Ll/ۘۨ;->ܺܿ᩺(Ljava/lang/Object;)V

    return-void
.end method
