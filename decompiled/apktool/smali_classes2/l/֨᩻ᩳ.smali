.class public final synthetic Ll/֨᩻ᩳ;
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

    iput-object p1, p0, Ll/֨᩻ᩳ;->᩸:Ll/ۜۜᩳ;

    iput p2, p0, Ll/֨᩻ᩳ;->᩹:I

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 5

    .line 2
    sget v0, Ll/ۜۜᩳ;->᩷ۧ:I

    .line 334
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const/4 v0, 0x1

    const v1, 0x7f1205ca

    if-ne p1, v1, :cond_0

    .line 336
    iget-object p1, p0, Ll/֨᩻ᩳ;->᩸:Ll/ۜۜᩳ;

    iget-object v2, p1, Ll/ۜۜᩳ;->ۜۧ:Ll/᩻ۜᩳ;

    iget-object v3, v2, Ll/᩻ۜᩳ;->ۛ:Ll/۫ܽܽ;

    iget-object v2, v2, Ll/᩻ۜᩳ;->ۨ:Ll/ۙܿܽ;

    invoke-virtual {v2}, Ll/ۛᩳܽ;->ۡ֫()I

    move-result v2

    invoke-virtual {v3, v2}, Ll/۫ܽܽ;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    .line 337
    sget v3, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v3, Ll/᩵ۚۢ;

    invoke-direct {v3, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 338
    invoke-virtual {v3, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v1, v4

    const v2, 0x7f120870

    .line 339
    invoke-virtual {p1, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v1, Ll/֡᩻ᩳ;

    iget v2, p0, Ll/֨᩻ᩳ;->᩹:I

    invoke-direct {v1, p1, v2}, Ll/֡᩻ᩳ;-><init>(Ll/ۜۜᩳ;I)V

    const p1, 0x7f12070a

    .line 340
    invoke-virtual {v3, p1, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 v1, 0x0

    .line 345
    invoke-virtual {v3, p1, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 346
    invoke-virtual {v3}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    :cond_0
    return v0
.end method
