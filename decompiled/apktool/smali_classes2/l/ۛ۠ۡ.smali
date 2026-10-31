.class public final Ll/ۛ۠ۡ;
.super Ljava/lang/Object;
.source "86WH"


# instance fields
.field public ֡:J

.field public ֨:F

.field public ֫:Z

.field public ۖ:Z

.field public final ۗ:Landroid/view/GestureDetector;

.field public final ۘ:Ll/ۙ۠ۡ;

.field public final ۙ:[F

.field public ۚ:F

.field public ۛ:Z

.field public final ۜ:Ll/۠ۚۢ;

.field public ۠:F

.field public final ۡ:F

.field public final ۢ:[F

.field public final ۤ:F

.field public ۧ:J

.field public final ۫:[F

.field public final ۬:Landroid/view/TextureView;

.field public final ܳ:[F

.field public ܶ:[F

.field public ܺ:Z

.field public final ܽ:Ljava/lang/Runnable;

.field public ܿ:Z

.field public ᩳ:Z

.field public final ᩴ:Ll/֫ܶۡ;

.field public final ᩵:Ljava/lang/Runnable;

.field public ᩶:Landroid/animation/ValueAnimator;

.field public ᩷:Z

.field public ᩸:J

.field public ᩹:I

.field public ᩻:J


# direct methods
.method public constructor <init>(Landroid/view/TextureView;Ll/۠ۚۢ;)V
    .locals 3

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x10

    new-array v1, v0, [F

    .line 21
    iput-object v1, p0, Ll/ۛ۠ۡ;->ۙ:[F

    new-array v2, v0, [F

    .line 22
    iput-object v2, p0, Ll/ۛ۠ۡ;->ۢ:[F

    new-array v2, v0, [F

    iput-object v2, p0, Ll/ۛ۠ۡ;->۫:[F

    new-array v0, v0, [F

    .line 23
    iput-object v0, p0, Ll/ۛ۠ۡ;->ܳ:[F

    .line 27
    new-instance v0, Ll/֫ܶۡ;

    .line 4
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object v0, p0, Ll/ۛ۠ۡ;->ᩴ:Ll/֫ܶۡ;

    const/4 v0, -0x1

    .line 32
    iput v0, p0, Ll/ۛ۠ۡ;->᩹:I

    .line 42
    new-instance v0, Ll/ۙ۠ۡ;

    invoke-direct {v0, p0}, Ll/ۙ۠ۡ;-><init>(Ll/ۛ۠ۡ;)V

    iput-object v0, p0, Ll/ۛ۠ۡ;->ۘ:Ll/ۙ۠ۡ;

    .line 43
    new-instance v0, Ll/ۗ۠ۡ;

    invoke-direct {v0, p0}, Ll/ۗ۠ۡ;-><init>(Ll/ۛ۠ۡ;)V

    iput-object v0, p0, Ll/ۛ۠ۡ;->ܽ:Ljava/lang/Runnable;

    .line 73
    new-instance v0, Ll/۬۠ۡ;

    invoke-direct {v0, p0}, Ll/۬۠ۡ;-><init>(Ll/ۛ۠ۡ;)V

    iput-object v0, p0, Ll/ۛ۠ۡ;->᩵:Ljava/lang/Runnable;

    .line 87
    iput-object p1, p0, Ll/ۛ۠ۡ;->۬:Landroid/view/TextureView;

    .line 88
    iput-object p2, p0, Ll/ۛ۠ۡ;->ۜ:Ll/۠ۚۢ;

    .line 89
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    iput p2, p0, Ll/ۛ۠ۡ;->ۡ:F

    .line 90
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p2

    int-to-float p2, p2

    iput p2, p0, Ll/ۛ۠ۡ;->ۤ:F

    const/4 p2, 0x0

    .line 91
    invoke-static {v1, p2}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    .line 92
    new-instance v0, Landroid/view/GestureDetector;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v1, Ll/۫۠ۡ;

    invoke-direct {v1, p0}, Ll/۫۠ۡ;-><init>(Ll/ۛ۠ۡ;)V

    invoke-direct {v0, p1, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Ll/ۛ۠ۡ;->ۗ:Landroid/view/GestureDetector;

    .line 104
    invoke-virtual {v0, p2}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V

    return-void
.end method

.method public static bridge synthetic ֡(Ll/ۛ۠ۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۛ۠ۡ;->ܽ()V

    return-void
.end method

.method public static bridge synthetic ֨(Ll/ۛ۠ۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۛ۠ۡ;->ܳ()V

    return-void
.end method

.method private ֫(FF)V
    .locals 14

    move-object v0, p0

    move v4, p1

    float-to-double v1, v4

    move/from16 v5, p2

    float-to-double v6, v5

    .line 270
    invoke-static {v1, v2, v6, v7}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v1

    double-to-float v3, v1

    const/4 v1, 0x0

    cmpl-float v1, v3, v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v7, 0x0

    const/4 v6, 0x0

    .line 273
    iget-object v10, v0, Ll/ۛ۠ۡ;->ۢ:[F

    move-object v1, v10

    move v2, v7

    move v4, p1

    move/from16 v5, p2

    invoke-static/range {v1 .. v6}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V

    const/4 v11, 0x0

    const/4 v13, 0x0

    .line 274
    iget-object v1, v0, Ll/ۛ۠ۡ;->۫:[F

    const/4 v9, 0x0

    iget-object v2, v0, Ll/ۛ۠ۡ;->ۙ:[F

    move-object v8, v1

    move-object v12, v2

    invoke-static/range {v8 .. v13}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    const/16 v3, 0x10

    .line 275
    invoke-static {v1, v7, v2, v7, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 276
    iget-object v1, v0, Ll/ۛ۠ۡ;->ۜ:Ll/۠ۚۢ;

    invoke-virtual {v1}, Ll/۠ۚۢ;->run()V

    return-void
.end method

.method public static synthetic ֫(Ll/ۛ۠ۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۛ۠ۡ;->ᩳ()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۛ۠ۡ;FF)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Ll/ۛ۠ۡ;->֫(FF)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۛ۠ۡ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ۛ۠ۡ;->ۧ:J

    return-void
.end method

.method public static ֫(Ll/ۛ۠ۡ;[F[FLl/۟۠ۡ;FLandroid/animation/ValueAnimator;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    .line 243
    iget-object v7, v0, Ll/ۛ۠ۡ;->۫:[F

    iget-object v8, v0, Ll/ۛ۠ۡ;->ۢ:[F

    iget-object v9, v0, Ll/ۛ۠ۡ;->ۙ:[F

    invoke-virtual/range {p5 .. p5}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v10

    const/16 v11, 0x10

    const/4 v12, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v3, v10, v2

    if-ltz v3, :cond_0

    move-object/from16 v3, p1

    .line 244
    invoke-static {v3, v12, v9, v12, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto/16 :goto_0

    :cond_0
    move-object/from16 v3, p1

    .line 37
    invoke-static {v2, v10}, Ljava/lang/Math;->min(FF)F

    move-result v4

    const/4 v13, 0x0

    invoke-static {v13, v4}, Ljava/lang/Math;->max(FF)F

    move-result v4

    .line 38
    iget v5, v1, Ll/۟۠ۡ;->֫:F

    mul-float v6, v4, v4

    const/high16 v14, 0x40000000    # 2.0f

    mul-float v4, v4, v14

    const/high16 v14, 0x40400000    # 3.0f

    sub-float/2addr v14, v4

    mul-float v14, v14, v6

    sub-float/2addr v2, v14

    mul-float v16, v2, v5

    .line 246
    iget v2, v1, Ll/۟۠ۡ;->ۧ:F

    iget v4, v1, Ll/۟۠ۡ;->ܽ:F

    iget v1, v1, Ll/۟۠ۡ;->ᩳ:F

    const/4 v15, 0x0

    move-object/from16 v14, p2

    move/from16 v17, v2

    move/from16 v18, v4

    move/from16 v19, v1

    invoke-static/range {v14 .. v19}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object v1, v9

    move-object/from16 v5, p2

    .line 247
    invoke-static/range {v1 .. v6}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    cmpl-float v1, p4, v13

    if-eqz v1, :cond_1

    const-wide v1, 0x401921fb54442d18L    # 6.283185307179586

    float-to-double v3, v10

    mul-double v3, v3, v1

    .line 250
    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v3, v1

    const-wide/high16 v1, 0x4000000000000000L    # 2.0

    div-double/2addr v3, v1

    double-to-float v1, v3

    mul-float v3, p4, v1

    const v5, 0x3f12d5e0

    const/4 v6, 0x0

    const/4 v10, 0x0

    const v4, -0x40ae4c0e

    move-object v1, v8

    move v2, v10

    .line 251
    invoke-static/range {v1 .. v6}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object v1, v7

    move-object v3, v8

    move v4, v10

    move-object v5, v9

    .line 252
    invoke-static/range {v1 .. v6}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 253
    invoke-static {v7, v12, v9, v12, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 256
    :cond_1
    :goto_0
    iget-object v0, v0, Ll/ۛ۠ۡ;->ۜ:Ll/۠ۚۢ;

    invoke-virtual {v0}, Ll/۠ۚۢ;->run()V

    return-void
.end method

.method private ֫([FJF)V
    .locals 11

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_1

    const/4 v0, 0x0

    .line 221
    iput-boolean v0, p0, Ll/ۛ۠ۡ;->֫:Z

    .line 222
    invoke-direct {p0}, Ll/ۛ۠ۡ;->ܿ()V

    .line 223
    invoke-direct {p0}, Ll/ۛ۠ۡ;->ܳ()V

    .line 224
    invoke-direct {p0}, Ll/ۛ۠ۡ;->ۧ()V

    .line 225
    iget-object v1, p0, Ll/ۛ۠ۡ;->۬:Landroid/view/TextureView;

    iget-object v2, p0, Ll/ۛ۠ۡ;->ۘ:Ll/ۙ۠ۡ;

    invoke-virtual {v1, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 226
    iget-boolean v1, p0, Ll/ۛ۠ۡ;->ۖ:Z

    if-nez v1, :cond_0

    .line 227
    iput-object p1, p0, Ll/ۛ۠ۡ;->ܶ:[F

    .line 228
    iput-wide p2, p0, Ll/ۛ۠ۡ;->᩸:J

    .line 229
    iput p4, p0, Ll/ۛ۠ۡ;->۠:F

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 232
    iput-object v1, p0, Ll/ۛ۠ۡ;->ܶ:[F

    const/4 v1, 0x0

    .line 233
    iput v1, p0, Ll/ۛ۠ۡ;->۠:F

    const/16 v1, 0x10

    new-array v4, v1, [F

    new-array v8, v1, [F

    .line 236
    invoke-static {v4, v0, p1, v0}, Landroid/opengl/Matrix;->transposeM([FI[FI)V

    .line 237
    iget-object v6, p0, Ll/ۛ۠ۡ;->ۙ:[F

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v2, v8

    invoke-static/range {v2 .. v7}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 238
    new-instance v9, Ll/۟۠ۡ;

    invoke-direct {v9, v8}, Ll/۟۠ۡ;-><init>([F)V

    const/4 v0, 0x2

    new-array v0, v0, [F

    .line 239
    fill-array-data v0, :array_0

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    iput-object v0, p0, Ll/ۛ۠ۡ;->᩶:Landroid/animation/ValueAnimator;

    .line 240
    invoke-virtual {v0, p2, p3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 241
    iget-object p2, p0, Ll/ۛ۠ۡ;->᩶:Landroid/animation/ValueAnimator;

    new-instance p3, Landroid/view/animation/LinearInterpolator;

    invoke-direct {p3}, Landroid/view/animation/LinearInterpolator;-><init>()V

    invoke-virtual {p2, p3}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 242
    iget-object p2, p0, Ll/ۛ۠ۡ;->᩶:Landroid/animation/ValueAnimator;

    new-instance p3, Ll/᩶۠ۡ;

    move-object v5, p3

    move-object v6, p0

    move-object v7, p1

    move v10, p4

    invoke-direct/range {v5 .. v10}, Ll/᩶۠ۡ;-><init>(Ll/ۛ۠ۡ;[F[FLl/۟۠ۡ;F)V

    invoke-virtual {p2, p3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 258
    iget-object p1, p0, Ll/ۛ۠ۡ;->᩶:Landroid/animation/ValueAnimator;

    new-instance p2, Ll/ۤ۠ۡ;

    invoke-direct {p2, p0}, Ll/ۤ۠ۡ;-><init>(Ll/ۛ۠ۡ;)V

    invoke-virtual {p1, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 266
    iget-object p1, p0, Ll/ۛ۠ۡ;->᩶:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    return-void

    .line 220
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Negative rotation duration"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private ֫()Z
    .locals 1

    .line 296
    iget-boolean v0, p0, Ll/ۛ۠ۡ;->ۖ:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۛ۠ۡ;->ۛ:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/ۛ۠ۡ;->᩷:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۛ۠ۡ;->᩶:Landroid/animation/ValueAnimator;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/ۛ۠ۡ;->ܿ:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/ۛ۠ۡ;->֫:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static bridge synthetic ۖ(Ll/ۛ۠ۡ;)Landroid/view/View;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ۠ۡ;->۬:Landroid/view/TextureView;

    return-object p0
.end method

.method public static bridge synthetic ۘ(Ll/ۛ۠ۡ;)[F
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ۠ۡ;->۫:[F

    return-object p0
.end method

.method public static bridge synthetic ۚ(Ll/ۛ۠ۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۛ۠ۡ;->ܿ()V

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ۛ۠ۡ;)[F
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ۠ۡ;->ۢ:[F

    return-object p0
.end method

.method public static bridge synthetic ۡ(Ll/ۛ۠ۡ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۛ۠ۡ;->֡:J

    return-wide v0
.end method

.method public static bridge synthetic ۢ(Ll/ۛ۠ۡ;)Ll/֫ܶۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ۠ۡ;->ᩴ:Ll/֫ܶۡ;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۛ۠ۡ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۛ۠ۡ;->ۧ:J

    return-wide v0
.end method

.method private ۧ()V
    .locals 2

    .line 288
    iget-object v0, p0, Ll/ۛ۠ۡ;->᩶:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 290
    iput-object v1, p0, Ll/ۛ۠ۡ;->᩶:Landroid/animation/ValueAnimator;

    .line 291
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۛ۠ۡ;J)V
    .locals 0

    .line 0
    iput-wide p1, p0, Ll/ۛ۠ۡ;->֡:J

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ۛ۠ۡ;)Ljava/lang/Runnable;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ۠ۡ;->ۜ:Ll/۠ۚۢ;

    return-object p0
.end method

.method private ܳ()V
    .locals 2

    const/4 v0, 0x0

    .line 280
    iput-boolean v0, p0, Ll/ۛ۠ۡ;->᩷:Z

    .line 281
    iget-object v0, p0, Ll/ۛ۠ۡ;->۬:Landroid/view/TextureView;

    iget-object v1, p0, Ll/ۛ۠ۡ;->᩵:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 282
    iget-object v0, p0, Ll/ۛ۠ۡ;->ᩴ:Ll/֫ܶۡ;

    invoke-virtual {v0}, Ll/֫ܶۡ;->ۧ()V

    const-wide/16 v0, 0x0

    .line 283
    iput-wide v0, p0, Ll/ۛ۠ۡ;->֡:J

    .line 284
    invoke-direct {p0}, Ll/ۛ۠ۡ;->ܽ()V

    return-void
.end method

.method public static bridge synthetic ܺ(Ll/ۛ۠ۡ;)Landroid/animation/ValueAnimator;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ۠ۡ;->᩶:Landroid/animation/ValueAnimator;

    return-object p0
.end method

.method private ܽ()V
    .locals 4

    .line 301
    iget-object v0, p0, Ll/ۛ۠ۡ;->۬:Landroid/view/TextureView;

    iget-object v1, p0, Ll/ۛ۠ۡ;->ۘ:Ll/ۙ۠ۡ;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 302
    invoke-direct {p0}, Ll/ۛ۠ۡ;->֫()Z

    move-result v2

    if-eqz v2, :cond_0

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ۛ۠ۡ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۛ۠ۡ;->ܿ:Z

    return p0
.end method

.method public static bridge synthetic ܿ(Ll/ۛ۠ۡ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۛ۠ۡ;->᩻:J

    return-wide v0
.end method

.method private ܿ()V
    .locals 2

    const/4 v0, 0x0

    .line 319
    iput-boolean v0, p0, Ll/ۛ۠ۡ;->ܿ:Z

    .line 320
    iput-boolean v0, p0, Ll/ۛ۠ۡ;->ᩳ:Z

    .line 321
    iget-object v0, p0, Ll/ۛ۠ۡ;->ۘ:Ll/ۙ۠ۡ;

    iget-object v1, p0, Ll/ۛ۠ۡ;->۬:Landroid/view/TextureView;

    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 322
    iget-object v0, p0, Ll/ۛ۠ۡ;->ܽ:Ljava/lang/Runnable;

    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private ᩳ()V
    .locals 4

    .line 306
    invoke-direct {p0}, Ll/ۛ۠ۡ;->֫()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 308
    :cond_0
    iget-boolean v0, p0, Ll/ۛ۠ۡ;->ᩳ:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 309
    iget-object v0, p0, Ll/ۛ۠ۡ;->ܳ:[F

    const/16 v2, 0x10

    iget-object v3, p0, Ll/ۛ۠ۡ;->ۙ:[F

    invoke-static {v3, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const-wide/16 v2, 0x0

    .line 310
    iput-wide v2, p0, Ll/ۛ۠ۡ;->ۧ:J

    .line 312
    :cond_1
    iput-boolean v1, p0, Ll/ۛ۠ۡ;->ᩳ:Z

    .line 313
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-wide v2, p0, Ll/ۛ۠ۡ;->ۧ:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۛ۠ۡ;->᩻:J

    const/4 v0, 0x1

    .line 314
    iput-boolean v0, p0, Ll/ۛ۠ۡ;->ܿ:Z

    .line 315
    iget-object v0, p0, Ll/ۛ۠ۡ;->۬:Landroid/view/TextureView;

    iget-object v1, p0, Ll/ۛ۠ۡ;->ܽ:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/ۛ۠ۡ;)[F
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ۠ۡ;->ܳ:[F

    return-object p0
.end method

.method public static bridge synthetic ᩴ(Ll/ۛ۠ۡ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ۛ۠ۡ;->֫:Z

    return-void
.end method

.method public static bridge synthetic ᩵(Ll/ۛ۠ۡ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-object v0, p0, Ll/ۛ۠ۡ;->᩶:Landroid/animation/ValueAnimator;

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ۛ۠ۡ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۛ۠ۡ;->ۖ:Z

    return p0
.end method

.method public static bridge synthetic ᩻(Ll/ۛ۠ۡ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۛ۠ۡ;->᩷:Z

    return p0
.end method


# virtual methods
.method public final ֫(JZ)V
    .locals 7

    const/16 v0, 0x10

    new-array v0, v0, [F

    if-eqz p3, :cond_0

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/high16 v3, 0x43340000    # 180.0f

    const/4 v4, 0x0

    move-object v1, v0

    .line 203
    invoke-static/range {v1 .. v6}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    .line 204
    invoke-static {v0, p3}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    :goto_0
    const/4 p3, 0x0

    .line 216
    invoke-direct {p0, v0, p1, p2, p3}, Ll/ۛ۠ۡ;->֫([FJF)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 3

    const/16 v0, 0x10

    new-array v0, v0, [F

    const/4 v1, 0x0

    .line 210
    invoke-static {v0, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    if-eqz p1, :cond_0

    const/high16 p1, -0x3dcc0000    # -45.0f

    goto :goto_0

    :cond_0
    const/high16 p1, 0x42340000    # 45.0f

    :goto_0
    const-wide/16 v1, 0x258

    .line 211
    invoke-direct {p0, v0, v1, v2, p1}, Ll/ۛ۠ۡ;->֫([FJF)V

    return-void
.end method

.method public final ֫(Landroid/view/MotionEvent;)Z
    .locals 11

    .line 136
    iget-boolean v0, p0, Ll/ۛ۠ۡ;->ۖ:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 137
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    .line 138
    iget-object v2, p0, Ll/ۛ۠ۡ;->۬:Landroid/view/TextureView;

    const/4 v3, -0x1

    const/4 v4, 0x1

    if-nez v0, :cond_1

    .line 139
    iput-boolean v4, p0, Ll/ۛ۠ۡ;->ۛ:Z

    .line 140
    iput-boolean v1, p0, Ll/ۛ۠ۡ;->֫:Z

    .line 141
    invoke-direct {p0}, Ll/ۛ۠ۡ;->ܿ()V

    .line 142
    invoke-direct {p0}, Ll/ۛ۠ۡ;->ܳ()V

    .line 143
    invoke-direct {p0}, Ll/ۛ۠ۡ;->ۧ()V

    .line 144
    iput v3, p0, Ll/ۛ۠ۡ;->᩹:I

    .line 145
    iput-boolean v1, p0, Ll/ۛ۠ۡ;->ܺ:Z

    .line 326
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    invoke-interface {v5, v4}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 148
    :cond_1
    iget-object v5, p0, Ll/ۛ۠ۡ;->ۗ:Landroid/view/GestureDetector;

    invoke-virtual {v5, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    const/4 v5, 0x3

    if-eq v0, v4, :cond_6

    if-ne v0, v5, :cond_2

    goto :goto_0

    .line 163
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v5

    if-eq v5, v4, :cond_3

    .line 164
    iput v3, p0, Ll/ۛ۠ۡ;->᩹:I

    .line 165
    iput-boolean v1, p0, Ll/ۛ۠ۡ;->ܺ:Z

    .line 166
    invoke-direct {p0}, Ll/ۛ۠ۡ;->ܳ()V

    .line 167
    invoke-direct {p0}, Ll/ۛ۠ۡ;->ۧ()V

    return v4

    .line 170
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    .line 171
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    .line 172
    iget v0, p0, Ll/ۛ۠ۡ;->᩹:I

    if-ne v0, p1, :cond_5

    .line 173
    iget v0, p0, Ll/ۛ۠ۡ;->ۚ:F

    sub-float v0, v3, v0

    iget v1, p0, Ll/ۛ۠ۡ;->֨:F

    sub-float v1, v5, v1

    .line 174
    iget-boolean v6, p0, Ll/ۛ۠ۡ;->ܺ:Z

    if-nez v6, :cond_4

    float-to-double v6, v0

    float-to-double v8, v1

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v6

    iget v8, p0, Ll/ۛ۠ۡ;->ۤ:F

    float-to-double v8, v8

    cmpg-double v10, v6, v8

    if-gtz v10, :cond_4

    return v4

    .line 175
    :cond_4
    iput-boolean v4, p0, Ll/ۛ۠ۡ;->ܺ:Z

    .line 176
    invoke-direct {p0}, Ll/ۛ۠ۡ;->ۧ()V

    .line 177
    iget v6, p0, Ll/ۛ۠ۡ;->ۡ:F

    div-float/2addr v1, v6

    const/high16 v7, 0x3f400000    # 0.75f

    mul-float v1, v1, v7

    div-float/2addr v0, v6

    mul-float v0, v0, v7

    .line 179
    invoke-direct {p0, v1, v0}, Ll/ۛ۠ۡ;->֫(FF)V

    .line 180
    iget-object v6, p0, Ll/ۛ۠ۡ;->ᩴ:Ll/֫ܶۡ;

    invoke-virtual {v6, v1, v0}, Ll/֫ܶۡ;->֫(FF)V

    .line 181
    iget-boolean v0, p0, Ll/ۛ۠ۡ;->᩷:Z

    if-nez v0, :cond_5

    .line 182
    iput-boolean v4, p0, Ll/ۛ۠ۡ;->᩷:Z

    const-wide/16 v0, 0x0

    .line 183
    iput-wide v0, p0, Ll/ۛ۠ۡ;->֡:J

    .line 184
    iget-object v0, p0, Ll/ۛ۠ۡ;->᩵:Ljava/lang/Runnable;

    invoke-virtual {v2, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 187
    :cond_5
    iput p1, p0, Ll/ۛ۠ۡ;->᩹:I

    .line 188
    iput v3, p0, Ll/ۛ۠ۡ;->ۚ:F

    .line 189
    iput v5, p0, Ll/ۛ۠ۡ;->֨:F

    return v4

    :cond_6
    :goto_0
    if-ne v0, v5, :cond_7

    .line 151
    invoke-direct {p0}, Ll/ۛ۠ۡ;->ܳ()V

    .line 152
    invoke-direct {p0}, Ll/ۛ۠ۡ;->ۧ()V

    :cond_7
    if-ne v0, v4, :cond_8

    .line 154
    iget-boolean p1, p0, Ll/ۛ۠ۡ;->ܺ:Z

    if-nez p1, :cond_8

    invoke-virtual {v2}, Landroid/view/View;->performClick()Z

    .line 155
    :cond_8
    iput v3, p0, Ll/ۛ۠ۡ;->᩹:I

    .line 156
    iput-boolean v1, p0, Ll/ۛ۠ۡ;->ܺ:Z

    .line 157
    iput-boolean v1, p0, Ll/ۛ۠ۡ;->ۛ:Z

    .line 326
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_9

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-interface {p1, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 159
    :cond_9
    invoke-direct {p0}, Ll/ۛ۠ۡ;->ܽ()V

    return v4
.end method

.method public final ۧ(Z)V
    .locals 9

    .line 108
    iget-boolean v0, p0, Ll/ۛ۠ۡ;->ۖ:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 109
    :cond_0
    iput-boolean p1, p0, Ll/ۛ۠ۡ;->ۖ:Z

    if-nez p1, :cond_2

    .line 111
    iget-boolean p1, p0, Ll/ۛ۠ۡ;->ܿ:Z

    .line 112
    invoke-direct {p0}, Ll/ۛ۠ۡ;->ܿ()V

    .line 114
    iput-boolean p1, p0, Ll/ۛ۠ۡ;->ᩳ:Z

    .line 115
    invoke-direct {p0}, Ll/ۛ۠ۡ;->ܳ()V

    .line 116
    invoke-direct {p0}, Ll/ۛ۠ۡ;->ۧ()V

    const/4 p1, -0x1

    .line 117
    iput p1, p0, Ll/ۛ۠ۡ;->᩹:I

    const/4 p1, 0x0

    .line 118
    iput-boolean p1, p0, Ll/ۛ۠ۡ;->ܺ:Z

    .line 119
    iput-boolean p1, p0, Ll/ۛ۠ۡ;->ۛ:Z

    .line 326
    iget-object v0, p0, Ll/ۛ۠ۡ;->۬:Landroid/view/TextureView;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 122
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-wide v1, v3

    .line 123
    invoke-static/range {v1 .. v8}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object p1

    .line 124
    iget-object v0, p0, Ll/ۛ۠ۡ;->ۗ:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 125
    invoke-virtual {p1}, Landroid/view/MotionEvent;->recycle()V

    return-void

    .line 126
    :cond_2
    iget-object p1, p0, Ll/ۛ۠ۡ;->ܶ:[F

    if-eqz p1, :cond_3

    .line 127
    iget-wide v0, p0, Ll/ۛ۠ۡ;->᩸:J

    iget v2, p0, Ll/ۛ۠ۡ;->۠:F

    invoke-direct {p0, p1, v0, v1, v2}, Ll/ۛ۠ۡ;->֫([FJF)V

    return-void

    .line 128
    :cond_3
    iget-boolean p1, p0, Ll/ۛ۠ۡ;->ᩳ:Z

    if-eqz p1, :cond_4

    .line 129
    invoke-direct {p0}, Ll/ۛ۠ۡ;->ᩳ()V

    return-void

    .line 131
    :cond_4
    invoke-direct {p0}, Ll/ۛ۠ۡ;->ܽ()V

    return-void
.end method
