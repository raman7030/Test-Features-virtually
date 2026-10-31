.class public final Ll/ۙۢܽ;
.super Ljava/lang/Object;
.source "T5RH"

# interfaces
.implements Ll/ۖۢܽ;


# virtual methods
.method public final ֫(Ll/ܺܺܽ;)V
    .locals 5

    const/4 v0, 0x0

    .line 293
    :try_start_0
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۨ᩷ܽ;

    invoke-virtual {v1}, Ll/ۨ᩷ܽ;->ۢ()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    .line 294
    new-instance v2, Ljava/io/ByteArrayInputStream;

    invoke-direct {v2, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 295
    new-instance v1, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v1, v2}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 297
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v3, 0x400

    new-array v3, v3, [B

    .line 300
    :goto_0
    invoke-virtual {v1, v3}, Ljava/io/InputStream;->read([B)I

    move-result v4

    if-lez v4, :cond_0

    .line 301
    invoke-virtual {v2, v3, v0, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 302
    :cond_0
    invoke-virtual {v1}, Ljava/util/zip/GZIPInputStream;->close()V

    .line 304
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    new-array v0, v0, [B

    .line 308
    :goto_1
    new-instance v1, Ll/ۨ᩷ܽ;

    invoke-direct {v1}, Ll/ۨ᩷ܽ;-><init>()V

    .line 309
    invoke-virtual {v1, v0}, Ll/ۨ᩷ܽ;->֫(Ljava/lang/Object;)V

    .line 310
    invoke-virtual {p1, v1}, Ll/ܺܺܽ;->֫(Ll/ۨ᩷ܽ;)V

    return-void
.end method
