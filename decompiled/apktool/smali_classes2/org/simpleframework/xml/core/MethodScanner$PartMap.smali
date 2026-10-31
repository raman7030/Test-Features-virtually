.class public Lorg/simpleframework/xml/core/MethodScanner$PartMap;
.super Ljava/util/LinkedHashMap;
.source "MethodScanner.java"

# interfaces
.implements Ljava/lang/Iterable;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 526
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/simpleframework/xml/core/MethodScanner$1;)V
    .locals 0

    .line 526
    invoke-direct {p0}, Lorg/simpleframework/xml/core/MethodScanner$PartMap;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 536
    invoke-virtual {p0}, Ljava/util/AbstractMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public take(Ljava/lang/String;)Lorg/simpleframework/xml/core/MethodPart;
    .locals 0

    .line 549
    invoke-virtual {p0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/simpleframework/xml/core/MethodPart;

    return-object p1
.end method
