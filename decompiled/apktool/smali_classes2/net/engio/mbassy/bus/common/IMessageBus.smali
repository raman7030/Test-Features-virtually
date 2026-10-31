.class public interface abstract Lnet/engio/mbassy/bus/common/IMessageBus;
.super Ljava/lang/Object;
.source "IMessageBus.java"

# interfaces
.implements Lnet/engio/mbassy/bus/common/GenericMessagePublicationSupport;


# virtual methods
.method public abstract hasPendingMessages()Z
.end method

.method public abstract post(Ljava/lang/Object;)Lnet/engio/mbassy/bus/publication/ISyncAsyncPublicationCommand;
.end method

.method public abstract shutdown()V
.end method
