.class public final Ll/᩷᩺ۧ;
.super Ll/ۘ᩺ۧ;
.source "560O"

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# instance fields
.field public final ۗ:Landroid/graphics/drawable/Drawable$Callback;

.field public ۙ:Landroid/animation/Animator$AnimatorListener;

.field public ۬:Landroid/content/Context;

.field public ᩶:Ljava/util/ArrayList;

.field public ᩹:Ll/᩻᩺ۧ;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 168
    invoke-direct {p0, v0, v1}, Ll/᩷᩺ۧ;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 29
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/4 p2, 0x0

    .line 161
    iput-object p2, p0, Ll/᩷᩺ۧ;->ۙ:Landroid/animation/Animator$AnimatorListener;

    .line 164
    iput-object p2, p0, Ll/᩷᩺ۧ;->᩶:Ljava/util/ArrayList;

    .line 733
    new-instance p2, Ll/ܿ᩺ۧ;

    invoke-direct {p2, p0}, Ll/ܿ᩺ۧ;-><init>(Ll/᩷᩺ۧ;)V

    iput-object p2, p0, Ll/᩷᩺ۧ;->ۗ:Landroid/graphics/drawable/Drawable$Callback;

    .line 178
    iput-object p1, p0, Ll/᩷᩺ۧ;->۬:Landroid/content/Context;

    .line 182
    new-instance p1, Ll/᩻᩺ۧ;

    .line 599
    invoke-direct {p1}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 182
    iput-object p1, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    return-void
.end method

.method public static ֫(Landroid/content/Context;I)Ll/᩷᩺ۧ;
    .locals 4

    .line 212
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 213
    new-instance v0, Ll/᩷᩺ۧ;

    const/4 v1, 0x0

    .line 172
    invoke-direct {v0, p0, v1}, Ll/᩷᩺ۧ;-><init>(Landroid/content/Context;I)V

    .line 214
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 215
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    .line 214
    invoke-static {v1, p1, p0}, Ll/ۙۗ;->ܽ(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    iput-object p0, v0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    .line 216
    iget-object p1, v0, Ll/᩷᩺ۧ;->ۗ:Landroid/graphics/drawable/Drawable$Callback;

    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 217
    new-instance p0, Ll/ۜ᩺ۧ;

    iget-object p1, v0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    .line 218
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ۜ᩺ۧ;-><init>(Landroid/graphics/drawable/Drawable$ConstantState;)V

    return-object v0

    .line 221
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 224
    :try_start_0
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p1

    .line 225
    invoke-static {p1}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v0

    .line 227
    :goto_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v3, 0x1

    if-eq v1, v3, :cond_1

    goto :goto_0

    :cond_1
    if-ne v1, v2, :cond_2

    .line 234
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 235
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    .line 234
    invoke-static {p0, v1, p1, v0, v2}, Ll/᩷᩺ۧ;->֫(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Ll/᩷᩺ۧ;

    move-result-object p0

    return-object p0

    .line 232
    :cond_2
    new-instance p0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string p1, "No start tag found"

    invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)Ll/᩷᩺ۧ;
    .locals 2

    .line 253
    new-instance v0, Ll/᩷᩺ۧ;

    const/4 v1, 0x0

    .line 172
    invoke-direct {v0, p0, v1}, Ll/᩷᩺ۧ;-><init>(Landroid/content/Context;I)V

    .line 254
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/᩷᩺ۧ;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-object v0
.end method


# virtual methods
.method public final applyTheme(Landroid/content/res/Resources$Theme;)V
    .locals 1

    .line 522
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 523
    invoke-static {v0, p1}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources$Theme;)V

    :cond_0
    return-void
.end method

.method public final canApplyTheme()Z
    .locals 1

    .line 532
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 533
    invoke-static {v0}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 2

    .line 284
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 285
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void

    .line 288
    :cond_0
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object v1, v0, Ll/᩻᩺ۧ;->ᩳ:Ll/᩹᩺ۧ;

    invoke-virtual {v1, p1}, Ll/᩹᩺ۧ;->draw(Landroid/graphics/Canvas;)V

    .line 289
    iget-object p1, v0, Ll/᩻᩺ۧ;->֫:Landroid/animation/AnimatorSet;

    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->isStarted()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 290
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_1
    return-void
