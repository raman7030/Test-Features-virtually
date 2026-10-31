.class public Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;
.super Ljava/lang/Object;
.source "ImprintHandler.java"

# interfaces
.implements Lcom/umeng/commonsdk/utils/FileLockCallback;


# static fields
.field public static final a:Ljava/lang/String; = "ImprintHandler"

.field public static b:Ljava/lang/Object; = null

.field public static final c:Ljava/lang/String; = ".imprint"

.field public static final d:[B

.field public static f:Ljava/util/Map; = null

.field public static g:Ljava/lang/Object; = null

.field public static j:Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler; = null

.field public static k:Landroid/content/Context; = null

.field public static l:Lcom/umeng/commonsdk/utils/FileLockUtil; = null

.field public static final m:I = 0x0

.field public static final n:I = 0x1

.field public static o:Ljava/util/Map;

.field public static p:Ljava/lang/Object;


# instance fields
.field public e:Lcom/umeng/commonsdk/statistics/internal/d;

.field public h:Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;

.field public i:Lcom/umeng/commonsdk/statistics/proto/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 43
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->b:Ljava/lang/Object;

    const-string v0, "pbl0"

    .line 46
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    sput-object v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->d:[B

    .line 50
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->f:Ljava/util/Map;

    .line 51
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->g:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 55
    sput-object v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->j:Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    .line 64
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->o:Ljava/util/Map;

    .line 65
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;

    invoke-direct {v0}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;-><init>()V

    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->h:Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;

    const/4 v0, 0x0

    .line 54
    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->i:Lcom/umeng/commonsdk/statistics/proto/d;

    .line 91
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    sput-object p1, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->k:Landroid/content/Context;

    return-void
.end method

.method private a(Lcom/umeng/commonsdk/statistics/proto/d;Lcom/umeng/commonsdk/statistics/proto/d;Ljava/util/Map;)Lcom/umeng/commonsdk/statistics/proto/d;
    .locals 8

    if-nez p2, :cond_0

    return-object p1

    .line 418
    :cond_0
    invoke-virtual {p1}, Lcom/umeng/commonsdk/statistics/proto/d;->c()Ljava/util/Map;

    move-result-object v1

    .line 419
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/d;->c()Ljava/util/Map;

    move-result-object v0

    .line 423
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map$Entry;

    .line 424
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/umeng/commonsdk/statistics/proto/e;

    invoke-virtual {v0}, Lcom/umeng/commonsdk/statistics/proto/e;->d()Z

    move-result v0

    const/4 v4, 0x0

    if-eqz v0, :cond_4

    .line 425
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    .line 426
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/umeng/commonsdk/statistics/proto/e;

    iget-object v6, v0, Lcom/umeng/commonsdk/statistics/proto/e;->a:Ljava/lang/String;

    .line 428
    sget-object v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->p:Ljava/lang/Object;

    monitor-enter v0

    .line 429
    :try_start_0
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_1

    sget-object v7, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->o:Ljava/util/Map;

    invoke-interface {v7, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 430
    sget-object v7, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->o:Ljava/util/Map;

    invoke-interface {v7, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/umeng/commonsdk/statistics/internal/UMImprintPreProcessCallback;

    if-eqz v7, :cond_1

    .line 432
    invoke-interface {v7, v5, v6}, Lcom/umeng/commonsdk/statistics/internal/UMImprintPreProcessCallback;->onPreProcessImprintKey(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v4, 0x1

    .line 437
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v4, :cond_3

    .line 440
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    sget-object v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->g:Ljava/lang/Object;

    monitor-enter v0

    .line 444
    :try_start_1
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    sget-object v3, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->f:Ljava/util/Map;

    invoke-interface {v3, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 446
    sget-object v3, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->f:Ljava/util/Map;

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    if-eqz v3, :cond_2

    .line 448
    invoke-interface {p3, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    :cond_2
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_3
    const-string v0, "MobclickRT"

    .line 457
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "--->>> merge: ["

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "] should be ignored."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :catchall_1
    move-exception p1

    .line 437
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    .line 461
    :cond_4
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 463
    sget-object v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->g:Ljava/lang/Object;

    monitor-enter v0

    .line 465
    :try_start_3
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_5

    sget-object v5, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->f:Ljava/util/Map;

    invoke-interface {v5, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 467
    sget-object v5, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->f:Ljava/util/Map;

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/ArrayList;

    if-eqz v5, :cond_5

    .line 469
    :goto_1
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v4, v6, :cond_5

    .line 470
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;

    const/4 v7, 0x0

    invoke-interface {v6, v3, v7}, Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;->onImprintValueChanged(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 474
    :cond_5
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 475
    invoke-interface {v1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->h:Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;

    invoke-virtual {v0, v3}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;->a(Ljava/lang/String;)V

    goto/16 :goto_0

    :catchall_2
    move-exception p1

    .line 474
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1

    .line 480
    :cond_6
    invoke-virtual {p2}, Lcom/umeng/commonsdk/statistics/proto/d;->f()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/umeng/commonsdk/statistics/proto/d;->a(I)Lcom/umeng/commonsdk/statistics/proto/d;

    .line 481
    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->a(Lcom/umeng/commonsdk/statistics/proto/d;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/umeng/commonsdk/statistics/proto/d;->a(Ljava/lang/String;)Lcom/umeng/commonsdk/statistics/proto/d;

    return-object p1
.end method

.method private a(Ljava/io/File;)V
    .locals 3

    .line 599
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->i:Lcom/umeng/commonsdk/statistics/proto/d;

    if-nez v0, :cond_0

    goto :goto_0

    .line 604
    :cond_0
    :try_start_0
    sget-object v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->b:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 605
    :try_start_1
    new-instance v1, Lcom/umeng/analytics/pro/be;

    invoke-direct {v1}, Lcom/umeng/analytics/pro/be;-><init>()V

    iget-object v2, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->i:Lcom/umeng/commonsdk/statistics/proto/d;

    invoke-virtual {v1, v2}, Lcom/umeng/analytics/pro/be;->a(Lcom/umeng/analytics/pro/av;)[B

    move-result-object v1

    .line 607
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 610
    :try_start_2
    invoke-virtual {v2, v1}, Ljava/io/FileOutputStream;->write([B)V

    .line 611
    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 613
    :try_start_3
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->safeClose(Ljava/io/OutputStream;)V

    .line 615
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    .line 613
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->safeClose(Ljava/io/OutputStream;)V

    throw p1

    :catchall_1
    move-exception p1

    .line 615
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;)V
    .locals 6

    const-string v1, "--->>> addCallback: before add: callbacks size is: "

    const-string v2, "--->>> addCallback: before add: callbacks size is: "

    .line 110
    sget-object v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->g:Ljava/lang/Object;

    monitor-enter v0

    .line 112
    :try_start_0
    sget-object v3, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->f:Ljava/util/Map;

    invoke-interface {v3, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    .line 113
    sget-object v1, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->f:Ljava/util/Map;

    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    .line 114
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 115
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;)V

    :goto_0
    if-ge v4, v1, :cond_1

    .line 117
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-ne p1, v2, :cond_0

    const-string p0, "--->>> addCallback: callback has exist, just exit"

    .line 118
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 120
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 123
    :cond_1
    :try_start_2
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "--->>> addCallback: after add: callbacks size is: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;)V

    goto :goto_2

    .line 126
    :cond_2
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 127
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 128
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;)V

    :goto_1
    if-ge v4, v3, :cond_4

    .line 130
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-ne p1, v1, :cond_3

    const-string p0, "--->>> addCallback: callback has exist, just exit"

    .line 131
    invoke-static {p0}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 133
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return-void

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 136
    :cond_4
    :try_start_4
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "--->>> addCallback: after add: callbacks size is: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;)V

    .line 138
    sget-object p1, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->f:Ljava/util/Map;

    invoke-interface {p1, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    .line 141
    :try_start_5
    sget-object p1, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->k:Landroid/content/Context;

    invoke-static {p1, p0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 143
    :goto_2
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    if-nez p1, :cond_1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1

    .line 409
    :cond_1
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public static b(Ljava/lang/String;Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;)V
    .locals 5

    const-string v1, "--->>> removeCallback: before remove: callbacks size is: "

    .line 147
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    if-nez p1, :cond_0

    goto/16 :goto_3

    .line 151
    :cond_0
    sget-object v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->g:Ljava/lang/Object;

    monitor-enter v0

    .line 153
    :try_start_0
    sget-object v2, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->f:Ljava/util/Map;

    invoke-interface {v2, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 154
    sget-object v2, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->f:Ljava/util/Map;

    invoke-interface {v2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    .line 155
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_3

    .line 156
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 157
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v3, :cond_2

    .line 160
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-ne p1, v4, :cond_1

    .line 161
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "--->>> removeCallback: remove index "

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;)V

    .line 162
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 166
    :cond_2
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "--->>> removeCallback: after remove: callbacks size is: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;)V

    .line 167
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-nez p1, :cond_3

    .line 169
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "--->>> removeCallback: remove key from map: key = "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;)V

    .line 170
    sget-object p1, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->f:Ljava/util/Map;

    invoke-interface {p1, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    .line 175
    :try_start_1
    sget-object p1, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->k:Landroid/content/Context;

    invoke-static {p1, p0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 177
    :cond_3
    :goto_2
    monitor-exit v0

    goto :goto_3

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p0

    :cond_4
    :goto_3
    return-void
.end method

.method private c(Lcom/umeng/commonsdk/statistics/proto/d;)Z
    .locals 6

    .line 251
    invoke-virtual {p1}, Lcom/umeng/commonsdk/statistics/proto/d;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->a(Lcom/umeng/commonsdk/statistics/proto/d;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 255
    :cond_0
    invoke-virtual {p1}, Lcom/umeng/commonsdk/statistics/proto/d;->c()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/umeng/commonsdk/statistics/proto/e;

    .line 256
    invoke-virtual {v0}, Lcom/umeng/commonsdk/statistics/proto/e;->h()Ljava/lang/String;

    move-result-object v2

    .line 257
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    .line 260
    :cond_2
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/common/DataHelper;->reverseHexString(Ljava/lang/String;)[B

    move-result-object v2

    .line 261
    invoke-virtual {p0, v0}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->a(Lcom/umeng/commonsdk/statistics/proto/e;)[B

    move-result-object v0

    const/4 v3, 0x0

    :goto_1
    const/4 v4, 0x4

    if-ge v3, v4, :cond_1

    .line 264
    aget-byte v4, v2, v3

    aget-byte v5, v0, v3

    if-eq v4, v5, :cond_3

    return v1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    const/4 p1, 0x1

    return p1
.end method

.method private d(Lcom/umeng/commonsdk/statistics/proto/d;)Lcom/umeng/commonsdk/statistics/proto/d;
    .locals 3

    .line 311
    invoke-virtual {p1}, Lcom/umeng/commonsdk/statistics/proto/d;->c()Ljava/util/Map;

    move-result-object v0

    const-string v1, "umtt"

    .line 312
    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 313
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->h:Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;

    invoke-virtual {v0, v1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;->a(Ljava/lang/String;)V

    .line 315
    invoke-virtual {p1}, Lcom/umeng/commonsdk/statistics/proto/d;->f()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/umeng/commonsdk/statistics/proto/d;->a(I)Lcom/umeng/commonsdk/statistics/proto/d;

    .line 316
    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->a(Lcom/umeng/commonsdk/statistics/proto/d;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/umeng/commonsdk/statistics/proto/d;->a(Ljava/lang/String;)Lcom/umeng/commonsdk/statistics/proto/d;

    :cond_0
    return-object p1
.end method

.method private e(Lcom/umeng/commonsdk/statistics/proto/d;)Lcom/umeng/commonsdk/statistics/proto/d;
    .locals 9

    .line 492
    invoke-virtual {p1}, Lcom/umeng/commonsdk/statistics/proto/d;->c()Ljava/util/Map;

    move-result-object v1

    .line 493
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 498
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v4, 0x0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 499
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/umeng/commonsdk/statistics/proto/e;

    invoke-virtual {v5}, Lcom/umeng/commonsdk/statistics/proto/e;->d()Z

    move-result v5

    if-nez v5, :cond_0

    .line 500
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 502
    :cond_0
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 503
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/umeng/commonsdk/statistics/proto/e;

    iget-object v6, v0, Lcom/umeng/commonsdk/statistics/proto/e;->a:Ljava/lang/String;

    .line 507
    sget-object v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->p:Ljava/lang/Object;

    monitor-enter v0

    .line 508
    :try_start_0
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_1

    sget-object v7, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->o:Ljava/util/Map;

    invoke-interface {v7, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 509
    sget-object v7, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->o:Ljava/util/Map;

    invoke-interface {v7, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/umeng/commonsdk/statistics/internal/UMImprintPreProcessCallback;

    if-eqz v7, :cond_1

    .line 511
    invoke-interface {v7, v5, v6}, Lcom/umeng/commonsdk/statistics/internal/UMImprintPreProcessCallback;->onPreProcessImprintKey(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x1

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    .line 516
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v7, :cond_2

    .line 519
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 523
    :cond_2
    sget-object v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->g:Ljava/lang/Object;

    monitor-enter v0

    .line 524
    :try_start_1
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_3

    sget-object v7, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->f:Ljava/util/Map;

    invoke-interface {v7, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 526
    sget-object v7, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->f:Ljava/util/Map;

    invoke-interface {v7, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/ArrayList;

    if-eqz v7, :cond_3

    .line 528
    :goto_2
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v4, v8, :cond_3

    .line 529
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;

    invoke-interface {v8, v5, v6}, Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;->onImprintValueChanged(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 533
    :cond_3
    monitor-exit v0

    goto/16 :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    .line 516
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    .line 537
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    .line 539
    sget-object v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->g:Ljava/lang/Object;

    monitor-enter v0

    .line 540
    :try_start_3
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_5

    sget-object v4, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->f:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 542
    sget-object v4, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->f:Ljava/util/Map;

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    if-eqz v4, :cond_5

    const/4 v5, 0x0

    .line 544
    :goto_4
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_5

    .line 545
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;

    const/4 v7, 0x0

    invoke-interface {v6, v3, v7}, Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;->onImprintValueChanged(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 549
    :cond_5
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 550
    invoke-interface {v1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :catchall_2
    move-exception p1

    .line 549
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1

    :cond_6
    return-object p1
.end method

.method private e()V
    .locals 5

    .line 565
    new-instance v1, Ljava/io/File;

    sget-object v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->k:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    const-string v2, ".imprint"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 567
    sget-object v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->b:Ljava/lang/Object;

    monitor-enter v0

    .line 568
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    .line 569
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 575
    :try_start_1
    sget-object v2, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->k:Landroid/content/Context;

    const-string v3, ".imprint"

    invoke-virtual {v2, v3}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 576
    :try_start_2
    invoke-static {v2}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->readStreamToByteArray(Ljava/io/InputStream;)[B

    move-result-object v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_0
    move-object v4, v2

    move-object v2, v1

    move-object v1, v4

    goto :goto_1

    :catchall_0
    move-exception v1

    move-object v4, v2

    move-object v2, v1

    move-object v1, v4

    goto :goto_0

    :catchall_1
    move-exception v2

    .line 580
    :goto_0
    :try_start_3
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->safeClose(Ljava/io/InputStream;)V

    throw v2

    :catch_1
    move-object v2, v1

    :goto_1
    invoke-static {v1}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->safeClose(Ljava/io/InputStream;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v2, :cond_1

    .line 585
    :try_start_4
    new-instance v1, Lcom/umeng/commonsdk/statistics/proto/d;

    invoke-direct {v1}, Lcom/umeng/commonsdk/statistics/proto/d;-><init>()V

    .line 586
    new-instance v3, Lcom/umeng/analytics/pro/ay;

    invoke-direct {v3}, Lcom/umeng/analytics/pro/ay;-><init>()V

    invoke-virtual {v3, v1, v2}, Lcom/umeng/analytics/pro/ay;->a(Lcom/umeng/analytics/pro/av;[B)V

    .line 587
    iput-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->i:Lcom/umeng/commonsdk/statistics/proto/d;

    .line 588
    iget-object v2, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->h:Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;

    invoke-virtual {v2, v1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;->a(Lcom/umeng/commonsdk/statistics/proto/d;)V

    .line 589
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->i:Lcom/umeng/commonsdk/statistics/proto/d;

    invoke-direct {p0, v1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->d(Lcom/umeng/commonsdk/statistics/proto/d;)Lcom/umeng/commonsdk/statistics/proto/d;

    move-result-object v1

    iput-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->i:Lcom/umeng/commonsdk/statistics/proto/d;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 594
    :catch_2
    :cond_1
    :try_start_5
    monitor-exit v0

    return-void

    :catchall_2
    move-exception v1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v1
.end method

.method public static declared-synchronized getImprintService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;
    .locals 4

    .line 2
    const-class v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    .line 3
    monitor-enter v0

    .line 95
    :try_start_0
    sget-object v1, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->j:Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    if-nez v1, :cond_0

    .line 96
    new-instance v1, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    invoke-direct {v1, p0}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->j:Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    .line 97
    new-instance p0, Lcom/umeng/commonsdk/utils/FileLockUtil;

    invoke-direct {p0}, Lcom/umeng/commonsdk/utils/FileLockUtil;-><init>()V

    sput-object p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->l:Lcom/umeng/commonsdk/utils/FileLockUtil;

    .line 99
    new-instance p0, Ljava/io/File;

    sget-object v1, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string v2, ".imprint"

    invoke-direct {p0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 100
    sget-object v1, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->l:Lcom/umeng/commonsdk/utils/FileLockUtil;

    sget-object v2, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->j:Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    const/4 v3, 0x0

    invoke-virtual {v1, p0, v2, v3}, Lcom/umeng/commonsdk/utils/FileLockUtil;->doFileOperateion(Ljava/io/File;Lcom/umeng/commonsdk/utils/FileLockCallback;I)V

    .line 105
    :cond_0
    sget-object p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->j:Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public a(Lcom/umeng/commonsdk/statistics/proto/d;)Ljava/lang/String;
    .locals 4

    .line 235
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 236
    new-instance v1, Ljava/util/TreeMap;

    invoke-virtual {p1}, Lcom/umeng/commonsdk/statistics/proto/d;->c()Ljava/util/Map;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    .line 238
    invoke-virtual {v1}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 239
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/umeng/commonsdk/statistics/proto/e;

    invoke-virtual {v3}, Lcom/umeng/commonsdk/statistics/proto/e;->d()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 241
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/umeng/commonsdk/statistics/proto/e;

    invoke-virtual {v2}, Lcom/umeng/commonsdk/statistics/proto/e;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 245
    :cond_1
    iget p1, p1, Lcom/umeng/commonsdk/statistics/proto/d;->b:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 247
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/common/HelperUtils;->MD5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/umeng/commonsdk/statistics/internal/d;)V
    .locals 0

    .line 231
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->e:Lcom/umeng/commonsdk/statistics/internal/d;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 4

    const-string v1, "--->>> unregistPreProcessCallback: can\'t find ["

    const-string v2, "--->>> unregistPreProcessCallback: unregist ["

    .line 213
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 214
    sget-object v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->p:Ljava/lang/Object;

    monitor-enter v0

    .line 216
    :try_start_0
    sget-object v3, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->o:Ljava/util/Map;

    invoke-interface {v3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v1, "MobclickRT"

    .line 217
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "] success."

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    sget-object v1, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->f:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const-string v2, "MobclickRT"

    .line 220
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "], pls regist first."

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 223
    :try_start_1
    sget-object v1, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->k:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 225
    :goto_0
    monitor-exit v0

    goto :goto_1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p1

    :cond_1
    :goto_1
    return-void
.end method

.method public a()[B
    .locals 4

    const/4 v1, 0x0

    move-object v0, p0

    .line 292
    :try_start_0
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 294
    :try_start_1
    iget-object v2, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->i:Lcom/umeng/commonsdk/statistics/proto/d;

    if-nez v2, :cond_0

    .line 295
    monitor-exit v0

    return-object v1

    .line 297
    :cond_0
    invoke-virtual {v2}, Lcom/umeng/commonsdk/statistics/proto/d;->b()I

    move-result v2

    if-gtz v2, :cond_1

    .line 299
    monitor-exit v0

    return-object v1

    .line 301
    :cond_1
    new-instance v2, Lcom/umeng/analytics/pro/be;

    invoke-direct {v2}, Lcom/umeng/analytics/pro/be;-><init>()V

    iget-object v3, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->i:Lcom/umeng/commonsdk/statistics/proto/d;

    invoke-virtual {v2, v3}, Lcom/umeng/analytics/pro/be;->a(Lcom/umeng/analytics/pro/av;)[B

    move-result-object v2

    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v2

    .line 302
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    .line 304
    sget-object v2, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->k:Landroid/content/Context;

    invoke-static {v2, v0}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public a(Lcom/umeng/commonsdk/statistics/proto/e;)[B
    .locals 6

    const/16 v0, 0x8

    .line 273
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    const/4 v1, 0x0

    .line 274
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    .line 275
    invoke-virtual {p1}, Lcom/umeng/commonsdk/statistics/proto/e;->e()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 277
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    .line 278
    sget-object v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->d:[B

    const/4 v1, 0x4

    new-array v2, v1, [B

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    .line 282
    aget-byte v4, p1, v3

    aget-byte v5, v0, v3

    xor-int/2addr v4, v5

    int-to-byte v4, v4

    aput-byte v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v2
.end method

.method public declared-synchronized b()Lcom/umeng/commonsdk/statistics/proto/d;
    .locals 2

    move-object v0, p0

    monitor-enter v0

    .line 557
    :try_start_0
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->i:Lcom/umeng/commonsdk/statistics/proto/d;
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

.method public b(Lcom/umeng/commonsdk/statistics/proto/d;)V
    .locals 6

    if-nez p1, :cond_0

    .line 323
    sget-boolean p1, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz p1, :cond_8

    const-string p1, "MobclickRT"

    const-string v0, "Imprint is null"

    .line 325
    invoke-static {p1, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 330
    :cond_0
    invoke-direct {p0, p1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->c(Lcom/umeng/commonsdk/statistics/proto/d;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 331
    sget-boolean p1, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->UM_DEBUG:Z

    if-eqz p1, :cond_8

    const-string p1, "MobclickRT"

    const-string v0, "Imprint is not valid"

    .line 333
    invoke-static {p1, v0}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 337
    :cond_1
    sget-object v0, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->OS:Ljava/lang/String;

    .line 345
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    move-object v0, p0

    .line 346
    monitor-enter v0

    .line 347
    :try_start_0
    iget-object v2, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->i:Lcom/umeng/commonsdk/statistics/proto/d;

    .line 349
    invoke-direct {p0, p1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->d(Lcom/umeng/commonsdk/statistics/proto/d;)Lcom/umeng/commonsdk/statistics/proto/d;

    move-result-object p1

    const/4 v3, 0x0

    if-nez v2, :cond_2

    move-object v4, v3

    goto :goto_0

    .line 350
    :cond_2
    invoke-virtual {v2}, Lcom/umeng/commonsdk/statistics/proto/d;->i()Ljava/lang/String;

    move-result-object v4

    :goto_0
    if-nez v2, :cond_3

    .line 352
    invoke-direct {p0, p1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->e(Lcom/umeng/commonsdk/statistics/proto/d;)Lcom/umeng/commonsdk/statistics/proto/d;

    move-result-object p1

    goto :goto_1

    .line 354
    :cond_3
    invoke-direct {p0, v2, p1, v1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->a(Lcom/umeng/commonsdk/statistics/proto/d;Lcom/umeng/commonsdk/statistics/proto/d;Ljava/util/Map;)Lcom/umeng/commonsdk/statistics/proto/d;

    move-result-object p1

    .line 357
    :goto_1
    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->i:Lcom/umeng/commonsdk/statistics/proto/d;

    if-nez p1, :cond_4

    goto :goto_2

    .line 358
    :cond_4
    invoke-virtual {p1}, Lcom/umeng/commonsdk/statistics/proto/d;->i()Ljava/lang/String;

    move-result-object v3

    .line 359
    :goto_2
    invoke-direct {p0, v4, v3}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    .line 362
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 364
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->i:Lcom/umeng/commonsdk/statistics/proto/d;

    if-eqz v0, :cond_5

    if-nez p1, :cond_5

    .line 369
    iget-object p1, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->h:Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;

    invoke-virtual {p1, v0}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;->a(Lcom/umeng/commonsdk/statistics/proto/d;)V

    .line 370
    iget-object p1, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->e:Lcom/umeng/commonsdk/statistics/internal/d;

    if-eqz p1, :cond_5

    .line 371
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->h:Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;

    invoke-interface {p1, v0}, Lcom/umeng/commonsdk/statistics/internal/d;->onImprintChanged(Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;)V

    .line 378
    :cond_5
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result p1

    if-lez p1, :cond_8

    .line 381
    sget-object p1, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->g:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0

    .line 382
    :try_start_1
    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 383
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 384
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 385
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6

    sget-object v3, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->f:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 386
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "--->>> target imprint key is: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "; value is: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/umeng/commonsdk/statistics/common/ULog;->i(Ljava/lang/String;)V

    .line 387
    sget-object v3, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->f:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    if-eqz v3, :cond_6

    const/4 v4, 0x0

    .line 389
    :goto_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_6

    .line 390
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;

    invoke-interface {v5, v2, v1}, Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;->onImprintValueChanged(Ljava/lang/String;Ljava/lang/String;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 396
    :cond_7
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_8
    return-void

    :catchall_1
    move-exception p1

    .line 362
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public c()Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;
    .locals 1

    .line 561
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->h:Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;

    return-object v0
.end method

.method public d()V
    .locals 4

    .line 621
    iget-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->i:Lcom/umeng/commonsdk/statistics/proto/d;

    if-nez v0, :cond_0

    goto :goto_1

    .line 624
    :cond_0
    sget-object v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->l:Lcom/umeng/commonsdk/utils/FileLockUtil;

    if-eqz v0, :cond_2

    .line 625
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string v2, ".imprint"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 626
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    .line 628
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 632
    :catch_0
    :try_start_1
    invoke-virtual {v0}, Ljava/io/File;->createNewFile()Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v1

    .line 634
    sget-object v2, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->k:Landroid/content/Context;

    invoke-static {v2, v1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 638
    :cond_1
    :goto_0
    sget-object v1, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->l:Lcom/umeng/commonsdk/utils/FileLockUtil;

    sget-object v2, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->j:Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    const/4 v3, 0x1

    invoke-virtual {v1, v0, v2, v3}, Lcom/umeng/commonsdk/utils/FileLockUtil;->doFileOperateion(Ljava/io/File;Lcom/umeng/commonsdk/utils/FileLockCallback;I)V

    :cond_2
    :goto_1
    return-void
.end method

.method public onFileLock(Ljava/io/File;I)Z
    .locals 1

    const/4 v0, 0x1

    if-nez p2, :cond_0

    .line 82
    sget-object p1, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->j:Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    invoke-direct {p1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->e()V

    goto :goto_0

    :cond_0
    if-ne p2, v0, :cond_1

    .line 85
    sget-object p2, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->j:Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    invoke-direct {p2, p1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->a(Ljava/io/File;)V

    :cond_1
    :goto_0
    return v0
.end method

.method public onFileLock(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onFileLock(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public registImprintCallback(Ljava/lang/String;Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;)V
    .locals 1

    .line 182
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p2, :cond_0

    .line 183
    invoke-static {p1, p2}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->a(Ljava/lang/String;Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;)V

    :cond_0
    return-void
.end method

.method public registPreProcessCallback(Ljava/lang/String;Lcom/umeng/commonsdk/statistics/internal/UMImprintPreProcessCallback;)V
    .locals 4

    const-string v1, "--->>> key : "

    const-string v2, "--->>> registPreProcessCallback: key : "

    .line 195
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p2, :cond_1

    .line 196
    sget-object v0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->p:Ljava/lang/Object;

    monitor-enter v0

    .line 199
    :try_start_0
    sget-object v3, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->o:Ljava/util/Map;

    invoke-interface {v3, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 200
    sget-object v1, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->o:Ljava/util/Map;

    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "MobclickRT"

    .line 201
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " regist success."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string p2, "MobclickRT"

    .line 203
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " PreProcesser has registed!"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 206
    :try_start_1
    sget-object p2, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->k:Landroid/content/Context;

    invoke-static {p2, p1}, Lcom/umeng/commonsdk/internal/crash/UMCrashManager;->reportCrash(Landroid/content/Context;Ljava/lang/Throwable;)V

    .line 208
    :goto_0
    monitor-exit v0

    goto :goto_1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p1

    :cond_1
    :goto_1
    return-void
.end method

.method public unregistImprintCallback(Ljava/lang/String;Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;)V
    .locals 1

    .line 188
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p2, :cond_0

    .line 189
    invoke-static {p1, p2}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->b(Ljava/lang/String;Lcom/umeng/commonsdk/statistics/internal/UMImprintChangeCallback;)V

    :cond_0
    return-void
.end method
