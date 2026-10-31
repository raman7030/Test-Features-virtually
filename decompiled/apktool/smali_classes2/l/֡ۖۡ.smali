.class public final Ll/֡ۖۡ;
.super Landroid/widget/BaseAdapter;
.source "W5L3"


# instance fields
.field public final synthetic ᩸:Ll/ۚۖۡ;


# direct methods
.method public constructor <init>(Ll/ۚۖۡ;)V
    .locals 0

    .line 322
    iput-object p1, p0, Ll/֡ۖۡ;->᩸:Ll/ۚۖۡ;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCount()I
    .locals 5

    .line 326
    iget-object v0, p0, Ll/֡ۖۡ;->᩸:Ll/ۚۖۡ;

    invoke-static {v0}, Ll/ۚۖۡ;->᩻(Ll/ۚۖۡ;)Z

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0xa

    const/16 v4, 0x64

    if-nez v1, :cond_1

    .line 327
    invoke-static {v0}, Ll/ۚۖۡ;->ܳ(Ll/ۚۖۡ;)Ll/֨ۖۡ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨ۖۡ;->ܿ()I

    move-result v1

    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v0}, Ll/ۚۖۡ;->ܳ(Ll/ۚۖۡ;)Ll/֨ۖۡ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֨ۖۡ;->ܿ()I

    move-result v0

    if-le v0, v3, :cond_0

    const/4 v2, 0x1

    :cond_0
    add-int/2addr v1, v2

    return v1

    .line 329
    :cond_1
    invoke-static {v0}, Ll/ۚۖۡ;->ܽ(Ll/ۚۖۡ;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 330
    invoke-static {v0}, Ll/ۚۖۡ;->ᩳ(Ll/ۚۖۡ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    .line 333
    :cond_2
    invoke-static {v0}, Ll/ۚۖۡ;->ᩳ(Ll/ۚۖۡ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0

    .line 335
    :cond_3
    invoke-static {v0}, Ll/ۚۖۡ;->ܳ(Ll/ۚۖۡ;)Ll/֨ۖۡ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨ۖۡ;->ܿ()I

    move-result v1

    if-nez v1, :cond_4

    :goto_0
    const/4 v0, 0x2

    return v0

    .line 338
    :cond_4
    invoke-static {v0}, Ll/ۚۖۡ;->ܳ(Ll/ۚۖۡ;)Ll/֨ۖۡ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨ۖۡ;->ܿ()I

    move-result v1

    invoke-static {v4, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0}, Ll/ۚۖۡ;->ܳ(Ll/ۚۖۡ;)Ll/֨ۖۡ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֨ۖۡ;->ܿ()I

    move-result v0

    if-le v0, v3, :cond_5

    const/4 v2, 0x1

    :cond_5
    add-int/2addr v1, v2

    return v1
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getItemId(I)J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    .line 354
    iget-object v0, p0, Ll/֡ۖۡ;->᩸:Ll/ۚۖۡ;

    if-nez p2, :cond_0

    .line 355
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0d013e

    const/4 v2, 0x0

    invoke-virtual {p2, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 356
    new-instance p3, Ll/᩵ۖۡ;

    invoke-direct {p3, v0, p2}, Ll/᩵ۖۡ;-><init>(Ll/ۚۖۡ;Landroid/view/View;)V

    .line 357
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 359
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/᩵ۖۡ;

    .line 361
    :goto_0
    invoke-static {v0}, Ll/ۚۖۡ;->ܽ(Ll/ۚۖۡ;)Z

    move-result v1

    const/4 v2, 0x4

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    .line 362
    invoke-static {v0}, Ll/ۚۖۡ;->ᩳ(Ll/ۚۖۡ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    if-nez p1, :cond_1

    const p1, 0x7f1206ae

    .line 363
    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    .line 444
    iput v2, p3, Ll/᩵ۖۡ;->ۙ:I

    .line 445
    iget-object v0, p3, Ll/᩵ۖۡ;->᩸:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 446
    iget-object p3, p3, Ll/᩵ۖۡ;->۫:Landroid/widget/TextView;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 447
    sget-object p1, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-object p2

    .line 364
    :cond_1
    invoke-static {v0}, Ll/ۚۖۡ;->ᩳ(Ll/ۚۖۡ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt p1, v1, :cond_2

    const/4 p1, 0x3

    .line 365
    invoke-virtual {p3, p1}, Ll/᩵ۖۡ;->֫(I)V

    return-object p2

    .line 367
    :cond_2
    invoke-static {v0}, Ll/ۚۖۡ;->ᩳ(Ll/ۚۖۡ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۟ܺۡ;

    .line 434
    iput v3, p3, Ll/᩵ۖۡ;->ۙ:I

    .line 435
    iput p1, p3, Ll/᩵ۖۡ;->ۗ:I

    .line 436
    iput-object v0, p3, Ll/᩵ۖۡ;->᩹:Ll/۟ܺۡ;

    .line 437
    iget-object p1, p3, Ll/᩵ۖۡ;->᩸:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 438
    invoke-virtual {v0}, Ll/۟ܺۡ;->֫()Ljava/lang/String;

    move-result-object p1

    .line 439
    iget-object p3, p3, Ll/᩵ۖۡ;->۫:Landroid/widget/TextView;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 440
    sget-object p1, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-object p2

    .line 370
    :cond_3
    invoke-static {v0}, Ll/ۚۖۡ;->᩻(Ll/ۚۖۡ;)Z

    move-result v1

    const/4 v4, 0x5

    const/16 v5, 0x64

    const/16 v6, 0xa

    if-nez v1, :cond_5

    if-lt p1, v6, :cond_4

    .line 371
    invoke-static {v0}, Ll/ۚۖۡ;->ܳ(Ll/ۚۖۡ;)Ll/֨ۖۡ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨ۖۡ;->ܿ()I

    move-result v1

    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-ne p1, v1, :cond_4

    .line 372
    invoke-virtual {p3, v4}, Ll/᩵ۖۡ;->֫(I)V

    return-object p2

    .line 374
    :cond_4
    invoke-static {v0}, Ll/ۚۖۡ;->ܳ(Ll/ۚۖۡ;)Ll/֨ۖۡ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/֨ۖۡ;->֫(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, p1, v0}, Ll/᩵ۖۡ;->֫(ILjava/lang/String;)V

    return-object p2

    .line 376
    :cond_5
    invoke-static {v0}, Ll/ۚۖۡ;->ܳ(Ll/ۚۖۡ;)Ll/֨ۖۡ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨ۖۡ;->ܿ()I

    move-result v1

    const/4 v7, 0x2

    if-nez v1, :cond_7

    if-nez p1, :cond_6

    .line 378
    invoke-virtual {p3, v7}, Ll/᩵ۖۡ;->֫(I)V

    return-object p2

    :cond_6
    const p1, 0x7f1204aa

    .line 380
    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    .line 444
    iput v2, p3, Ll/᩵ۖۡ;->ۙ:I

    .line 445
    iget-object v0, p3, Ll/᩵ۖۡ;->᩸:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 446
    iget-object p3, p3, Ll/᩵ۖۡ;->۫:Landroid/widget/TextView;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 447
    sget-object p1, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-object p2

    :cond_7
    if-nez p1, :cond_8

    .line 383
    invoke-virtual {p3, v7}, Ll/᩵ۖۡ;->֫(I)V

    return-object p2

    :cond_8
    sub-int/2addr p1, v3

    if-lt p1, v6, :cond_9

    .line 385
    invoke-static {v0}, Ll/ۚۖۡ;->ܳ(Ll/ۚۖۡ;)Ll/֨ۖۡ;

    move-result-object v1

    invoke-virtual {v1}, Ll/֨ۖۡ;->ܿ()I

    move-result v1

    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    if-ne p1, v1, :cond_9

    .line 386
    invoke-virtual {p3, v4}, Ll/᩵ۖۡ;->֫(I)V

    return-object p2

    .line 388
    :cond_9
    invoke-static {v0}, Ll/ۚۖۡ;->ܳ(Ll/ۚۖۡ;)Ll/֨ۖۡ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/֨ۖۡ;->֫(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, p1, v0}, Ll/᩵ۖۡ;->֫(ILjava/lang/String;)V

    return-object p2
.end method
