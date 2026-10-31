.class public final Ll/ۢ᩵۠;
.super Ll/֨֡۠;
.source "H44W"

# interfaces
.implements Ll/ۖۡ֨;


# instance fields
.field public ۤ:Ll/۫᩵۠;

.field public ۫:Ll/۫᩵۠;


# virtual methods
.method public final ֫(Ll/۫ܺ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2136
    invoke-interface {p1, p0, p2}, Ll/۫ܺ֨;->֫(Ll/ۢ᩵۠;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/ۗܺ֨;
    .locals 1

    .line 2107
    iget-object v0, p0, Ll/֨֡۠;->ۗ:Ll/ᩴۚ۠;

    .line 2129
    invoke-static {v0}, Ll/۟ۚ۠;->ۧ(Ll/ᩴۚ۠;)Ll/ۗܺ֨;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۚ֡۠;)Ll/۫᩵۠;
    .locals 1

    .line 2140
    sget-object v0, Ll/ۚ֡۠;->᩹:Ll/ۚ֡۠;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Ll/ۢ᩵۠;->۫:Ll/۫᩵۠;

    return-object p1

    :cond_0
    iget-object p1, p0, Ll/ۢ᩵۠;->ۤ:Ll/۫᩵۠;

    return-object p1
.end method

.method public final ֫(Ll/֡ۚ۠;)V
    .locals 0

    .line 2126
    invoke-virtual {p1, p0}, Ll/֡ۚ۠;->֫(Ll/ۢ᩵۠;)V

    return-void
.end method
