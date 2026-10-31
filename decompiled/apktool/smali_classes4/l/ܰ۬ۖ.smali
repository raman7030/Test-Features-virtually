.class public final Ll/ܰ۬ۖ;
.super Ll/ۘ۬ۖ;
.source "P9KH"


# virtual methods
.method public final ֫([B)Ll/֫۫ۖ;
    .locals 4

    .line 72
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 73
    :try_start_0
    new-instance v1, Ll/ۡ۬ۖ;

    iget-object v2, p0, Ll/ۘ۬ۖ;->֫:Ll/ܰۛۡ;

    invoke-direct {v1, v2, p1}, Ll/ۡ۬ۖ;-><init>(Ll/ܰۛۡ;[B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    :try_start_1
    invoke-virtual {v1}, Ll/ۡ۬ۖ;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۚ۬ۖ;

    .line 75
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 77
    :cond_0
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 80
    new-instance v1, Ll/֫۫ۖ;

    invoke-direct {v1, v0, p1}, Ll/֫۫ۖ;-><init>(Ljava/util/ArrayList;[B)V

    return-object v1

    :catchall_0
    move-exception p1

    .line 73
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    .line 78
    new-instance v0, Ll/ۖ۬ۖ;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Unable to parse the ASN.1 SEQUENCE contents."

    invoke-direct {v0, p1, v2, v1}, Ll/ۖ۬ۖ;-><init>(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    throw v0
.end method

.method public final bridge synthetic ֫(Ll/ۨ۬ۖ;[B)Ll/ۚ۬ۖ;
    .locals 0

    .line 64
    invoke-virtual {p0, p2}, Ll/ܰ۬ۖ;->֫([B)Ll/֫۫ۖ;

    move-result-object p1

    return-object p1
.end method
