.class public final Ll/᩺۫ۧ;
.super Ll/ܽۛ;
.source "U6BG"


# instance fields
.field public final ֫:Landroid/graphics/Rect;

.field public final synthetic ۧ:Ll/ܳۤۧ;


# direct methods
.method public constructor <init>(Ll/ܳۤۧ;)V
    .locals 0

    .line 1733
    iput-object p1, p0, Ll/᩺۫ۧ;->ۧ:Ll/ܳۤۧ;

    invoke-direct {p0}, Ll/ܽۛ;-><init>()V

    .line 1734
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Ll/᩺۫ۧ;->֫:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .line 1767
    invoke-super {p0, p1, p2}, Ll/ܽۛ;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    const-string p1, "androidx.slidingpanelayout.widget.SlidingPaneLayout"

    .line 1769
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V
    .locals 4

    .line 1738
    invoke-static {p2}, Ll/ܳ۟;->֫(Ll/ܳ۟;)Ll/ܳ۟;

    move-result-object v0

    .line 1739
    invoke-super {p0, p1, v0}, Ll/ܽۛ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V

    .line 1794
    iget-object v1, p0, Ll/᩺۫ۧ;->֫:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Ll/ܳ۟;->ۧ(Landroid/graphics/Rect;)V

    .line 1795
    invoke-virtual {p2, v1}, Ll/ܳ۟;->ᩳ(Landroid/graphics/Rect;)V

    .line 1797
    invoke-virtual {v0}, Ll/ܳ۟;->֨()Z

    move-result v1

    invoke-virtual {p2, v1}, Ll/ܳ۟;->ᩴ(Z)V

    .line 1798
    invoke-virtual {v0}, Ll/ܳ۟;->ܳ()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p2, v1}, Ll/ܳ۟;->ᩳ(Ljava/lang/CharSequence;)V

    .line 1799
    invoke-virtual {v0}, Ll/ܳ۟;->ܽ()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p2, v1}, Ll/ܳ۟;->֫(Ljava/lang/CharSequence;)V

    .line 1800
    invoke-virtual {v0}, Ll/ܳ۟;->ᩳ()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p2, v1}, Ll/ܳ۟;->ۧ(Ljava/lang/CharSequence;)V

    .line 1802
    invoke-virtual {v0}, Ll/ܳ۟;->ۡ()Z

    move-result v1

    invoke-virtual {p2, v1}, Ll/ܳ۟;->ܳ(Z)V

    .line 1803
    invoke-virtual {v0}, Ll/ܳ۟;->ۢ()Z

    move-result v1

    invoke-virtual {p2, v1}, Ll/ܳ۟;->ᩳ(Z)V

    .line 1804
    invoke-virtual {v0}, Ll/ܳ۟;->ܺ()Z

    move-result v1

    invoke-virtual {p2, v1}, Ll/ܳ۟;->᩻(Z)V

    .line 1805
    invoke-virtual {v0}, Ll/ܳ۟;->ۖ()Z

    move-result v1

    invoke-virtual {p2, v1}, Ll/ܳ۟;->ۜ(Z)V

    .line 1806
    invoke-virtual {v0}, Ll/ܳ۟;->ۜ()Z

    move-result v1

    invoke-virtual {p2, v1}, Ll/ܳ۟;->֫(Z)V

    .line 1807
    invoke-virtual {v0}, Ll/ܳ۟;->֡()Z

    move-result v1

    invoke-virtual {p2, v1}, Ll/ܳ۟;->ۖ(Z)V

    .line 1808
    invoke-virtual {v0}, Ll/ܳ۟;->ۘ()Z

    move-result v1

    invoke-virtual {p2, v1}, Ll/ܳ۟;->ۢ(Z)V

    .line 1810
    invoke-virtual {v0}, Ll/ܳ۟;->֫()I

    move-result v1

    invoke-virtual {p2, v1}, Ll/ܳ۟;->֫(I)V

    .line 1812
    invoke-virtual {v0}, Ll/ܳ۟;->ܿ()I

    move-result v0

    invoke-virtual {p2, v0}, Ll/ܳ۟;->ܽ(I)V

    const-string v0, "androidx.slidingpanelayout.widget.SlidingPaneLayout"

    .line 1743
    invoke-virtual {p2, v0}, Ll/ܳ۟;->֫(Ljava/lang/CharSequence;)V

    .line 1744
    invoke-virtual {p2, p1}, Ll/ܳ۟;->ᩳ(Landroid/view/View;)V

    .line 1746
    sget v0, Ll/ܿ᩺;->֫:I

    .line 2016
    invoke-virtual {p1}, Landroid/view/View;->getParentForAccessibility()Landroid/view/ViewParent;

    move-result-object p1

    .line 1747
    instance-of v0, p1, Landroid/view/View;

    if-eqz v0, :cond_0

    .line 1748
    check-cast p1, Landroid/view/View;

    invoke-virtual {p2, p1}, Ll/ܳ۟;->ܽ(Landroid/view/View;)V

    .line 1753
    :cond_0
    iget-object p1, p0, Ll/᩺۫ۧ;->ۧ:Ll/ܳۤۧ;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 1755
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1782
    invoke-virtual {p1, v2}, Ll/ܳۤۧ;->ܽ(Landroid/view/View;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 1756
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    const/4 v3, 0x1

    .line 1427
    invoke-virtual {v2, v3}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1760
    invoke-virtual {p2, v2}, Ll/ܳ۟;->֫(Landroid/view/View;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 1782
    iget-object v0, p0, Ll/᩺۫ۧ;->ۧ:Ll/ܳۤۧ;

    invoke-virtual {v0, p2}, Ll/ܳۤۧ;->ܽ(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1776
    invoke-super {p0, p1, p2, p3}, Ll/ܽۛ;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
