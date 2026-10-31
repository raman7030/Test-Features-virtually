.class public Lnet/engio/mbassy/common/StrongConcurrentSet$1;
.super Ljava/lang/Object;
.source "StrongConcurrentSet.java"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public current:Lnet/engio/mbassy/common/ISetEntry;

.field public final synthetic this$0:Lnet/engio/mbassy/common/StrongConcurrentSet;


# direct methods
.method public constructor <init>(Lnet/engio/mbassy/common/StrongConcurrentSet;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lnet/engio/mbassy/common/StrongConcurrentSet$1;->this$0:Lnet/engio/mbassy/common/StrongConcurrentSet;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iget-object p1, p1, Lnet/engio/mbassy/common/AbstractConcurrentSet;->head:Lnet/engio/mbassy/common/AbstractConcurrentSet$Entry;

    iput-object p1, p0, Lnet/engio/mbassy/common/StrongConcurrentSet$1;->current:Lnet/engio/mbassy/common/ISetEntry;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .line 27
    iget-object v0, p0, Lnet/engio/mbassy/common/StrongConcurrentSet$1;->current:Lnet/engio/mbassy/common/ISetEntry;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2

    .line 31
    iget-object v0, p0, Lnet/engio/mbassy/common/StrongConcurrentSet$1;->current:Lnet/engio/mbassy/common/ISetEntry;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 35
    :cond_0
    invoke-interface {v0}, Lnet/engio/mbassy/common/ISetEntry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 36
    iget-object v1, p0, Lnet/engio/mbassy/common/StrongConcurrentSet$1;->current:Lnet/engio/mbassy/common/ISetEntry;

    invoke-interface {v1}, Lnet/engio/mbassy/common/ISetEntry;->next()Lnet/engio/mbassy/common/ISetEntry;

    move-result-object v1

    iput-object v1, p0, Lnet/engio/mbassy/common/StrongConcurrentSet$1;->current:Lnet/engio/mbassy/common/ISetEntry;

    return-object v0
.end method

.method public remove()V
    .locals 3

    .line 42
    iget-object v0, p0, Lnet/engio/mbassy/common/StrongConcurrentSet$1;->current:Lnet/engio/mbassy/common/ISetEntry;

    if-nez v0, :cond_0

    return-void

    .line 45
    :cond_0
    invoke-interface {v0}, Lnet/engio/mbassy/common/ISetEntry;->next()Lnet/engio/mbassy/common/ISetEntry;

    move-result-object v0

    .line 46
    iget-object v1, p0, Lnet/engio/mbassy/common/StrongConcurrentSet$1;->this$0:Lnet/engio/mbassy/common/StrongConcurrentSet;

    iget-object v2, p0, Lnet/engio/mbassy/common/StrongConcurrentSet$1;->current:Lnet/engio/mbassy/common/ISetEntry;

    invoke-interface {v2}, Lnet/engio/mbassy/common/ISetEntry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Lnet/engio/mbassy/common/AbstractConcurrentSet;->remove(Ljava/lang/Object;)Z

    .line 47
    iput-object v0, p0, Lnet/engio/mbassy/common/StrongConcurrentSet$1;->current:Lnet/engio/mbassy/common/ISetEntry;

    return-void
.end method
