.class public final Ll/ۧۛ;
.super Landroid/view/View$AccessibilityDelegate;
.source "86A7"


# instance fields
.field public final ֫:Ll/ܽۛ;


# direct methods
.method public constructor <init>(Ll/ܽۛ;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Landroid/view/View$AccessibilityDelegate;-><init>()V

    .line 67
    iput-object p1, p0, Ll/ۧۛ;->֫:Ll/ܽۛ;

    return-void
.end method


# virtual methods
.method public final dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ۧۛ;->֫:Ll/ܽۛ;

    invoke-virtual {v0, p1, p2}, Ll/ܽۛ;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public final getAccessibilityNodeProvider(Landroid/view/View;)Landroid/view/accessibility/AccessibilityNodeProvider;
    .locals 1

    .line 120
    iget-object v0, p0, Ll/ۧۛ;->֫:Ll/ܽۛ;

    .line 121
    invoke-virtual {v0, p1}, Ll/ܽۛ;->getAccessibilityNodeProvider(Landroid/view/View;)Ll/᩷۟;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 123
    invoke-virtual {p1}, Ll/᩷۟;->֫()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/AccessibilityNodeProvider;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 78
    iget-object v0, p0, Ll/ۧۛ;->֫:Ll/ܽۛ;

    invoke-virtual {v0, p1, p2}, Ll/ܽۛ;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 7

    .line 84
    invoke-static {p2}, Ll/ܳ۟;->֫(Landroid/view/accessibility/AccessibilityNodeInfo;)Ll/ܳ۟;

    move-result-object v0

    .line 85
    sget v1, Ll/ܿ᩺;->֫:I

    .line 4622
    new-instance v1, Ll/֨ۨ;

    const v2, 0x7f0a05b1

    const/4 v3, 0x0

    const/16 v4, 0x1c

    .line 4813
    const-class v5, Ljava/lang/Boolean;

    invoke-direct {v1, v2, v3, v4, v5}, Ll/᩶ۨ;-><init>(IIILjava/lang/Class;)V

    .line 4617
    invoke-virtual {v1, p1}, Ll/᩶ۨ;->ۧ(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 4618
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 85
    :goto_0
    invoke-virtual {v0, v1}, Ll/ܳ۟;->ۡ(Z)V

    .line 4783
    new-instance v1, Ll/᩸ۨ;

    const v6, 0x7f0a05ac

    .line 4813
    invoke-direct {v1, v6, v3, v4, v5}, Ll/᩶ۨ;-><init>(IIILjava/lang/Class;)V

    .line 4762
    invoke-virtual {v1, p1}, Ll/᩶ۨ;->ۧ(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    .line 4763
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 86
    :goto_1
    invoke-virtual {v0, v2}, Ll/ܳ۟;->᩷(Z)V

    .line 87
    invoke-static {p1}, Ll/ܿ᩺;->ᩳ(Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܳ۟;->ܿ(Ljava/lang/CharSequence;)V

    .line 4726
    new-instance v1, Ll/ܶۨ;

    const/16 v2, 0x40

    const/16 v4, 0x1e

    const v5, 0x7f0a05b2

    .line 4727
    const-class v6, Ljava/lang/CharSequence;

    invoke-direct {v1, v5, v2, v4, v6}, Ll/᩶ۨ;-><init>(IIILjava/lang/Class;)V

    .line 1758
    invoke-virtual {v1, p1}, Ll/᩶ۨ;->ۧ(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    .line 88
    invoke-virtual {v0, v1}, Ll/ܳ۟;->ܳ(Ljava/lang/CharSequence;)V

    .line 89
    iget-object v1, p0, Ll/ۧۛ;->֫:Ll/ܽۛ;

    invoke-virtual {v1, p1, v0}, Ll/ܽۛ;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Ll/ܳ۟;)V

    .line 90
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityNodeInfo;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/ܳ۟;->֫(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 91
    invoke-static {p1}, Ll/ܽۛ;->֫(Landroid/view/View;)Ljava/util/List;

    move-result-object p1

    .line 92
    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    if-ge v3, p2, :cond_2

    .line 93
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܰܰ;

    invoke-virtual {v0, p2}, Ll/ܳ۟;->֫(Ll/ܰܰ;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ۧۛ;->֫:Ll/ܽۛ;

    invoke-virtual {v0, p1, p2}, Ll/ܽۛ;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public final onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .line 105
    iget-object v0, p0, Ll/ۧۛ;->֫:Ll/ܽۛ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ܽۛ;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public final performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    .line 128
    iget-object v0, p0, Ll/ۧۛ;->֫:Ll/ܽۛ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ܽۛ;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public final sendAccessibilityEvent(Landroid/view/View;I)V
    .locals 1

    .line 110
    iget-object v0, p0, Ll/ۧۛ;->֫:Ll/ܽۛ;

    invoke-virtual {v0, p1, p2}, Ll/ܽۛ;->sendAccessibilityEvent(Landroid/view/View;I)V

    return-void
.end method

.method public final sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 115
    iget-object v0, p0, Ll/ۧۛ;->֫:Ll/ܽۛ;

    invoke-virtual {v0, p1, p2}, Ll/ܽۛ;->sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method
