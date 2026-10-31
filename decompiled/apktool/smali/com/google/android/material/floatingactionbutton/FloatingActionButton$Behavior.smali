.class public Lcom/google/android/material/floatingactionbutton/FloatingActionButton$Behavior;
.super Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;
.source "FloatingActionButton.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 948
    invoke-direct {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 952
    invoke-direct {p0, p1, p2}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic getInsetDodgeRect(Ll/ᩳ᩹;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Landroid/graphics/Rect;)Z
    .locals 0

    .line 945
    invoke-super {p0, p1, p2, p3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->getInsetDodgeRect(Ll/ᩳ᩹;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Landroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic isAutoHideEnabled()Z
    .locals 1

    .line 945
    invoke-super {p0}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->isAutoHideEnabled()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic onAttachedToLayoutParams(Ll/ܰ᩸;)V
    .locals 0

    .line 945
    invoke-super {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->onAttachedToLayoutParams(Ll/ܰ᩸;)V

    return-void
.end method

.method public bridge synthetic onDependentViewChanged(Ll/ᩳ᩹;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Landroid/view/View;)Z
    .locals 0

    .line 945
    invoke-super {p0, p1, p2, p3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->onDependentViewChanged(Ll/ᩳ᩹;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;Landroid/view/View;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic onLayoutChild(Ll/ᩳ᩹;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;I)Z
    .locals 0

    .line 945
    invoke-super {p0, p1, p2, p3}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->onLayoutChild(Ll/ᩳ᩹;Lcom/google/android/material/floatingactionbutton/FloatingActionButton;I)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic setAutoHideEnabled(Z)V
    .locals 0

    .line 945
    invoke-super {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->setAutoHideEnabled(Z)V

    return-void
.end method

.method public bridge synthetic setInternalAutoHideListener(Lcom/google/android/material/floatingactionbutton/FloatingActionButton$OnVisibilityChangedListener;)V
    .locals 0

    .line 945
    invoke-super {p0, p1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton$BaseBehavior;->setInternalAutoHideListener(Lcom/google/android/material/floatingactionbutton/FloatingActionButton$OnVisibilityChangedListener;)V

    return-void
.end method
