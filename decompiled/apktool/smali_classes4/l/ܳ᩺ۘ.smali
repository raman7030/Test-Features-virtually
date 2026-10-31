.class public final Ll/ܳ᩺ۘ;
.super Ll/۬ۨۘ;
.source "58Y6"


# instance fields
.field public final ֫:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ll/۬ۨۘ;-><init>()V

    .line 46
    iput-object p1, p0, Ll/ܳ᩺ۘ;->֫:Landroid/content/res/Resources;

    return-void
.end method

.method public static ֫()Ll/ܳ᩺ۘ;
    .locals 2

    .line 34
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    .line 39
    new-instance v1, Ll/ܳ᩺ۘ;

    invoke-direct {v1, v0}, Ll/ܳ᩺ۘ;-><init>(Landroid/content/res/Resources;)V

    return-object v1
.end method


# virtual methods
.method public final ֫(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;
    .locals 5

    .line 58
    :try_start_0
    invoke-static {p1}, Ll/ܽ֨ܺ;->֫(Ljava/io/InputStream;)Ll/ܽ֨ܺ;

    move-result-object p1
    :try_end_0
    .catch Ll/᩵֨ܺ; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    invoke-virtual {p1}, Ll/ܽ֨ܺ;->ᩳ()F

    move-result v0

    .line 64
    invoke-virtual {p1}, Ll/ܽ֨ܺ;->ۧ()F

    move-result v1

    .line 65
    iget-object v2, p0, Ll/ܳ᩺ۘ;->֫:Landroid/content/res/Resources;

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    mul-float v0, v0, v3

    const/high16 v4, 0x3f000000    # 0.5f

    add-float/2addr v0, v4

    float-to-int v0, v0

    mul-float v1, v1, v3

    add-float/2addr v1, v4

    float-to-int v1, v1

    .line 70
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 71
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 72
    invoke-virtual {v1, v3, v3}, Landroid/graphics/Canvas;->scale(FF)V

    .line 73
    invoke-virtual {p1, v1}, Ll/ܽ֨ܺ;->֫(Landroid/graphics/Canvas;)V

    .line 75
    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {p1, v2, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    return-object p1

    :catch_0
    move-exception p1

    .line 60
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Exception decoding SVG"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
