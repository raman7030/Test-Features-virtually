.class public final synthetic Ll/֨֡᩷;
.super Ljava/lang/Object;
.source "C5P7"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/֨֡᩷;->᩸:I

    iput-object p2, p0, Ll/֨֡᩷;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 2
    iget p1, p0, Ll/֨֡᩷;->᩸:I

    .line 4
    iget-object v0, p0, Ll/֨֡᩷;->᩹:Ljava/lang/Object;

    packed-switch p1, :pswitch_data_0

    .line 9
    check-cast v0, Ll/᩷᩹᩷;

    .line 12
    invoke-static {v0}, Ll/᩷᩹᩷;->֫(Ll/᩷᩹᩷;)V

    return-void

    .line 15
    :pswitch_0
    check-cast v0, Ll/ܺܶ᩷;

    .line 17
    sget p1, Ll/ܺܶ᩷;->ۚۧ:I

    .line 67
    invoke-virtual {v0}, Ll/᩻ܽ;->getOnBackPressedDispatcher()Ll/ۨܽ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۨܽ;->֫()V

    return-void

    .line 0
    :pswitch_1
    check-cast v0, Ll/᩵ۖ᩷;

    .line 262
    iget-object p1, v0, Ll/᩵ۖ᩷;->ܳ:Ll/᩹ۖ᩷;

    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    iget-object v1, p1, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    .line 263
    invoke-virtual {v1}, Ll/ۢᩴ;->getTitle()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    iget-object p1, p1, Ll/ۗܺ᩷;->ۛ֫:Ll/ۢᩴ;

    .line 264
    invoke-virtual {p1}, Ll/ۢᩴ;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    const p1, 0x7f120189

    const/4 v1, 0x0

    .line 265
    invoke-virtual {v0, p1, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 266
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 0
    :pswitch_2
    check-cast v0, Ll/ܶ֡᩷;

    sget p1, Ll/ܶ֡᩷;->ۜۧ:I

    .line 73
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
