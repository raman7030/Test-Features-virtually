.class public final synthetic Ll/۬ۛۚ;
.super Ljava/lang/Object;
.source "47FE"


# direct methods
.method public static ֫(Ll/֫ۨۚ;Ll/ۗۛۚ;)Ll/֫ۨۚ;
    .locals 3

    .line 35
    check-cast p0, Ll/۫ۛۚ;

    invoke-interface {p0, p1}, Ll/۫ۛۚ;->֫(Ll/ۗۛۚ;)Ll/֫ۨۚ;

    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const-class v0, Ll/ܺۤۚ;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 37
    check-cast p0, Ll/ܺۤۚ;

    .line 38
    invoke-virtual {p0}, Ll/ܺۤۚ;->ᩳ()Ll/ۧۤۚ;

    move-result-object p1

    const/4 v0, 0x5

    new-array v0, v0, [Ll/ۧۤۚ;

    .line 39
    sget-object v1, Ll/ۧۤۚ;->ۖ֫:Ll/ۧۤۚ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۧۤۚ;->ۡ֫:Ll/ۧۤۚ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ۧۤۚ;->֡֫:Ll/ۧۤۚ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ll/ۧۤۚ;->᩻֫:Ll/ۧۤۚ;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Ll/ۧۤۚ;->ۤ֫:Ll/ۧۤۚ;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    invoke-virtual {p1, v0}, Ll/ۧۤۚ;->֫([Ll/ۧۤۚ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 42
    new-instance v0, Ll/ۤ᩺ۚ;

    invoke-virtual {p1}, Ll/ۧۤۚ;->֫()C

    move-result p1

    invoke-direct {v0, p1, p0}, Ll/ۤ᩺ۚ;-><init>(CLl/ܺۤۚ;)V

    return-object v0

    .line 45
    :cond_0
    new-instance p1, Ll/۫᩺ۚ;

    invoke-direct {p1, p0}, Ll/۫᩺ۚ;-><init>(Ll/ܺۤۚ;)V

    return-object p1

    :cond_1
    return-object p0
.end method

.method public static ֫(Ll/ܺۤۚ;Ll/ۗۛۚ;)V
    .locals 2

    .line 61
    invoke-virtual {p0}, Ll/ܺۤۚ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 62
    iget v0, p0, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p1, v0}, Ll/ۗۛۚ;->ᩳ(I)Ll/ܺۤۚ;

    move-result-object p1

    goto :goto_0

    .line 64
    :cond_0
    new-instance p1, Ll/ܺۤۚ;

    iget v0, p0, Ll/ۜۨۚ;->᩸:I

    iget-object v1, p0, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    invoke-direct {p1, v0, v1}, Ll/ܺۤۚ;-><init>(ILl/ۖۤۚ;)V

    .line 66
    :goto_0
    iget-object p1, p1, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    iput-object p1, p0, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    return-void
.end method
