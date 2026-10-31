.class public final Lnet/engio/mbassy/dispatch/FilteredMessageDispatcher;
.super Lnet/engio/mbassy/dispatch/DelegatingMessageDispatcher;
.source "FilteredMessageDispatcher.java"


# instance fields
.field public final filter:[Lnet/engio/mbassy/listener/IMessageFilter;


# direct methods
.method public constructor <init>(Lnet/engio/mbassy/dispatch/IMessageDispatcher;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lnet/engio/mbassy/dispatch/DelegatingMessageDispatcher;-><init>(Lnet/engio/mbassy/dispatch/IMessageDispatcher;)V

    .line 21
    invoke-interface {p1}, Lnet/engio/mbassy/subscription/ISubscriptionContextAware;->getContext()Lnet/engio/mbassy/subscription/SubscriptionContext;

    move-result-object p1

    invoke-virtual {p1}, Lnet/engio/mbassy/subscription/SubscriptionContext;->getHandler()Lnet/engio/mbassy/listener/MessageHandler;

    move-result-object p1

    invoke-virtual {p1}, Lnet/engio/mbassy/listener/MessageHandler;->getFilter()[Lnet/engio/mbassy/listener/IMessageFilter;

    move-result-object p1

    iput-object p1, p0, Lnet/engio/mbassy/dispatch/FilteredMessageDispatcher;->filter:[Lnet/engio/mbassy/listener/IMessageFilter;

    return-void
.end method

.method private passesFilter(Ljava/lang/Object;)Z
    .locals 7

    .line 26
    iget-object v0, p0, Lnet/engio/mbassy/dispatch/FilteredMessageDispatcher;->filter:[Lnet/engio/mbassy/listener/IMessageFilter;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 29
    :cond_0
    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    aget-object v5, v0, v4

    .line 30
    invoke-virtual {p0}, Lnet/engio/mbassy/subscription/AbstractSubscriptionContextAware;->getContext()Lnet/engio/mbassy/subscription/SubscriptionContext;

    move-result-object v6

    invoke-interface {v5, p1, v6}, Lnet/engio/mbassy/listener/IMessageFilter;->accepts(Ljava/lang/Object;Lnet/engio/mbassy/subscription/SubscriptionContext;)Z

    move-result v5

    if-nez v5, :cond_1

    return v3

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method


# virtual methods
.method public dispatch(Lnet/engio/mbassy/bus/MessagePublication;Ljava/lang/Object;Ljava/lang/Iterable;)V
    .locals 1

    .line 41
    invoke-direct {p0, p2}, Lnet/engio/mbassy/dispatch/FilteredMessageDispatcher;->passesFilter(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 42
    invoke-virtual {p0}, Lnet/engio/mbassy/dispatch/DelegatingMessageDispatcher;->getDelegate()Lnet/engio/mbassy/dispatch/IMessageDispatcher;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lnet/engio/mbassy/dispatch/IMessageDispatcher;->dispatch(Lnet/engio/mbassy/bus/MessagePublication;Ljava/lang/Object;Ljava/lang/Iterable;)V

    :cond_0
    return-void
.end method
