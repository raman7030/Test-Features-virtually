.class public final Ll/۬֫֡;
.super Ll/ۙ֫֡;
.source "A4E9"


# instance fields
.field public ۗ:J

.field public final ۤ:Ll/ۨܰ᩵;

.field public final synthetic ۫:Ll/ۨ֫֡;

.field public ۬:Z


# direct methods
.method public constructor <init>(Ll/ۨ֫֡;Ll/ۨܰ᩵;)V
    .locals 2

    .line 439
    iput-object p1, p0, Ll/۬֫֡;->۫:Ll/ۨ֫֡;

    invoke-direct {p0, p1}, Ll/ۙ֫֡;-><init>(Ll/ۨ֫֡;)V

    const-wide/16 v0, -0x1

    .line 436
    iput-wide v0, p0, Ll/۬֫֡;->ۗ:J

    const/4 p1, 0x1

    .line 437
    iput-boolean p1, p0, Ll/۬֫֡;->۬:Z

    .line 440
    iput-object p2, p0, Ll/۬֫֡;->ۤ:Ll/ۨܰ᩵;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 486
    iget-boolean v0, p0, Ll/ۙ֫֡;->᩹:Z

    if-eqz v0, :cond_0

    return-void

    .line 487
    :cond_0
    iget-boolean v0, p0, Ll/۬֫֡;->۬:Z

    if-eqz v0, :cond_1

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

    .line 488
    invoke-virtual {p0, v0, v1}, Ll/ۙ֫֡;->֫(ZLjava/io/IOException;)V

    :cond_1
    const/4 v0, 0x1

    .line 490
    iput-boolean v0, p0, Ll/ۙ֫֡;->᩹:Z

    return-void
.end method

.method public final ۧ(Ll/۫ܽ֡;J)J
    .locals 10

    .line 445
    iget-boolean p2, p0, Ll/ۙ֫֡;->᩹:Z

    if-nez p2, :cond_a

    .line 446
    iget-boolean p2, p0, Ll/۬֫֡;->۬:Z

    const-wide/16 v0, -0x1

    if-nez p2, :cond_0

    goto :goto_1

    .line 448
    :cond_0
    iget-wide p2, p0, Ll/۬֫֡;->ۗ:J

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    cmp-long v5, p2, v3

    if-eqz v5, :cond_1

    cmp-long v5, p2, v0

    if-nez v5, :cond_7

    .line 465
    :cond_1
    iget-object v5, p0, Ll/۬֫֡;->۫:Ll/ۨ֫֡;

    iget-object v6, v5, Ll/ۨ֫֡;->ᩳ:Ll/ۛܽ֡;

    const-string v7, "expected chunk size and optional extensions but was \""

    cmp-long v8, p2, v0

    if-eqz v8, :cond_2

    .line 466
    invoke-interface {v6}, Ll/ۛܽ֡;->֡֫()Ljava/lang/String;

    .line 469
    :cond_2
    :try_start_0
    invoke-interface {v6}, Ll/ۛܽ֡;->ۢܽ()J

    move-result-wide p2

    iput-wide p2, p0, Ll/۬֫֡;->ۗ:J

    .line 470
    invoke-interface {v6}, Ll/ۛܽ֡;->֡֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    .line 471
    iget-wide v8, p0, Ll/۬֫֡;->ۗ:J

    cmp-long p3, v8, v3

    if-ltz p3, :cond_9

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_3

    const-string p3, ";"

    invoke-virtual {p2, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p3, :cond_9

    .line 478
    :cond_3
    iget-wide p2, p0, Ll/۬֫֡;->ۗ:J

    cmp-long v6, p2, v3

    if-nez v6, :cond_6

    .line 479
    iput-boolean v2, p0, Ll/۬֫֡;->۬:Z

    .line 480
    iget-object p2, v5, Ll/ۨ֫֡;->֫:Ll/ܿ۟᩵;

    invoke-virtual {p2}, Ll/ܿ۟᩵;->ۜ()Ll/᩵ܰ᩵;

    move-result-object p2

    invoke-virtual {v5}, Ll/ۨ֫֡;->ܽ()Ll/ۤܰ᩵;

    move-result-object p3

    sget v3, Ll/֨֫֡;->֫:I

    .line 313
    sget-object v3, Ll/᩵ܰ᩵;->֫:Ll/᩵ܰ᩵;

    if-ne p2, v3, :cond_4

    goto :goto_0

    .line 315
    :cond_4
    iget-object v3, p0, Ll/۬֫֡;->ۤ:Ll/ۨܰ᩵;

    invoke-static {v3, p3}, Ll/ۘܰ᩵;->֫(Ll/ۨܰ᩵;Ll/ۤܰ᩵;)Ljava/util/List;

    move-result-object p3

    .line 316
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_5

    goto :goto_0

    .line 318
    :cond_5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    const/4 p2, 0x1

    const/4 p3, 0x0

    .line 481
    invoke-virtual {p0, p2, p3}, Ll/ۙ֫֡;->֫(ZLjava/io/IOException;)V

    .line 450
    :cond_6
    iget-boolean p2, p0, Ll/۬֫֡;->۬:Z

    if-nez p2, :cond_7

    :goto_1
    return-wide v0

    .line 453
    :cond_7
    iget-wide p2, p0, Ll/۬֫֡;->ۗ:J

    const-wide/16 v3, 0x2000

    invoke-static {v3, v4, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-super {p0, p1, p2, p3}, Ll/ۙ֫֡;->ۧ(Ll/۫ܽ֡;J)J

    move-result-wide p1

    cmp-long p3, p1, v0

    if-eqz p3, :cond_8

    .line 459
    iget-wide v0, p0, Ll/۬֫֡;->ۗ:J

    sub-long/2addr v0, p1

    iput-wide v0, p0, Ll/۬֫֡;->ۗ:J

    return-wide p1

    .line 455
    :cond_8
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "unexpected end of stream"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 456
    invoke-virtual {p0, v2, p1}, Ll/ۙ֫֡;->֫(ZLjava/io/IOException;)V

    .line 457
    throw p1

    .line 472
    :cond_9
    :try_start_1
    new-instance p1, Ljava/net/ProtocolException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v0, p0, Ll/۬֫֡;->ۗ:J

    invoke-virtual {p3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\""

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p1

    .line 476
    new-instance p2, Ljava/net/ProtocolException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 445
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
