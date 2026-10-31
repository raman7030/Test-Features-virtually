.class public final Ll/ۢᩳܺ;
.super Ljava/lang/Object;
.source "5BHG"


# instance fields
.field public final ֫:Ll/ۜᩳܺ;

.field public final ۧ:Ljava/util/ArrayList;

.field public final synthetic ܳ:Ll/ۡᩳܺ;

.field public final ܽ:Ljava/util/HashMap;

.field public ܿ:I

.field public ᩳ:I

.field public final ᩻:Ljava/util/BitSet;


# direct methods
.method public constructor <init>(Ll/ۡᩳܺ;Ll/ۜᩳܺ;Ljava/util/ArrayList;)V
    .locals 1

    .line 1553
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢᩳܺ;->ܳ:Ll/ۡᩳܺ;

    .line 1554
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۢᩳܺ;->ܽ:Ljava/util/HashMap;

    .line 1556
    new-instance v0, Ljava/util/BitSet;

    invoke-static {p1}, Ll/ۡᩳܺ;->ۧ(Ll/ۡᩳܺ;)I

    move-result p1

    invoke-direct {v0, p1}, Ljava/util/BitSet;-><init>(I)V

    iput-object v0, p0, Ll/ۢᩳܺ;->᩻:Ljava/util/BitSet;

    .line 1558
    iput-object p2, p0, Ll/ۢᩳܺ;->֫:Ll/ۜᩳܺ;

    .line 1559
    iput-object p3, p0, Ll/ۢᩳܺ;->ۧ:Ljava/util/ArrayList;

    return-void
.end method

