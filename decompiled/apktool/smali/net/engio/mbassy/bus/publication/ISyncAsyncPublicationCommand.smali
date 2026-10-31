.class public interface abstract Lnet/engio/mbassy/bus/publication/ISyncAsyncPublicationCommand;
.super Ljava/lang/Object;
.source "ISyncAsyncPublicationCommand.java"

# interfaces
.implements Lnet/engio/mbassy/bus/publication/IPublicationCommand;


# virtual methods
.method public abstract asynchronously()Lnet/engio/mbassy/bus/IMessagePublication;
.end method

.method public abstract asynchronously(JLjava/util/concurrent/TimeUnit;)Lnet/engio/mbassy/bus/IMessagePublication;
.end method
