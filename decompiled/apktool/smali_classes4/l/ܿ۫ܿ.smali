.class public final synthetic Ll/ܿ۫ܿ;
.super Ljava/lang/Object;
.source "G7AW"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/᩸۫ܿ;

.field public final synthetic ᩹:Ll/ۗܺ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/᩸۫ܿ;Ll/ۗܺ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ۫ܿ;->᩸:Ll/᩸۫ܿ;

    iput-object p2, p0, Ll/ܿ۫ܿ;->᩹:Ll/ۗܺ᩷;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    const p1, 0x7f0d00cc

    .line 463
    iget-object v0, p0, Ll/ܿ۫ܿ;->᩹:Ll/ۗܺ᩷;

    invoke-virtual {v0, p1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p1

    const v1, 0x7f0a0631

    .line 464
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f12083e

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    const v1, 0x7f0a02e0

    .line 465
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ListView;

    .line 466
    new-instance v2, Ll/۠۫ܿ;

    invoke-direct {v2, v0}, Ll/۠۫ܿ;-><init>(Ll/ۗܺ᩷;)V

    .line 467
    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 468
    invoke-static {v1}, Ll/ۙ᩸ۡ;->֫(Landroid/widget/ListView;)V

    .line 469
    new-instance v3, Ll/᩻۫ܿ;

    iget-object v4, p0, Ll/ܿ۫ܿ;->᩸:Ll/᩸۫ܿ;

    invoke-direct {v3, v4, v2, v0}, Ll/᩻۫ܿ;-><init>(Ll/᩸۫ܿ;Ll/۠۫ܿ;Ll/ۗܺ᩷;)V

    invoke-virtual {v1, v3}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 475
    sget v1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v1, Ll/᩵ۚۢ;

    invoke-direct {v1, v0}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 476
    invoke-virtual {v1, p1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const p1, 0x7f120189

    const/4 v0, 0x0

    .line 477
    invoke-virtual {v1, p1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 478
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
