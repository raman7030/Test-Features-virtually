.class public final Ll/֡ܰ֡;
.super Ll/ۢܰ֡;
.source "N51M"

# interfaces
.implements Ll/ۖܽۚ;


# virtual methods
.method public final ֨()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ᩶()I
    .locals 3

    .line 48
    iget-object v0, p0, Ll/ۢܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v1

    iget v2, p0, Ll/ۢܰ֡;->᩹:I

    invoke-virtual {v1, v2}, Ll/ۘۨ֡;->᩷(I)I

    move-result v1

    if-nez v1, :cond_0

    .line 50
    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/ۢܰ֡;->᩹:I

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->ۢ(I)I

    move-result v0

    return v0

    :cond_0
    return v1
.end method
