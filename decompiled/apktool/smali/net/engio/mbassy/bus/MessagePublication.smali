.class public Lnet/engio/mbassy/bus/MessagePublication;
.super Ljava/lang/Object;
.source "MessagePublication.java"

# interfaces
.implements Lnet/engio/mbassy/bus/IMessagePublication;


# instance fields
.field public volatile dispatched:Z

.field public error:Lnet/engio/mbassy/bus/error/PublicationError;

.field public final message:Ljava/lang/Object;

.field public final runtime:Lnet/engio/mbassy/bus/BusRuntime;

.field public volatile state:Lnet/engio/mbassy/bus/MessagePublication$State;

.field public final subscriptions:Ljava/util/Collection;


# direct methods
.method public constructor <init>(Lnet/engio/mbassy/bus/BusRuntime;Ljava/util/Collection;Ljava/lang/Object;Lnet/engio/mbassy/bus/MessagePublication$State;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    sget-object v0, Lnet/engio/mbassy/bus/MessagePublication$State;->Initial:Lnet/engio/mbassy/bus/MessagePublication$State;

    iput-object v0, p0, Lnet/engio/mbassy/bus/MessagePublication;->state:Lnet/engio/mbassy/bus/MessagePublication$State;

    const/4 v0, 0x0

    .line 27
    iput-boolean v0, p0, Lnet/engio/mbassy/bus/MessagePublication;->dispatched:Z

    const/4 v0, 0x0

    .line 29
    iput-object v0, p0, Lnet/engio/mbassy/bus/MessagePublication;->error:Lnet/engio/mbassy/bus/error/PublicationError;

    .line 33
    iput-object p1, p0, Lnet/engio/mbassy/bus/MessagePublication;->runtime:Lnet/engio/mbassy/bus/BusRuntime;

    .line 34
    iput-object p2, p0, Lnet/engio/mbassy/bus/MessagePublication;->subscriptions:Ljava/util/Collection;

    .line 35
    iput-object p3, p0, Lnet/engio/mbassy/bus/MessagePublication;->message:Ljava/lang/Object;

    .line 36
    iput-object p4, p0, Lnet/engio/mbassy/bus/MessagePublication;->state:Lnet/engio/mbassy/bus/MessagePublication$State;

    return-void
.end method


# virtual methods
.method public add(Lnet/engio/mbassy/subscription/Subscription;)Z
    .locals 1

    .line 40
    iget-object v0, p0, Lnet/engio/mbassy/bus/MessagePublication;->subscriptions:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public execute()V
    .locals 3

    .line 47
    sget-object v0, Lnet/engio/mbassy/bus/MessagePublication$State;->Running:Lnet/engio/mbassy/bus/MessagePublication$State;

    iput-object v0, p0, Lnet/engio/mbassy/bus/MessagePublication;->state:Lnet/engio/mbassy/bus/MessagePublication$State;

    .line 48
    iget-object v0, p0, Lnet/engio/mbassy/bus/MessagePublication;->subscriptions:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lnet/engio/mbassy/subscription/Subscription;

    .line 49
    iget-object v2, p0, Lnet/engio/mbassy/bus/MessagePublication;->message:Ljava/lang/Object;

    invoke-virtual {v1, p0, v2}, Lnet/engio/mbassy/subscription/Subscription;->publish(Lnet/engio/mbassy/bus/MessagePublication;Ljava/lang/Object;)V

    goto :goto_0

    .line 51
    :cond_0
    sget-object v0, Lnet/engio/mbassy/bus/MessagePublication$State;->Finished:Lnet/engio/mbassy/bus/MessagePublication$State;

    iput-object v0, p0, Lnet/engio/mbassy/bus/MessagePublication;->state:Lnet/engio/mbassy/bus/MessagePublication$State;

    .line 57
    iget-boolean v0, p0, Lnet/engio/mbassy/bus/MessagePublication;->dispatched:Z

    if-nez v0, :cond_2

    .line 58
    invoke-virtual {p0}, Lnet/engio/mbassy/bus/MessagePublication;->isFilteredMessage()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lnet/engio/mbassy/bus/MessagePublication;->isDeadMessage()Z

    move-result v0

    if-nez v0, :cond_1

    .line 59
    iget-object v0, p0, Lnet/engio/mbassy/bus/MessagePublication;->runtime:Lnet/engio/mbassy/bus/BusRuntime;

    invoke-virtual {v0}, Lnet/engio/mbassy/bus/BusRuntime;->getProvider()Lnet/engio/mbassy/bus/common/PubSubSupport;

    move-result-object v0

    new-instance v1, Lnet/engio/mbassy/bus/common/FilteredMessage;

    iget-object v2, p0, Lnet/engio/mbassy/bus/MessagePublication;->message:Ljava/lang/Object;

    invoke-direct {v1, v2}, Lnet/engio/mbassy/bus/common/FilteredMessage;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lnet/engio/mbassy/bus/common/PubSubSupport;->publish(Ljava/lang/Object;)Lnet/engio/mbassy/bus/IMessagePublication;

    return-void

    .line 60
    :cond_1
    invoke-virtual {p0}, Lnet/engio/mbassy/bus/MessagePublication;->isDeadMessage()Z

    move-result v0

    if-nez v0, :cond_2

    .line 61
    iget-object v0, p0, Lnet/engio/mbassy/bus/MessagePublication;->runtime:Lnet/engio/mbassy/bus/BusRuntime;

    invoke-virtual {v0}, Lnet/engio/mbassy/bus/BusRuntime;->getProvider()Lnet/engio/mbassy/bus/common/PubSubSupport;

    move-result-object v0

    new-instance v1, Lnet/engio/mbassy/bus/common/DeadMessage;

    iget-object v2, p0, Lnet/engio/mbassy/bus/MessagePublication;->message:Ljava/lang/Object;

    invoke-direct {v1, v2}, Lnet/engio/mbassy/bus/common/DeadMessage;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lnet/engio/mbassy/bus/common/PubSubSupport;->publish(Ljava/lang/Object;)Lnet/engio/mbassy/bus/IMessagePublication;

    :cond_2
    return-void
.end method

.method public getError()Lnet/engio/mbassy/bus/error/PublicationError;
    .locals 1

    .line 85
    iget-object v0, p0, Lnet/engio/mbassy/bus/MessagePublication;->error:Lnet/engio/mbassy/bus/error/PublicationError;

    return-object v0
.end method

.method public getMessage()Ljava/lang/Object;
    .locals 1

    .line 111
    iget-object v0, p0, Lnet/engio/mbassy/bus/MessagePublication;->message:Ljava/lang/Object;

    return-object v0
.end method

.method public hasError()Z
    .locals 1

    .line 80
    iget-object v0, p0, Lnet/engio/mbassy/bus/MessagePublication;->error:Lnet/engio/mbassy/bus/error/PublicationError;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isDeadMessage()Z
    .locals 2

    .line 103
    iget-object v0, p0, Lnet/engio/mbassy/bus/MessagePublication;->message:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lnet/engio/mbassy/bus/common/DeadMessage;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isFilteredMessage()Z
    .locals 2

    .line 107
    iget-object v0, p0, Lnet/engio/mbassy/bus/MessagePublication;->message:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lnet/engio/mbassy/bus/common/FilteredMessage;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isFinished()Z
    .locals 2

    .line 68
    iget-object v0, p0, Lnet/engio/mbassy/bus/MessagePublication;->state:Lnet/engio/mbassy/bus/MessagePublication$State;

    sget-object v1, Lnet/engio/mbassy/bus/MessagePublication$State;->Finished:Lnet/engio/mbassy/bus/MessagePublication$State;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isRunning()Z
    .locals 2

    .line 72
    iget-object v0, p0, Lnet/engio/mbassy/bus/MessagePublication;->state:Lnet/engio/mbassy/bus/MessagePublication$State;

    sget-object v1, Lnet/engio/mbassy/bus/MessagePublication$State;->Running:Lnet/engio/mbassy/bus/MessagePublication$State;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isScheduled()Z
    .locals 2

    .line 76
    iget-object v0, p0, Lnet/engio/mbassy/bus/MessagePublication;->state:Lnet/engio/mbassy/bus/MessagePublication$State;

    sget-object v1, Lnet/engio/mbassy/bus/MessagePublication$State;->Scheduled:Lnet/engio/mbassy/bus/MessagePublication$State;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public markDispatched()V
    .locals 1

    const/4 v0, 0x1

    .line 89
    iput-boolean v0, p0, Lnet/engio/mbassy/bus/MessagePublication;->dispatched:Z

    return-void
.end method

.method public markError(Lnet/engio/mbassy/bus/error/PublicationError;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lnet/engio/mbassy/bus/MessagePublication;->error:Lnet/engio/mbassy/bus/error/PublicationError;

    return-void
.end method

.method public markScheduled()Lnet/engio/mbassy/bus/MessagePublication;
    .locals 2

    .line 96
    iget-object v0, p0, Lnet/engio/mbassy/bus/MessagePublication;->state:Lnet/engio/mbassy/bus/MessagePublication$State;

    sget-object v1, Lnet/engio/mbassy/bus/MessagePublication$State;->Initial:Lnet/engio/mbassy/bus/MessagePublication$State;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    sget-object v0, Lnet/engio/mbassy/bus/MessagePublication$State;->Scheduled:Lnet/engio/mbassy/bus/MessagePublication$State;

    iput-object v0, p0, Lnet/engio/mbassy/bus/MessagePublication;->state:Lnet/engio/mbassy/bus/MessagePublication$State;

    :cond_0
    return-object p0
.end method
