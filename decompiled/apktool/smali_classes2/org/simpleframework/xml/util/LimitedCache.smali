.class public Lorg/simpleframework/xml/util/LimitedCache;
.super Ljava/util/LinkedHashMap;
.source "LimitedCache.java"

# interfaces
.implements Lorg/simpleframework/xml/util/Cache;


# instance fields
.field public final capacity:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const v0, 0xc350

    .line 46
    invoke-direct {p0, v0}, Lorg/simpleframework/xml/util/LimitedCache;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 58
    iput p1, p0, Lorg/simpleframework/xml/util/LimitedCache;->capacity:I

    return-void
.end method


# virtual methods
.method public cache(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 71
    invoke-virtual {p0, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 0

    .line 110
    invoke-virtual {p0, p1}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public fetch(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 97
    invoke-virtual {p0, p1}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public removeEldestEntry(Ljava/util/Map$Entry;)Z
    .locals 1

    .line 123
    invoke-virtual {p0}, Ljava/util/AbstractMap;->size()I

    move-result p1

    iget v0, p0, Lorg/simpleframework/xml/util/LimitedCache;->capacity:I

    if-le p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public take(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 84
    invoke-virtual {p0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
