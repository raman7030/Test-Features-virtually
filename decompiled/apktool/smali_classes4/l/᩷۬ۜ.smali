.class public final Ll/᩷۬ۜ;
.super Ljava/lang/Object;
.source "Y74X"


# static fields
.field public static final ֫:Ll/ۨۚۜ;

.field public static final ۧ:Ljava/lang/Object;

.field public static ܽ:Ll/ܺ᩸֫;

.field public static ᩳ:Ll/ۜ۬ۜ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 33
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/᩷۬ۜ;->ۧ:Ljava/lang/Object;

    .line 34
    new-instance v0, Ll/ۨۚۜ;

    invoke-direct {v0}, Ll/ۨۚۜ;-><init>()V

    sput-object v0, Ll/᩷۬ۜ;->֫:Ll/ۨۚۜ;

    .line 36
    sget-object v0, Ll/ۜ۬ۜ;->ۗ:Ll/ۜ۬ۜ;

    sput-object v0, Ll/᩷۬ۜ;->ᩳ:Ll/ۜ۬ۜ;

    return-void
.end method

.method public static bridge synthetic ֫()Ljava/lang/Object;
    .locals 1

    .line 0
    sget-object v0, Ll/᩷۬ۜ;->ۧ:Ljava/lang/Object;

    return-object v0
.end method

