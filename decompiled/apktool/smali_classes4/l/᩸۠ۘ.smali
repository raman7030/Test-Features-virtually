.class public final Ll/᩸۠ۘ;
.super Ljava/lang/Object;
.source "51RR"


# static fields
.field public static ܿ:Landroid/content/SharedPreferences;


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/lang/String;

.field public ܽ:J

.field public ᩳ:Ll/᩹᩸ۘ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    .line 35
    iput-wide v0, p0, Ll/᩸۠ۘ;->ܽ:J

    .line 41
    :try_start_0
    new-instance v0, Ll/ܶ۠ۘ;

    invoke-direct {v0, p0}, Ll/ܶ۠ۘ;-><init>(Ll/᩸۠ۘ;)V

    .line 46
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static synthetic ֫(Ll/᩸۠ۘ;)V
    .locals 1

    const-string v0, "create"

    .line 25
    invoke-direct {p0, v0}, Ll/᩸۠ۘ;->ۧ(Ljava/lang/String;)V

    return-void
.end method

.method public static declared-synchronized ֫(Lorg/json/JSONObject;Ll/᩹᩸ۘ;)Z
    .locals 11

    const-string v1, "101492915"

    const-string v2, "saveJsonPreference exception:"

    const-class v0, Ll/᩸۠ۘ;

    monitor-enter v0

    .line 264
    :try_start_0
    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    const-string p0, "openSDK_LOG.QQToken"

    const-string p1, "saveJsonPreference context null"

    .line 265
    invoke-static {p0, p1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 266
    monitor-exit v0

    return v4

    :cond_0
    :try_start_1
    const-string v3, "expires_in"

    .line 276
    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 277
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_3

    .line 278
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v7

    const-wide/16 v9, 0x3e8

    mul-long v7, v7, v9

    add-long/2addr v7, v5

    const-string v3, "expires_time"

    .line 279
    invoke-virtual {p0, v3, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 308
    :try_start_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v1}, Ll/ᩳ᩹ۘ;->ܿ(Ljava/lang/String;)[B

    move-result-object v1

    const/4 v3, 0x2

    invoke-static {v1, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_aes_google"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 294
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll/᩹᩸ۘ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 295
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v2, 0x6

    if-le p1, v2, :cond_2

    if-nez p0, :cond_1

    goto :goto_0

    .line 301
    :cond_1
    invoke-static {}, Ll/᩸۠ۘ;->ᩳ()Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1, v1, p0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    const-string p0, "openSDK_LOG.QQToken"

    const-string p1, "saveJsonPreference sucess"

    .line 302
    invoke-static {p0, p1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 303
    monitor-exit v0

    const/4 p0, 0x1

    return p0

    :cond_2
    :goto_0
    :try_start_3
    const-string p0, "openSDK_LOG.QQToken"

    const-string p1, "saveJsonPreference keyEncode or josnEncode null"

    .line 296
    invoke-static {p0, p1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 297
    monitor-exit v0

    return v4

    :cond_3
    :try_start_4
    const-string p0, "openSDK_LOG.QQToken"

    const-string p1, "expires is null"

    .line 281
    invoke-static {p0, p1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 282
    monitor-exit v0

    return v4

    :catch_0
    move-exception p0

    :try_start_5
    const-string p1, "openSDK_LOG.QQToken"

    .line 285
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 286
    monitor-exit v0

    return v4

    :catchall_0
    move-exception p0

    .line 271
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p0
.end method

.method private declared-synchronized ۧ(Ljava/lang/String;)V
    .locals 4

    const-string v1, "initAESUtils "

    const-string v2, "initAESUtils "

    move-object v0, p0

    monitor-enter v0

    .line 156
    :try_start_0
    iget-object v3, p0, Ll/᩸۠ۘ;->ᩳ:Ll/᩹᩸ۘ;

    if-nez v3, :cond_0

    const-string v3, "openSDK_LOG.QQToken"

    .line 157
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 158
    new-instance v1, Ll/᩹᩸ۘ;

    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v1, v3}, Ll/᩹᩸ۘ;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Ll/᩸۠ۘ;->ᩳ:Ll/᩹᩸ۘ;

    const-string v1, "openSDK_LOG.QQToken"

    .line 159
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " end"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public static ܽ(Ljava/lang/String;)V
    .locals 5

    .line 322
    invoke-static {}, Ll/᩸۠ۘ;->ᩳ()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 318
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Ll/ᩳ᩹ۘ;->ܿ(Ljava/lang/String;)[B

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v2, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_spkey"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 323
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 318
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Ll/ᩳ᩹ۘ;->ܿ(Ljava/lang/String;)[B

    move-result-object v4

    invoke-static {v4, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 324
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 308
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Ll/ᩳ᩹ۘ;->ܿ(Ljava/lang/String;)[B

    move-result-object p0

    invoke-static {p0, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "_aes_google"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 325
    invoke-interface {v0, p0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 326
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    const-string p0, "openSDK_LOG.QQToken"

    const-string v0, "removeSession sucess"

    .line 327
    invoke-static {p0, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static declared-synchronized ᩳ()Landroid/content/SharedPreferences;
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    const-class v0, Ll/᩸۠ۘ;

    monitor-enter v0

    .line 165
    :try_start_0
    sget-object v1, Ll/᩸۠ۘ;->ܿ:Landroid/content/SharedPreferences;

    if-nez v1, :cond_0

    .line 166
    invoke-static {}, Ll/᩺ۤۡ;->֫()Landroid/content/Context;

    move-result-object v1

    const-string v2, "token_info_file"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    sput-object v1, Ll/᩸۠ۘ;->ܿ:Landroid/content/SharedPreferences;

    .line 168
    :cond_0
    sget-object v1, Ll/᩸۠ۘ;->ܿ:Landroid/content/SharedPreferences;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 66
    iget-object v0, p0, Ll/᩸۠ۘ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 83
    iput-object p1, p0, Ll/᩸۠ۘ;->ۧ:Ljava/lang/String;

    .line 84
    invoke-static {}, Ll/ۨܶۘ;->֫()Ll/ۨܶۘ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۨܶۘ;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 71
    iput-object p1, p0, Ll/᩸۠ۘ;->֫:Ljava/lang/String;

    const-wide/16 v0, 0x0

    .line 72
    iput-wide v0, p0, Ll/᩸۠ۘ;->ܽ:J

    if-eqz p2, :cond_0

    .line 74
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p1

    const-wide/16 v2, 0x3e8

    mul-long p1, p1, v2

    add-long/2addr p1, v0

    iput-wide p1, p0, Ll/᩸۠ۘ;->ܽ:J

    :cond_0
    return-void
.end method

.method public final ֫(Lorg/json/JSONObject;)Z
    .locals 2

    :try_start_0
    const-string v0, "saveSession"

    .line 127
    invoke-direct {p0, v0}, Ll/᩸۠ۘ;->ۧ(Ljava/lang/String;)V

    .line 128
    iget-object v0, p0, Ll/᩸۠ۘ;->ᩳ:Ll/᩹᩸ۘ;

    invoke-static {p1, v0}, Ll/᩸۠ۘ;->֫(Lorg/json/JSONObject;Ll/᩹᩸ۘ;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 130
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "login saveSession"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "openSDK_LOG.QQToken"

    invoke-static {v0, p1}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Ll/᩸۠ۘ;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final ܽ()Z
    .locals 5

    .line 54
    iget-object v0, p0, Ll/᩸۠ۘ;->֫:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Ll/᩸۠ۘ;->ܽ:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
