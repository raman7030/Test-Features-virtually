.class public final Ll/ۗۙۚ;
.super Ll/ۧۗۚ;
.source "45FR"


# instance fields
.field public ۜ:Ljava/util/ArrayList;

.field public ᩷:Ljava/util/ArrayList;

.field public ᩻:Ljava/util/ArrayList;


# virtual methods
.method public final ֫(Ll/ܶ᩶ۚ;Z)V
    .locals 10

    .line 128
    iget-object v0, p0, Ll/ۗۙۚ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v5, v1, [Ll/֨᩶ۚ;

    .line 129
    iget-object v2, p0, Ll/ۗۙۚ;->᩻:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    new-array v6, v3, [Ll/֨᩶ۚ;

    .line 130
    iget-object v3, p0, Ll/ۗۙۚ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    new-array v7, v4, [I

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    .line 132
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩹ۙۚ;

    invoke-virtual {v8}, Ll/᩹ۙۚ;->֫()Ll/֨᩶ۚ;

    move-result-object v8

    aput-object v8, v5, v4

    .line 133
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩹ۙۚ;

    invoke-virtual {v8}, Ll/᩹ۙۚ;->֫()Ll/֨᩶ۚ;

    move-result-object v8

    aput-object v8, v6, v4

    .line 134
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    aput v8, v7, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 136
    :cond_0
    iget v3, p0, Ll/ۧۗۚ;->ܳ:I

    iget-object v4, p0, Ll/ۧۗۚ;->ܿ:Ll/᩺᩶ۚ;

    iget-object v8, p0, Ll/ܺۙۚ;->ܽ:Ljava/lang/String;

    move-object v2, p1

    move v9, p2

    .line 137
    invoke-virtual/range {v2 .. v9}, Ll/ܶ᩶ۚ;->֫(ILl/᩺᩶ۚ;[Ll/֨᩶ۚ;[Ll/֨᩶ۚ;[ILjava/lang/String;Z)Ll/ܰ᩹ۚ;

    move-result-object p1

    .line 136
    invoke-virtual {p0, p1}, Ll/ܺۙۚ;->֫(Ll/ܰ᩹ۚ;)V

    return-void
.end method
