.class public final Ll/ۤۜܽ;
.super Ljava/lang/Object;
.source "M5I6"

# interfaces
.implements Ll/ۙۜܽ;


# instance fields
.field public final ۗ:Ll/ܺۢᩴ;

.field public ۙ:I

.field public final ᩶:Ll/֫᩷ܽ;

.field public ᩸:[B

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x400

    .line 31
    invoke-direct {p0, v0}, Ll/ۤۜܽ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 228
    new-instance v0, Ll/۫ۜܽ;

    invoke-direct {v0, p0}, Ll/۫ۜܽ;-><init>(Ll/ۤۜܽ;)V

    iput-object v0, p0, Ll/ۤۜܽ;->᩶:Ll/֫᩷ܽ;

    .line 423
    new-instance v0, Ll/ܺۢᩴ;

    invoke-direct {v0}, Ll/ܺۢᩴ;-><init>()V

    iput-object v0, p0, Ll/ۤۜܽ;->ۗ:Ll/ܺۢᩴ;

    .line 35
    new-array p1, p1, [B

    iput-object p1, p0, Ll/ۤۜܽ;->᩸:[B

    const/4 p1, 0x0

    .line 36
    iput p1, p0, Ll/ۤۜܽ;->᩹:I

    .line 37
    iput p1, p0, Ll/ۤۜܽ;->ۙ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۤۜܽ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۤۜܽ;->ۙ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۤۜܽ;)[B
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۤۜܽ;->᩸:[B

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۤۜܽ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۤۜܽ;->ۙ:I

    return p0
.end method

.method private ܳ(I)V
    .locals 4

    .line 400
    iget-object v0, p0, Ll/ۤۜܽ;->᩸:[B

    array-length v1, v0

    sub-int v1, p1, v1

    if-lez v1, :cond_4

    .line 406
    array-length v1, v0

    shl-int/lit8 v1, v1, 0x1

    sub-int v2, v1, p1

    if-gez v2, :cond_0

    move v1, p1

    :cond_0
    const v2, 0x7ffffff7

    sub-int v3, v1, v2

    if-lez v3, :cond_3

    if-ltz p1, :cond_2

    if-le p1, v2, :cond_1

    const v1, 0x7fffffff

    goto :goto_0

    :cond_1
    const v1, 0x7ffffff7

    goto :goto_0

    .line 417
    :cond_2
    new-instance p1, Ljava/lang/OutOfMemoryError;

    invoke-direct {p1}, Ljava/lang/OutOfMemoryError;-><init>()V

    throw p1

    .line 412
    :cond_3
    :goto_0
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Ll/ۤۜܽ;->᩸:[B

    :cond_4
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method

.method public final getPosition()J
    .locals 2

    .line 78
    iget v0, p0, Ll/ۤۜܽ;->ۙ:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public final length()J
    .locals 2

    .line 335
    iget v0, p0, Ll/ۤۜܽ;->᩹:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public final seek(J)V
    .locals 3

    const-wide/16 v0, -0x1

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    .line 63
    iget p1, p0, Ll/ۤۜܽ;->᩹:I

    iput p1, p0, Ll/ۤۜܽ;->ۙ:I

    return-void

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    .line 64
    iget v0, p0, Ll/ۤۜܽ;->᩹:I

    int-to-long v0, v0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_1

    long-to-int p2, p1

    .line 67
    iput p2, p0, Ll/ۤۜܽ;->ۙ:I

    return-void

    .line 65
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final size()I
    .locals 1

    .line 339
    iget v0, p0, Ll/ۤۜܽ;->᩹:I

    return v0
.end method

.method public final skipBytes(I)V
    .locals 1

    .line 322
    iget v0, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/2addr v0, p1

    invoke-direct {p0, v0}, Ll/ۤۜܽ;->ܳ(I)V

    .line 323
    iget v0, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/2addr v0, p1

    iput v0, p0, Ll/ۤۜܽ;->ۙ:I

    .line 324
    iget p1, p0, Ll/ۤۜܽ;->᩹:I

    if-le v0, p1, :cond_0

    .line 325
    iput v0, p0, Ll/ۤۜܽ;->᩹:I

    :cond_0
    return-void
.end method

.method public final write([B)V
    .locals 2

    const/4 v0, 0x0

    .line 44
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/ۤۜܽ;->write([BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 2

    if-ltz p2, :cond_1

    .line 49
    array-length v0, p1

    if-gt p2, v0, :cond_1

    if-ltz p3, :cond_1

    add-int v0, p2, p3

    array-length v1, p1

    sub-int/2addr v0, v1

    if-gtz v0, :cond_1

    .line 53
    iget v0, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/2addr v0, p3

    invoke-direct {p0, v0}, Ll/ۤۜܽ;->ܳ(I)V

    .line 54
    iget-object v0, p0, Ll/ۤۜܽ;->᩸:[B

    iget v1, p0, Ll/ۤۜܽ;->ۙ:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 55
    iget p1, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/ۤۜܽ;->ۙ:I

    .line 56
    iget p2, p0, Ll/ۤۜܽ;->᩹:I

    if-le p1, p2, :cond_0

    .line 57
    iput p1, p0, Ll/ۤۜܽ;->᩹:I

    :cond_0
    return-void

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final writeByte(I)V
    .locals 3

    .line 83
    iget v0, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Ll/ۤۜܽ;->ܳ(I)V

    .line 84
    iget-object v0, p0, Ll/ۤۜܽ;->᩸:[B

    iget v1, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۤۜܽ;->ۙ:I

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    .line 85
    iget p1, p0, Ll/ۤۜܽ;->᩹:I

    if-le v2, p1, :cond_0

    .line 86
    iput v2, p0, Ll/ۤۜܽ;->᩹:I

    :cond_0
    return-void
.end method

.method public final writeInt(I)V
    .locals 5

    .line 136
    iget v0, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/lit8 v0, v0, 0x4

    invoke-direct {p0, v0}, Ll/ۤۜܽ;->ܳ(I)V

    .line 137
    iget-object v0, p0, Ll/ۤۜܽ;->᩸:[B

    iget v1, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۤۜܽ;->ۙ:I

    and-int/lit16 v3, p1, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v3, v1, 0x2

    .line 138
    iput v3, p0, Ll/ۤۜܽ;->ۙ:I

    ushr-int/lit8 v4, p1, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v0, v2

    add-int/lit8 v2, v1, 0x3

    .line 139
    iput v2, p0, Ll/ۤۜܽ;->ۙ:I

    ushr-int/lit8 v4, p1, 0x10

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v0, v3

    add-int/lit8 v1, v1, 0x4

    .line 140
    iput v1, p0, Ll/ۤۜܽ;->ۙ:I

    ushr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v0, v2

    .line 141
    iget p1, p0, Ll/ۤۜܽ;->᩹:I

    if-le v1, p1, :cond_0

    .line 142
    iput v1, p0, Ll/ۤۜܽ;->᩹:I

    :cond_0
    return-void
.end method

.method public final ֫()V
    .locals 3

    .line 437
    iget-object v0, p0, Ll/ۤۜܽ;->ۗ:Ll/ܺۢᩴ;

    invoke-virtual {v0}, Ll/ۤܿᩴ;->ܿ()I

    move-result v0

    .line 438
    iget-object v1, p0, Ll/ۤۜܽ;->᩸:[B

    iget v2, p0, Ll/ۤۜܽ;->ۙ:I

    sub-int/2addr v2, v0

    add-int/lit8 v2, v2, -0x4

    invoke-static {v0, v2, v1}, Ll/ܺܰۡ;->֫(II[B)V

    return-void
.end method

.method public final ֫(C)V
    .locals 4

    .line 127
    iget v0, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/lit8 v0, v0, 0x2

    invoke-direct {p0, v0}, Ll/ۤۜܽ;->ܳ(I)V

    .line 128
    iget-object v0, p0, Ll/ۤۜܽ;->᩸:[B

    iget v1, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۤۜܽ;->ۙ:I

    and-int/lit16 v3, p1, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v1, v1, 0x2

    .line 129
    iput v1, p0, Ll/ۤۜܽ;->ۙ:I

    ushr-int/lit8 p1, p1, 0x8

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v0, v2

    .line 130
    iget p1, p0, Ll/ۤۜܽ;->᩹:I

    if-le v1, p1, :cond_0

    .line 131
    iput v1, p0, Ll/ۤۜܽ;->᩹:I

    :cond_0
    return-void
.end method

.method public final ֫(F)V
    .locals 0

    .line 173
    invoke-static {p1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۤۜܽ;->writeInt(I)V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 71
    iput p1, p0, Ll/ۤۜܽ;->᩹:I

    .line 72
    iget v0, p0, Ll/ۤۜܽ;->ۙ:I

    if-le v0, p1, :cond_0

    .line 73
    iput p1, p0, Ll/ۤۜܽ;->ۙ:I

    :cond_0
    return-void
.end method

.method public final ֫(ILjava/lang/String;)V
    .locals 3

    .line 304
    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    move-result-object p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 306
    :goto_0
    array-length v2, p2

    if-ge v1, v2, :cond_0

    if-eqz p1, :cond_0

    add-int/lit8 v2, v1, 0x1

    .line 307
    aget-char v1, p2, v1

    invoke-virtual {p0, v1}, Ll/ۤۜܽ;->֫(C)V

    add-int/lit8 p1, p1, -0x1

    move v1, v2

    goto :goto_0

    :cond_0
    if-lez p1, :cond_1

    mul-int/lit8 p1, p1, 0x2

    .line 312
    iget p2, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/2addr p2, p1

    invoke-direct {p0, p2}, Ll/ۤۜܽ;->ܳ(I)V

    .line 313
    iget-object p2, p0, Ll/ۤۜܽ;->᩸:[B

    iget v1, p0, Ll/ۤۜܽ;->ۙ:I

    add-int v2, v1, p1

    invoke-static {p2, v1, v2, v0}, Ljava/util/Arrays;->fill([BIIB)V

    .line 314
    iget p2, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/2addr p2, p1

    iput p2, p0, Ll/ۤۜܽ;->ۙ:I

    .line 315
    iget p1, p0, Ll/ۤۜܽ;->᩹:I

    if-le p2, p1, :cond_1

    .line 316
    iput p2, p0, Ll/ۤۜܽ;->᩹:I

    :cond_1
    return-void
.end method

.method public final ֫(Ljava/io/OutputStream;)V
    .locals 3

    .line 371
    iget-object v0, p0, Ll/ۤۜܽ;->᩸:[B

    const/4 v1, 0x0

    iget v2, p0, Ll/ۤۜܽ;->᩹:I

    invoke-virtual {p1, v0, v1, v2}, Ljava/io/OutputStream;->write([BII)V

    return-void
.end method

.method public final ֫(Ljava/lang/Boolean;)V
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 96
    invoke-virtual {p0, p1}, Ll/ۤۜܽ;->writeByte(I)V

    return-void

    .line 97
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    .line 98
    invoke-virtual {p0, p1}, Ll/ۤۜܽ;->writeByte(I)V

    return-void

    :cond_1
    const/4 p1, 0x2

    .line 100
    invoke-virtual {p0, p1}, Ll/ۤۜܽ;->writeByte(I)V

    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 238
    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->writeInt(I)V

    return-void

    .line 240
    :cond_0
    invoke-static {p1}, Ll/ۛۖܽ;->֫(Ljava/lang/CharSequence;)I

    move-result v1

    .line 241
    invoke-virtual {p0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 242
    iget v2, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/2addr v2, v1

    invoke-direct {p0, v2}, Ll/ۤۜܽ;->ܳ(I)V

    .line 244
    :try_start_0
    iget-object v1, p0, Ll/ۤۜܽ;->᩶:Ll/֫᩷ܽ;

    .line 273
    invoke-static {v1, p1, v0}, Ll/ۛۖܽ;->֫(Ll/֫᩷ܽ;Ljava/lang/CharSequence;Z)V

    .line 245
    iget p1, p0, Ll/ۤۜܽ;->ۙ:I

    iget v0, p0, Ll/ۤۜܽ;->᩹:I

    if-le p1, v0, :cond_1

    .line 246
    iput p1, p0, Ll/ۤۜܽ;->᩹:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception p1

    .line 248
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 91
    invoke-virtual {p0, p1}, Ll/ۤۜܽ;->writeByte(I)V

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 297
    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->֫(Z)V

    .line 298
    invoke-virtual {p0, p1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(S)V
    .locals 4

    .line 106
    iget v0, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/lit8 v0, v0, 0x2

    invoke-direct {p0, v0}, Ll/ۤۜܽ;->ܳ(I)V

    .line 107
    iget-object v0, p0, Ll/ۤۜܽ;->᩸:[B

    iget v1, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۤۜܽ;->ۙ:I

    and-int/lit16 v3, p1, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v1, v1, 0x2

    .line 108
    iput v1, p0, Ll/ۤۜܽ;->ۙ:I

    ushr-int/lit8 p1, p1, 0x8

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v0, v2

    .line 109
    iget p1, p0, Ll/ۤۜܽ;->᩹:I

    if-le v1, p1, :cond_0

    .line 110
    iput v1, p0, Ll/ۤۜܽ;->᩹:I

    :cond_0
    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    if-eqz p1, :cond_0

    const/16 p1, 0xff

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 91
    :goto_0
    invoke-virtual {p0, p1}, Ll/ۤۜܽ;->writeByte(I)V

    return-void
.end method

.method public final ֫([I)V
    .locals 8

    .line 183
    iget v0, p0, Ll/ۤۜܽ;->ۙ:I

    array-length v1, p1

    mul-int/lit8 v1, v1, 0x4

    add-int/2addr v1, v0

    invoke-direct {p0, v1}, Ll/ۤۜܽ;->ܳ(I)V

    .line 184
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget v2, p1, v1

    .line 185
    iget-object v3, p0, Ll/ۤۜܽ;->᩸:[B

    iget v4, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Ll/ۤۜܽ;->ۙ:I

    and-int/lit16 v6, v2, 0xff

    int-to-byte v6, v6

    aput-byte v6, v3, v4

    add-int/lit8 v6, v4, 0x2

    .line 186
    iput v6, p0, Ll/ۤۜܽ;->ۙ:I

    ushr-int/lit8 v7, v2, 0x8

    and-int/lit16 v7, v7, 0xff

    int-to-byte v7, v7

    aput-byte v7, v3, v5

    add-int/lit8 v5, v4, 0x3

    .line 187
    iput v5, p0, Ll/ۤۜܽ;->ۙ:I

    ushr-int/lit8 v7, v2, 0x10

    and-int/lit16 v7, v7, 0xff

    int-to-byte v7, v7

    aput-byte v7, v3, v6

    add-int/lit8 v4, v4, 0x4

    .line 188
    iput v4, p0, Ll/ۤۜܽ;->ۙ:I

    ushr-int/lit8 v2, v2, 0x18

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v3, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 190
    :cond_0
    iget p1, p0, Ll/ۤۜܽ;->ۙ:I

    iget v0, p0, Ll/ۤۜܽ;->᩹:I

    if-le p1, v0, :cond_1

    .line 191
    iput p1, p0, Ll/ۤۜܽ;->᩹:I

    :cond_1
    return-void
.end method

.method public final ֫(Ljava/security/MessageDigest;)[B
    .locals 3

    .line 389
    iget-object v0, p0, Ll/ۤۜܽ;->᩸:[B

    const/4 v1, 0x0

    iget v2, p0, Ll/ۤۜܽ;->᩹:I

    invoke-virtual {p1, v0, v1, v2}, Ljava/security/MessageDigest;->update([BII)V

    .line 390
    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    return-object p1
.end method

.method public final ۖ()[B
    .locals 3

    .line 359
    iget-object v0, p0, Ll/ۤۜܽ;->᩸:[B

    const/4 v1, 0x0

    iget v2, p0, Ll/ۤۜܽ;->᩹:I

    invoke-static {v1, v2, v0}, Ll/ۘۤۡ;->֫(II[B)[B

    move-result-object v0

    return-object v0
.end method

.method public final ۘ()[B
    .locals 2

    .line 364
    :try_start_0
    iget-object v0, p0, Ll/ۤۜܽ;->᩸:[B

    iget v1, p0, Ll/ۤۜܽ;->᩹:I

    invoke-static {v0, v1}, Ll/۠ۨۡ;->֫([BI)[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 366
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final ۜ()[B
    .locals 2

    .line 355
    iget-object v0, p0, Ll/ۤۜܽ;->᩸:[B

    iget v1, p0, Ll/ۤۜܽ;->᩹:I

    invoke-static {v0, v1}, Ll/ۘۤۡ;->֫([BI)[B

    move-result-object v0

    return-object v0
.end method

.method public final ۡ(I)V
    .locals 4

    if-ltz p1, :cond_1

    const v0, 0xffff

    if-gt p1, v0, :cond_1

    .line 118
    iget v0, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/lit8 v0, v0, 0x2

    invoke-direct {p0, v0}, Ll/ۤۜܽ;->ܳ(I)V

    .line 119
    iget-object v0, p0, Ll/ۤۜܽ;->᩸:[B

    iget v1, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۤۜܽ;->ۙ:I

    and-int/lit16 v3, p1, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v1, v1, 0x2

    .line 120
    iput v1, p0, Ll/ۤۜܽ;->ۙ:I

    ushr-int/lit8 p1, p1, 0x8

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v0, v2

    .line 121
    iget p1, p0, Ll/ۤۜܽ;->᩹:I

    if-le v1, p1, :cond_0

    .line 122
    iput v1, p0, Ll/ۤۜܽ;->᩹:I

    :cond_0
    return-void

    .line 116
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Data out of range (UShort): "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 116
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(I)V
    .locals 5

    .line 147
    iget v0, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/lit8 v0, v0, 0x4

    invoke-direct {p0, v0}, Ll/ۤۜܽ;->ܳ(I)V

    .line 148
    iget-object v0, p0, Ll/ۤۜܽ;->᩸:[B

    iget v1, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۤۜܽ;->ۙ:I

    ushr-int/lit8 v3, p1, 0x18

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v3, v1, 0x2

    .line 149
    iput v3, p0, Ll/ۤۜܽ;->ۙ:I

    ushr-int/lit8 v4, p1, 0x10

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v0, v2

    add-int/lit8 v2, v1, 0x3

    .line 150
    iput v2, p0, Ll/ۤۜܽ;->ۙ:I

    ushr-int/lit8 v4, p1, 0x8

    and-int/lit16 v4, v4, 0xff

    int-to-byte v4, v4

    aput-byte v4, v0, v3

    add-int/lit8 v1, v1, 0x4

    .line 151
    iput v1, p0, Ll/ۤۜܽ;->ۙ:I

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v0, v2

    .line 152
    iget p1, p0, Ll/ۤۜܽ;->᩹:I

    if-le v1, p1, :cond_0

    .line 153
    iput v1, p0, Ll/ۤۜܽ;->᩹:I

    :cond_0
    return-void
.end method

.method public final ۧ(J)V
    .locals 9

    .line 158
    iget v0, p0, Ll/ۤۜܽ;->ۙ:I

    const/16 v1, 0x8

    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Ll/ۤۜܽ;->ܳ(I)V

    .line 159
    iget-object v0, p0, Ll/ۤۜܽ;->᩸:[B

    iget v2, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/ۤۜܽ;->ۙ:I

    const-wide/16 v4, 0xff

    and-long v6, p1, v4

    long-to-int v7, v6

    int-to-byte v6, v7

    aput-byte v6, v0, v2

    add-int/lit8 v6, v2, 0x2

    .line 160
    iput v6, p0, Ll/ۤۜܽ;->ۙ:I

    ushr-long v7, p1, v1

    and-long/2addr v7, v4

    long-to-int v8, v7

    int-to-byte v7, v8

    aput-byte v7, v0, v3

    add-int/lit8 v3, v2, 0x3

    .line 161
    iput v3, p0, Ll/ۤۜܽ;->ۙ:I

    const/16 v7, 0x10

    ushr-long v7, p1, v7

    and-long/2addr v7, v4

    long-to-int v8, v7

    int-to-byte v7, v8

    aput-byte v7, v0, v6

    add-int/lit8 v6, v2, 0x4

    .line 162
    iput v6, p0, Ll/ۤۜܽ;->ۙ:I

    const/16 v7, 0x18

    ushr-long v7, p1, v7

    and-long/2addr v7, v4

    long-to-int v8, v7

    int-to-byte v7, v8

    aput-byte v7, v0, v3

    add-int/lit8 v3, v2, 0x5

    .line 163
    iput v3, p0, Ll/ۤۜܽ;->ۙ:I

    const/16 v7, 0x20

    ushr-long v7, p1, v7

    and-long/2addr v7, v4

    long-to-int v8, v7

    int-to-byte v7, v8

    aput-byte v7, v0, v6

    add-int/lit8 v6, v2, 0x6

    .line 164
    iput v6, p0, Ll/ۤۜܽ;->ۙ:I

    const/16 v7, 0x28

    ushr-long v7, p1, v7

    and-long/2addr v7, v4

    long-to-int v8, v7

    int-to-byte v7, v8

    aput-byte v7, v0, v3

    add-int/lit8 v3, v2, 0x7

    .line 165
    iput v3, p0, Ll/ۤۜܽ;->ۙ:I

    const/16 v7, 0x30

    ushr-long v7, p1, v7

    and-long/2addr v7, v4

    long-to-int v8, v7

    int-to-byte v7, v8

    aput-byte v7, v0, v6

    add-int/2addr v2, v1

    .line 166
    iput v2, p0, Ll/ۤۜܽ;->ۙ:I

    const/16 v1, 0x38

    ushr-long/2addr p1, v1

    and-long/2addr p1, v4

    long-to-int p2, p1

    int-to-byte p1, p2

    aput-byte p1, v0, v3

    .line 167
    iget p1, p0, Ll/ۤۜܽ;->᩹:I

    if-le v2, p1, :cond_0

    .line 168
    iput v2, p0, Ll/ۤۜܽ;->᩹:I

    :cond_0
    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 91
    invoke-virtual {p0, p1}, Ll/ۤۜܽ;->writeByte(I)V

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 287
    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->֫(Z)V

    .line 288
    invoke-virtual {p0, p1}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ۧ(Ljava/security/MessageDigest;)V
    .locals 3

    .line 382
    iget-object v0, p0, Ll/ۤۜܽ;->᩸:[B

    const/4 v1, 0x0

    iget v2, p0, Ll/ۤۜܽ;->᩹:I

    invoke-virtual {p1, v0, v1, v2}, Ljava/security/MessageDigest;->update([BII)V

    return-void
.end method

.method public final ۧ([B)V
    .locals 2

    .line 196
    array-length v0, p1

    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 v0, 0x0

    .line 197
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/ۤۜܽ;->write([BII)V

    return-void
.end method

.method public final ۧ([I)V
    .locals 3

    .line 222
    array-length v0, p1

    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 223
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget v2, p1, v1

    .line 224
    invoke-virtual {p0, v2}, Ll/ۤۜܽ;->writeInt(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܳ()V
    .locals 2

    .line 429
    iget-object v0, p0, Ll/ۤۜܽ;->ۗ:Ll/ܺۢᩴ;

    iget v1, p0, Ll/ۤۜܽ;->ۙ:I

    .line 454
    invoke-virtual {v0, v1}, Ll/ܺۢᩴ;->add(I)Z

    const/4 v0, 0x0

    .line 430
    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->writeInt(I)V

    return-void
.end method

.method public final ܽ(I)V
    .locals 3

    .line 454
    iget v0, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/lit8 v0, v0, 0x5

    invoke-direct {p0, v0}, Ll/ۤۜܽ;->ܳ(I)V

    .line 455
    iget-object v0, p0, Ll/ۤۜܽ;->᩸:[B

    if-ltz p1, :cond_0

    :goto_0
    const/16 v1, 0x3f

    if-le p1, v1, :cond_1

    .line 458
    iget v1, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۤۜܽ;->ۙ:I

    and-int/lit8 v2, p1, 0x7f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0

    :cond_0
    :goto_1
    const/16 v1, -0x40

    if-ge p1, v1, :cond_1

    .line 463
    iget v1, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۤۜܽ;->ۙ:I

    and-int/lit8 v2, p1, 0x7f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    shr-int/lit8 p1, p1, 0x7

    goto :goto_1

    .line 467
    :cond_1
    iget v1, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۤۜܽ;->ۙ:I

    and-int/lit8 p1, p1, 0x7f

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    .line 468
    iget p1, p0, Ll/ۤۜܽ;->᩹:I

    if-le v2, p1, :cond_2

    .line 469
    iput v2, p0, Ll/ۤۜܽ;->᩹:I

    :cond_2
    return-void
.end method

.method public final ܽ()[B
    .locals 1

    .line 351
    iget-object v0, p0, Ll/ۤۜܽ;->᩸:[B

    return-object v0
.end method

.method public final ܿ(Ljava/lang/String;)V
    .locals 3

    .line 273
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 274
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 275
    aget-byte v2, p1, v1

    if-nez v2, :cond_0

    const/16 v2, 0x20

    .line 276
    aput-byte v2, p1, v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 44
    :cond_1
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/ۤۜܽ;->write([BII)V

    .line 279
    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->writeByte(I)V

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    const/4 v0, 0x0

    .line 343
    iput v0, p0, Ll/ۤۜܽ;->᩹:I

    iput v0, p0, Ll/ۤۜܽ;->ۙ:I

    return-void
.end method

.method public final ᩳ(I)V
    .locals 6

    .line 442
    iget v0, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/lit8 v0, v0, 0x5

    invoke-direct {p0, v0}, Ll/ۤۜܽ;->ܳ(I)V

    .line 443
    iget-object v0, p0, Ll/ۤۜܽ;->᩸:[B

    :goto_0
    int-to-long v1, p1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    const-wide/16 v3, 0x7f

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    .line 445
    iget v1, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۤۜܽ;->ۙ:I

    and-int/lit8 v2, p1, 0x7f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0

    .line 448
    :cond_0
    iget v1, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۤۜܽ;->ۙ:I

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    .line 449
    iget p1, p0, Ll/ۤۜܽ;->᩹:I

    if-le v2, p1, :cond_1

    .line 450
    iput v2, p0, Ll/ۤۜܽ;->᩹:I

    :cond_1
    return-void
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 256
    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->ۡ(I)V

    return-void

    .line 258
    :cond_0
    invoke-static {p1}, Ll/ۛۖܽ;->֫(Ljava/lang/CharSequence;)I

    move-result v1

    .line 259
    invoke-virtual {p0, v1}, Ll/ۤۜܽ;->ۡ(I)V

    .line 260
    iget v2, p0, Ll/ۤۜܽ;->ۙ:I

    add-int/2addr v2, v1

    invoke-direct {p0, v2}, Ll/ۤۜܽ;->ܳ(I)V

    .line 262
    :try_start_0
    iget-object v1, p0, Ll/ۤۜܽ;->᩶:Ll/֫᩷ܽ;

    .line 273
    invoke-static {v1, p1, v0}, Ll/ۛۖܽ;->֫(Ll/֫᩷ܽ;Ljava/lang/CharSequence;Z)V

    .line 263
    iget p1, p0, Ll/ۤۜܽ;->ۙ:I

    iget v0, p0, Ll/ۤۜܽ;->᩹:I

    if-le p1, v0, :cond_1

    .line 264
    iput p1, p0, Ll/ۤۜܽ;->᩹:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception p1

    .line 266
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ᩴ()V
    .locals 3

    .line 477
    iget-object v0, p0, Ll/ۤۜܽ;->᩸:[B

    array-length v1, v0

    iget v2, p0, Ll/ۤۜܽ;->᩹:I

    if-eq v1, v2, :cond_0

    .line 478
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Ll/ۤۜܽ;->᩸:[B

    :cond_0
    return-void
.end method

.method public final ᩷ܽ()V
    .locals 1

    const/4 v0, 0x4

    .line 330
    invoke-virtual {p0, v0}, Ll/ۤۜܽ;->skipBytes(I)V

    return-void
.end method

.method public final ᩻()[B
    .locals 2

    .line 347
    iget-object v0, p0, Ll/ۤۜܽ;->᩸:[B

    iget v1, p0, Ll/ۤۜܽ;->᩹:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0
.end method
