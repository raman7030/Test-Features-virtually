.class public final Ll/ۜۖᩳ;
.super Landroid/widget/Filter;
.source "U5MD"


# instance fields
.field public ֫:Ll/۟ᩳܽ;

.field public ۧ:I

.field public ܳ:Ljava/lang/String;

.field public ܽ:I

.field public final synthetic ܿ:Ll/᩷ۖᩳ;

.field public ᩳ:Ll/᩻ᩳܿ;


# direct methods
.method public constructor <init>(Ll/᩷ۖᩳ;)V
    .locals 1

    .line 503
    iput-object p1, p0, Ll/ۜۖᩳ;->ܿ:Ll/᩷ۖᩳ;

    invoke-direct {p0}, Landroid/widget/Filter;-><init>()V

    const/4 p1, 0x0

    .line 505
    iput p1, p0, Ll/ۜۖᩳ;->ܽ:I

    .line 507
    new-instance p1, Ll/᩻ᩳܿ;

    invoke-direct {p1}, Ll/᩻ᩳܿ;-><init>()V

    iput-object p1, p0, Ll/ۜۖᩳ;->ᩳ:Ll/᩻ᩳܿ;

    .line 508
    new-instance p1, Ll/۟ᩳܽ;

    const/4 v0, 0x2

    invoke-direct {p1, v0}, Ll/۟ᩳܽ;-><init>(I)V

    iput-object p1, p0, Ll/ۜۖᩳ;->֫:Ll/۟ᩳܽ;

    return-void
.end method

.method private ֫(Ll/ۢ᩻ܽ;ILjava/lang/String;)V
    .locals 4

    if-nez p1, :cond_0

    goto/16 :goto_2

    .line 640
    :cond_0
    invoke-interface {p1}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘ᩻ܽ;

    .line 641
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v1

    if-ne v1, p2, :cond_1

    .line 642
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/֡᩻ܽ;

    .line 643
    invoke-interface {p2}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۜۖᩳ;->ܳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 645
    :cond_2
    invoke-interface {p2}, Ll/֡᩻ܽ;->᩷()I

    move-result p1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_5

    .line 647
    invoke-interface {p2}, Ll/֡᩻ܽ;->ۢ()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۜ᩻ܽ;

    .line 648
    invoke-interface {v2, v0}, Ll/ۜ᩻ܽ;->ܺ(I)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 649
    invoke-interface {v2, v0}, Ll/ۜ᩻ܽ;->ۧ(I)Ll/᩷᩻ܽ;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 651
    new-instance v1, Landroid/text/SpannableString;

    .line 0
    invoke-static {p3}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 651
    invoke-interface {v2}, Ll/᩷᩻ܽ;->۟֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Ll/ۜۖᩳ;->ᩳ:Ll/᩻ᩳܿ;

    invoke-virtual {v2, v1}, Ll/᩻ᩳܿ;->֫(Landroid/text/SpannableString;)V

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    :goto_2
    return-void
.end method

