.class public final Ll/᩹ۙۖ;
.super Ljava/lang/Object;
.source "C64A"


# direct methods
.method public static ֫(Ll/ۚ᩹ۖ;)V
    .locals 10

    .line 32
    invoke-static {p0}, Ll/ܶۙۖ;->֫(Ll/ۚ᩹ۖ;)V

    iget-object v0, p0, Ll/ۚ᩹ۖ;->ܽ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    .line 33
    invoke-static {p0, v1}, Ll/ܶۙۖ;->֫(Ll/ۚ᩹ۖ;Ll/᩵ۙۖ;)V

    .line 34
    iget-object v1, p0, Ll/ۚ᩹ۖ;->᩷:Ljava/util/ArrayList;

    if-eqz v1, :cond_7

    .line 35
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 36
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۙ᩹ۖ;

    .line 38
    iget-object v3, v2, Ll/ۙ᩹ۖ;->ܽ:Ll/۬᩶ۖ;

    :goto_1
    iget-object v4, v2, Ll/ۙ᩹ۖ;->֫:Ll/۬᩶ۖ;

    if-eq v3, v4, :cond_6

    .line 39
    iget-boolean v4, v3, Ll/֫ۙۖ;->ۢ:Z

    if-eqz v4, :cond_5

    invoke-static {v3}, Ll/ܶۙۖ;->֫(Ll/֫ۙۖ;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 51
    iget-object v3, v2, Ll/ۙ᩹ۖ;->ۧ:[Ll/۬᩶ۖ;

    array-length v4, v3

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x1

    :goto_2
    if-ge v6, v4, :cond_2

    aget-object v9, v3, v6

    .line 52
    iget-boolean v9, v9, Ll/֫ۙۖ;->ۢ:Z

    if-eqz v9, :cond_1

    const/4 v7, 0x0

    goto :goto_3

    :cond_1
    const/4 v8, 0x0

    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_2
    if-eqz v7, :cond_3

    .line 59
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 62
    :cond_3
    iget-object v3, v2, Ll/ۙ᩹ۖ;->ܽ:Ll/۬᩶ۖ;

    iput-boolean v5, v3, Ll/֫ۙۖ;->ۢ:Z

    .line 63
    iget-object v3, v2, Ll/ۙ᩹ۖ;->֫:Ll/۬᩶ۖ;

    iput-boolean v5, v3, Ll/֫ۙۖ;->ۢ:Z

    if-nez v8, :cond_0

    .line 65
    new-instance v3, Ljava/util/ArrayList;

    iget-object v4, v2, Ll/ۙ᩹ۖ;->ۧ:[Ll/۬᩶ۖ;

    array-length v4, v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 66
    new-instance v4, Ljava/util/ArrayList;

    iget-object v5, v2, Ll/ۙ᩹ۖ;->ۧ:[Ll/۬᩶ۖ;

    array-length v5, v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x0

    .line 67
    :goto_4
    iget-object v6, v2, Ll/ۙ᩹ۖ;->ۧ:[Ll/۬᩶ۖ;

    array-length v7, v6

    if-ge v5, v7, :cond_4

    .line 68
    aget-object v6, v6, v5

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    iget-object v6, v2, Ll/ۙ᩹ۖ;->ᩳ:[Ljava/lang/String;

    aget-object v6, v6, v5

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 71
    :cond_4
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    new-array v5, v5, [Ll/۬᩶ۖ;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ll/۬᩶ۖ;

    iput-object v4, v2, Ll/ۙ᩹ۖ;->ۧ:[Ll/۬᩶ۖ;

    .line 72
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    new-array v4, v4, [Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/String;

    iput-object v3, v2, Ll/ۙ᩹ۖ;->ᩳ:[Ljava/lang/String;

    goto/16 :goto_0

    .line 38
    :cond_5
    invoke-virtual {v3}, Ll/֫ۙۖ;->ۧ()Ll/֫ۙۖ;

    move-result-object v3

    goto :goto_1

    .line 45
    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto/16 :goto_0

    .line 77
    :cond_7
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 78
    iget-object v2, p0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-virtual {v2}, Ll/ܽۙۖ;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    .line 79
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫ۙۖ;

    .line 80
    iget-boolean v4, v3, Ll/֫ۙۖ;->ۢ:Z

    if-nez v4, :cond_9

    .line 81
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_5

    .line 84
    :cond_9
    iget-object v4, v3, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    sget-object v5, Ll/۟᩶ۖ;->᩶:Ll/۟᩶ۖ;

    if-eq v4, v5, :cond_a

    sget-object v5, Ll/۟᩶ۖ;->۬:Ll/۟᩶ۖ;

    if-ne v4, v5, :cond_8

    .line 85
    :cond_a
    invoke-virtual {v3}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v4

    iget-object v4, v4, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v5, Ll/֨᩶ۖ;->᩸֫:Ll/֨᩶ۖ;

    if-ne v4, v5, :cond_8

    .line 86
    invoke-virtual {v3}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v3

    check-cast v3, Ll/ᩳ᩶ۖ;

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 90
    :cond_b
    iget-object v2, p0, Ll/ۚ᩹ۖ;->ܳ:Ljava/util/ArrayList;

    if-eqz v2, :cond_e

    .line 91
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_c
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_e

    .line 92
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬᩶ۖ;

    .line 93
    iget-boolean v4, v3, Ll/֫ۙۖ;->ۢ:Z

    if-nez v4, :cond_d

    .line 94
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_6

    .line 97
    :cond_d
    iget-object v3, v3, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    if-eqz v3, :cond_c

    .line 98
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩸᩶ۖ;

    .line 91
    iget-object v4, v4, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 99
    check-cast v4, Ll/ᩳ᩶ۖ;

    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 105
    :cond_e
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 106
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 107
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 108
    iget-object p0, p0, Ll/ۚ᩹ۖ;->ܳ:Ljava/util/ArrayList;

    if-eqz p0, :cond_14

    .line 109
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_f
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_14

    .line 110
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬᩶ۖ;

    .line 111
    iget-object v2, v2, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    if-eqz v2, :cond_f

    .line 112
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_10
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩸᩶ۖ;

    .line 96
    iget-object v3, v3, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    .line 113
    check-cast v3, Ll/᩻᩶ۖ;

    .line 162
    iget-object v4, v3, Ll/ۚ᩶ۖ;->ۗ:[Ll/۠᩶ۖ;

    .line 115
    array-length v5, v4

    const/4 v6, 0x0

    :goto_9
    if-ge v6, v5, :cond_10

    aget-object v7, v4, v6

    .line 116
    invoke-virtual {v1, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_13

    .line 162
    iget-object v4, v3, Ll/ۚ᩶ۖ;->ۗ:[Ll/۠᩶ۖ;

    .line 122
    array-length v5, v4

    const/4 v6, 0x0

    :goto_a
    if-ge v6, v5, :cond_12

    aget-object v7, v4, v6

    .line 123
    invoke-virtual {v1, v7}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_11

    .line 124
    invoke-virtual {v0, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_11
    add-int/lit8 v6, v6, 0x1

    goto :goto_a

    .line 127
    :cond_12
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v4

    new-array v4, v4, [Ll/۠᩶ۖ;

    invoke-virtual {v0, v4}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ll/۠᩶ۖ;

    .line 137
    iput-object v4, v3, Ll/ۚ᩶ۖ;->ۗ:[Ll/۠᩶ۖ;

    .line 128
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    goto :goto_8

    :cond_13
    add-int/lit8 v6, v6, 0x1

    goto :goto_9

    :cond_14
    return-void
.end method
