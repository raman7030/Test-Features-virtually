.class public final Ll/ۚܰ᩻;
.super Ljava/io/FilterOutputStream;
.source "P77N"


# instance fields
.field public ᩸:J


# direct methods
.method public static ֫(Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    .locals 1

    .line 5795
    instance-of v0, p0, Ll/ۢ۟᩻;

    if-nez v0, :cond_1

    .line 5796
    invoke-static {p0}, Ll/ܺ۟᩻;->֫(Ljava/lang/RuntimeException;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    .line 5799
    :cond_0
    new-instance v0, Ll/ۢ۟᩻;

    invoke-direct {v0, p0}, Ll/ۢ۟᩻;-><init>(Ljava/lang/RuntimeException;)V

    return-object v0

    :cond_1
    return-object p0
.end method

.method public static ֫(Ljava/io/IOException;)Ll/᩷۟᩻;
    .locals 1

    .line 5789
    instance-of v0, p0, Ll/᩷۟᩻;

    if-eqz v0, :cond_0

    .line 5790
    check-cast p0, Ll/᩷۟᩻;

    return-object p0

    .line 5791
    :cond_0
    new-instance v0, Ll/᩷۟᩻;

    invoke-direct {v0, p0}, Ll/᩷۟᩻;-><init>(Ljava/io/IOException;)V

    return-object v0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 5774
    :try_start_0
    invoke-super {p0}, Ljava/io/FilterOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 5778
    invoke-static {v0}, Ll/ۚܰ᩻;->֫(Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v0

    .line 5776
    invoke-static {v0}, Ll/ۚܰ᩻;->֫(Ljava/io/IOException;)Ll/᩷۟᩻;

    move-result-object v0

    throw v0
.end method

.method public final flush()V
    .locals 1

    .line 5763
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 5767
    invoke-static {v0}, Ll/ۚܰ᩻;->֫(Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;

    move-result-object v0

    throw v0

    :catch_1
    move-exception v0

    .line 5765
    invoke-static {v0}, Ll/ۚܰ᩻;->֫(Ljava/io/IOException;)Ll/᩷۟᩻;

    move-result-object v0

    throw v0
.end method

.method public final write(I)V
    .locals 6

    .line 5783
    iget-wide v0, p0, Ll/ۚܰ᩻;->᩸:J

    const-wide v2, 0x1fffffffffffffL

    const/4 v4, 0x1

    int-to-long v4, v4

    sub-long/2addr v2, v4

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    .line 5738
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    .line 5739
    iget-wide v0, p0, Ll/ۚܰ᩻;->᩸:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۚܰ᩻;->᩸:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 5743
    invoke-static {p1}, Ll/ۚܰ᩻;->֫(Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 5741
    invoke-static {p1}, Ll/ۚܰ᩻;->֫(Ljava/io/IOException;)Ll/᩷۟᩻;

    move-result-object p1

    throw p1

    .line 5784
    :cond_0
    new-instance p1, Ll/᩻۟᩻;

    const-string v0, "Workspace ZIP entry is too large"

    .line 5830
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 5784
    throw p1
.end method

.method public final write([BII)V
    .locals 7

    if-ltz p3, :cond_0

    .line 5783
    iget-wide v0, p0, Ll/ۚܰ᩻;->᩸:J

    int-to-long v2, p3

    const-wide v4, 0x1fffffffffffffL

    sub-long/2addr v4, v2

    cmp-long v6, v0, v4

    if-gtz v6, :cond_0

    .line 5751
    :try_start_0
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 5752
    iget-wide p1, p0, Ll/ۚܰ᩻;->᩸:J

    add-long/2addr p1, v2

    iput-wide p1, p0, Ll/ۚܰ᩻;->᩸:J
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 5756
    invoke-static {p1}, Ll/ۚܰ᩻;->֫(Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    .line 5754
    invoke-static {p1}, Ll/ۚܰ᩻;->֫(Ljava/io/IOException;)Ll/᩷۟᩻;

    move-result-object p1

    throw p1

    .line 5784
    :cond_0
    new-instance p1, Ll/᩻۟᩻;

    const-string p2, "Workspace ZIP entry is too large"

    .line 5830
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 5784
    throw p1
.end method
