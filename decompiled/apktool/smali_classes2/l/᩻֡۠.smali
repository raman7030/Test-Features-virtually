.class public final Ll/᩻֡۠;
.super Ll/۫᩵۠;
.source "H44W"

# interfaces
.implements Ll/֫ܺ֨;


# instance fields
.field public ۗ:Ll/ۢ۠֨;

.field public ۬:Ljava/lang/Object;


# virtual methods
.method public final ֫(Ll/۫ܺ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2670
    invoke-interface {p1, p0, p2}, Ll/۫ܺ֨;->֫(Ll/᩻֡۠;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/ۗܺ֨;
    .locals 1

    .line 2649
    iget-object v0, p0, Ll/᩻֡۠;->ۗ:Ll/ۢ۠֨;

    invoke-virtual {v0}, Ll/ۢ۠֨;->֫()Ll/ۗܺ֨;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ۙ֨֨;)Ll/۫᩵۠;
    .locals 0

    .line 471
    iput-object p1, p0, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    return-object p0
.end method

.method public final ֫(Ll/֡ۚ۠;)V
    .locals 0

    .line 2645
    invoke-virtual {p1, p0}, Ll/֡ۚ۠;->֫(Ll/᩻֡۠;)V

    return-void
.end method

.method public final ܽ֫()Ll/ᩴۚ۠;
    .locals 1

    .line 2679
    sget-object v0, Ll/ᩴۚ۠;->᩺֫:Ll/ᩴۚ۠;

    return-object v0
.end method

.method public final ᩷֫()Ljava/lang/Object;
    .locals 3

    .line 2654
    iget-object v0, p0, Ll/᩻֡۠;->۬:Ljava/lang/Object;

    sget-object v1, Ll/ܽ᩵۠;->ۧ:[I

    iget-object v2, p0, Ll/᩻֡۠;->ۗ:Ll/ۢ۠֨;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    return-object v0

    .line 2659
    :cond_0
    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-char v1, v0

    if-ne v1, v0, :cond_1

    .line 2663
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v0

    return-object v0

    .line 2662
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "bad value for char literal"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 2656
    :cond_2
    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    .line 2657
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
