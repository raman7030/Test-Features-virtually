.class public abstract Lcom/umeng/commonsdk/utils/a;
.super Ljava/lang/Object;
.source "3BM5"


# static fields
.field public static final e:I = 0x1


# instance fields
.field public final a:J

.field public final b:J

.field public c:J

.field public d:Z

.field public f:Landroid/os/HandlerThread;

.field public g:Landroid/os/Handler;

.field public h:Landroid/os/Handler$Callback;


# direct methods
.method public constructor <init>(JJ)V
    .locals 1

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 70
    iput-boolean v0, p0, Lcom/umeng/commonsdk/utils/a;->d:Z

    .line 171
    new-instance v0, Lcom/umeng/commonsdk/utils/a$1;

    invoke-direct {v0, p0}, Lcom/umeng/commonsdk/utils/a$1;-><init>(Lcom/umeng/commonsdk/utils/a;)V

    iput-object v0, p0, Lcom/umeng/commonsdk/utils/a;->h:Landroid/os/Handler$Callback;

    .line 80
    iput-wide p1, p0, Lcom/umeng/commonsdk/utils/a;->a:J

    .line 81
    iput-wide p3, p0, Lcom/umeng/commonsdk/utils/a;->b:J

    .line 82
    invoke-direct {p0}, Lcom/umeng/commonsdk/utils/a;->d()Z

    move-result p1

    if-nez p1, :cond_0

    .line 83
    new-instance p1, Landroid/os/HandlerThread;

    const-string p2, "CountDownTimerThread"

    invoke-direct {p1, p2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/umeng/commonsdk/utils/a;->f:Landroid/os/HandlerThread;

    .line 84
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 85
    new-instance p1, Landroid/os/Handler;

    iget-object p2, p0, Lcom/umeng/commonsdk/utils/a;->f:Landroid/os/HandlerThread;

    invoke-virtual {p2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p2

    iget-object p3, p0, Lcom/umeng/commonsdk/utils/a;->h:Landroid/os/Handler$Callback;

    invoke-direct {p1, p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Lcom/umeng/commonsdk/utils/a;->g:Landroid/os/Handler;

    return-void

    .line 87
    :cond_0
    new-instance p1, Landroid/os/Handler;

    iget-object p2, p0, Lcom/umeng/commonsdk/utils/a;->h:Landroid/os/Handler$Callback;

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Lcom/umeng/commonsdk/utils/a;->g:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic a(Lcom/umeng/commonsdk/utils/a;)Z
    .locals 0

    .line 53
    iget-boolean p0, p0, Lcom/umeng/commonsdk/utils/a;->d:Z

    return p0
.end method

.method public static synthetic b(Lcom/umeng/commonsdk/utils/a;)J
    .locals 2

    .line 53
    iget-wide v0, p0, Lcom/umeng/commonsdk/utils/a;->c:J

    return-wide v0
.end method

.method public static synthetic c(Lcom/umeng/commonsdk/utils/a;)Landroid/os/HandlerThread;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/umeng/commonsdk/utils/a;->f:Landroid/os/HandlerThread;

    return-object p0
.end method

.method public static synthetic d(Lcom/umeng/commonsdk/utils/a;)J
    .locals 2

    .line 53
    iget-wide v0, p0, Lcom/umeng/commonsdk/utils/a;->b:J

    return-wide v0
.end method

.method private d()Z
    .locals 2

    .line 115
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static synthetic e(Lcom/umeng/commonsdk/utils/a;)Landroid/os/Handler;
    .locals 0

    .line 53
    iget-object p0, p0, Lcom/umeng/commonsdk/utils/a;->g:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 3

    move-object v0, p0

    monitor-enter v0

    const/4 v1, 0x1

    .line 95
    :try_start_0
    iput-boolean v1, p0, Lcom/umeng/commonsdk/utils/a;->d:Z

    .line 96
    iget-object v2, p0, Lcom/umeng/commonsdk/utils/a;->g:Landroid/os/Handler;

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeMessages(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
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

.method public abstract a(J)V
.end method

.method public final declared-synchronized b()Lcom/umeng/commonsdk/utils/a;
    .locals 6

    move-object v0, p0

    monitor-enter v0

    const/4 v1, 0x0

    .line 103
    :try_start_0
    iput-boolean v1, p0, Lcom/umeng/commonsdk/utils/a;->d:Z

    .line 104
    iget-wide v1, p0, Lcom/umeng/commonsdk/utils/a;->a:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-gtz v5, :cond_0

    .line 105
    invoke-virtual {p0}, Lcom/umeng/commonsdk/utils/a;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    monitor-exit v0

    return-object p0

    .line 108
    :cond_0
    :try_start_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/umeng/commonsdk/utils/a;->a:J

    add-long/2addr v1, v3

    iput-wide v1, p0, Lcom/umeng/commonsdk/utils/a;->c:J

    .line 109
    iget-object v1, p0, Lcom/umeng/commonsdk/utils/a;->g:Landroid/os/Handler;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public abstract c()V
.end method
