.class public final Ll/֫ܺ;
.super Ljava/lang/Object;
.source "S566"


# static fields
.field public static ֡ܳ᩸:Z


# instance fields
.field public ֫:Z

.field public final ۖ:Landroid/widget/TextView;

.field public ۜ:Ll/ۛۘ;

.field public ۡ:I

.field public ۢ:Landroid/graphics/Typeface;

.field public final ۧ:Ll/ۡܺ;

.field public ܳ:Ll/ۛۘ;

.field public ܺ:I

.field public ܽ:Ll/ۛۘ;

.field public ܿ:Ll/ۛۘ;

.field public ᩳ:Ll/ۛۘ;

.field public ᩷:Ll/ۛۘ;

.field public ᩻:Ll/ۛۘ;


# direct methods
.method static native constructor <clinit>()V
.end method

.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 76
    iput v0, p0, Ll/֫ܺ;->ܺ:I

    const/4 v0, -0x1

    .line 77
    iput v0, p0, Ll/֫ܺ;->ۡ:I

    .line 82
    iput-object p1, p0, Ll/֫ܺ;->ۖ:Landroid/widget/TextView;

    .line 83
    new-instance v0, Ll/ۡܺ;

    invoke-direct {v0, p1}, Ll/ۡܺ;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Ll/֫ܺ;->ۧ:Ll/ۡܺ;

    return-void
.end method

.method public static ֡ۨܽ(Ljava/lang/Object;I)V
    .locals 0

    check-cast p0, Ll/᩵ۚۢ;

    invoke-virtual {p0, p1}, Ll/᩵ۚۢ;->֫(I)V

    return-void
.end method

