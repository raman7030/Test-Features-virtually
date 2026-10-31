.class public Lnet/engio/mbassy/dispatch/SynchronizedHandlerInvocation;
.super Lnet/engio/mbassy/subscription/AbstractSubscriptionContextAware;
.source "SynchronizedHandlerInvocation.java"

# interfaces
.implements Lnet/engio/mbassy/dispatch/IHandlerInvocation;


# instance fields
.field public delegate:Lnet/engio/mbassy/dispatch/IHandlerInvocation;


# direct methods
.method public constructor <init>(Lnet/engio/mbassy/dispatch/IHandlerInvocation;)V
    .locals 1

    .line 17
    invoke-interface {p1}, Lnet/engio/mbassy/subscription/ISubscriptionContextAware;->getContext()Lnet/engio/mbassy/subscription/SubscriptionContext;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/engio/mbassy/subscription/AbstractSubscriptionContextAware;-><init>(Lnet/engio/mbassy/subscription/SubscriptionContext;)V

    .line 18
    iput-object p1, p0, Lnet/engio/mbassy/dispatch/SynchronizedHandlerInvocation;->delegate:Lnet/engio/mbassy/dispatch/IHandlerInvocation;

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;Ljava/lang/Object;Lnet/engio/mbassy/bus/MessagePublication;)V
    .locals 2

    move-object v0, p1

    .line 26
    monitor-enter v0

    .line 27
    :try_start_0
    iget-object v1, p0, Lnet/engio/mbassy/dispatch/SynchronizedHandlerInvocation;->delegate:Lnet/engio/mbassy/dispatch/IHandlerInvocation;

    invoke-interface {v1, p1, p2, p3}, Lnet/engio/mbassy/dispatch/IHandlerInvocation;->invoke(Ljava/lang/Object;Ljava/lang/Object;Lnet/engio/mbassy/bus/MessagePublication;)V

    .line 28
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
