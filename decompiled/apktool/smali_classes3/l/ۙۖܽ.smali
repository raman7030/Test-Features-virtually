.class public final Ll/ۙۖܽ;
.super Ljava/io/FilterInputStream;
.source "NAQ4"

# interfaces
.implements Ll/ܶ֨ᩴ;


# static fields
.field public static final ۗ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field public volatile buf:[B
    .annotation build Ll/ۙᩳ;
    .end annotation
.end field

.field public ۙ:I

.field public ᩶:I

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 42
    const-class v0, [B

    const-string v1, "buf"

    .line 44
    const-class v2, Ll/ۙۖܽ;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Ll/ۙۖܽ;->ۗ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ljava/util/zip/GZIPInputStream;)V
    .locals 0

    .line 164
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const/4 p1, -0x1

    .line 101
    iput p1, p0, Ll/ۙۖܽ;->᩶:I

    const/16 p1, 0x2000

    new-array p1, p1, [B

    .line 168
    iput-object p1, p0, Ll/ۙۖܽ;->buf:[B

    return-void
.end method

.method private ֫()V
    .locals 7

    .line 187
    invoke-direct {p0}, Ll/ۙۖܽ;->ܽ()[B

    move-result-object v0

    .line 188
    iget v1, p0, Ll/ۙۖܽ;->᩶:I

    const-string v2, "Stream closed"

    const/4 v3, 0x0

    if-gez v1, :cond_0

    .line 189
    iput v3, p0, Ll/ۙۖܽ;->ۙ:I

    goto :goto_2

    .line 190
    :cond_0
    iget v4, p0, Ll/ۙۖܽ;->ۙ:I

    array-length v5, v0

    if-lt v4, v5, :cond_8

    if-lez v1, :cond_1

    sub-int/2addr v4, v1

    .line 193
    invoke-static {v0, v1, v0, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 194
    iput v4, p0, Ll/ۙۖܽ;->ۙ:I

    .line 195
    iput v3, p0, Ll/ۙۖܽ;->᩶:I

    goto :goto_2

    .line 196
    :cond_1
    array-length v1, v0

    iget v5, p0, Ll/ۙۖܽ;->᩹:I

    if-lt v1, v5, :cond_2

    const/4 v1, -0x1

    .line 197
    iput v1, p0, Ll/ۙۖܽ;->᩶:I

    .line 198
    iput v3, p0, Ll/ۙۖܽ;->ۙ:I

    goto :goto_2

    .line 199
    :cond_2
    array-length v1, v0

    const v6, 0x7ffffff7

    if-ge v1, v6, :cond_7

    sub-int v1, v6, v4

    if-gt v4, v1, :cond_3

    mul-int/lit8 v6, v4, 0x2

    :cond_3
    if-le v6, v5, :cond_4

    goto :goto_0

    :cond_4
    move v5, v6

    .line 206
    :goto_0
    new-array v1, v5, [B

    .line 207
    invoke-static {v0, v3, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 208
    sget-object v3, Ll/ۙۖܽ;->ۗ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 0
    :goto_1
    invoke-virtual {v3, p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    move-object v0, v1

    goto :goto_2

    :cond_5
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_6

    goto :goto_1

    .line 214
    :cond_6
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 200
    :cond_7
    new-instance v0, Ljava/lang/OutOfMemoryError;

    const-string v1, "Required array size too large"

    invoke-direct {v0, v1}, Ljava/lang/OutOfMemoryError;-><init>(Ljava/lang/String;)V

    throw v0

    .line 218
    :cond_8
    :goto_2
    iget v1, p0, Ll/ۙۖܽ;->ۙ:I

    iput v1, p0, Ll/ۙۖܽ;->᩸:I

    .line 122
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    if-eqz v1, :cond_a

    .line 219
    iget v2, p0, Ll/ۙۖܽ;->ۙ:I

    array-length v3, v0

    sub-int/2addr v3, v2

    invoke-virtual {v1, v0, v2, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    if-lez v0, :cond_9

    .line 221
    iget v1, p0, Ll/ۙۖܽ;->ۙ:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/ۙۖܽ;->᩸:I

    :cond_9
    return-void

    .line 124
    :cond_a
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ܽ()[B
    .locals 2

    .line 133
    iget-object v0, p0, Ll/ۙۖܽ;->buf:[B

    if-eqz v0, :cond_0

    return-object v0

    .line 135
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final available()I
    .locals 4

    .line 381
    iget v0, p0, Ll/ۙۖܽ;->᩸:I

    iget v1, p0, Ll/ۙۖܽ;->ۙ:I

    sub-int/2addr v0, v1

    .line 122
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    if-eqz v1, :cond_1

    .line 382
    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result v1

    const v2, 0x7fffffff

    sub-int v3, v2, v1

    if-le v0, v3, :cond_0

    return v2

    :cond_0
    add-int/2addr v0, v1

    return v0

    .line 124
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final close()V
    .locals 4

    .line 450
    :goto_0
    iget-object v0, p0, Ll/ۙۖܽ;->buf:[B

    if-eqz v0, :cond_2

    .line 451
    sget-object v1, Ll/ۙۖܽ;->ۗ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_0
    const/4 v2, 0x0

    .line 0
    invoke-virtual {v1, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 452
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 453
    iput-object v2, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    if-eqz v0, :cond_2

    .line 455
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void

    .line 0
    :cond_1
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v0, :cond_0

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final mark(I)V
    .locals 0

    .line 397
    iput p1, p0, Ll/ۙۖܽ;->᩹:I

    .line 398
    iget p1, p0, Ll/ۙۖܽ;->ۙ:I

    iput p1, p0, Ll/ۙۖܽ;->᩶:I

    return-void
.end method

.method public final markSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final read()I
    .locals 3

    .line 237
    iget v0, p0, Ll/ۙۖܽ;->ۙ:I

    iget v1, p0, Ll/ۙۖܽ;->᩸:I

    if-lt v0, v1, :cond_0

    .line 238
    invoke-direct {p0}, Ll/ۙۖܽ;->֫()V

    .line 239
    iget v0, p0, Ll/ۙۖܽ;->ۙ:I

    iget v1, p0, Ll/ۙۖܽ;->᩸:I

    if-lt v0, v1, :cond_0

    const/4 v0, -0x1

    return v0

    .line 242
    :cond_0
    invoke-direct {p0}, Ll/ۙۖܽ;->ܽ()[B

    move-result-object v0

    iget v1, p0, Ll/ۙۖܽ;->ۙ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ll/ۙۖܽ;->ۙ:I

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 5

    .line 308
    invoke-direct {p0}, Ll/ۙۖܽ;->ܽ()[B

    or-int v0, p2, p3

    add-int v1, p2, p3

    or-int/2addr v0, v1

    .line 309
    array-length v2, p1

    sub-int/2addr v2, v1

    or-int/2addr v0, v2

    if-ltz v0, :cond_8

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    :cond_0
    add-int v1, p2, v0

    sub-int v2, p3, v0

    .line 250
    iget v3, p0, Ll/ۙۖܽ;->᩸:I

    iget v4, p0, Ll/ۙۖܽ;->ۙ:I

    sub-int/2addr v3, v4

    if-gtz v3, :cond_3

    .line 256
    invoke-direct {p0}, Ll/ۙۖܽ;->ܽ()[B

    move-result-object v3

    array-length v3, v3

    if-lt v2, v3, :cond_2

    iget v3, p0, Ll/ۙۖܽ;->᩶:I

    if-gez v3, :cond_2

    .line 122
    iget-object v3, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    if-eqz v3, :cond_1

    .line 257
    invoke-virtual {v3, p1, v1, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    goto :goto_0

    .line 124
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 259
    :cond_2
    invoke-direct {p0}, Ll/ۙۖܽ;->֫()V

    .line 260
    iget v3, p0, Ll/ۙۖܽ;->᩸:I

    iget v4, p0, Ll/ۙۖܽ;->ۙ:I

    sub-int/2addr v3, v4

    if-gtz v3, :cond_3

    const/4 v1, -0x1

    goto :goto_0

    :cond_3
    if-ge v3, v2, :cond_4

    move v2, v3

    .line 264
    :cond_4
    invoke-direct {p0}, Ll/ۙۖܽ;->ܽ()[B

    move-result-object v3

    iget v4, p0, Ll/ۙۖܽ;->ۙ:I

    invoke-static {v3, v4, p1, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 265
    iget v1, p0, Ll/ۙۖܽ;->ۙ:I

    add-int/2addr v1, v2

    iput v1, p0, Ll/ۙۖܽ;->ۙ:I

    move v1, v2

    :goto_0
    if-gtz v1, :cond_6

    if-nez v0, :cond_5

    return v1

    :cond_5
    return v0

    :cond_6
    add-int/2addr v0, v1

    if-lt v0, p3, :cond_7

    goto :goto_1

    .line 324
    :cond_7
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    if-eqz v1, :cond_0

    .line 325
    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    move-result v1

    if-gtz v1, :cond_0

    :goto_1
    return v0

    .line 310
    :cond_8
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final readInt()I
    .locals 5

    .line 496
    invoke-direct {p0}, Ll/ۙۖܽ;->ܽ()[B

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x4

    if-ge v1, v3, :cond_2

    .line 498
    iget v3, p0, Ll/ۙۖܽ;->ۙ:I

    iget v4, p0, Ll/ۙۖܽ;->᩸:I

    if-lt v3, v4, :cond_1

    .line 499
    invoke-direct {p0}, Ll/ۙۖܽ;->֫()V

    .line 500
    iget v3, p0, Ll/ۙۖܽ;->ۙ:I

    iget v4, p0, Ll/ۙۖܽ;->᩸:I

    if-ge v3, v4, :cond_0

    goto :goto_1

    .line 501
    :cond_0
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    .line 503
    :cond_1
    :goto_1
    iget v3, p0, Ll/ۙۖܽ;->ۙ:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Ll/ۙۖܽ;->ۙ:I

    aget-byte v3, v0, v3

    and-int/lit16 v3, v3, 0xff

    mul-int/lit8 v4, v1, 0x8

    shl-int/2addr v3, v4

    or-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method

.method public final reset()V
    .locals 2

    .line 418
    invoke-direct {p0}, Ll/ۙۖܽ;->ܽ()[B

    .line 419
    iget v0, p0, Ll/ۙۖܽ;->᩶:I

    if-ltz v0, :cond_0

    .line 421
    iput v0, p0, Ll/ۙۖܽ;->ۙ:I

    return-void

    .line 420
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Resetting to invalid mark"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final skip(J)J
    .locals 5

    .line 340
    invoke-direct {p0}, Ll/ۙۖܽ;->ܽ()[B

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    goto :goto_0

    .line 344
    :cond_0
    iget v2, p0, Ll/ۙۖܽ;->᩸:I

    iget v3, p0, Ll/ۙۖܽ;->ۙ:I

    sub-int/2addr v2, v3

    int-to-long v2, v2

    cmp-long v4, v2, v0

    if-gtz v4, :cond_3

    .line 348
    iget v2, p0, Ll/ۙۖܽ;->᩶:I

    if-gez v2, :cond_2

    .line 122
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    if-eqz v0, :cond_1

    .line 349
    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide p1

    return-wide p1

    .line 124
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 352
    :cond_2
    invoke-direct {p0}, Ll/ۙۖܽ;->֫()V

    .line 353
    iget v2, p0, Ll/ۙۖܽ;->᩸:I

    iget v3, p0, Ll/ۙۖܽ;->ۙ:I

    sub-int/2addr v2, v3

    int-to-long v2, v2

    cmp-long v4, v2, v0

    if-gtz v4, :cond_3

    :goto_0
    return-wide v0

    :cond_3
    cmp-long v0, v2, p1

    if-gez v0, :cond_4

    move-wide p1, v2

    .line 359
    :cond_4
    iget v0, p0, Ll/ۙۖܽ;->ۙ:I

    int-to-long v0, v0

    add-long/2addr v0, p1

    long-to-int v1, v0

    iput v1, p0, Ll/ۙۖܽ;->ۙ:I

    return-wide p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ([B)Ljava/lang/String;
    .locals 4

    .line 569
    invoke-virtual {p0}, Ll/ۙۖܽ;->readInt()I

    move-result v0

    .line 570
    array-length v1, p1

    if-ge v1, v0, :cond_0

    .line 571
    new-array p1, v0, [B

    :cond_0
    if-ltz v0, :cond_3

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    sub-int v3, v0, v2

    .line 543
    invoke-virtual {p0, p1, v2, v3}, Ll/ۙۖܽ;->read([BII)I

    move-result v3

    if-ltz v3, :cond_1

    add-int/2addr v2, v3

    goto :goto_0

    .line 545
    :cond_1
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    .line 574
    :cond_2
    new-instance v2, Ljava/lang/String;

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v2, p1, v1, v0, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v2

    .line 540
    :cond_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method
