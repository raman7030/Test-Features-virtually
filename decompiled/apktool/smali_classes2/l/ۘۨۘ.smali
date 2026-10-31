.class public final Ll/ۘۨۘ;
.super Ljava/lang/Object;
.source "F90M"

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;


# instance fields
.field public final ᩶:Landroid/widget/TextView;

.field public final ᩸:Ll/ᩴۨۘ;

.field public ᩹:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Ll/ᩴۨۘ;Landroid/graphics/Rect;)V
    .locals 0

    .line 129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 130
    iput-object p1, p0, Ll/ۘۨۘ;->᩶:Landroid/widget/TextView;

    .line 131
    iput-object p2, p0, Ll/ۘۨۘ;->᩸:Ll/ᩴۨۘ;

    .line 132
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1, p3}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iput-object p1, p0, Ll/ۘۨۘ;->᩹:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public final invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 138
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    iget-object v2, p0, Ll/ۘۨۘ;->᩶:Landroid/widget/TextView;

    if-eq v0, v1, :cond_0

    .line 139
    new-instance v0, Ll/ۖۨۘ;

    invoke-direct {v0, p0, p1}, Ll/ۖۨۘ;-><init>(Ll/ۘۨۘ;Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 148
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object p1

    .line 153
    iget-object v0, p0, Ll/ۘۨۘ;->᩹:Landroid/graphics/Rect;

    invoke-virtual {v0, p1}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 157
    iget-object v0, p0, Ll/ۘۨۘ;->᩸:Ll/ᩴۨۘ;

    invoke-virtual {v0}, Ll/ᩴۨۘ;->֫()V

    .line 158
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iput-object v0, p0, Ll/ۘۨۘ;->᩹:Landroid/graphics/Rect;

    return-void

    .line 161
    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->postInvalidate()V

    return-void
.end method

.method public final scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 2

    .line 167
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    sub-long/2addr p3, v0

    .line 168
    iget-object p1, p0, Ll/ۘۨۘ;->᩶:Landroid/widget/TextView;

    invoke-virtual {p1, p2, p3, p4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 0

    .line 173
    iget-object p1, p0, Ll/ۘۨۘ;->᩶:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method
