.class public final Lcom/umeng/analytics/pro/ai$a;
.super Ljava/lang/Object;
.source "FBLP"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public a:Z

.field public final b:Ljava/util/concurrent/LinkedBlockingQueue;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 40
    iput-boolean v0, p0, Lcom/umeng/analytics/pro/ai$a;->a:Z

    .line 41
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    iput-object v0, p0, Lcom/umeng/analytics/pro/ai$a;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/umeng/analytics/pro/ai$1;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/umeng/analytics/pro/ai$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/os/IBinder;
    .locals 4

    .line 57
    iget-boolean v0, p0, Lcom/umeng/analytics/pro/ai$a;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 61
    iput-boolean v0, p0, Lcom/umeng/analytics/pro/ai$a;->a:Z

    .line 62
    iget-object v0, p0, Lcom/umeng/analytics/pro/ai$a;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    const-wide/16 v1, 0x5

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/concurrent/LinkedBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/IBinder;

    return-object v0

    .line 58
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 0

    .line 46
    :try_start_0
    iget-object p1, p0, Lcom/umeng/analytics/pro/ai$a;->b:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    return-void
.end method
