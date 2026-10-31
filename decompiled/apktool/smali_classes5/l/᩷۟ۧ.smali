.class public final Ll/᩷۟ۧ;
.super Ll/۬۬ۧ;
.source "F1OQ"


# instance fields
.field public final synthetic ᩸:Ll/ۖ۟ۧ;


# direct methods
.method public constructor <init>(Ll/ۖ۟ۧ;Landroid/content/Context;)V
    .locals 0

    .line 974
    iput-object p1, p0, Ll/᩷۟ۧ;->᩸:Ll/ۖ۟ۧ;

    .line 975
    invoke-direct {p0, p2}, Ll/۬۬ۧ;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 1

    .line 981
    iget-object v0, p0, Ll/᩷۟ۧ;->᩸:Ll/ۖ۟ۧ;

    iget-object v0, v0, Ll/ۖ۟ۧ;->᩸:Ll/᩻۟ۧ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 984
    invoke-super {p0}, Ll/۬۬ۧ;->getAccessibilityClassName()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    .line 989
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 990
    iget-object v0, p0, Ll/᩷۟ۧ;->᩸:Ll/ۖ۟ۧ;

    iget v1, v0, Ll/ۖ۟ۧ;->᩹:I

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityRecord;->setFromIndex(I)V

    .line 991
    iget v1, v0, Ll/ۖ۟ۧ;->᩹:I

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityRecord;->setToIndex(I)V

    .line 992
    iget-object v0, v0, Ll/ۖ۟ۧ;->᩸:Ll/᩻۟ۧ;

    .line 1484
    iget-object v0, v0, Ll/᩻۟ۧ;->ܽ:Ll/ۖ۟ۧ;

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setSource(Landroid/view/View;)V

    const-string v0, "androidx.viewpager.widget.ViewPager"

    .line 1485
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1003
    iget-object v0, p0, Ll/᩷۟ۧ;->᩸:Ll/ۖ۟ۧ;

    invoke-virtual {v0}, Ll/ۖ۟ۧ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Ll/۬۬ۧ;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 998
    iget-object v0, p0, Ll/᩷۟ۧ;->᩸:Ll/ۖ۟ۧ;

    invoke-virtual {v0}, Ll/ۖ۟ۧ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Ll/۬۬ۧ;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
