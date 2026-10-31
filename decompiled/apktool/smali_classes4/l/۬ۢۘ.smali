.class public final Ll/۬ۢۘ;
.super Ll/᩶ۢۘ;
.source "47VB"


# virtual methods
.method public final ֫(Ll/۟ۢۘ;Ll/᩵᩻ۘ;)V
    .locals 2

    .line 36
    invoke-super {p0, p1, p2}, Ll/᩶ۢۘ;->֫(Ll/۟ۢۘ;Ll/᩵᩻ۘ;)V

    .line 38
    new-instance p1, Ll/ܺ᩻ۘ;

    invoke-direct {p1}, Ll/ܺ᩻ۘ;-><init>()V

    .line 39
    new-instance v0, Ll/۠ۢۘ;

    invoke-direct {v0, p1}, Ll/۠ۢۘ;-><init>(Ll/ܺ᩻ۘ;)V

    .line 40
    invoke-virtual {v0}, Ll/۠ۢۘ;->֫()V

    const/16 v1, 0x62

    .line 41
    invoke-virtual {p1, v1}, Ll/ܺ᩻ۘ;->֫(B)V

    .line 94
    iget p2, p2, Ll/᩵᩻ۘ;->ܺ:I

    .line 42
    invoke-virtual {p1, p2}, Ll/ܺ᩻ۘ;->ۧ(I)V

    .line 43
    sget-object p2, Ll/᩵ۡۘ;->ܽ:[B

    .line 397
    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const-string v1, "subsystem"

    .line 393
    invoke-virtual {v1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    .line 43
    invoke-virtual {p1, v1}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 44
    invoke-virtual {p0}, Ll/᩶ۢۘ;->֫()Z

    move-result v1

    int-to-byte v1, v1

    invoke-virtual {p1, v1}, Ll/ܺ᩻ۘ;->֫(B)V

    const-string v1, "sftp"

    .line 393
    invoke-virtual {v1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    .line 45
    invoke-virtual {p1, p2}, Ll/ܺ᩻ۘ;->ᩳ([B)V

    .line 46
    invoke-virtual {p0, v0}, Ll/᩶ۢۘ;->֫(Ll/۠ۢۘ;)V

    return-void
.end method
