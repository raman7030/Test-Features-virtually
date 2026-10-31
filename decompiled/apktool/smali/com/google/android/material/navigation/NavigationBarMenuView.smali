.class public abstract Lcom/google/android/material/navigation/NavigationBarMenuView;
.super Landroid/view/ViewGroup;
.source "NavigationBarMenuView.java"

# interfaces
.implements Ll/ۜ᩷;


# static fields
.field public static final CHECKED_STATE_SET:[I

.field public static final DISABLED_STATE_SET:[I

.field public static final ITEM_POOL_SIZE:I = 0x5

.field public static final NO_PADDING:I = -0x1


# instance fields
.field public final badgeDrawables:Landroid/util/SparseArray;

.field public buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

.field public itemActiveIndicatorColor:Landroid/content/res/ColorStateList;

.field public itemActiveIndicatorEnabled:Z

.field public itemActiveIndicatorHeight:I

.field public itemActiveIndicatorLabelPadding:I

.field public itemActiveIndicatorMarginHorizontal:I

.field public itemActiveIndicatorResizeable:Z

.field public itemActiveIndicatorShapeAppearance:Lcom/google/android/material/shape/ShapeAppearanceModel;

.field public itemActiveIndicatorWidth:I

.field public itemBackground:Landroid/graphics/drawable/Drawable;

.field public itemBackgroundRes:I

.field public itemIconSize:I

.field public itemIconTint:Landroid/content/res/ColorStateList;

.field public itemPaddingBottom:I

.field public itemPaddingTop:I

.field public final itemPool:Ll/ۛۤ;

.field public itemRippleColor:Landroid/content/res/ColorStateList;

.field public itemTextAppearanceActive:I

.field public itemTextAppearanceActiveBoldEnabled:Z

.field public itemTextAppearanceInactive:I

.field public final itemTextColorDefault:Landroid/content/res/ColorStateList;

.field public itemTextColorFromUser:Landroid/content/res/ColorStateList;

.field public labelVisibilityMode:I

.field public menu:Ll/ۗۜ;

.field public final onClickListener:Landroid/view/View$OnClickListener;

.field public final onTouchListeners:Landroid/util/SparseArray;

.field public presenter:Lcom/google/android/material/navigation/NavigationBarPresenter;

.field public selectedItemId:I

.field public selectedItemPosition:I

.field public final set:Ll/ۖۨۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const v0, 0x10100a0

    .line 69
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Lcom/google/android/material/navigation/NavigationBarMenuView;->CHECKED_STATE_SET:[I

    const v0, -0x101009e

    .line 70
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Lcom/google/android/material/navigation/NavigationBarMenuView;->DISABLED_STATE_SET:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 113
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 74
    new-instance p1, Ll/᩺ۤ;

    const/4 v0, 0x5

    invoke-direct {p1, v0}, Ll/᩺ۤ;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemPool:Ll/ۛۤ;

    .line 77
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1, v0}, Landroid/util/SparseArray;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->onTouchListeners:Landroid/util/SparseArray;

    const/4 p1, 0x0

    .line 83
    iput p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->selectedItemId:I

    .line 84
    iput p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->selectedItemPosition:I

    .line 96
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1, v0}, Landroid/util/SparseArray;-><init>(I)V

    iput-object v1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->badgeDrawables:Landroid/util/SparseArray;

    const/4 v0, -0x1

    .line 98
    iput v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemPaddingTop:I

    .line 99
    iput v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemPaddingBottom:I

    .line 100
    iput v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorLabelPadding:I

    .line 106
    iput-boolean p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorResizeable:Z

    const v0, 0x1010038

    .line 115
    invoke-virtual {p0, v0}, Lcom/google/android/material/navigation/NavigationBarMenuView;->createDefaultColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemTextColorDefault:Landroid/content/res/ColorStateList;

    .line 117
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    .line 118
    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->set:Ll/ۖۨۧ;

    goto :goto_0

    .line 120
    :cond_0
    new-instance v0, Ll/ۨۤۧ;

    invoke-direct {v0}, Ll/ۨۤۧ;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->set:Ll/ۖۨۧ;

    .line 121
    invoke-virtual {v0, p1}, Ll/ۖۨۧ;->ܽ(I)V

    .line 124
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v1, Ll/ᩳ۠ܺ;->֨᩸:I

    .line 126
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Ll/ۢ۠ܺ;->ܿ֫:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v2

    .line 123
    invoke-static {p1, v1, v2}, Lcom/google/android/material/motion/MotionUtils;->resolveThemeDuration(Landroid/content/Context;II)I

    move-result p1

    int-to-long v1, p1

    .line 122
    invoke-virtual {v0, v1, v2}, Ll/ۖۨۧ;->setDuration(J)V

    .line 129
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v1, Ll/ᩳ۠ܺ;->᩺᩸:I

    sget-object v2, Lcom/google/android/material/animation/AnimationUtils;->FAST_OUT_SLOW_IN_INTERPOLATOR:Landroid/animation/TimeInterpolator;

    .line 128
    invoke-static {p1, v1, v2}, Lcom/google/android/material/motion/MotionUtils;->resolveThemeInterpolator(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    move-result-object p1

    .line 127
    invoke-virtual {v0, p1}, Ll/ۖۨۧ;->setInterpolator(Landroid/animation/TimeInterpolator;)Ll/ۖۨۧ;

    .line 132
    new-instance p1, Lcom/google/android/material/internal/TextScale;

    invoke-direct {p1}, Lcom/google/android/material/internal/TextScale;-><init>()V

    invoke-virtual {v0, p1}, Ll/ۖۨۧ;->ۧ(Ll/ܽۨۧ;)V

    .line 135
    :goto_0
    new-instance p1, Lcom/google/android/material/navigation/NavigationBarMenuView$1;

    invoke-direct {p1, p0}, Lcom/google/android/material/navigation/NavigationBarMenuView$1;-><init>(Lcom/google/android/material/navigation/NavigationBarMenuView;)V

    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->onClickListener:Landroid/view/View$OnClickListener;

    .line 147
    sget p1, Ll/ܿ᩺;->֫:I

    const/4 p1, 0x1

    .line 1427
    invoke-virtual {p0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    return-void
.end method

.method public static synthetic access$000(Lcom/google/android/material/navigation/NavigationBarMenuView;)Lcom/google/android/material/navigation/NavigationBarPresenter;
    .locals 0

    .line 65
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->presenter:Lcom/google/android/material/navigation/NavigationBarPresenter;

    return-object p0
.end method

.method public static synthetic access$100(Lcom/google/android/material/navigation/NavigationBarMenuView;)Ll/ۗۜ;
    .locals 0

    .line 65
    iget-object p0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->menu:Ll/ۗۜ;

    return-object p0
.end method

.method private createItemActiveIndicatorDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 567
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorShapeAppearance:Lcom/google/android/material/shape/ShapeAppearanceModel;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorColor:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    .line 568
    new-instance v0, Lcom/google/android/material/shape/MaterialShapeDrawable;

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorShapeAppearance:Lcom/google/android/material/shape/ShapeAppearanceModel;

    invoke-direct {v0, v1}, Lcom/google/android/material/shape/MaterialShapeDrawable;-><init>(Lcom/google/android/material/shape/ShapeAppearanceModel;)V

    .line 570
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorColor:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setFillColor(Landroid/content/res/ColorStateList;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private getNewItem()Lcom/google/android/material/navigation/NavigationBarItemView;
    .locals 1

    .line 827
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemPool:Ll/ۛۤ;

    invoke-interface {v0}, Ll/ۛۤ;->֫()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/navigation/NavigationBarItemView;

    if-nez v0, :cond_0

    .line 829
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/material/navigation/NavigationBarMenuView;->createNavigationBarItemView(Landroid/content/Context;)Lcom/google/android/material/navigation/NavigationBarItemView;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method private isValidId(I)Z
    .locals 1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private removeUnusedBadges()V
    .locals 4

    .line 930
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 932
    :goto_0
    iget-object v3, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->menu:Ll/ۗۜ;

    invoke-virtual {v3}, Ll/ۗۜ;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 933
    iget-object v3, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->menu:Ll/ۗۜ;

    invoke-virtual {v3, v2}, Ll/ۗۜ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v3

    invoke-interface {v3}, Landroid/view/MenuItem;->getItemId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 936
    :cond_0
    :goto_1
    iget-object v2, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->badgeDrawables:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 937
    iget-object v2, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->badgeDrawables:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    .line 938
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 939
    iget-object v3, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->badgeDrawables:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->delete(I)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method private setBadgeIfNeeded(Lcom/google/android/material/navigation/NavigationBarItemView;)V
    .locals 2

    .line 917
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 918
    invoke-direct {p0, v0}, Lcom/google/android/material/navigation/NavigationBarMenuView;->isValidId(I)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 923
    :cond_0
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->badgeDrawables:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/badge/BadgeDrawable;

    if-eqz v0, :cond_1

    .line 925
    invoke-virtual {p1, v0}, Lcom/google/android/material/navigation/NavigationBarItemView;->setBadge(Lcom/google/android/material/badge/BadgeDrawable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private validateMenuItemId(I)V
    .locals 2

    .line 975
    invoke-direct {p0, p1}, Lcom/google/android/material/navigation/NavigationBarMenuView;->isValidId(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 976
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is not a valid view id"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public buildMenuView()V
    .locals 6

    .line 717
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 718
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 719
    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v0, v3

    if-eqz v4, :cond_0

    .line 721
    iget-object v5, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemPool:Ll/ۛۤ;

    invoke-interface {v5, v4}, Ll/ۛۤ;->֫(Ljava/lang/Object;)Z

    .line 722
    invoke-virtual {v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->clear()V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 727
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->menu:Ll/ۗۜ;

    invoke-virtual {v0}, Ll/ۗۜ;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 728
    iput v1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->selectedItemId:I

    .line 729
    iput v1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->selectedItemPosition:I

    const/4 v0, 0x0

    .line 730
    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    return-void

    .line 733
    :cond_2
    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationBarMenuView;->removeUnusedBadges()V

    .line 735
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->menu:Ll/ۗۜ;

    invoke-virtual {v0}, Ll/ۗۜ;->size()I

    move-result v0

    new-array v0, v0, [Lcom/google/android/material/navigation/NavigationBarItemView;

    iput-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    .line 736
    iget v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->labelVisibilityMode:I

    iget-object v2, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->menu:Ll/ۗۜ;

    invoke-virtual {v2}, Ll/ۗۜ;->getVisibleItems()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {p0, v0, v2}, Lcom/google/android/material/navigation/NavigationBarMenuView;->isShifting(II)Z

    move-result v0

    const/4 v2, 0x0

    .line 737
    :goto_1
    iget-object v3, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->menu:Ll/ۗۜ;

    invoke-virtual {v3}, Ll/ۗۜ;->size()I

    move-result v3

    const/4 v4, 0x1

    if-ge v2, v3, :cond_8

    .line 738
    iget-object v3, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->presenter:Lcom/google/android/material/navigation/NavigationBarPresenter;

    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarPresenter;->setUpdateSuspended(Z)V

    .line 739
    iget-object v3, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->menu:Ll/ۗۜ;

    invoke-virtual {v3, v2}, Ll/ۗۜ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v3

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    .line 740
    iget-object v3, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->presenter:Lcom/google/android/material/navigation/NavigationBarPresenter;

    invoke-virtual {v3, v1}, Lcom/google/android/material/navigation/NavigationBarPresenter;->setUpdateSuspended(Z)V

    .line 741
    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationBarMenuView;->getNewItem()Lcom/google/android/material/navigation/NavigationBarItemView;

    move-result-object v3

    .line 742
    iget-object v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    aput-object v3, v4, v2

    .line 743
    iget-object v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemIconTint:Landroid/content/res/ColorStateList;

    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 744
    iget v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemIconSize:I

    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->setIconSize(I)V

    .line 746
    iget-object v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemTextColorDefault:Landroid/content/res/ColorStateList;

    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 747
    iget v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemTextAppearanceInactive:I

    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->setTextAppearanceInactive(I)V

    .line 748
    iget v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemTextAppearanceActive:I

    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->setTextAppearanceActive(I)V

    .line 749
    iget-boolean v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemTextAppearanceActiveBoldEnabled:Z

    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->setTextAppearanceActiveBoldEnabled(Z)V

    .line 750
    iget-object v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemTextColorFromUser:Landroid/content/res/ColorStateList;

    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 751
    iget v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemPaddingTop:I

    const/4 v5, -0x1

    if-eq v4, v5, :cond_3

    .line 752
    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->setItemPaddingTop(I)V

    .line 754
    :cond_3
    iget v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemPaddingBottom:I

    if-eq v4, v5, :cond_4

    .line 755
    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->setItemPaddingBottom(I)V

    .line 757
    :cond_4
    iget v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorLabelPadding:I

    if-eq v4, v5, :cond_5

    .line 758
    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->setActiveIndicatorLabelPadding(I)V

    .line 760
    :cond_5
    iget v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorWidth:I

    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->setActiveIndicatorWidth(I)V

    .line 761
    iget v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorHeight:I

    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->setActiveIndicatorHeight(I)V

    .line 762
    iget v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorMarginHorizontal:I

    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->setActiveIndicatorMarginHorizontal(I)V

    .line 763
    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationBarMenuView;->createItemActiveIndicatorDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->setActiveIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 764
    iget-boolean v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorResizeable:Z

    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->setActiveIndicatorResizeable(Z)V

    .line 765
    iget-boolean v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorEnabled:Z

    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->setActiveIndicatorEnabled(Z)V

    .line 766
    iget-object v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemBackground:Landroid/graphics/drawable/Drawable;

    if-eqz v4, :cond_6

    .line 767
    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_2

    .line 769
    :cond_6
    iget v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemBackgroundRes:I

    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->setItemBackground(I)V

    .line 771
    :goto_2
    iget-object v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemRippleColor:Landroid/content/res/ColorStateList;

    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->setItemRippleColor(Landroid/content/res/ColorStateList;)V

    .line 772
    invoke-virtual {v3, v0}, Lcom/google/android/material/navigation/NavigationBarItemView;->setShifting(Z)V

    .line 773
    iget v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->labelVisibilityMode:I

    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->setLabelVisibilityMode(I)V

    .line 774
    iget-object v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->menu:Ll/ۗۜ;

    invoke-virtual {v4, v2}, Ll/ۗۜ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v4

    check-cast v4, Ll/ۛۜ;

    .line 775
    invoke-virtual {v3, v4, v1}, Lcom/google/android/material/navigation/NavigationBarItemView;->initialize(Ll/ۛۜ;I)V

    .line 776
    invoke-virtual {v3, v2}, Lcom/google/android/material/navigation/NavigationBarItemView;->setItemPosition(I)V

    .line 777
    invoke-virtual {v4}, Ll/ۛۜ;->getItemId()I

    move-result v4

    .line 778
    iget-object v5, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->onTouchListeners:Landroid/util/SparseArray;

    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View$OnTouchListener;

    invoke-virtual {v3, v5}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 779
    iget-object v5, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->onClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v3, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 780
    iget v5, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->selectedItemId:I

    if-eqz v5, :cond_7

    if-ne v4, v5, :cond_7

    .line 781
    iput v2, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->selectedItemPosition:I

    .line 783
    :cond_7
    invoke-direct {p0, v3}, Lcom/google/android/material/navigation/NavigationBarMenuView;->setBadgeIfNeeded(Lcom/google/android/material/navigation/NavigationBarItemView;)V

    .line 784
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_1

    .line 786
    :cond_8
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->menu:Ll/ۗۜ;

    invoke-virtual {v0}, Ll/ۗۜ;->size()I

    move-result v0

    sub-int/2addr v0, v4

    iget v1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->selectedItemPosition:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->selectedItemPosition:I

    .line 787
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->menu:Ll/ۗۜ;

    invoke-virtual {v1, v0}, Ll/ۗۜ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v4}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    return-void
.end method

.method public createDefaultColorStateList(I)Landroid/content/res/ColorStateList;
    .locals 7

    .line 692
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 693
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    return-object v1

    .line 696
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iget v3, v0, Landroid/util/TypedValue;->resourceId:I

    .line 46
    invoke-static {p1, v3}, Ll/֨ۙ;->ۧ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    .line 697
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 698
    invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    const v4, 0x7f04011a

    .line 699
    invoke-virtual {v3, v4, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v3

    if-nez v3, :cond_1

    return-object v1

    .line 702
    :cond_1
    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 703
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    .line 704
    new-instance v3, Landroid/content/res/ColorStateList;

    sget-object v4, Lcom/google/android/material/navigation/NavigationBarMenuView;->DISABLED_STATE_SET:[I

    const/4 v5, 0x3

    new-array v5, v5, [[I

    const/4 v6, 0x0

    aput-object v4, v5, v6

    sget-object v6, Lcom/google/android/material/navigation/NavigationBarMenuView;->CHECKED_STATE_SET:[I

    aput-object v6, v5, v2

    sget-object v2, Landroid/view/ViewGroup;->EMPTY_STATE_SET:[I

    const/4 v6, 0x2

    aput-object v2, v5, v6

    .line 707
    invoke-virtual {p1, v4, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    filled-new-array {p1, v0, v1}, [I

    move-result-object p1

    invoke-direct {v3, v5, p1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object v3
.end method

.method public abstract createNavigationBarItemView(Landroid/content/Context;)Lcom/google/android/material/navigation/NavigationBarItemView;
.end method

.method public findItemView(I)Lcom/google/android/material/navigation/NavigationBarItemView;
    .locals 5

    .line 946
    invoke-direct {p0, p1}, Lcom/google/android/material/navigation/NavigationBarMenuView;->validateMenuItemId(I)V

    .line 947
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz v0, :cond_1

    .line 948
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 949
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v4

    if-ne v4, p1, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public getActiveIndicatorLabelPadding()I
    .locals 1

    .line 375
    iget v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorLabelPadding:I

    return v0
.end method

.method public getBadge(I)Lcom/google/android/material/badge/BadgeDrawable;
    .locals 1

    .line 882
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->badgeDrawables:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/badge/BadgeDrawable;

    return-object p1
.end method

.method public getBadgeDrawables()Landroid/util/SparseArray;
    .locals 1

    .line 859
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->badgeDrawables:Landroid/util/SparseArray;

    return-object v0
.end method

.method public getIconTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 193
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemIconTint:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getItemActiveIndicatorColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 539
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorColor:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getItemActiveIndicatorEnabled()Z
    .locals 1

    .line 396
    iget-boolean v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorEnabled:Z

    return v0
.end method

.method public getItemActiveIndicatorHeight()I
    .locals 1

    .line 444
    iget v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorHeight:I

    return v0
.end method

.method public getItemActiveIndicatorMarginHorizontal()I
    .locals 1

    .line 469
    iget v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorMarginHorizontal:I

    return v0
.end method

.method public getItemActiveIndicatorShapeAppearance()Lcom/google/android/material/shape/ShapeAppearanceModel;
    .locals 1

    .line 494
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorShapeAppearance:Lcom/google/android/material/shape/ShapeAppearanceModel;

    return-object v0
.end method

.method public getItemActiveIndicatorWidth()I
    .locals 1

    .line 420
    iget v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorWidth:I

    return v0
.end method

.method public getItemBackground()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 635
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz v0, :cond_0

    array-length v1, v0

    if-lez v1, :cond_0

    const/4 v1, 0x0

    .line 638
    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0

    .line 640
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemBackground:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getItemBackgroundRes()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 585
    iget v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemBackgroundRes:I

    return v0
.end method

.method public getItemIconSize()I
    .locals 1

    .line 215
    iget v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemIconSize:I

    return v0
.end method

.method public getItemPaddingBottom()I
    .locals 1

    .line 355
    iget v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemPaddingBottom:I

    return v0
.end method

.method public getItemPaddingTop()I
    .locals 1

    .line 334
    iget v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemPaddingTop:I

    return v0
.end method

.method public getItemRippleColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 625
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemRippleColor:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getItemTextAppearanceActive()I
    .locals 1

    .line 311
    iget v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemTextAppearanceActive:I

    return v0
.end method

.method public getItemTextAppearanceInactive()I
    .locals 1

    .line 268
    iget v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemTextAppearanceInactive:I

    return v0
.end method

.method public getItemTextColor()Landroid/content/res/ColorStateList;
    .locals 1

    .line 239
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemTextColorFromUser:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public getLabelVisibilityMode()I
    .locals 1

    .line 667
    iget v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->labelVisibilityMode:I

    return v0
.end method

.method public getMenu()Ll/ۗۜ;
    .locals 1

    .line 967
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->menu:Ll/ۗۜ;

    return-object v0
.end method

.method public getOrCreateBadge(I)Lcom/google/android/material/badge/BadgeDrawable;
    .locals 2

    .line 893
    invoke-direct {p0, p1}, Lcom/google/android/material/navigation/NavigationBarMenuView;->validateMenuItemId(I)V

    .line 894
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->badgeDrawables:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/badge/BadgeDrawable;

    if-nez v0, :cond_0

    .line 897
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/material/badge/BadgeDrawable;->create(Landroid/content/Context;)Lcom/google/android/material/badge/BadgeDrawable;

    move-result-object v0

    .line 898
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->badgeDrawables:Landroid/util/SparseArray;

    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 900
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarMenuView;->findItemView(I)Lcom/google/android/material/navigation/NavigationBarItemView;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 902
    invoke-virtual {p1, v0}, Lcom/google/android/material/navigation/NavigationBarItemView;->setBadge(Lcom/google/android/material/badge/BadgeDrawable;)V

    :cond_1
    return-object v0
.end method

.method public getSelectedItemId()I
    .locals 1

    .line 835
    iget v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->selectedItemId:I

    return v0
.end method

.method public getSelectedItemPosition()I
    .locals 1

    .line 962
    iget v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->selectedItemPosition:I

    return v0
.end method

.method public getWindowAnimations()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public initialize(Ll/ۗۜ;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->menu:Ll/ۗۜ;

    return-void
.end method

.method public isItemActiveIndicatorResizeable()Z
    .locals 1

    .line 516
    iget-boolean v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorResizeable:Z

    return v0
.end method

.method public isShifting(II)Z
    .locals 3

    const/4 v0, -0x1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p1, v0, :cond_1

    const/4 p1, 0x3

    if-le p2, p1, :cond_0

    return v2

    :cond_0
    return v1

    :cond_1
    if-nez p1, :cond_2

    return v2

    :cond_2
    return v1
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 3

    .line 162
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 163
    invoke-static {p1}, Ll/ܳ۟;->֫(Landroid/view/accessibility/AccessibilityNodeInfo;)Ll/ܳ۟;

    move-result-object p1

    .line 164
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->menu:Ll/ۗۜ;

    .line 167
    invoke-virtual {v0}, Ll/ۗۜ;->getVisibleItems()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 165
    invoke-static {v2, v0, v2, v1}, Ll/ܽ۟;->֫(IIIZ)Ll/ܽ۟;

    move-result-object v0

    .line 164
    invoke-virtual {p1, v0}, Ll/ܳ۟;->֫(Ll/ܽ۟;)V

    return-void
.end method

.method public removeBadge(I)V
    .locals 2

    .line 908
    invoke-direct {p0, p1}, Lcom/google/android/material/navigation/NavigationBarMenuView;->validateMenuItemId(I)V

    .line 909
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarMenuView;->findItemView(I)Lcom/google/android/material/navigation/NavigationBarItemView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 911
    invoke-virtual {v0}, Lcom/google/android/material/navigation/NavigationBarItemView;->removeBadge()V

    .line 913
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->badgeDrawables:Landroid/util/SparseArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public restoreBadgeDrawables(Landroid/util/SparseArray;)V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 863
    :goto_0
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 864
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v2

    .line 865
    iget-object v3, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->badgeDrawables:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v3

    if-gez v3, :cond_0

    .line 867
    iget-object v3, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->badgeDrawables:Landroid/util/SparseArray;

    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/material/badge/BadgeDrawable;

    invoke-virtual {v3, v2, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 870
    :cond_1
    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz p1, :cond_3

    .line 871
    array-length v1, p1

    :goto_1
    if-ge v0, v1, :cond_3

    aget-object v2, p1, v0

    .line 872
    iget-object v3, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->badgeDrawables:Landroid/util/SparseArray;

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/material/badge/BadgeDrawable;

    if-eqz v3, :cond_2

    .line 874
    invoke-virtual {v2, v3}, Lcom/google/android/material/navigation/NavigationBarItemView;->setBadge(Lcom/google/android/material/badge/BadgeDrawable;)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public setActiveIndicatorLabelPadding(I)V
    .locals 4

    .line 382
    iput p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorLabelPadding:I

    .line 383
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz v0, :cond_0

    .line 384
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 385
    invoke-virtual {v3, p1}, Lcom/google/android/material/navigation/NavigationBarItemView;->setActiveIndicatorLabelPadding(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 4

    .line 178
    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemIconTint:Landroid/content/res/ColorStateList;

    .line 179
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz v0, :cond_0

    .line 180
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 181
    invoke-virtual {v3, p1}, Lcom/google/android/material/navigation/NavigationBarItemView;->setIconTintList(Landroid/content/res/ColorStateList;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V
    .locals 4

    .line 548
    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorColor:Landroid/content/res/ColorStateList;

    .line 549
    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz p1, :cond_0

    .line 550
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 551
    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationBarMenuView;->createItemActiveIndicatorDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/material/navigation/NavigationBarItemView;->setActiveIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorEnabled(Z)V
    .locals 4

    .line 405
    iput-boolean p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorEnabled:Z

    .line 406
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz v0, :cond_0

    .line 407
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 408
    invoke-virtual {v3, p1}, Lcom/google/android/material/navigation/NavigationBarItemView;->setActiveIndicatorEnabled(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorHeight(I)V
    .locals 4

    .line 453
    iput p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorHeight:I

    .line 454
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz v0, :cond_0

    .line 455
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 456
    invoke-virtual {v3, p1}, Lcom/google/android/material/navigation/NavigationBarItemView;->setActiveIndicatorHeight(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorMarginHorizontal(I)V
    .locals 4

    .line 479
    iput p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorMarginHorizontal:I

    .line 480
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz v0, :cond_0

    .line 481
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 482
    invoke-virtual {v3, p1}, Lcom/google/android/material/navigation/NavigationBarItemView;->setActiveIndicatorMarginHorizontal(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorResizeable(Z)V
    .locals 4

    .line 524
    iput-boolean p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorResizeable:Z

    .line 525
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz v0, :cond_0

    .line 526
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 527
    invoke-virtual {v3, p1}, Lcom/google/android/material/navigation/NavigationBarItemView;->setActiveIndicatorResizeable(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorShapeAppearance(Lcom/google/android/material/shape/ShapeAppearanceModel;)V
    .locals 4

    .line 504
    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorShapeAppearance:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 505
    iget-object p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz p1, :cond_0

    .line 506
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 507
    invoke-direct {p0}, Lcom/google/android/material/navigation/NavigationBarMenuView;->createItemActiveIndicatorDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/material/navigation/NavigationBarItemView;->setActiveIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setItemActiveIndicatorWidth(I)V
    .locals 4

    .line 429
    iput p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemActiveIndicatorWidth:I

    .line 430
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz v0, :cond_0

    .line 431
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 432
    invoke-virtual {v3, p1}, Lcom/google/android/material/navigation/NavigationBarItemView;->setActiveIndicatorWidth(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 594
    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemBackground:Landroid/graphics/drawable/Drawable;

    .line 595
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz v0, :cond_0

    .line 596
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 597
    invoke-virtual {v3, p1}, Lcom/google/android/material/navigation/NavigationBarItemView;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setItemBackgroundRes(I)V
    .locals 4

    .line 320
    iput p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemBackgroundRes:I

    .line 321
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz v0, :cond_0

    .line 322
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 323
    invoke-virtual {v3, p1}, Lcom/google/android/material/navigation/NavigationBarItemView;->setItemBackground(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setItemIconSize(I)V
    .locals 4

    .line 204
    iput p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemIconSize:I

    .line 205
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz v0, :cond_0

    .line 206
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 207
    invoke-virtual {v3, p1}, Lcom/google/android/material/navigation/NavigationBarItemView;->setIconSize(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setItemOnTouchListener(ILandroid/view/View$OnTouchListener;)V
    .locals 5

    if-nez p2, :cond_0

    .line 677
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->onTouchListeners:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    goto :goto_0

    .line 679
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->onTouchListeners:Landroid/util/SparseArray;

    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 681
    :goto_0
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz v0, :cond_2

    .line 682
    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    .line 683
    invoke-virtual {v3}, Lcom/google/android/material/navigation/NavigationBarItemView;->getItemData()Ll/ۛۜ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۛۜ;->getItemId()I

    move-result v4

    if-ne v4, p1, :cond_1

    .line 684
    invoke-virtual {v3, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public setItemPaddingBottom(I)V
    .locals 4

    .line 362
    iput p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemPaddingBottom:I

    .line 363
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz v0, :cond_0

    .line 364
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 365
    invoke-virtual {v3, p1}, Lcom/google/android/material/navigation/NavigationBarItemView;->setItemPaddingBottom(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setItemPaddingTop(I)V
    .locals 4

    .line 342
    iput p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemPaddingTop:I

    .line 343
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz v0, :cond_0

    .line 344
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 345
    invoke-virtual {v3, p1}, Lcom/google/android/material/navigation/NavigationBarItemView;->setItemPaddingTop(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setItemRippleColor(Landroid/content/res/ColorStateList;)V
    .locals 4

    .line 610
    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemRippleColor:Landroid/content/res/ColorStateList;

    .line 611
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz v0, :cond_0

    .line 612
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 613
    invoke-virtual {v3, p1}, Lcom/google/android/material/navigation/NavigationBarItemView;->setItemRippleColor(Landroid/content/res/ColorStateList;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setItemTextAppearanceActive(I)V
    .locals 5

    .line 277
    iput p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemTextAppearanceActive:I

    .line 278
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz v0, :cond_1

    .line 279
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 280
    invoke-virtual {v3, p1}, Lcom/google/android/material/navigation/NavigationBarItemView;->setTextAppearanceActive(I)V

    .line 283
    iget-object v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemTextColorFromUser:Landroid/content/res/ColorStateList;

    if-eqz v4, :cond_0

    .line 284
    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public setItemTextAppearanceActiveBoldEnabled(Z)V
    .locals 4

    .line 296
    iput-boolean p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemTextAppearanceActiveBoldEnabled:Z

    .line 297
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz v0, :cond_0

    .line 298
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 299
    invoke-virtual {v3, p1}, Lcom/google/android/material/navigation/NavigationBarItemView;->setTextAppearanceActiveBoldEnabled(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setItemTextAppearanceInactive(I)V
    .locals 5

    .line 248
    iput p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemTextAppearanceInactive:I

    .line 249
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz v0, :cond_1

    .line 250
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 251
    invoke-virtual {v3, p1}, Lcom/google/android/material/navigation/NavigationBarItemView;->setTextAppearanceInactive(I)V

    .line 254
    iget-object v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemTextColorFromUser:Landroid/content/res/ColorStateList;

    if-eqz v4, :cond_0

    .line 255
    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarItemView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public setItemTextColor(Landroid/content/res/ColorStateList;)V
    .locals 4

    .line 224
    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->itemTextColorFromUser:Landroid/content/res/ColorStateList;

    .line 225
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-eqz v0, :cond_0

    .line 226
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 227
    invoke-virtual {v3, p1}, Lcom/google/android/material/navigation/NavigationBarItemView;->setTextColor(Landroid/content/res/ColorStateList;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setLabelVisibilityMode(I)V
    .locals 0

    .line 658
    iput p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->labelVisibilityMode:I

    return-void
.end method

.method public setPresenter(Lcom/google/android/material/navigation/NavigationBarPresenter;)V
    .locals 0

    .line 712
    iput-object p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->presenter:Lcom/google/android/material/navigation/NavigationBarPresenter;

    return-void
.end method

.method public tryRestoreSelectedItemId(I)V
    .locals 4

    .line 846
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->menu:Ll/ۗۜ;

    invoke-virtual {v0}, Ll/ۗۜ;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 848
    iget-object v2, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->menu:Ll/ۗۜ;

    invoke-virtual {v2, v1}, Ll/ۗۜ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v2

    .line 849
    invoke-interface {v2}, Landroid/view/MenuItem;->getItemId()I

    move-result v3

    if-ne p1, v3, :cond_0

    .line 850
    iput p1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->selectedItemId:I

    .line 851
    iput v1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->selectedItemPosition:I

    const/4 p1, 0x1

    .line 852
    invoke-interface {v2, p1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public updateMenuView()V
    .locals 6

    .line 791
    iget-object v0, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->menu:Ll/ۗۜ;

    if-eqz v0, :cond_5

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    if-nez v1, :cond_0

    goto/16 :goto_2

    .line 795
    :cond_0
    invoke-virtual {v0}, Ll/ۗۜ;->size()I

    move-result v0

    .line 796
    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    array-length v1, v1

    if-eq v0, v1, :cond_1

    .line 798
    invoke-virtual {p0}, Lcom/google/android/material/navigation/NavigationBarMenuView;->buildMenuView()V

    return-void

    .line 802
    :cond_1
    iget v1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->selectedItemId:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_3

    .line 805
    iget-object v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->menu:Ll/ۗۜ;

    invoke-virtual {v4, v3}, Ll/ۗۜ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v4

    .line 806
    invoke-interface {v4}, Landroid/view/MenuItem;->isChecked()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 807
    invoke-interface {v4}, Landroid/view/MenuItem;->getItemId()I

    move-result v4

    iput v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->selectedItemId:I

    .line 808
    iput v3, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->selectedItemPosition:I

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 811
    :cond_3
    iget v3, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->selectedItemId:I

    if-eq v1, v3, :cond_4

    iget-object v1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->set:Ll/ۖۨۧ;

    if-eqz v1, :cond_4

    .line 813
    invoke-static {p0, v1}, Ll/᩻ۨۧ;->֫(Landroid/view/ViewGroup;Ll/ܽۨۧ;)V

    .line 816
    :cond_4
    iget v1, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->labelVisibilityMode:I

    iget-object v3, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->menu:Ll/ۗۜ;

    invoke-virtual {v3}, Ll/ۗۜ;->getVisibleItems()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {p0, v1, v3}, Lcom/google/android/material/navigation/NavigationBarMenuView;->isShifting(II)Z

    move-result v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v0, :cond_5

    .line 818
    iget-object v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->presenter:Lcom/google/android/material/navigation/NavigationBarPresenter;

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Lcom/google/android/material/navigation/NavigationBarPresenter;->setUpdateSuspended(Z)V

    .line 819
    iget-object v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    aget-object v4, v4, v3

    iget v5, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->labelVisibilityMode:I

    invoke-virtual {v4, v5}, Lcom/google/android/material/navigation/NavigationBarItemView;->setLabelVisibilityMode(I)V

    .line 820
    iget-object v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    aget-object v4, v4, v3

    invoke-virtual {v4, v1}, Lcom/google/android/material/navigation/NavigationBarItemView;->setShifting(Z)V

    .line 821
    iget-object v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->buttons:[Lcom/google/android/material/navigation/NavigationBarItemView;

    aget-object v4, v4, v3

    iget-object v5, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->menu:Ll/ۗۜ;

    invoke-virtual {v5, v3}, Ll/ۗۜ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v5

    check-cast v5, Ll/ۛۜ;

    invoke-virtual {v4, v5, v2}, Lcom/google/android/material/navigation/NavigationBarItemView;->initialize(Ll/ۛۜ;I)V

    .line 822
    iget-object v4, p0, Lcom/google/android/material/navigation/NavigationBarMenuView;->presenter:Lcom/google/android/material/navigation/NavigationBarPresenter;

    invoke-virtual {v4, v2}, Lcom/google/android/material/navigation/NavigationBarPresenter;->setUpdateSuspended(Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    :goto_2
    return-void
.end method