.method public static ֨᩹۟(Ljava/lang/Object;)J
    .locals 1

    check-cast p0, Ll/ۗ᩺ۡ;

    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public static ֫(Landroid/content/Context;Ll/ۛۢ;I)Ll/ۛۘ;
    .locals 0

    .line 563
    invoke-virtual {p1, p0, p2}, Ll/ۛۢ;->ܽ(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 565
    new-instance p1, Ll/ۛۘ;

    .line 27
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x1

    .line 566
    iput-boolean p2, p1, Ll/ۛۘ;->֫:Z

    .line 567
    iput-object p0, p1, Ll/ۛۘ;->ܽ:Landroid/content/res/ColorStateList;

    return-object p1

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private ֫(Landroid/content/Context;Ll/᩺ۘ;)V
    .locals 9

    .line 359
    iget v0, p0, Ll/֫ܺ;->ܺ:I

    const/4 v1, 0x2

    invoke-virtual {p2, v1, v0}, Ll/᩺ۘ;->ܽ(II)I

    move-result v0

    iput v0, p0, Ll/֫ܺ;->ܺ:I

    .line 361
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v2, -0x1

    const/16 v3, 0x1c

    if-lt v0, v3, :cond_0

    const/16 v4, 0xb

    .line 362
    invoke-virtual {p2, v4, v2}, Ll/᩺ۘ;->ܽ(II)I

    move-result v4

    iput v4, p0, Ll/֫ܺ;->ۡ:I

    if-eq v4, v2, :cond_0

    .line 365
    iget v4, p0, Ll/֫ܺ;->ܺ:I

    and-int/2addr v4, v1

    iput v4, p0, Ll/֫ܺ;->ܺ:I

    :cond_0
    const/16 v4, 0xa

    .line 369
    invoke-virtual {p2, v4}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v5

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-nez v5, :cond_5

    .line 370
    invoke-virtual {p2, v6}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_0

    .line 432
    :cond_1
    invoke-virtual {p2, v8}, Ll/᩺ۘ;->ۜ(I)Z

    move-result p1

    if-eqz p1, :cond_e

    .line 434
    iput-boolean v7, p0, Ll/֫ܺ;->֫:Z

    .line 435
    invoke-virtual {p2, v8, v8}, Ll/᩺ۘ;->ܽ(II)I

    move-result p1

    if-eq p1, v8, :cond_4

    if-eq p1, v1, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    goto/16 :goto_5

    .line 446
    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    iput-object p1, p0, Ll/֫ܺ;->ۢ:Landroid/graphics/Typeface;

    return-void

    .line 442
    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    iput-object p1, p0, Ll/֫ܺ;->ۢ:Landroid/graphics/Typeface;

    return-void

    .line 438
    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    iput-object p1, p0, Ll/֫ܺ;->ۢ:Landroid/graphics/Typeface;

    return-void

    :cond_5
    :goto_0
    const/4 v5, 0x0

    .line 371
    iput-object v5, p0, Ll/֫ܺ;->ۢ:Landroid/graphics/Typeface;

    .line 372
    invoke-virtual {p2, v6}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v4, 0xc

    .line 375
    :cond_6
    iget v5, p0, Ll/֫ܺ;->ۡ:I

    .line 376
    iget v6, p0, Ll/֫ܺ;->ܺ:I

    .line 377
    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    move-result p1

    if-nez p1, :cond_b

    .line 378
    new-instance p1, Ljava/lang/ref/WeakReference;

    iget-object v8, p0, Ll/֫ܺ;->ۖ:Landroid/widget/TextView;

    invoke-direct {p1, v8}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 379
    new-instance v8, Ll/ۤۡ;

    invoke-direct {v8, p0, v5, v6, p1}, Ll/ۤۡ;-><init>(Ll/֫ܺ;IILjava/lang/ref/WeakReference;)V

    .line 398
    :try_start_0
    iget p1, p0, Ll/֫ܺ;->ܺ:I

    invoke-virtual {p2, v4, p1, v8}, Ll/᩺ۘ;->֫(IILl/ܶۗ;)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_9

    if-lt v0, v3, :cond_8

    .line 400
    iget v0, p0, Ll/֫ܺ;->ۡ:I

    if-eq v0, v2, :cond_8

    .line 403
    invoke-static {p1, v7}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget v0, p0, Ll/֫ܺ;->ۡ:I

    iget v5, p0, Ll/֫ܺ;->ܺ:I

    and-int/2addr v5, v1

    if-eqz v5, :cond_7

    const/4 v5, 0x1

    goto :goto_1

    :cond_7
    const/4 v5, 0x0

    .line 402
    :goto_1
    invoke-static {p1, v0, v5}, Ll/۟ۡ;->֫(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Ll/֫ܺ;->ۢ:Landroid/graphics/Typeface;

    goto :goto_2

    .line 406
    :cond_8
    iput-object p1, p0, Ll/֫ܺ;->ۢ:Landroid/graphics/Typeface;

    .line 410
    :cond_9
    :goto_2
    iget-object p1, p0, Ll/֫ܺ;->ۢ:Landroid/graphics/Typeface;

    if-nez p1, :cond_a

    const/4 p1, 0x1

    goto :goto_3

    :cond_a
    const/4 p1, 0x0

    :goto_3
    iput-boolean p1, p0, Ll/֫ܺ;->֫:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    nop

    .line 415
    :cond_b
    :goto_4
    iget-object p1, p0, Ll/֫ܺ;->ۢ:Landroid/graphics/Typeface;

    if-nez p1, :cond_e

    .line 417
    invoke-virtual {p2, v4}, Ll/᩺ۘ;->ܳ(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_e

    .line 419
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v3, :cond_d

    iget p2, p0, Ll/֫ܺ;->ۡ:I

    if-eq p2, v2, :cond_d

    .line 422
    invoke-static {p1, v7}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget p2, p0, Ll/֫ܺ;->ۡ:I

    iget v0, p0, Ll/֫ܺ;->ܺ:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_c

    const/4 v7, 0x1

    .line 421
    :cond_c
    invoke-static {p1, p2, v7}, Ll/۟ۡ;->֫(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Ll/֫ܺ;->ۢ:Landroid/graphics/Typeface;

    goto :goto_5

    .line 425
    :cond_d
    iget p2, p0, Ll/֫ܺ;->ܺ:I

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Ll/֫ܺ;->ۢ:Landroid/graphics/Typeface;

    :cond_e
    :goto_5
    return-void
.end method

.method private ֫(Landroid/graphics/drawable/Drawable;Ll/ۛۘ;)V
    .locals 2

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 557
    iget-object v0, p0, Ll/֫ܺ;->ۖ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    sget v1, Ll/ۛۢ;->ۧ:I

    .line 497
    invoke-static {p1, p2, v0}, Ll/֫ۘ;->֫(Landroid/graphics/drawable/Drawable;Ll/ۛۘ;[I)V

    :cond_0
    return-void
.end method

.method public static ۖۧܶ(Ljava/lang/Object;)Landroid/view/Window;
    .locals 0

    check-cast p0, Landroid/app/Activity;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    return-object p0
.end method

.method public static ۙ᩵ۜ(Ljava/lang/Object;I)Landroid/view/MenuItem;
    .locals 0

    check-cast p0, Landroid/view/Menu;

    invoke-interface {p0, p1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p0

    return-object p0
.end method

.method public static ۚ۬᩻(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/۬ۤۡ;

    invoke-interface {p0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public static ۟ۡܿ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, [B

    invoke-static {p0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ܰ᩷᩷(Ljava/lang/Object;)B
    .locals 0

    check-cast p0, Ll/۬ۜܽ;

    invoke-virtual {p0}, Ll/۬ۜܽ;->readByte()B

    move-result p0

    return p0
.end method

.method public static ܶۖ᩻(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ll/ܶ᩵ܿ;

    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result p0

    return p0
.end method

.method public static ܺᩳۤ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ljava/io/Closeable;

    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public static ܽۚ᩸(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static ܽᩴ֨()I
    .locals 1

    const v0, -0x3d34214c

    return v0
.end method

.method public static ᩴܽᩴ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p0, Landroid/os/BaseBundle;

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩵ۛۙ(Ljava/lang/Object;)I
    .locals 0

    check-cast p0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p0

    return p0
.end method

.method public static ᩶֡ۤ([SIII)Ljava/lang/String;
    .locals 3

    new-array v1, p2, [C

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    add-int v2, p1, v0

    aget-short v2, p0, v2

    xor-int/2addr v2, p3

    int-to-char v2, v2

    aput-char v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method public static ᩹֫ܳ(Ljava/lang/Object;)V
    .locals 0

    check-cast p0, Ll/۟᩸ᩳ;

    invoke-virtual {p0}, Ll/۟᩸ᩳ;->close()V

    return-void
.end method

.method public static ᩺ۜ۠(Ljava/lang/Object;)Z
    .locals 0

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final ֫()V
    .locals 6

    .line 540
    iget-object v0, p0, Ll/֫ܺ;->ܿ:Ll/ۛۘ;

    const/4 v1, 0x2

    const/4 v2, 0x0

    iget-object v3, p0, Ll/֫ܺ;->ۖ:Landroid/widget/TextView;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/֫ܺ;->᩷:Ll/ۛۘ;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/֫ܺ;->ܳ:Ll/ۛۘ;

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/֫ܺ;->ܽ:Ll/ۛۘ;

    if-eqz v0, :cond_1

    .line 542
    :cond_0
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 543
    aget-object v4, v0, v2

    iget-object v5, p0, Ll/֫ܺ;->ܿ:Ll/ۛۘ;

    invoke-direct {p0, v4, v5}, Ll/֫ܺ;->֫(Landroid/graphics/drawable/Drawable;Ll/ۛۘ;)V

    const/4 v4, 0x1

    .line 544
    aget-object v4, v0, v4

    iget-object v5, p0, Ll/֫ܺ;->᩷:Ll/ۛۘ;

    invoke-direct {p0, v4, v5}, Ll/֫ܺ;->֫(Landroid/graphics/drawable/Drawable;Ll/ۛۘ;)V

    .line 545
    aget-object v4, v0, v1

    iget-object v5, p0, Ll/֫ܺ;->ܳ:Ll/ۛۘ;

    invoke-direct {p0, v4, v5}, Ll/֫ܺ;->֫(Landroid/graphics/drawable/Drawable;Ll/ۛۘ;)V

    const/4 v4, 0x3

    .line 546
    aget-object v0, v0, v4

    iget-object v4, p0, Ll/֫ܺ;->ܽ:Ll/ۛۘ;

    invoke-direct {p0, v0, v4}, Ll/֫ܺ;->֫(Landroid/graphics/drawable/Drawable;Ll/ۛۘ;)V

    .line 548
    :cond_1
    iget-object v0, p0, Ll/֫ܺ;->᩻:Ll/ۛۘ;

    if-nez v0, :cond_3

    iget-object v0, p0, Ll/֫ܺ;->ᩳ:Ll/ۛۘ;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    return-void

    .line 549
    :cond_3
    :goto_0
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 550
    aget-object v2, v0, v2

    iget-object v3, p0, Ll/֫ܺ;->᩻:Ll/ۛۘ;

    invoke-direct {p0, v2, v3}, Ll/֫ܺ;->֫(Landroid/graphics/drawable/Drawable;Ll/ۛۘ;)V

    .line 551
    aget-object v0, v0, v1

    iget-object v1, p0, Ll/֫ܺ;->ᩳ:Ll/ۛۘ;

    invoke-direct {p0, v0, v1}, Ll/֫ܺ;->֫(Landroid/graphics/drawable/Drawable;Ll/ۛۘ;)V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 604
    iget-object v0, p0, Ll/֫ܺ;->ۧ:Ll/ۡܺ;

    invoke-virtual {v0, p1}, Ll/ۡܺ;->֫(I)V

    return-void
.end method

.method public final ֫(IF)V
    .locals 2

    .line 582
    sget-boolean v0, Ll/᩹ᩴ;->ۧ:Z

    if-nez v0, :cond_0

    .line 596
    iget-object v0, p0, Ll/֫ܺ;->ۧ:Ll/ۡܺ;

    invoke-virtual {v0}, Ll/ۡܺ;->᩻()Z

    move-result v1

    if-nez v1, :cond_0

    .line 600
    invoke-virtual {v0, p2, p1}, Ll/ۡܺ;->֫(FI)V

    :cond_0
    return-void
.end method

.method public final ֫(IIII)V
    .locals 1

    .line 612
    iget-object v0, p0, Ll/֫ܺ;->ۧ:Ll/ۡܺ;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۡܺ;->֫(IIII)V

    return-void
.end method

.method public final ֫(Landroid/content/Context;I)V
    .locals 5

    .line 474
    sget-object v0, Ll/ۗᩳ;->ۗ:[I

    invoke-static {p1, p2, v0}, Ll/᩺ۘ;->֫(Landroid/content/Context;I[I)Ll/᩺ۘ;

    move-result-object p2

    const/16 v0, 0xe

    .line 476
    invoke-virtual {p2, v0}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 481
    invoke-virtual {p2, v0, v2}, Ll/᩺ۘ;->֫(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Ll/֫ܺ;->֫(Z)V

    .line 483
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    iget-object v3, p0, Ll/֫ܺ;->ۖ:Landroid/widget/TextView;

    if-ge v0, v1, :cond_3

    const/4 v1, 0x3

    .line 486
    invoke-virtual {p2, v1}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 488
    invoke-virtual {p2, v1}, Ll/᩺ۘ;->ۧ(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 490
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_1
    const/4 v1, 0x5

    .line 493
    invoke-virtual {p2, v1}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 495
    invoke-virtual {p2, v1}, Ll/᩺ۘ;->ۧ(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 497
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setLinkTextColor(Landroid/content/res/ColorStateList;)V

    :cond_2
    const/4 v1, 0x4

    .line 500
    invoke-virtual {p2, v1}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 502
    invoke-virtual {p2, v1}, Ll/᩺ۘ;->ۧ(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 504
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setHintTextColor(Landroid/content/res/ColorStateList;)V

    .line 509
    :cond_3
    invoke-virtual {p2, v2}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, -0x1

    .line 510
    invoke-virtual {p2, v2, v1}, Ll/᩺ۘ;->ۧ(II)I

    move-result v1

    if-nez v1, :cond_4

    const/4 v1, 0x0

    .line 511
    invoke-virtual {v3, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 515
    :cond_4
    invoke-direct {p0, p1, p2}, Ll/֫ܺ;->֫(Landroid/content/Context;Ll/᩺ۘ;)V

    const/16 p1, 0x1a

    if-lt v0, p1, :cond_5

    const/16 p1, 0xd

    .line 518
    invoke-virtual {p2, p1}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 519
    invoke-virtual {p2, p1}, Ll/᩺ۘ;->ܳ(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 522
    invoke-static {v3, p1}, Ll/ܰۡ;->֫(Landroid/widget/TextView;Ljava/lang/String;)Z

    .line 525
    :cond_5
    invoke-virtual {p2}, Ll/᩺ۘ;->ܿ()V

    .line 526
    iget-object p1, p0, Ll/֫ܺ;->ۢ:Landroid/graphics/Typeface;

    if-eqz p1, :cond_6

    .line 527
    iget p2, p0, Ll/֫ܺ;->ܺ:I

    invoke-virtual {v3, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_6
    return-void
.end method

.method public final ֫(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 648
    iget-object v0, p0, Ll/֫ܺ;->ۜ:Ll/ۛۘ;

    if-nez v0, :cond_0

    .line 649
    new-instance v0, Ll/ۛۘ;

    .line 27
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 649
    iput-object v0, p0, Ll/֫ܺ;->ۜ:Ll/ۛۘ;

    .line 651
    :cond_0
    iget-object v0, p0, Ll/֫ܺ;->ۜ:Ll/ۛۘ;

    iput-object p1, v0, Ll/ۛۘ;->ܽ:Landroid/content/res/ColorStateList;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 652
    :goto_0
    iput-boolean p1, v0, Ll/ۛۘ;->֫:Z

    .line 671
    iput-object v0, p0, Ll/֫ܺ;->ܿ:Ll/ۛۘ;

    .line 672
    iput-object v0, p0, Ll/֫ܺ;->᩷:Ll/ۛۘ;

    .line 673
    iput-object v0, p0, Ll/֫ܺ;->ܳ:Ll/ۛۘ;

    .line 674
    iput-object v0, p0, Ll/֫ܺ;->ܽ:Ll/ۛۘ;

    .line 675
    iput-object v0, p0, Ll/֫ܺ;->᩻:Ll/ۛۘ;

    .line 676
    iput-object v0, p0, Ll/֫ܺ;->ᩳ:Ll/ۛۘ;

    return-void
.end method

.method public final ֫(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .line 662
    iget-object v0, p0, Ll/֫ܺ;->ۜ:Ll/ۛۘ;

    if-nez v0, :cond_0

    .line 663
    new-instance v0, Ll/ۛۘ;

    .line 27
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 663
    iput-object v0, p0, Ll/֫ܺ;->ۜ:Ll/ۛۘ;

    .line 665
    :cond_0
    iget-object v0, p0, Ll/֫ܺ;->ۜ:Ll/ۛۘ;

    iput-object p1, v0, Ll/ۛۘ;->ᩳ:Landroid/graphics/PorterDuff$Mode;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 666
    :goto_0
    iput-boolean p1, v0, Ll/ۛۘ;->ۧ:Z

    .line 671
    iput-object v0, p0, Ll/֫ܺ;->ܿ:Ll/ۛۘ;

    .line 672
    iput-object v0, p0, Ll/֫ܺ;->᩷:Ll/ۛۘ;

    .line 673
    iput-object v0, p0, Ll/֫ܺ;->ܳ:Ll/ۛۘ;

    .line 674
    iput-object v0, p0, Ll/֫ܺ;->ܽ:Ll/ۛۘ;

    .line 675
    iput-object v0, p0, Ll/֫ܺ;->᩻:Ll/ۛۘ;

    .line 676
    iput-object v0, p0, Ll/֫ܺ;->ᩳ:Ll/ۛۘ;

    return-void
.end method

.method public final ֫(Landroid/util/AttributeSet;I)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move/from16 v8, p2

    .line 88
    iget-object v9, v0, Ll/֫ܺ;->ۖ:Landroid/widget/TextView;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    .line 89
    invoke-static {}, Ll/ۛۢ;->ۧ()Ll/ۛۢ;

    move-result-object v11

    .line 92
    sget-object v3, Ll/ۗᩳ;->᩷:[I

    const/4 v12, 0x0

    invoke-static {v10, v7, v3, v8, v12}, Ll/᩺ۘ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;[III)Ll/᩺ۘ;

    move-result-object v13

    .line 94
    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 95
    invoke-virtual {v13}, Ll/᩺ۘ;->ܽ()Landroid/content/res/TypedArray;

    move-result-object v5

    move-object v1, v9

    move-object/from16 v4, p1

    move/from16 v6, p2

    .line 94
    invoke-static/range {v1 .. v6}, Ll/ܿ᩺;->֫(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    const/4 v1, -0x1

    .line 98
    invoke-virtual {v13, v12, v1}, Ll/᩺ۘ;->ܳ(II)I

    move-result v2

    const/4 v3, 0x3

    .line 100
    invoke-virtual {v13, v3}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 102
    invoke-virtual {v13, v3, v12}, Ll/᩺ۘ;->ܳ(II)I

    move-result v4

    .line 101
    invoke-static {v10, v11, v4}, Ll/֫ܺ;->֫(Landroid/content/Context;Ll/ۛۢ;I)Ll/ۛۘ;

    move-result-object v4

    iput-object v4, v0, Ll/֫ܺ;->ܿ:Ll/ۛۘ;

    :cond_0
    const/4 v4, 0x1

    .line 104
    invoke-virtual {v13, v4}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 106
    invoke-virtual {v13, v4, v12}, Ll/᩺ۘ;->ܳ(II)I

    move-result v4

    .line 105
    invoke-static {v10, v11, v4}, Ll/֫ܺ;->֫(Landroid/content/Context;Ll/ۛۢ;I)Ll/ۛۘ;

    move-result-object v4

    iput-object v4, v0, Ll/֫ܺ;->᩷:Ll/ۛۘ;

    :cond_1
    const/4 v4, 0x4

    .line 108
    invoke-virtual {v13, v4}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 110
    invoke-virtual {v13, v4, v12}, Ll/᩺ۘ;->ܳ(II)I

    move-result v5

    .line 109
    invoke-static {v10, v11, v5}, Ll/֫ܺ;->֫(Landroid/content/Context;Ll/ۛۢ;I)Ll/ۛۘ;

    move-result-object v5

    iput-object v5, v0, Ll/֫ܺ;->ܳ:Ll/ۛۘ;

    :cond_2
    const/4 v5, 0x2

    .line 112
    invoke-virtual {v13, v5}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 114
    invoke-virtual {v13, v5, v12}, Ll/᩺ۘ;->ܳ(II)I

    move-result v5

    .line 113
    invoke-static {v10, v11, v5}, Ll/֫ܺ;->֫(Landroid/content/Context;Ll/ۛۢ;I)Ll/ۛۘ;

    move-result-object v5

    iput-object v5, v0, Ll/֫ܺ;->ܽ:Ll/ۛۘ;

    :cond_3
    const/4 v5, 0x5

    .line 116
    invoke-virtual {v13, v5}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 118
    invoke-virtual {v13, v5, v12}, Ll/᩺ۘ;->ܳ(II)I

    move-result v5

    .line 117
    invoke-static {v10, v11, v5}, Ll/֫ܺ;->֫(Landroid/content/Context;Ll/ۛۢ;I)Ll/ۛۘ;

    move-result-object v5

    iput-object v5, v0, Ll/֫ܺ;->᩻:Ll/ۛۘ;

    :cond_4
    const/4 v5, 0x6

    .line 120
    invoke-virtual {v13, v5}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v6

    if-eqz v6, :cond_5

    const/4 v6, 0x1

    .line 122
    invoke-virtual {v13, v5, v12}, Ll/᩺ۘ;->ܳ(II)I

    move-result v5

    .line 121
    invoke-static {v10, v11, v5}, Ll/֫ܺ;->֫(Landroid/content/Context;Ll/ۛۢ;I)Ll/ۛۘ;

    move-result-object v5

    iput-object v5, v0, Ll/֫ܺ;->ᩳ:Ll/ۛۘ;

    goto :goto_0

    :cond_5
    const/4 v6, 0x1

    .line 125
    :goto_0
    invoke-virtual {v13}, Ll/᩺ۘ;->ܿ()V

    .line 131
    invoke-virtual {v9}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v5

    instance-of v5, v5, Landroid/text/method/PasswordTransformationMethod;

    const/16 v14, 0x17

    .line 141
    sget-object v15, Ll/ۗᩳ;->ۗ:[I

    const/16 v13, 0xe

    if-eq v2, v1, :cond_d

    .line 142
    invoke-static {v10, v2, v15}, Ll/᩺ۘ;->֫(Landroid/content/Context;I[I)Ll/᩺ۘ;

    move-result-object v1

    if-nez v5, :cond_6

    .line 143
    invoke-virtual {v1, v13}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 145
    invoke-virtual {v1, v13, v12}, Ll/᩺ۘ;->֫(IZ)Z

    move-result v2

    const/16 v16, 0x1

    goto :goto_1

    :cond_6
    const/4 v2, 0x0

    const/16 v16, 0x0

    .line 148
    :goto_1
    invoke-direct {v0, v10, v1}, Ll/֫ܺ;->֫(Landroid/content/Context;Ll/᩺ۘ;)V

    .line 149
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v13, v14, :cond_a

    .line 152
    invoke-virtual {v1, v3}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v18

    if-eqz v18, :cond_7

    .line 153
    invoke-virtual {v1, v3}, Ll/᩺ۘ;->ۧ(I)Landroid/content/res/ColorStateList;

    move-result-object v18

    goto :goto_2

    :cond_7
    const/16 v18, 0x0

    .line 155
    :goto_2
    invoke-virtual {v1, v4}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v19

    if-eqz v19, :cond_8

    .line 156
    invoke-virtual {v1, v4}, Ll/᩺ۘ;->ۧ(I)Landroid/content/res/ColorStateList;

    move-result-object v19

    goto :goto_3

    :cond_8
    const/16 v19, 0x0

    :goto_3
    const/4 v4, 0x5

    .line 159
    invoke-virtual {v1, v4}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v20

    if-eqz v20, :cond_9

    .line 160
    invoke-virtual {v1, v4}, Ll/᩺ۘ;->ۧ(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    const/16 v20, 0xf

    const/16 v3, 0xf

    goto :goto_5

    :cond_9
    const/16 v4, 0xf

    goto :goto_4

    :cond_a
    const/16 v4, 0xf

    const/16 v18, 0x0

    const/16 v19, 0x0

    :goto_4
    const/16 v20, 0xf

    const/4 v4, 0x0

    move/from16 v3, v20

    .line 164
    :goto_5
    invoke-virtual {v1, v3}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v21

    if-eqz v21, :cond_b

    .line 165
    invoke-virtual {v1, v3}, Ll/᩺ۘ;->ܳ(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_6

    :cond_b
    const/4 v3, 0x0

    :goto_6
    const/16 v14, 0x1a

    if-lt v13, v14, :cond_c

    const/16 v13, 0xd

    .line 168
    invoke-virtual {v1, v13}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v14

    if-eqz v14, :cond_c

    .line 169
    invoke-virtual {v1, v13}, Ll/᩺ۘ;->ܳ(I)Ljava/lang/String;

    move-result-object v13

    goto :goto_7

    :cond_c
    const/4 v13, 0x0

    .line 171
    :goto_7
    invoke-virtual {v1}, Ll/᩺ۘ;->ܿ()V

    goto :goto_8

    :cond_d
    const/4 v13, 0x0

    const/4 v2, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/4 v4, 0x0

    const/4 v3, 0x0

    .line 175
    :goto_8
    invoke-static {v10, v7, v15, v8, v12}, Ll/᩺ۘ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;[III)Ll/᩺ۘ;

    move-result-object v1

    if-nez v5, :cond_e

    const/16 v14, 0xe

    .line 177
    invoke-virtual {v1, v14}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v15

    if-eqz v15, :cond_e

    .line 179
    invoke-virtual {v1, v14, v12}, Ll/᩺ۘ;->֫(IZ)Z

    move-result v2

    const/16 v16, 0x1

    .line 181
    :cond_e
    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v14, 0x17

    if-ge v12, v14, :cond_11

    const/4 v14, 0x3

    .line 184
    invoke-virtual {v1, v14}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v15

    if-eqz v15, :cond_f

    .line 185
    invoke-virtual {v1, v14}, Ll/᩺ۘ;->ۧ(I)Landroid/content/res/ColorStateList;

    move-result-object v18

    :cond_f
    const/4 v14, 0x4

    .line 187
    invoke-virtual {v1, v14}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v15

    if-eqz v15, :cond_10

    .line 188
    invoke-virtual {v1, v14}, Ll/᩺ۘ;->ۧ(I)Landroid/content/res/ColorStateList;

    move-result-object v19

    :cond_10
    const/4 v14, 0x5

    .line 191
    invoke-virtual {v1, v14}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v15

    if-eqz v15, :cond_11

    .line 192
    invoke-virtual {v1, v14}, Ll/᩺ۘ;->ۧ(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    :cond_11
    move-object/from16 v17, v3

    move-object/from16 v14, v18

    move-object/from16 v15, v19

    const/16 v3, 0xf

    const/16 v18, 0x3

    .line 196
    invoke-virtual {v1, v3}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v19

    if-eqz v19, :cond_12

    .line 197
    invoke-virtual {v1, v3}, Ll/᩺ۘ;->ܳ(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_9

    :cond_12
    move-object/from16 v3, v17

    :goto_9
    move-object/from16 v17, v13

    const/16 v13, 0x1a

    if-lt v12, v13, :cond_13

    const/16 v13, 0xd

    .line 201
    invoke-virtual {v1, v13}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v19

    if-eqz v19, :cond_13

    .line 202
    invoke-virtual {v1, v13}, Ll/᩺ۘ;->ܳ(I)Ljava/lang/String;

    move-result-object v13

    goto :goto_a

    :cond_13
    move-object/from16 v13, v17

    :goto_a
    move/from16 v17, v6

    const/16 v6, 0x1c

    if-lt v12, v6, :cond_14

    const/4 v6, 0x0

    .line 206
    invoke-virtual {v1, v6}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v19

    if-eqz v19, :cond_14

    move-object/from16 v19, v11

    const/4 v11, -0x1

    .line 207
    invoke-virtual {v1, v6, v11}, Ll/᩺ۘ;->ۧ(II)I

    move-result v11

    if-nez v11, :cond_15

    const/4 v11, 0x0

    .line 208
    invoke-virtual {v9, v6, v11}, Landroid/widget/TextView;->setTextSize(IF)V

    goto :goto_b

    :cond_14
    move-object/from16 v19, v11

    .line 212
    :cond_15
    :goto_b
    invoke-direct {v0, v10, v1}, Ll/֫ܺ;->֫(Landroid/content/Context;Ll/᩺ۘ;)V

    .line 213
    invoke-virtual {v1}, Ll/᩺ۘ;->ܿ()V

    if-eqz v14, :cond_16

    .line 216
    invoke-virtual {v9, v14}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_16
    if-eqz v15, :cond_17

    .line 219
    invoke-virtual {v9, v15}, Landroid/widget/TextView;->setHintTextColor(Landroid/content/res/ColorStateList;)V

    :cond_17
    if-eqz v4, :cond_18

    .line 222
    invoke-virtual {v9, v4}, Landroid/widget/TextView;->setLinkTextColor(Landroid/content/res/ColorStateList;)V

    :cond_18
    if-nez v5, :cond_19

    if-eqz v16, :cond_19

    .line 225
    invoke-virtual {v0, v2}, Ll/֫ܺ;->֫(Z)V

    .line 227
    :cond_19
    iget-object v1, v0, Ll/֫ܺ;->ۢ:Landroid/graphics/Typeface;

    if-eqz v1, :cond_1b

    .line 228
    iget v2, v0, Ll/֫ܺ;->ۡ:I

    const/4 v4, -0x1

    if-ne v2, v4, :cond_1a

    .line 229
    iget v2, v0, Ll/֫ܺ;->ܺ:I

    invoke-virtual {v9, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    goto :goto_c

    .line 231
    :cond_1a
    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_1b
    :goto_c
    if-eqz v13, :cond_1c

    .line 235
    invoke-static {v9, v13}, Ll/ܰۡ;->֫(Landroid/widget/TextView;Ljava/lang/String;)Z

    :cond_1c
    if-eqz v3, :cond_1e

    const/16 v1, 0x18

    if-lt v12, v1, :cond_1d

    .line 239
    invoke-static {v3}, Ll/᩺ۡ;->֫(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object v1

    invoke-static {v9, v1}, Ll/᩺ۡ;->֫(Landroid/widget/TextView;Landroid/os/LocaleList;)V

    goto :goto_d

    :cond_1d
    const-string v1, ","

    .line 242
    invoke-virtual {v3, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v1, v1, v2

    .line 243
    invoke-static {v1}, Ll/ۨۡ;->֫(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v9, v1}, Landroid/widget/TextView;->setTextLocale(Ljava/util/Locale;)V

    .line 247
    :cond_1e
    :goto_d
    iget-object v1, v0, Ll/֫ܺ;->ۧ:Ll/ۡܺ;

    invoke-virtual {v1, v7, v8}, Ll/ۡܺ;->֫(Landroid/util/AttributeSet;I)V

    .line 249
    sget-boolean v2, Ll/᩹ᩴ;->ۧ:Z

    const/high16 v3, -0x40800000    # -1.0f

    if-eqz v2, :cond_20

    .line 251
    invoke-virtual {v1}, Ll/ۡܺ;->ܳ()I

    move-result v2

    if-eqz v2, :cond_20

    .line 254
    invoke-virtual {v1}, Ll/ۡܺ;->ܿ()[I

    move-result-object v2

    .line 255
    array-length v4, v2

    if-lez v4, :cond_20

    .line 256
    invoke-static {v9}, Ll/ܰۡ;->֫(Landroid/widget/TextView;)I

    move-result v4

    int-to-float v4, v4

    cmpl-float v4, v4, v3

    if-eqz v4, :cond_1f

    .line 261
    invoke-virtual {v1}, Ll/ۡܺ;->ܽ()I

    move-result v2

    .line 262
    invoke-virtual {v1}, Ll/ۡܺ;->ۧ()I

    move-result v4

    .line 263
    invoke-virtual {v1}, Ll/ۡܺ;->ᩳ()I

    move-result v1

    const/4 v5, 0x0

    .line 260
    invoke-static {v9, v2, v4, v1, v5}, Ll/ܰۡ;->֫(Landroid/widget/TextView;IIII)V

    goto :goto_e

    :cond_1f
    const/4 v1, 0x0

    .line 266
    invoke-static {v9, v2, v1}, Ll/ܰۡ;->֫(Landroid/widget/TextView;[II)V

    .line 274
    :cond_20
    :goto_e
    sget-object v1, Ll/ۗᩳ;->ۢ:[I

    invoke-static {v10, v7, v1}, Ll/᩺ۘ;->֫(Landroid/content/Context;Landroid/util/AttributeSet;[I)Ll/᩺ۘ;

    move-result-object v1

    const/16 v2, 0x8

    const/4 v4, -0x1

    .line 279
    invoke-virtual {v1, v2, v4}, Ll/᩺ۘ;->ܳ(II)I

    move-result v2

    if-eq v2, v4, :cond_21

    move-object/from16 v5, v19

    .line 282
    invoke-virtual {v5, v10, v2}, Ll/ۛۢ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_f

    :cond_21
    move-object/from16 v5, v19

    const/4 v2, 0x0

    :goto_f
    const/16 v6, 0xd

    .line 284
    invoke-virtual {v1, v6, v4}, Ll/᩺ۘ;->ܳ(II)I

    move-result v6

    if-eq v6, v4, :cond_22

    .line 287
    invoke-virtual {v5, v10, v6}, Ll/ۛۢ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    goto :goto_10

    :cond_22
    const/4 v6, 0x0

    :goto_10
    const/16 v7, 0x9

    .line 289
    invoke-virtual {v1, v7, v4}, Ll/᩺ۘ;->ܳ(II)I

    move-result v7

    if-eq v7, v4, :cond_23

    .line 292
    invoke-virtual {v5, v10, v7}, Ll/ۛۢ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    goto :goto_11

    :cond_23
    const/4 v7, 0x0

    :goto_11
    const/4 v8, 0x6

    .line 294
    invoke-virtual {v1, v8, v4}, Ll/᩺ۘ;->ܳ(II)I

    move-result v8

    if-eq v8, v4, :cond_24

    .line 297
    invoke-virtual {v5, v10, v8}, Ll/ۛۢ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    goto :goto_12

    :cond_24
    const/4 v8, 0x0

    :goto_12
    const/16 v11, 0xa

    .line 299
    invoke-virtual {v1, v11, v4}, Ll/᩺ۘ;->ܳ(II)I

    move-result v11

    if-eq v11, v4, :cond_25

    .line 302
    invoke-virtual {v5, v10, v11}, Ll/ۛۢ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v11

    goto :goto_13

    :cond_25
    const/4 v11, 0x0

    :goto_13
    const/4 v12, 0x7

    .line 304
    invoke-virtual {v1, v12, v4}, Ll/᩺ۘ;->ܳ(II)I

    move-result v12

    if-eq v12, v4, :cond_26

    .line 307
    invoke-virtual {v5, v10, v12}, Ll/ۛۢ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    goto :goto_14

    :cond_26
    const/4 v4, 0x0

    :goto_14
    if-nez v11, :cond_31

    if-eqz v4, :cond_27

    goto :goto_1c

    :cond_27
    if-nez v2, :cond_28

    if-nez v6, :cond_28

    if-nez v7, :cond_28

    if-eqz v8, :cond_36

    .line 693
    :cond_28
    invoke-virtual {v9}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v4

    const/4 v5, 0x0

    .line 694
    aget-object v10, v4, v5

    if-nez v10, :cond_2e

    const/4 v11, 0x2

    aget-object v12, v4, v11

    if-eqz v12, :cond_29

    goto :goto_19

    .line 702
    :cond_29
    invoke-virtual {v9}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v4

    if-eqz v2, :cond_2a

    goto :goto_15

    .line 704
    :cond_2a
    aget-object v2, v4, v5

    :goto_15
    if-eqz v6, :cond_2b

    goto :goto_16

    .line 705
    :cond_2b
    aget-object v6, v4, v17

    :goto_16
    if-eqz v7, :cond_2c

    goto :goto_17

    :cond_2c
    const/4 v5, 0x2

    .line 706
    aget-object v7, v4, v5

    :goto_17
    if-eqz v8, :cond_2d

    goto :goto_18

    .line 707
    :cond_2d
    aget-object v8, v4, v18

    .line 703
    :goto_18
    invoke-virtual {v9, v2, v6, v7, v8}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_21

    :cond_2e
    :goto_19
    if-eqz v6, :cond_2f

    goto :goto_1a

    .line 695
    :cond_2f
    aget-object v6, v4, v17

    :goto_1a
    if-eqz v8, :cond_30

    goto :goto_1b

    .line 696
    :cond_30
    aget-object v8, v4, v18

    :goto_1b
    const/4 v2, 0x2

    .line 697
    aget-object v2, v4, v2

    invoke-virtual {v9, v10, v6, v2, v8}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_21

    .line 684
    :cond_31
    :goto_1c
    invoke-virtual {v9}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v11, :cond_32

    goto :goto_1d

    :cond_32
    const/4 v5, 0x0

    .line 685
    aget-object v11, v2, v5

    :goto_1d
    if-eqz v6, :cond_33

    goto :goto_1e

    .line 686
    :cond_33
    aget-object v6, v2, v17

    :goto_1e
    if-eqz v4, :cond_34

    goto :goto_1f

    :cond_34
    const/4 v4, 0x2

    .line 687
    aget-object v4, v2, v4

    :goto_1f
    if-eqz v8, :cond_35

    goto :goto_20

    .line 689
    :cond_35
    aget-object v8, v2, v18

    .line 688
    :goto_20
    invoke-virtual {v9, v11, v6, v4, v8}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_36
    :goto_21
    const/16 v2, 0xb

    .line 312
    invoke-virtual {v1, v2}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v4

    if-eqz v4, :cond_37

    .line 313
    invoke-virtual {v1, v2}, Ll/᩺ۘ;->ۧ(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    .line 315
    invoke-static {v9, v2}, Ll/ۙ֫֫;->֫(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V

    :cond_37
    const/16 v2, 0xc

    .line 317
    invoke-virtual {v1, v2}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v4

    const/4 v5, -0x1

    if-eqz v4, :cond_38

    .line 319
    invoke-virtual {v1, v2, v5}, Ll/᩺ۘ;->ܽ(II)I

    move-result v2

    const/4 v4, 0x0

    .line 318
    invoke-static {v2, v4}, Ll/ܶܺ;->֫(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v2

    .line 320
    invoke-static {v9, v2}, Ll/ۙ֫֫;->֫(Landroid/widget/TextView;Landroid/graphics/PorterDuff$Mode;)V

    :cond_38
    const/16 v2, 0xf

    .line 323
    invoke-virtual {v1, v2, v5}, Ll/᩺ۘ;->ۧ(II)I

    move-result v2

    const/16 v4, 0x12

    .line 325
    invoke-virtual {v1, v4, v5}, Ll/᩺ۘ;->ۧ(II)I

    move-result v4

    const/16 v5, 0x13

    .line 329
    invoke-virtual {v1, v5}, Ll/᩺ۘ;->ۜ(I)Z

    move-result v6

    if-eqz v6, :cond_3a

    .line 330
    invoke-virtual {v1}, Ll/᩺ۘ;->ᩳ()Landroid/util/TypedValue;

    move-result-object v6

    if-eqz v6, :cond_39

    .line 331
    iget v7, v6, Landroid/util/TypedValue;->type:I

    const/4 v8, 0x5

    if-ne v7, v8, :cond_39

    .line 332
    iget v5, v6, Landroid/util/TypedValue;->data:I

    and-int/lit8 v6, v5, 0xf

    .line 333
    invoke-static {v5}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v5

    const/4 v7, -0x1

    goto :goto_23

    :cond_39
    const/4 v6, -0x1

    .line 335
    invoke-virtual {v1, v5, v6}, Ll/᩺ۘ;->ۧ(II)I

    move-result v5

    int-to-float v5, v5

    goto :goto_22

    :cond_3a
    const/4 v5, -0x1

    const/high16 v6, -0x40800000    # -1.0f

    const/high16 v5, -0x40800000    # -1.0f

    :goto_22
    const/4 v7, -0x1

    const/4 v6, -0x1

    .line 342
    :goto_23
    invoke-virtual {v1}, Ll/᩺ۘ;->ܿ()V

    if-eq v2, v7, :cond_3b

    .line 344
    invoke-static {v9, v2}, Ll/ۙ֫֫;->֫(Landroid/widget/TextView;I)V

    :cond_3b
    if-eq v4, v7, :cond_3c

    .line 347
    invoke-static {v9, v4}, Ll/ۙ֫֫;->ۧ(Landroid/widget/TextView;I)V

    :cond_3c
    cmpl-float v1, v5, v3

    if-eqz v1, :cond_3e

    if-ne v6, v7, :cond_3d

    float-to-int v1, v5

    .line 351
    invoke-static {v9, v1}, Ll/ۙ֫֫;->ܽ(Landroid/widget/TextView;I)V

    return-void

    .line 353
    :cond_3d
    invoke-static {v9, v6, v5}, Ll/ۙ֫֫;->֫(Landroid/widget/TextView;IF)V

    :cond_3e
    return-void
.end method

.method public final ֫(Ljava/lang/ref/WeakReference;Landroid/graphics/Typeface;)V
    .locals 2

    .line 454
    iget-boolean v0, p0, Ll/֫ܺ;->֫:Z

    if-eqz v0, :cond_1

    .line 455
    iput-object p2, p0, Ll/֫ܺ;->ۢ:Landroid/graphics/Typeface;

    .line 456
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_1

    .line 458
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 459
    iget v0, p0, Ll/֫ܺ;->ܺ:I

    .line 460
    new-instance v1, Ll/ۛۡ;

    invoke-direct {v1, p1, p2, v0}, Ll/ۛۡ;-><init>(Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 467
    :cond_0
    iget v0, p0, Ll/֫ܺ;->ܺ:I

    invoke-virtual {p1, p2, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_1
    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 532
    iget-object v0, p0, Ll/֫ܺ;->ۖ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    return-void
.end method

.method public final ֫([II)V
    .locals 1

    .line 618
    iget-object v0, p0, Ll/֫ܺ;->ۧ:Ll/ۡܺ;

    invoke-virtual {v0, p1, p2}, Ll/ۡܺ;->֫([II)V

    return-void
.end method

.method public final ۜ()Landroid/content/res/ColorStateList;
    .locals 1

    .line 644
    iget-object v0, p0, Ll/֫ܺ;->ۜ:Ll/ۛۘ;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/ۛۘ;->ܽ:Landroid/content/res/ColorStateList;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۢ()Z
    .locals 1

    .line 596
    iget-object v0, p0, Ll/֫ܺ;->ۧ:Ll/ۡܺ;

    invoke-virtual {v0}, Ll/ۡܺ;->᩻()Z

    move-result v0

    return v0
.end method

.method public final ۧ()V
    .locals 1

    .line 591
    iget-object v0, p0, Ll/֫ܺ;->ۧ:Ll/ۡܺ;

    invoke-virtual {v0}, Ll/ۡܺ;->֫()V

    return-void
.end method

.method public final ܳ()[I
    .locals 1

    .line 639
    iget-object v0, p0, Ll/֫ܺ;->ۧ:Ll/ۡܺ;

    invoke-virtual {v0}, Ll/ۡܺ;->ܿ()[I

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 635
    iget-object v0, p0, Ll/֫ܺ;->ۧ:Ll/ۡܺ;

    invoke-virtual {v0}, Ll/ۡܺ;->ۧ()I

    move-result v0

    return v0
.end method

.method public final ܿ()I
    .locals 1

    .line 627
    iget-object v0, p0, Ll/֫ܺ;->ۧ:Ll/ۡܺ;

    invoke-virtual {v0}, Ll/ۡܺ;->ᩳ()I

    move-result v0

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 631
    iget-object v0, p0, Ll/֫ܺ;->ۧ:Ll/ۡܺ;

    invoke-virtual {v0}, Ll/ۡܺ;->ܽ()I

    move-result v0

    return v0
.end method

.method public final ᩷()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    .line 658
    iget-object v0, p0, Ll/֫ܺ;->ۜ:Ll/ۛۘ;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/ۛۘ;->ᩳ:Landroid/graphics/PorterDuff$Mode;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ᩻()I
    .locals 1

    .line 623
    iget-object v0, p0, Ll/֫ܺ;->ۧ:Ll/ۡܺ;

    invoke-virtual {v0}, Ll/ۡܺ;->ܳ()I

    move-result v0

    return v0
.end method
