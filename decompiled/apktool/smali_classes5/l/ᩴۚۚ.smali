.class public final enum Ll/ᩴۚۚ;
.super Ll/᩺ۚۚ;
.source "UBJ4"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "AfterBody"

    const/16 v1, 0x12

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ᩴۚۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1586
    invoke-direct {p0, p1, p2, v0}, Ll/᩺ۚۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z
    .locals 3

    .line 1588
    invoke-static {p1}, Ll/᩺ۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1589
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    check-cast p1, Ll/ܿ֨ۚ;

    .line 1589
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ܿ֨ۚ;)V

    goto :goto_0

    .line 1590
    :cond_0
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 474
    check-cast p1, Ll/ܳ֨ۚ;

    .line 1591
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ܳ֨ۚ;)V

    goto :goto_0

    .line 1592
    :cond_1
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ܽ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 1593
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v1

    .line 1595
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

    .line 1595
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1596
    sget-object v0, Ll/᩺ۚۚ;->ۨ:Ll/᩺ۚۚ;

    .line 171
    iput-object p1, p2, Ll/֡ܶۚ;->ۧ:Ll/ۖ֨ۚ;

    .line 172
    invoke-virtual {v0, p1, p2}, Ll/᩺ۚۚ;->֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 1597
    :cond_3
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 466
    move-object v0, p1

    check-cast v0, Ll/᩷֨ۚ;

    .line 194
    iget-object v0, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    .line 1597
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1598
    invoke-virtual {p2}, Ll/ܿۚۚ;->ۘ()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 1599
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v1

    .line 1602
    :cond_4
    invoke-virtual {p2, v2}, Ll/ܿۚۚ;->ۖ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {p2, v2}, Ll/ܿۚۚ;->ۘ(Ljava/lang/String;)V

    .line 1603
    :cond_5
    sget-object p1, Ll/᩺ۚۚ;->᩹:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    goto :goto_0

    .line 1605
    :cond_6
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_7

    :goto_0
    const/4 p1, 0x1

    return p1

    .line 1608
    :cond_7
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    .line 1609
    invoke-virtual {p2}, Ll/ܿۚۚ;->ܶ()V

    .line 1610
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1
.end method
