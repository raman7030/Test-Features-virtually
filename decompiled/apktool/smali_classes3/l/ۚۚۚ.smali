.class public final enum Ll/ۚۚۚ;
.super Ll/᩺ۚۚ;
.source "UBJ4"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "AfterFrameset"

    const/16 v1, 0x14

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۚۚۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1663
    invoke-direct {p0, p1, p2, v0}, Ll/᩺ۚۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z
    .locals 3

    .line 1665
    invoke-static {p1}, Ll/᩺ۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1666
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    check-cast p1, Ll/ܿ֨ۚ;

    .line 1666
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ܿ֨ۚ;)V

    goto :goto_1

    .line 1667
    :cond_0
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 474
    check-cast p1, Ll/ܳ֨ۚ;

    .line 1668
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ܳ֨ۚ;)V

    goto :goto_1

    .line 1669
    :cond_1
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ܽ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 1670
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v1

    .line 1672
    :cond_2
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ܳ()Z

    move-result v0

    const-string v2, "html"

    if-eqz v0, :cond_3

    .line 458
    move-object v0, p1

    check-cast v0, Ll/ۢ֨ۚ;

    .line 194
    iget-object v0, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    .line 1672
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1673
    sget-object v0, Ll/᩺ۚۚ;->ۨ:Ll/᩺ۚۚ;

    .line 171
    :goto_0
    iput-object p1, p2, Ll/֡ܶۚ;->ۧ:Ll/ۖ֨ۚ;

    .line 172
    invoke-virtual {v0, p1, p2}, Ll/᩺ۚۚ;->֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 1674
    :cond_3
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 466
    move-object v0, p1

    check-cast v0, Ll/᩷֨ۚ;

    .line 194
    iget-object v0, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    .line 1674
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1675
    sget-object p1, Ll/᩺ۚۚ;->᩶:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    goto :goto_1

    .line 1676
    :cond_4
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 458
    move-object v0, p1

    check-cast v0, Ll/ۢ֨ۚ;

    .line 194
    iget-object v0, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    const-string v2, "noframes"

    .line 1676
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1677
    sget-object v0, Ll/᩺ۚۚ;->ۧ֫:Ll/᩺ۚۚ;

    goto :goto_0

    .line 1678
    :cond_5
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_6

    :goto_1
    const/4 p1, 0x1

    return p1

    .line 1681
    :cond_6
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v1
.end method
