.class public Lnet/engio/mbassy/dispatch/EnvelopedMessageDispatcher;
.super Lnet/engio/mbassy/dispatch/DelegatingMessageDispatcher;
.source "EnvelopedMessageDispatcher.java"


# direct methods
.method public constructor <init>(Lnet/engio/mbassy/dispatch/IMessageDispatcher;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lnet/engio/mbassy/dispatch/DelegatingMessageDispatcher;-><init>(Lnet/engio/mbassy/dispatch/IMessageDispatcher;)V

    return-void
.end method


# virtual methods
.method public dispatch(Lnet/engio/mbassy/bus/MessagePublication;Ljava/lang/Object;Ljava/lang/Iterable;)V
    .locals 2

    .line 25
    invoke-virtual {p0}, Lnet/engio/mbassy/dispatch/DelegatingMessageDispatcher;->getDelegate()Lnet/engio/mbassy/dispatch/IMessageDispatcher;

    move-result-object v0

    new-instance v1, Lnet/engio/mbassy/subscription/MessageEnvelope;

    invoke-direct {v1, p2}, Lnet/engio/mbassy/subscription/MessageEnvelope;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, p1, v1, p3}, Lnet/engio/mbassy/dispatch/IMessageDispatcher;->dispatch(Lnet/engio/mbassy/bus/MessagePublication;Ljava/lang/Object;Ljava/lang/Iterable;)V

    return-void
.end method
