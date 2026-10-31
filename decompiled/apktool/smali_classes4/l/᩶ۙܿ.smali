.class public final Ll/᩶ۙܿ;
.super Landroid/widget/ListView;
.source "L9CC"


# instance fields
.field public final ᩸:Ll/ۗۙܿ;


# direct methods
.method public constructor <init>(Ll/ۗۙܿ;)V
    .locals 2

    .line 1462
    invoke-static {p1}, Ll/ۗۙܿ;->ۧ(Ll/ۗۙܿ;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 1463
    iput-object p1, p0, Ll/᩶ۙܿ;->᩸:Ll/ۗۙܿ;

    .line 1464
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result p1

    const/4 v0, 0x3

    mul-int/lit8 p1, p1, 0x3

    invoke-virtual {p0, p1}, Landroid/view/View;->setScrollBarDefaultDelayBeforeFade(I)V

    .line 1465
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt p1, v1, :cond_0

    .line 1466
    invoke-virtual {p0, v0}, Landroid/widget/ListView;->setScrollIndicators(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final awakenScrollBars()Z
    .locals 1

    .line 1491
    invoke-super {p0}, Landroid/widget/ListView;->awakenScrollBars()Z

    move-result v0

    return v0
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1482
    iget-object v0, p0, Ll/᩶ۙܿ;->᩸:Ll/ۗۙܿ;

    invoke-static {v0}, Ll/ۗۙܿ;->ᩴ(Ll/ۗۙܿ;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 1486
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ListView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final onMeasure(II)V
    .locals 1

    .line 1474
    iget-object p2, p0, Ll/᩶ۙܿ;->᩸:Ll/ۗۙܿ;

    invoke-static {p2}, Ll/ۗۙܿ;->ۡ(Ll/ۗۙܿ;)Landroid/util/Size;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-static {p2}, Ll/ۗۙܿ;->᩷(Ll/ۗۙܿ;)Landroid/util/Size;

    move-result-object p2

    .line 1475
    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p2

    sub-int/2addr v0, p2

    const/high16 p2, 0x40000000    # 2.0f

    .line 1476
    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 1477
    invoke-super {p0, p1, p2}, Landroid/widget/ListView;->onMeasure(II)V

    return-void
.end method
