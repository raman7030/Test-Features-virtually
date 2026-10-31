.class public final synthetic Ll/ܶۘ᩻;
.super Ljava/lang/Object;
.source "J7J5"

# interfaces
.implements Ll/ܶۖ;


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/᩹ۘ᩻;

.field public final synthetic ᩹:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ۘ᩻;Landroid/view/View;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶۘ᩻;->᩸:Ll/᩹ۘ᩻;

    iput-object p2, p0, Ll/ܶۘ᩻;->᩹:Landroid/view/View;

    iput p3, p0, Ll/ܶۘ᩻;->᩶:I

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 6

    .line 225
    iget-object v0, p0, Ll/ܶۘ᩻;->᩸:Ll/᩹ۘ᩻;

    iget-object v1, v0, Ll/᩹ۘ᩻;->᩹:Ll/᩶ۘ᩻;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v2, 0x7f1202dd

    const/4 v3, 0x1

    if-ne p1, v2, :cond_0

    .line 226
    iget-object p1, p0, Ll/ܶۘ᩻;->᩹:Landroid/view/View;

    invoke-virtual {v0, p1}, Ll/᩹ۘ᩻;->onClick(Landroid/view/View;)V

    goto :goto_0

    .line 228
    :cond_0
    invoke-virtual {v1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    const v2, 0x7f120b7b

    invoke-virtual {p1, v2}, Ll/᩵ۚۢ;->ۧ(I)V

    iget-object v2, v0, Ll/᩹ۘ᩻;->᩶:Landroid/widget/TextView;

    .line 229
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    new-array v4, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const v2, 0x7f120870

    invoke-virtual {v1, v2, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v1, Ll/᩸ۘ᩻;

    iget v2, p0, Ll/ܶۘ᩻;->᩶:I

    invoke-direct {v1, v0, v2}, Ll/᩸ۘ᩻;-><init>(Ll/᩹ۘ᩻;I)V

    const v0, 0x7f12070a

    .line 230
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    const/4 v1, 0x0

    .line 234
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 235
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    :goto_0
    return v3
.end method
