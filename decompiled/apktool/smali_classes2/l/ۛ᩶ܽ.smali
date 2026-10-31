.class public final synthetic Ll/ۛ᩶ܽ;
.super Ljava/lang/Object;
.source "B4HK"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۛ᩶ܽ;->᩸:I

    iput-object p2, p0, Ll/ۛ᩶ܽ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    iget v0, p0, Ll/ۛ᩶ܽ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/ۛ᩶ܽ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/ۗܺ᩷;

    .line 198
    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    const v0, 0x7f120704

    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->ۧ(I)V

    const v0, 0x7f120705

    .line 199
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->֫(I)V

    const v0, 0x7f120189

    const/4 v1, 0x0

    .line 200
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 201
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    .line 202
    invoke-static {p1}, Ll/ۡܶۡ;->֫(Ll/֡ۚۢ;)V

    return-void

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ۛ᩶ܽ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۢۘܳ;

    invoke-static {v0, p1}, Ll/ۢۘܳ;->ۧ(Ll/ۢۘܳ;Landroid/view/View;)V

    return-void

    :pswitch_1
    iget-object p1, p0, Ll/ۛ᩶ܽ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/ۚۧᩳ;

    invoke-static {p1}, Ll/ۚۧᩳ;->ۧ(Ll/ۚۧᩳ;)V

    return-void

    :pswitch_2
    iget-object p1, p0, Ll/ۛ᩶ܽ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/᩺᩶ܽ;

    invoke-static {p1}, Ll/᩺᩶ܽ;->֫(Ll/᩺᩶ܽ;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
