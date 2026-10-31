.class public final Ll/ۙۚ֡;
.super Ljava/lang/Object;
.source "A7SG"


# instance fields
.field public ֫:Ljava/util/ArrayList;


# virtual methods
.method public final ֫()Ljava/util/List;
    .locals 1

    .line 20
    iget-object v0, p0, Ll/ۙۚ֡;->֫:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    return-object v0

    .line 0
    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method public final ֫(Ljava/util/List;)V
    .locals 8

    .line 30
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 34
    :cond_0
    iget-object v0, p0, Ll/ۙۚ֡;->֫:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۙۚ֡;->֫:Ljava/util/ArrayList;

    .line 38
    :cond_1
    iget-object v0, p0, Ll/ۙۚ֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 39
    iget-object v0, p0, Ll/ۙۚ֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void

    .line 41
    :cond_2
    iget-object v0, p0, Ll/ۙۚ֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    .line 42
    iget-object v2, p0, Ll/ۙۚ֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶ۚ֡;

    const/4 v3, 0x0

    .line 43
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩶ۚ֡;

    .line 44
    invoke-virtual {v2}, Ll/᩶ۚ֡;->ۧ()I

    move-result v4

    invoke-virtual {v2}, Ll/᩶ۚ֡;->ܽ()I

    move-result v5

    add-int/2addr v5, v4

    invoke-virtual {v3}, Ll/᩶ۚ֡;->ۧ()I

    move-result v4

    if-ne v5, v4, :cond_3

    .line 45
    iget-object v4, p0, Ll/ۙۚ֡;->֫:Ljava/util/ArrayList;

    .line 48
    invoke-virtual {v2}, Ll/᩶ۚ֡;->ᩳ()I

    move-result v5

    .line 49
    invoke-virtual {v2}, Ll/᩶ۚ֡;->֫()I

    move-result v6

    .line 50
    invoke-virtual {v2}, Ll/᩶ۚ֡;->ۧ()I

    move-result v7

    .line 51
    invoke-virtual {v2}, Ll/᩶ۚ֡;->ܽ()I

    move-result v2

    invoke-virtual {v3}, Ll/᩶ۚ֡;->ܽ()I

    move-result v3

    add-int/2addr v3, v2

    .line 47
    invoke-static {v5, v6, v7, v3}, Ll/᩶ۚ֡;->֫(IIII)Ll/᩶ۚ֡;

    move-result-object v2

    .line 45
    invoke-virtual {v4, v0, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 52
    iget-object v0, p0, Ll/ۙۚ֡;->֫:Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {p1, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void

    .line 54
    :cond_3
    iget-object v0, p0, Ll/ۙۚ֡;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final ۧ(Ljava/util/List;)V
    .locals 1

    .line 24
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֡ۚ֡;

    .line 25
    invoke-virtual {v0}, Ll/֡ۚ֡;->ܳ()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۙۚ֡;->֫(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    return-void
.end method
