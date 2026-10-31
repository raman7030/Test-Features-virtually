.class public Lcom/umeng/commonsdk/utils/c;
.super Ljava/lang/Object;
.source "TAIZ"


# static fields
.field public static final a:Ljava/lang/String; = "um_slmode_sp"

.field public static final b:Ljava/lang/String; = "lastReqTime"

.field public static final c:I = 0x30

.field public static final d:I = 0x1

.field public static final e:I = 0x2d0

.field public static final f:Ljava/lang/String; = "iss"

.field public static final g:Ljava/lang/String; = "sinr"

.field public static final h:Ljava/lang/String; = "clean"

.field public static i:Z = false

.field public static j:I = 0x2d0

.field public static k:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 31
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/utils/c;->k:Ljava/lang/Object;

    .line 34
    invoke-static {}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getAppContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v0, "iss"

    const-string v2, ""

    .line 36
    invoke-static {v1, v0, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 37
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "1"

    .line 38
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 39
    sget-object v0, Lcom/umeng/commonsdk/utils/c;->k:Ljava/lang/Object;

    monitor-enter v0

    const/4 v3, 0x1

    .line 40
    :try_start_0
    sput-boolean v3, Lcom/umeng/commonsdk/utils/c;->i:Z

    .line 41
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const-string v0, "sinr"

    const-string v3, ""

    .line 42
    invoke-static {v1, v0, v3}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 43
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/16 v2, 0x30

    if-nez v1, :cond_0

    .line 45
    :try_start_1
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 46
    invoke-static {v0}, Lcom/umeng/commonsdk/utils/c;->a(I)I

    move-result v0

    sput v0, Lcom/umeng/commonsdk/utils/c;->j:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void

    .line 48
    :catchall_0
    sput v2, Lcom/umeng/commonsdk/utils/c;->j:I

    return-void

    .line 51
    :cond_0
    sput v2, Lcom/umeng/commonsdk/utils/c;->j:I

    return-void

    :catchall_1
    move-exception v1

    .line 41
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1

    :cond_1
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)I
    .locals 1

    const/16 v0, 0x2d0

    if-le p0, v0, :cond_0

    return v0

    :cond_0
    const/4 v0, 0x1

    if-ge p0, v0, :cond_1

    return v0

    :cond_1
    return p0
.end method

.method public static a(Landroid/content/Context;)I
    .locals 1

    .line 76
    sget-object p0, Lcom/umeng/commonsdk/utils/c;->k:Ljava/lang/Object;

    move-object v0, p0

    monitor-enter v0

    .line 77
    :try_start_0
    sget p0, Lcom/umeng/commonsdk/utils/c;->j:I

    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    .line 78
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static a(Landroid/content/Context;J)V
    .locals 2

    .line 109
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "um_slmode_sp"

    const/4 v1, 0x0

    .line 110
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 112
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string v0, "lastReqTime"

    invoke-interface {p0, v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_0
    return-void
.end method

.method public static a()Z
    .locals 2

    .line 60
    sget-object v0, Lcom/umeng/commonsdk/utils/c;->k:Ljava/lang/Object;

    monitor-enter v0

    .line 61
    :try_start_0
    sget-boolean v1, Lcom/umeng/commonsdk/utils/c;->i:Z

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    .line 62
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static a(JJI)Z
    .locals 1

    .line 84
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p2, p3}, Ljava/util/Date;-><init>(J)V

    .line 86
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    .line 87
    new-instance p3, Ljava/util/Date;

    invoke-direct {p3, p0, p1}, Ljava/util/Date;-><init>(J)V

    .line 88
    invoke-virtual {p2, p3}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/16 p0, 0xa

    .line 89
    invoke-virtual {p2, p0, p4}, Ljava/util/Calendar;->add(II)V

    .line 91
    invoke-virtual {p2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p0

    .line 92
    invoke-virtual {v0, p0}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static b(Landroid/content/Context;)J
    .locals 3

    .line 100
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "um_slmode_sp"

    const/4 v1, 0x0

    .line 101
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    const-wide/16 v0, 0x0

    if-eqz p0, :cond_0

    const-string v2, "lastReqTime"

    .line 103
    invoke-interface {p0, v2, v0, v1}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    :cond_0
    return-wide v0
.end method

.method public static c(Landroid/content/Context;)V
    .locals 2

    .line 117
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "um_slmode_sp"

    const/4 v1, 0x0

    .line 118
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 120
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string v0, "clean"

    const/4 v1, 0x1

    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_0
    return-void
.end method

.method public static d(Landroid/content/Context;)V
    .locals 2

    .line 125
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "um_slmode_sp"

    const/4 v1, 0x0

    .line 126
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 128
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    const-string v0, "clean"

    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p0

    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_0
    return-void
.end method

.method public static e(Landroid/content/Context;)Z
    .locals 2

    .line 134
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "um_slmode_sp"

    const/4 v1, 0x0

    .line 135
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v0, "clean"

    .line 137
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    return p0

    :cond_0
    return v1
.end method
