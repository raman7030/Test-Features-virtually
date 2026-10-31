.class public Lnet/engio/mbassy/common/WeakConcurrentSet$WeakEntry;
.super Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;
.source "WeakConcurrentSet.java"


# instance fields
.field public value:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .line 109
    invoke-direct {p0}, Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;-><init>()V

    .line 110
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lnet/engio/mbassy/common/WeakConcurrentSet$WeakEntry;->value:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;)V
    .locals 0

    .line 104
    invoke-direct {p0, p2}, Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;-><init>(Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;)V

    .line 105
    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lnet/engio/mbassy/common/WeakConcurrentSet$WeakEntry;->value:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;Lnet/engio/mbassy/common/WeakConcurrentSet$1;)V
    .locals 0

    .line 99
    invoke-direct {p0, p1, p2}, Lnet/engio/mbassy/common/WeakConcurrentSet$WeakEntry;-><init>(Ljava/lang/Object;Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lnet/engio/mbassy/common/WeakConcurrentSet$1;)V
    .locals 0

    .line 99
    invoke-direct {p0, p1}, Lnet/engio/mbassy/common/WeakConcurrentSet$WeakEntry;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getValue()Ljava/lang/Object;
    .locals 1

    .line 115
    iget-object v0, p0, Lnet/engio/mbassy/common/WeakConcurrentSet$WeakEntry;->value:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
