.class public final Ll/ۚۡۡ;
.super Ll/ۚ۬ۧ;
.source "Q7F8"


# instance fields
.field public ֫:Z

.field public final ۧ:Ll/֡ۡۡ;

.field public final ܳ:Ll/۬۬ۧ;

.field public ܽ:Landroid/view/View;

.field public ܿ:Z

.field public final ᩳ:Ljava/util/function/BooleanSupplier;


# direct methods
.method public constructor <init>(Ll/۬۬ۧ;Ljava/util/function/BooleanSupplier;)V
    .locals 1

    .line 11653
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Ll/ۚۡۡ;->ܳ:Ll/۬۬ۧ;

    .line 32
    iput-object p2, p0, Ll/ۚۡۡ;->ᩳ:Ljava/util/function/BooleanSupplier;

    .line 33
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    mul-int/lit8 p2, p1, 0x2

    const/high16 v0, 0x42040000    # 33.0f

    .line 34
    invoke-static {v0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v0

    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    .line 35
    new-instance v0, Ll/֡ۡۡ;

    invoke-direct {v0, p1, p2}, Ll/֡ۡۡ;-><init>(II)V

    iput-object v0, p0, Ll/ۚۡۡ;->ۧ:Ll/֡ۡۡ;

    return-void
.end method

.method private ֫(Landroid/view/View;Landroid/view/MotionEvent;)Ll/᩵ۡۡ;
    .locals 6

    const/4 v0, 0x0

    .line 153
    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    .line 154
    sget-object v2, Ll/᩵ۡۡ;->ۙ:Ll/᩵ۡۡ;

    .line 155
    :goto_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result v3

    iget-object v4, p0, Ll/ۚۡۡ;->ۧ:Ll/֡ۡۡ;

    if-ge v0, v3, :cond_2

    .line 157
    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getHistoricalX(I)F

    move-result v3

    invoke-virtual {p2, v0}, Landroid/view/MotionEvent;->getHistoricalY(I)F

    move-result v5

    .line 156
    invoke-virtual {v4, p1, v3, v5, v1}, Ll/֡ۡۡ;->֫(Landroid/view/View;FFI)Ll/᩵ۡۡ;

    move-result-object v3

    .line 159
    invoke-virtual {v3}, Ll/᩵ۡۡ;->ۧ()Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    .line 162
    :cond_0
    invoke-virtual {v3}, Ll/᩵ۡۡ;->֫()Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v2, v3

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 167
    :cond_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    .line 166
    invoke-virtual {v4, p1, v0, p2, v1}, Ll/֡ۡۡ;->֫(Landroid/view/View;FFI)Ll/᩵ۡۡ;

    move-result-object p1

    .line 169
    invoke-virtual {p1}, Ll/᩵ۡۡ;->ۧ()Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_1

    .line 172
    :cond_3
    invoke-virtual {p1}, Ll/᩵ۡۡ;->֫()Z

    move-result p2

    if-eqz p2, :cond_4

    :goto_1
    return-object p1

    :cond_4
    return-object v2
.end method

.method private ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 195
    iput-object v0, p0, Ll/ۚۡۡ;->ܽ:Landroid/view/View;

    const/4 v0, 0x0

    .line 196
    iput-boolean v0, p0, Ll/ۚۡۡ;->ܿ:Z

    .line 197
    iput-boolean v0, p0, Ll/ۚۡۡ;->֫:Z

    .line 198
    iget-object v0, p0, Ll/ۚۡۡ;->ۧ:Ll/֡ۡۡ;

    invoke-virtual {v0}, Ll/֡ۡۡ;->֫()V

    return-void
.end method

.method private ܽ(Landroid/view/MotionEvent;)Landroid/view/View;
    .locals 3

    .line 223
    iget-object v0, p0, Ll/ۚۡۡ;->ܽ:Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ۚۡۡ;->ܳ:Ll/۬۬ۧ;

    if-eqz v0, :cond_1

    .line 224
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-ne p1, v2, :cond_0

    iget-object p1, p0, Ll/ۚۡۡ;->ܽ:Landroid/view/View;

    return-object p1

    :cond_0
    return-object v1

    .line 226
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    invoke-virtual {v2, v0, p1}, Ll/۬۬ۧ;->findChildViewUnder(FF)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_2

    return-object v1

    .line 230
    :cond_2
    invoke-virtual {v2, p1}, Ll/۬۬ۧ;->getChildAdapterPosition(Landroid/view/View;)I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method


# virtual methods
.method public final ֫(Landroid/view/MotionEvent;)V
    .locals 3

    .line 68
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_8

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 p1, 0x3

    if-eq v0, p1, :cond_8

    const/4 p1, 0x5

    if-eq v0, p1, :cond_0

    const/4 p1, 0x6

    if-eq v0, p1, :cond_0

    goto :goto_0

    .line 213
    :cond_0
    iget-boolean p1, p0, Ll/ۚۡۡ;->֫:Z

    if-nez p1, :cond_6

    .line 214
    invoke-direct {p0}, Ll/ۚۡۡ;->֫()V

    return-void

    .line 129
    :cond_1
    iget-boolean v0, p0, Ll/ۚۡۡ;->֫:Z

    if-eqz v0, :cond_2

    goto :goto_0

    .line 132
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    if-ne v0, v1, :cond_7

    iget-object v0, p0, Ll/ۚۡۡ;->ᩳ:Ljava/util/function/BooleanSupplier;

    invoke-interface {v0}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    .line 136
    :cond_3
    invoke-direct {p0, p1}, Ll/ۚۡۡ;->ܽ(Landroid/view/MotionEvent;)Landroid/view/View;

    move-result-object v0

    .line 137
    invoke-direct {p0, v0, p1}, Ll/ۚۡۡ;->֫(Landroid/view/View;Landroid/view/MotionEvent;)Ll/᩵ۡۡ;

    move-result-object p1

    .line 138
    invoke-virtual {p1}, Ll/᩵ۡۡ;->ۧ()Z

    move-result v2

    if-eqz v2, :cond_5

    if-eqz v0, :cond_6

    .line 182
    iget-boolean p1, p0, Ll/ۚۡۡ;->ܿ:Z

    if-eqz p1, :cond_4

    goto :goto_0

    .line 185
    :cond_4
    iput-boolean v1, p0, Ll/ۚۡۡ;->ܿ:Z

    .line 186
    iput-boolean v1, p0, Ll/ۚۡۡ;->֫:Z

    .line 187
    invoke-virtual {v0}, Landroid/view/View;->performLongClick()Z

    const/4 p1, 0x0

    .line 205
    iput-object p1, p0, Ll/ۚۡۡ;->ܽ:Landroid/view/View;

    .line 206
    iget-object p1, p0, Ll/ۚۡۡ;->ۧ:Ll/֡ۡۡ;

    invoke-virtual {p1}, Ll/֡ۡۡ;->֫()V

    return-void

    .line 142
    :cond_5
    invoke-virtual {p1}, Ll/᩵ۡۡ;->֫()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 143
    iget-object p1, p0, Ll/ۚۡۡ;->ܳ:Ll/۬۬ۧ;

    invoke-virtual {p1, v1}, Ll/۬۬ۧ;->requestDisallowInterceptTouchEvent(Z)V

    .line 144
    iput-object v0, p0, Ll/ۚۡۡ;->ܽ:Landroid/view/View;

    :cond_6
    :goto_0
    return-void

    .line 133
    :cond_7
    :goto_1
    invoke-direct {p0}, Ll/ۚۡۡ;->֫()V

    return-void

    .line 78
    :cond_8
    invoke-direct {p0}, Ll/ۚۡۡ;->֫()V

    return-void
.end method

.method public final ۧ(Landroid/view/MotionEvent;)Z
    .locals 12

    .line 43
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ۚۡۡ;->ܳ:Ll/۬۬ۧ;

    iget-object v3, p0, Ll/ۚۡۡ;->ᩳ:Ljava/util/function/BooleanSupplier;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v0, :cond_a

    if-eq v0, v4, :cond_9

    const/4 v6, 0x2

    if-eq v0, v6, :cond_1

    const/4 p1, 0x3

    if-eq v0, p1, :cond_9

    const/4 p1, 0x5

    if-eq v0, p1, :cond_0

    const/4 p1, 0x6

    if-eq v0, p1, :cond_0

    goto :goto_1

    .line 213
    :cond_0
    iget-boolean p1, p0, Ll/ۚۡۡ;->֫:Z

    if-nez p1, :cond_7

    .line 214
    invoke-direct {p0}, Ll/ۚۡۡ;->֫()V

    return v5

    .line 104
    :cond_1
    iget-boolean v0, p0, Ll/ۚۡۡ;->֫:Z

    if-eqz v0, :cond_2

    goto :goto_0

    .line 107
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    if-ne v0, v4, :cond_8

    invoke-interface {v3}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    .line 111
    :cond_3
    invoke-direct {p0, p1}, Ll/ۚۡۡ;->ܽ(Landroid/view/MotionEvent;)Landroid/view/View;

    move-result-object v0

    .line 112
    invoke-direct {p0, v0, p1}, Ll/ۚۡۡ;->֫(Landroid/view/View;Landroid/view/MotionEvent;)Ll/᩵ۡۡ;

    move-result-object p1

    .line 113
    invoke-virtual {p1}, Ll/᩵ۡۡ;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_6

    if-eqz v0, :cond_5

    .line 182
    iget-boolean p1, p0, Ll/ۚۡۡ;->ܿ:Z

    if-eqz p1, :cond_4

    goto :goto_0

    .line 185
    :cond_4
    iput-boolean v4, p0, Ll/ۚۡۡ;->ܿ:Z

    .line 186
    iput-boolean v4, p0, Ll/ۚۡۡ;->֫:Z

    .line 187
    invoke-virtual {v0}, Landroid/view/View;->performLongClick()Z

    .line 205
    iput-object v1, p0, Ll/ۚۡۡ;->ܽ:Landroid/view/View;

    .line 206
    iget-object p1, p0, Ll/ۚۡۡ;->ۧ:Ll/֡ۡۡ;

    invoke-virtual {p1}, Ll/֡ۡۡ;->֫()V

    :cond_5
    :goto_0
    return v4

    .line 117
    :cond_6
    invoke-virtual {p1}, Ll/᩵ۡۡ;->֫()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 118
    invoke-virtual {v2, v4}, Ll/۬۬ۧ;->requestDisallowInterceptTouchEvent(Z)V

    .line 119
    iput-object v0, p0, Ll/ۚۡۡ;->ܽ:Landroid/view/View;

    return v4

    :cond_7
    :goto_1
    return v5

    .line 108
    :cond_8
    :goto_2
    invoke-direct {p0}, Ll/ۚۡۡ;->֫()V

    return v5

    .line 56
    :cond_9
    invoke-direct {p0}, Ll/ۚۡۡ;->֫()V

    return v5

    .line 89
    :cond_a
    invoke-direct {p0, p1}, Ll/ۚۡۡ;->ܽ(Landroid/view/MotionEvent;)Landroid/view/View;

    move-result-object v7

    .line 90
    invoke-virtual {v2}, Ll/۬۬ۧ;->getScrollState()I

    move-result v0

    if-nez v0, :cond_b

    .line 91
    invoke-interface {v3}, Ljava/util/function/BooleanSupplier;->getAsBoolean()Z

    move-result v0

    if-nez v0, :cond_b

    .line 92
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    if-ne v0, v4, :cond_b

    if-eqz v7, :cond_b

    const/4 v0, 0x1

    const/4 v11, 0x1

    goto :goto_3

    :cond_b
    const/4 v0, 0x0

    const/4 v11, 0x0

    .line 94
    :goto_3
    iput-object v1, p0, Ll/ۚۡۡ;->ܽ:Landroid/view/View;

    .line 95
    iput-boolean v5, p0, Ll/ۚۡۡ;->ܿ:Z

    .line 96
    iput-boolean v5, p0, Ll/ۚۡۡ;->֫:Z

    .line 97
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v8

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v9

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v10

    iget-object v6, p0, Ll/ۚۡۡ;->ۧ:Ll/֡ۡۡ;

    invoke-virtual/range {v6 .. v11}, Ll/֡ۡۡ;->֫(Landroid/view/View;IFFZ)V

    return v5
.end method
