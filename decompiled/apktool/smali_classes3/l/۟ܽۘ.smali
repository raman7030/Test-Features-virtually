.class public final Ll/۟ܽۘ;
.super Ll/ۗܽۘ;
.source "49K9"


# instance fields
.field public final ۗ:Ll/ۜᩳۘ;


# direct methods
.method public constructor <init>(Ll/۫ۛۖ;Ll/ܰܽۘ;Ll/ܽۧۘ;)V
    .locals 1

    .line 55
    invoke-direct {p0, p1, p2, p3}, Ll/ۗܽۘ;-><init>(Ll/۫ۛۖ;Ll/ܰܽۘ;Ll/ܽۧۘ;)V

    .line 56
    new-instance v0, Ll/ۜᩳۘ;

    invoke-virtual {p3}, Ll/ܽۧۘ;->ᩳ()Ljava/lang/String;

    move-result-object p3

    invoke-direct {v0, p2, p1, p3}, Ll/ۜᩳۘ;-><init>(Ll/ܰܽۘ;Ll/۫ۛۖ;Ljava/lang/String;)V

    iput-object v0, p0, Ll/۟ܽۘ;->ۗ:Ll/ۜᩳۘ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 470
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "File{fileId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۗܽۘ;->᩸:Ll/۫ۛۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fileName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۗܽۘ;->᩶:Ll/ܽۧۘ;

    .line 472
    invoke-virtual {v1}, Ll/ܽۧۘ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(J[BII)I
    .locals 4

    .line 205
    iget-object v0, p0, Ll/ۗܽۘ;->ۙ:Ll/ܰܽۘ;

    iget-object v1, p0, Ll/ۗܽۘ;->᩸:Ll/۫ۛۖ;

    invoke-virtual {v0, v1, p1, p2, p5}, Ll/ۖᩳۘ;->֫(Ll/۫ۛۖ;JI)Ll/ᩳ᩺ۖ;

    move-result-object p1

    .line 206
    invoke-virtual {p1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object p2

    check-cast p2, Ll/᩻ۨۖ;

    invoke-virtual {p2}, Ll/᩻ۨۖ;->ۡ()J

    move-result-wide v0

    sget-object p2, Ll/۟۫ۖ;->ܿ֫:Ll/۟۫ۖ;

    invoke-virtual {p2}, Ll/۟۫ۖ;->getValue()J

    move-result-wide v2

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    const/4 p1, -0x1

    return p1

    .line 209
    :cond_0
    invoke-virtual {p1}, Ll/ᩳ᩺ۖ;->᩷()I

    move-result p2

    invoke-static {p5, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/4 p5, 0x0

    .line 210
    invoke-virtual {p1, p5, p3, p4, p2}, Ll/ᩳ᩺ۖ;->֫(I[BII)V

    return p2
.end method

.method public final ֫(Ll/ۜ۟ۖ;)J
    .locals 3

    .line 133
    iget-object v0, p0, Ll/ۗܽۘ;->ۙ:Ll/ܰܽۘ;

    invoke-virtual {v0}, Ll/ۖᩳۘ;->ۖ()J

    move-result-wide v0

    .line 141
    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ll/ۜ۟ۖ;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    move-exception p1

    .line 150
    new-instance v0, Ljava/io/IOException;

    const-string v1, "SMB write canceled"

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    .line 148
    new-instance v0, Ljava/io/IOException;

    const-string v1, "SMB write failed"

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception p1

    .line 146
    new-instance v0, Ljava/io/IOException;

    const-string v1, "SMB write timed out"

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_3
    move-exception p1

    .line 143
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 144
    new-instance v0, Ljava/io/IOException;

    const-string v1, "SMB write interrupted"

    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ֫(JIJ)Ljava/io/InputStream;
    .locals 12

    .line 464
    new-instance v10, Ll/ܽᩳۘ;

    move-object v11, p0

    iget-object v0, v11, Ll/ۗܽۘ;->ۙ:Ll/ܰܽۘ;

    invoke-virtual {v0}, Ll/ۖᩳۘ;->ܽ()I

    move-result v2

    invoke-virtual {v0}, Ll/ۖᩳۘ;->ᩳ()J

    move-result-wide v3

    move-object v0, v10

    move-object v1, p0

    move-wide v5, p1

    move-wide/from16 v7, p4

    move v9, p3

    invoke-direct/range {v0 .. v9}, Ll/ܽᩳۘ;-><init>(Ll/۟ܽۘ;IJJJI)V

    return-object v10
.end method

.method public final ۧ(JI[B)Ll/ۜ۟ۖ;
    .locals 1

    .line 115
    iget-object v0, p0, Ll/۟ܽۘ;->ۗ:Ll/ۜᩳۘ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۜᩳۘ;->֫(JI[B)Ll/ۜ۟ۖ;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ()I
    .locals 1

    .line 174
    iget-object v0, p0, Ll/ۗܽۘ;->ۙ:Ll/ܰܽۘ;

    invoke-virtual {v0}, Ll/ۖᩳۘ;->ܽ()I

    move-result v0

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 181
    iget-object v0, p0, Ll/ۗܽۘ;->ۙ:Ll/ܰܽۘ;

    invoke-virtual {v0}, Ll/ۖᩳۘ;->ۜ()I

    move-result v0

    return v0
.end method

.method public final ᩳ(J)Ljava/io/InputStream;
    .locals 11

    .line 457
    new-instance v10, Ll/ܽᩳۘ;

    iget-object v0, p0, Ll/ۗܽۘ;->ۙ:Ll/ܰܽۘ;

    invoke-virtual {v0}, Ll/ۖᩳۘ;->ܽ()I

    move-result v2

    invoke-virtual {v0}, Ll/ۖᩳۘ;->ᩳ()J

    move-result-wide v3

    const-wide/16 v7, -0x1

    const/4 v9, 0x1

    move-object v0, v10

    move-object v1, p0

    move-wide v5, p1

    .line 62
    invoke-direct/range {v0 .. v9}, Ll/ܽᩳۘ;-><init>(Ll/۟ܽۘ;IJJJI)V

    return-object v10
.end method
