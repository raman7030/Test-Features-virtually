.class public Lnet/engio/mbassy/dispatch/MessageDispatcher;
.super Lnet/engio/mbassy/subscription/AbstractSubscriptionContextAware;
.source "MessageDispatcher.java"

# interfaces
.implements Lnet/engio/mbassy/dispatch/IMessageDispatcher;


# instance fields
.field public final invocation:Lnet/engio/mbassy/dispatch/IHandlerInvocation;


# direct methods
.method public constructor <init>(Lnet/engio/mbassy/subscription/SubscriptionContext;Lnet/engio/mbassy/dispatch/IHandlerInvocation;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lnet/engio/mbassy/subscription/AbstractSubscriptionContextAware;-><init>(Lnet/engio/mbassy/subscription/SubscriptionContext;)V

    .line 23
    iput-object p2, p0, Lnet/engio/mbassy/dispatch/MessageDispatcher;->invocation:Lnet/engio/mbassy/dispatch/IHandlerInvocation;

    return-void
.end method


# virtual methods
.method public dispatch(Lnet/engio/mbassy/bus/MessagePublication;Ljava/lang/Object;Ljava/lang/Iterable;)V
    .locals 2

    .line 28
    invoke-virtual {p1}, Lnet/engio/mbassy/bus/MessagePublication;->markDispatched()V

    .line 29
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 30
    invoke-virtual {p0}, Lnet/engio/mbassy/dispatch/MessageDispatcher;->getInvocation()Lnet/engio/mbassy/dispatch/IHandlerInvocation;

    move-result-object v1

    invoke-interface {v1, v0, p2, p1}, Lnet/engio/mbassy/dispatch/IHandlerInvocation;->invoke(Ljava/lang/Object;Ljava/lang/Object;Lnet/engio/mbassy/bus/MessagePublication;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public getInvocation()Lnet/engio/mbassy/dispatch/IHandlerInvocation;
    .locals 1

    .line 36
    iget-object v0, p0, Lnet/engio/mbassy/dispatch/MessageDispatcher;->invocation:Lnet/engio/mbassy/dispatch/IHandlerInvocation;

    return-object v0
.end method
