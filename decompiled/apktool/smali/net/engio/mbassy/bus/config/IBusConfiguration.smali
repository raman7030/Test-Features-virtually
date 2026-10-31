.class public interface abstract Lnet/engio/mbassy/bus/config/IBusConfiguration;
.super Ljava/lang/Object;
.source "IBusConfiguration.java"


# virtual methods
.method public abstract addFeature(Lnet/engio/mbassy/bus/config/Feature;)Lnet/engio/mbassy/bus/config/IBusConfiguration;
.end method

.method public abstract addPublicationErrorHandler(Lnet/engio/mbassy/bus/error/IPublicationErrorHandler;)Lnet/engio/mbassy/bus/config/BusConfiguration;
.end method

.method public abstract getFeature(Ljava/lang/Class;)Lnet/engio/mbassy/bus/config/Feature;
.end method

.method public abstract getProperty(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract getRegisteredPublicationErrorHandlers()Ljava/util/Collection;
.end method

.method public abstract hasProperty(Ljava/lang/String;)Z
.end method

.method public abstract setProperty(Ljava/lang/String;Ljava/lang/Object;)Lnet/engio/mbassy/bus/config/IBusConfiguration;
.end method
