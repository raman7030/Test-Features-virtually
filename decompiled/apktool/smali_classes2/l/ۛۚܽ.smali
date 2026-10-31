.class public Ll/ۛۚܽ;
.super Ljava/lang/Object;
.source "Z6QT"


# instance fields
.field public ֫:Ll/ۛۚܽ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 500
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 501
    sget-object v0, Ll/ܳ۠ܽ;->ۧ:Ll/ۛۚܽ;

    iput-object v0, p0, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۬֨ܽ;)Z
    .locals 10

    .line 521
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v3, p0

    :goto_0
    const/4 v1, 0x4

    const/4 v2, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_14

    .line 524
    instance-of v6, v3, Ll/᩺֡ܽ;

    const/4 v7, 0x0

    if-eqz v6, :cond_0

    goto :goto_1

    .line 526
    :cond_0
    instance-of v6, v3, Ll/۬ۚܽ;

    if-eqz v6, :cond_1

    .line 527
    iput-boolean v5, p1, Ll/۬֨ܽ;->ܽ:Z

    .line 528
    iput-boolean v5, p1, Ll/۬֨ܽ;->֫:Z

    goto :goto_1

    .line 530
    :cond_1
    instance-of v6, v3, Ll/۟ۚܽ;

    if-eqz v6, :cond_2

    check-cast v3, Ll/۟ۚܽ;

    .line 531
    iget-object v3, v3, Ll/۟ۚܽ;->ۧ:Ll/۬ۚܽ;

    goto :goto_0

    .line 532
    :cond_2
    instance-of v6, v3, Ll/֡֨ܽ;

    if-eqz v6, :cond_3

    .line 533
    new-instance v1, Ll/۫֨ܽ;

    invoke-direct {v1, v5, v3, p1}, Ll/۫֨ܽ;-><init>(ILl/ۛۚܽ;Ll/۬֨ܽ;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 534
    iget-object v3, v3, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    goto :goto_0

    .line 535
    :cond_3
    instance-of v6, v3, Ll/ۘۚܽ;

    if-eqz v6, :cond_4

    move-object v1, v3

    check-cast v1, Ll/ۘۚܽ;

    .line 536
    new-instance v1, Ll/۫֨ܽ;

    invoke-direct {v1, v4, v3, p1}, Ll/۫֨ܽ;-><init>(ILl/ۛۚܽ;Ll/۬֨ܽ;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    move-object v3, v7

    goto :goto_0

    .line 538
    :cond_4
    instance-of v6, v3, Ll/ۧ֨ܽ;

    if-eqz v6, :cond_5

    move-object v1, v3

    check-cast v1, Ll/ۧ֨ܽ;

    .line 539
    new-instance v4, Ll/۫֨ܽ;

    invoke-direct {v4, v2, v3, p1}, Ll/۫֨ܽ;-><init>(ILl/ۛۚܽ;Ll/۬֨ܽ;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 540
    iget-object v3, v1, Ll/ۧ֨ܽ;->ۧ:Ll/ۛۚܽ;

    goto :goto_0

    .line 541
    :cond_5
    instance-of v6, v3, Ll/᩷ۚܽ;

    if-eqz v6, :cond_6

    move-object v7, v3

    check-cast v7, Ll/᩷ۚܽ;

    .line 542
    new-instance v8, Ll/۫֨ܽ;

    iget v5, v7, Ll/᩷ۚܽ;->ᩳ:I

    iget v6, v7, Ll/᩷ۚܽ;->ܽ:I

    const/4 v2, 0x3

    move-object v1, v8

    move-object v4, p1

    invoke-direct/range {v1 .. v6}, Ll/۫֨ܽ;-><init>(ILl/ۛۚܽ;Ll/۬֨ܽ;II)V

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 543
    invoke-virtual {p1}, Ll/۬֨ܽ;->֫()V

    .line 544
    iget-object v3, v7, Ll/᩷ۚܽ;->ۧ:Ll/ۛۚܽ;

    goto :goto_0

    .line 545
    :cond_6
    instance-of v6, v3, Ll/֡ۚܽ;

    if-eqz v6, :cond_7

    move-object v7, v3

    check-cast v7, Ll/֡ۚܽ;

    .line 546
    new-instance v8, Ll/۫֨ܽ;

    iget v5, v7, Ll/֡ۚܽ;->ܿ:I

    iget v6, v7, Ll/֡ۚܽ;->ᩳ:I

    const/4 v2, 0x3

    move-object v1, v8

    move-object v4, p1

    invoke-direct/range {v1 .. v6}, Ll/۫֨ܽ;-><init>(ILl/ۛۚܽ;Ll/۬֨ܽ;II)V

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 547
    invoke-virtual {p1}, Ll/۬֨ܽ;->֫()V

    .line 548
    iget-object v3, v7, Ll/֡ۚܽ;->ۧ:Ll/ۛۚܽ;

    goto/16 :goto_0

    .line 549
    :cond_7
    instance-of v6, v3, Ll/ۨ֡ܽ;

    if-eqz v6, :cond_9

    move-object v2, v3

    check-cast v2, Ll/ۨ֡ܽ;

    .line 550
    new-instance v6, Ll/۫֨ܽ;

    invoke-direct {v6, v1, v3, p1}, Ll/۫֨ܽ;-><init>(ILl/ۛۚܽ;Ll/۬֨ܽ;)V

    .line 551
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 552
    invoke-virtual {p1}, Ll/۬֨ܽ;->֫()V

    .line 553
    iget v1, v2, Ll/ۨ֡ܽ;->ܿ:I

    if-nez v1, :cond_8

    .line 554
    iput v4, v6, Ll/۫֨ܽ;->ܺ:I

    .line 555
    iget v1, v6, Ll/۫֨ܽ;->ۢ:I

    iget v3, v6, Ll/۫֨ܽ;->ۧ:I

    add-int/2addr v1, v3

    iput v1, v6, Ll/۫֨ܽ;->ۢ:I

    .line 556
    iget v1, v6, Ll/۫֨ܽ;->ۜ:I

    iget v3, v6, Ll/۫֨ܽ;->֫:I

    add-int/2addr v1, v3

    iput v1, v6, Ll/۫֨ܽ;->ۜ:I

    .line 557
    iget-object v1, v2, Ll/ۨ֡ܽ;->ᩳ:Ll/ۛۚܽ;

    iget-object v1, v1, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    goto :goto_2

    .line 559
    :cond_8
    iget-object v1, v2, Ll/ۨ֡ܽ;->ܽ:[Ll/ۛۚܽ;

    aget-object v1, v1, v5

    :goto_2
    move-object v3, v1

    goto/16 :goto_0

    .line 562
    :cond_9
    instance-of v1, v3, Ll/ۖ֨ܽ;

    if-eqz v1, :cond_a

    move-object v1, v3

    check-cast v1, Ll/ۖ֨ܽ;

    .line 563
    iget v2, p1, Ll/۬֨ܽ;->ᩳ:I

    iget-object v1, v1, Ll/ۖ֨ܽ;->ۧ:[I

    array-length v4, v1

    add-int/2addr v2, v4

    iput v2, p1, Ll/۬֨ܽ;->ᩳ:I

    .line 564
    iget v2, p1, Ll/۬֨ܽ;->ۧ:I

    array-length v1, v1

    add-int/2addr v2, v1

    iput v2, p1, Ll/۬֨ܽ;->ۧ:I

    goto/16 :goto_5

    .line 565
    :cond_a
    instance-of v1, v3, Ll/᩻ۚܽ;

    if-eqz v1, :cond_b

    .line 566
    iget v1, p1, Ll/۬֨ܽ;->ᩳ:I

    add-int/2addr v1, v4

    iput v1, p1, Ll/۬֨ܽ;->ᩳ:I

    .line 567
    iget v1, p1, Ll/۬֨ܽ;->ۧ:I

    add-int/2addr v1, v4

    iput v1, p1, Ll/۬֨ܽ;->ۧ:I

    goto :goto_5

    .line 568
    :cond_b
    instance-of v1, v3, Ll/᩹ۚܽ;

    if-eqz v1, :cond_c

    .line 569
    iget v1, p1, Ll/۬֨ܽ;->ᩳ:I

    add-int/2addr v1, v4

    iput v1, p1, Ll/۬֨ܽ;->ᩳ:I

    .line 570
    iget v1, p1, Ll/۬֨ܽ;->ۧ:I

    add-int/2addr v1, v2

    iput v1, p1, Ll/۬֨ܽ;->ۧ:I

    goto :goto_5

    .line 571
    :cond_c
    instance-of v1, v3, Ll/۫ۚܽ;

    if-nez v1, :cond_12

    instance-of v1, v3, Ll/ܿ۠ܽ;

    if-eqz v1, :cond_d

    goto :goto_4

    .line 574
    :cond_d
    instance-of v1, v3, Ll/ۜۚܽ;

    if-eqz v1, :cond_f

    move-object v1, v3

    check-cast v1, Ll/ۜۚܽ;

    .line 575
    iget v2, p1, Ll/۬֨ܽ;->ᩳ:I

    iget v1, v1, Ll/ۜۚܽ;->ۧ:I

    add-int/2addr v2, v1

    iput v2, p1, Ll/۬֨ܽ;->ᩳ:I

    .line 576
    iget-boolean v1, p1, Ll/۬֨ܽ;->ܽ:Z

    if-eqz v1, :cond_e

    .line 577
    iget v1, p1, Ll/۬֨ܽ;->ۧ:I

    const v2, 0x7fffffff

    add-int/2addr v1, v2

    iput v1, p1, Ll/۬֨ܽ;->ۧ:I

    .line 579
    :cond_e
    iput-boolean v5, p1, Ll/۬֨ܽ;->֫:Z

    goto :goto_5

    .line 580
    :cond_f
    instance-of v1, v3, Ll/֡֡ܽ;

    if-nez v1, :cond_11

    instance-of v1, v3, Ll/ܰ֡ܽ;

    if-eqz v1, :cond_10

    goto :goto_3

    .line 582
    :cond_10
    instance-of v1, v3, Ll/۫֡ܽ;

    if-eqz v1, :cond_13

    move-object v1, v3

    check-cast v1, Ll/۫֡ܽ;

    .line 583
    iget v2, p1, Ll/۬֨ܽ;->ᩳ:I

    iget-object v1, v1, Ll/۫֡ܽ;->ۧ:[I

    array-length v1, v1

    add-int/2addr v2, v1

    iput v2, p1, Ll/۬֨ܽ;->ᩳ:I

    .line 584
    iput-boolean v5, p1, Ll/۬֨ܽ;->ܽ:Z

    goto :goto_5

    .line 581
    :cond_11
    :goto_3
    iput-boolean v5, p1, Ll/۬֨ܽ;->ܽ:Z

    goto :goto_5

    .line 572
    :cond_12
    :goto_4
    iget v1, p1, Ll/۬֨ܽ;->ᩳ:I

    add-int/2addr v1, v4

    iput v1, p1, Ll/۬֨ܽ;->ᩳ:I

    .line 573
    iput-boolean v5, p1, Ll/۬֨ܽ;->֫:Z

    .line 586
    :cond_13
    :goto_5
    iget-object v3, v3, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    goto/16 :goto_0

    .line 590
    :cond_14
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_15

    .line 591
    iget-boolean p1, p1, Ll/۬֨ܽ;->֫:Z

    return p1

    .line 0
    :cond_15
    invoke-static {v0, v4}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v6

    .line 593
    check-cast v6, Ll/۫֨ܽ;

    .line 594
    iget v7, v6, Ll/۫֨ܽ;->᩻:I

    iget v8, v6, Ll/۫֨ܽ;->ܽ:I

    iget-object v9, v6, Ll/۫֨ܽ;->ۡ:Ll/ۛۚܽ;

    if-eqz v7, :cond_21

    if-eq v7, v4, :cond_20

    if-eq v7, v2, :cond_1e

    const/4 v2, 0x3

    if-eq v7, v2, :cond_19

    if-ne v7, v1, :cond_18

    .line 635
    check-cast v9, Ll/ۨ֡ܽ;

    .line 636
    iget v1, v6, Ll/۫֨ܽ;->ܺ:I

    if-nez v1, :cond_17

    .line 637
    iget v1, v6, Ll/۫֨ܽ;->ۧ:I

    iget v2, p1, Ll/۬֨ܽ;->ᩳ:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, v6, Ll/۫֨ܽ;->ۧ:I

    .line 638
    iget v1, v6, Ll/۫֨ܽ;->֫:I

    iget v2, p1, Ll/۬֨ܽ;->ۧ:I

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, v6, Ll/۫֨ܽ;->֫:I

    .line 639
    iget-boolean v1, v6, Ll/۫֨ܽ;->᩷:Z

    iget-boolean v2, p1, Ll/۬֨ܽ;->ܽ:Z

    and-int/2addr v1, v2

    iput-boolean v1, v6, Ll/۫֨ܽ;->᩷:Z

    .line 640
    invoke-virtual {p1}, Ll/۬֨ܽ;->֫()V

    .line 641
    iget v1, v6, Ll/۫֨ܽ;->ܳ:I

    add-int/2addr v1, v4

    iput v1, v6, Ll/۫֨ܽ;->ܳ:I

    iget v2, v9, Ll/ۨ֡ܽ;->ܿ:I

    if-ge v1, v2, :cond_16

    .line 642
    iget-object v2, v9, Ll/ۨ֡ܽ;->ܽ:[Ll/ۛۚܽ;

    aget-object v3, v2, v1

    goto/16 :goto_0

    .line 644
    :cond_16
    iget v1, v6, Ll/۫֨ܽ;->ۢ:I

    iget v2, v6, Ll/۫֨ܽ;->ۧ:I

    add-int/2addr v1, v2

    iput v1, v6, Ll/۫֨ܽ;->ۢ:I

    .line 645
    iget v1, v6, Ll/۫֨ܽ;->ۜ:I

    iget v2, v6, Ll/۫֨ܽ;->֫:I

    add-int/2addr v1, v2

    iput v1, v6, Ll/۫֨ܽ;->ۜ:I

    .line 646
    iput v4, v6, Ll/۫֨ܽ;->ܺ:I

    .line 647
    iget-object v1, v9, Ll/ۨ֡ܽ;->ᩳ:Ll/ۛۚܽ;

    iget-object v3, v1, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    goto/16 :goto_0

    .line 650
    :cond_17
    iget v1, p1, Ll/۬֨ܽ;->ᩳ:I

    iget v2, v6, Ll/۫֨ܽ;->ۢ:I

    add-int/2addr v1, v2

    iput v1, p1, Ll/۬֨ܽ;->ᩳ:I

    .line 651
    iget v1, p1, Ll/۬֨ܽ;->ۧ:I

    iget v2, v6, Ll/۫֨ܽ;->ۜ:I

    add-int/2addr v1, v2

    iput v1, p1, Ll/۬֨ܽ;->ۧ:I

    .line 652
    iget-boolean v1, p1, Ll/۬֨ܽ;->ܽ:Z

    iget-boolean v2, v6, Ll/۫֨ܽ;->᩷:Z

    and-int/2addr v1, v2

    iput-boolean v1, p1, Ll/۬֨ܽ;->ܽ:Z

    .line 653
    iput-boolean v5, p1, Ll/۬֨ܽ;->֫:Z

    goto :goto_7

    .line 657
    :cond_18
    new-instance p1, Ljava/lang/AssertionError;

    iget v0, v6, Ll/۫֨ܽ;->᩻:I

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(I)V

    throw p1

    .line 615
    :cond_19
    iget v1, p1, Ll/۬֨ܽ;->ᩳ:I

    iget v2, v6, Ll/۫֨ܽ;->ᩳ:I

    mul-int v1, v1, v2

    iget v3, v6, Ll/۫֨ܽ;->ۢ:I

    add-int/2addr v1, v3

    if-ge v1, v3, :cond_1a

    const v1, 0xfffffff

    .line 619
    :cond_1a
    iput v1, p1, Ll/۬֨ܽ;->ᩳ:I

    .line 620
    iget-boolean v1, v6, Ll/۫֨ܽ;->᩷:Z

    iget-boolean v3, p1, Ll/۬֨ܽ;->ܽ:Z

    and-int/2addr v1, v3

    if-eqz v1, :cond_1b

    .line 621
    iget v1, p1, Ll/۬֨ܽ;->ۧ:I

    mul-int v1, v1, v8

    iget v3, v6, Ll/۫֨ܽ;->ۜ:I

    add-int/2addr v1, v3

    .line 622
    iput v1, p1, Ll/۬֨ܽ;->ۧ:I

    if-ge v1, v3, :cond_1c

    .line 624
    iput-boolean v5, p1, Ll/۬֨ܽ;->ܽ:Z

    goto :goto_6

    .line 627
    :cond_1b
    iput-boolean v5, p1, Ll/۬֨ܽ;->ܽ:Z

    .line 629
    :cond_1c
    :goto_6
    iget-boolean v1, p1, Ll/۬֨ܽ;->֫:Z

    if-eqz v1, :cond_1d

    if-ne v2, v8, :cond_1d

    iget-boolean v1, v6, Ll/۫֨ܽ;->ܿ:Z

    if-eqz v1, :cond_1d

    const/4 v5, 0x1

    :cond_1d
    iput-boolean v5, p1, Ll/۬֨ܽ;->֫:Z

    .line 0
    invoke-static {v0, v4}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    .line 632
    iget-object v3, v9, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    goto/16 :goto_0

    .line 607
    :cond_1e
    move-object v1, v9

    check-cast v1, Ll/ۧ֨ܽ;

    iget-object v1, v1, Ll/ۧ֨ܽ;->ܽ:Ll/֫֨ܽ;

    sget-object v2, Ll/֫֨ܽ;->᩶:Ll/֫֨ܽ;

    if-eq v1, v2, :cond_1f

    .line 608
    iget v1, v6, Ll/۫֨ܽ;->ۢ:I

    iput v1, p1, Ll/۬֨ܽ;->ᩳ:I

    .line 609
    iput-boolean v5, p1, Ll/۬֨ܽ;->֫:Z

    .line 0
    :cond_1f
    invoke-static {v0, v4}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    .line 612
    iget-object v3, v9, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    goto/16 :goto_0

    .line 601
    :cond_20
    iput-boolean v5, p1, Ll/۬֨ܽ;->ܽ:Z

    .line 602
    iput-boolean v5, p1, Ll/۬֨ܽ;->֫:Z

    .line 0
    invoke-static {v0, v4}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    .line 604
    iget-object v3, v9, Ll/ۛۚܽ;->֫:Ll/ۛۚܽ;

    goto/16 :goto_0

    .line 596
    :cond_21
    iput-boolean v5, p1, Ll/۬֨ܽ;->ܽ:Z

    .line 597
    iput-boolean v5, p1, Ll/۬֨ܽ;->֫:Z

    .line 0
    :goto_7
    invoke-static {v0, v4}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    goto/16 :goto_0
.end method
