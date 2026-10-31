.class public final Ll/᩷ۖᩳ;
.super Landroid/widget/BaseAdapter;
.source "U5MD"

# interfaces
.implements Landroid/widget/Filterable;


# instance fields
.field public ۗ:Ljava/util/List;

.field public ۙ:Ll/ۜۖᩳ;

.field public final synthetic ۫:Ll/ۡۖᩳ;

.field public ۬:[Landroid/text/style/RelativeSizeSpan;

.field public ᩶:Ll/۫ۡ᩷;

.field public ᩸:Landroid/text/style/ForegroundColorSpan;

.field public ᩹:Landroid/text/style/ForegroundColorSpan;


# direct methods
.method public constructor <init>(Ll/ۡۖᩳ;Ll/۫ۡ᩷;)V
    .locals 6

    .line 438
    iput-object p1, p0, Ll/᩷ۖᩳ;->۫:Ll/ۡۖᩳ;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 428
    new-instance p1, Landroid/text/style/ForegroundColorSpan;

    sget v0, Ll/᩹֡᩷;->֫:I

    invoke-direct {p1, v0}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    iput-object p1, p0, Ll/᩷ۖᩳ;->᩸:Landroid/text/style/ForegroundColorSpan;

    .line 429
    new-instance p1, Landroid/text/style/ForegroundColorSpan;

    sget v0, Ll/᩹֡᩷;->֫:I

    invoke-direct {p1, v0}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    iput-object p1, p0, Ll/᩷ۖᩳ;->᩹:Landroid/text/style/ForegroundColorSpan;

    .line 430
    new-instance p1, Landroid/text/style/RelativeSizeSpan;

    const v0, 0x3f6b851f    # 0.92f

    invoke-direct {p1, v0}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    new-instance v0, Landroid/text/style/RelativeSizeSpan;

    const v1, 0x3f570a3d    # 0.84f

    invoke-direct {v0, v1}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    new-instance v1, Landroid/text/style/RelativeSizeSpan;

    const v2, 0x3f428f5c    # 0.76f

    invoke-direct {v1, v2}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    new-instance v2, Landroid/text/style/RelativeSizeSpan;

    const v3, 0x3f2e147b    # 0.68f

    invoke-direct {v2, v3}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    new-instance v3, Landroid/text/style/RelativeSizeSpan;

    const v4, 0x3f19999a    # 0.6f

    invoke-direct {v3, v4}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    const/4 v4, 0x5

    new-array v4, v4, [Landroid/text/style/RelativeSizeSpan;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 p1, 0x1

    aput-object v0, v4, p1

    const/4 p1, 0x2

    aput-object v1, v4, p1

    const/4 p1, 0x3

    aput-object v2, v4, p1

    const/4 p1, 0x4

    aput-object v3, v4, p1

    iput-object v4, p0, Ll/᩷ۖᩳ;->۬:[Landroid/text/style/RelativeSizeSpan;

    .line 439
    iput-object p2, p0, Ll/᩷ۖᩳ;->᩶:Ll/۫ۡ᩷;

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 1

    .line 444
    iget-object v0, p0, Ll/᩷ۖᩳ;->ۗ:Ljava/util/List;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final getFilter()Landroid/widget/Filter;
    .locals 1

    .line 497
    iget-object v0, p0, Ll/᩷ۖᩳ;->ۙ:Ll/ۜۖᩳ;

    if-nez v0, :cond_0

    .line 498
    new-instance v0, Ll/ۜۖᩳ;

    invoke-direct {v0, p0}, Ll/ۜۖᩳ;-><init>(Ll/᩷ۖᩳ;)V

    iput-object v0, p0, Ll/᩷ۖᩳ;->ۙ:Ll/ۜۖᩳ;

    .line 500
    :cond_0
    iget-object v0, p0, Ll/᩷ۖᩳ;->ۙ:Ll/ۜۖᩳ;

    return-object v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .line 449
    iget-object v0, p0, Ll/᩷ۖᩳ;->ۗ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6

    const/4 v0, 0x0

    if-nez p2, :cond_0

    .line 461
    iget-object p2, p0, Ll/᩷ۖᩳ;->᩶:Ll/۫ۡ᩷;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0d0153

    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 463
    :cond_0
    move-object p3, p2

    check-cast p3, Landroid/view/ViewGroup;

    invoke-virtual {p3, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 464
    iget-object v1, p0, Ll/᩷ۖᩳ;->ۗ:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/text/SpannableString;

    .line 465
    invoke-virtual {p1}, Landroid/text/SpannableString;->length()I

    move-result v1

    const-class v2, Landroid/text/style/RelativeSizeSpan;

    invoke-virtual {p1, v0, v1, v2}, Landroid/text/SpannableString;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Landroid/text/style/RelativeSizeSpan;

    if-eqz v1, :cond_1

    .line 466
    array-length v2, v1

    if-lez v2, :cond_1

    .line 467
    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 468
    invoke-virtual {p1, v4}, Landroid/text/SpannableString;->removeSpan(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 471
    :cond_1
    iget-object v1, p0, Ll/᩷ۖᩳ;->ۙ:Ll/ۜۖᩳ;

    iget v1, v1, Ll/ۜۖᩳ;->ۧ:I

    if-lez v1, :cond_5

    .line 472
    invoke-virtual {p1}, Landroid/text/SpannableString;->length()I

    move-result v1

    iget-object v2, p0, Ll/᩷ۖᩳ;->ۙ:Ll/ۜۖᩳ;

    iget v2, v2, Ll/ۜۖᩳ;->ۧ:I

    if-lt v1, v2, :cond_3

    const/4 v1, 0x0

    .line 475
    :goto_1
    iget-object v3, p0, Ll/᩷ۖᩳ;->۬:[Landroid/text/style/RelativeSizeSpan;

    array-length v4, v3

    add-int/lit8 v4, v4, -0x1

    const/16 v5, 0x21

    if-ge v1, v4, :cond_2

    if-lez v2, :cond_2

    add-int/lit8 v4, v2, -0x5

    .line 476
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 477
    aget-object v3, v3, v1

    invoke-virtual {p1, v3, v4, v2, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    add-int/lit8 v2, v2, -0x5

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    if-lez v2, :cond_3

    .line 481
    array-length v1, v3

    add-int/lit8 v1, v1, -0x1

    aget-object v1, v3, v1

    invoke-virtual {p1, v1, v0, v2, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 484
    :cond_3
    invoke-virtual {p1}, Landroid/text/SpannableString;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Ll/᩷ۖᩳ;->ۙ:Ll/ۜۖᩳ;

    iget v1, v1, Ll/ۜۖᩳ;->ۧ:I

    if-ge v0, v1, :cond_4

    .line 485
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->START:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    goto :goto_2

    .line 487
    :cond_4
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    goto :goto_2

    .line 489
    :cond_5
    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 490
    :goto_2
    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p2
.end method
