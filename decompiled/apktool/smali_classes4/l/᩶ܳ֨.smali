.class public final Ll/᩶ܳ֨;
.super Ljava/lang/Object;


# static fields
.field public static volatile ᩻:Ll/᩶ܳ֨;


# instance fields
.field public ֫:Ll/֨ܳ֨;

.field public ۧ:Ll/֨ܳ֨;

.field public ܳ:Landroid/content/BroadcastReceiver;

.field public ܽ:Ll/֨ܳ֨;

.field public ܿ:Ll/ܶܳ֨;

.field public ᩳ:Ll/֨ܳ֨;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Ll/֨ܳ֨;

    const-string v1, "udid"

    .line 10
    invoke-direct {v0, v1}, Ll/֨ܳ֨;-><init>(Ljava/lang/String;)V

    .line 12
    iput-object v0, p0, Ll/᩶ܳ֨;->֫:Ll/֨ܳ֨;

    .line 14
    new-instance v0, Ll/֨ܳ֨;

    const-string v1, "oaid"

    .line 19
    invoke-direct {v0, v1}, Ll/֨ܳ֨;-><init>(Ljava/lang/String;)V

    .line 21
    iput-object v0, p0, Ll/᩶ܳ֨;->ۧ:Ll/֨ܳ֨;

    .line 23
    new-instance v0, Ll/֨ܳ֨;

    const-string v1, "vaid"

    .line 28
    invoke-direct {v0, v1}, Ll/֨ܳ֨;-><init>(Ljava/lang/String;)V

    .line 30
    iput-object v0, p0, Ll/᩶ܳ֨;->ᩳ:Ll/֨ܳ֨;

    .line 32
    new-instance v0, Ll/֨ܳ֨;

    const-string v1, "aaid"

    .line 37
    invoke-direct {v0, v1}, Ll/֨ܳ֨;-><init>(Ljava/lang/String;)V

    .line 39
    iput-object v0, p0, Ll/᩶ܳ֨;->ܽ:Ll/֨ܳ֨;

    .line 41
    new-instance v0, Ll/ܶܳ֨;

    .line 0
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/᩶ܳ֨;->ܿ:Ll/ܶܳ֨;

    return-void
.end method

.method public static final ֫()Ll/᩶ܳ֨;
    .locals 2

    .line 0
    sget-object v0, Ll/᩶ܳ֨;->᩻:Ll/᩶ܳ֨;

    if-nez v0, :cond_1

    const-class v0, Ll/᩶ܳ֨;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ll/᩶ܳ֨;->᩻:Ll/᩶ܳ֨;

    if-nez v1, :cond_0

    new-instance v1, Ll/᩶ܳ֨;

    invoke-direct {v1}, Ll/᩶ܳ֨;-><init>()V

    sput-object v1, Ll/᩶ܳ֨;->᩻:Ll/᩶ܳ֨;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Ll/᩶ܳ֨;->᩻:Ll/᩶ܳ֨;

    return-object v0
.end method

.method public static ֫(Landroid/database/Cursor;)Ll/᩸ܳ֨;
    .locals 5

    new-instance v0, Ll/᩸ܳ֨;

    .line 0
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput-object v1, v0, Ll/᩸ܳ֨;->֫:Ljava/lang/String;

    const/4 v1, 0x0

    iput v1, v0, Ll/᩸ܳ֨;->ۧ:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/32 v3, 0x5265c00

    add-long/2addr v1, v3

    iput-wide v1, v0, Ll/᩸ܳ֨;->ܽ:J

    invoke-interface {p0}, Landroid/database/Cursor;->isClosed()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    const-string v1, "value"

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    if-ltz v1, :cond_1

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ll/᩸ܳ֨;->֫:Ljava/lang/String;

    :cond_1
    const-string v1, "code"

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    if-ltz v1, :cond_2

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    iput v1, v0, Ll/᩸ܳ֨;->ۧ:I

    :cond_2
    const-string v1, "expired"

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    if-ltz v1, :cond_3

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    iput-wide v1, v0, Ll/᩸ܳ֨;->ܽ:J

    :cond_3
    :goto_0
    return-object v0
.end method

