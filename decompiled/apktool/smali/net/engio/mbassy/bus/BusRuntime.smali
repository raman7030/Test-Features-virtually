.class public Lnet/engio/mbassy/bus/BusRuntime;
.super Ljava/lang/Object;
.source "BusRuntime.java"


# instance fields
.field public properties:Ljava/util/Map;

.field public provider:Lnet/engio/mbassy/bus/common/PubSubSupport;


# direct methods
.method public constructor <init>(Lnet/engio/mbassy/bus/common/PubSubSupport;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lnet/engio/mbassy/bus/BusRuntime;->properties:Ljava/util/Map;

    .line 28
    iput-object p1, p0, Lnet/engio/mbassy/bus/BusRuntime;->provider:Lnet/engio/mbassy/bus/common/PubSubSupport;

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/String;Ljava/lang/Object;)Lnet/engio/mbassy/bus/BusRuntime;
    .locals 1

    .line 46
    iget-object v0, p0, Lnet/engio/mbassy/bus/BusRuntime;->properties:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public contains(Ljava/lang/String;)Z
    .locals 1

    .line 51
    iget-object v0, p0, Lnet/engio/mbassy/bus/BusRuntime;->properties:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public get(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 32
    invoke-virtual {p0, p1}, Lnet/engio/mbassy/bus/BusRuntime;->contains(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 34
    iget-object v0, p0, Lnet/engio/mbassy/bus/BusRuntime;->properties:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 33
    :cond_0
    new-instance v0, Lnet/engio/mbassy/bus/error/MissingPropertyException;

    const-string v1, "The property "

    const-string v2, " is not available in this runtime"

    .line 0
    invoke-static {v1, p1, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 33
    invoke-direct {v0, p1}, Lnet/engio/mbassy/bus/error/MissingPropertyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getKeys()Ljava/util/Collection;
    .locals 1

    .line 42
    iget-object v0, p0, Lnet/engio/mbassy/bus/BusRuntime;->properties:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getProvider()Lnet/engio/mbassy/bus/common/PubSubSupport;
    .locals 1

    .line 38
    iget-object v0, p0, Lnet/engio/mbassy/bus/BusRuntime;->provider:Lnet/engio/mbassy/bus/common/PubSubSupport;

    return-object v0
.end method
