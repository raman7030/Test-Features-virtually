.class public final Ll/֫ۘ;
.super Ljava/lang/Object;
.source "K22K"


# static fields
.field public static final ۜ:Ll/ۛۖ;

.field public static ۢ:Ll/֫ۘ;

.field public static final ᩷:Landroid/graphics/PorterDuff$Mode;


# instance fields
.field public ֫:Ll/ۗ᩵;

.field public final ۧ:Ljava/util/WeakHashMap;

.field public ܳ:Ljava/util/WeakHashMap;

.field public ܽ:Z

.field public ܿ:Ll/۬᩵;

.field public ᩳ:Ll/ܰۖ;

.field public ᩻:Landroid/util/TypedValue;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 85
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    sput-object v0, Ll/֫ۘ;->᩷:Landroid/graphics/PorterDuff$Mode;

    .line 115
    new-instance v0, Ll/ۛۖ;

    const/4 v1, 0x6

    .line 417
    invoke-direct {v0, v1}, Ll/֨᩵;-><init>(I)V

    .line 115
    sput-object v0, Ll/֫ۘ;->ۜ:Ll/ۛۖ;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    new-instance v0, Ljava/util/WeakHashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/WeakHashMap;-><init>(I)V

    iput-object v0, p0, Ll/֫ۘ;->ۧ:Ljava/util/WeakHashMap;

    return-void
.end method

