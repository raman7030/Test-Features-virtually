.class public final Ll/ۗ᩷ۢ;
.super Ljava/lang/Object;
.source "O1K3"

# interfaces
.implements Ll/֡ۨᩳ;
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Ll/᩸ۤᩳ;


# instance fields
.field public final synthetic ֫֫:Ll/ۛ᩷ۢ;

.field public ۗ:Ll/ᩳᩳܿ;

.field public ۙ:Ll/᩻ۧۢ;

.field public ۛ:Ljava/lang/String;

.field public ۟:Ljava/lang/String;

.field public ۤ:Ljava/lang/String;

.field public ۨ:I

.field public ۫:Ljava/lang/String;

.field public ۬:Ljava/lang/String;

.field public ܰ:Ljava/lang/String;

.field public ᩶:I

.field public ᩸:Landroid/text/style/ForegroundColorSpan;

.field public ᩹:I

.field public ᩺:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۛ᩷ۢ;)V
    .locals 3

    .line 1290
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗ᩷ۢ;->֫֫:Ll/ۛ᩷ۢ;

    .line 1286
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    sget v1, Ll/᩹֡᩷;->֫:I

    invoke-direct {v0, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    iput-object v0, p0, Ll/ۗ᩷ۢ;->᩸:Landroid/text/style/ForegroundColorSpan;

    .line 1291
    new-instance v0, Ll/ᩳᩳܿ;

    invoke-virtual {p1}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v1

    const/16 v2, 0xff

    invoke-direct {v0, v1, v2}, Ll/ᩳᩳܿ;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Ll/ۗ᩷ۢ;->ۗ:Ll/ᩳᩳܿ;

    .line 1292
    invoke-virtual {v0, p0}, Ll/ᩳᩳܿ;->֫(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 1293
    invoke-static {p1}, Ll/ۛ᩷ۢ;->᩻(Ll/ۛ᩷ۢ;)Ll/۫ۨᩳ;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/۫ۨᩳ;->֫(Ll/᩸ۤᩳ;)V

    return-void
.end method

.method private ֫(Ljava/util/ArrayList;II)V
    .locals 3

    .line 1506
    iget-object v0, p0, Ll/ۗ᩷ۢ;->֫֫:Ll/ۛ᩷ۢ;

    invoke-static {v0}, Ll/ۛ᩷ۢ;->᩻(Ll/ۛ᩷ۢ;)Ll/۫ۨᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۘ֫()Ll/֫ܰᩳ;

    move-result-object v1

    const/4 v2, 0x1

    .line 1507
    iput-boolean v2, v1, Ll/֫ܰᩳ;->֫:Z

    .line 1508
    iput p2, v1, Ll/֫ܰᩳ;->ܽ:I

    .line 1509
    iput p3, v1, Ll/֫ܰᩳ;->ۧ:I

    .line 1510
    invoke-static {v0}, Ll/ۛ᩷ۢ;->᩻(Ll/ۛ᩷ۢ;)Ll/۫ۨᩳ;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    .line 1511
    new-instance p2, Ll/ۙ᩷ۢ;

    new-instance p3, Ll/᩶᩷ۢ;

    invoke-direct {p3, p0}, Ll/᩶᩷ۢ;-><init>(Ll/ۗ᩷ۢ;)V

    invoke-direct {p2, p0, p3, v1}, Ll/ۙ᩷ۢ;-><init>(Ll/ۗ᩷ۢ;Ll/᩶᩷ۢ;Ll/֫ܰᩳ;)V

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static ֫(Ll/ۗ᩷ۢ;Ll/۫ۨᩳ;)V
    .locals 14

    .line 1512
    iget-object v0, p0, Ll/ۗ᩷ۢ;->ۗ:Ll/ᩳᩳܿ;

    iget-object v1, p0, Ll/ۗ᩷ۢ;->᩸:Landroid/text/style/ForegroundColorSpan;

    iget-object v2, p0, Ll/ۗ᩷ۢ;->֫֫:Ll/ۛ᩷ۢ;

    invoke-static {v2}, Ll/ۛ᩷ۢ;->ۚ(Ll/ۛ᩷ۢ;)Z

    move-result v3

    if-nez v3, :cond_0

    return-void

    .line 1515
    :cond_0
    iget v3, p0, Ll/ۗ᩷ۢ;->᩶:I

    const/4 v4, 0x3

    if-ne v3, v4, :cond_a

    .line 1516
    iget-object v2, p0, Ll/ۗ᩷ۢ;->ۙ:Ll/᩻ۧۢ;

    invoke-virtual {v2}, Ll/᩻ۧۢ;->᩻()I

    move-result v2

    .line 1517
    iget-object v3, p0, Ll/ۗ᩷ۢ;->ۙ:Ll/᩻ۧۢ;

    invoke-virtual {v3}, Ll/᩻ۧۢ;->ܽ()I

    move-result v3

    .line 1518
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1519
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v6

    invoke-interface {v6, v2, v3}, Ll/᩶᩸ᩳ;->ۧ(II)Ljava/lang/String;

    move-result-object v3

    .line 1520
    invoke-static {}, Ll/ۛ᩷ۢ;->۠()Ll/ۨۘܽ;

    move-result-object v6

    invoke-virtual {v6, v3}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v6

    .line 1521
    :cond_1
    :goto_0
    invoke-virtual {v6}, Ll/۫ۘܽ;->find()Z

    move-result v7

    const-string v8, "]  "

    const-string v9, "["

    const/16 v10, 0x11

    if-eqz v7, :cond_3

    .line 1522
    iget-object v7, p0, Ll/ۗ᩷ۢ;->ۛ:Ljava/lang/String;

    invoke-virtual {v6, v4}, Ll/۫ۘܽ;->group(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 1523
    invoke-virtual {v6}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    .line 1524
    invoke-virtual {v6, v4}, Ll/۫ۘܽ;->start(I)I

    move-result v4

    add-int/2addr v4, v2

    .line 1525
    invoke-virtual {p1, v4}, Ll/۫ۨᩳ;->ۧ(I)I

    move-result v11

    add-int/lit8 v11, v11, 0x1

    .line 1526
    new-instance v12, Ll/۬᩷ۢ;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 1624
    invoke-direct {v12, v7}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 1527
    invoke-virtual {v12, v4}, Ll/۬᩷ۢ;->ۧ(I)V

    .line 1528
    iget v7, p0, Ll/ۗ᩷ۢ;->ۨ:I

    if-ne v4, v7, :cond_2

    .line 1529
    invoke-virtual {v12}, Landroid/text/SpannableString;->length()I

    move-result v4

    const/4 v7, 0x0

    invoke-virtual {v12, v1, v7, v4, v10}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1531
    :cond_2
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v4, 0x3

    goto :goto_0

    .line 1534
    :cond_3
    invoke-static {}, Ll/ۛ᩷ۢ;->ܶ()Ll/ۨۘܽ;

    move-result-object v4

    invoke-virtual {v4, v3}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v3

    .line 1535
    :cond_4
    invoke-virtual {v3}, Ll/۫ۘܽ;->find()Z

    move-result v4

    if-eqz v4, :cond_9

    const/4 v4, 0x1

    :goto_1
    const/4 v6, 0x3

    if-gt v4, v6, :cond_4

    .line 1537
    iget-object v6, p0, Ll/ۗ᩷ۢ;->ۛ:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ll/۫ۘܽ;->group(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    .line 1538
    invoke-virtual {v3}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    .line 1539
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    const/16 v11, 0xc8

    if-le v7, v11, :cond_5

    .line 1541
    invoke-static {v11, v6}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 1543
    :cond_5
    invoke-virtual {v3, v4}, Ll/۫ۘܽ;->start(I)I

    move-result v7

    add-int/2addr v7, v2

    .line 1544
    invoke-virtual {p1, v7}, Ll/۫ۨᩳ;->ۧ(I)I

    move-result v11

    add-int/lit8 v11, v11, 0x1

    .line 1545
    new-instance v12, Ll/۬᩷ۢ;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 1624
    invoke-direct {v12, v6}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 1546
    invoke-virtual {v12, v7}, Ll/۬᩷ۢ;->ۧ(I)V

    .line 1547
    iget v6, p0, Ll/ۗ᩷ۢ;->ۨ:I

    if-ne v7, v6, :cond_6

    .line 1548
    invoke-virtual {v12}, Landroid/text/SpannableString;->length()I

    move-result v6

    const/4 v7, 0x0

    invoke-virtual {v12, v1, v7, v6, v10}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1550
    :cond_6
    invoke-virtual {v3}, Ll/۫ۘܽ;->group()Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0x2e

    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    invoke-static {v12, v7}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;C)I

    move-result v7

    sub-int/2addr v6, v7

    .line 1551
    invoke-virtual {v3, v4}, Ll/۫ۘܽ;->start(I)I

    move-result v7

    invoke-virtual {v3}, Ll/۫ۘܽ;->start()I

    move-result v11

    sub-int/2addr v7, v11

    sub-int/2addr v7, v6

    .line 1552
    invoke-virtual {v3, v4}, Ll/۫ۘܽ;->end(I)I

    move-result v11

    invoke-virtual {v3}, Ll/۫ۘܽ;->start()I

    move-result v13

    sub-int/2addr v11, v13

    sub-int/2addr v11, v6

    .line 1553
    invoke-virtual {v12}, Landroid/text/SpannableString;->length()I

    move-result v6

    if-gt v11, v6, :cond_7

    .line 1554
    new-instance v6, Landroid/text/style/StyleSpan;

    const/4 v13, 0x1

    invoke-direct {v6, v13}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {v12, v6, v7, v11, v10}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1556
    :cond_7
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    .line 1560
    :cond_9
    invoke-static {v5}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 1561
    invoke-virtual {v0, v5}, Ll/ᩳᩳܿ;->֫(Ljava/util/ArrayList;)V

    .line 1562
    invoke-virtual {p1}, Ll/۫ۨᩳ;->۫֫()I

    move-result p0

    invoke-virtual {v0, p1, p0}, Ll/ᩳᩳܿ;->֫(Ll/۫ۨᩳ;I)V

    return-void

    .line 1565
    :cond_a
    iget-object p1, p0, Ll/ۗ᩷ۢ;->۬:Ljava/lang/String;

    const/4 v0, 0x1

    .line 0
    invoke-static {v0, v0, p1}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1566
    invoke-static {v2}, Ll/ۛ᩷ۢ;->ܿ(Ll/ۛ᩷ۢ;)Ll/۫ۧۢ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/۫ۧۢ;->ۘ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1567
    invoke-static {v2}, Ll/ۛ᩷ۢ;->ܿ(Ll/ۛ᩷ۢ;)Ll/۫ۧۢ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/۫ۧۢ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_b

    .line 229
    invoke-virtual {v2}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object p0

    check-cast p0, Ll/ܿۛ᩷;

    .line 1568
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Class not found: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v1, 0x2f

    const/16 v2, 0x2e

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    .line 516
    invoke-virtual {p0, p1, v0}, Ll/ۗܺ᩷;->֫(Ljava/lang/String;Z)V

    return-void

    :cond_b
    const/4 p1, 0x0

    .line 1572
    iget v1, p0, Ll/ۗ᩷ۢ;->᩶:I

    const/4 v3, 0x1

    if-ne v1, v3, :cond_c

    .line 1573
    new-instance v1, Ll/᩵ۛ᩷;

    const/4 v3, 0x7

    invoke-direct {v1, v3}, Ll/᩵ۛ᩷;-><init>(I)V

    .line 1574
    iput p1, v1, Ll/᩵ۛ᩷;->᩸:I

    .line 1575
    iget-object p1, p0, Ll/ۗ᩷ۢ;->۫:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iput p1, v1, Ll/᩵ۛ᩷;->᩹:I

    .line 1576
    iget-object p1, p0, Ll/ۗ᩷ۢ;->۫:Ljava/lang/String;

    iput-object p1, v1, Ll/᩵ۛ᩷;->۫:Ljava/lang/String;

    .line 1577
    iget-object p0, p0, Ll/ۗ᩷ۢ;->ۤ:Ljava/lang/String;

    iput-object p0, v1, Ll/᩵ۛ᩷;->᩶:Ljava/lang/String;

    goto :goto_2

    :cond_c
    const/4 p1, 0x2

    if-ne v1, p1, :cond_d

    .line 1579
    new-instance v1, Ll/᩵ۛ᩷;

    const/4 p1, 0x3

    invoke-direct {v1, p1}, Ll/᩵ۛ᩷;-><init>(I)V

    const/4 p1, 0x0

    .line 1580
    iput p1, v1, Ll/᩵ۛ᩷;->᩸:I

    .line 1581
    iget-object p1, p0, Ll/ۗ᩷ۢ;->᩺:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    iput p1, v1, Ll/᩵ۛ᩷;->᩹:I

    .line 1582
    iget-object p1, p0, Ll/ۗ᩷ۢ;->᩺:Ljava/lang/String;

    iput-object p1, v1, Ll/᩵ۛ᩷;->۫:Ljava/lang/String;

    .line 1583
    iget-object p1, p0, Ll/ۗ᩷ۢ;->۟:Ljava/lang/String;

    iput-object p1, v1, Ll/᩵ۛ᩷;->᩶:Ljava/lang/String;

    .line 1584
    iget-object p0, p0, Ll/ۗ᩷ۢ;->ܰ:Ljava/lang/String;

    iput-object p0, v1, Ll/᩵ۛ᩷;->ۤ:Ljava/lang/String;

    goto :goto_2

    :cond_d
    const/4 v1, 0x0

    .line 229
    :goto_2
    invoke-virtual {v2}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object p0

    check-cast p0, Ll/ܿۛ᩷;

    .line 1586
    invoke-virtual {p0, v0, v1}, Ll/ܿۛ᩷;->֫(Ljava/lang/String;Ll/᩵ۛ᩷;)V

    .line 1587
    invoke-static {v2}, Ll/ۛ᩷ۢ;->ܿ(Ll/ۛ᩷ۢ;)Ll/۫ۧۢ;

    move-result-object p0

    invoke-virtual {p0, v0}, Ll/۫ۧۢ;->֫(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1607
    iget-object p1, p0, Ll/ۗ᩷ۢ;->ۗ:Ll/ᩳᩳܿ;

    invoke-virtual {p1, p3}, Ll/ᩳᩳܿ;->֫(I)Ljava/lang/CharSequence;

    move-result-object p2

    check-cast p2, Ll/۬᩷ۢ;

    .line 1608
    iget-object p3, p0, Ll/ۗ᩷ۢ;->֫֫:Ll/ۛ᩷ۢ;

    invoke-static {p3}, Ll/ۛ᩷ۢ;->᩻(Ll/ۛ᩷ۢ;)Ll/۫ۨᩳ;

    move-result-object p4

    invoke-virtual {p4}, Ll/۫ۨᩳ;->᩵ܽ()V

    .line 1609
    invoke-static {p3}, Ll/ۛ᩷ۢ;->᩻(Ll/ۛ᩷ۢ;)Ll/۫ۨᩳ;

    move-result-object p4

    invoke-virtual {p2}, Ll/۬᩷ۢ;->֫()I

    move-result p2

    invoke-virtual {p4, p2}, Ll/۫ۨᩳ;->ᩴ(I)V

    .line 1610
    invoke-static {p3}, Ll/ۛ᩷ۢ;->᩻(Ll/ۛ᩷ۢ;)Ll/۫ۨᩳ;

    move-result-object p2

    const/4 p3, 0x0

    .line 1674
    invoke-virtual {p2, p3}, Ll/۫ۨᩳ;->ۧ(Z)V

    .line 1611
    invoke-virtual {p1}, Ll/ᩳᩳܿ;->֫()V

    return-void
.end method

.method public final ֫()V
    .locals 1

    .line 1616
    iget-object v0, p0, Ll/ۗ᩷ۢ;->ۗ:Ll/ᩳᩳܿ;

    invoke-virtual {v0}, Ll/ᩳᩳܿ;->֫()V

    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1298
    iget-object v2, v0, Ll/ۗ᩷ۢ;->֫֫:Ll/ۛ᩷ۢ;

    invoke-static {v2}, Ll/ۛ᩷ۢ;->᩻(Ll/ۛ᩷ۢ;)Ll/۫ۨᩳ;

    move-result-object v3

    invoke-virtual {v3, v1}, Ll/۫ۨᩳ;->֫(Ljava/util/ArrayList;)V

    .line 1299
    invoke-static {v2}, Ll/ۛ᩷ۢ;->᩻(Ll/ۛ᩷ۢ;)Ll/۫ۨᩳ;

    move-result-object v3

    invoke-virtual {v3}, Ll/۫ۨᩳ;->۫֫()I

    move-result v3

    .line 1300
    invoke-static {v2}, Ll/ۛ᩷ۢ;->᩻(Ll/ۛ᩷ۢ;)Ll/۫ۨᩳ;

    move-result-object v4

    invoke-virtual {v4}, Ll/۫ۨᩳ;->۬֫()I

    move-result v4

    if-le v3, v4, :cond_0

    move/from16 v16, v4

    move v4, v3

    move/from16 v3, v16

    .line 1306
    :cond_0
    invoke-static {v2}, Ll/ۛ᩷ۢ;->᩻(Ll/ۛ᩷ۢ;)Ll/۫ۨᩳ;

    move-result-object v5

    invoke-virtual {v5}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v5

    const/4 v6, 0x0

    if-eq v3, v4, :cond_1

    .line 1308
    invoke-interface {v5, v3, v4}, Ll/᩶᩸ᩳ;->ۧ(II)Ljava/lang/String;

    move-result-object v7

    const-string v8, "L[^\\s;()]+;"

    .line 1309
    invoke-virtual {v7, v8}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 1310
    iput v6, v0, Ll/ۗ᩷ۢ;->᩶:I

    .line 1311
    iput-object v7, v0, Ll/ۗ᩷ۢ;->۬:Ljava/lang/String;

    .line 1312
    invoke-direct {v0, v1, v3, v4}, Ll/ۗ᩷ۢ;->֫(Ljava/util/ArrayList;II)V

    return-void

    .line 1316
    :cond_1
    invoke-static {v2}, Ll/ۛ᩷ۢ;->ۢ(Ll/ۛ᩷ۢ;)Ll/ۖۧۢ;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۖۧۢ;->֫()Ljava/lang/Object;

    move-result-object v2

    .line 1318
    instance-of v6, v2, Ll/᩻ۧۢ;

    const/4 v7, 0x1

    if-eqz v6, :cond_5

    .line 1319
    invoke-static {v3, v5}, Ll/᩺ۨᩳ;->ۧ(ILjava/lang/CharSequence;)I

    move-result v6

    .line 1320
    invoke-static {v3, v5}, Ll/᩺ۨᩳ;->֫(ILjava/lang/CharSequence;)I

    move-result v8

    if-ge v8, v4, :cond_2

    goto :goto_1

    .line 1324
    :cond_2
    invoke-interface {v5, v6, v8}, Ll/᩶᩸ᩳ;->ۧ(II)Ljava/lang/String;

    move-result-object v8

    .line 1325
    invoke-static {}, Ll/ۛ᩷ۢ;->۠()Ll/ۨۘܽ;

    move-result-object v9

    invoke-virtual {v9, v8}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v9

    .line 1326
    invoke-virtual {v9}, Ll/۫ۘܽ;->matches()Z

    move-result v10

    const/4 v11, 0x3

    if-eqz v10, :cond_3

    .line 1327
    iput v11, v0, Ll/ۗ᩷ۢ;->᩶:I

    .line 1328
    invoke-virtual {v9, v11}, Ll/۫ۘܽ;->group(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Ll/ۗ᩷ۢ;->ۛ:Ljava/lang/String;

    .line 1329
    invoke-virtual {v9, v11}, Ll/۫ۘܽ;->start(I)I

    move-result v3

    add-int/2addr v3, v6

    iput v3, v0, Ll/ۗ᩷ۢ;->ۨ:I

    .line 1330
    check-cast v2, Ll/᩻ۧۢ;

    iput-object v2, v0, Ll/ۗ᩷ۢ;->ۙ:Ll/᩻ۧۢ;

    .line 1331
    invoke-virtual {v9, v11}, Ll/۫ۘܽ;->start(I)I

    move-result v2

    add-int/2addr v2, v6

    invoke-virtual {v9, v11}, Ll/۫ۘܽ;->end(I)I

    move-result v3

    add-int/2addr v3, v6

    invoke-direct {v0, v1, v2, v3}, Ll/ۗ᩷ۢ;->֫(Ljava/util/ArrayList;II)V

    return-void

    .line 1334
    :cond_3
    invoke-static {}, Ll/ۛ᩷ۢ;->ܶ()Ll/ۨۘܽ;

    move-result-object v9

    invoke-virtual {v9, v8}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v8

    .line 1335
    invoke-virtual {v8}, Ll/۫ۘܽ;->matches()Z

    move-result v9

    if-eqz v9, :cond_5

    const/4 v9, 0x1

    :goto_0
    if-gt v9, v11, :cond_5

    .line 1337
    invoke-virtual {v8, v9}, Ll/۫ۘܽ;->start(I)I

    move-result v10

    add-int/2addr v10, v6

    .line 1338
    invoke-virtual {v8, v9}, Ll/۫ۘܽ;->end(I)I

    move-result v12

    add-int/2addr v12, v6

    if-gt v10, v3, :cond_4

    if-gt v4, v12, :cond_4

    .line 1340
    iput v11, v0, Ll/ۗ᩷ۢ;->᩶:I

    .line 1341
    invoke-virtual {v8, v9}, Ll/۫ۘܽ;->group(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Ll/ۗ᩷ۢ;->ۛ:Ljava/lang/String;

    .line 1342
    iput v10, v0, Ll/ۗ᩷ۢ;->ۨ:I

    .line 1343
    check-cast v2, Ll/᩻ۧۢ;

    iput-object v2, v0, Ll/ۗ᩷ۢ;->ۙ:Ll/᩻ۧۢ;

    .line 1344
    invoke-direct {v0, v1, v10, v12}, Ll/ۗ᩷ۢ;->֫(Ljava/util/ArrayList;II)V

    return-void

    :cond_4
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    const/16 v2, 0x2d

    const/16 v6, 0x3e

    const/4 v8, -0x1

    if-lez v3, :cond_9

    :cond_6
    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_8

    .line 1356
    invoke-interface {v5, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    const-string v10, " \t\n\r,(){}[]:;\"\'"

    .line 1357
    invoke-virtual {v10, v9}, Ljava/lang/String;->indexOf(I)I

    move-result v10

    if-eq v10, v8, :cond_7

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_7
    if-ne v9, v6, :cond_6

    if-lez v3, :cond_6

    add-int/lit8 v9, v3, -0x1

    .line 1362
    invoke-interface {v5, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    if-ne v9, v2, :cond_6

    add-int/lit8 v3, v3, -0x1

    :cond_8
    :goto_2
    if-ne v3, v8, :cond_9

    const/4 v3, 0x0

    .line 1373
    :cond_9
    :goto_3
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v8

    const/16 v9, 0x3a

    const/16 v10, 0x28

    const/16 v11, 0xd

    const/16 v12, 0xa

    const/16 v13, 0x9

    const/16 v14, 0x20

    const/16 v15, 0x3b

    if-ge v4, v8, :cond_c

    .line 1374
    invoke-interface {v5, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    if-ne v8, v15, :cond_a

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_a
    if-eq v8, v14, :cond_c

    if-eq v8, v13, :cond_c

    if-eq v8, v12, :cond_c

    if-eq v8, v11, :cond_c

    if-eq v8, v10, :cond_c

    if-ne v8, v9, :cond_b

    goto :goto_4

    :cond_b
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_c
    :goto_4
    if-ge v3, v4, :cond_1c

    .line 1386
    invoke-interface {v5, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    const/16 v9, 0x46

    if-eq v8, v9, :cond_1b

    const/16 v9, 0x4c

    if-eq v8, v9, :cond_1a

    const/16 v10, 0x53

    if-eq v8, v10, :cond_1b

    const/16 v10, 0x56

    if-eq v8, v10, :cond_1b

    const/16 v10, 0x5a

    if-eq v8, v10, :cond_1b

    const/16 v10, 0x49

    if-eq v8, v10, :cond_1b

    const/16 v10, 0x4a

    if-eq v8, v10, :cond_1b

    packed-switch v8, :pswitch_data_0

    .line 1458
    invoke-interface {v5, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    if-ne v4, v2, :cond_d

    add-int/lit8 v2, v3, 0x1

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-ge v2, v4, :cond_d

    invoke-interface {v5, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    if-ne v2, v6, :cond_d

    add-int/lit8 v2, v3, 0x2

    .line 1460
    iput v2, v0, Ll/ۗ᩷ۢ;->᩹:I

    const/4 v2, 0x1

    goto :goto_5

    .line 1462
    :cond_d
    iput v3, v0, Ll/ۗ᩷ۢ;->᩹:I

    const/4 v2, 0x0

    :goto_5
    const/4 v4, 0x0

    move v4, v3

    const/4 v6, 0x0

    :goto_6
    add-int/lit8 v8, v4, -0x1

    const/4 v15, 0x2

    if-ltz v8, :cond_16

    .line 1466
    invoke-interface {v5, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    if-eqz v2, :cond_13

    if-eq v2, v7, :cond_11

    if-eq v2, v15, :cond_e

    goto :goto_7

    :cond_e
    if-eq v10, v14, :cond_16

    if-eq v10, v13, :cond_16

    if-eq v10, v12, :cond_16

    if-ne v10, v11, :cond_f

    goto :goto_9

    :cond_f
    if-ne v10, v9, :cond_15

    if-lez v8, :cond_10

    add-int/lit8 v4, v4, -0x2

    .line 1493
    invoke-interface {v5, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    const-string v9, " \n\r\t,}"

    .line 1494
    invoke-virtual {v9, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    const/4 v9, -0x1

    if-ne v4, v9, :cond_10

    goto :goto_7

    .line 1497
    :cond_10
    invoke-interface {v5, v8, v6}, Ll/᩶᩸ᩳ;->ۧ(II)Ljava/lang/String;

    move-result-object v10

    goto :goto_a

    :cond_11
    if-eq v10, v14, :cond_15

    if-eq v10, v13, :cond_15

    if-eq v10, v12, :cond_15

    if-ne v10, v11, :cond_12

    goto :goto_7

    :cond_12
    const/16 v2, 0x3b

    if-ne v10, v2, :cond_16

    const/4 v2, 0x2

    const/16 v9, 0x4c

    move v6, v4

    move v4, v8

    goto :goto_6

    :cond_13
    if-eq v10, v14, :cond_15

    if-eq v10, v13, :cond_15

    if-eq v10, v12, :cond_15

    if-ne v10, v11, :cond_14

    goto :goto_7

    :cond_14
    const/16 v2, 0x3e

    if-ne v10, v2, :cond_16

    if-lez v8, :cond_16

    add-int/lit8 v4, v4, -0x2

    .line 1472
    invoke-interface {v5, v4}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v8, 0x2d

    if-ne v2, v8, :cond_16

    const/4 v2, 0x1

    goto :goto_8

    :cond_15
    :goto_7
    move v4, v8

    :goto_8
    const/16 v14, 0x20

    const/16 v9, 0x4c

    goto :goto_6

    :cond_16
    :goto_9
    const/4 v10, 0x0

    :goto_a
    if-eqz v10, :cond_1c

    .line 1410
    new-instance v2, Ll/ۤ᩷ۢ;

    invoke-direct {v2, v5, v3}, Ll/ۤ᩷ۢ;-><init>(Ll/۟᩺ᩳ;I)V

    .line 1412
    :try_start_0
    invoke-virtual {v2}, Ll/ۤ᩷ۢ;->֫()V

    .line 1413
    iget v3, v0, Ll/ۗ᩷ۢ;->᩹:I

    const-string v4, ":( \t\n\r"

    .line 1414
    invoke-virtual {v2, v4}, Ll/ۤ᩷ۢ;->֫(Ljava/lang/String;)V

    .line 1415
    iget v4, v2, Ll/ۤ᩷ۢ;->֫:I

    .line 1416
    invoke-virtual {v2}, Ll/ۤ᩷ۢ;->֫()V

    .line 1678
    iget v6, v2, Ll/ۤ᩷ۢ;->֫:I

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-ge v6, v8, :cond_19

    .line 1679
    iget v6, v2, Ll/ۤ᩷ۢ;->֫:I

    add-int/lit8 v8, v6, 0x1

    iput v8, v2, Ll/ۤ᩷ۢ;->֫:I

    invoke-interface {v5, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v8, " \t\n\r"

    const/16 v9, 0x3a

    if-ne v6, v9, :cond_17

    .line 1419
    :try_start_1
    invoke-virtual {v2}, Ll/ۤ᩷ۢ;->֫()V

    .line 1420
    iget v6, v2, Ll/ۤ᩷ۢ;->֫:I

    .line 1421
    invoke-virtual {v2, v8}, Ll/ۤ᩷ۢ;->֫(Ljava/lang/String;)V

    .line 1422
    iget v2, v2, Ll/ۤ᩷ۢ;->֫:I

    .line 1423
    iput v7, v0, Ll/ۗ᩷ۢ;->᩶:I

    .line 1424
    iput-object v10, v0, Ll/ۗ᩷ۢ;->۬:Ljava/lang/String;

    .line 1425
    invoke-interface {v5, v3, v4}, Ll/᩶᩸ᩳ;->ۧ(II)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Ll/ۗ᩷ۢ;->۫:Ljava/lang/String;

    .line 1426
    invoke-interface {v5, v6, v2}, Ll/᩶᩸ᩳ;->ۧ(II)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Ll/ۗ᩷ۢ;->ۤ:Ljava/lang/String;

    .line 1427
    iget v3, v0, Ll/ۗ᩷ۢ;->᩹:I

    invoke-direct {v0, v1, v3, v2}, Ll/ۗ᩷ۢ;->֫(Ljava/util/ArrayList;II)V

    return-void

    :cond_17
    const/16 v7, 0x28

    if-ne v6, v7, :cond_1c

    .line 1429
    invoke-virtual {v2}, Ll/ۤ᩷ۢ;->֫()V

    .line 1430
    iget v6, v2, Ll/ۤ᩷ۢ;->֫:I

    const-string v7, ") \t\n\r"

    .line 1431
    invoke-virtual {v2, v7}, Ll/ۤ᩷ۢ;->֫(Ljava/lang/String;)V

    .line 1432
    iget v7, v2, Ll/ۤ᩷ۢ;->֫:I

    .line 1433
    invoke-virtual {v2}, Ll/ۤ᩷ۢ;->֫()V

    .line 1651
    iget v9, v2, Ll/ۤ᩷ۢ;->֫:I

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-ge v9, v11, :cond_18

    iget v9, v2, Ll/ۤ᩷ۢ;->֫:I

    add-int/lit8 v11, v9, 0x1

    iput v11, v2, Ll/ۤ᩷ۢ;->֫:I

    invoke-interface {v5, v9}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v9

    const/16 v11, 0x29

    if-ne v9, v11, :cond_18

    .line 1435
    invoke-virtual {v2}, Ll/ۤ᩷ۢ;->֫()V

    .line 1436
    iget v9, v2, Ll/ۤ᩷ۢ;->֫:I

    .line 1437
    invoke-virtual {v2, v8}, Ll/ۤ᩷ۢ;->֫(Ljava/lang/String;)V

    .line 1438
    iget v2, v2, Ll/ۤ᩷ۢ;->֫:I

    .line 1439
    iput v15, v0, Ll/ۗ᩷ۢ;->᩶:I

    .line 1440
    iput-object v10, v0, Ll/ۗ᩷ۢ;->۬:Ljava/lang/String;

    .line 1441
    invoke-interface {v5, v3, v4}, Ll/᩶᩸ᩳ;->ۧ(II)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Ll/ۗ᩷ۢ;->᩺:Ljava/lang/String;

    .line 1442
    invoke-interface {v5, v6, v7}, Ll/᩶᩸ᩳ;->ۧ(II)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Ll/ۗ᩷ۢ;->ܰ:Ljava/lang/String;

    .line 1443
    invoke-interface {v5, v9, v2}, Ll/᩶᩸ᩳ;->ۧ(II)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Ll/ۗ᩷ۢ;->۟:Ljava/lang/String;

    .line 1444
    iget v3, v0, Ll/ۗ᩷ۢ;->᩹:I

    invoke-direct {v0, v1, v3, v2}, Ll/ۗ᩷ۢ;->֫(Ljava/util/ArrayList;II)V

    return-void

    .line 1653
    :cond_18
    new-instance v1, Ljava/io/EOFException;

    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    throw v1

    .line 1681
    :cond_19
    new-instance v1, Ljava/io/EOFException;

    invoke-direct {v1}, Ljava/io/EOFException;-><init>()V

    throw v1
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0

    .line 1400
    :cond_1a
    invoke-interface {v5, v3, v4}, Ll/᩶᩸ᩳ;->ۧ(II)Ljava/lang/String;

    move-result-object v2

    const-string v5, "L[^\\s;]+;"

    .line 1401
    invoke-virtual {v2, v5}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1c

    const/4 v5, 0x0

    .line 1402
    iput v5, v0, Ll/ۗ᩷ۢ;->᩶:I

    .line 1403
    iput-object v2, v0, Ll/ۗ᩷ۢ;->۬:Ljava/lang/String;

    .line 1404
    invoke-direct {v0, v1, v3, v4}, Ll/ۗ᩷ۢ;->֫(Ljava/util/ArrayList;II)V

    return-void

    :cond_1b
    :pswitch_0
    add-int/lit8 v3, v3, 0x1

    const/16 v2, 0x2d

    const/16 v14, 0x20

    const/16 v6, 0x3e

    goto/16 :goto_4

    :catch_0
    :cond_1c
    return-void

    :pswitch_data_0
    .packed-switch 0x42
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
