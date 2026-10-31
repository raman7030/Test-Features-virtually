.class public Lnet/engio/mbassy/common/WeakConcurrentSet;
.super Lnet/engio/mbassy/common/AbstractConcurrentSet;
.source "WeakConcurrentSet.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    invoke-direct {p0, v0}, Lnet/engio/mbassy/common/AbstractConcurrentSet;-><init>(Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public createEntry(Ljava/lang/Object;Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;)Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;
    .locals 2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 95
    new-instance v1, Lnet/engio/mbassy/common/WeakConcurrentSet$WeakEntry;

    invoke-direct {v1, p1, p2, v0}, Lnet/engio/mbassy/common/WeakConcurrentSet$WeakEntry;-><init>(Ljava/lang/Object;Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;Lnet/engio/mbassy/common/WeakConcurrentSet$1;)V

    return-object v1

    :cond_0
    new-instance p2, Lnet/engio/mbassy/common/WeakConcurrentSet$WeakEntry;

    invoke-direct {p2, p1, v0}, Lnet/engio/mbassy/common/WeakConcurrentSet$WeakEntry;-><init>(Ljava/lang/Object;Lnet/engio/mbassy/common/WeakConcurrentSet$1;)V

    return-object p2
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 27
    new-instance v0, Lnet/engio/mbassy/common/WeakConcurrentSet$1;

    invoke-direct {v0, p0}, Lnet/engio/mbassy/common/WeakConcurrentSet$1;-><init>(Lnet/engio/mbassy/common/WeakConcurrentSet;)V

    return-object v0
.end method
