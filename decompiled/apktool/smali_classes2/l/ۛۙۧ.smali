.class public final Ll/ۛۙۧ;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "B66A"


# instance fields
.field public ᩸:Z

.field public final synthetic ᩹:Ll/֫ۗۧ;


# direct methods
.method public constructor <init>(Ll/֫ۗۧ;)V
    .locals 0

    .line 2329
    iput-object p1, p0, Ll/ۛۙۧ;->᩹:Ll/֫ۗۧ;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    const/4 p1, 0x1

    .line 2327
    iput-boolean p1, p0, Ll/ۛۙۧ;->᩸:Z

    return-void
.end method


# virtual methods
.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 6

    .line 2347
    iget-object v0, p0, Ll/ۛۙۧ;->᩹:Ll/֫ۗۧ;

    iget-object v1, v0, Ll/֫ۗۧ;->ܽ:Ll/ۤۙۧ;

    iget-boolean v2, p0, Ll/ۛۙۧ;->᩸:Z

    if-nez v2, :cond_0

    goto :goto_0

    .line 2350
    :cond_0
    invoke-virtual {v0, p1}, Ll/֫ۗۧ;->ܽ(Landroid/view/MotionEvent;)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 2352
    iget-object v3, v0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    invoke-virtual {v3, v2}, Ll/۬۬ۧ;->getChildViewHolder(Landroid/view/View;)Ll/ۗ۬ۧ;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 2354
    iget-object v3, v0, Ll/֫ۗۧ;->֡:Ll/۬۬ۧ;

    .line 1604
    invoke-virtual {v1, v2}, Ll/ۤۙۧ;->ۧ(Ll/ۗ۬ۧ;)I

    move-result v4

    .line 1605
    sget v5, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual {v3}, Landroid/view/View;->getLayoutDirection()I

    move-result v3

    .line 1605
    invoke-static {v4, v3}, Ll/ۤۙۧ;->֫(II)I

    move-result v3

    const/high16 v4, 0xff0000

    and-int/2addr v3, v4

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    .line 2357
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    .line 2361
    iget v4, v0, Ll/֫ۗۧ;->ۧ:I

    if-ne v3, v4, :cond_1

    .line 2362
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v3

    .line 2363
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    .line 2364
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    .line 2365
    iput v4, v0, Ll/֫ۗۧ;->᩷:F

    .line 2366
    iput p1, v0, Ll/֫ۗۧ;->ۢ:F

    const/4 p1, 0x0

    .line 2367
    iput p1, v0, Ll/֫ۗۧ;->᩻:F

    iput p1, v0, Ll/֫ۗۧ;->ܳ:F

    .line 2372
    invoke-virtual {v1}, Ll/ۤۙۧ;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x2

    .line 2373
    invoke-virtual {v0, v2, p1}, Ll/֫ۗۧ;->֫(Ll/ۗ۬ۧ;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 2337
    iput-boolean v0, p0, Ll/ۛۙۧ;->᩸:Z

    return-void
.end method
