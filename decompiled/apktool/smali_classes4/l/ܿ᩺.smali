.class public final Ll/ܿ᩺;
.super Ljava/lang/Object;
.source "95QI"


# static fields
.field public static final synthetic ֫:I

.field public static ۜ:Ljava/util/WeakHashMap;

.field public static final ۧ:[I

.field public static final ܳ:Ll/᩹ۨ;

.field public static final ܽ:Ll/ۚۨ;

.field public static ܿ:Ljava/lang/reflect/Field;

.field public static ᩳ:Z

.field public static ᩻:Ljava/lang/ThreadLocal;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x20

    new-array v0, v0, [I

    .line 1582
    fill-array-data v0, :array_0

    sput-object v0, Ll/ܿ᩺;->ۧ:[I

    .line 3225
    new-instance v0, Ll/ۚۨ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ܿ᩺;->ܽ:Ll/ۚۨ;

    .line 4920
    new-instance v0, Ll/᩹ۨ;

    invoke-direct {v0}, Ll/᩹ۨ;-><init>()V

    sput-object v0, Ll/ܿ᩺;->ܳ:Ll/᩹ۨ;

    return-void

    :array_0
    .array-data 4
        0x7f0a0013
        0x7f0a0014
        0x7f0a001f
        0x7f0a002a
        0x7f0a002d
        0x7f0a002e
        0x7f0a002f
        0x7f0a0030
        0x7f0a0031
        0x7f0a0032
        0x7f0a0015
        0x7f0a0016
        0x7f0a0017
        0x7f0a0018
        0x7f0a0019
        0x7f0a001a
        0x7f0a001b
        0x7f0a001c
        0x7f0a001d
        0x7f0a001e
        0x7f0a0020
        0x7f0a0021
        0x7f0a0022
        0x7f0a0023
        0x7f0a0024
        0x7f0a0025
        0x7f0a0026
        0x7f0a0027
        0x7f0a0028
        0x7f0a0029
        0x7f0a002b
        0x7f0a002c
    .end array-data
.end method

.method public static ֡(Landroid/view/View;)V
    .locals 2

    .line 4094
    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v1, v0

    .line 4095
    invoke-virtual {p0, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 4096
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Ljava/lang/String;Ll/ۚ۟;)I
    .locals 9

    .line 1619
    invoke-static {p0}, Ll/ܿ᩺;->ܿ(Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 1620
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, -0x1

    if-ge v2, v3, :cond_1

    .line 1621
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰܰ;

    invoke-virtual {v3}, Ll/ܰܰ;->ۧ()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-static {p1, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1622
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰܰ;

    invoke-virtual {v0}, Ll/ܰܰ;->֫()I

    move-result v0

    goto :goto_4

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    const/4 v3, 0x0

    :goto_1
    const/16 v5, 0x20

    if-ge v3, v5, :cond_5

    if-ne v2, v4, :cond_5

    .line 1628
    sget-object v5, Ll/ܿ᩺;->ۧ:[I

    aget v5, v5, v3

    const/4 v6, 0x0

    const/4 v7, 0x1

    .line 1630
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v8

    if-ge v6, v8, :cond_3

    .line 1631
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܰܰ;

    invoke-virtual {v8}, Ll/ܰܰ;->֫()I

    move-result v8

    if-eq v8, v5, :cond_2

    const/4 v8, 0x1

    goto :goto_3

    :cond_2
    const/4 v8, 0x0

    :goto_3
    and-int/2addr v7, v8

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_3
    if-eqz v7, :cond_4

    move v2, v5

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    move v0, v2

    :goto_4
    if-eq v0, v4, :cond_7

    .line 1575
    new-instance v2, Ll/ܰܰ;

    invoke-direct {v2, v0, p1, p2}, Ll/ܰܰ;-><init>(ILjava/lang/CharSequence;Ll/ۚ۟;)V

    .line 1239
    invoke-static {p0}, Ll/ܿ᩺;->ۧ(Landroid/view/View;)Ll/ܽۛ;

    move-result-object p1

    if-nez p1, :cond_6

    .line 1241
    new-instance p1, Ll/ܽۛ;

    invoke-direct {p1}, Ll/ܽۛ;-><init>()V

    .line 1243
    :cond_6
    invoke-static {p0, p1}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܽۛ;)V

    .line 1669
    invoke-virtual {v2}, Ll/ܰܰ;->֫()I

    move-result p1

    invoke-static {p1, p0}, Ll/ܿ᩺;->ܿ(ILandroid/view/View;)V

    .line 1670
    invoke-static {p0}, Ll/ܿ᩺;->ܿ(Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-interface {p1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1671
    invoke-static {v1, p0}, Ll/ܿ᩺;->֫(ILandroid/view/View;)V

    :cond_7
    return v0
.end method

.method public static ֫(Ll/۬۬ۧ;)I
    .locals 2

    .line 852
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 853
    invoke-static {p0}, Ll/ۛۨ;->ۧ(Landroid/view/View;)I

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫()Landroid/graphics/Rect;
    .locals 2

    .line 551
    sget-object v0, Ll/ܿ᩺;->᩻:Ljava/lang/ThreadLocal;

    if-nez v0, :cond_0

    .line 552
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/ܿ᩺;->᩻:Ljava/lang/ThreadLocal;

    .line 554
    :cond_0
    sget-object v0, Ll/ܿ᩺;->᩻:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    if-nez v0, :cond_1

    .line 556
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 557
    sget-object v1, Ll/ܿ᩺;->᩻:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 559
    :cond_1
    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    return-object v0
.end method

.method public static ֫(Landroid/view/View;Ll/ۘۛ;)Ll/ۘۛ;
    .locals 2

    const-string v0, "ViewCompat"

    const/4 v1, 0x3

    .line 3202
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3203
    invoke-static {p1}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 3204
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 3206
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    .line 3207
    invoke-static {p0, p1}, Ll/֫᩺;->֫(Landroid/view/View;Ll/ۘۛ;)Ll/ۘۛ;

    move-result-object p0

    return-object p0

    :cond_1
    const v0, 0x7f0a05af

    .line 3210
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩳۨ;

    .line 3211
    sget-object v1, Ll/ܿ᩺;->ܽ:Ll/ۚۨ;

    if-eqz v0, :cond_4

    .line 3212
    invoke-interface {v0, p0, p1}, Ll/ᩳۨ;->֫(Landroid/view/View;Ll/ۘۛ;)Ll/ۘۛ;

    move-result-object p1

    if-nez p1, :cond_2

    const/4 p0, 0x0

    return-object p0

    .line 3219
    :cond_2
    instance-of v0, p0, Ll/ܿۨ;

    if-eqz v0, :cond_3

    .line 3220
    move-object v1, p0

    check-cast v1, Ll/ܿۨ;

    .line 3213
    :cond_3
    invoke-interface {v1, p1}, Ll/ܿۨ;->onReceiveContent(Ll/ۘۛ;)Ll/ۘۛ;

    move-result-object p0

    return-object p0

    .line 3219
    :cond_4
    instance-of v0, p0, Ll/ܿۨ;

    if-eqz v0, :cond_5

    .line 3220
    move-object v1, p0

    check-cast v1, Ll/ܿۨ;

    .line 3215
    :cond_5
    invoke-interface {v1, p1}, Ll/ܿۨ;->onReceiveContent(Ll/ۘۛ;)Ll/ۘۛ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/view/View;)Ll/ܶ᩺;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2406
    sget-object v0, Ll/ܿ᩺;->ۜ:Ljava/util/WeakHashMap;

    if-nez v0, :cond_0

    .line 2407
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Ll/ܿ᩺;->ۜ:Ljava/util/WeakHashMap;

    .line 2409
    :cond_0
    sget-object v0, Ll/ܿ᩺;->ۜ:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶ᩺;

    if-nez v0, :cond_1

    .line 2411
    new-instance v0, Ll/ܶ᩺;

    invoke-direct {v0, p0}, Ll/ܶ᩺;-><init>(Landroid/view/View;)V

    .line 2412
    sget-object v1, Ll/ܿ᩺;->ۜ:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p0, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public static ֫(Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;
    .locals 2

    .line 2948
    invoke-virtual {p1}, Ll/᩸ܰ;->ۘ()Landroid/view/WindowInsets;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2950
    invoke-static {p0, v0}, Ll/ۙۨ;->֫(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    .line 2951
    invoke-virtual {v1, v0}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2953
    invoke-static {p0, v1}, Ll/᩸ܰ;->֫(Landroid/view/View;Landroid/view/WindowInsets;)Ll/᩸ܰ;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static ֫(ILandroid/view/View;)V
    .locals 5

    .line 4874
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    .line 4875
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 4878
    :cond_0
    invoke-static {p1}, Ll/ܿ᩺;->ᩳ(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 4879
    invoke-virtual {p1}, Landroid/view/View;->isShown()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getWindowVisibility()I

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 4882
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getAccessibilityLiveRegion()I

    move-result v3

    const/16 v4, 0x20

    if-nez v3, :cond_5

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    if-ne p0, v4, :cond_3

    .line 4895
    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v1

    .line 4896
    invoke-virtual {p1, v1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4897
    invoke-virtual {v1, v4}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V

    .line 4898
    invoke-virtual {v1, p0}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 4899
    invoke-virtual {v1, p1}, Landroid/view/accessibility/AccessibilityRecord;->setSource(Landroid/view/View;)V

    .line 4900
    invoke-virtual {p1, v1}, Landroid/view/View;->onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 4901
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object p0

    invoke-static {p1}, Ll/ܿ᩺;->ᩳ(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4902
    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->sendAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    return-void

    .line 4903
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 4904
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 4906
    :try_start_0
    invoke-interface {v0, p1, p1, p0}, Landroid/view/ViewParent;->notifySubtreeAccessibilityStateChanged(Landroid/view/View;Landroid/view/View;I)V
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 4908
    :catch_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_4
    :goto_1
    return-void

    .line 4884
    :cond_5
    :goto_2
    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v0

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    const/16 v4, 0x800

    .line 4885
    :goto_3
    invoke-virtual {v0, v4}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V

    .line 4888
    invoke-virtual {v0, p0}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    if-eqz v1, :cond_7

    .line 4890
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    move-result-object p0

    invoke-static {p1}, Ll/ܿ᩺;->ᩳ(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {p0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4915
    invoke-virtual {p1}, Landroid/view/View;->getImportantForAccessibility()I

    move-result p0

    if-nez p0, :cond_7

    .line 4916
    invoke-virtual {p1, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 4893
    :cond_7
    invoke-virtual {p1, v0}, Landroid/view/View;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public static ֫(Landroid/view/View;F)V
    .locals 0

    .line 2703
    invoke-static {p0, p1}, Ll/۬ۨ;->֫(Landroid/view/View;F)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V
    .locals 9
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "ContextFirst"
            }
        .end annotation
    .end param

    .line 583
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    const/4 v8, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move v7, p5

    .line 584
    invoke-static/range {v2 .. v8}, Ll/ܰۨ;->֫(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    :cond_0
    return-void
.end method

.method public static ֫(Landroid/view/View;Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 3398
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 3399
    invoke-static {p0, p1}, Ll/۬ۨ;->֫(Landroid/view/View;Landroid/content/res/ColorStateList;)V

    const/16 p1, 0x15

    if-ne v0, p1, :cond_3

    .line 3404
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 3405
    invoke-static {p0}, Ll/۬ۨ;->֫(Landroid/view/View;)Landroid/content/res/ColorStateList;

    move-result-object v0

    if-nez v0, :cond_1

    .line 3406
    invoke-static {p0}, Ll/۬ۨ;->ۧ(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz p1, :cond_3

    if-eqz v0, :cond_3

    .line 3408
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3409
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 3411
    :cond_2
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_3
    return-void
.end method

.method public static ֫(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 3446
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 3447
    invoke-static {p0, p1}, Ll/۬ۨ;->֫(Landroid/view/View;Landroid/graphics/PorterDuff$Mode;)V

    const/16 p1, 0x15

    if-ne v0, p1, :cond_3

    .line 3452
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 3453
    invoke-static {p0}, Ll/۬ۨ;->֫(Landroid/view/View;)Landroid/content/res/ColorStateList;

    move-result-object v0

    if-nez v0, :cond_1

    .line 3454
    invoke-static {p0}, Ll/۬ۨ;->ۧ(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz p1, :cond_3

    if-eqz v0, :cond_3

    .line 3456
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3457
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 3459
    :cond_2
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_3
    return-void
.end method

.method public static ֫(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 5

    .line 4703
    new-instance v0, Ll/۠ۨ;

    const/16 v1, 0x8

    const/16 v2, 0x1c

    const v3, 0x7f0a05ad

    .line 4704
    const-class v4, Ljava/lang/CharSequence;

    invoke-direct {v0, v3, v1, v2, v4}, Ll/᩶ۨ;-><init>(IIILjava/lang/Class;)V

    .line 4674
    invoke-virtual {v0, p0, p1}, Ll/᩶ۨ;->ۧ(Landroid/view/View;Ljava/lang/Object;)V

    .line 4675
    sget-object v0, Ll/ܿ᩺;->ܳ:Ll/᩹ۨ;

    if-eqz p1, :cond_0

    .line 4676
    invoke-virtual {v0, p0}, Ll/᩹ۨ;->֫(Landroid/view/View;)V

    return-void

    .line 4678
    :cond_0
    invoke-virtual {v0, p0}, Ll/᩹ۨ;->ۧ(Landroid/view/View;)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Ljava/lang/String;)V
    .locals 0

    .line 2753
    invoke-static {p0, p1}, Ll/۬ۨ;->֫(Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Ll/۬᩺;)V
    .locals 2

    .line 525
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 526
    invoke-static {p0, p1}, Ll/ܽܰ;->֫(Landroid/view/View;Ll/۬᩺;)V

    return-void

    .line 528
    :cond_0
    sget v0, Ll/᩺᩺;->ܿ:I

    const v0, 0x7f0a05ae

    .line 618
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    .line 644
    new-instance v1, Ll/ۨ᩺;

    invoke-direct {v1, p0, p1}, Ll/ۨ᩺;-><init>(Landroid/view/View;Ll/۬᩺;)V

    const p1, 0x7f0a05b6

    .line 629
    invoke-virtual {p0, p1, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    if-nez v0, :cond_1

    .line 636
    invoke-virtual {p0, v1}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    :cond_1
    return-void
.end method

.method public static ֫(Landroid/view/View;Ll/ܰܰ;Ljava/lang/String;Ll/ۚ۟;)V
    .locals 0

    if-nez p3, :cond_0

    if-nez p2, :cond_0

    .line 1659
    invoke-virtual {p1}, Ll/ܰܰ;->֫()I

    move-result p1

    invoke-static {p1, p0}, Ll/ܿ᩺;->ᩳ(ILandroid/view/View;)V

    return-void

    .line 1661
    :cond_0
    invoke-virtual {p1, p2, p3}, Ll/ܰܰ;->֫(Ljava/lang/CharSequence;Ll/ۚ۟;)Ll/ܰܰ;

    move-result-object p1

    .line 1239
    invoke-static {p0}, Ll/ܿ᩺;->ۧ(Landroid/view/View;)Ll/ܽۛ;

    move-result-object p2

    if-nez p2, :cond_1

    .line 1241
    new-instance p2, Ll/ܽۛ;

    invoke-direct {p2}, Ll/ܽۛ;-><init>()V

    .line 1243
    :cond_1
    invoke-static {p0, p2}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܽۛ;)V

    .line 1669
    invoke-virtual {p1}, Ll/ܰܰ;->֫()I

    move-result p2

    invoke-static {p2, p0}, Ll/ܿ᩺;->ܿ(ILandroid/view/View;)V

    .line 1670
    invoke-static {p0}, Ll/ܿ᩺;->ܿ(Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    .line 1671
    invoke-static {p1, p0}, Ll/ܿ᩺;->֫(ILandroid/view/View;)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Ll/ܽۛ;)V
    .locals 1

    if-nez p1, :cond_0

    .line 792
    invoke-static {p0}, Ll/ܿ᩺;->ܽ(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object v0

    instance-of v0, v0, Ll/ۧۛ;

    if-eqz v0, :cond_0

    .line 793
    new-instance p1, Ll/ܽۛ;

    invoke-direct {p1}, Ll/ܽۛ;-><init>()V

    .line 4915
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 4916
    invoke-virtual {p0, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    :cond_1
    if-nez p1, :cond_2

    const/4 p1, 0x0

    goto :goto_0

    .line 796
    :cond_2
    invoke-virtual {p1}, Ll/ܽۛ;->getBridge()Landroid/view/View$AccessibilityDelegate;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Ll/ܽۨ;)V
    .locals 0

    .line 2899
    invoke-static {p0, p1}, Ll/۬ۨ;->֫(Landroid/view/View;Ll/ܽۨ;)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Ll/᩸ܰ;Landroid/graphics/Rect;)V
    .locals 0

    .line 3031
    invoke-static {p0, p1, p2}, Ll/۬ۨ;->֫(Landroid/view/View;Ll/᩸ܰ;Landroid/graphics/Rect;)Ll/᩸ܰ;

    return-void
.end method

.method public static ֫(Landroid/view/View;Z)V
    .locals 5

    .line 4783
    new-instance v0, Ll/᩸ۨ;

    const/16 v1, 0x1c

    const/4 v2, 0x0

    const v3, 0x7f0a05ac

    .line 4813
    const-class v4, Ljava/lang/Boolean;

    invoke-direct {v0, v3, v2, v1, v4}, Ll/᩶ۨ;-><init>(IIILjava/lang/Class;)V

    .line 4779
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ll/᩶ۨ;->ۧ(Landroid/view/View;Ljava/lang/Object;)V

    return-void
.end method

.method public static ֫(Landroid/view/ViewGroup;I)V
    .locals 2

    .line 896
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 897
    invoke-static {p0, p1}, Ll/ۛۨ;->֫(Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public static ֫(Landroid/view/ViewGroup;II)V
    .locals 2

    .line 4200
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 4201
    invoke-static {p0, p1, p2}, Ll/۫ۨ;->֫(Landroid/view/View;II)V

    :cond_0
    return-void
.end method

.method public static ֫(Landroid/view/ViewGroup;Ll/ۜۨ;)V
    .locals 2

    .line 4232
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_1

    if-eqz p1, :cond_0

    .line 4234
    invoke-virtual {p1}, Ll/ۜۨ;->֫()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Landroid/view/PointerIcon;

    .line 4233
    invoke-static {p0, p1}, Ll/ۤۨ;->֫(Landroid/view/View;Landroid/view/PointerIcon;)V

    :cond_1
    return-void
.end method

.method public static ֫(Ll/ۗۘ;Ljava/lang/CharSequence;)V
    .locals 5

    .line 4726
    new-instance v0, Ll/ܶۨ;

    const/16 v1, 0x40

    const/16 v2, 0x1e

    const v3, 0x7f0a05b2

    .line 4727
    const-class v4, Ljava/lang/CharSequence;

    invoke-direct {v0, v3, v1, v2, v4}, Ll/᩶ۨ;-><init>(IIILjava/lang/Class;)V

    .line 1740
    invoke-virtual {v0, p0, p1}, Ll/᩶ۨ;->ۧ(Landroid/view/View;Ljava/lang/Object;)V

    return-void
.end method

.method public static ֫(Ll/᩺ۢ;)[Ljava/lang/String;
    .locals 2

    .line 3176
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    .line 3177
    invoke-static {p0}, Ll/֫᩺;->֫(Landroid/view/View;)[Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const v0, 0x7f0a05b0

    .line 3179
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/String;

    return-object p0
.end method

.method public static ۖ(Landroid/view/View;)F
    .locals 0

    .line 3971
    invoke-static {p0}, Ll/۬ۨ;->᩻(Landroid/view/View;)F

    move-result p0

    return p0
.end method

.method public static ۘ(Landroid/view/View;)Z
    .locals 0

    .line 1214
    invoke-static {p0}, Ll/ܿ᩺;->ܽ(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۜ(Landroid/view/View;)F
    .locals 0

    .line 2715
    invoke-static {p0}, Ll/۬ۨ;->ܽ(Landroid/view/View;)F

    move-result p0

    return p0
.end method

.method public static ۡ(Landroid/view/View;)F
    .locals 0

    .line 2739
    invoke-static {p0}, Ll/۬ۨ;->ܳ(Landroid/view/View;)F

    move-result p0

    return p0
.end method

.method public static ۢ(Landroid/view/View;)Ljava/lang/String;
    .locals 0

    .line 2775
    invoke-static {p0}, Ll/۬ۨ;->ܿ(Landroid/view/View;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Landroid/view/View;)Ll/ܽۛ;
    .locals 1

    .line 1228
    invoke-static {p0}, Ll/ܿ᩺;->ܽ(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 1232
    :cond_0
    instance-of v0, p0, Ll/ۧۛ;

    if-eqz v0, :cond_1

    .line 1233
    check-cast p0, Ll/ۧۛ;

    iget-object p0, p0, Ll/ۧۛ;->֫:Ll/ܽۛ;

    return-object p0

    .line 1235
    :cond_1
    new-instance v0, Ll/ܽۛ;

    invoke-direct {v0, p0}, Ll/ܽۛ;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    return-object v0
.end method

.method public static ۧ(Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;
    .locals 2

    .line 2919
    invoke-virtual {p1}, Ll/᩸ܰ;->ۘ()Landroid/view/WindowInsets;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2921
    invoke-static {p0, v0}, Ll/ۙۨ;->ۧ(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object v1

    .line 2922
    invoke-virtual {v1, v0}, Landroid/view/WindowInsets;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2924
    invoke-static {p0, v1}, Ll/᩸ܰ;->֫(Landroid/view/View;Landroid/view/WindowInsets;)Ll/᩸ܰ;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p1
.end method

.method public static ۧ(ILandroid/view/View;)V
    .locals 6

    .line 4051
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 4052
    invoke-virtual {p1, p0}, Landroid/view/View;->offsetLeftAndRight(I)V

    return-void

    .line 4054
    :cond_0
    invoke-static {}, Ll/ܿ᩺;->֫()Landroid/graphics/Rect;

    move-result-object v0

    .line 4057
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 4058
    instance-of v2, v1, Landroid/view/View;

    if-eqz v2, :cond_1

    .line 4059
    move-object v2, v1

    check-cast v2, Landroid/view/View;

    .line 4060
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v3

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v4

    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v5

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v2

    invoke-virtual {v0, v3, v4, v5, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 4063
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v3

    .line 4064
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v5

    .line 4063
    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/graphics/Rect;->intersects(IIII)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 4082
    :goto_0
    invoke-virtual {p1, p0}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 4083
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p0

    if-nez p0, :cond_2

    .line 4084
    invoke-static {p1}, Ll/ܿ᩺;->֡(Landroid/view/View;)V

    .line 4086
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    .line 4087
    instance-of v3, p0, Landroid/view/View;

    if-eqz v3, :cond_2

    .line 4088
    check-cast p0, Landroid/view/View;

    invoke-static {p0}, Ll/ܿ᩺;->֡(Landroid/view/View;)V

    :cond_2
    if-eqz v2, :cond_3

    .line 4072
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v2

    .line 4073
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    .line 4072
    invoke-virtual {v0, p0, v2, v3, p1}, Landroid/graphics/Rect;->intersect(IIII)Z

    move-result p0

    if-eqz p0, :cond_3

    .line 4074
    check-cast v1, Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    :cond_3
    return-void
.end method

.method public static ۧ(Landroid/view/View;F)V
    .locals 0

    .line 2727
    invoke-static {p0, p1}, Ll/۬ۨ;->ۧ(Landroid/view/View;F)V

    return-void
.end method

.method public static ۧ(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 2

    .line 4265
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 4266
    invoke-static {p0, p1}, Ll/ۛۨ;->֫(Landroid/view/View;Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public static ۧ(Landroid/view/View;Z)V
    .locals 5

    .line 4622
    new-instance v0, Ll/֨ۨ;

    const/16 v1, 0x1c

    const/4 v2, 0x0

    const v3, 0x7f0a05b1

    .line 4813
    const-class v4, Ljava/lang/Boolean;

    invoke-direct {v0, v3, v2, v1, v4}, Ll/᩶ۨ;-><init>(IIILjava/lang/Class;)V

    .line 4598
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Ll/᩶ۨ;->ۧ(Landroid/view/View;Ljava/lang/Object;)V

    return-void
.end method

.method public static ܳ(Landroid/view/View;)Landroid/content/res/ColorStateList;
    .locals 0

    .line 3382
    invoke-static {p0}, Ll/۬ۨ;->֫(Landroid/view/View;)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0
.end method

.method public static ܺ(Landroid/view/View;)Ll/۫ܰ;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3048
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 3049
    invoke-static {p0}, Ll/۟ۨ;->ܽ(Landroid/view/View;)Ll/۫ܰ;

    move-result-object p0

    return-object p0

    .line 3051
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 3052
    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    .line 3053
    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_2

    .line 3054
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 136
    new-instance v1, Ll/۫ܰ;

    invoke-direct {v1, v0, p0}, Ll/۫ܰ;-><init>(Landroid/view/Window;Landroid/view/View;)V

    return-object v1

    :cond_1
    return-object v2

    .line 3057
    :cond_2
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_3
    return-object v2
.end method

.method public static ܽ(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;
    .locals 3

    .line 1248
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 1249
    invoke-static {p0}, Ll/ܰۨ;->֫(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    move-result-object p0

    return-object p0

    .line 1259
    :cond_0
    sget-boolean v0, Ll/ܿ᩺;->ᩳ:Z

    if-eqz v0, :cond_1

    goto :goto_1

    .line 1262
    :cond_1
    sget-object v0, Ll/ܿ᩺;->ܿ:Ljava/lang/reflect/Field;

    const/4 v1, 0x1

    if-nez v0, :cond_2

    .line 1264
    :try_start_0
    const-class v0, Landroid/view/View;

    const-string v2, "mAccessibilityDelegate"

    .line 1265
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sput-object v0, Ll/ܿ᩺;->ܿ:Ljava/lang/reflect/Field;

    .line 1266
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 1268
    :catchall_0
    sput-boolean v1, Ll/ܿ᩺;->ᩳ:Z

    goto :goto_1

    .line 1273
    :cond_2
    :goto_0
    :try_start_1
    sget-object v0, Ll/ܿ᩺;->ܿ:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 1274
    instance-of v0, p0, Landroid/view/View$AccessibilityDelegate;

    if-eqz v0, :cond_3

    .line 1275
    check-cast p0, Landroid/view/View$AccessibilityDelegate;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-object p0

    .line 1279
    :catchall_1
    sput-boolean v1, Ll/ܿ᩺;->ᩳ:Z

    :cond_3
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ܽ(ILandroid/view/View;)V
    .locals 6

    .line 4002
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 4003
    invoke-virtual {p1, p0}, Landroid/view/View;->offsetTopAndBottom(I)V

    return-void

    .line 4005
    :cond_0
    invoke-static {}, Ll/ܿ᩺;->֫()Landroid/graphics/Rect;

    move-result-object v0

    .line 4008
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 4009
    instance-of v2, v1, Landroid/view/View;

    if-eqz v2, :cond_1

    .line 4010
    move-object v2, v1

    check-cast v2, Landroid/view/View;

    .line 4011
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v3

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v4

    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v5

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v2

    invoke-virtual {v0, v3, v4, v5, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 4014
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v3

    .line 4015
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v5

    .line 4014
    invoke-virtual {v0, v2, v3, v4, v5}, Landroid/graphics/Rect;->intersects(IIII)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 4033
    :goto_0
    invoke-virtual {p1, p0}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 4034
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p0

    if-nez p0, :cond_2

    .line 4035
    invoke-static {p1}, Ll/ܿ᩺;->֡(Landroid/view/View;)V

    .line 4037
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    .line 4038
    instance-of v3, p0, Landroid/view/View;

    if-eqz v3, :cond_2

    .line 4039
    check-cast p0, Landroid/view/View;

    invoke-static {p0}, Ll/ܿ᩺;->֡(Landroid/view/View;)V

    :cond_2
    if-eqz v2, :cond_3

    .line 4023
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v2

    .line 4024
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v3

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    .line 4023
    invoke-virtual {v0, p0, v2, v3, p1}, Landroid/graphics/Rect;->intersect(IIII)Z

    move-result p0

    if-eqz p0, :cond_3

    .line 4025
    check-cast v1, Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    :cond_3
    return-void
.end method

.method public static ܽ(Landroid/view/View;F)V
    .locals 0

    .line 3991
    invoke-static {p0, p1}, Ll/۬ۨ;->ܽ(Landroid/view/View;F)V

    return-void
.end method

.method public static ܿ(Landroid/view/View;)Ljava/util/ArrayList;
    .locals 2

    const v0, 0x7f0a05aa

    .line 1704
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    if-nez v1, :cond_0

    .line 1706
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1707
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_0
    return-object v1
.end method

.method public static ܿ(ILandroid/view/View;)V
    .locals 2

    .line 1692
    invoke-static {p1}, Ll/ܿ᩺;->ܿ(Landroid/view/View;)Ljava/util/ArrayList;

    move-result-object p1

    const/4 v0, 0x0

    .line 1693
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 1694
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰܰ;

    invoke-virtual {v1}, Ll/ܰܰ;->֫()I

    move-result v1

    if-ne v1, p0, :cond_0

    .line 1695
    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ᩳ(Landroid/view/View;)Ljava/lang/CharSequence;
    .locals 5

    .line 4703
    new-instance v0, Ll/۠ۨ;

    const/16 v1, 0x8

    const/16 v2, 0x1c

    const v3, 0x7f0a05ad

    .line 4704
    const-class v4, Ljava/lang/CharSequence;

    invoke-direct {v0, v3, v1, v2, v4}, Ll/᩶ۨ;-><init>(IIILjava/lang/Class;)V

    .line 4699
    invoke-virtual {v0, p0}, Ll/᩶ۨ;->ۧ(Landroid/view/View;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    return-object p0
.end method

.method public static ᩳ(ILandroid/view/View;)V
    .locals 0

    .line 1685
    invoke-static {p0, p1}, Ll/ܿ᩺;->ܿ(ILandroid/view/View;)V

    const/4 p0, 0x0

    .line 1686
    invoke-static {p0, p1}, Ll/ܿ᩺;->֫(ILandroid/view/View;)V

    return-void
.end method

.method public static ᩴ(Landroid/view/View;)Z
    .locals 0

    .line 3509
    invoke-static {p0}, Ll/۬ۨ;->ۢ(Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static ᩵(Landroid/view/View;)V
    .locals 0

    .line 2804
    invoke-static {p0}, Ll/ۙۨ;->֫(Landroid/view/View;)V

    return-void
.end method

.method public static ᩷(Landroid/view/View;)Ll/᩸ܰ;
    .locals 2

    .line 3007
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 3008
    invoke-static {p0}, Ll/۫ۨ;->֫(Landroid/view/View;)Ll/᩸ܰ;

    move-result-object p0

    return-object p0

    .line 3010
    :cond_0
    invoke-static {p0}, Ll/۬ۨ;->ᩳ(Landroid/view/View;)Ll/᩸ܰ;

    move-result-object p0

    return-object p0
.end method

.method public static ᩻(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;
    .locals 0

    .line 3429
    invoke-static {p0}, Ll/۬ۨ;->ۧ(Landroid/view/View;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p0

    return-object p0
.end method
