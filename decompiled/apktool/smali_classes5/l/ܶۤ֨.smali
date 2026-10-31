.class public final Ll/ܶۤ֨;
.super Ll/᩷ۤ֨;
.source "6428"


# instance fields
.field public ֨:Ll/ܰ᩵֨;

.field public ۠:Z


# virtual methods
.method public final ֫(Ll/ۚ᩵۠;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ۢۚ۠;)V
    .locals 2

    .line 1666
    iget-object v0, p0, Ll/ܶۤ֨;->֨:Ll/ܰ᩵֨;

    iget-object v1, p1, Ll/ۢۚ۠;->᩺:Ll/۫֡֨;

    invoke-virtual {v0, v1}, Ll/ܰ᩵֨;->ܿ(Ll/ۛ֡֨;)V

    .line 1667
    invoke-super {p0, p1}, Ll/᩷ۤ֨;->֫(Ll/ۢۚ۠;)V

    return-void
.end method

.method public final ֫(Ll/ܳ֡۠;)V
    .locals 1

    .line 1653
    iget-boolean v0, p0, Ll/ܶۤ֨;->۠:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 1656
    iput-boolean v0, p0, Ll/ܶۤ֨;->۠:Z

    const/4 v0, 0x0

    .line 1658
    :try_start_0
    invoke-super {p0, p1}, Ll/᩷ۤ֨;->֫(Ll/ܳ֡۠;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1660
    iput-boolean v0, p0, Ll/ܶۤ֨;->۠:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v0, p0, Ll/ܶۤ֨;->۠:Z

    .line 1661
    throw p1
.end method

.method public final ۧ(Ll/۫֡֨;)Z
    .locals 1

    .line 1671
    iget-object v0, p0, Ll/ܶۤ֨;->֨:Ll/ܰ᩵֨;

    invoke-virtual {v0, p1}, Ll/۟᩵֨;->ۧ(Ll/ۛ֡֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    iget-object p1, p1, Ll/ۛ֡֨;->ۙ:Ll/֨ᩴ֨;

    sget-object v0, Ll/֨ᩴ֨;->ۧ֫:Ll/֨ᩴ֨;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
