.class public final Ll/ۡۤۜ;
.super Ljava/lang/Object;
.source "D8GL"

# interfaces
.implements Landroid/view/GestureDetector$OnGestureListener;
.implements Landroid/view/GestureDetector$OnDoubleTapListener;


# instance fields
.field public ֫֫:J

.field public ۗ:Landroid/animation/AnimatorSet;

.field public ۙ:F

.field public ۛ:J

.field public ۟:F

.field public final ۤ:Ljava/util/Formatter;

.field public ۧ֫:I

.field public ۨ:I

.field public final ۫:Ljava/lang/StringBuilder;

.field public ۬:Z

.field public ܰ:I

.field public final synthetic ܽ֫:Ll/ۤۤۜ;

.field public final ᩳ֫:I

.field public ᩶:J

.field public ᩸:Z

.field public final ᩹:Landroid/media/AudioManager;

.field public ᩺:F


# direct methods
.method public constructor <init>(Ll/ۤۤۜ;)V
    .locals 2

    .line 5082
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡۤۜ;->ܽ֫:Ll/ۤۤۜ;

    const-string v0, "audio"

    .line 5088
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    iput-object p1, p0, Ll/ۡۤۜ;->᩹:Landroid/media/AudioManager;

    const/high16 p1, 0x43160000    # 150.0f

    .line 5089
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    iput p1, p0, Ll/ۡۤۜ;->ᩳ֫:I

    const/4 p1, -0x1

    .line 5091
    iput p1, p0, Ll/ۡۤۜ;->ܰ:I

    .line 5103
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Ll/ۡۤۜ;->۫:Ljava/lang/StringBuilder;

    .line 5104
    new-instance v0, Ljava/util/Formatter;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    iput-object v0, p0, Ll/ۡۤۜ;->ۤ:Ljava/util/Formatter;

    return-void
.end method

