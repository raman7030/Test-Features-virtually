.class public Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;
.super Ll/᩶ۗۧ;
.source "NavigationMenuPresenter.java"


# static fields
.field public static final STATE_ACTION_VIEWS:Ljava/lang/String; = "android:menu:action_views"

.field public static final STATE_CHECKED_ITEM:Ljava/lang/String; = "android:menu:checked"

.field public static final VIEW_TYPE_HEADER:I = 0x3

.field public static final VIEW_TYPE_NORMAL:I = 0x0

.field public static final VIEW_TYPE_SEPARATOR:I = 0x2

.field public static final VIEW_TYPE_SUBHEADER:I = 0x1


# instance fields
.field public checkedItem:Ll/ۛۜ;

.field public final items:Ljava/util/ArrayList;

.field public final synthetic this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

.field public updateSuspended:Z


# direct methods
.method public constructor <init>(Lcom/google/android/material/internal/NavigationMenuPresenter;)V
    .locals 0

    .line 537
    iput-object p1, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    .line 533
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    .line 538
    invoke-direct {p0}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->prepareMenuItems()V

    return-void
.end method

.method public static synthetic access$100(Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;I)I
    .locals 0

    .line 523
    invoke-direct {p0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->adjustItemPositionForA11yDelegate(I)I

    move-result p0

    return p0
.end method

.method private adjustItemPositionForA11yDelegate(I)I
    .locals 4

    const/4 v0, 0x0

    move v1, p1

    :goto_0
    if-ge v0, p1, :cond_2

    .line 673
    iget-object v2, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget-object v2, v2, Lcom/google/android/material/internal/NavigationMenuPresenter;->adapter:Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;

    invoke-virtual {v2, v0}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->getItemViewType(I)I

    move-result v2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    iget-object v2, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget-object v2, v2, Lcom/google/android/material/internal/NavigationMenuPresenter;->adapter:Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;

    .line 674
    invoke-virtual {v2, v0}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->getItemViewType(I)I

    move-result v2

    const/4 v3, 0x3

    if-ne v2, v3, :cond_1

    :cond_0
    add-int/lit8 v1, v1, -0x1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method private appendTransparentIconIfMissing(II)V
    .locals 2

    :goto_0
    if-ge p1, p2, :cond_0

    .line 768
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;

    const/4 v1, 0x1

    .line 769
    iput-boolean v1, v0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;->needsEmptyIcon:Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private prepareMenuItems()V
    .locals 15

    .line 698
    iget-boolean v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->updateSuspended:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 701
    iput-boolean v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->updateSuspended:Z

    .line 702
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 703
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    new-instance v1, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuHeaderItem;

    invoke-direct {v1}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuHeaderItem;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 708
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget-object v0, v0, Lcom/google/android/material/internal/NavigationMenuPresenter;->menu:Ll/ۗۜ;

    invoke-virtual {v0}, Ll/ۗۜ;->getVisibleItems()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v3, v0, :cond_e

    .line 709
    iget-object v6, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget-object v6, v6, Lcom/google/android/material/internal/NavigationMenuPresenter;->menu:Ll/ۗۜ;

    invoke-virtual {v6}, Ll/ۗۜ;->getVisibleItems()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۛۜ;

    .line 710
    invoke-virtual {v6}, Ll/ۛۜ;->isChecked()Z

    move-result v7

    if-eqz v7, :cond_1

    .line 711
    invoke-virtual {p0, v6}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->setCheckedItem(Ll/ۛۜ;)V

    .line 713
    :cond_1
    invoke-virtual {v6}, Ll/ۛۜ;->isCheckable()Z

    move-result v7

    if-eqz v7, :cond_2

    .line 714
    invoke-virtual {v6, v1}, Ll/ۛۜ;->ܽ(Z)V

    .line 716
    :cond_2
    invoke-virtual {v6}, Ll/ۛۜ;->hasSubMenu()Z

    move-result v7

    if-eqz v7, :cond_9

    .line 717
    invoke-virtual {v6}, Ll/ۛۜ;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v7

    .line 718
    invoke-interface {v7}, Landroid/view/Menu;->hasVisibleItems()Z

    move-result v8

    if-eqz v8, :cond_d

    if-eqz v3, :cond_3

    .line 720
    iget-object v8, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    new-instance v9, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuSeparatorItem;

    iget-object v10, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget v10, v10, Lcom/google/android/material/internal/NavigationMenuPresenter;->paddingSeparator:I

    invoke-direct {v9, v10, v1}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuSeparatorItem;-><init>(II)V

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 722
    :cond_3
    iget-object v8, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    new-instance v9, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;

    invoke-direct {v9, v6}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;-><init>(Ll/ۛۜ;)V

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 724
    iget-object v8, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    .line 725
    invoke-interface {v7}, Landroid/view/Menu;->size()I

    move-result v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_1
    if-ge v10, v9, :cond_8

    .line 726
    invoke-interface {v7, v10}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v12

    check-cast v12, Ll/ۛۜ;

    .line 727
    invoke-virtual {v12}, Ll/ۛۜ;->isVisible()Z

    move-result v13

    if-eqz v13, :cond_7

    if-nez v11, :cond_4

    .line 728
    invoke-virtual {v12}, Ll/ۛۜ;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v13

    if-eqz v13, :cond_4

    const/4 v11, 0x1

    .line 731
    :cond_4
    invoke-virtual {v12}, Ll/ۛۜ;->isCheckable()Z

    move-result v13

    if-eqz v13, :cond_5

    .line 732
    invoke-virtual {v12, v1}, Ll/ۛۜ;->ܽ(Z)V

    .line 734
    :cond_5
    invoke-virtual {v6}, Ll/ۛۜ;->isChecked()Z

    move-result v13

    if-eqz v13, :cond_6

    .line 735
    invoke-virtual {p0, v6}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->setCheckedItem(Ll/ۛۜ;)V

    .line 737
    :cond_6
    iget-object v13, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    new-instance v14, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;

    invoke-direct {v14, v12}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;-><init>(Ll/ۛۜ;)V

    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_8
    if-eqz v11, :cond_d

    .line 741
    iget-object v6, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-direct {p0, v8, v6}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->appendTransparentIconIfMissing(II)V

    goto :goto_4

    .line 745
    :cond_9
    invoke-virtual {v6}, Ll/ۛۜ;->getGroupId()I

    move-result v7

    if-eq v7, v2, :cond_b

    .line 747
    iget-object v2, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 748
    invoke-virtual {v6}, Ll/ۛۜ;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_a

    const/4 v2, 0x1

    const/4 v4, 0x1

    goto :goto_2

    :cond_a
    const/4 v2, 0x0

    const/4 v4, 0x0

    :goto_2
    if-eqz v3, :cond_c

    add-int/lit8 v5, v5, 0x1

    .line 751
    iget-object v2, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    new-instance v8, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuSeparatorItem;

    iget-object v9, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget v9, v9, Lcom/google/android/material/internal/NavigationMenuPresenter;->paddingSeparator:I

    invoke-direct {v8, v9, v9}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuSeparatorItem;-><init>(II)V

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_b
    if-nez v4, :cond_c

    .line 753
    invoke-virtual {v6}, Ll/ۛۜ;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_c

    .line 755
    iget-object v2, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {p0, v5, v2}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->appendTransparentIconIfMissing(II)V

    const/4 v4, 0x1

    .line 757
    :cond_c
    :goto_3
    new-instance v2, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;

    invoke-direct {v2, v6}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;-><init>(Ll/ۛۜ;)V

    .line 758
    iput-boolean v4, v2, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;->needsEmptyIcon:Z

    .line 759
    iget-object v6, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v2, v7

    :cond_d
    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 763
    :cond_e
    iput-boolean v1, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->updateSuspended:Z

    return-void
.end method

.method private setAccessibilityDelegate(Landroid/view/View;IZ)V
    .locals 1

    .line 650
    new-instance v0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter$1;

    invoke-direct {v0, p0, p2, p3}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter$1;-><init>(Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;IZ)V

    invoke-static {p1, v0}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܽۛ;)V

    return-void
