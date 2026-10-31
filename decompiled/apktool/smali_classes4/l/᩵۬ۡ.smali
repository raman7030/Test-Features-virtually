.class public final Ll/᩵۬ۡ;
.super Ljava/io/OutputStream;
.source "OA5R"


# instance fields
.field public final synthetic ۙ:Ll/ۤܽ֡;

.field public final synthetic ᩶:J

.field public ᩸:J

.field public final synthetic ᩹:Ll/֡۬ۡ;


# direct methods
.method public constructor <init>(Ll/֡۬ۡ;JLl/ۤܽ֡;)V
    .locals 0

    .line 55
    iput-object p1, p0, Ll/᩵۬ۡ;->᩹:Ll/֡۬ۡ;

    iput-wide p2, p0, Ll/᩵۬ۡ;->᩶:J

    iput-object p4, p0, Ll/᩵۬ۡ;->ۙ:Ll/ۤܽ֡;

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 88
    iget-object v0, p0, Ll/᩵۬ۡ;->᩹:Ll/֡۬ۡ;

    invoke-static {v0}, Ll/֡۬ۡ;->֫(Ll/֡۬ۡ;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 91
    :cond_0
    invoke-static {v0}, Ll/֡۬ۡ;->ۧ(Ll/֡۬ۡ;)V

    .line 92
    iget-object v0, p0, Ll/᩵۬ۡ;->ۙ:Ll/ۤܽ֡;

    invoke-interface {v0}, Ll/ۚᩳ֡;->close()V

    const-wide/16 v0, -0x1

    .line 93
    iget-wide v2, p0, Ll/᩵۬ۡ;->᩶:J

    cmp-long v4, v2, v0

    if-eqz v4, :cond_2

    iget-wide v0, p0, Ll/᩵۬ۡ;->᩸:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    goto :goto_0

    .line 94
    :cond_1
    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "expected "

    const-string v4, " bytes but received "

    .line 0
    invoke-static {v1, v4, v2, v3}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 94
    iget-wide v2, p0, Ll/᩵۬ۡ;->᩸:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-void
.end method

.method public final flush()V
    .locals 1

    .line 82
    iget-object v0, p0, Ll/᩵۬ۡ;->᩹:Ll/֡۬ۡ;

    invoke-static {v0}, Ll/֡۬ۡ;->֫(Ll/֡۬ۡ;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 83
    :cond_0
    iget-object v0, p0, Ll/᩵۬ۡ;->ۙ:Ll/ۤܽ֡;

    invoke-interface {v0}, Ll/ۤܽ֡;->flush()V

    return-void
.end method

.method public final write(I)V
    .locals 3

    int-to-byte p1, p1

    const/4 v0, 0x1

    new-array v1, v0, [B

    const/4 v2, 0x0

    aput-byte p1, v1, v2

    .line 60
    invoke-virtual {p0, v1, v2, v0}, Ll/᩵۬ۡ;->write([BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 6

    .line 65
    iget-object v0, p0, Ll/᩵۬ۡ;->᩹:Ll/֡۬ۡ;

    invoke-static {v0}, Ll/֡۬ۡ;->֫(Ll/֡۬ۡ;)Z

    move-result v0

    if-nez v0, :cond_2

    const-wide/16 v0, -0x1

    .line 67
    iget-wide v2, p0, Ll/᩵۬ۡ;->᩶:J

    cmp-long v4, v2, v0

    if-eqz v4, :cond_1

    iget-wide v0, p0, Ll/᩵۬ۡ;->᩸:J

    int-to-long v4, p3

    add-long/2addr v0, v4

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    goto :goto_0

    .line 68
    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "expected "

    const-string v0, " bytes but received "

    .line 0
    invoke-static {p2, v0, v2, v3}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 68
    iget-wide v0, p0, Ll/᩵۬ۡ;->᩸:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 72
    :cond_1
    :goto_0
    iget-wide v0, p0, Ll/᩵۬ۡ;->᩸:J

    int-to-long v2, p3

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩵۬ۡ;->᩸:J

    .line 74
    :try_start_0
    iget-object v0, p0, Ll/᩵۬ۡ;->ۙ:Ll/ۤܽ֡;

    invoke-interface {v0, p2, p3, p1}, Ll/ۤܽ֡;->ᩳ(II[B)Ll/ۤܽ֡;
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 76
    new-instance p2, Ljava/net/SocketTimeoutException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 65
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
