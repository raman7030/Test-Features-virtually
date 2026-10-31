.class public abstract Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;
.super Ljava/lang/Object;
.source "AbstractConcurrentSet.java"

# interfaces
.implements Lnet/engio/mbassy/common/ISetEntry;


# instance fields
.field public next:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

.field public predecessor:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 206
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;)V
    .locals 0

    .line 201
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 202
    iput-object p1, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;->next:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    .line 203
    iput-object p0, p1, Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;->predecessor:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    const/4 v0, 0x0

    .line 233
    iput-object v0, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;->next:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    return-void
.end method

.method public next()Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;
    .locals 1

    .line 228
    iget-object v0, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;->next:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    return-object v0
.end method

.method public bridge synthetic next()Lnet/engio/mbassy/common/ISetEntry;
    .locals 1

    .line 195
    invoke-virtual {p0}, Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;->next()Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    .line 212
    iget-object v0, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;->predecessor:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    if-eqz v0, :cond_0

    .line 213
    iget-object v1, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;->next:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    iput-object v1, v0, Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;->next:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    .line 214
    iget-object v1, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;->next:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    if-eqz v1, :cond_1

    .line 215
    iput-object v0, v1, Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;->predecessor:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    return-void

    .line 217
    :cond_0
    iget-object v0, p0, Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;->next:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 218
    iput-object v1, v0, Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;->predecessor:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    :cond_1
    return-void
.end method
