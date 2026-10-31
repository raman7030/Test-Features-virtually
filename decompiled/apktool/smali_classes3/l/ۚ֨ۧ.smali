.class public abstract Ll/ۚ֨ۧ;
.super Ll/᩶ۗۧ;
.source "28G3"


# instance fields
.field public final synthetic ֫:Ll/۠֨ۧ;

.field public ۧ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/۠֨ۧ;)V
    .locals 0

    .line 2395
    iput-object p1, p0, Ll/ۚ֨ۧ;->֫:Ll/۠֨ۧ;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    .line 2396
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۚ֨ۧ;->ۧ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 2453
    iget-object v0, p0, Ll/ۚ֨ۧ;->ۧ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget-object v0, p0, Ll/ۚ֨ۧ;->ۧ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 0

    .line 2391
    check-cast p1, Ll/ۖ֨ۧ;

    invoke-virtual {p0, p1, p2}, Ll/ۚ֨ۧ;->֫(Ll/ۖ֨ۧ;I)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 2

    .line 2403
    iget-object p2, p0, Ll/ۚ֨ۧ;->֫:Ll/۠֨ۧ;

    .line 2404
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d0126

    const/4 v1, 0x0

    .line 2405
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2407
    new-instance p2, Ll/ۖ֨ۧ;

    invoke-direct {p2, p1}, Ll/ۖ֨ۧ;-><init>(Landroid/view/View;)V

    return-object p2
.end method

.method public abstract ֫(Ll/ۖ֨ۧ;)V
.end method

.method public ֫(Ll/ۖ֨ۧ;I)V
    .locals 6

    .line 2416
    iget-object v0, p0, Ll/ۚ֨ۧ;->֫:Ll/۠֨ۧ;

    invoke-static {v0}, Ll/۠֨ۧ;->ᩴ(Ll/۠֨ۧ;)Ll/֨᩵֫;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-nez p2, :cond_1

    .line 2421
    invoke-virtual {p0, p1}, Ll/ۚ֨ۧ;->֫(Ll/ۖ֨ۧ;)V

    return-void

    .line 2423
    :cond_1
    iget-object v1, p0, Ll/ۚ֨ۧ;->ۧ:Ljava/util/List;

    const/4 v2, 0x1

    sub-int/2addr p2, v2

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩵֨ۧ;

    .line 2424
    iget-object v1, p2, Ll/᩵֨ۧ;->֫:Ll/᩺᩵֫;

    invoke-virtual {v1}, Ll/᩺᩵֫;->֫()Ll/۬᩵֫;

    move-result-object v1

    .line 2425
    invoke-interface {v0}, Ll/֨᩵֫;->۠()Ll/ۨ᩵֫;

    move-result-object v3

    .line 2426
    iget-object v3, v3, Ll/ۨ᩵֫;->ۚ:Ll/ۢ۬ܺ;

    .line 2427
    invoke-virtual {v3, v1}, Ll/ۢ۬ܺ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    .line 2245
    iget-object v3, p2, Ll/᩵֨ۧ;->֫:Ll/᩺᩵֫;

    iget v5, p2, Ll/᩵֨ۧ;->ۧ:I

    invoke-virtual {v3, v5}, Ll/᩺᩵֫;->ۧ(I)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    .line 2428
    :goto_0
    iget-object v3, p1, Ll/ۖ֨ۧ;->ۧ:Landroid/widget/TextView;

    iget-object v5, p2, Ll/᩵֨ۧ;->ܽ:Ljava/lang/String;

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2429
    iget-object v3, p1, Ll/ۖ֨ۧ;->֫:Landroid/view/View;

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v4, 0x4

    :goto_1
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2430
    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    new-instance v2, Ll/֡֨ۧ;

    invoke-direct {v2, p0, v0, v1, p2}, Ll/֡֨ۧ;-><init>(Ll/ۚ֨ۧ;Ll/֨᩵֫;Ll/۬᩵֫;Ll/᩵֨ۧ;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public abstract ۧ(Ljava/lang/String;)V
.end method
