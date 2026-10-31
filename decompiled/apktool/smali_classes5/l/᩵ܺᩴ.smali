.class public final Ll/᩵ܺᩴ;
.super Ll/ۚܺᩴ;
.source "TCDV"

# interfaces
.implements Ll/۠ܺᩴ;
.implements Ljava/io/ObjectInput;


# instance fields
.field public ۙ:I

.field public ᩶:I

.field public ᩸:[B

.field public ᩹:I


# direct methods
.method public constructor <init>([BI)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 61
    iput-object p1, p0, Ll/᩵ܺᩴ;->᩸:[B

    .line 63
    array-length p1, p1

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Ll/᩵ܺᩴ;->᩹:I

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 2

    .line 95
    iget v0, p0, Ll/᩵ܺᩴ;->᩹:I

    iget v1, p0, Ll/᩵ܺᩴ;->ۙ:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final close()V
    .locals 0

    return-void
.end method

.method public final mark(I)V
    .locals 0

    .line 90
    iget p1, p0, Ll/᩵ܺᩴ;->ۙ:I

    iput p1, p0, Ll/᩵ܺᩴ;->᩶:I

    return-void
.end method

.method public final markSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final read()I
    .locals 2

    .line 111
    iget v0, p0, Ll/᩵ܺᩴ;->ۙ:I

    iget v1, p0, Ll/᩵ܺᩴ;->᩹:I

    if-ne v1, v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    add-int/lit8 v1, v0, 0x1

    .line 112
    iput v1, p0, Ll/᩵ܺᩴ;->ۙ:I

    iget-object v1, p0, Ll/᩵ܺᩴ;->᩸:[B

    aget-byte v0, v1, v0

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 147
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/᩵ܺᩴ;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 2

    .line 123
    iget v0, p0, Ll/᩵ܺᩴ;->ۙ:I

    iget v1, p0, Ll/᩵ܺᩴ;->᩹:I

    if-ne v1, v0, :cond_1

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1

    :cond_1
    sub-int/2addr v1, v0

    .line 124
    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 125
    iget-object v0, p0, Ll/᩵ܺᩴ;->᩸:[B

    iget v1, p0, Ll/᩵ܺᩴ;->ۙ:I

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 126
    iget p1, p0, Ll/᩵ܺᩴ;->ۙ:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/᩵ܺᩴ;->ۙ:I

    return p3
.end method

.method public final readBoolean()Z
    .locals 1

    .line 173
    invoke-virtual {p0}, Ll/᩵ܺᩴ;->read()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final readByte()B
    .locals 1

    .line 178
    invoke-virtual {p0}, Ll/᩵ܺᩴ;->read()I

    move-result v0

    int-to-byte v0, v0

    return v0
.end method

.method public final readChar()C
    .locals 2

    .line 198
    invoke-virtual {p0}, Ll/᩵ܺᩴ;->read()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    invoke-virtual {p0}, Ll/᩵ܺᩴ;->read()I

    move-result v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    int-to-char v0, v0

    return v0
.end method

.method public final readDouble()D
    .locals 2

    .line 218
    invoke-virtual {p0}, Ll/᩵ܺᩴ;->readLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method

.method public final readFloat()F
    .locals 1

    .line 213
    invoke-virtual {p0}, Ll/᩵ܺᩴ;->readInt()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    return v0
.end method

.method public final readInt()I
    .locals 2

    .line 203
    invoke-virtual {p0}, Ll/᩵ܺᩴ;->read()I

    move-result v0

    shl-int/lit8 v0, v0, 0x18

    invoke-virtual {p0}, Ll/᩵ܺᩴ;->read()I

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    invoke-virtual {p0}, Ll/᩵ܺᩴ;->read()I

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    invoke-virtual {p0}, Ll/᩵ܺᩴ;->read()I

    move-result v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    return v0
.end method

.method public final readLine()Ljava/lang/String;
    .locals 8
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 223
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x63

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 226
    :goto_0
    invoke-virtual {p0}, Ll/᩵ܺᩴ;->read()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_4

    const/16 v3, 0xa

    if-eq v1, v3, :cond_3

    const/16 v4, 0xd

    if-eq v1, v4, :cond_0

    int-to-char v1, v1

    .line 239
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 151
    :cond_0
    iget v1, p0, Ll/᩵ܺᩴ;->᩹:I

    int-to-long v4, v1

    .line 132
    iget v1, p0, Ll/᩵ܺᩴ;->ۙ:I

    int-to-long v6, v1

    cmp-long v1, v4, v6

    if-gtz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    int-to-long v1, v1

    add-long/2addr v1, v6

    long-to-int v2, v1

    .line 152
    iget-object v1, p0, Ll/᩵ܺᩴ;->᩸:[B

    aget-byte v1, v1, v2

    and-int/lit16 v2, v1, 0xff

    :goto_1
    if-ne v2, v3, :cond_2

    .line 234
    invoke-virtual {p0}, Ll/᩵ܺᩴ;->read()I

    .line 236
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 231
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 242
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-nez v1, :cond_5

    const/4 v0, 0x0

    return-object v0

    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final readLong()J
    .locals 6

    .line 208
    invoke-virtual {p0}, Ll/᩵ܺᩴ;->readInt()I

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    invoke-virtual {p0}, Ll/᩵ܺᩴ;->readInt()I

    move-result v2

    int-to-long v2, v2

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final readObject()Ljava/lang/Object;
    .locals 2

    .line 259
    new-instance v0, Ljava/io/ObjectInputStream;

    invoke-direct {v0, p0}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    .line 260
    :try_start_0
    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->readObject()Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 261
    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->close()V

    return-object v1

    :catchall_0
    move-exception v1

    .line 259
    :try_start_1
    invoke-virtual {v0}, Ljava/io/ObjectInputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
.end method

.method public final readShort()S
    .locals 2

    .line 188
    invoke-virtual {p0}, Ll/᩵ܺᩴ;->read()I

    move-result v0

    shl-int/lit8 v0, v0, 0x8

    invoke-virtual {p0}, Ll/᩵ܺᩴ;->read()I

    move-result v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    int-to-short v0, v0

    return v0
.end method

.method public final readUTF()Ljava/lang/String;
    .locals 4

    .line 248
    :try_start_0
    invoke-virtual {p0}, Ll/᩵ܺᩴ;->available()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {p0}, Ljava/io/DataInputStream;->readUTF(Ljava/io/DataInput;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/UTFDataFormatException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :catch_0
    move-exception v0

    .line 252
    new-instance v1, Ljava/io/UncheckedIOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "readUTF @ "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/io/UncheckedIOException;-><init>(Ljava/lang/String;Ljava/io/IOException;)V

    throw v1

    :catch_1
    move-exception v0

    .line 250
    throw v0
.end method

.method public final readUnsignedByte()I
    .locals 1

    .line 183
    invoke-virtual {p0}, Ll/᩵ܺᩴ;->read()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final readUnsignedShort()I
    .locals 2

    .line 193
    invoke-virtual {p0}, Ll/᩵ܺᩴ;->read()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    invoke-virtual {p0}, Ll/᩵ܺᩴ;->read()I

    move-result v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    return v0
.end method

.method public final reset()V
    .locals 1

    .line 81
    iget v0, p0, Ll/᩵ܺᩴ;->᩶:I

    iput v0, p0, Ll/᩵ܺᩴ;->ۙ:I

    return-void
.end method

.method public final skip(J)J
    .locals 5

    .line 100
    iget v0, p0, Ll/᩵ܺᩴ;->ۙ:I

    iget v1, p0, Ll/᩵ܺᩴ;->᩹:I

    sub-int v2, v1, v0

    int-to-long v2, v2

    cmp-long v4, p1, v2

    if-gtz v4, :cond_0

    long-to-int v1, p1

    add-int/2addr v0, v1

    .line 101
    iput v0, p0, Ll/᩵ܺᩴ;->ۙ:I

    return-wide p1

    :cond_0
    sub-int p1, v1, v0

    int-to-long p1, p1

    .line 105
    iput v1, p0, Ll/᩵ܺᩴ;->ۙ:I

    return-wide p1
.end method

.method public final skipBytes(I)I
    .locals 2

    int-to-long v0, p1

    .line 168
    invoke-virtual {p0, v0, v1}, Ll/᩵ܺᩴ;->skip(J)J

    move-result-wide v0

    long-to-int p1, v0

    return p1
.end method
