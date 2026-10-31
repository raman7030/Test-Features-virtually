.class public Lcom/umeng/analytics/pro/o;
.super Ljava/lang/Object;
.source "D45J"


# static fields
.field public static a:Landroid/content/Context; = null

.field public static final l:Ljava/lang/String; = "first_activate_time"

.field public static final m:Ljava/lang/String; = "ana_is_f"

.field public static final n:Ljava/lang/String; = "thtstart"

.field public static final o:Ljava/lang/String; = "dstk_last_time"

.field public static final p:Ljava/lang/String; = "dstk_cnt"

.field public static final q:Ljava/lang/String; = "gkvc"

.field public static final r:Ljava/lang/String; = "ekvc"

.field public static final t:Ljava/lang/String; = "-1"

.field public static final x:Ljava/lang/String; = "com.umeng.umcrash.UMCrashUtils"

.field public static y:Ljava/lang/Class;

.field public static z:Ljava/lang/reflect/Method;


# instance fields
.field public b:Lcom/umeng/analytics/pro/o$c;

.field public c:Landroid/content/SharedPreferences;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:I

.field public g:Lorg/json/JSONArray;

.field public final h:I

.field public i:I

.field public j:I

.field public k:J

.field public final s:J

.field public u:Z

.field public v:Z

.field public w:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 114
    invoke-static {}, Lcom/umeng/analytics/pro/o;->h()V

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 74
    iput-object v0, p0, Lcom/umeng/analytics/pro/o;->b:Lcom/umeng/analytics/pro/o$c;

    .line 76
    iput-object v0, p0, Lcom/umeng/analytics/pro/o;->c:Landroid/content/SharedPreferences;

    .line 77
    iput-object v0, p0, Lcom/umeng/analytics/pro/o;->d:Ljava/lang/String;

    .line 78
    iput-object v0, p0, Lcom/umeng/analytics/pro/o;->e:Ljava/lang/String;

    const/16 v0, 0xa

    .line 83
    iput v0, p0, Lcom/umeng/analytics/pro/o;->f:I

    .line 85
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    iput-object v0, p0, Lcom/umeng/analytics/pro/o;->g:Lorg/json/JSONArray;

    const/16 v0, 0x1388

    .line 86
    iput v0, p0, Lcom/umeng/analytics/pro/o;->h:I

    const/4 v0, 0x0

    .line 87
    iput v0, p0, Lcom/umeng/analytics/pro/o;->i:I

    .line 88
    iput v0, p0, Lcom/umeng/analytics/pro/o;->j:I

    const-wide/16 v1, 0x0

    .line 89
    iput-wide v1, p0, Lcom/umeng/analytics/pro/o;->k:J

    const-wide/32 v3, 0x1b77400

    .line 98
    iput-wide v3, p0, Lcom/umeng/analytics/pro/o;->s:J

    .line 102
    iput-boolean v0, p0, Lcom/umeng/analytics/pro/o;->u:Z

    .line 103
    iput-boolean v0, p0, Lcom/umeng/analytics/pro/o;->v:Z

    .line 107
    new-instance v3, Ljava/lang/Object;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v3, p0, Lcom/umeng/analytics/pro/o;->w:Ljava/lang/Object;

    .line 147
    :try_start_0
    sget-object v3, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v3}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v4, "thtstart"

    .line 148
    invoke-interface {v3, v4, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/umeng/analytics/pro/o;->k:J

    const-string v1, "gkvc"

    .line 149
    invoke-interface {v3, v1, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/umeng/analytics/pro/o;->i:I

    const-string v1, "ekvc"

    .line 150
    invoke-interface {v3, v1, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/umeng/analytics/pro/o;->j:I

    .line 151
    new-instance v0, Lcom/umeng/analytics/pro/o$c;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/o$c;-><init>()V

    iput-object v0, p0, Lcom/umeng/analytics/pro/o;->b:Lcom/umeng/analytics/pro/o$c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public synthetic constructor <init>(Lcom/umeng/analytics/pro/o$1;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/umeng/analytics/pro/o;
    .locals 1

    .line 161
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    if-nez v0, :cond_0

    if-eqz p0, :cond_0

    .line 163
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    .line 166
    :cond_0
    invoke-static {}, Lcom/umeng/analytics/pro/o$b;->a()Lcom/umeng/analytics/pro/o;

    move-result-object p0

    return-object p0
.end method

.method private a(Lorg/json/JSONObject;J)Lorg/json/JSONObject;
    .locals 5

    const-string v0, "header"

    .line 962
    :try_start_0
    invoke-static {p1}, Lcom/umeng/analytics/pro/q;->a(Lorg/json/JSONObject;)J

    move-result-wide v1

    cmp-long v3, v1, p2

    if-lez v3, :cond_0

    .line 963
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "eof"

    .line 965
    invoke-static {p1}, Lcom/umeng/analytics/pro/q;->a(Lorg/json/JSONObject;)J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 966
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 969
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v0, p2, p3, p1}, Lcom/umeng/analytics/pro/q;->a(Landroid/content/Context;JLorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-object p1
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 203
    sget-object v0, Lcom/umeng/analytics/pro/o;->y:Ljava/lang/Class;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/umeng/analytics/pro/o;->z:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_0

    const/4 v2, 0x2

    :try_start_0
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object p2, v2, p1

    .line 205
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    const-string p1, "MobclickRT"

    const-string p2, "--->>> reflect call setPuidAndProvider method of crash lib failed."

    .line 207
    invoke-static {p1, p2}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private a(JI)Z
    .locals 4

    const-wide/16 v0, 0x0

    const/4 v2, 0x1

    cmp-long v3, p1, v0

    if-eqz v3, :cond_2

    .line 1508
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, p1

    const-wide/32 p1, 0x1b77400

    cmp-long v3, v0, p1

    if-lez v3, :cond_0

    .line 1510
    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;->o()V

    return v2

    :cond_0
    const/16 p1, 0x1388

    if-ge p3, p1, :cond_1

    return v2

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    return v2
.end method

.method private a(Lorg/json/JSONArray;)Z
    .locals 7

    .line 625
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    const-string v1, "$$_onUMengEnterBackground"

    const-string v2, "$$_onUMengEnterForegroundInitError"

    const-string v3, "$$_onUMengEnterForeground"

    .line 629
    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    .line 630
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v3, v0, :cond_1

    .line 633
    :try_start_0
    invoke-virtual {p1, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    if-eqz v5, :cond_0

    const-string v6, "id"

    .line 636
    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 637
    invoke-interface {v1, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_0

    add-int/lit8 v4, v4, 0x1

    :catchall_0
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-lt v4, v0, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v2
.end method

.method private a(Lorg/json/JSONObject;)Z
    .locals 7

    const-string v0, "ekv"

    .line 659
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    .line 662
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 668
    :try_start_0
    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    .line 669
    invoke-virtual {v4}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v5

    .line 670
    :cond_0
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    .line 671
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 672
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    if-eqz v6, :cond_0

    .line 674
    invoke-direct {p0, v6}, Lcom/umeng/analytics/pro/o;->a(Lorg/json/JSONArray;)Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v6, :cond_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :catchall_0
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    if-lt v3, v0, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    return v1
.end method

.method private b(Lorg/json/JSONObject;J)Lorg/json/JSONObject;
    .locals 3

    .line 985
    :try_start_0
    invoke-static {p1}, Lcom/umeng/analytics/pro/q;->a(Lorg/json/JSONObject;)J

    move-result-wide v0

    cmp-long v2, v0, p2

    if-lez v2, :cond_0

    const/4 p1, 0x0

    .line 988
    sget-object p2, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object p2

    const/4 p3, 0x1

    const/4 v0, 0x0

    invoke-virtual {p2, p3, v0}, Lcom/umeng/analytics/pro/i;->a(ZZ)V

    .line 989
    sget-object p2, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object p2

    invoke-virtual {p2}, Lcom/umeng/analytics/pro/i;->b()V

    const-string p2, "MobclickRT"

    const-string p3, "--->>> Instant session packet overload !!! "

    .line 990
    invoke-static {p2, p3}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-object p1
.end method

.method private b(Lorg/json/JSONObject;)V
    .locals 4

    .line 830
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getAppContext(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/umeng/analytics/pro/i;->c()Z

    move-result v0

    if-nez v0, :cond_2

    .line 831
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getAppContext(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/umeng/analytics/pro/i;->f()Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "__av"

    .line 833
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "__vc"

    .line 834
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 837
    :try_start_0
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v3, "app_version"

    if-eqz v2, :cond_0

    .line 838
    :try_start_1
    invoke-static {v3}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppVersionName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 840
    :cond_0
    invoke-static {v3}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 843
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v2, "version_code"

    if-eqz v1, :cond_1

    .line 844
    :try_start_2
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppVersionCode(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-void

    .line 846
    :cond_1
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    :cond_2
    return-void
.end method

.method private c(Lorg/json/JSONObject;)V
    .locals 5

    .line 1008
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/umeng/analytics/pro/i;->e()Z

    move-result v0

    const-string v1, "version_code"

    const-string v2, "app_version"

    if-nez v0, :cond_2

    .line 1009
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/umeng/analytics/pro/i;->g()Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v3, "__av"

    .line 1011
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "__vc"

    .line 1012
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1014
    :try_start_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 1015
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v3}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppVersionName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 1017
    :cond_0
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1020
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 1021
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppVersionCode(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 1023
    :cond_1
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 1033
    :cond_2
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppVersionName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1034
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppVersionCode(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_3
    :goto_1
    return-void
.end method

.method private c(Z)Z
    .locals 2

    .line 1615
    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;->s()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 1619
    :cond_0
    invoke-static {}, Lcom/umeng/analytics/AnalyticsConfig;->isRealTimeDebugMode()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    .line 1623
    :cond_1
    iget-object v0, p0, Lcom/umeng/analytics/pro/o;->b:Lcom/umeng/analytics/pro/o$c;

    if-nez v0, :cond_2

    .line 1624
    new-instance v0, Lcom/umeng/analytics/pro/o$c;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/o$c;-><init>()V

    iput-object v0, p0, Lcom/umeng/analytics/pro/o;->b:Lcom/umeng/analytics/pro/o$c;

    .line 1627
    :cond_2
    iget-object v0, p0, Lcom/umeng/analytics/pro/o;->b:Lcom/umeng/analytics/pro/o$c;

    invoke-virtual {v0}, Lcom/umeng/analytics/pro/o$c;->a()V

    .line 1629
    iget-object v0, p0, Lcom/umeng/analytics/pro/o;->b:Lcom/umeng/analytics/pro/o$c;

    invoke-virtual {v0}, Lcom/umeng/analytics/pro/o$c;->c()Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportStrategy;

    move-result-object v0

    .line 1631
    invoke-virtual {v0, p1}, Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportStrategy;->shouldSendMessage(Z)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 1634
    instance-of v1, v0, Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportByInterval;

    if-nez v1, :cond_3

    instance-of v1, v0, Lcom/umeng/commonsdk/statistics/common/ReportPolicy$DebugPolicy;

    if-nez v1, :cond_3

    instance-of v1, v0, Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportQuasiRealtime;

    if-eqz v1, :cond_4

    .line 1638
    :cond_3
    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;->p()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 1639
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/o;->d()V

    .line 1643
    :cond_4
    instance-of v1, v0, Lcom/umeng/commonsdk/statistics/common/ReportPolicy$DefconPolicy;

    if-eqz v1, :cond_5

    .line 1644
    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;->p()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 1645
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/o;->d()V

    .line 1649
    :cond_5
    invoke-static {}, Lcom/umeng/commonsdk/UMConfigure;->isDebugLog()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 1650
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u6570\u636e\u53d1\u9001\u7b56\u7565 : "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;)V

    :cond_6
    return p1
.end method

.method private d(Lorg/json/JSONObject;)V
    .locals 25

    move-object/from16 v0, p1

    const-string v1, "version_code"

    const-string v2, "header"

    const-string v3, "autopages"

    const-string v4, "analytics"

    const-string v5, "channel"

    const-string v6, "appkey"

    const-string v7, "device_model"

    const-string v8, "device_id"

    const-string v9, "sdk_version"

    const-string v10, "dplus"

    const-string v11, "active_user"

    const-string v12, "activate_msg"

    const-string v13, "sessions"

    const-string v14, "error"

    const-string v15, "gkv"

    move-object/from16 v16, v5

    const-string v5, "ekv"

    move-object/from16 v17, v6

    const-string v6, "\u9519\u8bef:"

    move-object/from16 v18, v1

    const-string v1, "[\u57cb\u70b9\u9a8c\u8bc1\u6a21\u5f0f]\u9519\u8bef:"

    move-object/from16 v19, v7

    const-string v7, "\u6e38\u620f\u4e8b\u4ef6:"

    move-object/from16 v20, v8

    const-string v8, "[\u57cb\u70b9\u9a8c\u8bc1\u6a21\u5f0f]\u6e38\u620f\u4e8b\u4ef6:"

    move-object/from16 v21, v9

    const-string v9, "\u4e8b\u4ef6:"

    move-object/from16 v22, v2

    const-string v2, "[\u57cb\u70b9\u9a8c\u8bc1\u6a21\u5f0f]\u4e8b\u4ef6:"

    if-nez v0, :cond_0

    goto :goto_0

    .line 1916
    :cond_0
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lorg/json/JSONObject;->length()I

    move-result v23

    if-gtz v23, :cond_1

    :goto_0
    return-void

    :cond_1
    move-object/from16 v23, v10

    .line 1917
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    move-object/from16 v24, v11

    .line 1919
    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_f

    .line 1920
    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 1921
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_3

    .line 1922
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v11

    .line 1923
    invoke-virtual {v10, v5, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1924
    invoke-virtual {v10}, Lorg/json/JSONObject;->length()I

    move-result v5

    if-lez v5, :cond_3

    .line 1925
    invoke-static {}, Lcom/umeng/analytics/AnalyticsConfig;->isRealTimeDebugMode()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 1926
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;)V

    goto :goto_1

    .line 1928
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;)V

    .line 1931
    :goto_1
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 1934
    :cond_3
    invoke-virtual {v4, v15}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 1935
    invoke-virtual {v4, v15}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 1936
    invoke-virtual {v10, v15, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1937
    invoke-virtual {v10}, Lorg/json/JSONObject;->length()I

    move-result v2

    if-lez v2, :cond_5

    .line 1938
    invoke-static {}, Lcom/umeng/analytics/AnalyticsConfig;->isRealTimeDebugMode()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 1940
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;)V

    goto :goto_2

    .line 1942
    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;)V

    .line 1944
    :goto_2
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 1947
    :cond_5
    invoke-virtual {v4, v14}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 1948
    invoke-virtual {v4, v14}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 1949
    invoke-virtual {v10, v14, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1950
    invoke-virtual {v10}, Lorg/json/JSONObject;->length()I

    move-result v2

    if-lez v2, :cond_7

    .line 1951
    invoke-static {}, Lcom/umeng/analytics/AnalyticsConfig;->isRealTimeDebugMode()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 1952
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;)V

    goto :goto_3

    .line 1954
    :cond_6
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;)V

    .line 1956
    :goto_3
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 1959
    :cond_7
    invoke-virtual {v4, v13}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 1960
    invoke-virtual {v4, v13}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 1962
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    const/4 v5, 0x0

    .line 1964
    :goto_4
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v5, v6, :cond_a

    .line 1965
    invoke-virtual {v1, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    if-eqz v6, :cond_9

    .line 1966
    invoke-virtual {v6}, Lorg/json/JSONObject;->length()I

    move-result v7

    if-lez v7, :cond_9

    .line 1967
    invoke-virtual {v6, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_8

    .line 1968
    invoke-virtual {v6, v3}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 1970
    :cond_8
    invoke-virtual {v2, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    :cond_9
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 1973
    :cond_a
    invoke-virtual {v10, v13, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1974
    invoke-virtual {v10}, Lorg/json/JSONObject;->length()I

    move-result v1

    if-lez v1, :cond_c

    .line 1975
    invoke-static {}, Lcom/umeng/analytics/AnalyticsConfig;->isRealTimeDebugMode()Z

    move-result v1

    if-eqz v1, :cond_b

    .line 1976
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[\u57cb\u70b9\u9a8c\u8bc1\u6a21\u5f0f]\u4f1a\u8bdd:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;)V

    goto :goto_5

    .line 1978
    :cond_b
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u4f1a\u8bdd:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;)V

    .line 1980
    :goto_5
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    move-object v10, v1

    .line 1983
    :cond_c
    invoke-virtual {v4, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    .line 1984
    invoke-virtual {v4, v12}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 1985
    invoke-virtual {v10, v12, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_d
    move-object/from16 v1, v24

    .line 1987
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_f

    .line 1988
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 1989
    invoke-virtual {v10, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1990
    invoke-virtual {v10}, Lorg/json/JSONObject;->length()I

    move-result v1

    if-lez v1, :cond_f

    .line 1991
    invoke-static {}, Lcom/umeng/analytics/AnalyticsConfig;->isRealTimeDebugMode()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 1992
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[\u57cb\u70b9\u9a8c\u8bc1\u6a21\u5f0f]\u8d26\u53f7:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;)V

    goto :goto_6

    .line 1994
    :cond_e
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u8d26\u53f7:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;)V

    .line 1996
    :goto_6
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    :cond_f
    move-object/from16 v1, v23

    .line 2001
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_10

    .line 2002
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 2003
    invoke-virtual {v10, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2006
    :cond_10
    invoke-static/range {v22 .. v22}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_17

    .line 2007
    invoke-static/range {v22 .. v22}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_17

    .line 2008
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v1

    if-lez v1, :cond_17

    .line 2009
    invoke-static/range {v21 .. v21}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_11

    .line 2010
    invoke-static/range {v21 .. v21}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v21

    invoke-virtual {v10, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2012
    :cond_11
    invoke-static/range {v20 .. v20}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_12

    .line 2013
    invoke-static/range {v20 .. v20}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v20

    invoke-virtual {v10, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2015
    :cond_12
    invoke-static/range {v19 .. v19}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_13

    .line 2016
    invoke-static/range {v19 .. v19}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-virtual {v10, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2018
    :cond_13
    invoke-static/range {v18 .. v18}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_14

    const-string v1, "version"

    .line 2019
    invoke-static/range {v18 .. v18}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v10, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 2021
    :cond_14
    invoke-static/range {v17 .. v17}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_15

    .line 2022
    invoke-static/range {v17 .. v17}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, v17

    invoke-virtual {v10, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2024
    :cond_15
    invoke-static/range {v16 .. v16}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_16

    .line 2025
    invoke-static/range {v16 .. v16}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v10, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2027
    :cond_16
    invoke-virtual {v10}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_17

    .line 2028
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u57fa\u7840\u4fe1\u606f:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;)V

    .line 2029
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 2034
    :cond_17
    invoke-virtual {v10}, Lorg/json/JSONObject;->length()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 2039
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/MLog;->e(Ljava/lang/Throwable;)V

    return-void
.end method

.method private d(Z)Z
    .locals 2

    .line 2374
    iget-object v0, p0, Lcom/umeng/analytics/pro/o;->b:Lcom/umeng/analytics/pro/o$c;

    if-nez v0, :cond_0

    .line 2375
    new-instance v0, Lcom/umeng/analytics/pro/o$c;

    invoke-direct {v0}, Lcom/umeng/analytics/pro/o$c;-><init>()V

    iput-object v0, p0, Lcom/umeng/analytics/pro/o;->b:Lcom/umeng/analytics/pro/o$c;

    .line 2378
    :cond_0
    iget-object v0, p0, Lcom/umeng/analytics/pro/o;->b:Lcom/umeng/analytics/pro/o$c;

    invoke-virtual {v0}, Lcom/umeng/analytics/pro/o$c;->c()Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportStrategy;

    move-result-object v0

    .line 2379
    instance-of v1, v0, Lcom/umeng/commonsdk/statistics/common/ReportPolicy$DefconPolicy;

    if-eqz v1, :cond_2

    if-eqz p1, :cond_1

    .line 2381
    check-cast v0, Lcom/umeng/commonsdk/statistics/common/ReportPolicy$DefconPolicy;

    invoke-virtual {v0}, Lcom/umeng/commonsdk/statistics/common/ReportPolicy$DefconPolicy;->shouldSendMessageByInstant()Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    .line 2383
    invoke-virtual {v0, p1}, Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportStrategy;->shouldSendMessage(Z)Z

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method private e(Ljava/lang/Object;)V
    .locals 5

    const-string v0, "__t"

    .line 1452
    :try_start_0
    check-cast p1, Lorg/json/JSONObject;

    .line 1453
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x802

    if-ne v2, v1, :cond_1

    .line 1454
    iget-wide v0, p0, Lcom/umeng/analytics/pro/o;->k:J

    iget v2, p0, Lcom/umeng/analytics/pro/o;->i:I

    invoke-direct {p0, v0, v1, v2}, Lcom/umeng/analytics/pro/o;->a(JI)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 1457
    :cond_0
    iget v0, p0, Lcom/umeng/analytics/pro/o;->i:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/umeng/analytics/pro/o;->i:I

    goto :goto_1

    .line 1458
    :cond_1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x801

    if-ne v1, v0, :cond_3

    .line 1459
    iget-wide v0, p0, Lcom/umeng/analytics/pro/o;->k:J

    iget v2, p0, Lcom/umeng/analytics/pro/o;->j:I

    invoke-direct {p0, v0, v1, v2}, Lcom/umeng/analytics/pro/o;->a(JI)Z

    move-result v0

    if-nez v0, :cond_2

    :goto_0
    return-void

    .line 1462
    :cond_2
    iget v0, p0, Lcom/umeng/analytics/pro/o;->j:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/umeng/analytics/pro/o;->j:I

    .line 1464
    :cond_3
    :goto_1
    invoke-static {}, Lcom/umeng/analytics/AnalyticsConfig;->isRealTimeDebugMode()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1465
    iget-object v0, p0, Lcom/umeng/analytics/pro/o;->g:Lorg/json/JSONArray;

    if-nez v0, :cond_4

    .line 1466
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    iput-object v0, p0, Lcom/umeng/analytics/pro/o;->g:Lorg/json/JSONArray;

    .line 1468
    :cond_4
    iget-object v0, p0, Lcom/umeng/analytics/pro/o;->g:Lorg/json/JSONArray;

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1469
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object p1

    iget-object v0, p0, Lcom/umeng/analytics/pro/o;->g:Lorg/json/JSONArray;

    invoke-virtual {p1, v0}, Lcom/umeng/analytics/pro/i;->a(Lorg/json/JSONArray;)V

    .line 1470
    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    iput-object p1, p0, Lcom/umeng/analytics/pro/o;->g:Lorg/json/JSONArray;

    return-void

    .line 1472
    :cond_5
    iget-object v0, p0, Lcom/umeng/analytics/pro/o;->g:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    iget v1, p0, Lcom/umeng/analytics/pro/o;->f:I

    if-lt v0, v1, :cond_6

    const-string v0, "MobclickRT"

    const-string v1, "--->>>*** \u8d85\u8fc710\u4e2a\u4e8b\u4ef6\uff0c\u4e8b\u4ef6\u843d\u5e93\u3002"

    .line 1473
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 1474
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object v0

    iget-object v1, p0, Lcom/umeng/analytics/pro/o;->g:Lorg/json/JSONArray;

    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/i;->a(Lorg/json/JSONArray;)V

    .line 1475
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    iput-object v0, p0, Lcom/umeng/analytics/pro/o;->g:Lorg/json/JSONArray;

    .line 1477
    :cond_6
    iget-wide v0, p0, Lcom/umeng/analytics/pro/o;->k:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_7

    .line 1478
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/umeng/analytics/pro/o;->k:J

    .line 1480
    :cond_7
    iget-object v0, p0, Lcom/umeng/analytics/pro/o;->g:Lorg/json/JSONArray;

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 1484
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/MLog;->e(Ljava/lang/Throwable;)V

    return-void
.end method

.method private e(Lorg/json/JSONObject;)V
    .locals 17

    move-object/from16 v0, p1

    const-string v1, "version_code"

    const-string v2, "analytics"

    const-string v3, "channel"

    const-string v4, "appkey"

    const-string v5, "device_model"

    const-string v6, "device_id"

    const-string v7, "sdk_version"

    const-string v8, "header"

    const-string v9, "active_user"

    const-string v10, "sessions"

    if-nez v0, :cond_0

    goto :goto_0

    .line 2047
    :cond_0
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lorg/json/JSONObject;->length()I

    move-result v11

    if-gtz v11, :cond_1

    :goto_0
    return-void

    .line 2048
    :cond_1
    new-instance v11, Lorg/json/JSONObject;

    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 2050
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_5

    .line 2051
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 2053
    invoke-virtual {v2, v10}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_4

    .line 2054
    invoke-virtual {v2, v10}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v12

    .line 2056
    new-instance v13, Lorg/json/JSONArray;

    invoke-direct {v13}, Lorg/json/JSONArray;-><init>()V

    const/4 v14, 0x0

    .line 2058
    :goto_1
    invoke-virtual {v12}, Lorg/json/JSONArray;->length()I

    move-result v15

    if-ge v14, v15, :cond_3

    .line 2059
    invoke-virtual {v12, v14}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v15

    if-eqz v15, :cond_2

    .line 2060
    invoke-virtual {v15}, Lorg/json/JSONObject;->length()I

    move-result v16

    if-lez v16, :cond_2

    .line 2061
    invoke-virtual {v13, v15}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    :cond_2
    add-int/lit8 v14, v14, 0x1

    goto :goto_1

    .line 2064
    :cond_3
    invoke-virtual {v11, v10, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2065
    invoke-virtual {v11}, Lorg/json/JSONObject;->length()I

    move-result v10

    if-lez v10, :cond_4

    .line 2066
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "\u672c\u6b21\u542f\u52a8\u4f1a\u8bdd:"

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;)V

    .line 2067
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    move-object v11, v10

    .line 2071
    :cond_4
    invoke-virtual {v2, v9}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_5

    .line 2072
    invoke-virtual {v2, v9}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 2073
    invoke-virtual {v11, v9, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2074
    invoke-virtual {v11}, Lorg/json/JSONObject;->length()I

    move-result v2

    if-lez v2, :cond_5

    .line 2075
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "\u672c\u6b21\u542f\u52a8\u8d26\u53f7:"

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;)V

    .line 2076
    new-instance v11, Lorg/json/JSONObject;

    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 2082
    :cond_5
    invoke-static {v8}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 2083
    invoke-static {v8}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_c

    .line 2084
    invoke-static {v8}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 2085
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v2

    if-lez v2, :cond_c

    .line 2086
    invoke-static {v7}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 2087
    invoke-static {v7}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v7, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2089
    :cond_6
    invoke-static {v6}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    .line 2090
    invoke-static {v6}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v6, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2092
    :cond_7
    invoke-static {v5}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 2093
    invoke-static {v5}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v11, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2095
    :cond_8
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    const-string v2, "version"

    .line 2096
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v11, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 2098
    :cond_9
    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 2099
    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2101
    :cond_a
    invoke-static {v3}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 2102
    invoke-static {v3}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2105
    :cond_b
    invoke-virtual {v11}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_c

    .line 2106
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u672c\u6b21\u542f\u52a8\u57fa\u7840\u4fe1\u606f:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/MLog;->d(Ljava/lang/String;)V

    .line 2107
    new-instance v11, Lorg/json/JSONObject;

    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 2112
    :cond_c
    invoke-virtual {v11}, Lorg/json/JSONObject;->length()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 2117
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/MLog;->e(Ljava/lang/Throwable;)V

    return-void
.end method

.method private f(Ljava/lang/Object;)V
    .locals 7

    const-string v0, "--->>> onProfileSignIn: force generate new session: session id = "

    .line 2516
    :try_start_0
    check-cast p1, Lorg/json/JSONObject;

    if-eqz p1, :cond_1

    .line 2517
    invoke-virtual {p1}, Lorg/json/JSONObject;->length()I

    move-result v1

    if-gtz v1, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string v1, "ts"

    .line 2518
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    .line 2520
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/o;->b(Landroid/content/Context;)V

    .line 2521
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/o;->d()V

    .line 2524
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/analytics/c;->a(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 v3, 0x0

    .line 2525
    aget-object v4, p1, v3

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    const/4 v4, 0x1

    aget-object p1, p1, v4

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 2527
    invoke-static {}, Lcom/umeng/analytics/pro/u;->a()Lcom/umeng/analytics/pro/u;

    move-result-object p1

    sget-object v5, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {p1, v5, v1, v2}, Lcom/umeng/analytics/pro/u;->a(Landroid/content/Context;J)V

    .line 2529
    invoke-static {}, Lcom/umeng/analytics/pro/y;->a()Lcom/umeng/analytics/pro/y;

    move-result-object p1

    sget-object v5, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {p1, v5}, Lcom/umeng/analytics/pro/y;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    const-string v5, "MobclickRT"

    .line 2530
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v5, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 2532
    invoke-static {}, Lcom/umeng/analytics/pro/u;->a()Lcom/umeng/analytics/pro/u;

    move-result-object p1

    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/umeng/analytics/pro/u;->b(Landroid/content/Context;JZ)Z

    move-result p1

    .line 2533
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/analytics/c;->b(Landroid/content/Context;)V

    .line 2535
    invoke-static {}, Lcom/umeng/analytics/pro/u;->a()Lcom/umeng/analytics/pro/u;

    move-result-object v0

    sget-object v3, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {v0, v3, v1, v2, v4}, Lcom/umeng/analytics/pro/u;->a(Landroid/content/Context;JZ)Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 2538
    invoke-static {}, Lcom/umeng/analytics/pro/u;->a()Lcom/umeng/analytics/pro/u;

    move-result-object p1

    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {p1, v0, v1, v2}, Lcom/umeng/analytics/pro/u;->b(Landroid/content/Context;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 2542
    sget-boolean v0, Lcom/umeng/commonsdk/statistics/common/MLog;->DEBUG:Z

    if-eqz v0, :cond_1

    const-string v0, " Excepthon  in  onProfileSignOff"

    .line 2543
    invoke-static {v0, p1}, Lcom/umeng/commonsdk/statistics/common/MLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private f(Lorg/json/JSONObject;)V
    .locals 5

    :try_start_0
    const-string v0, "header"

    .line 2199
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "eof"

    .line 2200
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x0

    const-string v2, "sessions"

    const-string v3, "analytics"

    const-string v4, "content"

    if-eqz v0, :cond_2

    .line 2202
    :try_start_1
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2203
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 2207
    :cond_0
    invoke-static {v3}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string v4, "MobclickRT"

    if-eqz v0, :cond_1

    .line 2212
    :try_start_2
    invoke-static {v3}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 2214
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2215
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    .line 2216
    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, "id"

    .line 2218
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2219
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "--->>> removeAllInstantData: really delete instant session data"

    .line 2223
    invoke-static {v4, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 2224
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/umeng/analytics/pro/i;->b(Ljava/lang/String;)V

    .line 2229
    :cond_1
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/i;->b()V

    const-string p1, "--->>> removeAllInstantData: send INSTANT_SESSION_START_CONTINUE event because OVERSIZE."

    .line 2232
    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 2233
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    .line 2234
    invoke-static {p1}, Lcom/umeng/analytics/CoreProtocol;->getInstance(Landroid/content/Context;)Lcom/umeng/analytics/CoreProtocol;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x1101

    .line 2233
    invoke-static {p1, v2, v0, v1}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    return-void

    .line 2238
    :cond_2
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2239
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 2242
    :cond_3
    invoke-static {v3}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2243
    invoke-static {v3}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 2244
    invoke-virtual {p1}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_4

    .line 2246
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 2247
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/umeng/analytics/pro/i;->a(ZZ)V

    .line 2252
    :cond_4
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/i;->b()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    return-void
.end method

.method public static synthetic g()Landroid/content/Context;
    .locals 1

    .line 69
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    return-object v0
.end method

.method private g(Ljava/lang/Object;)V
    .locals 9

    const-string v0, "--->>> onProfileSignIn: force generate new session: session id = "

    .line 2551
    :try_start_0
    sget-object v1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {p0, v1}, Lcom/umeng/analytics/pro/o;->b(Landroid/content/Context;)V

    .line 2552
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/o;->d()V

    .line 2554
    check-cast p1, Lorg/json/JSONObject;

    if-eqz p1, :cond_2

    .line 2555
    invoke-virtual {p1}, Lorg/json/JSONObject;->length()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "provider"

    .line 2556
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "uid"

    .line 2557
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "ts"

    .line 2558
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v3

    .line 2560
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/analytics/c;->a(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object p1

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz p1, :cond_1

    .line 2561
    aget-object v7, p1, v6

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    aget-object p1, p1, v5

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 2563
    :cond_1
    invoke-static {}, Lcom/umeng/analytics/pro/u;->a()Lcom/umeng/analytics/pro/u;

    move-result-object p1

    sget-object v7, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {p1, v7, v3, v4}, Lcom/umeng/analytics/pro/u;->a(Landroid/content/Context;J)V

    .line 2565
    invoke-static {}, Lcom/umeng/analytics/pro/y;->a()Lcom/umeng/analytics/pro/y;

    move-result-object p1

    sget-object v7, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {p1, v7}, Lcom/umeng/analytics/pro/y;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 2567
    invoke-static {}, Lcom/umeng/analytics/pro/u;->a()Lcom/umeng/analytics/pro/u;

    move-result-object v7

    sget-object v8, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {v7, v8, v3, v4, v6}, Lcom/umeng/analytics/pro/u;->b(Landroid/content/Context;JZ)Z

    move-result v6

    .line 2569
    sget-object v7, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v7, v1, v2}, Lcom/umeng/analytics/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "MobclickRT"

    .line 2572
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 2574
    invoke-static {}, Lcom/umeng/analytics/pro/u;->a()Lcom/umeng/analytics/pro/u;

    move-result-object p1

    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {p1, v0, v3, v4, v5}, Lcom/umeng/analytics/pro/u;->a(Landroid/content/Context;JZ)Ljava/lang/String;

    if-eqz v6, :cond_2

    .line 2576
    invoke-static {}, Lcom/umeng/analytics/pro/u;->a()Lcom/umeng/analytics/pro/u;

    move-result-object p1

    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {p1, v0, v3, v4}, Lcom/umeng/analytics/pro/u;->b(Landroid/content/Context;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method

.method private g(Lorg/json/JSONObject;)V
    .locals 6

    :try_start_0
    const-string v0, "header"

    .line 2267
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "eof"

    .line 2268
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v3, "sessions"

    const-string v4, "analytics"

    const-string v5, "content"

    if-eqz v0, :cond_2

    .line 2270
    :try_start_1
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2271
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 2275
    :cond_0
    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 2280
    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 2282
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2284
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/i;->i()V

    .line 2285
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/i;->h()V

    .line 2286
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object p1

    invoke-virtual {p1, v2, v1}, Lcom/umeng/analytics/pro/i;->b(ZZ)V

    .line 2287
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/i;->a()V

    return-void

    :cond_1
    const-string p1, "MobclickRT"

    const-string v0, "--->>> Error, Should not go to this branch."

    .line 2290
    invoke-static {p1, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 2295
    :cond_2
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2296
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 2299
    :cond_3
    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 2300
    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 2301
    invoke-virtual {p1}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_7

    .line 2303
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2304
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object v0

    invoke-virtual {v0, v2, v1}, Lcom/umeng/analytics/pro/i;->b(ZZ)V

    :cond_4
    const-string v0, "ekv"

    .line 2306
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "gkv"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2307
    :cond_5
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/umeng/analytics/pro/i;->h()V

    :cond_6
    const-string v0, "error"

    .line 2310
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 2311
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/i;->i()V

    .line 2316
    :cond_7
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/i;->a()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_8
    return-void
.end method

.method public static h()V
    .locals 5

    :try_start_0
    const-string v0, "com.umeng.umcrash.UMCrashUtils"

    .line 119
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 121
    sput-object v0, Lcom/umeng/analytics/pro/o;->y:Ljava/lang/Class;

    const-string v1, "setPuidAndProvider"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Class;

    .line 122
    const-class v3, Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 124
    sput-object v0, Lcom/umeng/analytics/pro/o;->z:Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method private h(Ljava/lang/Object;)V
    .locals 3

    const-string v0, "__ii"

    .line 2587
    :try_start_0
    move-object v1, p1

    check-cast v1, Lorg/json/JSONObject;

    if-eqz v1, :cond_0

    .line 2588
    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    move-result v2

    if-lez v2, :cond_0

    .line 2589
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2590
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 2591
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 2592
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2593
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x2

    invoke-virtual {v0, v2, p1, v1}, Lcom/umeng/analytics/pro/i;->a(Ljava/lang/String;Ljava/lang/String;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method private i()V
    .locals 6

    const-string v0, "exception"

    const-string v1, "Build envelope error code: "

    .line 547
    sget-object v2, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->maxDataSpace(Landroid/content/Context;)J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lcom/umeng/analytics/pro/o;->b(J)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 549
    invoke-virtual {v2}, Lorg/json/JSONObject;->length()I

    move-result v3

    const/4 v4, 0x1

    if-ge v3, v4, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "header"

    .line 551
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/json/JSONObject;

    const-string v4, "content"

    .line 552
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/json/JSONObject;

    .line 554
    sget-object v4, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    if-eqz v4, :cond_3

    if-eqz v3, :cond_3

    if-eqz v2, :cond_3

    const-string v4, "--->>> constructInstantMessage: request build envelope."

    const-string v5, "MobclickRT"

    .line 556
    invoke-static {v5, v4}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 557
    sget-object v4, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v4, v3, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->buildEnvelopeWithExtHeader(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 562
    :try_start_0
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 564
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    .line 569
    :cond_1
    :goto_0
    invoke-static {}, Lcom/umeng/commonsdk/UMConfigure;->isDebugLog()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 570
    invoke-direct {p0, v2}, Lcom/umeng/analytics/pro/o;->e(Lorg/json/JSONObject;)V

    .line 573
    :cond_2
    invoke-virtual {p0, v2}, Lcom/umeng/analytics/pro/o;->b(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    return-void
.end method

.method private j()V
    .locals 5

    const-string v0, "exception"

    const-string v1, "Build envelope error code: "

    .line 587
    sget-object v2, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->maxDataSpace(Landroid/content/Context;)J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lcom/umeng/analytics/pro/o;->a(J)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 589
    invoke-virtual {v2}, Lorg/json/JSONObject;->length()I

    move-result v3

    const/4 v4, 0x1

    if-ge v3, v4, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "header"

    .line 590
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lorg/json/JSONObject;

    const-string v4, "content"

    .line 591
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/json/JSONObject;

    .line 592
    sget-object v4, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    if-eqz v4, :cond_3

    if-eqz v3, :cond_3

    if-eqz v2, :cond_3

    .line 596
    invoke-static {v4, v3, v2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->buildEnvelopeWithExtHeader(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 601
    :try_start_0
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "MobclickRT"

    .line 602
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    .line 607
    :cond_1
    :goto_0
    invoke-static {}, Lcom/umeng/commonsdk/UMConfigure;->isDebugLog()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 608
    invoke-direct {p0, v2}, Lcom/umeng/analytics/pro/o;->d(Lorg/json/JSONObject;)V

    .line 612
    :cond_2
    invoke-virtual {p0, v2}, Lcom/umeng/analytics/pro/o;->a(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    return-void
.end method

.method private k()Lorg/json/JSONObject;
    .locals 3

    .line 997
    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;->l()Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    const-string v1, "st"

    const-string v2, "1"

    .line 1000
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-object v0
.end method

.method private l()Lorg/json/JSONObject;
    .locals 11

    const-string v0, "vers_name"

    const-string v1, "$ud_da"

    const-string v2, "$pr_ve"

    const-string v3, ""

    .line 1043
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 1045
    :try_start_0
    sget-object v5, Lcom/umeng/analytics/AnalyticsConfig;->mWrapperType:Ljava/lang/String;

    if-eqz v5, :cond_0

    sget-object v5, Lcom/umeng/analytics/AnalyticsConfig;->mWrapperVersion:Ljava/lang/String;

    if-eqz v5, :cond_0

    const-string v5, "wrapper_version"

    .line 1046
    invoke-static {v5}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/umeng/analytics/AnalyticsConfig;->mWrapperVersion:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v5, "wrapper_type"

    .line 1047
    invoke-static {v5}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/umeng/analytics/AnalyticsConfig;->mWrapperType:Ljava/lang/String;

    invoke-virtual {v4, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1050
    :cond_0
    sget-object v5, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v5}, Lcom/umeng/analytics/AnalyticsConfig;->getVerticalType(Landroid/content/Context;)I

    move-result v5

    const-string v6, "vertical_type"

    .line 1060
    invoke-static {v6}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v6, 0x1

    const-string v7, "sdk_version"

    const-string v8, "9.5.2"

    if-ne v5, v6, :cond_2

    .line 1062
    :try_start_1
    sget-object v5, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v5}, Lcom/umeng/analytics/AnalyticsConfig;->getGameSdkVersion(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 1063
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_0

    :cond_1
    move-object v8, v5

    .line 1066
    :goto_0
    invoke-static {v7}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 1068
    :cond_2
    invoke-static {v7}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1075
    :goto_1
    sget-object v5, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v5}, Lcom/umeng/analytics/AnalyticsConfig;->getSecretKey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->MD5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1076
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_3

    const-string v6, "secret"

    .line 1077
    invoke-static {v6}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1080
    :cond_3
    sget-object v5, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    const-string v6, "pr_ve"

    const/4 v7, 0x0

    invoke-static {v5, v6, v7}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1082
    sget-object v6, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v6}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v6

    .line 1085
    sget-object v7, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    const-string v8, "ekv_bl_ver"

    invoke-static {v7, v8, v3}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1086
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    .line 1087
    sget-boolean v8, Lcom/umeng/analytics/AnalyticsConfig;->CLEAR_EKV_BL:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v9, "$ekv_bl_ver"

    if-eqz v8, :cond_4

    .line 1088
    :try_start_2
    invoke-static {v9}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_2

    .line 1090
    :cond_4
    invoke-static {v9}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1094
    :cond_5
    :goto_2
    sget-object v7, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    const-string v8, "ekv_wl_ver"

    invoke-static {v7, v8, v3}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 1095
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_7

    .line 1096
    sget-boolean v8, Lcom/umeng/analytics/AnalyticsConfig;->CLEAR_EKV_WL:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v9, "$ekv_wl_ver"

    if-eqz v8, :cond_6

    .line 1097
    :try_start_3
    invoke-static {v9}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_3

    .line 1099
    :cond_6
    invoke-static {v9}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_7
    :goto_3
    const-string v7, "pro_ver"

    .line 1104
    invoke-static {v7}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "1.0.0"

    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1107
    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;->s()Z

    move-result v7

    if-eqz v7, :cond_8

    const-string v7, "atm"

    .line 1108
    invoke-static {v7}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "1"

    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz v6, :cond_8

    .line 1110
    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v7

    const-string v8, "ana_is_f"

    const-wide/16 v9, 0x0

    invoke-interface {v7, v8, v9, v10}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v7

    invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1116
    :cond_8
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;->m()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1117
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;->n()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz v6, :cond_a

    .line 1124
    invoke-interface {v6, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1125
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_a

    .line 1128
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v8, "yyyy-MM-dd"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v9

    invoke-direct {v7, v8, v9}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v8, Ljava/util/Date;

    .line 1129
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    invoke-direct {v8, v9, v10}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v7, v8}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    .line 1132
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const-string v8, "vers_date"

    const-string v9, "vers_pre_version"

    if-eqz v5, :cond_9

    .line 1134
    :try_start_4
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "0"

    invoke-interface {v6, v9, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1136
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v8, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1140
    :cond_9
    sget-object v1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getAppVersionName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 1141
    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v5, "pre_version"

    invoke-interface {v2, v5, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "cur_version"

    .line 1142
    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "pre_date"

    .line 1143
    invoke-interface {v1, v2, v7}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 1144
    invoke-interface {v1, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "vers_code"

    .line 1145
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 1146
    invoke-interface {v0, v8}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 1147
    invoke-interface {v0, v9}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 1148
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    :cond_a
    return-object v4
.end method

.method private m()Ljava/lang/String;
    .locals 8

    const-string v0, "0"

    const-string v1, ""

    const-string v2, "pre_version"

    const/4 v3, 0x0

    .line 1320
    :try_start_0
    sget-object v4, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    const-string v5, "pr_ve"

    invoke-static {v4, v5, v3}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 1321
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 1322
    iget-object v4, p0, Lcom/umeng/analytics/pro/o;->d:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 1323
    iget-object v0, p0, Lcom/umeng/analytics/pro/o;->d:Ljava/lang/String;

    return-object v0

    .line 1325
    :cond_0
    iget-object v4, p0, Lcom/umeng/analytics/pro/o;->c:Landroid/content/SharedPreferences;

    if-nez v4, :cond_1

    sget-object v4, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v4}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v4

    iput-object v4, p0, Lcom/umeng/analytics/pro/o;->c:Landroid/content/SharedPreferences;

    .line 1330
    :cond_1
    iget-object v4, p0, Lcom/umeng/analytics/pro/o;->c:Landroid/content/SharedPreferences;

    invoke-interface {v4, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1331
    sget-object v5, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v5}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getAppVersionName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    .line 1333
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v7, "cur_version"

    if-eqz v6, :cond_2

    .line 1334
    :try_start_1
    iget-object v1, p0, Lcom/umeng/analytics/pro/o;->c:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v7, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_0

    .line 1337
    :cond_2
    iget-object v0, p0, Lcom/umeng/analytics/pro/o;->c:Landroid/content/SharedPreferences;

    invoke-interface {v0, v7, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1338
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 1339
    iget-object v1, p0, Lcom/umeng/analytics/pro/o;->c:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v7, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 1340
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_3
    move-object v0, v4

    goto :goto_0

    :catchall_0
    :cond_4
    move-object v0, v3

    .line 1351
    :goto_0
    iput-object v0, p0, Lcom/umeng/analytics/pro/o;->d:Ljava/lang/String;

    return-object v0
.end method

.method private n()Ljava/lang/String;
    .locals 7

    const-string v0, "pre_date"

    const/4 v1, 0x0

    .line 1364
    :try_start_0
    sget-object v2, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    const-string v3, "ud_da"

    invoke-static {v2, v3, v1}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1366
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 1367
    iget-object v2, p0, Lcom/umeng/analytics/pro/o;->e:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1368
    iget-object v0, p0, Lcom/umeng/analytics/pro/o;->e:Ljava/lang/String;

    return-object v0

    .line 1370
    :cond_0
    iget-object v2, p0, Lcom/umeng/analytics/pro/o;->c:Landroid/content/SharedPreferences;

    if-nez v2, :cond_1

    sget-object v2, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    iput-object v2, p0, Lcom/umeng/analytics/pro/o;->c:Landroid/content/SharedPreferences;

    .line 1371
    :cond_1
    iget-object v2, p0, Lcom/umeng/analytics/pro/o;->c:Landroid/content/SharedPreferences;

    const-string v3, ""

    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1372
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v4, "yyyy-MM-dd"

    if-eqz v3, :cond_2

    .line 1373
    :try_start_1
    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-direct {v2, v4, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v3, Ljava/util/Date;

    .line 1374
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    .line 1375
    iget-object v3, p0, Lcom/umeng/analytics/pro/o;->c:Landroid/content/SharedPreferences;

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3, v0, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    goto :goto_0

    .line 1378
    :cond_2
    new-instance v3, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v4, Ljava/util/Date;

    .line 1379
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v4}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    .line 1380
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 1381
    iget-object v2, p0, Lcom/umeng/analytics/pro/o;->c:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v1, v3

    goto :goto_1

    :cond_3
    :goto_0
    move-object v1, v2

    .line 1391
    :catchall_0
    :cond_4
    :goto_1
    iput-object v1, p0, Lcom/umeng/analytics/pro/o;->e:Ljava/lang/String;

    return-object v1
.end method

.method private o()V
    .locals 5

    const/4 v0, 0x0

    .line 1526
    :try_start_0
    iput v0, p0, Lcom/umeng/analytics/pro/o;->i:I

    .line 1527
    iput v0, p0, Lcom/umeng/analytics/pro/o;->j:I

    .line 1528
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/umeng/analytics/pro/o;->k:J

    .line 1530
    sget-object v1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 1531
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "dstk_last_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-interface {v1, v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "dstk_cnt"

    .line 1532
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private p()Z
    .locals 4

    .line 1667
    :try_start_0
    invoke-static {}, Lcom/umeng/analytics/pro/u;->a()Lcom/umeng/analytics/pro/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/umeng/analytics/pro/u;->b()Ljava/lang/String;

    move-result-object v0

    .line 1668
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1669
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/o;->b(Landroid/content/Context;)V

    .line 1672
    :cond_0
    iget-object v0, p0, Lcom/umeng/analytics/pro/o;->g:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_3

    const/4 v0, 0x0

    .line 1675
    :goto_0
    iget-object v2, p0, Lcom/umeng/analytics/pro/o;->g:Lorg/json/JSONArray;

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_4

    .line 1676
    iget-object v2, p0, Lcom/umeng/analytics/pro/o;->g:Lorg/json/JSONArray;

    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 1677
    invoke-virtual {v2}, Lorg/json/JSONObject;->length()I

    move-result v3

    if-lez v3, :cond_2

    const-string v3, "__i"

    .line 1678
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1679
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "-1"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_2

    :cond_1
    return v1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return v1

    :catchall_0
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method private q()V
    .locals 7

    const-string v0, "__i"

    .line 2419
    iget-object v1, p0, Lcom/umeng/analytics/pro/o;->g:Lorg/json/JSONArray;

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-lez v1, :cond_5

    .line 2425
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    const/4 v2, 0x0

    .line 2426
    :goto_0
    iget-object v3, p0, Lcom/umeng/analytics/pro/o;->g:Lorg/json/JSONArray;

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_4

    .line 2428
    :try_start_0
    iget-object v3, p0, Lcom/umeng/analytics/pro/o;->g:Lorg/json/JSONArray;

    invoke-virtual {v3, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 2429
    invoke-virtual {v3}, Lorg/json/JSONObject;->length()I

    move-result v4

    if-lez v4, :cond_3

    .line 2430
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 2431
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v6, "-1"

    if-nez v5, :cond_0

    :try_start_1
    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 2432
    :cond_0
    invoke-static {}, Lcom/umeng/analytics/pro/u;->a()Lcom/umeng/analytics/pro/u;

    move-result-object v4

    invoke-virtual {v4}, Lcom/umeng/analytics/pro/u;->b()Ljava/lang/String;

    move-result-object v4

    .line 2433
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    move-object v6, v4

    .line 2436
    :goto_1
    invoke-virtual {v3, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 2438
    :cond_2
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_2

    .line 2440
    :cond_3
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2444
    :cond_4
    iput-object v1, p0, Lcom/umeng/analytics/pro/o;->g:Lorg/json/JSONArray;

    :cond_5
    return-void
.end method

.method private r()V
    .locals 7

    const-string v0, "first_activate_time"

    .line 2453
    :try_start_0
    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;->s()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2454
    sget-object v1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    if-eqz v1, :cond_0

    .line 2455
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    if-eqz v1, :cond_0

    const-wide/16 v2, 0x0

    .line 2457
    invoke-interface {v1, v0, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    cmp-long v6, v4, v2

    if-nez v6, :cond_0

    .line 2459
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 2460
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method private s()Z
    .locals 5

    .line 2501
    :try_start_0
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    .line 2502
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "ana_is_f"

    const-wide/16 v2, -0x1

    .line 2504
    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    return v0

    :catchall_0
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a(J)Lorg/json/JSONObject;
    .locals 8

    .line 702
    invoke-static {}, Lcom/umeng/analytics/pro/y;->a()Lcom/umeng/analytics/pro/y;

    move-result-object v0

    sget-object v1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/y;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x0

    .line 707
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/o;->b(Z)Lorg/json/JSONObject;

    move-result-object v0

    .line 709
    invoke-static {}, Lcom/umeng/analytics/pro/r;->a()Lcom/umeng/analytics/pro/r;

    move-result-object v2

    sget-object v3, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lcom/umeng/analytics/pro/r;->a(Landroid/content/Context;)I

    move-result v2

    .line 714
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v3

    const/4 v4, 0x3

    if-gtz v3, :cond_1

    if-eq v2, v4, :cond_5

    return-object v1

    .line 724
    :cond_1
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v3

    const/4 v5, 0x1

    const-string v6, "userlevel"

    const-string v7, "active_user"

    if-ne v3, v5, :cond_3

    .line 725
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_2

    if-eq v2, v4, :cond_2

    return-object v1

    .line 732
    :cond_2
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    if-eq v2, v4, :cond_4

    return-object v1

    .line 739
    :cond_3
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v3

    const/4 v5, 0x2

    if-ne v3, v5, :cond_4

    .line 741
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 742
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    if-eq v2, v4, :cond_4

    return-object v1

    :cond_4
    const-string v3, "sessions"

    .line 751
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "gkv"

    .line 752
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "ekv"

    .line 753
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 754
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 755
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_5

    .line 756
    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/o;->a(Lorg/json/JSONObject;)Z

    move-result v3

    if-eqz v3, :cond_5

    return-object v1

    .line 764
    :cond_5
    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;->l()Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 766
    invoke-direct {p0, v1}, Lcom/umeng/analytics/pro/o;->c(Lorg/json/JSONObject;)V

    .line 769
    :cond_6
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 771
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v6, "analytics"

    if-ne v2, v4, :cond_7

    .line 773
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v5, v6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 775
    :cond_7
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v2

    if-lez v2, :cond_8

    .line 776
    invoke-virtual {v5, v6, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_8
    :goto_0
    if-eqz v1, :cond_9

    .line 779
    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_9

    const-string v0, "header"

    .line 780
    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 783
    :cond_9
    invoke-virtual {v5}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_a

    const-string v0, "content"

    .line 784
    invoke-virtual {v3, v0, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 787
    :cond_a
    invoke-direct {p0, v3, p1, p2}, Lcom/umeng/analytics/pro/o;->a(Lorg/json/JSONObject;J)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p1

    :catchall_0
    return-object v3
.end method

.method public a()V
    .locals 5

    .line 170
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    if-eqz v0, :cond_2

    .line 172
    iget-object v0, p0, Lcom/umeng/analytics/pro/o;->w:Ljava/lang/Object;

    monitor-enter v0

    .line 173
    :try_start_0
    iget-boolean v1, p0, Lcom/umeng/analytics/pro/o;->u:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const-string v1, "MobclickRT"

    const-string v3, "--->>> network is now available, rebuild instant session data packet."

    .line 174
    invoke-static {v1, v3}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    sget-object v1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    .line 176
    invoke-static {v1}, Lcom/umeng/analytics/CoreProtocol;->getInstance(Landroid/content/Context;)Lcom/umeng/analytics/CoreProtocol;

    move-result-object v3

    const/16 v4, 0x1101

    .line 175
    invoke-static {v1, v4, v3, v2}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 178
    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 181
    iget-object v0, p0, Lcom/umeng/analytics/pro/o;->w:Ljava/lang/Object;

    monitor-enter v0

    .line 182
    :try_start_1
    iget-boolean v1, p0, Lcom/umeng/analytics/pro/o;->v:Z

    if-eqz v1, :cond_1

    .line 183
    sget-object v1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    .line 184
    invoke-static {v1}, Lcom/umeng/analytics/CoreProtocol;->getInstance(Landroid/content/Context;)Lcom/umeng/analytics/CoreProtocol;

    move-result-object v3

    const/16 v4, 0x1102

    .line 183
    invoke-static {v1, v4, v3, v2}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 186
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :catchall_1
    move-exception v1

    .line 178
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1

    :cond_2
    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 2

    const-string v0, "exception"

    if-eqz p1, :cond_2

    .line 2142
    :try_start_0
    check-cast p1, Lorg/json/JSONObject;

    .line 2147
    invoke-virtual {p1}, Lorg/json/JSONObject;->length()I

    move-result v1

    if-lez v1, :cond_2

    .line 2148
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2149
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x65

    if-ne v1, v0, :cond_0

    goto :goto_0

    .line 2152
    :cond_0
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/o;->g(Lorg/json/JSONObject;)V

    return-void

    .line 2155
    :cond_1
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/o;->g(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method

.method public a(Ljava/lang/Object;I)V
    .locals 6

    .line 214
    invoke-static {}, Lcom/umeng/commonsdk/utils/c;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x1105

    if-ne p2, v0, :cond_c

    :try_start_0
    const-string v0, "MobclickRT"

    const-string v1, "--->>> clean db in silent mode."

    .line 218
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 219
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/analytics/pro/h;->a(Landroid/content/Context;)V

    .line 220
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/commonsdk/utils/c;->c(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    .line 228
    :cond_0
    :goto_0
    sget-boolean v0, Lcom/umeng/analytics/AnalyticsConfig;->enable:Z

    if-nez v0, :cond_1

    goto/16 :goto_1

    :cond_1
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    packed-switch p2, :pswitch_data_0

    packed-switch p2, :pswitch_data_1

    packed-switch p2, :pswitch_data_2

    packed-switch p2, :pswitch_data_3

    packed-switch p2, :pswitch_data_4

    packed-switch p2, :pswitch_data_5

    goto/16 :goto_1

    .line 311
    :pswitch_0
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/o;->h(Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 304
    :pswitch_1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/o;->d()V

    goto/16 :goto_1

    .line 415
    :pswitch_2
    invoke-static {}, Lcom/umeng/analytics/pro/u;->a()Lcom/umeng/analytics/pro/u;

    move-result-object p2

    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {p2, v0, p1}, Lcom/umeng/analytics/pro/u;->c(Landroid/content/Context;Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_3
    const-string p2, "MobclickRT"

    const-string v0, "--->>> START_SESSION"

    .line 379
    invoke-static {p2, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 380
    invoke-static {}, Lcom/umeng/analytics/pro/u;->a()Lcom/umeng/analytics/pro/u;

    move-result-object p2

    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {p2, v0, p1}, Lcom/umeng/analytics/pro/u;->a(Landroid/content/Context;Ljava/lang/Object;)V

    .line 382
    iget-object p1, p0, Lcom/umeng/analytics/pro/o;->w:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0

    .line 383
    :try_start_1
    iput-boolean v3, p0, Lcom/umeng/analytics/pro/o;->v:Z

    .line 384
    monitor-exit v0

    goto/16 :goto_1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p1

    :pswitch_4
    const-string p2, "MobclickRT"

    const-string v0, "--->>> PROFILE_SIGNOFF"

    .line 326
    invoke-static {p2, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    invoke-virtual {p0, v2, v3}, Lcom/umeng/analytics/pro/o;->a(Ljava/lang/Object;Z)V

    .line 329
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/o;->f(Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_5
    const-string p2, "MobclickRT"

    const-string v0, "--->>> PROFILE_SIGNIN"

    .line 317
    invoke-static {p2, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    invoke-virtual {p0, v2, v3}, Lcom/umeng/analytics/pro/o;->a(Ljava/lang/Object;Z)V

    .line 320
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/o;->g(Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 297
    :pswitch_6
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/analytics/pro/l;->c(Landroid/content/Context;)V

    goto/16 :goto_1

    .line 291
    :pswitch_7
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/analytics/pro/v;->a(Landroid/content/Context;)V

    goto/16 :goto_1

    :pswitch_8
    if-eqz p1, :cond_2

    .line 277
    :try_start_2
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/o;->e(Ljava/lang/Object;)V

    .line 279
    :cond_2
    check-cast p1, Lorg/json/JSONObject;

    const-string p2, "__i"

    .line 280
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "-1"

    .line 281
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    .line 282
    invoke-virtual {p0, v1}, Lcom/umeng/analytics/pro/o;->a(Z)V

    goto/16 :goto_1

    .line 236
    :pswitch_9
    sget-object p2, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/umeng/commonsdk/utils/UMUtils;->isMainProgress(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_4

    if-eqz p1, :cond_3

    .line 241
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/o;->e(Ljava/lang/Object;)V

    .line 243
    :cond_3
    check-cast p1, Lorg/json/JSONObject;

    const-string p2, "__i"

    .line 244
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "-1"

    .line 245
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    .line 247
    invoke-virtual {p0, v1}, Lcom/umeng/analytics/pro/o;->a(Z)V

    goto/16 :goto_1

    .line 250
    :cond_4
    sget-object p2, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/umeng/analytics/process/UMProcessDBHelper;->getInstance(Landroid/content/Context;)Lcom/umeng/analytics/process/UMProcessDBHelper;

    move-result-object p2

    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/commonsdk/framework/UMFrUtils;->getSubProcessName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 251
    invoke-virtual {v1, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object p1

    .line 250
    invoke-virtual {p2, v0, p1}, Lcom/umeng/analytics/process/UMProcessDBHelper;->insertEventsInSubProcess(Ljava/lang/String;Lorg/json/JSONArray;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    goto/16 :goto_1

    :pswitch_a
    if-nez p1, :cond_5

    goto/16 :goto_1

    .line 335
    :cond_5
    sget-object p2, Lcom/umeng/analytics/pro/o;->y:Ljava/lang/Class;

    if-eqz p2, :cond_c

    sget-object p2, Lcom/umeng/analytics/pro/o;->z:Ljava/lang/reflect/Method;

    if-nez p2, :cond_6

    goto/16 :goto_1

    :cond_6
    const-string p2, "MobclickRT"

    const-string v0, "--->>> PROFILE_CHANGE_NOTIFY"

    .line 338
    invoke-static {p2, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_3
    const-string p2, ""

    const-string v0, ""

    .line 342
    instance-of v1, p1, Lorg/json/JSONObject;

    if-eqz v1, :cond_c

    .line 343
    check-cast p1, Lorg/json/JSONObject;

    const-string v1, "uid"

    .line 344
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    const-string v1, "provider"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    const-string p2, "provider"

    .line 346
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "uid"

    .line 347
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 349
    :cond_7
    invoke-direct {p0, v0, p2}, Lcom/umeng/analytics/pro/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 257
    :pswitch_b
    sget-object p2, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/umeng/commonsdk/utils/UMUtils;->isMainProgress(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_8

    if-eqz p1, :cond_c

    .line 262
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/o;->e(Ljava/lang/Object;)V

    .line 263
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/o;->d()V

    goto/16 :goto_1

    .line 266
    :cond_8
    sget-object p2, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/umeng/analytics/process/UMProcessDBHelper;->getInstance(Landroid/content/Context;)Lcom/umeng/analytics/process/UMProcessDBHelper;

    move-result-object p2

    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/commonsdk/framework/UMFrUtils;->getSubProcessName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 267
    invoke-virtual {v1, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object p1

    .line 266
    invoke-virtual {p2, v0, p1}, Lcom/umeng/analytics/process/UMProcessDBHelper;->insertEventsInSubProcess(Ljava/lang/String;Lorg/json/JSONArray;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto/16 :goto_1

    .line 391
    :pswitch_c
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/o;->c()V

    goto/16 :goto_1

    .line 408
    :pswitch_d
    invoke-virtual {p0, p1, v3}, Lcom/umeng/analytics/pro/o;->a(Ljava/lang/Object;Z)V

    goto/16 :goto_1

    :pswitch_e
    const-string p2, "MobclickRT"

    const-string v0, "--->>> INSTANT_SESSION_START"

    .line 397
    invoke-static {p2, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 398
    invoke-static {}, Lcom/umeng/analytics/pro/u;->a()Lcom/umeng/analytics/pro/u;

    move-result-object p2

    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {p2, v0, p1}, Lcom/umeng/analytics/pro/u;->b(Landroid/content/Context;Ljava/lang/Object;)V

    .line 399
    iget-object p1, p0, Lcom/umeng/analytics/pro/o;->w:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0

    .line 400
    :try_start_4
    iput-boolean v3, p0, Lcom/umeng/analytics/pro/o;->u:Z

    .line 401
    monitor-exit v0

    goto/16 :goto_1

    :catchall_2
    move-exception p1

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1

    .line 372
    :pswitch_f
    invoke-static {}, Lcom/umeng/analytics/b;->a()Lcom/umeng/analytics/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/umeng/analytics/b;->k()V

    goto/16 :goto_1

    .line 366
    :pswitch_10
    invoke-static {}, Lcom/umeng/analytics/b;->a()Lcom/umeng/analytics/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/umeng/analytics/b;->m()V

    goto/16 :goto_1

    .line 360
    :pswitch_11
    invoke-static {}, Lcom/umeng/analytics/b;->a()Lcom/umeng/analytics/b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/umeng/analytics/b;->a(Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 423
    :pswitch_12
    invoke-static {}, Lcom/umeng/analytics/b;->a()Lcom/umeng/analytics/b;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/umeng/analytics/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 420
    :pswitch_13
    invoke-static {}, Lcom/umeng/analytics/b;->a()Lcom/umeng/analytics/b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/umeng/analytics/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    :pswitch_14
    const-string p1, "MobclickRT"

    const-string p2, "--->>> recv BUILD_ENVELOPE_IMMEDIATELY."

    .line 444
    invoke-static {p1, p2}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 446
    :try_start_5
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/commonsdk/utils/UMUtils;->isMainProgress(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 447
    iget-object p1, p0, Lcom/umeng/analytics/pro/o;->b:Lcom/umeng/analytics/pro/o$c;

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/o$c;->c()Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportStrategy;

    move-result-object p1

    .line 448
    instance-of p1, p1, Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportQuasiRealtime;

    if-eqz p1, :cond_9

    goto/16 :goto_1

    .line 452
    :cond_9
    invoke-virtual {p0, v3}, Lcom/umeng/analytics/pro/o;->a(Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto/16 :goto_1

    .line 439
    :pswitch_15
    invoke-virtual {p0, p1, v1}, Lcom/umeng/analytics/pro/o;->a(Ljava/lang/Object;Z)V

    goto/16 :goto_1

    :pswitch_16
    const-string p1, "MobclickRT"

    const-string p2, "--->>> receive DELAY_BUILD_ENVELOPE event."

    .line 429
    invoke-static {p1, p2}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 430
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    const/16 p2, 0x2011

    .line 431
    invoke-static {p1}, Lcom/umeng/analytics/CoreProtocol;->getInstance(Landroid/content/Context;)Lcom/umeng/analytics/CoreProtocol;

    move-result-object v0

    .line 430
    invoke-static {p1, p2, v0, v2}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 432
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    const/16 p2, 0x1102

    .line 433
    invoke-static {p1}, Lcom/umeng/analytics/CoreProtocol;->getInstance(Landroid/content/Context;)Lcom/umeng/analytics/CoreProtocol;

    move-result-object v0

    .line 432
    invoke-static {p1, p2, v0, v2}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    goto/16 :goto_1

    .line 496
    :pswitch_17
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    const-string p2, "um_rtd_conf"

    invoke-static {p1, p2}, Lcom/umeng/common/b;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_1

    :pswitch_18
    if-nez p1, :cond_a

    goto :goto_1

    .line 478
    :cond_a
    instance-of p2, p1, Lorg/json/JSONObject;

    if-eqz p2, :cond_c

    .line 480
    :try_start_6
    move-object p2, p1

    check-cast p2, Lorg/json/JSONObject;

    const-string v0, "startTime"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 481
    move-object v0, p1

    check-cast v0, Lorg/json/JSONObject;

    const-string v1, "period"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 482
    check-cast p1, Lorg/json/JSONObject;

    const-string v1, "debugkey"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 483
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 484
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 485
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_c

    .line 486
    sget-object v1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    const-string v2, "um_rtd_conf"

    const-string v3, "startTime"

    invoke-static {v1, v2, v3, p2}, Lcom/umeng/common/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 487
    sget-object p2, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    const-string v1, "um_rtd_conf"

    const-string v2, "period"

    invoke-static {p2, v1, v2, v0}, Lcom/umeng/common/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 488
    sget-object p2, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    const-string v0, "um_rtd_conf"

    const-string v1, "debugkey"

    invoke-static {p2, v0, v1, p1}, Lcom/umeng/common/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_1

    :pswitch_19
    const-string p1, "header_foreground_count"

    .line 459
    invoke-static {p1}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_c

    .line 461
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getGlobleActivity(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p1

    if-eqz p1, :cond_b

    .line 464
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/analytics/pro/u;->b(Landroid/content/Context;)V

    .line 468
    :cond_b
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    .line 469
    invoke-static {v0}, Lcom/umeng/analytics/CoreProtocol;->getInstance(Landroid/content/Context;)Lcom/umeng/analytics/CoreProtocol;

    move-result-object v2

    const/4 v3, 0x0

    const-wide/16 v4, 0x1388

    const/16 v1, 0x2015

    .line 468
    invoke-static/range {v0 .. v5}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEventEx(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;J)V

    :catchall_3
    :cond_c
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1001
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1100
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2003
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x2007
        :pswitch_13
        :pswitch_13
        :pswitch_12
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x2010
        :pswitch_16
        :pswitch_15
        :pswitch_14
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x2015
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch
.end method

.method public a(Ljava/lang/Object;Z)V
    .locals 0

    const/4 p1, 0x1

    if-eqz p2, :cond_0

    .line 2402
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/o;->d(Z)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2403
    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;->i()V

    return-void

    .line 2406
    :cond_0
    sget-object p2, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->isOnline(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 2408
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/o;->d(Z)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 2409
    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;->i()V

    :cond_1
    return-void
.end method

.method public a(Z)V
    .locals 2

    .line 512
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/o;->c(Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 514
    iget-object v0, p0, Lcom/umeng/analytics/pro/o;->b:Lcom/umeng/analytics/pro/o$c;

    invoke-virtual {v0}, Lcom/umeng/analytics/pro/o$c;->c()Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportStrategy;

    move-result-object v0

    .line 515
    instance-of v0, v0, Lcom/umeng/commonsdk/statistics/common/ReportPolicy$ReportQuasiRealtime;

    const-string v1, "MobclickRT"

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    .line 518
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->isOnline(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "--->>> send session start in policy ReportQuasiRealtime."

    .line 519
    invoke-static {v1, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 520
    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;->j()V

    return-void

    .line 523
    :cond_0
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    sget-object v0, Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;->U_APP:Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;

    invoke-static {p1, v0}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->isReadyBuild(Landroid/content/Context;Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "--->>> send normal data in policy ReportQuasiRealtime."

    .line 524
    invoke-static {v1, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 525
    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;->j()V

    return-void

    .line 530
    :cond_1
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    sget-object v0, Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;->U_APP:Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;

    invoke-static {p1, v0}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->isReadyBuild(Landroid/content/Context;Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "--->>> constructMessage()"

    .line 531
    invoke-static {v1, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 532
    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;->j()V

    :cond_2
    return-void
.end method

.method public b(J)Lorg/json/JSONObject;
    .locals 8

    .line 863
    invoke-static {}, Lcom/umeng/analytics/pro/y;->a()Lcom/umeng/analytics/pro/y;

    move-result-object v0

    sget-object v1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getAppContext(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/y;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 868
    :cond_0
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getAppContext(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/umeng/analytics/pro/i;->b(Z)Lorg/json/JSONObject;

    move-result-object v0

    .line 871
    sget-object v3, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v3}, Lcom/umeng/analytics/c;->a(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v3

    const-string v4, "active_user"

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    .line 872
    aget-object v6, v3, v2

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_1

    aget-object v6, v3, v5

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 873
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v7, "provider"

    .line 875
    aget-object v2, v3, v2

    invoke-virtual {v6, v7, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "puid"

    .line 876
    aget-object v3, v3, v5

    invoke-virtual {v6, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 877
    invoke-virtual {v6}, Lorg/json/JSONObject;->length()I

    move-result v2

    if-lez v2, :cond_1

    .line 878
    invoke-virtual {v0, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    nop

    .line 885
    :cond_1
    :goto_0
    invoke-static {}, Lcom/umeng/analytics/pro/r;->a()Lcom/umeng/analytics/pro/r;

    move-result-object v2

    sget-object v3, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {v2, v3}, Lcom/umeng/analytics/pro/r;->a(Landroid/content/Context;)I

    move-result v2

    .line 888
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v3

    const/4 v6, 0x3

    if-ne v3, v5, :cond_2

    .line 889
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_2

    if-eq v2, v6, :cond_2

    return-object v1

    .line 901
    :cond_2
    invoke-static {}, Lcom/umeng/analytics/pro/r;->a()Lcom/umeng/analytics/pro/r;

    move-result-object v3

    sget-object v4, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {v3, v0, v4}, Lcom/umeng/analytics/pro/r;->b(Lorg/json/JSONObject;Landroid/content/Context;)V

    .line 906
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v3

    if-gtz v3, :cond_3

    if-eq v2, v6, :cond_3

    return-object v1

    .line 916
    :cond_3
    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;->k()Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 918
    invoke-direct {p0, v1}, Lcom/umeng/analytics/pro/o;->b(Lorg/json/JSONObject;)V

    .line 921
    :cond_4
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 922
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    const-string v5, "analytics"

    if-ne v2, v6, :cond_5

    .line 926
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v4, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 928
    :cond_5
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v2

    if-lez v2, :cond_6

    .line 929
    invoke-virtual {v4, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_6
    :goto_1
    if-eqz v1, :cond_7

    .line 932
    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_7

    const-string v0, "header"

    .line 933
    invoke-virtual {v3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 936
    :cond_7
    invoke-virtual {v4}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_8

    const-string v0, "content"

    .line 937
    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 941
    :cond_8
    invoke-direct {p0, v3, p1, p2}, Lcom/umeng/analytics/pro/o;->b(Lorg/json/JSONObject;J)Lorg/json/JSONObject;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    return-object v3
.end method

.method public b(Z)Lorg/json/JSONObject;
    .locals 17

    const-string v0, "userlevel"

    const-string v1, "autopages"

    const-string v2, "sessions"

    const-string v3, "pages"

    const/4 v4, 0x0

    .line 1182
    :try_start_0
    sget-object v5, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v5}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object v5

    move/from16 v6, p1

    invoke-virtual {v5, v6}, Lcom/umeng/analytics/pro/i;->a(Z)Lorg/json/JSONObject;

    move-result-object v4

    if-nez v4, :cond_0

    .line 1184
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v15, v0

    move-object v4, v1

    goto/16 :goto_7

    .line 1187
    :cond_0
    :try_start_1
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_a

    .line 1188
    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    .line 1189
    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    const/4 v7, 0x0

    .line 1190
    :goto_0
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v8

    if-ge v7, v8, :cond_9

    .line 1191
    invoke-virtual {v5, v7}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lorg/json/JSONObject;

    .line 1192
    invoke-virtual {v8, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v9

    .line 1193
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v10

    if-nez v9, :cond_1

    if-eqz v10, :cond_1

    .line 1196
    invoke-virtual {v8, v3, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1197
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    const-string v11, "page_start"

    if-eqz v9, :cond_5

    if-eqz v10, :cond_5

    .line 1201
    :try_start_2
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    const/4 v13, 0x0

    .line 1203
    :goto_1
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v14

    if-ge v13, v14, :cond_2

    .line 1204
    invoke-virtual {v9, v13}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lorg/json/JSONObject;

    .line 1205
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    :cond_2
    const/4 v9, 0x0

    .line 1208
    :goto_2
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v13

    if-ge v9, v13, :cond_3

    .line 1209
    invoke-virtual {v10, v9}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lorg/json/JSONObject;

    .line 1210
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 1212
    :cond_3
    new-instance v9, Lcom/umeng/commonsdk/utils/JSONArraySortUtil;

    invoke-direct {v9}, Lcom/umeng/commonsdk/utils/JSONArraySortUtil;-><init>()V

    .line 1213
    invoke-virtual {v9, v11}, Lcom/umeng/commonsdk/utils/JSONArraySortUtil;->setCompareKey(Ljava/lang/String;)V

    .line 1214
    invoke-static {v12, v9}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1215
    new-instance v9, Lorg/json/JSONArray;

    invoke-direct {v9}, Lorg/json/JSONArray;-><init>()V

    .line 1216
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lorg/json/JSONObject;

    .line 1217
    invoke-virtual {v9, v12}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_3

    .line 1219
    :cond_4
    invoke-virtual {v8, v3, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1220
    invoke-virtual {v8, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    .line 1223
    :cond_5
    invoke-virtual {v8, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v9
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v10, "$page_num"

    if-eqz v9, :cond_8

    .line 1224
    :try_start_3
    invoke-virtual {v8, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v9

    const/4 v12, 0x0

    .line 1225
    :goto_4
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v13

    if-ge v12, v13, :cond_7

    .line 1226
    invoke-virtual {v9, v12}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v13

    .line 1227
    invoke-virtual {v13, v11}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_6

    const-string v14, "ts"
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v15, v0

    move-object/from16 v16, v1

    .line 1228
    :try_start_4
    invoke-virtual {v13, v11}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-virtual {v13, v14, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1229
    invoke-virtual {v13, v11}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    goto :goto_5

    :cond_6
    move-object v15, v0

    move-object/from16 v16, v1

    :goto_5
    add-int/lit8 v12, v12, 0x1

    move-object v0, v15

    move-object/from16 v1, v16

    goto :goto_4

    :cond_7
    move-object v15, v0

    move-object/from16 v16, v1

    .line 1232
    invoke-virtual {v8, v3, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1233
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v0

    invoke-virtual {v8, v10, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    goto :goto_6

    :cond_8
    move-object v15, v0

    move-object/from16 v16, v1

    const/4 v0, 0x0

    .line 1235
    invoke-virtual {v8, v10, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1238
    :goto_6
    invoke-virtual {v6, v8}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    add-int/lit8 v7, v7, 0x1

    move-object v0, v15

    move-object/from16 v1, v16

    goto/16 :goto_0

    :cond_9
    move-object v15, v0

    .line 1240
    invoke-virtual {v4, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_7

    :cond_a
    move-object v15, v0

    goto :goto_7

    :catch_0
    move-object v15, v0

    :catch_1
    :try_start_5
    const-string v0, "merge pages error"

    .line 1243
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/common/MLog;->e(Ljava/lang/String;)V

    .line 1251
    :goto_7
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    if-eqz v0, :cond_b

    const-string v1, ""

    move-object v2, v15

    .line 1253
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1254
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_b

    .line 1255
    invoke-virtual {v4, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1283
    :cond_b
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/analytics/c;->a(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_c

    const/4 v1, 0x0

    .line 1284
    aget-object v1, v0, v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_c

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_c

    .line 1285
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "provider"

    const/4 v5, 0x0

    .line 1286
    aget-object v5, v0, v5

    invoke-virtual {v2, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "puid"

    .line 1287
    aget-object v0, v0, v1

    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1288
    invoke-virtual {v2}, Lorg/json/JSONObject;->length()I

    move-result v0

    if-lez v0, :cond_c

    const-string v0, "active_user"

    invoke-virtual {v4, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1293
    :cond_c
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/noise/ABTest;->getService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/noise/ABTest;

    move-result-object v0

    invoke-virtual {v0}, Lcom/umeng/commonsdk/statistics/noise/ABTest;->isInTest()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 1294
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 1295
    sget-object v1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/noise/ABTest;->getService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/noise/ABTest;

    move-result-object v1

    invoke-virtual {v1}, Lcom/umeng/commonsdk/statistics/noise/ABTest;->getTestName()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/noise/ABTest;->getService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/noise/ABTest;

    move-result-object v2

    invoke-virtual {v2}, Lcom/umeng/commonsdk/statistics/noise/ABTest;->getGroupInfo()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "group_info"

    .line 1296
    invoke-virtual {v4, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1299
    :cond_d
    invoke-static {}, Lcom/umeng/analytics/pro/r;->a()Lcom/umeng/analytics/pro/r;

    move-result-object v0

    sget-object v1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {v0, v4, v1}, Lcom/umeng/analytics/pro/r;->a(Lorg/json/JSONObject;Landroid/content/Context;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_0
    return-object v4
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public b(Landroid/content/Context;)V
    .locals 0

    .line 2334
    :try_start_0
    invoke-static {p1}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/i;->d()V

    .line 2336
    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;->q()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 2

    const-string v0, "exception"

    if-eqz p1, :cond_2

    .line 2169
    :try_start_0
    check-cast p1, Lorg/json/JSONObject;

    .line 2174
    invoke-virtual {p1}, Lorg/json/JSONObject;->length()I

    move-result v1

    if-lez v1, :cond_2

    .line 2175
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2176
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x65

    if-ne v1, v0, :cond_0

    goto :goto_0

    .line 2181
    :cond_0
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/o;->f(Lorg/json/JSONObject;)V

    return-void

    .line 2185
    :cond_1
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/o;->f(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_2
    :goto_0
    return-void
.end method

.method public c()V
    .locals 1

    .line 197
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/o;->b(Landroid/content/Context;)V

    .line 198
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/o;->d()V

    const/4 v0, 0x1

    .line 199
    invoke-virtual {p0, v0}, Lcom/umeng/analytics/pro/o;->a(Z)V

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 0

    .line 2324
    sget-object p1, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/o;->b(Landroid/content/Context;)V

    .line 2325
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/o;->d()V

    const/4 p1, 0x0

    .line 2327
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/o;->d(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2328
    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;->j()V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 4

    .line 1400
    :try_start_0
    iget-object v0, p0, Lcom/umeng/analytics/pro/o;->g:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_0

    const-string v0, "MobclickRT"

    const-string v1, "--->>>*** flushMemoryData: \u4e8b\u4ef6\u843d\u5e93\u3002"

    .line 1401
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 1402
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/analytics/pro/i;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/i;

    move-result-object v0

    iget-object v1, p0, Lcom/umeng/analytics/pro/o;->g:Lorg/json/JSONArray;

    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/i;->a(Lorg/json/JSONArray;)V

    .line 1403
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    iput-object v0, p0, Lcom/umeng/analytics/pro/o;->g:Lorg/json/JSONArray;

    .line 1405
    :cond_0
    sget-object v0, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 1406
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "thtstart"

    iget-wide v2, p0, Lcom/umeng/analytics/pro/o;->k:J

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "gkvc"

    iget v2, p0, Lcom/umeng/analytics/pro/o;->i:I

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "ekvc"

    iget v2, p0, Lcom/umeng/analytics/pro/o;->j:I

    .line 1407
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method public d(Ljava/lang/Object;)V
    .locals 0

    .line 2356
    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;->r()V

    .line 2359
    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;->m()Ljava/lang/String;

    .line 2360
    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;->n()Ljava/lang/String;

    const/4 p1, 0x1

    .line 2362
    invoke-virtual {p0, p1}, Lcom/umeng/analytics/pro/o;->a(Z)V

    return-void
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x0

    .line 2345
    invoke-direct {p0, v0}, Lcom/umeng/analytics/pro/o;->d(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2346
    invoke-direct {p0}, Lcom/umeng/analytics/pro/o;->j()V

    :cond_0
    return-void
.end method

.method public f()J
    .locals 7

    const-string v0, "first_activate_time"

    const-wide/16 v1, 0x0

    .line 2478
    :try_start_0
    sget-object v3, Lcom/umeng/analytics/pro/o;->a:Landroid/content/Context;

    if-eqz v3, :cond_1

    .line 2479
    invoke-static {v3}, Lcom/umeng/commonsdk/statistics/internal/PreferenceWrapper;->getDefault(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 2481
    invoke-interface {v3, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    cmp-long v6, v4, v1

    if-nez v6, :cond_0

    .line 2483
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 2484
    :try_start_2
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3, v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-wide v1

    :catchall_0
    move-wide v1, v4

    goto :goto_0

    :cond_0
    return-wide v4

    :catchall_1
    :cond_1
    :goto_0
    return-wide v1
.end method
