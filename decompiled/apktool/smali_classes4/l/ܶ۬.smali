.class public final Ll/ܶ۬;
.super Ljava/lang/Object;
.source "X2Z7"


# direct methods
.method public static ֫(Ljava/lang/Object;)I
    .locals 4

    .line 1214
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 1215
    invoke-static {p0}, Ll/᩹۬;->֫(Ljava/lang/Object;)I

    move-result p0

    return p0

    :cond_0
    const/4 v0, 0x0

    .line 1218
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getResId"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    return v0
.end method

.method public static ֫(Landroid/graphics/drawable/Icon;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1325
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Icon;->loadDrawable(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۙ۬;Landroid/content/Context;)Landroid/graphics/drawable/Icon;
    .locals 4

    .line 1264
    iget v0, p0, Ll/ۙ۬;->ۢ:I

    const/4 v1, 0x0

    const/16 v2, 0x1a

    packed-switch v0, :pswitch_data_0

    .line 1312
    :pswitch_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unknown type"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1290
    :pswitch_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1e

    if-lt v0, v3, :cond_0

    .line 1291
    invoke-virtual {p0}, Ll/ۙ۬;->ܿ()Landroid/net/Uri;

    move-result-object p1

    invoke-static {p1}, Ll/᩶۬;->֫(Landroid/net/Uri;)Landroid/graphics/drawable/Icon;

    move-result-object p1

    goto/16 :goto_0

    :cond_0
    if-eqz p1, :cond_3

    .line 1299
    invoke-virtual {p0, p1}, Ll/ۙ۬;->֫(Landroid/content/Context;)Ljava/io/InputStream;

    move-result-object p1

    if-eqz p1, :cond_2

    if-lt v0, v2, :cond_1

    .line 1305
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-static {p1}, Ll/᩸۬;->֫(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    move-result-object p1

    goto/16 :goto_0

    .line 1308
    :cond_1
    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 1307
    invoke-static {p1, v1}, Ll/ۙ۬;->֫(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    invoke-static {p1}, Landroid/graphics/drawable/Icon;->createWithBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    move-result-object p1

    goto/16 :goto_0

    .line 1301
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot load adaptive icon from uri: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1302
    invoke-virtual {p0}, Ll/ۙ۬;->ܿ()Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1295
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Context is required to resolve the file uri of the icon: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1297
    invoke-virtual {p0}, Ll/ۙ۬;->ܿ()Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1272
    :pswitch_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p1, v2, :cond_4

    .line 1273
    iget-object p1, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-static {p1}, Ll/᩸۬;->֫(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    move-result-object p1

    goto :goto_0

    .line 1275
    :cond_4
    iget-object p1, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    check-cast p1, Landroid/graphics/Bitmap;

    .line 1276
    invoke-static {p1, v1}, Ll/ۙ۬;->֫(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 1275
    invoke-static {p1}, Landroid/graphics/drawable/Icon;->createWithBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    move-result-object p1

    goto :goto_0

    .line 1287
    :pswitch_3
    iget-object p1, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Landroid/graphics/drawable/Icon;->createWithContentUri(Ljava/lang/String;)Landroid/graphics/drawable/Icon;

    move-result-object p1

    goto :goto_0

    .line 1283
    :pswitch_4
    iget-object p1, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    check-cast p1, [B

    iget v0, p0, Ll/ۙ۬;->ۧ:I

    iget v1, p0, Ll/ۙ۬;->ܽ:I

    invoke-static {p1, v0, v1}, Landroid/graphics/drawable/Icon;->createWithData([BII)Landroid/graphics/drawable/Icon;

    move-result-object p1

    goto :goto_0

    .line 1280
    :pswitch_5
    invoke-virtual {p0}, Ll/ۙ۬;->ܽ()Ljava/lang/String;

    move-result-object p1

    iget v0, p0, Ll/ۙ۬;->ۧ:I

    invoke-static {p1, v0}, Landroid/graphics/drawable/Icon;->createWithResource(Ljava/lang/String;I)Landroid/graphics/drawable/Icon;

    move-result-object p1

    goto :goto_0

    .line 1269
    :pswitch_6
    iget-object p1, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-static {p1}, Landroid/graphics/drawable/Icon;->createWithBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    move-result-object p1

    .line 1314
    :goto_0
    iget-object v0, p0, Ll/ۙ۬;->᩻:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_5

    .line 1315
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Icon;->setTintList(Landroid/content/res/ColorStateList;)Landroid/graphics/drawable/Icon;

    .line 1317
    :cond_5
    iget-object p0, p0, Ll/ۙ۬;->ۜ:Landroid/graphics/PorterDuff$Mode;

    sget-object v0, Ll/ۙ۬;->ܺ:Landroid/graphics/PorterDuff$Mode;

    if-eq p0, v0, :cond_6

    .line 1318
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Icon;->setTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/drawable/Icon;

    :cond_6
    return-object p1

    .line 1267
    :pswitch_7
    iget-object p0, p0, Ll/ۙ۬;->ᩳ:Ljava/lang/Object;

    check-cast p0, Landroid/graphics/drawable/Icon;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static ۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 1167
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 1168
    invoke-static {p0}, Ll/᩹۬;->ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    .line 1171
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getResPackage"

    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v0
.end method

.method public static ܽ(Ljava/lang/Object;)I
    .locals 4

    .line 1139
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 1140
    invoke-static {p0}, Ll/᩹۬;->ܽ(Ljava/lang/Object;)I

    move-result p0

    return p0

    :cond_0
    const/4 v0, -0x1

    .line 1143
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getType"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    .line 1151
    :catch_0
    invoke-static {p0}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    return v0

    .line 1148
    :catch_1
    invoke-static {p0}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    return v0

    .line 1145
    :catch_2
    invoke-static {p0}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    return v0
.end method

.method public static ᩳ(Ljava/lang/Object;)Landroid/net/Uri;
    .locals 3

    .line 1243
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 1244
    invoke-static {p0}, Ll/᩹۬;->ᩳ(Ljava/lang/Object;)Landroid/net/Uri;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    .line 1247
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getUri"

    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v0
.end method
