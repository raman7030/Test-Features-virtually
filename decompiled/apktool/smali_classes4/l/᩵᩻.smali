.class public Ll/᩵᩻;
.super Landroid/graphics/drawable/Drawable;
.source "I9N6"

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;


# static fields
.field public static final synthetic ۟:I


# instance fields
.field public ۗ:Landroid/graphics/drawable/Drawable;

.field public ۙ:I

.field public ۛ:Z

.field public ۤ:J

.field public ۨ:Landroid/graphics/Rect;

.field public ۫:J

.field public ۬:Ll/ᩴ᩻;

.field public ܰ:Z

.field public ᩶:Ll/ۘ᩻;

.field public ᩸:I

.field public ᩹:Ljava/lang/Runnable;

.field public ᩺:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 48
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/16 v0, 0xff

    .line 66
    iput v0, p0, Ll/᩵᩻;->᩸:I

    const/4 v0, -0x1

    .line 69
    iput v0, p0, Ll/᩵᩻;->ۙ:I

    return-void
.end method

.method private ֫(Landroid/graphics/drawable/Drawable;)V
    .locals 4

    .line 490
    iget-object v0, p0, Ll/᩵᩻;->᩶:Ll/ۘ᩻;

    if-nez v0, :cond_0

    .line 491
    new-instance v0, Ll/ۘ᩻;

    .line 1169
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 491
    iput-object v0, p0, Ll/᩵᩻;->᩶:Ll/ۘ᩻;

    .line 496
    :cond_0
    iget-object v0, p0, Ll/᩵᩻;->᩶:Ll/ۘ᩻;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۘ᩻;->֫(Landroid/graphics/drawable/Drawable$Callback;)V

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 498
    :try_start_0
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    iget v0, v0, Ll/ᩴ᩻;->ܶ:I

    if-gtz v0, :cond_1

    iget-boolean v0, p0, Ll/᩵᩻;->ۛ:Z

    if-eqz v0, :cond_1

    .line 499
    iget v0, p0, Ll/᩵᩻;->᩸:I

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 501
    :cond_1
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    iget-boolean v1, v0, Ll/ᩴ᩻;->᩹:Z

    if-eqz v1, :cond_2

    .line 503
    iget-object v0, v0, Ll/ᩴ᩻;->ۢ:Landroid/graphics/ColorFilter;

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    goto :goto_0

    .line 505
    :cond_2
    iget-boolean v1, v0, Ll/ᩴ᩻;->᩶:Z

    if-eqz v1, :cond_3

    .line 506
    iget-object v0, v0, Ll/ᩴ᩻;->ۨ:Landroid/content/res/ColorStateList;

    invoke-static {p1, v0}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 508
    :cond_3
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    iget-boolean v1, v0, Ll/ᩴ᩻;->ۙ:Z

    if-eqz v1, :cond_4

    .line 509
    iget-object v0, v0, Ll/ᩴ᩻;->᩺:Landroid/graphics/PorterDuff$Mode;

    invoke-static {p1, v0}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    .line 512
    :cond_4
    :goto_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 513
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    iget-boolean v0, v0, Ll/ᩴ᩻;->ۚ:Z

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setDither(Z)V

    .line 514
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 515
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getLevel()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    .line 516
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 517
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_5

    .line 518
    invoke-static {p0}, Ll/۠۬;->ᩳ(Landroid/graphics/drawable/Drawable;)I

    move-result v0

    invoke-static {p1, v0}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;I)Z

    .line 520
    :cond_5
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    iget-boolean v0, v0, Ll/ᩴ᩻;->֫:Z

    .line 81
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    .line 521
    iget-object v0, p0, Ll/᩵᩻;->ۨ:Landroid/graphics/Rect;

    if-eqz v0, :cond_6

    .line 523
    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget v2, v0, Landroid/graphics/Rect;->top:I

    iget v3, v0, Landroid/graphics/Rect;->right:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    invoke-static {p1, v1, v2, v3, v0}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;IIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 527
    :cond_6
    iget-object v0, p0, Ll/᩵᩻;->᩶:Ll/ۘ᩻;

    invoke-virtual {v0}, Ll/ۘ᩻;->֫()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Ll/᩵᩻;->᩶:Ll/ۘ᩻;

    invoke-virtual {v1}, Ll/ۘ᩻;->֫()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 528
    throw v0
