.class public final Ll/᩹۬᩻;
.super Ll/᩶ۗۧ;
.source "J6WT"


# instance fields
.field public final synthetic ֫:Ll/ۗ۬᩻;


# direct methods
.method public constructor <init>(Ll/ۗ۬᩻;)V
    .locals 0

    .line 146
    iput-object p1, p0, Ll/᩹۬᩻;->֫:Ll/ۗ۬᩻;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 176
    iget-object v0, p0, Ll/᩹۬᩻;->֫:Ll/ۗ۬᩻;

    invoke-static {v0}, Ll/ۗ۬᩻;->ܳ(Ll/ۗ۬᩻;)Ll/᩵ۢۜ;

    move-result-object v0

    iget-object v0, v0, Ll/᩵ۢۜ;->ܽ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final getItemViewType(I)I
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 2

    .line 164
    iget-object v0, p0, Ll/᩹۬᩻;->֫:Ll/ۗ۬᩻;

    if-nez p2, :cond_0

    .line 165
    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-static {v0, p1}, Ll/ۗ۬᩻;->֫(Ll/ۗ۬᩻;Landroid/view/View;)V

    return-void

    .line 168
    :cond_0
    invoke-static {v0}, Ll/ۗ۬᩻;->ܳ(Ll/ۗ۬᩻;)Ll/᩵ۢۜ;

    move-result-object v0

    iget-object v0, v0, Ll/᩵ۢۜ;->ܽ:Ljava/util/List;

    add-int/lit8 p2, p2, -0x1

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩴۢۜ;

    .line 169
    check-cast p1, Ll/ۙ۬᩻;

    .line 170
    iget-object v0, p1, Ll/ۙ۬᩻;->ۧ:Landroid/widget/TextView;

    iget-object v1, p2, Ll/ᩴۢۜ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    iget-object p1, p1, Ll/ۙ۬᩻;->֫:Landroid/widget/TextView;

    iget-object p2, p2, Ll/ᩴۢۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 4

    .line 155
    iget-object v0, p0, Ll/᩹۬᩻;->֫:Ll/ۗ۬᩻;

    invoke-static {v0}, Ll/ۗ۬᩻;->ۧ(Ll/ۗ۬᩻;)Ll/ۗܺ᩷;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const/4 v2, 0x0

    if-nez p2, :cond_0

    .line 157
    new-instance p2, Ll/᩸۬᩻;

    const v0, 0x7f0d00d2

    invoke-virtual {v1, v0, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    return-object p2

    .line 159
    :cond_0
    new-instance p2, Ll/ۙ۬᩻;

    const v3, 0x7f0d0160

    invoke-virtual {v1, v3, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-direct {p2, v0, p1}, Ll/ۙ۬᩻;-><init>(Ll/ۗ۬᩻;Landroid/view/View;)V

    return-object p2
.end method
