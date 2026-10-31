.class public Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;
.super Ljava/lang/Object;
.source "ImprintHandler.java"


# instance fields
.field public a:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 672
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 670
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/umeng/commonsdk/statistics/proto/d;)V
    .locals 1

    .line 684
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 670
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;->a:Ljava/util/Map;

    .line 685
    invoke-virtual {p0, p1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;->a(Lcom/umeng/commonsdk/statistics/proto/d;)V

    return-void
.end method

.method private declared-synchronized b(Lcom/umeng/commonsdk/statistics/proto/d;)V
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    if-eqz p1, :cond_3

    .line 731
    :try_start_0
    invoke-virtual {p1}, Lcom/umeng/commonsdk/statistics/proto/d;->e()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 734
    :cond_0
    invoke-virtual {p1}, Lcom/umeng/commonsdk/statistics/proto/d;->c()Ljava/util/Map;

    move-result-object p1

    .line 735
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 739
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 740
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 741
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 742
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/umeng/commonsdk/statistics/proto/e;

    if-eqz v3, :cond_1

    .line 744
    invoke-virtual {v3}, Lcom/umeng/commonsdk/statistics/proto/e;->b()Ljava/lang/String;

    move-result-object v3

    .line 745
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 746
    iget-object v4, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;->a:Ljava/util/Map;

    invoke-interface {v4, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 753
    sget-object v2, Lcom/umeng/commonsdk/statistics/AnalyticsConstants;->OS:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 765
    :catchall_0
    :cond_2
    monitor-exit v0

    return-void

    .line 732
    :cond_3
    :goto_1
    monitor-exit v0

    return-void
.end method


# virtual methods
.method public declared-synchronized a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    move-object v0, p0

    monitor-enter v0

    .line 769
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;->a:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_0

    .line 772
    :cond_0
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;->a:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 773
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    .line 774
    monitor-exit v0

    return-object p1

    .line 777
    :cond_1
    monitor-exit v0

    return-object p2

    .line 770
    :cond_2
    :goto_0
    monitor-exit v0

    return-object p2

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public a(Lcom/umeng/commonsdk/statistics/proto/d;)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    .line 723
    :cond_0
    invoke-direct {p0, p1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;->b(Lcom/umeng/commonsdk/statistics/proto/d;)V

    return-void
.end method

.method public declared-synchronized a(Ljava/lang/String;)V
    .locals 2

    move-object v0, p0

    monitor-enter v0

    .line 676
    :try_start_0
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;->a:Ljava/util/Map;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 677
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 678
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;->a:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 679
    iget-object v1, p0, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler$a;->a:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 683
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
