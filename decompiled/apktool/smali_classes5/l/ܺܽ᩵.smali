.class public final Ll/ܺܽ᩵;
.super Ll/᩷֫᩵;
.source "N673"


# direct methods
.method public static u0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;)Ll/۫֫᩵;
    .locals 7

    .line 62
    new-instance v4, Ll/ۘ֫᩵;

    const/4 v0, 0x7

    .line 0
    invoke-direct {v4, v0}, Ll/ۘ֫᩵;-><init>(I)V

    .line 62
    new-instance v3, Ll/ۧۧ᩵;

    const/4 v0, 0x2

    .line 0
    invoke-direct {v3, v0}, Ll/ۧۧ᩵;-><init>(I)V

    .line 62
    new-instance v2, Ll/ۧۧ᩵;

    const/4 v0, 0x3

    .line 0
    invoke-direct {v2, v0}, Ll/ۧۧ᩵;-><init>(I)V

    .line 208
    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    invoke-static {v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    new-instance v6, Ll/᩺ܰᩴ;

    sget-object v1, Ll/ۡ֫᩵;->REFERENCE:Ll/ۡ֫᩵;

    const/4 v5, 0x3

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ll/᩺ܰᩴ;-><init>(Ll/ۡ֫᩵;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 65
    invoke-virtual {v6, p0, p1}, Ll/ۡ᩺ᩴ;->e(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    .line 161
    new-instance p1, Ll/۫֫᩵;

    invoke-direct {p1, p0}, Ll/۫֫᩵;-><init>(Ljava/util/Collection;)V

    return-object p1
.end method


# virtual methods
.method public final n0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;Ljava/util/function/IntFunction;)Ll/ۚ۟ᩴ;
    .locals 4

    .line 72
    sget-object v0, Ll/۟۟ᩴ;->DISTINCT:Ll/۟۟ᩴ;

    move-object v1, p1

    check-cast v1, Ll/۫᩺ᩴ;

    .line 509
    iget v2, v1, Ll/۫᩺ᩴ;->m:I

    .line 72
    invoke-virtual {v0, v2}, Ll/۟۟ᩴ;->s(I)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 74
    invoke-virtual {p1, p2, v2, p3}, Ll/ۡ᩺ᩴ;->Q(Ll/ܶ۫ᩴ;ZLjava/util/function/IntFunction;)Ll/ۚ۟ᩴ;

    move-result-object p1

    return-object p1

    .line 76
    :cond_0
    sget-object p3, Ll/۟۟ᩴ;->ORDERED:Ll/۟۟ᩴ;

    .line 509
    iget v0, v1, Ll/۫᩺ᩴ;->m:I

    .line 76
    invoke-virtual {p3, v0}, Ll/۟۟ᩴ;->s(I)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 77
    invoke-static {p1, p2}, Ll/ܺܽ᩵;->u0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;)Ll/۫֫᩵;

    move-result-object p1

    return-object p1

    .line 81
    :cond_1
    new-instance p3, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 82
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    .line 83
    new-instance v1, Ll/ۤܶᩴ;

    const/4 v3, 0x5

    invoke-direct {v1, v3, p3, v0}, Ll/ۤܶᩴ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 71
    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    new-instance v3, Ll/ۖܽ᩵;

    invoke-direct {v3, v1, v2}, Ll/ۖܽ᩵;-><init>(Ljava/util/function/Consumer;Z)V

    .line 173
    invoke-virtual {v3, p1, p2}, Ll/᩶ܽ᩵;->a(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;)V

    .line 94
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    .line 95
    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 97
    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/4 p1, 0x0

    .line 98
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-object p1, p2

    .line 161
    :cond_2
    new-instance p2, Ll/۫֫᩵;

    invoke-direct {p2, p1}, Ll/۫֫᩵;-><init>(Ljava/util/Collection;)V

    return-object p2
.end method

.method public final o0(Ll/۫᩺ᩴ;Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;
    .locals 2

    .line 106
    sget-object v0, Ll/۟۟ᩴ;->DISTINCT:Ll/۟۟ᩴ;

    .line 509
    iget v1, p1, Ll/۫᩺ᩴ;->m:I

    .line 106
    invoke-virtual {v0, v1}, Ll/۟۟ᩴ;->s(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    invoke-virtual {p1, p2}, Ll/۫᩺ᩴ;->h0(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;

    move-result-object p1

    return-object p1

    .line 110
    :cond_0
    sget-object v0, Ll/۟۟ᩴ;->ORDERED:Ll/۟۟ᩴ;

    .line 509
    iget v1, p1, Ll/۫᩺ᩴ;->m:I

    .line 110
    invoke-virtual {v0, v1}, Ll/۟۟ᩴ;->s(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 112
    invoke-static {p1, p2}, Ll/ܺܽ᩵;->u0(Ll/ۡ᩺ᩴ;Ll/ܶ۫ᩴ;)Ll/۫֫᩵;

    move-result-object p1

    invoke-virtual {p1}, Ll/۫֫᩵;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object p1

    return-object p1

    .line 116
    :cond_1
    new-instance v0, Ll/ۨܽ᩵;

    invoke-virtual {p1, p2}, Ll/۫᩺ᩴ;->h0(Ll/ܶ۫ᩴ;)Ll/ܶ۫ᩴ;

    move-result-object p1

    .line 1260
    new-instance p2, Ll/ۧۤᩴ;

    invoke-direct {p2}, Ll/ۧۤᩴ;-><init>()V

    invoke-direct {v0, p1, p2}, Ll/ۨܽ᩵;-><init>(Ll/ܶ۫ᩴ;Ll/ۧۤᩴ;)V

    return-object v0
.end method

.method public final q0(ILl/֡ᩳ᩵;)Ll/֡ᩳ᩵;
    .locals 1

    .line 122
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    sget-object v0, Ll/۟۟ᩴ;->DISTINCT:Ll/۟۟ᩴ;

    invoke-virtual {v0, p1}, Ll/۟۟ᩴ;->s(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p2

    .line 126
    :cond_0
    sget-object v0, Ll/۟۟ᩴ;->SORTED:Ll/۟۟ᩴ;

    invoke-virtual {v0, p1}, Ll/۟۟ᩴ;->s(I)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 127
    new-instance p1, Ll/᩶ۧ᩵;

    invoke-direct {p1, p2}, Ll/᩶ۧ᩵;-><init>(Ll/֡ᩳ᩵;)V

    return-object p1

    .line 158
    :cond_1
    new-instance p1, Ll/֫ܽ᩵;

    invoke-direct {p1, p2}, Ll/֫ܽ᩵;-><init>(Ll/֡ᩳ᩵;)V

    return-object p1
.end method
