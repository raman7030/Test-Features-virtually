.class public Ll/ᩴۗۧ;
.super Ll/۟۬ۧ;
.source "63JU"


# instance fields
.field public ֫:Ll/ۖۗۧ;

.field public ۧ:Ll/ۖۗۧ;


# direct methods
.method public static ֫(Landroid/view/View;Ll/ۖۗۧ;)I
    .locals 1

    .line 204
    invoke-virtual {p1, p0}, Ll/ۖۗۧ;->ᩳ(Landroid/view/View;)I

    move-result v0

    .line 205
    invoke-virtual {p1, p0}, Ll/ۖۗۧ;->ۧ(Landroid/view/View;)I

    move-result p0

    div-int/lit8 p0, p0, 0x2

    add-int/2addr p0, v0

    .line 206
    invoke-virtual {p1}, Ll/ۖۗۧ;->ܳ()I

    move-result v0

    invoke-virtual {p1}, Ll/ۖۗۧ;->᩻()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    add-int/2addr p1, v0

    sub-int/2addr p0, p1

    return p0
.end method

.method public static ֫(Ll/ܿ۬ۧ;Ll/ۖۗۧ;)Landroid/view/View;
    .locals 8

    .line 222
    invoke-virtual {p0}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    .line 228
    :cond_0
    invoke-virtual {p1}, Ll/ۖۗۧ;->ܳ()I

    move-result v2

    invoke-virtual {p1}, Ll/ۖۗۧ;->᩻()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v3, v2

    const v2, 0x7fffffff

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_2

    .line 232
    invoke-virtual {p0, v4}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 233
    invoke-virtual {p1, v5}, Ll/ۖۗۧ;->ᩳ(Landroid/view/View;)I

    move-result v6

    .line 234
    invoke-virtual {p1, v5}, Ll/ۖۗۧ;->ۧ(Landroid/view/View;)I

    move-result v7

    div-int/lit8 v7, v7, 0x2

    add-int/2addr v7, v6

    sub-int/2addr v7, v3

    .line 235
    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    move-result v6

    if-ge v6, v2, :cond_1

    move-object v1, v5

    move v2, v6

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method private ֫(Ll/ܿ۬ۧ;)Ll/ۖۗۧ;
    .locals 1

    .line 268
    iget-object v0, p0, Ll/ᩴۗۧ;->֫:Ll/ۖۗۧ;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    if-eq v0, p1, :cond_1

    .line 258
    :cond_0
    new-instance v0, Ll/ۡۗۧ;

    invoke-direct {v0, p1}, Ll/ۖۗۧ;-><init>(Ll/ܿ۬ۧ;)V

    .line 269
    iput-object v0, p0, Ll/ᩴۗۧ;->֫:Ll/ۖۗۧ;

    .line 271
    :cond_1
    iget-object p1, p0, Ll/ᩴۗۧ;->֫:Ll/ۖۗۧ;

    return-object p1
.end method

.method private ۧ(Ll/ܿ۬ۧ;)Ll/ۖۗۧ;
    .locals 1

    .line 259
    iget-object v0, p0, Ll/ᩴۗۧ;->ۧ:Ll/ۖۗۧ;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/ۖۗۧ;->ۧ:Ll/ܿ۬ۧ;

    if-eq v0, p1, :cond_1

    .line 356
    :cond_0
    new-instance v0, Ll/ܺۗۧ;

    invoke-direct {v0, p1}, Ll/ۖۗۧ;-><init>(Ll/ܿ۬ۧ;)V

    .line 260
    iput-object v0, p0, Ll/ᩴۗۧ;->ۧ:Ll/ۖۗۧ;

    .line 262
    :cond_1
    iget-object p1, p0, Ll/ᩴۗۧ;->ۧ:Ll/ۖۗۧ;

    return-object p1
.end method


