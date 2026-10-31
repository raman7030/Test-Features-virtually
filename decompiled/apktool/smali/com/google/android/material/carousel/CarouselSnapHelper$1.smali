.class public Lcom/google/android/material/carousel/CarouselSnapHelper$1;
.super Ll/᩷ۗۧ;
.source "CarouselSnapHelper.java"


# instance fields
.field public final synthetic this$0:Lcom/google/android/material/carousel/CarouselSnapHelper;

.field public final synthetic val$layoutManager:Ll/ܿ۬ۧ;


# direct methods
.method public constructor <init>(Lcom/google/android/material/carousel/CarouselSnapHelper;Landroid/content/Context;Ll/ܿ۬ۧ;)V
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/google/android/material/carousel/CarouselSnapHelper$1;->this$0:Lcom/google/android/material/carousel/CarouselSnapHelper;

    iput-object p3, p0, Lcom/google/android/material/carousel/CarouselSnapHelper$1;->val$layoutManager:Ll/ܿ۬ۧ;

    invoke-direct {p0, p2}, Ll/᩷ۗۧ;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public calculateSpeedPerPixel(Landroid/util/DisplayMetrics;)F
    .locals 1

    .line 253
    iget-object v0, p0, Lcom/google/android/material/carousel/CarouselSnapHelper$1;->val$layoutManager:Ll/ܿ۬ۧ;

    invoke-virtual {v0}, Ll/ܿ۬ۧ;->canScrollVertically()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 254
    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float p1, p1

    const/high16 v0, 0x42480000    # 50.0f

    goto :goto_0

    .line 256
    :cond_0
    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float p1, p1

    const/high16 v0, 0x42c80000    # 100.0f

    :goto_0
    div-float/2addr v0, p1

    return v0
.end method

.method public onTargetFound(Landroid/view/View;Ll/᩸۬ۧ;Ll/֨۬ۧ;)V
    .locals 2

    .line 238
    iget-object p2, p0, Lcom/google/android/material/carousel/CarouselSnapHelper$1;->this$0:Lcom/google/android/material/carousel/CarouselSnapHelper;

    invoke-static {p2}, Lcom/google/android/material/carousel/CarouselSnapHelper;->access$000(Lcom/google/android/material/carousel/CarouselSnapHelper;)Ll/۬۬ۧ;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 239
    iget-object p2, p0, Lcom/google/android/material/carousel/CarouselSnapHelper$1;->this$0:Lcom/google/android/material/carousel/CarouselSnapHelper;

    .line 240
    invoke-static {p2}, Lcom/google/android/material/carousel/CarouselSnapHelper;->access$000(Lcom/google/android/material/carousel/CarouselSnapHelper;)Ll/۬۬ۧ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۬۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {p2, v0, p1, v1}, Lcom/google/android/material/carousel/CarouselSnapHelper;->access$100(Lcom/google/android/material/carousel/CarouselSnapHelper;Ll/ܿ۬ۧ;Landroid/view/View;Z)[I

    move-result-object p1

    const/4 p2, 0x0

    .line 241
    aget p2, p1, p2

    .line 242
    aget p1, p1, v1

    .line 243
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result v0

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0, v0}, Ll/᩷ۗۧ;->calculateTimeForDeceleration(I)I

    move-result v0

    if-lez v0, :cond_0

    .line 245
    iget-object v1, p0, Ll/᩷ۗۧ;->mDecelerateInterpolator:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {p3, p2, p1, v1, v0}, Ll/֨۬ۧ;->֫(IILandroid/view/animation/Interpolator;I)V

    :cond_0
    return-void
.end method
