.class public final Ll/᩷۫ۧ;
.super Ljava/lang/Object;
.source "8539"


# instance fields
.field public ֫:I

.field public ۧ:I

.field public final synthetic ܳ:Ll/ۢ۫ۧ;

.field public ܽ:I

.field public ܿ:Ljava/util/ArrayList;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ll/ۢ۫ۧ;I)V
    .locals 0

    .line 2489
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷۫ۧ;->ܳ:Ll/ۢ۫ۧ;

    .line 2483
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/᩷۫ۧ;->ܿ:Ljava/util/ArrayList;

    const/high16 p1, -0x80000000

    .line 2484
    iput p1, p0, Ll/᩷۫ۧ;->ۧ:I

    .line 2485
    iput p1, p0, Ll/᩷۫ۧ;->֫:I

    const/4 p1, 0x0

    .line 2486
    iput p1, p0, Ll/᩷۫ۧ;->ܽ:I

    .line 2490
    iput p2, p0, Ll/᩷۫ۧ;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final ֫(I)I
    .locals 2

    .line 2527
    iget v0, p0, Ll/᩷۫ۧ;->֫:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_0

    return v0

    .line 2530
    :cond_0
    iget-object v0, p0, Ll/᩷۫ۧ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    return p1

    .line 2534
    :cond_1
    invoke-virtual {p0}, Ll/᩷۫ۧ;->֫()V

    .line 2535
    iget p1, p0, Ll/᩷۫ۧ;->֫:I

    return p1
.end method

.method public final ֫(II)I
    .locals 10

    .line 2730
    iget-object v0, p0, Ll/᩷۫ۧ;->ܳ:Ll/ۢ۫ۧ;

    iget-object v1, v0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v1}, Ll/ۖۗۧ;->ܳ()I

    move-result v1

    .line 2731
    iget-object v2, v0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v2}, Ll/ۖۗۧ;->ۧ()I

    move-result v2

    const/4 v3, -0x1

    if-le p2, p1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, -0x1

    :goto_0
    if-eq p1, p2, :cond_5

    .line 2734
    iget-object v5, p0, Ll/᩷۫ۧ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    .line 2735
    iget-object v6, v0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v6, v5}, Ll/ۖۗۧ;->ᩳ(Landroid/view/View;)I

    move-result v6

    .line 2736
    iget-object v7, v0, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v7, v5}, Ll/ۖۗۧ;->֫(Landroid/view/View;)I

    move-result v7

    const/4 v8, 0x0

    if-gt v6, v2, :cond_1

    const/4 v9, 0x1

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    :goto_1
    if-lt v7, v1, :cond_2

    const/4 v8, 0x1

    :cond_2
    if-eqz v9, :cond_4

    if-eqz v8, :cond_4

    if-lt v6, v1, :cond_3

    if-le v7, v2, :cond_4

    .line 2753
    :cond_3
    invoke-virtual {v0, v5}, Ll/ܿ۬ۧ;->getPosition(Landroid/view/View;)I

    move-result p1

    return p1

    :cond_4
    add-int/2addr p1, v4

    goto :goto_0

    :cond_5
    return v3
.end method

.method public final ֫()V
    .locals 3

    .line 2539
    iget-object v0, p0, Ll/᩷۫ۧ;->ܿ:Ljava/util/ArrayList;

    const/4 v1, 0x1

    .line 0
    invoke-static {v0, v1}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    .line 2539
    check-cast v0, Landroid/view/View;

    .line 2655
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Ll/ܽ۫ۧ;

    .line 2541
    iget-object v2, p0, Ll/᩷۫ۧ;->ܳ:Ll/ۢ۫ۧ;

    iget-object v2, v2, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v2, v0}, Ll/ۖۗۧ;->֫(Landroid/view/View;)I

    move-result v0

    iput v0, p0, Ll/᩷۫ۧ;->֫:I

    .line 2542
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final ۧ(I)I
    .locals 2

    .line 2494
    iget v0, p0, Ll/᩷۫ۧ;->ۧ:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_0

    return v0

    .line 2497
    :cond_0
    iget-object v0, p0, Ll/᩷۫ۧ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_1

    return p1

    :cond_1
    const/4 p1, 0x0

    .line 2505
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    .line 2655
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܽ۫ۧ;

    .line 2507
    iget-object v1, p0, Ll/᩷۫ۧ;->ܳ:Ll/ۢ۫ۧ;

    iget-object v1, v1, Ll/ۢ۫ۧ;->ۖ:Ll/ۖۗۧ;

    invoke-virtual {v1, p1}, Ll/ۖۗۧ;->ᩳ(Landroid/view/View;)I

    move-result p1

    iput p1, p0, Ll/᩷۫ۧ;->ۧ:I

    .line 2508
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2501
    iget p1, p0, Ll/᩷۫ۧ;->ۧ:I

    return p1
