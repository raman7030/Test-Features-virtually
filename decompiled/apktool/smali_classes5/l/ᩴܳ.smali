.class public final Ll/ᩴܳ;
.super Ll/ᩴܺ;
.source "422Y"


# instance fields
.field public final synthetic ۛ:Ll/ۚܳ;


# direct methods
.method public constructor <init>(Ll/ۚܳ;Ll/۫᩻;)V
    .locals 0

    .line 3331
    iput-object p1, p0, Ll/ᩴܳ;->ۛ:Ll/ۚܳ;

    const/4 p1, 0x0

    .line 58
    invoke-direct {p0, p2, p1}, Ll/ᩴܺ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 3337
    iget-object v0, p0, Ll/ᩴܳ;->ۛ:Ll/ۚܳ;

    invoke-virtual {v0, p1}, Ll/ۚܳ;->֫(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3338
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 3343
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    .line 3345
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    .line 3346
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    float-to-int v1, v1

    const/4 v2, -0x5

    if-lt v0, v2, :cond_0

    if-lt v1, v2, :cond_0

    .line 3361
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    add-int/lit8 v2, v2, 0x5

    if-gt v0, v2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    add-int/lit8 v0, v0, 0x5

    if-le v1, v0, :cond_1

    :cond_0
    const/4 p1, 0x0

    .line 2071
    iget-object v0, p0, Ll/ᩴܳ;->ۛ:Ll/ۚܳ;

    invoke-virtual {v0, p1}, Ll/ۚܳ;->ۜ(I)Ll/᩵ܳ;

    move-result-object p1

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Ll/ۚܳ;->֫(Ll/᩵ܳ;Z)V

    return v1

    .line 3352
    :cond_1
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final setBackgroundResource(I)V
    .locals 1

    .line 3357
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
