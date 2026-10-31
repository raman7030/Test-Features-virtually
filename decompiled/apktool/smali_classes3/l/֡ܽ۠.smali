.class public final Ll/֡ܽ۠;
.super Ll/ۗ۫֨;
.source "A451"


# virtual methods
.method public final bridge synthetic ֫(Ll/֨۫֨;Ljava/lang/Object;)Ll/ۙ֨֨;
    .locals 0

    .line 2639
    check-cast p2, Ll/ۙ֨֨;

    invoke-virtual {p0, p1, p2}, Ll/֡ܽ۠;->֫(Ll/֨۫֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/֨۫֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 2

    .line 2647
    invoke-super {p0, p1, p2}, Ll/ۗ۫֨;->֫(Ll/֨۫֨;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    .line 2648
    invoke-virtual {p2}, Ll/ۙ֨֨;->᩻֫()Z

    move-result v0

    if-nez v0, :cond_2

    .line 2649
    sget-object v0, Ll/ܺ֫۠;->ܽ:[I

    iget-object v1, p1, Ll/֨۫֨;->۟:Ll/۫᩵۠;

    invoke-static {v1}, Ll/۟ۚ۠;->ۧ(Ll/۫᩵۠;)Ll/۫᩵۠;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۚۚ۠;->ܽ֫()Ll/ᩴۚ۠;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 2654
    :cond_0
    sget-object v0, Ll/ۙ֨֨;->ۗ:Ll/ۨۚ֨;

    if-ne p2, v0, :cond_2

    :cond_1
    return-object p1

    :cond_2
    :goto_0
    return-object p2
.end method
