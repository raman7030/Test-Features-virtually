.class public final Ll/۠۠ܿ;
.super Ljava/lang/Object;
.source "LA2Z"


# instance fields
.field public ֫:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/۠۠ܿ;->֫:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܶ᩵ܿ;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 0
    instance-of v0, p1, Ll/۬۠ܿ;

    if-eqz v0, :cond_0

    .line 24
    iget-object v0, p0, Ll/۠۠ܿ;->֫:Ljava/util/HashSet;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۧ()Ll/۬۠ܿ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ֫()Z
    .locals 3

    .line 29
    invoke-static {}, Ll/ۧܶܿ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 32
    :cond_0
    iget-object v0, p0, Ll/۠۠ܿ;->֫:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬۠ܿ;

    .line 33
    invoke-virtual {v1}, Ll/۬۠ܿ;->ۗۧ()Ljava/lang/String;

    move-result-object v1

    .line 0
    sget-object v2, Ll/۬۠ܿ;->᩺:Ll/᩶۠ܿ;

    invoke-static {v1}, Ll/᩶۠ܿ;->ۧ(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 837
    invoke-static {}, Ll/۬۠ܿ;->ۤۧ()Ll/ۚۡ֫;

    move-result-object v0

    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ۧ()Ljava/util/List;
    .locals 3

    .line 43
    invoke-static {}, Ll/ۧܶܿ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 44
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 46
    :cond_0
    iget-object v0, p0, Ll/۠۠ܿ;->֫:Ljava/util/HashSet;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۜۛ᩷;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ll/ۜۛ᩷;-><init>(I)V

    .line 47
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 48
    invoke-interface {v0}, Ll/ܿ᩺ᩴ;->sorted()Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 49
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method