.method public static ֫(Landroid/net/Uri;Ll/ܶ۠֫;)Ljava/lang/String;
    .locals 3

    .line 123
    instance-of v0, p1, Ll/ܽۙۜ;

    const-string v1, "http:"

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ll/ܽۙۜ;

    .line 124
    invoke-virtual {p1}, Ll/ܽۙۜ;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 125
    invoke-virtual {p0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p0

    invoke-virtual {p0, v2}, Landroid/net/Uri$Builder;->fragment(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p0

    .line 126
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\n"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ll/ܽۙۜ;->ۧ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 153
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object p1

    .line 154
    invoke-static {p1, p0}, Ll/᩷۬ۜ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 155
    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p0

    .line 126
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 116
    :cond_0
    invoke-virtual {p0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p0

    invoke-virtual {p0, v2}, Landroid/net/Uri$Builder;->fragment(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p0

    .line 117
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    .line 153
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object p1

    .line 154
    invoke-static {p1, p0}, Ll/᩷۬ۜ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 155
    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p0

    .line 117
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ܰܺܳ;Ll/ᩳۜܳ;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 138
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v0

    .line 139
    invoke-virtual {p0, v0}, Ll/ܰܺܳ;->֫(Ljava/security/MessageDigest;)V

    .line 140
    invoke-interface {p1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Ll/᩷۬ۜ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 141
    invoke-interface {p1}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v1

    .line 142
    invoke-interface {p1}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide p0

    .line 143
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Ll/᩷۬ۜ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 144
    invoke-static {p0, p1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Ll/᩷۬ۜ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_0

    cmp-long v1, p0, v3

    if-gtz v1, :cond_1

    .line 146
    :cond_0
    invoke-static {v0, p2}, Ll/᩷۬ۜ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 148
    :cond_1
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p0

    const-string p1, "visitor:"

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/content/Context;)V
    .locals 7

    const/4 v1, 0x0

    .line 58
    :try_start_0
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v2

    const-string v3, "video_media_cache"

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 59
    new-instance v2, Ll/ܺ᩸֫;

    new-instance v3, Ll/᩷᩸֫;

    invoke-direct {v3}, Ll/᩷᩸֫;-><init>()V

    new-instance v4, Ll/᩷۠֫;

    .line 51
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v5, "exoplayer_internal.db"

    const/4 v6, 0x1

    invoke-direct {v4, p0, v5, v1, v6}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    .line 59
    invoke-direct {v2, v0, v3, v4}, Ll/ܺ᩸֫;-><init>(Ljava/io/File;Ll/᩷᩸֫;Ll/᩷۠֫;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 63
    :try_start_1
    sget-object p0, Ll/᩷۬ۜ;->ۧ:Ljava/lang/Object;

    move-object v0, p0

    monitor-enter v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 64
    :try_start_2
    sput-object v2, Ll/᩷۬ۜ;->ܽ:Ll/ܺ᩸֫;

    .line 65
    sget-object v3, Ll/ۜ۬ۜ;->ۙ:Ll/ۜ۬ۜ;

    sput-object v3, Ll/᩷۬ۜ;->ᩳ:Ll/ۜ۬ۜ;

    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 67
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    nop

    goto :goto_0

    :catchall_2
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_0

    .line 70
    invoke-virtual {v2}, Ll/ܺ᩸֫;->ۧ()V

    .line 72
    :cond_0
    sget-object p0, Ll/᩷۬ۜ;->ۧ:Ljava/lang/Object;

    move-object v0, p0

    monitor-enter v0

    .line 73
    :try_start_4
    sput-object v1, Ll/᩷۬ۜ;->ܽ:Ll/ܺ᩸֫;

    .line 74
    sget-object v1, Ll/ۜ۬ۜ;->᩹:Ll/ۜ۬ۜ;

    sput-object v1, Ll/᩷۬ۜ;->ᩳ:Ll/ۜ۬ۜ;

    .line 75
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 76
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 77
    sget-object p0, Ll/᩷۬ۜ;->֫:Ll/ۨۚۜ;

    invoke-virtual {p0}, Ll/ۨۚۜ;->close()V

    return-void

    :catchall_3
    move-exception p0

    .line 76
    :try_start_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    throw p0
.end method

.method public static ֫(Landroid/content/ContextWrapper;)V
    .locals 3

    .line 45
    sget-object v0, Ll/᩷۬ۜ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 46
    :try_start_0
    sget-object v1, Ll/᩷۬ۜ;->ᩳ:Ll/ۜ۬ۜ;

    sget-object v2, Ll/ۜ۬ۜ;->ۗ:Ll/ۜ۬ۜ;

    if-eq v1, v2, :cond_0

    .line 47
    monitor-exit v0

    return-void

    .line 49
    :cond_0
    sget-object v1, Ll/ۜ۬ۜ;->᩶:Ll/ۜ۬ۜ;

    sput-object v1, Ll/᩷۬ۜ;->ᩳ:Ll/ۜ۬ۜ;

    .line 50
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 52
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Ll/ܿ۬ۜ;

    invoke-direct {v1, p0}, Ll/ܿ۬ۜ;-><init>(Landroid/content/Context;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception p0

    .line 50
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ֫(Ljava/security/MessageDigest;Ljava/lang/String;)V
    .locals 1

    .line 159
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/security/MessageDigest;->update([B)V

    const/4 p1, 0x0

    .line 160
    invoke-virtual {p0, p1}, Ljava/security/MessageDigest;->update(B)V

    return-void
.end method

.method public static bridge synthetic ۧ()Ll/ܺ᩸֫;
    .locals 1

    .line 0
    sget-object v0, Ll/᩷۬ۜ;->ܽ:Ll/ܺ᩸֫;

    return-object v0
.end method

.method public static ۧ(Landroid/content/ContextWrapper;)Ll/᩻۬ۜ;
    .locals 4

    .line 88
    sget-object v0, Ll/᩷۬ۜ;->ۧ:Ljava/lang/Object;

    monitor-enter v0

    .line 89
    :try_start_0
    sget-object v1, Ll/᩷۬ۜ;->ᩳ:Ll/ۜ۬ۜ;

    sget-object v2, Ll/ۜ۬ۜ;->ۙ:Ll/ۜ۬ۜ;

    if-ne v1, v2, :cond_0

    sget-object v1, Ll/᩷۬ۜ;->ܽ:Ll/ܺ᩸֫;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 90
    :goto_0
    sget-object v2, Ll/᩷۬ۜ;->ᩳ:Ll/ۜ۬ۜ;

    sget-object v3, Ll/ۜ۬ۜ;->ۗ:Ll/ۜ۬ۜ;

    if-eq v2, v3, :cond_2

    sget-object v2, Ll/᩷۬ۜ;->ᩳ:Ll/ۜ۬ۜ;

    sget-object v3, Ll/ۜ۬ۜ;->᩶:Ll/ۜ۬ۜ;

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v2, 0x1

    .line 91
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    .line 93
    invoke-static {p0}, Ll/᩷۬ۜ;->֫(Landroid/content/ContextWrapper;)V

    .line 95
    :cond_3
    new-instance p0, Ll/᩻۬ۜ;

    .line 96
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v2, v0}, Ll/᩻۬ۜ;-><init>(Ll/ܺ᩸֫;ZLjava/lang/String;)V

    return-object p0

    :catchall_0
    move-exception p0

    .line 91
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static bridge synthetic ܽ()Ll/ۜ۬ۜ;
    .locals 1

    .line 0
    sget-object v0, Ll/᩷۬ۜ;->ᩳ:Ll/ۜ۬ۜ;

    return-object v0
.end method

.method public static ܿ()Ll/ۨۚۜ;
    .locals 1

    .line 110
    sget-object v0, Ll/᩷۬ۜ;->֫:Ll/ۨۚۜ;

    return-object v0
.end method

.method public static ᩳ()V
    .locals 2

    .line 405
    sget-object v1, Ll/᩷۬ۜ;->ۧ:Ljava/lang/Object;

    move-object v0, v1

    monitor-enter v0

    .line 406
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    .line 407
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
