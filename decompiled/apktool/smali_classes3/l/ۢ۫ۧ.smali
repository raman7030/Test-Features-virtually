.class public Ll/ۢ۫ۧ;
.super Ll/ܿ۬ۧ;
.source "8539"

# interfaces
.implements Ll/۠۬ۧ;


# instance fields
.field public ֡:Z

.field public ֨:Z

.field public final ֫:Ll/ۧ۫ۧ;

.field public ۖ:Ll/ۖۗۧ;

.field public ۘ:Ljava/util/BitSet;

.field public ۚ:I

.field public ۜ:I

.field public ۠:I

.field public ۡ:I

.field public ۢ:I

.field public final ۧ:Ljava/lang/Runnable;

.field public final ܳ:Ll/ۧۗۧ;

.field public ܶ:[Ll/᩷۫ۧ;

.field public ܺ:[I

.field public ܽ:I

.field public ܿ:Z

.field public ᩳ:Z

.field public ᩴ:Z

.field public ᩵:Ll/ۖۗۧ;

.field public ᩷:Ll/ۜ۫ۧ;

.field public final ᩸:Landroid/graphics/Rect;

.field public ᩻:Ll/ܳ۫ۧ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 4

    .line 228
    invoke-direct {p0}, Ll/ܿ۬ۧ;-><init>()V

    const/4 v0, -0x1

    .line 106
    iput v0, p0, Ll/ۢ۫ۧ;->۠:I

    const/4 v1, 0x0

    .line 129
    iput-boolean v1, p0, Ll/ۢ۫ۧ;->ᩴ:Z

    .line 134
    iput-boolean v1, p0, Ll/ۢ۫ۧ;->֡:Z

    .line 145
    iput v0, p0, Ll/ۢ۫ۧ;->ۢ:I

    const/high16 v0, -0x80000000

    .line 151
    iput v0, p0, Ll/ۢ۫ۧ;->ۡ:I

    .line 157
    new-instance v0, Ll/ܳ۫ۧ;

    .line 2812
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 157
    iput-object v0, p0, Ll/ۢ۫ۧ;->᩻:Ll/ܳ۫ۧ;

    const/4 v2, 0x2

    .line 162
    iput v2, p0, Ll/ۢ۫ۧ;->ܽ:I

    .line 188
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iput-object v2, p0, Ll/ۢ۫ۧ;->᩸:Landroid/graphics/Rect;

    .line 193
    new-instance v2, Ll/ۧ۫ۧ;

    invoke-direct {v2, p0}, Ll/ۧ۫ۧ;-><init>(Ll/ۢ۫ۧ;)V

    iput-object v2, p0, Ll/ۢ۫ۧ;->֫:Ll/ۧ۫ۧ;

    const/4 v2, 0x1

    .line 207
    iput-boolean v2, p0, Ll/ۢ۫ۧ;->֨:Z

    .line 215
    new-instance v3, Ll/֫۫ۧ;

    invoke-direct {v3, p0}, Ll/֫۫ۧ;-><init>(Ll/ۢ۫ۧ;)V

    iput-object v3, p0, Ll/ۢ۫ۧ;->ۧ:Ljava/lang/Runnable;

    .line 229
    invoke-static {p1, p2, p3, p4}, Ll/ܿ۬ۧ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;II)Ll/ᩳ۬ۧ;

    move-result-object p1

    .line 230
    iget p2, p1, Ll/ᩳ۬ۧ;->֫:I

    if-eqz p2, :cond_1

    if-ne p2, v2, :cond_0

    goto :goto_0

    .line 449
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid orientation."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/4 p3, 0x0

    .line 451
    invoke-virtual {p0, p3}, Ll/ۢ۫ۧ;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 452
    iget p4, p0, Ll/ۢ۫ۧ;->ۜ:I

    if-ne p2, p4, :cond_2

    goto :goto_1

    .line 455
    :cond_2
    iput p2, p0, Ll/ۢ۫ۧ;->ۜ:I

    .line 456
    iget-object p2, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    .line 457
    iget-object p4, p0, Ll/ۢ۫ۧ;->᩵:Ll/ۖۗۧ;

    iput-object p4, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    .line 458
    iput-object p2, p0, Ll/ۢ۫ۧ;->᩵:Ll/ۖۗۧ;

    .line 459
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->requestLayout()V

    .line 231
    :goto_1
    iget p2, p1, Ll/ᩳ۬ۧ;->ܽ:I

    .line 428
    invoke-virtual {p0, p3}, Ll/ۢ۫ۧ;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 429
    iget p4, p0, Ll/ۢ۫ۧ;->۠:I

    if-eq p2, p4, :cond_4

    .line 548
    invoke-virtual {v0}, Ll/ܳ۫ۧ;->֫()V

    .line 549
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->requestLayout()V

    .line 431
    iput p2, p0, Ll/ۢ۫ۧ;->۠:I

    .line 432
    new-instance p2, Ljava/util/BitSet;

    iget p4, p0, Ll/ۢ۫ۧ;->۠:I

    invoke-direct {p2, p4}, Ljava/util/BitSet;-><init>(I)V

    iput-object p2, p0, Ll/ۢ۫ۧ;->ۘ:Ljava/util/BitSet;

    .line 433
    iget p2, p0, Ll/ۢ۫ۧ;->۠:I

    new-array p2, p2, [Ll/᩷۫ۧ;

    iput-object p2, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    const/4 p2, 0x0

    .line 434
    :goto_2
    iget p4, p0, Ll/ۢ۫ۧ;->۠:I

    if-ge p2, p4, :cond_3

    .line 435
    iget-object p4, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    new-instance v0, Ll/᩷۫ۧ;

    invoke-direct {v0, p0, p2}, Ll/᩷۫ۧ;-><init>(Ll/ۢ۫ۧ;I)V

    aput-object v0, p4, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    .line 437
    :cond_3
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->requestLayout()V

    .line 232
    :cond_4
    iget-boolean p1, p1, Ll/ᩳ۬ۧ;->ۧ:Z

    .line 476
    invoke-virtual {p0, p3}, Ll/ۢ۫ۧ;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 477
    iget-object p2, p0, Ll/ۢ۫ۧ;->᩷:Ll/ۜ۫ۧ;

    if-eqz p2, :cond_5

    iget-boolean p3, p2, Ll/ۜ۫ۧ;->ۗ:Z

    if-eq p3, p1, :cond_5

    .line 478
    iput-boolean p1, p2, Ll/ۜ۫ۧ;->ۗ:Z

    .line 480
    :cond_5
    iput-boolean p1, p0, Ll/ۢ۫ۧ;->ᩴ:Z

    .line 481
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->requestLayout()V

    .line 233
    new-instance p1, Ll/ۧۗۧ;

    .line 25
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-boolean v2, p1, Ll/ۧۗۧ;->᩻:Z

    .line 67
    iput v1, p1, Ll/ۧۗۧ;->ۜ:I

    .line 72
    iput v1, p1, Ll/ۧۗۧ;->ܽ:I

    .line 233
    iput-object p1, p0, Ll/ۢ۫ۧ;->ܳ:Ll/ۧۗۧ;

    .line 257
    iget p1, p0, Ll/ۢ۫ۧ;->ۜ:I

    invoke-static {p0, p1}, Ll/ۖۗۧ;->֫(Ll/ܿ۬ۧ;I)Ll/ۖۗۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    .line 258
    iget p1, p0, Ll/ۢ۫ۧ;->ۜ:I

    sub-int/2addr v2, p1

    .line 259
    invoke-static {p0, v2}, Ll/ۖۗۧ;->֫(Ll/ܿ۬ۧ;I)Ll/ۖۗۧ;

    move-result-object p1

    iput-object p1, p0, Ll/ۢ۫ۧ;->᩵:Ll/ۖۗۧ;

    return-void
.end method

.method private ֫(I)I
    .locals 3

    .line 1859
    iget-object v0, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Ll/᩷۫ۧ;->֫(I)I

    move-result v0

    const/4 v1, 0x1

    .line 1860
    :goto_0
    iget v2, p0, Ll/ۢ۫ۧ;->۠:I

    if-ge v1, v2, :cond_1

    .line 1861
    iget-object v2, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Ll/᩷۫ۧ;->֫(I)I

    move-result v2

    if-le v2, v0, :cond_0

    move v0, v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method private ֫(Ll/ۖ۬ۧ;Ll/ۧۗۧ;Ll/᩸۬ۧ;)I
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 1549
    iget-object v3, v0, Ll/ۢ۫ۧ;->ۘ:Ljava/util/BitSet;

    const/4 v4, 0x0

    iget v5, v0, Ll/ۢ۫ۧ;->۠:I

    const/4 v6, 0x1

    invoke-virtual {v3, v4, v5, v6}, Ljava/util/BitSet;->set(IIZ)V

    .line 1554
    iget-object v3, v0, Ll/ۢ۫ۧ;->ܳ:Ll/ۧۗۧ;

    iget-boolean v4, v3, Ll/ۧۗۧ;->ᩳ:Z

    if-eqz v4, :cond_1

    .line 1555
    iget v4, v2, Ll/ۧۗۧ;->ܳ:I

    if-ne v4, v6, :cond_0

    const v4, 0x7fffffff

    goto :goto_0

    :cond_0
    const/high16 v4, -0x80000000

    goto :goto_0

    .line 1561
    :cond_1
    iget v4, v2, Ll/ۧۗۧ;->ܳ:I

    if-ne v4, v6, :cond_2

    .line 1562
    iget v4, v2, Ll/ۧۗۧ;->ܽ:I

    iget v5, v2, Ll/ۧۗۧ;->֫:I

    add-int/2addr v4, v5

    goto :goto_0

    .line 1564
    :cond_2
    iget v4, v2, Ll/ۧۗۧ;->ۜ:I

    iget v5, v2, Ll/ۧۗۧ;->֫:I

    sub-int/2addr v4, v5

    .line 1568
    :goto_0
    iget v5, v2, Ll/ۧۗۧ;->ܳ:I

    const/4 v7, 0x0

    .line 1793
    :goto_1
    iget v8, v0, Ll/ۢ۫ۧ;->۠:I

    if-ge v7, v8, :cond_4

    .line 1794
    iget-object v8, v0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v8, v8, v7

    iget-object v8, v8, Ll/᩷۫ۧ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_3

    goto :goto_2

    .line 1797
    :cond_3
    iget-object v8, v0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v8, v8, v7

    invoke-direct {v0, v8, v5, v4}, Ll/ۢ۫ۧ;->֫(Ll/᩷۫ۧ;II)V

    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 1575
    :cond_4
    iget-boolean v5, v0, Ll/ۢ۫ۧ;->֡:Z

    if-eqz v5, :cond_5

    .line 1576
    iget-object v5, v0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v5}, Ll/ۖۗۧ;->ۧ()I

    move-result v5

    goto :goto_3

    .line 1577
    :cond_5
    iget-object v5, v0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v5}, Ll/ۖۗۧ;->ܳ()I

    move-result v5

    :goto_3
    const/4 v7, 0x0

    move-object v14, v0

    .line 88
    :goto_4
    iget v8, v2, Ll/ۧۗۧ;->ۧ:I

    const/4 v9, -0x1

    if-ltz v8, :cond_1b

    invoke-virtual/range {p3 .. p3}, Ll/᩸۬ۧ;->֫()I

    move-result v10

    if-ge v8, v10, :cond_1b

    .line 1579
    iget-boolean v8, v3, Ll/ۧۗۧ;->ᩳ:Z

    if-nez v8, :cond_6

    iget-object v8, v14, Ll/ۢ۫ۧ;->ۘ:Ljava/util/BitSet;

    .line 1580
    invoke-virtual {v8}, Ljava/util/BitSet;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_1b

    .line 98
    :cond_6
    iget v7, v2, Ll/ۧۗۧ;->ۧ:I

    invoke-virtual {v1, v7}, Ll/ۖ۬ۧ;->ۧ(I)Landroid/view/View;

    move-result-object v7

    .line 99
    iget v8, v2, Ll/ۧۗۧ;->ۧ:I

    iget v10, v2, Ll/ۧۗۧ;->ܿ:I

    add-int/2addr v8, v10

    iput v8, v2, Ll/ۧۗۧ;->ۧ:I

    .line 1582
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Ll/ܽ۫ۧ;

    .line 12605
    iget-object v10, v8, Ll/ܳ۬ۧ;->ᩳ:Ll/ۗ۬ۧ;

    invoke-virtual {v10}, Ll/ۗ۬ۧ;->getLayoutPosition()I

    move-result v10

    .line 2858
    iget-object v11, v14, Ll/ۢ۫ۧ;->᩻:Ll/ܳ۫ۧ;

    iget-object v12, v11, Ll/ܳ۫ۧ;->֫:[I

    if-eqz v12, :cond_8

    array-length v13, v12

    if-lt v10, v13, :cond_7

    goto :goto_5

    .line 2861
    :cond_7
    aget v12, v12, v10

    goto :goto_6

    :cond_8
    :goto_5
    const/4 v12, -0x1

    :goto_6
    if-ne v12, v9, :cond_e

    .line 1954
    iget v12, v2, Ll/ۧۗۧ;->ܳ:I

    invoke-direct {v14, v12}, Ll/ۢ۫ۧ;->ܽ(I)Z

    move-result v12

    if-eqz v12, :cond_9

    .line 1957
    iget v12, v14, Ll/ۢ۫ۧ;->۠:I

    sub-int/2addr v12, v6

    const/4 v13, -0x1

    goto :goto_7

    .line 1963
    :cond_9
    iget v9, v14, Ll/ۢ۫ۧ;->۠:I

    const/4 v13, 0x1

    const/4 v12, 0x0

    .line 1965
    :goto_7
    iget v15, v2, Ll/ۧۗۧ;->ܳ:I

    const/16 v16, 0x0

    if-ne v15, v6, :cond_b

    .line 1968
    iget-object v6, v14, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v6}, Ll/ۖۗۧ;->ܳ()I

    move-result v6

    const v15, 0x7fffffff

    :goto_8
    if-eq v12, v9, :cond_d

    .line 1970
    iget-object v0, v14, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v0, v0, v12

    .line 1971
    invoke-virtual {v0, v6}, Ll/᩷۫ۧ;->֫(I)I

    move-result v1

    if-ge v1, v15, :cond_a

    move-object/from16 v16, v0

    move v15, v1

    :cond_a
    add-int/2addr v12, v13

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    goto :goto_8

    .line 1981
    :cond_b
    iget-object v0, v14, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v0}, Ll/ۖۗۧ;->ۧ()I

    move-result v0

    const/high16 v1, -0x80000000

    :goto_9
    if-eq v12, v9, :cond_d

    .line 1983
    iget-object v6, v14, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v6, v6, v12

    .line 1984
    invoke-virtual {v6, v0}, Ll/᩷۫ۧ;->ۧ(I)I

    move-result v15

    if-le v15, v1, :cond_c

    move-object/from16 v16, v6

    move v1, v15

    :cond_c
    add-int/2addr v12, v13

    goto :goto_9

    :cond_d
    move-object/from16 v0, v16

    .line 2866
    invoke-virtual {v11, v10}, Ll/ܳ۫ۧ;->֫(I)V

    .line 2867
    iget-object v1, v11, Ll/ܳ۫ۧ;->֫:[I

    iget v6, v0, Ll/᩷۫ۧ;->ᩳ:I

    aput v6, v1, v10

    goto :goto_a

    .line 1597
    :cond_e
    iget-object v0, v14, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v0, v0, v12

    .line 1600
    :goto_a
    iput-object v0, v8, Ll/ܽ۫ۧ;->ܿ:Ll/᩷۫ۧ;

    .line 1601
    iget v1, v2, Ll/ۧۗۧ;->ܳ:I

    const/4 v6, 0x1

    if-ne v1, v6, :cond_f

    .line 1602
    invoke-virtual {v14, v7}, Ll/ܿ۬ۧ;->addView(Landroid/view/View;)V

    const/4 v1, 0x0

    goto :goto_b

    :cond_f
    const/4 v1, 0x0

    .line 1604
    invoke-virtual {v14, v7, v1}, Ll/ܿ۬ۧ;->addView(Landroid/view/View;I)V

    .line 1159
    :goto_b
    iget v9, v14, Ll/ۢ۫ۧ;->ۜ:I

    if-ne v9, v6, :cond_10

    .line 1162
    iget v9, v14, Ll/ۢ۫ۧ;->ۚ:I

    .line 1166
    invoke-virtual {v14}, Ll/ܿ۬ۧ;->getWidthMode()I

    move-result v10

    iget v11, v8, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 1164
    invoke-static {v9, v10, v1, v11, v1}, Ll/ܿ۬ۧ;->֫(IIIIZ)I

    move-result v1

    .line 1171
    invoke-virtual {v14}, Ll/ܿ۬ۧ;->getHeight()I

    move-result v9

    .line 1172
    invoke-virtual {v14}, Ll/ܿ۬ۧ;->getHeightMode()I

    move-result v10

    .line 1173
    invoke-virtual {v14}, Ll/ܿ۬ۧ;->getPaddingTop()I

    move-result v11

    invoke-virtual {v14}, Ll/ܿ۬ۧ;->getPaddingBottom()I

    move-result v12

    add-int/2addr v12, v11

    iget v11, v8, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 1170
    invoke-static {v9, v10, v12, v11, v6}, Ll/ܿ۬ۧ;->֫(IIIIZ)I

    move-result v9

    .line 1162
    invoke-direct {v14, v7, v1, v9}, Ll/ۢ۫ۧ;->֫(Landroid/view/View;II)V

    goto :goto_c

    .line 1183
    :cond_10
    invoke-virtual {v14}, Ll/ܿ۬ۧ;->getWidth()I

    move-result v1

    .line 1184
    invoke-virtual {v14}, Ll/ܿ۬ۧ;->getWidthMode()I

    move-result v9

    .line 1185
    invoke-virtual {v14}, Ll/ܿ۬ۧ;->getPaddingLeft()I

    move-result v10

    invoke-virtual {v14}, Ll/ܿ۬ۧ;->getPaddingRight()I

    move-result v11

    add-int/2addr v11, v10

    iget v10, v8, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 1182
    invoke-static {v1, v9, v11, v10, v6}, Ll/ܿ۬ۧ;->֫(IIIIZ)I

    move-result v1

    iget v9, v14, Ll/ۢ۫ۧ;->ۚ:I

    .line 1190
    invoke-virtual {v14}, Ll/ܿ۬ۧ;->getHeightMode()I

    move-result v10

    iget v11, v8, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    const/4 v12, 0x0

    .line 1188
    invoke-static {v9, v10, v12, v11, v12}, Ll/ܿ۬ۧ;->֫(IIIIZ)I

    move-result v9

    .line 1180
    invoke-direct {v14, v7, v1, v9}, Ll/ۢ۫ۧ;->֫(Landroid/view/View;II)V

    .line 1610
    :goto_c
    iget v1, v2, Ll/ۧۗۧ;->ܳ:I

    if-ne v1, v6, :cond_11

    .line 1612
    invoke-virtual {v0, v5}, Ll/᩷۫ۧ;->֫(I)I

    move-result v1

    .line 1613
    iget-object v6, v14, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v6, v7}, Ll/ۖۗۧ;->ۧ(Landroid/view/View;)I

    move-result v6

    add-int/2addr v6, v1

    goto :goto_d

    .line 1623
    :cond_11
    invoke-virtual {v0, v5}, Ll/᩷۫ۧ;->ۧ(I)I

    move-result v1

    .line 1624
    iget-object v6, v14, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v6, v7}, Ll/ۖۗۧ;->ۧ(Landroid/view/View;)I

    move-result v6

    sub-int v6, v1, v6

    move/from16 v17, v6

    move v6, v1

    move/from16 v1, v17

    .line 1724
    :goto_d
    iget v9, v2, Ll/ۧۗۧ;->ܳ:I

    const/4 v10, 0x1

    if-ne v9, v10, :cond_14

    .line 1728
    iget-object v8, v8, Ll/ܽ۫ۧ;->ܿ:Ll/᩷۫ۧ;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2655
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Ll/ܽ۫ۧ;

    .line 2575
    iput-object v8, v9, Ll/ܽ۫ۧ;->ܿ:Ll/᩷۫ۧ;

    .line 2576
    iget-object v11, v8, Ll/᩷۫ۧ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v12, -0x80000000

    .line 2577
    iput v12, v8, Ll/᩷۫ۧ;->֫:I

    .line 2578
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ne v11, v10, :cond_12

    .line 2579
    iput v12, v8, Ll/᩷۫ۧ;->ۧ:I

    .line 12576
    :cond_12
    iget-object v10, v9, Ll/ܳ۬ۧ;->ᩳ:Ll/ۗ۬ۧ;

    invoke-virtual {v10}, Ll/ۗ۬ۧ;->isRemoved()Z

    move-result v10

    if-nez v10, :cond_13

    .line 12587
    iget-object v9, v9, Ll/ܳ۬ۧ;->ᩳ:Ll/ۗ۬ۧ;

    invoke-virtual {v9}, Ll/ۗ۬ۧ;->isUpdated()Z

    move-result v9

    if-eqz v9, :cond_17

    .line 2582
    :cond_13
    iget v9, v8, Ll/᩷۫ۧ;->ܽ:I

    iget-object v10, v8, Ll/᩷۫ۧ;->ܳ:Ll/ۢ۫ۧ;

    iget-object v10, v10, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v10, v7}, Ll/ۖۗۧ;->ۧ(Landroid/view/View;)I

    move-result v10

    add-int/2addr v10, v9

    iput v10, v8, Ll/᩷۫ۧ;->ܽ:I

    goto :goto_e

    .line 1734
    :cond_14
    iget-object v8, v8, Ll/ܽ۫ۧ;->ܿ:Ll/᩷۫ۧ;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2655
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Ll/ܽ۫ۧ;

    .line 2562
    iput-object v8, v9, Ll/ܽ۫ۧ;->ܿ:Ll/᩷۫ۧ;

    .line 2563
    iget-object v10, v8, Ll/᩷۫ۧ;->ܿ:Ljava/util/ArrayList;

    const/4 v11, 0x0

    invoke-virtual {v10, v11, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const/high16 v11, -0x80000000

    .line 2564
    iput v11, v8, Ll/᩷۫ۧ;->ۧ:I

    .line 2565
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    const/4 v12, 0x1

    if-ne v10, v12, :cond_15

    .line 2566
    iput v11, v8, Ll/᩷۫ۧ;->֫:I

    .line 12576
    :cond_15
    iget-object v10, v9, Ll/ܳ۬ۧ;->ᩳ:Ll/ۗ۬ۧ;

    invoke-virtual {v10}, Ll/ۗ۬ۧ;->isRemoved()Z

    move-result v10

    if-nez v10, :cond_16

    .line 12587
    iget-object v9, v9, Ll/ܳ۬ۧ;->ᩳ:Ll/ۗ۬ۧ;

    invoke-virtual {v9}, Ll/ۗ۬ۧ;->isUpdated()Z

    move-result v9

    if-eqz v9, :cond_17

    .line 2569
    :cond_16
    iget v9, v8, Ll/᩷۫ۧ;->ܽ:I

    iget-object v10, v8, Ll/᩷۫ۧ;->ܳ:Ll/ۢ۫ۧ;

    iget-object v10, v10, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v10, v7}, Ll/ۖۗۧ;->ۧ(Landroid/view/View;)I

    move-result v10

    add-int/2addr v10, v9

    iput v10, v8, Ll/᩷۫ۧ;->ܽ:I

    .line 1658
    :cond_17
    :goto_e
    invoke-virtual {v14}, Ll/ۢ۫ۧ;->isLayoutRTL()Z

    move-result v8

    if-eqz v8, :cond_18

    iget v8, v14, Ll/ۢ۫ۧ;->ۜ:I

    const/4 v9, 0x1

    if-ne v8, v9, :cond_18

    .line 1661
    iget-object v8, v14, Ll/ۢ۫ۧ;->᩵:Ll/ۖۗۧ;

    .line 1660
    invoke-virtual {v8}, Ll/ۖۗۧ;->ۧ()I

    move-result v8

    iget v10, v14, Ll/ۢ۫ۧ;->۠:I

    sub-int/2addr v10, v9

    iget v9, v0, Ll/᩷۫ۧ;->ᩳ:I

    sub-int/2addr v10, v9

    iget v9, v14, Ll/ۢ۫ۧ;->ۚ:I

    mul-int v10, v10, v9

    sub-int/2addr v8, v10

    .line 1662
    iget-object v9, v14, Ll/ۢ۫ۧ;->᩵:Ll/ۖۗۧ;

    invoke-virtual {v9, v7}, Ll/ۖۗۧ;->ۧ(Landroid/view/View;)I

    move-result v9

    sub-int v9, v8, v9

    goto :goto_f

    .line 1666
    :cond_18
    iget v8, v0, Ll/᩷۫ۧ;->ᩳ:I

    iget v9, v14, Ll/ۢ۫ۧ;->ۚ:I

    mul-int v8, v8, v9

    iget-object v9, v14, Ll/ۢ۫ۧ;->᩵:Ll/ۖۗۧ;

    invoke-virtual {v9}, Ll/ۖۗۧ;->ܳ()I

    move-result v9

    add-int/2addr v9, v8

    .line 1667
    iget-object v8, v14, Ll/ۢ۫ۧ;->᩵:Ll/ۖۗۧ;

    invoke-virtual {v8, v7}, Ll/ۖۗۧ;->ۧ(Landroid/view/View;)I

    move-result v8

    add-int/2addr v8, v9

    :goto_f
    move v13, v8

    move v11, v9

    .line 1670
    iget v8, v14, Ll/ۢ۫ۧ;->ۜ:I

    const/4 v9, 0x1

    if-ne v8, v9, :cond_19

    move-object v8, v14

    move-object v9, v7

    move v10, v11

    move v11, v1

    move v12, v13

    move v13, v6

    .line 1671
    invoke-virtual/range {v8 .. v13}, Ll/ܿ۬ۧ;->layoutDecoratedWithMargins(Landroid/view/View;IIII)V

    move-object/from16 v14, p0

    goto :goto_10

    :cond_19
    move-object v8, v14

    move-object v9, v7

    move v10, v1

    move v12, v6

    .line 1673
    invoke-virtual/range {v8 .. v13}, Ll/ܿ۬ۧ;->layoutDecoratedWithMargins(Landroid/view/View;IIII)V

    .line 1679
    :goto_10
    iget v1, v3, Ll/ۧۗۧ;->ܳ:I

    invoke-direct {v14, v0, v1, v4}, Ll/ۢ۫ۧ;->֫(Ll/᩷۫ۧ;II)V

    move-object/from16 v1, p1

    .line 1681
    invoke-direct {v14, v1, v3}, Ll/ۢ۫ۧ;->֫(Ll/ۖ۬ۧ;Ll/ۧۗۧ;)V

    .line 1682
    iget-boolean v6, v3, Ll/ۧۗۧ;->᩷:Z

    if-eqz v6, :cond_1a

    invoke-virtual {v7}, Landroid/view/View;->hasFocusable()Z

    move-result v6

    if-eqz v6, :cond_1a

    .line 1686
    iget-object v6, v14, Ll/ۢ۫ۧ;->ۘ:Ljava/util/BitSet;

    iget v0, v0, Ll/᩷۫ۧ;->ᩳ:I

    const/4 v7, 0x0

    invoke-virtual {v6, v0, v7}, Ljava/util/BitSet;->set(IZ)V

    :cond_1a
    const/4 v7, 0x1

    const/4 v6, 0x1

    move-object/from16 v0, p0

    goto/16 :goto_4

    :cond_1b
    if-nez v7, :cond_1c

    .line 1692
    invoke-direct {v14, v1, v3}, Ll/ۢ۫ۧ;->֫(Ll/ۖ۬ۧ;Ll/ۧۗۧ;)V

    .line 1695
    :cond_1c
    iget v0, v3, Ll/ۧۗۧ;->ܳ:I

    if-ne v0, v9, :cond_1d

    .line 1696
    iget-object v0, v14, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v0}, Ll/ۖۗۧ;->ܳ()I

    move-result v0

    invoke-direct {v14, v0}, Ll/ۢ۫ۧ;->ۧ(I)I

    move-result v0

    .line 1697
    iget-object v1, v14, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v1}, Ll/ۖۗۧ;->ܳ()I

    move-result v1

    sub-int/2addr v1, v0

    goto :goto_11

    .line 1699
    :cond_1d
    iget-object v0, v14, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v0}, Ll/ۖۗۧ;->ۧ()I

    move-result v0

    invoke-direct {v14, v0}, Ll/ۢ۫ۧ;->֫(I)I

    move-result v0

    .line 1700
    iget-object v1, v14, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v1}, Ll/ۖۗۧ;->ۧ()I

    move-result v1

    sub-int v1, v0, v1

    :goto_11
    if-lez v1, :cond_1e

    .line 1702
    iget v0, v2, Ll/ۧۗۧ;->֫:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0

    :cond_1e
    const/4 v0, 0x0

    return v0