.method private ֫(Ll/ۢ᩻ܽ;Z)V
    .locals 7

    .line 586
    invoke-interface {p1}, Ll/ۢ᩻ܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘ᩻ܽ;

    .line 587
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->᩻()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 588
    :goto_0
    invoke-interface {v0}, Ll/ۘ᩻ܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩻ܽ;

    .line 589
    invoke-interface {v1}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "attr"

    .line 590
    iget-object v4, p0, Ll/ۜۖᩳ;->ᩳ:Ll/᩻ᩳܿ;

    if-eqz p2, :cond_4

    .line 591
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    if-eqz v2, :cond_3

    .line 594
    new-instance v1, Landroid/text/SpannableString;

    const-string v3, "?android:attr/"

    invoke-direct {v1, v3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v4, v1}, Ll/᩻ᩳܿ;->֫(Landroid/text/SpannableString;)V

    goto :goto_1

    .line 596
    :cond_3
    new-instance v1, Landroid/text/SpannableString;

    const-string v3, "?attr/"

    invoke-direct {v1, v3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v4, v1}, Ll/᩻ᩳܿ;->֫(Landroid/text/SpannableString;)V

    goto :goto_1

    .line 598
    :cond_4
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_1

    :cond_5
    const-string v3, "/"

    if-eqz v2, :cond_6

    .line 601
    new-instance v5, Landroid/text/SpannableString;

    const-string v6, "@android:"

    .line 0
    invoke-static {v6, v1, v3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 601
    invoke-direct {v5, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v4, v5}, Ll/᩻ᩳܿ;->֫(Landroid/text/SpannableString;)V

    goto :goto_1

    .line 603
    :cond_6
    new-instance v5, Landroid/text/SpannableString;

    const-string v6, "@"

    .line 0
    invoke-static {v6, v1, v3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 603
    invoke-direct {v5, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v4, v5}, Ll/᩻ᩳܿ;->֫(Landroid/text/SpannableString;)V

    goto :goto_1

    :cond_7
    return-void
.end method


# virtual methods
.method public final performFiltering(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;
    .locals 16

    move-object/from16 v0, p0

    .line 518
    iget-object v1, v0, Ll/ۜۖᩳ;->ܿ:Ll/᩷ۖᩳ;

    iget-object v2, v1, Ll/᩷ۖᩳ;->᩹:Landroid/text/style/ForegroundColorSpan;

    iget-object v3, v1, Ll/᩷ۖᩳ;->᩸:Landroid/text/style/ForegroundColorSpan;

    iget-object v1, v1, Ll/᩷ۖᩳ;->۫:Ll/ۡۖᩳ;

    if-nez p1, :cond_0

    const-string v4, ""

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    .line 519
    :goto_0
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    iput v5, v0, Ll/ۜۖᩳ;->ۧ:I

    const-string v5, "@"

    .line 522
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    const-string v7, "?"

    iget-object v8, v0, Ll/ۜۖᩳ;->ᩳ:Ll/᩻ᩳܿ;

    const/4 v9, 0x0

    const/4 v10, -0x1

    const/4 v11, 0x0

    if-nez v6, :cond_2

    invoke-virtual {v4, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    .line 540
    :cond_1
    iput v9, v0, Ll/ۜۖᩳ;->ܽ:I

    .line 541
    invoke-virtual {v8}, Ll/᩻ᩳܿ;->clear()V

    goto :goto_4

    :cond_2
    :goto_1
    const/16 v6, 0x2f

    .line 523
    invoke-virtual {v4, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    const-string v12, "android:"

    .line 524
    invoke-virtual {v4, v12}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v13

    const/4 v14, 0x1

    if-ne v13, v14, :cond_3

    const/4 v13, 0x1

    goto :goto_2

    :cond_3
    const/4 v13, 0x0

    .line 525
    :goto_2
    iget-object v15, v0, Ll/ۜۖᩳ;->֫:Ll/۟ᩳܽ;

    if-ne v6, v10, :cond_9

    .line 526
    invoke-virtual {v4, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_3

    :cond_4
    const/4 v14, 0x2

    .line 572
    :goto_3
    iget v6, v0, Ll/ۜۖᩳ;->ܽ:I

    if-ne v6, v14, :cond_5

    goto :goto_4

    .line 574
    :cond_5
    iput v14, v0, Ll/ۜۖᩳ;->ܽ:I

    .line 575
    invoke-virtual {v8}, Ll/᩻ᩳܿ;->clear()V

    .line 576
    invoke-static {v1}, Ll/ۡۖᩳ;->ܽ(Ll/ۡۖᩳ;)Ll/۫ܽܽ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫ܽܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 578
    invoke-direct {v0, v1, v5}, Ll/ۜۖᩳ;->֫(Ll/ۢ᩻ܽ;Z)V

    :cond_6
    if-eqz v1, :cond_7

    .line 579
    invoke-interface {v1}, Ll/ۢ᩻ܽ;->ۙ()Z

    move-result v1

    if-nez v1, :cond_8

    .line 580
    :cond_7
    invoke-static {}, Ll/ۧᩳܽ;->ۧ()Ll/᩺᩻ܽ;

    move-result-object v1

    invoke-direct {v0, v1, v5}, Ll/ۜۖᩳ;->֫(Ll/ۢ᩻ܽ;Z)V

    .line 581
    :cond_8
    invoke-virtual {v8, v15}, Ll/᩻ᩳܿ;->sort(Ljava/util/Comparator;)V

    :goto_4
    const/4 v1, -0x1

    goto/16 :goto_9

    :cond_9
    if-eqz v13, :cond_a

    const/16 v10, 0x9

    .line 530
    invoke-virtual {v4, v10, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    goto :goto_5

    .line 532
    :cond_a
    invoke-virtual {v4, v14, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    :goto_5
    add-int/2addr v6, v14

    .line 534
    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v11

    .line 535
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_b

    const/4 v6, -0x1

    :cond_b
    if-eqz v13, :cond_c

    const/4 v14, 0x3

    goto :goto_6

    :cond_c
    const/4 v14, 0x4

    .line 612
    :goto_6
    iget v9, v0, Ll/ۜۖᩳ;->ܽ:I

    if-ne v9, v14, :cond_d

    .line 613
    iget-object v9, v0, Ll/ۜۖᩳ;->ܳ:Ljava/lang/String;

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_e

    goto :goto_8

    .line 616
    :cond_d
    iput v14, v0, Ll/ۜۖᩳ;->ܽ:I

    .line 617
    :cond_e
    iput-object v10, v0, Ll/ۜۖᩳ;->ܳ:Ljava/lang/String;

    .line 618
    invoke-virtual {v8}, Ll/᩻ᩳܿ;->clear()V

    .line 619
    invoke-static {v1}, Ll/ۡۖᩳ;->ܽ(Ll/ۡۖᩳ;)Ll/۫ܽܽ;

    move-result-object v9

    invoke-virtual {v9}, Ll/۫ܽܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v9

    if-eqz v13, :cond_10

    if-eqz v9, :cond_f

    .line 621
    invoke-interface {v9}, Ll/ۢ᩻ܽ;->ۙ()Z

    move-result v14

    if-nez v14, :cond_10

    .line 622
    :cond_f
    invoke-static {}, Ll/ۧᩳܽ;->ۧ()Ll/᩺᩻ܽ;

    move-result-object v9

    :cond_10
    const-string v14, "attr"

    .line 624
    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_11

    move-object v5, v7

    :cond_11
    if-eqz v13, :cond_12

    .line 626
    invoke-virtual {v5, v12}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :cond_12
    const-string v7, "/"

    .line 0
    invoke-static {v5, v10, v7}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v13, :cond_13

    const/4 v7, 0x1

    goto :goto_7

    :cond_13
    const/16 v7, 0x7f

    .line 629
    :goto_7
    invoke-direct {v0, v9, v7, v5}, Ll/ۜۖᩳ;->֫(Ll/ۢ᩻ܽ;ILjava/lang/String;)V

    if-eqz v13, :cond_14

    .line 632
    invoke-static {v1}, Ll/ۡۖᩳ;->ܽ(Ll/ۡۖᩳ;)Ll/۫ܽܽ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫ܽܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v1

    invoke-direct {v0, v1, v7, v5}, Ll/ۜۖᩳ;->֫(Ll/ۢ᩻ܽ;ILjava/lang/String;)V

    .line 634
    :cond_14
    invoke-virtual {v8, v15}, Ll/᩻ᩳܿ;->sort(Ljava/util/Comparator;)V

    :goto_8
    move v1, v6

    .line 544
    :goto_9
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    .line 546
    new-instance v5, Ll/֡᩸ۡ;

    invoke-direct {v5}, Ll/֡᩸ۡ;-><init>()V

    .line 548
    invoke-virtual {v8}, Ll/᩻ᩳܿ;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_15
    :goto_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_17

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/text/SpannableString;

    .line 549
    invoke-virtual {v7, v3}, Landroid/text/SpannableString;->removeSpan(Ljava/lang/Object;)V

    .line 550
    invoke-virtual {v7, v2}, Landroid/text/SpannableString;->removeSpan(Ljava/lang/Object;)V

    .line 551
    invoke-virtual {v7}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v8

    .line 552
    invoke-virtual {v8, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    const/16 v10, 0x21

    if-eqz v9, :cond_16

    const/4 v9, 0x0

    .line 553
    invoke-virtual {v5, v7, v9}, Ll/֡᩸ۡ;->֫(Landroid/text/SpannableString;I)V

    .line 554
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v8

    invoke-virtual {v7, v3, v9, v8, v10}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    goto :goto_a

    :cond_16
    const/4 v9, 0x0

    const/4 v12, -0x1

    if-eq v1, v12, :cond_15

    .line 556
    invoke-virtual {v8, v11, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v8

    if-eq v8, v12, :cond_15

    .line 558
    invoke-virtual {v5, v7, v8}, Ll/֡᩸ۡ;->֫(Landroid/text/SpannableString;I)V

    .line 559
    invoke-virtual {v7, v3, v9, v1, v10}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 560
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v12

    add-int/2addr v12, v8

    invoke-virtual {v7, v2, v8, v12, v10}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    goto :goto_a

    .line 564
    :cond_17
    new-instance v1, Landroid/widget/Filter$FilterResults;

    invoke-direct {v1}, Landroid/widget/Filter$FilterResults;-><init>()V

    .line 565
    invoke-virtual {v5}, Ll/֡᩸ۡ;->ۧ()Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, v1, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    .line 566
    invoke-virtual {v5}, Ll/֡᩸ۡ;->֫()I

    move-result v2

    iput v2, v1, Landroid/widget/Filter$FilterResults;->count:I

    return-object v1
.end method

.method public final publishResults(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V
    .locals 1

    if-nez p2, :cond_0

    return-void

    .line 670
    :cond_0
    iget-object p1, p2, Landroid/widget/Filter$FilterResults;->values:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object v0, p0, Ll/ۜۖᩳ;->ܿ:Ll/᩷ۖᩳ;

    iput-object p1, v0, Ll/᩷ۖᩳ;->ۗ:Ljava/util/List;

    .line 671
    iget p1, p2, Landroid/widget/Filter$FilterResults;->count:I

    if-lez p1, :cond_1

    .line 672
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void

    .line 674
    :cond_1
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetInvalidated()V

    return-void
.end method
