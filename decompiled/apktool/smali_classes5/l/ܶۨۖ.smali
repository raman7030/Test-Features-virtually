.class public final Ll/ܶۨۖ;
.super Ll/ܽۨۖ;
.source "I9EA"


# virtual methods
.method public final ۧ(Ll/֡֫ۘ;)V
    .locals 6

    const/4 v0, 0x2

    .line 35
    invoke-virtual {p1, v0}, Ll/ۤܰۖ;->ܿ(I)V

    .line 36
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩻()I

    move-result v0

    .line 37
    invoke-virtual {p1}, Ll/ۤܰۖ;->᩷()I

    move-result v1

    if-lez v0, :cond_1

    if-lez v1, :cond_1

    .line 48
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 49
    iget-object v3, p0, Ll/֨֫ۘ;->ۧ:Ll/ۚ֫ۘ;

    check-cast v3, Ll/᩻ۨۖ;

    invoke-virtual {v3}, Ll/᩻ۨۖ;->֫()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {p1, v3}, Ll/ۤܰۖ;->ᩳ(I)V

    .line 52
    :goto_0
    invoke-virtual {p1}, Ll/ۤܰۖ;->ۡ()I

    move-result v3

    .line 53
    new-instance v4, Ll/ᩳۤۖ;

    .line 29
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 54
    invoke-virtual {v4, p1}, Ll/ᩳۤۖ;->֫(Ll/֡֫ۘ;)V

    .line 55
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    invoke-virtual {v4}, Ll/ᩳۤۖ;->֫()I

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    .line 60
    :cond_0
    invoke-virtual {v4}, Ll/ᩳۤۖ;->֫()I

    move-result v4

    add-int/2addr v4, v3

    .line 61
    invoke-virtual {p1, v4}, Ll/ۤܰۖ;->ᩳ(I)V

    goto :goto_0

    .line 43
    :cond_1
    :goto_1
    iget-object v2, p0, Ll/֨֫ۘ;->ۧ:Ll/ۚ֫ۘ;

    check-cast v2, Ll/᩻ۨۖ;

    invoke-virtual {v2}, Ll/᩻ۨۖ;->֫()I

    move-result v2

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    invoke-virtual {p1, v2}, Ll/ۤܰۖ;->ᩳ(I)V

    return-void
.end method
