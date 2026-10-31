.class public final enum Ll/ۘۚۚ;
.super Ll/᩺ۚۚ;
.source "UBJ4"


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const-string v0, "InTemplate"

    const/16 v1, 0x11

    .line 0
    invoke-direct {p0, v0, v1}, Ll/ۘۚۚ;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1517
    invoke-direct {p0, p1, p2, v0}, Ll/᩺ۚۚ;-><init>(Ljava/lang/String;II)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۖ֨ۚ;Ll/ܿۚۚ;)Z
    .locals 3

    .line 1520
    sget-object v0, Ll/᩸ۚۚ;->֫:[I

    iget-object v1, p1, Ll/ۖ֨ۚ;->ܽ:Ll/ܺ֨ۚ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const-string v2, "template"

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 1569
    :pswitch_0
    invoke-virtual {p2, v2}, Ll/ܿۚۚ;->ۖ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 1572
    :cond_0
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    .line 1573
    invoke-virtual {p2, v2}, Ll/ܿۚۚ;->ۘ(Ljava/lang/String;)V

    .line 1574
    invoke-virtual {p2}, Ll/ܿۚۚ;->ᩳ()V

    .line 1575
    invoke-virtual {p2}, Ll/ܿۚۚ;->֨()V

    .line 1576
    invoke-virtual {p2}, Ll/ܿۚۚ;->᩸()Z

    .line 1579
    invoke-virtual {p2}, Ll/ܿۚۚ;->᩶()Ll/᩺ۚۚ;

    move-result-object v0

    sget-object v2, Ll/᩺ۚۚ;->ۢ֫:Ll/᩺ۚۚ;

    if-eq v0, v2, :cond_8

    invoke-virtual {p2}, Ll/ܿۚۚ;->ۙ()I

    move-result v0

    const/16 v2, 0xc

    if-ge v0, v2, :cond_8

    .line 1580
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1

    .line 466
    :pswitch_1
    move-object v0, p1

    check-cast v0, Ll/᩷֨ۚ;

    .line 194
    iget-object v0, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    .line 1561
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1562
    sget-object v0, Ll/᩺ۚۚ;->ۧ֫:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1, v0}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;Ll/᩺ۚۚ;)V

    return v1

    .line 1564
    :cond_1
    invoke-virtual {p2, p0}, Ll/ܿۚۚ;->֫(Ll/᩺ۚۚ;)V

    const/4 p1, 0x0

    return p1

    .line 458
    :pswitch_2
    move-object v0, p1

    check-cast v0, Ll/ۢ֨ۚ;

    .line 194
    iget-object v0, v0, Ll/ۡ֨ۚ;->ܺ:Ljava/lang/String;

    .line 1528
    sget-object v2, Ll/ۨۚۚ;->ܽ֫:[Ljava/lang/String;

    invoke-static {v0, v2}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1529
    sget-object v0, Ll/᩺ۚۚ;->ۧ֫:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1, v0}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;Ll/᩺ۚۚ;)V

    return v1

    .line 1530
    :cond_2
    sget-object v1, Ll/ۨۚۚ;->ᩳ֫:[Ljava/lang/String;

    invoke-static {v0, v1}, Ll/᩷֡ۚ;->֫(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1531
    invoke-virtual {p2}, Ll/ܿۚۚ;->֨()V

    .line 1532
    sget-object v0, Ll/᩺ۚۚ;->᩻֫:Ll/᩺ۚۚ;

    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ۧ(Ll/᩺ۚۚ;)V

    .line 1533
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    .line 1534
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1

    :cond_3
    const-string v1, "col"

    .line 1536
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 1537
    invoke-virtual {p2}, Ll/ܿۚۚ;->֨()V

    .line 1538
    sget-object v0, Ll/᩺ۚۚ;->۟:Ll/᩺ۚۚ;

    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ۧ(Ll/᩺ۚۚ;)V

    .line 1539
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    .line 1540
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1

    :cond_4
    const-string v1, "tr"

    .line 1541
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 1542
    invoke-virtual {p2}, Ll/ܿۚۚ;->֨()V

    .line 1543
    sget-object v0, Ll/᩺ۚۚ;->ۜ֫:Ll/᩺ۚۚ;

    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ۧ(Ll/᩺ۚۚ;)V

    .line 1544
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    .line 1545
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1

    :cond_5
    const-string v1, "td"

    .line 1546
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    const-string v1, "th"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_0

    .line 1552
    :cond_6
    invoke-virtual {p2}, Ll/ܿۚۚ;->֨()V

    .line 1553
    sget-object v0, Ll/᩺ۚۚ;->ۨ:Ll/᩺ۚۚ;

    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ۧ(Ll/᩺ۚۚ;)V

    .line 1554
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    .line 1555
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1

    .line 1547
    :cond_7
    :goto_0
    invoke-virtual {p2}, Ll/ܿۚۚ;->֨()V

    .line 1548
    sget-object v0, Ll/᩺ۚۚ;->ᩳ֫:Ll/᩺ۚۚ;

    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ۧ(Ll/᩺ۚۚ;)V

    .line 1549
    invoke-virtual {p2, v0}, Ll/ܿۚۚ;->ܽ(Ll/᩺ۚۚ;)V

    .line 1550
    invoke-virtual {p2, p1}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;)Z

    move-result p1

    return p1

    .line 1524
    :pswitch_3
    sget-object v0, Ll/᩺ۚۚ;->ۨ:Ll/᩺ۚۚ;

    invoke-virtual {p2, p1, v0}, Ll/ܿۚۚ;->֫(Ll/ۖ֨ۚ;Ll/᩺ۚۚ;)V

    :cond_8
    :goto_1
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method
