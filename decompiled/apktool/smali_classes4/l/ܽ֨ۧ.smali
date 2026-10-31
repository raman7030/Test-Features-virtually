.class public Ll/ܽ֨ۧ;
.super Landroid/widget/FrameLayout;
.source "38GQ"


# static fields
.field public static final synthetic ᩶֫:I


# instance fields
.field public final ֡֫:Ljava/lang/String;

.field public final ֨֫:Ll/۠۠ۧ;

.field public final ֫֫:Landroid/graphics/drawable/Drawable;

.field public ۖ֫:Z

.field public final ۗ:Ljava/util/Formatter;

.field public ۘ֫:I

.field public final ۙ:Ljava/lang/StringBuilder;

.field public final ۚ֫:Landroid/graphics/drawable/Drawable;

.field public final ۛ:Landroid/view/View;

.field public ۜ֫:Z

.field public final ۟:Landroid/view/View;

.field public ۠֫:I

.field public ۡ֫:Z

.field public ۢ֫:Z

.field public ۤ:Z

.field public final ۧ֫:Ljava/lang/String;

.field public final ۨ:Landroid/view/View;

.field public ۫:J

.field public final ۬:Ll/ۘۢܳ;

.field public final ܰ:Landroid/widget/TextView;

.field public ܳ֫:I

.field public final ܶ֫:Ll/ۚ᩸ۢ;

.field public ܺ֫:Z

.field public final ܽ֫:Landroid/graphics/drawable/Drawable;

.field public final ܿ֫:Landroid/widget/ImageView;

.field public final ᩳ֫:Landroid/graphics/drawable/Drawable;

.field public final ᩴ֫:Landroid/widget/ImageView;

.field public final ᩵֫:Landroid/graphics/drawable/Drawable;

.field public final ᩶:Landroid/view/View;

.field public ᩷֫:Z

.field public final ᩸:F

.field public final ᩸֫:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public ᩹:J

.field public final ᩹֫:Landroid/view/View;

.field public final ᩺:Landroid/view/View;

