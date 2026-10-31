.class public Ll/۫ۤۧ;
.super Landroid/view/ViewGroup;
.source "85MM"

# interfaces
.implements Ll/֫ۨ;
.implements Ll/۟ۛ;
.implements Ll/᩺ۛ;


# static fields
.field public static final synthetic ᩸֫:I

.field public static final ᩹֫:[I


# instance fields
.field public ֡֫:I

.field public ֨֫:F

.field public ֫֫:Z

.field public ۖ֫:Landroid/view/animation/Animation$AnimationListener;

.field public final ۗ:Landroid/view/animation/Animation;

.field public ۘ֫:Z

.field public final ۙ:Landroid/view/animation/Animation;

.field public ۚ֫:Landroid/view/View;

.field public ۛ:I

.field public ۜ֫:Z

.field public ۟:F

.field public ۠֫:F

.field public final ۡ֫:[I

.field public final ۢ֫:[I

.field public ۤ:I

.field public ۧ֫:Ll/ۙۤۧ;

.field public final ۨ:Landroid/view/animation/DecelerateInterpolator;

.field public ۫:Ll/ܺۤۧ;

.field public ۬:I

.field public ܰ:F

.field public final ܳ֫:Ll/ۧۨ;

.field public ܶ֫:I

.field public ܺ֫:Ll/᩵ۤۧ;

.field public ܽ֫:I

.field public final ܿ֫:Ll/ܰۛ;

.field public ᩳ֫:Z

.field public ᩴ֫:Landroid/view/animation/Animation;

.field public ᩵֫:Landroid/view/animation/Animation;

.field public ᩶:Landroid/view/animation/Animation;

.field public ᩷֫:I

.field public ᩸:I

.field public ᩹:Landroid/view/animation/Animation;

.field public ᩺:I

.field public final ᩻֫:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const v0, 0x101000e

    .line 150
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/۫ۤۧ;->᩹֫:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 424
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 118
    iput-boolean v0, p0, Ll/۫ۤۧ;->ۘ֫:Z

    const/high16 v1, -0x40800000    # -1.0f

    .line 120
    iput v1, p0, Ll/۫ۤۧ;->֨֫:F

    const/4 v1, 0x2

    new-array v2, v1, [I

    .line 128
    iput-object v2, p0, Ll/۫ۤۧ;->ۡ֫:[I

    new-array v2, v1, [I

    .line 129
    iput-object v2, p0, Ll/۫ۤۧ;->ۢ֫:[I

    new-array v1, v1, [I

    .line 133
    iput-object v1, p0, Ll/۫ۤۧ;->᩻֫:[I

    const/4 v1, -0x1

    .line 142
    iput v1, p0, Ll/۫ۤۧ;->᩸:I

    .line 155
    iput v1, p0, Ll/۫ۤۧ;->ۤ:I

    .line 191
    new-instance v1, Ll/ۚۤۧ;

    invoke-direct {v1, p0}, Ll/ۚۤۧ;-><init>(Ll/۫ۤۧ;)V

    iput-object v1, p0, Ll/۫ۤۧ;->ۖ֫:Landroid/view/animation/Animation$AnimationListener;

    .line 1361
    new-instance v1, Ll/᩹ۤۧ;

    invoke-direct {v1, p0}, Ll/᩹ۤۧ;-><init>(Ll/۫ۤۧ;)V

    iput-object v1, p0, Ll/۫ۤۧ;->ۙ:Landroid/view/animation/Animation;

    .line 1383
    new-instance v1, Ll/᩶ۤۧ;

    invoke-direct {v1, p0}, Ll/᩶ۤۧ;-><init>(Ll/۫ۤۧ;)V

    iput-object v1, p0, Ll/۫ۤۧ;->ۗ:Landroid/view/animation/Animation;

    .line 426
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v1

    iput v1, p0, Ll/۫ۤۧ;->ܶ֫:I

    .line 428
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x10e0001

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    iput v1, p0, Ll/۫ۤۧ;->ܽ֫:I

    .line 431
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 432
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v2, 0x40000000    # 2.0f

    invoke-direct {v1, v2}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    iput-object v1, p0, Ll/۫ۤۧ;->ۨ:Landroid/view/animation/DecelerateInterpolator;

    .line 434
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    const/high16 v2, 0x42200000    # 40.0f

    .line 435
    iget v3, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float v3, v3, v2

    float-to-int v2, v3

    iput v2, p0, Ll/۫ۤۧ;->۬:I

    .line 472
    new-instance v3, Ll/ܺۤۧ;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Ll/ܺۤۧ;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    .line 473
    new-instance v3, Ll/᩵ۤۧ;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Ll/᩵ۤۧ;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, Ll/۫ۤۧ;->ܺ֫:Ll/᩵ۤۧ;

    .line 474
    invoke-virtual {v3}, Ll/᩵ۤۧ;->֫()V

    .line 475
    iget-object v3, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    iget-object v4, p0, Ll/۫ۤۧ;->ܺ֫:Ll/᩵ۤۧ;

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 476
    iget-object v3, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 477
    iget-object v3, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/4 v3, 0x1

    .line 438
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    const/high16 v4, 0x42800000    # 64.0f

    .line 440
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float v1, v1, v4

    float-to-int v1, v1

    iput v1, p0, Ll/۫ۤۧ;->֡֫:I

    int-to-float v1, v1

    .line 441
    iput v1, p0, Ll/۫ۤۧ;->֨֫:F

    .line 442
    new-instance v1, Ll/ۧۨ;

    .line 50
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 442
    iput-object v1, p0, Ll/۫ۤۧ;->ܳ֫:Ll/ۧۨ;

    .line 444
    new-instance v1, Ll/ܰۛ;

    invoke-direct {v1, p0}, Ll/ܰۛ;-><init>(Landroid/view/ViewGroup;)V

    iput-object v1, p0, Ll/۫ۤۧ;->ܿ֫:Ll/ܰۛ;

    .line 445
    invoke-virtual {p0, v3}, Ll/۫ۤۧ;->setNestedScrollingEnabled(Z)V

    neg-int v1, v2

    .line 447
    iput v1, p0, Ll/۫ۤۧ;->ۛ:I

    iput v1, p0, Ll/۫ۤۧ;->᩷֫:I

    const/high16 v1, 0x3f800000    # 1.0f

    .line 448
    invoke-virtual {p0, v1}, Ll/۫ۤۧ;->֫(F)V

    .line 450
    sget-object v1, Ll/۫ۤۧ;->᩹֫:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 451
    invoke-virtual {p1, v0, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Ll/۫ۤۧ;->setEnabled(Z)V

    .line 452
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private ֫(ZZ)V
    .locals 2

    .line 544
    iget-boolean v0, p0, Ll/۫ۤۧ;->ۘ֫:Z

    if-eq v0, p1, :cond_2

    .line 545
    iput-boolean p2, p0, Ll/۫ۤۧ;->ۜ֫:Z

    .line 546
    invoke-direct {p0}, Ll/۫ۤۧ;->ᩳ()V

    .line 547
    iput-boolean p1, p0, Ll/۫ۤۧ;->ۘ֫:Z

    .line 548
    iget-object p2, p0, Ll/۫ۤۧ;->ۖ֫:Landroid/view/animation/Animation$AnimationListener;

    if-eqz p1, :cond_1

    .line 549
    iget p1, p0, Ll/۫ۤۧ;->ۛ:I

    .line 1333
    iput p1, p0, Ll/۫ۤۧ;->᩺:I

    .line 1334
    iget-object p1, p0, Ll/۫ۤۧ;->ۙ:Landroid/view/animation/Animation;

    invoke-virtual {p1}, Landroid/view/animation/Animation;->reset()V

    const-wide/16 v0, 0xc8

    .line 1335
    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 1336
    iget-object v0, p0, Ll/۫ۤۧ;->ۨ:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    if-eqz p2, :cond_0

    .line 1338
    iget-object v0, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {v0, p2}, Ll/ܺۤۧ;->֫(Landroid/view/animation/Animation$AnimationListener;)V

    .line 1340
    :cond_0
    iget-object p2, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {p2}, Landroid/view/View;->clearAnimation()V

    .line 1341
    iget-object p2, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {p2, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void

    .line 551
    :cond_1
    invoke-virtual {p0, p2}, Ll/۫ۤۧ;->֫(Landroid/view/animation/Animation$AnimationListener;)V

    :cond_2
    return-void
.end method

.method private ۧ(F)V
    .locals 4

    .line 1209
    iget v0, p0, Ll/۫ۤۧ;->֨֫:F

    cmpl-float p1, p1, v0

    if-lez p1, :cond_0

    const/4 p1, 0x1

    .line 1210
    invoke-direct {p0, p1, p1}, Ll/۫ۤۧ;->֫(ZZ)V

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 1213
    iput-boolean p1, p0, Ll/۫ۤۧ;->ۘ֫:Z

    .line 1214
    iget-object v0, p0, Ll/۫ۤۧ;->ܺ֫:Ll/᩵ۤۧ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/᩵ۤۧ;->ܽ(F)V

    .line 1217
    new-instance v0, Ll/᩸ۤۧ;

    invoke-direct {v0, p0}, Ll/᩸ۤۧ;-><init>(Ll/۫ۤۧ;)V

    .line 1236
    iget v1, p0, Ll/۫ۤۧ;->ۛ:I

    .line 1349
    iput v1, p0, Ll/۫ۤۧ;->᩺:I

    .line 1350
    iget-object v1, p0, Ll/۫ۤۧ;->ۗ:Landroid/view/animation/Animation;

    invoke-virtual {v1}, Landroid/view/animation/Animation;->reset()V

    const-wide/16 v2, 0xc8

    .line 1351
    invoke-virtual {v1, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 1352
    iget-object v2, p0, Ll/۫ۤۧ;->ۨ:Landroid/view/animation/DecelerateInterpolator;

    invoke-virtual {v1, v2}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 1354
    iget-object v2, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {v2, v0}, Ll/ܺۤۧ;->֫(Landroid/view/animation/Animation$AnimationListener;)V

    .line 1356
    iget-object v0, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 1357
    iget-object v0, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 1237
    iget-object v0, p0, Ll/۫ۤۧ;->ܺ֫:Ll/᩵ۤۧ;

    invoke-virtual {v0, p1}, Ll/᩵ۤۧ;->֫(Z)V

    return-void
.end method

.method private ۧ(ZZ)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 526
    iget-boolean v1, p0, Ll/۫ۤۧ;->ۘ֫:Z

    if-eq v1, p1, :cond_1

    .line 528
    iput-boolean p1, p0, Ll/۫ۤۧ;->ۘ֫:Z

    .line 531
    iget p1, p0, Ll/۫ۤۧ;->֡֫:I

    iget v1, p0, Ll/۫ۤۧ;->᩷֫:I

    add-int/2addr p1, v1

    .line 535
    iget v1, p0, Ll/۫ۤۧ;->ۛ:I

    sub-int/2addr p1, v1

    invoke-virtual {p0, p1}, Ll/۫ۤۧ;->ۧ(I)V

    .line 536
    iput-boolean p2, p0, Ll/۫ۤۧ;->ۜ֫:Z

    .line 500
    iget-object p1, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 501
    iget-object p1, p0, Ll/۫ۤۧ;->ܺ֫:Ll/᩵ۤۧ;

    const/16 p2, 0xff

    invoke-virtual {p1, p2}, Ll/᩵ۤۧ;->setAlpha(I)V

    .line 502
    new-instance p1, Ll/֨ۤۧ;

    invoke-direct {p1, p0}, Ll/֨ۤۧ;-><init>(Ll/۫ۤۧ;)V

    iput-object p1, p0, Ll/۫ۤۧ;->ᩴ֫:Landroid/view/animation/Animation;

    .line 508
    iget p2, p0, Ll/۫ۤۧ;->ܽ֫:I

    int-to-long v0, p2

    invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 509
    iget-object p1, p0, Ll/۫ۤۧ;->ۖ֫:Landroid/view/animation/Animation$AnimationListener;

    if-eqz p1, :cond_0

    .line 510
    iget-object p2, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {p2, p1}, Ll/ܺۤۧ;->֫(Landroid/view/animation/Animation$AnimationListener;)V

    .line 512
    :cond_0
    iget-object p1, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 513
    iget-object p1, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    iget-object p2, p0, Ll/۫ۤۧ;->ᩴ֫:Landroid/view/animation/Animation;

    invoke-virtual {p1, p2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void

    .line 539
    :cond_1
    invoke-direct {p0, p1, v0}, Ll/۫ۤۧ;->֫(ZZ)V

    return-void
.end method

.method private ܽ(F)V
    .locals 11

    .line 1157
    iget-object v0, p0, Ll/۫ۤۧ;->ܺ֫:Ll/᩵ۤۧ;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/᩵ۤۧ;->֫(Z)V

    .line 1158
    iget v0, p0, Ll/۫ۤۧ;->֨֫:F

    div-float v1, p1, v0

    .line 1160
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Ljava/lang/Math;->min(FF)F

    move-result v1

    float-to-double v3, v1

    const-wide v5, 0x3fd999999999999aL    # 0.4

    sub-double/2addr v3, v5

    const-wide/16 v5, 0x0

    .line 1161
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(DD)D

    move-result-wide v3

    double-to-float v3, v3

    const/high16 v4, 0x40a00000    # 5.0f

    mul-float v3, v3, v4

    const/high16 v4, 0x40400000    # 3.0f

    div-float/2addr v3, v4

    .line 1162
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v4

    sub-float/2addr v4, v0

    .line 1167
    iget v5, p0, Ll/۫ۤۧ;->֡֫:I

    int-to-float v5, v5

    const/high16 v6, 0x40000000    # 2.0f

    mul-float v7, v5, v6

    .line 1168
    invoke-static {v4, v7}, Ljava/lang/Math;->min(FF)F

    move-result v4

    div-float/2addr v4, v5

    const/4 v7, 0x0

    invoke-static {v7, v4}, Ljava/lang/Math;->max(FF)F

    move-result v4

    const/high16 v7, 0x40800000    # 4.0f

    div-float/2addr v4, v7

    float-to-double v7, v4

    const-wide/high16 v9, 0x4000000000000000L    # 2.0

    .line 1170
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v9

    sub-double/2addr v7, v9

    double-to-float v4, v7

    mul-float v4, v4, v6

    mul-float v7, v5, v4

    mul-float v7, v7, v6

    mul-float v5, v5, v1

    add-float/2addr v5, v7

    float-to-int v1, v5

    .line 1174
    iget v5, p0, Ll/۫ۤۧ;->᩷֫:I

    add-int/2addr v5, v1

    .line 1176
    iget-object v1, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_0

    .line 1177
    iget-object v1, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    const/4 v7, 0x0

    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 1180
    :cond_0
    iget-object v1, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {v1, v2}, Landroid/view/View;->setScaleX(F)V

    .line 1181
    iget-object v1, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {v1, v2}, Landroid/view/View;->setScaleY(F)V

    const/4 v1, 0x0

    const-wide/16 v7, 0x12c

    cmpg-float p1, p1, v0

    if-gez p1, :cond_2

    .line 1188
    iget-object p1, p0, Ll/۫ۤۧ;->ܺ֫:Ll/᩵ۤۧ;

    invoke-virtual {p1}, Ll/᩵ۤۧ;->getAlpha()I

    move-result p1

    const/16 v0, 0x4c

    if-le p1, v0, :cond_4

    iget-object p1, p0, Ll/۫ۤۧ;->᩶:Landroid/view/animation/Animation;

    if-eqz p1, :cond_1

    .line 1153
    invoke-virtual {p1}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-virtual {p1}, Landroid/view/animation/Animation;->hasEnded()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    .line 570
    :cond_1
    iget-object p1, p0, Ll/۫ۤۧ;->ܺ֫:Ll/᩵ۤۧ;

    invoke-virtual {p1}, Ll/᩵ۤۧ;->getAlpha()I

    move-result p1

    .line 578
    new-instance v9, Ll/ܶۤۧ;

    invoke-direct {v9, p0, p1, v0}, Ll/ܶۤۧ;-><init>(Ll/۫ۤۧ;II)V

    .line 585
    invoke-virtual {v9, v7, v8}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 587
    iget-object p1, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {p1, v1}, Ll/ܺۤۧ;->֫(Landroid/view/animation/Animation$AnimationListener;)V

    .line 588
    iget-object p1, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 589
    iget-object p1, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {p1, v9}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 570
    iput-object v9, p0, Ll/۫ۤۧ;->᩶:Landroid/view/animation/Animation;

    goto :goto_0

    .line 1194
    :cond_2
    iget-object p1, p0, Ll/۫ۤۧ;->ܺ֫:Ll/᩵ۤۧ;

    invoke-virtual {p1}, Ll/᩵ۤۧ;->getAlpha()I

    move-result p1

    const/16 v0, 0xff

    if-ge p1, v0, :cond_4

    iget-object p1, p0, Ll/۫ۤۧ;->᩹:Landroid/view/animation/Animation;

    if-eqz p1, :cond_3

    .line 1153
    invoke-virtual {p1}, Landroid/view/animation/Animation;->hasStarted()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {p1}, Landroid/view/animation/Animation;->hasEnded()Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    .line 574
    :cond_3
    iget-object p1, p0, Ll/۫ۤۧ;->ܺ֫:Ll/᩵ۤۧ;

    invoke-virtual {p1}, Ll/᩵ۤۧ;->getAlpha()I

    move-result p1

    .line 578
    new-instance v9, Ll/ܶۤۧ;

    invoke-direct {v9, p0, p1, v0}, Ll/ܶۤۧ;-><init>(Ll/۫ۤۧ;II)V

    .line 585
    invoke-virtual {v9, v7, v8}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 587
    iget-object p1, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {p1, v1}, Ll/ܺۤۧ;->֫(Landroid/view/animation/Animation$AnimationListener;)V

    .line 588
    iget-object p1, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 589
    iget-object p1, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {p1, v9}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 574
    iput-object v9, p0, Ll/۫ۤۧ;->᩹:Landroid/view/animation/Animation;

    :cond_4
    :goto_0
    const p1, 0x3f4ccccd    # 0.8f

    mul-float v0, v3, p1

    .line 1200
    iget-object v1, p0, Ll/۫ۤۧ;->ܺ֫:Ll/᩵ۤۧ;

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-virtual {v1, p1}, Ll/᩵ۤۧ;->ܽ(F)V

    .line 1201
    iget-object p1, p0, Ll/۫ۤۧ;->ܺ֫:Ll/᩵ۤۧ;

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-virtual {p1, v0}, Ll/᩵ۤۧ;->֫(F)V

    const p1, 0x3ecccccd    # 0.4f

    mul-float v3, v3, p1

    const/high16 p1, -0x41800000    # -0.25f

    add-float/2addr v3, p1

    mul-float v4, v4, v6

    add-float/2addr v4, v3

    const/high16 p1, 0x3f000000    # 0.5f

    mul-float v4, v4, p1

    .line 1204
    iget-object p1, p0, Ll/۫ۤۧ;->ܺ֫:Ll/᩵ۤۧ;

    invoke-virtual {p1, v4}, Ll/᩵ۤۧ;->ۧ(F)V

    .line 1205
    iget p1, p0, Ll/۫ۤۧ;->ۛ:I

    sub-int/2addr v5, p1

    invoke-virtual {p0, v5}, Ll/۫ۤۧ;->ۧ(I)V

    return-void
.end method

.method private ᩳ()V
    .locals 3

    .line 666
    iget-object v0, p0, Ll/۫ۤۧ;->ۚ֫:Landroid/view/View;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 667
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 668
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 669
    iget-object v2, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 670
    iput-object v1, p0, Ll/۫ۤۧ;->ۚ֫:Landroid/view/View;

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private ᩳ(F)V
    .locals 2

    .line 1324
    iget v0, p0, Ll/۫ۤۧ;->ܰ:F

    sub-float/2addr p1, v0

    .line 1325
    iget v1, p0, Ll/۫ۤۧ;->ܶ֫:I

    int-to-float v1, v1

    cmpl-float p1, p1, v1

    if-lez p1, :cond_0

    iget-boolean p1, p0, Ll/۫ۤۧ;->֫֫:Z

    if-nez p1, :cond_0

    add-float/2addr v0, v1

    .line 1326
    iput v0, p0, Ll/۫ۤۧ;->۟:F

    const/4 p1, 0x1

    .line 1327
    iput-boolean p1, p0, Ll/۫ۤۧ;->֫֫:Z

    .line 1328
    iget-object p1, p0, Ll/۫ۤۧ;->ܺ֫:Ll/᩵ۤۧ;

    const/16 v0, 0x4c

    invoke-virtual {p1, v0}, Ll/᩵ۤۧ;->setAlpha(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    if-eqz p1, :cond_0

    .line 242
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 243
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v2, 0x11d

    if-ne v0, v2, :cond_0

    .line 244
    invoke-direct {p0, v1, v1}, Ll/۫ۤۧ;->ۧ(ZZ)V

    return v1

    .line 247
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final dispatchNestedFling(FFZ)Z
    .locals 1

    .line 1144
    iget-object v0, p0, Ll/۫ۤۧ;->ܿ֫:Ll/ܰۛ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ܰۛ;->֫(FFZ)Z

    move-result p1

    return p1
.end method

.method public final dispatchNestedPreFling(FF)Z
    .locals 1

    .line 1149
    iget-object v0, p0, Ll/۫ۤۧ;->ܿ֫:Ll/ܰۛ;

    invoke-virtual {v0, p1, p2}, Ll/ܰۛ;->֫(FF)Z

    move-result p1

    return p1
.end method

.method public final dispatchNestedPreScroll(II[I[I)Z
    .locals 6

    .line 1138
    iget-object v0, p0, Ll/۫ۤۧ;->ܿ֫:Ll/ܰۛ;

    const/4 v5, 0x0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 289
    invoke-virtual/range {v0 .. v5}, Ll/ܰۛ;->֫(II[I[II)Z

    move-result p1

    return p1
.end method

.method public final dispatchNestedScroll(IIII[I)Z
    .locals 6

    .line 1131
    iget-object v0, p0, Ll/۫ۤۧ;->ܿ֫:Ll/ܰۛ;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Ll/ܰۛ;->֫(IIII[I)Z

    move-result p1

    return p1
.end method

.method public final getChildDrawingOrder(II)I
    .locals 1

    .line 457
    iget v0, p0, Ll/۫ۤۧ;->ۤ:I

    if-gez v0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, -0x1

    if-ne p2, p1, :cond_1

    return v0

    :cond_1
    if-lt p2, v0, :cond_2

    add-int/lit8 p2, p2, 0x1

    :cond_2
    :goto_0
    return p2
.end method

.method public final getNestedScrollAxes()I
    .locals 1

    .line 1015
    iget-object v0, p0, Ll/۫ۤۧ;->ܳ֫:Ll/ۧۨ;

    invoke-virtual {v0}, Ll/ۧۨ;->֫()I

    move-result v0

    return v0
.end method

.method public final hasNestedScrollingParent()Z
    .locals 2

    .line 1125
    iget-object v0, p0, Ll/۫ۤۧ;->ܿ֫:Ll/ܰۛ;

    const/4 v1, 0x0

    .line 100
    invoke-virtual {v0, v1}, Ll/ܰۛ;->֫(I)Z

    move-result v0

    return v0
.end method

.method public final isNestedScrollingEnabled()Z
    .locals 1

    .line 1110
    iget-object v0, p0, Ll/۫ۤۧ;->ܿ֫:Ll/ܰۛ;

    invoke-virtual {v0}, Ll/ܰۛ;->֫()Z

    move-result v0

    return v0
.end method

.method public final onDetachedFromWindow()V
    .locals 0

    .line 304
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 305
    invoke-virtual {p0}, Ll/۫ۤۧ;->ܽ()V

    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 771
    invoke-direct {p0}, Ll/۫ۤۧ;->ᩳ()V

    .line 773
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    .line 780
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_a

    invoke-virtual {p0}, Ll/۫ۤۧ;->֫()Z

    move-result v1

    if-nez v1, :cond_a

    iget-boolean v1, p0, Ll/۫ۤۧ;->ۘ֫:Z

    if-nez v1, :cond_a

    iget-boolean v1, p0, Ll/۫ۤۧ;->ᩳ֫:Z

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz v0, :cond_7

    const/4 v1, 0x1

    const/4 v3, -0x1

    if-eq v0, v1, :cond_6

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_6

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 1417
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    .line 1418
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    .line 1419
    iget v3, p0, Ll/۫ۤۧ;->᩸:I

    if-ne v1, v3, :cond_9

    if-nez v0, :cond_2

    const/4 v2, 0x1

    .line 1423
    :cond_2
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Ll/۫ۤۧ;->᩸:I

    goto :goto_0

    .line 800
    :cond_3
    iget v0, p0, Ll/۫ۤۧ;->᩸:I

    if-ne v0, v3, :cond_4

    goto :goto_1

    .line 805
    :cond_4
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_5

    goto :goto_1

    .line 809
    :cond_5
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    .line 810
    invoke-direct {p0, p1}, Ll/۫ۤۧ;->ᩳ(F)V

    goto :goto_0

    .line 819
    :cond_6
    iput-boolean v2, p0, Ll/۫ۤۧ;->֫֫:Z

    .line 820
    iput v3, p0, Ll/۫ۤۧ;->᩸:I

    goto :goto_0

    .line 788
    :cond_7
    iget-object v0, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    iget v1, p0, Ll/۫ۤۧ;->᩷֫:I

    sub-int/2addr v1, v0

    invoke-virtual {p0, v1}, Ll/۫ۤۧ;->ۧ(I)V

    .line 789
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Ll/۫ۤۧ;->᩸:I

    .line 790
    iput-boolean v2, p0, Ll/۫ۤۧ;->֫֫:Z

    .line 792
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_8

    goto :goto_1

    .line 796
    :cond_8
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    iput p1, p0, Ll/۫ۤۧ;->ܰ:F

    .line 824
    :cond_9
    :goto_0
    iget-boolean p1, p0, Ll/۫ۤۧ;->֫֫:Z

    return p1

    :cond_a
    :goto_1
    return v2
.end method

.method public final onLayout(ZIIII)V
    .locals 2

    .line 688
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    .line 689
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    .line 690
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p3

    if-nez p3, :cond_0

    goto :goto_0

    .line 693
    :cond_0
    iget-object p3, p0, Ll/۫ۤۧ;->ۚ֫:Landroid/view/View;

    if-nez p3, :cond_1

    .line 694
    invoke-direct {p0}, Ll/۫ۤۧ;->ᩳ()V

    .line 696
    :cond_1
    iget-object p3, p0, Ll/۫ۤۧ;->ۚ֫:Landroid/view/View;

    if-nez p3, :cond_2

    :goto_0
    return-void

    .line 700
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p4

    .line 701
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p5

    .line 702
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    sub-int v0, p1, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    .line 703
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    sub-int/2addr p2, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    sub-int/2addr p2, v1

    add-int/2addr v0, p4

    add-int/2addr p2, p5

    .line 704
    invoke-virtual {p3, p4, p5, v0, p2}, Landroid/view/View;->layout(IIII)V

    .line 705
    iget-object p2, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    .line 706
    iget-object p3, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    move-result p3

    .line 707
    div-int/lit8 p1, p1, 0x2

    div-int/lit8 p2, p2, 0x2

    sub-int p4, p1, p2

    iget p5, p0, Ll/۫ۤۧ;->ۛ:I

    add-int/2addr p1, p2

    add-int/2addr p3, p5

    iget-object p2, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {p2, p4, p5, p1, p3}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 713
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onMeasure(II)V

    .line 714
    iget-object p1, p0, Ll/۫ۤۧ;->ۚ֫:Landroid/view/View;

    if-nez p1, :cond_0

    .line 715
    invoke-direct {p0}, Ll/۫ۤۧ;->ᩳ()V

    .line 717
    :cond_0
    iget-object p1, p0, Ll/۫ۤۧ;->ۚ֫:Landroid/view/View;

    if-nez p1, :cond_1

    goto :goto_1

    .line 721
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    sub-int/2addr p2, v0

    const/high16 v0, 0x40000000    # 2.0f

    .line 720
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 723
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    .line 722
    invoke-static {v1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 720
    invoke-virtual {p1, p2, v1}, Landroid/view/View;->measure(II)V

    .line 724
    iget p1, p0, Ll/۫ۤۧ;->۬:I

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 725
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 724
    iget-object v0, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {v0, p2, p1}, Landroid/view/View;->measure(II)V

    const/4 p1, -0x1

    .line 726
    iput p1, p0, Ll/۫ۤۧ;->ۤ:I

    const/4 p1, 0x0

    .line 728
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-ge p1, p2, :cond_3

    .line 729
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    iget-object v0, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    if-ne p2, v0, :cond_2

    .line 730
    iput p1, p0, Ll/۫ۤۧ;->ۤ:I

    return-void

    :cond_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public final onNestedFling(Landroid/view/View;FFZ)Z
    .locals 0

    .line 1144
    iget-object p1, p0, Ll/۫ۤۧ;->ܿ֫:Ll/ܰۛ;

    invoke-virtual {p1, p2, p3, p4}, Ll/ܰۛ;->֫(FFZ)Z

    move-result p1

    return p1
.end method

.method public final onNestedPreFling(Landroid/view/View;FF)Z
    .locals 0

    .line 1149
    iget-object p1, p0, Ll/۫ۤۧ;->ܿ֫:Ll/ܰۛ;

    invoke-virtual {p1, p2, p3}, Ll/ܰۛ;->֫(FF)Z

    move-result p1

    return p1
.end method

.method public final onNestedPreScroll(Landroid/view/View;II[I)V
    .locals 4

    const/4 p1, 0x1

    if-lez p3, :cond_1

    .line 985
    iget v0, p0, Ll/۫ۤۧ;->۠֫:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-lez v2, :cond_1

    int-to-float v2, p3

    cmpl-float v3, v2, v0

    if-lez v3, :cond_0

    float-to-int v0, v0

    .line 987
    aput v0, p4, p1

    .line 988
    iput v1, p0, Ll/۫ۤۧ;->۠֫:F

    goto :goto_0

    :cond_0
    sub-float/2addr v0, v2

    .line 990
    iput v0, p0, Ll/۫ۤۧ;->۠֫:F

    .line 991
    aput p3, p4, p1

    .line 993
    :goto_0
    iget v0, p0, Ll/۫ۤۧ;->۠֫:F

    invoke-direct {p0, v0}, Ll/۫ۤۧ;->ܽ(F)V

    :cond_1
    const/4 v0, 0x0

    .line 1007
    aget v1, p4, v0

    sub-int/2addr p2, v1

    aget v1, p4, p1

    sub-int/2addr p3, v1

    const/4 v1, 0x0

    iget-object v2, p0, Ll/۫ۤۧ;->ۡ֫:[I

    invoke-virtual {p0, p2, p3, v2, v1}, Ll/۫ۤۧ;->dispatchNestedPreScroll(II[I[I)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 1008
    aget p2, p4, v0

    aget p3, v2, v0

    add-int/2addr p2, p3

    aput p2, p4, v0

    .line 1009
    aget p2, p4, p1

    aget p3, v2, p1

    add-int/2addr p2, p3

    aput p2, p4, p1

    :cond_2
    return-void
.end method

.method public final onNestedPreScroll(Landroid/view/View;II[II)V
    .locals 0

    if-nez p5, :cond_0

    .line 959
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/۫ۤۧ;->onNestedPreScroll(Landroid/view/View;II[I)V

    :cond_0
    return-void
.end method

.method public final onNestedScroll(Landroid/view/View;IIII)V
    .locals 8

    const/4 v6, 0x0

    .line 1040
    iget-object v7, p0, Ll/۫ۤۧ;->᩻֫:[I

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v7}, Ll/۫ۤۧ;->onNestedScroll(Landroid/view/View;IIIII[I)V

    return-void
.end method

.method public final onNestedScroll(Landroid/view/View;IIIII)V
    .locals 8

    .line 949
    iget-object v7, p0, Ll/۫ۤۧ;->᩻֫:[I

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-virtual/range {v0 .. v7}, Ll/۫ۤۧ;->onNestedScroll(Landroid/view/View;IIIII[I)V

    return-void
.end method

.method public final onNestedScroll(Landroid/view/View;IIIII[I)V
    .locals 11

    move-object v0, p0

    if-eqz p6, :cond_0

    goto :goto_1

    :cond_0
    const/4 v9, 0x1

    .line 880
    aget v10, p7, v9

    if-nez p6, :cond_1

    .line 1063
    iget-object v1, v0, Ll/۫ۤۧ;->ܿ֫:Ll/ܰۛ;

    iget-object v6, v0, Ll/۫ۤۧ;->ۢ֫:[I

    move v2, p2

    move v3, p3

    move v4, p4

    move/from16 v5, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    invoke-virtual/range {v1 .. v8}, Ll/ܰۛ;->֫(IIII[II[I)V

    .line 883
    :cond_1
    aget v1, p7, v9

    sub-int/2addr v1, v10

    sub-int v1, p5, v1

    if-nez v1, :cond_2

    .line 898
    iget-object v2, v0, Ll/۫ۤۧ;->ۢ֫:[I

    aget v2, v2, v9

    add-int v2, p5, v2

    goto :goto_0

    :cond_2
    move v2, v1

    :goto_0
    if-gez v2, :cond_3

    .line 905
    invoke-virtual {p0}, Ll/۫ۤۧ;->֫()Z

    move-result v3

    if-nez v3, :cond_3

    .line 906
    iget v3, v0, Ll/۫ۤۧ;->۠֫:F

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v3, v2

    iput v3, v0, Ll/۫ۤۧ;->۠֫:F

    .line 907
    invoke-direct {p0, v3}, Ll/۫ۤۧ;->ܽ(F)V

    .line 911
    aget v2, p7, v9

    add-int/2addr v2, v1

    aput v2, p7, v9

    :cond_3
    :goto_1
    return-void
.end method

.method public final onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .locals 0

    .line 974
    iget-object p1, p0, Ll/۫ۤۧ;->ܳ֫:Ll/ۧۨ;

    invoke-virtual {p1, p3}, Ll/ۧۨ;->֫(I)V

    and-int/lit8 p1, p3, 0x2

    .line 976
    invoke-virtual {p0, p1}, Ll/۫ۤۧ;->startNestedScroll(I)Z

    const/4 p1, 0x0

    .line 977
    iput p1, p0, Ll/۫ۤۧ;->۠֫:F

    const/4 p1, 0x1

    .line 978
    iput-boolean p1, p0, Ll/۫ۤۧ;->ᩳ֫:Z

    return-void
.end method

.method public final onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;II)V
    .locals 0

    if-nez p4, :cond_0

    .line 933
    invoke-virtual {p0, p1, p2, p3}, Ll/۫ۤۧ;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 297
    check-cast p1, Ll/۬ۤۧ;

    .line 298
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 299
    iget-boolean p1, p1, Ll/۬ۤۧ;->᩸:Z

    const/4 v0, 0x0

    .line 496
    invoke-direct {p0, p1, v0}, Ll/۫ۤۧ;->ۧ(ZZ)V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 291
    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 292
    new-instance v1, Ll/۬ۤۧ;

    iget-boolean v2, p0, Ll/۫ۤۧ;->ۘ֫:Z

    invoke-direct {v1, v0, v2}, Ll/۬ۤۧ;-><init>(Landroid/os/Parcelable;Z)V

    return-object v1
.end method

.method public final onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .locals 0

    .line 967
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Ll/۫ۤۧ;->ۘ֫:Z

    if-nez p1, :cond_0

    and-int/lit8 p1, p3, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onStartNestedScroll(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    if-nez p4, :cond_0

    .line 921
    invoke-virtual {p0, p1, p2, p3}, Ll/۫ۤۧ;->onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onStopNestedScroll(Landroid/view/View;)V
    .locals 2

    .line 1020
    iget-object p1, p0, Ll/۫ۤۧ;->ܳ֫:Ll/ۧۨ;

    invoke-virtual {p1}, Ll/ۧۨ;->ۧ()V

    const/4 p1, 0x0

    .line 1021
    iput-boolean p1, p0, Ll/۫ۤۧ;->ᩳ֫:Z

    .line 1024
    iget p1, p0, Ll/۫ۤۧ;->۠֫:F

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-lez v1, :cond_0

    .line 1025
    invoke-direct {p0, p1}, Ll/۫ۤۧ;->ۧ(F)V

    .line 1026
    iput v0, p0, Ll/۫ۤۧ;->۠֫:F

    goto :goto_0

    .line 1031
    :cond_0
    new-instance p1, Ll/֡ۤۧ;

    invoke-direct {p1, p0}, Ll/֡ۤۧ;-><init>(Ll/۫ۤۧ;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1034
    :goto_0
    invoke-virtual {p0}, Ll/۫ۤۧ;->stopNestedScroll()V

    return-void
.end method

.method public final onStopNestedScroll(Landroid/view/View;I)V
    .locals 0

    if-nez p2, :cond_0

    .line 942
    invoke-virtual {p0, p1}, Ll/۫ۤۧ;->onStopNestedScroll(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1243
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    .line 1250
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_c

    invoke-virtual {p0}, Ll/۫ۤۧ;->֫()Z

    move-result v1

    if-nez v1, :cond_c

    iget-boolean v1, p0, Ll/۫ۤۧ;->ۘ֫:Z

    if-nez v1, :cond_c

    iget-boolean v1, p0, Ll/۫ۤۧ;->ᩳ֫:Z

    if-eqz v1, :cond_0

    goto/16 :goto_1

    :cond_0
    const/4 v1, 0x1

    if-eqz v0, :cond_b

    const/high16 v3, 0x3f000000    # 0.5f

    if-eq v0, v1, :cond_8

    const/4 v4, 0x2

    if-eq v0, v4, :cond_5

    const/4 v3, 0x3

    if-eq v0, v3, :cond_c

    const/4 v3, 0x5

    if-eq v0, v3, :cond_3

    const/4 v3, 0x6

    if-eq v0, v3, :cond_1

    goto :goto_0

    .line 1417
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    .line 1418
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    .line 1419
    iget v4, p0, Ll/۫ۤۧ;->᩸:I

    if-ne v3, v4, :cond_7

    if-nez v0, :cond_2

    const/4 v2, 0x1

    .line 1423
    :cond_2
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Ll/۫ۤۧ;->᩸:I

    return v1

    .line 1286
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    if-gez v0, :cond_4

    goto :goto_1

    .line 1292
    :cond_4
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Ll/۫ۤۧ;->᩸:I

    return v1

    .line 1263
    :cond_5
    iget v0, p0, Ll/۫ۤۧ;->᩸:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_6

    goto :goto_1

    .line 1269
    :cond_6
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    .line 1270
    invoke-direct {p0, p1}, Ll/۫ۤۧ;->ᩳ(F)V

    .line 1272
    iget-boolean v0, p0, Ll/۫ۤۧ;->֫֫:Z

    if-eqz v0, :cond_7

    .line 1273
    iget v0, p0, Ll/۫ۤۧ;->۟:F

    sub-float/2addr p1, v0

    mul-float p1, p1, v3

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_c

    .line 1277
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 1278
    invoke-direct {p0, p1}, Ll/۫ۤۧ;->ܽ(F)V

    :cond_7
    :goto_0
    return v1

    .line 1301
    :cond_8
    iget v0, p0, Ll/۫ۤۧ;->᩸:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-gez v0, :cond_9

    goto :goto_1

    .line 1307
    :cond_9
    iget-boolean v1, p0, Ll/۫ۤۧ;->֫֫:Z

    if-eqz v1, :cond_a

    .line 1308
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    .line 1309
    iget v0, p0, Ll/۫ۤۧ;->۟:F

    sub-float/2addr p1, v0

    mul-float p1, p1, v3

    .line 1310
    iput-boolean v2, p0, Ll/۫ۤۧ;->֫֫:Z

    .line 1311
    invoke-direct {p0, p1}, Ll/۫ۤۧ;->ۧ(F)V

    :cond_a
    const/4 p1, -0x1

    .line 1313
    iput p1, p0, Ll/۫ۤۧ;->᩸:I

    return v2

    .line 1258
    :cond_b
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Ll/۫ۤۧ;->᩸:I

    .line 1259
    iput-boolean v2, p0, Ll/۫ۤۧ;->֫֫:Z

    return v1

    :cond_c
    :goto_1
    return v2
.end method

.method public final setEnabled(Z)V
    .locals 0

    .line 234
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setEnabled(Z)V

    if-nez p1, :cond_0

    .line 236
    invoke-virtual {p0}, Ll/۫ۤۧ;->ܽ()V

    :cond_0
    return-void
.end method

.method public final setNestedScrollingEnabled(Z)V
    .locals 1

    .line 1105
    iget-object v0, p0, Ll/۫ۤۧ;->ܿ֫:Ll/ܰۛ;

    invoke-virtual {v0, p1}, Ll/ܰۛ;->֫(Z)V

    return-void
.end method

.method public final startNestedScroll(I)Z
    .locals 2

    .line 1115
    iget-object v0, p0, Ll/۫ۤۧ;->ܿ֫:Ll/ܰۛ;

    const/4 v1, 0x0

    .line 129
    invoke-virtual {v0, p1, v1}, Ll/ܰۛ;->֫(II)Z

    move-result p1

    return p1
.end method

.method public final stopNestedScroll()V
    .locals 2

    .line 1120
    iget-object v0, p0, Ll/۫ۤۧ;->ܿ֫:Ll/ܰۛ;

    const/4 v1, 0x0

    .line 176
    invoke-virtual {v0, v1}, Ll/ܰۛ;->ۧ(I)V

    return-void
.end method

.method public final ֫(F)V
    .locals 2

    .line 1378
    iget v0, p0, Ll/۫ۤۧ;->᩺:I

    iget v1, p0, Ll/۫ۤۧ;->᩷֫:I

    sub-int/2addr v1, v0

    int-to-float v1, v1

    mul-float v1, v1, p1

    float-to-int p1, v1

    add-int/2addr v0, p1

    .line 1379
    iget-object p1, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    sub-int/2addr v0, p1

    .line 1380
    invoke-virtual {p0, v0}, Ll/۫ۤۧ;->ۧ(I)V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 616
    iget-object v0, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {v0, p1}, Ll/ܺۤۧ;->setBackgroundColor(I)V

    return-void
.end method

.method public final ֫(Landroid/view/animation/Animation$AnimationListener;)V
    .locals 3

    .line 557
    new-instance v0, Ll/۠ۤۧ;

    invoke-direct {v0, p0}, Ll/۠ۤۧ;-><init>(Ll/۫ۤۧ;)V

    iput-object v0, p0, Ll/۫ۤۧ;->᩵֫:Landroid/view/animation/Animation;

    const-wide/16 v1, 0x96

    .line 563
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 564
    iget-object v0, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {v0, p1}, Ll/ܺۤۧ;->֫(Landroid/view/animation/Animation$AnimationListener;)V

    .line 565
    iget-object p1, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 566
    iget-object p1, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    iget-object v0, p0, Ll/۫ۤۧ;->᩵֫:Landroid/view/animation/Animation;

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public final ֫(Ll/ۙۤۧ;)V
    .locals 0

    .line 485
    iput-object p1, p0, Ll/۫ۤۧ;->ۧ֫:Ll/ۙۤۧ;

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    const/4 v0, 0x0

    .line 496
    invoke-direct {p0, p1, v0}, Ll/۫ۤۧ;->ۧ(ZZ)V

    return-void
.end method

.method public final varargs ֫([I)V
    .locals 1

    .line 651
    invoke-direct {p0}, Ll/۫ۤۧ;->ᩳ()V

    .line 652
    iget-object v0, p0, Ll/۫ۤۧ;->ܺ֫:Ll/᩵ۤۧ;

    invoke-virtual {v0, p1}, Ll/᩵ۤۧ;->֫([I)V

    return-void
.end method

.method public final ֫()Z
    .locals 3

    .line 754
    iget-object v0, p0, Ll/۫ۤۧ;->ۚ֫:Landroid/view/View;

    instance-of v1, v0, Landroid/widget/ListView;

    const/4 v2, -0x1

    if-eqz v1, :cond_0

    .line 755
    check-cast v0, Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/AbsListView;->canScrollList(I)Z

    move-result v0

    return v0

    .line 757
    :cond_0
    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    return v0
.end method

.method public final ۧ(I)V
    .locals 1

    .line 1411
    iget-object v0, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 1412
    iget-object v0, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-static {p1, v0}, Ll/ܿ᩺;->ܽ(ILandroid/view/View;)V

    .line 1413
    iget-object p1, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    iput p1, p0, Ll/۫ۤۧ;->ۛ:I

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 660
    iget-boolean v0, p0, Ll/۫ۤۧ;->ۘ֫:Z

    return v0
.end method

.method public final ܽ()V
    .locals 2

    .line 219
    iget-object v0, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 220
    iget-object v0, p0, Ll/۫ۤۧ;->ܺ֫:Ll/᩵ۤۧ;

    invoke-virtual {v0}, Ll/᩵ۤۧ;->stop()V

    .line 221
    iget-object v0, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 309
    iget-object v0, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0xff

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 310
    iget-object v0, p0, Ll/۫ۤۧ;->ܺ֫:Ll/᩵ۤۧ;

    invoke-virtual {v0, v1}, Ll/᩵ۤۧ;->setAlpha(I)V

    .line 227
    iget v0, p0, Ll/۫ۤۧ;->᩷֫:I

    iget v1, p0, Ll/۫ۤۧ;->ۛ:I

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Ll/۫ۤۧ;->ۧ(I)V

    .line 229
    iget-object v0, p0, Ll/۫ۤۧ;->۫:Ll/ܺۤۧ;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    iput v0, p0, Ll/۫ۤۧ;->ۛ:I

    return-void
.end method
