.class public Lbin/mt/plugin/api/drawable/VectorDrawableLoaderImpl;
.super Ljava/lang/Object;
.source "VectorDrawableLoaderImpl.java"

# interfaces
.implements Ll/۬ܳ᩷;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static register()V
    .locals 2

    .line 31
    new-instance v0, Lbin/mt/plugin/api/drawable/VectorDrawableLoaderImpl;

    invoke-direct {v0}, Lbin/mt/plugin/api/drawable/VectorDrawableLoaderImpl;-><init>()V

    const-class v1, Ll/۬ܳ᩷;

    invoke-static {v1, v0}, Lbin/mt/plugin/api/util/ServiceLoader;->register(Ljava/lang/Class;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public fromSvg(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 65
    :try_start_0
    invoke-static {p1}, Ll/ܽ֨ܺ;->֫(Ljava/io/InputStream;)Ll/ܽ֨ܺ;

    move-result-object p1

    .line 66
    invoke-virtual {p1}, Ll/ܽ֨ܺ;->ܽ()Landroid/graphics/RectF;

    move-result-object v0

    .line 67
    invoke-virtual {p1}, Ll/ܽ֨ܺ;->ᩳ()F

    move-result v1

    float-to-int v1, v1

    .line 68
    invoke-virtual {p1}, Ll/ܽ֨ܺ;->ۧ()F

    move-result v2

    float-to-int v2, v2

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    if-ne v2, v3, :cond_0

    .line 70
    iget v1, v0, Landroid/graphics/RectF;->right:F

    iget v2, v0, Landroid/graphics/RectF;->left:F

    sub-float/2addr v1, v2

    float-to-int v1, v1

    .line 71
    iget v2, v0, Landroid/graphics/RectF;->bottom:F

    iget v0, v0, Landroid/graphics/RectF;->top:F

    sub-float/2addr v2, v0

    float-to-int v2, v2

    :cond_0
    int-to-float v0, v1

    .line 73
    invoke-static {v0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v0

    int-to-float v1, v2

    .line 74
    invoke-static {v1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v1

    int-to-float v2, v0

    .line 75
    invoke-virtual {p1, v2}, Ll/ܽ֨ܺ;->ۧ(F)V

    int-to-float v2, v1

    .line 76
    invoke-virtual {p1, v2}, Ll/ܽ֨ܺ;->֫(F)V

    .line 78
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 79
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 80
    invoke-virtual {p1, v1}, Ll/ܽ֨ܺ;->֫(Landroid/graphics/Canvas;)V

    .line 81
    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {p1, v1, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 83
    new-instance v0, Lbin/mt/plugin/api/drawable/VectorParseException;

    invoke-direct {v0, p1}, Lbin/mt/plugin/api/drawable/VectorParseException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public fromVectorXml(Ljava/io/InputStream;)Landroid/graphics/drawable/Drawable;
    .locals 4

    .line 36
    invoke-virtual {p1}, Ljava/io/InputStream;->markSupported()Z

    move-result v0

    if-nez v0, :cond_0

    .line 37
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-direct {v0, p1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    move-object p1, v0

    :cond_0
    const v0, 0x7fffffff

    .line 40
    :try_start_0
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->mark(I)V

    .line 41
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    if-nez v0, :cond_1

    .line 42
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 43
    invoke-static {p1}, Ll/ܶۨۡ;->֫(Ljava/io/InputStream;)Ll/ܶۨۡ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶۨۡ;->᩻()Ll/ۤۨۡ;

    move-result-object p1

    new-instance v0, Ll/۫ܽܽ;

    invoke-direct {v0}, Ll/۫ܽܽ;-><init>()V

    invoke-static {p1, v0, v2}, Ll/ܶ᩹ۡ;->֫(Ll/ۤۨۡ;Ll/۫ܽܽ;Z)Ll/ܶ᩹ۡ;

    move-result-object p1

    return-object p1

    .line 45
    :cond_1
    invoke-virtual {p1}, Ljava/io/InputStream;->reset()V

    .line 47
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    .line 48
    new-instance v1, Ll/֫᩺ۡ;

    new-instance v3, Ll/۫ܽܽ;

    invoke-direct {v3}, Ll/۫ܽܽ;-><init>()V

    invoke-direct {v1, v3}, Ll/֫᩺ۡ;-><init>(Ll/۫ܽܽ;)V

    .line 49
    sget-object v3, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-virtual {v1, v3}, Ll/֫᩺ۡ;->֫(Ljava/util/Map;)V

    const/4 v3, 0x1

    .line 50
    invoke-virtual {v1, v3}, Ll/֫᩺ۡ;->֫(Z)V

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 51
    invoke-static {p1, v3}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/֫᩺ۡ;->֫(Ljava/lang/CharSequence;)V

    .line 52
    invoke-virtual {v1, v0}, Ll/֫᩺ۡ;->֫(Ll/ۤۜܽ;)V

    .line 53
    new-instance p1, Ljava/io/ByteArrayInputStream;

    invoke-virtual {v0}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v1

    invoke-virtual {v0}, Ll/ۤۜܽ;->size()I

    move-result v0

    invoke-direct {p1, v1, v2, v0}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    .line 54
    invoke-static {p1}, Ll/ܶۨۡ;->֫(Ljava/io/InputStream;)Ll/ܶۨۡ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܶۨۡ;->᩻()Ll/ۤۨۡ;

    move-result-object p1

    new-instance v0, Ll/۫ܽܽ;

    invoke-direct {v0}, Ll/۫ܽܽ;-><init>()V

    invoke-static {p1, v0, v2}, Ll/ܶ᩹ۡ;->֫(Ll/ۤۨۡ;Ll/۫ܽܽ;Z)Ll/ܶ᩹ۡ;

    move-result-object p1
    :try_end_0
    .catch Lbin/mt/plugin/api/drawable/VectorParseException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 58
    new-instance v0, Lbin/mt/plugin/api/drawable/VectorParseException;

    invoke-direct {v0, p1}, Lbin/mt/plugin/api/drawable/VectorParseException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    .line 56
    throw p1
.end method