.method private declared-synchronized ֫(Landroid/content/Context;)V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 3
    :try_start_0
    iget-object v1, p0, Ll/᩶ܳ֨;->ܳ:Landroid/content/BroadcastReceiver;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 6
    monitor-exit v0

    return-void

    .line 9
    :cond_0
    :try_start_1
    new-instance v1, Landroid/content/IntentFilter;

    .line 12
    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    const-string v2, "com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE"

    .line 17
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 19
    new-instance v2, Ll/᩹ܳ֨;

    .line 0
    invoke-direct {v2}, Landroid/content/BroadcastReceiver;-><init>()V

    iput-object v2, p0, Ll/᩶ܳ֨;->ܳ:Landroid/content/BroadcastReceiver;

    const-string v3, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE"

    const/4 v4, 0x0

    invoke-virtual {p1, v2, v1, v3, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method


# virtual methods
.method public final ֫(Landroid/content/Context;Ll/֨ܳ֨;)Ljava/lang/String;
    .locals 9

    .line 0
    iget-wide v0, p2, Ll/֨ܳ֨;->֫:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    iget-object p1, p2, Ll/֨ܳ֨;->ۧ:Ljava/lang/String;

    return-object p1

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Ll/᩶ܳ֨;->֫(Landroid/content/Context;Z)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return-object v2

    :cond_1
    const-string v1, "content://com.meizu.flyme.openidsdk/"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    iget-object v1, p2, Ll/֨ܳ֨;->ܽ:Ljava/lang/String;

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    :try_start_1
    invoke-static {v1}, Ll/᩶ܳ֨;->֫(Landroid/database/Cursor;)Ll/᩸ܳ֨;

    move-result-object v4

    iget-object v2, v4, Ll/᩸ܳ֨;->֫:Ljava/lang/String;

    iput-object v2, p2, Ll/֨ܳ֨;->ۧ:Ljava/lang/String;

    iget-wide v5, v4, Ll/᩸ܳ֨;->ܽ:J

    iput-wide v5, p2, Ll/֨ܳ֨;->֫:J

    iget p2, v4, Ll/᩸ܳ֨;->ۧ:I

    const/16 v4, 0x3e8

    if-eq p2, v4, :cond_3

    invoke-direct {p0, p1}, Ll/᩶ܳ֨;->֫(Landroid/content/Context;)V

    invoke-virtual {p0, p1, v3}, Ll/᩶ܳ֨;->֫(Landroid/content/Context;Z)Z

    move-result p2

    if-nez p2, :cond_3

    invoke-virtual {p0, p1, v0}, Ll/᩶ܳ֨;->֫(Landroid/content/Context;Z)Z

    move-result p1

    const-string p2, "not support, forceQuery isSupported: "

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1, v3}, Ll/᩶ܳ֨;->֫(Landroid/content/Context;Z)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p0, p1, v0}, Ll/᩶ܳ֨;->֫(Landroid/content/Context;Z)Z

    move-result p1

    const-string p2, "forceQuery isSupported : "

    :goto_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    if-eqz v1, :cond_4

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_4
    return-object v2

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    move-object p2, v2

    move-object v2, v1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception p1

    move-object p2, v2

    :goto_1
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v2, :cond_5

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_5
    return-object p2

    :goto_2
    move-object v1, v2

    :goto_3
    if-eqz v1, :cond_6

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_6
    throw p1
.end method

.method public final ֫(Landroid/content/Context;Z)Z
    .locals 10

    iget-object v0, p0, Ll/᩶ܳ֨;->ܿ:Ll/ܶܳ֨;

    invoke-virtual {v0}, Ll/ܶܳ֨;->֫()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    if-nez p2, :cond_1

    .line 0
    iget-object p1, v0, Ll/ܶܳ֨;->ۧ:Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :cond_0
    return v2

    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    if-nez p2, :cond_2

    goto :goto_2

    :cond_2
    const-string v1, "com.meizu.flyme.openidsdk"

    invoke-virtual {p2, v1, v2}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    move-result-object v1

    const/4 v3, 0x0

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v4, v1, Landroid/content/pm/ProviderInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v4, v4, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v4, v4, 0x1

    if-nez v4, :cond_4

    :goto_0
    move-object v1, v3

    goto :goto_1

    :cond_4
    iget-object v1, v1, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    :goto_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_5

    :goto_2
    return v2

    :cond_5
    :try_start_0
    invoke-virtual {p2, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p2

    if-eqz p2, :cond_6

    iget-object p2, p2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :cond_6
    move-object p2, v3

    :goto_3
    invoke-virtual {v0}, Ll/ܶܳ֨;->֫()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v1, 0x0

    goto :goto_4

    :cond_7
    iget-object v1, v0, Ll/ܶܳ֨;->֫:Ljava/lang/String;

    invoke-static {v1, p2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    :goto_4
    if-eqz v1, :cond_9

    const-string p1, "use same version cache, safeVersion : "

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    iget-object p1, v0, Ll/ܶܳ֨;->ۧ:Ljava/lang/Boolean;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    :cond_8
    return v2

    :cond_9
    iput-object p2, v0, Ll/ܶܳ֨;->֫:Ljava/lang/String;

    const-string p2, "content://com.meizu.flyme.openidsdk/"

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    const-string p1, "supported"

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v4 .. v9}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    if-eqz v3, :cond_b

    invoke-static {v3}, Ll/᩶ܳ֨;->֫(Landroid/database/Cursor;)Ll/᩸ܳ֨;

    move-result-object p1

    iget p2, p1, Ll/᩸ܳ֨;->ۧ:I

    const/16 v1, 0x3e8

    if-ne v1, p2, :cond_a

    const-string p2, "0"

    iget-object p1, p1, Ll/᩸ܳ֨;->֫:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_c

    :cond_a
    const/4 p1, 0x1

    const/4 v2, 0x1

    goto :goto_5

    :cond_b
    if-eqz v3, :cond_d

    goto :goto_5

    :catchall_0
    move-exception p1

    goto :goto_6

    :catch_1
    move-exception p1

    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v3, :cond_d

    :cond_c
    :goto_5
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    :cond_d
    const-string p1, "query support, result : "

    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, v0, Ll/ܶܳ֨;->ۧ:Ljava/lang/Boolean;

    return v2

    :goto_6
    if-eqz v3, :cond_e

    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    :cond_e
    throw p1
.end method
