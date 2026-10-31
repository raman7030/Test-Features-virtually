.class public final Ll/ۚۧ֫;
.super Ll/ܽۛ;
.source "O607"


# instance fields
.field public final ֫:Landroid/graphics/Rect;

.field public final synthetic ۧ:Ll/۬ۧ֫;


# direct methods
.method public constructor <init>(Ll/۬ۧ֫;)V
    .locals 0

    .line 2425
    iput-object p1, p0, Ll/ۚۧ֫;->ۧ:Ll/۬ۧ֫;

    invoke-direct {p0}, Ll/ܽۛ;-><init>()V

    .line 2426
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Ll/ۚۧ֫;->֫:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public final dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 2

    .line 2475
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_1

    .line 2476
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityRecord;->getText()Ljava/util/List;

    .line 2477
    iget-object p1, p0, Ll/ۚۧ֫;->ۧ:Ll/۬ۧ֫;

    invoke-virtual {p1}, Ll/۬ۧ֫;->ۧ()Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 2479
    invoke-virtual {p1, p2}, Ll/۬ۧ֫;->ۧ(Landroid/view/View;)I

    move-result p2

    .line 2480
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 779
    sget v0, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    move-result p1

    .line 134
    invoke-static {p2, p1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    :cond_0
    const/4 p1, 0x1

    return p1

    .line 2489
    :cond_1
    invoke-super {p0, p1, p2}, Ll/ܽۛ;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 2463
    invoke-super {p0, p1, p2}, Ll/ܽۛ;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    const-string p1, "androidx.drawerlayout.widget.DrawerLayout"

    .line 2465
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V
    .locals 5

    .line 2430
    sget-boolean v0, Ll/۬ۧ֫;->᩵֫:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 2431
    invoke-super {p0, p1, p2}, Ll/ܽۛ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V

    goto/16 :goto_1

    .line 2436
    :cond_0
    invoke-static {p2}, Ll/ܳ۟;->֫(Ll/ܳ۟;)Ll/ܳ۟;

    move-result-object v0

    .line 2437
    invoke-super {p0, p1, v0}, Ll/ܽۛ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V

    .line 2439
    invoke-virtual {p2, p1}, Ll/ܳ۟;->ᩳ(Landroid/view/View;)V

    .line 2440
    sget v2, Ll/ܿ᩺;->֫:I

    .line 2016
    invoke-virtual {p1}, Landroid/view/View;->getParentForAccessibility()Landroid/view/ViewParent;

    move-result-object v2

    .line 2441
    instance-of v3, v2, Landroid/view/View;

    if-eqz v3, :cond_1

    .line 2442
    check-cast v2, Landroid/view/View;

    invoke-virtual {p2, v2}, Ll/ܳ۟;->ܽ(Landroid/view/View;)V

    .line 2520
    :cond_1
    iget-object v2, p0, Ll/ۚۧ֫;->֫:Landroid/graphics/Rect;

    invoke-virtual {v0, v2}, Ll/ܳ۟;->ۧ(Landroid/graphics/Rect;)V

    .line 2521
    invoke-virtual {p2, v2}, Ll/ܳ۟;->ᩳ(Landroid/graphics/Rect;)V

    .line 2523
    invoke-virtual {v0}, Ll/ܳ۟;->֨()Z

    move-result v2

    invoke-virtual {p2, v2}, Ll/ܳ۟;->ᩴ(Z)V

    .line 2524
    invoke-virtual {v0}, Ll/ܳ۟;->ܳ()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {p2, v2}, Ll/ܳ۟;->ᩳ(Ljava/lang/CharSequence;)V

    .line 2525
    invoke-virtual {v0}, Ll/ܳ۟;->ܽ()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {p2, v2}, Ll/ܳ۟;->֫(Ljava/lang/CharSequence;)V

    .line 2526
    invoke-virtual {v0}, Ll/ܳ۟;->ᩳ()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {p2, v2}, Ll/ܳ۟;->ۧ(Ljava/lang/CharSequence;)V

    .line 2528
    invoke-virtual {v0}, Ll/ܳ۟;->ۡ()Z

    move-result v2

    invoke-virtual {p2, v2}, Ll/ܳ۟;->ܳ(Z)V

    .line 2529
    invoke-virtual {v0}, Ll/ܳ۟;->ۖ()Z

    move-result v2

    invoke-virtual {p2, v2}, Ll/ܳ۟;->ۜ(Z)V

    .line 2530
    invoke-virtual {v0}, Ll/ܳ۟;->ۜ()Z

    move-result v2

    invoke-virtual {p2, v2}, Ll/ܳ۟;->֫(Z)V

    .line 2531
    invoke-virtual {v0}, Ll/ܳ۟;->֡()Z

    move-result v2

    invoke-virtual {p2, v2}, Ll/ܳ۟;->ۖ(Z)V

    .line 2533
    invoke-virtual {v0}, Ll/ܳ۟;->֫()I

    move-result v0

    invoke-virtual {p2, v0}, Ll/ܳ۟;->֫(I)V

    .line 2447
    check-cast p1, Landroid/view/ViewGroup;

    .line 2502
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 2504
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 2505
    invoke-static {v3}, Ll/۬ۧ֫;->ᩳ(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 2506
    invoke-virtual {p2, v3}, Ll/ܳ۟;->֫(Landroid/view/View;)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    const-string p1, "androidx.drawerlayout.widget.DrawerLayout"

    .line 2450
    invoke-virtual {p2, p1}, Ll/ܳ۟;->֫(Ljava/lang/CharSequence;)V

    .line 2455
    invoke-virtual {p2, v1}, Ll/ܳ۟;->᩻(Z)V

    .line 2456
    invoke-virtual {p2, v1}, Ll/ܳ۟;->ۜ(Z)V

    .line 2457
    sget-object p1, Ll/ܰܰ;->ۢ:Ll/ܰܰ;

    invoke-virtual {p2, p1}, Ll/ܳ۟;->ۧ(Ll/ܰܰ;)V

    .line 2458
    sget-object p1, Ll/ܰܰ;->ܿ:Ll/ܰܰ;

    invoke-virtual {p2, p1}, Ll/ܳ۟;->ۧ(Ll/ܰܰ;)V

    return-void
.end method

.method public final onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 2495
    sget-boolean v0, Ll/۬ۧ֫;->᩵֫:Z

    if-nez v0, :cond_1

    invoke-static {p2}, Ll/۬ۧ֫;->ᩳ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    .line 2496
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2, p3}, Ll/ܽۛ;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method
