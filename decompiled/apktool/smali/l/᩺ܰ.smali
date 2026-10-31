.class public final Ll/᩺ܰ;
.super Ljava/lang/Object;
.source "L3T4"


# direct methods
.method public static ֫(Landroid/view/accessibility/AccessibilityManager;Ll/ۛܰ;)V
    .locals 1

    .line 171
    new-instance v0, Ll/ۨܰ;

    invoke-direct {v0, p1}, Ll/ۨܰ;-><init>(Ll/ۛܰ;)V

    invoke-virtual {p0, v0}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    return-void
.end method

.method public static ۧ(Landroid/view/accessibility/AccessibilityManager;Ll/ۛܰ;)V
    .locals 1

    .line 185
    new-instance v0, Ll/ۨܰ;

    invoke-direct {v0, p1}, Ll/ۨܰ;-><init>(Ll/ۛܰ;)V

    invoke-virtual {p0, v0}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    return-void
.end method