.end method

.method public final ۧ(II)Landroid/view/View;
    .locals 6

    const/4 v0, -0x1

    .line 2776
    iget-object v1, p0, Ll/᩷۫ۧ;->ܳ:Ll/ۢ۫ۧ;

    iget-object v2, p0, Ll/᩷۫ۧ;->ܿ:Ljava/util/ArrayList;

    const/4 v3, 0x0

    if-ne p2, v0, :cond_3

    .line 2777
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_2

    .line 2779
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    .line 2780
    iget-boolean v5, v1, Ll/ۢ۫ۧ;->ᩴ:Z

    if-eqz v5, :cond_0

    invoke-virtual {v1, v4}, Ll/ܿ۬ۧ;->getPosition(Landroid/view/View;)I

    move-result v5

    if-le v5, p1, :cond_2

    :cond_0
    iget-boolean v5, v1, Ll/ۢ۫ۧ;->ᩴ:Z

    if-nez v5, :cond_1

    .line 2781
    invoke-virtual {v1, v4}, Ll/ܿ۬ۧ;->getPosition(Landroid/view/View;)I

    move-result v5

    if-lt v5, p1, :cond_1

    goto :goto_1

    .line 2784
    :cond_1
    invoke-virtual {v4}, Landroid/view/View;->hasFocusable()Z

    move-result v5

    if-eqz v5, :cond_2

    add-int/lit8 v0, v0, 0x1

    move-object v3, v4

    goto :goto_0

    :cond_2
    :goto_1
    return-object v3

    .line 2791
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    :goto_2
    if-ltz p2, :cond_6

    .line 2792
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 2793
    iget-boolean v4, v1, Ll/ۢ۫ۧ;->ᩴ:Z

    if-eqz v4, :cond_4

    invoke-virtual {v1, v0}, Ll/ܿ۬ۧ;->getPosition(Landroid/view/View;)I

    move-result v4

    if-ge v4, p1, :cond_6

    :cond_4
    iget-boolean v4, v1, Ll/ۢ۫ۧ;->ᩴ:Z

    if-nez v4, :cond_5

    .line 2794
    invoke-virtual {v1, v0}, Ll/ܿ۬ۧ;->getPosition(Landroid/view/View;)I

    move-result v4

    if-gt v4, p1, :cond_5

    goto :goto_3

    .line 2797
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->hasFocusable()Z

    move-result v4

    if-eqz v4, :cond_6

    add-int/lit8 p2, p2, -0x1

    move-object v3, v0

    goto :goto_2

    :cond_6
    :goto_3
    return-object v3
.end method

.method public final ۧ()V
    .locals 1

    .line 2609
    iget-object v0, p0, Ll/᩷۫ۧ;->ܿ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/high16 v0, -0x80000000

    .line 2615
    iput v0, p0, Ll/᩷۫ۧ;->ۧ:I

    .line 2616
    iput v0, p0, Ll/᩷۫ۧ;->֫:I

    const/4 v0, 0x0

    .line 2611
    iput v0, p0, Ll/᩷۫ۧ;->ܽ:I

    return-void
.end method

.method public final ܽ()I
    .locals 2

    .line 2674
    iget-object v0, p0, Ll/᩷۫ۧ;->ܳ:Ll/ۢ۫ۧ;

    iget-boolean v0, v0, Ll/ۢ۫ۧ;->ᩴ:Z

    iget-object v1, p0, Ll/᩷۫ۧ;->ܿ:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 2675
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Ll/᩷۫ۧ;->֫(II)I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    .line 2676
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ll/᩷۫ۧ;->֫(II)I

    move-result v0

    return v0
.end method

.method public final ᩳ()I
    .locals 2

    .line 2692
    iget-object v0, p0, Ll/᩷۫ۧ;->ܳ:Ll/ۢ۫ۧ;

    iget-boolean v0, v0, Ll/ۢ۫ۧ;->ᩴ:Z

    iget-object v1, p0, Ll/᩷۫ۧ;->ܿ:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2693
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Ll/᩷۫ۧ;->֫(II)I

    move-result v0

    return v0

    .line 2694
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Ll/᩷۫ۧ;->֫(II)I

    move-result v0

    return v0
.end method
