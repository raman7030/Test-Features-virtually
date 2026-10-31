.class public final Ll/᩻ۖܽ;
.super Ljava/lang/Object;
.source "G4GH"

# interfaces
.implements Ll/۠ۖܽ;


# static fields
.field public static final ۟:Ll/֡ۛۡ;


# instance fields
.field public ۗ:J

.field public ۙ:Z

.field public ۛ:J

.field public ۤ:J

.field public ۨ:Z

.field public ۫:Z

.field public ۬:J

.field public ܰ:J

.field public ᩶:J

.field public ᩸:[B

.field public ᩹:Z

.field public ᩺:Ll/ۖۖܽ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 72
    new-instance v0, Ll/֡ۛۡ;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ll/֡ۛۡ;-><init>(I)V

    sput-object v0, Ll/᩻ۖܽ;->۟:Ll/֡ۛۡ;

    return-void
.end method

.method public constructor <init>(Ll/ۖۖܽ;)V
    .locals 4

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 41
    iput-wide v0, p0, Ll/᩻ۖܽ;->ܰ:J

    .line 49
    iput-object p1, p0, Ll/᩻ۖܽ;->᩺:Ll/ۖۖܽ;

    const/4 p1, 0x0

    .line 75
    iput-boolean p1, p0, Ll/᩻ۖܽ;->᩹:Z

    iput-boolean p1, p0, Ll/᩻ۖܽ;->ۨ:Z

    iput-boolean p1, p0, Ll/᩻ۖܽ;->ۙ:Z

    const-wide/16 v0, 0x0

    .line 76
    iput-wide v0, p0, Ll/᩻ۖܽ;->۬:J

    iput-wide v0, p0, Ll/᩻ۖܽ;->᩶:J

    iput-wide v0, p0, Ll/᩻ۖܽ;->ۤ:J

    .line 77
    sget-object v2, Ll/᩻ۖܽ;->۟:Ll/֡ۛۡ;

    invoke-virtual {v2}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    if-nez v2, :cond_0

    const/high16 v2, 0x20000

    new-array v2, v2, [B

    goto :goto_0

    .line 81
    :cond_0
    invoke-static {v2, p1}, Ljava/util/Arrays;->fill([BB)V

    .line 83
    :goto_0
    iput-object v2, p0, Ll/᩻ۖܽ;->᩸:[B

    const-wide/32 v2, 0x20000

    .line 84
    iput-wide v2, p0, Ll/᩻ۖܽ;->ۛ:J

    .line 85
    iput-boolean p1, p0, Ll/᩻ۖܽ;->۫:Z

    .line 86
    iput-wide v0, p0, Ll/᩻ۖܽ;->ۗ:J

    return-void
.end method

.method private ܽ()V
    .locals 7

    .line 452
    iget-boolean v0, p0, Ll/᩻ۖܽ;->ۙ:Z

    if-eqz v0, :cond_2

    .line 453
    iget-wide v0, p0, Ll/᩻ۖܽ;->ۗ:J

    iget-wide v2, p0, Ll/᩻ۖܽ;->ۤ:J

    iget-object v4, p0, Ll/᩻ۖܽ;->᩺:Ll/ۖۖܽ;

    cmp-long v5, v0, v2

    if-eqz v5, :cond_0

    .line 454
    invoke-interface {v4, v2, v3}, Ll/ۖۖܽ;->seek(J)V

    .line 455
    :cond_0
    iget-wide v0, p0, Ll/᩻ۖܽ;->᩶:J

    iget-wide v2, p0, Ll/᩻ۖܽ;->ۤ:J

    sub-long/2addr v0, v2

    long-to-int v1, v0

    .line 456
    iget-object v0, p0, Ll/᩻ۖܽ;->᩸:[B

    const/4 v2, 0x0

    invoke-interface {v4, v0, v2, v1}, Ll/ۖۖܽ;->write([BII)V

    .line 457
    iget-wide v0, p0, Ll/᩻ۖܽ;->᩶:J

    iput-wide v0, p0, Ll/᩻ۖܽ;->ۗ:J

    .line 458
    iput-boolean v2, p0, Ll/᩻ۖܽ;->ۙ:Z

    .line 459
    iget-wide v2, p0, Ll/᩻ۖܽ;->ܰ:J

    const-wide/16 v4, -0x1

    cmp-long v6, v2, v4

    if-eqz v6, :cond_1

    cmp-long v6, v0, v2

    if-lez v6, :cond_1

    .line 460
    iput-wide v4, p0, Ll/᩻ۖܽ;->ܰ:J

    :cond_1
    const/4 v0, 0x1

    .line 462
    iput-boolean v0, p0, Ll/᩻ۖܽ;->ۨ:Z

    :cond_2
    return-void
.end method


# virtual methods
.method public final available()I
    .locals 5

    .line 65
    invoke-virtual {p0}, Ll/᩻ۖܽ;->length()J

    move-result-wide v0

    invoke-virtual {p0}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    long-to-int v1, v0

    return v1

    :cond_0
    const v0, 0x7fffffff

    return v0
.end method

.method public final close()V
    .locals 2

    .line 334
    iget-boolean v0, p0, Ll/᩻ۖܽ;->᩹:Z

    if-nez v0, :cond_0

    .line 321
    invoke-direct {p0}, Ll/᩻ۖܽ;->ܽ()V

    const/4 v0, 0x1

    .line 336
    iput-boolean v0, p0, Ll/᩻ۖܽ;->᩹:Z

    .line 337
    iget-object v0, p0, Ll/᩻ۖܽ;->᩺:Ll/ۖۖܽ;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 338
    sget-object v0, Ll/᩻ۖܽ;->۟:Ll/֡ۛۡ;

    iget-object v1, p0, Ll/᩻ۖܽ;->᩸:[B

    invoke-virtual {v0, v1}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    .line 339
    iput-object v0, p0, Ll/᩻ۖܽ;->᩸:[B

    :cond_0
    return-void
.end method

.method public final flush()V
    .locals 0

    .line 321
    invoke-direct {p0}, Ll/᩻ۖܽ;->ܽ()V

    return-void
.end method

.method public final getFilePointer()J
    .locals 2

    .line 286
    iget-wide v0, p0, Ll/᩻ۖܽ;->᩶:J

    return-wide v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 291
    iget-object v0, p0, Ll/᩻ۖܽ;->᩺:Ll/ۖۖܽ;

    invoke-interface {v0}, Ll/ۖۖܽ;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final isClosed()Z
    .locals 1

    .line 345
    iget-boolean v0, p0, Ll/᩻ۖܽ;->᩹:Z

    return v0
.end method

.method public final isOpen()Z
    .locals 1

    .line 345
    iget-boolean v0, p0, Ll/᩻ۖܽ;->᩹:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final length()J
    .locals 7

    .line 203
    iget-wide v0, p0, Ll/᩻ۖܽ;->᩶:J

    .line 207
    iget-wide v2, p0, Ll/᩻ۖܽ;->ܰ:J

    const-wide/16 v4, -0x1

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    .line 208
    iget-object v2, p0, Ll/᩻ۖܽ;->᩺:Ll/ۖۖܽ;

    invoke-interface {v2}, Ll/ۖۖܽ;->length()J

    move-result-wide v2

    iput-wide v2, p0, Ll/᩻ۖܽ;->ܰ:J

    .line 210
    :cond_0
    iget-wide v2, p0, Ll/᩻ۖܽ;->ܰ:J

    .line 203
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final position()J
    .locals 2

    .line 162
    invoke-virtual {p0}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v0

    return-wide v0
.end method

.method public final position(J)Ljava/nio/channels/SeekableByteChannel;
    .locals 0

    .line 167
    invoke-virtual {p0, p1, p2}, Ll/᩻ۖܽ;->seek(J)V

    return-object p0
.end method

.method public final read()I
    .locals 6

    .line 126
    iget-wide v0, p0, Ll/᩻ۖܽ;->᩶:J

    iget-wide v2, p0, Ll/᩻ۖܽ;->۬:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    .line 129
    iget-boolean v2, p0, Ll/᩻ۖܽ;->۫:Z

    const/4 v3, -0x1

    if-eqz v2, :cond_0

    return v3

    .line 133
    :cond_0
    invoke-virtual {p0, v0, v1}, Ll/᩻ۖܽ;->seek(J)V

    .line 134
    iget-wide v0, p0, Ll/᩻ۖܽ;->᩶:J

    iget-wide v4, p0, Ll/᩻ۖܽ;->۬:J

    cmp-long v2, v0, v4

    if-nez v2, :cond_1

    return v3

    .line 137
    :cond_1
    iget-object v0, p0, Ll/᩻ۖܽ;->᩸:[B

    iget-wide v1, p0, Ll/᩻ۖܽ;->᩶:J

    iget-wide v3, p0, Ll/᩻ۖܽ;->ۤ:J

    sub-long v3, v1, v3

    long-to-int v4, v3

    aget-byte v0, v0, v4

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    .line 138
    iput-wide v1, p0, Ll/᩻ۖܽ;->᩶:J

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read(Ljava/nio/ByteBuffer;)I
    .locals 8

    .line 369
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    .line 370
    invoke-virtual {p0}, Ll/᩻ۖܽ;->available()I

    move-result v1

    const/4 v2, -0x1

    if-gtz v1, :cond_0

    return v2

    :cond_0
    if-le v0, v1, :cond_1

    move v0, v1

    :cond_1
    const/4 v1, 0x0

    :cond_2
    sub-int v2, v0, v1

    .line 349
    iget-wide v3, p0, Ll/᩻ۖܽ;->᩶:J

    iget-wide v5, p0, Ll/᩻ۖܽ;->۬:J

    cmp-long v7, v3, v5

    if-ltz v7, :cond_4

    .line 352
    iget-boolean v5, p0, Ll/᩻ۖܽ;->۫:Z

    if-eqz v5, :cond_3

    goto :goto_0

    .line 356
    :cond_3
    invoke-virtual {p0, v3, v4}, Ll/᩻ۖܽ;->seek(J)V

    .line 357
    iget-wide v3, p0, Ll/᩻ۖܽ;->᩶:J

    iget-wide v5, p0, Ll/᩻ۖܽ;->۬:J

    cmp-long v7, v3, v5

    if-nez v7, :cond_4

    :goto_0
    const/4 v2, -0x1

    goto :goto_1

    .line 360
    :cond_4
    iget-wide v3, p0, Ll/᩻ۖܽ;->۬:J

    iget-wide v5, p0, Ll/᩻ۖܽ;->᩶:J

    sub-long/2addr v3, v5

    long-to-int v4, v3

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 361
    iget-wide v3, p0, Ll/᩻ۖܽ;->᩶:J

    iget-wide v5, p0, Ll/᩻ۖܽ;->ۤ:J

    sub-long/2addr v3, v5

    long-to-int v4, v3

    .line 362
    iget-object v3, p0, Ll/᩻ۖܽ;->᩸:[B

    invoke-virtual {p1, v3, v4, v2}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 363
    iget-wide v3, p0, Ll/᩻ۖܽ;->᩶:J

    int-to-long v5, v2

    add-long/2addr v3, v5

    iput-wide v3, p0, Ll/᩻ۖܽ;->᩶:J

    :goto_1
    if-gez v2, :cond_5

    return v1

    :cond_5
    add-int/2addr v1, v2

    if-lt v1, v0, :cond_2

    return v1
.end method

.method public final read([B)I
    .locals 2

    const/4 v0, 0x0

    .line 144
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/᩻ۖܽ;->read([BII)I

    move-result p1

    return p1
.end method

.method public final read([BII)I
    .locals 6

    .line 149
    iget-wide v0, p0, Ll/᩻ۖܽ;->᩶:J

    iget-wide v2, p0, Ll/᩻ۖܽ;->۬:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    .line 152
    iget-boolean v2, p0, Ll/᩻ۖܽ;->۫:Z

    const/4 v3, -0x1

    if-eqz v2, :cond_0

    return v3

    .line 156
    :cond_0
    invoke-virtual {p0, v0, v1}, Ll/᩻ۖܽ;->seek(J)V

    .line 157
    iget-wide v0, p0, Ll/᩻ۖܽ;->᩶:J

    iget-wide v4, p0, Ll/᩻ۖܽ;->۬:J

    cmp-long v2, v0, v4

    if-nez v2, :cond_1

    return v3

    .line 160
    :cond_1
    iget-wide v0, p0, Ll/᩻ۖܽ;->۬:J

    iget-wide v2, p0, Ll/᩻ۖܽ;->᩶:J

    sub-long/2addr v0, v2

    long-to-int v1, v0

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 161
    iget-wide v0, p0, Ll/᩻ۖܽ;->᩶:J

    iget-wide v2, p0, Ll/᩻ۖܽ;->ۤ:J

    sub-long/2addr v0, v2

    long-to-int v1, v0

    .line 162
    iget-object v0, p0, Ll/᩻ۖܽ;->᩸:[B

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 163
    iget-wide p1, p0, Ll/᩻ۖܽ;->᩶:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩻ۖܽ;->᩶:J

    return p3
.end method

.method public final readByte()B
    .locals 2

    .line 117
    invoke-virtual {p0}, Ll/᩻ۖܽ;->read()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    int-to-byte v0, v0

    return v0

    .line 119
    :cond_0
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0
.end method

.method public final readFully([B)V
    .locals 2

    const/4 v0, 0x0

    .line 187
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/᩻ۖܽ;->֫([BII)V

    return-void
.end method

.method public final readInt()I
    .locals 2

    .line 137
    invoke-virtual {p0}, Ll/᩻ۖܽ;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0}, Ll/᩻ۖܽ;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    invoke-virtual {p0}, Ll/᩻ۖܽ;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    or-int/2addr v0, v1

    invoke-virtual {p0}, Ll/᩻ۖܽ;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v0, v1

    return v0
.end method

.method public final readLong()J
    .locals 7

    .line 141
    invoke-virtual {p0}, Ll/᩻ۖܽ;->readByte()B

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    invoke-virtual {p0}, Ll/᩻ۖܽ;->readByte()B

    move-result v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x8

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    invoke-virtual {p0}, Ll/᩻ۖܽ;->readByte()B

    move-result v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x10

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    invoke-virtual {p0}, Ll/᩻ۖܽ;->readByte()B

    move-result v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x18

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    .line 142
    invoke-virtual {p0}, Ll/᩻ۖܽ;->readByte()B

    move-result v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x20

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    invoke-virtual {p0}, Ll/᩻ۖܽ;->readByte()B

    move-result v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x28

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    invoke-virtual {p0}, Ll/᩻ۖܽ;->readByte()B

    move-result v4

    int-to-long v4, v4

    and-long/2addr v4, v2

    const/16 v6, 0x30

    shl-long/2addr v4, v6

    or-long/2addr v0, v4

    invoke-virtual {p0}, Ll/᩻ۖܽ;->readByte()B

    move-result v4

    int-to-long v4, v4

    and-long/2addr v2, v4

    const/16 v4, 0x38

    shl-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public final seek(J)V
    .locals 6

    .line 242
    iget-wide v0, p0, Ll/᩻ۖܽ;->۬:J

    cmp-long v2, p1, v0

    if-gez v2, :cond_1

    iget-wide v0, p0, Ll/᩻ۖܽ;->ۤ:J

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    goto :goto_0

    .line 255
    :cond_0
    iget-wide v0, p0, Ll/᩻ۖܽ;->᩶:J

    cmp-long v2, p1, v0

    if-gez v2, :cond_7

    .line 257
    invoke-direct {p0}, Ll/᩻ۖܽ;->ܽ()V

    goto :goto_3

    .line 244
    :cond_1
    :goto_0
    invoke-direct {p0}, Ll/᩻ۖܽ;->ܽ()V

    const-wide/32 v0, -0x20000

    and-long/2addr v0, p1

    .line 245
    iput-wide v0, p0, Ll/᩻ۖܽ;->ۤ:J

    .line 246
    iget-object v2, p0, Ll/᩻ۖܽ;->᩸:[B

    array-length v2, v2

    int-to-long v2, v2

    add-long/2addr v2, v0

    iput-wide v2, p0, Ll/᩻ۖܽ;->ۛ:J

    .line 247
    iget-wide v2, p0, Ll/᩻ۖܽ;->ۗ:J

    iget-object v4, p0, Ll/᩻ۖܽ;->᩺:Ll/ۖۖܽ;

    cmp-long v5, v2, v0

    if-eqz v5, :cond_2

    .line 248
    invoke-interface {v4, v0, v1}, Ll/ۖۖܽ;->seek(J)V

    .line 249
    iget-wide v0, p0, Ll/᩻ۖܽ;->ۤ:J

    iput-wide v0, p0, Ll/᩻ۖܽ;->ۗ:J

    .line 473
    :cond_2
    iget-object v0, p0, Ll/᩻ۖܽ;->᩸:[B

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_1
    if-lez v0, :cond_4

    .line 475
    iget-object v3, p0, Ll/᩻ۖܽ;->᩸:[B

    invoke-interface {v4, v3, v2, v0}, Ll/ۖۖܽ;->read([BII)I

    move-result v3

    if-gez v3, :cond_3

    goto :goto_2

    :cond_3
    add-int/2addr v2, v3

    sub-int/2addr v0, v3

    goto :goto_1

    .line 481
    :cond_4
    :goto_2
    iget-object v0, p0, Ll/᩻ۖܽ;->᩸:[B

    array-length v3, v0

    if-ge v2, v3, :cond_5

    const/4 v1, 0x1

    :cond_5
    iput-boolean v1, p0, Ll/᩻ۖܽ;->۫:Z

    if-eqz v1, :cond_6

    .line 483
    array-length v1, v0

    const/4 v3, -0x1

    invoke-static {v0, v2, v1, v3}, Ljava/util/Arrays;->fill([BIIB)V

    .line 485
    :cond_6
    iget-wide v0, p0, Ll/᩻ۖܽ;->ۗ:J

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩻ۖܽ;->ۗ:J

    .line 252
    iget-wide v0, p0, Ll/᩻ۖܽ;->ۤ:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩻ۖܽ;->۬:J

    .line 260
    :cond_7
    :goto_3
    iput-wide p1, p0, Ll/᩻ۖܽ;->᩶:J

    return-void
.end method

.method public final setLength(J)V
    .locals 4

    .line 215
    invoke-direct {p0}, Ll/᩻ۖܽ;->ܽ()V

    .line 216
    iget-object v0, p0, Ll/᩻ۖܽ;->᩺:Ll/ۖۖܽ;

    invoke-interface {v0, p1, p2}, Ll/ۖۖܽ;->setLength(J)V

    .line 217
    iput-wide p1, p0, Ll/᩻ۖܽ;->ܰ:J

    .line 218
    iget-wide v1, p0, Ll/᩻ۖܽ;->᩶:J

    cmp-long v3, v1, p1

    if-lez v3, :cond_0

    .line 219
    iput-wide p1, p0, Ll/᩻ۖܽ;->᩶:J

    .line 221
    :cond_0
    iget-wide v1, p0, Ll/᩻ۖܽ;->ۗ:J

    cmp-long v3, v1, p1

    if-lez v3, :cond_1

    .line 222
    invoke-interface {v0, p1, p2}, Ll/ۖۖܽ;->seek(J)V

    .line 223
    iput-wide p1, p0, Ll/᩻ۖܽ;->ۗ:J

    :cond_1
    const-wide/16 p1, 0x0

    .line 227
    iput-wide p1, p0, Ll/᩻ۖܽ;->۬:J

    iput-wide p1, p0, Ll/᩻ۖܽ;->ۤ:J

    .line 228
    iget-wide p1, p0, Ll/᩻ۖܽ;->᩶:J

    invoke-virtual {p0, p1, p2}, Ll/᩻ۖܽ;->seek(J)V

    return-void
.end method

.method public final size()J
    .locals 2

    .line 173
    invoke-virtual {p0}, Ll/᩻ۖܽ;->length()J

    move-result-wide v0

    return-wide v0
.end method

.method public final skipBytes(I)I
    .locals 6

    if-gtz p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 286
    :cond_0
    iget-wide v0, p0, Ll/᩻ۖܽ;->᩶:J

    .line 273
    invoke-virtual {p0}, Ll/᩻ۖܽ;->length()J

    move-result-wide v2

    int-to-long v4, p1

    add-long/2addr v4, v0

    cmp-long p1, v4, v2

    if-lez p1, :cond_1

    goto :goto_0

    :cond_1
    move-wide v2, v4

    .line 278
    :goto_0
    invoke-virtual {p0, v2, v3}, Ll/᩻ۖܽ;->seek(J)V

    sub-long/2addr v2, v0

    long-to-int p1, v2

    return p1
.end method

.method public final truncate(J)Ljava/nio/channels/SeekableByteChannel;
    .locals 0

    .line 178
    invoke-virtual {p0, p1, p2}, Ll/᩻ۖܽ;->setLength(J)V

    return-object p0
.end method

.method public final write(Ljava/nio/ByteBuffer;)I
    .locals 9

    const/4 v0, 0x0

    .line 433
    :goto_0
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 434
    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    .line 410
    iget-wide v2, p0, Ll/᩻ۖܽ;->᩶:J

    iget-wide v4, p0, Ll/᩻ۖܽ;->۬:J

    cmp-long v6, v2, v4

    if-ltz v6, :cond_1

    .line 411
    iget-boolean v6, p0, Ll/᩻ۖܽ;->۫:Z

    if-eqz v6, :cond_0

    iget-wide v6, p0, Ll/᩻ۖܽ;->ۛ:J

    cmp-long v8, v4, v6

    if-gez v8, :cond_0

    .line 413
    iput-wide v6, p0, Ll/᩻ۖܽ;->۬:J

    goto :goto_1

    .line 416
    :cond_0
    invoke-virtual {p0, v2, v3}, Ll/᩻ۖܽ;->seek(J)V

    .line 417
    iget-wide v2, p0, Ll/᩻ۖܽ;->᩶:J

    iget-wide v4, p0, Ll/᩻ۖܽ;->۬:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_1

    .line 419
    iget-wide v2, p0, Ll/᩻ۖܽ;->ۛ:J

    iput-wide v2, p0, Ll/᩻ۖܽ;->۬:J

    .line 423
    :cond_1
    :goto_1
    iget-wide v2, p0, Ll/᩻ۖܽ;->۬:J

    iget-wide v4, p0, Ll/᩻ۖܽ;->᩶:J

    sub-long/2addr v2, v4

    long-to-int v3, v2

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 424
    iget-wide v2, p0, Ll/᩻ۖܽ;->᩶:J

    iget-wide v4, p0, Ll/᩻ۖܽ;->ۤ:J

    sub-long/2addr v2, v4

    long-to-int v3, v2

    .line 425
    iget-object v2, p0, Ll/᩻ۖܽ;->᩸:[B

    invoke-virtual {p1, v2, v3, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    .line 426
    iget-wide v2, p0, Ll/᩻ۖܽ;->᩶:J

    int-to-long v4, v1

    add-long/2addr v2, v4

    iput-wide v2, p0, Ll/᩻ۖܽ;->᩶:J

    add-int/2addr v0, v1

    const/4 v1, 0x1

    .line 435
    iput-boolean v1, p0, Ll/᩻ۖܽ;->ۙ:Z

    goto :goto_0

    :cond_2
    return v0
.end method

.method public final write(I)V
    .locals 9

    .line 91
    iget-wide v0, p0, Ll/᩻ۖܽ;->᩶:J

    iget-wide v2, p0, Ll/᩻ۖܽ;->۬:J

    const-wide/16 v4, 0x1

    cmp-long v6, v0, v2

    if-ltz v6, :cond_1

    .line 92
    iget-boolean v6, p0, Ll/᩻ۖܽ;->۫:Z

    if-eqz v6, :cond_0

    iget-wide v6, p0, Ll/᩻ۖܽ;->ۛ:J

    cmp-long v8, v2, v6

    if-gez v8, :cond_0

    add-long/2addr v2, v4

    .line 94
    iput-wide v2, p0, Ll/᩻ۖܽ;->۬:J

    goto :goto_0

    .line 97
    :cond_0
    invoke-virtual {p0, v0, v1}, Ll/᩻ۖܽ;->seek(J)V

    .line 98
    iget-wide v0, p0, Ll/᩻ۖܽ;->᩶:J

    iget-wide v2, p0, Ll/᩻ۖܽ;->۬:J

    cmp-long v6, v0, v2

    if-nez v6, :cond_1

    add-long/2addr v2, v4

    .line 100
    iput-wide v2, p0, Ll/᩻ۖܽ;->۬:J

    .line 104
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/᩻ۖܽ;->᩸:[B

    iget-wide v1, p0, Ll/᩻ۖܽ;->᩶:J

    iget-wide v6, p0, Ll/᩻ۖܽ;->ۤ:J

    sub-long v6, v1, v6

    long-to-int v3, v6

    int-to-byte p1, p1

    aput-byte p1, v0, v3

    add-long/2addr v1, v4

    .line 105
    iput-wide v1, p0, Ll/᩻ۖܽ;->᩶:J

    const/4 p1, 0x1

    .line 106
    iput-boolean p1, p0, Ll/᩻ۖܽ;->ۙ:Z

    return-void
.end method

.method public final write([B)V
    .locals 2

    const/4 v0, 0x0

    .line 111
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/᩻ۖܽ;->write([BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 7

    :goto_0
    if-lez p3, :cond_2

    .line 494
    iget-wide v0, p0, Ll/᩻ۖܽ;->᩶:J

    iget-wide v2, p0, Ll/᩻ۖܽ;->۬:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    .line 495
    iget-boolean v4, p0, Ll/᩻ۖܽ;->۫:Z

    if-eqz v4, :cond_0

    iget-wide v4, p0, Ll/᩻ۖܽ;->ۛ:J

    cmp-long v6, v2, v4

    if-gez v6, :cond_0

    .line 497
    iput-wide v4, p0, Ll/᩻ۖܽ;->۬:J

    goto :goto_1

    .line 500
    :cond_0
    invoke-virtual {p0, v0, v1}, Ll/᩻ۖܽ;->seek(J)V

    .line 501
    iget-wide v0, p0, Ll/᩻ۖܽ;->᩶:J

    iget-wide v2, p0, Ll/᩻ۖܽ;->۬:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    .line 503
    iget-wide v0, p0, Ll/᩻ۖܽ;->ۛ:J

    iput-wide v0, p0, Ll/᩻ۖܽ;->۬:J

    .line 507
    :cond_1
    :goto_1
    iget-wide v0, p0, Ll/᩻ۖܽ;->۬:J

    iget-wide v2, p0, Ll/᩻ۖܽ;->᩶:J

    sub-long/2addr v0, v2

    long-to-int v1, v0

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 508
    iget-wide v1, p0, Ll/᩻ۖܽ;->᩶:J

    iget-wide v3, p0, Ll/᩻ۖܽ;->ۤ:J

    sub-long/2addr v1, v3

    long-to-int v2, v1

    .line 509
    iget-object v1, p0, Ll/᩻ۖܽ;->᩸:[B

    invoke-static {p1, p2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 510
    iget-wide v1, p0, Ll/᩻ۖܽ;->᩶:J

    int-to-long v3, v0

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/᩻ۖܽ;->᩶:J

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    const/4 v0, 0x1

    .line 120
    iput-boolean v0, p0, Ll/᩻ۖܽ;->ۙ:Z

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final writeInt(I)V
    .locals 1

    and-int/lit16 v0, p1, 0xff

    .line 99
    invoke-virtual {p0, v0}, Ll/᩻ۖܽ;->write(I)V

    ushr-int/lit8 v0, p1, 0x8

    and-int/lit16 v0, v0, 0xff

    .line 100
    invoke-virtual {p0, v0}, Ll/᩻ۖܽ;->write(I)V

    ushr-int/lit8 v0, p1, 0x10

    and-int/lit16 v0, v0, 0xff

    .line 101
    invoke-virtual {p0, v0}, Ll/᩻ۖܽ;->write(I)V

    ushr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    .line 102
    invoke-virtual {p0, p1}, Ll/᩻ۖܽ;->write(I)V

    return-void
.end method

.method public final ֫()I
    .locals 6

    .line 73
    invoke-virtual {p0}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v0

    long-to-int v2, v0

    int-to-long v3, v2

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    return v2

    .line 0
    :cond_0
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0
.end method

.method public final ֫(C)V
    .locals 1

    and-int/lit16 v0, p1, 0xff

    .line 94
    invoke-virtual {p0, v0}, Ll/᩻ۖܽ;->write(I)V

    ushr-int/lit8 p1, p1, 0x8

    and-int/lit16 p1, p1, 0xff

    .line 95
    invoke-virtual {p0, p1}, Ll/᩻ۖܽ;->write(I)V

    return-void
.end method

.method public final ֫([BII)V
    .locals 3

    const/4 v0, 0x0

    :cond_0
    add-int v1, p2, v0

    sub-int v2, p3, v0

    .line 194
    invoke-virtual {p0, p1, v1, v2}, Ll/᩻ۖܽ;->read([BII)I

    move-result v1

    if-ltz v1, :cond_1

    add-int/2addr v0, v1

    if-lt v0, p3, :cond_0

    return-void

    .line 196
    :cond_1
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1
.end method

.method public final ۛۧ()I
    .locals 2

    .line 125
    invoke-virtual {p0}, Ll/᩻ۖܽ;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {p0}, Ll/᩻ۖܽ;->readByte()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v0, v1

    return v0
.end method

.method public final ۜ֫()Ll/ۖۖܽ;
    .locals 1

    .line 296
    iget-object v0, p0, Ll/᩻ۖܽ;->᩺:Ll/ۖۖܽ;

    return-object v0
.end method

.method public final ۡ()Ll/᩻ۖܽ;
    .locals 2

    .line 306
    new-instance v0, Ll/᩻ۖܽ;

    iget-object v1, p0, Ll/᩻ۖܽ;->᩺:Ll/ۖۖܽ;

    invoke-interface {v1}, Ll/ۖۖܽ;->ۡ()Ll/ۖۖܽ;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/᩻ۖܽ;-><init>(Ll/ۖۖܽ;)V

    return-object v0
.end method

.method public final ۡ(I)V
    .locals 1

    if-ltz p1, :cond_0

    const v0, 0xffff

    if-gt p1, v0, :cond_0

    and-int/lit16 v0, p1, 0xff

    .line 84
    invoke-virtual {p0, v0}, Ll/᩻ۖܽ;->write(I)V

    ushr-int/lit8 p1, p1, 0x8

    and-int/lit16 p1, p1, 0xff

    .line 85
    invoke-virtual {p0, p1}, Ll/᩻ۖܽ;->write(I)V

    return-void

    .line 82
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Data out of range (UShort)"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(II[B)I
    .locals 3

    const/4 v0, 0x0

    :cond_0
    add-int v1, p1, v0

    sub-int v2, p2, v0

    .line 176
    invoke-virtual {p0, p3, v1, v2}, Ll/᩻ۖܽ;->read([BII)I

    move-result v1

    if-gez v1, :cond_1

    return v0

    :cond_1
    add-int/2addr v0, v1

    if-lt v0, p2, :cond_0

    return v0
.end method

.method public final ۧ(JJ)Ll/᩻ۖܽ;
    .locals 2

    .line 311
    new-instance v0, Ll/᩻ۖܽ;

    iget-object v1, p0, Ll/᩻ۖܽ;->᩺:Ll/ۖۖܽ;

    invoke-interface {v1, p1, p2, p3, p4}, Ll/ۖۖܽ;->ۧ(JJ)Ll/ۖۖܽ;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/᩻ۖܽ;-><init>(Ll/ۖۖܽ;)V

    return-object v0
.end method

.method public final ܺ()V
    .locals 1

    .line 326
    iget-boolean v0, p0, Ll/᩻ۖܽ;->ۨ:Z

    if-eqz v0, :cond_0

    .line 327
    iget-object v0, p0, Ll/᩻ۖܽ;->᩺:Ll/ۖۖܽ;

    invoke-interface {v0}, Ll/ۖۖܽ;->ܺ()V

    const/4 v0, 0x0

    .line 328
    iput-boolean v0, p0, Ll/᩻ۖܽ;->ۨ:Z

    :cond_0
    return-void
.end method

.method public final ܽ(JJ)Ll/᩻ۖܽ;
    .locals 2

    .line 316
    new-instance v0, Ll/᩻ۖܽ;

    iget-object v1, p0, Ll/᩻ۖܽ;->᩺:Ll/ۖۖܽ;

    invoke-interface {v1, p1, p2, p3, p4}, Ll/ۖۖܽ;->ܽ(JJ)Ll/ۖۖܽ;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/᩻ۖܽ;-><init>(Ll/ۖۖܽ;)V

    return-object v0
.end method