.end method

.method public final getAlpha()I
    .locals 1

    .line 321
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 179
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getAlpha()I

    move-result v0

    return v0

    .line 324
    :cond_0
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object v0, v0, Ll/᩻᩺ۧ;->ᩳ:Ll/᩹᩺ۧ;

    invoke-virtual {v0}, Ll/᩹᩺ۧ;->getAlpha()I

    move-result v0

    return v0
.end method

.method public final getChangingConfigurations()I
    .locals 2

    .line 276
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 277
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v0

    return v0

    .line 279
    :cond_0
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v0

    iget-object v1, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return v0
.end method

.method public final getColorFilter()Landroid/graphics/ColorFilter;
    .locals 1

    .line 347
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 348
    invoke-static {v0}, Ll/۠۬;->ܽ(Landroid/graphics/drawable/Drawable;)Landroid/graphics/ColorFilter;

    move-result-object v0

    return-object v0

    .line 350
    :cond_0
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object v0, v0, Ll/᩻᩺ۧ;->ᩳ:Ll/᩹᩺ۧ;

    invoke-virtual {v0}, Ll/᩹᩺ۧ;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object v0

    return-object v0
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 2

    .line 265
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 266
    new-instance v0, Ll/ۜ᩺ۧ;

    iget-object v1, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v1

    invoke-direct {v0, v1}, Ll/ۜ᩺ۧ;-><init>(Landroid/graphics/drawable/Drawable$ConstantState;)V

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .line 420
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 421
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    return v0

    .line 423
    :cond_0
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object v0, v0, Ll/᩻᩺ۧ;->ᩳ:Ll/᩹᩺ۧ;

    invoke-virtual {v0}, Ll/᩹᩺ۧ;->getIntrinsicHeight()I

    move-result v0

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .line 412
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 413
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    return v0

    .line 415
    :cond_0
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object v0, v0, Ll/᩻᩺ۧ;->ᩳ:Ll/᩹᩺ۧ;

    invoke-virtual {v0}, Ll/᩹᩺ۧ;->getIntrinsicWidth()I

    move-result v0

    return v0
.end method

.method public final getOpacity()I
    .locals 1

    .line 404
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 405
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    return v0

    .line 407
    :cond_0
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object v0, v0, Ll/᩻᩺ۧ;->ᩳ:Ll/᩹᩺ۧ;

    invoke-virtual {v0}, Ll/᩹᩺ۧ;->getOpacity()I

    move-result v0

    return v0
.end method

.method public final inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 517
    invoke-virtual {p0, p1, p2, p3, v0}, Ll/᩷᩺ۧ;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-void
.end method