.end method


# virtual methods
.method public applyTheme(Landroid/content/res/Resources$Theme;)V
    .locals 1

    .line 591
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    invoke-virtual {v0, p1}, Ll/ᩴ᩻;->֫(Landroid/content/res/Resources$Theme;)V

    return-void
.end method

.method public final canApplyTheme()Z
    .locals 1

    .line 597
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    invoke-virtual {v0}, Ll/ᩴ᩻;->canApplyTheme()Z

    move-result v0

    return v0
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 81
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 82
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 84
    :cond_0
    iget-object v0, p0, Ll/᩵᩻;->᩺:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 85
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_1
    return-void
.end method

.method public final getAlpha()I
    .locals 1

    .line 147
    iget v0, p0, Ll/᩵᩻;->᩸:I

    return v0
.end method

.method public final getChangingConfigurations()I
    .locals 2

    .line 91
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v0

    iget-object v1, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    .line 92
    invoke-virtual {v1}, Ll/ᩴ᩻;->getChangingConfigurations()I

    move-result v1

    or-int/2addr v0, v1

    return v0
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 2

    .line 602
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    invoke-virtual {v0}, Ll/ᩴ᩻;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 603
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    invoke-virtual {p0}, Ll/᩵᩻;->getChangingConfigurations()I

    move-result v1

    iput v1, v0, Ll/ᩴ᩻;->ܽ:I

    .line 604
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getCurrent()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 574
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getHotspotBounds(Landroid/graphics/Rect;)V
    .locals 1

    .line 294
    iget-object v0, p0, Ll/᩵᩻;->ۨ:Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    .line 295
    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    return-void

    .line 297
    :cond_0
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->getHotspotBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final getIntrinsicHeight()I
    .locals 2

    .line 340
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    .line 998
    iget-boolean v1, v0, Ll/ᩴ᩻;->ᩴ:Z

    if-eqz v1, :cond_1

    .line 1015
    iget-boolean v1, v0, Ll/ᩴ᩻;->ᩳ:Z

    if-nez v1, :cond_0

    .line 1016
    invoke-virtual {v0}, Ll/ᩴ᩻;->ۧ()V

    .line 1018
    :cond_0
    iget v0, v0, Ll/ᩴ᩻;->ۡ:I

    return v0

    .line 343
    :cond_1
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    return v0

    :cond_2
    const/4 v0, -0x1

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 2

    .line 332
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    .line 998
    iget-boolean v1, v0, Ll/ᩴ᩻;->ᩴ:Z

    if-eqz v1, :cond_1

    .line 1005
    iget-boolean v1, v0, Ll/ᩴ᩻;->ᩳ:Z

    if-nez v1, :cond_0

    .line 1006
    invoke-virtual {v0}, Ll/ᩴ᩻;->ۧ()V

    .line 1008
    :cond_0
    iget v0, v0, Ll/ᩴ᩻;->᩵:I

    return v0

    .line 335
    :cond_1
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    return v0

    :cond_2
    const/4 v0, -0x1

    return v0
.end method

