.class public final Ll/ۙۡۡ;
.super Ljava/lang/Object;
.source "J5LW"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# static fields
.field public static final ᩺:I


# instance fields
.field public ۗ:F

.field public ۙ:F

.field public ۛ:Z

.field public ۤ:Z

.field public ۨ:Z

.field public ۫:I

.field public ۬:Landroid/widget/ListView;

.field public ᩶:Landroid/view/View;

.field public final ᩸:Ll/۫ۢܳ;

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/high16 v0, 0x42040000    # 33.0f

    .line 28
    invoke-static {v0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v0

    sput v0, Ll/ۙۡۡ;->᩺:I

    return-void
.end method

.method public constructor <init>(Ll/۫ۢܳ;Ll/ۢۢۡ;)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 201
    iput-boolean v0, p0, Ll/ۙۡۡ;->ۨ:Z

    if-eqz p2, :cond_0

    .line 41
    iput-object p2, p0, Ll/ۙۡۡ;->۬:Landroid/widget/ListView;

    .line 42
    iget v0, p0, Ll/ۙۡۡ;->۫:I

    if-nez v0, :cond_0

    .line 43
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p2

    .line 44
    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p2

    iput p2, p0, Ll/ۙۡۡ;->۫:I

    .line 51
    :cond_0
    iput-object p1, p0, Ll/ۙۡۡ;->᩸:Ll/۫ۢܳ;

    return-void
.end method

.method private ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 188
    iput v0, p0, Ll/ۙۡۡ;->ۙ:F

    .line 189
    iput v0, p0, Ll/ۙۡۡ;->ۗ:F

    const/4 v0, -0x1

    .line 190
    iput v0, p0, Ll/ۙۡۡ;->᩹:I

    const/4 v0, 0x0

    .line 191
    iput-object v0, p0, Ll/ۙۡۡ;->᩶:Landroid/view/View;

    const/4 v0, 0x0

    .line 192
    iput-boolean v0, p0, Ll/ۙۡۡ;->ۤ:Z

    .line 193
    iput-boolean v0, p0, Ll/ۙۡۡ;->ۛ:Z

    const/4 v0, 0x1

    .line 194
    iput-boolean v0, p0, Ll/ۙۡۡ;->ۨ:Z

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 11

    .line 76
    iget-object p1, p0, Ll/ۙۡۡ;->۬:Landroid/widget/ListView;

    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    .line 77
    invoke-direct {p0}, Ll/ۙۡۡ;->֫()V

    return v0

    .line 81
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    iget-object v1, p0, Ll/ۙۡۡ;->᩸:Ll/۫ۢܳ;

    if-eqz p1, :cond_f

    sget v2, Ll/ۙۡۡ;->᩺:I

    const/high16 v3, 0x3f400000    # 0.75f

    const/4 v4, 0x1

    if-eq p1, v4, :cond_d

    const/4 v5, 0x2

    const/4 v6, 0x3

    if-eq p1, v5, :cond_3

    if-eq p1, v6, :cond_1

    goto/16 :goto_5

    .line 130
    :cond_1
    iget-boolean p1, p0, Ll/ۙۡۡ;->ۤ:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Ll/ۙۡۡ;->᩶:Landroid/view/View;

    if-eqz p1, :cond_2

    .line 131
    invoke-virtual {p1, v0, v0}, Landroid/view/View;->scrollTo(II)V

    .line 133
    :cond_2
    invoke-direct {p0}, Ll/ۙۡۡ;->֫()V

    return v0

    .line 138
    :cond_3
    iget-object p1, p0, Ll/ۙۡۡ;->᩶:Landroid/view/View;

    if-nez p1, :cond_4

    goto/16 :goto_5

    .line 140
    :cond_4
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iget v5, p0, Ll/ۙۡۡ;->ۙ:F

    sub-float/2addr p1, v5

    mul-float p1, p1, v3

    float-to-int p1, p1

    .line 141
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    iget v5, p0, Ll/ۙۡۡ;->ۗ:F

    sub-float/2addr v3, v5

    float-to-int v3, v3

    .line 142
    iget-boolean v5, p0, Ll/ۙۡۡ;->ۛ:Z

    if-nez v5, :cond_6

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v5

    iget v7, p0, Ll/ۙۡۡ;->۫:I

    if-le v5, v7, :cond_6

    .line 143
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    iget v5, p0, Ll/ۙۡۡ;->۫:I

    if-ge v3, v5, :cond_5

    .line 144
    iput-boolean v4, p0, Ll/ۙۡۡ;->ۤ:Z

    .line 145
    iget-object v3, p0, Ll/ۙۡۡ;->۬:Landroid/widget/ListView;

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 148
    invoke-static {p2}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v3

    .line 150
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result p2

    shl-int/lit8 p2, p2, 0x8

    or-int/2addr p2, v6

    .line 149
    invoke-virtual {v3, p2}, Landroid/view/MotionEvent;->setAction(I)V

    .line 152
    iget-object p2, p0, Ll/ۙۡۡ;->۬:Landroid/widget/ListView;

    invoke-virtual {p2, v3}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 153
    invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V

    goto :goto_0

    .line 155
    :cond_5
    iput-boolean v4, p0, Ll/ۙۡۡ;->ۛ:Z

    .line 159
    :cond_6
    :goto_0
    iget-boolean p2, p0, Ll/ۙۡۡ;->ۤ:Z

    if-eqz p2, :cond_13

    neg-int p2, v2

    if-gt p1, p2, :cond_8

    .line 162
    iget-boolean p1, p0, Ll/ۙۡۡ;->ۨ:Z

    if-eqz p1, :cond_7

    .line 163
    invoke-virtual {v1}, Ll/۫ۢܳ;->ܽ()V

    .line 164
    iput-boolean v0, p0, Ll/ۙۡۡ;->ۨ:Z

    :cond_7
    move p1, p2

    goto :goto_1

    :cond_8
    if-lt p1, v2, :cond_a

    .line 168
    iget-boolean p1, p0, Ll/ۙۡۡ;->ۨ:Z

    if-eqz p1, :cond_9

    .line 169
    invoke-virtual {v1}, Ll/۫ۢܳ;->ܽ()V

    .line 170
    iput-boolean v0, p0, Ll/ۙۡۡ;->ۨ:Z

    :cond_9
    move p1, v2

    goto :goto_1

    .line 173
    :cond_a
    iput-boolean v4, p0, Ll/ۙۡۡ;->ۨ:Z

    .line 174
    :goto_1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p2

    int-to-float p2, p2

    int-to-float v1, v2

    div-float/2addr p2, v1

    const/4 v1, 0x0

    cmpg-float v1, p2, v1

    if-gez v1, :cond_b

    const/4 p2, 0x0

    goto :goto_2

    :cond_b
    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, p2, v1

    if-lez v1, :cond_c

    const/high16 p2, 0x3f800000    # 1.0f

    :cond_c
    :goto_2
    const v1, 0x3fc90fdb

    mul-float p2, p2, v1

    float-to-double v1, p2

    .line 26
    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float p2, v1

    int-to-float p1, p1

    mul-float p2, p2, p1

    float-to-int p1, p2

    .line 175
    iget-object p2, p0, Ll/ۙۡۡ;->᩶:Landroid/view/View;

    neg-int p1, p1

    invoke-virtual {p2, p1, v0}, Landroid/view/View;->scrollTo(II)V

    return v4

    .line 118
    :cond_d
    iget-boolean p1, p0, Ll/ۙۡۡ;->ۤ:Z

    if-eqz p1, :cond_e

    iget-object p1, p0, Ll/ۙۡۡ;->᩶:Landroid/view/View;

    if-eqz p1, :cond_e

    .line 119
    invoke-virtual {p1, v0, v0}, Landroid/view/View;->scrollTo(II)V

    .line 120
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iget p2, p0, Ll/ۙۡۡ;->ۙ:F

    sub-float/2addr p1, p2

    mul-float p1, p1, v3

    float-to-int p1, p1

    .line 121
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p1

    if-lt p1, v2, :cond_e

    .line 122
    iget-object p1, p0, Ll/ۙۡۡ;->᩶:Landroid/view/View;

    iget p2, p0, Ll/ۙۡۡ;->᩹:I

    invoke-virtual {v1, p2, p1}, Ll/۫ۢܳ;->֫(ILandroid/view/View;)V

    .line 125
    :cond_e
    invoke-direct {p0}, Ll/ۙۡۡ;->֫()V

    return v0

    .line 83
    :cond_f
    invoke-direct {p0}, Ll/ۙۡۡ;->֫()V

    .line 88
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 89
    iget-object v2, p0, Ll/ۙۡۡ;->۬:Landroid/widget/ListView;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    .line 90
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    float-to-int v3, v3

    .line 91
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-int v4, v4

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v2, :cond_11

    .line 94
    iget-object v6, p0, Ll/ۙۡۡ;->۬:Landroid/widget/ListView;

    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 95
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    move-result v7

    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    move-result v8

    invoke-virtual {v6}, Landroid/view/View;->getRight()I

    move-result v9

    invoke-virtual {v6}, Landroid/view/View;->getBottom()I

    move-result v10

    invoke-virtual {p1, v7, v8, v9, v10}, Landroid/graphics/Rect;->set(IIII)V

    .line 96
    invoke-virtual {p1, v3, v4}, Landroid/graphics/Rect;->contains(II)Z

    move-result v7

    if-eqz v7, :cond_10

    .line 97
    iput-object v6, p0, Ll/ۙۡۡ;->᩶:Landroid/view/View;

    goto :goto_4

    :cond_10
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 102
    :cond_11
    :goto_4
    iget-object p1, p0, Ll/ۙۡۡ;->᩶:Landroid/view/View;

    if-eqz p1, :cond_13

    .line 104
    :try_start_0
    iget-object v2, p0, Ll/ۙۡۡ;->۬:Landroid/widget/ListView;

    invoke-virtual {v2, p1}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    move-result p1

    iput p1, p0, Ll/ۙۡۡ;->᩹:I

    .line 105
    invoke-virtual {v1, p1}, Ll/۫ۢܳ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_12

    .line 106
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iput p1, p0, Ll/ۙۡۡ;->ۙ:F

    .line 107
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Ll/ۙۡۡ;->ۗ:F

    return v0

    :cond_12
    const/4 p1, 0x0

    .line 109
    iput-object p1, p0, Ll/ۙۡۡ;->᩶:Landroid/view/View;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_13
    :goto_5
    return v0
.end method
