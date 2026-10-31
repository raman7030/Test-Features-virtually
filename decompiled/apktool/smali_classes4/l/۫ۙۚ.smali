.class public final Ll/۫ۙۚ;
.super Ll/ۡۙۚ;
.source "C5BL"


# instance fields
.field public ۜ:Ljava/util/ArrayList;

.field public ᩷:Ljava/util/ArrayList;

.field public ᩻:Ll/᩹ۙۚ;


# virtual methods
.method public final ֫(Ll/ܶ᩶ۚ;)V
    .locals 7

    .line 74
    iget-object v0, p0, Ll/۫ۙۚ;->᩷:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/۫ۙۚ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v3, v2, [I

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_0

    .line 76
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    aput v6, v3, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 78
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v2, v1, [Ll/֨᩶ۚ;

    :goto_1
    if-ge v4, v1, :cond_1

    .line 80
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩹ۙۚ;

    invoke-virtual {v5}, Ll/᩹ۙۚ;->֫()Ll/֨᩶ۚ;

    move-result-object v5

    aput-object v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 82
    :cond_1
    iget-object v0, p0, Ll/۫ۙۚ;->᩻:Ll/᩹ۙۚ;

    invoke-virtual {v0}, Ll/᩹ۙۚ;->֫()Ll/֨᩶ۚ;

    move-result-object v0

    invoke-virtual {p1, v0, v3, v2}, Ll/ܶ᩶ۚ;->֫(Ll/֨᩶ۚ;[I[Ll/֨᩶ۚ;)V

    .line 83
    invoke-virtual {p0, p1}, Ll/ۡۙۚ;->ۧ(Ll/ܶ᩶ۚ;)V

    return-void
.end method
