.class public final Ll/۟ۨܿ;
.super Ll/ۜ᩺ܿ;
.source "964V"


# virtual methods
.method public final ֫(I)V
    .locals 1

    const/16 v0, 0x80

    if-ge p1, v0, :cond_0

    int-to-char p1, p1

    goto :goto_0

    :cond_0
    const p1, 0xfffd

    .line 429
    :goto_0
    iget-object v0, p0, Ll/ۜ᩺ܿ;->᩶:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method
