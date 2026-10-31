.class public final Ll/ᩴ֨ۧ;
.super Ll/ۚ֨ۧ;
.source "28G3"


# instance fields
.field public final synthetic ܽ:Ll/۠֨ۧ;


# direct methods
.method public constructor <init>(Ll/۠֨ۧ;)V
    .locals 0

    .line 2249
    iput-object p1, p0, Ll/ᩴ֨ۧ;->ܽ:Ll/۠֨ۧ;

    invoke-direct {p0, p1}, Ll/ۚ֨ۧ;-><init>(Ll/۠֨ۧ;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 0

    .line 2249
    check-cast p1, Ll/ۖ֨ۧ;

    invoke-virtual {p0, p1, p2}, Ll/ᩴ֨ۧ;->֫(Ll/ۖ֨ۧ;I)V

    return-void
.end method

.method public final ֫(Ljava/util/List;)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2253
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 2254
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩵֨ۧ;

    .line 2245
    iget-object v3, v2, Ll/᩵֨ۧ;->֫:Ll/᩺᩵֫;

    iget v2, v2, Ll/᩵֨ۧ;->ۧ:I

    invoke-virtual {v3, v2}, Ll/᩺᩵֫;->ۧ(I)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2260
    :cond_1
    :goto_1
    iget-object v1, p0, Ll/ᩴ֨ۧ;->ܽ:Ll/۠֨ۧ;

    invoke-static {v1}, Ll/۠֨ۧ;->۬(Ll/۠֨ۧ;)Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v2, :cond_4

    .line 2261
    invoke-static {v1}, Ll/۠֨ۧ;->۬(Ll/۠֨ۧ;)Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v0, :cond_2

    .line 2262
    invoke-static {v1}, Ll/۠֨ۧ;->ۛ(Ll/۠֨ۧ;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    goto :goto_2

    :cond_2
    invoke-static {v1}, Ll/۠֨ۧ;->۫(Ll/۠֨ۧ;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 2261
    :goto_2
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2263
    invoke-static {v1}, Ll/۠֨ۧ;->۬(Ll/۠֨ۧ;)Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v0, :cond_3

    .line 2264
    invoke-static {v1}, Ll/۠֨ۧ;->ۨ(Ll/۠֨ۧ;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_3
    invoke-static {v1}, Ll/۠֨ۧ;->ۤ(Ll/۠֨ۧ;)Ljava/lang/String;

    move-result-object v0

    .line 2263
    :goto_3
    invoke-virtual {v2, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 2266
    :cond_4
    iput-object p1, p0, Ll/ۚ֨ۧ;->ۧ:Ljava/util/List;

    return-void
.end method

.method public final ֫(Ll/ۖ֨ۧ;)V
    .locals 4

    .line 2273
    iget-object v0, p1, Ll/ۖ֨ۧ;->ۧ:Landroid/widget/TextView;

    const v1, 0x7f120346

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2275
    :goto_0
    iget-object v2, p0, Ll/ۚ֨ۧ;->ۧ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 2276
    iget-object v2, p0, Ll/ۚ֨ۧ;->ۧ:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩵֨ۧ;

    .line 2245
    iget-object v3, v2, Ll/᩵֨ۧ;->֫:Ll/᩺᩵֫;

    iget v2, v2, Ll/᩵֨ۧ;->ۧ:I

    invoke-virtual {v3, v2}, Ll/᩺᩵֫;->ۧ(I)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x1

    .line 2281
    :goto_1
    iget-object v2, p1, Ll/ۖ֨ۧ;->֫:Landroid/view/View;

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    const/4 v0, 0x4

    :goto_2
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 2282
    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    new-instance v0, Ll/ۘ֨ۧ;

    invoke-direct {v0, p0}, Ll/ۘ֨ۧ;-><init>(Ll/ᩴ֨ۧ;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final ֫(Ll/ۖ֨ۧ;I)V
    .locals 1

    .line 2303
    invoke-super {p0, p1, p2}, Ll/ۚ֨ۧ;->֫(Ll/ۖ֨ۧ;I)V

    if-lez p2, :cond_1

    .line 2305
    iget-object v0, p0, Ll/ۚ֨ۧ;->ۧ:Ljava/util/List;

    add-int/lit8 p2, p2, -0x1

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩵֨ۧ;

    .line 2306
    iget-object p1, p1, Ll/ۖ֨ۧ;->֫:Landroid/view/View;

    .line 2245
    iget-object v0, p2, Ll/᩵֨ۧ;->֫:Ll/᩺᩵֫;

    iget p2, p2, Ll/᩵֨ۧ;->ۧ:I

    invoke-virtual {v0, p2}, Ll/᩺᩵֫;->ۧ(I)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const/4 p2, 0x4

    .line 2306
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 0

    return-void
.end method