.method public final getMinimumHeight()I
    .locals 2

    .line 356
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    .line 998
    iget-boolean v1, v0, Ll/ᩴ᩻;->ᩴ:Z

    if-eqz v1, :cond_1

    .line 1035
    iget-boolean v1, v0, Ll/ᩴ᩻;->ᩳ:Z

    if-nez v1, :cond_0

    .line 1036
    invoke-virtual {v0}, Ll/ᩴ᩻;->ۧ()V

    .line 1038
    :cond_0
    iget v0, v0, Ll/ᩴ᩻;->ܺ:I

    return v0

    .line 359
    :cond_1
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v0

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final getMinimumWidth()I
    .locals 2

    .line 348
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    .line 998
    iget-boolean v1, v0, Ll/ᩴ᩻;->ᩴ:Z

    if-eqz v1, :cond_1

    .line 1025
    iget-boolean v1, v0, Ll/ᩴ᩻;->ᩳ:Z

    if-nez v1, :cond_0

    .line 1026
    invoke-virtual {v0}, Ll/ᩴ᩻;->ۧ()V

    .line 1028
    :cond_0
    iget v0, v0, Ll/ᩴ᩻;->ۖ:I

    return v0

    .line 351
    :cond_1
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final getOpacity()I
    .locals 1

    .line 404
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 405
    :cond_0
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    invoke-virtual {v0}, Ll/ᩴ᩻;->ᩳ()I

    move-result v0

    return v0

    :cond_1
    :goto_0
    const/4 v0, -0x2

    return v0
.end method

.method public final getOutline(Landroid/graphics/Outline;)V
    .locals 1

    .line 125
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 1223
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getOutline(Landroid/graphics/Outline;)V

    :cond_0
    return-void
.end method

