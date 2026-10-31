.class public final Ll/᩻ۙܿ;
.super Landroid/widget/LinearLayout;
.source "L9CC"


# instance fields
.field public final synthetic ᩸:Ll/ۗۙܿ;


# direct methods
.method public constructor <init>(Ll/ۗۙܿ;Landroid/view/ContextThemeWrapper;)V
    .locals 0

    .line 1320
    iput-object p1, p0, Ll/᩻ۙܿ;->᩸:Ll/ۗۙܿ;

    invoke-direct {p0, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1336
    iget-object p1, p0, Ll/᩻ۙܿ;->᩸:Ll/ۗۙܿ;

    invoke-static {p1}, Ll/ۗۙܿ;->ᩴ(Ll/ۗۙܿ;)Z

    move-result p1

    return p1
.end method

.method public final onMeasure(II)V
    .locals 2

    .line 1323
    iget-object v0, p0, Ll/᩻ۙܿ;->᩸:Ll/ۗۙܿ;

    invoke-static {v0}, Ll/ۗۙܿ;->ᩴ(Ll/ۗۙܿ;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/ۗۙܿ;->ᩳ(Ll/ۗۙܿ;)Landroid/util/Size;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 1326
    invoke-static {v0}, Ll/ۗۙܿ;->ᩳ(Ll/ۗۙܿ;)Landroid/util/Size;

    move-result-object p1

    .line 1327
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    .line 1326
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 1330
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    return-void
.end method
