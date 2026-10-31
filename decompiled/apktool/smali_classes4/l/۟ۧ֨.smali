.class public Ll/۟ۧ֨;
.super Ll/ۢܽ֨;
.source "M7E7"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ll/ۗܽ֨;
.implements Ll/ۙ֨ᩴ;


# instance fields
.field public ۗ֫:Ll/ۨܽ֨;

.field public final ۙ֫:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ll/ۨܽ֨;Ljava/lang/Class;I)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ll/ۢܽ֨;-><init>()V

    .line 39
    iput-object p1, p0, Ll/۟ۧ֨;->ۗ֫:Ll/ۨܽ֨;

    .line 40
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Ll/۟ۧ֨;->ۙ֫:Ljava/util/ArrayList;

    .line 41
    invoke-static {p2}, Ll/֨۟ۚ;->֫(Ljava/lang/Class;)Ll/֨۟ۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ۢܽ֨;->᩵֫:Ll/֨۟ۚ;

    return-void
.end method


# virtual methods
.method public final forEach(Ljava/util/function/Consumer;)V
    .locals 1

    .line 156
    iget-object v0, p0, Ll/۟ۧ֨;->ۙ֫:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 151
    iget-object v0, p0, Ll/۟ۧ֨;->ۙ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/۟ۧ֨;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    .line 161
    iget-object v0, p0, Ll/۟ۧ֨;->ۙ֫:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۛ۬ᩴ;->spliterator(Ljava/util/List;)Ll/ܶ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final ֨()Z
    .locals 3

    .line 45
    iget-object v0, p0, Ll/۟ۧ֨;->ۙ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ll/ۗܽ֨;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v2
.end method

.method public final ֫(I)V
    .locals 3

    if-lez p1, :cond_0

    .line 111
    invoke-virtual {p0}, Ll/۟ۧ֨;->֨()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 112
    iget-object v0, p0, Ll/۟ۧ֨;->ۙ֫:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۨۧ֨;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ۨۧ֨;-><init>(I)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/᩺ۧ֨;

    invoke-direct {v1, p1}, Ll/᩺ۧ֨;-><init>(I)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->peek(Ljava/util/function/Consumer;)Ll/ܿ᩺ᩴ;

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۢܽ֨;)V
    .locals 2

    .line 69
    instance-of v0, p1, Ll/ۨܽ֨;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ll/ۨܽ֨;

    .line 70
    iget-object v1, p0, Ll/۟ۧ֨;->ۗ֫:Ll/ۨܽ֨;

    .line 53
    iput-object v1, v0, Ll/ۨܽ֨;->ۧۧ:Ll/ۨܽ֨;

    .line 72
    :cond_0
    iget-object v0, p0, Ll/۟ۧ֨;->ۙ֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public ۧ()V
    .locals 7

    .line 76
    iget-object v0, p0, Ll/۟ۧ֨;->ۙ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_2

    .line 52
    iget-object v2, p0, Ll/ۢܽ֨;->᩵֫:Ll/֨۟ۚ;

    invoke-virtual {v2}, Ll/֨۟ۚ;->ܿ()Z

    move-result v2

    .line 53
    invoke-virtual {p0}, Ll/۟ۧ֨;->ᩳ()I

    move-result v3

    invoke-virtual {p0, v3}, Ll/۟ۧ֨;->֫(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    .line 55
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۢܽ֨;

    .line 56
    instance-of v5, v4, Ll/ۗܽ֨;

    if-eqz v5, :cond_0

    move-object v5, v4

    check-cast v5, Ll/ۗܽ֨;

    .line 124
    invoke-virtual {p0}, Ll/۟ۧ֨;->ᩳ()I

    move-result v6

    .line 57
    invoke-interface {v5, v6}, Ll/ۗܽ֨;->֫(I)V

    .line 394
    :cond_0
    iget v5, p0, Ll/ۢܽ֨;->᩶:I

    .line 398
    iput v5, v4, Ll/ۢܽ֨;->᩶:I

    if-eqz v2, :cond_1

    .line 60
    invoke-virtual {p0}, Ll/ۢܽ֨;->ۘ()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 61
    invoke-virtual {v4, v3, v1}, Ll/ۢܽ֨;->ᩳ(II)V

    goto :goto_1

    .line 63
    :cond_1
    invoke-virtual {v4, v3, v1}, Ll/ۢܽ֨;->ۧ(II)V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ܽ()Z
    .locals 3

    .line 85
    iget-object v0, p0, Ll/۟ۧ֨;->ۙ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 86
    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ܰۧ֨;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ܰۧ֨;-><init>(I)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->anyMatch(Ljava/util/function/Predicate;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()I
    .locals 4

    .line 97
    iget-boolean v0, p0, Ll/ۢܽ֨;->ܰ:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/۟ۧ֨;->֨()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 98
    invoke-virtual {p0}, Ll/۟ۧ֨;->֨()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p0, Ll/۟ۧ֨;->ۙ֫:Ljava/util/ArrayList;

    .line 99
    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v2, Ll/᩺ᩳ֨;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Ll/᩺ᩳ֨;-><init>(I)V

    invoke-interface {v0, v2}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v2, Ll/ۛۧ֨;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 100
    invoke-interface {v0, v2}, Ll/ܿ᩺ᩴ;->mapToInt(Ljava/util/function/ToIntFunction;)Ll/ۧ᩺ᩴ;

    move-result-object v0

    invoke-interface {v0}, Ll/ۧ᩺ᩴ;->max()Ll/ᩳ۫ᩴ;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/ᩳ۫ᩴ;->orElse(I)I

    move-result v1

    :cond_0
    iput v1, p0, Ll/ۢܽ֨;->᩺:I

    const/4 v0, 0x1

    .line 101
    iput-boolean v0, p0, Ll/ۢܽ֨;->ܰ:Z

    .line 103
    :cond_1
    iget v0, p0, Ll/ۢܽ֨;->᩺:I

    return v0
.end method
