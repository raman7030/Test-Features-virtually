.class public final Ll/ۧ᩹ۡ;
.super Ljava/lang/Object;
.source "X5CP"


# static fields
.field public static ֫:Z = true


# direct methods
.method public static ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 35
    sput-boolean v0, Ll/ۧ᩹ۡ;->֫:Z

    return-void
.end method

.method public static ֫(Lbin/mt/plus/Main;Ll/֫᩹ۡ;)V
    .locals 7

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 39
    invoke-static {p0, v0}, Ll/֨ۙ;->֫(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const v2, 0x7f0a0435

    const/16 v3, 0x8

    if-nez v1, :cond_1

    .line 40
    invoke-interface {p1}, Ll/֫᩹ۡ;->onSuccess()V

    .line 41
    sget-boolean p1, Ll/ۧ᩹ۡ;->֫:Z

    if-nez p1, :cond_0

    .line 42
    invoke-virtual {p0, v2}, Ll/֨ܿ;->findViewById(I)Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void

    .line 44
    :cond_1
    invoke-static {}, Ll/ܺۤۡ;->֫()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 46
    invoke-interface {p1}, Ll/֫᩹ۡ;->֫()V

    return-void

    .line 48
    :cond_2
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v1

    .line 49
    invoke-virtual {p0, v2}, Ll/֨ܿ;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 50
    sget-boolean v4, Ll/ۧ᩹ۡ;->֫:Z

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    .line 51
    sput-boolean v5, Ll/ۧ᩹ۡ;->֫:Z

    const/16 p1, 0x5c7e

    .line 52
    invoke-static {p0, v1, p1}, Ll/ᩴ᩹;->֫(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 53
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 57
    :cond_3
    invoke-static {p0, v0}, Ll/ᩴ᩹;->֫(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v0

    const v4, 0x7f12015e

    const v6, 0x7f12070a

    if-eqz v0, :cond_4

    .line 58
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 59
    new-instance v0, Ll/᩺᩸ۡ;

    invoke-direct {v0, p0, v1, p1, v5}, Ll/᩺᩸ۡ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 66
    sget p1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance p1, Ll/᩵ۚۢ;

    invoke-direct {p1, p0}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    const p0, 0x7f120491

    .line 67
    invoke-virtual {p1, p0}, Ll/᩵ۚۢ;->ۧ(I)V

    const p0, 0x7f12089e

    .line 68
    invoke-virtual {p1, p0}, Ll/᩵ۚۢ;->֫(I)V

    .line 69
    invoke-virtual {p1, v5}, Ll/᩵ۚۢ;->֫(Z)V

    .line 70
    invoke-virtual {p1, v6, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 71
    invoke-virtual {p1, v4, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 72
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 74
    :cond_4
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 75
    sget v0, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v0, Ll/᩵ۚۢ;

    invoke-direct {v0, p0}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    const v1, 0x7f120307

    .line 76
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    const v1, 0x7f12089f

    .line 77
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(I)V

    const/4 v1, 0x0

    .line 78
    invoke-virtual {v0, v6, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v1, Ll/ܰ᩸ۡ;

    invoke-direct {v1, v5, p0, p1}, Ll/ܰ᩸ۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 79
    invoke-virtual {v0, v4, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 86
    invoke-virtual {v0, v5}, Ll/᩵ۚۢ;->֫(Z)V

    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v0

    .line 87
    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v1

    new-instance v2, Ll/۟᩸ۡ;

    invoke-direct {v2, p0, v0, p1}, Ll/۟᩸ۡ;-><init>(Lbin/mt/plus/Main;Ll/֡ۚۢ;Ll/֫᩹ۡ;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static ֫(Landroid/content/Context;)Z
    .locals 2

    .line 113
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    const-string v0, "power"

    .line 114
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    .line 115
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ۧ(Landroid/content/Context;)V
    .locals 3

    .line 131
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-ge v0, v1, :cond_0

    return-void

    .line 134
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 135
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "package:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 139
    instance-of v1, p0, Landroid/app/Activity;

    if-nez v1, :cond_1

    const/high16 v1, 0x10000000

    .line 140
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 143
    :cond_1
    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
