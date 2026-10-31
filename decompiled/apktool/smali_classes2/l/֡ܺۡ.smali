.class public Ll/֡ܺۡ;
.super Landroid/widget/FrameLayout;
.source "L5CA"


# static fields
.field public static final ᩳ֫:Landroid/view/animation/DecelerateInterpolator;


# instance fields
.field public ֫֫:F

.field public ۗ:F

.field public ۙ:J

.field public ۛ:F

.field public ۟:F

.field public ۤ:Landroid/widget/FrameLayout;

.field public ۧ֫:F

.field public ۨ:Ll/᩻ܺۡ;

.field public ۫:F

.field public ۬:Landroid/view/View;

.field public ܰ:I

.field public ܽ֫:Ll/᩹᩺;

.field public ᩶:Z

.field public ᩸:Z

.field public ᩹:Landroid/view/animation/DecelerateInterpolator;

.field public ᩺:Ll/ۜܺۡ;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 37
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v1, 0x41200000    # 10.0f

    invoke-direct {v0, v1}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    sput-object v0, Ll/֡ܺۡ;->ᩳ֫:Landroid/view/animation/DecelerateInterpolator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 124
    new-instance p1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    iput-object p1, p0, Ll/֡ܺۡ;->᩹:Landroid/view/animation/DecelerateInterpolator;

    .line 125
    new-instance p1, Ll/ܺܺۡ;

    invoke-direct {p1, p0}, Ll/ܺܺۡ;-><init>(Ll/֡ܺۡ;)V

    iput-object p1, p0, Ll/֡ܺۡ;->ܽ֫:Ll/᩹᩺;

    const/4 p1, 0x1

    .line 168
    iput-boolean p1, p0, Ll/֡ܺۡ;->᩸:Z

    .line 198
    iget p1, p0, Ll/֡ܺۡ;->ۛ:F

    const/high16 p2, 0x42c80000    # 100.0f

    div-float/2addr p1, p2

    iput p1, p0, Ll/֡ܺۡ;->ۧ֫:F

    .line 200
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Ll/֡ܺۡ;->ۙ:J

    .line 58
    invoke-direct {p0}, Ll/֡ܺۡ;->ܽ()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 62
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 124
    new-instance p1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    iput-object p1, p0, Ll/֡ܺۡ;->᩹:Landroid/view/animation/DecelerateInterpolator;

    .line 125
    new-instance p1, Ll/ܺܺۡ;

    invoke-direct {p1, p0}, Ll/ܺܺۡ;-><init>(Ll/֡ܺۡ;)V

    iput-object p1, p0, Ll/֡ܺۡ;->ܽ֫:Ll/᩹᩺;

    const/4 p1, 0x1

    .line 168
    iput-boolean p1, p0, Ll/֡ܺۡ;->᩸:Z

    .line 198
    iget p1, p0, Ll/֡ܺۡ;->ۛ:F

    const/high16 p2, 0x42c80000    # 100.0f

    div-float/2addr p1, p2

    iput p1, p0, Ll/֡ܺۡ;->ۧ֫:F

    .line 200
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Ll/֡ܺۡ;->ۙ:J

    .line 63
    invoke-direct {p0}, Ll/֡ܺۡ;->ܽ()V

    return-void
.end method

