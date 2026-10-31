.class public final synthetic Ll/᩵᩻ᩳ;
.super Ljava/lang/Object;
.source "K5R1"

# interfaces
.implements Ll/ܶۖ;


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/ۜۜᩳ;

.field public final synthetic ᩹:Ll/ۙۜᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/ۜۜᩳ;Ll/ۙۜᩳ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵᩻ᩳ;->᩸:Ll/ۜۜᩳ;

    iput-object p2, p0, Ll/᩵᩻ᩳ;->᩹:Ll/ۙۜᩳ;

    iput p3, p0, Ll/᩵᩻ᩳ;->᩶:I

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 5

    .line 2
    sget v0, Ll/ۜۜᩳ;->᩷ۧ:I

    .line 377
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f1205c4

    const/4 v1, 0x1

    .line 378
    iget-object v2, p0, Ll/᩵᩻ᩳ;->᩸:Ll/ۜۜᩳ;

    if-ne p1, v0, :cond_0

    .line 379
    iget-object p1, v2, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object p1, p1, Ll/᩻ۜᩳ;->ۗ:Ll/ᩴܿܽ;

    invoke-virtual {p1}, Ll/᩷ᩳܽ;->ᩴ()Ljava/lang/String;

    move-result-object p1

    const v0, 0x7f120461

    invoke-static {v0, p1}, Ll/ۙ᩸᩷;->֫(ILjava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const v0, 0x7f1205f2

    if-ne p1, v0, :cond_1

    .line 382
    iget-object p1, v2, Ll/ۜۜᩳ;->ܿۧ:Ll/ܶۜᩳ;

    invoke-virtual {p1}, Ll/ܶۜᩳ;->֫()V

    goto :goto_0

    :cond_1
    const v0, 0x7f1205ca

    if-ne p1, v0, :cond_2

    .line 385
    sget p1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance p1, Ll/᩵ۚۢ;

    invoke-direct {p1, v2}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 386
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->ۧ(I)V

    iget-object v0, v2, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v0, v0, Ll/᩻ۜᩳ;->ۗ:Ll/ᩴܿܽ;

    .line 387
    invoke-virtual {v0}, Ll/ᩴܿܽ;->۟֫()Ljava/lang/String;

    move-result-object v0

    new-array v3, v1, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const v0, 0x7f120870

    invoke-virtual {v2, v0, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v0, Ll/ۚ᩻ᩳ;

    iget-object v3, p0, Ll/᩵᩻ᩳ;->᩹:Ll/ۙۜᩳ;

    iget v4, p0, Ll/᩵᩻ᩳ;->᩶:I

    invoke-direct {v0, v2, v3, v4}, Ll/ۚ᩻ᩳ;-><init>(Ll/ۜۜᩳ;Ll/ۙۜᩳ;I)V

    const v2, 0x7f12070a

    .line 388
    invoke-virtual {p1, v2, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    const/4 v2, 0x0

    .line 406
    invoke-virtual {p1, v0, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 407
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    :cond_2
    :goto_0
    return v1
.end method
