.class public abstract Ll/۟۟;
.super Ljava/lang/Object;
.source "V5Y3"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# static fields
.field public static final ᩳ֫:I


# instance fields
.field public ֫֫:Ljava/lang/Runnable;

.field public ۗ:I

.field public final ۙ:Landroid/view/animation/AccelerateInterpolator;

.field public ۛ:[F

.field public ۟:[F

.field public ۤ:[F

.field public final ۧ֫:Ll/᩺۟;

.field public ۨ:Z

.field public ۫:[F

.field public ۬:Z

.field public ܰ:[F

.field public final ܽ֫:Landroid/view/View;

.field public ᩶:Z

.field public ᩸:I

.field public ᩹:Z

.field public ᩺:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 195
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v0

    sput v0, Ll/۟۟;->ᩳ֫:I

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 10

    .line 210
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    new-instance v0, Ll/᩺۟;

    invoke-direct {v0}, Ll/᩺۟;-><init>()V

    iput-object v0, p0, Ll/۟۟;->ۧ֫:Ll/᩺۟;

    .line 141
    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    iput-object v1, p0, Ll/۟۟;->ۙ:Landroid/view/animation/AccelerateInterpolator;

    const/4 v1, 0x2

    new-array v2, v1, [F

    .line 150
    fill-array-data v2, :array_0

    iput-object v2, p0, Ll/۟۟;->ܰ:[F

    new-array v3, v1, [F

    .line 153
    fill-array-data v3, :array_1

    iput-object v3, p0, Ll/۟۟;->۫:[F

    new-array v4, v1, [F

    .line 162
    fill-array-data v4, :array_2

    iput-object v4, p0, Ll/۟۟;->۟:[F

    new-array v5, v1, [F

    .line 165
    fill-array-data v5, :array_3

    iput-object v5, p0, Ll/۟۟;->ۛ:[F

    new-array v1, v1, [F

    .line 168
    fill-array-data v1, :array_4

    iput-object v1, p0, Ll/۟۟;->ۤ:[F

    .line 211
    iput-object p1, p0, Ll/۟۟;->ܽ֫:Landroid/view/View;

    .line 213
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    .line 214
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const v6, 0x44c4e000    # 1575.0f

    mul-float v6, v6, p1

    const/high16 v7, 0x3f000000    # 0.5f

    add-float/2addr v6, v7

    float-to-int v6, v6

    const v8, 0x439d8000    # 315.0f

    mul-float p1, p1, v8

    add-float/2addr p1, v7

    float-to-int p1, p1

    int-to-float v6, v6

    const/high16 v7, 0x447a0000    # 1000.0f

    div-float/2addr v6, v7

    const/4 v8, 0x0

    aput v6, v1, v8

    const/4 v9, 0x1

    aput v6, v1, v9

    int-to-float p1, p1

    div-float/2addr p1, v7

    aput p1, v5, v8

    aput p1, v5, v9

    .line 359
    iput v9, p0, Ll/۟۟;->ۗ:I

    const p1, 0x7f7fffff    # Float.MAX_VALUE

    aput p1, v3, v8

    aput p1, v3, v9

    const p1, 0x3e4ccccd    # 0.2f

    aput p1, v2, v8

    aput p1, v2, v9

    const p1, 0x3a83126f    # 0.001f

    aput p1, v4, v8

    aput p1, v4, v9

    .line 223
    sget p1, Ll/۟۟;->ᩳ֫:I

    .line 420
    iput p1, p0, Ll/۟۟;->᩸:I

    .line 436
    invoke-virtual {v0}, Ll/᩺۟;->ۜ()V

    .line 452
    invoke-virtual {v0}, Ll/᩺۟;->᩻()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x7f7fffff    # Float.MAX_VALUE
        0x7f7fffff    # Float.MAX_VALUE
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x0
    .end array-data

    :array_3
    .array-data 4
        0x0
        0x0
    .end array-data

    :array_4
    .array-data 4
        0x7f7fffff    # Float.MAX_VALUE
        0x7f7fffff    # Float.MAX_VALUE
    .end array-data
.end method

.method private ֫(FF)F
    .locals 5

    const/4 v0, 0x0

    cmpl-float v1, p2, v0

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 638
    iget v2, p0, Ll/۟۟;->ۗ:I

    if-eqz v2, :cond_2

    if-eq v2, v1, :cond_2

    const/4 v1, 0x2

    if-eq v2, v1, :cond_1

    goto :goto_0

    :cond_1
    cmpg-float v1, p1, v0

    if-gez v1, :cond_4

    neg-float p2, p2

    div-float/2addr p1, p2

    return p1

    :cond_2
    cmpg-float v3, p1, p2

    if-gez v3, :cond_4

    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v4, p1, v0

    if-ltz v4, :cond_3

    div-float/2addr p1, p2

    sub-float/2addr v3, p1

    return v3

    .line 645
    :cond_3
    iget-boolean p1, p0, Ll/۟۟;->᩶:Z

    if-eqz p1, :cond_4

    if-ne v2, v1, :cond_4

    return v3

    :cond_4
    :goto_0
    return v0
.end method

.method public static ֫(FFF)F
    .locals 1

    cmpl-float v0, p0, p2

    if-lez v0, :cond_0

    return p2

    :cond_0
    cmpg-float p2, p0, p1

    if-gez p2, :cond_1

    return p1

    :cond_1
    return p0
.end method

.method private ֫(IFFF)F
    .locals 3

    .line 549
    iget-object v0, p0, Ll/۟۟;->ܰ:[F

    aget v0, v0, p1

    .line 550
    iget-object v1, p0, Ll/۟۟;->۫:[F

    aget v1, v1, p1

    mul-float v0, v0, p3

    const/4 v2, 0x0

    .line 617
    invoke-static {v0, v2, v1}, Ll/۟۟;->֫(FFF)F

    move-result v0

    .line 618
    invoke-direct {p0, p2, v0}, Ll/۟۟;->֫(FF)F

    move-result v1

    sub-float/2addr p3, p2

    .line 619
    invoke-direct {p0, p3, v0}, Ll/۟۟;->֫(FF)F

    move-result p2

    sub-float/2addr p2, v1

    .line 622
    iget-object p3, p0, Ll/۟۟;->ۙ:Landroid/view/animation/AccelerateInterpolator;

    cmpg-float v0, p2, v2

    if-gez v0, :cond_0

    neg-float p2, p2

    .line 623
    invoke-virtual {p3, p2}, Landroid/view/animation/AccelerateInterpolator;->getInterpolation(F)F

    move-result p2

    neg-float p2, p2

    goto :goto_0

    :cond_0
    cmpl-float v0, p2, v2

    if-lez v0, :cond_1

    .line 625
    invoke-virtual {p3, p2}, Landroid/view/animation/AccelerateInterpolator;->getInterpolation(F)F

    move-result p2

    :goto_0
    const/high16 p3, -0x40800000    # -1.0f

    const/high16 v0, 0x3f800000    # 1.0f

    .line 630
    invoke-static {p2, p3, v0}, Ll/۟۟;->֫(FFF)F

    move-result p2

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    cmpl-float p3, p2, v2

    if-nez p3, :cond_2

    return v2

    .line 557
    :cond_2
    iget-object v0, p0, Ll/۟۟;->۟:[F

    aget v0, v0, p1

    .line 558
    iget-object v1, p0, Ll/۟۟;->ۛ:[F

    aget v1, v1, p1

    .line 559
    iget-object v2, p0, Ll/۟۟;->ۤ:[F

    aget p1, v2, p1

    mul-float v0, v0, p4

    if-lez p3, :cond_3

    mul-float p2, p2, v0

    .line 566
    invoke-static {p2, v1, p1}, Ll/۟۟;->֫(FFF)F

    move-result p1

    return p1

    :cond_3
    neg-float p2, p2

    mul-float p2, p2, v0

    .line 568
    invoke-static {p2, v1, p1}, Ll/۟۟;->֫(FFF)F

    move-result p1

    neg-float p1, p1

    return p1
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 8

    .line 466
    iget-boolean v0, p0, Ll/۟۟;->۬:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 470
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    .line 471
    iget-object v2, p0, Ll/۟۟;->ۧ֫:Ll/᩺۟;

    const/4 v3, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v3, :cond_1

    const/4 v4, 0x2

    if-eq v0, v4, :cond_4

    const/4 p1, 0x3

    if-eq v0, p1, :cond_1

    goto/16 :goto_1

    .line 538
    :cond_1
    iget-boolean p1, p0, Ll/۟۟;->᩺:Z

    if-eqz p1, :cond_2

    .line 541
    iput-boolean v1, p0, Ll/۟۟;->᩶:Z

    return v1

    .line 543
    :cond_2
    invoke-virtual {v2}, Ll/᩺۟;->ܳ()V

    return v1

    .line 473
    :cond_3
    iput-boolean v3, p0, Ll/۟۟;->ۨ:Z

    .line 474
    iput-boolean v1, p0, Ll/۟۟;->᩹:Z

    .line 478
    :cond_4
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    iget-object v5, p0, Ll/۟۟;->ܽ֫:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    move-result v6

    int-to-float v6, v6

    .line 477
    invoke-direct {p0, v1, v0, v4, v6}, Ll/۟۟;->֫(IFFF)F

    move-result v0

    .line 480
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    .line 479
    invoke-direct {p0, v3, p2, p1, v4}, Ll/۟۟;->֫(IFFF)F

    move-result p1

    .line 481
    invoke-virtual {v2, v0, p1}, Ll/᩺۟;->֫(FF)V

    .line 485
    iget-boolean p1, p0, Ll/۟۟;->᩶:Z

    if-nez p1, :cond_8

    .line 503
    invoke-virtual {v2}, Ll/᩺۟;->ᩳ()I

    move-result p1

    .line 504
    invoke-virtual {v2}, Ll/᩺۟;->ܽ()V

    if-eqz p1, :cond_8

    .line 506
    invoke-virtual {p0, p1}, Ll/۟۟;->֫(I)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_1

    .line 514
    :cond_5
    iget-object p1, p0, Ll/۟۟;->֫֫:Ljava/lang/Runnable;

    if-nez p1, :cond_6

    .line 515
    new-instance p1, Ll/ܰ۟;

    invoke-direct {p1, p0}, Ll/ܰ۟;-><init>(Ll/۟۟;)V

    iput-object p1, p0, Ll/۟۟;->֫֫:Ljava/lang/Runnable;

    .line 518
    :cond_6
    iput-boolean v3, p0, Ll/۟۟;->᩶:Z

    .line 519
    iput-boolean v3, p0, Ll/۟۟;->᩺:Z

    .line 521
    iget-boolean p1, p0, Ll/۟۟;->᩹:Z

    if-nez p1, :cond_7

    iget p1, p0, Ll/۟۟;->᩸:I

    if-lez p1, :cond_7

    .line 522
    iget-object p2, p0, Ll/۟۟;->֫֫:Ljava/lang/Runnable;

    int-to-long v6, p1

    sget p1, Ll/ܿ᩺;->֫:I

    .line 1380
    invoke-virtual {v5, p2, v6, v7}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    goto :goto_0

    .line 524
    :cond_7
    iget-object p1, p0, Ll/۟۟;->֫֫:Ljava/lang/Runnable;

    check-cast p1, Ll/ܰ۟;

    invoke-virtual {p1}, Ll/ܰ۟;->run()V

    .line 529
    :goto_0
    iput-boolean v3, p0, Ll/۟۟;->᩹:Z

    :cond_8
    :goto_1
    return v1
.end method

.method public final ֫(Z)V
    .locals 1

    .line 236
    iget-boolean v0, p0, Ll/۟۟;->۬:Z

    if-eqz v0, :cond_1

    if-nez p1, :cond_1

    .line 538
    iget-boolean v0, p0, Ll/۟۟;->᩺:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 541
    iput-boolean v0, p0, Ll/۟۟;->᩶:Z

    goto :goto_0

    .line 543
    :cond_0
    iget-object v0, p0, Ll/۟۟;->ۧ֫:Ll/᩺۟;

    invoke-virtual {v0}, Ll/᩺۟;->ܳ()V

    .line 240
    :cond_1
    :goto_0
    iput-boolean p1, p0, Ll/۟۟;->۬:Z

    return-void
.end method

.method public abstract ֫(I)Z
.end method

.method public abstract ۧ(I)V
.end method
