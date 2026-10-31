.class public final Ll/ۛ֫֡;
.super Ll/ۙ֫֡;
.source "A4E9"


# instance fields
.field public ۗ:Z


# virtual methods
.method public final close()V
    .locals 2

    .line 517
    iget-boolean v0, p0, Ll/ۙ֫֡;->᩹:Z

    if-eqz v0, :cond_0

    return-void

    .line 518
    :cond_0
    iget-boolean v0, p0, Ll/ۛ֫֡;->ۗ:Z

    if-nez v0, :cond_1

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 519
    invoke-virtual {p0, v0, v1}, Ll/ۙ֫֡;->֫(ZLjava/io/IOException;)V

    :cond_1
    const/4 v0, 0x1

    .line 521
    iput-boolean v0, p0, Ll/ۙ֫֡;->᩹:Z

    return-void
.end method

.method public final ۧ(Ll/۫ܽ֡;J)J
    .locals 2

    .line 504
    iget-boolean p2, p0, Ll/ۙ֫֡;->᩹:Z

    if-nez p2, :cond_2

    .line 505
    iget-boolean p2, p0, Ll/ۛ֫֡;->ۗ:Z

    const-wide/16 v0, -0x1

    if-eqz p2, :cond_0

    return-wide v0

    :cond_0
    const-wide/16 p2, 0x2000

    .line 507
    invoke-super {p0, p1, p2, p3}, Ll/ۙ֫֡;->ۧ(Ll/۫ܽ֡;J)J

    move-result-wide p1

    cmp-long p3, p1, v0

    if-nez p3, :cond_1

    const/4 p1, 0x1

    .line 509
    iput-boolean p1, p0, Ll/ۛ֫֡;->ۗ:Z

    const/4 p2, 0x0

    .line 510
    invoke-virtual {p0, p1, p2}, Ll/ۙ֫֡;->֫(ZLjava/io/IOException;)V

    return-wide v0

    :cond_1
    return-wide p1

    .line 504
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
