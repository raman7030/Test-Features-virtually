.class public final Ll/ۡܰۧ;
.super Ll/ܽۛ;
.source "Q69A"


# instance fields
.field public final synthetic ֫:Ll/֡ܰۧ;


# direct methods
.method public constructor <init>(Ll/֡ܰۧ;)V
    .locals 0

    .line 3037
    iput-object p1, p0, Ll/ۡܰۧ;->֫:Ll/֡ܰۧ;

    invoke-direct {p0}, Ll/ܽۛ;-><init>()V

    return-void
.end method


# virtual methods
.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    .line 3041
    invoke-super {p0, p1, p2}, Ll/ܽۛ;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 3042
    const-class p1, Ll/֡ܰۧ;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    .line 3087
    iget-object p1, p0, Ll/ۡܰۧ;->֫:Ll/֡ܰۧ;

    iget-object v0, p1, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۨ᩺ۧ;->ۧ()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 3043
    :goto_0
    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityRecord;->setScrollable(Z)V

    .line 3044
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    move-result v0

    const/16 v1, 0x1000

    if-ne v0, v1, :cond_1

    iget-object v0, p1, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    if-eqz v0, :cond_1

    .line 3045
    invoke-virtual {v0}, Ll/ۨ᩺ۧ;->ۧ()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    .line 3046
    iget v0, p1, Ll/֡ܰۧ;->۫:I

    invoke-virtual {p2, v0}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 3047
    iget p1, p1, Ll/֡ܰۧ;->۫:I

    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    :cond_1
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V
    .locals 2

    .line 3053
    invoke-super {p0, p1, p2}, Ll/ܽۛ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V

    .line 3054
    const-class p1, Ll/֡ܰۧ;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ll/ܳ۟;->֫(Ljava/lang/CharSequence;)V

    .line 3087
    iget-object p1, p0, Ll/ۡܰۧ;->֫:Ll/֡ܰۧ;

    iget-object v0, p1, Ll/֡ܰۧ;->᩹:Ll/ۨ᩺ۧ;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۨ᩺ۧ;->ۧ()I

    move-result v0

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 3055
    :goto_0
    invoke-virtual {p2, v0}, Ll/ܳ۟;->ܺ(Z)V

    .line 3056
    invoke-virtual {p1, v1}, Ll/֡ܰۧ;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x1000

    .line 3057
    invoke-virtual {p2, v0}, Ll/ܳ۟;->֫(I)V

    :cond_1
    const/4 v0, -0x1

    .line 3059
    invoke-virtual {p1, v0}, Ll/֡ܰۧ;->canScrollHorizontally(I)Z

    move-result p1

    if-eqz p1, :cond_2

    const/16 p1, 0x2000

    .line 3060
    invoke-virtual {p2, p1}, Ll/ܳ۟;->֫(I)V

    :cond_2
    return-void
.end method

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 2

    .line 3066
    invoke-super {p0, p1, p2, p3}, Ll/ܽۛ;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    const/4 p3, 0x1

    if-eqz p1, :cond_0

    return p3

    :cond_0
    const/16 p1, 0x1000

    const/4 v0, 0x0

    .line 3069
    iget-object v1, p0, Ll/ۡܰۧ;->֫:Ll/֡ܰۧ;

    if-eq p2, p1, :cond_3

    const/16 p1, 0x2000

    if-eq p2, p1, :cond_1

    return v0

    :cond_1
    const/4 p1, -0x1

    .line 3077
    invoke-virtual {v1, p1}, Ll/֡ܰۧ;->canScrollHorizontally(I)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 3078
    iget p1, v1, Ll/֡ܰۧ;->۫:I

    sub-int/2addr p1, p3

    invoke-virtual {v1, p1}, Ll/֡ܰۧ;->ᩳ(I)V

    return p3

    :cond_2
    return v0

    .line 3071
    :cond_3
    invoke-virtual {v1, p3}, Ll/֡ܰۧ;->canScrollHorizontally(I)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 3072
    iget p1, v1, Ll/֡ܰۧ;->۫:I

    add-int/2addr p1, p3

    invoke-virtual {v1, p1}, Ll/֡ܰۧ;->ᩳ(I)V

    return p3

    :cond_4
    return v0
.end method
