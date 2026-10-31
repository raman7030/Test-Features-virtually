.class public Lorg/simpleframework/xml/core/ContactMap;
.super Ljava/util/LinkedHashMap;
.source "ContactMap.java"

# interfaces
.implements Ljava/lang/Iterable;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 42
    invoke-virtual {p0}, Ljava/util/AbstractMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
