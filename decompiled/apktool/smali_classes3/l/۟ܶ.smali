.class public abstract Ll/۟ܶ;
.super Landroid/view/View;
.source "O1JO"


# instance fields
.field public ۗ:Ljava/lang/String;

.field public ۙ:Ljava/util/HashMap;

.field public ۤ:Landroid/content/Context;

.field public ۫:[Landroid/view/View;

.field public ۬:Ljava/lang/String;

.field public ᩶:[I

.field public ᩸:I

.field public ᩹:Ll/۬۠;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 83
    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/16 v0, 0x20

    new-array v0, v0, [I

    .line 48
    iput-object v0, p0, Ll/۟ܶ;->᩶:[I

    const/4 v0, 0x0

    .line 78
    iput-object v0, p0, Ll/۟ܶ;->۫:[Landroid/view/View;

    .line 80
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Ll/۟ܶ;->ۙ:Ljava/util/HashMap;

    .line 84
    iput-object p1, p0, Ll/۟ܶ;->ۤ:Landroid/content/Context;

    .line 85
    invoke-virtual {p0, v0}, Ll/۟ܶ;->֫(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 89
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 v0, 0x20

    new-array v0, v0, [I

    .line 48
    iput-object v0, p0, Ll/۟ܶ;->᩶:[I

    const/4 v0, 0x0

    .line 78
    iput-object v0, p0, Ll/۟ܶ;->۫:[Landroid/view/View;

    .line 80
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/۟ܶ;->ۙ:Ljava/util/HashMap;

    .line 90
    iput-object p1, p0, Ll/۟ܶ;->ۤ:Landroid/content/Context;

    .line 91
    invoke-virtual {p0, p2}, Ll/۟ܶ;->֫(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 95
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p3, 0x20

    new-array p3, p3, [I

    .line 48
    iput-object p3, p0, Ll/۟ܶ;->᩶:[I

    const/4 p3, 0x0

    .line 78
    iput-object p3, p0, Ll/۟ܶ;->۫:[Landroid/view/View;

    .line 80
    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    iput-object p3, p0, Ll/۟ܶ;->ۙ:Ljava/util/HashMap;

    .line 96
    iput-object p1, p0, Ll/۟ܶ;->ۤ:Landroid/content/Context;

    .line 97
    invoke-virtual {p0, p2}, Ll/۟ܶ;->֫(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private ֫(Ll/ܿ᩸;Ljava/lang/String;)I
    .locals 7

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    .line 371
    iget-object v1, p0, Ll/۟ܶ;->ۤ:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_2

    .line 375
    :cond_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    .line 377
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 378
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_1

    .line 381
    :try_start_0
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v5
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const/4 v5, 0x0

    .line 385
    :goto_1
    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 386
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result p1

    return p1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return v0
.end method

.method private ֫(I)V
    .locals 3

    .line 203
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    if-ne p1, v0, :cond_0

    return-void

    .line 206
    :cond_0
    iget v0, p0, Ll/۟ܶ;->᩸:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Ll/۟ܶ;->᩶:[I

    array-length v2, v1

    if-le v0, v2, :cond_1

    .line 207
    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Ll/۟ܶ;->᩶:[I

    .line 209
    :cond_1
    iget-object v0, p0, Ll/۟ܶ;->᩶:[I

    iget v1, p0, Ll/۟ܶ;->᩸:I

    aput p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    .line 210
    iput v1, p0, Ll/۟ܶ;->᩸:I

    return-void
.end method

.method private ܽ(Ljava/lang/String;)V
    .locals 3

    if-eqz p1, :cond_3

    .line 252
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 255
    :cond_0
    iget-object v0, p0, Ll/۟ܶ;->ۤ:Landroid/content/Context;

    if-nez v0, :cond_1

    goto :goto_0

    .line 259
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 262
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Ll/ܿ᩸;

    if-eqz v0, :cond_2

    .line 263
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Ll/ܿ᩸;

    .line 265
    :cond_2
    invoke-direct {p0, p1}, Ll/۟ܶ;->ܿ(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_3

    .line 267
    iget-object v1, p0, Ll/۟ܶ;->ۙ:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    invoke-direct {p0, v0}, Ll/۟ܶ;->֫(I)V

    :cond_3
    :goto_0
    return-void
.end method

.method private ܿ(Ljava/lang/String;)I
    .locals 5

    .line 320
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Ll/ܿ᩸;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 321
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Ll/ܿ᩸;

    goto :goto_0

    :cond_0
    move-object v0, v1

    .line 326
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    if-eqz v0, :cond_1

    .line 327
    invoke-virtual {v0, v3, p1}, Ll/ܿ᩸;->getDesignInformation(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 328
    instance-of v4, v2, Ljava/lang/Integer;

    if-eqz v4, :cond_1

    .line 329
    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :cond_1
    if-nez v3, :cond_2

    if-eqz v0, :cond_2

    .line 336
    invoke-direct {p0, v0, p1}, Ll/۟ܶ;->֫(Ll/ܿ᩸;Ljava/lang/String;)I

    move-result v3

    :cond_2
    if-nez v3, :cond_3

    .line 341
    :try_start_0
    const-class v0, Ll/ܶ᩸;

    .line 342
    invoke-virtual {v0, p1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 343
    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    :cond_3
    :goto_1
    if-nez v3, :cond_4

    .line 352
    iget-object v0, p0, Ll/۟ܶ;->ۤ:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "id"

    .line 353
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 352
    invoke-virtual {v1, p1, v2, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    :cond_4
    return v3
.end method

.method private ᩳ(Ljava/lang/String;)V
    .locals 6

    if-eqz p1, :cond_6

    .line 278
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_3

    .line 281
    :cond_0
    iget-object v0, p0, Ll/۟ܶ;->ۤ:Landroid/content/Context;

    if-nez v0, :cond_1

    goto :goto_3

    .line 285
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 288
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Ll/ܿ᩸;

    if-eqz v0, :cond_2

    .line 289
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Ll/ܿ᩸;

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_3

    return-void

    .line 295
    :cond_3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_6

    .line 297
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 298
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    .line 299
    instance-of v5, v4, Ll/ܽ᩸;

    if-eqz v5, :cond_5

    .line 300
    check-cast v4, Ll/ܽ᩸;

    .line 301
    iget-object v4, v4, Ll/ܽ᩸;->᩷:Ljava/lang/String;

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 302
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_4

    goto :goto_2

    .line 305
    :cond_4
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    move-result v3

    invoke-direct {p0, v3}, Ll/۟ܶ;->֫(I)V

    :cond_5
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    :goto_3
    return-void
.end method


# virtual methods
.method public onAttachedToWindow()V
    .locals 1

    .line 123
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 124
    iget-object v0, p0, Ll/۟ܶ;->ۗ:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 125
    invoke-virtual {p0, v0}, Ll/۟ܶ;->֫(Ljava/lang/String;)V

    .line 127
    :cond_0
    iget-object v0, p0, Ll/۟ܶ;->۬:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 128
    invoke-virtual {p0, v0}, Ll/۟ܶ;->ۧ(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    return-void
.end method

.method public onMeasure(II)V
    .locals 0

    const/4 p1, 0x0

    .line 229
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final setTag(ILjava/lang/Object;)V
    .locals 0

    .line 598
    invoke-super {p0, p1, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    if-nez p2, :cond_0

    .line 599
    iget-object p2, p0, Ll/۟ܶ;->ۗ:Ljava/lang/String;

    if-nez p2, :cond_0

    .line 600
    invoke-direct {p0, p1}, Ll/۟ܶ;->֫(I)V

    :cond_0
    return-void
.end method

.method public final ֫()V
    .locals 2

    .line 461
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 462
    instance-of v1, v0, Ll/ܿ᩸;

    if-eqz v1, :cond_0

    .line 463
    check-cast v0, Ll/ܿ᩸;

    invoke-virtual {p0, v0}, Ll/۟ܶ;->֫(Ll/ܿ᩸;)V

    :cond_0
    return-void
.end method

.method public ֫(Landroid/util/AttributeSet;)V
    .locals 4

    if-eqz p1, :cond_3

    .line 105
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Ll/᩸᩸;->ۧ:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 106
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    .line 108
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    const/16 v3, 0x13

    if-ne v2, v3, :cond_0

    .line 110
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Ll/۟ܶ;->ۗ:Ljava/lang/String;

    .line 111
    invoke-virtual {p0, v2}, Ll/۟ܶ;->֫(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    const/16 v3, 0x14

    if-ne v2, v3, :cond_1

    .line 113
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Ll/۟ܶ;->۬:Ljava/lang/String;

    .line 114
    invoke-virtual {p0, v2}, Ll/۟ܶ;->ۧ(Ljava/lang/String;)V

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 117
    :cond_2
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_3
    return-void
.end method

.method public final ֫(Landroid/widget/TextView;)V
    .locals 2

    if-ne p1, p0, :cond_0

    goto :goto_0

    .line 142
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 146
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_2

    :goto_0
    return-void

    :cond_2
    const/4 v0, 0x0

    .line 150
    iput-object v0, p0, Ll/۟ܶ;->ۗ:Ljava/lang/String;

    .line 151
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    invoke-direct {p0, p1}, Ll/۟ܶ;->֫(I)V

    .line 152
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 3

    .line 397
    iput-object p1, p0, Ll/۟ܶ;->ۗ:Ljava/lang/String;

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 402
    iput v0, p0, Ll/۟ܶ;->᩸:I

    :goto_0
    const/16 v1, 0x2c

    .line 404
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    .line 406
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/۟ܶ;->ܽ(Ljava/lang/String;)V

    return-void

    .line 409
    :cond_1
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/۟ܶ;->ܽ(Ljava/lang/String;)V

    add-int/lit8 v0, v1, 0x1

    goto :goto_0
.end method

.method public final ֫(Ll/۬۠;Landroid/util/SparseArray;)V
    .locals 2

    .line 505
    invoke-virtual {p1}, Ll/۬۠;->ܳ֫()V

    const/4 v0, 0x0

    .line 506
    :goto_0
    iget v1, p0, Ll/۟ܶ;->᩸:I

    if-ge v0, v1, :cond_0

    .line 507
    iget-object v1, p0, Ll/۟ܶ;->᩶:[I

    aget v1, v1, v0

    .line 508
    invoke-virtual {p2, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܶ۠;

    invoke-virtual {p1, v1}, Ll/۬۠;->֫(Ll/ܶ۠;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public ֫(Ll/ܶ۠;Z)V
    .locals 0

    return-void
.end method

.method public ֫(Ll/ܿ᩸;)V
    .locals 5

    .line 440
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    .line 443
    invoke-virtual {p0}, Landroid/view/View;->getElevation()F

    move-result v1

    const/4 v2, 0x0

    .line 445
    :goto_0
    iget v3, p0, Ll/۟ܶ;->᩸:I

    if-ge v2, v3, :cond_1

    .line 446
    iget-object v3, p0, Ll/۟ܶ;->᩶:[I

    aget v3, v3, v2

    .line 447
    invoke-virtual {p1, v3}, Ll/ܿ᩸;->getViewById(I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 449
    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    const/4 v4, 0x0

    cmpl-float v4, v1, v4

    if-lez v4, :cond_0

    .line 451
    invoke-virtual {v3}, Landroid/view/View;->getTranslationZ()F

    move-result v4

    add-float/2addr v4, v1

    invoke-virtual {v3, v4}, Landroid/view/View;->setTranslationZ(F)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public ֫(Ll/᩷᩸;Ll/۬۠;Ll/ᩴ᩸;Landroid/util/SparseArray;)V
    .locals 6

    .line 554
    iget-object p1, p1, Ll/᩷᩸;->֫:Ll/ۢ᩸;

    iget-object p3, p1, Ll/ۢ᩸;->ۢ֫:[I

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    .line 555
    invoke-virtual {p0, p3}, Ll/۟ܶ;->֫([I)V

    goto :goto_1

    .line 556
    :cond_0
    iget-object p3, p1, Ll/ۢ᩸;->᩷֫:Ljava/lang/String;

    if-eqz p3, :cond_4

    .line 557
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    if-lez p3, :cond_4

    .line 558
    iget-object p3, p1, Ll/ۢ᩸;->᩷֫:Ljava/lang/String;

    const-string v1, ","

    .line 574
    invoke-virtual {p3, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p3

    .line 575
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 576
    array-length v1, p3

    new-array v1, v1, [I

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 578
    :goto_0
    array-length v4, p3

    if-ge v2, v4, :cond_2

    .line 579
    aget-object v4, p3, v2

    .line 580
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 581
    invoke-direct {p0, v4}, Ll/۟ܶ;->ܿ(Ljava/lang/String;)I

    move-result v4

    if-eqz v4, :cond_1

    add-int/lit8 v5, v3, 0x1

    .line 583
    aput v4, v1, v3

    move v3, v5

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 586
    :cond_2
    array-length p3, p3

    if-eq v3, p3, :cond_3

    .line 587
    invoke-static {v1, v3}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    .line 558
    :cond_3
    iput-object v1, p1, Ll/ۢ᩸;->ۢ֫:[I

    .line 561
    :cond_4
    :goto_1
    invoke-virtual {p2}, Ll/۬۠;->ܳ֫()V

    .line 562
    iget-object p3, p1, Ll/ۢ᩸;->ۢ֫:[I

    if-eqz p3, :cond_6

    .line 563
    :goto_2
    iget-object p3, p1, Ll/ۢ᩸;->ۢ֫:[I

    array-length v1, p3

    if-ge v0, v1, :cond_6

    .line 564
    aget p3, p3, v0

    .line 565
    invoke-virtual {p4, p3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ܶ۠;

    if-eqz p3, :cond_5

    .line 567
    invoke-virtual {p2, p3}, Ll/۬۠;->֫(Ll/ܶ۠;)V

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_6
    return-void
.end method

.method public final ֫([I)V
    .locals 2

    const/4 v0, 0x0

    .line 192
    iput-object v0, p0, Ll/۟ܶ;->ۗ:Ljava/lang/String;

    const/4 v0, 0x0

    .line 193
    iput v0, p0, Ll/۟ܶ;->᩸:I

    .line 194
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    .line 195
    aget v1, p1, v0

    invoke-direct {p0, v1}, Ll/۟ܶ;->֫(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public ۧ()V
    .locals 0

    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 3

    .line 417
    iput-object p1, p0, Ll/۟ܶ;->۬:Ljava/lang/String;

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 422
    iput v0, p0, Ll/۟ܶ;->᩸:I

    :goto_0
    const/16 v1, 0x2c

    .line 424
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    .line 426
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/۟ܶ;->ᩳ(Ljava/lang/String;)V

    return-void

    .line 429
    :cond_1
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/۟ܶ;->ᩳ(Ljava/lang/String;)V

    add-int/lit8 v0, v1, 0x1

    goto :goto_0
.end method

.method public final ۧ(Ll/ܿ᩸;)[Landroid/view/View;
    .locals 3

    .line 514
    iget-object v0, p0, Ll/۟ܶ;->۫:[Landroid/view/View;

    if-eqz v0, :cond_0

    array-length v0, v0

    iget v1, p0, Ll/۟ܶ;->᩸:I

    if-eq v0, v1, :cond_1

    .line 515
    :cond_0
    iget v0, p0, Ll/۟ܶ;->᩸:I

    new-array v0, v0, [Landroid/view/View;

    iput-object v0, p0, Ll/۟ܶ;->۫:[Landroid/view/View;

    :cond_1
    const/4 v0, 0x0

    .line 518
    :goto_0
    iget v1, p0, Ll/۟ܶ;->᩸:I

    if-ge v0, v1, :cond_2

    .line 519
    iget-object v1, p0, Ll/۟ܶ;->᩶:[I

    aget v1, v1, v0

    .line 520
    iget-object v2, p0, Ll/۟ܶ;->۫:[Landroid/view/View;

    invoke-virtual {p1, v1}, Ll/ܿ᩸;->getViewById(I)Landroid/view/View;

    move-result-object v1

    aput-object v1, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 522
    :cond_2
    iget-object p1, p0, Ll/۟ܶ;->۫:[Landroid/view/View;

    return-object p1
.end method

.method public final ܽ()V
    .locals 2

    .line 238
    iget-object v0, p0, Ll/۟ܶ;->᩹:Ll/۬۠;

    if-nez v0, :cond_0

    goto :goto_0

    .line 241
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 242
    instance-of v1, v0, Ll/ܽ᩸;

    if-eqz v1, :cond_1

    .line 243
    check-cast v0, Ll/ܽ᩸;

    .line 244
    iget-object v1, p0, Ll/۟ܶ;->᩹:Ll/۬۠;

    iput-object v1, v0, Ll/ܽ᩸;->ۛ֫:Ll/ܶ۠;

    :cond_1
    :goto_0
    return-void
.end method

.method public ܽ(Ll/ܿ᩸;)V
    .locals 0

    return-void
.end method

.method public final ᩳ(Ll/ܿ᩸;)V
    .locals 5

    .line 474
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 475
    iget-object v0, p0, Ll/۟ܶ;->ۗ:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ll/۟ܶ;->֫(Ljava/lang/String;)V

    .line 477
    :cond_0
    iget-object v0, p0, Ll/۟ܶ;->᩹:Ll/۬۠;

    if-nez v0, :cond_1

    return-void

    .line 480
    :cond_1
    invoke-virtual {v0}, Ll/۬۠;->ܳ֫()V

    const/4 v0, 0x0

    .line 481
    :goto_0
    iget v1, p0, Ll/۟ܶ;->᩸:I

    if-ge v0, v1, :cond_4

    .line 482
    iget-object v1, p0, Ll/۟ܶ;->᩶:[I

    aget v1, v1, v0

    .line 483
    invoke-virtual {p1, v1}, Ll/ܿ᩸;->getViewById(I)Landroid/view/View;

    move-result-object v2

    if-nez v2, :cond_2

    .line 487
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v3, p0, Ll/۟ܶ;->ۙ:Ljava/util/HashMap;

    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 488
    invoke-direct {p0, p1, v1}, Ll/۟ܶ;->֫(Ll/ܿ᩸;Ljava/lang/String;)I

    move-result v4

    if-eqz v4, :cond_2

    .line 490
    iget-object v2, p0, Ll/۟ܶ;->᩶:[I

    aput v4, v2, v0

    .line 491
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 492
    invoke-virtual {p1, v4}, Ll/ܿ᩸;->getViewById(I)Landroid/view/View;

    move-result-object v2

    :cond_2
    if-eqz v2, :cond_3

    .line 496
    iget-object v1, p0, Ll/۟ܶ;->᩹:Ll/۬۠;

    invoke-virtual {p1, v2}, Ll/ܿ᩸;->getViewWidget(Landroid/view/View;)Ll/ܶ۠;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/۬۠;->֫(Ll/ܶ۠;)V

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 499
    :cond_4
    iget-object p1, p0, Ll/۟ܶ;->᩹:Ll/۬۠;

    invoke-virtual {p1}, Ll/۬۠;->᩻֫()V

    return-void
.end method
