.class public final Ll/֡ۤۡ;
.super Ljava/lang/Object;
.source "U2R9"


# direct methods
.method public static ֫(Ljava/lang/AutoCloseable;)V
    .locals 0

    if-eqz p0, :cond_0

    .line 45
    :try_start_0
    check-cast p0, Ljava/lang/AutoCloseable;

    invoke-static {p0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/AutoCloseable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method public static ֫(JLjava/io/InputStream;)[B
    .locals 6

    const/16 v0, 0x70

    new-array v1, v0, [B

    .line 2020
    invoke-static {p2, v1, v0}, Ll/᩹ۢ֡;->ۧ(Ljava/io/InputStream;[BI)V

    const/16 v2, 0x34

    .line 81
    invoke-static {v2, v1}, Ll/ܺܰۡ;->֫(I[B)I

    move-result v2

    .line 84
    new-instance v3, Ll/֡ܺᩴ;

    add-int/lit8 v4, v2, 0x4

    add-int/lit16 v2, v2, 0xd0

    invoke-direct {v3, v2}, Ll/֡ܺᩴ;-><init>(I)V

    const/4 v2, 0x0

    .line 129
    invoke-virtual {v3, v1, v2, v0}, Ll/֡ܺᩴ;->write([BII)V

    int-to-long v4, v4

    .line 88
    invoke-static {v4, v5, p0, p1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    int-to-long v0, v0

    sub-long/2addr p0, v0

    long-to-int p1, p0

    const/16 p0, 0x1000

    new-array v0, p0, [B

    :goto_0
    const/4 v1, -0x1

    if-lez p1, :cond_1

    .line 68
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 69
    invoke-virtual {p2, v0, v2, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    if-eq v4, v1, :cond_0

    .line 73
    invoke-virtual {v3, v0, v2, v4}, Ll/֡ܺᩴ;->write([BII)V

    sub-int/2addr p1, v4

    goto :goto_0

    .line 71
    :cond_0
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    throw p0

    .line 93
    :cond_1
    iget-object p1, v3, Ll/֡ܺᩴ;->᩸:[B

    iget v4, v3, Ll/֡ܺᩴ;->᩹:I

    add-int/lit8 v4, v4, -0x4

    invoke-static {v4, p1}, Ll/ܺܰۡ;->֫(I[B)I

    move-result p1

    mul-int/lit8 p1, p1, 0xc

    :goto_1
    if-lez p1, :cond_3

    .line 68
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 69
    invoke-virtual {p2, v0, v2, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v4

    if-eq v4, v1, :cond_2

    .line 73
    invoke-virtual {v3, v0, v2, v4}, Ll/֡ܺᩴ;->write([BII)V

    sub-int/2addr p1, v4

    goto :goto_1

    .line 71
    :cond_2
    new-instance p0, Ljava/io/EOFException;

    invoke-direct {p0}, Ljava/io/EOFException;-><init>()V

    throw p0

    .line 98
    :cond_3
    iget-object p0, v3, Ll/֡ܺᩴ;->᩸:[B

    array-length p1, p0

    iget p2, v3, Ll/֡ܺᩴ;->᩹:I

    if-ne p1, p2, :cond_4

    return-object p0

    .line 357
    :cond_4
    array-length p1, p0

    invoke-static {p1, v2, p2}, Ll/ۢ᩹ۡ;->ۧ(III)V

    if-nez p2, :cond_5

    .line 255
    sget-object p1, Ll/ۚ᩺ۘ;->֫:[B

    goto :goto_2

    :cond_5
    new-array p1, p2, [B

    .line 256
    :goto_2
    invoke-static {p0, v2, p1, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p1
.end method

.method public static ֫(Ljava/io/InputStream;I)[B
    .locals 2

    .line 56
    :try_start_0
    new-instance v0, Ll/֡ܺᩴ;

    if-gtz p1, :cond_0

    const/16 p1, 0x20

    :cond_0
    invoke-direct {v0, p1}, Ll/֡ܺᩴ;-><init>(I)V

    .line 57
    invoke-static {p0, v0}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 58
    iget-object p1, v0, Ll/֡ܺᩴ;->᩸:[B

    array-length v1, p1

    iget v0, v0, Ll/֡ܺᩴ;->᩹:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v1, v0, :cond_2

    if-eqz p0, :cond_1

    .line 62
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    :cond_1
    return-object p1

    .line 61
    :cond_2
    :try_start_1
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p0, :cond_3

    .line 62
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    :cond_3
    return-object p1

    :catchall_0
    move-exception p1

    if-eqz p0, :cond_4

    .line 55
    :try_start_2
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_0
    throw p1
.end method
