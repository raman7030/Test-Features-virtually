.class public Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferThreadPool;
.super Ljava/lang/Object;
.source "TransferThreadPool.java"


# static fields
.field public static final ֫:Lcom/amazonaws/logging/Log;

.field public static ۧ:Ljava/util/concurrent/ThreadPoolExecutor;

.field public static ܽ:Ljava/util/concurrent/ThreadPoolExecutor;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 30
    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferService;

    invoke-static {v0}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object v0

    sput-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferThreadPool;->֫:Lcom/amazonaws/logging/Log;

    return-void
.end method

.method public static ֫(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;
    .locals 11

    .line 49
    sget v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferUtilityOptions;->᩹:I

    .line 180
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    mul-int/lit8 v2, v0, 0x2

    const-string v3, "Initializing the thread pool of size: "

    .line 0
    const-class v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferThreadPool;

    monitor-enter v0

    .line 36
    :try_start_0
    sget-object v4, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferThreadPool;->֫:Lcom/amazonaws/logging/Log;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v4, v3}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    int-to-double v2, v2

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    div-double/2addr v2, v4

    .line 38
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 40
    sget-object v3, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferThreadPool;->ۧ:Ljava/util/concurrent/ThreadPoolExecutor;

    if-nez v3, :cond_0

    .line 93
    new-instance v10, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v9, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v9}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const-wide/16 v6, 0xa

    move-object v3, v10

    move v4, v2

    move v5, v2

    invoke-direct/range {v3 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 100
    new-instance v3, Ljava/util/concurrent/ThreadPoolExecutor$DiscardPolicy;

    invoke-direct {v3}, Ljava/util/concurrent/ThreadPoolExecutor$DiscardPolicy;-><init>()V

    invoke-virtual {v10, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->setRejectedExecutionHandler(Ljava/util/concurrent/RejectedExecutionHandler;)V

    .line 101
    invoke-virtual {v10, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 41
    sput-object v10, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferThreadPool;->ۧ:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 43
    :cond_0
    sget-object v3, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferThreadPool;->ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

    if-nez v3, :cond_1

    .line 93
    new-instance v10, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v9, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v9}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const-wide/16 v6, 0xa

    move-object v3, v10

    move v4, v2

    move v5, v2

    invoke-direct/range {v3 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 100
    new-instance v2, Ljava/util/concurrent/ThreadPoolExecutor$DiscardPolicy;

    invoke-direct {v2}, Ljava/util/concurrent/ThreadPoolExecutor$DiscardPolicy;-><init>()V

    invoke-virtual {v10, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->setRejectedExecutionHandler(Ljava/util/concurrent/RejectedExecutionHandler;)V

    .line 101
    invoke-virtual {v10, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 44
    sput-object v10, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferThreadPool;->ܽ:Ljava/util/concurrent/ThreadPoolExecutor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    :cond_1
    monitor-exit v0

    .line 50
    instance-of v0, p0, Lcom/amazonaws/mobileconnectors/s3/transferutility/UploadPartTask;

    if-eqz v0, :cond_2

    .line 51
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferThreadPool;->ܽ:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-interface {v0, p0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0

    .line 53
    :cond_2
    sget-object v0, Lcom/amazonaws/mobileconnectors/s3/transferutility/TransferThreadPool;->ۧ:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-interface {v0, p0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0

    :catchall_0
    move-exception p0

    .line 46
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method
