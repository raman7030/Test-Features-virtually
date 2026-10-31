.class public final synthetic Ll/ᩳۘܳ;
.super Ljava/lang/Object;
.source "J26J"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩳۘܳ;->᩸:I

    iput-object p2, p0, Ll/ᩳۘܳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/ᩳۘܳ;->᩸:I

    .line 4
    iget-object v1, p0, Ll/ᩳۘܳ;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 9
    check-cast v1, Ll/ۗ᩺ۡ;

    .line 63
    invoke-virtual {v1}, Ll/ۗ᩺ۡ;->ۘ()Ll/ۗ᩺ۡ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/CharSequence;)V

    return-void

    .line 0
    :pswitch_0
    check-cast v1, Ll/ۗܺ᩷;

    .line 218
    invoke-virtual {v1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    const v0, 0x7f12042f

    .line 219
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->ۧ(I)V

    const v0, 0x7f120706

    .line 220
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->֫(I)V

    const v0, 0x7f120189

    const/4 v1, 0x0

    .line 221
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 222
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    .line 223
    invoke-static {p1}, Ll/ۡܶۡ;->֫(Ll/֡ۚۢ;)V

    return-void

    .line 0
    :pswitch_1
    check-cast v1, Ll/ۚۧᩳ;

    invoke-static {v1}, Ll/ۚۧᩳ;->֫(Ll/ۚۧᩳ;)V

    return-void

    :pswitch_2
    check-cast v1, Ll/᩹ۙܽ;

    sget p1, Ll/᩹ۙܽ;->᩵ۧ:I

    .line 101
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    return-void

    .line 0
    :pswitch_3
    check-cast v1, Ll/ۢۘܳ;

    invoke-static {v1, p1}, Ll/ۢۘܳ;->ܽ(Ll/ۢۘܳ;Landroid/view/View;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
