.class public final Ll/ᩳ۬ۜ;
.super Ll/᩺ܿۧ;
.source "R751"


# virtual methods
.method public final ֫(Ll/֫ܳۧ;)J
    .locals 2

    .line 14
    iget-object v0, p1, Ll/֫ܳۧ;->ۧ:Ljava/io/IOException;

    sget v1, Ll/᩹᩶ۜ;->᩸:I

    :goto_0
    if-eqz v0, :cond_1

    .line 24
    instance-of v1, v0, Ll/᩹᩶ۜ;

    if-eqz v1, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0

    .line 27
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    .line 17
    :cond_1
    invoke-super {p0, p1}, Ll/᩺ܿۧ;->֫(Ll/֫ܳۧ;)J

    move-result-wide v0

    return-wide v0
.end method
