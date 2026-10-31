.class public final synthetic Ll/ۜ۫ܿ;
.super Ljava/lang/Object;
.source "G7AW"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۙ:Ll/֡ۚۢ;

.field public final synthetic ᩶:Ll/۠۫ܿ;

.field public final synthetic ᩸:Ll/ۗܺ᩷;

.field public final synthetic ᩹:Ll/ܽᩴۢ;


# direct methods
.method public synthetic constructor <init>(Ll/᩸۫ܿ;Ll/ۗܺ᩷;Ll/ܽᩴۢ;Ll/۠۫ܿ;Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ۜ۫ܿ;->᩸:Ll/ۗܺ᩷;

    iput-object p3, p0, Ll/ۜ۫ܿ;->᩹:Ll/ܽᩴۢ;

    iput-object p4, p0, Ll/ۜ۫ܿ;->᩶:Ll/۠۫ܿ;

    iput-object p5, p0, Ll/ۜ۫ܿ;->ۙ:Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 561
    iget-object p1, p0, Ll/ۜ۫ܿ;->᩹:Ll/ܽᩴۢ;

    invoke-virtual {p1}, Ll/ܽᩴۢ;->ۧ()Ljava/lang/String;

    move-result-object v0

    .line 496
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    iget-object v2, p0, Ll/ۜ۫ܿ;->᩸:Ll/ۗܺ᩷;

    if-eqz v1, :cond_0

    const v0, 0x7f12084a

    .line 497
    invoke-virtual {v2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 562
    :cond_0
    sget v1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v1, Ll/᩵ۚۢ;

    invoke-direct {v1, v2}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    const v3, 0x7f120836

    .line 563
    invoke-virtual {v1, v3}, Ll/᩵ۚۢ;->ۧ(I)V

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const v0, 0x7f120837

    .line 564
    invoke-virtual {v2, v0, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    const/4 v0, 0x0

    const v2, 0x7f12015e

    .line 0
    invoke-static {v1, v3, v0, v2, v0}, Ll/۟ۖᩴ;->֫(Ll/᩵ۚۢ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/֡ۚۢ;

    move-result-object v0

    .line 568
    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v1

    new-instance v2, Ll/᩷۫ܿ;

    iget-object v3, p0, Ll/ۜ۫ܿ;->ۙ:Ll/֡ۚۢ;

    iget-object v4, p0, Ll/ۜ۫ܿ;->᩶:Ll/۠۫ܿ;

    invoke-direct {v2, v0, p1, v3, v4}, Ll/᩷۫ܿ;-><init>(Ll/֡ۚۢ;Ll/ܽᩴۢ;Ll/֡ۚۢ;Ll/۠۫ܿ;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
