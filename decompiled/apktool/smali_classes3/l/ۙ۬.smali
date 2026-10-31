.class public Ll/ۙ۬;
.super Ll/᩶᩺ۧ;
.source "X2Z7"


# static fields
.field public static final synthetic ۡ:I

.field public static final ܺ:Landroid/graphics/PorterDuff$Mode;


# instance fields
.field public ֫:[B

.field public ۜ:Landroid/graphics/PorterDuff$Mode;

.field public ۢ:I

.field public ۧ:I

.field public ܳ:Ljava/lang/String;

.field public ܽ:I

.field public ܿ:Landroid/os/Parcelable;

.field public ᩳ:Ljava/lang/Object;

.field public ᩷:Ljava/lang/String;

.field public ᩻:Landroid/content/res/ColorStateList;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 206
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    sput-object v0, Ll/ۙ۬;->ܺ:Landroid/graphics/PorterDuff$Mode;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 365
    invoke-direct {p0}, Ll/᩶᩺ۧ;-><init>()V

    const/4 v0, -0x1

    .line 155
    iput v0, p0, Ll/ۙ۬;->ۢ:I

    const/4 v0, 0x0

    .line 173
    iput-object v0, p0, Ll/ۙ۬;->֫:[B

    .line 179
    iput-object v0, p0, Ll/ۙ۬;->ܿ:Landroid/os/Parcelable;

    const/4 v1, 0x0

    .line 188
    iput v1, p0, Ll/ۙ۬;->ۧ:I

    .line 195
    iput v1, p0, Ll/ۙ۬;->ܽ:I

    .line 201
    iput-object v0, p0, Ll/ۙ۬;->᩻:Landroid/content/res/ColorStateList;

    .line 207
    sget-object v1, Ll/ۙ۬;->ܺ:Landroid/graphics/PorterDuff$Mode;

    iput-object v1, p0, Ll/ۙ۬;->ۜ:Landroid/graphics/PorterDuff$Mode;

    .line 211
    iput-object v0, p0, Ll/ۙ۬;->᩷:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 368
    invoke-direct {p0}, Ll/᩶᩺ۧ;-><init>()V

    const/4 v0, 0x0

    .line 173
    iput-object v0, p0, Ll/ۙ۬;->֫:[B

    .line 179
    iput-object v0, p0, Ll/ۙ۬;->ܿ:Landroid/os/Parcelable;

    const/4 v1, 0x0

    .line 188
    iput v1, p0, Ll/ۙ۬;->ۧ:I

    .line 195
    iput v1, p0, Ll/ۙ۬;->ܽ:I

    .line 201
    iput-object v0, p0, Ll/ۙ۬;->᩻:Landroid/content/res/ColorStateList;

    .line 207
    sget-object v1, Ll/ۙ۬;->ܺ:Landroid/graphics/PorterDuff$Mode;

    iput-object v1, p0, Ll/ۙ۬;->ۜ:Landroid/graphics/PorterDuff$Mode;

    .line 211
    iput-object v0, p0, Ll/ۙ۬;->᩷:Ljava/lang/String;

    .line 369
    iput p1, p0, Ll/ۙ۬;->ۢ:I

    return-void
.end method

.method public static ֫(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;
    .locals 9

    .line 1007
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 1008
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 1007
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3f2aaaab

    mul-float v0, v0, v1

    float-to-int v0, v0

    .line 1010
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 1011
    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 1012
    new-instance v3, Landroid/graphics/Paint;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(I)V

    int-to-float v4, v0

    const/high16 v5, 0x3f000000    # 0.5f

    mul-float v5, v5, v4

    const v6, 0x3f6aaaab

    mul-float v6, v6, v5

    if-eqz p1, :cond_0

    const p1, 0x3c2aaaab

    mul-float p1, p1, v4

    const/4 v7, 0x0

    .line 1020
    invoke-virtual {v3, v7}, Landroid/graphics/Paint;->setColor(I)V

    const v7, 0x3caaaaab

    mul-float v4, v4, v7

    const/high16 v7, 0x3d000000    # 0.03125f

    const/4 v8, 0x0

    .line 1021
    invoke-virtual {v3, p1, v8, v4, v7}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 1022
    invoke-virtual {v2, v5, v5, v6, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    const/high16 v4, 0x1e000000

    .line 1025
    invoke-virtual {v3, p1, v8, v8, v4}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 1026
    invoke-virtual {v2, v5, v5, v6, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 1027
    invoke-virtual {v3}, Landroid/graphics/Paint;->clearShadowLayer()V

    :cond_0
    const/high16 p1, -0x1000000

    .line 1031
    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 1032
    new-instance p1, Landroid/graphics/BitmapShader;

    sget-object v4, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {p1, p0, v4, v4}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 1034
    new-instance v4, Landroid/graphics/Matrix;

    invoke-direct {v4}, Landroid/graphics/Matrix;-><init>()V

    .line 1035
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    sub-int/2addr v7, v0

    neg-int v7, v7

    int-to-float v7, v7

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    .line 1036
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p0

    sub-int/2addr p0, v0

    neg-int p0, p0

    int-to-float p0, p0

    div-float/2addr p0, v8

    .line 1035
    invoke-virtual {v4, v7, p0}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 1037
    invoke-virtual {p1, v4}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 1038
    invoke-virtual {v3, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 1039
    invoke-virtual {v2, v5, v5, v6, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    const/4 p0, 0x0

    .line 1041
    invoke-virtual {v2, p0}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    return-object v1
.end method

.method public static ֫(Landroid/content/res/Resources;Ljava/lang/String;I)Ll/ۙ۬;
    .locals 2

    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p2, :cond_1

    .line 246
    new-instance v0, Ll/ۙ۬;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ll/ۙ۬;-><init>(I)V

    .line 247
    iput p2, v0, Ll/ۙ۬;->ۧ:I

    if-eqz p0, :cond_0

    .line 250
    :try_start_0
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 252
    :catch_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Icon resource cannot be found"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 255
    :cond_0
    iput-object p1, v0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    .line 257
    :goto_0
    iput-object p1, v0, Ll/ۙ۬;->ܳ:Ljava/lang/String;

    return-object v0

    .line 244
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Drawable resource ID must not be 0"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Landroid/graphics/Bitmap;)Ll/ۙ۬;
    .locals 2

    .line 283
    new-instance v0, Ll/ۙ۬;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ll/ۙ۬;-><init>(I)V

    .line 284
    iput-object p0, v0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    return-object v0
.end method

.method public static ֫(Landroid/graphics/drawable/Icon;)Ll/ۙ۬;
    .locals 2

    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1190
    invoke-static {p0}, Ll/ܶ۬;->ܽ(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    .line 1198
    new-instance v0, Ll/ۙ۬;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Ll/ۙ۬;-><init>(I)V

    .line 1199
    iput-object p0, v0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    return-object v0

    .line 1196
    :cond_0
    invoke-static {p0}, Ll/ܶ۬;->ᩳ(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object p0

    .line 122
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    .line 122
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    new-instance v0, Ll/ۙ۬;

    invoke-direct {v0, v1}, Ll/ۙ۬;-><init>(I)V

    .line 344
    iput-object p0, v0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    return-object v0

    .line 1194
    :cond_1
    invoke-static {p0}, Ll/ܶ۬;->ᩳ(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object p0

    .line 122
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    .line 122
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    new-instance v0, Ll/ۙ۬;

    invoke-direct {v0, v1}, Ll/ۙ۬;-><init>(I)V

    .line 317
    iput-object p0, v0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    return-object v0

    .line 1192
    :cond_2
    invoke-static {p0}, Ll/ܶ۬;->ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Ll/ܶ۬;->֫(Ljava/lang/Object;)I

    move-result p0

    const/4 v1, 0x0

    invoke-static {v1, v0, p0}, Ll/ۙ۬;->֫(Landroid/content/res/Resources;Ljava/lang/String;I)Ll/ۙ۬;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Landroid/graphics/Bitmap;)Ll/ۙ۬;
    .locals 2

    .line 122
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    new-instance v0, Ll/ۙ۬;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll/ۙ۬;-><init>(I)V

    .line 270
    iput-object p0, v0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 4

    .line 794
    iget v0, p0, Ll/ۙ۬;->ۢ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 795
    iget-object v0, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 797
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Icon(typ="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ۙ۬;->ۢ:I

    packed-switch v1, :pswitch_data_0

    const-string v1, "UNKNOWN"

    goto :goto_0

    :pswitch_0
    const-string v1, "URI_MASKABLE"

    goto :goto_0

    :pswitch_1
    const-string v1, "BITMAP_MASKABLE"

    goto :goto_0

    :pswitch_2
    const-string v1, "URI"

    goto :goto_0

    :pswitch_3
    const-string v1, "DATA"

    goto :goto_0

    :pswitch_4
    const-string v1, "RESOURCE"

    goto :goto_0

    :pswitch_5
    const-string v1, "BITMAP"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 798
    iget v1, p0, Ll/ۙ۬;->ۢ:I

    packed-switch v1, :pswitch_data_1

    goto :goto_1

    :pswitch_6
    const-string v1, " uri="

    .line 820
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_7
    const-string v1, " len="

    .line 813
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۙ۬;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 814
    iget v1, p0, Ll/ۙ۬;->ܽ:I

    if-eqz v1, :cond_1

    const-string v1, " off="

    .line 815
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۙ۬;->ܽ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_8
    const-string v1, " pkg="

    .line 807
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۙ۬;->ܳ:Ljava/lang/String;

    .line 808
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " id="

    .line 809
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 810
    invoke-virtual {p0}, Ll/ۙ۬;->ۧ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const-string v1, "0x%08x"

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_9
    const-string v1, " size="

    .line 801
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Bitmap;

    .line 802
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "x"

    .line 803
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Bitmap;

    .line 804
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 823
    :cond_1
    :goto_1
    iget-object v1, p0, Ll/ۙ۬;->᩻:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_2

    const-string v1, " tint="

    .line 824
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 825
    iget-object v1, p0, Ll/ۙ۬;->᩻:Landroid/content/res/ColorStateList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 827
    :cond_2
    iget-object v1, p0, Ll/ۙ۬;->ۜ:Landroid/graphics/PorterDuff$Mode;

    sget-object v2, Ll/ۙ۬;->ܺ:Landroid/graphics/PorterDuff$Mode;

    if-eq v1, v2, :cond_3

    const-string v1, " mode="

    .line 828
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/ۙ۬;->ۜ:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :cond_3
    const-string v1, ")"

    .line 830
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 831
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_9
        :pswitch_6
    .end packed-switch
.end method

.method public final ֫()Landroid/graphics/Bitmap;
    .locals 3

    .line 442
    iget v0, p0, Ll/ۙ۬;->ۢ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-lt v1, v2, :cond_1

    .line 443
    iget-object v0, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    instance-of v1, v0, Landroid/graphics/Bitmap;

    if-eqz v1, :cond_0

    .line 444
    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :cond_1
    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 449
    iget-object v0, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0

    :cond_2
    const/4 v2, 0x5

    if-ne v0, v2, :cond_3

    .line 451
    iget-object v0, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-static {v0, v1}, Ll/ۙ۬;->֫(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    .line 453
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "called getBitmap() on "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Landroid/content/Context;)Ljava/io/InputStream;
    .locals 3

    .line 652
    invoke-virtual {p0}, Ll/ۙ۬;->ܿ()Landroid/net/Uri;

    move-result-object v0

    .line 653
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    const-string v2, "content"

    .line 654
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "file"

    .line 655
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 663
    :cond_0
    :try_start_0
    new-instance p1, Ljava/io/FileInputStream;

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 665
    :catch_0
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    goto :goto_1

    .line 657
    :cond_1
    :goto_0
    :try_start_1
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    .line 659
    :catch_1
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Landroid/content/Intent;Landroid/graphics/drawable/Drawable;Landroid/content/Context;)V
    .locals 8

    .line 540
    iget v0, p0, Ll/ۙ۬;->ۢ:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    if-eqz v0, :cond_4

    .line 541
    check-cast v0, Ljava/lang/String;

    const-string v1, ":"

    .line 542
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, -0x1

    .line 546
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aget-object v3, v3, v4

    const-string v5, "/"

    .line 547
    invoke-virtual {v3, v5, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    aget-object v6, v6, v7

    .line 548
    invoke-virtual {v3, v5, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v3

    aget-object v3, v3, v4

    .line 549
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v7

    const-string v1, "0_resource_name_obfuscated"

    .line 550
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 556
    :cond_1
    invoke-virtual {p0}, Ll/ۙ۬;->ܽ()Ljava/lang/String;

    move-result-object v1

    const-string v2, "android"

    .line 673
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 674
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v1

    goto :goto_0

    .line 676
    :cond_2
    invoke-virtual {p3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/16 v4, 0x2000

    const/4 v5, 0x0

    .line 678
    :try_start_0
    invoke-virtual {v2, v1, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 681
    invoke-virtual {v2, v4}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Landroid/content/pm/ApplicationInfo;)Landroid/content/res/Resources;

    move-result-object v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 686
    :catch_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Unable to find pkg="

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " for icon"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    move-object v1, v5

    .line 558
    :goto_0
    invoke-virtual {v1, v3, v6, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    .line 559
    iget v1, p0, Ll/ۙ۬;->ۧ:I

    if-eq v1, v0, :cond_4

    .line 561
    iput v0, p0, Ll/ۙ۬;->ۧ:I

    .line 702
    :cond_4
    :goto_1
    iget v0, p0, Ll/ۙ۬;->ۢ:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_a

    const/4 v2, 0x2

    if-eq v0, v2, :cond_6

    const/4 p3, 0x5

    if-ne v0, p3, :cond_5

    .line 711
    iget-object p3, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    check-cast p3, Landroid/graphics/Bitmap;

    invoke-static {p3, v1}, Ll/ۙ۬;->֫(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;

    move-result-object p3

    goto/16 :goto_4

    .line 739
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Icon type not supported for intent shortcuts"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 715
    :cond_6
    :try_start_1
    invoke-virtual {p0}, Ll/ۙ۬;->ܽ()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p3, v0, v1}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object p3

    if-nez p2, :cond_7

    const-string p2, "android.intent.extra.shortcut.ICON_RESOURCE"

    .line 717
    iget v0, p0, Ll/ۙ۬;->ۧ:I

    .line 718
    invoke-static {p3, v0}, Landroid/content/Intent$ShortcutIconResource;->fromContext(Landroid/content/Context;I)Landroid/content/Intent$ShortcutIconResource;

    move-result-object p3

    .line 717
    invoke-virtual {p1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-void

    .line 721
    :cond_7
    iget v0, p0, Ll/ۙ۬;->ۧ:I

    invoke-static {p3, v0}, Ll/֨ۙ;->ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 722
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    if-lez v2, :cond_9

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    if-gtz v2, :cond_8

    goto :goto_2

    .line 727
    :cond_8
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result p3

    .line 728
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 727
    invoke-static {p3, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p3

    goto :goto_3

    :cond_9
    :goto_2
    const-string v2, "activity"

    .line 723
    invoke-virtual {p3, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/app/ActivityManager;

    .line 724
    invoke-virtual {p3}, Landroid/app/ActivityManager;->getLauncherLargeIconSize()I

    move-result p3

    .line 725
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p3, p3, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p3

    .line 731
    :goto_3
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    invoke-virtual {v0, v1, v1, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 732
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, p3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :catch_1
    move-exception p1

    .line 735
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Can\'t find package "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    .line 704
    :cond_a
    iget-object p3, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    check-cast p3, Landroid/graphics/Bitmap;

    if-eqz p2, :cond_b

    .line 707
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    invoke-virtual {p3, v0, v1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object p3

    :cond_b
    :goto_4
    if-eqz p2, :cond_c

    .line 743
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    .line 744
    invoke-virtual {p3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    .line 745
    div-int/lit8 v2, v0, 0x2

    div-int/lit8 v3, v1, 0x2

    invoke-virtual {p2, v2, v3, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 746
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, p3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {p2, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_c
    const-string p2, "android.intent.extra.shortcut.ICON"

    .line 748
    invoke-virtual {p1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-void
.end method

.method public final ۧ()I
    .locals 3

    .line 422
    iget v0, p0, Ll/ۙ۬;->ۢ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-lt v1, v2, :cond_0

    .line 423
    iget-object v0, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    invoke-static {v0}, Ll/ܶ۬;->֫(Ljava/lang/Object;)I

    move-result v0

    return v0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 428
    iget v0, p0, Ll/ۙ۬;->ۧ:I

    return v0

    .line 426
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "called getResId() on "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(Landroid/content/Context;)Landroid/graphics/drawable/Icon;
    .locals 2

    .line 528
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 529
    invoke-static {p0, p1}, Ll/ܶ۬;->֫(Ll/ۙ۬;Landroid/content/Context;)Landroid/graphics/drawable/Icon;

    move-result-object p1

    return-object p1

    .line 531
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "This method is only supported on API level 23+"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 4

    .line 395
    iget v0, p0, Ll/ۙ۬;->ۢ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v2, v3, :cond_0

    .line 396
    iget-object v0, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    invoke-static {v0}, Ll/ܶ۬;->ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v2, 0x2

    if-ne v0, v2, :cond_3

    .line 404
    iget-object v0, p0, Ll/ۙ۬;->ܳ:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 409
    :cond_1
    iget-object v0, p0, Ll/ۙ۬;->ܳ:Ljava/lang/String;

    return-object v0

    .line 405
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v2, ":"

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0

    .line 399
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "called getResPackage() on "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 3

    .line 466
    iget v0, p0, Ll/ۙ۬;->ۢ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-lt v1, v2, :cond_0

    .line 467
    iget-object v0, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    invoke-static {v0}, Ll/ܶ۬;->ᩳ(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 470
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "called getUri() on "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 472
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()I
    .locals 3

    .line 380
    iget v0, p0, Ll/ۙ۬;->ۢ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-lt v1, v2, :cond_0

    .line 381
    iget-object v0, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    invoke-static {v0}, Ll/ܶ۬;->ܽ(Ljava/lang/Object;)I

    move-result v0

    :cond_0
    return v0
.end method
