.class public final Ll/۟ۙۚ;
.super Ll/ۡۙۚ;
.source "N660"


# instance fields
.field public ۜ:Ljava/util/ArrayList;

.field public ۢ:I

.field public ᩷:I

.field public ᩻:Ll/᩹ۙۚ;


# virtual methods
.method public final ֫(Ll/ܶ᩶ۚ;)V
    .locals 5

    .line 80
    iget-object v0, p0, Ll/۟ۙۚ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v2, v1, [Ll/֨᩶ۚ;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    .line 82
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩹ۙۚ;

    invoke-virtual {v4}, Ll/᩹ۙۚ;->֫()Ll/֨᩶ۚ;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 84
    :cond_0
    iget v0, p0, Ll/۟ۙۚ;->ۢ:I

    iget v1, p0, Ll/۟ۙۚ;->᩷:I

    iget-object v3, p0, Ll/۟ۙۚ;->᩻:Ll/᩹ۙۚ;

    invoke-virtual {v3}, Ll/᩹ۙۚ;->֫()Ll/֨᩶ۚ;

    move-result-object v3

    invoke-virtual {p1, v0, v1, v3, v2}, Ll/ܶ᩶ۚ;->֫(IILl/֨᩶ۚ;[Ll/֨᩶ۚ;)V

    .line 85
    invoke-virtual {p0, p1}, Ll/ۡۙۚ;->ۧ(Ll/ܶ᩶ۚ;)V

    return-void
.end method
