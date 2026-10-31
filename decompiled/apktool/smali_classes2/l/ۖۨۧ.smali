.class public Ll/ۖۨۧ;
.super Ll/ܽۨۧ;
.source "A5H1"


# instance fields
.field public ۗ:Ljava/util/ArrayList;

.field public ۙ:Z

.field public ᩶:Z

.field public ᩸:I

.field public ᩹:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 111
    invoke-direct {p0}, Ll/ܽۨۧ;-><init>()V

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 82
    iput-boolean v0, p0, Ll/ۖۨۧ;->᩶:Z

    const/4 v0, 0x0

    .line 85
    iput-boolean v0, p0, Ll/ۖۨۧ;->ۙ:Z

    .line 89
    iput v0, p0, Ll/ۖۨۧ;->᩸:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 115
    invoke-direct {p0, p1, p2}, Ll/ܽۨۧ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    const/4 v0, 0x1

    .line 82
    iput-boolean v0, p0, Ll/ۖۨۧ;->᩶:Z

    const/4 v0, 0x0

    .line 85
    iput-boolean v0, p0, Ll/ۖۨۧ;->ۙ:Z

    .line 89
    iput v0, p0, Ll/ۖۨۧ;->᩸:I

    .line 116
    sget-object v1, Ll/ܶۛۧ;->ܳ:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 117
    check-cast p2, Landroid/content/res/XmlResourceParser;

    const-string v1, "transitionOrdering"

    invoke-static {p1, p2, v1, v0, v0}, Ll/ۗۗ;->֫(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result p2

    .line 120
    invoke-virtual {p0, p2}, Ll/ۖۨۧ;->ܽ(I)V

    .line 121
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public final addListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;
    .locals 0

    .line 306
    invoke-super {p0, p1}, Ll/ܽۨۧ;->addListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    move-result-object p1

    check-cast p1, Ll/ۖۨۧ;

    return-object p1
.end method

.method public final addTarget(I)Ll/ܽۨۧ;
    .locals 2

    const/4 v0, 0x0

    .line 279
    :goto_0
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 280
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۨۧ;

    invoke-virtual {v1, p1}, Ll/ܽۨۧ;->addTarget(I)Ll/ܽۨۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 282
    :cond_0
    invoke-super {p0, p1}, Ll/ܽۨۧ;->addTarget(I)Ll/ܽۨۧ;

    move-result-object p1

    check-cast p1, Ll/ۖۨۧ;

    return-object p1
.end method

.method public final addTarget(Landroid/view/View;)Ll/ܽۨۧ;
    .locals 2

    const/4 v0, 0x0

    .line 270
    :goto_0
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 271
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۨۧ;

    invoke-virtual {v1, p1}, Ll/ܽۨۧ;->addTarget(Landroid/view/View;)Ll/ܽۨۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 273
    :cond_0
    invoke-super {p0, p1}, Ll/ܽۨۧ;->addTarget(Landroid/view/View;)Ll/ܽۨۧ;

    move-result-object p1

    check-cast p1, Ll/ۖۨۧ;

    return-object p1
.end method

.method public final addTarget(Ljava/lang/Class;)Ll/ܽۨۧ;
    .locals 2

    const/4 v0, 0x0

    .line 297
    :goto_0
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 298
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۨۧ;

    invoke-virtual {v1, p1}, Ll/ܽۨۧ;->addTarget(Ljava/lang/Class;)Ll/ܽۨۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 300
    :cond_0
    invoke-super {p0, p1}, Ll/ܽۨۧ;->addTarget(Ljava/lang/Class;)Ll/ܽۨۧ;

    move-result-object p1

    check-cast p1, Ll/ۖۨۧ;

    return-object p1
.end method

.method public final addTarget(Ljava/lang/String;)Ll/ܽۨۧ;
    .locals 2

    const/4 v0, 0x0

    .line 288
    :goto_0
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 289
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۨۧ;

    invoke-virtual {v1, p1}, Ll/ܽۨۧ;->addTarget(Ljava/lang/String;)Ll/ܽۨۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 291
    :cond_0
    invoke-super {p0, p1}, Ll/ܽۨۧ;->addTarget(Ljava/lang/String;)Ll/ܽۨۧ;

    move-result-object p1

    check-cast p1, Ll/ۖۨۧ;

    return-object p1
.end method

.method public final cancel()V
    .locals 3

    .line 704
    invoke-super {p0}, Ll/ܽۨۧ;->cancel()V

    .line 705
    iget-object v0, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 707
    iget-object v2, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۨۧ;

    invoke-virtual {v2}, Ll/ܽۨۧ;->cancel()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final captureEndValues(Ll/᩵ۨۧ;)V
    .locals 3

    .line 658
    iget-object v0, p1, Ll/᩵ۨۧ;->ܽ:Landroid/view/View;

    invoke-virtual {p0, v0}, Ll/ܽۨۧ;->isValidTarget(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 659
    iget-object v0, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۨۧ;

    .line 660
    iget-object v2, p1, Ll/᩵ۨۧ;->ܽ:Landroid/view/View;

    invoke-virtual {v1, v2}, Ll/ܽۨۧ;->isValidTarget(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 661
    invoke-virtual {v1, p1}, Ll/ܽۨۧ;->captureEndValues(Ll/᩵ۨۧ;)V

    .line 662
    iget-object v2, p1, Ll/᩵ۨۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final capturePropagationValues(Ll/᩵ۨۧ;)V
    .locals 3

    .line 670
    invoke-super {p0, p1}, Ll/ܽۨۧ;->capturePropagationValues(Ll/᩵ۨۧ;)V

    .line 671
    iget-object v0, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 673
    iget-object v2, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۨۧ;

    invoke-virtual {v2, p1}, Ll/ܽۨۧ;->capturePropagationValues(Ll/᩵ۨۧ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final captureStartValues(Ll/᩵ۨۧ;)V
    .locals 3

    .line 646
    iget-object v0, p1, Ll/᩵ۨۧ;->ܽ:Landroid/view/View;

    invoke-virtual {p0, v0}, Ll/ܽۨۧ;->isValidTarget(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 647
    iget-object v0, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۨۧ;

    .line 648
    iget-object v2, p1, Ll/᩵ۨۧ;->ܽ:Landroid/view/View;

    invoke-virtual {v1, v2}, Ll/ܽۨۧ;->isValidTarget(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 649
    invoke-virtual {v1, p1}, Ll/ܽۨۧ;->captureStartValues(Ll/᩵ۨۧ;)V

    .line 650
    iget-object v2, p1, Ll/᩵ۨۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 63
    invoke-virtual {p0}, Ll/ۖۨۧ;->clone()Ll/ܽۨۧ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/ܽۨۧ;
    .locals 5

    .line 762
    invoke-super {p0}, Ll/ܽۨۧ;->clone()Ll/ܽۨۧ;

    move-result-object v0

    check-cast v0, Ll/ۖۨۧ;

    .line 763
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    .line 764
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 766
    iget-object v3, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܽۨۧ;

    invoke-virtual {v3}, Ll/ܽۨۧ;->clone()Ll/ܽۨۧ;

    move-result-object v3

    .line 198
    iget-object v4, v0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    iput-object v0, v3, Ll/ܽۨۧ;->mParent:Ll/ۖۨۧ;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final createAnimators(Landroid/view/ViewGroup;Ll/֡ۨۧ;Ll/֡ۨۧ;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 12

    move-object v0, p0

    .line 462
    invoke-virtual {p0}, Ll/ܽۨۧ;->getStartDelay()J

    move-result-wide v1

    .line 463
    iget-object v3, v0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    .line 465
    iget-object v5, v0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ll/ܽۨۧ;

    const-wide/16 v7, 0x0

    cmp-long v5, v1, v7

    if-lez v5, :cond_2

    .line 468
    iget-boolean v5, v0, Ll/ۖۨۧ;->᩶:Z

    if-nez v5, :cond_0

    if-nez v4, :cond_2

    .line 469
    :cond_0
    invoke-virtual {v6}, Ll/ܽۨۧ;->getStartDelay()J

    move-result-wide v9

    cmp-long v5, v9, v7

    if-lez v5, :cond_1

    add-long/2addr v9, v1

    .line 471
    invoke-virtual {v6, v9, v10}, Ll/ܽۨۧ;->setStartDelay(J)Ll/ܽۨۧ;

    goto :goto_1

    .line 473
    :cond_1
    invoke-virtual {v6, v1, v2}, Ll/ܽۨۧ;->setStartDelay(J)Ll/ܽۨۧ;

    :cond_2
    :goto_1
    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    .line 476
    invoke-virtual/range {v6 .. v11}, Ll/ܽۨۧ;->createAnimators(Landroid/view/ViewGroup;Ll/֡ۨۧ;Ll/֡ۨۧ;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final excludeTarget(IZ)Ll/ܽۨۧ;
    .locals 2

    const/4 v0, 0x0

    .line 366
    :goto_0
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 367
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۨۧ;

    invoke-virtual {v1, p1, p2}, Ll/ܽۨۧ;->excludeTarget(IZ)Ll/ܽۨۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 369
    :cond_0
    invoke-super {p0, p1, p2}, Ll/ܽۨۧ;->excludeTarget(IZ)Ll/ܽۨۧ;

    move-result-object p1

    return-object p1
.end method

.method public final excludeTarget(Landroid/view/View;Z)Ll/ܽۨۧ;
    .locals 2

    const/4 v0, 0x0

    .line 348
    :goto_0
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 349
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۨۧ;

    invoke-virtual {v1, p1, p2}, Ll/ܽۨۧ;->excludeTarget(Landroid/view/View;Z)Ll/ܽۨۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 351
    :cond_0
    invoke-super {p0, p1, p2}, Ll/ܽۨۧ;->excludeTarget(Landroid/view/View;Z)Ll/ܽۨۧ;

    move-result-object p1

    return-object p1
.end method

.method public final excludeTarget(Ljava/lang/Class;Z)Ll/ܽۨۧ;
    .locals 2

    const/4 v0, 0x0

    .line 375
    :goto_0
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 376
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۨۧ;

    invoke-virtual {v1, p1, p2}, Ll/ܽۨۧ;->excludeTarget(Ljava/lang/Class;Z)Ll/ܽۨۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 378
    :cond_0
    invoke-super {p0, p1, p2}, Ll/ܽۨۧ;->excludeTarget(Ljava/lang/Class;Z)Ll/ܽۨۧ;

    move-result-object p1

    return-object p1
.end method

.method public final excludeTarget(Ljava/lang/String;Z)Ll/ܽۨۧ;
    .locals 2

    const/4 v0, 0x0

    .line 357
    :goto_0
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 358
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۨۧ;

    invoke-virtual {v1, p1, p2}, Ll/ܽۨۧ;->excludeTarget(Ljava/lang/String;Z)Ll/ܽۨۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 360
    :cond_0
    invoke-super {p0, p1, p2}, Ll/ܽۨۧ;->excludeTarget(Ljava/lang/String;Z)Ll/ܽۨۧ;

    move-result-object p1

    return-object p1
.end method

.method public final forceToEnd(Landroid/view/ViewGroup;)V
    .locals 3

    .line 714
    invoke-super {p0, p1}, Ll/ܽۨۧ;->forceToEnd(Landroid/view/ViewGroup;)V

    .line 715
    iget-object v0, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 717
    iget-object v2, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۨۧ;

    invoke-virtual {v2, p1}, Ll/ܽۨۧ;->forceToEnd(Landroid/view/ViewGroup;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final hasAnimators()Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 519
    :goto_0
    iget-object v2, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 520
    iget-object v2, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۨۧ;

    .line 521
    invoke-virtual {v2}, Ll/ܽۨۧ;->hasAnimators()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public final isSeekingSupported()Z
    .locals 4

    .line 635
    iget-object v0, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 637
    iget-object v3, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܽۨۧ;

    invoke-virtual {v3}, Ll/ܽۨۧ;->isSeekingSupported()Z

    move-result v3

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public final pause(Landroid/view/View;)V
    .locals 3

    .line 682
    invoke-super {p0, p1}, Ll/ܽۨۧ;->pause(Landroid/view/View;)V

    .line 683
    iget-object v0, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 685
    iget-object v2, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۨۧ;

    invoke-virtual {v2, p1}, Ll/ܽۨۧ;->pause(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final prepareAnimatorsForSeeking()V
    .locals 7

    const-wide/16 v0, 0x0

    .line 531
    iput-wide v0, p0, Ll/ܽۨۧ;->mTotalDuration:J

    .line 532
    new-instance v0, Ll/ۡۨۧ;

    invoke-direct {v0, p0}, Ll/ۡۨۧ;-><init>(Ll/ۖۨۧ;)V

    const/4 v1, 0x0

    .line 543
    :goto_0
    iget-object v2, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 544
    iget-object v2, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۨۧ;

    .line 545
    invoke-virtual {v2, v0}, Ll/ܽۨۧ;->addListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    .line 546
    invoke-virtual {v2}, Ll/ܽۨۧ;->prepareAnimatorsForSeeking()V

    .line 547
    invoke-virtual {v2}, Ll/ܽۨۧ;->getTotalDurationMillis()J

    move-result-wide v3

    .line 548
    iget-boolean v5, p0, Ll/ۖۨۧ;->᩶:Z

    if-eqz v5, :cond_0

    .line 549
    iget-wide v5, p0, Ll/ܽۨۧ;->mTotalDuration:J

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iput-wide v2, p0, Ll/ܽۨۧ;->mTotalDuration:J

    goto :goto_1

    .line 551
    :cond_0
    iget-wide v5, p0, Ll/ܽۨۧ;->mTotalDuration:J

    iput-wide v5, v2, Ll/ܽۨۧ;->mSeekOffsetInParent:J

    add-long/2addr v5, v3

    .line 552
    iput-wide v5, p0, Ll/ܽۨۧ;->mTotalDuration:J

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final removeListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;
    .locals 0

    .line 384
    invoke-super {p0, p1}, Ll/ܽۨۧ;->removeListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    move-result-object p1

    check-cast p1, Ll/ۖۨۧ;

    return-object p1
.end method

.method public final removeTarget(I)Ll/ܽۨۧ;
    .locals 2

    const/4 v0, 0x0

    .line 312
    :goto_0
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 313
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۨۧ;

    invoke-virtual {v1, p1}, Ll/ܽۨۧ;->removeTarget(I)Ll/ܽۨۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 315
    :cond_0
    invoke-super {p0, p1}, Ll/ܽۨۧ;->removeTarget(I)Ll/ܽۨۧ;

    move-result-object p1

    check-cast p1, Ll/ۖۨۧ;

    return-object p1
.end method

.method public final removeTarget(Landroid/view/View;)Ll/ܽۨۧ;
    .locals 2

    const/4 v0, 0x0

    .line 321
    :goto_0
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 322
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۨۧ;

    invoke-virtual {v1, p1}, Ll/ܽۨۧ;->removeTarget(Landroid/view/View;)Ll/ܽۨۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 324
    :cond_0
    invoke-super {p0, p1}, Ll/ܽۨۧ;->removeTarget(Landroid/view/View;)Ll/ܽۨۧ;

    move-result-object p1

    check-cast p1, Ll/ۖۨۧ;

    return-object p1
.end method

.method public final removeTarget(Ljava/lang/Class;)Ll/ܽۨۧ;
    .locals 2

    const/4 v0, 0x0

    .line 330
    :goto_0
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 331
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۨۧ;

    invoke-virtual {v1, p1}, Ll/ܽۨۧ;->removeTarget(Ljava/lang/Class;)Ll/ܽۨۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 333
    :cond_0
    invoke-super {p0, p1}, Ll/ܽۨۧ;->removeTarget(Ljava/lang/Class;)Ll/ܽۨۧ;

    move-result-object p1

    check-cast p1, Ll/ۖۨۧ;

    return-object p1
.end method

.method public final removeTarget(Ljava/lang/String;)Ll/ܽۨۧ;
    .locals 2

    const/4 v0, 0x0

    .line 339
    :goto_0
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 340
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۨۧ;

    invoke-virtual {v1, p1}, Ll/ܽۨۧ;->removeTarget(Ljava/lang/String;)Ll/ܽۨۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 342
    :cond_0
    invoke-super {p0, p1}, Ll/ܽۨۧ;->removeTarget(Ljava/lang/String;)Ll/ܽۨۧ;

    move-result-object p1

    check-cast p1, Ll/ۖۨۧ;

    return-object p1
.end method

.method public final resume(Landroid/view/View;)V
    .locals 3

    .line 694
    invoke-super {p0, p1}, Ll/ܽۨۧ;->resume(Landroid/view/View;)V

    .line 695
    iget-object v0, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 697
    iget-object v2, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۨۧ;

    invoke-virtual {v2, p1}, Ll/ܽۨۧ;->resume(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final runAnimators()V
    .locals 4

    .line 486
    iget-object v0, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 487
    invoke-virtual {p0}, Ll/ܽۨۧ;->start()V

    .line 488
    invoke-virtual {p0}, Ll/ܽۨۧ;->end()V

    return-void

    .line 417
    :cond_0
    new-instance v0, Ll/ܺۨۧ;

    .line 27
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 433
    iput-object p0, v0, Ll/ܺۨۧ;->֫:Ll/ۖۨۧ;

    .line 418
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۨۧ;

    .line 419
    invoke-virtual {v2, v0}, Ll/ܽۨۧ;->addListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    goto :goto_0

    .line 421
    :cond_1
    iget-object v0, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Ll/ۖۨۧ;->᩹:I

    .line 492
    iget-boolean v0, p0, Ll/ۖۨۧ;->᩶:Z

    if-nez v0, :cond_3

    const/4 v0, 0x1

    .line 495
    :goto_1
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 496
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۨۧ;

    .line 497
    iget-object v2, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۨۧ;

    .line 498
    new-instance v3, Ll/ۢۨۧ;

    invoke-direct {v3, v2}, Ll/ۢۨۧ;-><init>(Ll/ܽۨۧ;)V

    invoke-virtual {v1, v3}, Ll/ܽۨۧ;->addListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 506
    :cond_2
    iget-object v0, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽۨۧ;

    if-eqz v0, :cond_4

    .line 508
    invoke-virtual {v0}, Ll/ܽۨۧ;->runAnimators()V

    return-void

    .line 511
    :cond_3
    iget-object v0, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۨۧ;

    .line 512
    invoke-virtual {v1}, Ll/ܽۨۧ;->runAnimators()V

    goto :goto_2

    :cond_4
    return-void
.end method

.method public final setCanRemoveViews(Z)V
    .locals 3

    .line 723
    invoke-super {p0, p1}, Ll/ܽۨۧ;->setCanRemoveViews(Z)V

    .line 724
    iget-object v0, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 726
    iget-object v2, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۨۧ;

    invoke-virtual {v2, p1}, Ll/ܽۨۧ;->setCanRemoveViews(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final setCurrentPlayTimeMillis(JJ)V
    .locals 18

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    .line 575
    invoke-virtual/range {p0 .. p0}, Ll/ܽۨۧ;->getTotalDurationMillis()J

    move-result-wide v5

    .line 576
    iget-object v7, v0, Ll/ܽۨۧ;->mParent:Ll/ۖۨۧ;

    const-wide/16 v8, 0x0

    if-eqz v7, :cond_1

    cmp-long v7, v1, v8

    if-gez v7, :cond_0

    cmp-long v7, v3, v8

    if-ltz v7, :cond_11

    :cond_0
    cmp-long v7, v1, v5

    if-lez v7, :cond_1

    cmp-long v7, v3, v5

    if-lez v7, :cond_1

    goto/16 :goto_7

    :cond_1
    const/4 v7, 0x0

    cmp-long v10, v1, v3

    if-gez v10, :cond_2

    const/4 v11, 0x1

    goto :goto_0

    :cond_2
    const/4 v11, 0x0

    :goto_0
    cmp-long v12, v1, v8

    if-ltz v12, :cond_3

    cmp-long v13, v3, v8

    if-ltz v13, :cond_4

    :cond_3
    cmp-long v13, v1, v5

    if-gtz v13, :cond_5

    cmp-long v13, v3, v5

    if-lez v13, :cond_5

    .line 585
    :cond_4
    iput-boolean v7, v0, Ll/ܽۨۧ;->mEnded:Z

    .line 586
    sget-object v13, Ll/ۧۨۧ;->ܿ:Ll/ۨۛۧ;

    invoke-virtual {v0, v13, v11}, Ll/ܽۨۧ;->notifyListeners(Ll/ۧۨۧ;Z)V

    .line 588
    :cond_5
    iget-boolean v13, v0, Ll/ۖۨۧ;->᩶:Z

    if-eqz v13, :cond_7

    .line 589
    :goto_1
    iget-object v10, v0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v7, v10, :cond_6

    .line 590
    iget-object v10, v0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܽۨۧ;

    .line 591
    invoke-virtual {v10, v1, v2, v3, v4}, Ll/ܽۨۧ;->setCurrentPlayTimeMillis(JJ)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_6
    move v15, v11

    move/from16 v16, v12

    goto/16 :goto_6

    :cond_7
    const/4 v7, 0x1

    .line 563
    :goto_2
    iget-object v13, v0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v13

    if-ge v7, v13, :cond_9

    .line 564
    iget-object v13, v0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ܽۨۧ;

    .line 565
    iget-wide v13, v13, Ll/ܽۨۧ;->mSeekOffsetInParent:J

    cmp-long v15, v13, v3

    if-lez v15, :cond_8

    goto :goto_3

    :cond_8
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 569
    :cond_9
    iget-object v7, v0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    :goto_3
    add-int/lit8 v7, v7, -0x1

    if-ltz v10, :cond_b

    .line 599
    :goto_4
    iget-object v10, v0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v7, v10, :cond_6

    .line 600
    iget-object v10, v0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܽۨۧ;

    .line 601
    iget-wide v13, v10, Ll/ܽۨۧ;->mSeekOffsetInParent:J

    move v15, v11

    move/from16 v16, v12

    sub-long v11, v1, v13

    cmp-long v17, v11, v8

    if-gez v17, :cond_a

    goto :goto_6

    :cond_a
    sub-long v13, v3, v13

    .line 607
    invoke-virtual {v10, v11, v12, v13, v14}, Ll/ܽۨۧ;->setCurrentPlayTimeMillis(JJ)V

    add-int/lit8 v7, v7, 0x1

    move v11, v15

    move/from16 v12, v16

    goto :goto_4

    :cond_b
    move v15, v11

    move/from16 v16, v12

    :goto_5
    if-ltz v7, :cond_d

    .line 612
    iget-object v10, v0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܽۨۧ;

    .line 613
    iget-wide v11, v10, Ll/ܽۨۧ;->mSeekOffsetInParent:J

    sub-long v13, v1, v11

    sub-long v11, v3, v11

    .line 616
    invoke-virtual {v10, v13, v14, v11, v12}, Ll/ܽۨۧ;->setCurrentPlayTimeMillis(JJ)V

    cmp-long v10, v13, v8

    if-ltz v10, :cond_c

    goto :goto_6

    :cond_c
    add-int/lit8 v7, v7, -0x1

    goto :goto_5

    .line 623
    :cond_d
    :goto_6
    iget-object v7, v0, Ll/ܽۨۧ;->mParent:Ll/ۖۨۧ;

    if-eqz v7, :cond_11

    cmp-long v7, v1, v5

    if-lez v7, :cond_e

    cmp-long v1, v3, v5

    if-lez v1, :cond_f

    :cond_e
    if-gez v16, :cond_11

    cmp-long v1, v3, v8

    if-ltz v1, :cond_11

    :cond_f
    if-lez v7, :cond_10

    const/4 v1, 0x1

    .line 627
    iput-boolean v1, v0, Ll/ܽۨۧ;->mEnded:Z

    .line 629
    :cond_10
    sget-object v1, Ll/ۧۨۧ;->ۧ:Ll/᩺ۛۧ;

    move v11, v15

    invoke-virtual {v0, v1, v11}, Ll/ܽۨۧ;->notifyListeners(Ll/ۧۨۧ;Z)V

    :cond_11
    :goto_7
    return-void
.end method

.method public final bridge synthetic setDuration(J)Ll/ܽۨۧ;
    .locals 0

    .line 63
    invoke-virtual {p0, p1, p2}, Ll/ۖۨۧ;->setDuration(J)V

    return-object p0
.end method

.method public final setDuration(J)V
    .locals 5

    .line 238
    invoke-super {p0, p1, p2}, Ll/ܽۨۧ;->setDuration(J)Ll/ܽۨۧ;

    .line 239
    iget-wide v0, p0, Ll/ܽۨۧ;->mDuration:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    iget-object v0, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 240
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 242
    iget-object v2, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۨۧ;

    invoke-virtual {v2, p1, p2}, Ll/ܽۨۧ;->setDuration(J)Ll/ܽۨۧ;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final setEpicenterCallback(Ll/۬ۛۧ;)V
    .locals 3

    .line 742
    invoke-super {p0, p1}, Ll/ܽۨۧ;->setEpicenterCallback(Ll/۬ۛۧ;)V

    .line 743
    iget v0, p0, Ll/ۖۨۧ;->᩸:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Ll/ۖۨۧ;->᩸:I

    .line 744
    iget-object v0, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 746
    iget-object v2, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۨۧ;

    invoke-virtual {v2, p1}, Ll/ܽۨۧ;->setEpicenterCallback(Ll/۬ۛۧ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final setInterpolator(Landroid/animation/TimeInterpolator;)Ll/ۖۨۧ;
    .locals 3

    .line 257
    iget v0, p0, Ll/ۖۨۧ;->᩸:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Ll/ۖۨۧ;->᩸:I

    .line 258
    iget-object v0, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 259
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 261
    iget-object v2, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۨۧ;

    invoke-virtual {v2, p1}, Ll/ܽۨۧ;->setInterpolator(Landroid/animation/TimeInterpolator;)Ll/ܽۨۧ;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 264
    :cond_0
    invoke-super {p0, p1}, Ll/ܽۨۧ;->setInterpolator(Landroid/animation/TimeInterpolator;)Ll/ܽۨۧ;

    move-result-object p1

    check-cast p1, Ll/ۖۨۧ;

    return-object p1
.end method

.method public final bridge synthetic setInterpolator(Landroid/animation/TimeInterpolator;)Ll/ܽۨۧ;
    .locals 0

    .line 63
    invoke-virtual {p0, p1}, Ll/ۖۨۧ;->setInterpolator(Landroid/animation/TimeInterpolator;)Ll/ۖۨۧ;

    move-result-object p1

    return-object p1
.end method

.method public final setPathMotion(Ll/֡ۛۧ;)V
    .locals 2

    .line 389
    invoke-super {p0, p1}, Ll/ܽۨۧ;->setPathMotion(Ll/֡ۛۧ;)V

    .line 390
    iget v0, p0, Ll/ۖۨۧ;->᩸:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Ll/ۖۨۧ;->᩸:I

    .line 391
    iget-object v0, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 392
    :goto_0
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 393
    iget-object v1, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܽۨۧ;

    invoke-virtual {v1, p1}, Ll/ܽۨۧ;->setPathMotion(Ll/֡ۛۧ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final setPropagation(Ll/ۜۨۧ;)V
    .locals 3

    const/4 p1, 0x0

    .line 732
    invoke-super {p0, p1}, Ll/ܽۨۧ;->setPropagation(Ll/ۜۨۧ;)V

    .line 733
    iget v0, p0, Ll/ۖۨۧ;->᩸:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Ll/ۖۨۧ;->᩸:I

    .line 734
    iget-object v0, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 736
    iget-object v2, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۨۧ;

    invoke-virtual {v2, p1}, Ll/ܽۨۧ;->setPropagation(Ll/ۜۨۧ;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final setStartDelay(J)Ll/ܽۨۧ;
    .locals 0

    .line 251
    invoke-super {p0, p1, p2}, Ll/ܽۨۧ;->setStartDelay(J)Ll/ܽۨۧ;

    move-result-object p1

    check-cast p1, Ll/ۖۨۧ;

    return-object p1
.end method

.method public final toString(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 752
    invoke-super {p0, p1}, Ll/ܽۨۧ;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 753
    :goto_0
    iget-object v2, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    const-string v2, "\n"

    .line 0
    invoke-static {v0, v2}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 754
    iget-object v2, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۨۧ;

    const-string v3, "  "

    .line 0
    invoke-static {p1, v3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 754
    invoke-virtual {v2, v3}, Ll/ܽۨۧ;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final ۧ(Ll/ܽۨۧ;)V
    .locals 5

    .line 198
    iget-object v0, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 199
    iput-object p0, p1, Ll/ܽۨۧ;->mParent:Ll/ۖۨۧ;

    .line 179
    iget-wide v0, p0, Ll/ܽۨۧ;->mDuration:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    .line 180
    invoke-virtual {p1, v0, v1}, Ll/ܽۨۧ;->setDuration(J)Ll/ܽۨۧ;

    .line 182
    :cond_0
    iget v0, p0, Ll/ۖۨۧ;->᩸:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    .line 183
    invoke-virtual {p0}, Ll/ܽۨۧ;->getInterpolator()Landroid/animation/TimeInterpolator;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ܽۨۧ;->setInterpolator(Landroid/animation/TimeInterpolator;)Ll/ܽۨۧ;

    .line 185
    :cond_1
    iget v0, p0, Ll/ۖۨۧ;->᩸:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    .line 186
    invoke-virtual {p0}, Ll/ܽۨۧ;->getPropagation()Ll/ۜۨۧ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ܽۨۧ;->setPropagation(Ll/ۜۨۧ;)V

    .line 188
    :cond_2
    iget v0, p0, Ll/ۖۨۧ;->᩸:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_3

    .line 189
    invoke-virtual {p0}, Ll/ܽۨۧ;->getPathMotion()Ll/֡ۛۧ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ܽۨۧ;->setPathMotion(Ll/֡ۛۧ;)V

    .line 191
    :cond_3
    iget v0, p0, Ll/ۖۨۧ;->᩸:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_4

    .line 192
    invoke-virtual {p0}, Ll/ܽۨۧ;->getEpicenterCallback()Ll/۬ۛۧ;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/ܽۨۧ;->setEpicenterCallback(Ll/۬ۛۧ;)V

    :cond_4
    return-void
.end method

.method public final ܽ(I)V
    .locals 2

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    .line 136
    iput-boolean p1, p0, Ll/ۖۨۧ;->᩶:Z

    return-void

    .line 142
    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    const-string v1, "Invalid parameter for TransitionSet ordering: "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 142
    invoke-direct {v0, p1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 139
    :cond_1
    iput-boolean v0, p0, Ll/ۖۨۧ;->᩶:Z

    return-void
.end method

.method public final ܽ(Ll/ܽۨۧ;)V
    .locals 1

    .line 406
    iget-object v0, p0, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    .line 407
    iput-object v0, p1, Ll/ܽۨۧ;->mParent:Ll/ۖۨۧ;

    return-void
.end method
