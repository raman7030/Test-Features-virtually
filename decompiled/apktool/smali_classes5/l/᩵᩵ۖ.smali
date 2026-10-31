.class public final Ll/᩵᩵ۖ;
.super Ll/֡᩵ۖ;
.source "J9PI"


# virtual methods
.method public final ֫(JLjava/lang/Object;)V
    .locals 0

    .line 165
    invoke-static {p1, p2, p3}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩺ᩴۖ;

    .line 142
    invoke-interface {p1}, Ll/᩺ᩴۖ;->᩶()V

    return-void
.end method

.method public final ֫(JLjava/lang/Object;Ljava/lang/Object;)V
    .locals 4

    .line 165
    invoke-static {p1, p2, p3}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ᩴۖ;

    invoke-static {p1, p2, p4}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ll/᩺ᩴۖ;

    .line 150
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    .line 151
    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v2

    if-lez v1, :cond_1

    if-lez v2, :cond_1

    .line 153
    invoke-interface {v0}, Ll/᩺ᩴۖ;->ۤ֫()Z

    move-result v3

    if-nez v3, :cond_0

    add-int/2addr v2, v1

    .line 154
    invoke-interface {v0, v2}, Ll/᩺ᩴۖ;->᩷(I)Ll/᩺ᩴۖ;

    move-result-object v0

    .line 156
    :cond_0
    invoke-interface {v0, p4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_1
    if-lez v1, :cond_2

    move-object p4, v0

    .line 160
    :cond_2
    invoke-static {p1, p2, p3, p4}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final ۧ(JLjava/lang/Object;)Ljava/util/List;
    .locals 2

    .line 165
    invoke-static {p1, p2, p3}, Ll/᩸֨ۖ;->ۢ(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ᩴۖ;

    .line 129
    invoke-interface {v0}, Ll/᩺ᩴۖ;->ۤ֫()Z

    move-result v1

    if-nez v1, :cond_1

    .line 130
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0xa

    goto :goto_0

    :cond_0
    mul-int/lit8 v1, v1, 0x2

    .line 132
    :goto_0
    invoke-interface {v0, v1}, Ll/᩺ᩴۖ;->᩷(I)Ll/᩺ᩴۖ;

    move-result-object v0

    .line 134
    invoke-static {p1, p2, p3, v0}, Ll/᩸֨ۖ;->֫(JLjava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-object v0
.end method
