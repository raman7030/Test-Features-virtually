.class public Lcom/amazonaws/event/ProgressListenerCallbackExecutor;
.super Ljava/lang/Object;
.source "ProgressListenerCallbackExecutor.java"


# static fields
.field public static final synthetic ۧ:I

.field public static ܽ:Ljava/util/concurrent/ExecutorService;


# instance fields
.field public final ֫:Lcom/amazonaws/event/ProgressListener;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 116
    new-instance v0, Lcom/amazonaws/event/ProgressListenerCallbackExecutor$3;

    invoke-direct {v0}, Lcom/amazonaws/event/ProgressListenerCallbackExecutor$3;-><init>()V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    .line 33
    sput-object v0, Lcom/amazonaws/event/ProgressListenerCallbackExecutor;->ܽ:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>(Lcom/amazonaws/event/ProgressListener;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lcom/amazonaws/event/ProgressListenerCallbackExecutor;->֫:Lcom/amazonaws/event/ProgressListener;

    return-void
.end method

.method public static synthetic ֫(Lcom/amazonaws/event/ProgressListenerCallbackExecutor;)Lcom/amazonaws/event/ProgressListener;
    .locals 0

    .line 27
    iget-object p0, p0, Lcom/amazonaws/event/ProgressListenerCallbackExecutor;->֫:Lcom/amazonaws/event/ProgressListener;

    return-object p0
.end method


# virtual methods
.method public final ֫(Lcom/amazonaws/event/ProgressEvent;)V
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/amazonaws/event/ProgressListenerCallbackExecutor;->֫:Lcom/amazonaws/event/ProgressListener;

    if-nez v0, :cond_0

    return-void

    .line 78
    :cond_0
    new-instance v0, Lcom/amazonaws/event/ProgressListenerCallbackExecutor$2;

    invoke-direct {v0, p0, p1}, Lcom/amazonaws/event/ProgressListenerCallbackExecutor$2;-><init>(Lcom/amazonaws/event/ProgressListenerCallbackExecutor;Lcom/amazonaws/event/ProgressEvent;)V

    sget-object p1, Lcom/amazonaws/event/ProgressListenerCallbackExecutor;->ܽ:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method
