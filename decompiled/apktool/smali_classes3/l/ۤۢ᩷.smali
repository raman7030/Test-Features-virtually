.class public final Ll/ۤۢ᩷;
.super Ldalvik/system/DexClassLoader;
.source "E411"


# instance fields
.field public final synthetic ֫:Ldalvik/system/BaseDexClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ldalvik/system/DexClassLoader;Ldalvik/system/BaseDexClassLoader;)V
    .locals 3

    const v0, -0x3e70a6fa

    sget v1, Ll/ۗ᩵;->֫۠۟:I

    sget v2, Ll/᩺;->ۙۛܶ:I

    .line 60
    iput-object p4, p0, Ll/ۤۢ᩷;->֫:Ldalvik/system/BaseDexClassLoader;

    const/4 p4, 0x0

    invoke-direct {p0, p1, p2, p4, p3}, Ldalvik/system/DexClassLoader;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ClassLoader;)V

    const-string p1, "\u06e4\u1a7a"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x5039

    const p3, -0x6b3c377e

    xor-int/2addr p2, p3

    const p3, -0x2b204a50

    :goto_0
    xor-int/2addr p1, p3

    xor-int p3, v0, v1

    mul-int/lit16 p3, p3, -0x75a5

    shr-int/lit8 p3, p3, 0x1f

    and-int/2addr p2, p3

    xor-int v0, p1, p2

    sparse-switch v0, :sswitch_data_0

    .line 25
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_2

    :sswitch_0
    sget p1, Ll/᩹;->ۤܿܳ:I

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06db\u06dc"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x39

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x6cad

    const p3, -0xaacbfc9

    xor-int/2addr p2, p3

    const p3, 0x65f3fb49

    goto :goto_0

    .line 11
    :sswitch_1
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    const-string p1, "\u06e7\u06db"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x207b

    const p3, -0x42c15a58

    xor-int/2addr p2, p3

    const p3, 0x72b03b7a

    goto :goto_0

    :cond_2
    const-string p1, "\u06db\u06d7"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x14cb

    const p3, 0x536a6e7d

    xor-int/2addr p2, p3

    const p3, 0x6730c557

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    :goto_2
    const-string p1, "\u06d9\u05ab"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x6b4d

    const p3, -0x701c9d49

    xor-int/2addr p2, p3

    const p3, 0x6b2ceb40

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    return-void

    .line 48
    :sswitch_5
    sget p1, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz p1, :cond_3

    const-string p1, "\u06e4\u06dc"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0x6f

    xor-int p2, p1, v1

    mul-int/lit16 p2, p2, 0x7b63

    const p3, 0x2248fadb

    xor-int/2addr p2, p3

    const p3, -0x6834d6cf

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u06d9\u06e7"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int p2, p1, v2

    mul-int/lit16 p2, p2, -0x861

    const p3, 0x65df8a95

    xor-int/2addr p2, p3

    const p3, 0x20a8aa26

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6e1e9518 -> :sswitch_0
        -0x6a62e472 -> :sswitch_4
        -0x6a43d5e0 -> :sswitch_4
        -0x35ff1ffc -> :sswitch_0
        -0x2ddbbadd -> :sswitch_2
        -0x1ec3bcbb -> :sswitch_5
        -0x1b85aee3 -> :sswitch_2
        -0x16730bc7 -> :sswitch_1
        -0x1065313d -> :sswitch_3
        0x344adfc8 -> :sswitch_1
        0x5ecf3451 -> :sswitch_3
        0x68854df2 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final getResource(Ljava/lang/String;)Ljava/net/URL;
    .locals 1

    .line 63
    iget-object v0, p0, Ll/ۤۢ᩷;->֫:Ldalvik/system/BaseDexClassLoader;

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->getResource(Ljava/lang/String;)Ljava/net/URL;

    move-result-object p1

    return-object p1
.end method

.method public final getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/ۤۢ᩷;->֫:Ldalvik/system/BaseDexClassLoader;

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public final getResources(Ljava/lang/String;)Ljava/util/Enumeration;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ۤۢ᩷;->֫:Ldalvik/system/BaseDexClassLoader;

    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->getResources(Ljava/lang/String;)Ljava/util/Enumeration;

    move-result-object p1

    return-object p1
.end method
