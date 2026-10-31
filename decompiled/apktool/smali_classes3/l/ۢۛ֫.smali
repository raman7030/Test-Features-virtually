.class public final Ll/ۢۛ֫;
.super Ljava/lang/Object;
.source "08RN"

# interfaces
.implements Ll/ۛۤ֫;


# instance fields
.field public ֫:Ll/ۧۛ֫;

.field public final ۧ:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 823
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 824
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/ۢۛ֫;->ۧ:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const/4 v0, 0x0

    .line 840
    iput-object v0, p0, Ll/ۢۛ֫;->֫:Ll/ۧۛ֫;

    .line 842
    iget-object v0, p0, Ll/ۢۛ֫;->ۧ:Ljava/util/HashSet;

    invoke-static {v0}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object v1

    .line 844
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    const/4 v0, 0x0

    .line 375
    invoke-virtual {v1, v0}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v0

    .line 845
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧۛ֫;

    .line 846
    invoke-virtual {v1}, Ll/ۧۛ֫;->ᩳ()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;Z)V
    .locals 2

    const/4 v0, 0x0

    .line 852
    iput-object v0, p0, Ll/ۢۛ֫;->֫:Ll/ۧۛ֫;

    .line 854
    iget-object v0, p0, Ll/ۢۛ֫;->ۧ:Ljava/util/HashSet;

    invoke-static {v0}, Ll/ܳ۬ܺ;->copyOf(Ljava/util/Collection;)Ll/ܳ۬ܺ;

    move-result-object v1

    .line 856
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    const/4 v0, 0x0

    .line 375
    invoke-virtual {v1, v0}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v0

    .line 857
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧۛ֫;

    .line 858
    invoke-virtual {v1, p1, p2}, Ll/ۧۛ֫;->֫(Ljava/lang/Exception;Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۧۛ֫;)V
    .locals 2

    .line 863
    iget-object v0, p0, Ll/ۢۛ֫;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 864
    iget-object v1, p0, Ll/ۢۛ֫;->֫:Ll/ۧۛ֫;

    if-ne v1, p1, :cond_0

    const/4 p1, 0x0

    .line 865
    iput-object p1, p0, Ll/ۢۛ֫;->֫:Ll/ۧۛ֫;

    .line 866
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    .line 869
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۧۛ֫;

    iput-object p1, p0, Ll/ۢۛ֫;->֫:Ll/ۧۛ֫;

    .line 870
    invoke-virtual {p1}, Ll/ۧۛ֫;->ܿ()V

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/ۧۛ֫;)V
    .locals 1

    .line 829
    iget-object v0, p0, Ll/ۢۛ֫;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 830
    iget-object v0, p0, Ll/ۢۛ֫;->֫:Ll/ۧۛ֫;

    if-eqz v0, :cond_0

    return-void

    .line 834
    :cond_0
    iput-object p1, p0, Ll/ۢۛ֫;->֫:Ll/ۧۛ֫;

    .line 835
    invoke-virtual {p1}, Ll/ۧۛ֫;->ܿ()V

    return-void
.end method
