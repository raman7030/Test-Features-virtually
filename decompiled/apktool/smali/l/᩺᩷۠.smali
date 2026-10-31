.class public final Ll/᩺᩷۠;
.super Ll/۟᩷۠;
.source "O44L"


# instance fields
.field public final synthetic ܽ:Ll/ܳۢ۠;

.field public final ᩳ:Ll/֨ۢ۠;


# direct methods
.method public constructor <init>(Ll/ܳۢ۠;Ll/ۙ֨֨;Ljava/lang/Object;)V
    .locals 0

    .line 568
    iput-object p1, p0, Ll/᩺᩷۠;->ܽ:Ll/ܳۢ۠;

    .line 569
    invoke-static {p2}, Ll/֨᩷۠;->֫(Ll/ۙ֨֨;)I

    move-result p2

    invoke-direct {p0, p1, p2}, Ll/۟᩷۠;-><init>(Ll/ܳۢ۠;I)V

    packed-switch p2, :pswitch_data_0

    .line 590
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p3, "unsupported tag: "

    .line 0
    invoke-static {p2, p3}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 590
    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 587
    :pswitch_0
    check-cast p3, Ljava/lang/String;

    invoke-static {p3}, Ll/ۚۢ۠;->֫(Ljava/lang/String;)Ll/֨ۢ۠;

    move-result-object p1

    iput-object p1, p0, Ll/᩺᩷۠;->ᩳ:Ll/֨ۢ۠;

    return-void

    .line 584
    :pswitch_1
    check-cast p3, Ljava/lang/Double;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    new-instance p1, Ll/֨ۢ۠;

    const/4 p2, 0x6

    invoke-direct {p1, p2, p3}, Ll/֨ۢ۠;-><init>(ILjava/lang/Object;)V

    .line 584
    iput-object p1, p0, Ll/᩺᩷۠;->ᩳ:Ll/֨ۢ۠;

    return-void

    .line 581
    :pswitch_2
    check-cast p3, Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    new-instance p1, Ll/֨ۢ۠;

    const/4 p2, 0x4

    invoke-direct {p1, p2, p3}, Ll/֨ۢ۠;-><init>(ILjava/lang/Object;)V

    .line 581
    iput-object p1, p0, Ll/᩺᩷۠;->ᩳ:Ll/֨ۢ۠;

    return-void

    .line 578
    :pswitch_3
    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    new-instance p1, Ll/֨ۢ۠;

    const/4 p2, 0x5

    invoke-direct {p1, p2, p3}, Ll/֨ۢ۠;-><init>(ILjava/lang/Object;)V

    .line 578
    iput-object p1, p0, Ll/᩺᩷۠;->ᩳ:Ll/֨ۢ۠;

    return-void

    .line 575
    :pswitch_4
    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    new-instance p1, Ll/֨ۢ۠;

    const/4 p2, 0x3

    invoke-direct {p1, p2, p3}, Ll/֨ۢ۠;-><init>(ILjava/lang/Object;)V

    .line 575
    iput-object p1, p0, Ll/᩺᩷۠;->ᩳ:Ll/֨ۢ۠;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method private ۜ()V
    .locals 4

    const/4 v0, 0x1

    .line 595
    iget-object v1, p0, Ll/᩺᩷۠;->ᩳ:Ll/֨ۢ۠;

    iget-object v2, p0, Ll/᩺᩷۠;->ܽ:Ll/ܳۢ۠;

    iget v3, p0, Ll/۟᩷۠;->ۧ:I

    if-eq v3, v0, :cond_1

    const/4 v0, 0x3

    if-ne v3, v0, :cond_0

    goto :goto_0

    .line 598
    :cond_0
    iget-object v0, v2, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    invoke-virtual {v0, v1}, Ll/֨᩷۠;->֫(Ll/۠ۢ۠;)V

    return-void

    .line 596
    :cond_1
    :goto_0
    iget-object v0, v2, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    .line 1002
    iget-object v2, v0, Ll/֨᩷۠;->ۙ:Ll/۫ۢ۠;

    invoke-virtual {v2, v1}, Ll/۫ۢ۠;->֫(Ll/۠ۢ۠;)I

    move-result v2

    const/16 v3, 0x14

    .line 1003
    invoke-virtual {v0, v3, v2, v1}, Ll/֨᩷۠;->֫(IILl/᩸ۢ۠;)V

    return-void
