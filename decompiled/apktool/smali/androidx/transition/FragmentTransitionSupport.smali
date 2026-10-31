.class public Landroidx/transition/FragmentTransitionSupport;
.super Ll/ܺ᩷֫;
.source "FragmentTransitionSupport.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ll/ܺ᩷֫;-><init>()V

    return-void
.end method

.method public static ֫(Ll/ܽۨۧ;)Z
    .locals 1

    .line 128
    invoke-virtual {p0}, Ll/ܽۨۧ;->getTargetIds()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/ܺ᩷֫;->֫(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 129
    invoke-virtual {p0}, Ll/ܽۨۧ;->getTargetNames()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/ܺ᩷֫;->֫(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 130
    invoke-virtual {p0}, Ll/ܽۨۧ;->getTargetTypes()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Ll/ܺ᩷֫;->֫(Ljava/util/List;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 137
    new-instance v0, Ll/ۖۨۧ;

    invoke-direct {v0}, Ll/ۖۨۧ;-><init>()V

    if-eqz p1, :cond_0

    .line 139
    check-cast p1, Ll/ܽۨۧ;

    invoke-virtual {v0, p1}, Ll/ۖۨۧ;->ۧ(Ll/ܽۨۧ;)V

    .line 142
    :cond_0
    check-cast p2, Ll/ܽۨۧ;

    invoke-virtual {v0, p2}, Ll/ۖۨۧ;->ۧ(Ll/ܽۨۧ;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 198
    check-cast p1, Ll/ܽۨۧ;

    .line 199
    check-cast p2, Ll/ܽۨۧ;

    .line 200
    check-cast p3, Ll/ܽۨۧ;

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 202
    new-instance v0, Ll/ۖۨۧ;

    invoke-direct {v0}, Ll/ۖۨۧ;-><init>()V

    .line 203
    invoke-virtual {v0, p1}, Ll/ۖۨۧ;->ۧ(Ll/ܽۨۧ;)V

    .line 204
    invoke-virtual {v0, p2}, Ll/ۖۨۧ;->ۧ(Ll/ܽۨۧ;)V

    const/4 p1, 0x1

    .line 205
    invoke-virtual {v0, p1}, Ll/ۖۨۧ;->ܽ(I)V

    move-object p1, v0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    move-object p1, p2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-eqz p3, :cond_4

    .line 212
    new-instance p2, Ll/ۖۨۧ;

    invoke-direct {p2}, Ll/ۖۨۧ;-><init>()V

    if-eqz p1, :cond_3

    .line 214
    invoke-virtual {p2, p1}, Ll/ۖۨۧ;->ۧ(Ll/ܽۨۧ;)V

    .line 216
    :cond_3
    invoke-virtual {p2, p3}, Ll/ۖۨۧ;->ۧ(Ll/ܽۨۧ;)V

    return-object p2

    :cond_4
    return-object p1
.end method

.method public final ֫(Landroid/view/View;Ljava/lang/Object;)V
    .locals 0

    .line 408
    check-cast p2, Ll/ܽۨۧ;

    .line 409
    invoke-virtual {p2, p1}, Ll/ܽۨۧ;->addTarget(Landroid/view/View;)Ll/ܽۨۧ;

    return-void
.end method

.method public final ֫(Landroid/view/ViewGroup;Ljava/lang/Object;)V
    .locals 0

    .line 225
    check-cast p2, Ll/ܽۨۧ;

    invoke-static {p1, p2}, Ll/᩻ۨۧ;->֫(Landroid/view/ViewGroup;Ll/ܽۨۧ;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;Landroid/graphics/Rect;)V
    .locals 1

    .line 424
    check-cast p1, Ll/ܽۨۧ;

    .line 425
    new-instance v0, Ll/ᩴۛۧ;

    invoke-direct {v0, p2}, Ll/ᩴۛۧ;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {p1, v0}, Ll/ܽۨۧ;->setEpicenterCallback(Ll/۬ۛۧ;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 1

    .line 153
    check-cast p1, Ll/ܽۨۧ;

    .line 154
    new-instance v0, Ll/ܺۛۧ;

    invoke-direct {v0, p2, p3}, Ll/ܺۛۧ;-><init>(Landroid/view/View;Ljava/util/ArrayList;)V

    invoke-virtual {p1, v0}, Ll/ܽۨۧ;->addListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    return-void
.end method

.method public final ֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
    .locals 7

    .line 288
    check-cast p1, Ll/ܽۨۧ;

    .line 289
    new-instance v6, Ll/ۖۛۧ;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Ll/ۖۛۧ;-><init>(Landroidx/transition/FragmentTransitionSupport;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    invoke-virtual {p1, v6}, Ll/ܽۨۧ;->addListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    return-void
.end method

.method public final ֫(Ljava/lang/Object;Ljava/util/ArrayList;)V
    .locals 3

    .line 104
    check-cast p1, Ll/ܽۨۧ;

    if-nez p1, :cond_0

    goto :goto_4

    .line 108
    :cond_0
    instance-of v0, p1, Ll/ۖۨۧ;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    .line 109
    check-cast p1, Ll/ۖۨۧ;

    .line 210
    iget-object v0, p1, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    if-ge v1, v0, :cond_4

    if-ltz v1, :cond_2

    .line 222
    iget-object v2, p1, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lt v1, v2, :cond_1

    goto :goto_1

    .line 225
    :cond_1
    iget-object v2, p1, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۨۧ;

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v2, 0x0

    .line 113
    :goto_2
    invoke-virtual {p0, v2, p2}, Landroidx/transition/FragmentTransitionSupport;->֫(Ljava/lang/Object;Ljava/util/ArrayList;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 115
    :cond_3
    invoke-static {p1}, Landroidx/transition/FragmentTransitionSupport;->֫(Ll/ܽۨۧ;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 116
    invoke-virtual {p1}, Ll/ܽۨۧ;->getTargets()Ljava/util/List;

    move-result-object v0

    .line 117
    invoke-static {v0}, Ll/ܺ᩷֫;->֫(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 119
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_3
    if-ge v1, v0, :cond_4

    .line 121
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {p1, v2}, Ll/ܽۨۧ;->addTarget(Landroid/view/View;)Ll/ܽۨۧ;

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_4
    :goto_4
    return-void
.end method

.method public final ֫(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 1

    .line 369
    check-cast p1, Ll/ۖۨۧ;

    if-eqz p1, :cond_0

    .line 371
    invoke-virtual {p1}, Ll/ܽۨۧ;->getTargets()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 372
    invoke-virtual {p1}, Ll/ܽۨۧ;->getTargets()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 373
    invoke-virtual {p0, p1, p2, p3}, Landroidx/transition/FragmentTransitionSupport;->ۧ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/lang/Object;Ll/᩻۫;Ljava/lang/Runnable;)V
    .locals 1

    .line 336
    check-cast p1, Ll/ܽۨۧ;

    .line 337
    new-instance v0, Ll/ۢۛۧ;

    invoke-direct {v0, p1, p3}, Ll/ۢۛۧ;-><init>(Ll/ܽۨۧ;Ljava/lang/Runnable;)V

    invoke-virtual {p2, v0}, Ll/᩻۫;->֫(Ll/ܳ۫;)V

    .line 345
    new-instance p2, Ll/ۘۛۧ;

    invoke-direct {p2, p3}, Ll/ۘۛۧ;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p1, p2}, Ll/ܽۨۧ;->addListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    return-void
.end method

.method public final ֫(Ljava/lang/Object;)Z
    .locals 0

    .line 46
    instance-of p1, p1, Ll/ܽۨۧ;

    return p1
.end method

.method public final ۧ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-eqz p1, :cond_0

    .line 54
    check-cast p1, Ll/ܽۨۧ;

    invoke-virtual {p1}, Ll/ܽۨۧ;->clone()Ll/ܽۨۧ;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۧ(Landroid/view/View;Ljava/lang/Object;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 89
    check-cast p2, Ll/ܽۨۧ;

    .line 90
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 91
    invoke-static {v0, p1}, Ll/ܺ᩷֫;->֫(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 93
    new-instance p1, Ll/ۡۛۧ;

    invoke-direct {p1, v0}, Ll/ۡۛۧ;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {p2, p1}, Ll/ܽۨۧ;->setEpicenterCallback(Ll/۬ۛۧ;)V

    :cond_0
    return-void
.end method

.method public final ۧ(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 4

    .line 73
    check-cast p1, Ll/ۖۨۧ;

    .line 74
    invoke-virtual {p1}, Ll/ܽۨۧ;->getTargets()Ljava/util/List;

    move-result-object v0

    .line 75
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 76
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 78
    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    .line 79
    invoke-static {v3, v0}, Ll/ܺ᩷֫;->֫(Landroid/view/View;Ljava/util/List;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 81
    :cond_0
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 82
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    invoke-virtual {p0, p1, p3}, Landroidx/transition/FragmentTransitionSupport;->֫(Ljava/lang/Object;Ljava/util/ArrayList;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4
    .param p2    # Ljava/util/ArrayList;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .param p3    # Ljava/util/ArrayList;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    .line 381
    check-cast p1, Ll/ܽۨۧ;

    .line 382
    instance-of v0, p1, Ll/ۖۨۧ;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 383
    check-cast p1, Ll/ۖۨۧ;

    .line 210
    iget-object v0, p1, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    if-ge v1, v0, :cond_5

    if-ltz v1, :cond_1

    .line 222
    iget-object v2, p1, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lt v1, v2, :cond_0

    goto :goto_1

    .line 225
    :cond_0
    iget-object v2, p1, Ll/ۖۨۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽۨۧ;

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v2, 0x0

    .line 387
    :goto_2
    invoke-virtual {p0, v2, p2, p3}, Landroidx/transition/FragmentTransitionSupport;->ۧ(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 389
    :cond_2
    invoke-static {p1}, Landroidx/transition/FragmentTransitionSupport;->֫(Ll/ܽۨۧ;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 390
    invoke-virtual {p1}, Ll/ܽۨۧ;->getTargets()Ljava/util/List;

    move-result-object v0

    .line 391
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v2, v3, :cond_5

    .line 392
    invoke-interface {v0, p2}, Ljava/util/List;->containsAll(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_5

    if-nez p3, :cond_3

    const/4 v0, 0x0

    goto :goto_3

    .line 394
    :cond_3
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_3
    if-ge v1, v0, :cond_4

    .line 396
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {p1, v2}, Ll/ܽۨۧ;->addTarget(Landroid/view/View;)Ll/ܽۨۧ;

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 398
    :cond_4
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p3

    :goto_4
    add-int/lit8 p3, p3, -0x1

    if-ltz p3, :cond_5

    .line 399
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p1, v0}, Ll/ܽۨۧ;->removeTarget(Landroid/view/View;)Ll/ܽۨۧ;

    goto :goto_4

    :cond_5
    return-void
.end method

.method public final ܽ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 65
    :cond_0
    new-instance v0, Ll/ۖۨۧ;

    invoke-direct {v0}, Ll/ۖۨۧ;-><init>()V

    .line 66
    check-cast p1, Ll/ܽۨۧ;

    invoke-virtual {v0, p1}, Ll/ۖۨۧ;->ۧ(Ll/ܽۨۧ;)V

    return-object v0
.end method
