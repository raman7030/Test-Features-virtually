.class public final Ll/᩸ۙۖ;
.super Ljava/lang/Object;
.source "X65X"


# direct methods
.method public static ֫(Ll/ۚ᩹ۖ;)V
    .locals 6

    .line 43
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 44
    iget-object v1, p0, Ll/ۚ᩹ۖ;->᩷:Ljava/util/ArrayList;

    if-eqz v1, :cond_1

    .line 93
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙ᩹ۖ;

    .line 94
    iget-object v3, v2, Ll/ۙ᩹ۖ;->ܽ:Ll/۬᩶ۖ;

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 95
    iget-object v3, v2, Ll/ۙ᩹ۖ;->֫:Ll/۬᩶ۖ;

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 96
    iget-object v2, v2, Ll/ۙ᩹ۖ;->ۧ:[Ll/۬᩶ۖ;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    .line 97
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 45
    :cond_1
    iget-object v1, p0, Ll/ۚ᩹ۖ;->ۢ:Ljava/util/ArrayList;

    if-eqz v1, :cond_2

    .line 55
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۠᩹ۖ;

    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 57
    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 46
    :cond_2
    iget-object v1, p0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    .line 78
    invoke-virtual {v1}, Ll/ܽۙۖ;->getFirst()Ll/֫ۙۖ;

    move-result-object v1

    :goto_2
    if-eqz v1, :cond_5

    .line 79
    instance-of v2, v1, Ll/ۗ᩶ۖ;

    if-eqz v2, :cond_3

    .line 80
    move-object v2, v1

    check-cast v2, Ll/ۗ᩶ۖ;

    invoke-interface {v2}, Ll/ۗ᩶ۖ;->֫()Ll/۬᩶ۖ;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 81
    :cond_3
    instance-of v2, v1, Ll/᩹᩶ۖ;

    if-eqz v2, :cond_4

    .line 82
    move-object v2, v1

    check-cast v2, Ll/᩹᩶ۖ;

    .line 83
    iget-object v3, v2, Ll/᩹᩶ۖ;->ܺ:Ll/۬᩶ۖ;

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 84
    iget-object v2, v2, Ll/᩹᩶ۖ;->ۖ:[Ll/۬᩶ۖ;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v3, :cond_4

    aget-object v5, v2, v4

    .line 85
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 78
    :cond_4
    :goto_4
    invoke-virtual {v1}, Ll/֫ۙۖ;->ۧ()Ll/֫ۙۖ;

    move-result-object v1

    goto :goto_2

    .line 47
    :cond_5
    iget-object v1, p0, Ll/ۚ᩹ۖ;->ܳ:Ljava/util/ArrayList;

    if-eqz v1, :cond_6

    .line 48
    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 50
    :cond_6
    iget-object p0, p0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    .line 64
    invoke-virtual {p0}, Ll/ܽۙۖ;->getFirst()Ll/֫ۙۖ;

    move-result-object v1

    :goto_5
    if-eqz v1, :cond_9

    .line 65
    iget-object v2, v1, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    sget-object v3, Ll/۟᩶ۖ;->ۤ:Ll/۟᩶ۖ;

    if-ne v2, v3, :cond_8

    move-object v2, v1

    check-cast v2, Ll/۬᩶ۖ;

    .line 63
    iget v2, v2, Ll/۬᩶ۖ;->ۡ:I

    if-ltz v2, :cond_7

    goto :goto_6

    .line 66
    :cond_7
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    .line 67
    invoke-virtual {v1}, Ll/֫ۙۖ;->ۧ()Ll/֫ۙۖ;

    move-result-object v2

    .line 68
    invoke-virtual {p0, v1}, Ll/ܽۙۖ;->ܽ(Ll/֫ۙۖ;)V

    move-object v1, v2

    goto :goto_5

    .line 73
    :cond_8
    :goto_6
    invoke-virtual {v1}, Ll/֫ۙۖ;->ۧ()Ll/֫ۙۖ;

    move-result-object v1

    goto :goto_5

    :cond_9
    return-void
.end method
