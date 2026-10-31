.class public final Ll/۫֨ۘ;
.super Ll/ۨ֨ۘ;
.source "K7JY"


# instance fields
.field public final synthetic ܽ:Ll/ۤ֨ۘ;


# direct methods
.method public constructor <init>(Ll/ۤ֨ۘ;)V
    .locals 0

    .line 2
    iput-object p1, p0, Ll/۫֨ۘ;->ܽ:Ll/ۤ֨ۘ;

    .line 121
    invoke-direct {p0}, Ll/ۨ֨ۘ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 175
    iget-object v0, p0, Ll/۫֨ۘ;->ܽ:Ll/ۤ֨ۘ;

    iget-object v0, v0, Ll/ۙ֨ۘ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(I)V
    .locals 3

    .line 167
    iget-object v0, p0, Ll/۫֨ۘ;->ܽ:Ll/ۤ֨ۘ;

    iget-object v1, v0, Ll/ۙ֨ۘ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt p1, v1, :cond_0

    return-void

    .line 170
    :cond_0
    iget-object v1, v0, Ll/ۙ֨ۘ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "get(...)"

    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0}, Ll/ۙ֨ۘ;->ܿ()F

    move-result v2

    float-to-int v2, v2

    invoke-static {v2, v1}, Ll/ۛ֨ۘ;->֫(ILandroid/view/View;)V

    .line 171
    invoke-virtual {v0, p1}, Ll/ۤ֨ۘ;->ۧ(I)V

    return-void
.end method

.method public final ֫(IFI)V
    .locals 8

    .line 127
    iget-object v0, p0, Ll/۫֨ۘ;->ܽ:Ll/ۤ֨ۘ;

    iget-object v1, v0, Ll/ۙ֨ۘ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "get(...)"

    invoke-static {v2, v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/widget/ImageView;

    .line 130
    invoke-virtual {v0}, Ll/ۙ֨ۘ;->ܿ()F

    move-result v4

    invoke-virtual {v0}, Ll/ۙ֨ۘ;->ܿ()F

    move-result v5

    invoke-static {v0}, Ll/ۤ֨ۘ;->ۧ(Ll/ۤ֨ۘ;)F

    move-result v6

    const/4 v7, 0x1

    int-to-float v7, v7

    sub-float/2addr v6, v7

    mul-float v6, v6, v5

    invoke-static {v7, p2, v6, v4}, Ll/᩶᩵ᩳ;->֫(FFFF)F

    move-result v4

    float-to-int v4, v4

    .line 131
    invoke-static {v4, v2}, Ll/ۛ֨ۘ;->֫(ILandroid/view/View;)V

    const-string v4, "<this>"

    .line 0
    invoke-static {v1, v4}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    if-ltz p3, :cond_1

    .line 24
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge p3, v4, :cond_1

    .line 134
    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3, v3}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Landroid/widget/ImageView;

    .line 137
    invoke-virtual {v0}, Ll/ۙ֨ۘ;->ܿ()F

    move-result v1

    invoke-virtual {v0}, Ll/ۙ֨ۘ;->ܿ()F

    move-result v3

    invoke-static {v0}, Ll/ۤ֨ۘ;->ۧ(Ll/ۤ֨ۘ;)F

    move-result v4

    sub-float/2addr v4, v7

    mul-float v4, v4, v3

    mul-float v4, v4, p2

    add-float/2addr v4, v1

    float-to-int v1, v4

    .line 138
    invoke-static {v1, p3}, Ll/ۛ֨ۘ;->֫(ILandroid/view/View;)V

    .line 140
    invoke-virtual {v2}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type com.tbuonomo.viewpagerdotsindicator.DotsGradientDrawable"

    invoke-static {v1, v2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ll/ۗ֨ۘ;

    .line 141
    invoke-virtual {p3}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    invoke-static {p3, v2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ll/ۗ֨ۘ;

    .line 143
    invoke-virtual {v0}, Ll/ۤ֨ۘ;->ܺ()I

    move-result v2

    invoke-virtual {v0}, Ll/ۙ֨ۘ;->ܽ()I

    move-result v3

    if-eq v2, v3, :cond_1

    .line 144
    invoke-static {v0}, Ll/ۤ֨ۘ;->֫(Ll/ۤ֨ۘ;)Landroid/animation/ArgbEvaluator;

    move-result-object v2

    .line 145
    invoke-virtual {v0}, Ll/ۤ֨ۘ;->ܺ()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    .line 146
    invoke-virtual {v0}, Ll/ۙ֨ۘ;->ܽ()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 144
    invoke-virtual {v2, p2, v3, v4}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type kotlin.Int"

    invoke-static {v2, v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 148
    invoke-static {v0}, Ll/ۤ֨ۘ;->֫(Ll/ۤ֨ۘ;)Landroid/animation/ArgbEvaluator;

    move-result-object v4

    .line 149
    invoke-virtual {v0}, Ll/ۙ֨ۘ;->ܽ()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 150
    invoke-virtual {v0}, Ll/ۤ֨ۘ;->ܺ()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 148
    invoke-virtual {v4, p2, v5, v6}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, v3}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 153
    invoke-virtual {p3, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 155
    invoke-static {v0}, Ll/ۤ֨ۘ;->ܽ(Ll/ۤ֨ۘ;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {v0}, Ll/ۙ֨ۘ;->᩻()Ll/᩹֨ۘ;

    move-result-object p2

    invoke-static {p2}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    check-cast p2, Ll/᩷۠ۘ;

    invoke-virtual {p2}, Ll/᩷۠ۘ;->ۧ()I

    move-result p2

    if-gt p1, p2, :cond_0

    .line 156
    invoke-virtual {v0}, Ll/ۤ֨ۘ;->ܺ()I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    goto :goto_0

    .line 158
    :cond_0
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 163
    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void
.end method
