.class public final Ll/ۤۛۡ;
.super Ljava/lang/Object;
.source "86JZ"


# instance fields
.field public final ֫:I

.field public final ۖ:I

.field public final ۘ:I

.field public final ۜ:I

.field public final ۡ:I

.field public final ۢ:I

.field public final ۧ:I

.field public final ܳ:I

.field public final ܺ:I

.field public final ܽ:[B

.field public final ܿ:I

.field public final ᩳ:I

.field public final ᩷:I

.field public final ᩻:I


# direct methods
.method public constructor <init>([B)V
    .locals 6

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    invoke-static {p1}, Ll/ܰۛۡ;->֫([B)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 35
    iput-object p1, p0, Ll/ۤۛۡ;->ܽ:[B

    const/4 v0, 0x0

    .line 36
    aget-byte v1, p1, v0

    and-int/lit16 v1, v1, 0xff

    iput v1, p0, Ll/ۤۛۡ;->ܿ:I

    const/4 v1, 0x2

    .line 37
    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    iput v1, p0, Ll/ۤۛۡ;->ۡ:I

    const/4 v1, 0x3

    .line 38
    invoke-static {v1, p1}, Ll/᩺ۛۡ;->֫(I[B)I

    move-result v1

    iput v1, p0, Ll/ۤۛۡ;->ۜ:I

    const/4 v1, 0x1

    .line 39
    aget-byte v1, p1, v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x5

    invoke-static {v0, p1}, Ll/᩺ۛۡ;->֫(I[B)I

    move-result v0

    :goto_0
    iput v0, p0, Ll/ۤۛۡ;->᩻:I

    const/4 v0, 0x7

    .line 40
    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, Ll/ۤۛۡ;->ܳ:I

    const/16 v0, 0x8

    .line 41
    invoke-static {v0, p1}, Ll/᩺ۛۡ;->֫(I[B)I

    move-result v0

    int-to-short v0, v0

    iput v0, p0, Ll/ۤۛۡ;->ۖ:I

    const/16 v1, 0xa

    .line 42
    invoke-static {v1, p1}, Ll/᩺ۛۡ;->֫(I[B)I

    move-result v1

    int-to-short v1, v1

    iput v1, p0, Ll/ۤۛۡ;->ۘ:I

    const/16 v2, 0xc

    .line 43
    invoke-static {v2, p1}, Ll/᩺ۛۡ;->֫(I[B)I

    move-result v2

    iput v2, p0, Ll/ۤۛۡ;->ۢ:I

    const/16 v3, 0xe

    .line 44
    invoke-static {v3, p1}, Ll/᩺ۛۡ;->֫(I[B)I

    move-result v3

    iput v3, p0, Ll/ۤۛۡ;->᩷:I

    add-int/2addr v0, v2

    .line 45
    iput v0, p0, Ll/ۤۛۡ;->ܺ:I

    add-int/2addr v1, v3

    .line 46
    iput v1, p0, Ll/ۤۛۡ;->ᩳ:I

    const/16 v4, 0x10

    .line 47
    aget-byte v4, p1, v4

    and-int/lit16 v4, v4, 0xff

    iput v4, p0, Ll/ۤۛۡ;->֫:I

    const/16 v4, 0x11

    .line 48
    aget-byte p1, p1, v4

    and-int/lit16 p1, p1, 0xff

    iput p1, p0, Ll/ۤۛۡ;->ۧ:I

    if-lez v0, :cond_2

    if-lez v1, :cond_2

    int-to-long v4, v0

    int-to-long v0, v1

    mul-long v4, v4, v0

    const-wide/32 v0, 0x10000000

    cmp-long p1, v4, v0

    if-gtz p1, :cond_1

    int-to-long v4, v2

    int-to-long v2, v3

    mul-long v4, v4, v2

    cmp-long p1, v4, v0

    if-gtz p1, :cond_1

    return-void

    .line 51
    :cond_1
    new-instance p1, Ll/ۛۛۡ;

    const-string v0, "TGA dimensions exceed decode limits"

    .line 291
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 51
    throw p1

    .line 49
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid TGA canvas dimensions"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 34
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Invalid TGA header"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ll/ۤۛۡ;I)I
    .locals 1

    .line 68
    iget v0, p0, Ll/ۤۛۡ;->ۧ:I

    and-int/lit8 v0, v0, 0x10

    if-nez v0, :cond_0

    iget p0, p0, Ll/ۤۛۡ;->ۖ:I

    sub-int/2addr p1, p0

    return p1

    :cond_0
    iget p0, p0, Ll/ۤۛۡ;->ۢ:I

    add-int/lit8 p0, p0, -0x1

    sub-int/2addr p0, p1

    return p0
.end method

.method public static ۖ(Ll/ۤۛۡ;)Z
    .locals 1

    .line 65
    iget p0, p0, Ll/ۤۛۡ;->ۡ:I

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/16 v0, 0xa

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static bridge synthetic ۜ(Ll/ۤۛۡ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۤۛۡ;->ۢ:I

    return p0
.end method

.method public static ۡ(Ll/ۤۛۡ;)I
    .locals 0

    .line 66
    iget p0, p0, Ll/ۤۛۡ;->֫:I

    add-int/lit8 p0, p0, 0x7

    div-int/lit8 p0, p0, 0x8

    return p0
.end method

.method public static ۢ(Ll/ۤۛۡ;)Z
    .locals 0

    .line 67
    iget p0, p0, Ll/ۤۛۡ;->ۧ:I

    and-int/lit8 p0, p0, 0xf

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ۤۛۡ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۤۛۡ;->֫:I

    return p0
.end method

.method public static ۧ(Ll/ۤۛۡ;I)I
    .locals 1

    .line 69
    iget v0, p0, Ll/ۤۛۡ;->ۧ:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    iget p0, p0, Ll/ۤۛۡ;->ۘ:I

    sub-int/2addr p1, p0

    return p1

    :cond_0
    iget p0, p0, Ll/ۤۛۡ;->᩷:I

    add-int/lit8 p0, p0, -0x1

    sub-int/2addr p0, p1

    return p0
.end method

.method public static bridge synthetic ܳ(Ll/ۤۛۡ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۤۛۡ;->ۜ:I

    return p0
.end method

.method public static ܺ(Ll/ۤۛۡ;)Z
    .locals 1

    .line 64
    iget p0, p0, Ll/ۤۛۡ;->ۡ:I

    const/16 v0, 0x9

    if-lt p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ۤۛۡ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۤۛۡ;->ܿ:I

    return p0
.end method

.method public static ܽ(Ll/ۤۛۡ;I)I
    .locals 1

    .line 70
    iget v0, p0, Ll/ۤۛۡ;->ۧ:I

    and-int/lit8 v0, v0, 0x10

    if-nez v0, :cond_0

    iget p0, p0, Ll/ۤۛۡ;->ۖ:I

    add-int/2addr p1, p0

    return p1

    :cond_0
    iget p0, p0, Ll/ۤۛۡ;->ۢ:I

    add-int/lit8 p0, p0, -0x1

    sub-int/2addr p0, p1

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/ۤۛۡ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۤۛۡ;->᩻:I

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۤۛۡ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۤۛۡ;->ܳ:I

    return p0
.end method

.method public static ᩳ(Ll/ۤۛۡ;I)I
    .locals 1

    .line 71
    iget v0, p0, Ll/ۤۛۡ;->ۧ:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    iget p0, p0, Ll/ۤۛۡ;->ۘ:I

    add-int/2addr p1, p0

    return p1

    :cond_0
    iget p0, p0, Ll/ۤۛۡ;->᩷:I

    add-int/lit8 p0, p0, -0x1

    sub-int/2addr p0, p1

    return p0
.end method

.method public static bridge synthetic ᩷(Ll/ۤۛۡ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۤۛۡ;->ۡ:I

    return p0
.end method

.method public static bridge synthetic ᩻(Ll/ۤۛۡ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۤۛۡ;->᩷:I

    return p0
.end method


# virtual methods
.method public final ֫(Z)J
    .locals 6

    .line 56
    iget v0, p0, Ll/ۤۛۡ;->᩻:I

    int-to-long v0, v0

    const-wide/16 v2, 0x4

    mul-long v0, v0, v2

    const-wide/32 v2, 0x8000

    add-long/2addr v0, v2

    if-eqz p1, :cond_0

    .line 64
    iget p1, p0, Ll/ۤۛۡ;->ۡ:I

    const/16 v2, 0x9

    if-lt p1, v2, :cond_0

    .line 56
    iget p1, p0, Ll/ۤۛۡ;->᩷:I

    int-to-long v2, p1

    const-wide/16 v4, 0x10

    mul-long v2, v2, v4

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x0

    :goto_0
    add-long/2addr v0, v2

    const-wide/16 v2, 0x400

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final ֫(Ll/ۤۛۡ;)V
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ۤۛۡ;->ܽ:[B

    iget-object p1, p1, Ll/ۤۛۡ;->ܽ:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "TGA header changed during decoding"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
