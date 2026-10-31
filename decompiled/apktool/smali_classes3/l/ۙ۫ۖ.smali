.class public final Ll/ۙ۫ۖ;
.super Ll/ᩴ۬ۖ;
.source "39IB"


# virtual methods
.method public final ֫(Ll/ۚ۬ۖ;)I
    .locals 0

    .line 156
    check-cast p1, Ll/ۗ۫ۖ;

    .line 163
    iget-object p1, p1, Ll/ۛ۫ۖ;->᩹:[B

    array-length p1, p1

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final ֫(Ll/ۚ۬ۖ;Ll/ܺ۬ۖ;)V
    .locals 1

    .line 156
    check-cast p1, Ll/ۗ۫ۖ;

    .line 168
    invoke-static {p1}, Ll/ۗ۫ۖ;->֫(Ll/ۗ۫ۖ;)I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write(I)V

    .line 169
    iget-object p1, p1, Ll/ۛ۫ۖ;->᩹:[B

    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method
