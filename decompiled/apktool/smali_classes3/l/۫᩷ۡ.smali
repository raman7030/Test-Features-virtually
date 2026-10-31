.class public final Ll/۫᩷ۡ;
.super Ljava/lang/Object;
.source "N933"


# instance fields
.field public ֫:Landroid/graphics/Bitmap;

.field public ۧ:Landroid/graphics/Canvas;

.field public ܳ:Landroid/graphics/LinearGradient;

.field public ܽ:F

.field public ܿ:Landroid/graphics/Rect;

.field public final ᩳ:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 560
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 561
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Ll/۫᩷ۡ;->ᩳ:Landroid/graphics/Paint;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/graphics/Canvas;)V
    .locals 3

    .line 592
    iget-object v0, p0, Ll/۫᩷ۡ;->֫:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    iget-object v2, p0, Ll/۫᩷ۡ;->ܿ:Landroid/graphics/Rect;

    invoke-virtual {p1, v0, v1, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final ֫(Landroid/graphics/Rect;F)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    .line 570
    iget-object v3, v0, Ll/۫᩷ۡ;->ܿ:Landroid/graphics/Rect;

    invoke-virtual {v1, v3}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 571
    iput-object v1, v0, Ll/۫᩷ۡ;->ܿ:Landroid/graphics/Rect;

    .line 572
    iget-object v3, v0, Ll/۫᩷ۡ;->֫:Landroid/graphics/Bitmap;

    if-eqz v3, :cond_0

    .line 573
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->recycle()V

    .line 575
    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Rect;->width()I

    move-result v3

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Rect;->height()I

    move-result v4

    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    iput-object v3, v0, Ll/۫᩷ۡ;->֫:Landroid/graphics/Bitmap;

    .line 576
    new-instance v3, Landroid/graphics/Canvas;

    iget-object v4, v0, Ll/۫᩷ۡ;->֫:Landroid/graphics/Bitmap;

    invoke-direct {v3, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v3, v0, Ll/۫᩷ۡ;->ۧ:Landroid/graphics/Canvas;

    .line 577
    new-instance v3, Landroid/graphics/LinearGradient;

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Rect;->height()I

    move-result v4

    int-to-float v9, v4

    const/high16 v11, -0x1000000

    sget-object v12, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, -0x1

    move-object v5, v3

    invoke-direct/range {v5 .. v12}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    iput-object v3, v0, Ll/۫᩷ۡ;->ܳ:Landroid/graphics/LinearGradient;

    goto :goto_0

    .line 580
    :cond_1
    iget v3, v0, Ll/۫᩷ۡ;->ܽ:F

    cmpl-float v3, v2, v3

    if-eqz v3, :cond_2

    .line 583
    :goto_0
    iput v2, v0, Ll/۫᩷ۡ;->ܽ:F

    const/4 v3, 0x3

    new-array v3, v3, [F

    const/4 v4, 0x0

    aput v2, v3, v4

    const/4 v2, 0x1

    const/high16 v4, 0x3f800000    # 1.0f

    aput v4, v3, v2

    const/4 v2, 0x2

    aput v4, v3, v2

    .line 584
    invoke-static {v3}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v11

    .line 585
    new-instance v2, Landroid/graphics/LinearGradient;

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Rect;->width()I

    move-result v3

    int-to-float v8, v3

    const/4 v10, -0x1

    sget-object v12, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    const/4 v6, 0x0

    const/4 v14, 0x0

    const/4 v9, 0x0

    move-object v5, v2

    move v7, v14

    invoke-direct/range {v5 .. v12}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 586
    new-instance v3, Landroid/graphics/ComposeShader;

    iget-object v4, v0, Ll/۫᩷ۡ;->ܳ:Landroid/graphics/LinearGradient;

    sget-object v5, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v3, v4, v2, v5}, Landroid/graphics/ComposeShader;-><init>(Landroid/graphics/Shader;Landroid/graphics/Shader;Landroid/graphics/PorterDuff$Mode;)V

    iget-object v2, v0, Ll/۫᩷ۡ;->ᩳ:Landroid/graphics/Paint;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 587
    iget-object v13, v0, Ll/۫᩷ۡ;->ۧ:Landroid/graphics/Canvas;

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Rect;->width()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Rect;->height()I

    move-result v1

    int-to-float v1, v1

    const/4 v15, 0x0

    move/from16 v16, v3

    move/from16 v17, v1

    move-object/from16 v18, v2

    invoke-virtual/range {v13 .. v18}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_2
    return-void
.end method