.end method

.method private ᩷()Ljava/lang/Number;
    .locals 1

    .line 603
    iget-object v0, p0, Ll/᩺᩷۠;->ᩳ:Ll/֨ۢ۠;

    iget-object v0, v0, Ll/֨ۢ۠;->᩸:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 709
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "immediate("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/᩺᩷۠;->ᩳ:Ll/֨ۢ۠;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)Ll/۟᩷۠;
    .locals 4

    .line 667
    iget v0, p0, Ll/۟᩷۠;->ۧ:I

    if-ne v0, p1, :cond_0

    goto/16 :goto_0

    .line 670
    :cond_0
    iget-object v1, p0, Ll/᩺᩷۠;->ܽ:Ll/ܳۢ۠;

    if-eqz p1, :cond_7

    const/4 v0, 0x1

    if-eq p1, v0, :cond_6

    const/4 v0, 0x2

    if-eq p1, v0, :cond_5

    const/4 v0, 0x3

    if-eq p1, v0, :cond_4

    const/4 v0, 0x5

    if-eq p1, v0, :cond_3

    const/4 v0, 0x6

    if-eq p1, v0, :cond_2

    const/4 v0, 0x7

    if-eq p1, v0, :cond_1

    .line 703
    invoke-super {p0, p1}, Ll/۟᩷۠;->֫(I)Ll/۟᩷۠;

    move-result-object p1

    return-object p1

    .line 699
    :cond_1
    new-instance p1, Ll/᩺᩷۠;

    iget-object v0, v1, Ll/ܳۢ۠;->ᩳ:Ll/᩷ۚ֨;

    iget-object v0, v0, Ll/᩷ۚ֨;->ᩳۧ:Ll/۟ۚ֨;

    .line 701
    invoke-direct {p0}, Ll/᩺᩷۠;->᩷()Ljava/lang/Number;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    int-to-short v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p1, v1, v0, v2}, Ll/᩺᩷۠;-><init>(Ll/ܳۢ۠;Ll/ۙ֨֨;Ljava/lang/Object;)V

    return-object p1

    .line 695
    :cond_2
    new-instance p1, Ll/᩺᩷۠;

    iget-object v0, v1, Ll/ܳۢ۠;->ᩳ:Ll/᩷ۚ֨;

    iget-object v0, v0, Ll/᩷ۚ֨;->ۖ:Ll/۟ۚ֨;

    .line 697
    invoke-direct {p0}, Ll/᩺᩷۠;->᩷()Ljava/lang/Number;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    int-to-char v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p1, v1, v0, v2}, Ll/᩺᩷۠;-><init>(Ll/ܳۢ۠;Ll/ۙ֨֨;Ljava/lang/Object;)V

    return-object p1

    .line 691
    :cond_3
    new-instance p1, Ll/᩺᩷۠;

    iget-object v0, v1, Ll/ܳۢ۠;->ᩳ:Ll/᩷ۚ֨;

    iget-object v0, v0, Ll/᩷ۚ֨;->ܺ:Ll/۟ۚ֨;

    .line 693
    invoke-direct {p0}, Ll/᩺᩷۠;->᩷()Ljava/lang/Number;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    int-to-byte v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p1, v1, v0, v2}, Ll/᩺᩷۠;-><init>(Ll/ܳۢ۠;Ll/ۙ֨֨;Ljava/lang/Object;)V

    return-object p1

    .line 687
    :cond_4
    new-instance p1, Ll/᩺᩷۠;

    iget-object v0, v1, Ll/ܳۢ۠;->ᩳ:Ll/᩷ۚ֨;

    iget-object v0, v0, Ll/᩷ۚ֨;->ܶ:Ll/۟ۚ֨;

    .line 689
    invoke-direct {p0}, Ll/᩺᩷۠;->᩷()Ljava/lang/Number;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-direct {p1, v1, v0, v2}, Ll/᩺᩷۠;-><init>(Ll/ܳۢ۠;Ll/ۙ֨֨;Ljava/lang/Object;)V

    return-object p1

    .line 683
    :cond_5
    new-instance p1, Ll/᩺᩷۠;

    iget-object v0, v1, Ll/ܳۢ۠;->ᩳ:Ll/᩷ۚ֨;

    iget-object v0, v0, Ll/᩷ۚ֨;->ۤ:Ll/۟ۚ֨;

    .line 685
    invoke-direct {p0}, Ll/᩺᩷۠;->᩷()Ljava/lang/Number;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-direct {p1, v1, v0, v2}, Ll/᩺᩷۠;-><init>(Ll/ܳۢ۠;Ll/ۙ֨֨;Ljava/lang/Object;)V

    return-object p1

    .line 679
    :cond_6
    new-instance p1, Ll/᩺᩷۠;

    iget-object v0, v1, Ll/ܳۢ۠;->ᩳ:Ll/᩷ۚ֨;

    iget-object v0, v0, Ll/᩷ۚ֨;->ۜ֫:Ll/۟ۚ֨;

    .line 681
    invoke-direct {p0}, Ll/᩺᩷۠;->᩷()Ljava/lang/Number;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-direct {p1, v1, v0, v2}, Ll/᩺᩷۠;-><init>(Ll/ܳۢ۠;Ll/ۙ֨֨;Ljava/lang/Object;)V

    return-object p1

    .line 672
    :cond_7
    invoke-static {v0}, Ll/֨᩷۠;->ᩴ(I)I

    move-result p1

    if-nez p1, :cond_8

    :goto_0
    return-object p0

    .line 675
    :cond_8
    new-instance p1, Ll/᩺᩷۠;

    iget-object v0, v1, Ll/ܳۢ۠;->ᩳ:Ll/᩷ۚ֨;

    iget-object v0, v0, Ll/᩷ۚ֨;->֫֫:Ll/۟ۚ֨;

    .line 677
    invoke-direct {p0}, Ll/᩺᩷۠;->᩷()Ljava/lang/Number;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p1, v1, v0, v2}, Ll/᩺᩷۠;-><init>(Ll/ܳۢ۠;Ll/ۙ֨֨;Ljava/lang/Object;)V

    return-object p1
