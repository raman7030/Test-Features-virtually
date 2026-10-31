.class public final Ll/᩸᩹ۘ;
.super Ll/ܰ᩹ۘ;
.source "QABT"


# virtual methods
.method public final ֫(Ll/ᩴ۟᩵;)Ljava/io/InputStream;
    .locals 2

    .line 420
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v0

    const/16 v1, 0xce

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 422
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ll/ᩴ۟᩵;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 426
    :catch_0
    new-instance p1, Ll/ۛ᩹ۘ;

    const-string v0, "The server does not support range requests"

    .line 8
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 426
    throw p1

    .line 428
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Ll/ܰ᩹ۘ;->֫(Ll/ᩴ۟᩵;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic ֫(Ll/ᩴ۟᩵;)Ljava/lang/Object;
    .locals 0

    .line 417
    invoke-virtual {p0, p1}, Ll/᩸᩹ۘ;->֫(Ll/ᩴ۟᩵;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method
