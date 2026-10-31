.class public final Ll/ۙ᩷ۡ;
.super Ljava/lang/Object;
.source "N933"


# instance fields
.field public ֫:I

.field public final ۧ:Landroid/graphics/Paint;

.field public ܽ:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 632
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 633
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Ll/ۙ᩷ۡ;->ۧ:Landroid/graphics/Paint;

    return-void
.end method


# virtual methods
.method public final ֫(ILandroid/graphics/Rect;)V
    .locals 9

    .line 638
    iget-object v0, p0, Ll/ۙ᩷ۡ;->ܽ:Landroid/graphics/Rect;

    invoke-virtual {p2, v0}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Ll/ۙ᩷ۡ;->֫:I

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 639
    :cond_1
    :goto_0
    iput-object p2, p0, Ll/ۙ᩷ۡ;->ܽ:Landroid/graphics/Rect;

    .line 640
    iput p1, p0, Ll/ۙ᩷ۡ;->֫:I

    .line 641
    new-instance v0, Landroid/graphics/LinearGradient;

    iget v1, p2, Landroid/graphics/Rect;->left:I

    int-to-float v2, v1

    iget v1, p2, Landroid/graphics/Rect;->top:I

    int-to-float v3, v1

    iget p2, p2, Landroid/graphics/Rect;->right:I

    int-to-float v4, p2

    int-to-float v5, v1

    const p2, 0xffffff

    and-int v6, p1, p2

    const/high16 p2, -0x1000000

    or-int v7, p1, p2

    sget-object v8, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    iget-object p1, p0, Ll/ۙ᩷ۡ;->ۧ:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void
.end method

.method public final ֫(Landroid/graphics/Canvas;)V
    .locals 2

    .line 647
    iget-object v0, p0, Ll/ۙ᩷ۡ;->ܽ:Landroid/graphics/Rect;

    iget-object v1, p0, Ll/ۙ᩷ۡ;->ۧ:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method
