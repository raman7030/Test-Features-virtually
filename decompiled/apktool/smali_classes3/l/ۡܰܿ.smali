.class public final synthetic Ll/ۡܰܿ;
.super Ljava/lang/Object;
.source "C5GL"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۡܰܿ;->᩸:I

    iput-object p2, p0, Ll/ۡܰܿ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    iget p1, p0, Ll/ۡܰܿ;->᩸:I

    .line 4
    iget-object v0, p0, Ll/ۡܰܿ;->᩹:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    .line 9
    check-cast v0, Ll/ܽܰ᩷;

    .line 12
    invoke-static {v0}, Ll/ܽܰ᩷;->֫(Ll/ܽܰ᩷;)V

    return-void

    .line 15
    :pswitch_0
    check-cast v0, Ll/ۗܺ᩷;

    .line 50
    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    const v0, 0x7f120239

    .line 51
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->ۧ(I)V

    const v0, 0x7f12023a

    .line 52
    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->֫(I)V

    const v0, 0x7f120189

    const/4 v1, 0x0

    .line 53
    invoke-virtual {p1, v0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 54
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    .line 55
    invoke-static {p1}, Ll/ۡܶۡ;->֫(Ll/֡ۚۢ;)V

    return-void

    .line 0
    :pswitch_1
    check-cast v0, Ll/ۚܰܿ;

    sget p1, Ll/ۚܰܿ;->ۖܽ:I

    .line 409
    invoke-virtual {v0}, Ll/ۚܰܿ;->finish()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