.field public final ᩻֫:Landroid/view/View;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "media3.ui"

    .line 251
    invoke-static {v0}, Ll/ܽ᩵֫;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 357
    invoke-direct {p0, p1, p2, v0}, Ll/ܽ֨ۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    .line 374
    invoke-direct/range {p0 .. p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 v2, 0x1388

    .line 377
    iput v2, v1, Ll/ܽ֨ۧ;->ۘ֫:I

    const/4 v8, 0x0

    .line 378
    iput v8, v1, Ll/ܽ֨ۧ;->ܳ֫:I

    const/16 v3, 0xc8

    .line 379
    iput v3, v1, Ll/ܽ֨ۧ;->۠֫:I

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 380
    iput-wide v9, v1, Ll/ܽ֨ۧ;->۫:J

    const/4 v3, 0x1

    .line 381
    iput-boolean v3, v1, Ll/ܽ֨ۧ;->ܺ֫:Z

    .line 382
    iput-boolean v3, v1, Ll/ܽ֨ۧ;->᩷֫:Z

    .line 383
    iput-boolean v3, v1, Ll/ܽ֨ۧ;->ۡ֫:Z

    .line 384
    iput-boolean v3, v1, Ll/ܽ֨ۧ;->ۢ֫:Z

    .line 385
    iput-boolean v8, v1, Ll/ܽ֨ۧ;->ۖ֫:Z

    const/16 v11, 0x8

    const v4, 0x7f0d011e

    if-eqz v0, :cond_0

    .line 389
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    sget-object v6, Ll/᩺ۘ֫;->ܽ:[I

    move/from16 v7, p3

    .line 390
    invoke-virtual {v5, v0, v6, v7, v8}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v5

    const/16 v6, 0x13

    .line 396
    :try_start_0
    invoke-virtual {v5, v6, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, v1, Ll/ܽ֨ۧ;->ۘ֫:I

    const/4 v2, 0x5

    .line 398
    invoke-virtual {v5, v2, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    .line 1270
    invoke-virtual {v5, v11, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    .line 400
    iput v2, v1, Ll/ܽ֨ۧ;->ܳ֫:I

    const/16 v2, 0x11

    .line 402
    invoke-virtual {v5, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, v1, Ll/ܽ֨ۧ;->ܺ֫:Z

    const/16 v2, 0xe

    .line 404
    invoke-virtual {v5, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, v1, Ll/ܽ֨ۧ;->᩷֫:Z

    const/16 v2, 0x10

    .line 407
    invoke-virtual {v5, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    iput-boolean v6, v1, Ll/ܽ֨ۧ;->ۡ֫:Z

    const/16 v6, 0xf

    .line 410
    invoke-virtual {v5, v6, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, v1, Ll/ܽ֨ۧ;->ۢ֫:Z

    const/16 v3, 0x12

    .line 412
    invoke-virtual {v5, v3, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, v1, Ll/ܽ֨ۧ;->ۖ֫:Z

    .line 414
    iget v3, v1, Ll/ܽ֨ۧ;->۠֫:I

    const/16 v6, 0x14

    .line 415
    invoke-virtual {v5, v6, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    const/16 v6, 0x3e8

    .line 792
    invoke-static {v3, v2, v6}, Ll/ۘ֨֫;->֫(III)I

    move-result v2

    iput v2, v1, Ll/ܽ֨ۧ;->۠֫:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 419
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 420
    throw v0

    .line 422
    :cond_0
    :goto_0
    new-instance v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v2, v1, Ll/ܽ֨ۧ;->᩸֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 423
    new-instance v2, Ll/᩹᩵֫;

    invoke-direct {v2}, Ll/᩹᩵֫;-><init>()V

    .line 424
    new-instance v2, Ll/᩶᩵֫;

    invoke-direct {v2}, Ll/᩶᩵֫;-><init>()V

    .line 425
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v2, v1, Ll/ܽ֨ۧ;->ۙ:Ljava/lang/StringBuilder;

    .line 426
    new-instance v3, Ljava/util/Formatter;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    invoke-direct {v3, v2, v5}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    iput-object v3, v1, Ll/ܽ֨ۧ;->ۗ:Ljava/util/Formatter;

    .line 431
    new-instance v12, Ll/֫֨ۧ;

    invoke-direct {v12, v1}, Ll/֫֨ۧ;-><init>(Ll/ܽ֨ۧ;)V

    .line 432
    new-instance v2, Ll/ۚ᩸ۢ;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v1}, Ll/ۚ᩸ۢ;-><init>(ILjava/lang/Object;)V

    iput-object v2, v1, Ll/ܽ֨ۧ;->ܶ֫:Ll/ۚ᩸ۢ;

    .line 433
    new-instance v2, Ll/ۘۢܳ;

    invoke-direct {v2, v3, v1}, Ll/ۘۢܳ;-><init>(ILjava/lang/Object;)V

    iput-object v2, v1, Ll/ܽ֨ۧ;->۬:Ll/ۘۢܳ;

    .line 435
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    invoke-virtual {v2, v4, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const/high16 v2, 0x40000

    .line 436
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    const v13, 0x7f0a01c5

    .line 438
    invoke-virtual {v1, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/۠۠ۧ;

    const v3, 0x7f0a01c6

    .line 439
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v14

    if-eqz v2, :cond_1

    .line 441
    iput-object v2, v1, Ll/ܽ֨ۧ;->֨֫:Ll/۠۠ۧ;

    goto :goto_1

    :cond_1
    if-eqz v14, :cond_2

    .line 445
    new-instance v15, Ll/۟ۚۧ;

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v2, v15

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    .line 264
    invoke-direct/range {v2 .. v7}, Ll/۟ۚۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;I)V

    .line 446
    invoke-virtual {v15, v13}, Landroid/view/View;->setId(I)V

    .line 447
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {v15, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 448
    invoke-virtual {v14}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 449
    invoke-virtual {v0, v14}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v2

    .line 450
    invoke-virtual {v0, v14}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 451
    invoke-virtual {v0, v15, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 452
    iput-object v15, v1, Ll/ܽ֨ۧ;->֨֫:Ll/۠۠ۧ;

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 454
    iput-object v0, v1, Ll/ܽ֨ۧ;->֨֫:Ll/۠۠ۧ;

    :goto_1
    const v0, 0x7f0a01af

    .line 456
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v0, 0x7f0a01c3

    .line 457
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Ll/ܽ֨ۧ;->ܰ:Landroid/widget/TextView;

    .line 459
    iget-object v0, v1, Ll/ܽ֨ۧ;->֨֫:Ll/۠۠ۧ;

    if-eqz v0, :cond_3

    .line 460
    invoke-interface {v0, v12}, Ll/۠۠ۧ;->֫(Ll/֨۠ۧ;)V

    :cond_3
    const v0, 0x7f0a01c0

    .line 462
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v1, Ll/ܽ֨ۧ;->᩺:Landroid/view/View;

    if-eqz v0, :cond_4

    .line 464
    invoke-virtual {v0, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    const v0, 0x7f0a01bf

    .line 466
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v1, Ll/ܽ֨ۧ;->ۨ:Landroid/view/View;

    if-eqz v0, :cond_5

    .line 468
    invoke-virtual {v0, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_5
    const v0, 0x7f0a01c4

    .line 470
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v1, Ll/ܽ֨ۧ;->۟:Landroid/view/View;

    if-eqz v0, :cond_6

    .line 472
    invoke-virtual {v0, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
    const v0, 0x7f0a01bb

    .line 474
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v1, Ll/ܽ֨ۧ;->ۛ:Landroid/view/View;

    if-eqz v0, :cond_7

    .line 476
    invoke-virtual {v0, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_7
    const v0, 0x7f0a01c8

    .line 478
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v1, Ll/ܽ֨ۧ;->᩻֫:Landroid/view/View;

    if-eqz v0, :cond_8

    .line 480
    invoke-virtual {v0, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_8
    const v0, 0x7f0a01b3

    .line 482
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v1, Ll/ܽ֨ۧ;->᩶:Landroid/view/View;

    if-eqz v0, :cond_9

    .line 484
    invoke-virtual {v0, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_9
    const v0, 0x7f0a01c7

    .line 486
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Ll/ܽ֨ۧ;->ܿ֫:Landroid/widget/ImageView;

    if-eqz v0, :cond_a

    .line 488
    invoke-virtual {v0, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_a
    const v0, 0x7f0a01cc

    .line 490
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Ll/ܽ֨ۧ;->ᩴ֫:Landroid/widget/ImageView;

    if-eqz v0, :cond_b

    .line 492
    invoke-virtual {v0, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_b
    const v0, 0x7f0a01d4

    .line 494
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v1, Ll/ܽ֨ۧ;->᩹֫:Landroid/view/View;

    if-eqz v0, :cond_c

    .line 763
    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    .line 496
    :cond_c
    invoke-direct {v1, v0, v8}, Ll/ܽ֨ۧ;->֫(Landroid/view/View;Z)V

    .line 498
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0b000a

    .line 501
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getInteger(I)I

    const v2, 0x7f0b0009

    .line 503
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v2, v3

    iput v2, v1, Ll/ܽ֨ۧ;->᩸:F

    const v2, 0x7f0800d1

    .line 3731
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 506
    iput-object v2, v1, Ll/ܽ֨ۧ;->ܽ֫:Landroid/graphics/drawable/Drawable;

    const v2, 0x7f0800d2

    .line 3731
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 508
    iput-object v2, v1, Ll/ܽ֨ۧ;->ᩳ֫:Landroid/graphics/drawable/Drawable;

    const v2, 0x7f0800d0

    .line 3731
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 510
    iput-object v2, v1, Ll/ܽ֨ۧ;->֫֫:Landroid/graphics/drawable/Drawable;

    const v2, 0x7f0800d5

    .line 3731
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 512
    iput-object v2, v1, Ll/ܽ֨ۧ;->ۚ֫:Landroid/graphics/drawable/Drawable;

    const v2, 0x7f0800d4

    .line 3731
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 514
    iput-object v2, v1, Ll/ܽ֨ۧ;->᩵֫:Landroid/graphics/drawable/Drawable;

    const v2, 0x7f120329

    .line 516
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Ll/ܽ֨ۧ;->ۧ֫:Ljava/lang/String;

    const v2, 0x7f12032a

    .line 518
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    const v2, 0x7f120328

    .line 520
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    const v2, 0x7f120330

    .line 521
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    const v2, 0x7f12032f

    .line 523
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Ll/ܽ֨ۧ;->֡֫:Ljava/lang/String;

    .line 525
    iput-wide v9, v1, Ll/ܽ֨ۧ;->᩹:J

    return-void
.end method

.method private ֫(Landroid/view/View;Z)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 1115
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 1116
    iget v1, p0, Ll/ܽ֨ۧ;->᩸:F

    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    const/16 v0, 0x8

    .line 1117
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܽ֨ۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܽ֨ۧ;->ܳ()V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܽ֨ۧ;Z)V
    .locals 0

    .line 0
    iput-boolean p1, p0, Ll/ܽ֨ۧ;->ۜ֫:Z

    return-void
.end method

.method private ۜ()V
    .locals 2

    .line 945
    invoke-virtual {p0}, Ll/ܽ֨ۧ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Ll/ܽ֨ۧ;->ۤ:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ܽ֨ۧ;->ᩴ֫:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    goto :goto_0

    .line 950
    :cond_0
    iget-boolean v1, p0, Ll/ܽ֨ۧ;->ۖ֫:Z

    if-nez v1, :cond_1

    const/4 v1, 0x0

    .line 951
    invoke-direct {p0, v0, v1}, Ll/ܽ֨ۧ;->֫(Landroid/view/View;Z)V

    return-void

    :cond_1
    const/4 v1, 0x1

    .line 953
    invoke-direct {p0, v0, v1}, Ll/ܽ֨ۧ;->֫(Landroid/view/View;Z)V

    .line 954
    iget-object v1, p0, Ll/ܽ֨ۧ;->᩵֫:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 955
    iget-object v1, p0, Ll/ܽ֨ۧ;->֡֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ܽ֨ۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܽ֨ۧ;->᩻()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܽ֨ۧ;)Ljava/lang/StringBuilder;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽ֨ۧ;->ۙ:Ljava/lang/StringBuilder;

    return-object p0
.end method

.method private ܳ()V
    .locals 5

    .line 1040
    invoke-virtual {p0}, Ll/ܽ֨ۧ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Ll/ܽ֨ۧ;->ۤ:Z

    if-nez v0, :cond_0

    goto :goto_1

    .line 1051
    :cond_0
    iget-wide v0, p0, Ll/ܽ֨ۧ;->᩹:J

    const-wide/16 v2, 0x0

    cmp-long v4, v2, v0

    if-eqz v4, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 1053
    :goto_0
    iput-wide v2, p0, Ll/ܽ֨ۧ;->᩹:J

    .line 1058
    iget-object v1, p0, Ll/ܽ֨ۧ;->ܰ:Landroid/widget/TextView;

    if-eqz v1, :cond_2

    iget-boolean v4, p0, Ll/ܽ֨ۧ;->ۜ֫:Z

    if-nez v4, :cond_2

    if-eqz v0, :cond_2

    .line 1059
    iget-object v0, p0, Ll/ܽ֨ۧ;->ۙ:Ljava/lang/StringBuilder;

    iget-object v4, p0, Ll/ܽ֨ۧ;->ۗ:Ljava/util/Formatter;

    invoke-static {v0, v4, v2, v3}, Ll/ۘ֨֫;->֫(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1061
    :cond_2
    iget-object v0, p0, Ll/ܽ֨ۧ;->֨֫:Ll/۠۠ۧ;

    if-eqz v0, :cond_3

    .line 1062
    invoke-interface {v0, v2, v3}, Ll/۠۠ۧ;->֫(J)V

    .line 1063
    invoke-interface {v0, v2, v3}, Ll/۠۠ۧ;->ܽ(J)V

    .line 1070
    :cond_3
    iget-object v0, p0, Ll/ܽ֨ۧ;->ܶ֫:Ll/ۚ᩸ۢ;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_4
    :goto_1
    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ܽ֨ۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܽ֨ۧ;->ܿ()V

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ܽ֨ۧ;)Ljava/util/Formatter;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽ֨ۧ;->ۗ:Ljava/util/Formatter;

    return-object p0
.end method

.method private ܽ()V
    .locals 6

    .line 832
    iget-object v0, p0, Ll/ܽ֨ۧ;->۬:Ll/ۘۢܳ;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 833
    iget v1, p0, Ll/ܽ֨ۧ;->ۘ֫:I

    if-lez v1, :cond_1

    .line 834
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    int-to-long v4, v1

    add-long/2addr v2, v4

    iput-wide v2, p0, Ll/ܽ֨ۧ;->۫:J

    .line 835
    iget-boolean v1, p0, Ll/ܽ֨ۧ;->ۤ:Z

    if-eqz v1, :cond_0

    .line 836
    invoke-virtual {p0, v0, v4, v5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void

    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 839
    iput-wide v0, p0, Ll/ܽ֨ۧ;->۫:J

    return-void
.end method

.method private ܿ()V
    .locals 5

    .line 852
    invoke-virtual {p0}, Ll/ܽ֨ۧ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Ll/ܽ֨ۧ;->ۤ:Z

    if-nez v0, :cond_0

    goto :goto_1

    .line 857
    :cond_0
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    .line 858
    iget-object v0, p0, Ll/ܽ֨ۧ;->᩺:Landroid/view/View;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 862
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    const/16 v2, 0x8

    .line 864
    iget-object v3, p0, Ll/ܽ֨ۧ;->ۨ:Landroid/view/View;

    if-eqz v3, :cond_2

    .line 865
    invoke-virtual {v3}, Landroid/view/View;->isFocused()Z

    move-result v1

    .line 867
    invoke-virtual {v3}, Landroid/view/View;->isAccessibilityFocused()Z

    move-result v4

    .line 868
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    :goto_0
    if-eqz v1, :cond_3

    if-eqz v0, :cond_3

    .line 1096
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    :cond_3
    if-eqz v4, :cond_4

    if-eqz v0, :cond_4

    .line 1105
    invoke-virtual {v0, v2}, Landroid/view/View;->sendAccessibilityEvent(I)V

    :cond_4
    :goto_1
    return-void
.end method

.method public static bridge synthetic ܿ(Ll/ܽ֨ۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܽ֨ۧ;->ᩳ()V

    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/ܽ֨ۧ;)Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽ֨ۧ;->ܰ:Landroid/widget/TextView;

    return-object p0
.end method

.method private ᩳ()V
    .locals 2

    .line 879
    invoke-virtual {p0}, Ll/ܽ֨ۧ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/ܽ֨ۧ;->ۤ:Z

    if-nez v0, :cond_0

    goto :goto_0

    .line 897
    :cond_0
    iget-boolean v0, p0, Ll/ܽ֨ۧ;->ۡ֫:Z

    iget-object v1, p0, Ll/ܽ֨ۧ;->۟:Landroid/view/View;

    invoke-direct {p0, v1, v0}, Ll/ܽ֨ۧ;->֫(Landroid/view/View;Z)V

    .line 898
    iget-boolean v0, p0, Ll/ܽ֨ۧ;->ܺ֫:Z

    iget-object v1, p0, Ll/ܽ֨ۧ;->᩻֫:Landroid/view/View;

    invoke-direct {p0, v1, v0}, Ll/ܽ֨ۧ;->֫(Landroid/view/View;Z)V

    .line 899
    iget-boolean v0, p0, Ll/ܽ֨ۧ;->᩷֫:Z

    iget-object v1, p0, Ll/ܽ֨ۧ;->᩶:Landroid/view/View;

    invoke-direct {p0, v1, v0}, Ll/ܽ֨ۧ;->֫(Landroid/view/View;Z)V

    .line 900
    iget-boolean v0, p0, Ll/ܽ֨ۧ;->ۢ֫:Z

    iget-object v1, p0, Ll/ܽ֨ۧ;->ۛ:Landroid/view/View;

    invoke-direct {p0, v1, v0}, Ll/ܽ֨ۧ;->֫(Landroid/view/View;Z)V

    .line 901
    iget-object v0, p0, Ll/ܽ֨ۧ;->֨֫:Ll/۠۠ۧ;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 902
    invoke-interface {v0, v1}, Ll/۠۠ۧ;->setEnabled(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ܽ֨ۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܽ֨ۧ;->ۜ()V

    return-void
.end method

.method private ᩻()V
    .locals 2

    .line 907
    invoke-virtual {p0}, Ll/ܽ֨ۧ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Ll/ܽ֨ۧ;->ۤ:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ܽ֨ۧ;->ܿ֫:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    goto :goto_0

    .line 911
    :cond_0
    iget v1, p0, Ll/ܽ֨ۧ;->ܳ֫:I

    if-nez v1, :cond_1

    const/4 v1, 0x0

    .line 912
    invoke-direct {p0, v0, v1}, Ll/ܽ֨ۧ;->֫(Landroid/view/View;Z)V

    return-void

    :cond_1
    const/4 v1, 0x1

    .line 918
    invoke-direct {p0, v0, v1}, Ll/ܽ֨ۧ;->֫(Landroid/view/View;Z)V

    .line 919
    iget-object v1, p0, Ll/ܽ֨ۧ;->ܽ֫:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 920
    iget-object v1, p0, Ll/ܽ֨ۧ;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public static bridge synthetic ᩻(Ll/ܽ֨ۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ܽ֨ۧ;->ܳ()V

    return-void
.end method


# virtual methods
.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 0

    .line 1197
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 1186
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1176
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    .line 1177
    iget-object v0, p0, Ll/ܽ֨ۧ;->۬:Ll/ۘۢܳ;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 1178
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 1179
    invoke-direct {p0}, Ll/ܽ֨ۧ;->ܽ()V

    .line 1181
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final onAttachedToWindow()V
    .locals 5

    .line 1151
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    const/4 v0, 0x1

    .line 1152
    iput-boolean v0, p0, Ll/ܽ֨ۧ;->ۤ:Z

    .line 1153
    iget-wide v0, p0, Ll/ܽ֨ۧ;->۫:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    .line 1154
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    .line 1156
    invoke-virtual {p0}, Ll/ܽ֨ۧ;->֫()V

    goto :goto_0

    .line 1158
    :cond_0
    iget-object v2, p0, Ll/ܽ֨ۧ;->۬:Ll/ۘۢܳ;

    invoke-virtual {p0, v2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    .line 1160
    :cond_1
    invoke-virtual {p0}, Ll/ܽ֨ۧ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1161
    invoke-direct {p0}, Ll/ܽ֨ۧ;->ܽ()V

    .line 844
    :cond_2
    :goto_0
    invoke-direct {p0}, Ll/ܽ֨ۧ;->ܿ()V

    .line 845
    invoke-direct {p0}, Ll/ܽ֨ۧ;->ᩳ()V

    .line 846
    invoke-direct {p0}, Ll/ܽ֨ۧ;->᩻()V

    .line 847
    invoke-direct {p0}, Ll/ܽ֨ۧ;->ۜ()V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1168
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    const/4 v0, 0x0

    .line 1169
    iput-boolean v0, p0, Ll/ܽ֨ۧ;->ۤ:Z

    .line 1170
    iget-object v0, p0, Ll/ܽ֨ۧ;->ܶ֫:Ll/ۚ᩸ۢ;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1171
    iget-object v0, p0, Ll/ܽ֨ۧ;->۬:Ll/ۘۢܳ;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ֫()V
    .locals 2

    .line 815
    invoke-virtual {p0}, Ll/ܽ֨ۧ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x8

    .line 816
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 817
    iget-object v0, p0, Ll/ܽ֨ۧ;->᩸֫:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧ֨ۧ;

    .line 818
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    invoke-interface {v1}, Ll/ۧ֨ۧ;->ۧ()V

    goto :goto_0

    .line 820
    :cond_0
    iget-object v0, p0, Ll/ܽ֨ۧ;->ܶ֫:Ll/ۚ᩸ۢ;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 821
    iget-object v0, p0, Ll/ܽ֨ۧ;->۬:Ll/ۘۢܳ;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 822
    iput-wide v0, p0, Ll/ܽ֨ۧ;->۫:J

    :cond_1
    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 828
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
