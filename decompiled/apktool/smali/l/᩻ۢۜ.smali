.class public final Ll/᩻ۢۜ;
.super Ljava/lang/Object;
.source "J71B"


# virtual methods
.method public final ֫()Ljava/io/InputStream;
    .locals 3

    .line 41
    new-instance v0, Ll/ۢ۟᩵;

    invoke-direct {v0}, Ll/ۢ۟᩵;-><init>()V

    invoke-static {}, Ll/᩻᩹ۡ;->ܶ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object v0

    .line 42
    invoke-static {}, Ll/ۙ᩸᩷;->ۡ()Ll/ܿ۟᩵;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ܿ۟᩵;->֫(Ll/ۡ۟᩵;)Ll/ܽܰ᩵;

    move-result-object v0

    invoke-interface {v0}, Ll/ܽܰ᩵;->execute()Ll/ᩴ۟᩵;

    move-result-object v0

    .line 43
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->ۜ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 48
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 53
    new-instance v2, Ll/ܳۢۜ;

    invoke-virtual {v1}, Ll/֡۟᩵;->֫()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v2, v1, v0}, Ll/ܳۢۜ;-><init>(Ljava/io/InputStream;Ll/ᩴ۟᩵;)V

    return-object v2

    .line 50
    :cond_0
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->close()V

    .line 51
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Boot hierarchy download body is null"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 44
    :cond_1
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v1

    .line 45
    invoke-virtual {v0}, Ll/ᩴ۟᩵;->close()V

    .line 46
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Boot hierarchy download failed with HTTP "

    .line 0
    invoke-static {v1, v2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 46
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