.method private ֫(I)I
    .locals 5

    .line 1710
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Ll/ۢᩳܺ;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    .line 1713
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    .line 1714
    :cond_0
    iget v0, p0, Ll/ۢᩳܺ;->ᩳ:I

    .line 1692
    iget-object v2, p0, Ll/ۢᩳܺ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ᩴܺ;

    if-eqz v3, :cond_2

    .line 1693
    invoke-virtual {v3}, Ll/᩷ᩴܺ;->size()I

    move-result v4

    if-lez v4, :cond_2

    .line 1694
    invoke-virtual {v3}, Ll/᩷ᩴܺ;->ܶ()I

    move-result v3

    if-ne v3, v0, :cond_2

    .line 1721
    iget-object v0, p0, Ll/ۢᩳܺ;->֫:Ll/ۜᩳܺ;

    invoke-virtual {v0}, Ll/ۜᩳܺ;->֫()I

    move-result v0

    .line 1722
    iget-object v3, p0, Ll/ۢᩳܺ;->᩻:Ljava/util/BitSet;

    invoke-virtual {v3, p1}, Ljava/util/BitSet;->set(I)V

    .line 1723
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1726
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gt v1, v0, :cond_1

    const/4 v1, 0x0

    .line 1727
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1730
    :cond_1
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩷ᩴܺ;

    .line 1729
    invoke-virtual {v2, v0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return v0

    :cond_2
    return p1
.end method


# virtual methods
.method public final ֫(Ll/ܽۡܺ;)V
    .locals 18

    move-object/from16 v0, p0

    .line 1573
    invoke-virtual/range {p1 .. p1}, Ll/ܽۡܺ;->ۜ()Ll/᩷ᩴܺ;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ll/᩷ᩴܺ;->get(I)I

    move-result v1

    iput v1, v0, Ll/ۢᩳܺ;->ܿ:I

    .line 1574
    invoke-virtual/range {p1 .. p1}, Ll/ܽۡܺ;->ۜ()Ll/᩷ᩴܺ;

    move-result-object v1

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Ll/᩷ᩴܺ;->get(I)I

    move-result v1

    iput v1, v0, Ll/ۢᩳܺ;->ᩳ:I

    .line 1580
    invoke-direct {v0, v1}, Ll/ۢᩳܺ;->֫(I)I

    move-result v1

    .line 1582
    iget-object v4, v0, Ll/ۢᩳܺ;->᩻:Ljava/util/BitSet;

    invoke-virtual {v4, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v5

    :goto_0
    iget-object v6, v0, Ll/ۢᩳܺ;->ۧ:Ljava/util/ArrayList;

    iget-object v7, v0, Ll/ۢᩳܺ;->ܳ:Ll/ۡᩳܺ;

    if-ltz v5, :cond_b

    .line 1584
    invoke-virtual {v4, v5}, Ljava/util/BitSet;->clear(I)V

    .line 1585
    iget-object v8, v0, Ll/ۢᩳܺ;->ܽ:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 1615
    invoke-static {v7, v5}, Ll/ۡᩳܺ;->֫(Ll/ۡᩳܺ;I)Ll/ܽۡܺ;

    move-result-object v9

    .line 1617
    invoke-virtual {v9}, Ll/ܽۡܺ;->ۜ()Ll/᩷ᩴܺ;

    move-result-object v10

    .line 1622
    invoke-static {v7, v9}, Ll/ۡᩳܺ;->֫(Ll/ۡᩳܺ;Ll/ܽۡܺ;)Z

    move-result v11

    const/4 v12, -0x1

    if-eqz v11, :cond_0

    .line 1633
    invoke-virtual {v10, v2}, Ll/᩷ᩴܺ;->get(I)I

    move-result v2

    invoke-direct {v0, v2}, Ll/ۢᩳܺ;->֫(I)I

    move-result v2

    .line 1634
    invoke-virtual {v10, v3}, Ll/᩷ᩴܺ;->get(I)I

    move-result v3

    .line 70
    new-instance v10, Ll/᩷ᩴܺ;

    const/4 v11, 0x2

    invoke-direct {v10, v11}, Ll/᩷ᩴܺ;-><init>(I)V

    .line 72
    invoke-virtual {v10, v2}, Ll/᩷ᩴܺ;->add(I)V

    .line 73
    invoke-virtual {v10, v3}, Ll/᩷ᩴܺ;->add(I)V

    .line 74
    invoke-virtual {v10}, Ll/ᩴᩴܺ;->ܺ()V

    goto :goto_2

    .line 1637
    :cond_0
    invoke-static {v7, v5}, Ll/ۡᩳܺ;->ۧ(Ll/ۡᩳܺ;I)Ll/᩷ᩳܺ;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 1644
    invoke-static {v2}, Ll/᩷ᩳܺ;->ۧ(Ll/᩷ᩳܺ;)I

    move-result v3

    iget v10, v0, Ll/ۢᩳܺ;->ᩳ:I

    if-ne v3, v10, :cond_1

    .line 1651
    iget v2, v0, Ll/ۢᩳܺ;->ܿ:I

    invoke-static {v2}, Ll/᩷ᩴܺ;->ܿ(I)Ll/᩷ᩴܺ;

    move-result-object v10

    .line 1652
    iget v12, v0, Ll/ۢᩳܺ;->ܿ:I

    goto :goto_2

    .line 1645
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ret instruction returns to label "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Ll/᩷ᩳܺ;->ۧ(Ll/᩷ᩳܺ;)I

    move-result v2

    .line 1647
    invoke-static {v2}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " expected: "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v0, Ll/ۢᩳܺ;->ᩳ:I

    .line 1648
    invoke-static {v2}, Ll/ܳᩴܺ;->ܽ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 1656
    :cond_2
    invoke-virtual {v9}, Ll/ܽۡܺ;->ܳ()I

    move-result v2

    .line 1657
    invoke-virtual {v10}, Ll/᩷ᩴܺ;->size()I

    move-result v3

    .line 1659
    new-instance v11, Ll/᩷ᩴܺ;

    invoke-direct {v11, v3}, Ll/᩷ᩴܺ;-><init>(I)V

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v3, :cond_4

    .line 1662
    invoke-virtual {v10, v13}, Ll/᩷ᩴܺ;->get(I)I

    move-result v14

    .line 1663
    invoke-direct {v0, v14}, Ll/ۢᩳܺ;->֫(I)I

    move-result v15

    .line 1665
    invoke-virtual {v11, v15}, Ll/᩷ᩴܺ;->add(I)V

    if-ne v2, v14, :cond_3

    move v12, v15

    :cond_3
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    .line 1672
    :cond_4
    invoke-virtual {v11}, Ll/ᩴᩴܺ;->ܺ()V

    move-object v10, v11

    .line 1675
    :goto_2
    new-instance v2, Ll/ܽۡܺ;

    .line 1677
    invoke-virtual {v9}, Ll/ܽۡܺ;->ᩳ()Ll/ۖۡܺ;

    move-result-object v3

    .line 1774
    invoke-virtual {v3}, Ll/ܿᩴܺ;->size()I

    move-result v9

    const/4 v11, 0x0

    const/4 v13, 0x0

    :goto_3
    if-ge v11, v9, :cond_6

    .line 1776
    invoke-virtual {v3, v11}, Ll/ܿᩴܺ;->get(I)Ll/ܺۡܺ;

    move-result-object v14

    invoke-virtual {v14}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v14

    sget-object v15, Ll/۫ۡܺ;->᩵ܽ:Ll/ۗۡܺ;

    if-eq v14, v15, :cond_5

    add-int/lit8 v13, v13, 0x1

    :cond_5
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_6
    if-ne v13, v9, :cond_7

    goto :goto_5

    .line 1786
    :cond_7
    new-instance v11, Ll/ۖۡܺ;

    .line 32
    invoke-direct {v11, v13}, Ll/ܿᩴܺ;-><init>(I)V

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_4
    if-ge v13, v9, :cond_9

    .line 1790
    invoke-virtual {v3, v13}, Ll/ܿᩴܺ;->get(I)Ll/ܺۡܺ;

    move-result-object v15

    move-object/from16 v16, v3

    .line 1791
    invoke-virtual {v15}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v3

    move/from16 v17, v9

    sget-object v9, Ll/۫ۡܺ;->᩵ܽ:Ll/ۗۡܺ;

    if-eq v3, v9, :cond_8

    add-int/lit8 v3, v14, 0x1

    .line 1792
    invoke-virtual {v11, v14, v15}, Ll/ܿᩴܺ;->֫(ILl/ܺۡܺ;)V

    move v14, v3

    :cond_8
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v3, v16

    move/from16 v9, v17

    goto :goto_4

    .line 1796
    :cond_9
    invoke-virtual {v11}, Ll/ᩴᩴܺ;->ܺ()V

    move-object v3, v11

    .line 1677
    :goto_5
    invoke-direct {v2, v8, v3, v10, v12}, Ll/ܽۡܺ;-><init>(ILl/ۖۡܺ;Ll/᩷ᩴܺ;I)V

    .line 1679
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩷ᩴܺ;

    .line 1675
    invoke-static {v7, v2, v3}, Ll/ۡᩳܺ;->֫(Ll/ۡᩳܺ;Ll/ܽۡܺ;Ll/᩷ᩴܺ;)V

    .line 1589
    invoke-static {v7, v5}, Ll/ۡᩳܺ;->֫(Ll/ۡᩳܺ;I)Ll/ܽۡܺ;

    move-result-object v2

    invoke-static {v7, v2}, Ll/ۡᩳܺ;->֫(Ll/ۡᩳܺ;Ll/ܽۡܺ;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 1590
    new-instance v2, Ll/ۢᩳܺ;

    iget-object v3, v0, Ll/ۢᩳܺ;->֫:Ll/ۜᩳܺ;

    invoke-direct {v2, v7, v3, v6}, Ll/ۢᩳܺ;-><init>(Ll/ۡᩳܺ;Ll/ۜᩳܺ;Ljava/util/ArrayList;)V

    .line 1591
    invoke-static {v7, v8}, Ll/ۡᩳܺ;->֫(Ll/ۡᩳܺ;I)Ll/ܽۡܺ;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/ۢᩳܺ;->֫(Ll/ܽۡܺ;)V

    :cond_a
    const/4 v2, 0x0

    .line 1583
    invoke-virtual {v4, v2}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v5

    const/4 v3, 0x1

    goto/16 :goto_0

    .line 1600
    :cond_b
    new-instance v2, Ll/ܽۡܺ;

    .line 1601
    invoke-virtual/range {p1 .. p1}, Ll/ܽۡܺ;->֫()I

    move-result v3

    invoke-virtual/range {p1 .. p1}, Ll/ܽۡܺ;->ᩳ()Ll/ۖۡܺ;

    move-result-object v4

    .line 1602
    invoke-static {v1}, Ll/᩷ᩴܺ;->ܿ(I)Ll/᩷ᩴܺ;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5, v1}, Ll/ܽۡܺ;-><init>(ILl/ۖۡܺ;Ll/᩷ᩴܺ;I)V

    .line 1604
    invoke-virtual/range {p1 .. p1}, Ll/ܽۡܺ;->֫()I

    move-result v1

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷ᩴܺ;

    .line 1600
    invoke-static {v7, v2, v1}, Ll/ۡᩳܺ;->ۧ(Ll/ۡᩳܺ;Ll/ܽۡܺ;Ll/᩷ᩴܺ;)V

    return-void
.end method
