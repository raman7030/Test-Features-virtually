.class public final Ll/᩷᩶ۢ;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "W1V4"


# instance fields
.field public final synthetic ᩸:Ll/ۘ᩶ۢ;


# direct methods
.method public constructor <init>(Ll/ۘ᩶ۢ;)V
    .locals 0

    .line 13
    iput-object p1, p0, Ll/᩷᩶ۢ;->᩸:Ll/ۘ᩶ۢ;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 16
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 247
    iget-object p1, p0, Ll/᩷᩶ۢ;->᩸:Ll/ۘ᩶ۢ;

    iget-object p1, p1, Ll/ۘ᩶ۢ;->֫:Ll/֡᩶ۢ;

    invoke-static {p1}, Ll/֡᩶ۢ;->ۢ(Ll/֡᩶ۢ;)Landroid/widget/OverScroller;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_0

    .line 248
    invoke-static {p1}, Ll/֡᩶ۢ;->ۢ(Ll/֡᩶ۢ;)Landroid/widget/OverScroller;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/OverScroller;->abortAnimation()V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 10

    .line 203
    iget-object p1, p0, Ll/᩷᩶ۢ;->᩸:Ll/ۘ᩶ۢ;

    iget-object p2, p1, Ll/ۘ᩶ۢ;->֫:Ll/֡᩶ۢ;

    invoke-static {p2}, Ll/֡᩶ۢ;->ᩳ(Ll/֡᩶ۢ;)Ll/ܿ᩹ۢ;

    move-result-object p3

    if-nez p3, :cond_0

    goto :goto_0

    .line 205
    :cond_0
    invoke-static {p2}, Ll/֡᩶ۢ;->ۜ(Ll/֡᩶ۢ;)Ll/ܺ᩶ۢ;

    move-result-object p3

    iget p3, p3, Ll/ܺ᩶ۢ;->ܽ:I

    int-to-float p3, p3

    const/high16 v0, 0x3f800000    # 1.0f

    div-float/2addr v0, p3

    .line 206
    invoke-static {p2}, Ll/֡᩶ۢ;->ۢ(Ll/֡᩶ۢ;)Landroid/widget/OverScroller;

    move-result-object v1

    invoke-static {p2}, Ll/֡᩶ۢ;->֡(Ll/֡᩶ۢ;)I

    move-result p3

    int-to-float p3, p3

    div-float/2addr p3, v0

    float-to-double v2, p3

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v3, v2

    neg-float p3, p4

    const p4, 0x3f99999a    # 1.2f

    mul-float p3, p3, p4

    float-to-int v5, p3

    invoke-static {p2}, Ll/֡᩶ۢ;->ᩳ(Ll/֡᩶ۢ;)Ll/ܿ᩹ۢ;

    move-result-object p3

    invoke-virtual {p3}, Ll/ܿ᩹ۢ;->ܿ()Ll/֫᩹ۢ;

    move-result-object p3

    invoke-virtual {p3}, Ll/֫᩹ۢ;->ۧ()I

    move-result p3

    int-to-float p3, p3

    div-float/2addr p3, v0

    float-to-double p3, p3

    invoke-static {p3, p4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p3

    neg-double p3, p3

    double-to-int v8, p3

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v1 .. v9}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    .line 208
    new-instance p3, Ll/ۖ᩶ۢ;

    invoke-direct {p3, p1, v0}, Ll/ۖ᩶ۢ;-><init>(Ll/ۘ᩶ۢ;F)V

    invoke-virtual {p2, p3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 2

    .line 32
    iget-object v0, p0, Ll/᩷᩶ۢ;->᩸:Ll/ۘ᩶ۢ;

    .line 261
    iget-object v0, v0, Ll/ۘ᩶ۢ;->֫:Ll/֡᩶ۢ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 262
    invoke-static {v0}, Ll/֡᩶ۢ;->ۚ(Ll/֡᩶ۢ;)V

    .line 263
    invoke-virtual {v0, p1}, Ll/֡᩶ۢ;->֫(Landroid/view/MotionEvent;)V

    return-void
.end method

.method public final onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    .line 27
    iget-object p1, p0, Ll/᩷᩶ۢ;->᩸:Ll/ۘ᩶ۢ;

    .line 174
    iget-object p1, p1, Ll/ۘ᩶ۢ;->֫:Ll/֡᩶ۢ;

    invoke-static {p1}, Ll/֡᩶ۢ;->ᩳ(Ll/֡᩶ۢ;)Ll/ܿ᩹ۢ;

    move-result-object p3

    if-nez p3, :cond_0

    goto/16 :goto_0

    .line 176
    :cond_0
    invoke-static {p1}, Ll/֡᩶ۢ;->᩷(Ll/֡᩶ۢ;)F

    move-result p3

    add-float/2addr p4, p3

    .line 177
    invoke-static {p1}, Ll/֡᩶ۢ;->ۜ(Ll/֡᩶ۢ;)Ll/ܺ᩶ۢ;

    move-result-object p3

    iget p3, p3, Ll/ܺ᩶ۢ;->ܽ:I

    int-to-float p3, p3

    div-float p3, p4, p3

    float-to-int p3, p3

    .line 180
    invoke-static {p1}, Ll/֡᩶ۢ;->ۜ(Ll/֡᩶ۢ;)Ll/ܺ᩶ۢ;

    move-result-object v0

    iget v0, v0, Ll/ܺ᩶ۢ;->ܽ:I

    mul-int v0, v0, p3

    int-to-float v0, v0

    sub-float v0, p4, v0

    invoke-static {p1, v0}, Ll/֡᩶ۢ;->֫(Ll/֡᩶ۢ;F)V

    .line 181
    invoke-static {p1, p3}, Ll/֡᩶ۢ;->֫(Ll/֡᩶ۢ;I)V

    if-gez p3, :cond_1

    if-eqz p2, :cond_2

    .line 184
    invoke-static {p1}, Ll/֡᩶ۢ;->֡(Ll/֡᩶ۢ;)I

    move-result p3

    invoke-static {p1}, Ll/֡᩶ۢ;->ᩳ(Ll/֡᩶ۢ;)Ll/ܿ᩹ۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܿ᩹ۢ;->ܿ()Ll/֫᩹ۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֫᩹ۢ;->ۧ()I

    move-result v0

    neg-int v0, v0

    if-gt p3, v0, :cond_2

    .line 185
    invoke-static {p1}, Ll/֡᩶ۢ;->᩵(Ll/֡᩶ۢ;)Landroid/widget/EdgeEffect;

    move-result-object p3

    neg-float p4, p4

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p4, v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p2, v0

    invoke-static {p3, p4, p2}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;FF)V

    .line 186
    invoke-virtual {p1}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 187
    invoke-static {p1}, Ll/֡᩶ۢ;->֫(Ll/֡᩶ۢ;)Landroid/widget/EdgeEffect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p2

    if-nez p2, :cond_2

    .line 188
    invoke-static {p1}, Ll/֡᩶ۢ;->֫(Ll/֡᩶ۢ;)Landroid/widget/EdgeEffect;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    goto :goto_0

    :cond_1
    if-lez p3, :cond_2

    if-eqz p2, :cond_2

    .line 191
    invoke-static {p1}, Ll/֡᩶ۢ;->֡(Ll/֡᩶ۢ;)I

    move-result p3

    if-ltz p3, :cond_2

    .line 192
    invoke-static {p1}, Ll/֡᩶ۢ;->֫(Ll/֡᩶ۢ;)Landroid/widget/EdgeEffect;

    move-result-object p3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p4, v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p2, v0

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p2

    invoke-static {p3, p4, v0}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;FF)V

    .line 193
    invoke-virtual {p1}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 194
    invoke-static {p1}, Ll/֡᩶ۢ;->᩵(Ll/֡᩶ۢ;)Landroid/widget/EdgeEffect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result p2

    if-nez p2, :cond_2

    .line 195
    invoke-static {p1}, Ll/֡᩶ۢ;->᩵(Ll/֡᩶ۢ;)Landroid/widget/EdgeEffect;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_2
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 21
    iget-object p1, p0, Ll/᩷᩶ۢ;->᩸:Ll/ۘ᩶ۢ;

    .line 151
    iget-object p1, p1, Ll/ۘ᩶ۢ;->֫:Ll/֡᩶ۢ;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ll/֡᩶ۢ;->֫(Ll/֡᩶ۢ;F)V

    .line 157
    invoke-static {p1}, Ll/֡᩶ۢ;->ᩳ(Ll/֡᩶ۢ;)Ll/ܿ᩹ۢ;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 158
    :cond_0
    invoke-static {p1}, Ll/֡᩶ۢ;->᩻(Ll/֡᩶ۢ;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 159
    invoke-static {p1}, Ll/֡᩶ۢ;->ܽ(Ll/֡᩶ۢ;)Landroid/graphics/PointF;

    move-result-object v0

    iget v0, v0, Landroid/graphics/PointF;->y:F

    invoke-static {p1}, Ll/֡᩶ۢ;->ۜ(Ll/֡᩶ۢ;)Ll/ܺ᩶ۢ;

    move-result-object v2

    iget v2, v2, Ll/ܺ᩶ۢ;->ܽ:I

    int-to-float v2, v2

    div-float/2addr v0, v2

    float-to-int v0, v0

    invoke-static {p1}, Ll/֡᩶ۢ;->֡(Ll/֡᩶ۢ;)I

    move-result v2

    add-int/2addr v0, v2

    .line 160
    invoke-static {p1}, Ll/֡᩶ۢ;->ۖ(Ll/֡᩶ۢ;)I

    move-result v2

    sub-int/2addr v2, v1

    if-gt v2, v0, :cond_1

    invoke-static {p1}, Ll/֡᩶ۢ;->ۘ(Ll/֡᩶ۢ;)I

    move-result v2

    add-int/2addr v2, v1

    if-gt v0, v2, :cond_1

    .line 161
    invoke-static {p1}, Ll/֡᩶ۢ;->ᩳ(Ll/֡᩶ۢ;)Ll/ܿ᩹ۢ;

    move-result-object v0

    invoke-static {p1}, Ll/֡᩶ۢ;->ۡ(Ll/֡᩶ۢ;)I

    move-result v2

    invoke-static {p1}, Ll/֡᩶ۢ;->ۖ(Ll/֡᩶ۢ;)I

    move-result v3

    invoke-static {p1}, Ll/֡᩶ۢ;->ܺ(Ll/֡᩶ۢ;)I

    move-result v4

    invoke-static {p1}, Ll/֡᩶ۢ;->ۘ(Ll/֡᩶ۢ;)I

    move-result v5

    invoke-virtual {v0, v2, v3, v4, v5}, Ll/ܿ᩹ۢ;->֫(IIII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 162
    invoke-static {p1}, Ll/֡᩶ۢ;->ᩴ(Ll/֡᩶ۢ;)Ll/ܿ᩶ۢ;

    move-result-object v2

    invoke-virtual {v2, v0}, Ll/ܿ᩶ۢ;->֫(Ljava/lang/String;)V

    :cond_1
    const/4 v0, 0x0

    .line 164
    invoke-virtual {p1, v0}, Ll/֡᩶ۢ;->֫(Landroid/view/MotionEvent;)V

    return v1

    .line 166
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 167
    invoke-static {p1}, Ll/֡᩶ۢ;->ۧ(Ll/֡᩶ۢ;)Ll/֨᩶ۢ;

    move-result-object p1

    invoke-interface {p1}, Ll/֨᩶ۢ;->֫()V

    return v1
.end method
