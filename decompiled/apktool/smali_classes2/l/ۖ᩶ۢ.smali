.class public final Ll/ۖ᩶ۢ;
.super Ljava/lang/Object;
.source "81UC"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۘ᩶ۢ;

.field public final synthetic ᩹:F


# direct methods
.method public constructor <init>(Ll/ۘ᩶ۢ;F)V
    .locals 0

    .line 208
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖ᩶ۢ;->᩸:Ll/ۘ᩶ۢ;

    iput p2, p0, Ll/ۖ᩶ۢ;->᩹:F

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 212
    iget-object v0, p0, Ll/ۖ᩶ۢ;->᩸:Ll/ۘ᩶ۢ;

    iget-object v0, v0, Ll/ۘ᩶ۢ;->֫:Ll/֡᩶ۢ;

    invoke-static {v0}, Ll/֡᩶ۢ;->ۢ(Ll/֡᩶ۢ;)Landroid/widget/OverScroller;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 213
    :cond_0
    invoke-static {v0}, Ll/֡᩶ۢ;->ۢ(Ll/֡᩶ۢ;)Landroid/widget/OverScroller;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    move-result v1

    .line 214
    invoke-static {v0}, Ll/֡᩶ۢ;->ۢ(Ll/֡᩶ۢ;)Landroid/widget/OverScroller;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Ll/ۖ᩶ۢ;->᩹:F

    mul-float v2, v2, v3

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    .line 215
    invoke-static {v0}, Ll/֡᩶ۢ;->֡(Ll/֡᩶ۢ;)I

    move-result v3

    sub-int/2addr v2, v3

    .line 217
    invoke-static {v0, v2}, Ll/֡᩶ۢ;->֫(Ll/֡᩶ۢ;I)V

    if-eqz v2, :cond_2

    const v3, 0x3f99999a    # 1.2f

    if-gez v2, :cond_1

    .line 222
    invoke-static {v0}, Ll/֡᩶ۢ;->֡(Ll/֡᩶ۢ;)I

    move-result v2

    invoke-static {v0}, Ll/֡᩶ۢ;->ᩳ(Ll/֡᩶ۢ;)Ll/ܿ᩹ۢ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܿ᩹ۢ;->ܿ()Ll/֫᩹ۢ;

    move-result-object v4

    invoke-virtual {v4}, Ll/֫᩹ۢ;->ۧ()I

    move-result v4

    neg-int v4, v4

    if-gt v2, v4, :cond_2

    .line 223
    invoke-static {v0}, Ll/֡᩶ۢ;->᩵(Ll/֡᩶ۢ;)Landroid/widget/EdgeEffect;

    move-result-object v1

    invoke-static {v0}, Ll/֡᩶ۢ;->ۢ(Ll/֡᩶ۢ;)Landroid/widget/OverScroller;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v2

    div-float/2addr v2, v3

    float-to-int v2, v2

    invoke-virtual {v1, v2}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 224
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void

    .line 228
    :cond_1
    invoke-static {v0}, Ll/֡᩶ۢ;->֡(Ll/֡᩶ۢ;)I

    move-result v2

    if-ltz v2, :cond_2

    .line 229
    invoke-static {v0}, Ll/֡᩶ۢ;->֫(Ll/֡᩶ۢ;)Landroid/widget/EdgeEffect;

    move-result-object v1

    invoke-static {v0}, Ll/֡᩶ۢ;->ۢ(Ll/֡᩶ۢ;)Landroid/widget/OverScroller;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v2

    div-float/2addr v2, v3

    float-to-int v2, v2

    invoke-virtual {v1, v2}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 230
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void

    :cond_2
    if-eqz v1, :cond_3

    .line 237
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_3
    :goto_0
    return-void
.end method
