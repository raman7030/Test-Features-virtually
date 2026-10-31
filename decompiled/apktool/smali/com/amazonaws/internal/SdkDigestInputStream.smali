.class public Lcom/amazonaws/internal/SdkDigestInputStream;
.super Ljava/security/DigestInputStream;
.source "SdkDigestInputStream.java"

# interfaces
.implements Lcom/amazonaws/internal/MetricAware;
.implements Ll/ܶ֨ᩴ;


# virtual methods
.method public final skip(J)J
    .locals 8

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    return-wide p1

    :cond_0
    const-wide/16 v2, 0x800

    .line 69
    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    new-array v2, v3, [B

    move-wide v4, p1

    :goto_0
    cmp-long v6, v4, v0

    if-lez v6, :cond_3

    int-to-long v6, v3

    .line 72
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v6

    long-to-int v7, v6

    const/4 v6, 0x0

    invoke-virtual {p0, v2, v6, v7}, Ljava/io/InputStream;->read([BII)I

    move-result v6

    const/4 v7, -0x1

    if-ne v6, v7, :cond_2

    cmp-long v0, v4, p1

    if-nez v0, :cond_1

    const-wide/16 p1, -0x1

    return-wide p1

    :cond_1
    sub-long/2addr p1, v4

    return-wide p1

    :cond_2
    int-to-long v6, v6

    sub-long/2addr v4, v6

    goto :goto_0

    :cond_3
    return-wide p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 36
    iget-object v0, p0, Ljava/security/DigestInputStream;->in:Ljava/io/InputStream;

    instance-of v0, v0, Lcom/amazonaws/internal/MetricAware;

    if-eqz v0, :cond_0

    .line 37
    iget-object v0, p0, Ljava/security/DigestInputStream;->in:Ljava/io/InputStream;

    check-cast v0, Lcom/amazonaws/internal/MetricAware;

    .line 38
    invoke-interface {v0}, Lcom/amazonaws/internal/MetricAware;->֫()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
