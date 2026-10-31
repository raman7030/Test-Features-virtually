.class public final synthetic Ll/۬᩸ۢ;
.super Ljava/lang/Object;
.source "N1TT"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۬᩸ۢ;->᩸:I

    iput-object p2, p0, Ll/۬᩸ۢ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 2
    iget v0, p0, Ll/۬᩸ۢ;->᩸:I

    const/4 v1, 0x0

    .line 5
    iget-object v2, p0, Ll/۬᩸ۢ;->᩹:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    .line 10
    check-cast v2, Ll/ۛ᩵᩷;

    .line 279
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p1, 0xe

    const v0, 0x7f1206bf

    .line 0
    invoke-static {v2, v0, v1, v1, p1}, Ll/ۛ᩵᩷;->֫(Ll/ۛ᩵᩷;ILjava/lang/String;[Ljava/lang/String;I)V

    return-void

    :pswitch_0
    check-cast v2, Ll/ܳۙܳ;

    invoke-static {v2, p1}, Ll/ܳۙܳ;->֫(Ll/ܳۙܳ;Landroid/view/View;)V

    return-void

    :pswitch_1
    check-cast v2, Ll/ۗܺܳ;

    sget p1, Ll/ۗܺܳ;->᩻ۧ:I

    .line 106
    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    return-void

    .line 0
    :pswitch_2
    check-cast v2, Ll/ۗܺ᩷;

    .line 260
    invoke-virtual {v2}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    const v0, 0x7f12042f

    .line 261
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->ۧ(I)V

    const v0, 0x7f120713

    .line 262
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->֫(I)V

    const v0, 0x7f120189

    .line 263
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f120715

    .line 264
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 265
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    invoke-virtual {p1}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Ll/ܽۡۡ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, v2}, Ll/ܽۡۡ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    .line 0
    :pswitch_3
    check-cast v2, Ll/۟᩸ۢ;

    invoke-static {v2}, Ll/۟᩸ۢ;->֫(Ll/۟᩸ۢ;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
