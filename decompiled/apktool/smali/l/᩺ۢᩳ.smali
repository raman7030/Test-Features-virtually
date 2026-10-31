.class public final Ll/᩺ۢᩳ;
.super Landroid/content/ContentResolver;
.source "B7B6"


# direct methods
.method public static ֫(Ljava/lang/String;)Ljava/lang/SecurityException;
    .locals 2

    .line 131
    new-instance v0, Ljava/lang/SecurityException;

    const-string v1, "Decryptor ContentResolver denied: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final getOutgoingPersistedUriPermissions()Ljava/util/List;
    .locals 1

    .line 85
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method public final getPersistedUriPermissions()Ljava/util/List;
    .locals 1

    .line 80
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method public final getStreamTypes(Landroid/net/Uri;Ljava/lang/String;)[Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/String;

    return-object p1
.end method

.method public final notifyChange(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    .locals 0

    const-string p1, "notifyChange"

    .line 95
    invoke-static {p1}, Ll/᩺ۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final notifyChange(Landroid/net/Uri;Landroid/database/ContentObserver;I)V
    .locals 0

    const-string p1, "notifyChange"

    .line 105
    invoke-static {p1}, Ll/᩺ۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final notifyChange(Landroid/net/Uri;Landroid/database/ContentObserver;Z)V
    .locals 0

    const-string p1, "notifyChange"

    .line 100
    invoke-static {p1}, Ll/᩺ۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final notifyChange(Ljava/util/Collection;Landroid/database/ContentObserver;I)V
    .locals 0

    const-string p1, "notifyChange"

    .line 114
    invoke-static {p1}, Ll/᩺ۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final releasePersistableUriPermission(Landroid/net/Uri;I)V
    .locals 0

    const-string p1, "releasePersistableUriPermission"

    .line 124
    invoke-static {p1}, Ll/᩺ۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method

.method public final takePersistableUriPermission(Landroid/net/Uri;I)V
    .locals 0

    const-string p1, "takePersistableUriPermission"

    .line 119
    invoke-static {p1}, Ll/᩺ۢᩳ;->֫(Ljava/lang/String;)Ljava/lang/SecurityException;

    move-result-object p1

    throw p1
.end method
