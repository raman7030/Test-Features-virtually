.class public abstract Lnet/engio/mbassy/dispatch/DelegatingMessageDispatcher;
.super Lnet/engio/mbassy/subscription/AbstractSubscriptionContextAware;
.source "DelegatingMessageDispatcher.java"

# interfaces
.implements Lnet/engio/mbassy/dispatch/IMessageDispatcher;


# instance fields
.field public final delegate:Lnet/engio/mbassy/dispatch/IMessageDispatcher;


# direct methods
.method public constructor <init>(Lnet/engio/mbassy/dispatch/IMessageDispatcher;)V
    .locals 1

    .line 18
    invoke-interface {p1}, Lnet/engio/mbassy/subscription/ISubscriptionContextAware;->getContext()Lnet/engio/mbassy/subscription/SubscriptionContext;

    move-result-object v0

    invoke-direct {p0, v0}, Lnet/engio/mbassy/subscription/AbstractSubscriptionContextAware;-><init>(Lnet/engio/mbassy/subscription/SubscriptionContext;)V

    .line 19
    iput-object p1, p0, Lnet/engio/mbassy/dispatch/DelegatingMessageDispatcher;->delegate:Lnet/engio/mbassy/dispatch/IMessageDispatcher;

    return-void
.end method


# virtual methods
.method public getDelegate()Lnet/engio/mbassy/dispatch/IMessageDispatcher;
    .locals 1

    .line 23
    iget-object v0, p0, Lnet/engio/mbassy/dispatch/DelegatingMessageDispatcher;->delegate:Lnet/engio/mbassy/dispatch/IMessageDispatcher;

    return-object v0
.end method

.method public getInvocation()Lnet/engio/mbassy/dispatch/IHandlerInvocation;
    .locals 1

    .line 28
    iget-object v0, p0, Lnet/engio/mbassy/dispatch/DelegatingMessageDispatcher;->delegate:Lnet/engio/mbassy/dispatch/IMessageDispatcher;

    invoke-interface {v0}, Lnet/engio/mbassy/dispatch/IMessageDispatcher;->getInvocation()Lnet/engio/mbassy/dispatch/IHandlerInvocation;

    move-result-object v0

    return-object v0
.end method
