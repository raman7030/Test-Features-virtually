.class public final Ll/ۨۘۖ;
.super Ljava/lang/Object;
.source "X93U"

# interfaces
.implements Ll/ۛۘۖ;


# instance fields
.field public final ֫:Ll/֡ۖۖ;

.field public final ۧ:Ll/᩶᩵ۖ;


# direct methods
.method public constructor <init>(Ll/֡ۖۖ;Ljava/lang/Class;)V
    .locals 3

    .line 2682
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2683
    iput-object p1, p0, Ll/ۨۘۖ;->֫:Ll/֡ۖۖ;

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Class;

    const-string v2, "getDefaultInstance"

    .line 2684
    invoke-static {p2, v2, v1}, Ll/ۘᩴۖ;->֫(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p2

    const/4 v1, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    .line 2686
    invoke-static {p2, v1, v0}, Ll/ۘᩴۖ;->֫(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۘᩴۖ;

    .line 2694
    invoke-virtual {p1}, Ll/֡ۖۖ;->getNumber()I

    move-result p1

    invoke-virtual {p2, p1}, Ll/ۘᩴۖ;->internalGetMapFieldReflection(I)Ll/֫֡ۖ;

    move-result-object p1

    .line 2687
    invoke-virtual {p1}, Ll/֫֡ۖ;->ۧ()Ll/᩶᩵ۖ;

    move-result-object p1

    iput-object p1, p0, Ll/ۨۘۖ;->ۧ:Ll/᩶᩵ۖ;

    return-void
.end method


# virtual methods
.method public final ֫(ILl/ۘᩴۖ;)Ljava/lang/Object;
    .locals 1

    .line 2694
    iget-object v0, p0, Ll/ۨۘۖ;->֫:Ll/֡ۖۖ;

    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-virtual {p2, v0}, Ll/ۘᩴۖ;->internalGetMapFieldReflection(I)Ll/֫֡ۖ;

    move-result-object p2

    .line 2752
    invoke-virtual {p2}, Ll/֫֡ۖ;->֫()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۘᩴۖ;)Ljava/lang/Object;
    .locals 3

    .line 2721
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 2722
    :goto_0
    invoke-virtual {p0, p1}, Ll/ۨۘۖ;->ᩳ(Ll/ۘᩴۖ;)I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 2723
    invoke-virtual {p0, v1, p1}, Ll/ۨۘۖ;->֫(ILl/ۘᩴۖ;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2725
    :cond_0
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/ܳ֡ۖ;
    .locals 1

    .line 2797
    iget-object v0, p0, Ll/ۨۘۖ;->ۧ:Ll/᩶᩵ۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 228
    throw v0
.end method

.method public final ֫(Ll/᩶ۘۖ;I)Ll/ܳ֡ۖ;
    .locals 0

    .line 2807
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Map fields cannot be repeated"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/᩶ۘۖ;)V
    .locals 1

    .line 2702
    iget-object v0, p0, Ll/ۨۘۖ;->֫:Ll/֡ۖۖ;

    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/᩶ۘۖ;->internalGetMutableMapFieldReflection(I)Ll/֫֡ۖ;

    move-result-object p1

    .line 2792
    invoke-virtual {p1}, Ll/֫֡ۖ;->ܽ()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final ֫(Ll/᩶ۘۖ;ILjava/lang/Object;)V
    .locals 2

    .line 2702
    iget-object v0, p0, Ll/ۨۘۖ;->֫:Ll/֡ۖۖ;

    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/᩶ۘۖ;->internalGetMutableMapFieldReflection(I)Ll/֫֡ۖ;

    move-result-object p1

    .line 2762
    invoke-virtual {p1}, Ll/֫֡ۖ;->ܽ()Ljava/util/List;

    move-result-object p1

    check-cast p3, Ll/᩻֡ۖ;

    if-nez p3, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    .line 2709
    :cond_0
    iget-object v0, p0, Ll/ۨۘۖ;->ۧ:Ll/᩶᩵ۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {v0}, Ll/᩶᩵ۖ;->toBuilder()Ll/᩹᩵ۖ;

    move-result-object v0

    .line 2716
    invoke-interface {v0, p3}, Ll/ܳ֡ۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;

    move-result-object p3

    invoke-interface {p3}, Ll/ܳ֡ۖ;->build()Ll/᩻֡ۖ;

    move-result-object p3

    .line 2762
    :goto_0
    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, p2, p3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ll/᩶ۘۖ;Ljava/lang/Object;)V
    .locals 1

    .line 2744
    invoke-virtual {p0, p1}, Ll/ۨۘۖ;->֫(Ll/᩶ۘۖ;)V

    .line 2745
    check-cast p2, Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 2746
    invoke-virtual {p0, p1, v0}, Ll/ۨۘۖ;->ۧ(Ll/᩶ۘۖ;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ(Ll/᩶ۘۖ;)Ljava/lang/Object;
    .locals 3

    .line 2730
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 2731
    :goto_0
    invoke-virtual {p0, p1}, Ll/ۨۘۖ;->ܿ(Ll/᩶ۘۖ;)I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 2732
    invoke-virtual {p0, p1, v1}, Ll/ۨۘۖ;->ۧ(Ll/᩶ۘۖ;I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2734
    :cond_0
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/᩶ۘۖ;I)Ljava/lang/Object;
    .locals 1

    .line 2698
    iget-object v0, p0, Ll/ۨۘۖ;->֫:Ll/֡ۖۖ;

    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/᩶ۘۖ;->internalGetMapFieldReflection(I)Ll/֫֡ۖ;

    move-result-object p1

    .line 2757
    invoke-virtual {p1}, Ll/֫֡ۖ;->֫()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/᩶ۘۖ;Ljava/lang/Object;)V
    .locals 2

    .line 2702
    iget-object v0, p0, Ll/ۨۘۖ;->֫:Ll/֡ۖۖ;

    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/᩶ۘۖ;->internalGetMutableMapFieldReflection(I)Ll/֫֡ۖ;

    move-result-object p1

    .line 2767
    invoke-virtual {p1}, Ll/֫֡ۖ;->ܽ()Ljava/util/List;

    move-result-object p1

    check-cast p2, Ll/᩻֡ۖ;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    .line 2709
    :cond_0
    iget-object v0, p0, Ll/ۨۘۖ;->ۧ:Ll/᩶᩵ۖ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 27
    :cond_1
    invoke-virtual {v0}, Ll/᩶᩵ۖ;->toBuilder()Ll/᩹᩵ۖ;

    move-result-object v0

    .line 2716
    invoke-interface {v0, p2}, Ll/ܳ֡ۖ;->mergeFrom(Ll/᩻֡ۖ;)Ll/ܳ֡ۖ;

    move-result-object p2

    invoke-interface {p2}, Ll/ܳ֡ۖ;->build()Ll/᩻֡ۖ;

    move-result-object p2

    .line 2767
    :goto_0
    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ۧ(Ll/ۘᩴۖ;)Z
    .locals 1

    .line 2772
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "hasField() is not supported for repeated fields."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܽ(Ll/ۘᩴۖ;)Ljava/lang/Object;
    .locals 0

    .line 2739
    invoke-virtual {p0, p1}, Ll/ۨۘۖ;->֫(Ll/ۘᩴۖ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ(Ll/᩶ۘۖ;)Z
    .locals 1

    .line 2777
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "hasField() is not supported for repeated fields."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܿ(Ll/᩶ۘۖ;)I
    .locals 1

    .line 2698
    iget-object v0, p0, Ll/ۨۘۖ;->֫:Ll/֡ۖۖ;

    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/᩶ۘۖ;->internalGetMapFieldReflection(I)Ll/֫֡ۖ;

    move-result-object p1

    .line 2787
    invoke-virtual {p1}, Ll/֫֡ۖ;->֫()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    return p1
.end method

.method public final ᩳ(Ll/ۘᩴۖ;)I
    .locals 1

    .line 2694
    iget-object v0, p0, Ll/ۨۘۖ;->֫:Ll/֡ۖۖ;

    invoke-virtual {v0}, Ll/֡ۖۖ;->getNumber()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۘᩴۖ;->internalGetMapFieldReflection(I)Ll/֫֡ۖ;

    move-result-object p1

    .line 2782
    invoke-virtual {p1}, Ll/֫֡ۖ;->֫()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    return p1
.end method

.method public final ᩳ(Ll/᩶ۘۖ;)Ll/ܳ֡ۖ;
    .locals 1

    .line 2802
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Nested builder not supported for map fields."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
