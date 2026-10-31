.class public final Ll/᩹۠ۡ;
.super Landroid/widget/FrameLayout;
.source "Z6VB"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;


# instance fields
.field public ۗ:Ll/۟ۢ֫;

.field public final ۙ:Ll/ۛ۠ۡ;

.field public ۛ:I

.field public final ۤ:Landroid/view/TextureView;

.field public ۨ:Z

.field public ۫:Ll/᩺۠ۡ;

.field public final ۬:Ll/ۚ۠ۡ;

.field public ᩶:Z

.field public ᩸:Z

.field public final ᩹:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 30
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 25
    new-instance p2, Ll/ۚ۠ۡ;

    invoke-direct {p2, p0}, Ll/ۚ۠ۡ;-><init>(Ll/᩹۠ۡ;)V

    iput-object p2, p0, Ll/᩹۠ۡ;->۬:Ll/ۚ۠ۡ;

    .line 31
    new-instance p2, Landroid/widget/ImageView;

    invoke-direct {p2, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Ll/᩹۠ۡ;->᩹:Landroid/widget/ImageView;

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    invoke-virtual {p2, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 33
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const/4 v0, 0x2

    .line 34
    invoke-virtual {p2, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    const/4 v1, 0x0

    .line 36
    invoke-virtual {p0, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 37
    new-instance v2, Landroid/view/TextureView;

    invoke-direct {v2, p1}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Ll/᩹۠ۡ;->ۤ:Landroid/view/TextureView;

    .line 38
    invoke-virtual {v2, v1}, Landroid/view/TextureView;->setOpaque(Z)V

    .line 39
    invoke-virtual {v2, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 40
    invoke-virtual {v2, p0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 41
    new-instance p1, Ll/ۛ۠ۡ;

    new-instance v0, Ll/۠ۚۢ;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p0}, Ll/۠ۚۢ;-><init>(ILjava/lang/Object;)V

    invoke-direct {p1, v2, v0}, Ll/ۛ۠ۡ;-><init>(Landroid/view/TextureView;Ll/۠ۚۢ;)V

    iput-object p1, p0, Ll/᩹۠ۡ;->ۙ:Ll/ۛ۠ۡ;

    .line 42
    new-instance p1, Ll/֨۠ۡ;

    invoke-direct {p1, p0}, Ll/֨۠ۡ;-><init>(Ll/᩹۠ۡ;)V

    invoke-virtual {v2, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 43
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v0, -0x1

    invoke-direct {p1, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 44
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {p1, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private ֫(II)F
    .locals 3

    .line 98
    iget-object v0, p0, Ll/᩹۠ۡ;->᩹:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    sub-int/2addr p1, v1

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    sub-int/2addr p1, v1

    const/4 v1, 0x1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 99
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int v2, p2, v2

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    sub-int/2addr v2, v0

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 100
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    int-to-float p1, p1

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p1, p2

    return p1
.end method

.method private ֫(Landroid/graphics/SurfaceTexture;II)V
    .locals 10

    .line 123
    new-instance v9, Ll/᩺۠ۡ;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    .line 124
    invoke-direct {p0, p2, p3}, Ll/᩹۠ۡ;->֫(II)F

    move-result v5

    iget v6, p0, Ll/᩹۠ۡ;->ۛ:I

    iget-boolean v7, p0, Ll/᩹۠ۡ;->ۨ:Z

    new-instance v8, Ll/᩸۠ۡ;

    invoke-direct {v8, p0}, Ll/᩸۠ۡ;-><init>(Ll/᩹۠ۡ;)V

    move-object v0, v9

    move-object v2, p1

    move v3, p2

    move v4, p3

    invoke-direct/range {v0 .. v8}, Ll/᩺۠ۡ;-><init>(Landroid/content/res/AssetManager;Landroid/graphics/SurfaceTexture;IIFIZLl/᩸۠ۡ;)V

    iput-object v9, p0, Ll/᩹۠ۡ;->۫:Ll/᩺۠ۡ;

    .line 86
    iget-object p1, p0, Ll/᩹۠ۡ;->ۙ:Ll/ۛ۠ۡ;

    iget-object p1, p1, Ll/ۛ۠ۡ;->ۙ:[F

    invoke-virtual {v9, p1}, Ll/᩺۠ۡ;->֫([F)V

    .line 142
    invoke-direct {p0}, Ll/᩹۠ۡ;->ᩳ()V

    .line 143
    iget-object p1, p0, Ll/᩹۠ۡ;->۫:Ll/᩺۠ۡ;

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static ֫(Ll/᩹۠ۡ;)V
    .locals 1

    .line 86
    iget-object v0, p0, Ll/᩹۠ۡ;->۫:Ll/᩺۠ۡ;

    if-eqz v0, :cond_0

    iget-object p0, p0, Ll/᩹۠ۡ;->ۙ:Ll/ۛ۠ۡ;

    iget-object p0, p0, Ll/ۛ۠ۡ;->ۙ:[F

    invoke-virtual {v0, p0}, Ll/᩺۠ۡ;->֫([F)V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩹۠ۡ;Ll/᩺۠ۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/᩹۠ۡ;->֫(Ll/᩺۠ۡ;)V

    return-void
.end method

.method private ֫(Ll/᩺۠ۡ;)V
    .locals 1

    .line 148
    iget-object v0, p0, Ll/᩹۠ۡ;->᩹:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/᩹۠ۡ;->۫:Ll/᩺۠ۡ;

    if-ne v0, p1, :cond_0

    if-eqz p1, :cond_0

    iget-boolean p1, p1, Ll/᩺۠ۡ;->ۗ:Z

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Ll/᩹۠ۡ;->᩶:Z

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Ll/᩹۠ۡ;->᩸:Z

    if-nez p1, :cond_0

    .line 150
    iget-object p1, p0, Ll/᩹۠ۡ;->᩹:Landroid/widget/ImageView;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 151
    invoke-direct {p0}, Ll/᩹۠ۡ;->ᩳ()V

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/᩹۠ۡ;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 42
    iget-object p0, p0, Ll/᩹۠ۡ;->ۙ:Ll/ۛ۠ۡ;

    invoke-virtual {p0, p1}, Ll/ۛ۠ۡ;->֫(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۧ(Ll/᩹۠ۡ;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Ll/᩹۠ۡ;->ᩳ()V

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/᩹۠ۡ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/᩹۠ۡ;->᩸:Z

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/᩹۠ۡ;)Landroid/widget/ImageView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹۠ۡ;->᩹:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/᩹۠ۡ;)Landroid/view/TextureView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹۠ۡ;->ۤ:Landroid/view/TextureView;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/᩹۠ۡ;)Ll/᩺۠ۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩹۠ۡ;->۫:Ll/᩺۠ۡ;

    return-object p0
.end method

.method private ᩳ()V
    .locals 4

    .line 213
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getWindowVisibility()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 214
    invoke-virtual {p0}, Landroid/view/View;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩹۠ۡ;->ۗ:Ll/۟ۢ֫;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    sget-object v2, Ll/ܰۢ֫;->ۗ:Ll/ܰۢ֫;

    invoke-virtual {v0, v2}, Ll/ܰۢ֫;->֫(Ll/ܰۢ֫;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 215
    :goto_0
    iget-object v2, p0, Ll/᩹۠ۡ;->۫:Ll/᩺۠ۡ;

    if-eqz v2, :cond_4

    .line 216
    iget-object v2, p0, Ll/᩹۠ۡ;->ۗ:Ll/۟ۢ֫;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v2

    sget-object v3, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/᩹۠ۡ;->۫:Ll/᩺۠ۡ;

    invoke-virtual {v2}, Ll/᩺۠ۡ;->ۧ()V

    goto :goto_2

    .line 217
    :cond_2
    iget-object v2, p0, Ll/᩹۠ۡ;->۫:Ll/᩺۠ۡ;

    if-eqz v0, :cond_3

    iget-boolean v3, p0, Ll/᩹۠ۡ;->᩸:Z

    if-nez v3, :cond_3

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {v2, v3}, Ll/᩺۠ۡ;->֫(Z)V

    .line 219
    :cond_4
    :goto_2
    iget-object v2, p0, Ll/᩹۠ۡ;->ۙ:Ll/ۛ۠ۡ;

    if-eqz v2, :cond_6

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Ll/᩹۠ۡ;->᩸:Z

    if-nez v0, :cond_5

    iget-object v0, p0, Ll/᩹۠ۡ;->۫:Ll/᩺۠ۡ;

    if-eqz v0, :cond_5

    iget-boolean v0, v0, Ll/᩺۠ۡ;->ۗ:Z

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Ll/᩹۠ۡ;->᩶:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Ll/᩹۠ۡ;->᩹:Landroid/widget/ImageView;

    .line 220
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/4 v3, 0x4

    if-ne v0, v3, :cond_5

    const/4 v1, 0x1

    .line 219
    :cond_5
    invoke-virtual {v2, v1}, Ll/ۛ۠ۡ;->ۧ(Z)V

    :cond_6
    return-void
.end method

.method public static bridge synthetic ᩻(Ll/᩹۠ۡ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩹۠ۡ;->ᩳ()V

    return-void
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 2

    .line 198
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 199
    iget-object v0, p0, Ll/᩹۠ۡ;->ۗ:Ll/۟ۢ֫;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/᩹۠ۡ;->۬:Ll/ۚ۠ۡ;

    invoke-virtual {v0, v1}, Ll/۟ۢ֫;->֫(Ll/ܳۡ֫;)V

    .line 200
    :cond_0
    invoke-direct {p0}, Ll/᩹۠ۡ;->ᩳ()V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 205
    iget-object v0, p0, Ll/᩹۠ۡ;->ۗ:Ll/۟ۢ֫;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ll/᩹۠ۡ;->۬:Ll/ۚ۠ۡ;

    invoke-virtual {v0, v1}, Ll/۟ۢ֫;->ۧ(Ll/ܳۡ֫;)V

    .line 206
    :cond_0
    iget-object v0, p0, Ll/᩹۠ۡ;->ۙ:Ll/ۛ۠ۡ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ۛ۠ۡ;->ۧ(Z)V

    .line 207
    iget-object v0, p0, Ll/᩹۠ۡ;->۫:Ll/᩺۠ۡ;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Ll/᩺۠ۡ;->֫(Z)V

    .line 208
    :cond_1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    return-void
.end method

.method public final onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 2

    const/4 v0, 0x0

    .line 105
    iput-boolean v0, p0, Ll/᩹۠ۡ;->᩶:Z

    .line 106
    iput-boolean v0, p0, Ll/᩹۠ۡ;->᩸:Z

    .line 107
    iget-object v1, p0, Ll/᩹۠ۡ;->ۙ:Ll/ۛ۠ۡ;

    invoke-virtual {v1, v0}, Ll/ۛ۠ۡ;->ۧ(Z)V

    .line 108
    iget-object v1, p0, Ll/᩹۠ۡ;->᩹:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 109
    iget-object v1, p0, Ll/᩹۠ۡ;->ۤ:Landroid/view/TextureView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 111
    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Ll/᩹۠ۡ;->֫(Landroid/graphics/SurfaceTexture;II)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const/4 p1, 0x0

    .line 114
    iput-object p1, p0, Ll/᩹۠ۡ;->۫:Ll/᩺۠ۡ;

    const/4 p1, 0x1

    .line 115
    iput-boolean p1, p0, Ll/᩹۠ۡ;->᩸:Z

    const/4 p1, 0x0

    .line 116
    invoke-virtual {v1, p1}, Landroid/view/View;->setAlpha(F)V

    .line 117
    invoke-direct {p0}, Ll/᩹۠ۡ;->ᩳ()V

    return-void
.end method

.method public final onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 2

    .line 162
    iget-object p1, p0, Ll/᩹۠ۡ;->۫:Ll/᩺۠ۡ;

    const/4 v0, 0x0

    .line 163
    iput-object v0, p0, Ll/᩹۠ۡ;->۫:Ll/᩺۠ۡ;

    const/4 v0, 0x0

    .line 164
    iput-boolean v0, p0, Ll/᩹۠ۡ;->᩶:Z

    .line 165
    iget-object v1, p0, Ll/᩹۠ۡ;->᩹:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 166
    iget-object v1, p0, Ll/᩹۠ۡ;->ۙ:Ll/ۛ۠ۡ;

    invoke-virtual {v1, v0}, Ll/ۛ۠ۡ;->ۧ(Z)V

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 168
    :cond_0
    invoke-virtual {p1}, Ll/᩺۠ۡ;->֫()V

    return v0
.end method

.method public final onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 1

    .line 157
    iget-object p1, p0, Ll/᩹۠ۡ;->۫:Ll/᩺۠ۡ;

    if-eqz p1, :cond_0

    invoke-direct {p0, p2, p3}, Ll/᩹۠ۡ;->֫(II)F

    move-result v0

    invoke-virtual {p1, p2, v0, p3}, Ll/᩺۠ۡ;->֫(IFI)V

    :cond_0
    return-void
.end method

.method public final onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    const/4 p1, 0x1

    .line 174
    iput-boolean p1, p0, Ll/᩹۠ۡ;->᩶:Z

    .line 175
    iget-object p1, p0, Ll/᩹۠ۡ;->۫:Ll/᩺۠ۡ;

    invoke-direct {p0, p1}, Ll/᩹۠ۡ;->֫(Ll/᩺۠ۡ;)V

    return-void
.end method

.method public final onVisibilityChanged(Landroid/view/View;I)V
    .locals 0

    .line 186
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onVisibilityChanged(Landroid/view/View;I)V

    .line 187
    invoke-direct {p0}, Ll/᩹۠ۡ;->ᩳ()V

    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 0

    .line 192
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onWindowFocusChanged(Z)V

    .line 193
    invoke-direct {p0}, Ll/᩹۠ۡ;->ᩳ()V

    return-void
.end method

.method public final onWindowVisibilityChanged(I)V
    .locals 0

    .line 180
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onWindowVisibilityChanged(I)V

    .line 181
    invoke-direct {p0}, Ll/᩹۠ۡ;->ᩳ()V

    return-void
.end method

.method public final ֫()Landroid/widget/ImageView;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/᩹۠ۡ;->᩹:Landroid/widget/ImageView;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 2

    .line 91
    iput p1, p0, Ll/᩹۠ۡ;->ۛ:I

    const/4 v0, 0x3

    new-array v0, v0, [F

    .line 93
    invoke-static {p1, v0}, Landroid/graphics/Color;->colorToHSV(I[F)V

    const/4 p1, 0x1

    .line 94
    aget v0, v0, p1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Ll/᩹۠ۡ;->ۨ:Z

    return-void
.end method

.method public final ֫(Ll/ۗܺ᩷;)V
    .locals 2

    .line 59
    iget-object v0, p0, Ll/᩹۠ۡ;->ۗ:Ll/۟ۢ֫;

    iget-object v1, p0, Ll/᩹۠ۡ;->۬:Ll/ۚ۠ۡ;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Ll/۟ۢ֫;->ۧ(Ll/ܳۡ֫;)V

    .line 60
    :cond_0
    invoke-virtual {p1}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object p1

    iput-object p1, p0, Ll/᩹۠ۡ;->ۗ:Ll/۟ۢ֫;

    .line 61
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Ll/᩹۠ۡ;->ۗ:Ll/۟ۢ֫;

    invoke-virtual {p1, v1}, Ll/۟ۢ֫;->֫(Ll/ܳۡ֫;)V

    .line 62
    :cond_1
    invoke-direct {p0}, Ll/᩹۠ۡ;->ᩳ()V

    return-void
.end method

.method public final ֫(Ll/ܶ᩹ۡ;)V
    .locals 1

    .line 49
    iget-object v0, p0, Ll/᩹۠ۡ;->᩹:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 72
    iget-object v0, p0, Ll/᩹۠ۡ;->ۙ:Ll/ۛ۠ۡ;

    invoke-virtual {v0, p1}, Ll/ۛ۠ۡ;->֫(Z)V

    return-void
.end method

.method public final ۧ()V
    .locals 4

    .line 77
    iget-object v0, p0, Ll/᩹۠ۡ;->ۙ:Ll/ۛ۠ۡ;

    const-wide/16 v1, 0x1a4

    const/4 v3, 0x1

    .line 198
    invoke-virtual {v0, v1, v2, v3}, Ll/ۛ۠ۡ;->֫(JZ)V

    return-void
.end method

.method public final ܽ()V
    .locals 4

    const-wide/16 v0, 0x15e

    .line 82
    iget-object v2, p0, Ll/᩹۠ۡ;->ۙ:Ll/ۛ۠ۡ;

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v1, v3}, Ll/ۛ۠ۡ;->֫(JZ)V

    return-void
.end method
