.class public final Ll/ᩳ᩸;
.super Ljava/lang/Object;
.source "Z1JV"

# interfaces
.implements Ll/ܰ۠;


# instance fields
.field public ֫:Ll/ܿ᩸;

.field public final synthetic ۜ:Ll/ܿ᩸;

.field public ۧ:I

.field public ܳ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/ܿ᩸;Ll/ܿ᩸;)V
    .locals 0

    .line 618
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳ᩸;->ۜ:Ll/ܿ᩸;

    .line 619
    iput-object p2, p0, Ll/ᩳ᩸;->֫:Ll/ܿ᩸;

    return-void
.end method

.method public static ֫(III)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    .line 889
    :cond_0
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    .line 890
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 891
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p0

    .line 892
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/high16 v1, 0x40000000    # 2.0f

    if-ne p0, v1, :cond_2

    const/high16 p0, -0x80000000

    if-eq v0, p0, :cond_1

    if-nez v0, :cond_2

    :cond_1
    if-ne p2, p1, :cond_2

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final ֫()V
    .locals 6

    .line 903
    iget-object v0, p0, Ll/ᩳ᩸;->֫:Ll/ܿ᩸;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    .line 905
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 906
    instance-of v5, v4, Ll/۠᩸;

    if-eqz v5, :cond_0

    .line 907
    check-cast v4, Ll/۠᩸;

    invoke-virtual {v4}, Ll/۠᩸;->ۧ()V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 911
    :cond_1
    invoke-static {v0}, Ll/ܿ᩸;->ۧ(Ll/ܿ᩸;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_2

    :goto_1
    if-ge v2, v1, :cond_2

    .line 914
    invoke-static {v0}, Ll/ܿ᩸;->ۧ(Ll/ܿ᩸;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟ܶ;

    .line 915
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final ֫(Ll/ܶ۠;Ll/᩺۠;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    if-nez v1, :cond_0

    goto/16 :goto_10

    .line 626
    :cond_0
    iget-object v3, v1, Ll/ܶ۠;->ᩴ֫:Ll/ۚ۠;

    iget-object v4, v1, Ll/ܶ۠;->۫:Ll/ۚ۠;

    .line 629
    invoke-virtual/range {p1 .. p1}, Ll/ܶ۠;->۠()I

    move-result v5

    const/16 v6, 0x8

    const/4 v7, 0x0

    if-ne v5, v6, :cond_1

    invoke-virtual/range {p1 .. p1}, Ll/ܶ۠;->ۗ()Z

    move-result v5

    if-nez v5, :cond_1

    .line 630
    iput v7, v2, Ll/᩺۠;->ۜ:I

    .line 631
    iput v7, v2, Ll/᩺۠;->ܳ:I

    .line 632
    iput v7, v2, Ll/᩺۠;->ᩳ:I

    return-void

    .line 620
    :cond_1
    iget-object v5, v1, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    if-nez v5, :cond_2

    goto/16 :goto_10

    .line 646
    :cond_2
    iget-object v5, v2, Ll/᩺۠;->֫:Ll/۠۠;

    .line 647
    iget-object v6, v2, Ll/᩺۠;->᩷:Ll/۠۠;

    .line 649
    iget v7, v2, Ll/᩺۠;->ۧ:I

    .line 650
    iget v8, v2, Ll/᩺۠;->ۢ:I

    .line 655
    iget v9, v0, Ll/ᩳ᩸;->ܳ:I

    iget v10, v0, Ll/ᩳ᩸;->ᩳ:I

    add-int/2addr v9, v10

    .line 656
    iget v10, v0, Ll/ᩳ᩸;->᩻:I

    .line 658
    invoke-virtual/range {p1 .. p1}, Ll/ܶ۠;->ܿ()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/view/View;

    .line 660
    sget-object v12, Ll/֫᩸;->֫:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    aget v13, v12, v13

    const/4 v14, 0x2

    const/4 v15, 0x1

    if-eq v13, v15, :cond_d

    if-eq v13, v14, :cond_c

    const/4 v7, 0x3

    if-eq v13, v7, :cond_9

    const/4 v7, 0x4

    if-eq v13, v7, :cond_3

    const/4 v7, 0x0

    goto :goto_3

    .line 676
    :cond_3
    iget v7, v0, Ll/ᩳ᩸;->ܽ:I

    const/4 v13, -0x2

    invoke-static {v7, v10, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v7

    .line 677
    iget v10, v1, Ll/ܶ۠;->ܰ:I

    if-ne v10, v15, :cond_4

    const/4 v10, 0x1

    goto :goto_0

    :cond_4
    const/4 v10, 0x0

    .line 678
    :goto_0
    iget v13, v2, Ll/᩺۠;->ܽ:I

    if-eq v13, v15, :cond_5

    if-ne v13, v14, :cond_e

    .line 684
    :cond_5
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    move-result v13

    invoke-virtual/range {p1 .. p1}, Ll/ܶ۠;->ۜ()I

    move-result v15

    if-ne v13, v15, :cond_6

    const/4 v13, 0x1

    goto :goto_1

    :cond_6
    const/4 v13, 0x0

    .line 685
    :goto_1
    iget v15, v2, Ll/᩺۠;->ܽ:I

    if-eq v15, v14, :cond_8

    if-eqz v10, :cond_8

    if-eqz v10, :cond_7

    if-nez v13, :cond_8

    :cond_7
    instance-of v10, v11, Ll/۠᩸;

    if-nez v10, :cond_8

    .line 689
    invoke-virtual/range {p1 .. p1}, Ll/ܶ۠;->ۛ()Z

    move-result v10

    if-eqz v10, :cond_e

    .line 691
    :cond_8
    invoke-virtual/range {p1 .. p1}, Ll/ܶ۠;->ܶ()I

    move-result v7

    const/high16 v10, 0x40000000    # 2.0f

    invoke-static {v7, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    goto :goto_3

    .line 671
    :cond_9
    iget v7, v0, Ll/ᩳ᩸;->ܽ:I

    if-eqz v4, :cond_a

    .line 981
    iget v13, v4, Ll/ۚ۠;->ܿ:I

    goto :goto_2

    :cond_a
    const/4 v13, 0x0

    :goto_2
    if-eqz v3, :cond_b

    .line 984
    iget v15, v3, Ll/ۚ۠;->ܿ:I

    add-int/2addr v13, v15

    :cond_b
    add-int/2addr v10, v13

    const/4 v13, -0x1

    .line 671
    invoke-static {v7, v10, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v7

    goto :goto_3

    .line 666
    :cond_c
    iget v7, v0, Ll/ᩳ᩸;->ܽ:I

    const/4 v13, -0x2

    invoke-static {v7, v10, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v7

    goto :goto_3

    :cond_d
    const/high16 v10, 0x40000000    # 2.0f

    .line 662
    invoke-static {v7, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    .line 698
    :cond_e
    :goto_3
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v10, v12, v10

    const/4 v12, 0x1

    if-eq v10, v12, :cond_19

    if-eq v10, v14, :cond_18

    const/4 v8, 0x3

    if-eq v10, v8, :cond_15

    const/4 v3, 0x4

    if-eq v10, v3, :cond_f

    const/4 v3, 0x0

    goto/16 :goto_7

    .line 715
    :cond_f
    iget v3, v0, Ll/ᩳ᩸;->ۧ:I

    const/4 v4, -0x2

    invoke-static {v3, v9, v4}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v3

    .line 717
    iget v4, v1, Ll/ܶ۠;->᩺:I

    if-ne v4, v12, :cond_10

    const/4 v4, 0x1

    goto :goto_4

    :cond_10
    const/4 v4, 0x0

    .line 718
    :goto_4
    iget v8, v2, Ll/᩺۠;->ܽ:I

    if-eq v8, v12, :cond_11

    if-ne v8, v14, :cond_1a

    .line 724
    :cond_11
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    invoke-virtual/range {p1 .. p1}, Ll/ܶ۠;->ܶ()I

    move-result v9

    if-ne v8, v9, :cond_12

    const/4 v8, 0x1

    goto :goto_5

    :cond_12
    const/4 v8, 0x0

    .line 725
    :goto_5
    iget v9, v2, Ll/᩺۠;->ܽ:I

    if-eq v9, v14, :cond_14

    if-eqz v4, :cond_14

    if-eqz v4, :cond_13

    if-nez v8, :cond_14

    :cond_13
    instance-of v4, v11, Ll/۠᩸;

    if-nez v4, :cond_14

    .line 729
    invoke-virtual/range {p1 .. p1}, Ll/ܶ۠;->ۨ()Z

    move-result v4

    if-eqz v4, :cond_1a

    .line 731
    :cond_14
    invoke-virtual/range {p1 .. p1}, Ll/ܶ۠;->ۜ()I

    move-result v3

    const/high16 v4, 0x40000000    # 2.0f

    invoke-static {v3, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    goto :goto_7

    .line 710
    :cond_15
    iget v8, v0, Ll/ᩳ᩸;->ۧ:I

    if-eqz v4, :cond_16

    .line 995
    iget-object v4, v1, Ll/ܶ۠;->᩵֫:Ll/ۚ۠;

    iget v4, v4, Ll/ۚ۠;->ܿ:I

    goto :goto_6

    :cond_16
    const/4 v4, 0x0

    :goto_6
    if-eqz v3, :cond_17

    .line 998
    iget-object v3, v1, Ll/ܶ۠;->ۢ:Ll/ۚ۠;

    iget v3, v3, Ll/ۚ۠;->ܿ:I

    add-int/2addr v4, v3

    :cond_17
    add-int/2addr v9, v4

    const/4 v3, -0x1

    .line 710
    invoke-static {v8, v9, v3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v3

    goto :goto_7

    .line 704
    :cond_18
    iget v3, v0, Ll/ᩳ᩸;->ۧ:I

    const/4 v4, -0x2

    invoke-static {v3, v9, v4}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v3

    goto :goto_7

    :cond_19
    const/high16 v3, 0x40000000    # 2.0f

    .line 700
    invoke-static {v8, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 620
    :cond_1a
    :goto_7
    iget-object v4, v1, Ll/ܶ۠;->ۡ֫:Ll/ܶ۠;

    .line 738
    check-cast v4, Ll/᩸۠;

    .line 739
    iget-object v8, v0, Ll/ᩳ᩸;->ۜ:Ll/ܿ᩸;

    if-eqz v4, :cond_1b

    invoke-static {v8}, Ll/ܿ᩸;->֫(Ll/ܿ᩸;)I

    move-result v9

    const/16 v10, 0x100

    invoke-static {v9, v10}, Ll/۫۠;->֫(II)Z

    move-result v9

    if-eqz v9, :cond_1b

    .line 740
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Ll/ܶ۠;->ܶ()I

    move-result v10

    if-ne v9, v10, :cond_1b

    .line 743
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    invoke-virtual {v4}, Ll/ܶ۠;->ܶ()I

    move-result v10

    if-ge v9, v10, :cond_1b

    .line 744
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Ll/ܶ۠;->ۜ()I

    move-result v10

    if-ne v9, v10, :cond_1b

    .line 745
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    invoke-virtual {v4}, Ll/ܶ۠;->ۜ()I

    move-result v4

    if-ge v9, v4, :cond_1b

    .line 746
    invoke-virtual {v11}, Landroid/view/View;->getBaseline()I

    move-result v4

    invoke-virtual/range {p1 .. p1}, Ll/ܶ۠;->ܽ()I

    move-result v9

    if-ne v4, v9, :cond_1b

    .line 747
    invoke-virtual/range {p1 .. p1}, Ll/ܶ۠;->ۤ()Z

    move-result v4

    if-nez v4, :cond_1b

    .line 749
    invoke-virtual/range {p1 .. p1}, Ll/ܶ۠;->ۡ()I

    move-result v4

    invoke-virtual/range {p1 .. p1}, Ll/ܶ۠;->ܶ()I

    move-result v9

    invoke-static {v4, v7, v9}, Ll/ᩳ᩸;->֫(III)Z

    move-result v4

    if-eqz v4, :cond_1b

    .line 750
    invoke-virtual/range {p1 .. p1}, Ll/ܶ۠;->ܺ()I

    move-result v4

    invoke-virtual/range {p1 .. p1}, Ll/ܶ۠;->ۜ()I

    move-result v9

    invoke-static {v4, v3, v9}, Ll/ᩳ᩸;->֫(III)Z

    move-result v4

    if-eqz v4, :cond_1b

    .line 752
    invoke-virtual/range {p1 .. p1}, Ll/ܶ۠;->ܶ()I

    move-result v3

    iput v3, v2, Ll/᩺۠;->ۜ:I

    .line 753
    invoke-virtual/range {p1 .. p1}, Ll/ܶ۠;->ۜ()I

    move-result v3

    iput v3, v2, Ll/᩺۠;->ܳ:I

    .line 754
    invoke-virtual/range {p1 .. p1}, Ll/ܶ۠;->ܽ()I

    move-result v1

    iput v1, v2, Ll/᩺۠;->ᩳ:I

    return-void

    .line 764
    :cond_1b
    sget-object v4, Ll/۠۠;->᩶:Ll/۠۠;

    if-ne v5, v4, :cond_1c

    const/4 v9, 0x1

    goto :goto_8

    :cond_1c
    const/4 v9, 0x0

    :goto_8
    if-ne v6, v4, :cond_1d

    const/4 v4, 0x1

    goto :goto_9

    :cond_1d
    const/4 v4, 0x0

    .line 767
    :goto_9
    sget-object v10, Ll/۠۠;->ۙ:Ll/۠۠;

    if-eq v6, v10, :cond_1f

    sget-object v12, Ll/۠۠;->᩹:Ll/۠۠;

    if-ne v6, v12, :cond_1e

    goto :goto_a

    :cond_1e
    const/4 v6, 0x0

    goto :goto_b

    :cond_1f
    :goto_a
    const/4 v6, 0x1

    :goto_b
    if-eq v5, v10, :cond_21

    .line 769
    sget-object v10, Ll/۠۠;->᩹:Ll/۠۠;

    if-ne v5, v10, :cond_20

    goto :goto_c

    :cond_20
    const/4 v5, 0x0

    goto :goto_d

    :cond_21
    :goto_c
    const/4 v5, 0x1

    :goto_d
    const/4 v10, 0x0

    if-eqz v9, :cond_22

    .line 771
    iget v12, v1, Ll/ܶ۠;->֡:F

    cmpl-float v12, v12, v10

    if-lez v12, :cond_22

    const/4 v12, 0x1

    goto :goto_e

    :cond_22
    const/4 v12, 0x0

    :goto_e
    if-eqz v4, :cond_23

    .line 772
    iget v13, v1, Ll/ܶ۠;->֡:F

    cmpl-float v10, v13, v10

    if-lez v10, :cond_23

    const/4 v10, 0x1

    goto :goto_f

    :cond_23
    const/4 v10, 0x0

    :goto_f
    if-nez v11, :cond_24

    :goto_10
    return-void

    .line 777
    :cond_24
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v13

    check-cast v13, Ll/ܽ᩸;

    .line 783
    iget v15, v2, Ll/᩺۠;->ܽ:I

    const/4 v0, 0x1

    if-eq v15, v0, :cond_26

    if-eq v15, v14, :cond_26

    if-eqz v9, :cond_26

    iget v0, v1, Ll/ܶ۠;->ܰ:I

    if-nez v0, :cond_26

    if-eqz v4, :cond_26

    iget v0, v1, Ll/ܶ۠;->᩺:I

    if-eqz v0, :cond_25

    goto :goto_11

    :cond_25
    const/4 v0, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    goto/16 :goto_19

    .line 788
    :cond_26
    :goto_11
    instance-of v0, v11, Ll/ۗ᩸;

    if-eqz v0, :cond_27

    instance-of v0, v1, Ll/ۤ۠;

    if-eqz v0, :cond_27

    .line 789
    move-object v0, v1

    check-cast v0, Ll/ۤ۠;

    .line 790
    move-object v4, v11

    check-cast v4, Ll/ۗ᩸;

    invoke-virtual {v4, v0, v7, v3}, Ll/ۗ᩸;->֫(Ll/ۤ۠;II)V

    goto :goto_12

    .line 792
    :cond_27
    invoke-virtual {v11, v7, v3}, Landroid/view/View;->measure(II)V

    .line 794
    :goto_12
    invoke-virtual {v1, v7, v3}, Ll/ܶ۠;->ܽ(II)V

    .line 796
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    .line 797
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    .line 798
    invoke-virtual {v11}, Landroid/view/View;->getBaseline()I

    move-result v9

    .line 808
    iget v14, v1, Ll/ܶ۠;->ܽ֫:I

    if-lez v14, :cond_28

    .line 809
    invoke-static {v14, v0}, Ljava/lang/Math;->max(II)I

    move-result v14

    goto :goto_13

    :cond_28
    move v14, v0

    .line 811
    :goto_13
    iget v15, v1, Ll/ܶ۠;->֫֫:I

    if-lez v15, :cond_29

    .line 812
    invoke-static {v15, v14}, Ljava/lang/Math;->min(II)I

    move-result v14

    .line 814
    :cond_29
    iget v15, v1, Ll/ܶ۠;->ۧ֫:I

    if-lez v15, :cond_2a

    .line 815
    invoke-static {v15, v4}, Ljava/lang/Math;->max(II)I

    move-result v15

    goto :goto_14

    :cond_2a
    move v15, v4

    :goto_14
    move/from16 v16, v3

    .line 817
    iget v3, v1, Ll/ܶ۠;->۟:I

    if-lez v3, :cond_2b

    .line 818
    invoke-static {v3, v15}, Ljava/lang/Math;->min(II)I

    move-result v15

    .line 821
    :cond_2b
    invoke-static {v8}, Ll/ܿ᩸;->֫(Ll/ܿ᩸;)I

    move-result v3

    const/4 v8, 0x1

    invoke-static {v3, v8}, Ll/۫۠;->֫(II)Z

    move-result v3

    if-nez v3, :cond_2d

    const/high16 v3, 0x3f000000    # 0.5f

    if-eqz v12, :cond_2c

    if-eqz v6, :cond_2c

    .line 824
    iget v5, v1, Ll/ܶ۠;->֡:F

    int-to-float v6, v15

    mul-float v6, v6, v5

    add-float/2addr v6, v3

    float-to-int v14, v6

    goto :goto_15

    :cond_2c
    if-eqz v10, :cond_2d

    if-eqz v5, :cond_2d

    .line 827
    iget v5, v1, Ll/ܶ۠;->֡:F

    int-to-float v6, v14

    div-float/2addr v6, v5

    add-float/2addr v6, v3

    float-to-int v15, v6

    :cond_2d
    :goto_15
    if-ne v0, v14, :cond_2f

    if-eq v4, v15, :cond_2e

    goto :goto_16

    :cond_2e
    move v3, v9

    move v4, v14

    move v5, v15

    goto :goto_18

    :cond_2f
    :goto_16
    const/high16 v3, 0x40000000    # 2.0f

    if-eq v0, v14, :cond_30

    .line 834
    invoke-static {v14, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    :cond_30
    if-eq v4, v15, :cond_31

    .line 837
    invoke-static {v15, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    goto :goto_17

    :cond_31
    move/from16 v3, v16

    .line 839
    :goto_17
    invoke-virtual {v11, v7, v3}, Landroid/view/View;->measure(II)V

    .line 840
    invoke-virtual {v1, v7, v3}, Ll/ܶ۠;->ܽ(II)V

    .line 841
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    .line 842
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    .line 843
    invoke-virtual {v11}, Landroid/view/View;->getBaseline()I

    move-result v4

    move v5, v3

    move v3, v4

    move v4, v0

    :goto_18
    const/4 v0, -0x1

    :goto_19
    if-eq v3, v0, :cond_32

    const/4 v0, 0x1

    goto :goto_1a

    :cond_32
    const/4 v0, 0x0

    .line 854
    :goto_1a
    iget v6, v2, Ll/᩺۠;->ۧ:I

    if-ne v4, v6, :cond_34

    iget v6, v2, Ll/᩺۠;->ۢ:I

    if-eq v5, v6, :cond_33

    goto :goto_1b

    :cond_33
    const/4 v6, 0x0

    goto :goto_1c

    :cond_34
    :goto_1b
    const/4 v6, 0x1

    :goto_1c
    iput-boolean v6, v2, Ll/᩺۠;->᩻:Z

    .line 856
    iget-boolean v6, v13, Ll/ܽ᩸;->ۜ֫:Z

    if-eqz v6, :cond_35

    const/4 v0, 0x1

    :cond_35
    if-eqz v0, :cond_36

    const/4 v6, -0x1

    if-eq v3, v6, :cond_36

    .line 859
    invoke-virtual/range {p1 .. p1}, Ll/ܶ۠;->ܽ()I

    move-result v1

    if-eq v1, v3, :cond_36

    const/4 v1, 0x1

    .line 860
    iput-boolean v1, v2, Ll/᩺۠;->᩻:Z

    .line 862
    :cond_36
    iput v4, v2, Ll/᩺۠;->ۜ:I

    .line 863
    iput v5, v2, Ll/᩺۠;->ܳ:I

    .line 864
    iput-boolean v0, v2, Ll/᩺۠;->ܿ:Z

    .line 865
    iput v3, v2, Ll/᩺۠;->ᩳ:I

    return-void
.end method