.method public final getPadding(Landroid/graphics/Rect;)Z
    .locals 4

    .line 102
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    invoke-virtual {v0}, Ll/ᩴ᩻;->ܽ()Landroid/graphics/Rect;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 105
    invoke-virtual {p1, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 106
    iget v2, v0, Landroid/graphics/Rect;->left:I

    iget v3, v0, Landroid/graphics/Rect;->top:I

    or-int/2addr v2, v3

    iget v3, v0, Landroid/graphics/Rect;->bottom:I

    or-int/2addr v2, v3

    iget v0, v0, Landroid/graphics/Rect;->right:I

    or-int/2addr v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 108
    :cond_1
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    .line 109
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    move-result v0

    goto :goto_0

    .line 111
    :cond_2
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    move-result v0

    .line 243
    :goto_0
    iget-object v2, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    iget-boolean v2, v2, Ll/ᩴ᩻;->֫:Z

    if-eqz v2, :cond_3

    .line 97
    invoke-static {p0}, Ll/۠۬;->ᩳ(Landroid/graphics/drawable/Drawable;)I

    move-result v2

    if-ne v2, v1, :cond_3

    .line 115
    iget v1, p1, Landroid/graphics/Rect;->left:I

    .line 116
    iget v2, p1, Landroid/graphics/Rect;->right:I

    iput v2, p1, Landroid/graphics/Rect;->left:I

    .line 117
    iput v1, p1, Landroid/graphics/Rect;->right:I

    :cond_3
    return v0
.end method

.method public final invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 367
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 790
    iput-boolean v1, v0, Ll/ᩴ᩻;->ܳ:Z

    .line 791
    iput-boolean v1, v0, Ll/ᩴ᩻;->ۜ:Z

    .line 370
    :cond_0
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 371
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    invoke-interface {p1, p0}, Landroid/graphics/drawable/Drawable$Callback;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-void
.end method

.method public final isAutoMirrored()Z
    .locals 1

    .line 243
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    iget-boolean v0, v0, Ll/ᩴ᩻;->֫:Z

    return v0
.end method

.method public jumpToCurrentState()V
    .locals 7

    .line 249
    iget-object v0, p0, Ll/᩵᩻;->᩺:Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 250
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    const/4 v0, 0x0

    .line 251
    iput-object v0, p0, Ll/᩵᩻;->᩺:Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 254
    :goto_0
    iget-object v2, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_1

    .line 255
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    .line 256
    iget-boolean v2, p0, Ll/᩵᩻;->ۛ:Z

    if-eqz v2, :cond_1

    .line 257
    iget-object v2, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    iget v3, p0, Ll/᩵᩻;->᩸:I

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 260
    :cond_1
    iget-wide v2, p0, Ll/᩵᩻;->ۤ:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-eqz v6, :cond_2

    .line 261
    iput-wide v4, p0, Ll/᩵᩻;->ۤ:J

    const/4 v0, 0x1

    .line 264
    :cond_2
    iget-wide v2, p0, Ll/᩵᩻;->۫:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_3

    .line 265
    iput-wide v4, p0, Ll/᩵᩻;->۫:J

    goto :goto_1

    :cond_3
    move v1, v0

    :goto_1
    if-eqz v1, :cond_4

    .line 269
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_4
    return-void
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 611
    iget-boolean v0, p0, Ll/᩵᩻;->ܰ:Z

    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-ne v0, p0, :cond_0

    .line 612
    invoke-virtual {p0}, Ll/᩵᩻;->֫()Ll/ᩴ᩻;

    move-result-object v0

    .line 613
    invoke-virtual {v0}, Ll/ᩴ᩻;->ܿ()V

    .line 614
    invoke-virtual {p0, v0}, Ll/᩵᩻;->֫(Ll/ᩴ᩻;)V

    const/4 v0, 0x1

    .line 615
    iput-boolean v0, p0, Ll/᩵᩻;->ܰ:Z

    :cond_0
    return-object p0
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .line 217
    iget-object v0, p0, Ll/᩵᩻;->᩺:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 218
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 220
    :cond_0
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 221
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    :cond_1
    return-void
.end method

.method public final onLayoutDirectionChanged(I)Z
    .locals 9

    .line 327
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    .line 414
    iget v1, p0, Ll/᩵᩻;->ۙ:I

    .line 852
    iget v2, v0, Ll/ᩴ᩻;->۬:I

    .line 853
    iget-object v3, v0, Ll/ᩴ᩻;->۠:[Landroid/graphics/drawable/Drawable;

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    .line 855
    aget-object v6, v3, v4

    if-eqz v6, :cond_1

    .line 857
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x17

    if-lt v7, v8, :cond_0

    .line 859
    invoke-static {v6, p1}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;I)Z

    move-result v6

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_1
    if-ne v4, v1, :cond_1

    move v5, v6

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 866
    :cond_2
    iput p1, v0, Ll/ᩴ᩻;->ۗ:I

    return v5
.end method

.method public final onLevelChange(I)Z
    .locals 1

    .line 314
    iget-object v0, p0, Ll/᩵᩻;->᩺:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 315
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result p1

    return p1

    .line 317
    :cond_0
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 318
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 1

    .line 377
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 378
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    invoke-interface {p1, p0, p2, p3, p4}, Landroid/graphics/drawable/Drawable$Callback;->scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V

    :cond_0
    return-void
.end method

.method public final setAlpha(I)V
    .locals 6

    .line 132
    iget-boolean v0, p0, Ll/᩵᩻;->ۛ:Z

    if-eqz v0, :cond_0

    iget v0, p0, Ll/᩵᩻;->᩸:I

    if-eq v0, p1, :cond_2

    :cond_0
    const/4 v0, 0x1

    .line 133
    iput-boolean v0, p0, Ll/᩵᩻;->ۛ:Z

    .line 134
    iput p1, p0, Ll/᩵᩻;->᩸:I

    .line 135
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    .line 136
    iget-wide v1, p0, Ll/᩵᩻;->۫:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    .line 137
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    return-void

    :cond_1
    const/4 p1, 0x0

    .line 139
    invoke-virtual {p0, p1}, Ll/᩵᩻;->֫(Z)V

    :cond_2
    return-void
.end method

.method public final setAutoMirrored(Z)V
    .locals 2

    .line 232
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    iget-boolean v1, v0, Ll/ᩴ᩻;->֫:Z

    if-eq v1, p1, :cond_0

    .line 233
    iput-boolean p1, v0, Ll/ᩴ᩻;->֫:Z

    .line 234
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 81
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    :cond_0
    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 2

    .line 163
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/ᩴ᩻;->᩹:Z

    .line 164
    iget-object v1, v0, Ll/ᩴ᩻;->ۢ:Landroid/graphics/ColorFilter;

    if-eq v1, p1, :cond_0

    .line 165
    iput-object p1, v0, Ll/ᩴ᩻;->ۢ:Landroid/graphics/ColorFilter;

    .line 166
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 167
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_0
    return-void
.end method

.method public final setDither(Z)V
    .locals 2

    .line 153
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    iget-boolean v1, v0, Ll/ᩴ᩻;->ۚ:Z

    if-eq v1, p1, :cond_0

    .line 154
    iput-boolean p1, v0, Ll/ᩴ᩻;->ۚ:Z

    .line 155
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 156
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setDither(Z)V

    :cond_0
    return-void
.end method

.method public final setHotspot(FF)V
    .locals 1

    .line 275
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 276
    invoke-static {v0, p1, p2}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;FF)V

    :cond_0
    return-void
