.class public final Ll/᩷ܶ;
.super Ll/۠ܶ;
.source "31AV"


# direct methods
.method private ֫(Ll/ܿܶ;)V
    .locals 2

    .line 48
    iget-object v0, p0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    iget-object v1, v0, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    iget-object p1, p1, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 6

    .line 69
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    check-cast v0, Ll/ۗ۠;

    .line 70
    invoke-virtual {v0}, Ll/ۗ۠;->ۜ֫()I

    move-result v1

    .line 71
    invoke-virtual {v0}, Ll/ۗ۠;->᩷֫()I

    move-result v2

    .line 73
    invoke-virtual {v0}, Ll/ۗ۠;->᩻֫()I

    move-result v0

    const/4 v3, -0x1

    iget-object v4, p0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    const/4 v5, 0x1

    if-ne v0, v5, :cond_2

    if-eq v1, v3, :cond_0

    .line 75
    iget-object v0, v4, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v2, v2, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    iget-object v2, v2, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    iget-object v2, v2, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    iget-object v0, v0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    iget-object v0, v0, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    iput v1, v4, Ll/ܿܶ;->ܽ:I

    goto :goto_0

    :cond_0
    if-eq v2, v3, :cond_1

    .line 79
    iget-object v0, v4, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    iget-object v1, v1, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    iget-object v0, v0, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    iget-object v0, v0, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-int v0, v2

    .line 81
    iput v0, v4, Ll/ܿܶ;->ܽ:I

    goto :goto_0

    .line 83
    :cond_1
    iput-boolean v5, v4, Ll/ܿܶ;->֫:Z

    .line 84
    iget-object v0, v4, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    iget-object v1, v1, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    iget-object v0, v0, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    iget-object v0, v0, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    :goto_0
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    iget-object v0, v0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    invoke-direct {p0, v0}, Ll/᩷ܶ;->֫(Ll/ܿܶ;)V

    .line 89
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ᩳ:Ll/ܺܶ;

    iget-object v0, v0, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    invoke-direct {p0, v0}, Ll/᩷ܶ;->֫(Ll/ܿܶ;)V

    return-void

    :cond_2
    if-eq v1, v3, :cond_3

    .line 92
    iget-object v0, v4, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v2, v2, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    iget-object v2, v2, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v2, v2, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v0, v0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    iget-object v0, v0, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    iput v1, v4, Ll/ܿܶ;->ܽ:I

    goto :goto_1

    :cond_3
    if-eq v2, v3, :cond_4

    .line 96
    iget-object v0, v4, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v1, v1, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v0, v0, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    iget-object v0, v0, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-int v0, v2

    .line 98
    iput v0, v4, Ll/ܿܶ;->ܽ:I

    goto :goto_1

    .line 100
    :cond_4
    iput-boolean v5, v4, Ll/ܿܶ;->֫:Z

    .line 101
    iget-object v0, v4, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    iget-object v1, v1, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v1, v1, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v0, v0, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    iget-object v0, v0, Ll/ܿܶ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    :goto_1
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v0, v0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    invoke-direct {p0, v0}, Ll/᩷ܶ;->֫(Ll/ܿܶ;)V

    .line 106
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget-object v0, v0, Ll/ܶ۠;->ۨ֫:Ll/ᩴܶ;

    iget-object v0, v0, Ll/۠ܶ;->ܽ:Ll/ܿܶ;

    invoke-direct {p0, v0}, Ll/᩷ܶ;->֫(Ll/ܿܶ;)V

    return-void
.end method

.method public final ֫(Ll/ۧܶ;)V
    .locals 2

    .line 54
    iget-object p1, p0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    iget-boolean v0, p1, Ll/ܿܶ;->ܳ:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 57
    :cond_0
    iget-boolean v0, p1, Ll/ܿܶ;->᩻:Z

    if-eqz v0, :cond_1

    :goto_0
    return-void

    .line 61
    :cond_1
    iget-object v0, p1, Ll/ܿܶ;->᩷:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿܶ;

    .line 62
    iget-object v1, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    check-cast v1, Ll/ۗ۠;

    .line 63
    iget v0, v0, Ll/ܿܶ;->ܺ:I

    int-to-float v0, v0

    invoke-virtual {v1}, Ll/ۗ۠;->ۢ֫()F

    move-result v1

    mul-float v1, v1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr v1, v0

    float-to-int v0, v1

    .line 64
    invoke-virtual {p1, v0}, Ll/ܿܶ;->֫(I)V

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 112
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    check-cast v0, Ll/ۗ۠;

    .line 113
    invoke-virtual {v0}, Ll/ۗ۠;->᩻֫()I

    move-result v0

    const/4 v1, 0x1

    iget-object v2, p0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    if-ne v0, v1, :cond_0

    .line 114
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget v1, v2, Ll/ܿܶ;->ܺ:I

    invoke-virtual {v0, v1}, Ll/ܶ۠;->֡(I)V

    return-void

    .line 116
    :cond_0
    iget-object v0, p0, Ll/۠ܶ;->ۢ:Ll/ܶ۠;

    iget v1, v2, Ll/ܿܶ;->ܺ:I

    invoke-virtual {v0, v1}, Ll/ܶ۠;->ۚ(I)V

    return-void
.end method

.method public final ܳ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ܽ()V
    .locals 1

    .line 33
    iget-object v0, p0, Ll/۠ܶ;->᩷:Ll/ܿܶ;

    invoke-virtual {v0}, Ll/ܿܶ;->֫()V

    return-void
.end method
