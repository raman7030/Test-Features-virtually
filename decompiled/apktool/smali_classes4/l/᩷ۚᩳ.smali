.class public final synthetic Ll/᩷ۚᩳ;
.super Ljava/lang/Object;
.source "75NJ"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩷ۚᩳ;->᩸:I

    iput-object p2, p0, Ll/᩷ۚᩳ;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/᩷ۚᩳ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 2
    iget p1, p0, Ll/᩷ۚᩳ;->᩸:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/᩷ۚᩳ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/᩹ܶᩳ;

    .line 11
    iget-object p2, p0, Ll/᩷ۚᩳ;->᩶:Ljava/lang/Object;

    .line 13
    check-cast p2, Ll/ۙܶᩳ;

    .line 558
    invoke-virtual {p1}, Ll/֫ۘᩳ;->᩷()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 402
    invoke-virtual {p1}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v0

    check-cast v0, Ll/ܽ֨ᩳ;

    .line 559
    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v2, 0x7f120b7b

    .line 560
    invoke-virtual {v0, v2}, Ll/᩵ۚۢ;->ۧ(I)V

    const v2, 0x7f1201ee

    .line 561
    invoke-virtual {v0, v2}, Ll/᩵ۚۢ;->֫(I)V

    new-instance v2, Ll/᩻֨ۡ;

    const/4 v3, 0x2

    invoke-direct {v2, v3, p1}, Ll/᩻֨ۡ;-><init>(ILjava/lang/Object;)V

    const v3, 0x7f12070a

    .line 562
    invoke-virtual {v0, v3, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v2, Ll/᩵֨ᩳ;

    invoke-direct {v2, p1, p2}, Ll/᩵֨ᩳ;-><init>(Ll/᩹ܶᩳ;Ll/ۙܶᩳ;)V

    const p1, 0x7f12015e

    .line 565
    invoke-virtual {v0, p1, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 568
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(Z)V

    .line 569
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object p1, p0, Ll/᩷ۚᩳ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/ܽ֨ᩳ;

    iget-object p2, p0, Ll/᩷ۚᩳ;->᩶:Ljava/lang/Object;

    check-cast p2, Landroid/widget/CheckBox;

    invoke-static {p1, p2}, Ll/ܽ֨ᩳ;->֫(Ll/ܽ֨ᩳ;Landroid/widget/CheckBox;)V

    return-void

    :cond_0
    const/4 p2, -0x1

    const/4 v0, 0x1

    .line 571
    invoke-virtual {p1, p2, v1, v0}, Ll/᩹ܶᩳ;->֫(IZZ)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
