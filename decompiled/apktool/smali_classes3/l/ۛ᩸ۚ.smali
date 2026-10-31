.class public final Ll/ۛ᩸ۚ;
.super Ll/ۚ᩸ۚ;
.source "4BJX"


# virtual methods
.method public final ֫(Ll/᩶֡ۚ;)I
    .locals 1

    .line 509
    invoke-virtual {p1}, Ll/᩶֡ۚ;->᩵()Ll/᩶֡ۚ;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 511
    :cond_0
    invoke-virtual {p1}, Ll/᩶֡ۚ;->᩵()Ll/᩶֡ۚ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶֡ۚ;->۫()Ll/֫᩸ۚ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    invoke-virtual {p1}, Ll/᩶֡ۚ;->ۛ()I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "nth-last-child"

    return-object v0
.end method
