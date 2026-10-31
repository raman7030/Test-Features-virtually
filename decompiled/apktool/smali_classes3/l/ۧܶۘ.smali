.class public final Ll/ۧܶۘ;
.super Ljava/lang/Object;
.source "51RR"


# direct methods
.method public static ֫(Lcom/tencent/connect/common/AssistActivity;)Z
    .locals 6

    const-string v0, "activity exported: "

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 39
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 40
    new-instance v4, Landroid/content/ComponentName;

    const-class v5, Lcom/tencent/connect/common/AssistActivity;

    invoke-direct {v4, p0, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 41
    invoke-virtual {v3, v4, v1}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v3

    .line 42
    iget-boolean v3, v3, Landroid/content/pm/ActivityInfo;->exported:Z

    const-string v4, "openSDK_LOG.Activity"

    .line 43
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v3, 0x1

    :goto_0
    if-nez v3, :cond_0

    return v1

    .line 26
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getCallingActivity()Landroid/content/ComponentName;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    .line 30
    :cond_1
    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    :goto_1
    return v2

    .line 34
    :cond_2
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    xor-int/2addr p0, v2

    return p0
.end method
