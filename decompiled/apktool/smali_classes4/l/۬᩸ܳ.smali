.class public final synthetic Ll/۬᩸ܳ;
.super Ljava/lang/Object;
.source "164Z"

# interfaces
.implements Ll/۬ۤ;


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 2
    check-cast p1, Lbin/mt/plus/Main;

    .line 140
    invoke-virtual {p1}, Lbin/mt/plus/Main;->ۨ()V

    .line 141
    sget v0, Ll/᩸۫ܿ;->֫:I

    .line 221
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v1, "remote_manager_last_protocol"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v2, 0x1

    .line 84
    :cond_0
    invoke-static {p1, v2}, Ll/᩸۫ܿ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method
