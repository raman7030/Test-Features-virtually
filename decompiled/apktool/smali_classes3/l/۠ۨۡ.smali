.class public final Ll/۠ۨۡ;
.super Ljava/lang/Object;
.source "OJQ"


# direct methods
.method public static ֫(Ljava/io/InputStream;)[B
    .locals 4

    .line 53
    invoke-static {p0}, Ll/֨ۨۡ;->֫(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object p0

    .line 54
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v1, 0x400

    new-array v1, v1, [B

    .line 57
    :goto_0
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    if-lez v2, :cond_0

    const/4 v3, 0x0

    .line 58
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    .line 60
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method

.method public static ֫([BI)[B
    .locals 3

    .line 28
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/4 v1, 0x2

    .line 29
    invoke-static {v0, v1}, Ll/֨ۨۡ;->֫(Ljava/io/OutputStream;I)Ljava/io/OutputStream;

    move-result-object v1

    const/4 v2, 0x0

    .line 30
    invoke-virtual {v1, p0, v2, p1}, Ljava/io/OutputStream;->write([BII)V

    .line 31
    invoke-virtual {v1}, Ljava/io/OutputStream;->flush()V

    .line 32
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    .line 33
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method