.method public static ֫(Ll/֡ܺۡ;)V
    .locals 4

    const/4 v0, 0x0

    .line 88
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Ll/֡ܺۡ;->۬:Landroid/view/View;

    .line 107
    new-instance v1, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 108
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v0, 0x30

    .line 109
    iput v0, v2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 110
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 112
    iput-object v1, p0, Ll/֡ܺۡ;->ۤ:Landroid/widget/FrameLayout;

    .line 143
    invoke-super {p0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۢܺۡ;Landroid/view/View;)V
    .locals 0

    .line 95
    iget-object p0, p0, Ll/֡ܺۡ;->ۤ:Landroid/widget/FrameLayout;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public static ۧ(Ll/֡ܺۡ;)V
    .locals 2

    .line 126
    iget-object v0, p0, Ll/֡ܺۡ;->۬:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    move-result v0

    float-to-int v0, v0

    .line 127
    iget-object v1, p0, Ll/֡ܺۡ;->ۤ:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 128
    iget-object v1, p0, Ll/֡ܺۡ;->ۤ:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/view/View;->requestLayout()V

    .line 129
    iget-object p0, p0, Ll/֡ܺۡ;->᩺:Ll/ۜܺۡ;

    if-eqz p0, :cond_0

    mul-int/lit8 v0, v0, 0x2

    .line 83
    iget-object p0, p0, Ll/ۜܺۡ;->֫:Ll/ۢܺۡ;

    invoke-static {p0}, Ll/ۢܺۡ;->ۧ(Ll/ۢܺۡ;)Ll/ۡܺۡ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ۡܺۡ;->֫(I)V

    .line 84
    invoke-static {p0}, Ll/ۢܺۡ;->ۧ(Ll/ۢܺۡ;)Ll/ۡܺۡ;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method private ܽ()V
    .locals 3

    .line 72
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 76
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_1

    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    iput v0, p0, Ll/֡ܺۡ;->ܰ:I

    .line 85
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    const/high16 v2, 0x43160000    # 150.0f

    .line 82
    invoke-static {v1, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    iput v0, p0, Ll/֡ܺۡ;->ۛ:F

    .line 87
    new-instance v0, Ll/ۖܺۡ;

    invoke-direct {v0, p0}, Ll/ۖܺۡ;-><init>(Ll/֡ܺۡ;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 77
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "You can only attach one child"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ᩳ()V
    .locals 2

    .line 135
    iget-object v0, p0, Ll/֡ܺۡ;->۬:Landroid/view/View;

    invoke-static {v0}, Ll/ܿ᩺;->֫(Landroid/view/View;)Ll/ܶ᩺;

    move-result-object v0

    const/4 v1, 0x0

    .line 136
    invoke-virtual {v0, v1}, Ll/ܶ᩺;->ۧ(F)V

    iget-object v1, p0, Ll/֡ܺۡ;->᩹:Landroid/view/animation/DecelerateInterpolator;

    .line 137
    invoke-virtual {v0, v1}, Ll/ܶ᩺;->֫(Landroid/view/animation/Interpolator;)V

    iget-object v1, p0, Ll/֡ܺۡ;->ܽ֫:Ll/᩹᩺;

    .line 138
    invoke-virtual {v0, v1}, Ll/ܶ᩺;->֫(Ll/᩹᩺;)V

    .line 139
    invoke-virtual {v0}, Ll/ܶ᩺;->ܽ()V

    return-void
.end method


# virtual methods
.method public addView(Landroid/view/View;)V
    .locals 2

    .line 148
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    .line 151
    iput-object p1, p0, Ll/֡ܺۡ;->۬:Landroid/view/View;

    .line 152
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    return-void

    .line 149
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "You can only attach one child"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 172
    iget-boolean v0, p0, Ll/֡ܺۡ;->᩶:Z

    if-eqz v0, :cond_0

    goto :goto_1

    .line 175
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    goto :goto_2

    .line 183
    :cond_1
    iget-boolean v0, p0, Ll/֡ܺۡ;->᩸:Z

    if-eqz v0, :cond_2

    goto :goto_1

    .line 185
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 186
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    .line 187
    iget v2, p0, Ll/֡ܺۡ;->֫֫:F

    sub-float/2addr v1, v2

    .line 188
    iget v2, p0, Ll/֡ܺۡ;->۟:F

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 189
    iget v2, p0, Ll/֡ܺۡ;->ܰ:I

    int-to-float v2, v2

    cmpl-float v2, v1, v2

    if-lez v2, :cond_6

    cmpl-float v0, v1, v0

    if-lez v0, :cond_6

    .line 157
    iget-object v0, p0, Ll/֡ܺۡ;->۬:Landroid/view/View;

    if-nez v0, :cond_3

    const/4 v0, 0x0

    goto :goto_0

    .line 160
    :cond_3
    instance-of v1, v0, Ll/ۢۢۡ;

    if-eqz v1, :cond_4

    .line 161
    check-cast v0, Ll/ۢۢۡ;

    invoke-virtual {v0}, Ll/ۢۢۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    goto :goto_0

    .line 164
    :cond_4
    iget-object v0, p0, Ll/֡ܺۡ;->۬:Landroid/view/View;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    :goto_0
    if-nez v0, :cond_6

    :goto_1
    const/4 p1, 0x1

    return p1

    .line 177
    :cond_5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Ll/֡ܺۡ;->۟:F

    .line 178
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Ll/֡ܺۡ;->֫֫:F

    .line 179
    iput v0, p0, Ll/֡ܺۡ;->۫:F

    const/4 v0, 0x0

    .line 180
    iput-boolean v0, p0, Ll/֡ܺۡ;->᩸:Z

    .line 194
    :cond_6
    :goto_2
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 210
    iget-boolean v0, p0, Ll/֡ܺۡ;->᩶:Z

    if-nez v0, :cond_b

    iget-boolean v0, p0, Ll/֡ܺۡ;->᩸:Z

    if-eqz v0, :cond_0

    goto/16 :goto_3

    .line 213
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_9

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_9

    .line 260
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 215
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Ll/֡ܺۡ;->۫:F

    .line 216
    iget v0, p0, Ll/֡ܺۡ;->ۗ:F

    sub-float/2addr p1, v0

    .line 217
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Ll/֡ܺۡ;->ۙ:J

    sub-long/2addr v2, v4

    long-to-float v0, v2

    iget v2, p0, Ll/֡ܺۡ;->ۧ֫:F

    mul-float v0, v0, v2

    const/4 v2, 0x0

    cmpl-float v3, p1, v2

    if-lez v3, :cond_2

    cmpl-float p1, p1, v0

    if-lez p1, :cond_3

    .line 220
    iget p1, p0, Ll/֡ܺۡ;->ۗ:F

    add-float/2addr p1, v0

    iput p1, p0, Ll/֡ܺۡ;->۫:F

    goto :goto_0

    :cond_2
    neg-float p1, p1

    cmpl-float p1, p1, v0

    if-lez p1, :cond_3

    .line 223
    iget p1, p0, Ll/֡ܺۡ;->ۗ:F

    sub-float/2addr p1, v0

    iput p1, p0, Ll/֡ܺۡ;->۫:F

    .line 225
    :cond_3
    :goto_0
    iget p1, p0, Ll/֡ܺۡ;->۫:F

    iput p1, p0, Ll/֡ܺۡ;->ۗ:F

    .line 226
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iput-wide v3, p0, Ll/֡ܺۡ;->ۙ:J

    .line 227
    iget p1, p0, Ll/֡ܺۡ;->ۛ:F

    const/high16 v0, 0x40000000    # 2.0f

    mul-float p1, p1, v0

    iget v3, p0, Ll/֡ܺۡ;->۫:F

    iget v4, p0, Ll/֡ܺۡ;->֫֫:F

    sub-float/2addr v3, v4

    .line 20
    invoke-static {p1, v3}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 21
    invoke-static {p1, v3}, Ljava/lang/Math;->max(FF)F

    move-result p1

    cmpl-float v3, v2, v4

    if-lez v3, :cond_4

    goto :goto_1

    :cond_4
    move v2, v4

    :goto_1
    cmpg-float v3, v2, p1

    if-gez v3, :cond_5

    move p1, v2

    .line 231
    :cond_5
    iget-object v2, p0, Ll/֡ܺۡ;->۬:Landroid/view/View;

    if-eqz v2, :cond_6

    .line 232
    iget v2, p0, Ll/֡ܺۡ;->ۛ:F

    div-float v2, p1, v2

    div-float/2addr v2, v0

    sget-object v3, Ll/֡ܺۡ;->ᩳ֫:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {v3, v2}, Landroid/view/animation/DecelerateInterpolator;->getInterpolation(F)F

    move-result v2

    mul-float v2, v2, p1

    div-float/2addr v2, v0

    .line 233
    iget-object v3, p0, Ll/֡ܺۡ;->۬:Landroid/view/View;

    invoke-virtual {v3, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 234
    iget-object v3, p0, Ll/֡ܺۡ;->ۤ:Landroid/widget/FrameLayout;

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    float-to-int v4, v2

    iput v4, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 235
    iget-object v3, p0, Ll/֡ܺۡ;->ۤ:Landroid/widget/FrameLayout;

    invoke-virtual {v3}, Landroid/view/View;->requestLayout()V

    .line 236
    iget-object v3, p0, Ll/֡ܺۡ;->᩺:Ll/ۜܺۡ;

    if-eqz v3, :cond_6

    mul-float v2, v2, v0

    float-to-int v2, v2

    .line 76
    iget-object v3, v3, Ll/ۜܺۡ;->֫:Ll/ۢܺۡ;

    invoke-static {v3}, Ll/ۢܺۡ;->ۧ(Ll/ۢܺۡ;)Ll/ۡܺۡ;

    move-result-object v4

    iput-boolean v1, v4, Ll/ۡܺۡ;->۬:Z

    .line 77
    invoke-static {v3}, Ll/ۢܺۡ;->ۧ(Ll/ۢܺۡ;)Ll/ۡܺۡ;

    move-result-object v4

    invoke-virtual {v4, v2}, Ll/ۡܺۡ;->֫(I)V

    .line 78
    invoke-static {v3}, Ll/ۢܺۡ;->ۧ(Ll/ۢܺۡ;)Ll/ۡܺۡ;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    .line 240
    :cond_6
    iget v2, p0, Ll/֡ܺۡ;->ۛ:F

    mul-float v2, v2, v0

    cmpl-float p1, p1, v2

    if-nez p1, :cond_a

    .line 241
    iget-object p1, p0, Ll/֡ܺۡ;->۬:Landroid/view/View;

    if-eqz p1, :cond_7

    .line 242
    invoke-direct {p0}, Ll/֡ܺۡ;->ᩳ()V

    .line 243
    iput-boolean v1, p0, Ll/֡ܺۡ;->᩶:Z

    .line 244
    iget-object p1, p0, Ll/֡ܺۡ;->ۨ:Ll/᩻ܺۡ;

    if-eqz p1, :cond_8

    .line 245
    iget-object p1, p1, Ll/᩻ܺۡ;->֫:Ll/ۢܺۡ;

    invoke-static {p1}, Ll/ۢܺۡ;->֫(Ll/ۢܺۡ;)V

    goto :goto_2

    .line 248
    :cond_7
    invoke-direct {p0}, Ll/֡ܺۡ;->ᩳ()V

    .line 250
    :cond_8
    :goto_2
    iput-boolean v1, p0, Ll/֡ܺۡ;->᩸:Z

    return v1

    .line 255
    :cond_9
    iget-object p1, p0, Ll/֡ܺۡ;->۬:Landroid/view/View;

    if-eqz p1, :cond_a

    .line 256
    invoke-direct {p0}, Ll/֡ܺۡ;->ᩳ()V

    :cond_a
    return v1

    .line 211
    :cond_b
    :goto_3
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public ֫()V
    .locals 1

    .line 265
    iget-boolean v0, p0, Ll/֡ܺۡ;->᩸:Z

    if-nez v0, :cond_1

    .line 266
    iget-object v0, p0, Ll/֡ܺۡ;->۬:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 267
    invoke-direct {p0}, Ll/֡ܺۡ;->ᩳ()V

    :cond_0
    const/4 v0, 0x1

    .line 269
    iput-boolean v0, p0, Ll/֡ܺۡ;->᩸:Z

    :cond_1
    return-void
.end method

.method public ֫(F)V
    .locals 1

    .line 203
    iput p1, p0, Ll/֡ܺۡ;->ۛ:F

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p1, v0

    .line 204
    iput p1, p0, Ll/֡ܺۡ;->ۧ֫:F

    return-void
.end method

.method public ֫(Ll/ᩴܺۡ;)V
    .locals 0

    .line 274
    check-cast p1, Ll/᩻ܺۡ;

    iput-object p1, p0, Ll/֡ܺۡ;->ۨ:Ll/᩻ܺۡ;

    return-void
.end method

.method public ֫(Ll/᩵ܺۡ;)V
    .locals 0

    .line 278
    check-cast p1, Ll/ۜܺۡ;

    iput-object p1, p0, Ll/֡ܺۡ;->᩺:Ll/ۜܺۡ;

    return-void
.end method

.method public ۧ()V
    .locals 1

    .line 282
    iget-object v0, p0, Ll/֡ܺۡ;->۬:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 283
    invoke-direct {p0}, Ll/֡ܺۡ;->ᩳ()V

    :cond_0
    const/4 v0, 0x0

    .line 285
    iput-boolean v0, p0, Ll/֡ܺۡ;->᩶:Z

    return-void
.end method
