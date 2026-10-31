.class public final synthetic Ll/ۡ֨ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ll/᩹ܶᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ܶᩳ;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p3, p0, Ll/ۡ֨ᩳ;->᩸:I

    iput-object p1, p0, Ll/ۡ֨ᩳ;->᩹:Ll/᩹ܶᩳ;

    iput-object p2, p0, Ll/ۡ֨ᩳ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 2
    iget p1, p0, Ll/ۡ֨ᩳ;->᩸:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/ۡ֨ᩳ;->᩶:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/ܽ֨ᩳ;

    .line 2659
    iget-object p2, p0, Ll/ۡ֨ᩳ;->᩹:Ll/᩹ܶᩳ;

    invoke-virtual {p2}, Ll/᩹ܶᩳ;->ۙ()V

    const/4 p2, 0x0

    .line 2660
    invoke-virtual {p1, p2}, Ll/ܽ֨ᩳ;->֫(Z)V

    return-void

    .line 0
    :pswitch_0
    iget-object p1, p0, Ll/ۡ֨ᩳ;->᩶:Ljava/lang/Object;

    check-cast p1, Ll/ۙܶᩳ;

    .line 532
    iget-object p2, p0, Ll/ۡ֨ᩳ;->᩹:Ll/᩹ܶᩳ;

    invoke-virtual {p2}, Ll/֫ۘᩳ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 402
    invoke-virtual {p2}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v0

    check-cast v0, Ll/ܽ֨ᩳ;

    .line 533
    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f120b7b

    .line 534
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    const v1, 0x7f1201ee

    .line 535
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(I)V

    new-instance v1, Ll/֡֨ᩳ;

    invoke-direct {v1, p2}, Ll/֡֨ᩳ;-><init>(Ll/᩹ܶᩳ;)V

    const v2, 0x7f12070a

    .line 536
    invoke-virtual {v0, v2, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v1, Ll/ۚ֨ᩳ;

    invoke-direct {v1, p2, p1}, Ll/ۚ֨ᩳ;-><init>(Ll/᩹ܶᩳ;Ll/ۙܶᩳ;)V

    const p1, 0x7f12015e

    .line 539
    invoke-virtual {v0, p1, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const/4 p1, 0x0

    .line 542
    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(Z)V

    .line 543
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    goto :goto_0

    .line 402
    :cond_0
    invoke-virtual {p2}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object p1

    check-cast p1, Ll/ܽ֨ᩳ;

    .line 2977
    invoke-virtual {p1, p2}, Ll/ܽ֨ᩳ;->֫(Ll/᩹ܶᩳ;)V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
