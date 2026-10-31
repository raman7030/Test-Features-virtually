.class public final Ll/֫֡ۘ;
.super Ll/ᩳ֡ۘ;
.source "O1W7"


# instance fields
.field public ۜ:F

.field public ܳ:Z

.field public ܿ:F

.field public ᩻:F


# direct methods
.method public varargs constructor <init>([Ll/ۧ֡ۘ;)V
    .locals 2

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    array-length v0, p1

    iput v0, p0, Ll/ᩳ֡ۘ;->ᩳ:I

    .line 46
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/ᩳ֡ۘ;->ܽ:Ljava/util/ArrayList;

    .line 47
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    const/4 p1, 0x0

    .line 48
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽ֡ۘ;

    const/4 p1, 0x1

    sub-int/2addr v0, p1

    .line 49
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܽ֡ۘ;

    .line 50
    invoke-virtual {v0}, Ll/ܽ֡ۘ;->֫()Landroid/view/animation/Interpolator;

    move-result-object v0

    iput-object v0, p0, Ll/ᩳ֡ۘ;->ۧ:Landroid/view/animation/Interpolator;

    .line 39
    iput-boolean p1, p0, Ll/֫֡ۘ;->ܳ:Z

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 35
    invoke-virtual {p0}, Ll/֫֡ۘ;->clone()Ll/֫֡ۘ;

    move-result-object v0

    return-object v0
.end method

.method public final clone()Ll/֫֡ۘ;
    .locals 5

    .line 52
    iget-object v0, p0, Ll/ᩳ֡ۘ;->ܽ:Ljava/util/ArrayList;

    .line 53
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 54
    new-array v2, v1, [Ll/ۧ֡ۘ;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    .line 56
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܽ֡ۘ;

    invoke-virtual {v4}, Ll/ܽ֡ۘ;->clone()Ll/ܽ֡ۘ;

    move-result-object v4

    check-cast v4, Ll/ۧ֡ۘ;

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 58
    :cond_0
    new-instance v0, Ll/֫֡ۘ;

    invoke-direct {v0, v2}, Ll/֫֡ۘ;-><init>([Ll/ۧ֡ۘ;)V

    return-object v0
.end method

.method public final ֫(F)F
    .locals 7

    .line 63
    iget-object v0, p0, Ll/ᩳ֡ۘ;->ܽ:Ljava/util/ArrayList;

    iget v1, p0, Ll/ᩳ֡ۘ;->ᩳ:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v1, v2, :cond_3

    .line 64
    iget-boolean v1, p0, Ll/֫֡ۘ;->ܳ:Z

    if-eqz v1, :cond_0

    .line 65
    iput-boolean v3, p0, Ll/֫֡ۘ;->ܳ:Z

    .line 66
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧ֡ۘ;

    .line 339
    iget v1, v1, Ll/ۧ֡ۘ;->ۙ:F

    .line 66
    iput v1, p0, Ll/֫֡ۘ;->᩻:F

    .line 67
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧ֡ۘ;

    .line 339
    iget v0, v0, Ll/ۧ֡ۘ;->ۙ:F

    .line 67
    iput v0, p0, Ll/֫֡ۘ;->ۜ:F

    .line 68
    iget v1, p0, Ll/֫֡ۘ;->᩻:F

    sub-float/2addr v0, v1

    iput v0, p0, Ll/֫֡ۘ;->ܿ:F

    .line 70
    :cond_0
    iget-object v0, p0, Ll/ᩳ֡ۘ;->ۧ:Landroid/view/animation/Interpolator;

    if-eqz v0, :cond_1

    .line 71
    invoke-interface {v0, p1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result p1

    .line 73
    :cond_1
    iget-object v0, p0, Ll/ᩳ֡ۘ;->֫:Ll/᩹֡ۘ;

    if-nez v0, :cond_2

    .line 74
    iget v0, p0, Ll/֫֡ۘ;->᩻:F

    iget v1, p0, Ll/֫֡ۘ;->ܿ:F

    mul-float p1, p1, v1

    add-float/2addr p1, v0

    return p1

    .line 76
    :cond_2
    iget v1, p0, Ll/֫֡ۘ;->᩻:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v2, p0, Ll/֫֡ۘ;->ۜ:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Ll/᩹֡ۘ;->֫(FLjava/lang/Float;Ljava/lang/Float;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    return p1

    :cond_3
    const/4 v2, 0x0

    cmpg-float v2, p1, v2

    if-gtz v2, :cond_6

    .line 80
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧ֡ۘ;

    .line 81
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧ֡ۘ;

    .line 339
    iget v2, v1, Ll/ۧ֡ۘ;->ۙ:F

    iget v3, v0, Ll/ۧ֡ۘ;->ۙ:F

    .line 191
    iget v1, v1, Ll/ܽ֡ۘ;->᩸:F

    iget v4, v0, Ll/ܽ֡ۘ;->᩸:F

    .line 86
    invoke-virtual {v0}, Ll/ܽ֡ۘ;->֫()Landroid/view/animation/Interpolator;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 88
    invoke-interface {v0, p1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result p1

    :cond_4
    sub-float/2addr p1, v1

    sub-float/2addr v4, v1

    div-float/2addr p1, v4

    .line 91
    iget-object v0, p0, Ll/ᩳ֡ۘ;->֫:Ll/᩹֡ۘ;

    if-nez v0, :cond_5

    invoke-static {v3, v2, p1, v2}, Ll/᩶᩵ᩳ;->֫(FFFF)F

    move-result p1

    return p1

    .line 93
    :cond_5
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Ll/᩹֡ۘ;->֫(FLjava/lang/Float;Ljava/lang/Float;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    .line 94
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    return p1

    :cond_6
    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v2, p1, v2

    if-ltz v2, :cond_9

    add-int/lit8 v2, v1, -0x2

    .line 96
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧ֡ۘ;

    sub-int/2addr v1, v4

    .line 97
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۧ֡ۘ;

    .line 339
    iget v1, v2, Ll/ۧ֡ۘ;->ۙ:F

    iget v3, v0, Ll/ۧ֡ۘ;->ۙ:F

    .line 191
    iget v2, v2, Ll/ܽ֡ۘ;->᩸:F

    iget v4, v0, Ll/ܽ֡ۘ;->᩸:F

    .line 102
    invoke-virtual {v0}, Ll/ܽ֡ۘ;->֫()Landroid/view/animation/Interpolator;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 104
    invoke-interface {v0, p1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result p1

    :cond_7
    sub-float/2addr p1, v2

    sub-float/2addr v4, v2

    div-float/2addr p1, v4

    .line 107
    iget-object v0, p0, Ll/ᩳ֡ۘ;->֫:Ll/᩹֡ۘ;

    if-nez v0, :cond_8

    invoke-static {v3, v1, p1, v1}, Ll/᩶᩵ᩳ;->֫(FFFF)F

    move-result p1

    return p1

    .line 109
    :cond_8
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v0, p1, v1, v2}, Ll/᩹֡ۘ;->֫(FLjava/lang/Float;Ljava/lang/Float;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    .line 110
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    return p1

    .line 112
    :cond_9
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۧ֡ۘ;

    const/4 v3, 0x1

    :goto_0
    if-ge v3, v1, :cond_d

    .line 114
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۧ֡ۘ;

    .line 191
    iget v6, v5, Ll/ܽ֡ۘ;->᩸:F

    cmpg-float v6, p1, v6

    if-gez v6, :cond_c

    .line 116
    invoke-virtual {v5}, Ll/ܽ֡ۘ;->֫()Landroid/view/animation/Interpolator;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 118
    invoke-interface {v0, p1}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result p1

    .line 191
    :cond_a
    iget v0, v2, Ll/ܽ֡ۘ;->᩸:F

    sub-float/2addr p1, v0

    iget v1, v5, Ll/ܽ֡ۘ;->᩸:F

    sub-float/2addr v1, v0

    div-float/2addr p1, v1

    .line 339
    iget v0, v2, Ll/ۧ֡ۘ;->ۙ:F

    iget v1, v5, Ll/ۧ֡ۘ;->ۙ:F

    .line 124
    iget-object v2, p0, Ll/ᩳ֡ۘ;->֫:Ll/᩹֡ۘ;

    if-nez v2, :cond_b

    invoke-static {v1, v0, p1, v0}, Ll/᩶᩵ᩳ;->֫(FFFF)F

    move-result p1

    return p1

    .line 126
    :cond_b
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v2, p1, v0, v1}, Ll/᩹֡ۘ;->֫(FLjava/lang/Float;Ljava/lang/Float;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    .line 127
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    return p1

    :cond_c
    add-int/lit8 v3, v3, 0x1

    move-object v2, v5

    goto :goto_0

    :cond_d
    sub-int/2addr v1, v4

    .line 132
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܽ֡ۘ;

    invoke-virtual {p1}, Ll/ܽ֡ۘ;->ܽ()Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    return p1
.end method