.end method

.method private ֫(Ll/᩸۬ۧ;)I
    .locals 8

    .line 1080
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1084
    :cond_0
    iget-boolean v0, p0, Ll/ۢ۫ۧ;->֨:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ll/ۢ۫ۧ;->ۧ(Z)Landroid/view/View;

    move-result-object v3

    .line 1085
    invoke-virtual {p0, v0}, Ll/ۢ۫ۧ;->֫(Z)Landroid/view/View;

    move-result-object v4

    iget-boolean v6, p0, Ll/ۢ۫ۧ;->֨:Z

    iget-boolean v7, p0, Ll/ۢ۫ۧ;->֡:Z

    .line 1083
    iget-object v2, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    move-object v1, p1

    move-object v5, p0

    invoke-static/range {v1 .. v7}, Ll/ۛ۬ۧ;->֫(Ll/᩸۬ۧ;Ll/ۖۗۧ;Landroid/view/View;Landroid/view/View;Ll/ܿ۬ۧ;ZZ)I

    move-result p1

    return p1
.end method

.method private ֫(Landroid/view/View;II)V
    .locals 5

    .line 1201
    iget-object v0, p0, Ll/ۢ۫ۧ;->᩸:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, v0}, Ll/ܿ۬ۧ;->calculateItemDecorationsForChild(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1202
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Ll/ܽ۫ۧ;

    .line 1203
    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v3, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr v2, v3

    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v4, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v4

    invoke-static {p2, v2, v3}, Ll/ۢ۫ۧ;->ᩳ(III)I

    move-result p2

    .line 1205
    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v3, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, v3

    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, v0

    invoke-static {p3, v2, v3}, Ll/ۢ۫ۧ;->ᩳ(III)I

    move-result p3

    .line 1209
    invoke-virtual {p0, p1, p2, p3, v1}, Ll/ܿ۬ۧ;->shouldMeasureChild(Landroid/view/View;IILl/ܳ۬ۧ;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1211
    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    :cond_0
    return-void
.end method

.method private ֫(Ll/ۖ۬ۧ;I)V
    .locals 8

    .line 1910
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_4

    .line 1913
    invoke-virtual {p0, v0}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1914
    iget-object v3, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v3, v2}, Ll/ۖۗۧ;->ᩳ(Landroid/view/View;)I

    move-result v3

    if-lt v3, p2, :cond_4

    iget-object v3, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    .line 1915
    invoke-virtual {v3, v2}, Ll/ۖۗۧ;->ܳ(Landroid/view/View;)I

    move-result v3

    if-lt v3, p2, :cond_4

    .line 1916
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Ll/ܽ۫ۧ;

    .line 1918
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1928
    iget-object v4, v3, Ll/ܽ۫ۧ;->ܿ:Ll/᩷۫ۧ;

    iget-object v4, v4, Ll/᩷۫ۧ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ne v4, v1, :cond_0

    goto :goto_1

    .line 1931
    :cond_0
    iget-object v3, v3, Ll/ܽ۫ۧ;->ܿ:Ll/᩷۫ۧ;

    .line 2624
    iget-object v4, v3, Ll/᩷۫ۧ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/lit8 v6, v5, -0x1

    .line 2625
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    .line 2655
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Ll/ܽ۫ۧ;

    const/4 v7, 0x0

    .line 2627
    iput-object v7, v6, Ll/ܽ۫ۧ;->ܿ:Ll/᩷۫ۧ;

    .line 12576
    iget-object v7, v6, Ll/ܳ۬ۧ;->ᩳ:Ll/ۗ۬ۧ;

    invoke-virtual {v7}, Ll/ۗ۬ۧ;->isRemoved()Z

    move-result v7

    if-nez v7, :cond_1

    .line 12587
    iget-object v6, v6, Ll/ܳ۬ۧ;->ᩳ:Ll/ۗ۬ۧ;

    invoke-virtual {v6}, Ll/ۗ۬ۧ;->isUpdated()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 2629
    :cond_1
    iget v6, v3, Ll/᩷۫ۧ;->ܽ:I

    iget-object v7, v3, Ll/᩷۫ۧ;->ܳ:Ll/ۢ۫ۧ;

    iget-object v7, v7, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v7, v4}, Ll/ۖۗۧ;->ۧ(Landroid/view/View;)I

    move-result v4

    sub-int/2addr v6, v4

    iput v6, v3, Ll/᩷۫ۧ;->ܽ:I

    :cond_2
    const/high16 v4, -0x80000000

    if-ne v5, v1, :cond_3

    .line 2632
    iput v4, v3, Ll/᩷۫ۧ;->ۧ:I

    .line 2634
    :cond_3
    iput v4, v3, Ll/᩷۫ۧ;->֫:I

    .line 1933
    invoke-virtual {p0, v2, p1}, Ll/ܿ۬ۧ;->removeAndRecycleView(Landroid/view/View;Ll/ۖ۬ۧ;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_4
    :goto_1
    return-void
.end method

.method private ֫(Ll/ۖ۬ۧ;Ll/ۧۗۧ;)V
    .locals 4

    .line 1740
    iget-boolean v0, p2, Ll/ۧۗۧ;->᩻:Z

    if-eqz v0, :cond_a

    iget-boolean v0, p2, Ll/ۧۗۧ;->ᩳ:Z

    if-eqz v0, :cond_0

    goto/16 :goto_4

    .line 1743
    :cond_0
    iget v0, p2, Ll/ۧۗۧ;->֫:I

    const/4 v1, -0x1

    if-nez v0, :cond_2

    .line 1745
    iget v0, p2, Ll/ۧۗۧ;->ܳ:I

    if-ne v0, v1, :cond_1

    .line 1746
    iget p2, p2, Ll/ۧۗۧ;->ܽ:I

    invoke-direct {p0, p1, p2}, Ll/ۢ۫ۧ;->֫(Ll/ۖ۬ۧ;I)V

    return-void

    .line 1748
    :cond_1
    iget p2, p2, Ll/ۧۗۧ;->ۜ:I

    invoke-direct {p0, p1, p2}, Ll/ۢ۫ۧ;->ۧ(Ll/ۖ۬ۧ;I)V

    return-void

    .line 1753
    :cond_2
    iget v0, p2, Ll/ۧۗۧ;->ܳ:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_6

    .line 1755
    iget v0, p2, Ll/ۧۗۧ;->ۜ:I

    .line 1817
    iget-object v1, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v1, v1, v3

    invoke-virtual {v1, v0}, Ll/᩷۫ۧ;->ۧ(I)I

    move-result v1

    .line 1818
    :goto_0
    iget v3, p0, Ll/ۢ۫ۧ;->۠:I

    if-ge v2, v3, :cond_4

    .line 1819
    iget-object v3, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v3, v3, v2

    invoke-virtual {v3, v0}, Ll/᩷۫ۧ;->ۧ(I)I

    move-result v3

    if-le v3, v1, :cond_3

    move v1, v3

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    sub-int/2addr v0, v1

    if-gez v0, :cond_5

    .line 1758
    iget p2, p2, Ll/ۧۗۧ;->ܽ:I

    goto :goto_1

    .line 1760
    :cond_5
    iget v1, p2, Ll/ۧۗۧ;->ܽ:I

    iget p2, p2, Ll/ۧۗۧ;->֫:I

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    sub-int p2, v1, p2

    .line 1762
    :goto_1
    invoke-direct {p0, p1, p2}, Ll/ۢ۫ۧ;->֫(Ll/ۖ۬ۧ;I)V

    return-void

    .line 1765
    :cond_6
    iget v0, p2, Ll/ۧۗۧ;->ܽ:I

    .line 1870
    iget-object v1, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v1, v1, v3

    invoke-virtual {v1, v0}, Ll/᩷۫ۧ;->֫(I)I

    move-result v1

    .line 1871
    :goto_2
    iget v3, p0, Ll/ۢ۫ۧ;->۠:I

    if-ge v2, v3, :cond_8

    .line 1872
    iget-object v3, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v3, v3, v2

    invoke-virtual {v3, v0}, Ll/᩷۫ۧ;->֫(I)I

    move-result v3

    if-ge v3, v1, :cond_7

    move v1, v3

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 1765
    :cond_8
    iget v0, p2, Ll/ۧۗۧ;->ܽ:I

    sub-int/2addr v1, v0

    if-gez v1, :cond_9

    .line 1768
    iget p2, p2, Ll/ۧۗۧ;->ۜ:I

    goto :goto_3

    .line 1770
    :cond_9
    iget v0, p2, Ll/ۧۗۧ;->ۜ:I

    iget p2, p2, Ll/ۧۗۧ;->֫:I

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    add-int/2addr p2, v0

    .line 1772
    :goto_3
    invoke-direct {p0, p1, p2}, Ll/ۢ۫ۧ;->ۧ(Ll/ۖ۬ۧ;I)V

    :cond_a
    :goto_4
    return-void
.end method

.method private ֫(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;Z)V
    .locals 2

    const/high16 v0, -0x80000000

    .line 1385
    invoke-direct {p0, v0}, Ll/ۢ۫ۧ;->֫(I)I

    move-result v1

    if-ne v1, v0, :cond_0

    goto :goto_0

    .line 1389
    :cond_0
    iget-object v0, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v0}, Ll/ۖۗۧ;->ۧ()I

    move-result v0

    sub-int/2addr v0, v1

    if-lez v0, :cond_1

    neg-int v1, v0

    .line 1392
    invoke-virtual {p0, v1, p1, p2}, Ll/ۢ۫ۧ;->scrollBy(ILl/ۖ۬ۧ;Ll/᩸۬ۧ;)I

    move-result p1

    neg-int p1, p1

    sub-int/2addr v0, p1

    if-eqz p3, :cond_1

    if-lez v0, :cond_1

    .line 1398
    iget-object p1, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {p1, v0}, Ll/ۖۗۧ;->֫(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method private ֫(Ll/᩷۫ۧ;II)V
    .locals 5

    .line 2651
    iget v0, p1, Ll/᩷۫ۧ;->ܽ:I

    iget v1, p1, Ll/᩷۫ۧ;->ᩳ:I

    const/4 v2, -0x1

    const/high16 v3, -0x80000000

    const/4 v4, 0x0

    if-ne p2, v2, :cond_1

    .line 2519
    iget p2, p1, Ll/᩷۫ۧ;->ۧ:I

    if-eq p2, v3, :cond_0

    goto :goto_0

    .line 2505
    :cond_0
    iget-object p2, p1, Ll/᩷۫ۧ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    .line 2655
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Ll/ܽ۫ۧ;

    .line 2507
    iget-object v3, p1, Ll/᩷۫ۧ;->ܳ:Ll/ۢ۫ۧ;

    iget-object v3, v3, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v3, p2}, Ll/ۖۗۧ;->ᩳ(Landroid/view/View;)I

    move-result p2

    iput p2, p1, Ll/᩷۫ۧ;->ۧ:I

    .line 2508
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2523
    iget p2, p1, Ll/᩷۫ۧ;->ۧ:I

    :goto_0
    add-int/2addr p2, v0

    if-gt p2, p3, :cond_3

    .line 1806
    iget-object p1, p0, Ll/ۢ۫ۧ;->ۘ:Ljava/util/BitSet;

    invoke-virtual {p1, v1, v4}, Ljava/util/BitSet;->set(IZ)V

    return-void

    .line 2553
    :cond_1
    iget p2, p1, Ll/᩷۫ۧ;->֫:I

    if-eq p2, v3, :cond_2

    goto :goto_1

    .line 2556
    :cond_2
    invoke-virtual {p1}, Ll/᩷۫ۧ;->֫()V

    .line 2557
    iget p2, p1, Ll/᩷۫ۧ;->֫:I

    :goto_1
    sub-int/2addr p2, v0

    if-lt p2, p3, :cond_3

    .line 1811
    iget-object p1, p0, Ll/ۢ۫ۧ;->ۘ:Ljava/util/BitSet;

    invoke-virtual {p1, v1, v4}, Ljava/util/BitSet;->set(IZ)V

    :cond_3
    return-void
