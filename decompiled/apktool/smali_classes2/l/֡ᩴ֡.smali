.class public final Ll/֡ᩴ֡;
.super Ljava/lang/Object;
.source "I8YZ"

# interfaces
.implements Ll/֡֨֡;


# virtual methods
.method public final ֫()C
    .locals 1

    const/16 v0, 0x7e

    return v0
.end method

.method public final ֫(Ll/ܺ᩵֡;Ll/ܺ᩵֡;)I
    .locals 7

    .line 49
    iget-object v0, p1, Ll/ܺ᩵֡;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v2, p2, Ll/ܺ᩵֡;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    if-ne v1, v3, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x2

    if-gt v1, v3, :cond_2

    .line 43
    invoke-virtual {p1}, Ll/ܺ᩵֡;->ܽ()Ll/۬ۚ֡;

    move-result-object v1

    .line 49
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v5, 0x1

    if-ne v3, v5, :cond_0

    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    :goto_0
    new-instance v3, Ll/ۘᩴ֡;

    .line 6
    invoke-direct {v3}, Ll/֡ۚ֡;-><init>()V

    .line 52
    new-instance v5, Ll/ۙۚ֡;

    .line 11
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 49
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    .line 53
    invoke-virtual {p1, v6}, Ll/ܺ᩵֡;->ۧ(I)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v5, p1}, Ll/ۙۚ֡;->ۧ(Ljava/util/List;)V

    .line 64
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬ۚ֡;

    .line 55
    invoke-static {v1, p1}, Ll/۠ۚ֡;->֫(Ll/۬ۚ֡;Ll/۬ۚ֡;)Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡ۚ֡;

    .line 56
    invoke-virtual {v3, v4}, Ll/֡ۚ֡;->֫(Ll/֡ۚ֡;)V

    .line 57
    invoke-virtual {v4}, Ll/֡ۚ֡;->ܳ()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v5, v4}, Ll/ۙۚ֡;->֫(Ljava/util/List;)V

    goto :goto_1

    .line 49
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p1

    .line 60
    invoke-virtual {p2, p1}, Ll/ܺ᩵֡;->֫(I)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v5, p1}, Ll/ۙۚ֡;->ۧ(Ljava/util/List;)V

    .line 61
    invoke-virtual {v5}, Ll/ۙۚ֡;->֫()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v3, p1}, Ll/֡ۚ֡;->֫(Ljava/util/List;)V

    .line 63
    invoke-virtual {v1, v3}, Ll/֡ۚ֡;->ۧ(Ll/֡ۚ֡;)V

    .line 49
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    return p1

    :cond_2
    return v4
.end method

.method public final ۧ()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()C
    .locals 1

    const/16 v0, 0x7e

    return v0
.end method
