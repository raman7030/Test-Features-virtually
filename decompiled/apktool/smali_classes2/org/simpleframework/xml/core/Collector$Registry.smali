.class public Lorg/simpleframework/xml/core/Collector$Registry;
.super Ljava/util/LinkedHashMap;
.source "Collector.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 179
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/simpleframework/xml/core/Collector$1;)V
    .locals 0

    .line 179
    invoke-direct {p0}, Lorg/simpleframework/xml/core/Collector$Registry;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 189
    invoke-virtual {p0}, Ljava/util/AbstractMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
