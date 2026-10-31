.class public final Ll/ۨۢܽ;
.super Ljava/lang/Object;
.source "E67S"

# interfaces
.implements Ll/ۖۢܽ;


# virtual methods
.method public final ֫(Ll/ܺܺܽ;)V
    .locals 6

    .line 79
    invoke-virtual {p1}, Ll/ܺܺܽ;->ۧ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨ᩷ܽ;

    invoke-virtual {v0}, Ll/ۨ᩷ܽ;->ۢ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/InputStream;

    .line 80
    new-instance v1, Ll/ۨ᩷ܽ;

    invoke-direct {v1}, Ll/ۨ᩷ܽ;-><init>()V

    const/16 v2, 0x2800

    :try_start_0
    new-array v2, v2, [B

    .line 84
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 85
    :goto_0
    invoke-virtual {v0, v2}, Ljava/io/InputStream;->read([B)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_0

    const/4 v5, 0x0

    .line 86
    invoke-virtual {v3, v2, v5, v4}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 87
    :cond_0
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 88
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 89
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 90
    invoke-virtual {v1, v0}, Ll/ۨ᩷ܽ;->֫(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    :catch_0
    invoke-virtual {p1, v1}, Ll/ܺܺܽ;->֫(Ll/ۨ᩷ܽ;)V

    return-void
.end method