.method private ֫(I)Landroid/animation/ObjectAnimator;
    .locals 3

    .line 5359
    iget-object v0, p0, Ll/ۡۤۜ;->ܽ֫:Ll/ۤۤۜ;

    invoke-static {v0}, Ll/ۤۤۜ;->֨(Ll/ۤۤۜ;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x6

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    const-string v2, "alpha"

    invoke-static {v0, v2, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    int-to-float p1, p1

    const v1, 0x3dcccccd    # 0.1f

    mul-float p1, p1, v1

    const v1, 0x3f666666    # 0.9f

    sub-float/2addr v1, p1

    .line 5361
    new-instance p1, Ll/ۢۤۜ;

    invoke-direct {p1, v1}, Ll/ۢۤۜ;-><init>(F)V

    invoke-virtual {v0, p1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const/4 p1, -0x1

    .line 5365
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    const/4 p1, 0x1

    .line 5366
    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    return-object v0

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f000000    # 0.5f
        0x3e4ccccd    # 0.2f
        0x3e4ccccd    # 0.2f
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private ֫(J)V
    .locals 8

    .line 5191
    iget-object v0, p0, Ll/ۡۤۜ;->ܽ֫:Ll/ۤۤۜ;

    invoke-static {v0}, Ll/ۤۤۜ;->ۧ֫(Ll/ۤۤۜ;)Landroid/widget/TextView;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-static {v0}, Ll/ۤۤۜ;->֫֫(Ll/ۤۤۜ;)Landroid/widget/ProgressBar;

    move-result-object v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    .line 5194
    :cond_0
    iget-object v1, p0, Ll/ۡۤۜ;->۫:Ljava/lang/StringBuilder;

    iget-object v2, p0, Ll/ۡۤۜ;->ۤ:Ljava/util/Formatter;

    invoke-static {v1, v2, p1, p2}, Ll/ۘ֨֫;->֫(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object v3

    .line 5195
    iget-wide v4, p0, Ll/ۡۤۜ;->ۛ:J

    invoke-static {v1, v2, v4, v5}, Ll/ۘ֨֫;->֫(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object v4

    .line 5196
    iget-wide v5, p0, Ll/ۡۤۜ;->֫֫:J

    sub-long v5, p1, v5

    invoke-static {v1, v2, v5, v6}, Ll/ۘ֨֫;->֫(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object v1

    .line 5197
    new-instance v2, Landroid/text/SpannableStringBuilder;

    invoke-direct {v2}, Landroid/text/SpannableStringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    const/16 v5, 0x2f

    invoke-virtual {v2, v5}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    const/16 v4, 0xa

    invoke-virtual {v2, v4}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    move-result-object v2

    .line 5198
    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v4

    const/16 v5, 0x5b

    .line 5199
    invoke-virtual {v2, v5}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    const-string v5, "-00:00"

    .line 5200
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const-string v6, "00:00"

    const/4 v7, 0x0

    if-nez v5, :cond_3

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_0

    .line 5203
    :cond_1
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x2d

    if-eq v5, v6, :cond_2

    const/16 v5, 0x2b

    .line 5204
    invoke-virtual {v2, v5}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 5206
    :cond_2
    invoke-virtual {v2, v1}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    goto :goto_1

    .line 5201
    :cond_3
    :goto_0
    invoke-virtual {v2, v6}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    :goto_1
    const/16 v1, 0x5d

    .line 5208
    invoke-virtual {v2, v1}, Landroid/text/SpannableStringBuilder;->append(C)Landroid/text/SpannableStringBuilder;

    .line 5209
    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    const v5, -0x555556

    invoke-direct {v1, v5}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v6, 0x11

    invoke-virtual {v2, v1, v7, v3, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 5210
    new-instance v1, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v1, v5}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v2}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v3

    invoke-virtual {v2, v1, v4, v3, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 5211
    invoke-static {v0}, Ll/ۤۤۜ;->ۧ֫(Ll/ۤۤۜ;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5212
    invoke-static {v0}, Ll/ۤۤۜ;->֫֫(Ll/ۤۤۜ;)Landroid/widget/ProgressBar;

    move-result-object v0

    iget-wide v1, p0, Ll/ۡۤۜ;->ۛ:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_4

    const-wide/16 v3, 0x3e8

    mul-long p1, p1, v3

    div-long/2addr p1, v1

    long-to-int v7, p1

    :cond_4
    invoke-virtual {v0, v7}, Landroid/widget/ProgressBar;->setProgress(I)V

    :cond_5
    :goto_2
    return-void
.end method


# virtual methods
.method public final onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 5118
    iget-object v0, p0, Ll/ۡۤۜ;->ܽ֫:Ll/ۤۤۜ;

    invoke-static {v0}, Ll/ۤۤۜ;->ۖ֫(Ll/ۤۤۜ;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 5119
    invoke-virtual {p0, p1}, Ll/ۡۤۜ;->onSingleTapConfirmed(Landroid/view/MotionEvent;)Z

    return v2

    .line 5121
    :cond_0
    invoke-virtual {v0}, Ll/ۤۤۜ;->ۨ()V

    return v2
.end method

.method public final onDoubleTapEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 2

    const/4 p1, -0x1

    .line 5132
    iput p1, p0, Ll/ۡۤۜ;->ܰ:I

    .line 5133
    iget-object p1, p0, Ll/ۡۤۜ;->ܽ֫:Ll/ۤۤۜ;

    invoke-static {p1}, Ll/ۤۤۜ;->ۚ(Ll/ۤۤۜ;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {p1}, Ll/ۤۤۜ;->ۖ֫(Ll/ۤۤۜ;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Ll/ۡۤۜ;->᩸:Z

    .line 5134
    invoke-static {p1}, Ll/ۤۤۜ;->ۢ֫(Ll/ۤۤۜ;)V

    return v1
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 8

    .line 5335
    iget-object p1, p0, Ll/ۡۤۜ;->ܽ֫:Ll/ۤۤۜ;

    invoke-static {p1}, Ll/ۤۤۜ;->ۖ֫(Ll/ۤۤۜ;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1}, Ll/ۤۤۜ;->ۤ(Ll/ۤۤۜ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_0

    .line 5338
    :cond_0
    invoke-static {p1}, Ll/ۤۤۜ;->ܰ(Ll/ۤۤۜ;)Ll/ۘ᩶֫;

    move-result-object v0

    invoke-interface {v0}, Ll/֨᩵֫;->isPlaying()Z

    move-result v0

    const/4 v1, 0x3

    if-nez v0, :cond_1

    .line 5340
    invoke-static {p1}, Ll/ۤۤۜ;->ܰ(Ll/ۤۤۜ;)Ll/ۘ᩶֫;

    move-result-object v0

    invoke-interface {v0}, Ll/֨᩵֫;->ᩳ()I

    move-result v0

    if-ne v0, v1, :cond_2

    invoke-static {p1}, Ll/ۤۤۜ;->ܰ(Ll/ۤۤۜ;)Ll/ۘ᩶֫;

    move-result-object v0

    invoke-interface {v0}, Ll/֨᩵֫;->᩶()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 5344
    :cond_1
    invoke-static {p1}, Ll/ۤۤۜ;->۟(Ll/ۤۤۜ;)Ll/ᩴ۠ۧ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩴ۠ۧ;->ᩳ()V

    const/4 v0, 0x1

    .line 5345
    iput-boolean v0, p0, Ll/ۡۤۜ;->۬:Z

    .line 5346
    invoke-static {p1}, Ll/ۤۤۜ;->֨(Ll/ۤۤۜ;)Landroid/view/ViewGroup;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 5347
    invoke-static {p1}, Ll/ۤۤۜ;->ܰ(Ll/ۤۤۜ;)Ll/ۘ᩶֫;

    move-result-object v2

    invoke-interface {v2}, Ll/֨᩵֫;->ܽ()Ll/ۖ᩵֫;

    move-result-object v2

    iget v2, v2, Ll/ۖ᩵֫;->ܽ:F

    iput v2, p0, Ll/ۡۤۜ;->᩺:F

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v2, v2, v4

    .line 5348
    invoke-static {v4, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    .line 5349
    invoke-static {p1}, Ll/ۤۤۜ;->֨(Ll/ۤۤۜ;)Landroid/view/ViewGroup;

    move-result-object v4

    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    new-instance v5, Ljava/text/DecimalFormat;

    const-string v6, "0.0##X"

    invoke-direct {v5, v6}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    float-to-double v6, v2

    invoke-virtual {v5, v6, v7}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5350
    invoke-static {p1}, Ll/ۤۤۜ;->ܰ(Ll/ۤۤۜ;)Ll/ۘ᩶֫;

    move-result-object p1

    new-instance v4, Ll/ۖ᩵֫;

    invoke-direct {v4, v2}, Ll/ۖ᩵֫;-><init>(F)V

    invoke-interface {p1, v4}, Ll/֨᩵֫;->֫(Ll/ۖ᩵֫;)V

    .line 5351
    new-instance p1, Landroid/animation/AnimatorSet;

    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 5352
    invoke-direct {p0, v3}, Ll/ۡۤۜ;->֫(I)Landroid/animation/ObjectAnimator;

    move-result-object v2

    invoke-direct {p0, v0}, Ll/ۡۤۜ;->֫(I)Landroid/animation/ObjectAnimator;

    move-result-object v4

    const/4 v5, 0x2

    invoke-direct {p0, v5}, Ll/ۡۤۜ;->֫(I)Landroid/animation/ObjectAnimator;

    move-result-object v6

    new-array v1, v1, [Landroid/animation/Animator;

    aput-object v2, v1, v3

    aput-object v4, v1, v0

    aput-object v6, v1, v5

    invoke-virtual {p1, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    const-wide/16 v0, 0x320

    .line 5353
    invoke-virtual {p1, v0, v1}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 5354
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    .line 5355
    iput-object p1, p0, Ll/ۡۤۜ;->ۗ:Landroid/animation/AnimatorSet;

    :cond_2
    :goto_0
    return-void
.end method

.method public final onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 15

    move-object v0, p0

    .line 5217
    iget-boolean v1, v0, Ll/ۡۤۜ;->᩸:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_1b

    iget-object v1, v0, Ll/ۡۤۜ;->ܽ֫:Ll/ۤۤۜ;

    invoke-static {v1}, Ll/ۤۤۜ;->ۚ(Ll/ۤۤۜ;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_8

    .line 5220
    :cond_0
    iget v3, v0, Ll/ۡۤۜ;->ܰ:I

    const/4 v4, -0x1

    const/4 v5, 0x2

    const/4 v6, 0x3

    iget-object v7, v0, Ll/ۡۤۜ;->᩹:Landroid/media/AudioManager;

    const/4 v8, 0x1

    if-ne v3, v4, :cond_8

    const/4 v3, -0x2

    if-eqz p1, :cond_2

    .line 5221
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-static {v1}, Ll/ۤۤۜ;->۟(Ll/ۤۤۜ;)Ll/ᩴ۠ۧ;

    move-result-object v9

    invoke-virtual {v9}, Landroid/view/View;->getHeight()I

    move-result v9

    int-to-float v9, v9

    const v10, 0x3f666666    # 0.9f

    mul-float v9, v9, v10

    cmpl-float v4, v4, v9

    if-gtz v4, :cond_1

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-static {v1}, Ll/ۤۤۜ;->۟(Ll/ۤۤۜ;)Ll/ᩴ۠ۧ;

    move-result-object v9

    invoke-virtual {v9}, Landroid/view/View;->getHeight()I

    move-result v9

    int-to-float v9, v9

    const v10, 0x3dcccccd    # 0.1f

    mul-float v9, v9, v10

    cmpg-float v4, v4, v9

    if-gez v4, :cond_2

    .line 5223
    :cond_1
    iput v3, v0, Ll/ۡۤۜ;->ܰ:I

    goto/16 :goto_0

    .line 5224
    :cond_2
    invoke-static/range {p3 .. p3}, Ljava/lang/Math;->abs(F)F

    move-result v4

    invoke-static/range {p4 .. p4}, Ljava/lang/Math;->abs(F)F

    move-result v9

    const/16 v10, 0x8

    cmpl-float v4, v4, v9

    if-lez v4, :cond_5

    .line 5225
    invoke-static {v1}, Ll/ۤۤۜ;->ۤ(Ll/ۤۤۜ;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 5226
    iput v3, v0, Ll/ۡۤۜ;->ܰ:I

    return v2

    .line 5229
    :cond_3
    invoke-static {v1}, Ll/ۤۤۜ;->ܰ(Ll/ۤۤۜ;)Ll/ۘ᩶֫;

    move-result-object v4

    invoke-interface {v4}, Ll/֨᩵֫;->getDuration()J

    move-result-wide v11

    iput-wide v11, v0, Ll/ۡۤۜ;->ۛ:J

    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v11, v13

    if-nez v4, :cond_4

    .line 5231
    iput v3, v0, Ll/ۡۤۜ;->ܰ:I

    goto/16 :goto_0

    .line 5233
    :cond_4
    invoke-static {v1}, Ll/ۤۤۜ;->۠(Ll/ۤۤۜ;)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v10}, Landroid/view/View;->setVisibility(I)V

    .line 5234
    iput v2, v0, Ll/ۡۤۜ;->ܰ:I

    .line 5235
    invoke-static {v1}, Ll/ۤۤۜ;->ܰ(Ll/ۤۤۜ;)Ll/ۘ᩶֫;

    move-result-object v3

    invoke-interface {v3}, Ll/֨᩵֫;->getCurrentPosition()J

    move-result-wide v3

    iput-wide v3, v0, Ll/ۡۤۜ;->᩶:J

    iput-wide v3, v0, Ll/ۡۤۜ;->֫֫:J

    .line 5236
    invoke-static {v1}, Ll/ۤۤۜ;->ܶ֫(Ll/ۤۤۜ;)V

    .line 5237
    iget-wide v3, v0, Ll/ۡۤۜ;->᩶:J

    invoke-direct {p0, v3, v4}, Ll/ۡۤۜ;->֫(J)V

    .line 5238
    iget-wide v3, v0, Ll/ۡۤۜ;->᩶:J

    invoke-static {v1, v3, v4, v8, v8}, Ll/ۤۤۜ;->֫(Ll/ۤۤۜ;JZZ)Ll/۟ۗۜ;

    move-result-object v3

    if-nez v3, :cond_8

    .line 5240
    invoke-static {v1}, Ll/ۤۤۜ;->ۙ֫(Ll/ۤۤۜ;)V

    goto :goto_0

    .line 5244
    :cond_5
    invoke-static {v1}, Ll/ۤۤۜ;->ۢ֫(Ll/ۤۤۜ;)V

    .line 5245
    invoke-static {v1}, Ll/ۤۤۜ;->۠(Ll/ۤۤۜ;)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 5246
    invoke-static {v1}, Ll/ۤۤۜ;->᩶(Ll/ۤۤۜ;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v3, v10}, Landroid/view/View;->setVisibility(I)V

    .line 5247
    invoke-static {v1}, Ll/ۤۤۜ;->ܶ(Ll/ۤۤۜ;)Landroid/widget/ImageView;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 5248
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    iput v3, v0, Ll/ۡۤۜ;->ۙ:F

    .line 5249
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-static {v1}, Ll/ۤۤۜ;->۟(Ll/ۤۤۜ;)Ll/ᩴ۠ۧ;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    const/high16 v9, 0x40000000    # 2.0f

    div-float/2addr v4, v9

    cmpg-float v3, v3, v4

    if-gez v3, :cond_7

    .line 5250
    iput v8, v0, Ll/ۡۤۜ;->ܰ:I

    .line 5377
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    iget v3, v3, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    const/high16 v4, -0x40800000    # -1.0f

    cmpl-float v4, v3, v4

    if-nez v4, :cond_6

    .line 5379
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const-string v4, "screen_brightness"

    const/16 v9, 0x7d

    invoke-static {v3, v4, v9}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v3

    int-to-float v3, v3

    const/high16 v4, 0x437f0000    # 255.0f

    div-float/2addr v3, v4

    .line 5251
    :cond_6
    iput v3, v0, Ll/ۡۤۜ;->۟:F

    goto :goto_0

    .line 5253
    :cond_7
    iput v5, v0, Ll/ۡۤۜ;->ܰ:I

    if-eqz v7, :cond_8

    .line 5255
    invoke-virtual {v7, v6}, Landroid/media/AudioManager;->getStreamVolume(I)I

    move-result v3

    iput v3, v0, Ll/ۡۤۜ;->ۧ֫:I

    .line 5256
    invoke-virtual {v7, v6}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    move-result v3

    iput v3, v0, Ll/ۡۤۜ;->ۨ:I

    .line 5261
    :cond_8
    :goto_0
    iget v3, v0, Ll/ۡۤۜ;->ܰ:I

    const/high16 v4, 0x447a0000    # 1000.0f

    if-eqz v3, :cond_17

    const/16 v9, 0x29a

    const/16 v10, 0x14d

    iget v11, v0, Ll/ۡۤۜ;->ᩳ֫:I

    if-eq v3, v8, :cond_10

    if-eq v3, v5, :cond_9

    goto/16 :goto_7

    .line 5306
    :cond_9
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    iget v4, v0, Ll/ۡۤۜ;->ۙ:F

    sub-float/2addr v3, v4

    .line 5307
    iget v4, v0, Ll/ۡۤۜ;->ۧ֫:I

    int-to-float v4, v4

    int-to-float v5, v11

    div-float/2addr v3, v5

    iget v5, v0, Ll/ۡۤۜ;->ۨ:I

    int-to-float v11, v5

    mul-float v3, v3, v11

    sub-float/2addr v4, v3

    float-to-int v3, v4

    if-gez v3, :cond_a

    const/4 v3, 0x0

    goto :goto_1

    :cond_a
    if-le v3, v5, :cond_b

    move v3, v5

    :cond_b
    :goto_1
    mul-int/lit16 v4, v3, 0x3e8

    .line 5313
    div-int/2addr v4, v5

    if-nez v4, :cond_c

    .line 5315
    invoke-static {v1}, Ll/ۤۤۜ;->ܶ(Ll/ۤۤۜ;)Landroid/widget/ImageView;

    move-result-object v5

    const v9, 0x7f0802e3

    invoke-virtual {v5, v9}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    :cond_c
    if-ge v4, v10, :cond_d

    .line 5317
    invoke-static {v1}, Ll/ۤۤۜ;->ܶ(Ll/ۤۤۜ;)Landroid/widget/ImageView;

    move-result-object v5

    const v9, 0x7f0802e4

    invoke-virtual {v5, v9}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    :cond_d
    if-ge v4, v9, :cond_e

    .line 5319
    invoke-static {v1}, Ll/ۤۤۜ;->ܶ(Ll/ۤۤۜ;)Landroid/widget/ImageView;

    move-result-object v5

    const v9, 0x7f0802e5

    invoke-virtual {v5, v9}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_2

    .line 5321
    :cond_e
    invoke-static {v1}, Ll/ۤۤۜ;->ܶ(Ll/ۤۤۜ;)Landroid/widget/ImageView;

    move-result-object v5

    const v9, 0x7f0802e6

    invoke-virtual {v5, v9}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_2
    if-eqz v7, :cond_f

    .line 5324
    invoke-virtual {v7, v6, v3, v2}, Landroid/media/AudioManager;->setStreamVolume(III)V

    .line 5326
    :cond_f
    invoke-static {v1}, Ll/ۤۤۜ;->᩹(Ll/ۤۤۜ;)Landroid/widget/ProgressBar;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/widget/ProgressBar;->setProgress(I)V

    return v8

    .line 5280
    :cond_10
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    iget v3, v0, Ll/ۡۤۜ;->ۙ:F

    sub-float/2addr v2, v3

    .line 5281
    iget v3, v0, Ll/ۡۤۜ;->۟:F

    int-to-float v5, v11

    div-float/2addr v2, v5

    sub-float/2addr v3, v2

    const/4 v2, 0x0

    cmpg-float v2, v3, v2

    if-gez v2, :cond_11

    const/4 v3, 0x0

    goto :goto_3

    :cond_11
    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v2, v3, v2

    if-lez v2, :cond_12

    const/high16 v3, 0x3f800000    # 1.0f

    .line 5287
    :cond_12
    :goto_3
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    .line 5288
    iget v5, v2, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    cmpl-float v5, v5, v3

    if-eqz v5, :cond_13

    .line 5289
    iput v3, v2, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    .line 5290
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v5

    invoke-virtual {v5, v2}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    :cond_13
    mul-float v3, v3, v4

    float-to-int v2, v3

    if-nez v2, :cond_14

    .line 5294
    invoke-static {v1}, Ll/ۤۤۜ;->ܶ(Ll/ۤۤۜ;)Landroid/widget/ImageView;

    move-result-object v3

    const v4, 0x7f08008d

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_4

    :cond_14
    if-ge v2, v10, :cond_15

    .line 5296
    invoke-static {v1}, Ll/ۤۤۜ;->ܶ(Ll/ۤۤۜ;)Landroid/widget/ImageView;

    move-result-object v3

    const v4, 0x7f08008e

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_4

    :cond_15
    if-ge v2, v9, :cond_16

    .line 5298
    invoke-static {v1}, Ll/ۤۤۜ;->ܶ(Ll/ۤۤۜ;)Landroid/widget/ImageView;

    move-result-object v3

    const v4, 0x7f08008f

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_4

    .line 5300
    :cond_16
    invoke-static {v1}, Ll/ۤۤۜ;->ܶ(Ll/ۤۤۜ;)Landroid/widget/ImageView;

    move-result-object v3

    const v4, 0x7f080090

    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 5302
    :goto_4
    invoke-static {v1}, Ll/ۤۤۜ;->᩹(Ll/ۤۤۜ;)Landroid/widget/ProgressBar;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    return v8

    .line 5263
    :cond_17
    iget-wide v5, v0, Ll/ۡۤۜ;->᩶:J

    const/high16 v3, 0x40400000    # 3.0f

    .line 5264
    invoke-static {v3}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v3

    int-to-float v3, v3

    div-float v3, p3, v3

    mul-float v3, v3, v4

    float-to-long v3, v3

    sub-long/2addr v5, v3

    const-wide/16 v3, 0x0

    cmp-long v7, v5, v3

    if-gez v7, :cond_18

    :goto_5
    move-wide v5, v3

    goto :goto_6

    .line 5268
    :cond_18
    iget-wide v3, v0, Ll/ۡۤۜ;->ۛ:J

    cmp-long v7, v5, v3

    if-lez v7, :cond_19

    goto :goto_5

    .line 5271
    :cond_19
    :goto_6
    iput-wide v5, v0, Ll/ۡۤۜ;->᩶:J

    .line 5272
    invoke-direct {p0, v5, v6}, Ll/ۡۤۜ;->֫(J)V

    .line 5273
    invoke-static {v1, v5, v6, v8, v2}, Ll/ۤۤۜ;->֫(Ll/ۤۤۜ;JZZ)Ll/۟ۗۜ;

    move-result-object v2

    if-nez v2, :cond_1a

    .line 5275
    invoke-static {v1}, Ll/ۤۤۜ;->ۙ֫(Ll/ۤۤۜ;)V

    :cond_1a
    :goto_7
    return v8

    :cond_1b
    :goto_8
    return v2
.end method

.method public final onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public final onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 5108
    iget-object p1, p0, Ll/ۡۤۜ;->ܽ֫:Ll/ۤۤۜ;

    invoke-static {p1}, Ll/ۤۤۜ;->۟(Ll/ۤۤۜ;)Ll/ᩴ۠ۧ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩴ۠ۧ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5109
    invoke-static {p1}, Ll/ۤۤۜ;->۟(Ll/ۤۤۜ;)Ll/ᩴ۠ۧ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩴ۠ۧ;->ᩳ()V

    goto :goto_0

    .line 5111
    :cond_0
    invoke-static {p1}, Ll/ۤۤۜ;->۟(Ll/ۤۤۜ;)Ll/ᩴ۠ۧ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩴ۠ۧ;->᩻()V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ֫()V
    .locals 3

    .line 5176
    iget-boolean v0, p0, Ll/ۡۤۜ;->۬:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 5177
    iput-boolean v0, p0, Ll/ۡۤۜ;->۬:Z

    .line 5178
    iget-object v0, p0, Ll/ۡۤۜ;->ܽ֫:Ll/ۤۤۜ;

    invoke-static {v0}, Ll/ۤۤۜ;->֨(Ll/ۤۤۜ;)Landroid/view/ViewGroup;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 5179
    invoke-static {v0}, Ll/ۤۤۜ;->ܰ(Ll/ۤۤۜ;)Ll/ۘ᩶֫;

    move-result-object v0

    new-instance v1, Ll/ۖ᩵֫;

    iget v2, p0, Ll/ۡۤۜ;->᩺:F

    invoke-direct {v1, v2}, Ll/ۖ᩵֫;-><init>(F)V

    invoke-interface {v0, v1}, Ll/֨᩵֫;->֫(Ll/ۖ᩵֫;)V

    .line 5180
    iget-object v0, p0, Ll/ۡۤۜ;->ۗ:Landroid/animation/AnimatorSet;

    if-eqz v0, :cond_0

    .line 5181
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->cancel()V

    const/4 v0, 0x0

    .line 5182
    iput-object v0, p0, Ll/ۡۤۜ;->ۗ:Landroid/animation/AnimatorSet;

    :cond_0
    return-void
.end method
