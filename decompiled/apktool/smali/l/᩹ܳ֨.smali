.class public final Ll/᩹ܳ֨;
.super Landroid/content/BroadcastReceiver;


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    if-eqz p1, :cond_a

    if-nez p2, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v0, "openIdNotifyFlag"

    const/4 v1, 0x0

    .line 12
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const-string v2, "shouldUpdateId, notifyFlag : "

    .line 18
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    const-string v0, "openIdPackage"

    .line 30
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 34
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    .line 38
    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    if-ne v0, v2, :cond_2

    const-string v0, "openIdPackageList"

    .line 51
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 57
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    .line 61
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_1

    :cond_2
    if-nez v0, :cond_3

    :goto_0
    const/4 v1, 0x1

    :cond_3
    :goto_1
    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    const-string p1, "openIdType"

    .line 74
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 78
    invoke-static {}, Ll/᩶ܳ֨;->֫()Ll/᩶ܳ֨;

    move-result-object p2

    const-string v0, "oaid"

    .line 84
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 89
    iget-object p1, p2, Ll/᩶ܳ֨;->ۧ:Ll/֨ܳ֨;

    goto :goto_2

    :cond_5
    const-string v0, "vaid"

    .line 95
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 100
    iget-object p1, p2, Ll/᩶ܳ֨;->ᩳ:Ll/֨ܳ֨;

    goto :goto_2

    :cond_6
    const-string v0, "aaid"

    .line 106
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 111
    iget-object p1, p2, Ll/᩶ܳ֨;->ܽ:Ll/֨ܳ֨;

    goto :goto_2

    :cond_7
    const-string v0, "udid"

    .line 117
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 122
    iget-object p1, p2, Ll/᩶ܳ֨;->֫:Ll/֨ܳ֨;

    goto :goto_2

    :cond_8
    const/4 p1, 0x0

    :goto_2
    if-nez p1, :cond_9

    goto :goto_3

    :cond_9
    const-wide/16 v0, 0x0

    .line 0
    iput-wide v0, p1, Ll/֨ܳ֨;->֫:J

    :cond_a
    :goto_3
    return-void
.end method
