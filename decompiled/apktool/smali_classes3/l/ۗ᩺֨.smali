.class public final Ll/ۗ᩺֨;
.super Ll/ܳ֨۠;
.source "8459"


# instance fields
.field public ֫:Z

.field public ۧ:Ll/ۛ֡֨;


# virtual methods
.method public final ֫(Ll/ۜۚ۠;)V
    .locals 2

    .line 3261
    iget-object v0, p1, Ll/ۜۚ۠;->۫:Ll/۫᩵۠;

    invoke-static {v0}, Ll/۟ۚ۠;->᩹(Ll/ۚۚ۠;)Ll/ۛ֡֨;

    move-result-object v0

    iget-object v1, p0, Ll/ۗ᩺֨;->ۧ:Ll/ۛ֡֨;

    if-ne v0, v1, :cond_0

    const/4 p1, 0x1

    .line 3262
    iput-boolean p1, p0, Ll/ۗ᩺֨;->֫:Z

    return-void

    .line 288
    :cond_0
    iget-object p1, p1, Ll/ۜۚ۠;->۫:Ll/۫᩵۠;

    invoke-virtual {p0, p1}, Ll/ۗ᩺֨;->ۧ(Ll/ۚۚ۠;)V

    return-void
.end method

.method public final ֫(Ll/ۢ᩵۠;)V
    .locals 2

    .line 3252
    iget-object v0, p1, Ll/ۢ᩵۠;->۫:Ll/۫᩵۠;

    invoke-static {v0}, Ll/۟ۚ۠;->᩹(Ll/ۚۚ۠;)Ll/ۛ֡֨;

    move-result-object v0

    iget-object v1, p0, Ll/ۗ᩺֨;->ۧ:Ll/ۛ֡֨;

    if-ne v0, v1, :cond_0

    const/4 p1, 0x1

    .line 3253
    iput-boolean p1, p0, Ll/ۗ᩺֨;->֫:Z

    return-void

    .line 3256
    :cond_0
    invoke-super {p0, p1}, Ll/ܳ֨۠;->֫(Ll/ۢ᩵۠;)V

    return-void
.end method

.method public final ۧ(Ll/ۚۚ۠;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 3245
    iget-object v0, p0, Ll/ۗ᩺֨;->ۧ:Ll/ۛ֡֨;

    if-eqz v0, :cond_0

    .line 3246
    invoke-virtual {p1, p0}, Ll/ۚۚ۠;->֫(Ll/֡ۚ۠;)V

    :cond_0
    return-void
.end method
