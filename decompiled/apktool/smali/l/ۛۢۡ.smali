.class public final Ll/ۛۢۡ;
.super Ljava/lang/Object;
.source "M5T2"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static ֫֫:J

.field public static ۗ:Ll/۫ۢۡ;

.field public static ۙ:Ll/۫ۢۡ;

.field public static ۛ:Landroid/graphics/Paint;

.field private static final ۜᩳ۟:[S

.field public static ۟:I

.field public static ۤ:Ll/۫ۢۡ;

.field public static ۨ:Ll/֨᩵;

.field public static ۫:Ll/۫ۢۡ;

.field public static ۬:Ll/۫ۢۡ;

.field public static ܰ:I

.field public static ᩶:Landroid/graphics/Paint;

.field public static ᩸:Landroid/graphics/Paint;

.field public static ᩹:Landroid/graphics/ColorMatrixColorFilter;

.field public static ᩺:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x44

    invoke-static {v0}, Ll/۫ܺ᩷;->ۜۤܳ(I)V

    const/16 v0, 0x14

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۛۢۡ;->ۜᩳ۟:[S

    .line 70
    new-instance v0, Ll/ۛۢۡ;

    .line 48
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 70
    invoke-virtual {v0}, Ll/ۛۢۡ;->run()V

    return-void

    nop

    :array_0
    .array-data 2
        0x232ds
        -0x6ea1s
        -0x6e84s
        -0x6e84s
        -0x6e9ds
        -0x6e8as
        -0x6e9fs
        -0x6e8es
        -0x6e8cs
        -0x6e9fs
        -0x6e8as
        -0x6e8as
        -0x6e82s
        -0x6e8as
        -0x6e83s
        -0x6e99s
        -0x6ec3s
        -0x6e99s
        -0x6e95s
        -0x6e99s
    .end array-data
.end method

.method public static ֫(I)Landroid/graphics/Bitmap;
    .locals 2

    .line 182
    sget-object v0, Ll/ۛۢۡ;->ۙ:Ll/۫ۢۡ;

    sget-object v1, Ll/᩶ۖܳ;->֫ۧ:Ll/᩸ۖܳ;

    invoke-static {v0, v1, p0}, Ll/ۛۢۡ;->֫(Ll/۫ۢۡ;Ll/᩸ۖܳ;I)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(IIZ)Landroid/graphics/Bitmap;
    .locals 10

    if-eqz p2, :cond_0

    .line 190
    sget-object p2, Ll/ۛۢۡ;->۫:Ll/۫ۢۡ;

    goto :goto_0

    :cond_0
    sget-object p2, Ll/ۛۢۡ;->ۤ:Ll/۫ۢۡ;

    .line 191
    :goto_0
    iget-object v0, p2, Ll/۫ۢۡ;->ܳ:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    .line 193
    sget-boolean v0, Ll/᩹֡᩷;->۟:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 195
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Ll/ۛۢۡ;->ۛ:Landroid/graphics/Paint;

    goto :goto_1

    :cond_2
    sget-object v0, Ll/ۛۢۡ;->᩸:Landroid/graphics/Paint;

    :goto_1
    move-object v8, v0

    .line 196
    invoke-virtual {v8, p0}, Landroid/graphics/Paint;->setColor(I)V

    .line 197
    iget v0, p2, Ll/۫ۢۡ;->ܽ:I

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 198
    new-instance v9, Landroid/graphics/Canvas;

    invoke-direct {v9, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 200
    iget-boolean v1, p2, Ll/۫ۢۡ;->֫:Z

    if-eqz v1, :cond_3

    .line 201
    iget v1, p2, Ll/۫ۢۡ;->ܽ:I

    div-int/lit8 v1, v1, 0x2

    .line 202
    iget v2, p2, Ll/۫ۢۡ;->ᩳ:I

    sub-int v2, v1, v2

    int-to-float v1, v1

    int-to-float v2, v2

    .line 203
    invoke-virtual {v9, v1, v1, v2, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_2

    .line 205
    :cond_3
    iget v1, p2, Ll/۫ۢۡ;->ᩳ:I

    .line 206
    iget v2, p2, Ll/۫ۢۡ;->ܽ:I

    sub-int/2addr v2, v1

    .line 207
    iget v3, p2, Ll/۫ۢۡ;->ܿ:I

    int-to-float v4, v1

    int-to-float v5, v2

    int-to-float v7, v3

    move-object v1, v9

    move v2, v4

    move v3, v4

    move v4, v5

    move v6, v7

    .line 208
    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 211
    :goto_2
    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 212
    iget v1, p2, Ll/۫ۢۡ;->ܽ:I

    iget v2, p2, Ll/۫ۢۡ;->᩻:I

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v2, v1

    .line 214
    invoke-static {p0}, Ll/۟۫ۡ;->֫(I)I

    move-result p0

    const/16 v3, 0xdc

    if-le p0, v3, :cond_4

    const p0, -0xc4c4c5

    .line 215
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    goto :goto_3

    :cond_4
    const/4 p0, -0x1

    .line 217
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 219
    :goto_3
    invoke-virtual {p1, v1, v1, v2, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 220
    iget-boolean p0, p2, Ll/۫ۢۡ;->ۧ:Z

    if-nez p0, :cond_5

    invoke-static {}, Ll/᩹֡᩷;->ۧ()Z

    move-result p0

    if-eqz p0, :cond_5

    const/16 p0, 0xc8

    goto :goto_4

    :cond_5
    const/16 p0, 0xff

    :goto_4
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 221
    invoke-virtual {p1, v9}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-object v0
.end method

.method public static ֫(Ll/۫ۢۡ;Ll/᩸ۖܳ;I)Landroid/graphics/Bitmap;
    .locals 10

    .line 226
    invoke-virtual {p1}, Ll/᩸ۖܳ;->֫()I

    move-result v0

    invoke-virtual {p1}, Ll/᩸ۖܳ;->ۧ()I

    move-result p1

    .line 230
    iget-object v1, p0, Ll/۫ۢۡ;->ܳ:Ljava/lang/Boolean;

    if-nez v1, :cond_0

    .line 232
    sget-boolean v1, Ll/᩹֡᩷;->۟:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 234
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Ll/ۛۢۡ;->ۛ:Landroid/graphics/Paint;

    goto :goto_0

    :cond_1
    sget-object v1, Ll/ۛۢۡ;->᩸:Landroid/graphics/Paint;

    :goto_0
    move-object v9, v1

    .line 235
    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 236
    iget v0, p0, Ll/۫ۢۡ;->ܽ:I

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 237
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 239
    iget-boolean v2, p0, Ll/۫ۢۡ;->֫:Z

    if-eqz v2, :cond_2

    .line 240
    iget v2, p0, Ll/۫ۢۡ;->ܽ:I

    div-int/lit8 v2, v2, 0x2

    .line 241
    iget v3, p0, Ll/۫ۢۡ;->ᩳ:I

    sub-int v3, v2, v3

    int-to-float v2, v2

    int-to-float v3, v3

    .line 242
    invoke-virtual {v1, v2, v2, v3, v9}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto :goto_1

    .line 244
    :cond_2
    iget v2, p0, Ll/۫ۢۡ;->ᩳ:I

    .line 245
    iget v3, p0, Ll/۫ۢۡ;->ܽ:I

    sub-int/2addr v3, v2

    .line 246
    iget v4, p0, Ll/۫ۢۡ;->ܿ:I

    int-to-float v5, v2

    int-to-float v6, v3

    int-to-float v8, v4

    move-object v2, v1

    move v3, v5

    move v4, v5

    move v5, v6

    move v7, v8

    .line 247
    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 250
    :goto_1
    invoke-static {p2}, Ll/ۙ᩸᩷;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    .line 251
    iget v2, p0, Ll/۫ۢۡ;->ܽ:I

    iget p0, p0, Ll/۫ۢۡ;->᩻:I

    sub-int/2addr v2, p0

    div-int/lit8 v2, v2, 0x2

    add-int/2addr p0, v2

    .line 253
    invoke-virtual {p2, v2, v2, p0, p0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 254
    invoke-virtual {p2, p1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 255
    invoke-virtual {p2, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-object v0
.end method

.method public static ֫(Ll/᩸ۖܳ;I)Landroid/graphics/Bitmap;
    .locals 1

    .line 178
    sget-object v0, Ll/ۛۢۡ;->ۗ:Ll/۫ۢۡ;

    invoke-static {v0, p0, p1}, Ll/ۛۢۡ;->֫(Ll/۫ۢۡ;Ll/᩸ۖܳ;I)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ֫()Landroid/graphics/Paint;
    .locals 1

    .line 0
    sget-object v0, Ll/ۛۢۡ;->᩶:Landroid/graphics/Paint;

    return-object v0
.end method

.method public static ֫(Landroid/content/pm/PackageInfo;)Landroid/graphics/drawable/BitmapDrawable;
    .locals 4

    .line 425
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-static {v1}, Ll/ܳۤۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/16 v3, 0x18

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 426
    invoke-static {v0}, Ll/۬۫ۡ;->֫(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 428
    new-instance p0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v0

    invoke-direct {p0, v0, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    return-object p0

    .line 430
    :cond_0
    iget-object v1, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v1, :cond_1

    .line 431
    iget-object v2, p0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iget v1, v1, Landroid/content/pm/ApplicationInfo;->icon:I

    invoke-static {v1, v2}, Ll/ۘ۠ۡ;->ۧ(ILjava/lang/String;)V

    .line 436
    :cond_1
    :try_start_0
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/content/pm/PackageItemInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-static {p0}, Ll/ۛۢۡ;->֫(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const p0, 0x7f0802b2

    .line 438
    invoke-static {p0}, Ll/ۙ᩸᩷;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    invoke-static {p0}, Ll/ۛۢۡ;->֫(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object p0

    .line 440
    :goto_0
    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    .line 441
    invoke-static {v0, v1}, Ll/۬۫ۡ;->֫(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-object p0
.end method

.method public static ֫(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/BitmapDrawable;
    .locals 6

    const/high16 v0, 0x42480000    # 50.0f

    .line 420
    invoke-static {v0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v0

    .line 421
    new-instance v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v2

    .line 411
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 412
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->copyBounds()Landroid/graphics/Rect;

    move-result-object v4

    const/4 v5, 0x0

    .line 413
    invoke-virtual {p0, v5, v5, v0, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 414
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 415
    invoke-virtual {p0, v4}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 421
    invoke-direct {v1, v2, v3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    return-object v1
.end method

.method public static ֫([Ljava/io/File;)Ljava/io/File;
    .locals 6

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 402
    :cond_0
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p0, v2

    .line 403
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    const-string v5, ".apk"

    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ll/֫ۛ;
    .locals 3

    .line 286
    sget-object v0, Ll/ۛۢۡ;->ۨ:Ll/֨᩵;

    invoke-virtual {v0, p0}, Ll/֨᩵;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ۛ;

    if-eqz v0, :cond_0

    return-object v0

    .line 290
    :cond_0
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x1

    .line 291
    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 292
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v2, :cond_1

    .line 293
    iget v2, v2, Landroid/content/pm/ApplicationInfo;->icon:I

    invoke-static {v2, p0}, Ll/ۘ۠ۡ;->ۧ(ILjava/lang/String;)V

    .line 296
    :cond_1
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v1, v0}, Landroid/content/pm/PackageItemInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 297
    new-instance v1, Ll/ۤۢۡ;

    sget-object v2, Ll/᩶ۖܳ;->֨:Ll/᩶ۖܳ;

    invoke-direct {v1, v2, v0}, Ll/ۤۢۡ;-><init>(Ll/᩶ۖܳ;Landroid/graphics/drawable/Drawable;)V

    .line 298
    sget-object v0, Ll/ۛۢۡ;->ۨ:Ll/֨᩵;

    invoke-virtual {v0, p0, v1}, Ll/֨᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ۨܺ᩷;Ljava/lang/String;)Ll/֫ۛ;
    .locals 3

    .line 306
    sget-object v0, Ll/ۛۢۡ;->ۨ:Ll/֨᩵;

    const-string v1, "apks:"

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll/֨᩵;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ۛ;

    if-eqz v0, :cond_0

    return-object v0

    .line 310
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ll/ۨܺ᩷;->ۧ()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    .line 311
    new-instance v0, Ll/ۤۢۡ;

    sget-object v2, Ll/᩶ۖܳ;->᩷:Ll/᩶ۖܳ;

    invoke-direct {v0, v2, p0}, Ll/ۤۢۡ;-><init>(Ll/᩶ۖܳ;Landroid/graphics/drawable/Drawable;)V

    .line 312
    sget-object p0, Ll/ۛۢۡ;->ۨ:Ll/֨᩵;

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Ll/֨᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic ۧ()I
    .locals 1

    .line 0
    sget v0, Ll/ۛۢۡ;->ܰ:I

    return v0
.end method

.method public static ۧ(Ll/᩸ۖܳ;I)Landroid/graphics/Bitmap;
    .locals 1

    .line 186
    sget-object v0, Ll/ۛۢۡ;->۬:Ll/۫ۢۡ;

    invoke-static {v0, p0, p1}, Ll/ۛۢۡ;->֫(Ll/۫ۢۡ;Ll/᩸ۖܳ;I)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)Ll/֫ۛ;
    .locals 9

    .line 323
    sget-object v0, Ll/ۛۢۡ;->ۨ:Ll/֨᩵;

    invoke-virtual {v0, p0}, Ll/֨᩵;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֫ۛ;

    if-eqz v0, :cond_0

    return-object v0

    .line 329
    :cond_0
    new-instance v0, Ljava/io/File;

    const-string v1, "base.apk"

    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v3

    :goto_0
    if-nez v0, :cond_8

    .line 333
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    const/4 v4, 0x0

    if-eqz v2, :cond_5

    .line 335
    invoke-static {v2}, Ll/ۛۢۡ;->֫([Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_3

    .line 337
    array-length v5, v2

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_3

    aget-object v7, v2, v6

    .line 338
    invoke-virtual {v7}, Ljava/io/File;->isDirectory()Z

    move-result v8

    if-eqz v8, :cond_2

    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v7, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_2

    move-object v0, v8

    goto :goto_2

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    if-nez v0, :cond_8

    .line 345
    array-length v1, v2

    :goto_3
    if-ge v4, v1, :cond_8

    aget-object v5, v2, v4

    .line 346
    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 347
    invoke-virtual {v5}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Ll/ۛۢۡ;->֫([Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_4

    goto :goto_4

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 354
    :cond_5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x22

    if-lt v1, v2, :cond_8

    .line 355
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    sget-wide v5, Ll/ۛۢۡ;->֫֫:J

    sub-long/2addr v1, v5

    const-wide/16 v5, 0x2710

    cmp-long v7, v1, v5

    if-lez v7, :cond_6

    .line 356
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 357
    invoke-virtual {v1, v4}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    new-instance v2, Ll/ۙۢۡ;

    const/4 v4, 0x0

    invoke-direct {v2, v4}, Ll/ۙۢۡ;-><init>(I)V

    .line 358
    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    new-instance v2, Ll/ۗۢۡ;

    invoke-direct {v2, v4}, Ll/ۗۢۡ;-><init>(I)V

    .line 360
    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    .line 361
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    sput-object v1, Ll/ۛۢۡ;->᩺:Ljava/util/List;

    .line 362
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    sput-wide v1, Ll/ۛۢۡ;->֫֫:J

    .line 364
    :cond_6
    sget-object v1, Ll/ۛۢۡ;->᩺:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 365
    invoke-virtual {v2, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 366
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 367
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_7

    move-object v0, v4

    :cond_8
    :goto_4
    if-nez v0, :cond_9

    goto :goto_5

    .line 379
    :cond_9
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 380
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x1

    invoke-virtual {v1, v2, v4}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    if-nez v2, :cond_a

    goto :goto_5

    .line 384
    :cond_a
    iget-object v2, v2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 386
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v2, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 387
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 388
    iget-object v0, v2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    iget v4, v2, Landroid/content/pm/ApplicationInfo;->icon:I

    invoke-static {v4, v0}, Ll/ۘ۠ۡ;->ۧ(ILjava/lang/String;)V

    .line 389
    invoke-virtual {v2, v1}, Landroid/content/pm/PackageItemInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 390
    new-instance v1, Ll/ۤۢۡ;

    sget-object v2, Ll/᩶ۖܳ;->֨:Ll/᩶ۖܳ;

    invoke-direct {v1, v2, v0}, Ll/ۤۢۡ;-><init>(Ll/᩶ۖܳ;Landroid/graphics/drawable/Drawable;)V

    .line 391
    sget-object v0, Ll/ۛۢۡ;->ۨ:Ll/֨᩵;

    invoke-virtual {v0, p0, v1}, Ll/֨᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    :goto_5
    return-object v3
.end method

.method public static bridge synthetic ܽ()I
    .locals 1

    .line 0
    sget v0, Ll/ۛۢۡ;->۟:I

    return v0
.end method


# virtual methods
.method public native run()V
.end method