.end method


# virtual methods
.method public createInstanceState()Landroid/os/Bundle;
    .locals 7

    .line 790
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 791
    iget-object v1, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->checkedItem:Ll/ۛۜ;

    if-eqz v1, :cond_0

    const-string v2, "android:menu:checked"

    .line 792
    invoke-virtual {v1}, Ll/ۛۜ;->getItemId()I

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 795
    :cond_0
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 796
    iget-object v2, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    .line 797
    iget-object v4, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuItem;

    .line 798
    instance-of v5, v4, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;

    if-eqz v5, :cond_2

    .line 799
    check-cast v4, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;

    invoke-virtual {v4}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;->getMenuItem()Ll/ۛۜ;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 800
    invoke-virtual {v4}, Ll/ۛۜ;->getActionView()Landroid/view/View;

    move-result-object v5

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_2

    .line 802
    new-instance v6, Lcom/google/android/material/internal/ParcelableSparseArray;

    invoke-direct {v6}, Lcom/google/android/material/internal/ParcelableSparseArray;-><init>()V

    .line 803
    invoke-virtual {v5, v6}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 804
    invoke-virtual {v4}, Ll/ۛۜ;->getItemId()I

    move-result v4

    invoke-virtual {v1, v4, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    const-string v2, "android:menu:action_views"

    .line 808
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    return-object v0
.end method

.method public getCheckedItem()Ll/ۛۜ;
    .locals 1

    .line 785
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->checkedItem:Ll/ۛۜ;

    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    .line 548
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 553
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuItem;

    .line 554
    instance-of v0, p1, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuSeparatorItem;

    if-eqz v0, :cond_0

    const/4 p1, 0x2

    return p1

    .line 556
    :cond_0
    instance-of v0, p1, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuHeaderItem;

    if-eqz v0, :cond_1

    const/4 p1, 0x3

    return p1

    .line 558
    :cond_1
    instance-of v0, p1, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;

    if-eqz v0, :cond_3

    .line 559
    check-cast p1, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;

    .line 560
    invoke-virtual {p1}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;->getMenuItem()Ll/ۛۜ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۛۜ;->hasSubMenu()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1

    .line 566
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Unknown item type."

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getRowCount()I
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 862
    :goto_0
    iget-object v2, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget-object v2, v2, Lcom/google/android/material/internal/NavigationMenuPresenter;->adapter:Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;

    invoke-virtual {v2}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->getItemCount()I

    move-result v2

    if-ge v0, v2, :cond_2

    .line 863
    iget-object v2, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget-object v2, v2, Lcom/google/android/material/internal/NavigationMenuPresenter;->adapter:Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;

    invoke-virtual {v2, v0}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->getItemViewType(I)I

    move-result v2

    if-eqz v2, :cond_0

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public onBindViewHolder(Lcom/google/android/material/internal/NavigationMenuPresenter$ViewHolder;I)V
    .locals 5

    .line 587
    invoke-virtual {p0, p2}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->getItemViewType(I)I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    return-void

    .line 638
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuSeparatorItem;

    .line 639
    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget v0, v0, Lcom/google/android/material/internal/NavigationMenuPresenter;->dividerInsetStart:I

    .line 641
    invoke-virtual {p2}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuSeparatorItem;->getPaddingTop()I

    move-result v1

    iget-object v2, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget v2, v2, Lcom/google/android/material/internal/NavigationMenuPresenter;->dividerInsetEnd:I

    .line 643
    invoke-virtual {p2}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuSeparatorItem;->getPaddingBottom()I

    move-result p2

    .line 639
    invoke-virtual {p1, v0, v1, v2, p2}, Landroid/view/View;->setPadding(IIII)V

    return-void

    .line 620
    :cond_1
    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    check-cast p1, Landroid/widget/TextView;

    .line 621
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;

    .line 622
    invoke-virtual {v0}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;->getMenuItem()Ll/ۛۜ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۛۜ;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 623
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget v0, v0, Lcom/google/android/material/internal/NavigationMenuPresenter;->subheaderTextAppearance:I

    invoke-static {p1, v0}, Ll/ۙ֫֫;->ᩳ(Landroid/widget/TextView;I)V

    .line 624
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget v0, v0, Lcom/google/android/material/internal/NavigationMenuPresenter;->subheaderInsetStart:I

    .line 626
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    iget-object v3, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget v3, v3, Lcom/google/android/material/internal/NavigationMenuPresenter;->subheaderInsetEnd:I

    .line 628
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    .line 624
    invoke-virtual {p1, v0, v2, v3, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 630
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget-object v0, v0, Lcom/google/android/material/internal/NavigationMenuPresenter;->subheaderColor:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_2

    .line 631
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 633
    :cond_2
    invoke-direct {p0, p1, p2, v1}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->setAccessibilityDelegate(Landroid/view/View;IZ)V

    return-void

    .line 590
    :cond_3
    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    check-cast p1, Lcom/google/android/material/internal/NavigationMenuItemView;

    .line 591
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget-object v0, v0, Lcom/google/android/material/internal/NavigationMenuPresenter;->iconTintList:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Lcom/google/android/material/internal/NavigationMenuItemView;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 592
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget v0, v0, Lcom/google/android/material/internal/NavigationMenuPresenter;->textAppearance:I

    invoke-virtual {p1, v0}, Lcom/google/android/material/internal/NavigationMenuItemView;->setTextAppearance(I)V

    .line 593
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget-object v0, v0, Lcom/google/android/material/internal/NavigationMenuPresenter;->textColor:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_4

    .line 594
    invoke-virtual {p1, v0}, Lcom/google/android/material/internal/NavigationMenuItemView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 598
    :cond_4
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget-object v0, v0, Lcom/google/android/material/internal/NavigationMenuPresenter;->itemBackground:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    :cond_5
    const/4 v0, 0x0

    .line 596
    :goto_0
    sget v1, Ll/ܿ᩺;->֫:I

    .line 3370
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 599
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget-object v0, v0, Lcom/google/android/material/internal/NavigationMenuPresenter;->itemForeground:Landroid/graphics/drawable/RippleDrawable;

    if-eqz v0, :cond_6

    .line 600
    invoke-virtual {v0}, Landroid/graphics/drawable/RippleDrawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/material/internal/ForegroundLinearLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 602
    :cond_6
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;

    .line 603
    iget-boolean v1, v0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;->needsEmptyIcon:Z

    invoke-virtual {p1, v1}, Lcom/google/android/material/internal/NavigationMenuItemView;->setNeedsEmptyIcon(Z)V

    .line 604
    iget-object v1, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget v2, v1, Lcom/google/android/material/internal/NavigationMenuPresenter;->itemHorizontalPadding:I

    iget v1, v1, Lcom/google/android/material/internal/NavigationMenuPresenter;->itemVerticalPadding:I

    invoke-virtual {p1, v2, v1, v2, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 609
    iget-object v1, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget v1, v1, Lcom/google/android/material/internal/NavigationMenuPresenter;->itemIconPadding:I

    invoke-virtual {p1, v1}, Lcom/google/android/material/internal/NavigationMenuItemView;->setIconPadding(I)V

    .line 610
    iget-object v1, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget-boolean v2, v1, Lcom/google/android/material/internal/NavigationMenuPresenter;->hasCustomItemIconSize:Z

    if-eqz v2, :cond_7

    .line 611
    iget v1, v1, Lcom/google/android/material/internal/NavigationMenuPresenter;->itemIconSize:I

    invoke-virtual {p1, v1}, Lcom/google/android/material/internal/NavigationMenuItemView;->setIconSize(I)V

    .line 613
    :cond_7
    iget-object v1, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    invoke-static {v1}, Lcom/google/android/material/internal/NavigationMenuPresenter;->access$000(Lcom/google/android/material/internal/NavigationMenuPresenter;)I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/google/android/material/internal/NavigationMenuItemView;->setMaxLines(I)V

    .line 614
    invoke-virtual {v0}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;->getMenuItem()Ll/ۛۜ;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget-boolean v1, v1, Lcom/google/android/material/internal/NavigationMenuPresenter;->textAppearanceActiveBoldEnabled:Z

    invoke-virtual {p1, v0, v1}, Lcom/google/android/material/internal/NavigationMenuItemView;->initialize(Ll/ۛۜ;Z)V

    const/4 v0, 0x0

    .line 615
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->setAccessibilityDelegate(Landroid/view/View;IZ)V

    return-void
.end method

.method public bridge synthetic onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 0

    .line 523
    check-cast p1, Lcom/google/android/material/internal/NavigationMenuPresenter$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->onBindViewHolder(Lcom/google/android/material/internal/NavigationMenuPresenter$ViewHolder;I)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/google/android/material/internal/NavigationMenuPresenter$ViewHolder;
    .locals 2

    if-eqz p2, :cond_3

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    const/4 p1, 0x3

    if-eq p2, p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 580
    :cond_0
    new-instance p1, Lcom/google/android/material/internal/NavigationMenuPresenter$HeaderViewHolder;

    iget-object p2, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget-object p2, p2, Lcom/google/android/material/internal/NavigationMenuPresenter;->headerLayout:Landroid/widget/LinearLayout;

    invoke-direct {p1, p2}, Lcom/google/android/material/internal/NavigationMenuPresenter$HeaderViewHolder;-><init>(Landroid/view/View;)V

    return-object p1

    .line 578
    :cond_1
    new-instance p2, Lcom/google/android/material/internal/NavigationMenuPresenter$SeparatorViewHolder;

    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget-object v0, v0, Lcom/google/android/material/internal/NavigationMenuPresenter;->layoutInflater:Landroid/view/LayoutInflater;

    invoke-direct {p2, v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter$SeparatorViewHolder;-><init>(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V

    return-object p2

    .line 576
    :cond_2
    new-instance p2, Lcom/google/android/material/internal/NavigationMenuPresenter$SubheaderViewHolder;

    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget-object v0, v0, Lcom/google/android/material/internal/NavigationMenuPresenter;->layoutInflater:Landroid/view/LayoutInflater;

    invoke-direct {p2, v0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter$SubheaderViewHolder;-><init>(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)V

    return-object p2

    .line 574
    :cond_3
    new-instance p2, Lcom/google/android/material/internal/NavigationMenuPresenter$NormalViewHolder;

    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->this$0:Lcom/google/android/material/internal/NavigationMenuPresenter;

    iget-object v1, v0, Lcom/google/android/material/internal/NavigationMenuPresenter;->layoutInflater:Landroid/view/LayoutInflater;

    iget-object v0, v0, Lcom/google/android/material/internal/NavigationMenuPresenter;->onClickListener:Landroid/view/View$OnClickListener;

    invoke-direct {p2, v1, p1, v0}, Lcom/google/android/material/internal/NavigationMenuPresenter$NormalViewHolder;-><init>(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/view/View$OnClickListener;)V

    return-object p2
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 0

    .line 523
    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/google/android/material/internal/NavigationMenuPresenter$ViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onViewRecycled(Lcom/google/android/material/internal/NavigationMenuPresenter$ViewHolder;)V
    .locals 1

    .line 683
    instance-of v0, p1, Lcom/google/android/material/internal/NavigationMenuPresenter$NormalViewHolder;

    if-eqz v0, :cond_0

    .line 684
    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    check-cast p1, Lcom/google/android/material/internal/NavigationMenuItemView;

    invoke-virtual {p1}, Lcom/google/android/material/internal/NavigationMenuItemView;->recycle()V

    :cond_0
    return-void
.end method

.method public bridge synthetic onViewRecycled(Ll/ۗ۬ۧ;)V
    .locals 0

    .line 523
    check-cast p1, Lcom/google/android/material/internal/NavigationMenuPresenter$ViewHolder;

    invoke-virtual {p0, p1}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->onViewRecycled(Lcom/google/android/material/internal/NavigationMenuPresenter$ViewHolder;)V

    return-void
.end method

.method public restoreInstanceState(Landroid/os/Bundle;)V
    .locals 6

    const-string v0, "android:menu:checked"

    const/4 v1, 0x0

    .line 813
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v2, 0x1

    .line 815
    iput-boolean v2, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->updateSuspended:Z

    .line 816
    iget-object v2, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 817
    iget-object v4, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuItem;

    .line 818
    instance-of v5, v4, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;

    if-eqz v5, :cond_0

    .line 819
    check-cast v4, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;

    invoke-virtual {v4}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;->getMenuItem()Ll/ۛۜ;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 820
    invoke-virtual {v4}, Ll/ۛۜ;->getItemId()I

    move-result v5

    if-ne v5, v0, :cond_0

    .line 821
    invoke-virtual {p0, v4}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->setCheckedItem(Ll/ۛۜ;)V

    goto :goto_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 826
    :cond_1
    :goto_1
    iput-boolean v1, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->updateSuspended:Z

    .line 827
    invoke-direct {p0}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->prepareMenuItems()V

    :cond_2
    const-string v0, "android:menu:action_views"

    .line 831
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 833
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_2
    if-ge v1, v0, :cond_7

    .line 834
    iget-object v2, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->items:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuItem;

    .line 835
    instance-of v3, v2, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;

    if-nez v3, :cond_3

    goto :goto_3

    .line 838
    :cond_3
    check-cast v2, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;

    invoke-virtual {v2}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuTextItem;->getMenuItem()Ll/ۛۜ;

    move-result-object v2

    if-nez v2, :cond_4

    goto :goto_3

    .line 842
    :cond_4
    invoke-virtual {v2}, Ll/ۛۜ;->getActionView()Landroid/view/View;

    move-result-object v3

    if-nez v3, :cond_5

    goto :goto_3

    .line 846
    :cond_5
    invoke-virtual {v2}, Ll/ۛۜ;->getItemId()I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/material/internal/ParcelableSparseArray;

    if-nez v2, :cond_6

    goto :goto_3

    .line 850
    :cond_6
    invoke-virtual {v3, v2}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_7
    return-void
.end method

.method public setCheckedItem(Ll/ۛۜ;)V
    .locals 2

    .line 774
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->checkedItem:Ll/ۛۜ;

    if-eq v0, p1, :cond_2

    invoke-virtual {p1}, Ll/ۛۜ;->isCheckable()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 777
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->checkedItem:Ll/ۛۜ;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 778
    invoke-virtual {v0, v1}, Ll/ۛۜ;->setChecked(Z)Landroid/view/MenuItem;

    .line 780
    :cond_1
    iput-object p1, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->checkedItem:Ll/ۛۜ;

    const/4 v0, 0x1

    .line 781
    invoke-virtual {p1, v0}, Ll/ۛۜ;->setChecked(Z)Landroid/view/MenuItem;

    :cond_2
    :goto_0
    return-void
.end method

.method public setUpdateSuspended(Z)V
    .locals 0

    .line 856
    iput-boolean p1, p0, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->updateSuspended:Z

    return-void
.end method

.method public update()V
    .locals 0

    .line 689
    invoke-direct {p0}, Lcom/google/android/material/internal/NavigationMenuPresenter$NavigationMenuAdapter;->prepareMenuItems()V

    .line 690
    invoke-virtual {p0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method
