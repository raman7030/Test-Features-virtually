.class public Lcom/google/android/material/bottomnavigation/BottomNavigationView;
.super Lcom/google/android/material/navigation/NavigationBarView;
.source "BottomNavigationView.java"


# static fields
.field public static final MAX_ITEM_COUNT:I = 0x5


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 99
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/bottomnavigation/BottomNavigationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 103
    sget v0, Ll/ᩳ۠ܺ;->ۘܽ:I

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/bottomnavigation/BottomNavigationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 108
    sget v0, Ll/ᩴ۠ܺ;->ܽ᩶:I

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/android/material/bottomnavigation/BottomNavigationView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 7

    .line 113
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/material/navigation/NavigationBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 116
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 119
    sget-object v2, Ll/᩵۠ܺ;->ۢ᩷:[I

    const/4 v6, 0x0

    new-array v5, v6, [I

    move-object v0, p1

    move-object v1, p2

    move v3, p3

    move v4, p4

    .line 120
    invoke-static/range {v0 .. v5}, Lcom/google/android/material/internal/ThemeEnforcement;->obtainTintedStyledAttributes(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Ll/᩺ۘ;

    move-result-object p2

    .line 123
    sget p3, Ll/᩵۠ܺ;->ۖ᩷:I

    const/4 p4, 0x1

    .line 124
    invoke-virtual {p2, p3, p4}, Ll/᩺ۘ;->֫(IZ)Z

    move-result p3

    .line 123
    invoke-virtual {p0, p3}, Lcom/google/android/material/bottomnavigation/BottomNavigationView;->setItemHorizontalTranslationEnabled(Z)V

    .line 127
    sget p3, Ll/᩵۠ܺ;->ۡ᩷:I

    invoke-virtual {p2, p3}, Ll/᩺ۘ;->ۜ(I)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 128
    sget p3, Ll/᩵۠ܺ;->ۡ᩷:I

    .line 129
    invoke-virtual {p2, p3, v6}, Ll/᩺ۘ;->ۧ(II)I

    move-result p3

    .line 128
    invoke-virtual {p0, p3}, Landroid/view/View;->setMinimumHeight(I)V

    .line 132
    :cond_0
    sget p3, Ll/᩵۠ܺ;->ܺ᩷:I

    invoke-virtual {p2, p3, p4}, Ll/᩺ۘ;->֫(IZ)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 133
    invoke-direct {p0}, Lcom/google/android/material/bottomnavigation/BottomNavigationView;->shouldDrawCompatibilityTopDivider()Z

    move-result p3

    if-eqz p3, :cond_1

    .line 134
    invoke-direct {p0, p1}, Lcom/google/android/material/bottomnavigation/BottomNavigationView;->addCompatibilityTopDivider(Landroid/content/Context;)V

    .line 137
    :cond_1
    invoke-virtual {p2}, Ll/᩺ۘ;->ܿ()V

    .line 139
    invoke-direct {p0}, Lcom/google/android/material/bottomnavigation/BottomNavigationView;->applyWindowInsets()V

    return-void
.end method

.method private addCompatibilityTopDivider(Landroid/content/Context;)V
    .locals 3

    .line 238
    new-instance v0, Landroid/view/View;

    invoke-direct {v0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 239
    sget v1, Ll/ܳ۠ܺ;->ۘ֫:I

    .line 240
    invoke-static {p1, v1}, Ll/֨ۙ;->֫(Landroid/content/Context;I)I

    move-result p1

    .line 239
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 241
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 244
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Ll/᩻۠ܺ;->ᩳܽ:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    const/4 v2, -0x1

    invoke-direct {p1, v2, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 245
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 246
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method private applyWindowInsets()V
    .locals 1

    .line 143
    new-instance v0, Lcom/google/android/material/bottomnavigation/BottomNavigationView$1;

    invoke-direct {v0, p0}, Lcom/google/android/material/bottomnavigation/BottomNavigationView$1;-><init>(Lcom/google/android/material/bottomnavigation/BottomNavigationView;)V

    invoke-static {p0, v0}, Lcom/google/android/material/internal/ViewUtils;->doOnApplyWindowInsets(Landroid/view/View;Lcom/google/android/material/internal/ViewUtils$OnApplyWindowInsetsListener;)V

    return-void
.end method

.method private makeMinHeightSpec(I)I
    .locals 4

    .line 174
    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v0

    .line 175
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    if-eq v1, v2, :cond_0

    if-lez v0, :cond_0

    .line 176
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    add-int/2addr v3, v1

    add-int/2addr v3, v0

    .line 179
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 178
    invoke-static {p1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    :cond_0
    return p1
.end method

.method private shouldDrawCompatibilityTopDivider()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public createNavigationBarMenuView(Landroid/content/Context;)Lcom/google/android/material/navigation/NavigationBarMenuView;
    .locals 1

    .line 221
    new-instance v0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;

    invoke-direct {v0, p1}, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public getMaxItemCount()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public isItemHorizontalTranslationEnabled()Z
    .locals 1

    .line 208
    invoke-virtual {p0}, Lcom/google/android/material/navigation/NavigationBarView;->getMenuView()Ll/ۜ᩷;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;

    invoke-virtual {v0}, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->isItemHorizontalTranslationEnabled()Z

    move-result v0

    return v0
.end method

.method public onMeasure(II)V
    .locals 0

    .line 169
    invoke-direct {p0, p2}, Lcom/google/android/material/bottomnavigation/BottomNavigationView;->makeMinHeightSpec(I)I

    move-result p2

    .line 170
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void
.end method

.method public setItemHorizontalTranslationEnabled(Z)V
    .locals 2

    .line 193
    invoke-virtual {p0}, Lcom/google/android/material/navigation/NavigationBarView;->getMenuView()Ll/ۜ᩷;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;

    .line 194
    invoke-virtual {v0}, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->isItemHorizontalTranslationEnabled()Z

    move-result v1

    if-eq v1, p1, :cond_0

    .line 195
    invoke-virtual {v0, p1}, Lcom/google/android/material/bottomnavigation/BottomNavigationMenuView;->setItemHorizontalTranslationEnabled(Z)V

    .line 196
    invoke-virtual {p0}, Lcom/google/android/material/navigation/NavigationBarView;->getPresenter()Lcom/google/android/material/navigation/NavigationBarPresenter;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/google/android/material/navigation/NavigationBarPresenter;->updateMenuView(Z)V

    :cond_0
    return-void
.end method

.method public setOnNavigationItemReselectedListener(Lcom/google/android/material/bottomnavigation/BottomNavigationView$OnNavigationItemReselectedListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 277
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setOnItemReselectedListener(Lcom/google/android/material/navigation/NavigationBarView$OnItemReselectedListener;)V

    return-void
.end method

.method public setOnNavigationItemSelectedListener(Lcom/google/android/material/bottomnavigation/BottomNavigationView$OnNavigationItemSelectedListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 262
    invoke-virtual {p0, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setOnItemSelectedListener(Lcom/google/android/material/navigation/NavigationBarView$OnItemSelectedListener;)V

    return-void
.end method
