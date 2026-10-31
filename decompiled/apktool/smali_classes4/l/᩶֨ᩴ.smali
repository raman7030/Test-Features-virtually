.class public final synthetic Ll/᩶֨ᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V
    .locals 1

    instance-of v0, p0, Ll/ۙ֨ᩴ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/ۙ֨ᩴ;

    invoke-interface {p0, p1}, Ll/ۙ֨ᩴ;->forEach(Ljava/util/function/Consumer;)V

    return-void

    :cond_0
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_2

    check-cast p0, Ljava/util/Collection;

    .line 663
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 664
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 665
    invoke-interface {p1, v0}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-void

    .line 0
    :cond_2
    invoke-static {p0, p1}, Ll/᩹֨ᩴ;->$default$forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public static spliterator(Ljava/lang/Iterable;)Ll/ܶ۫ᩴ;
    .locals 1

    instance-of v0, p0, Ll/ۙ֨ᩴ;

    if-eqz v0, :cond_0

    check-cast p0, Ll/ۙ֨ᩴ;

    invoke-interface {p0}, Ll/ۙ֨ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Ljava/util/LinkedHashSet;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/util/LinkedHashSet;

    const/16 v0, 0x11

    .line 196
    invoke-static {p0, v0}, Ll/᩹۫ᩴ;->spliterator(Ljava/util/Collection;I)Ll/ܶ۫ᩴ;

    move-result-object p0

    return-object p0

    .line 0
    :cond_1
    instance-of v0, p0, Ljava/util/SortedSet;

    if-eqz v0, :cond_2

    check-cast p0, Ljava/util/SortedSet;

    .line 256
    new-instance v0, Ll/ۘۨᩴ;

    invoke-direct {v0, p0, p0}, Ll/ۘۨᩴ;-><init>(Ljava/util/SortedSet;Ljava/util/Collection;)V

    return-object v0

    .line 0
    :cond_2
    instance-of v0, p0, Ljava/util/Set;

    if-eqz v0, :cond_3

    check-cast p0, Ljava/util/Set;

    invoke-static {p0}, Ll/ۢ۫ᩴ;->$default$spliterator(Ljava/util/Set;)Ll/ܶ۫ᩴ;

    move-result-object p0

    return-object p0

    :cond_3
    instance-of v0, p0, Ljava/util/List;

    if-eqz v0, :cond_4

    check-cast p0, Ljava/util/List;

    invoke-static {p0}, Ll/ۤ۬ᩴ;->$default$spliterator(Ljava/util/List;)Ll/ܶ۫ᩴ;

    move-result-object p0

    return-object p0

    :cond_4
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_5

    check-cast p0, Ljava/util/Collection;

    invoke-static {p0}, Ll/֡۬ᩴ;->$default$spliterator(Ljava/util/Collection;)Ll/ܶ۫ᩴ;

    move-result-object p0

    return-object p0

    .line 101
    :cond_5
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ll/᩹۫ᩴ;->b(Ljava/util/Iterator;I)Ll/ܳۨᩴ;

    move-result-object p0

    return-object p0
.end method
