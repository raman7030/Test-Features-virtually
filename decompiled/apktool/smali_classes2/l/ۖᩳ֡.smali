.class public final Ll/ۖᩳ֡;
.super Ljava/io/InputStream;
.source "34CP"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final synthetic ᩸:Ll/ۘᩳ֡;


# direct methods
.method public constructor <init>(Ll/ۘᩳ֡;)V
    .locals 0

    .line 424
    iput-object p1, p0, Ll/ۖᩳ֡;->᩸:Ll/ۘᩳ֡;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 4

    .line 447
    iget-object v0, p0, Ll/ۖᩳ֡;->᩸:Ll/ۘᩳ֡;

    iget-boolean v1, v0, Ll/ۘᩳ֡;->᩹:Z

    if-nez v1, :cond_0

    .line 448
    iget-object v0, v0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    iget-wide v0, v0, Ll/۫ܽ֡;->᩹:J

    const-wide/32 v2, 0x7fffffff

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v1, v0

    return v1

    .line 447
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final close()V
    .locals 1

    .line 452
    iget-object v0, p0, Ll/ۖᩳ֡;->᩸:Ll/ۘᩳ֡;

    invoke-virtual {v0}, Ll/ۘᩳ֡;->close()V

    return-void
.end method

.method public final read()I
    .locals 7

    .line 426
    iget-object v0, p0, Ll/ۖᩳ֡;->᩸:Ll/ۘᩳ֡;

    iget-object v1, v0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    iget-boolean v2, v0, Ll/ۘᩳ֡;->᩹:Z

    if-nez v2, :cond_1

    .line 427
    iget-wide v2, v1, Ll/۫ܽ֡;->᩹:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    .line 428
    iget-object v0, v0, Ll/ۘᩳ֡;->᩶:Ll/֨ᩳ֡;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Ll/֨ᩳ֡;->ۧ(Ll/۫ܽ֡;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 431
    :cond_0
    invoke-virtual {v1}, Ll/۫ܽ֡;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    return v0

    .line 426
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final read([BII)I
    .locals 9

    .line 435
    iget-object v0, p0, Ll/ۖᩳ֡;->᩸:Ll/ۘᩳ֡;

    iget-object v1, v0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    iget-boolean v2, v0, Ll/ۘᩳ֡;->᩹:Z

    if-nez v2, :cond_1

    .line 436
    array-length v2, p1

    int-to-long v3, v2

    int-to-long v5, p2

    int-to-long v7, p3

    invoke-static/range {v3 .. v8}, Ll/᩸ᩳ֡;->֫(JJJ)V

    .line 438
    iget-wide v2, v1, Ll/۫ܽ֡;->᩹:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    .line 439
    iget-object v0, v0, Ll/ۘᩳ֡;->᩶:Ll/֨ᩳ֡;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Ll/֨ᩳ֡;->ۧ(Ll/۫ܽ֡;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 443
    :cond_0
    invoke-virtual {v1, p1, p2, p3}, Ll/۫ܽ֡;->read([BII)I

    move-result p1

    return p1

    .line 435
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 456
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ۖᩳ֡;->᩸:Ll/ۘᩳ֡;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".inputStream()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
