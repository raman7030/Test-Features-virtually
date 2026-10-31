.class public final Ll/۟᩺ۖ;
.super Ll/۬᩺ۖ;
.source "D9C3"


# virtual methods
.method public final ֫(Ll/۫ܰۖ;)V
    .locals 2

    .line 41
    iget-object v0, p0, Ll/۬᩺ۖ;->֫:Ll/ۗ᩺ۖ;

    invoke-virtual {v0}, Ll/ۗ᩺ۖ;->getValue()J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {p1, v1}, Ll/ۤܰۖ;->ۧ(I)V

    .line 42
    iget-object v0, p0, Ll/۬᩺ۖ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ۧ(I)V

    .line 43
    iget-object v0, p0, Ll/۬᩺ۖ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    sget-object v1, Ll/۠ܰۖ;->ᩳ:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0, v1}, Ll/ۤܰۖ;->ۧ(Ljava/lang/String;Ljava/nio/charset/Charset;)V

    return-void
.end method