.method public final inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    .locals 7

    .line 446
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 447
    invoke-static {v0, p1, p2, p3, p4}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-void

    .line 450
    :cond_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v0

    .line 451
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    .line 454
    :goto_0
    iget-object v3, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    if-eq v0, v2, :cond_9

    .line 455
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v4

    if-ge v4, v1, :cond_1

    const/4 v4, 0x3

    if-eq v0, v4, :cond_9

    :cond_1
    const/4 v4, 0x2

    if-ne v0, v4, :cond_8

    .line 457
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v4, "animated-vector"

    .line 461
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    .line 462
    sget-object v0, Ll/ۧ᩺ۧ;->֫:[I

    .line 463
    invoke-static {p1, p4, p3, v0}, Ll/ۗۗ;->֫(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 466
    invoke-virtual {v0, v5, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    if-eqz v4, :cond_3

    .line 472
    invoke-static {p1, v4, p4}, Ll/᩹᩺ۧ;->֫(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Ll/᩹᩺ۧ;

    move-result-object v4

    .line 474
    invoke-virtual {v4}, Ll/᩹᩺ۧ;->֫()V

    .line 475
    iget-object v5, p0, Ll/᩷᩺ۧ;->ۗ:Landroid/graphics/drawable/Drawable$Callback;

    invoke-virtual {v4, v5}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 476
    iget-object v5, v3, Ll/᩻᩺ۧ;->ᩳ:Ll/᩹᩺ۧ;

    if-eqz v5, :cond_2

    const/4 v6, 0x0

    .line 477
    invoke-virtual {v5, v6}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 479
    :cond_2
    iput-object v4, v3, Ll/᩻᩺ۧ;->ᩳ:Ll/᩹᩺ۧ;

    .line 481
    :cond_3
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_2

    :cond_4
    const-string v4, "target"

    .line 482
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 483
    sget-object v0, Ll/ۧ᩺ۧ;->ۧ:[I

    .line 484
    invoke-virtual {p1, p3, v0}, Landroid/content/res/Resources;->obtainAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 486
    invoke-virtual {v0, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 489
    invoke-virtual {v0, v2, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    if-eqz v5, :cond_7

    .line 493
    iget-object v6, p0, Ll/᩷᩺ۧ;->۬:Landroid/content/Context;

    if-eqz v6, :cond_6

    .line 496
    invoke-static {v6, v5}, Ll/ۡ᩺ۧ;->֫(Landroid/content/Context;I)Landroid/animation/Animator;

    move-result-object v5

    .line 682
    iget-object v6, v3, Ll/᩻᩺ۧ;->ᩳ:Ll/᩹᩺ۧ;

    invoke-virtual {v6, v4}, Ll/᩹᩺ۧ;->֫(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    .line 683
    invoke-virtual {v5, v6}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 687
    iget-object v6, v3, Ll/᩻᩺ۧ;->ۧ:Ljava/util/ArrayList;

    if-nez v6, :cond_5

    .line 688
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v3, Ll/᩻᩺ۧ;->ۧ:Ljava/util/ArrayList;

    .line 689
    new-instance v6, Ll/ۖ᩵;

    invoke-direct {v6}, Ll/ۖ᩵;-><init>()V

    iput-object v6, v3, Ll/᩻᩺ۧ;->ܽ:Ll/ۖ᩵;

    .line 691
    :cond_5
    iget-object v6, v3, Ll/᩻᩺ۧ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 692
    iget-object v3, v3, Ll/᩻᩺ۧ;->ܽ:Ll/ۖ᩵;

    invoke-virtual {v3, v5, v4}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 500
    :cond_6
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 501
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Context can\'t be null when inflating animators"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 505
    :cond_7
    :goto_1
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 508
    :cond_8
    :goto_2
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v0

    goto/16 :goto_0

    .line 648
    :cond_9
    iget-object p1, v3, Ll/᩻᩺ۧ;->֫:Landroid/animation/AnimatorSet;

    if-nez p1, :cond_a

    .line 649
    new-instance p1, Landroid/animation/AnimatorSet;

    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object p1, v3, Ll/᩻᩺ۧ;->֫:Landroid/animation/AnimatorSet;

    .line 651
    :cond_a
    iget-object p1, v3, Ll/᩻᩺ۧ;->֫:Landroid/animation/AnimatorSet;

    iget-object p2, v3, Ll/᩻᩺ۧ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Landroid/animation/AnimatorSet;->playTogether(Ljava/util/Collection;)V

    return-void
.end method

.method public final isAutoMirrored()Z
    .locals 1

    .line 428
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 96
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isAutoMirrored()Z

    move-result v0

    return v0

    .line 431
    :cond_0
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object v0, v0, Ll/᩻᩺ۧ;->ᩳ:Ll/᩹᩺ۧ;

    invoke-virtual {v0}, Ll/᩹᩺ۧ;->isAutoMirrored()Z

    move-result v0

    return v0
.end method

.method public final isRunning()Z
    .locals 1

    .line 700
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 702
    check-cast v0, Landroid/graphics/drawable/AnimatedVectorDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimatedVectorDrawable;->isRunning()Z

    move-result v0

    return v0

    .line 704
    :cond_0
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object v0, v0, Ll/᩻᩺ۧ;->֫:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->isRunning()Z

    move-result v0

    return v0
.end method

.method public final isStateful()Z
    .locals 1

    .line 394
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 395
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    return v0

    .line 397
    :cond_0
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object v0, v0, Ll/᩻᩺ۧ;->ᩳ:Ll/᩹᩺ۧ;

    invoke-virtual {v0}, Ll/᩹᩺ۧ;->isStateful()Z

    move-result v0

    return v0
.end method

.method public final mutate()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 193
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 194
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    :cond_0
    return-object p0
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .line 296
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 297
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void

    .line 300
    :cond_0
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object v0, v0, Ll/᩻᩺ۧ;->ᩳ:Ll/᩹᩺ۧ;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final onLevelChange(I)Z
    .locals 1

    .line 313
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 314
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result p1

    return p1

    .line 316
    :cond_0
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object v0, v0, Ll/᩻᩺ۧ;->ᩳ:Ll/᩹᩺ۧ;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-result p1

    return p1
.end method

.method public final onStateChange([I)Z
    .locals 1

    .line 305
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 306
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    return p1

    .line 308
    :cond_0
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object v0, v0, Ll/᩻᩺ۧ;->ᩳ:Ll/᩹᩺ۧ;

    invoke-virtual {v0, p1}, Ll/ۘ᩺ۧ;->setState([I)Z

    move-result p1

    return p1
.end method

.method public final setAlpha(I)V
    .locals 1

    .line 329
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 330
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    return-void

    .line 333
    :cond_0
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object v0, v0, Ll/᩻᩺ۧ;->ᩳ:Ll/᩹᩺ۧ;

    invoke-virtual {v0, p1}, Ll/᩹᩺ۧ;->setAlpha(I)V

    return-void
.end method

.method public final setAutoMirrored(Z)V
    .locals 1

    .line 436
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 81
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAutoMirrored(Z)V

    return-void

    .line 440
    :cond_0
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object v0, v0, Ll/᩻᩺ۧ;->ᩳ:Ll/᩹᩺ۧ;

    invoke-virtual {v0, p1}, Ll/᩹᩺ۧ;->setAutoMirrored(Z)V

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    .line 338
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 339
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void

    .line 342
    :cond_0
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object v0, v0, Ll/᩻᩺ۧ;->ᩳ:Ll/᩹᩺ۧ;

    invoke-virtual {v0, p1}, Ll/᩹᩺ۧ;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void
.end method

.method public final setTint(I)V
    .locals 1

    .line 355
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 356
    invoke-static {v0, p1}, Ll/۠۬;->ۧ(Landroid/graphics/drawable/Drawable;I)V

    return-void

    .line 360
    :cond_0
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object v0, v0, Ll/᩻᩺ۧ;->ᩳ:Ll/᩹᩺ۧ;

    invoke-virtual {v0, p1}, Ll/᩹᩺ۧ;->setTint(I)V

    return-void
.end method

.method public final setTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 365
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 366
    invoke-static {v0, p1}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    return-void

    .line 370
    :cond_0
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object v0, v0, Ll/᩻᩺ۧ;->ᩳ:Ll/᩹᩺ۧ;

    invoke-virtual {v0, p1}, Ll/᩹᩺ۧ;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 375
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 376
    invoke-static {v0, p1}, Ll/۠۬;->֫(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    return-void

    .line 380
    :cond_0
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object v0, v0, Ll/᩻᩺ۧ;->ᩳ:Ll/᩹᩺ۧ;

    invoke-virtual {v0, p1}, Ll/᩹᩺ۧ;->setTintMode(Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public final setVisible(ZZ)Z
    .locals 1

    .line 385
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 386
    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p1

    return p1

    .line 388
    :cond_0
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object v0, v0, Ll/᩻᩺ۧ;->ᩳ:Ll/᩹᩺ۧ;

    invoke-virtual {v0, p1, p2}, Ll/᩹᩺ۧ;->setVisible(ZZ)Z

    .line 389
    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p1

    return p1
.end method

.method public final start()V
    .locals 2

    .line 709
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 711
    check-cast v0, Landroid/graphics/drawable/AnimatedVectorDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimatedVectorDrawable;->start()V

    return-void

    .line 715
    :cond_0
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object v1, v0, Ll/᩻᩺ۧ;->֫:Landroid/animation/AnimatorSet;

    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->isStarted()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    .line 719
    :cond_1
    iget-object v0, v0, Ll/᩻᩺ۧ;->֫:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 720
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final stop()V
    .locals 1

    .line 725
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 727
    check-cast v0, Landroid/graphics/drawable/AnimatedVectorDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimatedVectorDrawable;->stop()V

    return-void

    .line 730
    :cond_0
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object v0, v0, Ll/᩻᩺ۧ;->֫:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->end()V

    return-void
.end method

.method public final ֫(Ll/ᩳ᩺ۧ;)V
    .locals 1

    .line 763
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 765
    check-cast v0, Landroid/graphics/drawable/AnimatedVectorDrawable;

    .line 820
    invoke-virtual {p1}, Ll/ᩳ᩺ۧ;->getPlatformCallback()Landroid/graphics/drawable/Animatable2$AnimationCallback;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/AnimatedVectorDrawable;->registerAnimationCallback(Landroid/graphics/drawable/Animatable2$AnimationCallback;)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    goto :goto_0

    .line 774
    :cond_1
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩶:Ljava/util/ArrayList;

    if-nez v0, :cond_2

    .line 775
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩷᩺ۧ;->᩶:Ljava/util/ArrayList;

    .line 778
    :cond_2
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :goto_0
    return-void

    .line 783
    :cond_3
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 785
    iget-object p1, p0, Ll/᩷᩺ۧ;->ۙ:Landroid/animation/Animator$AnimatorListener;

    if-nez p1, :cond_4

    .line 788
    new-instance p1, Ll/ܳ᩺ۧ;

    invoke-direct {p1, p0}, Ll/ܳ᩺ۧ;-><init>(Ll/᩷᩺ۧ;)V

    iput-object p1, p0, Ll/᩷᩺ۧ;->ۙ:Landroid/animation/Animator$AnimatorListener;

    .line 810
    :cond_4
    iget-object p1, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object p1, p1, Ll/᩻᩺ۧ;->֫:Landroid/animation/AnimatorSet;

    iget-object v0, p0, Ll/᩷᩺ۧ;->ۙ:Landroid/animation/Animator$AnimatorListener;

    invoke-virtual {p1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method

.method public final ۧ(Ll/ᩳ᩺ۧ;)V
    .locals 2

    .line 836
    iget-object v0, p0, Ll/ۘ᩺ۧ;->᩸:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 838
    check-cast v0, Landroid/graphics/drawable/AnimatedVectorDrawable;

    .line 757
    invoke-virtual {p1}, Ll/ᩳ᩺ۧ;->getPlatformCallback()Landroid/graphics/drawable/Animatable2$AnimationCallback;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/AnimatedVectorDrawable;->unregisterAnimationCallback(Landroid/graphics/drawable/Animatable2$AnimationCallback;)Z

    .line 841
    :cond_0
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩶:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    .line 845
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 848
    iget-object p1, p0, Ll/᩷᩺ۧ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-nez p1, :cond_2

    .line 827
    iget-object p1, p0, Ll/᩷᩺ۧ;->ۙ:Landroid/animation/Animator$AnimatorListener;

    if-eqz p1, :cond_2

    .line 828
    iget-object v0, p0, Ll/᩷᩺ۧ;->᩹:Ll/᩻᩺ۧ;

    iget-object v0, v0, Ll/᩻᩺ۧ;->֫:Landroid/animation/AnimatorSet;

    invoke-virtual {v0, p1}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    const/4 p1, 0x0

    .line 829
    iput-object p1, p0, Ll/᩷᩺ۧ;->ۙ:Landroid/animation/Animator$AnimatorListener;

    :cond_2
    :goto_0
    return-void
.end method
