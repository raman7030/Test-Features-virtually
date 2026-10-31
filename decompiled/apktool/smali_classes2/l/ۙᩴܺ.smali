.class public final Ll/ۙᩴܺ;
.super Ljava/lang/Object;
.source "G54L"


# direct methods
.method public static ֫(Landroid/content/Context;)V
    .locals 8

    const-string v0, "ro.miui.ui.version.name"

    .line 30
    invoke-static {v0}, Ll/ۗᩴܺ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 33
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 36
    invoke-static {v0}, Ll/ۘ۫ۡ;->֫(Ljava/lang/Throwable;)Ljava/lang/String;

    :cond_0
    const/4 v0, -0x1

    :goto_0
    const/4 v1, 0x5

    const-string v2, "intent is not available!"

    const/high16 v3, 0x10000000

    if-ne v0, v1, :cond_2

    .line 105
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 106
    new-instance v1, Landroid/content/Intent;

    const-string v4, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-direct {v1, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v4, "package"

    const/4 v5, 0x0

    .line 107
    invoke-static {v4, v0, v5}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 108
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 109
    invoke-virtual {v1, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 110
    invoke-static {p0, v1}, Ll/ۙᩴܺ;->֫(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 111
    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto/16 :goto_1

    .line 113
    :cond_1
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    const/4 v1, 0x6

    const-string v4, "com.miui.permcenter.permissions.AppPermissionsEditorActivity"

    const-string v5, "extra_pkgname"

    const-string v6, "com.miui.securitycenter"

    const-string v7, "miui.intent.action.APP_PERM_EDITOR"

    if-ne v0, v1, :cond_4

    .line 139
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 140
    invoke-virtual {v0, v6, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 141
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 142
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 144
    invoke-static {p0, v0}, Ll/ۙᩴܺ;->֫(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 145
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    .line 147
    :cond_3
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    const/4 v1, 0x7

    if-ne v0, v1, :cond_6

    .line 155
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 156
    invoke-virtual {v0, v6, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 157
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 158
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 160
    invoke-static {p0, v0}, Ll/ۙᩴܺ;->֫(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 161
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    .line 163
    :cond_5
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    const/16 v1, 0x8

    if-ne v0, v1, :cond_9

    .line 171
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.miui.permcenter.permissions.PermissionsEditorActivity"

    .line 172
    invoke-virtual {v0, v6, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 174
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 175
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 177
    invoke-static {p0, v0}, Ll/ۙᩴܺ;->֫(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 178
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    .line 180
    :cond_7
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 181
    invoke-virtual {v0, v6}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 182
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 183
    invoke-virtual {v0, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 185
    invoke-static {p0, v0}, Ll/ۙᩴܺ;->֫(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 186
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :goto_1
    return-void

    .line 188
    :cond_8
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 92
    :cond_9
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v1, "Unsupported MIUI version: "

    .line 0
    invoke-static {v0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 92
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 1

    .line 97
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const/high16 v0, 0x10000

    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
