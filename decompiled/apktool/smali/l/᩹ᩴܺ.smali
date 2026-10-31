.class public final Ll/᩹ᩴܺ;
.super Ljava/lang/Object;
.source "C942"


# direct methods
.method public static ֫(Landroid/content/Context;Ljava/lang/String;)V
    .locals 5

    .line 17
    invoke-static {}, Ll/ۗᩴܺ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 18
    new-instance v0, Landroid/content/Intent;

    const-string v1, "miui.intent.action.APP_PERM_EDITOR"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.miui.securitycenter"

    .line 19
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "extra_pkgname"

    .line 20
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto/16 :goto_0

    .line 21
    :cond_0
    invoke-static {}, Ll/ۗᩴܺ;->ܿ()Z

    move-result v0

    const/high16 v1, 0x10000

    const-string v2, "packageName"

    if-eqz v0, :cond_2

    .line 22
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 23
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "com.oppo.launcher"

    const-string v3, "com.oppo.launcher.shortcut.ShortcutSettingsActivity"

    .line 25
    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 58
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 59
    invoke-virtual {v2, v0, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    goto/16 :goto_0

    .line 27
    :cond_1
    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "com.color.safecenter"

    const-string v3, "com.color.safecenter.permission.PermissionManagerActivity"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    goto/16 :goto_0

    .line 29
    :cond_2
    invoke-static {}, Ll/ۗᩴܺ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 30
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v2, "packagename"

    .line 31
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 32
    new-instance v2, Landroid/content/ComponentName;

    const-string v3, "com.vivo.permissionmanager"

    const-string v4, "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity"

    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 58
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 59
    invoke-virtual {v2, v0, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_3

    goto :goto_0

    .line 34
    :cond_3
    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "com.iqoo.secure"

    const-string v3, "com.iqoo.secure.safeguard.SoftPermissionDetailActivity"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    goto :goto_0

    .line 36
    :cond_4
    invoke-static {}, Ll/ۗᩴܺ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 37
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 38
    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "com.huawei.systemmanager"

    const-string v3, "com.huawei.permissionmanager.ui.MainActivity"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    goto :goto_0

    .line 39
    :cond_5
    invoke-static {}, Ll/ۗᩴܺ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 40
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_6

    .line 41
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.meizu.safe.security.SHOW_APPSEC"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 42
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 43
    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "com.meizu.safe"

    const-string v3, "com.meizu.safe.security.AppSecActivity"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    goto :goto_0

    :cond_6
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_7

    .line 48
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 54
    :catch_0
    :cond_7
    check-cast p0, Ll/۬ܺ᩷;

    invoke-interface {p0, p1}, Ll/۬ܺ᩷;->֫(Ljava/lang/String;)V

    return-void
.end method
