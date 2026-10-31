.class public Ll/ᩴ۠ۧ;
.super Landroid/widget/FrameLayout;
.source "J8GM"


# instance fields
.field public ֫֫:I

.field public final ۖ֫:Z

.field public final ۗ:Ll/ۛۚۧ;

.field public ۘ֫:Z

.field public final ۙ:Ll/ۖ۠ۧ;

.field public ۛ:Z

.field public final ۜ֫:Ljava/lang/reflect/Method;

.field public final ۟:Ljava/lang/Class;

.field public final ۡ֫:Ll/֡۠ۧ;

.field public final ۢ֫:Landroid/view/View;

.field public ۤ:Z

.field public final ۧ֫:Ljava/lang/Object;

.field public ۨ:I

.field public ۫:Z

.field public final ۬:Ll/۠֨ۧ;

.field public final ܰ:Landroid/widget/TextView;

.field public final ܳ֫:Landroid/widget/FrameLayout;

.field public final ܺ֫:Landroid/view/View;

.field public final ܽ֫:Landroid/widget/ImageView;

.field public final ܿ֫:Landroid/os/Handler;

.field public ᩳ֫:Z

.field public final ᩶:Landroid/view/View;

.field public ᩷֫:I

.field public ᩸:I

.field public final ᩹:Landroid/widget/ImageView;

.field public ᩺:Landroid/graphics/drawable/Drawable;

