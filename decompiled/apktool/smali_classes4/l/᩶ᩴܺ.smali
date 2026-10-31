.class public final Ll/᩶ᩴܺ;
.super Ljava/lang/Object;
.source "194E"


# direct methods
.method public static ֫(Landroid/content/Context;)I
    .locals 8

    .line 48
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v6, 0x2

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v7, 0x0

    :try_start_0
    const-string v1, "content://com.bbk.launcher2.settings/favorites"

    .line 54
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 55
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v7, :cond_1

    if-eqz v7, :cond_8

    .line 78
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    return v6

    .line 60
    :cond_1
    :try_start_1
    invoke-static {p0}, Ll/᩶ᩴܺ;->ۧ(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    .line 61
    :cond_2
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "title"

    .line 62
    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 63
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "shortcutPermission"

    .line 64
    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/16 v2, 0x11

    if-ne v0, v2, :cond_3

    goto :goto_0

    :cond_3
    const/16 v2, 0x10

    if-ne v0, v2, :cond_4

    .line 78
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    const/4 p0, 0x0

    return p0

    :cond_4
    const/16 v2, 0x12

    if-ne v0, v2, :cond_2

    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    return v1

    :cond_5
    :goto_0
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    const/4 p0, -0x1

    return p0

    :cond_6
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    return v6

    :catchall_0
    move-exception p0

    if-eqz v7, :cond_7

    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 80
    :cond_7
    throw p0

    :catch_0
    if-eqz v7, :cond_8

    .line 78
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    :cond_8
    :goto_1
    return v6
.end method

.method public static ۧ(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 146
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 147
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 148
    :cond_0
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {p0, v0}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const-string p0, ""

    return-object p0
.end method
