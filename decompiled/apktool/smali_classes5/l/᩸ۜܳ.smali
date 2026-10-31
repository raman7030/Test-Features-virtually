.class public final Ll/᩸ۜܳ;
.super Ll/ۤۜܳ;
.source "969A"


# virtual methods
.method public final ֫(Ll/ܽۢܳ;)V
    .locals 3

    .line 716
    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const-string v1, "sel_all"

    const v2, 0x7f120a79

    invoke-static {v2, v0, v1}, Ll/ۧۛܿ;->֫(ILl/ۗܺ᩷;Ljava/lang/String;)V

    .line 717
    invoke-virtual {p1}, Ll/ܽۢܳ;->᩻֫()V

    return-void
.end method

.method public final ܳ()Z
    .locals 3

    .line 722
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "swipe_select_count"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v2
.end method
