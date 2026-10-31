.class public Ll/ۧۚᩳ;
.super Ll/֡ܰۧ;
.source "97J6"


# instance fields
.field public ֫ۧ:Ll/ܰ֡ᩳ;

.field public final ۜۧ:[I

.field public ۟֫:Ll/֫ܿܿ;

.field public ۡۧ:Ll/ۤۤᩳ;

.field public ۢۧ:Ll/ۤۤᩳ;

.field public final ۧۧ:Ll/۠ܽܽ;

.field public ܳۧ:Z

.field public final ܺۧ:I

.field public ܽۧ:F

.field public ܿۧ:Ljava/util/ArrayList;

.field public ᩳۧ:F

.field public ᩷ۧ:Ljava/util/ArrayList;

.field public ᩻ۧ:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 39
    invoke-direct {p0, p1, p2}, Ll/֡ܰۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 28
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Ll/ۧۚᩳ;->᩷ۧ:Ljava/util/ArrayList;

    const/4 p2, 0x2

    new-array p2, p2, [I

    .line 45
    iput-object p2, p0, Ll/ۧۚᩳ;->ۜۧ:[I

    .line 51
    new-instance p2, Ll/۠ܽܽ;

    const/4 v0, 0x2

    invoke-direct {p2, v0, p0}, Ll/۠ܽܽ;-><init>(ILjava/lang/Object;)V

    iput-object p2, p0, Ll/ۧۚᩳ;->ۧۧ:Ll/۠ܽܽ;

    .line 40
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    iput p1, p0, Ll/ۧۚᩳ;->ܺۧ:I

    .line 41
    new-instance p1, Ll/۟֡ᩳ;

    invoke-direct {p1, p0}, Ll/۟֡ᩳ;-><init>(Ll/ۧۚᩳ;)V

    invoke-virtual {p0, p1}, Ll/֡ܰۧ;->֫(Ll/ۨ᩺ۧ;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۧۚᩳ;)V
    .locals 1

    const/4 v0, 0x1

    .line 52
    iput-boolean v0, p0, Ll/ۧۚᩳ;->ܳۧ:Z

    .line 53
    iget-object p0, p0, Ll/ۧۚᩳ;->֫ۧ:Ll/ܰ֡ᩳ;

    if-eqz p0, :cond_0

    .line 54
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->isPressed()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    invoke-virtual {p0}, Landroid/view/View;->performLongClick()Z

    :cond_0
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۧۚᩳ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧۚᩳ;->ܿۧ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ۧۚᩳ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۧۚᩳ;->᩷ۧ:Ljava/util/ArrayList;

    return-object p0
.end method


# virtual methods
.method public final onMeasure(II)V
    .locals 6

    .line 123
    iget-object v0, p0, Ll/ۧۚᩳ;->᩷ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫ۚᩳ;

    .line 124
    iget v4, v3, Ll/֫ۚᩳ;->ۧ:I

    iget-object v5, v3, Ll/֫ۚᩳ;->ܿ:Ll/ۨ֡ᩳ;

    if-eq v4, p1, :cond_1

    .line 125
    invoke-virtual {v5, p1, v1}, Landroid/view/View;->measure(II)V

    .line 126
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v4

    iput v4, v3, Ll/֫ۚᩳ;->ᩳ:I

    .line 127
    invoke-virtual {v5}, Ll/ۨ֡ᩳ;->ۧ()I

    move-result v4

    iput v4, v3, Ll/֫ۚᩳ;->ܽ:I

    .line 128
    iput p1, v3, Ll/֫ۚᩳ;->ۧ:I

    .line 130
    :cond_1
    iget v3, v3, Ll/֫ۚᩳ;->ᩳ:I

    if-le v3, v2, :cond_0

    move v2, v3

    goto :goto_0

    .line 134
    :cond_2
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, -0x80000000

    const/high16 v3, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_4

    if-eqz v0, :cond_3

    goto :goto_1

    .line 144
    :cond_3
    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    goto :goto_1

    .line 138
    :cond_4
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    if-le v0, v2, :cond_5

    .line 140
    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 147
    :cond_5
    :goto_1
    invoke-super {p0, p1, p2}, Ll/֡ܰۧ;->onMeasure(II)V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 61
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    iget-object v1, p0, Ll/ۧۚᩳ;->ۧۧ:Ll/۠ܽܽ;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_7

    const/4 v4, 0x0

    if-eq v0, v2, :cond_5

    const/4 v5, 0x2

    if-eq v0, v5, :cond_2

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    goto/16 :goto_0

    .line 108
    :cond_0
    iget-object v0, p0, Ll/ۧۚᩳ;->֫ۧ:Ll/ܰ֡ᩳ;

    if-eqz v0, :cond_8

    .line 109
    iget-boolean v0, p0, Ll/ۧۚᩳ;->ܳۧ:Z

    if-nez v0, :cond_1

    .line 110
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 112
    :cond_1
    iget-object v0, p0, Ll/ۧۚᩳ;->֫ۧ:Ll/ܰ֡ᩳ;

    invoke-virtual {v0, v3}, Landroid/view/View;->setPressed(Z)V

    .line 113
    iput-object v4, p0, Ll/ۧۚᩳ;->֫ۧ:Ll/ܰ֡ᩳ;

    goto/16 :goto_0

    .line 86
    :cond_2
    iget-boolean v0, p0, Ll/ۧۚᩳ;->᩻ۧ:Z

    if-nez v0, :cond_8

    iget-object v0, p0, Ll/ۧۚᩳ;->֫ۧ:Ll/ܰ֡ᩳ;

    if-eqz v0, :cond_8

    .line 87
    iget v0, p0, Ll/ۧۚᩳ;->ܽۧ:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    sub-float/2addr v0, v5

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v5, p0, Ll/ۧۚᩳ;->ܺۧ:I

    int-to-float v5, v5

    cmpl-float v0, v0, v5

    if-gtz v0, :cond_3

    iget v0, p0, Ll/ۧۚᩳ;->ᩳۧ:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    sub-float/2addr v0, v6

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpl-float v0, v0, v5

    if-lez v0, :cond_8

    .line 88
    :cond_3
    iput-boolean v2, p0, Ll/ۧۚᩳ;->᩻ۧ:Z

    .line 89
    iget-boolean v0, p0, Ll/ۧۚᩳ;->ܳۧ:Z

    if-nez v0, :cond_4

    .line 90
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 92
    :cond_4
    iget-object v0, p0, Ll/ۧۚᩳ;->֫ۧ:Ll/ܰ֡ᩳ;

    invoke-virtual {v0, v3}, Landroid/view/View;->setPressed(Z)V

    .line 93
    iput-object v4, p0, Ll/ۧۚᩳ;->֫ۧ:Ll/ܰ֡ᩳ;

    goto :goto_0

    .line 98
    :cond_5
    iget-object v0, p0, Ll/ۧۚᩳ;->֫ۧ:Ll/ܰ֡ᩳ;

    if-eqz v0, :cond_8

    .line 99
    iget-boolean v0, p0, Ll/ۧۚᩳ;->ܳۧ:Z

    if-nez v0, :cond_6

    .line 100
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 101
    iget-object v0, p0, Ll/ۧۚᩳ;->֫ۧ:Ll/ܰ֡ᩳ;

    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 103
    :cond_6
    iget-object v0, p0, Ll/ۧۚᩳ;->֫ۧ:Ll/ܰ֡ᩳ;

    invoke-virtual {v0, v3}, Landroid/view/View;->setPressed(Z)V

    .line 104
    iput-object v4, p0, Ll/ۧۚᩳ;->֫ۧ:Ll/ܰ֡ᩳ;

    goto :goto_0

    .line 63
    :cond_7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    invoke-static {p0, v0, v4}, Ll/᩷ۨۡ;->֫(Landroid/view/ViewGroup;FF)Landroid/view/View;

    move-result-object v0

    instance-of v4, v0, Ll/ܰ֡ᩳ;

    if-eqz v4, :cond_8

    check-cast v0, Ll/ܰ֡ᩳ;

    .line 64
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    iput v4, p0, Ll/ۧۚᩳ;->ܽۧ:F

    .line 65
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    iput v4, p0, Ll/ۧۚᩳ;->ᩳۧ:F

    .line 66
    iput-object v0, p0, Ll/ۧۚᩳ;->֫ۧ:Ll/ܰ֡ᩳ;

    .line 68
    iget-object v4, p0, Ll/ۧۚᩳ;->ۜۧ:[I

    invoke-virtual {p0, v4}, Landroid/view/View;->getLocationInWindow([I)V

    .line 69
    aget v5, v4, v3

    int-to-float v5, v5

    iget v6, p0, Ll/ۧۚᩳ;->ܽۧ:F

    add-float/2addr v5, v6

    float-to-int v5, v5

    .line 70
    aget v6, v4, v2

    int-to-float v6, v6

    iget v7, p0, Ll/ۧۚᩳ;->ᩳۧ:F

    add-float/2addr v6, v7

    float-to-int v6, v6

    .line 71
    invoke-virtual {v0, v4}, Landroid/view/View;->getLocationInWindow([I)V

    .line 72
    aget v0, v4, v3

    sub-int/2addr v5, v0

    .line 73
    aget v0, v4, v2

    sub-int/2addr v6, v0

    .line 74
    iget-object v0, p0, Ll/ۧۚᩳ;->֫ۧ:Ll/ܰ֡ᩳ;

    int-to-float v4, v5

    int-to-float v5, v6

    invoke-virtual {v0, v4, v5}, Landroid/view/View;->drawableHotspotChanged(FF)V

    .line 75
    iget-object v0, p0, Ll/ۧۚᩳ;->֫ۧ:Ll/ܰ֡ᩳ;

    invoke-virtual {v0, v2}, Landroid/view/View;->setPressed(Z)V

    .line 77
    iput-boolean v3, p0, Ll/ۧۚᩳ;->ܳۧ:Z

    .line 78
    iput-boolean v3, p0, Ll/ۧۚᩳ;->᩻ۧ:Z

    .line 79
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object v0

    .line 80
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 81
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v2

    int-to-long v2, v2

    .line 82
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 117
    :cond_8
    :goto_0
    invoke-super {p0, p1}, Ll/֡ܰۧ;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/util/ArrayList;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 158
    iget-object v2, v0, Ll/ۧۚᩳ;->۟֫:Ll/֫ܿܿ;

    if-eqz v2, :cond_b

    iget-object v2, v0, Ll/ۧۚᩳ;->ۡۧ:Ll/ۤۤᩳ;

    if-eqz v2, :cond_b

    iget-object v2, v0, Ll/ۧۚᩳ;->ۢۧ:Ll/ۤۤᩳ;

    if-nez v2, :cond_0

    goto/16 :goto_7

    .line 162
    :cond_0
    iput-object v1, v0, Ll/ۧۚᩳ;->ܿۧ:Ljava/util/ArrayList;

    .line 163
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 164
    :goto_0
    iget-object v3, v0, Ll/ۧۚᩳ;->᩷ۧ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-le v2, v4, :cond_1

    .line 165
    new-instance v4, Ll/֫ۚᩳ;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-direct {v4, v0, v5}, Ll/֫ۚᩳ;-><init>(Ll/ۧۚᩳ;I)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 167
    :cond_1
    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x1

    if-ge v2, v4, :cond_2

    .line 0
    invoke-static {v3, v5}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    goto :goto_1

    .line 170
    :cond_2
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֫ۚᩳ;

    .line 258
    iget v5, v4, Ll/֫ۚᩳ;->֫:I

    iget-object v6, v4, Ll/֫ۚᩳ;->ܿ:Ll/ۨ֡ᩳ;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۚܳܿ;

    .line 259
    invoke-virtual {v5}, Ll/ۚܳܿ;->֫()Ljava/util/List;

    move-result-object v5

    iget-object v7, v4, Ll/֫ۚᩳ;->ܳ:Ll/ۧۚᩳ;

    iget-object v8, v7, Ll/ۧۚᩳ;->۟֫:Ll/֫ܿܿ;

    iget-object v9, v7, Ll/ۧۚᩳ;->ۡۧ:Ll/ۤۤᩳ;

    iget-object v7, v7, Ll/ۧۚᩳ;->ۢۧ:Ll/ۤۤᩳ;

    .line 138
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v10

    .line 139
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11, v10}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_3
    if-ge v13, v10, :cond_4

    .line 141
    invoke-virtual {v6, v13}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v14

    .line 142
    instance-of v15, v14, Ll/ܰ֡ᩳ;

    if-eqz v15, :cond_3

    .line 143
    check-cast v14, Ll/ܰ֡ᩳ;

    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v13, v13, 0x1

    goto :goto_3

    .line 146
    :cond_4
    invoke-virtual {v6}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 148
    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v10, 0x0

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ܶܳܿ;

    .line 150
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v14

    if-ge v10, v14, :cond_5

    add-int/lit8 v14, v10, 0x1

    .line 151
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܰ֡ᩳ;

    goto :goto_5

    .line 153
    :cond_5
    new-instance v14, Ll/ܰ֡ᩳ;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v15

    invoke-direct {v14, v15}, Ll/ܰ֡ᩳ;-><init>(Landroid/content/Context;)V

    move-object/from16 v16, v14

    move v14, v10

    move-object/from16 v10, v16

    .line 155
    :goto_5
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    invoke-virtual {v13}, Ll/ܶܳܿ;->ᩳ()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v10, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    invoke-interface {v8}, Ll/֫ܿܿ;->֫()Ll/۫ۨᩳ;

    move-result-object v15

    if-eqz v15, :cond_6

    .line 59
    invoke-virtual {v15}, Ll/۫ۨᩳ;->ᩳۧ()I

    move-result v15

    invoke-virtual {v10, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 103
    :cond_6
    new-instance v15, Ll/᩺֡ᩳ;

    invoke-direct {v15, v13, v9, v7, v8}, Ll/᩺֡ᩳ;-><init>(Ll/ܶܳܿ;Ll/ۤۤᩳ;Ll/ۤۤᩳ;Ll/֫ܿܿ;)V

    .line 104
    invoke-virtual {v10, v15}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 105
    invoke-virtual {v10, v15}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 106
    invoke-virtual {v10, v12}, Landroid/view/View;->setClickable(Z)V

    .line 107
    invoke-virtual {v10, v12}, Landroid/view/View;->setLongClickable(Z)V

    .line 156
    invoke-virtual {v6, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move v10, v14

    goto :goto_4

    .line 260
    :cond_7
    iput v12, v4, Ll/֫ۚᩳ;->ۧ:I

    .line 275
    invoke-virtual {v6, v12}, Landroid/view/View;->setScrollY(I)V

    .line 295
    invoke-virtual {v6}, Ll/ۨ֡ᩳ;->֫()V

    .line 279
    invoke-virtual {v6}, Ll/ۨ֡ᩳ;->ܽ()V

    goto/16 :goto_2

    .line 173
    :cond_8
    invoke-virtual/range {p0 .. p0}, Ll/֡ܰۧ;->ܽ()I

    move-result v1

    .line 174
    new-instance v3, Ll/۟֡ᩳ;

    invoke-direct {v3, v0}, Ll/۟֡ᩳ;-><init>(Ll/ۧۚᩳ;)V

    invoke-virtual {v0, v3}, Ll/֡ܰۧ;->֫(Ll/ۨ᩺ۧ;)V

    if-ltz v1, :cond_9

    if-ge v1, v2, :cond_9

    .line 176
    invoke-virtual {v0, v1}, Ll/֡ܰۧ;->ᩳ(I)V

    goto :goto_6

    :cond_9
    if-ne v1, v2, :cond_a

    add-int/lit8 v1, v1, -0x1

    .line 178
    invoke-virtual {v0, v1}, Ll/֡ܰۧ;->ᩳ(I)V

    .line 180
    :cond_a
    :goto_6
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->requestLayout()V

    :cond_b
    :goto_7
    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;Ll/֫ܿܿ;Ll/ۤۤᩳ;Ll/ۤۤᩳ;)V
    .locals 0

    .line 151
    iput-object p2, p0, Ll/ۧۚᩳ;->۟֫:Ll/֫ܿܿ;

    .line 152
    iput-object p3, p0, Ll/ۧۚᩳ;->ۡۧ:Ll/ۤۤᩳ;

    .line 153
    iput-object p4, p0, Ll/ۧۚᩳ;->ۢۧ:Ll/ۤۤᩳ;

    .line 154
    invoke-virtual {p0, p1}, Ll/ۧۚᩳ;->֫(Ljava/util/ArrayList;)V

    return-void
.end method

.method public final ۜ()I
    .locals 2

    .line 184
    iget-object v0, p0, Ll/ۧۚᩳ;->᩷ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۚᩳ;

    .line 185
    iget v1, v1, Ll/֫ۚᩳ;->ܽ:I

    if-eqz v1, :cond_0

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()V
    .locals 3

    .line 202
    iget-object v0, p0, Ll/ۧۚᩳ;->᩷ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۚᩳ;

    .line 275
    iget-object v1, v1, Ll/֫ۚᩳ;->ܿ:Ll/ۨ֡ᩳ;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setScrollY(I)V

    .line 295
    invoke-virtual {v1}, Ll/ۨ֡ᩳ;->֫()V

    .line 279
    invoke-virtual {v1}, Ll/ۨ֡ᩳ;->ܽ()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ᩻()Ll/֫ۚᩳ;
    .locals 3

    .line 194
    invoke-virtual {p0}, Ll/֡ܰۧ;->ܽ()I

    move-result v0

    if-ltz v0, :cond_0

    .line 195
    iget-object v1, p0, Ll/ۧۚᩳ;->᩷ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 196
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ۚᩳ;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