.end method

.method public final setHotspotBounds(IIII)V
    .locals 1

    .line 282
    iget-object v0, p0, Ll/᩵᩻;->ۨ:Landroid/graphics/Rect;

    if-nez v0, :cond_0

    .line 283
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Ll/᩵᩻;->ۨ:Landroid/graphics/Rect;

    goto :goto_0

    .line 285
    :cond_0
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    .line 287
    :goto_0
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 288
    invoke-static {v0, p1, p2, p3, p4}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;IIII)V

    :cond_1
    return-void
.end method

.method public final setTint(I)V
    .locals 0

    .line 174
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩵᩻;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final setTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 179
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/ᩴ᩻;->᩶:Z

    .line 180
    iget-object v1, v0, Ll/ᩴ᩻;->ۨ:Landroid/content/res/ColorStateList;

    if-eq v1, p1, :cond_0

    .line 181
    iput-object p1, v0, Ll/ᩴ᩻;->ۨ:Landroid/content/res/ColorStateList;

    .line 182
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, p1}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public final setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    .line 188
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ll/ᩴ᩻;->ۙ:Z

    .line 189
    iget-object v1, v0, Ll/ᩴ᩻;->᩺:Landroid/graphics/PorterDuff$Mode;

    if-eq v1, p1, :cond_0

    .line 190
    iput-object p1, v0, Ll/ᩴ᩻;->᩺:Landroid/graphics/PorterDuff$Mode;

    .line 191
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, p1}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setVisible(ZZ)Z
    .locals 2

    .line 391
    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result v0

    .line 392
    iget-object v1, p0, Ll/᩵᩻;->᩺:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_0

    .line 393
    invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 395
    :cond_0
    iget-object v1, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_1

    .line 396
    invoke-virtual {v1, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_1
    return v0
.end method

.method public final unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 1

    .line 384
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 385
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    invoke-interface {p1, p0, p2}, Landroid/graphics/drawable/Drawable$Callback;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public ֫()Ll/ᩴ᩻;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ֫(Landroid/content/res/Resources;)V
    .locals 2

    .line 585
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    if-eqz p1, :cond_2

    .line 878
    iput-object p1, v0, Ll/ᩴ᩻;->ۛ:Landroid/content/res/Resources;

    .line 1204
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    if-nez p1, :cond_0

    const/16 p1, 0xa0

    .line 882
    :cond_0
    iget v1, v0, Ll/ᩴ᩻;->֡:I

    .line 883
    iput p1, v0, Ll/ᩴ᩻;->֡:I

    if-eq v1, p1, :cond_1

    const/4 p1, 0x0

    .line 885
    iput-boolean p1, v0, Ll/ᩴ᩻;->ᩳ:Z

    .line 886
    iput-boolean p1, v0, Ll/ᩴ᩻;->᩻:Z

    :cond_1
    return-void

    .line 585
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public ֫(Ll/ᩴ᩻;)V
    .locals 1

    .line 1153
    iput-object p1, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    .line 1155
    iget v0, p0, Ll/᩵᩻;->ۙ:I

    if-ltz v0, :cond_0

    .line 1156
    invoke-virtual {p1, v0}, Ll/ᩴ᩻;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_0

    .line 1158
    invoke-direct {p0, p1}, Ll/᩵᩻;->֫(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    const/4 p1, 0x0

    .line 1163
    iput-object p1, p0, Ll/᩵᩻;->᩺:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public final ֫(Z)V
    .locals 13

    const/4 v0, 0x1

    .line 532
    iput-boolean v0, p0, Ll/᩵᩻;->ۛ:Z

    .line 533
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    .line 535
    iget-object v3, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    const-wide/16 v4, 0xff

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    if-eqz v3, :cond_1

    .line 536
    iget-wide v9, p0, Ll/᩵᩻;->۫:J

    cmp-long v11, v9, v6

    if-eqz v11, :cond_2

    cmp-long v11, v9, v1

    if-gtz v11, :cond_0

    .line 538
    iget v9, p0, Ll/᩵᩻;->᩸:I

    invoke-virtual {v3, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 539
    iput-wide v6, p0, Ll/᩵᩻;->۫:J

    goto :goto_0

    :cond_0
    sub-long/2addr v9, v1

    mul-long v9, v9, v4

    long-to-int v10, v9

    .line 541
    iget-object v9, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    iget v9, v9, Ll/ᩴ᩻;->ܶ:I

    div-int/2addr v10, v9

    rsub-int v9, v10, 0xff

    .line 543
    iget v10, p0, Ll/᩵᩻;->᩸:I

    mul-int v9, v9, v10

    div-int/lit16 v9, v9, 0xff

    invoke-virtual {v3, v9}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    const/4 v3, 0x1

    goto :goto_1

    .line 548
    :cond_1
    iput-wide v6, p0, Ll/᩵᩻;->۫:J

    :cond_2
    :goto_0
    const/4 v3, 0x0

    .line 550
    :goto_1
    iget-object v9, p0, Ll/᩵᩻;->᩺:Landroid/graphics/drawable/Drawable;

    if-eqz v9, :cond_4

    .line 551
    iget-wide v10, p0, Ll/᩵᩻;->ۤ:J

    cmp-long v12, v10, v6

    if-eqz v12, :cond_5

    cmp-long v12, v10, v1

    if-gtz v12, :cond_3

    .line 553
    invoke-virtual {v9, v8, v8}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    const/4 v0, 0x0

    .line 554
    iput-object v0, p0, Ll/᩵᩻;->᩺:Landroid/graphics/drawable/Drawable;

    .line 555
    iput-wide v6, p0, Ll/᩵᩻;->ۤ:J

    goto :goto_2

    :cond_3
    sub-long/2addr v10, v1

    mul-long v10, v10, v4

    long-to-int v3, v10

    .line 557
    iget-object v4, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    iget v4, v4, Ll/ᩴ᩻;->᩸:I

    div-int/2addr v3, v4

    .line 559
    iget v4, p0, Ll/᩵᩻;->᩸:I

    mul-int v3, v3, v4

    div-int/lit16 v3, v3, 0xff

    invoke-virtual {v9, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_3

    .line 564
    :cond_4
    iput-wide v6, p0, Ll/᩵᩻;->ۤ:J

    :cond_5
    :goto_2
    move v0, v3

    :goto_3
    if-eqz p1, :cond_6

    if-eqz v0, :cond_6

    .line 567
    iget-object p1, p0, Ll/᩵᩻;->᩹:Ljava/lang/Runnable;

    const-wide/16 v3, 0x10

    add-long/2addr v1, v3

    invoke-virtual {p0, p1, v1, v2}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    :cond_6
    return-void
.end method

.method public final ֫(I)Z
    .locals 9

    .line 427
    iget v0, p0, Ll/᩵᩻;->ۙ:I

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    return v1

    .line 430
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    .line 436
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    iget v0, v0, Ll/ᩴ᩻;->᩸:I

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    if-lez v0, :cond_3

    .line 437
    iget-object v0, p0, Ll/᩵᩻;->᩺:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 438
    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 440
    :cond_1
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    .line 441
    iput-object v0, p0, Ll/᩵᩻;->᩺:Landroid/graphics/drawable/Drawable;

    .line 442
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    iget v0, v0, Ll/ᩴ᩻;->᩸:I

    int-to-long v0, v0

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩵᩻;->ۤ:J

    goto :goto_0

    .line 444
    :cond_2
    iput-object v4, p0, Ll/᩵᩻;->᩺:Landroid/graphics/drawable/Drawable;

    .line 445
    iput-wide v5, p0, Ll/᩵᩻;->ۤ:J

    goto :goto_0

    .line 447
    :cond_3
    iget-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_4

    .line 448
    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    :cond_4
    :goto_0
    if-ltz p1, :cond_6

    .line 450
    iget-object v0, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    iget v1, v0, Ll/ᩴ᩻;->۬:I

    if-ge p1, v1, :cond_6

    .line 451
    invoke-virtual {v0, p1}, Ll/ᩴ᩻;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 452
    iput-object v0, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    .line 453
    iput p1, p0, Ll/᩵᩻;->ۙ:I

    if-eqz v0, :cond_7

    .line 455
    iget-object p1, p0, Ll/᩵᩻;->۬:Ll/ᩴ᩻;

    iget p1, p1, Ll/ᩴ᩻;->ܶ:I

    if-lez p1, :cond_5

    int-to-long v7, p1

    add-long/2addr v2, v7

    .line 456
    iput-wide v2, p0, Ll/᩵᩻;->۫:J

    .line 458
    :cond_5
    invoke-direct {p0, v0}, Ll/᩵᩻;->֫(Landroid/graphics/drawable/Drawable;)V

    goto :goto_1

    .line 461
    :cond_6
    iput-object v4, p0, Ll/᩵᩻;->ۗ:Landroid/graphics/drawable/Drawable;

    const/4 p1, -0x1

    .line 462
    iput p1, p0, Ll/᩵᩻;->ۙ:I

    .line 464
    :cond_7
    :goto_1
    iget-wide v0, p0, Ll/᩵᩻;->۫:J

    const/4 p1, 0x1

    cmp-long v2, v0, v5

    if-nez v2, :cond_8

    iget-wide v0, p0, Ll/᩵᩻;->ۤ:J

    cmp-long v2, v0, v5

    if-eqz v2, :cond_a

    .line 465
    :cond_8
    iget-object v0, p0, Ll/᩵᩻;->᩹:Ljava/lang/Runnable;

    if-nez v0, :cond_9

    .line 466
    new-instance v0, Ll/ۖ᩻;

    move-object v1, p0

    check-cast v1, Ll/۠᩻;

    invoke-direct {v0, v1}, Ll/ۖ᩻;-><init>(Ll/۠᩻;)V

    iput-object v0, p0, Ll/᩵᩻;->᩹:Ljava/lang/Runnable;

    goto :goto_2

    .line 474
    :cond_9
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    .line 477
    :goto_2
    invoke-virtual {p0, p1}, Ll/᩵᩻;->֫(Z)V

    .line 479
    :cond_a
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return p1
.end method

.method public final ۧ()I
    .locals 1

    .line 414
    iget v0, p0, Ll/᩵᩻;->ۙ:I

    return v0
.end method
