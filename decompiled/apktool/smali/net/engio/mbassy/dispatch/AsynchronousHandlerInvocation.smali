.class public Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation;
.super Lnet/engio/mbassy/subscription/AbstractSubscriptionContextAware;
.source "AsynchronousHandlerInvocation.java"

# interfaces
.implements Lnet/engio/mbassy/dispatch/IHandlerInvocation;


# instance fields
.field public final delegate:Lnet/engio/mbassy/dispatch/IHandlerInvocation;

.field public final executor:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Lnet/engio/mbassy/dispatch/IHandlerInvocation;)V
    .locals 1

    .line 22
    invoke-interface {p1}, Lnet/engio/mbassy/subscription/ISubscriptionContextAware;->getContext()Lnet/engio/mbassy/subscription/SubscriptionContext;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/engio/mbassy/subscription/AbstractSubscriptionContextAware;-><init>(Lnet/engio/mbassy/subscription/SubscriptionContext;)V

    .line 23
    iput-object p1, p0, Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation;->delegate:Lnet/engio/mbassy/dispatch/IHandlerInvocation;

    .line 24
    invoke-interface {p1}, Lnet/engio/mbassy/subscription/ISubscriptionContextAware;->getContext()Lnet/engio/mbassy/subscription/SubscriptionContext;

    move-result-object p1

    invoke-virtual {p1}, Lnet/engio/mbassy/subscription/SubscriptionContext;->getRuntime()Lnet/engio/mbassy/bus/BusRuntime;

    move-result-object p1

    const-string v0, "bus.handlers.async-executor"

    invoke-virtual {p1, v0}, Lnet/engio/mbassy/bus/BusRuntime;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ExecutorService;

    iput-object p1, p0, Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation;->executor:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static synthetic access$000(Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation;)Lnet/engio/mbassy/dispatch/IHandlerInvocation;
    .locals 0

    .line 15
    iget-object p0, p0, Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation;->delegate:Lnet/engio/mbassy/dispatch/IHandlerInvocation;

    return-object p0
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/Object;Lnet/engio/mbassy/bus/MessagePublication;)V
    .locals 2

    .line 32
    iget-object v0, p0, Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation;->executor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation$1;

    invoke-direct {v1, p0, p1, p2, p3}, Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation$1;-><init>(Lnet/engio/mbassy/dispatch/AsynchronousHandlerInvocation;Ljava/lang/Object;Ljava/lang/Object;Lnet/engio/mbassy/bus/MessagePublication;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
