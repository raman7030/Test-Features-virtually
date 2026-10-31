.class public Ll/֡֫֫;
.super Landroid/widget/FrameLayout;
.source "E6AF"

# interfaces
.implements Ll/֫ۨ;
.implements Ll/᩺ۛ;


# static fields
.field public static final ֡֫:F

.field public static final ۚ֫:[I

.field public static final ᩵֫:Ll/ۡ֫֫;


# instance fields
.field public ֫֫:I

.field public ۖ֫:I

.field public ۗ:Landroid/widget/EdgeEffect;

.field public ۘ֫:Landroid/view/VelocityTracker;

.field public ۙ:Ll/ᩴۛ;

.field public ۛ:Z

.field public final ۜ֫:[I

.field public ۟:I

.field public ۡ֫:Z

.field public ۢ֫:Landroid/widget/OverScroller;

.field public ۤ:Z

.field public ۧ֫:I

.field public ۨ:Z

.field public ۫:Z

.field public ۬:Landroid/widget/EdgeEffect;

.field public ܰ:J

.field public final ܳ֫:F

.field public final ܺ֫:Landroid/graphics/Rect;

.field public ܽ֫:I

.field public final ܿ֫:Ll/ۧۨ;

.field public ᩳ֫:Ll/ۘ֫֫;

.field public ᩴ֫:F

.field public ᩶:Landroid/view/View;

.field public final ᩷֫:[I

.field public ᩸:I

.field public final ᩹:Ll/ܰۛ;

.field public ᩺:I

.field public ᩻֫:Ll/᩵֫֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-wide v0, 0x3fe8f5c28f5c28f6L    # 0.78

    .line 92
    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    const-wide v2, 0x3feccccccccccccdL    # 0.9

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    div-double/2addr v0, v2

    double-to-float v0, v0

    sput v0, Ll/֡֫֫;->֡֫:F

    .line 218
    new-instance v0, Ll/ۡ֫֫;

    .line 2491
    invoke-direct {v0}, Ll/ܽۛ;-><init>()V

    .line 218
    sput-object v0, Ll/֡֫֫;->᩵֫:Ll/ۡ֫֫;

    const v0, 0x101017a

    .line 220
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/֡֫֫;->ۚ֫:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f040388

    .line 244
    invoke-direct {p0, p1, p2, v0}, Ll/֡֫֫;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .line 249
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 126
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/֡֫֫;->ܺ֫:Landroid/graphics/Rect;

    const/4 v0, 0x1

    .line 149
    iput-boolean v0, p0, Ll/֡֫֫;->ۨ:Z

    const/4 v1, 0x0

    .line 150
    iput-boolean v1, p0, Ll/֡֫֫;->ۛ:Z

    const/4 v2, 0x0

    .line 157
    iput-object v2, p0, Ll/֡֫֫;->᩶:Landroid/view/View;

    .line 164
    iput-boolean v1, p0, Ll/֡֫֫;->ۤ:Z

    .line 180
    iput-boolean v0, p0, Ll/֡֫֫;->ۡ֫:Z

    const/4 v2, -0x1

    .line 190
    iput v2, p0, Ll/֡֫֫;->᩸:I

    const/4 v2, 0x2

    new-array v3, v2, [I

    .line 197
    iput-object v3, p0, Ll/֡֫֫;->᩷֫:[I

    new-array v2, v2, [I

    .line 203
    iput-object v2, p0, Ll/֡֫֫;->ۜ֫:[I

    .line 231
    new-instance v2, Ll/ۖ֫֫;

    invoke-direct {v2, p0}, Ll/ۖ֫֫;-><init>(Ll/֡֫֫;)V

    .line 235
    new-instance v3, Ll/ᩴۛ;

    .line 237
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4, v2}, Ll/ᩴۛ;-><init>(Landroid/content/Context;Ll/᩵ۛ;)V

    iput-object v3, p0, Ll/֡֫֫;->ۙ:Ll/ᩴۛ;

    .line 69
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1f

    if-lt v2, v3, :cond_0

    .line 70
    invoke-static {p1, p2}, Ll/ܳ֫֫;->֫(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/EdgeEffect;

    move-result-object v4

    goto :goto_0

    .line 73
    :cond_0
    new-instance v4, Landroid/widget/EdgeEffect;

    invoke-direct {v4, p1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    .line 250
    :goto_0
    iput-object v4, p0, Ll/֡֫֫;->۬:Landroid/widget/EdgeEffect;

    if-lt v2, v3, :cond_1

    .line 70
    invoke-static {p1, p2}, Ll/ܳ֫֫;->֫(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/EdgeEffect;

    move-result-object v2

    goto :goto_1

    .line 73
    :cond_1
    new-instance v2, Landroid/widget/EdgeEffect;

    invoke-direct {v2, p1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    .line 251
    :goto_1
    iput-object v2, p0, Ll/֡֫֫;->ۗ:Landroid/widget/EdgeEffect;

    .line 253
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x43200000    # 160.0f

    mul-float v2, v2, v3

    const v3, 0x43c10b3d

    mul-float v2, v2, v3

    const v3, 0x3f570a3d    # 0.84f

    mul-float v2, v2, v3

    .line 254
    iput v2, p0, Ll/֡֫֫;->ܳ֫:F

    .line 525
    new-instance v2, Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Ll/֡֫֫;->ۢ֫:Landroid/widget/OverScroller;

    .line 526
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    const/high16 v2, 0x40000

    .line 527
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 528
    invoke-virtual {p0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 529
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v2

    .line 530
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v3

    iput v3, p0, Ll/֡֫֫;->ۖ֫:I

    .line 531
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v3

    iput v3, p0, Ll/֡֫֫;->ۧ֫:I

    .line 532
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v2

    iput v2, p0, Ll/֡֫֫;->֫֫:I

    .line 261
    sget-object v2, Ll/֡֫֫;->ۚ֫:[I

    invoke-virtual {p1, p2, v2, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 264
    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    .line 618
    iget-boolean p3, p0, Ll/֡֫֫;->۫:Z

    if-eq p2, p3, :cond_2

    .line 619
    iput-boolean p2, p0, Ll/֡֫֫;->۫:Z

    .line 620
    invoke-virtual {p0}, Ll/֡֫֫;->requestLayout()V

    .line 266
    :cond_2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 268
    new-instance p1, Ll/ۧۨ;

    .line 50
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 268
    iput-object p1, p0, Ll/֡֫֫;->ܿ֫:Ll/ۧۨ;

    .line 269
    new-instance p1, Ll/ܰۛ;

    invoke-direct {p1, p0}, Ll/ܰۛ;-><init>(Landroid/view/ViewGroup;)V

    iput-object p1, p0, Ll/֡֫֫;->᩹:Ll/ܰۛ;

    .line 272
    invoke-virtual {p0, v0}, Ll/֡֫֫;->setNestedScrollingEnabled(Z)V

    .line 274
    sget-object p1, Ll/֡֫֫;->᩵֫:Ll/ۡ֫֫;

    invoke-static {p0, p1}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܽۛ;)V

    return-void
.end method

.method private ֫(IIIZ)I
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v10, p3

    const/4 v11, 0x1

    if-ne v10, v11, :cond_0

    const/4 v2, 0x2

    .line 1080
    invoke-virtual {v0, v2, v10}, Ll/֡֫֫;->֫(II)Z

    .line 1086
    :cond_0
    iget-object v6, v0, Ll/֡֫֫;->᩷֫:[I

    .line 318
    iget-object v2, v0, Ll/֡֫֫;->᩹:Ll/ܰۛ;

    const/4 v3, 0x0

    iget-object v5, v0, Ll/֡֫֫;->ۜ֫:[I

    move/from16 v4, p1

    move/from16 v7, p3

    invoke-virtual/range {v2 .. v7}, Ll/ܰۛ;->֫(II[I[II)Z

    move-result v2

    .line 1086
    iget-object v12, v0, Ll/֡֫֫;->᩷֫:[I

    iget-object v13, v0, Ll/֡֫֫;->ۜ֫:[I

    if-eqz v2, :cond_1

    .line 1095
    aget v2, v13, v11

    sub-int v2, p1, v2

    .line 1096
    aget v4, v12, v11

    move v14, v2

    move v15, v4

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    move/from16 v14, p1

    const/4 v15, 0x0

    .line 1101
    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v9

    .line 1102
    invoke-virtual/range {p0 .. p0}, Ll/֡֫֫;->֫()I

    move-result v8

    .line 1373
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getOverScrollMode()I

    move-result v2

    if-eqz v2, :cond_2

    if-ne v2, v11, :cond_3

    .line 1375
    invoke-virtual/range {p0 .. p0}, Ll/֡֫֫;->֫()I

    move-result v2

    if-lez v2, :cond_3

    :cond_2
    if-nez p4, :cond_3

    const/4 v2, 0x1

    const/16 v16, 0x1

    goto :goto_1

    :cond_3
    const/4 v2, 0x0

    const/16 v16, 0x0

    .line 1110
    :goto_1
    invoke-virtual {v0, v14, v3, v9, v8}, Ll/֡֫֫;->֫(IIII)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 300
    iget-object v2, v0, Ll/֡֫֫;->᩹:Ll/ܰۛ;

    invoke-virtual {v2, v10}, Ll/ܰۛ;->֫(I)Z

    move-result v2

    if-nez v2, :cond_4

    const/4 v2, 0x1

    const/16 v17, 0x1

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    const/16 v17, 0x0

    .line 1123
    :goto_2
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v2

    sub-int v4, v2, v9

    sub-int v6, v14, v4

    .line 1127
    aput v3, v13, v11

    const/4 v5, 0x0

    .line 282
    iget-object v2, v0, Ll/֡֫֫;->᩹:Ll/ܰۛ;

    const/4 v3, 0x0

    iget-object v7, v0, Ll/֡֫֫;->᩷֫:[I

    move/from16 v18, v8

    move/from16 v8, p3

    move/from16 v19, v9

    move-object v9, v13

    invoke-virtual/range {v2 .. v9}, Ll/ܰۛ;->֫(IIII[II[I)V

    .line 1140
    aget v2, v12, v11

    add-int/2addr v15, v2

    .line 1143
    aget v2, v13, v11

    sub-int/2addr v14, v2

    add-int v9, v19, v14

    .line 1146
    iget-object v2, v0, Ll/֡֫֫;->ۗ:Landroid/widget/EdgeEffect;

    iget-object v3, v0, Ll/֡֫֫;->۬:Landroid/widget/EdgeEffect;

    if-gez v9, :cond_5

    if-eqz v16, :cond_6

    neg-int v4, v14

    int-to-float v4, v4

    .line 1150
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v4, v5

    int-to-float v1, v1

    .line 1151
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v1, v5

    .line 1148
    invoke-static {v3, v4, v1}, Ll/᩻֫֫;->ۧ(Landroid/widget/EdgeEffect;FF)F

    .line 1154
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-nez v1, :cond_6

    .line 1155
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->onRelease()V

    goto :goto_3

    :cond_5
    move/from16 v4, v18

    if-le v9, v4, :cond_6

    if-eqz v16, :cond_6

    int-to-float v4, v14

    .line 1163
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v4, v5

    int-to-float v1, v1

    .line 1164
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v1, v5

    const/high16 v5, 0x3f800000    # 1.0f

    sub-float/2addr v5, v1

    .line 1161
    invoke-static {v2, v4, v5}, Ll/᩻֫֫;->ۧ(Landroid/widget/EdgeEffect;FF)F

    .line 1167
    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-nez v1, :cond_6

    .line 1168
    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 1173
    :cond_6
    :goto_3
    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-nez v1, :cond_8

    .line 1174
    :cond_7
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    const/16 v17, 0x0

    :cond_8
    if-eqz v17, :cond_9

    if-nez v10, :cond_9

    .line 1180
    iget-object v1, v0, Ll/֡֫֫;->ۘ֫:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_9

    .line 1181
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->clear()V

    :cond_9
    if-ne v10, v11, :cond_a

    .line 1190
    invoke-virtual {v0, v10}, Ll/֡֫֫;->ܳ(I)V

    .line 1193
    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 1194
    invoke-virtual {v2}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_a
    return v15
.end method

.method public static synthetic ֫(Ll/֡֫֫;)Landroid/widget/OverScroller;
    .locals 0

    .line 78
    iget-object p0, p0, Ll/֡֫֫;->ۢ֫:Landroid/widget/OverScroller;

    return-object p0
.end method

.method private ֫(IIZ)V
    .locals 11

    .line 1786
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 1790
    :cond_0
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Ll/֡֫֫;->ܰ:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xfa

    const/4 v4, 0x1

    cmp-long v5, v0, v2

    if-lez v5, :cond_2

    const/4 p1, 0x0

    .line 1792
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 1793
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 1794
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget v2, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr v0, v2

    iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    .line 1795
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    .line 1796
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v7

    sub-int/2addr v0, v1

    .line 1797
    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr p2, v7

    .line 1798
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    sub-int v9, p1, v7

    .line 1799
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v6

    const/4 v8, 0x0

    iget-object v5, p0, Ll/֡֫֫;->ۢ֫:Landroid/widget/OverScroller;

    const/16 v10, 0xfa

    invoke-virtual/range {v5 .. v10}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    if-eqz p3, :cond_1

    const/4 p1, 0x2

    .line 2039
    invoke-virtual {p0, p1, v4}, Ll/֡֫֫;->֫(II)Z

    goto :goto_0

    .line 2041
    :cond_1
    invoke-virtual {p0, v4}, Ll/֡֫֫;->ܳ(I)V

    .line 2043
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p1

    iput p1, p0, Ll/֡֫֫;->۟:I

    .line 2044
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_1

    .line 1802
    :cond_2
    iget-object p3, p0, Ll/֡֫֫;->ۢ֫:Landroid/widget/OverScroller;

    invoke-virtual {p3}, Landroid/widget/OverScroller;->isFinished()Z

    move-result p3

    if-nez p3, :cond_3

    .line 2048
    iget-object p3, p0, Ll/֡֫֫;->ۢ֫:Landroid/widget/OverScroller;

    invoke-virtual {p3}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 2049
    invoke-virtual {p0, v4}, Ll/֡֫֫;->ܳ(I)V

    .line 1805
    :cond_3
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->scrollBy(II)V

    .line 1807
    :goto_1
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Ll/֡֫֫;->ܰ:J

    return-void
.end method

.method private ֫(II[I)V
    .locals 10

    .line 380
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    const/4 v1, 0x0

    .line 381
    invoke-virtual {p0, v1, p1}, Landroid/view/View;->scrollBy(II)V

    .line 382
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    sub-int v4, v1, v0

    if-eqz p3, :cond_0

    const/4 v0, 0x1

    .line 385
    aget v1, p3, v0

    add-int/2addr v1, v4

    aput v1, p3, v0

    :cond_0
    sub-int v6, p1, v4

    const/4 v5, 0x0

    const/4 v7, 0x0

    .line 389
    iget-object v2, p0, Ll/֡֫֫;->᩹:Ll/ܰۛ;

    const/4 v3, 0x0

    move v8, p2

    move-object v9, p3

    invoke-virtual/range {v2 .. v9}, Ll/ܰۛ;->֫(IIII[II[I)V

    return-void
.end method

.method private ֫(Landroid/view/MotionEvent;)V
    .locals 3

    .line 1311
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    .line 1312
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    .line 1313
    iget v2, p0, Ll/֡֫֫;->᩸:I

    if-ne v1, v2, :cond_1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1318
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Ll/֡֫֫;->᩺:I

    .line 1319
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Ll/֡֫֫;->᩸:I

    .line 1320
    iget-object p1, p0, Ll/֡֫֫;->ۘ֫:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_1

    .line 1321
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    :cond_1
    return-void
.end method

.method private ֫(III)Z
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    .line 1638
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v4

    .line 1639
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v5

    add-int/2addr v4, v5

    const/16 v6, 0x21

    if-ne v1, v6, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    const/4 v7, 0x2

    .line 1490
    invoke-virtual {v0, v7}, Landroid/view/View;->getFocusables(I)Ljava/util/ArrayList;

    move-result-object v7

    .line 1502
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_1
    if-ge v10, v8, :cond_a

    .line 1504
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/View;

    .line 1505
    invoke-virtual {v12}, Landroid/view/View;->getTop()I

    move-result v13

    .line 1506
    invoke-virtual {v12}, Landroid/view/View;->getBottom()I

    move-result v14

    if-ge v2, v14, :cond_8

    if-ge v13, v3, :cond_8

    if-ge v2, v13, :cond_1

    if-ge v14, v3, :cond_1

    const/4 v15, 0x1

    goto :goto_2

    :cond_1
    const/4 v15, 0x0

    :goto_2
    move-object/from16 v16, v7

    if-nez v9, :cond_2

    move-object v9, v12

    move v11, v15

    goto :goto_5

    :cond_2
    if-eqz v6, :cond_3

    .line 1522
    invoke-virtual {v9}, Landroid/view/View;->getTop()I

    move-result v7

    if-lt v13, v7, :cond_4

    :cond_3
    if-nez v6, :cond_5

    .line 1523
    invoke-virtual {v9}, Landroid/view/View;->getBottom()I

    move-result v7

    if-le v14, v7, :cond_5

    :cond_4
    const/4 v7, 0x1

    goto :goto_3

    :cond_5
    const/4 v7, 0x0

    :goto_3
    if-eqz v11, :cond_6

    if-eqz v15, :cond_9

    if-eqz v7, :cond_9

    goto :goto_4

    :cond_6
    if-eqz v15, :cond_7

    const/4 v7, 0x1

    move-object v9, v12

    const/4 v11, 0x1

    goto :goto_5

    :cond_7
    if-eqz v7, :cond_9

    :goto_4
    move-object v9, v12

    goto :goto_5

    :cond_8
    move-object/from16 v16, v7

    :cond_9
    :goto_5
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v7, v16

    goto :goto_1

    :cond_a
    if-nez v9, :cond_b

    move-object v9, v0

    :cond_b
    if-lt v2, v5, :cond_c

    if-gt v3, v4, :cond_c

    const/4 v2, 0x0

    goto :goto_7

    :cond_c
    if-eqz v6, :cond_d

    sub-int/2addr v2, v5

    goto :goto_6

    :cond_d
    sub-int v2, v3, v4

    :goto_6
    const/4 v3, 0x0

    const/4 v4, 0x1

    .line 1652
    invoke-direct {v0, v2, v3, v4, v4}, Ll/֡֫֫;->֫(IIIZ)I

    const/4 v2, 0x1

    .line 1655
    :goto_7
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v3

    if-eq v9, v3, :cond_e

    invoke-virtual {v9, v1}, Landroid/view/View;->requestFocus(I)Z

    :cond_e
    return v2
.end method

.method private ֫(Landroid/view/View;II)Z
    .locals 2

    .line 1734
    iget-object v0, p0, Ll/֡֫֫;->ܺ֫:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 1735
    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1737
    iget p1, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    if-lt p1, v1, :cond_0

    iget p1, v0, Landroid/graphics/Rect;->top:I

    sub-int/2addr p1, p2

    .line 1738
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p2

    add-int/2addr p2, p3

    if-gt p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static ֫(Landroid/view/View;Ll/֡֫֫;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    goto :goto_0

    .line 2300
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    .line 2301
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/view/View;

    invoke-static {p0, p1}, Ll/֡֫֫;->֫(Landroid/view/View;Ll/֡֫֫;)Z

    move-result p0

    if-eqz p0, :cond_1

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private ֫(Landroid/widget/EdgeEffect;I)Z
    .locals 9

    const/4 v0, 0x1

    if-lez p2, :cond_0

    return v0

    .line 1213
    :cond_0
    invoke-static {p1}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;)F

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    mul-float p1, p1, v1

    neg-int p2, p2

    .line 1260
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    int-to-float p2, p2

    const v1, 0x3eb33333    # 0.35f

    mul-float p2, p2, v1

    const v1, 0x3c75c28f    # 0.015f

    iget v2, p0, Ll/֡֫֫;->ܳ֫:F

    mul-float v2, v2, v1

    div-float/2addr p2, v2

    float-to-double v3, p2

    invoke-static {v3, v4}, Ljava/lang/Math;->log(D)D

    move-result-wide v3

    .line 1261
    sget p2, Ll/֡֫֫;->֡֫:F

    float-to-double v5, p2

    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    sub-double v7, v5, v7

    float-to-double v1, v2

    div-double/2addr v5, v7

    mul-double v5, v5, v3

    .line 1263
    invoke-static {v5, v6}, Ljava/lang/Math;->exp(D)D

    move-result-wide v3

    mul-double v3, v3, v1

    double-to-float p2, v3

    cmpg-float p1, p2, p1

    if-gez p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private ۧ(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1299
    iget-object v0, p0, Ll/֡֫֫;->۬:Landroid/widget/EdgeEffect;

    invoke-static {v0}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;)F

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    cmpl-float v1, v1, v3

    if-eqz v1, :cond_0

    .line 1300
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v1, v4

    invoke-static {v0, v3, v1}, Ll/᩻֫֫;->ۧ(Landroid/widget/EdgeEffect;FF)F

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1303
    :goto_0
    iget-object v1, p0, Ll/֡֫֫;->ۗ:Landroid/widget/EdgeEffect;

    invoke-static {v1}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;)F

    move-result v4

    cmpl-float v4, v4, v3

    if-eqz v4, :cond_1

    .line 1304
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p1, v0

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p1

    invoke-static {v1, v3, v0}, Ll/᩻֫֫;->ۧ(Landroid/widget/EdgeEffect;FF)F

    return v2

    :cond_1
    return v0
.end method


# virtual methods
.method public final addView(Landroid/view/View;)V
    .locals 1

    .line 537
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_0

    .line 541
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    return-void

    .line 538
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ScrollView can host only one direct child"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final addView(Landroid/view/View;I)V
    .locals 1

    .line 546
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_0

    .line 550
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;I)V

    return-void

    .line 547
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ScrollView can host only one direct child"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 564
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_0

    .line 568
    invoke-super {p0, p1, p2, p3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 565
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ScrollView can host only one direct child"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 555
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_0

    .line 559
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 556
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ScrollView can host only one direct child"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final computeHorizontalScrollExtent()I
    .locals 1

    .line 1911
    invoke-super {p0}, Landroid/widget/FrameLayout;->computeHorizontalScrollExtent()I

    move-result v0

    return v0
.end method

.method public final computeHorizontalScrollOffset()I
    .locals 1

    .line 1905
    invoke-super {p0}, Landroid/widget/FrameLayout;->computeHorizontalScrollOffset()I

    move-result v0

    return v0
.end method

.method public final computeHorizontalScrollRange()I
    .locals 1

    .line 1899
    invoke-super {p0}, Landroid/widget/FrameLayout;->computeHorizontalScrollRange()I

    move-result v0

    return v0
.end method

.method public final computeScroll()V
    .locals 14

    .line 1947
    iget-object v0, p0, Ll/֡֫֫;->ۢ֫:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 1951
    :cond_0
    iget-object v0, p0, Ll/֡֫֫;->ۢ֫:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 1952
    iget-object v0, p0, Ll/֡֫֫;->ۢ֫:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v0

    .line 1953
    iget v1, p0, Ll/֡֫֫;->۟:I

    sub-int v1, v0, v1

    .line 1230
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    .line 1231
    iget-object v3, p0, Ll/֡֫֫;->۬:Landroid/widget/EdgeEffect;

    iget-object v4, p0, Ll/֡֫֫;->ۗ:Landroid/widget/EdgeEffect;

    const/high16 v5, 0x3f000000    # 0.5f

    const/4 v6, 0x0

    const/high16 v7, 0x40800000    # 4.0f

    if-lez v1, :cond_1

    invoke-static {v3}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;)F

    move-result v8

    cmpl-float v8, v8, v6

    if-eqz v8, :cond_1

    neg-int v6, v1

    int-to-float v6, v6

    mul-float v6, v6, v7

    int-to-float v8, v2

    div-float/2addr v6, v8

    neg-int v2, v2

    int-to-float v2, v2

    div-float/2addr v2, v7

    .line 1234
    invoke-static {v3, v6, v5}, Ll/᩻֫֫;->ۧ(Landroid/widget/EdgeEffect;FF)F

    move-result v5

    mul-float v5, v5, v2

    .line 1233
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v2

    if-eq v2, v1, :cond_2

    .line 1236
    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->finish()V

    goto :goto_0

    :cond_1
    if-gez v1, :cond_3

    .line 1240
    invoke-static {v4}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;)F

    move-result v8

    cmpl-float v6, v8, v6

    if-eqz v6, :cond_3

    int-to-float v6, v1

    mul-float v6, v6, v7

    int-to-float v2, v2

    div-float/2addr v6, v2

    div-float/2addr v2, v7

    .line 1243
    invoke-static {v4, v6, v5}, Ll/᩻֫֫;->ۧ(Landroid/widget/EdgeEffect;FF)F

    move-result v5

    mul-float v5, v5, v2

    .line 1242
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v2

    if-eq v2, v1, :cond_2

    .line 1245
    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->finish()V

    :cond_2
    :goto_0
    sub-int/2addr v1, v2

    .line 1954
    :cond_3
    iput v0, p0, Ll/֡֫֫;->۟:I

    .line 1957
    iget-object v0, p0, Ll/֡֫֫;->ۜ֫:[I

    const/4 v2, 0x1

    const/4 v11, 0x0

    aput v11, v0, v2

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v6, 0x0

    move-object v5, p0

    move v7, v1

    move-object v8, v0

    .line 1958
    invoke-virtual/range {v5 .. v10}, Ll/֡֫֫;->֫(II[I[II)Z

    .line 1960
    aget v5, v0, v2

    sub-int/2addr v1, v5

    .line 1962
    invoke-virtual {p0}, Ll/֡֫֫;->֫()I

    move-result v13

    if-eqz v1, :cond_4

    .line 1966
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v5

    .line 1967
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v6

    invoke-virtual {p0, v1, v6, v5, v13}, Ll/֡֫֫;->֫(IIII)Z

    .line 1968
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v6

    sub-int v7, v6, v5

    sub-int/2addr v1, v7

    .line 1972
    aput v11, v0, v2

    const/4 v8, 0x0

    .line 282
    iget-object v5, p0, Ll/֡֫֫;->᩹:Ll/ܰۛ;

    const/4 v6, 0x0

    iget-object v10, p0, Ll/֡֫֫;->᩷֫:[I

    const/4 v11, 0x1

    const/4 v2, 0x1

    move v9, v1

    move-object v12, v0

    invoke-virtual/range {v5 .. v12}, Ll/ܰۛ;->֫(IIII[II[I)V

    .line 1975
    aget v0, v0, v2

    sub-int/2addr v1, v0

    goto :goto_1

    :cond_4
    const/4 v2, 0x1

    :goto_1
    if-eqz v1, :cond_8

    .line 1979
    invoke-virtual {p0}, Landroid/view/View;->getOverScrollMode()I

    move-result v0

    if-eqz v0, :cond_5

    if-ne v0, v2, :cond_7

    if-lez v13, :cond_7

    :cond_5
    if-gez v1, :cond_6

    .line 1984
    invoke-virtual {v3}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1985
    iget-object v0, p0, Ll/֡֫֫;->ۢ֫:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {v3, v0}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_2

    .line 1988
    :cond_6
    invoke-virtual {v4}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 1989
    iget-object v0, p0, Ll/֡֫֫;->ۢ֫:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {v4, v0}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 2048
    :cond_7
    :goto_2
    iget-object v0, p0, Ll/֡֫֫;->ۢ֫:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 2049
    invoke-virtual {p0, v2}, Ll/֡֫֫;->ܳ(I)V

    .line 1996
    :cond_8
    iget-object v0, p0, Ll/֡֫֫;->ۢ֫:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v0

    if-nez v0, :cond_9

    .line 1997
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    return-void

    .line 1999
    :cond_9
    invoke-virtual {p0, v2}, Ll/֡֫֫;->ܳ(I)V

    return-void
.end method

.method public final computeVerticalScrollExtent()I
    .locals 1

    .line 1893
    invoke-super {p0}, Landroid/widget/FrameLayout;->computeVerticalScrollExtent()I

    move-result v0

    return v0
.end method

.method public final computeVerticalScrollOffset()I
    .locals 2

    const/4 v0, 0x0

    .line 1887
    invoke-super {p0}, Landroid/widget/FrameLayout;->computeVerticalScrollOffset()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public final computeVerticalScrollRange()I
    .locals 4

    .line 1864
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    .line 1865
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    .line 1870
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1871
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 1872
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v2

    iget v3, v3, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v2, v3

    .line 1873
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v3

    sub-int v1, v2, v1

    .line 1874
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-gez v3, :cond_1

    sub-int/2addr v2, v3

    return v2

    :cond_1
    if-le v3, v0, :cond_2

    sub-int/2addr v3, v0

    add-int/2addr v3, v2

    return v3

    :cond_2
    return v2
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 686
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Ll/֡֫֫;->֫(Landroid/view/KeyEvent;)Z

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

.method public final dispatchNestedFling(FFZ)Z
    .locals 1

    .line 363
    iget-object v0, p0, Ll/֡֫֫;->᩹:Ll/ܰۛ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ܰۛ;->֫(FFZ)Z

    move-result p1

    return p1
.end method

.method public final dispatchNestedPreFling(FF)Z
    .locals 1

    .line 368
    iget-object v0, p0, Ll/֡֫֫;->᩹:Ll/ܰۛ;

    invoke-virtual {v0, p1, p2}, Ll/ܰۛ;->֫(FF)Z

    move-result p1

    return p1
.end method

.method public final dispatchNestedPreScroll(II[I[I)Z
    .locals 6

    const/4 v5, 0x0

    .line 318
    iget-object v0, p0, Ll/֡֫֫;->᩹:Ll/ܰۛ;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Ll/ܰۛ;->֫(II[I[II)Z

    move-result p1

    return p1
.end method

.method public final dispatchNestedScroll(IIII[I)Z
    .locals 6

    .line 351
    iget-object v0, p0, Ll/֡֫֫;->᩹:Ll/ܰۛ;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Ll/ܰۛ;->֫(IIII[I)Z

    move-result p1

    return p1
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 10

    .line 2348
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V

    .line 2349
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    .line 2350
    iget-object v1, p0, Ll/֡֫֫;->۬:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_3

    .line 2351
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    .line 2352
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    .line 2353
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    .line 2355
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 2357
    invoke-static {p0}, Ll/ܺ֫֫;->֫(Landroid/view/ViewGroup;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 2358
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v7

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v8

    add-int/2addr v8, v7

    sub-int/2addr v4, v8

    .line 2359
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v7

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    .line 2362
    :goto_0
    invoke-static {p0}, Ll/ܺ֫֫;->֫(Landroid/view/ViewGroup;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 2363
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v8

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v9

    add-int/2addr v9, v8

    sub-int/2addr v5, v9

    .line 2364
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v8

    add-int/2addr v6, v8

    :cond_1
    int-to-float v7, v7

    int-to-float v6, v6

    .line 2366
    invoke-virtual {p1, v7, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 2367
    invoke-virtual {v1, v4, v5}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 2368
    invoke-virtual {v1, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 2369
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 2371
    :cond_2
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 2373
    :cond_3
    iget-object v1, p0, Ll/֡֫֫;->ۗ:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v2

    if-nez v2, :cond_7

    .line 2374
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v2

    .line 2375
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    .line 2376
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    .line 2378
    invoke-virtual {p0}, Ll/֡֫֫;->֫()I

    move-result v6

    invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v0, v5

    .line 2380
    invoke-static {p0}, Ll/ܺ֫֫;->֫(Landroid/view/ViewGroup;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 2381
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    add-int/2addr v6, v3

    sub-int/2addr v4, v6

    .line 2382
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    .line 2385
    :cond_4
    invoke-static {p0}, Ll/ܺ֫֫;->֫(Landroid/view/ViewGroup;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 2386
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v7

    add-int/2addr v7, v6

    sub-int/2addr v5, v7

    .line 2387
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    sub-int/2addr v0, v6

    :cond_5
    sub-int/2addr v3, v4

    int-to-float v3, v3

    int-to-float v0, v0

    .line 2389
    invoke-virtual {p1, v3, v0}, Landroid/graphics/Canvas;->translate(FF)V

    int-to-float v0, v4

    const/4 v3, 0x0

    const/high16 v6, 0x43340000    # 180.0f

    .line 2390
    invoke-virtual {p1, v6, v0, v3}, Landroid/graphics/Canvas;->rotate(FFF)V

    .line 2391
    invoke-virtual {v1, v4, v5}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 2392
    invoke-virtual {v1, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2393
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 2395
    :cond_6
    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_7
    return-void
.end method

.method public final getBottomFadingEdgeStrength()F
    .locals 5

    .line 500
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x0

    .line 504
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 505
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 506
    invoke-virtual {p0}, Landroid/view/View;->getVerticalFadingEdgeLength()I

    move-result v2

    .line 507
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    .line 508
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    sub-int/2addr v0, v1

    sub-int/2addr v0, v3

    if-ge v0, v2, :cond_1

    int-to-float v0, v0

    int-to-float v1, v2

    div-float/2addr v0, v1

    return v0

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public final getNestedScrollAxes()I
    .locals 1

    .line 473
    iget-object v0, p0, Ll/֡֫֫;->ܿ֫:Ll/ۧۨ;

    invoke-virtual {v0}, Ll/ۧۨ;->֫()I

    move-result v0

    return v0
.end method

.method public final getTopFadingEdgeStrength()F
    .locals 2

    .line 485
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 489
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getVerticalFadingEdgeLength()I

    move-result v0

    .line 490
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    if-ge v1, v0, :cond_1

    int-to-float v1, v1

    int-to-float v0, v0

    div-float/2addr v1, v0

    return v1

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public final hasNestedScrollingParent()Z
    .locals 2

    const/4 v0, 0x0

    .line 300
    iget-object v1, p0, Ll/֡֫֫;->᩹:Ll/ܰۛ;

    invoke-virtual {v1, v0}, Ll/ܰۛ;->֫(I)Z

    move-result v0

    return v0
.end method

.method public final isNestedScrollingEnabled()Z
    .locals 1

    .line 330
    iget-object v0, p0, Ll/֡֫֫;->᩹:Ll/ܰۛ;

    invoke-virtual {v0}, Ll/ܰۛ;->֫()Z

    move-result v0

    return v0
.end method

.method public final measureChild(Landroid/view/View;II)V
    .locals 2

    .line 1917
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    .line 1922
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    .line 1923
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    add-int/2addr v1, v0

    iget p3, p3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1922
    invoke-static {p2, v1, p3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result p2

    const/4 p3, 0x0

    .line 1925
    invoke-static {p3, p3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p3

    .line 1927
    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    return-void
.end method

.method public final measureChildWithMargins(Landroid/view/View;IIII)V
    .locals 1

    .line 1933
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p4

    check-cast p4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1936
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    add-int/2addr v0, p5

    iget p5, p4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v0, p5

    iget p5, p4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v0, p5

    add-int/2addr v0, p3

    iget p3, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 1935
    invoke-static {p2, v0, p3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result p2

    .line 1938
    iget p3, p4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget p4, p4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p3, p4

    const/4 p4, 0x0

    invoke-static {p3, p4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p3

    .line 1941
    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 2267
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    const/4 v0, 0x0

    .line 2269
    iput-boolean v0, p0, Ll/֡֫֫;->ۛ:Z

    return-void
.end method

.method public final onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .line 1328
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-ne v0, v1, :cond_4

    iget-boolean v0, p0, Ll/֡֫֫;->ۤ:Z

    if-nez v0, :cond_4

    .line 556
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    const/4 v1, 0x2

    and-int/2addr v0, v1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    const/16 v0, 0x9

    .line 1334
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v1

    .line 1335
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    float-to-int v4, v4

    goto :goto_0

    .line 556
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    const/high16 v1, 0x400000

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_1

    const/16 v0, 0x1a

    .line 1340
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v1

    .line 1343
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    :goto_0
    cmpl-float v3, v1, v3

    if-eqz v3, :cond_4

    .line 1353
    invoke-virtual {p0}, Ll/֡֫֫;->ۧ()F

    move-result v3

    mul-float v1, v1, v3

    float-to-int v1, v1

    .line 556
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v3

    const/16 v5, 0x2002

    and-int/2addr v3, v5

    const/4 v6, 0x1

    if-ne v3, v5, :cond_2

    const/4 v2, 0x1

    :cond_2
    neg-int v1, v1

    .line 1358
    invoke-direct {p0, v1, v4, v6, v2}, Ll/֡֫֫;->֫(IIIZ)I

    if-eqz v0, :cond_3

    .line 1360
    iget-object v1, p0, Ll/֡֫֫;->ۙ:Ll/ᩴۛ;

    invoke-virtual {v1, p1, v0}, Ll/ᩴۛ;->֫(Landroid/view/MotionEvent;I)V

    :cond_3
    return v6

    :cond_4
    return v2
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12

    .line 805
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    .line 806
    iget-boolean v3, p0, Ll/֡֫֫;->ۤ:Z

    if-eqz v3, :cond_0

    return v1

    :cond_0
    and-int/lit16 v0, v0, 0xff

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v0, :cond_9

    const/4 v5, -0x1

    if-eq v0, v1, :cond_6

    if-eq v0, v2, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_6

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1

    goto/16 :goto_3

    .line 893
    :cond_1
    invoke-direct {p0, p1}, Ll/֡֫֫;->֫(Landroid/view/MotionEvent;)V

    goto/16 :goto_3

    .line 821
    :cond_2
    iget v0, p0, Ll/֡֫֫;->᩸:I

    if-ne v0, v5, :cond_3

    goto/16 :goto_3

    .line 827
    :cond_3
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    if-ne v0, v5, :cond_4

    goto/16 :goto_3

    .line 834
    :cond_4
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    float-to-int v0, v0

    .line 835
    iget v3, p0, Ll/֡֫֫;->᩺:I

    sub-int v3, v0, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    .line 836
    iget v5, p0, Ll/֡֫֫;->ۖ֫:I

    if-le v3, v5, :cond_10

    .line 473
    iget-object v3, p0, Ll/֡֫֫;->ܿ֫:Ll/ۧۨ;

    invoke-virtual {v3}, Ll/ۧۨ;->֫()I

    move-result v3

    and-int/2addr v2, v3

    if-nez v2, :cond_10

    .line 838
    iput-boolean v1, p0, Ll/֡֫֫;->ۤ:Z

    .line 839
    iput v0, p0, Ll/֡֫֫;->᩺:I

    .line 772
    iget-object v0, p0, Ll/֡֫֫;->ۘ֫:Landroid/view/VelocityTracker;

    if-nez v0, :cond_5

    .line 773
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Ll/֡֫֫;->ۘ֫:Landroid/view/VelocityTracker;

    .line 841
    :cond_5
    iget-object v0, p0, Ll/֡֫֫;->ۘ֫:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 842
    iput v4, p0, Ll/֡֫֫;->ܽ֫:I

    .line 843
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_10

    .line 845
    invoke-interface {p1, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto/16 :goto_3

    .line 884
    :cond_6
    iput-boolean v4, p0, Ll/֡֫֫;->ۤ:Z

    .line 885
    iput v5, p0, Ll/֡֫֫;->᩸:I

    .line 778
    iget-object p1, p0, Ll/֡֫֫;->ۘ֫:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_7

    .line 779
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->recycle()V

    .line 780
    iput-object v3, p0, Ll/֡֫֫;->ۘ֫:Landroid/view/VelocityTracker;

    .line 887
    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v6

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v7

    const/4 v10, 0x0

    invoke-virtual {p0}, Ll/֡֫֫;->֫()I

    move-result v11

    iget-object v5, p0, Ll/֡֫֫;->ۢ֫:Landroid/widget/OverScroller;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v5 .. v11}, Landroid/widget/OverScroller;->springBack(IIIIII)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 888
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 890
    :cond_8
    invoke-virtual {p0, v4}, Ll/֡֫֫;->ܳ(I)V

    goto/16 :goto_3

    .line 852
    :cond_9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    .line 853
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    float-to-int v5, v5

    .line 752
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    if-lez v6, :cond_d

    .line 753
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v6

    .line 754
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    .line 755
    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    move-result v8

    sub-int/2addr v8, v6

    if-lt v0, v8, :cond_d

    .line 756
    invoke-virtual {v7}, Landroid/view/View;->getBottom()I

    move-result v8

    sub-int/2addr v8, v6

    if-ge v0, v8, :cond_d

    .line 757
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v6

    if-lt v5, v6, :cond_d

    .line 758
    invoke-virtual {v7}, Landroid/view/View;->getRight()I

    move-result v6

    if-ge v5, v6, :cond_d

    .line 863
    iput v0, p0, Ll/֡֫֫;->᩺:I

    .line 864
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Ll/֡֫֫;->᩸:I

    .line 764
    iget-object v0, p0, Ll/֡֫֫;->ۘ֫:Landroid/view/VelocityTracker;

    if-nez v0, :cond_a

    .line 765
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Ll/֡֫֫;->ۘ֫:Landroid/view/VelocityTracker;

    goto :goto_0

    .line 767
    :cond_a
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 867
    :goto_0
    iget-object v0, p0, Ll/֡֫֫;->ۘ֫:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 875
    iget-object v0, p0, Ll/֡֫֫;->ۢ֫:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 876
    invoke-direct {p0, p1}, Ll/֡֫֫;->ۧ(Landroid/view/MotionEvent;)Z

    move-result p1

    if-nez p1, :cond_c

    iget-object p1, p0, Ll/֡֫֫;->ۢ֫:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/widget/OverScroller;->isFinished()Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_1

    :cond_b
    const/4 v1, 0x0

    :cond_c
    :goto_1
    iput-boolean v1, p0, Ll/֡֫֫;->ۤ:Z

    .line 877
    invoke-virtual {p0, v2, v4}, Ll/֡֫֫;->֫(II)Z

    goto :goto_3

    .line 854
    :cond_d
    invoke-direct {p0, p1}, Ll/֡֫֫;->ۧ(Landroid/view/MotionEvent;)Z

    move-result p1

    if-nez p1, :cond_f

    iget-object p1, p0, Ll/֡֫֫;->ۢ֫:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/widget/OverScroller;->isFinished()Z

    move-result p1

    if-nez p1, :cond_e

    goto :goto_2

    :cond_e
    const/4 v1, 0x0

    :cond_f
    :goto_2
    iput-boolean v1, p0, Ll/֡֫֫;->ۤ:Z

    .line 778
    iget-object p1, p0, Ll/֡֫֫;->ۘ֫:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_10

    .line 779
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->recycle()V

    .line 780
    iput-object v3, p0, Ll/֡֫֫;->ۘ֫:Landroid/view/VelocityTracker;

    .line 901
    :cond_10
    :goto_3
    iget-boolean p1, p0, Ll/֡֫֫;->ۤ:Z

    return p1
.end method

.method public final onLayout(ZIIII)V
    .locals 1

    .line 2229
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    const/4 p1, 0x0

    .line 2230
    iput-boolean p1, p0, Ll/֡֫֫;->ۨ:Z

    .line 2232
    iget-object p2, p0, Ll/֡֫֫;->᩶:Landroid/view/View;

    if-eqz p2, :cond_0

    invoke-static {p2, p0}, Ll/֡֫֫;->֫(Landroid/view/View;Ll/֡֫֫;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 2233
    iget-object p2, p0, Ll/֡֫֫;->᩶:Landroid/view/View;

    .line 2058
    iget-object p4, p0, Ll/֡֫֫;->ܺ֫:Landroid/graphics/Rect;

    invoke-virtual {p2, p4}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 2061
    invoke-virtual {p0, p2, p4}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 2063
    invoke-virtual {p0, p4}, Ll/֡֫֫;->֫(Landroid/graphics/Rect;)I

    move-result p2

    if-eqz p2, :cond_0

    .line 2066
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->scrollBy(II)V

    :cond_0
    const/4 p2, 0x0

    .line 2235
    iput-object p2, p0, Ll/֡֫֫;->᩶:Landroid/view/View;

    .line 2237
    iget-boolean p4, p0, Ll/֡֫֫;->ۛ:Z

    if-nez p4, :cond_6

    .line 2239
    iget-object p4, p0, Ll/֡֫֫;->᩻֫:Ll/᩵֫֫;

    if-eqz p4, :cond_1

    .line 2240
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p4

    iget-object v0, p0, Ll/֡֫֫;->᩻֫:Ll/᩵֫֫;

    iget v0, v0, Ll/᩵֫֫;->᩸:I

    invoke-virtual {p0, p4, v0}, Ll/֡֫֫;->scrollTo(II)V

    .line 2241
    iput-object p2, p0, Ll/֡֫֫;->᩻֫:Ll/᩵֫֫;

    .line 2247
    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-lez p2, :cond_2

    .line 2248
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    .line 2249
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p4

    check-cast p4, Landroid/widget/FrameLayout$LayoutParams;

    .line 2250
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    iget v0, p4, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr p2, v0

    iget p4, p4, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr p2, p4

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    sub-int/2addr p5, p3

    .line 2252
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p3

    sub-int/2addr p5, p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p3

    sub-int/2addr p5, p3

    .line 2253
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p3

    if-ge p5, p2, :cond_5

    if-gez p3, :cond_3

    goto :goto_1

    :cond_3
    add-int p1, p5, p3

    if-le p1, p2, :cond_4

    sub-int p1, p2, p5

    goto :goto_1

    :cond_4
    move p1, p3

    :cond_5
    :goto_1
    if-eq p1, p3, :cond_6

    .line 2256
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p2

    invoke-virtual {p0, p2, p1}, Ll/֡֫֫;->scrollTo(II)V

    .line 2261
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ll/֡֫֫;->scrollTo(II)V

    const/4 p1, 0x1

    .line 2262
    iput-boolean p1, p0, Ll/֡֫֫;->ۛ:Z

    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    .line 650
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 652
    iget-boolean v0, p0, Ll/֡֫֫;->۫:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 656
    :cond_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    .line 661
    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-lez p2, :cond_2

    const/4 p2, 0x0

    .line 662
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    .line 663
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 665
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    .line 666
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    .line 667
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    .line 668
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    sub-int/2addr v2, v3

    iget v3, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    sub-int/2addr v2, v3

    if-ge v1, v2, :cond_2

    .line 674
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    add-int/2addr v3, v1

    iget v1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    add-int/2addr v3, v1

    iget v1, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    add-int/2addr v3, v1

    iget v0, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 673
    invoke-static {p1, v3, v0}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    .line 677
    invoke-static {v2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    .line 678
    invoke-virtual {p2, p1, v0}, Landroid/view/View;->measure(II)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final onNestedFling(Landroid/view/View;FFZ)Z
    .locals 0

    if-nez p4, :cond_0

    const/4 p1, 0x0

    const/4 p2, 0x1

    .line 459
    invoke-virtual {p0, p1, p3, p2}, Ll/֡֫֫;->dispatchNestedFling(FFZ)Z

    float-to-int p1, p3

    .line 460
    invoke-virtual {p0, p1}, Ll/֡֫֫;->ۧ(I)V

    return p2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onNestedPreFling(Landroid/view/View;FF)Z
    .locals 0

    .line 368
    iget-object p1, p0, Ll/֡֫֫;->᩹:Ll/ܰۛ;

    invoke-virtual {p1, p2, p3}, Ll/ܰۛ;->֫(FF)Z

    move-result p1

    return p1
.end method

.method public final onNestedPreScroll(Landroid/view/View;II[I)V
    .locals 6

    const/4 v5, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p2

    move v2, p3

    move-object v3, p4

    .line 422
    invoke-virtual/range {v0 .. v5}, Ll/֡֫֫;->֫(II[I[II)Z

    return-void
.end method

.method public final onNestedPreScroll(Landroid/view/View;II[II)V
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p2

    move v2, p3

    move-object v3, p4

    move v5, p5

    .line 422
    invoke-virtual/range {v0 .. v5}, Ll/֡֫֫;->֫(II[I[II)Z

    return-void
.end method

.method public final onNestedScroll(Landroid/view/View;IIII)V
    .locals 0

    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 447
    invoke-direct {p0, p5, p1, p2}, Ll/֡֫֫;->֫(II[I)V

    return-void
.end method

.method public final onNestedScroll(Landroid/view/View;IIIII)V
    .locals 0

    const/4 p1, 0x0

    .line 416
    invoke-direct {p0, p5, p6, p1}, Ll/֡֫֫;->֫(II[I)V

    return-void
.end method

.method public final onNestedScroll(Landroid/view/View;IIIII[I)V
    .locals 0

    .line 376
    invoke-direct {p0, p5, p6, p7}, Ll/֡֫֫;->֫(II[I)V

    return-void
.end method

.method public final onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x0

    .line 436
    invoke-virtual {p0, p1, p2, p3, v0}, Ll/֡֫֫;->onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;II)V

    return-void
.end method

.method public final onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;II)V
    .locals 0

    .line 403
    iget-object p1, p0, Ll/֡֫֫;->ܿ֫:Ll/ۧۨ;

    invoke-virtual {p1, p3, p4}, Ll/ۧۨ;->֫(II)V

    const/4 p1, 0x2

    .line 404
    invoke-virtual {p0, p1, p4}, Ll/֡֫֫;->֫(II)Z

    return-void
.end method

.method public final onOverScrolled(IIZZ)V
    .locals 0

    .line 1397
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->scrollTo(II)V

    return-void
.end method

.method public final onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
    .locals 3

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const/16 p1, 0x82

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    const/16 p1, 0x21

    :cond_1
    :goto_0
    if-nez p2, :cond_2

    .line 2196
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    goto :goto_1

    .line 2197
    :cond_2
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v0

    invoke-virtual {v0, p0, p2, p1}, Landroid/view/FocusFinder;->findNextFocusFromRect(Landroid/view/ViewGroup;Landroid/graphics/Rect;I)Landroid/view/View;

    move-result-object v0

    :goto_1
    const/4 v1, 0x0

    if-nez v0, :cond_3

    goto :goto_2

    .line 1726
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-direct {p0, v0, v1, v2}, Ll/֡֫֫;->֫(Landroid/view/View;II)Z

    move-result v2

    if-nez v2, :cond_4

    :goto_2
    return v1

    .line 2208
    :cond_4
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 2431
    instance-of v0, p1, Ll/᩵֫֫;

    if-nez v0, :cond_0

    .line 2432
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 2436
    :cond_0
    check-cast p1, Ll/᩵֫֫;

    .line 2437
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/widget/FrameLayout;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 2438
    iput-object p1, p0, Ll/֡֫֫;->᩻֫:Ll/᩵֫֫;

    .line 2439
    invoke-virtual {p0}, Ll/֡֫֫;->requestLayout()V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 2445
    invoke-super {p0}, Landroid/widget/FrameLayout;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 2446
    new-instance v1, Ll/᩵֫֫;

    .line 2455
    invoke-direct {v1, v0}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 2447
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    iput v0, v1, Ll/᩵֫֫;->᩸:I

    return-object v1
.end method

.method public final onScrollChanged(IIII)V
    .locals 0

    .line 641
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onScrollChanged(IIII)V

    .line 643
    iget-object p1, p0, Ll/֡֫֫;->ᩳ֫:Ll/ۘ֫֫;

    if-eqz p1, :cond_0

    .line 644
    invoke-interface {p1, p0}, Ll/ۘ֫֫;->֫(Ll/֡֫֫;)V

    :cond_0
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 2274
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;->onSizeChanged(IIII)V

    .line 2276
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 2284
    invoke-direct {p0, p1, p2, p4}, Ll/֡֫֫;->֫(Landroid/view/View;II)Z

    move-result p3

    if-eqz p3, :cond_2

    .line 2285
    iget-object p3, p0, Ll/֡֫֫;->ܺ֫:Landroid/graphics/Rect;

    invoke-virtual {p1, p3}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 2286
    invoke-virtual {p0, p1, p3}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 2287
    invoke-virtual {p0, p3}, Ll/֡֫֫;->֫(Landroid/graphics/Rect;)I

    move-result p1

    if-eqz p1, :cond_2

    .line 1748
    iget-boolean p3, p0, Ll/֡֫֫;->ۡ֫:Z

    if-eqz p3, :cond_1

    .line 1763
    invoke-direct {p0, p2, p1, p2}, Ll/֡֫֫;->֫(IIZ)V

    return-void

    .line 1751
    :cond_1
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->scrollBy(II)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .locals 1

    const/4 v0, 0x0

    .line 430
    invoke-virtual {p0, p1, p2, p3, v0}, Ll/֡֫֫;->onStartNestedScroll(Landroid/view/View;Landroid/view/View;II)Z

    move-result p1

    return p1
.end method

.method public final onStartNestedScroll(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    and-int/lit8 p1, p3, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onStopNestedScroll(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    .line 441
    invoke-virtual {p0, p1, v0}, Ll/֡֫֫;->onStopNestedScroll(Landroid/view/View;I)V

    return-void
.end method

.method public final onStopNestedScroll(Landroid/view/View;I)V
    .locals 0

    .line 409
    iget-object p1, p0, Ll/֡֫֫;->ܿ֫:Ll/ۧۨ;

    invoke-virtual {p1, p2}, Ll/ۧۨ;->ۧ(I)V

    .line 410
    invoke-virtual {p0, p2}, Ll/֡֫֫;->ܳ(I)V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 772
    iget-object v2, v0, Ll/֡֫֫;->ۘ֫:Landroid/view/VelocityTracker;

    if-nez v2, :cond_0

    .line 773
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v2

    iput-object v2, v0, Ll/֡֫֫;->ۘ֫:Landroid/view/VelocityTracker;

    .line 908
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    .line 911
    iput v3, v0, Ll/֡֫֫;->ܽ֫:I

    .line 914
    :cond_1
    invoke-static/range {p1 .. p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v4

    .line 915
    iget v5, v0, Ll/֡֫֫;->ܽ֫:I

    int-to-float v5, v5

    const/4 v6, 0x0

    invoke-virtual {v4, v6, v5}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    const/4 v5, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_17

    const/4 v8, 0x0

    const/4 v9, -0x1

    .line 917
    iget-object v10, v0, Ll/֡֫֫;->۬:Landroid/widget/EdgeEffect;

    iget-object v11, v0, Ll/֡֫֫;->ۗ:Landroid/widget/EdgeEffect;

    if-eq v2, v7, :cond_f

    if-eq v2, v5, :cond_6

    const/4 v5, 0x3

    if-eq v2, v5, :cond_4

    const/4 v3, 0x5

    if-eq v2, v3, :cond_3

    const/4 v3, 0x6

    if-eq v2, v3, :cond_2

    goto/16 :goto_5

    .line 1021
    :cond_2
    invoke-direct/range {p0 .. p1}, Ll/֡֫֫;->֫(Landroid/view/MotionEvent;)V

    .line 1022
    iget v2, v0, Ll/֡֫֫;->᩸:I

    .line 1023
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    float-to-int v1, v1

    iput v1, v0, Ll/֡֫֫;->᩺:I

    goto/16 :goto_5

    .line 1014
    :cond_3
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v2

    .line 1015
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3

    float-to-int v3, v3

    iput v3, v0, Ll/֡֫֫;->᩺:I

    .line 1016
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iput v1, v0, Ll/֡֫֫;->᩸:I

    goto/16 :goto_5

    .line 1003
    :cond_4
    iget-boolean v1, v0, Ll/֡֫֫;->ۤ:Z

    if-eqz v1, :cond_5

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-lez v1, :cond_5

    .line 1004
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollX()I

    move-result v13

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v14

    const/16 v17, 0x0

    .line 1005
    invoke-virtual/range {p0 .. p0}, Ll/֡֫֫;->֫()I

    move-result v18

    .line 1004
    iget-object v12, v0, Ll/֡֫֫;->ۢ֫:Landroid/widget/OverScroller;

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-virtual/range {v12 .. v18}, Landroid/widget/OverScroller;->springBack(IIIIII)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 1006
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 1045
    :cond_5
    iput v9, v0, Ll/֡֫֫;->᩸:I

    .line 1046
    iput-boolean v3, v0, Ll/֡֫֫;->ۤ:Z

    .line 778
    iget-object v1, v0, Ll/֡֫֫;->ۘ֫:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_16

    goto/16 :goto_4

    .line 949
    :cond_6
    iget v2, v0, Ll/֡֫֫;->᩸:I

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v2

    if-ne v2, v9, :cond_7

    goto/16 :goto_5

    .line 955
    :cond_7
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v5

    float-to-int v5, v5

    .line 956
    iget v8, v0, Ll/֡֫֫;->᩺:I

    sub-int/2addr v8, v5

    .line 957
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v9

    .line 2016
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v12

    int-to-float v12, v12

    div-float/2addr v9, v12

    int-to-float v12, v8

    .line 2017
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v13

    int-to-float v13, v13

    div-float/2addr v12, v13

    .line 2018
    invoke-static {v10}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;)F

    move-result v13

    cmpl-float v13, v13, v6

    if-eqz v13, :cond_9

    neg-float v11, v12

    .line 2019
    invoke-static {v10, v11, v9}, Ll/᩻֫֫;->ۧ(Landroid/widget/EdgeEffect;FF)F

    move-result v9

    neg-float v9, v9

    .line 2020
    invoke-static {v10}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;)F

    move-result v11

    cmpl-float v6, v11, v6

    if-nez v6, :cond_8

    .line 2021
    invoke-virtual {v10}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_8
    :goto_0
    move v6, v9

    goto :goto_1

    .line 2023
    :cond_9
    invoke-static {v11}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;)F

    move-result v10

    cmpl-float v10, v10, v6

    if-eqz v10, :cond_a

    const/high16 v10, 0x3f800000    # 1.0f

    sub-float/2addr v10, v9

    .line 2024
    invoke-static {v11, v12, v10}, Ll/᩻֫֫;->ۧ(Landroid/widget/EdgeEffect;FF)F

    move-result v9

    .line 2026
    invoke-static {v11}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;)F

    move-result v10

    cmpl-float v6, v10, v6

    if-nez v6, :cond_8

    .line 2027
    invoke-virtual {v11}, Landroid/widget/EdgeEffect;->onRelease()V

    goto :goto_0

    .line 2030
    :cond_a
    :goto_1
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v9

    int-to-float v9, v9

    mul-float v6, v6, v9

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    if-eqz v6, :cond_b

    .line 2032
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->invalidate()V

    :cond_b
    sub-int/2addr v8, v6

    .line 961
    iget-boolean v6, v0, Ll/֡֫֫;->ۤ:Z

    if-nez v6, :cond_e

    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    move-result v6

    iget v9, v0, Ll/֡֫֫;->ۖ֫:I

    if-le v6, v9, :cond_e

    .line 962
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    if-eqz v6, :cond_c

    .line 964
    invoke-interface {v6, v7}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 966
    :cond_c
    iput-boolean v7, v0, Ll/֡֫֫;->ۤ:Z

    if-lez v8, :cond_d

    .line 968
    iget v6, v0, Ll/֡֫֫;->ۖ֫:I

    sub-int/2addr v8, v6

    goto :goto_2

    .line 970
    :cond_d
    iget v6, v0, Ll/֡֫֫;->ۖ֫:I

    add-int/2addr v8, v6

    .line 974
    :cond_e
    :goto_2
    iget-boolean v6, v0, Ll/֡֫֫;->ۤ:Z

    if-eqz v6, :cond_1b

    .line 975
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    float-to-int v1, v1

    .line 976
    invoke-direct {v0, v8, v1, v3, v3}, Ll/֡֫֫;->֫(IIIZ)I

    move-result v1

    sub-int/2addr v5, v1

    .line 978
    iput v5, v0, Ll/֡֫֫;->᩺:I

    .line 979
    iget v2, v0, Ll/֡֫֫;->ܽ֫:I

    add-int/2addr v2, v1

    iput v2, v0, Ll/֡֫֫;->ܽ֫:I

    goto/16 :goto_5

    .line 985
    :cond_f
    iget-object v1, v0, Ll/֡֫֫;->ۘ֫:Landroid/view/VelocityTracker;

    .line 986
    iget v2, v0, Ll/֡֫֫;->֫֫:I

    int-to-float v2, v2

    const/16 v5, 0x3e8

    invoke-virtual {v1, v5, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 987
    iget v2, v0, Ll/֡֫֫;->᩸:I

    invoke-virtual {v1, v2}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v1

    float-to-int v1, v1

    .line 988
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v2

    iget v5, v0, Ll/֡֫֫;->ۧ֫:I

    if-lt v2, v5, :cond_14

    .line 1268
    invoke-static {v10}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;)F

    move-result v2

    cmpl-float v2, v2, v6

    if-eqz v2, :cond_11

    .line 1269
    invoke-direct {v0, v10, v1}, Ll/֡֫֫;->֫(Landroid/widget/EdgeEffect;I)Z

    move-result v2

    if-eqz v2, :cond_10

    .line 1270
    invoke-virtual {v10, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_3

    :cond_10
    neg-int v1, v1

    .line 1272
    invoke-virtual {v0, v1}, Ll/֡֫֫;->ۧ(I)V

    goto :goto_3

    .line 1274
    :cond_11
    invoke-static {v11}, Ll/᩻֫֫;->֫(Landroid/widget/EdgeEffect;)F

    move-result v2

    cmpl-float v2, v2, v6

    if-eqz v2, :cond_13

    neg-int v1, v1

    .line 1275
    invoke-direct {v0, v11, v1}, Ll/֡֫֫;->֫(Landroid/widget/EdgeEffect;I)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 1276
    invoke-virtual {v11, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_3

    .line 1278
    :cond_12
    invoke-virtual {v0, v1}, Ll/֡֫֫;->ۧ(I)V

    goto :goto_3

    :cond_13
    neg-int v1, v1

    int-to-float v2, v1

    .line 368
    iget-object v5, v0, Ll/֡֫֫;->᩹:Ll/ܰۛ;

    invoke-virtual {v5, v6, v2}, Ll/ܰۛ;->֫(FF)Z

    move-result v5

    if-nez v5, :cond_15

    .line 991
    invoke-virtual {v0, v6, v2, v7}, Ll/֡֫֫;->dispatchNestedFling(FFZ)Z

    .line 992
    invoke-virtual {v0, v1}, Ll/֡֫֫;->ۧ(I)V

    goto :goto_3

    .line 994
    :cond_14
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollX()I

    move-result v13

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getScrollY()I

    move-result v14

    const/16 v17, 0x0

    .line 995
    invoke-virtual/range {p0 .. p0}, Ll/֡֫֫;->֫()I

    move-result v18

    .line 994
    iget-object v12, v0, Ll/֡֫֫;->ۢ֫:Landroid/widget/OverScroller;

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-virtual/range {v12 .. v18}, Landroid/widget/OverScroller;->springBack(IIIIII)Z

    move-result v1

    if-eqz v1, :cond_15

    .line 996
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 1045
    :cond_15
    :goto_3
    iput v9, v0, Ll/֡֫֫;->᩸:I

    .line 1046
    iput-boolean v3, v0, Ll/֡֫֫;->ۤ:Z

    .line 778
    iget-object v1, v0, Ll/֡֫֫;->ۘ֫:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_16

    .line 779
    :goto_4
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V

    .line 780
    iput-object v8, v0, Ll/֡֫֫;->ۘ֫:Landroid/view/VelocityTracker;

    .line 1049
    :cond_16
    invoke-virtual {v0, v3}, Ll/֡֫֫;->ܳ(I)V

    .line 1051
    invoke-virtual {v10}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 1052
    invoke-virtual {v11}, Landroid/widget/EdgeEffect;->onRelease()V

    goto :goto_5

    .line 919
    :cond_17
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-nez v2, :cond_18

    return v3

    .line 925
    :cond_18
    iget-boolean v2, v0, Ll/֡֫֫;->ۤ:Z

    if-eqz v2, :cond_19

    .line 926
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eqz v2, :cond_19

    .line 928
    invoke-interface {v2, v7}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 936
    :cond_19
    iget-object v2, v0, Ll/֡֫֫;->ۢ֫:Landroid/widget/OverScroller;

    invoke-virtual {v2}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v2

    if-nez v2, :cond_1a

    .line 2048
    iget-object v2, v0, Ll/֡֫֫;->ۢ֫:Landroid/widget/OverScroller;

    invoke-virtual {v2}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 2049
    invoke-virtual {v0, v7}, Ll/֡֫֫;->ܳ(I)V

    .line 941
    :cond_1a
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    .line 942
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    .line 1038
    iput v2, v0, Ll/֡֫֫;->᩺:I

    .line 1039
    iput v1, v0, Ll/֡֫֫;->᩸:I

    .line 1040
    invoke-virtual {v0, v5, v3}, Ll/֡֫֫;->֫(II)Z

    .line 1028
    :cond_1b
    :goto_5
    iget-object v1, v0, Ll/֡֫֫;->ۘ֫:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_1c

    .line 1029
    invoke-virtual {v1, v4}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 1032
    :cond_1c
    invoke-virtual {v4}, Landroid/view/MotionEvent;->recycle()V

    return v7
.end method

.method public final requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .locals 2

    .line 2166
    iget-boolean v0, p0, Ll/֡֫֫;->ۨ:Z

    if-nez v0, :cond_0

    .line 2058
    iget-object v0, p0, Ll/֡֫֫;->ܺ֫:Landroid/graphics/Rect;

    invoke-virtual {p2, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 2061
    invoke-virtual {p0, p2, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 2063
    invoke-virtual {p0, v0}, Ll/֡֫֫;->֫(Landroid/graphics/Rect;)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 2066
    invoke-virtual {p0, v1, v0}, Landroid/view/View;->scrollBy(II)V

    goto :goto_0

    .line 2170
    :cond_0
    iput-object p2, p0, Ll/֡֫֫;->᩶:Landroid/view/View;

    .line 2172
    :cond_1
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public final requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 2

    .line 2215
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v1

    sub-int/2addr v0, v1

    .line 2216
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result p1

    sub-int/2addr v1, p1

    .line 2215
    invoke-virtual {p2, v0, v1}, Landroid/graphics/Rect;->offset(II)V

    .line 2079
    invoke-virtual {p0, p2}, Ll/֡֫֫;->֫(Landroid/graphics/Rect;)I

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    if-eqz p3, :cond_1

    .line 2083
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->scrollBy(II)V

    return v0

    .line 1763
    :cond_1
    invoke-direct {p0, p2, p1, p2}, Ll/֡֫֫;->֫(IIZ)V

    :cond_2
    return v0
.end method

.method public final requestDisallowInterceptTouchEvent(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 778
    iget-object v0, p0, Ll/֡֫֫;->ۘ֫:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    .line 779
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    .line 780
    iput-object v0, p0, Ll/֡֫֫;->ۘ֫:Landroid/view/VelocityTracker;

    .line 789
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->requestDisallowInterceptTouchEvent(Z)V

    return-void
.end method

.method public final requestLayout()V
    .locals 1

    const/4 v0, 0x1

    .line 2223
    iput-boolean v0, p0, Ll/֡֫֫;->ۨ:Z

    .line 2224
    invoke-super {p0}, Landroid/widget/FrameLayout;->requestLayout()V

    return-void
.end method

.method public final scrollTo(II)V
    .locals 6

    .line 2331
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_7

    const/4 v0, 0x0

    .line 2332
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 2333
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 2334
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    .line 2335
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    iget v4, v1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    add-int/2addr v3, v4

    iget v4, v1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    add-int/2addr v3, v4

    .line 2336
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    sub-int/2addr v4, v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v5

    sub-int/2addr v4, v5

    .line 2337
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget v5, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr v0, v5

    iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    if-ge v2, v3, :cond_1

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    add-int v1, v2, p1

    if-le v1, v3, :cond_2

    sub-int p1, v3, v2

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    :cond_2
    :goto_1
    if-ge v4, v0, :cond_4

    if-gez p2, :cond_3

    goto :goto_2

    :cond_3
    add-int v1, v4, p2

    if-le v1, v0, :cond_5

    sub-int p2, v0, v4

    goto :goto_3

    :cond_4
    :goto_2
    const/4 p2, 0x0

    .line 2340
    :cond_5
    :goto_3
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    if-ne p1, v0, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    if-eq p2, v0, :cond_7

    .line 2341
    :cond_6
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->scrollTo(II)V

    :cond_7
    return-void
.end method

.method public final setNestedScrollingEnabled(Z)V
    .locals 1

    .line 325
    iget-object v0, p0, Ll/֡֫֫;->᩹:Ll/ܰۛ;

    invoke-virtual {v0, p1}, Ll/ܰۛ;->֫(Z)V

    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final startNestedScroll(I)Z
    .locals 2

    const/4 v0, 0x0

    .line 290
    iget-object v1, p0, Ll/֡֫֫;->᩹:Ll/ܰۛ;

    invoke-virtual {v1, p1, v0}, Ll/ܰۛ;->֫(II)Z

    move-result p1

    return p1
.end method

.method public final stopNestedScroll()V
    .locals 1

    const/4 v0, 0x0

    .line 340
    invoke-virtual {p0, v0}, Ll/֡֫֫;->ܳ(I)V

    return-void
.end method

.method public final ֫()I
    .locals 4

    .line 1463
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    .line 1464
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 1465
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 1466
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget v3, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr v0, v3

    iget v2, v2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v2

    .line 1467
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    sub-int/2addr v0, v2

    .line 1468
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0

    :cond_0
    return v1
.end method

.method public final ֫(Landroid/graphics/Rect;)I
    .locals 10

    .line 2100
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 2102
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    .line 2103
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v2

    add-int v3, v2, v0

    .line 2107
    invoke-virtual {p0}, Landroid/view/View;->getVerticalFadingEdgeLength()I

    move-result v4

    .line 2112
    iget v5, p1, Landroid/graphics/Rect;->top:I

    if-lez v5, :cond_1

    add-int/2addr v2, v4

    .line 2119
    :cond_1
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 2120
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 2121
    iget v7, p1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v8

    iget v9, v6, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr v8, v9

    iget v9, v6, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v8, v9

    if-ge v7, v8, :cond_2

    sub-int v4, v3, v4

    goto :goto_0

    :cond_2
    move v4, v3

    .line 2127
    :goto_0
    iget v7, p1, Landroid/graphics/Rect;->bottom:I

    if-le v7, v4, :cond_4

    iget v8, p1, Landroid/graphics/Rect;->top:I

    if-le v8, v2, :cond_4

    .line 2132
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v1

    if-le v1, v0, :cond_3

    .line 2134
    iget p1, p1, Landroid/graphics/Rect;->top:I

    sub-int/2addr p1, v2

    goto :goto_1

    .line 2137
    :cond_3
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p1, v4

    .line 2141
    :goto_1
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v0

    iget v1, v6, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    sub-int/2addr v0, v3

    .line 2143
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1

    .line 2145
    :cond_4
    iget v3, p1, Landroid/graphics/Rect;->top:I

    if-ge v3, v2, :cond_6

    if-ge v7, v4, :cond_6

    .line 2150
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v3

    if-le v3, v0, :cond_5

    .line 2152
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v4, p1

    sub-int/2addr v1, v4

    goto :goto_2

    .line 2155
    :cond_5
    iget p1, p1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v2, p1

    sub-int/2addr v1, v2

    .line 2159
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p1

    neg-int p1, p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1

    :cond_6
    return v1
.end method

.method public final ֫(Ll/ۘ֫֫;)V
    .locals 0

    .line 581
    iput-object p1, p0, Ll/֡֫֫;->ᩳ֫:Ll/ۘ֫֫;

    return-void
.end method

.method public final ֫(I)Z
    .locals 8

    .line 1668
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    .line 1671
    :cond_0
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v1

    invoke-virtual {v1, p0, v0, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    .line 521
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float v2, v2, v3

    float-to-int v2, v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    .line 1675
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    invoke-direct {p0, v1, v2, v5}, Ll/֡֫֫;->֫(Landroid/view/View;II)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 1676
    iget-object v2, p0, Ll/֡֫֫;->ܺ֫:Landroid/graphics/Rect;

    invoke-virtual {v1, v2}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 1677
    invoke-virtual {p0, v1, v2}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 1678
    invoke-virtual {p0, v2}, Ll/֡֫֫;->֫(Landroid/graphics/Rect;)I

    move-result v2

    .line 1680
    invoke-direct {p0, v2, v3, v4, v4}, Ll/֡֫֫;->֫(IIIZ)I

    .line 1681
    invoke-virtual {v1, p1}, Landroid/view/View;->requestFocus(I)Z

    goto :goto_2

    :cond_1
    const/16 v1, 0x21

    const/16 v5, 0x82

    if-ne p1, v1, :cond_2

    .line 1687
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    if-ge v1, v2, :cond_2

    .line 1688
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v2

    goto :goto_0

    :cond_2
    if-ne p1, v5, :cond_3

    .line 1690
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-lez v1, :cond_3

    .line 1691
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 1692
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 1693
    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    iget v6, v6, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v1, v6

    .line 1694
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v6

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v7

    add-int/2addr v7, v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    sub-int/2addr v7, v6

    sub-int/2addr v1, v7

    .line 1695
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    :cond_3
    :goto_0
    if-nez v2, :cond_4

    return v3

    :cond_4
    if-ne p1, v5, :cond_5

    goto :goto_1

    :cond_5
    neg-int v2, v2

    .line 1703
    :goto_1
    invoke-direct {p0, v2, v3, v4, v4}, Ll/֡֫֫;->֫(IIIZ)I

    :goto_2
    if-eqz v0, :cond_6

    .line 1706
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 1726
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-direct {p0, v0, v3, p1}, Ll/֡֫֫;->֫(Landroid/view/View;II)Z

    move-result p1

    if-nez p1, :cond_6

    .line 1713
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    move-result p1

    const/high16 v0, 0x20000

    .line 1714
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 1715
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 1716
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    :cond_6
    return v4
.end method

.method public final ֫(II)Z
    .locals 1

    const/4 p1, 0x2

    .line 290
    iget-object v0, p0, Ll/֡֫֫;->᩹:Ll/ܰۛ;

    invoke-virtual {v0, p1, p2}, Ll/ܰۛ;->֫(II)Z

    move-result p1

    return p1
.end method

.method public final ֫(IIII)Z
    .locals 9

    .line 1407
    invoke-virtual {p0}, Landroid/view/View;->getOverScrollMode()I

    .line 1899
    invoke-super {p0}, Landroid/widget/FrameLayout;->computeHorizontalScrollRange()I

    .line 1911
    invoke-super {p0}, Landroid/widget/FrameLayout;->computeHorizontalScrollExtent()I

    .line 1411
    invoke-virtual {p0}, Ll/֡֫֫;->computeVerticalScrollRange()I

    .line 1893
    invoke-super {p0}, Landroid/widget/FrameLayout;->computeVerticalScrollExtent()I

    const/4 v0, 0x1

    add-int/2addr p3, p1

    const/4 p1, 0x0

    if-lez p2, :cond_0

    goto :goto_0

    :cond_0
    if-gez p2, :cond_1

    :goto_0
    const/4 p2, 0x1

    const/4 v1, 0x0

    const/4 p2, 0x0

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-le p3, p4, :cond_2

    const/4 p3, 0x1

    goto :goto_2

    :cond_2
    if-gez p3, :cond_3

    const/4 p3, 0x1

    const/4 p4, 0x0

    goto :goto_2

    :cond_3
    const/4 p4, 0x0

    move p4, p3

    const/4 p3, 0x0

    :goto_2
    if-eqz p3, :cond_4

    .line 300
    iget-object v2, p0, Ll/֡֫֫;->᩹:Ll/ܰۛ;

    invoke-virtual {v2, v0}, Ll/ܰۛ;->֫(I)Z

    move-result v2

    if-nez v2, :cond_4

    const/4 v7, 0x0

    .line 1453
    invoke-virtual {p0}, Ll/֡֫֫;->֫()I

    move-result v8

    iget-object v2, p0, Ll/֡֫֫;->ۢ֫:Landroid/widget/OverScroller;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v3, p2

    move v4, p4

    invoke-virtual/range {v2 .. v8}, Landroid/widget/OverScroller;->springBack(IIIIII)Z

    .line 1397
    :cond_4
    invoke-super {p0, p2, p4}, Landroid/widget/FrameLayout;->scrollTo(II)V

    if-nez v1, :cond_6

    if-eqz p3, :cond_5

    goto :goto_3

    :cond_5
    return p1

    :cond_6
    :goto_3
    return v0
.end method

.method public final ֫(II[I[II)Z
    .locals 6

    const/4 v4, 0x0

    .line 318
    iget-object v0, p0, Ll/֡֫֫;->᩹:Ll/ܰۛ;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Ll/ܰۛ;->֫(II[I[II)Z

    move-result p1

    return p1
.end method

.method public final ֫(Landroid/view/KeyEvent;)Z
    .locals 5

    .line 698
    iget-object v0, p0, Ll/֡֫֫;->ܺ֫:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 588
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/16 v1, 0x82

    const/4 v2, 0x0

    if-lez v0, :cond_a

    .line 589
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 590
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 591
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget v4, v3, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr v0, v4

    iget v3, v3, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v3

    .line 592
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    if-le v0, v3, :cond_a

    .line 714
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_c

    .line 715
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v3, 0x13

    const/16 v4, 0x21

    if-eq v0, v3, :cond_8

    const/16 v3, 0x14

    if-eq v0, v3, :cond_6

    const/16 v3, 0x3e

    if-eq v0, v3, :cond_4

    const/16 p1, 0x5c

    if-eq v0, p1, :cond_3

    const/16 p1, 0x5d

    if-eq v0, p1, :cond_2

    const/16 p1, 0x7a

    if-eq v0, p1, :cond_1

    const/16 p1, 0x7b

    if-eq v0, p1, :cond_0

    goto :goto_0

    .line 743
    :cond_0
    invoke-virtual {p0, v1}, Ll/֡֫֫;->ᩳ(I)V

    return v2

    .line 740
    :cond_1
    invoke-virtual {p0, v4}, Ll/֡֫֫;->ᩳ(I)V

    return v2

    .line 734
    :cond_2
    invoke-virtual {p0, v1}, Ll/֡֫֫;->ܽ(I)Z

    move-result p1

    return p1

    .line 731
    :cond_3
    invoke-virtual {p0, v4}, Ll/֡֫֫;->ܽ(I)Z

    move-result p1

    return p1

    .line 737
    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    move-result p1

    if-eqz p1, :cond_5

    const/16 v1, 0x21

    :cond_5
    invoke-virtual {p0, v1}, Ll/֡֫֫;->ᩳ(I)V

    return v2

    .line 724
    :cond_6
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isAltPressed()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 725
    invoke-virtual {p0, v1}, Ll/֡֫֫;->ܽ(I)Z

    move-result p1

    return p1

    .line 727
    :cond_7
    invoke-virtual {p0, v1}, Ll/֡֫֫;->֫(I)Z

    move-result p1

    return p1

    .line 717
    :cond_8
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isAltPressed()Z

    move-result p1

    if-eqz p1, :cond_9

    .line 718
    invoke-virtual {p0, v4}, Ll/֡֫֫;->ܽ(I)Z

    move-result p1

    return p1

    .line 720
    :cond_9
    invoke-virtual {p0, v4}, Ll/֡֫֫;->֫(I)Z

    move-result p1

    return p1

    .line 701
    :cond_a
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_c

    .line 702
    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object p1

    if-ne p1, p0, :cond_b

    const/4 p1, 0x0

    .line 704
    :cond_b
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v0

    invoke-virtual {v0, p0, p1, v1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_c

    if-eq p1, p0, :cond_c

    .line 708
    invoke-virtual {p1, v1}, Landroid/view/View;->requestFocus(I)Z

    move-result p1

    if-eqz p1, :cond_c

    const/4 p1, 0x1

    return p1

    :cond_c
    :goto_0
    return v2
.end method

.method public final ۧ()F
    .locals 5

    .line 1380
    iget v0, p0, Ll/֡֫֫;->ᩴ֫:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    .line 1381
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 1382
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 1383
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    const v3, 0x101004d

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v0, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1389
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 1388
    invoke-virtual {v0, v1}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    move-result v0

    iput v0, p0, Ll/֡֫֫;->ᩴ֫:F

    goto :goto_0

    .line 1385
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected theme to define listPreferredItemHeight."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1391
    :cond_1
    :goto_0
    iget v0, p0, Ll/֡֫֫;->ᩴ֫:F

    return v0
.end method

.method public final ۧ(I)V
    .locals 12

    .line 2312
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    .line 2314
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v3

    const/4 v10, 0x0

    const/4 v11, 0x0

    iget-object v1, p0, Ll/֡֫֫;->ۢ֫:Landroid/widget/OverScroller;

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/high16 v8, -0x80000000

    const v9, 0x7fffffff

    move v5, p1

    invoke-virtual/range {v1 .. v11}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V

    const/4 p1, 0x1

    const/4 v0, 0x2

    .line 2039
    invoke-virtual {p0, v0, p1}, Ll/֡֫֫;->֫(II)Z

    .line 2043
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p1

    iput p1, p0, Ll/֡֫֫;->۟:I

    .line 2044
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_0
    return-void
.end method

.method public final ܳ(I)V
    .locals 1

    .line 295
    iget-object v0, p0, Ll/֡֫֫;->᩹:Ll/ܰۛ;

    invoke-virtual {v0, p1}, Ll/ܰۛ;->ۧ(I)V

    return-void
.end method

.method public final ܽ(I)Z
    .locals 4

    const/16 v0, 0x82

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1606
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    .line 1608
    iget-object v3, p0, Ll/֡֫֫;->ܺ֫:Landroid/graphics/Rect;

    iput v1, v3, Landroid/graphics/Rect;->top:I

    .line 1609
    iput v2, v3, Landroid/graphics/Rect;->bottom:I

    if-eqz v0, :cond_1

    .line 1612
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_1

    add-int/lit8 v0, v0, -0x1

    .line 1614
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 1615
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 1616
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, v3, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v1, v2

    .line 1617
    iput v1, v3, Landroid/graphics/Rect;->top:I

    .line 1620
    :cond_1
    iget v0, v3, Landroid/graphics/Rect;->top:I

    iget v1, v3, Landroid/graphics/Rect;->bottom:I

    invoke-direct {p0, p1, v0, v1}, Ll/֡֫֫;->֫(III)Z

    move-result p1

    return p1
.end method

.method public final ܿ(I)V
    .locals 2

    .line 1854
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    rsub-int/lit8 v0, v0, 0x0

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    sub-int/2addr p1, v1

    const/4 v1, 0x1

    invoke-direct {p0, v0, p1, v1}, Ll/֡֫֫;->֫(IIZ)V

    return-void
.end method

.method public final ᩳ(I)V
    .locals 4

    const/16 v0, 0x82

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1568
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    .line 1570
    iget-object v3, p0, Ll/֡֫֫;->ܺ֫:Landroid/graphics/Rect;

    if-eqz v0, :cond_1

    .line 1571
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    add-int/2addr v0, v2

    iput v0, v3, Landroid/graphics/Rect;->top:I

    .line 1572
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_2

    add-int/lit8 v0, v0, -0x1

    .line 1574
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 1575
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 1576
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    add-int/2addr v1, v0

    .line 1577
    iget v0, v3, Landroid/graphics/Rect;->top:I

    add-int/2addr v0, v2

    if-le v0, v1, :cond_2

    sub-int/2addr v1, v2

    .line 1578
    iput v1, v3, Landroid/graphics/Rect;->top:I

    goto :goto_1

    .line 1582
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    sub-int/2addr v0, v2

    iput v0, v3, Landroid/graphics/Rect;->top:I

    if-gez v0, :cond_2

    .line 1584
    iput v1, v3, Landroid/graphics/Rect;->top:I

    .line 1587
    :cond_2
    :goto_1
    iget v0, v3, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, v0

    iput v2, v3, Landroid/graphics/Rect;->bottom:I

    .line 1589
    invoke-direct {p0, p1, v0, v2}, Ll/֡֫֫;->֫(III)Z

    return-void
.end method
