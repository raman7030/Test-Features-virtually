.class public final Ll/ܰ᩻;
.super Ljava/lang/Object;
.source "Y55F"


# instance fields
.field public ֡:Z

.field public ֨:Landroid/content/res/ColorStateList;

.field public ֫:I

.field public ۖ:I

.field public ۗ:Ljava/lang/CharSequence;

.field public ۘ:I

.field public ۙ:I

.field public ۚ:I

.field public ۛ:Landroid/view/Menu;

.field public ۜ:Ljava/lang/String;

.field public ۠:Landroid/graphics/PorterDuff$Mode;

.field public ۡ:I

.field public ۢ:Z

.field public ۤ:Z

.field public ۧ:I

.field public final synthetic ۨ:Ll/۟᩻;

.field public ۫:Ljava/lang/CharSequence;

.field public ۬:Ljava/lang/CharSequence;

.field public ܳ:Z

.field public ܶ:I

.field public ܺ:C

.field public ܽ:Z

.field public ܿ:I

.field public ᩳ:I

.field public ᩴ:Z

.field public ᩵:Ljava/lang/CharSequence;

.field public ᩶:C

.field public ᩷:I

.field public ᩸:Ljava/lang/String;

.field public ᩹:I

.field public ᩻:Ll/ܿۛ;


# direct methods
.method public constructor <init>(Ll/۟᩻;Landroid/view/Menu;)V
    .locals 0

    .line 365
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ᩻;->ۨ:Ll/۟᩻;

    const/4 p1, 0x0

    .line 353
    iput-object p1, p0, Ll/ܰ᩻;->֨:Landroid/content/res/ColorStateList;

    .line 354
    iput-object p1, p0, Ll/ܰ᩻;->۠:Landroid/graphics/PorterDuff$Mode;

    .line 366
    iput-object p2, p0, Ll/ܰ᩻;->ۛ:Landroid/view/Menu;

    .line 368
    invoke-virtual {p0}, Ll/ܰ᩻;->ᩳ()V

    return-void
.end method

