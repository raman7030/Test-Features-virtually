.class public final Ll/ۢ᩹ۢ;
.super Ljava/lang/Object;
.source "L1RG"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public ۗ:Z

.field public ۙ:F

.field public ۫:Landroid/view/View;

.field public ۬:I

.field public ᩶:F

.field public ᩸:I

.field public ᩹:Z


# direct methods
.method public static bridge synthetic ֫(Ll/ۢ᩹ۢ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۢ᩹ۢ;->᩸:I

    return p0
.end method

.method public static ֫(Landroid/view/View;)V
    .locals 2

    .line 148
    new-instance v0, Ll/ۢ᩹ۢ;

    .line 151
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    .line 145
    iput v1, v0, Ll/ۢ᩹ۢ;->᩸:I

    .line 152
    iput-object p0, v0, Ll/ۢ᩹ۢ;->۫:Landroid/view/View;

    .line 153
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 154
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p0

    iput p0, v0, Ll/ۢ᩹ۢ;->۬:I

    return-void
.end method

.method public static synthetic ֫(Ll/ۢ᩹ۢ;I)V
    .locals 2

    .line 174
    iget v0, p0, Ll/ۢ᩹ۢ;->᩸:I

    if-ne p1, v0, :cond_0

    iget-boolean v0, p0, Ll/ۢ᩹ۢ;->ۗ:Z

    if-nez v0, :cond_0

    .line 175
    iget-object v0, p0, Ll/ۢ᩹ۢ;->۫:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 176
    new-instance v0, Ll/᩷᩹ۢ;

    invoke-direct {v0, p0, p1}, Ll/᩷᩹ۢ;-><init>(Ll/ۢ᩹ۢ;I)V

    .line 184
    invoke-virtual {v0}, Ll/᩷᩹ۢ;->run()V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۢ᩹ۢ;)Landroid/view/View;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۢ᩹ۢ;->۫:Landroid/view/View;

    return-object p0
.end method

.method public static synthetic ۧ(Ll/ۢ᩹ۢ;I)V
    .locals 2

    .line 169
    iget-object v0, p0, Ll/ۢ᩹ۢ;->۫:Landroid/view/View;

    iget v1, p0, Ll/ۢ᩹ۢ;->᩸:I

    if-ne p1, v1, :cond_1

    iget-boolean v1, p0, Ll/ۢ᩹ۢ;->ۗ:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 171
    iput-boolean v1, p0, Ll/ۢ᩹ۢ;->᩹:Z

    .line 172
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 173
    new-instance v1, Ll/ۜ᩹ۢ;

    invoke-direct {v1, p0, p1}, Ll/ۜ᩹ۢ;-><init>(Ll/ۢ᩹ۢ;I)V

    const-wide/16 p0, 0x15e

    invoke-virtual {v0, v1, p0, p1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    .line 160
    iget p1, p0, Ll/ۢ᩹ۢ;->۬:I

    iget-object v0, p0, Ll/ۢ᩹ۢ;->۫:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    and-int/lit16 v1, v1, 0xff

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_4

    if-eq v1, v3, :cond_2

    const/4 v4, 0x2

    if-eq v1, v4, :cond_0

    const/4 p1, 0x3

    if-eq v1, p1, :cond_2

    goto :goto_0

    .line 190
    :cond_0
    iget-boolean v0, p0, Ll/ۢ᩹ۢ;->ۗ:Z

    if-nez v0, :cond_3

    .line 191
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iget v1, p0, Ll/ۢ᩹ۢ;->᩶:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    int-to-float p1, p1

    cmpl-float v0, v0, p1

    if-gez v0, :cond_1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    iget v0, p0, Ll/ۢ᩹ۢ;->ۙ:F

    sub-float/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    cmpl-float p1, p2, p1

    if-ltz p1, :cond_3

    .line 192
    :cond_1
    iput-boolean v3, p0, Ll/ۢ᩹ۢ;->ۗ:Z

    return v3

    .line 198
    :cond_2
    invoke-virtual {v0, v2}, Landroid/view/View;->setPressed(Z)V

    .line 199
    iget p1, p0, Ll/ۢ᩹ۢ;->᩸:I

    add-int/2addr p1, v3

    iput p1, p0, Ll/ۢ᩹ۢ;->᩸:I

    .line 200
    iget-boolean p1, p0, Ll/ۢ᩹ۢ;->ۗ:Z

    if-nez p1, :cond_3

    iget-boolean p1, p0, Ll/ۢ᩹ۢ;->᩹:Z

    if-nez p1, :cond_3

    .line 201
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    :cond_3
    :goto_0
    return v3

    .line 162
    :cond_4
    invoke-virtual {v0, v3}, Landroid/view/View;->setPressed(Z)V

    .line 163
    iput-boolean v2, p0, Ll/ۢ᩹ۢ;->ۗ:Z

    .line 164
    iput-boolean v2, p0, Ll/ۢ᩹ۢ;->᩹:Z

    .line 165
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iput p1, p0, Ll/ۢ᩹ۢ;->᩶:F

    .line 166
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Ll/ۢ᩹ۢ;->ۙ:F

    .line 167
    iget p1, p0, Ll/ۢ᩹ۢ;->᩸:I

    add-int/2addr p1, v3

    iput p1, p0, Ll/ۢ᩹ۢ;->᩸:I

    .line 168
    new-instance p2, Ll/᩻᩹ۢ;

    invoke-direct {p2, p0, p1}, Ll/᩻᩹ۢ;-><init>(Ll/ۢ᩹ۢ;I)V

    const-wide/16 v1, 0x96

    invoke-virtual {v0, p2, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return v3
.end method
