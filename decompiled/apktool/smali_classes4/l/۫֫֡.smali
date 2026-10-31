.class public final Ll/۫֫֡;
.super Ljava/lang/Object;
.source "A4E9"

# interfaces
.implements Ll/ۚᩳ֡;


# instance fields
.field public final ۙ:Ll/۟ܽ֡;

.field public final synthetic ᩶:Ll/ۨ֫֡;

.field public ᩸:J

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/ۨ֫֡;J)V
    .locals 1

    .line 280
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫֫֡;->᩶:Ll/ۨ֫֡;

    .line 276
    new-instance v0, Ll/۟ܽ֡;

    iget-object p1, p1, Ll/ۨ֫֡;->ܽ:Ll/ۤܽ֡;

    invoke-interface {p1}, Ll/ۚᩳ֡;->ۢ()Ll/ܶᩳ֡;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/۟ܽ֡;-><init>(Ll/ܶᩳ֡;)V

    iput-object v0, p0, Ll/۫֫֡;->ۙ:Ll/۟ܽ֡;

    .line 281
    iput-wide p2, p0, Ll/۫֫֡;->᩸:J

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 305
    iget-boolean v0, p0, Ll/۫֫֡;->᩹:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 306
    iput-boolean v0, p0, Ll/۫֫֡;->᩹:Z

    .line 307
    iget-wide v0, p0, Ll/۫֫֡;->᩸:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1

    .line 268
    iget-object v0, p0, Ll/۫֫֡;->ۙ:Ll/۟ܽ֡;

    invoke-virtual {v0}, Ll/۟ܽ֡;->᩻()Ll/ܶᩳ֡;

    move-result-object v1

    .line 269
    invoke-virtual {v0}, Ll/۟ܽ֡;->ۜ()V

    .line 270
    invoke-virtual {v1}, Ll/ܶᩳ֡;->֫()Ll/ܶᩳ֡;

    .line 271
    invoke-virtual {v1}, Ll/ܶᩳ֡;->ۧ()Ll/ܶᩳ֡;

    const/4 v0, 0x3

    .line 309
    iget-object v1, p0, Ll/۫֫֡;->᩶:Ll/ۨ֫֡;

    iput v0, v1, Ll/ۨ֫֡;->ܿ:I

    return-void

    .line 307
    :cond_1
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "unexpected end of stream"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final flush()V
    .locals 1

    .line 300
    iget-boolean v0, p0, Ll/۫֫֡;->᩹:Z

    if-eqz v0, :cond_0

    return-void

    .line 301
    :cond_0
    iget-object v0, p0, Ll/۫֫֡;->᩶:Ll/ۨ֫֡;

    iget-object v0, v0, Ll/ۨ֫֡;->ܽ:Ll/ۤܽ֡;

    invoke-interface {v0}, Ll/ۤܽ֡;->flush()V

    return-void
.end method

.method public final ֫(Ll/۫ܽ֡;J)V
    .locals 5

    .line 289
    iget-boolean v0, p0, Ll/۫֫֡;->᩹:Z

    if-nez v0, :cond_2

    .line 290
    invoke-virtual {p1}, Ll/۫ܽ֡;->size()J

    move-result-wide v0

    sget-object v2, Ll/᩶۟᩵;->֫:[B

    const-wide/16 v2, 0x0

    cmp-long v4, p2, v2

    if-ltz v4, :cond_1

    cmp-long v4, v2, v0

    if-gtz v4, :cond_1

    cmp-long v2, v0, p2

    if-ltz v2, :cond_1

    .line 291
    iget-wide v0, p0, Ll/۫֫֡;->᩸:J

    cmp-long v2, p2, v0

    if-gtz v2, :cond_0

    .line 295
    iget-object v0, p0, Ll/۫֫֡;->᩶:Ll/ۨ֫֡;

    iget-object v0, v0, Ll/ۨ֫֡;->ܽ:Ll/ۤܽ֡;

    invoke-interface {v0, p1, p2, p3}, Ll/ۚᩳ֡;->֫(Ll/۫ܽ֡;J)V

    .line 296
    iget-wide v0, p0, Ll/۫֫֡;->᩸:J

    sub-long/2addr v0, p2

    iput-wide v0, p0, Ll/۫֫֡;->᩸:J

    return-void

    .line 292
    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "expected "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Ll/۫֫֡;->᩸:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " bytes but received "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 126
    :cond_1
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p1

    .line 289
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۢ()Ll/ܶᩳ֡;
    .locals 1

    .line 285
    iget-object v0, p0, Ll/۫֫֡;->ۙ:Ll/۟ܽ֡;

    return-object v0
.end method
