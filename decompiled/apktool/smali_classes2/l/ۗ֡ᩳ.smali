.class public Ll/ۗ֡ᩳ;
.super Landroid/view/View;
.source "Z7IM"


# instance fields
.field public ۗ:Ll/ۛ֡ᩳ;

.field public ۙ:Landroid/view/MotionEvent;

.field public ۛ:F

.field public ۤ:F

.field public final ۫:F

.field public final ۬:[I

.field public ᩶:Landroid/view/View;

.field public ᩸:I

.field public ᩹:Ll/ܽܰᩳ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 37
    invoke-direct {p0, p1, p2, v0}, Ll/ۗ֡ᩳ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, 0x2

    new-array p2, p2, [I

    .line 22
    iput-object p2, p0, Ll/ۗ֡ᩳ;->۬:[I

    .line 42
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Ll/ۗ֡ᩳ;->۫:F

    const/4 p1, 0x1

    .line 43
    invoke-virtual {p0, p1}, Landroid/view/View;->setFocusable(Z)V

    return-void
.end method

.method private ֫(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 133
    iget v0, p0, Ll/ۗ֡ᩳ;->᩸:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 134
    iget-object v0, p0, Ll/ۗ֡ᩳ;->ۗ:Ll/ۛ֡ᩳ;

    invoke-direct {p0, v0, p1}, Ll/ۗ֡ᩳ;->֫(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    .line 136
    iget-object v0, p0, Ll/ۗ֡ᩳ;->᩶:Landroid/view/View;

    invoke-direct {p0, v0, p1}, Ll/ۗ֡ᩳ;->֫(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_1
    return v1
.end method

.method private ֫(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 170
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 173
    :cond_0
    invoke-static {p2}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v1

    .line 174
    iget-object v2, p0, Ll/ۗ֡ᩳ;->۬:[I

    invoke-virtual {p1, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 175
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result v3

    aget v0, v2, v0

    int-to-float v0, v0

    sub-float/2addr v3, v0

    .line 176
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    const/4 v4, 0x1

    aget v2, v2, v4

    int-to-float v2, v2

    sub-float/2addr v0, v2

    .line 177
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    sub-float/2addr v3, v2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    sub-float/2addr v0, p2

    invoke-virtual {v1, v3, v0}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 178
    invoke-virtual {p1, v1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    .line 179
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    return p1

    :cond_1
    :goto_0
    return v0
.end method


# virtual methods
.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 61
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_c

    const/4 v4, 0x2

    if-eq v0, v3, :cond_9

    const/4 v5, 0x3

    if-eq v0, v4, :cond_0

    if-eq v0, v5, :cond_9

    .line 70
    invoke-direct {p0, p1}, Ll/ۗ֡ᩳ;->֫(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 97
    :cond_0
    iget v0, p0, Ll/ۗ֡ᩳ;->᩸:I

    if-eq v0, v3, :cond_8

    if-ne v0, v4, :cond_1

    goto :goto_3

    .line 100
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    iget v2, p0, Ll/ۗ֡ᩳ;->ۤ:F

    sub-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 101
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v2

    iget v6, p0, Ll/ۗ֡ᩳ;->ۛ:F

    sub-float/2addr v2, v6

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    .line 102
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    move-result v6

    iget v7, p0, Ll/ۗ֡ᩳ;->۫:F

    cmpg-float v6, v6, v7

    if-gtz v6, :cond_2

    return v3

    :cond_2
    cmpl-float v0, v2, v0

    if-lez v0, :cond_6

    .line 106
    iput v3, p0, Ll/ۗ֡ᩳ;->᩸:I

    .line 157
    iget-object v0, p0, Ll/ۗ֡ᩳ;->᩶:Landroid/view/View;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    .line 160
    :cond_3
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    .line 161
    invoke-virtual {v0, v5}, Landroid/view/MotionEvent;->setAction(I)V

    .line 162
    iget-object v2, p0, Ll/ۗ֡ᩳ;->᩶:Landroid/view/View;

    invoke-direct {p0, v2, v0}, Ll/ۗ֡ᩳ;->֫(Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 163
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 145
    :cond_4
    :goto_0
    iget-object v0, p0, Ll/ۗ֡ᩳ;->ۙ:Landroid/view/MotionEvent;

    if-nez v0, :cond_5

    goto :goto_2

    .line 148
    :cond_5
    iget-object v2, p0, Ll/ۗ֡ᩳ;->ۗ:Ll/ۛ֡ᩳ;

    invoke-direct {p0, v2, v0}, Ll/ۗ֡ᩳ;->֫(Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 187
    iget-object v0, p0, Ll/ۗ֡ᩳ;->ۙ:Landroid/view/MotionEvent;

    if-eqz v0, :cond_7

    goto :goto_1

    .line 110
    :cond_6
    iput v4, p0, Ll/ۗ֡ᩳ;->᩸:I

    .line 187
    iget-object v0, p0, Ll/ۗ֡ᩳ;->ۙ:Landroid/view/MotionEvent;

    if-eqz v0, :cond_7

    .line 188
    :goto_1
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 189
    iput-object v1, p0, Ll/ۗ֡ᩳ;->ۙ:Landroid/view/MotionEvent;

    .line 113
    :cond_7
    :goto_2
    invoke-direct {p0, p1}, Ll/ۗ֡ᩳ;->֫(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 98
    :cond_8
    :goto_3
    invoke-direct {p0, p1}, Ll/ۗ֡ᩳ;->֫(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 120
    :cond_9
    iget v0, p0, Ll/ۗ֡ᩳ;->᩸:I

    if-nez v0, :cond_a

    .line 121
    iput v4, p0, Ll/ۗ֡ᩳ;->᩸:I

    .line 123
    :cond_a
    invoke-direct {p0, p1}, Ll/ۗ֡ᩳ;->֫(Landroid/view/MotionEvent;)Z

    move-result p1

    .line 187
    iget-object v0, p0, Ll/ۗ֡ᩳ;->ۙ:Landroid/view/MotionEvent;

    if-eqz v0, :cond_b

    .line 188
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 189
    iput-object v1, p0, Ll/ۗ֡ᩳ;->ۙ:Landroid/view/MotionEvent;

    .line 125
    :cond_b
    iput v2, p0, Ll/ۗ֡ᩳ;->᩸:I

    return p1

    .line 187
    :cond_c
    iget-object v0, p0, Ll/ۗ֡ᩳ;->ۙ:Landroid/view/MotionEvent;

    if-eqz v0, :cond_d

    .line 188
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 189
    iput-object v1, p0, Ll/ۗ֡ᩳ;->ۙ:Landroid/view/MotionEvent;

    .line 78
    :cond_d
    iput v2, p0, Ll/ۗ֡ᩳ;->᩸:I

    .line 80
    iget-object v0, p0, Ll/ۗ֡ᩳ;->᩹:Ll/ܽܰᩳ;

    if-eqz v0, :cond_e

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v4

    invoke-interface {v0, v1, v4}, Ll/ܽܰᩳ;->֫(FF)Z

    move-result v0

    if-eqz v0, :cond_e

    goto :goto_4

    .line 83
    :cond_e
    iget-object v0, p0, Ll/ۗ֡ᩳ;->ۗ:Ll/ۛ֡ᩳ;

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_f

    goto :goto_4

    .line 86
    :cond_f
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    iput v0, p0, Ll/ۗ֡ᩳ;->ۤ:F

    .line 87
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    iput v0, p0, Ll/ۗ֡ᩳ;->ۛ:F

    .line 88
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    iput-object v0, p0, Ll/ۗ֡ᩳ;->ۙ:Landroid/view/MotionEvent;

    .line 89
    iget-object v0, p0, Ll/ۗ֡ᩳ;->᩶:Landroid/view/View;

    invoke-direct {p0, v0, p1}, Ll/ۗ֡ᩳ;->֫(Landroid/view/View;Landroid/view/MotionEvent;)Z

    return v3

    :cond_10
    :goto_4
    return v2
.end method

.method public final ֫(Ll/ۛ֡ᩳ;Ll/ܽܰᩳ;Landroid/view/View;)V
    .locals 0

    .line 54
    iput-object p1, p0, Ll/ۗ֡ᩳ;->ۗ:Ll/ۛ֡ᩳ;

    .line 55
    iput-object p2, p0, Ll/ۗ֡ᩳ;->᩹:Ll/ܽܰᩳ;

    .line 56
    iput-object p3, p0, Ll/ۗ֡ᩳ;->᩶:Landroid/view/View;

    return-void
.end method
