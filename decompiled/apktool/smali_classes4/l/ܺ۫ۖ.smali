.class public final Ll/ܺ۫ۖ;
.super Ll/ᩴ۬ۖ;
.source "D9KC"


# virtual methods
.method public final ֫(Ll/ۚ۬ۖ;)I
    .locals 1

    .line 62
    check-cast p1, Ll/ۖ۫ۖ;

    .line 69
    iget-object v0, p1, Ll/᩹۫ۖ;->᩹:[B

    if-nez v0, :cond_0

    .line 84
    invoke-static {p1}, Ll/ۖ۫ۖ;->֫(Ll/ۖ۫ۖ;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    iput-object v0, p1, Ll/᩹۫ۖ;->᩹:[B

    .line 72
    :cond_0
    iget-object p1, p1, Ll/᩹۫ۖ;->᩹:[B

    array-length p1, p1

    return p1
.end method

.method public final ֫(Ll/ۚ۬ۖ;Ll/ܺ۬ۖ;)V
    .locals 1

    .line 62
    check-cast p1, Ll/ۖ۫ۖ;

    .line 77
    iget-object v0, p1, Ll/᩹۫ۖ;->᩹:[B

    if-nez v0, :cond_0

    .line 84
    invoke-static {p1}, Ll/ۖ۫ۖ;->֫(Ll/ۖ۫ۖ;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    iput-object v0, p1, Ll/᩹۫ۖ;->᩹:[B

    .line 80
    :cond_0
    iget-object p1, p1, Ll/᩹۫ۖ;->᩹:[B

    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method
