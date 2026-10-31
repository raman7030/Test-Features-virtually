.class public final Ll/ۤ֫֡;
.super Ll/ۙ֫֡;
.source "A4E9"


# instance fields
.field public ۗ:J


# direct methods
.method public constructor <init>(Ll/ۨ֫֡;J)V
    .locals 2

    .line 395
    invoke-direct {p0, p1}, Ll/ۙ֫֡;-><init>(Ll/ۨ֫֡;)V

    .line 396
    iput-wide p2, p0, Ll/ۤ֫֡;->ۗ:J

    const-wide/16 v0, 0x0

    cmp-long p1, p2, v0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    const/4 p2, 0x0

    .line 398
    invoke-virtual {p0, p1, p2}, Ll/ۙ֫֡;->֫(ZLjava/io/IOException;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 422
    iget-boolean v0, p0, Ll/ۙ֫֡;->᩹:Z

    if-eqz v0, :cond_0

    return-void

    .line 424
    :cond_0
    iget-wide v0, p0, Ll/ۤ֫֡;->ۗ:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const/4 v0, 0x0

    const/16 v1, 0x64

    .line 194
    :try_start_0
    invoke-static {p0, v1}, Ll/᩶۟᩵;->֫(Ll/֨ᩳ֡;I)Z

    move-result v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    const/4 v1, 0x0

    .line 425
    invoke-virtual {p0, v0, v1}, Ll/ۙ֫֡;->֫(ZLjava/io/IOException;)V

    :cond_1
    const/4 v0, 0x1

    .line 428
    iput-boolean v0, p0, Ll/ۙ֫֡;->᩹:Z

    return-void
.end method

.method public final ۧ(Ll/۫ܽ֡;J)J
    .locals 6

    .line 404
    iget-boolean p2, p0, Ll/ۙ֫֡;->᩹:Z

    if-nez p2, :cond_3

    .line 405
    iget-wide p2, p0, Ll/ۤ֫֡;->ۗ:J

    const-wide/16 v0, -0x1

    const-wide/16 v2, 0x0

    cmp-long v4, p2, v2

    if-nez v4, :cond_0

    return-wide v0

    :cond_0
    const-wide/16 v4, 0x2000

    .line 407
    invoke-static {p2, p3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-super {p0, p1, p2, p3}, Ll/ۙ֫֡;->ۧ(Ll/۫ܽ֡;J)J

    move-result-wide p1

    cmp-long p3, p1, v0

    if-eqz p3, :cond_2

    .line 414
    iget-wide v0, p0, Ll/ۤ֫֡;->ۗ:J

    sub-long/2addr v0, p1

    iput-wide v0, p0, Ll/ۤ֫֡;->ۗ:J

    cmp-long p3, v0, v2

    if-nez p3, :cond_1

    const/4 p3, 0x1

    const/4 v0, 0x0

    .line 416
    invoke-virtual {p0, p3, v0}, Ll/ۙ֫֡;->֫(ZLjava/io/IOException;)V

    :cond_1
    return-wide p1

    .line 409
    :cond_2
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "unexpected end of stream"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    const/4 p2, 0x0

    .line 410
    invoke-virtual {p0, p2, p1}, Ll/ۙ֫֡;->֫(ZLjava/io/IOException;)V

    .line 411
    throw p1

    .line 404
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
