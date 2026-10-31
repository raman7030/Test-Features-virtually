.class public final Lcom/amazonaws/event/ProgressListenerCallbackExecutor$3;
.super Ljava/lang/Object;
.source "ProgressListenerCallbackExecutor.java"

# interfaces
.implements Ljava/util/concurrent/ThreadFactory;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 1

    .line 119
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    const-string p1, "android-sdk-progress-listener-callback-thread"

    .line 120
    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 121
    invoke-virtual {v0, p1}, Ljava/lang/Thread;->setDaemon(Z)V

    return-object v0
.end method
