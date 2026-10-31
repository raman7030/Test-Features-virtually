.class public final Ll/ܿۢ;
.super Ll/ۡۜ;
.source "P55W"


# instance fields
.field public ֫֫:I

.field public final ۜ֫:Ll/ۧۢ;

.field public ۟:Z

.field public ۡ֫:Z

.field public ۢ֫:Z

.field public ۧ֫:I

.field public final ۨ:Landroid/util/SparseBooleanArray;

.field public ܰ:I

.field public ܳ֫:Z

.field public ܺ֫:I

.field public ܽ֫:Ll/۟᩷;

.field public ܿ֫:Landroid/graphics/drawable/Drawable;

.field public ᩳ֫:Ll/֫ۢ;

.field public ᩷֫:Ll/᩺᩷;

.field public ᩺:Ll/ۛ᩷;

.field public ᩻֫:Ll/ۨ᩷;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 87
    invoke-direct {p0, p1}, Ll/ۡۜ;-><init>(Landroid/content/Context;)V

    .line 75
    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Ll/ܿۢ;->ۨ:Landroid/util/SparseBooleanArray;

    .line 83
    new-instance p1, Ll/ۧۢ;

    invoke-direct {p1, p0}, Ll/ۧۢ;-><init>(Ll/ܿۢ;)V

    iput-object p1, p0, Ll/ܿۢ;->ۜ֫:Ll/ۧۢ;

    return-void
.end method

.method public static synthetic ֫(Ll/ܿۢ;)Ll/ۗۜ;
    .locals 0

    .line 54
    iget-object p0, p0, Ll/ۡۜ;->ۗ:Ll/ۗۜ;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/ܿۢ;)Ll/ۗۜ;
    .locals 0

    .line 54
    iget-object p0, p0, Ll/ۡۜ;->ۗ:Ll/ۗۜ;

    return-object p0
.end method

.method public static synthetic ܳ(Ll/ܿۢ;)Ll/ۗۜ;
    .locals 0

    .line 54
    iget-object p0, p0, Ll/ۡۜ;->ۗ:Ll/ۗۜ;

    return-object p0
.end method

.method public static synthetic ܽ(Ll/ܿۢ;)Ll/ۜ᩷;
    .locals 0

    .line 54
    iget-object p0, p0, Ll/ۡۜ;->۫:Ll/ۜ᩷;

    return-object p0
.end method

.method public static synthetic ܿ(Ll/ܿۢ;)Ll/ۗۜ;
    .locals 0

    .line 54
    iget-object p0, p0, Ll/ۡۜ;->ۗ:Ll/ۗۜ;

    return-object p0
.end method

.method public static synthetic ᩳ(Ll/ܿۢ;)Ll/ۗۜ;
    .locals 0

    .line 54
    iget-object p0, p0, Ll/ۡۜ;->ۗ:Ll/ۗۜ;

    return-object p0
.end method

.method public static synthetic ᩻(Ll/ܿۢ;)Ll/ۜ᩷;
    .locals 0

    .line 54
    iget-object p0, p0, Ll/ۡۜ;->۫:Ll/ۜ᩷;

    return-object p0
.end method


