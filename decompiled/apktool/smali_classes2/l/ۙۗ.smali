.class public final Ll/ۙۗ;
.super Ljava/lang/Object;
.source "Z4TG"


# static fields
.field public static final ֫:Ljava/lang/Object;

.field public static final ۧ:Ljava/util/WeakHashMap;

.field public static final ܽ:Ljava/lang/ThreadLocal;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 75
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/ۙۗ;->ܽ:Ljava/lang/ThreadLocal;

    .line 79
    new-instance v0, Ljava/util/WeakHashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/WeakHashMap;-><init>(I)V

    sput-object v0, Ll/ۙۗ;->ۧ:Ljava/util/WeakHashMap;

    .line 80
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۙۗ;->֫:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 714
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)I
    .locals 2

    .line 200
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    .line 201
    invoke-static {p0, p1, p2}, Ll/֡ۗ;->֫(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)I

    move-result p0

    return p0

    .line 203
    :cond_0
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p0

    return p0
.end method

.method public static ֫(Landroid/content/Context;I)Landroid/graphics/Typeface;
    .locals 7

    .line 439
    invoke-virtual {p0}, Landroid/content/Context;->isRestricted()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 442
    :cond_0
    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    invoke-static/range {v0 .. v6}, Ll/ۙۗ;->֫(Landroid/content/Context;ILandroid/util/TypedValue;ILl/ܶۗ;ZZ)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/content/Context;ILandroid/util/TypedValue;ILl/ܶۗ;)Landroid/graphics/Typeface;
    .locals 7

    .line 542
    invoke-virtual {p0}, Landroid/content/Context;->isRestricted()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    .line 545
    invoke-static/range {v0 .. v6}, Ll/ۙۗ;->֫(Landroid/content/Context;ILandroid/util/TypedValue;ILl/ܶۗ;ZZ)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Landroid/content/Context;ILandroid/util/TypedValue;ILl/ܶۗ;ZZ)Landroid/graphics/Typeface;
    .locals 13

    move v9, p1

    move-object v0, p2

    move-object/from16 v10, p4

    .line 567
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/4 v1, 0x1

    .line 568
    invoke-virtual {v2, p1, p2, v1}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 599
    iget-object v1, v0, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    if-eqz v1, :cond_b

    .line 604
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v1, "res/"

    .line 605
    invoke-virtual {v4, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v11, 0x0

    const/4 v12, -0x3

    if-nez v1, :cond_0

    if-eqz v10, :cond_8

    .line 608
    invoke-virtual {v10, v12, v11}, Ll/ܶۗ;->callbackFailAsync(ILandroid/os/Handler;)V

    goto/16 :goto_1

    .line 613
    :cond_0
    iget v1, v0, Landroid/util/TypedValue;->assetCookie:I

    move/from16 v6, p3

    invoke-static {v2, p1, v4, v1, v6}, Ll/ۜ۬;->ۧ(Landroid/content/res/Resources;ILjava/lang/String;II)Landroid/graphics/Typeface;

    move-result-object v1

    if-eqz v1, :cond_2

    if-eqz v10, :cond_1

    .line 618
    invoke-virtual {v10, v1, v11}, Ll/ܶۗ;->callbackSuccessAsync(Landroid/graphics/Typeface;Landroid/os/Handler;)V

    :cond_1
    move-object v11, v1

    goto :goto_1

    :cond_2
    if-eqz p6, :cond_3

    goto :goto_1

    .line 626
    :cond_3
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v3, ".xml"

    invoke-virtual {v1, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 627
    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v1

    .line 629
    invoke-static {v1, v2}, Ll/ۖۗ;->֫(Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources;)Ll/᩷ۗ;

    move-result-object v1

    if-nez v1, :cond_4

    if-eqz v10, :cond_8

    .line 633
    invoke-virtual {v10, v12, v11}, Ll/ܶۗ;->callbackFailAsync(ILandroid/os/Handler;)V

    goto :goto_1

    .line 638
    :cond_4
    iget v5, v0, Landroid/util/TypedValue;->assetCookie:I

    move-object v0, p0

    move v3, p1

    move/from16 v6, p3

    move-object/from16 v7, p4

    move/from16 v8, p5

    invoke-static/range {v0 .. v8}, Ll/ۜ۬;->֫(Landroid/content/Context;Ll/᩷ۗ;Landroid/content/res/Resources;ILjava/lang/String;IILl/ܶۗ;Z)Landroid/graphics/Typeface;

    move-result-object v11

    goto :goto_1

    .line 642
    :cond_5
    iget v5, v0, Landroid/util/TypedValue;->assetCookie:I

    move-object v0, p0

    move-object v1, v2

    move v2, p1

    move-object v3, v4

    move v4, v5

    move/from16 v5, p3

    invoke-static/range {v0 .. v5}, Ll/ۜ۬;->֫(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;II)Landroid/graphics/Typeface;

    move-result-object v0

    if-eqz v10, :cond_7

    if-eqz v0, :cond_6

    .line 646
    invoke-virtual {v10, v0, v11}, Ll/ܶۗ;->callbackSuccessAsync(Landroid/graphics/Typeface;Landroid/os/Handler;)V

    goto :goto_0

    .line 648
    :cond_6
    invoke-virtual {v10, v12, v11}, Ll/ܶۗ;->callbackFailAsync(ILandroid/os/Handler;)V
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_7
    :goto_0
    move-object v11, v0

    goto :goto_1

    :catch_0
    if-eqz v10, :cond_8

    .line 659
    invoke-virtual {v10, v12, v11}, Ll/ܶۗ;->callbackFailAsync(ILandroid/os/Handler;)V

    :cond_8
    :goto_1
    if-nez v11, :cond_a

    if-nez v10, :cond_a

    if-eqz p6, :cond_9

    goto :goto_2

    .line 572
    :cond_9
    new-instance v0, Landroid/content/res/Resources$NotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Font resource ID #0x"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 573
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " could not be retrieved."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    :goto_2
    return-object v11

    .line 600
    :cond_b
    new-instance v1, Landroid/content/res/Resources$NotFoundException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Resource \""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\" ("

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 601
    invoke-static {p1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ") is not a Font: "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static ֫(Landroid/content/Context;ILl/ܶۗ;)V
    .locals 7

    .line 524
    invoke-virtual {p0}, Landroid/content/Context;->isRestricted()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, -0x4

    const/4 p1, 0x0

    .line 525
    invoke-virtual {p2, p0, p1}, Ll/ܶۗ;->callbackFailAsync(ILandroid/os/Handler;)V

    return-void

    .line 529
    :cond_0
    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move v1, p1

    move-object v4, p2

    invoke-static/range {v0 .. v6}, Ll/ۙۗ;->֫(Landroid/content/Context;ILandroid/util/TypedValue;ILl/ܶۗ;ZZ)Landroid/graphics/Typeface;

    return-void
.end method

.method public static ֫(Ll/֨ۗ;ILandroid/content/res/ColorStateList;Landroid/content/res/Resources$Theme;)V
    .locals 3

    .line 298
    sget-object v0, Ll/ۙۗ;->֫:Ljava/lang/Object;

    monitor-enter v0

    .line 299
    :try_start_0
    sget-object v1, Ll/ۙۗ;->ۧ:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/SparseArray;

    if-nez v2, :cond_0

    .line 301
    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 302
    invoke-virtual {v1, p0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    :cond_0
    new-instance v1, Ll/ۚۗ;

    iget-object p0, p0, Ll/֨ۗ;->֫:Landroid/content/res/Resources;

    .line 305
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p0

    invoke-direct {v1, p2, p0, p3}, Ll/ۚۗ;-><init>(Landroid/content/res/ColorStateList;Landroid/content/res/Configuration;Landroid/content/res/Resources$Theme;)V

    .line 304
    invoke-virtual {v2, p1, v1}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    .line 306
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۧ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;
    .locals 7

    .line 232
    new-instance v1, Ll/֨ۗ;

    invoke-direct {v1, p0, p2}, Ll/֨ۗ;-><init>(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;)V

    .line 274
    sget-object v0, Ll/ۙۗ;->֫:Ljava/lang/Object;

    monitor-enter v0

    .line 275
    :try_start_0
    sget-object v2, Ll/ۙۗ;->ۧ:Ljava/util/WeakHashMap;

    invoke-virtual {v2, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/SparseArray;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    .line 276
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v4

    if-lez v4, :cond_3

    .line 277
    invoke-virtual {v2, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۚۗ;

    if-eqz v4, :cond_3

    .line 279
    iget-object v5, v4, Ll/ۚۗ;->֫:Landroid/content/res/Configuration;

    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    move-result v5

    if-eqz v5, :cond_2

    if-nez p2, :cond_0

    iget v5, v4, Ll/ۚۗ;->ۧ:I

    if-eqz v5, :cond_1

    :cond_0
    if-eqz p2, :cond_2

    iget v5, v4, Ll/ۚۗ;->ۧ:I

    .line 281
    invoke-virtual {p2}, Landroid/content/res/Resources$Theme;->hashCode()I

    move-result v6

    if-ne v5, v6, :cond_2

    .line 283
    :cond_1
    iget-object v2, v4, Ll/ۚۗ;->ܽ:Landroid/content/res/ColorStateList;

    monitor-exit v0

    goto :goto_0

    .line 286
    :cond_2
    invoke-virtual {v2, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 290
    :cond_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_4

    return-object v2

    .line 318
    :cond_4
    sget-object v0, Ll/ۙۗ;->ܽ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/TypedValue;

    if-nez v2, :cond_5

    .line 320
    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 321
    invoke-virtual {v0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x1

    .line 311
    invoke-virtual {p0, p1, v2, v0}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 312
    iget v0, v2, Landroid/util/TypedValue;->type:I

    const/16 v2, 0x1c

    if-lt v0, v2, :cond_6

    const/16 v2, 0x1f

    if-gt v0, v2, :cond_6

    goto :goto_1

    .line 262
    :cond_6
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v0

    .line 264
    :try_start_1
    invoke-static {p0, v0, p2}, Ll/ܳۗ;->֫(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    nop

    :goto_1
    if-eqz v3, :cond_7

    .line 241
    invoke-static {v1, p1, v3, p2}, Ll/ۙۗ;->֫(Ll/֨ۗ;ILandroid/content/res/ColorStateList;Landroid/content/res/Resources$Theme;)V

    return-object v3

    .line 245
    :cond_7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_8

    .line 246
    invoke-static {p0, p1, p2}, Ll/֡ۗ;->ۧ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0

    .line 248
    :cond_8
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0

    :catchall_0
    move-exception p0

    .line 290
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static ۧ(Landroid/content/Context;I)Landroid/graphics/Typeface;
    .locals 7

    .line 411
    invoke-virtual {p0}, Landroid/content/Context;->isRestricted()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 414
    :cond_0
    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    invoke-static/range {v0 .. v6}, Ll/ۙۗ;->֫(Landroid/content/Context;ILandroid/util/TypedValue;ILl/ܶۗ;ZZ)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 138
    invoke-static {p0, p1, p2}, Ll/᩵ۗ;->֫(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method
