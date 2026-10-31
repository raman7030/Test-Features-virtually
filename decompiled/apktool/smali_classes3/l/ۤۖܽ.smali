.class public final Ll/ۤۖܽ;
.super Ll/۫ۖܽ;
.source "CAQD"


# static fields
.field public static final ۫:[B


# instance fields
.field public ۬:Ljava/util/zip/CRC32;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa

    new-array v0, v0, [B

    .line 123
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۤۖܽ;->۫:[B

    return-void

    :array_0
    .array-data 1
        0x1ft
        -0x75t
        0x8t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 2

    .line 71
    new-instance v0, Ljava/util/zip/Deflater;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v1}, Ljava/util/zip/Deflater;-><init>(IZ)V

    invoke-direct {p0, p1, v0}, Ll/۫ۖܽ;-><init>(Ljava/io/OutputStream;Ljava/util/zip/Deflater;)V

    .line 43
    new-instance p1, Ljava/util/zip/CRC32;

    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    iput-object p1, p0, Ll/ۤۖܽ;->۬:Ljava/util/zip/CRC32;

    .line 72
    iput-boolean v1, p0, Ll/۫ۖܽ;->ۙ:Z

    .line 140
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    sget-object v1, Ll/ۤۖܽ;->۫:[B

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 74
    invoke-virtual {p1}, Ljava/util/zip/CRC32;->reset()V

    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 9

    .line 101
    iget-object v0, p0, Ll/۫ۖܽ;->᩶:Ljava/util/zip/Deflater;

    invoke-virtual {v0}, Ljava/util/zip/Deflater;->finished()Z

    move-result v1

    if-nez v1, :cond_3

    .line 102
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->finish()V

    .line 103
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->finished()Z

    move-result v1

    const v2, 0xffff

    iget-object v3, p0, Ll/ۤۖܽ;->۬:Ljava/util/zip/CRC32;

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-nez v1, :cond_2

    .line 104
    iget-object v1, p0, Ll/۫ۖܽ;->᩸:[B

    array-length v6, v1

    invoke-virtual {v0, v1, v5, v6}, Ljava/util/zip/Deflater;->deflate([BII)I

    move-result v1

    .line 105
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->finished()Z

    move-result v6

    if-eqz v6, :cond_1

    iget-object v6, p0, Ll/۫ۖܽ;->᩸:[B

    array-length v7, v6

    sub-int/2addr v7, v4

    if-gt v1, v7, :cond_1

    .line 148
    invoke-virtual {v3}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v7

    long-to-int v3, v7

    and-int v7, v3, v2

    and-int/lit16 v8, v3, 0xff

    int-to-byte v8, v8

    .line 166
    aput-byte v8, v6, v1

    add-int/lit8 v8, v1, 0x1

    shr-int/2addr v7, v4

    and-int/lit16 v7, v7, 0xff

    int-to-byte v7, v7

    .line 167
    aput-byte v7, v6, v8

    shr-int/lit8 v3, v3, 0x10

    and-int v7, v3, v2

    add-int/lit8 v8, v1, 0x2

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    .line 166
    aput-byte v3, v6, v8

    add-int/lit8 v3, v1, 0x3

    shr-int/2addr v7, v4

    and-int/lit16 v7, v7, 0xff

    int-to-byte v7, v7

    .line 167
    aput-byte v7, v6, v3

    .line 149
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->getTotalIn()I

    move-result v0

    add-int/lit8 v3, v1, 0x4

    and-int v7, v0, v2

    and-int/lit16 v8, v0, 0xff

    int-to-byte v8, v8

    .line 166
    aput-byte v8, v6, v3

    add-int/lit8 v3, v1, 0x5

    shr-int/2addr v7, v4

    and-int/lit16 v7, v7, 0xff

    int-to-byte v7, v7

    .line 167
    aput-byte v7, v6, v3

    shr-int/lit8 v0, v0, 0x10

    and-int/2addr v2, v0

    add-int/lit8 v3, v1, 0x6

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    .line 166
    aput-byte v0, v6, v3

    add-int/lit8 v0, v1, 0x7

    shr-int/2addr v2, v4

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    .line 167
    aput-byte v2, v6, v0

    add-int/2addr v1, v4

    .line 109
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    iget-object v2, p0, Ll/۫ۖܽ;->᩸:[B

    invoke-virtual {v0, v2, v5, v1}, Ljava/io/OutputStream;->write([BII)V

    return-void

    :cond_1
    if-lez v1, :cond_0

    .line 113
    iget-object v2, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    iget-object v3, p0, Ll/۫ۖܽ;->᩸:[B

    invoke-virtual {v2, v3, v5, v1}, Ljava/io/OutputStream;->write([BII)V

    goto/16 :goto_0

    :cond_2
    new-array v1, v4, [B

    .line 148
    invoke-virtual {v3}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v6

    long-to-int v3, v6

    and-int v6, v3, v2

    and-int/lit16 v7, v3, 0xff

    int-to-byte v7, v7

    aput-byte v7, v1, v5

    shr-int/lit8 v5, v6, 0x8

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    const/4 v6, 0x1

    aput-byte v5, v1, v6

    shr-int/lit8 v3, v3, 0x10

    and-int v5, v3, v2

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    const/4 v6, 0x2

    aput-byte v3, v1, v6

    shr-int/lit8 v3, v5, 0x8

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    const/4 v5, 0x3

    aput-byte v3, v1, v5

    .line 149
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->getTotalIn()I

    move-result v0

    and-int v3, v0, v2

    and-int/lit16 v5, v0, 0xff

    int-to-byte v5, v5

    const/4 v6, 0x4

    aput-byte v5, v1, v6

    shr-int/2addr v3, v4

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    const/4 v4, 0x5

    aput-byte v3, v1, v4

    shr-int/lit8 v0, v0, 0x10

    and-int/2addr v2, v0

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    const/4 v3, 0x6

    aput-byte v0, v1, v3

    shr-int/lit8 v0, v2, 0x8

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    const/4 v2, 0x7

    aput-byte v0, v1, v2

    .line 119
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    :cond_3
    return-void
.end method

.method public final write([BII)V
    .locals 1

    .line 89
    invoke-super {p0, p1, p2, p3}, Ll/۫ۖܽ;->write([BII)V

    .line 90
    iget-object v0, p0, Ll/ۤۖܽ;->۬:Ljava/util/zip/CRC32;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V

    return-void
.end method
