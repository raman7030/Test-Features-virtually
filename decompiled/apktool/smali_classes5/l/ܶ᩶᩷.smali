.class public Ll/ܶ᩶᩷;
.super Ll/֡᩶᩷;
.source "J942"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ll/֡᩶᩷;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۚ()Ljava/lang/String;
    .locals 1

    const-string v0, "RemoteManageActivity"

    return-object v0
.end method

.method public final ۨ()V
    .locals 4

    .line 19
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "bin.mt.plus.tool.RemoteManageActivity.EXTRA_PROTOCOL"

    .line 20
    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 22
    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    invoke-static {p0, v0}, Ll/᩸۫ܿ;->֫(Ll/ۗܺ᩷;I)V

    return-void

    .line 25
    :cond_0
    sget v0, Ll/᩸۫ܿ;->֫:I

    .line 221
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    const-string v1, "remote_manager_last_protocol"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v3, 0x1

    .line 84
    :cond_1
    invoke-static {p0, v3}, Ll/᩸۫ܿ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method
