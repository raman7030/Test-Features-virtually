.class public final Ll/֨۫ܿ;
.super Landroid/content/BroadcastReceiver;
.source "G7AW"


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 825
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "bin.mt.remote.RemoteServerService.ACTION_FAILED_TO_START"

    .line 826
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "msg"

    if-eqz v0, :cond_1

    .line 847
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 848
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 849
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    .line 828
    :cond_0
    invoke-static {}, Ll/᩸۫ܿ;->᩻()V

    goto :goto_0

    :cond_1
    const-string v0, "bin.mt.plus.FTP_SERVER_FAILED_TO_START"

    .line 829
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 847
    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 848
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_2

    .line 849
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    .line 831
    :cond_2
    invoke-static {}, Ll/᩸۫ܿ;->ܳ()V

    goto :goto_0

    .line 832
    :cond_3
    invoke-static {}, Ll/᩸۫ܿ;->ܿ()Z

    move-result p2

    const-wide/16 v0, 0x1f4

    if-eqz p2, :cond_4

    const-string p2, "bin.mt.remote.RemoteServerService.ACTION_STOPPED"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 833
    invoke-static {}, Ll/᩸۫ܿ;->᩻()V

    .line 834
    new-instance p1, Ll/ۚ۫ܿ;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ll/ۚ۫ܿ;-><init>(I)V

    invoke-static {p1, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    goto :goto_0

    .line 835
    :cond_4
    invoke-static {}, Ll/᩸۫ܿ;->ᩳ()Z

    move-result p2

    if-eqz p2, :cond_5

    const-string p2, "bin.mt.plus.FTP_SERVER_STOPPED"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 836
    invoke-static {}, Ll/᩸۫ܿ;->ܳ()V

    .line 837
    new-instance p1, Ll/ܺ֨ܿ;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ll/ܺ֨ܿ;-><init>(I)V

    invoke-static {p1, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    .line 839
    :cond_5
    :goto_0
    invoke-static {}, Ll/᩸۫ܿ;->ۜ()V

    return-void
.end method
