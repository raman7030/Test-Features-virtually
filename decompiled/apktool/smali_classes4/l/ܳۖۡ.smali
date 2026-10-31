.class public final Ll/ܳۖۡ;
.super Ll/᩶ۗۧ;
.source "T8W7"


# instance fields
.field public final synthetic ֫:Ll/ۢۖۡ;


# direct methods
.method public constructor <init>(Ll/ۢۖۡ;)V
    .locals 0

    .line 198
    iput-object p1, p0, Ll/ܳۖۡ;->֫:Ll/ۢۖۡ;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final getItemCount()I
    .locals 1

    .line 217
    iget-object v0, p0, Ll/ܳۖۡ;->֫:Ll/ۢۖۡ;

    invoke-static {v0}, Ll/ۢۖۡ;->ۧ(Ll/ۢۖۡ;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 2

    .line 198
    check-cast p1, Ll/᩷ۖۡ;

    .line 211
    iget-object v0, p1, Ll/᩷ۖۡ;->᩸:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 212
    iget-object p1, p1, Ll/᩷ۖۡ;->ۙ:Landroid/widget/TextView;

    iget-object v0, p0, Ll/ܳۖۡ;->֫:Ll/ۢۖۡ;

    invoke-static {v0}, Ll/ۢۖۡ;->ۧ(Ll/ۢۖۡ;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/۟ܺۡ;

    invoke-virtual {p2}, Ll/۟ܺۡ;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 3

    .line 203
    iget-object p2, p0, Ll/ܳۖۡ;->֫:Ll/ۢۖۡ;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0d0154

    const/4 v2, 0x0

    .line 204
    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 205
    new-instance v0, Ll/᩷ۖۡ;

    invoke-direct {v0, p2, p1}, Ll/᩷ۖۡ;-><init>(Ll/ۢۖۡ;Landroid/view/View;)V

    return-object v0
.end method
