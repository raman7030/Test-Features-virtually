.class public interface abstract Lnet/engio/mbassy/bus/common/PubSubSupport;
.super Ljava/lang/Object;
.source "PubSubSupport.java"

# interfaces
.implements Lnet/engio/mbassy/bus/common/RuntimeProvider;


# virtual methods
.method public abstract publish(Ljava/lang/Object;)Lnet/engio/mbassy/bus/IMessagePublication;
.end method

.method public abstract subscribe(Ljava/lang/Object;)V
.end method

.method public abstract unsubscribe(Ljava/lang/Object;)Z
.end method
