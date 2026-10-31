.class public final Ll/۟ܿܿ;
.super Ll/᩶ۗۧ;
.source "4AWI"


# instance fields
.field public final synthetic ֫:Ll/᩻ܳܿ;


# direct methods
.method public constructor <init>(Ll/᩻ܳܿ;)V
    .locals 0

    .line 994
    iput-object p1, p0, Ll/۟ܿܿ;->֫:Ll/᩻ܳܿ;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 1020
    iget-object v0, p0, Ll/۟ܿܿ;->֫:Ll/᩻ܳܿ;

    invoke-virtual {v0}, Ll/᩻ܳܿ;->֫()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 6

    .line 994
    check-cast p1, Ll/ܳܳܿ;

    .line 1007
    iget-object v0, p1, Ll/ܳܳܿ;->᩸:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1008
    iget-object v0, p0, Ll/۟ܿܿ;->֫:Ll/᩻ܳܿ;

    invoke-virtual {v0}, Ll/᩻ܳܿ;->֫()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܶܳܿ;

    .line 1009
    iget-object v3, p1, Ll/ܳܳܿ;->ۗ:Landroid/widget/TextView;

    invoke-virtual {v2}, Ll/ܶܳܿ;->ᩳ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1010
    iget-object v3, p1, Ll/ܳܳܿ;->᩶:Landroid/widget/TextView;

    .line 44
    iget-object v4, v2, Ll/ܶܳܿ;->ۧ:Ll/ۧܿܿ;

    iget-object v2, v2, Ll/ܶܳܿ;->֫:Ll/ۧܿܿ;

    if-nez v2, :cond_0

    .line 45
    invoke-virtual {v4}, Ll/ۧܿܿ;->ۧ()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v4}, Ll/ۧܿܿ;->ۧ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Ll/ۧܿܿ;->ۧ()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v4, v5, v1

    const/4 v4, 0x1

    aput-object v2, v5, v4

    const v2, 0x7f120a5f

    invoke-static {v2, v5}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 1010
    :goto_0
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1011
    iget-object v2, v0, Ll/᩻ܳܿ;->ۢ:Ll/֡ܳܿ;

    invoke-static {v2}, Ll/֡ܳܿ;->ۧ(Ll/֡ܳܿ;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1012
    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    iget-object v0, v0, Ll/᩻ܳܿ;->ܽ:Ljava/util/BitSet;

    invoke-virtual {v0, p2}, Ljava/util/BitSet;->get(I)Z

    move-result p2

    if-eqz p2, :cond_1

    sget v1, Ll/᩹֡᩷;->ܺ:I

    :cond_1
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void

    .line 1013
    :cond_2
    iget-object p2, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    instance-of p2, p2, Landroid/graphics/drawable/ColorDrawable;

    if-eqz p2, :cond_3

    .line 1014
    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-static {p1}, Ll/᩶ۖ᩷;->֫(Landroid/view/View;)V

    :cond_3
    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 3

    .line 999
    iget-object p2, p0, Ll/۟ܿܿ;->֫:Ll/᩻ܳܿ;

    iget-object v0, p2, Ll/᩻ܳܿ;->ۢ:Ll/֡ܳܿ;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d016c

    const/4 v2, 0x0

    .line 1000
    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 1001
    new-instance v0, Ll/ܳܳܿ;

    invoke-direct {v0, p2, p1}, Ll/ܳܳܿ;-><init>(Ll/᩻ܳܿ;Landroid/view/View;)V

    return-object v0
.end method
