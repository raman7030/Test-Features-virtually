.class public Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus$1;
.super Ljava/lang/Object;
.source "AbstractSyncAsyncMessageBus.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic this$0:Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;


# direct methods
.method public constructor <init>(Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;)V
    .locals 0

    .line 61
    iput-object p1, p0, Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus$1;->this$0:Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    :goto_0
    const/4 v0, 0x0

    .line 66
    :try_start_0
    iget-object v1, p0, Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus$1;->this$0:Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;

    invoke-static {v1}, Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;->access$000(Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/engio/mbassy/bus/IMessagePublication;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 67
    :try_start_1
    invoke-interface {v1}, Lnet/engio/mbassy/bus/IMessagePublication;->execute()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v1

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    .line 72
    :goto_1
    iget-object v2, p0, Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus$1;->this$0:Lnet/engio/mbassy/bus/AbstractSyncAsyncMessageBus;

    new-instance v3, Lnet/engio/mbassy/bus/error/InternalPublicationError;

    const-string v4, "Error in asynchronous dispatch"

    invoke-direct {v3, v0, v4, v1}, Lnet/engio/mbassy/bus/error/InternalPublicationError;-><init>(Ljava/lang/Throwable;Ljava/lang/String;Lnet/engio/mbassy/bus/IMessagePublication;)V

    invoke-virtual {v2, v3}, Lnet/engio/mbassy/bus/AbstractPubSubSupport;->handlePublicationError(Lnet/engio/mbassy/bus/error/PublicationError;)V

    goto :goto_0

    .line 69
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method
