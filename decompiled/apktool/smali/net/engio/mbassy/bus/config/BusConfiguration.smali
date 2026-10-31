.class public Lnet/engio/mbassy/bus/config/BusConfiguration;
.super Ljava/lang/Object;
.source "BusConfiguration.java"

# interfaces
.implements Lnet/engio/mbassy/bus/config/IBusConfiguration;


# instance fields
.field public final properties:Ljava/util/Map;

.field public final publicationErrorHandlers:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lnet/engio/mbassy/bus/config/BusConfiguration;->properties:Ljava/util/Map;

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lnet/engio/mbassy/bus/config/BusConfiguration;->publicationErrorHandlers:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public addFeature(Lnet/engio/mbassy/bus/config/Feature;)Lnet/engio/mbassy/bus/config/IBusConfiguration;
    .locals 2

    .line 44
    iget-object v0, p0, Lnet/engio/mbassy/bus/config/BusConfiguration;->properties:Ljava/util/Map;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final addPublicationErrorHandler(Lnet/engio/mbassy/bus/error/IPublicationErrorHandler;)Lnet/engio/mbassy/bus/config/BusConfiguration;
    .locals 1

    .line 50
    iget-object v0, p0, Lnet/engio/mbassy/bus/config/BusConfiguration;->publicationErrorHandlers:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public getFeature(Ljava/lang/Class;)Lnet/engio/mbassy/bus/config/Feature;
    .locals 1

    .line 39
    iget-object v0, p0, Lnet/engio/mbassy/bus/config/BusConfiguration;->properties:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lnet/engio/mbassy/bus/config/Feature;

    return-object p1
.end method

.method public getProperty(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 29
    iget-object v0, p0, Lnet/engio/mbassy/bus/config/BusConfiguration;->properties:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p0, Lnet/engio/mbassy/bus/config/BusConfiguration;->properties:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p2
.end method

.method public getRegisteredPublicationErrorHandlers()Ljava/util/Collection;
    .locals 1

    .line 56
    iget-object v0, p0, Lnet/engio/mbassy/bus/config/BusConfiguration;->publicationErrorHandlers:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public hasProperty(Ljava/lang/String;)Z
    .locals 1

    .line 34
    iget-object v0, p0, Lnet/engio/mbassy/bus/config/BusConfiguration;->properties:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public setProperty(Ljava/lang/String;Ljava/lang/Object;)Lnet/engio/mbassy/bus/config/IBusConfiguration;
    .locals 1

    .line 23
    iget-object v0, p0, Lnet/engio/mbassy/bus/config/BusConfiguration;->properties:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