# virtual methods
.method public final flagActionItems()Z
    .locals 15

    .line 413
    iget-object v0, p0, Ll/ۡۜ;->ۗ:Ll/ۗۜ;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 414
    invoke-virtual {v0}, Ll/ۗۜ;->getVisibleItems()Ljava/util/ArrayList;

    move-result-object v0

    .line 415
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    move-object v0, v1

    .line 421
    :goto_0
    iget v4, p0, Ll/ܿۢ;->֫֫:I

    .line 422
    iget v5, p0, Ll/ܿۢ;->ܰ:I

    .line 423
    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 424
    iget-object v6, p0, Ll/ۡۜ;->۫:Ll/ۜ᩷;

    check-cast v6, Landroid/view/ViewGroup;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_1
    const/4 v11, 0x1

    if-ge v7, v3, :cond_4

    .line 431
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۛۜ;

    .line 432
    invoke-virtual {v11}, Ll/ۛۜ;->ۧ()Z

    move-result v12

    if-eqz v12, :cond_1

    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    .line 434
    :cond_1
    invoke-virtual {v11}, Ll/ۛۜ;->ۡ()Z

    move-result v12

    if-eqz v12, :cond_2

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_2
    const/4 v8, 0x1

    .line 439
    :goto_2
    iget-boolean v12, p0, Ll/ܿۢ;->۟:Z

    if-eqz v12, :cond_3

    invoke-virtual {v11}, Ll/ۛۜ;->isActionViewExpanded()Z

    move-result v11

    if-eqz v11, :cond_3

    const/4 v4, 0x0

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 447
    :cond_4
    iget-boolean v7, p0, Ll/ܿۢ;->ۢ֫:Z

    if-eqz v7, :cond_6

    if-nez v8, :cond_5

    add-int/2addr v10, v9

    if-le v10, v4, :cond_6

    :cond_5
    add-int/lit8 v4, v4, -0x1

    :cond_6
    sub-int/2addr v4, v9

    .line 454
    iget-object v7, p0, Ll/ܿۢ;->ۨ:Landroid/util/SparseBooleanArray;

    invoke-virtual {v7}, Landroid/util/SparseBooleanArray;->clear()V

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_3
    if-ge v8, v3, :cond_15

    .line 466
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۛۜ;

    .line 468
    invoke-virtual {v10}, Ll/ۛۜ;->ۧ()Z

    move-result v12

    if-eqz v12, :cond_9

    .line 469
    invoke-virtual {p0, v10, v1, v6}, Ll/ܿۢ;->֫(Ll/ۛۜ;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 474
    invoke-virtual {v1, v2, v2}, Landroid/view/View;->measure(II)V

    .line 476
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    sub-int/2addr v5, v1

    if-nez v9, :cond_7

    move v9, v1

    .line 481
    :cond_7
    invoke-virtual {v10}, Ll/ۛۜ;->getGroupId()I

    move-result v1

    if-eqz v1, :cond_8

    .line 483
    invoke-virtual {v7, v1, v11}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 485
    :cond_8
    invoke-virtual {v10, v11}, Ll/ۛۜ;->ᩳ(Z)V

    goto/16 :goto_8

    .line 486
    :cond_9
    invoke-virtual {v10}, Ll/ۛۜ;->ۡ()Z

    move-result v12

    if-eqz v12, :cond_14

    .line 489
    invoke-virtual {v10}, Ll/ۛۜ;->getGroupId()I

    move-result v12

    .line 490
    invoke-virtual {v7, v12}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v13

    if-gtz v4, :cond_a

    if-eqz v13, :cond_b

    :cond_a
    if-lez v5, :cond_b

    const/4 v14, 0x1

    goto :goto_4

    :cond_b
    const/4 v14, 0x0

    :goto_4
    if-eqz v14, :cond_e

    .line 495
    invoke-virtual {p0, v10, v1, v6}, Ll/ܿۢ;->֫(Ll/ۛۜ;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 504
    invoke-virtual {v1, v2, v2}, Landroid/view/View;->measure(II)V

    .line 506
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    sub-int/2addr v5, v1

    if-nez v9, :cond_c

    move v9, v1

    :cond_c
    add-int v1, v5, v9

    if-lez v1, :cond_d

    const/4 v1, 0x1

    goto :goto_5

    :cond_d
    const/4 v1, 0x0

    :goto_5
    and-int/2addr v14, v1

    :cond_e
    if-eqz v14, :cond_f

    if-eqz v12, :cond_f

    .line 521
    invoke-virtual {v7, v12, v11}, Landroid/util/SparseBooleanArray;->put(IZ)V

    goto :goto_7

    :cond_f
    if-eqz v13, :cond_12

    const/4 v1, 0x0

    .line 524
    invoke-virtual {v7, v12, v1}, Landroid/util/SparseBooleanArray;->put(IZ)V

    :goto_6
    if-ge v1, v8, :cond_12

    .line 526
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۛۜ;

    .line 527
    invoke-virtual {v11}, Ll/ۛۜ;->getGroupId()I

    move-result v13

    if-ne v13, v12, :cond_11

    .line 529
    invoke-virtual {v11}, Ll/ۛۜ;->᩷()Z

    move-result v13

    if-eqz v13, :cond_10

    add-int/lit8 v4, v4, 0x1

    :cond_10
    const/4 v13, 0x0

    .line 530
    invoke-virtual {v11, v13}, Ll/ۛۜ;->ᩳ(Z)V

    :cond_11
    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_12
    :goto_7
    if-eqz v14, :cond_13

    add-int/lit8 v4, v4, -0x1

    .line 537
    :cond_13
    invoke-virtual {v10, v14}, Ll/ۛۜ;->ᩳ(Z)V

    goto :goto_8

    :cond_14
    const/4 v1, 0x0

    .line 540
    invoke-virtual {v10, v1}, Ll/ۛۜ;->ᩳ(Z)V

    :goto_8
    add-int/lit8 v8, v8, 0x1

    const/4 v1, 0x0

    const/4 v11, 0x1

    goto/16 :goto_3

    :cond_15
    const/4 v0, 0x1

    return v0
.end method

.method public final initForMenu(Landroid/content/Context;Ll/ۗۜ;)V
    .locals 4

    .line 92
    invoke-super {p0, p1, p2}, Ll/ۡۜ;->initForMenu(Landroid/content/Context;Ll/ۗۜ;)V

    .line 94
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    .line 96
    invoke-static {p1}, Ll/᩶᩻;->֫(Landroid/content/Context;)Ll/᩶᩻;

    move-result-object p1

    .line 97
    iget-boolean v0, p0, Ll/ܿۢ;->ۡ֫:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 98
    iput-boolean v0, p0, Ll/ܿۢ;->ۢ֫:Z

    .line 102
    :cond_0
    invoke-virtual {p1}, Ll/᩶᩻;->ۧ()I

    move-result v0

    iput v0, p0, Ll/ܿۢ;->ܺ֫:I

    .line 107
    invoke-virtual {p1}, Ll/᩶᩻;->ܽ()I

    move-result p1

    iput p1, p0, Ll/ܿۢ;->֫֫:I

    .line 110
    iget p1, p0, Ll/ܿۢ;->ܺ֫:I

    .line 111
    iget-boolean v0, p0, Ll/ܿۢ;->ۢ֫:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 112
    iget-object v0, p0, Ll/ܿۢ;->ܽ֫:Ll/۟᩷;

    if-nez v0, :cond_2

    .line 113
    new-instance v0, Ll/۟᩷;

    iget-object v2, p0, Ll/ۡۜ;->ۤ:Landroid/content/Context;

    invoke-direct {v0, p0, v2}, Ll/۟᩷;-><init>(Ll/ܿۢ;Landroid/content/Context;)V

    iput-object v0, p0, Ll/ܿۢ;->ܽ֫:Ll/۟᩷;

    .line 114
    iget-boolean v2, p0, Ll/ܿۢ;->ܳ֫:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 115
    iget-object v2, p0, Ll/ܿۢ;->ܿ֫:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v2}, Ll/ᩳۡ;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 116
    iput-object v1, p0, Ll/ܿۢ;->ܿ֫:Landroid/graphics/drawable/Drawable;

    .line 117
    iput-boolean v3, p0, Ll/ܿۢ;->ܳ֫:Z

    .line 119
    :cond_1
    invoke-static {v3, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 120
    iget-object v1, p0, Ll/ܿۢ;->ܽ֫:Ll/۟᩷;

    invoke-virtual {v1, v0, v0}, Landroid/view/View;->measure(II)V

    .line 122
    :cond_2
    iget-object v0, p0, Ll/ܿۢ;->ܽ֫:Ll/۟᩷;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    sub-int/2addr p1, v0

    goto :goto_0

    .line 124
    :cond_3
    iput-object v1, p0, Ll/ܿۢ;->ܽ֫:Ll/۟᩷;

    .line 127
    :goto_0
    iput p1, p0, Ll/ܿۢ;->ܰ:I

    .line 129
    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    return-void
.end method

.method public final onCloseMenu(Ll/ۗۜ;Z)V
    .locals 1

    .line 373
    invoke-virtual {p0}, Ll/ܿۢ;->ܽ()Z

    .line 384
    iget-object v0, p0, Ll/ܿۢ;->᩺:Ll/ۛ᩷;

    if-eqz v0, :cond_0

    .line 385
    invoke-virtual {v0}, Ll/ᩳ᩷;->֫()V

    .line 549
    :cond_0
    invoke-super {p0, p1, p2}, Ll/ۡۜ;->onCloseMenu(Ll/ۗۜ;Z)V

    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 561
    instance-of v0, p1, Ll/ᩳۢ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 565
    :cond_0
    check-cast p1, Ll/ᩳۢ;

    .line 566
    iget p1, p1, Ll/ᩳۢ;->᩸:I

    if-lez p1, :cond_1

    .line 567
    iget-object v0, p0, Ll/ۡۜ;->ۗ:Ll/ۗۜ;

    invoke-virtual {v0, p1}, Ll/ۗۜ;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 569
    invoke-interface {p1}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object p1

    check-cast p1, Ll/᩵᩷;

    .line 570
    invoke-virtual {p0, p1}, Ll/ܿۢ;->onSubMenuSelected(Ll/᩵᩷;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 554
    new-instance v0, Ll/ᩳۢ;

    .line 594
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 555
    iget v1, p0, Ll/ܿۢ;->ۧ֫:I

    iput v1, v0, Ll/ᩳۢ;->᩸:I

    return-object v0
.end method

.method public final onSubMenuSelected(Ll/᩵᩷;)Z
    .locals 8

    .line 281
    invoke-virtual {p1}, Ll/ۗۜ;->hasVisibleItems()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    move-object v0, p1

    .line 284
    :goto_0
    invoke-virtual {v0}, Ll/᩵᩷;->getParentMenu()Landroid/view/Menu;

    move-result-object v2

    iget-object v3, p0, Ll/ۡۜ;->ۗ:Ll/ۗۜ;

    if-eq v2, v3, :cond_1

    .line 285
    invoke-virtual {v0}, Ll/᩵᩷;->getParentMenu()Landroid/view/Menu;

    move-result-object v0

    check-cast v0, Ll/᩵᩷;

    goto :goto_0

    .line 287
    :cond_1
    invoke-virtual {v0}, Ll/᩵᩷;->getItem()Landroid/view/MenuItem;

    move-result-object v0

    .line 317
    iget-object v2, p0, Ll/ۡۜ;->۫:Ll/ۜ᩷;

    check-cast v2, Landroid/view/ViewGroup;

    const/4 v3, 0x0

    if-nez v2, :cond_2

    goto :goto_2

    .line 320
    :cond_2
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_4

    .line 322
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 323
    instance-of v7, v6, Ll/᩻᩷;

    if-eqz v7, :cond_3

    move-object v7, v6

    check-cast v7, Ll/᩻᩷;

    .line 324
    invoke-interface {v7}, Ll/᩻᩷;->getItemData()Ll/ۛۜ;

    move-result-object v7

    if-ne v7, v0, :cond_3

    move-object v3, v6

    goto :goto_2

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    if-nez v3, :cond_5

    :goto_3
    return v1

    .line 296
    :cond_5
    invoke-virtual {p1}, Ll/᩵᩷;->getItem()Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    iput v0, p0, Ll/ܿۢ;->ۧ֫:I

    .line 299
    invoke-virtual {p1}, Ll/ۗۜ;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_4
    const/4 v4, 0x1

    if-ge v2, v0, :cond_7

    .line 301
    invoke-virtual {p1, v2}, Ll/ۗۜ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v5

    .line 302
    invoke-interface {v5}, Landroid/view/MenuItem;->isVisible()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v5}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-eqz v5, :cond_6

    const/4 v1, 0x1

    goto :goto_5

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 308
    :cond_7
    :goto_5
    new-instance v0, Ll/ۛ᩷;

    iget-object v2, p0, Ll/ۡۜ;->᩹:Landroid/content/Context;

    invoke-direct {v0, p0, v2, p1, v3}, Ll/ۛ᩷;-><init>(Ll/ܿۢ;Landroid/content/Context;Ll/᩵᩷;Landroid/view/View;)V

    iput-object v0, p0, Ll/ܿۢ;->᩺:Ll/ۛ᩷;

    .line 309
    invoke-virtual {v0, v1}, Ll/ᩳ᩷;->֫(Z)V

    .line 310
    iget-object v0, p0, Ll/ܿۢ;->᩺:Ll/ۛ᩷;

    .line 142
    invoke-virtual {v0}, Ll/ᩳ᩷;->᩻()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 312
    invoke-super {p0, p1}, Ll/ۡۜ;->onSubMenuSelected(Ll/᩵᩷;)Z

    return v4

    .line 143
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "MenuPopupHelper cannot be used without an anchor"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final updateMenuView(Z)V
    .locals 4

    .line 226
    invoke-super {p0, p1}, Ll/ۡۜ;->updateMenuView(Z)V

    .line 228
    iget-object p1, p0, Ll/ۡۜ;->۫:Ll/ۜ᩷;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 230
    iget-object p1, p0, Ll/ۡۜ;->ۗ:Ll/ۗۜ;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 231
    invoke-virtual {p1}, Ll/ۗۜ;->getActionItems()Ljava/util/ArrayList;

    move-result-object p1

    .line 232
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 234
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۛۜ;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 241
    :cond_0
    iget-object p1, p0, Ll/ۡۜ;->ۗ:Ll/ۗۜ;

    if-eqz p1, :cond_1

    .line 242
    invoke-virtual {p1}, Ll/ۗۜ;->getNonActionItems()Ljava/util/ArrayList;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    .line 245
    :goto_1
    iget-boolean v1, p0, Ll/ܿۢ;->ۢ֫:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-eqz p1, :cond_3

    .line 246
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v1, v2, :cond_2

    .line 248
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛۜ;

    invoke-virtual {p1}, Ll/ۛۜ;->isActionViewExpanded()Z

    move-result p1

    xor-int/lit8 v0, p1, 0x1

    goto :goto_2

    :cond_2
    if-lez v1, :cond_3

    const/4 v0, 0x1

    :cond_3
    :goto_2
    if-eqz v0, :cond_6

    .line 255
    iget-object p1, p0, Ll/ܿۢ;->ܽ֫:Ll/۟᩷;

    if-nez p1, :cond_4

    .line 256
    new-instance p1, Ll/۟᩷;

    iget-object v0, p0, Ll/ۡۜ;->ۤ:Landroid/content/Context;

    invoke-direct {p1, p0, v0}, Ll/۟᩷;-><init>(Ll/ܿۢ;Landroid/content/Context;)V

    iput-object p1, p0, Ll/ܿۢ;->ܽ֫:Ll/۟᩷;

    .line 258
    :cond_4
    iget-object p1, p0, Ll/ܿۢ;->ܽ֫:Ll/۟᩷;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    .line 259
    iget-object v0, p0, Ll/ۡۜ;->۫:Ll/ۜ᩷;

    if-eq p1, v0, :cond_7

    if-eqz p1, :cond_5

    .line 261
    iget-object v0, p0, Ll/ܿۢ;->ܽ֫:Ll/۟᩷;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 263
    :cond_5
    iget-object p1, p0, Ll/ۡۜ;->۫:Ll/ۜ᩷;

    check-cast p1, Ll/ۡۢ;

    .line 264
    iget-object v0, p0, Ll/ܿۢ;->ܽ֫:Ll/۟᩷;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    invoke-static {}, Ll/ۡۢ;->generateDefaultLayoutParams()Ll/ۜۢ;

    move-result-object v1

    .line 613
    iput-boolean v2, v1, Ll/ۜۢ;->ܿ:Z

    .line 264
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_3

    .line 266
    :cond_6
    iget-object p1, p0, Ll/ܿۢ;->ܽ֫:Ll/۟᩷;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    iget-object v0, p0, Ll/ۡۜ;->۫:Ll/ۜ᩷;

    if-ne p1, v0, :cond_7

    .line 267
    check-cast v0, Landroid/view/ViewGroup;

    iget-object p1, p0, Ll/ܿۢ;->ܽ֫:Ll/۟᩷;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 270
    :cond_7
    :goto_3
    iget-object p1, p0, Ll/ۡۜ;->۫:Ll/ۜ᩷;

    check-cast p1, Ll/ۡۢ;

    iget-boolean v0, p0, Ll/ܿۢ;->ۢ֫:Z

    invoke-virtual {p1, v0}, Ll/ۡۢ;->֫(Z)V

    return-void
.end method

.method public final ֫(Ll/ۛۜ;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 191
    invoke-virtual {p1}, Ll/ۛۜ;->getActionView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 192
    invoke-virtual {p1}, Ll/ۛۜ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 193
    :cond_0
    invoke-super {p0, p1, p2, p3}, Ll/ۡۜ;->֫(Ll/ۛۜ;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 195
    :cond_1
    invoke-virtual {p1}, Ll/ۛۜ;->isActionViewExpanded()Z

    move-result p1

    if-eqz p1, :cond_2

    const/16 p1, 0x8

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 197
    check-cast p3, Ll/ۡۢ;

    .line 198
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 199
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    instance-of p2, p1, Ll/ۜۢ;

    if-nez p2, :cond_3

    .line 200
    invoke-static {p1}, Ll/ۡۢ;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Ll/ۜۢ;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_3
    return-object v0
.end method

.method public final ֫(Landroid/view/ViewGroup;)Ll/ۜ᩷;
    .locals 1

    .line 181
    iget-object v0, p0, Ll/ۡۜ;->۫:Ll/ۜ᩷;

    .line 182
    invoke-super {p0, p1}, Ll/ۡۜ;->֫(Landroid/view/ViewGroup;)Ll/ۜ᩷;

    move-result-object p1

    if-eq v0, p1, :cond_0

    .line 184
    move-object v0, p1

    check-cast v0, Ll/ۡۢ;

    invoke-virtual {v0, p0}, Ll/ۡۢ;->֫(Ll/ܿۢ;)V

    :cond_0
    return-object p1
.end method

.method public final ֫(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 162
    iget-object v0, p0, Ll/ܿۢ;->ܽ֫:Ll/۟᩷;

    if-eqz v0, :cond_0

    .line 163
    invoke-virtual {v0, p1}, Ll/ᩳۡ;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 165
    iput-boolean v0, p0, Ll/ܿۢ;->ܳ֫:Z

    .line 166
    iput-object p1, p0, Ll/ܿۢ;->ܿ֫:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public final ֫(Ll/ۛۜ;Ll/᩻᩷;)V
    .locals 1

    const/4 v0, 0x0

    .line 207
    invoke-interface {p2, p1, v0}, Ll/᩻᩷;->initialize(Ll/ۛۜ;I)V

    .line 209
    iget-object p1, p0, Ll/ۡۜ;->۫:Ll/ۜ᩷;

    check-cast p1, Ll/ۡۢ;

    .line 210
    check-cast p2, Ll/ۢۜ;

    .line 211
    invoke-virtual {p2, p1}, Ll/ۢۜ;->֫(Ll/ۙۜ;)V

    .line 213
    iget-object p1, p0, Ll/ܿۢ;->᩻֫:Ll/ۨ᩷;

    if-nez p1, :cond_0

    .line 214
    new-instance p1, Ll/ۨ᩷;

    invoke-direct {p1, p0}, Ll/ۨ᩷;-><init>(Ll/ܿۢ;)V

    iput-object p1, p0, Ll/ܿۢ;->᩻֫:Ll/ۨ᩷;

    .line 216
    :cond_0
    iget-object p1, p0, Ll/ܿۢ;->᩻֫:Ll/ۨ᩷;

    invoke-virtual {p2, p1}, Ll/ۢۜ;->֫(Ll/᩷ۜ;)V

    return-void
.end method

.method public final ֫(Ll/ۡۢ;)V
    .locals 1

    .line 586
    iput-object p1, p0, Ll/ۡۜ;->۫:Ll/ۜ᩷;

    .line 587
    iget-object v0, p0, Ll/ۡۜ;->ۗ:Ll/ۗۜ;

    invoke-virtual {p1, v0}, Ll/ۡۢ;->initialize(Ll/ۗۜ;)V

    return-void
.end method

.method public final ֫(Landroid/view/ViewGroup;I)Z
    .locals 2

    .line 275
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Ll/ܿۢ;->ܽ֫:Ll/۟᩷;

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 147
    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->removeViewAt(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(Ll/ۛۜ;)Z
    .locals 0

    .line 221
    invoke-virtual {p1}, Ll/ۛۜ;->᩷()Z

    move-result p1

    return p1
.end method

.method public final ۜ()Z
    .locals 4

    .line 336
    iget-boolean v0, p0, Ll/ܿۢ;->ۢ֫:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/ܿۢ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۡۜ;->ۗ:Ll/ۗۜ;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/ۡۜ;->۫:Ll/ۜ᩷;

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/ܿۢ;->᩷֫:Ll/᩺᩷;

    if-nez v1, :cond_0

    .line 337
    invoke-virtual {v0}, Ll/ۗۜ;->getNonActionItems()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 338
    new-instance v0, Ll/֫ۢ;

    iget-object v1, p0, Ll/ۡۜ;->᩹:Landroid/content/Context;

    iget-object v2, p0, Ll/ۡۜ;->ۗ:Ll/ۗۜ;

    iget-object v3, p0, Ll/ܿۢ;->ܽ֫:Ll/۟᩷;

    invoke-direct {v0, p0, v1, v2, v3}, Ll/֫ۢ;-><init>(Ll/ܿۢ;Landroid/content/Context;Ll/ۗۜ;Landroid/view/View;)V

    .line 339
    new-instance v1, Ll/᩺᩷;

    invoke-direct {v1, p0, v0}, Ll/᩺᩷;-><init>(Ll/ܿۢ;Ll/֫ۢ;)V

    iput-object v1, p0, Ll/ܿۢ;->᩷֫:Ll/᩺᩷;

    .line 341
    iget-object v0, p0, Ll/ۡۜ;->۫:Ll/ۜ᩷;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 171
    iget-object v0, p0, Ll/ܿۢ;->ܽ֫:Ll/۟᩷;

    if-eqz v0, :cond_0

    .line 172
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    .line 173
    :cond_0
    iget-boolean v0, p0, Ll/ܿۢ;->ܳ֫:Z

    if-eqz v0, :cond_1

    .line 174
    iget-object v0, p0, Ll/ܿۢ;->ܿ֫:Landroid/graphics/drawable/Drawable;

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܳ()V
    .locals 1

    const/4 v0, 0x1

    .line 158
    iput-boolean v0, p0, Ll/ܿۢ;->۟:Z

    return-void
.end method

.method public final ܽ()Z
    .locals 3

    .line 354
    iget-object v0, p0, Ll/ܿۢ;->᩷֫:Ll/᩺᩷;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v2, p0, Ll/ۡۜ;->۫:Ll/ۜ᩷;

    if-eqz v2, :cond_0

    .line 355
    check-cast v2, Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v0, 0x0

    .line 356
    iput-object v0, p0, Ll/ܿۢ;->᩷֫:Ll/᩺᩷;

    return v1

    .line 360
    :cond_0
    iget-object v0, p0, Ll/ܿۢ;->ᩳ֫:Ll/֫ۢ;

    if-eqz v0, :cond_1

    .line 362
    invoke-virtual {v0}, Ll/ᩳ᩷;->֫()V

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()V
    .locals 2

    .line 134
    iget-object v0, p0, Ll/ۡۜ;->᩹:Landroid/content/Context;

    invoke-static {v0}, Ll/᩶᩻;->֫(Landroid/content/Context;)Ll/᩶᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶᩻;->ܽ()I

    move-result v0

    iput v0, p0, Ll/ܿۢ;->֫֫:I

    .line 136
    iget-object v0, p0, Ll/ۡۜ;->ۗ:Ll/ۗۜ;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 137
    invoke-virtual {v0, v1}, Ll/ۗۜ;->onItemsChanged(Z)V

    :cond_0
    return-void
.end method

.method public final ᩳ()Z
    .locals 1

    .line 395
    iget-object v0, p0, Ll/ܿۢ;->ᩳ֫:Ll/֫ۢ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ᩳ᩷;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩻()V
    .locals 1

    const/4 v0, 0x1

    .line 148
    iput-boolean v0, p0, Ll/ܿۢ;->ۢ֫:Z

    .line 149
    iput-boolean v0, p0, Ll/ܿۢ;->ۡ֫:Z

    return-void
.end method
