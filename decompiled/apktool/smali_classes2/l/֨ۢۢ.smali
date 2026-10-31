.class public final Ll/֨ۢۢ;
.super Ll/ۗ۬ۧ;
.source "K1PX"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۗ:Ll/۠ۢۢ;

.field public ۙ:Landroid/widget/TextView;

.field public ᩶:Landroid/widget/TextView;

.field public ᩸:Ll/ܺۢۢ;

.field public ᩹:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Ll/۠ۢۢ;Landroid/view/ViewGroup;)V
    .locals 2

    .line 308
    iput-object p1, p0, Ll/֨ۢۢ;->ۗ:Ll/۠ۢۢ;

    .line 310
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0d0135

    const/4 v1, 0x0

    .line 311
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 309
    invoke-direct {p0, p1}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    .line 312
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const p2, 0x7f0a0278

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/֨ۢۢ;->᩹:Landroid/widget/ImageView;

    .line 313
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const p2, 0x7f0a03d6

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/֨ۢۢ;->ۙ:Landroid/widget/TextView;

    .line 314
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const p2, 0x7f0a028b

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/֨ۢۢ;->᩶:Landroid/widget/TextView;

    .line 315
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 320
    iget-object p1, p0, Ll/֨ۢۢ;->᩸:Ll/ܺۢۢ;

    iget-boolean v0, p1, Ll/ܺۢۢ;->ܿ:Z

    iget-object v1, p0, Ll/֨ۢۢ;->ۗ:Ll/۠ۢۢ;

    if-eqz v0, :cond_1

    .line 321
    iget-object p1, p1, Ll/ܺۢۢ;->ܳ:Ljava/lang/String;

    const-string v0, ".."

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 322
    invoke-static {v1}, Ll/۠ۢۢ;->ۧ(Ll/۠ۢۢ;)Ll/ۖۢۢ;

    move-result-object p1

    iget-object p1, p1, Ll/ۖۢۢ;->֫:Ll/ۚۢۢ;

    invoke-virtual {p1}, Ll/ۚۢۢ;->֫()Z

    return-void

    .line 324
    :cond_0
    invoke-static {v1}, Ll/۠ۢۢ;->ۧ(Ll/۠ۢۢ;)Ll/ۖۢۢ;

    move-result-object p1

    iget-object p1, p1, Ll/ۖۢۢ;->֫:Ll/ۚۢۢ;

    iget-object v0, p0, Ll/֨ۢۢ;->᩸:Ll/ܺۢۢ;

    iget-object v0, v0, Ll/ܺۢۢ;->ۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۚۢۢ;->֫(Ll/ۚۢۢ;Ljava/lang/String;)V

    .line 325
    invoke-static {v1}, Ll/۠ۢۢ;->ۧ(Ll/۠ۢۢ;)Ll/ۖۢۢ;

    move-result-object p1

    iget-object p1, p1, Ll/ۖۢۢ;->֫:Ll/ۚۢۢ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/ۚۢۢ;->ۧ(Ljava/lang/String;)V

    return-void

    .line 328
    :cond_1
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    iget-object v0, p0, Ll/֨ۢۢ;->᩸:Ll/ܺۢۢ;

    iget-object v0, v0, Ll/ܺۢۢ;->ۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->getParent()Ljava/lang/String;

    move-result-object v0

    const-string v2, "apk_selector_path"

    invoke-interface {p1, v2, v0}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    .line 329
    iget-object p1, p0, Ll/֨ۢۢ;->᩸:Ll/ܺۢۢ;

    iget-object p1, p1, Ll/ܺۢۢ;->ۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p1

    sget v0, Ll/۠ۢۢ;->᩻ۧ:I

    .line 147
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v2, "apkPath"

    .line 148
    invoke-virtual {v0, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 p1, -0x1

    .line 149
    invoke-virtual {v1, p1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 150
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    return-void
.end method
