.class public final Ll/ۜ᩵ۢ;
.super Ljava/lang/Object;
.source "77BV"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ll/᩷ۧ᩻;

.field public static ܽ:Ljava/util/List;

.field public static ᩳ:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 42
    sget-object v0, Ll/᩷ۧ᩻;->ܿ:Ll/᩷ۧ᩻;

    sput-object v0, Ll/ۜ᩵ۢ;->ۧ:Ll/᩷ۧ᩻;

    return-void
.end method

.method public static ֫(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 5

    const/high16 v0, 0x42000000    # 32.0f

    .line 444
    invoke-static {v0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v0

    const/high16 v1, 0x41700000    # 15.0f

    .line 451
    invoke-static {v1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v1

    .line 338
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 339
    new-instance v3, Landroid/graphics/Canvas;

    invoke-direct {v3, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 340
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->copyBounds()Landroid/graphics/Rect;

    move-result-object v4

    .line 341
    invoke-virtual {p0, v1, v1, v0, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 342
    invoke-virtual {p0, v3}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 343
    invoke-virtual {p0, v4}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-object v2
.end method

.method public static ֫([Ljava/io/File;)Ljava/io/File;
    .locals 6

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 416
    :cond_0
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p0, v2

    .line 417
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

.method public static ֫(Ll/ᩳۜܳ;I)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    goto :goto_1

    .line 250
    :pswitch_1
    instance-of p1, p0, Ll/ۢۧ᩻;

    if-eqz p1, :cond_2

    check-cast p0, Ll/ۢۧ᩻;

    .line 254
    :try_start_0
    invoke-virtual {p0}, Ll/ۢۧ᩻;->ܽ()Ll/ۘܶܿ;

    move-result-object p0

    if-nez p0, :cond_0

    move-object p0, v0

    goto :goto_0

    .line 255
    :cond_0
    iget-object p0, p0, Ll/ۘܶܿ;->ܳ:Landroid/net/Uri;

    :goto_0
    if-eqz p0, :cond_2

    .line 256
    sget p1, Ll/ᩴܶܿ;->֫:I

    .line 131
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object p1

    const-string v1, ".MTDataFilesProvider"

    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    .line 259
    :cond_1
    invoke-static {p0}, Ll/ᩴܶܿ;->ۧ(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    .line 248
    :pswitch_2
    invoke-interface {p0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 247
    :pswitch_3
    invoke-interface {p0}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 245
    :pswitch_4
    sget-object p1, Ll/᩷ۧ᩻;->ܿ:Ll/᩷ۧ᩻;

    .line 353
    invoke-interface {p0}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v0

    invoke-interface {p0}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v2

    sget p0, Ll/۬۫ۡ;->֫:I

    .line 51
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 52
    invoke-static {p0}, Ll/ܳۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catchall_0
    :cond_2
    :goto_1
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_4
    .end packed-switch
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۢۧ᩻;
    .locals 4

    if-eqz p0, :cond_3

    .line 108
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 111
    :cond_0
    sget-object v0, Ll/ۖۧ᩻;->᩹:Ll/ۖۧ᩻;

    invoke-virtual {v0, p0}, Ll/ۖۧ᩻;->֫(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object v1

    if-nez v1, :cond_2

    const-string v2, "/"

    .line 112
    invoke-virtual {p0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    .line 115
    :cond_1
    invoke-virtual {p0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ۖۧ᩻;->֫(Ljava/lang/String;)Ll/ᩳۜܳ;

    move-result-object p0

    check-cast p0, Ll/ۢۧ᩻;

    return-object p0

    .line 113
    :cond_2
    :goto_0
    check-cast v1, Ll/ۢۧ᩻;

    return-object v1

    :cond_3
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ᩳۜܳ;)Ll/ܳ᩵ۢ;
    .locals 4

    .line 60
    sget-object v0, Ll/ۜ᩵ۢ;->ۧ:Ll/᩷ۧ᩻;

    invoke-virtual {v0, p0}, Ll/᩷ۧ᩻;->ۧ(Ll/ᩳۜܳ;)I

    move-result v0

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    move-object v2, v1

    goto :goto_0

    :pswitch_1
    const-string v2, "badge"

    goto :goto_0

    :pswitch_2
    const-string v2, "full"

    :goto_0
    if-eqz v2, :cond_1

    .line 62
    invoke-static {p0, v0}, Ll/ۜ᩵ۢ;->ۧ(Ll/ᩳۜܳ;I)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_1

    .line 65
    :cond_0
    new-instance v1, Ll/ܳ᩵ۢ;

    invoke-static {p0, v0}, Ll/ۜ᩵ۢ;->֫(Ll/ᩳۜܳ;I)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, v2, p0}, Ll/ܳ᩵ۢ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_1
    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static ֫(Ll/ۨܺ᩷;Ll/ۨܺ᩷;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p0, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    .line 206
    :cond_1
    invoke-virtual {p0}, Ll/ۨܺ᩷;->֫()Landroid/graphics/Bitmap;

    move-result-object p0

    .line 207
    invoke-virtual {p1}, Ll/ۨܺ᩷;->֫()Landroid/graphics/Bitmap;

    move-result-object p1

    if-ne p0, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public static ֫(Landroid/graphics/Bitmap;)[B
    .locals 3

    .line 428
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 429
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x64

    invoke-virtual {p0, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 430
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/lang/String;)Ll/᩻᩵ۢ;
    .locals 12

    .line 80
    invoke-static {p0}, Ll/ۜ᩵ۢ;->֫(Ljava/lang/String;)Ll/ۢۧ᩻;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    goto/16 :goto_a

    .line 92
    :cond_0
    sget-object v1, Ll/ۜ᩵ۢ;->ۧ:Ll/᩷ۧ᩻;

    invoke-virtual {v1, p0}, Ll/᩷ۧ᩻;->ۧ(Ll/ᩳۜܳ;)I

    move-result v2

    const-string v3, "full"

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    move-object v4, v0

    goto :goto_0

    :pswitch_1
    const-string v4, "badge"

    goto :goto_0

    :pswitch_2
    move-object v4, v3

    :goto_0
    if-eqz v4, :cond_1f

    .line 94
    invoke-static {p0, v2}, Ll/ۜ᩵ۢ;->ۧ(Ll/ᩳۜܳ;I)Z

    move-result v5

    if-nez v5, :cond_1

    goto/16 :goto_a

    .line 97
    :cond_1
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "png"

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v3, :cond_7

    .line 172
    invoke-virtual {v1, v0, p0, v2}, Ll/᩷ۧ᩻;->֫(Ll/ܽ᩷ܳ;Ll/ᩳۜܳ;I)Ll/ۨܺ᩷;

    move-result-object v1

    .line 173
    invoke-static {p0, v2}, Ll/ۜ᩵ۢ;->֫(Ll/ᩳۜܳ;I)Ljava/lang/String;

    move-result-object v3

    if-eq v2, v6, :cond_4

    const/4 v6, 0x2

    if-eq v2, v6, :cond_4

    const/4 v6, 0x4

    if-eq v2, v6, :cond_3

    const/4 v6, 0x5

    if-eq v2, v6, :cond_2

    goto :goto_1

    .line 191
    :cond_2
    sget-object v2, Ll/᩶ۖܳ;->ۢ:Ll/᩶ۖܳ;

    .line 244
    iget-object v2, v2, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    .line 191
    invoke-static {v1, v2}, Ll/ۜ᩵ۢ;->֫(Ll/ۨܺ᩷;Ll/ۨܺ᩷;)Z

    move-result v5

    goto :goto_1

    .line 190
    :cond_3
    sget-object v2, Ll/᩶ۖܳ;->ۗ֫:Ll/᩶ۖܳ;

    .line 244
    iget-object v2, v2, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    .line 190
    invoke-static {v1, v2}, Ll/ۜ᩵ۢ;->֫(Ll/ۨܺ᩷;Ll/ۨܺ᩷;)Z

    move-result v5

    goto :goto_1

    .line 189
    :cond_4
    sget-object v2, Ll/᩶ۖܳ;->۬:Ll/᩶ۖܳ;

    .line 244
    iget-object v2, v2, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    .line 189
    invoke-static {v1, v2}, Ll/ۜ᩵ۢ;->֫(Ll/ۨܺ᩷;Ll/ۨܺ᩷;)Z

    move-result v5

    :goto_1
    if-eqz v5, :cond_5

    .line 175
    new-instance p0, Ll/᩻᩵ۢ;

    const-string v1, "damaged"

    invoke-direct {p0, v1, v0, v3}, Ll/᩻᩵ۢ;-><init>(Ljava/lang/String;[BLjava/lang/String;)V

    return-object p0

    .line 177
    :cond_5
    invoke-virtual {p0}, Ll/ܺۘܳ;->ۤۧ()Ll/ۖ֨ܿ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۖ֨ܿ;->ܿ()Ll/᩶ۖܳ;

    move-result-object p0

    .line 244
    iget-object p0, p0, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    .line 177
    invoke-static {v1, p0}, Ll/ۜ᩵ۢ;->֫(Ll/ۨܺ᩷;Ll/ۨܺ᩷;)Z

    move-result p0

    if-eqz p0, :cond_6

    goto/16 :goto_a

    .line 180
    :cond_6
    new-instance p0, Ll/᩻᩵ۢ;

    invoke-virtual {v1}, Ll/ۨܺ᩷;->֫()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Ll/ۜ᩵ۢ;->֫(Landroid/graphics/Bitmap;)[B

    move-result-object v0

    invoke-direct {p0, v4, v0, v3}, Ll/᩻᩵ۢ;-><init>(Ljava/lang/String;[BLjava/lang/String;)V

    return-object p0

    .line 219
    :cond_7
    invoke-static {p0, v2}, Ll/ۜ᩵ۢ;->֫(Ll/ᩳۜܳ;I)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x7

    if-eq v2, v3, :cond_1d

    const/16 v3, 0x8

    if-eq v2, v3, :cond_d

    const/16 v3, 0xa

    if-eq v2, v3, :cond_b

    const/16 v3, 0xb

    if-eq v2, v3, :cond_8

    goto/16 :goto_a

    :cond_8
    if-nez v1, :cond_9

    goto/16 :goto_a

    .line 321
    :cond_9
    invoke-virtual {p0}, Ll/ۢۧ᩻;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object p0

    invoke-static {p0}, Ll/ܿܺۡ;->ۧ(Ll/ܶ᩵ܿ;)Landroid/graphics/Bitmap;

    move-result-object p0

    if-nez p0, :cond_a

    goto/16 :goto_a

    .line 325
    :cond_a
    new-instance v0, Ll/᩻᩵ۢ;

    new-instance v2, Landroid/graphics/drawable/BitmapDrawable;

    .line 328
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v2, v3, p0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-static {v2}, Ll/ۜ᩵ۢ;->֫(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-static {p0}, Ll/ۜ᩵ۢ;->֫(Landroid/graphics/Bitmap;)[B

    move-result-object p0

    invoke-direct {v0, v4, p0, v1}, Ll/᩻᩵ۢ;-><init>(Ljava/lang/String;[BLjava/lang/String;)V

    return-object v0

    :cond_b
    if-nez v1, :cond_c

    goto/16 :goto_a

    .line 224
    :cond_c
    invoke-static {v1}, Ll/ۜ᩵ۢ;->ܽ(Ljava/lang/String;)Ll/᩻᩵ۢ;

    move-result-object p0

    return-object p0

    :cond_d
    if-nez v1, :cond_e

    goto/16 :goto_a

    .line 226
    :cond_e
    invoke-virtual {p0}, Ll/ܺۘܳ;->getPath()Ljava/lang/String;

    move-result-object p0

    .line 353
    new-instance v2, Ljava/io/File;

    const-string v3, "base.apk"

    invoke-direct {v2, p0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 354
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_f

    goto/16 :goto_8

    .line 357
    :cond_f
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_15

    .line 359
    invoke-static {v2}, Ll/ۜ᩵ۢ;->֫([Ljava/io/File;)Ljava/io/File;

    move-result-object p0

    if-nez p0, :cond_11

    .line 361
    array-length v7, v2

    const/4 v8, 0x0

    :goto_2
    if-ge v8, v7, :cond_11

    aget-object v9, v2, v8

    .line 362
    new-instance v10, Ljava/io/File;

    invoke-direct {v10, v9, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 363
    invoke-virtual {v9}, Ljava/io/File;->isDirectory()Z

    move-result v9

    if-eqz v9, :cond_10

    invoke-virtual {v10}, Ljava/io/File;->exists()Z

    move-result v9

    if-eqz v9, :cond_10

    move-object p0, v10

    goto :goto_3

    :cond_10
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_11
    :goto_3
    if-nez p0, :cond_14

    .line 370
    array-length v3, v2

    :goto_4
    if-ge v5, v3, :cond_14

    aget-object v7, v2, v5

    .line 371
    invoke-virtual {v7}, Ljava/io/File;->isDirectory()Z

    move-result v8

    if-nez v8, :cond_12

    goto :goto_5

    .line 374
    :cond_12
    invoke-virtual {v7}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p0

    invoke-static {p0}, Ll/ۜ᩵ۢ;->֫([Ljava/io/File;)Ljava/io/File;

    move-result-object p0

    if-eqz p0, :cond_13

    goto :goto_6

    :cond_13
    :goto_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_14
    :goto_6
    move-object v2, p0

    goto/16 :goto_8

    .line 380
    :cond_15
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x22

    if-lt v2, v3, :cond_19

    .line 381
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    .line 382
    sget-object v7, Ll/ۜ᩵ۢ;->ܽ:Ljava/util/List;

    if-eqz v7, :cond_16

    sget-wide v7, Ll/ۜ᩵ۢ;->ᩳ:J

    sub-long v7, v2, v7

    const-wide/16 v9, 0x2710

    cmp-long v11, v7, v9

    if-lez v11, :cond_17

    .line 384
    :cond_16
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v7

    .line 385
    invoke-virtual {v7, v5}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v5

    new-instance v7, Ll/ܽۧۢ;

    const/4 v8, 0x2

    invoke-direct {v7, v8}, Ll/ܽۧۢ;-><init>(I)V

    .line 386
    invoke-interface {v5, v7}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v5

    new-instance v7, Ll/ܿ᩵ۢ;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Ll/ܿ᩵ۢ;-><init>(I)V

    .line 387
    invoke-interface {v5, v7}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v5

    .line 388
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v7

    invoke-interface {v5, v7}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    sput-object v5, Ll/ۜ᩵ۢ;->ܽ:Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_7

    .line 391
    :catch_0
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    sput-object v5, Ll/ۜ᩵ۢ;->ܽ:Ljava/util/List;

    .line 393
    :goto_7
    sput-wide v2, Ll/ۜ᩵ۢ;->ᩳ:J

    .line 395
    :cond_17
    sget-object v2, Ll/ۜ᩵ۢ;->ܽ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_18
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_19

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 396
    invoke-virtual {v3, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_18

    .line 397
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 398
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_18

    move-object v2, v5

    goto :goto_8

    :cond_19
    move-object v2, v0

    :goto_8
    if-nez v2, :cond_1a

    goto :goto_9

    .line 300
    :cond_1a
    :try_start_1
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object p0

    .line 301
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3, v6}, Landroid/content/pm/PackageManager;->getPackageArchiveInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    if-eqz v3, :cond_1c

    .line 302
    iget-object v3, v3, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-nez v3, :cond_1b

    goto :goto_9

    .line 306
    :cond_1b
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v3, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 307
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v3, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 308
    iget-object v2, v3, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    iget v5, v3, Landroid/content/pm/ApplicationInfo;->icon:I

    invoke-static {v5, v2}, Ll/ۘ۠ۡ;->ۧ(ILjava/lang/String;)V

    .line 309
    invoke-virtual {v3, p0}, Landroid/content/pm/PackageItemInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    .line 310
    new-instance v2, Ll/᩻᩵ۢ;

    invoke-static {p0}, Ll/ۜ᩵ۢ;->֫(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-static {p0}, Ll/ۜ᩵ۢ;->֫(Landroid/graphics/Bitmap;)[B

    move-result-object p0

    invoke-direct {v2, v4, p0, v1}, Ll/᩻᩵ۢ;-><init>(Ljava/lang/String;[BLjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v0, v2

    :catchall_0
    :cond_1c
    :goto_9
    return-object v0

    :cond_1d
    if-nez v1, :cond_1e

    goto :goto_a

    .line 222
    :cond_1e
    invoke-static {v1}, Ll/ۜ᩵ۢ;->ܽ(Ljava/lang/String;)Ll/᩻᩵ۢ;

    move-result-object p0

    return-object p0

    :cond_1f
    :goto_a
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static ۧ(Ll/ᩳۜܳ;I)Z
    .locals 5

    if-nez p1, :cond_0

    goto :goto_0

    .line 125
    :cond_0
    invoke-interface {p0}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v0

    const/4 v1, 0x1

    packed-switch p1, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 128
    :pswitch_1
    invoke-interface {p0}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide p0

    const-wide/32 v2, 0x10000000

    cmp-long v4, p0, v2

    if-lez v4, :cond_1

    goto :goto_0

    .line 137
    :cond_1
    :pswitch_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 0
    instance-of p0, v0, Ll/ۜܶܿ;

    if-eqz p0, :cond_2

    .line 437
    sget-object p0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    if-eqz p0, :cond_2

    const-string p1, "external_storage_thumb_enable"

    invoke-interface {p0, p1, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_3

    :cond_2
    :pswitch_3
    return v1

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public static ܽ(Ljava/lang/String;)Ll/᩻᩵ۢ;
    .locals 3

    .line 274
    :try_start_0
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x1

    .line 275
    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 276
    iget-object v1, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v1, :cond_0

    .line 277
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->icon:I

    invoke-static {v1, p0}, Ll/ۘ۠ۡ;->ۧ(ILjava/lang/String;)V

    .line 279
    :cond_0
    invoke-static {v0}, Ll/ۛۢۡ;->֫(Landroid/content/pm/PackageInfo;)Landroid/graphics/drawable/BitmapDrawable;

    move-result-object v0

    .line 280
    new-instance v1, Ll/᩻᩵ۢ;

    const-string v2, "png"

    .line 283
    invoke-static {v0}, Ll/ۜ᩵ۢ;->֫(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Ll/ۜ᩵ۢ;->֫(Landroid/graphics/Bitmap;)[B

    move-result-object v0

    invoke-direct {v1, v2, v0, p0}, Ll/᩻᩵ۢ;-><init>(Ljava/lang/String;[BLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    const/4 p0, 0x0

    return-object p0
.end method