.end method

.method private ۧ(I)I
    .locals 3

    .line 1828
    iget-object v0, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Ll/᩷۫ۧ;->ۧ(I)I

    move-result v0

    const/4 v1, 0x1

    .line 1829
    :goto_0
    iget v2, p0, Ll/ۢ۫ۧ;->۠:I

    if-ge v1, v2, :cond_1

    .line 1830
    iget-object v2, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1}, Ll/᩷۫ۧ;->ۧ(I)I

    move-result v2

    if-ge v2, v0, :cond_0

    move v0, v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method private ۧ(ILl/᩸۬ۧ;)V
    .locals 4

    .line 1422
    iget-object v0, p0, Ll/ۢ۫ۧ;->ܳ:Ll/ۧۗۧ;

    const/4 v1, 0x0

    iput v1, v0, Ll/ۧۗۧ;->֫:I

    .line 1423
    iput p1, v0, Ll/ۧۗۧ;->ۧ:I

    .line 1426
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->isSmoothScrolling()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    .line 13522
    iget p2, p2, Ll/᩸۬ۧ;->ۖ:I

    const/4 v2, -0x1

    if-eq p2, v2, :cond_2

    .line 1429
    iget-boolean v2, p0, Ll/ۢ۫ۧ;->֡:Z

    if-ge p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-ne v2, p1, :cond_1

    .line 1430
    iget-object p1, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {p1}, Ll/ۖۗۧ;->᩻()I

    move-result p1

    goto :goto_1

    .line 1432
    :cond_1
    iget-object p1, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {p1}, Ll/ۖۗۧ;->᩻()I

    move-result p1

    const/4 p2, 0x0

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_1
    const/4 p2, 0x0

    move p2, p1

    const/4 p1, 0x0

    .line 1438
    :goto_2
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getClipToPadding()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1440
    iget-object v2, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v2}, Ll/ۖۗۧ;->ܳ()I

    move-result v2

    sub-int/2addr v2, p1

    iput v2, v0, Ll/ۧۗۧ;->ۜ:I

    .line 1441
    iget-object p1, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {p1}, Ll/ۖۗۧ;->ۧ()I

    move-result p1

    add-int/2addr p1, p2

    iput p1, v0, Ll/ۧۗۧ;->ܽ:I

    goto :goto_3

    .line 1443
    :cond_3
    iget-object v2, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v2}, Ll/ۖۗۧ;->֫()I

    move-result v2

    add-int/2addr v2, p2

    iput v2, v0, Ll/ۧۗۧ;->ܽ:I

    neg-int p1, p1

    .line 1444
    iput p1, v0, Ll/ۧۗۧ;->ۜ:I

    .line 1446
    :goto_3
    iput-boolean v1, v0, Ll/ۧۗۧ;->᩷:Z

    .line 1447
    iput-boolean v3, v0, Ll/ۧۗۧ;->᩻:Z

    .line 1448
    iget-object p1, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {p1}, Ll/ۖۗۧ;->ᩳ()I

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    .line 1449
    invoke-virtual {p1}, Ll/ۖۗۧ;->֫()I

    move-result p1

    if-nez p1, :cond_4

    const/4 v1, 0x1

    :cond_4
    iput-boolean v1, v0, Ll/ۧۗۧ;->ᩳ:Z

    return-void
.end method

.method private ۧ(Ll/ۖ۬ۧ;I)V
    .locals 6

    .line 1881
    :goto_0
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    if-lez v0, :cond_4

    const/4 v0, 0x0

    .line 1882
    invoke-virtual {p0, v0}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 1883
    iget-object v2, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v2, v1}, Ll/ۖۗۧ;->֫(Landroid/view/View;)I

    move-result v2

    if-gt v2, p2, :cond_4

    iget-object v2, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    .line 1884
    invoke-virtual {v2, v1}, Ll/ۖۗۧ;->ܿ(Landroid/view/View;)I

    move-result v2

    if-gt v2, p2, :cond_4

    .line 1885
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Ll/ܽ۫ۧ;

    .line 1887
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1897
    iget-object v3, v2, Ll/ܽ۫ۧ;->ܿ:Ll/᩷۫ۧ;

    iget-object v3, v3, Ll/᩷۫ۧ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    goto :goto_1

    .line 1900
    :cond_0
    iget-object v2, v2, Ll/ܽ۫ۧ;->ܿ:Ll/᩷۫ۧ;

    .line 2638
    iget-object v3, v2, Ll/᩷۫ۧ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 2655
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Ll/ܽ۫ۧ;

    const/4 v5, 0x0

    .line 2640
    iput-object v5, v4, Ll/ܽ۫ۧ;->ܿ:Ll/᩷۫ۧ;

    .line 2641
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/high16 v5, -0x80000000

    if-nez v3, :cond_1

    .line 2642
    iput v5, v2, Ll/᩷۫ۧ;->֫:I

    .line 12576
    :cond_1
    iget-object v3, v4, Ll/ܳ۬ۧ;->ᩳ:Ll/ۗ۬ۧ;

    invoke-virtual {v3}, Ll/ۗ۬ۧ;->isRemoved()Z

    move-result v3

    if-nez v3, :cond_2

    .line 12587
    iget-object v3, v4, Ll/ܳ۬ۧ;->ᩳ:Ll/ۗ۬ۧ;

    invoke-virtual {v3}, Ll/ۗ۬ۧ;->isUpdated()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 2645
    :cond_2
    iget v3, v2, Ll/᩷۫ۧ;->ܽ:I

    iget-object v4, v2, Ll/᩷۫ۧ;->ܳ:Ll/ۢ۫ۧ;

    iget-object v4, v4, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v4, v0}, Ll/ۖۗۧ;->ۧ(Landroid/view/View;)I

    move-result v0

    sub-int/2addr v3, v0

    iput v3, v2, Ll/᩷۫ۧ;->ܽ:I

    .line 2647
    :cond_3
    iput v5, v2, Ll/᩷۫ۧ;->ۧ:I

    .line 1902
    invoke-virtual {p0, v1, p1}, Ll/ܿ۬ۧ;->removeAndRecycleView(Landroid/view/View;Ll/ۖ۬ۧ;)V

    goto :goto_0

    :cond_4
    :goto_1
    return-void
.end method