.field public ᩻֫:Ll/֨᩵֫;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 348
    invoke-direct {p0, p1, p2, v0}, Ll/ᩴ۠ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    .line 354
    invoke-direct/range {p0 .. p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 356
    new-instance v3, Ll/ۖ۠ۧ;

    invoke-direct {v3, v1}, Ll/ۖ۠ۧ;-><init>(Ll/ᩴ۠ۧ;)V

    iput-object v3, v1, Ll/ᩴ۠ۧ;->ۙ:Ll/ۖ۠ۧ;

    .line 357
    new-instance v4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v4, v1, Ll/ᩴ۠ۧ;->ܿ֫:Landroid/os/Handler;

    .line 359
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isInEditMode()Z

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v4, :cond_1

    .line 360
    iput-object v6, v1, Ll/ᩴ۠ۧ;->ۗ:Ll/ۛۚۧ;

    .line 361
    iput-object v6, v1, Ll/ᩴ۠ۧ;->ۢ֫:Landroid/view/View;

    .line 362
    iput-object v6, v1, Ll/ᩴ۠ۧ;->ܺ֫:Landroid/view/View;

    .line 363
    iput-boolean v5, v1, Ll/ᩴ۠ۧ;->ۖ֫:Z

    .line 365
    iput-object v6, v1, Ll/ᩴ۠ۧ;->ܽ֫:Landroid/widget/ImageView;

    .line 366
    iput-object v6, v1, Ll/ᩴ۠ۧ;->᩹:Landroid/widget/ImageView;

    .line 367
    iput-object v6, v1, Ll/ᩴ۠ۧ;->ۡ֫:Ll/֡۠ۧ;

    .line 368
    iput-object v6, v1, Ll/ᩴ۠ۧ;->᩶:Landroid/view/View;

    .line 369
    iput-object v6, v1, Ll/ᩴ۠ۧ;->ܰ:Landroid/widget/TextView;

    .line 370
    iput-object v6, v1, Ll/ᩴ۠ۧ;->۬:Ll/۠֨ۧ;

    .line 372
    iput-object v6, v1, Ll/ᩴ۠ۧ;->ܳ֫:Landroid/widget/FrameLayout;

    .line 373
    iput-object v6, v1, Ll/ᩴ۠ۧ;->۟:Ljava/lang/Class;

    .line 374
    iput-object v6, v1, Ll/ᩴ۠ۧ;->ۜ֫:Ljava/lang/reflect/Method;

    .line 375
    iput-object v6, v1, Ll/ᩴ۠ۧ;->ۧ֫:Ljava/lang/Object;

    .line 376
    new-instance v2, Landroid/widget/ImageView;

    invoke-direct {v2, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 377
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x17

    const v5, 0x7f0800a7

    const v7, 0x7f060095

    if-lt v3, v4, :cond_0

    .line 378
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 3731
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-virtual {v3, v5, v0}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 1820
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1821
    invoke-virtual {v3, v7, v6}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_0

    .line 380
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 3731
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-virtual {v3, v5, v0}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 1825
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1826
    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 382
    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    :cond_1
    const/4 v4, 0x3

    const/4 v6, 0x1

    const v7, 0x7f0d0123

    if-eqz v2, :cond_2

    .line 404
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    sget-object v9, Ll/᩺ۘ֫;->ܿ:[I

    move/from16 v10, p3

    .line 405
    invoke-virtual {v8, v2, v9, v10, v5}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v8

    const/16 v9, 0x2a

    .line 408
    :try_start_0
    invoke-virtual {v8, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v10

    .line 409
    invoke-virtual {v8, v9, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v9

    const/16 v11, 0x16

    .line 410
    invoke-virtual {v8, v11, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    const/16 v11, 0x32

    .line 411
    invoke-virtual {v8, v11, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v11

    .line 413
    invoke-virtual {v8, v4, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    const/16 v12, 0x9

    .line 415
    invoke-virtual {v8, v12, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v12

    const/16 v13, 0xf

    .line 416
    invoke-virtual {v8, v13, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v13

    const/16 v14, 0x33

    .line 417
    invoke-virtual {v8, v14, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v14

    const/16 v15, 0x2d

    .line 418
    invoke-virtual {v8, v15, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    const/16 v15, 0x1c

    .line 419
    invoke-virtual {v8, v15, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v5

    const/16 v15, 0x26

    move/from16 p3, v4

    const/16 v4, 0x1388

    .line 421
    invoke-virtual {v8, v15, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    const/16 v15, 0xe

    move/from16 v16, v4

    const/4 v4, 0x1

    .line 423
    invoke-virtual {v8, v15, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v15

    move/from16 v17, v5

    const/4 v5, 0x4

    .line 424
    invoke-virtual {v8, v5, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    const/16 v5, 0x23

    move/from16 v18, v4

    const/4 v4, 0x0

    .line 425
    invoke-virtual {v8, v5, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v4

    .line 426
    iget-boolean v5, v1, Ll/ᩴ۠ۧ;->ᩳ֫:Z

    move/from16 v19, v4

    const/16 v4, 0x10

    .line 427
    invoke-virtual {v8, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    iput-boolean v4, v1, Ll/ᩴ۠ۧ;->ᩳ֫:Z

    const/16 v4, 0xd

    const/4 v5, 0x1

    .line 430
    invoke-virtual {v8, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 432
    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    move/from16 v8, v17

    move/from16 v5, v18

    move/from16 v18, p3

    move/from16 v17, v11

    move/from16 p3, v16

    move v11, v9

    move/from16 v16, v14

    move v9, v6

    move v14, v13

    move/from16 v6, v19

    move v13, v12

    move v12, v10

    move v10, v7

    move v7, v4

    move v4, v15

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    .line 433
    throw v0

    :cond_2
    const/4 v14, 0x1

    const/4 v15, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v7, 0x0

    const v8, 0x7f0d0123

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v16, 0x1388

    const/16 v17, 0x1

    const/16 v18, 0x1

    const/16 p3, 0x1388

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    const v10, 0x7f0d0123

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x1

    .line 436
    :goto_1
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v15

    invoke-virtual {v15, v10, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const/high16 v10, 0x40000

    .line 437
    invoke-virtual {v1, v10}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    const v10, 0x7f0a01ab

    .line 440
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Ll/ۛۚۧ;

    iput-object v10, v1, Ll/ᩴ۠ۧ;->ۗ:Ll/ۛۚۧ;

    if-eqz v10, :cond_3

    .line 1831
    invoke-virtual {v10, v8}, Ll/ۛۚۧ;->֫(I)V

    :cond_3
    const v8, 0x7f0a01cd

    .line 446
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    iput-object v8, v1, Ll/ᩴ۠ۧ;->ۢ֫:Landroid/view/View;

    if-eqz v8, :cond_4

    if-eqz v12, :cond_4

    .line 448
    invoke-virtual {v8, v11}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_4
    const/16 v8, 0x22

    const/4 v11, -0x1

    if-eqz v10, :cond_9

    if-eqz v9, :cond_9

    .line 454
    new-instance v12, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v12, v11, v11}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    const/4 v11, 0x2

    if-eq v9, v11, :cond_8

    .line 457
    const-class v11, Landroid/content/Context;

    const/4 v15, 0x3

    if-eq v9, v15, :cond_7

    const/4 v15, 0x4

    if-eq v9, v15, :cond_6

    .line 487
    new-instance v9, Landroid/view/SurfaceView;

    invoke-direct {v9, v0}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    .line 488
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v11, v8, :cond_5

    .line 489
    invoke-static {v9}, Ll/ܺ۠ۧ;->֫(Landroid/view/SurfaceView;)V

    .line 491
    :cond_5
    iput-object v9, v1, Ll/ᩴ۠ۧ;->ܺ֫:Landroid/view/View;

    goto :goto_2

    .line 478
    :cond_6
    :try_start_1
    const-class v8, Ll/ܶ᩻ۧ;

    sget v9, Ll/ܶ᩻ۧ;->᩹:I

    const/4 v9, 0x1

    new-array v15, v9, [Ljava/lang/Class;

    const/16 v19, 0x0

    aput-object v11, v15, v19

    .line 479
    invoke-virtual {v8, v15}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v8

    new-array v9, v9, [Ljava/lang/Object;

    aput-object v0, v9, v19

    invoke-virtual {v8, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/View;

    iput-object v8, v1, Ll/ᩴ۠ۧ;->ܺ֫:Landroid/view/View;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 482
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "video_decoder_gl_surface_view requires an ExoPlayer dependency"

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 465
    :cond_7
    :try_start_2
    const-class v8, Ll/᩶ۜۧ;

    sget v9, Ll/᩶ۜۧ;->ܰ:I

    const/4 v9, 0x1

    new-array v15, v9, [Ljava/lang/Class;

    const/16 v19, 0x0

    aput-object v11, v15, v19

    .line 466
    invoke-virtual {v8, v15}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v8

    new-array v9, v9, [Ljava/lang/Object;

    aput-object v0, v9, v19

    invoke-virtual {v8, v9}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/View;

    iput-object v8, v1, Ll/ᩴ۠ۧ;->ܺ֫:Landroid/view/View;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    const/4 v8, 0x1

    goto :goto_3

    :catch_1
    move-exception v0

    .line 469
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "spherical_gl_surface_view requires an ExoPlayer dependency"

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 459
    :cond_8
    new-instance v8, Landroid/view/TextureView;

    invoke-direct {v8, v0}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    iput-object v8, v1, Ll/ᩴ۠ۧ;->ܺ֫:Landroid/view/View;

    :goto_2
    const/4 v8, 0x0

    .line 494
    :goto_3
    iget-object v9, v1, Ll/ᩴ۠ۧ;->ܺ֫:Landroid/view/View;

    invoke-virtual {v9, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 498
    iget-object v9, v1, Ll/ᩴ۠ۧ;->ܺ֫:Landroid/view/View;

    invoke-virtual {v9, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 499
    iget-object v3, v1, Ll/ᩴ۠ۧ;->ܺ֫:Landroid/view/View;

    const/4 v9, 0x0

    invoke-virtual {v3, v9}, Landroid/view/View;->setClickable(Z)V

    .line 500
    iget-object v3, v1, Ll/ᩴ۠ۧ;->ܺ֫:Landroid/view/View;

    invoke-virtual {v10, v3, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    goto :goto_4

    :cond_9
    const/4 v3, 0x0

    .line 502
    iput-object v3, v1, Ll/ᩴ۠ۧ;->ܺ֫:Landroid/view/View;

    const/4 v8, 0x0

    .line 504
    :goto_4
    iput-boolean v8, v1, Ll/ᩴ۠ۧ;->ۖ֫:Z

    const v3, 0x7f0a01a3

    .line 508
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    const v3, 0x7f0a01be

    .line 511
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    iput-object v3, v1, Ll/ᩴ۠ۧ;->ܳ֫:Landroid/widget/FrameLayout;

    const v3, 0x7f0a01b7

    .line 514
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    iput-object v3, v1, Ll/ᩴ۠ۧ;->ܽ֫:Landroid/widget/ImageView;

    .line 515
    iput v14, v1, Ll/ᩴ۠ۧ;->֫֫:I

    .line 522
    :try_start_3
    const-class v3, Ll/ۘ᩶֫;

    .line 523
    const-class v8, Ll/ܺܰ֫;

    const-string v9, "\u05ab"

    const/4 v10, 0x1

    new-array v11, v10, [Ljava/lang/Class;

    const/4 v12, 0x0

    aput-object v8, v11, v12

    .line 524
    invoke-virtual {v3, v9, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    .line 527
    invoke-virtual {v8}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v11

    new-array v10, v10, [Ljava/lang/Class;

    aput-object v8, v10, v12

    new-instance v8, Ll/ۢ۠ۧ;

    invoke-direct {v8, v1}, Ll/ۢ۠ۧ;-><init>(Ll/ᩴ۠ۧ;)V

    .line 526
    invoke-static {v11, v10, v8}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v8
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_5

    :catch_2
    const/4 v3, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 541
    :goto_5
    iput-object v3, v1, Ll/ᩴ۠ۧ;->۟:Ljava/lang/Class;

    .line 542
    iput-object v9, v1, Ll/ᩴ۠ۧ;->ۜ֫:Ljava/lang/reflect/Method;

    .line 543
    iput-object v8, v1, Ll/ᩴ۠ۧ;->ۧ֫:Ljava/lang/Object;

    const v3, 0x7f0a01a4

    .line 546
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    iput-object v3, v1, Ll/ᩴ۠ۧ;->᩹:Landroid/widget/ImageView;

    if-eqz v17, :cond_a

    if-eqz v18, :cond_a

    if-eqz v3, :cond_a

    move/from16 v3, v18

    goto :goto_6

    :cond_a
    const/16 v18, 0x0

    const/4 v3, 0x0

    .line 549
    :goto_6
    iput v3, v1, Ll/ᩴ۠ۧ;->᩸:I

    if-eqz v13, :cond_b

    .line 551
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v13}, Ll/֨ۙ;->ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iput-object v3, v1, Ll/ᩴ۠ۧ;->᩺:Landroid/graphics/drawable/Drawable;

    :cond_b
    const v3, 0x7f0a01d0

    .line 555
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Ll/֡۠ۧ;

    iput-object v3, v1, Ll/ᩴ۠ۧ;->ۡ֫:Ll/֡۠ۧ;

    if-eqz v3, :cond_15

    .line 333
    invoke-virtual {v3}, Landroid/view/View;->isInEditMode()Z

    move-result v8

    const-string v9, "captioning"

    sget-object v10, Ll/᩺ۚۧ;->᩻:Ll/᩺ۚۧ;

    if-eqz v8, :cond_c

    goto/16 :goto_c

    .line 338
    :cond_c
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8, v9}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/accessibility/CaptioningManager;

    if-eqz v8, :cond_12

    .line 339
    invoke-virtual {v8}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    move-result v11

    if-eqz v11, :cond_12

    .line 340
    invoke-virtual {v8}, Landroid/view/accessibility/CaptioningManager;->getUserStyle()Landroid/view/accessibility/CaptioningManager$CaptionStyle;

    move-result-object v8

    .line 117
    new-instance v10, Ll/᩺ۚۧ;

    .line 118
    invoke-virtual {v8}, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->hasForegroundColor()Z

    move-result v11

    if-eqz v11, :cond_d

    iget v11, v8, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->foregroundColor:I

    move/from16 v18, v11

    goto :goto_7

    :cond_d
    const/4 v11, -0x1

    const/16 v18, -0x1

    .line 119
    :goto_7
    invoke-virtual {v8}, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->hasBackgroundColor()Z

    move-result v11

    if-eqz v11, :cond_e

    iget v11, v8, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->backgroundColor:I

    move/from16 v19, v11

    goto :goto_8

    :cond_e
    const/high16 v11, -0x1000000

    const/high16 v19, -0x1000000

    .line 120
    :goto_8
    invoke-virtual {v8}, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->hasWindowColor()Z

    move-result v11

    if-eqz v11, :cond_f

    iget v11, v8, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->windowColor:I

    move/from16 v20, v11

    goto :goto_9

    :cond_f
    const/4 v11, 0x0

    const/16 v20, 0x0

    .line 121
    :goto_9
    invoke-virtual {v8}, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->hasEdgeType()Z

    move-result v11

    if-eqz v11, :cond_10

    iget v11, v8, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->edgeType:I

    move/from16 v21, v11

    goto :goto_a

    :cond_10
    const/4 v11, 0x0

    const/16 v21, 0x0

    .line 122
    :goto_a
    invoke-virtual {v8}, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->hasEdgeColor()Z

    move-result v11

    if-eqz v11, :cond_11

    iget v11, v8, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->edgeColor:I

    move/from16 v22, v11

    goto :goto_b

    :cond_11
    const/4 v11, -0x1

    const/16 v22, -0x1

    .line 123
    :goto_b
    invoke-virtual {v8}, Landroid/view/accessibility/CaptioningManager$CaptionStyle;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v23

    move-object/from16 v17, v10

    invoke-direct/range {v17 .. v23}, Ll/᩺ۚۧ;-><init>(IIIIILandroid/graphics/Typeface;)V

    .line 293
    :cond_12
    :goto_c
    invoke-virtual {v3, v10}, Ll/֡۠ۧ;->֫(Ll/᩺ۚۧ;)V

    .line 321
    invoke-virtual {v3}, Landroid/view/View;->isInEditMode()Z

    move-result v8

    const/high16 v10, 0x3f800000    # 1.0f

    if-eqz v8, :cond_13

    goto :goto_d

    .line 326
    :cond_13
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8, v9}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/accessibility/CaptioningManager;

    if-eqz v8, :cond_14

    .line 327
    invoke-virtual {v8}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    move-result v9

    if-eqz v9, :cond_14

    .line 328
    invoke-virtual {v8}, Landroid/view/accessibility/CaptioningManager;->getFontScale()F

    move-result v10

    :cond_14
    :goto_d
    const v8, 0x3d5a511a    # 0.0533f

    mul-float v10, v10, v8

    .line 226
    invoke-virtual {v3, v10}, Ll/֡۠ۧ;->֫(F)V

    :cond_15
    const v3, 0x7f0a01a8

    .line 562
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, v1, Ll/ᩴ۠ۧ;->᩶:Landroid/view/View;

    const/16 v8, 0x8

    if-eqz v3, :cond_16

    .line 564
    invoke-virtual {v3, v8}, Landroid/view/View;->setVisibility(I)V

    .line 566
    :cond_16
    iput v6, v1, Ll/ᩴ۠ۧ;->᩷֫:I

    const v3, 0x7f0a01b0

    .line 569
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, v1, Ll/ᩴ۠ۧ;->ܰ:Landroid/widget/TextView;

    if-eqz v3, :cond_17

    .line 571
    invoke-virtual {v3, v8}, Landroid/view/View;->setVisibility(I)V

    :cond_17
    const v3, 0x7f0a01ac

    .line 575
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Ll/۠֨ۧ;

    const v8, 0x7f0a01ad

    .line 576
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    if-eqz v6, :cond_18

    .line 578
    iput-object v6, v1, Ll/ᩴ۠ۧ;->۬:Ll/۠֨ۧ;

    goto :goto_e

    :cond_18
    if-eqz v8, :cond_19

    .line 582
    new-instance v6, Ll/۠֨ۧ;

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct {v6, v0, v9, v10, v2}, Ll/۠֨ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;)V

    iput-object v6, v1, Ll/ᩴ۠ۧ;->۬:Ll/۠֨ۧ;

    .line 583
    invoke-virtual {v6, v3}, Landroid/view/View;->setId(I)V

    .line 584
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 585
    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 586
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v2

    .line 587
    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 588
    invoke-virtual {v0, v6, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    goto :goto_e

    :cond_19
    const/4 v0, 0x0

    .line 590
    iput-object v0, v1, Ll/ᩴ۠ۧ;->۬:Ll/۠֨ۧ;

    .line 592
    :goto_e
    iget-object v0, v1, Ll/ᩴ۠ۧ;->۬:Ll/۠֨ۧ;

    if-eqz v0, :cond_1a

    move/from16 v2, p3

    goto :goto_f

    :cond_1a
    const/4 v2, 0x0

    :goto_f
    iput v2, v1, Ll/ᩴ۠ۧ;->ۨ:I

    .line 593
    iput-boolean v4, v1, Ll/ᩴ۠ۧ;->ۛ:Z

    .line 594
    iput-boolean v5, v1, Ll/ᩴ۠ۧ;->۫:Z

    .line 595
    iput-boolean v7, v1, Ll/ᩴ۠ۧ;->ۤ:Z

    if-eqz v16, :cond_1b

    if-eqz v0, :cond_1b

    const/4 v2, 0x1

    goto :goto_10

    :cond_1b
    const/4 v2, 0x0

    .line 596
    :goto_10
    iput-boolean v2, v1, Ll/ᩴ۠ۧ;->ۘ֫:Z

    if-eqz v0, :cond_1c

    .line 598
    invoke-virtual {v0}, Ll/۠֨ۧ;->ܽ()V

    .line 599
    iget-object v0, v1, Ll/ᩴ۠ۧ;->۬:Ll/۠֨ۧ;

    iget-object v2, v1, Ll/ᩴ۠ۧ;->ۙ:Ll/ۖ۠ۧ;

    invoke-virtual {v0, v2}, Ll/۠֨ۧ;->֫(Ll/֨֨ۧ;)V

    :cond_1c
    if-eqz v16, :cond_1d

    const/4 v0, 0x1

    .line 602
    invoke-virtual {v1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 604
    :cond_1d
    invoke-direct/range {p0 .. p0}, Ll/ᩴ۠ۧ;->ᩴ()V

    return-void
.end method

.method private ֡()Z
    .locals 1
    .annotation runtime Lorg/checkerframework/checker/nullness/qual/EnsuresNonNullIf;
        expression = {
            "controller"
        }
        result = true
    .end annotation

    .line 1490
    iget-boolean v0, p0, Ll/ᩴ۠ۧ;->ۘ֫:Z

    if-eqz v0, :cond_0

    .line 1491
    iget-object v0, p0, Ll/ᩴ۠ۧ;->۬:Ll/۠֨ۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static ֫(Ll/ᩴ۠ۧ;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 1734
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 1679
    iget-object p1, p0, Ll/ᩴ۠ۧ;->ܽ֫:Landroid/widget/ImageView;

    if-nez p1, :cond_0

    goto :goto_0

    .line 1682
    :cond_0
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1683
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->᩵()V

    .line 1663
    :goto_0
    iget-object v0, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    if-eqz v0, :cond_1

    const/16 v1, 0x1e

    .line 1665
    invoke-interface {v0, v1}, Ll/֨᩵֫;->ۧ(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1666
    invoke-interface {v0}, Ll/֨᩵֫;->ۘ()Ll/ܰ᩵֫;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ll/ܰ᩵֫;->ۧ(I)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x0

    if-eqz p1, :cond_2

    .line 1720
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1721
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->᩵()V

    .line 1743
    :cond_2
    iget-object p0, p0, Ll/ᩴ۠ۧ;->ۢ֫:Landroid/view/View;

    if-eqz p0, :cond_3

    .line 1744
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    return-void
.end method

.method public static ֫(Ll/ᩴ۠ۧ;Ljava/lang/reflect/Method;[Ljava/lang/Object;)V
    .locals 2

    .line 530
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "onImageAvailable"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 531
    aget-object p1, p2, p1

    check-cast p1, Landroid/graphics/Bitmap;

    .line 1732
    iget-object p2, p0, Ll/ᩴ۠ۧ;->ܿ֫:Landroid/os/Handler;

    new-instance v0, Ll/ۡ۠ۧ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, Ll/ۡ۠ۧ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method private ֫(Landroid/graphics/drawable/Drawable;)Z
    .locals 6

    const/4 v0, 0x0

    .line 1627
    iget-object v1, p0, Ll/ᩴ۠ۧ;->᩹:Landroid/widget/ImageView;

    if-eqz v1, :cond_2

    if-eqz p1, :cond_2

    .line 1628
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    .line 1629
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    if-lez v2, :cond_2

    if-lez v3, :cond_2

    int-to-float v2, v2

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 1632
    sget-object v3, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    .line 1633
    iget v4, p0, Ll/ᩴ۠ۧ;->᩸:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_0

    .line 1634
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    .line 1635
    sget-object v3, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 1457
    :cond_0
    iget-object v4, p0, Ll/ᩴ۠ۧ;->ۗ:Ll/ۛۚۧ;

    if-eqz v4, :cond_1

    .line 1458
    invoke-virtual {v4, v2}, Ll/ۛۚۧ;->֫(F)V

    .line 1638
    :cond_1
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 1639
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1640
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 p1, 0x1

    return p1

    :cond_2
    return v0
.end method

.method public static bridge synthetic ֫(Ll/ᩴ۠ۧ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ᩴ۠ۧ;->ۤ:Z

    return p0
.end method

.method private ۖ()V
    .locals 4

    .line 1800
    iget-object v0, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/֨᩵֫;->ۤ()Ll/ۜ֡֫;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Ll/ۜ֡֫;->ᩳ:Ll/ۜ֡֫;

    .line 1801
    :goto_0
    iget v1, v0, Ll/ۜ֡֫;->ܽ:I

    .line 1802
    iget v2, v0, Ll/ۜ֡֫;->֫:I

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    int-to-float v1, v1

    .line 1804
    iget v0, v0, Ll/ۜ֡֫;->ۧ:F

    mul-float v1, v1, v0

    int-to-float v0, v2

    div-float/2addr v1, v0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v1, 0x0

    .line 1806
    :goto_2
    iget-boolean v0, p0, Ll/ᩴ۠ۧ;->ۖ֫:Z

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    move v3, v1

    .line 1457
    :goto_3
    iget-object v0, p0, Ll/ᩴ۠ۧ;->ۗ:Ll/ۛۚۧ;

    if-eqz v0, :cond_4

    .line 1458
    invoke-virtual {v0, v3}, Ll/ۛۚۧ;->֫(F)V

    :cond_4
    return-void
.end method

.method public static bridge synthetic ۖ(Ll/ᩴ۠ۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->ᩴ()V

    return-void
.end method

.method private ۘ()V
    .locals 5

    .line 1749
    iget-object v0, p0, Ll/ᩴ۠ۧ;->᩶:Landroid/view/View;

    if-eqz v0, :cond_3

    .line 1750
    iget-object v1, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 1752
    invoke-interface {v1}, Ll/֨᩵֫;->ᩳ()I

    move-result v1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    iget v4, p0, Ll/ᩴ۠ۧ;->᩷֫:I

    if-eq v4, v3, :cond_1

    if-ne v4, v1, :cond_0

    iget-object v3, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    .line 1754
    invoke-interface {v3}, Ll/֨᩵֫;->᩶()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const/16 v2, 0x8

    .line 1755
    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    return-void
.end method

.method public static ۘ(Ll/ᩴ۠ۧ;)V
    .locals 1

    .line 1792
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ᩴ۠ۧ;->ۤ:Z

    if-eqz v0, :cond_0

    .line 1793
    invoke-virtual {p0}, Ll/ᩴ۠ۧ;->ᩳ()V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1795
    invoke-direct {p0, v0}, Ll/ᩴ۠ۧ;->ܽ(Z)V

    return-void
.end method

.method public static ۜ(Ll/ᩴ۠ۧ;)V
    .locals 1

    .line 1726
    iget-object p0, p0, Ll/ᩴ۠ۧ;->ܽ֫:Landroid/widget/ImageView;

    if-eqz p0, :cond_0

    const/4 v0, 0x4

    .line 1727
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method private ۜ()Z
    .locals 2

    .line 1655
    iget-object v0, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    if-eqz v0, :cond_0

    .line 1656
    iget-object v1, p0, Ll/ᩴ۠ۧ;->ۧ֫:Ljava/lang/Object;

    if-eqz v1, :cond_0

    const/16 v1, 0x1e

    .line 1658
    invoke-interface {v0, v1}, Ll/֨᩵֫;->ۧ(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1659
    invoke-interface {v0}, Ll/֨᩵֫;->ۘ()Ll/ܰ᩵֫;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Ll/ܰ᩵֫;->ۧ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static bridge synthetic ۡ(Ll/ᩴ۠ۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->ۖ()V

    return-void
.end method

.method private ۡ()Z
    .locals 4

    .line 1532
    iget-object v0, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 1535
    :cond_0
    invoke-interface {v0}, Ll/֨᩵֫;->ᩳ()I

    move-result v0

    .line 1536
    iget-boolean v2, p0, Ll/ᩴ۠ۧ;->۫:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    const/16 v3, 0x11

    .line 1537
    invoke-interface {v2, v3}, Ll/֨᩵֫;->ۧ(I)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    .line 1538
    invoke-interface {v2}, Ll/֨᩵֫;->ۚ()Ll/ۙ᩵֫;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۙ᩵֫;->ܽ()Z

    move-result v2

    if-nez v2, :cond_3

    :cond_1
    if-eq v0, v1, :cond_2

    const/4 v2, 0x4

    if-eq v0, v2, :cond_2

    iget-object v0, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1541
    invoke-interface {v0}, Ll/֨᩵֫;->᩶()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    return v1

    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public static bridge synthetic ۢ(Ll/ᩴ۠ۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->ܺ()V

    return-void
.end method

.method private ۢ()Z
    .locals 2

    .line 1553
    iget-object v0, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    if-eqz v0, :cond_0

    const/16 v1, 0x10

    .line 1554
    invoke-interface {v0, v1}, Ll/֨᩵֫;->ۧ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    .line 1555
    invoke-interface {v0}, Ll/֨᩵֫;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    .line 1556
    invoke-interface {v0}, Ll/֨᩵֫;->᩶()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static bridge synthetic ۧ(Ll/ᩴ۠ۧ;)Ll/֨᩵֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ᩴ۠ۧ;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->ۜ()Z

    move-result p0

    return p0
.end method

.method private ܺ()V
    .locals 2

    .line 1506
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->֡()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    if-nez v0, :cond_0

    goto :goto_0

    .line 1509
    :cond_0
    iget-object v0, p0, Ll/ᩴ۠ۧ;->۬:Ll/۠֨ۧ;

    invoke-virtual {v0}, Ll/۠֨ۧ;->ᩳ()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x1

    .line 1510
    invoke-direct {p0, v0}, Ll/ᩴ۠ۧ;->ܽ(Z)V

    return-void

    .line 1511
    :cond_1
    iget-boolean v1, p0, Ll/ᩴ۠ۧ;->ۛ:Z

    if-eqz v1, :cond_2

    .line 1512
    invoke-virtual {v0}, Ll/۠֨ۧ;->ۧ()V

    :cond_2
    :goto_0
    return-void
.end method

.method public static bridge synthetic ܺ(Ll/ᩴ۠ۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->ۘ()V

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ᩴ۠ۧ;)Landroid/view/View;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ۠ۧ;->ۢ֫:Landroid/view/View;

    return-object p0
.end method

.method private ܽ(Z)V
    .locals 4

    .line 1518
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ᩴ۠ۧ;->ۤ:Z

    if-eqz v0, :cond_0

    goto :goto_2

    .line 1521
    :cond_0
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->֡()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1523
    iget-object v0, p0, Ll/ᩴ۠ۧ;->۬:Ll/۠֨ۧ;

    invoke-virtual {v0}, Ll/۠֨ۧ;->ᩳ()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ll/۠֨ۧ;->֫()I

    move-result v1

    if-gtz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 1524
    :goto_0
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->ۡ()Z

    move-result v3

    if-nez p1, :cond_2

    if-nez v1, :cond_2

    if-eqz v3, :cond_5

    .line 1545
    :cond_2
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->֡()Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    if-eqz v3, :cond_4

    goto :goto_1

    .line 1548
    :cond_4
    iget v2, p0, Ll/ᩴ۠ۧ;->ۨ:I

    :goto_1
    invoke-virtual {v0, v2}, Ll/۠֨ۧ;->֫(I)V

    .line 1549
    invoke-virtual {v0}, Ll/۠֨ۧ;->᩷()V

    :cond_5
    :goto_2
    return-void
.end method

.method public static bridge synthetic ܿ(Ll/ᩴ۠ۧ;)Landroid/view/View;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ۠ۧ;->ܺ֫:Landroid/view/View;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ᩴ۠ۧ;)Ll/֡۠ۧ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ۠ۧ;->ۡ֫:Ll/֡۠ۧ;

    return-object p0
.end method

.method private ᩳ(Z)V
    .locals 10

    .line 1560
    iget-object v0, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    const/16 v1, 0x1e

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    .line 1565
    invoke-interface {v0, v1}, Ll/֨᩵֫;->ۧ(I)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 1566
    invoke-interface {v0}, Ll/֨᩵֫;->ۘ()Ll/ܰ᩵֫;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܰ᩵֫;->ۧ()Z

    move-result v4

    if-nez v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 1567
    :goto_0
    iget-boolean v5, p0, Ll/ᩴ۠ۧ;->ᩳ֫:Z

    const v6, 0x106000d

    const/4 v7, 0x4

    iget-object v8, p0, Ll/ᩴ۠ۧ;->᩹:Landroid/widget/ImageView;

    iget-object v9, p0, Ll/ᩴ۠ۧ;->ۢ֫:Landroid/view/View;

    if-nez v5, :cond_4

    if-eqz v4, :cond_1

    if-eqz p1, :cond_4

    :cond_1
    if-eqz v8, :cond_2

    .line 1649
    invoke-virtual {v8, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1650
    invoke-virtual {v8, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_2
    if-eqz v9, :cond_3

    .line 1744
    invoke-virtual {v9, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1570
    :cond_3
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->᩷()V

    :cond_4
    if-nez v4, :cond_5

    goto/16 :goto_6

    .line 1663
    :cond_5
    iget-object p1, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    if-eqz p1, :cond_6

    .line 1665
    invoke-interface {p1, v1}, Ll/֨᩵֫;->ۧ(I)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 1666
    invoke-interface {p1}, Ll/֨᩵֫;->ۘ()Ll/ܰ᩵֫;

    move-result-object p1

    const/4 v1, 0x2

    invoke-virtual {p1, v1}, Ll/ܰ᩵֫;->ۧ(I)Z

    move-result p1

    if-eqz p1, :cond_6

    const/4 p1, 0x1

    goto :goto_1

    :cond_6
    const/4 p1, 0x0

    .line 1578
    :goto_1
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->ۜ()Z

    move-result v1

    if-nez p1, :cond_8

    if-nez v1, :cond_8

    if-eqz v9, :cond_7

    .line 1744
    invoke-virtual {v9, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1585
    :cond_7
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->᩷()V

    .line 1589
    :cond_8
    iget-object v4, p0, Ll/ᩴ۠ۧ;->ܽ֫:Landroid/widget/ImageView;

    if-eqz v9, :cond_a

    .line 1590
    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    move-result v5

    if-ne v5, v7, :cond_a

    if-nez v4, :cond_9

    goto :goto_2

    .line 1673
    :cond_9
    invoke-virtual {v4}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-eqz v5, :cond_a

    .line 1675
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getAlpha()I

    move-result v5

    if-eqz v5, :cond_a

    goto :goto_3

    :cond_a
    :goto_2
    const/4 v2, 0x0

    :goto_3
    if-eqz v1, :cond_c

    if-nez p1, :cond_c

    if-eqz v2, :cond_c

    if-eqz v9, :cond_b

    .line 1744
    invoke-virtual {v9, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_b
    if-eqz v4, :cond_d

    .line 1720
    invoke-virtual {v4, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1721
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->᩵()V

    goto :goto_4

    :cond_c
    if-eqz p1, :cond_d

    if-nez v1, :cond_d

    if-eqz v2, :cond_d

    .line 1595
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->᩷()V

    :cond_d
    :goto_4
    if-nez p1, :cond_12

    if-nez v1, :cond_12

    .line 1498
    iget p1, p0, Ll/ᩴ۠ۧ;->᩸:I

    if-eqz p1, :cond_12

    .line 1499
    invoke-static {v8}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    if-eqz v0, :cond_10

    const/16 p1, 0x12

    .line 1613
    invoke-interface {v0, p1}, Ll/֨᩵֫;->ۧ(I)Z

    move-result p1

    if-nez p1, :cond_e

    goto :goto_5

    .line 1616
    :cond_e
    invoke-interface {v0}, Ll/֨᩵֫;->ܿ֫()Ll/ܿ᩵֫;

    move-result-object p1

    .line 1617
    iget-object p1, p1, Ll/ܿ᩵֫;->ᩳ:[B

    if-nez p1, :cond_f

    goto :goto_5

    .line 1620
    :cond_f
    array-length v0, p1

    .line 1621
    invoke-static {p1, v3, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 1623
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-direct {p0, v0}, Ll/ᩴ۠ۧ;->֫(Landroid/graphics/drawable/Drawable;)Z

    move-result v3

    :cond_10
    :goto_5
    if-eqz v3, :cond_11

    goto :goto_6

    .line 1604
    :cond_11
    iget-object p1, p0, Ll/ᩴ۠ۧ;->᩺:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, p1}, Ll/ᩴ۠ۧ;->֫(Landroid/graphics/drawable/Drawable;)Z

    move-result p1

    if-eqz p1, :cond_12

    goto :goto_6

    :cond_12
    if-eqz v8, :cond_13

    .line 1649
    invoke-virtual {v8, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1650
    invoke-virtual {v8, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_13
    :goto_6
    return-void
.end method

.method private ᩴ()V
    .locals 3

    const/4 v0, 0x0

    .line 1778
    iget-object v1, p0, Ll/ᩴ۠ۧ;->۬:Ll/۠֨ۧ;

    if-eqz v1, :cond_3

    iget-boolean v2, p0, Ll/ᩴ۠ۧ;->ۘ֫:Z

    if-nez v2, :cond_0

    goto :goto_0

    .line 1780
    :cond_0
    invoke-virtual {v1}, Ll/۠֨ۧ;->ᩳ()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1782
    iget-boolean v1, p0, Ll/ᩴ۠ۧ;->ۛ:Z

    if-eqz v1, :cond_1

    .line 1783
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f120320

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 1781
    :cond_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    .line 1787
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f12032e

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 1786
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    .line 1779
    :cond_3
    :goto_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static ᩴ(Ll/ᩴ۠ۧ;)V
    .locals 1

    .line 1760
    iget-object v0, p0, Ll/ᩴ۠ۧ;->ܰ:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 1766
    iget-object p0, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ll/֨᩵֫;->ۖ()Ll/ᩳ᩶֫;

    :cond_0
    const/16 p0, 0x8

    .line 1772
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method private ᩵()V
    .locals 5

    .line 1687
    iget-object v0, p0, Ll/ᩴ۠ۧ;->ܽ֫:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    goto :goto_0

    .line 1690
    :cond_0
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 1694
    :cond_1
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    .line 1695
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    if-lez v2, :cond_5

    if-gtz v1, :cond_2

    goto :goto_0

    :cond_2
    int-to-float v2, v2

    int-to-float v1, v1

    div-float/2addr v2, v1

    .line 1700
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    .line 1701
    iget v3, p0, Ll/ᩴ۠ۧ;->֫֫:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_3

    .line 1702
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float v2, v1, v2

    .line 1703
    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 1705
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_4

    .line 1457
    iget-object v3, p0, Ll/ᩴ۠ۧ;->ۗ:Ll/ۛۚۧ;

    if-eqz v3, :cond_4

    .line 1458
    invoke-virtual {v3, v2}, Ll/ۛۚۧ;->֫(F)V

    .line 1708
    :cond_4
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public static bridge synthetic ᩵(Ll/ᩴ۠ۧ;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-direct {p0, v0}, Ll/ᩴ۠ۧ;->ᩳ(Z)V

    return-void
.end method

.method private ᩷()V
    .locals 2

    .line 1726
    iget-object v0, p0, Ll/ᩴ۠ۧ;->ܽ֫:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    const/4 v1, 0x4

    .line 1727
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_0
    if-eqz v0, :cond_1

    const v1, 0x106000d

    .line 1714
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1
    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ᩴ۠ۧ;)Z
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->ۢ()Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic ᩻(Ll/ᩴ۠ۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->᩷()V

    return-void
.end method


# virtual methods
.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1811
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 5

    .line 937
    iget-object v0, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    if-eqz v0, :cond_0

    const/16 v1, 0x10

    .line 938
    invoke-interface {v0, v1}, Ll/֨᩵֫;->ۧ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    .line 939
    invoke-interface {v0}, Ll/֨᩵֫;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 940
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    .line 943
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x13

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_2

    const/16 v1, 0x10e

    if-eq v0, v1, :cond_2

    const/16 v1, 0x16

    if-eq v0, v1, :cond_2

    const/16 v1, 0x10f

    if-eq v0, v1, :cond_2

    const/16 v1, 0x14

    if-eq v0, v1, :cond_2

    const/16 v1, 0x10d

    if-eq v0, v1, :cond_2

    const/16 v1, 0x15

    if-eq v0, v1, :cond_2

    const/16 v1, 0x10c

    if-eq v0, v1, :cond_2

    const/16 v1, 0x17

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 945
    :goto_1
    iget-object v1, p0, Ll/ᩴ۠ۧ;->۬:Ll/۠֨ۧ;

    if-eqz v0, :cond_3

    invoke-direct {p0}, Ll/ᩴ۠ۧ;->֡()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v1}, Ll/۠֨ۧ;->ᩳ()Z

    move-result v4

    if-nez v4, :cond_3

    .line 947
    invoke-direct {p0, v3}, Ll/ᩴ۠ۧ;->ܽ(Z)V

    return v3

    .line 970
    :cond_3
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->֡()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v1, p1}, Ll/۠֨ۧ;->֫(Landroid/view/KeyEvent;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    .line 949
    :cond_4
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 952
    :goto_2
    invoke-direct {p0, v3}, Ll/ᩴ۠ۧ;->ܽ(Z)V

    return v3

    :cond_5
    if-eqz v0, :cond_6

    .line 954
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->֡()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 956
    invoke-direct {p0, v3}, Ll/ᩴ۠ۧ;->ܽ(Z)V

    :cond_6
    return v2
.end method

.method public final onTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1414
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->֡()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    .line 1417
    invoke-direct {p0, p1}, Ll/ᩴ۠ۧ;->ܽ(Z)V

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final performClick()Z
    .locals 1

    .line 1408
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->ܺ()V

    .line 1409
    invoke-super {p0}, Landroid/widget/FrameLayout;->performClick()Z

    move-result v0

    return v0
.end method

.method public final setVisibility(I)V
    .locals 2

    .line 728
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 729
    iget-object v0, p0, Ll/ᩴ۠ۧ;->ܺ֫:Landroid/view/View;

    instance-of v1, v0, Landroid/view/SurfaceView;

    if-eqz v1, :cond_0

    .line 731
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public final ֫()Landroid/widget/FrameLayout;
    .locals 1

    .line 1391
    iget-object v0, p0, Ll/ᩴ۠ۧ;->ܳ֫:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 742
    iget-object v0, p0, Ll/ᩴ۠ۧ;->ۗ:Ll/ۛۚۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 743
    invoke-virtual {v0, p1}, Ll/ۛۚۧ;->֫(I)V

    return-void
.end method

.method public final ֫(Ll/֨᩵֫;)V
    .locals 10

    .line 652
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    if-eqz p1, :cond_2

    .line 654
    invoke-interface {p1}, Ll/֨᩵֫;->֨()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v0, 0x1

    .line 653
    :goto_2
    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    .line 655
    iget-object v0, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    if-ne v0, p1, :cond_3

    return-void

    :cond_3
    const/4 v1, 0x0

    .line 660
    iget-object v4, p0, Ll/ᩴ۠ۧ;->ۜ֫:Ljava/lang/reflect/Method;

    iget-object v5, p0, Ll/ᩴ۠ۧ;->۟:Ljava/lang/Class;

    iget-object v6, p0, Ll/ᩴ۠ۧ;->ܺ֫:Landroid/view/View;

    const/16 v7, 0x1b

    iget-object v8, p0, Ll/ᩴ۠ۧ;->ۙ:Ll/ۖ۠ۧ;

    if-eqz v0, :cond_6

    .line 661
    invoke-interface {v0, v8}, Ll/֨᩵֫;->֫(Ll/֡᩵֫;)V

    .line 662
    invoke-interface {v0, v7}, Ll/֨᩵֫;->ۧ(I)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 663
    instance-of v9, v6, Landroid/view/TextureView;

    if-eqz v9, :cond_4

    .line 664
    move-object v9, v6

    check-cast v9, Landroid/view/TextureView;

    invoke-interface {v0, v9}, Ll/֨᩵֫;->ۧ(Landroid/view/TextureView;)V

    goto :goto_3

    .line 665
    :cond_4
    instance-of v9, v6, Landroid/view/SurfaceView;

    if-eqz v9, :cond_5

    .line 666
    move-object v9, v6

    check-cast v9, Landroid/view/SurfaceView;

    invoke-interface {v0, v9}, Ll/֨᩵֫;->ۧ(Landroid/view/SurfaceView;)V

    :cond_5
    :goto_3
    if-eqz v5, :cond_6

    .line 717
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 155
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-array v9, v3, [Ljava/lang/Object;

    aput-object v1, v9, v2

    .line 719
    invoke-virtual {v4, v0, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception p1

    goto :goto_4

    :catch_1
    move-exception p1

    .line 721
    :goto_4
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 671
    :cond_6
    :goto_5
    iget-object v0, p0, Ll/ᩴ۠ۧ;->ۡ֫:Ll/֡۠ۧ;

    if-eqz v0, :cond_7

    .line 672
    invoke-virtual {v0, v1}, Ll/֡۠ۧ;->֫(Ljava/util/List;)V

    .line 674
    :cond_7
    iput-object p1, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    .line 675
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->֡()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 676
    iget-object v1, p0, Ll/ᩴ۠ۧ;->۬:Ll/۠֨ۧ;

    invoke-virtual {v1, p1}, Ll/۠֨ۧ;->֫(Ll/֨᩵֫;)V

    .line 678
    :cond_8
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->ۘ()V

    .line 1760
    iget-object v1, p0, Ll/ᩴ۠ۧ;->ܰ:Landroid/widget/TextView;

    if-eqz v1, :cond_a

    .line 1766
    iget-object v9, p0, Ll/ᩴ۠ۧ;->᩻֫:Ll/֨᩵֫;

    if-eqz v9, :cond_9

    invoke-interface {v9}, Ll/֨᩵֫;->ۖ()Ll/ᩳ᩶֫;

    :cond_9
    const/16 v9, 0x8

    .line 1772
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 680
    :cond_a
    invoke-direct {p0, v3}, Ll/ᩴ۠ۧ;->ᩳ(Z)V

    if-eqz p1, :cond_11

    .line 682
    move-object v1, p1

    check-cast v1, Ll/ܳᩴ֫;

    invoke-virtual {v1, v7}, Ll/ܳᩴ֫;->ۧ(I)Z

    move-result v7

    if-eqz v7, :cond_e

    .line 683
    instance-of v7, v6, Landroid/view/TextureView;

    if-eqz v7, :cond_b

    .line 684
    check-cast v6, Landroid/view/TextureView;

    invoke-interface {p1, v6}, Ll/֨᩵֫;->֫(Landroid/view/TextureView;)V

    goto :goto_6

    .line 685
    :cond_b
    instance-of v7, v6, Landroid/view/SurfaceView;

    if-eqz v7, :cond_c

    .line 686
    check-cast v6, Landroid/view/SurfaceView;

    invoke-interface {p1, v6}, Ll/֨᩵֫;->֫(Landroid/view/SurfaceView;)V

    :cond_c
    :goto_6
    const/16 v6, 0x1e

    .line 688
    invoke-virtual {v1, v6}, Ll/ܳᩴ֫;->ۧ(I)Z

    move-result v6

    if-eqz v6, :cond_d

    .line 689
    invoke-interface {p1}, Ll/֨᩵֫;->ۘ()Ll/ܰ᩵֫;

    move-result-object v6

    invoke-virtual {v6}, Ll/ܰ᩵֫;->ܽ()Z

    move-result v6

    if-eqz v6, :cond_e

    .line 691
    :cond_d
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->ۖ()V

    :cond_e
    if-eqz v0, :cond_f

    const/16 v6, 0x1c

    .line 694
    invoke-virtual {v1, v6}, Ll/ܳᩴ֫;->ۧ(I)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 695
    invoke-interface {p1}, Ll/֨᩵֫;->ᩴ()Ll/ۙ֡֫;

    move-result-object v1

    iget-object v1, v1, Ll/ۙ֡֫;->֫:Ll/ܳ۬ܺ;

    invoke-virtual {v0, v1}, Ll/֡۠ۧ;->֫(Ljava/util/List;)V

    .line 697
    :cond_f
    invoke-interface {p1, v8}, Ll/֨᩵֫;->ۧ(Ll/֡᩵֫;)V

    if-eqz v5, :cond_10

    .line 706
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 155
    :try_start_1
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 708
    iget-object v0, p0, Ll/ᩴ۠ۧ;->ۧ֫:Ljava/lang/Object;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-array v1, v3, [Ljava/lang/Object;

    aput-object v0, v1, v2

    .line 708
    invoke-virtual {v4, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_8

    :catch_2
    move-exception p1

    goto :goto_7

    :catch_3
    move-exception p1

    .line 710
    :goto_7
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 699
    :cond_10
    :goto_8
    invoke-direct {p0, v2}, Ll/ᩴ۠ۧ;->ܽ(Z)V

    return-void

    .line 701
    :cond_11
    invoke-virtual {p0}, Ll/ᩴ۠ۧ;->ᩳ()V

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 1205
    iget-object v0, p0, Ll/ᩴ۠ۧ;->۬:Ll/۠֨ۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 1206
    invoke-virtual {v0, p1}, Ll/۠֨ۧ;->֫(Z)V

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 749
    iget-object v0, p0, Ll/ᩴ۠ۧ;->ۗ:Ll/ۛۚۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 750
    invoke-virtual {v0}, Ll/ۛۚۧ;->֫()I

    move-result v0

    return v0
.end method

.method public final ۧ(Z)V
    .locals 1

    .line 1194
    iget-object v0, p0, Ll/ᩴ۠ۧ;->۬:Ll/۠֨ۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 1195
    invoke-virtual {v0, p1}, Ll/۠֨ۧ;->ۧ(Z)V

    return-void
.end method

.method public final ܳ()V
    .locals 1

    .line 1103
    iget-object v0, p0, Ll/ᩴ۠ۧ;->۬:Ll/۠֨ۧ;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    .line 1104
    invoke-virtual {v0}, Ll/۠֨ۧ;->ۜ()V

    return-void
.end method

.method public final ܽ()Ll/֡۠ۧ;
    .locals 1

    .line 1403
    iget-object v0, p0, Ll/ᩴ۠ۧ;->ۡ֫:Ll/֡۠ۧ;

    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 976
    iget-object v0, p0, Ll/ᩴ۠ۧ;->۬:Ll/۠֨ۧ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۠֨ۧ;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()V
    .locals 1

    .line 994
    iget-object v0, p0, Ll/ᩴ۠ۧ;->۬:Ll/۠֨ۧ;

    if-eqz v0, :cond_0

    .line 995
    invoke-virtual {v0}, Ll/۠֨ۧ;->ۧ()V

    :cond_0
    return-void
.end method

.method public final ᩻()V
    .locals 2

    .line 988
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->ۡ()Z

    move-result v0

    .line 1545
    invoke-direct {p0}, Ll/ᩴ۠ۧ;->֡()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    .line 1548
    :cond_1
    iget v0, p0, Ll/ᩴ۠ۧ;->ۨ:I

    :goto_0
    iget-object v1, p0, Ll/ᩴ۠ۧ;->۬:Ll/۠֨ۧ;

    invoke-virtual {v1, v0}, Ll/۠֨ۧ;->֫(I)V

    .line 1549
    invoke-virtual {v1}, Ll/۠֨ۧ;->᩷()V

    return-void
.end method
