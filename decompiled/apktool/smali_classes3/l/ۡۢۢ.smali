.class public final Ll/ۡۢۢ;
.super Ll/ۗ۬ۧ;
.source "K1PX"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public ۗ:Landroid/widget/TextView;

.field public ۙ:Landroid/widget/TextView;

.field public final synthetic ۬:Ll/۠ۢۢ;

.field public ᩶:Landroid/widget/ImageView;

.field public ᩸:Ll/ᩳۢۢ;

.field public ᩹:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ll/۠ۢۢ;Landroid/view/ViewGroup;)V
    .locals 2

    .line 461
    iput-object p1, p0, Ll/ۡۢۢ;->۬:Ll/۠ۢۢ;

    .line 463
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0d0134

    const/4 v1, 0x0

    .line 464
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 462
    invoke-direct {p0, p1}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    .line 465
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const p2, 0x7f0a0278

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/ۡۢۢ;->᩶:Landroid/widget/ImageView;

    .line 466
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const p2, 0x7f0a0073

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ۡۢۢ;->᩹:Landroid/widget/TextView;

    .line 467
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const p2, 0x7f0a041e

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ۡۢۢ;->ۗ:Landroid/widget/TextView;

    .line 468
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    const p2, 0x7f0a028b

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ۡۢۢ;->ۙ:Landroid/widget/TextView;

    .line 469
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 474
    iget-object p1, p0, Ll/ۡۢۢ;->᩸:Ll/ᩳۢۢ;

    iget-object p1, p1, Ll/ᩳۢۢ;->ܿ:Landroid/content/pm/PackageInfo;

    iget-object p1, p1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    sget v0, Ll/۠ۢۢ;->᩻ۧ:I

    .line 147
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "apkPath"

    .line 148
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 p1, -0x1

    .line 149
    iget-object v1, p0, Ll/ۡۢۢ;->۬:Ll/۠ۢۢ;

    invoke-virtual {v1, p1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    .line 150
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    return-void
.end method
