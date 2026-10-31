.class public final Ll/ܳۤܿ;
.super Ll/۟ܶۡ;
.source "964K"


# instance fields
.field public final synthetic ۜ:Ll/ܶ᩵ܿ;

.field public ܳ:Landroid/graphics/Bitmap;

.field public final synthetic ᩷:I

.field public final synthetic ᩻:Ll/᩵ۤܿ;


# direct methods
.method public constructor <init>(Ll/᩵ۤܿ;Ll/ܶ᩵ܿ;I)V
    .locals 0

    .line 331
    iput-object p1, p0, Ll/ܳۤܿ;->᩻:Ll/᩵ۤܿ;

    iput-object p2, p0, Ll/ܳۤܿ;->ۜ:Ll/ܶ᩵ܿ;

    iput p3, p0, Ll/ܳۤܿ;->᩷:I

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 353
    iget-object v0, p0, Ll/ܳۤܿ;->᩻:Ll/᩵ۤܿ;

    invoke-static {v0}, Ll/᩵ۤܿ;->᩷(Ll/᩵ۤܿ;)Ll/֡ۚۢ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֡ۚۢ;->dismiss()V

    .line 354
    invoke-static {v0}, Ll/᩵ۤܿ;->ܺ(Ll/᩵ۤܿ;)Ll/ܽۢܳ;

    move-result-object v0

    iget-object v1, p0, Ll/ܳۤܿ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0, v1}, Ll/ܽۢܳ;->֫(Ll/ܶ᩵ܿ;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 359
    iget-object v0, p0, Ll/ܳۤܿ;->᩻:Ll/᩵ۤܿ;

    invoke-static {v0}, Ll/᩵ۤܿ;->ܺ(Ll/᩵ۤܿ;)Ll/ܽۢܳ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    .line 360
    iget-object p1, p0, Ll/ܳۤܿ;->ۜ:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۬()Z

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 336
    iget-object v0, p0, Ll/ܳۤܿ;->᩻:Ll/᩵ۤܿ;

    invoke-static {v0}, Ll/᩵ۤܿ;->ܺ(Ll/᩵ۤܿ;)Ll/ܽۢܳ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    const v2, 0x7f12037b

    invoke-virtual {p0, v1, v2}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    .line 338
    invoke-static {v0}, Ll/᩵ۤܿ;->ܳ(Ll/᩵ۤܿ;)Ll/ۘܶۡ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۘܶۡ;->֫()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Ll/᩵ۤܿ;->֫(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Ll/ܳۤܿ;->ܳ:Landroid/graphics/Bitmap;

    return-void
.end method

.method public final ܿ()V
    .locals 4

    .line 343
    iget-object v0, p0, Ll/ܳۤܿ;->ۜ:Ll/ܶ᩵ܿ;

    const/4 v1, 0x0

    .line 446
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v0

    .line 344
    :try_start_0
    iget v1, p0, Ll/ܳۤܿ;->᩷:I

    const/4 v2, 0x1

    const/16 v3, 0x5a

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 346
    :cond_0
    iget-object v1, p0, Ll/ܳۤܿ;->ܳ:Landroid/graphics/Bitmap;

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->WEBP:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v1, v2, v3, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    goto :goto_0

    .line 345
    :cond_1
    iget-object v1, p0, Ll/ܳۤܿ;->ܳ:Landroid/graphics/Bitmap;

    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v1, v2, v3, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    if-eqz v0, :cond_2

    .line 348
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    :cond_2
    return-void

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_3

    .line 343
    :try_start_1
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    throw v1
.end method

.method public final ᩳ()V
    .locals 0

    .line 365
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    .line 366
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void
.end method
