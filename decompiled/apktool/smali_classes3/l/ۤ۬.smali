.class public Ll/ۤ۬;
.super Landroid/graphics/drawable/Drawable;
.source "U4XY"

# interfaces
.implements Landroid/graphics/drawable/Drawable$Callback;
.implements Ll/۫۬;
.implements Ll/۬۬;


# static fields
.field public static final ۫:Landroid/graphics/PorterDuff$Mode;


# instance fields
.field public ۗ:Z

.field public ۙ:Landroid/graphics/drawable/Drawable;

.field public ۬:Ll/ۨ۬;

.field public ᩶:Landroid/graphics/PorterDuff$Mode;

.field public ᩸:Z

.field public ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 41
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    sput-object v0, Ll/ۤ۬;->۫:Landroid/graphics/PorterDuff$Mode;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 62
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 63
    invoke-direct {p0}, Ll/ۤ۬;->ܽ()Ll/ۨ۬;

    move-result-object v0

    iput-object v0, p0, Ll/ۤ۬;->۬:Ll/ۨ۬;

    .line 65
    invoke-virtual {p0, p1}, Ll/ۤ۬;->֫(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private ֫([I)Z
    .locals 4

    .line 303
    invoke-virtual {p0}, Ll/ۤ۬;->ۧ()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 308
    :cond_0
    iget-object v0, p0, Ll/ۤ۬;->۬:Ll/ۨ۬;

    iget-object v2, v0, Ll/ۨ۬;->ܽ:Landroid/content/res/ColorStateList;

    .line 309
    iget-object v0, v0, Ll/ۨ۬;->ᩳ:Landroid/graphics/PorterDuff$Mode;

    if-eqz v2, :cond_3

    if-eqz v0, :cond_3

    .line 312
    invoke-virtual {v2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v3

    invoke-virtual {v2, p1, v3}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    .line 313
    iget-boolean v2, p0, Ll/ۤ۬;->᩸:Z

    if-eqz v2, :cond_2

    iget v2, p0, Ll/ۤ۬;->᩹:I

    if-ne p1, v2, :cond_2

    iget-object v2, p0, Ll/ۤ۬;->᩶:Landroid/graphics/PorterDuff$Mode;

    if-eq v0, v2, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    return v1

    .line 314
    :cond_2
    :goto_1
    invoke-virtual {p0, p1, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 315
    iput p1, p0, Ll/ۤ۬;->᩹:I

    .line 316
    iput-object v0, p0, Ll/ۤ۬;->᩶:Landroid/graphics/PorterDuff$Mode;

    const/4 p1, 0x1

    .line 317
    iput-boolean p1, p0, Ll/ۤ۬;->᩸:Z

    return p1

    .line 321
    :cond_3
    iput-boolean v1, p0, Ll/ۤ۬;->᩸:Z

    .line 322
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    return v1
.end method

.method private ܽ()Ll/ۨ۬;
    .locals 3

    .line 253
    new-instance v0, Ll/ۨ۬;

    iget-object v1, p0, Ll/ۤ۬;->۬:Ll/ۨ۬;

    .line 35
    invoke-direct {v0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v2, 0x0

    .line 32
    iput-object v2, v0, Ll/ۨ۬;->ܽ:Landroid/content/res/ColorStateList;

    .line 33
    sget-object v2, Ll/ۤ۬;->۫:Landroid/graphics/PorterDuff$Mode;

    iput-object v2, v0, Ll/ۨ۬;->ᩳ:Landroid/graphics/PorterDuff$Mode;

    if-eqz v1, :cond_0

    .line 37
    iget v2, v1, Ll/ۨ۬;->֫:I

    iput v2, v0, Ll/ۨ۬;->֫:I

    .line 38
    iget-object v2, v1, Ll/ۨ۬;->ۧ:Landroid/graphics/drawable/Drawable$ConstantState;

    iput-object v2, v0, Ll/ۨ۬;->ۧ:Landroid/graphics/drawable/Drawable$ConstantState;

    .line 39
    iget-object v2, v1, Ll/ۨ۬;->ܽ:Landroid/content/res/ColorStateList;

    iput-object v2, v0, Ll/ۨ۬;->ܽ:Landroid/content/res/ColorStateList;

    .line 40
    iget-object v1, v1, Ll/ۨ۬;->ᩳ:Landroid/graphics/PorterDuff$Mode;

    iput-object v1, v0, Ll/ۨ۬;->ᩳ:Landroid/graphics/PorterDuff$Mode;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 86
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public final getChangingConfigurations()I
    .locals 2

    .line 103
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v0

    .line 104
    iget-object v1, p0, Ll/ۤ۬;->۬:Ll/ۨ۬;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ll/ۨ۬;->getChangingConfigurations()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iget-object v1, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    .line 105
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v1

    or-int/2addr v0, v1

    return v0
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 2

    .line 220
    iget-object v0, p0, Ll/ۤ۬;->۬:Ll/ۨ۬;

    if-eqz v0, :cond_0

    .line 66
    iget-object v1, v0, Ll/ۨ۬;->ۧ:Landroid/graphics/drawable/Drawable$ConstantState;

    if-eqz v1, :cond_0

    .line 221
    invoke-virtual {p0}, Ll/ۤ۬;->getChangingConfigurations()I

    move-result v1

    iput v1, v0, Ll/ۨ۬;->֫:I

    .line 222
    iget-object v0, p0, Ll/ۤ۬;->۬:Ll/ۨ۬;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getCurrent()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 152
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .line 177
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .line 172
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    return v0
.end method

.method public final getLayoutDirection()I
    .locals 1

    .line 214
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-static {v0}, Ll/۠۬;->ᩳ(Landroid/graphics/drawable/Drawable;)I

    move-result v0

    return v0
.end method

.method public final getMinimumHeight()I
    .locals 1

    .line 187
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v0

    return v0
.end method

.method public final getMinimumWidth()I
    .locals 1

    .line 182
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    move-result v0

    return v0
.end method

.method public final getOpacity()I
    .locals 1

    .line 162
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    return v0
.end method

.method public final getPadding(Landroid/graphics/Rect;)Z
    .locals 1

    .line 192
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public final getState()[I
    .locals 1

    .line 146
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    return-object v0
.end method

.method public final getTransparentRegion()Landroid/graphics/Region;
    .locals 1

    .line 167
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getTransparentRegion()Landroid/graphics/Region;

    move-result-object v0

    return-object v0
.end method

.method public final invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 261
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final isAutoMirrored()Z
    .locals 1

    .line 202
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    .line 96
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isAutoMirrored()Z

    move-result v0

    return v0
.end method

.method public final isStateful()Z
    .locals 1

    .line 130
    invoke-virtual {p0}, Ll/ۤ۬;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۤ۬;->۬:Ll/ۨ۬;

    if-eqz v0, :cond_0

    .line 131
    iget-object v0, v0, Ll/ۨ۬;->ܽ:Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 133
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/4 v0, 0x1

    return v0

    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public final jumpToCurrentState()V
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->jumpToCurrentState()V

    return-void
.end method

.method public final mutate()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 230
    iget-boolean v0, p0, Ll/ۤ۬;->ۗ:Z

    if-nez v0, :cond_3

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-ne v0, p0, :cond_3

    .line 231
    invoke-direct {p0}, Ll/ۤ۬;->ܽ()Ll/ۨ۬;

    move-result-object v0

    iput-object v0, p0, Ll/ۤ۬;->۬:Ll/ۨ۬;

    .line 232
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 233
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 235
    :cond_0
    iget-object v0, p0, Ll/ۤ۬;->۬:Ll/ۨ۬;

    if-eqz v0, :cond_2

    .line 236
    iget-object v1, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iput-object v1, v0, Ll/ۨ۬;->ۧ:Landroid/graphics/drawable/Drawable$ConstantState;

    :cond_2
    const/4 v0, 0x1

    .line 238
    iput-boolean v0, p0, Ll/ۤ۬;->ۗ:Z

    :cond_3
    return-object p0
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .line 91
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 92
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    :cond_0
    return-void
.end method

.method public final onLayoutDirectionChanged(I)Z
    .locals 1

    .line 208
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, p1}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;I)Z

    move-result p1

    return p1
.end method

.method public final onLevelChange(I)Z
    .locals 1

    .line 282
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result p1

    return p1
.end method

.method public final scheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;J)V
    .locals 0

    .line 269
    invoke-virtual {p0, p2, p3, p4}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public final setAlpha(I)V
    .locals 1

    .line 120
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    return-void
.end method

.method public final setAutoMirrored(Z)V
    .locals 1

    .line 197
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    .line 81
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    return-void
.end method

.method public final setChangingConfigurations(I)V
    .locals 1

    .line 98
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 125
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public final setDither(Z)V
    .locals 1

    .line 110
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setDither(Z)V

    return-void
.end method

.method public final setFilterBitmap(Z)V
    .locals 1

    .line 115
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setFilterBitmap(Z)V

    return-void
.end method

.method public setState([I)Z
    .locals 1

    .line 138
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result v0

    .line 139
    invoke-direct {p0, p1}, Ll/ۤ۬;->֫([I)Z

    move-result p1

    if-nez p1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public setTint(I)V
    .locals 0

    .line 287
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۤ۬;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 292
    iget-object v0, p0, Ll/ۤ۬;->۬:Ll/ۨ۬;

    iput-object p1, v0, Ll/ۨ۬;->ܽ:Landroid/content/res/ColorStateList;

    .line 146
    iget-object p1, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    .line 293
    invoke-direct {p0, p1}, Ll/ۤ۬;->֫([I)Z

    return-void
.end method

.method public setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 298
    iget-object v0, p0, Ll/ۤ۬;->۬:Ll/ۨ۬;

    iput-object p1, v0, Ll/ۨ۬;->ᩳ:Landroid/graphics/PorterDuff$Mode;

    .line 146
    iget-object p1, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    .line 299
    invoke-direct {p0, p1}, Ll/ۤ۬;->֫([I)Z

    return-void
.end method

.method public final setVisible(ZZ)Z
    .locals 1

    .line 157
    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

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

.method public final unscheduleDrawable(Landroid/graphics/drawable/Drawable;Ljava/lang/Runnable;)V
    .locals 0

    .line 277
    invoke-virtual {p0, p2}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ֫()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 332
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final ֫(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 340
    iget-object v0, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 341
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 344
    :cond_0
    iput-object p1, p0, Ll/ۤ۬;->ۙ:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_1

    .line 347
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 349
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ll/ۤ۬;->setVisible(ZZ)Z

    .line 350
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۤ۬;->setState([I)Z

    .line 351
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getLevel()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    .line 352
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 353
    iget-object v0, p0, Ll/ۤ۬;->۬:Ll/ۨ۬;

    if-eqz v0, :cond_1

    .line 354
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object p1

    iput-object p1, v0, Ll/ۨ۬;->ۧ:Landroid/graphics/drawable/Drawable$ConstantState;

    .line 358
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public ۧ()Z
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method
