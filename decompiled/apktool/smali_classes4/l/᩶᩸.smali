.class public final Ll/᩶᩸;
.super Ljava/lang/Object;
.source "31AL"


# instance fields
.field public ֫:I

.field public ۧ:F

.field public ܽ:F

.field public ܿ:F

.field public ᩳ:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 5

    .line 296
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 289
    iput v0, p0, Ll/᩶᩸;->ܿ:F

    .line 290
    iput v0, p0, Ll/᩶᩸;->ᩳ:F

    .line 291
    iput v0, p0, Ll/᩶᩸;->ܽ:F

    .line 292
    iput v0, p0, Ll/᩶᩸;->ۧ:F

    const/4 v0, -0x1

    .line 293
    iput v0, p0, Ll/᩶᩸;->֫:I

    .line 297
    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object p2

    .line 298
    sget-object v0, Ll/᩸᩸;->ۗ:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 299
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_5

    .line 305
    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v2

    if-nez v2, :cond_0

    .line 307
    iget v3, p0, Ll/᩶᩸;->֫:I

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    iput v2, p0, Ll/᩶᩸;->֫:I

    .line 308
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getResourceTypeName(I)Ljava/lang/String;

    move-result-object v3

    .line 309
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    const-string v2, "layout"

    .line 311
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    .line 315
    iget v3, p0, Ll/᩶᩸;->ۧ:F

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, p0, Ll/᩶᩸;->ۧ:F

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    .line 317
    iget v3, p0, Ll/᩶᩸;->ᩳ:F

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, p0, Ll/᩶᩸;->ᩳ:F

    goto :goto_1

    :cond_2
    const/4 v3, 0x3

    if-ne v2, v3, :cond_3

    .line 319
    iget v3, p0, Ll/᩶᩸;->ܽ:F

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, p0, Ll/᩶᩸;->ܽ:F

    goto :goto_1

    :cond_3
    const/4 v3, 0x4

    if-ne v2, v3, :cond_4

    .line 321
    iget v3, p0, Ll/᩶᩸;->ܿ:F

    invoke-virtual {p2, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, p0, Ll/᩶᩸;->ܿ:F

    :cond_4
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 326
    :cond_5
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public final ֫(FF)Z
    .locals 3

    .line 349
    iget v0, p0, Ll/᩶᩸;->ܿ:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    return v2

    .line 352
    :cond_0
    iget v0, p0, Ll/᩶᩸;->ᩳ:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_1

    cmpg-float v0, p2, v0

    if-gez v0, :cond_1

    return v2

    .line 355
    :cond_1
    iget v0, p0, Ll/᩶᩸;->ܽ:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_2

    cmpl-float p1, p1, v0

    if-lez p1, :cond_2

    return v2

    .line 358
    :cond_2
    iget p1, p0, Ll/᩶᩸;->ۧ:F

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_3

    cmpl-float p1, p2, p1

    if-lez p1, :cond_3

    return v2

    :cond_3
    const/4 p1, 0x1

    return p1
.end method
