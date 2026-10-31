.class public final Ll/ܽ֡۠;
.super Ll/۫᩵۠;
.source "H44W"

# interfaces
.implements Ll/ۛۡ֨;


# instance fields
.field public ۗ:Ll/۫᩵۠;

.field public ۬:Ll/ۚۚ۠;


# virtual methods
.method public final getType()Ll/۬ܺ֨;
    .locals 2

    .line 2252
    iget-object v0, p0, Ll/ܽ֡۠;->۬:Ll/ۚۚ۠;

    instance-of v1, v0, Ll/᩹֡۠;

    if-eqz v1, :cond_1

    sget-object v1, Ll/ᩴۚ۠;->ۛ:Ll/ᩴۚ۠;

    invoke-virtual {v0, v1}, Ll/ۚۚ۠;->֫(Ll/ᩴۚ۠;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܽ֡۠;->۬:Ll/ۚۚ۠;

    check-cast v0, Ll/ܺ᩵۠;

    iget-object v0, v0, Ll/ܺ᩵۠;->ۗ:Ll/ۢۚ۠;

    iget-object v0, v0, Ll/ۢۚ۠;->ܰ:Ll/۫᩵۠;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    return-object v0
.end method

.method public final ֫(Ll/۫ܺ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2263
    invoke-interface {p1, p0, p2}, Ll/۫ܺ֨;->֫(Ll/ܽ֡۠;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/ۗܺ֨;
    .locals 1

    .line 2250
    sget-object v0, Ll/ۗܺ֨;->۟֫:Ll/ۗܺ֨;

    return-object v0
.end method

.method public final ֫(Ll/֡ۚ۠;)V
    .locals 0

    .line 2247
    invoke-virtual {p1, p0}, Ll/֡ۚ۠;->֫(Ll/ܽ֡۠;)V

    return-void
.end method

.method public final ܽ֫()Ll/ᩴۚ۠;
    .locals 1

    .line 2267
    sget-object v0, Ll/ᩴۚ۠;->֡ܽ:Ll/ᩴۚ۠;

    return-object v0
.end method

.method public final ᩷֫()Ll/᩹֡۠;
    .locals 2

    .line 2256
    iget-object v0, p0, Ll/ܽ֡۠;->۬:Ll/ۚۚ۠;

    instance-of v1, v0, Ll/᩹֡۠;

    if-eqz v1, :cond_0

    check-cast v0, Ll/᩹֡۠;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
