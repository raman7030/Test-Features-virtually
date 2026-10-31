.class public final Ll/ܿ֡ᩳ;
.super Ljava/lang/Object;
.source "06SC"


# instance fields
.field public final ֫:Ll/᩹ܶᩳ;

.field public final ۖ:Ll/ۧ֡ᩳ;

.field public final ۘ:Ll/۫ۨᩳ;

.field public final ۜ:Landroid/view/ViewTreeObserver;

.field public final ۡ:Ll/ܽ֡ᩳ;

.field public final ۢ:Landroid/graphics/Point;

.field public final ۧ:I

.field public final ܳ:Landroid/os/Handler;

.field public final ܺ:Landroid/graphics/Point;

.field public final ܽ:I

.field public final ܿ:I

.field public final ᩳ:I

.field public final ᩷:Ll/ۨ᩵ᩳ;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Ll/᩹ܶᩳ;Ll/ۨ᩵ᩳ;Landroid/graphics/Point;Landroid/graphics/Point;)V
    .locals 2

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ll/ܿ֡ᩳ;->ܳ:Landroid/os/Handler;

    .line 26
    iput-object p1, p0, Ll/ܿ֡ᩳ;->֫:Ll/᩹ܶᩳ;

    iput-object p2, p0, Ll/ܿ֡ᩳ;->᩷:Ll/ۨ᩵ᩳ;

    iget-object p1, p1, Ll/᩹ܶᩳ;->᩺:Ll/۫ۨᩳ;

    iput-object p1, p0, Ll/ܿ֡ᩳ;->ۘ:Ll/۫ۨᩳ;

    .line 27
    new-instance p2, Landroid/graphics/Point;

    invoke-direct {p2, p3}, Landroid/graphics/Point;-><init>(Landroid/graphics/Point;)V

    iput-object p2, p0, Ll/ܿ֡ᩳ;->ܺ:Landroid/graphics/Point;

    new-instance p2, Landroid/graphics/Point;

    invoke-direct {p2, p4}, Landroid/graphics/Point;-><init>(Landroid/graphics/Point;)V

    iput-object p2, p0, Ll/ܿ֡ᩳ;->ۢ:Landroid/graphics/Point;

    .line 28
    invoke-virtual {p1}, Ll/۫ۨᩳ;->۫֫()I

    move-result p2

    iput p2, p0, Ll/ܿ֡ᩳ;->ܽ:I

    invoke-virtual {p1}, Ll/۫ۨᩳ;->۬֫()I

    move-result p2

    iput p2, p0, Ll/ܿ֡ᩳ;->ۧ:I

    .line 29
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result p2

    iput p2, p0, Ll/ܿ֡ᩳ;->ᩳ:I

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result p2

    iput p2, p0, Ll/ܿ֡ᩳ;->ܿ:I

    .line 30
    new-instance p2, Ll/ۧ֡ᩳ;

    invoke-direct {p2, p0}, Ll/ۧ֡ᩳ;-><init>(Ll/ܿ֡ᩳ;)V

    iput-object p2, p0, Ll/ܿ֡ᩳ;->ۖ:Ll/ۧ֡ᩳ;

    .line 31
    new-instance p3, Ll/ܽ֡ᩳ;

    invoke-direct {p3, p0}, Ll/ܽ֡ᩳ;-><init>(Ll/ܿ֡ᩳ;)V

    iput-object p3, p0, Ll/ܿ֡ᩳ;->ۡ:Ll/ܽ֡ᩳ;

    .line 32
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p4

    iput-object p4, p0, Ll/ܿ֡ᩳ;->ۜ:Landroid/view/ViewTreeObserver;

    .line 33
    invoke-virtual {p1, p2}, Ll/۫ۨᩳ;->֫(Ll/۠۟ᩳ;)V

    .line 34
    invoke-virtual {p4, p3}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 35
    new-instance p1, Ll/ᩳ֡ᩳ;

    invoke-direct {p1, p0}, Ll/ᩳ֡ᩳ;-><init>(Ll/ܿ֡ᩳ;)V

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static synthetic ֫(Ll/ܿ֡ᩳ;)V
    .locals 3

    .line 31
    iget-object v0, p0, Ll/ܿ֡ᩳ;->ۘ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v1

    iget v2, p0, Ll/ܿ֡ᩳ;->ᩳ:I

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v0

    iget v1, p0, Ll/ܿ֡ᩳ;->ܿ:I

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ll/ܿ֡ᩳ;->᩻:Z

    return-void
.end method

.method public static synthetic ֫(Ll/ܿ֡ᩳ;II)V
    .locals 1

    .line 30
    iget v0, p0, Ll/ܿ֡ᩳ;->ܽ:I

    if-ne p1, v0, :cond_1

    iget p1, p0, Ll/ܿ֡ᩳ;->ۧ:I

    if-eq p2, p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Ll/ܿ֡ᩳ;->᩻:Z

    return-void
