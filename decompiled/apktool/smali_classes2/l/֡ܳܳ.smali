.class public final Ll/֡ܳܳ;
.super Ljava/io/FilterOutputStream;
.source "27BS"


# virtual methods
.method public final finish()V
    .locals 2

    .line 1789
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    const-string v1, "0\r\n\r\n"

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method public final write(I)V
    .locals 3

    int-to-byte p1, p1

    const/4 v0, 0x1

    new-array v1, v0, [B

    const/4 v2, 0x0

    aput-byte p1, v1, v2

    .line 1771
    invoke-virtual {p0, v1, v2, v0}, Ll/֡ܳܳ;->write([BII)V

    return-void
.end method

.method public final write([B)V
    .locals 2

    const/4 v0, 0x0

    .line 1776
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/֡ܳܳ;->write([BII)V

    return-void
.end method

.method public final write([BII)V
    .locals 4

    if-nez p3, :cond_0

    return-void

    .line 1783
    :cond_0
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const-string v1, "%x\r\n"

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    .line 1784
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 1785
    iget-object p1, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    const-string p2, "\r\n"

    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method
