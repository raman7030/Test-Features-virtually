.class public Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation;
.super Ljava/lang/Object;
.source "Feature.java"

# interfaces
.implements Lnet/engio/mbassy/bus/config/Feature;


# static fields
.field public static final MessageHandlerThreadFactory:Ljava/util/concurrent/ThreadFactory;


# instance fields
.field public executor:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 81
    new-instance v0, Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation$1;

    invoke-direct {v0}, Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation$1;-><init>()V

    sput-object v0, Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation;->MessageHandlerThreadFactory:Ljava/util/concurrent/ThreadFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final Default()Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation;
    .locals 2

    .line 95
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    mul-int/lit8 v1, v0, 0x2

    .line 96
    invoke-static {v0, v1}, Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation;->Default(II)Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation;

    move-result-object v0

    return-object v0
.end method

.method public static final Default(II)Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation;
    .locals 10

    .line 100
    new-instance v0, Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation;

    invoke-direct {v0}, Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation;-><init>()V

    new-instance v9, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    sget-object v8, Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation;->MessageHandlerThreadFactory:Ljava/util/concurrent/ThreadFactory;

    const-wide/16 v4, 0x1

    move-object v1, v9

    move v2, p0

    move v3, p1

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    invoke-virtual {v0, v9}, Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation;->setExecutor(Ljava/util/concurrent/ExecutorService;)Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getExecutor()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 107
    iget-object v0, p0, Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation;->executor:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public setExecutor(Ljava/util/concurrent/ExecutorService;)Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation;
    .locals 0

    .line 111
    iput-object p1, p0, Lnet/engio/mbassy/bus/config/Feature$AsynchronousHandlerInvocation;->executor:Ljava/util/concurrent/ExecutorService;

    return-object p0
.end method