.end method

.method public final ܿ()Ll/ۛ᩷۠;
    .locals 2

    .line 662
    invoke-direct {p0}, Ll/᩺᩷۠;->᩷()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0xa7

    goto :goto_0

    :cond_0
    const/16 v0, 0xa8

    .line 663
    :goto_0
    iget-object v1, p0, Ll/᩺᩷۠;->ܽ:Ll/ܳۢ۠;

    invoke-virtual {v1, v0}, Ll/ܳۢ۠;->֫(I)Ll/ۛ᩷۠;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ll/۟᩷۠;
    .locals 11

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    const/4 v2, 0x0

    .line 607
    iget-object v3, p0, Ll/᩺᩷۠;->ܽ:Ll/ܳۢ۠;

    iget v4, p0, Ll/۟᩷۠;->ۧ:I

    packed-switch v4, :pswitch_data_0

    .line 645
    invoke-static {}, Ll/۫ۙ;->֫()V

    throw v2

    .line 642
    :pswitch_0
    invoke-direct {p0}, Ll/᩺᩷۠;->ۜ()V

    goto/16 :goto_3

    .line 635
    :pswitch_1
    invoke-direct {p0}, Ll/᩺᩷۠;->᩷()Ljava/lang/Number;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmpl-double v2, v5, v7

    if-nez v2, :cond_0

    div-double v9, v0, v5

    cmpl-double v2, v9, v7

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    cmpl-double v2, v5, v0

    if-nez v2, :cond_1

    .line 637
    :goto_0
    iget-object v0, v3, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    double-to-int v1, v5

    add-int/lit8 v1, v1, 0xe

    invoke-virtual {v0, v1}, Ll/֨᩷۠;->ܽ(I)V

    goto/16 :goto_3

    .line 639
    :cond_1
    invoke-direct {p0}, Ll/᩺᩷۠;->ۜ()V

    goto/16 :goto_3

    .line 627
    :pswitch_2
    invoke-direct {p0}, Ll/᩺᩷۠;->᩷()Ljava/lang/Number;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    const/4 v5, 0x0

    cmpl-float v6, v2, v5

    if-nez v6, :cond_2

    const/high16 v6, 0x3f800000    # 1.0f

    div-float/2addr v6, v2

    cmpl-float v5, v6, v5

    if-lez v5, :cond_2

    goto :goto_1

    :cond_2
    float-to-double v5, v2

    cmpl-double v7, v5, v0

    if-eqz v7, :cond_4

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    cmpl-double v7, v5, v0

    if-nez v7, :cond_3

    goto :goto_1

    .line 631
    :cond_3
    invoke-direct {p0}, Ll/᩺᩷۠;->ۜ()V

    goto :goto_3

    .line 629
    :cond_4
    :goto_1
    iget-object v0, v3, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    float-to-int v1, v2

    add-int/lit8 v1, v1, 0xb

    invoke-virtual {v0, v1}, Ll/֨᩷۠;->ܽ(I)V

    goto :goto_3

    .line 620
    :pswitch_3
    invoke-direct {p0}, Ll/᩺᩷۠;->᩷()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    const-wide/16 v5, 0x0

    cmp-long v2, v0, v5

    if-eqz v2, :cond_6

    const-wide/16 v5, 0x1

    cmp-long v2, v0, v5

    if-nez v2, :cond_5

    goto :goto_2

    .line 624
    :cond_5
    invoke-direct {p0}, Ll/᩺᩷۠;->ۜ()V

    goto :goto_3

    .line 622
    :cond_6
    :goto_2
    iget-object v2, v3, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    long-to-int v1, v0

    add-int/lit8 v1, v1, 0x9

    invoke-virtual {v2, v1}, Ll/֨᩷۠;->ܽ(I)V

    goto :goto_3

    .line 609
    :pswitch_4
    invoke-direct {p0}, Ll/᩺᩷۠;->᩷()Ljava/lang/Number;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    const/4 v1, -0x1

    if-gt v1, v0, :cond_7

    const/4 v1, 0x5

    if-gt v0, v1, :cond_7

    .line 611
    iget-object v1, v3, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    add-int/lit8 v0, v0, 0x3

    invoke-virtual {v1, v0}, Ll/֨᩷۠;->ܽ(I)V

    goto :goto_3

    :cond_7
    const/16 v1, -0x80

    if-gt v1, v0, :cond_8

    const/16 v1, 0x7f

    if-gt v0, v1, :cond_8

    .line 613
    iget-object v1, v3, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    const/16 v5, 0x10

    .line 909
    invoke-virtual {v1, v5, v0, v2}, Ll/֨᩷۠;->֫(IILl/۠ۢ۠;)V

    goto :goto_3

    :cond_8
    const/16 v1, -0x8000

    if-gt v1, v0, :cond_9

    const/16 v1, 0x7fff

    if-gt v0, v1, :cond_9

    .line 615
    iget-object v1, v3, Ll/ܳۢ۠;->֫:Ll/֨᩷۠;

    const/16 v5, 0x11

    .line 1007
    invoke-virtual {v1, v5, v0, v2}, Ll/֨᩷۠;->֫(IILl/᩸ۢ۠;)V

    goto :goto_3

    .line 617
    :cond_9
    invoke-direct {p0}, Ll/᩺᩷۠;->ۜ()V

    .line 647
    :goto_3
    invoke-static {v3}, Ll/ܳۢ۠;->֫(Ll/ܳۢ۠;)[Ll/۟᩷۠;

    move-result-object v0

    aget-object v0, v0, v4

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method
