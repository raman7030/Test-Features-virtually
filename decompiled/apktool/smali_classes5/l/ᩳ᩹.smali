.class public Ll/ᩳ᩹;
.super Landroid/view/ViewGroup;
.source "S6AR"

# interfaces
.implements Ll/۟ۛ;
.implements Ll/֫ۨ;


# static fields
.field public static final CONSTRUCTOR_PARAMS:[Ljava/lang/Class;

.field public static final EVENT_NESTED_SCROLL:I = 0x1

.field public static final EVENT_PRE_DRAW:I = 0x0

.field public static final EVENT_VIEW_REMOVED:I = 0x2

.field public static final TAG:Ljava/lang/String; = "CoordinatorLayout"

.field public static final TOP_SORTED_CHILDREN_COMPARATOR:Ljava/util/Comparator;

.field public static final TYPE_ON_INTERCEPT:I = 0x0

.field public static final TYPE_ON_TOUCH:I = 0x1

.field public static final WIDGET_PACKAGE_NAME:Ljava/lang/String;

.field public static final sConstructors:Ljava/lang/ThreadLocal;

.field public static final sRectPool:Ll/ۛۤ;


# instance fields
.field public mApplyWindowInsetsListener:Ll/ܽۨ;

.field public final mBehaviorConsumed:[I

.field public mBehaviorTouchView:Landroid/view/View;

.field public final mChildDag:Ll/ܿ᩹;

.field public final mDependencySortedChildren:Ljava/util/List;

.field public mDisallowInterceptReset:Z

.field public mDrawStatusBarBackground:Z

.field public mIsAttachedToWindow:Z

.field public mKeylines:[I

.field public mLastInsets:Ll/᩸ܰ;

.field public mNeedsPreDrawListener:Z

.field public final mNestedScrollingParentHelper:Ll/ۧۨ;

.field public mNestedScrollingTarget:Landroid/view/View;

.field public final mNestedScrollingV2ConsumedCompat:[I

.field public mOnHierarchyChangeListener:Landroid/view/ViewGroup$OnHierarchyChangeListener;

.field public mOnPreDrawListener:Ll/۟᩸;

.field public mScrimPaint:Landroid/graphics/Paint;

.field public mStatusBarBackground:Landroid/graphics/drawable/Drawable;

.field public final mTempDependenciesList:Ljava/util/List;

.field public final mTempList1:Ljava/util/List;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 118
    const-class v0, Ll/ᩳ᩹;

    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 119
    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-object v0, Ll/ᩳ᩹;->WIDGET_PACKAGE_NAME:Ljava/lang/String;

    .line 127
    new-instance v0, Ll/ܽ᩹;

    .line 2031
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 127
    sput-object v0, Ll/ᩳ᩹;->TOP_SORTED_CHILDREN_COMPARATOR:Ljava/util/Comparator;

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Class;

    .line 133
    const-class v1, Landroid/content/Context;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Landroid/util/AttributeSet;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Ll/ᩳ᩹;->CONSTRUCTOR_PARAMS:[Ljava/lang/Class;

    .line 138
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/ᩳ᩹;->sConstructors:Ljava/lang/ThreadLocal;

    .line 152
    new-instance v0, Ll/᩺ۤ;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Ll/᩺ۤ;-><init>(I)V

    sput-object v0, Ll/ᩳ᩹;->sRectPool:Ll/ۛۤ;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 207
    invoke-direct {p0, p1, v0}, Ll/ᩳ᩹;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f040153

    .line 211
    invoke-direct {p0, p1, p2, v0}, Ll/ᩳ᩹;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9

    .line 216
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 168
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ᩳ᩹;->mDependencySortedChildren:Ljava/util/List;

    .line 169
    new-instance v0, Ll/ܿ᩹;

    invoke-direct {v0}, Ll/ܿ᩹;-><init>()V

    iput-object v0, p0, Ll/ᩳ᩹;->mChildDag:Ll/ܿ᩹;

    .line 171
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ᩳ᩹;->mTempList1:Ljava/util/List;

    .line 172
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ᩳ᩹;->mTempDependenciesList:Ljava/util/List;

    const/4 v0, 0x2

    new-array v1, v0, [I

    .line 178
    iput-object v1, p0, Ll/ᩳ᩹;->mBehaviorConsumed:[I

    new-array v0, v0, [I

    .line 182
    iput-object v0, p0, Ll/ᩳ᩹;->mNestedScrollingV2ConsumedCompat:[I

    .line 203
    new-instance v0, Ll/ۧۨ;

    .line 50
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 203
    iput-object v0, p0, Ll/ᩳ᩹;->mNestedScrollingParentHelper:Ll/ۧۨ;

    .line 218
    sget-object v3, Ll/۬᩸;->֫:[I

    const/4 v0, 0x0

    if-nez p3, :cond_0

    const v1, 0x7f1304e2

    .line 219
    invoke-virtual {p1, p2, v3, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    goto :goto_0

    .line 221
    :cond_0
    invoke-virtual {p1, p2, v3, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    :goto_0
    move-object v8, v1

    .line 223
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-lt v1, v2, :cond_2

    if-nez p3, :cond_1

    const/4 v6, 0x0

    const v7, 0x7f1304e2

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, v8

    .line 225
    invoke-virtual/range {v1 .. v7}, Landroid/view/ViewGroup;->saveAttributeDataForStyleable(Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, v8

    move v6, p3

    .line 229
    invoke-virtual/range {v1 .. v7}, Landroid/view/ViewGroup;->saveAttributeDataForStyleable(Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 234
    :cond_2
    :goto_1
    invoke-virtual {v8, v0, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    if-eqz p2, :cond_3

    .line 236
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 237
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object p2

    iput-object p2, p0, Ll/ᩳ᩹;->mKeylines:[I

    .line 238
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 239
    iget-object p2, p0, Ll/ᩳ᩹;->mKeylines:[I

    array-length p2, p2

    :goto_2
    if-ge v0, p2, :cond_3

    .line 241
    iget-object p3, p0, Ll/ᩳ᩹;->mKeylines:[I

    aget v1, p3, v0

    int-to-float v1, v1

    mul-float v1, v1, p1

    float-to-int v1, v1

    aput v1, p3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    const/4 p1, 0x1

    .line 244
    invoke-virtual {v8, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iput-object p2, p0, Ll/ᩳ᩹;->mStatusBarBackground:Landroid/graphics/drawable/Drawable;

    .line 245
    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    .line 247
    invoke-direct {p0}, Ll/ᩳ᩹;->ܽ()V

    .line 248
    new-instance p2, Ll/᩺᩸;

    invoke-direct {p2, p0}, Ll/᩺᩸;-><init>(Ll/ᩳ᩹;)V

    invoke-super {p0, p2}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    .line 250
    sget p2, Ll/ܿ᩺;->֫:I

    .line 1400
    invoke-virtual {p0}, Landroid/view/View;->getImportantForAccessibility()I

    move-result p2

    if-nez p2, :cond_4

    .line 1427
    invoke-virtual {p0, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    :cond_4
    return-void
.end method

.method private ֫(I)I
    .locals 3

    .line 600
    iget-object v0, p0, Ll/ᩳ᩹;->mKeylines:[I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 601
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    return v1

    :cond_0
    if-ltz p1, :cond_2

    .line 605
    array-length v2, v0

    if-lt p1, v2, :cond_1

    goto :goto_0

    .line 610
    :cond_1
    aget p1, v0, p1

    return p1

    .line 606
    :cond_2
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    return v1
.end method

.method public static ֫(III)I
    .locals 0

    if-ge p0, p1, :cond_0

    return p1

    :cond_0
    if-le p0, p2, :cond_1

    return p2

    :cond_1
    return p0
.end method

.method public static ֫()Landroid/graphics/Rect;
    .locals 1

    .line 156
    sget-object v0, Ll/ᩳ᩹;->sRectPool:Ll/ۛۤ;

    invoke-interface {v0}, Ll/ۛۤ;->֫()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    if-nez v0, :cond_0

    .line 158
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    :cond_0
    return-object v0
.end method

.method public static ֫(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/String;)Ll/ۛ᩸;
    .locals 5

    .line 615
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "."

    .line 620
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 622
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_1
    const/16 v0, 0x2e

    .line 623
    invoke-virtual {p2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-ltz v1, :cond_2

    goto :goto_0

    .line 628
    :cond_2
    sget-object v1, Ll/ᩳ᩹;->WIDGET_PACKAGE_NAME:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 634
    :cond_3
    :goto_0
    :try_start_0
    sget-object v0, Ll/ᩳ᩹;->sConstructors:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    if-nez v1, :cond_4

    .line 636
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 637
    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 639
    :cond_4
    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_5

    .line 642
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {p2, v3, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    .line 643
    sget-object v4, Ll/ᩳ᩹;->CONSTRUCTOR_PARAMS:[Ljava/lang/Class;

    invoke-virtual {v0, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 644
    invoke-virtual {v0, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 645
    invoke-interface {v1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p0, v1, v3

    aput-object p1, v1, v2

    .line 647
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۛ᩸;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 649
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Could not inflate Behavior subclass "

    .line 0
    invoke-static {v0, p2}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 649
    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method private ֫(Ll/᩸ܰ;)Ll/᩸ܰ;
    .locals 4

    .line 854
    invoke-virtual {p1}, Ll/᩸ܰ;->ܺ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    .line 858
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 859
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 860
    sget v3, Ll/ܿ᩺;->֫:I

    .line 2854
    invoke-virtual {v2}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 861
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Ll/ܰ᩸;

    .line 2952
    iget-object v3, v3, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    if-eqz v3, :cond_1

    .line 866
    invoke-virtual {v3, p0, v2, p1}, Ll/ۛ᩸;->onApplyWindowInsets(Ll/ᩳ᩹;Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;

    move-result-object p1

    .line 867
    invoke-virtual {p1}, Ll/᩸ܰ;->ܺ()Z

    move-result v2

    if-eqz v2, :cond_1

    return-object p1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object p1
.end method

.method public static ֫(Landroid/graphics/Rect;)V
    .locals 1

    .line 164
    invoke-virtual {p0}, Landroid/graphics/Rect;->setEmpty()V

    .line 165
    sget-object v0, Ll/ᩳ᩹;->sRectPool:Ll/ۛۤ;

    invoke-interface {v0, p0}, Ll/ۛۤ;->֫(Ljava/lang/Object;)Z

    return-void
.end method

.method private ֫(Landroid/view/View;I)V
    .locals 9

    .line 1193
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܰ᩸;

    .line 1194
    invoke-static {}, Ll/ᩳ᩹;->֫()Landroid/graphics/Rect;

    move-result-object v7

    .line 1195
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v1, v2

    .line 1196
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v2, v3

    .line 1197
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    sub-int/2addr v3, v4

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v3, v4

    .line 1198
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v5

    sub-int/2addr v4, v5

    iget v5, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v4, v5

    .line 1195
    invoke-virtual {v7, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 1200
    iget-object v1, p0, Ll/ᩳ᩹;->mLastInsets:Ll/᩸ܰ;

    if-eqz v1, :cond_0

    sget v1, Ll/ܿ᩺;->֫:I

    .line 2854
    invoke-virtual {p0}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1204
    iget v1, v7, Landroid/graphics/Rect;->left:I

    iget-object v2, p0, Ll/ᩳ᩹;->mLastInsets:Ll/᩸ܰ;

    invoke-virtual {v2}, Ll/᩸ܰ;->ۜ()I

    move-result v2

    add-int/2addr v2, v1

    iput v2, v7, Landroid/graphics/Rect;->left:I

    .line 1205
    iget v1, v7, Landroid/graphics/Rect;->top:I

    iget-object v2, p0, Ll/ᩳ᩹;->mLastInsets:Ll/᩸ܰ;

    invoke-virtual {v2}, Ll/᩸ܰ;->ۢ()I

    move-result v2

    add-int/2addr v2, v1

    iput v2, v7, Landroid/graphics/Rect;->top:I

    .line 1206
    iget v1, v7, Landroid/graphics/Rect;->right:I

    iget-object v2, p0, Ll/ᩳ᩹;->mLastInsets:Ll/᩸ܰ;

    invoke-virtual {v2}, Ll/᩸ܰ;->᩷()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v7, Landroid/graphics/Rect;->right:I

    .line 1207
    iget v1, v7, Landroid/graphics/Rect;->bottom:I

    iget-object v2, p0, Ll/ᩳ᩹;->mLastInsets:Ll/᩸ܰ;

    invoke-virtual {v2}, Ll/᩸ܰ;->᩻()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v7, Landroid/graphics/Rect;->bottom:I

    .line 1210
    :cond_0
    invoke-static {}, Ll/ᩳ᩹;->֫()Landroid/graphics/Rect;

    move-result-object v8

    .line 1211
    iget v0, v0, Ll/ܰ᩸;->ܽ:I

    invoke-static {v0}, Ll/ᩳ᩹;->ܽ(I)I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    .line 1212
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    move-object v4, v7

    move-object v5, v8

    move v6, p2

    .line 64
    invoke-static/range {v1 .. v6}, Landroid/view/Gravity;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;I)V

    .line 1213
    iget p2, v8, Landroid/graphics/Rect;->left:I

    iget v0, v8, Landroid/graphics/Rect;->top:I

    iget v1, v8, Landroid/graphics/Rect;->right:I

    iget v2, v8, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1, p2, v0, v1, v2}, Landroid/view/View;->layout(IIII)V

    .line 1215
    invoke-static {v7}, Ll/ᩳ᩹;->֫(Landroid/graphics/Rect;)V

    .line 1216
    invoke-static {v8}, Ll/ᩳ᩹;->֫(Landroid/graphics/Rect;)V

    return-void
.end method

.method private ֫(Landroid/view/View;II)V
    .locals 8

    .line 1130
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܰ᩸;

    .line 1131
    iget v1, v0, Ll/ܰ᩸;->ܽ:I

    .line 1132
    invoke-static {v1}, Ll/ᩳ᩹;->ᩳ(I)I

    move-result v1

    .line 134
    invoke-static {v1, p3}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v1

    and-int/lit8 v2, v1, 0x7

    and-int/lit8 v1, v1, 0x70

    .line 1136
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    .line 1137
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    .line 1138
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    .line 1139
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    const/4 v7, 0x1

    if-ne p3, v7, :cond_0

    sub-int p2, v3, p2

    .line 1145
    :cond_0
    invoke-direct {p0, p2}, Ll/ᩳ᩹;->֫(I)I

    move-result p2

    sub-int/2addr p2, v5

    if-eq v2, v7, :cond_2

    const/4 p3, 0x5

    if-eq v2, p3, :cond_1

    goto :goto_0

    :cond_1
    add-int/2addr p2, v5

    goto :goto_0

    .line 1157
    :cond_2
    div-int/lit8 p3, v5, 0x2

    add-int/2addr p2, p3

    :goto_0
    const/16 p3, 0x10

    if-eq v1, p3, :cond_4

    const/16 p3, 0x50

    if-eq v1, p3, :cond_3

    const/4 p3, 0x0

    goto :goto_1

    :cond_3
    move p3, v6

    goto :goto_1

    .line 1170
    :cond_4
    div-int/lit8 p3, v6, 0x2

    .line 1175
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v1, v2

    .line 1177
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v3, v2

    sub-int/2addr v3, v5

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v3, v2

    .line 1176
    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    move-result p2

    .line 1175
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 1178
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v1, v2

    .line 1180
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v4, v2

    sub-int/2addr v4, v6

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v4, v0

    .line 1179
    invoke-static {p3, v4}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 1178
    invoke-static {v1, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    add-int/2addr v5, p2

    add-int/2addr v6, p3

    .line 1182
    invoke-virtual {p1, p2, p3, v5, v6}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method private ֫(Landroid/view/View;ILandroid/graphics/Rect;Landroid/graphics/Rect;Ll/ܰ᩸;II)V
    .locals 5

    .line 992
    iget p1, p5, Ll/ܰ᩸;->ܽ:I

    .line 993
    invoke-static {p1}, Ll/ᩳ᩹;->ۧ(I)I

    move-result p1

    .line 134
    invoke-static {p1, p2}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result p1

    .line 994
    iget p5, p5, Ll/ܰ᩸;->֫:I

    .line 995
    invoke-static {p5}, Ll/ᩳ᩹;->ܽ(I)I

    move-result p5

    .line 134
    invoke-static {p5, p2}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result p2

    and-int/lit8 p5, p1, 0x7

    and-int/lit8 p1, p1, 0x70

    and-int/lit8 v0, p2, 0x7

    and-int/lit8 p2, p2, 0x70

    const/4 v1, 0x5

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_0

    .line 1012
    iget v0, p3, Landroid/graphics/Rect;->left:I

    goto :goto_0

    .line 1015
    :cond_0
    iget v0, p3, Landroid/graphics/Rect;->right:I

    goto :goto_0

    .line 1018
    :cond_1
    iget v0, p3, Landroid/graphics/Rect;->left:I

    invoke-virtual {p3}, Landroid/graphics/Rect;->width()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v0, v3

    :goto_0
    const/16 v3, 0x50

    const/16 v4, 0x10

    if-eq p2, v4, :cond_3

    if-eq p2, v3, :cond_2

    .line 1025
    iget p2, p3, Landroid/graphics/Rect;->top:I

    goto :goto_1

    .line 1028
    :cond_2
    iget p2, p3, Landroid/graphics/Rect;->bottom:I

    goto :goto_1

    .line 1031
    :cond_3
    iget p2, p3, Landroid/graphics/Rect;->top:I

    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    add-int/2addr p2, p3

    :goto_1
    if-eq p5, v2, :cond_4

    if-eq p5, v1, :cond_5

    sub-int/2addr v0, p6

    goto :goto_2

    .line 1045
    :cond_4
    div-int/lit8 p3, p6, 0x2

    sub-int/2addr v0, p3

    :cond_5
    :goto_2
    if-eq p1, v4, :cond_6

    if-eq p1, v3, :cond_7

    sub-int/2addr p2, p7

    goto :goto_3

    .line 1058
    :cond_6
    div-int/lit8 p1, p7, 0x2

    sub-int/2addr p2, p1

    :cond_7
    :goto_3
    add-int/2addr p6, v0

    add-int/2addr p7, p2

    .line 1062
    invoke-virtual {p4, v0, p2, p6, p7}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method private ֫(Landroid/view/View;Landroid/graphics/Rect;I)V
    .locals 8

    .line 1413
    sget v0, Ll/ܿ᩺;->֫:I

    .line 3941
    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_4

    .line 1418
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    if-lez v0, :cond_b

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    if-gtz v0, :cond_1

    goto/16 :goto_4

    .line 1423
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܰ᩸;

    .line 2952
    iget-object v1, v0, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    .line 1425
    invoke-static {}, Ll/ᩳ᩹;->֫()Landroid/graphics/Rect;

    move-result-object v2

    .line 1426
    invoke-static {}, Ll/ᩳ᩹;->֫()Landroid/graphics/Rect;

    move-result-object v3

    .line 1427
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v5

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v6

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v7

    invoke-virtual {v3, v4, v5, v6, v7}, Landroid/graphics/Rect;->set(IIII)V

    if-eqz v1, :cond_3

    .line 1429
    invoke-virtual {v1, p0, p1, v2}, Ll/ۛ᩸;->getInsetDodgeRect(Ll/ᩳ᩹;Landroid/view/View;Landroid/graphics/Rect;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1431
    invoke-virtual {v3, v2}, Landroid/graphics/Rect;->contains(Landroid/graphics/Rect;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    .line 1432
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Rect should be within the child\'s bounds. Rect:"

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1433
    invoke-virtual {v2}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " | Bounds:"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1434
    invoke-virtual {v3}, Landroid/graphics/Rect;->toShortString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1437
    :cond_3
    invoke-virtual {v2, v3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 1441
    :goto_0
    invoke-static {v3}, Ll/ᩳ᩹;->֫(Landroid/graphics/Rect;)V

    .line 1443
    invoke-virtual {v2}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 1445
    invoke-static {v2}, Ll/ᩳ᩹;->֫(Landroid/graphics/Rect;)V

    return-void

    .line 1449
    :cond_4
    iget v1, v0, Ll/ܰ᩸;->ۧ:I

    .line 134
    invoke-static {v1, p3}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result p3

    and-int/lit8 v1, p3, 0x30

    const/16 v3, 0x30

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne v1, v3, :cond_5

    .line 1454
    iget v1, v2, Landroid/graphics/Rect;->top:I

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v1, v3

    iget v3, v0, Ll/ܰ᩸;->֡:I

    sub-int/2addr v1, v3

    .line 1455
    iget v3, p2, Landroid/graphics/Rect;->top:I

    if-ge v1, v3, :cond_5

    sub-int/2addr v3, v1

    .line 1456
    invoke-direct {p0, p1, v3}, Ll/ᩳ᩹;->ܽ(Landroid/view/View;I)V

    const/4 v1, 0x1

    goto :goto_1

    :cond_5
    const/4 v1, 0x0

    :goto_1
    and-int/lit8 v3, p3, 0x50

    const/16 v6, 0x50

    if-ne v3, v6, :cond_6

    .line 1461
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    iget v6, v2, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v3, v6

    iget v6, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v3, v6

    iget v6, v0, Ll/ܰ᩸;->֡:I

    add-int/2addr v3, v6

    .line 1462
    iget v6, p2, Landroid/graphics/Rect;->bottom:I

    if-ge v3, v6, :cond_6

    sub-int/2addr v3, v6

    .line 1463
    invoke-direct {p0, p1, v3}, Ll/ᩳ᩹;->ܽ(Landroid/view/View;I)V

    const/4 v1, 0x1

    :cond_6
    if-nez v1, :cond_7

    .line 1468
    invoke-direct {p0, p1, v5}, Ll/ᩳ᩹;->ܽ(Landroid/view/View;I)V

    :cond_7
    and-int/lit8 v1, p3, 0x3

    const/4 v3, 0x3

    if-ne v1, v3, :cond_8

    .line 1473
    iget v1, v2, Landroid/graphics/Rect;->left:I

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int/2addr v1, v3

    iget v3, v0, Ll/ܰ᩸;->᩵:I

    sub-int/2addr v1, v3

    .line 1474
    iget v3, p2, Landroid/graphics/Rect;->left:I

    if-ge v1, v3, :cond_8

    sub-int/2addr v3, v1

    .line 1475
    invoke-direct {p0, p1, v3}, Ll/ᩳ᩹;->ۧ(Landroid/view/View;I)V

    const/4 v1, 0x1

    goto :goto_2

    :cond_8
    const/4 v1, 0x0

    :goto_2
    const/4 v3, 0x5

    and-int/2addr p3, v3

    if-ne p3, v3, :cond_9

    .line 1480
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p3

    iget v3, v2, Landroid/graphics/Rect;->right:I

    sub-int/2addr p3, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr p3, v3

    iget v0, v0, Ll/ܰ᩸;->᩵:I

    add-int/2addr p3, v0

    .line 1481
    iget p2, p2, Landroid/graphics/Rect;->right:I

    if-ge p3, p2, :cond_9

    sub-int/2addr p3, p2

    .line 1482
    invoke-direct {p0, p1, p3}, Ll/ᩳ᩹;->ۧ(Landroid/view/View;I)V

    goto :goto_3

    :cond_9
    move v4, v1

    :goto_3
    if-nez v4, :cond_a

    .line 1487
    invoke-direct {p0, p1, v5}, Ll/ᩳ᩹;->ۧ(Landroid/view/View;I)V

    .line 1490
    :cond_a
    invoke-static {v2}, Ll/ᩳ᩹;->֫(Landroid/graphics/Rect;)V

    :cond_b
    :goto_4
    return-void
.end method

.method private ֫(Landroid/view/View;Landroid/view/View;I)V
    .locals 4

    .line 1106
    invoke-static {}, Ll/ᩳ᩹;->֫()Landroid/graphics/Rect;

    move-result-object v0

    .line 1107
    invoke-static {}, Ll/ᩳ᩹;->֫()Landroid/graphics/Rect;

    move-result-object v1

    .line 1109
    :try_start_0
    invoke-virtual {p0, p2, v0}, Ll/ᩳ᩹;->getDescendantRect(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1110
    invoke-virtual {p0, p1, p3, v0, v1}, Ll/ᩳ᩹;->getDesiredAnchoredChildRect(Landroid/view/View;ILandroid/graphics/Rect;Landroid/graphics/Rect;)V

    .line 1111
    iget p2, v1, Landroid/graphics/Rect;->left:I

    iget p3, v1, Landroid/graphics/Rect;->top:I

    iget v2, v1, Landroid/graphics/Rect;->right:I

    iget v3, v1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1, p2, p3, v2, v3}, Landroid/view/View;->layout(IIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1113
    invoke-static {v0}, Ll/ᩳ᩹;->֫(Landroid/graphics/Rect;)V

    .line 1114
    invoke-static {v1}, Ll/ᩳ᩹;->֫(Landroid/graphics/Rect;)V

    return-void

    :catchall_0
    move-exception p1

    .line 1113
    invoke-static {v0}, Ll/ᩳ᩹;->֫(Landroid/graphics/Rect;)V

    .line 1114
    invoke-static {v1}, Ll/ᩳ᩹;->֫(Landroid/graphics/Rect;)V

    .line 1115
    throw p1
.end method

.method private ֫(Ljava/util/List;)V
    .locals 4

    .line 444
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 446
    invoke-virtual {p0}, Landroid/view/ViewGroup;->isChildrenDrawingOrderEnabled()Z

    move-result v0

    .line 447
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    add-int/lit8 v2, v1, -0x1

    :goto_0
    if-ltz v2, :cond_1

    if-eqz v0, :cond_0

    .line 449
    invoke-virtual {p0, v1, v2}, Landroid/view/ViewGroup;->getChildDrawingOrder(II)I

    move-result v3

    goto :goto_1

    :cond_0
    move v3, v2

    .line 450
    :goto_1
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 451
    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 454
    :cond_1
    sget-object v0, Ll/ᩳ᩹;->TOP_SORTED_CHILDREN_COMPARATOR:Ljava/util/Comparator;

    if-eqz v0, :cond_2

    .line 455
    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_2
    return-void
.end method

.method private ֫(Ll/ܰ᩸;Landroid/graphics/Rect;II)V
    .locals 5

    .line 1066
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 1067
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 1070
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    iget v3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v2, v3

    iget v3, p2, Landroid/graphics/Rect;->left:I

    .line 1072
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    sub-int/2addr v0, v4

    sub-int/2addr v0, p3

    iget v4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v0, v4

    .line 1071
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 1070
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 1073
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    iget v3, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v2, v3

    iget v3, p2, Landroid/graphics/Rect;->top:I

    .line 1075
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v1, v4

    sub-int/2addr v1, p4

    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v1, p1

    .line 1074
    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    .line 1073
    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/2addr p3, v0

    add-int/2addr p4, p1

    .line 1077
    invoke-virtual {p2, v0, p1, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method private ֫(Z)V
    .locals 13

    .line 412
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 414
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 415
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Ll/ܰ᩸;

    .line 2952
    iget-object v4, v4, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    if-eqz v4, :cond_1

    .line 418
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v7

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v9, 0x3

    const/4 v10, 0x0

    move-wide v5, v7

    .line 419
    invoke-static/range {v5 .. v12}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v5

    if-eqz p1, :cond_0

    .line 422
    invoke-virtual {v4, p0, v3, v5}, Ll/ۛ᩸;->onInterceptTouchEvent(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/MotionEvent;)Z

    goto :goto_1

    .line 424
    :cond_0
    invoke-virtual {v4, p0, v3, v5}, Ll/ۛ᩸;->onTouchEvent(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 426
    :goto_1
    invoke-virtual {v5}, Landroid/view/MotionEvent;->recycle()V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_2
    if-ge p1, v0, :cond_3

    .line 431
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 432
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Ll/ܰ᩸;

    .line 433
    invoke-virtual {v2}, Ll/ܰ᩸;->ܳ()V

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    .line 435
    iput-object p1, p0, Ll/ᩳ᩹;->mBehaviorTouchView:Landroid/view/View;

    .line 436
    iput-boolean v1, p0, Ll/ᩳ᩹;->mDisallowInterceptReset:Z

    return-void
.end method

.method private ֫(Landroid/view/MotionEvent;I)Z
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    .line 466
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v3

    .line 468
    iget-object v4, v0, Ll/ᩳ᩹;->mTempList1:Ljava/util/List;

    .line 469
    invoke-direct {v0, v4}, Ll/ᩳ᩹;->֫(Ljava/util/List;)V

    .line 472
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_0
    if-ge v7, v5, :cond_a

    .line 474
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/view/View;

    .line 475
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Ll/ܰ᩸;

    .line 2952
    iget-object v12, v11, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    const/4 v13, 0x1

    if-nez v8, :cond_0

    if-eqz v9, :cond_4

    :cond_0
    if-eqz v3, :cond_4

    if-eqz v12, :cond_9

    if-nez v6, :cond_1

    .line 483
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v16

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v18, 0x3

    const/16 v19, 0x0

    move-wide/from16 v14, v16

    .line 484
    invoke-static/range {v14 .. v21}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v6

    :cond_1
    if-eqz v2, :cond_3

    if-eq v2, v13, :cond_2

    goto :goto_3

    .line 492
    :cond_2
    invoke-virtual {v12, v0, v10, v6}, Ll/ۛ᩸;->onTouchEvent(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/MotionEvent;)Z

    goto :goto_3

    .line 489
    :cond_3
    invoke-virtual {v12, v0, v10, v6}, Ll/ۛ᩸;->onInterceptTouchEvent(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/MotionEvent;)Z

    goto :goto_3

    :cond_4
    if-nez v8, :cond_7

    if-eqz v12, :cond_7

    if-eqz v2, :cond_6

    if-eq v2, v13, :cond_5

    goto :goto_1

    .line 505
    :cond_5
    invoke-virtual {v12, v0, v10, v1}, Ll/ۛ᩸;->onTouchEvent(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v8

    goto :goto_1

    .line 502
    :cond_6
    invoke-virtual {v12, v0, v10, v1}, Ll/ۛ᩸;->onInterceptTouchEvent(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v8

    :goto_1
    if-eqz v8, :cond_7

    .line 509
    iput-object v10, v0, Ll/ᩳ᩹;->mBehaviorTouchView:Landroid/view/View;

    .line 515
    :cond_7
    invoke-virtual {v11}, Ll/ܰ᩸;->֫()Z

    move-result v9

    .line 516
    invoke-virtual {v11, v0, v10}, Ll/ܰ᩸;->֫(Ll/ᩳ᩹;Landroid/view/View;)Z

    move-result v10

    if-eqz v10, :cond_8

    if-nez v9, :cond_8

    const/4 v9, 0x1

    goto :goto_2

    :cond_8
    const/4 v9, 0x0

    :goto_2
    if-eqz v10, :cond_9

    if-nez v9, :cond_9

    goto :goto_4

    :cond_9
    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 525
    :cond_a
    :goto_4
    invoke-interface {v4}, Ljava/util/List;->clear()V

    return v8
.end method

.method private ֫(Landroid/view/View;)Z
    .locals 1

    .line 1607
    iget-object v0, p0, Ll/ᩳ᩹;->mChildDag:Ll/ܿ᩹;

    invoke-virtual {v0, p1}, Ll/ܿ᩹;->ܿ(Landroid/view/View;)Z

    move-result p1

    return p1
.end method

.method public static ۧ(I)I
    .locals 0

    if-nez p0, :cond_0

    const/16 p0, 0x11

    :cond_0
    return p0
.end method

.method private ۧ()V
    .locals 9

    .line 689
    iget-object v0, p0, Ll/ᩳ᩹;->mDependencySortedChildren:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 690
    iget-object v0, p0, Ll/ᩳ᩹;->mChildDag:Ll/ܿ᩹;

    invoke-virtual {v0}, Ll/ܿ᩹;->֫()V

    .line 692
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_15

    .line 693
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 695
    invoke-virtual {p0, v2}, Ll/ᩳ᩹;->getResolvedLayoutParams(Landroid/view/View;)Ll/ܰ᩸;

    move-result-object v3

    .line 3125
    iget v4, v3, Ll/ܰ᩸;->᩻:I

    const/4 v5, -0x1

    const/4 v6, 0x0

    if-ne v4, v5, :cond_0

    .line 3126
    iput-object v6, v3, Ll/ܰ᩸;->ܳ:Landroid/view/View;

    iput-object v6, v3, Ll/ܰ᩸;->ۜ:Landroid/view/View;

    goto/16 :goto_5

    .line 3130
    :cond_0
    iget-object v5, v3, Ll/ܰ᩸;->ۜ:Landroid/view/View;

    if-eqz v5, :cond_6

    .line 3186
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v5

    if-eq v5, v4, :cond_1

    goto :goto_3

    .line 3190
    :cond_1
    iget-object v5, v3, Ll/ܰ᩸;->ۜ:Landroid/view/View;

    .line 3191
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    :goto_1
    if-eq v7, p0, :cond_5

    if-eqz v7, :cond_4

    if-ne v7, v2, :cond_2

    goto :goto_2

    .line 3198
    :cond_2
    instance-of v8, v7, Landroid/view/View;

    if-eqz v8, :cond_3

    .line 3199
    move-object v5, v7

    check-cast v5, Landroid/view/View;

    .line 3193
    :cond_3
    invoke-interface {v7}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    goto :goto_1

    .line 3195
    :cond_4
    :goto_2
    iput-object v6, v3, Ll/ܰ᩸;->ܳ:Landroid/view/View;

    iput-object v6, v3, Ll/ܰ᩸;->ۜ:Landroid/view/View;

    goto :goto_3

    .line 3202
    :cond_5
    iput-object v5, v3, Ll/ܰ᩸;->ܳ:Landroid/view/View;

    goto :goto_5

    .line 3141
    :cond_6
    :goto_3
    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    iput-object v5, v3, Ll/ܰ᩸;->ۜ:Landroid/view/View;

    if-eqz v5, :cond_d

    if-ne v5, p0, :cond_8

    .line 3144
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v4

    if-eqz v4, :cond_7

    .line 3145
    iput-object v6, v3, Ll/ܰ᩸;->ܳ:Landroid/view/View;

    iput-object v6, v3, Ll/ܰ᩸;->ۜ:Landroid/view/View;

    goto :goto_5

    .line 3148
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "View can not be anchored to the the parent CoordinatorLayout"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3153
    :cond_8
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    :goto_4
    if-eq v4, p0, :cond_c

    if-eqz v4, :cond_c

    if-ne v4, v2, :cond_a

    .line 3157
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v4

    if-eqz v4, :cond_9

    .line 3158
    iput-object v6, v3, Ll/ܰ᩸;->ܳ:Landroid/view/View;

    iput-object v6, v3, Ll/ܰ᩸;->ۜ:Landroid/view/View;

    goto :goto_5

    .line 3161
    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Anchor must not be a descendant of the anchored view"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 3164
    :cond_a
    instance-of v7, v4, Landroid/view/View;

    if-eqz v7, :cond_b

    .line 3165
    move-object v5, v4

    check-cast v5, Landroid/view/View;

    .line 3155
    :cond_b
    invoke-interface {v4}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    goto :goto_4

    .line 3168
    :cond_c
    iput-object v5, v3, Ll/ܰ᩸;->ܳ:Landroid/view/View;

    goto :goto_5

    .line 3170
    :cond_d
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v5

    if-eqz v5, :cond_14

    .line 3171
    iput-object v6, v3, Ll/ܰ᩸;->ܳ:Landroid/view/View;

    iput-object v6, v3, Ll/ܰ᩸;->ۜ:Landroid/view/View;

    .line 698
    :goto_5
    iget-object v4, p0, Ll/ᩳ᩹;->mChildDag:Ll/ܿ᩹;

    invoke-virtual {v4, v2}, Ll/ܿ᩹;->֫(Landroid/view/View;)V

    const/4 v4, 0x0

    :goto_6
    if-ge v4, v0, :cond_13

    if-ne v4, v1, :cond_e

    goto :goto_8

    .line 705
    :cond_e
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 3100
    iget-object v6, v3, Ll/ܰ᩸;->ܳ:Landroid/view/View;

    if-eq v5, v6, :cond_10

    .line 3101
    sget v6, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v6

    .line 3210
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Ll/ܰ᩸;

    .line 3211
    iget v7, v7, Ll/ܰ᩸;->ᩳ:I

    .line 134
    invoke-static {v7, v6}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v7

    if-eqz v7, :cond_f

    .line 3212
    iget v8, v3, Ll/ܰ᩸;->ۧ:I

    .line 134
    invoke-static {v8, v6}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v6

    and-int/2addr v6, v7

    if-ne v6, v7, :cond_f

    goto :goto_7

    .line 3101
    :cond_f
    iget-object v6, v3, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    if-eqz v6, :cond_12

    .line 3102
    invoke-virtual {v6, p0, v2, v5}, Ll/ۛ᩸;->layoutDependsOn(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;)Z

    move-result v6

    if-eqz v6, :cond_12

    .line 707
    :cond_10
    :goto_7
    iget-object v6, p0, Ll/ᩳ᩹;->mChildDag:Ll/ܿ᩹;

    invoke-virtual {v6, v5}, Ll/ܿ᩹;->ۧ(Landroid/view/View;)Z

    move-result v6

    if-nez v6, :cond_11

    .line 709
    iget-object v6, p0, Ll/ᩳ᩹;->mChildDag:Ll/ܿ᩹;

    invoke-virtual {v6, v5}, Ll/ܿ᩹;->֫(Landroid/view/View;)V

    .line 712
    :cond_11
    iget-object v6, p0, Ll/ᩳ᩹;->mChildDag:Ll/ܿ᩹;

    invoke-virtual {v6, v5, v2}, Ll/ܿ᩹;->֫(Landroid/view/View;Landroid/view/View;)V

    :cond_12
    :goto_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_13
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 3174
    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Could not find CoordinatorLayout descendant view with id "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 3175
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " to anchor view "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 718
    :cond_15
    iget-object v0, p0, Ll/ᩳ᩹;->mDependencySortedChildren:Ljava/util/List;

    iget-object v1, p0, Ll/ᩳ᩹;->mChildDag:Ll/ܿ᩹;

    invoke-virtual {v1}, Ll/ܿ᩹;->ۧ()Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 721
    iget-object v0, p0, Ll/ᩳ᩹;->mDependencySortedChildren:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    return-void
.end method

.method private ۧ(Landroid/view/View;I)V
    .locals 2

    .line 1494
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܰ᩸;

    .line 1495
    iget v1, v0, Ll/ܰ᩸;->᩵:I

    if-eq v1, p2, :cond_0

    sub-int v1, p2, v1

    .line 1497
    invoke-static {v1, p1}, Ll/ܿ᩺;->ۧ(ILandroid/view/View;)V

    .line 1498
    iput p2, v0, Ll/ܰ᩸;->᩵:I

    :cond_0
    return-void
.end method

.method public static ܽ(I)I
    .locals 1

    and-int/lit8 v0, p0, 0x7

    if-nez v0, :cond_0

    const v0, 0x800003

    or-int/2addr p0, v0

    :cond_0
    and-int/lit8 v0, p0, 0x70

    if-nez v0, :cond_1

    or-int/lit8 p0, p0, 0x30

    :cond_1
    return p0
.end method

.method private ܽ()V
    .locals 1

    .line 3309
    sget v0, Ll/ܿ᩺;->֫:I

    .line 2854
    invoke-virtual {p0}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3310
    iget-object v0, p0, Ll/ᩳ᩹;->mApplyWindowInsetsListener:Ll/ܽۨ;

    if-nez v0, :cond_0

    .line 3311
    new-instance v0, Ll/۫᩸;

    invoke-direct {v0, p0}, Ll/۫᩸;-><init>(Ll/ᩳ᩹;)V

    iput-object v0, p0, Ll/ᩳ᩹;->mApplyWindowInsetsListener:Ll/ܽۨ;

    .line 3321
    :cond_0
    iget-object v0, p0, Ll/ᩳ᩹;->mApplyWindowInsetsListener:Ll/ܽۨ;

    invoke-static {p0, v0}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܽۨ;)V

    const/16 v0, 0x500

    .line 3324
    invoke-virtual {p0, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 3327
    invoke-static {p0, v0}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܽۨ;)V

    return-void
.end method

.method private ܽ(Landroid/view/View;I)V
    .locals 2

    .line 1503
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܰ᩸;

    .line 1504
    iget v1, v0, Ll/ܰ᩸;->֡:I

    if-eq v1, p2, :cond_0

    sub-int v1, p2, v1

    .line 1506
    invoke-static {v1, p1}, Ll/ܿ᩺;->ܽ(ILandroid/view/View;)V

    .line 1507
    iput p2, v0, Ll/ܰ᩸;->֡:I

    :cond_0
    return-void
.end method

.method public static ᩳ(I)I
    .locals 0

    if-nez p0, :cond_0

    const p0, 0x800035

    :cond_0
    return p0
.end method


# virtual methods
.method public addPreDrawListener()V
    .locals 2

    .line 1615
    iget-boolean v0, p0, Ll/ᩳ᩹;->mIsAttachedToWindow:Z

    if-eqz v0, :cond_1

    .line 1617
    iget-object v0, p0, Ll/ᩳ᩹;->mOnPreDrawListener:Ll/۟᩸;

    if-nez v0, :cond_0

    .line 1618
    new-instance v0, Ll/۟᩸;

    invoke-direct {v0, p0}, Ll/۟᩸;-><init>(Ll/ᩳ᩹;)V

    iput-object v0, p0, Ll/ᩳ᩹;->mOnPreDrawListener:Ll/۟᩸;

    .line 1620
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 1621
    iget-object v1, p0, Ll/ᩳ᩹;->mOnPreDrawListener:Ll/۟᩸;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_1
    const/4 v0, 0x1

    .line 1626
    iput-boolean v0, p0, Ll/ᩳ᩹;->mNeedsPreDrawListener:Z

    return-void
.end method

.method public checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .line 1760
    instance-of v0, p1, Ll/ܰ᩸;

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public dispatchDependentViewsChanged(Landroid/view/View;)V
    .locals 4

    .line 1523
    iget-object v0, p0, Ll/ᩳ᩹;->mChildDag:Ll/ܿ᩹;

    invoke-virtual {v0, p1}, Ll/ܿ᩹;->ܽ(Landroid/view/View;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1524
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    .line 1525
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 1526
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    .line 1528
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Ll/ܰ᩸;

    .line 2952
    iget-object v3, v3, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    if-eqz v3, :cond_0

    .line 1531
    invoke-virtual {v3, p0, v2, p1}, Ll/ۛ᩸;->onDependentViewChanged(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;)Z

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public doViewsOverlap(Landroid/view/View;Landroid/view/View;)Z
    .locals 3

    .line 1722
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_3

    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_3

    .line 1723
    invoke-static {}, Ll/ᩳ᩹;->֫()Landroid/graphics/Rect;

    move-result-object v0

    .line 1724
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eq v2, p0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0, p1, v2, v0}, Ll/ᩳ᩹;->getChildRect(Landroid/view/View;ZLandroid/graphics/Rect;)V

    .line 1725
    invoke-static {}, Ll/ᩳ᩹;->֫()Landroid/graphics/Rect;

    move-result-object p1

    .line 1726
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eq v2, p0, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {p0, p2, v2, p1}, Ll/ᩳ᩹;->getChildRect(Landroid/view/View;ZLandroid/graphics/Rect;)V

    .line 1728
    :try_start_0
    iget p2, v0, Landroid/graphics/Rect;->left:I

    iget v2, p1, Landroid/graphics/Rect;->right:I

    if-gt p2, v2, :cond_2

    iget p2, v0, Landroid/graphics/Rect;->top:I

    iget v2, p1, Landroid/graphics/Rect;->bottom:I

    if-gt p2, v2, :cond_2

    iget p2, v0, Landroid/graphics/Rect;->right:I

    iget v2, p1, Landroid/graphics/Rect;->left:I

    if-lt p2, v2, :cond_2

    iget p2, v0, Landroid/graphics/Rect;->bottom:I

    iget v2, p1, Landroid/graphics/Rect;->top:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt p2, v2, :cond_2

    const/4 v1, 0x1

    .line 1731
    :cond_2
    invoke-static {v0}, Ll/ᩳ᩹;->֫(Landroid/graphics/Rect;)V

    .line 1732
    invoke-static {p1}, Ll/ᩳ᩹;->֫(Landroid/graphics/Rect;)V

    return v1

    :catchall_0
    move-exception p2

    .line 1731
    invoke-static {v0}, Ll/ᩳ᩹;->֫(Landroid/graphics/Rect;)V

    .line 1732
    invoke-static {p1}, Ll/ᩳ᩹;->֫(Landroid/graphics/Rect;)V

    .line 1733
    throw p2

    :cond_3
    return v1
.end method

.method public drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 8

    .line 1253
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܰ᩸;

    .line 1254
    iget-object v1, v0, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    if-eqz v1, :cond_2

    .line 1255
    invoke-virtual {v1, p0, p2}, Ll/ۛ᩸;->getScrimOpacity(Ll/ᩳ᩹;Landroid/view/View;)F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v2, v1, v2

    if-lez v2, :cond_2

    .line 1257
    iget-object v2, p0, Ll/ᩳ᩹;->mScrimPaint:Landroid/graphics/Paint;

    if-nez v2, :cond_0

    .line 1258
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Ll/ᩳ᩹;->mScrimPaint:Landroid/graphics/Paint;

    .line 1260
    :cond_0
    iget-object v2, p0, Ll/ᩳ᩹;->mScrimPaint:Landroid/graphics/Paint;

    iget-object v0, v0, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    invoke-virtual {v0, p0, p2}, Ll/ۛ᩸;->getScrimColor(Ll/ᩳ᩹;Landroid/view/View;)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 1261
    iget-object v0, p0, Ll/ᩳ᩹;->mScrimPaint:Landroid/graphics/Paint;

    const/high16 v2, 0x437f0000    # 255.0f

    mul-float v1, v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0xff

    invoke-static {v1, v2, v3}, Ll/ᩳ᩹;->֫(III)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 1263
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v0

    .line 1264
    invoke-virtual {p2}, Landroid/view/View;->isOpaque()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1267
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v1

    int-to-float v3, v1

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v1

    int-to-float v4, v1

    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    move-result v1

    int-to-float v5, v1

    .line 1268
    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result v1

    int-to-float v6, v1

    sget-object v7, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    move-object v2, p1

    .line 1267
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->clipRect(FFFFLandroid/graphics/Region$Op;)Z

    .line 1271
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    int-to-float v3, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    int-to-float v4, v1

    .line 1272
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v5, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v6, v1

    iget-object v7, p0, Ll/ᩳ᩹;->mScrimPaint:Landroid/graphics/Paint;

    move-object v2, p1

    .line 1271
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 1274
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 1277
    :cond_2
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result p1

    return p1
.end method

.method public drawableStateChanged()V
    .locals 3

    .line 332
    invoke-super {p0}, Landroid/view/ViewGroup;->drawableStateChanged()V

    .line 334
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    .line 337
    iget-object v1, p0, Ll/ᩳ᩹;->mStatusBarBackground:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_0

    .line 338
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 339
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 343
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_1
    return-void
.end method

.method public ensurePreDrawListener()V
    .locals 4

    .line 1585
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 1587
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 1588
    invoke-direct {p0, v3}, Ll/ᩳ᩹;->֫(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1594
    :cond_1
    :goto_1
    iget-boolean v0, p0, Ll/ᩳ᩹;->mNeedsPreDrawListener:Z

    if-eq v1, v0, :cond_3

    if-eqz v1, :cond_2

    .line 1596
    invoke-virtual {p0}, Ll/ᩳ᩹;->addPreDrawListener()V

    return-void

    .line 1598
    :cond_2
    invoke-virtual {p0}, Ll/ᩳ᩹;->removePreDrawListener()V

    :cond_3
    return-void
.end method

.method public bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 112
    invoke-virtual {p0}, Ll/ᩳ᩹;->generateDefaultLayoutParams()Ll/ܰ᩸;

    move-result-object v0

    return-object v0
.end method

.method public generateDefaultLayoutParams()Ll/ܰ᩸;
    .locals 1

    .line 1755
    new-instance v0, Ll/ܰ᩸;

    invoke-direct {v0}, Ll/ܰ᩸;-><init>()V

    return-object v0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 112
    invoke-virtual {p0, p1}, Ll/ᩳ᩹;->generateLayoutParams(Landroid/util/AttributeSet;)Ll/ܰ᩸;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 112
    invoke-virtual {p0, p1}, Ll/ᩳ᩹;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Ll/ܰ᩸;

    move-result-object p1

    return-object p1
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Ll/ܰ᩸;
    .locals 2

    .line 1740
    new-instance v0, Ll/ܰ᩸;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/ܰ᩸;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Ll/ܰ᩸;
    .locals 1

    .line 1745
    instance-of v0, p1, Ll/ܰ᩸;

    if-eqz v0, :cond_0

    .line 1746
    new-instance v0, Ll/ܰ᩸;

    check-cast p1, Ll/ܰ᩸;

    invoke-direct {v0, p1}, Ll/ܰ᩸;-><init>(Ll/ܰ᩸;)V

    return-object v0

    .line 1747
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    .line 1748
    new-instance v0, Ll/ܰ᩸;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Ll/ܰ᩸;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    .line 1750
    :cond_1
    new-instance v0, Ll/ܰ᩸;

    invoke-direct {v0, p1}, Ll/ܰ᩸;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getChildRect(Landroid/view/View;ZLandroid/graphics/Rect;)V
    .locals 2

    .line 979
    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 984
    invoke-virtual {p0, p1, p3}, Ll/ᩳ᩹;->getDescendantRect(Landroid/view/View;Landroid/graphics/Rect;)V

    return-void

    .line 986
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    invoke-virtual {p3, p2, v0, v1, p1}, Landroid/graphics/Rect;->set(IIII)V

    return-void

    .line 980
    :cond_2
    :goto_0
    invoke-virtual {p3}, Landroid/graphics/Rect;->setEmpty()V

    return-void
.end method

.method public getDependencies(Landroid/view/View;)Ljava/util/List;
    .locals 1

    .line 1547
    iget-object v0, p0, Ll/ᩳ᩹;->mChildDag:Ll/ܿ᩹;

    invoke-virtual {v0, p1}, Ll/ܿ᩹;->ᩳ(Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object p1

    .line 1548
    iget-object v0, p0, Ll/ᩳ᩹;->mTempDependenciesList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-eqz p1, :cond_0

    .line 1550
    iget-object v0, p0, Ll/ᩳ᩹;->mTempDependenciesList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1552
    :cond_0
    iget-object p1, p0, Ll/ᩳ᩹;->mTempDependenciesList:Ljava/util/List;

    return-object p1
.end method

.method public final getDependencySortedChildren()Ljava/util/List;
    .locals 1

    .line 1576
    invoke-direct {p0}, Ll/ᩳ᩹;->ۧ()V

    .line 1577
    iget-object v0, p0, Ll/ᩳ᩹;->mDependencySortedChildren:Ljava/util/List;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getDependents(Landroid/view/View;)Ljava/util/List;
    .locals 1

    .line 1566
    iget-object v0, p0, Ll/ᩳ᩹;->mChildDag:Ll/ܿ᩹;

    invoke-virtual {v0, p1}, Ll/ܿ᩹;->ܽ(Landroid/view/View;)Ljava/util/List;

    move-result-object p1

    .line 1567
    iget-object v0, p0, Ll/ᩳ᩹;->mTempDependenciesList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-eqz p1, :cond_0

    .line 1569
    iget-object v0, p0, Ll/ᩳ᩹;->mTempDependenciesList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 1571
    :cond_0
    iget-object p1, p0, Ll/ᩳ᩹;->mTempDependenciesList:Ljava/util/List;

    return-object p1
.end method

.method public getDescendantRect(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    .line 732
    invoke-static {p0, p1, p2}, Ll/ܳ᩹;->֫(Ll/ᩳ᩹;Landroid/view/View;Landroid/graphics/Rect;)V

    return-void
.end method

.method public getDesiredAnchoredChildRect(Landroid/view/View;ILandroid/graphics/Rect;Landroid/graphics/Rect;)V
    .locals 11

    .line 1090
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܰ᩸;

    .line 1091
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    .line 1092
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v10

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, v0

    move v7, v9

    move v8, v10

    .line 1093
    invoke-direct/range {v1 .. v8}, Ll/ᩳ᩹;->֫(Landroid/view/View;ILandroid/graphics/Rect;Landroid/graphics/Rect;Ll/ܰ᩸;II)V

    .line 1095
    invoke-direct {p0, v0, p4, v9, v10}, Ll/ᩳ᩹;->֫(Ll/ܰ᩸;Landroid/graphics/Rect;II)V

    return-void
.end method

.method public getLastChildRect(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    .line 965
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܰ᩸;

    .line 2995
    iget-object p1, p1, Ll/ܰ᩸;->ۚ:Landroid/graphics/Rect;

    .line 966
    invoke-virtual {p2, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final getLastWindowInsets()Ll/᩸ܰ;
    .locals 1

    .line 401
    iget-object v0, p0, Ll/ᩳ᩹;->mLastInsets:Ll/᩸ܰ;

    return-object v0
.end method

.method public getNestedScrollAxes()I
    .locals 1

    .line 2017
    iget-object v0, p0, Ll/ᩳ᩹;->mNestedScrollingParentHelper:Ll/ۧۨ;

    invoke-virtual {v0}, Ll/ۧۨ;->֫()I

    move-result v0

    return v0
.end method

.method public getResolvedLayoutParams(Landroid/view/View;)Ll/ܰ᩸;
    .locals 4

    .line 654
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܰ᩸;

    .line 655
    iget-boolean v1, v0, Ll/ܰ᩸;->ۢ:Z

    if-nez v1, :cond_3

    .line 656
    instance-of v1, p1, Ll/ۤ᩸;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 657
    check-cast p1, Ll/ۤ᩸;

    invoke-interface {p1}, Ll/ۤ᩸;->getBehavior()Ll/ۛ᩸;

    move-result-object p1

    .line 661
    invoke-virtual {v0, p1}, Ll/ܰ᩸;->֫(Ll/ۛ᩸;)V

    .line 662
    iput-boolean v2, v0, Ll/ܰ᩸;->ۢ:Z

    return-object v0

    .line 665
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    const/4 v1, 0x0

    move-object v3, v1

    :goto_0
    if-eqz p1, :cond_1

    .line 667
    const-class v3, Ll/ۨ᩸;

    .line 668
    invoke-virtual {p1, v3}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v3

    check-cast v3, Ll/ۨ᩸;

    if-nez v3, :cond_1

    .line 670
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p1

    goto :goto_0

    :cond_1
    if-eqz v3, :cond_2

    .line 675
    :try_start_0
    invoke-interface {v3}, Ll/ۨ᩸;->value()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۛ᩸;

    .line 674
    invoke-virtual {v0, p1}, Ll/ܰ᩸;->֫(Ll/ۛ᩸;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 677
    :catch_0
    invoke-interface {v3}, Ll/ۨ᩸;->value()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 682
    :cond_2
    :goto_1
    iput-boolean v2, v0, Ll/ܰ᩸;->ۢ:Z

    :cond_3
    return-object v0
.end method

.method public getStatusBarBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 327
    iget-object v0, p0, Ll/ᩳ᩹;->mStatusBarBackground:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getSuggestedMinimumHeight()I
    .locals 3

    .line 742
    invoke-super {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    add-int/2addr v2, v1

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public getSuggestedMinimumWidth()I
    .locals 3

    .line 737
    invoke-super {p0}, Landroid/view/ViewGroup;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    add-int/2addr v2, v1

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public isPointInChildBounds(Landroid/view/View;II)Z
    .locals 1

    .line 1704
    invoke-static {}, Ll/ᩳ᩹;->֫()Landroid/graphics/Rect;

    move-result-object v0

    .line 1705
    invoke-virtual {p0, p1, v0}, Ll/ᩳ᩹;->getDescendantRect(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1707
    :try_start_0
    invoke-virtual {v0, p2, p3}, Landroid/graphics/Rect;->contains(II)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1709
    invoke-static {v0}, Ll/ᩳ᩹;->֫(Landroid/graphics/Rect;)V

    return p1

    :catchall_0
    move-exception p1

    invoke-static {v0}, Ll/ᩳ᩹;->֫(Landroid/graphics/Rect;)V

    .line 1710
    throw p1
.end method

.method public offsetChildToAnchor(Landroid/view/View;I)V
    .locals 16

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    .line 1653
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ll/ܰ᩸;

    .line 1654
    iget-object v0, v10, Ll/ܰ᩸;->ۜ:Landroid/view/View;

    if-eqz v0, :cond_5

    .line 1655
    invoke-static {}, Ll/ᩳ᩹;->֫()Landroid/graphics/Rect;

    move-result-object v11

    .line 1656
    invoke-static {}, Ll/ᩳ᩹;->֫()Landroid/graphics/Rect;

    move-result-object v12

    .line 1657
    invoke-static {}, Ll/ᩳ᩹;->֫()Landroid/graphics/Rect;

    move-result-object v13

    .line 1659
    iget-object v0, v10, Ll/ܰ᩸;->ۜ:Landroid/view/View;

    invoke-virtual {v8, v0, v11}, Ll/ᩳ᩹;->getDescendantRect(Landroid/view/View;Landroid/graphics/Rect;)V

    const/4 v14, 0x0

    .line 1660
    invoke-virtual {v8, v9, v14, v12}, Ll/ᩳ᩹;->getChildRect(Landroid/view/View;ZLandroid/graphics/Rect;)V

    .line 1662
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v15

    .line 1663
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object v3, v11

    move-object v4, v13

    move-object v5, v10

    move v6, v15

    move/from16 p2, v7

    .line 1664
    invoke-direct/range {v0 .. v7}, Ll/ᩳ᩹;->֫(Landroid/view/View;ILandroid/graphics/Rect;Landroid/graphics/Rect;Ll/ܰ᩸;II)V

    .line 1666
    iget v0, v13, Landroid/graphics/Rect;->left:I

    iget v1, v12, Landroid/graphics/Rect;->left:I

    if-ne v0, v1, :cond_0

    iget v0, v13, Landroid/graphics/Rect;->top:I

    iget v1, v12, Landroid/graphics/Rect;->top:I

    if-eq v0, v1, :cond_1

    :cond_0
    const/4 v14, 0x1

    :cond_1
    move/from16 v0, p2

    .line 1668
    invoke-direct {v8, v10, v13, v15, v0}, Ll/ᩳ᩹;->֫(Ll/ܰ᩸;Landroid/graphics/Rect;II)V

    .line 1670
    iget v0, v13, Landroid/graphics/Rect;->left:I

    iget v1, v12, Landroid/graphics/Rect;->left:I

    sub-int/2addr v0, v1

    .line 1671
    iget v1, v13, Landroid/graphics/Rect;->top:I

    iget v2, v12, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, v2

    if-eqz v0, :cond_2

    .line 1674
    invoke-static {v0, v9}, Ll/ܿ᩺;->ۧ(ILandroid/view/View;)V

    :cond_2
    if-eqz v1, :cond_3

    .line 1677
    invoke-static {v1, v9}, Ll/ܿ᩺;->ܽ(ILandroid/view/View;)V

    :cond_3
    if-eqz v14, :cond_4

    .line 2952
    iget-object v0, v10, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    if-eqz v0, :cond_4

    .line 1684
    iget-object v1, v10, Ll/ܰ᩸;->ۜ:Landroid/view/View;

    invoke-virtual {v0, v8, v9, v1}, Ll/ۛ᩸;->onDependentViewChanged(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;)Z

    .line 1688
    :cond_4
    invoke-static {v11}, Ll/ᩳ᩹;->֫(Landroid/graphics/Rect;)V

    .line 1689
    invoke-static {v12}, Ll/ᩳ᩹;->֫(Landroid/graphics/Rect;)V

    .line 1690
    invoke-static {v13}, Ll/ᩳ᩹;->֫(Landroid/graphics/Rect;)V

    :cond_5
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 2

    .line 264
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    const/4 v0, 0x0

    .line 265
    invoke-direct {p0, v0}, Ll/ᩳ᩹;->֫(Z)V

    .line 266
    iget-boolean v0, p0, Ll/ᩳ᩹;->mNeedsPreDrawListener:Z

    if-eqz v0, :cond_1

    .line 267
    iget-object v0, p0, Ll/ᩳ᩹;->mOnPreDrawListener:Ll/۟᩸;

    if-nez v0, :cond_0

    .line 268
    new-instance v0, Ll/۟᩸;

    invoke-direct {v0, p0}, Ll/۟᩸;-><init>(Ll/ᩳ᩹;)V

    iput-object v0, p0, Ll/ᩳ᩹;->mOnPreDrawListener:Ll/۟᩸;

    .line 270
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 271
    iget-object v1, p0, Ll/ᩳ᩹;->mOnPreDrawListener:Ll/۟᩸;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 273
    :cond_1
    iget-object v0, p0, Ll/ᩳ᩹;->mLastInsets:Ll/᩸ܰ;

    if-nez v0, :cond_2

    sget v0, Ll/ܿ᩺;->֫:I

    .line 2854
    invoke-virtual {p0}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 276
    invoke-static {p0}, Ll/ܿ᩺;->᩵(Landroid/view/View;)V

    :cond_2
    const/4 v0, 0x1

    .line 278
    iput-boolean v0, p0, Ll/ᩳ᩹;->mIsAttachedToWindow:Z

    return-void
.end method

.method public final onChildViewsChanged(I)V
    .locals 14

    .line 1307
    sget v0, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    .line 1308
    iget-object v1, p0, Ll/ᩳ᩹;->mDependencySortedChildren:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    .line 1309
    invoke-static {}, Ll/ᩳ᩹;->֫()Landroid/graphics/Rect;

    move-result-object v2

    .line 1310
    invoke-static {}, Ll/ᩳ᩹;->֫()Landroid/graphics/Rect;

    move-result-object v3

    .line 1311
    invoke-static {}, Ll/ᩳ᩹;->֫()Landroid/graphics/Rect;

    move-result-object v4

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v1, :cond_f

    .line 1314
    iget-object v6, p0, Ll/ᩳ᩹;->mDependencySortedChildren:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    .line 1315
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Ll/ܰ᩸;

    if-nez p1, :cond_0

    .line 1316
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v8

    const/16 v9, 0x8

    if-ne v8, v9, :cond_0

    goto/16 :goto_7

    :cond_0
    const/4 v8, 0x0

    :goto_1
    if-ge v8, v5, :cond_2

    .line 1323
    iget-object v9, p0, Ll/ᩳ᩹;->mDependencySortedChildren:Ljava/util/List;

    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/view/View;

    .line 1325
    iget-object v10, v7, Ll/ܰ᩸;->ܳ:Landroid/view/View;

    if-ne v10, v9, :cond_1

    .line 1326
    invoke-virtual {p0, v6, v0}, Ll/ᩳ᩹;->offsetChildToAnchor(Landroid/view/View;I)V

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    const/4 v8, 0x1

    .line 1331
    invoke-virtual {p0, v6, v8, v3}, Ll/ᩳ᩹;->getChildRect(Landroid/view/View;ZLandroid/graphics/Rect;)V

    .line 1334
    iget v9, v7, Ll/ܰ᩸;->ᩳ:I

    if-eqz v9, :cond_7

    invoke-virtual {v3}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_7

    .line 1335
    iget v9, v7, Ll/ܰ᩸;->ᩳ:I

    .line 134
    invoke-static {v9, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v9

    and-int/lit8 v10, v9, 0x70

    const/16 v11, 0x30

    if-eq v10, v11, :cond_4

    const/16 v11, 0x50

    if-eq v10, v11, :cond_3

    goto :goto_2

    .line 1342
    :cond_3
    iget v10, v2, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v11

    iget v12, v3, Landroid/graphics/Rect;->top:I

    sub-int/2addr v11, v12

    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    move-result v10

    iput v10, v2, Landroid/graphics/Rect;->bottom:I

    goto :goto_2

    .line 1339
    :cond_4
    iget v10, v2, Landroid/graphics/Rect;->top:I

    iget v11, v3, Landroid/graphics/Rect;->bottom:I

    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    move-result v10

    iput v10, v2, Landroid/graphics/Rect;->top:I

    :goto_2
    and-int/lit8 v9, v9, 0x7

    const/4 v10, 0x3

    if-eq v9, v10, :cond_6

    const/4 v10, 0x5

    if-eq v9, v10, :cond_5

    goto :goto_3

    .line 1350
    :cond_5
    iget v9, v2, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v10

    iget v11, v3, Landroid/graphics/Rect;->left:I

    sub-int/2addr v10, v11

    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    move-result v9

    iput v9, v2, Landroid/graphics/Rect;->right:I

    goto :goto_3

    .line 1347
    :cond_6
    iget v9, v2, Landroid/graphics/Rect;->left:I

    iget v10, v3, Landroid/graphics/Rect;->right:I

    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    move-result v9

    iput v9, v2, Landroid/graphics/Rect;->left:I

    .line 1356
    :cond_7
    :goto_3
    iget v7, v7, Ll/ܰ᩸;->ۧ:I

    if-eqz v7, :cond_8

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-nez v7, :cond_8

    .line 1357
    invoke-direct {p0, v6, v2, v0}, Ll/ᩳ᩹;->֫(Landroid/view/View;Landroid/graphics/Rect;I)V

    :cond_8
    const/4 v7, 0x2

    if-eq p1, v7, :cond_a

    .line 1362
    invoke-virtual {p0, v6, v4}, Ll/ᩳ᩹;->getLastChildRect(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1363
    invoke-virtual {v4, v3}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    goto :goto_7

    .line 1366
    :cond_9
    invoke-virtual {p0, v6, v3}, Ll/ᩳ᩹;->recordLastChildRect(Landroid/view/View;Landroid/graphics/Rect;)V

    :cond_a
    add-int/lit8 v9, v5, 0x1

    :goto_4
    if-ge v9, v1, :cond_e

    .line 1371
    iget-object v10, p0, Ll/ᩳ᩹;->mDependencySortedChildren:Ljava/util/List;

    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/view/View;

    .line 1372
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Ll/ܰ᩸;

    .line 2952
    iget-object v12, v11, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    if-eqz v12, :cond_d

    .line 1375
    invoke-virtual {v12, p0, v10, v6}, Ll/ۛ᩸;->layoutDependsOn(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;)Z

    move-result v13

    if-eqz v13, :cond_d

    if-nez p1, :cond_b

    .line 1376
    invoke-virtual {v11}, Ll/ܰ᩸;->ᩳ()Z

    move-result v13

    if-eqz v13, :cond_b

    .line 1379
    invoke-virtual {v11}, Ll/ܰ᩸;->ܿ()V

    goto :goto_6

    :cond_b
    if-eq p1, v7, :cond_c

    .line 1393
    invoke-virtual {v12, p0, v10, v6}, Ll/ۛ᩸;->onDependentViewChanged(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;)Z

    move-result v10

    goto :goto_5

    .line 1388
    :cond_c
    invoke-virtual {v12, p0, v10, v6}, Ll/ۛ᩸;->onDependentViewRemoved(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;)V

    const/4 v10, 0x1

    :goto_5
    if-ne p1, v8, :cond_d

    .line 1400
    invoke-virtual {v11, v10}, Ll/ܰ᩸;->֫(Z)V

    :cond_d
    :goto_6
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_e
    :goto_7
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 1406
    :cond_f
    invoke-static {v2}, Ll/ᩳ᩹;->֫(Landroid/graphics/Rect;)V

    .line 1407
    invoke-static {v3}, Ll/ᩳ᩹;->֫(Landroid/graphics/Rect;)V

    .line 1408
    invoke-static {v4}, Ll/ᩳ᩹;->֫(Landroid/graphics/Rect;)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 3

    .line 283
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    const/4 v0, 0x0

    .line 284
    invoke-direct {p0, v0}, Ll/ᩳ᩹;->֫(Z)V

    .line 285
    iget-boolean v1, p0, Ll/ᩳ᩹;->mNeedsPreDrawListener:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/ᩳ᩹;->mOnPreDrawListener:Ll/۟᩸;

    if-eqz v1, :cond_0

    .line 286
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    .line 287
    iget-object v2, p0, Ll/ᩳ᩹;->mOnPreDrawListener:Ll/۟᩸;

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 289
    :cond_0
    iget-object v1, p0, Ll/ᩳ᩹;->mNestedScrollingTarget:Landroid/view/View;

    if-eqz v1, :cond_1

    .line 290
    invoke-virtual {p0, v1}, Ll/ᩳ᩹;->onStopNestedScroll(Landroid/view/View;)V

    .line 292
    :cond_1
    iput-boolean v0, p0, Ll/ᩳ᩹;->mIsAttachedToWindow:Z

    return-void
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 926
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V

    .line 927
    iget-boolean v0, p0, Ll/ᩳ᩹;->mDrawStatusBarBackground:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ᩳ᩹;->mStatusBarBackground:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 928
    iget-object v0, p0, Ll/ᩳ᩹;->mLastInsets:Ll/᩸ܰ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/᩸ܰ;->ۢ()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-lez v0, :cond_1

    .line 930
    iget-object v2, p0, Ll/ᩳ᩹;->mStatusBarBackground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {v2, v1, v1, v3, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 931
    iget-object v0, p0, Ll/ᩳ᩹;->mStatusBarBackground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_1
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 532
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 536
    invoke-direct {p0, v1}, Ll/ᩳ᩹;->֫(Z)V

    :cond_0
    const/4 v2, 0x0

    .line 539
    invoke-direct {p0, p1, v2}, Ll/ᩳ᩹;->֫(Landroid/view/MotionEvent;I)Z

    move-result p1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x3

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    return p1

    .line 542
    :cond_2
    :goto_0
    invoke-direct {p0, v1}, Ll/ᩳ᩹;->֫(Z)V

    return p1
.end method

.method public onLayout(ZIIII)V
    .locals 1

    .line 906
    sget p1, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result p1

    .line 907
    iget-object p2, p0, Ll/ᩳ᩹;->mDependencySortedChildren:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    const/4 p3, 0x0

    :goto_0
    if-ge p3, p2, :cond_3

    .line 909
    iget-object p4, p0, Ll/ᩳ᩹;->mDependencySortedChildren:Ljava/util/List;

    invoke-interface {p4, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroid/view/View;

    .line 910
    invoke-virtual {p4}, Landroid/view/View;->getVisibility()I

    move-result p5

    const/16 v0, 0x8

    if-ne p5, v0, :cond_0

    goto :goto_1

    .line 915
    :cond_0
    invoke-virtual {p4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p5

    check-cast p5, Ll/ܰ᩸;

    .line 2952
    iget-object p5, p5, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    if-eqz p5, :cond_1

    .line 918
    invoke-virtual {p5, p0, p4, p1}, Ll/ۛ᩸;->onLayoutChild(Ll/ᩳ᩹;Landroid/view/View;I)Z

    move-result p5

    if-nez p5, :cond_2

    .line 919
    :cond_1
    invoke-virtual {p0, p4, p1}, Ll/ᩳ᩹;->onLayoutChild(Landroid/view/View;I)V

    :cond_2
    :goto_1
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public onLayoutChild(Landroid/view/View;I)V
    .locals 4

    .line 889
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܰ᩸;

    .line 3003
    iget-object v1, v0, Ll/ܰ᩸;->ۜ:Landroid/view/View;

    if-nez v1, :cond_1

    iget v2, v0, Ll/ܰ᩸;->᩻:I

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    goto :goto_0

    .line 891
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    .line 895
    invoke-direct {p0, p1, v1, p2}, Ll/ᩳ᩹;->֫(Landroid/view/View;Landroid/view/View;I)V

    return-void

    .line 896
    :cond_2
    iget v0, v0, Ll/ܰ᩸;->ܿ:I

    if-ltz v0, :cond_3

    .line 897
    invoke-direct {p0, p1, v0, p2}, Ll/ᩳ᩹;->֫(Landroid/view/View;II)V

    return-void

    .line 899
    :cond_3
    invoke-direct {p0, p1, p2}, Ll/ᩳ᩹;->֫(Landroid/view/View;I)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 30

    move-object/from16 v7, p0

    .line 767
    invoke-direct/range {p0 .. p0}, Ll/ᩳ᩹;->ۧ()V

    .line 768
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ᩹;->ensurePreDrawListener()V

    .line 770
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v8

    .line 771
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    .line 772
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v9

    .line 773
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    .line 774
    sget v2, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v10

    const/4 v2, 0x1

    if-ne v10, v2, :cond_0

    const/4 v2, 0x1

    const/4 v11, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    const/4 v11, 0x0

    .line 776
    :goto_0
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v12

    .line 777
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v13

    .line 778
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v14

    .line 779
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v15

    add-int v16, v8, v9

    add-int v17, v0, v1

    .line 783
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ᩹;->getSuggestedMinimumWidth()I

    move-result v0

    .line 784
    invoke-virtual/range {p0 .. p0}, Ll/ᩳ᩹;->getSuggestedMinimumHeight()I

    move-result v1

    .line 787
    iget-object v2, v7, Ll/ᩳ᩹;->mLastInsets:Ll/᩸ܰ;

    if-eqz v2, :cond_1

    .line 2854
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    const/16 v18, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    const/16 v18, 0x0

    .line 789
    :goto_1
    iget-object v2, v7, Ll/ᩳ᩹;->mDependencySortedChildren:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v5, v0

    move v4, v1

    move-object v0, v7

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v6, :cond_d

    .line 791
    iget-object v1, v0, Ll/ᩳ᩹;->mDependencySortedChildren:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v19, v1

    check-cast v19, Landroid/view/View;

    .line 792
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getVisibility()I

    move-result v1

    move/from16 v20, v2

    const/16 v2, 0x8

    if-ne v1, v2, :cond_2

    move/from16 v21, v6

    move/from16 v2, v20

    move/from16 v20, v3

    goto/16 :goto_7

    .line 797
    :cond_2
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ll/ܰ᩸;

    .line 800
    iget v1, v2, Ll/ܰ᩸;->ܿ:I

    if-ltz v1, :cond_8

    if-eqz v12, :cond_8

    .line 801
    invoke-direct {v0, v1}, Ll/ᩳ᩹;->֫(I)I

    move-result v1

    move/from16 v21, v3

    .line 802
    iget v3, v2, Ll/ܰ᩸;->ܽ:I

    .line 803
    invoke-static {v3}, Ll/ᩳ᩹;->ᩳ(I)I

    move-result v3

    .line 134
    invoke-static {v3, v10}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v3

    and-int/lit8 v3, v3, 0x7

    move/from16 v22, v4

    const/4 v4, 0x3

    if-ne v3, v4, :cond_3

    if-eqz v11, :cond_4

    :cond_3
    const/4 v4, 0x5

    if-ne v3, v4, :cond_5

    if-eqz v11, :cond_5

    :cond_4
    sub-int v3, v13, v9

    sub-int/2addr v3, v1

    const/4 v1, 0x0

    .line 807
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_3

    :cond_5
    if-ne v3, v4, :cond_6

    if-eqz v11, :cond_7

    :cond_6
    const/4 v4, 0x3

    if-ne v3, v4, :cond_9

    if-eqz v11, :cond_9

    :cond_7
    sub-int/2addr v1, v8

    const/4 v3, 0x0

    .line 810
    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    :goto_3
    move/from16 v23, v1

    goto :goto_4

    :cond_8
    move/from16 v21, v3

    move/from16 v22, v4

    :cond_9
    const/4 v1, 0x0

    const/16 v23, 0x0

    :goto_4
    if-eqz v18, :cond_a

    .line 2854
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v1

    if-nez v1, :cond_a

    .line 819
    iget-object v1, v0, Ll/ᩳ᩹;->mLastInsets:Ll/᩸ܰ;

    invoke-virtual {v1}, Ll/᩸ܰ;->ۜ()I

    move-result v1

    iget-object v3, v0, Ll/ᩳ᩹;->mLastInsets:Ll/᩸ܰ;

    .line 820
    invoke-virtual {v3}, Ll/᩸ܰ;->᩷()I

    move-result v3

    add-int/2addr v3, v1

    .line 821
    iget-object v1, v0, Ll/ᩳ᩹;->mLastInsets:Ll/᩸ܰ;

    invoke-virtual {v1}, Ll/᩸ܰ;->ۢ()I

    move-result v1

    iget-object v0, v0, Ll/ᩳ᩹;->mLastInsets:Ll/᩸ܰ;

    .line 822
    invoke-virtual {v0}, Ll/᩸ܰ;->᩻()I

    move-result v0

    add-int/2addr v0, v1

    sub-int v1, v13, v3

    .line 824
    invoke-static {v1, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    sub-int v0, v15, v0

    .line 826
    invoke-static {v0, v14}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    move/from16 v25, v0

    move/from16 v24, v1

    goto :goto_5

    :cond_a
    move/from16 v24, p1

    move/from16 v25, p2

    .line 2952
    :goto_5
    iget-object v0, v2, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    if-eqz v0, :cond_b

    const/16 v26, 0x0

    move-object/from16 v1, p0

    move-object v3, v2

    move/from16 v4, v20

    move-object/from16 v2, v19

    move-object/from16 v27, v3

    move/from16 v20, v21

    move/from16 v3, v24

    move/from16 v29, v4

    move/from16 v28, v22

    move/from16 v4, v23

    move v7, v5

    move/from16 v5, v25

    move/from16 v21, v6

    move/from16 v6, v26

    .line 831
    invoke-virtual/range {v0 .. v6}, Ll/ۛ᩸;->onMeasureChild(Ll/ᩳ᩹;Landroid/view/View;IIII)Z

    move-result v0

    if-nez v0, :cond_c

    goto :goto_6

    :cond_b
    move-object/from16 v27, v2

    move v7, v5

    move/from16 v29, v20

    move/from16 v20, v21

    move/from16 v28, v22

    move/from16 v21, v6

    :goto_6
    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, v19

    move/from16 v2, v24

    move/from16 v3, v23

    move/from16 v4, v25

    .line 833
    invoke-virtual/range {v0 .. v5}, Ll/ᩳ᩹;->onMeasureChild(Landroid/view/View;IIII)V

    .line 837
    :cond_c
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    add-int v0, v0, v16

    move-object/from16 v1, v27

    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v0, v2

    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v0, v2

    invoke-static {v7, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 840
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    add-int v2, v2, v17

    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v2, v3

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v2, v1

    move/from16 v1, v28

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 842
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getMeasuredState()I

    move-result v2

    move/from16 v3, v29

    invoke-static {v3, v2}, Landroid/view/View;->combineMeasuredStates(II)I

    move-result v2

    move v5, v0

    move v4, v1

    move-object/from16 v0, p0

    :goto_7
    add-int/lit8 v3, v20, 0x1

    move-object/from16 v7, p0

    move/from16 v6, v21

    goto/16 :goto_2

    :cond_d
    move v3, v2

    move v1, v4

    move v7, v5

    const/high16 v2, -0x1000000

    and-int/2addr v2, v3

    move/from16 v4, p1

    .line 845
    invoke-static {v7, v4, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v2

    shl-int/lit8 v3, v3, 0x10

    move/from16 v4, p2

    .line 847
    invoke-static {v1, v4, v3}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    .line 849
    invoke-virtual {v0, v2, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onMeasureChild(Landroid/view/View;IIII)V
    .locals 0

    .line 760
    invoke-virtual/range {p0 .. p5}, Landroid/view/ViewGroup;->measureChildWithMargins(Landroid/view/View;IIII)V

    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .locals 11

    .line 1964
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 1966
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 1967
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/16 v5, 0x8

    if-ne v4, v5, :cond_0

    goto :goto_1

    .line 1972
    :cond_0
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Ll/ܰ᩸;

    .line 1973
    invoke-virtual {v4, v1}, Ll/ܰ᩸;->֫(I)Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_1

    .line 2952
    :cond_1
    iget-object v4, v4, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    if-eqz v4, :cond_2

    move-object v5, p0

    move-object v7, p1

    move v8, p2

    move v9, p3

    move v10, p4

    .line 1979
    invoke-virtual/range {v4 .. v10}, Ll/ۛ᩸;->onNestedFling(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;FFZ)Z

    move-result v4

    or-int/2addr v3, v4

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    if-eqz v3, :cond_4

    const/4 p1, 0x1

    .line 1984
    invoke-virtual {p0, p1}, Ll/ᩳ᩹;->onChildViewsChanged(I)V

    :cond_4
    return v3
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .locals 10

    .line 1994
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 1996
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 1997
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v4

    const/16 v5, 0x8

    if-ne v4, v5, :cond_0

    goto :goto_1

    .line 2002
    :cond_0
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Ll/ܰ᩸;

    .line 2003
    invoke-virtual {v4, v1}, Ll/ܰ᩸;->֫(I)Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_1

    .line 2952
    :cond_1
    iget-object v4, v4, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    if-eqz v4, :cond_2

    move-object v5, p0

    move-object v7, p1

    move v8, p2

    move v9, p3

    .line 2009
    invoke-virtual/range {v4 .. v9}, Ll/ۛ᩸;->onNestedPreFling(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;FF)Z

    move-result v4

    or-int/2addr v3, v4

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return v3
.end method

.method public onNestedPreScroll(Landroid/view/View;II[I)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    .line 1913
    invoke-virtual/range {v0 .. v5}, Ll/ᩳ᩹;->onNestedPreScroll(Landroid/view/View;II[II)V

    return-void
.end method

.method public onNestedPreScroll(Landroid/view/View;II[II)V
    .locals 16

    move-object/from16 v8, p0

    .line 1923
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v9

    const/4 v10, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_0
    const/4 v14, 0x1

    if-ge v11, v9, :cond_5

    .line 1925
    invoke-virtual {v8, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1926
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v3, 0x8

    if-ne v1, v3, :cond_0

    move/from16 v15, p5

    goto :goto_3

    .line 1931
    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Ll/ܰ᩸;

    move/from16 v15, p5

    .line 1932
    invoke-virtual {v1, v15}, Ll/ܰ᩸;->֫(I)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_3

    .line 2952
    :cond_1
    iget-object v1, v1, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    if-eqz v1, :cond_4

    .line 1938
    iget-object v6, v8, Ll/ᩳ᩹;->mBehaviorConsumed:[I

    aput v10, v6, v10

    .line 1939
    aput v10, v6, v14

    move-object v0, v1

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move/from16 v7, p5

    .line 1940
    invoke-virtual/range {v0 .. v7}, Ll/ۛ᩸;->onNestedPreScroll(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;II[II)V

    .line 1942
    iget-object v0, v8, Ll/ᩳ᩹;->mBehaviorConsumed:[I

    if-lez p2, :cond_2

    aget v0, v0, v10

    invoke-static {v12, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_1

    :cond_2
    aget v0, v0, v10

    .line 1943
    invoke-static {v12, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 1944
    :goto_1
    iget-object v1, v8, Ll/ᩳ᩹;->mBehaviorConsumed:[I

    if-lez p3, :cond_3

    aget v1, v1, v14

    invoke-static {v13, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_2

    :cond_3
    aget v1, v1, v14

    .line 1945
    invoke-static {v13, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    :goto_2
    const/4 v2, 0x1

    move v12, v0

    move v13, v1

    const/4 v0, 0x1

    :cond_4
    :goto_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 1951
    :cond_5
    aput v12, p4, v10

    .line 1952
    aput v13, p4, v14

    if-eqz v0, :cond_6

    .line 1955
    invoke-virtual {v8, v14}, Ll/ᩳ᩹;->onChildViewsChanged(I)V

    :cond_6
    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIII)V
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    .line 1852
    invoke-virtual/range {v0 .. v6}, Ll/ᩳ᩹;->onNestedScroll(Landroid/view/View;IIIII)V

    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIIII)V
    .locals 8

    const/4 v6, 0x0

    .line 1859
    iget-object v7, p0, Ll/ᩳ᩹;->mNestedScrollingV2ConsumedCompat:[I

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v7}, Ll/ᩳ᩹;->onNestedScroll(Landroid/view/View;IIIII[I)V

    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIIII[I)V
    .locals 17

    move-object/from16 v10, p0

    .line 1868
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v11

    const/4 v12, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_0
    const/4 v9, 0x1

    if-ge v13, v11, :cond_5

    .line 1874
    invoke-virtual {v10, v13}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1875
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v3, 0x8

    if-ne v1, v3, :cond_0

    goto :goto_3

    .line 1880
    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Ll/ܰ᩸;

    move/from16 v8, p6

    .line 1881
    invoke-virtual {v1, v8}, Ll/ܰ᩸;->֫(I)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_3

    .line 2952
    :cond_1
    iget-object v1, v1, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    if-eqz v1, :cond_4

    .line 1888
    iget-object v7, v10, Ll/ᩳ᩹;->mBehaviorConsumed:[I

    aput v12, v7, v12

    .line 1889
    aput v12, v7, v9

    move-object v0, v1

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v16, v7

    move/from16 v7, p5

    move/from16 v8, p6

    move-object/from16 v9, v16

    .line 1891
    invoke-virtual/range {v0 .. v9}, Ll/ۛ᩸;->onNestedScroll(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;IIIII[I)V

    .line 1894
    iget-object v0, v10, Ll/ᩳ᩹;->mBehaviorConsumed:[I

    if-lez p4, :cond_2

    aget v0, v0, v12

    invoke-static {v14, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_1

    :cond_2
    aget v0, v0, v12

    .line 1895
    invoke-static {v14, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 1896
    :goto_1
    iget-object v1, v10, Ll/ᩳ᩹;->mBehaviorConsumed:[I

    const/4 v2, 0x1

    if-lez p5, :cond_3

    aget v1, v1, v2

    invoke-static {v15, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_2

    :cond_3
    aget v1, v1, v2

    .line 1897
    invoke-static {v15, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    :goto_2
    const/4 v2, 0x1

    move v14, v0

    move v15, v1

    const/4 v0, 0x1

    :cond_4
    :goto_3
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    :cond_5
    const/4 v2, 0x1

    .line 1903
    aget v1, p7, v12

    add-int/2addr v1, v14

    aput v1, p7, v12

    .line 1904
    aget v1, p7, v2

    add-int/2addr v1, v15

    aput v1, p7, v2

    if-eqz v0, :cond_6

    .line 1907
    invoke-virtual {v10, v2}, Ll/ᩳ᩹;->onChildViewsChanged(I)V

    :cond_6
    return-void
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1796
    invoke-virtual {p0, p1, p2, p3, v0}, Ll/ᩳ᩹;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;II)V

    return-void
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;II)V
    .locals 9

    .line 1802
    iget-object v0, p0, Ll/ᩳ᩹;->mNestedScrollingParentHelper:Ll/ۧۨ;

    invoke-virtual {v0, p3, p4}, Ll/ۧۨ;->֫(II)V

    .line 1803
    iput-object p2, p0, Ll/ᩳ᩹;->mNestedScrollingTarget:Landroid/view/View;

    .line 1805
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 1807
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 1808
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Ll/ܰ᩸;

    .line 1809
    invoke-virtual {v2, p4}, Ll/ܰ᩸;->֫(I)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    .line 2952
    :cond_0
    iget-object v2, v2, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    if-eqz v2, :cond_1

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    move v7, p3

    move v8, p4

    .line 1815
    invoke-virtual/range {v2 .. v8}, Ll/ۛ᩸;->onNestedScrollAccepted(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)V

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 6

    .line 3241
    instance-of v0, p1, Ll/ۧ᩹;

    if-nez v0, :cond_0

    .line 3242
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 3246
    :cond_0
    check-cast p1, Ll/ۧ᩹;

    .line 3247
    invoke-virtual {p1}, Ll/۟֫֫;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 3249
    iget-object p1, p1, Ll/ۧ᩹;->᩸:Landroid/util/SparseArray;

    .line 3251
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 3252
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 3253
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v3

    .line 3254
    invoke-virtual {p0, v2}, Ll/ᩳ᩹;->getResolvedLayoutParams(Landroid/view/View;)Ll/ܰ᩸;

    move-result-object v4

    .line 2952
    iget-object v4, v4, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    const/4 v5, -0x1

    if-eq v3, v5, :cond_1

    if-eqz v4, :cond_1

    .line 3258
    invoke-virtual {p1, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/Parcelable;

    if-eqz v3, :cond_1

    .line 3260
    invoke-virtual {v4, p0, v2, v3}, Ll/ۛ᩸;->onRestoreInstanceState(Ll/ᩳ᩹;Landroid/view/View;Landroid/os/Parcelable;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 8

    .line 3269
    new-instance v0, Ll/ۧ᩹;

    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۧ᩹;-><init>(Landroid/os/Parcelable;)V

    .line 3271
    new-instance v1, Landroid/util/SparseArray;

    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 3272
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    .line 3273
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 3274
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v5

    .line 3275
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Ll/ܰ᩸;

    .line 2952
    iget-object v6, v6, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    const/4 v7, -0x1

    if-eq v5, v7, :cond_0

    if-eqz v6, :cond_0

    .line 3280
    invoke-virtual {v6, p0, v4}, Ll/ۛ᩸;->onSaveInstanceState(Ll/ᩳ᩹;Landroid/view/View;)Landroid/os/Parcelable;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 3282
    invoke-virtual {v1, v5, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 3286
    :cond_1
    iput-object v1, v0, Ll/ۧ᩹;->᩸:Landroid/util/SparseArray;

    return-object v0
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .locals 1

    const/4 v0, 0x0

    .line 1765
    invoke-virtual {p0, p1, p2, p3, v0}, Ll/ᩳ᩹;->onStartNestedScroll(Landroid/view/View;Landroid/view/View;II)Z

    move-result p1

    return p1
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;II)Z
    .locals 14

    move/from16 v7, p4

    .line 1773
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v8

    const/4 v9, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_0
    if-ge v10, v8, :cond_2

    move-object v12, p0

    .line 1775
    invoke-virtual {p0, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1776
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    goto :goto_1

    .line 1780
    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ll/ܰ᩸;

    .line 2952
    iget-object v0, v13, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    if-eqz v0, :cond_1

    move-object v1, p0

    move-object v3, p1

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    .line 1783
    invoke-virtual/range {v0 .. v6}, Ll/ۛ᩸;->onStartNestedScroll(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;Landroid/view/View;II)Z

    move-result v0

    or-int v1, v11, v0

    .line 1786
    invoke-virtual {v13, v7, v0}, Ll/ܰ᩸;->֫(IZ)V

    move v11, v1

    goto :goto_1

    .line 1788
    :cond_1
    invoke-virtual {v13, v7, v9}, Ll/ܰ᩸;->֫(IZ)V

    :goto_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_2
    move-object v12, p0

    return v11
.end method

.method public onStopNestedScroll(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    .line 1823
    invoke-virtual {p0, p1, v0}, Ll/ᩳ᩹;->onStopNestedScroll(Landroid/view/View;I)V

    return-void
.end method

.method public onStopNestedScroll(Landroid/view/View;I)V
    .locals 6

    .line 1829
    iget-object v0, p0, Ll/ᩳ᩹;->mNestedScrollingParentHelper:Ll/ۧۨ;

    invoke-virtual {v0, p2}, Ll/ۧۨ;->ۧ(I)V

    .line 1831
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    .line 1833
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 1834
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Ll/ܰ᩸;

    .line 1835
    invoke-virtual {v4, p2}, Ll/ܰ᩸;->֫(I)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    .line 2952
    :cond_0
    iget-object v5, v4, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    if-eqz v5, :cond_1

    .line 1841
    invoke-virtual {v5, p0, v3, p1, p2}, Ll/ۛ᩸;->onStopNestedScroll(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/View;I)V

    .line 3054
    :cond_1
    invoke-virtual {v4, p2, v1}, Ll/ܰ᩸;->֫(IZ)V

    .line 1844
    invoke-virtual {v4}, Ll/ܰ᩸;->ܿ()V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 1846
    iput-object p1, p0, Ll/ᩳ᩹;->mNestedScrollingTarget:Landroid/view/View;

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 555
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    .line 557
    iget-object v3, v0, Ll/ᩳ᩹;->mBehaviorTouchView:Landroid/view/View;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_0

    invoke-direct {v0, v1, v4}, Ll/ᩳ᩹;->֫(Landroid/view/MotionEvent;I)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 560
    :goto_0
    iget-object v6, v0, Ll/ᩳ᩹;->mBehaviorTouchView:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Ll/ܰ᩸;

    .line 2952
    iget-object v6, v6, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    if-eqz v6, :cond_1

    .line 563
    iget-object v7, v0, Ll/ᩳ᩹;->mBehaviorTouchView:Landroid/view/View;

    invoke-virtual {v6, v0, v7, v1}, Ll/ۛ᩸;->onTouchEvent(Ll/ᩳ᩹;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result v6

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    .line 568
    :goto_1
    iget-object v7, v0, Ll/ᩳ᩹;->mBehaviorTouchView:Landroid/view/View;

    const/4 v8, 0x0

    if-nez v7, :cond_2

    .line 569
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    or-int/2addr v6, v1

    goto :goto_2

    :cond_2
    if-eqz v3, :cond_3

    .line 572
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v11

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v13, 0x3

    const/4 v14, 0x0

    move-wide v9, v11

    .line 573
    invoke-static/range {v9 .. v16}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v8

    .line 576
    invoke-super {v0, v8}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    :cond_3
    :goto_2
    if-eqz v8, :cond_4

    .line 580
    invoke-virtual {v8}, Landroid/view/MotionEvent;->recycle()V

    :cond_4
    if-eq v2, v4, :cond_6

    const/4 v1, 0x3

    if-ne v2, v1, :cond_5

    goto :goto_3

    :cond_5
    return v6

    .line 584
    :cond_6
    :goto_3
    invoke-direct {v0, v5}, Ll/ᩳ᩹;->֫(Z)V

    return v6
.end method

.method public recordLastChildRect(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    .line 953
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܰ᩸;

    .line 2987
    iget-object p1, p1, Ll/ܰ᩸;->ۚ:Landroid/graphics/Rect;

    invoke-virtual {p1, p2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    return-void
.end method

.method public removePreDrawListener()V
    .locals 2

    .line 1634
    iget-boolean v0, p0, Ll/ᩳ᩹;->mIsAttachedToWindow:Z

    if-eqz v0, :cond_0

    .line 1635
    iget-object v0, p0, Ll/ᩳ᩹;->mOnPreDrawListener:Ll/۟᩸;

    if-eqz v0, :cond_0

    .line 1636
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 1637
    iget-object v1, p0, Ll/ᩳ᩹;->mOnPreDrawListener:Ll/۟᩸;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_0
    const/4 v0, 0x0

    .line 1640
    iput-boolean v0, p0, Ll/ᩳ᩹;->mNeedsPreDrawListener:Z

    return-void
.end method

.method public requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 1

    .line 3293
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܰ᩸;

    .line 2952
    iget-object v0, v0, Ll/ܰ᩸;->᩷:Ll/ۛ᩸;

    if-eqz v0, :cond_0

    .line 3297
    invoke-virtual {v0, p0, p1, p2, p3}, Ll/ۛ᩸;->onRequestChildRectangleOnScreen(Ll/ᩳ᩹;Landroid/view/View;Landroid/graphics/Rect;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 3301
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z

    move-result p1

    return p1
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 0

    .line 592
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    if-eqz p1, :cond_0

    .line 593
    iget-boolean p1, p0, Ll/ᩳ᩹;->mDisallowInterceptReset:Z

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 594
    invoke-direct {p0, p1}, Ll/ᩳ᩹;->֫(Z)V

    const/4 p1, 0x1

    .line 595
    iput-boolean p1, p0, Ll/ᩳ᩹;->mDisallowInterceptReset:Z

    :cond_0
    return-void
.end method

.method public setFitsSystemWindows(Z)V
    .locals 0

    .line 938
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setFitsSystemWindows(Z)V

    .line 939
    invoke-direct {p0}, Ll/ᩳ᩹;->ܽ()V

    return-void
.end method

.method public setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V
    .locals 0

    .line 259
    iput-object p1, p0, Ll/ᩳ᩹;->mOnHierarchyChangeListener:Landroid/view/ViewGroup$OnHierarchyChangeListener;

    return-void
.end method

.method public setStatusBarBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 302
    iget-object v0, p0, Ll/ᩳ᩹;->mStatusBarBackground:Landroid/graphics/drawable/Drawable;

    if-eq v0, p1, :cond_5

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 304
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    :cond_0
    if-eqz p1, :cond_1

    .line 306
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_1
    iput-object v1, p0, Ll/ᩳ᩹;->mStatusBarBackground:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_4

    .line 308
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 309
    iget-object p1, p0, Ll/ᩳ᩹;->mStatusBarBackground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 311
    :cond_2
    iget-object p1, p0, Ll/ᩳ᩹;->mStatusBarBackground:Landroid/graphics/drawable/Drawable;

    .line 312
    sget v0, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    .line 311
    invoke-static {p1, v0}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;I)Z

    .line 313
    iget-object p1, p0, Ll/ᩳ᩹;->mStatusBarBackground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 314
    iget-object p1, p0, Ll/ᩳ᩹;->mStatusBarBackground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 316
    :cond_4
    sget p1, Ll/ܿ᩺;->֫:I

    .line 1323
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_5
    return-void
.end method

.method public setStatusBarBackgroundColor(I)V
    .locals 1

    .line 380
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0}, Ll/ᩳ᩹;->setStatusBarBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setStatusBarBackgroundResource(I)V
    .locals 1

    if-eqz p1, :cond_0

    .line 369
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ll/֨ۙ;->ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Ll/ᩳ᩹;->setStatusBarBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setVisibility(I)V
    .locals 2

    .line 354
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 357
    :goto_0
    iget-object v1, p0, Ll/ᩳ᩹;->mStatusBarBackground:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v1

    if-eq v1, p1, :cond_1

    .line 358
    iget-object v1, p0, Ll/ᩳ᩹;->mStatusBarBackground:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, p1, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_1
    return-void
.end method

.method public final setWindowInsets(Ll/᩸ܰ;)Ll/᩸ܰ;
    .locals 2

    .line 384
    iget-object v0, p0, Ll/ᩳ᩹;->mLastInsets:Ll/᩸ܰ;

    .line 50
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 385
    iput-object p1, p0, Ll/ᩳ᩹;->mLastInsets:Ll/᩸ܰ;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 386
    invoke-virtual {p1}, Ll/᩸ܰ;->ۢ()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Ll/ᩳ᩹;->mDrawStatusBarBackground:Z

    if-nez v1, :cond_1

    .line 387
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 390
    invoke-direct {p0, p1}, Ll/ᩳ᩹;->֫(Ll/᩸ܰ;)Ll/᩸ܰ;

    move-result-object p1

    .line 391
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    :cond_2
    return-object p1
.end method

.method public verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .line 349
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ᩳ᩹;->mStatusBarBackground:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
