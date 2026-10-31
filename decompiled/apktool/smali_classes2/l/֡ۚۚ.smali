.class public final enum Ll/֡ۚۚ;
.super Ll/᩺ۚۚ;
.source "UBJ4"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "InFrameset"

    const/16 v1, 0x13

    .line 0
    invoke-direct {p0, v0, v1}, Ll/֡ۚۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1615
    invoke-direct {p0, p1, p2, v0}, Ll/᩺ۚۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z
    .locals 7

    .line 1617
    invoke-static {p1}, Ll/᩺ۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 1618
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    check-cast p1, Ll/ܿ֨ۚ;

    .line 1618
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ܿ֨ۚ;)V

    return v1

    .line 1619
    :cond_0
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 474
    check-cast p1, Ll/ܳ֨ۚ;

    .line 1620
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ܳ֨ۚ;)V

    return v1

    .line 1621
    :cond_1
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ܽ()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 1622
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v2

    .line 1624
    :cond_2
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ܳ()Z

    move-result v0

    const-string v3, "html"

    const-string v4, "frameset"

    if-eqz v0, :cond_7

    .line 458
    check-cast p1, Ll/ۢ֨ۚ;

    .line 194
    iget-object v0, p1, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    .line 1626
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v5

    const/4 v6, -0x1

    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "noframes"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v6, 0x3

    goto :goto_0

    :sswitch_1
    const-string v3, "frame"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v6, 0x2

    goto :goto_0

    :sswitch_2
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v6, 0x1

    goto :goto_0

    :sswitch_3
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v6, 0x0

    :goto_0
    packed-switch v6, :pswitch_data_0

    .line 1638
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v2

    .line 1636
    :pswitch_0
    sget-object v0, Ll/᩺ۚۚ;->ۧ֫:Ll/᩺ۚۚ;

    .line 171
    :goto_1
    iput-object p1, p2, Ll/֡ܶۚ;->ۧ:Ll/ۖ֨ۚ;

    .line 172
    invoke-virtual {v0, p1, p2}, Ll/᩺ۚۚ;->֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z

    move-result p1

    return p1

    .line 1633
    :pswitch_1
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ۧ(Ll/ۢ֨ۚ;)Ll/᩶֡ۚ;

    return v1

    .line 1628
    :pswitch_2
    sget-object v0, Ll/᩺ۚۚ;->ۨ:Ll/᩺ۚۚ;

    goto :goto_1

    .line 1630
    :pswitch_3
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ۢ֨ۚ;)Ll/᩶֡ۚ;

    return v1

    .line 1641
    :cond_7
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 466
    move-object v0, p1

    check-cast v0, Ll/᩷֨ۚ;

    .line 194
    iget-object v0, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    .line 1641
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 1642
    invoke-virtual {p2, v3}, Ll/֡ܶۚ;->֫(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 1643
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v2

    .line 1646
    :cond_8
    invoke-virtual {p2}, Ll/ܿۚۚ;->ۚ()V

    .line 1647
    invoke-virtual {p2}, Ll/ܿۚۚ;->ۘ()Z

    move-result p1

    if-nez p1, :cond_a

    invoke-virtual {p2, v4}, Ll/֡ܶۚ;->֫(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_a

    .line 1648
    sget-object p1, Ll/᩺ۚۚ;->ۗ:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    return v1

    .line 1651
    :cond_9
    invoke-virtual {p1}, Ll/ۖ֨ۚ;->ᩳ()Z

    move-result p1

    if-eqz p1, :cond_b

    .line 1652
    invoke-virtual {p2, v3}, Ll/֡ܶۚ;->֫(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_a

    .line 1653
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    :cond_a
    return v1

    .line 1657
    :cond_b
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    return v2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x620c002b -> :sswitch_3
        0x3107ab -> :sswitch_2
        0x5d2a96d -> :sswitch_1
        0x47177da7 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
