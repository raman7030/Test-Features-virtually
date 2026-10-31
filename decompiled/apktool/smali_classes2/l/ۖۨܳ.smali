.class public final Ll/ۖۨܳ;
.super Ljava/io/InputStream;
.source "W73I"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final ۗ:Ljava/io/PushbackInputStream;

.field public final ۙ:Ljava/util/zip/Inflater;

.field public final ۛ:[B

.field public ۤ:J

.field public ۫:I

.field public final ۬:[B

.field public ᩶:Z

.field public ᩸:Z

.field public final ᩹:Ljava/util/zip/CRC32;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 3

    .line 37
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 27
    new-instance v0, Ljava/util/zip/Inflater;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    iput-object v0, p0, Ll/ۖۨܳ;->ۙ:Ljava/util/zip/Inflater;

    .line 28
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    iput-object v0, p0, Ll/ۖۨܳ;->᩹:Ljava/util/zip/CRC32;

    const/high16 v0, 0x10000

    new-array v2, v0, [B

    .line 29
    iput-object v2, p0, Ll/ۖۨܳ;->۬:[B

    new-array v1, v1, [B

    .line 30
    iput-object v1, p0, Ll/ۖۨܳ;->ۛ:[B

    .line 38
    new-instance v1, Ljava/io/PushbackInputStream;

    invoke-direct {v1, p1, v0}, Ljava/io/PushbackInputStream;-><init>(Ljava/io/InputStream;I)V

    iput-object v1, p0, Ll/ۖۨܳ;->ۗ:Ljava/io/PushbackInputStream;

    .line 41
    :try_start_0
    invoke-direct {p0}, Ll/ۖۨܳ;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 45
    iget-object v0, p0, Ll/ۖۨܳ;->ۙ:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    .line 47
    throw p1
.end method

.method private ֫(Ljava/lang/String;)I
    .locals 2

    .line 202
    iget-object v0, p0, Ll/ۖۨܳ;->ۗ:Ljava/io/PushbackInputStream;

    invoke-virtual {v0}, Ljava/io/PushbackInputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    return v0

    .line 204
    :cond_0
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0, p1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ֫(Ljava/util/zip/CRC32;)I
    .locals 1

    const-string v0, "Unexpected end of GZIP header"

    .line 187
    invoke-direct {p0, v0}, Ll/ۖۨܳ;->֫(Ljava/lang/String;)I

    move-result v0

    .line 188
    invoke-virtual {p1, v0}, Ljava/util/zip/CRC32;->update(I)V

    return v0
.end method

.method private ֫()V
    .locals 6

    .line 140
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    .line 141
    invoke-direct {p0, v0}, Ll/ۖۨܳ;->֫(Ljava/util/zip/CRC32;)I

    move-result v1

    const/16 v2, 0x1f

    if-ne v1, v2, :cond_8

    .line 142
    invoke-direct {p0, v0}, Ll/ۖۨܳ;->֫(Ljava/util/zip/CRC32;)I

    move-result v1

    const/16 v2, 0x8b

    if-ne v1, v2, :cond_8

    .line 145
    invoke-direct {p0, v0}, Ll/ۖۨܳ;->֫(Ljava/util/zip/CRC32;)I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_7

    .line 148
    invoke-direct {p0, v0}, Ll/ۖۨܳ;->֫(Ljava/util/zip/CRC32;)I

    move-result v1

    and-int/lit16 v3, v1, 0xe0

    if-nez v3, :cond_6

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x6

    if-ge v4, v5, :cond_0

    .line 153
    invoke-direct {p0, v0}, Ll/ۖۨܳ;->֫(Ljava/util/zip/CRC32;)I

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_1

    .line 156
    invoke-direct {p0, v0}, Ll/ۖۨܳ;->֫(Ljava/util/zip/CRC32;)I

    move-result v4

    invoke-direct {p0, v0}, Ll/ۖۨܳ;->֫(Ljava/util/zip/CRC32;)I

    move-result v5

    shl-int/2addr v5, v2

    or-int/2addr v4, v5

    :goto_1
    if-ge v3, v4, :cond_1

    .line 158
    invoke-direct {p0, v0}, Ll/ۖۨܳ;->֫(Ljava/util/zip/CRC32;)I

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    and-int/lit8 v3, v1, 0x8

    if-eqz v3, :cond_2

    .line 180
    :goto_2
    invoke-direct {p0, v0}, Ll/ۖۨܳ;->֫(Ljava/util/zip/CRC32;)I

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    and-int/lit8 v3, v1, 0x10

    if-eqz v3, :cond_3

    :goto_3
    invoke-direct {p0, v0}, Ll/ۖۨܳ;->֫(Ljava/util/zip/CRC32;)I

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_5

    const-string v1, "Unexpected end of GZIP header CRC"

    .line 168
    invoke-direct {p0, v1}, Ll/ۖۨܳ;->֫(Ljava/lang/String;)I

    move-result v3

    .line 169
    invoke-direct {p0, v1}, Ll/ۖۨܳ;->֫(Ljava/lang/String;)I

    move-result v1

    shl-int/2addr v1, v2

    or-int/2addr v1, v3

    .line 170
    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v2

    long-to-int v0, v2

    const v2, 0xffff

    and-int/2addr v0, v2

    if-ne v1, v0, :cond_4

    goto :goto_4

    .line 171
    :cond_4
    new-instance v0, Ljava/util/zip/ZipException;

    const-string v1, "Corrupt GZIP header CRC"

    invoke-direct {v0, v1}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 174
    :cond_5
    :goto_4
    iget-object v0, p0, Ll/ۖۨܳ;->᩹:Ljava/util/zip/CRC32;

    invoke-virtual {v0}, Ljava/util/zip/CRC32;->reset()V

    const-wide/16 v0, 0x0

    .line 175
    iput-wide v0, p0, Ll/ۖۨܳ;->ۤ:J

    return-void

    .line 150
    :cond_6
    new-instance v0, Ljava/util/zip/ZipException;

    const-string v1, "Reserved GZIP flags are set"

    invoke-direct {v0, v1}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 146
    :cond_7
    new-instance v0, Ljava/util/zip/ZipException;

    const-string v1, "Unsupported GZIP compression method"

    invoke-direct {v0, v1}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 143
    :cond_8
    new-instance v0, Ljava/util/zip/ZipException;

    const-string v1, "Invalid GZIP header"

    invoke-direct {v0, v1}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ܽ()J
    .locals 6

    const-string v0, "Unexpected end of GZIP trailer"

    .line 194
    invoke-direct {p0, v0}, Ll/ۖۨܳ;->֫(Ljava/lang/String;)I

    move-result v1

    int-to-long v1, v1

    .line 195
    invoke-direct {p0, v0}, Ll/ۖۨܳ;->֫(Ljava/lang/String;)I

    move-result v3

    int-to-long v3, v3

    const/16 v5, 0x8

    shl-long/2addr v3, v5

    or-long/2addr v1, v3

    .line 196
    invoke-direct {p0, v0}, Ll/ۖۨܳ;->֫(Ljava/lang/String;)I

    move-result v3

    int-to-long v3, v3

    const/16 v5, 0x10

    shl-long/2addr v3, v5

    or-long/2addr v1, v3

    .line 197
    invoke-direct {p0, v0}, Ll/ۖۨܳ;->֫(Ljava/lang/String;)I

    move-result v0

    int-to-long v3, v0

    const/16 v0, 0x18

    shl-long/2addr v3, v0

    or-long v0, v1, v3

    return-wide v0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 218
    iget-boolean v0, p0, Ll/ۖۨܳ;->᩸:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 221
    iput-boolean v0, p0, Ll/ۖۨܳ;->᩸:Z

    .line 222
    iget-object v0, p0, Ll/ۖۨܳ;->ۙ:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    .line 223
    iget-object v0, p0, Ll/ۖۨܳ;->ۗ:Ljava/io/PushbackInputStream;

    invoke-virtual {v0}, Ljava/io/PushbackInputStream;->close()V

    return-void
.end method

.method public final read()I
    .locals 4

    const/4 v0, 0x1

    .line 52
    iget-object v1, p0, Ll/ۖۨܳ;->ۛ:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ll/ۖۨܳ;->read([BII)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    return v3

    .line 53
    :cond_0
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 11

    .line 59
    iget-object v0, p0, Ll/ۖۨܳ;->ۙ:Ljava/util/zip/Inflater;

    .line 211
    iget-boolean v1, p0, Ll/ۖۨܳ;->᩸:Z

    if-nez v1, :cond_e

    if-eqz p1, :cond_d

    if-ltz p2, :cond_c

    if-ltz p3, :cond_c

    .line 63
    array-length v1, p1

    sub-int/2addr v1, p3

    if-gt p2, v1, :cond_c

    const/4 v1, 0x0

    if-nez p3, :cond_0

    return v1

    .line 69
    :cond_0
    :goto_0
    iget-boolean v2, p0, Ll/ۖۨܳ;->᩶:Z

    const/4 v3, -0x1

    if-nez v2, :cond_b

    .line 72
    :try_start_0
    invoke-virtual {v0, p1, p2, p3}, Ljava/util/zip/Inflater;->inflate([BII)I

    move-result v2
    :try_end_0
    .catch Ljava/util/zip/DataFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    iget-object v4, p0, Ll/ۖۨܳ;->᩹:Ljava/util/zip/CRC32;

    if-lez v2, :cond_1

    .line 79
    invoke-virtual {v4, p1, p2, v2}, Ljava/util/zip/CRC32;->update([BII)V

    .line 80
    iget-wide p1, p0, Ll/ۖۨܳ;->ۤ:J

    int-to-long v0, v2

    add-long/2addr p1, v0

    const-wide v0, 0xffffffffL

    and-long/2addr p1, v0

    iput-wide p1, p0, Ll/ۖۨܳ;->ۤ:J

    return v2

    .line 83
    :cond_1
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->finished()Z

    move-result v2

    iget-object v5, p0, Ll/ۖۨܳ;->۬:[B

    iget-object v6, p0, Ll/ۖۨܳ;->ۗ:Ljava/io/PushbackInputStream;

    if-eqz v2, :cond_7

    .line 110
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->getRemaining()I

    move-result v2

    if-lez v2, :cond_2

    .line 112
    iget v7, p0, Ll/ۖۨܳ;->۫:I

    sub-int/2addr v7, v2

    invoke-virtual {v6, v5, v7, v2}, Ljava/io/PushbackInputStream;->unread([BII)V

    .line 114
    :cond_2
    invoke-direct {p0}, Ll/ۖۨܳ;->ܽ()J

    move-result-wide v7

    .line 115
    invoke-direct {p0}, Ll/ۖۨܳ;->ܽ()J

    move-result-wide v9

    .line 116
    invoke-virtual {v4}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v4

    cmp-long v2, v7, v4

    if-nez v2, :cond_6

    .line 119
    iget-wide v4, p0, Ll/ۖۨܳ;->ۤ:J

    cmp-long v2, v9, v4

    if-nez v2, :cond_5

    .line 123
    invoke-virtual {v6}, Ljava/io/PushbackInputStream;->read()I

    move-result v2

    if-ne v2, v3, :cond_3

    const/4 v2, 0x1

    .line 125
    iput-boolean v2, p0, Ll/ۖۨܳ;->᩶:Z

    goto :goto_0

    .line 128
    :cond_3
    invoke-virtual {v6}, Ljava/io/PushbackInputStream;->read()I

    move-result v4

    if-eq v4, v3, :cond_4

    const/16 v3, 0x1f

    if-ne v2, v3, :cond_4

    const/16 v3, 0x8b

    if-ne v4, v3, :cond_4

    .line 132
    invoke-virtual {v6, v4}, Ljava/io/PushbackInputStream;->unread(I)V

    .line 133
    invoke-virtual {v6, v2}, Ljava/io/PushbackInputStream;->unread(I)V

    .line 134
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->reset()V

    .line 135
    invoke-direct {p0}, Ll/ۖۨܳ;->֫()V

    goto :goto_0

    .line 130
    :cond_4
    new-instance p1, Ljava/util/zip/ZipException;

    const-string p2, "Trailing data after GZIP stream"

    invoke-direct {p1, p2}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 120
    :cond_5
    new-instance p1, Ljava/util/zip/ZipException;

    const-string p2, "Corrupt GZIP trailer size"

    invoke-direct {p1, p2}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 117
    :cond_6
    new-instance p1, Ljava/util/zip/ZipException;

    const-string p2, "Corrupt GZIP trailer CRC"

    invoke-direct {p1, p2}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 87
    :cond_7
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->needsDictionary()Z

    move-result v2

    if-nez v2, :cond_a

    .line 90
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->needsInput()Z

    move-result v2

    if-eqz v2, :cond_9

    .line 101
    invoke-virtual {v6, v5}, Ljava/io/InputStream;->read([B)I

    move-result v2

    iput v2, p0, Ll/ۖۨܳ;->۫:I

    if-eq v2, v3, :cond_8

    .line 105
    invoke-virtual {v0, v5, v1, v2}, Ljava/util/zip/Inflater;->setInput([BII)V

    goto/16 :goto_0

    .line 103
    :cond_8
    new-instance p1, Ljava/io/EOFException;

    const-string p2, "Unexpected end of GZIP compressed data"

    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 94
    :cond_9
    new-instance p1, Ljava/util/zip/ZipException;

    const-string p2, "GZIP inflater made no progress"

    invoke-direct {p1, p2}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 88
    :cond_a
    new-instance p1, Ljava/util/zip/ZipException;

    const-string p2, "GZIP stream requires a preset dictionary"

    invoke-direct {p1, p2}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception p1

    .line 74
    new-instance p2, Ljava/util/zip/ZipException;

    const-string p3, "Invalid GZIP compressed data"

    invoke-direct {p2, p3}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    .line 75
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 76
    throw p2

    :cond_b
    return v3

    .line 64
    :cond_c
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 61
    :cond_d
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "buffer"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 212
    :cond_e
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
