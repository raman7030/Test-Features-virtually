.class public final Ll/ۚᩴ;
.super Ljava/lang/Object;
.source "95DO"

# interfaces
.implements Landroid/view/View$OnLongClickListener;
.implements Landroid/view/View$OnHoverListener;
.implements Landroid/view/View$OnAttachStateChangeListener;


# static fields
.field public static ܰ:Ll/ۚᩴ;

.field public static ᩺:Ll/ۚᩴ;


# instance fields
.field public ۗ:Z

.field public ۙ:Z

.field public final ۛ:Ll/᩵ᩴ;

.field public ۤ:Ll/֨ᩴ;

.field public final ۨ:Ljava/lang/CharSequence;

.field public final ۫:I

.field public final ۬:Ll/֡ᩴ;

.field public ᩶:I

.field public final ᩸:Landroid/view/View;

.field public ᩹:I


# direct methods
.method public constructor <init>(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 1

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance v0, Ll/᩵ᩴ;

    invoke-direct {v0, p0}, Ll/᩵ᩴ;-><init>(Ll/ۚᩴ;)V

    iput-object v0, p0, Ll/ۚᩴ;->ۛ:Ll/᩵ᩴ;

    .line 54
    new-instance v0, Ll/֡ᩴ;

    invoke-direct {v0, p0}, Ll/֡ᩴ;-><init>(Ll/ۚᩴ;)V

    iput-object v0, p0, Ll/ۚᩴ;->۬:Ll/֡ᩴ;

    .line 99
    iput-object p1, p0, Ll/ۚᩴ;->᩸:Landroid/view/View;

    .line 100
    iput-object p2, p0, Ll/ۚᩴ;->ۨ:Ljava/lang/CharSequence;

    .line 102
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p2

    .line 101
    invoke-static {p2}, Ll/᩷᩺;->֫(Landroid/view/ViewConfiguration;)I

    move-result p2

    iput p2, p0, Ll/ۚᩴ;->۫:I

    const/4 p2, 0x1

    .line 244
    iput-boolean p2, p0, Ll/ۚᩴ;->ۙ:Z

    .line 105
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 106
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnHoverListener(Landroid/view/View$OnHoverListener;)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 2

    .line 83
    sget-object v0, Ll/ۚᩴ;->ܰ:Ll/ۚᩴ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/ۚᩴ;->᩸:Landroid/view/View;

    if-ne v0, p0, :cond_0

    .line 84
    invoke-static {v1}, Ll/ۚᩴ;->֫(Ll/ۚᩴ;)V

    .line 86
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 87
    sget-object p1, Ll/ۚᩴ;->᩺:Ll/ۚᩴ;

    if-eqz p1, :cond_1

    iget-object v0, p1, Ll/ۚᩴ;->᩸:Landroid/view/View;

    if-ne v0, p0, :cond_1

    .line 88
    invoke-virtual {p1}, Ll/ۚᩴ;->֫()V

    .line 90
    :cond_1
    invoke-virtual {p0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const/4 p1, 0x0

    .line 91
    invoke-virtual {p0, p1}, Landroid/view/View;->setLongClickable(Z)V

    .line 92
    invoke-virtual {p0, v1}, Landroid/view/View;->setOnHoverListener(Landroid/view/View$OnHoverListener;)V

    return-void

    .line 94
    :cond_2
    new-instance v0, Ll/ۚᩴ;

    invoke-direct {v0, p0, p1}, Ll/ۚᩴ;-><init>(Landroid/view/View;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static ֫(Ll/ۚᩴ;)V
    .locals 3

    .line 202
    sget-object v0, Ll/ۚᩴ;->ܰ:Ll/ۚᩴ;

    if-eqz v0, :cond_0

    .line 216
    iget-object v1, v0, Ll/ۚᩴ;->᩸:Landroid/view/View;

    iget-object v0, v0, Ll/ۚᩴ;->ۛ:Ll/᩵ᩴ;

    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 205
    :cond_0
    sput-object p0, Ll/ۚᩴ;->ܰ:Ll/ۚᩴ;

    if-eqz p0, :cond_1

    .line 212
    iget-object v0, p0, Ll/ۚᩴ;->᩸:Landroid/view/View;

    iget-object p0, p0, Ll/ۚᩴ;->ۛ:Ll/᩵ᩴ;

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, p0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void
.end method


# virtual methods
.method public final onHover(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    .line 119
    iget-object p1, p0, Ll/ۚᩴ;->ۤ:Ll/֨ᩴ;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Ll/ۚᩴ;->ۗ:Z

    if-eqz p1, :cond_0

    goto :goto_0

    .line 123
    :cond_0
    iget-object p1, p0, Ll/ۚᩴ;->᩸:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "accessibility"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    .line 124
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 127
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    const/4 v2, 0x7

    if-eq v1, v2, :cond_3

    const/16 p1, 0xa

    if-eq v1, p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    .line 244
    iput-boolean p1, p0, Ll/ۚᩴ;->ۙ:Z

    .line 135
    invoke-virtual {p0}, Ll/ۚᩴ;->֫()V

    return v0

    .line 129
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Ll/ۚᩴ;->ۤ:Ll/֨ᩴ;

    if-nez p1, :cond_5

    .line 227
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    float-to-int p1, p1

    .line 228
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    float-to-int p2, p2

    .line 229
    iget-boolean v1, p0, Ll/ۚᩴ;->ۙ:Z

    if-nez v1, :cond_4

    iget v1, p0, Ll/ۚᩴ;->᩹:I

    sub-int v1, p1, v1

    .line 230
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    iget v2, p0, Ll/ۚᩴ;->۫:I

    if-gt v1, v2, :cond_4

    iget v1, p0, Ll/ۚᩴ;->᩶:I

    sub-int v1, p2, v1

    .line 231
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-le v1, v2, :cond_5

    .line 232
    :cond_4
    iput p1, p0, Ll/ۚᩴ;->᩹:I

    .line 233
    iput p2, p0, Ll/ۚᩴ;->᩶:I

    .line 234
    iput-boolean v0, p0, Ll/ۚᩴ;->ۙ:Z

    .line 130
    invoke-static {p0}, Ll/ۚᩴ;->֫(Ll/ۚᩴ;)V

    :cond_5
    :goto_0
    return v0
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .locals 1

    .line 111
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Ll/ۚᩴ;->᩹:I

    .line 112
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    iput p1, p0, Ll/ۚᩴ;->᩶:I

    const/4 p1, 0x1

    .line 113
    invoke-virtual {p0, p1}, Ll/ۚᩴ;->֫(Z)V

    return p1
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    .line 149
    invoke-virtual {p0}, Ll/ۚᩴ;->֫()V

    return-void
.end method

.method public final ֫()V
    .locals 3

    .line 184
    sget-object v0, Ll/ۚᩴ;->᩺:Ll/ۚᩴ;

    iget-object v1, p0, Ll/ۚᩴ;->᩸:Landroid/view/View;

    const/4 v2, 0x0

    if-ne v0, p0, :cond_0

    .line 185
    sput-object v2, Ll/ۚᩴ;->᩺:Ll/ۚᩴ;

    .line 186
    iget-object v0, p0, Ll/ۚᩴ;->ۤ:Ll/֨ᩴ;

    if-eqz v0, :cond_0

    .line 187
    invoke-virtual {v0}, Ll/֨ᩴ;->֫()V

    .line 188
    iput-object v2, p0, Ll/ۚᩴ;->ۤ:Ll/֨ᩴ;

    const/4 v0, 0x1

    .line 244
    iput-boolean v0, p0, Ll/ۚᩴ;->ۙ:Z

    .line 190
    invoke-virtual {v1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 195
    :cond_0
    sget-object v0, Ll/ۚᩴ;->ܰ:Ll/ۚᩴ;

    if-ne v0, p0, :cond_1

    .line 196
    invoke-static {v2}, Ll/ۚᩴ;->֫(Ll/ۚᩴ;)V

    .line 198
    :cond_1
    iget-object v0, p0, Ll/ۚᩴ;->۬:Ll/֡ᩴ;

    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ֫(Z)V
    .locals 8

    .line 154
    iget-object v0, p0, Ll/ۚᩴ;->᩸:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    .line 158
    invoke-static {v1}, Ll/ۚᩴ;->֫(Ll/ۚᩴ;)V

    .line 159
    sget-object v1, Ll/ۚᩴ;->᩺:Ll/ۚᩴ;

    if-eqz v1, :cond_1

    .line 160
    invoke-virtual {v1}, Ll/ۚᩴ;->֫()V

    .line 162
    :cond_1
    sput-object p0, Ll/ۚᩴ;->᩺:Ll/ۚᩴ;

    .line 164
    iput-boolean p1, p0, Ll/ۚᩴ;->ۗ:Z

    .line 165
    new-instance v2, Ll/֨ᩴ;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v2, p1}, Ll/֨ᩴ;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Ll/ۚᩴ;->ۤ:Ll/֨ᩴ;

    .line 166
    iget v4, p0, Ll/ۚᩴ;->᩹:I

    iget v5, p0, Ll/ۚᩴ;->᩶:I

    iget-boolean v6, p0, Ll/ۚᩴ;->ۗ:Z

    iget-object v7, p0, Ll/ۚᩴ;->ۨ:Ljava/lang/CharSequence;

    iget-object v3, p0, Ll/ۚᩴ;->᩸:Landroid/view/View;

    invoke-virtual/range {v2 .. v7}, Ll/֨ᩴ;->֫(Landroid/view/View;IIZLjava/lang/CharSequence;)V

    .line 168
    invoke-virtual {v0, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 171
    iget-boolean p1, p0, Ll/ۚᩴ;->ۗ:Z

    if-eqz p1, :cond_2

    const-wide/16 v1, 0x9c4

    goto :goto_1

    .line 173
    :cond_2
    sget p1, Ll/ܿ᩺;->֫:I

    .line 2793
    invoke-virtual {v0}, Landroid/view/View;->getWindowSystemUiVisibility()I

    move-result p1

    const/4 v1, 0x1

    and-int/2addr p1, v1

    if-ne p1, v1, :cond_3

    .line 175
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result p1

    int-to-long v1, p1

    const-wide/16 v3, 0xbb8

    goto :goto_0

    .line 177
    :cond_3
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result p1

    int-to-long v1, p1

    const-wide/16 v3, 0x3a98

    :goto_0
    sub-long v1, v3, v1

    .line 179
    :goto_1
    iget-object p1, p0, Ll/ۚᩴ;->۬:Ll/֡ᩴ;

    invoke-virtual {v0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 180
    invoke-virtual {v0, p1, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