# virtual methods
.method public final calculateDistanceToFinalSnap(Ll/ܿ۬ۧ;Landroid/view/View;)[I
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 53
    invoke-virtual {p1}, Ll/ܿ۬ۧ;->canScrollHorizontally()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 55
    invoke-direct {p0, p1}, Ll/ᩴۗۧ;->֫(Ll/ܿ۬ۧ;)Ll/ۖۗۧ;

    move-result-object v1

    .line 54
    invoke-static {p2, v1}, Ll/ᩴۗۧ;->֫(Landroid/view/View;Ll/ۖۗۧ;)I

    move-result v1

    aput v1, v0, v2

    goto :goto_0

    :cond_0
    aput v2, v0, v2

    .line 60
    :goto_0
    invoke-virtual {p1}, Ll/ܿ۬ۧ;->canScrollVertically()Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    .line 62
    invoke-direct {p0, p1}, Ll/ᩴۗۧ;->ۧ(Ll/ܿ۬ۧ;)Ll/ۖۗۧ;

    move-result-object p1

    .line 61
    invoke-static {p2, p1}, Ll/ᩴۗۧ;->֫(Landroid/view/View;Ll/ۖۗۧ;)I

    move-result p1

    aput p1, v0, v3

    return-object v0

    :cond_1
    aput v2, v0, v3

    return-object v0
.end method

.method public final createScroller(Ll/ܿ۬ۧ;)Ll/ܶ۬ۧ;
    .locals 1

    .line 174
    instance-of p1, p1, Ll/۠۬ۧ;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 177
    :cond_0
    new-instance p1, Ll/ۘۗۧ;

    iget-object v0, p0, Ll/۟۬ۧ;->mRecyclerView:Ll/۬۬ۧ;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Ll/ۘۗۧ;-><init>(Ll/ᩴۗۧ;Landroid/content/Context;)V

    return-object p1
.end method

.method public findSnapView(Ll/ܿ۬ۧ;)Landroid/view/View;
    .locals 1

    .line 73
    invoke-virtual {p1}, Ll/ܿ۬ۧ;->canScrollVertically()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    invoke-direct {p0, p1}, Ll/ᩴۗۧ;->ۧ(Ll/ܿ۬ۧ;)Ll/ۖۗۧ;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ᩴۗۧ;->֫(Ll/ܿ۬ۧ;Ll/ۖۗۧ;)Landroid/view/View;

    move-result-object p1

    return-object p1

    .line 75
    :cond_0
    invoke-virtual {p1}, Ll/ܿ۬ۧ;->canScrollHorizontally()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 76
    invoke-direct {p0, p1}, Ll/ᩴۗۧ;->֫(Ll/ܿ۬ۧ;)Ll/ۖۗۧ;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ᩴۗۧ;->֫(Ll/ܿ۬ۧ;Ll/ۖۗۧ;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final findTargetSnapPosition(Ll/ܿ۬ۧ;II)I
    .locals 12

    .line 85
    invoke-virtual {p1}, Ll/ܿ۬ۧ;->getItemCount()I

    move-result v0

    const/4 v1, -0x1

    if-nez v0, :cond_0

    goto/16 :goto_5

    .line 248
    :cond_0
    invoke-virtual {p1}, Ll/ܿ۬ۧ;->canScrollVertically()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 249
    invoke-direct {p0, p1}, Ll/ᩴۗۧ;->ۧ(Ll/ܿ۬ۧ;)Ll/ۖۗۧ;

    move-result-object v2

    goto :goto_0

    .line 250
    :cond_1
    invoke-virtual {p1}, Ll/ܿ۬ۧ;->canScrollHorizontally()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 251
    invoke-direct {p0, p1}, Ll/ᩴۗۧ;->֫(Ll/ܿ۬ۧ;)Ll/ۖۗۧ;

    move-result-object v2

    goto :goto_0

    :cond_2
    move-object v2, v3

    :goto_0
    if-nez v2, :cond_3

    goto/16 :goto_5

    .line 102
    :cond_3
    invoke-virtual {p1}, Ll/ܿ۬ۧ;->getChildCount()I

    move-result v4

    const/4 v5, 0x0

    const/high16 v6, -0x80000000

    const v7, 0x7fffffff

    const/4 v8, 0x0

    move-object v6, v3

    const/high16 v7, -0x80000000

    const v8, 0x7fffffff

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v4, :cond_7

    .line 104
    invoke-virtual {p1, v9}, Ll/ܿ۬ۧ;->getChildAt(I)Landroid/view/View;

    move-result-object v10

    if-nez v10, :cond_4

    goto :goto_2

    .line 108
    :cond_4
    invoke-static {v10, v2}, Ll/ᩴۗۧ;->֫(Landroid/view/View;Ll/ۖۗۧ;)I

    move-result v11

    if-gtz v11, :cond_5

    if-le v11, v7, :cond_5

    move-object v6, v10

    move v7, v11

    :cond_5
    if-ltz v11, :cond_6

    if-ge v11, v8, :cond_6

    move-object v3, v10

    move v8, v11

    :cond_6
    :goto_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 150
    :cond_7
    invoke-virtual {p1}, Ll/ܿ۬ۧ;->canScrollHorizontally()Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_8

    if-lez p2, :cond_9

    goto :goto_3

    :cond_8
    if-lez p3, :cond_9

    :goto_3
    const/4 p2, 0x1

    goto :goto_4

    :cond_9
    const/4 p2, 0x0

    :goto_4
    if-eqz p2, :cond_a

    if-eqz v3, :cond_a

    .line 125
    invoke-virtual {p1, v3}, Ll/ܿ۬ۧ;->getPosition(Landroid/view/View;)I

    move-result p1

    return p1

    :cond_a
    if-nez p2, :cond_b

    if-eqz v6, :cond_b

    .line 127
    invoke-virtual {p1, v6}, Ll/ܿ۬ۧ;->getPosition(Landroid/view/View;)I

    move-result p1

    return p1

    :cond_b
    if-eqz p2, :cond_c

    move-object v3, v6

    :cond_c
    if-nez v3, :cond_d

    goto :goto_5

    .line 138
    :cond_d
    invoke-virtual {p1, v3}, Ll/ܿ۬ۧ;->getPosition(Landroid/view/View;)I

    move-result p3

    .line 158
    invoke-virtual {p1}, Ll/ܿ۬ۧ;->getItemCount()I

    move-result v2

    .line 159
    instance-of v3, p1, Ll/۠۬ۧ;

    if-eqz v3, :cond_f

    .line 160
    check-cast p1, Ll/۠۬ۧ;

    sub-int/2addr v2, v4

    .line 162
    invoke-interface {p1, v2}, Ll/۠۬ۧ;->computeScrollVectorForPosition(I)Landroid/graphics/PointF;

    move-result-object p1

    if-eqz p1, :cond_f

    .line 164
    iget v2, p1, Landroid/graphics/PointF;->x:F

    const/4 v3, 0x0

    cmpg-float v2, v2, v3

    if-ltz v2, :cond_e

    iget p1, p1, Landroid/graphics/PointF;->y:F

    cmpg-float p1, p1, v3

    if-gez p1, :cond_f

    :cond_e
    const/4 v5, 0x1

    :cond_f
    if-ne v5, p2, :cond_10

    const/4 v4, -0x1

    :cond_10
    add-int/2addr p3, v4

    if-ltz p3, :cond_12

    if-lt p3, v0, :cond_11

    goto :goto_5

    :cond_11
    return p3

    :cond_12
    :goto_5
    return v1
.end method
