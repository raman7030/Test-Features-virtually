.class public final synthetic Ll/᩸᩻ᩳ;
.super Ljava/lang/Object;
.source "K5R1"

# interfaces
.implements Ll/ܶۖ;


# instance fields
.field public final synthetic ᩸:Ll/ۜۜᩳ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/ۜۜᩳ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸᩻ᩳ;->᩸:Ll/ۜۜᩳ;

    iput p2, p0, Ll/᩸᩻ᩳ;->᩹:I

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 5

    .line 2
    sget v0, Ll/ۜۜᩳ;->᩷ۧ:I

    .line 424
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    .line 425
    iget-object v0, p0, Ll/᩸᩻ᩳ;->᩸:Ll/ۜۜᩳ;

    const/4 v1, 0x6

    const/4 v2, 0x1

    const v3, 0x7f1205c2

    if-ne p1, v3, :cond_0

    .line 426
    new-instance p1, Ll/ܽۜᩳ;

    invoke-direct {p1, v0, v0}, Ll/ܽۜᩳ;-><init>(Ll/ۜۜᩳ;Ll/ۗܺ᩷;)V

    .line 451
    invoke-virtual {p1, v3}, Ll/۬ۗܿ;->ۡ(I)V

    iget-object v0, v0, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v0, v0, Ll/᩻ۜᩳ;->ۙ:Ll/ۖܿܽ;

    .line 452
    invoke-virtual {v0}, Ll/ۜᩳܽ;->ۘۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 453
    invoke-virtual {p1}, Ll/۬ۗܿ;->֫()V

    .line 454
    invoke-virtual {p1, v1}, Ll/۬ۗܿ;->ᩳ(I)V

    .line 455
    invoke-virtual {p1}, Ll/۬ۗܿ;->᩵()V

    .line 205
    invoke-virtual {p1, v2}, Ll/۬ۗܿ;->ۧ(Z)V

    return v2

    :cond_0
    const v3, 0x7f1205ca

    if-ne p1, v3, :cond_1

    .line 458
    sget p1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance p1, Ll/᩵ۚۢ;

    invoke-direct {p1, v0}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 459
    invoke-virtual {p1, v3}, Ll/᩵ۚۢ;->ۧ(I)V

    iget-object v1, v0, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v1, v1, Ll/᩻ۜᩳ;->ۙ:Ll/ۖܿܽ;

    .line 460
    invoke-virtual {v1}, Ll/ۜᩳܽ;->ۧۧ()Ljava/lang/String;

    move-result-object v1

    new-array v3, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const v1, 0x7f120870

    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v1, Ll/۬᩻ᩳ;

    iget v3, p0, Ll/᩸᩻ᩳ;->᩹:I

    invoke-direct {v1, v0, v3}, Ll/۬᩻ᩳ;-><init>(Ll/ۜۜᩳ;I)V

    const v0, 0x7f12070a

    .line 461
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    const/4 v1, 0x0

    .line 467
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 468
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return v2

    :cond_1
    const v3, 0x7f1205f9

    if-ne p1, v3, :cond_2

    .line 471
    new-instance p1, Ll/ᩳۜᩳ;

    invoke-direct {p1, v0, v0}, Ll/ᩳۜᩳ;-><init>(Ll/ۜۜᩳ;Ll/ۗܺ᩷;)V

    .line 499
    invoke-virtual {p1, v3}, Ll/۬ۗܿ;->ۡ(I)V

    iget-object v0, v0, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v0, v0, Ll/᩻ۜᩳ;->ۙ:Ll/ۖܿܽ;

    .line 500
    invoke-virtual {v0}, Ll/ۜᩳܽ;->ۘۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 501
    invoke-virtual {p1}, Ll/۬ۗܿ;->֫()V

    .line 502
    invoke-virtual {p1, v1}, Ll/۬ۗܿ;->ᩳ(I)V

    .line 503
    invoke-virtual {p1}, Ll/۬ۗܿ;->֡()V

    .line 205
    invoke-virtual {p1, v2}, Ll/۬ۗܿ;->ۧ(Z)V

    :cond_2
    return v2
.end method
