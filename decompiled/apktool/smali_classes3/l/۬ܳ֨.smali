.class public final Ll/۬ܳ֨;
.super Ljava/lang/Object;
.source "OBMG"


# static fields
.field public static volatile ֫:Ll/۬ܳ֨;

.field public static ۜ:Landroid/os/Handler;

.field public static ۢ:Ljava/lang/String;

.field public static volatile ۧ:Ll/᩻۬ۡ;

.field public static ܳ:Ljava/lang/Object;

.field public static ܽ:Landroid/content/Context;

.field public static ܿ:Ll/۫ܳ֨;

.field public static ᩳ:Z

.field public static ᩷:Ljava/lang/String;

.field public static ᩻:Landroid/os/HandlerThread;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 51
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/۬ܳ֨;->ܳ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Landroid/content/Context;)Ll/۬ܳ֨;
    .locals 2

    .line 68
    sget-object v0, Ll/۬ܳ֨;->֫:Ll/۬ܳ֨;

    if-nez v0, :cond_0

    .line 69
    const-class v0, Ll/۬ܳ֨;

    monitor-enter v0

    .line 70
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    sput-object v1, Ll/۬ܳ֨;->ܽ:Landroid/content/Context;

    .line 71
    new-instance v1, Ll/۬ܳ֨;

    invoke-direct {v1}, Ll/۬ܳ֨;-><init>()V

    sput-object v1, Ll/۬ܳ֨;->֫:Ll/۬ܳ֨;

    .line 72
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 75
    :cond_0
    :goto_0
    sget-object v0, Ll/۬ܳ֨;->ۧ:Ll/᩻۬ۡ;

    if-nez v0, :cond_1

    .line 76
    const-class v0, Ll/۬ܳ֨;

    monitor-enter v0

    .line 77
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Ll/۬ܳ֨;->ܽ:Landroid/content/Context;

    .line 87
    new-instance p0, Landroid/os/HandlerThread;

    const-string v1, "SqlWorkThread"

    invoke-direct {p0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    sput-object p0, Ll/۬ܳ֨;->᩻:Landroid/os/HandlerThread;

    .line 88
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 89
    new-instance p0, Ll/ۗܳ֨;

    sget-object v1, Ll/۬ܳ֨;->᩻:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {p0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object p0, Ll/۬ܳ֨;->ۜ:Landroid/os/Handler;

    .line 79
    new-instance p0, Ll/᩻۬ۡ;

    sget-object v1, Ll/۬ܳ֨;->ܽ:Landroid/content/Context;

    invoke-direct {p0, v1}, Ll/᩻۬ۡ;-><init>(Ljava/lang/Object;)V

    sput-object p0, Ll/۬ܳ֨;->ۧ:Ll/᩻۬ۡ;

    .line 80
    invoke-static {}, Ll/۬ܳ֨;->ܽ()V

    .line 81
    monitor-exit v0

    goto :goto_1

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p0

    .line 83
    :cond_1
    :goto_1
    sget-object p0, Ll/۬ܳ֨;->֫:Ll/۬ܳ֨;

    return-object p0
.end method

.method public static ֫(I)V
    .locals 11

    .line 162
    sget-object v1, Ll/۬ܳ֨;->ܳ:Ljava/lang/Object;

    move-object v0, v1

    monitor-enter v0

    .line 208
    :try_start_0
    sget-object v2, Ll/۬ܳ֨;->ۜ:Landroid/os/Handler;

    invoke-virtual {v2}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    const/16 v3, 0xb

    .line 209
    iput v3, v2, Landroid/os/Message;->what:I

    .line 210
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v4, "type"

    .line 211
    invoke-virtual {v3, v4, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eq p0, v6, :cond_0

    if-ne p0, v5, :cond_1

    :cond_0
    const-string v7, "appid"

    .line 213
    invoke-virtual {v3, v7, v4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    :cond_1
    invoke-virtual {v2, v3}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 216
    sget-object v3, Ll/۬ܳ֨;->ۜ:Landroid/os/Handler;

    invoke-virtual {v3, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 164
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v7, 0x7d0

    .line 166
    :try_start_1
    invoke-virtual {v1, v7, v8}, Ljava/lang/Object;->wait(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 170
    :catch_0
    :try_start_2
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v9

    sub-long/2addr v9, v2

    cmp-long v1, v9, v7

    if-gez v1, :cond_6

    if-eqz p0, :cond_5

    if-eq p0, v6, :cond_4

    if-eq p0, v5, :cond_2

    const/4 v1, 0x4

    if-eq p0, v1, :cond_3

    goto :goto_0

    .line 186
    :cond_2
    sget-object p0, Ll/۬ܳ֨;->᩷:Ljava/lang/String;

    if-eqz p0, :cond_3

    .line 188
    sput-object v4, Ll/۬ܳ֨;->᩷:Ljava/lang/String;

    .line 194
    :cond_3
    sput-object v4, Ll/۬ܳ֨;->᩷:Ljava/lang/String;

    goto :goto_0

    .line 178
    :cond_4
    sget-object p0, Ll/۬ܳ֨;->᩷:Ljava/lang/String;

    if-eqz p0, :cond_6

    .line 180
    sput-object v4, Ll/۬ܳ֨;->᩷:Ljava/lang/String;

    goto :goto_0

    .line 174
    :cond_5
    sget-object p0, Ll/۬ܳ֨;->᩷:Ljava/lang/String;

    sput-object p0, Ll/۬ܳ֨;->ۢ:Ljava/lang/String;

    .line 175
    sput-object v4, Ll/۬ܳ֨;->᩷:Ljava/lang/String;

    .line 203
    :cond_6
    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static synthetic ֫(Ljava/lang/String;)V
    .locals 0

    .line 27
    sput-object p0, Ll/۬ܳ֨;->᩷:Ljava/lang/String;

    return-void
.end method

.method public static ֫()Z
    .locals 1

    .line 107
    sget-boolean v0, Ll/۬ܳ֨;->ᩳ:Z

    return v0
.end method

.method public static ۧ()Ljava/lang/String;
    .locals 4

    .line 107
    sget-boolean v0, Ll/۬ܳ֨;->ᩳ:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 114
    :cond_0
    sget-object v0, Ll/۬ܳ֨;->ۢ:Ljava/lang/String;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    const/4 v0, 0x0

    .line 117
    invoke-static {v0}, Ll/۬ܳ֨;->֫(I)V

    .line 118
    sget-object v1, Ll/۬ܳ֨;->ܿ:Ll/۫ܳ֨;

    if-nez v1, :cond_2

    .line 119
    sget-object v1, Ll/۬ܳ֨;->ܽ:Landroid/content/Context;

    .line 240
    new-instance v2, Ll/۫ܳ֨;

    sget-object v3, Ll/۬ܳ֨;->֫:Ll/۬ܳ֨;

    invoke-direct {v2, v3, v0}, Ll/۫ܳ֨;-><init>(Ll/۬ܳ֨;I)V

    sput-object v2, Ll/۬ܳ֨;->ܿ:Ll/۫ܳ֨;

    .line 241
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "content://com.vivo.vms.IdProvider/IdentifierId/OAID"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    sget-object v2, Ll/۬ܳ֨;->ܿ:Ll/۫ܳ֨;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 121
    :cond_2
    sget-object v0, Ll/۬ܳ֨;->ۢ:Ljava/lang/String;

    return-object v0
.end method

.method public static ܽ()V
    .locals 7

    :try_start_0
    const-string v0, "android.os.SystemProperties"

    .line 227
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "get"

    const/4 v2, 0x2

    new-array v3, v2, [Ljava/lang/Class;

    .line 228
    const-class v4, Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v6, 0x1

    aput-object v4, v3, v6

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "persist.sys.identifierid.supported"

    aput-object v3, v2, v5

    const-string v3, "unknown"

    aput-object v3, v2, v6

    .line 229
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catch_0
    :catchall_0
    const-string v0, "0"

    :goto_0
    const-string v1, "1"

    .line 221
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    sput-boolean v0, Ll/۬ܳ֨;->ᩳ:Z

    return-void
.end method

.method public static synthetic ܿ()Ljava/lang/Object;
    .locals 1

    .line 27
    sget-object v0, Ll/۬ܳ֨;->ܳ:Ljava/lang/Object;

    return-object v0
.end method

.method public static synthetic ᩳ()Ll/᩻۬ۡ;
    .locals 1

    .line 27
    sget-object v0, Ll/۬ܳ֨;->ۧ:Ll/᩻۬ۡ;

    return-object v0
.end method
