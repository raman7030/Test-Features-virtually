.class public final Ll/֫۬ۖ;
.super Ll/۟ۗۖ;
.source "I4RE"


# virtual methods
.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;Ll/֫ۙۖ;Ll/֫ۙۖ;)Ljava/lang/Object;
    .locals 3

    .line 27
    check-cast p1, [Ll/ۧ۬ۖ;

    check-cast p2, [Ll/ۧ۬ۖ;

    const/4 p3, 0x0

    if-nez p2, :cond_2

    .line 96
    iget p2, p0, Ll/۟ۗۖ;->ܽ:I

    new-array p2, p2, [Ll/ۧ۬ۖ;

    .line 97
    :goto_0
    array-length p4, p1

    if-ge p3, p4, :cond_1

    .line 98
    aget-object p4, p1, p3

    if-eqz p4, :cond_0

    .line 100
    new-instance v0, Ll/ۧ۬ۖ;

    invoke-direct {v0}, Ll/ۧ۬ۖ;-><init>()V

    .line 101
    iget-object v1, p0, Ll/۟ۗۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    iput-object p4, v0, Ll/ۧ۬ۖ;->ۧ:Ll/ۧ۬ۖ;

    .line 103
    aput-object v0, p2, p3

    :cond_0
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_1
    return-object p2

    .line 107
    :cond_2
    :goto_1
    array-length p4, p1

    if-ge p3, p4, :cond_5

    .line 108
    aget-object p4, p1, p3

    .line 109
    aget-object v0, p2, p3

    if-eqz p4, :cond_4

    if-eqz v0, :cond_4

    .line 111
    iget-object v1, v0, Ll/ۧ۬ۖ;->֫:Ljava/util/ArrayList;

    if-nez v1, :cond_3

    .line 113
    new-instance v1, Ljava/util/ArrayList;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, v0, Ll/ۧ۬ۖ;->֫:Ljava/util/ArrayList;

    .line 115
    :cond_3
    invoke-interface {v1, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    :cond_5
    return-object p2
.end method

.method public final ֫(Ll/ᩳ᩶ۖ;Ll/۠᩶ۖ;)Ll/ܰۗۖ;
    .locals 0

    .line 129
    new-instance p1, Ll/ۧ۬ۖ;

    invoke-direct {p1}, Ll/ۧ۬ۖ;-><init>()V

    const/4 p2, 0x1

    .line 83
    iput-boolean p2, p1, Ll/ۧ۬ۖ;->ܽ:Z

    return-object p1
.end method

.method public final ֫(Ll/ܰۗۖ;)V
    .locals 1

    .line 27
    check-cast p1, Ll/ۧ۬ۖ;

    const/4 v0, 0x1

    .line 89
    iput-boolean v0, p1, Ll/ۧ۬ۖ;->ܽ:Z

    return-void
.end method

.method public final ֫(I)[Ll/ܰۗۖ;
    .locals 0

    .line 124
    new-array p1, p1, [Ll/ۧ۬ۖ;

    return-object p1
.end method

.method public final ܳ()I
    .locals 1

    .line 73
    iget v0, p0, Ll/۟ۗۖ;->ܽ:I

    return v0
.end method

.method public final ܽ()V
    .locals 8

    .line 29
    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Ll/۟ۗۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 30
    new-instance v1, Ll/ۛۗۖ;

    invoke-direct {v1}, Ll/ۛۗۖ;-><init>()V

    .line 31
    iget-object v2, p0, Ll/۟ۗۖ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۧ۬ۖ;

    .line 32
    iget-boolean v4, v3, Ll/ۧ۬ۖ;->ܽ:Z

    if-eqz v4, :cond_0

    .line 33
    invoke-virtual {v1, v3}, Ll/ۛۗۖ;->add(Ljava/lang/Object;)Z

    .line 34
    :cond_1
    :goto_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    .line 35
    invoke-virtual {v1}, Ll/ۛۗۖ;->poll()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۧ۬ۖ;

    .line 36
    iget-boolean v4, v3, Ll/ۧ۬ۖ;->ܽ:Z

    if-eqz v4, :cond_1

    .line 37
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    .line 40
    :cond_2
    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 42
    iget-object v4, v3, Ll/ۧ۬ۖ;->ۧ:Ll/ۧ۬ۖ;

    const/4 v5, 0x1

    if-eqz v4, :cond_3

    .line 44
    iget-boolean v6, v4, Ll/ۧ۬ۖ;->ܽ:Z

    if-nez v6, :cond_3

    .line 45
    iput-boolean v5, v4, Ll/ۧ۬ۖ;->ܽ:Z

    .line 46
    invoke-virtual {v1, v4}, Ll/ۛۗۖ;->add(Ljava/lang/Object;)Z

    .line 50
    :cond_3
    iget-object v4, v3, Ll/ۧ۬ۖ;->֫:Ljava/util/ArrayList;

    if-eqz v4, :cond_1

    .line 51
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۧ۬ۖ;

    .line 52
    iget-boolean v7, v6, Ll/ۧ۬ۖ;->ܽ:Z

    if-nez v7, :cond_4

    .line 53
    iput-boolean v5, v6, Ll/ۧ۬ۖ;->ܽ:Z

    .line 54
    invoke-virtual {v1, v6}, Ll/ۛۗۖ;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    const/4 v4, 0x0

    .line 57
    iput-object v4, v3, Ll/ۧ۬ۖ;->֫:Ljava/util/ArrayList;

    goto :goto_0

    :cond_6
    return-void
.end method

.method public final ܿ()Ll/ܰۗۖ;
    .locals 1

    .line 129
    new-instance v0, Ll/ۧ۬ۖ;

    invoke-direct {v0}, Ll/ۧ۬ۖ;-><init>()V

    return-object v0
.end method
