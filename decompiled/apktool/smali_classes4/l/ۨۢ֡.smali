.class public final Ll/ۨۢ֡;
.super Ljava/lang/Object;
.source "L7IT"

# interfaces
.implements Ll/ۛۢ֡;


# instance fields
.field public ֫:J


# virtual methods
.method public final add(J)V
    .locals 2

    .line 237
    iget-wide v0, p0, Ll/ۨۢ֡;->֫:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Ll/ۨۢ֡;->֫:J

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    if-ne p0, p1, :cond_0

    goto :goto_0

    .line 246
    :cond_0
    instance-of v0, p1, Ll/ۛۢ֡;

    if-nez v0, :cond_1

    goto :goto_1

    .line 249
    :cond_1
    check-cast p1, Ll/ۛۢ֡;

    .line 250
    iget-wide v0, p0, Ll/ۨۢ֡;->֫:J

    invoke-interface {p1}, Ll/ۛۢ֡;->get()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-nez p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final get()J
    .locals 2

    .line 255
    iget-wide v0, p0, Ll/ۨۢ֡;->֫:J

    return-wide v0
.end method

.method public final hashCode()I
    .locals 3

    .line 270
    iget-wide v0, p0, Ll/ۨۢ֡;->֫:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {v1}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 285
    iget-wide v0, p0, Ll/ۨۢ֡;->֫:J

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()V
    .locals 4

    .line 275
    iget-wide v0, p0, Ll/ۨۢ֡;->֫:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۨۢ֡;->֫:J

    return-void
.end method
