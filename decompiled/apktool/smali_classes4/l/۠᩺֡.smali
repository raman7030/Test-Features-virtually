.class public final Ll/۠᩺֡;
.super Ll/ۢܰ֡;
.source "K4XS"

# interfaces
.implements Ll/ܶۧۚ;


# virtual methods
.method public final synthetic ֨()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ֫()I
    .locals 2

    .line 49
    iget-object v0, p0, Ll/ۢܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/ۢܰ֡;->᩹:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->᩷(I)I

    move-result v0

    return v0
.end method

.method public final ۗ()S
    .locals 2

    .line 59
    iget-object v0, p0, Ll/ۢܰ֡;->᩸:Ll/۬ۛ֡;

    invoke-virtual {v0}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object v0

    iget v1, p0, Ll/ۢܰ֡;->᩹:I

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {v0, v1}, Ll/ۘۨ֡;->᩻(I)I

    move-result v0

    int-to-short v0, v0

    return v0
.end method

.method public final ᩸()J
    .locals 3

    .line 54
    invoke-virtual {p0}, Ll/۠᩺֡;->ۗ()S

    move-result v0

    int-to-long v0, v0

    const/16 v2, 0x30

    shl-long/2addr v0, v2

    return-wide v0
.end method
