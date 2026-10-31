.class public final Ll/᩹᩷ۡ;
.super Landroid/graphics/drawable/Drawable;
.source "O8FK"


# instance fields
.field public ֫:I

.field public final ۧ:Landroid/graphics/Paint;

.field public ܽ:I

.field public ᩳ:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 31
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 26
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Ll/᩹᩷ۡ;->ۧ:Landroid/graphics/Paint;

    const/4 v0, 0x0

    .line 28
    iput v0, p0, Ll/᩹᩷ۡ;->ܽ:I

    const v0, 0x30eeeeee

    .line 32
    iput v0, p0, Ll/᩹᩷ۡ;->֫:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 35
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 26
    new-instance p1, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Ll/᩹᩷ۡ;->ۧ:Landroid/graphics/Paint;

    const/4 p1, 0x0

    .line 28
    iput p1, p0, Ll/᩹᩷ۡ;->ܽ:I

    const p1, 0x30888888

    .line 36
    iput p1, p0, Ll/᩹᩷ۡ;->֫:I

    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 13

    .line 54
    iget v0, p0, Ll/᩹᩷ۡ;->ܽ:I

    const/4 v1, 0x2

    iget-object v2, p0, Ll/᩹᩷ۡ;->ۧ:Landroid/graphics/Paint;

    const/4 v3, 0x1

    if-eq v0, v3, :cond_9

    const/4 v4, 0x0

    const v5, 0xffffff

    const-wide/16 v6, 0x0

    if-eq v0, v1, :cond_5

    const/4 v8, 0x3

    if-eq v0, v8, :cond_0

    const/4 v9, 0x4

    if-eq v0, v9, :cond_0

    return-void

    .line 87
    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 88
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v9

    iget-wide v11, p0, Ll/᩹᩷ۡ;->ᩳ:J

    sub-long/2addr v9, v11

    cmp-long v11, v9, v6

    if-ltz v11, :cond_2

    const-wide/16 v6, 0x96

    cmp-long v11, v9, v6

    if-lez v11, :cond_1

    goto :goto_0

    :cond_1
    long-to-float v3, v9

    const/high16 v4, 0x43160000    # 150.0f

    div-float/2addr v3, v4

    .line 120
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v4

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v6

    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    move-result v4

    div-int/2addr v4, v1

    int-to-float v1, v4

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float v3, v3, v4

    add-float/2addr v3, v4

    mul-float v1, v1, v3

    .line 107
    iget v4, p0, Ll/᩹᩷ۡ;->֫:I

    ushr-int/lit8 v6, v4, 0x18

    int-to-float v6, v6

    mul-float v6, v6, v3

    float-to-int v3, v6

    shl-int/lit8 v3, v3, 0x18

    and-int/2addr v4, v5

    or-int/2addr v3, v4

    .line 109
    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 110
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v3, v0, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 111
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void

    .line 90
    :cond_2
    :goto_0
    iget v5, p0, Ll/᩹᩷ۡ;->ܽ:I

    if-ne v5, v8, :cond_3

    .line 91
    iget v4, p0, Ll/᩹᩷ۡ;->֫:I

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 92
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    move-result v5

    int-to-float v5, v5

    .line 120
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v6

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    invoke-static {v6, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    div-int/2addr v0, v1

    int-to-float v0, v0

    .line 92
    invoke-virtual {p1, v4, v5, v0, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 93
    iput v3, p0, Ll/᩹᩷ۡ;->ܽ:I

    return-void

    :cond_3
    const-wide/16 v5, 0x2ee

    cmp-long v3, v9, v5

    if-lez v3, :cond_4

    .line 95
    iput v4, p0, Ll/᩹᩷ۡ;->ܽ:I

    return-void

    .line 97
    :cond_4
    iget v3, p0, Ll/᩹᩷ۡ;->֫:I

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 98
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    move-result v4

    int-to-float v4, v4

    .line 120
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v5

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    div-int/2addr v0, v1

    int-to-float v0, v0

    .line 98
    invoke-virtual {p1, v3, v4, v0, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 99
    iput v1, p0, Ll/᩹᩷ۡ;->ܽ:I

    .line 100
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩹᩷ۡ;->ᩳ:J

    .line 101
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void

    .line 65
    :cond_5
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v8

    iget-wide v10, p0, Ll/᩹᩷ۡ;->ᩳ:J

    sub-long/2addr v8, v10

    cmp-long v0, v8, v6

    if-ltz v0, :cond_8

    const-wide/16 v6, 0x258

    cmp-long v0, v8, v6

    if-lez v0, :cond_6

    goto :goto_2

    .line 70
    :cond_6
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    const/high16 v3, 0x3f800000    # 1.0f

    const-wide/16 v6, 0xc8

    cmp-long v4, v8, v6

    if-gez v4, :cond_7

    goto :goto_1

    :cond_7
    sub-long/2addr v8, v6

    long-to-float v4, v8

    const/high16 v6, 0x43c80000    # 400.0f

    div-float/2addr v4, v6

    sub-float/2addr v3, v4

    .line 120
    :goto_1
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v4

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v6

    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    move-result v4

    div-int/2addr v4, v1

    int-to-float v1, v4

    const v4, 0x3d4ccccd    # 0.05f

    mul-float v4, v4, v3

    const v6, 0x3f733333    # 0.95f

    add-float/2addr v4, v6

    mul-float v4, v4, v1

    .line 78
    iget v1, p0, Ll/᩹᩷ۡ;->֫:I

    ushr-int/lit8 v6, v1, 0x18

    int-to-float v6, v6

    mul-float v6, v6, v3

    float-to-int v3, v6

    shl-int/lit8 v3, v3, 0x18

    and-int/2addr v1, v5

    or-int/2addr v1, v3

    .line 80
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 81
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v1, v0, v4, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 82
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void

    .line 67
    :cond_8
    :goto_2
    iput v4, p0, Ll/᩹᩷ۡ;->ܽ:I

    return-void

    .line 59
    :cond_9
    iget v0, p0, Ll/᩹᩷ۡ;->֫:I

    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 60
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 61
    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerY()I

    move-result v4

    int-to-float v4, v4

    .line 120
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v5

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    div-int/2addr v0, v1

    int-to-float v0, v0

    .line 61
    invoke-virtual {p1, v3, v4, v0, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public final isStateful()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final jumpToCurrentState()V
    .locals 2

    .line 41
    iget v0, p0, Ll/᩹᩷ۡ;->ܽ:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 47
    iput v0, p0, Ll/᩹᩷ۡ;->ܽ:I

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 44
    iput v0, p0, Ll/᩹᩷ۡ;->ܽ:I

    return-void
.end method

.method public final onStateChange([I)Z
    .locals 7

    .line 131
    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-ge v2, v0, :cond_3

    aget v5, p1, v2

    const v6, -0x101009e

    if-ne v5, v6, :cond_0

    .line 133
    iput v1, p0, Ll/᩹᩷ۡ;->ܽ:I

    .line 134
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return v4

    :cond_0
    const v6, 0x10100a1

    if-ne v5, v6, :cond_1

    .line 138
    iput v4, p0, Ll/᩹᩷ۡ;->ܽ:I

    .line 139
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return v4

    :cond_1
    const v4, 0x10100a7

    if-ne v5, v4, :cond_2

    const/4 v3, 0x1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x3

    const/4 v0, 0x2

    if-eqz v3, :cond_5

    .line 148
    iget v2, p0, Ll/᩹᩷ۡ;->ܽ:I

    if-eqz v2, :cond_4

    if-ne v2, v0, :cond_7

    .line 149
    :cond_4
    iput p1, p0, Ll/᩹᩷ۡ;->ܽ:I

    .line 150
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩹᩷ۡ;->ᩳ:J

    .line 151
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return v4

    .line 156
    :cond_5
    iget v2, p0, Ll/᩹᩷ۡ;->ܽ:I

    if-ne v2, v4, :cond_6

    .line 157
    iput v0, p0, Ll/᩹᩷ۡ;->ܽ:I

    .line 158
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩹᩷ۡ;->ᩳ:J

    .line 159
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return v4

    :cond_6
    if-ne v2, p1, :cond_7

    const/4 p1, 0x4

    .line 163
    iput p1, p0, Ll/᩹᩷ۡ;->ܽ:I

    .line 164
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return v4

    :cond_7
    return v1
.end method

.method public final setAlpha(I)V
    .locals 2

    shl-int/lit8 p1, p1, 0x18

    .line 173
    iget v0, p0, Ll/᩹᩷ۡ;->֫:I

    const v1, 0xffffff

    and-int/2addr v0, v1

    or-int/2addr p1, v0

    iput p1, p0, Ll/᩹᩷ۡ;->֫:I

    .line 174
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 187
    iget-object v0, p0, Ll/᩹᩷ۡ;->ۧ:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 188
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