.method private ۧ(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;Z)V
    .locals 2

    const v0, 0x7fffffff

    .line 1404
    invoke-direct {p0, v0}, Ll/ۢ۫ۧ;->ۧ(I)I

    move-result v1

    if-ne v1, v0, :cond_0

    goto :goto_0

    .line 1408
    :cond_0
    iget-object v0, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v0}, Ll/ۖۗۧ;->ܳ()I

    move-result v0

    sub-int/2addr v1, v0

    if-lez v1, :cond_1

    .line 1411
    invoke-virtual {p0, v1, p1, p2}, Ll/ۢ۫ۧ;->scrollBy(ILl/ۖ۬ۧ;Ll/᩸۬ۧ;)I

    move-result p1

    sub-int/2addr v1, p1

    if-eqz p3, :cond_1

    if-lez v1, :cond_1

    .line 1417
    iget-object p1, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    neg-int p2, v1

    invoke-virtual {p1, p2}, Ll/ۖۗۧ;->֫(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method private ܽ(III)V
    .locals 9

    .line 1505
    iget-boolean v0, p0, Ll/ۢ۫ۧ;->֡:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ۢ۫ۧ;->ܽ()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ll/ۢ۫ۧ;->ۧ()I

    move-result v0

    :goto_0
    const/16 v1, 0x8

    if-ne p3, v1, :cond_2

    if-ge p1, p2, :cond_1

    add-int/lit8 v2, p2, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, p1, 0x1

    move v3, p2

    goto :goto_2

    :cond_2
    add-int v2, p1, p2

    :goto_1
    move v3, p1

    .line 2838
    :goto_2
    iget-object v4, p0, Ll/ۢ۫ۧ;->᩻:Ll/ܳ۫ۧ;

    iget-object v5, v4, Ll/ܳ۫ۧ;->֫:[I

    if-nez v5, :cond_3

    goto/16 :goto_9

    .line 2841
    :cond_3
    array-length v5, v5

    if-lt v3, v5, :cond_4

    goto/16 :goto_9

    .line 2957
    :cond_4
    iget-object v5, v4, Ll/ܳ۫ۧ;->ۧ:Ljava/util/ArrayList;

    const/4 v6, -0x1

    if-nez v5, :cond_5

    goto :goto_7

    :cond_5
    if-nez v5, :cond_6

    goto :goto_3

    .line 3009
    :cond_6
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    :cond_7
    add-int/lit8 v5, v5, -0x1

    if-ltz v5, :cond_8

    .line 3010
    iget-object v7, v4, Ll/ܳ۫ۧ;->ۧ:Ljava/util/ArrayList;

    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܿ۫ۧ;

    .line 3011
    iget v8, v7, Ll/ܿ۫ۧ;->ۙ:I

    if-ne v8, v3, :cond_7

    goto :goto_4

    :cond_8
    :goto_3
    const/4 v7, 0x0

    :goto_4
    if-eqz v7, :cond_9

    .line 2963
    iget-object v5, v4, Ll/ܳ۫ۧ;->ۧ:Ljava/util/ArrayList;

    invoke-interface {v5, v7}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 2966
    :cond_9
    iget-object v5, v4, Ll/ܳ۫ۧ;->ۧ:Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    const/4 v7, 0x0

    :goto_5
    if-ge v7, v5, :cond_b

    .line 2968
    iget-object v8, v4, Ll/ܳ۫ۧ;->ۧ:Ljava/util/ArrayList;

    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܿ۫ۧ;

    .line 2969
    iget v8, v8, Ll/ܿ۫ۧ;->ۙ:I

    if-lt v8, v3, :cond_a

    goto :goto_6

    :cond_a
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    :cond_b
    const/4 v7, -0x1

    :goto_6
    if-eq v7, v6, :cond_c

    .line 2975
    iget-object v5, v4, Ll/ܳ۫ۧ;->ۧ:Ljava/util/ArrayList;

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ܿ۫ۧ;

    .line 2976
    iget-object v8, v4, Ll/ܳ۫ۧ;->ۧ:Ljava/util/ArrayList;

    invoke-interface {v8, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2977
    iget v5, v5, Ll/ܿ۫ۧ;->ۙ:I

    goto :goto_8

    :cond_c
    :goto_7
    const/4 v5, -0x1

    :goto_8
    if-ne v5, v6, :cond_d

    .line 2846
    iget-object v5, v4, Ll/ܳ۫ۧ;->֫:[I

    array-length v7, v5

    invoke-static {v5, v3, v7, v6}, Ljava/util/Arrays;->fill([IIII)V

    .line 2847
    iget-object v5, v4, Ll/ܳ۫ۧ;->֫:[I

    array-length v5, v5

    goto :goto_9

    :cond_d
    add-int/lit8 v5, v5, 0x1

    .line 2851
    iget-object v7, v4, Ll/ܳ۫ۧ;->֫:[I

    array-length v7, v7

    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    move-result v5

    .line 2852
    iget-object v7, v4, Ll/ܳ۫ۧ;->֫:[I

    invoke-static {v7, v3, v5, v6}, Ljava/util/Arrays;->fill([IIII)V

    :goto_9
    const/4 v5, 0x1

    if-eq p3, v5, :cond_10

    const/4 v6, 0x2

    if-eq p3, v6, :cond_f

    if-eq p3, v1, :cond_e

    goto :goto_a

    .line 1532
    :cond_e
    invoke-virtual {v4, p1, v5}, Ll/ܳ۫ۧ;->ۧ(II)V

    .line 1533
    invoke-virtual {v4, p2, v5}, Ll/ܳ۫ۧ;->֫(II)V

    goto :goto_a

    .line 1528
    :cond_f
    invoke-virtual {v4, p1, p2}, Ll/ܳ۫ۧ;->ۧ(II)V

    goto :goto_a

    .line 1525
    :cond_10
    invoke-virtual {v4, p1, p2}, Ll/ܳ۫ۧ;->֫(II)V

    :goto_a
    if-gt v2, v0, :cond_11

    goto :goto_c

    .line 1541
    :cond_11
    iget-boolean p1, p0, Ll/ۢ۫ۧ;->֡:Z

    if-eqz p1, :cond_12

    invoke-virtual {p0}, Ll/ۢ۫ۧ;->ۧ()I

    move-result p1

    goto :goto_b

    :cond_12
    invoke-virtual {p0}, Ll/ۢ۫ۧ;->ܽ()I

    move-result p1

    :goto_b
    if-gt v3, p1, :cond_13

    .line 1543
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->requestLayout()V

    :cond_13
    :goto_c
    return-void
.end method

.method private ܽ(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;Z)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 620
    iget-object v3, v0, Ll/ۢ۫ۧ;->᩷:Ll/ۜ۫ۧ;

    const/4 v4, -0x1

    iget-object v5, v0, Ll/ۢ۫ۧ;->֫:Ll/ۧ۫ۧ;

    if-nez v3, :cond_0

    iget v3, v0, Ll/ۢ۫ۧ;->ۢ:I

    if-eq v3, v4, :cond_1

    .line 621
    :cond_0
    invoke-virtual/range {p2 .. p2}, Ll/᩸۬ۧ;->֫()I

    move-result v3

    if-nez v3, :cond_1

    .line 622
    invoke-virtual/range {p0 .. p1}, Ll/ܿ۬ۧ;->removeAndRecycleAllViews(Ll/ۖ۬ۧ;)V

    .line 623
    invoke-virtual {v5}, Ll/ۧ۫ۧ;->֫()V

    return-void

    .line 628
    :cond_1
    iget-boolean v3, v5, Ll/ۧ۫ۧ;->ܳ:Z

    iget-object v6, v5, Ll/ۧ۫ۧ;->᩻:Ll/ۢ۫ۧ;

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v3, :cond_3

    iget v3, v0, Ll/ۢ۫ۧ;->ۢ:I

    if-ne v3, v4, :cond_3

    iget-object v3, v0, Ll/ۢ۫ۧ;->᩷:Ll/ۜ۫ۧ;

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    goto :goto_1

    :cond_3
    :goto_0
    const/4 v3, 0x1

    .line 630
    :goto_1
    iget-object v9, v0, Ll/ۢ۫ۧ;->᩻:Ll/ܳ۫ۧ;

    const/high16 v10, -0x80000000

    if-eqz v3, :cond_25

    .line 631
    invoke-virtual {v5}, Ll/ۧ۫ۧ;->֫()V

    .line 632
    iget-object v11, v0, Ll/ۢ۫ۧ;->᩷:Ll/ۜ۫ۧ;

    if-eqz v11, :cond_a

    .line 794
    iget v12, v11, Ll/ۜ۫ۧ;->ۛ:I

    const/4 v13, 0x0

    if-lez v12, :cond_7

    .line 795
    iget v14, v0, Ll/ۢ۫ۧ;->۠:I

    if-ne v12, v14, :cond_6

    const/4 v11, 0x0

    .line 796
    :goto_2
    iget v12, v0, Ll/ۢ۫ۧ;->۠:I

    if-ge v11, v12, :cond_7

    .line 797
    iget-object v12, v0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v12, v12, v11

    invoke-virtual {v12}, Ll/᩷۫ۧ;->ۧ()V

    .line 798
    iget-object v12, v0, Ll/ۢ۫ۧ;->᩷:Ll/ۜ۫ۧ;

    iget-object v14, v12, Ll/ۜ۫ۧ;->ۤ:[I

    aget v14, v14, v11

    if-eq v14, v10, :cond_5

    .line 800
    iget-boolean v12, v12, Ll/ۜ۫ۧ;->᩸:Z

    if-eqz v12, :cond_4

    .line 801
    iget-object v12, v0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v12}, Ll/ۖۗۧ;->ۧ()I

    move-result v12

    goto :goto_3

    .line 803
    :cond_4
    iget-object v12, v0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v12}, Ll/ۖۗۧ;->ܳ()I

    move-result v12

    :goto_3
    add-int/2addr v14, v12

    .line 806
    :cond_5
    iget-object v12, v0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v12, v12, v11

    .line 2620
    iput v14, v12, Ll/᩷۫ۧ;->ۧ:I

    iput v14, v12, Ll/᩷۫ۧ;->֫:I

    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 3178
    :cond_6
    iput-object v13, v11, Ll/ۜ۫ۧ;->ۤ:[I

    .line 3179
    iput v7, v11, Ll/ۜ۫ۧ;->ۛ:I

    .line 3180
    iput v7, v11, Ll/ۜ۫ۧ;->۫:I

    .line 3181
    iput-object v13, v11, Ll/ۜ۫ۧ;->۬:[I

    .line 3182
    iput-object v13, v11, Ll/ۜ۫ۧ;->᩶:Ljava/util/ArrayList;

    .line 810
    iget v12, v11, Ll/ۜ۫ۧ;->ۨ:I

    iput v12, v11, Ll/ۜ۫ۧ;->᩹:I

    .line 813
    :cond_7
    iget-object v11, v0, Ll/ۢ۫ۧ;->᩷:Ll/ۜ۫ۧ;

    iget-boolean v12, v11, Ll/ۜ۫ۧ;->ۙ:Z

    iput-boolean v12, v0, Ll/ۢ۫ۧ;->ܿ:Z

    .line 814
    iget-boolean v11, v11, Ll/ۜ۫ۧ;->ۗ:Z

    .line 476
    invoke-virtual {v0, v13}, Ll/ۢ۫ۧ;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 477
    iget-object v12, v0, Ll/ۢ۫ۧ;->᩷:Ll/ۜ۫ۧ;

    if-eqz v12, :cond_8

    iget-boolean v13, v12, Ll/ۜ۫ۧ;->ۗ:Z

    if-eq v13, v11, :cond_8

    .line 478
    iput-boolean v11, v12, Ll/ۜ۫ۧ;->ۗ:Z

    .line 480
    :cond_8
    iput-boolean v11, v0, Ll/ۢ۫ۧ;->ᩴ:Z

    .line 481
    invoke-virtual/range {p0 .. p0}, Ll/ܿ۬ۧ;->requestLayout()V

    .line 815
    invoke-direct/range {p0 .. p0}, Ll/ۢ۫ۧ;->ܿ()V

    .line 817
    iget-object v11, v0, Ll/ۢ۫ۧ;->᩷:Ll/ۜ۫ۧ;

    iget v12, v11, Ll/ۜ۫ۧ;->᩹:I

    if-eq v12, v4, :cond_9

    .line 818
    iput v12, v0, Ll/ۢ۫ۧ;->ۢ:I

    .line 819
    iget-boolean v12, v11, Ll/ۜ۫ۧ;->᩸:Z

    iput-boolean v12, v5, Ll/ۧ۫ۧ;->ۧ:Z

    goto :goto_4

    .line 821
    :cond_9
    iget-boolean v12, v0, Ll/ۢ۫ۧ;->֡:Z

    iput-boolean v12, v5, Ll/ۧ۫ۧ;->ۧ:Z

    .line 823
    :goto_4
    iget v12, v11, Ll/ۜ۫ۧ;->۫:I

    if-le v12, v8, :cond_b

    .line 824
    iget-object v12, v11, Ll/ۜ۫ۧ;->۬:[I

    iput-object v12, v9, Ll/ܳ۫ۧ;->֫:[I

    .line 825
    iget-object v11, v11, Ll/ۜ۫ۧ;->᩶:Ljava/util/ArrayList;

    iput-object v11, v9, Ll/ܳ۫ۧ;->ۧ:Ljava/util/ArrayList;

    goto :goto_5

    .line 635
    :cond_a
    invoke-direct/range {p0 .. p0}, Ll/ۢ۫ۧ;->ܿ()V

    .line 636
    iget-boolean v11, v0, Ll/ۢ۫ۧ;->֡:Z

    iput-boolean v11, v5, Ll/ۧ۫ۧ;->ۧ:Z

    .line 13444
    :cond_b
    :goto_5
    iget-boolean v11, v2, Ll/᩸۬ۧ;->ܿ:Z

    if-nez v11, :cond_20

    .line 857
    iget v11, v0, Ll/ۢ۫ۧ;->ۢ:I

    if-ne v11, v4, :cond_c

    goto/16 :goto_f

    :cond_c
    if-ltz v11, :cond_1f

    .line 861
    invoke-virtual/range {p2 .. p2}, Ll/᩸۬ۧ;->֫()I

    move-result v12

    if-lt v11, v12, :cond_d

    goto/16 :goto_e

    .line 867
    :cond_d
    iget-object v11, v0, Ll/ۢ۫ۧ;->᩷:Ll/ۜ۫ۧ;

    if-eqz v11, :cond_f

    iget v12, v11, Ll/ۜ۫ۧ;->᩹:I

    if-eq v12, v4, :cond_f

    iget v11, v11, Ll/ۜ۫ۧ;->ۛ:I

    if-ge v11, v8, :cond_e

    goto :goto_6

    .line 928
    :cond_e
    iput v10, v5, Ll/ۧ۫ۧ;->ܽ:I

    .line 929
    iget v11, v0, Ll/ۢ۫ۧ;->ۢ:I

    iput v11, v5, Ll/ۧ۫ۧ;->ᩳ:I

    goto/16 :goto_13

    .line 870
    :cond_f
    :goto_6
    iget v11, v0, Ll/ۢ۫ۧ;->ۢ:I

    invoke-virtual {v0, v11}, Ll/ܿ۬ۧ;->findViewByPosition(I)Landroid/view/View;

    move-result-object v11

    if-eqz v11, :cond_17

    .line 874
    iget-boolean v12, v0, Ll/ۢ۫ۧ;->֡:Z

    if-eqz v12, :cond_10

    invoke-virtual/range {p0 .. p0}, Ll/ۢ۫ۧ;->ܽ()I

    move-result v12

    goto :goto_7

    .line 875
    :cond_10
    invoke-virtual/range {p0 .. p0}, Ll/ۢ۫ۧ;->ۧ()I

    move-result v12

    :goto_7
    iput v12, v5, Ll/ۧ۫ۧ;->ᩳ:I

    .line 876
    iget v12, v0, Ll/ۢ۫ۧ;->ۡ:I

    if-eq v12, v10, :cond_12

    .line 877
    iget-boolean v12, v5, Ll/ۧ۫ۧ;->ۧ:Z

    if-eqz v12, :cond_11

    .line 878
    iget-object v12, v0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v12}, Ll/ۖۗۧ;->ۧ()I

    move-result v12

    iget v13, v0, Ll/ۢ۫ۧ;->ۡ:I

    sub-int/2addr v12, v13

    .line 880
    iget-object v13, v0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v13, v11}, Ll/ۖۗۧ;->֫(Landroid/view/View;)I

    move-result v11

    sub-int/2addr v12, v11

    iput v12, v5, Ll/ۧ۫ۧ;->ܽ:I

    goto/16 :goto_13

    .line 882
    :cond_11
    iget-object v12, v0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v12}, Ll/ۖۗۧ;->ܳ()I

    move-result v12

    iget v13, v0, Ll/ۢ۫ۧ;->ۡ:I

    add-int/2addr v12, v13

    .line 884
    iget-object v13, v0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v13, v11}, Ll/ۖۗۧ;->ᩳ(Landroid/view/View;)I

    move-result v11

    sub-int/2addr v12, v11

    iput v12, v5, Ll/ۧ۫ۧ;->ܽ:I

    goto/16 :goto_13

    .line 890
    :cond_12
    iget-object v12, v0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v12, v11}, Ll/ۖۗۧ;->ۧ(Landroid/view/View;)I

    move-result v12

    .line 891
    iget-object v13, v0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v13}, Ll/ۖۗۧ;->᩻()I

    move-result v13

    if-le v12, v13, :cond_14

    .line 893
    iget-boolean v11, v5, Ll/ۧ۫ۧ;->ۧ:Z

    if-eqz v11, :cond_13

    .line 894
    iget-object v11, v0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v11}, Ll/ۖۗۧ;->ۧ()I

    move-result v11

    goto :goto_8

    .line 895
    :cond_13
    iget-object v11, v0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v11}, Ll/ۖۗۧ;->ܳ()I

    move-result v11

    :goto_8
    iput v11, v5, Ll/ۧ۫ۧ;->ܽ:I

    goto/16 :goto_13

    .line 899
    :cond_14
    iget-object v12, v0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v12, v11}, Ll/ۖۗۧ;->ᩳ(Landroid/view/View;)I

    move-result v12

    iget-object v13, v0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    .line 900
    invoke-virtual {v13}, Ll/ۖۗۧ;->ܳ()I

    move-result v13

    sub-int/2addr v12, v13

    if-gez v12, :cond_15

    neg-int v11, v12

    .line 902
    iput v11, v5, Ll/ۧ۫ۧ;->ܽ:I

    goto/16 :goto_13

    .line 905
    :cond_15
    iget-object v12, v0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v12}, Ll/ۖۗۧ;->ۧ()I

    move-result v12

    iget-object v13, v0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    .line 906
    invoke-virtual {v13, v11}, Ll/ۖۗۧ;->֫(Landroid/view/View;)I

    move-result v11

    sub-int/2addr v12, v11

    if-gez v12, :cond_16

    .line 908
    iput v12, v5, Ll/ۧ۫ۧ;->ܽ:I

    goto/16 :goto_13

    .line 912
    :cond_16
    iput v10, v5, Ll/ۧ۫ۧ;->ܽ:I

    goto/16 :goto_13

    .line 916
    :cond_17
    iget v11, v0, Ll/ۢ۫ۧ;->ۢ:I

    iput v11, v5, Ll/ۧ۫ۧ;->ᩳ:I

    .line 917
    iget v12, v0, Ll/ۢ۫ۧ;->ۡ:I

    if-ne v12, v10, :cond_1d

    .line 2017
    invoke-virtual/range {p0 .. p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v12

    if-nez v12, :cond_18

    .line 2018
    iget-boolean v11, v0, Ll/ۢ۫ۧ;->֡:Z

    if-eqz v11, :cond_1a

    goto :goto_a

    .line 2020
    :cond_18
    invoke-virtual/range {p0 .. p0}, Ll/ۢ۫ۧ;->ۧ()I

    move-result v12

    if-ge v11, v12, :cond_19

    const/4 v11, 0x1

    goto :goto_9

    :cond_19
    const/4 v11, 0x0

    .line 2021
    :goto_9
    iget-boolean v12, v0, Ll/ۢ۫ۧ;->֡:Z

    if-eq v11, v12, :cond_1b

    :cond_1a
    const/4 v11, 0x0

    goto :goto_b

    :cond_1b
    :goto_a
    const/4 v11, 0x1

    .line 920
    :goto_b
    iput-boolean v11, v5, Ll/ۧ۫ۧ;->ۧ:Z

    if-eqz v11, :cond_1c

    .line 3270
    iget-object v11, v6, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v11}, Ll/ۖۗۧ;->ۧ()I

    move-result v11

    goto :goto_c

    .line 3271
    :cond_1c
    iget-object v11, v6, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v11}, Ll/ۖۗۧ;->ܳ()I

    move-result v11

    :goto_c
    iput v11, v5, Ll/ۧ۫ۧ;->ܽ:I

    goto :goto_d

    .line 3275
    :cond_1d
    iget-boolean v11, v5, Ll/ۧ۫ۧ;->ۧ:Z

    if-eqz v11, :cond_1e

    .line 3276
    iget-object v11, v6, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v11}, Ll/ۖۗۧ;->ۧ()I

    move-result v11

    sub-int/2addr v11, v12

    iput v11, v5, Ll/ۧ۫ۧ;->ܽ:I

    goto :goto_d

    .line 3278
    :cond_1e
    iget-object v11, v6, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v11}, Ll/ۖۗۧ;->ܳ()I

    move-result v11

    add-int/2addr v11, v12

    iput v11, v5, Ll/ۧ۫ۧ;->ܽ:I

    .line 925
    :goto_d
    iput-boolean v8, v5, Ll/ۧ۫ۧ;->֫:Z

    goto :goto_13

    .line 862
    :cond_1f
    :goto_e
    iput v4, v0, Ll/ۢ۫ۧ;->ۢ:I

    .line 863
    iput v10, v0, Ll/ۢ۫ۧ;->ۡ:I

    .line 848
    :cond_20
    :goto_f
    iget-boolean v11, v0, Ll/ۢ۫ۧ;->ᩳ:Z

    if-eqz v11, :cond_22

    .line 849
    invoke-virtual/range {p2 .. p2}, Ll/᩸۬ۧ;->֫()I

    move-result v11

    .line 2209
    invoke-virtual/range {p0 .. p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v12

    sub-int/2addr v12, v8

    :goto_10
    if-ltz v12, :cond_24

    .line 2210
    invoke-virtual {v0, v12}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    .line 2211
    invoke-virtual {v0, v13}, Ll/ܿ۬ۧ;->getPosition(Landroid/view/View;)I

    move-result v13

    if-ltz v13, :cond_21

    if-ge v13, v11, :cond_21

    goto :goto_12

    :cond_21
    add-int/lit8 v12, v12, -0x1

    goto :goto_10

    .line 850
    :cond_22
    invoke-virtual/range {p2 .. p2}, Ll/᩸۬ۧ;->֫()I

    move-result v11

    .line 2192
    invoke-virtual/range {p0 .. p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v12

    const/4 v13, 0x0

    :goto_11
    if-ge v13, v12, :cond_24

    .line 2194
    invoke-virtual {v0, v13}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v14

    .line 2195
    invoke-virtual {v0, v14}, Ll/ܿ۬ۧ;->getPosition(Landroid/view/View;)I

    move-result v14

    if-ltz v14, :cond_23

    if-ge v14, v11, :cond_23

    move v13, v14

    goto :goto_12

    :cond_23
    add-int/lit8 v13, v13, 0x1

    goto :goto_11

    :cond_24
    const/4 v13, 0x0

    .line 850
    :goto_12
    iput v13, v5, Ll/ۧ۫ۧ;->ᩳ:I

    .line 851
    iput v10, v5, Ll/ۧ۫ۧ;->ܽ:I

    .line 639
    :goto_13
    iput-boolean v8, v5, Ll/ۧ۫ۧ;->ܳ:Z

    .line 641
    :cond_25
    iget-object v11, v0, Ll/ۢ۫ۧ;->᩷:Ll/ۜ۫ۧ;

    if-nez v11, :cond_27

    iget v11, v0, Ll/ۢ۫ۧ;->ۢ:I

    if-ne v11, v4, :cond_27

    .line 642
    iget-boolean v11, v5, Ll/ۧ۫ۧ;->ۧ:Z

    iget-boolean v12, v0, Ll/ۢ۫ۧ;->ᩳ:Z

    if-ne v11, v12, :cond_26

    .line 643
    invoke-virtual/range {p0 .. p0}, Ll/ۢ۫ۧ;->isLayoutRTL()Z

    move-result v11

    iget-boolean v12, v0, Ll/ۢ۫ۧ;->ܿ:Z

    if-eq v11, v12, :cond_27

    .line 644
    :cond_26
    invoke-virtual {v9}, Ll/ܳ۫ۧ;->֫()V

    .line 645
    iput-boolean v8, v5, Ll/ۧ۫ۧ;->֫:Z

    .line 649
    :cond_27
    invoke-virtual/range {p0 .. p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v9

    if-lez v9, :cond_36

    iget-object v9, v0, Ll/ۢ۫ۧ;->᩷:Ll/ۜ۫ۧ;

    if-eqz v9, :cond_28

    iget v9, v9, Ll/ۜ۫ۧ;->ۛ:I

    if-ge v9, v8, :cond_36

    .line 651
    :cond_28
    iget-boolean v9, v5, Ll/ۧ۫ۧ;->֫:Z

    if-eqz v9, :cond_2a

    const/4 v3, 0x0

    .line 652
    :goto_14
    iget v6, v0, Ll/ۢ۫ۧ;->۠:I

    if-ge v3, v6, :cond_36

    .line 654
    iget-object v6, v0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v6, v6, v3

    invoke-virtual {v6}, Ll/᩷۫ۧ;->ۧ()V

    .line 655
    iget v6, v5, Ll/ۧ۫ۧ;->ܽ:I

    if-eq v6, v10, :cond_29

    .line 656
    iget-object v9, v0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v9, v9, v3

    .line 2620
    iput v6, v9, Ll/᩷۫ۧ;->ۧ:I

    iput v6, v9, Ll/᩷۫ۧ;->֫:I

    :cond_29
    add-int/lit8 v3, v3, 0x1

    goto :goto_14

    :cond_2a
    if-nez v3, :cond_2c

    .line 660
    iget-object v3, v5, Ll/ۧ۫ۧ;->ܿ:[I

    if-nez v3, :cond_2b

    goto :goto_16

    :cond_2b
    const/4 v3, 0x0

    .line 667
    :goto_15
    iget v6, v0, Ll/ۢ۫ۧ;->۠:I

    if-ge v3, v6, :cond_36

    .line 668
    iget-object v6, v0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v6, v6, v3

    .line 669
    invoke-virtual {v6}, Ll/᩷۫ۧ;->ۧ()V

    .line 670
    iget-object v9, v5, Ll/ۧ۫ۧ;->ܿ:[I

    aget v9, v9, v3

    .line 2620
    iput v9, v6, Ll/᩷۫ۧ;->ۧ:I

    iput v9, v6, Ll/᩷۫ۧ;->֫:I

    add-int/lit8 v3, v3, 0x1

    goto :goto_15

    :cond_2c
    :goto_16
    const/4 v3, 0x0

    .line 661
    :goto_17
    iget v9, v0, Ll/ۢ۫ۧ;->۠:I

    if-ge v3, v9, :cond_33

    .line 662
    iget-object v9, v0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v9, v9, v3

    iget-boolean v11, v0, Ll/ۢ۫ۧ;->֡:Z

    iget v12, v5, Ll/ۧ۫ۧ;->ܽ:I

    .line 2589
    iget-object v13, v9, Ll/᩷۫ۧ;->ܳ:Ll/ۢ۫ۧ;

    if-eqz v11, :cond_2d

    .line 2590
    invoke-virtual {v9, v10}, Ll/᩷۫ۧ;->֫(I)I

    move-result v14

    goto :goto_18

    .line 2592
    :cond_2d
    invoke-virtual {v9, v10}, Ll/᩷۫ۧ;->ۧ(I)I

    move-result v14

    .line 2594
    :goto_18
    invoke-virtual {v9}, Ll/᩷۫ۧ;->ۧ()V

    if-ne v14, v10, :cond_2e

    goto :goto_19

    :cond_2e
    if-eqz v11, :cond_2f

    .line 2598
    iget-object v15, v13, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v15}, Ll/ۖۗۧ;->ۧ()I

    move-result v15

    if-lt v14, v15, :cond_32

    :cond_2f
    if-nez v11, :cond_30

    iget-object v11, v13, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    .line 2599
    invoke-virtual {v11}, Ll/ۖۗۧ;->ܳ()I

    move-result v11

    if-le v14, v11, :cond_30

    goto :goto_19

    :cond_30
    if-eq v12, v10, :cond_31

    add-int/2addr v14, v12

    .line 2605
    :cond_31
    iput v14, v9, Ll/᩷۫ۧ;->֫:I

    iput v14, v9, Ll/᩷۫ۧ;->ۧ:I

    :cond_32
    :goto_19
    add-int/lit8 v3, v3, 0x1

    goto :goto_17

    .line 3259
    :cond_33
    iget-object v3, v0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    array-length v9, v3

    .line 3260
    iget-object v11, v5, Ll/ۧ۫ۧ;->ܿ:[I

    if-eqz v11, :cond_34

    array-length v11, v11

    if-ge v11, v9, :cond_35

    .line 3261
    :cond_34
    iget-object v6, v6, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    array-length v6, v6

    new-array v6, v6, [I

    iput-object v6, v5, Ll/ۧ۫ۧ;->ܿ:[I

    :cond_35
    const/4 v6, 0x0

    :goto_1a
    if-ge v6, v9, :cond_36

    .line 3265
    iget-object v11, v5, Ll/ۧ۫ۧ;->ܿ:[I

    aget-object v12, v3, v6

    invoke-virtual {v12, v10}, Ll/᩷۫ۧ;->ۧ(I)I

    move-result v12

    aput v12, v11, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_1a

    .line 675
    :cond_36
    invoke-virtual/range {p0 .. p1}, Ll/ܿ۬ۧ;->detachAndScrapAttachedViews(Ll/ۖ۬ۧ;)V

    .line 676
    iget-object v3, v0, Ll/ۢ۫ۧ;->ܳ:Ll/ۧۗۧ;

    iput-boolean v7, v3, Ll/ۧۗۧ;->᩻:Z

    .line 678
    iget-object v6, v0, Ll/ۢ۫ۧ;->᩵:Ll/ۖۗۧ;

    invoke-virtual {v6}, Ll/ۖۗۧ;->᩻()I

    move-result v6

    .line 935
    iget v9, v0, Ll/ۢ۫ۧ;->۠:I

    div-int v9, v6, v9

    iput v9, v0, Ll/ۢ۫ۧ;->ۚ:I

    .line 937
    iget-object v9, v0, Ll/ۢ۫ۧ;->᩵:Ll/ۖۗۧ;

    .line 938
    invoke-virtual {v9}, Ll/ۖۗۧ;->ᩳ()I

    move-result v9

    .line 937
    invoke-static {v6, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 679
    iget v6, v5, Ll/ۧ۫ۧ;->ᩳ:I

    invoke-direct {v0, v6, v2}, Ll/ۢ۫ۧ;->ۧ(ILl/᩸۬ۧ;)V

    .line 680
    iget-boolean v6, v5, Ll/ۧ۫ۧ;->ۧ:Z

    if-eqz v6, :cond_37

    .line 682
    invoke-direct {v0, v4}, Ll/ۢ۫ۧ;->ᩳ(I)V

    .line 683
    invoke-direct {v0, v1, v3, v2}, Ll/ۢ۫ۧ;->֫(Ll/ۖ۬ۧ;Ll/ۧۗۧ;Ll/᩸۬ۧ;)I

    .line 685
    invoke-direct {v0, v8}, Ll/ۢ۫ۧ;->ᩳ(I)V

    .line 686
    iget v4, v5, Ll/ۧ۫ۧ;->ᩳ:I

    iget v6, v3, Ll/ۧۗۧ;->ܿ:I

    add-int/2addr v4, v6

    iput v4, v3, Ll/ۧۗۧ;->ۧ:I

    .line 687
    invoke-direct {v0, v1, v3, v2}, Ll/ۢ۫ۧ;->֫(Ll/ۖ۬ۧ;Ll/ۧۗۧ;Ll/᩸۬ۧ;)I

    goto :goto_1b

    .line 690
    :cond_37
    invoke-direct {v0, v8}, Ll/ۢ۫ۧ;->ᩳ(I)V

    .line 691
    invoke-direct {v0, v1, v3, v2}, Ll/ۢ۫ۧ;->֫(Ll/ۖ۬ۧ;Ll/ۧۗۧ;Ll/᩸۬ۧ;)I

    .line 693
    invoke-direct {v0, v4}, Ll/ۢ۫ۧ;->ᩳ(I)V

    .line 694
    iget v4, v5, Ll/ۧ۫ۧ;->ᩳ:I

    iget v6, v3, Ll/ۧۗۧ;->ܿ:I

    add-int/2addr v4, v6

    iput v4, v3, Ll/ۧۗۧ;->ۧ:I

    .line 695
    invoke-direct {v0, v1, v3, v2}, Ll/ۢ۫ۧ;->֫(Ll/ۖ۬ۧ;Ll/ۧۗۧ;Ll/᩸۬ۧ;)I

    .line 742
    :goto_1b
    iget-object v3, v0, Ll/ۢ۫ۧ;->᩵:Ll/ۖۗۧ;

    invoke-virtual {v3}, Ll/ۖۗۧ;->ᩳ()I

    move-result v3

    const/high16 v4, 0x40000000    # 2.0f

    if-ne v3, v4, :cond_38

    goto/16 :goto_20

    .line 746
    :cond_38
    invoke-virtual/range {p0 .. p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v3

    const/4 v4, 0x0

    const/4 v6, 0x0

    :goto_1c
    if-ge v6, v3, :cond_3a

    .line 748
    invoke-virtual {v0, v6}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    .line 749
    iget-object v11, v0, Ll/ۢ۫ۧ;->᩵:Ll/ۖۗۧ;

    invoke-virtual {v11, v9}, Ll/ۖۗۧ;->ۧ(Landroid/view/View;)I

    move-result v11

    int-to-float v11, v11

    cmpg-float v12, v11, v4

    if-gez v12, :cond_39

    goto :goto_1d

    .line 753
    :cond_39
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Ll/ܽ۫ۧ;

    .line 754
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 757
    invoke-static {v4, v11}, Ljava/lang/Math;->max(FF)F

    move-result v4

    :goto_1d
    add-int/lit8 v6, v6, 0x1

    goto :goto_1c

    .line 759
    :cond_3a
    iget v6, v0, Ll/ۢ۫ۧ;->ۚ:I

    .line 760
    iget v9, v0, Ll/ۢ۫ۧ;->۠:I

    int-to-float v9, v9

    mul-float v4, v4, v9

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 761
    iget-object v9, v0, Ll/ۢ۫ۧ;->᩵:Ll/ۖۗۧ;

    invoke-virtual {v9}, Ll/ۖۗۧ;->ᩳ()I

    move-result v9

    if-ne v9, v10, :cond_3b

    .line 762
    iget-object v9, v0, Ll/ۢ۫ۧ;->᩵:Ll/ۖۗۧ;

    invoke-virtual {v9}, Ll/ۖۗۧ;->᩻()I

    move-result v9

    invoke-static {v4, v9}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 935
    :cond_3b
    iget v9, v0, Ll/ۢ۫ۧ;->۠:I

    div-int v9, v4, v9

    iput v9, v0, Ll/ۢ۫ۧ;->ۚ:I

    .line 937
    iget-object v9, v0, Ll/ۢ۫ۧ;->᩵:Ll/ۖۗۧ;

    .line 938
    invoke-virtual {v9}, Ll/ۖۗۧ;->ᩳ()I

    move-result v9

    .line 937
    invoke-static {v4, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 765
    iget v4, v0, Ll/ۢ۫ۧ;->ۚ:I

    if-ne v4, v6, :cond_3c

    goto :goto_20

    :cond_3c
    const/4 v4, 0x0

    :goto_1e
    if-ge v4, v3, :cond_3f

    .line 769
    invoke-virtual {v0, v4}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    .line 770
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    check-cast v10, Ll/ܽ۫ۧ;

    .line 771
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 774
    invoke-virtual/range {p0 .. p0}, Ll/ۢ۫ۧ;->isLayoutRTL()Z

    move-result v11

    if-eqz v11, :cond_3d

    iget v11, v0, Ll/ۢ۫ۧ;->ۜ:I

    if-ne v11, v8, :cond_3d

    .line 775
    iget v11, v0, Ll/ۢ۫ۧ;->۠:I

    sub-int/2addr v11, v8

    iget-object v10, v10, Ll/ܽ۫ۧ;->ܿ:Ll/᩷۫ۧ;

    iget v10, v10, Ll/᩷۫ۧ;->ᩳ:I

    sub-int/2addr v11, v10

    neg-int v10, v11

    iget v11, v0, Ll/ۢ۫ۧ;->ۚ:I

    mul-int v11, v11, v10

    mul-int v10, v10, v6

    sub-int/2addr v11, v10

    .line 777
    invoke-virtual {v9, v11}, Landroid/view/View;->offsetLeftAndRight(I)V

    goto :goto_1f

    .line 779
    :cond_3d
    iget-object v10, v10, Ll/ܽ۫ۧ;->ܿ:Ll/᩷۫ۧ;

    iget v10, v10, Ll/᩷۫ۧ;->ᩳ:I

    iget v11, v0, Ll/ۢ۫ۧ;->ۚ:I

    mul-int v11, v11, v10

    mul-int v10, v10, v6

    .line 781
    iget v12, v0, Ll/ۢ۫ۧ;->ۜ:I

    if-ne v12, v8, :cond_3e

    sub-int/2addr v11, v10

    .line 782
    invoke-virtual {v9, v11}, Landroid/view/View;->offsetLeftAndRight(I)V

    goto :goto_1f

    :cond_3e
    sub-int/2addr v11, v10

    .line 784
    invoke-virtual {v9, v11}, Landroid/view/View;->offsetTopAndBottom(I)V

    :goto_1f
    add-int/lit8 v4, v4, 0x1

    goto :goto_1e

    .line 700
    :cond_3f
    :goto_20
    invoke-virtual/range {p0 .. p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v3

    if-lez v3, :cond_41

    .line 701
    iget-boolean v3, v0, Ll/ۢ۫ۧ;->֡:Z

    if-eqz v3, :cond_40

    .line 702
    invoke-direct {v0, v1, v2, v8}, Ll/ۢ۫ۧ;->֫(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;Z)V

    .line 703
    invoke-direct {v0, v1, v2, v7}, Ll/ۢ۫ۧ;->ۧ(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;Z)V

    goto :goto_21

    .line 705
    :cond_40
    invoke-direct {v0, v1, v2, v8}, Ll/ۢ۫ۧ;->ۧ(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;Z)V

    .line 706
    invoke-direct {v0, v1, v2, v7}, Ll/ۢ۫ۧ;->֫(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;Z)V

    :cond_41
    :goto_21
    if-eqz p3, :cond_42

    .line 13444
    iget-boolean v3, v2, Ll/᩸۬ۧ;->ܿ:Z

    if-nez v3, :cond_42

    .line 711
    iget v3, v0, Ll/ۢ۫ۧ;->ܽ:I

    if-eqz v3, :cond_42

    .line 712
    invoke-virtual/range {p0 .. p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v3

    if-lez v3, :cond_42

    .line 713
    invoke-virtual/range {p0 .. p0}, Ll/ۢ۫ۧ;->ᩳ()Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_42

    .line 715
    iget-object v3, v0, Ll/ۢ۫ۧ;->ۧ:Ljava/lang/Runnable;

    invoke-virtual {v0, v3}, Ll/ܿ۬ۧ;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 716
    invoke-virtual/range {p0 .. p0}, Ll/ۢ۫ۧ;->֫()Z

    move-result v3

    if-eqz v3, :cond_42

    goto :goto_22

    :cond_42
    const/4 v8, 0x0

    .line 13444
    :goto_22
    iget-boolean v3, v2, Ll/᩸۬ۧ;->ܿ:Z

    if-eqz v3, :cond_43

    .line 722
    invoke-virtual {v5}, Ll/ۧ۫ۧ;->֫()V

    .line 724
    :cond_43
    iget-boolean v3, v5, Ll/ۧ۫ۧ;->ۧ:Z

    iput-boolean v3, v0, Ll/ۢ۫ۧ;->ᩳ:Z

    .line 725
    invoke-virtual/range {p0 .. p0}, Ll/ۢ۫ۧ;->isLayoutRTL()Z

    move-result v3

    iput-boolean v3, v0, Ll/ۢ۫ۧ;->ܿ:Z

    if-eqz v8, :cond_44

    .line 727
    invoke-virtual {v5}, Ll/ۧ۫ۧ;->֫()V

    .line 728
    invoke-direct {v0, v1, v2, v7}, Ll/ۢ۫ۧ;->ܽ(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;Z)V

    :cond_44
    return-void
.end method

.method private ܽ(I)Z
    .locals 4

    .line 1944
    iget v0, p0, Ll/ۢ۫ۧ;->ۜ:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_2

    if-ne p1, v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 1945
    :goto_0
    iget-boolean v0, p0, Ll/ۢ۫ۧ;->֡:Z

    if-eq p1, v0, :cond_1

    return v3

    :cond_1
    return v2

    :cond_2
    if-ne p1, v1, :cond_3

    const/4 p1, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    .line 1947
    :goto_1
    iget-boolean v0, p0, Ll/ۢ۫ۧ;->֡:Z

    if-ne p1, v0, :cond_4

    const/4 p1, 0x1

    goto :goto_2

    :cond_4
    const/4 p1, 0x0

    :goto_2
    invoke-virtual {p0}, Ll/ۢ۫ۧ;->isLayoutRTL()Z

    move-result v0

    if-ne p1, v0, :cond_5

    return v3

    :cond_5
    return v2
.end method

.method private ܿ()V
    .locals 2

    .line 559
    iget v0, p0, Ll/ۢ۫ۧ;->ۜ:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Ll/ۢ۫ۧ;->isLayoutRTL()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 562
    :cond_0
    iget-boolean v0, p0, Ll/ۢ۫ۧ;->ᩴ:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p0, Ll/ۢ۫ۧ;->֡:Z

    return-void

    .line 560
    :cond_1
    :goto_0
    iget-boolean v0, p0, Ll/ۢ۫ۧ;->ᩴ:Z

    iput-boolean v0, p0, Ll/ۢ۫ۧ;->֡:Z

    return-void
.end method

.method public static ᩳ(III)I
    .locals 2

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    goto :goto_0

    .line 1220
    :cond_0
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_2

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    return p0

    .line 1223
    :cond_2
    :goto_1
    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p0

    sub-int/2addr p0, p1

    sub-int/2addr p0, p2

    const/4 p1, 0x0

    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    .line 1222
    invoke-static {p0, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    return p0
.end method

.method private ᩳ(I)V
    .locals 4

    .line 1453
    iget-object v0, p0, Ll/ۢ۫ۧ;->ܳ:Ll/ۧۗۧ;

    iput p1, v0, Ll/ۧۗۧ;->ܳ:I

    .line 1454
    iget-boolean v1, p0, Ll/ۢ۫ۧ;->֡:Z

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-ne p1, v3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-ne v1, p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, -0x1

    .line 1455
    :goto_1
    iput v2, v0, Ll/ۧۗۧ;->ܿ:I

    return-void
.end method


# virtual methods
.method public final assertNotInLayoutOrScroll(Ljava/lang/String;)V
    .locals 1

    .line 527
    iget-object v0, p0, Ll/ۢ۫ۧ;->᩷:Ll/ۜ۫ۧ;

    if-nez v0, :cond_0

    .line 528
    invoke-super {p0, p1}, Ll/ܿ۬ۧ;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final canScrollHorizontally()Z
    .locals 1

    .line 2001
    iget v0, p0, Ll/ۢ۫ۧ;->ۜ:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final canScrollVertically()Z
    .locals 2

    .line 1996
    iget v0, p0, Ll/ۢ۫ۧ;->ۜ:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final checkLayoutParams(Ll/ܳ۬ۧ;)Z
    .locals 0

    .line 2247
    instance-of p1, p1, Ll/ܽ۫ۧ;

    return p1
.end method

.method public final collectAdjacentPrefetchPositions(IILl/᩸۬ۧ;Ll/ܽ۬ۧ;)V
    .locals 4

    .line 2097
    iget v0, p0, Ll/ۢ۫ۧ;->ۜ:I

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move p1, p2

    .line 2098
    :goto_0
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result p2

    if-eqz p2, :cond_7

    if-nez p1, :cond_1

    goto :goto_4

    .line 2102
    :cond_1
    invoke-virtual {p0, p1, p3}, Ll/ۢ۫ۧ;->֫(ILl/᩸۬ۧ;)V

    .line 2105
    iget-object p1, p0, Ll/ۢ۫ۧ;->ܺ:[I

    if-eqz p1, :cond_2

    array-length p1, p1

    iget p2, p0, Ll/ۢ۫ۧ;->۠:I

    if-ge p1, p2, :cond_3

    .line 2106
    :cond_2
    iget p1, p0, Ll/ۢ۫ۧ;->۠:I

    new-array p1, p1, [I

    iput-object p1, p0, Ll/ۢ۫ۧ;->ܺ:[I

    :cond_3
    const/4 p1, 0x0

    const/4 p2, 0x0

    const/4 v0, 0x0

    .line 2110
    :goto_1
    iget v1, p0, Ll/ۢ۫ۧ;->۠:I

    iget-object v2, p0, Ll/ۢ۫ۧ;->ܳ:Ll/ۧۗۧ;

    if-ge p2, v1, :cond_6

    .line 2112
    iget v1, v2, Ll/ۧۗۧ;->ܿ:I

    const/4 v3, -0x1

    if-ne v1, v3, :cond_4

    .line 2113
    iget v1, v2, Ll/ۧۗۧ;->ۜ:I

    iget-object v2, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v2, v2, p2

    invoke-virtual {v2, v1}, Ll/᩷۫ۧ;->ۧ(I)I

    move-result v2

    goto :goto_2

    .line 2114
    :cond_4
    iget-object v1, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v1, v1, p2

    iget v3, v2, Ll/ۧۗۧ;->ܽ:I

    invoke-virtual {v1, v3}, Ll/᩷۫ۧ;->֫(I)I

    move-result v1

    iget v2, v2, Ll/ۧۗۧ;->ܽ:I

    :goto_2
    sub-int/2addr v1, v2

    if-ltz v1, :cond_5

    .line 2117
    iget-object v2, p0, Ll/ۢ۫ۧ;->ܺ:[I

    aput v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    :cond_5
    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    .line 2121
    :cond_6
    iget-object p2, p0, Ll/ۢ۫ۧ;->ܺ:[I

    invoke-static {p2, p1, v0}, Ljava/util/Arrays;->sort([III)V

    :goto_3
    if-ge p1, v0, :cond_7

    .line 88
    iget p2, v2, Ll/ۧۗۧ;->ۧ:I

    if-ltz p2, :cond_7

    invoke-virtual {p3}, Ll/᩸۬ۧ;->֫()I

    move-result v1

    if-ge p2, v1, :cond_7

    .line 2125
    iget p2, v2, Ll/ۧۗۧ;->ۧ:I

    iget-object v1, p0, Ll/ۢ۫ۧ;->ܺ:[I

    aget v1, v1, p1

    move-object v3, p4

    check-cast v3, Ll/᩵ۙۧ;

    invoke-virtual {v3, p2, v1}, Ll/᩵ۙۧ;->֫(II)V

    .line 2127
    iget p2, v2, Ll/ۧۗۧ;->ۧ:I

    iget v1, v2, Ll/ۧۗۧ;->ܿ:I

    add-int/2addr p2, v1

    iput p2, v2, Ll/ۧۗۧ;->ۧ:I

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_7
    :goto_4
    return-void
.end method

.method public final computeHorizontalScrollExtent(Ll/᩸۬ۧ;)I
    .locals 7

    .line 1100
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1104
    :cond_0
    iget-boolean v0, p0, Ll/ۢ۫ۧ;->֨:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ll/ۢ۫ۧ;->ۧ(Z)Landroid/view/View;

    move-result-object v3

    .line 1105
    invoke-virtual {p0, v0}, Ll/ۢ۫ۧ;->֫(Z)Landroid/view/View;

    move-result-object v4

    iget-boolean v6, p0, Ll/ۢ۫ۧ;->֨:Z

    .line 1103
    iget-object v2, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    move-object v1, p1

    move-object v5, p0

    invoke-static/range {v1 .. v6}, Ll/ۛ۬ۧ;->֫(Ll/᩸۬ۧ;Ll/ۖۗۧ;Landroid/view/View;Landroid/view/View;Ll/ܿ۬ۧ;Z)I

    move-result p1

    return p1
.end method

.method public final computeHorizontalScrollOffset(Ll/᩸۬ۧ;)I
    .locals 0

    .line 1076
    invoke-direct {p0, p1}, Ll/ۢ۫ۧ;->֫(Ll/᩸۬ۧ;)I

    move-result p1

    return p1
.end method

.method public final computeHorizontalScrollRange(Ll/᩸۬ۧ;)I
    .locals 7

    .line 1120
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1124
    :cond_0
    iget-boolean v0, p0, Ll/ۢ۫ۧ;->֨:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ll/ۢ۫ۧ;->ۧ(Z)Landroid/view/View;

    move-result-object v3

    .line 1125
    invoke-virtual {p0, v0}, Ll/ۢ۫ۧ;->֫(Z)Landroid/view/View;

    move-result-object v4

    iget-boolean v6, p0, Ll/ۢ۫ۧ;->֨:Z

    .line 1123
    iget-object v2, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    move-object v1, p1

    move-object v5, p0

    invoke-static/range {v1 .. v6}, Ll/ۛ۬ۧ;->ۧ(Ll/᩸۬ۧ;Ll/ۖۗۧ;Landroid/view/View;Landroid/view/View;Ll/ܿ۬ۧ;Z)I

    move-result p1

    return p1
.end method

.method public final computeScrollVectorForPosition(I)Landroid/graphics/PointF;
    .locals 3

    .line 2017
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    const/4 v1, -0x1

    if-nez v0, :cond_0

    .line 2018
    iget-boolean p1, p0, Ll/ۢ۫ۧ;->֡:Z

    if-eqz p1, :cond_3

    goto :goto_1

    .line 2020
    :cond_0
    invoke-virtual {p0}, Ll/ۢ۫ۧ;->ۧ()I

    move-result v0

    if-ge p1, v0, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 2021
    :goto_0
    iget-boolean v0, p0, Ll/ۢ۫ۧ;->֡:Z

    if-eq p1, v0, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v1, 0x1

    .line 2027
    :cond_3
    :goto_2
    new-instance p1, Landroid/graphics/PointF;

    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    if-nez v1, :cond_4

    const/4 p1, 0x0

    return-object p1

    .line 2031
    :cond_4
    iget v0, p0, Ll/ۢ۫ۧ;->ۜ:I

    const/4 v2, 0x0

    if-nez v0, :cond_5

    int-to-float v0, v1

    .line 2032
    iput v0, p1, Landroid/graphics/PointF;->x:F

    .line 2033
    iput v2, p1, Landroid/graphics/PointF;->y:F

    return-object p1

    .line 2035
    :cond_5
    iput v2, p1, Landroid/graphics/PointF;->x:F

    int-to-float v0, v1

    .line 2036
    iput v0, p1, Landroid/graphics/PointF;->y:F

    return-object p1
.end method

.method public final computeVerticalScrollExtent(Ll/᩸۬ۧ;)I
    .locals 7

    .line 1100
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1104
    :cond_0
    iget-boolean v0, p0, Ll/ۢ۫ۧ;->֨:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ll/ۢ۫ۧ;->ۧ(Z)Landroid/view/View;

    move-result-object v3

    .line 1105
    invoke-virtual {p0, v0}, Ll/ۢ۫ۧ;->֫(Z)Landroid/view/View;

    move-result-object v4

    iget-boolean v6, p0, Ll/ۢ۫ۧ;->֨:Z

    .line 1103
    iget-object v2, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    move-object v1, p1

    move-object v5, p0

    invoke-static/range {v1 .. v6}, Ll/ۛ۬ۧ;->֫(Ll/᩸۬ۧ;Ll/ۖۗۧ;Landroid/view/View;Landroid/view/View;Ll/ܿ۬ۧ;Z)I

    move-result p1

    return p1
.end method

.method public final computeVerticalScrollOffset(Ll/᩸۬ۧ;)I
    .locals 0

    .line 1091
    invoke-direct {p0, p1}, Ll/ۢ۫ۧ;->֫(Ll/᩸۬ۧ;)I

    move-result p1

    return p1
.end method

.method public final computeVerticalScrollRange(Ll/᩸۬ۧ;)I
    .locals 7

    .line 1120
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1124
    :cond_0
    iget-boolean v0, p0, Ll/ۢ۫ۧ;->֨:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ll/ۢ۫ۧ;->ۧ(Z)Landroid/view/View;

    move-result-object v3

    .line 1125
    invoke-virtual {p0, v0}, Ll/ۢ۫ۧ;->֫(Z)Landroid/view/View;

    move-result-object v4

    iget-boolean v6, p0, Ll/ۢ۫ۧ;->֨:Z

    .line 1123
    iget-object v2, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    move-object v1, p1

    move-object v5, p0

    invoke-static/range {v1 .. v6}, Ll/ۛ۬ۧ;->ۧ(Ll/᩸۬ۧ;Ll/ۖۗۧ;Landroid/view/View;Landroid/view/View;Ll/ܿ۬ۧ;Z)I

    move-result p1

    return p1
.end method

.method public final generateDefaultLayoutParams()Ll/ܳ۬ۧ;
    .locals 3

    .line 2222
    iget v0, p0, Ll/ۢ۫ۧ;->ۜ:I

    const/4 v1, -0x1

    const/4 v2, -0x2

    if-nez v0, :cond_0

    .line 2223
    new-instance v0, Ll/ܽ۫ۧ;

    .line 2428
    invoke-direct {v0, v2, v1}, Ll/ܳ۬ۧ;-><init>(II)V

    return-object v0

    .line 2226
    :cond_0
    new-instance v0, Ll/ܽ۫ۧ;

    .line 2428
    invoke-direct {v0, v1, v2}, Ll/ܳ۬ۧ;-><init>(II)V

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/content/Context;Landroid/util/AttributeSet;)Ll/ܳ۬ۧ;
    .locals 1

    .line 2233
    new-instance v0, Ll/ܽ۫ۧ;

    invoke-direct {v0, p1, p2}, Ll/ܽ۫ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Ll/ܳ۬ۧ;
    .locals 1

    .line 2238
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_0

    .line 2239
    new-instance v0, Ll/ܽ۫ۧ;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 2432
    invoke-direct {v0, p1}, Ll/ܳ۬ۧ;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    .line 2241
    :cond_0
    new-instance v0, Ll/ܽ۫ۧ;

    .line 2436
    invoke-direct {v0, p1}, Ll/ܳ۬ۧ;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final isAutoMeasureEnabled()Z
    .locals 1

    .line 253
    iget v0, p0, Ll/ۢ۫ۧ;->ܽ:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isLayoutRTL()Z
    .locals 2

    .line 567
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final offsetChildrenHorizontal(I)V
    .locals 4

    .line 1460
    invoke-super {p0, p1}, Ll/ܿ۬ۧ;->offsetChildrenHorizontal(I)V

    const/4 v0, 0x0

    .line 1461
    :goto_0
    iget v1, p0, Ll/ۢ۫ۧ;->۠:I

    if-ge v0, v1, :cond_2

    .line 1462
    iget-object v1, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v1, v1, v0

    .line 2659
    iget v2, v1, Ll/᩷۫ۧ;->ۧ:I

    const/high16 v3, -0x80000000

    if-eq v2, v3, :cond_0

    add-int/2addr v2, p1

    .line 2660
    iput v2, v1, Ll/᩷۫ۧ;->ۧ:I

    .line 2662
    :cond_0
    iget v2, v1, Ll/᩷۫ۧ;->֫:I

    if-eq v2, v3, :cond_1

    add-int/2addr v2, p1

    .line 2663
    iput v2, v1, Ll/᩷۫ۧ;->֫:I

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final offsetChildrenVertical(I)V
    .locals 4

    .line 1468
    invoke-super {p0, p1}, Ll/ܿ۬ۧ;->offsetChildrenVertical(I)V

    const/4 v0, 0x0

    .line 1469
    :goto_0
    iget v1, p0, Ll/ۢ۫ۧ;->۠:I

    if-ge v0, v1, :cond_2

    .line 1470
    iget-object v1, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v1, v1, v0

    .line 2659
    iget v2, v1, Ll/᩷۫ۧ;->ۧ:I

    const/high16 v3, -0x80000000

    if-eq v2, v3, :cond_0

    add-int/2addr v2, p1

    .line 2660
    iput v2, v1, Ll/᩷۫ۧ;->ۧ:I

    .line 2662
    :cond_0
    iget v2, v1, Ll/᩷۫ۧ;->֫:I

    if-eq v2, v3, :cond_1

    add-int/2addr v2, p1

    .line 2663
    iput v2, v1, Ll/᩷۫ۧ;->֫:I

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final onAdapterChanged(Ll/᩶ۗۧ;Ll/᩶ۗۧ;)V
    .locals 0

    .line 611
    iget-object p1, p0, Ll/ۢ۫ۧ;->᩻:Ll/ܳ۫ۧ;

    invoke-virtual {p1}, Ll/ܳ۫ۧ;->֫()V

    const/4 p1, 0x0

    .line 612
    :goto_0
    iget p2, p0, Ll/ۢ۫ۧ;->۠:I

    if-ge p1, p2, :cond_0

    .line 613
    iget-object p2, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object p2, p2, p1

    invoke-virtual {p2}, Ll/᩷۫ۧ;->ۧ()V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final onDetachedFromWindow(Ll/۬۬ۧ;Ll/ۖ۬ۧ;)V
    .locals 1

    .line 322
    invoke-super {p0, p1, p2}, Ll/ܿ۬ۧ;->onDetachedFromWindow(Ll/۬۬ۧ;Ll/ۖ۬ۧ;)V

    .line 324
    iget-object p2, p0, Ll/ۢ۫ۧ;->ۧ:Ljava/lang/Runnable;

    invoke-virtual {p0, p2}, Ll/ܿ۬ۧ;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 p2, 0x0

    .line 325
    :goto_0
    iget v0, p0, Ll/ۢ۫ۧ;->۠:I

    if-ge p2, v0, :cond_0

    .line 326
    iget-object v0, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v0, v0, p2

    invoke-virtual {v0}, Ll/᩷۫ۧ;->ۧ()V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 329
    :cond_0
    invoke-virtual {p1}, Ll/۬۬ۧ;->requestLayout()V

    return-void
.end method

.method public final onFocusSearchFailed(Landroid/view/View;ILl/ۖ۬ۧ;Ll/᩸۬ۧ;)Landroid/view/View;
    .locals 8

    .line 2258
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 2262
    :cond_0
    invoke-virtual {p0, p1}, Ll/ܿ۬ۧ;->findContainingItemView(Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v1

    .line 2267
    :cond_1
    invoke-direct {p0}, Ll/ۢ۫ۧ;->ܿ()V

    const/high16 v0, -0x80000000

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-eq p2, v3, :cond_9

    const/4 v4, 0x2

    if-eq p2, v4, :cond_7

    const/16 v4, 0x11

    if-eq p2, v4, :cond_5

    const/16 v4, 0x21

    if-eq p2, v4, :cond_4

    const/16 v4, 0x42

    if-eq p2, v4, :cond_3

    const/16 v4, 0x82

    if-eq p2, v4, :cond_2

    goto :goto_0

    .line 2387
    :cond_2
    iget p2, p0, Ll/ۢ۫ۧ;->ۜ:I

    if-ne p2, v3, :cond_6

    goto :goto_1

    .line 2393
    :cond_3
    iget p2, p0, Ll/ۢ۫ۧ;->ۜ:I

    if-nez p2, :cond_6

    goto :goto_1

    .line 2384
    :cond_4
    iget p2, p0, Ll/ۢ۫ۧ;->ۜ:I

    if-ne p2, v3, :cond_6

    goto :goto_2

    .line 2390
    :cond_5
    iget p2, p0, Ll/ۢ۫ۧ;->ۜ:I

    if-nez p2, :cond_6

    goto :goto_2

    :cond_6
    :goto_0
    const/high16 p2, -0x80000000

    goto :goto_3

    .line 2376
    :cond_7
    iget p2, p0, Ll/ۢ۫ۧ;->ۜ:I

    if-ne p2, v3, :cond_8

    goto :goto_1

    .line 2378
    :cond_8
    invoke-virtual {p0}, Ll/ۢ۫ۧ;->isLayoutRTL()Z

    move-result p2

    if-eqz p2, :cond_b

    goto :goto_2

    .line 2368
    :cond_9
    iget p2, p0, Ll/ۢ۫ۧ;->ۜ:I

    if-ne p2, v3, :cond_a

    goto :goto_2

    .line 2370
    :cond_a
    invoke-virtual {p0}, Ll/ۢ۫ۧ;->isLayoutRTL()Z

    move-result p2

    if-eqz p2, :cond_c

    :cond_b
    :goto_1
    const/4 p2, 0x1

    goto :goto_3

    :cond_c
    :goto_2
    const/4 p2, -0x1

    :goto_3
    if-ne p2, v0, :cond_d

    return-object v1

    .line 2272
    :cond_d
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܽ۫ۧ;

    .line 2273
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2274
    iget-object v0, v0, Ll/ܽ۫ۧ;->ܿ:Ll/᩷۫ۧ;

    if-ne p2, v3, :cond_e

    .line 2277
    invoke-virtual {p0}, Ll/ۢ۫ۧ;->ܽ()I

    move-result v4

    goto :goto_4

    .line 2279
    :cond_e
    invoke-virtual {p0}, Ll/ۢ۫ۧ;->ۧ()I

    move-result v4

    .line 2281
    :goto_4
    invoke-direct {p0, v4, p4}, Ll/ۢ۫ۧ;->ۧ(ILl/᩸۬ۧ;)V

    .line 2282
    invoke-direct {p0, p2}, Ll/ۢ۫ۧ;->ᩳ(I)V

    .line 2284
    iget-object v5, p0, Ll/ۢ۫ۧ;->ܳ:Ll/ۧۗۧ;

    iget v6, v5, Ll/ۧۗۧ;->ܿ:I

    add-int/2addr v6, v4

    iput v6, v5, Ll/ۧۗۧ;->ۧ:I

    .line 2285
    iget-object v6, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v6}, Ll/ۖۗۧ;->᩻()I

    move-result v6

    int-to-float v6, v6

    const v7, 0x3eaaaaab

    mul-float v6, v6, v7

    float-to-int v6, v6

    iput v6, v5, Ll/ۧۗۧ;->֫:I

    .line 2286
    iput-boolean v3, v5, Ll/ۧۗۧ;->᩷:Z

    const/4 v6, 0x0

    .line 2287
    iput-boolean v6, v5, Ll/ۧۗۧ;->᩻:Z

    .line 2288
    invoke-direct {p0, p3, v5, p4}, Ll/ۢ۫ۧ;->֫(Ll/ۖ۬ۧ;Ll/ۧۗۧ;Ll/᩸۬ۧ;)I

    .line 2289
    iget-boolean p3, p0, Ll/ۢ۫ۧ;->֡:Z

    iput-boolean p3, p0, Ll/ۢ۫ۧ;->ᩳ:Z

    .line 2291
    invoke-virtual {v0, v4, p2}, Ll/᩷۫ۧ;->ۧ(II)Landroid/view/View;

    move-result-object p3

    if-eqz p3, :cond_f

    if-eq p3, p1, :cond_f

    return-object p3

    .line 2299
    :cond_f
    invoke-direct {p0, p2}, Ll/ۢ۫ۧ;->ܽ(I)Z

    move-result p3

    if-eqz p3, :cond_11

    .line 2300
    iget p3, p0, Ll/ۢ۫ۧ;->۠:I

    sub-int/2addr p3, v3

    :goto_5
    if-ltz p3, :cond_13

    .line 2301
    iget-object p4, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object p4, p4, p3

    invoke-virtual {p4, v4, p2}, Ll/᩷۫ۧ;->ۧ(II)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_10

    if-eq p4, p1, :cond_10

    return-object p4

    :cond_10
    add-int/lit8 p3, p3, -0x1

    goto :goto_5

    :cond_11
    const/4 p3, 0x0

    .line 2307
    :goto_6
    iget p4, p0, Ll/ۢ۫ۧ;->۠:I

    if-ge p3, p4, :cond_13

    .line 2308
    iget-object p4, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object p4, p4, p3

    invoke-virtual {p4, v4, p2}, Ll/᩷۫ۧ;->ۧ(II)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_12

    if-eq p4, p1, :cond_12

    return-object p4

    :cond_12
    add-int/lit8 p3, p3, 0x1

    goto :goto_6

    .line 2319
    :cond_13
    iget-boolean p3, p0, Ll/ۢ۫ۧ;->ᩴ:Z

    xor-int/2addr p3, v3

    if-ne p2, v2, :cond_14

    const/4 p4, 0x1

    goto :goto_7

    :cond_14
    const/4 p4, 0x0

    :goto_7
    if-ne p3, p4, :cond_15

    const/4 p3, 0x1

    goto :goto_8

    :cond_15
    const/4 p3, 0x0

    :goto_8
    if-eqz p3, :cond_16

    .line 2323
    invoke-virtual {v0}, Ll/᩷۫ۧ;->ܽ()I

    move-result p4

    goto :goto_9

    .line 2324
    :cond_16
    invoke-virtual {v0}, Ll/᩷۫ۧ;->ᩳ()I

    move-result p4

    .line 2322
    :goto_9
    invoke-virtual {p0, p4}, Ll/ܿ۬ۧ;->findViewByPosition(I)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_17

    if-eq p4, p1, :cond_17

    return-object p4

    .line 2330
    :cond_17
    invoke-direct {p0, p2}, Ll/ۢ۫ۧ;->ܽ(I)Z

    move-result p2

    if-eqz p2, :cond_1b

    .line 2331
    iget p2, p0, Ll/ۢ۫ۧ;->۠:I

    sub-int/2addr p2, v3

    :goto_a
    if-ltz p2, :cond_1e

    .line 2332
    iget p4, v0, Ll/᩷۫ۧ;->ᩳ:I

    if-ne p2, p4, :cond_18

    goto :goto_c

    :cond_18
    if-eqz p3, :cond_19

    .line 2336
    iget-object p4, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object p4, p4, p2

    invoke-virtual {p4}, Ll/᩷۫ۧ;->ܽ()I

    move-result p4

    goto :goto_b

    .line 2337
    :cond_19
    iget-object p4, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object p4, p4, p2

    invoke-virtual {p4}, Ll/᩷۫ۧ;->ᩳ()I

    move-result p4

    .line 2335
    :goto_b
    invoke-virtual {p0, p4}, Ll/ܿ۬ۧ;->findViewByPosition(I)Landroid/view/View;

    move-result-object p4

    if-eqz p4, :cond_1a

    if-eq p4, p1, :cond_1a

    return-object p4

    :cond_1a
    :goto_c
    add-int/lit8 p2, p2, -0x1

    goto :goto_a

    .line 2343
    :cond_1b
    :goto_d
    iget p2, p0, Ll/ۢ۫ۧ;->۠:I

    if-ge v6, p2, :cond_1e

    if-eqz p3, :cond_1c

    .line 2345
    iget-object p2, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object p2, p2, v6

    invoke-virtual {p2}, Ll/᩷۫ۧ;->ܽ()I

    move-result p2

    goto :goto_e

    .line 2346
    :cond_1c
    iget-object p2, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object p2, p2, v6

    invoke-virtual {p2}, Ll/᩷۫ۧ;->ᩳ()I

    move-result p2

    .line 2344
    :goto_e
    invoke-virtual {p0, p2}, Ll/ܿ۬ۧ;->findViewByPosition(I)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_1d

    if-eq p2, p1, :cond_1d

    return-object p2

    :cond_1d
    add-int/lit8 v6, v6, 0x1

    goto :goto_d

    :cond_1e
    return-object v1
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    .line 1294
    invoke-super {p0, p1}, Ll/ܿ۬ۧ;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 1295
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    if-lez v0, :cond_2

    const/4 v0, 0x0

    .line 1296
    invoke-virtual {p0, v0}, Ll/ۢ۫ۧ;->ۧ(Z)Landroid/view/View;

    move-result-object v1

    .line 1297
    invoke-virtual {p0, v0}, Ll/ۢ۫ۧ;->֫(Z)Landroid/view/View;

    move-result-object v0

    if-eqz v1, :cond_2

    if-nez v0, :cond_0

    goto :goto_0

    .line 1301
    :cond_0
    invoke-virtual {p0, v1}, Ll/ܿ۬ۧ;->getPosition(Landroid/view/View;)I

    move-result v1

    .line 1302
    invoke-virtual {p0, v0}, Ll/ܿ۬ۧ;->getPosition(Landroid/view/View;)I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 1304
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 1305
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    return-void

    .line 1307
    :cond_1
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 1308
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final onItemsAdded(Ll/۬۬ۧ;II)V
    .locals 0

    const/4 p1, 0x1

    .line 1481
    invoke-direct {p0, p2, p3, p1}, Ll/ۢ۫ۧ;->ܽ(III)V

    return-void
.end method

.method public final onItemsChanged(Ll/۬۬ۧ;)V
    .locals 0

    .line 1486
    iget-object p1, p0, Ll/ۢ۫ۧ;->᩻:Ll/ܳ۫ۧ;

    invoke-virtual {p1}, Ll/ܳ۫ۧ;->֫()V

    .line 1487
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->requestLayout()V

    return-void
.end method

.method public final onItemsMoved(Ll/۬۬ۧ;III)V
    .locals 0

    const/16 p1, 0x8

    .line 1492
    invoke-direct {p0, p2, p3, p1}, Ll/ۢ۫ۧ;->ܽ(III)V

    return-void
.end method

.method public final onItemsRemoved(Ll/۬۬ۧ;II)V
    .locals 0

    const/4 p1, 0x2

    .line 1476
    invoke-direct {p0, p2, p3, p1}, Ll/ۢ۫ۧ;->ܽ(III)V

    return-void
.end method

.method public final onItemsUpdated(Ll/۬۬ۧ;IILjava/lang/Object;)V
    .locals 0

    const/4 p1, 0x4

    .line 1498
    invoke-direct {p0, p2, p3, p1}, Ll/ۢ۫ۧ;->ܽ(III)V

    return-void
.end method

.method public final onLayoutChildren(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;)V
    .locals 1

    const/4 v0, 0x1

    .line 604
    invoke-direct {p0, p1, p2, v0}, Ll/ۢ۫ۧ;->ܽ(Ll/ۖ۬ۧ;Ll/᩸۬ۧ;Z)V

    return-void
.end method

.method public final onLayoutCompleted(Ll/᩸۬ۧ;)V
    .locals 0

    .line 734
    invoke-super {p0, p1}, Ll/ܿ۬ۧ;->onLayoutCompleted(Ll/᩸۬ۧ;)V

    const/4 p1, -0x1

    .line 735
    iput p1, p0, Ll/ۢ۫ۧ;->ۢ:I

    const/high16 p1, -0x80000000

    .line 736
    iput p1, p0, Ll/ۢ۫ۧ;->ۡ:I

    const/4 p1, 0x0

    .line 737
    iput-object p1, p0, Ll/ۢ۫ۧ;->᩷:Ll/ۜ۫ۧ;

    .line 738
    iget-object p1, p0, Ll/ۢ۫ۧ;->֫:Ll/ۧ۫ۧ;

    invoke-virtual {p1}, Ll/ۧ۫ۧ;->֫()V

    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1230
    instance-of v0, p1, Ll/ۜ۫ۧ;

    if-eqz v0, :cond_1

    .line 1231
    check-cast p1, Ll/ۜ۫ۧ;

    iput-object p1, p0, Ll/ۢ۫ۧ;->᩷:Ll/ۜ۫ۧ;

    .line 1232
    iget v0, p0, Ll/ۢ۫ۧ;->ۢ:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 3188
    iput v1, p1, Ll/ۜ۫ۧ;->᩹:I

    .line 3189
    iput v1, p1, Ll/ۜ۫ۧ;->ۨ:I

    const/4 v0, 0x0

    .line 3178
    iput-object v0, p1, Ll/ۜ۫ۧ;->ۤ:[I

    const/4 v1, 0x0

    .line 3179
    iput v1, p1, Ll/ۜ۫ۧ;->ۛ:I

    .line 3180
    iput v1, p1, Ll/ۜ۫ۧ;->۫:I

    .line 3181
    iput-object v0, p1, Ll/ۜ۫ۧ;->۬:[I

    .line 3182
    iput-object v0, p1, Ll/ۜ۫ۧ;->᩶:Ljava/util/ArrayList;

    .line 1236
    :cond_0
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->requestLayout()V

    :cond_1
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 5

    .line 1244
    iget-object v0, p0, Ll/ۢ۫ۧ;->᩷:Ll/ۜ۫ۧ;

    if-eqz v0, :cond_0

    .line 1245
    new-instance v1, Ll/ۜ۫ۧ;

    .line 3164
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 3165
    iget v2, v0, Ll/ۜ۫ۧ;->ۛ:I

    iput v2, v1, Ll/ۜ۫ۧ;->ۛ:I

    .line 3166
    iget v2, v0, Ll/ۜ۫ۧ;->᩹:I

    iput v2, v1, Ll/ۜ۫ۧ;->᩹:I

    .line 3167
    iget v2, v0, Ll/ۜ۫ۧ;->ۨ:I

    iput v2, v1, Ll/ۜ۫ۧ;->ۨ:I

    .line 3168
    iget-object v2, v0, Ll/ۜ۫ۧ;->ۤ:[I

    iput-object v2, v1, Ll/ۜ۫ۧ;->ۤ:[I

    .line 3169
    iget v2, v0, Ll/ۜ۫ۧ;->۫:I

    iput v2, v1, Ll/ۜ۫ۧ;->۫:I

    .line 3170
    iget-object v2, v0, Ll/ۜ۫ۧ;->۬:[I

    iput-object v2, v1, Ll/ۜ۫ۧ;->۬:[I

    .line 3171
    iget-boolean v2, v0, Ll/ۜ۫ۧ;->ۗ:Z

    iput-boolean v2, v1, Ll/ۜ۫ۧ;->ۗ:Z

    .line 3172
    iget-boolean v2, v0, Ll/ۜ۫ۧ;->᩸:Z

    iput-boolean v2, v1, Ll/ۜ۫ۧ;->᩸:Z

    .line 3173
    iget-boolean v2, v0, Ll/ۜ۫ۧ;->ۙ:Z

    iput-boolean v2, v1, Ll/ۜ۫ۧ;->ۙ:Z

    .line 3174
    iget-object v0, v0, Ll/ۜ۫ۧ;->᩶:Ljava/util/ArrayList;

    iput-object v0, v1, Ll/ۜ۫ۧ;->᩶:Ljava/util/ArrayList;

    return-object v1

    .line 1247
    :cond_0
    new-instance v0, Ll/ۜ۫ۧ;

    .line 3138
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1248
    iget-boolean v1, p0, Ll/ۢ۫ۧ;->ᩴ:Z

    iput-boolean v1, v0, Ll/ۜ۫ۧ;->ۗ:Z

    .line 1249
    iget-boolean v1, p0, Ll/ۢ۫ۧ;->ᩳ:Z

    iput-boolean v1, v0, Ll/ۜ۫ۧ;->᩸:Z

    .line 1250
    iget-boolean v1, p0, Ll/ۢ۫ۧ;->ܿ:Z

    iput-boolean v1, v0, Ll/ۜ۫ۧ;->ۙ:Z

    const/4 v1, 0x0

    .line 1252
    iget-object v2, p0, Ll/ۢ۫ۧ;->᩻:Ll/ܳ۫ۧ;

    if-eqz v2, :cond_1

    iget-object v3, v2, Ll/ܳ۫ۧ;->֫:[I

    if-eqz v3, :cond_1

    .line 1253
    iput-object v3, v0, Ll/ۜ۫ۧ;->۬:[I

    .line 1254
    array-length v3, v3

    iput v3, v0, Ll/ۜ۫ۧ;->۫:I

    .line 1255
    iget-object v2, v2, Ll/ܳ۫ۧ;->ۧ:Ljava/util/ArrayList;

    iput-object v2, v0, Ll/ۜ۫ۧ;->᩶:Ljava/util/ArrayList;

    goto :goto_0

    .line 1257
    :cond_1
    iput v1, v0, Ll/ۜ۫ۧ;->۫:I

    .line 1260
    :goto_0
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v2

    const/4 v3, -0x1

    if-lez v2, :cond_8

    .line 1261
    iget-boolean v2, p0, Ll/ۢ۫ۧ;->ᩳ:Z

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Ll/ۢ۫ۧ;->ܽ()I

    move-result v2

    goto :goto_1

    .line 1262
    :cond_2
    invoke-virtual {p0}, Ll/ۢ۫ۧ;->ۧ()I

    move-result v2

    :goto_1
    iput v2, v0, Ll/ۜ۫ۧ;->᩹:I

    .line 1319
    iget-boolean v2, p0, Ll/ۢ۫ۧ;->֡:Z

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    invoke-virtual {p0, v4}, Ll/ۢ۫ۧ;->֫(Z)Landroid/view/View;

    move-result-object v2

    goto :goto_2

    .line 1320
    :cond_3
    invoke-virtual {p0, v4}, Ll/ۢ۫ۧ;->ۧ(Z)Landroid/view/View;

    move-result-object v2

    :goto_2
    if-nez v2, :cond_4

    goto :goto_3

    .line 1321
    :cond_4
    invoke-virtual {p0, v2}, Ll/ܿ۬ۧ;->getPosition(Landroid/view/View;)I

    move-result v3

    .line 1263
    :goto_3
    iput v3, v0, Ll/ۜ۫ۧ;->ۨ:I

    .line 1264
    iget v2, p0, Ll/ۢ۫ۧ;->۠:I

    iput v2, v0, Ll/ۜ۫ۧ;->ۛ:I

    .line 1265
    new-array v2, v2, [I

    iput-object v2, v0, Ll/ۜ۫ۧ;->ۤ:[I

    .line 1266
    :goto_4
    iget v2, p0, Ll/ۢ۫ۧ;->۠:I

    if-ge v1, v2, :cond_7

    .line 1268
    iget-boolean v2, p0, Ll/ۢ۫ۧ;->ᩳ:Z

    const/high16 v3, -0x80000000

    if-eqz v2, :cond_5

    .line 1269
    iget-object v2, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v2, v2, v1

    invoke-virtual {v2, v3}, Ll/᩷۫ۧ;->֫(I)I

    move-result v2

    if-eq v2, v3, :cond_6

    .line 1271
    iget-object v3, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v3}, Ll/ۖۗۧ;->ۧ()I

    move-result v3

    goto :goto_5

    .line 1274
    :cond_5
    iget-object v2, p0, Ll/ۢ۫ۧ;->ܶ:[Ll/᩷۫ۧ;

    aget-object v2, v2, v1

    invoke-virtual {v2, v3}, Ll/᩷۫ۧ;->ۧ(I)I

    move-result v2

    if-eq v2, v3, :cond_6

    .line 1276
    iget-object v3, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v3}, Ll/ۖۗۧ;->ܳ()I

    move-result v3

    :goto_5
    sub-int/2addr v2, v3

    .line 1279
    :cond_6
    iget-object v3, v0, Ll/ۜ۫ۧ;->ۤ:[I

    aput v2, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_7
    return-object v0

    .line 1282
    :cond_8
    iput v3, v0, Ll/ۜ۫ۧ;->᩹:I

    .line 1283
    iput v3, v0, Ll/ۜ۫ۧ;->ۨ:I

    .line 1284
    iput v1, v0, Ll/ۜ۫ۧ;->ۛ:I

    return-object v0
.end method

.method public final onScrollStateChanged(I)V
    .locals 0

    if-nez p1, :cond_0

    .line 316
    invoke-virtual {p0}, Ll/ۢ۫ۧ;->֫()Z

    :cond_0
    return-void
.end method

.method public final scrollBy(ILl/ۖ۬ۧ;Ll/᩸۬ۧ;)I
    .locals 3

    .line 2149
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    if-nez p1, :cond_0

    goto :goto_1

    .line 2153
    :cond_0
    invoke-virtual {p0, p1, p3}, Ll/ۢ۫ۧ;->֫(ILl/᩸۬ۧ;)V

    .line 2154
    iget-object v0, p0, Ll/ۢ۫ۧ;->ܳ:Ll/ۧۗۧ;

    invoke-direct {p0, p2, v0, p3}, Ll/ۢ۫ۧ;->֫(Ll/ۖ۬ۧ;Ll/ۧۗۧ;Ll/᩸۬ۧ;)I

    move-result p3

    .line 2155
    iget v2, v0, Ll/ۧۗۧ;->֫:I

    if-ge v2, p3, :cond_1

    goto :goto_0

    :cond_1
    if-gez p1, :cond_2

    neg-int p1, p3

    goto :goto_0

    :cond_2
    move p1, p3

    .line 2168
    :goto_0
    iget-object p3, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    neg-int v2, p1

    invoke-virtual {p3, v2}, Ll/ۖۗۧ;->֫(I)V

    .line 2170
    iget-boolean p3, p0, Ll/ۢ۫ۧ;->֡:Z

    iput-boolean p3, p0, Ll/ۢ۫ۧ;->ᩳ:Z

    .line 2171
    iput v1, v0, Ll/ۧۗۧ;->֫:I

    .line 2172
    invoke-direct {p0, p2, v0}, Ll/ۢ۫ۧ;->֫(Ll/ۖ۬ۧ;Ll/ۧۗۧ;)V

    return p1

    :cond_3
    :goto_1
    return v1
.end method

.method public final scrollHorizontallyBy(ILl/ۖ۬ۧ;Ll/᩸۬ۧ;)I
    .locals 0

    .line 2007
    invoke-virtual {p0, p1, p2, p3}, Ll/ۢ۫ۧ;->scrollBy(ILl/ۖ۬ۧ;Ll/᩸۬ۧ;)I

    move-result p1

    return p1
.end method

.method public final scrollToPosition(I)V
    .locals 2

    .line 2051
    iget-object v0, p0, Ll/ۢ۫ۧ;->᩷:Ll/ۜ۫ۧ;

    if-eqz v0, :cond_0

    iget v1, v0, Ll/ۜ۫ۧ;->᩹:I

    if-eq v1, p1, :cond_0

    const/4 v1, 0x0

    .line 3186
    iput-object v1, v0, Ll/ۜ۫ۧ;->ۤ:[I

    const/4 v1, 0x0

    .line 3187
    iput v1, v0, Ll/ۜ۫ۧ;->ۛ:I

    const/4 v1, -0x1

    .line 3188
    iput v1, v0, Ll/ۜ۫ۧ;->᩹:I

    .line 3189
    iput v1, v0, Ll/ۜ۫ۧ;->ۨ:I

    .line 2054
    :cond_0
    iput p1, p0, Ll/ۢ۫ۧ;->ۢ:I

    const/high16 p1, -0x80000000

    .line 2055
    iput p1, p0, Ll/ۢ۫ۧ;->ۡ:I

    .line 2056
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->requestLayout()V

    return-void
.end method

.method public final scrollVerticallyBy(ILl/ۖ۬ۧ;Ll/᩸۬ۧ;)I
    .locals 0

    .line 2013
    invoke-virtual {p0, p1, p2, p3}, Ll/ۢ۫ۧ;->scrollBy(ILl/ۖ۬ۧ;Ll/᩸۬ۧ;)I

    move-result p1

    return p1
.end method

.method public final setMeasuredDimension(Landroid/graphics/Rect;II)V
    .locals 4

    .line 586
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingRight()I

    move-result v1

    add-int/2addr v1, v0

    .line 587
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getPaddingBottom()I

    move-result v2

    add-int/2addr v2, v0

    .line 588
    iget v0, p0, Ll/ۢ۫ۧ;->ۜ:I

    const/4 v3, 0x1

    if-ne v0, v3, :cond_0

    .line 589
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    add-int/2addr p1, v2

    .line 590
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getMinimumHeight()I

    move-result v0

    invoke-static {p3, p1, v0}, Ll/ܿ۬ۧ;->֫(III)I

    move-result p1

    .line 591
    iget p3, p0, Ll/ۢ۫ۧ;->ۚ:I

    iget v0, p0, Ll/ۢ۫ۧ;->۠:I

    mul-int p3, p3, v0

    add-int/2addr p3, v1

    .line 592
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getMinimumWidth()I

    move-result v0

    .line 591
    invoke-static {p2, p3, v0}, Ll/ܿ۬ۧ;->֫(III)I

    move-result p2

    goto :goto_0

    .line 594
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p1

    add-int/2addr p1, v1

    .line 595
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getMinimumWidth()I

    move-result v0

    invoke-static {p2, p1, v0}, Ll/ܿ۬ۧ;->֫(III)I

    move-result p2

    .line 596
    iget p1, p0, Ll/ۢ۫ۧ;->ۚ:I

    iget v0, p0, Ll/ۢ۫ۧ;->۠:I

    mul-int p1, p1, v0

    add-int/2addr p1, v2

    .line 597
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getMinimumHeight()I

    move-result v0

    .line 596
    invoke-static {p3, p1, v0}, Ll/ܿ۬ۧ;->֫(III)I

    move-result p1

    .line 599
    :goto_0
    invoke-virtual {p0, p2, p1}, Ll/ܿ۬ۧ;->setMeasuredDimension(II)V

    return-void
.end method

.method public final smoothScrollToPosition(Ll/۬۬ۧ;Ll/᩸۬ۧ;I)V
    .locals 0

    .line 2044
    new-instance p2, Ll/᩷ۗۧ;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/᩷ۗۧ;-><init>(Landroid/content/Context;)V

    .line 2045
    invoke-virtual {p2, p3}, Ll/ܶ۬ۧ;->setTargetPosition(I)V

    .line 2046
    invoke-virtual {p0, p2}, Ll/ܿ۬ۧ;->startSmoothScroll(Ll/ܶ۬ۧ;)V

    return-void
.end method

.method public final supportsPredictiveItemAnimations()Z
    .locals 1

    .line 943
    iget-object v0, p0, Ll/ۢ۫ۧ;->᩷:Ll/ۜ۫ۧ;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(Z)Landroid/view/View;
    .locals 7

    .line 1361
    iget-object v0, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v0}, Ll/ۖۗۧ;->ܳ()I

    move-result v0

    .line 1362
    iget-object v1, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v1}, Ll/ۖۗۧ;->ۧ()I

    move-result v1

    .line 1364
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x0

    :goto_0
    if-ltz v2, :cond_4

    .line 1365
    invoke-virtual {p0, v2}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 1366
    iget-object v5, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v5, v4}, Ll/ۖۗۧ;->ᩳ(Landroid/view/View;)I

    move-result v5

    .line 1367
    iget-object v6, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v6, v4}, Ll/ۖۗۧ;->֫(Landroid/view/View;)I

    move-result v6

    if-le v6, v0, :cond_3

    if-lt v5, v1, :cond_0

    goto :goto_2

    :cond_0
    if-le v6, v1, :cond_2

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    if-nez v3, :cond_3

    move-object v3, v4

    goto :goto_2

    :cond_2
    :goto_1
    return-object v4

    :cond_3
    :goto_2
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_4
    return-object v3
.end method

.method public final ֫(ILl/᩸۬ۧ;)V
    .locals 4

    const/4 v0, 0x1

    if-lez p1, :cond_0

    .line 2136
    invoke-virtual {p0}, Ll/ۢ۫ۧ;->ܽ()I

    move-result v1

    const/4 v2, 0x1

    goto :goto_0

    .line 2139
    :cond_0
    invoke-virtual {p0}, Ll/ۢ۫ۧ;->ۧ()I

    move-result v1

    const/4 v2, -0x1

    .line 2141
    :goto_0
    iget-object v3, p0, Ll/ۢ۫ۧ;->ܳ:Ll/ۧۗۧ;

    iput-boolean v0, v3, Ll/ۧۗۧ;->᩻:Z

    .line 2142
    invoke-direct {p0, v1, p2}, Ll/ۢ۫ۧ;->ۧ(ILl/᩸۬ۧ;)V

    .line 2143
    invoke-direct {p0, v2}, Ll/ۢ۫ۧ;->ᩳ(I)V

    .line 2144
    iget p2, v3, Ll/ۧۗۧ;->ܿ:I

    add-int/2addr v1, p2

    iput v1, v3, Ll/ۧۗۧ;->ۧ:I

    .line 2145
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    iput p1, v3, Ll/ۧۗۧ;->֫:I

    return-void
.end method

.method public final ֫()Z
    .locals 2

    .line 269
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget v0, p0, Ll/ۢ۫ۧ;->ܽ:I

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Ll/ܿ۬ۧ;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 273
    :cond_0
    iget-boolean v0, p0, Ll/ۢ۫ۧ;->֡:Z

    if-eqz v0, :cond_1

    .line 274
    invoke-virtual {p0}, Ll/ۢ۫ۧ;->ܽ()I

    move-result v0

    .line 275
    invoke-virtual {p0}, Ll/ۢ۫ۧ;->ۧ()I

    goto :goto_0

    .line 277
    :cond_1
    invoke-virtual {p0}, Ll/ۢ۫ۧ;->ۧ()I

    move-result v0

    .line 278
    invoke-virtual {p0}, Ll/ۢ۫ۧ;->ܽ()I

    :goto_0
    if-nez v0, :cond_2

    .line 281
    invoke-virtual {p0}, Ll/ۢ۫ۧ;->ᩳ()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 283
    iget-object v0, p0, Ll/ۢ۫ۧ;->᩻:Ll/ܳ۫ۧ;

    invoke-virtual {v0}, Ll/ܳ۫ۧ;->֫()V

    .line 284
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->requestSimpleAnimationsInNextLayout()V

    .line 285
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->requestLayout()V

    const/4 v0, 0x1

    return v0

    :cond_2
    :goto_1
    return v1
.end method

.method public final ۧ()I
    .locals 2

    .line 2182
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2183
    :cond_0
    invoke-virtual {p0, v1}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܿ۬ۧ;->getPosition(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public final ۧ(Z)Landroid/view/View;
    .locals 8

    .line 1331
    iget-object v0, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v0}, Ll/ۖۗۧ;->ܳ()I

    move-result v0

    .line 1332
    iget-object v1, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v1}, Ll/ۖۗۧ;->ۧ()I

    move-result v1

    .line 1333
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_4

    .line 1336
    invoke-virtual {p0, v4}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 1337
    iget-object v6, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v6, v5}, Ll/ۖۗۧ;->ᩳ(Landroid/view/View;)I

    move-result v6

    .line 1338
    iget-object v7, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v7, v5}, Ll/ۖۗۧ;->֫(Landroid/view/View;)I

    move-result v7

    if-le v7, v0, :cond_3

    if-lt v6, v1, :cond_0

    goto :goto_2

    :cond_0
    if-ge v6, v0, :cond_2

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    if-nez v3, :cond_3

    move-object v3, v5

    goto :goto_2

    :cond_2
    :goto_1
    return-object v5

    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    return-object v3
.end method

.method public final ܽ()I
    .locals 1

    .line 2177
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 2178
    invoke-virtual {p0, v0}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ܿ۬ۧ;->getPosition(Landroid/view/View;)I

    move-result v0

    return v0
.end method

.method public final ᩳ()Landroid/view/View;
    .locals 14

    .line 339
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    .line 340
    new-instance v2, Ljava/util/BitSet;

    iget v3, p0, Ll/ۢ۫ۧ;->۠:I

    invoke-direct {v2, v3}, Ljava/util/BitSet;-><init>(I)V

    .line 341
    iget v3, p0, Ll/ۢ۫ۧ;->۠:I

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-virtual {v2, v4, v3, v5}, Ljava/util/BitSet;->set(IIZ)V

    .line 344
    iget v3, p0, Ll/ۢ۫ۧ;->ۜ:I

    const/4 v6, -0x1

    if-ne v3, v5, :cond_0

    invoke-virtual {p0}, Ll/ۢ۫ۧ;->isLayoutRTL()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, -0x1

    .line 346
    :goto_0
    iget-boolean v7, p0, Ll/ۢ۫ۧ;->֡:Z

    if-eqz v7, :cond_1

    const/4 v0, -0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_2

    const/4 v6, 0x1

    :cond_2
    if-eq v1, v0, :cond_d

    .line 355
    invoke-virtual {p0, v1}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    .line 356
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Ll/ܽ۫ۧ;

    .line 357
    iget-object v9, v8, Ll/ܽ۫ۧ;->ܿ:Ll/᩷۫ۧ;

    iget v9, v9, Ll/᩷۫ۧ;->ᩳ:I

    invoke-virtual {v2, v9}, Ljava/util/BitSet;->get(I)Z

    move-result v9

    if-eqz v9, :cond_7

    .line 358
    iget-object v9, v8, Ll/ܽ۫ۧ;->ܿ:Ll/᩷۫ۧ;

    .line 402
    iget-boolean v10, p0, Ll/ۢ۫ۧ;->֡:Z

    const/high16 v11, -0x80000000

    if-eqz v10, :cond_4

    .line 2553
    iget v10, v9, Ll/᩷۫ۧ;->֫:I

    if-eq v10, v11, :cond_3

    goto :goto_2

    .line 2556
    :cond_3
    invoke-virtual {v9}, Ll/᩷۫ۧ;->֫()V

    .line 2557
    iget v10, v9, Ll/᩷۫ۧ;->֫:I

    .line 403
    :goto_2
    iget-object v11, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v11}, Ll/ۖۗۧ;->ۧ()I

    move-result v11

    if-ge v10, v11, :cond_6

    .line 405
    iget-object v0, v9, Ll/᩷۫ۧ;->ܿ:Ljava/util/ArrayList;

    .line 0
    invoke-static {v0, v5}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    .line 405
    check-cast v0, Landroid/view/View;

    .line 2655
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܽ۫ۧ;

    .line 407
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v7

    .line 2519
    :cond_4
    iget v10, v9, Ll/᩷۫ۧ;->ۧ:I

    iget-object v12, v9, Ll/᩷۫ۧ;->ܿ:Ljava/util/ArrayList;

    if-eq v10, v11, :cond_5

    goto :goto_3

    .line 2505
    :cond_5
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/view/View;

    .line 2655
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Ll/ܽ۫ۧ;

    .line 2507
    iget-object v13, v9, Ll/᩷۫ۧ;->ܳ:Ll/ۢ۫ۧ;

    iget-object v13, v13, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v13, v10}, Ll/ۖۗۧ;->ᩳ(Landroid/view/View;)I

    move-result v10

    iput v10, v9, Ll/᩷۫ۧ;->ۧ:I

    .line 2508
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2523
    iget v10, v9, Ll/᩷۫ۧ;->ۧ:I

    .line 409
    :goto_3
    iget-object v9, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v9}, Ll/ۖۗۧ;->ܳ()I

    move-result v9

    if-le v10, v9, :cond_6

    .line 411
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 2655
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܽ۫ۧ;

    .line 413
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v7

    .line 361
    :cond_6
    iget-object v9, v8, Ll/ܽ۫ۧ;->ܿ:Ll/᩷۫ۧ;

    iget v9, v9, Ll/᩷۫ۧ;->ᩳ:I

    invoke-virtual {v2, v9}, Ljava/util/BitSet;->clear(I)V

    :cond_7
    add-int/2addr v1, v6

    if-eq v1, v0, :cond_2

    .line 368
    invoke-virtual {p0, v1}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v9

    .line 370
    iget-boolean v10, p0, Ll/ۢ۫ۧ;->֡:Z

    if-eqz v10, :cond_9

    .line 372
    iget-object v10, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v10, v7}, Ll/ۖۗۧ;->֫(Landroid/view/View;)I

    move-result v10

    .line 373
    iget-object v11, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v11, v9}, Ll/ۖۗۧ;->֫(Landroid/view/View;)I

    move-result v11

    if-ge v10, v11, :cond_8

    goto :goto_7

    :cond_8
    if-ne v10, v11, :cond_2

    goto :goto_4

    .line 380
    :cond_9
    iget-object v10, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v10, v7}, Ll/ۖۗۧ;->ᩳ(Landroid/view/View;)I

    move-result v10

    .line 381
    iget-object v11, p0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v11, v9}, Ll/ۖۗۧ;->ᩳ(Landroid/view/View;)I

    move-result v11

    if-le v10, v11, :cond_a

    goto :goto_7

    :cond_a
    if-ne v10, v11, :cond_2

    .line 390
    :goto_4
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Ll/ܽ۫ۧ;

    .line 391
    iget-object v8, v8, Ll/ܽ۫ۧ;->ܿ:Ll/᩷۫ۧ;

    iget v8, v8, Ll/᩷۫ۧ;->ᩳ:I

    iget-object v9, v9, Ll/ܽ۫ۧ;->ܿ:Ll/᩷۫ۧ;

    iget v9, v9, Ll/᩷۫ۧ;->ᩳ:I

    sub-int/2addr v8, v9

    if-gez v8, :cond_b

    const/4 v8, 0x1

    goto :goto_5

    :cond_b
    const/4 v8, 0x0

    :goto_5
    if-gez v3, :cond_c

    const/4 v9, 0x1

    goto :goto_6

    :cond_c
    const/4 v9, 0x0

    :goto_6
    if-eq v8, v9, :cond_2

    :goto_7
    return-object v7

    :cond_d
    const/4 v0, 0x0

    return-object v0
.end method
