.class public interface abstract Lnet/engio/mbassy/dispatch/IMessageDispatcher;
.super Ljava/lang/Object;
.source "IMessageDispatcher.java"

# interfaces
.implements Lnet/engio/mbassy/subscription/ISubscriptionContextAware;


# virtual methods
.method public abstract dispatch(Lnet/engio/mbassy/bus/MessagePublication;Ljava/lang/Object;Ljava/lang/Iterable;)V
.end method

.method public abstract getInvocation()Lnet/engio/mbassy/dispatch/IHandlerInvocation;
.end method
