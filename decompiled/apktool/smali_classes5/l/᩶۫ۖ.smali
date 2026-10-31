.class public final Ll/᩶۫ۖ;
.super Ll/ۘ۬ۖ;
.source "39IB"


# virtual methods
.method public final ֫(Ll/ۨ۬ۖ;[B)Ll/ۗ۫ۖ;
    .locals 8

    .line 129
    invoke-virtual {p1}, Ll/ۨ۬ۖ;->ᩳ()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    .line 130
    :try_start_0
    new-instance v0, Ll/ۡ۬ۖ;

    iget-object v3, p0, Ll/ۘ۬ۖ;->֫:Ll/ܰۛۡ;

    invoke-direct {v0, v3, p2}, Ll/ۡ۬ۖ;-><init>(Ll/ܰۛۡ;[B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    :try_start_1
    new-instance p2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/4 v3, 0x0

    .line 133
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v4

    if-lez v4, :cond_3

    .line 134
    invoke-virtual {v0}, Ll/ۡ۬ۖ;->ᩳ()Ll/ۨ۬ۖ;

    move-result-object v4

    .line 135
    invoke-virtual {v4}, Ll/ۨ۬ۖ;->ܽ()I

    move-result v5

    invoke-virtual {p1}, Ll/ۨ۬ۖ;->ܽ()I

    move-result v6

    if-ne v5, v6, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    const-string v6, "Expected an ASN.1 BIT STRING as Constructed object, got: %s"

    new-array v7, v1, [Ljava/lang/Object;

    aput-object v4, v7, v2

    if-eqz v5, :cond_2

    .line 136
    invoke-virtual {v0}, Ll/ۡ۬ۖ;->ܽ()I

    move-result v4

    .line 137
    invoke-virtual {v0, v4}, Ll/ۡ۬ۖ;->֫(I)[B

    move-result-object v4

    .line 138
    array-length v5, v4

    sub-int/2addr v5, v1

    invoke-virtual {p2, v4, v1, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 139
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v5

    if-gtz v5, :cond_0

    .line 141
    aget-byte v3, v4, v2

    goto :goto_0

    .line 26
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 144
    :cond_3
    new-instance v1, Ll/ۗ۫ۖ;

    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p2

    invoke-direct {v1, p1, p2, v3}, Ll/ۗ۫ۖ;-><init>(Ll/ۨ۬ۖ;[BI)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 145
    :try_start_2
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v1

    :catchall_0
    move-exception p1

    .line 130
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p2

    :try_start_4
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    .line 146
    new-instance p2, Ll/ۖ۬ۖ;

    const-string v0, "Unable to parse Constructed ASN.1 BIT STRING"

    new-array v1, v2, [Ljava/lang/Object;

    invoke-direct {p2, p1, v0, v1}, Ll/ۖ۬ۖ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    throw p2

    .line 149
    :cond_4
    aget-byte v0, p2, v2

    .line 150
    array-length v2, p2

    invoke-static {p2, v1, v2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p2

    .line 151
    new-instance v1, Ll/ۗ۫ۖ;

    invoke-direct {v1, p1, p2, v0}, Ll/ۗ۫ۖ;-><init>(Ll/ۨ۬ۖ;[BI)V

    return-object v1
.end method

.method public final bridge synthetic ֫(Ll/ۨ۬ۖ;[B)Ll/ۚ۬ۖ;
    .locals 0

    .line 121
    invoke-virtual {p0, p1, p2}, Ll/᩶۫ۖ;->֫(Ll/ۨ۬ۖ;[B)Ll/ۗ۫ۖ;

    move-result-object p1

    return-object p1
.end method
