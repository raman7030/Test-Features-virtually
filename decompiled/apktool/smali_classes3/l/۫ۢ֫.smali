.class public final Ll/۫ۢ֫;
.super Ljava/lang/Object;
.source "PAOD"


# direct methods
.method public static final ֫(Ll/ܶ۫ۧ;Ll/۟ۢ֫;Ljava/lang/String;Landroid/os/Bundle;)Ll/ᩳܺ֫;
    .locals 2

    const-string v0, "registry"

    .line 5
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycle"

    .line 10
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-virtual {p0, p2}, Ll/ܶ۫ۧ;->֫(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 34
    sget v1, Ll/ۧܺ֫;->ܳ:I

    invoke-static {v0, p3}, Ll/֫ܺ֫;->֫(Landroid/os/Bundle;Landroid/os/Bundle;)Ll/ۧܺ֫;

    move-result-object p3

    .line 35
    new-instance v0, Ll/ᩳܺ֫;

    invoke-direct {v0, p2, p3}, Ll/ᩳܺ֫;-><init>(Ljava/lang/String;Ll/ۧܺ֫;)V

    .line 36
    invoke-virtual {v0, p1, p0}, Ll/ᩳܺ֫;->֫(Ll/۟ۢ֫;Ll/ܶ۫ۧ;)V

    .line 37
    invoke-static {p1, p0}, Ll/۫ۢ֫;->֫(Ll/۟ۢ֫;Ll/ܶ۫ۧ;)V

    return-object v0
.end method

.method public static final ֫(Ll/ۚܺ֫;Ll/ܶ۫ۧ;Ll/۟ۢ֫;)V
    .locals 1

    const-string v0, "registry"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycle"

    .line 10
    invoke-static {p2, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-virtual {p0}, Ll/ۚܺ֫;->ۧ()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ᩳܺ֫;

    if-eqz p0, :cond_0

    .line 50
    invoke-virtual {p0}, Ll/ᩳܺ֫;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 51
    invoke-virtual {p0, p2, p1}, Ll/ᩳܺ֫;->֫(Ll/۟ۢ֫;Ll/ܶ۫ۧ;)V

    .line 52
    invoke-static {p2, p1}, Ll/۫ۢ֫;->֫(Ll/۟ۢ֫;Ll/ܶ۫ۧ;)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/۟ۢ֫;Ll/ܶ۫ۧ;)V
    .locals 2

    .line 57
    invoke-virtual {p0}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    .line 58
    sget-object v1, Ll/ܰۢ֫;->ۙ:Ll/ܰۢ֫;

    if-eq v0, v1, :cond_1

    .line 59
    sget-object v1, Ll/ܰۢ֫;->۬:Ll/ܰۢ֫;

    invoke-virtual {v0, v1}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 62
    :cond_0
    new-instance v0, Ll/۬ۢ֫;

    invoke-direct {v0, p0, p1}, Ll/۬ۢ֫;-><init>(Ll/۟ۢ֫;Ll/ܶ۫ۧ;)V

    invoke-virtual {p0, v0}, Ll/۟ۢ֫;->֫(Ll/ܳۡ֫;)V

    return-void

    .line 60
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ll/ܶ۫ۧ;->ۧ()V

    return-void
.end method
