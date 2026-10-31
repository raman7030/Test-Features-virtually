.class public final Ll/ܽۗܳ;
.super Ljava/lang/Object;
.source "1B34"


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final synthetic ۧ:Ll/ܿۗܳ;


# direct methods
.method public constructor <init>(Ll/ܿۗܳ;)V
    .locals 0

    .line 452
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽۗܳ;->ۧ:Ll/ܿۗܳ;

    .line 453
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ܽۗܳ;->֫:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫(Ljava/lang/String;)Ll/ۧۗܳ;
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 456
    :try_start_0
    iget-object v1, p0, Ll/ܽۗܳ;->֫:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧۗܳ;

    if-eqz v1, :cond_2

    .line 478
    iget-object p1, v1, Ll/ۧۗܳ;->ۧ:Ljava/lang/Boolean;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_3

    .line 482
    :cond_1
    iget-object p1, v1, Ll/ۧۗܳ;->ܽ:Ll/ܿۗܳ;

    invoke-static {p1}, Ll/ܿۗܳ;->ۧ(Ll/ܿۗܳ;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_3

    .line 484
    :try_start_1
    iget-object p1, v1, Ll/ۧۗܳ;->֫:Ljava/util/concurrent/CountDownLatch;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1

    invoke-virtual {p1, v3, v4, v2}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_1

    goto :goto_1

    .line 462
    :cond_2
    :try_start_2
    new-instance v1, Ll/ۧۗܳ;

    iget-object v2, p0, Ll/ܽۗܳ;->ۧ:Ll/ܿۗܳ;

    invoke-direct {v1, v2}, Ll/ۧۗܳ;-><init>(Ll/ܿۗܳ;)V

    .line 463
    iget-object v2, p0, Ll/ܽۗܳ;->֫:Ljava/util/HashMap;

    invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 465
    :catch_0
    :cond_3
    :goto_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 469
    :try_start_0
    iget-object v1, p0, Ll/ܽۗܳ;->֫:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 470
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
