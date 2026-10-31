.class public final Ll/ۖ᩹֨;
.super Ll/֫᩹֨;
.source "T57T"


# instance fields
.field public ۧ:Ll/ۢ᩹֨;

.field public ܽ:Ll/ۚۚ۠;


# virtual methods
.method public final ֫(Ll/ۢۚ۠;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 772
    check-cast p2, Ljava/lang/Void;

    .line 795
    invoke-super {p0, p1, p2}, Ll/᩶ۚ۠;->֫(Ll/ۢۚ۠;Ljava/lang/Object;)Ll/ۢۚ۠;

    move-result-object p2

    .line 796
    iget-object v0, p0, Ll/ۖ᩹֨;->ܽ:Ll/ۚۚ۠;

    if-ne p1, v0, :cond_0

    .line 801
    iget-object p1, p2, Ll/ۢۚ۠;->۫:Ll/ۖ֡۠;

    iget-wide v0, p1, Ll/ۖ֡۠;->۬:J

    const-wide/16 v2, 0x10

    and-long/2addr v0, v2

    iput-wide v0, p1, Ll/ۖ֡۠;->۬:J

    :cond_0
    return-object p2
.end method

.method public final ֫(Ll/ۚۚ۠;Ljava/lang/Object;)Ll/ۚۚ۠;
    .locals 2

    .line 772
    check-cast p2, Ljava/lang/Void;

    .line 785
    iget-object p2, p0, Ll/ۖ᩹֨;->ۧ:Ll/ۢ᩹֨;

    const/4 v0, 0x0

    invoke-super {p0, p1, v0}, Ll/᩶ۚ۠;->֫(Ll/ۚۚ۠;Ljava/lang/Object;)Ll/ۚۚ۠;

    move-result-object v0

    if-eqz p1, :cond_0

    .line 786
    iget-object v1, p2, Ll/ۢ᩹֨;->ᩳ:Ll/ۚۚ۠;

    iget-object p2, p2, Ll/ۢ᩹֨;->ܳ:Ll/ۚۚ۠;

    if-ne p1, v1, :cond_0

    .line 787
    invoke-static {p2}, Ll/۫ۙ;->֫(Ljava/lang/Object;)V

    return-object p2

    :cond_0
    return-object v0
.end method

.method public final ֫(Ll/ۢۚ۠;Ljava/lang/Object;)Ll/ۢۚ۠;
    .locals 4

    .line 772
    check-cast p2, Ljava/lang/Void;

    .line 795
    invoke-super {p0, p1, p2}, Ll/᩶ۚ۠;->֫(Ll/ۢۚ۠;Ljava/lang/Object;)Ll/ۢۚ۠;

    move-result-object p2

    .line 796
    iget-object v0, p0, Ll/ۖ᩹֨;->ܽ:Ll/ۚۚ۠;

    if-ne p1, v0, :cond_0

    .line 801
    iget-object p1, p2, Ll/ۢۚ۠;->۫:Ll/ۖ֡۠;

    iget-wide v0, p1, Ll/ۖ֡۠;->۬:J

    const-wide/16 v2, 0x10

    and-long/2addr v0, v2

    iput-wide v0, p1, Ll/ۖ֡۠;->۬:J

    :cond_0
    return-object p2
.end method
