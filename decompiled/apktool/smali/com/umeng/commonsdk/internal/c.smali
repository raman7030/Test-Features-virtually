.class public Lcom/umeng/commonsdk/internal/c;
.super Ljava/lang/Object;
.source "1474"

# interfaces
.implements Lcom/umeng/commonsdk/framework/UMLogDataProtocol;


# static fields
.field public static final a:Ljava/lang/String; = "um_policy_grant"

.field public static final b:Ljava/lang/String; = "preInitInvokedFlag"

.field public static final c:Ljava/lang/String; = "policyGrantInvokedFlag"

.field public static final d:Ljava/lang/String; = "policyGrantResult"

.field public static f:I = 0x1

.field public static final g:Ljava/lang/String; = "info"

.field public static final h:Ljava/lang/String; = "stat"

.field public static i:Ljava/lang/Class;

.field public static j:Ljava/lang/reflect/Method;

.field public static k:Ljava/lang/reflect/Method;

.field public static l:Ljava/lang/reflect/Method;

.field public static m:Z


# instance fields
.field public e:Landroid/content/Context;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 101
    invoke-static {}, Lcom/umeng/commonsdk/internal/c;->c()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 160
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    :cond_0
    return-void
.end method

.method public static synthetic a(Lcom/umeng/commonsdk/internal/c;)Landroid/content/Context;
    .locals 0

    .line 73
    iget-object p0, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    return-object p0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/Class;
    .locals 0

    .line 876
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private a(Landroid/content/Context;)V
    .locals 3

    .line 170
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "appkey"

    .line 171
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getInstance(Landroid/content/Context;)Lcom/umeng/commonsdk/service/UMGlobalContext;

    move-result-object v2

    invoke-virtual {v2}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getAppkey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "app_version"

    .line 172
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getInstance(Landroid/content/Context;)Lcom/umeng/commonsdk/service/UMGlobalContext;

    move-result-object v2

    invoke-virtual {v2}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getAppVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "os"

    .line 173
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Android"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 175
    sget-object v1, Lcom/umeng/commonsdk/statistics/UMServerURL;->ZCFG_PATH:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->buildZeroEnvelopeWithExtHeader(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, "MobclickRT"

    if-eqz p1, :cond_0

    :try_start_1
    const-string v1, "exception"

    .line 176
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "--->>> \u6784\u5efa\u96f6\u53f7\u62a5\u6587\u5931\u8d25."

    .line 177
    invoke-static {v0, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p1, "--->>> \u6784\u5efa\u96f6\u53f7\u62a5\u6587 \u6210\u529f!!!"

    .line 180
    invoke-static {v0, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/umeng/commonsdk/listener/OnGetOaidListener;)V
    .locals 2

    if-nez p0, :cond_0

    return-void

    .line 273
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    .line 274
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/umeng/commonsdk/internal/c$2;

    invoke-direct {v1, p0, p1}, Lcom/umeng/commonsdk/internal/c$2;-><init>(Landroid/content/Context;Lcom/umeng/commonsdk/listener/OnGetOaidListener;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 282
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static b()Ljava/lang/String;
    .locals 3

    .line 145
    sget-object v0, Lcom/umeng/commonsdk/internal/c;->i:Ljava/lang/Class;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/umeng/commonsdk/internal/c;->j:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_0

    sget-object v2, Lcom/umeng/commonsdk/internal/c;->l:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 147
    :try_start_0
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 149
    sget-object v1, Lcom/umeng/commonsdk/internal/c;->l:Ljava/lang/reflect/Method;

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method private b(Landroid/content/Context;)V
    .locals 5

    const-string v0, "umid"

    :try_start_0
    const-string v1, ""

    .line 190
    invoke-static {p1, v0, v1}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->imprintProperty(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 191
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "appkey"

    .line 192
    invoke-static {v3}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p1}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getInstance(Landroid/content/Context;)Lcom/umeng/commonsdk/service/UMGlobalContext;

    move-result-object v4

    invoke-virtual {v4}, Lcom/umeng/commonsdk/service/UMGlobalContext;->getAppkey()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 193
    invoke-static {v0}, Lcom/umeng/commonsdk/statistics/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 195
    sget-object v0, Lcom/umeng/commonsdk/statistics/UMServerURL;->SILENT_HEART_BEAT:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {p1, v2, v1, v0}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->buildSilentEnvelopeWithExtHeader(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, "MobclickRT"

    if-eqz p1, :cond_0

    :try_start_1
    const-string v1, "exception"

    .line 196
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "--->>> \u6784\u5efa\u5fc3\u8df3\u62a5\u6587\u5931\u8d25."

    .line 197
    invoke-static {v0, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const-string p1, "--->>> \u6784\u5efa\u5fc3\u8df3\u62a5\u6587 \u6210\u529f!!!"

    .line 200
    invoke-static {v0, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    return-void
.end method

.method public static c()V
    .locals 6

    .line 106
    :try_start_0
    const-class v0, Lcom/umeng/umzid/ZIDManager;

    .line 108
    sput-object v0, Lcom/umeng/commonsdk/internal/c;->i:Ljava/lang/Class;

    const-string v1, "getInstance"

    const/4 v2, 0x0

    .line 109
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 111
    sput-object v0, Lcom/umeng/commonsdk/internal/c;->j:Ljava/lang/reflect/Method;

    .line 113
    :cond_0
    sget-object v0, Lcom/umeng/commonsdk/internal/c;->i:Ljava/lang/Class;

    const-string v1, "getZID"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Class;

    const-class v4, Landroid/content/Context;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 115
    sput-object v0, Lcom/umeng/commonsdk/internal/c;->k:Ljava/lang/reflect/Method;

    .line 117
    :cond_1
    sget-object v0, Lcom/umeng/commonsdk/internal/c;->i:Ljava/lang/Class;

    const-string v1, "getSDKVersion"

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 119
    sput-object v0, Lcom/umeng/commonsdk/internal/c;->l:Ljava/lang/reflect/Method;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_2
    return-void
.end method

.method public static c(Landroid/content/Context;)V
    .locals 2

    .line 234
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/umeng/commonsdk/internal/c$1;

    invoke-direct {v1, p0}, Lcom/umeng/commonsdk/internal/c$1;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 266
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method private d()V
    .locals 12

    .line 208
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/analytics/pro/ao;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/ao;

    move-result-object v0

    const-string v1, "stf"

    .line 209
    invoke-virtual {v0, v1}, Lcom/umeng/analytics/pro/ao;->a(Ljava/lang/String;)Lcom/umeng/analytics/pro/ap;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v3, "--->>> [\u6709\u72b6\u6001]\u4e8c\u7ea7\u7f13\u5b58\u8bb0\u5f55\u6784\u5efa\u6210\u771f\u6b63\u4fe1\u5c01\u3002"

    const-string v4, "MobclickRT"

    .line 211
    invoke-static {v4, v3}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    :try_start_0
    iget-object v3, v2, Lcom/umeng/analytics/pro/ap;->a:Ljava/lang/String;

    .line 214
    iget-object v10, v2, Lcom/umeng/analytics/pro/ap;->b:Ljava/lang/String;

    .line 215
    new-instance v7, Lorg/json/JSONObject;

    iget-object v5, v2, Lcom/umeng/analytics/pro/ap;->c:Ljava/lang/String;

    invoke-direct {v7, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 216
    new-instance v8, Lorg/json/JSONObject;

    iget-object v5, v2, Lcom/umeng/analytics/pro/ap;->d:Ljava/lang/String;

    invoke-direct {v8, v5}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 217
    iget-object v9, v2, Lcom/umeng/analytics/pro/ap;->e:Ljava/lang/String;

    .line 218
    iget-object v11, v2, Lcom/umeng/analytics/pro/ap;->f:Ljava/lang/String;

    .line 220
    new-instance v5, Lcom/umeng/commonsdk/statistics/b;

    invoke-direct {v5}, Lcom/umeng/commonsdk/statistics/b;-><init>()V

    .line 221
    iget-object v2, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual/range {v5 .. v11}, Lcom/umeng/commonsdk/statistics/b;->a(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v5, "exception"

    .line 222
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "--->>> [\u6709\u72b6\u6001]\u4e8c\u7ea7\u7f13\u5b58\u8bb0\u5f55\u6784\u5efa\u771f\u6b63\u4fe1\u5c01 \u5931\u8d25\u3002\u5220\u9664\u4e8c\u7ea7\u7f13\u5b58\u8bb0\u5f55"

    .line 223
    invoke-static {v4, v2}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v2, "--->>> [\u6709\u72b6\u6001]\u4e8c\u7ea7\u7f13\u5b58\u8bb0\u5f55\u6784\u5efa\u771f\u6b63\u4fe1\u5c01 \u6210\u529f! \u5220\u9664\u4e8c\u7ea7\u7f13\u5b58\u8bb0\u5f55\u3002"

    .line 225
    invoke-static {v4, v2}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 227
    :goto_0
    invoke-virtual {v0, v1, v3}, Lcom/umeng/analytics/pro/ao;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    invoke-virtual {v0}, Lcom/umeng/analytics/pro/ao;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    return-void
.end method

.method public static d(Landroid/content/Context;)V
    .locals 1

    const-string v0, "header_device_oaid"

    .line 289
    invoke-static {v0}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 291
    new-instance v0, Lcom/umeng/commonsdk/internal/c$3;

    invoke-direct {v0, p0}, Lcom/umeng/commonsdk/internal/c$3;-><init>(Landroid/content/Context;)V

    .line 313
    invoke-static {p0, v0}, Lcom/umeng/commonsdk/internal/c;->a(Landroid/content/Context;Lcom/umeng/commonsdk/listener/OnGetOaidListener;)V

    :cond_0
    return-void
.end method

.method private e()V
    .locals 2

    .line 323
    sget-boolean v0, Lcom/umeng/commonsdk/internal/c;->m:Z

    const-string v1, "header_device_oaid"

    if-nez v0, :cond_0

    .line 324
    invoke-static {v1}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    .line 326
    sput-boolean v0, Lcom/umeng/commonsdk/internal/c;->m:Z

    .line 327
    new-instance v0, Lcom/umeng/commonsdk/internal/c$4;

    invoke-direct {v0, p0}, Lcom/umeng/commonsdk/internal/c$4;-><init>(Lcom/umeng/commonsdk/internal/c;)V

    .line 351
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/umeng/commonsdk/internal/c;->a(Landroid/content/Context;Lcom/umeng/commonsdk/listener/OnGetOaidListener;)V

    return-void

    .line 355
    :cond_0
    invoke-static {v1}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 356
    sput-boolean v0, Lcom/umeng/commonsdk/internal/c;->m:Z

    :cond_1
    return-void
.end method

.method private e(Landroid/content/Context;)V
    .locals 11

    if-nez p1, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v0, "um_rtd_conf"

    const-string v1, "debugkey"

    .line 406
    invoke-static {p1, v0, v1}, Lcom/umeng/common/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 407
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "startTime"

    .line 408
    invoke-static {p1, v0, v3}, Lcom/umeng/common/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "period"

    .line 409
    invoke-static {p1, v0, v4}, Lcom/umeng/common/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 412
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    const-wide/16 v6, 0x0

    if-nez v5, :cond_1

    .line 414
    :try_start_0
    invoke-static {v3}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    :cond_1
    move-wide v8, v6

    .line 419
    :goto_0
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 421
    :try_start_1
    invoke-static {v4}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    :cond_2
    move-wide v3, v6

    :goto_1
    const-string v5, "MobclickRT"

    cmp-long v10, v8, v6

    if-eqz v10, :cond_5

    cmp-long v10, v3, v6

    if-nez v10, :cond_3

    goto :goto_2

    .line 435
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v6, v8

    const-wide/32 v8, 0xea60

    mul-long v3, v3, v8

    cmp-long v8, v6, v3

    if-lez v8, :cond_4

    const-string v1, "--->>> [RTD]\u672c\u5730\u7f13\u5b58dk\u503c\u5df2\u7ecf\u8d85\u65f6\uff0c\u6e05\u9664\u7f13\u5b58\u6570\u636e\u3002"

    .line 438
    invoke-static {v5, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 439
    invoke-static {p1, v0}, Lcom/umeng/common/b;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 440
    invoke-static {}, Lcom/umeng/analytics/AnalyticsConfig;->isRealTimeDebugMode()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 441
    invoke-static {}, Lcom/umeng/analytics/AnalyticsConfig;->turnOffRealTimeDebug()V

    goto :goto_3

    .line 445
    :cond_4
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 446
    invoke-virtual {p1, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    invoke-static {}, Lcom/umeng/analytics/AnalyticsConfig;->isRealTimeDebugMode()Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "--->>> [RTD]\u672c\u5730\u7f13\u5b58dk\u503c\u5728\u6709\u6548\u671f\u5185\uff0c\u5207\u6362\u5230\u57cb\u70b9\u9a8c\u8bc1\u6a21\u5f0f\u3002"

    .line 448
    invoke-static {v5, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 449
    invoke-static {p1}, Lcom/umeng/analytics/AnalyticsConfig;->turnOnRealTimeDebug(Ljava/util/Map;)V

    goto :goto_3

    :cond_5
    :goto_2
    const-string v1, "--->>> [RTD]\u672c\u5730\u7f13\u5b58startTime\u6216\u8005duration\u503c\u65e0\u6548\uff0c\u6e05\u9664\u7f13\u5b58\u6570\u636e"

    .line 428
    invoke-static {v5, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 429
    invoke-static {p1, v0}, Lcom/umeng/common/b;->a(Landroid/content/Context;Ljava/lang/String;)V

    :cond_6
    :goto_3
    return-void
.end method

.method private f()V
    .locals 2

    const-string v0, "header_device_oaid"

    .line 368
    invoke-static {v0}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 372
    sput-boolean v0, Lcom/umeng/commonsdk/internal/c;->m:Z

    .line 373
    invoke-static {}, Lcom/umeng/commonsdk/UMConfigureImpl;->registerInterruptFlag()V

    .line 375
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {v1}, Lcom/umeng/commonsdk/UMConfigureImpl;->init(Landroid/content/Context;)V

    .line 377
    sget v1, Lcom/umeng/commonsdk/internal/c;->f:I

    add-int/2addr v1, v0

    sput v1, Lcom/umeng/commonsdk/internal/c;->f:I

    const-string v0, "MobclickRT"

    const-string v1, "--->>> \u8981\u8bfb\u53d6 oaid\uff0c\u9700\u7b49\u5f85\u8bfb\u53d6\u7ed3\u679c."

    .line 379
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 382
    new-instance v0, Lcom/umeng/commonsdk/internal/c$5;

    invoke-direct {v0, p0}, Lcom/umeng/commonsdk/internal/c$5;-><init>(Lcom/umeng/commonsdk/internal/c;)V

    .line 395
    invoke-static {v0}, Lcom/umeng/commonsdk/UMConfigureImpl;->registerMessageSendListener(Lcom/umeng/commonsdk/utils/onMessageSendListener;)V

    .line 397
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/commonsdk/internal/c;->c(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method private f(Landroid/content/Context;)V
    .locals 11

    .line 883
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 884
    invoke-static {p1}, Lcom/umeng/commonsdk/utils/UMUtils;->getAppkey(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    :try_start_0
    const-string v1, "com.umeng.umzid.ZIDManager"

    .line 886
    invoke-static {v1}, Lcom/umeng/commonsdk/internal/c;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getInstance"

    const/4 v3, 0x0

    .line 887
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 889
    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v4, "com.umeng.umzid.IZIDCompletionCallback"

    .line 891
    invoke-static {v4}, Lcom/umeng/commonsdk/internal/c;->a(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    const-string v5, "init"

    const/4 v6, 0x3

    new-array v7, v6, [Ljava/lang/Class;

    .line 892
    const-class v8, Landroid/content/Context;

    const/4 v9, 0x0

    aput-object v8, v7, v9

    const-class v8, Ljava/lang/String;

    const/4 v10, 0x1

    aput-object v8, v7, v10

    const/4 v8, 0x2

    aput-object v4, v7, v8

    invoke-virtual {v1, v5, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    if-eqz v1, :cond_0

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v0, v4, v9

    aput-object p1, v4, v10

    aput-object v3, v4, v8

    .line 895
    invoke-virtual {v1, v2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method private g()V
    .locals 1

    .line 906
    sget v0, Lcom/umeng/commonsdk/internal/c;->f:I

    if-gtz v0, :cond_0

    .line 907
    invoke-direct {p0}, Lcom/umeng/commonsdk/internal/c;->h()V

    .line 910
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/umeng/commonsdk/internal/c;->f(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public static g(Landroid/content/Context;)V
    .locals 3

    .line 915
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    .line 916
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p0, Ljava/io/File;->separator:Ljava/lang/String;

    const-string v2, "umeng_zcfg_flag"

    .line 0
    invoke-static {v1, p0, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 916
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 917
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p0

    if-nez p0, :cond_0

    .line 919
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method private h()V
    .locals 4

    const-string v0, "MobclickRT"

    const-string v1, "--->>> \u771f\u5b9e\u6784\u5efa\u6761\u4ef6\u6ee1\u8db3\uff0c\u5f00\u59cb\u6784\u5efa\u4e1a\u52a1\u4fe1\u5c01\u3002"

    .line 926
    invoke-static {v0, v1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 927
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/commonsdk/utils/UMUtils;->isMainProgress(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 928
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/commonsdk/internal/c;->g(Landroid/content/Context;)V

    .line 933
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/commonsdk/a;->a(Landroid/content/Context;)V

    .line 935
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    const/16 v1, 0x2010

    .line 936
    invoke-static {v0}, Lcom/umeng/analytics/CoreProtocol;->getInstance(Landroid/content/Context;)Lcom/umeng/analytics/CoreProtocol;

    move-result-object v2

    const/4 v3, 0x0

    .line 935
    invoke-static {v0, v1, v2, v3}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 939
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 940
    invoke-static {v0}, Lcom/umeng/commonsdk/internal/b;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/umeng/commonsdk/internal/b;->a()Lcom/umeng/commonsdk/internal/c;

    move-result-object v1

    const v2, 0x8011

    .line 939
    invoke-static {v0, v2, v1, v3}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 5

    .line 130
    sget-object v0, Lcom/umeng/commonsdk/internal/c;->i:Ljava/lang/Class;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/umeng/commonsdk/internal/c;->j:Ljava/lang/reflect/Method;

    if-eqz v1, :cond_0

    sget-object v2, Lcom/umeng/commonsdk/internal/c;->k:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    .line 132
    :try_start_0
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 134
    sget-object v1, Lcom/umeng/commonsdk/internal/c;->k:Ljava/lang/reflect/Method;

    iget-object v2, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    invoke-virtual {v1, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public removeCacheData(Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public setupReportData(J)Lorg/json/JSONObject;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public workEvent(Ljava/lang/Object;I)V
    .locals 11

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "[internal] workEvent"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "walle"

    .line 458
    invoke-static {v2, v1}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 461
    invoke-static {}, Lcom/umeng/commonsdk/utils/c;->a()Z

    move-result v1

    const-string v4, "MobclickRT"

    if-eqz v1, :cond_2

    const p1, 0x8022

    if-ne p1, p2, :cond_f

    const-string p1, "--->>> \u9759\u9ed8\u6a21\u5f0f\uff1a\u8fdb\u5165\u5fc3\u8df3\u5904\u7406\u903b\u8f91!"

    .line 465
    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 467
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    .line 468
    iget-object v0, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/umeng/commonsdk/utils/c;->b(Landroid/content/Context;)J

    move-result-wide v0

    .line 469
    iget-object v2, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {v2}, Lcom/umeng/commonsdk/utils/c;->e(Landroid/content/Context;)Z

    move-result v2

    .line 470
    iget-object v3, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {v3}, Lcom/umeng/commonsdk/utils/c;->a(Landroid/content/Context;)I

    move-result v3

    .line 471
    invoke-static {v0, v1, p1, p2, v3}, Lcom/umeng/commonsdk/utils/c;->a(JJI)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 477
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    sget-object p2, Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;->U_Silent:Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;

    invoke-static {p1, p2}, Lcom/umeng/commonsdk/framework/UMFrUtils;->hasEnvelopeFile(Landroid/content/Context;Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "--->>> \u6784\u5efa\u9759\u9ed8\u5fc3\u8df3\u4fe1\u5c01."

    .line 478
    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 479
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-direct {p0, p1}, Lcom/umeng/commonsdk/internal/c;->b(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    const-string p1, "--->>> \u9759\u9ed8\u5fc3\u8df3\u4fe1\u5c01\u6587\u4ef6\u5df2\u5b58\u5728\uff0c\u5c1d\u8bd5\u53d1\u9001\u4e4b!"

    .line 481
    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 483
    :goto_0
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->registerNetReceiver(Landroid/content/Context;)V

    :cond_1
    if-nez v2, :cond_f

    const-string p1, "--->>> send REBUILD_DB msg in silent mode."

    .line 490
    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 491
    iget-object v5, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 492
    invoke-static {v5}, Lcom/umeng/analytics/CoreProtocol;->getInstance(Landroid/content/Context;)Lcom/umeng/analytics/CoreProtocol;

    move-result-object v7

    const/4 v8, 0x0

    const-wide/16 v9, 0x7d0

    const/16 v6, 0x1105

    .line 491
    invoke-static/range {v5 .. v10}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;J)V

    return-void

    :cond_2
    const/4 v1, 0x2

    .line 500
    const-class v5, Ljava/lang/String;

    const-string v6, "[internal] workEvent send envelope"

    const-string v7, "um_policy_grant"

    const-string v8, "umeng_policy_result_flag"

    const-class v9, Landroid/content/Context;

    const-string v10, "policyGrantResult"

    packed-switch p2, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_2

    .line 864
    :pswitch_1
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-direct {p0, p1}, Lcom/umeng/commonsdk/internal/c;->e(Landroid/content/Context;)V

    return-void

    .line 831
    :pswitch_2
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    const-string p2, "connectivity"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    if-eqz p1, :cond_5

    .line 834
    :try_start_0
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 836
    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "--->>> network state changed: Available"

    .line 838
    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 839
    invoke-static {v0}, Lcom/umeng/commonsdk/framework/a;->a(Z)V

    .line 840
    invoke-static {v0}, Lcom/umeng/commonsdk/stateless/b;->a(Z)V

    goto/16 :goto_2

    :cond_3
    const-string p1, "--->>> network state changed: unAvailable"

    .line 842
    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 843
    invoke-static {v3}, Lcom/umeng/commonsdk/framework/a;->a(Z)V

    .line 844
    invoke-static {v3}, Lcom/umeng/commonsdk/stateless/b;->a(Z)V

    goto/16 :goto_2

    :cond_4
    const-string p1, "--->>> NetworkInfo is null!"

    .line 847
    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 848
    invoke-static {v3}, Lcom/umeng/commonsdk/framework/a;->a(Z)V

    .line 849
    invoke-static {v3}, Lcom/umeng/commonsdk/stateless/b;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_2

    .line 852
    :catchall_0
    invoke-static {v3}, Lcom/umeng/commonsdk/framework/a;->a(Z)V

    .line 853
    invoke-static {v3}, Lcom/umeng/commonsdk/stateless/b;->a(Z)V

    goto/16 :goto_2

    :cond_5
    const-string p1, "--->>> ConnectivityManager is null!"

    .line 856
    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 857
    invoke-static {v3}, Lcom/umeng/commonsdk/framework/a;->a(Z)V

    .line 858
    invoke-static {v3}, Lcom/umeng/commonsdk/stateless/b;->a(Z)V

    goto/16 :goto_2

    .line 698
    :pswitch_3
    :try_start_1
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/commonsdk/debug/SelfChecker;->doCheck(Landroid/content/Context;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    return-void

    .line 820
    :pswitch_4
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    .line 821
    new-instance p2, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 0
    invoke-static {v0, p1, v8}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 821
    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 822
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_f

    .line 824
    :try_start_2
    invoke-virtual {p2}, Ljava/io/File;->delete()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    goto/16 :goto_2

    :pswitch_5
    const-string p2, "--->>> \u4fdd\u5b58preInit\u6267\u884c\u7ed3\u679c\u53ca\u6388\u6743API\u662f\u5426\u8c03\u7528\u7ed3\u679c."

    .line 780
    invoke-static {v4, p2}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 781
    instance-of p2, p1, Lorg/json/JSONObject;

    if-eqz p2, :cond_f

    .line 782
    check-cast p1, Lorg/json/JSONObject;

    const-string p2, "preInitInvoked"

    .line 786
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 788
    :try_start_3
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p2

    const-string v0, "policyGrantInvoked"

    .line 789
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 790
    invoke-virtual {p1, v10}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    .line 791
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 792
    invoke-virtual {v1, v7, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 794
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    if-eqz v1, :cond_6

    const-string v2, "preInitInvokedFlag"

    .line 796
    invoke-interface {v1, v2, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    const-string p2, "policyGrantInvokedFlag"

    .line 797
    invoke-interface {v1, p2, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 798
    invoke-interface {v1, v10, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 799
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 803
    :cond_6
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    .line 804
    new-instance p2, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 805
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_f

    .line 807
    invoke-virtual {p2}, Ljava/io/File;->createNewFile()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto/16 :goto_2

    :pswitch_6
    const-string p2, "--->>> \u4fdd\u5b58\u9690\u79c1\u6388\u6743\u7ed3\u679c."

    .line 764
    invoke-static {v4, p2}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 766
    :try_start_4
    instance-of p2, p1, Ljava/lang/Integer;

    if-eqz p2, :cond_f

    .line 767
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 768
    iget-object p2, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    .line 769
    invoke-virtual {p2, v7, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p2

    if-eqz p2, :cond_f

    .line 771
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    invoke-interface {p2, v10, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    return-void

    :pswitch_7
    const-string p1, "--->>> \u6b63\u5e38\u51b7\u542f\u52a8\u6d41\u7a0b\uff0c\u63a5\u6536\u5230\u4e91\u63a7\u914d\u7f6e\u52a0\u8f7d\u6210\u529f\u901a\u77e5\u3002"

    .line 661
    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 662
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/commonsdk/internal/c;->d(Landroid/content/Context;)V

    .line 663
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/commonsdk/a;->a(Landroid/content/Context;)V

    .line 666
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-direct {p0, p1}, Lcom/umeng/commonsdk/internal/c;->f(Landroid/content/Context;)V

    return-void

    :pswitch_8
    const-string p1, "--->>> \u6210\u529f\u63a5\u6536\u5230(OAID)\u8bfb\u53d6\u7ed3\u675f\u901a\u77e5\u3002"

    .line 649
    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 650
    sget p1, Lcom/umeng/commonsdk/internal/c;->f:I

    sub-int/2addr p1, v0

    sput p1, Lcom/umeng/commonsdk/internal/c;->f:I

    .line 651
    invoke-direct {p0}, Lcom/umeng/commonsdk/internal/c;->g()V

    return-void

    :pswitch_9
    const-string p1, "--->>> \u4e91\u63a7\u4e0b\u53d1\u53c2\u6570\u66f4\u65b0\uff0c\u89e6\u53d1 \u4f2a\u51b7\u542f\u52a8\u3002"

    .line 747
    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 748
    invoke-static {}, Lcom/umeng/commonsdk/statistics/b;->a()V

    .line 749
    invoke-direct {p0}, Lcom/umeng/commonsdk/internal/c;->e()V

    const-string p1, "header_foreground_count"

    .line 750
    invoke-static {p1}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 751
    invoke-static {}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->eventHasExist()Z

    move-result p1

    if-nez p1, :cond_7

    const-string p1, "--->>> \u4e91\u63a7\u4e0b\u53d1\u53c2\u6570\u66f4\u65b0 \u524d\u53f0\u8ba1\u6570\u5668\u529f\u80fd \u6253\u5f00\uff0c\u89e6\u53d1 5\u79d2\u5468\u671f\u68c0\u67e5\u673a\u5236"

    .line 752
    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 753
    iget-object v5, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 754
    invoke-static {v5}, Lcom/umeng/analytics/CoreProtocol;->getInstance(Landroid/content/Context;)Lcom/umeng/analytics/CoreProtocol;

    move-result-object v7

    const/4 v8, 0x0

    const-wide/16 v9, 0x1388

    const/16 v6, 0x2015

    .line 753
    invoke-static/range {v5 .. v10}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEventEx(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;J)V

    :cond_7
    const-string p1, "header_first_resume"

    .line 757
    invoke-static {p1}, Lcom/umeng/commonsdk/config/FieldManager;->allow(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_f

    const-string p1, "--->>> \u4e91\u63a7\u4e0b\u53d1\u53c2\u6570\u66f4\u65b0 FirstResume\u529f\u80fd \u6253\u5f00\uff0c\u89e6\u53d1 trigger"

    .line 758
    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 759
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/analytics/pro/l;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/l;

    move-result-object p1

    iget-object p2, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-virtual {p1, p2}, Lcom/umeng/analytics/pro/l;->b(Landroid/content/Context;)V

    return-void

    :pswitch_a
    :try_start_5
    const-string p1, "--->>> \u89e6\u53d12\u53f7\u4ed3\u9057\u7559\u4fe1\u5c01\u68c0\u67e5\u52a8\u4f5c\u3002"

    .line 710
    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 712
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {p1, v3}, Lcom/umeng/commonsdk/stateless/d;->a(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object p1

    .line 713
    iget-object p2, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {p2, v0}, Lcom/umeng/commonsdk/stateless/d;->a(Landroid/content/Context;Z)Ljava/lang/String;

    move-result-object p2

    .line 714
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    .line 715
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 716
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result p1

    if-eqz p1, :cond_8

    const/4 v3, 0x1

    .line 722
    :cond_8
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_9

    .line 723
    new-instance p1, Ljava/io/File;

    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 725
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result p1

    if-eqz p1, :cond_9

    goto :goto_1

    :cond_9
    move v0, v3

    :goto_1
    if-eqz v0, :cond_b

    .line 731
    invoke-static {}, Lcom/umeng/commonsdk/stateless/b;->a()Z

    move-result p1

    if-nez p1, :cond_a

    .line 732
    new-instance p1, Lcom/umeng/commonsdk/stateless/b;

    iget-object p2, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-direct {p1, p2}, Lcom/umeng/commonsdk/stateless/b;-><init>(Landroid/content/Context;)V

    .line 733
    invoke-static {}, Lcom/umeng/commonsdk/stateless/b;->b()V

    return-void

    :cond_a
    const-string p1, "--->>> \u89e6\u53d12\u53f7\u4ed3\u9057\u7559\u4fe1\u5c01\u68c0\u67e5\uff0cSender\u5df2\u521b\u5efa\uff0c\u4e0d\u9700\u8981\u5904\u7406\u3002"

    .line 735
    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_b
    const-string p1, "--->>> \u89e6\u53d12\u53f7\u4ed3\u9057\u7559\u4fe1\u5c01\u68c0\u67e5\uff0c\u6ca1\u6709\u9700\u8981\u5904\u7406\u7684\u76ee\u5f55\uff0c\u4e0d\u9700\u8981\u5904\u7406\u3002"

    .line 738
    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    return-void

    .line 705
    :pswitch_b
    iget-object p2, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {p2, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->buildEnvelope(Landroid/content/Context;Ljava/lang/Object;)V

    return-void

    :pswitch_c
    const-string p1, "--->>> [\u6709\u72b6\u6001]\u63a5\u6536\u5230\u6d88\u8d39\u4e8c\u7ea7\u7f13\u5b58\u6570\u636e\u901a\u77e5."

    .line 670
    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 671
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {p1}, Lcom/umeng/analytics/pro/ao;->a(Landroid/content/Context;)Lcom/umeng/analytics/pro/ao;

    move-result-object p1

    invoke-virtual {p1}, Lcom/umeng/analytics/pro/ao;->c()Z

    move-result p1

    if-eqz p1, :cond_c

    const-string p1, "--->>> [\u6709\u72b6\u6001]\u5df2\u6d88\u8d39\u5b8c\u6bd5,\u4e8c\u7ea7\u7f13\u5b58\u6570\u636e\u5e93\u4e3a\u7a7a."

    .line 672
    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 676
    :cond_c
    invoke-direct {p0}, Lcom/umeng/commonsdk/internal/c;->d()V

    const p1, 0x8011

    .line 678
    invoke-static {p1}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->eventHasExist(I)Z

    move-result p2

    if-nez p2, :cond_f

    .line 679
    iget-object p2, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    .line 680
    invoke-static {p2}, Lcom/umeng/commonsdk/internal/b;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/umeng/commonsdk/internal/b;->a()Lcom/umeng/commonsdk/internal/c;

    move-result-object v0

    const/4 v1, 0x0

    .line 679
    invoke-static {p2, p1, v0, v1}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    return-void

    :pswitch_d
    const-string p1, "--->>> \u96f6\u53f7\u62a5\u6587\u6d41\u7a0b\uff0c\u63a5\u6536\u5230\u4e91\u63a7\u914d\u7f6e\u52a0\u8f7d\u6210\u529f\u901a\u77e5(\u6210\u529f\u6536\u5230\u96f6\u53f7\u62a5\u6587\u5e94\u7b54)\u3002"

    .line 654
    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 655
    invoke-direct {p0}, Lcom/umeng/commonsdk/internal/c;->f()V

    .line 656
    sget p1, Lcom/umeng/commonsdk/internal/c;->f:I

    sub-int/2addr p1, v0

    sput p1, Lcom/umeng/commonsdk/internal/c;->f:I

    .line 657
    invoke-direct {p0}, Lcom/umeng/commonsdk/internal/c;->g()V

    return-void

    .line 687
    :pswitch_e
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    sget-object p2, Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;->U_ZeroEnv:Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;

    invoke-static {p1, p2}, Lcom/umeng/commonsdk/framework/UMFrUtils;->hasEnvelopeFile(Landroid/content/Context;Lcom/umeng/commonsdk/framework/UMLogDataProtocol$UMBusinessType;)Z

    move-result p1

    if-nez p1, :cond_d

    const-string p1, "--->>> \u6784\u5efa\u96f6\u53f7\u62a5\u6587"

    .line 688
    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 689
    iget-object p1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-direct {p0, p1}, Lcom/umeng/commonsdk/internal/c;->a(Landroid/content/Context;)V

    return-void

    :cond_d
    const-string p1, "--->>> \u96f6\u53f7\u62a5\u6587\u4fe1\u5c01\u6587\u4ef6\u5df2\u5b58\u5728\uff0c\u5c1d\u8bd5\u53d1\u9001\u4e4b!"

    .line 691
    invoke-static {v4, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 643
    :pswitch_f
    check-cast p1, Lcom/umeng/commonsdk/vchannel/b;

    .line 645
    iget-object p2, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {p2, p1}, Lcom/umeng/commonsdk/vchannel/Sender;->handleEvent(Landroid/content/Context;Lcom/umeng/commonsdk/vchannel/b;)V

    return-void

    :pswitch_10
    :try_start_6
    new-array p1, v0, [Ljava/lang/Object;

    aput-object v6, p1, v3

    .line 542
    invoke-static {v2, p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 543
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    const-string p2, "i_sdk_v"

    const-string v1, "1.2.0"

    .line 544
    invoke-virtual {p1, p2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 545
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 546
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v4, "inner"

    .line 547
    invoke-virtual {p2, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 548
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {v1, p1, p2}, Lcom/umeng/commonsdk/framework/UMEnvelopeBuild;->buildEnvelopeWithExtHeader(Landroid/content/Context;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_f

    const-string p2, "exception"

    .line 549
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_f

    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "[internal] workEvent send envelope back, result is ok"

    aput-object p2, p1, v3

    .line 551
    invoke-static {v2, p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    return-void

    .line 634
    :pswitch_11
    iget-object p2, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    const-string v0, "info"

    .line 635
    invoke-virtual {p2, v0, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p2

    if-eqz p2, :cond_f

    .line 637
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    const-string v0, "stat"

    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void

    .line 621
    :pswitch_12
    :try_start_7
    const-class p2, Lcom/umeng/commonsdk/internal/utils/InfoPreferenceAgent;

    const-string v2, "saveUA"

    new-array v4, v1, [Ljava/lang/Class;

    aput-object v9, v4, v3

    aput-object v5, v4, v0

    .line 623
    invoke-virtual {p2, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 624
    check-cast p1, Ljava/lang/String;

    .line 625
    iget-object v4, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v4, v1, v3

    aput-object p1, v1, v0

    invoke-virtual {v2, p2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/ClassNotFoundException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    return-void

    :pswitch_13
    if-eqz p1, :cond_f

    .line 560
    instance-of p2, p1, Lcom/umeng/commonsdk/internal/utils/b;

    if-eqz p2, :cond_f

    .line 561
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 562
    check-cast p1, Lcom/umeng/commonsdk/internal/utils/b;

    :try_start_8
    const-string v2, "le"

    .line 564
    iget v6, p1, Lcom/umeng/commonsdk/internal/utils/b;->a:I

    invoke-virtual {p2, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v2, "vol"

    .line 565
    iget v6, p1, Lcom/umeng/commonsdk/internal/utils/b;->b:I

    invoke-virtual {p2, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v2, "temp"

    .line 566
    iget v6, p1, Lcom/umeng/commonsdk/internal/utils/b;->c:I

    invoke-virtual {p2, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v2, "st"

    .line 567
    iget v6, p1, Lcom/umeng/commonsdk/internal/utils/b;->d:I

    invoke-virtual {p2, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v2, "ct"

    .line 568
    iget v6, p1, Lcom/umeng/commonsdk/internal/utils/b;->e:I

    invoke-virtual {p2, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v2, "ts"

    .line 569
    iget-wide v6, p1, Lcom/umeng/commonsdk/internal/utils/b;->f:J

    invoke-virtual {p2, v2, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 572
    :catchall_1
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    .line 573
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v2, "battery info: "

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v4, p2}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 575
    :try_start_9
    const-class p2, Lcom/umeng/commonsdk/internal/utils/UMInternalUtilsAgent;

    const-string v2, "saveBattery"

    new-array v4, v1, [Ljava/lang/Class;

    aput-object v9, v4, v3

    aput-object v5, v4, v0

    .line 577
    invoke-virtual {p2, v2, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    .line 578
    iget-object v4, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    new-array v1, v1, [Ljava/lang/Object;

    aput-object v4, v1, v3

    aput-object p1, v1, v0

    invoke-virtual {v2, p2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_9
    .catch Ljava/lang/ClassNotFoundException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_2

    :pswitch_14
    :try_start_a
    new-array p1, v0, [Ljava/lang/Object;

    aput-object v6, p1, v3

    .line 503
    invoke-static {v2, p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    .line 507
    :try_start_b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    .line 508
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    invoke-static {v1}, Lcom/umeng/analytics/pro/aa;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 509
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 510
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_e

    .line 511
    iget-object v2, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    const-string v6, "umeng_sp_oaid"

    invoke-virtual {v2, v6, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    if-eqz v2, :cond_e

    .line 514
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v6, "key_umeng_sp_oaid"

    .line 515
    invoke-interface {v2, v6, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    const-string v1, "key_umeng_sp_oaid_required_time"

    .line 516
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    sub-long/2addr v4, p1

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ""

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 517
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 526
    :catchall_2
    :cond_e
    :try_start_c
    const-class p1, Lcom/umeng/commonsdk/internal/UMInternalManagerAgent;

    const-string p2, "sendInternalEnvelopeByStateful2"

    new-array v1, v0, [Ljava/lang/Class;

    aput-object v9, v1, v3

    .line 528
    invoke-virtual {p1, p2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p2

    .line 529
    iget-object v1, p0, Lcom/umeng/commonsdk/internal/c;->e:Landroid/content/Context;

    new-array v0, v0, [Ljava/lang/Object;

    aput-object v1, v0, v3

    invoke-virtual {p2, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_c
    .catch Ljava/lang/ClassNotFoundException; {:try_start_c .. :try_end_c} :catch_0
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :catch_0
    :catchall_3
    :cond_f
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x8001
        :pswitch_14
        :pswitch_0
        :pswitch_13
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_0
        :pswitch_f
        :pswitch_0
        :pswitch_e
        :pswitch_0
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