.method public static declared-synchronized ֫(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    .locals 4

    .line 2
    const-class v0, Ll/֫ۘ;

    .line 3
    monitor-enter v0

    .line 480
    :try_start_0
    sget-object v1, Ll/֫ۘ;->ۜ:Ll/ۛۖ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v2, p0, 0x1f

    mul-int/lit8 v2, v2, 0x1f

    .line 431
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v2

    .line 421
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll/֨᩵;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/PorterDuffColorFilter;

    if-nez v3, :cond_0

    .line 484
    new-instance v3, Landroid/graphics/PorterDuffColorFilter;

    invoke-direct {v3, p0, p1}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 431
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p0

    add-int/2addr p0, v2

    .line 425
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v1, p0, v3}, Ll/֨᩵;->֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/PorterDuffColorFilter;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 488
    :cond_0
    monitor-exit v0

    return-object v3

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method private declared-synchronized ֫(Landroid/content/Context;J)Landroid/graphics/drawable/Drawable;
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 316
    :try_start_0
    iget-object v1, p0, Ll/֫ۘ;->ۧ:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ᩵;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-nez v1, :cond_0

    .line 318
    monitor-exit v0

    return-object v2

    .line 109
    :cond_0
    :try_start_1
    invoke-virtual {v1, p2, p3, v2}, Ll/ۚ᩵;->ۧ(JLjava/lang/Long;)Ljava/lang/Object;

    move-result-object v3

    .line 321
    check-cast v3, Ljava/lang/ref/WeakReference;

    if-eqz v3, :cond_2

    .line 324
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/drawable/Drawable$ConstantState;

    if-eqz v3, :cond_1

    .line 326
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {v3, p1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p1

    .line 329
    :cond_1
    :try_start_2
    invoke-virtual {v1, p2, p3}, Ll/ۚ᩵;->ۧ(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 332
    :cond_2
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public static declared-synchronized ֫()Ll/֫ۘ;
    .locals 2

    .line 2
    const-class v0, Ll/֫ۘ;

    .line 3
    monitor-enter v0

    .line 96
    :try_start_0
    sget-object v1, Ll/֫ۘ;->ۢ:Ll/֫ۘ;

    if-nez v1, :cond_0

    .line 97
    new-instance v1, Ll/֫ۘ;

    invoke-direct {v1}, Ll/֫ۘ;-><init>()V

    sput-object v1, Ll/֫ۘ;->ۢ:Ll/֫ۘ;

    .line 98
    invoke-static {v1}, Ll/֫ۘ;->֫(Ll/֫ۘ;)V

    .line 100
    :cond_0
    sget-object v1, Ll/֫ۘ;->ۢ:Ll/֫ۘ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private declared-synchronized ֫(Landroid/content/Context;JLandroid/graphics/drawable/Drawable;)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 337
    :try_start_0
    invoke-virtual {p4}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object p4

    if-eqz p4, :cond_1

    .line 339
    iget-object v1, p0, Ll/֫ۘ;->ۧ:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚ᩵;

    if-nez v1, :cond_0

    .line 341
    new-instance v1, Ll/ۚ᩵;

    invoke-direct {v1}, Ll/ۚ᩵;-><init>()V

    .line 342
    iget-object v2, p0, Ll/֫ۘ;->ۧ:Ljava/util/WeakHashMap;

    invoke-virtual {v2, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    :cond_0
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, p2, p3, p1}, Ll/ۚ᩵;->֫(JLjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 345
    monitor-exit v0

    return-void

    .line 347
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public static ֫(Landroid/graphics/drawable/Drawable;Ll/ۛۘ;[I)V
    .locals 4

    .line 437
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object v0

    .line 439
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-ne v1, p0, :cond_7

    .line 446
    instance-of v1, p0, Landroid/graphics/drawable/LayerDrawable;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v1

    if-eqz v1, :cond_0

    new-array v1, v2, [I

    .line 448
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 449
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 452
    :cond_0
    iget-boolean v0, p1, Ll/ۛۘ;->֫:Z

    if-nez v0, :cond_2

    iget-boolean v1, p1, Ll/ۛۘ;->ۧ:Z

    if-eqz v1, :cond_1

    goto :goto_0

    .line 458
    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    goto :goto_4

    :cond_2
    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 454
    iget-object v0, p1, Ll/ۛۘ;->ܽ:Landroid/content/res/ColorStateList;

    goto :goto_1

    :cond_3
    move-object v0, v1

    .line 455
    :goto_1
    iget-boolean v3, p1, Ll/ۛۘ;->ۧ:Z

    if-eqz v3, :cond_4

    iget-object p1, p1, Ll/ۛۘ;->ᩳ:Landroid/graphics/PorterDuff$Mode;

    goto :goto_2

    :cond_4
    sget-object p1, Ll/֫ۘ;->᩷:Landroid/graphics/PorterDuff$Mode;

    :goto_2
    if-eqz v0, :cond_6

    if-nez p1, :cond_5

    goto :goto_3

    .line 473
    :cond_5
    invoke-virtual {v0, p2, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p2

    .line 474
    invoke-static {p2, p1}, Ll/֫ۘ;->֫(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v1

    .line 453
    :cond_6
    :goto_3
    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 461
    :goto_4
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x17

    if-gt p1, p2, :cond_7

    .line 464
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_7
    return-void
.end method

.method private ֫(Ljava/lang/String;Ll/᩺ۖ;)V
    .locals 1

    .line 368
    iget-object v0, p0, Ll/֫ۘ;->֫:Ll/ۗ᩵;

    if-nez v0, :cond_0

    .line 369
    new-instance v0, Ll/ۗ᩵;

    invoke-direct {v0}, Ll/ۗ᩵;-><init>()V

    iput-object v0, p0, Ll/֫ۘ;->֫:Ll/ۗ᩵;

    .line 371
    :cond_0
    iget-object v0, p0, Ll/֫ۘ;->֫:Ll/ۗ᩵;

    invoke-virtual {v0, p1, p2}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ll/֫ۘ;)V
    .locals 2

    .line 107
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_0

    .line 108
    new-instance v0, Ll/۟ۖ;

    .line 513
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "vector"

    .line 108
    invoke-direct {p0, v1, v0}, Ll/֫ۘ;->֫(Ljava/lang/String;Ll/᩺ۖ;)V

    .line 109
    new-instance v0, Ll/ۤۖ;

    .line 530
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "animated-vector"

    .line 109
    invoke-direct {p0, v1, v0}, Ll/֫ۘ;->֫(Ljava/lang/String;Ll/᩺ۖ;)V

    .line 110
    new-instance v0, Ll/۫ۖ;

    .line 546
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "animated-selector"

    .line 110
    invoke-direct {p0, v1, v0}, Ll/֫ۘ;->֫(Ljava/lang/String;Ll/᩺ۖ;)V

    .line 111
    new-instance v0, Ll/ۨۖ;

    invoke-direct {v0}, Ll/ۨۖ;-><init>()V

    const-string v1, "drawable"

    invoke-direct {p0, v1, v0}, Ll/֫ۘ;->֫(Ljava/lang/String;Ll/᩺ۖ;)V

    :cond_0
    return-void
.end method

.method private ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 5

    .line 175
    iget-object v0, p0, Ll/֫ۘ;->᩻:Landroid/util/TypedValue;

    if-nez v0, :cond_0

    .line 176
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iput-object v0, p0, Ll/֫ۘ;->᩻:Landroid/util/TypedValue;

    .line 178
    :cond_0
    iget-object v0, p0, Ll/֫ۘ;->᩻:Landroid/util/TypedValue;

    .line 179
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, p2, v0, v2}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 170
    iget v1, v0, Landroid/util/TypedValue;->assetCookie:I

    int-to-long v1, v1

    const/16 v3, 0x20

    shl-long/2addr v1, v3

    iget v3, v0, Landroid/util/TypedValue;->data:I

    int-to-long v3, v3

    or-long/2addr v1, v3

    .line 182
    invoke-direct {p0, p1, v1, v2}, Ll/֫ۘ;->֫(Landroid/content/Context;J)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    if-eqz v3, :cond_1

    return-object v3

    .line 189
    :cond_1
    iget-object v3, p0, Ll/֫ۘ;->ᩳ:Ll/ܰۖ;

    if-nez v3, :cond_2

    const/4 p2, 0x0

    goto :goto_0

    .line 190
    :cond_2
    check-cast v3, Ll/ۤۢ;

    invoke-virtual {v3, p0, p1, p2}, Ll/ۤۢ;->֫(Ll/֫ۘ;Landroid/content/Context;I)Landroid/graphics/drawable/LayerDrawable;

    move-result-object p2

    :goto_0
    if-eqz p2, :cond_3

    .line 193
    iget v0, v0, Landroid/util/TypedValue;->changingConfigurations:I

    invoke-virtual {p2, v0}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V

    .line 195
    invoke-direct {p0, p1, v1, v2, p2}, Ll/֫ۘ;->֫(Landroid/content/Context;JLandroid/graphics/drawable/Drawable;)V

    :cond_3
    return-object p2
.end method

.method private ᩳ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 11

    .line 230
    iget-object v0, p0, Ll/֫ۘ;->֫:Ll/ۗ᩵;

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ll/ۗ᩵;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    .line 231
    iget-object v0, p0, Ll/֫ۘ;->ܿ:Ll/۬᩵;

    const-string v2, "appcompat_skip_skip"

    if-eqz v0, :cond_0

    .line 109
    invoke-virtual {v0, p2, v1}, Ll/۬᩵;->֫(ILjava/lang/Integer;)Ljava/lang/Object;

    move-result-object v0

    .line 232
    check-cast v0, Ljava/lang/String;

    .line 233
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    if-eqz v0, :cond_1

    iget-object v3, p0, Ll/֫ۘ;->֫:Ll/ۗ᩵;

    .line 369
    invoke-virtual {v3, v0, v1}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    .line 245
    :cond_0
    new-instance v0, Ll/۬᩵;

    invoke-direct {v0}, Ll/۬᩵;-><init>()V

    iput-object v0, p0, Ll/֫ۘ;->ܿ:Ll/۬᩵;

    .line 248
    :cond_1
    iget-object v0, p0, Ll/֫ۘ;->᩻:Landroid/util/TypedValue;

    if-nez v0, :cond_2

    .line 249
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iput-object v0, p0, Ll/֫ۘ;->᩻:Landroid/util/TypedValue;

    .line 251
    :cond_2
    iget-object v0, p0, Ll/֫ۘ;->᩻:Landroid/util/TypedValue;

    .line 252
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const/4 v4, 0x1

    .line 253
    invoke-virtual {v3, p2, v0, v4}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 170
    iget v5, v0, Landroid/util/TypedValue;->assetCookie:I

    int-to-long v5, v5

    const/16 v7, 0x20

    shl-long/2addr v5, v7

    iget v7, v0, Landroid/util/TypedValue;->data:I

    int-to-long v7, v7

    or-long/2addr v5, v7

    .line 257
    invoke-direct {p0, p1, v5, v6}, Ll/֫ۘ;->֫(Landroid/content/Context;J)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    if-eqz v7, :cond_3

    return-object v7

    .line 267
    :cond_3
    iget-object v8, v0, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    if-eqz v8, :cond_7

    invoke-interface {v8}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v9, ".xml"

    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_7

    .line 270
    :try_start_0
    invoke-virtual {v3, p2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v3

    .line 271
    invoke-static {v3}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v8

    .line 273
    :goto_0
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v9

    const/4 v10, 0x2

    if-eq v9, v10, :cond_4

    if-eq v9, v4, :cond_4

    goto :goto_0

    :cond_4
    if-ne v9, v10, :cond_6

    .line 281
    invoke-interface {v3}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v4

    .line 283
    iget-object v9, p0, Ll/֫ۘ;->ܿ:Ll/۬᩵;

    invoke-virtual {v9, p2, v4}, Ll/۬᩵;->֫(ILjava/lang/Object;)V

    .line 286
    iget-object v9, p0, Ll/֫ۘ;->֫:Ll/ۗ᩵;

    .line 369
    invoke-virtual {v9, v4, v1}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 286
    check-cast v1, Ll/᩺ۖ;

    if-eqz v1, :cond_5

    .line 289
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    .line 288
    invoke-interface {v1, p1, v3, v8, v4}, Ll/᩺ۖ;->֫(Landroid/content/Context;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    :cond_5
    if-eqz v7, :cond_7

    .line 293
    iget v0, v0, Landroid/util/TypedValue;->changingConfigurations:I

    invoke-virtual {v7, v0}, Landroid/graphics/drawable/Drawable;->setChangingConfigurations(I)V

    .line 294
    invoke-direct {p0, p1, v5, v6, v7}, Ll/֫ۘ;->֫(Landroid/content/Context;JLandroid/graphics/drawable/Drawable;)V

    goto :goto_1

    :catch_0
    nop

    goto :goto_1

    .line 278
    :cond_6
    new-instance p1, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v0, "No start tag found"

    invoke-direct {p1, v0}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_7
    :goto_1
    if-nez v7, :cond_8

    .line 306
    iget-object p1, p0, Ll/֫ۘ;->ܿ:Ll/۬᩵;

    invoke-virtual {p1, p2, v2}, Ll/۬᩵;->֫(ILjava/lang/Object;)V

    :cond_8
    return-object v7

    :cond_9
    :goto_2
    return-object v1
.end method


# virtual methods
.method public final declared-synchronized ֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 2

    move-object v0, p0

    monitor-enter v0

    const/4 v1, 0x0

    .line 135
    :try_start_0
    invoke-virtual {p0, p1, p2, v1}, Ll/֫ۘ;->֫(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;
    .locals 5

    move-object v0, p0

    monitor-enter v0

    .line 492
    :try_start_0
    iget-boolean v1, p0, Ll/֫ۘ;->ܽ:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 498
    :cond_0
    iput-boolean v3, p0, Ll/֫ۘ;->ܽ:Z

    const v1, 0x7f080076

    .line 499
    invoke-virtual {p0, p1, v1}, Ll/֫ۘ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_b

    .line 508
    instance-of v3, v1, Ll/᩹᩺ۧ;

    if-nez v3, :cond_1

    const-string v3, "android.graphics.drawable.VectorDrawable"

    .line 509
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    .line 142
    :cond_1
    :goto_0
    invoke-direct {p0, p1, p2}, Ll/֫ۘ;->ᩳ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_2

    .line 144
    invoke-direct {p0, p1, p2}, Ll/֫ۘ;->ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_2
    if-nez v1, :cond_3

    .line 147
    invoke-static {p1, p2}, Ll/֨ۙ;->ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :cond_3
    if-eqz v1, :cond_9

    .line 203
    invoke-virtual {p0, p1, p2}, Ll/֫ۘ;->ۧ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_6

    .line 206
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 207
    invoke-static {p1}, Ll/۠۬;->ܳ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 208
    invoke-static {v1, v3}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 375
    iget-object p1, p0, Ll/֫ۘ;->ᩳ:Ll/ܰۖ;

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    const p1, 0x7f080069

    if-ne p2, p1, :cond_5

    .line 448
    sget-object v4, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    :cond_5
    :goto_1
    if-eqz v4, :cond_9

    .line 213
    invoke-static {v1, v4}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    goto :goto_2

    .line 215
    :cond_6
    iget-object v3, p0, Ll/֫ۘ;->ᩳ:Ll/ܰۖ;

    if-eqz v3, :cond_7

    check-cast v3, Ll/ۤۢ;

    invoke-virtual {v3, p1, p2, v1}, Ll/ۤۢ;->֫(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)Z

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_2

    .line 364
    :cond_7
    iget-object v3, p0, Ll/֫ۘ;->ᩳ:Ll/ܰۖ;

    if-eqz v3, :cond_8

    check-cast v3, Ll/ۤۢ;

    invoke-virtual {v3, p1, p2, v1}, Ll/ۤۢ;->ۧ(Landroid/content/Context;ILandroid/graphics/drawable/Drawable;)Z

    move-result p1

    if-eqz p1, :cond_8

    const/4 v2, 0x1

    :cond_8
    if-nez v2, :cond_9

    if-eqz p3, :cond_9

    move-object v1, v4

    :cond_9
    :goto_2
    if-eqz v1, :cond_a

    .line 156
    invoke-static {v1}, Ll/ܶܺ;->֫(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 158
    :cond_a
    monitor-exit v0

    return-object v1

    .line 501
    :cond_b
    :try_start_1
    iput-boolean v2, p0, Ll/֫ۘ;->ܽ:Z

    .line 502
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    .line 158
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Landroid/content/Context;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 162
    :try_start_0
    iget-object v1, p0, Ll/֫ۘ;->ۧ:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚ᩵;

    if-eqz p1, :cond_0

    .line 165
    invoke-virtual {p1}, Ll/ۚ᩵;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/ܰۖ;)V
    .locals 1

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 131
    :try_start_0
    iput-object p1, p0, Ll/֫ۘ;->ᩳ:Ll/ܰۖ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 394
    :try_start_0
    iget-object v1, p0, Ll/֫ۘ;->ܳ:Ljava/util/WeakHashMap;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 395
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬᩵;

    if-eqz v1, :cond_0

    .line 109
    invoke-virtual {v1, p2, v2}, Ll/۬᩵;->֫(ILjava/lang/Integer;)Ljava/lang/Object;

    move-result-object v1

    .line 396
    check-cast v1, Landroid/content/res/ColorStateList;

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-nez v1, :cond_5

    .line 384
    iget-object v1, p0, Ll/֫ۘ;->ᩳ:Ll/ܰۖ;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    check-cast v1, Ll/ۤۢ;

    invoke-virtual {v1, p1, p2}, Ll/ۤۢ;->֫(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    :goto_1
    if-eqz v2, :cond_4

    .line 403
    iget-object v1, p0, Ll/֫ۘ;->ܳ:Ljava/util/WeakHashMap;

    if-nez v1, :cond_2

    .line 404
    new-instance v1, Ljava/util/WeakHashMap;

    invoke-direct {v1}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v1, p0, Ll/֫ۘ;->ܳ:Ljava/util/WeakHashMap;

    .line 406
    :cond_2
    iget-object v1, p0, Ll/֫ۘ;->ܳ:Ljava/util/WeakHashMap;

    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬᩵;

    if-nez v1, :cond_3

    .line 408
    new-instance v1, Ll/۬᩵;

    invoke-direct {v1}, Ll/۬᩵;-><init>()V

    .line 409
    iget-object v3, p0, Ll/֫ۘ;->ܳ:Ljava/util/WeakHashMap;

    invoke-virtual {v3, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    :cond_3
    invoke-virtual {v1, p2, v2}, Ll/۬᩵;->֫(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    move-object v1, v2

    .line 390
    :cond_5
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