.method private ֫(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 565
    :try_start_0
    iget-object v0, p0, Ll/ܰ᩻;->ۨ:Ll/۟᩻;

    iget-object v0, v0, Ll/۟᩻;->ܽ:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p1

    .line 566
    invoke-virtual {p1, p2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    const/4 p2, 0x1

    .line 567
    invoke-virtual {p1, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 568
    invoke-virtual {p1, p3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private ֫(Landroid/view/MenuItem;)V
    .locals 6

    .line 483
    iget-boolean v0, p0, Ll/ܰ᩻;->ᩴ:Z

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v1, p0, Ll/ܰ᩻;->ۤ:Z

    .line 484
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v1, p0, Ll/ܰ᩻;->֡:Z

    .line 485
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget v1, p0, Ll/ܰ᩻;->ۘ:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lt v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 486
    :goto_0
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, Ll/ܰ᩻;->۬:Ljava/lang/CharSequence;

    .line 487
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    iget v1, p0, Ll/ܰ᩻;->ۚ:I

    .line 488
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 490
    iget v0, p0, Ll/ܰ᩻;->ۙ:I

    if-ltz v0, :cond_1

    .line 491
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setShowAsAction(I)V

    .line 494
    :cond_1
    iget-object v0, p0, Ll/ܰ᩻;->᩸:Ljava/lang/String;

    iget-object v1, p0, Ll/ܰ᩻;->ۨ:Ll/۟᩻;

    if-eqz v0, :cond_3

    .line 495
    iget-object v0, v1, Ll/۟᩻;->ܽ:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->isRestricted()Z

    move-result v0

    if-nez v0, :cond_2

    .line 499
    new-instance v0, Ll/᩺᩻;

    .line 500
    invoke-virtual {v1}, Ll/۟᩻;->֫()Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, Ll/ܰ᩻;->᩸:Ljava/lang/String;

    invoke-direct {v0, v4, v5}, Ll/᩺᩻;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    .line 499
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    goto :goto_1

    .line 496
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The android:onClick attribute cannot be used within a restricted context"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 503
    :cond_3
    :goto_1
    iget v0, p0, Ll/ܰ᩻;->ۘ:I

    const/4 v4, 0x2

    if-lt v0, v4, :cond_5

    .line 504
    instance-of v0, p1, Ll/ۛۜ;

    if-eqz v0, :cond_4

    .line 505
    move-object v0, p1

    check-cast v0, Ll/ۛۜ;

    invoke-virtual {v0, v3}, Ll/ۛۜ;->ܽ(Z)V

    goto :goto_2

    .line 506
    :cond_4
    instance-of v0, p1, Ll/֫᩷;

    if-eqz v0, :cond_5

    .line 507
    move-object v0, p1

    check-cast v0, Ll/֫᩷;

    invoke-virtual {v0}, Ll/֫᩷;->ܿ()V

    .line 512
    :cond_5
    :goto_2
    iget-object v0, p0, Ll/ܰ᩻;->ۜ:Ljava/lang/String;

    if-eqz v0, :cond_6

    .line 513
    sget-object v2, Ll/۟᩻;->ܳ:[Ljava/lang/Class;

    iget-object v1, v1, Ll/۟᩻;->ۧ:[Ljava/lang/Object;

    invoke-direct {p0, v0, v2, v1}, Ll/ܰ᩻;->֫(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 515
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    const/4 v2, 0x1

    .line 518
    :cond_6
    iget v0, p0, Ll/ܰ᩻;->᩷:I

    if-lez v0, :cond_7

    if-nez v2, :cond_7

    .line 520
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(I)Landroid/view/MenuItem;

    .line 527
    :cond_7
    iget-object v0, p0, Ll/ܰ᩻;->᩻:Ll/ܿۛ;

    if-eqz v0, :cond_8

    .line 214
    instance-of v1, p1, Ll/ܰ۬;

    if-eqz v1, :cond_8

    .line 215
    move-object v1, p1

    check-cast v1, Ll/ܰ۬;

    invoke-interface {v1, v0}, Ll/ܰ۬;->֫(Ll/ܿۛ;)Ll/ܰ۬;

    .line 531
    :cond_8
    iget-object v0, p0, Ll/ܰ᩻;->᩵:Ljava/lang/CharSequence;

    invoke-static {p1, v0}, Ll/ۛۛ;->֫(Landroid/view/MenuItem;Ljava/lang/CharSequence;)V

    .line 532
    iget-object v0, p0, Ll/ܰ᩻;->۫:Ljava/lang/CharSequence;

    invoke-static {p1, v0}, Ll/ۛۛ;->ۧ(Landroid/view/MenuItem;Ljava/lang/CharSequence;)V

    .line 533
    iget-char v0, p0, Ll/ܰ᩻;->ܺ:C

    iget v1, p0, Ll/ܰ᩻;->ۡ:I

    invoke-static {p1, v0, v1}, Ll/ۛۛ;->֫(Landroid/view/MenuItem;CI)V

    .line 535
    iget-char v0, p0, Ll/ܰ᩻;->᩶:C

    iget v1, p0, Ll/ܰ᩻;->᩹:I

    invoke-static {p1, v0, v1}, Ll/ۛۛ;->ۧ(Landroid/view/MenuItem;CI)V

    .line 537
    iget-object v0, p0, Ll/ܰ᩻;->۠:Landroid/graphics/PorterDuff$Mode;

    if-eqz v0, :cond_9

    .line 538
    invoke-static {p1, v0}, Ll/ۛۛ;->֫(Landroid/view/MenuItem;Landroid/graphics/PorterDuff$Mode;)V

    .line 540
    :cond_9
    iget-object v0, p0, Ll/ܰ᩻;->֨:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_a

    .line 541
    invoke-static {p1, v0}, Ll/ۛۛ;->֫(Landroid/view/MenuItem;Landroid/content/res/ColorStateList;)V

    :cond_a
    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 5

    const/4 v0, 0x1

    .line 546
    iput-boolean v0, p0, Ll/ܰ᩻;->ۢ:Z

    .line 547
    iget v0, p0, Ll/ܰ᩻;->ᩳ:I

    iget v1, p0, Ll/ܰ᩻;->ܶ:I

    iget v2, p0, Ll/ܰ᩻;->ۖ:I

    iget-object v3, p0, Ll/ܰ᩻;->ۗ:Ljava/lang/CharSequence;

    iget-object v4, p0, Ll/ܰ᩻;->ۛ:Landroid/view/Menu;

    invoke-interface {v4, v0, v1, v2, v3}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ܰ᩻;->֫(Landroid/view/MenuItem;)V

    return-void
.end method

.method public final ֫(Landroid/util/AttributeSet;)V
    .locals 3

    .line 384
    iget-object v0, p0, Ll/ܰ᩻;->ۨ:Ll/۟᩻;

    iget-object v0, v0, Ll/۟᩻;->ܽ:Landroid/content/Context;

    sget-object v1, Ll/ۗᩳ;->ۚ:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 386
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Ll/ܰ᩻;->ᩳ:I

    const/4 v2, 0x3

    .line 387
    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Ll/ܰ᩻;->֫:I

    const/4 v2, 0x4

    .line 389
    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Ll/ܰ᩻;->ܿ:I

    const/4 v2, 0x5

    .line 390
    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Ll/ܰ᩻;->ۧ:I

    const/4 v2, 0x2

    .line 392
    invoke-virtual {p1, v2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iput-boolean v2, p0, Ll/ܰ᩻;->ܳ:Z

    .line 393
    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Ll/ܰ᩻;->ܽ:Z

    .line 395
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public final ۧ()Landroid/view/SubMenu;
    .locals 5

    const/4 v0, 0x1

    .line 551
    iput-boolean v0, p0, Ll/ܰ᩻;->ۢ:Z

    .line 552
    iget v0, p0, Ll/ܰ᩻;->ᩳ:I

    iget v1, p0, Ll/ܰ᩻;->ܶ:I

    iget v2, p0, Ll/ܰ᩻;->ۖ:I

    iget-object v3, p0, Ll/ܰ᩻;->ۗ:Ljava/lang/CharSequence;

    iget-object v4, p0, Ll/ܰ᩻;->ۛ:Landroid/view/Menu;

    invoke-interface {v4, v0, v1, v2, v3}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object v0

    .line 553
    invoke-interface {v0}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    move-result-object v1

    invoke-direct {p0, v1}, Ll/ܰ᩻;->֫(Landroid/view/MenuItem;)V

    return-object v0
.end method

.method public final ۧ(Landroid/util/AttributeSet;)V
    .locals 6

    .line 402
    iget-object v0, p0, Ll/ܰ᩻;->ۨ:Ll/۟᩻;

    iget-object v1, v0, Ll/۟᩻;->ܽ:Landroid/content/Context;

    sget-object v2, Ll/ۗᩳ;->֨:[I

    invoke-static {v1, p1, v2}, Ll/᩺ۘ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ll/᩺ۘ;

    move-result-object p1

    const/4 v1, 0x2

    const/4 v2, 0x0

    .line 406
    invoke-virtual {p1, v1, v2}, Ll/᩺ۘ;->ܳ(II)I

    move-result v1

    iput v1, p0, Ll/ܰ᩻;->ܶ:I

    const/4 v1, 0x5

    .line 407
    iget v3, p0, Ll/ܰ᩻;->֫:I

    invoke-virtual {p1, v1, v3}, Ll/᩺ۘ;->ܽ(II)I

    move-result v1

    const/4 v3, 0x6

    .line 408
    iget v4, p0, Ll/ܰ᩻;->ܿ:I

    invoke-virtual {p1, v3, v4}, Ll/᩺ۘ;->ܽ(II)I

    move-result v3

    const/high16 v4, -0x10000

    and-int/2addr v1, v4

    const v4, 0xffff

    and-int/2addr v3, v4

    or-int/2addr v1, v3

    .line 409
    iput v1, p0, Ll/ܰ᩻;->ۖ:I

    const/4 v1, 0x7

    .line 411
    invoke-virtual {p1, v1}, Ll/᩺ۘ;->᩻(I)Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, p0, Ll/ܰ᩻;->ۗ:Ljava/lang/CharSequence;

    const/16 v1, 0x8

    .line 412
    invoke-virtual {p1, v1}, Ll/᩺ۘ;->᩻(I)Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, p0, Ll/ܰ᩻;->۬:Ljava/lang/CharSequence;

    .line 413
    invoke-virtual {p1, v2, v2}, Ll/᩺ۘ;->ܳ(II)I

    move-result v1

    iput v1, p0, Ll/ܰ᩻;->ۚ:I

    const/16 v1, 0x9

    .line 415
    invoke-virtual {p1, v1}, Ll/᩺ۘ;->ܳ(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 478
    :cond_0
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 415
    :goto_0
    iput-char v1, p0, Ll/ܰ᩻;->ܺ:C

    const/16 v1, 0x10

    const/16 v3, 0x1000

    .line 417
    invoke-virtual {p1, v1, v3}, Ll/᩺ۘ;->ܽ(II)I

    move-result v1

    iput v1, p0, Ll/ܰ᩻;->ۡ:I

    const/16 v1, 0xa

    .line 419
    invoke-virtual {p1, v1}, Ll/᩺ۘ;->ܳ(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    .line 478
    :cond_1
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 419
    :goto_1
    iput-char v1, p0, Ll/ܰ᩻;->᩶:C

    const/16 v1, 0x14

    .line 421
    invoke-virtual {p1, v1, v3}, Ll/᩺ۘ;->ܽ(II)I

    move-result v1

    iput v1, p0, Ll/ܰ᩻;->᩹:I

    const/16 v1, 0xb

    .line 422
    invoke-virtual {p1, v1}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 424
    invoke-virtual {p1, v1, v2}, Ll/᩺ۘ;->֫(IZ)Z

    move-result v1

    iput v1, p0, Ll/ܰ᩻;->ۘ:I

    goto :goto_2

    .line 428
    :cond_2
    iget v1, p0, Ll/ܰ᩻;->ۧ:I

    iput v1, p0, Ll/ܰ᩻;->ۘ:I

    :goto_2
    const/4 v1, 0x3

    .line 430
    invoke-virtual {p1, v1, v2}, Ll/᩺ۘ;->֫(IZ)Z

    move-result v1

    iput-boolean v1, p0, Ll/ܰ᩻;->ᩴ:Z

    const/4 v1, 0x4

    .line 431
    iget-boolean v3, p0, Ll/ܰ᩻;->ܳ:Z

    invoke-virtual {p1, v1, v3}, Ll/᩺ۘ;->֫(IZ)Z

    move-result v1

    iput-boolean v1, p0, Ll/ܰ᩻;->ۤ:Z

    const/4 v1, 0x1

    .line 432
    iget-boolean v3, p0, Ll/ܰ᩻;->ܽ:Z

    invoke-virtual {p1, v1, v3}, Ll/᩺ۘ;->֫(IZ)Z

    move-result v1

    iput-boolean v1, p0, Ll/ܰ᩻;->֡:Z

    const/16 v1, 0x15

    const/4 v3, -0x1

    .line 433
    invoke-virtual {p1, v1, v3}, Ll/᩺ۘ;->ܽ(II)I

    move-result v1

    iput v1, p0, Ll/ܰ᩻;->ۙ:I

    const/16 v1, 0xc

    .line 434
    invoke-virtual {p1, v1}, Ll/᩺ۘ;->ܳ(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ܰ᩻;->᩸:Ljava/lang/String;

    const/16 v1, 0xd

    .line 435
    invoke-virtual {p1, v1, v2}, Ll/᩺ۘ;->ܳ(II)I

    move-result v1

    iput v1, p0, Ll/ܰ᩻;->᩷:I

    const/16 v1, 0xf

    .line 436
    invoke-virtual {p1, v1}, Ll/᩺ۘ;->ܳ(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Ll/ܰ᩻;->ۜ:Ljava/lang/String;

    const/16 v1, 0xe

    .line 437
    invoke-virtual {p1, v1}, Ll/᩺ۘ;->ܳ(I)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    if-eqz v1, :cond_3

    .line 440
    iget v5, p0, Ll/ܰ᩻;->᩷:I

    if-nez v5, :cond_3

    iget-object v5, p0, Ll/ܰ᩻;->ۜ:Ljava/lang/String;

    if-nez v5, :cond_3

    .line 441
    sget-object v5, Ll/۟᩻;->ܿ:[Ljava/lang/Class;

    iget-object v0, v0, Ll/۟᩻;->֫:[Ljava/lang/Object;

    invoke-direct {p0, v1, v5, v0}, Ll/ܰ᩻;->֫(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܿۛ;

    iput-object v0, p0, Ll/ܰ᩻;->᩻:Ll/ܿۛ;

    goto :goto_3

    .line 449
    :cond_3
    iput-object v4, p0, Ll/ܰ᩻;->᩻:Ll/ܿۛ;

    :goto_3
    const/16 v0, 0x11

    .line 452
    invoke-virtual {p1, v0}, Ll/᩺ۘ;->᩻(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ll/ܰ᩻;->᩵:Ljava/lang/CharSequence;

    const/16 v0, 0x16

    .line 453
    invoke-virtual {p1, v0}, Ll/᩺ۘ;->᩻(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Ll/ܰ᩻;->۫:Ljava/lang/CharSequence;

    const/16 v0, 0x13

    .line 454
    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 455
    invoke-virtual {p1, v0, v3}, Ll/᩺ۘ;->ܽ(II)I

    move-result v0

    iget-object v1, p0, Ll/ܰ᩻;->۠:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v0, v1}, Ll/ܶܺ;->֫(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    iput-object v0, p0, Ll/ܰ᩻;->۠:Landroid/graphics/PorterDuff$Mode;

    goto :goto_4

    .line 460
    :cond_4
    iput-object v4, p0, Ll/ܰ᩻;->۠:Landroid/graphics/PorterDuff$Mode;

    :goto_4
    const/16 v0, 0x12

    .line 462
    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 463
    invoke-virtual {p1, v0}, Ll/᩺ۘ;->ۧ(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Ll/ܰ᩻;->֨:Landroid/content/res/ColorStateList;

    goto :goto_5

    .line 466
    :cond_5
    iput-object v4, p0, Ll/ܰ᩻;->֨:Landroid/content/res/ColorStateList;

    .line 469
    :goto_5
    invoke-virtual {p1}, Ll/᩺ۘ;->ܿ()V

    .line 471
    iput-boolean v2, p0, Ll/ܰ᩻;->ۢ:Z

    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 558
    iget-boolean v0, p0, Ll/ܰ᩻;->ۢ:Z

    return v0
.end method

.method public final ᩳ()V
    .locals 1

    const/4 v0, 0x0

    .line 372
    iput v0, p0, Ll/ܰ᩻;->ᩳ:I

    .line 373
    iput v0, p0, Ll/ܰ᩻;->֫:I

    .line 374
    iput v0, p0, Ll/ܰ᩻;->ܿ:I

    .line 375
    iput v0, p0, Ll/ܰ᩻;->ۧ:I

    const/4 v0, 0x1

    .line 376
    iput-boolean v0, p0, Ll/ܰ᩻;->ܳ:Z

    .line 377
    iput-boolean v0, p0, Ll/ܰ᩻;->ܽ:Z

    return-void
.end method
