.class public Ll/ۜۤۧ;
.super Landroid/content/ContentProvider;
.source "EB0J"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    .line 83
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Not allowed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    .line 69
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Not allowed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 0

    .line 75
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Not allowed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final onCreate()Z
    .locals 5

    .line 37
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 43
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 45
    invoke-static {v0}, Ll/᩻ۤۧ;->֫(Landroid/content/Context;)Ll/᩻ۤۧ;

    move-result-object v0

    .line 200
    iget-object v1, v0, Ll/᩻ۤۧ;->֫:Landroid/content/Context;

    :try_start_0
    const-string v2, "Startup"

    .line 49
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 201
    new-instance v2, Landroid/content/ComponentName;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const-class v4, Ll/ۜۤۧ;

    .line 202
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/16 v3, 0x80

    .line 204
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getProviderInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ProviderInfo;

    move-result-object v1

    .line 205
    iget-object v1, v1, Landroid/content/pm/ProviderInfo;->metaData:Landroid/os/Bundle;

    .line 206
    invoke-virtual {v0, v1}, Ll/᩻ۤۧ;->֫(Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 208
    :try_start_1
    new-instance v1, Ll/ۢۤۧ;

    .line 35
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 208
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 60
    :goto_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 211
    throw v0

    :cond_0
    :goto_1
    const/4 v0, 0x1

    return v0

    .line 50
    :cond_1
    new-instance v0, Ll/ۢۤۧ;

    const-string v1, "Context cannot be null"

    .line 31
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 50
    throw v0
.end method

.method public final query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 0

    .line 63
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Not allowed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    .line 92
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Not allowed."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
