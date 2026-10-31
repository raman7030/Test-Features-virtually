.class public final Ll/ۗ᩶ܽ;
.super Ljava/lang/Object;
.source "E94B"


# static fields
.field public static ֫:Z = true


# direct methods
.method public static ֫(Ll/ۗܺ᩷;)V
    .locals 1

    .line 29
    sget-boolean v0, Ll/ۗ᩶ܽ;->֫:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 30
    sput-boolean v0, Ll/ۗ᩶ܽ;->֫:Z

    .line 31
    invoke-static {p0, v0}, Ll/ۗ᩶ܽ;->֫(Ll/ۗܺ᩷;Z)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Z)V
    .locals 3

    .line 36
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "igiap"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 39
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object v0

    .line 41
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/PackageInfo;

    .line 42
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 v1, v1, 0x81

    if-nez v1, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    if-le v2, v0, :cond_3

    goto :goto_1

    .line 52
    :cond_3
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.android.permission.GET_INSTALLED_APPS"

    invoke-static {v0, v1}, Ll/֨ۙ;->֫(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_5

    if-nez p1, :cond_4

    .line 54
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object p1

    const/16 v0, 0x5c80

    invoke-static {p0, p1, v0}, Ll/ᩴ᩹;->֫(Landroid/app/Activity;[Ljava/lang/String;I)V

    return-void

    .line 56
    :cond_4
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    const v0, 0x7f120a76

    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->ۧ(I)V

    const v0, 0x7f120a77

    .line 57
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->֫(I)V

    new-instance v0, Ll/᩷ܿ᩷;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/᩷ܿ᩷;-><init>(ILjava/lang/Object;)V

    const p0, 0x7f12070a

    .line 58
    invoke-virtual {p1, p0, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12015e

    const/4 v0, 0x0

    .line 59
    invoke-virtual {p1, p0, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance p0, Ll/ۙ᩶ܽ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7f120465

    .line 60
    invoke-virtual {p1, v0, p0}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 61
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    :cond_5
    :goto_1
    return-void
.end method

.method public static ֫()Z
    .locals 1

    .line 25
    sget-boolean v0, Ll/ۗ᩶ܽ;->֫:Z

    return v0
.end method
