.class public final Ll/ܰ᩸ۘ;
.super Ljava/lang/Object;
.source "51RR"


# static fields
.field public static ۧ:Ll/ܰ᩸ۘ;


# instance fields
.field public volatile ֫:Ljava/lang/ref/WeakReference;


# direct methods
.method public static declared-synchronized ֫()Ll/ܰ᩸ۘ;
    .locals 3

    const-class v0, Ll/ܰ᩸ۘ;

    monitor-enter v0

    .line 81
    :try_start_0
    sget-object v1, Ll/ܰ᩸ۘ;->ۧ:Ll/ܰ᩸ۘ;

    if-nez v1, :cond_0

    .line 82
    new-instance v1, Ll/ܰ᩸ۘ;

    .line 14
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    .line 77
    iput-object v2, v1, Ll/ܰ᩸ۘ;->֫:Ljava/lang/ref/WeakReference;

    .line 82
    sput-object v1, Ll/ܰ᩸ۘ;->ۧ:Ll/ܰ᩸ۘ;

    .line 84
    :cond_0
    sget-object v1, Ll/ܰ᩸ۘ;->ۧ:Ll/ܰ᩸ۘ;
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
.method public final ֫(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const-string v0, "Get host error. url="

    const-string v1, "openSDK_LOG.ServerSetting"

    const-string v2, "host="

    const-string v3, "return environment url : "

    .line 102
    iget-object v4, p0, Ll/ܰ᩸ۘ;->֫:Ljava/lang/ref/WeakReference;

    if-eqz v4, :cond_0

    iget-object v4, p0, Ll/ܰ᩸ۘ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_1

    :cond_0
    const-string v4, "ServerPrefs"

    const/4 v5, 0x0

    .line 103
    invoke-virtual {p1, v4, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    .line 104
    new-instance v4, Ljava/lang/ref/WeakReference;

    invoke-direct {v4, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v4, p0, Ll/ܰ᩸ۘ;->֫:Ljava/lang/ref/WeakReference;

    .line 107
    :cond_1
    :try_start_0
    new-instance p1, Ljava/net/URL;

    invoke-direct {p1, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 108
    invoke-virtual {p1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    .line 110
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-object p2

    .line 113
    :cond_2
    iget-object v0, p0, Ll/ܰ᩸ۘ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/SharedPreferences;

    const/4 v4, 0x0

    invoke-interface {v0, p1, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 114
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_0

    .line 118
    :cond_3
    invoke-virtual {p2, p1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    .line 119
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    return-object p2

    .line 115
    :cond_4
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", envHost="

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    move-exception p1

    const-string v0, "getEnvUrl url="

    const-string v2, "error.: "

    .line 0
    invoke-static {v0, p2, v2}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 123
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    return-object p2
.end method
