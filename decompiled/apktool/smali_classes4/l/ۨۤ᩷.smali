.class public final Ll/ۨۤ᩷;
.super Ll/᩶ۗۧ;
.source "31K1"


# instance fields
.field public final synthetic ֫:Ll/ܿۛ᩷;


# direct methods
.method public constructor <init>(Ll/ܿۛ᩷;)V
    .locals 0

    .line 2722
    iput-object p1, p0, Ll/ۨۤ᩷;->֫:Ll/ܿۛ᩷;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 2765
    iget-object v0, p0, Ll/ۨۤ᩷;->֫:Ll/ܿۛ᩷;

    invoke-static {v0}, Ll/ܿۛ᩷;->ۚ(Ll/ܿۛ᩷;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 6

    .line 2722
    check-cast p1, Ll/ᩳۛ᩷;

    .line 2733
    iget-object v0, p0, Ll/ۨۤ᩷;->֫:Ll/ܿۛ᩷;

    invoke-static {v0}, Ll/ܿۛ᩷;->ۚ(Ll/ܿۛ᩷;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܳۛ᩷;

    .line 2734
    invoke-virtual {v1}, Ll/ܳۛ᩷;->ܿ()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 2735
    invoke-static {p1}, Ll/ᩳۛ᩷;->ܿ(Ll/ᩳۛ᩷;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v1}, Ll/ܳۛ᩷;->᩷()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2736
    invoke-static {v0}, Ll/ܿۛ᩷;->ۘ(Ll/ܿۛ᩷;)I

    move-result v3

    const/4 v4, 0x0

    if-ne v3, p2, :cond_0

    .line 2737
    invoke-static {p1}, Ll/ᩳۛ᩷;->ܿ(Ll/ᩳۛ᩷;)Landroid/widget/TextView;

    move-result-object p2

    sget v3, Ll/᩹֡᩷;->֫:I

    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2738
    invoke-static {p1}, Ll/ᩳۛ᩷;->֫(Ll/ᩳۛ᩷;)Landroid/view/View;

    move-result-object p2

    sget v3, Ll/᩹֡᩷;->֫:I

    const v5, 0x20ffffff

    and-int/2addr v3, v5

    invoke-virtual {p2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 2739
    sget p2, Ll/᩹֡᩷;->֫:I

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v2, p2, v3}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_0

    .line 2741
    :cond_0
    invoke-static {p1}, Ll/ᩳۛ᩷;->ܿ(Ll/ᩳۛ᩷;)Landroid/widget/TextView;

    move-result-object p2

    sget-object v3, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 2742
    invoke-static {p1}, Ll/ᩳۛ᩷;->֫(Ll/ᩳۛ᩷;)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 2743
    sget p2, Ll/᩹֡᩷;->ܳ֫:I

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v2, p2, v3}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 2745
    :goto_0
    invoke-static {p1}, Ll/ᩳۛ᩷;->ܽ(Ll/ᩳۛ᩷;)Landroid/widget/ImageView;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2746
    invoke-virtual {v1}, Ll/ܳۛ᩷;->ۜ()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    .line 2748
    invoke-static {p1}, Ll/ᩳۛ᩷;->ܿ(Ll/ᩳۛ᩷;)Landroid/widget/TextView;

    move-result-object p2

    const/high16 v2, 0x41880000    # 17.0f

    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 2749
    invoke-static {p1}, Ll/ᩳۛ᩷;->ᩳ(Ll/ᩳۛ᩷;)Landroid/widget/TextView;

    move-result-object p2

    const/16 v2, 0x8

    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 2751
    :cond_1
    invoke-static {p1}, Ll/ᩳۛ᩷;->ܿ(Ll/ᩳۛ᩷;)Landroid/widget/TextView;

    move-result-object v2

    const/high16 v3, 0x41700000    # 15.0f

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    .line 2752
    invoke-static {p1}, Ll/ᩳۛ᩷;->ᩳ(Ll/ᩳۛ᩷;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2753
    invoke-static {p1}, Ll/ᩳۛ᩷;->ᩳ(Ll/ᩳۛ᩷;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2755
    :goto_1
    invoke-virtual {v1}, Ll/ܳۛ᩷;->ۘ()Z

    move-result p2

    if-eqz p2, :cond_2

    .line 2756
    iget-object p2, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    sget v2, Ll/᩹֡᩷;->᩻:I

    invoke-virtual {p2, v2}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_2

    .line 2758
    :cond_2
    iget-object p2, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p2, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 2760
    :goto_2
    invoke-static {v0}, Ll/ܿۛ᩷;->᩸(Ll/ܿۛ᩷;)Ll/ܽۢۡ;

    move-result-object p2

    invoke-static {p1}, Ll/ᩳۛ᩷;->ۧ(Ll/ᩳۛ᩷;)Landroid/widget/ImageView;

    move-result-object p1

    invoke-static {v0, v1}, Ll/ܿۛ᩷;->ܽ(Ll/ܿۛ᩷;Ll/ܳۛ᩷;)Z

    move-result v0

    invoke-virtual {p2, p1, v0}, Ll/ܽۢۡ;->֫(Landroid/widget/ImageView;Z)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 3

    .line 2727
    iget-object p2, p0, Ll/ۨۤ᩷;->֫:Ll/ܿۛ᩷;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0119

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2728
    new-instance v0, Ll/ᩳۛ᩷;

    invoke-direct {v0, p2, p1}, Ll/ᩳۛ᩷;-><init>(Ll/ܿۛ᩷;Landroid/view/View;)V

    return-object v0
.end method
