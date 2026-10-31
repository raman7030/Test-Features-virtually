.class public final Ll/ܿۨۘ;
.super Landroid/graphics/drawable/Drawable;
.source "E8ZU"


# instance fields
.field public ֫:Landroid/graphics/drawable/Drawable$Callback;

.field public ۜ:Landroid/graphics/drawable/Drawable;

.field public ۡ:Z

.field public ۢ:Z

.field public ۧ:I

.field public final ܳ:Ll/ܳۨۘ;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Ll/ۖ᩹ۢ;

.field public final ᩳ:Ll/᩹ۨۘ;

.field public ᩷:F

.field public final ᩻:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ܳۨۘ;Ll/ۖ᩹ۢ;Ll/᩹ۨۘ;)V
    .locals 1

    .line 45
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/4 v0, 0x0

    .line 35
    iput-boolean v0, p0, Ll/ܿۨۘ;->ۡ:Z

    .line 46
    iput-object p1, p0, Ll/ܿۨۘ;->ܽ:Ljava/lang/String;

    .line 47
    iput-object p2, p0, Ll/ܿۨۘ;->ܳ:Ll/ܳۨۘ;

    .line 48
    iput-object p3, p0, Ll/ܿۨۘ;->ܿ:Ll/ۖ᩹ۢ;

    .line 49
    iput-object p4, p0, Ll/ܿۨۘ;->ᩳ:Ll/᩹ۨۘ;

    .line 51
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    iput-object p1, p0, Ll/ܿۨۘ;->᩻:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method private ܽ()V
    .locals 12

    .line 266
    iget v0, p0, Ll/ܿۨۘ;->ۧ:I

    const/4 v1, 0x0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    .line 268
    iput-boolean v0, p0, Ll/ܿۨۘ;->ۢ:Z

    .line 272
    iget-object v2, p0, Ll/ܿۨۘ;->ۜ:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_1

    .line 298
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v3

    .line 299
    invoke-virtual {v3}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    .line 17
    :cond_0
    new-instance v3, Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    invoke-direct {v3, v1, v1, v4, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 303
    invoke-virtual {v3}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    .line 307
    :cond_1
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3, v1, v1, v0, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 272
    :goto_0
    invoke-virtual {p0, v3}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void

    .line 276
    :cond_2
    iput-boolean v1, p0, Ll/ܿۨۘ;->ۢ:Z

    .line 383
    iget-object v0, p0, Ll/ܿۨۘ;->ܿ:Ll/ۖ᩹ۢ;

    check-cast v0, Ll/᩶ۨۘ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    iget-object v2, p0, Ll/ܿۨۘ;->ۜ:Landroid/graphics/drawable/Drawable;

    .line 23
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    .line 93
    iget v3, p0, Ll/ܿۨۘ;->ۧ:I

    .line 102
    iget v4, p0, Ll/ܿۨۘ;->᩷:F

    .line 36
    iget-object v5, p0, Ll/ܿۨۘ;->ᩳ:Ll/᩹ۨۘ;

    const/high16 v6, 0x3f000000    # 0.5f

    if-nez v5, :cond_3

    .line 40
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v0

    if-le v0, v3, :cond_8

    int-to-float v0, v0

    int-to-float v4, v3

    div-float/2addr v0, v4

    .line 43
    new-instance v4, Landroid/graphics/Rect;

    .line 47
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v2, v0

    add-float/2addr v2, v6

    float-to-int v0, v2

    invoke-direct {v4, v1, v1, v3, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object v2, v4

    goto :goto_5

    .line 57
    :cond_3
    iget-object v7, v5, Ll/᩹ۨۘ;->ۧ:Ll/᩸ۨۘ;

    .line 58
    iget-object v5, v5, Ll/᩹ۨۘ;->֫:Ll/᩸ۨۘ;

    .line 60
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v8

    .line 61
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v9

    int-to-float v10, v8

    int-to-float v11, v9

    div-float/2addr v10, v11

    const-string v11, "%"

    if-eqz v7, :cond_7

    .line 70
    iget-object v2, v7, Ll/᩸ۨۘ;->֫:Ljava/lang/String;

    invoke-virtual {v11, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    int-to-float v2, v3

    .line 71
    iget v3, v7, Ll/᩸ۨۘ;->ۧ:F

    const/high16 v7, 0x42c80000    # 100.0f

    div-float/2addr v3, v7

    mul-float v3, v3, v2

    add-float/2addr v3, v6

    float-to-int v2, v3

    goto :goto_1

    .line 73
    :cond_4
    invoke-virtual {v0, v7, v8, v4}, Ll/᩶ۨۘ;->֫(Ll/᩸ۨۘ;IF)I

    move-result v2

    :goto_1
    if-eqz v5, :cond_6

    .line 76
    iget-object v3, v5, Ll/᩸ۨۘ;->֫:Ljava/lang/String;

    .line 77
    invoke-virtual {v11, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_2

    .line 80
    :cond_5
    invoke-virtual {v0, v5, v9, v4}, Ll/᩶ۨۘ;->֫(Ll/᩸ۨۘ;IF)I

    move-result v0

    goto :goto_3

    :cond_6
    :goto_2
    int-to-float v0, v2

    div-float/2addr v0, v10

    add-float/2addr v0, v6

    float-to-int v0, v0

    .line 83
    :goto_3
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3, v1, v1, v2, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    goto :goto_4

    :cond_7
    if-eqz v5, :cond_8

    .line 87
    iget-object v3, v5, Ll/᩸ۨۘ;->֫:Ljava/lang/String;

    invoke-virtual {v11, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    .line 88
    invoke-virtual {v0, v5, v9, v4}, Ll/᩶ۨۘ;->֫(Ll/᩸ۨۘ;IF)I

    move-result v0

    int-to-float v2, v0

    mul-float v2, v2, v10

    add-float/2addr v2, v6

    float-to-int v2, v2

    .line 90
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3, v1, v1, v2, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    :goto_4
    move-object v2, v3

    .line 280
    :cond_8
    :goto_5
    iget-object v0, p0, Ll/ܿۨۘ;->ۜ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 283
    iget-object v0, p0, Ll/ܿۨۘ;->ۜ:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Ll/ܿۨۘ;->֫:Landroid/graphics/drawable/Drawable$Callback;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 287
    invoke-virtual {p0, v2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 289
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 325
    invoke-virtual {p0}, Ll/ܿۨۘ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 326
    iget-object v0, p0, Ll/ܿۨۘ;->ۜ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_0
    return-void
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .line 366
    invoke-virtual {p0}, Ll/ܿۨۘ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 367
    iget-object v0, p0, Ll/ܿۨۘ;->ۜ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .line 354
    invoke-virtual {p0}, Ll/ܿۨۘ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 355
    iget-object v0, p0, Ll/ܿۨۘ;->ۜ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final getOpacity()I
    .locals 1

    .line 343
    invoke-virtual {p0}, Ll/ܿۨۘ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 344
    iget-object v0, p0, Ll/ܿۨۘ;->ۜ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x2

    return v0
.end method

.method public final setAlpha(I)V
    .locals 0

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 389
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AsyncDrawable{destination=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܿۨۘ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', imageSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܿۨۘ;->ᩳ:Ll/᩹ۨۘ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ܿۨۘ;->ۜ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", canvasWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܿۨۘ;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", textSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܿۨۘ;->᩷:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", waitingForDimensions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/ܿۨۘ;->ۢ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Ll/ܿۨۘ;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(FI)V
    .locals 0

    .line 315
    iput p2, p0, Ll/ܿۨۘ;->ۧ:I

    .line 316
    iput p1, p0, Ll/ܿۨۘ;->᩷:F

    .line 318
    iget-boolean p1, p0, Ll/ܿۨۘ;->ۢ:Z

    if-eqz p1, :cond_0

    .line 319
    invoke-direct {p0}, Ll/ܿۨۘ;->ܽ()V

    :cond_0
    return-void
.end method

.method public final ֫(Landroid/graphics/drawable/Drawable$Callback;)V
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object v1, v0

    goto :goto_0

    .line 124
    :cond_0
    new-instance v1, Ll/ᩳۨۘ;

    invoke-direct {v1, p0, p1}, Ll/ᩳۨۘ;-><init>(Ll/ܿۨۘ;Landroid/graphics/drawable/Drawable$Callback;)V

    :goto_0
    iput-object v1, p0, Ll/ܿۨۘ;->֫:Landroid/graphics/drawable/Drawable$Callback;

    .line 126
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 129
    iget-object p1, p0, Ll/ܿۨۘ;->֫:Landroid/graphics/drawable/Drawable$Callback;

    iget-object v1, p0, Ll/ܿۨۘ;->ܳ:Ll/ܳۨۘ;

    if-eqz p1, :cond_6

    .line 134
    iget-object p1, p0, Ll/ܿۨۘ;->ۜ:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_1

    .line 135
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object p1

    if-nez p1, :cond_1

    .line 136
    iget-object p1, p0, Ll/ܿۨۘ;->ۜ:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Ll/ܿۨۘ;->֫:Landroid/graphics/drawable/Drawable$Callback;

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 140
    :cond_1
    iget-object p1, p0, Ll/ܿۨۘ;->ۜ:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_3

    iget-object v0, p0, Ll/ܿۨۘ;->᩻:Landroid/graphics/drawable/Drawable;

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v0, 0x1

    :goto_2
    if-eqz p1, :cond_4

    .line 143
    iget-object v2, p0, Ll/ܿۨۘ;->֫:Landroid/graphics/drawable/Drawable$Callback;

    invoke-virtual {p1, v2}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 146
    iget-object p1, p0, Ll/ܿۨۘ;->ۜ:Landroid/graphics/drawable/Drawable;

    instance-of v2, p1, Landroid/graphics/drawable/Animatable;

    if-eqz v2, :cond_4

    iget-boolean v2, p0, Ll/ܿۨۘ;->ۡ:Z

    if-eqz v2, :cond_4

    .line 147
    check-cast p1, Landroid/graphics/drawable/Animatable;

    invoke-interface {p1}, Landroid/graphics/drawable/Animatable;->start()V

    :cond_4
    if-eqz v0, :cond_5

    .line 152
    invoke-virtual {v1, p0}, Ll/ܳۨۘ;->ۧ(Ll/ܿۨۘ;)V

    :cond_5
    return-void

    .line 155
    :cond_6
    iget-object p1, p0, Ll/ܿۨۘ;->ۜ:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_7

    .line 157
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 160
    iget-object p1, p0, Ll/ܿۨۘ;->ۜ:Landroid/graphics/drawable/Drawable;

    instance-of v0, p1, Landroid/graphics/drawable/Animatable;

    if-eqz v0, :cond_7

    .line 161
    check-cast p1, Landroid/graphics/drawable/Animatable;

    .line 162
    invoke-interface {p1}, Landroid/graphics/drawable/Animatable;->isRunning()Z

    move-result v0

    iput-boolean v0, p0, Ll/ܿۨۘ;->ۡ:Z

    if-eqz v0, :cond_7

    .line 164
    invoke-interface {p1}, Landroid/graphics/drawable/Animatable;->stop()V

    .line 169
    :cond_7
    invoke-virtual {v1, p0}, Ll/ܳۨۘ;->֫(Ll/ܿۨۘ;)V

    return-void
.end method

.method public final ֫(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    const/4 v0, 0x0

    .line 233
    iput-boolean v0, p0, Ll/ܿۨۘ;->ۡ:Z

    .line 236
    iget-object v0, p0, Ll/ܿۨۘ;->ۜ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 237
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 240
    :cond_0
    iput-object p1, p0, Ll/ܿۨۘ;->ۜ:Landroid/graphics/drawable/Drawable;

    .line 243
    invoke-direct {p0}, Ll/ܿۨۘ;->ܽ()V

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 110
    iget-object v0, p0, Ll/ܿۨۘ;->ۜ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
