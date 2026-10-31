.class public Ll/۬ۧ֫;
.super Landroid/view/ViewGroup;
.source "O607"


# static fields
.field public static final ֡֫:[I

.field public static final ֨֫:[I

.field public static final ۚ֫:Z

.field public static ۠֫:Z

.field public static final ᩵֫:Z


# instance fields
.field public final ֫֫:Ll/ۗۧ֫;

.field public ۖ֫:F

.field public ۗ:Z

.field public ۘ֫:Landroid/graphics/Paint;

.field public ۙ:Landroid/graphics/Matrix;

.field public ۛ:Z

.field public ۜ֫:I

.field public ۟:Ljava/lang/Object;

.field public final ۡ֫:Ll/ܺۧ֫;

.field public final ۢ֫:Ll/ۗۧ֫;

.field public ۤ:I

.field public final ۧ֫:Ll/ܺۧ֫;

.field public ۨ:Z

.field public ۫:F

.field public ۬:Z

.field public ܰ:F

.field public ܳ֫:I

.field public ܺ֫:I

.field public ܽ֫:Ljava/util/ArrayList;

.field public ܿ֫:I

.field public ᩳ֫:I

.field public ᩴ֫:Landroid/graphics/drawable/Drawable;

.field public ᩶:Landroid/graphics/Rect;

.field public final ᩷֫:Ljava/util/ArrayList;

.field public final ᩸:Ll/ۚ۟;

.field public final ᩹:Ll/֨ۧ֫;

.field public ᩺:F

.field public ᩻֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const v0, 0x1010434

    .line 110
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/۬ۧ֫;->֨֫:[I

    const v0, 0x10100b3

    .line 189
    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/۬ۧ֫;->֡֫:[I

    .line 194
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    sput-boolean v1, Ll/۬ۧ֫;->᩵֫:Z

    .line 197
    sput-boolean v1, Ll/۬ۧ֫;->ۚ֫:Z

    const/16 v2, 0x1d

    if-lt v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 256
    :goto_0
    sput-boolean v1, Ll/۬ۧ֫;->۠֫:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f0401af

    .line 332
    invoke-direct {p0, p1, p2, v0}, Ll/۬ۧ֫;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 6

    .line 336
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 204
    new-instance v0, Ll/֨ۧ֫;

    .line 2537
    invoke-direct {v0}, Ll/ܽۛ;-><init>()V

    .line 204
    iput-object v0, p0, Ll/۬ۧ֫;->᩹:Ll/֨ۧ֫;

    const/high16 v0, -0x67000000

    .line 210
    iput v0, p0, Ll/۬ۧ֫;->ܺ֫:I

    .line 212
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Ll/۬ۧ֫;->ۘ֫:Landroid/graphics/Paint;

    const/4 v0, 0x1

    .line 220
    iput-boolean v0, p0, Ll/۬ۧ֫;->ۛ:Z

    const/4 v1, 0x3

    .line 222
    iput v1, p0, Ll/۬ۧ֫;->ܿ֫:I

    .line 223
    iput v1, p0, Ll/۬ۧ֫;->ܳ֫:I

    .line 224
    iput v1, p0, Ll/۬ۧ֫;->᩻֫:I

    .line 225
    iput v1, p0, Ll/۬ۧ֫;->ᩳ֫:I

    .line 258
    new-instance v2, Ll/᩵ۧ֫;

    invoke-direct {v2, p0}, Ll/᩵ۧ֫;-><init>(Ll/۬ۧ֫;)V

    iput-object v2, p0, Ll/۬ۧ֫;->᩸:Ll/ۚ۟;

    const/high16 v2, 0x40000

    .line 337
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 338
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x42800000    # 64.0f

    mul-float v3, v3, v2

    const/high16 v4, 0x3f000000    # 0.5f

    add-float/2addr v3, v4

    float-to-int v3, v3

    .line 339
    iput v3, p0, Ll/۬ۧ֫;->ۜ֫:I

    const/high16 v3, 0x43c80000    # 400.0f

    mul-float v2, v2, v3

    .line 342
    new-instance v3, Ll/ۗۧ֫;

    invoke-direct {v3, p0, v1}, Ll/ۗۧ֫;-><init>(Ll/۬ۧ֫;I)V

    iput-object v3, p0, Ll/۬ۧ֫;->֫֫:Ll/ۗۧ֫;

    .line 343
    new-instance v1, Ll/ۗۧ֫;

    const/4 v4, 0x5

    invoke-direct {v1, p0, v4}, Ll/ۗۧ֫;-><init>(Ll/۬ۧ֫;I)V

    iput-object v1, p0, Ll/۬ۧ֫;->ۢ֫:Ll/ۗۧ֫;

    const/high16 v4, 0x3f800000    # 1.0f

    .line 345
    invoke-static {p0, v4, v3}, Ll/ܺۧ֫;->֫(Landroid/view/ViewGroup;FLl/ۡۧ֫;)Ll/ܺۧ֫;

    move-result-object v5

    iput-object v5, p0, Ll/۬ۧ֫;->ۧ֫:Ll/ܺۧ֫;

    .line 346
    invoke-virtual {v5, v0}, Ll/ܺۧ֫;->ܽ(I)V

    .line 347
    invoke-virtual {v5, v2}, Ll/ܺۧ֫;->֫(F)V

    .line 348
    invoke-virtual {v3, v5}, Ll/ۗۧ֫;->֫(Ll/ܺۧ֫;)V

    .line 350
    invoke-static {p0, v4, v1}, Ll/ܺۧ֫;->֫(Landroid/view/ViewGroup;FLl/ۡۧ֫;)Ll/ܺۧ֫;

    move-result-object v3

    iput-object v3, p0, Ll/۬ۧ֫;->ۡ֫:Ll/ܺۧ֫;

    const/4 v4, 0x2

    .line 351
    invoke-virtual {v3, v4}, Ll/ܺۧ֫;->ܽ(I)V

    .line 352
    invoke-virtual {v3, v2}, Ll/ܺۧ֫;->֫(F)V

    .line 353
    invoke-virtual {v1, v3}, Ll/ۗۧ֫;->֫(Ll/ܺۧ֫;)V

    .line 356
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 358
    sget v1, Ll/ܿ᩺;->֫:I

    .line 1427
    invoke-virtual {p0, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 361
    new-instance v0, Ll/ۚۧ֫;

    invoke-direct {v0, p0}, Ll/ۚۧ֫;-><init>(Ll/۬ۧ֫;)V

    invoke-static {p0, v0}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܽۛ;)V

    const/4 v0, 0x0

    .line 362
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setMotionEventSplittingEnabled(Z)V

    .line 2854
    invoke-virtual {p0}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 365
    new-instance v1, Ll/֡ۧ֫;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, v1}, Landroid/view/View;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    const/16 v1, 0x500

    .line 373
    invoke-virtual {p0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 375
    sget-object v1, Ll/۬ۧ֫;->֨֫:[I

    invoke-virtual {p1, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 377
    :try_start_0
    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iput-object v2, p0, Ll/۬ۧ֫;->ᩴ֫:Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 379
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 380
    throw p1

    .line 386
    :cond_0
    :goto_0
    sget-object v1, Ll/ᩴۧ֫;->֫:[I

    .line 387
    invoke-virtual {p1, p2, v1, p3, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 389
    :try_start_1
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x0

    .line 390
    invoke-virtual {p1, v0, p2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Ll/۬ۧ֫;->۫:F

    goto :goto_1

    .line 392
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f070061

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p2

    iput p2, p0, Ll/۬ۧ֫;->۫:F
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 395
    :goto_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 398
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/۬ۧ֫;->᩷֫:Ljava/util/ArrayList;

    return-void

    :catchall_1
    move-exception p2

    .line 395
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 396
    throw p2
.end method

.method public static ۜ(Landroid/view/View;)Z
    .locals 3

    .line 1927
    invoke-static {p0}, Ll/۬ۧ֫;->᩻(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1930
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Ll/ܶۧ֫;

    iget p0, p0, Ll/ܶۧ֫;->ܽ:F

    const/4 v0, 0x0

    cmpl-float p0, p0, v0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0

    .line 1928
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "View "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " is not a drawer"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ۧ(Landroid/view/View;Z)V
    .locals 4

    .line 934
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    .line 936
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-nez p2, :cond_0

    .line 937
    invoke-static {v2}, Ll/۬ۧ֫;->᩻(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_0
    if-eqz p2, :cond_2

    if-ne v2, p1, :cond_2

    .line 940
    :cond_1
    sget v3, Ll/ܿ᩺;->֫:I

    const/4 v3, 0x1

    goto :goto_1

    .line 943
    :cond_2
    sget v3, Ll/ܿ᩺;->֫:I

    const/4 v3, 0x4

    .line 1427
    :goto_1
    invoke-virtual {v2, v3}, Landroid/view/View;->setImportantForAccessibility(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static ܳ(Landroid/view/View;)Z
    .locals 3

    .line 1881
    invoke-static {p0}, Ll/۬ۧ֫;->᩻(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1884
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Ll/ܶۧ֫;

    .line 1885
    iget p0, p0, Ll/ܶۧ֫;->ᩳ:I

    const/4 v0, 0x1

    and-int/2addr p0, v0

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0

    .line 1882
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "View "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " is not a drawer"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ܿ(Landroid/view/View;)Z
    .locals 0

    .line 1516
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, Ll/ܶۧ֫;

    iget p0, p0, Ll/ܶۧ֫;->֫:I

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ᩳ(Landroid/view/View;)Z
    .locals 2

    .line 2160
    sget v0, Ll/ܿ᩺;->֫:I

    .line 1400
    invoke-virtual {p0}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getImportantForAccessibility()I

    move-result p0

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private ᩷(Landroid/view/View;)V
    .locals 3

    .line 950
    sget-object v0, Ll/ܰܰ;->ۜ:Ll/ܰܰ;

    invoke-virtual {v0}, Ll/ܰܰ;->֫()I

    move-result v1

    invoke-static {v1, p1}, Ll/ܿ᩺;->ᩳ(ILandroid/view/View;)V

    .line 951
    invoke-static {p1}, Ll/۬ۧ֫;->ܳ(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0, p1}, Ll/۬ۧ֫;->֫(Landroid/view/View;)I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    const/4 v1, 0x0

    .line 952
    iget-object v2, p0, Ll/۬ۧ֫;->᩸:Ll/ۚ۟;

    invoke-static {p1, v0, v1, v2}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܰܰ;Ljava/lang/String;Ll/ۚ۟;)V

    :cond_0
    return-void
.end method

.method public static ᩻(I)Ljava/lang/String;
    .locals 2

    and-int/lit8 v0, p0, 0x3

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const-string p0, "LEFT"

    return-object p0

    :cond_0
    and-int/lit8 v0, p0, 0x5

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    const-string p0, "RIGHT"

    return-object p0

    .line 1052
    :cond_1
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ᩻(Landroid/view/View;)Z
    .locals 2

    .line 1520
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܶۧ֫;

    iget v0, v0, Ll/ܶۧ֫;->֫:I

    .line 1522
    sget v1, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result p0

    .line 134
    invoke-static {v0, p0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result p0

    and-int/lit8 v0, p0, 0x3

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    and-int/lit8 p0, p0, 0x5

    if-eqz p0, :cond_1

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final addFocusables(Ljava/util/ArrayList;II)V
    .locals 7

    .line 1986
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    move-result v0

    const/high16 v1, 0x60000

    if-ne v0, v1, :cond_0

    return-void

    .line 1992
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 1994
    :goto_0
    iget-object v4, p0, Ll/۬ۧ֫;->᩷֫:Ljava/util/ArrayList;

    if-ge v2, v0, :cond_3

    .line 1995
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 1996
    invoke-static {v5}, Ll/۬ۧ֫;->᩻(Landroid/view/View;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 1997
    invoke-static {v5}, Ll/۬ۧ֫;->ܳ(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 1999
    invoke-virtual {v5, p1, p2, p3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    const/4 v3, 0x1

    goto :goto_1

    .line 2002
    :cond_1
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    if-nez v3, :cond_5

    .line 2007
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_2
    if-ge v1, v0, :cond_5

    .line 2009
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    .line 2010
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_4

    .line 2011
    invoke-virtual {v2, p1, p2, p3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 2016
    :cond_5
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    .line 2132
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 996
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    const/4 p3, 0x0

    :goto_0
    const/4 v0, 0x1

    if-ge p3, p2, :cond_1

    .line 998
    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 999
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Ll/ܶۧ֫;

    .line 1000
    iget v2, v2, Ll/ܶۧ֫;->ᩳ:I

    and-int/2addr v2, v0

    if-ne v2, v0, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_3

    .line 2135
    invoke-static {p1}, Ll/۬ۧ֫;->᩻(Landroid/view/View;)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_2

    .line 2143
    :cond_2
    sget p2, Ll/ܿ᩺;->֫:I

    .line 1427
    invoke-virtual {p1, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    goto :goto_3

    .line 2138
    :cond_3
    :goto_2
    sget p2, Ll/ܿ᩺;->֫:I

    const/4 p2, 0x4

    .line 1427
    invoke-virtual {p1, p2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 2149
    :goto_3
    sget-boolean p2, Ll/۬ۧ֫;->᩵֫:Z

    if-nez p2, :cond_4

    .line 2150
    iget-object p2, p0, Ll/۬ۧ֫;->᩹:Ll/֨ۧ֫;

    invoke-static {p1, p2}, Ll/ܿ᩺;->֫(Landroid/view/View;Ll/ܽۛ;)V

    :cond_4
    return-void
.end method

.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .line 1976
    instance-of v0, p1, Ll/ܶۧ֫;

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final computeScroll()V
    .locals 4

    .line 1359
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 1362
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Ll/ܶۧ֫;

    iget v3, v3, Ll/ܶۧ֫;->ܽ:F

    .line 1363
    invoke-static {v1, v3}, Ljava/lang/Math;->max(FF)F

    move-result v1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1365
    :cond_0
    iput v1, p0, Ll/۬ۧ֫;->ۖ֫:F

    .line 1367
    iget-object v0, p0, Ll/۬ۧ֫;->ۧ֫:Ll/ܺۧ֫;

    invoke-virtual {v0}, Ll/ܺۧ֫;->ᩳ()Z

    move-result v0

    .line 1368
    iget-object v1, p0, Ll/۬ۧ֫;->ۡ֫:Ll/ܺۧ֫;

    invoke-virtual {v1}, Ll/ܺۧ֫;->ᩳ()Z

    move-result v1

    if-nez v0, :cond_2

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    return-void

    .line 1370
    :cond_2
    :goto_1
    sget v0, Ll/ܿ᩺;->֫:I

    .line 1323
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    return-void
.end method

.method public final dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1586
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_8

    .line 1587
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_8

    iget v0, p0, Ll/۬ۧ֫;->ۖ֫:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    goto/16 :goto_3

    .line 1592
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-eqz v0, :cond_7

    .line 1594
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    .line 1595
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v0, v3

    :goto_0
    if-ltz v0, :cond_7

    .line 1599
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 793
    iget-object v5, p0, Ll/۬ۧ֫;->᩶:Landroid/graphics/Rect;

    if-nez v5, :cond_1

    .line 794
    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    iput-object v5, p0, Ll/۬ۧ֫;->᩶:Landroid/graphics/Rect;

    .line 796
    :cond_1
    iget-object v5, p0, Ll/۬ۧ֫;->᩶:Landroid/graphics/Rect;

    invoke-virtual {v4, v5}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 797
    iget-object v5, p0, Ll/۬ۧ֫;->᩶:Landroid/graphics/Rect;

    float-to-int v6, v1

    float-to-int v7, v2

    invoke-virtual {v5, v6, v7}, Landroid/graphics/Rect;->contains(II)Z

    move-result v5

    if-eqz v5, :cond_6

    .line 1603
    invoke-static {v4}, Ll/۬ۧ֫;->ܿ(Landroid/view/View;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_2

    .line 806
    :cond_2
    invoke-virtual {v4}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v5

    .line 807
    invoke-virtual {v5}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v5

    if-nez v5, :cond_5

    .line 826
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v5

    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v6

    sub-int/2addr v5, v6

    int-to-float v5, v5

    .line 827
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v6

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v7

    sub-int/2addr v6, v7

    int-to-float v6, v6

    .line 828
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v7

    .line 829
    invoke-virtual {v7, v5, v6}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 830
    invoke-virtual {v4}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v5

    .line 831
    invoke-virtual {v5}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v6

    if-nez v6, :cond_4

    .line 832
    iget-object v6, p0, Ll/۬ۧ֫;->ۙ:Landroid/graphics/Matrix;

    if-nez v6, :cond_3

    .line 833
    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    iput-object v6, p0, Ll/۬ۧ֫;->ۙ:Landroid/graphics/Matrix;

    .line 835
    :cond_3
    iget-object v6, p0, Ll/۬ۧ֫;->ۙ:Landroid/graphics/Matrix;

    invoke-virtual {v5, v6}, Landroid/graphics/Matrix;->invert(Landroid/graphics/Matrix;)Z

    .line 836
    iget-object v5, p0, Ll/۬ۧ֫;->ۙ:Landroid/graphics/Matrix;

    invoke-virtual {v7, v5}, Landroid/view/MotionEvent;->transform(Landroid/graphics/Matrix;)V

    .line 809
    :cond_4
    invoke-virtual {v4, v7}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result v4

    .line 810
    invoke-virtual {v7}, Landroid/view/MotionEvent;->recycle()V

    goto :goto_1

    .line 812
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v5

    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v6

    sub-int/2addr v5, v6

    int-to-float v5, v5

    .line 813
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v6

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v7

    sub-int/2addr v6, v7

    int-to-float v6, v6

    .line 814
    invoke-virtual {p1, v5, v6}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 815
    invoke-virtual {v4, p1}, Landroid/view/View;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result v4

    neg-float v5, v5

    neg-float v6, v6

    .line 816
    invoke-virtual {p1, v5, v6}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    :goto_1
    if-eqz v4, :cond_6

    return v3

    :cond_6
    :goto_2
    add-int/lit8 v0, v0, -0x1

    goto/16 :goto_0

    :cond_7
    const/4 p1, 0x0

    return p1

    .line 1589
    :cond_8
    :goto_3
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 11

    .line 1453
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    .line 1454
    invoke-static {p2}, Ll/۬ۧ֫;->ܿ(Landroid/view/View;)Z

    move-result v1

    .line 1455
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    .line 1457
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    const/4 v4, 0x0

    if-eqz v1, :cond_4

    .line 1459
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v6, v5, :cond_3

    .line 1461
    invoke-virtual {p0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    if-eq v8, p2, :cond_2

    .line 1462
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v9

    if-nez v9, :cond_2

    .line 1377
    invoke-virtual {v8}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v9

    if-eqz v9, :cond_2

    .line 1379
    invoke-virtual {v9}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v9

    const/4 v10, -0x1

    if-ne v9, v10, :cond_2

    .line 1463
    invoke-static {v8}, Ll/۬ۧ֫;->᩻(Landroid/view/View;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 1464
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    move-result v9

    if-ge v9, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v9, 0x3

    .line 1468
    invoke-virtual {p0, v9, v8}, Ll/۬ۧ֫;->֫(ILandroid/view/View;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 1469
    invoke-virtual {v8}, Landroid/view/View;->getRight()I

    move-result v8

    if-le v8, v7, :cond_2

    move v7, v8

    goto :goto_1

    .line 1472
    :cond_1
    invoke-virtual {v8}, Landroid/view/View;->getLeft()I

    move-result v8

    if-ge v8, v2, :cond_2

    move v2, v8

    :cond_2
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 1476
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p1, v7, v4, v2, v0}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    move v4, v7

    .line 1478
    :cond_4
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result p2

    .line 1479
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 1481
    iget p3, p0, Ll/۬ۧ֫;->ۖ֫:F

    const/4 p4, 0x0

    cmpl-float p4, p3, p4

    if-lez p4, :cond_5

    if-eqz v1, :cond_5

    .line 1482
    iget p4, p0, Ll/۬ۧ֫;->ܺ֫:I

    const/high16 v0, -0x1000000

    and-int/2addr v0, p4

    ushr-int/lit8 v0, v0, 0x18

    int-to-float v0, v0

    mul-float v0, v0, p3

    float-to-int p3, v0

    shl-int/lit8 p3, p3, 0x18

    const v0, 0xffffff

    and-int/2addr p4, v0

    or-int/2addr p3, p4

    .line 1485
    iget-object v10, p0, Ll/۬ۧ֫;->ۘ֫:Landroid/graphics/Paint;

    invoke-virtual {v10, p3}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v6, v4

    int-to-float v8, v2

    .line 1487
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p3

    int-to-float v9, p3

    const/4 v7, 0x0

    move-object v5, p1

    invoke-virtual/range {v5 .. v10}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_5
    return p2
.end method

.method public final generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1962
    new-instance v0, Ll/ܶۧ֫;

    const/4 v1, -0x1

    .line 2403
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    const/4 v1, 0x0

    .line 2388
    iput v1, v0, Ll/ܶۧ֫;->֫:I

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1981
    new-instance v0, Ll/ܶۧ֫;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ll/ܶۧ֫;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1967
    instance-of v0, p1, Ll/ܶۧ֫;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 1968
    new-instance v0, Ll/ܶۧ֫;

    check-cast p1, Ll/ܶۧ֫;

    .line 2412
    invoke-direct {v0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 2388
    iput v1, v0, Ll/ܶۧ֫;->֫:I

    .line 2413
    iget p1, p1, Ll/ܶۧ֫;->֫:I

    iput p1, v0, Ll/ܶۧ֫;->֫:I

    return-object v0

    .line 1969
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    .line 1970
    new-instance v0, Ll/ܶۧ֫;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 2421
    invoke-direct {v0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 2388
    iput v1, v0, Ll/ܶۧ֫;->֫:I

    return-object v0

    .line 1971
    :cond_1
    new-instance v0, Ll/ܶۧ֫;

    .line 2417
    invoke-direct {v0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2388
    iput v1, v0, Ll/ܶۧ֫;->֫:I

    return-object v0
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 1063
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    const/4 v0, 0x1

    .line 1064
    iput-boolean v0, p0, Ll/۬ۧ֫;->ۛ:Z

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1057
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    const/4 v0, 0x1

    .line 1058
    iput-boolean v0, p0, Ll/۬ۧ֫;->ۛ:Z

    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1435
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V

    .line 1436
    iget-boolean v0, p0, Ll/۬ۧ֫;->۬:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/۬ۧ֫;->ᩴ֫:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    .line 1439
    iget-object v1, p0, Ll/۬ۧ֫;->۟:Ljava/lang/Object;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 1440
    check-cast v1, Landroid/view/WindowInsets;

    invoke-virtual {v1}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-lez v1, :cond_1

    .line 1445
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {v0, v2, v2, v3, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1446
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_1
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .line 1537
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    .line 1540
    iget-object v1, p0, Ll/۬ۧ֫;->ۧ֫:Ll/ܺۧ֫;

    invoke-virtual {v1, p1}, Ll/ܺۧ֫;->ۧ(Landroid/view/MotionEvent;)Z

    move-result v2

    iget-object v3, p0, Ll/۬ۧ֫;->ۡ֫:Ll/ܺۧ֫;

    .line 1541
    invoke-virtual {v3, p1}, Ll/ܺۧ֫;->ۧ(Landroid/view/MotionEvent;)Z

    move-result v3

    or-int/2addr v2, v3

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v0, :cond_3

    if-eq v0, v3, :cond_1

    const/4 p1, 0x2

    if-eq v0, p1, :cond_0

    const/4 p1, 0x3

    if-eq v0, p1, :cond_1

    goto :goto_0

    .line 1563
    :cond_0
    invoke-virtual {v1}, Ll/ܺۧ֫;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 1564
    iget-object p1, p0, Ll/۬ۧ֫;->֫֫:Ll/ۗۧ֫;

    invoke-virtual {p1}, Ll/ۗۧ֫;->ۧ()V

    .line 1565
    iget-object p1, p0, Ll/۬ۧ֫;->ۢ֫:Ll/ۗۧ֫;

    invoke-virtual {p1}, Ll/ۗۧ֫;->ۧ()V

    goto :goto_0

    .line 1572
    :cond_1
    invoke-virtual {p0, v3}, Ll/۬ۧ֫;->֫(Z)V

    .line 1573
    iput-boolean v4, p0, Ll/۬ۧ֫;->ۗ:Z

    :cond_2
    :goto_0
    const/4 p1, 0x0

    goto :goto_2

    .line 1547
    :cond_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 1548
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    .line 1549
    iput v0, p0, Ll/۬ۧ֫;->᩺:F

    .line 1550
    iput p1, p0, Ll/۬ۧ֫;->ܰ:F

    .line 1551
    iget v5, p0, Ll/۬ۧ֫;->ۖ֫:F

    const/4 v6, 0x0

    cmpl-float v5, v5, v6

    if-lez v5, :cond_4

    float-to-int v0, v0

    float-to-int p1, p1

    .line 1552
    invoke-virtual {v1, v0, p1}, Ll/ܺۧ֫;->֫(II)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 1553
    invoke-static {p1}, Ll/۬ۧ֫;->ܿ(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x1

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    .line 1557
    :goto_1
    iput-boolean v4, p0, Ll/۬ۧ֫;->ۗ:Z

    :goto_2
    if-nez v2, :cond_8

    if-nez p1, :cond_8

    .line 1950
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    const/4 v0, 0x0

    :goto_3
    if-ge v0, p1, :cond_6

    .line 1952
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Ll/ܶۧ֫;

    .line 1953
    iget-boolean v1, v1, Ll/ܶۧ֫;->ۧ:Z

    if-eqz v1, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 1577
    :cond_6
    iget-boolean p1, p0, Ll/۬ۧ֫;->ۗ:Z

    if-eqz p1, :cond_7

    goto :goto_4

    :cond_7
    return v4

    :cond_8
    :goto_4
    return v3
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 2020
    invoke-virtual {p0}, Ll/۬ۧ֫;->ۧ()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2052
    invoke-virtual {p2}, Landroid/view/KeyEvent;->startTracking()V

    const/4 p1, 0x1

    return p1

    .line 2055
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_2

    .line 2061
    invoke-virtual {p0}, Ll/۬ۧ֫;->ۧ()Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    .line 2062
    invoke-virtual {p0, p1}, Ll/۬ۧ֫;->֫(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_0

    .line 1682
    invoke-virtual {p0, p2}, Ll/۬ۧ֫;->֫(Z)V

    :cond_0
    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return p2

    .line 2067
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onLayout(ZIIII)V
    .locals 16

    move-object/from16 v0, p0

    const/4 v1, 0x1

    .line 1250
    iput-boolean v1, v0, Ll/۬ۧ֫;->ۨ:Z

    sub-int v1, p4, p2

    .line 1252
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_b

    .line 1254
    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 1256
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v6

    const/16 v7, 0x8

    if-ne v6, v7, :cond_0

    goto/16 :goto_6

    .line 1260
    :cond_0
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Ll/ܶۧ֫;

    .line 1262
    invoke-static {v5}, Ll/۬ۧ֫;->ܿ(Landroid/view/View;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 1263
    iget v7, v6, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v8, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 1264
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    add-int/2addr v9, v7

    iget v6, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 1265
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v10

    add-int/2addr v10, v6

    .line 1263
    invoke-virtual {v5, v7, v8, v9, v10}, Landroid/view/View;->layout(IIII)V

    goto/16 :goto_6

    .line 1267
    :cond_1
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    .line 1268
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v8

    const/4 v9, 0x3

    .line 1272
    invoke-virtual {v0, v9, v5}, Ll/۬ۧ֫;->֫(ILandroid/view/View;)Z

    move-result v9

    if-eqz v9, :cond_2

    neg-int v9, v7

    int-to-float v10, v7

    .line 1273
    iget v11, v6, Ll/ܶۧ֫;->ܽ:F

    mul-float v11, v11, v10

    float-to-int v11, v11

    add-int/2addr v9, v11

    add-int v11, v7, v9

    int-to-float v11, v11

    div-float/2addr v11, v10

    goto :goto_1

    :cond_2
    int-to-float v9, v7

    .line 1276
    iget v10, v6, Ll/ܶۧ֫;->ܽ:F

    mul-float v10, v10, v9

    float-to-int v10, v10

    sub-int v10, v1, v10

    sub-int v11, v1, v10

    int-to-float v11, v11

    div-float/2addr v11, v9

    move v9, v10

    .line 1280
    :goto_1
    iget v10, v6, Ll/ܶۧ֫;->ܽ:F

    cmpl-float v10, v11, v10

    if-eqz v10, :cond_3

    const/4 v10, 0x1

    goto :goto_2

    :cond_3
    const/4 v10, 0x0

    .line 1282
    :goto_2
    iget v12, v6, Ll/ܶۧ֫;->֫:I

    and-int/lit8 v12, v12, 0x70

    const/16 v13, 0x10

    if-eq v12, v13, :cond_5

    const/16 v13, 0x50

    if-eq v12, v13, :cond_4

    .line 1287
    iget v12, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v7, v9

    add-int/2addr v8, v12

    invoke-virtual {v5, v9, v12, v7, v8}, Landroid/view/View;->layout(IIII)V

    goto :goto_4

    :cond_4
    sub-int v8, p5, p3

    .line 1294
    iget v12, v6, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int v12, v8, v12

    .line 1295
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v13

    sub-int/2addr v12, v13

    add-int/2addr v7, v9

    iget v13, v6, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v8, v13

    .line 1294
    invoke-virtual {v5, v9, v12, v7, v8}, Landroid/view/View;->layout(IIII)V

    goto :goto_4

    :cond_5
    sub-int v12, p5, p3

    sub-int v13, v12, v8

    .line 1303
    div-int/lit8 v13, v13, 0x2

    .line 1307
    iget v14, v6, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ge v13, v14, :cond_6

    move v13, v14

    goto :goto_3

    :cond_6
    add-int v14, v13, v8

    .line 1309
    iget v15, v6, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v12, v15

    if-le v14, v12, :cond_7

    sub-int v13, v12, v8

    :cond_7
    :goto_3
    add-int/2addr v7, v9

    add-int/2addr v8, v13

    .line 1312
    invoke-virtual {v5, v9, v13, v7, v8}, Landroid/view/View;->layout(IIII)V

    :goto_4
    if-eqz v10, :cond_8

    .line 1319
    invoke-virtual {v0, v11, v5}, Ll/۬ۧ֫;->ۧ(FLandroid/view/View;)V

    .line 1322
    :cond_8
    iget v6, v6, Ll/ܶۧ֫;->ܽ:F

    const/4 v7, 0x0

    cmpl-float v6, v6, v7

    if-lez v6, :cond_9

    const/4 v6, 0x0

    goto :goto_5

    :cond_9
    const/4 v6, 0x4

    .line 1323
    :goto_5
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-eq v7, v6, :cond_a

    .line 1324
    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    :cond_a
    :goto_6
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 1329
    :cond_b
    sget-boolean v1, Ll/۬ۧ֫;->۠֫:Z

    if-eqz v1, :cond_c

    .line 1331
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getRootWindowInsets()Landroid/view/WindowInsets;

    move-result-object v1

    if-eqz v1, :cond_c

    const/4 v2, 0x0

    .line 148
    invoke-static {v2, v1}, Ll/᩸ܰ;->֫(Landroid/view/View;Landroid/view/WindowInsets;)Ll/᩸ܰ;

    move-result-object v1

    .line 1335
    invoke-virtual {v1}, Ll/᩸ܰ;->ܳ()Ll/ۧ۬;

    move-result-object v1

    .line 1340
    iget-object v2, v0, Ll/۬ۧ֫;->ۧ֫:Ll/ܺۧ֫;

    invoke-virtual {v2}, Ll/ܺۧ֫;->ܳ()I

    move-result v4

    iget v5, v1, Ll/ۧ۬;->ۧ:I

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 1339
    invoke-virtual {v2, v4}, Ll/ܺۧ֫;->ۧ(I)V

    .line 1342
    iget-object v2, v0, Ll/۬ۧ֫;->ۡ֫:Ll/ܺۧ֫;

    invoke-virtual {v2}, Ll/ܺۧ֫;->ܳ()I

    move-result v4

    iget v1, v1, Ll/ۧ۬;->ܽ:I

    invoke-static {v4, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 1341
    invoke-virtual {v2, v1}, Ll/ܺۧ֫;->ۧ(I)V

    .line 1346
    :cond_c
    iput-boolean v3, v0, Ll/۬ۧ֫;->ۨ:Z

    .line 1347
    iput-boolean v3, v0, Ll/۬ۧ֫;->ۛ:Z

    return-void
.end method

.method public onMeasure(II)V
    .locals 16

    move-object/from16 v0, p0

    .line 1072
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 1073
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    .line 1074
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v3

    .line 1075
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    const/high16 v5, 0x40000000    # 2.0f

    if-ne v1, v5, :cond_0

    if-eq v2, v5, :cond_2

    .line 1078
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isInEditMode()Z

    move-result v5

    if-eqz v5, :cond_14

    if-nez v1, :cond_1

    const/16 v3, 0x12c

    :cond_1
    if-nez v2, :cond_2

    const/16 v4, 0x12c

    .line 1095
    :cond_2
    invoke-virtual {v0, v3, v4}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 1097
    iget-object v1, v0, Ll/۬ۧ֫;->۟:Ljava/lang/Object;

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    sget v1, Ll/ܿ᩺;->֫:I

    .line 2854
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    .line 1098
    :goto_0
    sget v5, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v5

    .line 1104
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_1
    if-ge v7, v6, :cond_13

    .line 1106
    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    .line 1108
    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    move-result v11

    const/16 v12, 0x8

    if-ne v11, v12, :cond_4

    goto/16 :goto_5

    .line 1112
    :cond_4
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Ll/ܶۧ֫;

    const/4 v12, 0x3

    if-eqz v1, :cond_a

    .line 1115
    iget v13, v11, Ll/ܶۧ֫;->֫:I

    .line 134
    invoke-static {v13, v5}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v13

    .line 2854
    invoke-virtual {v10}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v14

    const/4 v15, 0x5

    if-eqz v14, :cond_7

    .line 1118
    iget-object v14, v0, Ll/۬ۧ֫;->۟:Ljava/lang/Object;

    check-cast v14, Landroid/view/WindowInsets;

    if-ne v13, v12, :cond_5

    .line 1120
    invoke-virtual {v14}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    move-result v12

    .line 1121
    invoke-virtual {v14}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v13

    .line 1122
    invoke-virtual {v14}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v15

    .line 1120
    invoke-virtual {v14, v12, v13, v2, v15}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;

    move-result-object v14

    goto :goto_2

    :cond_5
    if-ne v13, v15, :cond_6

    .line 1124
    invoke-virtual {v14}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v12

    .line 1125
    invoke-virtual {v14}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    move-result v13

    .line 1126
    invoke-virtual {v14}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v15

    .line 1124
    invoke-virtual {v14, v2, v12, v13, v15}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;

    move-result-object v14

    .line 1128
    :cond_6
    :goto_2
    invoke-virtual {v10, v14}, Landroid/view/View;->dispatchApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    goto :goto_4

    .line 1132
    :cond_7
    iget-object v12, v0, Ll/۬ۧ֫;->۟:Ljava/lang/Object;

    check-cast v12, Landroid/view/WindowInsets;

    const/4 v14, 0x3

    if-ne v13, v14, :cond_8

    .line 1134
    invoke-virtual {v12}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    move-result v13

    .line 1135
    invoke-virtual {v12}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v14

    .line 1136
    invoke-virtual {v12}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v15

    .line 1134
    invoke-virtual {v12, v13, v14, v2, v15}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;

    move-result-object v12

    goto :goto_3

    :cond_8
    if-ne v13, v15, :cond_9

    .line 1138
    invoke-virtual {v12}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v13

    .line 1139
    invoke-virtual {v12}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    move-result v14

    .line 1140
    invoke-virtual {v12}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v15

    .line 1138
    invoke-virtual {v12, v2, v13, v14, v15}, Landroid/view/WindowInsets;->replaceSystemWindowInsets(IIII)Landroid/view/WindowInsets;

    move-result-object v12

    .line 1142
    :cond_9
    :goto_3
    invoke-virtual {v12}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    move-result v13

    iput v13, v11, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 1143
    invoke-virtual {v12}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v13

    iput v13, v11, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 1144
    invoke-virtual {v12}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    move-result v13

    iput v13, v11, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 1145
    invoke-virtual {v12}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v12

    iput v12, v11, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 1150
    :cond_a
    :goto_4
    invoke-static {v10}, Ll/۬ۧ֫;->ܿ(Landroid/view/View;)Z

    move-result v12

    if-eqz v12, :cond_b

    .line 1152
    iget v12, v11, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    sub-int v12, v3, v12

    iget v13, v11, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr v12, v13

    const/high16 v13, 0x40000000    # 2.0f

    invoke-static {v12, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v12

    .line 1154
    iget v14, v11, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int v14, v4, v14

    iget v11, v11, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v14, v11

    invoke-static {v14, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    .line 1156
    invoke-virtual {v10, v12, v11}, Landroid/view/View;->measure(II)V

    :goto_5
    move/from16 v14, p1

    move/from16 v15, p2

    goto :goto_9

    .line 1157
    :cond_b
    invoke-static {v10}, Ll/۬ۧ֫;->᩻(Landroid/view/View;)Z

    move-result v12

    if-eqz v12, :cond_12

    .line 1158
    sget-boolean v12, Ll/۬ۧ֫;->ۚ֫:Z

    if-eqz v12, :cond_c

    .line 1159
    invoke-static {v10}, Ll/ܿ᩺;->ۜ(Landroid/view/View;)F

    move-result v12

    iget v13, v0, Ll/۬ۧ֫;->۫:F

    cmpl-float v12, v12, v13

    if-eqz v12, :cond_c

    .line 1160
    invoke-static {v10, v13}, Ll/ܿ᩺;->֫(Landroid/view/View;F)V

    .line 1164
    :cond_c
    invoke-virtual {v0, v10}, Ll/۬ۧ֫;->ۧ(Landroid/view/View;)I

    move-result v12

    and-int/lit8 v12, v12, 0x7

    const/4 v13, 0x3

    if-ne v12, v13, :cond_d

    const/4 v13, 0x1

    goto :goto_6

    :cond_d
    const/4 v13, 0x0

    :goto_6
    if-eqz v13, :cond_e

    if-nez v8, :cond_f

    :cond_e
    if-nez v13, :cond_10

    if-nez v9, :cond_f

    goto :goto_7

    .line 1170
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Child drawer has absolute gravity "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1171
    invoke-static {v12}, Ll/۬ۧ֫;->᩻(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, " but this DrawerLayout already has a drawer view along that edge"

    .line 0
    invoke-static {v2, v3, v4}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1171
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    :goto_7
    if-eqz v13, :cond_11

    const/4 v8, 0x1

    goto :goto_8

    :cond_11
    const/4 v9, 0x1

    .line 1179
    :goto_8
    iget v12, v0, Ll/۬ۧ֫;->ۜ֫:I

    iget v13, v11, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v12, v13

    iget v13, v11, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v12, v13

    iget v13, v11, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    move/from16 v14, p1

    invoke-static {v14, v12, v13}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v12

    .line 1182
    iget v13, v11, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v15, v11, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v13, v15

    iget v11, v11, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    move/from16 v15, p2

    invoke-static {v15, v13, v11}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v11

    .line 1185
    invoke-virtual {v10, v12, v11}, Landroid/view/View;->measure(II)V

    :goto_9
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_1

    .line 1187
    :cond_12
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Child "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " at index "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_13
    return-void

    .line 1090
    :cond_14
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "DrawerLayout must be measured with MeasureSpec.EXACTLY."

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 3

    .line 2072
    instance-of v0, p1, Ll/᩹ۧ֫;

    if-nez v0, :cond_0

    .line 2073
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    .line 2077
    :cond_0
    check-cast p1, Ll/᩹ۧ֫;

    .line 2078
    invoke-virtual {p1}, Ll/۟֫֫;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 2080
    iget v0, p1, Ll/᩹ۧ֫;->ۗ:I

    if-eqz v0, :cond_1

    .line 2081
    invoke-virtual {p0, v0}, Ll/۬ۧ֫;->ۧ(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1731
    invoke-virtual {p0, v0}, Ll/۬ۧ֫;->ܽ(Landroid/view/View;)V

    .line 2087
    :cond_1
    iget v0, p1, Ll/᩹ۧ֫;->᩹:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    .line 2088
    invoke-virtual {p0, v0, v1}, Ll/۬ۧ֫;->֫(II)V

    .line 2090
    :cond_2
    iget v0, p1, Ll/᩹ۧ֫;->᩶:I

    if-eq v0, v1, :cond_3

    const/4 v2, 0x5

    .line 2091
    invoke-virtual {p0, v0, v2}, Ll/۬ۧ֫;->֫(II)V

    .line 2093
    :cond_3
    iget v0, p1, Ll/᩹ۧ֫;->ۙ:I

    if-eq v0, v1, :cond_4

    const v2, 0x800003

    .line 2094
    invoke-virtual {p0, v0, v2}, Ll/۬ۧ֫;->֫(II)V

    .line 2096
    :cond_4
    iget p1, p1, Ll/᩹ۧ֫;->᩸:I

    if-eq p1, v1, :cond_5

    const v0, 0x800005

    .line 2097
    invoke-virtual {p0, p1, v0}, Ll/۬ۧ֫;->֫(II)V

    :cond_5
    return-void
.end method

.method public final onRtlPropertiesChanged(I)V
    .locals 0

    .line 1195
    sget-boolean p1, Ll/۬ۧ֫;->ۚ֫:Z

    if-eqz p1, :cond_0

    return-void

    .line 1203
    :cond_0
    sget p1, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 8

    .line 2103
    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    .line 2104
    new-instance v1, Ll/᩹ۧ֫;

    invoke-direct {v1, v0}, Ll/᩹ۧ֫;-><init>(Landroid/os/Parcelable;)V

    .line 2106
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_4

    .line 2108
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 2109
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Ll/ܶۧ֫;

    .line 2111
    iget v4, v3, Ll/ܶۧ֫;->ᩳ:I

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    const/4 v6, 0x1

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_1
    const/4 v7, 0x2

    if-ne v4, v7, :cond_1

    goto :goto_2

    :cond_1
    const/4 v5, 0x0

    :goto_2
    if-nez v6, :cond_3

    if-eqz v5, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2117
    :cond_3
    :goto_3
    iget v0, v3, Ll/ܶۧ֫;->֫:I

    iput v0, v1, Ll/᩹ۧ֫;->ۗ:I

    .line 2122
    :cond_4
    iget v0, p0, Ll/۬ۧ֫;->ܿ֫:I

    iput v0, v1, Ll/᩹ۧ֫;->᩹:I

    .line 2123
    iget v0, p0, Ll/۬ۧ֫;->ܳ֫:I

    iput v0, v1, Ll/᩹ۧ֫;->᩶:I

    .line 2124
    iget v0, p0, Ll/۬ۧ֫;->᩻֫:I

    iput v0, v1, Ll/᩹ۧ֫;->ۙ:I

    .line 2125
    iget v0, p0, Ll/۬ۧ֫;->ᩳ֫:I

    iput v0, v1, Ll/᩹ۧ֫;->᩸:I

    return-object v1
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1619
    iget-object v0, p0, Ll/۬ۧ֫;->ۧ֫:Ll/ܺۧ֫;

    invoke-virtual {v0, p1}, Ll/ܺۧ֫;->֫(Landroid/view/MotionEvent;)V

    .line 1620
    iget-object v1, p0, Ll/۬ۧ֫;->ۡ֫:Ll/ܺۧ֫;

    invoke-virtual {v1, p1}, Ll/ܺۧ֫;->֫(Landroid/view/MotionEvent;)V

    .line 1622
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    and-int/lit16 v1, v1, 0xff

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_6

    if-eq v1, v3, :cond_1

    const/4 p1, 0x3

    if-eq v1, p1, :cond_0

    return v3

    .line 1656
    :cond_0
    invoke-virtual {p0, v3}, Ll/۬ۧ֫;->֫(Z)V

    .line 1657
    iput-boolean v2, p0, Ll/۬ۧ֫;->ۗ:Z

    return v3

    .line 1635
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    .line 1636
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int v4, v1

    float-to-int v5, p1

    .line 1638
    invoke-virtual {v0, v4, v5}, Ll/ܺۧ֫;->֫(II)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 1639
    invoke-static {v4}, Ll/۬ۧ֫;->ܿ(Landroid/view/View;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 1640
    iget v4, p0, Ll/۬ۧ֫;->᩺:F

    sub-float/2addr v1, v4

    .line 1641
    iget v4, p0, Ll/۬ۧ֫;->ܰ:F

    sub-float/2addr p1, v4

    .line 1642
    invoke-virtual {v0}, Ll/ܺۧ֫;->ۜ()I

    move-result v0

    mul-float v1, v1, v1

    mul-float p1, p1, p1

    add-float/2addr p1, v1

    mul-int v0, v0, v0

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gez p1, :cond_4

    .line 996
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_3

    .line 998
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 999
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Ll/ܶۧ֫;

    .line 1000
    iget v4, v4, Ll/ܶۧ֫;->ᩳ:I

    and-int/2addr v4, v3

    if-ne v4, v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_4

    .line 1647
    invoke-virtual {p0, v1}, Ll/۬ۧ֫;->֫(Landroid/view/View;)I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_5

    :cond_4
    const/4 v2, 0x1

    .line 1651
    :cond_5
    invoke-virtual {p0, v2}, Ll/۬ۧ֫;->֫(Z)V

    return v3

    .line 1626
    :cond_6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 1627
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    .line 1628
    iput v0, p0, Ll/۬ۧ֫;->᩺:F

    .line 1629
    iput p1, p0, Ll/۬ۧ֫;->ܰ:F

    .line 1630
    iput-boolean v2, p0, Ll/۬ۧ֫;->ۗ:Z

    return v3
.end method

.method public final requestDisallowInterceptTouchEvent(Z)V
    .locals 0

    .line 1671
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    .line 1674
    invoke-virtual {p0, p1}, Ll/۬ۧ֫;->֫(Z)V

    :cond_0
    return-void
.end method

.method public final requestLayout()V
    .locals 1

    .line 1352
    iget-boolean v0, p0, Ll/۬ۧ֫;->ۨ:Z

    if-nez v0, :cond_0

    .line 1353
    invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V

    :cond_0
    return-void
.end method

.method public final ֫(Landroid/view/View;)I
    .locals 3

    .line 741
    invoke-static {p1}, Ll/۬ۧ֫;->᩻(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 744
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܶۧ֫;

    iget p1, p1, Ll/ܶۧ֫;->֫:I

    .line 745
    invoke-virtual {p0, p1}, Ll/۬ۧ֫;->ܽ(I)I

    move-result p1

    return p1

    .line 742
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "View "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not a drawer"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫()V
    .locals 9

    .line 2036
    iget-boolean v0, p0, Ll/۬ۧ֫;->ۗ:Z

    if-nez v0, :cond_1

    .line 2037
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-wide v1, v3

    .line 2038
    invoke-static/range {v1 .. v8}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v0

    .line 2040
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 2042
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2044
    :cond_0
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    const/4 v0, 0x1

    .line 2045
    iput-boolean v0, p0, Ll/۬ۧ֫;->ۗ:Z

    :cond_1
    return-void
.end method

.method public final ֫(FLandroid/view/View;)V
    .locals 2

    .line 978
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܶۧ֫;

    iget v0, v0, Ll/ܶۧ֫;->ܽ:F

    .line 1009
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    mul-float v0, v0, v1

    float-to-int v0, v0

    mul-float v1, v1, p1

    float-to-int v1, v1

    sub-int/2addr v1, v0

    const/4 v0, 0x3

    .line 1015
    invoke-virtual {p0, v0, p2}, Ll/۬ۧ֫;->֫(ILandroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    neg-int v1, v1

    .line 1014
    :goto_0
    invoke-virtual {p2, v1}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 1016
    invoke-virtual {p0, p1, p2}, Ll/۬ۧ֫;->ۧ(FLandroid/view/View;)V

    return-void
.end method

.method public final ֫(I)V
    .locals 3

    .line 1862
    invoke-virtual {p0, p1}, Ll/۬ۧ֫;->ۧ(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    .line 1867
    invoke-virtual {p0, v0, p1}, Ll/۬ۧ֫;->֫(Landroid/view/View;Z)V

    return-void

    .line 1864
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No drawer view found with gravity "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1865
    invoke-static {p1}, Ll/۬ۧ֫;->᩻(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(II)V
    .locals 3

    .line 609
    sget v0, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    .line 134
    invoke-static {p2, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v0

    const/4 v1, 0x3

    if-eq p2, v1, :cond_3

    const/4 v2, 0x5

    if-eq p2, v2, :cond_2

    const v2, 0x800003

    if-eq p2, v2, :cond_1

    const v2, 0x800005

    if-eq p2, v2, :cond_0

    goto :goto_0

    .line 622
    :cond_0
    iput p1, p0, Ll/۬ۧ֫;->ᩳ֫:I

    goto :goto_0

    .line 619
    :cond_1
    iput p1, p0, Ll/۬ۧ֫;->᩻֫:I

    goto :goto_0

    .line 616
    :cond_2
    iput p1, p0, Ll/۬ۧ֫;->ܳ֫:I

    goto :goto_0

    .line 613
    :cond_3
    iput p1, p0, Ll/۬ۧ֫;->ܿ֫:I

    :goto_0
    if-eqz p1, :cond_5

    if-ne v0, v1, :cond_4

    .line 628
    iget-object p2, p0, Ll/۬ۧ֫;->ۧ֫:Ll/ܺۧ֫;

    goto :goto_1

    :cond_4
    iget-object p2, p0, Ll/۬ۧ֫;->ۡ֫:Ll/ܺۧ֫;

    .line 629
    :goto_1
    invoke-virtual {p2}, Ll/ܺۧ֫;->ۧ()V

    :cond_5
    const/4 p2, 0x1

    if-eq p1, p2, :cond_7

    const/4 p2, 0x2

    if-eq p1, p2, :cond_6

    goto :goto_2

    .line 633
    :cond_6
    invoke-virtual {p0, v0}, Ll/۬ۧ֫;->ۧ(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 1731
    invoke-virtual {p0, p1}, Ll/۬ۧ֫;->ܽ(Landroid/view/View;)V

    return-void

    .line 639
    :cond_7
    invoke-virtual {p0, v0}, Ll/۬ۧ֫;->ۧ(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 1809
    invoke-virtual {p0, p1, p2}, Ll/۬ۧ֫;->֫(Landroid/view/View;Z)V

    :cond_8
    :goto_2
    return-void
.end method

.method public final ֫(Landroid/view/View;Z)V
    .locals 4

    .line 1819
    invoke-static {p1}, Ll/۬ۧ֫;->᩻(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1823
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܶۧ֫;

    .line 1824
    iget-boolean v1, p0, Ll/۬ۧ֫;->ۛ:Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    .line 1825
    iput v3, v0, Ll/ܶۧ֫;->ܽ:F

    .line 1826
    iput v2, v0, Ll/ܶۧ֫;->ᩳ:I

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    if-eqz p2, :cond_2

    .line 1828
    iget p2, v0, Ll/ܶۧ֫;->ᩳ:I

    or-int/2addr p2, v1

    iput p2, v0, Ll/ܶۧ֫;->ᩳ:I

    const/4 p2, 0x3

    .line 1830
    invoke-virtual {p0, p2, p1}, Ll/۬ۧ֫;->֫(ILandroid/view/View;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 1831
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p2

    neg-int p2, p2

    .line 1832
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    .line 1831
    iget-object v1, p0, Ll/۬ۧ֫;->ۧ֫:Ll/ܺۧ֫;

    invoke-virtual {v1, p1, p2, v0}, Ll/ܺۧ֫;->֫(Landroid/view/View;II)Z

    goto :goto_0

    .line 1834
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    iget-object v1, p0, Ll/۬ۧ֫;->ۡ֫:Ll/ܺۧ֫;

    invoke-virtual {v1, p1, p2, v0}, Ll/ܺۧ֫;->֫(Landroid/view/View;II)Z

    goto :goto_0

    .line 1837
    :cond_2
    invoke-virtual {p0, v3, p1}, Ll/۬ۧ֫;->֫(FLandroid/view/View;)V

    .line 1838
    invoke-virtual {p0, v2, p1}, Ll/۬ۧ֫;->ܽ(ILandroid/view/View;)V

    .line 1839
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1841
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    .line 1820
    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "View "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not a sliding drawer"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final ֫(Landroid/view/WindowInsets;Z)V
    .locals 0

    .line 437
    iput-object p1, p0, Ll/۬ۧ֫;->۟:Ljava/lang/Object;

    .line 438
    iput-boolean p2, p0, Ll/۬ۧ֫;->۬:Z

    if-nez p2, :cond_0

    .line 439
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 440
    invoke-virtual {p0}, Ll/۬ۧ֫;->requestLayout()V

    return-void
.end method

.method public final ֫(Ll/۠ۧ֫;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 546
    :cond_0
    iget-object v0, p0, Ll/۬ۧ֫;->ܽ֫:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    .line 547
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۬ۧ֫;->ܽ֫:Ljava/util/ArrayList;

    .line 549
    :cond_1
    iget-object v0, p0, Ll/۬ۧ֫;->ܽ֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ֫(Z)V
    .locals 9

    .line 1687
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    .line 1689
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 1690
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Ll/ܶۧ֫;

    .line 1692
    invoke-static {v4}, Ll/۬ۧ֫;->᩻(Landroid/view/View;)Z

    move-result v6

    if-eqz v6, :cond_2

    if-eqz p1, :cond_0

    iget-boolean v6, v5, Ll/ܶۧ֫;->ۧ:Z

    if-nez v6, :cond_0

    goto :goto_2

    .line 1696
    :cond_0
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v6

    const/4 v7, 0x3

    .line 1698
    invoke-virtual {p0, v7, v4}, Ll/۬ۧ֫;->֫(ILandroid/view/View;)Z

    move-result v7

    if-eqz v7, :cond_1

    neg-int v6, v6

    .line 1700
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v7

    .line 1699
    iget-object v8, p0, Ll/۬ۧ֫;->ۧ֫:Ll/ܺۧ֫;

    invoke-virtual {v8, v4, v6, v7}, Ll/ܺۧ֫;->֫(Landroid/view/View;II)Z

    move-result v4

    goto :goto_1

    .line 1703
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v6

    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v7

    .line 1702
    iget-object v8, p0, Ll/۬ۧ֫;->ۡ֫:Ll/ܺۧ֫;

    invoke-virtual {v8, v4, v6, v7}, Ll/ܺۧ֫;->֫(Landroid/view/View;II)Z

    move-result v4

    :goto_1
    or-int/2addr v3, v4

    .line 1706
    iput-boolean v1, v5, Ll/ܶۧ֫;->ۧ:Z

    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1709
    :cond_3
    iget-object p1, p0, Ll/۬ۧ֫;->֫֫:Ll/ۗۧ֫;

    invoke-virtual {p1}, Ll/ۗۧ֫;->ۧ()V

    .line 1710
    iget-object p1, p0, Ll/۬ۧ֫;->ۢ֫:Ll/ۗۧ֫;

    invoke-virtual {p1}, Ll/ۗۧ֫;->ۧ()V

    if-eqz v3, :cond_4

    .line 1713
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_4
    return-void
.end method

.method public final ֫(ILandroid/view/View;)Z
    .locals 0

    .line 991
    invoke-virtual {p0, p2}, Ll/۬ۧ֫;->ۧ(Landroid/view/View;)I

    move-result p2

    and-int/2addr p2, p1

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(Landroid/view/View;)I
    .locals 1

    .line 986
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܶۧ֫;

    iget p1, p1, Ll/ܶۧ֫;->֫:I

    .line 987
    sget v0, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    .line 134
    invoke-static {p1, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result p1

    return p1
.end method

.method public final ۧ()Landroid/view/View;
    .locals 4

    .line 2024
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 2026
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 2027
    invoke-static {v2}, Ll/۬ۧ֫;->᩻(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v2}, Ll/۬ۧ֫;->ۜ(Landroid/view/View;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۧ(I)Landroid/view/View;
    .locals 4

    .line 1027
    sget v0, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    .line 134
    invoke-static {p1, v0}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result p1

    and-int/lit8 p1, p1, 0x7

    .line 1028
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 1030
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1031
    invoke-virtual {p0, v2}, Ll/۬ۧ֫;->ۧ(Landroid/view/View;)I

    move-result v3

    and-int/lit8 v3, v3, 0x7

    if-ne v3, p1, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۧ(FLandroid/view/View;)V
    .locals 2

    .line 968
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܶۧ֫;

    .line 969
    iget v1, v0, Ll/ܶۧ֫;->ܽ:F

    cmpl-float v1, p1, v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 973
    :cond_0
    iput p1, v0, Ll/ܶۧ֫;->ܽ:F

    .line 957
    iget-object v0, p0, Ll/۬ۧ֫;->ܽ֫:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 960
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    .line 962
    iget-object v1, p0, Ll/۬ۧ֫;->ܽ֫:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۠ۧ֫;

    invoke-interface {v1, p2, p1}, Ll/۠ۧ֫;->onDrawerSlide(Landroid/view/View;F)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final ۧ(ILandroid/view/View;)V
    .locals 2

    .line 667
    invoke-static {p2}, Ll/۬ۧ֫;->᩻(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 671
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Ll/ܶۧ֫;

    iget p2, p2, Ll/ܶۧ֫;->֫:I

    .line 672
    invoke-virtual {p0, p1, p2}, Ll/۬ۧ֫;->֫(II)V

    return-void

    .line 668
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "View "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " is not a drawer with appropriate layout_gravity"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(Ll/۠ۧ֫;)V
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    .line 563
    :cond_0
    iget-object v0, p0, Ll/۬ۧ֫;->ܽ֫:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    :goto_0
    return-void

    .line 567
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܳ(I)V
    .locals 0

    .line 506
    iput p1, p0, Ll/۬ۧ֫;->ܺ֫:I

    .line 507
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ܽ(I)I
    .locals 3

    .line 684
    sget v0, Ll/ܿ᩺;->֫:I

    .line 1977
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x3

    if-eq p1, v1, :cond_9

    const/4 v2, 0x5

    if-eq p1, v2, :cond_6

    const v2, 0x800003

    if-eq p1, v2, :cond_3

    const v2, 0x800005

    if-eq p1, v2, :cond_0

    goto :goto_4

    .line 718
    :cond_0
    iget p1, p0, Ll/۬ۧ֫;->ᩳ֫:I

    if-eq p1, v1, :cond_1

    return p1

    :cond_1
    if-nez v0, :cond_2

    .line 722
    iget p1, p0, Ll/۬ۧ֫;->ܳ֫:I

    goto :goto_0

    :cond_2
    iget p1, p0, Ll/۬ۧ֫;->ܿ֫:I

    :goto_0
    if-eq p1, v1, :cond_c

    return p1

    .line 708
    :cond_3
    iget p1, p0, Ll/۬ۧ֫;->᩻֫:I

    if-eq p1, v1, :cond_4

    return p1

    :cond_4
    if-nez v0, :cond_5

    .line 712
    iget p1, p0, Ll/۬ۧ֫;->ܿ֫:I

    goto :goto_1

    :cond_5
    iget p1, p0, Ll/۬ۧ֫;->ܳ֫:I

    :goto_1
    if-eq p1, v1, :cond_c

    return p1

    .line 698
    :cond_6
    iget p1, p0, Ll/۬ۧ֫;->ܳ֫:I

    if-eq p1, v1, :cond_7

    return p1

    :cond_7
    if-nez v0, :cond_8

    .line 702
    iget p1, p0, Ll/۬ۧ֫;->ᩳ֫:I

    goto :goto_2

    :cond_8
    iget p1, p0, Ll/۬ۧ֫;->᩻֫:I

    :goto_2
    if-eq p1, v1, :cond_c

    return p1

    .line 688
    :cond_9
    iget p1, p0, Ll/۬ۧ֫;->ܿ֫:I

    if-eq p1, v1, :cond_a

    return p1

    :cond_a
    if-nez v0, :cond_b

    .line 692
    iget p1, p0, Ll/۬ۧ֫;->᩻֫:I

    goto :goto_3

    :cond_b
    iget p1, p0, Ll/۬ۧ֫;->ᩳ֫:I

    :goto_3
    if-eq p1, v1, :cond_c

    return p1

    :cond_c
    :goto_4
    const/4 p1, 0x0

    return p1
.end method

.method public final ܽ(ILandroid/view/View;)V
    .locals 5

    .line 846
    iget-object v0, p0, Ll/۬ۧ֫;->ۧ֫:Ll/ܺۧ֫;

    invoke-virtual {v0}, Ll/ܺۧ֫;->᩷()I

    move-result v0

    .line 847
    iget-object v1, p0, Ll/۬ۧ֫;->ۡ֫:Ll/ܺۧ֫;

    invoke-virtual {v1}, Ll/ܺۧ֫;->᩷()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v3, :cond_2

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    if-eq v0, v4, :cond_3

    if-ne v1, v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v4, 0x1

    :cond_3
    :goto_1
    if-eqz p2, :cond_7

    if-nez p1, :cond_7

    .line 859
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܶۧ֫;

    .line 860
    iget p1, p1, Ll/ܶۧ֫;->ܽ:F

    const/4 v0, 0x0

    const/16 v1, 0x20

    cmpl-float v0, p1, v0

    if-nez v0, :cond_5

    .line 882
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܶۧ֫;

    .line 883
    iget v0, p1, Ll/ܶۧ֫;->ᩳ:I

    and-int/2addr v0, v3

    if-ne v0, v3, :cond_7

    .line 884
    iput v2, p1, Ll/ܶۧ֫;->ᩳ:I

    .line 886
    iget-object p1, p0, Ll/۬ۧ֫;->ܽ֫:Ljava/util/ArrayList;

    if-eqz p1, :cond_4

    .line 889
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v3

    :goto_2
    if-ltz p1, :cond_4

    .line 891
    iget-object v0, p0, Ll/۬ۧ֫;->ܽ֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠ۧ֫;

    invoke-interface {v0, p2}, Ll/۠ۧ֫;->onDrawerClosed(Landroid/view/View;)V

    add-int/lit8 p1, p1, -0x1

    goto :goto_2

    .line 895
    :cond_4
    invoke-direct {p0, p2, v2}, Ll/۬ۧ֫;->ۧ(Landroid/view/View;Z)V

    .line 896
    invoke-direct {p0, p2}, Ll/۬ۧ֫;->᩷(Landroid/view/View;)V

    .line 901
    invoke-virtual {p0}, Landroid/view/View;->hasWindowFocus()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 902
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_7

    .line 904
    invoke-virtual {p1, v1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    goto :goto_4

    :cond_5
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float p1, p1, v0

    if-nez p1, :cond_7

    .line 911
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܶۧ֫;

    .line 912
    iget v0, p1, Ll/ܶۧ֫;->ᩳ:I

    and-int/2addr v0, v3

    if-nez v0, :cond_7

    .line 913
    iput v3, p1, Ll/ܶۧ֫;->ᩳ:I

    .line 914
    iget-object p1, p0, Ll/۬ۧ֫;->ܽ֫:Ljava/util/ArrayList;

    if-eqz p1, :cond_6

    .line 917
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v3

    :goto_3
    if-ltz p1, :cond_6

    .line 919
    iget-object v0, p0, Ll/۬ۧ֫;->ܽ֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠ۧ֫;

    invoke-interface {v0, p2}, Ll/۠ۧ֫;->onDrawerOpened(Landroid/view/View;)V

    add-int/lit8 p1, p1, -0x1

    goto :goto_3

    .line 923
    :cond_6
    invoke-direct {p0, p2, v3}, Ll/۬ۧ֫;->ۧ(Landroid/view/View;Z)V

    .line 924
    invoke-direct {p0, p2}, Ll/۬ۧ֫;->᩷(Landroid/view/View;)V

    .line 927
    invoke-virtual {p0}, Landroid/view/View;->hasWindowFocus()Z

    move-result p1

    if-eqz p1, :cond_7

    .line 928
    invoke-virtual {p0, v1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    .line 867
    :cond_7
    :goto_4
    iget p1, p0, Ll/۬ۧ֫;->ۤ:I

    if-eq v4, p1, :cond_8

    .line 868
    iput v4, p0, Ll/۬ۧ֫;->ۤ:I

    .line 870
    iget-object p1, p0, Ll/۬ۧ֫;->ܽ֫:Ljava/util/ArrayList;

    if-eqz p1, :cond_8

    .line 873
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v3

    :goto_5
    if-ltz p1, :cond_8

    .line 875
    iget-object p2, p0, Ll/۬ۧ֫;->ܽ֫:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۠ۧ֫;

    invoke-interface {p2, v4}, Ll/۠ۧ֫;->onDrawerStateChanged(I)V

    add-int/lit8 p1, p1, -0x1

    goto :goto_5

    :cond_8
    return-void
.end method

.method public final ܽ(Landroid/view/View;)V
    .locals 3

    .line 1741
    invoke-static {p1}, Ll/۬ۧ֫;->᩻(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1745
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܶۧ֫;

    .line 1746
    iget-boolean v1, p0, Ll/۬ۧ֫;->ۛ:Z

    if-eqz v1, :cond_0

    const/high16 v1, 0x3f800000    # 1.0f

    .line 1747
    iput v1, v0, Ll/ܶۧ֫;->ܽ:F

    const/4 v1, 0x1

    .line 1748
    iput v1, v0, Ll/ܶۧ֫;->ᩳ:I

    .line 1750
    invoke-direct {p0, p1, v1}, Ll/۬ۧ֫;->ۧ(Landroid/view/View;Z)V

    .line 1751
    invoke-direct {p0, p1}, Ll/۬ۧ֫;->᩷(Landroid/view/View;)V

    goto :goto_0

    .line 1753
    :cond_0
    iget v1, v0, Ll/ܶۧ֫;->ᩳ:I

    or-int/lit8 v1, v1, 0x2

    iput v1, v0, Ll/ܶۧ֫;->ᩳ:I

    const/4 v0, 0x3

    .line 1755
    invoke-virtual {p0, v0, p1}, Ll/۬ۧ֫;->֫(ILandroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1756
    iget-object v0, p0, Ll/۬ۧ֫;->ۧ֫:Ll/ܺۧ֫;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, v1}, Ll/ܺۧ֫;->֫(Landroid/view/View;II)Z

    goto :goto_0

    .line 1758
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    .line 1759
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    .line 1758
    iget-object v2, p0, Ll/۬ۧ֫;->ۡ֫:Ll/ܺۧ֫;

    invoke-virtual {v2, p1, v0, v1}, Ll/ܺۧ֫;->֫(Landroid/view/View;II)Z

    .line 1766
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void

    .line 1742
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "View "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not a sliding drawer"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ()Z
    .locals 1

    const v0, 0x800003

    .line 1942
    invoke-virtual {p0, v0}, Ll/۬ۧ֫;->ۧ(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1944
    invoke-static {v0}, Ll/۬ۧ֫;->ۜ(Landroid/view/View;)Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ(I)V
    .locals 3

    .line 1787
    invoke-virtual {p0, p1}, Ll/۬ۧ֫;->ۧ(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1792
    invoke-virtual {p0, v0}, Ll/۬ۧ֫;->ܽ(Landroid/view/View;)V

    return-void

    .line 1789
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No drawer view found with gravity "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1790
    invoke-static {p1}, Ll/۬ۧ֫;->᩻(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩳ(I)Z
    .locals 0

    .line 1911
    invoke-virtual {p0, p1}, Ll/۬ۧ֫;->ۧ(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 1913
    invoke-static {p1}, Ll/۬ۧ֫;->ܳ(Landroid/view/View;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
