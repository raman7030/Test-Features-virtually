.class public final Ll/᩵ۨۜ;
.super Ljava/io/InputStream;
.source "46LQ"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ۗ:J

.field public ۙ:J

.field public final ۤ:Ll/ۨۨۜ;

.field public final ۫:Ll/᩺ۨۜ;

.field public final ۬:[B

.field public ᩶:Ljava/io/IOException;

.field public ᩸:Ll/ܿۖ᩷;

.field public ᩹:Ljava/io/BufferedInputStream;


# direct methods
.method public constructor <init>(Ll/᩺ۨۜ;Ll/ۡ᩺ۜ;)V
    .locals 1

    .line 356
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [B

    .line 351
    iput-object v0, p0, Ll/᩵ۨۜ;->۬:[B

    .line 357
    iput-object p1, p0, Ll/᩵ۨۜ;->۫:Ll/᩺ۨۜ;

    iput-object p2, p0, Ll/᩵ۨۜ;->᩸:Ll/ܿۖ᩷;

    .line 358
    invoke-virtual {p1}, Ll/᩺ۨۜ;->᩵()Ll/ۨۨۜ;

    move-result-object p2

    iput-object p2, p0, Ll/᩵ۨۜ;->ۤ:Ll/ۨۨۜ;

    .line 359
    new-instance p2, Ljava/io/BufferedInputStream;

    invoke-virtual {p1}, Ll/᩺ۨۜ;->ᩴ()Ljava/io/InputStream;

    move-result-object p1

    const v0, 0x8000

    invoke-direct {p2, p1, v0}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    iput-object p2, p0, Ll/᩵ۨۜ;->᩹:Ljava/io/BufferedInputStream;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 391
    iget-object v0, p0, Ll/᩵ۨۜ;->᩹:Ljava/io/BufferedInputStream;

    if-eqz v0, :cond_0

    .line 392
    :try_start_0
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x0

    .line 393
    iput-object v0, p0, Ll/᩵ۨۜ;->᩹:Ljava/io/BufferedInputStream;

    :cond_0
    return-void
.end method

.method public final mark(I)V
    .locals 2

    .line 375
    iget-wide v0, p0, Ll/᩵ۨۜ;->ۗ:J

    iput-wide v0, p0, Ll/᩵ۨۜ;->ۙ:J

    return-void
.end method

.method public final markSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final read()I
    .locals 3

    const/4 v0, 0x1

    .line 362
    iget-object v1, p0, Ll/᩵ۨۜ;->۬:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ll/᩵ۨۜ;->read([BII)I

    move-result v0

    if-gez v0, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 7

    .line 389
    :try_start_0
    iget-object v0, p0, Ll/᩵ۨۜ;->᩶:Ljava/io/IOException;

    if-nez v0, :cond_3

    .line 367
    iget-object v0, p0, Ll/᩵ۨۜ;->᩸:Ll/ܿۖ᩷;

    invoke-static {v0}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 368
    iget-object v0, p0, Ll/᩵ۨۜ;->᩹:Ljava/io/BufferedInputStream;

    if-eqz v0, :cond_2

    int-to-long v1, p3

    .line 369
    iget-wide v3, p0, Ll/᩵ۨۜ;->ۗ:J

    const-wide/32 v5, 0x10000001

    sub-long/2addr v5, v3

    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int p3, v1

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    if-lez p1, :cond_1

    .line 370
    iget-wide p2, p0, Ll/᩵ۨۜ;->ۗ:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Ll/᩵ۨۜ;->ۗ:J

    const-wide/32 v0, 0x10000000

    cmp-long v2, p2, v0

    if-gtz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "GIF input exceeds byte limit"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return p1

    .line 368
    :cond_2
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string p2, "GIF input is closed"

    invoke-direct {p1, p2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 389
    :cond_3
    throw v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    .line 372
    iput-object p1, p0, Ll/᩵ۨۜ;->᩶:Ljava/io/IOException;

    throw p1
.end method

.method public final reset()V
    .locals 8

    .line 378
    iget-object v0, p0, Ll/᩵ۨۜ;->۫:Ll/᩺ۨۜ;

    .line 389
    :try_start_0
    iget-object v1, p0, Ll/᩵ۨۜ;->᩶:Ljava/io/IOException;

    if-nez v1, :cond_2

    .line 379
    iget-object v1, p0, Ll/᩵ۨۜ;->᩸:Ll/ܿۖ᩷;

    invoke-static {v1}, Ll/᩺ۨۜ;->֫(Ll/ܿۖ᩷;)V

    .line 380
    iget-object v1, p0, Ll/᩵ۨۜ;->ۤ:Ll/ۨۨۜ;

    invoke-virtual {v0, v1}, Ll/᩺ۨۜ;->֫(Ll/ۨۨۜ;)V

    .line 381
    invoke-virtual {p0}, Ll/᩵ۨۜ;->close()V

    .line 382
    new-instance v1, Ljava/io/BufferedInputStream;

    invoke-virtual {v0}, Ll/᩺ۨۜ;->ᩴ()Ljava/io/InputStream;

    move-result-object v0

    const v2, 0x8000

    invoke-direct {v1, v0, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    iput-object v1, p0, Ll/᩵ۨۜ;->᩹:Ljava/io/BufferedInputStream;

    const-wide/16 v0, 0x0

    .line 383
    iput-wide v0, p0, Ll/᩵ۨۜ;->ۗ:J

    const/16 v0, 0x400

    new-array v1, v0, [B

    .line 385
    :goto_0
    iget-wide v2, p0, Ll/᩵ۨۜ;->ۗ:J

    iget-wide v4, p0, Ll/᩵ۨۜ;->ۙ:J

    cmp-long v6, v2, v4

    if-gez v6, :cond_1

    int-to-long v6, v0

    sub-long/2addr v4, v2

    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v3}, Ll/᩵ۨۜ;->read([BII)I

    move-result v2

    if-ltz v2, :cond_0

    goto :goto_0

    .line 386
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "GIF rewind reached end of input"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void

    .line 389
    :cond_2
    throw v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    .line 387
    iput-object v0, p0, Ll/᩵ۨۜ;->᩶:Ljava/io/IOException;

    throw v0
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