.end method

.method public static ۧ(Ll/ܿ֡ᩳ;)V
    .locals 6

    .line 39
    iget-object v0, p0, Ll/ܿ֡ᩳ;->ۜ:Landroid/view/ViewTreeObserver;

    iget-object v1, p0, Ll/ܿ֡ᩳ;->ۢ:Landroid/graphics/Point;

    iget-object v2, p0, Ll/ܿ֡ᩳ;->֫:Ll/᩹ܶᩳ;

    iget-object v3, p0, Ll/ܿ֡ᩳ;->᩷:Ll/ۨ᩵ᩳ;

    iget-object v4, p0, Ll/ܿ֡ᩳ;->ۘ:Ll/۫ۨᩳ;

    invoke-virtual {v2, v3, v4}, Ll/᩹ܶᩳ;->֫(Ll/ۨ᩵ᩳ;Ll/۫ۨᩳ;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 40
    iget-boolean v5, p0, Ll/ܿ֡ᩳ;->᩻:Z

    if-nez v5, :cond_0

    invoke-virtual {v4}, Ll/۫ۨᩳ;->ۗۧ()Z

    move-result v5

    if-eqz v5, :cond_0

    iget-object v0, p0, Ll/ܿ֡ᩳ;->ܳ:Landroid/os/Handler;

    new-instance v1, Ll/ᩳ֡ᩳ;

    invoke-direct {v1, p0}, Ll/ᩳ֡ᩳ;-><init>(Ll/ܿ֡ᩳ;)V

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    .line 41
    :cond_0
    iget-object v5, p0, Ll/ܿ֡ᩳ;->ۖ:Ll/ۧ֡ᩳ;

    invoke-virtual {v4, v5}, Ll/۫ۨᩳ;->֫(Ll/ۧ֡ᩳ;)V

    .line 42
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v5, p0, Ll/ܿ֡ᩳ;->ۡ:Ll/ܽ֡ᩳ;

    invoke-virtual {v0, v5}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    :cond_1
    if-eqz v2, :cond_5

    .line 43
    iget-boolean v0, p0, Ll/ܿ֡ᩳ;->᩻:Z

    if-nez v0, :cond_5

    iget-object v0, v3, Ll/ۨ᩵ᩳ;->ᩴ:Ll/ۙ֫ܿ;

    invoke-virtual {v0}, Ll/ۙ֫ܿ;->ܳۧ()Ll/᩻۬ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩻۬ᩳ;->ۙ()Ll/ۚۙᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۚۙᩳ;->ܿ()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 44
    :cond_2
    iget v0, v3, Ll/ۨ᩵ᩳ;->ۖ:I

    if-ltz v0, :cond_4

    .line 46
    invoke-virtual {v4, v0}, Ll/۫ۨᩳ;->ᩴ(I)V

    .line 47
    iget-boolean p0, v3, Ll/ۨ᩵ᩳ;->ܺ:Z

    if-eqz p0, :cond_3

    iget p0, v1, Landroid/graphics/Point;->x:I

    invoke-virtual {v4, p0}, Ll/۫ۨᩳ;->ۜ(I)I

    move-result p0

    iget v0, v1, Landroid/graphics/Point;->y:I

    invoke-virtual {v4, v0}, Ll/۫ۨᩳ;->᩷(I)I

    move-result v0

    invoke-virtual {v4, p0, v0}, Ll/۫ۨᩳ;->ۧ(II)V

    return-void

    :cond_3
    const/4 p0, 0x0

    .line 1674
    invoke-virtual {v4, p0}, Ll/۫ۨᩳ;->ۧ(Z)V

    return-void

    .line 51
    :cond_4
    iget-object p0, p0, Ll/ܿ֡ᩳ;->ܺ:Landroid/graphics/Point;

    iget v0, p0, Landroid/graphics/Point;->x:I

    iget p0, p0, Landroid/graphics/Point;->y:I

    add-int/lit8 p0, p0, -0x1

    invoke-static {v0, p0}, Ll/᩵ۛ᩷;->֫(II)Ll/᩵ۛ᩷;

    move-result-object p0

    invoke-virtual {p0, v4}, Ll/᩵ۛ᩷;->֫(Ll/۫ۨᩳ;)V

    .line 52
    iget p0, v1, Landroid/graphics/Point;->x:I

    invoke-virtual {v4, p0}, Ll/۫ۨᩳ;->ۜ(I)I

    move-result p0

    iget v0, v1, Landroid/graphics/Point;->y:I

    invoke-virtual {v4, v0}, Ll/۫ۨᩳ;->᩷(I)I

    move-result v0

    invoke-virtual {v4, p0, v0}, Ll/۫ۨᩳ;->ۧ(II)V

    :cond_5
    :goto_0
    return-void
.end method
