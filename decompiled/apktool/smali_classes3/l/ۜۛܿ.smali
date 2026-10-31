.class public final Ll/ۜۛܿ;
.super Ll/۟ܶۡ;
.source "Q7Z8"


# instance fields
.field public final synthetic ۜ:I

.field public final synthetic ܳ:Ll/᩷ۛܿ;

.field public final synthetic ᩻:I


# direct methods
.method public constructor <init>(Ll/᩷ۛܿ;II)V
    .locals 0

    .line 258
    iput-object p1, p0, Ll/ۜۛܿ;->ܳ:Ll/᩷ۛܿ;

    iput p2, p0, Ll/ۜۛܿ;->ۜ:I

    iput p3, p0, Ll/ۜۛܿ;->᩻:I

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 281
    iget-object v0, p0, Ll/ۜۛܿ;->ܳ:Ll/᩷ۛܿ;

    iget-object v0, v0, Ll/᩷ۛܿ;->᩻:Ll/ۢۛܿ;

    iget-object v1, v0, Ll/ۢۛܿ;->᩷:Ll/ܽۢܳ;

    iget-object v0, v0, Ll/ۢۛܿ;->ܳ:Ll/ܶ᩵ܿ;

    invoke-virtual {v1, v0}, Ll/ܽۢܳ;->֫(Ll/ܶ᩵ܿ;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 286
    iget-object v0, p0, Ll/ۜۛܿ;->ܳ:Ll/᩷ۛܿ;

    iget-object v0, v0, Ll/᩷ۛܿ;->᩻:Ll/ۢۛܿ;

    iget-object v0, v0, Ll/ۢۛܿ;->᩷:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 262
    iget-object v0, p0, Ll/ۜۛܿ;->ܳ:Ll/᩷ۛܿ;

    iget-object v0, v0, Ll/᩷ۛܿ;->᩻:Ll/ۢۛܿ;

    iget-object v0, v0, Ll/ۢۛܿ;->᩷:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const v1, 0x7f120b85

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 7

    .line 267
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iget v1, p0, Ll/ۜۛܿ;->ۜ:I

    iget v2, p0, Ll/ۜۛܿ;->᩻:I

    invoke-static {v1, v2, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 268
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 269
    new-instance v4, Landroid/graphics/PaintFlagsDrawFilter;

    const/4 v5, 0x4

    const/16 v6, 0x83

    invoke-direct {v4, v5, v6}, Landroid/graphics/PaintFlagsDrawFilter;-><init>(II)V

    invoke-virtual {v3, v4}, Landroid/graphics/Canvas;->setDrawFilter(Landroid/graphics/DrawFilter;)V

    int-to-float v1, v1

    .line 272
    iget-object v4, p0, Ll/ۜۛܿ;->ܳ:Ll/᩷ۛܿ;

    iget v5, v4, Ll/᩷ۛܿ;->᩷:I

    int-to-float v5, v5

    div-float/2addr v1, v5

    int-to-float v2, v2

    iget v5, v4, Ll/᩷ۛܿ;->ۜ:I

    int-to-float v5, v5

    div-float/2addr v2, v5

    invoke-virtual {v3, v1, v2}, Landroid/graphics/Canvas;->scale(FF)V

    .line 273
    iget-object v1, v4, Ll/᩷ۛܿ;->᩻:Ll/ۢۛܿ;

    iget-object v2, v1, Ll/ۢۛܿ;->᩻:Ll/ܽ֨ܺ;

    invoke-virtual {v2, v3}, Ll/ܽ֨ܺ;->֫(Landroid/graphics/Canvas;)V

    .line 274
    iget-object v1, v1, Ll/ۢۛܿ;->ܳ:Ll/ܶ᩵ܿ;

    const/4 v2, 0x0

    .line 446
    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v1

    .line 275
    :try_start_0
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x64

    invoke-virtual {v0, v2, v3, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 276
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    if-eqz v1, :cond_1

    .line 274
    :try_start_1
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw v0
.end method

.method public final ᩳ()V
    .locals 0

    .line 291
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    .line 292
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method
